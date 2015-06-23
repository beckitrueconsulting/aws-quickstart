/**
 * ManagerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public interface ManagerService extends javax.xml.rpc.Service {
    public java.lang.String getManagerAddress();

    public com.trendmicro.webserviceclient.generated.Manager getManager() throws javax.xml.rpc.ServiceException;

    public com.trendmicro.webserviceclient.generated.Manager getManager(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
