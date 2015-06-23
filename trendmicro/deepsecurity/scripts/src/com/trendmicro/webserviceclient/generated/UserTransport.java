/**
 * UserTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class UserTransport  extends com.trendmicro.webserviceclient.generated.TransportObject  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.String country;

    private java.lang.String description;

    private java.lang.String emailAddress;

    private java.lang.String fullName;

    private java.lang.String language;

    private boolean lockedOut;

    private java.lang.String mobileNumber;

    private java.lang.String pagerNumber;

    private java.lang.String password;

    private boolean passwordNeverExpires;

    private java.lang.String phoneNumber;

    private boolean receiveNotifications;

    private java.lang.Integer roleID;

    private java.lang.String username;

    public UserTransport() {
    }

    public UserTransport(
           java.lang.Integer ID,
           java.lang.String country,
           java.lang.String description,
           java.lang.String emailAddress,
           java.lang.String fullName,
           java.lang.String language,
           boolean lockedOut,
           java.lang.String mobileNumber,
           java.lang.String pagerNumber,
           java.lang.String password,
           boolean passwordNeverExpires,
           java.lang.String phoneNumber,
           boolean receiveNotifications,
           java.lang.Integer roleID,
           java.lang.String username) {
        this.ID = ID;
        this.country = country;
        this.description = description;
        this.emailAddress = emailAddress;
        this.fullName = fullName;
        this.language = language;
        this.lockedOut = lockedOut;
        this.mobileNumber = mobileNumber;
        this.pagerNumber = pagerNumber;
        this.password = password;
        this.passwordNeverExpires = passwordNeverExpires;
        this.phoneNumber = phoneNumber;
        this.receiveNotifications = receiveNotifications;
        this.roleID = roleID;
        this.username = username;
    }


    /**
     * Gets the ID value for this UserTransport.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this UserTransport.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the country value for this UserTransport.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UserTransport.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the description value for this UserTransport.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserTransport.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the emailAddress value for this UserTransport.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this UserTransport.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the fullName value for this UserTransport.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this UserTransport.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the language value for this UserTransport.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this UserTransport.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the lockedOut value for this UserTransport.
     * 
     * @return lockedOut
     */
    public boolean isLockedOut() {
        return lockedOut;
    }


    /**
     * Sets the lockedOut value for this UserTransport.
     * 
     * @param lockedOut
     */
    public void setLockedOut(boolean lockedOut) {
        this.lockedOut = lockedOut;
    }


    /**
     * Gets the mobileNumber value for this UserTransport.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this UserTransport.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the pagerNumber value for this UserTransport.
     * 
     * @return pagerNumber
     */
    public java.lang.String getPagerNumber() {
        return pagerNumber;
    }


    /**
     * Sets the pagerNumber value for this UserTransport.
     * 
     * @param pagerNumber
     */
    public void setPagerNumber(java.lang.String pagerNumber) {
        this.pagerNumber = pagerNumber;
    }


    /**
     * Gets the password value for this UserTransport.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserTransport.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the passwordNeverExpires value for this UserTransport.
     * 
     * @return passwordNeverExpires
     */
    public boolean isPasswordNeverExpires() {
        return passwordNeverExpires;
    }


    /**
     * Sets the passwordNeverExpires value for this UserTransport.
     * 
     * @param passwordNeverExpires
     */
    public void setPasswordNeverExpires(boolean passwordNeverExpires) {
        this.passwordNeverExpires = passwordNeverExpires;
    }


    /**
     * Gets the phoneNumber value for this UserTransport.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this UserTransport.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the receiveNotifications value for this UserTransport.
     * 
     * @return receiveNotifications
     */
    public boolean isReceiveNotifications() {
        return receiveNotifications;
    }


    /**
     * Sets the receiveNotifications value for this UserTransport.
     * 
     * @param receiveNotifications
     */
    public void setReceiveNotifications(boolean receiveNotifications) {
        this.receiveNotifications = receiveNotifications;
    }


    /**
     * Gets the roleID value for this UserTransport.
     * 
     * @return roleID
     */
    public java.lang.Integer getRoleID() {
        return roleID;
    }


    /**
     * Sets the roleID value for this UserTransport.
     * 
     * @param roleID
     */
    public void setRoleID(java.lang.Integer roleID) {
        this.roleID = roleID;
    }


    /**
     * Gets the username value for this UserTransport.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserTransport.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTransport)) return false;
        UserTransport other = (UserTransport) obj;
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
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            this.lockedOut == other.isLockedOut() &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.pagerNumber==null && other.getPagerNumber()==null) || 
             (this.pagerNumber!=null &&
              this.pagerNumber.equals(other.getPagerNumber()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            this.passwordNeverExpires == other.isPasswordNeverExpires() &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            this.receiveNotifications == other.isReceiveNotifications() &&
            ((this.roleID==null && other.getRoleID()==null) || 
             (this.roleID!=null &&
              this.roleID.equals(other.getRoleID()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        _hashCode += (isLockedOut() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getPagerNumber() != null) {
            _hashCode += getPagerNumber().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += (isPasswordNeverExpires() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        _hashCode += (isReceiveNotifications() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRoleID() != null) {
            _hashCode += getRoleID().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "UserTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedOut");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "lockedOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "mobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "pagerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordNeverExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "passwordNeverExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "receiveNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "roleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Manager", "username"));
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
