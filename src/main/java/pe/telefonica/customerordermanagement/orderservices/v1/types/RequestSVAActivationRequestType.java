
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para RequestSVAActivationRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RequestSVAActivationRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RequestSVAActivationRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RequestSVAActivationRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSVAActivationRequest_type", propOrder = {
    "requestSVAActivationRequestData"
})
public class RequestSVAActivationRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "RequestSVAActivationRequest_data", required = true)
    protected RequestSVAActivationRequestDataType requestSVAActivationRequestData;

    /**
     * Obtiene el valor de la propiedad requestSVAActivationRequestData.
     * 
     * @return
     *     possible object is
     *     {@link RequestSVAActivationRequestDataType }
     *     
     */
    public RequestSVAActivationRequestDataType getRequestSVAActivationRequestData() {
        return requestSVAActivationRequestData;
    }

    /**
     * Define el valor de la propiedad requestSVAActivationRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestSVAActivationRequestDataType }
     *     
     */
    public void setRequestSVAActivationRequestData(RequestSVAActivationRequestDataType value) {
        this.requestSVAActivationRequestData = value;
    }

}
