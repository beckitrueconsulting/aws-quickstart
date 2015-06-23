/**
 * HostStatusTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class HostStatusTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private int applianceID;

    private java.lang.String applianceName;

    private java.lang.String esxServerFastPathDriverVersion;

    private int esxServerID;

    private java.lang.String esxServerName;

    private java.lang.String esxServerVersion;

    private boolean locked;

    private java.lang.String overallAntiMalwareStatus;

    private java.lang.String overallDpiStatus;

    private java.lang.String overallFirewallStatus;

    private java.lang.String overallIntegrityMonitoringStatus;

    private java.util.Calendar overallLastSuccessfulCommunication;

    private java.util.Calendar overallLastSuccessfulUpdate;

    private java.lang.String overallLogInspectionStatus;

    private java.lang.String overallStatus;

    private com.trendmicro.webserviceclient.generated.ProtectionStatusTransport[] protectionStatusTransports;

    private java.lang.String overallWebReputationStatus;

    public HostStatusTransport() {
    }

    public HostStatusTransport(
           int applianceID,
           java.lang.String applianceName,
           java.lang.String esxServerFastPathDriverVersion,
           int esxServerID,
           java.lang.String esxServerName,
           java.lang.String esxServerVersion,
           boolean locked,
           java.lang.String overallAntiMalwareStatus,
           java.lang.String overallDpiStatus,
           java.lang.String overallFirewallStatus,
           java.lang.String overallIntegrityMonitoringStatus,
           java.util.Calendar overallLastSuccessfulCommunication,
           java.util.Calendar overallLastSuccessfulUpdate,
           java.lang.String overallLogInspectionStatus,
           java.lang.String overallStatus,
           com.trendmicro.webserviceclient.generated.ProtectionStatusTransport[] protectionStatusTransports,
           java.lang.String overallWebReputationStatus) {
        this.applianceID = applianceID;
        this.applianceName = applianceName;
        this.esxServerFastPathDriverVersion = esxServerFastPathDriverVersion;
        this.esxServerID = esxServerID;
        this.esxServerName = esxServerName;
        this.esxServerVersion = esxServerVersion;
        this.locked = locked;
        this.overallAntiMalwareStatus = overallAntiMalwareStatus;
        this.overallDpiStatus = overallDpiStatus;
        this.overallFirewallStatus = overallFirewallStatus;
        this.overallIntegrityMonitoringStatus = overallIntegrityMonitoringStatus;
        this.overallLastSuccessfulCommunication = overallLastSuccessfulCommunication;
        this.overallLastSuccessfulUpdate = overallLastSuccessfulUpdate;
        this.overallLogInspectionStatus = overallLogInspectionStatus;
        this.overallStatus = overallStatus;
        this.protectionStatusTransports = protectionStatusTransports;
        this.overallWebReputationStatus = overallWebReputationStatus;
    }


    /**
     * Gets the applianceID value for this HostStatusTransport.
     * 
     * @return applianceID
     */
    public int getApplianceID() {
        return applianceID;
    }


    /**
     * Sets the applianceID value for this HostStatusTransport.
     * 
     * @param applianceID
     */
    public void setApplianceID(int applianceID) {
        this.applianceID = applianceID;
    }


    /**
     * Gets the applianceName value for this HostStatusTransport.
     * 
     * @return applianceName
     */
    public java.lang.String getApplianceName() {
        return applianceName;
    }


    /**
     * Sets the applianceName value for this HostStatusTransport.
     * 
     * @param applianceName
     */
    public void setApplianceName(java.lang.String applianceName) {
        this.applianceName = applianceName;
    }


    /**
     * Gets the esxServerFastPathDriverVersion value for this HostStatusTransport.
     * 
     * @return esxServerFastPathDriverVersion
     */
    public java.lang.String getEsxServerFastPathDriverVersion() {
        return esxServerFastPathDriverVersion;
    }


    /**
     * Sets the esxServerFastPathDriverVersion value for this HostStatusTransport.
     * 
     * @param esxServerFastPathDriverVersion
     */
    public void setEsxServerFastPathDriverVersion(java.lang.String esxServerFastPathDriverVersion) {
        this.esxServerFastPathDriverVersion = esxServerFastPathDriverVersion;
    }


    /**
     * Gets the esxServerID value for this HostStatusTransport.
     * 
     * @return esxServerID
     */
    public int getEsxServerID() {
        return esxServerID;
    }


    /**
     * Sets the esxServerID value for this HostStatusTransport.
     * 
     * @param esxServerID
     */
    public void setEsxServerID(int esxServerID) {
        this.esxServerID = esxServerID;
    }


    /**
     * Gets the esxServerName value for this HostStatusTransport.
     * 
     * @return esxServerName
     */
    public java.lang.String getEsxServerName() {
        return esxServerName;
    }


    /**
     * Sets the esxServerName value for this HostStatusTransport.
     * 
     * @param esxServerName
     */
    public void setEsxServerName(java.lang.String esxServerName) {
        this.esxServerName = esxServerName;
    }


    /**
     * Gets the esxServerVersion value for this HostStatusTransport.
     * 
     * @return esxServerVersion
     */
    public java.lang.String getEsxServerVersion() {
        return esxServerVersion;
    }


    /**
     * Sets the esxServerVersion value for this HostStatusTransport.
     * 
     * @param esxServerVersion
     */
    public void setEsxServerVersion(java.lang.String esxServerVersion) {
        this.esxServerVersion = esxServerVersion;
    }


    /**
     * Gets the locked value for this HostStatusTransport.
     * 
     * @return locked
     */
    public boolean isLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this HostStatusTransport.
     * 
     * @param locked
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }


    /**
     * Gets the overallAntiMalwareStatus value for this HostStatusTransport.
     * 
     * @return overallAntiMalwareStatus
     */
    public java.lang.String getOverallAntiMalwareStatus() {
        return overallAntiMalwareStatus;
    }


    /**
     * Sets the overallAntiMalwareStatus value for this HostStatusTransport.
     * 
     * @param overallAntiMalwareStatus
     */
    public void setOverallAntiMalwareStatus(java.lang.String overallAntiMalwareStatus) {
        this.overallAntiMalwareStatus = overallAntiMalwareStatus;
    }


    /**
     * Gets the overallDpiStatus value for this HostStatusTransport.
     * 
     * @return overallDpiStatus
     */
    public java.lang.String getOverallDpiStatus() {
        return overallDpiStatus;
    }


    /**
     * Sets the overallDpiStatus value for this HostStatusTransport.
     * 
     * @param overallDpiStatus
     */
    public void setOverallDpiStatus(java.lang.String overallDpiStatus) {
        this.overallDpiStatus = overallDpiStatus;
    }


    /**
     * Gets the overallFirewallStatus value for this HostStatusTransport.
     * 
     * @return overallFirewallStatus
     */
    public java.lang.String getOverallFirewallStatus() {
        return overallFirewallStatus;
    }


    /**
     * Sets the overallFirewallStatus value for this HostStatusTransport.
     * 
     * @param overallFirewallStatus
     */
    public void setOverallFirewallStatus(java.lang.String overallFirewallStatus) {
        this.overallFirewallStatus = overallFirewallStatus;
    }


    /**
     * Gets the overallIntegrityMonitoringStatus value for this HostStatusTransport.
     * 
     * @return overallIntegrityMonitoringStatus
     */
    public java.lang.String getOverallIntegrityMonitoringStatus() {
        return overallIntegrityMonitoringStatus;
    }


    /**
     * Sets the overallIntegrityMonitoringStatus value for this HostStatusTransport.
     * 
     * @param overallIntegrityMonitoringStatus
     */
    public void setOverallIntegrityMonitoringStatus(java.lang.String overallIntegrityMonitoringStatus) {
        this.overallIntegrityMonitoringStatus = overallIntegrityMonitoringStatus;
    }


    /**
     * Gets the overallLastSuccessfulCommunication value for this HostStatusTransport.
     * 
     * @return overallLastSuccessfulCommunication
     */
    public java.util.Calendar getOverallLastSuccessfulCommunication() {
        return overallLastSuccessfulCommunication;
    }


    /**
     * Sets the overallLastSuccessfulCommunication value for this HostStatusTransport.
     * 
     * @param overallLastSuccessfulCommunication
     */
    public void setOverallLastSuccessfulCommunication(java.util.Calendar overallLastSuccessfulCommunication) {
        this.overallLastSuccessfulCommunication = overallLastSuccessfulCommunication;
    }


    /**
     * Gets the overallLastSuccessfulUpdate value for this HostStatusTransport.
     * 
     * @return overallLastSuccessfulUpdate
     */
    public java.util.Calendar getOverallLastSuccessfulUpdate() {
        return overallLastSuccessfulUpdate;
    }


    /**
     * Sets the overallLastSuccessfulUpdate value for this HostStatusTransport.
     * 
     * @param overallLastSuccessfulUpdate
     */
    public void setOverallLastSuccessfulUpdate(java.util.Calendar overallLastSuccessfulUpdate) {
        this.overallLastSuccessfulUpdate = overallLastSuccessfulUpdate;
    }


    /**
     * Gets the overallLogInspectionStatus value for this HostStatusTransport.
     * 
     * @return overallLogInspectionStatus
     */
    public java.lang.String getOverallLogInspectionStatus() {
        return overallLogInspectionStatus;
    }


    /**
     * Sets the overallLogInspectionStatus value for this HostStatusTransport.
     * 
     * @param overallLogInspectionStatus
     */
    public void setOverallLogInspectionStatus(java.lang.String overallLogInspectionStatus) {
        this.overallLogInspectionStatus = overallLogInspectionStatus;
    }


    /**
     * Gets the overallStatus value for this HostStatusTransport.
     * 
     * @return overallStatus
     */
    public java.lang.String getOverallStatus() {
        return overallStatus;
    }


    /**
     * Sets the overallStatus value for this HostStatusTransport.
     * 
     * @param overallStatus
     */
    public void setOverallStatus(java.lang.String overallStatus) {
        this.overallStatus = overallStatus;
    }


    /**
     * Gets the protectionStatusTransports value for this HostStatusTransport.
     * 
     * @return protectionStatusTransports
     */
    public com.trendmicro.webserviceclient.generated.ProtectionStatusTransport[] getProtectionStatusTransports() {
        return protectionStatusTransports;
    }


    /**
     * Sets the protectionStatusTransports value for this HostStatusTransport.
     * 
     * @param protectionStatusTransports
     */
    public void setProtectionStatusTransports(com.trendmicro.webserviceclient.generated.ProtectionStatusTransport[] protectionStatusTransports) {
        this.protectionStatusTransports = protectionStatusTransports;
    }


    /**
     * Gets the overallWebReputationStatus value for this HostStatusTransport.
     * 
     * @return overallWebReputationStatus
     */
    public java.lang.String getOverallWebReputationStatus() {
        return overallWebReputationStatus;
    }


    /**
     * Sets the overallWebReputationStatus value for this HostStatusTransport.
     * 
     * @param overallWebReputationStatus
     */
    public void setOverallWebReputationStatus(java.lang.String overallWebReputationStatus) {
        this.overallWebReputationStatus = overallWebReputationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostStatusTransport)) return false;
        HostStatusTransport other = (HostStatusTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.applianceID == other.getApplianceID() &&
            ((this.applianceName==null && other.getApplianceName()==null) || 
             (this.applianceName!=null &&
              this.applianceName.equals(other.getApplianceName()))) &&
            ((this.esxServerFastPathDriverVersion==null && other.getEsxServerFastPathDriverVersion()==null) || 
             (this.esxServerFastPathDriverVersion!=null &&
              this.esxServerFastPathDriverVersion.equals(other.getEsxServerFastPathDriverVersion()))) &&
            this.esxServerID == other.getEsxServerID() &&
            ((this.esxServerName==null && other.getEsxServerName()==null) || 
             (this.esxServerName!=null &&
              this.esxServerName.equals(other.getEsxServerName()))) &&
            ((this.esxServerVersion==null && other.getEsxServerVersion()==null) || 
             (this.esxServerVersion!=null &&
              this.esxServerVersion.equals(other.getEsxServerVersion()))) &&
            this.locked == other.isLocked() &&
            ((this.overallAntiMalwareStatus==null && other.getOverallAntiMalwareStatus()==null) || 
             (this.overallAntiMalwareStatus!=null &&
              this.overallAntiMalwareStatus.equals(other.getOverallAntiMalwareStatus()))) &&
            ((this.overallDpiStatus==null && other.getOverallDpiStatus()==null) || 
             (this.overallDpiStatus!=null &&
              this.overallDpiStatus.equals(other.getOverallDpiStatus()))) &&
            ((this.overallFirewallStatus==null && other.getOverallFirewallStatus()==null) || 
             (this.overallFirewallStatus!=null &&
              this.overallFirewallStatus.equals(other.getOverallFirewallStatus()))) &&
            ((this.overallIntegrityMonitoringStatus==null && other.getOverallIntegrityMonitoringStatus()==null) || 
             (this.overallIntegrityMonitoringStatus!=null &&
              this.overallIntegrityMonitoringStatus.equals(other.getOverallIntegrityMonitoringStatus()))) &&
            ((this.overallLastSuccessfulCommunication==null && other.getOverallLastSuccessfulCommunication()==null) || 
             (this.overallLastSuccessfulCommunication!=null &&
              this.overallLastSuccessfulCommunication.equals(other.getOverallLastSuccessfulCommunication()))) &&
            ((this.overallLastSuccessfulUpdate==null && other.getOverallLastSuccessfulUpdate()==null) || 
             (this.overallLastSuccessfulUpdate!=null &&
              this.overallLastSuccessfulUpdate.equals(other.getOverallLastSuccessfulUpdate()))) &&
            ((this.overallLogInspectionStatus==null && other.getOverallLogInspectionStatus()==null) || 
             (this.overallLogInspectionStatus!=null &&
              this.overallLogInspectionStatus.equals(other.getOverallLogInspectionStatus()))) &&
            ((this.overallStatus==null && other.getOverallStatus()==null) || 
             (this.overallStatus!=null &&
              this.overallStatus.equals(other.getOverallStatus()))) &&
            ((this.protectionStatusTransports==null && other.getProtectionStatusTransports()==null) || 
             (this.protectionStatusTransports!=null &&
              java.util.Arrays.equals(this.protectionStatusTransports, other.getProtectionStatusTransports()))) &&
            ((this.overallWebReputationStatus==null && other.getOverallWebReputationStatus()==null) || 
             (this.overallWebReputationStatus!=null &&
              this.overallWebReputationStatus.equals(other.getOverallWebReputationStatus())));
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
        _hashCode += getApplianceID();
        if (getApplianceName() != null) {
            _hashCode += getApplianceName().hashCode();
        }
        if (getEsxServerFastPathDriverVersion() != null) {
            _hashCode += getEsxServerFastPathDriverVersion().hashCode();
        }
        _hashCode += getEsxServerID();
        if (getEsxServerName() != null) {
            _hashCode += getEsxServerName().hashCode();
        }
        if (getEsxServerVersion() != null) {
            _hashCode += getEsxServerVersion().hashCode();
        }
        _hashCode += (isLocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOverallAntiMalwareStatus() != null) {
            _hashCode += getOverallAntiMalwareStatus().hashCode();
        }
        if (getOverallDpiStatus() != null) {
            _hashCode += getOverallDpiStatus().hashCode();
        }
        if (getOverallFirewallStatus() != null) {
            _hashCode += getOverallFirewallStatus().hashCode();
        }
        if (getOverallIntegrityMonitoringStatus() != null) {
            _hashCode += getOverallIntegrityMonitoringStatus().hashCode();
        }
        if (getOverallLastSuccessfulCommunication() != null) {
            _hashCode += getOverallLastSuccessfulCommunication().hashCode();
        }
        if (getOverallLastSuccessfulUpdate() != null) {
            _hashCode += getOverallLastSuccessfulUpdate().hashCode();
        }
        if (getOverallLogInspectionStatus() != null) {
            _hashCode += getOverallLogInspectionStatus().hashCode();
        }
        if (getOverallStatus() != null) {
            _hashCode += getOverallStatus().hashCode();
        }
        if (getProtectionStatusTransports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtectionStatusTransports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtectionStatusTransports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverallWebReputationStatus() != null) {
            _hashCode += getOverallWebReputationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostStatusTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostStatusTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applianceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "applianceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applianceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "applianceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esxServerFastPathDriverVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "esxServerFastPathDriverVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esxServerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "esxServerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esxServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "esxServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esxServerVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "esxServerVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallAntiMalwareStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallAntiMalwareStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallDpiStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallDpiStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallFirewallStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallFirewallStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallIntegrityMonitoringStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallIntegrityMonitoringStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallLastSuccessfulCommunication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallLastSuccessfulCommunication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallLastSuccessfulUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallLastSuccessfulUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallLogInspectionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallLogInspectionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectionStatusTransports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protectionStatusTransports"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ProtectionStatusTransport"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallWebReputationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallWebReputationStatus"));
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
