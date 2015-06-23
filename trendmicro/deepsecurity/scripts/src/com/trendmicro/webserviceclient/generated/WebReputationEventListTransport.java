/**
 * WebReputationEventListTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class WebReputationEventListTransport  extends com.trendmicro.webserviceclient.generated.TruncatableListTransport  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.WebReputationEventTransport[] webReputationEvents;

    public WebReputationEventListTransport() {
    }

    public WebReputationEventListTransport(
           boolean truncated,
           com.trendmicro.webserviceclient.generated.WebReputationEventTransport[] webReputationEvents) {
        super(
            truncated);
        this.webReputationEvents = webReputationEvents;
    }


    /**
     * Gets the webReputationEvents value for this WebReputationEventListTransport.
     * 
     * @return webReputationEvents
     */
    public com.trendmicro.webserviceclient.generated.WebReputationEventTransport[] getWebReputationEvents() {
        return webReputationEvents;
    }


    /**
     * Sets the webReputationEvents value for this WebReputationEventListTransport.
     * 
     * @param webReputationEvents
     */
    public void setWebReputationEvents(com.trendmicro.webserviceclient.generated.WebReputationEventTransport[] webReputationEvents) {
        this.webReputationEvents = webReputationEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebReputationEventListTransport)) return false;
        WebReputationEventListTransport other = (WebReputationEventListTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.webReputationEvents==null && other.getWebReputationEvents()==null) || 
             (this.webReputationEvents!=null &&
              java.util.Arrays.equals(this.webReputationEvents, other.getWebReputationEvents())));
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
        if (getWebReputationEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebReputationEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebReputationEvents(), i);
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
        new org.apache.axis.description.TypeDesc(WebReputationEventListTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "WebReputationEventListTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webReputationEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "webReputationEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "WebReputationEventTransport"));
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
