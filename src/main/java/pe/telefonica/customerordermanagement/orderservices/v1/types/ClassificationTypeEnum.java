
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para ClassificationTypeEnum.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ClassificationTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="General"/&amp;gt;
 *     &amp;lt;enumeration value="Discrete"/&amp;gt;
 *     &amp;lt;enumeration value="Range"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ClassificationTypeEnum")
@XmlEnum
public enum ClassificationTypeEnum {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Discrete")
    DISCRETE("Discrete"),
    @XmlEnumValue("Range")
    RANGE("Range");
    private final String value;

    ClassificationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassificationTypeEnum fromValue(String v) {
        for (ClassificationTypeEnum c: ClassificationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
