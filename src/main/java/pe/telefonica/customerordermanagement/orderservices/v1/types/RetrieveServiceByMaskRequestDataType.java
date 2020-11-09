
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para RetrieveServiceByMaskRequest_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveServiceByMaskRequest_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="productComponent" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductComponent_RetrieveServiceByMaskRequest" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="availableServiceMask" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}AvailableServiceMaskEnum"/&amp;gt;
 *         &amp;lt;element name="implementedServiceMask" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ImplementedServiceMaskEnum"/&amp;gt;
 *         &amp;lt;element name="serviceFilterInfoList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}FilterList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveServiceByMaskRequest_data_type", propOrder = {
    "productComponent",
    "availableServiceMask",
    "implementedServiceMask",
    "serviceFilterInfoList"
})
public class RetrieveServiceByMaskRequestDataType {

    protected ProductComponentRetrieveServiceByMaskRequest productComponent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AvailableServiceMaskEnum availableServiceMask;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ImplementedServiceMaskEnum implementedServiceMask;
    protected FilterList serviceFilterInfoList;

    /**
     * Obtiene el valor de la propiedad productComponent.
     * 
     * @return
     *     possible object is
     *     {@link ProductComponentRetrieveServiceByMaskRequest }
     *     
     */
    public ProductComponentRetrieveServiceByMaskRequest getProductComponent() {
        return productComponent;
    }

    /**
     * Define el valor de la propiedad productComponent.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductComponentRetrieveServiceByMaskRequest }
     *     
     */
    public void setProductComponent(ProductComponentRetrieveServiceByMaskRequest value) {
        this.productComponent = value;
    }

    /**
     * Obtiene el valor de la propiedad availableServiceMask.
     * 
     * @return
     *     possible object is
     *     {@link AvailableServiceMaskEnum }
     *     
     */
    public AvailableServiceMaskEnum getAvailableServiceMask() {
        return availableServiceMask;
    }

    /**
     * Define el valor de la propiedad availableServiceMask.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableServiceMaskEnum }
     *     
     */
    public void setAvailableServiceMask(AvailableServiceMaskEnum value) {
        this.availableServiceMask = value;
    }

    /**
     * Obtiene el valor de la propiedad implementedServiceMask.
     * 
     * @return
     *     possible object is
     *     {@link ImplementedServiceMaskEnum }
     *     
     */
    public ImplementedServiceMaskEnum getImplementedServiceMask() {
        return implementedServiceMask;
    }

    /**
     * Define el valor de la propiedad implementedServiceMask.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementedServiceMaskEnum }
     *     
     */
    public void setImplementedServiceMask(ImplementedServiceMaskEnum value) {
        this.implementedServiceMask = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFilterInfoList.
     * 
     * @return
     *     possible object is
     *     {@link FilterList }
     *     
     */
    public FilterList getServiceFilterInfoList() {
        return serviceFilterInfoList;
    }

    /**
     * Define el valor de la propiedad serviceFilterInfoList.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterList }
     *     
     */
    public void setServiceFilterInfoList(FilterList value) {
        this.serviceFilterInfoList = value;
    }

}
