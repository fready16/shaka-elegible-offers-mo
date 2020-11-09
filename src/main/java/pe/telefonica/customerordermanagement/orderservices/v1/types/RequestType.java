
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para Request_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Request_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Request_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}Request_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request_type", propOrder = {
    "requestData"
})
public class RequestType
    extends TefHeaderReq
{

    @XmlElement(name = "Request_data", required = true)
    protected RequestDataType requestData;

    /**
     * Obtiene el valor de la propiedad requestData.
     * 
     * @return
     *     possible object is
     *     {@link RequestDataType }
     *     
     */
    public RequestDataType getRequestData() {
        return requestData;
    }

    /**
     * Define el valor de la propiedad requestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDataType }
     *     
     */
    public void setRequestData(RequestDataType value) {
        this.requestData = value;
    }

}
