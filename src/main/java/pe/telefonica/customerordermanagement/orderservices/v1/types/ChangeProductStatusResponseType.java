
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para ChangeProductStatusResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChangeProductStatusResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ChangeProductStatusResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ChangeProductStatusResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeProductStatusResponse_type", propOrder = {
    "changeProductStatusResponseData"
})
public class ChangeProductStatusResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "ChangeProductStatusResponse_data", required = true)
    protected ChangeProductStatusResponseDataType changeProductStatusResponseData;

    /**
     * Obtiene el valor de la propiedad changeProductStatusResponseData.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProductStatusResponseDataType }
     *     
     */
    public ChangeProductStatusResponseDataType getChangeProductStatusResponseData() {
        return changeProductStatusResponseData;
    }

    /**
     * Define el valor de la propiedad changeProductStatusResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProductStatusResponseDataType }
     *     
     */
    public void setChangeProductStatusResponseData(ChangeProductStatusResponseDataType value) {
        this.changeProductStatusResponseData = value;
    }

}
