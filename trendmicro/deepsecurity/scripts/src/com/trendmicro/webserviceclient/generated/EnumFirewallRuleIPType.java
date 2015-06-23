/**
 * EnumFirewallRuleIPType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumFirewallRuleIPType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumFirewallRuleIPType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ANY = "ANY";
    public static final java.lang.String _MASKED_IP = "MASKED_IP";
    public static final java.lang.String _RANGE = "RANGE";
    public static final java.lang.String _DEFINED_LIST = "DEFINED_LIST";
    public static final java.lang.String _SINGLE_IP = "SINGLE_IP";
    public static final EnumFirewallRuleIPType ANY = new EnumFirewallRuleIPType(_ANY);
    public static final EnumFirewallRuleIPType MASKED_IP = new EnumFirewallRuleIPType(_MASKED_IP);
    public static final EnumFirewallRuleIPType RANGE = new EnumFirewallRuleIPType(_RANGE);
    public static final EnumFirewallRuleIPType DEFINED_LIST = new EnumFirewallRuleIPType(_DEFINED_LIST);
    public static final EnumFirewallRuleIPType SINGLE_IP = new EnumFirewallRuleIPType(_SINGLE_IP);
    public java.lang.String getValue() { return _value_;}
    public static EnumFirewallRuleIPType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumFirewallRuleIPType enumeration = (EnumFirewallRuleIPType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumFirewallRuleIPType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumFirewallRuleIPType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumFirewallRuleIPType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
