/**
 * IDFilterTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class IDFilterTransport  implements java.io.Serializable {
    private java.lang.Integer id;

    private com.trendmicro.webserviceclient.generated.EnumOperator operator;

    public IDFilterTransport() {
    }

    public IDFilterTransport(
           java.lang.Integer id,
           com.trendmicro.webserviceclient.generated.EnumOperator operator) {
           this.id = id;
           this.operator = operator;
    }


    /**
     * Gets the id value for this IDFilterTransport.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this IDFilterTransport.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the operator value for this IDFilterTransport.
     * 
     * @return operator
     */
    public com.trendmicro.webserviceclient.generated.EnumOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this IDFilterTransport.
     * 
     * @param operator
     */
    public void setOperator(com.trendmicro.webserviceclient.generated.EnumOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDFilterTransport)) return false;
        IDFilterTransport other = (IDFilterTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDFilterTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "IDFilterTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumOperator"));
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
