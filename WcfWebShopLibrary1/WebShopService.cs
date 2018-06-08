using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfWebShopLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "WebShopService" in both code and config file together.
    public class WebShopService : IWebShopService
    {
        //string test = "kak";
        string s;

        public void PostNote(string from, string note)
        {
            Debug.WriteLine("{0}: {1}", from, note);

        }



public string Test(string k)
        {
            Debug.WriteLine("methode");
            using (WebshopModelContainer ctx = new WebshopModelContainer())
            {
                Debug.WriteLine("in using..");
                Product p1 = new Product { Id = 1, Naam = "appel", Prijs = 1 };
                Debug.WriteLine("product 1 is gemaakt..");
                Product p2 = new Product { Id = 2, Naam = "peer", Prijs = 2 };
                ctx.Products.Add(p1);

                ctx.Products.Add(p2);
                //product p3 = ctx.products.Find("henk");
                ctx.SaveChanges();

                //s = k;

            };

            return "test";
        }

    }
}
