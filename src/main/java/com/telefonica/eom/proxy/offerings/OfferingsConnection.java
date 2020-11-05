package com.telefonica.eom.proxy.offerings;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import com.telefonica.globalintegration.header.HeaderInType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.RetrieveOfferingsRequestType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.RetrieveOfferingsResponseType;

/**
 * 
 * @Author: Freddy Ipanaque Castillo
 * @Datecreation: September. 2020
 * @FileName: OfferingsConnection.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Representa los metodos necesarios para conectarse al servicio
 *               soap de ofertas.
 * 
 */
@Service
public class OfferingsConnection {

	@Autowired
	@Qualifier("offeringsWS")
	private WebServiceTemplate webServiceTemplate;

	@SuppressWarnings("unchecked")

	/***
	 * Método que envia un request a un servicio soap.
	 * 
	 * @param url           : Url del servicio soap.
	 * @param request       : Request que será enviada al servicio soap.
	 * @param metodoRequest : Método utilizado para enviar el request.
	 * @return Response del servicio soap.
	 */
	public JAXBElement<RetrieveOfferingsResponseType> callWebService(RetrieveOfferingsRequestType request,
			HeaderInType headerInType) {

		com.telefonica.globalintegration.header.ObjectFactory headerof = new com.telefonica.globalintegration.header.ObjectFactory();
		com.telefonica.globalintegration.services.retrieveofferings.v1.ObjectFactory bodyof = new com.telefonica.globalintegration.services.retrieveofferings.v1.ObjectFactory();

		JAXBElement<HeaderInType> jAXBElementOfHeader = headerof.createHeaderIn(headerInType);
		JAXBElement<RetrieveOfferingsRequestType> jAXBElementOfRequest = bodyof.createRetrieveOfferingsRequest(request);
		
		return (JAXBElement<RetrieveOfferingsResponseType>) webServiceTemplate
				.marshalSendAndReceive(jAXBElementOfRequest, new SoapHeaders(jAXBElementOfHeader));

	}
}
