/**
 * LogInspectionEventListTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class LogInspectionEventListTransport  extends com.trendmicro.webserviceclient.generated.TruncatableListTransport  implements java.io.Serializable {
    private com.trendmicro.webserviceclient.generated.LogInspectionEventTransport[] logInspectionEvents;

    public LogInspectionEventListTransport() {
    }

    public LogInspectionEventListTransport(
           boolean truncated,
           com.trendmicro.webserviceclient.generated.LogInspectionEventTransport[] logInspectionEvents) {
        super(
            truncated);
        this.logInspectionEvents = logInspectionEvents;
    }


    /**
     * Gets the logInspectionEvents value for this LogInspectionEventListTransport.
     * 
     * @return logInspectionEvents
     */
    public com.trendmicro.webserviceclient.generated.LogInspectionEventTransport[] getLogInspectionEvents() {
        return logInspectionEvents;
    }


    /**
     * Sets the logInspectionEvents value for this LogInspectionEventListTransport.
     * 
     * @param logInspectionEvents
     */
    public void setLogInspectionEvents(com.trendmicro.webserviceclient.generated.LogInspectionEventTransport[] logInspectionEvents) {
        this.logInspectionEvents = logInspectionEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogInspectionEventListTransport)) return false;
        LogInspectionEventListTransport other = (LogInspectionEventListTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.logInspectionEvents==null && other.getLogInspectionEvents()==null) || 
             (this.logInspectionEvents!=null &&
              java.util.Arrays.equals(this.logInspectionEvents, other.getLogInspectionEvents())));
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
        if (getLogInspectionEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogInspectionEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogInspectionEvents(), i);
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
        new org.apache.axis.description.TypeDesc(LogInspectionEventListTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "LogInspectionEventListTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logInspectionEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logInspectionEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "LogInspectionEventTransport"));
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
