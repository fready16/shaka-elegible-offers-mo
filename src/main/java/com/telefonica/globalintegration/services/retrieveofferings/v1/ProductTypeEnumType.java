
package com.telefonica.globalintegration.services.retrieveofferings.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para productTypeEnumType.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="productTypeEnumType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="mobile"/&amp;gt;
 *     &amp;lt;enumeration value="landline"/&amp;gt;
 *     &amp;lt;enumeration value="ipTv"/&amp;gt;
 *     &amp;lt;enumeration value="cableTv"/&amp;gt;
 *     &amp;lt;enumeration value="email"/&amp;gt;
 *     &amp;lt;enumeration value="broadband"/&amp;gt;
 *     &amp;lt;enumeration value="bundle"/&amp;gt;
 *     &amp;lt;enumeration value="sva"/&amp;gt;
 *     &amp;lt;enumeration value="sim"/&amp;gt;
 *     &amp;lt;enumeration value="ShEq"/&amp;gt;
 *     &amp;lt;enumeration value="bolton"/&amp;gt;
 *     &amp;lt;enumeration value="dth"/&amp;gt;
 *     &amp;lt;enumeration value="streamingTv"/&amp;gt;
 *     &amp;lt;enumeration value="accessories"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "productTypeEnumType")
@XmlEnum
public enum ProductTypeEnumType {

    @XmlEnumValue("mobile")
    MOBILE("mobile"),
    @XmlEnumValue("landline")
    LANDLINE("landline"),
    @XmlEnumValue("ipTv")
    IP_TV("ipTv"),
    @XmlEnumValue("cableTv")
    CABLE_TV("cableTv"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("broadband")
    BROADBAND("broadband"),
    @XmlEnumValue("bundle")
    BUNDLE("bundle"),
    @XmlEnumValue("sva")
    SVA("sva"),
    @XmlEnumValue("sim")
    SIM("sim"),
    @XmlEnumValue("ShEq")
    SH_EQ("ShEq"),
    @XmlEnumValue("bolton")
    BOLTON("bolton"),
    @XmlEnumValue("dth")
    DTH("dth"),
    @XmlEnumValue("streamingTv")
    STREAMING_TV("streamingTv"),
    @XmlEnumValue("accessories")
    ACCESSORIES("accessories");
    private final String value;

    ProductTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductTypeEnumType fromValue(String v) {
        for (ProductTypeEnumType c: ProductTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
