
package com.telefonica.globalintegration.services.retrieveofferings.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Structure of PagingInfoOutput
 * 
 * 				Functional struct: The business concepts contained are
 * 					- itemsPerCategory: Number of item found per category
 * 					- itemsPerPage: Number of items per page
 * 					- startIndex: The start index for this Representation
 * 					- hasMore: Field hasMore - pagination info
 * 					- totalResultsInCategory: Field totalResultsInCategory
 * 			
 * 
 * &lt;p&gt;Clase Java para PagingInfoOutputType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PagingInfoOutputType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="itemsPerCategory" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}itemsPerCategoryInquiryResponseType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="itemsPerPage" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}itemsPerPageInquiryResponseType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="startIndex" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}startIndexInquiryResponseType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="hasMore" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}hasMoreBooleanValueType"/&amp;gt;
 *         &amp;lt;element name="totalResultsInCategory" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}totalResultsInCategoryIntegerValueType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingInfoOutputType", propOrder = {
    "itemsPerCategory",
    "itemsPerPage",
    "startIndex",
    "hasMore",
    "totalResultsInCategory"
})
public class PagingInfoOutputType {

    protected BigDecimal itemsPerCategory;
    protected BigDecimal itemsPerPage;
    protected BigDecimal startIndex;
    protected boolean hasMore;
    protected BigDecimal totalResultsInCategory;

    /**
     * Obtiene el valor de la propiedad itemsPerCategory.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemsPerCategory() {
        return itemsPerCategory;
    }

    /**
     * Define el valor de la propiedad itemsPerCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemsPerCategory(BigDecimal value) {
        this.itemsPerCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad itemsPerPage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Define el valor de la propiedad itemsPerPage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemsPerPage(BigDecimal value) {
        this.itemsPerPage = value;
    }

    /**
     * Obtiene el valor de la propiedad startIndex.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartIndex() {
        return startIndex;
    }

    /**
     * Define el valor de la propiedad startIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartIndex(BigDecimal value) {
        this.startIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad hasMore.
     * 
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * Define el valor de la propiedad hasMore.
     * 
     */
    public void setHasMore(boolean value) {
        this.hasMore = value;
    }

    /**
     * Obtiene el valor de la propiedad totalResultsInCategory.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalResultsInCategory() {
        return totalResultsInCategory;
    }

    /**
     * Define el valor de la propiedad totalResultsInCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalResultsInCategory(BigDecimal value) {
        this.totalResultsInCategory = value;
    }

}
