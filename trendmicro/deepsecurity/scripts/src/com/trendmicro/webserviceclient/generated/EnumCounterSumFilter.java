/**
 * EnumCounterSumFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumCounterSumFilter implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumCounterSumFilter(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FIREWALL_PREVENT_ACTIVITY = "FIREWALL_PREVENT_ACTIVITY";
    public static final java.lang.String _FIREWALL_DETECT_ACTIVITY = "FIREWALL_DETECT_ACTIVITY";
    public static final java.lang.String _FIREWALL_PREVENT_RULES = "FIREWALL_PREVENT_RULES";
    public static final java.lang.String _FIREWALL_DETECT_RULES = "FIREWALL_DETECT_RULES";
    public static final java.lang.String _FIREWALL_PREVENT_COMMON_EVENTS = "FIREWALL_PREVENT_COMMON_EVENTS";
    public static final java.lang.String _FIREWALL_DETECT_COMMON_EVENTS = "FIREWALL_DETECT_COMMON_EVENTS";
    public static final java.lang.String _DPI_PREVENT_ACTIVITY = "DPI_PREVENT_ACTIVITY";
    public static final java.lang.String _DPI_DETECT_ACTIVITY = "DPI_DETECT_ACTIVITY";
    public static final java.lang.String _DPI_PREVENT_RULES = "DPI_PREVENT_RULES";
    public static final java.lang.String _DPI_DETECT_RULES = "DPI_DETECT_RULES";
    public static final java.lang.String _DPI_PREVENT_COMMON_EVENTS = "DPI_PREVENT_COMMON_EVENTS";
    public static final java.lang.String _DPI_DETECT_COMMON_EVENTS = "DPI_DETECT_COMMON_EVENTS";
    public static final java.lang.String _INTEGRITY_ACTIVITY = "INTEGRITY_ACTIVITY";
    public static final java.lang.String _ANTI_MALWARE_ACTIVITY = "ANTI_MALWARE_ACTIVITY";
    public static final java.lang.String _LOG_INSPECTION_ACTIVITY = "LOG_INSPECTION_ACTIVITY";
    public static final java.lang.String _LOG_INSPECTION_SEVERITY_LOW = "LOG_INSPECTION_SEVERITY_LOW";
    public static final java.lang.String _LOG_INSPECTION_SEVERITY_MEDIUM = "LOG_INSPECTION_SEVERITY_MEDIUM";
    public static final java.lang.String _LOG_INSPECTION_SEVERITY_HIGH = "LOG_INSPECTION_SEVERITY_HIGH";
    public static final java.lang.String _LOG_INSPECTION_SEVERITY_CRITICAL = "LOG_INSPECTION_SEVERITY_CRITICAL";
    public static final java.lang.String _INTEGRITY_SEVERITY_LOW = "INTEGRITY_SEVERITY_LOW";
    public static final java.lang.String _INTEGRITY_SEVERITY_MEDIUM = "INTEGRITY_SEVERITY_MEDIUM";
    public static final java.lang.String _INTEGRITY_SEVERITY_HIGH = "INTEGRITY_SEVERITY_HIGH";
    public static final java.lang.String _INTEGRITY_SEVERITY_CRITICAL = "INTEGRITY_SEVERITY_CRITICAL";
    public static final java.lang.String _ANTI_MALWARE_SCANACTION_PASS = "ANTI_MALWARE_SCANACTION_PASS";
    public static final java.lang.String _ANTI_MALWARE_SCANACTION_DELETE = "ANTI_MALWARE_SCANACTION_DELETE";
    public static final java.lang.String _ANTI_MALWARE_SCANACTION_QUARANTINE = "ANTI_MALWARE_SCANACTION_QUARANTINE";
    public static final java.lang.String _ANTI_MALWARE_SCANACTION_CLEAN = "ANTI_MALWARE_SCANACTION_CLEAN";
    public static final java.lang.String _ANTI_MALWARE_SCANACTION_DENY_ACCESS = "ANTI_MALWARE_SCANACTION_DENY_ACCESS";
    public static final java.lang.String _ANTI_MALWARE_SCANACTION_FAILED = "ANTI_MALWARE_SCANACTION_FAILED";
    public static final java.lang.String _WEB_REPUTATION_ACTIVITY = "WEB_REPUTATION_ACTIVITY";
    public static final java.lang.String _WEB_REPUTATION_RISK_UNTESTED = "WEB_REPUTATION_RISK_UNTESTED";
    public static final java.lang.String _WEB_REPUTATION_RISK_BLOCKED = "WEB_REPUTATION_RISK_BLOCKED";
    public static final java.lang.String _WEB_REPUTATION_RISK_SAFE = "WEB_REPUTATION_RISK_SAFE";
    public static final java.lang.String _WEB_REPUTATION_RISK_SUSPICIOUS = "WEB_REPUTATION_RISK_SUSPICIOUS";
    public static final java.lang.String _WEB_REPUTATION_RISK_HIGHLY_SUSPICIOUS = "WEB_REPUTATION_RISK_HIGHLY_SUSPICIOUS";
    public static final java.lang.String _WEB_REPUTATION_RISK_DANGEROUS = "WEB_REPUTATION_RISK_DANGEROUS";
    public static final EnumCounterSumFilter FIREWALL_PREVENT_ACTIVITY = new EnumCounterSumFilter(_FIREWALL_PREVENT_ACTIVITY);
    public static final EnumCounterSumFilter FIREWALL_DETECT_ACTIVITY = new EnumCounterSumFilter(_FIREWALL_DETECT_ACTIVITY);
    public static final EnumCounterSumFilter FIREWALL_PREVENT_RULES = new EnumCounterSumFilter(_FIREWALL_PREVENT_RULES);
    public static final EnumCounterSumFilter FIREWALL_DETECT_RULES = new EnumCounterSumFilter(_FIREWALL_DETECT_RULES);
    public static final EnumCounterSumFilter FIREWALL_PREVENT_COMMON_EVENTS = new EnumCounterSumFilter(_FIREWALL_PREVENT_COMMON_EVENTS);
    public static final EnumCounterSumFilter FIREWALL_DETECT_COMMON_EVENTS = new EnumCounterSumFilter(_FIREWALL_DETECT_COMMON_EVENTS);
    public static final EnumCounterSumFilter DPI_PREVENT_ACTIVITY = new EnumCounterSumFilter(_DPI_PREVENT_ACTIVITY);
    public static final EnumCounterSumFilter DPI_DETECT_ACTIVITY = new EnumCounterSumFilter(_DPI_DETECT_ACTIVITY);
    public static final EnumCounterSumFilter DPI_PREVENT_RULES = new EnumCounterSumFilter(_DPI_PREVENT_RULES);
    public static final EnumCounterSumFilter DPI_DETECT_RULES = new EnumCounterSumFilter(_DPI_DETECT_RULES);
    public static final EnumCounterSumFilter DPI_PREVENT_COMMON_EVENTS = new EnumCounterSumFilter(_DPI_PREVENT_COMMON_EVENTS);
    public static final EnumCounterSumFilter DPI_DETECT_COMMON_EVENTS = new EnumCounterSumFilter(_DPI_DETECT_COMMON_EVENTS);
    public static final EnumCounterSumFilter INTEGRITY_ACTIVITY = new EnumCounterSumFilter(_INTEGRITY_ACTIVITY);
    public static final EnumCounterSumFilter ANTI_MALWARE_ACTIVITY = new EnumCounterSumFilter(_ANTI_MALWARE_ACTIVITY);
    public static final EnumCounterSumFilter LOG_INSPECTION_ACTIVITY = new EnumCounterSumFilter(_LOG_INSPECTION_ACTIVITY);
    public static final EnumCounterSumFilter LOG_INSPECTION_SEVERITY_LOW = new EnumCounterSumFilter(_LOG_INSPECTION_SEVERITY_LOW);
    public static final EnumCounterSumFilter LOG_INSPECTION_SEVERITY_MEDIUM = new EnumCounterSumFilter(_LOG_INSPECTION_SEVERITY_MEDIUM);
    public static final EnumCounterSumFilter LOG_INSPECTION_SEVERITY_HIGH = new EnumCounterSumFilter(_LOG_INSPECTION_SEVERITY_HIGH);
    public static final EnumCounterSumFilter LOG_INSPECTION_SEVERITY_CRITICAL = new EnumCounterSumFilter(_LOG_INSPECTION_SEVERITY_CRITICAL);
    public static final EnumCounterSumFilter INTEGRITY_SEVERITY_LOW = new EnumCounterSumFilter(_INTEGRITY_SEVERITY_LOW);
    public static final EnumCounterSumFilter INTEGRITY_SEVERITY_MEDIUM = new EnumCounterSumFilter(_INTEGRITY_SEVERITY_MEDIUM);
    public static final EnumCounterSumFilter INTEGRITY_SEVERITY_HIGH = new EnumCounterSumFilter(_INTEGRITY_SEVERITY_HIGH);
    public static final EnumCounterSumFilter INTEGRITY_SEVERITY_CRITICAL = new EnumCounterSumFilter(_INTEGRITY_SEVERITY_CRITICAL);
    public static final EnumCounterSumFilter ANTI_MALWARE_SCANACTION_PASS = new EnumCounterSumFilter(_ANTI_MALWARE_SCANACTION_PASS);
    public static final EnumCounterSumFilter ANTI_MALWARE_SCANACTION_DELETE = new EnumCounterSumFilter(_ANTI_MALWARE_SCANACTION_DELETE);
    public static final EnumCounterSumFilter ANTI_MALWARE_SCANACTION_QUARANTINE = new EnumCounterSumFilter(_ANTI_MALWARE_SCANACTION_QUARANTINE);
    public static final EnumCounterSumFilter ANTI_MALWARE_SCANACTION_CLEAN = new EnumCounterSumFilter(_ANTI_MALWARE_SCANACTION_CLEAN);
    public static final EnumCounterSumFilter ANTI_MALWARE_SCANACTION_DENY_ACCESS = new EnumCounterSumFilter(_ANTI_MALWARE_SCANACTION_DENY_ACCESS);
    public static final EnumCounterSumFilter ANTI_MALWARE_SCANACTION_FAILED = new EnumCounterSumFilter(_ANTI_MALWARE_SCANACTION_FAILED);
    public static final EnumCounterSumFilter WEB_REPUTATION_ACTIVITY = new EnumCounterSumFilter(_WEB_REPUTATION_ACTIVITY);
    public static final EnumCounterSumFilter WEB_REPUTATION_RISK_UNTESTED = new EnumCounterSumFilter(_WEB_REPUTATION_RISK_UNTESTED);
    public static final EnumCounterSumFilter WEB_REPUTATION_RISK_BLOCKED = new EnumCounterSumFilter(_WEB_REPUTATION_RISK_BLOCKED);
    public static final EnumCounterSumFilter WEB_REPUTATION_RISK_SAFE = new EnumCounterSumFilter(_WEB_REPUTATION_RISK_SAFE);
    public static final EnumCounterSumFilter WEB_REPUTATION_RISK_SUSPICIOUS = new EnumCounterSumFilter(_WEB_REPUTATION_RISK_SUSPICIOUS);
    public static final EnumCounterSumFilter WEB_REPUTATION_RISK_HIGHLY_SUSPICIOUS = new EnumCounterSumFilter(_WEB_REPUTATION_RISK_HIGHLY_SUSPICIOUS);
    public static final EnumCounterSumFilter WEB_REPUTATION_RISK_DANGEROUS = new EnumCounterSumFilter(_WEB_REPUTATION_RISK_DANGEROUS);
    public java.lang.String getValue() { return _value_;}
    public static EnumCounterSumFilter fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumCounterSumFilter enumeration = (EnumCounterSumFilter)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumCounterSumFilter fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumCounterSumFilter.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumCounterSumFilter"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
