/**
 * WebReputationEventTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class WebReputationEventTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.Integer hostID;

    private java.lang.String hostName;

    private java.util.Calendar logTime;

    private int rank;

    private com.trendmicro.webserviceclient.generated.EnumWebReputationEventRisk risk;

    private java.lang.String tags;

    private java.lang.String url;

    private java.lang.Integer webReputationEventID;

    public WebReputationEventTransport() {
    }

    public WebReputationEventTransport(
           java.lang.Integer hostID,
           java.lang.String hostName,
           java.util.Calendar logTime,
           int rank,
           com.trendmicro.webserviceclient.generated.EnumWebReputationEventRisk risk,
           java.lang.String tags,
           java.lang.String url,
           java.lang.Integer webReputationEventID) {
        this.hostID = hostID;
        this.hostName = hostName;
        this.logTime = logTime;
        this.rank = rank;
        this.risk = risk;
        this.tags = tags;
        this.url = url;
        this.webReputationEventID = webReputationEventID;
    }


    /**
     * Gets the hostID value for this WebReputationEventTransport.
     * 
     * @return hostID
     */
    public java.lang.Integer getHostID() {
        return hostID;
    }


    /**
     * Sets the hostID value for this WebReputationEventTransport.
     * 
     * @param hostID
     */
    public void setHostID(java.lang.Integer hostID) {
        this.hostID = hostID;
    }


    /**
     * Gets the hostName value for this WebReputationEventTransport.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this WebReputationEventTransport.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the logTime value for this WebReputationEventTransport.
     * 
     * @return logTime
     */
    public java.util.Calendar getLogTime() {
        return logTime;
    }


    /**
     * Sets the logTime value for this WebReputationEventTransport.
     * 
     * @param logTime
     */
    public void setLogTime(java.util.Calendar logTime) {
        this.logTime = logTime;
    }


    /**
     * Gets the rank value for this WebReputationEventTransport.
     * 
     * @return rank
     */
    public int getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this WebReputationEventTransport.
     * 
     * @param rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }


    /**
     * Gets the risk value for this WebReputationEventTransport.
     * 
     * @return risk
     */
    public com.trendmicro.webserviceclient.generated.EnumWebReputationEventRisk getRisk() {
        return risk;
    }


    /**
     * Sets the risk value for this WebReputationEventTransport.
     * 
     * @param risk
     */
    public void setRisk(com.trendmicro.webserviceclient.generated.EnumWebReputationEventRisk risk) {
        this.risk = risk;
    }


    /**
     * Gets the tags value for this WebReputationEventTransport.
     * 
     * @return tags
     */
    public java.lang.String getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this WebReputationEventTransport.
     * 
     * @param tags
     */
    public void setTags(java.lang.String tags) {
        this.tags = tags;
    }


    /**
     * Gets the url value for this WebReputationEventTransport.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this WebReputationEventTransport.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the webReputationEventID value for this WebReputationEventTransport.
     * 
     * @return webReputationEventID
     */
    public java.lang.Integer getWebReputationEventID() {
        return webReputationEventID;
    }


    /**
     * Sets the webReputationEventID value for this WebReputationEventTransport.
     * 
     * @param webReputationEventID
     */
    public void setWebReputationEventID(java.lang.Integer webReputationEventID) {
        this.webReputationEventID = webReputationEventID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebReputationEventTransport)) return false;
        WebReputationEventTransport other = (WebReputationEventTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostID==null && other.getHostID()==null) || 
             (this.hostID!=null &&
              this.hostID.equals(other.getHostID()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.logTime==null && other.getLogTime()==null) || 
             (this.logTime!=null &&
              this.logTime.equals(other.getLogTime()))) &&
            this.rank == other.getRank() &&
            ((this.risk==null && other.getRisk()==null) || 
             (this.risk!=null &&
              this.risk.equals(other.getRisk()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.webReputationEventID==null && other.getWebReputationEventID()==null) || 
             (this.webReputationEventID!=null &&
              this.webReputationEventID.equals(other.getWebReputationEventID())));
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
        if (getHostID() != null) {
            _hashCode += getHostID().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getLogTime() != null) {
            _hashCode += getLogTime().hashCode();
        }
        _hashCode += getRank();
        if (getRisk() != null) {
            _hashCode += getRisk().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getWebReputationEventID() != null) {
            _hashCode += getWebReputationEventID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebReputationEventTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "WebReputationEventTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "logTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("risk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "risk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumWebReputationEventRisk"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webReputationEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "webReputationEventID"));
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
