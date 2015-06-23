/**
 * EditableSettingStoredTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EditableSettingStoredTransport  extends com.trendmicro.webserviceclient.generated.EditableSettingTransport  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.EnumEditableSettingStoredScope settingScope;

    public EditableSettingStoredTransport() {
    }

    public EditableSettingStoredTransport(
           com.trendmicro.webserviceclient.generated.EnumEditableSettingKey settingKey,
           com.trendmicro.webserviceclient.generated.EnumEditableSettingUnit settingUnit,
           java.lang.String settingValue,
           com.trendmicro.webserviceclient.generated.EnumEditableSettingStoredScope settingScope) {
        super(
            settingKey,
            settingUnit,
            settingValue);
        this.settingScope = settingScope;
    }


    /**
     * Gets the settingScope value for this EditableSettingStoredTransport.
     * 
     * @return settingScope
     */
    public com.trendmicro.webserviceclient.generated.EnumEditableSettingStoredScope getSettingScope() {
        return settingScope;
    }


    /**
     * Sets the settingScope value for this EditableSettingStoredTransport.
     * 
     * @param settingScope
     */
    public void setSettingScope(com.trendmicro.webserviceclient.generated.EnumEditableSettingStoredScope settingScope) {
        this.settingScope = settingScope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditableSettingStoredTransport)) return false;
        EditableSettingStoredTransport other = (EditableSettingStoredTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.settingScope==null && other.getSettingScope()==null) || 
             (this.settingScope!=null &&
              this.settingScope.equals(other.getSettingScope())));
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
        if (getSettingScope() != null) {
            _hashCode += getSettingScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditableSettingStoredTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EditableSettingStoredTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "settingScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumEditableSettingStoredScope"));
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
