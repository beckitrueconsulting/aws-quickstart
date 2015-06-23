/**
 * CounterWithIDTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class CounterWithIDTransport  extends com.trendmicro.webserviceclient.generated.CounterTransport  implements java.io.Serializable {
    private int itemID;

    public CounterWithIDTransport() {
    }

    public CounterWithIDTransport(
           java.lang.String description,
           float percentOfTotal,
           java.lang.String percentOfTotalString,
           java.lang.String text,
           long value,
           java.lang.String valueString,
           long previousValue,
           int itemID) {
        super(
            description,
            percentOfTotal,
            percentOfTotalString,
            text,
            value,
            valueString,
            previousValue);
        this.itemID = itemID;
    }


    /**
     * Gets the itemID value for this CounterWithIDTransport.
     * 
     * @return itemID
     */
    public int getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this CounterWithIDTransport.
     * 
     * @param itemID
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CounterWithIDTransport)) return false;
        CounterWithIDTransport other = (CounterWithIDTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.itemID == other.getItemID();
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
        _hashCode += getItemID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CounterWithIDTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "CounterWithIDTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "itemID"));
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
