
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para RetrieveCommitmentPenaltyRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveCommitmentPenaltyRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveCommitmentPenaltyRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveCommitmentPenaltyRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveCommitmentPenaltyRequest_type", propOrder = {
    "retrieveCommitmentPenaltyRequestData"
})
public class RetrieveCommitmentPenaltyRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "RetrieveCommitmentPenaltyRequest_data", required = true)
    protected RetrieveCommitmentPenaltyRequestDataType retrieveCommitmentPenaltyRequestData;

    /**
     * Obtiene el valor de la propiedad retrieveCommitmentPenaltyRequestData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveCommitmentPenaltyRequestDataType }
     *     
     */
    public RetrieveCommitmentPenaltyRequestDataType getRetrieveCommitmentPenaltyRequestData() {
        return retrieveCommitmentPenaltyRequestData;
    }

    /**
     * Define el valor de la propiedad retrieveCommitmentPenaltyRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveCommitmentPenaltyRequestDataType }
     *     
     */
    public void setRetrieveCommitmentPenaltyRequestData(RetrieveCommitmentPenaltyRequestDataType value) {
        this.retrieveCommitmentPenaltyRequestData = value;
    }

}
