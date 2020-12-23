
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TelephoneNumberFNFList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumberFNFList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="telephoneNumberFNF" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}TelephoneNumberFNF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumberFNFList", propOrder = {
    "telephoneNumberFNF"
})
public class TelephoneNumberFNFList {

    protected List<TelephoneNumberFNF> telephoneNumberFNF;

    /**
     * Gets the value of the telephoneNumberFNF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumberFNF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumberFNF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneNumberFNF }
     * 
     * 
     */
    public List<TelephoneNumberFNF> getTelephoneNumberFNF() {
        if (telephoneNumberFNF == null) {
            telephoneNumberFNF = new ArrayList<TelephoneNumberFNF>();
        }
        return this.telephoneNumberFNF;
    }

}
