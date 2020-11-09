
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para ChangeProductStatusRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChangeProductStatusRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ChangeProductStatusRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ChangeProductStatusRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeProductStatusRequest_type", propOrder = {
    "changeProductStatusRequestData"
})
public class ChangeProductStatusRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "ChangeProductStatusRequest_data", required = true)
    protected ChangeProductStatusRequestDataType changeProductStatusRequestData;

    /**
     * Obtiene el valor de la propiedad changeProductStatusRequestData.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProductStatusRequestDataType }
     *     
     */
    public ChangeProductStatusRequestDataType getChangeProductStatusRequestData() {
        return changeProductStatusRequestData;
    }

    /**
     * Define el valor de la propiedad changeProductStatusRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProductStatusRequestDataType }
     *     
     */
    public void setChangeProductStatusRequestData(ChangeProductStatusRequestDataType value) {
        this.changeProductStatusRequestData = value;
    }

}
