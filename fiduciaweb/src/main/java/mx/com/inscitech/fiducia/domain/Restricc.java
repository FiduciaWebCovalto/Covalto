package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "RESTRICC_PK", columns = { "RES_NUM_USUARIO", "RES_MENU", "RES_NOM_OPCION" }, sequences = { "MANUAL" })
public class Restricc extends DomainObject {

    BigDecimal resNumUsuario = null;
    String resMenu = null;
    String resNomOpcion = null;
    String resCausaRestric = null;
    BigDecimal resCveLectura = null;
    BigDecimal resImpLimRest = null;
    BigDecimal resAnoIniRest = null;
    BigDecimal resMesIniRest = null;
    BigDecimal resDiaIniRest = null;
    BigDecimal resAnoFinRest = null;
    BigDecimal resMesFinRest = null;
    BigDecimal resDiaFinRest = null;
    BigDecimal resAnoAltaReg = null;
    BigDecimal resMesAltaReg = null;
    BigDecimal resDiaAltaReg = null;
    BigDecimal resAnoUltMod = null;
    BigDecimal resMesUltMod = null;
    BigDecimal resDiaUltMod = null;
    String resCveStRestric = null;

    public Restricc() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setResNumUsuario(BigDecimal resNumUsuario) {
        this.resNumUsuario = resNumUsuario;
    }

    public BigDecimal getResNumUsuario() {
        return this.resNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setResMenu(String resMenu) {
        this.resMenu = resMenu;
    }

    public String getResMenu() {
        return this.resMenu;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setResNomOpcion(String resNomOpcion) {
        this.resNomOpcion = resNomOpcion;
    }

    public String getResNomOpcion() {
        return this.resNomOpcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setResCausaRestric(String resCausaRestric) {
        this.resCausaRestric = resCausaRestric;
    }

    public String getResCausaRestric() {
        return this.resCausaRestric;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setResCveLectura(BigDecimal resCveLectura) {
        this.resCveLectura = resCveLectura;
    }

    public BigDecimal getResCveLectura() {
        return this.resCveLectura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setResImpLimRest(BigDecimal resImpLimRest) {
        this.resImpLimRest = resImpLimRest;
    }

    public BigDecimal getResImpLimRest() {
        return this.resImpLimRest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setResAnoIniRest(BigDecimal resAnoIniRest) {
        this.resAnoIniRest = resAnoIniRest;
    }

    public BigDecimal getResAnoIniRest() {
        return this.resAnoIniRest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setResMesIniRest(BigDecimal resMesIniRest) {
        this.resMesIniRest = resMesIniRest;
    }

    public BigDecimal getResMesIniRest() {
        return this.resMesIniRest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setResDiaIniRest(BigDecimal resDiaIniRest) {
        this.resDiaIniRest = resDiaIniRest;
    }

    public BigDecimal getResDiaIniRest() {
        return this.resDiaIniRest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setResAnoFinRest(BigDecimal resAnoFinRest) {
        this.resAnoFinRest = resAnoFinRest;
    }

    public BigDecimal getResAnoFinRest() {
        return this.resAnoFinRest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setResMesFinRest(BigDecimal resMesFinRest) {
        this.resMesFinRest = resMesFinRest;
    }

    public BigDecimal getResMesFinRest() {
        return this.resMesFinRest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setResDiaFinRest(BigDecimal resDiaFinRest) {
        this.resDiaFinRest = resDiaFinRest;
    }

    public BigDecimal getResDiaFinRest() {
        return this.resDiaFinRest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setResAnoAltaReg(BigDecimal resAnoAltaReg) {
        this.resAnoAltaReg = resAnoAltaReg;
    }

    public BigDecimal getResAnoAltaReg() {
        return this.resAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setResMesAltaReg(BigDecimal resMesAltaReg) {
        this.resMesAltaReg = resMesAltaReg;
    }

    public BigDecimal getResMesAltaReg() {
        return this.resMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setResDiaAltaReg(BigDecimal resDiaAltaReg) {
        this.resDiaAltaReg = resDiaAltaReg;
    }

    public BigDecimal getResDiaAltaReg() {
        return this.resDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setResAnoUltMod(BigDecimal resAnoUltMod) {
        this.resAnoUltMod = resAnoUltMod;
    }

    public BigDecimal getResAnoUltMod() {
        return this.resAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setResMesUltMod(BigDecimal resMesUltMod) {
        this.resMesUltMod = resMesUltMod;
    }

    public BigDecimal getResMesUltMod() {
        return this.resMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setResDiaUltMod(BigDecimal resDiaUltMod) {
        this.resDiaUltMod = resDiaUltMod;
    }

    public BigDecimal getResDiaUltMod() {
        return this.resDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setResCveStRestric(String resCveStRestric) {
        this.resCveStRestric = resCveStRestric;
    }

    public String getResCveStRestric() {
        return this.resCveStRestric;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM RESTRICC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getResNumUsuario() != null && this.getResNumUsuario().longValue() == -999) {
            conditions += " AND RES_NUM_USUARIO IS NULL";
        } else if (this.getResNumUsuario() != null) {
            conditions += " AND RES_NUM_USUARIO = ?";
            values.add(this.getResNumUsuario());
        }

        if (this.getResMenu() != null && "null".equals(this.getResMenu())) {
            conditions += " AND RES_MENU IS NULL";
        } else if (this.getResMenu() != null) {
            conditions += " AND RES_MENU = ?";
            values.add(this.getResMenu());
        }

        if (this.getResNomOpcion() != null && "null".equals(this.getResNomOpcion())) {
            conditions += " AND RES_NOM_OPCION IS NULL";
        } else if (this.getResNomOpcion() != null) {
            conditions += " AND RES_NOM_OPCION = ?";
            values.add(this.getResNomOpcion());
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
        String sql = "SELECT * FROM RESTRICC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getResNumUsuario() != null && this.getResNumUsuario().longValue() == -999) {
            conditions += " AND RES_NUM_USUARIO IS NULL";
        } else if (this.getResNumUsuario() != null) {
            conditions += " AND RES_NUM_USUARIO = ?";
            values.add(this.getResNumUsuario());
        }

        if (this.getResMenu() != null && "null".equals(this.getResMenu())) {
            conditions += " AND RES_MENU IS NULL";
        } else if (this.getResMenu() != null) {
            conditions += " AND RES_MENU = ?";
            values.add(this.getResMenu());
        }

        if (this.getResNomOpcion() != null && "null".equals(this.getResNomOpcion())) {
            conditions += " AND RES_NOM_OPCION IS NULL";
        } else if (this.getResNomOpcion() != null) {
            conditions += " AND RES_NOM_OPCION = ?";
            values.add(this.getResNomOpcion());
        }

        if (this.getResCausaRestric() != null && "null".equals(this.getResCausaRestric())) {
            conditions += " AND RES_CAUSA_RESTRIC IS NULL";
        } else if (this.getResCausaRestric() != null) {
            conditions += " AND RES_CAUSA_RESTRIC = ?";
            values.add(this.getResCausaRestric());
        }

        if (this.getResCveLectura() != null && this.getResCveLectura().longValue() == -999) {
            conditions += " AND RES_CVE_LECTURA IS NULL";
        } else if (this.getResCveLectura() != null) {
            conditions += " AND RES_CVE_LECTURA = ?";
            values.add(this.getResCveLectura());
        }

        if (this.getResImpLimRest() != null && this.getResImpLimRest().longValue() == -999) {
            conditions += " AND RES_IMP_LIM_REST IS NULL";
        } else if (this.getResImpLimRest() != null) {
            conditions += " AND RES_IMP_LIM_REST = ?";
            values.add(this.getResImpLimRest());
        }

        if (this.getResAnoIniRest() != null && this.getResAnoIniRest().longValue() == -999) {
            conditions += " AND RES_ANO_INI_REST IS NULL";
        } else if (this.getResAnoIniRest() != null) {
            conditions += " AND RES_ANO_INI_REST = ?";
            values.add(this.getResAnoIniRest());
        }

        if (this.getResMesIniRest() != null && this.getResMesIniRest().longValue() == -999) {
            conditions += " AND RES_MES_INI_REST IS NULL";
        } else if (this.getResMesIniRest() != null) {
            conditions += " AND RES_MES_INI_REST = ?";
            values.add(this.getResMesIniRest());
        }

        if (this.getResDiaIniRest() != null && this.getResDiaIniRest().longValue() == -999) {
            conditions += " AND RES_DIA_INI_REST IS NULL";
        } else if (this.getResDiaIniRest() != null) {
            conditions += " AND RES_DIA_INI_REST = ?";
            values.add(this.getResDiaIniRest());
        }

        if (this.getResAnoFinRest() != null && this.getResAnoFinRest().longValue() == -999) {
            conditions += " AND RES_ANO_FIN_REST IS NULL";
        } else if (this.getResAnoFinRest() != null) {
            conditions += " AND RES_ANO_FIN_REST = ?";
            values.add(this.getResAnoFinRest());
        }

        if (this.getResMesFinRest() != null && this.getResMesFinRest().longValue() == -999) {
            conditions += " AND RES_MES_FIN_REST IS NULL";
        } else if (this.getResMesFinRest() != null) {
            conditions += " AND RES_MES_FIN_REST = ?";
            values.add(this.getResMesFinRest());
        }

        if (this.getResDiaFinRest() != null && this.getResDiaFinRest().longValue() == -999) {
            conditions += " AND RES_DIA_FIN_REST IS NULL";
        } else if (this.getResDiaFinRest() != null) {
            conditions += " AND RES_DIA_FIN_REST = ?";
            values.add(this.getResDiaFinRest());
        }

        if (this.getResAnoAltaReg() != null && this.getResAnoAltaReg().longValue() == -999) {
            conditions += " AND RES_ANO_ALTA_REG IS NULL";
        } else if (this.getResAnoAltaReg() != null) {
            conditions += " AND RES_ANO_ALTA_REG = ?";
            values.add(this.getResAnoAltaReg());
        }

        if (this.getResMesAltaReg() != null && this.getResMesAltaReg().longValue() == -999) {
            conditions += " AND RES_MES_ALTA_REG IS NULL";
        } else if (this.getResMesAltaReg() != null) {
            conditions += " AND RES_MES_ALTA_REG = ?";
            values.add(this.getResMesAltaReg());
        }

        if (this.getResDiaAltaReg() != null && this.getResDiaAltaReg().longValue() == -999) {
            conditions += " AND RES_DIA_ALTA_REG IS NULL";
        } else if (this.getResDiaAltaReg() != null) {
            conditions += " AND RES_DIA_ALTA_REG = ?";
            values.add(this.getResDiaAltaReg());
        }

        if (this.getResAnoUltMod() != null && this.getResAnoUltMod().longValue() == -999) {
            conditions += " AND RES_ANO_ULT_MOD IS NULL";
        } else if (this.getResAnoUltMod() != null) {
            conditions += " AND RES_ANO_ULT_MOD = ?";
            values.add(this.getResAnoUltMod());
        }

        if (this.getResMesUltMod() != null && this.getResMesUltMod().longValue() == -999) {
            conditions += " AND RES_MES_ULT_MOD IS NULL";
        } else if (this.getResMesUltMod() != null) {
            conditions += " AND RES_MES_ULT_MOD = ?";
            values.add(this.getResMesUltMod());
        }

        if (this.getResDiaUltMod() != null && this.getResDiaUltMod().longValue() == -999) {
            conditions += " AND RES_DIA_ULT_MOD IS NULL";
        } else if (this.getResDiaUltMod() != null) {
            conditions += " AND RES_DIA_ULT_MOD = ?";
            values.add(this.getResDiaUltMod());
        }

        if (this.getResCveStRestric() != null && "null".equals(this.getResCveStRestric())) {
            conditions += " AND RES_CVE_ST_RESTRIC IS NULL";
        } else if (this.getResCveStRestric() != null) {
            conditions += " AND RES_CVE_ST_RESTRIC = ?";
            values.add(this.getResCveStRestric());
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
        String sql = "UPDATE RESTRICC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RES_NUM_USUARIO = ?";
        pkValues.add(this.getResNumUsuario());
        conditions += " AND RES_MENU = ?";
        pkValues.add(this.getResMenu());
        conditions += " AND RES_NOM_OPCION = ?";
        pkValues.add(this.getResNomOpcion());
        fields += " RES_CAUSA_RESTRIC = ?, ";
        values.add(this.getResCausaRestric());
        fields += " RES_CVE_LECTURA = ?, ";
        values.add(this.getResCveLectura());
        fields += " RES_IMP_LIM_REST = ?, ";
        values.add(this.getResImpLimRest());
        fields += " RES_ANO_INI_REST = ?, ";
        values.add(this.getResAnoIniRest());
        fields += " RES_MES_INI_REST = ?, ";
        values.add(this.getResMesIniRest());
        fields += " RES_DIA_INI_REST = ?, ";
        values.add(this.getResDiaIniRest());
        fields += " RES_ANO_FIN_REST = ?, ";
        values.add(this.getResAnoFinRest());
        fields += " RES_MES_FIN_REST = ?, ";
        values.add(this.getResMesFinRest());
        fields += " RES_DIA_FIN_REST = ?, ";
        values.add(this.getResDiaFinRest());
        fields += " RES_ANO_ALTA_REG = ?, ";
        values.add(this.getResAnoAltaReg());
        fields += " RES_MES_ALTA_REG = ?, ";
        values.add(this.getResMesAltaReg());
        fields += " RES_DIA_ALTA_REG = ?, ";
        values.add(this.getResDiaAltaReg());
        fields += " RES_ANO_ULT_MOD = ?, ";
        values.add(this.getResAnoUltMod());
        fields += " RES_MES_ULT_MOD = ?, ";
        values.add(this.getResMesUltMod());
        fields += " RES_DIA_ULT_MOD = ?, ";
        values.add(this.getResDiaUltMod());
        fields += " RES_CVE_ST_RESTRIC = ?, ";
        values.add(this.getResCveStRestric());
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
        String sql = "INSERT INTO RESTRICC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RES_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getResNumUsuario());

        fields += ", RES_MENU";
        fieldValues += ", ?";
        values.add(this.getResMenu());

        fields += ", RES_NOM_OPCION";
        fieldValues += ", ?";
        values.add(this.getResNomOpcion());

        fields += ", RES_CAUSA_RESTRIC";
        fieldValues += ", ?";
        values.add(this.getResCausaRestric());

        fields += ", RES_CVE_LECTURA";
        fieldValues += ", ?";
        values.add(this.getResCveLectura());

        fields += ", RES_IMP_LIM_REST";
        fieldValues += ", ?";
        values.add(this.getResImpLimRest());

        fields += ", RES_ANO_INI_REST";
        fieldValues += ", ?";
        values.add(this.getResAnoIniRest());

        fields += ", RES_MES_INI_REST";
        fieldValues += ", ?";
        values.add(this.getResMesIniRest());

        fields += ", RES_DIA_INI_REST";
        fieldValues += ", ?";
        values.add(this.getResDiaIniRest());

        fields += ", RES_ANO_FIN_REST";
        fieldValues += ", ?";
        values.add(this.getResAnoFinRest());

        fields += ", RES_MES_FIN_REST";
        fieldValues += ", ?";
        values.add(this.getResMesFinRest());

        fields += ", RES_DIA_FIN_REST";
        fieldValues += ", ?";
        values.add(this.getResDiaFinRest());

        fields += ", RES_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getResAnoAltaReg());

        fields += ", RES_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getResMesAltaReg());

        fields += ", RES_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getResDiaAltaReg());

        fields += ", RES_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getResAnoUltMod());

        fields += ", RES_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getResMesUltMod());

        fields += ", RES_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getResDiaUltMod());

        fields += ", RES_CVE_ST_RESTRIC";
        fieldValues += ", ?";
        values.add(this.getResCveStRestric());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM RESTRICC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RES_NUM_USUARIO = ?";
        values.add(this.getResNumUsuario());
        conditions += " AND RES_MENU = ?";
        values.add(this.getResMenu());
        conditions += " AND RES_NOM_OPCION = ?";
        values.add(this.getResNomOpcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Restricc instance = (Restricc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getResNumUsuario().equals(instance.getResNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getResMenu().equals(instance.getResMenu()))
            equalObjects = false;
        if (equalObjects && !this.getResNomOpcion().equals(instance.getResNomOpcion()))
            equalObjects = false;
        if (equalObjects && !this.getResCausaRestric().equals(instance.getResCausaRestric()))
            equalObjects = false;
        if (equalObjects && !this.getResCveLectura().equals(instance.getResCveLectura()))
            equalObjects = false;
        if (equalObjects && !this.getResImpLimRest().equals(instance.getResImpLimRest()))
            equalObjects = false;
        if (equalObjects && !this.getResAnoIniRest().equals(instance.getResAnoIniRest()))
            equalObjects = false;
        if (equalObjects && !this.getResMesIniRest().equals(instance.getResMesIniRest()))
            equalObjects = false;
        if (equalObjects && !this.getResDiaIniRest().equals(instance.getResDiaIniRest()))
            equalObjects = false;
        if (equalObjects && !this.getResAnoFinRest().equals(instance.getResAnoFinRest()))
            equalObjects = false;
        if (equalObjects && !this.getResMesFinRest().equals(instance.getResMesFinRest()))
            equalObjects = false;
        if (equalObjects && !this.getResDiaFinRest().equals(instance.getResDiaFinRest()))
            equalObjects = false;
        if (equalObjects && !this.getResAnoAltaReg().equals(instance.getResAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getResMesAltaReg().equals(instance.getResMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getResDiaAltaReg().equals(instance.getResDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getResAnoUltMod().equals(instance.getResAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getResMesUltMod().equals(instance.getResMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getResDiaUltMod().equals(instance.getResDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getResCveStRestric().equals(instance.getResCveStRestric()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Restricc result = new Restricc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setResNumUsuario((BigDecimal) objectData.getData("RES_NUM_USUARIO"));
        result.setResMenu((String) objectData.getData("RES_MENU"));
        result.setResNomOpcion((String) objectData.getData("RES_NOM_OPCION"));
        result.setResCausaRestric((String) objectData.getData("RES_CAUSA_RESTRIC"));
        result.setResCveLectura((BigDecimal) objectData.getData("RES_CVE_LECTURA"));
        result.setResImpLimRest((BigDecimal) objectData.getData("RES_IMP_LIM_REST"));
        result.setResAnoIniRest((BigDecimal) objectData.getData("RES_ANO_INI_REST"));
        result.setResMesIniRest((BigDecimal) objectData.getData("RES_MES_INI_REST"));
        result.setResDiaIniRest((BigDecimal) objectData.getData("RES_DIA_INI_REST"));
        result.setResAnoFinRest((BigDecimal) objectData.getData("RES_ANO_FIN_REST"));
        result.setResMesFinRest((BigDecimal) objectData.getData("RES_MES_FIN_REST"));
        result.setResDiaFinRest((BigDecimal) objectData.getData("RES_DIA_FIN_REST"));
        result.setResAnoAltaReg((BigDecimal) objectData.getData("RES_ANO_ALTA_REG"));
        result.setResMesAltaReg((BigDecimal) objectData.getData("RES_MES_ALTA_REG"));
        result.setResDiaAltaReg((BigDecimal) objectData.getData("RES_DIA_ALTA_REG"));
        result.setResAnoUltMod((BigDecimal) objectData.getData("RES_ANO_ULT_MOD"));
        result.setResMesUltMod((BigDecimal) objectData.getData("RES_MES_ULT_MOD"));
        result.setResDiaUltMod((BigDecimal) objectData.getData("RES_DIA_ULT_MOD"));
        result.setResCveStRestric((String) objectData.getData("RES_CVE_ST_RESTRIC"));

        return result;

    }

}
