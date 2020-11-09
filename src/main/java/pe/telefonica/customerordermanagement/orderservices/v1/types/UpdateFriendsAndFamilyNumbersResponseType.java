
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para UpdateFriendsAndFamilyNumbersResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UpdateFriendsAndFamilyNumbersResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UpdateFriendsAndFamilyNumbersResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}UpdateFriendsAndFamilyNumbersResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFriendsAndFamilyNumbersResponse_type", propOrder = {
    "updateFriendsAndFamilyNumbersResponseData"
})
public class UpdateFriendsAndFamilyNumbersResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "UpdateFriendsAndFamilyNumbersResponse_data", required = true)
    protected UpdateFriendsAndFamilyNumbersResponseDataType updateFriendsAndFamilyNumbersResponseData;

    /**
     * Obtiene el valor de la propiedad updateFriendsAndFamilyNumbersResponseData.
     * 
     * @return
     *     possible object is
     *     {@link UpdateFriendsAndFamilyNumbersResponseDataType }
     *     
     */
    public UpdateFriendsAndFamilyNumbersResponseDataType getUpdateFriendsAndFamilyNumbersResponseData() {
        return updateFriendsAndFamilyNumbersResponseData;
    }

    /**
     * Define el valor de la propiedad updateFriendsAndFamilyNumbersResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateFriendsAndFamilyNumbersResponseDataType }
     *     
     */
    public void setUpdateFriendsAndFamilyNumbersResponseData(UpdateFriendsAndFamilyNumbersResponseDataType value) {
        this.updateFriendsAndFamilyNumbersResponseData = value;
    }

}
