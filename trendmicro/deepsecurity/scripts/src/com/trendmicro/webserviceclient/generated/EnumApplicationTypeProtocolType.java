/**
 * EnumApplicationTypeProtocolType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumApplicationTypeProtocolType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumApplicationTypeProtocolType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ICMP = "ICMP";
    public static final java.lang.String _TCP = "TCP";
    public static final java.lang.String _UDP = "UDP";
    public static final java.lang.String _TCP_UDP = "TCP_UDP";
    public static final EnumApplicationTypeProtocolType ICMP = new EnumApplicationTypeProtocolType(_ICMP);
    public static final EnumApplicationTypeProtocolType TCP = new EnumApplicationTypeProtocolType(_TCP);
    public static final EnumApplicationTypeProtocolType UDP = new EnumApplicationTypeProtocolType(_UDP);
    public static final EnumApplicationTypeProtocolType TCP_UDP = new EnumApplicationTypeProtocolType(_TCP_UDP);
    public java.lang.String getValue() { return _value_;}
    public static EnumApplicationTypeProtocolType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumApplicationTypeProtocolType enumeration = (EnumApplicationTypeProtocolType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumApplicationTypeProtocolType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumApplicationTypeProtocolType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumApplicationTypeProtocolType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
