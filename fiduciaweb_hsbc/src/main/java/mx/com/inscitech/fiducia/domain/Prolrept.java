package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PROLREPT_PK", columns = { "PLR_NUM_PRODUCTO", "PLR_NUM_REPORTE" }, sequences = { "MANUAL" })
public class Prolrept extends DomainObject {

    BigDecimal plrNumProducto = null;
    BigDecimal plrNumReporte = null;
    String plrNomReporte = null;
    String plrDescReporte = null;
    BigDecimal plrAnoAltaReg = null;
    BigDecimal plrMesAltaReg = null;
    BigDecimal plrDiaAltaReg = null;
    BigDecimal plrAnoUltMod = null;
    BigDecimal plrMesUltMod = null;
    BigDecimal plrDiaUltMod = null;
    String plrCveStProlrep = null;

    public Prolrept() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlrNumProducto(BigDecimal plrNumProducto) {
        this.plrNumProducto = plrNumProducto;
    }

    public BigDecimal getPlrNumProducto() {
        return this.plrNumProducto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlrNumReporte(BigDecimal plrNumReporte) {
        this.plrNumReporte = plrNumReporte;
    }

    public BigDecimal getPlrNumReporte() {
        return this.plrNumReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlrNomReporte(String plrNomReporte) {
        this.plrNomReporte = plrNomReporte;
    }

    public String getPlrNomReporte() {
        return this.plrNomReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlrDescReporte(String plrDescReporte) {
        this.plrDescReporte = plrDescReporte;
    }

    public String getPlrDescReporte() {
        return this.plrDescReporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlrAnoAltaReg(BigDecimal plrAnoAltaReg) {
        this.plrAnoAltaReg = plrAnoAltaReg;
    }

    public BigDecimal getPlrAnoAltaReg() {
        return this.plrAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlrMesAltaReg(BigDecimal plrMesAltaReg) {
        this.plrMesAltaReg = plrMesAltaReg;
    }

    public BigDecimal getPlrMesAltaReg() {
        return this.plrMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlrDiaAltaReg(BigDecimal plrDiaAltaReg) {
        this.plrDiaAltaReg = plrDiaAltaReg;
    }

    public BigDecimal getPlrDiaAltaReg() {
        return this.plrDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlrAnoUltMod(BigDecimal plrAnoUltMod) {
        this.plrAnoUltMod = plrAnoUltMod;
    }

    public BigDecimal getPlrAnoUltMod() {
        return this.plrAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlrMesUltMod(BigDecimal plrMesUltMod) {
        this.plrMesUltMod = plrMesUltMod;
    }

    public BigDecimal getPlrMesUltMod() {
        return this.plrMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlrDiaUltMod(BigDecimal plrDiaUltMod) {
        this.plrDiaUltMod = plrDiaUltMod;
    }

    public BigDecimal getPlrDiaUltMod() {
        return this.plrDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlrCveStProlrep(String plrCveStProlrep) {
        this.plrCveStProlrep = plrCveStProlrep;
    }

    public String getPlrCveStProlrep() {
        return this.plrCveStProlrep;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PROLREPT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPlrNumProducto() != null && this.getPlrNumProducto().longValue() == -999) {
            conditions += " AND PLR_NUM_PRODUCTO IS NULL";
        } else if (this.getPlrNumProducto() != null) {
            conditions += " AND PLR_NUM_PRODUCTO = ?";
            values.add(this.getPlrNumProducto());
        }

        if (this.getPlrNumReporte() != null && this.getPlrNumReporte().longValue() == -999) {
            conditions += " AND PLR_NUM_REPORTE IS NULL";
        } else if (this.getPlrNumReporte() != null) {
            conditions += " AND PLR_NUM_REPORTE = ?";
            values.add(this.getPlrNumReporte());
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
        String sql = "SELECT * FROM PROLREPT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPlrNumProducto() != null && this.getPlrNumProducto().longValue() == -999) {
            conditions += " AND PLR_NUM_PRODUCTO IS NULL";
        } else if (this.getPlrNumProducto() != null) {
            conditions += " AND PLR_NUM_PRODUCTO = ?";
            values.add(this.getPlrNumProducto());
        }

        if (this.getPlrNumReporte() != null && this.getPlrNumReporte().longValue() == -999) {
            conditions += " AND PLR_NUM_REPORTE IS NULL";
        } else if (this.getPlrNumReporte() != null) {
            conditions += " AND PLR_NUM_REPORTE = ?";
            values.add(this.getPlrNumReporte());
        }

        if (this.getPlrNomReporte() != null && "null".equals(this.getPlrNomReporte())) {
            conditions += " AND PLR_NOM_REPORTE IS NULL";
        } else if (this.getPlrNomReporte() != null) {
            conditions += " AND PLR_NOM_REPORTE = ?";
            values.add(this.getPlrNomReporte());
        }

        if (this.getPlrDescReporte() != null && "null".equals(this.getPlrDescReporte())) {
            conditions += " AND PLR_DESC_REPORTE IS NULL";
        } else if (this.getPlrDescReporte() != null) {
            conditions += " AND PLR_DESC_REPORTE = ?";
            values.add(this.getPlrDescReporte());
        }

        if (this.getPlrAnoAltaReg() != null && this.getPlrAnoAltaReg().longValue() == -999) {
            conditions += " AND PLR_ANO_ALTA_REG IS NULL";
        } else if (this.getPlrAnoAltaReg() != null) {
            conditions += " AND PLR_ANO_ALTA_REG = ?";
            values.add(this.getPlrAnoAltaReg());
        }

        if (this.getPlrMesAltaReg() != null && this.getPlrMesAltaReg().longValue() == -999) {
            conditions += " AND PLR_MES_ALTA_REG IS NULL";
        } else if (this.getPlrMesAltaReg() != null) {
            conditions += " AND PLR_MES_ALTA_REG = ?";
            values.add(this.getPlrMesAltaReg());
        }

        if (this.getPlrDiaAltaReg() != null && this.getPlrDiaAltaReg().longValue() == -999) {
            conditions += " AND PLR_DIA_ALTA_REG IS NULL";
        } else if (this.getPlrDiaAltaReg() != null) {
            conditions += " AND PLR_DIA_ALTA_REG = ?";
            values.add(this.getPlrDiaAltaReg());
        }

        if (this.getPlrAnoUltMod() != null && this.getPlrAnoUltMod().longValue() == -999) {
            conditions += " AND PLR_ANO_ULT_MOD IS NULL";
        } else if (this.getPlrAnoUltMod() != null) {
            conditions += " AND PLR_ANO_ULT_MOD = ?";
            values.add(this.getPlrAnoUltMod());
        }

        if (this.getPlrMesUltMod() != null && this.getPlrMesUltMod().longValue() == -999) {
            conditions += " AND PLR_MES_ULT_MOD IS NULL";
        } else if (this.getPlrMesUltMod() != null) {
            conditions += " AND PLR_MES_ULT_MOD = ?";
            values.add(this.getPlrMesUltMod());
        }

        if (this.getPlrDiaUltMod() != null && this.getPlrDiaUltMod().longValue() == -999) {
            conditions += " AND PLR_DIA_ULT_MOD IS NULL";
        } else if (this.getPlrDiaUltMod() != null) {
            conditions += " AND PLR_DIA_ULT_MOD = ?";
            values.add(this.getPlrDiaUltMod());
        }

        if (this.getPlrCveStProlrep() != null && "null".equals(this.getPlrCveStProlrep())) {
            conditions += " AND PLR_CVE_ST_PROLREP IS NULL";
        } else if (this.getPlrCveStProlrep() != null) {
            conditions += " AND PLR_CVE_ST_PROLREP = ?";
            values.add(this.getPlrCveStProlrep());
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
        String sql = "UPDATE PROLREPT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PLR_NUM_PRODUCTO = ?";
        pkValues.add(this.getPlrNumProducto());
        conditions += " AND PLR_NUM_REPORTE = ?";
        pkValues.add(this.getPlrNumReporte());
        fields += " PLR_NOM_REPORTE = ?, ";
        values.add(this.getPlrNomReporte());
        fields += " PLR_DESC_REPORTE = ?, ";
        values.add(this.getPlrDescReporte());
        fields += " PLR_ANO_ALTA_REG = ?, ";
        values.add(this.getPlrAnoAltaReg());
        fields += " PLR_MES_ALTA_REG = ?, ";
        values.add(this.getPlrMesAltaReg());
        fields += " PLR_DIA_ALTA_REG = ?, ";
        values.add(this.getPlrDiaAltaReg());
        fields += " PLR_ANO_ULT_MOD = ?, ";
        values.add(this.getPlrAnoUltMod());
        fields += " PLR_MES_ULT_MOD = ?, ";
        values.add(this.getPlrMesUltMod());
        fields += " PLR_DIA_ULT_MOD = ?, ";
        values.add(this.getPlrDiaUltMod());
        fields += " PLR_CVE_ST_PROLREP = ?, ";
        values.add(this.getPlrCveStProlrep());
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
        String sql = "INSERT INTO PROLREPT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PLR_NUM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getPlrNumProducto());

        fields += ", PLR_NUM_REPORTE";
        fieldValues += ", ?";
        values.add(this.getPlrNumReporte());

        fields += ", PLR_NOM_REPORTE";
        fieldValues += ", ?";
        values.add(this.getPlrNomReporte());

        fields += ", PLR_DESC_REPORTE";
        fieldValues += ", ?";
        values.add(this.getPlrDescReporte());

        fields += ", PLR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlrAnoAltaReg());

        fields += ", PLR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlrMesAltaReg());

        fields += ", PLR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlrDiaAltaReg());

        fields += ", PLR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlrAnoUltMod());

        fields += ", PLR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlrMesUltMod());

        fields += ", PLR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlrDiaUltMod());

        fields += ", PLR_CVE_ST_PROLREP";
        fieldValues += ", ?";
        values.add(this.getPlrCveStProlrep());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PROLREPT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PLR_NUM_PRODUCTO = ?";
        values.add(this.getPlrNumProducto());
        conditions += " AND PLR_NUM_REPORTE = ?";
        values.add(this.getPlrNumReporte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Prolrept instance = (Prolrept) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPlrNumProducto().equals(instance.getPlrNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getPlrNumReporte().equals(instance.getPlrNumReporte()))
            equalObjects = false;
        if (equalObjects && !this.getPlrNomReporte().equals(instance.getPlrNomReporte()))
            equalObjects = false;
        if (equalObjects && !this.getPlrDescReporte().equals(instance.getPlrDescReporte()))
            equalObjects = false;
        if (equalObjects && !this.getPlrAnoAltaReg().equals(instance.getPlrAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlrMesAltaReg().equals(instance.getPlrMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlrDiaAltaReg().equals(instance.getPlrDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlrAnoUltMod().equals(instance.getPlrAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlrMesUltMod().equals(instance.getPlrMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlrDiaUltMod().equals(instance.getPlrDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlrCveStProlrep().equals(instance.getPlrCveStProlrep()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Prolrept result = new Prolrept();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPlrNumProducto((BigDecimal) objectData.getData("PLR_NUM_PRODUCTO"));
        result.setPlrNumReporte((BigDecimal) objectData.getData("PLR_NUM_REPORTE"));
        result.setPlrNomReporte((String) objectData.getData("PLR_NOM_REPORTE"));
        result.setPlrDescReporte((String) objectData.getData("PLR_DESC_REPORTE"));
        result.setPlrAnoAltaReg((BigDecimal) objectData.getData("PLR_ANO_ALTA_REG"));
        result.setPlrMesAltaReg((BigDecimal) objectData.getData("PLR_MES_ALTA_REG"));
        result.setPlrDiaAltaReg((BigDecimal) objectData.getData("PLR_DIA_ALTA_REG"));
        result.setPlrAnoUltMod((BigDecimal) objectData.getData("PLR_ANO_ULT_MOD"));
        result.setPlrMesUltMod((BigDecimal) objectData.getData("PLR_MES_ULT_MOD"));
        result.setPlrDiaUltMod((BigDecimal) objectData.getData("PLR_DIA_ULT_MOD"));
        result.setPlrCveStProlrep((String) objectData.getData("PLR_CVE_ST_PROLREP"));

        return result;

    }

}
