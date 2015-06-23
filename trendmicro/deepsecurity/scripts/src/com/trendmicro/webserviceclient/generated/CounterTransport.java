/**
 * CounterTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class CounterTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.String description;

    private float percentOfTotal;

    private java.lang.String percentOfTotalString;

    private java.lang.String text;

    private long value;

    private java.lang.String valueString;

    private long previousValue;

    public CounterTransport() {
    }

    public CounterTransport(
           java.lang.String description,
           float percentOfTotal,
           java.lang.String percentOfTotalString,
           java.lang.String text,
           long value,
           java.lang.String valueString,
           long previousValue) {
        this.description = description;
        this.percentOfTotal = percentOfTotal;
        this.percentOfTotalString = percentOfTotalString;
        this.text = text;
        this.value = value;
        this.valueString = valueString;
        this.previousValue = previousValue;
    }


    /**
     * Gets the description value for this CounterTransport.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CounterTransport.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the percentOfTotal value for this CounterTransport.
     * 
     * @return percentOfTotal
     */
    public float getPercentOfTotal() {
        return percentOfTotal;
    }


    /**
     * Sets the percentOfTotal value for this CounterTransport.
     * 
     * @param percentOfTotal
     */
    public void setPercentOfTotal(float percentOfTotal) {
        this.percentOfTotal = percentOfTotal;
    }


    /**
     * Gets the percentOfTotalString value for this CounterTransport.
     * 
     * @return percentOfTotalString
     */
    public java.lang.String getPercentOfTotalString() {
        return percentOfTotalString;
    }


    /**
     * Sets the percentOfTotalString value for this CounterTransport.
     * 
     * @param percentOfTotalString
     */
    public void setPercentOfTotalString(java.lang.String percentOfTotalString) {
        this.percentOfTotalString = percentOfTotalString;
    }


    /**
     * Gets the text value for this CounterTransport.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this CounterTransport.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the value value for this CounterTransport.
     * 
     * @return value
     */
    public long getValue() {
        return value;
    }


    /**
     * Sets the value value for this CounterTransport.
     * 
     * @param value
     */
    public void setValue(long value) {
        this.value = value;
    }


    /**
     * Gets the valueString value for this CounterTransport.
     * 
     * @return valueString
     */
    public java.lang.String getValueString() {
        return valueString;
    }


    /**
     * Sets the valueString value for this CounterTransport.
     * 
     * @param valueString
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }


    /**
     * Gets the previousValue value for this CounterTransport.
     * 
     * @return previousValue
     */
    public long getPreviousValue() {
        return previousValue;
    }


    /**
     * Sets the previousValue value for this CounterTransport.
     * 
     * @param previousValue
     */
    public void setPreviousValue(long previousValue) {
        this.previousValue = previousValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CounterTransport)) return false;
        CounterTransport other = (CounterTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.percentOfTotal == other.getPercentOfTotal() &&
            ((this.percentOfTotalString==null && other.getPercentOfTotalString()==null) || 
             (this.percentOfTotalString!=null &&
              this.percentOfTotalString.equals(other.getPercentOfTotalString()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            this.value == other.getValue() &&
            ((this.valueString==null && other.getValueString()==null) || 
             (this.valueString!=null &&
              this.valueString.equals(other.getValueString()))) &&
            this.previousValue == other.getPreviousValue();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Float(getPercentOfTotal()).hashCode();
        if (getPercentOfTotalString() != null) {
            _hashCode += getPercentOfTotalString().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        _hashCode += new Long(getValue()).hashCode();
        if (getValueString() != null) {
            _hashCode += getValueString().hashCode();
        }
        _hashCode += new Long(getPreviousValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CounterTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "CounterTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOfTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "percentOfTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOfTotalString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "percentOfTotalString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "valueString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "previousValue"));
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
