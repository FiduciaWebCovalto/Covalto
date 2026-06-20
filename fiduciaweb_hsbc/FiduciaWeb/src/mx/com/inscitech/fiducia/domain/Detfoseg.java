package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DETFOSEG_PK", columns = { "DFO_FOLIO_OPERA" }, sequences = { "MAX" })
public class Detfoseg extends DomainObject {

    BigDecimal dfoFolioOpera = null;
    BigDecimal dfoContrato1 = null;
    BigDecimal dfoImporte1 = null;
    BigDecimal dfoContrato2 = null;
    BigDecimal dfoImporte2 = null;
    BigDecimal dfoContrato3 = null;
    BigDecimal dfoImporte3 = null;
    BigDecimal dfoTipocambio = null;
    BigDecimal dfoAnoAltaReg = null;
    BigDecimal dfoMesAltaReg = null;
    BigDecimal dfoDiaAltaReg = null;
    BigDecimal dfoAnoUltMod = null;
    BigDecimal dfoMesUltMod = null;
    BigDecimal dfoDiaUltMod = null;
    String dfoCveStDetfoseg = null;

    public Detfoseg() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDfoFolioOpera(BigDecimal dfoFolioOpera) {
        this.dfoFolioOpera = dfoFolioOpera;
    }

    public BigDecimal getDfoFolioOpera() {
        return this.dfoFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDfoContrato1(BigDecimal dfoContrato1) {
        this.dfoContrato1 = dfoContrato1;
    }

    public BigDecimal getDfoContrato1() {
        return this.dfoContrato1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDfoImporte1(BigDecimal dfoImporte1) {
        this.dfoImporte1 = dfoImporte1;
    }

    public BigDecimal getDfoImporte1() {
        return this.dfoImporte1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDfoContrato2(BigDecimal dfoContrato2) {
        this.dfoContrato2 = dfoContrato2;
    }

    public BigDecimal getDfoContrato2() {
        return this.dfoContrato2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDfoImporte2(BigDecimal dfoImporte2) {
        this.dfoImporte2 = dfoImporte2;
    }

    public BigDecimal getDfoImporte2() {
        return this.dfoImporte2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDfoContrato3(BigDecimal dfoContrato3) {
        this.dfoContrato3 = dfoContrato3;
    }

    public BigDecimal getDfoContrato3() {
        return this.dfoContrato3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDfoImporte3(BigDecimal dfoImporte3) {
        this.dfoImporte3 = dfoImporte3;
    }

    public BigDecimal getDfoImporte3() {
        return this.dfoImporte3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDfoTipocambio(BigDecimal dfoTipocambio) {
        this.dfoTipocambio = dfoTipocambio;
    }

    public BigDecimal getDfoTipocambio() {
        return this.dfoTipocambio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfoAnoAltaReg(BigDecimal dfoAnoAltaReg) {
        this.dfoAnoAltaReg = dfoAnoAltaReg;
    }

    public BigDecimal getDfoAnoAltaReg() {
        return this.dfoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfoMesAltaReg(BigDecimal dfoMesAltaReg) {
        this.dfoMesAltaReg = dfoMesAltaReg;
    }

    public BigDecimal getDfoMesAltaReg() {
        return this.dfoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfoDiaAltaReg(BigDecimal dfoDiaAltaReg) {
        this.dfoDiaAltaReg = dfoDiaAltaReg;
    }

    public BigDecimal getDfoDiaAltaReg() {
        return this.dfoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfoAnoUltMod(BigDecimal dfoAnoUltMod) {
        this.dfoAnoUltMod = dfoAnoUltMod;
    }

    public BigDecimal getDfoAnoUltMod() {
        return this.dfoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfoMesUltMod(BigDecimal dfoMesUltMod) {
        this.dfoMesUltMod = dfoMesUltMod;
    }

    public BigDecimal getDfoMesUltMod() {
        return this.dfoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfoDiaUltMod(BigDecimal dfoDiaUltMod) {
        this.dfoDiaUltMod = dfoDiaUltMod;
    }

    public BigDecimal getDfoDiaUltMod() {
        return this.dfoDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDfoCveStDetfoseg(String dfoCveStDetfoseg) {
        this.dfoCveStDetfoseg = dfoCveStDetfoseg;
    }

    public String getDfoCveStDetfoseg() {
        return this.dfoCveStDetfoseg;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DETFOSEG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDfoFolioOpera() != null && this.getDfoFolioOpera().longValue() == -999) {
            conditions += " AND DFO_FOLIO_OPERA IS NULL";
        } else if (this.getDfoFolioOpera() != null) {
            conditions += " AND DFO_FOLIO_OPERA = ?";
            values.add(this.getDfoFolioOpera());
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
        String sql = "SELECT * FROM DETFOSEG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDfoFolioOpera() != null && this.getDfoFolioOpera().longValue() == -999) {
            conditions += " AND DFO_FOLIO_OPERA IS NULL";
        } else if (this.getDfoFolioOpera() != null) {
            conditions += " AND DFO_FOLIO_OPERA = ?";
            values.add(this.getDfoFolioOpera());
        }

        if (this.getDfoContrato1() != null && this.getDfoContrato1().longValue() == -999) {
            conditions += " AND DFO_CONTRATO1 IS NULL";
        } else if (this.getDfoContrato1() != null) {
            conditions += " AND DFO_CONTRATO1 = ?";
            values.add(this.getDfoContrato1());
        }

        if (this.getDfoImporte1() != null && this.getDfoImporte1().longValue() == -999) {
            conditions += " AND DFO_IMPORTE1 IS NULL";
        } else if (this.getDfoImporte1() != null) {
            conditions += " AND DFO_IMPORTE1 = ?";
            values.add(this.getDfoImporte1());
        }

        if (this.getDfoContrato2() != null && this.getDfoContrato2().longValue() == -999) {
            conditions += " AND DFO_CONTRATO2 IS NULL";
        } else if (this.getDfoContrato2() != null) {
            conditions += " AND DFO_CONTRATO2 = ?";
            values.add(this.getDfoContrato2());
        }

        if (this.getDfoImporte2() != null && this.getDfoImporte2().longValue() == -999) {
            conditions += " AND DFO_IMPORTE2 IS NULL";
        } else if (this.getDfoImporte2() != null) {
            conditions += " AND DFO_IMPORTE2 = ?";
            values.add(this.getDfoImporte2());
        }

        if (this.getDfoContrato3() != null && this.getDfoContrato3().longValue() == -999) {
            conditions += " AND DFO_CONTRATO3 IS NULL";
        } else if (this.getDfoContrato3() != null) {
            conditions += " AND DFO_CONTRATO3 = ?";
            values.add(this.getDfoContrato3());
        }

        if (this.getDfoImporte3() != null && this.getDfoImporte3().longValue() == -999) {
            conditions += " AND DFO_IMPORTE3 IS NULL";
        } else if (this.getDfoImporte3() != null) {
            conditions += " AND DFO_IMPORTE3 = ?";
            values.add(this.getDfoImporte3());
        }

        if (this.getDfoTipocambio() != null && this.getDfoTipocambio().longValue() == -999) {
            conditions += " AND DFO_TIPOCAMBIO IS NULL";
        } else if (this.getDfoTipocambio() != null) {
            conditions += " AND DFO_TIPOCAMBIO = ?";
            values.add(this.getDfoTipocambio());
        }

        if (this.getDfoAnoAltaReg() != null && this.getDfoAnoAltaReg().longValue() == -999) {
            conditions += " AND DFO_ANO_ALTA_REG IS NULL";
        } else if (this.getDfoAnoAltaReg() != null) {
            conditions += " AND DFO_ANO_ALTA_REG = ?";
            values.add(this.getDfoAnoAltaReg());
        }

        if (this.getDfoMesAltaReg() != null && this.getDfoMesAltaReg().longValue() == -999) {
            conditions += " AND DFO_MES_ALTA_REG IS NULL";
        } else if (this.getDfoMesAltaReg() != null) {
            conditions += " AND DFO_MES_ALTA_REG = ?";
            values.add(this.getDfoMesAltaReg());
        }

        if (this.getDfoDiaAltaReg() != null && this.getDfoDiaAltaReg().longValue() == -999) {
            conditions += " AND DFO_DIA_ALTA_REG IS NULL";
        } else if (this.getDfoDiaAltaReg() != null) {
            conditions += " AND DFO_DIA_ALTA_REG = ?";
            values.add(this.getDfoDiaAltaReg());
        }

        if (this.getDfoAnoUltMod() != null && this.getDfoAnoUltMod().longValue() == -999) {
            conditions += " AND DFO_ANO_ULT_MOD IS NULL";
        } else if (this.getDfoAnoUltMod() != null) {
            conditions += " AND DFO_ANO_ULT_MOD = ?";
            values.add(this.getDfoAnoUltMod());
        }

        if (this.getDfoMesUltMod() != null && this.getDfoMesUltMod().longValue() == -999) {
            conditions += " AND DFO_MES_ULT_MOD IS NULL";
        } else if (this.getDfoMesUltMod() != null) {
            conditions += " AND DFO_MES_ULT_MOD = ?";
            values.add(this.getDfoMesUltMod());
        }

        if (this.getDfoDiaUltMod() != null && this.getDfoDiaUltMod().longValue() == -999) {
            conditions += " AND DFO_DIA_ULT_MOD IS NULL";
        } else if (this.getDfoDiaUltMod() != null) {
            conditions += " AND DFO_DIA_ULT_MOD = ?";
            values.add(this.getDfoDiaUltMod());
        }

        if (this.getDfoCveStDetfoseg() != null && "null".equals(this.getDfoCveStDetfoseg())) {
            conditions += " AND DFO_CVE_ST_DETFOSEG IS NULL";
        } else if (this.getDfoCveStDetfoseg() != null) {
            conditions += " AND DFO_CVE_ST_DETFOSEG = ?";
            values.add(this.getDfoCveStDetfoseg());
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
        String sql = "UPDATE DETFOSEG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DFO_FOLIO_OPERA = ?";
        pkValues.add(this.getDfoFolioOpera());
        fields += " DFO_CONTRATO1 = ?, ";
        values.add(this.getDfoContrato1());
        fields += " DFO_IMPORTE1 = ?, ";
        values.add(this.getDfoImporte1());
        fields += " DFO_CONTRATO2 = ?, ";
        values.add(this.getDfoContrato2());
        fields += " DFO_IMPORTE2 = ?, ";
        values.add(this.getDfoImporte2());
        fields += " DFO_CONTRATO3 = ?, ";
        values.add(this.getDfoContrato3());
        fields += " DFO_IMPORTE3 = ?, ";
        values.add(this.getDfoImporte3());
        fields += " DFO_TIPOCAMBIO = ?, ";
        values.add(this.getDfoTipocambio());
        fields += " DFO_ANO_ALTA_REG = ?, ";
        values.add(this.getDfoAnoAltaReg());
        fields += " DFO_MES_ALTA_REG = ?, ";
        values.add(this.getDfoMesAltaReg());
        fields += " DFO_DIA_ALTA_REG = ?, ";
        values.add(this.getDfoDiaAltaReg());
        fields += " DFO_ANO_ULT_MOD = ?, ";
        values.add(this.getDfoAnoUltMod());
        fields += " DFO_MES_ULT_MOD = ?, ";
        values.add(this.getDfoMesUltMod());
        fields += " DFO_DIA_ULT_MOD = ?, ";
        values.add(this.getDfoDiaUltMod());
        fields += " DFO_CVE_ST_DETFOSEG = ?, ";
        values.add(this.getDfoCveStDetfoseg());
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
        String sql = "INSERT INTO DETFOSEG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DFO_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDfoFolioOpera());

        fields += ", DFO_CONTRATO1";
        fieldValues += ", ?";
        values.add(this.getDfoContrato1());

        fields += ", DFO_IMPORTE1";
        fieldValues += ", ?";
        values.add(this.getDfoImporte1());

        fields += ", DFO_CONTRATO2";
        fieldValues += ", ?";
        values.add(this.getDfoContrato2());

        fields += ", DFO_IMPORTE2";
        fieldValues += ", ?";
        values.add(this.getDfoImporte2());

        fields += ", DFO_CONTRATO3";
        fieldValues += ", ?";
        values.add(this.getDfoContrato3());

        fields += ", DFO_IMPORTE3";
        fieldValues += ", ?";
        values.add(this.getDfoImporte3());

        fields += ", DFO_TIPOCAMBIO";
        fieldValues += ", ?";
        values.add(this.getDfoTipocambio());

        fields += ", DFO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfoAnoAltaReg());

        fields += ", DFO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfoMesAltaReg());

        fields += ", DFO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfoDiaAltaReg());

        fields += ", DFO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfoAnoUltMod());

        fields += ", DFO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfoMesUltMod());

        fields += ", DFO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfoDiaUltMod());

        fields += ", DFO_CVE_ST_DETFOSEG";
        fieldValues += ", ?";
        values.add(this.getDfoCveStDetfoseg());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DETFOSEG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DFO_FOLIO_OPERA = ?";
        values.add(this.getDfoFolioOpera());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Detfoseg instance = (Detfoseg) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDfoFolioOpera().equals(instance.getDfoFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDfoContrato1().equals(instance.getDfoContrato1()))
            equalObjects = false;
        if (equalObjects && !this.getDfoImporte1().equals(instance.getDfoImporte1()))
            equalObjects = false;
        if (equalObjects && !this.getDfoContrato2().equals(instance.getDfoContrato2()))
            equalObjects = false;
        if (equalObjects && !this.getDfoImporte2().equals(instance.getDfoImporte2()))
            equalObjects = false;
        if (equalObjects && !this.getDfoContrato3().equals(instance.getDfoContrato3()))
            equalObjects = false;
        if (equalObjects && !this.getDfoImporte3().equals(instance.getDfoImporte3()))
            equalObjects = false;
        if (equalObjects && !this.getDfoTipocambio().equals(instance.getDfoTipocambio()))
            equalObjects = false;
        if (equalObjects && !this.getDfoAnoAltaReg().equals(instance.getDfoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfoMesAltaReg().equals(instance.getDfoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfoDiaAltaReg().equals(instance.getDfoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfoAnoUltMod().equals(instance.getDfoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfoMesUltMod().equals(instance.getDfoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfoDiaUltMod().equals(instance.getDfoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfoCveStDetfoseg().equals(instance.getDfoCveStDetfoseg()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Detfoseg result = new Detfoseg();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDfoFolioOpera((BigDecimal) objectData.getData("DFO_FOLIO_OPERA"));
        result.setDfoContrato1((BigDecimal) objectData.getData("DFO_CONTRATO1"));
        result.setDfoImporte1((BigDecimal) objectData.getData("DFO_IMPORTE1"));
        result.setDfoContrato2((BigDecimal) objectData.getData("DFO_CONTRATO2"));
        result.setDfoImporte2((BigDecimal) objectData.getData("DFO_IMPORTE2"));
        result.setDfoContrato3((BigDecimal) objectData.getData("DFO_CONTRATO3"));
        result.setDfoImporte3((BigDecimal) objectData.getData("DFO_IMPORTE3"));
        result.setDfoTipocambio((BigDecimal) objectData.getData("DFO_TIPOCAMBIO"));
        result.setDfoAnoAltaReg((BigDecimal) objectData.getData("DFO_ANO_ALTA_REG"));
        result.setDfoMesAltaReg((BigDecimal) objectData.getData("DFO_MES_ALTA_REG"));
        result.setDfoDiaAltaReg((BigDecimal) objectData.getData("DFO_DIA_ALTA_REG"));
        result.setDfoAnoUltMod((BigDecimal) objectData.getData("DFO_ANO_ULT_MOD"));
        result.setDfoMesUltMod((BigDecimal) objectData.getData("DFO_MES_ULT_MOD"));
        result.setDfoDiaUltMod((BigDecimal) objectData.getData("DFO_DIA_ULT_MOD"));
        result.setDfoCveStDetfoseg((String) objectData.getData("DFO_CVE_ST_DETFOSEG"));

        return result;

    }

}
