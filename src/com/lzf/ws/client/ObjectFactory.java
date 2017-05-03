
package com.lzf.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lzf.ws.client package. 
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

    private final static QName _GetUser_QNAME = new QName("http://ws.lzf.com/", "getUser");
    private final static QName _GetUserResponse_QNAME = new QName("http://ws.lzf.com/", "getUserResponse");
    private final static QName _SyaResponse_QNAME = new QName("http://ws.lzf.com/", "syaResponse");
    private final static QName _Sya_QNAME = new QName("http://ws.lzf.com/", "sya");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lzf.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link Sya }
     * 
     */
    public Sya createSya() {
        return new Sya();
    }

    /**
     * Create an instance of {@link SyaResponse }
     * 
     */
    public SyaResponse createSyaResponse() {
        return new SyaResponse();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lzf.com/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lzf.com/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lzf.com/", name = "syaResponse")
    public JAXBElement<SyaResponse> createSyaResponse(SyaResponse value) {
        return new JAXBElement<SyaResponse>(_SyaResponse_QNAME, SyaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sya }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lzf.com/", name = "sya")
    public JAXBElement<Sya> createSya(Sya value) {
        return new JAXBElement<Sya>(_Sya_QNAME, Sya.class, null, value);
    }

}
