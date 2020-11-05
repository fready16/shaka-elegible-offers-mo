package com.telefonica.eom.proxy.offerings;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import com.telefonica.globalintegration.header.HeaderInType;

public class SoapHeaders implements WebServiceMessageCallback {
	
	private JAXBElement<HeaderInType> headerInType;
	
	public SoapHeaders(JAXBElement<HeaderInType> headerInType) {
		this.headerInType = headerInType;
	}

	@Override
	public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
        SoapHeader soapHeader = ((SoapMessage)message).getSoapHeader();

        try {
            JAXBContext context = JAXBContext.newInstance(HeaderInType.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(headerInType, soapHeader.getResult());

        } catch (JAXBException e) {
            throw new IOException("error while marshalling authentication.");
        }
        
	}

}
