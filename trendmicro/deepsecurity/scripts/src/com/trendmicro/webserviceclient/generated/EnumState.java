/**
 * EnumState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NEUTRAL = "NEUTRAL";
    public static final java.lang.String _VM_STOPPED = "VM_STOPPED";
    public static final java.lang.String _VM_PAUSED = "VM_PAUSED";
    public static final java.lang.String _STANDBY = "STANDBY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _INSTALLED = "INSTALLED";
    public static final java.lang.String _HAS_DSM_CERT = "HAS_DSM_CERT";
    public static final java.lang.String _ACTIVATED = "ACTIVATED";
    public static final java.lang.String _OTHER_DSM_AGENT = "OTHER_DSM_AGENT";
    public static final java.lang.String _OFFLINE = "OFFLINE";
    public static final EnumState NEUTRAL = new EnumState(_NEUTRAL);
    public static final EnumState VM_STOPPED = new EnumState(_VM_STOPPED);
    public static final EnumState VM_PAUSED = new EnumState(_VM_PAUSED);
    public static final EnumState STANDBY = new EnumState(_STANDBY);
    public static final EnumState UNKNOWN = new EnumState(_UNKNOWN);
    public static final EnumState NONE = new EnumState(_NONE);
    public static final EnumState INSTALLED = new EnumState(_INSTALLED);
    public static final EnumState HAS_DSM_CERT = new EnumState(_HAS_DSM_CERT);
    public static final EnumState ACTIVATED = new EnumState(_ACTIVATED);
    public static final EnumState OTHER_DSM_AGENT = new EnumState(_OTHER_DSM_AGENT);
    public static final EnumState OFFLINE = new EnumState(_OFFLINE);
    public java.lang.String getValue() { return _value_;}
    public static EnumState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumState enumeration = (EnumState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
