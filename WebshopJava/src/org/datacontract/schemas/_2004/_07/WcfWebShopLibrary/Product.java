/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.WcfWebShopLibrary;

public class Product  implements java.io.Serializable {
    private java.lang.Integer id;

    private java.lang.String naam;

    private org.datacontract.schemas._2004._07.WcfWebShopLibrary.OrderRegel[] orderRegel;

    private java.lang.Double prijs;

    public Product() {
    }

    public Product(
           java.lang.Integer id,
           java.lang.String naam,
           org.datacontract.schemas._2004._07.WcfWebShopLibrary.OrderRegel[] orderRegel,
           java.lang.Double prijs) {
           this.id = id;
           this.naam = naam;
           this.orderRegel = orderRegel;
           this.prijs = prijs;
    }


    /**
     * Gets the id value for this Product.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Product.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the naam value for this Product.
     * 
     * @return naam
     */
    public java.lang.String getNaam() {
        return naam;
    }


    /**
     * Sets the naam value for this Product.
     * 
     * @param naam
     */
    public void setNaam(java.lang.String naam) {
        this.naam = naam;
    }


    /**
     * Gets the orderRegel value for this Product.
     * 
     * @return orderRegel
     */
    public org.datacontract.schemas._2004._07.WcfWebShopLibrary.OrderRegel[] getOrderRegel() {
        return orderRegel;
    }


    /**
     * Sets the orderRegel value for this Product.
     * 
     * @param orderRegel
     */
    public void setOrderRegel(org.datacontract.schemas._2004._07.WcfWebShopLibrary.OrderRegel[] orderRegel) {
        this.orderRegel = orderRegel;
    }


    /**
     * Gets the prijs value for this Product.
     * 
     * @return prijs
     */
    public java.lang.Double getPrijs() {
        return prijs;
    }


    /**
     * Sets the prijs value for this Product.
     * 
     * @param prijs
     */
    public void setPrijs(java.lang.Double prijs) {
        this.prijs = prijs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.naam==null && other.getNaam()==null) || 
             (this.naam!=null &&
              this.naam.equals(other.getNaam()))) &&
            ((this.orderRegel==null && other.getOrderRegel()==null) || 
             (this.orderRegel!=null &&
              java.util.Arrays.equals(this.orderRegel, other.getOrderRegel()))) &&
            ((this.prijs==null && other.getPrijs()==null) || 
             (this.prijs!=null &&
              this.prijs.equals(other.getPrijs())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNaam() != null) {
            _hashCode += getNaam().hashCode();
        }
        if (getOrderRegel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderRegel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderRegel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrijs() != null) {
            _hashCode += getPrijs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Naam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderRegel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "OrderRegel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "OrderRegel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "OrderRegel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prijs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Prijs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
