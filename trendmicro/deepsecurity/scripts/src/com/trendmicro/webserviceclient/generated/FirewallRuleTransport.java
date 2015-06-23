/**
 * FirewallRuleTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class FirewallRuleTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.EnumFirewallRuleAction action;

    private boolean anyFlags;

    private java.lang.String destinationIP;

    private java.lang.Integer destinationIPListID;

    private java.lang.String destinationIPMask;

    private boolean destinationIPNot;

    private java.lang.String destinationIPRangeFrom;

    private java.lang.String destinationIPRangeTo;

    private com.trendmicro.webserviceclient.generated.EnumFirewallRuleIPType destinationIPType;

    private java.lang.String destinationMAC;

    private java.lang.Integer destinationMACListID;

    private boolean destinationMACNot;

    private com.trendmicro.webserviceclient.generated.EnumMACType destinationMACType;

    private java.lang.Integer destinationPortListID;

    private boolean destinationPortNot;

    private com.trendmicro.webserviceclient.generated.EnumPortType destinationPortType;

    private java.lang.String destinationPorts;

    private java.lang.String destinationSingleIP;

    private boolean disabledLog;

    private boolean frameNot;

    private java.lang.String frameNumber;

    private com.trendmicro.webserviceclient.generated.EnumFirewallRuleFrameType frameType;

    private int icmpCode;

    private boolean icmpNot;

    private int icmpType;

    private com.trendmicro.webserviceclient.generated.EnumDirection packetDirection;

    private com.trendmicro.webserviceclient.generated.EnumFirewallRulePriority priority;

    private boolean protocolNot;

    private int protocolNumber;

    private com.trendmicro.webserviceclient.generated.EnumFirewallRuleProtocolType protocolType;

    private boolean raiseAlert;

    private java.lang.Integer scheduleID;

    private java.lang.String sourceIP;

    private java.lang.Integer sourceIPListID;

    private java.lang.String sourceIPMask;

    private boolean sourceIPNot;

    private java.lang.String sourceIPRangeFrom;

    private java.lang.String sourceIPRangeTo;

    private com.trendmicro.webserviceclient.generated.EnumFirewallRuleIPType sourceIPType;

    private java.lang.String sourceMAC;

    private java.lang.Integer sourceMACListID;

    private boolean sourceMACNot;

    private com.trendmicro.webserviceclient.generated.EnumMACType sourceMACType;

    private java.lang.Integer sourcePortListID;

    private boolean sourcePortNot;

    private com.trendmicro.webserviceclient.generated.EnumPortType sourcePortType;

    private java.lang.String sourcePorts;

    private java.lang.String sourceSingleIP;

    private boolean tcpFlagACK;

    private boolean tcpFlagFIN;

    private boolean tcpFlagPSH;

    private boolean tcpFlagRST;

    private boolean tcpFlagSYN;

    private boolean tcpFlagURG;

    private boolean tcpNot;

    public FirewallRuleTransport() {
    }

    public FirewallRuleTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           com.trendmicro.webserviceclient.generated.EnumFirewallRuleAction action,
           boolean anyFlags,
           java.lang.String destinationIP,
           java.lang.Integer destinationIPListID,
           java.lang.String destinationIPMask,
           boolean destinationIPNot,
           java.lang.String destinationIPRangeFrom,
           java.lang.String destinationIPRangeTo,
           com.trendmicro.webserviceclient.generated.EnumFirewallRuleIPType destinationIPType,
           java.lang.String destinationMAC,
           java.lang.Integer destinationMACListID,
           boolean destinationMACNot,
           com.trendmicro.webserviceclient.generated.EnumMACType destinationMACType,
           java.lang.Integer destinationPortListID,
           boolean destinationPortNot,
           com.trendmicro.webserviceclient.generated.EnumPortType destinationPortType,
           java.lang.String destinationPorts,
           java.lang.String destinationSingleIP,
           boolean disabledLog,
           boolean frameNot,
           java.lang.String frameNumber,
           com.trendmicro.webserviceclient.generated.EnumFirewallRuleFrameType frameType,
           int icmpCode,
           boolean icmpNot,
           int icmpType,
           com.trendmicro.webserviceclient.generated.EnumDirection packetDirection,
           com.trendmicro.webserviceclient.generated.EnumFirewallRulePriority priority,
           boolean protocolNot,
           int protocolNumber,
           com.trendmicro.webserviceclient.generated.EnumFirewallRuleProtocolType protocolType,
           boolean raiseAlert,
           java.lang.Integer scheduleID,
           java.lang.String sourceIP,
           java.lang.Integer sourceIPListID,
           java.lang.String sourceIPMask,
           boolean sourceIPNot,
           java.lang.String sourceIPRangeFrom,
           java.lang.String sourceIPRangeTo,
           com.trendmicro.webserviceclient.generated.EnumFirewallRuleIPType sourceIPType,
           java.lang.String sourceMAC,
           java.lang.Integer sourceMACListID,
           boolean sourceMACNot,
           com.trendmicro.webserviceclient.generated.EnumMACType sourceMACType,
           java.lang.Integer sourcePortListID,
           boolean sourcePortNot,
           com.trendmicro.webserviceclient.generated.EnumPortType sourcePortType,
           java.lang.String sourcePorts,
           java.lang.String sourceSingleIP,
           boolean tcpFlagACK,
           boolean tcpFlagFIN,
           boolean tcpFlagPSH,
           boolean tcpFlagRST,
           boolean tcpFlagSYN,
           boolean tcpFlagURG,
           boolean tcpNot) {
        super(
            ID,
            description,
            name);
        this.action = action;
        this.anyFlags = anyFlags;
        this.destinationIP = destinationIP;
        this.destinationIPListID = destinationIPListID;
        this.destinationIPMask = destinationIPMask;
        this.destinationIPNot = destinationIPNot;
        this.destinationIPRangeFrom = destinationIPRangeFrom;
        this.destinationIPRangeTo = destinationIPRangeTo;
        this.destinationIPType = destinationIPType;
        this.destinationMAC = destinationMAC;
        this.destinationMACListID = destinationMACListID;
        this.destinationMACNot = destinationMACNot;
        this.destinationMACType = destinationMACType;
        this.destinationPortListID = destinationPortListID;
        this.destinationPortNot = destinationPortNot;
        this.destinationPortType = destinationPortType;
        this.destinationPorts = destinationPorts;
        this.destinationSingleIP = destinationSingleIP;
        this.disabledLog = disabledLog;
        this.frameNot = frameNot;
        this.frameNumber = frameNumber;
        this.frameType = frameType;
        this.icmpCode = icmpCode;
        this.icmpNot = icmpNot;
        this.icmpType = icmpType;
        this.packetDirection = packetDirection;
        this.priority = priority;
        this.protocolNot = protocolNot;
        this.protocolNumber = protocolNumber;
        this.protocolType = protocolType;
        this.raiseAlert = raiseAlert;
        this.scheduleID = scheduleID;
        this.sourceIP = sourceIP;
        this.sourceIPListID = sourceIPListID;
        this.sourceIPMask = sourceIPMask;
        this.sourceIPNot = sourceIPNot;
        this.sourceIPRangeFrom = sourceIPRangeFrom;
        this.sourceIPRangeTo = sourceIPRangeTo;
        this.sourceIPType = sourceIPType;
        this.sourceMAC = sourceMAC;
        this.sourceMACListID = sourceMACListID;
        this.sourceMACNot = sourceMACNot;
        this.sourceMACType = sourceMACType;
        this.sourcePortListID = sourcePortListID;
        this.sourcePortNot = sourcePortNot;
        this.sourcePortType = sourcePortType;
        this.sourcePorts = sourcePorts;
        this.sourceSingleIP = sourceSingleIP;
        this.tcpFlagACK = tcpFlagACK;
        this.tcpFlagFIN = tcpFlagFIN;
        this.tcpFlagPSH = tcpFlagPSH;
        this.tcpFlagRST = tcpFlagRST;
        this.tcpFlagSYN = tcpFlagSYN;
        this.tcpFlagURG = tcpFlagURG;
        this.tcpNot = tcpNot;
    }


    /**
     * Gets the action value for this FirewallRuleTransport.
     * 
     * @return action
     */
    public com.trendmicro.webserviceclient.generated.EnumFirewallRuleAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this FirewallRuleTransport.
     * 
     * @param action
     */
    public void setAction(com.trendmicro.webserviceclient.generated.EnumFirewallRuleAction action) {
        this.action = action;
    }


    /**
     * Gets the anyFlags value for this FirewallRuleTransport.
     * 
     * @return anyFlags
     */
    public boolean isAnyFlags() {
        return anyFlags;
    }


    /**
     * Sets the anyFlags value for this FirewallRuleTransport.
     * 
     * @param anyFlags
     */
    public void setAnyFlags(boolean anyFlags) {
        this.anyFlags = anyFlags;
    }


    /**
     * Gets the destinationIP value for this FirewallRuleTransport.
     * 
     * @return destinationIP
     */
    public java.lang.String getDestinationIP() {
        return destinationIP;
    }


    /**
     * Sets the destinationIP value for this FirewallRuleTransport.
     * 
     * @param destinationIP
     */
    public void setDestinationIP(java.lang.String destinationIP) {
        this.destinationIP = destinationIP;
    }


    /**
     * Gets the destinationIPListID value for this FirewallRuleTransport.
     * 
     * @return destinationIPListID
     */
    public java.lang.Integer getDestinationIPListID() {
        return destinationIPListID;
    }


    /**
     * Sets the destinationIPListID value for this FirewallRuleTransport.
     * 
     * @param destinationIPListID
     */
    public void setDestinationIPListID(java.lang.Integer destinationIPListID) {
        this.destinationIPListID = destinationIPListID;
    }


    /**
     * Gets the destinationIPMask value for this FirewallRuleTransport.
     * 
     * @return destinationIPMask
     */
    public java.lang.String getDestinationIPMask() {
        return destinationIPMask;
    }


    /**
     * Sets the destinationIPMask value for this FirewallRuleTransport.
     * 
     * @param destinationIPMask
     */
    public void setDestinationIPMask(java.lang.String destinationIPMask) {
        this.destinationIPMask = destinationIPMask;
    }


    /**
     * Gets the destinationIPNot value for this FirewallRuleTransport.
     * 
     * @return destinationIPNot
     */
    public boolean isDestinationIPNot() {
        return destinationIPNot;
    }


    /**
     * Sets the destinationIPNot value for this FirewallRuleTransport.
     * 
     * @param destinationIPNot
     */
    public void setDestinationIPNot(boolean destinationIPNot) {
        this.destinationIPNot = destinationIPNot;
    }


    /**
     * Gets the destinationIPRangeFrom value for this FirewallRuleTransport.
     * 
     * @return destinationIPRangeFrom
     */
    public java.lang.String getDestinationIPRangeFrom() {
        return destinationIPRangeFrom;
    }


    /**
     * Sets the destinationIPRangeFrom value for this FirewallRuleTransport.
     * 
     * @param destinationIPRangeFrom
     */
    public void setDestinationIPRangeFrom(java.lang.String destinationIPRangeFrom) {
        this.destinationIPRangeFrom = destinationIPRangeFrom;
    }


    /**
     * Gets the destinationIPRangeTo value for this FirewallRuleTransport.
     * 
     * @return destinationIPRangeTo
     */
    public java.lang.String getDestinationIPRangeTo() {
        return destinationIPRangeTo;
    }


    /**
     * Sets the destinationIPRangeTo value for this FirewallRuleTransport.
     * 
     * @param destinationIPRangeTo
     */
    public void setDestinationIPRangeTo(java.lang.String destinationIPRangeTo) {
        this.destinationIPRangeTo = destinationIPRangeTo;
    }


    /**
     * Gets the destinationIPType value for this FirewallRuleTransport.
     * 
     * @return destinationIPType
     */
    public com.trendmicro.webserviceclient.generated.EnumFirewallRuleIPType getDestinationIPType() {
        return destinationIPType;
    }


    /**
     * Sets the destinationIPType value for this FirewallRuleTransport.
     * 
     * @param destinationIPType
     */
    public void setDestinationIPType(com.trendmicro.webserviceclient.generated.EnumFirewallRuleIPType destinationIPType) {
        this.destinationIPType = destinationIPType;
    }


    /**
     * Gets the destinationMAC value for this FirewallRuleTransport.
     * 
     * @return destinationMAC
     */
    public java.lang.String getDestinationMAC() {
        return destinationMAC;
    }


    /**
     * Sets the destinationMAC value for this FirewallRuleTransport.
     * 
     * @param destinationMAC
     */
    public void setDestinationMAC(java.lang.String destinationMAC) {
        this.destinationMAC = destinationMAC;
    }


    /**
     * Gets the destinationMACListID value for this FirewallRuleTransport.
     * 
     * @return destinationMACListID
     */
    public java.lang.Integer getDestinationMACListID() {
        return destinationMACListID;
    }


    /**
     * Sets the destinationMACListID value for this FirewallRuleTransport.
     * 
     * @param destinationMACListID
     */
    public void setDestinationMACListID(java.lang.Integer destinationMACListID) {
        this.destinationMACListID = destinationMACListID;
    }


    /**
     * Gets the destinationMACNot value for this FirewallRuleTransport.
     * 
     * @return destinationMACNot
     */
    public boolean isDestinationMACNot() {
        return destinationMACNot;
    }


    /**
     * Sets the destinationMACNot value for this FirewallRuleTransport.
     * 
     * @param destinationMACNot
     */
    public void setDestinationMACNot(boolean destinationMACNot) {
        this.destinationMACNot = destinationMACNot;
    }


    /**
     * Gets the destinationMACType value for this FirewallRuleTransport.
     * 
     * @return destinationMACType
     */
    public com.trendmicro.webserviceclient.generated.EnumMACType getDestinationMACType() {
        return destinationMACType;
    }


    /**
     * Sets the destinationMACType value for this FirewallRuleTransport.
     * 
     * @param destinationMACType
     */
    public void setDestinationMACType(com.trendmicro.webserviceclient.generated.EnumMACType destinationMACType) {
        this.destinationMACType = destinationMACType;
    }


    /**
     * Gets the destinationPortListID value for this FirewallRuleTransport.
     * 
     * @return destinationPortListID
     */
    public java.lang.Integer getDestinationPortListID() {
        return destinationPortListID;
    }


    /**
     * Sets the destinationPortListID value for this FirewallRuleTransport.
     * 
     * @param destinationPortListID
     */
    public void setDestinationPortListID(java.lang.Integer destinationPortListID) {
        this.destinationPortListID = destinationPortListID;
    }


    /**
     * Gets the destinationPortNot value for this FirewallRuleTransport.
     * 
     * @return destinationPortNot
     */
    public boolean isDestinationPortNot() {
        return destinationPortNot;
    }


    /**
     * Sets the destinationPortNot value for this FirewallRuleTransport.
     * 
     * @param destinationPortNot
     */
    public void setDestinationPortNot(boolean destinationPortNot) {
        this.destinationPortNot = destinationPortNot;
    }


    /**
     * Gets the destinationPortType value for this FirewallRuleTransport.
     * 
     * @return destinationPortType
     */
    public com.trendmicro.webserviceclient.generated.EnumPortType getDestinationPortType() {
        return destinationPortType;
    }


    /**
     * Sets the destinationPortType value for this FirewallRuleTransport.
     * 
     * @param destinationPortType
     */
    public void setDestinationPortType(com.trendmicro.webserviceclient.generated.EnumPortType destinationPortType) {
        this.destinationPortType = destinationPortType;
    }


    /**
     * Gets the destinationPorts value for this FirewallRuleTransport.
     * 
     * @return destinationPorts
     */
    public java.lang.String getDestinationPorts() {
        return destinationPorts;
    }


    /**
     * Sets the destinationPorts value for this FirewallRuleTransport.
     * 
     * @param destinationPorts
     */
    public void setDestinationPorts(java.lang.String destinationPorts) {
        this.destinationPorts = destinationPorts;
    }


    /**
     * Gets the destinationSingleIP value for this FirewallRuleTransport.
     * 
     * @return destinationSingleIP
     */
    public java.lang.String getDestinationSingleIP() {
        return destinationSingleIP;
    }


    /**
     * Sets the destinationSingleIP value for this FirewallRuleTransport.
     * 
     * @param destinationSingleIP
     */
    public void setDestinationSingleIP(java.lang.String destinationSingleIP) {
        this.destinationSingleIP = destinationSingleIP;
    }


    /**
     * Gets the disabledLog value for this FirewallRuleTransport.
     * 
     * @return disabledLog
     */
    public boolean isDisabledLog() {
        return disabledLog;
    }


    /**
     * Sets the disabledLog value for this FirewallRuleTransport.
     * 
     * @param disabledLog
     */
    public void setDisabledLog(boolean disabledLog) {
        this.disabledLog = disabledLog;
    }


    /**
     * Gets the frameNot value for this FirewallRuleTransport.
     * 
     * @return frameNot
     */
    public boolean isFrameNot() {
        return frameNot;
    }


    /**
     * Sets the frameNot value for this FirewallRuleTransport.
     * 
     * @param frameNot
     */
    public void setFrameNot(boolean frameNot) {
        this.frameNot = frameNot;
    }


    /**
     * Gets the frameNumber value for this FirewallRuleTransport.
     * 
     * @return frameNumber
     */
    public java.lang.String getFrameNumber() {
        return frameNumber;
    }


    /**
     * Sets the frameNumber value for this FirewallRuleTransport.
     * 
     * @param frameNumber
     */
    public void setFrameNumber(java.lang.String frameNumber) {
        this.frameNumber = frameNumber;
    }


    /**
     * Gets the frameType value for this FirewallRuleTransport.
     * 
     * @return frameType
     */
    public com.trendmicro.webserviceclient.generated.EnumFirewallRuleFrameType getFrameType() {
        return frameType;
    }


    /**
     * Sets the frameType value for this FirewallRuleTransport.
     * 
     * @param frameType
     */
    public void setFrameType(com.trendmicro.webserviceclient.generated.EnumFirewallRuleFrameType frameType) {
        this.frameType = frameType;
    }


    /**
     * Gets the icmpCode value for this FirewallRuleTransport.
     * 
     * @return icmpCode
     */
    public int getIcmpCode() {
        return icmpCode;
    }


    /**
     * Sets the icmpCode value for this FirewallRuleTransport.
     * 
     * @param icmpCode
     */
    public void setIcmpCode(int icmpCode) {
        this.icmpCode = icmpCode;
    }


    /**
     * Gets the icmpNot value for this FirewallRuleTransport.
     * 
     * @return icmpNot
     */
    public boolean isIcmpNot() {
        return icmpNot;
    }


    /**
     * Sets the icmpNot value for this FirewallRuleTransport.
     * 
     * @param icmpNot
     */
    public void setIcmpNot(boolean icmpNot) {
        this.icmpNot = icmpNot;
    }


    /**
     * Gets the icmpType value for this FirewallRuleTransport.
     * 
     * @return icmpType
     */
    public int getIcmpType() {
        return icmpType;
    }


    /**
     * Sets the icmpType value for this FirewallRuleTransport.
     * 
     * @param icmpType
     */
    public void setIcmpType(int icmpType) {
        this.icmpType = icmpType;
    }


    /**
     * Gets the packetDirection value for this FirewallRuleTransport.
     * 
     * @return packetDirection
     */
    public com.trendmicro.webserviceclient.generated.EnumDirection getPacketDirection() {
        return packetDirection;
    }


    /**
     * Sets the packetDirection value for this FirewallRuleTransport.
     * 
     * @param packetDirection
     */
    public void setPacketDirection(com.trendmicro.webserviceclient.generated.EnumDirection packetDirection) {
        this.packetDirection = packetDirection;
    }


    /**
     * Gets the priority value for this FirewallRuleTransport.
     * 
     * @return priority
     */
    public com.trendmicro.webserviceclient.generated.EnumFirewallRulePriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this FirewallRuleTransport.
     * 
     * @param priority
     */
    public void setPriority(com.trendmicro.webserviceclient.generated.EnumFirewallRulePriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the protocolNot value for this FirewallRuleTransport.
     * 
     * @return protocolNot
     */
    public boolean isProtocolNot() {
        return protocolNot;
    }


    /**
     * Sets the protocolNot value for this FirewallRuleTransport.
     * 
     * @param protocolNot
     */
    public void setProtocolNot(boolean protocolNot) {
        this.protocolNot = protocolNot;
    }


    /**
     * Gets the protocolNumber value for this FirewallRuleTransport.
     * 
     * @return protocolNumber
     */
    public int getProtocolNumber() {
        return protocolNumber;
    }


    /**
     * Sets the protocolNumber value for this FirewallRuleTransport.
     * 
     * @param protocolNumber
     */
    public void setProtocolNumber(int protocolNumber) {
        this.protocolNumber = protocolNumber;
    }


    /**
     * Gets the protocolType value for this FirewallRuleTransport.
     * 
     * @return protocolType
     */
    public com.trendmicro.webserviceclient.generated.EnumFirewallRuleProtocolType getProtocolType() {
        return protocolType;
    }


    /**
     * Sets the protocolType value for this FirewallRuleTransport.
     * 
     * @param protocolType
     */
    public void setProtocolType(com.trendmicro.webserviceclient.generated.EnumFirewallRuleProtocolType protocolType) {
        this.protocolType = protocolType;
    }


    /**
     * Gets the raiseAlert value for this FirewallRuleTransport.
     * 
     * @return raiseAlert
     */
    public boolean isRaiseAlert() {
        return raiseAlert;
    }


    /**
     * Sets the raiseAlert value for this FirewallRuleTransport.
     * 
     * @param raiseAlert
     */
    public void setRaiseAlert(boolean raiseAlert) {
        this.raiseAlert = raiseAlert;
    }


    /**
     * Gets the scheduleID value for this FirewallRuleTransport.
     * 
     * @return scheduleID
     */
    public java.lang.Integer getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this FirewallRuleTransport.
     * 
     * @param scheduleID
     */
    public void setScheduleID(java.lang.Integer scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the sourceIP value for this FirewallRuleTransport.
     * 
     * @return sourceIP
     */
    public java.lang.String getSourceIP() {
        return sourceIP;
    }


    /**
     * Sets the sourceIP value for this FirewallRuleTransport.
     * 
     * @param sourceIP
     */
    public void setSourceIP(java.lang.String sourceIP) {
        this.sourceIP = sourceIP;
    }


    /**
     * Gets the sourceIPListID value for this FirewallRuleTransport.
     * 
     * @return sourceIPListID
     */
    public java.lang.Integer getSourceIPListID() {
        return sourceIPListID;
    }


    /**
     * Sets the sourceIPListID value for this FirewallRuleTransport.
     * 
     * @param sourceIPListID
     */
    public void setSourceIPListID(java.lang.Integer sourceIPListID) {
        this.sourceIPListID = sourceIPListID;
    }


    /**
     * Gets the sourceIPMask value for this FirewallRuleTransport.
     * 
     * @return sourceIPMask
     */
    public java.lang.String getSourceIPMask() {
        return sourceIPMask;
    }


    /**
     * Sets the sourceIPMask value for this FirewallRuleTransport.
     * 
     * @param sourceIPMask
     */
    public void setSourceIPMask(java.lang.String sourceIPMask) {
        this.sourceIPMask = sourceIPMask;
    }


    /**
     * Gets the sourceIPNot value for this FirewallRuleTransport.
     * 
     * @return sourceIPNot
     */
    public boolean isSourceIPNot() {
        return sourceIPNot;
    }


    /**
     * Sets the sourceIPNot value for this FirewallRuleTransport.
     * 
     * @param sourceIPNot
     */
    public void setSourceIPNot(boolean sourceIPNot) {
        this.sourceIPNot = sourceIPNot;
    }


    /**
     * Gets the sourceIPRangeFrom value for this FirewallRuleTransport.
     * 
     * @return sourceIPRangeFrom
     */
    public java.lang.String getSourceIPRangeFrom() {
        return sourceIPRangeFrom;
    }


    /**
     * Sets the sourceIPRangeFrom value for this FirewallRuleTransport.
     * 
     * @param sourceIPRangeFrom
     */
    public void setSourceIPRangeFrom(java.lang.String sourceIPRangeFrom) {
        this.sourceIPRangeFrom = sourceIPRangeFrom;
    }


    /**
     * Gets the sourceIPRangeTo value for this FirewallRuleTransport.
     * 
     * @return sourceIPRangeTo
     */
    public java.lang.String getSourceIPRangeTo() {
        return sourceIPRangeTo;
    }


    /**
     * Sets the sourceIPRangeTo value for this FirewallRuleTransport.
     * 
     * @param sourceIPRangeTo
     */
    public void setSourceIPRangeTo(java.lang.String sourceIPRangeTo) {
        this.sourceIPRangeTo = sourceIPRangeTo;
    }


    /**
     * Gets the sourceIPType value for this FirewallRuleTransport.
     * 
     * @return sourceIPType
     */
    public com.trendmicro.webserviceclient.generated.EnumFirewallRuleIPType getSourceIPType() {
        return sourceIPType;
    }


    /**
     * Sets the sourceIPType value for this FirewallRuleTransport.
     * 
     * @param sourceIPType
     */
    public void setSourceIPType(com.trendmicro.webserviceclient.generated.EnumFirewallRuleIPType sourceIPType) {
        this.sourceIPType = sourceIPType;
    }


    /**
     * Gets the sourceMAC value for this FirewallRuleTransport.
     * 
     * @return sourceMAC
     */
    public java.lang.String getSourceMAC() {
        return sourceMAC;
    }


    /**
     * Sets the sourceMAC value for this FirewallRuleTransport.
     * 
     * @param sourceMAC
     */
    public void setSourceMAC(java.lang.String sourceMAC) {
        this.sourceMAC = sourceMAC;
    }


    /**
     * Gets the sourceMACListID value for this FirewallRuleTransport.
     * 
     * @return sourceMACListID
     */
    public java.lang.Integer getSourceMACListID() {
        return sourceMACListID;
    }


    /**
     * Sets the sourceMACListID value for this FirewallRuleTransport.
     * 
     * @param sourceMACListID
     */
    public void setSourceMACListID(java.lang.Integer sourceMACListID) {
        this.sourceMACListID = sourceMACListID;
    }


    /**
     * Gets the sourceMACNot value for this FirewallRuleTransport.
     * 
     * @return sourceMACNot
     */
    public boolean isSourceMACNot() {
        return sourceMACNot;
    }


    /**
     * Sets the sourceMACNot value for this FirewallRuleTransport.
     * 
     * @param sourceMACNot
     */
    public void setSourceMACNot(boolean sourceMACNot) {
        this.sourceMACNot = sourceMACNot;
    }


    /**
     * Gets the sourceMACType value for this FirewallRuleTransport.
     * 
     * @return sourceMACType
     */
    public com.trendmicro.webserviceclient.generated.EnumMACType getSourceMACType() {
        return sourceMACType;
    }


    /**
     * Sets the sourceMACType value for this FirewallRuleTransport.
     * 
     * @param sourceMACType
     */
    public void setSourceMACType(com.trendmicro.webserviceclient.generated.EnumMACType sourceMACType) {
        this.sourceMACType = sourceMACType;
    }


    /**
     * Gets the sourcePortListID value for this FirewallRuleTransport.
     * 
     * @return sourcePortListID
     */
    public java.lang.Integer getSourcePortListID() {
        return sourcePortListID;
    }


    /**
     * Sets the sourcePortListID value for this FirewallRuleTransport.
     * 
     * @param sourcePortListID
     */
    public void setSourcePortListID(java.lang.Integer sourcePortListID) {
        this.sourcePortListID = sourcePortListID;
    }


    /**
     * Gets the sourcePortNot value for this FirewallRuleTransport.
     * 
     * @return sourcePortNot
     */
    public boolean isSourcePortNot() {
        return sourcePortNot;
    }


    /**
     * Sets the sourcePortNot value for this FirewallRuleTransport.
     * 
     * @param sourcePortNot
     */
    public void setSourcePortNot(boolean sourcePortNot) {
        this.sourcePortNot = sourcePortNot;
    }


    /**
     * Gets the sourcePortType value for this FirewallRuleTransport.
     * 
     * @return sourcePortType
     */
    public com.trendmicro.webserviceclient.generated.EnumPortType getSourcePortType() {
        return sourcePortType;
    }


    /**
     * Sets the sourcePortType value for this FirewallRuleTransport.
     * 
     * @param sourcePortType
     */
    public void setSourcePortType(com.trendmicro.webserviceclient.generated.EnumPortType sourcePortType) {
        this.sourcePortType = sourcePortType;
    }


    /**
     * Gets the sourcePorts value for this FirewallRuleTransport.
     * 
     * @return sourcePorts
     */
    public java.lang.String getSourcePorts() {
        return sourcePorts;
    }


    /**
     * Sets the sourcePorts value for this FirewallRuleTransport.
     * 
     * @param sourcePorts
     */
    public void setSourcePorts(java.lang.String sourcePorts) {
        this.sourcePorts = sourcePorts;
    }


    /**
     * Gets the sourceSingleIP value for this FirewallRuleTransport.
     * 
     * @return sourceSingleIP
     */
    public java.lang.String getSourceSingleIP() {
        return sourceSingleIP;
    }


    /**
     * Sets the sourceSingleIP value for this FirewallRuleTransport.
     * 
     * @param sourceSingleIP
     */
    public void setSourceSingleIP(java.lang.String sourceSingleIP) {
        this.sourceSingleIP = sourceSingleIP;
    }


    /**
     * Gets the tcpFlagACK value for this FirewallRuleTransport.
     * 
     * @return tcpFlagACK
     */
    public boolean isTcpFlagACK() {
        return tcpFlagACK;
    }


    /**
     * Sets the tcpFlagACK value for this FirewallRuleTransport.
     * 
     * @param tcpFlagACK
     */
    public void setTcpFlagACK(boolean tcpFlagACK) {
        this.tcpFlagACK = tcpFlagACK;
    }


    /**
     * Gets the tcpFlagFIN value for this FirewallRuleTransport.
     * 
     * @return tcpFlagFIN
     */
    public boolean isTcpFlagFIN() {
        return tcpFlagFIN;
    }


    /**
     * Sets the tcpFlagFIN value for this FirewallRuleTransport.
     * 
     * @param tcpFlagFIN
     */
    public void setTcpFlagFIN(boolean tcpFlagFIN) {
        this.tcpFlagFIN = tcpFlagFIN;
    }


    /**
     * Gets the tcpFlagPSH value for this FirewallRuleTransport.
     * 
     * @return tcpFlagPSH
     */
    public boolean isTcpFlagPSH() {
        return tcpFlagPSH;
    }


    /**
     * Sets the tcpFlagPSH value for this FirewallRuleTransport.
     * 
     * @param tcpFlagPSH
     */
    public void setTcpFlagPSH(boolean tcpFlagPSH) {
        this.tcpFlagPSH = tcpFlagPSH;
    }


    /**
     * Gets the tcpFlagRST value for this FirewallRuleTransport.
     * 
     * @return tcpFlagRST
     */
    public boolean isTcpFlagRST() {
        return tcpFlagRST;
    }


    /**
     * Sets the tcpFlagRST value for this FirewallRuleTransport.
     * 
     * @param tcpFlagRST
     */
    public void setTcpFlagRST(boolean tcpFlagRST) {
        this.tcpFlagRST = tcpFlagRST;
    }


    /**
     * Gets the tcpFlagSYN value for this FirewallRuleTransport.
     * 
     * @return tcpFlagSYN
     */
    public boolean isTcpFlagSYN() {
        return tcpFlagSYN;
    }


    /**
     * Sets the tcpFlagSYN value for this FirewallRuleTransport.
     * 
     * @param tcpFlagSYN
     */
    public void setTcpFlagSYN(boolean tcpFlagSYN) {
        this.tcpFlagSYN = tcpFlagSYN;
    }


    /**
     * Gets the tcpFlagURG value for this FirewallRuleTransport.
     * 
     * @return tcpFlagURG
     */
    public boolean isTcpFlagURG() {
        return tcpFlagURG;
    }


    /**
     * Sets the tcpFlagURG value for this FirewallRuleTransport.
     * 
     * @param tcpFlagURG
     */
    public void setTcpFlagURG(boolean tcpFlagURG) {
        this.tcpFlagURG = tcpFlagURG;
    }


    /**
     * Gets the tcpNot value for this FirewallRuleTransport.
     * 
     * @return tcpNot
     */
    public boolean isTcpNot() {
        return tcpNot;
    }


    /**
     * Sets the tcpNot value for this FirewallRuleTransport.
     * 
     * @param tcpNot
     */
    public void setTcpNot(boolean tcpNot) {
        this.tcpNot = tcpNot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirewallRuleTransport)) return false;
        FirewallRuleTransport other = (FirewallRuleTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            this.anyFlags == other.isAnyFlags() &&
            ((this.destinationIP==null && other.getDestinationIP()==null) || 
             (this.destinationIP!=null &&
              this.destinationIP.equals(other.getDestinationIP()))) &&
            ((this.destinationIPListID==null && other.getDestinationIPListID()==null) || 
             (this.destinationIPListID!=null &&
              this.destinationIPListID.equals(other.getDestinationIPListID()))) &&
            ((this.destinationIPMask==null && other.getDestinationIPMask()==null) || 
             (this.destinationIPMask!=null &&
              this.destinationIPMask.equals(other.getDestinationIPMask()))) &&
            this.destinationIPNot == other.isDestinationIPNot() &&
            ((this.destinationIPRangeFrom==null && other.getDestinationIPRangeFrom()==null) || 
             (this.destinationIPRangeFrom!=null &&
              this.destinationIPRangeFrom.equals(other.getDestinationIPRangeFrom()))) &&
            ((this.destinationIPRangeTo==null && other.getDestinationIPRangeTo()==null) || 
             (this.destinationIPRangeTo!=null &&
              this.destinationIPRangeTo.equals(other.getDestinationIPRangeTo()))) &&
            ((this.destinationIPType==null && other.getDestinationIPType()==null) || 
             (this.destinationIPType!=null &&
              this.destinationIPType.equals(other.getDestinationIPType()))) &&
            ((this.destinationMAC==null && other.getDestinationMAC()==null) || 
             (this.destinationMAC!=null &&
              this.destinationMAC.equals(other.getDestinationMAC()))) &&
            ((this.destinationMACListID==null && other.getDestinationMACListID()==null) || 
             (this.destinationMACListID!=null &&
              this.destinationMACListID.equals(other.getDestinationMACListID()))) &&
            this.destinationMACNot == other.isDestinationMACNot() &&
            ((this.destinationMACType==null && other.getDestinationMACType()==null) || 
             (this.destinationMACType!=null &&
              this.destinationMACType.equals(other.getDestinationMACType()))) &&
            ((this.destinationPortListID==null && other.getDestinationPortListID()==null) || 
             (this.destinationPortListID!=null &&
              this.destinationPortListID.equals(other.getDestinationPortListID()))) &&
            this.destinationPortNot == other.isDestinationPortNot() &&
            ((this.destinationPortType==null && other.getDestinationPortType()==null) || 
             (this.destinationPortType!=null &&
              this.destinationPortType.equals(other.getDestinationPortType()))) &&
            ((this.destinationPorts==null && other.getDestinationPorts()==null) || 
             (this.destinationPorts!=null &&
              this.destinationPorts.equals(other.getDestinationPorts()))) &&
            ((this.destinationSingleIP==null && other.getDestinationSingleIP()==null) || 
             (this.destinationSingleIP!=null &&
              this.destinationSingleIP.equals(other.getDestinationSingleIP()))) &&
            this.disabledLog == other.isDisabledLog() &&
            this.frameNot == other.isFrameNot() &&
            ((this.frameNumber==null && other.getFrameNumber()==null) || 
             (this.frameNumber!=null &&
              this.frameNumber.equals(other.getFrameNumber()))) &&
            ((this.frameType==null && other.getFrameType()==null) || 
             (this.frameType!=null &&
              this.frameType.equals(other.getFrameType()))) &&
            this.icmpCode == other.getIcmpCode() &&
            this.icmpNot == other.isIcmpNot() &&
            this.icmpType == other.getIcmpType() &&
            ((this.packetDirection==null && other.getPacketDirection()==null) || 
             (this.packetDirection!=null &&
              this.packetDirection.equals(other.getPacketDirection()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            this.protocolNot == other.isProtocolNot() &&
            this.protocolNumber == other.getProtocolNumber() &&
            ((this.protocolType==null && other.getProtocolType()==null) || 
             (this.protocolType!=null &&
              this.protocolType.equals(other.getProtocolType()))) &&
            this.raiseAlert == other.isRaiseAlert() &&
            ((this.scheduleID==null && other.getScheduleID()==null) || 
             (this.scheduleID!=null &&
              this.scheduleID.equals(other.getScheduleID()))) &&
            ((this.sourceIP==null && other.getSourceIP()==null) || 
             (this.sourceIP!=null &&
              this.sourceIP.equals(other.getSourceIP()))) &&
            ((this.sourceIPListID==null && other.getSourceIPListID()==null) || 
             (this.sourceIPListID!=null &&
              this.sourceIPListID.equals(other.getSourceIPListID()))) &&
            ((this.sourceIPMask==null && other.getSourceIPMask()==null) || 
             (this.sourceIPMask!=null &&
              this.sourceIPMask.equals(other.getSourceIPMask()))) &&
            this.sourceIPNot == other.isSourceIPNot() &&
            ((this.sourceIPRangeFrom==null && other.getSourceIPRangeFrom()==null) || 
             (this.sourceIPRangeFrom!=null &&
              this.sourceIPRangeFrom.equals(other.getSourceIPRangeFrom()))) &&
            ((this.sourceIPRangeTo==null && other.getSourceIPRangeTo()==null) || 
             (this.sourceIPRangeTo!=null &&
              this.sourceIPRangeTo.equals(other.getSourceIPRangeTo()))) &&
            ((this.sourceIPType==null && other.getSourceIPType()==null) || 
             (this.sourceIPType!=null &&
              this.sourceIPType.equals(other.getSourceIPType()))) &&
            ((this.sourceMAC==null && other.getSourceMAC()==null) || 
             (this.sourceMAC!=null &&
              this.sourceMAC.equals(other.getSourceMAC()))) &&
            ((this.sourceMACListID==null && other.getSourceMACListID()==null) || 
             (this.sourceMACListID!=null &&
              this.sourceMACListID.equals(other.getSourceMACListID()))) &&
            this.sourceMACNot == other.isSourceMACNot() &&
            ((this.sourceMACType==null && other.getSourceMACType()==null) || 
             (this.sourceMACType!=null &&
              this.sourceMACType.equals(other.getSourceMACType()))) &&
            ((this.sourcePortListID==null && other.getSourcePortListID()==null) || 
             (this.sourcePortListID!=null &&
              this.sourcePortListID.equals(other.getSourcePortListID()))) &&
            this.sourcePortNot == other.isSourcePortNot() &&
            ((this.sourcePortType==null && other.getSourcePortType()==null) || 
             (this.sourcePortType!=null &&
              this.sourcePortType.equals(other.getSourcePortType()))) &&
            ((this.sourcePorts==null && other.getSourcePorts()==null) || 
             (this.sourcePorts!=null &&
              this.sourcePorts.equals(other.getSourcePorts()))) &&
            ((this.sourceSingleIP==null && other.getSourceSingleIP()==null) || 
             (this.sourceSingleIP!=null &&
              this.sourceSingleIP.equals(other.getSourceSingleIP()))) &&
            this.tcpFlagACK == other.isTcpFlagACK() &&
            this.tcpFlagFIN == other.isTcpFlagFIN() &&
            this.tcpFlagPSH == other.isTcpFlagPSH() &&
            this.tcpFlagRST == other.isTcpFlagRST() &&
            this.tcpFlagSYN == other.isTcpFlagSYN() &&
            this.tcpFlagURG == other.isTcpFlagURG() &&
            this.tcpNot == other.isTcpNot();
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        _hashCode += (isAnyFlags() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDestinationIP() != null) {
            _hashCode += getDestinationIP().hashCode();
        }
        if (getDestinationIPListID() != null) {
            _hashCode += getDestinationIPListID().hashCode();
        }
        if (getDestinationIPMask() != null) {
            _hashCode += getDestinationIPMask().hashCode();
        }
        _hashCode += (isDestinationIPNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDestinationIPRangeFrom() != null) {
            _hashCode += getDestinationIPRangeFrom().hashCode();
        }
        if (getDestinationIPRangeTo() != null) {
            _hashCode += getDestinationIPRangeTo().hashCode();
        }
        if (getDestinationIPType() != null) {
            _hashCode += getDestinationIPType().hashCode();
        }
        if (getDestinationMAC() != null) {
            _hashCode += getDestinationMAC().hashCode();
        }
        if (getDestinationMACListID() != null) {
            _hashCode += getDestinationMACListID().hashCode();
        }
        _hashCode += (isDestinationMACNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDestinationMACType() != null) {
            _hashCode += getDestinationMACType().hashCode();
        }
        if (getDestinationPortListID() != null) {
            _hashCode += getDestinationPortListID().hashCode();
        }
        _hashCode += (isDestinationPortNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDestinationPortType() != null) {
            _hashCode += getDestinationPortType().hashCode();
        }
        if (getDestinationPorts() != null) {
            _hashCode += getDestinationPorts().hashCode();
        }
        if (getDestinationSingleIP() != null) {
            _hashCode += getDestinationSingleIP().hashCode();
        }
        _hashCode += (isDisabledLog() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFrameNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFrameNumber() != null) {
            _hashCode += getFrameNumber().hashCode();
        }
        if (getFrameType() != null) {
            _hashCode += getFrameType().hashCode();
        }
        _hashCode += getIcmpCode();
        _hashCode += (isIcmpNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getIcmpType();
        if (getPacketDirection() != null) {
            _hashCode += getPacketDirection().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        _hashCode += (isProtocolNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getProtocolNumber();
        if (getProtocolType() != null) {
            _hashCode += getProtocolType().hashCode();
        }
        _hashCode += (isRaiseAlert() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getScheduleID() != null) {
            _hashCode += getScheduleID().hashCode();
        }
        if (getSourceIP() != null) {
            _hashCode += getSourceIP().hashCode();
        }
        if (getSourceIPListID() != null) {
            _hashCode += getSourceIPListID().hashCode();
        }
        if (getSourceIPMask() != null) {
            _hashCode += getSourceIPMask().hashCode();
        }
        _hashCode += (isSourceIPNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourceIPRangeFrom() != null) {
            _hashCode += getSourceIPRangeFrom().hashCode();
        }
        if (getSourceIPRangeTo() != null) {
            _hashCode += getSourceIPRangeTo().hashCode();
        }
        if (getSourceIPType() != null) {
            _hashCode += getSourceIPType().hashCode();
        }
        if (getSourceMAC() != null) {
            _hashCode += getSourceMAC().hashCode();
        }
        if (getSourceMACListID() != null) {
            _hashCode += getSourceMACListID().hashCode();
        }
        _hashCode += (isSourceMACNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourceMACType() != null) {
            _hashCode += getSourceMACType().hashCode();
        }
        if (getSourcePortListID() != null) {
            _hashCode += getSourcePortListID().hashCode();
        }
        _hashCode += (isSourcePortNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourcePortType() != null) {
            _hashCode += getSourcePortType().hashCode();
        }
        if (getSourcePorts() != null) {
            _hashCode += getSourcePorts().hashCode();
        }
        if (getSourceSingleIP() != null) {
            _hashCode += getSourceSingleIP().hashCode();
        }
        _hashCode += (isTcpFlagACK() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTcpFlagFIN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTcpFlagPSH() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTcpFlagRST() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTcpFlagSYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTcpFlagURG() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTcpNot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirewallRuleTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "FirewallRuleTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumFirewallRuleAction"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "anyFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIPListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIPListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIPMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIPMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIPNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIPNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIPRangeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIPRangeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIPRangeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIPRangeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIPType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIPType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumFirewallRuleIPType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationMAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationMACListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationMACListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationMACNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationMACNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationMACType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationMACType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumMACType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPortListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationPortListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPortNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationPortNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPortType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationPortType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumPortType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationSingleIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationSingleIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabledLog");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "disabledLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "frameNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "frameNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "frameType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumFirewallRuleFrameType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "icmpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "icmpNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "icmpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "packetDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDirection"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumFirewallRulePriority"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protocolNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protocolNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protocolType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumFirewallRuleProtocolType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raiseAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "raiseAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "scheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIPListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIPListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIPMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIPMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIPNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIPNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIPRangeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIPRangeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIPRangeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIPRangeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIPType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIPType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumFirewallRuleIPType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceMAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMACListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceMACListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMACNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceMACNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMACType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceMACType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumMACType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourcePortListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourcePortNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourcePortType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumPortType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourcePorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSingleIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceSingleIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpFlagACK");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tcpFlagACK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpFlagFIN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tcpFlagFIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpFlagPSH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tcpFlagPSH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpFlagRST");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tcpFlagRST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpFlagSYN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tcpFlagSYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpFlagURG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tcpFlagURG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpNot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tcpNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
