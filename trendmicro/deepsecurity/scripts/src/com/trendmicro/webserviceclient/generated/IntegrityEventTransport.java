/**
 * IntegrityEventTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class IntegrityEventTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.String change;

    private java.lang.String description;

    private java.lang.Integer hostID;

    private java.lang.String hostName;

    private java.lang.Integer integrityEventID;

    private java.lang.Integer integrityRuleID;

    private com.trendmicro.webserviceclient.generated.EntityTransport isEntity;

    private java.lang.String key;

    private java.util.Calendar logTime;

    private java.lang.String process;

    private int rank;

    private java.lang.String reason;

    private com.trendmicro.webserviceclient.generated.EnumIntegrityRuleSeverity severity;

    private java.lang.String tags;

    private java.lang.String type;

    private java.lang.String user;

    private com.trendmicro.webserviceclient.generated.EntityTransport wasEntity;

    public IntegrityEventTransport() {
    }

    public IntegrityEventTransport(
           java.lang.String change,
           java.lang.String description,
           java.lang.Integer hostID,
           java.lang.String hostName,
           java.lang.Integer integrityEventID,
           java.lang.Integer integrityRuleID,
           com.trendmicro.webserviceclient.generated.EntityTransport isEntity,
           java.lang.String key,
           java.util.Calendar logTime,
           java.lang.String process,
           int rank,
           java.lang.String reason,
           com.trendmicro.webserviceclient.generated.EnumIntegrityRuleSeverity severity,
           java.lang.String tags,
           java.lang.String type,
           java.lang.String user,
           com.trendmicro.webserviceclient.generated.EntityTransport wasEntity) {
        this.change = change;
        this.description = description;
        this.hostID = hostID;
        this.hostName = hostName;
        this.integrityEventID = integrityEventID;
        this.integrityRuleID = integrityRuleID;
        this.isEntity = isEntity;
        this.key = key;
        this.logTime = logTime;
        this.process = process;
        this.rank = rank;
        this.reason = reason;
        this.severity = severity;
        this.tags = tags;
        this.type = type;
        this.user = user;
        this.wasEntity = wasEntity;
    }


    /**
     * Gets the change value for this IntegrityEventTransport.
     * 
     * @return change
     */
    public java.lang.String getChange() {
        return change;
    }


    /**
     * Sets the change value for this IntegrityEventTransport.
     * 
     * @param change
     */
    public void setChange(java.lang.String change) {
        this.change = change;
    }


    /**
     * Gets the description value for this IntegrityEventTransport.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this IntegrityEventTransport.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the hostID value for this IntegrityEventTransport.
     * 
     * @return hostID
     */
    public java.lang.Integer getHostID() {
        return hostID;
    }


    /**
     * Sets the hostID value for this IntegrityEventTransport.
     * 
     * @param hostID
     */
    public void setHostID(java.lang.Integer hostID) {
        this.hostID = hostID;
    }


    /**
     * Gets the hostName value for this IntegrityEventTransport.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this IntegrityEventTransport.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the integrityEventID value for this IntegrityEventTransport.
     * 
     * @return integrityEventID
     */
    public java.lang.Integer getIntegrityEventID() {
        return integrityEventID;
    }


    /**
     * Sets the integrityEventID value for this IntegrityEventTransport.
     * 
     * @param integrityEventID
     */
    public void setIntegrityEventID(java.lang.Integer integrityEventID) {
        this.integrityEventID = integrityEventID;
    }


    /**
     * Gets the integrityRuleID value for this IntegrityEventTransport.
     * 
     * @return integrityRuleID
     */
    public java.lang.Integer getIntegrityRuleID() {
        return integrityRuleID;
    }


    /**
     * Sets the integrityRuleID value for this IntegrityEventTransport.
     * 
     * @param integrityRuleID
     */
    public void setIntegrityRuleID(java.lang.Integer integrityRuleID) {
        this.integrityRuleID = integrityRuleID;
    }


    /**
     * Gets the isEntity value for this IntegrityEventTransport.
     * 
     * @return isEntity
     */
    public com.trendmicro.webserviceclient.generated.EntityTransport getIsEntity() {
        return isEntity;
    }


    /**
     * Sets the isEntity value for this IntegrityEventTransport.
     * 
     * @param isEntity
     */
    public void setIsEntity(com.trendmicro.webserviceclient.generated.EntityTransport isEntity) {
        this.isEntity = isEntity;
    }


    /**
     * Gets the key value for this IntegrityEventTransport.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this IntegrityEventTransport.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the logTime value for this IntegrityEventTransport.
     * 
     * @return logTime
     */
    public java.util.Calendar getLogTime() {
        return logTime;
    }


    /**
     * Sets the logTime value for this IntegrityEventTransport.
     * 
     * @param logTime
     */
    public void setLogTime(java.util.Calendar logTime) {
        this.logTime = logTime;
    }


    /**
     * Gets the process value for this IntegrityEventTransport.
     * 
     * @return process
     */
    public java.lang.String getProcess() {
        return process;
    }


    /**
     * Sets the process value for this IntegrityEventTransport.
     * 
     * @param process
     */
    public void setProcess(java.lang.String process) {
        this.process = process;
    }


    /**
     * Gets the rank value for this IntegrityEventTransport.
     * 
     * @return rank
     */
    public int getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this IntegrityEventTransport.
     * 
     * @param rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }


    /**
     * Gets the reason value for this IntegrityEventTransport.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this IntegrityEventTransport.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the severity value for this IntegrityEventTransport.
     * 
     * @return severity
     */
    public com.trendmicro.webserviceclient.generated.EnumIntegrityRuleSeverity getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this IntegrityEventTransport.
     * 
     * @param severity
     */
    public void setSeverity(com.trendmicro.webserviceclient.generated.EnumIntegrityRuleSeverity severity) {
        this.severity = severity;
    }


    /**
     * Gets the tags value for this IntegrityEventTransport.
     * 
     * @return tags
     */
    public java.lang.String getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this IntegrityEventTransport.
     * 
     * @param tags
     */
    public void setTags(java.lang.String tags) {
        this.tags = tags;
    }


    /**
     * Gets the type value for this IntegrityEventTransport.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this IntegrityEventTransport.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the user value for this IntegrityEventTransport.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this IntegrityEventTransport.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the wasEntity value for this IntegrityEventTransport.
     * 
     * @return wasEntity
     */
    public com.trendmicro.webserviceclient.generated.EntityTransport getWasEntity() {
        return wasEntity;
    }


    /**
     * Sets the wasEntity value for this IntegrityEventTransport.
     * 
     * @param wasEntity
     */
    public void setWasEntity(com.trendmicro.webserviceclient.generated.EntityTransport wasEntity) {
        this.wasEntity = wasEntity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntegrityEventTransport)) return false;
        IntegrityEventTransport other = (IntegrityEventTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.change==null && other.getChange()==null) || 
             (this.change!=null &&
              this.change.equals(other.getChange()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.hostID==null && other.getHostID()==null) || 
             (this.hostID!=null &&
              this.hostID.equals(other.getHostID()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.integrityEventID==null && other.getIntegrityEventID()==null) || 
             (this.integrityEventID!=null &&
              this.integrityEventID.equals(other.getIntegrityEventID()))) &&
            ((this.integrityRuleID==null && other.getIntegrityRuleID()==null) || 
             (this.integrityRuleID!=null &&
              this.integrityRuleID.equals(other.getIntegrityRuleID()))) &&
            ((this.isEntity==null && other.getIsEntity()==null) || 
             (this.isEntity!=null &&
              this.isEntity.equals(other.getIsEntity()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.logTime==null && other.getLogTime()==null) || 
             (this.logTime!=null &&
              this.logTime.equals(other.getLogTime()))) &&
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess()))) &&
            this.rank == other.getRank() &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.wasEntity==null && other.getWasEntity()==null) || 
             (this.wasEntity!=null &&
              this.wasEntity.equals(other.getWasEntity())));
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
        if (getChange() != null) {
            _hashCode += getChange().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getHostID() != null) {
            _hashCode += getHostID().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getIntegrityEventID() != null) {
            _hashCode += getIntegrityEventID().hashCode();
        }
        if (getIntegrityRuleID() != null) {
            _hashCode += getIntegrityRuleID().hashCode();
        }
        if (getIsEntity() != null) {
            _hashCode += getIsEntity().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getLogTime() != null) {
            _hashCode += getLogTime().hashCode();
        }
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        _hashCode += getRank();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getWasEntity() != null) {
            _hashCode += getWasEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntegrityEventTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "IntegrityEventTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "change"));
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
        elemField.setFieldName("integrityEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "integrityEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrityRuleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "integrityRuleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "isEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EntityTransport"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("process");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "process"));
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
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumIntegrityRuleSeverity"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wasEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "wasEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EntityTransport"));
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
