
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Clase Java para ProductHeader complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProductHeader"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="productComponent" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductComponent"/&amp;gt;
 *         &amp;lt;element name="externalProductID"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="50"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="customerID"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="20"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="productSpecificationType" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductSpecificationType"/&amp;gt;
 *         &amp;lt;element name="_productSpecification" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductSpecification"/&amp;gt;
 *         &amp;lt;element name="productStatus" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductStatus"/&amp;gt;
 *         &amp;lt;element name="productStatusReason" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="10"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="productSubStatus" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductSubStatus" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="initialActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="productOfferingInstanceID"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="50"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="productOfferingCode"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="50"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="productOfferType"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="8"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="_productOffering" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductOffering_ProductHeader"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductHeader", propOrder = {
    "productComponent",
    "externalProductID",
    "customerID",
    "productSpecificationType",
    "productSpecification",
    "productStatus",
    "productStatusReason",
    "productSubStatus",
    "effectiveDate",
    "initialActivationDate",
    "productOfferingInstanceID",
    "productOfferingCode",
    "productOfferType",
    "productOffering"
})
public class ProductHeader {

    @XmlElement(required = true)
    protected ProductComponent productComponent;
    @XmlElement(required = true)
    protected String externalProductID;
    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected ProductSpecificationType productSpecificationType;
    @XmlElement(name = "_productSpecification", required = true)
    protected ProductSpecification productSpecification;
    @XmlElement(required = true)
    protected ProductStatus productStatus;
    protected String productStatusReason;
    protected ProductSubStatus productSubStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialActivationDate;
    @XmlElement(required = true)
    protected String productOfferingInstanceID;
    @XmlElement(required = true)
    protected String productOfferingCode;
    @XmlElement(required = true)
    protected String productOfferType;
    @XmlElement(name = "_productOffering", required = true)
    protected ProductOfferingProductHeader productOffering;

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
     * Obtiene el valor de la propiedad externalProductID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalProductID() {
        return externalProductID;
    }

    /**
     * Define el valor de la propiedad externalProductID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalProductID(String value) {
        this.externalProductID = value;
    }

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Obtiene el valor de la propiedad productSpecificationType.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecificationType }
     *     
     */
    public ProductSpecificationType getProductSpecificationType() {
        return productSpecificationType;
    }

    /**
     * Define el valor de la propiedad productSpecificationType.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecificationType }
     *     
     */
    public void setProductSpecificationType(ProductSpecificationType value) {
        this.productSpecificationType = value;
    }

    /**
     * Obtiene el valor de la propiedad productSpecification.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecification }
     *     
     */
    public ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Define el valor de la propiedad productSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecification }
     *     
     */
    public void setProductSpecification(ProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Obtiene el valor de la propiedad productStatus.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatus }
     *     
     */
    public ProductStatus getProductStatus() {
        return productStatus;
    }

    /**
     * Define el valor de la propiedad productStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatus }
     *     
     */
    public void setProductStatus(ProductStatus value) {
        this.productStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad productStatusReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatusReason() {
        return productStatusReason;
    }

    /**
     * Define el valor de la propiedad productStatusReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatusReason(String value) {
        this.productStatusReason = value;
    }

    /**
     * Obtiene el valor de la propiedad productSubStatus.
     * 
     * @return
     *     possible object is
     *     {@link ProductSubStatus }
     *     
     */
    public ProductSubStatus getProductSubStatus() {
        return productSubStatus;
    }

    /**
     * Define el valor de la propiedad productSubStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSubStatus }
     *     
     */
    public void setProductSubStatus(ProductSubStatus value) {
        this.productSubStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad effectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Define el valor de la propiedad effectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Obtiene el valor de la propiedad initialActivationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialActivationDate() {
        return initialActivationDate;
    }

    /**
     * Define el valor de la propiedad initialActivationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialActivationDate(XMLGregorianCalendar value) {
        this.initialActivationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad productOfferingInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOfferingInstanceID() {
        return productOfferingInstanceID;
    }

    /**
     * Define el valor de la propiedad productOfferingInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOfferingInstanceID(String value) {
        this.productOfferingInstanceID = value;
    }

    /**
     * Obtiene el valor de la propiedad productOfferingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOfferingCode() {
        return productOfferingCode;
    }

    /**
     * Define el valor de la propiedad productOfferingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOfferingCode(String value) {
        this.productOfferingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad productOfferType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOfferType() {
        return productOfferType;
    }

    /**
     * Define el valor de la propiedad productOfferType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOfferType(String value) {
        this.productOfferType = value;
    }

    /**
     * Obtiene el valor de la propiedad productOffering.
     * 
     * @return
     *     possible object is
     *     {@link ProductOfferingProductHeader }
     *     
     */
    public ProductOfferingProductHeader getProductOffering() {
        return productOffering;
    }

    /**
     * Define el valor de la propiedad productOffering.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOfferingProductHeader }
     *     
     */
    public void setProductOffering(ProductOfferingProductHeader value) {
        this.productOffering = value;
    }

}
