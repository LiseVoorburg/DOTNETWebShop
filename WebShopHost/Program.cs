using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using WcfWebShopLibrary;


namespace WebShopHost
{
    class program
    {
        static void Main(string[] args)
        {
            using (ServiceHost host = new ServiceHost(typeof(WebShopService)))
            {
                host.Open();
                Console.ReadKey();
                
            }
            


        }
        
    }
}
