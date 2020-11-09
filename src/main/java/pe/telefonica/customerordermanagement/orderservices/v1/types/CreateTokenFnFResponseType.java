
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para CreateTokenFnFResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CreateTokenFnFResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CreateTokenFnFResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}CreateTokenFnFesponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTokenFnFResponse_type", propOrder = {
    "createTokenFnFResponseData"
})
public class CreateTokenFnFResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "CreateTokenFnFResponse_data", required = true)
    protected CreateTokenFnFesponseDataType createTokenFnFResponseData;

    /**
     * Obtiene el valor de la propiedad createTokenFnFResponseData.
     * 
     * @return
     *     possible object is
     *     {@link CreateTokenFnFesponseDataType }
     *     
     */
    public CreateTokenFnFesponseDataType getCreateTokenFnFResponseData() {
        return createTokenFnFResponseData;
    }

    /**
     * Define el valor de la propiedad createTokenFnFResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateTokenFnFesponseDataType }
     *     
     */
    public void setCreateTokenFnFResponseData(CreateTokenFnFesponseDataType value) {
        this.createTokenFnFResponseData = value;
    }

}
