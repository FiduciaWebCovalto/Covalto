package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AVISOS_HIS_PK", columns = { "AHI_NUM_FOLIO", "AHI_NUM_CONTRATO", "AHI_FEC_IMPR", "AHI_TIPO_AVISO", "AHI_CVE_ST_AVISO" }, sequences = { "MANUAL" })
public class AvisosHis extends DomainObject {

    BigDecimal ahiNumFolio = null;
    BigDecimal ahiNumContrato = null;
    String ahiFecImpr = null;
    String ahiTipoAviso = null;
    String ahiCveStAviso = null;

    public AvisosHis() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAhiNumFolio(BigDecimal ahiNumFolio) {
        this.ahiNumFolio = ahiNumFolio;
    }

    public BigDecimal getAhiNumFolio() {
        return this.ahiNumFolio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAhiNumContrato(BigDecimal ahiNumContrato) {
        this.ahiNumContrato = ahiNumContrato;
    }

    public BigDecimal getAhiNumContrato() {
        return this.ahiNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setAhiFecImpr(String ahiFecImpr) {
        this.ahiFecImpr = ahiFecImpr;
    }

    public String getAhiFecImpr() {
        return this.ahiFecImpr;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhiTipoAviso(String ahiTipoAviso) {
        this.ahiTipoAviso = ahiTipoAviso;
    }

    public String getAhiTipoAviso() {
        return this.ahiTipoAviso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhiCveStAviso(String ahiCveStAviso) {
        this.ahiCveStAviso = ahiCveStAviso;
    }

    public String getAhiCveStAviso() {
        return this.ahiCveStAviso;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AVISOS_HIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAhiNumFolio() != null && this.getAhiNumFolio().longValue() == -999) {
            conditions += " AND AHI_NUM_FOLIO IS NULL";
        } else if (this.getAhiNumFolio() != null) {
            conditions += " AND AHI_NUM_FOLIO = ?";
            values.add(this.getAhiNumFolio());
        }

        if (this.getAhiNumContrato() != null && this.getAhiNumContrato().longValue() == -999) {
            conditions += " AND AHI_NUM_CONTRATO IS NULL";
        } else if (this.getAhiNumContrato() != null) {
            conditions += " AND AHI_NUM_CONTRATO = ?";
            values.add(this.getAhiNumContrato());
        }

        if (this.getAhiFecImpr() != null && "null".equals(this.getAhiFecImpr())) {
            conditions += " AND AHI_FEC_IMPR IS NULL";
        } else if (this.getAhiFecImpr() != null) {
            conditions += " AND AHI_FEC_IMPR = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getAhiFecImpr());
        }

        if (this.getAhiTipoAviso() != null && "null".equals(this.getAhiTipoAviso())) {
            conditions += " AND AHI_TIPO_AVISO IS NULL";
        } else if (this.getAhiTipoAviso() != null) {
            conditions += " AND AHI_TIPO_AVISO = ?";
            values.add(this.getAhiTipoAviso());
        }

        if (this.getAhiCveStAviso() != null && "null".equals(this.getAhiCveStAviso())) {
            conditions += " AND AHI_CVE_ST_AVISO IS NULL";
        } else if (this.getAhiCveStAviso() != null) {
            conditions += " AND AHI_CVE_ST_AVISO = ?";
            values.add(this.getAhiCveStAviso());
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
        String sql = "SELECT * FROM AVISOS_HIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAhiNumFolio() != null && this.getAhiNumFolio().longValue() == -999) {
            conditions += " AND AHI_NUM_FOLIO IS NULL";
        } else if (this.getAhiNumFolio() != null) {
            conditions += " AND AHI_NUM_FOLIO = ?";
            values.add(this.getAhiNumFolio());
        }

        if (this.getAhiNumContrato() != null && this.getAhiNumContrato().longValue() == -999) {
            conditions += " AND AHI_NUM_CONTRATO IS NULL";
        } else if (this.getAhiNumContrato() != null) {
            conditions += " AND AHI_NUM_CONTRATO = ?";
            values.add(this.getAhiNumContrato());
        }

        if (this.getAhiFecImpr() != null && "null".equals(this.getAhiFecImpr())) {
            conditions += " AND AHI_FEC_IMPR IS NULL";
        } else if (this.getAhiFecImpr() != null) {
            conditions += " AND AHI_FEC_IMPR = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getAhiFecImpr());
        }

        if (this.getAhiTipoAviso() != null && "null".equals(this.getAhiTipoAviso())) {
            conditions += " AND AHI_TIPO_AVISO IS NULL";
        } else if (this.getAhiTipoAviso() != null) {
            conditions += " AND AHI_TIPO_AVISO = ?";
            values.add(this.getAhiTipoAviso());
        }

        if (this.getAhiCveStAviso() != null && "null".equals(this.getAhiCveStAviso())) {
            conditions += " AND AHI_CVE_ST_AVISO IS NULL";
        } else if (this.getAhiCveStAviso() != null) {
            conditions += " AND AHI_CVE_ST_AVISO = ?";
            values.add(this.getAhiCveStAviso());
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
        String sql = "UPDATE AVISOS_HIS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AHI_NUM_FOLIO = ?";
        pkValues.add(this.getAhiNumFolio());
        conditions += " AND AHI_NUM_CONTRATO = ?";
        pkValues.add(this.getAhiNumContrato());
        conditions += " AND AHI_FEC_IMPR = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getAhiFecImpr());
        conditions += " AND AHI_TIPO_AVISO = ?";
        pkValues.add(this.getAhiTipoAviso());
        conditions += " AND AHI_CVE_ST_AVISO = ?";
        pkValues.add(this.getAhiCveStAviso());
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
        String sql = "INSERT INTO AVISOS_HIS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AHI_NUM_FOLIO";
        fieldValues += ", ?";
        values.add(this.getAhiNumFolio());

        fields += ", AHI_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAhiNumContrato());

        fields += ", AHI_FEC_IMPR";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getAhiFecImpr());

        fields += ", AHI_TIPO_AVISO";
        fieldValues += ", ?";
        values.add(this.getAhiTipoAviso());

        fields += ", AHI_CVE_ST_AVISO";
        fieldValues += ", ?";
        values.add(this.getAhiCveStAviso());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AVISOS_HIS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AHI_NUM_FOLIO = ?";
        values.add(this.getAhiNumFolio());
        conditions += " AND AHI_NUM_CONTRATO = ?";
        values.add(this.getAhiNumContrato());
        conditions += " AND AHI_FEC_IMPR = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getAhiFecImpr());
        conditions += " AND AHI_TIPO_AVISO = ?";
        values.add(this.getAhiTipoAviso());
        conditions += " AND AHI_CVE_ST_AVISO = ?";
        values.add(this.getAhiCveStAviso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        AvisosHis instance = (AvisosHis) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAhiNumFolio().equals(instance.getAhiNumFolio()))
            equalObjects = false;
        if (equalObjects && !this.getAhiNumContrato().equals(instance.getAhiNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAhiFecImpr().equals(instance.getAhiFecImpr()))
            equalObjects = false;
        if (equalObjects && !this.getAhiTipoAviso().equals(instance.getAhiTipoAviso()))
            equalObjects = false;
        if (equalObjects && !this.getAhiCveStAviso().equals(instance.getAhiCveStAviso()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        AvisosHis result = new AvisosHis();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAhiNumFolio((BigDecimal) objectData.getData("AHI_NUM_FOLIO"));
        result.setAhiNumContrato((BigDecimal) objectData.getData("AHI_NUM_CONTRATO"));
        result.setAhiFecImpr((String) objectData.getData("AHI_FEC_IMPR"));
        result.setAhiTipoAviso((String) objectData.getData("AHI_TIPO_AVISO"));
        result.setAhiCveStAviso((String) objectData.getData("AHI_CVE_ST_AVISO"));

        return result;

    }

}
