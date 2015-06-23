/**
 * SystemEventListTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class SystemEventListTransport  extends com.trendmicro.webserviceclient.generated.TruncatableListTransport  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.SystemEventTransport[] systemEvents;

    public SystemEventListTransport() {
    }

    public SystemEventListTransport(
           boolean truncated,
           com.trendmicro.webserviceclient.generated.SystemEventTransport[] systemEvents) {
        super(
            truncated);
        this.systemEvents = systemEvents;
    }


    /**
     * Gets the systemEvents value for this SystemEventListTransport.
     * 
     * @return systemEvents
     */
    public com.trendmicro.webserviceclient.generated.SystemEventTransport[] getSystemEvents() {
        return systemEvents;
    }


    /**
     * Sets the systemEvents value for this SystemEventListTransport.
     * 
     * @param systemEvents
     */
    public void setSystemEvents(com.trendmicro.webserviceclient.generated.SystemEventTransport[] systemEvents) {
        this.systemEvents = systemEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemEventListTransport)) return false;
        SystemEventListTransport other = (SystemEventListTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.systemEvents==null && other.getSystemEvents()==null) || 
             (this.systemEvents!=null &&
              java.util.Arrays.equals(this.systemEvents, other.getSystemEvents())));
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
        if (getSystemEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSystemEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSystemEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemEventListTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "SystemEventListTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "systemEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "SystemEventTransport"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
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
