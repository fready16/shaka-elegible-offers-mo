
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para QuerySubscriptionGroupValueRequest_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QuerySubscriptionGroupValueRequest_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MSISDN" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}TelephoneNumber_QuerySubscriptionGroupValueRequest"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubscriptionGroupValueRequest_data_type", propOrder = {
    "msisdn"
})
public class QuerySubscriptionGroupValueRequestDataType {

    @XmlElement(name = "MSISDN", required = true)
    protected TelephoneNumberQuerySubscriptionGroupValueRequest msisdn;

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberQuerySubscriptionGroupValueRequest }
     *     
     */
    public TelephoneNumberQuerySubscriptionGroupValueRequest getMSISDN() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberQuerySubscriptionGroupValueRequest }
     *     
     */
    public void setMSISDN(TelephoneNumberQuerySubscriptionGroupValueRequest value) {
        this.msisdn = value;
    }

}
