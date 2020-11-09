
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para RetrieveCommitmentPenaltyResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveCommitmentPenaltyResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveCommitmentPenaltyResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveCommitmentPenaltyResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveCommitmentPenaltyResponse_type", propOrder = {
    "retrieveCommitmentPenaltyResponseData"
})
public class RetrieveCommitmentPenaltyResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "RetrieveCommitmentPenaltyResponse_data", required = true)
    protected RetrieveCommitmentPenaltyResponseDataType retrieveCommitmentPenaltyResponseData;

    /**
     * Obtiene el valor de la propiedad retrieveCommitmentPenaltyResponseData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveCommitmentPenaltyResponseDataType }
     *     
     */
    public RetrieveCommitmentPenaltyResponseDataType getRetrieveCommitmentPenaltyResponseData() {
        return retrieveCommitmentPenaltyResponseData;
    }

    /**
     * Define el valor de la propiedad retrieveCommitmentPenaltyResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveCommitmentPenaltyResponseDataType }
     *     
     */
    public void setRetrieveCommitmentPenaltyResponseData(RetrieveCommitmentPenaltyResponseDataType value) {
        this.retrieveCommitmentPenaltyResponseData = value;
    }

}
