package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DATOTRAN_PK", columns = { "DTR_CVE_APL_DATO", "DTR_NUM_MODULO", "DTR_NUM_TRANSAC" }, sequences = { "MANUAL" })
public class Datotran extends DomainObject {

    BigDecimal dtrNumModulo = null;
    BigDecimal dtrNumTransac = null;
    String dtrCveAplDato = null;
    BigDecimal dtrAnoAltaReg = null;
    BigDecimal dtrMesAltaReg = null;
    BigDecimal dtrDiaAltaReg = null;
    BigDecimal dtrAnoUltMod = null;
    BigDecimal dtrMesUltMod = null;
    BigDecimal dtrDiaUltMod = null;
    String dtrCveStTransac = null;

    public Datotran() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setDtrNumModulo(BigDecimal dtrNumModulo) {
        this.dtrNumModulo = dtrNumModulo;
    }

    public BigDecimal getDtrNumModulo() {
        return this.dtrNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDtrNumTransac(BigDecimal dtrNumTransac) {
        this.dtrNumTransac = dtrNumTransac;
    }

    public BigDecimal getDtrNumTransac() {
        return this.dtrNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDtrCveAplDato(String dtrCveAplDato) {
        this.dtrCveAplDato = dtrCveAplDato;
    }

    public String getDtrCveAplDato() {
        return this.dtrCveAplDato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDtrAnoAltaReg(BigDecimal dtrAnoAltaReg) {
        this.dtrAnoAltaReg = dtrAnoAltaReg;
    }

    public BigDecimal getDtrAnoAltaReg() {
        return this.dtrAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDtrMesAltaReg(BigDecimal dtrMesAltaReg) {
        this.dtrMesAltaReg = dtrMesAltaReg;
    }

    public BigDecimal getDtrMesAltaReg() {
        return this.dtrMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDtrDiaAltaReg(BigDecimal dtrDiaAltaReg) {
        this.dtrDiaAltaReg = dtrDiaAltaReg;
    }

    public BigDecimal getDtrDiaAltaReg() {
        return this.dtrDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDtrAnoUltMod(BigDecimal dtrAnoUltMod) {
        this.dtrAnoUltMod = dtrAnoUltMod;
    }

    public BigDecimal getDtrAnoUltMod() {
        return this.dtrAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDtrMesUltMod(BigDecimal dtrMesUltMod) {
        this.dtrMesUltMod = dtrMesUltMod;
    }

    public BigDecimal getDtrMesUltMod() {
        return this.dtrMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDtrDiaUltMod(BigDecimal dtrDiaUltMod) {
        this.dtrDiaUltMod = dtrDiaUltMod;
    }

    public BigDecimal getDtrDiaUltMod() {
        return this.dtrDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDtrCveStTransac(String dtrCveStTransac) {
        this.dtrCveStTransac = dtrCveStTransac;
    }

    public String getDtrCveStTransac() {
        return this.dtrCveStTransac;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DATOTRAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDtrNumModulo() != null && this.getDtrNumModulo().longValue() == -999) {
            conditions += " AND DTR_NUM_MODULO IS NULL";
        } else if (this.getDtrNumModulo() != null) {
            conditions += " AND DTR_NUM_MODULO = ?";
            values.add(this.getDtrNumModulo());
        }

        if (this.getDtrNumTransac() != null && this.getDtrNumTransac().longValue() == -999) {
            conditions += " AND DTR_NUM_TRANSAC IS NULL";
        } else if (this.getDtrNumTransac() != null) {
            conditions += " AND DTR_NUM_TRANSAC = ?";
            values.add(this.getDtrNumTransac());
        }

        if (this.getDtrCveAplDato() != null && "null".equals(this.getDtrCveAplDato())) {
            conditions += " AND DTR_CVE_APL_DATO IS NULL";
        } else if (this.getDtrCveAplDato() != null) {
            conditions += " AND DTR_CVE_APL_DATO = ?";
            values.add(this.getDtrCveAplDato());
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
        String sql = "SELECT * FROM DATOTRAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDtrNumModulo() != null && this.getDtrNumModulo().longValue() == -999) {
            conditions += " AND DTR_NUM_MODULO IS NULL";
        } else if (this.getDtrNumModulo() != null) {
            conditions += " AND DTR_NUM_MODULO = ?";
            values.add(this.getDtrNumModulo());
        }

        if (this.getDtrNumTransac() != null && this.getDtrNumTransac().longValue() == -999) {
            conditions += " AND DTR_NUM_TRANSAC IS NULL";
        } else if (this.getDtrNumTransac() != null) {
            conditions += " AND DTR_NUM_TRANSAC = ?";
            values.add(this.getDtrNumTransac());
        }

        if (this.getDtrCveAplDato() != null && "null".equals(this.getDtrCveAplDato())) {
            conditions += " AND DTR_CVE_APL_DATO IS NULL";
        } else if (this.getDtrCveAplDato() != null) {
            conditions += " AND DTR_CVE_APL_DATO = ?";
            values.add(this.getDtrCveAplDato());
        }

        if (this.getDtrAnoAltaReg() != null && this.getDtrAnoAltaReg().longValue() == -999) {
            conditions += " AND DTR_ANO_ALTA_REG IS NULL";
        } else if (this.getDtrAnoAltaReg() != null) {
            conditions += " AND DTR_ANO_ALTA_REG = ?";
            values.add(this.getDtrAnoAltaReg());
        }

        if (this.getDtrMesAltaReg() != null && this.getDtrMesAltaReg().longValue() == -999) {
            conditions += " AND DTR_MES_ALTA_REG IS NULL";
        } else if (this.getDtrMesAltaReg() != null) {
            conditions += " AND DTR_MES_ALTA_REG = ?";
            values.add(this.getDtrMesAltaReg());
        }

        if (this.getDtrDiaAltaReg() != null && this.getDtrDiaAltaReg().longValue() == -999) {
            conditions += " AND DTR_DIA_ALTA_REG IS NULL";
        } else if (this.getDtrDiaAltaReg() != null) {
            conditions += " AND DTR_DIA_ALTA_REG = ?";
            values.add(this.getDtrDiaAltaReg());
        }

        if (this.getDtrAnoUltMod() != null && this.getDtrAnoUltMod().longValue() == -999) {
            conditions += " AND DTR_ANO_ULT_MOD IS NULL";
        } else if (this.getDtrAnoUltMod() != null) {
            conditions += " AND DTR_ANO_ULT_MOD = ?";
            values.add(this.getDtrAnoUltMod());
        }

        if (this.getDtrMesUltMod() != null && this.getDtrMesUltMod().longValue() == -999) {
            conditions += " AND DTR_MES_ULT_MOD IS NULL";
        } else if (this.getDtrMesUltMod() != null) {
            conditions += " AND DTR_MES_ULT_MOD = ?";
            values.add(this.getDtrMesUltMod());
        }

        if (this.getDtrDiaUltMod() != null && this.getDtrDiaUltMod().longValue() == -999) {
            conditions += " AND DTR_DIA_ULT_MOD IS NULL";
        } else if (this.getDtrDiaUltMod() != null) {
            conditions += " AND DTR_DIA_ULT_MOD = ?";
            values.add(this.getDtrDiaUltMod());
        }

        if (this.getDtrCveStTransac() != null && "null".equals(this.getDtrCveStTransac())) {
            conditions += " AND DTR_CVE_ST_TRANSAC IS NULL";
        } else if (this.getDtrCveStTransac() != null) {
            conditions += " AND DTR_CVE_ST_TRANSAC = ?";
            values.add(this.getDtrCveStTransac());
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
        String sql = "UPDATE DATOTRAN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DTR_NUM_MODULO = ?";
        pkValues.add(this.getDtrNumModulo());
        conditions += " AND DTR_NUM_TRANSAC = ?";
        pkValues.add(this.getDtrNumTransac());
        conditions += " AND DTR_CVE_APL_DATO = ?";
        pkValues.add(this.getDtrCveAplDato());
        fields += " DTR_ANO_ALTA_REG = ?, ";
        values.add(this.getDtrAnoAltaReg());
        fields += " DTR_MES_ALTA_REG = ?, ";
        values.add(this.getDtrMesAltaReg());
        fields += " DTR_DIA_ALTA_REG = ?, ";
        values.add(this.getDtrDiaAltaReg());
        fields += " DTR_ANO_ULT_MOD = ?, ";
        values.add(this.getDtrAnoUltMod());
        fields += " DTR_MES_ULT_MOD = ?, ";
        values.add(this.getDtrMesUltMod());
        fields += " DTR_DIA_ULT_MOD = ?, ";
        values.add(this.getDtrDiaUltMod());
        fields += " DTR_CVE_ST_TRANSAC = ?, ";
        values.add(this.getDtrCveStTransac());
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
        String sql = "INSERT INTO DATOTRAN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DTR_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getDtrNumModulo());

        fields += ", DTR_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getDtrNumTransac());

        fields += ", DTR_CVE_APL_DATO";
        fieldValues += ", ?";
        values.add(this.getDtrCveAplDato());

        fields += ", DTR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDtrAnoAltaReg());

        fields += ", DTR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDtrMesAltaReg());

        fields += ", DTR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDtrDiaAltaReg());

        fields += ", DTR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDtrAnoUltMod());

        fields += ", DTR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDtrMesUltMod());

        fields += ", DTR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDtrDiaUltMod());

        fields += ", DTR_CVE_ST_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getDtrCveStTransac());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DATOTRAN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DTR_NUM_MODULO = ?";
        values.add(this.getDtrNumModulo());
        conditions += " AND DTR_NUM_TRANSAC = ?";
        values.add(this.getDtrNumTransac());
        conditions += " AND DTR_CVE_APL_DATO = ?";
        values.add(this.getDtrCveAplDato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Datotran instance = (Datotran) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDtrNumModulo().equals(instance.getDtrNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getDtrNumTransac().equals(instance.getDtrNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getDtrCveAplDato().equals(instance.getDtrCveAplDato()))
            equalObjects = false;
        if (equalObjects && !this.getDtrAnoAltaReg().equals(instance.getDtrAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDtrMesAltaReg().equals(instance.getDtrMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDtrDiaAltaReg().equals(instance.getDtrDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDtrAnoUltMod().equals(instance.getDtrAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDtrMesUltMod().equals(instance.getDtrMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDtrDiaUltMod().equals(instance.getDtrDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDtrCveStTransac().equals(instance.getDtrCveStTransac()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Datotran result = new Datotran();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDtrNumModulo((BigDecimal) objectData.getData("DTR_NUM_MODULO"));
        result.setDtrNumTransac((BigDecimal) objectData.getData("DTR_NUM_TRANSAC"));
        result.setDtrCveAplDato((String) objectData.getData("DTR_CVE_APL_DATO"));
        result.setDtrAnoAltaReg((BigDecimal) objectData.getData("DTR_ANO_ALTA_REG"));
        result.setDtrMesAltaReg((BigDecimal) objectData.getData("DTR_MES_ALTA_REG"));
        result.setDtrDiaAltaReg((BigDecimal) objectData.getData("DTR_DIA_ALTA_REG"));
        result.setDtrAnoUltMod((BigDecimal) objectData.getData("DTR_ANO_ULT_MOD"));
        result.setDtrMesUltMod((BigDecimal) objectData.getData("DTR_MES_ULT_MOD"));
        result.setDtrDiaUltMod((BigDecimal) objectData.getData("DTR_DIA_ULT_MOD"));
        result.setDtrCveStTransac((String) objectData.getData("DTR_CVE_ST_TRANSAC"));

        return result;

    }

}
