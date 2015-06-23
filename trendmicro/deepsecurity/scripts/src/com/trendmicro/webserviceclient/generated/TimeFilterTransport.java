/**
 * TimeFilterTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class TimeFilterTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.util.Calendar rangeFrom;

    private java.util.Calendar rangeTo;

    private java.util.Calendar specificTime;

    private com.trendmicro.webserviceclient.generated.EnumTimeFilterType type;

    public TimeFilterTransport() {
    }

    public TimeFilterTransport(
           java.util.Calendar rangeFrom,
           java.util.Calendar rangeTo,
           java.util.Calendar specificTime,
           com.trendmicro.webserviceclient.generated.EnumTimeFilterType type) {
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
        this.specificTime = specificTime;
        this.type = type;
    }


    /**
     * Gets the rangeFrom value for this TimeFilterTransport.
     * 
     * @return rangeFrom
     */
    public java.util.Calendar getRangeFrom() {
        return rangeFrom;
    }


    /**
     * Sets the rangeFrom value for this TimeFilterTransport.
     * 
     * @param rangeFrom
     */
    public void setRangeFrom(java.util.Calendar rangeFrom) {
        this.rangeFrom = rangeFrom;
    }


    /**
     * Gets the rangeTo value for this TimeFilterTransport.
     * 
     * @return rangeTo
     */
    public java.util.Calendar getRangeTo() {
        return rangeTo;
    }


    /**
     * Sets the rangeTo value for this TimeFilterTransport.
     * 
     * @param rangeTo
     */
    public void setRangeTo(java.util.Calendar rangeTo) {
        this.rangeTo = rangeTo;
    }


    /**
     * Gets the specificTime value for this TimeFilterTransport.
     * 
     * @return specificTime
     */
    public java.util.Calendar getSpecificTime() {
        return specificTime;
    }


    /**
     * Sets the specificTime value for this TimeFilterTransport.
     * 
     * @param specificTime
     */
    public void setSpecificTime(java.util.Calendar specificTime) {
        this.specificTime = specificTime;
    }


    /**
     * Gets the type value for this TimeFilterTransport.
     * 
     * @return type
     */
    public com.trendmicro.webserviceclient.generated.EnumTimeFilterType getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeFilterTransport.
     * 
     * @param type
     */
    public void setType(com.trendmicro.webserviceclient.generated.EnumTimeFilterType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeFilterTransport)) return false;
        TimeFilterTransport other = (TimeFilterTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rangeFrom==null && other.getRangeFrom()==null) || 
             (this.rangeFrom!=null &&
              this.rangeFrom.equals(other.getRangeFrom()))) &&
            ((this.rangeTo==null && other.getRangeTo()==null) || 
             (this.rangeTo!=null &&
              this.rangeTo.equals(other.getRangeTo()))) &&
            ((this.specificTime==null && other.getSpecificTime()==null) || 
             (this.specificTime!=null &&
              this.specificTime.equals(other.getSpecificTime()))) &&
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
        int _hashCode = super.hashCode();
        if (getRangeFrom() != null) {
            _hashCode += getRangeFrom().hashCode();
        }
        if (getRangeTo() != null) {
            _hashCode += getRangeTo().hashCode();
        }
        if (getSpecificTime() != null) {
            _hashCode += getSpecificTime().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeFilterTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "TimeFilterTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "rangeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "rangeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "specificTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumTimeFilterType"));
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
