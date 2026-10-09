package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SEGTO_PK", columns = { "SEG_NO_SESION", "SEG_ACU_CLAVE", "SEG_ID_SEGTO" }, sequences = { "MANUAL" })
public class Segto extends DomainObject {

    BigDecimal segNoSesion = null;
    String segAcuClave = null;
    BigDecimal segIdSegto = null;
    Long segDescSegto = null;
    BigDecimal segAnoSegto = null;
    BigDecimal segMesSegto = null;
    BigDecimal segDiaSegto = null;
    BigDecimal segAnoAltaReg = null;
    BigDecimal segMesAltaReg = null;
    BigDecimal segDiaAltaReg = null;
    BigDecimal segAnoUltMod = null;
    BigDecimal segMesUltMod = null;
    BigDecimal segDiaUltMod = null;

    public Segto() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSegNoSesion(BigDecimal segNoSesion) {
        this.segNoSesion = segNoSesion;
    }

    public BigDecimal getSegNoSesion() {
        return this.segNoSesion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSegAcuClave(String segAcuClave) {
        this.segAcuClave = segAcuClave;
    }

    public String getSegAcuClave() {
        return this.segAcuClave;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSegIdSegto(BigDecimal segIdSegto) {
        this.segIdSegto = segIdSegto;
    }

    public BigDecimal getSegIdSegto() {
        return this.segIdSegto;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setSegDescSegto(Long segDescSegto) {
        this.segDescSegto = segDescSegto;
    }

    public Long getSegDescSegto() {
        return this.segDescSegto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSegAnoSegto(BigDecimal segAnoSegto) {
        this.segAnoSegto = segAnoSegto;
    }

    public BigDecimal getSegAnoSegto() {
        return this.segAnoSegto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSegMesSegto(BigDecimal segMesSegto) {
        this.segMesSegto = segMesSegto;
    }

    public BigDecimal getSegMesSegto() {
        return this.segMesSegto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSegDiaSegto(BigDecimal segDiaSegto) {
        this.segDiaSegto = segDiaSegto;
    }

    public BigDecimal getSegDiaSegto() {
        return this.segDiaSegto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSegAnoAltaReg(BigDecimal segAnoAltaReg) {
        this.segAnoAltaReg = segAnoAltaReg;
    }

    public BigDecimal getSegAnoAltaReg() {
        return this.segAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSegMesAltaReg(BigDecimal segMesAltaReg) {
        this.segMesAltaReg = segMesAltaReg;
    }

    public BigDecimal getSegMesAltaReg() {
        return this.segMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSegDiaAltaReg(BigDecimal segDiaAltaReg) {
        this.segDiaAltaReg = segDiaAltaReg;
    }

    public BigDecimal getSegDiaAltaReg() {
        return this.segDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSegAnoUltMod(BigDecimal segAnoUltMod) {
        this.segAnoUltMod = segAnoUltMod;
    }

    public BigDecimal getSegAnoUltMod() {
        return this.segAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSegMesUltMod(BigDecimal segMesUltMod) {
        this.segMesUltMod = segMesUltMod;
    }

    public BigDecimal getSegMesUltMod() {
        return this.segMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSegDiaUltMod(BigDecimal segDiaUltMod) {
        this.segDiaUltMod = segDiaUltMod;
    }

    public BigDecimal getSegDiaUltMod() {
        return this.segDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SEGTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSegNoSesion() != null && this.getSegNoSesion().longValue() == -999) {
            conditions += " AND SEG_NO_SESION IS NULL";
        } else if (this.getSegNoSesion() != null) {
            conditions += " AND SEG_NO_SESION = ?";
            values.add(this.getSegNoSesion());
        }

        if (this.getSegAcuClave() != null && "null".equals(this.getSegAcuClave())) {
            conditions += " AND SEG_ACU_CLAVE IS NULL";
        } else if (this.getSegAcuClave() != null) {
            conditions += " AND SEG_ACU_CLAVE = ?";
            values.add(this.getSegAcuClave());
        }

        if (this.getSegIdSegto() != null && this.getSegIdSegto().longValue() == -999) {
            conditions += " AND SEG_ID_SEGTO IS NULL";
        } else if (this.getSegIdSegto() != null) {
            conditions += " AND SEG_ID_SEGTO = ?";
            values.add(this.getSegIdSegto());
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
        String sql = "SELECT * FROM SEGTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSegNoSesion() != null && this.getSegNoSesion().longValue() == -999) {
            conditions += " AND SEG_NO_SESION IS NULL";
        } else if (this.getSegNoSesion() != null) {
            conditions += " AND SEG_NO_SESION = ?";
            values.add(this.getSegNoSesion());
        }

        if (this.getSegAcuClave() != null && "null".equals(this.getSegAcuClave())) {
            conditions += " AND SEG_ACU_CLAVE IS NULL";
        } else if (this.getSegAcuClave() != null) {
            conditions += " AND SEG_ACU_CLAVE = ?";
            values.add(this.getSegAcuClave());
        }

        if (this.getSegIdSegto() != null && this.getSegIdSegto().longValue() == -999) {
            conditions += " AND SEG_ID_SEGTO IS NULL";
        } else if (this.getSegIdSegto() != null) {
            conditions += " AND SEG_ID_SEGTO = ?";
            values.add(this.getSegIdSegto());
        }

        if (this.getSegDescSegto() != null && this.getSegDescSegto() == -999) {
            conditions += " AND SEG_DESC_SEGTO IS NULL";
        } else if (this.getSegDescSegto() != null) {
            conditions += " AND SEG_DESC_SEGTO = ?";
            values.add(this.getSegDescSegto());
        }

        if (this.getSegAnoSegto() != null && this.getSegAnoSegto().longValue() == -999) {
            conditions += " AND SEG_ANO_SEGTO IS NULL";
        } else if (this.getSegAnoSegto() != null) {
            conditions += " AND SEG_ANO_SEGTO = ?";
            values.add(this.getSegAnoSegto());
        }

        if (this.getSegMesSegto() != null && this.getSegMesSegto().longValue() == -999) {
            conditions += " AND SEG_MES_SEGTO IS NULL";
        } else if (this.getSegMesSegto() != null) {
            conditions += " AND SEG_MES_SEGTO = ?";
            values.add(this.getSegMesSegto());
        }

        if (this.getSegDiaSegto() != null && this.getSegDiaSegto().longValue() == -999) {
            conditions += " AND SEG_DIA_SEGTO IS NULL";
        } else if (this.getSegDiaSegto() != null) {
            conditions += " AND SEG_DIA_SEGTO = ?";
            values.add(this.getSegDiaSegto());
        }

        if (this.getSegAnoAltaReg() != null && this.getSegAnoAltaReg().longValue() == -999) {
            conditions += " AND SEG_ANO_ALTA_REG IS NULL";
        } else if (this.getSegAnoAltaReg() != null) {
            conditions += " AND SEG_ANO_ALTA_REG = ?";
            values.add(this.getSegAnoAltaReg());
        }

        if (this.getSegMesAltaReg() != null && this.getSegMesAltaReg().longValue() == -999) {
            conditions += " AND SEG_MES_ALTA_REG IS NULL";
        } else if (this.getSegMesAltaReg() != null) {
            conditions += " AND SEG_MES_ALTA_REG = ?";
            values.add(this.getSegMesAltaReg());
        }

        if (this.getSegDiaAltaReg() != null && this.getSegDiaAltaReg().longValue() == -999) {
            conditions += " AND SEG_DIA_ALTA_REG IS NULL";
        } else if (this.getSegDiaAltaReg() != null) {
            conditions += " AND SEG_DIA_ALTA_REG = ?";
            values.add(this.getSegDiaAltaReg());
        }

        if (this.getSegAnoUltMod() != null && this.getSegAnoUltMod().longValue() == -999) {
            conditions += " AND SEG_ANO_ULT_MOD IS NULL";
        } else if (this.getSegAnoUltMod() != null) {
            conditions += " AND SEG_ANO_ULT_MOD = ?";
            values.add(this.getSegAnoUltMod());
        }

        if (this.getSegMesUltMod() != null && this.getSegMesUltMod().longValue() == -999) {
            conditions += " AND SEG_MES_ULT_MOD IS NULL";
        } else if (this.getSegMesUltMod() != null) {
            conditions += " AND SEG_MES_ULT_MOD = ?";
            values.add(this.getSegMesUltMod());
        }

        if (this.getSegDiaUltMod() != null && this.getSegDiaUltMod().longValue() == -999) {
            conditions += " AND SEG_DIA_ULT_MOD IS NULL";
        } else if (this.getSegDiaUltMod() != null) {
            conditions += " AND SEG_DIA_ULT_MOD = ?";
            values.add(this.getSegDiaUltMod());
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
        String sql = "UPDATE SEGTO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SEG_NO_SESION = ?";
        pkValues.add(this.getSegNoSesion());
        conditions += " AND SEG_ACU_CLAVE = ?";
        pkValues.add(this.getSegAcuClave());
        conditions += " AND SEG_ID_SEGTO = ?";
        pkValues.add(this.getSegIdSegto());
        fields += " SEG_DESC_SEGTO = ?, ";
        values.add(this.getSegDescSegto());
        fields += " SEG_ANO_SEGTO = ?, ";
        values.add(this.getSegAnoSegto());
        fields += " SEG_MES_SEGTO = ?, ";
        values.add(this.getSegMesSegto());
        fields += " SEG_DIA_SEGTO = ?, ";
        values.add(this.getSegDiaSegto());
        fields += " SEG_ANO_ALTA_REG = ?, ";
        values.add(this.getSegAnoAltaReg());
        fields += " SEG_MES_ALTA_REG = ?, ";
        values.add(this.getSegMesAltaReg());
        fields += " SEG_DIA_ALTA_REG = ?, ";
        values.add(this.getSegDiaAltaReg());
        fields += " SEG_ANO_ULT_MOD = ?, ";
        values.add(this.getSegAnoUltMod());
        fields += " SEG_MES_ULT_MOD = ?, ";
        values.add(this.getSegMesUltMod());
        fields += " SEG_DIA_ULT_MOD = ?, ";
        values.add(this.getSegDiaUltMod());
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
        String sql = "INSERT INTO SEGTO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SEG_NO_SESION";
        fieldValues += ", ?";
        values.add(this.getSegNoSesion());

        fields += ", SEG_ACU_CLAVE";
        fieldValues += ", ?";
        values.add(this.getSegAcuClave());

        fields += ", SEG_ID_SEGTO";
        fieldValues += ", ?";
        values.add(this.getSegIdSegto());

        fields += ", SEG_DESC_SEGTO";
        fieldValues += ", ?";
        values.add(this.getSegDescSegto());

        fields += ", SEG_ANO_SEGTO";
        fieldValues += ", ?";
        values.add(this.getSegAnoSegto());

        fields += ", SEG_MES_SEGTO";
        fieldValues += ", ?";
        values.add(this.getSegMesSegto());

        fields += ", SEG_DIA_SEGTO";
        fieldValues += ", ?";
        values.add(this.getSegDiaSegto());

        fields += ", SEG_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSegAnoAltaReg());

        fields += ", SEG_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSegMesAltaReg());

        fields += ", SEG_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSegDiaAltaReg());

        fields += ", SEG_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSegAnoUltMod());

        fields += ", SEG_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSegMesUltMod());

        fields += ", SEG_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSegDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SEGTO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SEG_NO_SESION = ?";
        values.add(this.getSegNoSesion());
        conditions += " AND SEG_ACU_CLAVE = ?";
        values.add(this.getSegAcuClave());
        conditions += " AND SEG_ID_SEGTO = ?";
        values.add(this.getSegIdSegto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Segto instance = (Segto) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSegNoSesion().equals(instance.getSegNoSesion()))
            equalObjects = false;
        if (equalObjects && !this.getSegAcuClave().equals(instance.getSegAcuClave()))
            equalObjects = false;
        if (equalObjects && !this.getSegIdSegto().equals(instance.getSegIdSegto()))
            equalObjects = false;
        if (equalObjects && !this.getSegDescSegto().equals(instance.getSegDescSegto()))
            equalObjects = false;
        if (equalObjects && !this.getSegAnoSegto().equals(instance.getSegAnoSegto()))
            equalObjects = false;
        if (equalObjects && !this.getSegMesSegto().equals(instance.getSegMesSegto()))
            equalObjects = false;
        if (equalObjects && !this.getSegDiaSegto().equals(instance.getSegDiaSegto()))
            equalObjects = false;
        if (equalObjects && !this.getSegAnoAltaReg().equals(instance.getSegAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSegMesAltaReg().equals(instance.getSegMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSegDiaAltaReg().equals(instance.getSegDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSegAnoUltMod().equals(instance.getSegAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSegMesUltMod().equals(instance.getSegMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSegDiaUltMod().equals(instance.getSegDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Segto result = new Segto();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSegNoSesion((BigDecimal) objectData.getData("SEG_NO_SESION"));
        result.setSegAcuClave((String) objectData.getData("SEG_ACU_CLAVE"));
        result.setSegIdSegto((BigDecimal) objectData.getData("SEG_ID_SEGTO"));
        result.setSegDescSegto((Long) objectData.getData("SEG_DESC_SEGTO"));
        result.setSegAnoSegto((BigDecimal) objectData.getData("SEG_ANO_SEGTO"));
        result.setSegMesSegto((BigDecimal) objectData.getData("SEG_MES_SEGTO"));
        result.setSegDiaSegto((BigDecimal) objectData.getData("SEG_DIA_SEGTO"));
        result.setSegAnoAltaReg((BigDecimal) objectData.getData("SEG_ANO_ALTA_REG"));
        result.setSegMesAltaReg((BigDecimal) objectData.getData("SEG_MES_ALTA_REG"));
        result.setSegDiaAltaReg((BigDecimal) objectData.getData("SEG_DIA_ALTA_REG"));
        result.setSegAnoUltMod((BigDecimal) objectData.getData("SEG_ANO_ULT_MOD"));
        result.setSegMesUltMod((BigDecimal) objectData.getData("SEG_MES_ULT_MOD"));
        result.setSegDiaUltMod((BigDecimal) objectData.getData("SEG_DIA_ULT_MOD"));

        return result;

    }

}
