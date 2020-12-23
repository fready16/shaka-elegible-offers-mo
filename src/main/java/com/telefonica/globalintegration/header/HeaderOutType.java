
package com.telefonica.globalintegration.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para HeaderOutType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="HeaderOutType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="originator" type="{http://telefonica.com/globalIntegration/header}originatorType"/&amp;gt;
 *         &amp;lt;element name="destination" type="{http://telefonica.com/globalIntegration/header}destinationType"/&amp;gt;
 *         &amp;lt;element name="pid" type="{http://telefonica.com/globalIntegration/header}pidType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="execId" type="{http://telefonica.com/globalIntegration/header}execIdType"/&amp;gt;
 *         &amp;lt;element name="msgId" type="{http://telefonica.com/globalIntegration/header}msgIdType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="timestamp" type="{http://telefonica.com/globalIntegration/header}timestampType"/&amp;gt;
 *         &amp;lt;element name="msgType" type="{http://telefonica.com/globalIntegration/header}msgTypeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="varArg" type="{http://telefonica.com/globalIntegration/header}varArgType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderOutType", propOrder = {
    "originator",
    "destination",
    "pid",
    "execId",
    "msgId",
    "timestamp",
    "msgType",
    "varArg"
})
public class HeaderOutType {

    @XmlElement(required = true)
    protected String originator;
    @XmlElement(required = true)
    protected String destination;
    protected String pid;
    @XmlElement(required = true)
    protected String execId;
    protected String msgId;
    @XmlElement(required = true)
    protected String timestamp;
    protected String msgType;
    protected VarArgType varArg;

    /**
     * Obtiene el valor de la propiedad originator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Define el valor de la propiedad originator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad pid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * Define el valor de la propiedad pid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

    /**
     * Obtiene el valor de la propiedad execId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecId() {
        return execId;
    }

    /**
     * Define el valor de la propiedad execId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecId(String value) {
        this.execId = value;
    }

    /**
     * Obtiene el valor de la propiedad msgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Define el valor de la propiedad msgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad msgType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Define el valor de la propiedad msgType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
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
