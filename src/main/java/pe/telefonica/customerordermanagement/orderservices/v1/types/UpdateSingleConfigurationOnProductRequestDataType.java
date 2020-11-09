
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para UpdateSingleConfigurationOnProductRequest_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UpdateSingleConfigurationOnProductRequest_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="productComponent" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductComponent_UpdateSingleConfigurationOnProductRequest"/&amp;gt;
 *         &amp;lt;element name="productOrder" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductOrder" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="configurationActionList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductConfigurationActionList"/&amp;gt;
 *         &amp;lt;element name="activity" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ActivityInformation_UpdateSingleConfigurationOnProductRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="isConfirmationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="callbackURL" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}URL" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="userID" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="50"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="salesChannel" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="50"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSingleConfigurationOnProductRequest_data_type", propOrder = {
    "productComponent",
    "productOrder",
    "configurationActionList",
    "activity",
    "isConfirmationRequired",
    "callbackURL",
    "userID",
    "salesChannel"
})
public class UpdateSingleConfigurationOnProductRequestDataType {

    @XmlElement(required = true)
    protected ProductComponentUpdateSingleConfigurationOnProductRequest productComponent;
    protected ProductOrder productOrder;
    @XmlElement(required = true)
    protected ProductConfigurationActionList configurationActionList;
    protected ActivityInformationUpdateSingleConfigurationOnProductRequest activity;
    protected Boolean isConfirmationRequired;
    protected URL callbackURL;
    protected String userID;
    protected String salesChannel;

    /**
     * Obtiene el valor de la propiedad productComponent.
     * 
     * @return
     *     possible object is
     *     {@link ProductComponentUpdateSingleConfigurationOnProductRequest }
     *     
     */
    public ProductComponentUpdateSingleConfigurationOnProductRequest getProductComponent() {
        return productComponent;
    }

    /**
     * Define el valor de la propiedad productComponent.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductComponentUpdateSingleConfigurationOnProductRequest }
     *     
     */
    public void setProductComponent(ProductComponentUpdateSingleConfigurationOnProductRequest value) {
        this.productComponent = value;
    }

    /**
     * Obtiene el valor de la propiedad productOrder.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrder }
     *     
     */
    public ProductOrder getProductOrder() {
        return productOrder;
    }

    /**
     * Define el valor de la propiedad productOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrder }
     *     
     */
    public void setProductOrder(ProductOrder value) {
        this.productOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad configurationActionList.
     * 
     * @return
     *     possible object is
     *     {@link ProductConfigurationActionList }
     *     
     */
    public ProductConfigurationActionList getConfigurationActionList() {
        return configurationActionList;
    }

    /**
     * Define el valor de la propiedad configurationActionList.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductConfigurationActionList }
     *     
     */
    public void setConfigurationActionList(ProductConfigurationActionList value) {
        this.configurationActionList = value;
    }

    /**
     * Obtiene el valor de la propiedad activity.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInformationUpdateSingleConfigurationOnProductRequest }
     *     
     */
    public ActivityInformationUpdateSingleConfigurationOnProductRequest getActivity() {
        return activity;
    }

    /**
     * Define el valor de la propiedad activity.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInformationUpdateSingleConfigurationOnProductRequest }
     *     
     */
    public void setActivity(ActivityInformationUpdateSingleConfigurationOnProductRequest value) {
        this.activity = value;
    }

    /**
     * Obtiene el valor de la propiedad isConfirmationRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConfirmationRequired() {
        return isConfirmationRequired;
    }

    /**
     * Define el valor de la propiedad isConfirmationRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConfirmationRequired(Boolean value) {
        this.isConfirmationRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad callbackURL.
     * 
     * @return
     *     possible object is
     *     {@link URL }
     *     
     */
    public URL getCallbackURL() {
        return callbackURL;
    }

    /**
     * Define el valor de la propiedad callbackURL.
     * 
     * @param value
     *     allowed object is
     *     {@link URL }
     *     
     */
    public void setCallbackURL(URL value) {
        this.callbackURL = value;
    }

    /**
     * Obtiene el valor de la propiedad userID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Define el valor de la propiedad userID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Obtiene el valor de la propiedad salesChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * Define el valor de la propiedad salesChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannel(String value) {
        this.salesChannel = value;
    }

}
