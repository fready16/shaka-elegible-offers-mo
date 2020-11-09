
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para ValidateTokenFnFResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidateTokenFnFResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidateTokenFnFResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ValidateTokenFnFResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateTokenFnFResponse_type", propOrder = {
    "validateTokenFnFResponseData"
})
public class ValidateTokenFnFResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "ValidateTokenFnFResponse_data", required = true)
    protected ValidateTokenFnFResponseDataType validateTokenFnFResponseData;

    /**
     * Obtiene el valor de la propiedad validateTokenFnFResponseData.
     * 
     * @return
     *     possible object is
     *     {@link ValidateTokenFnFResponseDataType }
     *     
     */
    public ValidateTokenFnFResponseDataType getValidateTokenFnFResponseData() {
        return validateTokenFnFResponseData;
    }

    /**
     * Define el valor de la propiedad validateTokenFnFResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateTokenFnFResponseDataType }
     *     
     */
    public void setValidateTokenFnFResponseData(ValidateTokenFnFResponseDataType value) {
        this.validateTokenFnFResponseData = value;
    }

}
