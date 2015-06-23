/**
 * EnumFirewallRuleProtocolType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumFirewallRuleProtocolType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumFirewallRuleProtocolType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ANY = "ANY";
    public static final java.lang.String _ICMP = "ICMP";
    public static final java.lang.String _ICMPV6 = "ICMPV6";
    public static final java.lang.String _IGMP = "IGMP";
    public static final java.lang.String _GGP = "GGP";
    public static final java.lang.String _TCP = "TCP";
    public static final java.lang.String _PUP = "PUP";
    public static final java.lang.String _UDP = "UDP";
    public static final java.lang.String _IDP = "IDP";
    public static final java.lang.String _ND = "ND";
    public static final java.lang.String _RAW = "RAW";
    public static final java.lang.String _TCP_UDP = "TCP_UDP";
    public static final java.lang.String _OTHER = "OTHER";
    public static final EnumFirewallRuleProtocolType ANY = new EnumFirewallRuleProtocolType(_ANY);
    public static final EnumFirewallRuleProtocolType ICMP = new EnumFirewallRuleProtocolType(_ICMP);
    public static final EnumFirewallRuleProtocolType ICMPV6 = new EnumFirewallRuleProtocolType(_ICMPV6);
    public static final EnumFirewallRuleProtocolType IGMP = new EnumFirewallRuleProtocolType(_IGMP);
    public static final EnumFirewallRuleProtocolType GGP = new EnumFirewallRuleProtocolType(_GGP);
    public static final EnumFirewallRuleProtocolType TCP = new EnumFirewallRuleProtocolType(_TCP);
    public static final EnumFirewallRuleProtocolType PUP = new EnumFirewallRuleProtocolType(_PUP);
    public static final EnumFirewallRuleProtocolType UDP = new EnumFirewallRuleProtocolType(_UDP);
    public static final EnumFirewallRuleProtocolType IDP = new EnumFirewallRuleProtocolType(_IDP);
    public static final EnumFirewallRuleProtocolType ND = new EnumFirewallRuleProtocolType(_ND);
    public static final EnumFirewallRuleProtocolType RAW = new EnumFirewallRuleProtocolType(_RAW);
    public static final EnumFirewallRuleProtocolType TCP_UDP = new EnumFirewallRuleProtocolType(_TCP_UDP);
    public static final EnumFirewallRuleProtocolType OTHER = new EnumFirewallRuleProtocolType(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static EnumFirewallRuleProtocolType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumFirewallRuleProtocolType enumeration = (EnumFirewallRuleProtocolType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumFirewallRuleProtocolType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumFirewallRuleProtocolType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumFirewallRuleProtocolType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
