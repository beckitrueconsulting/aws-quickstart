/**
 * ApplicationTypeOverrideTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class ApplicationTypeOverrideTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.Integer applicationTypeID;

    private java.lang.Integer securityProfileID;

    private com.trendmicro.webserviceclient.generated.EnumPortType portType;

    private java.lang.String ports;

    private java.lang.Integer portListID;

    private boolean ignoreRecommendations;

    public ApplicationTypeOverrideTransport() {
    }

    public ApplicationTypeOverrideTransport(
           java.lang.Integer ID,
           java.lang.Integer applicationTypeID,
           java.lang.Integer securityProfileID,
           com.trendmicro.webserviceclient.generated.EnumPortType portType,
           java.lang.String ports,
           java.lang.Integer portListID,
           boolean ignoreRecommendations) {
        this.ID = ID;
        this.applicationTypeID = applicationTypeID;
        this.securityProfileID = securityProfileID;
        this.portType = portType;
        this.ports = ports;
        this.portListID = portListID;
        this.ignoreRecommendations = ignoreRecommendations;
    }


    /**
     * Gets the ID value for this ApplicationTypeOverrideTransport.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this ApplicationTypeOverrideTransport.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the applicationTypeID value for this ApplicationTypeOverrideTransport.
     * 
     * @return applicationTypeID
     */
    public java.lang.Integer getApplicationTypeID() {
        return applicationTypeID;
    }


    /**
     * Sets the applicationTypeID value for this ApplicationTypeOverrideTransport.
     * 
     * @param applicationTypeID
     */
    public void setApplicationTypeID(java.lang.Integer applicationTypeID) {
        this.applicationTypeID = applicationTypeID;
    }


    /**
     * Gets the securityProfileID value for this ApplicationTypeOverrideTransport.
     * 
     * @return securityProfileID
     */
    public java.lang.Integer getSecurityProfileID() {
        return securityProfileID;
    }


    /**
     * Sets the securityProfileID value for this ApplicationTypeOverrideTransport.
     * 
     * @param securityProfileID
     */
    public void setSecurityProfileID(java.lang.Integer securityProfileID) {
        this.securityProfileID = securityProfileID;
    }


    /**
     * Gets the portType value for this ApplicationTypeOverrideTransport.
     * 
     * @return portType
     */
    public com.trendmicro.webserviceclient.generated.EnumPortType getPortType() {
        return portType;
    }


    /**
     * Sets the portType value for this ApplicationTypeOverrideTransport.
     * 
     * @param portType
     */
    public void setPortType(com.trendmicro.webserviceclient.generated.EnumPortType portType) {
        this.portType = portType;
    }


    /**
     * Gets the ports value for this ApplicationTypeOverrideTransport.
     * 
     * @return ports
     */
    public java.lang.String getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this ApplicationTypeOverrideTransport.
     * 
     * @param ports
     */
    public void setPorts(java.lang.String ports) {
        this.ports = ports;
    }


    /**
     * Gets the portListID value for this ApplicationTypeOverrideTransport.
     * 
     * @return portListID
     */
    public java.lang.Integer getPortListID() {
        return portListID;
    }


    /**
     * Sets the portListID value for this ApplicationTypeOverrideTransport.
     * 
     * @param portListID
     */
    public void setPortListID(java.lang.Integer portListID) {
        this.portListID = portListID;
    }


    /**
     * Gets the ignoreRecommendations value for this ApplicationTypeOverrideTransport.
     * 
     * @return ignoreRecommendations
     */
    public boolean isIgnoreRecommendations() {
        return ignoreRecommendations;
    }


    /**
     * Sets the ignoreRecommendations value for this ApplicationTypeOverrideTransport.
     * 
     * @param ignoreRecommendations
     */
    public void setIgnoreRecommendations(boolean ignoreRecommendations) {
        this.ignoreRecommendations = ignoreRecommendations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationTypeOverrideTransport)) return false;
        ApplicationTypeOverrideTransport other = (ApplicationTypeOverrideTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.applicationTypeID==null && other.getApplicationTypeID()==null) || 
             (this.applicationTypeID!=null &&
              this.applicationTypeID.equals(other.getApplicationTypeID()))) &&
            ((this.securityProfileID==null && other.getSecurityProfileID()==null) || 
             (this.securityProfileID!=null &&
              this.securityProfileID.equals(other.getSecurityProfileID()))) &&
            ((this.portType==null && other.getPortType()==null) || 
             (this.portType!=null &&
              this.portType.equals(other.getPortType()))) &&
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              this.ports.equals(other.getPorts()))) &&
            ((this.portListID==null && other.getPortListID()==null) || 
             (this.portListID!=null &&
              this.portListID.equals(other.getPortListID()))) &&
            this.ignoreRecommendations == other.isIgnoreRecommendations();
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getApplicationTypeID() != null) {
            _hashCode += getApplicationTypeID().hashCode();
        }
        if (getSecurityProfileID() != null) {
            _hashCode += getSecurityProfileID().hashCode();
        }
        if (getPortType() != null) {
            _hashCode += getPortType().hashCode();
        }
        if (getPorts() != null) {
            _hashCode += getPorts().hashCode();
        }
        if (getPortListID() != null) {
            _hashCode += getPortListID().hashCode();
        }
        _hashCode += (isIgnoreRecommendations() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationTypeOverrideTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ApplicationTypeOverrideTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "applicationTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityProfileID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "securityProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "portType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumPortType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "portListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreRecommendations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ignoreRecommendations"));
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
