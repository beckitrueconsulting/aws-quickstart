/**
 * FeatureSummaryDetailTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class FeatureSummaryDetailTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.String featureName;

    private long protectedComputerNum;

    private long totalEventNum;

    private long preventedEventNum;

    private long detectedEventNum;

    private long previousTotalEventNum;

    private long previousPreventedEventNum;

    private long previousDetectedEventNum;

    public FeatureSummaryDetailTransport() {
    }

    public FeatureSummaryDetailTransport(
           java.lang.String featureName,
           long protectedComputerNum,
           long totalEventNum,
           long preventedEventNum,
           long detectedEventNum,
           long previousTotalEventNum,
           long previousPreventedEventNum,
           long previousDetectedEventNum) {
        this.featureName = featureName;
        this.protectedComputerNum = protectedComputerNum;
        this.totalEventNum = totalEventNum;
        this.preventedEventNum = preventedEventNum;
        this.detectedEventNum = detectedEventNum;
        this.previousTotalEventNum = previousTotalEventNum;
        this.previousPreventedEventNum = previousPreventedEventNum;
        this.previousDetectedEventNum = previousDetectedEventNum;
    }


    /**
     * Gets the featureName value for this FeatureSummaryDetailTransport.
     * 
     * @return featureName
     */
    public java.lang.String getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this FeatureSummaryDetailTransport.
     * 
     * @param featureName
     */
    public void setFeatureName(java.lang.String featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the protectedComputerNum value for this FeatureSummaryDetailTransport.
     * 
     * @return protectedComputerNum
     */
    public long getProtectedComputerNum() {
        return protectedComputerNum;
    }


    /**
     * Sets the protectedComputerNum value for this FeatureSummaryDetailTransport.
     * 
     * @param protectedComputerNum
     */
    public void setProtectedComputerNum(long protectedComputerNum) {
        this.protectedComputerNum = protectedComputerNum;
    }


    /**
     * Gets the totalEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @return totalEventNum
     */
    public long getTotalEventNum() {
        return totalEventNum;
    }


    /**
     * Sets the totalEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @param totalEventNum
     */
    public void setTotalEventNum(long totalEventNum) {
        this.totalEventNum = totalEventNum;
    }


    /**
     * Gets the preventedEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @return preventedEventNum
     */
    public long getPreventedEventNum() {
        return preventedEventNum;
    }


    /**
     * Sets the preventedEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @param preventedEventNum
     */
    public void setPreventedEventNum(long preventedEventNum) {
        this.preventedEventNum = preventedEventNum;
    }


    /**
     * Gets the detectedEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @return detectedEventNum
     */
    public long getDetectedEventNum() {
        return detectedEventNum;
    }


    /**
     * Sets the detectedEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @param detectedEventNum
     */
    public void setDetectedEventNum(long detectedEventNum) {
        this.detectedEventNum = detectedEventNum;
    }


    /**
     * Gets the previousTotalEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @return previousTotalEventNum
     */
    public long getPreviousTotalEventNum() {
        return previousTotalEventNum;
    }


    /**
     * Sets the previousTotalEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @param previousTotalEventNum
     */
    public void setPreviousTotalEventNum(long previousTotalEventNum) {
        this.previousTotalEventNum = previousTotalEventNum;
    }


    /**
     * Gets the previousPreventedEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @return previousPreventedEventNum
     */
    public long getPreviousPreventedEventNum() {
        return previousPreventedEventNum;
    }


    /**
     * Sets the previousPreventedEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @param previousPreventedEventNum
     */
    public void setPreviousPreventedEventNum(long previousPreventedEventNum) {
        this.previousPreventedEventNum = previousPreventedEventNum;
    }


    /**
     * Gets the previousDetectedEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @return previousDetectedEventNum
     */
    public long getPreviousDetectedEventNum() {
        return previousDetectedEventNum;
    }


    /**
     * Sets the previousDetectedEventNum value for this FeatureSummaryDetailTransport.
     * 
     * @param previousDetectedEventNum
     */
    public void setPreviousDetectedEventNum(long previousDetectedEventNum) {
        this.previousDetectedEventNum = previousDetectedEventNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureSummaryDetailTransport)) return false;
        FeatureSummaryDetailTransport other = (FeatureSummaryDetailTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.featureName==null && other.getFeatureName()==null) || 
             (this.featureName!=null &&
              this.featureName.equals(other.getFeatureName()))) &&
            this.protectedComputerNum == other.getProtectedComputerNum() &&
            this.totalEventNum == other.getTotalEventNum() &&
            this.preventedEventNum == other.getPreventedEventNum() &&
            this.detectedEventNum == other.getDetectedEventNum() &&
            this.previousTotalEventNum == other.getPreviousTotalEventNum() &&
            this.previousPreventedEventNum == other.getPreviousPreventedEventNum() &&
            this.previousDetectedEventNum == other.getPreviousDetectedEventNum();
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
        if (getFeatureName() != null) {
            _hashCode += getFeatureName().hashCode();
        }
        _hashCode += new Long(getProtectedComputerNum()).hashCode();
        _hashCode += new Long(getTotalEventNum()).hashCode();
        _hashCode += new Long(getPreventedEventNum()).hashCode();
        _hashCode += new Long(getDetectedEventNum()).hashCode();
        _hashCode += new Long(getPreviousTotalEventNum()).hashCode();
        _hashCode += new Long(getPreviousPreventedEventNum()).hashCode();
        _hashCode += new Long(getPreviousDetectedEventNum()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureSummaryDetailTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "FeatureSummaryDetailTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "featureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectedComputerNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protectedComputerNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalEventNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "totalEventNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preventedEventNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "preventedEventNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detectedEventNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "detectedEventNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousTotalEventNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "previousTotalEventNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousPreventedEventNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "previousPreventedEventNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousDetectedEventNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "previousDetectedEventNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
