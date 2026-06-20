
package mx.com.inscitech.actinver.ws.watchlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for watchListQuery complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="watchListQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="config" type="{http://watchlist.ws.actinver.inscitech.com.mx/}watchListConfigBean" minOccurs="0"/&gt;
 *         &lt;element name="queryDetail" type="{http://watchlist.ws.actinver.inscitech.com.mx/}watchListQueryBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "watchListQuery", propOrder = { "config", "queryDetail" })
public class WatchListQuery {

    protected WatchListConfigBean config;
    protected WatchListQueryBean queryDetail;

    /**
     * Gets the value of the config property.
     *
     * @return
     *     possible object is
     *     {@link WatchListConfigBean }
     *
     */
    public WatchListConfigBean getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     *
     * @param value
     *     allowed object is
     *     {@link WatchListConfigBean }
     *
     */
    public void setConfig(WatchListConfigBean value) {
        this.config = value;
    }

    /**
     * Gets the value of the queryDetail property.
     *
     * @return
     *     possible object is
     *     {@link WatchListQueryBean }
     *
     */
    public WatchListQueryBean getQueryDetail() {
        return queryDetail;
    }

    /**
     * Sets the value of the queryDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link WatchListQueryBean }
     *
     */
    public void setQueryDetail(WatchListQueryBean value) {
        this.queryDetail = value;
    }

}
