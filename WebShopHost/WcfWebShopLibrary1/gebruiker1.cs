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
    
    public partial class gebruiker1
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public gebruiker1()
        {
            this.orders = new HashSet<order1>();
        }
    
        public string naam { get; set; }
        public string wachtwoord { get; set; }
        public double saldo { get; set; }
    
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<order1> orders { get; set; }
    }
}
