package za.co.fnb.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2020-01-31T15:05:25.213+02:00
 * Generated source version: 3.1.9
 * 
 */
@WebService(targetNamespace = "http://ws.fnb.co.za/", name = "CalculatorService")
@XmlSeeAlso({ObjectFactory.class})
public interface CalculatorService {

    @WebMethod
    @RequestWrapper(localName = "calculateSum", targetNamespace = "http://ws.fnb.co.za/", className = "za.co.fnb.ws.CalculateSum")
    @ResponseWrapper(localName = "calculateSumResponse", targetNamespace = "http://ws.fnb.co.za/", className = "za.co.fnb.ws.CalculateSumResponse")
    @WebResult(name = "sumResults", targetNamespace = "")
    public za.co.fnb.ws.SumResponse calculateSum(
        @WebParam(name = "sumRequest", targetNamespace = "")
        za.co.fnb.ws.SumRequest sumRequest
    );
}
