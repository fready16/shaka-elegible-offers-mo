
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para SortCriterionList_Filter_FilterList_RetrieveFriendsAndFamilyNumbersRequest complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SortCriterionList_Filter_FilterList_RetrieveFriendsAndFamilyNumbersRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="sortCriterion" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}SortCriterion_RetrieveFriendsAndFamilyNumbersRequest" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortCriterionList_Filter_FilterList_RetrieveFriendsAndFamilyNumbersRequest", propOrder = {
    "sortCriterion"
})
public class SortCriterionListFilterFilterListRetrieveFriendsAndFamilyNumbersRequest {

    protected List<SortCriterionRetrieveFriendsAndFamilyNumbersRequest> sortCriterion;

    /**
     * Gets the value of the sortCriterion property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sortCriterion property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSortCriterion().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SortCriterionRetrieveFriendsAndFamilyNumbersRequest }
     * 
     * 
     */
    public List<SortCriterionRetrieveFriendsAndFamilyNumbersRequest> getSortCriterion() {
        if (sortCriterion == null) {
            sortCriterion = new ArrayList<SortCriterionRetrieveFriendsAndFamilyNumbersRequest>();
        }
        return this.sortCriterion;
    }

}
