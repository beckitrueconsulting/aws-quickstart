/**
 * ComponentInfoTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class ComponentInfoTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private int type;

    private int id;

    private java.lang.String name;

    private java.lang.String shortName;

    private java.lang.String currentVersion;

    private java.util.Calendar lastUpdate;

    private java.lang.String nameKey;

    private int deployed;

    private int needDeployed;

    public ComponentInfoTransport() {
    }

    public ComponentInfoTransport(
           int type,
           int id,
           java.lang.String name,
           java.lang.String shortName,
           java.lang.String currentVersion,
           java.util.Calendar lastUpdate,
           java.lang.String nameKey,
           int deployed,
           int needDeployed) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.currentVersion = currentVersion;
        this.lastUpdate = lastUpdate;
        this.nameKey = nameKey;
        this.deployed = deployed;
        this.needDeployed = needDeployed;
    }


    /**
     * Gets the type value for this ComponentInfoTransport.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this ComponentInfoTransport.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the id value for this ComponentInfoTransport.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ComponentInfoTransport.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ComponentInfoTransport.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ComponentInfoTransport.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the shortName value for this ComponentInfoTransport.
     * 
     * @return shortName
     */
    public java.lang.String getShortName() {
        return shortName;
    }


    /**
     * Sets the shortName value for this ComponentInfoTransport.
     * 
     * @param shortName
     */
    public void setShortName(java.lang.String shortName) {
        this.shortName = shortName;
    }


    /**
     * Gets the currentVersion value for this ComponentInfoTransport.
     * 
     * @return currentVersion
     */
    public java.lang.String getCurrentVersion() {
        return currentVersion;
    }


    /**
     * Sets the currentVersion value for this ComponentInfoTransport.
     * 
     * @param currentVersion
     */
    public void setCurrentVersion(java.lang.String currentVersion) {
        this.currentVersion = currentVersion;
    }


    /**
     * Gets the lastUpdate value for this ComponentInfoTransport.
     * 
     * @return lastUpdate
     */
    public java.util.Calendar getLastUpdate() {
        return lastUpdate;
    }


    /**
     * Sets the lastUpdate value for this ComponentInfoTransport.
     * 
     * @param lastUpdate
     */
    public void setLastUpdate(java.util.Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    /**
     * Gets the nameKey value for this ComponentInfoTransport.
     * 
     * @return nameKey
     */
    public java.lang.String getNameKey() {
        return nameKey;
    }


    /**
     * Sets the nameKey value for this ComponentInfoTransport.
     * 
     * @param nameKey
     */
    public void setNameKey(java.lang.String nameKey) {
        this.nameKey = nameKey;
    }


    /**
     * Gets the deployed value for this ComponentInfoTransport.
     * 
     * @return deployed
     */
    public int getDeployed() {
        return deployed;
    }


    /**
     * Sets the deployed value for this ComponentInfoTransport.
     * 
     * @param deployed
     */
    public void setDeployed(int deployed) {
        this.deployed = deployed;
    }


    /**
     * Gets the needDeployed value for this ComponentInfoTransport.
     * 
     * @return needDeployed
     */
    public int getNeedDeployed() {
        return needDeployed;
    }


    /**
     * Sets the needDeployed value for this ComponentInfoTransport.
     * 
     * @param needDeployed
     */
    public void setNeedDeployed(int needDeployed) {
        this.needDeployed = needDeployed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComponentInfoTransport)) return false;
        ComponentInfoTransport other = (ComponentInfoTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.type == other.getType() &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.shortName==null && other.getShortName()==null) || 
             (this.shortName!=null &&
              this.shortName.equals(other.getShortName()))) &&
            ((this.currentVersion==null && other.getCurrentVersion()==null) || 
             (this.currentVersion!=null &&
              this.currentVersion.equals(other.getCurrentVersion()))) &&
            ((this.lastUpdate==null && other.getLastUpdate()==null) || 
             (this.lastUpdate!=null &&
              this.lastUpdate.equals(other.getLastUpdate()))) &&
            ((this.nameKey==null && other.getNameKey()==null) || 
             (this.nameKey!=null &&
              this.nameKey.equals(other.getNameKey()))) &&
            this.deployed == other.getDeployed() &&
            this.needDeployed == other.getNeedDeployed();
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
        _hashCode += getType();
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getShortName() != null) {
            _hashCode += getShortName().hashCode();
        }
        if (getCurrentVersion() != null) {
            _hashCode += getCurrentVersion().hashCode();
        }
        if (getLastUpdate() != null) {
            _hashCode += getLastUpdate().hashCode();
        }
        if (getNameKey() != null) {
            _hashCode += getNameKey().hashCode();
        }
        _hashCode += getDeployed();
        _hashCode += getNeedDeployed();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComponentInfoTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ComponentInfoTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "shortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "currentVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "nameKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deployed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "deployed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needDeployed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "needDeployed"));
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
