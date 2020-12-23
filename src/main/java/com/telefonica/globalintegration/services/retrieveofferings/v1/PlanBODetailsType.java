
package com.telefonica.globalintegration.services.retrieveofferings.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Structure of PlanBODetails
 * 
 * 				Functional struct: The business concepts contained are
 *                                         - billingOfferId: ID of the BO
 * 					- billingOfferCode: The code of the billing offer
 * 					- billingOfferName: Name of the Price Plan for the Offer (similar concept that SID attribute defined by 'p1:catalogNameCatalogSpecificationType')
 * 					- priceDetails: Synonym of PriceDetails (similar concept that SID attribute defined by 'p1:PriceDetailsType')
 * 					- priceList: Synonym of Pricing (similar concept that SID attribute defined by 'p1:PricingType')
 * 					- planInfo: Synonym of KeyValueType (similar concept that SID attribute defined by 'p1:UNIKeyValueType')
 * 			
 * 
 * &lt;p&gt;Clase Java para PlanBODetailsType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PlanBODetailsType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="billingOfferId" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}billingOfferIdProductOfferingType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="billingOfferCode" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}billingOfferCodeProductOfferingType"/&amp;gt;
 *         &amp;lt;element name="billingOfferName" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}catalogNameCatalogSpecificationType"/&amp;gt;
 *         &amp;lt;element name="priceDetails" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}PriceDetailsType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="priceList" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}PricingType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="planInfo" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}UNIKeyValueType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="productSpecContainmentID" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}productSpecContainmentIDType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="pricePlanSpecContainmentID" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}pricePlanSpecContainmentIDType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="image" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}imageType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanBODetailsType", propOrder = {
    "billingOfferId",
    "billingOfferCode",
    "billingOfferName",
    "priceDetails",
    "priceList",
    "planInfo",
    "productSpecContainmentID",
    "pricePlanSpecContainmentID",
    "image"
})
public class PlanBODetailsType {

    protected String billingOfferId;
    @XmlElement(required = true)
    protected String billingOfferCode;
    @XmlElement(required = true)
    protected String billingOfferName;
    protected List<PriceDetailsType> priceDetails;
    protected List<PricingType> priceList;
    protected List<UNIKeyValueType> planInfo;
    protected String productSpecContainmentID;
    protected String pricePlanSpecContainmentID;
    protected String image;

    /**
     * Obtiene el valor de la propiedad billingOfferId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingOfferId() {
        return billingOfferId;
    }

    /**
     * Define el valor de la propiedad billingOfferId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingOfferId(String value) {
        this.billingOfferId = value;
    }

    /**
     * Obtiene el valor de la propiedad billingOfferCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingOfferCode() {
        return billingOfferCode;
    }

    /**
     * Define el valor de la propiedad billingOfferCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingOfferCode(String value) {
        this.billingOfferCode = value;
    }

    /**
     * Obtiene el valor de la propiedad billingOfferName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingOfferName() {
        return billingOfferName;
    }

    /**
     * Define el valor de la propiedad billingOfferName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingOfferName(String value) {
        this.billingOfferName = value;
    }

    /**
     * Gets the value of the priceDetails property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the priceDetails property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPriceDetails().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PriceDetailsType }
     * 
     * 
     */
    public List<PriceDetailsType> getPriceDetails() {
        if (priceDetails == null) {
            priceDetails = new ArrayList<PriceDetailsType>();
        }
        return this.priceDetails;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the priceList property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPriceList().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PricingType }
     * 
     * 
     */
    public List<PricingType> getPriceList() {
        if (priceList == null) {
            priceList = new ArrayList<PricingType>();
        }
        return this.priceList;
    }

    /**
     * Gets the value of the planInfo property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the planInfo property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPlanInfo().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UNIKeyValueType }
     * 
     * 
     */
    public List<UNIKeyValueType> getPlanInfo() {
        if (planInfo == null) {
            planInfo = new ArrayList<UNIKeyValueType>();
        }
        return this.planInfo;
    }

    /**
     * Obtiene el valor de la propiedad productSpecContainmentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecContainmentID() {
        return productSpecContainmentID;
    }

    /**
     * Define el valor de la propiedad productSpecContainmentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecContainmentID(String value) {
        this.productSpecContainmentID = value;
    }

    /**
     * Obtiene el valor de la propiedad pricePlanSpecContainmentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanSpecContainmentID() {
        return pricePlanSpecContainmentID;
    }

    /**
     * Define el valor de la propiedad pricePlanSpecContainmentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanSpecContainmentID(String value) {
        this.pricePlanSpecContainmentID = value;
    }

    /**
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

}
