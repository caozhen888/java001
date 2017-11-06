
package com.offcn;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWebservice", targetNamespace = "http://offcn.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWebservice {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHello", targetNamespace = "http://offcn.com/", className = "com.offcn.GetHello")
    @ResponseWrapper(localName = "getHelloResponse", targetNamespace = "http://offcn.com/", className = "com.offcn.GetHelloResponse")
    @Action(input = "http://offcn.com/HelloWebservice/getHelloRequest", output = "http://offcn.com/HelloWebservice/getHelloResponse")
    public String getHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}