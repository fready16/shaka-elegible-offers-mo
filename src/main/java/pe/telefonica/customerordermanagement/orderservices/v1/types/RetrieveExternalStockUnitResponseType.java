
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * &lt;p&gt;Clase Java para RetrieveExternalStockUnitResponse_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RetrieveExternalStockUnitResponse_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RetrieveExternalStockUnitResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveExternalStockUnitResponse_data_type"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveExternalStockUnitResponse_type", propOrder = {
    "retrieveExternalStockUnitResponseData"
})
public class RetrieveExternalStockUnitResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "RetrieveExternalStockUnitResponse_data", required = true)
    protected RetrieveExternalStockUnitResponseDataType retrieveExternalStockUnitResponseData;

    /**
     * Obtiene el valor de la propiedad retrieveExternalStockUnitResponseData.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveExternalStockUnitResponseDataType }
     *     
     */
    public RetrieveExternalStockUnitResponseDataType getRetrieveExternalStockUnitResponseData() {
        return retrieveExternalStockUnitResponseData;
    }

    /**
     * Define el valor de la propiedad retrieveExternalStockUnitResponseData.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveExternalStockUnitResponseDataType }
     *     
     */
    public void setRetrieveExternalStockUnitResponseData(RetrieveExternalStockUnitResponseDataType value) {
        this.retrieveExternalStockUnitResponseData = value;
    }

}
