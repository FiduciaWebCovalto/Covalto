
package mx.com.inscitech.actinver.ws.pricevector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceVectorConfigBean complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="priceVectorConfigBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwnamespaceLocalPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwnamespaceURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fwserviceURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="namespaceLocalPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="namespaceURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="systemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="theIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceVectorConfigBean",
         propOrder =
         { "clientID", "clientTypeID", "companyName", "dateTimeFormat", "fwnamespaceLocalPart", "fwnamespaceURI", "fwserviceURL", "language", "namespaceLocalPart", "namespaceURI",
           "operationName", "operationVersion", "requestClientID", "serviceURL", "systemID", "theIPAddress", "userName"
    })
public class PriceVectorConfigBean {

    protected String clientID;
    protected String clientTypeID;
    protected String companyName;
    protected String dateTimeFormat;
    protected String fwnamespaceLocalPart;
    protected String fwnamespaceURI;
    protected String fwserviceURL;
    protected String language;
    protected String namespaceLocalPart;
    protected String namespaceURI;
    protected String operationName;
    protected String operationVersion;
    protected String requestClientID;
    protected String serviceURL;
    protected String systemID;
    protected String theIPAddress;
    protected String userName;

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
     * Gets the value of the dateTimeFormat property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    /**
     * Sets the value of the dateTimeFormat property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateTimeFormat(String value) {
        this.dateTimeFormat = value;
    }

    /**
     * Gets the value of the fwnamespaceLocalPart property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFwnamespaceLocalPart() {
        return fwnamespaceLocalPart;
    }

    /**
     * Sets the value of the fwnamespaceLocalPart property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFwnamespaceLocalPart(String value) {
        this.fwnamespaceLocalPart = value;
    }

    /**
     * Gets the value of the fwnamespaceURI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFwnamespaceURI() {
        return fwnamespaceURI;
    }

    /**
     * Sets the value of the fwnamespaceURI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFwnamespaceURI(String value) {
        this.fwnamespaceURI = value;
    }

    /**
     * Gets the value of the fwserviceURL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFwserviceURL() {
        return fwserviceURL;
    }

    /**
     * Sets the value of the fwserviceURL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFwserviceURL(String value) {
        this.fwserviceURL = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the namespaceLocalPart property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNamespaceLocalPart() {
        return namespaceLocalPart;
    }

    /**
     * Sets the value of the namespaceLocalPart property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNamespaceLocalPart(String value) {
        this.namespaceLocalPart = value;
    }

    /**
     * Gets the value of the namespaceURI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNamespaceURI() {
        return namespaceURI;
    }

    /**
     * Sets the value of the namespaceURI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNamespaceURI(String value) {
        this.namespaceURI = value;
    }

    /**
     * Gets the value of the operationName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the operationVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperationVersion() {
        return operationVersion;
    }

    /**
     * Sets the value of the operationVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperationVersion(String value) {
        this.operationVersion = value;
    }

    /**
     * Gets the value of the requestClientID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestClientID() {
        return requestClientID;
    }

    /**
     * Sets the value of the requestClientID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestClientID(String value) {
        this.requestClientID = value;
    }

    /**
     * Gets the value of the serviceURL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceURL() {
        return serviceURL;
    }

    /**
     * Sets the value of the serviceURL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceURL(String value) {
        this.serviceURL = value;
    }

    /**
     * Gets the value of the systemID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSystemID(String value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the theIPAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTheIPAddress() {
        return theIPAddress;
    }

    /**
     * Sets the value of the theIPAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTheIPAddress(String value) {
        this.theIPAddress = value;
    }

    /**
     * Gets the value of the userName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
