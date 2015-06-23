/**
 * ProtectionStatusTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class ProtectionStatusTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.String dpiStatus;

    private java.lang.String fingerprint;

    private java.lang.String firewallStatus;

    private java.lang.String integrityMonitoringStatus;

    private java.util.Calendar lastSuccessfulCommunication;

    private java.util.Calendar lastSuccessfulUpdate;

    private java.lang.String logInspectionStatus;

    private com.trendmicro.webserviceclient.generated.EnumProtectionType protectionType;

    private com.trendmicro.webserviceclient.generated.EnumState state;

    private java.lang.String stateDescription;

    private java.lang.String status;

    private java.lang.String version;

    private com.trendmicro.webserviceclient.generated.ComponentInfoTransport[] componentInfoTransports;

    private java.lang.String webReputationStatus;

    private java.lang.String antiMalwareStatus;

    public ProtectionStatusTransport() {
    }

    public ProtectionStatusTransport(
           java.lang.String dpiStatus,
           java.lang.String fingerprint,
           java.lang.String firewallStatus,
           java.lang.String integrityMonitoringStatus,
           java.util.Calendar lastSuccessfulCommunication,
           java.util.Calendar lastSuccessfulUpdate,
           java.lang.String logInspectionStatus,
           com.trendmicro.webserviceclient.generated.EnumProtectionType protectionType,
           com.trendmicro.webserviceclient.generated.EnumState state,
           java.lang.String stateDescription,
           java.lang.String status,
           java.lang.String version,
           com.trendmicro.webserviceclient.generated.ComponentInfoTransport[] componentInfoTransports,
           java.lang.String webReputationStatus,
           java.lang.String antiMalwareStatus) {
        this.dpiStatus = dpiStatus;
        this.fingerprint = fingerprint;
        this.firewallStatus = firewallStatus;
        this.integrityMonitoringStatus = integrityMonitoringStatus;
        this.lastSuccessfulCommunication = lastSuccessfulCommunication;
        this.lastSuccessfulUpdate = lastSuccessfulUpdate;
        this.logInspectionStatus = logInspectionStatus;
        this.protectionType = protectionType;
        this.state = state;
        this.stateDescription = stateDescription;
        this.status = status;
        this.version = version;
        this.componentInfoTransports = componentInfoTransports;
        this.webReputationStatus = webReputationStatus;
        this.antiMalwareStatus = antiMalwareStatus;
    }


    /**
     * Gets the dpiStatus value for this ProtectionStatusTransport.
     * 
     * @return dpiStatus
     */
    public java.lang.String getDpiStatus() {
        return dpiStatus;
    }


    /**
     * Sets the dpiStatus value for this ProtectionStatusTransport.
     * 
     * @param dpiStatus
     */
    public void setDpiStatus(java.lang.String dpiStatus) {
        this.dpiStatus = dpiStatus;
    }


    /**
     * Gets the fingerprint value for this ProtectionStatusTransport.
     * 
     * @return fingerprint
     */
    public java.lang.String getFingerprint() {
        return fingerprint;
    }


    /**
     * Sets the fingerprint value for this ProtectionStatusTransport.
     * 
     * @param fingerprint
     */
    public void setFingerprint(java.lang.String fingerprint) {
        this.fingerprint = fingerprint;
    }


    /**
     * Gets the firewallStatus value for this ProtectionStatusTransport.
     * 
     * @return firewallStatus
     */
    public java.lang.String getFirewallStatus() {
        return firewallStatus;
    }


    /**
     * Sets the firewallStatus value for this ProtectionStatusTransport.
     * 
     * @param firewallStatus
     */
    public void setFirewallStatus(java.lang.String firewallStatus) {
        this.firewallStatus = firewallStatus;
    }


    /**
     * Gets the integrityMonitoringStatus value for this ProtectionStatusTransport.
     * 
     * @return integrityMonitoringStatus
     */
    public java.lang.String getIntegrityMonitoringStatus() {
        return integrityMonitoringStatus;
    }


    /**
     * Sets the integrityMonitoringStatus value for this ProtectionStatusTransport.
     * 
     * @param integrityMonitoringStatus
     */
    public void setIntegrityMonitoringStatus(java.lang.String integrityMonitoringStatus) {
        this.integrityMonitoringStatus = integrityMonitoringStatus;
    }


    /**
     * Gets the lastSuccessfulCommunication value for this ProtectionStatusTransport.
     * 
     * @return lastSuccessfulCommunication
     */
    public java.util.Calendar getLastSuccessfulCommunication() {
        return lastSuccessfulCommunication;
    }


    /**
     * Sets the lastSuccessfulCommunication value for this ProtectionStatusTransport.
     * 
     * @param lastSuccessfulCommunication
     */
    public void setLastSuccessfulCommunication(java.util.Calendar lastSuccessfulCommunication) {
        this.lastSuccessfulCommunication = lastSuccessfulCommunication;
    }


    /**
     * Gets the lastSuccessfulUpdate value for this ProtectionStatusTransport.
     * 
     * @return lastSuccessfulUpdate
     */
    public java.util.Calendar getLastSuccessfulUpdate() {
        return lastSuccessfulUpdate;
    }


    /**
     * Sets the lastSuccessfulUpdate value for this ProtectionStatusTransport.
     * 
     * @param lastSuccessfulUpdate
     */
    public void setLastSuccessfulUpdate(java.util.Calendar lastSuccessfulUpdate) {
        this.lastSuccessfulUpdate = lastSuccessfulUpdate;
    }


    /**
     * Gets the logInspectionStatus value for this ProtectionStatusTransport.
     * 
     * @return logInspectionStatus
     */
    public java.lang.String getLogInspectionStatus() {
        return logInspectionStatus;
    }


    /**
     * Sets the logInspectionStatus value for this ProtectionStatusTransport.
     * 
     * @param logInspectionStatus
     */
    public void setLogInspectionStatus(java.lang.String logInspectionStatus) {
        this.logInspectionStatus = logInspectionStatus;
    }


    /**
     * Gets the protectionType value for this ProtectionStatusTransport.
     * 
     * @return protectionType
     */
    public com.trendmicro.webserviceclient.generated.EnumProtectionType getProtectionType() {
        return protectionType;
    }


    /**
     * Sets the protectionType value for this ProtectionStatusTransport.
     * 
     * @param protectionType
     */
    public void setProtectionType(com.trendmicro.webserviceclient.generated.EnumProtectionType protectionType) {
        this.protectionType = protectionType;
    }


    /**
     * Gets the state value for this ProtectionStatusTransport.
     * 
     * @return state
     */
    public com.trendmicro.webserviceclient.generated.EnumState getState() {
        return state;
    }


    /**
     * Sets the state value for this ProtectionStatusTransport.
     * 
     * @param state
     */
    public void setState(com.trendmicro.webserviceclient.generated.EnumState state) {
        this.state = state;
    }


    /**
     * Gets the stateDescription value for this ProtectionStatusTransport.
     * 
     * @return stateDescription
     */
    public java.lang.String getStateDescription() {
        return stateDescription;
    }


    /**
     * Sets the stateDescription value for this ProtectionStatusTransport.
     * 
     * @param stateDescription
     */
    public void setStateDescription(java.lang.String stateDescription) {
        this.stateDescription = stateDescription;
    }


    /**
     * Gets the status value for this ProtectionStatusTransport.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProtectionStatusTransport.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the version value for this ProtectionStatusTransport.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ProtectionStatusTransport.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the componentInfoTransports value for this ProtectionStatusTransport.
     * 
     * @return componentInfoTransports
     */
    public com.trendmicro.webserviceclient.generated.ComponentInfoTransport[] getComponentInfoTransports() {
        return componentInfoTransports;
    }


    /**
     * Sets the componentInfoTransports value for this ProtectionStatusTransport.
     * 
     * @param componentInfoTransports
     */
    public void setComponentInfoTransports(com.trendmicro.webserviceclient.generated.ComponentInfoTransport[] componentInfoTransports) {
        this.componentInfoTransports = componentInfoTransports;
    }


    /**
     * Gets the webReputationStatus value for this ProtectionStatusTransport.
     * 
     * @return webReputationStatus
     */
    public java.lang.String getWebReputationStatus() {
        return webReputationStatus;
    }


    /**
     * Sets the webReputationStatus value for this ProtectionStatusTransport.
     * 
     * @param webReputationStatus
     */
    public void setWebReputationStatus(java.lang.String webReputationStatus) {
        this.webReputationStatus = webReputationStatus;
    }


    /**
     * Gets the antiMalwareStatus value for this ProtectionStatusTransport.
     * 
     * @return antiMalwareStatus
     */
    public java.lang.String getAntiMalwareStatus() {
        return antiMalwareStatus;
    }


    /**
     * Sets the antiMalwareStatus value for this ProtectionStatusTransport.
     * 
     * @param antiMalwareStatus
     */
    public void setAntiMalwareStatus(java.lang.String antiMalwareStatus) {
        this.antiMalwareStatus = antiMalwareStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProtectionStatusTransport)) return false;
        ProtectionStatusTransport other = (ProtectionStatusTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dpiStatus==null && other.getDpiStatus()==null) || 
             (this.dpiStatus!=null &&
              this.dpiStatus.equals(other.getDpiStatus()))) &&
            ((this.fingerprint==null && other.getFingerprint()==null) || 
             (this.fingerprint!=null &&
              this.fingerprint.equals(other.getFingerprint()))) &&
            ((this.firewallStatus==null && other.getFirewallStatus()==null) || 
             (this.firewallStatus!=null &&
              this.firewallStatus.equals(other.getFirewallStatus()))) &&
            ((this.integrityMonitoringStatus==null && other.getIntegrityMonitoringStatus()==null) || 
             (this.integrityMonitoringStatus!=null &&
              this.integrityMonitoringStatus.equals(other.getIntegrityMonitoringStatus()))) &&
            ((this.lastSuccessfulCommunication==null && other.getLastSuccessfulCommunication()==null) || 
             (this.lastSuccessfulCommunication!=null &&
              this.lastSuccessfulCommunication.equals(other.getLastSuccessfulCommunication()))) &&
            ((this.lastSuccessfulUpdate==null && other.getLastSuccessfulUpdate()==null) || 
             (this.lastSuccessfulUpdate!=null &&
              this.lastSuccessfulUpdate.equals(other.getLastSuccessfulUpdate()))) &&
            ((this.logInspectionStatus==null && other.getLogInspectionStatus()==null) || 
             (this.logInspectionStatus!=null &&
              this.logInspectionStatus.equals(other.getLogInspectionStatus()))) &&
            ((this.protectionType==null && other.getProtectionType()==null) || 
             (this.protectionType!=null &&
              this.protectionType.equals(other.getProtectionType()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateDescription==null && other.getStateDescription()==null) || 
             (this.stateDescription!=null &&
              this.stateDescription.equals(other.getStateDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.componentInfoTransports==null && other.getComponentInfoTransports()==null) || 
             (this.componentInfoTransports!=null &&
              java.util.Arrays.equals(this.componentInfoTransports, other.getComponentInfoTransports()))) &&
            ((this.webReputationStatus==null && other.getWebReputationStatus()==null) || 
             (this.webReputationStatus!=null &&
              this.webReputationStatus.equals(other.getWebReputationStatus()))) &&
            ((this.antiMalwareStatus==null && other.getAntiMalwareStatus()==null) || 
             (this.antiMalwareStatus!=null &&
              this.antiMalwareStatus.equals(other.getAntiMalwareStatus())));
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
        if (getDpiStatus() != null) {
            _hashCode += getDpiStatus().hashCode();
        }
        if (getFingerprint() != null) {
            _hashCode += getFingerprint().hashCode();
        }
        if (getFirewallStatus() != null) {
            _hashCode += getFirewallStatus().hashCode();
        }
        if (getIntegrityMonitoringStatus() != null) {
            _hashCode += getIntegrityMonitoringStatus().hashCode();
        }
        if (getLastSuccessfulCommunication() != null) {
            _hashCode += getLastSuccessfulCommunication().hashCode();
        }
        if (getLastSuccessfulUpdate() != null) {
            _hashCode += getLastSuccessfulUpdate().hashCode();
        }
        if (getLogInspectionStatus() != null) {
            _hashCode += getLogInspectionStatus().hashCode();
        }
        if (getProtectionType() != null) {
            _hashCode += getProtectionType().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateDescription() != null) {
            _hashCode += getStateDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getComponentInfoTransports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentInfoTransports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentInfoTransports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWebReputationStatus() != null) {
            _hashCode += getWebReputationStatus().hashCode();
        }
        if (getAntiMalwareStatus() != null) {
            _hashCode += getAntiMalwareStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProtectionStatusTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ProtectionStatusTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpiStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "dpiStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fingerprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "fingerprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "firewallStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrityMonitoringStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "integrityMonitoringStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSuccessfulCommunication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastSuccessfulCommunication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSuccessfulUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastSuccessfulUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logInspectionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logInspectionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "protectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumProtectionType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "stateDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentInfoTransports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "componentInfoTransports"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "ComponentInfoTransport"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webReputationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "webReputationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareStatus"));
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
