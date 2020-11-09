
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para RetrieveOrdersHistoryRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveOrdersHistoryRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveOrdersHistoryRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveOrdersHistoryRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOrdersHistoryRequest_type", propOrder = {
    "retrieveOrdersHistoryRequestData"
})
public class RetrieveOrdersHistoryRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "RetrieveOrdersHistoryRequest_data", required = true)
    protected RetrieveOrdersHistoryRequestDataType retrieveOrdersHistoryRequestData;

    /**
     * Obtiene el valor de la propiedad retrieveOrdersHistoryRequestData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveOrdersHistoryRequestDataType }
     *     
     */
    public RetrieveOrdersHistoryRequestDataType getRetrieveOrdersHistoryRequestData() {
        return retrieveOrdersHistoryRequestData;
    }

    /**
     * Define el valor de la propiedad retrieveOrdersHistoryRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveOrdersHistoryRequestDataType }
     *     
     */
    public void setRetrieveOrdersHistoryRequestData(RetrieveOrdersHistoryRequestDataType value) {
        this.retrieveOrdersHistoryRequestData = value;
    }

}
