/**
 * EnumCounterFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumCounterFilter implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumCounterFilter(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ANTI_MALWARE_COMPUTER_ACTIVITY = "ANTI_MALWARE_COMPUTER_ACTIVITY";
    public static final java.lang.String _INTEGRITY_COMPUTER_ACTIVITY = "INTEGRITY_COMPUTER_ACTIVITY";
    public static final java.lang.String _LOG_INSPECTION_COMPUTER_ACTIVITY = "LOG_INSPECTION_COMPUTER_ACTIVITY";
    public static final java.lang.String _FIREWALL_DETECT_COMPUTER_ACTIVITY = "FIREWALL_DETECT_COMPUTER_ACTIVITY";
    public static final java.lang.String _FIREWALL_PREVENT_COMPUTER_ACTIVITY = "FIREWALL_PREVENT_COMPUTER_ACTIVITY";
    public static final java.lang.String _FIREWALL_ALL_COMPUTER_ACTIVITY = "FIREWALL_ALL_COMPUTER_ACTIVITY";
    public static final java.lang.String _DPI_DETECT_COMPUTER_ACTIVITY = "DPI_DETECT_COMPUTER_ACTIVITY";
    public static final java.lang.String _DPI_PREVENT_COMPUTER_ACTIVITY = "DPI_PREVENT_COMPUTER_ACTIVITY";
    public static final java.lang.String _DPI_ALL_COMPUTER_ACTIVITY = "DPI_ALL_COMPUTER_ACTIVITY";
    public static final java.lang.String _ANTI_MALWARE_ACTIVITY = "ANTI_MALWARE_ACTIVITY";
    public static final java.lang.String _ANTI_MALWARE_INCOMPLETE_SCAN = "ANTI_MALWARE_INCOMPLETE_SCAN";
    public static final java.lang.String _FIREWALL_PREVENT_RULES = "FIREWALL_PREVENT_RULES";
    public static final java.lang.String _FIREWALL_DETECT_RULES = "FIREWALL_DETECT_RULES";
    public static final java.lang.String _FIREWALL_PREVENT_COMMON_EVENTS = "FIREWALL_PREVENT_COMMON_EVENTS";
    public static final java.lang.String _FIREWALL_DETECT_COMMON_EVENTS = "FIREWALL_DETECT_COMMON_EVENTS";
    public static final java.lang.String _FIREWALL_PREVENT_ACTIVITY = "FIREWALL_PREVENT_ACTIVITY";
    public static final java.lang.String _FIREWALL_DETECT_ACTIVITY = "FIREWALL_DETECT_ACTIVITY";
    public static final java.lang.String _FIREWALL_ALL_ACTIVITY = "FIREWALL_ALL_ACTIVITY";
    public static final java.lang.String _FIREWALL_PREVENT_IP_ACTIVITY = "FIREWALL_PREVENT_IP_ACTIVITY";
    public static final java.lang.String _FIREWALL_DETECT_IP_ACTIVITY = "FIREWALL_DETECT_IP_ACTIVITY";
    public static final java.lang.String _FIREWALL_PREVENT_PORT_ACTIVITY = "FIREWALL_PREVENT_PORT_ACTIVITY";
    public static final java.lang.String _FIREWALL_DETECT_PORT_ACTIVITY = "FIREWALL_DETECT_PORT_ACTIVITY";
    public static final java.lang.String _DPI_PREVENT_RULES = "DPI_PREVENT_RULES";
    public static final java.lang.String _DPI_DETECT_RULES = "DPI_DETECT_RULES";
    public static final java.lang.String _DPI_ALL_RULES = "DPI_ALL_RULES";
    public static final java.lang.String _DPI_PREVENT_COMMON_EVENTS = "DPI_PREVENT_COMMON_EVENTS";
    public static final java.lang.String _DPI_DETECT_COMMON_EVENTS = "DPI_DETECT_COMMON_EVENTS";
    public static final java.lang.String _DPI_ALL_COMMON_EVENTS = "DPI_ALL_COMMON_EVENTS";
    public static final java.lang.String _DPI_PREVENT_ACTIVITY = "DPI_PREVENT_ACTIVITY";
    public static final java.lang.String _DPI_DETECT_ACTIVITY = "DPI_DETECT_ACTIVITY";
    public static final java.lang.String _DPI_PREVENT_IP_ACTIVITY = "DPI_PREVENT_IP_ACTIVITY";
    public static final java.lang.String _DPI_DETECT_IP_ACTIVITY = "DPI_DETECT_IP_ACTIVITY";
    public static final java.lang.String _DPI_PREVENT_APP_TYPE_ACTIVITY = "DPI_PREVENT_APP_TYPE_ACTIVITY";
    public static final java.lang.String _DPI_DETECT_APP_TYPE_ACTIVITY = "DPI_DETECT_APP_TYPE_ACTIVITY";
    public static final java.lang.String _INTEGRITY_ACTIVITY = "INTEGRITY_ACTIVITY";
    public static final java.lang.String _INTEGRITY_KEY_ACTIVITY = "INTEGRITY_KEY_ACTIVITY";
    public static final java.lang.String _LOG_INSPECTION_ACTIVITY = "LOG_INSPECTION_ACTIVITY";
    public static final java.lang.String _LOG_INSPECTION_DESCRIPTION_ACTIVITY = "LOG_INSPECTION_DESCRIPTION_ACTIVITY";
    public static final java.lang.String _ALERT_TYPE = "ALERT_TYPE";
    public static final java.lang.String _RECONNAISSANCE_SCAN_ACTIVITY = "RECONNAISSANCE_SCAN_ACTIVITY";
    public static final java.lang.String _SYSTEM_EVENT_SUMMARY = "SYSTEM_EVENT_SUMMARY";
    public static final java.lang.String _WEB_REPUTATION_COMPUTER_ACTIVITY = "WEB_REPUTATION_COMPUTER_ACTIVITY";
    public static final java.lang.String _WEB_REPUTATION_URL_ACTIVITY = "WEB_REPUTATION_URL_ACTIVITY";
    public static final EnumCounterFilter ANTI_MALWARE_COMPUTER_ACTIVITY = new EnumCounterFilter(_ANTI_MALWARE_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter INTEGRITY_COMPUTER_ACTIVITY = new EnumCounterFilter(_INTEGRITY_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter LOG_INSPECTION_COMPUTER_ACTIVITY = new EnumCounterFilter(_LOG_INSPECTION_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_DETECT_COMPUTER_ACTIVITY = new EnumCounterFilter(_FIREWALL_DETECT_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_PREVENT_COMPUTER_ACTIVITY = new EnumCounterFilter(_FIREWALL_PREVENT_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_ALL_COMPUTER_ACTIVITY = new EnumCounterFilter(_FIREWALL_ALL_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter DPI_DETECT_COMPUTER_ACTIVITY = new EnumCounterFilter(_DPI_DETECT_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter DPI_PREVENT_COMPUTER_ACTIVITY = new EnumCounterFilter(_DPI_PREVENT_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter DPI_ALL_COMPUTER_ACTIVITY = new EnumCounterFilter(_DPI_ALL_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter ANTI_MALWARE_ACTIVITY = new EnumCounterFilter(_ANTI_MALWARE_ACTIVITY);
    public static final EnumCounterFilter ANTI_MALWARE_INCOMPLETE_SCAN = new EnumCounterFilter(_ANTI_MALWARE_INCOMPLETE_SCAN);
    public static final EnumCounterFilter FIREWALL_PREVENT_RULES = new EnumCounterFilter(_FIREWALL_PREVENT_RULES);
    public static final EnumCounterFilter FIREWALL_DETECT_RULES = new EnumCounterFilter(_FIREWALL_DETECT_RULES);
    public static final EnumCounterFilter FIREWALL_PREVENT_COMMON_EVENTS = new EnumCounterFilter(_FIREWALL_PREVENT_COMMON_EVENTS);
    public static final EnumCounterFilter FIREWALL_DETECT_COMMON_EVENTS = new EnumCounterFilter(_FIREWALL_DETECT_COMMON_EVENTS);
    public static final EnumCounterFilter FIREWALL_PREVENT_ACTIVITY = new EnumCounterFilter(_FIREWALL_PREVENT_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_DETECT_ACTIVITY = new EnumCounterFilter(_FIREWALL_DETECT_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_ALL_ACTIVITY = new EnumCounterFilter(_FIREWALL_ALL_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_PREVENT_IP_ACTIVITY = new EnumCounterFilter(_FIREWALL_PREVENT_IP_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_DETECT_IP_ACTIVITY = new EnumCounterFilter(_FIREWALL_DETECT_IP_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_PREVENT_PORT_ACTIVITY = new EnumCounterFilter(_FIREWALL_PREVENT_PORT_ACTIVITY);
    public static final EnumCounterFilter FIREWALL_DETECT_PORT_ACTIVITY = new EnumCounterFilter(_FIREWALL_DETECT_PORT_ACTIVITY);
    public static final EnumCounterFilter DPI_PREVENT_RULES = new EnumCounterFilter(_DPI_PREVENT_RULES);
    public static final EnumCounterFilter DPI_DETECT_RULES = new EnumCounterFilter(_DPI_DETECT_RULES);
    public static final EnumCounterFilter DPI_ALL_RULES = new EnumCounterFilter(_DPI_ALL_RULES);
    public static final EnumCounterFilter DPI_PREVENT_COMMON_EVENTS = new EnumCounterFilter(_DPI_PREVENT_COMMON_EVENTS);
    public static final EnumCounterFilter DPI_DETECT_COMMON_EVENTS = new EnumCounterFilter(_DPI_DETECT_COMMON_EVENTS);
    public static final EnumCounterFilter DPI_ALL_COMMON_EVENTS = new EnumCounterFilter(_DPI_ALL_COMMON_EVENTS);
    public static final EnumCounterFilter DPI_PREVENT_ACTIVITY = new EnumCounterFilter(_DPI_PREVENT_ACTIVITY);
    public static final EnumCounterFilter DPI_DETECT_ACTIVITY = new EnumCounterFilter(_DPI_DETECT_ACTIVITY);
    public static final EnumCounterFilter DPI_PREVENT_IP_ACTIVITY = new EnumCounterFilter(_DPI_PREVENT_IP_ACTIVITY);
    public static final EnumCounterFilter DPI_DETECT_IP_ACTIVITY = new EnumCounterFilter(_DPI_DETECT_IP_ACTIVITY);
    public static final EnumCounterFilter DPI_PREVENT_APP_TYPE_ACTIVITY = new EnumCounterFilter(_DPI_PREVENT_APP_TYPE_ACTIVITY);
    public static final EnumCounterFilter DPI_DETECT_APP_TYPE_ACTIVITY = new EnumCounterFilter(_DPI_DETECT_APP_TYPE_ACTIVITY);
    public static final EnumCounterFilter INTEGRITY_ACTIVITY = new EnumCounterFilter(_INTEGRITY_ACTIVITY);
    public static final EnumCounterFilter INTEGRITY_KEY_ACTIVITY = new EnumCounterFilter(_INTEGRITY_KEY_ACTIVITY);
    public static final EnumCounterFilter LOG_INSPECTION_ACTIVITY = new EnumCounterFilter(_LOG_INSPECTION_ACTIVITY);
    public static final EnumCounterFilter LOG_INSPECTION_DESCRIPTION_ACTIVITY = new EnumCounterFilter(_LOG_INSPECTION_DESCRIPTION_ACTIVITY);
    public static final EnumCounterFilter ALERT_TYPE = new EnumCounterFilter(_ALERT_TYPE);
    public static final EnumCounterFilter RECONNAISSANCE_SCAN_ACTIVITY = new EnumCounterFilter(_RECONNAISSANCE_SCAN_ACTIVITY);
    public static final EnumCounterFilter SYSTEM_EVENT_SUMMARY = new EnumCounterFilter(_SYSTEM_EVENT_SUMMARY);
    public static final EnumCounterFilter WEB_REPUTATION_COMPUTER_ACTIVITY = new EnumCounterFilter(_WEB_REPUTATION_COMPUTER_ACTIVITY);
    public static final EnumCounterFilter WEB_REPUTATION_URL_ACTIVITY = new EnumCounterFilter(_WEB_REPUTATION_URL_ACTIVITY);
    public java.lang.String getValue() { return _value_;}
    public static EnumCounterFilter fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumCounterFilter enumeration = (EnumCounterFilter)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumCounterFilter fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumCounterFilter.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumCounterFilter"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
