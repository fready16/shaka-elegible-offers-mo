
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para RetrieveProductHeaderResponse_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveProductHeaderResponse_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="response" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}Response"/&amp;gt;
 *         &amp;lt;element name="productHeader" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductHeader" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductHeaderResponse_data_type", propOrder = {
    "response",
    "productHeader"
})
public class RetrieveProductHeaderResponseDataType {

    @XmlElement(required = true)
    protected Response response;
    protected ProductHeader productHeader;

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
     * Obtiene el valor de la propiedad productHeader.
     * 
     * @return
     *     possible object is
     *     {@link ProductHeader }
     *     
     */
    public ProductHeader getProductHeader() {
        return productHeader;
    }

    /**
     * Define el valor de la propiedad productHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHeader }
     *     
     */
    public void setProductHeader(ProductHeader value) {
        this.productHeader = value;
    }

}
