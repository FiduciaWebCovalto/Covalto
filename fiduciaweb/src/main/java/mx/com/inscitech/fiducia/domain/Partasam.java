package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARTASAM_PK", columns = { "PAS_NUM_PROGRAMA", "PAS_NUM_EMISION", "PAS_NUM_SEC_ASAMBLEA", "PAS_NUM_PARTICIPANTE" }, sequences = { "MANUAL" })
public class Partasam extends DomainObject {

    BigDecimal pasNumPrograma = null;
    BigDecimal pasNumEmision = null;
    BigDecimal pasNumSecAsamblea = null;
    BigDecimal pasNumParticipante = null;
    String pasNomParticipante = null;
    String pasNomInstitucion = null;
    BigDecimal pasTitulosCirculacion = null;
    BigDecimal pasAnoAltaReg = null;
    BigDecimal pasMesAltaReg = null;
    BigDecimal pasDiaAltaReg = null;
    BigDecimal pasAnoUltMod = null;
    BigDecimal pasMesUltMod = null;
    BigDecimal pasDiaUltMod = null;
    String pasCveStPartasam = null;

    public Partasam() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPasNumPrograma(BigDecimal pasNumPrograma) {
        this.pasNumPrograma = pasNumPrograma;
    }

    public BigDecimal getPasNumPrograma() {
        return this.pasNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPasNumEmision(BigDecimal pasNumEmision) {
        this.pasNumEmision = pasNumEmision;
    }

    public BigDecimal getPasNumEmision() {
        return this.pasNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPasNumSecAsamblea(BigDecimal pasNumSecAsamblea) {
        this.pasNumSecAsamblea = pasNumSecAsamblea;
    }

    public BigDecimal getPasNumSecAsamblea() {
        return this.pasNumSecAsamblea;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPasNumParticipante(BigDecimal pasNumParticipante) {
        this.pasNumParticipante = pasNumParticipante;
    }

    public BigDecimal getPasNumParticipante() {
        return this.pasNumParticipante;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPasNomParticipante(String pasNomParticipante) {
        this.pasNomParticipante = pasNomParticipante;
    }

    public String getPasNomParticipante() {
        return this.pasNomParticipante;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPasNomInstitucion(String pasNomInstitucion) {
        this.pasNomInstitucion = pasNomInstitucion;
    }

    public String getPasNomInstitucion() {
        return this.pasNomInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setPasTitulosCirculacion(BigDecimal pasTitulosCirculacion) {
        this.pasTitulosCirculacion = pasTitulosCirculacion;
    }

    public BigDecimal getPasTitulosCirculacion() {
        return this.pasTitulosCirculacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPasAnoAltaReg(BigDecimal pasAnoAltaReg) {
        this.pasAnoAltaReg = pasAnoAltaReg;
    }

    public BigDecimal getPasAnoAltaReg() {
        return this.pasAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPasMesAltaReg(BigDecimal pasMesAltaReg) {
        this.pasMesAltaReg = pasMesAltaReg;
    }

    public BigDecimal getPasMesAltaReg() {
        return this.pasMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPasDiaAltaReg(BigDecimal pasDiaAltaReg) {
        this.pasDiaAltaReg = pasDiaAltaReg;
    }

    public BigDecimal getPasDiaAltaReg() {
        return this.pasDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPasAnoUltMod(BigDecimal pasAnoUltMod) {
        this.pasAnoUltMod = pasAnoUltMod;
    }

    public BigDecimal getPasAnoUltMod() {
        return this.pasAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPasMesUltMod(BigDecimal pasMesUltMod) {
        this.pasMesUltMod = pasMesUltMod;
    }

    public BigDecimal getPasMesUltMod() {
        return this.pasMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPasDiaUltMod(BigDecimal pasDiaUltMod) {
        this.pasDiaUltMod = pasDiaUltMod;
    }

    public BigDecimal getPasDiaUltMod() {
        return this.pasDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPasCveStPartasam(String pasCveStPartasam) {
        this.pasCveStPartasam = pasCveStPartasam;
    }

    public String getPasCveStPartasam() {
        return this.pasCveStPartasam;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARTASAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPasNumPrograma() != null && this.getPasNumPrograma().longValue() == -999) {
            conditions += " AND PAS_NUM_PROGRAMA IS NULL";
        } else if (this.getPasNumPrograma() != null) {
            conditions += " AND PAS_NUM_PROGRAMA = ?";
            values.add(this.getPasNumPrograma());
        }

        if (this.getPasNumEmision() != null && this.getPasNumEmision().longValue() == -999) {
            conditions += " AND PAS_NUM_EMISION IS NULL";
        } else if (this.getPasNumEmision() != null) {
            conditions += " AND PAS_NUM_EMISION = ?";
            values.add(this.getPasNumEmision());
        }

        if (this.getPasNumSecAsamblea() != null && this.getPasNumSecAsamblea().longValue() == -999) {
            conditions += " AND PAS_NUM_SEC_ASAMBLEA IS NULL";
        } else if (this.getPasNumSecAsamblea() != null) {
            conditions += " AND PAS_NUM_SEC_ASAMBLEA = ?";
            values.add(this.getPasNumSecAsamblea());
        }

        if (this.getPasNumParticipante() != null && this.getPasNumParticipante().longValue() == -999) {
            conditions += " AND PAS_NUM_PARTICIPANTE IS NULL";
        } else if (this.getPasNumParticipante() != null) {
            conditions += " AND PAS_NUM_PARTICIPANTE = ?";
            values.add(this.getPasNumParticipante());
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
        String sql = "SELECT * FROM PARTASAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPasNumPrograma() != null && this.getPasNumPrograma().longValue() == -999) {
            conditions += " AND PAS_NUM_PROGRAMA IS NULL";
        } else if (this.getPasNumPrograma() != null) {
            conditions += " AND PAS_NUM_PROGRAMA = ?";
            values.add(this.getPasNumPrograma());
        }

        if (this.getPasNumEmision() != null && this.getPasNumEmision().longValue() == -999) {
            conditions += " AND PAS_NUM_EMISION IS NULL";
        } else if (this.getPasNumEmision() != null) {
            conditions += " AND PAS_NUM_EMISION = ?";
            values.add(this.getPasNumEmision());
        }

        if (this.getPasNumSecAsamblea() != null && this.getPasNumSecAsamblea().longValue() == -999) {
            conditions += " AND PAS_NUM_SEC_ASAMBLEA IS NULL";
        } else if (this.getPasNumSecAsamblea() != null) {
            conditions += " AND PAS_NUM_SEC_ASAMBLEA = ?";
            values.add(this.getPasNumSecAsamblea());
        }

        if (this.getPasNumParticipante() != null && this.getPasNumParticipante().longValue() == -999) {
            conditions += " AND PAS_NUM_PARTICIPANTE IS NULL";
        } else if (this.getPasNumParticipante() != null) {
            conditions += " AND PAS_NUM_PARTICIPANTE = ?";
            values.add(this.getPasNumParticipante());
        }

        if (this.getPasNomParticipante() != null && "null".equals(this.getPasNomParticipante())) {
            conditions += " AND PAS_NOM_PARTICIPANTE IS NULL";
        } else if (this.getPasNomParticipante() != null) {
            conditions += " AND PAS_NOM_PARTICIPANTE = ?";
            values.add(this.getPasNomParticipante());
        }

        if (this.getPasNomInstitucion() != null && "null".equals(this.getPasNomInstitucion())) {
            conditions += " AND PAS_NOM_INSTITUCION IS NULL";
        } else if (this.getPasNomInstitucion() != null) {
            conditions += " AND PAS_NOM_INSTITUCION = ?";
            values.add(this.getPasNomInstitucion());
        }

        if (this.getPasTitulosCirculacion() != null && this.getPasTitulosCirculacion().longValue() == -999) {
            conditions += " AND PAS_TITULOS_CIRCULACION IS NULL";
        } else if (this.getPasTitulosCirculacion() != null) {
            conditions += " AND PAS_TITULOS_CIRCULACION = ?";
            values.add(this.getPasTitulosCirculacion());
        }

        if (this.getPasAnoAltaReg() != null && this.getPasAnoAltaReg().longValue() == -999) {
            conditions += " AND PAS_ANO_ALTA_REG IS NULL";
        } else if (this.getPasAnoAltaReg() != null) {
            conditions += " AND PAS_ANO_ALTA_REG = ?";
            values.add(this.getPasAnoAltaReg());
        }

        if (this.getPasMesAltaReg() != null && this.getPasMesAltaReg().longValue() == -999) {
            conditions += " AND PAS_MES_ALTA_REG IS NULL";
        } else if (this.getPasMesAltaReg() != null) {
            conditions += " AND PAS_MES_ALTA_REG = ?";
            values.add(this.getPasMesAltaReg());
        }

        if (this.getPasDiaAltaReg() != null && this.getPasDiaAltaReg().longValue() == -999) {
            conditions += " AND PAS_DIA_ALTA_REG IS NULL";
        } else if (this.getPasDiaAltaReg() != null) {
            conditions += " AND PAS_DIA_ALTA_REG = ?";
            values.add(this.getPasDiaAltaReg());
        }

        if (this.getPasAnoUltMod() != null && this.getPasAnoUltMod().longValue() == -999) {
            conditions += " AND PAS_ANO_ULT_MOD IS NULL";
        } else if (this.getPasAnoUltMod() != null) {
            conditions += " AND PAS_ANO_ULT_MOD = ?";
            values.add(this.getPasAnoUltMod());
        }

        if (this.getPasMesUltMod() != null && this.getPasMesUltMod().longValue() == -999) {
            conditions += " AND PAS_MES_ULT_MOD IS NULL";
        } else if (this.getPasMesUltMod() != null) {
            conditions += " AND PAS_MES_ULT_MOD = ?";
            values.add(this.getPasMesUltMod());
        }

        if (this.getPasDiaUltMod() != null && this.getPasDiaUltMod().longValue() == -999) {
            conditions += " AND PAS_DIA_ULT_MOD IS NULL";
        } else if (this.getPasDiaUltMod() != null) {
            conditions += " AND PAS_DIA_ULT_MOD = ?";
            values.add(this.getPasDiaUltMod());
        }

        if (this.getPasCveStPartasam() != null && "null".equals(this.getPasCveStPartasam())) {
            conditions += " AND PAS_CVE_ST_PARTASAM IS NULL";
        } else if (this.getPasCveStPartasam() != null) {
            conditions += " AND PAS_CVE_ST_PARTASAM = ?";
            values.add(this.getPasCveStPartasam());
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
        String sql = "UPDATE PARTASAM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAS_NUM_PROGRAMA = ?";
        pkValues.add(this.getPasNumPrograma());
        conditions += " AND PAS_NUM_EMISION = ?";
        pkValues.add(this.getPasNumEmision());
        conditions += " AND PAS_NUM_SEC_ASAMBLEA = ?";
        pkValues.add(this.getPasNumSecAsamblea());
        conditions += " AND PAS_NUM_PARTICIPANTE = ?";
        pkValues.add(this.getPasNumParticipante());
        fields += " PAS_NOM_PARTICIPANTE = ?, ";
        values.add(this.getPasNomParticipante());
        fields += " PAS_NOM_INSTITUCION = ?, ";
        values.add(this.getPasNomInstitucion());
        fields += " PAS_TITULOS_CIRCULACION = ?, ";
        values.add(this.getPasTitulosCirculacion());
        fields += " PAS_ANO_ALTA_REG = ?, ";
        values.add(this.getPasAnoAltaReg());
        fields += " PAS_MES_ALTA_REG = ?, ";
        values.add(this.getPasMesAltaReg());
        fields += " PAS_DIA_ALTA_REG = ?, ";
        values.add(this.getPasDiaAltaReg());
        fields += " PAS_ANO_ULT_MOD = ?, ";
        values.add(this.getPasAnoUltMod());
        fields += " PAS_MES_ULT_MOD = ?, ";
        values.add(this.getPasMesUltMod());
        fields += " PAS_DIA_ULT_MOD = ?, ";
        values.add(this.getPasDiaUltMod());
        fields += " PAS_CVE_ST_PARTASAM = ?, ";
        values.add(this.getPasCveStPartasam());
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
        String sql = "INSERT INTO PARTASAM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAS_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getPasNumPrograma());

        fields += ", PAS_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getPasNumEmision());

        fields += ", PAS_NUM_SEC_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getPasNumSecAsamblea());

        fields += ", PAS_NUM_PARTICIPANTE";
        fieldValues += ", ?";
        values.add(this.getPasNumParticipante());

        fields += ", PAS_NOM_PARTICIPANTE";
        fieldValues += ", ?";
        values.add(this.getPasNomParticipante());

        fields += ", PAS_NOM_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getPasNomInstitucion());

        fields += ", PAS_TITULOS_CIRCULACION";
        fieldValues += ", ?";
        values.add(this.getPasTitulosCirculacion());

        fields += ", PAS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPasAnoAltaReg());

        fields += ", PAS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPasMesAltaReg());

        fields += ", PAS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPasDiaAltaReg());

        fields += ", PAS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPasAnoUltMod());

        fields += ", PAS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPasMesUltMod());

        fields += ", PAS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPasDiaUltMod());

        fields += ", PAS_CVE_ST_PARTASAM";
        fieldValues += ", ?";
        values.add(this.getPasCveStPartasam());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARTASAM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAS_NUM_PROGRAMA = ?";
        values.add(this.getPasNumPrograma());
        conditions += " AND PAS_NUM_EMISION = ?";
        values.add(this.getPasNumEmision());
        conditions += " AND PAS_NUM_SEC_ASAMBLEA = ?";
        values.add(this.getPasNumSecAsamblea());
        conditions += " AND PAS_NUM_PARTICIPANTE = ?";
        values.add(this.getPasNumParticipante());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Partasam instance = (Partasam) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPasNumPrograma().equals(instance.getPasNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getPasNumEmision().equals(instance.getPasNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getPasNumSecAsamblea().equals(instance.getPasNumSecAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getPasNumParticipante().equals(instance.getPasNumParticipante()))
            equalObjects = false;
        if (equalObjects && !this.getPasNomParticipante().equals(instance.getPasNomParticipante()))
            equalObjects = false;
        if (equalObjects && !this.getPasNomInstitucion().equals(instance.getPasNomInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getPasTitulosCirculacion().equals(instance.getPasTitulosCirculacion()))
            equalObjects = false;
        if (equalObjects && !this.getPasAnoAltaReg().equals(instance.getPasAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPasMesAltaReg().equals(instance.getPasMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPasDiaAltaReg().equals(instance.getPasDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPasAnoUltMod().equals(instance.getPasAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPasMesUltMod().equals(instance.getPasMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPasDiaUltMod().equals(instance.getPasDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPasCveStPartasam().equals(instance.getPasCveStPartasam()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Partasam result = new Partasam();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPasNumPrograma((BigDecimal) objectData.getData("PAS_NUM_PROGRAMA"));
        result.setPasNumEmision((BigDecimal) objectData.getData("PAS_NUM_EMISION"));
        result.setPasNumSecAsamblea((BigDecimal) objectData.getData("PAS_NUM_SEC_ASAMBLEA"));
        result.setPasNumParticipante((BigDecimal) objectData.getData("PAS_NUM_PARTICIPANTE"));
        result.setPasNomParticipante((String) objectData.getData("PAS_NOM_PARTICIPANTE"));
        result.setPasNomInstitucion((String) objectData.getData("PAS_NOM_INSTITUCION"));
        result.setPasTitulosCirculacion((BigDecimal) objectData.getData("PAS_TITULOS_CIRCULACION"));
        result.setPasAnoAltaReg((BigDecimal) objectData.getData("PAS_ANO_ALTA_REG"));
        result.setPasMesAltaReg((BigDecimal) objectData.getData("PAS_MES_ALTA_REG"));
        result.setPasDiaAltaReg((BigDecimal) objectData.getData("PAS_DIA_ALTA_REG"));
        result.setPasAnoUltMod((BigDecimal) objectData.getData("PAS_ANO_ULT_MOD"));
        result.setPasMesUltMod((BigDecimal) objectData.getData("PAS_MES_ULT_MOD"));
        result.setPasDiaUltMod((BigDecimal) objectData.getData("PAS_DIA_ULT_MOD"));
        result.setPasCveStPartasam((String) objectData.getData("PAS_CVE_ST_PARTASAM"));

        return result;

    }

}
