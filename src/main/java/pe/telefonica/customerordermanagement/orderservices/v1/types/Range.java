
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para Range complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Range"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="lowerValue" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}Quantity"/&amp;gt;
 *         &amp;lt;element name="upperValue" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}Quantity"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Range", propOrder = {
    "lowerValue",
    "upperValue"
})
public class Range {

    @XmlElement(required = true)
    protected Quantity lowerValue;
    @XmlElement(required = true)
    protected Quantity upperValue;

    /**
     * Obtiene el valor de la propiedad lowerValue.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getLowerValue() {
        return lowerValue;
    }

    /**
     * Define el valor de la propiedad lowerValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setLowerValue(Quantity value) {
        this.lowerValue = value;
    }

    /**
     * Obtiene el valor de la propiedad upperValue.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getUpperValue() {
        return upperValue;
    }

    /**
     * Define el valor de la propiedad upperValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setUpperValue(Quantity value) {
        this.upperValue = value;
    }

}
