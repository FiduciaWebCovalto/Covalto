
package mx.com.inscitech.actinver.ws.pricevector;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for priceVectorQueryBean complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="priceVectorQueryBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isstList" type="{http://priceVector.ws.actinver.inscitech.com.mx/}priceVectorElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sendingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceVectorQueryBean", propOrder = { "isstList", "sendingDate" })
public class PriceVectorQueryBean {

    @XmlElement(nillable = true)
    protected List<PriceVectorElement> isstList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendingDate;

    /**
     * Gets the value of the isstList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isstList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsstList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceVectorElement }
     *
     *
     */
    public List<PriceVectorElement> getIsstList() {
        if (isstList == null) {
            isstList = new ArrayList<PriceVectorElement>();
        }
        return this.isstList;
    }

    /**
     * Gets the value of the sendingDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSendingDate() {
        return sendingDate;
    }

    /**
     * Sets the value of the sendingDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSendingDate(XMLGregorianCalendar value) {
        this.sendingDate = value;
    }

}
