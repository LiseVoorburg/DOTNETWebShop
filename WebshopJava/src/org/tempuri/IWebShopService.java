/**
 * IWebShopService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IWebShopService extends java.rmi.Remote {
    public java.lang.Boolean registerUser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String test(java.lang.String s) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Product[] getProducten() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker koopProduct(org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker gebruiker, org.datacontract.schemas._2004._07.WcfWebShopLibrary.Product product, java.lang.Integer aantal) throws java.rmi.RemoteException;
}
