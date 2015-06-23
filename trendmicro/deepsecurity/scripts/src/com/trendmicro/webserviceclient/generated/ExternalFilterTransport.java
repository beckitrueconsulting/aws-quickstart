/**
 * ExternalFilterTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class ExternalFilterTransport  implements java.io.Serializable {
    private java.lang.String hostExternalID;

    private java.lang.String hostGroupExternalID;

    private com.trendmicro.webserviceclient.generated.EnumExternalFilterType type;

    public ExternalFilterTransport() {
    }

    public ExternalFilterTransport(
           java.lang.String hostExternalID,
           java.lang.String hostGroupExternalID,
           com.trendmicro.webserviceclient.generated.EnumExternalFilterType type) {
           this.hostExternalID = hostExternalID;
           this.hostGroupExternalID = hostGroupExternalID;
           this.type = type;
    }


    /**
     * Gets the hostExternalID value for this ExternalFilterTransport.
     * 
     * @return hostExternalID
     */
    public java.lang.String getHostExternalID() {
        return hostExternalID;
    }


    /**
     * Sets the hostExternalID value for this ExternalFilterTransport.
     * 
     * @param hostExternalID
     */
    public void setHostExternalID(java.lang.String hostExternalID) {
        this.hostExternalID = hostExternalID;
    }


    /**
     * Gets the hostGroupExternalID value for this ExternalFilterTransport.
     * 
     * @return hostGroupExternalID
     */
    public java.lang.String getHostGroupExternalID() {
        return hostGroupExternalID;
    }


    /**
     * Sets the hostGroupExternalID value for this ExternalFilterTransport.
     * 
     * @param hostGroupExternalID
     */
    public void setHostGroupExternalID(java.lang.String hostGroupExternalID) {
        this.hostGroupExternalID = hostGroupExternalID;
    }


    /**
     * Gets the type value for this ExternalFilterTransport.
     * 
     * @return type
     */
    public com.trendmicro.webserviceclient.generated.EnumExternalFilterType getType() {
        return type;
    }


    /**
     * Sets the type value for this ExternalFilterTransport.
     * 
     * @param type
     */
    public void setType(com.trendmicro.webserviceclient.generated.EnumExternalFilterType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalFilterTransport)) return false;
        ExternalFilterTransport other = (ExternalFilterTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostExternalID==null && other.getHostExternalID()==null) || 
             (this.hostExternalID!=null &&
              this.hostExternalID.equals(other.getHostExternalID()))) &&
            ((this.hostGroupExternalID==null && other.getHostGroupExternalID()==null) || 
             (this.hostGroupExternalID!=null &&
              this.hostGroupExternalID.equals(other.getHostGroupExternalID()))) &&
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
        if (getHostExternalID() != null) {
            _hashCode += getHostExternalID().hashCode();
        }
        if (getHostGroupExternalID() != null) {
            _hashCode += getHostGroupExternalID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalFilterTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ExternalFilterTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostExternalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostExternalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostGroupExternalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostGroupExternalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumExternalFilterType"));
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
