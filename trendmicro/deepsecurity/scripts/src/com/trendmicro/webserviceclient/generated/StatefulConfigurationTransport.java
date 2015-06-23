/**
 * StatefulConfigurationTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class StatefulConfigurationTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private boolean ackStormDropConnection;

    private boolean ackStormProtection;

    private int ackStormProtectionThreshold;

    private boolean allowIncomingActiveFTP;

    private boolean allowIncomingPassiveFTP;

    private boolean allowOutgoingActiveFTP;

    private boolean allowOutgoingPassiveFTP;

    private boolean denyFragmentedPackets;

    private boolean denyTcpCwrEceFlags;

    private boolean enableICMPStatefulInspection;

    private boolean enableICMPStatefulLogging;

    private boolean enableTCPStatefulInspection;

    private boolean enableTCPStatefulLogging;

    private boolean enableUDPStatefulInspection;

    private boolean enableUDPStatefulLogging;

    private boolean limitHalfOpenConnections;

    private int limitHalfOpenConnectionsTo;

    private boolean limitIncomingConnections;

    private int limitIncomingConnectionsTo;

    private boolean limitOutgoingConnections;

    private int limitOutgoingConnectionsTo;

    private boolean synFloodProtection;

    private int synFloodProtectionThreshold;

    public StatefulConfigurationTransport() {
    }

    public StatefulConfigurationTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           boolean ackStormDropConnection,
           boolean ackStormProtection,
           int ackStormProtectionThreshold,
           boolean allowIncomingActiveFTP,
           boolean allowIncomingPassiveFTP,
           boolean allowOutgoingActiveFTP,
           boolean allowOutgoingPassiveFTP,
           boolean denyFragmentedPackets,
           boolean denyTcpCwrEceFlags,
           boolean enableICMPStatefulInspection,
           boolean enableICMPStatefulLogging,
           boolean enableTCPStatefulInspection,
           boolean enableTCPStatefulLogging,
           boolean enableUDPStatefulInspection,
           boolean enableUDPStatefulLogging,
           boolean limitHalfOpenConnections,
           int limitHalfOpenConnectionsTo,
           boolean limitIncomingConnections,
           int limitIncomingConnectionsTo,
           boolean limitOutgoingConnections,
           int limitOutgoingConnectionsTo,
           boolean synFloodProtection,
           int synFloodProtectionThreshold) {
        super(
            ID,
            description,
            name);
        this.ackStormDropConnection = ackStormDropConnection;
        this.ackStormProtection = ackStormProtection;
        this.ackStormProtectionThreshold = ackStormProtectionThreshold;
        this.allowIncomingActiveFTP = allowIncomingActiveFTP;
        this.allowIncomingPassiveFTP = allowIncomingPassiveFTP;
        this.allowOutgoingActiveFTP = allowOutgoingActiveFTP;
        this.allowOutgoingPassiveFTP = allowOutgoingPassiveFTP;
        this.denyFragmentedPackets = denyFragmentedPackets;
        this.denyTcpCwrEceFlags = denyTcpCwrEceFlags;
        this.enableICMPStatefulInspection = enableICMPStatefulInspection;
        this.enableICMPStatefulLogging = enableICMPStatefulLogging;
        this.enableTCPStatefulInspection = enableTCPStatefulInspection;
        this.enableTCPStatefulLogging = enableTCPStatefulLogging;
        this.enableUDPStatefulInspection = enableUDPStatefulInspection;
        this.enableUDPStatefulLogging = enableUDPStatefulLogging;
        this.limitHalfOpenConnections = limitHalfOpenConnections;
        this.limitHalfOpenConnectionsTo = limitHalfOpenConnectionsTo;
        this.limitIncomingConnections = limitIncomingConnections;
        this.limitIncomingConnectionsTo = limitIncomingConnectionsTo;
        this.limitOutgoingConnections = limitOutgoingConnections;
        this.limitOutgoingConnectionsTo = limitOutgoingConnectionsTo;
        this.synFloodProtection = synFloodProtection;
        this.synFloodProtectionThreshold = synFloodProtectionThreshold;
    }


    /**
     * Gets the ackStormDropConnection value for this StatefulConfigurationTransport.
     * 
     * @return ackStormDropConnection
     */
    public boolean isAckStormDropConnection() {
        return ackStormDropConnection;
    }


    /**
     * Sets the ackStormDropConnection value for this StatefulConfigurationTransport.
     * 
     * @param ackStormDropConnection
     */
    public void setAckStormDropConnection(boolean ackStormDropConnection) {
        this.ackStormDropConnection = ackStormDropConnection;
    }


    /**
     * Gets the ackStormProtection value for this StatefulConfigurationTransport.
     * 
     * @return ackStormProtection
     */
    public boolean isAckStormProtection() {
        return ackStormProtection;
    }


    /**
     * Sets the ackStormProtection value for this StatefulConfigurationTransport.
     * 
     * @param ackStormProtection
     */
    public void setAckStormProtection(boolean ackStormProtection) {
        this.ackStormProtection = ackStormProtection;
    }


    /**
     * Gets the ackStormProtectionThreshold value for this StatefulConfigurationTransport.
     * 
     * @return ackStormProtectionThreshold
     */
    public int getAckStormProtectionThreshold() {
        return ackStormProtectionThreshold;
    }


    /**
     * Sets the ackStormProtectionThreshold value for this StatefulConfigurationTransport.
     * 
     * @param ackStormProtectionThreshold
     */
    public void setAckStormProtectionThreshold(int ackStormProtectionThreshold) {
        this.ackStormProtectionThreshold = ackStormProtectionThreshold;
    }


    /**
     * Gets the allowIncomingActiveFTP value for this StatefulConfigurationTransport.
     * 
     * @return allowIncomingActiveFTP
     */
    public boolean isAllowIncomingActiveFTP() {
        return allowIncomingActiveFTP;
    }


    /**
     * Sets the allowIncomingActiveFTP value for this StatefulConfigurationTransport.
     * 
     * @param allowIncomingActiveFTP
     */
    public void setAllowIncomingActiveFTP(boolean allowIncomingActiveFTP) {
        this.allowIncomingActiveFTP = allowIncomingActiveFTP;
    }


    /**
     * Gets the allowIncomingPassiveFTP value for this StatefulConfigurationTransport.
     * 
     * @return allowIncomingPassiveFTP
     */
    public boolean isAllowIncomingPassiveFTP() {
        return allowIncomingPassiveFTP;
    }


    /**
     * Sets the allowIncomingPassiveFTP value for this StatefulConfigurationTransport.
     * 
     * @param allowIncomingPassiveFTP
     */
    public void setAllowIncomingPassiveFTP(boolean allowIncomingPassiveFTP) {
        this.allowIncomingPassiveFTP = allowIncomingPassiveFTP;
    }


    /**
     * Gets the allowOutgoingActiveFTP value for this StatefulConfigurationTransport.
     * 
     * @return allowOutgoingActiveFTP
     */
    public boolean isAllowOutgoingActiveFTP() {
        return allowOutgoingActiveFTP;
    }


    /**
     * Sets the allowOutgoingActiveFTP value for this StatefulConfigurationTransport.
     * 
     * @param allowOutgoingActiveFTP
     */
    public void setAllowOutgoingActiveFTP(boolean allowOutgoingActiveFTP) {
        this.allowOutgoingActiveFTP = allowOutgoingActiveFTP;
    }


    /**
     * Gets the allowOutgoingPassiveFTP value for this StatefulConfigurationTransport.
     * 
     * @return allowOutgoingPassiveFTP
     */
    public boolean isAllowOutgoingPassiveFTP() {
        return allowOutgoingPassiveFTP;
    }


    /**
     * Sets the allowOutgoingPassiveFTP value for this StatefulConfigurationTransport.
     * 
     * @param allowOutgoingPassiveFTP
     */
    public void setAllowOutgoingPassiveFTP(boolean allowOutgoingPassiveFTP) {
        this.allowOutgoingPassiveFTP = allowOutgoingPassiveFTP;
    }


    /**
     * Gets the denyFragmentedPackets value for this StatefulConfigurationTransport.
     * 
     * @return denyFragmentedPackets
     */
    public boolean isDenyFragmentedPackets() {
        return denyFragmentedPackets;
    }


    /**
     * Sets the denyFragmentedPackets value for this StatefulConfigurationTransport.
     * 
     * @param denyFragmentedPackets
     */
    public void setDenyFragmentedPackets(boolean denyFragmentedPackets) {
        this.denyFragmentedPackets = denyFragmentedPackets;
    }


    /**
     * Gets the denyTcpCwrEceFlags value for this StatefulConfigurationTransport.
     * 
     * @return denyTcpCwrEceFlags
     */
    public boolean isDenyTcpCwrEceFlags() {
        return denyTcpCwrEceFlags;
    }


    /**
     * Sets the denyTcpCwrEceFlags value for this StatefulConfigurationTransport.
     * 
     * @param denyTcpCwrEceFlags
     */
    public void setDenyTcpCwrEceFlags(boolean denyTcpCwrEceFlags) {
        this.denyTcpCwrEceFlags = denyTcpCwrEceFlags;
    }


    /**
     * Gets the enableICMPStatefulInspection value for this StatefulConfigurationTransport.
     * 
     * @return enableICMPStatefulInspection
     */
    public boolean isEnableICMPStatefulInspection() {
        return enableICMPStatefulInspection;
    }


    /**
     * Sets the enableICMPStatefulInspection value for this StatefulConfigurationTransport.
     * 
     * @param enableICMPStatefulInspection
     */
    public void setEnableICMPStatefulInspection(boolean enableICMPStatefulInspection) {
        this.enableICMPStatefulInspection = enableICMPStatefulInspection;
    }


    /**
     * Gets the enableICMPStatefulLogging value for this StatefulConfigurationTransport.
     * 
     * @return enableICMPStatefulLogging
     */
    public boolean isEnableICMPStatefulLogging() {
        return enableICMPStatefulLogging;
    }


    /**
     * Sets the enableICMPStatefulLogging value for this StatefulConfigurationTransport.
     * 
     * @param enableICMPStatefulLogging
     */
    public void setEnableICMPStatefulLogging(boolean enableICMPStatefulLogging) {
        this.enableICMPStatefulLogging = enableICMPStatefulLogging;
    }


    /**
     * Gets the enableTCPStatefulInspection value for this StatefulConfigurationTransport.
     * 
     * @return enableTCPStatefulInspection
     */
    public boolean isEnableTCPStatefulInspection() {
        return enableTCPStatefulInspection;
    }


    /**
     * Sets the enableTCPStatefulInspection value for this StatefulConfigurationTransport.
     * 
     * @param enableTCPStatefulInspection
     */
    public void setEnableTCPStatefulInspection(boolean enableTCPStatefulInspection) {
        this.enableTCPStatefulInspection = enableTCPStatefulInspection;
    }


    /**
     * Gets the enableTCPStatefulLogging value for this StatefulConfigurationTransport.
     * 
     * @return enableTCPStatefulLogging
     */
    public boolean isEnableTCPStatefulLogging() {
        return enableTCPStatefulLogging;
    }


    /**
     * Sets the enableTCPStatefulLogging value for this StatefulConfigurationTransport.
     * 
     * @param enableTCPStatefulLogging
     */
    public void setEnableTCPStatefulLogging(boolean enableTCPStatefulLogging) {
        this.enableTCPStatefulLogging = enableTCPStatefulLogging;
    }


    /**
     * Gets the enableUDPStatefulInspection value for this StatefulConfigurationTransport.
     * 
     * @return enableUDPStatefulInspection
     */
    public boolean isEnableUDPStatefulInspection() {
        return enableUDPStatefulInspection;
    }


    /**
     * Sets the enableUDPStatefulInspection value for this StatefulConfigurationTransport.
     * 
     * @param enableUDPStatefulInspection
     */
    public void setEnableUDPStatefulInspection(boolean enableUDPStatefulInspection) {
        this.enableUDPStatefulInspection = enableUDPStatefulInspection;
    }


    /**
     * Gets the enableUDPStatefulLogging value for this StatefulConfigurationTransport.
     * 
     * @return enableUDPStatefulLogging
     */
    public boolean isEnableUDPStatefulLogging() {
        return enableUDPStatefulLogging;
    }


    /**
     * Sets the enableUDPStatefulLogging value for this StatefulConfigurationTransport.
     * 
     * @param enableUDPStatefulLogging
     */
    public void setEnableUDPStatefulLogging(boolean enableUDPStatefulLogging) {
        this.enableUDPStatefulLogging = enableUDPStatefulLogging;
    }


    /**
     * Gets the limitHalfOpenConnections value for this StatefulConfigurationTransport.
     * 
     * @return limitHalfOpenConnections
     */
    public boolean isLimitHalfOpenConnections() {
        return limitHalfOpenConnections;
    }


    /**
     * Sets the limitHalfOpenConnections value for this StatefulConfigurationTransport.
     * 
     * @param limitHalfOpenConnections
     */
    public void setLimitHalfOpenConnections(boolean limitHalfOpenConnections) {
        this.limitHalfOpenConnections = limitHalfOpenConnections;
    }


    /**
     * Gets the limitHalfOpenConnectionsTo value for this StatefulConfigurationTransport.
     * 
     * @return limitHalfOpenConnectionsTo
     */
    public int getLimitHalfOpenConnectionsTo() {
        return limitHalfOpenConnectionsTo;
    }


    /**
     * Sets the limitHalfOpenConnectionsTo value for this StatefulConfigurationTransport.
     * 
     * @param limitHalfOpenConnectionsTo
     */
    public void setLimitHalfOpenConnectionsTo(int limitHalfOpenConnectionsTo) {
        this.limitHalfOpenConnectionsTo = limitHalfOpenConnectionsTo;
    }


    /**
     * Gets the limitIncomingConnections value for this StatefulConfigurationTransport.
     * 
     * @return limitIncomingConnections
     */
    public boolean isLimitIncomingConnections() {
        return limitIncomingConnections;
    }


    /**
     * Sets the limitIncomingConnections value for this StatefulConfigurationTransport.
     * 
     * @param limitIncomingConnections
     */
    public void setLimitIncomingConnections(boolean limitIncomingConnections) {
        this.limitIncomingConnections = limitIncomingConnections;
    }


    /**
     * Gets the limitIncomingConnectionsTo value for this StatefulConfigurationTransport.
     * 
     * @return limitIncomingConnectionsTo
     */
    public int getLimitIncomingConnectionsTo() {
        return limitIncomingConnectionsTo;
    }


    /**
     * Sets the limitIncomingConnectionsTo value for this StatefulConfigurationTransport.
     * 
     * @param limitIncomingConnectionsTo
     */
    public void setLimitIncomingConnectionsTo(int limitIncomingConnectionsTo) {
        this.limitIncomingConnectionsTo = limitIncomingConnectionsTo;
    }


    /**
     * Gets the limitOutgoingConnections value for this StatefulConfigurationTransport.
     * 
     * @return limitOutgoingConnections
     */
    public boolean isLimitOutgoingConnections() {
        return limitOutgoingConnections;
    }


    /**
     * Sets the limitOutgoingConnections value for this StatefulConfigurationTransport.
     * 
     * @param limitOutgoingConnections
     */
    public void setLimitOutgoingConnections(boolean limitOutgoingConnections) {
        this.limitOutgoingConnections = limitOutgoingConnections;
    }


    /**
     * Gets the limitOutgoingConnectionsTo value for this StatefulConfigurationTransport.
     * 
     * @return limitOutgoingConnectionsTo
     */
    public int getLimitOutgoingConnectionsTo() {
        return limitOutgoingConnectionsTo;
    }


    /**
     * Sets the limitOutgoingConnectionsTo value for this StatefulConfigurationTransport.
     * 
     * @param limitOutgoingConnectionsTo
     */
    public void setLimitOutgoingConnectionsTo(int limitOutgoingConnectionsTo) {
        this.limitOutgoingConnectionsTo = limitOutgoingConnectionsTo;
    }


    /**
     * Gets the synFloodProtection value for this StatefulConfigurationTransport.
     * 
     * @return synFloodProtection
     */
    public boolean isSynFloodProtection() {
        return synFloodProtection;
    }


    /**
     * Sets the synFloodProtection value for this StatefulConfigurationTransport.
     * 
     * @param synFloodProtection
     */
    public void setSynFloodProtection(boolean synFloodProtection) {
        this.synFloodProtection = synFloodProtection;
    }


    /**
     * Gets the synFloodProtectionThreshold value for this StatefulConfigurationTransport.
     * 
     * @return synFloodProtectionThreshold
     */
    public int getSynFloodProtectionThreshold() {
        return synFloodProtectionThreshold;
    }


    /**
     * Sets the synFloodProtectionThreshold value for this StatefulConfigurationTransport.
     * 
     * @param synFloodProtectionThreshold
     */
    public void setSynFloodProtectionThreshold(int synFloodProtectionThreshold) {
        this.synFloodProtectionThreshold = synFloodProtectionThreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatefulConfigurationTransport)) return false;
        StatefulConfigurationTransport other = (StatefulConfigurationTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.ackStormDropConnection == other.isAckStormDropConnection() &&
            this.ackStormProtection == other.isAckStormProtection() &&
            this.ackStormProtectionThreshold == other.getAckStormProtectionThreshold() &&
            this.allowIncomingActiveFTP == other.isAllowIncomingActiveFTP() &&
            this.allowIncomingPassiveFTP == other.isAllowIncomingPassiveFTP() &&
            this.allowOutgoingActiveFTP == other.isAllowOutgoingActiveFTP() &&
            this.allowOutgoingPassiveFTP == other.isAllowOutgoingPassiveFTP() &&
            this.denyFragmentedPackets == other.isDenyFragmentedPackets() &&
            this.denyTcpCwrEceFlags == other.isDenyTcpCwrEceFlags() &&
            this.enableICMPStatefulInspection == other.isEnableICMPStatefulInspection() &&
            this.enableICMPStatefulLogging == other.isEnableICMPStatefulLogging() &&
            this.enableTCPStatefulInspection == other.isEnableTCPStatefulInspection() &&
            this.enableTCPStatefulLogging == other.isEnableTCPStatefulLogging() &&
            this.enableUDPStatefulInspection == other.isEnableUDPStatefulInspection() &&
            this.enableUDPStatefulLogging == other.isEnableUDPStatefulLogging() &&
            this.limitHalfOpenConnections == other.isLimitHalfOpenConnections() &&
            this.limitHalfOpenConnectionsTo == other.getLimitHalfOpenConnectionsTo() &&
            this.limitIncomingConnections == other.isLimitIncomingConnections() &&
            this.limitIncomingConnectionsTo == other.getLimitIncomingConnectionsTo() &&
            this.limitOutgoingConnections == other.isLimitOutgoingConnections() &&
            this.limitOutgoingConnectionsTo == other.getLimitOutgoingConnectionsTo() &&
            this.synFloodProtection == other.isSynFloodProtection() &&
            this.synFloodProtectionThreshold == other.getSynFloodProtectionThreshold();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isAckStormDropConnection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAckStormProtection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getAckStormProtectionThreshold();
        _hashCode += (isAllowIncomingActiveFTP() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowIncomingPassiveFTP() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowOutgoingActiveFTP() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowOutgoingPassiveFTP() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDenyFragmentedPackets() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDenyTcpCwrEceFlags() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableICMPStatefulInspection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableICMPStatefulLogging() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableTCPStatefulInspection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableTCPStatefulLogging() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableUDPStatefulInspection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableUDPStatefulLogging() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLimitHalfOpenConnections() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLimitHalfOpenConnectionsTo();
        _hashCode += (isLimitIncomingConnections() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLimitIncomingConnectionsTo();
        _hashCode += (isLimitOutgoingConnections() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLimitOutgoingConnectionsTo();
        _hashCode += (isSynFloodProtection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSynFloodProtectionThreshold();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatefulConfigurationTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "StatefulConfigurationTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackStormDropConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ackStormDropConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackStormProtection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ackStormProtection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackStormProtectionThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ackStormProtectionThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowIncomingActiveFTP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "allowIncomingActiveFTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowIncomingPassiveFTP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "allowIncomingPassiveFTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOutgoingActiveFTP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "allowOutgoingActiveFTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOutgoingPassiveFTP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "allowOutgoingPassiveFTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denyFragmentedPackets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "denyFragmentedPackets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denyTcpCwrEceFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "denyTcpCwrEceFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableICMPStatefulInspection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "enableICMPStatefulInspection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableICMPStatefulLogging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "enableICMPStatefulLogging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableTCPStatefulInspection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "enableTCPStatefulInspection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableTCPStatefulLogging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "enableTCPStatefulLogging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableUDPStatefulInspection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "enableUDPStatefulInspection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableUDPStatefulLogging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "enableUDPStatefulLogging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitHalfOpenConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "limitHalfOpenConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitHalfOpenConnectionsTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "limitHalfOpenConnectionsTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitIncomingConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "limitIncomingConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitIncomingConnectionsTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "limitIncomingConnectionsTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitOutgoingConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "limitOutgoingConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitOutgoingConnectionsTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "limitOutgoingConnectionsTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synFloodProtection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "synFloodProtection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synFloodProtectionThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "synFloodProtectionThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
