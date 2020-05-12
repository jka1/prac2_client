/**
 * Dispatcher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public interface Dispatcher extends java.rmi.Remote {
    public server.Local verificarLocal(java.lang.Long arg0) throws java.rmi.RemoteException, server.Exception;
    public server.Local altaLocal(java.lang.Long arg0, java.lang.Long arg1, java.lang.String arg2, java.lang.String arg3, java.lang.Long arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) throws java.rmi.RemoteException, server.Exception;
    public boolean baixaLocal(java.lang.Long arg0) throws java.rmi.RemoteException, server.Exception;
    public server.Local updateLocal(java.lang.Long arg0, java.lang.Long arg1, java.lang.Long arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Long arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8) throws java.rmi.RemoteException, server.Exception;
}
