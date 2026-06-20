
package mx.com.inscitech.actinver.ws.pricevector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceVectorQuery complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="priceVectorQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://priceVector.ws.actinver.inscitech.com.mx/}priceVectorConfigBean" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://priceVector.ws.actinver.inscitech.com.mx/}priceVectorQueryBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceVectorQuery", propOrder = { "arg0", "arg1" })
public class PriceVectorQuery {

    protected PriceVectorConfigBean arg0;
    protected PriceVectorQueryBean arg1;

    /**
     * Gets the value of the arg0 property.
     *
     * @return
     *     possible object is
     *     {@link PriceVectorConfigBean }
     *
     */
    public PriceVectorConfigBean getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     *
     * @param value
     *     allowed object is
     *     {@link PriceVectorConfigBean }
     *
     */
    public void setArg0(PriceVectorConfigBean value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     *
     * @return
     *     possible object is
     *     {@link PriceVectorQueryBean }
     *
     */
    public PriceVectorQueryBean getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     *
     * @param value
     *     allowed object is
     *     {@link PriceVectorQueryBean }
     *
     */
    public void setArg1(PriceVectorQueryBean value) {
        this.arg1 = value;
    }

}
