
package pe.telefonica.customerordermanagement.orderservices.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-11-11T13:55:15.586-05:00
 * Generated source version: 3.4.0
 */

@WebFault(name = "RequestSVADeactivationFault", targetNamespace = "http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types")
public class RequestSVADeactivationFault extends Exception {

    private pe.telefonica.customerordermanagement.orderservices.v1.types.RequestSVADeactivationFault requestSVADeactivationFault;

    public RequestSVADeactivationFault() {
        super();
    }

    public RequestSVADeactivationFault(String message) {
        super(message);
    }

    public RequestSVADeactivationFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public RequestSVADeactivationFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.RequestSVADeactivationFault requestSVADeactivationFault) {
        super(message);
        this.requestSVADeactivationFault = requestSVADeactivationFault;
    }

    public RequestSVADeactivationFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.RequestSVADeactivationFault requestSVADeactivationFault, java.lang.Throwable cause) {
        super(message, cause);
        this.requestSVADeactivationFault = requestSVADeactivationFault;
    }

    public pe.telefonica.customerordermanagement.orderservices.v1.types.RequestSVADeactivationFault getFaultInfo() {
        return this.requestSVADeactivationFault;
    }
}
