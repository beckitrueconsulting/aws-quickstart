/**
 * EnumProtocolIcmpType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumProtocolIcmpType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumProtocolIcmpType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ICMP_ECHO = "ICMP_ECHO";
    public static final java.lang.String _ICMP_TIMESTAMP = "ICMP_TIMESTAMP";
    public static final java.lang.String _ICMP_INFORMATION = "ICMP_INFORMATION";
    public static final java.lang.String _ICMP_ADDRESS_MASK = "ICMP_ADDRESS_MASK";
    public static final java.lang.String _ICMP_MOBILE_REGISTRATION = "ICMP_MOBILE_REGISTRATION";
    public static final EnumProtocolIcmpType ICMP_ECHO = new EnumProtocolIcmpType(_ICMP_ECHO);
    public static final EnumProtocolIcmpType ICMP_TIMESTAMP = new EnumProtocolIcmpType(_ICMP_TIMESTAMP);
    public static final EnumProtocolIcmpType ICMP_INFORMATION = new EnumProtocolIcmpType(_ICMP_INFORMATION);
    public static final EnumProtocolIcmpType ICMP_ADDRESS_MASK = new EnumProtocolIcmpType(_ICMP_ADDRESS_MASK);
    public static final EnumProtocolIcmpType ICMP_MOBILE_REGISTRATION = new EnumProtocolIcmpType(_ICMP_MOBILE_REGISTRATION);
    public java.lang.String getValue() { return _value_;}
    public static EnumProtocolIcmpType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumProtocolIcmpType enumeration = (EnumProtocolIcmpType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumProtocolIcmpType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumProtocolIcmpType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumProtocolIcmpType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
