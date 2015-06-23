/**
 * EnumWebReputationEventRisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumWebReputationEventRisk implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumWebReputationEventRisk(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SUSPICIOUS = "SUSPICIOUS";
    public static final java.lang.String _HIGHLYSUSPICIOUS = "HIGHLYSUSPICIOUS";
    public static final java.lang.String _DANGEROUS = "DANGEROUS";
    public static final java.lang.String _UNTESTED = "UNTESTED";
    public static final java.lang.String _BLOCKEDBYADMINISTRATOR = "BLOCKEDBYADMINISTRATOR";
    public static final EnumWebReputationEventRisk SUSPICIOUS = new EnumWebReputationEventRisk(_SUSPICIOUS);
    public static final EnumWebReputationEventRisk HIGHLYSUSPICIOUS = new EnumWebReputationEventRisk(_HIGHLYSUSPICIOUS);
    public static final EnumWebReputationEventRisk DANGEROUS = new EnumWebReputationEventRisk(_DANGEROUS);
    public static final EnumWebReputationEventRisk UNTESTED = new EnumWebReputationEventRisk(_UNTESTED);
    public static final EnumWebReputationEventRisk BLOCKEDBYADMINISTRATOR = new EnumWebReputationEventRisk(_BLOCKEDBYADMINISTRATOR);
    public java.lang.String getValue() { return _value_;}
    public static EnumWebReputationEventRisk fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumWebReputationEventRisk enumeration = (EnumWebReputationEventRisk)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumWebReputationEventRisk fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumWebReputationEventRisk.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumWebReputationEventRisk"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
