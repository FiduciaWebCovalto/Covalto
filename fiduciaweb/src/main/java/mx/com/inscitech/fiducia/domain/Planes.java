package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PLANES_PK", columns = { "PLA_CVE_FASE_PROD" }, sequences = { "MAX" })
public class Planes extends DomainObject {

    String plaCveFaseProd = null;
    String plaDescFaseProd = null;
    String plaCvePerAplica = null;
    BigDecimal plaCveChControl = null;
    BigDecimal plaAnoAplicacion = null;
    BigDecimal plaMesAplicacion = null;
    BigDecimal plaDiaAplicacion = null;
    BigDecimal plaHoraAplica = null;
    BigDecimal plaAnoAltaReg = null;
    BigDecimal plaMesAltaReg = null;
    BigDecimal plaDiaAltaReg = null;
    BigDecimal plaAnoUltMod = null;
    BigDecimal plaMesUltMod = null;
    BigDecimal plaDiaUltMod = null;
    String plaCveStPlan = null;

    public Planes() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlaCveFaseProd(String plaCveFaseProd) {
        this.plaCveFaseProd = plaCveFaseProd;
    }

    public String getPlaCveFaseProd() {
        return this.plaCveFaseProd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlaDescFaseProd(String plaDescFaseProd) {
        this.plaDescFaseProd = plaDescFaseProd;
    }

    public String getPlaDescFaseProd() {
        return this.plaDescFaseProd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlaCvePerAplica(String plaCvePerAplica) {
        this.plaCvePerAplica = plaCvePerAplica;
    }

    public String getPlaCvePerAplica() {
        return this.plaCvePerAplica;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlaCveChControl(BigDecimal plaCveChControl) {
        this.plaCveChControl = plaCveChControl;
    }

    public BigDecimal getPlaCveChControl() {
        return this.plaCveChControl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlaAnoAplicacion(BigDecimal plaAnoAplicacion) {
        this.plaAnoAplicacion = plaAnoAplicacion;
    }

    public BigDecimal getPlaAnoAplicacion() {
        return this.plaAnoAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlaMesAplicacion(BigDecimal plaMesAplicacion) {
        this.plaMesAplicacion = plaMesAplicacion;
    }

    public BigDecimal getPlaMesAplicacion() {
        return this.plaMesAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlaDiaAplicacion(BigDecimal plaDiaAplicacion) {
        this.plaDiaAplicacion = plaDiaAplicacion;
    }

    public BigDecimal getPlaDiaAplicacion() {
        return this.plaDiaAplicacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlaHoraAplica(BigDecimal plaHoraAplica) {
        this.plaHoraAplica = plaHoraAplica;
    }

    public BigDecimal getPlaHoraAplica() {
        return this.plaHoraAplica;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlaAnoAltaReg(BigDecimal plaAnoAltaReg) {
        this.plaAnoAltaReg = plaAnoAltaReg;
    }

    public BigDecimal getPlaAnoAltaReg() {
        return this.plaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlaMesAltaReg(BigDecimal plaMesAltaReg) {
        this.plaMesAltaReg = plaMesAltaReg;
    }

    public BigDecimal getPlaMesAltaReg() {
        return this.plaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlaDiaAltaReg(BigDecimal plaDiaAltaReg) {
        this.plaDiaAltaReg = plaDiaAltaReg;
    }

    public BigDecimal getPlaDiaAltaReg() {
        return this.plaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlaAnoUltMod(BigDecimal plaAnoUltMod) {
        this.plaAnoUltMod = plaAnoUltMod;
    }

    public BigDecimal getPlaAnoUltMod() {
        return this.plaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlaMesUltMod(BigDecimal plaMesUltMod) {
        this.plaMesUltMod = plaMesUltMod;
    }

    public BigDecimal getPlaMesUltMod() {
        return this.plaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlaDiaUltMod(BigDecimal plaDiaUltMod) {
        this.plaDiaUltMod = plaDiaUltMod;
    }

    public BigDecimal getPlaDiaUltMod() {
        return this.plaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlaCveStPlan(String plaCveStPlan) {
        this.plaCveStPlan = plaCveStPlan;
    }

    public String getPlaCveStPlan() {
        return this.plaCveStPlan;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PLANES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPlaCveFaseProd() != null && "null".equals(this.getPlaCveFaseProd())) {
            conditions += " AND PLA_CVE_FASE_PROD IS NULL";
        } else if (this.getPlaCveFaseProd() != null) {
            conditions += " AND PLA_CVE_FASE_PROD = ?";
            values.add(this.getPlaCveFaseProd());
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
        String sql = "SELECT * FROM PLANES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPlaCveFaseProd() != null && "null".equals(this.getPlaCveFaseProd())) {
            conditions += " AND PLA_CVE_FASE_PROD IS NULL";
        } else if (this.getPlaCveFaseProd() != null) {
            conditions += " AND PLA_CVE_FASE_PROD = ?";
            values.add(this.getPlaCveFaseProd());
        }

        if (this.getPlaDescFaseProd() != null && "null".equals(this.getPlaDescFaseProd())) {
            conditions += " AND PLA_DESC_FASE_PROD IS NULL";
        } else if (this.getPlaDescFaseProd() != null) {
            conditions += " AND PLA_DESC_FASE_PROD = ?";
            values.add(this.getPlaDescFaseProd());
        }

        if (this.getPlaCvePerAplica() != null && "null".equals(this.getPlaCvePerAplica())) {
            conditions += " AND PLA_CVE_PER_APLICA IS NULL";
        } else if (this.getPlaCvePerAplica() != null) {
            conditions += " AND PLA_CVE_PER_APLICA = ?";
            values.add(this.getPlaCvePerAplica());
        }

        if (this.getPlaCveChControl() != null && this.getPlaCveChControl().longValue() == -999) {
            conditions += " AND PLA_CVE_CH_CONTROL IS NULL";
        } else if (this.getPlaCveChControl() != null) {
            conditions += " AND PLA_CVE_CH_CONTROL = ?";
            values.add(this.getPlaCveChControl());
        }

        if (this.getPlaAnoAplicacion() != null && this.getPlaAnoAplicacion().longValue() == -999) {
            conditions += " AND PLA_ANO_APLICACION IS NULL";
        } else if (this.getPlaAnoAplicacion() != null) {
            conditions += " AND PLA_ANO_APLICACION = ?";
            values.add(this.getPlaAnoAplicacion());
        }

        if (this.getPlaMesAplicacion() != null && this.getPlaMesAplicacion().longValue() == -999) {
            conditions += " AND PLA_MES_APLICACION IS NULL";
        } else if (this.getPlaMesAplicacion() != null) {
            conditions += " AND PLA_MES_APLICACION = ?";
            values.add(this.getPlaMesAplicacion());
        }

        if (this.getPlaDiaAplicacion() != null && this.getPlaDiaAplicacion().longValue() == -999) {
            conditions += " AND PLA_DIA_APLICACION IS NULL";
        } else if (this.getPlaDiaAplicacion() != null) {
            conditions += " AND PLA_DIA_APLICACION = ?";
            values.add(this.getPlaDiaAplicacion());
        }

        if (this.getPlaHoraAplica() != null && this.getPlaHoraAplica().longValue() == -999) {
            conditions += " AND PLA_HORA_APLICA IS NULL";
        } else if (this.getPlaHoraAplica() != null) {
            conditions += " AND PLA_HORA_APLICA = ?";
            values.add(this.getPlaHoraAplica());
        }

        if (this.getPlaAnoAltaReg() != null && this.getPlaAnoAltaReg().longValue() == -999) {
            conditions += " AND PLA_ANO_ALTA_REG IS NULL";
        } else if (this.getPlaAnoAltaReg() != null) {
            conditions += " AND PLA_ANO_ALTA_REG = ?";
            values.add(this.getPlaAnoAltaReg());
        }

        if (this.getPlaMesAltaReg() != null && this.getPlaMesAltaReg().longValue() == -999) {
            conditions += " AND PLA_MES_ALTA_REG IS NULL";
        } else if (this.getPlaMesAltaReg() != null) {
            conditions += " AND PLA_MES_ALTA_REG = ?";
            values.add(this.getPlaMesAltaReg());
        }

        if (this.getPlaDiaAltaReg() != null && this.getPlaDiaAltaReg().longValue() == -999) {
            conditions += " AND PLA_DIA_ALTA_REG IS NULL";
        } else if (this.getPlaDiaAltaReg() != null) {
            conditions += " AND PLA_DIA_ALTA_REG = ?";
            values.add(this.getPlaDiaAltaReg());
        }

        if (this.getPlaAnoUltMod() != null && this.getPlaAnoUltMod().longValue() == -999) {
            conditions += " AND PLA_ANO_ULT_MOD IS NULL";
        } else if (this.getPlaAnoUltMod() != null) {
            conditions += " AND PLA_ANO_ULT_MOD = ?";
            values.add(this.getPlaAnoUltMod());
        }

        if (this.getPlaMesUltMod() != null && this.getPlaMesUltMod().longValue() == -999) {
            conditions += " AND PLA_MES_ULT_MOD IS NULL";
        } else if (this.getPlaMesUltMod() != null) {
            conditions += " AND PLA_MES_ULT_MOD = ?";
            values.add(this.getPlaMesUltMod());
        }

        if (this.getPlaDiaUltMod() != null && this.getPlaDiaUltMod().longValue() == -999) {
            conditions += " AND PLA_DIA_ULT_MOD IS NULL";
        } else if (this.getPlaDiaUltMod() != null) {
            conditions += " AND PLA_DIA_ULT_MOD = ?";
            values.add(this.getPlaDiaUltMod());
        }

        if (this.getPlaCveStPlan() != null && "null".equals(this.getPlaCveStPlan())) {
            conditions += " AND PLA_CVE_ST_PLAN IS NULL";
        } else if (this.getPlaCveStPlan() != null) {
            conditions += " AND PLA_CVE_ST_PLAN = ?";
            values.add(this.getPlaCveStPlan());
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
        String sql = "UPDATE PLANES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PLA_CVE_FASE_PROD = ?";
        pkValues.add(this.getPlaCveFaseProd());
        fields += " PLA_DESC_FASE_PROD = ?, ";
        values.add(this.getPlaDescFaseProd());
        fields += " PLA_CVE_PER_APLICA = ?, ";
        values.add(this.getPlaCvePerAplica());
        fields += " PLA_CVE_CH_CONTROL = ?, ";
        values.add(this.getPlaCveChControl());
        fields += " PLA_ANO_APLICACION = ?, ";
        values.add(this.getPlaAnoAplicacion());
        fields += " PLA_MES_APLICACION = ?, ";
        values.add(this.getPlaMesAplicacion());
        fields += " PLA_DIA_APLICACION = ?, ";
        values.add(this.getPlaDiaAplicacion());
        fields += " PLA_HORA_APLICA = ?, ";
        values.add(this.getPlaHoraAplica());
        fields += " PLA_ANO_ALTA_REG = ?, ";
        values.add(this.getPlaAnoAltaReg());
        fields += " PLA_MES_ALTA_REG = ?, ";
        values.add(this.getPlaMesAltaReg());
        fields += " PLA_DIA_ALTA_REG = ?, ";
        values.add(this.getPlaDiaAltaReg());
        fields += " PLA_ANO_ULT_MOD = ?, ";
        values.add(this.getPlaAnoUltMod());
        fields += " PLA_MES_ULT_MOD = ?, ";
        values.add(this.getPlaMesUltMod());
        fields += " PLA_DIA_ULT_MOD = ?, ";
        values.add(this.getPlaDiaUltMod());
        fields += " PLA_CVE_ST_PLAN = ?, ";
        values.add(this.getPlaCveStPlan());
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
        String sql = "INSERT INTO PLANES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PLA_CVE_FASE_PROD";
        fieldValues += ", ?";
        values.add(this.getPlaCveFaseProd());

        fields += ", PLA_DESC_FASE_PROD";
        fieldValues += ", ?";
        values.add(this.getPlaDescFaseProd());

        fields += ", PLA_CVE_PER_APLICA";
        fieldValues += ", ?";
        values.add(this.getPlaCvePerAplica());

        fields += ", PLA_CVE_CH_CONTROL";
        fieldValues += ", ?";
        values.add(this.getPlaCveChControl());

        fields += ", PLA_ANO_APLICACION";
        fieldValues += ", ?";
        values.add(this.getPlaAnoAplicacion());

        fields += ", PLA_MES_APLICACION";
        fieldValues += ", ?";
        values.add(this.getPlaMesAplicacion());

        fields += ", PLA_DIA_APLICACION";
        fieldValues += ", ?";
        values.add(this.getPlaDiaAplicacion());

        fields += ", PLA_HORA_APLICA";
        fieldValues += ", ?";
        values.add(this.getPlaHoraAplica());

        fields += ", PLA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlaAnoAltaReg());

        fields += ", PLA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlaMesAltaReg());

        fields += ", PLA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlaDiaAltaReg());

        fields += ", PLA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlaAnoUltMod());

        fields += ", PLA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlaMesUltMod());

        fields += ", PLA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlaDiaUltMod());

        fields += ", PLA_CVE_ST_PLAN";
        fieldValues += ", ?";
        values.add(this.getPlaCveStPlan());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PLANES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PLA_CVE_FASE_PROD = ?";
        values.add(this.getPlaCveFaseProd());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Planes instance = (Planes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPlaCveFaseProd().equals(instance.getPlaCveFaseProd()))
            equalObjects = false;
        if (equalObjects && !this.getPlaDescFaseProd().equals(instance.getPlaDescFaseProd()))
            equalObjects = false;
        if (equalObjects && !this.getPlaCvePerAplica().equals(instance.getPlaCvePerAplica()))
            equalObjects = false;
        if (equalObjects && !this.getPlaCveChControl().equals(instance.getPlaCveChControl()))
            equalObjects = false;
        if (equalObjects && !this.getPlaAnoAplicacion().equals(instance.getPlaAnoAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPlaMesAplicacion().equals(instance.getPlaMesAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPlaDiaAplicacion().equals(instance.getPlaDiaAplicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPlaHoraAplica().equals(instance.getPlaHoraAplica()))
            equalObjects = false;
        if (equalObjects && !this.getPlaAnoAltaReg().equals(instance.getPlaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlaMesAltaReg().equals(instance.getPlaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlaDiaAltaReg().equals(instance.getPlaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlaAnoUltMod().equals(instance.getPlaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlaMesUltMod().equals(instance.getPlaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlaDiaUltMod().equals(instance.getPlaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlaCveStPlan().equals(instance.getPlaCveStPlan()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Planes result = new Planes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPlaCveFaseProd((String) objectData.getData("PLA_CVE_FASE_PROD"));
        result.setPlaDescFaseProd((String) objectData.getData("PLA_DESC_FASE_PROD"));
        result.setPlaCvePerAplica((String) objectData.getData("PLA_CVE_PER_APLICA"));
        result.setPlaCveChControl((BigDecimal) objectData.getData("PLA_CVE_CH_CONTROL"));
        result.setPlaAnoAplicacion((BigDecimal) objectData.getData("PLA_ANO_APLICACION"));
        result.setPlaMesAplicacion((BigDecimal) objectData.getData("PLA_MES_APLICACION"));
        result.setPlaDiaAplicacion((BigDecimal) objectData.getData("PLA_DIA_APLICACION"));
        result.setPlaHoraAplica((BigDecimal) objectData.getData("PLA_HORA_APLICA"));
        result.setPlaAnoAltaReg((BigDecimal) objectData.getData("PLA_ANO_ALTA_REG"));
        result.setPlaMesAltaReg((BigDecimal) objectData.getData("PLA_MES_ALTA_REG"));
        result.setPlaDiaAltaReg((BigDecimal) objectData.getData("PLA_DIA_ALTA_REG"));
        result.setPlaAnoUltMod((BigDecimal) objectData.getData("PLA_ANO_ULT_MOD"));
        result.setPlaMesUltMod((BigDecimal) objectData.getData("PLA_MES_ULT_MOD"));
        result.setPlaDiaUltMod((BigDecimal) objectData.getData("PLA_DIA_ULT_MOD"));
        result.setPlaCveStPlan((String) objectData.getData("PLA_CVE_ST_PLAN"));

        return result;

    }

}
