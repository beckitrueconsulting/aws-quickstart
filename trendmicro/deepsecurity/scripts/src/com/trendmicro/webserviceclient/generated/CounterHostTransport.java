/**
 * CounterHostTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class CounterHostTransport  extends com.trendmicro.webserviceclient.generated.CounterTransport  implements java.io.Serializable {
    private int hostID;

    private java.lang.String icon;

    public CounterHostTransport() {
    }

    public CounterHostTransport(
           java.lang.String description,
           float percentOfTotal,
           java.lang.String percentOfTotalString,
           java.lang.String text,
           long value,
           java.lang.String valueString,
           long previousValue,
           int hostID,
           java.lang.String icon) {
        super(
            description,
            percentOfTotal,
            percentOfTotalString,
            text,
            value,
            valueString,
            previousValue);
        this.hostID = hostID;
        this.icon = icon;
    }


    /**
     * Gets the hostID value for this CounterHostTransport.
     * 
     * @return hostID
     */
    public int getHostID() {
        return hostID;
    }


    /**
     * Sets the hostID value for this CounterHostTransport.
     * 
     * @param hostID
     */
    public void setHostID(int hostID) {
        this.hostID = hostID;
    }


    /**
     * Gets the icon value for this CounterHostTransport.
     * 
     * @return icon
     */
    public java.lang.String getIcon() {
        return icon;
    }


    /**
     * Sets the icon value for this CounterHostTransport.
     * 
     * @param icon
     */
    public void setIcon(java.lang.String icon) {
        this.icon = icon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CounterHostTransport)) return false;
        CounterHostTransport other = (CounterHostTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.hostID == other.getHostID() &&
            ((this.icon==null && other.getIcon()==null) || 
             (this.icon!=null &&
              this.icon.equals(other.getIcon())));
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
        _hashCode += getHostID();
        if (getIcon() != null) {
            _hashCode += getIcon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CounterHostTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "CounterHostTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "icon"));
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
