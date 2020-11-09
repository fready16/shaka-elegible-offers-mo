
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para AllowedActionEnum.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AllowedActionEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="RM"/&amp;gt;
 *     &amp;lt;enumeration value="SU"/&amp;gt;
 *     &amp;lt;enumeration value="RS"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AllowedActionEnum")
@XmlEnum
public enum AllowedActionEnum {

    RM,
    SU,
    RS;

    public String value() {
        return name();
    }

    public static AllowedActionEnum fromValue(String v) {
        return valueOf(v);
    }

}