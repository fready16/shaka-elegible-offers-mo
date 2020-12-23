
package com.telefonica.globalintegration.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para appDetailType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="appDetailType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="exceptionAppCode" type="{http://telefonica.com/globalIntegration/fault}exceptionAppCodeType"/&amp;gt;
 *         &amp;lt;element name="exceptionAppMessage" type="{http://telefonica.com/globalIntegration/fault}exceptionAppMessageType"/&amp;gt;
 *         &amp;lt;element name="exceptionAppLocation" type="{http://telefonica.com/globalIntegration/fault}exceptionAppLocationType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="exceptionAppCause" type="{http://telefonica.com/globalIntegration/fault}exceptionAppCauseType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="varArg" type="{http://telefonica.com/globalIntegration/fault}varArgType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appDetailType", propOrder = {
    "exceptionAppCode",
    "exceptionAppMessage",
    "exceptionAppLocation",
    "exceptionAppCause",
    "varArg"
})
public class AppDetailType {

    @XmlElement(required = true)
    protected String exceptionAppCode;
    @XmlElement(required = true)
    protected String exceptionAppMessage;
    protected String exceptionAppLocation;
    protected String exceptionAppCause;
    protected VarArgType varArg;

    /**
     * Obtiene el valor de la propiedad exceptionAppCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionAppCode() {
        return exceptionAppCode;
    }

    /**
     * Define el valor de la propiedad exceptionAppCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionAppCode(String value) {
        this.exceptionAppCode = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionAppMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionAppMessage() {
        return exceptionAppMessage;
    }

    /**
     * Define el valor de la propiedad exceptionAppMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionAppMessage(String value) {
        this.exceptionAppMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionAppLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionAppLocation() {
        return exceptionAppLocation;
    }

    /**
     * Define el valor de la propiedad exceptionAppLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionAppLocation(String value) {
        this.exceptionAppLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionAppCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionAppCause() {
        return exceptionAppCause;
    }

    /**
     * Define el valor de la propiedad exceptionAppCause.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionAppCause(String value) {
        this.exceptionAppCause = value;
    }

    /**
     * Obtiene el valor de la propiedad varArg.
     * 
     * @return
     *     possible object is
     *     {@link VarArgType }
     *     
     */
    public VarArgType getVarArg() {
        return varArg;
    }

    /**
     * Define el valor de la propiedad varArg.
     * 
     * @param value
     *     allowed object is
     *     {@link VarArgType }
     *     
     */
    public void setVarArg(VarArgType value) {
        this.varArg = value;
    }

}
