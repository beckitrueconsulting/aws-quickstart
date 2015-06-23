/**
 * EnumEditableSettingUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumEditableSettingUnit implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumEditableSettingUnit(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IPLIST_ID = "IPLIST_ID";
    public static final java.lang.String _PORTLIST_ID = "PORTLIST_ID";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _SECONDS = "SECONDS";
    public static final java.lang.String _MINUTES = "MINUTES";
    public static final java.lang.String _HOURS = "HOURS";
    public static final java.lang.String _DAYS = "DAYS";
    public static final java.lang.String _WEEKS = "WEEKS";
    public static final java.lang.String _MONTHS = "MONTHS";
    public static final java.lang.String _YEARS = "YEARS";
    public static final java.lang.String _KBYTES = "KBYTES";
    public static final java.lang.String _PERCENT = "PERCENT";
    public static final java.lang.String _PORT = "PORT";
    public static final java.lang.String _HOST = "HOST";
    public static final java.lang.String _EMAIL = "EMAIL";
    public static final EnumEditableSettingUnit IPLIST_ID = new EnumEditableSettingUnit(_IPLIST_ID);
    public static final EnumEditableSettingUnit PORTLIST_ID = new EnumEditableSettingUnit(_PORTLIST_ID);
    public static final EnumEditableSettingUnit NONE = new EnumEditableSettingUnit(_NONE);
    public static final EnumEditableSettingUnit SECONDS = new EnumEditableSettingUnit(_SECONDS);
    public static final EnumEditableSettingUnit MINUTES = new EnumEditableSettingUnit(_MINUTES);
    public static final EnumEditableSettingUnit HOURS = new EnumEditableSettingUnit(_HOURS);
    public static final EnumEditableSettingUnit DAYS = new EnumEditableSettingUnit(_DAYS);
    public static final EnumEditableSettingUnit WEEKS = new EnumEditableSettingUnit(_WEEKS);
    public static final EnumEditableSettingUnit MONTHS = new EnumEditableSettingUnit(_MONTHS);
    public static final EnumEditableSettingUnit YEARS = new EnumEditableSettingUnit(_YEARS);
    public static final EnumEditableSettingUnit KBYTES = new EnumEditableSettingUnit(_KBYTES);
    public static final EnumEditableSettingUnit PERCENT = new EnumEditableSettingUnit(_PERCENT);
    public static final EnumEditableSettingUnit PORT = new EnumEditableSettingUnit(_PORT);
    public static final EnumEditableSettingUnit HOST = new EnumEditableSettingUnit(_HOST);
    public static final EnumEditableSettingUnit EMAIL = new EnumEditableSettingUnit(_EMAIL);
    public java.lang.String getValue() { return _value_;}
    public static EnumEditableSettingUnit fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumEditableSettingUnit enumeration = (EnumEditableSettingUnit)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumEditableSettingUnit fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumEditableSettingUnit.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumEditableSettingUnit"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
