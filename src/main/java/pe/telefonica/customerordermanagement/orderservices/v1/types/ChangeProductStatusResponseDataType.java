
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para ChangeProductStatusResponse_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChangeProductStatusResponse_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="response" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}Response"/&amp;gt;
 *         &amp;lt;element name="productOrder" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductOrder_ChangeProductStatusResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="lostAndStolenCode" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}LostAndStolenCode" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeProductStatusResponse_data_type", propOrder = {
    "response",
    "productOrder",
    "lostAndStolenCode"
})
public class ChangeProductStatusResponseDataType {

    @XmlElement(required = true)
    protected Response response;
    protected ProductOrderChangeProductStatusResponse productOrder;
    protected LostAndStolenCode lostAndStolenCode;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Obtiene el valor de la propiedad productOrder.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderChangeProductStatusResponse }
     *     
     */
    public ProductOrderChangeProductStatusResponse getProductOrder() {
        return productOrder;
    }

    /**
     * Define el valor de la propiedad productOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderChangeProductStatusResponse }
     *     
     */
    public void setProductOrder(ProductOrderChangeProductStatusResponse value) {
        this.productOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad lostAndStolenCode.
     * 
     * @return
     *     possible object is
     *     {@link LostAndStolenCode }
     *     
     */
    public LostAndStolenCode getLostAndStolenCode() {
        return lostAndStolenCode;
    }

    /**
     * Define el valor de la propiedad lostAndStolenCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LostAndStolenCode }
     *     
     */
    public void setLostAndStolenCode(LostAndStolenCode value) {
        this.lostAndStolenCode = value;
    }

}
