package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTOSPROG_PK", columns = { "CTO_NUM_PROGRAMA", "CTO_NUM_COTRATO" }, sequences = { "MANUAL" })
public class Ctosprog extends DomainObject {

    BigDecimal ctoNumPrograma = null;
    BigDecimal ctoNumCotrato = null;
    String ctoDescripcion = null;
    BigDecimal ctoAnoAltaReg = null;
    BigDecimal ctoMesAltaReg = null;
    BigDecimal ctoDiaAltaReg = null;
    BigDecimal ctoAnoUltMod = null;
    BigDecimal ctoMesUltMod = null;
    BigDecimal ctoDiaUltMod = null;
    String ctoCveStCotrato = null;

    public Ctosprog() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumPrograma(BigDecimal ctoNumPrograma) {
        this.ctoNumPrograma = ctoNumPrograma;
    }

    public BigDecimal getCtoNumPrograma() {
        return this.ctoNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumCotrato(BigDecimal ctoNumCotrato) {
        this.ctoNumCotrato = ctoNumCotrato;
    }

    public BigDecimal getCtoNumCotrato() {
        return this.ctoNumCotrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoDescripcion(String ctoDescripcion) {
        this.ctoDescripcion = ctoDescripcion;
    }

    public String getCtoDescripcion() {
        return this.ctoDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoAnoAltaReg(BigDecimal ctoAnoAltaReg) {
        this.ctoAnoAltaReg = ctoAnoAltaReg;
    }

    public BigDecimal getCtoAnoAltaReg() {
        return this.ctoAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoMesAltaReg(BigDecimal ctoMesAltaReg) {
        this.ctoMesAltaReg = ctoMesAltaReg;
    }

    public BigDecimal getCtoMesAltaReg() {
        return this.ctoMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoDiaAltaReg(BigDecimal ctoDiaAltaReg) {
        this.ctoDiaAltaReg = ctoDiaAltaReg;
    }

    public BigDecimal getCtoDiaAltaReg() {
        return this.ctoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoAnoUltMod(BigDecimal ctoAnoUltMod) {
        this.ctoAnoUltMod = ctoAnoUltMod;
    }

    public BigDecimal getCtoAnoUltMod() {
        return this.ctoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoMesUltMod(BigDecimal ctoMesUltMod) {
        this.ctoMesUltMod = ctoMesUltMod;
    }

    public BigDecimal getCtoMesUltMod() {
        return this.ctoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoDiaUltMod(BigDecimal ctoDiaUltMod) {
        this.ctoDiaUltMod = ctoDiaUltMod;
    }

    public BigDecimal getCtoDiaUltMod() {
        return this.ctoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveStCotrato(String ctoCveStCotrato) {
        this.ctoCveStCotrato = ctoCveStCotrato;
    }

    public String getCtoCveStCotrato() {
        return this.ctoCveStCotrato;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTOSPROG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoNumPrograma() != null && this.getCtoNumPrograma().longValue() == -999) {
            conditions += " AND CTO_NUM_PROGRAMA IS NULL";
        } else if (this.getCtoNumPrograma() != null) {
            conditions += " AND CTO_NUM_PROGRAMA = ?";
            values.add(this.getCtoNumPrograma());
        }

        if (this.getCtoNumCotrato() != null && this.getCtoNumCotrato().longValue() == -999) {
            conditions += " AND CTO_NUM_COTRATO IS NULL";
        } else if (this.getCtoNumCotrato() != null) {
            conditions += " AND CTO_NUM_COTRATO = ?";
            values.add(this.getCtoNumCotrato());
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
        String sql = "SELECT * FROM CTOSPROG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoNumPrograma() != null && this.getCtoNumPrograma().longValue() == -999) {
            conditions += " AND CTO_NUM_PROGRAMA IS NULL";
        } else if (this.getCtoNumPrograma() != null) {
            conditions += " AND CTO_NUM_PROGRAMA = ?";
            values.add(this.getCtoNumPrograma());
        }

        if (this.getCtoNumCotrato() != null && this.getCtoNumCotrato().longValue() == -999) {
            conditions += " AND CTO_NUM_COTRATO IS NULL";
        } else if (this.getCtoNumCotrato() != null) {
            conditions += " AND CTO_NUM_COTRATO = ?";
            values.add(this.getCtoNumCotrato());
        }

        if (this.getCtoDescripcion() != null && "null".equals(this.getCtoDescripcion())) {
            conditions += " AND CTO_DESCRIPCION IS NULL";
        } else if (this.getCtoDescripcion() != null) {
            conditions += " AND CTO_DESCRIPCION = ?";
            values.add(this.getCtoDescripcion());
        }

        if (this.getCtoAnoAltaReg() != null && this.getCtoAnoAltaReg().longValue() == -999) {
            conditions += " AND CTO_ANO_ALTA_REG IS NULL";
        } else if (this.getCtoAnoAltaReg() != null) {
            conditions += " AND CTO_ANO_ALTA_REG = ?";
            values.add(this.getCtoAnoAltaReg());
        }

        if (this.getCtoMesAltaReg() != null && this.getCtoMesAltaReg().longValue() == -999) {
            conditions += " AND CTO_MES_ALTA_REG IS NULL";
        } else if (this.getCtoMesAltaReg() != null) {
            conditions += " AND CTO_MES_ALTA_REG = ?";
            values.add(this.getCtoMesAltaReg());
        }

        if (this.getCtoDiaAltaReg() != null && this.getCtoDiaAltaReg().longValue() == -999) {
            conditions += " AND CTO_DIA_ALTA_REG IS NULL";
        } else if (this.getCtoDiaAltaReg() != null) {
            conditions += " AND CTO_DIA_ALTA_REG = ?";
            values.add(this.getCtoDiaAltaReg());
        }

        if (this.getCtoAnoUltMod() != null && this.getCtoAnoUltMod().longValue() == -999) {
            conditions += " AND CTO_ANO_ULT_MOD IS NULL";
        } else if (this.getCtoAnoUltMod() != null) {
            conditions += " AND CTO_ANO_ULT_MOD = ?";
            values.add(this.getCtoAnoUltMod());
        }

        if (this.getCtoMesUltMod() != null && this.getCtoMesUltMod().longValue() == -999) {
            conditions += " AND CTO_MES_ULT_MOD IS NULL";
        } else if (this.getCtoMesUltMod() != null) {
            conditions += " AND CTO_MES_ULT_MOD = ?";
            values.add(this.getCtoMesUltMod());
        }

        if (this.getCtoDiaUltMod() != null && this.getCtoDiaUltMod().longValue() == -999) {
            conditions += " AND CTO_DIA_ULT_MOD IS NULL";
        } else if (this.getCtoDiaUltMod() != null) {
            conditions += " AND CTO_DIA_ULT_MOD = ?";
            values.add(this.getCtoDiaUltMod());
        }

        if (this.getCtoCveStCotrato() != null && "null".equals(this.getCtoCveStCotrato())) {
            conditions += " AND CTO_CVE_ST_COTRATO IS NULL";
        } else if (this.getCtoCveStCotrato() != null) {
            conditions += " AND CTO_CVE_ST_COTRATO = ?";
            values.add(this.getCtoCveStCotrato());
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
        String sql = "UPDATE CTOSPROG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTO_NUM_PROGRAMA = ?";
        pkValues.add(this.getCtoNumPrograma());
        conditions += " AND CTO_NUM_COTRATO = ?";
        pkValues.add(this.getCtoNumCotrato());
        fields += " CTO_DESCRIPCION = ?, ";
        values.add(this.getCtoDescripcion());
        fields += " CTO_ANO_ALTA_REG = ?, ";
        values.add(this.getCtoAnoAltaReg());
        fields += " CTO_MES_ALTA_REG = ?, ";
        values.add(this.getCtoMesAltaReg());
        fields += " CTO_DIA_ALTA_REG = ?, ";
        values.add(this.getCtoDiaAltaReg());
        fields += " CTO_ANO_ULT_MOD = ?, ";
        values.add(this.getCtoAnoUltMod());
        fields += " CTO_MES_ULT_MOD = ?, ";
        values.add(this.getCtoMesUltMod());
        fields += " CTO_DIA_ULT_MOD = ?, ";
        values.add(this.getCtoDiaUltMod());
        fields += " CTO_CVE_ST_COTRATO = ?, ";
        values.add(this.getCtoCveStCotrato());
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
        String sql = "INSERT INTO CTOSPROG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTO_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getCtoNumPrograma());

        fields += ", CTO_NUM_COTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNumCotrato());

        fields += ", CTO_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getCtoDescripcion());

        fields += ", CTO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtoAnoAltaReg());

        fields += ", CTO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtoMesAltaReg());

        fields += ", CTO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtoDiaAltaReg());

        fields += ", CTO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtoAnoUltMod());

        fields += ", CTO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtoMesUltMod());

        fields += ", CTO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtoDiaUltMod());

        fields += ", CTO_CVE_ST_COTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoCveStCotrato());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTOSPROG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTO_NUM_PROGRAMA = ?";
        values.add(this.getCtoNumPrograma());
        conditions += " AND CTO_NUM_COTRATO = ?";
        values.add(this.getCtoNumCotrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctosprog instance = (Ctosprog) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtoNumPrograma().equals(instance.getCtoNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumCotrato().equals(instance.getCtoNumCotrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDescripcion().equals(instance.getCtoDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAnoAltaReg().equals(instance.getCtoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMesAltaReg().equals(instance.getCtoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDiaAltaReg().equals(instance.getCtoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAnoUltMod().equals(instance.getCtoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMesUltMod().equals(instance.getCtoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDiaUltMod().equals(instance.getCtoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveStCotrato().equals(instance.getCtoCveStCotrato()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctosprog result = new Ctosprog();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtoNumPrograma((BigDecimal) objectData.getData("CTO_NUM_PROGRAMA"));
        result.setCtoNumCotrato((BigDecimal) objectData.getData("CTO_NUM_COTRATO"));
        result.setCtoDescripcion((String) objectData.getData("CTO_DESCRIPCION"));
        result.setCtoAnoAltaReg((BigDecimal) objectData.getData("CTO_ANO_ALTA_REG"));
        result.setCtoMesAltaReg((BigDecimal) objectData.getData("CTO_MES_ALTA_REG"));
        result.setCtoDiaAltaReg((BigDecimal) objectData.getData("CTO_DIA_ALTA_REG"));
        result.setCtoAnoUltMod((BigDecimal) objectData.getData("CTO_ANO_ULT_MOD"));
        result.setCtoMesUltMod((BigDecimal) objectData.getData("CTO_MES_ULT_MOD"));
        result.setCtoDiaUltMod((BigDecimal) objectData.getData("CTO_DIA_ULT_MOD"));
        result.setCtoCveStCotrato((String) objectData.getData("CTO_CVE_ST_COTRATO"));

        return result;

    }

}
