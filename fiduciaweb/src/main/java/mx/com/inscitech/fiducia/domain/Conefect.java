package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONEFECT_PK",
            columns = { "CEF_DIA_SUGERENCIA", "CEF_MES_SUGERENCIA", "CEF_ANO_SUGERENCIA", "CEF_SUB_CONTRATO", "CEF_HR_REG_INCREM", "CEF_NUM_CONTRATO", "CEF_NUM_CORTE"
    }, sequences = { "MANUAL" })
public class Conefect extends DomainObject {

    BigDecimal cefAnoSugerencia = null;
    BigDecimal cefMesSugerencia = null;
    BigDecimal cefDiaSugerencia = null;
    BigDecimal cefNumCorte = null;
    BigDecimal cefNumContrato = null;
    BigDecimal cefSubContrato = null;
    String cefHrRegIncrem = null;
    BigDecimal cefImpIncremento = null;
    BigDecimal cefImpAsignado = null;
    BigDecimal cefImpDisponible = null;
    BigDecimal cefNumFolOpera = null;
    BigDecimal cefNumOperacion = null;
    String cefCveStConefec = null;

    public Conefect() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCefAnoSugerencia(BigDecimal cefAnoSugerencia) {
        this.cefAnoSugerencia = cefAnoSugerencia;
    }

    public BigDecimal getCefAnoSugerencia() {
        return this.cefAnoSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCefMesSugerencia(BigDecimal cefMesSugerencia) {
        this.cefMesSugerencia = cefMesSugerencia;
    }

    public BigDecimal getCefMesSugerencia() {
        return this.cefMesSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCefDiaSugerencia(BigDecimal cefDiaSugerencia) {
        this.cefDiaSugerencia = cefDiaSugerencia;
    }

    public BigDecimal getCefDiaSugerencia() {
        return this.cefDiaSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCefNumCorte(BigDecimal cefNumCorte) {
        this.cefNumCorte = cefNumCorte;
    }

    public BigDecimal getCefNumCorte() {
        return this.cefNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCefNumContrato(BigDecimal cefNumContrato) {
        this.cefNumContrato = cefNumContrato;
    }

    public BigDecimal getCefNumContrato() {
        return this.cefNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCefSubContrato(BigDecimal cefSubContrato) {
        this.cefSubContrato = cefSubContrato;
    }

    public BigDecimal getCefSubContrato() {
        return this.cefSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCefHrRegIncrem(String cefHrRegIncrem) {
        this.cefHrRegIncrem = cefHrRegIncrem;
    }

    public String getCefHrRegIncrem() {
        return this.cefHrRegIncrem;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCefImpIncremento(BigDecimal cefImpIncremento) {
        this.cefImpIncremento = cefImpIncremento;
    }

    public BigDecimal getCefImpIncremento() {
        return this.cefImpIncremento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCefImpAsignado(BigDecimal cefImpAsignado) {
        this.cefImpAsignado = cefImpAsignado;
    }

    public BigDecimal getCefImpAsignado() {
        return this.cefImpAsignado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCefImpDisponible(BigDecimal cefImpDisponible) {
        this.cefImpDisponible = cefImpDisponible;
    }

    public BigDecimal getCefImpDisponible() {
        return this.cefImpDisponible;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCefNumFolOpera(BigDecimal cefNumFolOpera) {
        this.cefNumFolOpera = cefNumFolOpera;
    }

    public BigDecimal getCefNumFolOpera() {
        return this.cefNumFolOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCefNumOperacion(BigDecimal cefNumOperacion) {
        this.cefNumOperacion = cefNumOperacion;
    }

    public BigDecimal getCefNumOperacion() {
        return this.cefNumOperacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCefCveStConefec(String cefCveStConefec) {
        this.cefCveStConefec = cefCveStConefec;
    }

    public String getCefCveStConefec() {
        return this.cefCveStConefec;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONEFECT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCefAnoSugerencia() != null && this.getCefAnoSugerencia().longValue() == -999) {
            conditions += " AND CEF_ANO_SUGERENCIA IS NULL";
        } else if (this.getCefAnoSugerencia() != null) {
            conditions += " AND CEF_ANO_SUGERENCIA = ?";
            values.add(this.getCefAnoSugerencia());
        }

        if (this.getCefMesSugerencia() != null && this.getCefMesSugerencia().longValue() == -999) {
            conditions += " AND CEF_MES_SUGERENCIA IS NULL";
        } else if (this.getCefMesSugerencia() != null) {
            conditions += " AND CEF_MES_SUGERENCIA = ?";
            values.add(this.getCefMesSugerencia());
        }

        if (this.getCefDiaSugerencia() != null && this.getCefDiaSugerencia().longValue() == -999) {
            conditions += " AND CEF_DIA_SUGERENCIA IS NULL";
        } else if (this.getCefDiaSugerencia() != null) {
            conditions += " AND CEF_DIA_SUGERENCIA = ?";
            values.add(this.getCefDiaSugerencia());
        }

        if (this.getCefNumCorte() != null && this.getCefNumCorte().longValue() == -999) {
            conditions += " AND CEF_NUM_CORTE IS NULL";
        } else if (this.getCefNumCorte() != null) {
            conditions += " AND CEF_NUM_CORTE = ?";
            values.add(this.getCefNumCorte());
        }

        if (this.getCefNumContrato() != null && this.getCefNumContrato().longValue() == -999) {
            conditions += " AND CEF_NUM_CONTRATO IS NULL";
        } else if (this.getCefNumContrato() != null) {
            conditions += " AND CEF_NUM_CONTRATO = ?";
            values.add(this.getCefNumContrato());
        }

        if (this.getCefSubContrato() != null && this.getCefSubContrato().longValue() == -999) {
            conditions += " AND CEF_SUB_CONTRATO IS NULL";
        } else if (this.getCefSubContrato() != null) {
            conditions += " AND CEF_SUB_CONTRATO = ?";
            values.add(this.getCefSubContrato());
        }

        if (this.getCefHrRegIncrem() != null && "null".equals(this.getCefHrRegIncrem())) {
            conditions += " AND CEF_HR_REG_INCREM IS NULL";
        } else if (this.getCefHrRegIncrem() != null) {
            conditions += " AND CEF_HR_REG_INCREM = ?";
            values.add(this.getCefHrRegIncrem());
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
        String sql = "SELECT * FROM CONEFECT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCefAnoSugerencia() != null && this.getCefAnoSugerencia().longValue() == -999) {
            conditions += " AND CEF_ANO_SUGERENCIA IS NULL";
        } else if (this.getCefAnoSugerencia() != null) {
            conditions += " AND CEF_ANO_SUGERENCIA = ?";
            values.add(this.getCefAnoSugerencia());
        }

        if (this.getCefMesSugerencia() != null && this.getCefMesSugerencia().longValue() == -999) {
            conditions += " AND CEF_MES_SUGERENCIA IS NULL";
        } else if (this.getCefMesSugerencia() != null) {
            conditions += " AND CEF_MES_SUGERENCIA = ?";
            values.add(this.getCefMesSugerencia());
        }

        if (this.getCefDiaSugerencia() != null && this.getCefDiaSugerencia().longValue() == -999) {
            conditions += " AND CEF_DIA_SUGERENCIA IS NULL";
        } else if (this.getCefDiaSugerencia() != null) {
            conditions += " AND CEF_DIA_SUGERENCIA = ?";
            values.add(this.getCefDiaSugerencia());
        }

        if (this.getCefNumCorte() != null && this.getCefNumCorte().longValue() == -999) {
            conditions += " AND CEF_NUM_CORTE IS NULL";
        } else if (this.getCefNumCorte() != null) {
            conditions += " AND CEF_NUM_CORTE = ?";
            values.add(this.getCefNumCorte());
        }

        if (this.getCefNumContrato() != null && this.getCefNumContrato().longValue() == -999) {
            conditions += " AND CEF_NUM_CONTRATO IS NULL";
        } else if (this.getCefNumContrato() != null) {
            conditions += " AND CEF_NUM_CONTRATO = ?";
            values.add(this.getCefNumContrato());
        }

        if (this.getCefSubContrato() != null && this.getCefSubContrato().longValue() == -999) {
            conditions += " AND CEF_SUB_CONTRATO IS NULL";
        } else if (this.getCefSubContrato() != null) {
            conditions += " AND CEF_SUB_CONTRATO = ?";
            values.add(this.getCefSubContrato());
        }

        if (this.getCefHrRegIncrem() != null && "null".equals(this.getCefHrRegIncrem())) {
            conditions += " AND CEF_HR_REG_INCREM IS NULL";
        } else if (this.getCefHrRegIncrem() != null) {
            conditions += " AND CEF_HR_REG_INCREM = ?";
            values.add(this.getCefHrRegIncrem());
        }

        if (this.getCefImpIncremento() != null && this.getCefImpIncremento().longValue() == -999) {
            conditions += " AND CEF_IMP_INCREMENTO IS NULL";
        } else if (this.getCefImpIncremento() != null) {
            conditions += " AND CEF_IMP_INCREMENTO = ?";
            values.add(this.getCefImpIncremento());
        }

        if (this.getCefImpAsignado() != null && this.getCefImpAsignado().longValue() == -999) {
            conditions += " AND CEF_IMP_ASIGNADO IS NULL";
        } else if (this.getCefImpAsignado() != null) {
            conditions += " AND CEF_IMP_ASIGNADO = ?";
            values.add(this.getCefImpAsignado());
        }

        if (this.getCefImpDisponible() != null && this.getCefImpDisponible().longValue() == -999) {
            conditions += " AND CEF_IMP_DISPONIBLE IS NULL";
        } else if (this.getCefImpDisponible() != null) {
            conditions += " AND CEF_IMP_DISPONIBLE = ?";
            values.add(this.getCefImpDisponible());
        }

        if (this.getCefNumFolOpera() != null && this.getCefNumFolOpera().longValue() == -999) {
            conditions += " AND CEF_NUM_FOL_OPERA IS NULL";
        } else if (this.getCefNumFolOpera() != null) {
            conditions += " AND CEF_NUM_FOL_OPERA = ?";
            values.add(this.getCefNumFolOpera());
        }

        if (this.getCefNumOperacion() != null && this.getCefNumOperacion().longValue() == -999) {
            conditions += " AND CEF_NUM_OPERACION IS NULL";
        } else if (this.getCefNumOperacion() != null) {
            conditions += " AND CEF_NUM_OPERACION = ?";
            values.add(this.getCefNumOperacion());
        }

        if (this.getCefCveStConefec() != null && "null".equals(this.getCefCveStConefec())) {
            conditions += " AND CEF_CVE_ST_CONEFEC IS NULL";
        } else if (this.getCefCveStConefec() != null) {
            conditions += " AND CEF_CVE_ST_CONEFEC = ?";
            values.add(this.getCefCveStConefec());
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
        String sql = "UPDATE CONEFECT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CEF_ANO_SUGERENCIA = ?";
        pkValues.add(this.getCefAnoSugerencia());
        conditions += " AND CEF_MES_SUGERENCIA = ?";
        pkValues.add(this.getCefMesSugerencia());
        conditions += " AND CEF_DIA_SUGERENCIA = ?";
        pkValues.add(this.getCefDiaSugerencia());
        conditions += " AND CEF_NUM_CORTE = ?";
        pkValues.add(this.getCefNumCorte());
        conditions += " AND CEF_NUM_CONTRATO = ?";
        pkValues.add(this.getCefNumContrato());
        conditions += " AND CEF_SUB_CONTRATO = ?";
        pkValues.add(this.getCefSubContrato());
        conditions += " AND CEF_HR_REG_INCREM = ?";
        pkValues.add(this.getCefHrRegIncrem());
        fields += " CEF_IMP_INCREMENTO = ?, ";
        values.add(this.getCefImpIncremento());
        fields += " CEF_IMP_ASIGNADO = ?, ";
        values.add(this.getCefImpAsignado());
        fields += " CEF_IMP_DISPONIBLE = ?, ";
        values.add(this.getCefImpDisponible());
        fields += " CEF_NUM_FOL_OPERA = ?, ";
        values.add(this.getCefNumFolOpera());
        fields += " CEF_NUM_OPERACION = ?, ";
        values.add(this.getCefNumOperacion());
        fields += " CEF_CVE_ST_CONEFEC = ?, ";
        values.add(this.getCefCveStConefec());
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
        String sql = "INSERT INTO CONEFECT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CEF_ANO_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getCefAnoSugerencia());

        fields += ", CEF_MES_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getCefMesSugerencia());

        fields += ", CEF_DIA_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getCefDiaSugerencia());

        fields += ", CEF_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getCefNumCorte());

        fields += ", CEF_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCefNumContrato());

        fields += ", CEF_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCefSubContrato());

        fields += ", CEF_HR_REG_INCREM";
        fieldValues += ", ?";
        values.add(this.getCefHrRegIncrem());

        fields += ", CEF_IMP_INCREMENTO";
        fieldValues += ", ?";
        values.add(this.getCefImpIncremento());

        fields += ", CEF_IMP_ASIGNADO";
        fieldValues += ", ?";
        values.add(this.getCefImpAsignado());

        fields += ", CEF_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getCefImpDisponible());

        fields += ", CEF_NUM_FOL_OPERA";
        fieldValues += ", ?";
        values.add(this.getCefNumFolOpera());

        fields += ", CEF_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getCefNumOperacion());

        fields += ", CEF_CVE_ST_CONEFEC";
        fieldValues += ", ?";
        values.add(this.getCefCveStConefec());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONEFECT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CEF_ANO_SUGERENCIA = ?";
        values.add(this.getCefAnoSugerencia());
        conditions += " AND CEF_MES_SUGERENCIA = ?";
        values.add(this.getCefMesSugerencia());
        conditions += " AND CEF_DIA_SUGERENCIA = ?";
        values.add(this.getCefDiaSugerencia());
        conditions += " AND CEF_NUM_CORTE = ?";
        values.add(this.getCefNumCorte());
        conditions += " AND CEF_NUM_CONTRATO = ?";
        values.add(this.getCefNumContrato());
        conditions += " AND CEF_SUB_CONTRATO = ?";
        values.add(this.getCefSubContrato());
        conditions += " AND CEF_HR_REG_INCREM = ?";
        values.add(this.getCefHrRegIncrem());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Conefect instance = (Conefect) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCefAnoSugerencia().equals(instance.getCefAnoSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getCefMesSugerencia().equals(instance.getCefMesSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getCefDiaSugerencia().equals(instance.getCefDiaSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getCefNumCorte().equals(instance.getCefNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCefNumContrato().equals(instance.getCefNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCefSubContrato().equals(instance.getCefSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCefHrRegIncrem().equals(instance.getCefHrRegIncrem()))
            equalObjects = false;
        if (equalObjects && !this.getCefImpIncremento().equals(instance.getCefImpIncremento()))
            equalObjects = false;
        if (equalObjects && !this.getCefImpAsignado().equals(instance.getCefImpAsignado()))
            equalObjects = false;
        if (equalObjects && !this.getCefImpDisponible().equals(instance.getCefImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getCefNumFolOpera().equals(instance.getCefNumFolOpera()))
            equalObjects = false;
        if (equalObjects && !this.getCefNumOperacion().equals(instance.getCefNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getCefCveStConefec().equals(instance.getCefCveStConefec()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Conefect result = new Conefect();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCefAnoSugerencia((BigDecimal) objectData.getData("CEF_ANO_SUGERENCIA"));
        result.setCefMesSugerencia((BigDecimal) objectData.getData("CEF_MES_SUGERENCIA"));
        result.setCefDiaSugerencia((BigDecimal) objectData.getData("CEF_DIA_SUGERENCIA"));
        result.setCefNumCorte((BigDecimal) objectData.getData("CEF_NUM_CORTE"));
        result.setCefNumContrato((BigDecimal) objectData.getData("CEF_NUM_CONTRATO"));
        result.setCefSubContrato((BigDecimal) objectData.getData("CEF_SUB_CONTRATO"));
        result.setCefHrRegIncrem((String) objectData.getData("CEF_HR_REG_INCREM"));
        result.setCefImpIncremento((BigDecimal) objectData.getData("CEF_IMP_INCREMENTO"));
        result.setCefImpAsignado((BigDecimal) objectData.getData("CEF_IMP_ASIGNADO"));
        result.setCefImpDisponible((BigDecimal) objectData.getData("CEF_IMP_DISPONIBLE"));
        result.setCefNumFolOpera((BigDecimal) objectData.getData("CEF_NUM_FOL_OPERA"));
        result.setCefNumOperacion((BigDecimal) objectData.getData("CEF_NUM_OPERACION"));
        result.setCefCveStConefec((String) objectData.getData("CEF_CVE_ST_CONEFEC"));

        return result;

    }

}
