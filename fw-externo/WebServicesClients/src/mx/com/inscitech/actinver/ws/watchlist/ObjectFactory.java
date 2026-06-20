
package mx.com.inscitech.actinver.ws.watchlist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.inscitech.actinver.ws.watchlist package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WatchListQuery_QNAME = new QName("http://watchlist.ws.actinver.inscitech.com.mx/", "watchListQuery");
    private final static QName _WatchListQueryResponse_QNAME = new QName("http://watchlist.ws.actinver.inscitech.com.mx/", "watchListQueryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.inscitech.actinver.ws.watchlist
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WatchListQuery }
     *
     */
    public WatchListQuery createWatchListQuery() {
        return new WatchListQuery();
    }

    /**
     * Create an instance of {@link WatchListQueryResponse }
     *
     */
    public WatchListQueryResponse createWatchListQueryResponse() {
        return new WatchListQueryResponse();
    }

    /**
     * Create an instance of {@link WatchListConfigBean }
     *
     */
    public WatchListConfigBean createWatchListConfigBean() {
        return new WatchListConfigBean();
    }

    /**
     * Create an instance of {@link WatchListQueryBean }
     *
     */
    public WatchListQueryBean createWatchListQueryBean() {
        return new WatchListQueryBean();
    }

    /**
     * Create an instance of {@link GenericServiceResponse }
     *
     */
    public GenericServiceResponse createGenericServiceResponse() {
        return new GenericServiceResponse();
    }

    /**
     * Create an instance of {@link ErrorData }
     *
     */
    public ErrorData createErrorData() {
        return new ErrorData();
    }

    /**
     * Create an instance of {@link WatchListMatch }
     *
     */
    public WatchListMatch createWatchListMatch() {
        return new WatchListMatch();
    }

    /**
     * Create an instance of {@link WatchListMessages }
     *
     */
    public WatchListMessages createWatchListMessages() {
        return new WatchListMessages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WatchListQuery }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WatchListQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://watchlist.ws.actinver.inscitech.com.mx/", name = "watchListQuery")
    public JAXBElement<WatchListQuery> createWatchListQuery(WatchListQuery value) {
        return new JAXBElement<WatchListQuery>(_WatchListQuery_QNAME, WatchListQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WatchListQueryResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WatchListQueryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://watchlist.ws.actinver.inscitech.com.mx/", name = "watchListQueryResponse")
    public JAXBElement<WatchListQueryResponse> createWatchListQueryResponse(WatchListQueryResponse value) {
        return new JAXBElement<WatchListQueryResponse>(_WatchListQueryResponse_QNAME, WatchListQueryResponse.class, null, value);
    }

}
