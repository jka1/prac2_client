/**
 * CaracteristicaTipoLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public class CaracteristicaTipoLocal  implements java.io.Serializable {
    private java.lang.Long codiCaracteristica;

    private java.lang.Long codiCaracteristicaTipoLocal;

    private java.lang.Long codiTipoLocal;

    public CaracteristicaTipoLocal() {
    }

    public CaracteristicaTipoLocal(
           java.lang.Long codiCaracteristica,
           java.lang.Long codiCaracteristicaTipoLocal,
           java.lang.Long codiTipoLocal) {
           this.codiCaracteristica = codiCaracteristica;
           this.codiCaracteristicaTipoLocal = codiCaracteristicaTipoLocal;
           this.codiTipoLocal = codiTipoLocal;
    }


    /**
     * Gets the codiCaracteristica value for this CaracteristicaTipoLocal.
     * 
     * @return codiCaracteristica
     */
    public java.lang.Long getCodiCaracteristica() {
        return codiCaracteristica;
    }


    /**
     * Sets the codiCaracteristica value for this CaracteristicaTipoLocal.
     * 
     * @param codiCaracteristica
     */
    public void setCodiCaracteristica(java.lang.Long codiCaracteristica) {
        this.codiCaracteristica = codiCaracteristica;
    }


    /**
     * Gets the codiCaracteristicaTipoLocal value for this CaracteristicaTipoLocal.
     * 
     * @return codiCaracteristicaTipoLocal
     */
    public java.lang.Long getCodiCaracteristicaTipoLocal() {
        return codiCaracteristicaTipoLocal;
    }


    /**
     * Sets the codiCaracteristicaTipoLocal value for this CaracteristicaTipoLocal.
     * 
     * @param codiCaracteristicaTipoLocal
     */
    public void setCodiCaracteristicaTipoLocal(java.lang.Long codiCaracteristicaTipoLocal) {
        this.codiCaracteristicaTipoLocal = codiCaracteristicaTipoLocal;
    }


    /**
     * Gets the codiTipoLocal value for this CaracteristicaTipoLocal.
     * 
     * @return codiTipoLocal
     */
    public java.lang.Long getCodiTipoLocal() {
        return codiTipoLocal;
    }


    /**
     * Sets the codiTipoLocal value for this CaracteristicaTipoLocal.
     * 
     * @param codiTipoLocal
     */
    public void setCodiTipoLocal(java.lang.Long codiTipoLocal) {
        this.codiTipoLocal = codiTipoLocal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaracteristicaTipoLocal)) return false;
        CaracteristicaTipoLocal other = (CaracteristicaTipoLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiCaracteristica==null && other.getCodiCaracteristica()==null) || 
             (this.codiCaracteristica!=null &&
              this.codiCaracteristica.equals(other.getCodiCaracteristica()))) &&
            ((this.codiCaracteristicaTipoLocal==null && other.getCodiCaracteristicaTipoLocal()==null) || 
             (this.codiCaracteristicaTipoLocal!=null &&
              this.codiCaracteristicaTipoLocal.equals(other.getCodiCaracteristicaTipoLocal()))) &&
            ((this.codiTipoLocal==null && other.getCodiTipoLocal()==null) || 
             (this.codiTipoLocal!=null &&
              this.codiTipoLocal.equals(other.getCodiTipoLocal())));
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
        if (getCodiCaracteristica() != null) {
            _hashCode += getCodiCaracteristica().hashCode();
        }
        if (getCodiCaracteristicaTipoLocal() != null) {
            _hashCode += getCodiCaracteristicaTipoLocal().hashCode();
        }
        if (getCodiTipoLocal() != null) {
            _hashCode += getCodiTipoLocal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaracteristicaTipoLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server/", "caracteristicaTipoLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCaracteristicaTipoLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCaracteristicaTipoLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiTipoLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiTipoLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
