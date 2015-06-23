/**
 * EnumDPIRuleTemplateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumDPIRuleTemplateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumDPIRuleTemplateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CUSTOM_XML = "CUSTOM_XML";
    public static final java.lang.String _SIGNATURE = "SIGNATURE";
    public static final java.lang.String _START_END_PATTERNS = "START_END_PATTERNS";
    public static final EnumDPIRuleTemplateType CUSTOM_XML = new EnumDPIRuleTemplateType(_CUSTOM_XML);
    public static final EnumDPIRuleTemplateType SIGNATURE = new EnumDPIRuleTemplateType(_SIGNATURE);
    public static final EnumDPIRuleTemplateType START_END_PATTERNS = new EnumDPIRuleTemplateType(_START_END_PATTERNS);
    public java.lang.String getValue() { return _value_;}
    public static EnumDPIRuleTemplateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumDPIRuleTemplateType enumeration = (EnumDPIRuleTemplateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumDPIRuleTemplateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumDPIRuleTemplateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDPIRuleTemplateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
