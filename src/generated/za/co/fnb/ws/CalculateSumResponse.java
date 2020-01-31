
package za.co.fnb.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateSumResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateSumResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sumResults" type="{http://ws.fnb.co.za/}SumResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateSumResponse", propOrder = {
    "sumResults"
})
public class CalculateSumResponse {

    protected SumResponse sumResults;

    /**
     * Gets the value of the sumResults property.
     * 
     * @return
     *     possible object is
     *     {@link SumResponse }
     *     
     */
    public SumResponse getSumResults() {
        return sumResults;
    }

    /**
     * Sets the value of the sumResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumResponse }
     *     
     */
    public void setSumResults(SumResponse value) {
        this.sumResults = value;
    }

}
