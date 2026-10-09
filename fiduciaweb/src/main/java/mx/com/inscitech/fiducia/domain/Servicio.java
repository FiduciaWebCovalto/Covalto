package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SERVICIO_PK", columns = { "SER_NUM_SERVICIO" }, sequences = { "MAX" })
public class Servicio extends DomainObject {

    BigDecimal serNumServicio = null;
    String serNomServicio = null;
    String serDescServicio = null;
    BigDecimal serTarifaServ = null;
    String serBancaOfrece = null;
    BigDecimal serCveUsaTabla = null;
    BigDecimal serAnoAltaReg = null;
    BigDecimal serMesAltaReg = null;
    BigDecimal serDiaAltaReg = null;
    BigDecimal serAnoUltMod = null;
    BigDecimal serMesUltMod = null;
    BigDecimal serDiaUltMod = null;
    String serCveStServici = null;

    public Servicio() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSerNumServicio(BigDecimal serNumServicio) {
        this.serNumServicio = serNumServicio;
    }

    public BigDecimal getSerNumServicio() {
        return this.serNumServicio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSerNomServicio(String serNomServicio) {
        this.serNomServicio = serNomServicio;
    }

    public String getSerNomServicio() {
        return this.serNomServicio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSerDescServicio(String serDescServicio) {
        this.serDescServicio = serDescServicio;
    }

    public String getSerDescServicio() {
        return this.serDescServicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSerTarifaServ(BigDecimal serTarifaServ) {
        this.serTarifaServ = serTarifaServ;
    }

    public BigDecimal getSerTarifaServ() {
        return this.serTarifaServ;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSerBancaOfrece(String serBancaOfrece) {
        this.serBancaOfrece = serBancaOfrece;
    }

    public String getSerBancaOfrece() {
        return this.serBancaOfrece;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSerCveUsaTabla(BigDecimal serCveUsaTabla) {
        this.serCveUsaTabla = serCveUsaTabla;
    }

    public BigDecimal getSerCveUsaTabla() {
        return this.serCveUsaTabla;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSerAnoAltaReg(BigDecimal serAnoAltaReg) {
        this.serAnoAltaReg = serAnoAltaReg;
    }

    public BigDecimal getSerAnoAltaReg() {
        return this.serAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSerMesAltaReg(BigDecimal serMesAltaReg) {
        this.serMesAltaReg = serMesAltaReg;
    }

    public BigDecimal getSerMesAltaReg() {
        return this.serMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSerDiaAltaReg(BigDecimal serDiaAltaReg) {
        this.serDiaAltaReg = serDiaAltaReg;
    }

    public BigDecimal getSerDiaAltaReg() {
        return this.serDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSerAnoUltMod(BigDecimal serAnoUltMod) {
        this.serAnoUltMod = serAnoUltMod;
    }

    public BigDecimal getSerAnoUltMod() {
        return this.serAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSerMesUltMod(BigDecimal serMesUltMod) {
        this.serMesUltMod = serMesUltMod;
    }

    public BigDecimal getSerMesUltMod() {
        return this.serMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSerDiaUltMod(BigDecimal serDiaUltMod) {
        this.serDiaUltMod = serDiaUltMod;
    }

    public BigDecimal getSerDiaUltMod() {
        return this.serDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSerCveStServici(String serCveStServici) {
        this.serCveStServici = serCveStServici;
    }

    public String getSerCveStServici() {
        return this.serCveStServici;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SERVICIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSerNumServicio() != null && this.getSerNumServicio().longValue() == -999) {
            conditions += " AND SER_NUM_SERVICIO IS NULL";
        } else if (this.getSerNumServicio() != null) {
            conditions += " AND SER_NUM_SERVICIO = ?";
            values.add(this.getSerNumServicio());
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
        String sql = "SELECT * FROM SERVICIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSerNumServicio() != null && this.getSerNumServicio().longValue() == -999) {
            conditions += " AND SER_NUM_SERVICIO IS NULL";
        } else if (this.getSerNumServicio() != null) {
            conditions += " AND SER_NUM_SERVICIO = ?";
            values.add(this.getSerNumServicio());
        }

        if (this.getSerNomServicio() != null && "null".equals(this.getSerNomServicio())) {
            conditions += " AND SER_NOM_SERVICIO IS NULL";
        } else if (this.getSerNomServicio() != null) {
            conditions += " AND SER_NOM_SERVICIO = ?";
            values.add(this.getSerNomServicio());
        }

        if (this.getSerDescServicio() != null && "null".equals(this.getSerDescServicio())) {
            conditions += " AND SER_DESC_SERVICIO IS NULL";
        } else if (this.getSerDescServicio() != null) {
            conditions += " AND SER_DESC_SERVICIO = ?";
            values.add(this.getSerDescServicio());
        }

        if (this.getSerTarifaServ() != null && this.getSerTarifaServ().longValue() == -999) {
            conditions += " AND SER_TARIFA_SERV IS NULL";
        } else if (this.getSerTarifaServ() != null) {
            conditions += " AND SER_TARIFA_SERV = ?";
            values.add(this.getSerTarifaServ());
        }

        if (this.getSerBancaOfrece() != null && "null".equals(this.getSerBancaOfrece())) {
            conditions += " AND SER_BANCA_OFRECE IS NULL";
        } else if (this.getSerBancaOfrece() != null) {
            conditions += " AND SER_BANCA_OFRECE = ?";
            values.add(this.getSerBancaOfrece());
        }

        if (this.getSerCveUsaTabla() != null && this.getSerCveUsaTabla().longValue() == -999) {
            conditions += " AND SER_CVE_USA_TABLA IS NULL";
        } else if (this.getSerCveUsaTabla() != null) {
            conditions += " AND SER_CVE_USA_TABLA = ?";
            values.add(this.getSerCveUsaTabla());
        }

        if (this.getSerAnoAltaReg() != null && this.getSerAnoAltaReg().longValue() == -999) {
            conditions += " AND SER_ANO_ALTA_REG IS NULL";
        } else if (this.getSerAnoAltaReg() != null) {
            conditions += " AND SER_ANO_ALTA_REG = ?";
            values.add(this.getSerAnoAltaReg());
        }

        if (this.getSerMesAltaReg() != null && this.getSerMesAltaReg().longValue() == -999) {
            conditions += " AND SER_MES_ALTA_REG IS NULL";
        } else if (this.getSerMesAltaReg() != null) {
            conditions += " AND SER_MES_ALTA_REG = ?";
            values.add(this.getSerMesAltaReg());
        }

        if (this.getSerDiaAltaReg() != null && this.getSerDiaAltaReg().longValue() == -999) {
            conditions += " AND SER_DIA_ALTA_REG IS NULL";
        } else if (this.getSerDiaAltaReg() != null) {
            conditions += " AND SER_DIA_ALTA_REG = ?";
            values.add(this.getSerDiaAltaReg());
        }

        if (this.getSerAnoUltMod() != null && this.getSerAnoUltMod().longValue() == -999) {
            conditions += " AND SER_ANO_ULT_MOD IS NULL";
        } else if (this.getSerAnoUltMod() != null) {
            conditions += " AND SER_ANO_ULT_MOD = ?";
            values.add(this.getSerAnoUltMod());
        }

        if (this.getSerMesUltMod() != null && this.getSerMesUltMod().longValue() == -999) {
            conditions += " AND SER_MES_ULT_MOD IS NULL";
        } else if (this.getSerMesUltMod() != null) {
            conditions += " AND SER_MES_ULT_MOD = ?";
            values.add(this.getSerMesUltMod());
        }

        if (this.getSerDiaUltMod() != null && this.getSerDiaUltMod().longValue() == -999) {
            conditions += " AND SER_DIA_ULT_MOD IS NULL";
        } else if (this.getSerDiaUltMod() != null) {
            conditions += " AND SER_DIA_ULT_MOD = ?";
            values.add(this.getSerDiaUltMod());
        }

        if (this.getSerCveStServici() != null && "null".equals(this.getSerCveStServici())) {
            conditions += " AND SER_CVE_ST_SERVICI IS NULL";
        } else if (this.getSerCveStServici() != null) {
            conditions += " AND SER_CVE_ST_SERVICI = ?";
            values.add(this.getSerCveStServici());
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
        String sql = "UPDATE SERVICIO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SER_NUM_SERVICIO = ?";
        pkValues.add(this.getSerNumServicio());
        fields += " SER_NOM_SERVICIO = ?, ";
        values.add(this.getSerNomServicio());
        fields += " SER_DESC_SERVICIO = ?, ";
        values.add(this.getSerDescServicio());
        fields += " SER_TARIFA_SERV = ?, ";
        values.add(this.getSerTarifaServ());
        fields += " SER_BANCA_OFRECE = ?, ";
        values.add(this.getSerBancaOfrece());
        fields += " SER_CVE_USA_TABLA = ?, ";
        values.add(this.getSerCveUsaTabla());
        fields += " SER_ANO_ALTA_REG = ?, ";
        values.add(this.getSerAnoAltaReg());
        fields += " SER_MES_ALTA_REG = ?, ";
        values.add(this.getSerMesAltaReg());
        fields += " SER_DIA_ALTA_REG = ?, ";
        values.add(this.getSerDiaAltaReg());
        fields += " SER_ANO_ULT_MOD = ?, ";
        values.add(this.getSerAnoUltMod());
        fields += " SER_MES_ULT_MOD = ?, ";
        values.add(this.getSerMesUltMod());
        fields += " SER_DIA_ULT_MOD = ?, ";
        values.add(this.getSerDiaUltMod());
        fields += " SER_CVE_ST_SERVICI = ?, ";
        values.add(this.getSerCveStServici());
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
        String sql = "INSERT INTO SERVICIO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SER_NUM_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getSerNumServicio());

        fields += ", SER_NOM_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getSerNomServicio());

        fields += ", SER_DESC_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getSerDescServicio());

        fields += ", SER_TARIFA_SERV";
        fieldValues += ", ?";
        values.add(this.getSerTarifaServ());

        fields += ", SER_BANCA_OFRECE";
        fieldValues += ", ?";
        values.add(this.getSerBancaOfrece());

        fields += ", SER_CVE_USA_TABLA";
        fieldValues += ", ?";
        values.add(this.getSerCveUsaTabla());

        fields += ", SER_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSerAnoAltaReg());

        fields += ", SER_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSerMesAltaReg());

        fields += ", SER_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSerDiaAltaReg());

        fields += ", SER_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSerAnoUltMod());

        fields += ", SER_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSerMesUltMod());

        fields += ", SER_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSerDiaUltMod());

        fields += ", SER_CVE_ST_SERVICI";
        fieldValues += ", ?";
        values.add(this.getSerCveStServici());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SERVICIO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SER_NUM_SERVICIO = ?";
        values.add(this.getSerNumServicio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Servicio instance = (Servicio) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSerNumServicio().equals(instance.getSerNumServicio()))
            equalObjects = false;
        if (equalObjects && !this.getSerNomServicio().equals(instance.getSerNomServicio()))
            equalObjects = false;
        if (equalObjects && !this.getSerDescServicio().equals(instance.getSerDescServicio()))
            equalObjects = false;
        if (equalObjects && !this.getSerTarifaServ().equals(instance.getSerTarifaServ()))
            equalObjects = false;
        if (equalObjects && !this.getSerBancaOfrece().equals(instance.getSerBancaOfrece()))
            equalObjects = false;
        if (equalObjects && !this.getSerCveUsaTabla().equals(instance.getSerCveUsaTabla()))
            equalObjects = false;
        if (equalObjects && !this.getSerAnoAltaReg().equals(instance.getSerAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSerMesAltaReg().equals(instance.getSerMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSerDiaAltaReg().equals(instance.getSerDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSerAnoUltMod().equals(instance.getSerAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSerMesUltMod().equals(instance.getSerMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSerDiaUltMod().equals(instance.getSerDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSerCveStServici().equals(instance.getSerCveStServici()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Servicio result = new Servicio();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSerNumServicio((BigDecimal) objectData.getData("SER_NUM_SERVICIO"));
        result.setSerNomServicio((String) objectData.getData("SER_NOM_SERVICIO"));
        result.setSerDescServicio((String) objectData.getData("SER_DESC_SERVICIO"));
        result.setSerTarifaServ((BigDecimal) objectData.getData("SER_TARIFA_SERV"));
        result.setSerBancaOfrece((String) objectData.getData("SER_BANCA_OFRECE"));
        result.setSerCveUsaTabla((BigDecimal) objectData.getData("SER_CVE_USA_TABLA"));
        result.setSerAnoAltaReg((BigDecimal) objectData.getData("SER_ANO_ALTA_REG"));
        result.setSerMesAltaReg((BigDecimal) objectData.getData("SER_MES_ALTA_REG"));
        result.setSerDiaAltaReg((BigDecimal) objectData.getData("SER_DIA_ALTA_REG"));
        result.setSerAnoUltMod((BigDecimal) objectData.getData("SER_ANO_ULT_MOD"));
        result.setSerMesUltMod((BigDecimal) objectData.getData("SER_MES_ULT_MOD"));
        result.setSerDiaUltMod((BigDecimal) objectData.getData("SER_DIA_ULT_MOD"));
        result.setSerCveStServici((String) objectData.getData("SER_CVE_ST_SERVICI"));

        return result;

    }

}
