/**
 * LogInspectionRuleTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class LogInspectionRuleTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private java.lang.String TBUID;

    private int alertMinSeverity;

    private boolean authoritative;

    private java.lang.String content;

    private java.lang.String files;

    private java.lang.String identifier;

    private boolean ignoreRecommendations;

    private java.util.Calendar issued;

    private java.lang.String minAgentVersion;

    private java.lang.String minManagerVersion;

    private boolean raiseAlert;

    public LogInspectionRuleTransport() {
    }

    public LogInspectionRuleTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           java.lang.String TBUID,
           int alertMinSeverity,
           boolean authoritative,
           java.lang.String content,
           java.lang.String files,
           java.lang.String identifier,
           boolean ignoreRecommendations,
           java.util.Calendar issued,
           java.lang.String minAgentVersion,
           java.lang.String minManagerVersion,
           boolean raiseAlert) {
        super(
            ID,
            description,
            name);
        this.TBUID = TBUID;
        this.alertMinSeverity = alertMinSeverity;
        this.authoritative = authoritative;
        this.content = content;
        this.files = files;
        this.identifier = identifier;
        this.ignoreRecommendations = ignoreRecommendations;
        this.issued = issued;
        this.minAgentVersion = minAgentVersion;
        this.minManagerVersion = minManagerVersion;
        this.raiseAlert = raiseAlert;
    }


    /**
     * Gets the TBUID value for this LogInspectionRuleTransport.
     * 
     * @return TBUID
     */
    public java.lang.String getTBUID() {
        return TBUID;
    }


    /**
     * Sets the TBUID value for this LogInspectionRuleTransport.
     * 
     * @param TBUID
     */
    public void setTBUID(java.lang.String TBUID) {
        this.TBUID = TBUID;
    }


    /**
     * Gets the alertMinSeverity value for this LogInspectionRuleTransport.
     * 
     * @return alertMinSeverity
     */
    public int getAlertMinSeverity() {
        return alertMinSeverity;
    }


    /**
     * Sets the alertMinSeverity value for this LogInspectionRuleTransport.
     * 
     * @param alertMinSeverity
     */
    public void setAlertMinSeverity(int alertMinSeverity) {
        this.alertMinSeverity = alertMinSeverity;
    }


    /**
     * Gets the authoritative value for this LogInspectionRuleTransport.
     * 
     * @return authoritative
     */
    public boolean isAuthoritative() {
        return authoritative;
    }


    /**
     * Sets the authoritative value for this LogInspectionRuleTransport.
     * 
     * @param authoritative
     */
    public void setAuthoritative(boolean authoritative) {
        this.authoritative = authoritative;
    }


    /**
     * Gets the content value for this LogInspectionRuleTransport.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this LogInspectionRuleTransport.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the files value for this LogInspectionRuleTransport.
     * 
     * @return files
     */
    public java.lang.String getFiles() {
        return files;
    }


    /**
     * Sets the files value for this LogInspectionRuleTransport.
     * 
     * @param files
     */
    public void setFiles(java.lang.String files) {
        this.files = files;
    }


    /**
     * Gets the identifier value for this LogInspectionRuleTransport.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this LogInspectionRuleTransport.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the ignoreRecommendations value for this LogInspectionRuleTransport.
     * 
     * @return ignoreRecommendations
     */
    public boolean isIgnoreRecommendations() {
        return ignoreRecommendations;
    }


    /**
     * Sets the ignoreRecommendations value for this LogInspectionRuleTransport.
     * 
     * @param ignoreRecommendations
     */
    public void setIgnoreRecommendations(boolean ignoreRecommendations) {
        this.ignoreRecommendations = ignoreRecommendations;
    }


    /**
     * Gets the issued value for this LogInspectionRuleTransport.
     * 
     * @return issued
     */
    public java.util.Calendar getIssued() {
        return issued;
    }


    /**
     * Sets the issued value for this LogInspectionRuleTransport.
     * 
     * @param issued
     */
    public void setIssued(java.util.Calendar issued) {
        this.issued = issued;
    }


    /**
     * Gets the minAgentVersion value for this LogInspectionRuleTransport.
     * 
     * @return minAgentVersion
     */
    public java.lang.String getMinAgentVersion() {
        return minAgentVersion;
    }


    /**
     * Sets the minAgentVersion value for this LogInspectionRuleTransport.
     * 
     * @param minAgentVersion
     */
    public void setMinAgentVersion(java.lang.String minAgentVersion) {
        this.minAgentVersion = minAgentVersion;
    }


    /**
     * Gets the minManagerVersion value for this LogInspectionRuleTransport.
     * 
     * @return minManagerVersion
     */
    public java.lang.String getMinManagerVersion() {
        return minManagerVersion;
    }


    /**
     * Sets the minManagerVersion value for this LogInspectionRuleTransport.
     * 
     * @param minManagerVersion
     */
    public void setMinManagerVersion(java.lang.String minManagerVersion) {
        this.minManagerVersion = minManagerVersion;
    }


    /**
     * Gets the raiseAlert value for this LogInspectionRuleTransport.
     * 
     * @return raiseAlert
     */
    public boolean isRaiseAlert() {
        return raiseAlert;
    }


    /**
     * Sets the raiseAlert value for this LogInspectionRuleTransport.
     * 
     * @param raiseAlert
     */
    public void setRaiseAlert(boolean raiseAlert) {
        this.raiseAlert = raiseAlert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogInspectionRuleTransport)) return false;
        LogInspectionRuleTransport other = (LogInspectionRuleTransport) obj;
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
            this.alertMinSeverity == other.getAlertMinSeverity() &&
            this.authoritative == other.isAuthoritative() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              this.files.equals(other.getFiles()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            this.ignoreRecommendations == other.isIgnoreRecommendations() &&
            ((this.issued==null && other.getIssued()==null) || 
             (this.issued!=null &&
              this.issued.equals(other.getIssued()))) &&
            ((this.minAgentVersion==null && other.getMinAgentVersion()==null) || 
             (this.minAgentVersion!=null &&
              this.minAgentVersion.equals(other.getMinAgentVersion()))) &&
            ((this.minManagerVersion==null && other.getMinManagerVersion()==null) || 
             (this.minManagerVersion!=null &&
              this.minManagerVersion.equals(other.getMinManagerVersion()))) &&
            this.raiseAlert == other.isRaiseAlert();
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
        _hashCode += getAlertMinSeverity();
        _hashCode += (isAuthoritative() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getFiles() != null) {
            _hashCode += getFiles().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        _hashCode += (isIgnoreRecommendations() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIssued() != null) {
            _hashCode += getIssued().hashCode();
        }
        if (getMinAgentVersion() != null) {
            _hashCode += getMinAgentVersion().hashCode();
        }
        if (getMinManagerVersion() != null) {
            _hashCode += getMinManagerVersion().hashCode();
        }
        _hashCode += (isRaiseAlert() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogInspectionRuleTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "LogInspectionRuleTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TBUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "TBUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertMinSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "alertMinSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "files"));
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
        elemField.setFieldName("ignoreRecommendations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ignoreRecommendations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raiseAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "raiseAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
