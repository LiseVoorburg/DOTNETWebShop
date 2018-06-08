/**
 * OrderRegel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.WcfWebShopLibrary;

public class OrderRegel  implements java.io.Serializable {
    private java.lang.Integer aantal;

    private java.lang.Integer id;

    private org.datacontract.schemas._2004._07.WcfWebShopLibrary.Order order;

    private java.lang.Integer orderId;

    private org.datacontract.schemas._2004._07.WcfWebShopLibrary.Product product;

    public OrderRegel() {
    }

    public OrderRegel(
           java.lang.Integer aantal,
           java.lang.Integer id,
           org.datacontract.schemas._2004._07.WcfWebShopLibrary.Order order,
           java.lang.Integer orderId,
           org.datacontract.schemas._2004._07.WcfWebShopLibrary.Product product) {
           this.aantal = aantal;
           this.id = id;
           this.order = order;
           this.orderId = orderId;
           this.product = product;
    }


    /**
     * Gets the aantal value for this OrderRegel.
     * 
     * @return aantal
     */
    public java.lang.Integer getAantal() {
        return aantal;
    }


    /**
     * Sets the aantal value for this OrderRegel.
     * 
     * @param aantal
     */
    public void setAantal(java.lang.Integer aantal) {
        this.aantal = aantal;
    }


    /**
     * Gets the id value for this OrderRegel.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this OrderRegel.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the order value for this OrderRegel.
     * 
     * @return order
     */
    public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Order getOrder() {
        return order;
    }


    /**
     * Sets the order value for this OrderRegel.
     * 
     * @param order
     */
    public void setOrder(org.datacontract.schemas._2004._07.WcfWebShopLibrary.Order order) {
        this.order = order;
    }


    /**
     * Gets the orderId value for this OrderRegel.
     * 
     * @return orderId
     */
    public java.lang.Integer getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderRegel.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the product value for this OrderRegel.
     * 
     * @return product
     */
    public org.datacontract.schemas._2004._07.WcfWebShopLibrary.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this OrderRegel.
     * 
     * @param product
     */
    public void setProduct(org.datacontract.schemas._2004._07.WcfWebShopLibrary.Product product) {
        this.product = product;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderRegel)) return false;
        OrderRegel other = (OrderRegel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aantal==null && other.getAantal()==null) || 
             (this.aantal!=null &&
              this.aantal.equals(other.getAantal()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct())));
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
        if (getAantal() != null) {
            _hashCode += getAantal().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderRegel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "OrderRegel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Aantal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Order"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "OrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfWebShopLibrary", "Product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
