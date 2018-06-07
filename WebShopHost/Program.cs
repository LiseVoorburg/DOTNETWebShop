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
                Console.WriteLine("doet et");
          
            }
            using (MyModelContainer ctx = new MyModelContainer())
            {
                //product p1 = new product { naam = "appel", prijs = 1, aantal = 10};
                //product p2 = new product { naam = "peer", prijs = 2, aantal = 10 };
                //ctx.productSet.Add(p1);
                //ctx.productSet.Add(p2);
                //ctx.SaveChanges();
                var products = from p in ctx.productSet
                               where p.prijs < 100
                               select p;
                foreach (product p in products)
                    Console.WriteLine(p.naam);
                Console.ReadKey();
            }
        }
    }
}
