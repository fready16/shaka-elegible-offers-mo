
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para CreateTokenFnFRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CreateTokenFnFRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CreateTokenFnFRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}CreateTokenFnFRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTokenFnFRequest_type", propOrder = {
    "createTokenFnFRequestData"
})
public class CreateTokenFnFRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "CreateTokenFnFRequest_data", required = true)
    protected CreateTokenFnFRequestDataType createTokenFnFRequestData;

    /**
     * Obtiene el valor de la propiedad createTokenFnFRequestData.
     * 
     * @return
     *     possible object is
     *     {@link CreateTokenFnFRequestDataType }
     *     
     */
    public CreateTokenFnFRequestDataType getCreateTokenFnFRequestData() {
        return createTokenFnFRequestData;
    }

    /**
     * Define el valor de la propiedad createTokenFnFRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateTokenFnFRequestDataType }
     *     
     */
    public void setCreateTokenFnFRequestData(CreateTokenFnFRequestDataType value) {
        this.createTokenFnFRequestData = value;
    }

}
