package com.telefonica.eom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telefonica.eom.business.benefits.interfaces.IReplaceBenefit;
import com.telefonica.eom.business.svas.AdditionalServices;
import com.telefonica.eom.business.svas.SVASFiller;
import com.telefonica.eom.generated.model.OfferingType;
import com.telefonica.eom.generated.model.PaginationInfoType;
import com.telefonica.eom.generated.model.ResponseType;
import com.telefonica.eom.pojo.MobileElegibleOffersRequest;
import com.telefonica.eom.proxy.offerings.Offerings;
import com.telefonica.eom.proxy.penalty.Penalty;
import com.telefonica.eom.repository.BillingOfferMasterRepo;
import com.telefonica.eom.repository.OffersPropertiesRepo;
import com.telefonica.eom.repository.PropertyInBillingOfferRepo;
import com.telefonica.eom.repository.ReplaceOfferBenefitsRepo;
import com.telefonica.eom.repository.SvaofferingRepo;

/**
 *
 * @Author: Freddy Ipanaque Castillo
 * @Datecreation: September 2020
 * @FileName: MobileElegibleOffersService.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Clase Service que obtendra el response de acuerdo a Mobile o
 *               SVA.
 */
@Service
public class MobileElegibleOffersService {

	@Autowired
	Offerings offerings;

	@Autowired
	Penalty penalties;

	@Autowired
	ReplaceOfferBenefitsRepo replaceOfferBenefitsRepo;

	@Autowired
	IReplaceBenefit benefits;

	@Autowired
	BillingOfferMasterRepo billingOfferMasterRepo;

	@Autowired
	PropertyInBillingOfferRepo propertyInBillingOfferRepo;

	@Autowired
	AdditionalServices additionalServices;

	@Autowired
	SvaofferingRepo svaofferingRepo;

	@Autowired
	OffersPropertiesRepo offersPropertiesRepo;

	@Autowired
	SVASFiller sVASFiller;

	@Autowired
	ResponseFiller responseFiller;

	/**
	 * Metodo que retorna response de acuerdo a Tipo SVA o Movil
	 * 
	 * @param MobileElegibleOffersRequest
	 * @return ResponseType
	 */
	public ResponseType getOffers(MobileElegibleOffersRequest meor) {

		ResponseType responseType = new ResponseType();
		List<OfferingType> listOfferType = new ArrayList<>();

		if (meor.getProductObj().getType().contains("sva") && meor.getProductObj().getType().contains("mobile")) {
			List<OfferingType> listOfferTypeSVA = sVASFiller.getResponse(meor);
			listOfferType.addAll(listOfferTypeSVA);
		} else if (meor.getProductObj().getType().contains("mobile")) {
			List<OfferingType> listOfferTypeAMDOCS = responseFiller.getResponse(offerings.consult(meor).getCategories(),
					meor);
			listOfferType.addAll(listOfferTypeAMDOCS);
		}

		responseType.offerings(listOfferType);
		PaginationInfoType pit = new PaginationInfoType();
		responseType.setPaginationInfo(pit);
		return responseType;
	}

}
