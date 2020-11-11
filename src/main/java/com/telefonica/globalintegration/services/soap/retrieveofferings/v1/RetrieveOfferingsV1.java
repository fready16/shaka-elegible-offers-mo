package com.telefonica.globalintegration.services.soap.retrieveofferings.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * retrieveOfferings -
 *
 * This class was generated by Apache CXF 3.4.0
 * 2020-11-11T13:55:08.332-05:00
 * Generated source version: 3.4.0
 *
 */
@WebService(targetNamespace = "http://telefonica.com/globalIntegration/services/SOAP/retrieveOfferings/v1", name = "retrieveOfferings_v1")
@XmlSeeAlso({com.telefonica.globalintegration.services.retrieveofferings.v1.ObjectFactory.class, com.telefonica.globalintegration.header.ObjectFactory.class, com.telefonica.globalintegration.fault.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RetrieveOfferingsV1 {

    /**
     * 
     */
    @WebMethod(action = "http://telefonica.com/globalIntegration/services/soap1.1/retrieveOfferings")
    @WebResult(name = "retrieveOfferingsResponse", targetNamespace = "http://telefonica.com/globalIntegration/services/retrieveOfferings/v1", partName = "retrieveOfferingsBodyRes")
    public com.telefonica.globalintegration.services.retrieveofferings.v1.RetrieveOfferingsResponseType retrieveOfferings(

        @WebParam(partName = "retrieveOfferingsBodyReq", name = "retrieveOfferingsRequest", targetNamespace = "http://telefonica.com/globalIntegration/services/retrieveOfferings/v1")
        com.telefonica.globalintegration.services.retrieveofferings.v1.RetrieveOfferingsRequestType retrieveOfferingsBodyReq
    ) throws MessageFault;
}
