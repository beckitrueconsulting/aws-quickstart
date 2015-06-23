/**
 * LogInspectionDecoderTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class LogInspectionDecoderTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private java.lang.String TBUID;

    private boolean authoritative;

    private java.lang.String content;

    private java.lang.String identifier;

    private java.util.Calendar issued;

    private java.lang.String minAgentVersion;

    private java.lang.String minManagerVersion;

    public LogInspectionDecoderTransport() {
    }

    public LogInspectionDecoderTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           java.lang.String TBUID,
           boolean authoritative,
           java.lang.String content,
           java.lang.String identifier,
           java.util.Calendar issued,
           java.lang.String minAgentVersion,
           java.lang.String minManagerVersion) {
        super(
            ID,
            description,
            name);
        this.TBUID = TBUID;
        this.authoritative = authoritative;
        this.content = content;
        this.identifier = identifier;
        this.issued = issued;
        this.minAgentVersion = minAgentVersion;
        this.minManagerVersion = minManagerVersion;
    }


    /**
     * Gets the TBUID value for this LogInspectionDecoderTransport.
     * 
     * @return TBUID
     */
    public java.lang.String getTBUID() {
        return TBUID;
    }


    /**
     * Sets the TBUID value for this LogInspectionDecoderTransport.
     * 
     * @param TBUID
     */
    public void setTBUID(java.lang.String TBUID) {
        this.TBUID = TBUID;
    }


    /**
     * Gets the authoritative value for this LogInspectionDecoderTransport.
     * 
     * @return authoritative
     */
    public boolean isAuthoritative() {
        return authoritative;
    }


    /**
     * Sets the authoritative value for this LogInspectionDecoderTransport.
     * 
     * @param authoritative
     */
    public void setAuthoritative(boolean authoritative) {
        this.authoritative = authoritative;
    }


    /**
     * Gets the content value for this LogInspectionDecoderTransport.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this LogInspectionDecoderTransport.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the identifier value for this LogInspectionDecoderTransport.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this LogInspectionDecoderTransport.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the issued value for this LogInspectionDecoderTransport.
     * 
     * @return issued
     */
    public java.util.Calendar getIssued() {
        return issued;
    }


    /**
     * Sets the issued value for this LogInspectionDecoderTransport.
     * 
     * @param issued
     */
    public void setIssued(java.util.Calendar issued) {
        this.issued = issued;
    }


    /**
     * Gets the minAgentVersion value for this LogInspectionDecoderTransport.
     * 
     * @return minAgentVersion
     */
    public java.lang.String getMinAgentVersion() {
        return minAgentVersion;
    }


    /**
     * Sets the minAgentVersion value for this LogInspectionDecoderTransport.
     * 
     * @param minAgentVersion
     */
    public void setMinAgentVersion(java.lang.String minAgentVersion) {
        this.minAgentVersion = minAgentVersion;
    }


    /**
     * Gets the minManagerVersion value for this LogInspectionDecoderTransport.
     * 
     * @return minManagerVersion
     */
    public java.lang.String getMinManagerVersion() {
        return minManagerVersion;
    }


    /**
     * Sets the minManagerVersion value for this LogInspectionDecoderTransport.
     * 
     * @param minManagerVersion
     */
    public void setMinManagerVersion(java.lang.String minManagerVersion) {
        this.minManagerVersion = minManagerVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogInspectionDecoderTransport)) return false;
        LogInspectionDecoderTransport other = (LogInspectionDecoderTransport) obj;
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
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.issued==null && other.getIssued()==null) || 
             (this.issued!=null &&
              this.issued.equals(other.getIssued()))) &&
            ((this.minAgentVersion==null && other.getMinAgentVersion()==null) || 
             (this.minAgentVersion!=null &&
              this.minAgentVersion.equals(other.getMinAgentVersion()))) &&
            ((this.minManagerVersion==null && other.getMinManagerVersion()==null) || 
             (this.minManagerVersion!=null &&
              this.minManagerVersion.equals(other.getMinManagerVersion())));
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
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getIssued() != null) {
            _hashCode += getIssued().hashCode();
        }
        if (getMinAgentVersion() != null) {
            _hashCode += getMinAgentVersion().hashCode();
        }
        if (getMinManagerVersion() != null) {
            _hashCode += getMinManagerVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogInspectionDecoderTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "LogInspectionDecoderTransport"));
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
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "issued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAgentVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "minAgentVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minManagerVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "minManagerVersion"));
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
