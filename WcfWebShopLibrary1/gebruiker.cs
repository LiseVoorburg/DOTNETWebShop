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
    
    public partial class Gebruiker
    {
        public int Id { get; set; }
        public string Wachtwoord { get; set; }
        public double Saldo { get; set; }
        public string Naam { get; set; }
    
        public virtual Inventory Order { get; set; }
    }
}
