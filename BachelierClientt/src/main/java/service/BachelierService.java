/**
 * BachelierService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface BachelierService extends java.rmi.Remote {
    public boolean findOne(java.lang.String cin, java.lang.String numetud) throws java.rmi.RemoteException;
    public service.Bachelier[] listebachelier() throws java.rmi.RemoteException, service.ClassNotFoundException;
}
