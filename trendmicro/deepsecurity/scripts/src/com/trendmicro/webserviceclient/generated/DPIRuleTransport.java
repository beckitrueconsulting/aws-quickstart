/**
 * DPIRuleTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class DPIRuleTransport  extends com.trendmicro.webserviceclient.generated.ConfigurationTransport  implements java.io.Serializable {
    private java.lang.String TBUID;

    private java.lang.Integer applicationTypeID;

    private boolean authoritative;

    private double cvssScore;

    private boolean detectOnly;

    private boolean disableEvent;

    private boolean eventOnPacketDrop;

    private boolean eventOnPacketModify;

    private java.lang.String identifier;

    private boolean ignoreRecommendations;

    private boolean includePacketData;

    private java.util.Calendar issued;

    private com.trendmicro.webserviceclient.generated.EnumDPIRuleAction patternAction;

    private boolean patternCaseSensitive;

    private java.lang.String patternEnd;

    private com.trendmicro.webserviceclient.generated.EnumDPIRuleIf patternIf;

    private java.lang.String patternPatterns;

    private java.lang.String patternStart;

    private com.trendmicro.webserviceclient.generated.EnumDPIRulePriority priority;

    private boolean raiseAlert;

    private java.lang.String ruleXML;

    private java.lang.Integer scheduleID;

    private com.trendmicro.webserviceclient.generated.EnumDPIRuleSeverity severity;

    private com.trendmicro.webserviceclient.generated.EnumDPIRuleAction signatureAction;

    private boolean signatureCaseSensitive;

    private java.lang.String signatureSignature;

    private com.trendmicro.webserviceclient.generated.EnumDPIRuleTemplateType templateType;

    private java.lang.String cveNumbers;

    private java.lang.String msNumbers;

    public DPIRuleTransport() {
    }

    public DPIRuleTransport(
           java.lang.Integer ID,
           java.lang.String description,
           java.lang.String name,
           java.lang.String TBUID,
           java.lang.Integer applicationTypeID,
           boolean authoritative,
           double cvssScore,
           boolean detectOnly,
           boolean disableEvent,
           boolean eventOnPacketDrop,
           boolean eventOnPacketModify,
           java.lang.String identifier,
           boolean ignoreRecommendations,
           boolean includePacketData,
           java.util.Calendar issued,
           com.trendmicro.webserviceclient.generated.EnumDPIRuleAction patternAction,
           boolean patternCaseSensitive,
           java.lang.String patternEnd,
           com.trendmicro.webserviceclient.generated.EnumDPIRuleIf patternIf,
           java.lang.String patternPatterns,
           java.lang.String patternStart,
           com.trendmicro.webserviceclient.generated.EnumDPIRulePriority priority,
           boolean raiseAlert,
           java.lang.String ruleXML,
           java.lang.Integer scheduleID,
           com.trendmicro.webserviceclient.generated.EnumDPIRuleSeverity severity,
           com.trendmicro.webserviceclient.generated.EnumDPIRuleAction signatureAction,
           boolean signatureCaseSensitive,
           java.lang.String signatureSignature,
           com.trendmicro.webserviceclient.generated.EnumDPIRuleTemplateType templateType,
           java.lang.String cveNumbers,
           java.lang.String msNumbers) {
        super(
            ID,
            description,
            name);
        this.TBUID = TBUID;
        this.applicationTypeID = applicationTypeID;
        this.authoritative = authoritative;
        this.cvssScore = cvssScore;
        this.detectOnly = detectOnly;
        this.disableEvent = disableEvent;
        this.eventOnPacketDrop = eventOnPacketDrop;
        this.eventOnPacketModify = eventOnPacketModify;
        this.identifier = identifier;
        this.ignoreRecommendations = ignoreRecommendations;
        this.includePacketData = includePacketData;
        this.issued = issued;
        this.patternAction = patternAction;
        this.patternCaseSensitive = patternCaseSensitive;
        this.patternEnd = patternEnd;
        this.patternIf = patternIf;
        this.patternPatterns = patternPatterns;
        this.patternStart = patternStart;
        this.priority = priority;
        this.raiseAlert = raiseAlert;
        this.ruleXML = ruleXML;
        this.scheduleID = scheduleID;
        this.severity = severity;
        this.signatureAction = signatureAction;
        this.signatureCaseSensitive = signatureCaseSensitive;
        this.signatureSignature = signatureSignature;
        this.templateType = templateType;
        this.cveNumbers = cveNumbers;
        this.msNumbers = msNumbers;
    }


    /**
     * Gets the TBUID value for this DPIRuleTransport.
     * 
     * @return TBUID
     */
    public java.lang.String getTBUID() {
        return TBUID;
    }


    /**
     * Sets the TBUID value for this DPIRuleTransport.
     * 
     * @param TBUID
     */
    public void setTBUID(java.lang.String TBUID) {
        this.TBUID = TBUID;
    }


    /**
     * Gets the applicationTypeID value for this DPIRuleTransport.
     * 
     * @return applicationTypeID
     */
    public java.lang.Integer getApplicationTypeID() {
        return applicationTypeID;
    }


    /**
     * Sets the applicationTypeID value for this DPIRuleTransport.
     * 
     * @param applicationTypeID
     */
    public void setApplicationTypeID(java.lang.Integer applicationTypeID) {
        this.applicationTypeID = applicationTypeID;
    }


    /**
     * Gets the authoritative value for this DPIRuleTransport.
     * 
     * @return authoritative
     */
    public boolean isAuthoritative() {
        return authoritative;
    }


    /**
     * Sets the authoritative value for this DPIRuleTransport.
     * 
     * @param authoritative
     */
    public void setAuthoritative(boolean authoritative) {
        this.authoritative = authoritative;
    }


    /**
     * Gets the cvssScore value for this DPIRuleTransport.
     * 
     * @return cvssScore
     */
    public double getCvssScore() {
        return cvssScore;
    }


    /**
     * Sets the cvssScore value for this DPIRuleTransport.
     * 
     * @param cvssScore
     */
    public void setCvssScore(double cvssScore) {
        this.cvssScore = cvssScore;
    }


    /**
     * Gets the detectOnly value for this DPIRuleTransport.
     * 
     * @return detectOnly
     */
    public boolean isDetectOnly() {
        return detectOnly;
    }


    /**
     * Sets the detectOnly value for this DPIRuleTransport.
     * 
     * @param detectOnly
     */
    public void setDetectOnly(boolean detectOnly) {
        this.detectOnly = detectOnly;
    }


    /**
     * Gets the disableEvent value for this DPIRuleTransport.
     * 
     * @return disableEvent
     */
    public boolean isDisableEvent() {
        return disableEvent;
    }


    /**
     * Sets the disableEvent value for this DPIRuleTransport.
     * 
     * @param disableEvent
     */
    public void setDisableEvent(boolean disableEvent) {
        this.disableEvent = disableEvent;
    }


    /**
     * Gets the eventOnPacketDrop value for this DPIRuleTransport.
     * 
     * @return eventOnPacketDrop
     */
    public boolean isEventOnPacketDrop() {
        return eventOnPacketDrop;
    }


    /**
     * Sets the eventOnPacketDrop value for this DPIRuleTransport.
     * 
     * @param eventOnPacketDrop
     */
    public void setEventOnPacketDrop(boolean eventOnPacketDrop) {
        this.eventOnPacketDrop = eventOnPacketDrop;
    }


    /**
     * Gets the eventOnPacketModify value for this DPIRuleTransport.
     * 
     * @return eventOnPacketModify
     */
    public boolean isEventOnPacketModify() {
        return eventOnPacketModify;
    }


    /**
     * Sets the eventOnPacketModify value for this DPIRuleTransport.
     * 
     * @param eventOnPacketModify
     */
    public void setEventOnPacketModify(boolean eventOnPacketModify) {
        this.eventOnPacketModify = eventOnPacketModify;
    }


    /**
     * Gets the identifier value for this DPIRuleTransport.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this DPIRuleTransport.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the ignoreRecommendations value for this DPIRuleTransport.
     * 
     * @return ignoreRecommendations
     */
    public boolean isIgnoreRecommendations() {
        return ignoreRecommendations;
    }


    /**
     * Sets the ignoreRecommendations value for this DPIRuleTransport.
     * 
     * @param ignoreRecommendations
     */
    public void setIgnoreRecommendations(boolean ignoreRecommendations) {
        this.ignoreRecommendations = ignoreRecommendations;
    }


    /**
     * Gets the includePacketData value for this DPIRuleTransport.
     * 
     * @return includePacketData
     */
    public boolean isIncludePacketData() {
        return includePacketData;
    }


    /**
     * Sets the includePacketData value for this DPIRuleTransport.
     * 
     * @param includePacketData
     */
    public void setIncludePacketData(boolean includePacketData) {
        this.includePacketData = includePacketData;
    }


    /**
     * Gets the issued value for this DPIRuleTransport.
     * 
     * @return issued
     */
    public java.util.Calendar getIssued() {
        return issued;
    }


    /**
     * Sets the issued value for this DPIRuleTransport.
     * 
     * @param issued
     */
    public void setIssued(java.util.Calendar issued) {
        this.issued = issued;
    }


    /**
     * Gets the patternAction value for this DPIRuleTransport.
     * 
     * @return patternAction
     */
    public com.trendmicro.webserviceclient.generated.EnumDPIRuleAction getPatternAction() {
        return patternAction;
    }


    /**
     * Sets the patternAction value for this DPIRuleTransport.
     * 
     * @param patternAction
     */
    public void setPatternAction(com.trendmicro.webserviceclient.generated.EnumDPIRuleAction patternAction) {
        this.patternAction = patternAction;
    }


    /**
     * Gets the patternCaseSensitive value for this DPIRuleTransport.
     * 
     * @return patternCaseSensitive
     */
    public boolean isPatternCaseSensitive() {
        return patternCaseSensitive;
    }


    /**
     * Sets the patternCaseSensitive value for this DPIRuleTransport.
     * 
     * @param patternCaseSensitive
     */
    public void setPatternCaseSensitive(boolean patternCaseSensitive) {
        this.patternCaseSensitive = patternCaseSensitive;
    }


    /**
     * Gets the patternEnd value for this DPIRuleTransport.
     * 
     * @return patternEnd
     */
    public java.lang.String getPatternEnd() {
        return patternEnd;
    }


    /**
     * Sets the patternEnd value for this DPIRuleTransport.
     * 
     * @param patternEnd
     */
    public void setPatternEnd(java.lang.String patternEnd) {
        this.patternEnd = patternEnd;
    }


    /**
     * Gets the patternIf value for this DPIRuleTransport.
     * 
     * @return patternIf
     */
    public com.trendmicro.webserviceclient.generated.EnumDPIRuleIf getPatternIf() {
        return patternIf;
    }


    /**
     * Sets the patternIf value for this DPIRuleTransport.
     * 
     * @param patternIf
     */
    public void setPatternIf(com.trendmicro.webserviceclient.generated.EnumDPIRuleIf patternIf) {
        this.patternIf = patternIf;
    }


    /**
     * Gets the patternPatterns value for this DPIRuleTransport.
     * 
     * @return patternPatterns
     */
    public java.lang.String getPatternPatterns() {
        return patternPatterns;
    }


    /**
     * Sets the patternPatterns value for this DPIRuleTransport.
     * 
     * @param patternPatterns
     */
    public void setPatternPatterns(java.lang.String patternPatterns) {
        this.patternPatterns = patternPatterns;
    }


    /**
     * Gets the patternStart value for this DPIRuleTransport.
     * 
     * @return patternStart
     */
    public java.lang.String getPatternStart() {
        return patternStart;
    }


    /**
     * Sets the patternStart value for this DPIRuleTransport.
     * 
     * @param patternStart
     */
    public void setPatternStart(java.lang.String patternStart) {
        this.patternStart = patternStart;
    }


    /**
     * Gets the priority value for this DPIRuleTransport.
     * 
     * @return priority
     */
    public com.trendmicro.webserviceclient.generated.EnumDPIRulePriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this DPIRuleTransport.
     * 
     * @param priority
     */
    public void setPriority(com.trendmicro.webserviceclient.generated.EnumDPIRulePriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the raiseAlert value for this DPIRuleTransport.
     * 
     * @return raiseAlert
     */
    public boolean isRaiseAlert() {
        return raiseAlert;
    }


    /**
     * Sets the raiseAlert value for this DPIRuleTransport.
     * 
     * @param raiseAlert
     */
    public void setRaiseAlert(boolean raiseAlert) {
        this.raiseAlert = raiseAlert;
    }


    /**
     * Gets the ruleXML value for this DPIRuleTransport.
     * 
     * @return ruleXML
     */
    public java.lang.String getRuleXML() {
        return ruleXML;
    }


    /**
     * Sets the ruleXML value for this DPIRuleTransport.
     * 
     * @param ruleXML
     */
    public void setRuleXML(java.lang.String ruleXML) {
        this.ruleXML = ruleXML;
    }


    /**
     * Gets the scheduleID value for this DPIRuleTransport.
     * 
     * @return scheduleID
     */
    public java.lang.Integer getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this DPIRuleTransport.
     * 
     * @param scheduleID
     */
    public void setScheduleID(java.lang.Integer scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the severity value for this DPIRuleTransport.
     * 
     * @return severity
     */
    public com.trendmicro.webserviceclient.generated.EnumDPIRuleSeverity getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this DPIRuleTransport.
     * 
     * @param severity
     */
    public void setSeverity(com.trendmicro.webserviceclient.generated.EnumDPIRuleSeverity severity) {
        this.severity = severity;
    }


    /**
     * Gets the signatureAction value for this DPIRuleTransport.
     * 
     * @return signatureAction
     */
    public com.trendmicro.webserviceclient.generated.EnumDPIRuleAction getSignatureAction() {
        return signatureAction;
    }


    /**
     * Sets the signatureAction value for this DPIRuleTransport.
     * 
     * @param signatureAction
     */
    public void setSignatureAction(com.trendmicro.webserviceclient.generated.EnumDPIRuleAction signatureAction) {
        this.signatureAction = signatureAction;
    }


    /**
     * Gets the signatureCaseSensitive value for this DPIRuleTransport.
     * 
     * @return signatureCaseSensitive
     */
    public boolean isSignatureCaseSensitive() {
        return signatureCaseSensitive;
    }


    /**
     * Sets the signatureCaseSensitive value for this DPIRuleTransport.
     * 
     * @param signatureCaseSensitive
     */
    public void setSignatureCaseSensitive(boolean signatureCaseSensitive) {
        this.signatureCaseSensitive = signatureCaseSensitive;
    }


    /**
     * Gets the signatureSignature value for this DPIRuleTransport.
     * 
     * @return signatureSignature
     */
    public java.lang.String getSignatureSignature() {
        return signatureSignature;
    }


    /**
     * Sets the signatureSignature value for this DPIRuleTransport.
     * 
     * @param signatureSignature
     */
    public void setSignatureSignature(java.lang.String signatureSignature) {
        this.signatureSignature = signatureSignature;
    }


    /**
     * Gets the templateType value for this DPIRuleTransport.
     * 
     * @return templateType
     */
    public com.trendmicro.webserviceclient.generated.EnumDPIRuleTemplateType getTemplateType() {
        return templateType;
    }


    /**
     * Sets the templateType value for this DPIRuleTransport.
     * 
     * @param templateType
     */
    public void setTemplateType(com.trendmicro.webserviceclient.generated.EnumDPIRuleTemplateType templateType) {
        this.templateType = templateType;
    }


    /**
     * Gets the cveNumbers value for this DPIRuleTransport.
     * 
     * @return cveNumbers
     */
    public java.lang.String getCveNumbers() {
        return cveNumbers;
    }


    /**
     * Sets the cveNumbers value for this DPIRuleTransport.
     * 
     * @param cveNumbers
     */
    public void setCveNumbers(java.lang.String cveNumbers) {
        this.cveNumbers = cveNumbers;
    }


    /**
     * Gets the msNumbers value for this DPIRuleTransport.
     * 
     * @return msNumbers
     */
    public java.lang.String getMsNumbers() {
        return msNumbers;
    }


    /**
     * Sets the msNumbers value for this DPIRuleTransport.
     * 
     * @param msNumbers
     */
    public void setMsNumbers(java.lang.String msNumbers) {
        this.msNumbers = msNumbers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DPIRuleTransport)) return false;
        DPIRuleTransport other = (DPIRuleTransport) obj;
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
            ((this.applicationTypeID==null && other.getApplicationTypeID()==null) || 
             (this.applicationTypeID!=null &&
              this.applicationTypeID.equals(other.getApplicationTypeID()))) &&
            this.authoritative == other.isAuthoritative() &&
            this.cvssScore == other.getCvssScore() &&
            this.detectOnly == other.isDetectOnly() &&
            this.disableEvent == other.isDisableEvent() &&
            this.eventOnPacketDrop == other.isEventOnPacketDrop() &&
            this.eventOnPacketModify == other.isEventOnPacketModify() &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            this.ignoreRecommendations == other.isIgnoreRecommendations() &&
            this.includePacketData == other.isIncludePacketData() &&
            ((this.issued==null && other.getIssued()==null) || 
             (this.issued!=null &&
              this.issued.equals(other.getIssued()))) &&
            ((this.patternAction==null && other.getPatternAction()==null) || 
             (this.patternAction!=null &&
              this.patternAction.equals(other.getPatternAction()))) &&
            this.patternCaseSensitive == other.isPatternCaseSensitive() &&
            ((this.patternEnd==null && other.getPatternEnd()==null) || 
             (this.patternEnd!=null &&
              this.patternEnd.equals(other.getPatternEnd()))) &&
            ((this.patternIf==null && other.getPatternIf()==null) || 
             (this.patternIf!=null &&
              this.patternIf.equals(other.getPatternIf()))) &&
            ((this.patternPatterns==null && other.getPatternPatterns()==null) || 
             (this.patternPatterns!=null &&
              this.patternPatterns.equals(other.getPatternPatterns()))) &&
            ((this.patternStart==null && other.getPatternStart()==null) || 
             (this.patternStart!=null &&
              this.patternStart.equals(other.getPatternStart()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            this.raiseAlert == other.isRaiseAlert() &&
            ((this.ruleXML==null && other.getRuleXML()==null) || 
             (this.ruleXML!=null &&
              this.ruleXML.equals(other.getRuleXML()))) &&
            ((this.scheduleID==null && other.getScheduleID()==null) || 
             (this.scheduleID!=null &&
              this.scheduleID.equals(other.getScheduleID()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.signatureAction==null && other.getSignatureAction()==null) || 
             (this.signatureAction!=null &&
              this.signatureAction.equals(other.getSignatureAction()))) &&
            this.signatureCaseSensitive == other.isSignatureCaseSensitive() &&
            ((this.signatureSignature==null && other.getSignatureSignature()==null) || 
             (this.signatureSignature!=null &&
              this.signatureSignature.equals(other.getSignatureSignature()))) &&
            ((this.templateType==null && other.getTemplateType()==null) || 
             (this.templateType!=null &&
              this.templateType.equals(other.getTemplateType()))) &&
            ((this.cveNumbers==null && other.getCveNumbers()==null) || 
             (this.cveNumbers!=null &&
              this.cveNumbers.equals(other.getCveNumbers()))) &&
            ((this.msNumbers==null && other.getMsNumbers()==null) || 
             (this.msNumbers!=null &&
              this.msNumbers.equals(other.getMsNumbers())));
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
        if (getApplicationTypeID() != null) {
            _hashCode += getApplicationTypeID().hashCode();
        }
        _hashCode += (isAuthoritative() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getCvssScore()).hashCode();
        _hashCode += (isDetectOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDisableEvent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEventOnPacketDrop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEventOnPacketModify() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        _hashCode += (isIgnoreRecommendations() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludePacketData() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIssued() != null) {
            _hashCode += getIssued().hashCode();
        }
        if (getPatternAction() != null) {
            _hashCode += getPatternAction().hashCode();
        }
        _hashCode += (isPatternCaseSensitive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPatternEnd() != null) {
            _hashCode += getPatternEnd().hashCode();
        }
        if (getPatternIf() != null) {
            _hashCode += getPatternIf().hashCode();
        }
        if (getPatternPatterns() != null) {
            _hashCode += getPatternPatterns().hashCode();
        }
        if (getPatternStart() != null) {
            _hashCode += getPatternStart().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        _hashCode += (isRaiseAlert() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRuleXML() != null) {
            _hashCode += getRuleXML().hashCode();
        }
        if (getScheduleID() != null) {
            _hashCode += getScheduleID().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSignatureAction() != null) {
            _hashCode += getSignatureAction().hashCode();
        }
        _hashCode += (isSignatureCaseSensitive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSignatureSignature() != null) {
            _hashCode += getSignatureSignature().hashCode();
        }
        if (getTemplateType() != null) {
            _hashCode += getTemplateType().hashCode();
        }
        if (getCveNumbers() != null) {
            _hashCode += getCveNumbers().hashCode();
        }
        if (getMsNumbers() != null) {
            _hashCode += getMsNumbers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DPIRuleTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "DPIRuleTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TBUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "TBUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "applicationTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoritative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "authoritative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvssScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "cvssScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detectOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "detectOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "disableEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventOnPacketDrop");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "eventOnPacketDrop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventOnPacketModify");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "eventOnPacketModify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
        elemField.setFieldName("includePacketData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "includePacketData"));
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
        elemField.setFieldName("patternAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "patternAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDPIRuleAction"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patternCaseSensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "patternCaseSensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patternEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "patternEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patternIf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "patternIf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDPIRuleIf"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patternPatterns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "patternPatterns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patternStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "patternStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDPIRulePriority"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raiseAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "raiseAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleXML");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ruleXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "scheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDPIRuleSeverity"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "signatureAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDPIRuleAction"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureCaseSensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "signatureCaseSensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "signatureSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "templateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumDPIRuleTemplateType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cveNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "cveNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "msNumbers"));
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
