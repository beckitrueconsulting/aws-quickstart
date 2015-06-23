/**
 * LogInspectionEventTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class LogInspectionEventTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String command;

    private java.lang.String data;

    private java.lang.String description;

    private java.lang.String destinationIP;

    private java.lang.String destinationPort;

    private java.lang.String destinationUser;

    private java.lang.String fullEvent;

    private java.lang.String groups;

    private java.lang.Integer hostID;

    private java.lang.String hostName;

    private java.lang.String location;

    private java.lang.Integer logInspectionEventID;

    private java.lang.Integer logInspectionRuleID;

    private java.util.Calendar logTime;

    private java.lang.String message;

    private java.lang.String programName;

    private java.lang.String protocol;

    private int rank;

    private java.lang.String reason;

    private java.lang.Integer ruleID;

    private java.lang.String severity;

    private java.lang.String sourceHostName;

    private java.lang.String sourceID;

    private java.lang.String sourceIP;

    private java.lang.String sourcePort;

    private java.lang.String sourceUser;

    private java.lang.String status;

    private java.lang.String systemName;

    private java.lang.String tags;

    private java.lang.String url;

    public LogInspectionEventTransport() {
    }

    public LogInspectionEventTransport(
           java.lang.String action,
           java.lang.String command,
           java.lang.String data,
           java.lang.String description,
           java.lang.String destinationIP,
           java.lang.String destinationPort,
           java.lang.String destinationUser,
           java.lang.String fullEvent,
           java.lang.String groups,
           java.lang.Integer hostID,
           java.lang.String hostName,
           java.lang.String location,
           java.lang.Integer logInspectionEventID,
           java.lang.Integer logInspectionRuleID,
           java.util.Calendar logTime,
           java.lang.String message,
           java.lang.String programName,
           java.lang.String protocol,
           int rank,
           java.lang.String reason,
           java.lang.Integer ruleID,
           java.lang.String severity,
           java.lang.String sourceHostName,
           java.lang.String sourceID,
           java.lang.String sourceIP,
           java.lang.String sourcePort,
           java.lang.String sourceUser,
           java.lang.String status,
           java.lang.String systemName,
           java.lang.String tags,
           java.lang.String url) {
        this.action = action;
        this.command = command;
        this.data = data;
        this.description = description;
        this.destinationIP = destinationIP;
        this.destinationPort = destinationPort;
        this.destinationUser = destinationUser;
        this.fullEvent = fullEvent;
        this.groups = groups;
        this.hostID = hostID;
        this.hostName = hostName;
        this.location = location;
        this.logInspectionEventID = logInspectionEventID;
        this.logInspectionRuleID = logInspectionRuleID;
        this.logTime = logTime;
        this.message = message;
        this.programName = programName;
        this.protocol = protocol;
        this.rank = rank;
        this.reason = reason;
        this.ruleID = ruleID;
        this.severity = severity;
        this.sourceHostName = sourceHostName;
        this.sourceID = sourceID;
        this.sourceIP = sourceIP;
        this.sourcePort = sourcePort;
        this.sourceUser = sourceUser;
        this.status = status;
        this.systemName = systemName;
        this.tags = tags;
        this.url = url;
    }


    /**
     * Gets the action value for this LogInspectionEventTransport.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this LogInspectionEventTransport.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the command value for this LogInspectionEventTransport.
     * 
     * @return command
     */
    public java.lang.String getCommand() {
        return command;
    }


    /**
     * Sets the command value for this LogInspectionEventTransport.
     * 
     * @param command
     */
    public void setCommand(java.lang.String command) {
        this.command = command;
    }


    /**
     * Gets the data value for this LogInspectionEventTransport.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this LogInspectionEventTransport.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the description value for this LogInspectionEventTransport.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LogInspectionEventTransport.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destinationIP value for this LogInspectionEventTransport.
     * 
     * @return destinationIP
     */
    public java.lang.String getDestinationIP() {
        return destinationIP;
    }


    /**
     * Sets the destinationIP value for this LogInspectionEventTransport.
     * 
     * @param destinationIP
     */
    public void setDestinationIP(java.lang.String destinationIP) {
        this.destinationIP = destinationIP;
    }


    /**
     * Gets the destinationPort value for this LogInspectionEventTransport.
     * 
     * @return destinationPort
     */
    public java.lang.String getDestinationPort() {
        return destinationPort;
    }


    /**
     * Sets the destinationPort value for this LogInspectionEventTransport.
     * 
     * @param destinationPort
     */
    public void setDestinationPort(java.lang.String destinationPort) {
        this.destinationPort = destinationPort;
    }


    /**
     * Gets the destinationUser value for this LogInspectionEventTransport.
     * 
     * @return destinationUser
     */
    public java.lang.String getDestinationUser() {
        return destinationUser;
    }


    /**
     * Sets the destinationUser value for this LogInspectionEventTransport.
     * 
     * @param destinationUser
     */
    public void setDestinationUser(java.lang.String destinationUser) {
        this.destinationUser = destinationUser;
    }


    /**
     * Gets the fullEvent value for this LogInspectionEventTransport.
     * 
     * @return fullEvent
     */
    public java.lang.String getFullEvent() {
        return fullEvent;
    }


    /**
     * Sets the fullEvent value for this LogInspectionEventTransport.
     * 
     * @param fullEvent
     */
    public void setFullEvent(java.lang.String fullEvent) {
        this.fullEvent = fullEvent;
    }


    /**
     * Gets the groups value for this LogInspectionEventTransport.
     * 
     * @return groups
     */
    public java.lang.String getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this LogInspectionEventTransport.
     * 
     * @param groups
     */
    public void setGroups(java.lang.String groups) {
        this.groups = groups;
    }


    /**
     * Gets the hostID value for this LogInspectionEventTransport.
     * 
     * @return hostID
     */
    public java.lang.Integer getHostID() {
        return hostID;
    }


    /**
     * Sets the hostID value for this LogInspectionEventTransport.
     * 
     * @param hostID
     */
    public void setHostID(java.lang.Integer hostID) {
        this.hostID = hostID;
    }


    /**
     * Gets the hostName value for this LogInspectionEventTransport.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this LogInspectionEventTransport.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the location value for this LogInspectionEventTransport.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this LogInspectionEventTransport.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the logInspectionEventID value for this LogInspectionEventTransport.
     * 
     * @return logInspectionEventID
     */
    public java.lang.Integer getLogInspectionEventID() {
        return logInspectionEventID;
    }


    /**
     * Sets the logInspectionEventID value for this LogInspectionEventTransport.
     * 
     * @param logInspectionEventID
     */
    public void setLogInspectionEventID(java.lang.Integer logInspectionEventID) {
        this.logInspectionEventID = logInspectionEventID;
    }


    /**
     * Gets the logInspectionRuleID value for this LogInspectionEventTransport.
     * 
     * @return logInspectionRuleID
     */
    public java.lang.Integer getLogInspectionRuleID() {
        return logInspectionRuleID;
    }


    /**
     * Sets the logInspectionRuleID value for this LogInspectionEventTransport.
     * 
     * @param logInspectionRuleID
     */
    public void setLogInspectionRuleID(java.lang.Integer logInspectionRuleID) {
        this.logInspectionRuleID = logInspectionRuleID;
    }


    /**
     * Gets the logTime value for this LogInspectionEventTransport.
     * 
     * @return logTime
     */
    public java.util.Calendar getLogTime() {
        return logTime;
    }


    /**
     * Sets the logTime value for this LogInspectionEventTransport.
     * 
     * @param logTime
     */
    public void setLogTime(java.util.Calendar logTime) {
        this.logTime = logTime;
    }


    /**
     * Gets the message value for this LogInspectionEventTransport.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this LogInspectionEventTransport.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the programName value for this LogInspectionEventTransport.
     * 
     * @return programName
     */
    public java.lang.String getProgramName() {
        return programName;
    }


    /**
     * Sets the programName value for this LogInspectionEventTransport.
     * 
     * @param programName
     */
    public void setProgramName(java.lang.String programName) {
        this.programName = programName;
    }


    /**
     * Gets the protocol value for this LogInspectionEventTransport.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this LogInspectionEventTransport.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the rank value for this LogInspectionEventTransport.
     * 
     * @return rank
     */
    public int getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this LogInspectionEventTransport.
     * 
     * @param rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }


    /**
     * Gets the reason value for this LogInspectionEventTransport.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this LogInspectionEventTransport.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the ruleID value for this LogInspectionEventTransport.
     * 
     * @return ruleID
     */
    public java.lang.Integer getRuleID() {
        return ruleID;
    }


    /**
     * Sets the ruleID value for this LogInspectionEventTransport.
     * 
     * @param ruleID
     */
    public void setRuleID(java.lang.Integer ruleID) {
        this.ruleID = ruleID;
    }


    /**
     * Gets the severity value for this LogInspectionEventTransport.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this LogInspectionEventTransport.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the sourceHostName value for this LogInspectionEventTransport.
     * 
     * @return sourceHostName
     */
    public java.lang.String getSourceHostName() {
        return sourceHostName;
    }


    /**
     * Sets the sourceHostName value for this LogInspectionEventTransport.
     * 
     * @param sourceHostName
     */
    public void setSourceHostName(java.lang.String sourceHostName) {
        this.sourceHostName = sourceHostName;
    }


    /**
     * Gets the sourceID value for this LogInspectionEventTransport.
     * 
     * @return sourceID
     */
    public java.lang.String getSourceID() {
        return sourceID;
    }


    /**
     * Sets the sourceID value for this LogInspectionEventTransport.
     * 
     * @param sourceID
     */
    public void setSourceID(java.lang.String sourceID) {
        this.sourceID = sourceID;
    }


    /**
     * Gets the sourceIP value for this LogInspectionEventTransport.
     * 
     * @return sourceIP
     */
    public java.lang.String getSourceIP() {
        return sourceIP;
    }


    /**
     * Sets the sourceIP value for this LogInspectionEventTransport.
     * 
     * @param sourceIP
     */
    public void setSourceIP(java.lang.String sourceIP) {
        this.sourceIP = sourceIP;
    }


    /**
     * Gets the sourcePort value for this LogInspectionEventTransport.
     * 
     * @return sourcePort
     */
    public java.lang.String getSourcePort() {
        return sourcePort;
    }


    /**
     * Sets the sourcePort value for this LogInspectionEventTransport.
     * 
     * @param sourcePort
     */
    public void setSourcePort(java.lang.String sourcePort) {
        this.sourcePort = sourcePort;
    }


    /**
     * Gets the sourceUser value for this LogInspectionEventTransport.
     * 
     * @return sourceUser
     */
    public java.lang.String getSourceUser() {
        return sourceUser;
    }


    /**
     * Sets the sourceUser value for this LogInspectionEventTransport.
     * 
     * @param sourceUser
     */
    public void setSourceUser(java.lang.String sourceUser) {
        this.sourceUser = sourceUser;
    }


    /**
     * Gets the status value for this LogInspectionEventTransport.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LogInspectionEventTransport.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the systemName value for this LogInspectionEventTransport.
     * 
     * @return systemName
     */
    public java.lang.String getSystemName() {
        return systemName;
    }


    /**
     * Sets the systemName value for this LogInspectionEventTransport.
     * 
     * @param systemName
     */
    public void setSystemName(java.lang.String systemName) {
        this.systemName = systemName;
    }


    /**
     * Gets the tags value for this LogInspectionEventTransport.
     * 
     * @return tags
     */
    public java.lang.String getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this LogInspectionEventTransport.
     * 
     * @param tags
     */
    public void setTags(java.lang.String tags) {
        this.tags = tags;
    }


    /**
     * Gets the url value for this LogInspectionEventTransport.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this LogInspectionEventTransport.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogInspectionEventTransport)) return false;
        LogInspectionEventTransport other = (LogInspectionEventTransport) obj;
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
            ((this.command==null && other.getCommand()==null) || 
             (this.command!=null &&
              this.command.equals(other.getCommand()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.destinationIP==null && other.getDestinationIP()==null) || 
             (this.destinationIP!=null &&
              this.destinationIP.equals(other.getDestinationIP()))) &&
            ((this.destinationPort==null && other.getDestinationPort()==null) || 
             (this.destinationPort!=null &&
              this.destinationPort.equals(other.getDestinationPort()))) &&
            ((this.destinationUser==null && other.getDestinationUser()==null) || 
             (this.destinationUser!=null &&
              this.destinationUser.equals(other.getDestinationUser()))) &&
            ((this.fullEvent==null && other.getFullEvent()==null) || 
             (this.fullEvent!=null &&
              this.fullEvent.equals(other.getFullEvent()))) &&
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              this.groups.equals(other.getGroups()))) &&
            ((this.hostID==null && other.getHostID()==null) || 
             (this.hostID!=null &&
              this.hostID.equals(other.getHostID()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.logInspectionEventID==null && other.getLogInspectionEventID()==null) || 
             (this.logInspectionEventID!=null &&
              this.logInspectionEventID.equals(other.getLogInspectionEventID()))) &&
            ((this.logInspectionRuleID==null && other.getLogInspectionRuleID()==null) || 
             (this.logInspectionRuleID!=null &&
              this.logInspectionRuleID.equals(other.getLogInspectionRuleID()))) &&
            ((this.logTime==null && other.getLogTime()==null) || 
             (this.logTime!=null &&
              this.logTime.equals(other.getLogTime()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.programName==null && other.getProgramName()==null) || 
             (this.programName!=null &&
              this.programName.equals(other.getProgramName()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            this.rank == other.getRank() &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.ruleID==null && other.getRuleID()==null) || 
             (this.ruleID!=null &&
              this.ruleID.equals(other.getRuleID()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.sourceHostName==null && other.getSourceHostName()==null) || 
             (this.sourceHostName!=null &&
              this.sourceHostName.equals(other.getSourceHostName()))) &&
            ((this.sourceID==null && other.getSourceID()==null) || 
             (this.sourceID!=null &&
              this.sourceID.equals(other.getSourceID()))) &&
            ((this.sourceIP==null && other.getSourceIP()==null) || 
             (this.sourceIP!=null &&
              this.sourceIP.equals(other.getSourceIP()))) &&
            ((this.sourcePort==null && other.getSourcePort()==null) || 
             (this.sourcePort!=null &&
              this.sourcePort.equals(other.getSourcePort()))) &&
            ((this.sourceUser==null && other.getSourceUser()==null) || 
             (this.sourceUser!=null &&
              this.sourceUser.equals(other.getSourceUser()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.systemName==null && other.getSystemName()==null) || 
             (this.systemName!=null &&
              this.systemName.equals(other.getSystemName()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getCommand() != null) {
            _hashCode += getCommand().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDestinationIP() != null) {
            _hashCode += getDestinationIP().hashCode();
        }
        if (getDestinationPort() != null) {
            _hashCode += getDestinationPort().hashCode();
        }
        if (getDestinationUser() != null) {
            _hashCode += getDestinationUser().hashCode();
        }
        if (getFullEvent() != null) {
            _hashCode += getFullEvent().hashCode();
        }
        if (getGroups() != null) {
            _hashCode += getGroups().hashCode();
        }
        if (getHostID() != null) {
            _hashCode += getHostID().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLogInspectionEventID() != null) {
            _hashCode += getLogInspectionEventID().hashCode();
        }
        if (getLogInspectionRuleID() != null) {
            _hashCode += getLogInspectionRuleID().hashCode();
        }
        if (getLogTime() != null) {
            _hashCode += getLogTime().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getProgramName() != null) {
            _hashCode += getProgramName().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        _hashCode += getRank();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getRuleID() != null) {
            _hashCode += getRuleID().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSourceHostName() != null) {
            _hashCode += getSourceHostName().hashCode();
        }
        if (getSourceID() != null) {
            _hashCode += getSourceID().hashCode();
        }
        if (getSourceIP() != null) {
            _hashCode += getSourceIP().hashCode();
        }
        if (getSourcePort() != null) {
            _hashCode += getSourcePort().hashCode();
        }
        if (getSourceUser() != null) {
            _hashCode += getSourceUser().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSystemName() != null) {
            _hashCode += getSystemName().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogInspectionEventTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "LogInspectionEventTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "command"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "fullEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logInspectionEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logInspectionEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logInspectionRuleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logInspectionRuleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "programName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ruleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourcePort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "systemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
