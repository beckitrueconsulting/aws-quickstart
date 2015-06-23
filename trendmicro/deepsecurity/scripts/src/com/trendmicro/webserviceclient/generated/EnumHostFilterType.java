/**
 * EnumHostFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumHostFilterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumHostFilterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL_HOSTS = "ALL_HOSTS";
    public static final java.lang.String _HOSTS_IN_GROUP = "HOSTS_IN_GROUP";
    public static final java.lang.String _HOSTS_USING_SECURITY_PROFILE = "HOSTS_USING_SECURITY_PROFILE";
    public static final java.lang.String _HOSTS_IN_GROUP_AND_ALL_SUBGROUPS = "HOSTS_IN_GROUP_AND_ALL_SUBGROUPS";
    public static final java.lang.String _SPECIFIC_HOST = "SPECIFIC_HOST";
    public static final java.lang.String _MY_HOSTS = "MY_HOSTS";
    public static final EnumHostFilterType ALL_HOSTS = new EnumHostFilterType(_ALL_HOSTS);
    public static final EnumHostFilterType HOSTS_IN_GROUP = new EnumHostFilterType(_HOSTS_IN_GROUP);
    public static final EnumHostFilterType HOSTS_USING_SECURITY_PROFILE = new EnumHostFilterType(_HOSTS_USING_SECURITY_PROFILE);
    public static final EnumHostFilterType HOSTS_IN_GROUP_AND_ALL_SUBGROUPS = new EnumHostFilterType(_HOSTS_IN_GROUP_AND_ALL_SUBGROUPS);
    public static final EnumHostFilterType SPECIFIC_HOST = new EnumHostFilterType(_SPECIFIC_HOST);
    public static final EnumHostFilterType MY_HOSTS = new EnumHostFilterType(_MY_HOSTS);
    public java.lang.String getValue() { return _value_;}
    public static EnumHostFilterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumHostFilterType enumeration = (EnumHostFilterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumHostFilterType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumHostFilterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumHostFilterType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
