//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.21 at 05:04:36 PM AEDT 
//


package com.test.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.test.soap package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.test.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGcdResponse }
     * 
     */
    public GetGcdResponse createGetGcdResponse() {
        return new GetGcdResponse();
    }

    /**
     * Create an instance of {@link GetGcdSumResponse }
     * 
     */
    public GetGcdSumResponse createGetGcdSumResponse() {
        return new GetGcdSumResponse();
    }

    /**
     * Create an instance of {@link GetGcdListResponse }
     * 
     */
    public GetGcdListResponse createGetGcdListResponse() {
        return new GetGcdListResponse();
    }

    /**
     * Create an instance of {@link GcdList }
     * 
     */
    public GcdList createGcdList() {
        return new GcdList();
    }

    /**
     * Create an instance of {@link GetStudentRequest }
     * 
     */
    public GetStudentRequest createGetStudentRequest() {
        return new GetStudentRequest();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

}
