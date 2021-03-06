
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceCharacteristicValueList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServiceCharacteristicValueList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceCharacteristicValue" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ServiceCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCharacteristicValueList", propOrder = {
    "serviceCharacteristicValue"
})
public class ServiceCharacteristicValueList {

    protected List<ServiceCharacteristicValue> serviceCharacteristicValue;

    /**
     * Gets the value of the serviceCharacteristicValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCharacteristicValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCharacteristicValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCharacteristicValue }
     * 
     * 
     */
    public List<ServiceCharacteristicValue> getServiceCharacteristicValue() {
        if (serviceCharacteristicValue == null) {
            serviceCharacteristicValue = new ArrayList<ServiceCharacteristicValue>();
        }
        return this.serviceCharacteristicValue;
    }

}
