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

        public bool RegisterUser(string username, string password)
        {
            using (WebshopModelContainer ctx = new WebshopModelContainer())
            {
                var gebruikers = from p in ctx.Gebruikers select p;
                foreach (Gebruiker p in gebruikers)
                {
                    if (p.Naam == username)
                    {
                        return false;
                    }
                }
             
                    Gebruiker g1 = new Gebruiker { Naam = username, Wachtwoord = password, Saldo = 100 };
                    ctx.Gebruikers.Add(g1);
                    ctx.SaveChanges();

                return true;
            }
        }

        public Gebruiker Login(string username, string password)
        {
            using (WebshopModelContainer ctx = new WebshopModelContainer())
            {
                var gebruikers = from p in ctx.Gebruikers select p;
                foreach (Gebruiker p in gebruikers)
                {
                    if (p.Naam == username && p.Wachtwoord == password)
                    {
                        return p;
                    }
                }
            }
            return null;
        }

        public List<Product> getProducten()
        {
            List<Product> producten = new List<Product>();
            using (WebshopModelContainer ctx = new WebshopModelContainer())
            {
                var products = from p in ctx.Products select p;
                foreach (Product p in products)
                {
                    producten.Add(p);
                }
            }
            return producten;
        }

        public Gebruiker KoopProduct(Gebruiker gebruiker, Product product, int aantal)
        {
            using (WebshopModelContainer ctx = new WebshopModelContainer())
            {
                Product ptCtx = ctx.Products.Find(product.Id);
                Gebruiker gbCtx = ctx.Gebruikers.Find(gebruiker.Id);
                try
                {
                    Order o = new Order { Datum = 1111, Gebruiker = gebruiker };
                    OrderRegel or = new OrderRegel { Aantal = aantal, Product = product, Order = o };
                    o.OrderRegel.Add(or);
                    
                    if (gbCtx.Saldo >= (ptCtx.Prijs * aantal) && !(gbCtx.Saldo < 0)) {
                        gbCtx.Saldo -= (ptCtx.Prijs * aantal);
                    } 
                    
                    
                    ctx.SaveChanges();
                } catch
                {
                    Debug.WriteLine("kaka");
                }
                return gbCtx;

            }
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
