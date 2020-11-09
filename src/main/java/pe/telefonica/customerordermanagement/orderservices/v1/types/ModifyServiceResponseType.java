
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para ModifyServiceResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ModifyServiceResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ModifyServiceResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ModifyServiceResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyServiceResponse_type", propOrder = {
    "modifyServiceResponseData"
})
public class ModifyServiceResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "ModifyServiceResponse_data", required = true)
    protected ModifyServiceResponseDataType modifyServiceResponseData;

    /**
     * Obtiene el valor de la propiedad modifyServiceResponseData.
     * 
     * @return
     *     possible object is
     *     {@link ModifyServiceResponseDataType }
     *     
     */
    public ModifyServiceResponseDataType getModifyServiceResponseData() {
        return modifyServiceResponseData;
    }

    /**
     * Define el valor de la propiedad modifyServiceResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyServiceResponseDataType }
     *     
     */
    public void setModifyServiceResponseData(ModifyServiceResponseDataType value) {
        this.modifyServiceResponseData = value;
    }

}
