package service;

public class BachelierServiceProxy implements service.BachelierService {
  private String _endpoint = null;
  private service.BachelierService bachelierService = null;
  
  public BachelierServiceProxy() {
    _initBachelierServiceProxy();
  }
  
  public BachelierServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBachelierServiceProxy();
  }
  
  private void _initBachelierServiceProxy() {
    try {
      bachelierService = (new service.BachelierServiceServiceLocator()).getBachelierServicePort();
      if (bachelierService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bachelierService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bachelierService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bachelierService != null)
      ((javax.xml.rpc.Stub)bachelierService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.BachelierService getBachelierService() {
    if (bachelierService == null)
      _initBachelierServiceProxy();
    return bachelierService;
  }
  
  public boolean findOne(java.lang.String cin, java.lang.String numetud) throws java.rmi.RemoteException{
    if (bachelierService == null)
      _initBachelierServiceProxy();
    return bachelierService.findOne(cin, numetud);
  }
  
  public service.Bachelier[] listebachelier() throws java.rmi.RemoteException, service.ClassNotFoundException{
    if (bachelierService == null)
      _initBachelierServiceProxy();
    return bachelierService.listebachelier();
  }
  
  
}