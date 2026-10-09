package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FUNCIONE_PK", columns = { "FUN_MENU", "FUN_NOM_OPCION" }, sequences = { "MANUAL" })
public class Funcione extends DomainObject {

    String funMenu = null;
    String funNomOpcion = null;
    BigDecimal funHoraVigIni = null;
    BigDecimal funMinutoVigIni = null;
    BigDecimal funHoraVigFin = null;
    BigDecimal funMinutoVigFin = null;
    BigDecimal funCveDoblePsw = null;
    BigDecimal funCveConfirma = null;
    BigDecimal funAnoAltaReg = null;
    BigDecimal funMesAltaReg = null;
    BigDecimal funDiaAltaReg = null;
    BigDecimal funAnoUltMod = null;
    BigDecimal funMesUltMod = null;
    BigDecimal funDiaUltMod = null;
    String funCveStFuncion = null;
    String funDescFuncion = null;

    public Funcione() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFunMenu(String funMenu) {
        this.funMenu = funMenu;
    }

    public String getFunMenu() {
        return this.funMenu;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFunNomOpcion(String funNomOpcion) {
        this.funNomOpcion = funNomOpcion;
    }

    public String getFunNomOpcion() {
        return this.funNomOpcion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFunHoraVigIni(BigDecimal funHoraVigIni) {
        this.funHoraVigIni = funHoraVigIni;
    }

    public BigDecimal getFunHoraVigIni() {
        return this.funHoraVigIni;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFunMinutoVigIni(BigDecimal funMinutoVigIni) {
        this.funMinutoVigIni = funMinutoVigIni;
    }

    public BigDecimal getFunMinutoVigIni() {
        return this.funMinutoVigIni;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFunHoraVigFin(BigDecimal funHoraVigFin) {
        this.funHoraVigFin = funHoraVigFin;
    }

    public BigDecimal getFunHoraVigFin() {
        return this.funHoraVigFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFunMinutoVigFin(BigDecimal funMinutoVigFin) {
        this.funMinutoVigFin = funMinutoVigFin;
    }

    public BigDecimal getFunMinutoVigFin() {
        return this.funMinutoVigFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFunCveDoblePsw(BigDecimal funCveDoblePsw) {
        this.funCveDoblePsw = funCveDoblePsw;
    }

    public BigDecimal getFunCveDoblePsw() {
        return this.funCveDoblePsw;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFunCveConfirma(BigDecimal funCveConfirma) {
        this.funCveConfirma = funCveConfirma;
    }

    public BigDecimal getFunCveConfirma() {
        return this.funCveConfirma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFunAnoAltaReg(BigDecimal funAnoAltaReg) {
        this.funAnoAltaReg = funAnoAltaReg;
    }

    public BigDecimal getFunAnoAltaReg() {
        return this.funAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFunMesAltaReg(BigDecimal funMesAltaReg) {
        this.funMesAltaReg = funMesAltaReg;
    }

    public BigDecimal getFunMesAltaReg() {
        return this.funMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFunDiaAltaReg(BigDecimal funDiaAltaReg) {
        this.funDiaAltaReg = funDiaAltaReg;
    }

    public BigDecimal getFunDiaAltaReg() {
        return this.funDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFunAnoUltMod(BigDecimal funAnoUltMod) {
        this.funAnoUltMod = funAnoUltMod;
    }

    public BigDecimal getFunAnoUltMod() {
        return this.funAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFunMesUltMod(BigDecimal funMesUltMod) {
        this.funMesUltMod = funMesUltMod;
    }

    public BigDecimal getFunMesUltMod() {
        return this.funMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFunDiaUltMod(BigDecimal funDiaUltMod) {
        this.funDiaUltMod = funDiaUltMod;
    }

    public BigDecimal getFunDiaUltMod() {
        return this.funDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFunCveStFuncion(String funCveStFuncion) {
        this.funCveStFuncion = funCveStFuncion;
    }

    public String getFunCveStFuncion() {
        return this.funCveStFuncion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFunDescFuncion(String funDescFuncion) {
        this.funDescFuncion = funDescFuncion;
    }

    public String getFunDescFuncion() {
        return this.funDescFuncion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FUNCIONE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFunMenu() != null && "null".equals(this.getFunMenu())) {
            conditions += " AND FUN_MENU IS NULL";
        } else if (this.getFunMenu() != null) {
            conditions += " AND FUN_MENU = ?";
            values.add(this.getFunMenu());
        }

        if (this.getFunNomOpcion() != null && "null".equals(this.getFunNomOpcion())) {
            conditions += " AND FUN_NOM_OPCION IS NULL";
        } else if (this.getFunNomOpcion() != null) {
            conditions += " AND FUN_NOM_OPCION = ?";
            values.add(this.getFunNomOpcion());
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
        String sql = "SELECT * FROM FUNCIONE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFunMenu() != null && "null".equals(this.getFunMenu())) {
            conditions += " AND FUN_MENU IS NULL";
        } else if (this.getFunMenu() != null) {
            conditions += " AND FUN_MENU = ?";
            values.add(this.getFunMenu());
        }

        if (this.getFunNomOpcion() != null && "null".equals(this.getFunNomOpcion())) {
            conditions += " AND FUN_NOM_OPCION IS NULL";
        } else if (this.getFunNomOpcion() != null) {
            conditions += " AND FUN_NOM_OPCION = ?";
            values.add(this.getFunNomOpcion());
        }

        if (this.getFunHoraVigIni() != null && this.getFunHoraVigIni().longValue() == -999) {
            conditions += " AND FUN_HORA_VIG_INI IS NULL";
        } else if (this.getFunHoraVigIni() != null) {
            conditions += " AND FUN_HORA_VIG_INI = ?";
            values.add(this.getFunHoraVigIni());
        }

        if (this.getFunMinutoVigIni() != null && this.getFunMinutoVigIni().longValue() == -999) {
            conditions += " AND FUN_MINUTO_VIG_INI IS NULL";
        } else if (this.getFunMinutoVigIni() != null) {
            conditions += " AND FUN_MINUTO_VIG_INI = ?";
            values.add(this.getFunMinutoVigIni());
        }

        if (this.getFunHoraVigFin() != null && this.getFunHoraVigFin().longValue() == -999) {
            conditions += " AND FUN_HORA_VIG_FIN IS NULL";
        } else if (this.getFunHoraVigFin() != null) {
            conditions += " AND FUN_HORA_VIG_FIN = ?";
            values.add(this.getFunHoraVigFin());
        }

        if (this.getFunMinutoVigFin() != null && this.getFunMinutoVigFin().longValue() == -999) {
            conditions += " AND FUN_MINUTO_VIG_FIN IS NULL";
        } else if (this.getFunMinutoVigFin() != null) {
            conditions += " AND FUN_MINUTO_VIG_FIN = ?";
            values.add(this.getFunMinutoVigFin());
        }

        if (this.getFunCveDoblePsw() != null && this.getFunCveDoblePsw().longValue() == -999) {
            conditions += " AND FUN_CVE_DOBLE_PSW IS NULL";
        } else if (this.getFunCveDoblePsw() != null) {
            conditions += " AND FUN_CVE_DOBLE_PSW = ?";
            values.add(this.getFunCveDoblePsw());
        }

        if (this.getFunCveConfirma() != null && this.getFunCveConfirma().longValue() == -999) {
            conditions += " AND FUN_CVE_CONFIRMA IS NULL";
        } else if (this.getFunCveConfirma() != null) {
            conditions += " AND FUN_CVE_CONFIRMA = ?";
            values.add(this.getFunCveConfirma());
        }

        if (this.getFunAnoAltaReg() != null && this.getFunAnoAltaReg().longValue() == -999) {
            conditions += " AND FUN_ANO_ALTA_REG IS NULL";
        } else if (this.getFunAnoAltaReg() != null) {
            conditions += " AND FUN_ANO_ALTA_REG = ?";
            values.add(this.getFunAnoAltaReg());
        }

        if (this.getFunMesAltaReg() != null && this.getFunMesAltaReg().longValue() == -999) {
            conditions += " AND FUN_MES_ALTA_REG IS NULL";
        } else if (this.getFunMesAltaReg() != null) {
            conditions += " AND FUN_MES_ALTA_REG = ?";
            values.add(this.getFunMesAltaReg());
        }

        if (this.getFunDiaAltaReg() != null && this.getFunDiaAltaReg().longValue() == -999) {
            conditions += " AND FUN_DIA_ALTA_REG IS NULL";
        } else if (this.getFunDiaAltaReg() != null) {
            conditions += " AND FUN_DIA_ALTA_REG = ?";
            values.add(this.getFunDiaAltaReg());
        }

        if (this.getFunAnoUltMod() != null && this.getFunAnoUltMod().longValue() == -999) {
            conditions += " AND FUN_ANO_ULT_MOD IS NULL";
        } else if (this.getFunAnoUltMod() != null) {
            conditions += " AND FUN_ANO_ULT_MOD = ?";
            values.add(this.getFunAnoUltMod());
        }

        if (this.getFunMesUltMod() != null && this.getFunMesUltMod().longValue() == -999) {
            conditions += " AND FUN_MES_ULT_MOD IS NULL";
        } else if (this.getFunMesUltMod() != null) {
            conditions += " AND FUN_MES_ULT_MOD = ?";
            values.add(this.getFunMesUltMod());
        }

        if (this.getFunDiaUltMod() != null && this.getFunDiaUltMod().longValue() == -999) {
            conditions += " AND FUN_DIA_ULT_MOD IS NULL";
        } else if (this.getFunDiaUltMod() != null) {
            conditions += " AND FUN_DIA_ULT_MOD = ?";
            values.add(this.getFunDiaUltMod());
        }

        if (this.getFunCveStFuncion() != null && "null".equals(this.getFunCveStFuncion())) {
            conditions += " AND FUN_CVE_ST_FUNCION IS NULL";
        } else if (this.getFunCveStFuncion() != null) {
            conditions += " AND FUN_CVE_ST_FUNCION = ?";
            values.add(this.getFunCveStFuncion());
        }

        if (this.getFunDescFuncion() != null && "null".equals(this.getFunDescFuncion())) {
            conditions += " AND FUN_DESC_FUNCION IS NULL";
        } else if (this.getFunDescFuncion() != null) {
            conditions += " AND FUN_DESC_FUNCION = ?";
            values.add(this.getFunDescFuncion());
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
        String sql = "UPDATE FUNCIONE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FUN_MENU = ?";
        pkValues.add(this.getFunMenu());
        conditions += " AND FUN_NOM_OPCION = ?";
        pkValues.add(this.getFunNomOpcion());
        fields += " FUN_HORA_VIG_INI = ?, ";
        values.add(this.getFunHoraVigIni());
        fields += " FUN_MINUTO_VIG_INI = ?, ";
        values.add(this.getFunMinutoVigIni());
        fields += " FUN_HORA_VIG_FIN = ?, ";
        values.add(this.getFunHoraVigFin());
        fields += " FUN_MINUTO_VIG_FIN = ?, ";
        values.add(this.getFunMinutoVigFin());
        fields += " FUN_CVE_DOBLE_PSW = ?, ";
        values.add(this.getFunCveDoblePsw());
        fields += " FUN_CVE_CONFIRMA = ?, ";
        values.add(this.getFunCveConfirma());
        fields += " FUN_ANO_ALTA_REG = ?, ";
        values.add(this.getFunAnoAltaReg());
        fields += " FUN_MES_ALTA_REG = ?, ";
        values.add(this.getFunMesAltaReg());
        fields += " FUN_DIA_ALTA_REG = ?, ";
        values.add(this.getFunDiaAltaReg());
        fields += " FUN_ANO_ULT_MOD = ?, ";
        values.add(this.getFunAnoUltMod());
        fields += " FUN_MES_ULT_MOD = ?, ";
        values.add(this.getFunMesUltMod());
        fields += " FUN_DIA_ULT_MOD = ?, ";
        values.add(this.getFunDiaUltMod());
        fields += " FUN_CVE_ST_FUNCION = ?, ";
        values.add(this.getFunCveStFuncion());
        fields += " FUN_DESC_FUNCION = ?, ";
        values.add(this.getFunDescFuncion());
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
        String sql = "INSERT INTO FUNCIONE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FUN_MENU";
        fieldValues += ", ?";
        values.add(this.getFunMenu());

        fields += ", FUN_NOM_OPCION";
        fieldValues += ", ?";
        values.add(this.getFunNomOpcion());

        fields += ", FUN_HORA_VIG_INI";
        fieldValues += ", ?";
        values.add(this.getFunHoraVigIni());

        fields += ", FUN_MINUTO_VIG_INI";
        fieldValues += ", ?";
        values.add(this.getFunMinutoVigIni());

        fields += ", FUN_HORA_VIG_FIN";
        fieldValues += ", ?";
        values.add(this.getFunHoraVigFin());

        fields += ", FUN_MINUTO_VIG_FIN";
        fieldValues += ", ?";
        values.add(this.getFunMinutoVigFin());

        fields += ", FUN_CVE_DOBLE_PSW";
        fieldValues += ", ?";
        values.add(this.getFunCveDoblePsw());

        fields += ", FUN_CVE_CONFIRMA";
        fieldValues += ", ?";
        values.add(this.getFunCveConfirma());

        fields += ", FUN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFunAnoAltaReg());

        fields += ", FUN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFunMesAltaReg());

        fields += ", FUN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFunDiaAltaReg());

        fields += ", FUN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFunAnoUltMod());

        fields += ", FUN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFunMesUltMod());

        fields += ", FUN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFunDiaUltMod());

        fields += ", FUN_CVE_ST_FUNCION";
        fieldValues += ", ?";
        values.add(this.getFunCveStFuncion());

        fields += ", FUN_DESC_FUNCION";
        fieldValues += ", ?";
        values.add(this.getFunDescFuncion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FUNCIONE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FUN_MENU = ?";
        values.add(this.getFunMenu());
        conditions += " AND FUN_NOM_OPCION = ?";
        values.add(this.getFunNomOpcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Funcione instance = (Funcione) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFunMenu().equals(instance.getFunMenu()))
            equalObjects = false;
        if (equalObjects && !this.getFunNomOpcion().equals(instance.getFunNomOpcion()))
            equalObjects = false;
        if (equalObjects && !this.getFunHoraVigIni().equals(instance.getFunHoraVigIni()))
            equalObjects = false;
        if (equalObjects && !this.getFunMinutoVigIni().equals(instance.getFunMinutoVigIni()))
            equalObjects = false;
        if (equalObjects && !this.getFunHoraVigFin().equals(instance.getFunHoraVigFin()))
            equalObjects = false;
        if (equalObjects && !this.getFunMinutoVigFin().equals(instance.getFunMinutoVigFin()))
            equalObjects = false;
        if (equalObjects && !this.getFunCveDoblePsw().equals(instance.getFunCveDoblePsw()))
            equalObjects = false;
        if (equalObjects && !this.getFunCveConfirma().equals(instance.getFunCveConfirma()))
            equalObjects = false;
        if (equalObjects && !this.getFunAnoAltaReg().equals(instance.getFunAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFunMesAltaReg().equals(instance.getFunMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFunDiaAltaReg().equals(instance.getFunDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFunAnoUltMod().equals(instance.getFunAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFunMesUltMod().equals(instance.getFunMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFunDiaUltMod().equals(instance.getFunDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFunCveStFuncion().equals(instance.getFunCveStFuncion()))
            equalObjects = false;
        if (equalObjects && !this.getFunDescFuncion().equals(instance.getFunDescFuncion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Funcione result = new Funcione();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFunMenu((String) objectData.getData("FUN_MENU"));
        result.setFunNomOpcion((String) objectData.getData("FUN_NOM_OPCION"));
        result.setFunHoraVigIni((BigDecimal) objectData.getData("FUN_HORA_VIG_INI"));
        result.setFunMinutoVigIni((BigDecimal) objectData.getData("FUN_MINUTO_VIG_INI"));
        result.setFunHoraVigFin((BigDecimal) objectData.getData("FUN_HORA_VIG_FIN"));
        result.setFunMinutoVigFin((BigDecimal) objectData.getData("FUN_MINUTO_VIG_FIN"));
        result.setFunCveDoblePsw((BigDecimal) objectData.getData("FUN_CVE_DOBLE_PSW"));
        result.setFunCveConfirma((BigDecimal) objectData.getData("FUN_CVE_CONFIRMA"));
        result.setFunAnoAltaReg((BigDecimal) objectData.getData("FUN_ANO_ALTA_REG"));
        result.setFunMesAltaReg((BigDecimal) objectData.getData("FUN_MES_ALTA_REG"));
        result.setFunDiaAltaReg((BigDecimal) objectData.getData("FUN_DIA_ALTA_REG"));
        result.setFunAnoUltMod((BigDecimal) objectData.getData("FUN_ANO_ULT_MOD"));
        result.setFunMesUltMod((BigDecimal) objectData.getData("FUN_MES_ULT_MOD"));
        result.setFunDiaUltMod((BigDecimal) objectData.getData("FUN_DIA_ULT_MOD"));
        result.setFunCveStFuncion((String) objectData.getData("FUN_CVE_ST_FUNCION"));
        result.setFunDescFuncion((String) objectData.getData("FUN_DESC_FUNCION"));

        return result;

    }

}
