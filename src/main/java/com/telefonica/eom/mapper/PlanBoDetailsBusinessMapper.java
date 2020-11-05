package com.telefonica.eom.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telefonica.eom.business.benefits.interfaces.IPortabilityBenefit;
import com.telefonica.eom.business.benefits.interfaces.IProvideBenefit;
import com.telefonica.eom.business.benefits.interfaces.IReplaceBenefit;
import com.telefonica.eom.commons.Constant;
import com.telefonica.eom.entity.PortabilityBenefits;
import com.telefonica.eom.entity.ProvideBenefits;
import com.telefonica.eom.entity.ReplaceOfferBenefits;
import com.telefonica.eom.pojo.BusinessReference;
import com.telefonica.eom.pojo.MobileElegibleOffersRequest;
import com.telefonica.eom.pojo.PlanBOReference;
import com.telefonica.eom.repository.BillingOfferMasterRepo;
import com.telefonica.eom.repository.PropertyInBillingOfferRepo;
import com.telefonica.eom.repository.TbearlyCaeqParamRepo;
import com.telefonica.globalintegration.services.retrieveofferings.v1.CategoryListType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.OfferingTypeOfferType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.PlanBODetailsType;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: PlanBoDetailsBusinessMapper.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Clase Service para generar objeto del PlanBoDetailsBusiness. 
* 
*/
@Service
public class PlanBoDetailsBusinessMapper {
    
    @Autowired
    IReplaceBenefit replaceBenefit;
    
    @Autowired
    IProvideBenefit provideBenefit;
    
    @Autowired
    IPortabilityBenefit portabilityBenefit;
    
    @Autowired
    BillingOfferMasterRepo billingOfferMasterRepo;
    
    @Autowired
    PropertyInBillingOfferRepo propertyInBillingOfferRepo;
    
    @Autowired
    TbearlyCaeqParamRepo tbearlyCaeqParamRepo;
    
    private List<PlanBOReference> planBORefList;
    private List<String> boCodeList;
    private List<String> productOfferingPriceIdList;
    
    MobileElegibleOffersRequest meor;

    private String catalogItemCode;
    private String catalogItemId;
    
    private boolean penaltycond;
    
    /**
    * Metodo que retorna un objeto BusinessReference. 
    * @param MobileElegibleOffersRequest, List<CategoryListType>
    * @return BusinessReference
    */
    public BusinessReference fromOfferingsAMDOCStoReference(MobileElegibleOffersRequest meor, List<CategoryListType> categories) {
	
	this.planBORefList = new ArrayList<>();
	this.boCodeList = new ArrayList<>();
	this.productOfferingPriceIdList = new ArrayList<>();
	
	BusinessReference br = new BusinessReference();
	
	this.meor = meor;

	categories.forEach(this::categoryLevel);
	
	br.setPlanBORefList(planBORefList);
	br.setBillingOfferMasterList(billingOfferMasterRepo.findByCaptionBOIn(boCodeList));
	br.setBenefitsPropertyInBillingOfferList(propertyInBillingOfferRepo.findByCaptionBoIn(boCodeList));
	this.ifgetPenaltyPIBOList(br);
	
	return br;
    }

    /**
    * Metodo auxiliar 
    * @param CategoryListType
    * @return 
    */
    private void categoryLevel(CategoryListType category) {
	category.getOfferings().stream().forEach(this::offeringsLevel);
    }

    /**
    * Metodo auxiliar 
    * @param OfferingTypeOfferType
    * @return 
    */    
    private void offeringsLevel(OfferingTypeOfferType offerType) {

	this.catalogItemCode = offerType.getCatalogItemCode();
	this.catalogItemId = offerType.getCatalogItemId();
	
	penaltycond = this.ifAddPriceId(offerType.getPlanType());
	
	offerType.getPlanBoList().forEach(this::plaBOLevel);
    }
  
    /**
    * Metodo auxiliar 
    * @param PlanBODetailsType
    * @return 
    */    
    private void plaBOLevel(PlanBODetailsType pBOdt) {
	
	PlanBOReference pBOr = new PlanBOReference();
	
	pBOr.setCatalogItemCode(catalogItemCode);
	pBOr.setCatalogItemId(catalogItemId);
	pBOr.setBillingOfferCode(pBOdt.getBillingOfferCode());
	
	if (penaltycond) {
	    productOfferingPriceIdList.add(pBOdt.getBillingOfferId());
	}
	
	if(Constant.CHANGE.equals(meor.getAction())) {
	    
	    List<ReplaceOfferBenefits> list = replaceBenefit.getROBenefits(meor, pBOdt.getBillingOfferCode(), catalogItemCode);
	    pBOr.setReplaceOfferBenefitsList(list);
	    
	    boCodeList.addAll(list.stream().map(ReplaceOfferBenefits::getBoCode).collect(Collectors.toList()));
	}
	else {
	    List<ProvideBenefits> list =  provideBenefit.getALTABenefits(meor, pBOdt.getBillingOfferCode(), catalogItemCode, catalogItemId);
	    pBOr.setProvideBenefitsList(list);
	    
	    if(list != null) {
		boCodeList.addAll(list.stream().map(ProvideBenefits::getBoCode).collect(Collectors.toList()));
	    }
	    if(Boolean.TRUE.equals(meor.getIsPortability())) {
		
		PortabilityBenefits pb = portabilityBenefit.getPORTBenefits(meor, pBOdt.getBillingOfferCode(), catalogItemId);
		pBOr.setPortabilityBenefits(pb);
		
		boCodeList.add(pb.getBoCode());
	    }
	}
	
	planBORefList.add(pBOr);
    }
 
    /**
    * Metodo auxiliar 
    * @param BusinessReference
    * @return 
    */    
    private void ifgetPenaltyPIBOList(BusinessReference br) {
	if(!productOfferingPriceIdList.isEmpty()) {
	   br.setPenaltyPropertyInBillingOfferList(propertyInBillingOfferRepo.findByCidBoInAndPropertyName(productOfferingPriceIdList, Constant.PLAN_RANK));
	   br.setTbearlyCaeqParamList(tbearlyCaeqParamRepo.findAll());
	}
    }

    /**
    * Metodo auxiliar retorna true|false de acuerdo a validaciones.
    * @param String
    * @return boolean
    */    
    private boolean ifAddPriceId(String billingMethod) {
	boolean cond = false;
	
	if(!Constant.PROVIDE.equals(meor.getAction()) && !Constant.PREPAID.equals(billingMethod)) {
	    cond = true;
	}
	return cond;
    }

}
