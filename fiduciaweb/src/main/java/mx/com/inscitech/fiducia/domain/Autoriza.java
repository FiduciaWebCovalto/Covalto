package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AUTORIZA_PK", columns = { "AUT_NUM_OPERACION", "AUT_AUTORIZACION", "AUT_NUM_USUARIO" }, sequences = { "MANUAL" })
public class Autoriza extends DomainObject {

    BigDecimal autNumOperacion = null;
    BigDecimal autNumUsuario = null;
    BigDecimal autAutorizacion = null;
    BigDecimal autImpAutoriza = null;
    BigDecimal autAnoIniAut = null;
    BigDecimal autMesIniAut = null;
    BigDecimal autDiaIniAut = null;
    BigDecimal autAnoFinAut = null;
    BigDecimal autMesFinAut = null;
    BigDecimal autDiaFinAut = null;
    BigDecimal autAnoAltaReg = null;
    BigDecimal autMesAltaReg = null;
    BigDecimal autDiaAltaReg = null;
    BigDecimal autAnoUltMod = null;
    BigDecimal autMesUltMod = null;
    BigDecimal autDiaUltMod = null;
    String autCveStAutoriz = null;

    public Autoriza() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAutNumOperacion(BigDecimal autNumOperacion) {
        this.autNumOperacion = autNumOperacion;
    }

    public BigDecimal getAutNumOperacion() {
        return this.autNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAutNumUsuario(BigDecimal autNumUsuario) {
        this.autNumUsuario = autNumUsuario;
    }

    public BigDecimal getAutNumUsuario() {
        return this.autNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAutAutorizacion(BigDecimal autAutorizacion) {
        this.autAutorizacion = autAutorizacion;
    }

    public BigDecimal getAutAutorizacion() {
        return this.autAutorizacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAutImpAutoriza(BigDecimal autImpAutoriza) {
        this.autImpAutoriza = autImpAutoriza;
    }

    public BigDecimal getAutImpAutoriza() {
        return this.autImpAutoriza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAutAnoIniAut(BigDecimal autAnoIniAut) {
        this.autAnoIniAut = autAnoIniAut;
    }

    public BigDecimal getAutAnoIniAut() {
        return this.autAnoIniAut;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutMesIniAut(BigDecimal autMesIniAut) {
        this.autMesIniAut = autMesIniAut;
    }

    public BigDecimal getAutMesIniAut() {
        return this.autMesIniAut;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutDiaIniAut(BigDecimal autDiaIniAut) {
        this.autDiaIniAut = autDiaIniAut;
    }

    public BigDecimal getAutDiaIniAut() {
        return this.autDiaIniAut;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAutAnoFinAut(BigDecimal autAnoFinAut) {
        this.autAnoFinAut = autAnoFinAut;
    }

    public BigDecimal getAutAnoFinAut() {
        return this.autAnoFinAut;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutMesFinAut(BigDecimal autMesFinAut) {
        this.autMesFinAut = autMesFinAut;
    }

    public BigDecimal getAutMesFinAut() {
        return this.autMesFinAut;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutDiaFinAut(BigDecimal autDiaFinAut) {
        this.autDiaFinAut = autDiaFinAut;
    }

    public BigDecimal getAutDiaFinAut() {
        return this.autDiaFinAut;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAutAnoAltaReg(BigDecimal autAnoAltaReg) {
        this.autAnoAltaReg = autAnoAltaReg;
    }

    public BigDecimal getAutAnoAltaReg() {
        return this.autAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutMesAltaReg(BigDecimal autMesAltaReg) {
        this.autMesAltaReg = autMesAltaReg;
    }

    public BigDecimal getAutMesAltaReg() {
        return this.autMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutDiaAltaReg(BigDecimal autDiaAltaReg) {
        this.autDiaAltaReg = autDiaAltaReg;
    }

    public BigDecimal getAutDiaAltaReg() {
        return this.autDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAutAnoUltMod(BigDecimal autAnoUltMod) {
        this.autAnoUltMod = autAnoUltMod;
    }

    public BigDecimal getAutAnoUltMod() {
        return this.autAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutMesUltMod(BigDecimal autMesUltMod) {
        this.autMesUltMod = autMesUltMod;
    }

    public BigDecimal getAutMesUltMod() {
        return this.autMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutDiaUltMod(BigDecimal autDiaUltMod) {
        this.autDiaUltMod = autDiaUltMod;
    }

    public BigDecimal getAutDiaUltMod() {
        return this.autDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutCveStAutoriz(String autCveStAutoriz) {
        this.autCveStAutoriz = autCveStAutoriz;
    }

    public String getAutCveStAutoriz() {
        return this.autCveStAutoriz;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AUTORIZA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAutNumOperacion() != null && this.getAutNumOperacion().longValue() == -999) {
            conditions += " AND AUT_NUM_OPERACION IS NULL";
        } else if (this.getAutNumOperacion() != null) {
            conditions += " AND AUT_NUM_OPERACION = ?";
            values.add(this.getAutNumOperacion());
        }

        if (this.getAutNumUsuario() != null && this.getAutNumUsuario().longValue() == -999) {
            conditions += " AND AUT_NUM_USUARIO IS NULL";
        } else if (this.getAutNumUsuario() != null) {
            conditions += " AND AUT_NUM_USUARIO = ?";
            values.add(this.getAutNumUsuario());
        }

        if (this.getAutAutorizacion() != null && this.getAutAutorizacion().longValue() == -999) {
            conditions += " AND AUT_AUTORIZACION IS NULL";
        } else if (this.getAutAutorizacion() != null) {
            conditions += " AND AUT_AUTORIZACION = ?";
            values.add(this.getAutAutorizacion());
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
        String sql = "SELECT * FROM AUTORIZA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAutNumOperacion() != null && this.getAutNumOperacion().longValue() == -999) {
            conditions += " AND AUT_NUM_OPERACION IS NULL";
        } else if (this.getAutNumOperacion() != null) {
            conditions += " AND AUT_NUM_OPERACION = ?";
            values.add(this.getAutNumOperacion());
        }

        if (this.getAutNumUsuario() != null && this.getAutNumUsuario().longValue() == -999) {
            conditions += " AND AUT_NUM_USUARIO IS NULL";
        } else if (this.getAutNumUsuario() != null) {
            conditions += " AND AUT_NUM_USUARIO = ?";
            values.add(this.getAutNumUsuario());
        }

        if (this.getAutAutorizacion() != null && this.getAutAutorizacion().longValue() == -999) {
            conditions += " AND AUT_AUTORIZACION IS NULL";
        } else if (this.getAutAutorizacion() != null) {
            conditions += " AND AUT_AUTORIZACION = ?";
            values.add(this.getAutAutorizacion());
        }

        if (this.getAutImpAutoriza() != null && this.getAutImpAutoriza().longValue() == -999) {
            conditions += " AND AUT_IMP_AUTORIZA IS NULL";
        } else if (this.getAutImpAutoriza() != null) {
            conditions += " AND AUT_IMP_AUTORIZA = ?";
            values.add(this.getAutImpAutoriza());
        }

        if (this.getAutAnoIniAut() != null && this.getAutAnoIniAut().longValue() == -999) {
            conditions += " AND AUT_ANO_INI_AUT IS NULL";
        } else if (this.getAutAnoIniAut() != null) {
            conditions += " AND AUT_ANO_INI_AUT = ?";
            values.add(this.getAutAnoIniAut());
        }

        if (this.getAutMesIniAut() != null && this.getAutMesIniAut().longValue() == -999) {
            conditions += " AND AUT_MES_INI_AUT IS NULL";
        } else if (this.getAutMesIniAut() != null) {
            conditions += " AND AUT_MES_INI_AUT = ?";
            values.add(this.getAutMesIniAut());
        }

        if (this.getAutDiaIniAut() != null && this.getAutDiaIniAut().longValue() == -999) {
            conditions += " AND AUT_DIA_INI_AUT IS NULL";
        } else if (this.getAutDiaIniAut() != null) {
            conditions += " AND AUT_DIA_INI_AUT = ?";
            values.add(this.getAutDiaIniAut());
        }

        if (this.getAutAnoFinAut() != null && this.getAutAnoFinAut().longValue() == -999) {
            conditions += " AND AUT_ANO_FIN_AUT IS NULL";
        } else if (this.getAutAnoFinAut() != null) {
            conditions += " AND AUT_ANO_FIN_AUT = ?";
            values.add(this.getAutAnoFinAut());
        }

        if (this.getAutMesFinAut() != null && this.getAutMesFinAut().longValue() == -999) {
            conditions += " AND AUT_MES_FIN_AUT IS NULL";
        } else if (this.getAutMesFinAut() != null) {
            conditions += " AND AUT_MES_FIN_AUT = ?";
            values.add(this.getAutMesFinAut());
        }

        if (this.getAutDiaFinAut() != null && this.getAutDiaFinAut().longValue() == -999) {
            conditions += " AND AUT_DIA_FIN_AUT IS NULL";
        } else if (this.getAutDiaFinAut() != null) {
            conditions += " AND AUT_DIA_FIN_AUT = ?";
            values.add(this.getAutDiaFinAut());
        }

        if (this.getAutAnoAltaReg() != null && this.getAutAnoAltaReg().longValue() == -999) {
            conditions += " AND AUT_ANO_ALTA_REG IS NULL";
        } else if (this.getAutAnoAltaReg() != null) {
            conditions += " AND AUT_ANO_ALTA_REG = ?";
            values.add(this.getAutAnoAltaReg());
        }

        if (this.getAutMesAltaReg() != null && this.getAutMesAltaReg().longValue() == -999) {
            conditions += " AND AUT_MES_ALTA_REG IS NULL";
        } else if (this.getAutMesAltaReg() != null) {
            conditions += " AND AUT_MES_ALTA_REG = ?";
            values.add(this.getAutMesAltaReg());
        }

        if (this.getAutDiaAltaReg() != null && this.getAutDiaAltaReg().longValue() == -999) {
            conditions += " AND AUT_DIA_ALTA_REG IS NULL";
        } else if (this.getAutDiaAltaReg() != null) {
            conditions += " AND AUT_DIA_ALTA_REG = ?";
            values.add(this.getAutDiaAltaReg());
        }

        if (this.getAutAnoUltMod() != null && this.getAutAnoUltMod().longValue() == -999) {
            conditions += " AND AUT_ANO_ULT_MOD IS NULL";
        } else if (this.getAutAnoUltMod() != null) {
            conditions += " AND AUT_ANO_ULT_MOD = ?";
            values.add(this.getAutAnoUltMod());
        }

        if (this.getAutMesUltMod() != null && this.getAutMesUltMod().longValue() == -999) {
            conditions += " AND AUT_MES_ULT_MOD IS NULL";
        } else if (this.getAutMesUltMod() != null) {
            conditions += " AND AUT_MES_ULT_MOD = ?";
            values.add(this.getAutMesUltMod());
        }

        if (this.getAutDiaUltMod() != null && this.getAutDiaUltMod().longValue() == -999) {
            conditions += " AND AUT_DIA_ULT_MOD IS NULL";
        } else if (this.getAutDiaUltMod() != null) {
            conditions += " AND AUT_DIA_ULT_MOD = ?";
            values.add(this.getAutDiaUltMod());
        }

        if (this.getAutCveStAutoriz() != null && "null".equals(this.getAutCveStAutoriz())) {
            conditions += " AND AUT_CVE_ST_AUTORIZ IS NULL";
        } else if (this.getAutCveStAutoriz() != null) {
            conditions += " AND AUT_CVE_ST_AUTORIZ = ?";
            values.add(this.getAutCveStAutoriz());
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
        String sql = "UPDATE AUTORIZA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AUT_NUM_OPERACION = ?";
        pkValues.add(this.getAutNumOperacion());
        conditions += " AND AUT_NUM_USUARIO = ?";
        pkValues.add(this.getAutNumUsuario());
        conditions += " AND AUT_AUTORIZACION = ?";
        pkValues.add(this.getAutAutorizacion());
        fields += " AUT_IMP_AUTORIZA = ?, ";
        values.add(this.getAutImpAutoriza());
        fields += " AUT_ANO_INI_AUT = ?, ";
        values.add(this.getAutAnoIniAut());
        fields += " AUT_MES_INI_AUT = ?, ";
        values.add(this.getAutMesIniAut());
        fields += " AUT_DIA_INI_AUT = ?, ";
        values.add(this.getAutDiaIniAut());
        fields += " AUT_ANO_FIN_AUT = ?, ";
        values.add(this.getAutAnoFinAut());
        fields += " AUT_MES_FIN_AUT = ?, ";
        values.add(this.getAutMesFinAut());
        fields += " AUT_DIA_FIN_AUT = ?, ";
        values.add(this.getAutDiaFinAut());
        fields += " AUT_ANO_ALTA_REG = ?, ";
        values.add(this.getAutAnoAltaReg());
        fields += " AUT_MES_ALTA_REG = ?, ";
        values.add(this.getAutMesAltaReg());
        fields += " AUT_DIA_ALTA_REG = ?, ";
        values.add(this.getAutDiaAltaReg());
        fields += " AUT_ANO_ULT_MOD = ?, ";
        values.add(this.getAutAnoUltMod());
        fields += " AUT_MES_ULT_MOD = ?, ";
        values.add(this.getAutMesUltMod());
        fields += " AUT_DIA_ULT_MOD = ?, ";
        values.add(this.getAutDiaUltMod());
        fields += " AUT_CVE_ST_AUTORIZ = ?, ";
        values.add(this.getAutCveStAutoriz());
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
        String sql = "INSERT INTO AUTORIZA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AUT_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getAutNumOperacion());

        fields += ", AUT_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getAutNumUsuario());

        fields += ", AUT_AUTORIZACION";
        fieldValues += ", ?";
        values.add(this.getAutAutorizacion());

        fields += ", AUT_IMP_AUTORIZA";
        fieldValues += ", ?";
        values.add(this.getAutImpAutoriza());

        fields += ", AUT_ANO_INI_AUT";
        fieldValues += ", ?";
        values.add(this.getAutAnoIniAut());

        fields += ", AUT_MES_INI_AUT";
        fieldValues += ", ?";
        values.add(this.getAutMesIniAut());

        fields += ", AUT_DIA_INI_AUT";
        fieldValues += ", ?";
        values.add(this.getAutDiaIniAut());

        fields += ", AUT_ANO_FIN_AUT";
        fieldValues += ", ?";
        values.add(this.getAutAnoFinAut());

        fields += ", AUT_MES_FIN_AUT";
        fieldValues += ", ?";
        values.add(this.getAutMesFinAut());

        fields += ", AUT_DIA_FIN_AUT";
        fieldValues += ", ?";
        values.add(this.getAutDiaFinAut());

        fields += ", AUT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutAnoAltaReg());

        fields += ", AUT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutMesAltaReg());

        fields += ", AUT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutDiaAltaReg());

        fields += ", AUT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutAnoUltMod());

        fields += ", AUT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutMesUltMod());

        fields += ", AUT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutDiaUltMod());

        fields += ", AUT_CVE_ST_AUTORIZ";
        fieldValues += ", ?";
        values.add(this.getAutCveStAutoriz());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AUTORIZA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AUT_NUM_OPERACION = ?";
        values.add(this.getAutNumOperacion());
        conditions += " AND AUT_NUM_USUARIO = ?";
        values.add(this.getAutNumUsuario());
        conditions += " AND AUT_AUTORIZACION = ?";
        values.add(this.getAutAutorizacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Autoriza instance = (Autoriza) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAutNumOperacion().equals(instance.getAutNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getAutNumUsuario().equals(instance.getAutNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getAutAutorizacion().equals(instance.getAutAutorizacion()))
            equalObjects = false;
        if (equalObjects && !this.getAutImpAutoriza().equals(instance.getAutImpAutoriza()))
            equalObjects = false;
        if (equalObjects && !this.getAutAnoIniAut().equals(instance.getAutAnoIniAut()))
            equalObjects = false;
        if (equalObjects && !this.getAutMesIniAut().equals(instance.getAutMesIniAut()))
            equalObjects = false;
        if (equalObjects && !this.getAutDiaIniAut().equals(instance.getAutDiaIniAut()))
            equalObjects = false;
        if (equalObjects && !this.getAutAnoFinAut().equals(instance.getAutAnoFinAut()))
            equalObjects = false;
        if (equalObjects && !this.getAutMesFinAut().equals(instance.getAutMesFinAut()))
            equalObjects = false;
        if (equalObjects && !this.getAutDiaFinAut().equals(instance.getAutDiaFinAut()))
            equalObjects = false;
        if (equalObjects && !this.getAutAnoAltaReg().equals(instance.getAutAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutMesAltaReg().equals(instance.getAutMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutDiaAltaReg().equals(instance.getAutDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutAnoUltMod().equals(instance.getAutAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutMesUltMod().equals(instance.getAutMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutDiaUltMod().equals(instance.getAutDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutCveStAutoriz().equals(instance.getAutCveStAutoriz()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Autoriza result = new Autoriza();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAutNumOperacion((BigDecimal) objectData.getData("AUT_NUM_OPERACION"));
        result.setAutNumUsuario((BigDecimal) objectData.getData("AUT_NUM_USUARIO"));
        result.setAutAutorizacion((BigDecimal) objectData.getData("AUT_AUTORIZACION"));
        result.setAutImpAutoriza((BigDecimal) objectData.getData("AUT_IMP_AUTORIZA"));
        result.setAutAnoIniAut((BigDecimal) objectData.getData("AUT_ANO_INI_AUT"));
        result.setAutMesIniAut((BigDecimal) objectData.getData("AUT_MES_INI_AUT"));
        result.setAutDiaIniAut((BigDecimal) objectData.getData("AUT_DIA_INI_AUT"));
        result.setAutAnoFinAut((BigDecimal) objectData.getData("AUT_ANO_FIN_AUT"));
        result.setAutMesFinAut((BigDecimal) objectData.getData("AUT_MES_FIN_AUT"));
        result.setAutDiaFinAut((BigDecimal) objectData.getData("AUT_DIA_FIN_AUT"));
        result.setAutAnoAltaReg((BigDecimal) objectData.getData("AUT_ANO_ALTA_REG"));
        result.setAutMesAltaReg((BigDecimal) objectData.getData("AUT_MES_ALTA_REG"));
        result.setAutDiaAltaReg((BigDecimal) objectData.getData("AUT_DIA_ALTA_REG"));
        result.setAutAnoUltMod((BigDecimal) objectData.getData("AUT_ANO_ULT_MOD"));
        result.setAutMesUltMod((BigDecimal) objectData.getData("AUT_MES_ULT_MOD"));
        result.setAutDiaUltMod((BigDecimal) objectData.getData("AUT_DIA_ULT_MOD"));
        result.setAutCveStAutoriz((String) objectData.getData("AUT_CVE_ST_AUTORIZ"));

        return result;

    }

}
