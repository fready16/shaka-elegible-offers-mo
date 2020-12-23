
package com.telefonica.globalintegration.services.retrieveofferings.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Structure of CategoryList - retrieveOFferings
 * 
 * 				Functional struct: The business concepts contained are
 * 					- category: Data for the category creation/update (synonym of CategoryTreeType) (similar concept that SID attribute defined by 'p1:CategoryTreeTypeType')
 * 					- currentPlanRelationId: Relation ID of the plan of the current product to its parent (similar concept that SID attribute defined by 'p1:entityIdEntityType')
 * 					- paginationInfo: Synonym of PagingInfoOutput (similar concept that SID attribute defined by 'p1:PagingInfoOutputType')
 * 					- offerings: Synonym of OfferingType - RetrieveOffering (similar concept that SID attribute defined by 'p1:OfferingTypeOfferType')
 * 			
 * 
 * &lt;p&gt;Clase Java para CategoryListType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CategoryListType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="category" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}CategoryTreeTypeType"/&amp;gt;
 *         &amp;lt;element name="currentPlanRelationId" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}entityIdEntityType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="paginationInfo" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}PagingInfoOutputType"/&amp;gt;
 *         &amp;lt;element name="offerings" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}OfferingTypeOfferType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryListType", propOrder = {
    "category",
    "currentPlanRelationId",
    "paginationInfo",
    "offerings"
})
public class CategoryListType {

    @XmlElement(required = true)
    protected CategoryTreeTypeType category;
    protected String currentPlanRelationId;
    @XmlElement(required = true)
    protected PagingInfoOutputType paginationInfo;
    protected List<OfferingTypeOfferType> offerings;

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link CategoryTreeTypeType }
     *     
     */
    public CategoryTreeTypeType getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryTreeTypeType }
     *     
     */
    public void setCategory(CategoryTreeTypeType value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad currentPlanRelationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPlanRelationId() {
        return currentPlanRelationId;
    }

    /**
     * Define el valor de la propiedad currentPlanRelationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPlanRelationId(String value) {
        this.currentPlanRelationId = value;
    }

    /**
     * Obtiene el valor de la propiedad paginationInfo.
     * 
     * @return
     *     possible object is
     *     {@link PagingInfoOutputType }
     *     
     */
    public PagingInfoOutputType getPaginationInfo() {
        return paginationInfo;
    }

    /**
     * Define el valor de la propiedad paginationInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingInfoOutputType }
     *     
     */
    public void setPaginationInfo(PagingInfoOutputType value) {
        this.paginationInfo = value;
    }

    /**
     * Gets the value of the offerings property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the offerings property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOfferings().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingTypeOfferType }
     * 
     * 
     */
    public List<OfferingTypeOfferType> getOfferings() {
        if (offerings == null) {
            offerings = new ArrayList<OfferingTypeOfferType>();
        }
        return this.offerings;
    }

}
