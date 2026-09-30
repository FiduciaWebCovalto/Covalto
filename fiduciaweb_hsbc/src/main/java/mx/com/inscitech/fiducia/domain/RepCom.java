package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REP_COM_PK", columns = { "REC_CVEL_REPRES", "CPO_ACTA_EMIS" }, sequences = { "MANUAL" })
public class RepCom extends DomainObject {

    BigDecimal recCvelRepres = null;
    BigDecimal cpoActaEmis = null;
    String recNombre = null;
    String recCalleNo = null;
    String recColonia = null;
    BigDecimal recCp = null;
    String recCiudad = null;
    String recTelefono = null;
    String recFax = null;
    BigDecimal recAnoAltReg = null;
    BigDecimal recMesAltReg = null;
    BigDecimal recDiaAltReg = null;
    BigDecimal recAnoUltMod = null;
    BigDecimal recMesUltMod = null;
    BigDecimal recDiaUltMod = null;
    String recCveStRep = null;

    public RepCom() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRecCvelRepres(BigDecimal recCvelRepres) {
        this.recCvelRepres = recCvelRepres;
    }

    public BigDecimal getRecCvelRepres() {
        return this.recCvelRepres;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecNombre(String recNombre) {
        this.recNombre = recNombre;
    }

    public String getRecNombre() {
        return this.recNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecCalleNo(String recCalleNo) {
        this.recCalleNo = recCalleNo;
    }

    public String getRecCalleNo() {
        return this.recCalleNo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecColonia(String recColonia) {
        this.recColonia = recColonia;
    }

    public String getRecColonia() {
        return this.recColonia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setRecCp(BigDecimal recCp) {
        this.recCp = recCp;
    }

    public BigDecimal getRecCp() {
        return this.recCp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecCiudad(String recCiudad) {
        this.recCiudad = recCiudad;
    }

    public String getRecCiudad() {
        return this.recCiudad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecTelefono(String recTelefono) {
        this.recTelefono = recTelefono;
    }

    public String getRecTelefono() {
        return this.recTelefono;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecFax(String recFax) {
        this.recFax = recFax;
    }

    public String getRecFax() {
        return this.recFax;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRecAnoAltReg(BigDecimal recAnoAltReg) {
        this.recAnoAltReg = recAnoAltReg;
    }

    public BigDecimal getRecAnoAltReg() {
        return this.recAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecMesAltReg(BigDecimal recMesAltReg) {
        this.recMesAltReg = recMesAltReg;
    }

    public BigDecimal getRecMesAltReg() {
        return this.recMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecDiaAltReg(BigDecimal recDiaAltReg) {
        this.recDiaAltReg = recDiaAltReg;
    }

    public BigDecimal getRecDiaAltReg() {
        return this.recDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRecAnoUltMod(BigDecimal recAnoUltMod) {
        this.recAnoUltMod = recAnoUltMod;
    }

    public BigDecimal getRecAnoUltMod() {
        return this.recAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecMesUltMod(BigDecimal recMesUltMod) {
        this.recMesUltMod = recMesUltMod;
    }

    public BigDecimal getRecMesUltMod() {
        return this.recMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecDiaUltMod(BigDecimal recDiaUltMod) {
        this.recDiaUltMod = recDiaUltMod;
    }

    public BigDecimal getRecDiaUltMod() {
        return this.recDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecCveStRep(String recCveStRep) {
        this.recCveStRep = recCveStRep;
    }

    public String getRecCveStRep() {
        return this.recCveStRep;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REP_COM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRecCvelRepres() != null && this.getRecCvelRepres().longValue() == -999) {
            conditions += " AND REC_CVEL_REPRES IS NULL";
        } else if (this.getRecCvelRepres() != null) {
            conditions += " AND REC_CVEL_REPRES = ?";
            values.add(this.getRecCvelRepres());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
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
        String sql = "SELECT * FROM REP_COM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRecCvelRepres() != null && this.getRecCvelRepres().longValue() == -999) {
            conditions += " AND REC_CVEL_REPRES IS NULL";
        } else if (this.getRecCvelRepres() != null) {
            conditions += " AND REC_CVEL_REPRES = ?";
            values.add(this.getRecCvelRepres());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getRecNombre() != null && "null".equals(this.getRecNombre())) {
            conditions += " AND REC_NOMBRE IS NULL";
        } else if (this.getRecNombre() != null) {
            conditions += " AND REC_NOMBRE = ?";
            values.add(this.getRecNombre());
        }

        if (this.getRecCalleNo() != null && "null".equals(this.getRecCalleNo())) {
            conditions += " AND REC_CALLE_NO IS NULL";
        } else if (this.getRecCalleNo() != null) {
            conditions += " AND REC_CALLE_NO = ?";
            values.add(this.getRecCalleNo());
        }

        if (this.getRecColonia() != null && "null".equals(this.getRecColonia())) {
            conditions += " AND REC_COLONIA IS NULL";
        } else if (this.getRecColonia() != null) {
            conditions += " AND REC_COLONIA = ?";
            values.add(this.getRecColonia());
        }

        if (this.getRecCp() != null && this.getRecCp().longValue() == -999) {
            conditions += " AND REC_CP IS NULL";
        } else if (this.getRecCp() != null) {
            conditions += " AND REC_CP = ?";
            values.add(this.getRecCp());
        }

        if (this.getRecCiudad() != null && "null".equals(this.getRecCiudad())) {
            conditions += " AND REC_CIUDAD IS NULL";
        } else if (this.getRecCiudad() != null) {
            conditions += " AND REC_CIUDAD = ?";
            values.add(this.getRecCiudad());
        }

        if (this.getRecTelefono() != null && "null".equals(this.getRecTelefono())) {
            conditions += " AND REC_TELEFONO IS NULL";
        } else if (this.getRecTelefono() != null) {
            conditions += " AND REC_TELEFONO = ?";
            values.add(this.getRecTelefono());
        }

        if (this.getRecFax() != null && "null".equals(this.getRecFax())) {
            conditions += " AND REC_FAX IS NULL";
        } else if (this.getRecFax() != null) {
            conditions += " AND REC_FAX = ?";
            values.add(this.getRecFax());
        }

        if (this.getRecAnoAltReg() != null && this.getRecAnoAltReg().longValue() == -999) {
            conditions += " AND REC_ANO_ALT_REG IS NULL";
        } else if (this.getRecAnoAltReg() != null) {
            conditions += " AND REC_ANO_ALT_REG = ?";
            values.add(this.getRecAnoAltReg());
        }

        if (this.getRecMesAltReg() != null && this.getRecMesAltReg().longValue() == -999) {
            conditions += " AND REC_MES_ALT_REG IS NULL";
        } else if (this.getRecMesAltReg() != null) {
            conditions += " AND REC_MES_ALT_REG = ?";
            values.add(this.getRecMesAltReg());
        }

        if (this.getRecDiaAltReg() != null && this.getRecDiaAltReg().longValue() == -999) {
            conditions += " AND REC_DIA_ALT_REG IS NULL";
        } else if (this.getRecDiaAltReg() != null) {
            conditions += " AND REC_DIA_ALT_REG = ?";
            values.add(this.getRecDiaAltReg());
        }

        if (this.getRecAnoUltMod() != null && this.getRecAnoUltMod().longValue() == -999) {
            conditions += " AND REC_ANO_ULT_MOD IS NULL";
        } else if (this.getRecAnoUltMod() != null) {
            conditions += " AND REC_ANO_ULT_MOD = ?";
            values.add(this.getRecAnoUltMod());
        }

        if (this.getRecMesUltMod() != null && this.getRecMesUltMod().longValue() == -999) {
            conditions += " AND REC_MES_ULT_MOD IS NULL";
        } else if (this.getRecMesUltMod() != null) {
            conditions += " AND REC_MES_ULT_MOD = ?";
            values.add(this.getRecMesUltMod());
        }

        if (this.getRecDiaUltMod() != null && this.getRecDiaUltMod().longValue() == -999) {
            conditions += " AND REC_DIA_ULT_MOD IS NULL";
        } else if (this.getRecDiaUltMod() != null) {
            conditions += " AND REC_DIA_ULT_MOD = ?";
            values.add(this.getRecDiaUltMod());
        }

        if (this.getRecCveStRep() != null && "null".equals(this.getRecCveStRep())) {
            conditions += " AND REC_CVE_ST_REP IS NULL";
        } else if (this.getRecCveStRep() != null) {
            conditions += " AND REC_CVE_ST_REP = ?";
            values.add(this.getRecCveStRep());
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
        String sql = "UPDATE REP_COM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REC_CVEL_REPRES = ?";
        pkValues.add(this.getRecCvelRepres());
        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        fields += " REC_NOMBRE = ?, ";
        values.add(this.getRecNombre());
        fields += " REC_CALLE_NO = ?, ";
        values.add(this.getRecCalleNo());
        fields += " REC_COLONIA = ?, ";
        values.add(this.getRecColonia());
        fields += " REC_CP = ?, ";
        values.add(this.getRecCp());
        fields += " REC_CIUDAD = ?, ";
        values.add(this.getRecCiudad());
        fields += " REC_TELEFONO = ?, ";
        values.add(this.getRecTelefono());
        fields += " REC_FAX = ?, ";
        values.add(this.getRecFax());
        fields += " REC_ANO_ALT_REG = ?, ";
        values.add(this.getRecAnoAltReg());
        fields += " REC_MES_ALT_REG = ?, ";
        values.add(this.getRecMesAltReg());
        fields += " REC_DIA_ALT_REG = ?, ";
        values.add(this.getRecDiaAltReg());
        fields += " REC_ANO_ULT_MOD = ?, ";
        values.add(this.getRecAnoUltMod());
        fields += " REC_MES_ULT_MOD = ?, ";
        values.add(this.getRecMesUltMod());
        fields += " REC_DIA_ULT_MOD = ?, ";
        values.add(this.getRecDiaUltMod());
        fields += " REC_CVE_ST_REP = ?, ";
        values.add(this.getRecCveStRep());
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
        String sql = "INSERT INTO REP_COM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REC_CVEL_REPRES";
        fieldValues += ", ?";
        values.add(this.getRecCvelRepres());

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", REC_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getRecNombre());

        fields += ", REC_CALLE_NO";
        fieldValues += ", ?";
        values.add(this.getRecCalleNo());

        fields += ", REC_COLONIA";
        fieldValues += ", ?";
        values.add(this.getRecColonia());

        fields += ", REC_CP";
        fieldValues += ", ?";
        values.add(this.getRecCp());

        fields += ", REC_CIUDAD";
        fieldValues += ", ?";
        values.add(this.getRecCiudad());

        fields += ", REC_TELEFONO";
        fieldValues += ", ?";
        values.add(this.getRecTelefono());

        fields += ", REC_FAX";
        fieldValues += ", ?";
        values.add(this.getRecFax());

        fields += ", REC_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getRecAnoAltReg());

        fields += ", REC_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getRecMesAltReg());

        fields += ", REC_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getRecDiaAltReg());

        fields += ", REC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRecAnoUltMod());

        fields += ", REC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRecMesUltMod());

        fields += ", REC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRecDiaUltMod());

        fields += ", REC_CVE_ST_REP";
        fieldValues += ", ?";
        values.add(this.getRecCveStRep());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REP_COM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REC_CVEL_REPRES = ?";
        values.add(this.getRecCvelRepres());
        conditions += " AND CPO_ACTA_EMIS = ?";
        values.add(this.getCpoActaEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        RepCom instance = (RepCom) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRecCvelRepres().equals(instance.getRecCvelRepres()))
            equalObjects = false;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getRecNombre().equals(instance.getRecNombre()))
            equalObjects = false;
        if (equalObjects && !this.getRecCalleNo().equals(instance.getRecCalleNo()))
            equalObjects = false;
        if (equalObjects && !this.getRecColonia().equals(instance.getRecColonia()))
            equalObjects = false;
        if (equalObjects && !this.getRecCp().equals(instance.getRecCp()))
            equalObjects = false;
        if (equalObjects && !this.getRecCiudad().equals(instance.getRecCiudad()))
            equalObjects = false;
        if (equalObjects && !this.getRecTelefono().equals(instance.getRecTelefono()))
            equalObjects = false;
        if (equalObjects && !this.getRecFax().equals(instance.getRecFax()))
            equalObjects = false;
        if (equalObjects && !this.getRecAnoAltReg().equals(instance.getRecAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getRecMesAltReg().equals(instance.getRecMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getRecDiaAltReg().equals(instance.getRecDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getRecAnoUltMod().equals(instance.getRecAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRecMesUltMod().equals(instance.getRecMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRecDiaUltMod().equals(instance.getRecDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRecCveStRep().equals(instance.getRecCveStRep()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        RepCom result = new RepCom();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRecCvelRepres((BigDecimal) objectData.getData("REC_CVEL_REPRES"));
        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setRecNombre((String) objectData.getData("REC_NOMBRE"));
        result.setRecCalleNo((String) objectData.getData("REC_CALLE_NO"));
        result.setRecColonia((String) objectData.getData("REC_COLONIA"));
        result.setRecCp((BigDecimal) objectData.getData("REC_CP"));
        result.setRecCiudad((String) objectData.getData("REC_CIUDAD"));
        result.setRecTelefono((String) objectData.getData("REC_TELEFONO"));
        result.setRecFax((String) objectData.getData("REC_FAX"));
        result.setRecAnoAltReg((BigDecimal) objectData.getData("REC_ANO_ALT_REG"));
        result.setRecMesAltReg((BigDecimal) objectData.getData("REC_MES_ALT_REG"));
        result.setRecDiaAltReg((BigDecimal) objectData.getData("REC_DIA_ALT_REG"));
        result.setRecAnoUltMod((BigDecimal) objectData.getData("REC_ANO_ULT_MOD"));
        result.setRecMesUltMod((BigDecimal) objectData.getData("REC_MES_ULT_MOD"));
        result.setRecDiaUltMod((BigDecimal) objectData.getData("REC_DIA_ULT_MOD"));
        result.setRecCveStRep((String) objectData.getData("REC_CVE_ST_REP"));

        return result;

    }

}
