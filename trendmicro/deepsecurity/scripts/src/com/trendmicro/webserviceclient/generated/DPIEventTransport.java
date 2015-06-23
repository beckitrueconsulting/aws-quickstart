/**
 * DPIEventTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class DPIEventTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.Integer DPIEventID;

    private java.lang.Integer DPIRuleID;

    private java.lang.String action;

    private byte[] data;

    private java.lang.Integer dataFlags;

    private java.lang.Integer dataIndex;

    private java.lang.String destinationIP;

    private java.lang.String destinationMAC;

    private java.lang.String destinationPort;

    private java.lang.String direction;

    private java.lang.Long driverTime;

    private java.util.Calendar endTime;

    private com.trendmicro.webserviceclient.generated.EnumEventOrigin eventOrigin;

    private java.lang.String flags;

    private java.lang.String flow;

    private java.lang.Integer hostID;

    private java.lang.String hostName;

    private java.lang.String iface;

    private java.lang.String note;

    private int packetSize;

    private java.lang.String protocol;

    private int rank;

    private java.lang.String reason;

    private int repeatCount;

    private java.lang.String sourceIP;

    private java.lang.String sourceMAC;

    private java.lang.String sourcePort;

    private java.util.Calendar startTime;

    private java.lang.Integer status;

    private java.lang.String tags;

    public DPIEventTransport() {
    }

    public DPIEventTransport(
           java.lang.Integer DPIEventID,
           java.lang.Integer DPIRuleID,
           java.lang.String action,
           byte[] data,
           java.lang.Integer dataFlags,
           java.lang.Integer dataIndex,
           java.lang.String destinationIP,
           java.lang.String destinationMAC,
           java.lang.String destinationPort,
           java.lang.String direction,
           java.lang.Long driverTime,
           java.util.Calendar endTime,
           com.trendmicro.webserviceclient.generated.EnumEventOrigin eventOrigin,
           java.lang.String flags,
           java.lang.String flow,
           java.lang.Integer hostID,
           java.lang.String hostName,
           java.lang.String iface,
           java.lang.String note,
           int packetSize,
           java.lang.String protocol,
           int rank,
           java.lang.String reason,
           int repeatCount,
           java.lang.String sourceIP,
           java.lang.String sourceMAC,
           java.lang.String sourcePort,
           java.util.Calendar startTime,
           java.lang.Integer status,
           java.lang.String tags) {
        this.DPIEventID = DPIEventID;
        this.DPIRuleID = DPIRuleID;
        this.action = action;
        this.data = data;
        this.dataFlags = dataFlags;
        this.dataIndex = dataIndex;
        this.destinationIP = destinationIP;
        this.destinationMAC = destinationMAC;
        this.destinationPort = destinationPort;
        this.direction = direction;
        this.driverTime = driverTime;
        this.endTime = endTime;
        this.eventOrigin = eventOrigin;
        this.flags = flags;
        this.flow = flow;
        this.hostID = hostID;
        this.hostName = hostName;
        this.iface = iface;
        this.note = note;
        this.packetSize = packetSize;
        this.protocol = protocol;
        this.rank = rank;
        this.reason = reason;
        this.repeatCount = repeatCount;
        this.sourceIP = sourceIP;
        this.sourceMAC = sourceMAC;
        this.sourcePort = sourcePort;
        this.startTime = startTime;
        this.status = status;
        this.tags = tags;
    }


    /**
     * Gets the DPIEventID value for this DPIEventTransport.
     * 
     * @return DPIEventID
     */
    public java.lang.Integer getDPIEventID() {
        return DPIEventID;
    }


    /**
     * Sets the DPIEventID value for this DPIEventTransport.
     * 
     * @param DPIEventID
     */
    public void setDPIEventID(java.lang.Integer DPIEventID) {
        this.DPIEventID = DPIEventID;
    }


    /**
     * Gets the DPIRuleID value for this DPIEventTransport.
     * 
     * @return DPIRuleID
     */
    public java.lang.Integer getDPIRuleID() {
        return DPIRuleID;
    }


    /**
     * Sets the DPIRuleID value for this DPIEventTransport.
     * 
     * @param DPIRuleID
     */
    public void setDPIRuleID(java.lang.Integer DPIRuleID) {
        this.DPIRuleID = DPIRuleID;
    }


    /**
     * Gets the action value for this DPIEventTransport.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this DPIEventTransport.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the data value for this DPIEventTransport.
     * 
     * @return data
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this DPIEventTransport.
     * 
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the dataFlags value for this DPIEventTransport.
     * 
     * @return dataFlags
     */
    public java.lang.Integer getDataFlags() {
        return dataFlags;
    }


    /**
     * Sets the dataFlags value for this DPIEventTransport.
     * 
     * @param dataFlags
     */
    public void setDataFlags(java.lang.Integer dataFlags) {
        this.dataFlags = dataFlags;
    }


    /**
     * Gets the dataIndex value for this DPIEventTransport.
     * 
     * @return dataIndex
     */
    public java.lang.Integer getDataIndex() {
        return dataIndex;
    }


    /**
     * Sets the dataIndex value for this DPIEventTransport.
     * 
     * @param dataIndex
     */
    public void setDataIndex(java.lang.Integer dataIndex) {
        this.dataIndex = dataIndex;
    }


    /**
     * Gets the destinationIP value for this DPIEventTransport.
     * 
     * @return destinationIP
     */
    public java.lang.String getDestinationIP() {
        return destinationIP;
    }


    /**
     * Sets the destinationIP value for this DPIEventTransport.
     * 
     * @param destinationIP
     */
    public void setDestinationIP(java.lang.String destinationIP) {
        this.destinationIP = destinationIP;
    }


    /**
     * Gets the destinationMAC value for this DPIEventTransport.
     * 
     * @return destinationMAC
     */
    public java.lang.String getDestinationMAC() {
        return destinationMAC;
    }


    /**
     * Sets the destinationMAC value for this DPIEventTransport.
     * 
     * @param destinationMAC
     */
    public void setDestinationMAC(java.lang.String destinationMAC) {
        this.destinationMAC = destinationMAC;
    }


    /**
     * Gets the destinationPort value for this DPIEventTransport.
     * 
     * @return destinationPort
     */
    public java.lang.String getDestinationPort() {
        return destinationPort;
    }


    /**
     * Sets the destinationPort value for this DPIEventTransport.
     * 
     * @param destinationPort
     */
    public void setDestinationPort(java.lang.String destinationPort) {
        this.destinationPort = destinationPort;
    }


    /**
     * Gets the direction value for this DPIEventTransport.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this DPIEventTransport.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the driverTime value for this DPIEventTransport.
     * 
     * @return driverTime
     */
    public java.lang.Long getDriverTime() {
        return driverTime;
    }


    /**
     * Sets the driverTime value for this DPIEventTransport.
     * 
     * @param driverTime
     */
    public void setDriverTime(java.lang.Long driverTime) {
        this.driverTime = driverTime;
    }


    /**
     * Gets the endTime value for this DPIEventTransport.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this DPIEventTransport.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the eventOrigin value for this DPIEventTransport.
     * 
     * @return eventOrigin
     */
    public com.trendmicro.webserviceclient.generated.EnumEventOrigin getEventOrigin() {
        return eventOrigin;
    }


    /**
     * Sets the eventOrigin value for this DPIEventTransport.
     * 
     * @param eventOrigin
     */
    public void setEventOrigin(com.trendmicro.webserviceclient.generated.EnumEventOrigin eventOrigin) {
        this.eventOrigin = eventOrigin;
    }


    /**
     * Gets the flags value for this DPIEventTransport.
     * 
     * @return flags
     */
    public java.lang.String getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this DPIEventTransport.
     * 
     * @param flags
     */
    public void setFlags(java.lang.String flags) {
        this.flags = flags;
    }


    /**
     * Gets the flow value for this DPIEventTransport.
     * 
     * @return flow
     */
    public java.lang.String getFlow() {
        return flow;
    }


    /**
     * Sets the flow value for this DPIEventTransport.
     * 
     * @param flow
     */
    public void setFlow(java.lang.String flow) {
        this.flow = flow;
    }


    /**
     * Gets the hostID value for this DPIEventTransport.
     * 
     * @return hostID
     */
    public java.lang.Integer getHostID() {
        return hostID;
    }


    /**
     * Sets the hostID value for this DPIEventTransport.
     * 
     * @param hostID
     */
    public void setHostID(java.lang.Integer hostID) {
        this.hostID = hostID;
    }


    /**
     * Gets the hostName value for this DPIEventTransport.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this DPIEventTransport.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the iface value for this DPIEventTransport.
     * 
     * @return iface
     */
    public java.lang.String getIface() {
        return iface;
    }


    /**
     * Sets the iface value for this DPIEventTransport.
     * 
     * @param iface
     */
    public void setIface(java.lang.String iface) {
        this.iface = iface;
    }


    /**
     * Gets the note value for this DPIEventTransport.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this DPIEventTransport.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the packetSize value for this DPIEventTransport.
     * 
     * @return packetSize
     */
    public int getPacketSize() {
        return packetSize;
    }


    /**
     * Sets the packetSize value for this DPIEventTransport.
     * 
     * @param packetSize
     */
    public void setPacketSize(int packetSize) {
        this.packetSize = packetSize;
    }


    /**
     * Gets the protocol value for this DPIEventTransport.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this DPIEventTransport.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the rank value for this DPIEventTransport.
     * 
     * @return rank
     */
    public int getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this DPIEventTransport.
     * 
     * @param rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }


    /**
     * Gets the reason value for this DPIEventTransport.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this DPIEventTransport.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the repeatCount value for this DPIEventTransport.
     * 
     * @return repeatCount
     */
    public int getRepeatCount() {
        return repeatCount;
    }


    /**
     * Sets the repeatCount value for this DPIEventTransport.
     * 
     * @param repeatCount
     */
    public void setRepeatCount(int repeatCount) {
        this.repeatCount = repeatCount;
    }


    /**
     * Gets the sourceIP value for this DPIEventTransport.
     * 
     * @return sourceIP
     */
    public java.lang.String getSourceIP() {
        return sourceIP;
    }


    /**
     * Sets the sourceIP value for this DPIEventTransport.
     * 
     * @param sourceIP
     */
    public void setSourceIP(java.lang.String sourceIP) {
        this.sourceIP = sourceIP;
    }


    /**
     * Gets the sourceMAC value for this DPIEventTransport.
     * 
     * @return sourceMAC
     */
    public java.lang.String getSourceMAC() {
        return sourceMAC;
    }


    /**
     * Sets the sourceMAC value for this DPIEventTransport.
     * 
     * @param sourceMAC
     */
    public void setSourceMAC(java.lang.String sourceMAC) {
        this.sourceMAC = sourceMAC;
    }


    /**
     * Gets the sourcePort value for this DPIEventTransport.
     * 
     * @return sourcePort
     */
    public java.lang.String getSourcePort() {
        return sourcePort;
    }


    /**
     * Sets the sourcePort value for this DPIEventTransport.
     * 
     * @param sourcePort
     */
    public void setSourcePort(java.lang.String sourcePort) {
        this.sourcePort = sourcePort;
    }


    /**
     * Gets the startTime value for this DPIEventTransport.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this DPIEventTransport.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the status value for this DPIEventTransport.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DPIEventTransport.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the tags value for this DPIEventTransport.
     * 
     * @return tags
     */
    public java.lang.String getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this DPIEventTransport.
     * 
     * @param tags
     */
    public void setTags(java.lang.String tags) {
        this.tags = tags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DPIEventTransport)) return false;
        DPIEventTransport other = (DPIEventTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.DPIEventID==null && other.getDPIEventID()==null) || 
             (this.DPIEventID!=null &&
              this.DPIEventID.equals(other.getDPIEventID()))) &&
            ((this.DPIRuleID==null && other.getDPIRuleID()==null) || 
             (this.DPIRuleID!=null &&
              this.DPIRuleID.equals(other.getDPIRuleID()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.dataFlags==null && other.getDataFlags()==null) || 
             (this.dataFlags!=null &&
              this.dataFlags.equals(other.getDataFlags()))) &&
            ((this.dataIndex==null && other.getDataIndex()==null) || 
             (this.dataIndex!=null &&
              this.dataIndex.equals(other.getDataIndex()))) &&
            ((this.destinationIP==null && other.getDestinationIP()==null) || 
             (this.destinationIP!=null &&
              this.destinationIP.equals(other.getDestinationIP()))) &&
            ((this.destinationMAC==null && other.getDestinationMAC()==null) || 
             (this.destinationMAC!=null &&
              this.destinationMAC.equals(other.getDestinationMAC()))) &&
            ((this.destinationPort==null && other.getDestinationPort()==null) || 
             (this.destinationPort!=null &&
              this.destinationPort.equals(other.getDestinationPort()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.driverTime==null && other.getDriverTime()==null) || 
             (this.driverTime!=null &&
              this.driverTime.equals(other.getDriverTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.eventOrigin==null && other.getEventOrigin()==null) || 
             (this.eventOrigin!=null &&
              this.eventOrigin.equals(other.getEventOrigin()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.flow==null && other.getFlow()==null) || 
             (this.flow!=null &&
              this.flow.equals(other.getFlow()))) &&
            ((this.hostID==null && other.getHostID()==null) || 
             (this.hostID!=null &&
              this.hostID.equals(other.getHostID()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.iface==null && other.getIface()==null) || 
             (this.iface!=null &&
              this.iface.equals(other.getIface()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            this.packetSize == other.getPacketSize() &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            this.rank == other.getRank() &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            this.repeatCount == other.getRepeatCount() &&
            ((this.sourceIP==null && other.getSourceIP()==null) || 
             (this.sourceIP!=null &&
              this.sourceIP.equals(other.getSourceIP()))) &&
            ((this.sourceMAC==null && other.getSourceMAC()==null) || 
             (this.sourceMAC!=null &&
              this.sourceMAC.equals(other.getSourceMAC()))) &&
            ((this.sourcePort==null && other.getSourcePort()==null) || 
             (this.sourcePort!=null &&
              this.sourcePort.equals(other.getSourcePort()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags())));
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
        if (getDPIEventID() != null) {
            _hashCode += getDPIEventID().hashCode();
        }
        if (getDPIRuleID() != null) {
            _hashCode += getDPIRuleID().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataFlags() != null) {
            _hashCode += getDataFlags().hashCode();
        }
        if (getDataIndex() != null) {
            _hashCode += getDataIndex().hashCode();
        }
        if (getDestinationIP() != null) {
            _hashCode += getDestinationIP().hashCode();
        }
        if (getDestinationMAC() != null) {
            _hashCode += getDestinationMAC().hashCode();
        }
        if (getDestinationPort() != null) {
            _hashCode += getDestinationPort().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getDriverTime() != null) {
            _hashCode += getDriverTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getEventOrigin() != null) {
            _hashCode += getEventOrigin().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getFlow() != null) {
            _hashCode += getFlow().hashCode();
        }
        if (getHostID() != null) {
            _hashCode += getHostID().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getIface() != null) {
            _hashCode += getIface().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        _hashCode += getPacketSize();
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        _hashCode += getRank();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        _hashCode += getRepeatCount();
        if (getSourceIP() != null) {
            _hashCode += getSourceIP().hashCode();
        }
        if (getSourceMAC() != null) {
            _hashCode += getSourceMAC().hashCode();
        }
        if (getSourcePort() != null) {
            _hashCode += getSourcePort().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DPIEventTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "DPIEventTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPIEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "DPIEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPIRuleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "DPIRuleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "dataFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "dataIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "destinationMAC"));
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
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "driverTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "eventOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumEventOrigin"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "flow"));
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
        elemField.setFieldName("iface");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "iface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "packetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("repeatCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "repeatCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "sourceMAC"));
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
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tags"));
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
