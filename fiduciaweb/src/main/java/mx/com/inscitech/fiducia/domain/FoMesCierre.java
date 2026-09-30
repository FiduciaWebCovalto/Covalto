package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FO_MES_CIERRE_PK", columns = { "FMC_NUM_CONTRATO", "FMC_MES", "FMC_ANO" }, sequences = { "MANUAL" })
public class FoMesCierre extends DomainObject {

    BigDecimal fmcNumContrato = null;
    BigDecimal fmcMes = null;
    BigDecimal fmcAno = null;
    BigDecimal fmcCerrado = null;
    String fmcFechaAlta = null;
    String fmcFechaUltMod = null;

    public FoMesCierre() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmcNumContrato(BigDecimal fmcNumContrato) {
        this.fmcNumContrato = fmcNumContrato;
    }

    public BigDecimal getFmcNumContrato() {
        return this.fmcNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFmcMes(BigDecimal fmcMes) {
        this.fmcMes = fmcMes;
    }

    public BigDecimal getFmcMes() {
        return this.fmcMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFmcAno(BigDecimal fmcAno) {
        this.fmcAno = fmcAno;
    }

    public BigDecimal getFmcAno() {
        return this.fmcAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFmcCerrado(BigDecimal fmcCerrado) {
        this.fmcCerrado = fmcCerrado;
    }

    public BigDecimal getFmcCerrado() {
        return this.fmcCerrado;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFmcFechaAlta(String fmcFechaAlta) {
        this.fmcFechaAlta = fmcFechaAlta;
    }

    public String getFmcFechaAlta() {
        return this.fmcFechaAlta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFmcFechaUltMod(String fmcFechaUltMod) {
        this.fmcFechaUltMod = fmcFechaUltMod;
    }

    public String getFmcFechaUltMod() {
        return this.fmcFechaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FO_MES_CIERRE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFmcNumContrato() != null && this.getFmcNumContrato().longValue() == -999) {
            conditions += " AND FMC_NUM_CONTRATO IS NULL";
        } else if (this.getFmcNumContrato() != null) {
            conditions += " AND FMC_NUM_CONTRATO = ?";
            values.add(this.getFmcNumContrato());
        }

        if (this.getFmcMes() != null && this.getFmcMes().longValue() == -999) {
            conditions += " AND FMC_MES IS NULL";
        } else if (this.getFmcMes() != null) {
            conditions += " AND FMC_MES = ?";
            values.add(this.getFmcMes());
        }

        if (this.getFmcAno() != null && this.getFmcAno().longValue() == -999) {
            conditions += " AND FMC_ANO IS NULL";
        } else if (this.getFmcAno() != null) {
            conditions += " AND FMC_ANO = ?";
            values.add(this.getFmcAno());
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
        String sql = "SELECT * FROM FO_MES_CIERRE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFmcNumContrato() != null && this.getFmcNumContrato().longValue() == -999) {
            conditions += " AND FMC_NUM_CONTRATO IS NULL";
        } else if (this.getFmcNumContrato() != null) {
            conditions += " AND FMC_NUM_CONTRATO = ?";
            values.add(this.getFmcNumContrato());
        }

        if (this.getFmcMes() != null && this.getFmcMes().longValue() == -999) {
            conditions += " AND FMC_MES IS NULL";
        } else if (this.getFmcMes() != null) {
            conditions += " AND FMC_MES = ?";
            values.add(this.getFmcMes());
        }

        if (this.getFmcAno() != null && this.getFmcAno().longValue() == -999) {
            conditions += " AND FMC_ANO IS NULL";
        } else if (this.getFmcAno() != null) {
            conditions += " AND FMC_ANO = ?";
            values.add(this.getFmcAno());
        }

        if (this.getFmcCerrado() != null && this.getFmcCerrado().longValue() == -999) {
            conditions += " AND FMC_CERRADO IS NULL";
        } else if (this.getFmcCerrado() != null) {
            conditions += " AND FMC_CERRADO = ?";
            values.add(this.getFmcCerrado());
        }

        if (this.getFmcFechaAlta() != null && "null".equals(this.getFmcFechaAlta())) {
            conditions += " AND FMC_FECHA_ALTA IS NULL";
        } else if (this.getFmcFechaAlta() != null) {
            conditions += " AND FMC_FECHA_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFmcFechaAlta());
        }

        if (this.getFmcFechaUltMod() != null && "null".equals(this.getFmcFechaUltMod())) {
            conditions += " AND FMC_FECHA_ULT_MOD IS NULL";
        } else if (this.getFmcFechaUltMod() != null) {
            conditions += " AND FMC_FECHA_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFmcFechaUltMod());
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
        String sql = "UPDATE FO_MES_CIERRE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FMC_NUM_CONTRATO = ?";
        pkValues.add(this.getFmcNumContrato());
        conditions += " AND FMC_MES = ?";
        pkValues.add(this.getFmcMes());
        conditions += " AND FMC_ANO = ?";
        pkValues.add(this.getFmcAno());
        fields += " FMC_CERRADO = ?, ";
        values.add(this.getFmcCerrado());
        fields += " FMC_FECHA_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFmcFechaAlta());
        fields += " FMC_FECHA_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFmcFechaUltMod());
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
        String sql = "INSERT INTO FO_MES_CIERRE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FMC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFmcNumContrato());

        fields += ", FMC_MES";
        fieldValues += ", ?";
        values.add(this.getFmcMes());

        fields += ", FMC_ANO";
        fieldValues += ", ?";
        values.add(this.getFmcAno());

        fields += ", FMC_CERRADO";
        fieldValues += ", ?";
        values.add(this.getFmcCerrado());

        fields += ", FMC_FECHA_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFmcFechaAlta());

        fields += ", FMC_FECHA_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFmcFechaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FO_MES_CIERRE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FMC_NUM_CONTRATO = ?";
        values.add(this.getFmcNumContrato());
        conditions += " AND FMC_MES = ?";
        values.add(this.getFmcMes());
        conditions += " AND FMC_ANO = ?";
        values.add(this.getFmcAno());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FoMesCierre instance = (FoMesCierre) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFmcNumContrato().equals(instance.getFmcNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFmcMes().equals(instance.getFmcMes()))
            equalObjects = false;
        if (equalObjects && !this.getFmcAno().equals(instance.getFmcAno()))
            equalObjects = false;
        if (equalObjects && !this.getFmcCerrado().equals(instance.getFmcCerrado()))
            equalObjects = false;
        if (equalObjects && !this.getFmcFechaAlta().equals(instance.getFmcFechaAlta()))
            equalObjects = false;
        if (equalObjects && !this.getFmcFechaUltMod().equals(instance.getFmcFechaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FoMesCierre result = new FoMesCierre();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFmcNumContrato((BigDecimal) objectData.getData("FMC_NUM_CONTRATO"));
        result.setFmcMes((BigDecimal) objectData.getData("FMC_MES"));
        result.setFmcAno((BigDecimal) objectData.getData("FMC_ANO"));
        result.setFmcCerrado((BigDecimal) objectData.getData("FMC_CERRADO"));
        result.setFmcFechaAlta((String) objectData.getData("FMC_FECHA_ALTA"));
        result.setFmcFechaUltMod((String) objectData.getData("FMC_FECHA_ULT_MOD"));

        return result;

    }

}
