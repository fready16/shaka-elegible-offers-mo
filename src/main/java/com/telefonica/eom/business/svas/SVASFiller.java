package com.telefonica.eom.business.svas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telefonica.eom.commons.Constant;
import com.telefonica.eom.commons.Util;
import com.telefonica.eom.entity.BillingOfferMaster;
import com.telefonica.eom.entity.MasterOfBoInfo;
import com.telefonica.eom.entity.OffersProperties;
import com.telefonica.eom.entity.RelationsMaster;
import com.telefonica.eom.entity.ServiceActvtnBenefits;
import com.telefonica.eom.generated.model.BenefitType;
import com.telefonica.eom.generated.model.ComponentProdOfferPriceType;
import com.telefonica.eom.generated.model.ComponentProdOfferPriceType.PriceTypeEnum;
import com.telefonica.eom.generated.model.ComposingProductType;
import com.telefonica.eom.generated.model.KeyValueType;
import com.telefonica.eom.generated.model.ComposingProductType.ProductTypeEnum;
import com.telefonica.eom.generated.model.MoneyType;
import com.telefonica.eom.generated.model.OfferingType;
import com.telefonica.eom.pojo.MobileElegibleOffersRequest;
import com.telefonica.eom.pojo.RelationsAdditionalServices;
import com.telefonica.eom.repository.BillingOfferMasterRepo;
import com.telefonica.eom.repository.MasterOfBoInfoRepo;
import com.telefonica.eom.repository.RelationsMasterRepo;

/**
 *
 * @Author: Freddy Ipanaque Castillo
 * @Datecreation: September 2020
 * @FileName: SVASFiller.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Clase Service que contiene los metodos necesarios para poblas
 *               el response de SVAS.
 */
@Service
public class SVASFiller {

    @Autowired
    AdditionalServices additionalServices;

    @Autowired
    MasterOfBoInfoRepo masterOfBoInfoRepo;

    @Autowired
    RelationsMasterRepo relationsMasterRepo;

    @Autowired
    BillingOfferMasterRepo billingOfferMasterRepo;

    private List<MasterOfBoInfo>	masterOfBoInfoList;
    private List<OffersProperties>	offersValues;
    private List<ServiceActvtnBenefits>	benefitsList;
    private List<BenefitType>		benefitsTypeList;
    private List<BillingOfferMaster>	bomList;

    private List<RelationsMaster> listRelMaster;
    private List<RelationsMaster> listRelMasterJoinRelRoot;

    /**
     * Metodo que retorna una lista de OfferingType.
     * 
     * @param MobileElegibleOffersRequest
     * @return List<OfferingType>
     */
    public List<OfferingType> getResponse(MobileElegibleOffersRequest meor) {

	benefitsTypeList = new ArrayList<>();

	offersValues = additionalServices.getPropertyValues(meor.getProductOfferingCatalogId());
	List<RelationsAdditionalServices> rasList = additionalServices.getSVAS(meor, offersValues);

	benefitsList = additionalServices.getBenefits(
		rasList.stream().map(RelationsAdditionalServices::getCaptionBo).collect(Collectors.toList()), meor, offersValues);

	bomList = billingOfferMasterRepo
		.findByCaptionBOIn(benefitsList.stream().map(ServiceActvtnBenefits::getBoCode).collect(Collectors.toList()));

	masterOfBoInfoList = masterOfBoInfoRepo
		.findByCidBoIn(rasList.stream().map(RelationsAdditionalServices::getCidBo).collect(Collectors.toList()));


	List<String> listChildId = rasList.stream().map(RelationsAdditionalServices::getIdComponente).distinct()
		.collect(Collectors.toList());
	listRelMaster = relationsMasterRepo.findByRootCidAndChildIdIn(meor.getProductOfferingCatalogId(), listChildId);
	listRelMasterJoinRelRoot = relationsMasterRepo.relRootCidByChilIdAndRootCid(listChildId, meor.getProductOfferingCatalogId());

	return rasList.stream().map(this::offeringLevel).collect(Collectors.toList());
    }

    /**
     * Metodo que retorna un objeto de OfferingType.
     * 
     * @param RelationsAdditionalServices
     * @return OfferingType
     */
    private OfferingType offeringLevel(RelationsAdditionalServices ras) {
	OfferingType offering = new OfferingType();

	benefitsTypeList = benefitsList.stream().filter(sab -> ras.getCaptionBo().equals(sab.getBoServiceActivated()))
		.filter(sab -> ras.getParentId().equals(sab.getServiceActivated())).map(this::getBenefit).collect(Collectors.toList());

	offering.setId(ras.getCidBo());
	offering.setName(ras.getNameBo());
	offering.setProductSpecification(this.getProductSpecification(ras));
	offering.setAdditionalData(this.getAdditionalData(ras.getCidBo()));
	return offering;
    }

    /**
     * Metodo que retorna un lista de KeyValueType
     * 
     * @param String
     * @return List<KeyValueType>
     */
    private List<KeyValueType> getAdditionalData(String cidBo) {
	return masterOfBoInfoList.stream().filter(mob -> cidBo.equals(mob.getCidBo())).map(this::getKVT).collect(Collectors.toList());
    }

    /**
     * Metodo utilitario.
     * 
     * @param MasterOfBoInfo
     * @return KeyValueType
     */
    private KeyValueType getKVT(MasterOfBoInfo moboi) {
	KeyValueType kvt = new KeyValueType();
	kvt.setKey(moboi.getBoInfoName());
	kvt.setValue(moboi.getBoInfoValue());
	return kvt;
    }

    /**
     * Metodo que retorna un lista de ComposingProductType
     * 
     * @param RelationsAdditionalServices
     * @return List<ComposingProductType> 
     */
    private List<ComposingProductType> getProductSpecification(RelationsAdditionalServices ras) {
	ComposingProductType cpt = new ComposingProductType();

	cpt.setId(ras.getParentId());
	cpt.setName(ras.getNameParent());
	cpt.setProductType(ProductTypeEnum.SVA);
	cpt.setMinCardinality(Integer.valueOf(ras.getMinumumQuantity()));
	cpt.setMaxCardinality(Integer.valueOf(ras.getMaximumQuantity()));
	cpt.setDefaultCardinality(Integer.valueOf(ras.getDefaultQuantity()));
	cpt.setProductPrice(this.getProductPrice(ras));

	return Arrays.asList(cpt);
    }

    /**
     * Metodo que retorna un lista de ComponentProdOfferPriceType
     * 
     * @param RelationsAdditionalServices
     * @return List<ComponentProdOfferPriceType>
     */
    private List<ComponentProdOfferPriceType> getProductPrice(RelationsAdditionalServices ras) {
	ComponentProdOfferPriceType cpopt = new ComponentProdOfferPriceType();

	cpopt.setName(Constant.SVA_PRICE);
	cpopt.setPrice(this.getPrice(ras.getValueAbp()));
	cpopt.setPriceWithTax(this.getPriceWithTax(ras.getValueAbp()));

	if (Constant.OC.equals(ras.getRevenueType())) {
	    cpopt.setPriceType(PriceTypeEnum.ONE_TIME);
	} else {
	    cpopt.setPriceType(PriceTypeEnum.RECURRING);
	}

	cpopt.setBenefits(benefitsTypeList);

	String relationID = listRelMaster.stream().filter(r -> r.getChildId().equals(ras.getIdComponente()))
		.map(RelationsMaster::getRelationId).findAny().orElse(null);

	if (relationID == null || relationID.isEmpty()) {
	    relationID = listRelMasterJoinRelRoot.stream().filter(r -> r.getChildId().equals(ras.getIdComponente()))
		    .map(RelationsMaster::getRelationId).findAny().orElse(null);
	}

	cpopt.setProductSpecContainmentID(relationID);
	cpopt.setPricePlanSpecContainmentID(ras.getRelationId());

	return Arrays.asList(cpopt);
    }

    /**
     * Metodo que retorna un objeto MoneyType
     * 
     * @param String
     * @return MoneyType
     */
    private MoneyType getPrice(String valueABP) {
	MoneyType mt = new MoneyType();
	mt.setAmount(new BigDecimal(valueABP));
	mt.setUnits(Constant.PERUVIAN_COIN);
	return mt;
    }

    /**
     * Metodo que retorna un objeto MoneyType con el calculo de IGV
     * 
     * @param String
     * @return MoneyType
     */
    private MoneyType getPriceWithTax(String valueABP) {
	MoneyType mt = new MoneyType();
	mt.setAmount(Util.igvCalculator(new BigDecimal(valueABP)));
	mt.setUnits(Constant.PERUVIAN_COIN);
	return mt;
    }

    /**
     * Metodo que retorna un objeto BenefitType.
     * 
     * @param ServiceActvtnBenefits
     * @return BenefitType
     */
    private BenefitType getBenefit(ServiceActvtnBenefits sab) {

	String name = null;

	Optional<BillingOfferMaster> optional = bomList.stream().filter(bom -> sab.getBoCode().equals(bom.getCaptionBO())).findAny();

	if (optional.isPresent()) {
	    name = optional.get().getNameBO();
	}

	BenefitType bt = new BenefitType();
	bt.setId(sab.getBoCode());
	bt.setName(name);

	return bt;
    }

}
