/**
 * Bachelier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Bachelier  implements java.io.Serializable {
    private java.lang.String cin;

    private int id;

    private java.lang.String nomprenom;

    private double noteanglais;

    private double notearabe;

    private double notemath;

    private double notephys;

    private java.lang.String numetud;

    public Bachelier() {
    }

    public Bachelier(
           java.lang.String cin,
           int id,
           java.lang.String nomprenom,
           double noteanglais,
           double notearabe,
           double notemath,
           double notephys,
           java.lang.String numetud) {
           this.cin = cin;
           this.id = id;
           this.nomprenom = nomprenom;
           this.noteanglais = noteanglais;
           this.notearabe = notearabe;
           this.notemath = notemath;
           this.notephys = notephys;
           this.numetud = numetud;
    }


    /**
     * Gets the cin value for this Bachelier.
     * 
     * @return cin
     */
    public java.lang.String getCin() {
        return cin;
    }


    /**
     * Sets the cin value for this Bachelier.
     * 
     * @param cin
     */
    public void setCin(java.lang.String cin) {
        this.cin = cin;
    }


    /**
     * Gets the id value for this Bachelier.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Bachelier.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nomprenom value for this Bachelier.
     * 
     * @return nomprenom
     */
    public java.lang.String getNomprenom() {
        return nomprenom;
    }


    /**
     * Sets the nomprenom value for this Bachelier.
     * 
     * @param nomprenom
     */
    public void setNomprenom(java.lang.String nomprenom) {
        this.nomprenom = nomprenom;
    }


    /**
     * Gets the noteanglais value for this Bachelier.
     * 
     * @return noteanglais
     */
    public double getNoteanglais() {
        return noteanglais;
    }


    /**
     * Sets the noteanglais value for this Bachelier.
     * 
     * @param noteanglais
     */
    public void setNoteanglais(double noteanglais) {
        this.noteanglais = noteanglais;
    }


    /**
     * Gets the notearabe value for this Bachelier.
     * 
     * @return notearabe
     */
    public double getNotearabe() {
        return notearabe;
    }


    /**
     * Sets the notearabe value for this Bachelier.
     * 
     * @param notearabe
     */
    public void setNotearabe(double notearabe) {
        this.notearabe = notearabe;
    }


    /**
     * Gets the notemath value for this Bachelier.
     * 
     * @return notemath
     */
    public double getNotemath() {
        return notemath;
    }


    /**
     * Sets the notemath value for this Bachelier.
     * 
     * @param notemath
     */
    public void setNotemath(double notemath) {
        this.notemath = notemath;
    }


    /**
     * Gets the notephys value for this Bachelier.
     * 
     * @return notephys
     */
    public double getNotephys() {
        return notephys;
    }


    /**
     * Sets the notephys value for this Bachelier.
     * 
     * @param notephys
     */
    public void setNotephys(double notephys) {
        this.notephys = notephys;
    }


    /**
     * Gets the numetud value for this Bachelier.
     * 
     * @return numetud
     */
    public java.lang.String getNumetud() {
        return numetud;
    }


    /**
     * Sets the numetud value for this Bachelier.
     * 
     * @param numetud
     */
    public void setNumetud(java.lang.String numetud) {
        this.numetud = numetud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bachelier)) return false;
        Bachelier other = (Bachelier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cin==null && other.getCin()==null) || 
             (this.cin!=null &&
              this.cin.equals(other.getCin()))) &&
            this.id == other.getId() &&
            ((this.nomprenom==null && other.getNomprenom()==null) || 
             (this.nomprenom!=null &&
              this.nomprenom.equals(other.getNomprenom()))) &&
            this.noteanglais == other.getNoteanglais() &&
            this.notearabe == other.getNotearabe() &&
            this.notemath == other.getNotemath() &&
            this.notephys == other.getNotephys() &&
            ((this.numetud==null && other.getNumetud()==null) || 
             (this.numetud!=null &&
              this.numetud.equals(other.getNumetud())));
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
        if (getCin() != null) {
            _hashCode += getCin().hashCode();
        }
        _hashCode += getId();
        if (getNomprenom() != null) {
            _hashCode += getNomprenom().hashCode();
        }
        _hashCode += new Double(getNoteanglais()).hashCode();
        _hashCode += new Double(getNotearabe()).hashCode();
        _hashCode += new Double(getNotemath()).hashCode();
        _hashCode += new Double(getNotephys()).hashCode();
        if (getNumetud() != null) {
            _hashCode += getNumetud().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bachelier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "bachelier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomprenom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomprenom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteanglais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noteanglais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notearabe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notearabe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notemath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notemath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notephys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notephys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numetud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numetud"));
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
