
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para RetrieveServiceByMaskRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveServiceByMaskRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveServiceByMaskRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveServiceByMaskRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveServiceByMaskRequest_type", propOrder = {
    "retrieveServiceByMaskRequestData"
})
public class RetrieveServiceByMaskRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "RetrieveServiceByMaskRequest_data", required = true)
    protected RetrieveServiceByMaskRequestDataType retrieveServiceByMaskRequestData;

    /**
     * Obtiene el valor de la propiedad retrieveServiceByMaskRequestData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveServiceByMaskRequestDataType }
     *     
     */
    public RetrieveServiceByMaskRequestDataType getRetrieveServiceByMaskRequestData() {
        return retrieveServiceByMaskRequestData;
    }

    /**
     * Define el valor de la propiedad retrieveServiceByMaskRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveServiceByMaskRequestDataType }
     *     
     */
    public void setRetrieveServiceByMaskRequestData(RetrieveServiceByMaskRequestDataType value) {
        this.retrieveServiceByMaskRequestData = value;
    }

}
