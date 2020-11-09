
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para RetrieveProductHeaderRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveProductHeaderRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveProductHeaderRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveProductHeaderRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductHeaderRequest_type", propOrder = {
    "retrieveProductHeaderRequestData"
})
public class RetrieveProductHeaderRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "RetrieveProductHeaderRequest_data", required = true)
    protected RetrieveProductHeaderRequestDataType retrieveProductHeaderRequestData;

    /**
     * Obtiene el valor de la propiedad retrieveProductHeaderRequestData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveProductHeaderRequestDataType }
     *     
     */
    public RetrieveProductHeaderRequestDataType getRetrieveProductHeaderRequestData() {
        return retrieveProductHeaderRequestData;
    }

    /**
     * Define el valor de la propiedad retrieveProductHeaderRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveProductHeaderRequestDataType }
     *     
     */
    public void setRetrieveProductHeaderRequestData(RetrieveProductHeaderRequestDataType value) {
        this.retrieveProductHeaderRequestData = value;
    }

}
