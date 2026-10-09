package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ACUERDOS_PK", columns = { "ACU_NUM_CONTRATO", "ACU_NUM_SUBCOMITE", "ACU_NUM_REUNION", "ACU_NUM_ACUERDO" }, sequences = { "MANUAL" })
public class Acuerdos extends DomainObject {

    BigDecimal acuNumContrato = null;
    BigDecimal acuNumSubcomite = null;
    String acuNumReunion = null;
    String acuNumAcuerdo = null;
    String acuArea = null;
    String acuResponsable = null;
    Long acuDescAcuerdo = null;
    BigDecimal acuAnoCumplir = null;
    BigDecimal acuMesCumplir = null;
    BigDecimal acuDiaCumplir = null;
    BigDecimal acuAnoCumplido = null;
    BigDecimal acuMesCumplido = null;
    BigDecimal acuDiaCumplido = null;
    BigDecimal acuAnoAltaReg = null;
    BigDecimal acuMesAltaReg = null;
    BigDecimal acuDiaAltaReg = null;
    BigDecimal acuAnoUltMod = null;
    BigDecimal acuMesUltMod = null;
    BigDecimal acuDiaUltMod = null;
    String acuCveStAcuerdo = null;

    public Acuerdos() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcuNumContrato(BigDecimal acuNumContrato) {
        this.acuNumContrato = acuNumContrato;
    }

    public BigDecimal getAcuNumContrato() {
        return this.acuNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcuNumSubcomite(BigDecimal acuNumSubcomite) {
        this.acuNumSubcomite = acuNumSubcomite;
    }

    public BigDecimal getAcuNumSubcomite() {
        return this.acuNumSubcomite;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuNumReunion(String acuNumReunion) {
        this.acuNumReunion = acuNumReunion;
    }

    public String getAcuNumReunion() {
        return this.acuNumReunion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuNumAcuerdo(String acuNumAcuerdo) {
        this.acuNumAcuerdo = acuNumAcuerdo;
    }

    public String getAcuNumAcuerdo() {
        return this.acuNumAcuerdo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuArea(String acuArea) {
        this.acuArea = acuArea;
    }

    public String getAcuArea() {
        return this.acuArea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuResponsable(String acuResponsable) {
        this.acuResponsable = acuResponsable;
    }

    public String getAcuResponsable() {
        return this.acuResponsable;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setAcuDescAcuerdo(Long acuDescAcuerdo) {
        this.acuDescAcuerdo = acuDescAcuerdo;
    }

    public Long getAcuDescAcuerdo() {
        return this.acuDescAcuerdo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAcuAnoCumplir(BigDecimal acuAnoCumplir) {
        this.acuAnoCumplir = acuAnoCumplir;
    }

    public BigDecimal getAcuAnoCumplir() {
        return this.acuAnoCumplir;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuMesCumplir(BigDecimal acuMesCumplir) {
        this.acuMesCumplir = acuMesCumplir;
    }

    public BigDecimal getAcuMesCumplir() {
        return this.acuMesCumplir;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuDiaCumplir(BigDecimal acuDiaCumplir) {
        this.acuDiaCumplir = acuDiaCumplir;
    }

    public BigDecimal getAcuDiaCumplir() {
        return this.acuDiaCumplir;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAcuAnoCumplido(BigDecimal acuAnoCumplido) {
        this.acuAnoCumplido = acuAnoCumplido;
    }

    public BigDecimal getAcuAnoCumplido() {
        return this.acuAnoCumplido;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuMesCumplido(BigDecimal acuMesCumplido) {
        this.acuMesCumplido = acuMesCumplido;
    }

    public BigDecimal getAcuMesCumplido() {
        return this.acuMesCumplido;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuDiaCumplido(BigDecimal acuDiaCumplido) {
        this.acuDiaCumplido = acuDiaCumplido;
    }

    public BigDecimal getAcuDiaCumplido() {
        return this.acuDiaCumplido;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAcuAnoAltaReg(BigDecimal acuAnoAltaReg) {
        this.acuAnoAltaReg = acuAnoAltaReg;
    }

    public BigDecimal getAcuAnoAltaReg() {
        return this.acuAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuMesAltaReg(BigDecimal acuMesAltaReg) {
        this.acuMesAltaReg = acuMesAltaReg;
    }

    public BigDecimal getAcuMesAltaReg() {
        return this.acuMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuDiaAltaReg(BigDecimal acuDiaAltaReg) {
        this.acuDiaAltaReg = acuDiaAltaReg;
    }

    public BigDecimal getAcuDiaAltaReg() {
        return this.acuDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAcuAnoUltMod(BigDecimal acuAnoUltMod) {
        this.acuAnoUltMod = acuAnoUltMod;
    }

    public BigDecimal getAcuAnoUltMod() {
        return this.acuAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuMesUltMod(BigDecimal acuMesUltMod) {
        this.acuMesUltMod = acuMesUltMod;
    }

    public BigDecimal getAcuMesUltMod() {
        return this.acuMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuDiaUltMod(BigDecimal acuDiaUltMod) {
        this.acuDiaUltMod = acuDiaUltMod;
    }

    public BigDecimal getAcuDiaUltMod() {
        return this.acuDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuCveStAcuerdo(String acuCveStAcuerdo) {
        this.acuCveStAcuerdo = acuCveStAcuerdo;
    }

    public String getAcuCveStAcuerdo() {
        return this.acuCveStAcuerdo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ACUERDOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAcuNumContrato() != null && this.getAcuNumContrato().longValue() == -999) {
            conditions += " AND ACU_NUM_CONTRATO IS NULL";
        } else if (this.getAcuNumContrato() != null) {
            conditions += " AND ACU_NUM_CONTRATO = ?";
            values.add(this.getAcuNumContrato());
        }

        if (this.getAcuNumSubcomite() != null && this.getAcuNumSubcomite().longValue() == -999) {
            conditions += " AND ACU_NUM_SUBCOMITE IS NULL";
        } else if (this.getAcuNumSubcomite() != null) {
            conditions += " AND ACU_NUM_SUBCOMITE = ?";
            values.add(this.getAcuNumSubcomite());
        }

        if (this.getAcuNumReunion() != null && "null".equals(this.getAcuNumReunion())) {
            conditions += " AND ACU_NUM_REUNION IS NULL";
        } else if (this.getAcuNumReunion() != null) {
            conditions += " AND ACU_NUM_REUNION = ?";
            values.add(this.getAcuNumReunion());
        }

        if (this.getAcuNumAcuerdo() != null && "null".equals(this.getAcuNumAcuerdo())) {
            conditions += " AND ACU_NUM_ACUERDO IS NULL";
        } else if (this.getAcuNumAcuerdo() != null) {
            conditions += " AND ACU_NUM_ACUERDO = ?";
            values.add(this.getAcuNumAcuerdo());
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
        String sql = "SELECT * FROM ACUERDOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAcuNumContrato() != null && this.getAcuNumContrato().longValue() == -999) {
            conditions += " AND ACU_NUM_CONTRATO IS NULL";
        } else if (this.getAcuNumContrato() != null) {
            conditions += " AND ACU_NUM_CONTRATO = ?";
            values.add(this.getAcuNumContrato());
        }

        if (this.getAcuNumSubcomite() != null && this.getAcuNumSubcomite().longValue() == -999) {
            conditions += " AND ACU_NUM_SUBCOMITE IS NULL";
        } else if (this.getAcuNumSubcomite() != null) {
            conditions += " AND ACU_NUM_SUBCOMITE = ?";
            values.add(this.getAcuNumSubcomite());
        }

        if (this.getAcuNumReunion() != null && "null".equals(this.getAcuNumReunion())) {
            conditions += " AND ACU_NUM_REUNION IS NULL";
        } else if (this.getAcuNumReunion() != null) {
            conditions += " AND ACU_NUM_REUNION = ?";
            values.add(this.getAcuNumReunion());
        }

        if (this.getAcuNumAcuerdo() != null && "null".equals(this.getAcuNumAcuerdo())) {
            conditions += " AND ACU_NUM_ACUERDO IS NULL";
        } else if (this.getAcuNumAcuerdo() != null) {
            conditions += " AND ACU_NUM_ACUERDO = ?";
            values.add(this.getAcuNumAcuerdo());
        }

        if (this.getAcuArea() != null && "null".equals(this.getAcuArea())) {
            conditions += " AND ACU_AREA IS NULL";
        } else if (this.getAcuArea() != null) {
            conditions += " AND ACU_AREA = ?";
            values.add(this.getAcuArea());
        }

        if (this.getAcuResponsable() != null && "null".equals(this.getAcuResponsable())) {
            conditions += " AND ACU_RESPONSABLE IS NULL";
        } else if (this.getAcuResponsable() != null) {
            conditions += " AND ACU_RESPONSABLE = ?";
            values.add(this.getAcuResponsable());
        }

        if (this.getAcuDescAcuerdo() != null && this.getAcuDescAcuerdo() == -999) {
            conditions += " AND ACU_DESC_ACUERDO IS NULL";
        } else if (this.getAcuDescAcuerdo() != null) {
            conditions += " AND ACU_DESC_ACUERDO = ?";
            values.add(this.getAcuDescAcuerdo());
        }

        if (this.getAcuAnoCumplir() != null && this.getAcuAnoCumplir().longValue() == -999) {
            conditions += " AND ACU_ANO_CUMPLIR IS NULL";
        } else if (this.getAcuAnoCumplir() != null) {
            conditions += " AND ACU_ANO_CUMPLIR = ?";
            values.add(this.getAcuAnoCumplir());
        }

        if (this.getAcuMesCumplir() != null && this.getAcuMesCumplir().longValue() == -999) {
            conditions += " AND ACU_MES_CUMPLIR IS NULL";
        } else if (this.getAcuMesCumplir() != null) {
            conditions += " AND ACU_MES_CUMPLIR = ?";
            values.add(this.getAcuMesCumplir());
        }

        if (this.getAcuDiaCumplir() != null && this.getAcuDiaCumplir().longValue() == -999) {
            conditions += " AND ACU_DIA_CUMPLIR IS NULL";
        } else if (this.getAcuDiaCumplir() != null) {
            conditions += " AND ACU_DIA_CUMPLIR = ?";
            values.add(this.getAcuDiaCumplir());
        }

        if (this.getAcuAnoCumplido() != null && this.getAcuAnoCumplido().longValue() == -999) {
            conditions += " AND ACU_ANO_CUMPLIDO IS NULL";
        } else if (this.getAcuAnoCumplido() != null) {
            conditions += " AND ACU_ANO_CUMPLIDO = ?";
            values.add(this.getAcuAnoCumplido());
        }

        if (this.getAcuMesCumplido() != null && this.getAcuMesCumplido().longValue() == -999) {
            conditions += " AND ACU_MES_CUMPLIDO IS NULL";
        } else if (this.getAcuMesCumplido() != null) {
            conditions += " AND ACU_MES_CUMPLIDO = ?";
            values.add(this.getAcuMesCumplido());
        }

        if (this.getAcuDiaCumplido() != null && this.getAcuDiaCumplido().longValue() == -999) {
            conditions += " AND ACU_DIA_CUMPLIDO IS NULL";
        } else if (this.getAcuDiaCumplido() != null) {
            conditions += " AND ACU_DIA_CUMPLIDO = ?";
            values.add(this.getAcuDiaCumplido());
        }

        if (this.getAcuAnoAltaReg() != null && this.getAcuAnoAltaReg().longValue() == -999) {
            conditions += " AND ACU_ANO_ALTA_REG IS NULL";
        } else if (this.getAcuAnoAltaReg() != null) {
            conditions += " AND ACU_ANO_ALTA_REG = ?";
            values.add(this.getAcuAnoAltaReg());
        }

        if (this.getAcuMesAltaReg() != null && this.getAcuMesAltaReg().longValue() == -999) {
            conditions += " AND ACU_MES_ALTA_REG IS NULL";
        } else if (this.getAcuMesAltaReg() != null) {
            conditions += " AND ACU_MES_ALTA_REG = ?";
            values.add(this.getAcuMesAltaReg());
        }

        if (this.getAcuDiaAltaReg() != null && this.getAcuDiaAltaReg().longValue() == -999) {
            conditions += " AND ACU_DIA_ALTA_REG IS NULL";
        } else if (this.getAcuDiaAltaReg() != null) {
            conditions += " AND ACU_DIA_ALTA_REG = ?";
            values.add(this.getAcuDiaAltaReg());
        }

        if (this.getAcuAnoUltMod() != null && this.getAcuAnoUltMod().longValue() == -999) {
            conditions += " AND ACU_ANO_ULT_MOD IS NULL";
        } else if (this.getAcuAnoUltMod() != null) {
            conditions += " AND ACU_ANO_ULT_MOD = ?";
            values.add(this.getAcuAnoUltMod());
        }

        if (this.getAcuMesUltMod() != null && this.getAcuMesUltMod().longValue() == -999) {
            conditions += " AND ACU_MES_ULT_MOD IS NULL";
        } else if (this.getAcuMesUltMod() != null) {
            conditions += " AND ACU_MES_ULT_MOD = ?";
            values.add(this.getAcuMesUltMod());
        }

        if (this.getAcuDiaUltMod() != null && this.getAcuDiaUltMod().longValue() == -999) {
            conditions += " AND ACU_DIA_ULT_MOD IS NULL";
        } else if (this.getAcuDiaUltMod() != null) {
            conditions += " AND ACU_DIA_ULT_MOD = ?";
            values.add(this.getAcuDiaUltMod());
        }

        if (this.getAcuCveStAcuerdo() != null && "null".equals(this.getAcuCveStAcuerdo())) {
            conditions += " AND ACU_CVE_ST_ACUERDO IS NULL";
        } else if (this.getAcuCveStAcuerdo() != null) {
            conditions += " AND ACU_CVE_ST_ACUERDO = ?";
            values.add(this.getAcuCveStAcuerdo());
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
        String sql = "UPDATE ACUERDOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ACU_NUM_CONTRATO = ?";
        pkValues.add(this.getAcuNumContrato());
        conditions += " AND ACU_NUM_SUBCOMITE = ?";
        pkValues.add(this.getAcuNumSubcomite());
        conditions += " AND ACU_NUM_REUNION = ?";
        pkValues.add(this.getAcuNumReunion());
        conditions += " AND ACU_NUM_ACUERDO = ?";
        pkValues.add(this.getAcuNumAcuerdo());
        fields += " ACU_AREA = ?, ";
        values.add(this.getAcuArea());
        fields += " ACU_RESPONSABLE = ?, ";
        values.add(this.getAcuResponsable());
        fields += " ACU_DESC_ACUERDO = ?, ";
        values.add(this.getAcuDescAcuerdo());
        fields += " ACU_ANO_CUMPLIR = ?, ";
        values.add(this.getAcuAnoCumplir());
        fields += " ACU_MES_CUMPLIR = ?, ";
        values.add(this.getAcuMesCumplir());
        fields += " ACU_DIA_CUMPLIR = ?, ";
        values.add(this.getAcuDiaCumplir());
        fields += " ACU_ANO_CUMPLIDO = ?, ";
        values.add(this.getAcuAnoCumplido());
        fields += " ACU_MES_CUMPLIDO = ?, ";
        values.add(this.getAcuMesCumplido());
        fields += " ACU_DIA_CUMPLIDO = ?, ";
        values.add(this.getAcuDiaCumplido());
        fields += " ACU_ANO_ALTA_REG = ?, ";
        values.add(this.getAcuAnoAltaReg());
        fields += " ACU_MES_ALTA_REG = ?, ";
        values.add(this.getAcuMesAltaReg());
        fields += " ACU_DIA_ALTA_REG = ?, ";
        values.add(this.getAcuDiaAltaReg());
        fields += " ACU_ANO_ULT_MOD = ?, ";
        values.add(this.getAcuAnoUltMod());
        fields += " ACU_MES_ULT_MOD = ?, ";
        values.add(this.getAcuMesUltMod());
        fields += " ACU_DIA_ULT_MOD = ?, ";
        values.add(this.getAcuDiaUltMod());
        fields += " ACU_CVE_ST_ACUERDO = ?, ";
        values.add(this.getAcuCveStAcuerdo());
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
        String sql = "INSERT INTO ACUERDOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ACU_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAcuNumContrato());

        fields += ", ACU_NUM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getAcuNumSubcomite());

        fields += ", ACU_NUM_REUNION";
        fieldValues += ", ?";
        values.add(this.getAcuNumReunion());

        fields += ", ACU_NUM_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getAcuNumAcuerdo());

        fields += ", ACU_AREA";
        fieldValues += ", ?";
        values.add(this.getAcuArea());

        fields += ", ACU_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getAcuResponsable());

        fields += ", ACU_DESC_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getAcuDescAcuerdo());

        fields += ", ACU_ANO_CUMPLIR";
        fieldValues += ", ?";
        values.add(this.getAcuAnoCumplir());

        fields += ", ACU_MES_CUMPLIR";
        fieldValues += ", ?";
        values.add(this.getAcuMesCumplir());

        fields += ", ACU_DIA_CUMPLIR";
        fieldValues += ", ?";
        values.add(this.getAcuDiaCumplir());

        fields += ", ACU_ANO_CUMPLIDO";
        fieldValues += ", ?";
        values.add(this.getAcuAnoCumplido());

        fields += ", ACU_MES_CUMPLIDO";
        fieldValues += ", ?";
        values.add(this.getAcuMesCumplido());

        fields += ", ACU_DIA_CUMPLIDO";
        fieldValues += ", ?";
        values.add(this.getAcuDiaCumplido());

        fields += ", ACU_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAcuAnoAltaReg());

        fields += ", ACU_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAcuMesAltaReg());

        fields += ", ACU_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAcuDiaAltaReg());

        fields += ", ACU_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAcuAnoUltMod());

        fields += ", ACU_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAcuMesUltMod());

        fields += ", ACU_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAcuDiaUltMod());

        fields += ", ACU_CVE_ST_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getAcuCveStAcuerdo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ACUERDOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ACU_NUM_CONTRATO = ?";
        values.add(this.getAcuNumContrato());
        conditions += " AND ACU_NUM_SUBCOMITE = ?";
        values.add(this.getAcuNumSubcomite());
        conditions += " AND ACU_NUM_REUNION = ?";
        values.add(this.getAcuNumReunion());
        conditions += " AND ACU_NUM_ACUERDO = ?";
        values.add(this.getAcuNumAcuerdo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Acuerdos instance = (Acuerdos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAcuNumContrato().equals(instance.getAcuNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAcuNumSubcomite().equals(instance.getAcuNumSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getAcuNumReunion().equals(instance.getAcuNumReunion()))
            equalObjects = false;
        if (equalObjects && !this.getAcuNumAcuerdo().equals(instance.getAcuNumAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getAcuArea().equals(instance.getAcuArea()))
            equalObjects = false;
        if (equalObjects && !this.getAcuResponsable().equals(instance.getAcuResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDescAcuerdo().equals(instance.getAcuDescAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getAcuAnoCumplir().equals(instance.getAcuAnoCumplir()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMesCumplir().equals(instance.getAcuMesCumplir()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDiaCumplir().equals(instance.getAcuDiaCumplir()))
            equalObjects = false;
        if (equalObjects && !this.getAcuAnoCumplido().equals(instance.getAcuAnoCumplido()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMesCumplido().equals(instance.getAcuMesCumplido()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDiaCumplido().equals(instance.getAcuDiaCumplido()))
            equalObjects = false;
        if (equalObjects && !this.getAcuAnoAltaReg().equals(instance.getAcuAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMesAltaReg().equals(instance.getAcuMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDiaAltaReg().equals(instance.getAcuDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAcuAnoUltMod().equals(instance.getAcuAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMesUltMod().equals(instance.getAcuMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDiaUltMod().equals(instance.getAcuDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAcuCveStAcuerdo().equals(instance.getAcuCveStAcuerdo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Acuerdos result = new Acuerdos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAcuNumContrato((BigDecimal) objectData.getData("ACU_NUM_CONTRATO"));
        result.setAcuNumSubcomite((BigDecimal) objectData.getData("ACU_NUM_SUBCOMITE"));
        result.setAcuNumReunion((String) objectData.getData("ACU_NUM_REUNION"));
        result.setAcuNumAcuerdo((String) objectData.getData("ACU_NUM_ACUERDO"));
        result.setAcuArea((String) objectData.getData("ACU_AREA"));
        result.setAcuResponsable((String) objectData.getData("ACU_RESPONSABLE"));
        result.setAcuDescAcuerdo((Long) objectData.getData("ACU_DESC_ACUERDO"));
        result.setAcuAnoCumplir((BigDecimal) objectData.getData("ACU_ANO_CUMPLIR"));
        result.setAcuMesCumplir((BigDecimal) objectData.getData("ACU_MES_CUMPLIR"));
        result.setAcuDiaCumplir((BigDecimal) objectData.getData("ACU_DIA_CUMPLIR"));
        result.setAcuAnoCumplido((BigDecimal) objectData.getData("ACU_ANO_CUMPLIDO"));
        result.setAcuMesCumplido((BigDecimal) objectData.getData("ACU_MES_CUMPLIDO"));
        result.setAcuDiaCumplido((BigDecimal) objectData.getData("ACU_DIA_CUMPLIDO"));
        result.setAcuAnoAltaReg((BigDecimal) objectData.getData("ACU_ANO_ALTA_REG"));
        result.setAcuMesAltaReg((BigDecimal) objectData.getData("ACU_MES_ALTA_REG"));
        result.setAcuDiaAltaReg((BigDecimal) objectData.getData("ACU_DIA_ALTA_REG"));
        result.setAcuAnoUltMod((BigDecimal) objectData.getData("ACU_ANO_ULT_MOD"));
        result.setAcuMesUltMod((BigDecimal) objectData.getData("ACU_MES_ULT_MOD"));
        result.setAcuDiaUltMod((BigDecimal) objectData.getData("ACU_DIA_ULT_MOD"));
        result.setAcuCveStAcuerdo((String) objectData.getData("ACU_CVE_ST_ACUERDO"));

        return result;

    }

}
