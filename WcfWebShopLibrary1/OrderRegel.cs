//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WcfWebShopLibrary
{
    using System;
    using System.Collections.Generic;
    
    public partial class OrderRegel
    {
        public int Id { get; set; }
        public int Aantal { get; set; }
        public int InventoryId { get; set; }
        override
        public string ToString()
        {
            return "naam: " + Product.Naam + ", prijs: " + Product.Prijs + ", aantal: " + Aantal;  
        }
    
        public virtual Inventory Order { get; set; }
        public virtual Product Product { get; set; }
    }
}
