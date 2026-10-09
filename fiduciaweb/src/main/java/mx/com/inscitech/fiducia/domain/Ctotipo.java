package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTOTIPO_PK", columns = { "CTP_NUM_CTO_TIPO", "CTP_CVE_TIPO_CTOT" }, sequences = { "MANUAL" })
public class Ctotipo extends DomainObject {

    BigDecimal ctpNumCtoTipo = null;
    String ctpCveTipoCtot = null;
    String ctpNomTipoCtot = null;
    Long ctpTxtCtoTipo = null;
    String ctpDescEmpleo = null;
    BigDecimal ctpAnoElabora = null;
    BigDecimal ctpMesElabora = null;
    BigDecimal ctpDiaElabora = null;
    BigDecimal ctpAnoAltaReg = null;
    BigDecimal ctpMesAltaReg = null;
    BigDecimal ctpDiaAltaReg = null;
    BigDecimal ctpAnoUltMod = null;
    BigDecimal ctpMesUltMod = null;
    BigDecimal ctpDiaUltMod = null;
    String ctpCveStCtotipo = null;

    public Ctotipo() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 38, scale = 0, javaClass = BigDecimal.class)
    public void setCtpNumCtoTipo(BigDecimal ctpNumCtoTipo) {
        this.ctpNumCtoTipo = ctpNumCtoTipo;
    }

    public BigDecimal getCtpNumCtoTipo() {
        return this.ctpNumCtoTipo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtpCveTipoCtot(String ctpCveTipoCtot) {
        this.ctpCveTipoCtot = ctpCveTipoCtot;
    }

    public String getCtpCveTipoCtot() {
        return this.ctpCveTipoCtot;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtpNomTipoCtot(String ctpNomTipoCtot) {
        this.ctpNomTipoCtot = ctpNomTipoCtot;
    }

    public String getCtpNomTipoCtot() {
        return this.ctpNomTipoCtot;
    }

    @FieldInfo(nullable = false, dataType = "LONG", javaClass = Long.class)
    public void setCtpTxtCtoTipo(Long ctpTxtCtoTipo) {
        this.ctpTxtCtoTipo = ctpTxtCtoTipo;
    }

    public Long getCtpTxtCtoTipo() {
        return this.ctpTxtCtoTipo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtpDescEmpleo(String ctpDescEmpleo) {
        this.ctpDescEmpleo = ctpDescEmpleo;
    }

    public String getCtpDescEmpleo() {
        return this.ctpDescEmpleo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtpAnoElabora(BigDecimal ctpAnoElabora) {
        this.ctpAnoElabora = ctpAnoElabora;
    }

    public BigDecimal getCtpAnoElabora() {
        return this.ctpAnoElabora;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtpMesElabora(BigDecimal ctpMesElabora) {
        this.ctpMesElabora = ctpMesElabora;
    }

    public BigDecimal getCtpMesElabora() {
        return this.ctpMesElabora;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtpDiaElabora(BigDecimal ctpDiaElabora) {
        this.ctpDiaElabora = ctpDiaElabora;
    }

    public BigDecimal getCtpDiaElabora() {
        return this.ctpDiaElabora;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtpAnoAltaReg(BigDecimal ctpAnoAltaReg) {
        this.ctpAnoAltaReg = ctpAnoAltaReg;
    }

    public BigDecimal getCtpAnoAltaReg() {
        return this.ctpAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtpMesAltaReg(BigDecimal ctpMesAltaReg) {
        this.ctpMesAltaReg = ctpMesAltaReg;
    }

    public BigDecimal getCtpMesAltaReg() {
        return this.ctpMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtpDiaAltaReg(BigDecimal ctpDiaAltaReg) {
        this.ctpDiaAltaReg = ctpDiaAltaReg;
    }

    public BigDecimal getCtpDiaAltaReg() {
        return this.ctpDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtpAnoUltMod(BigDecimal ctpAnoUltMod) {
        this.ctpAnoUltMod = ctpAnoUltMod;
    }

    public BigDecimal getCtpAnoUltMod() {
        return this.ctpAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtpMesUltMod(BigDecimal ctpMesUltMod) {
        this.ctpMesUltMod = ctpMesUltMod;
    }

    public BigDecimal getCtpMesUltMod() {
        return this.ctpMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtpDiaUltMod(BigDecimal ctpDiaUltMod) {
        this.ctpDiaUltMod = ctpDiaUltMod;
    }

    public BigDecimal getCtpDiaUltMod() {
        return this.ctpDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtpCveStCtotipo(String ctpCveStCtotipo) {
        this.ctpCveStCtotipo = ctpCveStCtotipo;
    }

    public String getCtpCveStCtotipo() {
        return this.ctpCveStCtotipo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTOTIPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtpNumCtoTipo() != null && this.getCtpNumCtoTipo().longValue() == -999) {
            conditions += " AND CTP_NUM_CTO_TIPO IS NULL";
        } else if (this.getCtpNumCtoTipo() != null) {
            conditions += " AND CTP_NUM_CTO_TIPO = ?";
            values.add(this.getCtpNumCtoTipo());
        }

        if (this.getCtpCveTipoCtot() != null && "null".equals(this.getCtpCveTipoCtot())) {
            conditions += " AND CTP_CVE_TIPO_CTOT IS NULL";
        } else if (this.getCtpCveTipoCtot() != null) {
            conditions += " AND CTP_CVE_TIPO_CTOT = ?";
            values.add(this.getCtpCveTipoCtot());
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
        String sql = "SELECT * FROM CTOTIPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtpNumCtoTipo() != null && this.getCtpNumCtoTipo().longValue() == -999) {
            conditions += " AND CTP_NUM_CTO_TIPO IS NULL";
        } else if (this.getCtpNumCtoTipo() != null) {
            conditions += " AND CTP_NUM_CTO_TIPO = ?";
            values.add(this.getCtpNumCtoTipo());
        }

        if (this.getCtpCveTipoCtot() != null && "null".equals(this.getCtpCveTipoCtot())) {
            conditions += " AND CTP_CVE_TIPO_CTOT IS NULL";
        } else if (this.getCtpCveTipoCtot() != null) {
            conditions += " AND CTP_CVE_TIPO_CTOT = ?";
            values.add(this.getCtpCveTipoCtot());
        }

        if (this.getCtpNomTipoCtot() != null && "null".equals(this.getCtpNomTipoCtot())) {
            conditions += " AND CTP_NOM_TIPO_CTOT IS NULL";
        } else if (this.getCtpNomTipoCtot() != null) {
            conditions += " AND CTP_NOM_TIPO_CTOT = ?";
            values.add(this.getCtpNomTipoCtot());
        }

        if (this.getCtpTxtCtoTipo() != null && this.getCtpTxtCtoTipo() == -999) {
            conditions += " AND CTP_TXT_CTO_TIPO IS NULL";
        } else if (this.getCtpTxtCtoTipo() != null) {
            conditions += " AND CTP_TXT_CTO_TIPO = ?";
            values.add(this.getCtpTxtCtoTipo());
        }

        if (this.getCtpDescEmpleo() != null && "null".equals(this.getCtpDescEmpleo())) {
            conditions += " AND CTP_DESC_EMPLEO IS NULL";
        } else if (this.getCtpDescEmpleo() != null) {
            conditions += " AND CTP_DESC_EMPLEO = ?";
            values.add(this.getCtpDescEmpleo());
        }

        if (this.getCtpAnoElabora() != null && this.getCtpAnoElabora().longValue() == -999) {
            conditions += " AND CTP_ANO_ELABORA IS NULL";
        } else if (this.getCtpAnoElabora() != null) {
            conditions += " AND CTP_ANO_ELABORA = ?";
            values.add(this.getCtpAnoElabora());
        }

        if (this.getCtpMesElabora() != null && this.getCtpMesElabora().longValue() == -999) {
            conditions += " AND CTP_MES_ELABORA IS NULL";
        } else if (this.getCtpMesElabora() != null) {
            conditions += " AND CTP_MES_ELABORA = ?";
            values.add(this.getCtpMesElabora());
        }

        if (this.getCtpDiaElabora() != null && this.getCtpDiaElabora().longValue() == -999) {
            conditions += " AND CTP_DIA_ELABORA IS NULL";
        } else if (this.getCtpDiaElabora() != null) {
            conditions += " AND CTP_DIA_ELABORA = ?";
            values.add(this.getCtpDiaElabora());
        }

        if (this.getCtpAnoAltaReg() != null && this.getCtpAnoAltaReg().longValue() == -999) {
            conditions += " AND CTP_ANO_ALTA_REG IS NULL";
        } else if (this.getCtpAnoAltaReg() != null) {
            conditions += " AND CTP_ANO_ALTA_REG = ?";
            values.add(this.getCtpAnoAltaReg());
        }

        if (this.getCtpMesAltaReg() != null && this.getCtpMesAltaReg().longValue() == -999) {
            conditions += " AND CTP_MES_ALTA_REG IS NULL";
        } else if (this.getCtpMesAltaReg() != null) {
            conditions += " AND CTP_MES_ALTA_REG = ?";
            values.add(this.getCtpMesAltaReg());
        }

        if (this.getCtpDiaAltaReg() != null && this.getCtpDiaAltaReg().longValue() == -999) {
            conditions += " AND CTP_DIA_ALTA_REG IS NULL";
        } else if (this.getCtpDiaAltaReg() != null) {
            conditions += " AND CTP_DIA_ALTA_REG = ?";
            values.add(this.getCtpDiaAltaReg());
        }

        if (this.getCtpAnoUltMod() != null && this.getCtpAnoUltMod().longValue() == -999) {
            conditions += " AND CTP_ANO_ULT_MOD IS NULL";
        } else if (this.getCtpAnoUltMod() != null) {
            conditions += " AND CTP_ANO_ULT_MOD = ?";
            values.add(this.getCtpAnoUltMod());
        }

        if (this.getCtpMesUltMod() != null && this.getCtpMesUltMod().longValue() == -999) {
            conditions += " AND CTP_MES_ULT_MOD IS NULL";
        } else if (this.getCtpMesUltMod() != null) {
            conditions += " AND CTP_MES_ULT_MOD = ?";
            values.add(this.getCtpMesUltMod());
        }

        if (this.getCtpDiaUltMod() != null && this.getCtpDiaUltMod().longValue() == -999) {
            conditions += " AND CTP_DIA_ULT_MOD IS NULL";
        } else if (this.getCtpDiaUltMod() != null) {
            conditions += " AND CTP_DIA_ULT_MOD = ?";
            values.add(this.getCtpDiaUltMod());
        }

        if (this.getCtpCveStCtotipo() != null && "null".equals(this.getCtpCveStCtotipo())) {
            conditions += " AND CTP_CVE_ST_CTOTIPO IS NULL";
        } else if (this.getCtpCveStCtotipo() != null) {
            conditions += " AND CTP_CVE_ST_CTOTIPO = ?";
            values.add(this.getCtpCveStCtotipo());
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
        String sql = "UPDATE CTOTIPO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTP_NUM_CTO_TIPO = ?";
        pkValues.add(this.getCtpNumCtoTipo());
        conditions += " AND CTP_CVE_TIPO_CTOT = ?";
        pkValues.add(this.getCtpCveTipoCtot());
        fields += " CTP_NOM_TIPO_CTOT = ?, ";
        values.add(this.getCtpNomTipoCtot());
        fields += " CTP_TXT_CTO_TIPO = ?, ";
        values.add(this.getCtpTxtCtoTipo());
        fields += " CTP_DESC_EMPLEO = ?, ";
        values.add(this.getCtpDescEmpleo());
        fields += " CTP_ANO_ELABORA = ?, ";
        values.add(this.getCtpAnoElabora());
        fields += " CTP_MES_ELABORA = ?, ";
        values.add(this.getCtpMesElabora());
        fields += " CTP_DIA_ELABORA = ?, ";
        values.add(this.getCtpDiaElabora());
        fields += " CTP_ANO_ALTA_REG = ?, ";
        values.add(this.getCtpAnoAltaReg());
        fields += " CTP_MES_ALTA_REG = ?, ";
        values.add(this.getCtpMesAltaReg());
        fields += " CTP_DIA_ALTA_REG = ?, ";
        values.add(this.getCtpDiaAltaReg());
        fields += " CTP_ANO_ULT_MOD = ?, ";
        values.add(this.getCtpAnoUltMod());
        fields += " CTP_MES_ULT_MOD = ?, ";
        values.add(this.getCtpMesUltMod());
        fields += " CTP_DIA_ULT_MOD = ?, ";
        values.add(this.getCtpDiaUltMod());
        fields += " CTP_CVE_ST_CTOTIPO = ?, ";
        values.add(this.getCtpCveStCtotipo());
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
        String sql = "INSERT INTO CTOTIPO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTP_NUM_CTO_TIPO";
        fieldValues += ", ?";
        values.add(this.getCtpNumCtoTipo());

        fields += ", CTP_CVE_TIPO_CTOT";
        fieldValues += ", ?";
        values.add(this.getCtpCveTipoCtot());

        fields += ", CTP_NOM_TIPO_CTOT";
        fieldValues += ", ?";
        values.add(this.getCtpNomTipoCtot());

        fields += ", CTP_TXT_CTO_TIPO";
        fieldValues += ", ?";
        values.add(this.getCtpTxtCtoTipo());

        fields += ", CTP_DESC_EMPLEO";
        fieldValues += ", ?";
        values.add(this.getCtpDescEmpleo());

        fields += ", CTP_ANO_ELABORA";
        fieldValues += ", ?";
        values.add(this.getCtpAnoElabora());

        fields += ", CTP_MES_ELABORA";
        fieldValues += ", ?";
        values.add(this.getCtpMesElabora());

        fields += ", CTP_DIA_ELABORA";
        fieldValues += ", ?";
        values.add(this.getCtpDiaElabora());

        fields += ", CTP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtpAnoAltaReg());

        fields += ", CTP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtpMesAltaReg());

        fields += ", CTP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtpDiaAltaReg());

        fields += ", CTP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtpAnoUltMod());

        fields += ", CTP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtpMesUltMod());

        fields += ", CTP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtpDiaUltMod());

        fields += ", CTP_CVE_ST_CTOTIPO";
        fieldValues += ", ?";
        values.add(this.getCtpCveStCtotipo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTOTIPO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTP_NUM_CTO_TIPO = ?";
        values.add(this.getCtpNumCtoTipo());
        conditions += " AND CTP_CVE_TIPO_CTOT = ?";
        values.add(this.getCtpCveTipoCtot());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctotipo instance = (Ctotipo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtpNumCtoTipo().equals(instance.getCtpNumCtoTipo()))
            equalObjects = false;
        if (equalObjects && !this.getCtpCveTipoCtot().equals(instance.getCtpCveTipoCtot()))
            equalObjects = false;
        if (equalObjects && !this.getCtpNomTipoCtot().equals(instance.getCtpNomTipoCtot()))
            equalObjects = false;
        if (equalObjects && !this.getCtpTxtCtoTipo().equals(instance.getCtpTxtCtoTipo()))
            equalObjects = false;
        if (equalObjects && !this.getCtpDescEmpleo().equals(instance.getCtpDescEmpleo()))
            equalObjects = false;
        if (equalObjects && !this.getCtpAnoElabora().equals(instance.getCtpAnoElabora()))
            equalObjects = false;
        if (equalObjects && !this.getCtpMesElabora().equals(instance.getCtpMesElabora()))
            equalObjects = false;
        if (equalObjects && !this.getCtpDiaElabora().equals(instance.getCtpDiaElabora()))
            equalObjects = false;
        if (equalObjects && !this.getCtpAnoAltaReg().equals(instance.getCtpAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtpMesAltaReg().equals(instance.getCtpMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtpDiaAltaReg().equals(instance.getCtpDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtpAnoUltMod().equals(instance.getCtpAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtpMesUltMod().equals(instance.getCtpMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtpDiaUltMod().equals(instance.getCtpDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtpCveStCtotipo().equals(instance.getCtpCveStCtotipo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctotipo result = new Ctotipo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtpNumCtoTipo((BigDecimal) objectData.getData("CTP_NUM_CTO_TIPO"));
        result.setCtpCveTipoCtot((String) objectData.getData("CTP_CVE_TIPO_CTOT"));
        result.setCtpNomTipoCtot((String) objectData.getData("CTP_NOM_TIPO_CTOT"));
        result.setCtpTxtCtoTipo((Long) objectData.getData("CTP_TXT_CTO_TIPO"));
        result.setCtpDescEmpleo((String) objectData.getData("CTP_DESC_EMPLEO"));
        result.setCtpAnoElabora((BigDecimal) objectData.getData("CTP_ANO_ELABORA"));
        result.setCtpMesElabora((BigDecimal) objectData.getData("CTP_MES_ELABORA"));
        result.setCtpDiaElabora((BigDecimal) objectData.getData("CTP_DIA_ELABORA"));
        result.setCtpAnoAltaReg((BigDecimal) objectData.getData("CTP_ANO_ALTA_REG"));
        result.setCtpMesAltaReg((BigDecimal) objectData.getData("CTP_MES_ALTA_REG"));
        result.setCtpDiaAltaReg((BigDecimal) objectData.getData("CTP_DIA_ALTA_REG"));
        result.setCtpAnoUltMod((BigDecimal) objectData.getData("CTP_ANO_ULT_MOD"));
        result.setCtpMesUltMod((BigDecimal) objectData.getData("CTP_MES_ULT_MOD"));
        result.setCtpDiaUltMod((BigDecimal) objectData.getData("CTP_DIA_ULT_MOD"));
        result.setCtpCveStCtotipo((String) objectData.getData("CTP_CVE_ST_CTOTIPO"));

        return result;

    }

}
