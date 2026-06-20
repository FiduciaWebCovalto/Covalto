package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TABHONOR_PK", columns = { "TAH_NUM_TABLA", "TAH_NUM_RANGO" }, sequences = { "MANUAL" })
public class Tabhonor extends DomainObject {

    BigDecimal tahNumTabla = null;
    BigDecimal tahNumRango = null;
    BigDecimal tahImpMaxRango = null;
    BigDecimal tahImpMinRango = null;
    BigDecimal tahPjeAnualRang = null;
    BigDecimal tahCuotaFijaRan = null;
    BigDecimal tahAnoAltaReg = null;
    BigDecimal tahMesAltaReg = null;
    BigDecimal tahDiaAltaReg = null;
    BigDecimal tahAnoUltMod = null;
    BigDecimal tahMesUltMod = null;
    BigDecimal tahDiaUltMod = null;
    String tahCveStTabhono = null;

    public Tabhonor() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTahNumTabla(BigDecimal tahNumTabla) {
        this.tahNumTabla = tahNumTabla;
    }

    public BigDecimal getTahNumTabla() {
        return this.tahNumTabla;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTahNumRango(BigDecimal tahNumRango) {
        this.tahNumRango = tahNumRango;
    }

    public BigDecimal getTahNumRango() {
        return this.tahNumRango;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTahImpMaxRango(BigDecimal tahImpMaxRango) {
        this.tahImpMaxRango = tahImpMaxRango;
    }

    public BigDecimal getTahImpMaxRango() {
        return this.tahImpMaxRango;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTahImpMinRango(BigDecimal tahImpMinRango) {
        this.tahImpMinRango = tahImpMinRango;
    }

    public BigDecimal getTahImpMinRango() {
        return this.tahImpMinRango;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setTahPjeAnualRang(BigDecimal tahPjeAnualRang) {
        this.tahPjeAnualRang = tahPjeAnualRang;
    }

    public BigDecimal getTahPjeAnualRang() {
        return this.tahPjeAnualRang;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTahCuotaFijaRan(BigDecimal tahCuotaFijaRan) {
        this.tahCuotaFijaRan = tahCuotaFijaRan;
    }

    public BigDecimal getTahCuotaFijaRan() {
        return this.tahCuotaFijaRan;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTahAnoAltaReg(BigDecimal tahAnoAltaReg) {
        this.tahAnoAltaReg = tahAnoAltaReg;
    }

    public BigDecimal getTahAnoAltaReg() {
        return this.tahAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTahMesAltaReg(BigDecimal tahMesAltaReg) {
        this.tahMesAltaReg = tahMesAltaReg;
    }

    public BigDecimal getTahMesAltaReg() {
        return this.tahMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTahDiaAltaReg(BigDecimal tahDiaAltaReg) {
        this.tahDiaAltaReg = tahDiaAltaReg;
    }

    public BigDecimal getTahDiaAltaReg() {
        return this.tahDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTahAnoUltMod(BigDecimal tahAnoUltMod) {
        this.tahAnoUltMod = tahAnoUltMod;
    }

    public BigDecimal getTahAnoUltMod() {
        return this.tahAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTahMesUltMod(BigDecimal tahMesUltMod) {
        this.tahMesUltMod = tahMesUltMod;
    }

    public BigDecimal getTahMesUltMod() {
        return this.tahMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTahDiaUltMod(BigDecimal tahDiaUltMod) {
        this.tahDiaUltMod = tahDiaUltMod;
    }

    public BigDecimal getTahDiaUltMod() {
        return this.tahDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTahCveStTabhono(String tahCveStTabhono) {
        this.tahCveStTabhono = tahCveStTabhono;
    }

    public String getTahCveStTabhono() {
        return this.tahCveStTabhono;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TABHONOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTahNumTabla() != null && this.getTahNumTabla().longValue() == -999) {
            conditions += " AND TAH_NUM_TABLA IS NULL";
        } else if (this.getTahNumTabla() != null) {
            conditions += " AND TAH_NUM_TABLA = ?";
            values.add(this.getTahNumTabla());
        }

        if (this.getTahNumRango() != null && this.getTahNumRango().longValue() == -999) {
            conditions += " AND TAH_NUM_RANGO IS NULL";
        } else if (this.getTahNumRango() != null) {
            conditions += " AND TAH_NUM_RANGO = ?";
            values.add(this.getTahNumRango());
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
        String sql = "SELECT * FROM TABHONOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTahNumTabla() != null && this.getTahNumTabla().longValue() == -999) {
            conditions += " AND TAH_NUM_TABLA IS NULL";
        } else if (this.getTahNumTabla() != null) {
            conditions += " AND TAH_NUM_TABLA = ?";
            values.add(this.getTahNumTabla());
        }

        if (this.getTahNumRango() != null && this.getTahNumRango().longValue() == -999) {
            conditions += " AND TAH_NUM_RANGO IS NULL";
        } else if (this.getTahNumRango() != null) {
            conditions += " AND TAH_NUM_RANGO = ?";
            values.add(this.getTahNumRango());
        }

        if (this.getTahImpMaxRango() != null && this.getTahImpMaxRango().longValue() == -999) {
            conditions += " AND TAH_IMP_MAX_RANGO IS NULL";
        } else if (this.getTahImpMaxRango() != null) {
            conditions += " AND TAH_IMP_MAX_RANGO = ?";
            values.add(this.getTahImpMaxRango());
        }

        if (this.getTahImpMinRango() != null && this.getTahImpMinRango().longValue() == -999) {
            conditions += " AND TAH_IMP_MIN_RANGO IS NULL";
        } else if (this.getTahImpMinRango() != null) {
            conditions += " AND TAH_IMP_MIN_RANGO = ?";
            values.add(this.getTahImpMinRango());
        }

        if (this.getTahPjeAnualRang() != null && this.getTahPjeAnualRang().longValue() == -999) {
            conditions += " AND TAH_PJE_ANUAL_RANG IS NULL";
        } else if (this.getTahPjeAnualRang() != null) {
            conditions += " AND TAH_PJE_ANUAL_RANG = ?";
            values.add(this.getTahPjeAnualRang());
        }

        if (this.getTahCuotaFijaRan() != null && this.getTahCuotaFijaRan().longValue() == -999) {
            conditions += " AND TAH_CUOTA_FIJA_RAN IS NULL";
        } else if (this.getTahCuotaFijaRan() != null) {
            conditions += " AND TAH_CUOTA_FIJA_RAN = ?";
            values.add(this.getTahCuotaFijaRan());
        }

        if (this.getTahAnoAltaReg() != null && this.getTahAnoAltaReg().longValue() == -999) {
            conditions += " AND TAH_ANO_ALTA_REG IS NULL";
        } else if (this.getTahAnoAltaReg() != null) {
            conditions += " AND TAH_ANO_ALTA_REG = ?";
            values.add(this.getTahAnoAltaReg());
        }

        if (this.getTahMesAltaReg() != null && this.getTahMesAltaReg().longValue() == -999) {
            conditions += " AND TAH_MES_ALTA_REG IS NULL";
        } else if (this.getTahMesAltaReg() != null) {
            conditions += " AND TAH_MES_ALTA_REG = ?";
            values.add(this.getTahMesAltaReg());
        }

        if (this.getTahDiaAltaReg() != null && this.getTahDiaAltaReg().longValue() == -999) {
            conditions += " AND TAH_DIA_ALTA_REG IS NULL";
        } else if (this.getTahDiaAltaReg() != null) {
            conditions += " AND TAH_DIA_ALTA_REG = ?";
            values.add(this.getTahDiaAltaReg());
        }

        if (this.getTahAnoUltMod() != null && this.getTahAnoUltMod().longValue() == -999) {
            conditions += " AND TAH_ANO_ULT_MOD IS NULL";
        } else if (this.getTahAnoUltMod() != null) {
            conditions += " AND TAH_ANO_ULT_MOD = ?";
            values.add(this.getTahAnoUltMod());
        }

        if (this.getTahMesUltMod() != null && this.getTahMesUltMod().longValue() == -999) {
            conditions += " AND TAH_MES_ULT_MOD IS NULL";
        } else if (this.getTahMesUltMod() != null) {
            conditions += " AND TAH_MES_ULT_MOD = ?";
            values.add(this.getTahMesUltMod());
        }

        if (this.getTahDiaUltMod() != null && this.getTahDiaUltMod().longValue() == -999) {
            conditions += " AND TAH_DIA_ULT_MOD IS NULL";
        } else if (this.getTahDiaUltMod() != null) {
            conditions += " AND TAH_DIA_ULT_MOD = ?";
            values.add(this.getTahDiaUltMod());
        }

        if (this.getTahCveStTabhono() != null && "null".equals(this.getTahCveStTabhono())) {
            conditions += " AND TAH_CVE_ST_TABHONO IS NULL";
        } else if (this.getTahCveStTabhono() != null) {
            conditions += " AND TAH_CVE_ST_TABHONO = ?";
            values.add(this.getTahCveStTabhono());
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
        String sql = "UPDATE TABHONOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TAH_NUM_TABLA = ?";
        pkValues.add(this.getTahNumTabla());
        conditions += " AND TAH_NUM_RANGO = ?";
        pkValues.add(this.getTahNumRango());
        fields += " TAH_IMP_MAX_RANGO = ?, ";
        values.add(this.getTahImpMaxRango());
        fields += " TAH_IMP_MIN_RANGO = ?, ";
        values.add(this.getTahImpMinRango());
        fields += " TAH_PJE_ANUAL_RANG = ?, ";
        values.add(this.getTahPjeAnualRang());
        fields += " TAH_CUOTA_FIJA_RAN = ?, ";
        values.add(this.getTahCuotaFijaRan());
        fields += " TAH_ANO_ALTA_REG = ?, ";
        values.add(this.getTahAnoAltaReg());
        fields += " TAH_MES_ALTA_REG = ?, ";
        values.add(this.getTahMesAltaReg());
        fields += " TAH_DIA_ALTA_REG = ?, ";
        values.add(this.getTahDiaAltaReg());
        fields += " TAH_ANO_ULT_MOD = ?, ";
        values.add(this.getTahAnoUltMod());
        fields += " TAH_MES_ULT_MOD = ?, ";
        values.add(this.getTahMesUltMod());
        fields += " TAH_DIA_ULT_MOD = ?, ";
        values.add(this.getTahDiaUltMod());
        fields += " TAH_CVE_ST_TABHONO = ?, ";
        values.add(this.getTahCveStTabhono());
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
        String sql = "INSERT INTO TABHONOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TAH_NUM_TABLA";
        fieldValues += ", ?";
        values.add(this.getTahNumTabla());

        fields += ", TAH_NUM_RANGO";
        fieldValues += ", ?";
        values.add(this.getTahNumRango());

        fields += ", TAH_IMP_MAX_RANGO";
        fieldValues += ", ?";
        values.add(this.getTahImpMaxRango());

        fields += ", TAH_IMP_MIN_RANGO";
        fieldValues += ", ?";
        values.add(this.getTahImpMinRango());

        fields += ", TAH_PJE_ANUAL_RANG";
        fieldValues += ", ?";
        values.add(this.getTahPjeAnualRang());

        fields += ", TAH_CUOTA_FIJA_RAN";
        fieldValues += ", ?";
        values.add(this.getTahCuotaFijaRan());

        fields += ", TAH_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTahAnoAltaReg());

        fields += ", TAH_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTahMesAltaReg());

        fields += ", TAH_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTahDiaAltaReg());

        fields += ", TAH_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTahAnoUltMod());

        fields += ", TAH_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTahMesUltMod());

        fields += ", TAH_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTahDiaUltMod());

        fields += ", TAH_CVE_ST_TABHONO";
        fieldValues += ", ?";
        values.add(this.getTahCveStTabhono());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TABHONOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TAH_NUM_TABLA = ?";
        values.add(this.getTahNumTabla());
        conditions += " AND TAH_NUM_RANGO = ?";
        values.add(this.getTahNumRango());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Tabhonor instance = (Tabhonor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTahNumTabla().equals(instance.getTahNumTabla()))
            equalObjects = false;
        if (equalObjects && !this.getTahNumRango().equals(instance.getTahNumRango()))
            equalObjects = false;
        if (equalObjects && !this.getTahImpMaxRango().equals(instance.getTahImpMaxRango()))
            equalObjects = false;
        if (equalObjects && !this.getTahImpMinRango().equals(instance.getTahImpMinRango()))
            equalObjects = false;
        if (equalObjects && !this.getTahPjeAnualRang().equals(instance.getTahPjeAnualRang()))
            equalObjects = false;
        if (equalObjects && !this.getTahCuotaFijaRan().equals(instance.getTahCuotaFijaRan()))
            equalObjects = false;
        if (equalObjects && !this.getTahAnoAltaReg().equals(instance.getTahAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTahMesAltaReg().equals(instance.getTahMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTahDiaAltaReg().equals(instance.getTahDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTahAnoUltMod().equals(instance.getTahAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTahMesUltMod().equals(instance.getTahMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTahDiaUltMod().equals(instance.getTahDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTahCveStTabhono().equals(instance.getTahCveStTabhono()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Tabhonor result = new Tabhonor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTahNumTabla((BigDecimal) objectData.getData("TAH_NUM_TABLA"));
        result.setTahNumRango((BigDecimal) objectData.getData("TAH_NUM_RANGO"));
        result.setTahImpMaxRango((BigDecimal) objectData.getData("TAH_IMP_MAX_RANGO"));
        result.setTahImpMinRango((BigDecimal) objectData.getData("TAH_IMP_MIN_RANGO"));
        result.setTahPjeAnualRang((BigDecimal) objectData.getData("TAH_PJE_ANUAL_RANG"));
        result.setTahCuotaFijaRan((BigDecimal) objectData.getData("TAH_CUOTA_FIJA_RAN"));
        result.setTahAnoAltaReg((BigDecimal) objectData.getData("TAH_ANO_ALTA_REG"));
        result.setTahMesAltaReg((BigDecimal) objectData.getData("TAH_MES_ALTA_REG"));
        result.setTahDiaAltaReg((BigDecimal) objectData.getData("TAH_DIA_ALTA_REG"));
        result.setTahAnoUltMod((BigDecimal) objectData.getData("TAH_ANO_ULT_MOD"));
        result.setTahMesUltMod((BigDecimal) objectData.getData("TAH_MES_ULT_MOD"));
        result.setTahDiaUltMod((BigDecimal) objectData.getData("TAH_DIA_ULT_MOD"));
        result.setTahCveStTabhono((String) objectData.getData("TAH_CVE_ST_TABHONO"));

        return result;

    }

}
