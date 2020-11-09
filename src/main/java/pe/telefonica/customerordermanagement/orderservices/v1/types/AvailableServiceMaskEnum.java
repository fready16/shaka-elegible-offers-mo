
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para AvailableServiceMaskEnum.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AvailableServiceMaskEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NONE"/&amp;gt;
 *     &amp;lt;enumeration value="SERVICE_ONLY"/&amp;gt;
 *     &amp;lt;enumeration value="SERVICE_AND_ATTRIBUTES_FOR_MODIFICATION"/&amp;gt;
 *     &amp;lt;enumeration value="SERVICE_AND_ATTRIBUTES_FOR_READONLY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AvailableServiceMaskEnum")
@XmlEnum
public enum AvailableServiceMaskEnum {

    NONE,
    SERVICE_ONLY,
    SERVICE_AND_ATTRIBUTES_FOR_MODIFICATION,
    SERVICE_AND_ATTRIBUTES_FOR_READONLY;

    public String value() {
        return name();
    }

    public static AvailableServiceMaskEnum fromValue(String v) {
        return valueOf(v);
    }

}
