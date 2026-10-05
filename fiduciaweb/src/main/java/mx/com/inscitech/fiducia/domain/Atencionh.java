package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ATENCIONH_PK", columns = { "ATE_CVE_BANCA", "ATE_EJEC_ATENCION", "ATE_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Atencionh extends DomainObject {

    BigDecimal ateNumContrato = null;
    String ateCveBanca = null;
    BigDecimal ateEjecAtencion = null;
    String ateCveTipoFunc = null;
    String ateNomEjecutivo = null;
    BigDecimal ateNumNivel1 = null;
    BigDecimal ateNumNivel2 = null;
    BigDecimal ateNumNivel3 = null;
    BigDecimal ateNumNivel4 = null;
    BigDecimal ateNumNivel5 = null;
    BigDecimal ateAnoAltaReg = null;
    BigDecimal ateMesAltaReg = null;
    BigDecimal ateDiaAltaReg = null;
    BigDecimal ateAnoUltMod = null;
    BigDecimal ateMesUltMod = null;
    BigDecimal ateDiaUltMod = null;
    String ateCveStAtencio = null;

    public Atencionh() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAteNumContrato(BigDecimal ateNumContrato) {
        this.ateNumContrato = ateNumContrato;
    }

    public BigDecimal getAteNumContrato() {
        return this.ateNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAteCveBanca(String ateCveBanca) {
        this.ateCveBanca = ateCveBanca;
    }

    public String getAteCveBanca() {
        return this.ateCveBanca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAteEjecAtencion(BigDecimal ateEjecAtencion) {
        this.ateEjecAtencion = ateEjecAtencion;
    }

    public BigDecimal getAteEjecAtencion() {
        return this.ateEjecAtencion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAteCveTipoFunc(String ateCveTipoFunc) {
        this.ateCveTipoFunc = ateCveTipoFunc;
    }

    public String getAteCveTipoFunc() {
        return this.ateCveTipoFunc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAteNomEjecutivo(String ateNomEjecutivo) {
        this.ateNomEjecutivo = ateNomEjecutivo;
    }

    public String getAteNomEjecutivo() {
        return this.ateNomEjecutivo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAteNumNivel1(BigDecimal ateNumNivel1) {
        this.ateNumNivel1 = ateNumNivel1;
    }

    public BigDecimal getAteNumNivel1() {
        return this.ateNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAteNumNivel2(BigDecimal ateNumNivel2) {
        this.ateNumNivel2 = ateNumNivel2;
    }

    public BigDecimal getAteNumNivel2() {
        return this.ateNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAteNumNivel3(BigDecimal ateNumNivel3) {
        this.ateNumNivel3 = ateNumNivel3;
    }

    public BigDecimal getAteNumNivel3() {
        return this.ateNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAteNumNivel4(BigDecimal ateNumNivel4) {
        this.ateNumNivel4 = ateNumNivel4;
    }

    public BigDecimal getAteNumNivel4() {
        return this.ateNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAteNumNivel5(BigDecimal ateNumNivel5) {
        this.ateNumNivel5 = ateNumNivel5;
    }

    public BigDecimal getAteNumNivel5() {
        return this.ateNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAteAnoAltaReg(BigDecimal ateAnoAltaReg) {
        this.ateAnoAltaReg = ateAnoAltaReg;
    }

    public BigDecimal getAteAnoAltaReg() {
        return this.ateAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAteMesAltaReg(BigDecimal ateMesAltaReg) {
        this.ateMesAltaReg = ateMesAltaReg;
    }

    public BigDecimal getAteMesAltaReg() {
        return this.ateMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAteDiaAltaReg(BigDecimal ateDiaAltaReg) {
        this.ateDiaAltaReg = ateDiaAltaReg;
    }

    public BigDecimal getAteDiaAltaReg() {
        return this.ateDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAteAnoUltMod(BigDecimal ateAnoUltMod) {
        this.ateAnoUltMod = ateAnoUltMod;
    }

    public BigDecimal getAteAnoUltMod() {
        return this.ateAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAteMesUltMod(BigDecimal ateMesUltMod) {
        this.ateMesUltMod = ateMesUltMod;
    }

    public BigDecimal getAteMesUltMod() {
        return this.ateMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAteDiaUltMod(BigDecimal ateDiaUltMod) {
        this.ateDiaUltMod = ateDiaUltMod;
    }

    public BigDecimal getAteDiaUltMod() {
        return this.ateDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAteCveStAtencio(String ateCveStAtencio) {
        this.ateCveStAtencio = ateCveStAtencio;
    }

    public String getAteCveStAtencio() {
        return this.ateCveStAtencio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ATENCIONH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAteNumContrato() != null && this.getAteNumContrato().longValue() == -999) {
            conditions += " AND ATE_NUM_CONTRATO IS NULL";
        } else if (this.getAteNumContrato() != null) {
            conditions += " AND ATE_NUM_CONTRATO = ?";
            values.add(this.getAteNumContrato());
        }

        if (this.getAteCveBanca() != null && "null".equals(this.getAteCveBanca())) {
            conditions += " AND ATE_CVE_BANCA IS NULL";
        } else if (this.getAteCveBanca() != null) {
            conditions += " AND ATE_CVE_BANCA = ?";
            values.add(this.getAteCveBanca());
        }

        if (this.getAteEjecAtencion() != null && this.getAteEjecAtencion().longValue() == -999) {
            conditions += " AND ATE_EJEC_ATENCION IS NULL";
        } else if (this.getAteEjecAtencion() != null) {
            conditions += " AND ATE_EJEC_ATENCION = ?";
            values.add(this.getAteEjecAtencion());
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
        String sql = "SELECT * FROM ATENCIONH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAteNumContrato() != null && this.getAteNumContrato().longValue() == -999) {
            conditions += " AND ATE_NUM_CONTRATO IS NULL";
        } else if (this.getAteNumContrato() != null) {
            conditions += " AND ATE_NUM_CONTRATO = ?";
            values.add(this.getAteNumContrato());
        }

        if (this.getAteCveBanca() != null && "null".equals(this.getAteCveBanca())) {
            conditions += " AND ATE_CVE_BANCA IS NULL";
        } else if (this.getAteCveBanca() != null) {
            conditions += " AND ATE_CVE_BANCA = ?";
            values.add(this.getAteCveBanca());
        }

        if (this.getAteEjecAtencion() != null && this.getAteEjecAtencion().longValue() == -999) {
            conditions += " AND ATE_EJEC_ATENCION IS NULL";
        } else if (this.getAteEjecAtencion() != null) {
            conditions += " AND ATE_EJEC_ATENCION = ?";
            values.add(this.getAteEjecAtencion());
        }

        if (this.getAteCveTipoFunc() != null && "null".equals(this.getAteCveTipoFunc())) {
            conditions += " AND ATE_CVE_TIPO_FUNC IS NULL";
        } else if (this.getAteCveTipoFunc() != null) {
            conditions += " AND ATE_CVE_TIPO_FUNC = ?";
            values.add(this.getAteCveTipoFunc());
        }

        if (this.getAteNomEjecutivo() != null && "null".equals(this.getAteNomEjecutivo())) {
            conditions += " AND ATE_NOM_EJECUTIVO IS NULL";
        } else if (this.getAteNomEjecutivo() != null) {
            conditions += " AND ATE_NOM_EJECUTIVO = ?";
            values.add(this.getAteNomEjecutivo());
        }

        if (this.getAteNumNivel1() != null && this.getAteNumNivel1().longValue() == -999) {
            conditions += " AND ATE_NUM_NIVEL1 IS NULL";
        } else if (this.getAteNumNivel1() != null) {
            conditions += " AND ATE_NUM_NIVEL1 = ?";
            values.add(this.getAteNumNivel1());
        }

        if (this.getAteNumNivel2() != null && this.getAteNumNivel2().longValue() == -999) {
            conditions += " AND ATE_NUM_NIVEL2 IS NULL";
        } else if (this.getAteNumNivel2() != null) {
            conditions += " AND ATE_NUM_NIVEL2 = ?";
            values.add(this.getAteNumNivel2());
        }

        if (this.getAteNumNivel3() != null && this.getAteNumNivel3().longValue() == -999) {
            conditions += " AND ATE_NUM_NIVEL3 IS NULL";
        } else if (this.getAteNumNivel3() != null) {
            conditions += " AND ATE_NUM_NIVEL3 = ?";
            values.add(this.getAteNumNivel3());
        }

        if (this.getAteNumNivel4() != null && this.getAteNumNivel4().longValue() == -999) {
            conditions += " AND ATE_NUM_NIVEL4 IS NULL";
        } else if (this.getAteNumNivel4() != null) {
            conditions += " AND ATE_NUM_NIVEL4 = ?";
            values.add(this.getAteNumNivel4());
        }

        if (this.getAteNumNivel5() != null && this.getAteNumNivel5().longValue() == -999) {
            conditions += " AND ATE_NUM_NIVEL5 IS NULL";
        } else if (this.getAteNumNivel5() != null) {
            conditions += " AND ATE_NUM_NIVEL5 = ?";
            values.add(this.getAteNumNivel5());
        }

        if (this.getAteAnoAltaReg() != null && this.getAteAnoAltaReg().longValue() == -999) {
            conditions += " AND ATE_ANO_ALTA_REG IS NULL";
        } else if (this.getAteAnoAltaReg() != null) {
            conditions += " AND ATE_ANO_ALTA_REG = ?";
            values.add(this.getAteAnoAltaReg());
        }

        if (this.getAteMesAltaReg() != null && this.getAteMesAltaReg().longValue() == -999) {
            conditions += " AND ATE_MES_ALTA_REG IS NULL";
        } else if (this.getAteMesAltaReg() != null) {
            conditions += " AND ATE_MES_ALTA_REG = ?";
            values.add(this.getAteMesAltaReg());
        }

        if (this.getAteDiaAltaReg() != null && this.getAteDiaAltaReg().longValue() == -999) {
            conditions += " AND ATE_DIA_ALTA_REG IS NULL";
        } else if (this.getAteDiaAltaReg() != null) {
            conditions += " AND ATE_DIA_ALTA_REG = ?";
            values.add(this.getAteDiaAltaReg());
        }

        if (this.getAteAnoUltMod() != null && this.getAteAnoUltMod().longValue() == -999) {
            conditions += " AND ATE_ANO_ULT_MOD IS NULL";
        } else if (this.getAteAnoUltMod() != null) {
            conditions += " AND ATE_ANO_ULT_MOD = ?";
            values.add(this.getAteAnoUltMod());
        }

        if (this.getAteMesUltMod() != null && this.getAteMesUltMod().longValue() == -999) {
            conditions += " AND ATE_MES_ULT_MOD IS NULL";
        } else if (this.getAteMesUltMod() != null) {
            conditions += " AND ATE_MES_ULT_MOD = ?";
            values.add(this.getAteMesUltMod());
        }

        if (this.getAteDiaUltMod() != null && this.getAteDiaUltMod().longValue() == -999) {
            conditions += " AND ATE_DIA_ULT_MOD IS NULL";
        } else if (this.getAteDiaUltMod() != null) {
            conditions += " AND ATE_DIA_ULT_MOD = ?";
            values.add(this.getAteDiaUltMod());
        }

        if (this.getAteCveStAtencio() != null && "null".equals(this.getAteCveStAtencio())) {
            conditions += " AND ATE_CVE_ST_ATENCIO IS NULL";
        } else if (this.getAteCveStAtencio() != null) {
            conditions += " AND ATE_CVE_ST_ATENCIO = ?";
            values.add(this.getAteCveStAtencio());
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
        String sql = "UPDATE ATENCIONH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ATE_NUM_CONTRATO = ?";
        pkValues.add(this.getAteNumContrato());
        conditions += " AND ATE_CVE_BANCA = ?";
        pkValues.add(this.getAteCveBanca());
        conditions += " AND ATE_EJEC_ATENCION = ?";
        pkValues.add(this.getAteEjecAtencion());
        fields += " ATE_CVE_TIPO_FUNC = ?, ";
        values.add(this.getAteCveTipoFunc());
        fields += " ATE_NOM_EJECUTIVO = ?, ";
        values.add(this.getAteNomEjecutivo());
        fields += " ATE_NUM_NIVEL1 = ?, ";
        values.add(this.getAteNumNivel1());
        fields += " ATE_NUM_NIVEL2 = ?, ";
        values.add(this.getAteNumNivel2());
        fields += " ATE_NUM_NIVEL3 = ?, ";
        values.add(this.getAteNumNivel3());
        fields += " ATE_NUM_NIVEL4 = ?, ";
        values.add(this.getAteNumNivel4());
        fields += " ATE_NUM_NIVEL5 = ?, ";
        values.add(this.getAteNumNivel5());
        fields += " ATE_ANO_ALTA_REG = ?, ";
        values.add(this.getAteAnoAltaReg());
        fields += " ATE_MES_ALTA_REG = ?, ";
        values.add(this.getAteMesAltaReg());
        fields += " ATE_DIA_ALTA_REG = ?, ";
        values.add(this.getAteDiaAltaReg());
        fields += " ATE_ANO_ULT_MOD = ?, ";
        values.add(this.getAteAnoUltMod());
        fields += " ATE_MES_ULT_MOD = ?, ";
        values.add(this.getAteMesUltMod());
        fields += " ATE_DIA_ULT_MOD = ?, ";
        values.add(this.getAteDiaUltMod());
        fields += " ATE_CVE_ST_ATENCIO = ?, ";
        values.add(this.getAteCveStAtencio());
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
        String sql = "INSERT INTO ATENCIONH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ATE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAteNumContrato());

        fields += ", ATE_CVE_BANCA";
        fieldValues += ", ?";
        values.add(this.getAteCveBanca());

        fields += ", ATE_EJEC_ATENCION";
        fieldValues += ", ?";
        values.add(this.getAteEjecAtencion());

        fields += ", ATE_CVE_TIPO_FUNC";
        fieldValues += ", ?";
        values.add(this.getAteCveTipoFunc());

        fields += ", ATE_NOM_EJECUTIVO";
        fieldValues += ", ?";
        values.add(this.getAteNomEjecutivo());

        fields += ", ATE_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getAteNumNivel1());

        fields += ", ATE_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getAteNumNivel2());

        fields += ", ATE_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getAteNumNivel3());

        fields += ", ATE_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getAteNumNivel4());

        fields += ", ATE_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getAteNumNivel5());

        fields += ", ATE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAteAnoAltaReg());

        fields += ", ATE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAteMesAltaReg());

        fields += ", ATE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAteDiaAltaReg());

        fields += ", ATE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAteAnoUltMod());

        fields += ", ATE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAteMesUltMod());

        fields += ", ATE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAteDiaUltMod());

        fields += ", ATE_CVE_ST_ATENCIO";
        fieldValues += ", ?";
        values.add(this.getAteCveStAtencio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ATENCIONH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ATE_NUM_CONTRATO = ?";
        values.add(this.getAteNumContrato());
        conditions += " AND ATE_CVE_BANCA = ?";
        values.add(this.getAteCveBanca());
        conditions += " AND ATE_EJEC_ATENCION = ?";
        values.add(this.getAteEjecAtencion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Atencionh instance = (Atencionh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAteNumContrato().equals(instance.getAteNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAteCveBanca().equals(instance.getAteCveBanca()))
            equalObjects = false;
        if (equalObjects && !this.getAteEjecAtencion().equals(instance.getAteEjecAtencion()))
            equalObjects = false;
        if (equalObjects && !this.getAteCveTipoFunc().equals(instance.getAteCveTipoFunc()))
            equalObjects = false;
        if (equalObjects && !this.getAteNomEjecutivo().equals(instance.getAteNomEjecutivo()))
            equalObjects = false;
        if (equalObjects && !this.getAteNumNivel1().equals(instance.getAteNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getAteNumNivel2().equals(instance.getAteNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getAteNumNivel3().equals(instance.getAteNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getAteNumNivel4().equals(instance.getAteNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getAteNumNivel5().equals(instance.getAteNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getAteAnoAltaReg().equals(instance.getAteAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAteMesAltaReg().equals(instance.getAteMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAteDiaAltaReg().equals(instance.getAteDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAteAnoUltMod().equals(instance.getAteAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAteMesUltMod().equals(instance.getAteMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAteDiaUltMod().equals(instance.getAteDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAteCveStAtencio().equals(instance.getAteCveStAtencio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Atencionh result = new Atencionh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAteNumContrato((BigDecimal) objectData.getData("ATE_NUM_CONTRATO"));
        result.setAteCveBanca((String) objectData.getData("ATE_CVE_BANCA"));
        result.setAteEjecAtencion((BigDecimal) objectData.getData("ATE_EJEC_ATENCION"));
        result.setAteCveTipoFunc((String) objectData.getData("ATE_CVE_TIPO_FUNC"));
        result.setAteNomEjecutivo((String) objectData.getData("ATE_NOM_EJECUTIVO"));
        result.setAteNumNivel1((BigDecimal) objectData.getData("ATE_NUM_NIVEL1"));
        result.setAteNumNivel2((BigDecimal) objectData.getData("ATE_NUM_NIVEL2"));
        result.setAteNumNivel3((BigDecimal) objectData.getData("ATE_NUM_NIVEL3"));
        result.setAteNumNivel4((BigDecimal) objectData.getData("ATE_NUM_NIVEL4"));
        result.setAteNumNivel5((BigDecimal) objectData.getData("ATE_NUM_NIVEL5"));
        result.setAteAnoAltaReg((BigDecimal) objectData.getData("ATE_ANO_ALTA_REG"));
        result.setAteMesAltaReg((BigDecimal) objectData.getData("ATE_MES_ALTA_REG"));
        result.setAteDiaAltaReg((BigDecimal) objectData.getData("ATE_DIA_ALTA_REG"));
        result.setAteAnoUltMod((BigDecimal) objectData.getData("ATE_ANO_ULT_MOD"));
        result.setAteMesUltMod((BigDecimal) objectData.getData("ATE_MES_ULT_MOD"));
        result.setAteDiaUltMod((BigDecimal) objectData.getData("ATE_DIA_ULT_MOD"));
        result.setAteCveStAtencio((String) objectData.getData("ATE_CVE_ST_ATENCIO"));

        return result;

    }

}
