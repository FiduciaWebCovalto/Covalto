
package mx.com.inscitech.actinver.ws.watchlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for watchListQueryResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="watchListQueryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://watchlist.ws.actinver.inscitech.com.mx/}genericServiceResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "watchListQueryResponse", propOrder = { "_return" })
public class WatchListQueryResponse {

    @XmlElement(name = "return")
    protected GenericServiceResponse _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link GenericServiceResponse }
     *
     */
    public GenericServiceResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link GenericServiceResponse }
     *
     */
    public void setReturn(GenericServiceResponse value) {
        this._return = value;
    }

}
