
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para RequestSVAActivationResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RequestSVAActivationResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RequestSVAActivationResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RequestSVAActivationResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSVAActivationResponse_type", propOrder = {
    "requestSVAActivationResponseData"
})
public class RequestSVAActivationResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "RequestSVAActivationResponse_data", required = true)
    protected RequestSVAActivationResponseDataType requestSVAActivationResponseData;

    /**
     * Obtiene el valor de la propiedad requestSVAActivationResponseData.
     * 
     * @return
     *     possible object is
     *     {@link RequestSVAActivationResponseDataType }
     *     
     */
    public RequestSVAActivationResponseDataType getRequestSVAActivationResponseData() {
        return requestSVAActivationResponseData;
    }

    /**
     * Define el valor de la propiedad requestSVAActivationResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestSVAActivationResponseDataType }
     *     
     */
    public void setRequestSVAActivationResponseData(RequestSVAActivationResponseDataType value) {
        this.requestSVAActivationResponseData = value;
    }

}
