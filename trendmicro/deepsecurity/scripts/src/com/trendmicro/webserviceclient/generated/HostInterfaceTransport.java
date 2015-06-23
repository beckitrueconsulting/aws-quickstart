/**
 * HostInterfaceTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class HostInterfaceTransport  extends com.trendmicro.webserviceclient.generated.HostTransport  implements java.io.Serializable {
    private boolean dhcp;

    private java.lang.Integer hostBridgeId;

    private java.lang.Integer interfaceTypeId;

    private java.lang.String mac;

    private boolean notAvailable;

    private java.lang.Integer virtualDeviceKey;

    public HostInterfaceTransport() {
    }

    public HostInterfaceTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           java.lang.String displayName,
           boolean external,
           java.lang.String externalID,
           java.lang.Integer hostGroupID,
           com.trendmicro.webserviceclient.generated.EnumHostType hostType,
           java.lang.String platform,
           java.lang.Integer securityProfileID,
           boolean dhcp,
           java.lang.Integer hostBridgeId,
           java.lang.Integer interfaceTypeId,
           java.lang.String mac,
           boolean notAvailable,
           java.lang.Integer virtualDeviceKey) {
        super(
            ID,
            description,
            name,
            displayName,
            external,
            externalID,
            hostGroupID,
            hostType,
            platform,
            securityProfileID);
        this.dhcp = dhcp;
        this.hostBridgeId = hostBridgeId;
        this.interfaceTypeId = interfaceTypeId;
        this.mac = mac;
        this.notAvailable = notAvailable;
        this.virtualDeviceKey = virtualDeviceKey;
    }


    /**
     * Gets the dhcp value for this HostInterfaceTransport.
     * 
     * @return dhcp
     */
    public boolean isDhcp() {
        return dhcp;
    }


    /**
     * Sets the dhcp value for this HostInterfaceTransport.
     * 
     * @param dhcp
     */
    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }


    /**
     * Gets the hostBridgeId value for this HostInterfaceTransport.
     * 
     * @return hostBridgeId
     */
    public java.lang.Integer getHostBridgeId() {
        return hostBridgeId;
    }


    /**
     * Sets the hostBridgeId value for this HostInterfaceTransport.
     * 
     * @param hostBridgeId
     */
    public void setHostBridgeId(java.lang.Integer hostBridgeId) {
        this.hostBridgeId = hostBridgeId;
    }


    /**
     * Gets the interfaceTypeId value for this HostInterfaceTransport.
     * 
     * @return interfaceTypeId
     */
    public java.lang.Integer getInterfaceTypeId() {
        return interfaceTypeId;
    }


    /**
     * Sets the interfaceTypeId value for this HostInterfaceTransport.
     * 
     * @param interfaceTypeId
     */
    public void setInterfaceTypeId(java.lang.Integer interfaceTypeId) {
        this.interfaceTypeId = interfaceTypeId;
    }


    /**
     * Gets the mac value for this HostInterfaceTransport.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this HostInterfaceTransport.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the notAvailable value for this HostInterfaceTransport.
     * 
     * @return notAvailable
     */
    public boolean isNotAvailable() {
        return notAvailable;
    }


    /**
     * Sets the notAvailable value for this HostInterfaceTransport.
     * 
     * @param notAvailable
     */
    public void setNotAvailable(boolean notAvailable) {
        this.notAvailable = notAvailable;
    }


    /**
     * Gets the virtualDeviceKey value for this HostInterfaceTransport.
     * 
     * @return virtualDeviceKey
     */
    public java.lang.Integer getVirtualDeviceKey() {
        return virtualDeviceKey;
    }


    /**
     * Sets the virtualDeviceKey value for this HostInterfaceTransport.
     * 
     * @param virtualDeviceKey
     */
    public void setVirtualDeviceKey(java.lang.Integer virtualDeviceKey) {
        this.virtualDeviceKey = virtualDeviceKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInterfaceTransport)) return false;
        HostInterfaceTransport other = (HostInterfaceTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.dhcp == other.isDhcp() &&
            ((this.hostBridgeId==null && other.getHostBridgeId()==null) || 
             (this.hostBridgeId!=null &&
              this.hostBridgeId.equals(other.getHostBridgeId()))) &&
            ((this.interfaceTypeId==null && other.getInterfaceTypeId()==null) || 
             (this.interfaceTypeId!=null &&
              this.interfaceTypeId.equals(other.getInterfaceTypeId()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            this.notAvailable == other.isNotAvailable() &&
            ((this.virtualDeviceKey==null && other.getVirtualDeviceKey()==null) || 
             (this.virtualDeviceKey!=null &&
              this.virtualDeviceKey.equals(other.getVirtualDeviceKey())));
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
        _hashCode += (isDhcp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHostBridgeId() != null) {
            _hashCode += getHostBridgeId().hashCode();
        }
        if (getInterfaceTypeId() != null) {
            _hashCode += getInterfaceTypeId().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        _hashCode += (isNotAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVirtualDeviceKey() != null) {
            _hashCode += getVirtualDeviceKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInterfaceTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostInterfaceTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "dhcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostBridgeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostBridgeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "interfaceTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "notAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDeviceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "virtualDeviceKey"));
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
