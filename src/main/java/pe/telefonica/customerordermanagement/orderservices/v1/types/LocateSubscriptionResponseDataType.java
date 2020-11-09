
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para LocateSubscriptionResponse_data_type complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="LocateSubscriptionResponse_data_type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="numbers" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}NumbersList"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocateSubscriptionResponse_data_type", propOrder = {
    "numbers"
})
public class LocateSubscriptionResponseDataType {

    @XmlElement(required = true)
    protected NumbersList numbers;

    /**
     * Obtiene el valor de la propiedad numbers.
     * 
     * @return
     *     possible object is
     *     {@link NumbersList }
     *     
     */
    public NumbersList getNumbers() {
        return numbers;
    }

    /**
     * Define el valor de la propiedad numbers.
     * 
     * @param value
     *     allowed object is
     *     {@link NumbersList }
     *     
     */
    public void setNumbers(NumbersList value) {
        this.numbers = value;
    }

}
