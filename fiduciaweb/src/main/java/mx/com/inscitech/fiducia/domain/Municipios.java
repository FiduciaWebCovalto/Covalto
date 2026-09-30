package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "MUNICIPIOS_PK", columns = { "MUN_ENT_CLAVE", "MUN_CLAVE" }, sequences = { "MANUAL" })
public class Municipios extends DomainObject {

    BigDecimal munEntClave = null;
    BigDecimal munClave = null;
    String munNombre = null;
    BigDecimal munAnoAltaReg = null;
    BigDecimal munMesAltaReg = null;
    BigDecimal munDiaAltaReg = null;
    BigDecimal munAnoUltMod = null;
    BigDecimal munMesUltMod = null;
    BigDecimal munDiaUltMod = null;
    String munCveStMunicip = null;
    BigDecimal munPlazo = null;

    public Municipios() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMunEntClave(BigDecimal munEntClave) {
        this.munEntClave = munEntClave;
    }

    public BigDecimal getMunEntClave() {
        return this.munEntClave;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setMunClave(BigDecimal munClave) {
        this.munClave = munClave;
    }

    public BigDecimal getMunClave() {
        return this.munClave;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMunNombre(String munNombre) {
        this.munNombre = munNombre;
    }

    public String getMunNombre() {
        return this.munNombre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMunAnoAltaReg(BigDecimal munAnoAltaReg) {
        this.munAnoAltaReg = munAnoAltaReg;
    }

    public BigDecimal getMunAnoAltaReg() {
        return this.munAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMunMesAltaReg(BigDecimal munMesAltaReg) {
        this.munMesAltaReg = munMesAltaReg;
    }

    public BigDecimal getMunMesAltaReg() {
        return this.munMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMunDiaAltaReg(BigDecimal munDiaAltaReg) {
        this.munDiaAltaReg = munDiaAltaReg;
    }

    public BigDecimal getMunDiaAltaReg() {
        return this.munDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMunAnoUltMod(BigDecimal munAnoUltMod) {
        this.munAnoUltMod = munAnoUltMod;
    }

    public BigDecimal getMunAnoUltMod() {
        return this.munAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMunMesUltMod(BigDecimal munMesUltMod) {
        this.munMesUltMod = munMesUltMod;
    }

    public BigDecimal getMunMesUltMod() {
        return this.munMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMunDiaUltMod(BigDecimal munDiaUltMod) {
        this.munDiaUltMod = munDiaUltMod;
    }

    public BigDecimal getMunDiaUltMod() {
        return this.munDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMunCveStMunicip(String munCveStMunicip) {
        this.munCveStMunicip = munCveStMunicip;
    }

    public String getMunCveStMunicip() {
        return this.munCveStMunicip;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setMunPlazo(BigDecimal munPlazo) {
        this.munPlazo = munPlazo;
    }

    public BigDecimal getMunPlazo() {
        return this.munPlazo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM MUNICIPIOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMunEntClave() != null && this.getMunEntClave().longValue() == -999) {
            conditions += " AND MUN_ENT_CLAVE IS NULL";
        } else if (this.getMunEntClave() != null) {
            conditions += " AND MUN_ENT_CLAVE = ?";
            values.add(this.getMunEntClave());
        }

        if (this.getMunClave() != null && this.getMunClave().longValue() == -999) {
            conditions += " AND MUN_CLAVE IS NULL";
        } else if (this.getMunClave() != null) {
            conditions += " AND MUN_CLAVE = ?";
            values.add(this.getMunClave());
        }

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
        String sql = "SELECT * FROM MUNICIPIOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMunEntClave() != null && this.getMunEntClave().longValue() == -999) {
            conditions += " AND MUN_ENT_CLAVE IS NULL";
        } else if (this.getMunEntClave() != null) {
            conditions += " AND MUN_ENT_CLAVE = ?";
            values.add(this.getMunEntClave());
        }

        if (this.getMunClave() != null && this.getMunClave().longValue() == -999) {
            conditions += " AND MUN_CLAVE IS NULL";
        } else if (this.getMunClave() != null) {
            conditions += " AND MUN_CLAVE = ?";
            values.add(this.getMunClave());
        }

        if (this.getMunNombre() != null && "null".equals(this.getMunNombre())) {
            conditions += " AND MUN_NOMBRE IS NULL";
        } else if (this.getMunNombre() != null) {
            conditions += " AND MUN_NOMBRE = ?";
            values.add(this.getMunNombre());
        }

        if (this.getMunAnoAltaReg() != null && this.getMunAnoAltaReg().longValue() == -999) {
            conditions += " AND MUN_ANO_ALTA_REG IS NULL";
        } else if (this.getMunAnoAltaReg() != null) {
            conditions += " AND MUN_ANO_ALTA_REG = ?";
            values.add(this.getMunAnoAltaReg());
        }

        if (this.getMunMesAltaReg() != null && this.getMunMesAltaReg().longValue() == -999) {
            conditions += " AND MUN_MES_ALTA_REG IS NULL";
        } else if (this.getMunMesAltaReg() != null) {
            conditions += " AND MUN_MES_ALTA_REG = ?";
            values.add(this.getMunMesAltaReg());
        }

        if (this.getMunDiaAltaReg() != null && this.getMunDiaAltaReg().longValue() == -999) {
            conditions += " AND MUN_DIA_ALTA_REG IS NULL";
        } else if (this.getMunDiaAltaReg() != null) {
            conditions += " AND MUN_DIA_ALTA_REG = ?";
            values.add(this.getMunDiaAltaReg());
        }

        if (this.getMunAnoUltMod() != null && this.getMunAnoUltMod().longValue() == -999) {
            conditions += " AND MUN_ANO_ULT_MOD IS NULL";
        } else if (this.getMunAnoUltMod() != null) {
            conditions += " AND MUN_ANO_ULT_MOD = ?";
            values.add(this.getMunAnoUltMod());
        }

        if (this.getMunMesUltMod() != null && this.getMunMesUltMod().longValue() == -999) {
            conditions += " AND MUN_MES_ULT_MOD IS NULL";
        } else if (this.getMunMesUltMod() != null) {
            conditions += " AND MUN_MES_ULT_MOD = ?";
            values.add(this.getMunMesUltMod());
        }

        if (this.getMunDiaUltMod() != null && this.getMunDiaUltMod().longValue() == -999) {
            conditions += " AND MUN_DIA_ULT_MOD IS NULL";
        } else if (this.getMunDiaUltMod() != null) {
            conditions += " AND MUN_DIA_ULT_MOD = ?";
            values.add(this.getMunDiaUltMod());
        }

        if (this.getMunCveStMunicip() != null && "null".equals(this.getMunCveStMunicip())) {
            conditions += " AND MUN_CVE_ST_MUNICIP IS NULL";
        } else if (this.getMunCveStMunicip() != null) {
            conditions += " AND MUN_CVE_ST_MUNICIP = ?";
            values.add(this.getMunCveStMunicip());
        }

        if (this.getMunPlazo() != null && this.getMunPlazo().longValue() == -999) {
            conditions += " AND MUN_PLAZO IS NULL";
        } else if (this.getMunPlazo() != null) {
            conditions += " AND MUN_PLAZO = ?";
            values.add(this.getMunPlazo());
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
        String sql = "UPDATE MUNICIPIOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND MUN_ENT_CLAVE = ?";
        pkValues.add(this.getMunEntClave());
        conditions += " AND MUN_CLAVE = ?";
        pkValues.add(this.getMunClave());
        fields += " MUN_NOMBRE = ?, ";
        values.add(this.getMunNombre());
        fields += " MUN_ANO_ALTA_REG = ?, ";
        values.add(this.getMunAnoAltaReg());
        fields += " MUN_MES_ALTA_REG = ?, ";
        values.add(this.getMunMesAltaReg());
        fields += " MUN_DIA_ALTA_REG = ?, ";
        values.add(this.getMunDiaAltaReg());
        fields += " MUN_ANO_ULT_MOD = ?, ";
        values.add(this.getMunAnoUltMod());
        fields += " MUN_MES_ULT_MOD = ?, ";
        values.add(this.getMunMesUltMod());
        fields += " MUN_DIA_ULT_MOD = ?, ";
        values.add(this.getMunDiaUltMod());
        fields += " MUN_CVE_ST_MUNICIP = ?, ";
        values.add(this.getMunCveStMunicip());
        fields += " MUN_PLAZO = ?, ";
        values.add(this.getMunPlazo());
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
        String sql = "INSERT INTO MUNICIPIOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", MUN_ENT_CLAVE";
        fieldValues += ", ?";
        values.add(this.getMunEntClave());

        fields += ", MUN_CLAVE";
        fieldValues += ", ?";
        values.add(this.getMunClave());

        fields += ", MUN_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getMunNombre());

        fields += ", MUN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMunAnoAltaReg());

        fields += ", MUN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMunMesAltaReg());

        fields += ", MUN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMunDiaAltaReg());

        fields += ", MUN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMunAnoUltMod());

        fields += ", MUN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMunMesUltMod());

        fields += ", MUN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMunDiaUltMod());

        fields += ", MUN_CVE_ST_MUNICIP";
        fieldValues += ", ?";
        values.add(this.getMunCveStMunicip());

        fields += ", MUN_PLAZO";
        fieldValues += ", ?";
        values.add(this.getMunPlazo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM MUNICIPIOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND MUN_ENT_CLAVE = ?";
        values.add(this.getMunEntClave());
        conditions += " AND MUN_CLAVE = ?";
        values.add(this.getMunClave());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Municipios instance = (Municipios) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getMunEntClave().equals(instance.getMunEntClave()))
            equalObjects = false;
        if (equalObjects && !this.getMunClave().equals(instance.getMunClave()))
            equalObjects = false;
        if (equalObjects && !this.getMunNombre().equals(instance.getMunNombre()))
            equalObjects = false;
        if (equalObjects && !this.getMunAnoAltaReg().equals(instance.getMunAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMunMesAltaReg().equals(instance.getMunMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMunDiaAltaReg().equals(instance.getMunDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMunAnoUltMod().equals(instance.getMunAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMunMesUltMod().equals(instance.getMunMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMunDiaUltMod().equals(instance.getMunDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMunCveStMunicip().equals(instance.getMunCveStMunicip()))
            equalObjects = false;
        if (equalObjects && !this.getMunPlazo().equals(instance.getMunPlazo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Municipios result = new Municipios();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setMunEntClave((BigDecimal) objectData.getData("MUN_ENT_CLAVE"));
        result.setMunClave((BigDecimal) objectData.getData("MUN_CLAVE"));
        result.setMunNombre((String) objectData.getData("MUN_NOMBRE"));
        result.setMunAnoAltaReg((BigDecimal) objectData.getData("MUN_ANO_ALTA_REG"));
        result.setMunMesAltaReg((BigDecimal) objectData.getData("MUN_MES_ALTA_REG"));
        result.setMunDiaAltaReg((BigDecimal) objectData.getData("MUN_DIA_ALTA_REG"));
        result.setMunAnoUltMod((BigDecimal) objectData.getData("MUN_ANO_ULT_MOD"));
        result.setMunMesUltMod((BigDecimal) objectData.getData("MUN_MES_ULT_MOD"));
        result.setMunDiaUltMod((BigDecimal) objectData.getData("MUN_DIA_ULT_MOD"));
        result.setMunCveStMunicip((String) objectData.getData("MUN_CVE_ST_MUNICIP"));
        result.setMunPlazo((BigDecimal) objectData.getData("MUN_PLAZO"));

        return result;

    }

}
