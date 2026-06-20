package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COESTFIN_PK", columns = { "CFE_NUM_CONCEPTO" }, sequences = { "MAX" })
public class Coestfin extends DomainObject {

    BigDecimal cfeNumConcepto = null;
    String cfeNomRubro = null;
    String cfeNomConcepto = null;
    String cefDescripcion = null;
    BigDecimal cfeAnoAltaReg = null;
    BigDecimal cfeMesAltaReg = null;
    BigDecimal cfeDiaAltaReg = null;
    BigDecimal cfeAnoUltMod = null;
    BigDecimal cfeMesUltMod = null;
    BigDecimal cfeDiaUltMod = null;
    String cfeCveStCoestfin = null;

    public Coestfin() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCfeNumConcepto(BigDecimal cfeNumConcepto) {
        this.cfeNumConcepto = cfeNumConcepto;
    }

    public BigDecimal getCfeNumConcepto() {
        return this.cfeNumConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCfeNomRubro(String cfeNomRubro) {
        this.cfeNomRubro = cfeNomRubro;
    }

    public String getCfeNomRubro() {
        return this.cfeNomRubro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCfeNomConcepto(String cfeNomConcepto) {
        this.cfeNomConcepto = cfeNomConcepto;
    }

    public String getCfeNomConcepto() {
        return this.cfeNomConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCefDescripcion(String cefDescripcion) {
        this.cefDescripcion = cefDescripcion;
    }

    public String getCefDescripcion() {
        return this.cefDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCfeAnoAltaReg(BigDecimal cfeAnoAltaReg) {
        this.cfeAnoAltaReg = cfeAnoAltaReg;
    }

    public BigDecimal getCfeAnoAltaReg() {
        return this.cfeAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCfeMesAltaReg(BigDecimal cfeMesAltaReg) {
        this.cfeMesAltaReg = cfeMesAltaReg;
    }

    public BigDecimal getCfeMesAltaReg() {
        return this.cfeMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCfeDiaAltaReg(BigDecimal cfeDiaAltaReg) {
        this.cfeDiaAltaReg = cfeDiaAltaReg;
    }

    public BigDecimal getCfeDiaAltaReg() {
        return this.cfeDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCfeAnoUltMod(BigDecimal cfeAnoUltMod) {
        this.cfeAnoUltMod = cfeAnoUltMod;
    }

    public BigDecimal getCfeAnoUltMod() {
        return this.cfeAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCfeMesUltMod(BigDecimal cfeMesUltMod) {
        this.cfeMesUltMod = cfeMesUltMod;
    }

    public BigDecimal getCfeMesUltMod() {
        return this.cfeMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCfeDiaUltMod(BigDecimal cfeDiaUltMod) {
        this.cfeDiaUltMod = cfeDiaUltMod;
    }

    public BigDecimal getCfeDiaUltMod() {
        return this.cfeDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCfeCveStCoestfin(String cfeCveStCoestfin) {
        this.cfeCveStCoestfin = cfeCveStCoestfin;
    }

    public String getCfeCveStCoestfin() {
        return this.cfeCveStCoestfin;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COESTFIN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCfeNumConcepto() != null && this.getCfeNumConcepto().longValue() == -999) {
            conditions += " AND CFE_NUM_CONCEPTO IS NULL";
        } else if (this.getCfeNumConcepto() != null) {
            conditions += " AND CFE_NUM_CONCEPTO = ?";
            values.add(this.getCfeNumConcepto());
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
        String sql = "SELECT * FROM COESTFIN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCfeNumConcepto() != null && this.getCfeNumConcepto().longValue() == -999) {
            conditions += " AND CFE_NUM_CONCEPTO IS NULL";
        } else if (this.getCfeNumConcepto() != null) {
            conditions += " AND CFE_NUM_CONCEPTO = ?";
            values.add(this.getCfeNumConcepto());
        }

        if (this.getCfeNomRubro() != null && "null".equals(this.getCfeNomRubro())) {
            conditions += " AND CFE_NOM_RUBRO IS NULL";
        } else if (this.getCfeNomRubro() != null) {
            conditions += " AND CFE_NOM_RUBRO = ?";
            values.add(this.getCfeNomRubro());
        }

        if (this.getCfeNomConcepto() != null && "null".equals(this.getCfeNomConcepto())) {
            conditions += " AND CFE_NOM_CONCEPTO IS NULL";
        } else if (this.getCfeNomConcepto() != null) {
            conditions += " AND CFE_NOM_CONCEPTO = ?";
            values.add(this.getCfeNomConcepto());
        }

        if (this.getCefDescripcion() != null && "null".equals(this.getCefDescripcion())) {
            conditions += " AND CEF_DESCRIPCION IS NULL";
        } else if (this.getCefDescripcion() != null) {
            conditions += " AND CEF_DESCRIPCION = ?";
            values.add(this.getCefDescripcion());
        }

        if (this.getCfeAnoAltaReg() != null && this.getCfeAnoAltaReg().longValue() == -999) {
            conditions += " AND CFE_ANO_ALTA_REG IS NULL";
        } else if (this.getCfeAnoAltaReg() != null) {
            conditions += " AND CFE_ANO_ALTA_REG = ?";
            values.add(this.getCfeAnoAltaReg());
        }

        if (this.getCfeMesAltaReg() != null && this.getCfeMesAltaReg().longValue() == -999) {
            conditions += " AND CFE_MES_ALTA_REG IS NULL";
        } else if (this.getCfeMesAltaReg() != null) {
            conditions += " AND CFE_MES_ALTA_REG = ?";
            values.add(this.getCfeMesAltaReg());
        }

        if (this.getCfeDiaAltaReg() != null && this.getCfeDiaAltaReg().longValue() == -999) {
            conditions += " AND CFE_DIA_ALTA_REG IS NULL";
        } else if (this.getCfeDiaAltaReg() != null) {
            conditions += " AND CFE_DIA_ALTA_REG = ?";
            values.add(this.getCfeDiaAltaReg());
        }

        if (this.getCfeAnoUltMod() != null && this.getCfeAnoUltMod().longValue() == -999) {
            conditions += " AND CFE_ANO_ULT_MOD IS NULL";
        } else if (this.getCfeAnoUltMod() != null) {
            conditions += " AND CFE_ANO_ULT_MOD = ?";
            values.add(this.getCfeAnoUltMod());
        }

        if (this.getCfeMesUltMod() != null && this.getCfeMesUltMod().longValue() == -999) {
            conditions += " AND CFE_MES_ULT_MOD IS NULL";
        } else if (this.getCfeMesUltMod() != null) {
            conditions += " AND CFE_MES_ULT_MOD = ?";
            values.add(this.getCfeMesUltMod());
        }

        if (this.getCfeDiaUltMod() != null && this.getCfeDiaUltMod().longValue() == -999) {
            conditions += " AND CFE_DIA_ULT_MOD IS NULL";
        } else if (this.getCfeDiaUltMod() != null) {
            conditions += " AND CFE_DIA_ULT_MOD = ?";
            values.add(this.getCfeDiaUltMod());
        }

        if (this.getCfeCveStCoestfin() != null && "null".equals(this.getCfeCveStCoestfin())) {
            conditions += " AND CFE_CVE_ST_COESTFIN IS NULL";
        } else if (this.getCfeCveStCoestfin() != null) {
            conditions += " AND CFE_CVE_ST_COESTFIN = ?";
            values.add(this.getCfeCveStCoestfin());
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
        String sql = "UPDATE COESTFIN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CFE_NUM_CONCEPTO = ?";
        pkValues.add(this.getCfeNumConcepto());
        fields += " CFE_NOM_RUBRO = ?, ";
        values.add(this.getCfeNomRubro());
        fields += " CFE_NOM_CONCEPTO = ?, ";
        values.add(this.getCfeNomConcepto());
        fields += " CEF_DESCRIPCION = ?, ";
        values.add(this.getCefDescripcion());
        fields += " CFE_ANO_ALTA_REG = ?, ";
        values.add(this.getCfeAnoAltaReg());
        fields += " CFE_MES_ALTA_REG = ?, ";
        values.add(this.getCfeMesAltaReg());
        fields += " CFE_DIA_ALTA_REG = ?, ";
        values.add(this.getCfeDiaAltaReg());
        fields += " CFE_ANO_ULT_MOD = ?, ";
        values.add(this.getCfeAnoUltMod());
        fields += " CFE_MES_ULT_MOD = ?, ";
        values.add(this.getCfeMesUltMod());
        fields += " CFE_DIA_ULT_MOD = ?, ";
        values.add(this.getCfeDiaUltMod());
        fields += " CFE_CVE_ST_COESTFIN = ?, ";
        values.add(this.getCfeCveStCoestfin());
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
        String sql = "INSERT INTO COESTFIN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CFE_NUM_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCfeNumConcepto());

        fields += ", CFE_NOM_RUBRO";
        fieldValues += ", ?";
        values.add(this.getCfeNomRubro());

        fields += ", CFE_NOM_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCfeNomConcepto());

        fields += ", CEF_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getCefDescripcion());

        fields += ", CFE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCfeAnoAltaReg());

        fields += ", CFE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCfeMesAltaReg());

        fields += ", CFE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCfeDiaAltaReg());

        fields += ", CFE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCfeAnoUltMod());

        fields += ", CFE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCfeMesUltMod());

        fields += ", CFE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCfeDiaUltMod());

        fields += ", CFE_CVE_ST_COESTFIN";
        fieldValues += ", ?";
        values.add(this.getCfeCveStCoestfin());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COESTFIN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CFE_NUM_CONCEPTO = ?";
        values.add(this.getCfeNumConcepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Coestfin instance = (Coestfin) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCfeNumConcepto().equals(instance.getCfeNumConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCfeNomRubro().equals(instance.getCfeNomRubro()))
            equalObjects = false;
        if (equalObjects && !this.getCfeNomConcepto().equals(instance.getCfeNomConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCefDescripcion().equals(instance.getCefDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getCfeAnoAltaReg().equals(instance.getCfeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCfeMesAltaReg().equals(instance.getCfeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCfeDiaAltaReg().equals(instance.getCfeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCfeAnoUltMod().equals(instance.getCfeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCfeMesUltMod().equals(instance.getCfeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCfeDiaUltMod().equals(instance.getCfeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCfeCveStCoestfin().equals(instance.getCfeCveStCoestfin()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Coestfin result = new Coestfin();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCfeNumConcepto((BigDecimal) objectData.getData("CFE_NUM_CONCEPTO"));
        result.setCfeNomRubro((String) objectData.getData("CFE_NOM_RUBRO"));
        result.setCfeNomConcepto((String) objectData.getData("CFE_NOM_CONCEPTO"));
        result.setCefDescripcion((String) objectData.getData("CEF_DESCRIPCION"));
        result.setCfeAnoAltaReg((BigDecimal) objectData.getData("CFE_ANO_ALTA_REG"));
        result.setCfeMesAltaReg((BigDecimal) objectData.getData("CFE_MES_ALTA_REG"));
        result.setCfeDiaAltaReg((BigDecimal) objectData.getData("CFE_DIA_ALTA_REG"));
        result.setCfeAnoUltMod((BigDecimal) objectData.getData("CFE_ANO_ULT_MOD"));
        result.setCfeMesUltMod((BigDecimal) objectData.getData("CFE_MES_ULT_MOD"));
        result.setCfeDiaUltMod((BigDecimal) objectData.getData("CFE_DIA_ULT_MOD"));
        result.setCfeCveStCoestfin((String) objectData.getData("CFE_CVE_ST_COESTFIN"));

        return result;

    }

}
