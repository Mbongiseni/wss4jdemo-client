package za.co.fnb.ws.client;

import static org.junit.Assert.assertTrue;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.co.fnb.ws.CalculatorFacadeService;
import za.co.fnb.ws.CalculatorService;
import za.co.fnb.ws.SumRequest;
import za.co.fnb.ws.SumResponse;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class TestCalculatorService
{
    String wsdlUrl;
    URL url;
    CalculatorFacadeService service;
    CalculatorService port;
    Client client;
    Endpoint endpoint;


    @Before
    public void setUpClient() throws MalformedURLException {
        wsdlUrl = "http://localhost:8080/calculator-service/service?wsdl";
        url = new URL (wsdlUrl);
        service = new CalculatorFacadeService(url);
        port = service.getCalculatorServicePort();
        client = ClientProxy.getClient(port);
        endpoint = client.getEndpoint();
    }
    
    @Test
    public void shouldAnswerWithTrue()
    {
        SumRequest request = new SumRequest();
        request.setNum1(10);
        request.setNum2(20);
        SumResponse sumResponse = port.calculateSum(request);
        Assert.assertTrue(sumResponse.getSum() == 30);
    }
}
