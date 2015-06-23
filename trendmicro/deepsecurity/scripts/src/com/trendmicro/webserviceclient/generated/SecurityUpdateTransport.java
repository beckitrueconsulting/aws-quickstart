/**
 * SecurityUpdateTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class SecurityUpdateTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.Integer ID;

    private com.trendmicro.webserviceclient.generated.EnumSecurityUpdateAppliedState appliedState;

    private java.lang.String contentSummary;

    private boolean detectOnly;

    private java.util.Calendar downloaded;

    private java.lang.String name;

    private java.util.Calendar released;

    public SecurityUpdateTransport() {
    }

    public SecurityUpdateTransport(
           java.lang.Integer ID,
           com.trendmicro.webserviceclient.generated.EnumSecurityUpdateAppliedState appliedState,
           java.lang.String contentSummary,
           boolean detectOnly,
           java.util.Calendar downloaded,
           java.lang.String name,
           java.util.Calendar released) {
        this.ID = ID;
        this.appliedState = appliedState;
        this.contentSummary = contentSummary;
        this.detectOnly = detectOnly;
        this.downloaded = downloaded;
        this.name = name;
        this.released = released;
    }


    /**
     * Gets the ID value for this SecurityUpdateTransport.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this SecurityUpdateTransport.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the appliedState value for this SecurityUpdateTransport.
     * 
     * @return appliedState
     */
    public com.trendmicro.webserviceclient.generated.EnumSecurityUpdateAppliedState getAppliedState() {
        return appliedState;
    }


    /**
     * Sets the appliedState value for this SecurityUpdateTransport.
     * 
     * @param appliedState
     */
    public void setAppliedState(com.trendmicro.webserviceclient.generated.EnumSecurityUpdateAppliedState appliedState) {
        this.appliedState = appliedState;
    }


    /**
     * Gets the contentSummary value for this SecurityUpdateTransport.
     * 
     * @return contentSummary
     */
    public java.lang.String getContentSummary() {
        return contentSummary;
    }


    /**
     * Sets the contentSummary value for this SecurityUpdateTransport.
     * 
     * @param contentSummary
     */
    public void setContentSummary(java.lang.String contentSummary) {
        this.contentSummary = contentSummary;
    }


    /**
     * Gets the detectOnly value for this SecurityUpdateTransport.
     * 
     * @return detectOnly
     */
    public boolean isDetectOnly() {
        return detectOnly;
    }


    /**
     * Sets the detectOnly value for this SecurityUpdateTransport.
     * 
     * @param detectOnly
     */
    public void setDetectOnly(boolean detectOnly) {
        this.detectOnly = detectOnly;
    }


    /**
     * Gets the downloaded value for this SecurityUpdateTransport.
     * 
     * @return downloaded
     */
    public java.util.Calendar getDownloaded() {
        return downloaded;
    }


    /**
     * Sets the downloaded value for this SecurityUpdateTransport.
     * 
     * @param downloaded
     */
    public void setDownloaded(java.util.Calendar downloaded) {
        this.downloaded = downloaded;
    }


    /**
     * Gets the name value for this SecurityUpdateTransport.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SecurityUpdateTransport.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the released value for this SecurityUpdateTransport.
     * 
     * @return released
     */
    public java.util.Calendar getReleased() {
        return released;
    }


    /**
     * Sets the released value for this SecurityUpdateTransport.
     * 
     * @param released
     */
    public void setReleased(java.util.Calendar released) {
        this.released = released;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityUpdateTransport)) return false;
        SecurityUpdateTransport other = (SecurityUpdateTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.appliedState==null && other.getAppliedState()==null) || 
             (this.appliedState!=null &&
              this.appliedState.equals(other.getAppliedState()))) &&
            ((this.contentSummary==null && other.getContentSummary()==null) || 
             (this.contentSummary!=null &&
              this.contentSummary.equals(other.getContentSummary()))) &&
            this.detectOnly == other.isDetectOnly() &&
            ((this.downloaded==null && other.getDownloaded()==null) || 
             (this.downloaded!=null &&
              this.downloaded.equals(other.getDownloaded()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.released==null && other.getReleased()==null) || 
             (this.released!=null &&
              this.released.equals(other.getReleased())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getAppliedState() != null) {
            _hashCode += getAppliedState().hashCode();
        }
        if (getContentSummary() != null) {
            _hashCode += getContentSummary().hashCode();
        }
        _hashCode += (isDetectOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDownloaded() != null) {
            _hashCode += getDownloaded().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getReleased() != null) {
            _hashCode += getReleased().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityUpdateTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "SecurityUpdateTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "appliedState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumSecurityUpdateAppliedState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "contentSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detectOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "detectOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloaded");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "downloaded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("released");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "released"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
