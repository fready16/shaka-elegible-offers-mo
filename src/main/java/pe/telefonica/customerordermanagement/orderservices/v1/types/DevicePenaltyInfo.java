
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Clase Java para DevicePenaltyInfo complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DevicePenaltyInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="deviceSapId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="20"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="commitmentEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="penaltyAmountWithTax" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="25"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="penaltyAmountWithoutTax" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="25"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="penaltyCurrency" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="10"/&amp;gt;
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
@XmlType(name = "DevicePenaltyInfo", propOrder = {
    "deviceSapId",
    "commitmentEndDate",
    "penaltyAmountWithTax",
    "penaltyAmountWithoutTax",
    "penaltyCurrency"
})
public class DevicePenaltyInfo {

    protected String deviceSapId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commitmentEndDate;
    protected String penaltyAmountWithTax;
    protected String penaltyAmountWithoutTax;
    protected String penaltyCurrency;

    /**
     * Obtiene el valor de la propiedad deviceSapId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSapId() {
        return deviceSapId;
    }

    /**
     * Define el valor de la propiedad deviceSapId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSapId(String value) {
        this.deviceSapId = value;
    }

    /**
     * Obtiene el valor de la propiedad commitmentEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitmentEndDate() {
        return commitmentEndDate;
    }

    /**
     * Define el valor de la propiedad commitmentEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitmentEndDate(XMLGregorianCalendar value) {
        this.commitmentEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad penaltyAmountWithTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAmountWithTax() {
        return penaltyAmountWithTax;
    }

    /**
     * Define el valor de la propiedad penaltyAmountWithTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyAmountWithTax(String value) {
        this.penaltyAmountWithTax = value;
    }

    /**
     * Obtiene el valor de la propiedad penaltyAmountWithoutTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAmountWithoutTax() {
        return penaltyAmountWithoutTax;
    }

    /**
     * Define el valor de la propiedad penaltyAmountWithoutTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyAmountWithoutTax(String value) {
        this.penaltyAmountWithoutTax = value;
    }

    /**
     * Obtiene el valor de la propiedad penaltyCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyCurrency() {
        return penaltyCurrency;
    }

    /**
     * Define el valor de la propiedad penaltyCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyCurrency(String value) {
        this.penaltyCurrency = value;
    }

}
