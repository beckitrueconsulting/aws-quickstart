/**
 * CounterAlertTypeTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class CounterAlertTypeTransport  extends com.trendmicro.webserviceclient.generated.CounterTransport  implements java.io.Serializable {
    private int severity;

    private java.lang.String percentOpen;

    private java.lang.String averageTimeOpen;

    public CounterAlertTypeTransport() {
    }

    public CounterAlertTypeTransport(
           java.lang.String description,
           float percentOfTotal,
           java.lang.String percentOfTotalString,
           java.lang.String text,
           long value,
           java.lang.String valueString,
           long previousValue,
           int severity,
           java.lang.String percentOpen,
           java.lang.String averageTimeOpen) {
        super(
            description,
            percentOfTotal,
            percentOfTotalString,
            text,
            value,
            valueString,
            previousValue);
        this.severity = severity;
        this.percentOpen = percentOpen;
        this.averageTimeOpen = averageTimeOpen;
    }


    /**
     * Gets the severity value for this CounterAlertTypeTransport.
     * 
     * @return severity
     */
    public int getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this CounterAlertTypeTransport.
     * 
     * @param severity
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }


    /**
     * Gets the percentOpen value for this CounterAlertTypeTransport.
     * 
     * @return percentOpen
     */
    public java.lang.String getPercentOpen() {
        return percentOpen;
    }


    /**
     * Sets the percentOpen value for this CounterAlertTypeTransport.
     * 
     * @param percentOpen
     */
    public void setPercentOpen(java.lang.String percentOpen) {
        this.percentOpen = percentOpen;
    }


    /**
     * Gets the averageTimeOpen value for this CounterAlertTypeTransport.
     * 
     * @return averageTimeOpen
     */
    public java.lang.String getAverageTimeOpen() {
        return averageTimeOpen;
    }


    /**
     * Sets the averageTimeOpen value for this CounterAlertTypeTransport.
     * 
     * @param averageTimeOpen
     */
    public void setAverageTimeOpen(java.lang.String averageTimeOpen) {
        this.averageTimeOpen = averageTimeOpen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CounterAlertTypeTransport)) return false;
        CounterAlertTypeTransport other = (CounterAlertTypeTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.severity == other.getSeverity() &&
            ((this.percentOpen==null && other.getPercentOpen()==null) || 
             (this.percentOpen!=null &&
              this.percentOpen.equals(other.getPercentOpen()))) &&
            ((this.averageTimeOpen==null && other.getAverageTimeOpen()==null) || 
             (this.averageTimeOpen!=null &&
              this.averageTimeOpen.equals(other.getAverageTimeOpen())));
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
        _hashCode += getSeverity();
        if (getPercentOpen() != null) {
            _hashCode += getPercentOpen().hashCode();
        }
        if (getAverageTimeOpen() != null) {
            _hashCode += getAverageTimeOpen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CounterAlertTypeTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "CounterAlertTypeTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "percentOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageTimeOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "averageTimeOpen"));
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
