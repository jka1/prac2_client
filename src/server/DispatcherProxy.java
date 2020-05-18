package server;

public class DispatcherProxy implements server.Dispatcher {
  private String _endpoint = null;
  private server.Dispatcher dispatcher = null;
  
  public DispatcherProxy() {
    _initDispatcherProxy();
  }
  
  public DispatcherProxy(String endpoint) {
    _endpoint = endpoint;
    _initDispatcherProxy();
  }
  
  private void _initDispatcherProxy() {
    try {
      dispatcher = (new server.DispatcherServiceLocator()).getDispatcherPort();
      if (dispatcher != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dispatcher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dispatcher)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dispatcher != null)
      ((javax.xml.rpc.Stub)dispatcher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public server.Dispatcher getDispatcher() {
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher;
  }
  
  public server.Local[] getListLocal(java.lang.Long arg0, java.lang.Long arg1, java.lang.Long arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Long arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.Long arg9) throws java.rmi.RemoteException, server.Exception{
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher.getListLocal(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
  }
  
  public server.CaracteristicaTipoLocal[] getListCaracteristicaTipoLocal(java.lang.Long arg0, java.lang.Long arg1, java.lang.Long arg2) throws java.rmi.RemoteException, server.Exception{
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher.getListCaracteristicaTipoLocal(arg0, arg1, arg2);
  }
  
  public server.Local altaLocal(java.lang.Long arg0, java.lang.Long arg1, java.lang.String arg2, java.lang.String arg3, java.lang.Long arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) throws java.rmi.RemoteException, server.Exception{
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher.altaLocal(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
  }
  
  public server.Accessibilitat[] getListAccessibilitatLocal(java.lang.Long arg0, java.lang.Long arg1, java.lang.Long arg2, java.lang.Long arg3, java.lang.String arg4) throws java.rmi.RemoteException, server.Exception{
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher.getListAccessibilitatLocal(arg0, arg1, arg2, arg3, arg4);
  }
  
  public server.Accessibilitat crearAccessibilitat(java.lang.Long arg0, java.lang.Long arg1, java.lang.Long arg2, java.lang.String arg3) throws java.rmi.RemoteException, server.Exception{
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher.crearAccessibilitat(arg0, arg1, arg2, arg3);
  }
  
  public server.Local verificarLocal(java.lang.Long arg0) throws java.rmi.RemoteException, server.Exception{
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher.verificarLocal(arg0);
  }
  
  public boolean baixaLocal(java.lang.Long arg0) throws java.rmi.RemoteException, server.Exception{
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher.baixaLocal(arg0);
  }
  
  public server.Local updateLocal(java.lang.Long arg0, java.lang.Long arg1, java.lang.Long arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Long arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8) throws java.rmi.RemoteException, server.Exception{
    if (dispatcher == null)
      _initDispatcherProxy();
    return dispatcher.updateLocal(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
  }
  
  
}