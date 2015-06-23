/**
 * AlertStatusTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class AlertStatusTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.util.Calendar alertDate;

    private java.lang.String alertType;

    private java.lang.Integer severity;

    private java.lang.String severityText;

    public AlertStatusTransport() {
    }

    public AlertStatusTransport(
           java.util.Calendar alertDate,
           java.lang.String alertType,
           java.lang.Integer severity,
           java.lang.String severityText) {
        this.alertDate = alertDate;
        this.alertType = alertType;
        this.severity = severity;
        this.severityText = severityText;
    }


    /**
     * Gets the alertDate value for this AlertStatusTransport.
     * 
     * @return alertDate
     */
    public java.util.Calendar getAlertDate() {
        return alertDate;
    }


    /**
     * Sets the alertDate value for this AlertStatusTransport.
     * 
     * @param alertDate
     */
    public void setAlertDate(java.util.Calendar alertDate) {
        this.alertDate = alertDate;
    }


    /**
     * Gets the alertType value for this AlertStatusTransport.
     * 
     * @return alertType
     */
    public java.lang.String getAlertType() {
        return alertType;
    }


    /**
     * Sets the alertType value for this AlertStatusTransport.
     * 
     * @param alertType
     */
    public void setAlertType(java.lang.String alertType) {
        this.alertType = alertType;
    }


    /**
     * Gets the severity value for this AlertStatusTransport.
     * 
     * @return severity
     */
    public java.lang.Integer getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this AlertStatusTransport.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.Integer severity) {
        this.severity = severity;
    }


    /**
     * Gets the severityText value for this AlertStatusTransport.
     * 
     * @return severityText
     */
    public java.lang.String getSeverityText() {
        return severityText;
    }


    /**
     * Sets the severityText value for this AlertStatusTransport.
     * 
     * @param severityText
     */
    public void setSeverityText(java.lang.String severityText) {
        this.severityText = severityText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlertStatusTransport)) return false;
        AlertStatusTransport other = (AlertStatusTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alertDate==null && other.getAlertDate()==null) || 
             (this.alertDate!=null &&
              this.alertDate.equals(other.getAlertDate()))) &&
            ((this.alertType==null && other.getAlertType()==null) || 
             (this.alertType!=null &&
              this.alertType.equals(other.getAlertType()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.severityText==null && other.getSeverityText()==null) || 
             (this.severityText!=null &&
              this.severityText.equals(other.getSeverityText())));
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
        if (getAlertDate() != null) {
            _hashCode += getAlertDate().hashCode();
        }
        if (getAlertType() != null) {
            _hashCode += getAlertType().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSeverityText() != null) {
            _hashCode += getSeverityText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlertStatusTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "AlertStatusTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "alertDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "alertType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "severityText"));
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
