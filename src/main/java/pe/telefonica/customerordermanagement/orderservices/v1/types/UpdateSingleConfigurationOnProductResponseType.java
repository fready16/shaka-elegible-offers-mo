
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para UpdateSingleConfigurationOnProductResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UpdateSingleConfigurationOnProductResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UpdateSingleConfigurationOnProductResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}UpdateSingleConfigurationOnProductResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSingleConfigurationOnProductResponse_type", propOrder = {
    "updateSingleConfigurationOnProductResponseData"
})
public class UpdateSingleConfigurationOnProductResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "UpdateSingleConfigurationOnProductResponse_data", required = true)
    protected UpdateSingleConfigurationOnProductResponseDataType updateSingleConfigurationOnProductResponseData;

    /**
     * Obtiene el valor de la propiedad updateSingleConfigurationOnProductResponseData.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSingleConfigurationOnProductResponseDataType }
     *     
     */
    public UpdateSingleConfigurationOnProductResponseDataType getUpdateSingleConfigurationOnProductResponseData() {
        return updateSingleConfigurationOnProductResponseData;
    }

    /**
     * Define el valor de la propiedad updateSingleConfigurationOnProductResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSingleConfigurationOnProductResponseDataType }
     *     
     */
    public void setUpdateSingleConfigurationOnProductResponseData(UpdateSingleConfigurationOnProductResponseDataType value) {
        this.updateSingleConfigurationOnProductResponseData = value;
    }

}
