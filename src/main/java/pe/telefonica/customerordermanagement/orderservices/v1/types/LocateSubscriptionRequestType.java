
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para LocateSubscriptionRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="LocateSubscriptionRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="LocateSubscriptionRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}LocateSubscriptionRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocateSubscriptionRequest_type", propOrder = {
    "locateSubscriptionRequestData"
})
public class LocateSubscriptionRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "LocateSubscriptionRequest_data", required = true)
    protected LocateSubscriptionRequestDataType locateSubscriptionRequestData;

    /**
     * Obtiene el valor de la propiedad locateSubscriptionRequestData.
     * 
     * @return
     *     possible object is
     *     {@link LocateSubscriptionRequestDataType }
     *     
     */
    public LocateSubscriptionRequestDataType getLocateSubscriptionRequestData() {
        return locateSubscriptionRequestData;
    }

    /**
     * Define el valor de la propiedad locateSubscriptionRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link LocateSubscriptionRequestDataType }
     *     
     */
    public void setLocateSubscriptionRequestData(LocateSubscriptionRequestDataType value) {
        this.locateSubscriptionRequestData = value;
    }

}
