/**
 * ApplicationTypeTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class ApplicationTypeTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private java.lang.String TBUID;

    private boolean authoritative;

    private com.trendmicro.webserviceclient.generated.EnumDirection direction;

    private boolean ignoreRecommendations;

    private com.trendmicro.webserviceclient.generated.ProtocolIcmp protocolIcmp;

    private com.trendmicro.webserviceclient.generated.ProtocolPortBased protocolPortBased;

    private com.trendmicro.webserviceclient.generated.EnumApplicationTypeProtocolType protocolType;

    public ApplicationTypeTransport() {
    }

    public ApplicationTypeTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           java.lang.String TBUID,
           boolean authoritative,
           com.trendmicro.webserviceclient.generated.EnumDirection direction,
           boolean ignoreRecommendations,
           com.trendmicro.webserviceclient.generated.ProtocolIcmp protocolIcmp,
           com.trendmicro.webserviceclient.generated.ProtocolPortBased protocolPortBased,
           com.trendmicro.webserviceclient.generated.EnumApplicationTypeProtocolType protocolType) {
        super(
            ID,
            description,
            name);
        this.TBUID = TBUID;
        this.authoritative = authoritative;
        this.direction = direction;
        this.ignoreRecommendations = ignoreRecommendations;
        this.protocolIcmp = protocolIcmp;
        this.protocolPortBased = protocolPortBased;
        this.protocolType = protocolType;
    }


    /**
     * Gets the TBUID value for this ApplicationTypeTransport.
     * 
     * @return TBUID
     */
    public java.lang.String getTBUID() {
        return TBUID;
    }


    /**
     * Sets the TBUID value for this ApplicationTypeTransport.
     * 
     * @param TBUID
     */
    public void setTBUID(java.lang.String TBUID) {
        this.TBUID = TBUID;
    }


    /**
     * Gets the authoritative value for this ApplicationTypeTransport.
     * 
     * @return authoritative
     */
    public boolean isAuthoritative() {
        return authoritative;
    }


    /**
     * Sets the authoritative value for this ApplicationTypeTransport.
     * 
     * @param authoritative
     */
    public void setAuthoritative(boolean authoritative) {
        this.authoritative = authoritative;
    }


    /**
     * Gets the direction value for this ApplicationTypeTransport.
     * 
     * @return direction
     */
    public com.trendmicro.webserviceclient.generated.EnumDirection getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this ApplicationTypeTransport.
     * 
     * @param direction
     */
    public void setDirection(com.trendmicro.webserviceclient.generated.EnumDirection direction) {
        this.direction = direction;
    }


    /**
     * Gets the ignoreRecommendations value for this ApplicationTypeTransport.
     * 
     * @return ignoreRecommendations
     */
    public boolean isIgnoreRecommendations() {
        return ignoreRecommendations;
    }


    /**
     * Sets the ignoreRecommendations value for this ApplicationTypeTransport.
     * 
     * @param ignoreRecommendations
     */
    public void setIgnoreRecommendations(boolean ignoreRecommendations) {
        this.ignoreRecommendations = ignoreRecommendations;
    }


    /**
     * Gets the protocolIcmp value for this ApplicationTypeTransport.
     * 
     * @return protocolIcmp
     */
    public com.trendmicro.webserviceclient.generated.ProtocolIcmp getProtocolIcmp() {
        return protocolIcmp;
    }


    /**
     * Sets the protocolIcmp value for this ApplicationTypeTransport.
     * 
     * @param protocolIcmp
     */
    public void setProtocolIcmp(com.trendmicro.webserviceclient.generated.ProtocolIcmp protocolIcmp) {
        this.protocolIcmp = protocolIcmp;
    }


    /**
     * Gets the protocolPortBased value for this ApplicationTypeTransport.
     * 
     * @return protocolPortBased
     */
    public com.trendmicro.webserviceclient.generated.ProtocolPortBased getProtocolPortBased() {
        return protocolPortBased;
    }


    /**
     * Sets the protocolPortBased value for this ApplicationTypeTransport.
     * 
     * @param protocolPortBased
     */
    public void setProtocolPortBased(com.trendmicro.webserviceclient.generated.ProtocolPortBased protocolPortBased) {
        this.protocolPortBased = protocolPortBased;
    }


    /**
     * Gets the protocolType value for this ApplicationTypeTransport.
     * 
     * @return protocolType
     */
    public com.trendmicro.webserviceclient.generated.EnumApplicationTypeProtocolType getProtocolType() {
        return protocolType;
    }


    /**
     * Sets the protocolType value for this ApplicationTypeTransport.
     * 
     * @param protocolType
     */
    public void setProtocolType(com.trendmicro.webserviceclient.generated.EnumApplicationTypeProtocolType protocolType) {
        this.protocolType = protocolType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationTypeTransport)) return false;
        ApplicationTypeTransport other = (ApplicationTypeTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.TBUID==null && other.getTBUID()==null) || 
             (this.TBUID!=null &&
              this.TBUID.equals(other.getTBUID()))) &&
            this.authoritative == other.isAuthoritative() &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            this.ignoreRecommendations == other.isIgnoreRecommendations() &&
            ((this.protocolIcmp==null && other.getProtocolIcmp()==null) || 
             (this.protocolIcmp!=null &&
              this.protocolIcmp.equals(other.getProtocolIcmp()))) &&
            ((this.protocolPortBased==null && other.getProtocolPortBased()==null) || 
             (this.protocolPortBased!=null &&
              this.protocolPortBased.equals(other.getProtocolPortBased()))) &&
            ((this.protocolType==null && other.getProtocolType()==null) || 
             (this.protocolType!=null &&
              this.protocolType.equals(other.getProtocolType())));
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
        if (getTBUID() != null) {
            _hashCode += getTBUID().hashCode();
        }
        _hashCode += (isAuthoritative() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        _hashCode += (isIgnoreRecommendations() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProtocolIcmp() != null) {
            _hashCode += getProtocolIcmp().hashCode();
        }
        if (getProtocolPortBased() != null) {
            _hashCode += getProtocolPortBased().hashCode();
        }
        if (getProtocolType() != null) {
            _hashCode += getProtocolType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationTypeTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ApplicationTypeTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TBUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "TBUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoritative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "authoritative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDirection"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreRecommendations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ignoreRecommendations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolIcmp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protocolIcmp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ProtocolIcmp"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolPortBased");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protocolPortBased"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ProtocolPortBased"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protocolType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumApplicationTypeProtocolType"));
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
