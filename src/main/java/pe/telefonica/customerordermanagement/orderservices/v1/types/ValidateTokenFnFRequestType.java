
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para ValidateTokenFnFRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidateTokenFnFRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidateTokenFnFRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ValidateTokenFnFRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateTokenFnFRequest_type", propOrder = {
    "validateTokenFnFRequestData"
})
public class ValidateTokenFnFRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "ValidateTokenFnFRequest_data", required = true)
    protected ValidateTokenFnFRequestDataType validateTokenFnFRequestData;

    /**
     * Obtiene el valor de la propiedad validateTokenFnFRequestData.
     * 
     * @return
     *     possible object is
     *     {@link ValidateTokenFnFRequestDataType }
     *     
     */
    public ValidateTokenFnFRequestDataType getValidateTokenFnFRequestData() {
        return validateTokenFnFRequestData;
    }

    /**
     * Define el valor de la propiedad validateTokenFnFRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateTokenFnFRequestDataType }
     *     
     */
    public void setValidateTokenFnFRequestData(ValidateTokenFnFRequestDataType value) {
        this.validateTokenFnFRequestData = value;
    }

}
