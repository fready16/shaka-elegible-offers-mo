
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para RequestSVADeactivationResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RequestSVADeactivationResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RequestSVADeactivationResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RequestSVADeactivationResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSVADeactivationResponse_type", propOrder = {
    "requestSVADeactivationResponseData"
})
public class RequestSVADeactivationResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "RequestSVADeactivationResponse_data", required = true)
    protected RequestSVADeactivationResponseDataType requestSVADeactivationResponseData;

    /**
     * Obtiene el valor de la propiedad requestSVADeactivationResponseData.
     * 
     * @return
     *     possible object is
     *     {@link RequestSVADeactivationResponseDataType }
     *     
     */
    public RequestSVADeactivationResponseDataType getRequestSVADeactivationResponseData() {
        return requestSVADeactivationResponseData;
    }

    /**
     * Define el valor de la propiedad requestSVADeactivationResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestSVADeactivationResponseDataType }
     *     
     */
    public void setRequestSVADeactivationResponseData(RequestSVADeactivationResponseDataType value) {
        this.requestSVADeactivationResponseData = value;
    }

}
