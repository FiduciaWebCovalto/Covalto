
package mx.com.inscitech.actinver.ws.watchlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for watchListMatch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="watchListMatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inactiveDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="matchPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="watchListPersonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="watchListPersonStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="watchListType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "watchListMatch",
         propOrder =
         { "activeDate", "clientID", "clientTypeID", "companyName", "curp", "inactiveDate", "lastName", "lastUpdateDate", "matchPercentage", "name", "secondLastName", "tin",
           "watchListPersonID", "watchListPersonStatus", "watchListType"
    })
public class WatchListMatch {

    protected Object activeDate;
    protected String clientID;
    protected String clientTypeID;
    protected String companyName;
    protected String curp;
    protected Object inactiveDate;
    protected String lastName;
    protected Object lastUpdateDate;
    protected String matchPercentage;
    protected String name;
    protected String secondLastName;
    protected String tin;
    protected String watchListPersonID;
    protected String watchListPersonStatus;
    protected String watchListType;

    /**
     * Gets the value of the activeDate property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setActiveDate(Object value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the clientID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

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
     * Gets the value of the companyName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the inactiveDate property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Sets the value of the inactiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setInactiveDate(Object value) {
        this.inactiveDate = value;
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
     * Gets the value of the lastUpdateDate property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setLastUpdateDate(Object value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the matchPercentage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMatchPercentage() {
        return matchPercentage;
    }

    /**
     * Sets the value of the matchPercentage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMatchPercentage(String value) {
        this.matchPercentage = value;
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

    /**
     * Gets the value of the watchListPersonID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWatchListPersonID() {
        return watchListPersonID;
    }

    /**
     * Sets the value of the watchListPersonID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWatchListPersonID(String value) {
        this.watchListPersonID = value;
    }

    /**
     * Gets the value of the watchListPersonStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWatchListPersonStatus() {
        return watchListPersonStatus;
    }

    /**
     * Sets the value of the watchListPersonStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWatchListPersonStatus(String value) {
        this.watchListPersonStatus = value;
    }

    /**
     * Gets the value of the watchListType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWatchListType() {
        return watchListType;
    }

    /**
     * Sets the value of the watchListType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWatchListType(String value) {
        this.watchListType = value;
    }

}
