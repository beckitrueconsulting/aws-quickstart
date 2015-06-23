/**
 * StatusSummaryTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class StatusSummaryTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private int alertErrorNum;

    private int alertWarningNum;

    private com.trendmicro.webserviceclient.generated.HostStatusSummaryTransport hostStatusSummary;

    public StatusSummaryTransport() {
    }

    public StatusSummaryTransport(
           int alertErrorNum,
           int alertWarningNum,
           com.trendmicro.webserviceclient.generated.HostStatusSummaryTransport hostStatusSummary) {
        this.alertErrorNum = alertErrorNum;
        this.alertWarningNum = alertWarningNum;
        this.hostStatusSummary = hostStatusSummary;
    }


    /**
     * Gets the alertErrorNum value for this StatusSummaryTransport.
     * 
     * @return alertErrorNum
     */
    public int getAlertErrorNum() {
        return alertErrorNum;
    }


    /**
     * Sets the alertErrorNum value for this StatusSummaryTransport.
     * 
     * @param alertErrorNum
     */
    public void setAlertErrorNum(int alertErrorNum) {
        this.alertErrorNum = alertErrorNum;
    }


    /**
     * Gets the alertWarningNum value for this StatusSummaryTransport.
     * 
     * @return alertWarningNum
     */
    public int getAlertWarningNum() {
        return alertWarningNum;
    }


    /**
     * Sets the alertWarningNum value for this StatusSummaryTransport.
     * 
     * @param alertWarningNum
     */
    public void setAlertWarningNum(int alertWarningNum) {
        this.alertWarningNum = alertWarningNum;
    }


    /**
     * Gets the hostStatusSummary value for this StatusSummaryTransport.
     * 
     * @return hostStatusSummary
     */
    public com.trendmicro.webserviceclient.generated.HostStatusSummaryTransport getHostStatusSummary() {
        return hostStatusSummary;
    }


    /**
     * Sets the hostStatusSummary value for this StatusSummaryTransport.
     * 
     * @param hostStatusSummary
     */
    public void setHostStatusSummary(com.trendmicro.webserviceclient.generated.HostStatusSummaryTransport hostStatusSummary) {
        this.hostStatusSummary = hostStatusSummary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusSummaryTransport)) return false;
        StatusSummaryTransport other = (StatusSummaryTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.alertErrorNum == other.getAlertErrorNum() &&
            this.alertWarningNum == other.getAlertWarningNum() &&
            ((this.hostStatusSummary==null && other.getHostStatusSummary()==null) || 
             (this.hostStatusSummary!=null &&
              this.hostStatusSummary.equals(other.getHostStatusSummary())));
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
        _hashCode += getAlertErrorNum();
        _hashCode += getAlertWarningNum();
        if (getHostStatusSummary() != null) {
            _hashCode += getHostStatusSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusSummaryTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "StatusSummaryTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertErrorNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "alertErrorNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertWarningNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "alertWarningNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostStatusSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostStatusSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostStatusSummaryTransport"));
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
