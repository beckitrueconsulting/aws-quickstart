/**
 * HostFilterTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class HostFilterTransport  implements java.io.Serializable {
    private java.lang.Integer hostGroupID;

    private java.lang.Integer hostID;

    private java.lang.Integer securityProfileID;

    private com.trendmicro.webserviceclient.generated.EnumHostFilterType type;

    public HostFilterTransport() {
    }

    public HostFilterTransport(
           java.lang.Integer hostGroupID,
           java.lang.Integer hostID,
           java.lang.Integer securityProfileID,
           com.trendmicro.webserviceclient.generated.EnumHostFilterType type) {
           this.hostGroupID = hostGroupID;
           this.hostID = hostID;
           this.securityProfileID = securityProfileID;
           this.type = type;
    }


    /**
     * Gets the hostGroupID value for this HostFilterTransport.
     * 
     * @return hostGroupID
     */
    public java.lang.Integer getHostGroupID() {
        return hostGroupID;
    }


    /**
     * Sets the hostGroupID value for this HostFilterTransport.
     * 
     * @param hostGroupID
     */
    public void setHostGroupID(java.lang.Integer hostGroupID) {
        this.hostGroupID = hostGroupID;
    }


    /**
     * Gets the hostID value for this HostFilterTransport.
     * 
     * @return hostID
     */
    public java.lang.Integer getHostID() {
        return hostID;
    }


    /**
     * Sets the hostID value for this HostFilterTransport.
     * 
     * @param hostID
     */
    public void setHostID(java.lang.Integer hostID) {
        this.hostID = hostID;
    }


    /**
     * Gets the securityProfileID value for this HostFilterTransport.
     * 
     * @return securityProfileID
     */
    public java.lang.Integer getSecurityProfileID() {
        return securityProfileID;
    }


    /**
     * Sets the securityProfileID value for this HostFilterTransport.
     * 
     * @param securityProfileID
     */
    public void setSecurityProfileID(java.lang.Integer securityProfileID) {
        this.securityProfileID = securityProfileID;
    }


    /**
     * Gets the type value for this HostFilterTransport.
     * 
     * @return type
     */
    public com.trendmicro.webserviceclient.generated.EnumHostFilterType getType() {
        return type;
    }


    /**
     * Sets the type value for this HostFilterTransport.
     * 
     * @param type
     */
    public void setType(com.trendmicro.webserviceclient.generated.EnumHostFilterType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFilterTransport)) return false;
        HostFilterTransport other = (HostFilterTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostGroupID==null && other.getHostGroupID()==null) || 
             (this.hostGroupID!=null &&
              this.hostGroupID.equals(other.getHostGroupID()))) &&
            ((this.hostID==null && other.getHostID()==null) || 
             (this.hostID!=null &&
              this.hostID.equals(other.getHostID()))) &&
            ((this.securityProfileID==null && other.getSecurityProfileID()==null) || 
             (this.securityProfileID!=null &&
              this.securityProfileID.equals(other.getSecurityProfileID()))) &&
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
        int _hashCode = 1;
        if (getHostGroupID() != null) {
            _hashCode += getHostGroupID().hashCode();
        }
        if (getHostID() != null) {
            _hashCode += getHostID().hashCode();
        }
        if (getSecurityProfileID() != null) {
            _hashCode += getSecurityProfileID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFilterTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostFilterTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostID"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumHostFilterType"));
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
