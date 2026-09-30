
package mx.com.inscitech.actinver.ws.pricevector;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericServiceResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="genericServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorDetail" type="{http://priceVector.ws.actinver.inscitech.com.mx/}errorData" minOccurs="0"/&gt;
 *         &lt;element name="exitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exitMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceVectorList" type="{http://priceVector.ws.actinver.inscitech.com.mx/}priceVectorElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requestedOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericServiceResponse",
         propOrder = { "errorDetail", "exitCode", "exitMessage", "priceVectorList", "requestedOperation", "responseCategory", "responseMessage", "responseType", "transactionID"
    })
public class GenericServiceResponse {

    protected ErrorData errorDetail;
    protected String exitCode;
    protected String exitMessage;
    @XmlElement(nillable = true)
    protected List<PriceVectorElement> priceVectorList;
    protected String requestedOperation;
    protected String responseCategory;
    protected String responseMessage;
    protected String responseType;
    protected String transactionID;

    /**
     * Gets the value of the errorDetail property.
     *
     * @return
     *     possible object is
     *     {@link ErrorData }
     *
     */
    public ErrorData getErrorDetail() {
        return errorDetail;
    }

    /**
     * Sets the value of the errorDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link ErrorData }
     *
     */
    public void setErrorDetail(ErrorData value) {
        this.errorDetail = value;
    }

    /**
     * Gets the value of the exitCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExitCode() {
        return exitCode;
    }

    /**
     * Sets the value of the exitCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExitCode(String value) {
        this.exitCode = value;
    }

    /**
     * Gets the value of the exitMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExitMessage() {
        return exitMessage;
    }

    /**
     * Sets the value of the exitMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExitMessage(String value) {
        this.exitMessage = value;
    }

    /**
     * Gets the value of the priceVectorList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceVectorList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceVectorList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceVectorElement }
     *
     *
     */
    public List<PriceVectorElement> getPriceVectorList() {
        if (priceVectorList == null) {
            priceVectorList = new ArrayList<PriceVectorElement>();
        }
        return this.priceVectorList;
    }

    /**
     * Gets the value of the requestedOperation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestedOperation() {
        return requestedOperation;
    }

    /**
     * Sets the value of the requestedOperation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestedOperation(String value) {
        this.requestedOperation = value;
    }

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

    /**
     * Gets the value of the transactionID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

}
