package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ACTAASAM_PK", columns = { "ACT_NUM_PROGRAMA", "ACT_NUM_EMISION", "ACT_NUM_SEC_ASAMBLEA" }, sequences = { "MANUAL" })
public class Actaasam extends DomainObject {

    BigDecimal actNumPrograma = null;
    BigDecimal actNumEmision = null;
    BigDecimal actNumSecAsamblea = null;
    String actCvePizarra = null;
    String actNumSerie = null;
    BigDecimal actAnoAsamblea = null;
    BigDecimal actMesAsamblea = null;
    BigDecimal actDiaAsamblea = null;
    String actHoraAsamblea = null;
    String actLugarAsamblea = null;
    BigDecimal actTitulosCirculacion = null;
    BigDecimal actTitulosRepresentados = null;
    BigDecimal actQuorum = null;
    BigDecimal actConvocatoria = null;
    String actTextoActa = null;
    String actTextoAsamblea = null;
    String actTextoResolucion = null;
    BigDecimal actAnoAltaReg = null;
    BigDecimal actMesAltaReg = null;
    BigDecimal actDiaAltaReg = null;
    BigDecimal actAnoUltMod = null;
    BigDecimal actMesUltMod = null;
    BigDecimal actDiaUltMod = null;
    String actCveStActaasam = null;

    public Actaasam() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setActNumPrograma(BigDecimal actNumPrograma) {
        this.actNumPrograma = actNumPrograma;
    }

    public BigDecimal getActNumPrograma() {
        return this.actNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setActNumEmision(BigDecimal actNumEmision) {
        this.actNumEmision = actNumEmision;
    }

    public BigDecimal getActNumEmision() {
        return this.actNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setActNumSecAsamblea(BigDecimal actNumSecAsamblea) {
        this.actNumSecAsamblea = actNumSecAsamblea;
    }

    public BigDecimal getActNumSecAsamblea() {
        return this.actNumSecAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActCvePizarra(String actCvePizarra) {
        this.actCvePizarra = actCvePizarra;
    }

    public String getActCvePizarra() {
        return this.actCvePizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActNumSerie(String actNumSerie) {
        this.actNumSerie = actNumSerie;
    }

    public String getActNumSerie() {
        return this.actNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setActAnoAsamblea(BigDecimal actAnoAsamblea) {
        this.actAnoAsamblea = actAnoAsamblea;
    }

    public BigDecimal getActAnoAsamblea() {
        return this.actAnoAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActMesAsamblea(BigDecimal actMesAsamblea) {
        this.actMesAsamblea = actMesAsamblea;
    }

    public BigDecimal getActMesAsamblea() {
        return this.actMesAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActDiaAsamblea(BigDecimal actDiaAsamblea) {
        this.actDiaAsamblea = actDiaAsamblea;
    }

    public BigDecimal getActDiaAsamblea() {
        return this.actDiaAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActHoraAsamblea(String actHoraAsamblea) {
        this.actHoraAsamblea = actHoraAsamblea;
    }

    public String getActHoraAsamblea() {
        return this.actHoraAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActLugarAsamblea(String actLugarAsamblea) {
        this.actLugarAsamblea = actLugarAsamblea;
    }

    public String getActLugarAsamblea() {
        return this.actLugarAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setActTitulosCirculacion(BigDecimal actTitulosCirculacion) {
        this.actTitulosCirculacion = actTitulosCirculacion;
    }

    public BigDecimal getActTitulosCirculacion() {
        return this.actTitulosCirculacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setActTitulosRepresentados(BigDecimal actTitulosRepresentados) {
        this.actTitulosRepresentados = actTitulosRepresentados;
    }

    public BigDecimal getActTitulosRepresentados() {
        return this.actTitulosRepresentados;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setActQuorum(BigDecimal actQuorum) {
        this.actQuorum = actQuorum;
    }

    public BigDecimal getActQuorum() {
        return this.actQuorum;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setActConvocatoria(BigDecimal actConvocatoria) {
        this.actConvocatoria = actConvocatoria;
    }

    public BigDecimal getActConvocatoria() {
        return this.actConvocatoria;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActTextoActa(String actTextoActa) {
        this.actTextoActa = actTextoActa;
    }

    public String getActTextoActa() {
        return this.actTextoActa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActTextoAsamblea(String actTextoAsamblea) {
        this.actTextoAsamblea = actTextoAsamblea;
    }

    public String getActTextoAsamblea() {
        return this.actTextoAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActTextoResolucion(String actTextoResolucion) {
        this.actTextoResolucion = actTextoResolucion;
    }

    public String getActTextoResolucion() {
        return this.actTextoResolucion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setActAnoAltaReg(BigDecimal actAnoAltaReg) {
        this.actAnoAltaReg = actAnoAltaReg;
    }

    public BigDecimal getActAnoAltaReg() {
        return this.actAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActMesAltaReg(BigDecimal actMesAltaReg) {
        this.actMesAltaReg = actMesAltaReg;
    }

    public BigDecimal getActMesAltaReg() {
        return this.actMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActDiaAltaReg(BigDecimal actDiaAltaReg) {
        this.actDiaAltaReg = actDiaAltaReg;
    }

    public BigDecimal getActDiaAltaReg() {
        return this.actDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setActAnoUltMod(BigDecimal actAnoUltMod) {
        this.actAnoUltMod = actAnoUltMod;
    }

    public BigDecimal getActAnoUltMod() {
        return this.actAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActMesUltMod(BigDecimal actMesUltMod) {
        this.actMesUltMod = actMesUltMod;
    }

    public BigDecimal getActMesUltMod() {
        return this.actMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActDiaUltMod(BigDecimal actDiaUltMod) {
        this.actDiaUltMod = actDiaUltMod;
    }

    public BigDecimal getActDiaUltMod() {
        return this.actDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActCveStActaasam(String actCveStActaasam) {
        this.actCveStActaasam = actCveStActaasam;
    }

    public String getActCveStActaasam() {
        return this.actCveStActaasam;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ACTAASAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getActNumPrograma() != null && this.getActNumPrograma().longValue() == -999) {
            conditions += " AND ACT_NUM_PROGRAMA IS NULL";
        } else if (this.getActNumPrograma() != null) {
            conditions += " AND ACT_NUM_PROGRAMA = ?";
            values.add(this.getActNumPrograma());
        }

        if (this.getActNumEmision() != null && this.getActNumEmision().longValue() == -999) {
            conditions += " AND ACT_NUM_EMISION IS NULL";
        } else if (this.getActNumEmision() != null) {
            conditions += " AND ACT_NUM_EMISION = ?";
            values.add(this.getActNumEmision());
        }

        if (this.getActNumSecAsamblea() != null && this.getActNumSecAsamblea().longValue() == -999) {
            conditions += " AND ACT_NUM_SEC_ASAMBLEA IS NULL";
        } else if (this.getActNumSecAsamblea() != null) {
            conditions += " AND ACT_NUM_SEC_ASAMBLEA = ?";
            values.add(this.getActNumSecAsamblea());
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
        String sql = "SELECT * FROM ACTAASAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getActNumPrograma() != null && this.getActNumPrograma().longValue() == -999) {
            conditions += " AND ACT_NUM_PROGRAMA IS NULL";
        } else if (this.getActNumPrograma() != null) {
            conditions += " AND ACT_NUM_PROGRAMA = ?";
            values.add(this.getActNumPrograma());
        }

        if (this.getActNumEmision() != null && this.getActNumEmision().longValue() == -999) {
            conditions += " AND ACT_NUM_EMISION IS NULL";
        } else if (this.getActNumEmision() != null) {
            conditions += " AND ACT_NUM_EMISION = ?";
            values.add(this.getActNumEmision());
        }

        if (this.getActNumSecAsamblea() != null && this.getActNumSecAsamblea().longValue() == -999) {
            conditions += " AND ACT_NUM_SEC_ASAMBLEA IS NULL";
        } else if (this.getActNumSecAsamblea() != null) {
            conditions += " AND ACT_NUM_SEC_ASAMBLEA = ?";
            values.add(this.getActNumSecAsamblea());
        }

        if (this.getActCvePizarra() != null && "null".equals(this.getActCvePizarra())) {
            conditions += " AND ACT_CVE_PIZARRA IS NULL";
        } else if (this.getActCvePizarra() != null) {
            conditions += " AND ACT_CVE_PIZARRA = ?";
            values.add(this.getActCvePizarra());
        }

        if (this.getActNumSerie() != null && "null".equals(this.getActNumSerie())) {
            conditions += " AND ACT_NUM_SERIE IS NULL";
        } else if (this.getActNumSerie() != null) {
            conditions += " AND ACT_NUM_SERIE = ?";
            values.add(this.getActNumSerie());
        }

        if (this.getActAnoAsamblea() != null && this.getActAnoAsamblea().longValue() == -999) {
            conditions += " AND ACT_ANO_ASAMBLEA IS NULL";
        } else if (this.getActAnoAsamblea() != null) {
            conditions += " AND ACT_ANO_ASAMBLEA = ?";
            values.add(this.getActAnoAsamblea());
        }

        if (this.getActMesAsamblea() != null && this.getActMesAsamblea().longValue() == -999) {
            conditions += " AND ACT_MES_ASAMBLEA IS NULL";
        } else if (this.getActMesAsamblea() != null) {
            conditions += " AND ACT_MES_ASAMBLEA = ?";
            values.add(this.getActMesAsamblea());
        }

        if (this.getActDiaAsamblea() != null && this.getActDiaAsamblea().longValue() == -999) {
            conditions += " AND ACT_DIA_ASAMBLEA IS NULL";
        } else if (this.getActDiaAsamblea() != null) {
            conditions += " AND ACT_DIA_ASAMBLEA = ?";
            values.add(this.getActDiaAsamblea());
        }

        if (this.getActHoraAsamblea() != null && "null".equals(this.getActHoraAsamblea())) {
            conditions += " AND ACT_HORA_ASAMBLEA IS NULL";
        } else if (this.getActHoraAsamblea() != null) {
            conditions += " AND ACT_HORA_ASAMBLEA = ?";
            values.add(this.getActHoraAsamblea());
        }

        if (this.getActLugarAsamblea() != null && "null".equals(this.getActLugarAsamblea())) {
            conditions += " AND ACT_LUGAR_ASAMBLEA IS NULL";
        } else if (this.getActLugarAsamblea() != null) {
            conditions += " AND ACT_LUGAR_ASAMBLEA = ?";
            values.add(this.getActLugarAsamblea());
        }

        if (this.getActTitulosCirculacion() != null && this.getActTitulosCirculacion().longValue() == -999) {
            conditions += " AND ACT_TITULOS_CIRCULACION IS NULL";
        } else if (this.getActTitulosCirculacion() != null) {
            conditions += " AND ACT_TITULOS_CIRCULACION = ?";
            values.add(this.getActTitulosCirculacion());
        }

        if (this.getActTitulosRepresentados() != null && this.getActTitulosRepresentados().longValue() == -999) {
            conditions += " AND ACT_TITULOS_REPRESENTADOS IS NULL";
        } else if (this.getActTitulosRepresentados() != null) {
            conditions += " AND ACT_TITULOS_REPRESENTADOS = ?";
            values.add(this.getActTitulosRepresentados());
        }

        if (this.getActQuorum() != null && this.getActQuorum().longValue() == -999) {
            conditions += " AND ACT_QUORUM IS NULL";
        } else if (this.getActQuorum() != null) {
            conditions += " AND ACT_QUORUM = ?";
            values.add(this.getActQuorum());
        }

        if (this.getActConvocatoria() != null && this.getActConvocatoria().longValue() == -999) {
            conditions += " AND ACT_CONVOCATORIA IS NULL";
        } else if (this.getActConvocatoria() != null) {
            conditions += " AND ACT_CONVOCATORIA = ?";
            values.add(this.getActConvocatoria());
        }

        if (this.getActTextoActa() != null && "null".equals(this.getActTextoActa())) {
            conditions += " AND ACT_TEXTO_ACTA IS NULL";
        } else if (this.getActTextoActa() != null) {
            conditions += " AND ACT_TEXTO_ACTA = ?";
            values.add(this.getActTextoActa());
        }

        if (this.getActTextoAsamblea() != null && "null".equals(this.getActTextoAsamblea())) {
            conditions += " AND ACT_TEXTO_ASAMBLEA IS NULL";
        } else if (this.getActTextoAsamblea() != null) {
            conditions += " AND ACT_TEXTO_ASAMBLEA = ?";
            values.add(this.getActTextoAsamblea());
        }

        if (this.getActTextoResolucion() != null && "null".equals(this.getActTextoResolucion())) {
            conditions += " AND ACT_TEXTO_RESOLUCION IS NULL";
        } else if (this.getActTextoResolucion() != null) {
            conditions += " AND ACT_TEXTO_RESOLUCION = ?";
            values.add(this.getActTextoResolucion());
        }

        if (this.getActAnoAltaReg() != null && this.getActAnoAltaReg().longValue() == -999) {
            conditions += " AND ACT_ANO_ALTA_REG IS NULL";
        } else if (this.getActAnoAltaReg() != null) {
            conditions += " AND ACT_ANO_ALTA_REG = ?";
            values.add(this.getActAnoAltaReg());
        }

        if (this.getActMesAltaReg() != null && this.getActMesAltaReg().longValue() == -999) {
            conditions += " AND ACT_MES_ALTA_REG IS NULL";
        } else if (this.getActMesAltaReg() != null) {
            conditions += " AND ACT_MES_ALTA_REG = ?";
            values.add(this.getActMesAltaReg());
        }

        if (this.getActDiaAltaReg() != null && this.getActDiaAltaReg().longValue() == -999) {
            conditions += " AND ACT_DIA_ALTA_REG IS NULL";
        } else if (this.getActDiaAltaReg() != null) {
            conditions += " AND ACT_DIA_ALTA_REG = ?";
            values.add(this.getActDiaAltaReg());
        }

        if (this.getActAnoUltMod() != null && this.getActAnoUltMod().longValue() == -999) {
            conditions += " AND ACT_ANO_ULT_MOD IS NULL";
        } else if (this.getActAnoUltMod() != null) {
            conditions += " AND ACT_ANO_ULT_MOD = ?";
            values.add(this.getActAnoUltMod());
        }

        if (this.getActMesUltMod() != null && this.getActMesUltMod().longValue() == -999) {
            conditions += " AND ACT_MES_ULT_MOD IS NULL";
        } else if (this.getActMesUltMod() != null) {
            conditions += " AND ACT_MES_ULT_MOD = ?";
            values.add(this.getActMesUltMod());
        }

        if (this.getActDiaUltMod() != null && this.getActDiaUltMod().longValue() == -999) {
            conditions += " AND ACT_DIA_ULT_MOD IS NULL";
        } else if (this.getActDiaUltMod() != null) {
            conditions += " AND ACT_DIA_ULT_MOD = ?";
            values.add(this.getActDiaUltMod());
        }

        if (this.getActCveStActaasam() != null && "null".equals(this.getActCveStActaasam())) {
            conditions += " AND ACT_CVE_ST_ACTAASAM IS NULL";
        } else if (this.getActCveStActaasam() != null) {
            conditions += " AND ACT_CVE_ST_ACTAASAM = ?";
            values.add(this.getActCveStActaasam());
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
        String sql = "UPDATE ACTAASAM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ACT_NUM_PROGRAMA = ?";
        pkValues.add(this.getActNumPrograma());
        conditions += " AND ACT_NUM_EMISION = ?";
        pkValues.add(this.getActNumEmision());
        conditions += " AND ACT_NUM_SEC_ASAMBLEA = ?";
        pkValues.add(this.getActNumSecAsamblea());
        fields += " ACT_CVE_PIZARRA = ?, ";
        values.add(this.getActCvePizarra());
        fields += " ACT_NUM_SERIE = ?, ";
        values.add(this.getActNumSerie());
        fields += " ACT_ANO_ASAMBLEA = ?, ";
        values.add(this.getActAnoAsamblea());
        fields += " ACT_MES_ASAMBLEA = ?, ";
        values.add(this.getActMesAsamblea());
        fields += " ACT_DIA_ASAMBLEA = ?, ";
        values.add(this.getActDiaAsamblea());
        fields += " ACT_HORA_ASAMBLEA = ?, ";
        values.add(this.getActHoraAsamblea());
        fields += " ACT_LUGAR_ASAMBLEA = ?, ";
        values.add(this.getActLugarAsamblea());
        fields += " ACT_TITULOS_CIRCULACION = ?, ";
        values.add(this.getActTitulosCirculacion());
        fields += " ACT_TITULOS_REPRESENTADOS = ?, ";
        values.add(this.getActTitulosRepresentados());
        fields += " ACT_QUORUM = ?, ";
        values.add(this.getActQuorum());
        fields += " ACT_CONVOCATORIA = ?, ";
        values.add(this.getActConvocatoria());
        fields += " ACT_TEXTO_ACTA = ?, ";
        values.add(this.getActTextoActa());
        fields += " ACT_TEXTO_ASAMBLEA = ?, ";
        values.add(this.getActTextoAsamblea());
        fields += " ACT_TEXTO_RESOLUCION = ?, ";
        values.add(this.getActTextoResolucion());
        fields += " ACT_ANO_ALTA_REG = ?, ";
        values.add(this.getActAnoAltaReg());
        fields += " ACT_MES_ALTA_REG = ?, ";
        values.add(this.getActMesAltaReg());
        fields += " ACT_DIA_ALTA_REG = ?, ";
        values.add(this.getActDiaAltaReg());
        fields += " ACT_ANO_ULT_MOD = ?, ";
        values.add(this.getActAnoUltMod());
        fields += " ACT_MES_ULT_MOD = ?, ";
        values.add(this.getActMesUltMod());
        fields += " ACT_DIA_ULT_MOD = ?, ";
        values.add(this.getActDiaUltMod());
        fields += " ACT_CVE_ST_ACTAASAM = ?, ";
        values.add(this.getActCveStActaasam());
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
        String sql = "INSERT INTO ACTAASAM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ACT_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getActNumPrograma());

        fields += ", ACT_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getActNumEmision());

        fields += ", ACT_NUM_SEC_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getActNumSecAsamblea());

        fields += ", ACT_CVE_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getActCvePizarra());

        fields += ", ACT_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getActNumSerie());

        fields += ", ACT_ANO_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getActAnoAsamblea());

        fields += ", ACT_MES_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getActMesAsamblea());

        fields += ", ACT_DIA_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getActDiaAsamblea());

        fields += ", ACT_HORA_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getActHoraAsamblea());

        fields += ", ACT_LUGAR_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getActLugarAsamblea());

        fields += ", ACT_TITULOS_CIRCULACION";
        fieldValues += ", ?";
        values.add(this.getActTitulosCirculacion());

        fields += ", ACT_TITULOS_REPRESENTADOS";
        fieldValues += ", ?";
        values.add(this.getActTitulosRepresentados());

        fields += ", ACT_QUORUM";
        fieldValues += ", ?";
        values.add(this.getActQuorum());

        fields += ", ACT_CONVOCATORIA";
        fieldValues += ", ?";
        values.add(this.getActConvocatoria());

        fields += ", ACT_TEXTO_ACTA";
        fieldValues += ", ?";
        values.add(this.getActTextoActa());

        fields += ", ACT_TEXTO_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getActTextoAsamblea());

        fields += ", ACT_TEXTO_RESOLUCION";
        fieldValues += ", ?";
        values.add(this.getActTextoResolucion());

        fields += ", ACT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getActAnoAltaReg());

        fields += ", ACT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getActMesAltaReg());

        fields += ", ACT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getActDiaAltaReg());

        fields += ", ACT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getActAnoUltMod());

        fields += ", ACT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getActMesUltMod());

        fields += ", ACT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getActDiaUltMod());

        fields += ", ACT_CVE_ST_ACTAASAM";
        fieldValues += ", ?";
        values.add(this.getActCveStActaasam());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ACTAASAM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ACT_NUM_PROGRAMA = ?";
        values.add(this.getActNumPrograma());
        conditions += " AND ACT_NUM_EMISION = ?";
        values.add(this.getActNumEmision());
        conditions += " AND ACT_NUM_SEC_ASAMBLEA = ?";
        values.add(this.getActNumSecAsamblea());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Actaasam instance = (Actaasam) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getActNumPrograma().equals(instance.getActNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getActNumEmision().equals(instance.getActNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getActNumSecAsamblea().equals(instance.getActNumSecAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getActCvePizarra().equals(instance.getActCvePizarra()))
            equalObjects = false;
        if (equalObjects && !this.getActNumSerie().equals(instance.getActNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getActAnoAsamblea().equals(instance.getActAnoAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getActMesAsamblea().equals(instance.getActMesAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getActDiaAsamblea().equals(instance.getActDiaAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getActHoraAsamblea().equals(instance.getActHoraAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getActLugarAsamblea().equals(instance.getActLugarAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getActTitulosCirculacion().equals(instance.getActTitulosCirculacion()))
            equalObjects = false;
        if (equalObjects && !this.getActTitulosRepresentados().equals(instance.getActTitulosRepresentados()))
            equalObjects = false;
        if (equalObjects && !this.getActQuorum().equals(instance.getActQuorum()))
            equalObjects = false;
        if (equalObjects && !this.getActConvocatoria().equals(instance.getActConvocatoria()))
            equalObjects = false;
        if (equalObjects && !this.getActTextoActa().equals(instance.getActTextoActa()))
            equalObjects = false;
        if (equalObjects && !this.getActTextoAsamblea().equals(instance.getActTextoAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getActTextoResolucion().equals(instance.getActTextoResolucion()))
            equalObjects = false;
        if (equalObjects && !this.getActAnoAltaReg().equals(instance.getActAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getActMesAltaReg().equals(instance.getActMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getActDiaAltaReg().equals(instance.getActDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getActAnoUltMod().equals(instance.getActAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getActMesUltMod().equals(instance.getActMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getActDiaUltMod().equals(instance.getActDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getActCveStActaasam().equals(instance.getActCveStActaasam()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Actaasam result = new Actaasam();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setActNumPrograma((BigDecimal) objectData.getData("ACT_NUM_PROGRAMA"));
        result.setActNumEmision((BigDecimal) objectData.getData("ACT_NUM_EMISION"));
        result.setActNumSecAsamblea((BigDecimal) objectData.getData("ACT_NUM_SEC_ASAMBLEA"));
        result.setActCvePizarra((String) objectData.getData("ACT_CVE_PIZARRA"));
        result.setActNumSerie((String) objectData.getData("ACT_NUM_SERIE"));
        result.setActAnoAsamblea((BigDecimal) objectData.getData("ACT_ANO_ASAMBLEA"));
        result.setActMesAsamblea((BigDecimal) objectData.getData("ACT_MES_ASAMBLEA"));
        result.setActDiaAsamblea((BigDecimal) objectData.getData("ACT_DIA_ASAMBLEA"));
        result.setActHoraAsamblea((String) objectData.getData("ACT_HORA_ASAMBLEA"));
        result.setActLugarAsamblea((String) objectData.getData("ACT_LUGAR_ASAMBLEA"));
        result.setActTitulosCirculacion((BigDecimal) objectData.getData("ACT_TITULOS_CIRCULACION"));
        result.setActTitulosRepresentados((BigDecimal) objectData.getData("ACT_TITULOS_REPRESENTADOS"));
        result.setActQuorum((BigDecimal) objectData.getData("ACT_QUORUM"));
        result.setActConvocatoria((BigDecimal) objectData.getData("ACT_CONVOCATORIA"));
        result.setActTextoActa((String) objectData.getData("ACT_TEXTO_ACTA"));
        result.setActTextoAsamblea((String) objectData.getData("ACT_TEXTO_ASAMBLEA"));
        result.setActTextoResolucion((String) objectData.getData("ACT_TEXTO_RESOLUCION"));
        result.setActAnoAltaReg((BigDecimal) objectData.getData("ACT_ANO_ALTA_REG"));
        result.setActMesAltaReg((BigDecimal) objectData.getData("ACT_MES_ALTA_REG"));
        result.setActDiaAltaReg((BigDecimal) objectData.getData("ACT_DIA_ALTA_REG"));
        result.setActAnoUltMod((BigDecimal) objectData.getData("ACT_ANO_ULT_MOD"));
        result.setActMesUltMod((BigDecimal) objectData.getData("ACT_MES_ULT_MOD"));
        result.setActDiaUltMod((BigDecimal) objectData.getData("ACT_DIA_ULT_MOD"));
        result.setActCveStActaasam((String) objectData.getData("ACT_CVE_ST_ACTAASAM"));

        return result;

    }

}
