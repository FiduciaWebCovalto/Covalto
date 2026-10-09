package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FERIADOS_PK", columns = { "FER_FEC_MES", "FER_FEC_DIA", "FER_FEC_ANO", "FER_NUM_PAIS" }, sequences = { "MANUAL" })
public class Feriados extends DomainObject {

    BigDecimal ferNumPais = null;
    BigDecimal ferFecMes = null;
    BigDecimal ferFecDia = null;
    String ferDescDiaFer = null;
    BigDecimal ferAnoAltaReg = null;
    BigDecimal ferMesAltaReg = null;
    BigDecimal ferDiaAltaReg = null;
    BigDecimal ferAnoUltMod = null;
    BigDecimal ferMesUltMod = null;
    BigDecimal ferDiaUltMod = null;
    String ferCveStFeriado = null;
    BigDecimal ferFecAno = null;

    public Feriados() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFerNumPais(BigDecimal ferNumPais) {
        this.ferNumPais = ferNumPais;
    }

    public BigDecimal getFerNumPais() {
        return this.ferNumPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFerFecMes(BigDecimal ferFecMes) {
        this.ferFecMes = ferFecMes;
    }

    public BigDecimal getFerFecMes() {
        return this.ferFecMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFerFecDia(BigDecimal ferFecDia) {
        this.ferFecDia = ferFecDia;
    }

    public BigDecimal getFerFecDia() {
        return this.ferFecDia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFerDescDiaFer(String ferDescDiaFer) {
        this.ferDescDiaFer = ferDescDiaFer;
    }

    public String getFerDescDiaFer() {
        return this.ferDescDiaFer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFerAnoAltaReg(BigDecimal ferAnoAltaReg) {
        this.ferAnoAltaReg = ferAnoAltaReg;
    }

    public BigDecimal getFerAnoAltaReg() {
        return this.ferAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFerMesAltaReg(BigDecimal ferMesAltaReg) {
        this.ferMesAltaReg = ferMesAltaReg;
    }

    public BigDecimal getFerMesAltaReg() {
        return this.ferMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFerDiaAltaReg(BigDecimal ferDiaAltaReg) {
        this.ferDiaAltaReg = ferDiaAltaReg;
    }

    public BigDecimal getFerDiaAltaReg() {
        return this.ferDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFerAnoUltMod(BigDecimal ferAnoUltMod) {
        this.ferAnoUltMod = ferAnoUltMod;
    }

    public BigDecimal getFerAnoUltMod() {
        return this.ferAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFerMesUltMod(BigDecimal ferMesUltMod) {
        this.ferMesUltMod = ferMesUltMod;
    }

    public BigDecimal getFerMesUltMod() {
        return this.ferMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFerDiaUltMod(BigDecimal ferDiaUltMod) {
        this.ferDiaUltMod = ferDiaUltMod;
    }

    public BigDecimal getFerDiaUltMod() {
        return this.ferDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFerCveStFeriado(String ferCveStFeriado) {
        this.ferCveStFeriado = ferCveStFeriado;
    }

    public String getFerCveStFeriado() {
        return this.ferCveStFeriado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFerFecAno(BigDecimal ferFecAno) {
        this.ferFecAno = ferFecAno;
    }

    public BigDecimal getFerFecAno() {
        return this.ferFecAno;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FERIADOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFerNumPais() != null && this.getFerNumPais().longValue() == -999) {
            conditions += " AND FER_NUM_PAIS IS NULL";
        } else if (this.getFerNumPais() != null) {
            conditions += " AND FER_NUM_PAIS = ?";
            values.add(this.getFerNumPais());
        }

        if (this.getFerFecMes() != null && this.getFerFecMes().longValue() == -999) {
            conditions += " AND FER_FEC_MES IS NULL";
        } else if (this.getFerFecMes() != null) {
            conditions += " AND FER_FEC_MES = ?";
            values.add(this.getFerFecMes());
        }

        if (this.getFerFecDia() != null && this.getFerFecDia().longValue() == -999) {
            conditions += " AND FER_FEC_DIA IS NULL";
        } else if (this.getFerFecDia() != null) {
            conditions += " AND FER_FEC_DIA = ?";
            values.add(this.getFerFecDia());
        }

        if (this.getFerFecAno() != null && this.getFerFecAno().longValue() == -999) {
            conditions += " AND FER_FEC_ANO IS NULL";
        } else if (this.getFerFecAno() != null) {
            conditions += " AND FER_FEC_ANO = ?";
            values.add(this.getFerFecAno());
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
        String sql = "SELECT * FROM FERIADOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFerNumPais() != null && this.getFerNumPais().longValue() == -999) {
            conditions += " AND FER_NUM_PAIS IS NULL";
        } else if (this.getFerNumPais() != null) {
            conditions += " AND FER_NUM_PAIS = ?";
            values.add(this.getFerNumPais());
        }

        if (this.getFerFecMes() != null && this.getFerFecMes().longValue() == -999) {
            conditions += " AND FER_FEC_MES IS NULL";
        } else if (this.getFerFecMes() != null) {
            conditions += " AND FER_FEC_MES = ?";
            values.add(this.getFerFecMes());
        }

        if (this.getFerFecDia() != null && this.getFerFecDia().longValue() == -999) {
            conditions += " AND FER_FEC_DIA IS NULL";
        } else if (this.getFerFecDia() != null) {
            conditions += " AND FER_FEC_DIA = ?";
            values.add(this.getFerFecDia());
        }

        if (this.getFerDescDiaFer() != null && "null".equals(this.getFerDescDiaFer())) {
            conditions += " AND FER_DESC_DIA_FER IS NULL";
        } else if (this.getFerDescDiaFer() != null) {
            conditions += " AND FER_DESC_DIA_FER = ?";
            values.add(this.getFerDescDiaFer());
        }

        if (this.getFerAnoAltaReg() != null && this.getFerAnoAltaReg().longValue() == -999) {
            conditions += " AND FER_ANO_ALTA_REG IS NULL";
        } else if (this.getFerAnoAltaReg() != null) {
            conditions += " AND FER_ANO_ALTA_REG = ?";
            values.add(this.getFerAnoAltaReg());
        }

        if (this.getFerMesAltaReg() != null && this.getFerMesAltaReg().longValue() == -999) {
            conditions += " AND FER_MES_ALTA_REG IS NULL";
        } else if (this.getFerMesAltaReg() != null) {
            conditions += " AND FER_MES_ALTA_REG = ?";
            values.add(this.getFerMesAltaReg());
        }

        if (this.getFerDiaAltaReg() != null && this.getFerDiaAltaReg().longValue() == -999) {
            conditions += " AND FER_DIA_ALTA_REG IS NULL";
        } else if (this.getFerDiaAltaReg() != null) {
            conditions += " AND FER_DIA_ALTA_REG = ?";
            values.add(this.getFerDiaAltaReg());
        }

        if (this.getFerAnoUltMod() != null && this.getFerAnoUltMod().longValue() == -999) {
            conditions += " AND FER_ANO_ULT_MOD IS NULL";
        } else if (this.getFerAnoUltMod() != null) {
            conditions += " AND FER_ANO_ULT_MOD = ?";
            values.add(this.getFerAnoUltMod());
        }

        if (this.getFerMesUltMod() != null && this.getFerMesUltMod().longValue() == -999) {
            conditions += " AND FER_MES_ULT_MOD IS NULL";
        } else if (this.getFerMesUltMod() != null) {
            conditions += " AND FER_MES_ULT_MOD = ?";
            values.add(this.getFerMesUltMod());
        }

        if (this.getFerDiaUltMod() != null && this.getFerDiaUltMod().longValue() == -999) {
            conditions += " AND FER_DIA_ULT_MOD IS NULL";
        } else if (this.getFerDiaUltMod() != null) {
            conditions += " AND FER_DIA_ULT_MOD = ?";
            values.add(this.getFerDiaUltMod());
        }

        if (this.getFerCveStFeriado() != null && "null".equals(this.getFerCveStFeriado())) {
            conditions += " AND FER_CVE_ST_FERIADO IS NULL";
        } else if (this.getFerCveStFeriado() != null) {
            conditions += " AND FER_CVE_ST_FERIADO = ?";
            values.add(this.getFerCveStFeriado());
        }

        if (this.getFerFecAno() != null && this.getFerFecAno().longValue() == -999) {
            conditions += " AND FER_FEC_ANO IS NULL";
        } else if (this.getFerFecAno() != null) {
            conditions += " AND FER_FEC_ANO = ?";
            values.add(this.getFerFecAno());
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
        String sql = "UPDATE FERIADOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FER_NUM_PAIS = ?";
        pkValues.add(this.getFerNumPais());
        conditions += " AND FER_FEC_MES = ?";
        pkValues.add(this.getFerFecMes());
        conditions += " AND FER_FEC_DIA = ?";
        pkValues.add(this.getFerFecDia());
        fields += " FER_DESC_DIA_FER = ?, ";
        values.add(this.getFerDescDiaFer());
        fields += " FER_ANO_ALTA_REG = ?, ";
        values.add(this.getFerAnoAltaReg());
        fields += " FER_MES_ALTA_REG = ?, ";
        values.add(this.getFerMesAltaReg());
        fields += " FER_DIA_ALTA_REG = ?, ";
        values.add(this.getFerDiaAltaReg());
        fields += " FER_ANO_ULT_MOD = ?, ";
        values.add(this.getFerAnoUltMod());
        fields += " FER_MES_ULT_MOD = ?, ";
        values.add(this.getFerMesUltMod());
        fields += " FER_DIA_ULT_MOD = ?, ";
        values.add(this.getFerDiaUltMod());
        fields += " FER_CVE_ST_FERIADO = ?, ";
        values.add(this.getFerCveStFeriado());
        conditions += " AND FER_FEC_ANO = ?";
        pkValues.add(this.getFerFecAno());
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
        String sql = "INSERT INTO FERIADOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FER_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getFerNumPais());

        fields += ", FER_FEC_MES";
        fieldValues += ", ?";
        values.add(this.getFerFecMes());

        fields += ", FER_FEC_DIA";
        fieldValues += ", ?";
        values.add(this.getFerFecDia());

        fields += ", FER_DESC_DIA_FER";
        fieldValues += ", ?";
        values.add(this.getFerDescDiaFer());

        fields += ", FER_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFerAnoAltaReg());

        fields += ", FER_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFerMesAltaReg());

        fields += ", FER_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFerDiaAltaReg());

        fields += ", FER_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFerAnoUltMod());

        fields += ", FER_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFerMesUltMod());

        fields += ", FER_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFerDiaUltMod());

        fields += ", FER_CVE_ST_FERIADO";
        fieldValues += ", ?";
        values.add(this.getFerCveStFeriado());

        fields += ", FER_FEC_ANO";
        fieldValues += ", ?";
        values.add(this.getFerFecAno());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FERIADOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FER_NUM_PAIS = ?";
        values.add(this.getFerNumPais());
        conditions += " AND FER_FEC_MES = ?";
        values.add(this.getFerFecMes());
        conditions += " AND FER_FEC_DIA = ?";
        values.add(this.getFerFecDia());
        conditions += " AND FER_FEC_ANO = ?";
        values.add(this.getFerFecAno());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Feriados instance = (Feriados) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFerNumPais().equals(instance.getFerNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getFerFecMes().equals(instance.getFerFecMes()))
            equalObjects = false;
        if (equalObjects && !this.getFerFecDia().equals(instance.getFerFecDia()))
            equalObjects = false;
        if (equalObjects && !this.getFerDescDiaFer().equals(instance.getFerDescDiaFer()))
            equalObjects = false;
        if (equalObjects && !this.getFerAnoAltaReg().equals(instance.getFerAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFerMesAltaReg().equals(instance.getFerMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFerDiaAltaReg().equals(instance.getFerDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFerAnoUltMod().equals(instance.getFerAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFerMesUltMod().equals(instance.getFerMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFerDiaUltMod().equals(instance.getFerDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFerCveStFeriado().equals(instance.getFerCveStFeriado()))
            equalObjects = false;
        if (equalObjects && !this.getFerFecAno().equals(instance.getFerFecAno()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Feriados result = new Feriados();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFerNumPais((BigDecimal) objectData.getData("FER_NUM_PAIS"));
        result.setFerFecMes((BigDecimal) objectData.getData("FER_FEC_MES"));
        result.setFerFecDia((BigDecimal) objectData.getData("FER_FEC_DIA"));
        result.setFerDescDiaFer((String) objectData.getData("FER_DESC_DIA_FER"));
        result.setFerAnoAltaReg((BigDecimal) objectData.getData("FER_ANO_ALTA_REG"));
        result.setFerMesAltaReg((BigDecimal) objectData.getData("FER_MES_ALTA_REG"));
        result.setFerDiaAltaReg((BigDecimal) objectData.getData("FER_DIA_ALTA_REG"));
        result.setFerAnoUltMod((BigDecimal) objectData.getData("FER_ANO_ULT_MOD"));
        result.setFerMesUltMod((BigDecimal) objectData.getData("FER_MES_ULT_MOD"));
        result.setFerDiaUltMod((BigDecimal) objectData.getData("FER_DIA_ULT_MOD"));
        result.setFerCveStFeriado((String) objectData.getData("FER_CVE_ST_FERIADO"));
        result.setFerFecAno((BigDecimal) objectData.getData("FER_FEC_ANO"));

        return result;

    }

}
