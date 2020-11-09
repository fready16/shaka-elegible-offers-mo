
package com.telefonica.globalintegration.services.retrieveofferings.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para priceTypeProdAltType.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="priceTypeProdAltType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="recurring discount"/&amp;gt;
 *     &amp;lt;enumeration value="one time discount"/&amp;gt;
 *     &amp;lt;enumeration value="recurring allowance"/&amp;gt;
 *     &amp;lt;enumeration value="one time allowance"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "priceTypeProdAltType")
@XmlEnum
public enum PriceTypeProdAltType {

    @XmlEnumValue("recurring discount")
    RECURRING_DISCOUNT("recurring discount"),
    @XmlEnumValue("one time discount")
    ONE_TIME_DISCOUNT("one time discount"),
    @XmlEnumValue("recurring allowance")
    RECURRING_ALLOWANCE("recurring allowance"),
    @XmlEnumValue("one time allowance")
    ONE_TIME_ALLOWANCE("one time allowance");
    private final String value;

    PriceTypeProdAltType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceTypeProdAltType fromValue(String v) {
        for (PriceTypeProdAltType c: PriceTypeProdAltType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
