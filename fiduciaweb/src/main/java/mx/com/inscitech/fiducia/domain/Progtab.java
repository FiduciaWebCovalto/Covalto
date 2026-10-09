package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PROGTAB_PK", columns = { "PTL_ID_RUTINA", "PTL_ID_TABLA" }, sequences = { "MANUAL" })
public class Progtab extends DomainObject {

    String ptlIdRutina = null;
    String ptlIdTabla = null;
    String ptlTipoAcceso = null;
    String ptlComentarios = null;
    BigDecimal ptlAnoAltaReg = null;
    BigDecimal ptlMesAltaReg = null;
    BigDecimal ptlDiaAltaReg = null;
    BigDecimal ptlAnoUltMod = null;
    BigDecimal ptlMesUltMod = null;
    BigDecimal ptlDiaUltMod = null;
    String ptlCveStProgtab = null;

    public Progtab() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPtlIdRutina(String ptlIdRutina) {
        this.ptlIdRutina = ptlIdRutina;
    }

    public String getPtlIdRutina() {
        return this.ptlIdRutina;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPtlIdTabla(String ptlIdTabla) {
        this.ptlIdTabla = ptlIdTabla;
    }

    public String getPtlIdTabla() {
        return this.ptlIdTabla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPtlTipoAcceso(String ptlTipoAcceso) {
        this.ptlTipoAcceso = ptlTipoAcceso;
    }

    public String getPtlTipoAcceso() {
        return this.ptlTipoAcceso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPtlComentarios(String ptlComentarios) {
        this.ptlComentarios = ptlComentarios;
    }

    public String getPtlComentarios() {
        return this.ptlComentarios;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPtlAnoAltaReg(BigDecimal ptlAnoAltaReg) {
        this.ptlAnoAltaReg = ptlAnoAltaReg;
    }

    public BigDecimal getPtlAnoAltaReg() {
        return this.ptlAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtlMesAltaReg(BigDecimal ptlMesAltaReg) {
        this.ptlMesAltaReg = ptlMesAltaReg;
    }

    public BigDecimal getPtlMesAltaReg() {
        return this.ptlMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtlDiaAltaReg(BigDecimal ptlDiaAltaReg) {
        this.ptlDiaAltaReg = ptlDiaAltaReg;
    }

    public BigDecimal getPtlDiaAltaReg() {
        return this.ptlDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPtlAnoUltMod(BigDecimal ptlAnoUltMod) {
        this.ptlAnoUltMod = ptlAnoUltMod;
    }

    public BigDecimal getPtlAnoUltMod() {
        return this.ptlAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtlMesUltMod(BigDecimal ptlMesUltMod) {
        this.ptlMesUltMod = ptlMesUltMod;
    }

    public BigDecimal getPtlMesUltMod() {
        return this.ptlMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtlDiaUltMod(BigDecimal ptlDiaUltMod) {
        this.ptlDiaUltMod = ptlDiaUltMod;
    }

    public BigDecimal getPtlDiaUltMod() {
        return this.ptlDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPtlCveStProgtab(String ptlCveStProgtab) {
        this.ptlCveStProgtab = ptlCveStProgtab;
    }

    public String getPtlCveStProgtab() {
        return this.ptlCveStProgtab;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PROGTAB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPtlIdRutina() != null && "null".equals(this.getPtlIdRutina())) {
            conditions += " AND PTL_ID_RUTINA IS NULL";
        } else if (this.getPtlIdRutina() != null) {
            conditions += " AND PTL_ID_RUTINA = ?";
            values.add(this.getPtlIdRutina());
        }

        if (this.getPtlIdTabla() != null && "null".equals(this.getPtlIdTabla())) {
            conditions += " AND PTL_ID_TABLA IS NULL";
        } else if (this.getPtlIdTabla() != null) {
            conditions += " AND PTL_ID_TABLA = ?";
            values.add(this.getPtlIdTabla());
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
        String sql = "SELECT * FROM PROGTAB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPtlIdRutina() != null && "null".equals(this.getPtlIdRutina())) {
            conditions += " AND PTL_ID_RUTINA IS NULL";
        } else if (this.getPtlIdRutina() != null) {
            conditions += " AND PTL_ID_RUTINA = ?";
            values.add(this.getPtlIdRutina());
        }

        if (this.getPtlIdTabla() != null && "null".equals(this.getPtlIdTabla())) {
            conditions += " AND PTL_ID_TABLA IS NULL";
        } else if (this.getPtlIdTabla() != null) {
            conditions += " AND PTL_ID_TABLA = ?";
            values.add(this.getPtlIdTabla());
        }

        if (this.getPtlTipoAcceso() != null && "null".equals(this.getPtlTipoAcceso())) {
            conditions += " AND PTL_TIPO_ACCESO IS NULL";
        } else if (this.getPtlTipoAcceso() != null) {
            conditions += " AND PTL_TIPO_ACCESO = ?";
            values.add(this.getPtlTipoAcceso());
        }

        if (this.getPtlComentarios() != null && "null".equals(this.getPtlComentarios())) {
            conditions += " AND PTL_COMENTARIOS IS NULL";
        } else if (this.getPtlComentarios() != null) {
            conditions += " AND PTL_COMENTARIOS = ?";
            values.add(this.getPtlComentarios());
        }

        if (this.getPtlAnoAltaReg() != null && this.getPtlAnoAltaReg().longValue() == -999) {
            conditions += " AND PTL_ANO_ALTA_REG IS NULL";
        } else if (this.getPtlAnoAltaReg() != null) {
            conditions += " AND PTL_ANO_ALTA_REG = ?";
            values.add(this.getPtlAnoAltaReg());
        }

        if (this.getPtlMesAltaReg() != null && this.getPtlMesAltaReg().longValue() == -999) {
            conditions += " AND PTL_MES_ALTA_REG IS NULL";
        } else if (this.getPtlMesAltaReg() != null) {
            conditions += " AND PTL_MES_ALTA_REG = ?";
            values.add(this.getPtlMesAltaReg());
        }

        if (this.getPtlDiaAltaReg() != null && this.getPtlDiaAltaReg().longValue() == -999) {
            conditions += " AND PTL_DIA_ALTA_REG IS NULL";
        } else if (this.getPtlDiaAltaReg() != null) {
            conditions += " AND PTL_DIA_ALTA_REG = ?";
            values.add(this.getPtlDiaAltaReg());
        }

        if (this.getPtlAnoUltMod() != null && this.getPtlAnoUltMod().longValue() == -999) {
            conditions += " AND PTL_ANO_ULT_MOD IS NULL";
        } else if (this.getPtlAnoUltMod() != null) {
            conditions += " AND PTL_ANO_ULT_MOD = ?";
            values.add(this.getPtlAnoUltMod());
        }

        if (this.getPtlMesUltMod() != null && this.getPtlMesUltMod().longValue() == -999) {
            conditions += " AND PTL_MES_ULT_MOD IS NULL";
        } else if (this.getPtlMesUltMod() != null) {
            conditions += " AND PTL_MES_ULT_MOD = ?";
            values.add(this.getPtlMesUltMod());
        }

        if (this.getPtlDiaUltMod() != null && this.getPtlDiaUltMod().longValue() == -999) {
            conditions += " AND PTL_DIA_ULT_MOD IS NULL";
        } else if (this.getPtlDiaUltMod() != null) {
            conditions += " AND PTL_DIA_ULT_MOD = ?";
            values.add(this.getPtlDiaUltMod());
        }

        if (this.getPtlCveStProgtab() != null && "null".equals(this.getPtlCveStProgtab())) {
            conditions += " AND PTL_CVE_ST_PROGTAB IS NULL";
        } else if (this.getPtlCveStProgtab() != null) {
            conditions += " AND PTL_CVE_ST_PROGTAB = ?";
            values.add(this.getPtlCveStProgtab());
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
        String sql = "UPDATE PROGTAB SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PTL_ID_RUTINA = ?";
        pkValues.add(this.getPtlIdRutina());
        conditions += " AND PTL_ID_TABLA = ?";
        pkValues.add(this.getPtlIdTabla());
        fields += " PTL_TIPO_ACCESO = ?, ";
        values.add(this.getPtlTipoAcceso());
        fields += " PTL_COMENTARIOS = ?, ";
        values.add(this.getPtlComentarios());
        fields += " PTL_ANO_ALTA_REG = ?, ";
        values.add(this.getPtlAnoAltaReg());
        fields += " PTL_MES_ALTA_REG = ?, ";
        values.add(this.getPtlMesAltaReg());
        fields += " PTL_DIA_ALTA_REG = ?, ";
        values.add(this.getPtlDiaAltaReg());
        fields += " PTL_ANO_ULT_MOD = ?, ";
        values.add(this.getPtlAnoUltMod());
        fields += " PTL_MES_ULT_MOD = ?, ";
        values.add(this.getPtlMesUltMod());
        fields += " PTL_DIA_ULT_MOD = ?, ";
        values.add(this.getPtlDiaUltMod());
        fields += " PTL_CVE_ST_PROGTAB = ?, ";
        values.add(this.getPtlCveStProgtab());
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
        String sql = "INSERT INTO PROGTAB ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PTL_ID_RUTINA";
        fieldValues += ", ?";
        values.add(this.getPtlIdRutina());

        fields += ", PTL_ID_TABLA";
        fieldValues += ", ?";
        values.add(this.getPtlIdTabla());

        fields += ", PTL_TIPO_ACCESO";
        fieldValues += ", ?";
        values.add(this.getPtlTipoAcceso());

        fields += ", PTL_COMENTARIOS";
        fieldValues += ", ?";
        values.add(this.getPtlComentarios());

        fields += ", PTL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPtlAnoAltaReg());

        fields += ", PTL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPtlMesAltaReg());

        fields += ", PTL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPtlDiaAltaReg());

        fields += ", PTL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPtlAnoUltMod());

        fields += ", PTL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPtlMesUltMod());

        fields += ", PTL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPtlDiaUltMod());

        fields += ", PTL_CVE_ST_PROGTAB";
        fieldValues += ", ?";
        values.add(this.getPtlCveStProgtab());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PROGTAB WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PTL_ID_RUTINA = ?";
        values.add(this.getPtlIdRutina());
        conditions += " AND PTL_ID_TABLA = ?";
        values.add(this.getPtlIdTabla());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Progtab instance = (Progtab) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPtlIdRutina().equals(instance.getPtlIdRutina()))
            equalObjects = false;
        if (equalObjects && !this.getPtlIdTabla().equals(instance.getPtlIdTabla()))
            equalObjects = false;
        if (equalObjects && !this.getPtlTipoAcceso().equals(instance.getPtlTipoAcceso()))
            equalObjects = false;
        if (equalObjects && !this.getPtlComentarios().equals(instance.getPtlComentarios()))
            equalObjects = false;
        if (equalObjects && !this.getPtlAnoAltaReg().equals(instance.getPtlAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPtlMesAltaReg().equals(instance.getPtlMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPtlDiaAltaReg().equals(instance.getPtlDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPtlAnoUltMod().equals(instance.getPtlAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPtlMesUltMod().equals(instance.getPtlMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPtlDiaUltMod().equals(instance.getPtlDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPtlCveStProgtab().equals(instance.getPtlCveStProgtab()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Progtab result = new Progtab();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPtlIdRutina((String) objectData.getData("PTL_ID_RUTINA"));
        result.setPtlIdTabla((String) objectData.getData("PTL_ID_TABLA"));
        result.setPtlTipoAcceso((String) objectData.getData("PTL_TIPO_ACCESO"));
        result.setPtlComentarios((String) objectData.getData("PTL_COMENTARIOS"));
        result.setPtlAnoAltaReg((BigDecimal) objectData.getData("PTL_ANO_ALTA_REG"));
        result.setPtlMesAltaReg((BigDecimal) objectData.getData("PTL_MES_ALTA_REG"));
        result.setPtlDiaAltaReg((BigDecimal) objectData.getData("PTL_DIA_ALTA_REG"));
        result.setPtlAnoUltMod((BigDecimal) objectData.getData("PTL_ANO_ULT_MOD"));
        result.setPtlMesUltMod((BigDecimal) objectData.getData("PTL_MES_ULT_MOD"));
        result.setPtlDiaUltMod((BigDecimal) objectData.getData("PTL_DIA_ULT_MOD"));
        result.setPtlCveStProgtab((String) objectData.getData("PTL_CVE_ST_PROGTAB"));

        return result;

    }

}
