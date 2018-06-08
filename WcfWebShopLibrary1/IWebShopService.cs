using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfWebShopLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IWebShopService" in both code and config file together.
    [ServiceContract]
    public interface IWebShopService
    {
        [OperationContract]
        bool RegisterUser(string username, string password);
        [OperationContract]
        string Test(String s);
        [OperationContract]
        Gebruiker Login(string username, string password);
        [OperationContract]
        List<Product> getProducten();
        [OperationContract]
        Gebruiker KoopProduct(Gebruiker gebruiker, Product product, int aantal);

    }
}
