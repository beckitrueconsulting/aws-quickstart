/**
 * DPIEventListTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class DPIEventListTransport  extends com.trendmicro.webserviceclient.generated.TruncatableListTransport  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.DPIEventTransport[] DPIEvents;

    public DPIEventListTransport() {
    }

    public DPIEventListTransport(
           boolean truncated,
           com.trendmicro.webserviceclient.generated.DPIEventTransport[] DPIEvents) {
        super(
            truncated);
        this.DPIEvents = DPIEvents;
    }


    /**
     * Gets the DPIEvents value for this DPIEventListTransport.
     * 
     * @return DPIEvents
     */
    public com.trendmicro.webserviceclient.generated.DPIEventTransport[] getDPIEvents() {
        return DPIEvents;
    }


    /**
     * Sets the DPIEvents value for this DPIEventListTransport.
     * 
     * @param DPIEvents
     */
    public void setDPIEvents(com.trendmicro.webserviceclient.generated.DPIEventTransport[] DPIEvents) {
        this.DPIEvents = DPIEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DPIEventListTransport)) return false;
        DPIEventListTransport other = (DPIEventListTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.DPIEvents==null && other.getDPIEvents()==null) || 
             (this.DPIEvents!=null &&
              java.util.Arrays.equals(this.DPIEvents, other.getDPIEvents())));
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
        if (getDPIEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDPIEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDPIEvents(), i);
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
        new org.apache.axis.description.TypeDesc(DPIEventListTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "DPIEventListTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPIEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "DPIEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "DPIEventTransport"));
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
