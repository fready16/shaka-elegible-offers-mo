
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para RetrieveFriendsAndFamilyNumbersResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveFriendsAndFamilyNumbersResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveFriendsAndFamilyNumbersResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveFriendsAndFamilyNumbersResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveFriendsAndFamilyNumbersResponse_type", propOrder = {
    "retrieveFriendsAndFamilyNumbersResponseData"
})
public class RetrieveFriendsAndFamilyNumbersResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "RetrieveFriendsAndFamilyNumbersResponse_data", required = true)
    protected RetrieveFriendsAndFamilyNumbersResponseDataType retrieveFriendsAndFamilyNumbersResponseData;

    /**
     * Obtiene el valor de la propiedad retrieveFriendsAndFamilyNumbersResponseData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveFriendsAndFamilyNumbersResponseDataType }
     *     
     */
    public RetrieveFriendsAndFamilyNumbersResponseDataType getRetrieveFriendsAndFamilyNumbersResponseData() {
        return retrieveFriendsAndFamilyNumbersResponseData;
    }

    /**
     * Define el valor de la propiedad retrieveFriendsAndFamilyNumbersResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveFriendsAndFamilyNumbersResponseDataType }
     *     
     */
    public void setRetrieveFriendsAndFamilyNumbersResponseData(RetrieveFriendsAndFamilyNumbersResponseDataType value) {
        this.retrieveFriendsAndFamilyNumbersResponseData = value;
    }

}
