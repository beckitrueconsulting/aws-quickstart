/**
 * SystemEventTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class SystemEventTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.String actionPerformedBy;

    private java.lang.String description;

    private java.lang.String event;

    private int eventID;

    private com.trendmicro.webserviceclient.generated.EnumEventOrigin eventOrigin;

    private java.lang.String managerHostname;

    private java.lang.Integer systemEventID;

    private java.lang.String tags;

    private java.lang.String target;

    private java.lang.Integer targetID;

    private java.lang.String targetType;

    private java.util.Calendar time;

    private java.lang.String type;

    public SystemEventTransport() {
    }

    public SystemEventTransport(
           java.lang.String actionPerformedBy,
           java.lang.String description,
           java.lang.String event,
           int eventID,
           com.trendmicro.webserviceclient.generated.EnumEventOrigin eventOrigin,
           java.lang.String managerHostname,
           java.lang.Integer systemEventID,
           java.lang.String tags,
           java.lang.String target,
           java.lang.Integer targetID,
           java.lang.String targetType,
           java.util.Calendar time,
           java.lang.String type) {
        this.actionPerformedBy = actionPerformedBy;
        this.description = description;
        this.event = event;
        this.eventID = eventID;
        this.eventOrigin = eventOrigin;
        this.managerHostname = managerHostname;
        this.systemEventID = systemEventID;
        this.tags = tags;
        this.target = target;
        this.targetID = targetID;
        this.targetType = targetType;
        this.time = time;
        this.type = type;
    }


    /**
     * Gets the actionPerformedBy value for this SystemEventTransport.
     * 
     * @return actionPerformedBy
     */
    public java.lang.String getActionPerformedBy() {
        return actionPerformedBy;
    }


    /**
     * Sets the actionPerformedBy value for this SystemEventTransport.
     * 
     * @param actionPerformedBy
     */
    public void setActionPerformedBy(java.lang.String actionPerformedBy) {
        this.actionPerformedBy = actionPerformedBy;
    }


    /**
     * Gets the description value for this SystemEventTransport.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SystemEventTransport.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the event value for this SystemEventTransport.
     * 
     * @return event
     */
    public java.lang.String getEvent() {
        return event;
    }


    /**
     * Sets the event value for this SystemEventTransport.
     * 
     * @param event
     */
    public void setEvent(java.lang.String event) {
        this.event = event;
    }


    /**
     * Gets the eventID value for this SystemEventTransport.
     * 
     * @return eventID
     */
    public int getEventID() {
        return eventID;
    }


    /**
     * Sets the eventID value for this SystemEventTransport.
     * 
     * @param eventID
     */
    public void setEventID(int eventID) {
        this.eventID = eventID;
    }


    /**
     * Gets the eventOrigin value for this SystemEventTransport.
     * 
     * @return eventOrigin
     */
    public com.trendmicro.webserviceclient.generated.EnumEventOrigin getEventOrigin() {
        return eventOrigin;
    }


    /**
     * Sets the eventOrigin value for this SystemEventTransport.
     * 
     * @param eventOrigin
     */
    public void setEventOrigin(com.trendmicro.webserviceclient.generated.EnumEventOrigin eventOrigin) {
        this.eventOrigin = eventOrigin;
    }


    /**
     * Gets the managerHostname value for this SystemEventTransport.
     * 
     * @return managerHostname
     */
    public java.lang.String getManagerHostname() {
        return managerHostname;
    }


    /**
     * Sets the managerHostname value for this SystemEventTransport.
     * 
     * @param managerHostname
     */
    public void setManagerHostname(java.lang.String managerHostname) {
        this.managerHostname = managerHostname;
    }


    /**
     * Gets the systemEventID value for this SystemEventTransport.
     * 
     * @return systemEventID
     */
    public java.lang.Integer getSystemEventID() {
        return systemEventID;
    }


    /**
     * Sets the systemEventID value for this SystemEventTransport.
     * 
     * @param systemEventID
     */
    public void setSystemEventID(java.lang.Integer systemEventID) {
        this.systemEventID = systemEventID;
    }


    /**
     * Gets the tags value for this SystemEventTransport.
     * 
     * @return tags
     */
    public java.lang.String getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this SystemEventTransport.
     * 
     * @param tags
     */
    public void setTags(java.lang.String tags) {
        this.tags = tags;
    }


    /**
     * Gets the target value for this SystemEventTransport.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this SystemEventTransport.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the targetID value for this SystemEventTransport.
     * 
     * @return targetID
     */
    public java.lang.Integer getTargetID() {
        return targetID;
    }


    /**
     * Sets the targetID value for this SystemEventTransport.
     * 
     * @param targetID
     */
    public void setTargetID(java.lang.Integer targetID) {
        this.targetID = targetID;
    }


    /**
     * Gets the targetType value for this SystemEventTransport.
     * 
     * @return targetType
     */
    public java.lang.String getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this SystemEventTransport.
     * 
     * @param targetType
     */
    public void setTargetType(java.lang.String targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the time value for this SystemEventTransport.
     * 
     * @return time
     */
    public java.util.Calendar getTime() {
        return time;
    }


    /**
     * Sets the time value for this SystemEventTransport.
     * 
     * @param time
     */
    public void setTime(java.util.Calendar time) {
        this.time = time;
    }


    /**
     * Gets the type value for this SystemEventTransport.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this SystemEventTransport.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemEventTransport)) return false;
        SystemEventTransport other = (SystemEventTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionPerformedBy==null && other.getActionPerformedBy()==null) || 
             (this.actionPerformedBy!=null &&
              this.actionPerformedBy.equals(other.getActionPerformedBy()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              this.event.equals(other.getEvent()))) &&
            this.eventID == other.getEventID() &&
            ((this.eventOrigin==null && other.getEventOrigin()==null) || 
             (this.eventOrigin!=null &&
              this.eventOrigin.equals(other.getEventOrigin()))) &&
            ((this.managerHostname==null && other.getManagerHostname()==null) || 
             (this.managerHostname!=null &&
              this.managerHostname.equals(other.getManagerHostname()))) &&
            ((this.systemEventID==null && other.getSystemEventID()==null) || 
             (this.systemEventID!=null &&
              this.systemEventID.equals(other.getSystemEventID()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.targetID==null && other.getTargetID()==null) || 
             (this.targetID!=null &&
              this.targetID.equals(other.getTargetID()))) &&
            ((this.targetType==null && other.getTargetType()==null) || 
             (this.targetType!=null &&
              this.targetType.equals(other.getTargetType()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getActionPerformedBy() != null) {
            _hashCode += getActionPerformedBy().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEvent() != null) {
            _hashCode += getEvent().hashCode();
        }
        _hashCode += getEventID();
        if (getEventOrigin() != null) {
            _hashCode += getEventOrigin().hashCode();
        }
        if (getManagerHostname() != null) {
            _hashCode += getManagerHostname().hashCode();
        }
        if (getSystemEventID() != null) {
            _hashCode += getSystemEventID().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getTargetID() != null) {
            _hashCode += getTargetID().hashCode();
        }
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemEventTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "SystemEventTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionPerformedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "actionPerformedBy"));
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
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "eventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "eventOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumEventOrigin"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerHostname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "managerHostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "systemEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "targetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "targetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "type"));
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
