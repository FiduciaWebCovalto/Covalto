package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AUTORIDAD_PK", columns = { "AUT_NUM_AUTORIDAD", "AUT_NUM_RESPONSABLE" }, sequences = { "MANUAL" })
public class Autoridad extends DomainObject {

    BigDecimal autNumAutoridad = null;
    BigDecimal autNumResponsable = null;
    String autCveAutoridad = null;
    String autNomAutoridad = null;
    String autNomResponsable = null;
    String autNomPuestRespo = null;
    String autDirAutoridad = null;
    String autNumTelefono = null;
    String autNumFax = null;
    String autCveCorreo = null;
    BigDecimal autAnoAltaReg = null;
    BigDecimal autMesAltaReg = null;
    BigDecimal autDiaAltaReg = null;
    BigDecimal autAnoUltMod = null;
    BigDecimal autMesUltMod = null;
    BigDecimal autDiaUltMod = null;
    String autCveStAutoridad = null;

    public Autoridad() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAutNumAutoridad(BigDecimal autNumAutoridad) {
        this.autNumAutoridad = autNumAutoridad;
    }

    public BigDecimal getAutNumAutoridad() {
        return this.autNumAutoridad;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAutNumResponsable(BigDecimal autNumResponsable) {
        this.autNumResponsable = autNumResponsable;
    }

    public BigDecimal getAutNumResponsable() {
        return this.autNumResponsable;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutCveAutoridad(String autCveAutoridad) {
        this.autCveAutoridad = autCveAutoridad;
    }

    public String getAutCveAutoridad() {
        return this.autCveAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutNomAutoridad(String autNomAutoridad) {
        this.autNomAutoridad = autNomAutoridad;
    }

    public String getAutNomAutoridad() {
        return this.autNomAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutNomResponsable(String autNomResponsable) {
        this.autNomResponsable = autNomResponsable;
    }

    public String getAutNomResponsable() {
        return this.autNomResponsable;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutNomPuestRespo(String autNomPuestRespo) {
        this.autNomPuestRespo = autNomPuestRespo;
    }

    public String getAutNomPuestRespo() {
        return this.autNomPuestRespo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutDirAutoridad(String autDirAutoridad) {
        this.autDirAutoridad = autDirAutoridad;
    }

    public String getAutDirAutoridad() {
        return this.autDirAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutNumTelefono(String autNumTelefono) {
        this.autNumTelefono = autNumTelefono;
    }

    public String getAutNumTelefono() {
        return this.autNumTelefono;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutNumFax(String autNumFax) {
        this.autNumFax = autNumFax;
    }

    public String getAutNumFax() {
        return this.autNumFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutCveCorreo(String autCveCorreo) {
        this.autCveCorreo = autCveCorreo;
    }

    public String getAutCveCorreo() {
        return this.autCveCorreo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAutAnoAltaReg(BigDecimal autAnoAltaReg) {
        this.autAnoAltaReg = autAnoAltaReg;
    }

    public BigDecimal getAutAnoAltaReg() {
        return this.autAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutMesAltaReg(BigDecimal autMesAltaReg) {
        this.autMesAltaReg = autMesAltaReg;
    }

    public BigDecimal getAutMesAltaReg() {
        return this.autMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutDiaAltaReg(BigDecimal autDiaAltaReg) {
        this.autDiaAltaReg = autDiaAltaReg;
    }

    public BigDecimal getAutDiaAltaReg() {
        return this.autDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAutAnoUltMod(BigDecimal autAnoUltMod) {
        this.autAnoUltMod = autAnoUltMod;
    }

    public BigDecimal getAutAnoUltMod() {
        return this.autAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutMesUltMod(BigDecimal autMesUltMod) {
        this.autMesUltMod = autMesUltMod;
    }

    public BigDecimal getAutMesUltMod() {
        return this.autMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutDiaUltMod(BigDecimal autDiaUltMod) {
        this.autDiaUltMod = autDiaUltMod;
    }

    public BigDecimal getAutDiaUltMod() {
        return this.autDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutCveStAutoridad(String autCveStAutoridad) {
        this.autCveStAutoridad = autCveStAutoridad;
    }

    public String getAutCveStAutoridad() {
        return this.autCveStAutoridad;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AUTORIDAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAutNumAutoridad() != null && this.getAutNumAutoridad().longValue() == -999) {
            conditions += " AND AUT_NUM_AUTORIDAD IS NULL";
        } else if (this.getAutNumAutoridad() != null) {
            conditions += " AND AUT_NUM_AUTORIDAD = ?";
            values.add(this.getAutNumAutoridad());
        }

        if (this.getAutNumResponsable() != null && this.getAutNumResponsable().longValue() == -999) {
            conditions += " AND AUT_NUM_RESPONSABLE IS NULL";
        } else if (this.getAutNumResponsable() != null) {
            conditions += " AND AUT_NUM_RESPONSABLE = ?";
            values.add(this.getAutNumResponsable());
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
        String sql = "SELECT * FROM AUTORIDAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAutNumAutoridad() != null && this.getAutNumAutoridad().longValue() == -999) {
            conditions += " AND AUT_NUM_AUTORIDAD IS NULL";
        } else if (this.getAutNumAutoridad() != null) {
            conditions += " AND AUT_NUM_AUTORIDAD = ?";
            values.add(this.getAutNumAutoridad());
        }

        if (this.getAutNumResponsable() != null && this.getAutNumResponsable().longValue() == -999) {
            conditions += " AND AUT_NUM_RESPONSABLE IS NULL";
        } else if (this.getAutNumResponsable() != null) {
            conditions += " AND AUT_NUM_RESPONSABLE = ?";
            values.add(this.getAutNumResponsable());
        }

        if (this.getAutCveAutoridad() != null && "null".equals(this.getAutCveAutoridad())) {
            conditions += " AND AUT_CVE_AUTORIDAD IS NULL";
        } else if (this.getAutCveAutoridad() != null) {
            conditions += " AND AUT_CVE_AUTORIDAD = ?";
            values.add(this.getAutCveAutoridad());
        }

        if (this.getAutNomAutoridad() != null && "null".equals(this.getAutNomAutoridad())) {
            conditions += " AND AUT_NOM_AUTORIDAD IS NULL";
        } else if (this.getAutNomAutoridad() != null) {
            conditions += " AND AUT_NOM_AUTORIDAD = ?";
            values.add(this.getAutNomAutoridad());
        }

        if (this.getAutNomResponsable() != null && "null".equals(this.getAutNomResponsable())) {
            conditions += " AND AUT_NOM_RESPONSABLE IS NULL";
        } else if (this.getAutNomResponsable() != null) {
            conditions += " AND AUT_NOM_RESPONSABLE = ?";
            values.add(this.getAutNomResponsable());
        }

        if (this.getAutNomPuestRespo() != null && "null".equals(this.getAutNomPuestRespo())) {
            conditions += " AND AUT_NOM_PUEST_RESPO IS NULL";
        } else if (this.getAutNomPuestRespo() != null) {
            conditions += " AND AUT_NOM_PUEST_RESPO = ?";
            values.add(this.getAutNomPuestRespo());
        }

        if (this.getAutDirAutoridad() != null && "null".equals(this.getAutDirAutoridad())) {
            conditions += " AND AUT_DIR_AUTORIDAD IS NULL";
        } else if (this.getAutDirAutoridad() != null) {
            conditions += " AND AUT_DIR_AUTORIDAD = ?";
            values.add(this.getAutDirAutoridad());
        }

        if (this.getAutNumTelefono() != null && "null".equals(this.getAutNumTelefono())) {
            conditions += " AND AUT_NUM_TELEFONO IS NULL";
        } else if (this.getAutNumTelefono() != null) {
            conditions += " AND AUT_NUM_TELEFONO = ?";
            values.add(this.getAutNumTelefono());
        }

        if (this.getAutNumFax() != null && "null".equals(this.getAutNumFax())) {
            conditions += " AND AUT_NUM_FAX IS NULL";
        } else if (this.getAutNumFax() != null) {
            conditions += " AND AUT_NUM_FAX = ?";
            values.add(this.getAutNumFax());
        }

        if (this.getAutCveCorreo() != null && "null".equals(this.getAutCveCorreo())) {
            conditions += " AND AUT_CVE_CORREO IS NULL";
        } else if (this.getAutCveCorreo() != null) {
            conditions += " AND AUT_CVE_CORREO = ?";
            values.add(this.getAutCveCorreo());
        }

        if (this.getAutAnoAltaReg() != null && this.getAutAnoAltaReg().longValue() == -999) {
            conditions += " AND AUT_ANO_ALTA_REG IS NULL";
        } else if (this.getAutAnoAltaReg() != null) {
            conditions += " AND AUT_ANO_ALTA_REG = ?";
            values.add(this.getAutAnoAltaReg());
        }

        if (this.getAutMesAltaReg() != null && this.getAutMesAltaReg().longValue() == -999) {
            conditions += " AND AUT_MES_ALTA_REG IS NULL";
        } else if (this.getAutMesAltaReg() != null) {
            conditions += " AND AUT_MES_ALTA_REG = ?";
            values.add(this.getAutMesAltaReg());
        }

        if (this.getAutDiaAltaReg() != null && this.getAutDiaAltaReg().longValue() == -999) {
            conditions += " AND AUT_DIA_ALTA_REG IS NULL";
        } else if (this.getAutDiaAltaReg() != null) {
            conditions += " AND AUT_DIA_ALTA_REG = ?";
            values.add(this.getAutDiaAltaReg());
        }

        if (this.getAutAnoUltMod() != null && this.getAutAnoUltMod().longValue() == -999) {
            conditions += " AND AUT_ANO_ULT_MOD IS NULL";
        } else if (this.getAutAnoUltMod() != null) {
            conditions += " AND AUT_ANO_ULT_MOD = ?";
            values.add(this.getAutAnoUltMod());
        }

        if (this.getAutMesUltMod() != null && this.getAutMesUltMod().longValue() == -999) {
            conditions += " AND AUT_MES_ULT_MOD IS NULL";
        } else if (this.getAutMesUltMod() != null) {
            conditions += " AND AUT_MES_ULT_MOD = ?";
            values.add(this.getAutMesUltMod());
        }

        if (this.getAutDiaUltMod() != null && this.getAutDiaUltMod().longValue() == -999) {
            conditions += " AND AUT_DIA_ULT_MOD IS NULL";
        } else if (this.getAutDiaUltMod() != null) {
            conditions += " AND AUT_DIA_ULT_MOD = ?";
            values.add(this.getAutDiaUltMod());
        }

        if (this.getAutCveStAutoridad() != null && "null".equals(this.getAutCveStAutoridad())) {
            conditions += " AND AUT_CVE_ST_AUTORIDAD IS NULL";
        } else if (this.getAutCveStAutoridad() != null) {
            conditions += " AND AUT_CVE_ST_AUTORIDAD = ?";
            values.add(this.getAutCveStAutoridad());
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
        String sql = "UPDATE AUTORIDAD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AUT_NUM_AUTORIDAD = ?";
        pkValues.add(this.getAutNumAutoridad());
        conditions += " AND AUT_NUM_RESPONSABLE = ?";
        pkValues.add(this.getAutNumResponsable());
        fields += " AUT_CVE_AUTORIDAD = ?, ";
        values.add(this.getAutCveAutoridad());
        fields += " AUT_NOM_AUTORIDAD = ?, ";
        values.add(this.getAutNomAutoridad());
        fields += " AUT_NOM_RESPONSABLE = ?, ";
        values.add(this.getAutNomResponsable());
        fields += " AUT_NOM_PUEST_RESPO = ?, ";
        values.add(this.getAutNomPuestRespo());
        fields += " AUT_DIR_AUTORIDAD = ?, ";
        values.add(this.getAutDirAutoridad());
        fields += " AUT_NUM_TELEFONO = ?, ";
        values.add(this.getAutNumTelefono());
        fields += " AUT_NUM_FAX = ?, ";
        values.add(this.getAutNumFax());
        fields += " AUT_CVE_CORREO = ?, ";
        values.add(this.getAutCveCorreo());
        fields += " AUT_ANO_ALTA_REG = ?, ";
        values.add(this.getAutAnoAltaReg());
        fields += " AUT_MES_ALTA_REG = ?, ";
        values.add(this.getAutMesAltaReg());
        fields += " AUT_DIA_ALTA_REG = ?, ";
        values.add(this.getAutDiaAltaReg());
        fields += " AUT_ANO_ULT_MOD = ?, ";
        values.add(this.getAutAnoUltMod());
        fields += " AUT_MES_ULT_MOD = ?, ";
        values.add(this.getAutMesUltMod());
        fields += " AUT_DIA_ULT_MOD = ?, ";
        values.add(this.getAutDiaUltMod());
        fields += " AUT_CVE_ST_AUTORIDAD = ?, ";
        values.add(this.getAutCveStAutoridad());
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
        String sql = "INSERT INTO AUTORIDAD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AUT_NUM_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutNumAutoridad());

        fields += ", AUT_NUM_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getAutNumResponsable());

        fields += ", AUT_CVE_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutCveAutoridad());

        fields += ", AUT_NOM_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutNomAutoridad());

        fields += ", AUT_NOM_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getAutNomResponsable());

        fields += ", AUT_NOM_PUEST_RESPO";
        fieldValues += ", ?";
        values.add(this.getAutNomPuestRespo());

        fields += ", AUT_DIR_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutDirAutoridad());

        fields += ", AUT_NUM_TELEFONO";
        fieldValues += ", ?";
        values.add(this.getAutNumTelefono());

        fields += ", AUT_NUM_FAX";
        fieldValues += ", ?";
        values.add(this.getAutNumFax());

        fields += ", AUT_CVE_CORREO";
        fieldValues += ", ?";
        values.add(this.getAutCveCorreo());

        fields += ", AUT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutAnoAltaReg());

        fields += ", AUT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutMesAltaReg());

        fields += ", AUT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutDiaAltaReg());

        fields += ", AUT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutAnoUltMod());

        fields += ", AUT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutMesUltMod());

        fields += ", AUT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutDiaUltMod());

        fields += ", AUT_CVE_ST_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutCveStAutoridad());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AUTORIDAD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AUT_NUM_AUTORIDAD = ?";
        values.add(this.getAutNumAutoridad());
        conditions += " AND AUT_NUM_RESPONSABLE = ?";
        values.add(this.getAutNumResponsable());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Autoridad instance = (Autoridad) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAutNumAutoridad().equals(instance.getAutNumAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAutNumResponsable().equals(instance.getAutNumResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getAutCveAutoridad().equals(instance.getAutCveAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAutNomAutoridad().equals(instance.getAutNomAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAutNomResponsable().equals(instance.getAutNomResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getAutNomPuestRespo().equals(instance.getAutNomPuestRespo()))
            equalObjects = false;
        if (equalObjects && !this.getAutDirAutoridad().equals(instance.getAutDirAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAutNumTelefono().equals(instance.getAutNumTelefono()))
            equalObjects = false;
        if (equalObjects && !this.getAutNumFax().equals(instance.getAutNumFax()))
            equalObjects = false;
        if (equalObjects && !this.getAutCveCorreo().equals(instance.getAutCveCorreo()))
            equalObjects = false;
        if (equalObjects && !this.getAutAnoAltaReg().equals(instance.getAutAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutMesAltaReg().equals(instance.getAutMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutDiaAltaReg().equals(instance.getAutDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutAnoUltMod().equals(instance.getAutAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutMesUltMod().equals(instance.getAutMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutDiaUltMod().equals(instance.getAutDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutCveStAutoridad().equals(instance.getAutCveStAutoridad()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Autoridad result = new Autoridad();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAutNumAutoridad((BigDecimal) objectData.getData("AUT_NUM_AUTORIDAD"));
        result.setAutNumResponsable((BigDecimal) objectData.getData("AUT_NUM_RESPONSABLE"));
        result.setAutCveAutoridad((String) objectData.getData("AUT_CVE_AUTORIDAD"));
        result.setAutNomAutoridad((String) objectData.getData("AUT_NOM_AUTORIDAD"));
        result.setAutNomResponsable((String) objectData.getData("AUT_NOM_RESPONSABLE"));
        result.setAutNomPuestRespo((String) objectData.getData("AUT_NOM_PUEST_RESPO"));
        result.setAutDirAutoridad((String) objectData.getData("AUT_DIR_AUTORIDAD"));
        result.setAutNumTelefono((String) objectData.getData("AUT_NUM_TELEFONO"));
        result.setAutNumFax((String) objectData.getData("AUT_NUM_FAX"));
        result.setAutCveCorreo((String) objectData.getData("AUT_CVE_CORREO"));
        result.setAutAnoAltaReg((BigDecimal) objectData.getData("AUT_ANO_ALTA_REG"));
        result.setAutMesAltaReg((BigDecimal) objectData.getData("AUT_MES_ALTA_REG"));
        result.setAutDiaAltaReg((BigDecimal) objectData.getData("AUT_DIA_ALTA_REG"));
        result.setAutAnoUltMod((BigDecimal) objectData.getData("AUT_ANO_ULT_MOD"));
        result.setAutMesUltMod((BigDecimal) objectData.getData("AUT_MES_ULT_MOD"));
        result.setAutDiaUltMod((BigDecimal) objectData.getData("AUT_DIA_ULT_MOD"));
        result.setAutCveStAutoridad((String) objectData.getData("AUT_CVE_ST_AUTORIDAD"));

        return result;

    }

}
