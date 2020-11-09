
package com.telefonica.globalintegration.services.retrieveofferings.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the output interface of 'retrieveOfferings' operation. The first level fields are:
 * 					- categories: Synonym of CategoryList - retrieveOfferings (similar concept that SID attribute defined by 'p1:CategoryListType')
 * 			
 * 
 * &lt;p&gt;Clase Java para retrieveOfferingsResponseType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="retrieveOfferingsResponseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="categories" type="{http://telefonica.com/globalIntegration/services/retrieveOfferings/v1}CategoryListType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveOfferingsResponseType", propOrder = {
    "categories"
})
public class RetrieveOfferingsResponseType {

    protected List<CategoryListType> categories;

    /**
     * Gets the value of the categories property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the categories property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCategories().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryListType }
     * 
     * 
     */
    public List<CategoryListType> getCategories() {
        if (categories == null) {
            categories = new ArrayList<CategoryListType>();
        }
        return this.categories;
    }

}
