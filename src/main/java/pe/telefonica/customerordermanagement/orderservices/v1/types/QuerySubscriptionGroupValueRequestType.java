
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para QuerySubscriptionGroupValueRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QuerySubscriptionGroupValueRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="QuerySubscriptionGroupValueRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}QuerySubscriptionGroupValueRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubscriptionGroupValueRequest_type", propOrder = {
    "querySubscriptionGroupValueRequestData"
})
public class QuerySubscriptionGroupValueRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "QuerySubscriptionGroupValueRequest_data", required = true)
    protected QuerySubscriptionGroupValueRequestDataType querySubscriptionGroupValueRequestData;

    /**
     * Obtiene el valor de la propiedad querySubscriptionGroupValueRequestData.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubscriptionGroupValueRequestDataType }
     *     
     */
    public QuerySubscriptionGroupValueRequestDataType getQuerySubscriptionGroupValueRequestData() {
        return querySubscriptionGroupValueRequestData;
    }

    /**
     * Define el valor de la propiedad querySubscriptionGroupValueRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubscriptionGroupValueRequestDataType }
     *     
     */
    public void setQuerySubscriptionGroupValueRequestData(QuerySubscriptionGroupValueRequestDataType value) {
        this.querySubscriptionGroupValueRequestData = value;
    }

}
