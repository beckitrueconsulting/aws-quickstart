/**
 * FirewallEventListTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class FirewallEventListTransport  extends com.trendmicro.webserviceclient.generated.TruncatableListTransport  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.FirewallEventTransport[] firewallEvents;

    public FirewallEventListTransport() {
    }

    public FirewallEventListTransport(
           boolean truncated,
           com.trendmicro.webserviceclient.generated.FirewallEventTransport[] firewallEvents) {
        super(
            truncated);
        this.firewallEvents = firewallEvents;
    }


    /**
     * Gets the firewallEvents value for this FirewallEventListTransport.
     * 
     * @return firewallEvents
     */
    public com.trendmicro.webserviceclient.generated.FirewallEventTransport[] getFirewallEvents() {
        return firewallEvents;
    }


    /**
     * Sets the firewallEvents value for this FirewallEventListTransport.
     * 
     * @param firewallEvents
     */
    public void setFirewallEvents(com.trendmicro.webserviceclient.generated.FirewallEventTransport[] firewallEvents) {
        this.firewallEvents = firewallEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirewallEventListTransport)) return false;
        FirewallEventListTransport other = (FirewallEventListTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.firewallEvents==null && other.getFirewallEvents()==null) || 
             (this.firewallEvents!=null &&
              java.util.Arrays.equals(this.firewallEvents, other.getFirewallEvents())));
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
        if (getFirewallEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirewallEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirewallEvents(), i);
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
        new org.apache.axis.description.TypeDesc(FirewallEventListTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "FirewallEventListTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "firewallEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "FirewallEventTransport"));
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
