
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para ServiceSpecCharacteristic complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ServiceSpecCharacteristic"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="valueType" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}valueTypeEnum"/&amp;gt;
 *         &amp;lt;element name="classification" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ClassificationTypeEnum"/&amp;gt;
 *         &amp;lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="validValueList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ValidValueList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rangeList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}rangeList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSpecCharacteristic", propOrder = {
    "name",
    "valueType",
    "classification",
    "size",
    "validValueList",
    "rangeList"
})
public class ServiceSpecCharacteristic {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ValueTypeEnum valueType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ClassificationTypeEnum classification;
    protected int size;
    protected ValidValueList validValueList;
    protected RangeList rangeList;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad valueType.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeEnum }
     *     
     */
    public ValueTypeEnum getValueType() {
        return valueType;
    }

    /**
     * Define el valor de la propiedad valueType.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeEnum }
     *     
     */
    public void setValueType(ValueTypeEnum value) {
        this.valueType = value;
    }

    /**
     * Obtiene el valor de la propiedad classification.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationTypeEnum }
     *     
     */
    public ClassificationTypeEnum getClassification() {
        return classification;
    }

    /**
     * Define el valor de la propiedad classification.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationTypeEnum }
     *     
     */
    public void setClassification(ClassificationTypeEnum value) {
        this.classification = value;
    }

    /**
     * Obtiene el valor de la propiedad size.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    /**
     * Obtiene el valor de la propiedad validValueList.
     * 
     * @return
     *     possible object is
     *     {@link ValidValueList }
     *     
     */
    public ValidValueList getValidValueList() {
        return validValueList;
    }

    /**
     * Define el valor de la propiedad validValueList.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidValueList }
     *     
     */
    public void setValidValueList(ValidValueList value) {
        this.validValueList = value;
    }

    /**
     * Obtiene el valor de la propiedad rangeList.
     * 
     * @return
     *     possible object is
     *     {@link RangeList }
     *     
     */
    public RangeList getRangeList() {
        return rangeList;
    }

    /**
     * Define el valor de la propiedad rangeList.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeList }
     *     
     */
    public void setRangeList(RangeList value) {
        this.rangeList = value;
    }

}
