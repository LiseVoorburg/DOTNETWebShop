package org.tempuri;

public class IWebShopServiceProxy implements org.tempuri.IWebShopService {
  private String _endpoint = null;
  private org.tempuri.IWebShopService iWebShopService = null;
  
  public IWebShopServiceProxy() {
    _initIWebShopServiceProxy();
  }
  
  public IWebShopServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIWebShopServiceProxy();
  }
  
  private void _initIWebShopServiceProxy() {
    try {
      iWebShopService = (new org.tempuri.WebShopServiceLocator()).getBasicHttpBinding_IWebShopService();
      if (iWebShopService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iWebShopService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iWebShopService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iWebShopService != null)
      ((javax.xml.rpc.Stub)iWebShopService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IWebShopService getIWebShopService() {
    if (iWebShopService == null)
      _initIWebShopServiceProxy();
    return iWebShopService;
  }
  
  public java.lang.Boolean registerUser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (iWebShopService == null)
      _initIWebShopServiceProxy();
    return iWebShopService.registerUser(username, password);
  }
  
  public java.lang.String test(java.lang.String s) throws java.rmi.RemoteException{
    if (iWebShopService == null)
      _initIWebShopServiceProxy();
    return iWebShopService.test(s);
  }
  
  public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (iWebShopService == null)
      _initIWebShopServiceProxy();
    return iWebShopService.login(username, password);
  }
  
  public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Product[] getProducten() throws java.rmi.RemoteException{
    if (iWebShopService == null)
      _initIWebShopServiceProxy();
    return iWebShopService.getProducten();
  }
  
  public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker koopProduct(org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker gebruiker, org.datacontract.schemas._2004._07.WcfWebShopLibrary.Product product, java.lang.Integer aantal) throws java.rmi.RemoteException{
    if (iWebShopService == null)
      _initIWebShopServiceProxy();
    return iWebShopService.koopProduct(gebruiker, product, aantal);
  }
  
  
}