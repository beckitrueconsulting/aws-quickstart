/**
 * SoftwareTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class SoftwareTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.String fingerprint;

    private java.util.Calendar imported;

    private java.lang.String name;

    private java.lang.String notes;

    private java.lang.String platform;

    private java.util.Calendar released;

    private java.lang.String version;

    public SoftwareTransport() {
    }

    public SoftwareTransport(
           java.lang.Integer ID,
           java.lang.String fingerprint,
           java.util.Calendar imported,
           java.lang.String name,
           java.lang.String notes,
           java.lang.String platform,
           java.util.Calendar released,
           java.lang.String version) {
        this.ID = ID;
        this.fingerprint = fingerprint;
        this.imported = imported;
        this.name = name;
        this.notes = notes;
        this.platform = platform;
        this.released = released;
        this.version = version;
    }


    /**
     * Gets the ID value for this SoftwareTransport.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this SoftwareTransport.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the fingerprint value for this SoftwareTransport.
     * 
     * @return fingerprint
     */
    public java.lang.String getFingerprint() {
        return fingerprint;
    }


    /**
     * Sets the fingerprint value for this SoftwareTransport.
     * 
     * @param fingerprint
     */
    public void setFingerprint(java.lang.String fingerprint) {
        this.fingerprint = fingerprint;
    }


    /**
     * Gets the imported value for this SoftwareTransport.
     * 
     * @return imported
     */
    public java.util.Calendar getImported() {
        return imported;
    }


    /**
     * Sets the imported value for this SoftwareTransport.
     * 
     * @param imported
     */
    public void setImported(java.util.Calendar imported) {
        this.imported = imported;
    }


    /**
     * Gets the name value for this SoftwareTransport.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SoftwareTransport.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this SoftwareTransport.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this SoftwareTransport.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the platform value for this SoftwareTransport.
     * 
     * @return platform
     */
    public java.lang.String getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this SoftwareTransport.
     * 
     * @param platform
     */
    public void setPlatform(java.lang.String platform) {
        this.platform = platform;
    }


    /**
     * Gets the released value for this SoftwareTransport.
     * 
     * @return released
     */
    public java.util.Calendar getReleased() {
        return released;
    }


    /**
     * Sets the released value for this SoftwareTransport.
     * 
     * @param released
     */
    public void setReleased(java.util.Calendar released) {
        this.released = released;
    }


    /**
     * Gets the version value for this SoftwareTransport.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SoftwareTransport.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoftwareTransport)) return false;
        SoftwareTransport other = (SoftwareTransport) obj;
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
            ((this.fingerprint==null && other.getFingerprint()==null) || 
             (this.fingerprint!=null &&
              this.fingerprint.equals(other.getFingerprint()))) &&
            ((this.imported==null && other.getImported()==null) || 
             (this.imported!=null &&
              this.imported.equals(other.getImported()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.platform==null && other.getPlatform()==null) || 
             (this.platform!=null &&
              this.platform.equals(other.getPlatform()))) &&
            ((this.released==null && other.getReleased()==null) || 
             (this.released!=null &&
              this.released.equals(other.getReleased()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getFingerprint() != null) {
            _hashCode += getFingerprint().hashCode();
        }
        if (getImported() != null) {
            _hashCode += getImported().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getPlatform() != null) {
            _hashCode += getPlatform().hashCode();
        }
        if (getReleased() != null) {
            _hashCode += getReleased().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoftwareTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "SoftwareTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fingerprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "fingerprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "imported"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("released");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "released"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "version"));
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
