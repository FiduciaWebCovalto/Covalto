package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "RENDIMI_PK", columns = { "REN_NUM_FID", "REN_NUM_CONTRATO", "REN_EJERCICIO" }, sequences = { "MANUAL" })
public class RendimiFoseg extends DomainObject {

    BigDecimal renNumFid = null;
    BigDecimal renNumContrato = null;
    BigDecimal renEjercicio = null;
    BigDecimal renImpXAsignar = null;
    BigDecimal renAnoAltaReg = null;
    BigDecimal renMesAltaReg = null;
    BigDecimal renDiaAltaReg = null;
    BigDecimal renAnoUltMod = null;
    BigDecimal renMesUltMod = null;
    BigDecimal renDiaUltMod = null;
    String renCveStRendimi = null;

    public RendimiFoseg() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRenNumFid(BigDecimal renNumFid) {
        this.renNumFid = renNumFid;
    }

    public BigDecimal getRenNumFid() {
        return this.renNumFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRenNumContrato(BigDecimal renNumContrato) {
        this.renNumContrato = renNumContrato;
    }

    public BigDecimal getRenNumContrato() {
        return this.renNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRenEjercicio(BigDecimal renEjercicio) {
        this.renEjercicio = renEjercicio;
    }

    public BigDecimal getRenEjercicio() {
        return this.renEjercicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRenImpXAsignar(BigDecimal renImpXAsignar) {
        this.renImpXAsignar = renImpXAsignar;
    }

    public BigDecimal getRenImpXAsignar() {
        return this.renImpXAsignar;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRenAnoAltaReg(BigDecimal renAnoAltaReg) {
        this.renAnoAltaReg = renAnoAltaReg;
    }

    public BigDecimal getRenAnoAltaReg() {
        return this.renAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRenMesAltaReg(BigDecimal renMesAltaReg) {
        this.renMesAltaReg = renMesAltaReg;
    }

    public BigDecimal getRenMesAltaReg() {
        return this.renMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRenDiaAltaReg(BigDecimal renDiaAltaReg) {
        this.renDiaAltaReg = renDiaAltaReg;
    }

    public BigDecimal getRenDiaAltaReg() {
        return this.renDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRenAnoUltMod(BigDecimal renAnoUltMod) {
        this.renAnoUltMod = renAnoUltMod;
    }

    public BigDecimal getRenAnoUltMod() {
        return this.renAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRenMesUltMod(BigDecimal renMesUltMod) {
        this.renMesUltMod = renMesUltMod;
    }

    public BigDecimal getRenMesUltMod() {
        return this.renMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRenDiaUltMod(BigDecimal renDiaUltMod) {
        this.renDiaUltMod = renDiaUltMod;
    }

    public BigDecimal getRenDiaUltMod() {
        return this.renDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRenCveStRendimi(String renCveStRendimi) {
        this.renCveStRendimi = renCveStRendimi;
    }

    public String getRenCveStRendimi() {
        return this.renCveStRendimi;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM RENDIMI_FOSEG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRenNumFid() != null && this.getRenNumFid().longValue() == -999) {
            conditions += " AND REN_NUM_FID IS NULL";
        } else if (this.getRenNumFid() != null) {
            conditions += " AND REN_NUM_FID = ?";
            values.add(this.getRenNumFid());
        }

        if (this.getRenNumContrato() != null && this.getRenNumContrato().longValue() == -999) {
            conditions += " AND REN_NUM_CONTRATO IS NULL";
        } else if (this.getRenNumContrato() != null) {
            conditions += " AND REN_NUM_CONTRATO = ?";
            values.add(this.getRenNumContrato());
        }

        if (this.getRenEjercicio() != null && this.getRenEjercicio().longValue() == -999) {
            conditions += " AND REN_EJERCICIO IS NULL";
        } else if (this.getRenEjercicio() != null) {
            conditions += " AND REN_EJERCICIO = ?";
            values.add(this.getRenEjercicio());
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
        String sql = "SELECT * FROM RENDIMI_FOSEG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRenNumFid() != null && this.getRenNumFid().longValue() == -999) {
            conditions += " AND REN_NUM_FID IS NULL";
        } else if (this.getRenNumFid() != null) {
            conditions += " AND REN_NUM_FID = ?";
            values.add(this.getRenNumFid());
        }

        if (this.getRenNumContrato() != null && this.getRenNumContrato().longValue() == -999) {
            conditions += " AND REN_NUM_CONTRATO IS NULL";
        } else if (this.getRenNumContrato() != null) {
            conditions += " AND REN_NUM_CONTRATO = ?";
            values.add(this.getRenNumContrato());
        }

        if (this.getRenEjercicio() != null && this.getRenEjercicio().longValue() == -999) {
            conditions += " AND REN_EJERCICIO IS NULL";
        } else if (this.getRenEjercicio() != null) {
            conditions += " AND REN_EJERCICIO = ?";
            values.add(this.getRenEjercicio());
        }

        if (this.getRenImpXAsignar() != null && this.getRenImpXAsignar().longValue() == -999) {
            conditions += " AND REN_IMP_X_ASIGNAR IS NULL";
        } else if (this.getRenImpXAsignar() != null) {
            conditions += " AND REN_IMP_X_ASIGNAR = ?";
            values.add(this.getRenImpXAsignar());
        }

        if (this.getRenAnoAltaReg() != null && this.getRenAnoAltaReg().longValue() == -999) {
            conditions += " AND REN_ANO_ALTA_REG IS NULL";
        } else if (this.getRenAnoAltaReg() != null) {
            conditions += " AND REN_ANO_ALTA_REG = ?";
            values.add(this.getRenAnoAltaReg());
        }

        if (this.getRenMesAltaReg() != null && this.getRenMesAltaReg().longValue() == -999) {
            conditions += " AND REN_MES_ALTA_REG IS NULL";
        } else if (this.getRenMesAltaReg() != null) {
            conditions += " AND REN_MES_ALTA_REG = ?";
            values.add(this.getRenMesAltaReg());
        }

        if (this.getRenDiaAltaReg() != null && this.getRenDiaAltaReg().longValue() == -999) {
            conditions += " AND REN_DIA_ALTA_REG IS NULL";
        } else if (this.getRenDiaAltaReg() != null) {
            conditions += " AND REN_DIA_ALTA_REG = ?";
            values.add(this.getRenDiaAltaReg());
        }

        if (this.getRenAnoUltMod() != null && this.getRenAnoUltMod().longValue() == -999) {
            conditions += " AND REN_ANO_ULT_MOD IS NULL";
        } else if (this.getRenAnoUltMod() != null) {
            conditions += " AND REN_ANO_ULT_MOD = ?";
            values.add(this.getRenAnoUltMod());
        }

        if (this.getRenMesUltMod() != null && this.getRenMesUltMod().longValue() == -999) {
            conditions += " AND REN_MES_ULT_MOD IS NULL";
        } else if (this.getRenMesUltMod() != null) {
            conditions += " AND REN_MES_ULT_MOD = ?";
            values.add(this.getRenMesUltMod());
        }

        if (this.getRenDiaUltMod() != null && this.getRenDiaUltMod().longValue() == -999) {
            conditions += " AND REN_DIA_ULT_MOD IS NULL";
        } else if (this.getRenDiaUltMod() != null) {
            conditions += " AND REN_DIA_ULT_MOD = ?";
            values.add(this.getRenDiaUltMod());
        }

        if (this.getRenCveStRendimi() != null && "null".equals(this.getRenCveStRendimi())) {
            conditions += " AND REN_CVE_ST_RENDIMI IS NULL";
        } else if (this.getRenCveStRendimi() != null) {
            conditions += " AND REN_CVE_ST_RENDIMI = ?";
            values.add(this.getRenCveStRendimi());
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
        String sql = "UPDATE RENDIMI_FOSEG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REN_NUM_FID = ?";
        pkValues.add(this.getRenNumFid());
        conditions += " AND REN_NUM_CONTRATO = ?";
        pkValues.add(this.getRenNumContrato());
        conditions += " AND REN_EJERCICIO = ?";
        pkValues.add(this.getRenEjercicio());
        fields += " REN_IMP_X_ASIGNAR = ?, ";
        values.add(this.getRenImpXAsignar());
        fields += " REN_ANO_ALTA_REG = ?, ";
        values.add(this.getRenAnoAltaReg());
        fields += " REN_MES_ALTA_REG = ?, ";
        values.add(this.getRenMesAltaReg());
        fields += " REN_DIA_ALTA_REG = ?, ";
        values.add(this.getRenDiaAltaReg());
        fields += " REN_ANO_ULT_MOD = ?, ";
        values.add(this.getRenAnoUltMod());
        fields += " REN_MES_ULT_MOD = ?, ";
        values.add(this.getRenMesUltMod());
        fields += " REN_DIA_ULT_MOD = ?, ";
        values.add(this.getRenDiaUltMod());
        fields += " REN_CVE_ST_RENDIMI = ?, ";
        values.add(this.getRenCveStRendimi());
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
        String sql = "INSERT INTO RENDIMI_FOSEG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REN_NUM_FID";
        fieldValues += ", ?";
        values.add(this.getRenNumFid());

        fields += ", REN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRenNumContrato());

        fields += ", REN_EJERCICIO";
        fieldValues += ", ?";
        values.add(this.getRenEjercicio());

        fields += ", REN_IMP_X_ASIGNAR";
        fieldValues += ", ?";
        values.add(this.getRenImpXAsignar());

        fields += ", REN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRenAnoAltaReg());

        fields += ", REN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRenMesAltaReg());

        fields += ", REN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRenDiaAltaReg());

        fields += ", REN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRenAnoUltMod());

        fields += ", REN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRenMesUltMod());

        fields += ", REN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRenDiaUltMod());

        fields += ", REN_CVE_ST_RENDIMI";
        fieldValues += ", ?";
        values.add(this.getRenCveStRendimi());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM RENDIMI_FOSEG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REN_NUM_FID = ?";
        values.add(this.getRenNumFid());
        conditions += " AND REN_NUM_CONTRATO = ?";
        values.add(this.getRenNumContrato());
        conditions += " AND REN_EJERCICIO = ?";
        values.add(this.getRenEjercicio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        RendimiFoseg instance = (RendimiFoseg) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRenNumFid().equals(instance.getRenNumFid()))
            equalObjects = false;
        if (equalObjects && !this.getRenNumContrato().equals(instance.getRenNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRenEjercicio().equals(instance.getRenEjercicio()))
            equalObjects = false;
        if (equalObjects && !this.getRenImpXAsignar().equals(instance.getRenImpXAsignar()))
            equalObjects = false;
        if (equalObjects && !this.getRenAnoAltaReg().equals(instance.getRenAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRenMesAltaReg().equals(instance.getRenMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRenDiaAltaReg().equals(instance.getRenDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRenAnoUltMod().equals(instance.getRenAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRenMesUltMod().equals(instance.getRenMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRenDiaUltMod().equals(instance.getRenDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRenCveStRendimi().equals(instance.getRenCveStRendimi()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        RendimiFoseg result = new RendimiFoseg();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRenNumFid((BigDecimal) objectData.getData("REN_NUM_FID"));
        result.setRenNumContrato((BigDecimal) objectData.getData("REN_NUM_CONTRATO"));
        result.setRenEjercicio((BigDecimal) objectData.getData("REN_EJERCICIO"));
        result.setRenImpXAsignar((BigDecimal) objectData.getData("REN_IMP_X_ASIGNAR"));
        result.setRenAnoAltaReg((BigDecimal) objectData.getData("REN_ANO_ALTA_REG"));
        result.setRenMesAltaReg((BigDecimal) objectData.getData("REN_MES_ALTA_REG"));
        result.setRenDiaAltaReg((BigDecimal) objectData.getData("REN_DIA_ALTA_REG"));
        result.setRenAnoUltMod((BigDecimal) objectData.getData("REN_ANO_ULT_MOD"));
        result.setRenMesUltMod((BigDecimal) objectData.getData("REN_MES_ULT_MOD"));
        result.setRenDiaUltMod((BigDecimal) objectData.getData("REN_DIA_ULT_MOD"));
        result.setRenCveStRendimi((String) objectData.getData("REN_CVE_ST_RENDIMI"));

        return result;

    }

}
