
package mx.com.inscitech.actinver.ws.watchlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for watchListMessages complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="watchListMessages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "watchListMessages", propOrder = { "responseCategory", "responseMessage", "responseSystemCode", "responseType" })
public class WatchListMessages {

    protected String responseCategory;
    protected String responseMessage;
    protected String responseSystemCode;
    protected String responseType;

    /**
     * Gets the value of the responseCategory property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseCategory() {
        return responseCategory;
    }

    /**
     * Sets the value of the responseCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseCategory(String value) {
        this.responseCategory = value;
    }

    /**
     * Gets the value of the responseMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the responseSystemCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseSystemCode() {
        return responseSystemCode;
    }

    /**
     * Sets the value of the responseSystemCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseSystemCode(String value) {
        this.responseSystemCode = value;
    }

    /**
     * Gets the value of the responseType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

}
