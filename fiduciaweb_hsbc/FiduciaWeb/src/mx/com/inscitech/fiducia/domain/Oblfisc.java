package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OBLFISC_PK", columns = { "OBF_CVE_OBLIGFISC", "OBL_TIPO_IMP" }, sequences = { "MANUAL" })
public class Oblfisc extends DomainObject {

    String obfCveObligfisc = null;
    String oblTipoImp = null;
    String obfDescripcion = null;
    BigDecimal obfNumDeclar = null;
    String obfPeriodo = null;
    String obfPlazPres = null;
    String obfLugarPres = null;
    String obfFormato = null;
    BigDecimal obfAnoAltReg = null;
    BigDecimal obfMesAltReg = null;
    BigDecimal obfDiaAltReg = null;
    BigDecimal obfAnoUltMod = null;
    BigDecimal obfMesUltMod = null;
    BigDecimal obfDiaUltMod = null;
    String obfCveStOblfis = null;

    public Oblfisc() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setObfCveObligfisc(String obfCveObligfisc) {
        this.obfCveObligfisc = obfCveObligfisc;
    }

    public String getObfCveObligfisc() {
        return this.obfCveObligfisc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOblTipoImp(String oblTipoImp) {
        this.oblTipoImp = oblTipoImp;
    }

    public String getOblTipoImp() {
        return this.oblTipoImp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setObfDescripcion(String obfDescripcion) {
        this.obfDescripcion = obfDescripcion;
    }

    public String getObfDescripcion() {
        return this.obfDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setObfNumDeclar(BigDecimal obfNumDeclar) {
        this.obfNumDeclar = obfNumDeclar;
    }

    public BigDecimal getObfNumDeclar() {
        return this.obfNumDeclar;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setObfPeriodo(String obfPeriodo) {
        this.obfPeriodo = obfPeriodo;
    }

    public String getObfPeriodo() {
        return this.obfPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setObfPlazPres(String obfPlazPres) {
        this.obfPlazPres = obfPlazPres;
    }

    public String getObfPlazPres() {
        return this.obfPlazPres;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setObfLugarPres(String obfLugarPres) {
        this.obfLugarPres = obfLugarPres;
    }

    public String getObfLugarPres() {
        return this.obfLugarPres;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setObfFormato(String obfFormato) {
        this.obfFormato = obfFormato;
    }

    public String getObfFormato() {
        return this.obfFormato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setObfAnoAltReg(BigDecimal obfAnoAltReg) {
        this.obfAnoAltReg = obfAnoAltReg;
    }

    public BigDecimal getObfAnoAltReg() {
        return this.obfAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setObfMesAltReg(BigDecimal obfMesAltReg) {
        this.obfMesAltReg = obfMesAltReg;
    }

    public BigDecimal getObfMesAltReg() {
        return this.obfMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setObfDiaAltReg(BigDecimal obfDiaAltReg) {
        this.obfDiaAltReg = obfDiaAltReg;
    }

    public BigDecimal getObfDiaAltReg() {
        return this.obfDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setObfAnoUltMod(BigDecimal obfAnoUltMod) {
        this.obfAnoUltMod = obfAnoUltMod;
    }

    public BigDecimal getObfAnoUltMod() {
        return this.obfAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setObfMesUltMod(BigDecimal obfMesUltMod) {
        this.obfMesUltMod = obfMesUltMod;
    }

    public BigDecimal getObfMesUltMod() {
        return this.obfMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setObfDiaUltMod(BigDecimal obfDiaUltMod) {
        this.obfDiaUltMod = obfDiaUltMod;
    }

    public BigDecimal getObfDiaUltMod() {
        return this.obfDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setObfCveStOblfis(String obfCveStOblfis) {
        this.obfCveStOblfis = obfCveStOblfis;
    }

    public String getObfCveStOblfis() {
        return this.obfCveStOblfis;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OBLFISC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getObfCveObligfisc() != null && "null".equals(this.getObfCveObligfisc())) {
            conditions += " AND OBF_CVE_OBLIGFISC IS NULL";
        } else if (this.getObfCveObligfisc() != null) {
            conditions += " AND OBF_CVE_OBLIGFISC = ?";
            values.add(this.getObfCveObligfisc());
        }

        if (this.getOblTipoImp() != null && "null".equals(this.getOblTipoImp())) {
            conditions += " AND OBL_TIPO_IMP IS NULL";
        } else if (this.getOblTipoImp() != null) {
            conditions += " AND OBL_TIPO_IMP = ?";
            values.add(this.getOblTipoImp());
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
        String sql = "SELECT * FROM OBLFISC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getObfCveObligfisc() != null && "null".equals(this.getObfCveObligfisc())) {
            conditions += " AND OBF_CVE_OBLIGFISC IS NULL";
        } else if (this.getObfCveObligfisc() != null) {
            conditions += " AND OBF_CVE_OBLIGFISC = ?";
            values.add(this.getObfCveObligfisc());
        }

        if (this.getOblTipoImp() != null && "null".equals(this.getOblTipoImp())) {
            conditions += " AND OBL_TIPO_IMP IS NULL";
        } else if (this.getOblTipoImp() != null) {
            conditions += " AND OBL_TIPO_IMP = ?";
            values.add(this.getOblTipoImp());
        }

        if (this.getObfDescripcion() != null && "null".equals(this.getObfDescripcion())) {
            conditions += " AND OBF_DESCRIPCION IS NULL";
        } else if (this.getObfDescripcion() != null) {
            conditions += " AND OBF_DESCRIPCION = ?";
            values.add(this.getObfDescripcion());
        }

        if (this.getObfNumDeclar() != null && this.getObfNumDeclar().longValue() == -999) {
            conditions += " AND OBF_NUM_DECLAR IS NULL";
        } else if (this.getObfNumDeclar() != null) {
            conditions += " AND OBF_NUM_DECLAR = ?";
            values.add(this.getObfNumDeclar());
        }

        if (this.getObfPeriodo() != null && "null".equals(this.getObfPeriodo())) {
            conditions += " AND OBF_PERIODO IS NULL";
        } else if (this.getObfPeriodo() != null) {
            conditions += " AND OBF_PERIODO = ?";
            values.add(this.getObfPeriodo());
        }

        if (this.getObfPlazPres() != null && "null".equals(this.getObfPlazPres())) {
            conditions += " AND OBF_PLAZ_PRES IS NULL";
        } else if (this.getObfPlazPres() != null) {
            conditions += " AND OBF_PLAZ_PRES = ?";
            values.add(this.getObfPlazPres());
        }

        if (this.getObfLugarPres() != null && "null".equals(this.getObfLugarPres())) {
            conditions += " AND OBF_LUGAR_PRES IS NULL";
        } else if (this.getObfLugarPres() != null) {
            conditions += " AND OBF_LUGAR_PRES = ?";
            values.add(this.getObfLugarPres());
        }

        if (this.getObfFormato() != null && "null".equals(this.getObfFormato())) {
            conditions += " AND OBF_FORMATO IS NULL";
        } else if (this.getObfFormato() != null) {
            conditions += " AND OBF_FORMATO = ?";
            values.add(this.getObfFormato());
        }

        if (this.getObfAnoAltReg() != null && this.getObfAnoAltReg().longValue() == -999) {
            conditions += " AND OBF_ANO_ALT_REG IS NULL";
        } else if (this.getObfAnoAltReg() != null) {
            conditions += " AND OBF_ANO_ALT_REG = ?";
            values.add(this.getObfAnoAltReg());
        }

        if (this.getObfMesAltReg() != null && this.getObfMesAltReg().longValue() == -999) {
            conditions += " AND OBF_MES_ALT_REG IS NULL";
        } else if (this.getObfMesAltReg() != null) {
            conditions += " AND OBF_MES_ALT_REG = ?";
            values.add(this.getObfMesAltReg());
        }

        if (this.getObfDiaAltReg() != null && this.getObfDiaAltReg().longValue() == -999) {
            conditions += " AND OBF_DIA_ALT_REG IS NULL";
        } else if (this.getObfDiaAltReg() != null) {
            conditions += " AND OBF_DIA_ALT_REG = ?";
            values.add(this.getObfDiaAltReg());
        }

        if (this.getObfAnoUltMod() != null && this.getObfAnoUltMod().longValue() == -999) {
            conditions += " AND OBF_ANO_ULT_MOD IS NULL";
        } else if (this.getObfAnoUltMod() != null) {
            conditions += " AND OBF_ANO_ULT_MOD = ?";
            values.add(this.getObfAnoUltMod());
        }

        if (this.getObfMesUltMod() != null && this.getObfMesUltMod().longValue() == -999) {
            conditions += " AND OBF_MES_ULT_MOD IS NULL";
        } else if (this.getObfMesUltMod() != null) {
            conditions += " AND OBF_MES_ULT_MOD = ?";
            values.add(this.getObfMesUltMod());
        }

        if (this.getObfDiaUltMod() != null && this.getObfDiaUltMod().longValue() == -999) {
            conditions += " AND OBF_DIA_ULT_MOD IS NULL";
        } else if (this.getObfDiaUltMod() != null) {
            conditions += " AND OBF_DIA_ULT_MOD = ?";
            values.add(this.getObfDiaUltMod());
        }

        if (this.getObfCveStOblfis() != null && "null".equals(this.getObfCveStOblfis())) {
            conditions += " AND OBF_CVE_ST_OBLFIS IS NULL";
        } else if (this.getObfCveStOblfis() != null) {
            conditions += " AND OBF_CVE_ST_OBLFIS = ?";
            values.add(this.getObfCveStOblfis());
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
        String sql = "UPDATE OBLFISC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OBF_CVE_OBLIGFISC = ?";
        pkValues.add(this.getObfCveObligfisc());
        conditions += " AND OBL_TIPO_IMP = ?";
        pkValues.add(this.getOblTipoImp());
        fields += " OBF_DESCRIPCION = ?, ";
        values.add(this.getObfDescripcion());
        fields += " OBF_NUM_DECLAR = ?, ";
        values.add(this.getObfNumDeclar());
        fields += " OBF_PERIODO = ?, ";
        values.add(this.getObfPeriodo());
        fields += " OBF_PLAZ_PRES = ?, ";
        values.add(this.getObfPlazPres());
        fields += " OBF_LUGAR_PRES = ?, ";
        values.add(this.getObfLugarPres());
        fields += " OBF_FORMATO = ?, ";
        values.add(this.getObfFormato());
        fields += " OBF_ANO_ALT_REG = ?, ";
        values.add(this.getObfAnoAltReg());
        fields += " OBF_MES_ALT_REG = ?, ";
        values.add(this.getObfMesAltReg());
        fields += " OBF_DIA_ALT_REG = ?, ";
        values.add(this.getObfDiaAltReg());
        fields += " OBF_ANO_ULT_MOD = ?, ";
        values.add(this.getObfAnoUltMod());
        fields += " OBF_MES_ULT_MOD = ?, ";
        values.add(this.getObfMesUltMod());
        fields += " OBF_DIA_ULT_MOD = ?, ";
        values.add(this.getObfDiaUltMod());
        fields += " OBF_CVE_ST_OBLFIS = ?, ";
        values.add(this.getObfCveStOblfis());
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
        String sql = "INSERT INTO OBLFISC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OBF_CVE_OBLIGFISC";
        fieldValues += ", ?";
        values.add(this.getObfCveObligfisc());

        fields += ", OBL_TIPO_IMP";
        fieldValues += ", ?";
        values.add(this.getOblTipoImp());

        fields += ", OBF_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getObfDescripcion());

        fields += ", OBF_NUM_DECLAR";
        fieldValues += ", ?";
        values.add(this.getObfNumDeclar());

        fields += ", OBF_PERIODO";
        fieldValues += ", ?";
        values.add(this.getObfPeriodo());

        fields += ", OBF_PLAZ_PRES";
        fieldValues += ", ?";
        values.add(this.getObfPlazPres());

        fields += ", OBF_LUGAR_PRES";
        fieldValues += ", ?";
        values.add(this.getObfLugarPres());

        fields += ", OBF_FORMATO";
        fieldValues += ", ?";
        values.add(this.getObfFormato());

        fields += ", OBF_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getObfAnoAltReg());

        fields += ", OBF_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getObfMesAltReg());

        fields += ", OBF_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getObfDiaAltReg());

        fields += ", OBF_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getObfAnoUltMod());

        fields += ", OBF_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getObfMesUltMod());

        fields += ", OBF_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getObfDiaUltMod());

        fields += ", OBF_CVE_ST_OBLFIS";
        fieldValues += ", ?";
        values.add(this.getObfCveStOblfis());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OBLFISC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OBF_CVE_OBLIGFISC = ?";
        values.add(this.getObfCveObligfisc());
        conditions += " AND OBL_TIPO_IMP = ?";
        values.add(this.getOblTipoImp());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Oblfisc instance = (Oblfisc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getObfCveObligfisc().equals(instance.getObfCveObligfisc()))
            equalObjects = false;
        if (equalObjects && !this.getOblTipoImp().equals(instance.getOblTipoImp()))
            equalObjects = false;
        if (equalObjects && !this.getObfDescripcion().equals(instance.getObfDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getObfNumDeclar().equals(instance.getObfNumDeclar()))
            equalObjects = false;
        if (equalObjects && !this.getObfPeriodo().equals(instance.getObfPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getObfPlazPres().equals(instance.getObfPlazPres()))
            equalObjects = false;
        if (equalObjects && !this.getObfLugarPres().equals(instance.getObfLugarPres()))
            equalObjects = false;
        if (equalObjects && !this.getObfFormato().equals(instance.getObfFormato()))
            equalObjects = false;
        if (equalObjects && !this.getObfAnoAltReg().equals(instance.getObfAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getObfMesAltReg().equals(instance.getObfMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getObfDiaAltReg().equals(instance.getObfDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getObfAnoUltMod().equals(instance.getObfAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getObfMesUltMod().equals(instance.getObfMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getObfDiaUltMod().equals(instance.getObfDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getObfCveStOblfis().equals(instance.getObfCveStOblfis()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Oblfisc result = new Oblfisc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setObfCveObligfisc((String) objectData.getData("OBF_CVE_OBLIGFISC"));
        result.setOblTipoImp((String) objectData.getData("OBL_TIPO_IMP"));
        result.setObfDescripcion((String) objectData.getData("OBF_DESCRIPCION"));
        result.setObfNumDeclar((BigDecimal) objectData.getData("OBF_NUM_DECLAR"));
        result.setObfPeriodo((String) objectData.getData("OBF_PERIODO"));
        result.setObfPlazPres((String) objectData.getData("OBF_PLAZ_PRES"));
        result.setObfLugarPres((String) objectData.getData("OBF_LUGAR_PRES"));
        result.setObfFormato((String) objectData.getData("OBF_FORMATO"));
        result.setObfAnoAltReg((BigDecimal) objectData.getData("OBF_ANO_ALT_REG"));
        result.setObfMesAltReg((BigDecimal) objectData.getData("OBF_MES_ALT_REG"));
        result.setObfDiaAltReg((BigDecimal) objectData.getData("OBF_DIA_ALT_REG"));
        result.setObfAnoUltMod((BigDecimal) objectData.getData("OBF_ANO_ULT_MOD"));
        result.setObfMesUltMod((BigDecimal) objectData.getData("OBF_MES_ULT_MOD"));
        result.setObfDiaUltMod((BigDecimal) objectData.getData("OBF_DIA_ULT_MOD"));
        result.setObfCveStOblfis((String) objectData.getData("OBF_CVE_ST_OBLFIS"));

        return result;

    }

}
