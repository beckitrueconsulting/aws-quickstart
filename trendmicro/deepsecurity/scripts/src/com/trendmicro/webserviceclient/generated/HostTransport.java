/**
 * HostTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class HostTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private java.lang.String displayName;

    private boolean external;

    private java.lang.String externalID;

    private java.lang.Integer hostGroupID;

    private com.trendmicro.webserviceclient.generated.EnumHostType hostType;

    private java.lang.String platform;

    private java.lang.Integer securityProfileID;

    public HostTransport() {
    }

    public HostTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           java.lang.String displayName,
           boolean external,
           java.lang.String externalID,
           java.lang.Integer hostGroupID,
           com.trendmicro.webserviceclient.generated.EnumHostType hostType,
           java.lang.String platform,
           java.lang.Integer securityProfileID) {
        super(
            ID,
            description,
            name);
        this.displayName = displayName;
        this.external = external;
        this.externalID = externalID;
        this.hostGroupID = hostGroupID;
        this.hostType = hostType;
        this.platform = platform;
        this.securityProfileID = securityProfileID;
    }


    /**
     * Gets the displayName value for this HostTransport.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this HostTransport.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the external value for this HostTransport.
     * 
     * @return external
     */
    public boolean isExternal() {
        return external;
    }


    /**
     * Sets the external value for this HostTransport.
     * 
     * @param external
     */
    public void setExternal(boolean external) {
        this.external = external;
    }


    /**
     * Gets the externalID value for this HostTransport.
     * 
     * @return externalID
     */
    public java.lang.String getExternalID() {
        return externalID;
    }


    /**
     * Sets the externalID value for this HostTransport.
     * 
     * @param externalID
     */
    public void setExternalID(java.lang.String externalID) {
        this.externalID = externalID;
    }


    /**
     * Gets the hostGroupID value for this HostTransport.
     * 
     * @return hostGroupID
     */
    public java.lang.Integer getHostGroupID() {
        return hostGroupID;
    }


    /**
     * Sets the hostGroupID value for this HostTransport.
     * 
     * @param hostGroupID
     */
    public void setHostGroupID(java.lang.Integer hostGroupID) {
        this.hostGroupID = hostGroupID;
    }


    /**
     * Gets the hostType value for this HostTransport.
     * 
     * @return hostType
     */
    public com.trendmicro.webserviceclient.generated.EnumHostType getHostType() {
        return hostType;
    }


    /**
     * Sets the hostType value for this HostTransport.
     * 
     * @param hostType
     */
    public void setHostType(com.trendmicro.webserviceclient.generated.EnumHostType hostType) {
        this.hostType = hostType;
    }


    /**
     * Gets the platform value for this HostTransport.
     * 
     * @return platform
     */
    public java.lang.String getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this HostTransport.
     * 
     * @param platform
     */
    public void setPlatform(java.lang.String platform) {
        this.platform = platform;
    }


    /**
     * Gets the securityProfileID value for this HostTransport.
     * 
     * @return securityProfileID
     */
    public java.lang.Integer getSecurityProfileID() {
        return securityProfileID;
    }


    /**
     * Sets the securityProfileID value for this HostTransport.
     * 
     * @param securityProfileID
     */
    public void setSecurityProfileID(java.lang.Integer securityProfileID) {
        this.securityProfileID = securityProfileID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostTransport)) return false;
        HostTransport other = (HostTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            this.external == other.isExternal() &&
            ((this.externalID==null && other.getExternalID()==null) || 
             (this.externalID!=null &&
              this.externalID.equals(other.getExternalID()))) &&
            ((this.hostGroupID==null && other.getHostGroupID()==null) || 
             (this.hostGroupID!=null &&
              this.hostGroupID.equals(other.getHostGroupID()))) &&
            ((this.hostType==null && other.getHostType()==null) || 
             (this.hostType!=null &&
              this.hostType.equals(other.getHostType()))) &&
            ((this.platform==null && other.getPlatform()==null) || 
             (this.platform!=null &&
              this.platform.equals(other.getPlatform()))) &&
            ((this.securityProfileID==null && other.getSecurityProfileID()==null) || 
             (this.securityProfileID!=null &&
              this.securityProfileID.equals(other.getSecurityProfileID())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        _hashCode += (isExternal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExternalID() != null) {
            _hashCode += getExternalID().hashCode();
        }
        if (getHostGroupID() != null) {
            _hashCode += getHostGroupID().hashCode();
        }
        if (getHostType() != null) {
            _hashCode += getHostType().hashCode();
        }
        if (getPlatform() != null) {
            _hashCode += getPlatform().hashCode();
        }
        if (getSecurityProfileID() != null) {
            _hashCode += getSecurityProfileID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("external");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "external"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "externalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumHostType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityProfileID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "securityProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
