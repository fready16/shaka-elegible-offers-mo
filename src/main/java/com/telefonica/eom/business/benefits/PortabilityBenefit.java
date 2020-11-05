package com.telefonica.eom.business.benefits;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.telefonica.eom.business.BenefitsQueries;
import com.telefonica.eom.business.benefits.interfaces.IPortabilityBenefit;
import com.telefonica.eom.commons.Constant;
import com.telefonica.eom.commons.Util;
import com.telefonica.eom.entity.BillingOfferMaster;
import com.telefonica.eom.entity.PortabilityBenefits;
import com.telefonica.eom.entity.PropertyInBillingOffer;
import com.telefonica.eom.generated.model.BenefitType;
import com.telefonica.eom.generated.model.CharacteristicBenefitType;
import com.telefonica.eom.pojo.BusinessReference;
import com.telefonica.eom.pojo.MobileElegibleOffersRequest;
import com.telefonica.eom.repository.PortabilityBenefitsRepo;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: PortabilityBenefit.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Clase Service que contiene los metodos necesarios para obtener la lista de beneficios de Portabilidad.
*/
@Service
public class PortabilityBenefit implements IPortabilityBenefit {
    
    @Autowired
    BenefitsQueries benefitsQueries;
    
    @Autowired
    PortabilityBenefitsRepo portabilityBenefitsRepo;
    
    @Autowired
    IPortabilityBenefit portabilityBenefit;
    
    private List<PortabilityBenefits> ageInDonorAsterisk;
    private List<PortabilityBenefits> ageInDonorValue;

    /**
     * Metodo que retorna un objeto BenefitType de acuerdo a parametros enviados.
     * 
     * @param BusinessReference,String,String
     * @return BenefitType
     */
    public BenefitType getBenefits(BusinessReference benefitsRef, String billingOfferCode, String catalogItemId) {
	
	PortabilityBenefits pb = benefitsRef.getPlanBORefList().stream()
		.filter(refplan -> billingOfferCode.equals(refplan.getBillingOfferCode()))
		.filter(refplan -> catalogItemId.equals(refplan.getCatalogItemId()))
		.findAny().get()
		.getPortabilityBenefits();
	
	return this.getBenefit(pb, benefitsRef.getBillingOfferMasterList(), benefitsRef.getBenefitsPropertyInBillingOfferList());
    }
    
    /**
     * Metodo que retorna un objeto BenefitType de acuerdo a parametros enviados.
     * 
     * @param PortabilityBenefits, List<BillingOfferMaster>, List<PropertyInBillingOffer>
     * @return BenefitType
     */
    private BenefitType getBenefit(PortabilityBenefits pb, List<BillingOfferMaster> bomList, List<PropertyInBillingOffer> piboList) {
	
	BenefitType bt = new BenefitType();
	CharacteristicBenefitType chbt = new CharacteristicBenefitType();
	
	bt.setId(pb.getBoCode());
	bt.setName(benefitsQueries.getNameBO(pb.getBoCode(), bomList));
	chbt.setKey(Constant.DURATION);
	chbt.setValue(benefitsQueries.getDurationValue(pb.getBoCode(), piboList));
	bt.setCharacteristics(Arrays.asList(chbt));
	return bt;
    }
    
    /**
     * Metodo que retorna un objeto PortabilityBenefits de acuerdo a parametros enviados.
     * 
     * @param MobileElegibleOffersRequest, String, String
     * @return PortabilityBenefits
     */
    public PortabilityBenefits getPORTBenefits(MobileElegibleOffersRequest meor, String billingOfferCode, String catalogItemId) {
	
	String planGroup = benefitsQueries.getPlanGroup(billingOfferCode, catalogItemId);
	PortabilityBenefits pbenefit = new PortabilityBenefits();
	
	Optional<PortabilityBenefits> pbOptional =  portabilityBenefit.preFilteredList(meor).stream()
		.filter(pb -> planGroup.equals(pb.getPlanGroup()))
		.filter(pb -> billingOfferCode.equals(pb.getPlanBoCode()))
		.findFirst();
	
	if(pbOptional.isPresent()) {
	    pbenefit = pbOptional.get();
	}
	
	return pbenefit;
    }

    /**
     * Metodo que retorna una lista de PortabilityBenefits de acuerdo a parametros enviados.
     * 
     * @param MobileElegibleOffersRequest
     * @return List<PortabilityBenefits>
     */
    //@Cacheable(value = "PORTList", key = "#meor")
    @Cacheable(value = "portability_benefits", unless = "#result == null or #result.size() == 0")
    public List<PortabilityBenefits> preFilteredList(MobileElegibleOffersRequest meor) {
	
	ageInDonorAsterisk = new ArrayList<>();
	ageInDonorValue = new ArrayList<>();
	
	String customerSubType = benefitsQueries.getCustomerSubType(meor);
	Long portabilityCustomerSince = Util.getMonthsPeriod(meor.getPortability().getCustomerSince());
	
	portabilityBenefitsRepo.findByQueryParamFilters(meor.getCustomer().getCustomerSegment(), customerSubType,
		meor.getPortability().getCurrentPlanType(), meor.getPortability().getCurrentCompany(), meor.getChannelId(),
		meor.getSiteId(), meor.getDealerId(), meor.getRegion(), LocalDate.now()).stream()
		.forEach(pb -> this.ageInDonor(pb, portabilityCustomerSince));
	
	ageInDonorValue.stream().sorted(Comparator.comparing(PortabilityBenefits::getAgeInDonor).reversed()).collect(Collectors.toList())
		.addAll(ageInDonorAsterisk);
	
	return ageInDonorValue;
    }
    
    /**
     * Metodo utilitario.
     * 
     * @param PortabilityBenefits,Long
     * @return 
     */
    private void ageInDonor(PortabilityBenefits pb, Long portabilityCustomerSince) {
	
	if(Constant.ASTERISK.equals(pb.getAgeInDonor())) {
	    ageInDonorAsterisk.add(pb);
	}
	else {
	    if(Integer.valueOf(pb.getAgeInDonor()) <= portabilityCustomerSince) {
		ageInDonorValue.add(pb);
	    }
	}
    }

}
