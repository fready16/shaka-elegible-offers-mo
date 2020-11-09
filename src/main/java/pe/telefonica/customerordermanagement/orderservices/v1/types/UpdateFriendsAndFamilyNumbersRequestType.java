
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para UpdateFriendsAndFamilyNumbersRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UpdateFriendsAndFamilyNumbersRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UpdateFriendsAndFamilyNumbersRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}UpdateFriendsAndFamilyNumbersRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFriendsAndFamilyNumbersRequest_type", propOrder = {
    "updateFriendsAndFamilyNumbersRequestData"
})
public class UpdateFriendsAndFamilyNumbersRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "UpdateFriendsAndFamilyNumbersRequest_data", required = true)
    protected UpdateFriendsAndFamilyNumbersRequestDataType updateFriendsAndFamilyNumbersRequestData;

    /**
     * Obtiene el valor de la propiedad updateFriendsAndFamilyNumbersRequestData.
     * 
     * @return
     *     possible object is
     *     {@link UpdateFriendsAndFamilyNumbersRequestDataType }
     *     
     */
    public UpdateFriendsAndFamilyNumbersRequestDataType getUpdateFriendsAndFamilyNumbersRequestData() {
        return updateFriendsAndFamilyNumbersRequestData;
    }

    /**
     * Define el valor de la propiedad updateFriendsAndFamilyNumbersRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateFriendsAndFamilyNumbersRequestDataType }
     *     
     */
    public void setUpdateFriendsAndFamilyNumbersRequestData(UpdateFriendsAndFamilyNumbersRequestDataType value) {
        this.updateFriendsAndFamilyNumbersRequestData = value;
    }

}
