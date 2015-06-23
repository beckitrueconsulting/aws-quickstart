/**
 * HostGroupTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class HostGroupTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private boolean external;

    private java.lang.String externalID;

    private java.lang.Integer parentGroupID;

    public HostGroupTransport() {
    }

    public HostGroupTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           boolean external,
           java.lang.String externalID,
           java.lang.Integer parentGroupID) {
        super(
            ID,
            description,
            name);
        this.external = external;
        this.externalID = externalID;
        this.parentGroupID = parentGroupID;
    }


    /**
     * Gets the external value for this HostGroupTransport.
     * 
     * @return external
     */
    public boolean isExternal() {
        return external;
    }


    /**
     * Sets the external value for this HostGroupTransport.
     * 
     * @param external
     */
    public void setExternal(boolean external) {
        this.external = external;
    }


    /**
     * Gets the externalID value for this HostGroupTransport.
     * 
     * @return externalID
     */
    public java.lang.String getExternalID() {
        return externalID;
    }


    /**
     * Sets the externalID value for this HostGroupTransport.
     * 
     * @param externalID
     */
    public void setExternalID(java.lang.String externalID) {
        this.externalID = externalID;
    }


    /**
     * Gets the parentGroupID value for this HostGroupTransport.
     * 
     * @return parentGroupID
     */
    public java.lang.Integer getParentGroupID() {
        return parentGroupID;
    }


    /**
     * Sets the parentGroupID value for this HostGroupTransport.
     * 
     * @param parentGroupID
     */
    public void setParentGroupID(java.lang.Integer parentGroupID) {
        this.parentGroupID = parentGroupID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostGroupTransport)) return false;
        HostGroupTransport other = (HostGroupTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.external == other.isExternal() &&
            ((this.externalID==null && other.getExternalID()==null) || 
             (this.externalID!=null &&
              this.externalID.equals(other.getExternalID()))) &&
            ((this.parentGroupID==null && other.getParentGroupID()==null) || 
             (this.parentGroupID!=null &&
              this.parentGroupID.equals(other.getParentGroupID())));
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
        _hashCode += (isExternal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExternalID() != null) {
            _hashCode += getExternalID().hashCode();
        }
        if (getParentGroupID() != null) {
            _hashCode += getParentGroupID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostGroupTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostGroupTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("parentGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "parentGroupID"));
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
