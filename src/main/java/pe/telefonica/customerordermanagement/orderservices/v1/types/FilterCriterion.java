
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para FilterCriterion complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FilterCriterion"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="closeParenNumber" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="fieldname"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="isLogicalAnd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="openParenNumber" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="operator"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="15"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="otherValue" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="value"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="valueDataType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="6"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterCriterion", propOrder = {
    "closeParenNumber",
    "fieldname",
    "isLogicalAnd",
    "openParenNumber",
    "operator",
    "otherValue",
    "value",
    "valueDataType"
})
public class FilterCriterion {

    protected BigInteger closeParenNumber;
    @XmlElement(required = true)
    protected String fieldname;
    protected boolean isLogicalAnd;
    protected BigInteger openParenNumber;
    @XmlElement(required = true)
    protected String operator;
    protected String otherValue;
    @XmlElement(required = true)
    protected String value;
    protected String valueDataType;

    /**
     * Obtiene el valor de la propiedad closeParenNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCloseParenNumber() {
        return closeParenNumber;
    }

    /**
     * Define el valor de la propiedad closeParenNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCloseParenNumber(BigInteger value) {
        this.closeParenNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldname() {
        return fieldname;
    }

    /**
     * Define el valor de la propiedad fieldname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldname(String value) {
        this.fieldname = value;
    }

    /**
     * Obtiene el valor de la propiedad isLogicalAnd.
     * 
     */
    public boolean isIsLogicalAnd() {
        return isLogicalAnd;
    }

    /**
     * Define el valor de la propiedad isLogicalAnd.
     * 
     */
    public void setIsLogicalAnd(boolean value) {
        this.isLogicalAnd = value;
    }

    /**
     * Obtiene el valor de la propiedad openParenNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenParenNumber() {
        return openParenNumber;
    }

    /**
     * Define el valor de la propiedad openParenNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenParenNumber(BigInteger value) {
        this.openParenNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Define el valor de la propiedad operator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Obtiene el valor de la propiedad otherValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherValue() {
        return otherValue;
    }

    /**
     * Define el valor de la propiedad otherValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherValue(String value) {
        this.otherValue = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad valueDataType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDataType() {
        return valueDataType;
    }

    /**
     * Define el valor de la propiedad valueDataType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDataType(String value) {
        this.valueDataType = value;
    }

}
