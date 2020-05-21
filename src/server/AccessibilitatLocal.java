/**
 * AccessibilitatLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public class AccessibilitatLocal  implements java.io.Serializable {
    private java.lang.Long codiAccessibilitat;

    private java.lang.Long codiCaracteristica;

    private java.lang.Long codiLocal;

    private java.lang.String nomCaracteristicaCa;

    private java.lang.String nomCaracteristicaEn;

    private java.lang.String nomCaracteristicaEs;

    private java.lang.Integer tipusCaracteristica;

    private java.lang.Long valor;

    private java.lang.String verificat;

    public AccessibilitatLocal() {
    }

    public AccessibilitatLocal(
           java.lang.Long codiAccessibilitat,
           java.lang.Long codiCaracteristica,
           java.lang.Long codiLocal,
           java.lang.String nomCaracteristicaCa,
           java.lang.String nomCaracteristicaEn,
           java.lang.String nomCaracteristicaEs,
           java.lang.Integer tipusCaracteristica,
           java.lang.Long valor,
           java.lang.String verificat) {
           this.codiAccessibilitat = codiAccessibilitat;
           this.codiCaracteristica = codiCaracteristica;
           this.codiLocal = codiLocal;
           this.nomCaracteristicaCa = nomCaracteristicaCa;
           this.nomCaracteristicaEn = nomCaracteristicaEn;
           this.nomCaracteristicaEs = nomCaracteristicaEs;
           this.tipusCaracteristica = tipusCaracteristica;
           this.valor = valor;
           this.verificat = verificat;
    }


    /**
     * Gets the codiAccessibilitat value for this AccessibilitatLocal.
     * 
     * @return codiAccessibilitat
     */
    public java.lang.Long getCodiAccessibilitat() {
        return codiAccessibilitat;
    }


    /**
     * Sets the codiAccessibilitat value for this AccessibilitatLocal.
     * 
     * @param codiAccessibilitat
     */
    public void setCodiAccessibilitat(java.lang.Long codiAccessibilitat) {
        this.codiAccessibilitat = codiAccessibilitat;
    }


    /**
     * Gets the codiCaracteristica value for this AccessibilitatLocal.
     * 
     * @return codiCaracteristica
     */
    public java.lang.Long getCodiCaracteristica() {
        return codiCaracteristica;
    }


    /**
     * Sets the codiCaracteristica value for this AccessibilitatLocal.
     * 
     * @param codiCaracteristica
     */
    public void setCodiCaracteristica(java.lang.Long codiCaracteristica) {
        this.codiCaracteristica = codiCaracteristica;
    }


    /**
     * Gets the codiLocal value for this AccessibilitatLocal.
     * 
     * @return codiLocal
     */
    public java.lang.Long getCodiLocal() {
        return codiLocal;
    }


    /**
     * Sets the codiLocal value for this AccessibilitatLocal.
     * 
     * @param codiLocal
     */
    public void setCodiLocal(java.lang.Long codiLocal) {
        this.codiLocal = codiLocal;
    }


    /**
     * Gets the nomCaracteristicaCa value for this AccessibilitatLocal.
     * 
     * @return nomCaracteristicaCa
     */
    public java.lang.String getNomCaracteristicaCa() {
        return nomCaracteristicaCa;
    }


    /**
     * Sets the nomCaracteristicaCa value for this AccessibilitatLocal.
     * 
     * @param nomCaracteristicaCa
     */
    public void setNomCaracteristicaCa(java.lang.String nomCaracteristicaCa) {
        this.nomCaracteristicaCa = nomCaracteristicaCa;
    }


    /**
     * Gets the nomCaracteristicaEn value for this AccessibilitatLocal.
     * 
     * @return nomCaracteristicaEn
     */
    public java.lang.String getNomCaracteristicaEn() {
        return nomCaracteristicaEn;
    }


    /**
     * Sets the nomCaracteristicaEn value for this AccessibilitatLocal.
     * 
     * @param nomCaracteristicaEn
     */
    public void setNomCaracteristicaEn(java.lang.String nomCaracteristicaEn) {
        this.nomCaracteristicaEn = nomCaracteristicaEn;
    }


    /**
     * Gets the nomCaracteristicaEs value for this AccessibilitatLocal.
     * 
     * @return nomCaracteristicaEs
     */
    public java.lang.String getNomCaracteristicaEs() {
        return nomCaracteristicaEs;
    }


    /**
     * Sets the nomCaracteristicaEs value for this AccessibilitatLocal.
     * 
     * @param nomCaracteristicaEs
     */
    public void setNomCaracteristicaEs(java.lang.String nomCaracteristicaEs) {
        this.nomCaracteristicaEs = nomCaracteristicaEs;
    }


    /**
     * Gets the tipusCaracteristica value for this AccessibilitatLocal.
     * 
     * @return tipusCaracteristica
     */
    public java.lang.Integer getTipusCaracteristica() {
        return tipusCaracteristica;
    }


    /**
     * Sets the tipusCaracteristica value for this AccessibilitatLocal.
     * 
     * @param tipusCaracteristica
     */
    public void setTipusCaracteristica(java.lang.Integer tipusCaracteristica) {
        this.tipusCaracteristica = tipusCaracteristica;
    }


    /**
     * Gets the valor value for this AccessibilitatLocal.
     * 
     * @return valor
     */
    public java.lang.Long getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this AccessibilitatLocal.
     * 
     * @param valor
     */
    public void setValor(java.lang.Long valor) {
        this.valor = valor;
    }


    /**
     * Gets the verificat value for this AccessibilitatLocal.
     * 
     * @return verificat
     */
    public java.lang.String getVerificat() {
        return verificat;
    }


    /**
     * Sets the verificat value for this AccessibilitatLocal.
     * 
     * @param verificat
     */
    public void setVerificat(java.lang.String verificat) {
        this.verificat = verificat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessibilitatLocal)) return false;
        AccessibilitatLocal other = (AccessibilitatLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiAccessibilitat==null && other.getCodiAccessibilitat()==null) || 
             (this.codiAccessibilitat!=null &&
              this.codiAccessibilitat.equals(other.getCodiAccessibilitat()))) &&
            ((this.codiCaracteristica==null && other.getCodiCaracteristica()==null) || 
             (this.codiCaracteristica!=null &&
              this.codiCaracteristica.equals(other.getCodiCaracteristica()))) &&
            ((this.codiLocal==null && other.getCodiLocal()==null) || 
             (this.codiLocal!=null &&
              this.codiLocal.equals(other.getCodiLocal()))) &&
            ((this.nomCaracteristicaCa==null && other.getNomCaracteristicaCa()==null) || 
             (this.nomCaracteristicaCa!=null &&
              this.nomCaracteristicaCa.equals(other.getNomCaracteristicaCa()))) &&
            ((this.nomCaracteristicaEn==null && other.getNomCaracteristicaEn()==null) || 
             (this.nomCaracteristicaEn!=null &&
              this.nomCaracteristicaEn.equals(other.getNomCaracteristicaEn()))) &&
            ((this.nomCaracteristicaEs==null && other.getNomCaracteristicaEs()==null) || 
             (this.nomCaracteristicaEs!=null &&
              this.nomCaracteristicaEs.equals(other.getNomCaracteristicaEs()))) &&
            ((this.tipusCaracteristica==null && other.getTipusCaracteristica()==null) || 
             (this.tipusCaracteristica!=null &&
              this.tipusCaracteristica.equals(other.getTipusCaracteristica()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.verificat==null && other.getVerificat()==null) || 
             (this.verificat!=null &&
              this.verificat.equals(other.getVerificat())));
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
        if (getCodiAccessibilitat() != null) {
            _hashCode += getCodiAccessibilitat().hashCode();
        }
        if (getCodiCaracteristica() != null) {
            _hashCode += getCodiCaracteristica().hashCode();
        }
        if (getCodiLocal() != null) {
            _hashCode += getCodiLocal().hashCode();
        }
        if (getNomCaracteristicaCa() != null) {
            _hashCode += getNomCaracteristicaCa().hashCode();
        }
        if (getNomCaracteristicaEn() != null) {
            _hashCode += getNomCaracteristicaEn().hashCode();
        }
        if (getNomCaracteristicaEs() != null) {
            _hashCode += getNomCaracteristicaEs().hashCode();
        }
        if (getTipusCaracteristica() != null) {
            _hashCode += getTipusCaracteristica().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getVerificat() != null) {
            _hashCode += getVerificat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessibilitatLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server/", "accessibilitatLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiAccessibilitat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiAccessibilitat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCaracteristicaCa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomCaracteristicaCa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCaracteristicaEn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomCaracteristicaEn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCaracteristicaEs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomCaracteristicaEs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipusCaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipusCaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verificat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
