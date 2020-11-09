
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para RetrieveOrdersHistoryResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveOrdersHistoryResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveOrdersHistoryResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveOrdersHistoryResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOrdersHistoryResponse_type", propOrder = {
    "retrieveOrdersHistoryResponseData"
})
public class RetrieveOrdersHistoryResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "RetrieveOrdersHistoryResponse_data", required = true)
    protected RetrieveOrdersHistoryResponseDataType retrieveOrdersHistoryResponseData;

    /**
     * Obtiene el valor de la propiedad retrieveOrdersHistoryResponseData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveOrdersHistoryResponseDataType }
     *     
     */
    public RetrieveOrdersHistoryResponseDataType getRetrieveOrdersHistoryResponseData() {
        return retrieveOrdersHistoryResponseData;
    }

    /**
     * Define el valor de la propiedad retrieveOrdersHistoryResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveOrdersHistoryResponseDataType }
     *     
     */
    public void setRetrieveOrdersHistoryResponseData(RetrieveOrdersHistoryResponseDataType value) {
        this.retrieveOrdersHistoryResponseData = value;
    }

}
