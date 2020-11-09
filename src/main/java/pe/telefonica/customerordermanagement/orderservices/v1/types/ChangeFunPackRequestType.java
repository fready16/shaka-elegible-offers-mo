
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para ChangeFunPackRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChangeFunPackRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ChangeFunPackRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ChangeFunPackRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeFunPackRequest_type", propOrder = {
    "changeFunPackRequestData"
})
public class ChangeFunPackRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "ChangeFunPackRequest_data", required = true)
    protected ChangeFunPackRequestDataType changeFunPackRequestData;

    /**
     * Obtiene el valor de la propiedad changeFunPackRequestData.
     * 
     * @return
     *     possible object is
     *     {@link ChangeFunPackRequestDataType }
     *     
     */
    public ChangeFunPackRequestDataType getChangeFunPackRequestData() {
        return changeFunPackRequestData;
    }

    /**
     * Define el valor de la propiedad changeFunPackRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeFunPackRequestDataType }
     *     
     */
    public void setChangeFunPackRequestData(ChangeFunPackRequestDataType value) {
        this.changeFunPackRequestData = value;
    }

}
