package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GPOTRAB_PK", columns = { "GPO_NUM_USUARIO", "GPO_NO_SESION" }, sequences = { "MANUAL" })
public class Gpotrab extends DomainObject {

    BigDecimal gpoNumUsuario = null;
    BigDecimal gpoNoSesion = null;
    BigDecimal gpoConfirmo = null;
    BigDecimal gpoAnoAltaReg = null;
    BigDecimal gpoMesAltaReg = null;
    BigDecimal gpoDiaAltaReg = null;
    BigDecimal gpoAnoUltMod = null;
    BigDecimal gpoMesUltMod = null;
    BigDecimal gpoDiaUltMod = null;

    public Gpotrab() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGpoNumUsuario(BigDecimal gpoNumUsuario) {
        this.gpoNumUsuario = gpoNumUsuario;
    }

    public BigDecimal getGpoNumUsuario() {
        return this.gpoNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGpoNoSesion(BigDecimal gpoNoSesion) {
        this.gpoNoSesion = gpoNoSesion;
    }

    public BigDecimal getGpoNoSesion() {
        return this.gpoNoSesion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGpoConfirmo(BigDecimal gpoConfirmo) {
        this.gpoConfirmo = gpoConfirmo;
    }

    public BigDecimal getGpoConfirmo() {
        return this.gpoConfirmo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGpoAnoAltaReg(BigDecimal gpoAnoAltaReg) {
        this.gpoAnoAltaReg = gpoAnoAltaReg;
    }

    public BigDecimal getGpoAnoAltaReg() {
        return this.gpoAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGpoMesAltaReg(BigDecimal gpoMesAltaReg) {
        this.gpoMesAltaReg = gpoMesAltaReg;
    }

    public BigDecimal getGpoMesAltaReg() {
        return this.gpoMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGpoDiaAltaReg(BigDecimal gpoDiaAltaReg) {
        this.gpoDiaAltaReg = gpoDiaAltaReg;
    }

    public BigDecimal getGpoDiaAltaReg() {
        return this.gpoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGpoAnoUltMod(BigDecimal gpoAnoUltMod) {
        this.gpoAnoUltMod = gpoAnoUltMod;
    }

    public BigDecimal getGpoAnoUltMod() {
        return this.gpoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGpoMesUltMod(BigDecimal gpoMesUltMod) {
        this.gpoMesUltMod = gpoMesUltMod;
    }

    public BigDecimal getGpoMesUltMod() {
        return this.gpoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGpoDiaUltMod(BigDecimal gpoDiaUltMod) {
        this.gpoDiaUltMod = gpoDiaUltMod;
    }

    public BigDecimal getGpoDiaUltMod() {
        return this.gpoDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GPOTRAB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGpoNumUsuario() != null && this.getGpoNumUsuario().longValue() == -999) {
            conditions += " AND GPO_NUM_USUARIO IS NULL";
        } else if (this.getGpoNumUsuario() != null) {
            conditions += " AND GPO_NUM_USUARIO = ?";
            values.add(this.getGpoNumUsuario());
        }

        if (this.getGpoNoSesion() != null && this.getGpoNoSesion().longValue() == -999) {
            conditions += " AND GPO_NO_SESION IS NULL";
        } else if (this.getGpoNoSesion() != null) {
            conditions += " AND GPO_NO_SESION = ?";
            values.add(this.getGpoNoSesion());
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
        String sql = "SELECT * FROM GPOTRAB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGpoNumUsuario() != null && this.getGpoNumUsuario().longValue() == -999) {
            conditions += " AND GPO_NUM_USUARIO IS NULL";
        } else if (this.getGpoNumUsuario() != null) {
            conditions += " AND GPO_NUM_USUARIO = ?";
            values.add(this.getGpoNumUsuario());
        }

        if (this.getGpoNoSesion() != null && this.getGpoNoSesion().longValue() == -999) {
            conditions += " AND GPO_NO_SESION IS NULL";
        } else if (this.getGpoNoSesion() != null) {
            conditions += " AND GPO_NO_SESION = ?";
            values.add(this.getGpoNoSesion());
        }

        if (this.getGpoConfirmo() != null && this.getGpoConfirmo().longValue() == -999) {
            conditions += " AND GPO_CONFIRMO IS NULL";
        } else if (this.getGpoConfirmo() != null) {
            conditions += " AND GPO_CONFIRMO = ?";
            values.add(this.getGpoConfirmo());
        }

        if (this.getGpoAnoAltaReg() != null && this.getGpoAnoAltaReg().longValue() == -999) {
            conditions += " AND GPO_ANO_ALTA_REG IS NULL";
        } else if (this.getGpoAnoAltaReg() != null) {
            conditions += " AND GPO_ANO_ALTA_REG = ?";
            values.add(this.getGpoAnoAltaReg());
        }

        if (this.getGpoMesAltaReg() != null && this.getGpoMesAltaReg().longValue() == -999) {
            conditions += " AND GPO_MES_ALTA_REG IS NULL";
        } else if (this.getGpoMesAltaReg() != null) {
            conditions += " AND GPO_MES_ALTA_REG = ?";
            values.add(this.getGpoMesAltaReg());
        }

        if (this.getGpoDiaAltaReg() != null && this.getGpoDiaAltaReg().longValue() == -999) {
            conditions += " AND GPO_DIA_ALTA_REG IS NULL";
        } else if (this.getGpoDiaAltaReg() != null) {
            conditions += " AND GPO_DIA_ALTA_REG = ?";
            values.add(this.getGpoDiaAltaReg());
        }

        if (this.getGpoAnoUltMod() != null && this.getGpoAnoUltMod().longValue() == -999) {
            conditions += " AND GPO_ANO_ULT_MOD IS NULL";
        } else if (this.getGpoAnoUltMod() != null) {
            conditions += " AND GPO_ANO_ULT_MOD = ?";
            values.add(this.getGpoAnoUltMod());
        }

        if (this.getGpoMesUltMod() != null && this.getGpoMesUltMod().longValue() == -999) {
            conditions += " AND GPO_MES_ULT_MOD IS NULL";
        } else if (this.getGpoMesUltMod() != null) {
            conditions += " AND GPO_MES_ULT_MOD = ?";
            values.add(this.getGpoMesUltMod());
        }

        if (this.getGpoDiaUltMod() != null && this.getGpoDiaUltMod().longValue() == -999) {
            conditions += " AND GPO_DIA_ULT_MOD IS NULL";
        } else if (this.getGpoDiaUltMod() != null) {
            conditions += " AND GPO_DIA_ULT_MOD = ?";
            values.add(this.getGpoDiaUltMod());
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
        String sql = "UPDATE GPOTRAB SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GPO_NUM_USUARIO = ?";
        pkValues.add(this.getGpoNumUsuario());
        conditions += " AND GPO_NO_SESION = ?";
        pkValues.add(this.getGpoNoSesion());
        fields += " GPO_CONFIRMO = ?, ";
        values.add(this.getGpoConfirmo());
        fields += " GPO_ANO_ALTA_REG = ?, ";
        values.add(this.getGpoAnoAltaReg());
        fields += " GPO_MES_ALTA_REG = ?, ";
        values.add(this.getGpoMesAltaReg());
        fields += " GPO_DIA_ALTA_REG = ?, ";
        values.add(this.getGpoDiaAltaReg());
        fields += " GPO_ANO_ULT_MOD = ?, ";
        values.add(this.getGpoAnoUltMod());
        fields += " GPO_MES_ULT_MOD = ?, ";
        values.add(this.getGpoMesUltMod());
        fields += " GPO_DIA_ULT_MOD = ?, ";
        values.add(this.getGpoDiaUltMod());
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
        String sql = "INSERT INTO GPOTRAB ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GPO_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getGpoNumUsuario());

        fields += ", GPO_NO_SESION";
        fieldValues += ", ?";
        values.add(this.getGpoNoSesion());

        fields += ", GPO_CONFIRMO";
        fieldValues += ", ?";
        values.add(this.getGpoConfirmo());

        fields += ", GPO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGpoAnoAltaReg());

        fields += ", GPO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGpoMesAltaReg());

        fields += ", GPO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGpoDiaAltaReg());

        fields += ", GPO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGpoAnoUltMod());

        fields += ", GPO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGpoMesUltMod());

        fields += ", GPO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGpoDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GPOTRAB WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GPO_NUM_USUARIO = ?";
        values.add(this.getGpoNumUsuario());
        conditions += " AND GPO_NO_SESION = ?";
        values.add(this.getGpoNoSesion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Gpotrab instance = (Gpotrab) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGpoNumUsuario().equals(instance.getGpoNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getGpoNoSesion().equals(instance.getGpoNoSesion()))
            equalObjects = false;
        if (equalObjects && !this.getGpoConfirmo().equals(instance.getGpoConfirmo()))
            equalObjects = false;
        if (equalObjects && !this.getGpoAnoAltaReg().equals(instance.getGpoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGpoMesAltaReg().equals(instance.getGpoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGpoDiaAltaReg().equals(instance.getGpoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGpoAnoUltMod().equals(instance.getGpoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGpoMesUltMod().equals(instance.getGpoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGpoDiaUltMod().equals(instance.getGpoDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Gpotrab result = new Gpotrab();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGpoNumUsuario((BigDecimal) objectData.getData("GPO_NUM_USUARIO"));
        result.setGpoNoSesion((BigDecimal) objectData.getData("GPO_NO_SESION"));
        result.setGpoConfirmo((BigDecimal) objectData.getData("GPO_CONFIRMO"));
        result.setGpoAnoAltaReg((BigDecimal) objectData.getData("GPO_ANO_ALTA_REG"));
        result.setGpoMesAltaReg((BigDecimal) objectData.getData("GPO_MES_ALTA_REG"));
        result.setGpoDiaAltaReg((BigDecimal) objectData.getData("GPO_DIA_ALTA_REG"));
        result.setGpoAnoUltMod((BigDecimal) objectData.getData("GPO_ANO_ULT_MOD"));
        result.setGpoMesUltMod((BigDecimal) objectData.getData("GPO_MES_ULT_MOD"));
        result.setGpoDiaUltMod((BigDecimal) objectData.getData("GPO_DIA_ULT_MOD"));

        return result;

    }

}
