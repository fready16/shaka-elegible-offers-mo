
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para RetrieveFriendsAndFamilyNumbersRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveFriendsAndFamilyNumbersRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveFriendsAndFamilyNumbersRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveFriendsAndFamilyNumbersRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveFriendsAndFamilyNumbersRequest_type", propOrder = {
    "retrieveFriendsAndFamilyNumbersRequestData"
})
public class RetrieveFriendsAndFamilyNumbersRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "RetrieveFriendsAndFamilyNumbersRequest_data", required = true)
    protected RetrieveFriendsAndFamilyNumbersRequestDataType retrieveFriendsAndFamilyNumbersRequestData;

    /**
     * Obtiene el valor de la propiedad retrieveFriendsAndFamilyNumbersRequestData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveFriendsAndFamilyNumbersRequestDataType }
     *     
     */
    public RetrieveFriendsAndFamilyNumbersRequestDataType getRetrieveFriendsAndFamilyNumbersRequestData() {
        return retrieveFriendsAndFamilyNumbersRequestData;
    }

    /**
     * Define el valor de la propiedad retrieveFriendsAndFamilyNumbersRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveFriendsAndFamilyNumbersRequestDataType }
     *     
     */
    public void setRetrieveFriendsAndFamilyNumbersRequestData(RetrieveFriendsAndFamilyNumbersRequestDataType value) {
        this.retrieveFriendsAndFamilyNumbersRequestData = value;
    }

}
