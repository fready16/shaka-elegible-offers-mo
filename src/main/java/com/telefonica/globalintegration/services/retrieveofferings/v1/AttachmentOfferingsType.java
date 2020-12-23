
package com.telefonica.globalintegration.services.retrieveofferings.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Structure of Attachment - retrieveOfferings
 * 
 * 				Functional struct: The business concepts contained are
 * 					- purpose: Field purpose of the attachment
 * 					- attachmentLocation: Field attachmentLocation
 * 					- attachmentType: Field attachmentType
 * 			
 * 
 * &lt;p&gt;Clase Java para AttachmentOfferingsType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AttachmentOfferingsType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="purpose" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}purposeAttachmentType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="attachmentLocation" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}attachmentLocationAttachmentType"/&amp;gt;
 *         &amp;lt;element name="attachmentType" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}attachmentTypeStringValueType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentOfferingsType", propOrder = {
    "purpose",
    "attachmentLocation",
    "attachmentType"
})
public class AttachmentOfferingsType {

    protected String purpose;
    @XmlElement(required = true)
    protected String attachmentLocation;
    @XmlElement(required = true)
    protected String attachmentType;

    /**
     * Obtiene el valor de la propiedad purpose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Define el valor de la propiedad purpose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentLocation() {
        return attachmentLocation;
    }

    /**
     * Define el valor de la propiedad attachmentLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentLocation(String value) {
        this.attachmentLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentType() {
        return attachmentType;
    }

    /**
     * Define el valor de la propiedad attachmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentType(String value) {
        this.attachmentType = value;
    }

}
