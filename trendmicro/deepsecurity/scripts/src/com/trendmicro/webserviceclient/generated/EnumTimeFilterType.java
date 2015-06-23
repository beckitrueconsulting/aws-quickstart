/**
 * EnumTimeFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumTimeFilterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumTimeFilterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LAST_HOUR = "LAST_HOUR";
    public static final java.lang.String _LAST_24_HOURS = "LAST_24_HOURS";
    public static final java.lang.String _LAST_7_DAYS = "LAST_7_DAYS";
    public static final java.lang.String _CUSTOM_RANGE = "CUSTOM_RANGE";
    public static final java.lang.String _SPECIFIC_TIME = "SPECIFIC_TIME";
    public static final java.lang.String _PREVIOUS_MONTH = "PREVIOUS_MONTH";
    public static final EnumTimeFilterType LAST_HOUR = new EnumTimeFilterType(_LAST_HOUR);
    public static final EnumTimeFilterType LAST_24_HOURS = new EnumTimeFilterType(_LAST_24_HOURS);
    public static final EnumTimeFilterType LAST_7_DAYS = new EnumTimeFilterType(_LAST_7_DAYS);
    public static final EnumTimeFilterType CUSTOM_RANGE = new EnumTimeFilterType(_CUSTOM_RANGE);
    public static final EnumTimeFilterType SPECIFIC_TIME = new EnumTimeFilterType(_SPECIFIC_TIME);
    public static final EnumTimeFilterType PREVIOUS_MONTH = new EnumTimeFilterType(_PREVIOUS_MONTH);
    public java.lang.String getValue() { return _value_;}
    public static EnumTimeFilterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumTimeFilterType enumeration = (EnumTimeFilterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumTimeFilterType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumTimeFilterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumTimeFilterType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
