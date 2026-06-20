package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OPERACIO_PK", columns = { "OPE_NUM_OPERACION" }, sequences = { "MAX" })
public class Operacio extends DomainObject {

    BigDecimal opeNumOperacion = null;
    String opeNomOperacion = null;
    BigDecimal opeHrIniEjec = null;
    BigDecimal opeMinIniEjec = null;
    BigDecimal opeHrFinEjec = null;
    BigDecimal opeMinFinEjec = null;
    BigDecimal opeOperaCancela = null;
    BigDecimal opeCostoOpera = null;
    BigDecimal opeOperacionCont = null;
    BigDecimal opeAnoAltaReg = null;
    BigDecimal opeMesAltaReg = null;
    BigDecimal opeDiaAltaReg = null;
    BigDecimal opeAnoUltMod = null;
    BigDecimal opeMesUltMod = null;
    BigDecimal opeDiaUltMod = null;
    String opeCveStOperaci = null;

    public Operacio() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpeNumOperacion(BigDecimal opeNumOperacion) {
        this.opeNumOperacion = opeNumOperacion;
    }

    public BigDecimal getOpeNumOperacion() {
        return this.opeNumOperacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOpeNomOperacion(String opeNomOperacion) {
        this.opeNomOperacion = opeNomOperacion;
    }

    public String getOpeNomOperacion() {
        return this.opeNomOperacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpeHrIniEjec(BigDecimal opeHrIniEjec) {
        this.opeHrIniEjec = opeHrIniEjec;
    }

    public BigDecimal getOpeHrIniEjec() {
        return this.opeHrIniEjec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpeMinIniEjec(BigDecimal opeMinIniEjec) {
        this.opeMinIniEjec = opeMinIniEjec;
    }

    public BigDecimal getOpeMinIniEjec() {
        return this.opeMinIniEjec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpeHrFinEjec(BigDecimal opeHrFinEjec) {
        this.opeHrFinEjec = opeHrFinEjec;
    }

    public BigDecimal getOpeHrFinEjec() {
        return this.opeHrFinEjec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpeMinFinEjec(BigDecimal opeMinFinEjec) {
        this.opeMinFinEjec = opeMinFinEjec;
    }

    public BigDecimal getOpeMinFinEjec() {
        return this.opeMinFinEjec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpeOperaCancela(BigDecimal opeOperaCancela) {
        this.opeOperaCancela = opeOperaCancela;
    }

    public BigDecimal getOpeOperaCancela() {
        return this.opeOperaCancela;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOpeCostoOpera(BigDecimal opeCostoOpera) {
        this.opeCostoOpera = opeCostoOpera;
    }

    public BigDecimal getOpeCostoOpera() {
        return this.opeCostoOpera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpeOperacionCont(BigDecimal opeOperacionCont) {
        this.opeOperacionCont = opeOperacionCont;
    }

    public BigDecimal getOpeOperacionCont() {
        return this.opeOperacionCont;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOpeAnoAltaReg(BigDecimal opeAnoAltaReg) {
        this.opeAnoAltaReg = opeAnoAltaReg;
    }

    public BigDecimal getOpeAnoAltaReg() {
        return this.opeAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOpeMesAltaReg(BigDecimal opeMesAltaReg) {
        this.opeMesAltaReg = opeMesAltaReg;
    }

    public BigDecimal getOpeMesAltaReg() {
        return this.opeMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOpeDiaAltaReg(BigDecimal opeDiaAltaReg) {
        this.opeDiaAltaReg = opeDiaAltaReg;
    }

    public BigDecimal getOpeDiaAltaReg() {
        return this.opeDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOpeAnoUltMod(BigDecimal opeAnoUltMod) {
        this.opeAnoUltMod = opeAnoUltMod;
    }

    public BigDecimal getOpeAnoUltMod() {
        return this.opeAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOpeMesUltMod(BigDecimal opeMesUltMod) {
        this.opeMesUltMod = opeMesUltMod;
    }

    public BigDecimal getOpeMesUltMod() {
        return this.opeMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOpeDiaUltMod(BigDecimal opeDiaUltMod) {
        this.opeDiaUltMod = opeDiaUltMod;
    }

    public BigDecimal getOpeDiaUltMod() {
        return this.opeDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOpeCveStOperaci(String opeCveStOperaci) {
        this.opeCveStOperaci = opeCveStOperaci;
    }

    public String getOpeCveStOperaci() {
        return this.opeCveStOperaci;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OPERACIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOpeNumOperacion() != null && this.getOpeNumOperacion().longValue() == -999) {
            conditions += " AND OPE_NUM_OPERACION IS NULL";
        } else if (this.getOpeNumOperacion() != null) {
            conditions += " AND OPE_NUM_OPERACION = ?";
            values.add(this.getOpeNumOperacion());
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
        String sql = "SELECT * FROM OPERACIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOpeNumOperacion() != null && this.getOpeNumOperacion().longValue() == -999) {
            conditions += " AND OPE_NUM_OPERACION IS NULL";
        } else if (this.getOpeNumOperacion() != null) {
            conditions += " AND OPE_NUM_OPERACION = ?";
            values.add(this.getOpeNumOperacion());
        }

        if (this.getOpeNomOperacion() != null && "null".equals(this.getOpeNomOperacion())) {
            conditions += " AND OPE_NOM_OPERACION IS NULL";
        } else if (this.getOpeNomOperacion() != null) {
            conditions += " AND OPE_NOM_OPERACION = ?";
            values.add(this.getOpeNomOperacion());
        }

        if (this.getOpeHrIniEjec() != null && this.getOpeHrIniEjec().longValue() == -999) {
            conditions += " AND OPE_HR_INI_EJEC IS NULL";
        } else if (this.getOpeHrIniEjec() != null) {
            conditions += " AND OPE_HR_INI_EJEC = ?";
            values.add(this.getOpeHrIniEjec());
        }

        if (this.getOpeMinIniEjec() != null && this.getOpeMinIniEjec().longValue() == -999) {
            conditions += " AND OPE_MIN_INI_EJEC IS NULL";
        } else if (this.getOpeMinIniEjec() != null) {
            conditions += " AND OPE_MIN_INI_EJEC = ?";
            values.add(this.getOpeMinIniEjec());
        }

        if (this.getOpeHrFinEjec() != null && this.getOpeHrFinEjec().longValue() == -999) {
            conditions += " AND OPE_HR_FIN_EJEC IS NULL";
        } else if (this.getOpeHrFinEjec() != null) {
            conditions += " AND OPE_HR_FIN_EJEC = ?";
            values.add(this.getOpeHrFinEjec());
        }

        if (this.getOpeMinFinEjec() != null && this.getOpeMinFinEjec().longValue() == -999) {
            conditions += " AND OPE_MIN_FIN_EJEC IS NULL";
        } else if (this.getOpeMinFinEjec() != null) {
            conditions += " AND OPE_MIN_FIN_EJEC = ?";
            values.add(this.getOpeMinFinEjec());
        }

        if (this.getOpeOperaCancela() != null && this.getOpeOperaCancela().longValue() == -999) {
            conditions += " AND OPE_OPERA_CANCELA IS NULL";
        } else if (this.getOpeOperaCancela() != null) {
            conditions += " AND OPE_OPERA_CANCELA = ?";
            values.add(this.getOpeOperaCancela());
        }

        if (this.getOpeCostoOpera() != null && this.getOpeCostoOpera().longValue() == -999) {
            conditions += " AND OPE_COSTO_OPERA IS NULL";
        } else if (this.getOpeCostoOpera() != null) {
            conditions += " AND OPE_COSTO_OPERA = ?";
            values.add(this.getOpeCostoOpera());
        }

        if (this.getOpeOperacionCont() != null && this.getOpeOperacionCont().longValue() == -999) {
            conditions += " AND OPE_OPERACION_CONT IS NULL";
        } else if (this.getOpeOperacionCont() != null) {
            conditions += " AND OPE_OPERACION_CONT = ?";
            values.add(this.getOpeOperacionCont());
        }

        if (this.getOpeAnoAltaReg() != null && this.getOpeAnoAltaReg().longValue() == -999) {
            conditions += " AND OPE_ANO_ALTA_REG IS NULL";
        } else if (this.getOpeAnoAltaReg() != null) {
            conditions += " AND OPE_ANO_ALTA_REG = ?";
            values.add(this.getOpeAnoAltaReg());
        }

        if (this.getOpeMesAltaReg() != null && this.getOpeMesAltaReg().longValue() == -999) {
            conditions += " AND OPE_MES_ALTA_REG IS NULL";
        } else if (this.getOpeMesAltaReg() != null) {
            conditions += " AND OPE_MES_ALTA_REG = ?";
            values.add(this.getOpeMesAltaReg());
        }

        if (this.getOpeDiaAltaReg() != null && this.getOpeDiaAltaReg().longValue() == -999) {
            conditions += " AND OPE_DIA_ALTA_REG IS NULL";
        } else if (this.getOpeDiaAltaReg() != null) {
            conditions += " AND OPE_DIA_ALTA_REG = ?";
            values.add(this.getOpeDiaAltaReg());
        }

        if (this.getOpeAnoUltMod() != null && this.getOpeAnoUltMod().longValue() == -999) {
            conditions += " AND OPE_ANO_ULT_MOD IS NULL";
        } else if (this.getOpeAnoUltMod() != null) {
            conditions += " AND OPE_ANO_ULT_MOD = ?";
            values.add(this.getOpeAnoUltMod());
        }

        if (this.getOpeMesUltMod() != null && this.getOpeMesUltMod().longValue() == -999) {
            conditions += " AND OPE_MES_ULT_MOD IS NULL";
        } else if (this.getOpeMesUltMod() != null) {
            conditions += " AND OPE_MES_ULT_MOD = ?";
            values.add(this.getOpeMesUltMod());
        }

        if (this.getOpeDiaUltMod() != null && this.getOpeDiaUltMod().longValue() == -999) {
            conditions += " AND OPE_DIA_ULT_MOD IS NULL";
        } else if (this.getOpeDiaUltMod() != null) {
            conditions += " AND OPE_DIA_ULT_MOD = ?";
            values.add(this.getOpeDiaUltMod());
        }

        if (this.getOpeCveStOperaci() != null && "null".equals(this.getOpeCveStOperaci())) {
            conditions += " AND OPE_CVE_ST_OPERACI IS NULL";
        } else if (this.getOpeCveStOperaci() != null) {
            conditions += " AND OPE_CVE_ST_OPERACI = ?";
            values.add(this.getOpeCveStOperaci());
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
        String sql = "UPDATE OPERACIO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OPE_NUM_OPERACION = ?";
        pkValues.add(this.getOpeNumOperacion());
        fields += " OPE_NOM_OPERACION = ?, ";
        values.add(this.getOpeNomOperacion());
        fields += " OPE_HR_INI_EJEC = ?, ";
        values.add(this.getOpeHrIniEjec());
        fields += " OPE_MIN_INI_EJEC = ?, ";
        values.add(this.getOpeMinIniEjec());
        fields += " OPE_HR_FIN_EJEC = ?, ";
        values.add(this.getOpeHrFinEjec());
        fields += " OPE_MIN_FIN_EJEC = ?, ";
        values.add(this.getOpeMinFinEjec());
        fields += " OPE_OPERA_CANCELA = ?, ";
        values.add(this.getOpeOperaCancela());
        fields += " OPE_COSTO_OPERA = ?, ";
        values.add(this.getOpeCostoOpera());
        fields += " OPE_OPERACION_CONT = ?, ";
        values.add(this.getOpeOperacionCont());
        fields += " OPE_ANO_ALTA_REG = ?, ";
        values.add(this.getOpeAnoAltaReg());
        fields += " OPE_MES_ALTA_REG = ?, ";
        values.add(this.getOpeMesAltaReg());
        fields += " OPE_DIA_ALTA_REG = ?, ";
        values.add(this.getOpeDiaAltaReg());
        fields += " OPE_ANO_ULT_MOD = ?, ";
        values.add(this.getOpeAnoUltMod());
        fields += " OPE_MES_ULT_MOD = ?, ";
        values.add(this.getOpeMesUltMod());
        fields += " OPE_DIA_ULT_MOD = ?, ";
        values.add(this.getOpeDiaUltMod());
        fields += " OPE_CVE_ST_OPERACI = ?, ";
        values.add(this.getOpeCveStOperaci());
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
        String sql = "INSERT INTO OPERACIO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OPE_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getOpeNumOperacion());

        fields += ", OPE_NOM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getOpeNomOperacion());

        fields += ", OPE_HR_INI_EJEC";
        fieldValues += ", ?";
        values.add(this.getOpeHrIniEjec());

        fields += ", OPE_MIN_INI_EJEC";
        fieldValues += ", ?";
        values.add(this.getOpeMinIniEjec());

        fields += ", OPE_HR_FIN_EJEC";
        fieldValues += ", ?";
        values.add(this.getOpeHrFinEjec());

        fields += ", OPE_MIN_FIN_EJEC";
        fieldValues += ", ?";
        values.add(this.getOpeMinFinEjec());

        fields += ", OPE_OPERA_CANCELA";
        fieldValues += ", ?";
        values.add(this.getOpeOperaCancela());

        fields += ", OPE_COSTO_OPERA";
        fieldValues += ", ?";
        values.add(this.getOpeCostoOpera());

        fields += ", OPE_OPERACION_CONT";
        fieldValues += ", ?";
        values.add(this.getOpeOperacionCont());

        fields += ", OPE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOpeAnoAltaReg());

        fields += ", OPE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOpeMesAltaReg());

        fields += ", OPE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOpeDiaAltaReg());

        fields += ", OPE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOpeAnoUltMod());

        fields += ", OPE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOpeMesUltMod());

        fields += ", OPE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOpeDiaUltMod());

        fields += ", OPE_CVE_ST_OPERACI";
        fieldValues += ", ?";
        values.add(this.getOpeCveStOperaci());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OPERACIO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OPE_NUM_OPERACION = ?";
        values.add(this.getOpeNumOperacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Operacio instance = (Operacio) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOpeNumOperacion().equals(instance.getOpeNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getOpeNomOperacion().equals(instance.getOpeNomOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getOpeHrIniEjec().equals(instance.getOpeHrIniEjec()))
            equalObjects = false;
        if (equalObjects && !this.getOpeMinIniEjec().equals(instance.getOpeMinIniEjec()))
            equalObjects = false;
        if (equalObjects && !this.getOpeHrFinEjec().equals(instance.getOpeHrFinEjec()))
            equalObjects = false;
        if (equalObjects && !this.getOpeMinFinEjec().equals(instance.getOpeMinFinEjec()))
            equalObjects = false;
        if (equalObjects && !this.getOpeOperaCancela().equals(instance.getOpeOperaCancela()))
            equalObjects = false;
        if (equalObjects && !this.getOpeCostoOpera().equals(instance.getOpeCostoOpera()))
            equalObjects = false;
        if (equalObjects && !this.getOpeOperacionCont().equals(instance.getOpeOperacionCont()))
            equalObjects = false;
        if (equalObjects && !this.getOpeAnoAltaReg().equals(instance.getOpeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOpeMesAltaReg().equals(instance.getOpeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOpeDiaAltaReg().equals(instance.getOpeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOpeAnoUltMod().equals(instance.getOpeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOpeMesUltMod().equals(instance.getOpeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOpeDiaUltMod().equals(instance.getOpeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOpeCveStOperaci().equals(instance.getOpeCveStOperaci()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Operacio result = new Operacio();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOpeNumOperacion((BigDecimal) objectData.getData("OPE_NUM_OPERACION"));
        result.setOpeNomOperacion((String) objectData.getData("OPE_NOM_OPERACION"));
        result.setOpeHrIniEjec((BigDecimal) objectData.getData("OPE_HR_INI_EJEC"));
        result.setOpeMinIniEjec((BigDecimal) objectData.getData("OPE_MIN_INI_EJEC"));
        result.setOpeHrFinEjec((BigDecimal) objectData.getData("OPE_HR_FIN_EJEC"));
        result.setOpeMinFinEjec((BigDecimal) objectData.getData("OPE_MIN_FIN_EJEC"));
        result.setOpeOperaCancela((BigDecimal) objectData.getData("OPE_OPERA_CANCELA"));
        result.setOpeCostoOpera((BigDecimal) objectData.getData("OPE_COSTO_OPERA"));
        result.setOpeOperacionCont((BigDecimal) objectData.getData("OPE_OPERACION_CONT"));
        result.setOpeAnoAltaReg((BigDecimal) objectData.getData("OPE_ANO_ALTA_REG"));
        result.setOpeMesAltaReg((BigDecimal) objectData.getData("OPE_MES_ALTA_REG"));
        result.setOpeDiaAltaReg((BigDecimal) objectData.getData("OPE_DIA_ALTA_REG"));
        result.setOpeAnoUltMod((BigDecimal) objectData.getData("OPE_ANO_ULT_MOD"));
        result.setOpeMesUltMod((BigDecimal) objectData.getData("OPE_MES_ULT_MOD"));
        result.setOpeDiaUltMod((BigDecimal) objectData.getData("OPE_DIA_ULT_MOD"));
        result.setOpeCveStOperaci((String) objectData.getData("OPE_CVE_ST_OPERACI"));

        return result;

    }

}
