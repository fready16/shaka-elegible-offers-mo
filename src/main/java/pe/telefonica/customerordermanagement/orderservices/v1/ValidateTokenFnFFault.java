
package pe.telefonica.customerordermanagement.orderservices.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.15
 * 2020-12-23T08:23:41.320-05:00
 * Generated source version: 3.1.15
 */

@WebFault(name = "ValidateTokenFnFFault", targetNamespace = "http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types")
public class ValidateTokenFnFFault extends Exception {
    
    private pe.telefonica.customerordermanagement.orderservices.v1.types.ValidateTokenFnFFault validateTokenFnFFault;

    public ValidateTokenFnFFault() {
        super();
    }
    
    public ValidateTokenFnFFault(String message) {
        super(message);
    }
    
    public ValidateTokenFnFFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ValidateTokenFnFFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.ValidateTokenFnFFault validateTokenFnFFault) {
        super(message);
        this.validateTokenFnFFault = validateTokenFnFFault;
    }

    public ValidateTokenFnFFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.ValidateTokenFnFFault validateTokenFnFFault, java.lang.Throwable cause) {
        super(message, cause);
        this.validateTokenFnFFault = validateTokenFnFFault;
    }

    public pe.telefonica.customerordermanagement.orderservices.v1.types.ValidateTokenFnFFault getFaultInfo() {
        return this.validateTokenFnFFault;
    }
}