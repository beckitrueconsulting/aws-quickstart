/**
 * HostStatusSummaryTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class HostStatusSummaryTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private int criticalHosts;

    private int lockedHosts;

    private int onlineHosts;

    private int unmanageHosts;

    private int warningHosts;

    public HostStatusSummaryTransport() {
    }

    public HostStatusSummaryTransport(
           int criticalHosts,
           int lockedHosts,
           int onlineHosts,
           int unmanageHosts,
           int warningHosts) {
        this.criticalHosts = criticalHosts;
        this.lockedHosts = lockedHosts;
        this.onlineHosts = onlineHosts;
        this.unmanageHosts = unmanageHosts;
        this.warningHosts = warningHosts;
    }


    /**
     * Gets the criticalHosts value for this HostStatusSummaryTransport.
     * 
     * @return criticalHosts
     */
    public int getCriticalHosts() {
        return criticalHosts;
    }


    /**
     * Sets the criticalHosts value for this HostStatusSummaryTransport.
     * 
     * @param criticalHosts
     */
    public void setCriticalHosts(int criticalHosts) {
        this.criticalHosts = criticalHosts;
    }


    /**
     * Gets the lockedHosts value for this HostStatusSummaryTransport.
     * 
     * @return lockedHosts
     */
    public int getLockedHosts() {
        return lockedHosts;
    }


    /**
     * Sets the lockedHosts value for this HostStatusSummaryTransport.
     * 
     * @param lockedHosts
     */
    public void setLockedHosts(int lockedHosts) {
        this.lockedHosts = lockedHosts;
    }


    /**
     * Gets the onlineHosts value for this HostStatusSummaryTransport.
     * 
     * @return onlineHosts
     */
    public int getOnlineHosts() {
        return onlineHosts;
    }


    /**
     * Sets the onlineHosts value for this HostStatusSummaryTransport.
     * 
     * @param onlineHosts
     */
    public void setOnlineHosts(int onlineHosts) {
        this.onlineHosts = onlineHosts;
    }


    /**
     * Gets the unmanageHosts value for this HostStatusSummaryTransport.
     * 
     * @return unmanageHosts
     */
    public int getUnmanageHosts() {
        return unmanageHosts;
    }


    /**
     * Sets the unmanageHosts value for this HostStatusSummaryTransport.
     * 
     * @param unmanageHosts
     */
    public void setUnmanageHosts(int unmanageHosts) {
        this.unmanageHosts = unmanageHosts;
    }


    /**
     * Gets the warningHosts value for this HostStatusSummaryTransport.
     * 
     * @return warningHosts
     */
    public int getWarningHosts() {
        return warningHosts;
    }


    /**
     * Sets the warningHosts value for this HostStatusSummaryTransport.
     * 
     * @param warningHosts
     */
    public void setWarningHosts(int warningHosts) {
        this.warningHosts = warningHosts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostStatusSummaryTransport)) return false;
        HostStatusSummaryTransport other = (HostStatusSummaryTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.criticalHosts == other.getCriticalHosts() &&
            this.lockedHosts == other.getLockedHosts() &&
            this.onlineHosts == other.getOnlineHosts() &&
            this.unmanageHosts == other.getUnmanageHosts() &&
            this.warningHosts == other.getWarningHosts();
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
        _hashCode += getCriticalHosts();
        _hashCode += getLockedHosts();
        _hashCode += getOnlineHosts();
        _hashCode += getUnmanageHosts();
        _hashCode += getWarningHosts();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostStatusSummaryTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostStatusSummaryTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criticalHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "criticalHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lockedHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "onlineHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unmanageHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "unmanageHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "warningHosts"));
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
