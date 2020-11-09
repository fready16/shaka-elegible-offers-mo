
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para ConsultServicesRetrieveProductHeaderResults complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ConsultServicesRetrieveProductHeaderResults"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="response" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}Response_ConsultServicesRetrieveProductHeaderResults"/&amp;gt;
 *         &amp;lt;element name="ProductHeader" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductHeader"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultServicesRetrieveProductHeaderResults", propOrder = {
    "response",
    "productHeader"
})
public class ConsultServicesRetrieveProductHeaderResults {

    @XmlElement(required = true)
    protected ResponseConsultServicesRetrieveProductHeaderResults response;
    @XmlElement(name = "ProductHeader", required = true)
    protected ProductHeader productHeader;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link ResponseConsultServicesRetrieveProductHeaderResults }
     *     
     */
    public ResponseConsultServicesRetrieveProductHeaderResults getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseConsultServicesRetrieveProductHeaderResults }
     *     
     */
    public void setResponse(ResponseConsultServicesRetrieveProductHeaderResults value) {
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
