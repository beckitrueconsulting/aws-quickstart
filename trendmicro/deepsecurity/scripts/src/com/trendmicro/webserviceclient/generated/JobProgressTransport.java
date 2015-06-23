/**
 * JobProgressTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class JobProgressTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private int complete;

    private int error;

    private int pending;

    private int unable;

    public JobProgressTransport() {
    }

    public JobProgressTransport(
           int complete,
           int error,
           int pending,
           int unable) {
        this.complete = complete;
        this.error = error;
        this.pending = pending;
        this.unable = unable;
    }


    /**
     * Gets the complete value for this JobProgressTransport.
     * 
     * @return complete
     */
    public int getComplete() {
        return complete;
    }


    /**
     * Sets the complete value for this JobProgressTransport.
     * 
     * @param complete
     */
    public void setComplete(int complete) {
        this.complete = complete;
    }


    /**
     * Gets the error value for this JobProgressTransport.
     * 
     * @return error
     */
    public int getError() {
        return error;
    }


    /**
     * Sets the error value for this JobProgressTransport.
     * 
     * @param error
     */
    public void setError(int error) {
        this.error = error;
    }


    /**
     * Gets the pending value for this JobProgressTransport.
     * 
     * @return pending
     */
    public int getPending() {
        return pending;
    }


    /**
     * Sets the pending value for this JobProgressTransport.
     * 
     * @param pending
     */
    public void setPending(int pending) {
        this.pending = pending;
    }


    /**
     * Gets the unable value for this JobProgressTransport.
     * 
     * @return unable
     */
    public int getUnable() {
        return unable;
    }


    /**
     * Sets the unable value for this JobProgressTransport.
     * 
     * @param unable
     */
    public void setUnable(int unable) {
        this.unable = unable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobProgressTransport)) return false;
        JobProgressTransport other = (JobProgressTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.complete == other.getComplete() &&
            this.error == other.getError() &&
            this.pending == other.getPending() &&
            this.unable == other.getUnable();
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
        _hashCode += getComplete();
        _hashCode += getError();
        _hashCode += getPending();
        _hashCode += getUnable();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobProgressTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "JobProgressTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "complete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "pending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "unable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
