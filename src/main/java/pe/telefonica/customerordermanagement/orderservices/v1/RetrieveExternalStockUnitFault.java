
package pe.telefonica.customerordermanagement.orderservices.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-11-11T13:55:15.906-05:00
 * Generated source version: 3.4.0
 */

@WebFault(name = "RetrieveExternalStockUnitFault", targetNamespace = "http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types")
public class RetrieveExternalStockUnitFault extends Exception {

    private pe.telefonica.customerordermanagement.orderservices.v1.types.RetrieveExternalStockUnitFault retrieveExternalStockUnitFault;

    public RetrieveExternalStockUnitFault() {
        super();
    }

    public RetrieveExternalStockUnitFault(String message) {
        super(message);
    }

    public RetrieveExternalStockUnitFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public RetrieveExternalStockUnitFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.RetrieveExternalStockUnitFault retrieveExternalStockUnitFault) {
        super(message);
        this.retrieveExternalStockUnitFault = retrieveExternalStockUnitFault;
    }

    public RetrieveExternalStockUnitFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.RetrieveExternalStockUnitFault retrieveExternalStockUnitFault, java.lang.Throwable cause) {
        super(message, cause);
        this.retrieveExternalStockUnitFault = retrieveExternalStockUnitFault;
    }

    public pe.telefonica.customerordermanagement.orderservices.v1.types.RetrieveExternalStockUnitFault getFaultInfo() {
        return this.retrieveExternalStockUnitFault;
    }
}
