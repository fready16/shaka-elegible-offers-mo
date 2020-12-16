package com.telefonica.eom.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telefonica.eom.business.benefits.Benefits;
import com.telefonica.eom.business.financing.VerifyFinancing;
import com.telefonica.eom.business.penalty.VerifyPenalty;
import com.telefonica.eom.business.ppf.VerifyPPF;
import com.telefonica.eom.commons.Constant;
import com.telefonica.eom.commons.Util;
import com.telefonica.eom.generated.model.CategoryTreeType;
import com.telefonica.eom.generated.model.ComponentProdOfferPriceType;
import com.telefonica.eom.generated.model.ComponentProdOfferPriceType.PriceTypeEnum;
import com.telefonica.eom.generated.model.KeyValueType;
import com.telefonica.eom.generated.model.OfferingType;
import com.telefonica.eom.generated.model.OfferingType.BillingMethodEnum;
import com.telefonica.eom.generated.model.OfferingType.LifeCycleStatusEnum;
import com.telefonica.eom.generated.model.OfferingType.TypeEnum;
import com.telefonica.eom.generated.model.ProductInstanceRefType;
import com.telefonica.eom.mapper.PlanBoDetailsBusinessMapper;
import com.telefonica.eom.pojo.BusinessReference;
import com.telefonica.eom.pojo.MobileElegibleOffersRequest;
import com.telefonica.eom.proxy.penalty.Penalty;
import com.telefonica.eom.proxy.product.ParqueUnificadoConnection;
import com.telefonica.globalintegration.services.retrieveofferings.v1.CategoryListType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.OfferingTypeOfferType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.PlanBODetailsType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.PriceDetailsType;

import pe.telefonica.customerordermanagement.orderservices.v1.types.DevicePenaltyInfo;

/**
 *
 * @Author: Freddy Ipanaque Castillo
 * @Datecreation: September 2020
 * @FileName: ResponseFiller.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Clase Service que obtendra genera el response del servicio
 */
@Service
public class ResponseFiller {

    @Autowired
    VerifyPPF verifyPPF;

    @Autowired
    VerifyFinancing verifyFinancing;

    @Autowired
    ResponseSubFieldsFiller rsff;

    @Autowired
    ParqueUnificadoConnection puConnection;

    @Autowired
    Benefits benefits;

    @Autowired
    PlanBoDetailsBusinessMapper planBoDetailsBusinessMapper;

    @Autowired
    Penalty penalty;

    @Autowired
    VerifyPenalty verifyPenalty;

    private List<OfferingType>		 offerings;
    private List<ProductInstanceRefType> compatibleProducts;

    private MobileElegibleOffersRequest	meor;
    private CategoryTreeType		ctt;
    private BusinessReference		businessRef;
    private DevicePenaltyInfo		devicePenaltyInfo;

    private String currentPlanRelationID;
    private String billingMethod;
    private String applyFinancing;
    private String catalogItemCode;
    private String catalogItemId;

    /**
     * Metodo que retorna una lista de OfferingType
     * 
     * @param List<CategoryListType>
     *            ,MobileElegibleOffersRequest
     * @return List<OfferingType>
     */
    public List<OfferingType> getResponse(List<CategoryListType> categories, MobileElegibleOffersRequest meor) {

	this.meor = meor;
	this.offerings = new ArrayList<>();
	this.applyFinancing = verifyFinancing.validate(meor);

	if (meor.getProductObj().getPublicId() != null && meor.getProductObj().getType() != null) {
	    compatibleProducts = rsff.getCompatibleProducts(puConnection.callRestService(meor.getProductObj()));
	}

	// TODO aqui esta lanzando una excepcion de no serializable. Revisar.  
	businessRef = planBoDetailsBusinessMapper.fromOfferingsAMDOCStoReference(meor, categories);

	categories.forEach(c -> {
	    categoryLevel(c, meor.getProduct());
	});

	return offerings;
    }

    /**
     * Metodo utilitario
     * 
     * @param CategoryListType
     * @return
     */
    private void categoryLevel(CategoryListType category, String product) {

	CategoryTreeType ctt = rsff.getCategory(category.getCategory());
	if (category.getCategory().getSubcategories() != null) {
	    ctt.setSubcategories(rsff.getCategory(category.getCategory().getSubcategories()));
	}
	this.ctt = ctt;
	this.currentPlanRelationID = category.getCurrentPlanRelationId();

	offerings = category.getOfferings().stream().map(o -> offeringsLevel(o, product)).collect(Collectors.toList());

    }

    /**
     * Metodo que retorna un objeto OfferingType
     * 
     * @param OfferingTypeOfferType
     * @return OfferingType
     */
    private OfferingType offeringsLevel(OfferingTypeOfferType offerType, String product) {

	OfferingType offering = new OfferingType();

	this.billingMethod = offerType.getPlanType();
	this.catalogItemCode = offerType.getCatalogItemCode();
	this.catalogItemId = offerType.getCatalogItemId();

	devicePenaltyInfo = this.ifCallPenalty();

	offering.setId(offerType.getCatalogItemId());
	offering.setHref(Constant.HREF.concat(offerType.getCatalogItemId()));
	offering.setName(offerType.getName());
	offering.setCode(offerType.getCatalogItemCode());
	offering.setCatalogItemType(offerType.getCatalogItemType());
	offering.setCorrelationId(offerType.getCorrelationId());
	offering.setDescription(offerType.getDescription());
	offering.setCurrentPlanRelationID(currentPlanRelationID);
	offering.setCategory(Arrays.asList(ctt));
	offering.setBillingMethod(BillingMethodEnum.fromValue(offerType.getPlanType()));
	offering.setType(TypeEnum.fromValue(meor.getType()));
	offering.setCustomerId(meor.getCustomerId());
	offering.setCompatibleProducts(compatibleProducts);
	offering.setIsBundle(offerType.isIsBundle());
	offering.setLifeCycleStatus(LifeCycleStatusEnum.fromValue(offerType.getLifeCycleStatus()));
	offering.setAdditionalData(rsff.getAdditionalData(offerType, applyFinancing));
	offering.setProductOfferingPrice(this.getProductOfferingPriceList(offerType.getPlanBoList(), product));
	offering.setProductOfferingProductSpecID(this.getProductOfferingProductSpecID(offerType));

	return offering;
    }

    /**
     * Metodo que retorna una lista de PlanBODetailsType
     * 
     * @param List<PlanBODetailsType>
     * @return List<ComponentProdOfferPriceType>
     */
    private List<ComponentProdOfferPriceType> getProductOfferingPriceList(List<PlanBODetailsType> planBoList, String product) {
	return planBoList.stream().map(p -> getProductOfferingPrice(p, product)).collect(Collectors.toList());
    }

    /**
     * Metodo que retorna un objeto ComponentProdOfferPriceType
     * 
     * @param PlanBODetailsType
     * @return ComponentProdOfferPriceType
     */
    private ComponentProdOfferPriceType getProductOfferingPrice(PlanBODetailsType pBOdt, String product) {

        PriceDetailsType pdt1 = getPriceDetails(pBOdt);

        ComponentProdOfferPriceType cpopt = new ComponentProdOfferPriceType();
        cpopt.setId(pBOdt.getBillingOfferId());
        cpopt.setCode(pBOdt.getBillingOfferCode());
        cpopt.setName(pBOdt.getBillingOfferName());
        cpopt.setDescription(Constant.OFFER_PRICE_DESCRIPTION);

        if (!Constant.PREPAID.equalsIgnoreCase(product) && pdt1 != null) {
            cpopt.setPriceType(Util.enumEquivalence(pdt1.getPriceType()));
            cpopt.setPrice(rsff.getPrice(pdt1.getOriginalAmount(), pdt1.getPrice()));
            cpopt.setPriceWithTax(rsff.getPriceWithTax(pdt1.getOriginalAmount()));
            cpopt.setOriginalAmount(rsff.getOriginalAmount(pdt1.getOriginalAmount()));
            cpopt.setOriginalTaxAmount(rsff.getPriceWithTax(pdt1.getOriginalAmount()));
        }

        cpopt.setProductSpecContainmentID(pBOdt.getProductSpecContainmentID());
        cpopt.setPricePlanSpecContainmentID(pBOdt.getPricePlanSpecContainmentID());

        cpopt.setPricedComponents(this.getPricedComponents(pBOdt.getBillingOfferId()));
        cpopt.setBenefits(benefits.benefistsList(meor, businessRef, catalogItemCode, catalogItemId,
            pBOdt.getBillingOfferCode()));
        cpopt.setAdditionalData(rsff.getAditionalDataPOP(pBOdt.getPlanInfo()));

        return cpopt;
    }

    /**
     * Metodo que retorna una lista de KeyValueType
     * 
     * @param String
     * @return List<KeyValueType>
     */
    private List<KeyValueType> getPricedComponents(String poPriceId) {
	KeyValueType kvtPPF = new KeyValueType();
	kvtPPF.setKey(Constant.EASY_POST_PAYMENT);
	kvtPPF.setValue(verifyPPF.validate(meor, poPriceId, billingMethod));
	KeyValueType kvtPenalty = new KeyValueType();
	kvtPenalty.setKey(Constant.EXEMPT_PENALTY);
	kvtPenalty.setValue(verifyPenalty.validate(meor, billingMethod, devicePenaltyInfo, businessRef, poPriceId));// LOGICA DE EXONERAR
														    // PENALIDADES
	return Arrays.asList(kvtPPF, kvtPenalty);
    }

    /**
     * Metodo que retorna la respuesta del servicio de AMDOCS si cumple con los
     * parametros.
     * 
     * @param
     * @return DevicePenaltyInfo
     */
    private DevicePenaltyInfo ifCallPenalty() {

	DevicePenaltyInfo dpi = new DevicePenaltyInfo();

	if (!Constant.PROVIDE.equals(meor.getAction()) && !Constant.PREPAID.equals(billingMethod)) {
	    try {
		return penalty.consult(meor.getProductObj().getPublicId()).getRetrieveCommitmentPenaltyResponseData()
			.getDevicePenaltyInfo();
	    } catch (DatatypeConfigurationException e) {
		e.printStackTrace();
	    }
	}

	return dpi;
    }

    /**
     * Obtiene el productOfferingProductSpecID de children
     * 
     * @param offerType
     * @return
     */
    private String getProductOfferingProductSpecID(OfferingTypeOfferType offerType) {
	if (!offerType.getChildren().isEmpty()) {
	    return offerType.getChildren().get(0).getProductOfferingProductSpecID();
	}
	return null;
    }

    /**
     * Obtiene solo los priceDetails Recurrentes
     * 
     * @param pBOdt
     * @return
     */
    private PriceDetailsType getPriceDetails(PlanBODetailsType pBOdt) {
	return pBOdt.getPriceDetails().stream()
		.filter(pdt -> Util.enumEquivalence(pdt.getPriceType()).toString().equals(PriceTypeEnum.RECURRING.toString())).findAny()
		.orElse(null);
    }

}
