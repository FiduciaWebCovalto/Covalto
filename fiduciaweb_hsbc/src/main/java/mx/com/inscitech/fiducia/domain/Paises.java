package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PAISES_PK", columns = { "PAI_NUM_PAIS" }, sequences = { "MAX" })
public class Paises extends DomainObject {

    BigDecimal paiNumPais = null;
    String paiNomPais = null;
    String paiAbrPais = null;
    BigDecimal paiAnoAltaReg = null;
    BigDecimal paiMesAltaReg = null;
    BigDecimal paiDiaAltaReg = null;
    BigDecimal paiAnoUltMod = null;
    BigDecimal paiMesUltMod = null;
    BigDecimal paiDiaUltMod = null;
    String paiCveStPais = null;

    public Paises() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPaiNumPais(BigDecimal paiNumPais) {
        this.paiNumPais = paiNumPais;
    }

    public BigDecimal getPaiNumPais() {
        return this.paiNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaiNomPais(String paiNomPais) {
        this.paiNomPais = paiNomPais;
    }

    public String getPaiNomPais() {
        return this.paiNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaiAbrPais(String paiAbrPais) {
        this.paiAbrPais = paiAbrPais;
    }

    public String getPaiAbrPais() {
        return this.paiAbrPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPaiAnoAltaReg(BigDecimal paiAnoAltaReg) {
        this.paiAnoAltaReg = paiAnoAltaReg;
    }

    public BigDecimal getPaiAnoAltaReg() {
        return this.paiAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaiMesAltaReg(BigDecimal paiMesAltaReg) {
        this.paiMesAltaReg = paiMesAltaReg;
    }

    public BigDecimal getPaiMesAltaReg() {
        return this.paiMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaiDiaAltaReg(BigDecimal paiDiaAltaReg) {
        this.paiDiaAltaReg = paiDiaAltaReg;
    }

    public BigDecimal getPaiDiaAltaReg() {
        return this.paiDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPaiAnoUltMod(BigDecimal paiAnoUltMod) {
        this.paiAnoUltMod = paiAnoUltMod;
    }

    public BigDecimal getPaiAnoUltMod() {
        return this.paiAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaiMesUltMod(BigDecimal paiMesUltMod) {
        this.paiMesUltMod = paiMesUltMod;
    }

    public BigDecimal getPaiMesUltMod() {
        return this.paiMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaiDiaUltMod(BigDecimal paiDiaUltMod) {
        this.paiDiaUltMod = paiDiaUltMod;
    }

    public BigDecimal getPaiDiaUltMod() {
        return this.paiDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaiCveStPais(String paiCveStPais) {
        this.paiCveStPais = paiCveStPais;
    }

    public String getPaiCveStPais() {
        return this.paiCveStPais;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PAISES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPaiNumPais() != null && this.getPaiNumPais().longValue() == -999) {
            conditions += " AND PAI_NUM_PAIS IS NULL";
        } else if (this.getPaiNumPais() != null) {
            conditions += " AND PAI_NUM_PAIS = ?";
            values.add(this.getPaiNumPais());
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
        String sql = "SELECT * FROM PAISES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPaiNumPais() != null && this.getPaiNumPais().longValue() == -999) {
            conditions += " AND PAI_NUM_PAIS IS NULL";
        } else if (this.getPaiNumPais() != null) {
            conditions += " AND PAI_NUM_PAIS = ?";
            values.add(this.getPaiNumPais());
        }

        if (this.getPaiNomPais() != null && "null".equals(this.getPaiNomPais())) {
            conditions += " AND PAI_NOM_PAIS IS NULL";
        } else if (this.getPaiNomPais() != null) {
            conditions += " AND PAI_NOM_PAIS = ?";
            values.add(this.getPaiNomPais());
        }

        if (this.getPaiAbrPais() != null && "null".equals(this.getPaiAbrPais())) {
            conditions += " AND PAI_ABR_PAIS IS NULL";
        } else if (this.getPaiAbrPais() != null) {
            conditions += " AND PAI_ABR_PAIS = ?";
            values.add(this.getPaiAbrPais());
        }

        if (this.getPaiAnoAltaReg() != null && this.getPaiAnoAltaReg().longValue() == -999) {
            conditions += " AND PAI_ANO_ALTA_REG IS NULL";
        } else if (this.getPaiAnoAltaReg() != null) {
            conditions += " AND PAI_ANO_ALTA_REG = ?";
            values.add(this.getPaiAnoAltaReg());
        }

        if (this.getPaiMesAltaReg() != null && this.getPaiMesAltaReg().longValue() == -999) {
            conditions += " AND PAI_MES_ALTA_REG IS NULL";
        } else if (this.getPaiMesAltaReg() != null) {
            conditions += " AND PAI_MES_ALTA_REG = ?";
            values.add(this.getPaiMesAltaReg());
        }

        if (this.getPaiDiaAltaReg() != null && this.getPaiDiaAltaReg().longValue() == -999) {
            conditions += " AND PAI_DIA_ALTA_REG IS NULL";
        } else if (this.getPaiDiaAltaReg() != null) {
            conditions += " AND PAI_DIA_ALTA_REG = ?";
            values.add(this.getPaiDiaAltaReg());
        }

        if (this.getPaiAnoUltMod() != null && this.getPaiAnoUltMod().longValue() == -999) {
            conditions += " AND PAI_ANO_ULT_MOD IS NULL";
        } else if (this.getPaiAnoUltMod() != null) {
            conditions += " AND PAI_ANO_ULT_MOD = ?";
            values.add(this.getPaiAnoUltMod());
        }

        if (this.getPaiMesUltMod() != null && this.getPaiMesUltMod().longValue() == -999) {
            conditions += " AND PAI_MES_ULT_MOD IS NULL";
        } else if (this.getPaiMesUltMod() != null) {
            conditions += " AND PAI_MES_ULT_MOD = ?";
            values.add(this.getPaiMesUltMod());
        }

        if (this.getPaiDiaUltMod() != null && this.getPaiDiaUltMod().longValue() == -999) {
            conditions += " AND PAI_DIA_ULT_MOD IS NULL";
        } else if (this.getPaiDiaUltMod() != null) {
            conditions += " AND PAI_DIA_ULT_MOD = ?";
            values.add(this.getPaiDiaUltMod());
        }

        if (this.getPaiCveStPais() != null && "null".equals(this.getPaiCveStPais())) {
            conditions += " AND PAI_CVE_ST_PAIS IS NULL";
        } else if (this.getPaiCveStPais() != null) {
            conditions += " AND PAI_CVE_ST_PAIS = ?";
            values.add(this.getPaiCveStPais());
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
        String sql = "UPDATE PAISES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAI_NUM_PAIS = ?";
        pkValues.add(this.getPaiNumPais());
        fields += " PAI_NOM_PAIS = ?, ";
        values.add(this.getPaiNomPais());
        fields += " PAI_ABR_PAIS = ?, ";
        values.add(this.getPaiAbrPais());
        fields += " PAI_ANO_ALTA_REG = ?, ";
        values.add(this.getPaiAnoAltaReg());
        fields += " PAI_MES_ALTA_REG = ?, ";
        values.add(this.getPaiMesAltaReg());
        fields += " PAI_DIA_ALTA_REG = ?, ";
        values.add(this.getPaiDiaAltaReg());
        fields += " PAI_ANO_ULT_MOD = ?, ";
        values.add(this.getPaiAnoUltMod());
        fields += " PAI_MES_ULT_MOD = ?, ";
        values.add(this.getPaiMesUltMod());
        fields += " PAI_DIA_ULT_MOD = ?, ";
        values.add(this.getPaiDiaUltMod());
        fields += " PAI_CVE_ST_PAIS = ?, ";
        values.add(this.getPaiCveStPais());
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
        String sql = "INSERT INTO PAISES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAI_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getPaiNumPais());

        fields += ", PAI_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getPaiNomPais());

        fields += ", PAI_ABR_PAIS";
        fieldValues += ", ?";
        values.add(this.getPaiAbrPais());

        fields += ", PAI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPaiAnoAltaReg());

        fields += ", PAI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPaiMesAltaReg());

        fields += ", PAI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPaiDiaAltaReg());

        fields += ", PAI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPaiAnoUltMod());

        fields += ", PAI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPaiMesUltMod());

        fields += ", PAI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPaiDiaUltMod());

        fields += ", PAI_CVE_ST_PAIS";
        fieldValues += ", ?";
        values.add(this.getPaiCveStPais());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PAISES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAI_NUM_PAIS = ?";
        values.add(this.getPaiNumPais());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Paises instance = (Paises) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPaiNumPais().equals(instance.getPaiNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getPaiNomPais().equals(instance.getPaiNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getPaiAbrPais().equals(instance.getPaiAbrPais()))
            equalObjects = false;
        if (equalObjects && !this.getPaiAnoAltaReg().equals(instance.getPaiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPaiMesAltaReg().equals(instance.getPaiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPaiDiaAltaReg().equals(instance.getPaiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPaiAnoUltMod().equals(instance.getPaiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPaiMesUltMod().equals(instance.getPaiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPaiDiaUltMod().equals(instance.getPaiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPaiCveStPais().equals(instance.getPaiCveStPais()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Paises result = new Paises();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPaiNumPais((BigDecimal) objectData.getData("PAI_NUM_PAIS"));
        result.setPaiNomPais((String) objectData.getData("PAI_NOM_PAIS"));
        result.setPaiAbrPais((String) objectData.getData("PAI_ABR_PAIS"));
        result.setPaiAnoAltaReg((BigDecimal) objectData.getData("PAI_ANO_ALTA_REG"));
        result.setPaiMesAltaReg((BigDecimal) objectData.getData("PAI_MES_ALTA_REG"));
        result.setPaiDiaAltaReg((BigDecimal) objectData.getData("PAI_DIA_ALTA_REG"));
        result.setPaiAnoUltMod((BigDecimal) objectData.getData("PAI_ANO_ULT_MOD"));
        result.setPaiMesUltMod((BigDecimal) objectData.getData("PAI_MES_ULT_MOD"));
        result.setPaiDiaUltMod((BigDecimal) objectData.getData("PAI_DIA_ULT_MOD"));
        result.setPaiCveStPais((String) objectData.getData("PAI_CVE_ST_PAIS"));

        return result;

    }

}
