
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para RetrieveFriendsAndFamilyNumbersResponse_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveFriendsAndFamilyNumbersResponse_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="response" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}Response"/&amp;gt;
 *         &amp;lt;element name="friendsAndFamilyDetailsList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}FNFDetailsList"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveFriendsAndFamilyNumbersResponse_data_type", propOrder = {
    "response",
    "friendsAndFamilyDetailsList"
})
public class RetrieveFriendsAndFamilyNumbersResponseDataType {

    @XmlElement(required = true)
    protected Response response;
    @XmlElement(required = true)
    protected FNFDetailsList friendsAndFamilyDetailsList;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Obtiene el valor de la propiedad friendsAndFamilyDetailsList.
     * 
     * @return
     *     possible object is
     *     {@link FNFDetailsList }
     *     
     */
    public FNFDetailsList getFriendsAndFamilyDetailsList() {
        return friendsAndFamilyDetailsList;
    }

    /**
     * Define el valor de la propiedad friendsAndFamilyDetailsList.
     * 
     * @param value
     *     allowed object is
     *     {@link FNFDetailsList }
     *     
     */
    public void setFriendsAndFamilyDetailsList(FNFDetailsList value) {
        this.friendsAndFamilyDetailsList = value;
    }

}
