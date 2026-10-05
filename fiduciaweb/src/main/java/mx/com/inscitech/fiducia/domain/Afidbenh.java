package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Afidbenh extends DomainObject {

    BigDecimal afbAnteproyecto = null;
    String afbCvePersona = null;
    BigDecimal afbNumFidben = null;
    String afbNomFidben = null;
    String afbTelFidben = null;
    String afbCveStFidBen = null;
    String afbCalleNum = null;
    String afbNomColonia = null;
    String afbNomPoblacion = null;
    BigDecimal afbCodigoPostal = null;
    BigDecimal afbNumEstado = null;
    String afbNomEstado = null;
    BigDecimal afbNumPais = null;
    String afbNomPais = null;
    String afbCurp = null;
    String afbTipoPersona = null;
    String afbNomMunicipio = null;

    public Afidbenh() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAfbAnteproyecto(BigDecimal afbAnteproyecto) {
        this.afbAnteproyecto = afbAnteproyecto;
    }

    public BigDecimal getAfbAnteproyecto() {
        return this.afbAnteproyecto;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbCvePersona(String afbCvePersona) {
        this.afbCvePersona = afbCvePersona;
    }

    public String getAfbCvePersona() {
        return this.afbCvePersona;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAfbNumFidben(BigDecimal afbNumFidben) {
        this.afbNumFidben = afbNumFidben;
    }

    public BigDecimal getAfbNumFidben() {
        return this.afbNumFidben;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbNomFidben(String afbNomFidben) {
        this.afbNomFidben = afbNomFidben;
    }

    public String getAfbNomFidben() {
        return this.afbNomFidben;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbTelFidben(String afbTelFidben) {
        this.afbTelFidben = afbTelFidben;
    }

    public String getAfbTelFidben() {
        return this.afbTelFidben;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbCveStFidBen(String afbCveStFidBen) {
        this.afbCveStFidBen = afbCveStFidBen;
    }

    public String getAfbCveStFidBen() {
        return this.afbCveStFidBen;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbCalleNum(String afbCalleNum) {
        this.afbCalleNum = afbCalleNum;
    }

    public String getAfbCalleNum() {
        return this.afbCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbNomColonia(String afbNomColonia) {
        this.afbNomColonia = afbNomColonia;
    }

    public String getAfbNomColonia() {
        return this.afbNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbNomPoblacion(String afbNomPoblacion) {
        this.afbNomPoblacion = afbNomPoblacion;
    }

    public String getAfbNomPoblacion() {
        return this.afbNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setAfbCodigoPostal(BigDecimal afbCodigoPostal) {
        this.afbCodigoPostal = afbCodigoPostal;
    }

    public BigDecimal getAfbCodigoPostal() {
        return this.afbCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAfbNumEstado(BigDecimal afbNumEstado) {
        this.afbNumEstado = afbNumEstado;
    }

    public BigDecimal getAfbNumEstado() {
        return this.afbNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbNomEstado(String afbNomEstado) {
        this.afbNomEstado = afbNomEstado;
    }

    public String getAfbNomEstado() {
        return this.afbNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAfbNumPais(BigDecimal afbNumPais) {
        this.afbNumPais = afbNumPais;
    }

    public BigDecimal getAfbNumPais() {
        return this.afbNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbNomPais(String afbNomPais) {
        this.afbNomPais = afbNomPais;
    }

    public String getAfbNomPais() {
        return this.afbNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbCurp(String afbCurp) {
        this.afbCurp = afbCurp;
    }

    public String getAfbCurp() {
        return this.afbCurp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbTipoPersona(String afbTipoPersona) {
        this.afbTipoPersona = afbTipoPersona;
    }

    public String getAfbTipoPersona() {
        return this.afbTipoPersona;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfbNomMunicipio(String afbNomMunicipio) {
        this.afbNomMunicipio = afbNomMunicipio;
    }

    public String getAfbNomMunicipio() {
        return this.afbNomMunicipio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AFIDBENH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getSelect() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AFIDBENH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAfbAnteproyecto() != null && this.getAfbAnteproyecto().longValue() == -999) {
            conditions += " AND AFB_ANTEPROYECTO IS NULL";
        } else if (this.getAfbAnteproyecto() != null) {
            conditions += " AND AFB_ANTEPROYECTO = ?";
            values.add(this.getAfbAnteproyecto());
        }

        if (this.getAfbCvePersona() != null && "null".equals(this.getAfbCvePersona())) {
            conditions += " AND AFB_CVE_PERSONA IS NULL";
        } else if (this.getAfbCvePersona() != null) {
            conditions += " AND AFB_CVE_PERSONA = ?";
            values.add(this.getAfbCvePersona());
        }

        if (this.getAfbNumFidben() != null && this.getAfbNumFidben().longValue() == -999) {
            conditions += " AND AFB_NUM_FIDBEN IS NULL";
        } else if (this.getAfbNumFidben() != null) {
            conditions += " AND AFB_NUM_FIDBEN = ?";
            values.add(this.getAfbNumFidben());
        }

        if (this.getAfbNomFidben() != null && "null".equals(this.getAfbNomFidben())) {
            conditions += " AND AFB_NOM_FIDBEN IS NULL";
        } else if (this.getAfbNomFidben() != null) {
            conditions += " AND AFB_NOM_FIDBEN = ?";
            values.add(this.getAfbNomFidben());
        }

        if (this.getAfbTelFidben() != null && "null".equals(this.getAfbTelFidben())) {
            conditions += " AND AFB_TEL_FIDBEN IS NULL";
        } else if (this.getAfbTelFidben() != null) {
            conditions += " AND AFB_TEL_FIDBEN = ?";
            values.add(this.getAfbTelFidben());
        }

        if (this.getAfbCveStFidBen() != null && "null".equals(this.getAfbCveStFidBen())) {
            conditions += " AND AFB_CVE_ST_FID_BEN IS NULL";
        } else if (this.getAfbCveStFidBen() != null) {
            conditions += " AND AFB_CVE_ST_FID_BEN = ?";
            values.add(this.getAfbCveStFidBen());
        }

        if (this.getAfbCalleNum() != null && "null".equals(this.getAfbCalleNum())) {
            conditions += " AND AFB_CALLE_NUM IS NULL";
        } else if (this.getAfbCalleNum() != null) {
            conditions += " AND AFB_CALLE_NUM = ?";
            values.add(this.getAfbCalleNum());
        }

        if (this.getAfbNomColonia() != null && "null".equals(this.getAfbNomColonia())) {
            conditions += " AND AFB_NOM_COLONIA IS NULL";
        } else if (this.getAfbNomColonia() != null) {
            conditions += " AND AFB_NOM_COLONIA = ?";
            values.add(this.getAfbNomColonia());
        }

        if (this.getAfbNomPoblacion() != null && "null".equals(this.getAfbNomPoblacion())) {
            conditions += " AND AFB_NOM_POBLACION IS NULL";
        } else if (this.getAfbNomPoblacion() != null) {
            conditions += " AND AFB_NOM_POBLACION = ?";
            values.add(this.getAfbNomPoblacion());
        }

        if (this.getAfbCodigoPostal() != null && this.getAfbCodigoPostal().longValue() == -999) {
            conditions += " AND AFB_CODIGO_POSTAL IS NULL";
        } else if (this.getAfbCodigoPostal() != null) {
            conditions += " AND AFB_CODIGO_POSTAL = ?";
            values.add(this.getAfbCodigoPostal());
        }

        if (this.getAfbNumEstado() != null && this.getAfbNumEstado().longValue() == -999) {
            conditions += " AND AFB_NUM_ESTADO IS NULL";
        } else if (this.getAfbNumEstado() != null) {
            conditions += " AND AFB_NUM_ESTADO = ?";
            values.add(this.getAfbNumEstado());
        }

        if (this.getAfbNomEstado() != null && "null".equals(this.getAfbNomEstado())) {
            conditions += " AND AFB_NOM_ESTADO IS NULL";
        } else if (this.getAfbNomEstado() != null) {
            conditions += " AND AFB_NOM_ESTADO = ?";
            values.add(this.getAfbNomEstado());
        }

        if (this.getAfbNumPais() != null && this.getAfbNumPais().longValue() == -999) {
            conditions += " AND AFB_NUM_PAIS IS NULL";
        } else if (this.getAfbNumPais() != null) {
            conditions += " AND AFB_NUM_PAIS = ?";
            values.add(this.getAfbNumPais());
        }

        if (this.getAfbNomPais() != null && "null".equals(this.getAfbNomPais())) {
            conditions += " AND AFB_NOM_PAIS IS NULL";
        } else if (this.getAfbNomPais() != null) {
            conditions += " AND AFB_NOM_PAIS = ?";
            values.add(this.getAfbNomPais());
        }

        if (this.getAfbCurp() != null && "null".equals(this.getAfbCurp())) {
            conditions += " AND AFB_CURP IS NULL";
        } else if (this.getAfbCurp() != null) {
            conditions += " AND AFB_CURP = ?";
            values.add(this.getAfbCurp());
        }

        if (this.getAfbTipoPersona() != null && "null".equals(this.getAfbTipoPersona())) {
            conditions += " AND AFB_TIPO_PERSONA IS NULL";
        } else if (this.getAfbTipoPersona() != null) {
            conditions += " AND AFB_TIPO_PERSONA = ?";
            values.add(this.getAfbTipoPersona());
        }

        if (this.getAfbNomMunicipio() != null && "null".equals(this.getAfbNomMunicipio())) {
            conditions += " AND AFB_NOM_MUNICIPIO IS NULL";
        } else if (this.getAfbNomMunicipio() != null) {
            conditions += " AND AFB_NOM_MUNICIPIO = ?";
            values.add(this.getAfbNomMunicipio());
        }

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getUpdate() {
        DMLObject result = new DMLObject();
        String sql = "UPDATE AFIDBENH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " AFB_ANTEPROYECTO = ?, ";
        values.add(this.getAfbAnteproyecto());
        fields += " AFB_CVE_PERSONA = ?, ";
        values.add(this.getAfbCvePersona());
        fields += " AFB_NUM_FIDBEN = ?, ";
        values.add(this.getAfbNumFidben());
        fields += " AFB_NOM_FIDBEN = ?, ";
        values.add(this.getAfbNomFidben());
        fields += " AFB_TEL_FIDBEN = ?, ";
        values.add(this.getAfbTelFidben());
        fields += " AFB_CVE_ST_FID_BEN = ?, ";
        values.add(this.getAfbCveStFidBen());
        fields += " AFB_CALLE_NUM = ?, ";
        values.add(this.getAfbCalleNum());
        fields += " AFB_NOM_COLONIA = ?, ";
        values.add(this.getAfbNomColonia());
        fields += " AFB_NOM_POBLACION = ?, ";
        values.add(this.getAfbNomPoblacion());
        fields += " AFB_CODIGO_POSTAL = ?, ";
        values.add(this.getAfbCodigoPostal());
        fields += " AFB_NUM_ESTADO = ?, ";
        values.add(this.getAfbNumEstado());
        fields += " AFB_NOM_ESTADO = ?, ";
        values.add(this.getAfbNomEstado());
        fields += " AFB_NUM_PAIS = ?, ";
        values.add(this.getAfbNumPais());
        fields += " AFB_NOM_PAIS = ?, ";
        values.add(this.getAfbNomPais());
        fields += " AFB_CURP = ?, ";
        values.add(this.getAfbCurp());
        fields += " AFB_TIPO_PERSONA = ?, ";
        values.add(this.getAfbTipoPersona());
        fields += " AFB_NOM_MUNICIPIO = ?, ";
        values.add(this.getAfbNomMunicipio());
        for (int i = 0; i < pkValues.size(); i++) {
            values.add(pkValues.get(i));
        }
        ;

        fields = fields.substring(0, fields.length() - 2).trim();
        conditions = conditions.substring(4).trim();
        sql += fields + " WHERE " + conditions;
        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getInsert() {
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO AFIDBENH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AFB_ANTEPROYECTO";
        fieldValues += ", ?";
        values.add(this.getAfbAnteproyecto());

        fields += ", AFB_CVE_PERSONA";
        fieldValues += ", ?";
        values.add(this.getAfbCvePersona());

        fields += ", AFB_NUM_FIDBEN";
        fieldValues += ", ?";
        values.add(this.getAfbNumFidben());

        fields += ", AFB_NOM_FIDBEN";
        fieldValues += ", ?";
        values.add(this.getAfbNomFidben());

        fields += ", AFB_TEL_FIDBEN";
        fieldValues += ", ?";
        values.add(this.getAfbTelFidben());

        fields += ", AFB_CVE_ST_FID_BEN";
        fieldValues += ", ?";
        values.add(this.getAfbCveStFidBen());

        fields += ", AFB_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getAfbCalleNum());

        fields += ", AFB_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getAfbNomColonia());

        fields += ", AFB_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getAfbNomPoblacion());

        fields += ", AFB_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getAfbCodigoPostal());

        fields += ", AFB_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getAfbNumEstado());

        fields += ", AFB_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getAfbNomEstado());

        fields += ", AFB_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getAfbNumPais());

        fields += ", AFB_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getAfbNomPais());

        fields += ", AFB_CURP";
        fieldValues += ", ?";
        values.add(this.getAfbCurp());

        fields += ", AFB_TIPO_PERSONA";
        fieldValues += ", ?";
        values.add(this.getAfbTipoPersona());

        fields += ", AFB_NOM_MUNICIPIO";
        fieldValues += ", ?";
        values.add(this.getAfbNomMunicipio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AFIDBENH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Afidbenh instance = (Afidbenh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAfbAnteproyecto().equals(instance.getAfbAnteproyecto()))
            equalObjects = false;
        if (equalObjects && !this.getAfbCvePersona().equals(instance.getAfbCvePersona()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNumFidben().equals(instance.getAfbNumFidben()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNomFidben().equals(instance.getAfbNomFidben()))
            equalObjects = false;
        if (equalObjects && !this.getAfbTelFidben().equals(instance.getAfbTelFidben()))
            equalObjects = false;
        if (equalObjects && !this.getAfbCveStFidBen().equals(instance.getAfbCveStFidBen()))
            equalObjects = false;
        if (equalObjects && !this.getAfbCalleNum().equals(instance.getAfbCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNomColonia().equals(instance.getAfbNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNomPoblacion().equals(instance.getAfbNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getAfbCodigoPostal().equals(instance.getAfbCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNumEstado().equals(instance.getAfbNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNomEstado().equals(instance.getAfbNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNumPais().equals(instance.getAfbNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNomPais().equals(instance.getAfbNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getAfbCurp().equals(instance.getAfbCurp()))
            equalObjects = false;
        if (equalObjects && !this.getAfbTipoPersona().equals(instance.getAfbTipoPersona()))
            equalObjects = false;
        if (equalObjects && !this.getAfbNomMunicipio().equals(instance.getAfbNomMunicipio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Afidbenh result = new Afidbenh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAfbAnteproyecto((BigDecimal) objectData.getData("AFB_ANTEPROYECTO"));
        result.setAfbCvePersona((String) objectData.getData("AFB_CVE_PERSONA"));
        result.setAfbNumFidben((BigDecimal) objectData.getData("AFB_NUM_FIDBEN"));
        result.setAfbNomFidben((String) objectData.getData("AFB_NOM_FIDBEN"));
        result.setAfbTelFidben((String) objectData.getData("AFB_TEL_FIDBEN"));
        result.setAfbCveStFidBen((String) objectData.getData("AFB_CVE_ST_FID_BEN"));
        result.setAfbCalleNum((String) objectData.getData("AFB_CALLE_NUM"));
        result.setAfbNomColonia((String) objectData.getData("AFB_NOM_COLONIA"));
        result.setAfbNomPoblacion((String) objectData.getData("AFB_NOM_POBLACION"));
        result.setAfbCodigoPostal((BigDecimal) objectData.getData("AFB_CODIGO_POSTAL"));
        result.setAfbNumEstado((BigDecimal) objectData.getData("AFB_NUM_ESTADO"));
        result.setAfbNomEstado((String) objectData.getData("AFB_NOM_ESTADO"));
        result.setAfbNumPais((BigDecimal) objectData.getData("AFB_NUM_PAIS"));
        result.setAfbNomPais((String) objectData.getData("AFB_NOM_PAIS"));
        result.setAfbCurp((String) objectData.getData("AFB_CURP"));
        result.setAfbTipoPersona((String) objectData.getData("AFB_TIPO_PERSONA"));
        result.setAfbNomMunicipio((String) objectData.getData("AFB_NOM_MUNICIPIO"));

        return result;

    }

}
