package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SESION_PK", columns = { "SES_NO_SESION" }, sequences = { "MAX" })
public class Sesion extends DomainObject {

    BigDecimal sesNoSesion = null;
    String sesNombreSesion = null;
    Long sesConvocatoria = null;
    BigDecimal sesAnoReunion = null;
    BigDecimal sesMesReunion = null;
    BigDecimal sesDiaReunion = null;
    BigDecimal sesAnoAltaReg = null;
    BigDecimal sesMesAltaReg = null;
    BigDecimal sesDiaAltaReg = null;
    BigDecimal sesAnoUltMod = null;
    BigDecimal sesMesUltMod = null;
    BigDecimal sesDiaUltMod = null;

    public Sesion() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSesNoSesion(BigDecimal sesNoSesion) {
        this.sesNoSesion = sesNoSesion;
    }

    public BigDecimal getSesNoSesion() {
        return this.sesNoSesion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSesNombreSesion(String sesNombreSesion) {
        this.sesNombreSesion = sesNombreSesion;
    }

    public String getSesNombreSesion() {
        return this.sesNombreSesion;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setSesConvocatoria(Long sesConvocatoria) {
        this.sesConvocatoria = sesConvocatoria;
    }

    public Long getSesConvocatoria() {
        return this.sesConvocatoria;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSesAnoReunion(BigDecimal sesAnoReunion) {
        this.sesAnoReunion = sesAnoReunion;
    }

    public BigDecimal getSesAnoReunion() {
        return this.sesAnoReunion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSesMesReunion(BigDecimal sesMesReunion) {
        this.sesMesReunion = sesMesReunion;
    }

    public BigDecimal getSesMesReunion() {
        return this.sesMesReunion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSesDiaReunion(BigDecimal sesDiaReunion) {
        this.sesDiaReunion = sesDiaReunion;
    }

    public BigDecimal getSesDiaReunion() {
        return this.sesDiaReunion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSesAnoAltaReg(BigDecimal sesAnoAltaReg) {
        this.sesAnoAltaReg = sesAnoAltaReg;
    }

    public BigDecimal getSesAnoAltaReg() {
        return this.sesAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSesMesAltaReg(BigDecimal sesMesAltaReg) {
        this.sesMesAltaReg = sesMesAltaReg;
    }

    public BigDecimal getSesMesAltaReg() {
        return this.sesMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSesDiaAltaReg(BigDecimal sesDiaAltaReg) {
        this.sesDiaAltaReg = sesDiaAltaReg;
    }

    public BigDecimal getSesDiaAltaReg() {
        return this.sesDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSesAnoUltMod(BigDecimal sesAnoUltMod) {
        this.sesAnoUltMod = sesAnoUltMod;
    }

    public BigDecimal getSesAnoUltMod() {
        return this.sesAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSesMesUltMod(BigDecimal sesMesUltMod) {
        this.sesMesUltMod = sesMesUltMod;
    }

    public BigDecimal getSesMesUltMod() {
        return this.sesMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSesDiaUltMod(BigDecimal sesDiaUltMod) {
        this.sesDiaUltMod = sesDiaUltMod;
    }

    public BigDecimal getSesDiaUltMod() {
        return this.sesDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SESION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSesNoSesion() != null && this.getSesNoSesion().longValue() == -999) {
            conditions += " AND SES_NO_SESION IS NULL";
        } else if (this.getSesNoSesion() != null) {
            conditions += " AND SES_NO_SESION = ?";
            values.add(this.getSesNoSesion());
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
        String sql = "SELECT * FROM SESION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSesNoSesion() != null && this.getSesNoSesion().longValue() == -999) {
            conditions += " AND SES_NO_SESION IS NULL";
        } else if (this.getSesNoSesion() != null) {
            conditions += " AND SES_NO_SESION = ?";
            values.add(this.getSesNoSesion());
        }

        if (this.getSesNombreSesion() != null && "null".equals(this.getSesNombreSesion())) {
            conditions += " AND SES_NOMBRE_SESION IS NULL";
        } else if (this.getSesNombreSesion() != null) {
            conditions += " AND SES_NOMBRE_SESION = ?";
            values.add(this.getSesNombreSesion());
        }

        if (this.getSesConvocatoria() != null && this.getSesConvocatoria() == -999) {
            conditions += " AND SES_CONVOCATORIA IS NULL";
        } else if (this.getSesConvocatoria() != null) {
            conditions += " AND SES_CONVOCATORIA = ?";
            values.add(this.getSesConvocatoria());
        }

        if (this.getSesAnoReunion() != null && this.getSesAnoReunion().longValue() == -999) {
            conditions += " AND SES_ANO_REUNION IS NULL";
        } else if (this.getSesAnoReunion() != null) {
            conditions += " AND SES_ANO_REUNION = ?";
            values.add(this.getSesAnoReunion());
        }

        if (this.getSesMesReunion() != null && this.getSesMesReunion().longValue() == -999) {
            conditions += " AND SES_MES_REUNION IS NULL";
        } else if (this.getSesMesReunion() != null) {
            conditions += " AND SES_MES_REUNION = ?";
            values.add(this.getSesMesReunion());
        }

        if (this.getSesDiaReunion() != null && this.getSesDiaReunion().longValue() == -999) {
            conditions += " AND SES_DIA_REUNION IS NULL";
        } else if (this.getSesDiaReunion() != null) {
            conditions += " AND SES_DIA_REUNION = ?";
            values.add(this.getSesDiaReunion());
        }

        if (this.getSesAnoAltaReg() != null && this.getSesAnoAltaReg().longValue() == -999) {
            conditions += " AND SES_ANO_ALTA_REG IS NULL";
        } else if (this.getSesAnoAltaReg() != null) {
            conditions += " AND SES_ANO_ALTA_REG = ?";
            values.add(this.getSesAnoAltaReg());
        }

        if (this.getSesMesAltaReg() != null && this.getSesMesAltaReg().longValue() == -999) {
            conditions += " AND SES_MES_ALTA_REG IS NULL";
        } else if (this.getSesMesAltaReg() != null) {
            conditions += " AND SES_MES_ALTA_REG = ?";
            values.add(this.getSesMesAltaReg());
        }

        if (this.getSesDiaAltaReg() != null && this.getSesDiaAltaReg().longValue() == -999) {
            conditions += " AND SES_DIA_ALTA_REG IS NULL";
        } else if (this.getSesDiaAltaReg() != null) {
            conditions += " AND SES_DIA_ALTA_REG = ?";
            values.add(this.getSesDiaAltaReg());
        }

        if (this.getSesAnoUltMod() != null && this.getSesAnoUltMod().longValue() == -999) {
            conditions += " AND SES_ANO_ULT_MOD IS NULL";
        } else if (this.getSesAnoUltMod() != null) {
            conditions += " AND SES_ANO_ULT_MOD = ?";
            values.add(this.getSesAnoUltMod());
        }

        if (this.getSesMesUltMod() != null && this.getSesMesUltMod().longValue() == -999) {
            conditions += " AND SES_MES_ULT_MOD IS NULL";
        } else if (this.getSesMesUltMod() != null) {
            conditions += " AND SES_MES_ULT_MOD = ?";
            values.add(this.getSesMesUltMod());
        }

        if (this.getSesDiaUltMod() != null && this.getSesDiaUltMod().longValue() == -999) {
            conditions += " AND SES_DIA_ULT_MOD IS NULL";
        } else if (this.getSesDiaUltMod() != null) {
            conditions += " AND SES_DIA_ULT_MOD = ?";
            values.add(this.getSesDiaUltMod());
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
        String sql = "UPDATE SESION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SES_NO_SESION = ?";
        pkValues.add(this.getSesNoSesion());
        fields += " SES_NOMBRE_SESION = ?, ";
        values.add(this.getSesNombreSesion());
        fields += " SES_CONVOCATORIA = ?, ";
        values.add(this.getSesConvocatoria());
        fields += " SES_ANO_REUNION = ?, ";
        values.add(this.getSesAnoReunion());
        fields += " SES_MES_REUNION = ?, ";
        values.add(this.getSesMesReunion());
        fields += " SES_DIA_REUNION = ?, ";
        values.add(this.getSesDiaReunion());
        fields += " SES_ANO_ALTA_REG = ?, ";
        values.add(this.getSesAnoAltaReg());
        fields += " SES_MES_ALTA_REG = ?, ";
        values.add(this.getSesMesAltaReg());
        fields += " SES_DIA_ALTA_REG = ?, ";
        values.add(this.getSesDiaAltaReg());
        fields += " SES_ANO_ULT_MOD = ?, ";
        values.add(this.getSesAnoUltMod());
        fields += " SES_MES_ULT_MOD = ?, ";
        values.add(this.getSesMesUltMod());
        fields += " SES_DIA_ULT_MOD = ?, ";
        values.add(this.getSesDiaUltMod());
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
        String sql = "INSERT INTO SESION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SES_NO_SESION";
        fieldValues += ", ?";
        values.add(this.getSesNoSesion());

        fields += ", SES_NOMBRE_SESION";
        fieldValues += ", ?";
        values.add(this.getSesNombreSesion());

        fields += ", SES_CONVOCATORIA";
        fieldValues += ", ?";
        values.add(this.getSesConvocatoria());

        fields += ", SES_ANO_REUNION";
        fieldValues += ", ?";
        values.add(this.getSesAnoReunion());

        fields += ", SES_MES_REUNION";
        fieldValues += ", ?";
        values.add(this.getSesMesReunion());

        fields += ", SES_DIA_REUNION";
        fieldValues += ", ?";
        values.add(this.getSesDiaReunion());

        fields += ", SES_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSesAnoAltaReg());

        fields += ", SES_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSesMesAltaReg());

        fields += ", SES_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSesDiaAltaReg());

        fields += ", SES_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSesAnoUltMod());

        fields += ", SES_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSesMesUltMod());

        fields += ", SES_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSesDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SESION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SES_NO_SESION = ?";
        values.add(this.getSesNoSesion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Sesion instance = (Sesion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSesNoSesion().equals(instance.getSesNoSesion()))
            equalObjects = false;
        if (equalObjects && !this.getSesNombreSesion().equals(instance.getSesNombreSesion()))
            equalObjects = false;
        if (equalObjects && !this.getSesConvocatoria().equals(instance.getSesConvocatoria()))
            equalObjects = false;
        if (equalObjects && !this.getSesAnoReunion().equals(instance.getSesAnoReunion()))
            equalObjects = false;
        if (equalObjects && !this.getSesMesReunion().equals(instance.getSesMesReunion()))
            equalObjects = false;
        if (equalObjects && !this.getSesDiaReunion().equals(instance.getSesDiaReunion()))
            equalObjects = false;
        if (equalObjects && !this.getSesAnoAltaReg().equals(instance.getSesAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSesMesAltaReg().equals(instance.getSesMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSesDiaAltaReg().equals(instance.getSesDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSesAnoUltMod().equals(instance.getSesAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSesMesUltMod().equals(instance.getSesMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSesDiaUltMod().equals(instance.getSesDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Sesion result = new Sesion();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSesNoSesion((BigDecimal) objectData.getData("SES_NO_SESION"));
        result.setSesNombreSesion((String) objectData.getData("SES_NOMBRE_SESION"));
        result.setSesConvocatoria((Long) objectData.getData("SES_CONVOCATORIA"));
        result.setSesAnoReunion((BigDecimal) objectData.getData("SES_ANO_REUNION"));
        result.setSesMesReunion((BigDecimal) objectData.getData("SES_MES_REUNION"));
        result.setSesDiaReunion((BigDecimal) objectData.getData("SES_DIA_REUNION"));
        result.setSesAnoAltaReg((BigDecimal) objectData.getData("SES_ANO_ALTA_REG"));
        result.setSesMesAltaReg((BigDecimal) objectData.getData("SES_MES_ALTA_REG"));
        result.setSesDiaAltaReg((BigDecimal) objectData.getData("SES_DIA_ALTA_REG"));
        result.setSesAnoUltMod((BigDecimal) objectData.getData("SES_ANO_ULT_MOD"));
        result.setSesMesUltMod((BigDecimal) objectData.getData("SES_MES_ULT_MOD"));
        result.setSesDiaUltMod((BigDecimal) objectData.getData("SES_DIA_ULT_MOD"));

        return result;

    }

}
