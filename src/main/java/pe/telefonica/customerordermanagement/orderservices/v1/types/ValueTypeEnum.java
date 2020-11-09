
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para valueTypeEnum.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="valueTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Boolean"/&amp;gt;
 *     &amp;lt;enumeration value="Char"/&amp;gt;
 *     &amp;lt;enumeration value="Double"/&amp;gt;
 *     &amp;lt;enumeration value="Date"/&amp;gt;
 *     &amp;lt;enumeration value="Numeric"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "valueTypeEnum")
@XmlEnum
public enum ValueTypeEnum {

    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Char")
    CHAR("Char"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric");
    private final String value;

    ValueTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueTypeEnum fromValue(String v) {
        for (ValueTypeEnum c: ValueTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
