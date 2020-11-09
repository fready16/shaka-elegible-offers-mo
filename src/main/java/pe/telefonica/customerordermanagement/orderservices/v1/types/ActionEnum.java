
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para ActionEnum.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ActionEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SU"/&amp;gt;
 *     &amp;lt;enumeration value="RE"/&amp;gt;
 *     &amp;lt;enumeration value="CE"/&amp;gt;
 *     &amp;lt;enumeration value="LS"/&amp;gt;
 *     &amp;lt;enumeration value="RL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ActionEnum")
@XmlEnum
public enum ActionEnum {

    SU,
    RE,
    CE,
    LS,
    RL;

    public String value() {
        return name();
    }

    public static ActionEnum fromValue(String v) {
        return valueOf(v);
    }

}
