/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.WcfWebShopLibrary;

public class Order  implements java.io.Serializable {
    private java.lang.Integer datum;

    private org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker gebruiker;

    private java.lang.String gebruikerId;

    private java.lang.Integer id;

    private org.datacontract.schemas._2004._07.WcfWebShopLibrary.OrderRegel[] orderRegel;

    public Order() {
    }

    public Order(
           java.lang.Integer datum,
           org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker gebruiker,
           java.lang.String gebruikerId,
           java.lang.Integer id,
           org.datacontract.schemas._2004._07.WcfWebShopLibrary.OrderRegel[] orderRegel) {
           this.datum = datum;
           this.gebruiker = gebruiker;
           this.gebruikerId = gebruikerId;
           this.id = id;
           this.orderRegel = orderRegel;
    }


    /**
     * Gets the datum value for this Order.
     * 
     * @return datum
     */
    public java.lang.Integer getDatum() {
        return datum;
    }


    /**
     * Sets the datum value for this Order.
     * 
     * @param datum
     */
    public void setDatum(java.lang.Integer datum) {
        this.datum = datum;
    }


    /**
     * Gets the gebruiker value for this Order.
     * 
     * @return gebruiker
     */
    public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker getGebruiker() {
        return gebruiker;
    }


    /**
     * Sets the gebruiker value for this Order.
     * 
     * @param gebruiker
     */
    public void setGebruiker(org.datacontract.schemas._2004._07.WcfWebShopLibrary.Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }


    /**
     * Gets the gebruikerId value for this Order.
     * 
     * @return gebruikerId
     */
    public java.lang.String getGebruikerId() {
        return gebruikerId;
    }


    /**
     * Sets the gebruikerId value for this Order.
     * 
     * @param gebruikerId
     */
    public void setGebruikerId(java.lang.String gebruikerId) {
        this.gebruikerId = gebruikerId;
    }


    /**
     * Gets the id value for this Order.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Order.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the orderRegel value for this Order.
     * 
     * @return orderRegel
     */
    public org.datacontract.schemas._2004._07.WcfWebShopLibrary.OrderRegel[] getOrderRegel() {
        return orderRegel;
    }


    /**
     * Sets the orderRegel value for this Order.
     * 
     * @param orderRegel
     */
    public void setOrderRegel(org.datacontract.schemas._2004._07.WcfWebShopLibrary.OrderRegel[] orderRegel) {
        this.orderRegel = orderRegel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datum==null && other.getDatum()==null) || 
             (this.datum!=null &&
              this.datum.equals(other.getDatum()))) &&
            ((this.gebruiker==null && other.getGebruiker()==null) || 
             (this.gebruiker!=null &&
              this.gebruiker.equals(other.getGebruiker()))) &&
            ((this.gebruikerId==null && other.getGebruikerId()==null) || 
             (this.gebruikerId!=null &&
              this.gebruikerId.equals(other.getGebruikerId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.orderRegel==null && other.getOrderRegel()==null) || 
             (this.orderRegel!=null &&
              java.util.Arrays.equals(this.orderRegel, other.getOrderRegel())));
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
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getGebruiker() != null) {
            _hashCode += getGebruiker().hashCode();
        }
        if (getGebruikerId() != null) {
            _hashCode += getGebruikerId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gebruiker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Gebruiker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Gebruiker"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gebruikerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "GebruikerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderRegel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "OrderRegel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "OrderRegel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "OrderRegel"));
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
