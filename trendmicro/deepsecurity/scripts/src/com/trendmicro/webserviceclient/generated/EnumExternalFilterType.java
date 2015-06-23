/**
 * EnumExternalFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumExternalFilterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumExternalFilterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL_EXT_HOSTS = "ALL_EXT_HOSTS";
    public static final java.lang.String _HOSTS_IN_EXT_GROUP = "HOSTS_IN_EXT_GROUP";
    public static final java.lang.String _HOSTS_IN_EXT_GROUP_AND_ALL_SUBGROUPS = "HOSTS_IN_EXT_GROUP_AND_ALL_SUBGROUPS";
    public static final java.lang.String _SPECIFIC_EXT_HOST = "SPECIFIC_EXT_HOST";
    public static final EnumExternalFilterType ALL_EXT_HOSTS = new EnumExternalFilterType(_ALL_EXT_HOSTS);
    public static final EnumExternalFilterType HOSTS_IN_EXT_GROUP = new EnumExternalFilterType(_HOSTS_IN_EXT_GROUP);
    public static final EnumExternalFilterType HOSTS_IN_EXT_GROUP_AND_ALL_SUBGROUPS = new EnumExternalFilterType(_HOSTS_IN_EXT_GROUP_AND_ALL_SUBGROUPS);
    public static final EnumExternalFilterType SPECIFIC_EXT_HOST = new EnumExternalFilterType(_SPECIFIC_EXT_HOST);
    public java.lang.String getValue() { return _value_;}
    public static EnumExternalFilterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumExternalFilterType enumeration = (EnumExternalFilterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumExternalFilterType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumExternalFilterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumExternalFilterType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
