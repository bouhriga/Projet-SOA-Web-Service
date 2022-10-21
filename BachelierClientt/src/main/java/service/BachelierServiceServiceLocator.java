/**
 * BachelierServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class BachelierServiceServiceLocator extends org.apache.axis.client.Service implements service.BachelierServiceService {

    public BachelierServiceServiceLocator() {
    }


    public BachelierServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BachelierServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BachelierServicePort
    private java.lang.String BachelierServicePort_address = "http://localhost:8553/";

    public java.lang.String getBachelierServicePortAddress() {
        return BachelierServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BachelierServicePortWSDDServiceName = "BachelierServicePort";

    public java.lang.String getBachelierServicePortWSDDServiceName() {
        return BachelierServicePortWSDDServiceName;
    }

    public void setBachelierServicePortWSDDServiceName(java.lang.String name) {
        BachelierServicePortWSDDServiceName = name;
    }

    public service.BachelierService getBachelierServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BachelierServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBachelierServicePort(endpoint);
    }

    public service.BachelierService getBachelierServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.BachelierServicePortBindingStub _stub = new service.BachelierServicePortBindingStub(portAddress, this);
            _stub.setPortName(getBachelierServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBachelierServicePortEndpointAddress(java.lang.String address) {
        BachelierServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.BachelierService.class.isAssignableFrom(serviceEndpointInterface)) {
                service.BachelierServicePortBindingStub _stub = new service.BachelierServicePortBindingStub(new java.net.URL(BachelierServicePort_address), this);
                _stub.setPortName(getBachelierServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BachelierServicePort".equals(inputPortName)) {
            return getBachelierServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "BachelierServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "BachelierServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BachelierServicePort".equals(portName)) {
            setBachelierServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
