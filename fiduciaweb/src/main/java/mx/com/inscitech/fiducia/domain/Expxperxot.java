package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EXPXPERXOT_PK", columns = { "EPO_NUM_OT", "EPO_TURNO", "EPO_NUM_CAJON2", "EPO_NUM_EXPEDIEN", "EPO_NUM_PERITO" }, sequences = { "MANUAL" })
public class Expxperxot extends DomainObject {

    BigDecimal epoNumExpedien = null;
    BigDecimal epoNumCajon2 = null;
    String epoNumOt = null;
    String epoTurno = null;
    BigDecimal epoNumPerito = null;
    String epoCalidad = null;
    String epoOportunidad = null;
    String epoDocumento1 = null;
    String epoDocumento2 = null;
    String epoObservaciones = null;
    BigDecimal epoAnoAltaReg = null;
    BigDecimal epoMesAltaReg = null;
    BigDecimal epoDiaAltaReg = null;
    BigDecimal epoAnoUltMod = null;
    BigDecimal epoMesUltMod = null;
    BigDecimal epoDiaUltMod = null;
    String epoCveStExperot = null;

    public Expxperxot() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEpoNumExpedien(BigDecimal epoNumExpedien) {
        this.epoNumExpedien = epoNumExpedien;
    }

    public BigDecimal getEpoNumExpedien() {
        return this.epoNumExpedien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEpoNumCajon2(BigDecimal epoNumCajon2) {
        this.epoNumCajon2 = epoNumCajon2;
    }

    public BigDecimal getEpoNumCajon2() {
        return this.epoNumCajon2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpoNumOt(String epoNumOt) {
        this.epoNumOt = epoNumOt;
    }

    public String getEpoNumOt() {
        return this.epoNumOt;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpoTurno(String epoTurno) {
        this.epoTurno = epoTurno;
    }

    public String getEpoTurno() {
        return this.epoTurno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEpoNumPerito(BigDecimal epoNumPerito) {
        this.epoNumPerito = epoNumPerito;
    }

    public BigDecimal getEpoNumPerito() {
        return this.epoNumPerito;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpoCalidad(String epoCalidad) {
        this.epoCalidad = epoCalidad;
    }

    public String getEpoCalidad() {
        return this.epoCalidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpoOportunidad(String epoOportunidad) {
        this.epoOportunidad = epoOportunidad;
    }

    public String getEpoOportunidad() {
        return this.epoOportunidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpoDocumento1(String epoDocumento1) {
        this.epoDocumento1 = epoDocumento1;
    }

    public String getEpoDocumento1() {
        return this.epoDocumento1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpoDocumento2(String epoDocumento2) {
        this.epoDocumento2 = epoDocumento2;
    }

    public String getEpoDocumento2() {
        return this.epoDocumento2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpoObservaciones(String epoObservaciones) {
        this.epoObservaciones = epoObservaciones;
    }

    public String getEpoObservaciones() {
        return this.epoObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpoAnoAltaReg(BigDecimal epoAnoAltaReg) {
        this.epoAnoAltaReg = epoAnoAltaReg;
    }

    public BigDecimal getEpoAnoAltaReg() {
        return this.epoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpoMesAltaReg(BigDecimal epoMesAltaReg) {
        this.epoMesAltaReg = epoMesAltaReg;
    }

    public BigDecimal getEpoMesAltaReg() {
        return this.epoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpoDiaAltaReg(BigDecimal epoDiaAltaReg) {
        this.epoDiaAltaReg = epoDiaAltaReg;
    }

    public BigDecimal getEpoDiaAltaReg() {
        return this.epoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpoAnoUltMod(BigDecimal epoAnoUltMod) {
        this.epoAnoUltMod = epoAnoUltMod;
    }

    public BigDecimal getEpoAnoUltMod() {
        return this.epoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpoMesUltMod(BigDecimal epoMesUltMod) {
        this.epoMesUltMod = epoMesUltMod;
    }

    public BigDecimal getEpoMesUltMod() {
        return this.epoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpoDiaUltMod(BigDecimal epoDiaUltMod) {
        this.epoDiaUltMod = epoDiaUltMod;
    }

    public BigDecimal getEpoDiaUltMod() {
        return this.epoDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpoCveStExperot(String epoCveStExperot) {
        this.epoCveStExperot = epoCveStExperot;
    }

    public String getEpoCveStExperot() {
        return this.epoCveStExperot;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EXPXPERXOT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEpoNumExpedien() != null && this.getEpoNumExpedien().longValue() == -999) {
            conditions += " AND EPO_NUM_EXPEDIEN IS NULL";
        } else if (this.getEpoNumExpedien() != null) {
            conditions += " AND EPO_NUM_EXPEDIEN = ?";
            values.add(this.getEpoNumExpedien());
        }

        if (this.getEpoNumCajon2() != null && this.getEpoNumCajon2().longValue() == -999) {
            conditions += " AND EPO_NUM_CAJON2 IS NULL";
        } else if (this.getEpoNumCajon2() != null) {
            conditions += " AND EPO_NUM_CAJON2 = ?";
            values.add(this.getEpoNumCajon2());
        }

        if (this.getEpoNumOt() != null && "null".equals(this.getEpoNumOt())) {
            conditions += " AND EPO_NUM_OT IS NULL";
        } else if (this.getEpoNumOt() != null) {
            conditions += " AND EPO_NUM_OT = ?";
            values.add(this.getEpoNumOt());
        }

        if (this.getEpoTurno() != null && "null".equals(this.getEpoTurno())) {
            conditions += " AND EPO_TURNO IS NULL";
        } else if (this.getEpoTurno() != null) {
            conditions += " AND EPO_TURNO = ?";
            values.add(this.getEpoTurno());
        }

        if (this.getEpoNumPerito() != null && this.getEpoNumPerito().longValue() == -999) {
            conditions += " AND EPO_NUM_PERITO IS NULL";
        } else if (this.getEpoNumPerito() != null) {
            conditions += " AND EPO_NUM_PERITO = ?";
            values.add(this.getEpoNumPerito());
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
        String sql = "SELECT * FROM EXPXPERXOT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEpoNumExpedien() != null && this.getEpoNumExpedien().longValue() == -999) {
            conditions += " AND EPO_NUM_EXPEDIEN IS NULL";
        } else if (this.getEpoNumExpedien() != null) {
            conditions += " AND EPO_NUM_EXPEDIEN = ?";
            values.add(this.getEpoNumExpedien());
        }

        if (this.getEpoNumCajon2() != null && this.getEpoNumCajon2().longValue() == -999) {
            conditions += " AND EPO_NUM_CAJON2 IS NULL";
        } else if (this.getEpoNumCajon2() != null) {
            conditions += " AND EPO_NUM_CAJON2 = ?";
            values.add(this.getEpoNumCajon2());
        }

        if (this.getEpoNumOt() != null && "null".equals(this.getEpoNumOt())) {
            conditions += " AND EPO_NUM_OT IS NULL";
        } else if (this.getEpoNumOt() != null) {
            conditions += " AND EPO_NUM_OT = ?";
            values.add(this.getEpoNumOt());
        }

        if (this.getEpoTurno() != null && "null".equals(this.getEpoTurno())) {
            conditions += " AND EPO_TURNO IS NULL";
        } else if (this.getEpoTurno() != null) {
            conditions += " AND EPO_TURNO = ?";
            values.add(this.getEpoTurno());
        }

        if (this.getEpoNumPerito() != null && this.getEpoNumPerito().longValue() == -999) {
            conditions += " AND EPO_NUM_PERITO IS NULL";
        } else if (this.getEpoNumPerito() != null) {
            conditions += " AND EPO_NUM_PERITO = ?";
            values.add(this.getEpoNumPerito());
        }

        if (this.getEpoCalidad() != null && "null".equals(this.getEpoCalidad())) {
            conditions += " AND EPO_CALIDAD IS NULL";
        } else if (this.getEpoCalidad() != null) {
            conditions += " AND EPO_CALIDAD = ?";
            values.add(this.getEpoCalidad());
        }

        if (this.getEpoOportunidad() != null && "null".equals(this.getEpoOportunidad())) {
            conditions += " AND EPO_OPORTUNIDAD IS NULL";
        } else if (this.getEpoOportunidad() != null) {
            conditions += " AND EPO_OPORTUNIDAD = ?";
            values.add(this.getEpoOportunidad());
        }

        if (this.getEpoDocumento1() != null && "null".equals(this.getEpoDocumento1())) {
            conditions += " AND EPO_DOCUMENTO1 IS NULL";
        } else if (this.getEpoDocumento1() != null) {
            conditions += " AND EPO_DOCUMENTO1 = ?";
            values.add(this.getEpoDocumento1());
        }

        if (this.getEpoDocumento2() != null && "null".equals(this.getEpoDocumento2())) {
            conditions += " AND EPO_DOCUMENTO2 IS NULL";
        } else if (this.getEpoDocumento2() != null) {
            conditions += " AND EPO_DOCUMENTO2 = ?";
            values.add(this.getEpoDocumento2());
        }

        if (this.getEpoObservaciones() != null && "null".equals(this.getEpoObservaciones())) {
            conditions += " AND EPO_OBSERVACIONES IS NULL";
        } else if (this.getEpoObservaciones() != null) {
            conditions += " AND EPO_OBSERVACIONES = ?";
            values.add(this.getEpoObservaciones());
        }

        if (this.getEpoAnoAltaReg() != null && this.getEpoAnoAltaReg().longValue() == -999) {
            conditions += " AND EPO_ANO_ALTA_REG IS NULL";
        } else if (this.getEpoAnoAltaReg() != null) {
            conditions += " AND EPO_ANO_ALTA_REG = ?";
            values.add(this.getEpoAnoAltaReg());
        }

        if (this.getEpoMesAltaReg() != null && this.getEpoMesAltaReg().longValue() == -999) {
            conditions += " AND EPO_MES_ALTA_REG IS NULL";
        } else if (this.getEpoMesAltaReg() != null) {
            conditions += " AND EPO_MES_ALTA_REG = ?";
            values.add(this.getEpoMesAltaReg());
        }

        if (this.getEpoDiaAltaReg() != null && this.getEpoDiaAltaReg().longValue() == -999) {
            conditions += " AND EPO_DIA_ALTA_REG IS NULL";
        } else if (this.getEpoDiaAltaReg() != null) {
            conditions += " AND EPO_DIA_ALTA_REG = ?";
            values.add(this.getEpoDiaAltaReg());
        }

        if (this.getEpoAnoUltMod() != null && this.getEpoAnoUltMod().longValue() == -999) {
            conditions += " AND EPO_ANO_ULT_MOD IS NULL";
        } else if (this.getEpoAnoUltMod() != null) {
            conditions += " AND EPO_ANO_ULT_MOD = ?";
            values.add(this.getEpoAnoUltMod());
        }

        if (this.getEpoMesUltMod() != null && this.getEpoMesUltMod().longValue() == -999) {
            conditions += " AND EPO_MES_ULT_MOD IS NULL";
        } else if (this.getEpoMesUltMod() != null) {
            conditions += " AND EPO_MES_ULT_MOD = ?";
            values.add(this.getEpoMesUltMod());
        }

        if (this.getEpoDiaUltMod() != null && this.getEpoDiaUltMod().longValue() == -999) {
            conditions += " AND EPO_DIA_ULT_MOD IS NULL";
        } else if (this.getEpoDiaUltMod() != null) {
            conditions += " AND EPO_DIA_ULT_MOD = ?";
            values.add(this.getEpoDiaUltMod());
        }

        if (this.getEpoCveStExperot() != null && "null".equals(this.getEpoCveStExperot())) {
            conditions += " AND EPO_CVE_ST_EXPEROT IS NULL";
        } else if (this.getEpoCveStExperot() != null) {
            conditions += " AND EPO_CVE_ST_EXPEROT = ?";
            values.add(this.getEpoCveStExperot());
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
        String sql = "UPDATE EXPXPERXOT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EPO_NUM_EXPEDIEN = ?";
        pkValues.add(this.getEpoNumExpedien());
        conditions += " AND EPO_NUM_CAJON2 = ?";
        pkValues.add(this.getEpoNumCajon2());
        conditions += " AND EPO_NUM_OT = ?";
        pkValues.add(this.getEpoNumOt());
        conditions += " AND EPO_TURNO = ?";
        pkValues.add(this.getEpoTurno());
        conditions += " AND EPO_NUM_PERITO = ?";
        pkValues.add(this.getEpoNumPerito());
        fields += " EPO_CALIDAD = ?, ";
        values.add(this.getEpoCalidad());
        fields += " EPO_OPORTUNIDAD = ?, ";
        values.add(this.getEpoOportunidad());
        fields += " EPO_DOCUMENTO1 = ?, ";
        values.add(this.getEpoDocumento1());
        fields += " EPO_DOCUMENTO2 = ?, ";
        values.add(this.getEpoDocumento2());
        fields += " EPO_OBSERVACIONES = ?, ";
        values.add(this.getEpoObservaciones());
        fields += " EPO_ANO_ALTA_REG = ?, ";
        values.add(this.getEpoAnoAltaReg());
        fields += " EPO_MES_ALTA_REG = ?, ";
        values.add(this.getEpoMesAltaReg());
        fields += " EPO_DIA_ALTA_REG = ?, ";
        values.add(this.getEpoDiaAltaReg());
        fields += " EPO_ANO_ULT_MOD = ?, ";
        values.add(this.getEpoAnoUltMod());
        fields += " EPO_MES_ULT_MOD = ?, ";
        values.add(this.getEpoMesUltMod());
        fields += " EPO_DIA_ULT_MOD = ?, ";
        values.add(this.getEpoDiaUltMod());
        fields += " EPO_CVE_ST_EXPEROT = ?, ";
        values.add(this.getEpoCveStExperot());
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
        String sql = "INSERT INTO EXPXPERXOT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EPO_NUM_EXPEDIEN";
        fieldValues += ", ?";
        values.add(this.getEpoNumExpedien());

        fields += ", EPO_NUM_CAJON2";
        fieldValues += ", ?";
        values.add(this.getEpoNumCajon2());

        fields += ", EPO_NUM_OT";
        fieldValues += ", ?";
        values.add(this.getEpoNumOt());

        fields += ", EPO_TURNO";
        fieldValues += ", ?";
        values.add(this.getEpoTurno());

        fields += ", EPO_NUM_PERITO";
        fieldValues += ", ?";
        values.add(this.getEpoNumPerito());

        fields += ", EPO_CALIDAD";
        fieldValues += ", ?";
        values.add(this.getEpoCalidad());

        fields += ", EPO_OPORTUNIDAD";
        fieldValues += ", ?";
        values.add(this.getEpoOportunidad());

        fields += ", EPO_DOCUMENTO1";
        fieldValues += ", ?";
        values.add(this.getEpoDocumento1());

        fields += ", EPO_DOCUMENTO2";
        fieldValues += ", ?";
        values.add(this.getEpoDocumento2());

        fields += ", EPO_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getEpoObservaciones());

        fields += ", EPO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpoAnoAltaReg());

        fields += ", EPO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpoMesAltaReg());

        fields += ", EPO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpoDiaAltaReg());

        fields += ", EPO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpoAnoUltMod());

        fields += ", EPO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpoMesUltMod());

        fields += ", EPO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpoDiaUltMod());

        fields += ", EPO_CVE_ST_EXPEROT";
        fieldValues += ", ?";
        values.add(this.getEpoCveStExperot());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EXPXPERXOT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EPO_NUM_EXPEDIEN = ?";
        values.add(this.getEpoNumExpedien());
        conditions += " AND EPO_NUM_CAJON2 = ?";
        values.add(this.getEpoNumCajon2());
        conditions += " AND EPO_NUM_OT = ?";
        values.add(this.getEpoNumOt());
        conditions += " AND EPO_TURNO = ?";
        values.add(this.getEpoTurno());
        conditions += " AND EPO_NUM_PERITO = ?";
        values.add(this.getEpoNumPerito());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Expxperxot instance = (Expxperxot) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEpoNumExpedien().equals(instance.getEpoNumExpedien()))
            equalObjects = false;
        if (equalObjects && !this.getEpoNumCajon2().equals(instance.getEpoNumCajon2()))
            equalObjects = false;
        if (equalObjects && !this.getEpoNumOt().equals(instance.getEpoNumOt()))
            equalObjects = false;
        if (equalObjects && !this.getEpoTurno().equals(instance.getEpoTurno()))
            equalObjects = false;
        if (equalObjects && !this.getEpoNumPerito().equals(instance.getEpoNumPerito()))
            equalObjects = false;
        if (equalObjects && !this.getEpoCalidad().equals(instance.getEpoCalidad()))
            equalObjects = false;
        if (equalObjects && !this.getEpoOportunidad().equals(instance.getEpoOportunidad()))
            equalObjects = false;
        if (equalObjects && !this.getEpoDocumento1().equals(instance.getEpoDocumento1()))
            equalObjects = false;
        if (equalObjects && !this.getEpoDocumento2().equals(instance.getEpoDocumento2()))
            equalObjects = false;
        if (equalObjects && !this.getEpoObservaciones().equals(instance.getEpoObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getEpoAnoAltaReg().equals(instance.getEpoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpoMesAltaReg().equals(instance.getEpoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpoDiaAltaReg().equals(instance.getEpoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpoAnoUltMod().equals(instance.getEpoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpoMesUltMod().equals(instance.getEpoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpoDiaUltMod().equals(instance.getEpoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpoCveStExperot().equals(instance.getEpoCveStExperot()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Expxperxot result = new Expxperxot();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEpoNumExpedien((BigDecimal) objectData.getData("EPO_NUM_EXPEDIEN"));
        result.setEpoNumCajon2((BigDecimal) objectData.getData("EPO_NUM_CAJON2"));
        result.setEpoNumOt((String) objectData.getData("EPO_NUM_OT"));
        result.setEpoTurno((String) objectData.getData("EPO_TURNO"));
        result.setEpoNumPerito((BigDecimal) objectData.getData("EPO_NUM_PERITO"));
        result.setEpoCalidad((String) objectData.getData("EPO_CALIDAD"));
        result.setEpoOportunidad((String) objectData.getData("EPO_OPORTUNIDAD"));
        result.setEpoDocumento1((String) objectData.getData("EPO_DOCUMENTO1"));
        result.setEpoDocumento2((String) objectData.getData("EPO_DOCUMENTO2"));
        result.setEpoObservaciones((String) objectData.getData("EPO_OBSERVACIONES"));
        result.setEpoAnoAltaReg((BigDecimal) objectData.getData("EPO_ANO_ALTA_REG"));
        result.setEpoMesAltaReg((BigDecimal) objectData.getData("EPO_MES_ALTA_REG"));
        result.setEpoDiaAltaReg((BigDecimal) objectData.getData("EPO_DIA_ALTA_REG"));
        result.setEpoAnoUltMod((BigDecimal) objectData.getData("EPO_ANO_ULT_MOD"));
        result.setEpoMesUltMod((BigDecimal) objectData.getData("EPO_MES_ULT_MOD"));
        result.setEpoDiaUltMod((BigDecimal) objectData.getData("EPO_DIA_ULT_MOD"));
        result.setEpoCveStExperot((String) objectData.getData("EPO_CVE_ST_EXPEROT"));

        return result;

    }

}
