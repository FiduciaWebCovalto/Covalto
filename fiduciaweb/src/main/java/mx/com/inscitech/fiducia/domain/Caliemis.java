package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CALIEMIS_PK", columns = { "CAE_NUM_PROGRAMA", "CAE_NUM_EMISION", "CAE_NUM_CALIFICACION" }, sequences = { "MANUAL" })
public class Caliemis extends DomainObject {

    BigDecimal caeNumPrograma = null;
    BigDecimal caeNumEmision = null;
    BigDecimal caeNumCalificacion = null;
    BigDecimal caeNumContrato = null;
    String caeCalificadora = null;
    String caeCalificacion = null;
    BigDecimal caeAnoAltaReg = null;
    BigDecimal caeMesAltaReg = null;
    BigDecimal caeDiaAltaReg = null;
    BigDecimal caeAnoUltMod = null;
    BigDecimal caeMesUltMod = null;
    BigDecimal caeDiaUltMod = null;
    String caeCveStCaliemis = null;
    String cafCalificacionMin = null;

    public Caliemis() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCaeNumPrograma(BigDecimal caeNumPrograma) {
        this.caeNumPrograma = caeNumPrograma;
    }

    public BigDecimal getCaeNumPrograma() {
        return this.caeNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCaeNumEmision(BigDecimal caeNumEmision) {
        this.caeNumEmision = caeNumEmision;
    }

    public BigDecimal getCaeNumEmision() {
        return this.caeNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCaeNumCalificacion(BigDecimal caeNumCalificacion) {
        this.caeNumCalificacion = caeNumCalificacion;
    }

    public BigDecimal getCaeNumCalificacion() {
        return this.caeNumCalificacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCaeNumContrato(BigDecimal caeNumContrato) {
        this.caeNumContrato = caeNumContrato;
    }

    public BigDecimal getCaeNumContrato() {
        return this.caeNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCaeCalificadora(String caeCalificadora) {
        this.caeCalificadora = caeCalificadora;
    }

    public String getCaeCalificadora() {
        return this.caeCalificadora;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCaeCalificacion(String caeCalificacion) {
        this.caeCalificacion = caeCalificacion;
    }

    public String getCaeCalificacion() {
        return this.caeCalificacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCaeAnoAltaReg(BigDecimal caeAnoAltaReg) {
        this.caeAnoAltaReg = caeAnoAltaReg;
    }

    public BigDecimal getCaeAnoAltaReg() {
        return this.caeAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCaeMesAltaReg(BigDecimal caeMesAltaReg) {
        this.caeMesAltaReg = caeMesAltaReg;
    }

    public BigDecimal getCaeMesAltaReg() {
        return this.caeMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCaeDiaAltaReg(BigDecimal caeDiaAltaReg) {
        this.caeDiaAltaReg = caeDiaAltaReg;
    }

    public BigDecimal getCaeDiaAltaReg() {
        return this.caeDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCaeAnoUltMod(BigDecimal caeAnoUltMod) {
        this.caeAnoUltMod = caeAnoUltMod;
    }

    public BigDecimal getCaeAnoUltMod() {
        return this.caeAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCaeMesUltMod(BigDecimal caeMesUltMod) {
        this.caeMesUltMod = caeMesUltMod;
    }

    public BigDecimal getCaeMesUltMod() {
        return this.caeMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCaeDiaUltMod(BigDecimal caeDiaUltMod) {
        this.caeDiaUltMod = caeDiaUltMod;
    }

    public BigDecimal getCaeDiaUltMod() {
        return this.caeDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCaeCveStCaliemis(String caeCveStCaliemis) {
        this.caeCveStCaliemis = caeCveStCaliemis;
    }

    public String getCaeCveStCaliemis() {
        return this.caeCveStCaliemis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCafCalificacionMin(String cafCalificacionMin) {
        this.cafCalificacionMin = cafCalificacionMin;
    }

    public String getCafCalificacionMin() {
        return this.cafCalificacionMin;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CALIEMIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCaeNumPrograma() != null && this.getCaeNumPrograma().longValue() == -999) {
            conditions += " AND CAE_NUM_PROGRAMA IS NULL";
        } else if (this.getCaeNumPrograma() != null) {
            conditions += " AND CAE_NUM_PROGRAMA = ?";
            values.add(this.getCaeNumPrograma());
        }

        if (this.getCaeNumEmision() != null && this.getCaeNumEmision().longValue() == -999) {
            conditions += " AND CAE_NUM_EMISION IS NULL";
        } else if (this.getCaeNumEmision() != null) {
            conditions += " AND CAE_NUM_EMISION = ?";
            values.add(this.getCaeNumEmision());
        }

        if (this.getCaeNumCalificacion() != null && this.getCaeNumCalificacion().longValue() == -999) {
            conditions += " AND CAE_NUM_CALIFICACION IS NULL";
        } else if (this.getCaeNumCalificacion() != null) {
            conditions += " AND CAE_NUM_CALIFICACION = ?";
            values.add(this.getCaeNumCalificacion());
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
        String sql = "SELECT * FROM CALIEMIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCaeNumPrograma() != null && this.getCaeNumPrograma().longValue() == -999) {
            conditions += " AND CAE_NUM_PROGRAMA IS NULL";
        } else if (this.getCaeNumPrograma() != null) {
            conditions += " AND CAE_NUM_PROGRAMA = ?";
            values.add(this.getCaeNumPrograma());
        }

        if (this.getCaeNumEmision() != null && this.getCaeNumEmision().longValue() == -999) {
            conditions += " AND CAE_NUM_EMISION IS NULL";
        } else if (this.getCaeNumEmision() != null) {
            conditions += " AND CAE_NUM_EMISION = ?";
            values.add(this.getCaeNumEmision());
        }

        if (this.getCaeNumCalificacion() != null && this.getCaeNumCalificacion().longValue() == -999) {
            conditions += " AND CAE_NUM_CALIFICACION IS NULL";
        } else if (this.getCaeNumCalificacion() != null) {
            conditions += " AND CAE_NUM_CALIFICACION = ?";
            values.add(this.getCaeNumCalificacion());
        }

        if (this.getCaeNumContrato() != null && this.getCaeNumContrato().longValue() == -999) {
            conditions += " AND CAE_NUM_CONTRATO IS NULL";
        } else if (this.getCaeNumContrato() != null) {
            conditions += " AND CAE_NUM_CONTRATO = ?";
            values.add(this.getCaeNumContrato());
        }

        if (this.getCaeCalificadora() != null && "null".equals(this.getCaeCalificadora())) {
            conditions += " AND CAE_CALIFICADORA IS NULL";
        } else if (this.getCaeCalificadora() != null) {
            conditions += " AND CAE_CALIFICADORA = ?";
            values.add(this.getCaeCalificadora());
        }

        if (this.getCaeCalificacion() != null && "null".equals(this.getCaeCalificacion())) {
            conditions += " AND CAE_CALIFICACION IS NULL";
        } else if (this.getCaeCalificacion() != null) {
            conditions += " AND CAE_CALIFICACION = ?";
            values.add(this.getCaeCalificacion());
        }

        if (this.getCaeAnoAltaReg() != null && this.getCaeAnoAltaReg().longValue() == -999) {
            conditions += " AND CAE_ANO_ALTA_REG IS NULL";
        } else if (this.getCaeAnoAltaReg() != null) {
            conditions += " AND CAE_ANO_ALTA_REG = ?";
            values.add(this.getCaeAnoAltaReg());
        }

        if (this.getCaeMesAltaReg() != null && this.getCaeMesAltaReg().longValue() == -999) {
            conditions += " AND CAE_MES_ALTA_REG IS NULL";
        } else if (this.getCaeMesAltaReg() != null) {
            conditions += " AND CAE_MES_ALTA_REG = ?";
            values.add(this.getCaeMesAltaReg());
        }

        if (this.getCaeDiaAltaReg() != null && this.getCaeDiaAltaReg().longValue() == -999) {
            conditions += " AND CAE_DIA_ALTA_REG IS NULL";
        } else if (this.getCaeDiaAltaReg() != null) {
            conditions += " AND CAE_DIA_ALTA_REG = ?";
            values.add(this.getCaeDiaAltaReg());
        }

        if (this.getCaeAnoUltMod() != null && this.getCaeAnoUltMod().longValue() == -999) {
            conditions += " AND CAE_ANO_ULT_MOD IS NULL";
        } else if (this.getCaeAnoUltMod() != null) {
            conditions += " AND CAE_ANO_ULT_MOD = ?";
            values.add(this.getCaeAnoUltMod());
        }

        if (this.getCaeMesUltMod() != null && this.getCaeMesUltMod().longValue() == -999) {
            conditions += " AND CAE_MES_ULT_MOD IS NULL";
        } else if (this.getCaeMesUltMod() != null) {
            conditions += " AND CAE_MES_ULT_MOD = ?";
            values.add(this.getCaeMesUltMod());
        }

        if (this.getCaeDiaUltMod() != null && this.getCaeDiaUltMod().longValue() == -999) {
            conditions += " AND CAE_DIA_ULT_MOD IS NULL";
        } else if (this.getCaeDiaUltMod() != null) {
            conditions += " AND CAE_DIA_ULT_MOD = ?";
            values.add(this.getCaeDiaUltMod());
        }

        if (this.getCaeCveStCaliemis() != null && "null".equals(this.getCaeCveStCaliemis())) {
            conditions += " AND CAE_CVE_ST_CALIEMIS IS NULL";
        } else if (this.getCaeCveStCaliemis() != null) {
            conditions += " AND CAE_CVE_ST_CALIEMIS = ?";
            values.add(this.getCaeCveStCaliemis());
        }

        if (this.getCafCalificacionMin() != null && "null".equals(this.getCafCalificacionMin())) {
            conditions += " AND CAF_CALIFICACION_MIN IS NULL";
        } else if (this.getCafCalificacionMin() != null) {
            conditions += " AND CAF_CALIFICACION_MIN = ?";
            values.add(this.getCafCalificacionMin());
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
        String sql = "UPDATE CALIEMIS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CAE_NUM_PROGRAMA = ?";
        pkValues.add(this.getCaeNumPrograma());
        conditions += " AND CAE_NUM_EMISION = ?";
        pkValues.add(this.getCaeNumEmision());
        conditions += " AND CAE_NUM_CALIFICACION = ?";
        pkValues.add(this.getCaeNumCalificacion());
        fields += " CAE_NUM_CONTRATO = ?, ";
        values.add(this.getCaeNumContrato());
        fields += " CAE_CALIFICADORA = ?, ";
        values.add(this.getCaeCalificadora());
        fields += " CAE_CALIFICACION = ?, ";
        values.add(this.getCaeCalificacion());
        fields += " CAE_ANO_ALTA_REG = ?, ";
        values.add(this.getCaeAnoAltaReg());
        fields += " CAE_MES_ALTA_REG = ?, ";
        values.add(this.getCaeMesAltaReg());
        fields += " CAE_DIA_ALTA_REG = ?, ";
        values.add(this.getCaeDiaAltaReg());
        fields += " CAE_ANO_ULT_MOD = ?, ";
        values.add(this.getCaeAnoUltMod());
        fields += " CAE_MES_ULT_MOD = ?, ";
        values.add(this.getCaeMesUltMod());
        fields += " CAE_DIA_ULT_MOD = ?, ";
        values.add(this.getCaeDiaUltMod());
        fields += " CAE_CVE_ST_CALIEMIS = ?, ";
        values.add(this.getCaeCveStCaliemis());
        fields += " CAF_CALIFICACION_MIN = ?, ";
        values.add(this.getCafCalificacionMin());
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
        String sql = "INSERT INTO CALIEMIS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CAE_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getCaeNumPrograma());

        fields += ", CAE_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getCaeNumEmision());

        fields += ", CAE_NUM_CALIFICACION";
        fieldValues += ", ?";
        values.add(this.getCaeNumCalificacion());

        fields += ", CAE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCaeNumContrato());

        fields += ", CAE_CALIFICADORA";
        fieldValues += ", ?";
        values.add(this.getCaeCalificadora());

        fields += ", CAE_CALIFICACION";
        fieldValues += ", ?";
        values.add(this.getCaeCalificacion());

        fields += ", CAE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCaeAnoAltaReg());

        fields += ", CAE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCaeMesAltaReg());

        fields += ", CAE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCaeDiaAltaReg());

        fields += ", CAE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCaeAnoUltMod());

        fields += ", CAE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCaeMesUltMod());

        fields += ", CAE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCaeDiaUltMod());

        fields += ", CAE_CVE_ST_CALIEMIS";
        fieldValues += ", ?";
        values.add(this.getCaeCveStCaliemis());

        fields += ", CAF_CALIFICACION_MIN";
        fieldValues += ", ?";
        values.add(this.getCafCalificacionMin());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CALIEMIS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CAE_NUM_PROGRAMA = ?";
        values.add(this.getCaeNumPrograma());
        conditions += " AND CAE_NUM_EMISION = ?";
        values.add(this.getCaeNumEmision());
        conditions += " AND CAE_NUM_CALIFICACION = ?";
        values.add(this.getCaeNumCalificacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Caliemis instance = (Caliemis) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCaeNumPrograma().equals(instance.getCaeNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getCaeNumEmision().equals(instance.getCaeNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCaeNumCalificacion().equals(instance.getCaeNumCalificacion()))
            equalObjects = false;
        if (equalObjects && !this.getCaeNumContrato().equals(instance.getCaeNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCaeCalificadora().equals(instance.getCaeCalificadora()))
            equalObjects = false;
        if (equalObjects && !this.getCaeCalificacion().equals(instance.getCaeCalificacion()))
            equalObjects = false;
        if (equalObjects && !this.getCaeAnoAltaReg().equals(instance.getCaeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCaeMesAltaReg().equals(instance.getCaeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCaeDiaAltaReg().equals(instance.getCaeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCaeAnoUltMod().equals(instance.getCaeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCaeMesUltMod().equals(instance.getCaeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCaeDiaUltMod().equals(instance.getCaeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCaeCveStCaliemis().equals(instance.getCaeCveStCaliemis()))
            equalObjects = false;
        if (equalObjects && !this.getCafCalificacionMin().equals(instance.getCafCalificacionMin()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Caliemis result = new Caliemis();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCaeNumPrograma((BigDecimal) objectData.getData("CAE_NUM_PROGRAMA"));
        result.setCaeNumEmision((BigDecimal) objectData.getData("CAE_NUM_EMISION"));
        result.setCaeNumCalificacion((BigDecimal) objectData.getData("CAE_NUM_CALIFICACION"));
        result.setCaeNumContrato((BigDecimal) objectData.getData("CAE_NUM_CONTRATO"));
        result.setCaeCalificadora((String) objectData.getData("CAE_CALIFICADORA"));
        result.setCaeCalificacion((String) objectData.getData("CAE_CALIFICACION"));
        result.setCaeAnoAltaReg((BigDecimal) objectData.getData("CAE_ANO_ALTA_REG"));
        result.setCaeMesAltaReg((BigDecimal) objectData.getData("CAE_MES_ALTA_REG"));
        result.setCaeDiaAltaReg((BigDecimal) objectData.getData("CAE_DIA_ALTA_REG"));
        result.setCaeAnoUltMod((BigDecimal) objectData.getData("CAE_ANO_ULT_MOD"));
        result.setCaeMesUltMod((BigDecimal) objectData.getData("CAE_MES_ULT_MOD"));
        result.setCaeDiaUltMod((BigDecimal) objectData.getData("CAE_DIA_ULT_MOD"));
        result.setCaeCveStCaliemis((String) objectData.getData("CAE_CVE_ST_CALIEMIS"));
        result.setCafCalificacionMin((String) objectData.getData("CAF_CALIFICACION_MIN"));

        return result;

    }

}
