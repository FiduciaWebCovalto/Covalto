package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTLPLAN_PK", columns = { "CPL_CVE_CONTROL_PL", "CPL_CVE_FASE_PROD" }, sequences = { "MANUAL" })
public class Ctlplan extends DomainObject {

    String cplCveControlPl = null;
    String cplCveFaseProd = null;
    String cplCvePerAplica = null;
    BigDecimal cplAnoAplicacion = null;
    BigDecimal cplMesAplicacion = null;
    BigDecimal cplDiaAplicacion = null;
    String cplHrAplicacion = null;
    BigDecimal cplAnoAltaReg = null;
    BigDecimal cplMesAltaReg = null;
    BigDecimal cplDiaAltaReg = null;
    BigDecimal cplAnoUltMod = null;
    BigDecimal cplMesUltMod = null;
    BigDecimal cplDiaUltMod = null;
    String cplCveStCtlplan = null;

    public Ctlplan() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCplCveControlPl(String cplCveControlPl) {
        this.cplCveControlPl = cplCveControlPl;
    }

    public String getCplCveControlPl() {
        return this.cplCveControlPl;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCplCveFaseProd(String cplCveFaseProd) {
        this.cplCveFaseProd = cplCveFaseProd;
    }

    public String getCplCveFaseProd() {
        return this.cplCveFaseProd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCplCvePerAplica(String cplCvePerAplica) {
        this.cplCvePerAplica = cplCvePerAplica;
    }

    public String getCplCvePerAplica() {
        return this.cplCvePerAplica;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCplAnoAplicacion(BigDecimal cplAnoAplicacion) {
        this.cplAnoAplicacion = cplAnoAplicacion;
    }

    public BigDecimal getCplAnoAplicacion() {
        return this.cplAnoAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCplMesAplicacion(BigDecimal cplMesAplicacion) {
        this.cplMesAplicacion = cplMesAplicacion;
    }

    public BigDecimal getCplMesAplicacion() {
        return this.cplMesAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCplDiaAplicacion(BigDecimal cplDiaAplicacion) {
        this.cplDiaAplicacion = cplDiaAplicacion;
    }

    public BigDecimal getCplDiaAplicacion() {
        return this.cplDiaAplicacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCplHrAplicacion(String cplHrAplicacion) {
        this.cplHrAplicacion = cplHrAplicacion;
    }

    public String getCplHrAplicacion() {
        return this.cplHrAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCplAnoAltaReg(BigDecimal cplAnoAltaReg) {
        this.cplAnoAltaReg = cplAnoAltaReg;
    }

    public BigDecimal getCplAnoAltaReg() {
        return this.cplAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCplMesAltaReg(BigDecimal cplMesAltaReg) {
        this.cplMesAltaReg = cplMesAltaReg;
    }

    public BigDecimal getCplMesAltaReg() {
        return this.cplMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCplDiaAltaReg(BigDecimal cplDiaAltaReg) {
        this.cplDiaAltaReg = cplDiaAltaReg;
    }

    public BigDecimal getCplDiaAltaReg() {
        return this.cplDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCplAnoUltMod(BigDecimal cplAnoUltMod) {
        this.cplAnoUltMod = cplAnoUltMod;
    }

    public BigDecimal getCplAnoUltMod() {
        return this.cplAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCplMesUltMod(BigDecimal cplMesUltMod) {
        this.cplMesUltMod = cplMesUltMod;
    }

    public BigDecimal getCplMesUltMod() {
        return this.cplMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCplDiaUltMod(BigDecimal cplDiaUltMod) {
        this.cplDiaUltMod = cplDiaUltMod;
    }

    public BigDecimal getCplDiaUltMod() {
        return this.cplDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCplCveStCtlplan(String cplCveStCtlplan) {
        this.cplCveStCtlplan = cplCveStCtlplan;
    }

    public String getCplCveStCtlplan() {
        return this.cplCveStCtlplan;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTLPLAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCplCveControlPl() != null && "null".equals(this.getCplCveControlPl())) {
            conditions += " AND CPL_CVE_CONTROL_PL IS NULL";
        } else if (this.getCplCveControlPl() != null) {
            conditions += " AND CPL_CVE_CONTROL_PL = ?";
            values.add(this.getCplCveControlPl());
        }

        if (this.getCplCveFaseProd() != null && "null".equals(this.getCplCveFaseProd())) {
            conditions += " AND CPL_CVE_FASE_PROD IS NULL";
        } else if (this.getCplCveFaseProd() != null) {
            conditions += " AND CPL_CVE_FASE_PROD = ?";
            values.add(this.getCplCveFaseProd());
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
        String sql = "SELECT * FROM CTLPLAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCplCveControlPl() != null && "null".equals(this.getCplCveControlPl())) {
            conditions += " AND CPL_CVE_CONTROL_PL IS NULL";
        } else if (this.getCplCveControlPl() != null) {
            conditions += " AND CPL_CVE_CONTROL_PL = ?";
            values.add(this.getCplCveControlPl());
        }

        if (this.getCplCveFaseProd() != null && "null".equals(this.getCplCveFaseProd())) {
            conditions += " AND CPL_CVE_FASE_PROD IS NULL";
        } else if (this.getCplCveFaseProd() != null) {
            conditions += " AND CPL_CVE_FASE_PROD = ?";
            values.add(this.getCplCveFaseProd());
        }

        if (this.getCplCvePerAplica() != null && "null".equals(this.getCplCvePerAplica())) {
            conditions += " AND CPL_CVE_PER_APLICA IS NULL";
        } else if (this.getCplCvePerAplica() != null) {
            conditions += " AND CPL_CVE_PER_APLICA = ?";
            values.add(this.getCplCvePerAplica());
        }

        if (this.getCplAnoAplicacion() != null && this.getCplAnoAplicacion().longValue() == -999) {
            conditions += " AND CPL_ANO_APLICACION IS NULL";
        } else if (this.getCplAnoAplicacion() != null) {
            conditions += " AND CPL_ANO_APLICACION = ?";
            values.add(this.getCplAnoAplicacion());
        }

        if (this.getCplMesAplicacion() != null && this.getCplMesAplicacion().longValue() == -999) {
            conditions += " AND CPL_MES_APLICACION IS NULL";
        } else if (this.getCplMesAplicacion() != null) {
            conditions += " AND CPL_MES_APLICACION = ?";
            values.add(this.getCplMesAplicacion());
        }

        if (this.getCplDiaAplicacion() != null && this.getCplDiaAplicacion().longValue() == -999) {
            conditions += " AND CPL_DIA_APLICACION IS NULL";
        } else if (this.getCplDiaAplicacion() != null) {
            conditions += " AND CPL_DIA_APLICACION = ?";
            values.add(this.getCplDiaAplicacion());
        }

        if (this.getCplHrAplicacion() != null && "null".equals(this.getCplHrAplicacion())) {
            conditions += " AND CPL_HR_APLICACION IS NULL";
        } else if (this.getCplHrAplicacion() != null) {
            conditions += " AND CPL_HR_APLICACION = ?";
            values.add(this.getCplHrAplicacion());
        }

        if (this.getCplAnoAltaReg() != null && this.getCplAnoAltaReg().longValue() == -999) {
            conditions += " AND CPL_ANO_ALTA_REG IS NULL";
        } else if (this.getCplAnoAltaReg() != null) {
            conditions += " AND CPL_ANO_ALTA_REG = ?";
            values.add(this.getCplAnoAltaReg());
        }

        if (this.getCplMesAltaReg() != null && this.getCplMesAltaReg().longValue() == -999) {
            conditions += " AND CPL_MES_ALTA_REG IS NULL";
        } else if (this.getCplMesAltaReg() != null) {
            conditions += " AND CPL_MES_ALTA_REG = ?";
            values.add(this.getCplMesAltaReg());
        }

        if (this.getCplDiaAltaReg() != null && this.getCplDiaAltaReg().longValue() == -999) {
            conditions += " AND CPL_DIA_ALTA_REG IS NULL";
        } else if (this.getCplDiaAltaReg() != null) {
            conditions += " AND CPL_DIA_ALTA_REG = ?";
            values.add(this.getCplDiaAltaReg());
        }

        if (this.getCplAnoUltMod() != null && this.getCplAnoUltMod().longValue() == -999) {
            conditions += " AND CPL_ANO_ULT_MOD IS NULL";
        } else if (this.getCplAnoUltMod() != null) {
            conditions += " AND CPL_ANO_ULT_MOD = ?";
            values.add(this.getCplAnoUltMod());
        }

        if (this.getCplMesUltMod() != null && this.getCplMesUltMod().longValue() == -999) {
            conditions += " AND CPL_MES_ULT_MOD IS NULL";
        } else if (this.getCplMesUltMod() != null) {
            conditions += " AND CPL_MES_ULT_MOD = ?";
            values.add(this.getCplMesUltMod());
        }

        if (this.getCplDiaUltMod() != null && this.getCplDiaUltMod().longValue() == -999) {
            conditions += " AND CPL_DIA_ULT_MOD IS NULL";
        } else if (this.getCplDiaUltMod() != null) {
            conditions += " AND CPL_DIA_ULT_MOD = ?";
            values.add(this.getCplDiaUltMod());
        }

        if (this.getCplCveStCtlplan() != null && "null".equals(this.getCplCveStCtlplan())) {
            conditions += " AND CPL_CVE_ST_CTLPLAN IS NULL";
        } else if (this.getCplCveStCtlplan() != null) {
            conditions += " AND CPL_CVE_ST_CTLPLAN = ?";
            values.add(this.getCplCveStCtlplan());
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
        String sql = "UPDATE CTLPLAN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPL_CVE_CONTROL_PL = ?";
        pkValues.add(this.getCplCveControlPl());
        conditions += " AND CPL_CVE_FASE_PROD = ?";
        pkValues.add(this.getCplCveFaseProd());
        fields += " CPL_CVE_PER_APLICA = ?, ";
        values.add(this.getCplCvePerAplica());
        fields += " CPL_ANO_APLICACION = ?, ";
        values.add(this.getCplAnoAplicacion());
        fields += " CPL_MES_APLICACION = ?, ";
        values.add(this.getCplMesAplicacion());
        fields += " CPL_DIA_APLICACION = ?, ";
        values.add(this.getCplDiaAplicacion());
        fields += " CPL_HR_APLICACION = ?, ";
        values.add(this.getCplHrAplicacion());
        fields += " CPL_ANO_ALTA_REG = ?, ";
        values.add(this.getCplAnoAltaReg());
        fields += " CPL_MES_ALTA_REG = ?, ";
        values.add(this.getCplMesAltaReg());
        fields += " CPL_DIA_ALTA_REG = ?, ";
        values.add(this.getCplDiaAltaReg());
        fields += " CPL_ANO_ULT_MOD = ?, ";
        values.add(this.getCplAnoUltMod());
        fields += " CPL_MES_ULT_MOD = ?, ";
        values.add(this.getCplMesUltMod());
        fields += " CPL_DIA_ULT_MOD = ?, ";
        values.add(this.getCplDiaUltMod());
        fields += " CPL_CVE_ST_CTLPLAN = ?, ";
        values.add(this.getCplCveStCtlplan());
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
        String sql = "INSERT INTO CTLPLAN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPL_CVE_CONTROL_PL";
        fieldValues += ", ?";
        values.add(this.getCplCveControlPl());

        fields += ", CPL_CVE_FASE_PROD";
        fieldValues += ", ?";
        values.add(this.getCplCveFaseProd());

        fields += ", CPL_CVE_PER_APLICA";
        fieldValues += ", ?";
        values.add(this.getCplCvePerAplica());

        fields += ", CPL_ANO_APLICACION";
        fieldValues += ", ?";
        values.add(this.getCplAnoAplicacion());

        fields += ", CPL_MES_APLICACION";
        fieldValues += ", ?";
        values.add(this.getCplMesAplicacion());

        fields += ", CPL_DIA_APLICACION";
        fieldValues += ", ?";
        values.add(this.getCplDiaAplicacion());

        fields += ", CPL_HR_APLICACION";
        fieldValues += ", ?";
        values.add(this.getCplHrAplicacion());

        fields += ", CPL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCplAnoAltaReg());

        fields += ", CPL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCplMesAltaReg());

        fields += ", CPL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCplDiaAltaReg());

        fields += ", CPL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCplAnoUltMod());

        fields += ", CPL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCplMesUltMod());

        fields += ", CPL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCplDiaUltMod());

        fields += ", CPL_CVE_ST_CTLPLAN";
        fieldValues += ", ?";
        values.add(this.getCplCveStCtlplan());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTLPLAN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPL_CVE_CONTROL_PL = ?";
        values.add(this.getCplCveControlPl());
        conditions += " AND CPL_CVE_FASE_PROD = ?";
        values.add(this.getCplCveFaseProd());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctlplan instance = (Ctlplan) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCplCveControlPl().equals(instance.getCplCveControlPl()))
            equalObjects = false;
        if (equalObjects && !this.getCplCveFaseProd().equals(instance.getCplCveFaseProd()))
            equalObjects = false;
        if (equalObjects && !this.getCplCvePerAplica().equals(instance.getCplCvePerAplica()))
            equalObjects = false;
        if (equalObjects && !this.getCplAnoAplicacion().equals(instance.getCplAnoAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getCplMesAplicacion().equals(instance.getCplMesAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getCplDiaAplicacion().equals(instance.getCplDiaAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getCplHrAplicacion().equals(instance.getCplHrAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getCplAnoAltaReg().equals(instance.getCplAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCplMesAltaReg().equals(instance.getCplMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCplDiaAltaReg().equals(instance.getCplDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCplAnoUltMod().equals(instance.getCplAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCplMesUltMod().equals(instance.getCplMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCplDiaUltMod().equals(instance.getCplDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCplCveStCtlplan().equals(instance.getCplCveStCtlplan()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctlplan result = new Ctlplan();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCplCveControlPl((String) objectData.getData("CPL_CVE_CONTROL_PL"));
        result.setCplCveFaseProd((String) objectData.getData("CPL_CVE_FASE_PROD"));
        result.setCplCvePerAplica((String) objectData.getData("CPL_CVE_PER_APLICA"));
        result.setCplAnoAplicacion((BigDecimal) objectData.getData("CPL_ANO_APLICACION"));
        result.setCplMesAplicacion((BigDecimal) objectData.getData("CPL_MES_APLICACION"));
        result.setCplDiaAplicacion((BigDecimal) objectData.getData("CPL_DIA_APLICACION"));
        result.setCplHrAplicacion((String) objectData.getData("CPL_HR_APLICACION"));
        result.setCplAnoAltaReg((BigDecimal) objectData.getData("CPL_ANO_ALTA_REG"));
        result.setCplMesAltaReg((BigDecimal) objectData.getData("CPL_MES_ALTA_REG"));
        result.setCplDiaAltaReg((BigDecimal) objectData.getData("CPL_DIA_ALTA_REG"));
        result.setCplAnoUltMod((BigDecimal) objectData.getData("CPL_ANO_ULT_MOD"));
        result.setCplMesUltMod((BigDecimal) objectData.getData("CPL_MES_ULT_MOD"));
        result.setCplDiaUltMod((BigDecimal) objectData.getData("CPL_DIA_ULT_MOD"));
        result.setCplCveStCtlplan((String) objectData.getData("CPL_CVE_ST_CTLPLAN"));

        return result;

    }

}
