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
            using (Model1Container ctx = new Model1Container())
            {
                product p1 = new product { naam = "appel", prijs = 1, aantal = 10 };
                product p2 = new product { naam = "peer", prijs = 2, aantal = 10 };
                ctx.products.Add(p1);
                ctx.products.Add(p2);
                //product p3 = ctx.products.Find("henk");
                ctx.SaveChanges();

                //s = k;
                return "kak";
            }
        }

    }
}
