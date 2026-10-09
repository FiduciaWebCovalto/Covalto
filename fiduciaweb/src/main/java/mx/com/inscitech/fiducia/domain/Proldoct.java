package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PROLDOCT_PK", columns = { "PLD_NUM_DOCUMENTO", "PLD_NUM_PRODUCTO" }, sequences = { "MANUAL" })
public class Proldoct extends DomainObject {

    BigDecimal pldNumProducto = null;
    BigDecimal pldNumDocumento = null;
    String pldNomDocumento = null;
    String pldDescDocumento = null;
    String pldCveObligat = null;
    BigDecimal pldAnoAltaReg = null;
    BigDecimal pldMesAltaReg = null;
    BigDecimal pldDiaAltaReg = null;
    BigDecimal pldAnoUltMod = null;
    BigDecimal pldMesUltMod = null;
    BigDecimal pldDiaUltMod = null;
    String pldCveStProldoc = null;

    public Proldoct() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPldNumProducto(BigDecimal pldNumProducto) {
        this.pldNumProducto = pldNumProducto;
    }

    public BigDecimal getPldNumProducto() {
        return this.pldNumProducto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPldNumDocumento(BigDecimal pldNumDocumento) {
        this.pldNumDocumento = pldNumDocumento;
    }

    public BigDecimal getPldNumDocumento() {
        return this.pldNumDocumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPldNomDocumento(String pldNomDocumento) {
        this.pldNomDocumento = pldNomDocumento;
    }

    public String getPldNomDocumento() {
        return this.pldNomDocumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPldDescDocumento(String pldDescDocumento) {
        this.pldDescDocumento = pldDescDocumento;
    }

    public String getPldDescDocumento() {
        return this.pldDescDocumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPldCveObligat(String pldCveObligat) {
        this.pldCveObligat = pldCveObligat;
    }

    public String getPldCveObligat() {
        return this.pldCveObligat;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPldAnoAltaReg(BigDecimal pldAnoAltaReg) {
        this.pldAnoAltaReg = pldAnoAltaReg;
    }

    public BigDecimal getPldAnoAltaReg() {
        return this.pldAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPldMesAltaReg(BigDecimal pldMesAltaReg) {
        this.pldMesAltaReg = pldMesAltaReg;
    }

    public BigDecimal getPldMesAltaReg() {
        return this.pldMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPldDiaAltaReg(BigDecimal pldDiaAltaReg) {
        this.pldDiaAltaReg = pldDiaAltaReg;
    }

    public BigDecimal getPldDiaAltaReg() {
        return this.pldDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPldAnoUltMod(BigDecimal pldAnoUltMod) {
        this.pldAnoUltMod = pldAnoUltMod;
    }

    public BigDecimal getPldAnoUltMod() {
        return this.pldAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPldMesUltMod(BigDecimal pldMesUltMod) {
        this.pldMesUltMod = pldMesUltMod;
    }

    public BigDecimal getPldMesUltMod() {
        return this.pldMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPldDiaUltMod(BigDecimal pldDiaUltMod) {
        this.pldDiaUltMod = pldDiaUltMod;
    }

    public BigDecimal getPldDiaUltMod() {
        return this.pldDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPldCveStProldoc(String pldCveStProldoc) {
        this.pldCveStProldoc = pldCveStProldoc;
    }

    public String getPldCveStProldoc() {
        return this.pldCveStProldoc;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PROLDOCT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPldNumProducto() != null && this.getPldNumProducto().longValue() == -999) {
            conditions += " AND PLD_NUM_PRODUCTO IS NULL";
        } else if (this.getPldNumProducto() != null) {
            conditions += " AND PLD_NUM_PRODUCTO = ?";
            values.add(this.getPldNumProducto());
        }

        if (this.getPldNumDocumento() != null && this.getPldNumDocumento().longValue() == -999) {
            conditions += " AND PLD_NUM_DOCUMENTO IS NULL";
        } else if (this.getPldNumDocumento() != null) {
            conditions += " AND PLD_NUM_DOCUMENTO = ?";
            values.add(this.getPldNumDocumento());
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
        String sql = "SELECT * FROM PROLDOCT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPldNumProducto() != null && this.getPldNumProducto().longValue() == -999) {
            conditions += " AND PLD_NUM_PRODUCTO IS NULL";
        } else if (this.getPldNumProducto() != null) {
            conditions += " AND PLD_NUM_PRODUCTO = ?";
            values.add(this.getPldNumProducto());
        }

        if (this.getPldNumDocumento() != null && this.getPldNumDocumento().longValue() == -999) {
            conditions += " AND PLD_NUM_DOCUMENTO IS NULL";
        } else if (this.getPldNumDocumento() != null) {
            conditions += " AND PLD_NUM_DOCUMENTO = ?";
            values.add(this.getPldNumDocumento());
        }

        if (this.getPldNomDocumento() != null && "null".equals(this.getPldNomDocumento())) {
            conditions += " AND PLD_NOM_DOCUMENTO IS NULL";
        } else if (this.getPldNomDocumento() != null) {
            conditions += " AND PLD_NOM_DOCUMENTO = ?";
            values.add(this.getPldNomDocumento());
        }

        if (this.getPldDescDocumento() != null && "null".equals(this.getPldDescDocumento())) {
            conditions += " AND PLD_DESC_DOCUMENTO IS NULL";
        } else if (this.getPldDescDocumento() != null) {
            conditions += " AND PLD_DESC_DOCUMENTO = ?";
            values.add(this.getPldDescDocumento());
        }

        if (this.getPldCveObligat() != null && "null".equals(this.getPldCveObligat())) {
            conditions += " AND PLD_CVE_OBLIGAT IS NULL";
        } else if (this.getPldCveObligat() != null) {
            conditions += " AND PLD_CVE_OBLIGAT = ?";
            values.add(this.getPldCveObligat());
        }

        if (this.getPldAnoAltaReg() != null && this.getPldAnoAltaReg().longValue() == -999) {
            conditions += " AND PLD_ANO_ALTA_REG IS NULL";
        } else if (this.getPldAnoAltaReg() != null) {
            conditions += " AND PLD_ANO_ALTA_REG = ?";
            values.add(this.getPldAnoAltaReg());
        }

        if (this.getPldMesAltaReg() != null && this.getPldMesAltaReg().longValue() == -999) {
            conditions += " AND PLD_MES_ALTA_REG IS NULL";
        } else if (this.getPldMesAltaReg() != null) {
            conditions += " AND PLD_MES_ALTA_REG = ?";
            values.add(this.getPldMesAltaReg());
        }

        if (this.getPldDiaAltaReg() != null && this.getPldDiaAltaReg().longValue() == -999) {
            conditions += " AND PLD_DIA_ALTA_REG IS NULL";
        } else if (this.getPldDiaAltaReg() != null) {
            conditions += " AND PLD_DIA_ALTA_REG = ?";
            values.add(this.getPldDiaAltaReg());
        }

        if (this.getPldAnoUltMod() != null && this.getPldAnoUltMod().longValue() == -999) {
            conditions += " AND PLD_ANO_ULT_MOD IS NULL";
        } else if (this.getPldAnoUltMod() != null) {
            conditions += " AND PLD_ANO_ULT_MOD = ?";
            values.add(this.getPldAnoUltMod());
        }

        if (this.getPldMesUltMod() != null && this.getPldMesUltMod().longValue() == -999) {
            conditions += " AND PLD_MES_ULT_MOD IS NULL";
        } else if (this.getPldMesUltMod() != null) {
            conditions += " AND PLD_MES_ULT_MOD = ?";
            values.add(this.getPldMesUltMod());
        }

        if (this.getPldDiaUltMod() != null && this.getPldDiaUltMod().longValue() == -999) {
            conditions += " AND PLD_DIA_ULT_MOD IS NULL";
        } else if (this.getPldDiaUltMod() != null) {
            conditions += " AND PLD_DIA_ULT_MOD = ?";
            values.add(this.getPldDiaUltMod());
        }

        if (this.getPldCveStProldoc() != null && "null".equals(this.getPldCveStProldoc())) {
            conditions += " AND PLD_CVE_ST_PROLDOC IS NULL";
        } else if (this.getPldCveStProldoc() != null) {
            conditions += " AND PLD_CVE_ST_PROLDOC = ?";
            values.add(this.getPldCveStProldoc());
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
        String sql = "UPDATE PROLDOCT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PLD_NUM_PRODUCTO = ?";
        pkValues.add(this.getPldNumProducto());
        conditions += " AND PLD_NUM_DOCUMENTO = ?";
        pkValues.add(this.getPldNumDocumento());
        fields += " PLD_NOM_DOCUMENTO = ?, ";
        values.add(this.getPldNomDocumento());
        fields += " PLD_DESC_DOCUMENTO = ?, ";
        values.add(this.getPldDescDocumento());
        fields += " PLD_CVE_OBLIGAT = ?, ";
        values.add(this.getPldCveObligat());
        fields += " PLD_ANO_ALTA_REG = ?, ";
        values.add(this.getPldAnoAltaReg());
        fields += " PLD_MES_ALTA_REG = ?, ";
        values.add(this.getPldMesAltaReg());
        fields += " PLD_DIA_ALTA_REG = ?, ";
        values.add(this.getPldDiaAltaReg());
        fields += " PLD_ANO_ULT_MOD = ?, ";
        values.add(this.getPldAnoUltMod());
        fields += " PLD_MES_ULT_MOD = ?, ";
        values.add(this.getPldMesUltMod());
        fields += " PLD_DIA_ULT_MOD = ?, ";
        values.add(this.getPldDiaUltMod());
        fields += " PLD_CVE_ST_PROLDOC = ?, ";
        values.add(this.getPldCveStProldoc());
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
        String sql = "INSERT INTO PROLDOCT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PLD_NUM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getPldNumProducto());

        fields += ", PLD_NUM_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getPldNumDocumento());

        fields += ", PLD_NOM_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getPldNomDocumento());

        fields += ", PLD_DESC_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getPldDescDocumento());

        fields += ", PLD_CVE_OBLIGAT";
        fieldValues += ", ?";
        values.add(this.getPldCveObligat());

        fields += ", PLD_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPldAnoAltaReg());

        fields += ", PLD_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPldMesAltaReg());

        fields += ", PLD_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPldDiaAltaReg());

        fields += ", PLD_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPldAnoUltMod());

        fields += ", PLD_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPldMesUltMod());

        fields += ", PLD_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPldDiaUltMod());

        fields += ", PLD_CVE_ST_PROLDOC";
        fieldValues += ", ?";
        values.add(this.getPldCveStProldoc());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PROLDOCT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PLD_NUM_PRODUCTO = ?";
        values.add(this.getPldNumProducto());
        conditions += " AND PLD_NUM_DOCUMENTO = ?";
        values.add(this.getPldNumDocumento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Proldoct instance = (Proldoct) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPldNumProducto().equals(instance.getPldNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getPldNumDocumento().equals(instance.getPldNumDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getPldNomDocumento().equals(instance.getPldNomDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getPldDescDocumento().equals(instance.getPldDescDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getPldCveObligat().equals(instance.getPldCveObligat()))
            equalObjects = false;
        if (equalObjects && !this.getPldAnoAltaReg().equals(instance.getPldAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPldMesAltaReg().equals(instance.getPldMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPldDiaAltaReg().equals(instance.getPldDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPldAnoUltMod().equals(instance.getPldAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPldMesUltMod().equals(instance.getPldMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPldDiaUltMod().equals(instance.getPldDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPldCveStProldoc().equals(instance.getPldCveStProldoc()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Proldoct result = new Proldoct();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPldNumProducto((BigDecimal) objectData.getData("PLD_NUM_PRODUCTO"));
        result.setPldNumDocumento((BigDecimal) objectData.getData("PLD_NUM_DOCUMENTO"));
        result.setPldNomDocumento((String) objectData.getData("PLD_NOM_DOCUMENTO"));
        result.setPldDescDocumento((String) objectData.getData("PLD_DESC_DOCUMENTO"));
        result.setPldCveObligat((String) objectData.getData("PLD_CVE_OBLIGAT"));
        result.setPldAnoAltaReg((BigDecimal) objectData.getData("PLD_ANO_ALTA_REG"));
        result.setPldMesAltaReg((BigDecimal) objectData.getData("PLD_MES_ALTA_REG"));
        result.setPldDiaAltaReg((BigDecimal) objectData.getData("PLD_DIA_ALTA_REG"));
        result.setPldAnoUltMod((BigDecimal) objectData.getData("PLD_ANO_ULT_MOD"));
        result.setPldMesUltMod((BigDecimal) objectData.getData("PLD_MES_ULT_MOD"));
        result.setPldDiaUltMod((BigDecimal) objectData.getData("PLD_DIA_ULT_MOD"));
        result.setPldCveStProldoc((String) objectData.getData("PLD_CVE_ST_PROLDOC"));

        return result;

    }

}
