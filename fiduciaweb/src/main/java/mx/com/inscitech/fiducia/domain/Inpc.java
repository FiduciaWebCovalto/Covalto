package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INPC_PK", columns = { "INPC_ANO", "INPC_MES" }, sequences = { "MANUAL" })
public class Inpc extends DomainObject {

    BigDecimal inpcAno = null;
    BigDecimal inpcMes = null;
    BigDecimal inpcImporte = null;
    BigDecimal inpcAnoAltaReg = null;
    BigDecimal inpcMesAltaReg = null;
    BigDecimal inpcDiaAltaReg = null;
    BigDecimal inpcAnoUltMod = null;
    BigDecimal inpcMesUltMod = null;
    BigDecimal inpcDiaUltMod = null;

    public Inpc() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setInpcAno(BigDecimal inpcAno) {
        this.inpcAno = inpcAno;
    }

    public BigDecimal getInpcAno() {
        return this.inpcAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInpcMes(BigDecimal inpcMes) {
        this.inpcMes = inpcMes;
    }

    public BigDecimal getInpcMes() {
        return this.inpcMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 18, scale = 5, javaClass = BigDecimal.class)
    public void setInpcImporte(BigDecimal inpcImporte) {
        this.inpcImporte = inpcImporte;
    }

    public BigDecimal getInpcImporte() {
        return this.inpcImporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setInpcAnoAltaReg(BigDecimal inpcAnoAltaReg) {
        this.inpcAnoAltaReg = inpcAnoAltaReg;
    }

    public BigDecimal getInpcAnoAltaReg() {
        return this.inpcAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInpcMesAltaReg(BigDecimal inpcMesAltaReg) {
        this.inpcMesAltaReg = inpcMesAltaReg;
    }

    public BigDecimal getInpcMesAltaReg() {
        return this.inpcMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInpcDiaAltaReg(BigDecimal inpcDiaAltaReg) {
        this.inpcDiaAltaReg = inpcDiaAltaReg;
    }

    public BigDecimal getInpcDiaAltaReg() {
        return this.inpcDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setInpcAnoUltMod(BigDecimal inpcAnoUltMod) {
        this.inpcAnoUltMod = inpcAnoUltMod;
    }

    public BigDecimal getInpcAnoUltMod() {
        return this.inpcAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInpcMesUltMod(BigDecimal inpcMesUltMod) {
        this.inpcMesUltMod = inpcMesUltMod;
    }

    public BigDecimal getInpcMesUltMod() {
        return this.inpcMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInpcDiaUltMod(BigDecimal inpcDiaUltMod) {
        this.inpcDiaUltMod = inpcDiaUltMod;
    }

    public BigDecimal getInpcDiaUltMod() {
        return this.inpcDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INPC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInpcAno() != null && this.getInpcAno().longValue() == -999) {
            conditions += " AND INPC_ANO IS NULL";
        } else if (this.getInpcAno() != null) {
            conditions += " AND INPC_ANO = ?";
            values.add(this.getInpcAno());
        }

        if (this.getInpcMes() != null && this.getInpcMes().longValue() == -999) {
            conditions += " AND INPC_MES IS NULL";
        } else if (this.getInpcMes() != null) {
            conditions += " AND INPC_MES = ?";
            values.add(this.getInpcMes());
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
        String sql = "SELECT * FROM INPC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInpcAno() != null && this.getInpcAno().longValue() == -999) {
            conditions += " AND INPC_ANO IS NULL";
        } else if (this.getInpcAno() != null) {
            conditions += " AND INPC_ANO = ?";
            values.add(this.getInpcAno());
        }

        if (this.getInpcMes() != null && this.getInpcMes().longValue() == -999) {
            conditions += " AND INPC_MES IS NULL";
        } else if (this.getInpcMes() != null) {
            conditions += " AND INPC_MES = ?";
            values.add(this.getInpcMes());
        }

        if (this.getInpcImporte() != null && this.getInpcImporte().longValue() == -999) {
            conditions += " AND INPC_IMPORTE IS NULL";
        } else if (this.getInpcImporte() != null) {
            conditions += " AND INPC_IMPORTE = ?";
            values.add(this.getInpcImporte());
        }

        if (this.getInpcAnoAltaReg() != null && this.getInpcAnoAltaReg().longValue() == -999) {
            conditions += " AND INPC_ANO_ALTA_REG IS NULL";
        } else if (this.getInpcAnoAltaReg() != null) {
            conditions += " AND INPC_ANO_ALTA_REG = ?";
            values.add(this.getInpcAnoAltaReg());
        }

        if (this.getInpcMesAltaReg() != null && this.getInpcMesAltaReg().longValue() == -999) {
            conditions += " AND INPC_MES_ALTA_REG IS NULL";
        } else if (this.getInpcMesAltaReg() != null) {
            conditions += " AND INPC_MES_ALTA_REG = ?";
            values.add(this.getInpcMesAltaReg());
        }

        if (this.getInpcDiaAltaReg() != null && this.getInpcDiaAltaReg().longValue() == -999) {
            conditions += " AND INPC_DIA_ALTA_REG IS NULL";
        } else if (this.getInpcDiaAltaReg() != null) {
            conditions += " AND INPC_DIA_ALTA_REG = ?";
            values.add(this.getInpcDiaAltaReg());
        }

        if (this.getInpcAnoUltMod() != null && this.getInpcAnoUltMod().longValue() == -999) {
            conditions += " AND INPC_ANO_ULT_MOD IS NULL";
        } else if (this.getInpcAnoUltMod() != null) {
            conditions += " AND INPC_ANO_ULT_MOD = ?";
            values.add(this.getInpcAnoUltMod());
        }

        if (this.getInpcMesUltMod() != null && this.getInpcMesUltMod().longValue() == -999) {
            conditions += " AND INPC_MES_ULT_MOD IS NULL";
        } else if (this.getInpcMesUltMod() != null) {
            conditions += " AND INPC_MES_ULT_MOD = ?";
            values.add(this.getInpcMesUltMod());
        }

        if (this.getInpcDiaUltMod() != null && this.getInpcDiaUltMod().longValue() == -999) {
            conditions += " AND INPC_DIA_ULT_MOD IS NULL";
        } else if (this.getInpcDiaUltMod() != null) {
            conditions += " AND INPC_DIA_ULT_MOD = ?";
            values.add(this.getInpcDiaUltMod());
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
        String sql = "UPDATE INPC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND INPC_ANO = ?";
        pkValues.add(this.getInpcAno());
        conditions += " AND INPC_MES = ?";
        pkValues.add(this.getInpcMes());
        fields += " INPC_IMPORTE = ?, ";
        values.add(this.getInpcImporte());
        fields += " INPC_ANO_ALTA_REG = ?, ";
        values.add(this.getInpcAnoAltaReg());
        fields += " INPC_MES_ALTA_REG = ?, ";
        values.add(this.getInpcMesAltaReg());
        fields += " INPC_DIA_ALTA_REG = ?, ";
        values.add(this.getInpcDiaAltaReg());
        fields += " INPC_ANO_ULT_MOD = ?, ";
        values.add(this.getInpcAnoUltMod());
        fields += " INPC_MES_ULT_MOD = ?, ";
        values.add(this.getInpcMesUltMod());
        fields += " INPC_DIA_ULT_MOD = ?, ";
        values.add(this.getInpcDiaUltMod());
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
        String sql = "INSERT INTO INPC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", INPC_ANO";
        fieldValues += ", ?";
        values.add(this.getInpcAno());

        fields += ", INPC_MES";
        fieldValues += ", ?";
        values.add(this.getInpcMes());

        fields += ", INPC_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getInpcImporte());

        fields += ", INPC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInpcAnoAltaReg());

        fields += ", INPC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInpcMesAltaReg());

        fields += ", INPC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInpcDiaAltaReg());

        fields += ", INPC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInpcAnoUltMod());

        fields += ", INPC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInpcMesUltMod());

        fields += ", INPC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInpcDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INPC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND INPC_ANO = ?";
        values.add(this.getInpcAno());
        conditions += " AND INPC_MES = ?";
        values.add(this.getInpcMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Inpc instance = (Inpc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getInpcAno().equals(instance.getInpcAno()))
            equalObjects = false;
        if (equalObjects && !this.getInpcMes().equals(instance.getInpcMes()))
            equalObjects = false;
        if (equalObjects && !this.getInpcImporte().equals(instance.getInpcImporte()))
            equalObjects = false;
        if (equalObjects && !this.getInpcAnoAltaReg().equals(instance.getInpcAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInpcMesAltaReg().equals(instance.getInpcMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInpcDiaAltaReg().equals(instance.getInpcDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInpcAnoUltMod().equals(instance.getInpcAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getInpcMesUltMod().equals(instance.getInpcMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getInpcDiaUltMod().equals(instance.getInpcDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Inpc result = new Inpc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setInpcAno((BigDecimal) objectData.getData("INPC_ANO"));
        result.setInpcMes((BigDecimal) objectData.getData("INPC_MES"));
        result.setInpcImporte((BigDecimal) objectData.getData("INPC_IMPORTE"));
        result.setInpcAnoAltaReg((BigDecimal) objectData.getData("INPC_ANO_ALTA_REG"));
        result.setInpcMesAltaReg((BigDecimal) objectData.getData("INPC_MES_ALTA_REG"));
        result.setInpcDiaAltaReg((BigDecimal) objectData.getData("INPC_DIA_ALTA_REG"));
        result.setInpcAnoUltMod((BigDecimal) objectData.getData("INPC_ANO_ULT_MOD"));
        result.setInpcMesUltMod((BigDecimal) objectData.getData("INPC_MES_ULT_MOD"));
        result.setInpcDiaUltMod((BigDecimal) objectData.getData("INPC_DIA_ULT_MOD"));

        return result;

    }

}
