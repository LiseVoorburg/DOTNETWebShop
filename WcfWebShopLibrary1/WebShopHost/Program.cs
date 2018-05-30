using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using WcfWebShopLibrary;

namespace WebShopHost
{
    class Program
    {
        static void Main(string[] args)
        {
            using (ServiceHost host = new ServiceHost(typeof(WebShopService)))
            {
                host.Open();
                Console.WriteLine("Service ready");
                Console.ReadKey();
            }
        }
    }
}
