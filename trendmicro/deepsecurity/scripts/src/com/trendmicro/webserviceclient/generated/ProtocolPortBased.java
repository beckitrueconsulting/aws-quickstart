/**
 * ProtocolPortBased.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class ProtocolPortBased  implements java.io.Serializable {
    private java.lang.Integer portListID;

    private com.trendmicro.webserviceclient.generated.EnumPortType portType;

    private java.lang.String ports;

    public ProtocolPortBased() {
    }

    public ProtocolPortBased(
           java.lang.Integer portListID,
           com.trendmicro.webserviceclient.generated.EnumPortType portType,
           java.lang.String ports) {
           this.portListID = portListID;
           this.portType = portType;
           this.ports = ports;
    }


    /**
     * Gets the portListID value for this ProtocolPortBased.
     * 
     * @return portListID
     */
    public java.lang.Integer getPortListID() {
        return portListID;
    }


    /**
     * Sets the portListID value for this ProtocolPortBased.
     * 
     * @param portListID
     */
    public void setPortListID(java.lang.Integer portListID) {
        this.portListID = portListID;
    }


    /**
     * Gets the portType value for this ProtocolPortBased.
     * 
     * @return portType
     */
    public com.trendmicro.webserviceclient.generated.EnumPortType getPortType() {
        return portType;
    }


    /**
     * Sets the portType value for this ProtocolPortBased.
     * 
     * @param portType
     */
    public void setPortType(com.trendmicro.webserviceclient.generated.EnumPortType portType) {
        this.portType = portType;
    }


    /**
     * Gets the ports value for this ProtocolPortBased.
     * 
     * @return ports
     */
    public java.lang.String getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this ProtocolPortBased.
     * 
     * @param ports
     */
    public void setPorts(java.lang.String ports) {
        this.ports = ports;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProtocolPortBased)) return false;
        ProtocolPortBased other = (ProtocolPortBased) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.portListID==null && other.getPortListID()==null) || 
             (this.portListID!=null &&
              this.portListID.equals(other.getPortListID()))) &&
            ((this.portType==null && other.getPortType()==null) || 
             (this.portType!=null &&
              this.portType.equals(other.getPortType()))) &&
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              this.ports.equals(other.getPorts())));
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
        if (getPortListID() != null) {
            _hashCode += getPortListID().hashCode();
        }
        if (getPortType() != null) {
            _hashCode += getPortType().hashCode();
        }
        if (getPorts() != null) {
            _hashCode += getPorts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProtocolPortBased.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ProtocolPortBased"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portListID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "portListID"));
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
