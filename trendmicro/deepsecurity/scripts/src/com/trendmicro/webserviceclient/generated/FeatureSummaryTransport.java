/**
 * FeatureSummaryTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class FeatureSummaryTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.FeatureSummaryDetailTransport[] featureSummaryDetails;

    private int totalComputerNum;

    public FeatureSummaryTransport() {
    }

    public FeatureSummaryTransport(
           com.trendmicro.webserviceclient.generated.FeatureSummaryDetailTransport[] featureSummaryDetails,
           int totalComputerNum) {
        this.featureSummaryDetails = featureSummaryDetails;
        this.totalComputerNum = totalComputerNum;
    }


    /**
     * Gets the featureSummaryDetails value for this FeatureSummaryTransport.
     * 
     * @return featureSummaryDetails
     */
    public com.trendmicro.webserviceclient.generated.FeatureSummaryDetailTransport[] getFeatureSummaryDetails() {
        return featureSummaryDetails;
    }


    /**
     * Sets the featureSummaryDetails value for this FeatureSummaryTransport.
     * 
     * @param featureSummaryDetails
     */
    public void setFeatureSummaryDetails(com.trendmicro.webserviceclient.generated.FeatureSummaryDetailTransport[] featureSummaryDetails) {
        this.featureSummaryDetails = featureSummaryDetails;
    }


    /**
     * Gets the totalComputerNum value for this FeatureSummaryTransport.
     * 
     * @return totalComputerNum
     */
    public int getTotalComputerNum() {
        return totalComputerNum;
    }


    /**
     * Sets the totalComputerNum value for this FeatureSummaryTransport.
     * 
     * @param totalComputerNum
     */
    public void setTotalComputerNum(int totalComputerNum) {
        this.totalComputerNum = totalComputerNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureSummaryTransport)) return false;
        FeatureSummaryTransport other = (FeatureSummaryTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.featureSummaryDetails==null && other.getFeatureSummaryDetails()==null) || 
             (this.featureSummaryDetails!=null &&
              java.util.Arrays.equals(this.featureSummaryDetails, other.getFeatureSummaryDetails()))) &&
            this.totalComputerNum == other.getTotalComputerNum();
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
        if (getFeatureSummaryDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureSummaryDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureSummaryDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalComputerNum();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureSummaryTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "FeatureSummaryTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureSummaryDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "featureSummaryDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "FeatureSummaryDetailTransport"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalComputerNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "totalComputerNum"));
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
