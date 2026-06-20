
package mx.com.inscitech.actinver.ws.pricevector;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceVectorElement complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="priceVectorElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="issuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="securityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceVectorElement", propOrder = { "dirtyPrice", "issuerName", "securityType", "serie" })
public class PriceVectorElement {

    protected BigDecimal dirtyPrice;
    protected String issuerName;
    protected String securityType;
    protected String serie;

    /**
     * Gets the value of the dirtyPrice property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDirtyPrice() {
        return dirtyPrice;
    }

    /**
     * Sets the value of the dirtyPrice property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDirtyPrice(BigDecimal value) {
        this.dirtyPrice = value;
    }

    /**
     * Gets the value of the issuerName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Sets the value of the issuerName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

    /**
     * Gets the value of the securityType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * Sets the value of the securityType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSecurityType(String value) {
        this.securityType = value;
    }

    /**
     * Gets the value of the serie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSerie(String value) {
        this.serie = value;
    }

}
