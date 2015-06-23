/**
 * EditableSettingTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EditableSettingTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.EnumEditableSettingKey settingKey;

    private com.trendmicro.webserviceclient.generated.EnumEditableSettingUnit settingUnit;

    private java.lang.String settingValue;

    public EditableSettingTransport() {
    }

    public EditableSettingTransport(
           com.trendmicro.webserviceclient.generated.EnumEditableSettingKey settingKey,
           com.trendmicro.webserviceclient.generated.EnumEditableSettingUnit settingUnit,
           java.lang.String settingValue) {
        this.settingKey = settingKey;
        this.settingUnit = settingUnit;
        this.settingValue = settingValue;
    }


    /**
     * Gets the settingKey value for this EditableSettingTransport.
     * 
     * @return settingKey
     */
    public com.trendmicro.webserviceclient.generated.EnumEditableSettingKey getSettingKey() {
        return settingKey;
    }


    /**
     * Sets the settingKey value for this EditableSettingTransport.
     * 
     * @param settingKey
     */
    public void setSettingKey(com.trendmicro.webserviceclient.generated.EnumEditableSettingKey settingKey) {
        this.settingKey = settingKey;
    }


    /**
     * Gets the settingUnit value for this EditableSettingTransport.
     * 
     * @return settingUnit
     */
    public com.trendmicro.webserviceclient.generated.EnumEditableSettingUnit getSettingUnit() {
        return settingUnit;
    }


    /**
     * Sets the settingUnit value for this EditableSettingTransport.
     * 
     * @param settingUnit
     */
    public void setSettingUnit(com.trendmicro.webserviceclient.generated.EnumEditableSettingUnit settingUnit) {
        this.settingUnit = settingUnit;
    }


    /**
     * Gets the settingValue value for this EditableSettingTransport.
     * 
     * @return settingValue
     */
    public java.lang.String getSettingValue() {
        return settingValue;
    }


    /**
     * Sets the settingValue value for this EditableSettingTransport.
     * 
     * @param settingValue
     */
    public void setSettingValue(java.lang.String settingValue) {
        this.settingValue = settingValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditableSettingTransport)) return false;
        EditableSettingTransport other = (EditableSettingTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.settingKey==null && other.getSettingKey()==null) || 
             (this.settingKey!=null &&
              this.settingKey.equals(other.getSettingKey()))) &&
            ((this.settingUnit==null && other.getSettingUnit()==null) || 
             (this.settingUnit!=null &&
              this.settingUnit.equals(other.getSettingUnit()))) &&
            ((this.settingValue==null && other.getSettingValue()==null) || 
             (this.settingValue!=null &&
              this.settingValue.equals(other.getSettingValue())));
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
        if (getSettingKey() != null) {
            _hashCode += getSettingKey().hashCode();
        }
        if (getSettingUnit() != null) {
            _hashCode += getSettingUnit().hashCode();
        }
        if (getSettingValue() != null) {
            _hashCode += getSettingValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditableSettingTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EditableSettingTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "settingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumEditableSettingKey"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "settingUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumEditableSettingUnit"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "settingValue"));
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
