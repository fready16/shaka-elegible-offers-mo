package com.telefonica.eom.business.financing;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telefonica.eom.commons.Constant;
import com.telefonica.eom.entity.FinancingCode;
import com.telefonica.eom.entity.FinancingElegibility;
import com.telefonica.eom.pojo.MobileElegibleOffersRequest;
import com.telefonica.eom.repository.FinancingCodeRepo;
import com.telefonica.eom.repository.FinancingElegibilityRepo;

/**
 *
 * @Author: Freddy Ipanaque Castillo
 * @Datecreation: September 2020
 * @FileName: VerifyFinancing.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Clase Service que contiene los metodos necesarios para verificar el financiamiento.
 */
@Service
public class VerifyFinancing {

    @Autowired
    FinancingCodeRepo financingCodeRepo;

    @Autowired
    FinancingElegibilityRepo financingElegibilityRepo;

    @Autowired
    FinancingFilters financingFilters;

    List<FinancingCode> fcFinalList;

    /**
     * Metodo que retorna si aplica financiamiento.
     * 
     * @param MobileElegibleOffersRequest
     * @return String
     */
    public String validate(MobileElegibleOffersRequest meor) {

	if (!this.financingPlan(meor)) {
	    return Constant.YES;
	} else {
	    return Constant.NO;
	}
    }

    /**
     * Metodo que verifica si aplica financiamiento.
     * 
     * @param MobileElegibleOffersRequest
     * @return boolean
     */
    private boolean financingPlan(MobileElegibleOffersRequest meor) {

	List<String> fpcList = this.planValidation(meor);
	String creditScore = Character.toString(Integer.toString(meor.getCreditScore()).charAt(3));
	String action = this.getAction(meor.getAction(), meor.getIsPortability());

	List<FinancingElegibility> feList = financingElegibilityRepo.findAll().stream()
		.filter(fe -> financingFilters.financingPlan(fe, fpcList)).filter(fe -> financingFilters.riskLevel(fe, creditScore))
		.filter(fe -> financingFilters.customerType(fe, meor.getCustomer().getCustomerSegment()))
		.filter(fe -> financingFilters.customerSubType(fe, meor.getCustomer().getCustomerSubsegment()))
		.filter(fe -> financingFilters.flowName(fe, action)).collect(Collectors.toList());

	if (feList.isEmpty()) {
	    return true;
	} else {
	    return feList.stream().map(FinancingElegibility::getFinancingPlan).filter(Objects::nonNull).collect(Collectors.toList())
		    .isEmpty();
	}

    }

    /**
     * Metodo que retorna Action de acuerdo a parametros.
     * 
     * @param String,boolean
     * @return String
     */
    private String getAction(String action, boolean isPortability) {

	if (Constant.PROVIDE.equals(action) && isPortability) {
	    return Constant.PORTABILITY;
	} else if (Constant.PROVIDE.equals(action) && !isPortability) {
	    return Constant.ALTA;
	} else if (!Constant.PROVIDE.equals(action)) {
	    return Constant.DEVICE_CHANGE;
	} else {
	    return Constant.VOID_STRING;
	}
    }

    /**
     * Metodo que retorna una lista de codigos de planes.
     * 
     * @param MobileElegibleOffersRequest
     * @return List<String> 
     */
    private List<String> planValidation(MobileElegibleOffersRequest meor) {

	List<FinancingCode> fcList = financingCodeRepo.findAll().stream()
		.filter(fc -> financingFilters.subType(fc, meor.getCustomer().getCustomerSegment()))
		.filter(financingFilters::financingElegibilityInd).collect(Collectors.toList());

	Predicate<FinancingCode> corporatePredicate;

	if (Constant.RESIDENTIAL.equals(meor.getCustomer().getCustomerSegment())) {
	    corporatePredicate = financingFilters::isNotCorporate;
	} else {
	    corporatePredicate = financingFilters::isCorporate;
	}

	return fcList.stream().filter(corporatePredicate).filter(financingFilters::hasFWA).map(FinancingCode::getFinancialPlanCode)
		.collect(Collectors.toList());
    }

}
