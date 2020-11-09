
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para RetrieveFriendsAndFamilyNumbersRequest_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveFriendsAndFamilyNumbersRequest_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="productComponent" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductComponent_RetrieveFriendsAndFamilyNumbersRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="serviceFilterInfoList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}FilterList_RetrieveFriendsAndFamilyNumbersRequest" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveFriendsAndFamilyNumbersRequest_data_type", propOrder = {
    "productComponent",
    "serviceFilterInfoList"
})
public class RetrieveFriendsAndFamilyNumbersRequestDataType {

    protected ProductComponentRetrieveFriendsAndFamilyNumbersRequest productComponent;
    protected FilterListRetrieveFriendsAndFamilyNumbersRequest serviceFilterInfoList;

    /**
     * Obtiene el valor de la propiedad productComponent.
     * 
     * @return
     *     possible object is
     *     {@link ProductComponentRetrieveFriendsAndFamilyNumbersRequest }
     *     
     */
    public ProductComponentRetrieveFriendsAndFamilyNumbersRequest getProductComponent() {
        return productComponent;
    }

    /**
     * Define el valor de la propiedad productComponent.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductComponentRetrieveFriendsAndFamilyNumbersRequest }
     *     
     */
    public void setProductComponent(ProductComponentRetrieveFriendsAndFamilyNumbersRequest value) {
        this.productComponent = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFilterInfoList.
     * 
     * @return
     *     possible object is
     *     {@link FilterListRetrieveFriendsAndFamilyNumbersRequest }
     *     
     */
    public FilterListRetrieveFriendsAndFamilyNumbersRequest getServiceFilterInfoList() {
        return serviceFilterInfoList;
    }

    /**
     * Define el valor de la propiedad serviceFilterInfoList.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterListRetrieveFriendsAndFamilyNumbersRequest }
     *     
     */
    public void setServiceFilterInfoList(FilterListRetrieveFriendsAndFamilyNumbersRequest value) {
        this.serviceFilterInfoList = value;
    }

}
