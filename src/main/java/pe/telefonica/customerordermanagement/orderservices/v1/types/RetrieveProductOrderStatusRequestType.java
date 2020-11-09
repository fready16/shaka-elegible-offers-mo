
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para RetrieveProductOrderStatusRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveProductOrderStatusRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveProductOrderStatusRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveProductOrderStatusRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductOrderStatusRequest_type", propOrder = {
    "retrieveProductOrderStatusRequestData"
})
public class RetrieveProductOrderStatusRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "RetrieveProductOrderStatusRequest_data", required = true)
    protected RetrieveProductOrderStatusRequestDataType retrieveProductOrderStatusRequestData;

    /**
     * Obtiene el valor de la propiedad retrieveProductOrderStatusRequestData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveProductOrderStatusRequestDataType }
     *     
     */
    public RetrieveProductOrderStatusRequestDataType getRetrieveProductOrderStatusRequestData() {
        return retrieveProductOrderStatusRequestData;
    }

    /**
     * Define el valor de la propiedad retrieveProductOrderStatusRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveProductOrderStatusRequestDataType }
     *     
     */
    public void setRetrieveProductOrderStatusRequestData(RetrieveProductOrderStatusRequestDataType value) {
        this.retrieveProductOrderStatusRequestData = value;
    }

}
