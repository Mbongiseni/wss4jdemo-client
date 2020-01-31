
package za.co.fnb.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateSum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateSum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sumRequest" type="{http://ws.fnb.co.za/}SumRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateSum", propOrder = {
    "sumRequest"
})
public class CalculateSum {

    protected SumRequest sumRequest;

    /**
     * Gets the value of the sumRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SumRequest }
     *     
     */
    public SumRequest getSumRequest() {
        return sumRequest;
    }

    /**
     * Sets the value of the sumRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumRequest }
     *     
     */
    public void setSumRequest(SumRequest value) {
        this.sumRequest = value;
    }

}
