
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para AddOrRemoveBillingOfferRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AddOrRemoveBillingOfferRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AddOrRemoveBillingOfferRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}AddOrRemoveBillingOfferRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrRemoveBillingOfferRequest_type", propOrder = {
    "addOrRemoveBillingOfferRequestData"
})
public class AddOrRemoveBillingOfferRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "AddOrRemoveBillingOfferRequest_data", required = true)
    protected AddOrRemoveBillingOfferRequestDataType addOrRemoveBillingOfferRequestData;

    /**
     * Obtiene el valor de la propiedad addOrRemoveBillingOfferRequestData.
     * 
     * @return
     *     possible object is
     *     {@link AddOrRemoveBillingOfferRequestDataType }
     *     
     */
    public AddOrRemoveBillingOfferRequestDataType getAddOrRemoveBillingOfferRequestData() {
        return addOrRemoveBillingOfferRequestData;
    }

    /**
     * Define el valor de la propiedad addOrRemoveBillingOfferRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrRemoveBillingOfferRequestDataType }
     *     
     */
    public void setAddOrRemoveBillingOfferRequestData(AddOrRemoveBillingOfferRequestDataType value) {
        this.addOrRemoveBillingOfferRequestData = value;
    }

}
