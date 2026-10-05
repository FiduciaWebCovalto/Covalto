
package mx.com.inscitech.actinver.ws.pricevector;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.inscitech.actinver.ws.pricevector package.
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

    private final static QName _PriceVectorQuery_QNAME = new QName("http://priceVector.ws.actinver.inscitech.com.mx/", "priceVectorQuery");
    private final static QName _PriceVectorQueryResponse_QNAME = new QName("http://priceVector.ws.actinver.inscitech.com.mx/", "priceVectorQueryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.inscitech.actinver.ws.pricevector
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriceVectorQuery }
     *
     */
    public PriceVectorQuery createPriceVectorQuery() {
        return new PriceVectorQuery();
    }

    /**
     * Create an instance of {@link PriceVectorQueryResponse }
     *
     */
    public PriceVectorQueryResponse createPriceVectorQueryResponse() {
        return new PriceVectorQueryResponse();
    }

    /**
     * Create an instance of {@link PriceVectorConfigBean }
     *
     */
    public PriceVectorConfigBean createPriceVectorConfigBean() {
        return new PriceVectorConfigBean();
    }

    /**
     * Create an instance of {@link PriceVectorQueryBean }
     *
     */
    public PriceVectorQueryBean createPriceVectorQueryBean() {
        return new PriceVectorQueryBean();
    }

    /**
     * Create an instance of {@link PriceVectorElement }
     *
     */
    public PriceVectorElement createPriceVectorElement() {
        return new PriceVectorElement();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceVectorQuery }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceVectorQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://priceVector.ws.actinver.inscitech.com.mx/", name = "priceVectorQuery")
    public JAXBElement<PriceVectorQuery> createPriceVectorQuery(PriceVectorQuery value) {
        return new JAXBElement<PriceVectorQuery>(_PriceVectorQuery_QNAME, PriceVectorQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceVectorQueryResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceVectorQueryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://priceVector.ws.actinver.inscitech.com.mx/", name = "priceVectorQueryResponse")
    public JAXBElement<PriceVectorQueryResponse> createPriceVectorQueryResponse(PriceVectorQueryResponse value) {
        return new JAXBElement<PriceVectorQueryResponse>(_PriceVectorQueryResponse_QNAME, PriceVectorQueryResponse.class, null, value);
    }

}
