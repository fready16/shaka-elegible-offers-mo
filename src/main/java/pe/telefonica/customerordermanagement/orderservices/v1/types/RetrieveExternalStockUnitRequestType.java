
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefrequestheader.v1.TefHeaderReq;


/**
 * &lt;p&gt;Clase Java para RetrieveExternalStockUnitRequest_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveExternalStockUnitRequest_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefRequestHeader/V1}TefHeaderReq"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveExternalStockUnitRequest_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveExternalStockUnitRequest_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveExternalStockUnitRequest_type", propOrder = {
    "retrieveExternalStockUnitRequestData"
})
public class RetrieveExternalStockUnitRequestType
    extends TefHeaderReq
{

    @XmlElement(name = "RetrieveExternalStockUnitRequest_data", required = true)
    protected RetrieveExternalStockUnitRequestDataType retrieveExternalStockUnitRequestData;

    /**
     * Obtiene el valor de la propiedad retrieveExternalStockUnitRequestData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveExternalStockUnitRequestDataType }
     *     
     */
    public RetrieveExternalStockUnitRequestDataType getRetrieveExternalStockUnitRequestData() {
        return retrieveExternalStockUnitRequestData;
    }

    /**
     * Define el valor de la propiedad retrieveExternalStockUnitRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveExternalStockUnitRequestDataType }
     *     
     */
    public void setRetrieveExternalStockUnitRequestData(RetrieveExternalStockUnitRequestDataType value) {
        this.retrieveExternalStockUnitRequestData = value;
    }

}
