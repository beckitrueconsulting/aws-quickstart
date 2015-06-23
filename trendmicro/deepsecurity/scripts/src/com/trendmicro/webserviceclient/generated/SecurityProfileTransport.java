/**
 * SecurityProfileTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class SecurityProfileTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private int[] DPIRuleIDs;

    private com.trendmicro.webserviceclient.generated.EnumSecurityProfileDPIState DPIState;

    private java.lang.Integer antiMalwareManualID;

    private boolean antiMalwareManualInherit;

    private java.lang.Integer antiMalwareRealTimeID;

    private boolean antiMalwareRealTimeInherit;

    private java.lang.Integer antiMalwareRealTimeScheduleID;

    private java.lang.Integer antiMalwareScheduledID;

    private boolean antiMalwareScheduledInherit;

    private com.trendmicro.webserviceclient.generated.EnumSecurityProfileAntiMalwareState antiMalwareState;

    private int[] applicationTypeIDs;

    private int[] firewallRuleIDs;

    private com.trendmicro.webserviceclient.generated.EnumSecurityProfileFirewallState firewallState;

    private int[] integrityRuleIDs;

    private com.trendmicro.webserviceclient.generated.EnumSecurityProfileIntegrityState integrityState;

    private int[] logInspectionRuleIDs;

    private com.trendmicro.webserviceclient.generated.EnumSecurityProfileLogInspectionState logInspectionState;

    private java.lang.Integer parentSecurityProfileID;

    private com.trendmicro.webserviceclient.generated.EnumSecurityProfileRecommendationState recommendationState;

    private java.lang.Integer scheduleID;

    private java.lang.Integer statefulConfigurationID;

    public SecurityProfileTransport() {
    }

    public SecurityProfileTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           int[] DPIRuleIDs,
           com.trendmicro.webserviceclient.generated.EnumSecurityProfileDPIState DPIState,
           java.lang.Integer antiMalwareManualID,
           boolean antiMalwareManualInherit,
           java.lang.Integer antiMalwareRealTimeID,
           boolean antiMalwareRealTimeInherit,
           java.lang.Integer antiMalwareRealTimeScheduleID,
           java.lang.Integer antiMalwareScheduledID,
           boolean antiMalwareScheduledInherit,
           com.trendmicro.webserviceclient.generated.EnumSecurityProfileAntiMalwareState antiMalwareState,
           int[] applicationTypeIDs,
           int[] firewallRuleIDs,
           com.trendmicro.webserviceclient.generated.EnumSecurityProfileFirewallState firewallState,
           int[] integrityRuleIDs,
           com.trendmicro.webserviceclient.generated.EnumSecurityProfileIntegrityState integrityState,
           int[] logInspectionRuleIDs,
           com.trendmicro.webserviceclient.generated.EnumSecurityProfileLogInspectionState logInspectionState,
           java.lang.Integer parentSecurityProfileID,
           com.trendmicro.webserviceclient.generated.EnumSecurityProfileRecommendationState recommendationState,
           java.lang.Integer scheduleID,
           java.lang.Integer statefulConfigurationID) {
        super(
            ID,
            description,
            name);
        this.DPIRuleIDs = DPIRuleIDs;
        this.DPIState = DPIState;
        this.antiMalwareManualID = antiMalwareManualID;
        this.antiMalwareManualInherit = antiMalwareManualInherit;
        this.antiMalwareRealTimeID = antiMalwareRealTimeID;
        this.antiMalwareRealTimeInherit = antiMalwareRealTimeInherit;
        this.antiMalwareRealTimeScheduleID = antiMalwareRealTimeScheduleID;
        this.antiMalwareScheduledID = antiMalwareScheduledID;
        this.antiMalwareScheduledInherit = antiMalwareScheduledInherit;
        this.antiMalwareState = antiMalwareState;
        this.applicationTypeIDs = applicationTypeIDs;
        this.firewallRuleIDs = firewallRuleIDs;
        this.firewallState = firewallState;
        this.integrityRuleIDs = integrityRuleIDs;
        this.integrityState = integrityState;
        this.logInspectionRuleIDs = logInspectionRuleIDs;
        this.logInspectionState = logInspectionState;
        this.parentSecurityProfileID = parentSecurityProfileID;
        this.recommendationState = recommendationState;
        this.scheduleID = scheduleID;
        this.statefulConfigurationID = statefulConfigurationID;
    }


    /**
     * Gets the DPIRuleIDs value for this SecurityProfileTransport.
     * 
     * @return DPIRuleIDs
     */
    public int[] getDPIRuleIDs() {
        return DPIRuleIDs;
    }


    /**
     * Sets the DPIRuleIDs value for this SecurityProfileTransport.
     * 
     * @param DPIRuleIDs
     */
    public void setDPIRuleIDs(int[] DPIRuleIDs) {
        this.DPIRuleIDs = DPIRuleIDs;
    }


    /**
     * Gets the DPIState value for this SecurityProfileTransport.
     * 
     * @return DPIState
     */
    public com.trendmicro.webserviceclient.generated.EnumSecurityProfileDPIState getDPIState() {
        return DPIState;
    }


    /**
     * Sets the DPIState value for this SecurityProfileTransport.
     * 
     * @param DPIState
     */
    public void setDPIState(com.trendmicro.webserviceclient.generated.EnumSecurityProfileDPIState DPIState) {
        this.DPIState = DPIState;
    }


    /**
     * Gets the antiMalwareManualID value for this SecurityProfileTransport.
     * 
     * @return antiMalwareManualID
     */
    public java.lang.Integer getAntiMalwareManualID() {
        return antiMalwareManualID;
    }


    /**
     * Sets the antiMalwareManualID value for this SecurityProfileTransport.
     * 
     * @param antiMalwareManualID
     */
    public void setAntiMalwareManualID(java.lang.Integer antiMalwareManualID) {
        this.antiMalwareManualID = antiMalwareManualID;
    }


    /**
     * Gets the antiMalwareManualInherit value for this SecurityProfileTransport.
     * 
     * @return antiMalwareManualInherit
     */
    public boolean isAntiMalwareManualInherit() {
        return antiMalwareManualInherit;
    }


    /**
     * Sets the antiMalwareManualInherit value for this SecurityProfileTransport.
     * 
     * @param antiMalwareManualInherit
     */
    public void setAntiMalwareManualInherit(boolean antiMalwareManualInherit) {
        this.antiMalwareManualInherit = antiMalwareManualInherit;
    }


    /**
     * Gets the antiMalwareRealTimeID value for this SecurityProfileTransport.
     * 
     * @return antiMalwareRealTimeID
     */
    public java.lang.Integer getAntiMalwareRealTimeID() {
        return antiMalwareRealTimeID;
    }


    /**
     * Sets the antiMalwareRealTimeID value for this SecurityProfileTransport.
     * 
     * @param antiMalwareRealTimeID
     */
    public void setAntiMalwareRealTimeID(java.lang.Integer antiMalwareRealTimeID) {
        this.antiMalwareRealTimeID = antiMalwareRealTimeID;
    }


    /**
     * Gets the antiMalwareRealTimeInherit value for this SecurityProfileTransport.
     * 
     * @return antiMalwareRealTimeInherit
     */
    public boolean isAntiMalwareRealTimeInherit() {
        return antiMalwareRealTimeInherit;
    }


    /**
     * Sets the antiMalwareRealTimeInherit value for this SecurityProfileTransport.
     * 
     * @param antiMalwareRealTimeInherit
     */
    public void setAntiMalwareRealTimeInherit(boolean antiMalwareRealTimeInherit) {
        this.antiMalwareRealTimeInherit = antiMalwareRealTimeInherit;
    }


    /**
     * Gets the antiMalwareRealTimeScheduleID value for this SecurityProfileTransport.
     * 
     * @return antiMalwareRealTimeScheduleID
     */
    public java.lang.Integer getAntiMalwareRealTimeScheduleID() {
        return antiMalwareRealTimeScheduleID;
    }


    /**
     * Sets the antiMalwareRealTimeScheduleID value for this SecurityProfileTransport.
     * 
     * @param antiMalwareRealTimeScheduleID
     */
    public void setAntiMalwareRealTimeScheduleID(java.lang.Integer antiMalwareRealTimeScheduleID) {
        this.antiMalwareRealTimeScheduleID = antiMalwareRealTimeScheduleID;
    }


    /**
     * Gets the antiMalwareScheduledID value for this SecurityProfileTransport.
     * 
     * @return antiMalwareScheduledID
     */
    public java.lang.Integer getAntiMalwareScheduledID() {
        return antiMalwareScheduledID;
    }


    /**
     * Sets the antiMalwareScheduledID value for this SecurityProfileTransport.
     * 
     * @param antiMalwareScheduledID
     */
    public void setAntiMalwareScheduledID(java.lang.Integer antiMalwareScheduledID) {
        this.antiMalwareScheduledID = antiMalwareScheduledID;
    }


    /**
     * Gets the antiMalwareScheduledInherit value for this SecurityProfileTransport.
     * 
     * @return antiMalwareScheduledInherit
     */
    public boolean isAntiMalwareScheduledInherit() {
        return antiMalwareScheduledInherit;
    }


    /**
     * Sets the antiMalwareScheduledInherit value for this SecurityProfileTransport.
     * 
     * @param antiMalwareScheduledInherit
     */
    public void setAntiMalwareScheduledInherit(boolean antiMalwareScheduledInherit) {
        this.antiMalwareScheduledInherit = antiMalwareScheduledInherit;
    }


    /**
     * Gets the antiMalwareState value for this SecurityProfileTransport.
     * 
     * @return antiMalwareState
     */
    public com.trendmicro.webserviceclient.generated.EnumSecurityProfileAntiMalwareState getAntiMalwareState() {
        return antiMalwareState;
    }


    /**
     * Sets the antiMalwareState value for this SecurityProfileTransport.
     * 
     * @param antiMalwareState
     */
    public void setAntiMalwareState(com.trendmicro.webserviceclient.generated.EnumSecurityProfileAntiMalwareState antiMalwareState) {
        this.antiMalwareState = antiMalwareState;
    }


    /**
     * Gets the applicationTypeIDs value for this SecurityProfileTransport.
     * 
     * @return applicationTypeIDs
     */
    public int[] getApplicationTypeIDs() {
        return applicationTypeIDs;
    }


    /**
     * Sets the applicationTypeIDs value for this SecurityProfileTransport.
     * 
     * @param applicationTypeIDs
     */
    public void setApplicationTypeIDs(int[] applicationTypeIDs) {
        this.applicationTypeIDs = applicationTypeIDs;
    }


    /**
     * Gets the firewallRuleIDs value for this SecurityProfileTransport.
     * 
     * @return firewallRuleIDs
     */
    public int[] getFirewallRuleIDs() {
        return firewallRuleIDs;
    }


    /**
     * Sets the firewallRuleIDs value for this SecurityProfileTransport.
     * 
     * @param firewallRuleIDs
     */
    public void setFirewallRuleIDs(int[] firewallRuleIDs) {
        this.firewallRuleIDs = firewallRuleIDs;
    }


    /**
     * Gets the firewallState value for this SecurityProfileTransport.
     * 
     * @return firewallState
     */
    public com.trendmicro.webserviceclient.generated.EnumSecurityProfileFirewallState getFirewallState() {
        return firewallState;
    }


    /**
     * Sets the firewallState value for this SecurityProfileTransport.
     * 
     * @param firewallState
     */
    public void setFirewallState(com.trendmicro.webserviceclient.generated.EnumSecurityProfileFirewallState firewallState) {
        this.firewallState = firewallState;
    }


    /**
     * Gets the integrityRuleIDs value for this SecurityProfileTransport.
     * 
     * @return integrityRuleIDs
     */
    public int[] getIntegrityRuleIDs() {
        return integrityRuleIDs;
    }


    /**
     * Sets the integrityRuleIDs value for this SecurityProfileTransport.
     * 
     * @param integrityRuleIDs
     */
    public void setIntegrityRuleIDs(int[] integrityRuleIDs) {
        this.integrityRuleIDs = integrityRuleIDs;
    }


    /**
     * Gets the integrityState value for this SecurityProfileTransport.
     * 
     * @return integrityState
     */
    public com.trendmicro.webserviceclient.generated.EnumSecurityProfileIntegrityState getIntegrityState() {
        return integrityState;
    }


    /**
     * Sets the integrityState value for this SecurityProfileTransport.
     * 
     * @param integrityState
     */
    public void setIntegrityState(com.trendmicro.webserviceclient.generated.EnumSecurityProfileIntegrityState integrityState) {
        this.integrityState = integrityState;
    }


    /**
     * Gets the logInspectionRuleIDs value for this SecurityProfileTransport.
     * 
     * @return logInspectionRuleIDs
     */
    public int[] getLogInspectionRuleIDs() {
        return logInspectionRuleIDs;
    }


    /**
     * Sets the logInspectionRuleIDs value for this SecurityProfileTransport.
     * 
     * @param logInspectionRuleIDs
     */
    public void setLogInspectionRuleIDs(int[] logInspectionRuleIDs) {
        this.logInspectionRuleIDs = logInspectionRuleIDs;
    }


    /**
     * Gets the logInspectionState value for this SecurityProfileTransport.
     * 
     * @return logInspectionState
     */
    public com.trendmicro.webserviceclient.generated.EnumSecurityProfileLogInspectionState getLogInspectionState() {
        return logInspectionState;
    }


    /**
     * Sets the logInspectionState value for this SecurityProfileTransport.
     * 
     * @param logInspectionState
     */
    public void setLogInspectionState(com.trendmicro.webserviceclient.generated.EnumSecurityProfileLogInspectionState logInspectionState) {
        this.logInspectionState = logInspectionState;
    }


    /**
     * Gets the parentSecurityProfileID value for this SecurityProfileTransport.
     * 
     * @return parentSecurityProfileID
     */
    public java.lang.Integer getParentSecurityProfileID() {
        return parentSecurityProfileID;
    }


    /**
     * Sets the parentSecurityProfileID value for this SecurityProfileTransport.
     * 
     * @param parentSecurityProfileID
     */
    public void setParentSecurityProfileID(java.lang.Integer parentSecurityProfileID) {
        this.parentSecurityProfileID = parentSecurityProfileID;
    }


    /**
     * Gets the recommendationState value for this SecurityProfileTransport.
     * 
     * @return recommendationState
     */
    public com.trendmicro.webserviceclient.generated.EnumSecurityProfileRecommendationState getRecommendationState() {
        return recommendationState;
    }


    /**
     * Sets the recommendationState value for this SecurityProfileTransport.
     * 
     * @param recommendationState
     */
    public void setRecommendationState(com.trendmicro.webserviceclient.generated.EnumSecurityProfileRecommendationState recommendationState) {
        this.recommendationState = recommendationState;
    }


    /**
     * Gets the scheduleID value for this SecurityProfileTransport.
     * 
     * @return scheduleID
     */
    public java.lang.Integer getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this SecurityProfileTransport.
     * 
     * @param scheduleID
     */
    public void setScheduleID(java.lang.Integer scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the statefulConfigurationID value for this SecurityProfileTransport.
     * 
     * @return statefulConfigurationID
     */
    public java.lang.Integer getStatefulConfigurationID() {
        return statefulConfigurationID;
    }


    /**
     * Sets the statefulConfigurationID value for this SecurityProfileTransport.
     * 
     * @param statefulConfigurationID
     */
    public void setStatefulConfigurationID(java.lang.Integer statefulConfigurationID) {
        this.statefulConfigurationID = statefulConfigurationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityProfileTransport)) return false;
        SecurityProfileTransport other = (SecurityProfileTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.DPIRuleIDs==null && other.getDPIRuleIDs()==null) || 
             (this.DPIRuleIDs!=null &&
              java.util.Arrays.equals(this.DPIRuleIDs, other.getDPIRuleIDs()))) &&
            ((this.DPIState==null && other.getDPIState()==null) || 
             (this.DPIState!=null &&
              this.DPIState.equals(other.getDPIState()))) &&
            ((this.antiMalwareManualID==null && other.getAntiMalwareManualID()==null) || 
             (this.antiMalwareManualID!=null &&
              this.antiMalwareManualID.equals(other.getAntiMalwareManualID()))) &&
            this.antiMalwareManualInherit == other.isAntiMalwareManualInherit() &&
            ((this.antiMalwareRealTimeID==null && other.getAntiMalwareRealTimeID()==null) || 
             (this.antiMalwareRealTimeID!=null &&
              this.antiMalwareRealTimeID.equals(other.getAntiMalwareRealTimeID()))) &&
            this.antiMalwareRealTimeInherit == other.isAntiMalwareRealTimeInherit() &&
            ((this.antiMalwareRealTimeScheduleID==null && other.getAntiMalwareRealTimeScheduleID()==null) || 
             (this.antiMalwareRealTimeScheduleID!=null &&
              this.antiMalwareRealTimeScheduleID.equals(other.getAntiMalwareRealTimeScheduleID()))) &&
            ((this.antiMalwareScheduledID==null && other.getAntiMalwareScheduledID()==null) || 
             (this.antiMalwareScheduledID!=null &&
              this.antiMalwareScheduledID.equals(other.getAntiMalwareScheduledID()))) &&
            this.antiMalwareScheduledInherit == other.isAntiMalwareScheduledInherit() &&
            ((this.antiMalwareState==null && other.getAntiMalwareState()==null) || 
             (this.antiMalwareState!=null &&
              this.antiMalwareState.equals(other.getAntiMalwareState()))) &&
            ((this.applicationTypeIDs==null && other.getApplicationTypeIDs()==null) || 
             (this.applicationTypeIDs!=null &&
              java.util.Arrays.equals(this.applicationTypeIDs, other.getApplicationTypeIDs()))) &&
            ((this.firewallRuleIDs==null && other.getFirewallRuleIDs()==null) || 
             (this.firewallRuleIDs!=null &&
              java.util.Arrays.equals(this.firewallRuleIDs, other.getFirewallRuleIDs()))) &&
            ((this.firewallState==null && other.getFirewallState()==null) || 
             (this.firewallState!=null &&
              this.firewallState.equals(other.getFirewallState()))) &&
            ((this.integrityRuleIDs==null && other.getIntegrityRuleIDs()==null) || 
             (this.integrityRuleIDs!=null &&
              java.util.Arrays.equals(this.integrityRuleIDs, other.getIntegrityRuleIDs()))) &&
            ((this.integrityState==null && other.getIntegrityState()==null) || 
             (this.integrityState!=null &&
              this.integrityState.equals(other.getIntegrityState()))) &&
            ((this.logInspectionRuleIDs==null && other.getLogInspectionRuleIDs()==null) || 
             (this.logInspectionRuleIDs!=null &&
              java.util.Arrays.equals(this.logInspectionRuleIDs, other.getLogInspectionRuleIDs()))) &&
            ((this.logInspectionState==null && other.getLogInspectionState()==null) || 
             (this.logInspectionState!=null &&
              this.logInspectionState.equals(other.getLogInspectionState()))) &&
            ((this.parentSecurityProfileID==null && other.getParentSecurityProfileID()==null) || 
             (this.parentSecurityProfileID!=null &&
              this.parentSecurityProfileID.equals(other.getParentSecurityProfileID()))) &&
            ((this.recommendationState==null && other.getRecommendationState()==null) || 
             (this.recommendationState!=null &&
              this.recommendationState.equals(other.getRecommendationState()))) &&
            ((this.scheduleID==null && other.getScheduleID()==null) || 
             (this.scheduleID!=null &&
              this.scheduleID.equals(other.getScheduleID()))) &&
            ((this.statefulConfigurationID==null && other.getStatefulConfigurationID()==null) || 
             (this.statefulConfigurationID!=null &&
              this.statefulConfigurationID.equals(other.getStatefulConfigurationID())));
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
        if (getDPIRuleIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDPIRuleIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDPIRuleIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDPIState() != null) {
            _hashCode += getDPIState().hashCode();
        }
        if (getAntiMalwareManualID() != null) {
            _hashCode += getAntiMalwareManualID().hashCode();
        }
        _hashCode += (isAntiMalwareManualInherit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAntiMalwareRealTimeID() != null) {
            _hashCode += getAntiMalwareRealTimeID().hashCode();
        }
        _hashCode += (isAntiMalwareRealTimeInherit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAntiMalwareRealTimeScheduleID() != null) {
            _hashCode += getAntiMalwareRealTimeScheduleID().hashCode();
        }
        if (getAntiMalwareScheduledID() != null) {
            _hashCode += getAntiMalwareScheduledID().hashCode();
        }
        _hashCode += (isAntiMalwareScheduledInherit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAntiMalwareState() != null) {
            _hashCode += getAntiMalwareState().hashCode();
        }
        if (getApplicationTypeIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationTypeIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationTypeIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirewallRuleIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirewallRuleIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirewallRuleIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirewallState() != null) {
            _hashCode += getFirewallState().hashCode();
        }
        if (getIntegrityRuleIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntegrityRuleIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntegrityRuleIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntegrityState() != null) {
            _hashCode += getIntegrityState().hashCode();
        }
        if (getLogInspectionRuleIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogInspectionRuleIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogInspectionRuleIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogInspectionState() != null) {
            _hashCode += getLogInspectionState().hashCode();
        }
        if (getParentSecurityProfileID() != null) {
            _hashCode += getParentSecurityProfileID().hashCode();
        }
        if (getRecommendationState() != null) {
            _hashCode += getRecommendationState().hashCode();
        }
        if (getScheduleID() != null) {
            _hashCode += getScheduleID().hashCode();
        }
        if (getStatefulConfigurationID() != null) {
            _hashCode += getStatefulConfigurationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityProfileTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "SecurityProfileTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPIRuleIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "DPIRuleIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPIState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "DPIState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumSecurityProfileDPIState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareManualID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareManualID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareManualInherit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareManualInherit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareRealTimeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareRealTimeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareRealTimeInherit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareRealTimeInherit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareRealTimeScheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareRealTimeScheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareScheduledID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareScheduledID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareScheduledInherit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareScheduledInherit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumSecurityProfileAntiMalwareState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTypeIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "applicationTypeIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallRuleIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "firewallRuleIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "firewallState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumSecurityProfileFirewallState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrityRuleIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "integrityRuleIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrityState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "integrityState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumSecurityProfileIntegrityState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logInspectionRuleIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logInspectionRuleIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logInspectionState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logInspectionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumSecurityProfileLogInspectionState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentSecurityProfileID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "parentSecurityProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendationState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "recommendationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumSecurityProfileRecommendationState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "scheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statefulConfigurationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "statefulConfigurationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
