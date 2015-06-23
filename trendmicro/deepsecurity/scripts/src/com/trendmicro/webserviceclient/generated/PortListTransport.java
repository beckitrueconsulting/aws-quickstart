/**
 * PortListTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class PortListTransport  extends com.trendmicro.webserviceclient.generated.ItemsTransport  implements java.io.Serializable {
    private java.lang.String TBUID;

    public PortListTransport() {
    }

    public PortListTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           java.lang.String items,
           java.lang.String TBUID) {
        super(
            ID,
            description,
            name,
            items);
        this.TBUID = TBUID;
    }


    /**
     * Gets the TBUID value for this PortListTransport.
     * 
     * @return TBUID
     */
    public java.lang.String getTBUID() {
        return TBUID;
    }


    /**
     * Sets the TBUID value for this PortListTransport.
     * 
     * @param TBUID
     */
    public void setTBUID(java.lang.String TBUID) {
        this.TBUID = TBUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortListTransport)) return false;
        PortListTransport other = (PortListTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.TBUID==null && other.getTBUID()==null) || 
             (this.TBUID!=null &&
              this.TBUID.equals(other.getTBUID())));
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
        if (getTBUID() != null) {
            _hashCode += getTBUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortListTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "PortListTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TBUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "TBUID"));
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
