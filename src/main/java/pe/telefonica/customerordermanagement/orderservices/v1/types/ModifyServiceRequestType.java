
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para ModifyServiceRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ModifyServiceRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ModifyServiceRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ModifyServiceRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyServiceRequest_type", propOrder = {
    "modifyServiceRequestData"
})
public class ModifyServiceRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "ModifyServiceRequest_data", required = true)
    protected ModifyServiceRequestDataType modifyServiceRequestData;

    /**
     * Obtiene el valor de la propiedad modifyServiceRequestData.
     * 
     * @return
     *     possible object is
     *     {@link ModifyServiceRequestDataType }
     *     
     */
    public ModifyServiceRequestDataType getModifyServiceRequestData() {
        return modifyServiceRequestData;
    }

    /**
     * Define el valor de la propiedad modifyServiceRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyServiceRequestDataType }
     *     
     */
    public void setModifyServiceRequestData(ModifyServiceRequestDataType value) {
        this.modifyServiceRequestData = value;
    }

}
