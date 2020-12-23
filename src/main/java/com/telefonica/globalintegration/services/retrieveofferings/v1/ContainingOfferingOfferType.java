
package com.telefonica.globalintegration.services.retrieveofferings.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Structure of ContainingOffering - retrieveOfferings
 * 
 * 				Functional struct: The business concepts contained are
 * 					- offeringId: The catalog ID of the containing offering
 * 					- offeringToProductIds: Synonym of OfferingToProductIds (similar concept that SID attribute defined by 'p1:OfferingToProductIdsProductCatalogType')
 * 					- productSpecIds: Synonym of ProductSpecIds (similar concept that SID attribute defined by 'p1:ProductSpecIdsProductCatalogType')
 * 			
 * 
 * &lt;p&gt;Clase Java para ContainingOfferingOfferType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ContainingOfferingOfferType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="offeringId" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}offeringIdCatalogSpecificationType"/&amp;gt;
 *         &amp;lt;element name="offeringToProductIds" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}OfferingToProductIdsProductCatalogType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="productSpecIds" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}ProductSpecIdsProductCatalogType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainingOfferingOfferType", propOrder = {
    "offeringId",
    "offeringToProductIds",
    "productSpecIds"
})
public class ContainingOfferingOfferType {

    @XmlElement(required = true)
    protected String offeringId;
    protected List<String> offeringToProductIds;
    protected List<String> productSpecIds;

    /**
     * Obtiene el valor de la propiedad offeringId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * Define el valor de la propiedad offeringId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingId(String value) {
        this.offeringId = value;
    }

    /**
     * Gets the value of the offeringToProductIds property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the offeringToProductIds property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOfferingToProductIds().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfferingToProductIds() {
        if (offeringToProductIds == null) {
            offeringToProductIds = new ArrayList<String>();
        }
        return this.offeringToProductIds;
    }

    /**
     * Gets the value of the productSpecIds property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the productSpecIds property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getProductSpecIds().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductSpecIds() {
        if (productSpecIds == null) {
            productSpecIds = new ArrayList<String>();
        }
        return this.productSpecIds;
    }

}
