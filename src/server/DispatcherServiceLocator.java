/**
 * DispatcherServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public class DispatcherServiceLocator extends org.apache.axis.client.Service implements server.DispatcherService {

    public DispatcherServiceLocator() {
    }


    public DispatcherServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DispatcherServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DispatcherPort
    private java.lang.String DispatcherPort_address = "http://localhost:8080/prac2_serverWeb/Dispatcher";

    public java.lang.String getDispatcherPortAddress() {
        return DispatcherPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DispatcherPortWSDDServiceName = "DispatcherPort";

    public java.lang.String getDispatcherPortWSDDServiceName() {
        return DispatcherPortWSDDServiceName;
    }

    public void setDispatcherPortWSDDServiceName(java.lang.String name) {
        DispatcherPortWSDDServiceName = name;
    }

    public server.Dispatcher getDispatcherPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DispatcherPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDispatcherPort(endpoint);
    }

    public server.Dispatcher getDispatcherPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.DispatcherServiceSoapBindingStub _stub = new server.DispatcherServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDispatcherPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDispatcherPortEndpointAddress(java.lang.String address) {
        DispatcherPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.Dispatcher.class.isAssignableFrom(serviceEndpointInterface)) {
                server.DispatcherServiceSoapBindingStub _stub = new server.DispatcherServiceSoapBindingStub(new java.net.URL(DispatcherPort_address), this);
                _stub.setPortName(getDispatcherPortWSDDServiceName());
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
        if ("DispatcherPort".equals(inputPortName)) {
            return getDispatcherPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server/", "DispatcherService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server/", "DispatcherPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DispatcherPort".equals(portName)) {
            setDispatcherPortEndpointAddress(address);
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
