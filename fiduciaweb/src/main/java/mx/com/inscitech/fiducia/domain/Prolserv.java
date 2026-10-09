package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PROLSERV_PK", columns = { "PLS_NUM_SERVICIO", "PLS_NUM_PRODUCTO" }, sequences = { "MANUAL" })
public class Prolserv extends DomainObject {

    BigDecimal plsNumProducto = null;
    BigDecimal plsNumServicio = null;
    String plsNomServicio = null;
    String plsDescServicio = null;
    BigDecimal plsTarifaServ = null;
    BigDecimal plsAnoAltaReg = null;
    BigDecimal plsMesAltaReg = null;
    BigDecimal plsDiaAltaReg = null;
    BigDecimal plsAnoUltMod = null;
    BigDecimal plsMesUltMod = null;
    BigDecimal plsDiaUltMod = null;
    String plsCveStProlser = null;

    public Prolserv() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlsNumProducto(BigDecimal plsNumProducto) {
        this.plsNumProducto = plsNumProducto;
    }

    public BigDecimal getPlsNumProducto() {
        return this.plsNumProducto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlsNumServicio(BigDecimal plsNumServicio) {
        this.plsNumServicio = plsNumServicio;
    }

    public BigDecimal getPlsNumServicio() {
        return this.plsNumServicio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlsNomServicio(String plsNomServicio) {
        this.plsNomServicio = plsNomServicio;
    }

    public String getPlsNomServicio() {
        return this.plsNomServicio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlsDescServicio(String plsDescServicio) {
        this.plsDescServicio = plsDescServicio;
    }

    public String getPlsDescServicio() {
        return this.plsDescServicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPlsTarifaServ(BigDecimal plsTarifaServ) {
        this.plsTarifaServ = plsTarifaServ;
    }

    public BigDecimal getPlsTarifaServ() {
        return this.plsTarifaServ;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlsAnoAltaReg(BigDecimal plsAnoAltaReg) {
        this.plsAnoAltaReg = plsAnoAltaReg;
    }

    public BigDecimal getPlsAnoAltaReg() {
        return this.plsAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlsMesAltaReg(BigDecimal plsMesAltaReg) {
        this.plsMesAltaReg = plsMesAltaReg;
    }

    public BigDecimal getPlsMesAltaReg() {
        return this.plsMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlsDiaAltaReg(BigDecimal plsDiaAltaReg) {
        this.plsDiaAltaReg = plsDiaAltaReg;
    }

    public BigDecimal getPlsDiaAltaReg() {
        return this.plsDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlsAnoUltMod(BigDecimal plsAnoUltMod) {
        this.plsAnoUltMod = plsAnoUltMod;
    }

    public BigDecimal getPlsAnoUltMod() {
        return this.plsAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlsMesUltMod(BigDecimal plsMesUltMod) {
        this.plsMesUltMod = plsMesUltMod;
    }

    public BigDecimal getPlsMesUltMod() {
        return this.plsMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlsDiaUltMod(BigDecimal plsDiaUltMod) {
        this.plsDiaUltMod = plsDiaUltMod;
    }

    public BigDecimal getPlsDiaUltMod() {
        return this.plsDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlsCveStProlser(String plsCveStProlser) {
        this.plsCveStProlser = plsCveStProlser;
    }

    public String getPlsCveStProlser() {
        return this.plsCveStProlser;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PROLSERV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPlsNumProducto() != null && this.getPlsNumProducto().longValue() == -999) {
            conditions += " AND PLS_NUM_PRODUCTO IS NULL";
        } else if (this.getPlsNumProducto() != null) {
            conditions += " AND PLS_NUM_PRODUCTO = ?";
            values.add(this.getPlsNumProducto());
        }

        if (this.getPlsNumServicio() != null && this.getPlsNumServicio().longValue() == -999) {
            conditions += " AND PLS_NUM_SERVICIO IS NULL";
        } else if (this.getPlsNumServicio() != null) {
            conditions += " AND PLS_NUM_SERVICIO = ?";
            values.add(this.getPlsNumServicio());
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
        String sql = "SELECT * FROM PROLSERV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPlsNumProducto() != null && this.getPlsNumProducto().longValue() == -999) {
            conditions += " AND PLS_NUM_PRODUCTO IS NULL";
        } else if (this.getPlsNumProducto() != null) {
            conditions += " AND PLS_NUM_PRODUCTO = ?";
            values.add(this.getPlsNumProducto());
        }

        if (this.getPlsNumServicio() != null && this.getPlsNumServicio().longValue() == -999) {
            conditions += " AND PLS_NUM_SERVICIO IS NULL";
        } else if (this.getPlsNumServicio() != null) {
            conditions += " AND PLS_NUM_SERVICIO = ?";
            values.add(this.getPlsNumServicio());
        }

        if (this.getPlsNomServicio() != null && "null".equals(this.getPlsNomServicio())) {
            conditions += " AND PLS_NOM_SERVICIO IS NULL";
        } else if (this.getPlsNomServicio() != null) {
            conditions += " AND PLS_NOM_SERVICIO = ?";
            values.add(this.getPlsNomServicio());
        }

        if (this.getPlsDescServicio() != null && "null".equals(this.getPlsDescServicio())) {
            conditions += " AND PLS_DESC_SERVICIO IS NULL";
        } else if (this.getPlsDescServicio() != null) {
            conditions += " AND PLS_DESC_SERVICIO = ?";
            values.add(this.getPlsDescServicio());
        }

        if (this.getPlsTarifaServ() != null && this.getPlsTarifaServ().longValue() == -999) {
            conditions += " AND PLS_TARIFA_SERV IS NULL";
        } else if (this.getPlsTarifaServ() != null) {
            conditions += " AND PLS_TARIFA_SERV = ?";
            values.add(this.getPlsTarifaServ());
        }

        if (this.getPlsAnoAltaReg() != null && this.getPlsAnoAltaReg().longValue() == -999) {
            conditions += " AND PLS_ANO_ALTA_REG IS NULL";
        } else if (this.getPlsAnoAltaReg() != null) {
            conditions += " AND PLS_ANO_ALTA_REG = ?";
            values.add(this.getPlsAnoAltaReg());
        }

        if (this.getPlsMesAltaReg() != null && this.getPlsMesAltaReg().longValue() == -999) {
            conditions += " AND PLS_MES_ALTA_REG IS NULL";
        } else if (this.getPlsMesAltaReg() != null) {
            conditions += " AND PLS_MES_ALTA_REG = ?";
            values.add(this.getPlsMesAltaReg());
        }

        if (this.getPlsDiaAltaReg() != null && this.getPlsDiaAltaReg().longValue() == -999) {
            conditions += " AND PLS_DIA_ALTA_REG IS NULL";
        } else if (this.getPlsDiaAltaReg() != null) {
            conditions += " AND PLS_DIA_ALTA_REG = ?";
            values.add(this.getPlsDiaAltaReg());
        }

        if (this.getPlsAnoUltMod() != null && this.getPlsAnoUltMod().longValue() == -999) {
            conditions += " AND PLS_ANO_ULT_MOD IS NULL";
        } else if (this.getPlsAnoUltMod() != null) {
            conditions += " AND PLS_ANO_ULT_MOD = ?";
            values.add(this.getPlsAnoUltMod());
        }

        if (this.getPlsMesUltMod() != null && this.getPlsMesUltMod().longValue() == -999) {
            conditions += " AND PLS_MES_ULT_MOD IS NULL";
        } else if (this.getPlsMesUltMod() != null) {
            conditions += " AND PLS_MES_ULT_MOD = ?";
            values.add(this.getPlsMesUltMod());
        }

        if (this.getPlsDiaUltMod() != null && this.getPlsDiaUltMod().longValue() == -999) {
            conditions += " AND PLS_DIA_ULT_MOD IS NULL";
        } else if (this.getPlsDiaUltMod() != null) {
            conditions += " AND PLS_DIA_ULT_MOD = ?";
            values.add(this.getPlsDiaUltMod());
        }

        if (this.getPlsCveStProlser() != null && "null".equals(this.getPlsCveStProlser())) {
            conditions += " AND PLS_CVE_ST_PROLSER IS NULL";
        } else if (this.getPlsCveStProlser() != null) {
            conditions += " AND PLS_CVE_ST_PROLSER = ?";
            values.add(this.getPlsCveStProlser());
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
        String sql = "UPDATE PROLSERV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PLS_NUM_PRODUCTO = ?";
        pkValues.add(this.getPlsNumProducto());
        conditions += " AND PLS_NUM_SERVICIO = ?";
        pkValues.add(this.getPlsNumServicio());
        fields += " PLS_NOM_SERVICIO = ?, ";
        values.add(this.getPlsNomServicio());
        fields += " PLS_DESC_SERVICIO = ?, ";
        values.add(this.getPlsDescServicio());
        fields += " PLS_TARIFA_SERV = ?, ";
        values.add(this.getPlsTarifaServ());
        fields += " PLS_ANO_ALTA_REG = ?, ";
        values.add(this.getPlsAnoAltaReg());
        fields += " PLS_MES_ALTA_REG = ?, ";
        values.add(this.getPlsMesAltaReg());
        fields += " PLS_DIA_ALTA_REG = ?, ";
        values.add(this.getPlsDiaAltaReg());
        fields += " PLS_ANO_ULT_MOD = ?, ";
        values.add(this.getPlsAnoUltMod());
        fields += " PLS_MES_ULT_MOD = ?, ";
        values.add(this.getPlsMesUltMod());
        fields += " PLS_DIA_ULT_MOD = ?, ";
        values.add(this.getPlsDiaUltMod());
        fields += " PLS_CVE_ST_PROLSER = ?, ";
        values.add(this.getPlsCveStProlser());
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
        String sql = "INSERT INTO PROLSERV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PLS_NUM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getPlsNumProducto());

        fields += ", PLS_NUM_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getPlsNumServicio());

        fields += ", PLS_NOM_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getPlsNomServicio());

        fields += ", PLS_DESC_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getPlsDescServicio());

        fields += ", PLS_TARIFA_SERV";
        fieldValues += ", ?";
        values.add(this.getPlsTarifaServ());

        fields += ", PLS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlsAnoAltaReg());

        fields += ", PLS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlsMesAltaReg());

        fields += ", PLS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlsDiaAltaReg());

        fields += ", PLS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlsAnoUltMod());

        fields += ", PLS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlsMesUltMod());

        fields += ", PLS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlsDiaUltMod());

        fields += ", PLS_CVE_ST_PROLSER";
        fieldValues += ", ?";
        values.add(this.getPlsCveStProlser());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PROLSERV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PLS_NUM_PRODUCTO = ?";
        values.add(this.getPlsNumProducto());
        conditions += " AND PLS_NUM_SERVICIO = ?";
        values.add(this.getPlsNumServicio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Prolserv instance = (Prolserv) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPlsNumProducto().equals(instance.getPlsNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getPlsNumServicio().equals(instance.getPlsNumServicio()))
            equalObjects = false;
        if (equalObjects && !this.getPlsNomServicio().equals(instance.getPlsNomServicio()))
            equalObjects = false;
        if (equalObjects && !this.getPlsDescServicio().equals(instance.getPlsDescServicio()))
            equalObjects = false;
        if (equalObjects && !this.getPlsTarifaServ().equals(instance.getPlsTarifaServ()))
            equalObjects = false;
        if (equalObjects && !this.getPlsAnoAltaReg().equals(instance.getPlsAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlsMesAltaReg().equals(instance.getPlsMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlsDiaAltaReg().equals(instance.getPlsDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlsAnoUltMod().equals(instance.getPlsAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlsMesUltMod().equals(instance.getPlsMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlsDiaUltMod().equals(instance.getPlsDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlsCveStProlser().equals(instance.getPlsCveStProlser()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Prolserv result = new Prolserv();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPlsNumProducto((BigDecimal) objectData.getData("PLS_NUM_PRODUCTO"));
        result.setPlsNumServicio((BigDecimal) objectData.getData("PLS_NUM_SERVICIO"));
        result.setPlsNomServicio((String) objectData.getData("PLS_NOM_SERVICIO"));
        result.setPlsDescServicio((String) objectData.getData("PLS_DESC_SERVICIO"));
        result.setPlsTarifaServ((BigDecimal) objectData.getData("PLS_TARIFA_SERV"));
        result.setPlsAnoAltaReg((BigDecimal) objectData.getData("PLS_ANO_ALTA_REG"));
        result.setPlsMesAltaReg((BigDecimal) objectData.getData("PLS_MES_ALTA_REG"));
        result.setPlsDiaAltaReg((BigDecimal) objectData.getData("PLS_DIA_ALTA_REG"));
        result.setPlsAnoUltMod((BigDecimal) objectData.getData("PLS_ANO_ULT_MOD"));
        result.setPlsMesUltMod((BigDecimal) objectData.getData("PLS_MES_ULT_MOD"));
        result.setPlsDiaUltMod((BigDecimal) objectData.getData("PLS_DIA_ULT_MOD"));
        result.setPlsCveStProlser((String) objectData.getData("PLS_CVE_ST_PROLSER"));

        return result;

    }

}
