/**
 * HostDetailTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class HostDetailTransport  extends com.trendmicro.webserviceclient.generated.HostTransport  implements java.io.Serializable {
    private java.lang.String antiMalwareClassicPatternVersion;

    private java.lang.String antiMalwareEngineVersion;

    private java.lang.String antiMalwareIntelliTrapExceptionVersion;

    private java.lang.String antiMalwareIntelliTrapVersion;

    private java.lang.String antiMalwareSmartScanPatternVersion;

    private java.lang.String antiMalwareSpywarePatternVersion;

    private java.lang.String cloudObjectImageId;

    private java.lang.String cloudObjectInstanceId;

    private java.lang.String cloudObjectInternalUniqueId;

    private java.lang.String cloudObjectSecurityGroupIds;

    private com.trendmicro.webserviceclient.generated.EnumCloudObjectType cloudObjectType;

    private int[] componentKlasses;

    private java.lang.String[] componentNames;

    private int[] componentTypes;

    private java.lang.String[] componentVersions;

    private java.lang.String hostGroupName;

    private com.trendmicro.webserviceclient.generated.HostInterfaceTransport[] hostInterfaces;

    private com.trendmicro.webserviceclient.generated.EnumHostLight hostLight;

    private java.util.Calendar lastAnitMalwareScheduledScan;

    private java.util.Calendar lastAntiMalwareEvent;

    private java.util.Calendar lastAntiMalwareManualScan;

    private java.util.Calendar lastDpiEvent;

    private java.util.Calendar lastFirewallEvent;

    private java.lang.String lastIPUsed;

    private java.util.Calendar lastIntegrityMonitoringEvent;

    private java.util.Calendar lastLogInspectionEvent;

    private java.util.Calendar lastWebReputationEvent;

    private java.lang.Integer light;

    private boolean locked;

    private java.lang.String overallAntiMalwareStatus;

    private java.lang.String overallDpiStatus;

    private java.lang.String overallFirewallStatus;

    private java.lang.String overallIntegrityMonitoringStatus;

    private java.util.Calendar overallLastRecommendationScan;

    private java.util.Calendar overallLastSuccessfulCommunication;

    private java.util.Calendar overallLastSuccessfulUpdate;

    private java.util.Calendar overallLastUpdateRequired;

    private java.lang.String overallLogInspectionStatus;

    private java.lang.String overallStatus;

    private java.lang.String overallVersion;

    private java.lang.String overallWebReputationStatus;

    private java.lang.String securityProfileName;

    private java.lang.String virtualName;

    private java.lang.String virtualUuid;

    public HostDetailTransport() {
    }

    public HostDetailTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           java.lang.String displayName,
           boolean external,
           java.lang.String externalID,
           java.lang.Integer hostGroupID,
           com.trendmicro.webserviceclient.generated.EnumHostType hostType,
           java.lang.String platform,
           java.lang.Integer securityProfileID,
           java.lang.String antiMalwareClassicPatternVersion,
           java.lang.String antiMalwareEngineVersion,
           java.lang.String antiMalwareIntelliTrapExceptionVersion,
           java.lang.String antiMalwareIntelliTrapVersion,
           java.lang.String antiMalwareSmartScanPatternVersion,
           java.lang.String antiMalwareSpywarePatternVersion,
           java.lang.String cloudObjectImageId,
           java.lang.String cloudObjectInstanceId,
           java.lang.String cloudObjectInternalUniqueId,
           java.lang.String cloudObjectSecurityGroupIds,
           com.trendmicro.webserviceclient.generated.EnumCloudObjectType cloudObjectType,
           int[] componentKlasses,
           java.lang.String[] componentNames,
           int[] componentTypes,
           java.lang.String[] componentVersions,
           java.lang.String hostGroupName,
           com.trendmicro.webserviceclient.generated.HostInterfaceTransport[] hostInterfaces,
           com.trendmicro.webserviceclient.generated.EnumHostLight hostLight,
           java.util.Calendar lastAnitMalwareScheduledScan,
           java.util.Calendar lastAntiMalwareEvent,
           java.util.Calendar lastAntiMalwareManualScan,
           java.util.Calendar lastDpiEvent,
           java.util.Calendar lastFirewallEvent,
           java.lang.String lastIPUsed,
           java.util.Calendar lastIntegrityMonitoringEvent,
           java.util.Calendar lastLogInspectionEvent,
           java.util.Calendar lastWebReputationEvent,
           java.lang.Integer light,
           boolean locked,
           java.lang.String overallAntiMalwareStatus,
           java.lang.String overallDpiStatus,
           java.lang.String overallFirewallStatus,
           java.lang.String overallIntegrityMonitoringStatus,
           java.util.Calendar overallLastRecommendationScan,
           java.util.Calendar overallLastSuccessfulCommunication,
           java.util.Calendar overallLastSuccessfulUpdate,
           java.util.Calendar overallLastUpdateRequired,
           java.lang.String overallLogInspectionStatus,
           java.lang.String overallStatus,
           java.lang.String overallVersion,
           java.lang.String overallWebReputationStatus,
           java.lang.String securityProfileName,
           java.lang.String virtualName,
           java.lang.String virtualUuid) {
        super(
            ID,
            description,
            name,
            displayName,
            external,
            externalID,
            hostGroupID,
            hostType,
            platform,
            securityProfileID);
        this.antiMalwareClassicPatternVersion = antiMalwareClassicPatternVersion;
        this.antiMalwareEngineVersion = antiMalwareEngineVersion;
        this.antiMalwareIntelliTrapExceptionVersion = antiMalwareIntelliTrapExceptionVersion;
        this.antiMalwareIntelliTrapVersion = antiMalwareIntelliTrapVersion;
        this.antiMalwareSmartScanPatternVersion = antiMalwareSmartScanPatternVersion;
        this.antiMalwareSpywarePatternVersion = antiMalwareSpywarePatternVersion;
        this.cloudObjectImageId = cloudObjectImageId;
        this.cloudObjectInstanceId = cloudObjectInstanceId;
        this.cloudObjectInternalUniqueId = cloudObjectInternalUniqueId;
        this.cloudObjectSecurityGroupIds = cloudObjectSecurityGroupIds;
        this.cloudObjectType = cloudObjectType;
        this.componentKlasses = componentKlasses;
        this.componentNames = componentNames;
        this.componentTypes = componentTypes;
        this.componentVersions = componentVersions;
        this.hostGroupName = hostGroupName;
        this.hostInterfaces = hostInterfaces;
        this.hostLight = hostLight;
        this.lastAnitMalwareScheduledScan = lastAnitMalwareScheduledScan;
        this.lastAntiMalwareEvent = lastAntiMalwareEvent;
        this.lastAntiMalwareManualScan = lastAntiMalwareManualScan;
        this.lastDpiEvent = lastDpiEvent;
        this.lastFirewallEvent = lastFirewallEvent;
        this.lastIPUsed = lastIPUsed;
        this.lastIntegrityMonitoringEvent = lastIntegrityMonitoringEvent;
        this.lastLogInspectionEvent = lastLogInspectionEvent;
        this.lastWebReputationEvent = lastWebReputationEvent;
        this.light = light;
        this.locked = locked;
        this.overallAntiMalwareStatus = overallAntiMalwareStatus;
        this.overallDpiStatus = overallDpiStatus;
        this.overallFirewallStatus = overallFirewallStatus;
        this.overallIntegrityMonitoringStatus = overallIntegrityMonitoringStatus;
        this.overallLastRecommendationScan = overallLastRecommendationScan;
        this.overallLastSuccessfulCommunication = overallLastSuccessfulCommunication;
        this.overallLastSuccessfulUpdate = overallLastSuccessfulUpdate;
        this.overallLastUpdateRequired = overallLastUpdateRequired;
        this.overallLogInspectionStatus = overallLogInspectionStatus;
        this.overallStatus = overallStatus;
        this.overallVersion = overallVersion;
        this.overallWebReputationStatus = overallWebReputationStatus;
        this.securityProfileName = securityProfileName;
        this.virtualName = virtualName;
        this.virtualUuid = virtualUuid;
    }


    /**
     * Gets the antiMalwareClassicPatternVersion value for this HostDetailTransport.
     * 
     * @return antiMalwareClassicPatternVersion
     */
    public java.lang.String getAntiMalwareClassicPatternVersion() {
        return antiMalwareClassicPatternVersion;
    }


    /**
     * Sets the antiMalwareClassicPatternVersion value for this HostDetailTransport.
     * 
     * @param antiMalwareClassicPatternVersion
     */
    public void setAntiMalwareClassicPatternVersion(java.lang.String antiMalwareClassicPatternVersion) {
        this.antiMalwareClassicPatternVersion = antiMalwareClassicPatternVersion;
    }


    /**
     * Gets the antiMalwareEngineVersion value for this HostDetailTransport.
     * 
     * @return antiMalwareEngineVersion
     */
    public java.lang.String getAntiMalwareEngineVersion() {
        return antiMalwareEngineVersion;
    }


    /**
     * Sets the antiMalwareEngineVersion value for this HostDetailTransport.
     * 
     * @param antiMalwareEngineVersion
     */
    public void setAntiMalwareEngineVersion(java.lang.String antiMalwareEngineVersion) {
        this.antiMalwareEngineVersion = antiMalwareEngineVersion;
    }


    /**
     * Gets the antiMalwareIntelliTrapExceptionVersion value for this HostDetailTransport.
     * 
     * @return antiMalwareIntelliTrapExceptionVersion
     */
    public java.lang.String getAntiMalwareIntelliTrapExceptionVersion() {
        return antiMalwareIntelliTrapExceptionVersion;
    }


    /**
     * Sets the antiMalwareIntelliTrapExceptionVersion value for this HostDetailTransport.
     * 
     * @param antiMalwareIntelliTrapExceptionVersion
     */
    public void setAntiMalwareIntelliTrapExceptionVersion(java.lang.String antiMalwareIntelliTrapExceptionVersion) {
        this.antiMalwareIntelliTrapExceptionVersion = antiMalwareIntelliTrapExceptionVersion;
    }


    /**
     * Gets the antiMalwareIntelliTrapVersion value for this HostDetailTransport.
     * 
     * @return antiMalwareIntelliTrapVersion
     */
    public java.lang.String getAntiMalwareIntelliTrapVersion() {
        return antiMalwareIntelliTrapVersion;
    }


    /**
     * Sets the antiMalwareIntelliTrapVersion value for this HostDetailTransport.
     * 
     * @param antiMalwareIntelliTrapVersion
     */
    public void setAntiMalwareIntelliTrapVersion(java.lang.String antiMalwareIntelliTrapVersion) {
        this.antiMalwareIntelliTrapVersion = antiMalwareIntelliTrapVersion;
    }


    /**
     * Gets the antiMalwareSmartScanPatternVersion value for this HostDetailTransport.
     * 
     * @return antiMalwareSmartScanPatternVersion
     */
    public java.lang.String getAntiMalwareSmartScanPatternVersion() {
        return antiMalwareSmartScanPatternVersion;
    }


    /**
     * Sets the antiMalwareSmartScanPatternVersion value for this HostDetailTransport.
     * 
     * @param antiMalwareSmartScanPatternVersion
     */
    public void setAntiMalwareSmartScanPatternVersion(java.lang.String antiMalwareSmartScanPatternVersion) {
        this.antiMalwareSmartScanPatternVersion = antiMalwareSmartScanPatternVersion;
    }


    /**
     * Gets the antiMalwareSpywarePatternVersion value for this HostDetailTransport.
     * 
     * @return antiMalwareSpywarePatternVersion
     */
    public java.lang.String getAntiMalwareSpywarePatternVersion() {
        return antiMalwareSpywarePatternVersion;
    }


    /**
     * Sets the antiMalwareSpywarePatternVersion value for this HostDetailTransport.
     * 
     * @param antiMalwareSpywarePatternVersion
     */
    public void setAntiMalwareSpywarePatternVersion(java.lang.String antiMalwareSpywarePatternVersion) {
        this.antiMalwareSpywarePatternVersion = antiMalwareSpywarePatternVersion;
    }


    /**
     * Gets the cloudObjectImageId value for this HostDetailTransport.
     * 
     * @return cloudObjectImageId
     */
    public java.lang.String getCloudObjectImageId() {
        return cloudObjectImageId;
    }


    /**
     * Sets the cloudObjectImageId value for this HostDetailTransport.
     * 
     * @param cloudObjectImageId
     */
    public void setCloudObjectImageId(java.lang.String cloudObjectImageId) {
        this.cloudObjectImageId = cloudObjectImageId;
    }


    /**
     * Gets the cloudObjectInstanceId value for this HostDetailTransport.
     * 
     * @return cloudObjectInstanceId
     */
    public java.lang.String getCloudObjectInstanceId() {
        return cloudObjectInstanceId;
    }


    /**
     * Sets the cloudObjectInstanceId value for this HostDetailTransport.
     * 
     * @param cloudObjectInstanceId
     */
    public void setCloudObjectInstanceId(java.lang.String cloudObjectInstanceId) {
        this.cloudObjectInstanceId = cloudObjectInstanceId;
    }


    /**
     * Gets the cloudObjectInternalUniqueId value for this HostDetailTransport.
     * 
     * @return cloudObjectInternalUniqueId
     */
    public java.lang.String getCloudObjectInternalUniqueId() {
        return cloudObjectInternalUniqueId;
    }


    /**
     * Sets the cloudObjectInternalUniqueId value for this HostDetailTransport.
     * 
     * @param cloudObjectInternalUniqueId
     */
    public void setCloudObjectInternalUniqueId(java.lang.String cloudObjectInternalUniqueId) {
        this.cloudObjectInternalUniqueId = cloudObjectInternalUniqueId;
    }


    /**
     * Gets the cloudObjectSecurityGroupIds value for this HostDetailTransport.
     * 
     * @return cloudObjectSecurityGroupIds
     */
    public java.lang.String getCloudObjectSecurityGroupIds() {
        return cloudObjectSecurityGroupIds;
    }


    /**
     * Sets the cloudObjectSecurityGroupIds value for this HostDetailTransport.
     * 
     * @param cloudObjectSecurityGroupIds
     */
    public void setCloudObjectSecurityGroupIds(java.lang.String cloudObjectSecurityGroupIds) {
        this.cloudObjectSecurityGroupIds = cloudObjectSecurityGroupIds;
    }


    /**
     * Gets the cloudObjectType value for this HostDetailTransport.
     * 
     * @return cloudObjectType
     */
    public com.trendmicro.webserviceclient.generated.EnumCloudObjectType getCloudObjectType() {
        return cloudObjectType;
    }


    /**
     * Sets the cloudObjectType value for this HostDetailTransport.
     * 
     * @param cloudObjectType
     */
    public void setCloudObjectType(com.trendmicro.webserviceclient.generated.EnumCloudObjectType cloudObjectType) {
        this.cloudObjectType = cloudObjectType;
    }


    /**
     * Gets the componentKlasses value for this HostDetailTransport.
     * 
     * @return componentKlasses
     */
    public int[] getComponentKlasses() {
        return componentKlasses;
    }


    /**
     * Sets the componentKlasses value for this HostDetailTransport.
     * 
     * @param componentKlasses
     */
    public void setComponentKlasses(int[] componentKlasses) {
        this.componentKlasses = componentKlasses;
    }


    /**
     * Gets the componentNames value for this HostDetailTransport.
     * 
     * @return componentNames
     */
    public java.lang.String[] getComponentNames() {
        return componentNames;
    }


    /**
     * Sets the componentNames value for this HostDetailTransport.
     * 
     * @param componentNames
     */
    public void setComponentNames(java.lang.String[] componentNames) {
        this.componentNames = componentNames;
    }


    /**
     * Gets the componentTypes value for this HostDetailTransport.
     * 
     * @return componentTypes
     */
    public int[] getComponentTypes() {
        return componentTypes;
    }


    /**
     * Sets the componentTypes value for this HostDetailTransport.
     * 
     * @param componentTypes
     */
    public void setComponentTypes(int[] componentTypes) {
        this.componentTypes = componentTypes;
    }


    /**
     * Gets the componentVersions value for this HostDetailTransport.
     * 
     * @return componentVersions
     */
    public java.lang.String[] getComponentVersions() {
        return componentVersions;
    }


    /**
     * Sets the componentVersions value for this HostDetailTransport.
     * 
     * @param componentVersions
     */
    public void setComponentVersions(java.lang.String[] componentVersions) {
        this.componentVersions = componentVersions;
    }


    /**
     * Gets the hostGroupName value for this HostDetailTransport.
     * 
     * @return hostGroupName
     */
    public java.lang.String getHostGroupName() {
        return hostGroupName;
    }


    /**
     * Sets the hostGroupName value for this HostDetailTransport.
     * 
     * @param hostGroupName
     */
    public void setHostGroupName(java.lang.String hostGroupName) {
        this.hostGroupName = hostGroupName;
    }


    /**
     * Gets the hostInterfaces value for this HostDetailTransport.
     * 
     * @return hostInterfaces
     */
    public com.trendmicro.webserviceclient.generated.HostInterfaceTransport[] getHostInterfaces() {
        return hostInterfaces;
    }


    /**
     * Sets the hostInterfaces value for this HostDetailTransport.
     * 
     * @param hostInterfaces
     */
    public void setHostInterfaces(com.trendmicro.webserviceclient.generated.HostInterfaceTransport[] hostInterfaces) {
        this.hostInterfaces = hostInterfaces;
    }


    /**
     * Gets the hostLight value for this HostDetailTransport.
     * 
     * @return hostLight
     */
    public com.trendmicro.webserviceclient.generated.EnumHostLight getHostLight() {
        return hostLight;
    }


    /**
     * Sets the hostLight value for this HostDetailTransport.
     * 
     * @param hostLight
     */
    public void setHostLight(com.trendmicro.webserviceclient.generated.EnumHostLight hostLight) {
        this.hostLight = hostLight;
    }


    /**
     * Gets the lastAnitMalwareScheduledScan value for this HostDetailTransport.
     * 
     * @return lastAnitMalwareScheduledScan
     */
    public java.util.Calendar getLastAnitMalwareScheduledScan() {
        return lastAnitMalwareScheduledScan;
    }


    /**
     * Sets the lastAnitMalwareScheduledScan value for this HostDetailTransport.
     * 
     * @param lastAnitMalwareScheduledScan
     */
    public void setLastAnitMalwareScheduledScan(java.util.Calendar lastAnitMalwareScheduledScan) {
        this.lastAnitMalwareScheduledScan = lastAnitMalwareScheduledScan;
    }


    /**
     * Gets the lastAntiMalwareEvent value for this HostDetailTransport.
     * 
     * @return lastAntiMalwareEvent
     */
    public java.util.Calendar getLastAntiMalwareEvent() {
        return lastAntiMalwareEvent;
    }


    /**
     * Sets the lastAntiMalwareEvent value for this HostDetailTransport.
     * 
     * @param lastAntiMalwareEvent
     */
    public void setLastAntiMalwareEvent(java.util.Calendar lastAntiMalwareEvent) {
        this.lastAntiMalwareEvent = lastAntiMalwareEvent;
    }


    /**
     * Gets the lastAntiMalwareManualScan value for this HostDetailTransport.
     * 
     * @return lastAntiMalwareManualScan
     */
    public java.util.Calendar getLastAntiMalwareManualScan() {
        return lastAntiMalwareManualScan;
    }


    /**
     * Sets the lastAntiMalwareManualScan value for this HostDetailTransport.
     * 
     * @param lastAntiMalwareManualScan
     */
    public void setLastAntiMalwareManualScan(java.util.Calendar lastAntiMalwareManualScan) {
        this.lastAntiMalwareManualScan = lastAntiMalwareManualScan;
    }


    /**
     * Gets the lastDpiEvent value for this HostDetailTransport.
     * 
     * @return lastDpiEvent
     */
    public java.util.Calendar getLastDpiEvent() {
        return lastDpiEvent;
    }


    /**
     * Sets the lastDpiEvent value for this HostDetailTransport.
     * 
     * @param lastDpiEvent
     */
    public void setLastDpiEvent(java.util.Calendar lastDpiEvent) {
        this.lastDpiEvent = lastDpiEvent;
    }


    /**
     * Gets the lastFirewallEvent value for this HostDetailTransport.
     * 
     * @return lastFirewallEvent
     */
    public java.util.Calendar getLastFirewallEvent() {
        return lastFirewallEvent;
    }


    /**
     * Sets the lastFirewallEvent value for this HostDetailTransport.
     * 
     * @param lastFirewallEvent
     */
    public void setLastFirewallEvent(java.util.Calendar lastFirewallEvent) {
        this.lastFirewallEvent = lastFirewallEvent;
    }


    /**
     * Gets the lastIPUsed value for this HostDetailTransport.
     * 
     * @return lastIPUsed
     */
    public java.lang.String getLastIPUsed() {
        return lastIPUsed;
    }


    /**
     * Sets the lastIPUsed value for this HostDetailTransport.
     * 
     * @param lastIPUsed
     */
    public void setLastIPUsed(java.lang.String lastIPUsed) {
        this.lastIPUsed = lastIPUsed;
    }


    /**
     * Gets the lastIntegrityMonitoringEvent value for this HostDetailTransport.
     * 
     * @return lastIntegrityMonitoringEvent
     */
    public java.util.Calendar getLastIntegrityMonitoringEvent() {
        return lastIntegrityMonitoringEvent;
    }


    /**
     * Sets the lastIntegrityMonitoringEvent value for this HostDetailTransport.
     * 
     * @param lastIntegrityMonitoringEvent
     */
    public void setLastIntegrityMonitoringEvent(java.util.Calendar lastIntegrityMonitoringEvent) {
        this.lastIntegrityMonitoringEvent = lastIntegrityMonitoringEvent;
    }


    /**
     * Gets the lastLogInspectionEvent value for this HostDetailTransport.
     * 
     * @return lastLogInspectionEvent
     */
    public java.util.Calendar getLastLogInspectionEvent() {
        return lastLogInspectionEvent;
    }


    /**
     * Sets the lastLogInspectionEvent value for this HostDetailTransport.
     * 
     * @param lastLogInspectionEvent
     */
    public void setLastLogInspectionEvent(java.util.Calendar lastLogInspectionEvent) {
        this.lastLogInspectionEvent = lastLogInspectionEvent;
    }


    /**
     * Gets the lastWebReputationEvent value for this HostDetailTransport.
     * 
     * @return lastWebReputationEvent
     */
    public java.util.Calendar getLastWebReputationEvent() {
        return lastWebReputationEvent;
    }


    /**
     * Sets the lastWebReputationEvent value for this HostDetailTransport.
     * 
     * @param lastWebReputationEvent
     */
    public void setLastWebReputationEvent(java.util.Calendar lastWebReputationEvent) {
        this.lastWebReputationEvent = lastWebReputationEvent;
    }


    /**
     * Gets the light value for this HostDetailTransport.
     * 
     * @return light
     */
    public java.lang.Integer getLight() {
        return light;
    }


    /**
     * Sets the light value for this HostDetailTransport.
     * 
     * @param light
     */
    public void setLight(java.lang.Integer light) {
        this.light = light;
    }


    /**
     * Gets the locked value for this HostDetailTransport.
     * 
     * @return locked
     */
    public boolean isLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this HostDetailTransport.
     * 
     * @param locked
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }


    /**
     * Gets the overallAntiMalwareStatus value for this HostDetailTransport.
     * 
     * @return overallAntiMalwareStatus
     */
    public java.lang.String getOverallAntiMalwareStatus() {
        return overallAntiMalwareStatus;
    }


    /**
     * Sets the overallAntiMalwareStatus value for this HostDetailTransport.
     * 
     * @param overallAntiMalwareStatus
     */
    public void setOverallAntiMalwareStatus(java.lang.String overallAntiMalwareStatus) {
        this.overallAntiMalwareStatus = overallAntiMalwareStatus;
    }


    /**
     * Gets the overallDpiStatus value for this HostDetailTransport.
     * 
     * @return overallDpiStatus
     */
    public java.lang.String getOverallDpiStatus() {
        return overallDpiStatus;
    }


    /**
     * Sets the overallDpiStatus value for this HostDetailTransport.
     * 
     * @param overallDpiStatus
     */
    public void setOverallDpiStatus(java.lang.String overallDpiStatus) {
        this.overallDpiStatus = overallDpiStatus;
    }


    /**
     * Gets the overallFirewallStatus value for this HostDetailTransport.
     * 
     * @return overallFirewallStatus
     */
    public java.lang.String getOverallFirewallStatus() {
        return overallFirewallStatus;
    }


    /**
     * Sets the overallFirewallStatus value for this HostDetailTransport.
     * 
     * @param overallFirewallStatus
     */
    public void setOverallFirewallStatus(java.lang.String overallFirewallStatus) {
        this.overallFirewallStatus = overallFirewallStatus;
    }


    /**
     * Gets the overallIntegrityMonitoringStatus value for this HostDetailTransport.
     * 
     * @return overallIntegrityMonitoringStatus
     */
    public java.lang.String getOverallIntegrityMonitoringStatus() {
        return overallIntegrityMonitoringStatus;
    }


    /**
     * Sets the overallIntegrityMonitoringStatus value for this HostDetailTransport.
     * 
     * @param overallIntegrityMonitoringStatus
     */
    public void setOverallIntegrityMonitoringStatus(java.lang.String overallIntegrityMonitoringStatus) {
        this.overallIntegrityMonitoringStatus = overallIntegrityMonitoringStatus;
    }


    /**
     * Gets the overallLastRecommendationScan value for this HostDetailTransport.
     * 
     * @return overallLastRecommendationScan
     */
    public java.util.Calendar getOverallLastRecommendationScan() {
        return overallLastRecommendationScan;
    }


    /**
     * Sets the overallLastRecommendationScan value for this HostDetailTransport.
     * 
     * @param overallLastRecommendationScan
     */
    public void setOverallLastRecommendationScan(java.util.Calendar overallLastRecommendationScan) {
        this.overallLastRecommendationScan = overallLastRecommendationScan;
    }


    /**
     * Gets the overallLastSuccessfulCommunication value for this HostDetailTransport.
     * 
     * @return overallLastSuccessfulCommunication
     */
    public java.util.Calendar getOverallLastSuccessfulCommunication() {
        return overallLastSuccessfulCommunication;
    }


    /**
     * Sets the overallLastSuccessfulCommunication value for this HostDetailTransport.
     * 
     * @param overallLastSuccessfulCommunication
     */
    public void setOverallLastSuccessfulCommunication(java.util.Calendar overallLastSuccessfulCommunication) {
        this.overallLastSuccessfulCommunication = overallLastSuccessfulCommunication;
    }


    /**
     * Gets the overallLastSuccessfulUpdate value for this HostDetailTransport.
     * 
     * @return overallLastSuccessfulUpdate
     */
    public java.util.Calendar getOverallLastSuccessfulUpdate() {
        return overallLastSuccessfulUpdate;
    }


    /**
     * Sets the overallLastSuccessfulUpdate value for this HostDetailTransport.
     * 
     * @param overallLastSuccessfulUpdate
     */
    public void setOverallLastSuccessfulUpdate(java.util.Calendar overallLastSuccessfulUpdate) {
        this.overallLastSuccessfulUpdate = overallLastSuccessfulUpdate;
    }


    /**
     * Gets the overallLastUpdateRequired value for this HostDetailTransport.
     * 
     * @return overallLastUpdateRequired
     */
    public java.util.Calendar getOverallLastUpdateRequired() {
        return overallLastUpdateRequired;
    }


    /**
     * Sets the overallLastUpdateRequired value for this HostDetailTransport.
     * 
     * @param overallLastUpdateRequired
     */
    public void setOverallLastUpdateRequired(java.util.Calendar overallLastUpdateRequired) {
        this.overallLastUpdateRequired = overallLastUpdateRequired;
    }


    /**
     * Gets the overallLogInspectionStatus value for this HostDetailTransport.
     * 
     * @return overallLogInspectionStatus
     */
    public java.lang.String getOverallLogInspectionStatus() {
        return overallLogInspectionStatus;
    }


    /**
     * Sets the overallLogInspectionStatus value for this HostDetailTransport.
     * 
     * @param overallLogInspectionStatus
     */
    public void setOverallLogInspectionStatus(java.lang.String overallLogInspectionStatus) {
        this.overallLogInspectionStatus = overallLogInspectionStatus;
    }


    /**
     * Gets the overallStatus value for this HostDetailTransport.
     * 
     * @return overallStatus
     */
    public java.lang.String getOverallStatus() {
        return overallStatus;
    }


    /**
     * Sets the overallStatus value for this HostDetailTransport.
     * 
     * @param overallStatus
     */
    public void setOverallStatus(java.lang.String overallStatus) {
        this.overallStatus = overallStatus;
    }


    /**
     * Gets the overallVersion value for this HostDetailTransport.
     * 
     * @return overallVersion
     */
    public java.lang.String getOverallVersion() {
        return overallVersion;
    }


    /**
     * Sets the overallVersion value for this HostDetailTransport.
     * 
     * @param overallVersion
     */
    public void setOverallVersion(java.lang.String overallVersion) {
        this.overallVersion = overallVersion;
    }


    /**
     * Gets the overallWebReputationStatus value for this HostDetailTransport.
     * 
     * @return overallWebReputationStatus
     */
    public java.lang.String getOverallWebReputationStatus() {
        return overallWebReputationStatus;
    }


    /**
     * Sets the overallWebReputationStatus value for this HostDetailTransport.
     * 
     * @param overallWebReputationStatus
     */
    public void setOverallWebReputationStatus(java.lang.String overallWebReputationStatus) {
        this.overallWebReputationStatus = overallWebReputationStatus;
    }


    /**
     * Gets the securityProfileName value for this HostDetailTransport.
     * 
     * @return securityProfileName
     */
    public java.lang.String getSecurityProfileName() {
        return securityProfileName;
    }


    /**
     * Sets the securityProfileName value for this HostDetailTransport.
     * 
     * @param securityProfileName
     */
    public void setSecurityProfileName(java.lang.String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }


    /**
     * Gets the virtualName value for this HostDetailTransport.
     * 
     * @return virtualName
     */
    public java.lang.String getVirtualName() {
        return virtualName;
    }


    /**
     * Sets the virtualName value for this HostDetailTransport.
     * 
     * @param virtualName
     */
    public void setVirtualName(java.lang.String virtualName) {
        this.virtualName = virtualName;
    }


    /**
     * Gets the virtualUuid value for this HostDetailTransport.
     * 
     * @return virtualUuid
     */
    public java.lang.String getVirtualUuid() {
        return virtualUuid;
    }


    /**
     * Sets the virtualUuid value for this HostDetailTransport.
     * 
     * @param virtualUuid
     */
    public void setVirtualUuid(java.lang.String virtualUuid) {
        this.virtualUuid = virtualUuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDetailTransport)) return false;
        HostDetailTransport other = (HostDetailTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.antiMalwareClassicPatternVersion==null && other.getAntiMalwareClassicPatternVersion()==null) || 
             (this.antiMalwareClassicPatternVersion!=null &&
              this.antiMalwareClassicPatternVersion.equals(other.getAntiMalwareClassicPatternVersion()))) &&
            ((this.antiMalwareEngineVersion==null && other.getAntiMalwareEngineVersion()==null) || 
             (this.antiMalwareEngineVersion!=null &&
              this.antiMalwareEngineVersion.equals(other.getAntiMalwareEngineVersion()))) &&
            ((this.antiMalwareIntelliTrapExceptionVersion==null && other.getAntiMalwareIntelliTrapExceptionVersion()==null) || 
             (this.antiMalwareIntelliTrapExceptionVersion!=null &&
              this.antiMalwareIntelliTrapExceptionVersion.equals(other.getAntiMalwareIntelliTrapExceptionVersion()))) &&
            ((this.antiMalwareIntelliTrapVersion==null && other.getAntiMalwareIntelliTrapVersion()==null) || 
             (this.antiMalwareIntelliTrapVersion!=null &&
              this.antiMalwareIntelliTrapVersion.equals(other.getAntiMalwareIntelliTrapVersion()))) &&
            ((this.antiMalwareSmartScanPatternVersion==null && other.getAntiMalwareSmartScanPatternVersion()==null) || 
             (this.antiMalwareSmartScanPatternVersion!=null &&
              this.antiMalwareSmartScanPatternVersion.equals(other.getAntiMalwareSmartScanPatternVersion()))) &&
            ((this.antiMalwareSpywarePatternVersion==null && other.getAntiMalwareSpywarePatternVersion()==null) || 
             (this.antiMalwareSpywarePatternVersion!=null &&
              this.antiMalwareSpywarePatternVersion.equals(other.getAntiMalwareSpywarePatternVersion()))) &&
            ((this.cloudObjectImageId==null && other.getCloudObjectImageId()==null) || 
             (this.cloudObjectImageId!=null &&
              this.cloudObjectImageId.equals(other.getCloudObjectImageId()))) &&
            ((this.cloudObjectInstanceId==null && other.getCloudObjectInstanceId()==null) || 
             (this.cloudObjectInstanceId!=null &&
              this.cloudObjectInstanceId.equals(other.getCloudObjectInstanceId()))) &&
            ((this.cloudObjectInternalUniqueId==null && other.getCloudObjectInternalUniqueId()==null) || 
             (this.cloudObjectInternalUniqueId!=null &&
              this.cloudObjectInternalUniqueId.equals(other.getCloudObjectInternalUniqueId()))) &&
            ((this.cloudObjectSecurityGroupIds==null && other.getCloudObjectSecurityGroupIds()==null) || 
             (this.cloudObjectSecurityGroupIds!=null &&
              this.cloudObjectSecurityGroupIds.equals(other.getCloudObjectSecurityGroupIds()))) &&
            ((this.cloudObjectType==null && other.getCloudObjectType()==null) || 
             (this.cloudObjectType!=null &&
              this.cloudObjectType.equals(other.getCloudObjectType()))) &&
            ((this.componentKlasses==null && other.getComponentKlasses()==null) || 
             (this.componentKlasses!=null &&
              java.util.Arrays.equals(this.componentKlasses, other.getComponentKlasses()))) &&
            ((this.componentNames==null && other.getComponentNames()==null) || 
             (this.componentNames!=null &&
              java.util.Arrays.equals(this.componentNames, other.getComponentNames()))) &&
            ((this.componentTypes==null && other.getComponentTypes()==null) || 
             (this.componentTypes!=null &&
              java.util.Arrays.equals(this.componentTypes, other.getComponentTypes()))) &&
            ((this.componentVersions==null && other.getComponentVersions()==null) || 
             (this.componentVersions!=null &&
              java.util.Arrays.equals(this.componentVersions, other.getComponentVersions()))) &&
            ((this.hostGroupName==null && other.getHostGroupName()==null) || 
             (this.hostGroupName!=null &&
              this.hostGroupName.equals(other.getHostGroupName()))) &&
            ((this.hostInterfaces==null && other.getHostInterfaces()==null) || 
             (this.hostInterfaces!=null &&
              java.util.Arrays.equals(this.hostInterfaces, other.getHostInterfaces()))) &&
            ((this.hostLight==null && other.getHostLight()==null) || 
             (this.hostLight!=null &&
              this.hostLight.equals(other.getHostLight()))) &&
            ((this.lastAnitMalwareScheduledScan==null && other.getLastAnitMalwareScheduledScan()==null) || 
             (this.lastAnitMalwareScheduledScan!=null &&
              this.lastAnitMalwareScheduledScan.equals(other.getLastAnitMalwareScheduledScan()))) &&
            ((this.lastAntiMalwareEvent==null && other.getLastAntiMalwareEvent()==null) || 
             (this.lastAntiMalwareEvent!=null &&
              this.lastAntiMalwareEvent.equals(other.getLastAntiMalwareEvent()))) &&
            ((this.lastAntiMalwareManualScan==null && other.getLastAntiMalwareManualScan()==null) || 
             (this.lastAntiMalwareManualScan!=null &&
              this.lastAntiMalwareManualScan.equals(other.getLastAntiMalwareManualScan()))) &&
            ((this.lastDpiEvent==null && other.getLastDpiEvent()==null) || 
             (this.lastDpiEvent!=null &&
              this.lastDpiEvent.equals(other.getLastDpiEvent()))) &&
            ((this.lastFirewallEvent==null && other.getLastFirewallEvent()==null) || 
             (this.lastFirewallEvent!=null &&
              this.lastFirewallEvent.equals(other.getLastFirewallEvent()))) &&
            ((this.lastIPUsed==null && other.getLastIPUsed()==null) || 
             (this.lastIPUsed!=null &&
              this.lastIPUsed.equals(other.getLastIPUsed()))) &&
            ((this.lastIntegrityMonitoringEvent==null && other.getLastIntegrityMonitoringEvent()==null) || 
             (this.lastIntegrityMonitoringEvent!=null &&
              this.lastIntegrityMonitoringEvent.equals(other.getLastIntegrityMonitoringEvent()))) &&
            ((this.lastLogInspectionEvent==null && other.getLastLogInspectionEvent()==null) || 
             (this.lastLogInspectionEvent!=null &&
              this.lastLogInspectionEvent.equals(other.getLastLogInspectionEvent()))) &&
            ((this.lastWebReputationEvent==null && other.getLastWebReputationEvent()==null) || 
             (this.lastWebReputationEvent!=null &&
              this.lastWebReputationEvent.equals(other.getLastWebReputationEvent()))) &&
            ((this.light==null && other.getLight()==null) || 
             (this.light!=null &&
              this.light.equals(other.getLight()))) &&
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
            ((this.overallLastRecommendationScan==null && other.getOverallLastRecommendationScan()==null) || 
             (this.overallLastRecommendationScan!=null &&
              this.overallLastRecommendationScan.equals(other.getOverallLastRecommendationScan()))) &&
            ((this.overallLastSuccessfulCommunication==null && other.getOverallLastSuccessfulCommunication()==null) || 
             (this.overallLastSuccessfulCommunication!=null &&
              this.overallLastSuccessfulCommunication.equals(other.getOverallLastSuccessfulCommunication()))) &&
            ((this.overallLastSuccessfulUpdate==null && other.getOverallLastSuccessfulUpdate()==null) || 
             (this.overallLastSuccessfulUpdate!=null &&
              this.overallLastSuccessfulUpdate.equals(other.getOverallLastSuccessfulUpdate()))) &&
            ((this.overallLastUpdateRequired==null && other.getOverallLastUpdateRequired()==null) || 
             (this.overallLastUpdateRequired!=null &&
              this.overallLastUpdateRequired.equals(other.getOverallLastUpdateRequired()))) &&
            ((this.overallLogInspectionStatus==null && other.getOverallLogInspectionStatus()==null) || 
             (this.overallLogInspectionStatus!=null &&
              this.overallLogInspectionStatus.equals(other.getOverallLogInspectionStatus()))) &&
            ((this.overallStatus==null && other.getOverallStatus()==null) || 
             (this.overallStatus!=null &&
              this.overallStatus.equals(other.getOverallStatus()))) &&
            ((this.overallVersion==null && other.getOverallVersion()==null) || 
             (this.overallVersion!=null &&
              this.overallVersion.equals(other.getOverallVersion()))) &&
            ((this.overallWebReputationStatus==null && other.getOverallWebReputationStatus()==null) || 
             (this.overallWebReputationStatus!=null &&
              this.overallWebReputationStatus.equals(other.getOverallWebReputationStatus()))) &&
            ((this.securityProfileName==null && other.getSecurityProfileName()==null) || 
             (this.securityProfileName!=null &&
              this.securityProfileName.equals(other.getSecurityProfileName()))) &&
            ((this.virtualName==null && other.getVirtualName()==null) || 
             (this.virtualName!=null &&
              this.virtualName.equals(other.getVirtualName()))) &&
            ((this.virtualUuid==null && other.getVirtualUuid()==null) || 
             (this.virtualUuid!=null &&
              this.virtualUuid.equals(other.getVirtualUuid())));
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
        if (getAntiMalwareClassicPatternVersion() != null) {
            _hashCode += getAntiMalwareClassicPatternVersion().hashCode();
        }
        if (getAntiMalwareEngineVersion() != null) {
            _hashCode += getAntiMalwareEngineVersion().hashCode();
        }
        if (getAntiMalwareIntelliTrapExceptionVersion() != null) {
            _hashCode += getAntiMalwareIntelliTrapExceptionVersion().hashCode();
        }
        if (getAntiMalwareIntelliTrapVersion() != null) {
            _hashCode += getAntiMalwareIntelliTrapVersion().hashCode();
        }
        if (getAntiMalwareSmartScanPatternVersion() != null) {
            _hashCode += getAntiMalwareSmartScanPatternVersion().hashCode();
        }
        if (getAntiMalwareSpywarePatternVersion() != null) {
            _hashCode += getAntiMalwareSpywarePatternVersion().hashCode();
        }
        if (getCloudObjectImageId() != null) {
            _hashCode += getCloudObjectImageId().hashCode();
        }
        if (getCloudObjectInstanceId() != null) {
            _hashCode += getCloudObjectInstanceId().hashCode();
        }
        if (getCloudObjectInternalUniqueId() != null) {
            _hashCode += getCloudObjectInternalUniqueId().hashCode();
        }
        if (getCloudObjectSecurityGroupIds() != null) {
            _hashCode += getCloudObjectSecurityGroupIds().hashCode();
        }
        if (getCloudObjectType() != null) {
            _hashCode += getCloudObjectType().hashCode();
        }
        if (getComponentKlasses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentKlasses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentKlasses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHostGroupName() != null) {
            _hashCode += getHostGroupName().hashCode();
        }
        if (getHostInterfaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostInterfaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostInterfaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHostLight() != null) {
            _hashCode += getHostLight().hashCode();
        }
        if (getLastAnitMalwareScheduledScan() != null) {
            _hashCode += getLastAnitMalwareScheduledScan().hashCode();
        }
        if (getLastAntiMalwareEvent() != null) {
            _hashCode += getLastAntiMalwareEvent().hashCode();
        }
        if (getLastAntiMalwareManualScan() != null) {
            _hashCode += getLastAntiMalwareManualScan().hashCode();
        }
        if (getLastDpiEvent() != null) {
            _hashCode += getLastDpiEvent().hashCode();
        }
        if (getLastFirewallEvent() != null) {
            _hashCode += getLastFirewallEvent().hashCode();
        }
        if (getLastIPUsed() != null) {
            _hashCode += getLastIPUsed().hashCode();
        }
        if (getLastIntegrityMonitoringEvent() != null) {
            _hashCode += getLastIntegrityMonitoringEvent().hashCode();
        }
        if (getLastLogInspectionEvent() != null) {
            _hashCode += getLastLogInspectionEvent().hashCode();
        }
        if (getLastWebReputationEvent() != null) {
            _hashCode += getLastWebReputationEvent().hashCode();
        }
        if (getLight() != null) {
            _hashCode += getLight().hashCode();
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
        if (getOverallLastRecommendationScan() != null) {
            _hashCode += getOverallLastRecommendationScan().hashCode();
        }
        if (getOverallLastSuccessfulCommunication() != null) {
            _hashCode += getOverallLastSuccessfulCommunication().hashCode();
        }
        if (getOverallLastSuccessfulUpdate() != null) {
            _hashCode += getOverallLastSuccessfulUpdate().hashCode();
        }
        if (getOverallLastUpdateRequired() != null) {
            _hashCode += getOverallLastUpdateRequired().hashCode();
        }
        if (getOverallLogInspectionStatus() != null) {
            _hashCode += getOverallLogInspectionStatus().hashCode();
        }
        if (getOverallStatus() != null) {
            _hashCode += getOverallStatus().hashCode();
        }
        if (getOverallVersion() != null) {
            _hashCode += getOverallVersion().hashCode();
        }
        if (getOverallWebReputationStatus() != null) {
            _hashCode += getOverallWebReputationStatus().hashCode();
        }
        if (getSecurityProfileName() != null) {
            _hashCode += getSecurityProfileName().hashCode();
        }
        if (getVirtualName() != null) {
            _hashCode += getVirtualName().hashCode();
        }
        if (getVirtualUuid() != null) {
            _hashCode += getVirtualUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDetailTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostDetailTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareClassicPatternVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareClassicPatternVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareEngineVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareEngineVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareIntelliTrapExceptionVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareIntelliTrapExceptionVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareIntelliTrapVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareIntelliTrapVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareSmartScanPatternVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareSmartScanPatternVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiMalwareSpywarePatternVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "antiMalwareSpywarePatternVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloudObjectImageId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "cloudObjectImageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloudObjectInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "cloudObjectInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloudObjectInternalUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "cloudObjectInternalUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloudObjectSecurityGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "cloudObjectSecurityGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloudObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "cloudObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumCloudObjectType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentKlasses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "componentKlasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "componentNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "componentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "componentVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostInterfaces");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostInterfaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "HostInterfaceTransport"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Manager", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostLight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostLight"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumHostLight"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAnitMalwareScheduledScan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastAnitMalwareScheduledScan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAntiMalwareEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastAntiMalwareEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAntiMalwareManualScan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastAntiMalwareManualScan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDpiEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastDpiEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFirewallEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastFirewallEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastIPUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastIPUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastIntegrityMonitoringEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastIntegrityMonitoringEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLogInspectionEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastLogInspectionEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWebReputationEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lastWebReputationEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("light");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "light"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("overallLastRecommendationScan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallLastRecommendationScan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("overallLastUpdateRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallLastUpdateRequired"));
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
        elemField.setFieldName("overallVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallWebReputationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "overallWebReputationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityProfileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "securityProfileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "virtualName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "virtualUuid"));
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
