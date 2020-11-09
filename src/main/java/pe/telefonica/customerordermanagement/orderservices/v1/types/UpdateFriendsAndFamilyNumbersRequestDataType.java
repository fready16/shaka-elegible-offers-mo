
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para UpdateFriendsAndFamilyNumbersRequest_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UpdateFriendsAndFamilyNumbersRequest_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="productComponent" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductComponent" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="productOrder" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductOrder_UpdateFriendsAndFamilyNumbersRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="friendsAndFamilyComponnent" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}FNFComponent"/&amp;gt;
 *         &amp;lt;element name="activity" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ActivityInformation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="addDestinationList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}TelephoneNumberFNFList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="removeDestinationList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}TelephoneNumberFNFList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFriendsAndFamilyNumbersRequest_data_type", propOrder = {
    "productComponent",
    "productOrder",
    "friendsAndFamilyComponnent",
    "activity",
    "addDestinationList",
    "removeDestinationList"
})
public class UpdateFriendsAndFamilyNumbersRequestDataType {

    protected ProductComponent productComponent;
    protected ProductOrderUpdateFriendsAndFamilyNumbersRequest productOrder;
    @XmlElement(required = true)
    protected FNFComponent friendsAndFamilyComponnent;
    protected ActivityInformation activity;
    protected TelephoneNumberFNFList addDestinationList;
    protected TelephoneNumberFNFList removeDestinationList;

    /**
     * Obtiene el valor de la propiedad productComponent.
     * 
     * @return
     *     possible object is
     *     {@link ProductComponent }
     *     
     */
    public ProductComponent getProductComponent() {
        return productComponent;
    }

    /**
     * Define el valor de la propiedad productComponent.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductComponent }
     *     
     */
    public void setProductComponent(ProductComponent value) {
        this.productComponent = value;
    }

    /**
     * Obtiene el valor de la propiedad productOrder.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderUpdateFriendsAndFamilyNumbersRequest }
     *     
     */
    public ProductOrderUpdateFriendsAndFamilyNumbersRequest getProductOrder() {
        return productOrder;
    }

    /**
     * Define el valor de la propiedad productOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderUpdateFriendsAndFamilyNumbersRequest }
     *     
     */
    public void setProductOrder(ProductOrderUpdateFriendsAndFamilyNumbersRequest value) {
        this.productOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad friendsAndFamilyComponnent.
     * 
     * @return
     *     possible object is
     *     {@link FNFComponent }
     *     
     */
    public FNFComponent getFriendsAndFamilyComponnent() {
        return friendsAndFamilyComponnent;
    }

    /**
     * Define el valor de la propiedad friendsAndFamilyComponnent.
     * 
     * @param value
     *     allowed object is
     *     {@link FNFComponent }
     *     
     */
    public void setFriendsAndFamilyComponnent(FNFComponent value) {
        this.friendsAndFamilyComponnent = value;
    }

    /**
     * Obtiene el valor de la propiedad activity.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInformation }
     *     
     */
    public ActivityInformation getActivity() {
        return activity;
    }

    /**
     * Define el valor de la propiedad activity.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInformation }
     *     
     */
    public void setActivity(ActivityInformation value) {
        this.activity = value;
    }

    /**
     * Obtiene el valor de la propiedad addDestinationList.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberFNFList }
     *     
     */
    public TelephoneNumberFNFList getAddDestinationList() {
        return addDestinationList;
    }

    /**
     * Define el valor de la propiedad addDestinationList.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberFNFList }
     *     
     */
    public void setAddDestinationList(TelephoneNumberFNFList value) {
        this.addDestinationList = value;
    }

    /**
     * Obtiene el valor de la propiedad removeDestinationList.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberFNFList }
     *     
     */
    public TelephoneNumberFNFList getRemoveDestinationList() {
        return removeDestinationList;
    }

    /**
     * Define el valor de la propiedad removeDestinationList.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberFNFList }
     *     
     */
    public void setRemoveDestinationList(TelephoneNumberFNFList value) {
        this.removeDestinationList = value;
    }

}
