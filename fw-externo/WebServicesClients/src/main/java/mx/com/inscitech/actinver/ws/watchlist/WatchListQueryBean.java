
package mx.com.inscitech.actinver.ws.watchlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for watchListQueryBean complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="watchListQueryBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "watchListQueryBean", propOrder = { "clientTypeID", "curp", "lastName", "name", "secondLastName", "tin" })
public class WatchListQueryBean {

    protected String clientTypeID;
    protected String curp;
    protected String lastName;
    protected String name;
    protected String secondLastName;
    protected String tin;

    /**
     * Gets the value of the clientTypeID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClientTypeID() {
        return clientTypeID;
    }

    /**
     * Sets the value of the clientTypeID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClientTypeID(String value) {
        this.clientTypeID = value;
    }

    /**
     * Gets the value of the curp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Sets the value of the curp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the secondLastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSecondLastName() {
        return secondLastName;
    }

    /**
     * Sets the value of the secondLastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSecondLastName(String value) {
        this.secondLastName = value;
    }

    /**
     * Gets the value of the tin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTin(String value) {
        this.tin = value;
    }

}
