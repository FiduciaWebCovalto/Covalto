package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "BITACORA_PK",
            columns =
            { "BIT_ANO_TRANSAC", "BIT_MES_TRANSAC", "BIT_DIA_TRANSAC", "BIT_HORA_TRANSAC", "BIT_MIN_TRANSAC", "BIT_SEG_TRANSAC", "BIT_ID_TERMINAL", "BIT_NOM_PGM",
              "BIT_NUM_USUARIO", "BIT_CVE_FUNCION"
    }, sequences = { "MANUAL" })
public class Bitacora extends DomainObject {

    BigDecimal bitAnoTransac = null;
    BigDecimal bitMesTransac = null;
    BigDecimal bitDiaTransac = null;
    BigDecimal bitHoraTransac = null;
    BigDecimal bitMinTransac = null;
    BigDecimal bitSegTransac = null;
    String bitIdTerminal = null;
    BigDecimal bitNumUsuario = null;
    String bitNomPgm = null;
    String bitCveFuncion = null;
    String bitDetBitacora = null;
    BigDecimal bitAnoAltaReg = null;
    BigDecimal bitMesAltaReg = null;
    BigDecimal bitDiaAltaReg = null;
    BigDecimal bitAnoUltMod = null;
    BigDecimal bitMesUltMod = null;
    BigDecimal bitDiaUltMod = null;
    String bitCveStBitacor = null;

    public Bitacora() {
        super();
        this.pkColumns = 10;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBitAnoTransac(BigDecimal bitAnoTransac) {
        this.bitAnoTransac = bitAnoTransac;
    }

    public BigDecimal getBitAnoTransac() {
        return this.bitAnoTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBitMesTransac(BigDecimal bitMesTransac) {
        this.bitMesTransac = bitMesTransac;
    }

    public BigDecimal getBitMesTransac() {
        return this.bitMesTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBitDiaTransac(BigDecimal bitDiaTransac) {
        this.bitDiaTransac = bitDiaTransac;
    }

    public BigDecimal getBitDiaTransac() {
        return this.bitDiaTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBitHoraTransac(BigDecimal bitHoraTransac) {
        this.bitHoraTransac = bitHoraTransac;
    }

    public BigDecimal getBitHoraTransac() {
        return this.bitHoraTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBitMinTransac(BigDecimal bitMinTransac) {
        this.bitMinTransac = bitMinTransac;
    }

    public BigDecimal getBitMinTransac() {
        return this.bitMinTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBitSegTransac(BigDecimal bitSegTransac) {
        this.bitSegTransac = bitSegTransac;
    }

    public BigDecimal getBitSegTransac() {
        return this.bitSegTransac;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitIdTerminal(String bitIdTerminal) {
        this.bitIdTerminal = bitIdTerminal;
    }

    public String getBitIdTerminal() {
        return this.bitIdTerminal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBitNumUsuario(BigDecimal bitNumUsuario) {
        this.bitNumUsuario = bitNumUsuario;
    }

    public BigDecimal getBitNumUsuario() {
        return this.bitNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitNomPgm(String bitNomPgm) {
        this.bitNomPgm = bitNomPgm;
    }

    public String getBitNomPgm() {
        return this.bitNomPgm;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitCveFuncion(String bitCveFuncion) {
        this.bitCveFuncion = bitCveFuncion;
    }

    public String getBitCveFuncion() {
        return this.bitCveFuncion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitDetBitacora(String bitDetBitacora) {
        this.bitDetBitacora = bitDetBitacora;
    }

    public String getBitDetBitacora() {
        return this.bitDetBitacora;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBitAnoAltaReg(BigDecimal bitAnoAltaReg) {
        this.bitAnoAltaReg = bitAnoAltaReg;
    }

    public BigDecimal getBitAnoAltaReg() {
        return this.bitAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBitMesAltaReg(BigDecimal bitMesAltaReg) {
        this.bitMesAltaReg = bitMesAltaReg;
    }

    public BigDecimal getBitMesAltaReg() {
        return this.bitMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBitDiaAltaReg(BigDecimal bitDiaAltaReg) {
        this.bitDiaAltaReg = bitDiaAltaReg;
    }

    public BigDecimal getBitDiaAltaReg() {
        return this.bitDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBitAnoUltMod(BigDecimal bitAnoUltMod) {
        this.bitAnoUltMod = bitAnoUltMod;
    }

    public BigDecimal getBitAnoUltMod() {
        return this.bitAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBitMesUltMod(BigDecimal bitMesUltMod) {
        this.bitMesUltMod = bitMesUltMod;
    }

    public BigDecimal getBitMesUltMod() {
        return this.bitMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBitDiaUltMod(BigDecimal bitDiaUltMod) {
        this.bitDiaUltMod = bitDiaUltMod;
    }

    public BigDecimal getBitDiaUltMod() {
        return this.bitDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitCveStBitacor(String bitCveStBitacor) {
        this.bitCveStBitacor = bitCveStBitacor;
    }

    public String getBitCveStBitacor() {
        return this.bitCveStBitacor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM BITACORA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBitAnoTransac() != null && this.getBitAnoTransac().longValue() == -999) {
            conditions += " AND BIT_ANO_TRANSAC IS NULL";
        } else if (this.getBitAnoTransac() != null) {
            conditions += " AND BIT_ANO_TRANSAC = ?";
            values.add(this.getBitAnoTransac());
        }

        if (this.getBitMesTransac() != null && this.getBitMesTransac().longValue() == -999) {
            conditions += " AND BIT_MES_TRANSAC IS NULL";
        } else if (this.getBitMesTransac() != null) {
            conditions += " AND BIT_MES_TRANSAC = ?";
            values.add(this.getBitMesTransac());
        }

        if (this.getBitDiaTransac() != null && this.getBitDiaTransac().longValue() == -999) {
            conditions += " AND BIT_DIA_TRANSAC IS NULL";
        } else if (this.getBitDiaTransac() != null) {
            conditions += " AND BIT_DIA_TRANSAC = ?";
            values.add(this.getBitDiaTransac());
        }

        if (this.getBitHoraTransac() != null && this.getBitHoraTransac().longValue() == -999) {
            conditions += " AND BIT_HORA_TRANSAC IS NULL";
        } else if (this.getBitHoraTransac() != null) {
            conditions += " AND BIT_HORA_TRANSAC = ?";
            values.add(this.getBitHoraTransac());
        }

        if (this.getBitMinTransac() != null && this.getBitMinTransac().longValue() == -999) {
            conditions += " AND BIT_MIN_TRANSAC IS NULL";
        } else if (this.getBitMinTransac() != null) {
            conditions += " AND BIT_MIN_TRANSAC = ?";
            values.add(this.getBitMinTransac());
        }

        if (this.getBitSegTransac() != null && this.getBitSegTransac().longValue() == -999) {
            conditions += " AND BIT_SEG_TRANSAC IS NULL";
        } else if (this.getBitSegTransac() != null) {
            conditions += " AND BIT_SEG_TRANSAC = ?";
            values.add(this.getBitSegTransac());
        }

        if (this.getBitIdTerminal() != null && "null".equals(this.getBitIdTerminal())) {
            conditions += " AND BIT_ID_TERMINAL IS NULL";
        } else if (this.getBitIdTerminal() != null) {
            conditions += " AND BIT_ID_TERMINAL = ?";
            values.add(this.getBitIdTerminal());
        }

        if (this.getBitNumUsuario() != null && this.getBitNumUsuario().longValue() == -999) {
            conditions += " AND BIT_NUM_USUARIO IS NULL";
        } else if (this.getBitNumUsuario() != null) {
            conditions += " AND BIT_NUM_USUARIO = ?";
            values.add(this.getBitNumUsuario());
        }

        if (this.getBitNomPgm() != null && "null".equals(this.getBitNomPgm())) {
            conditions += " AND BIT_NOM_PGM IS NULL";
        } else if (this.getBitNomPgm() != null) {
            conditions += " AND BIT_NOM_PGM = ?";
            values.add(this.getBitNomPgm());
        }

        if (this.getBitCveFuncion() != null && "null".equals(this.getBitCveFuncion())) {
            conditions += " AND BIT_CVE_FUNCION IS NULL";
        } else if (this.getBitCveFuncion() != null) {
            conditions += " AND BIT_CVE_FUNCION = ?";
            values.add(this.getBitCveFuncion());
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
        String sql = "SELECT * FROM BITACORA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBitAnoTransac() != null && this.getBitAnoTransac().longValue() == -999) {
            conditions += " AND BIT_ANO_TRANSAC IS NULL";
        } else if (this.getBitAnoTransac() != null) {
            conditions += " AND BIT_ANO_TRANSAC = ?";
            values.add(this.getBitAnoTransac());
        }

        if (this.getBitMesTransac() != null && this.getBitMesTransac().longValue() == -999) {
            conditions += " AND BIT_MES_TRANSAC IS NULL";
        } else if (this.getBitMesTransac() != null) {
            conditions += " AND BIT_MES_TRANSAC = ?";
            values.add(this.getBitMesTransac());
        }

        if (this.getBitDiaTransac() != null && this.getBitDiaTransac().longValue() == -999) {
            conditions += " AND BIT_DIA_TRANSAC IS NULL";
        } else if (this.getBitDiaTransac() != null) {
            conditions += " AND BIT_DIA_TRANSAC = ?";
            values.add(this.getBitDiaTransac());
        }

        if (this.getBitHoraTransac() != null && this.getBitHoraTransac().longValue() == -999) {
            conditions += " AND BIT_HORA_TRANSAC IS NULL";
        } else if (this.getBitHoraTransac() != null) {
            conditions += " AND BIT_HORA_TRANSAC = ?";
            values.add(this.getBitHoraTransac());
        }

        if (this.getBitMinTransac() != null && this.getBitMinTransac().longValue() == -999) {
            conditions += " AND BIT_MIN_TRANSAC IS NULL";
        } else if (this.getBitMinTransac() != null) {
            conditions += " AND BIT_MIN_TRANSAC = ?";
            values.add(this.getBitMinTransac());
        }

        if (this.getBitSegTransac() != null && this.getBitSegTransac().longValue() == -999) {
            conditions += " AND BIT_SEG_TRANSAC IS NULL";
        } else if (this.getBitSegTransac() != null) {
            conditions += " AND BIT_SEG_TRANSAC = ?";
            values.add(this.getBitSegTransac());
        }

        if (this.getBitIdTerminal() != null && "null".equals(this.getBitIdTerminal())) {
            conditions += " AND BIT_ID_TERMINAL IS NULL";
        } else if (this.getBitIdTerminal() != null) {
            conditions += " AND BIT_ID_TERMINAL = ?";
            values.add(this.getBitIdTerminal());
        }

        if (this.getBitNumUsuario() != null && this.getBitNumUsuario().longValue() == -999) {
            conditions += " AND BIT_NUM_USUARIO IS NULL";
        } else if (this.getBitNumUsuario() != null) {
            conditions += " AND BIT_NUM_USUARIO = ?";
            values.add(this.getBitNumUsuario());
        }

        if (this.getBitNomPgm() != null && "null".equals(this.getBitNomPgm())) {
            conditions += " AND BIT_NOM_PGM IS NULL";
        } else if (this.getBitNomPgm() != null) {
            conditions += " AND BIT_NOM_PGM = ?";
            values.add(this.getBitNomPgm());
        }

        if (this.getBitCveFuncion() != null && "null".equals(this.getBitCveFuncion())) {
            conditions += " AND BIT_CVE_FUNCION IS NULL";
        } else if (this.getBitCveFuncion() != null) {
            conditions += " AND BIT_CVE_FUNCION = ?";
            values.add(this.getBitCveFuncion());
        }

        if (this.getBitDetBitacora() != null && "null".equals(this.getBitDetBitacora())) {
            conditions += " AND BIT_DET_BITACORA IS NULL";
        } else if (this.getBitDetBitacora() != null) {
            conditions += " AND BIT_DET_BITACORA = ?";
            values.add(this.getBitDetBitacora());
        }

        if (this.getBitAnoAltaReg() != null && this.getBitAnoAltaReg().longValue() == -999) {
            conditions += " AND BIT_ANO_ALTA_REG IS NULL";
        } else if (this.getBitAnoAltaReg() != null) {
            conditions += " AND BIT_ANO_ALTA_REG = ?";
            values.add(this.getBitAnoAltaReg());
        }

        if (this.getBitMesAltaReg() != null && this.getBitMesAltaReg().longValue() == -999) {
            conditions += " AND BIT_MES_ALTA_REG IS NULL";
        } else if (this.getBitMesAltaReg() != null) {
            conditions += " AND BIT_MES_ALTA_REG = ?";
            values.add(this.getBitMesAltaReg());
        }

        if (this.getBitDiaAltaReg() != null && this.getBitDiaAltaReg().longValue() == -999) {
            conditions += " AND BIT_DIA_ALTA_REG IS NULL";
        } else if (this.getBitDiaAltaReg() != null) {
            conditions += " AND BIT_DIA_ALTA_REG = ?";
            values.add(this.getBitDiaAltaReg());
        }

        if (this.getBitAnoUltMod() != null && this.getBitAnoUltMod().longValue() == -999) {
            conditions += " AND BIT_ANO_ULT_MOD IS NULL";
        } else if (this.getBitAnoUltMod() != null) {
            conditions += " AND BIT_ANO_ULT_MOD = ?";
            values.add(this.getBitAnoUltMod());
        }

        if (this.getBitMesUltMod() != null && this.getBitMesUltMod().longValue() == -999) {
            conditions += " AND BIT_MES_ULT_MOD IS NULL";
        } else if (this.getBitMesUltMod() != null) {
            conditions += " AND BIT_MES_ULT_MOD = ?";
            values.add(this.getBitMesUltMod());
        }

        if (this.getBitDiaUltMod() != null && this.getBitDiaUltMod().longValue() == -999) {
            conditions += " AND BIT_DIA_ULT_MOD IS NULL";
        } else if (this.getBitDiaUltMod() != null) {
            conditions += " AND BIT_DIA_ULT_MOD = ?";
            values.add(this.getBitDiaUltMod());
        }

        if (this.getBitCveStBitacor() != null && "null".equals(this.getBitCveStBitacor())) {
            conditions += " AND BIT_CVE_ST_BITACOR IS NULL";
        } else if (this.getBitCveStBitacor() != null) {
            conditions += " AND BIT_CVE_ST_BITACOR = ?";
            values.add(this.getBitCveStBitacor());
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
        String sql = "UPDATE BITACORA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND BIT_ANO_TRANSAC = ?";
        pkValues.add(this.getBitAnoTransac());
        conditions += " AND BIT_MES_TRANSAC = ?";
        pkValues.add(this.getBitMesTransac());
        conditions += " AND BIT_DIA_TRANSAC = ?";
        pkValues.add(this.getBitDiaTransac());
        conditions += " AND BIT_HORA_TRANSAC = ?";
        pkValues.add(this.getBitHoraTransac());
        conditions += " AND BIT_MIN_TRANSAC = ?";
        pkValues.add(this.getBitMinTransac());
        conditions += " AND BIT_SEG_TRANSAC = ?";
        pkValues.add(this.getBitSegTransac());
        conditions += " AND BIT_ID_TERMINAL = ?";
        pkValues.add(this.getBitIdTerminal());
        conditions += " AND BIT_NUM_USUARIO = ?";
        pkValues.add(this.getBitNumUsuario());
        conditions += " AND BIT_NOM_PGM = ?";
        pkValues.add(this.getBitNomPgm());
        conditions += " AND BIT_CVE_FUNCION = ?";
        pkValues.add(this.getBitCveFuncion());
        fields += " BIT_DET_BITACORA = ?, ";
        values.add(this.getBitDetBitacora());
        fields += " BIT_ANO_ALTA_REG = ?, ";
        values.add(this.getBitAnoAltaReg());
        fields += " BIT_MES_ALTA_REG = ?, ";
        values.add(this.getBitMesAltaReg());
        fields += " BIT_DIA_ALTA_REG = ?, ";
        values.add(this.getBitDiaAltaReg());
        fields += " BIT_ANO_ULT_MOD = ?, ";
        values.add(this.getBitAnoUltMod());
        fields += " BIT_MES_ULT_MOD = ?, ";
        values.add(this.getBitMesUltMod());
        fields += " BIT_DIA_ULT_MOD = ?, ";
        values.add(this.getBitDiaUltMod());
        fields += " BIT_CVE_ST_BITACOR = ?, ";
        values.add(this.getBitCveStBitacor());
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
        String sql = "INSERT INTO BITACORA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", BIT_ANO_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getBitAnoTransac());

        fields += ", BIT_MES_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getBitMesTransac());

        fields += ", BIT_DIA_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getBitDiaTransac());

        fields += ", BIT_HORA_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getBitHoraTransac());

        fields += ", BIT_MIN_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getBitMinTransac());

        fields += ", BIT_SEG_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getBitSegTransac());

        fields += ", BIT_ID_TERMINAL";
        fieldValues += ", ?";
        values.add(this.getBitIdTerminal());

        fields += ", BIT_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getBitNumUsuario());

        fields += ", BIT_NOM_PGM";
        fieldValues += ", ?";
        values.add(this.getBitNomPgm());

        fields += ", BIT_CVE_FUNCION";
        fieldValues += ", ?";
        values.add(this.getBitCveFuncion());

        fields += ", BIT_DET_BITACORA";
        fieldValues += ", ?";
        values.add(this.getBitDetBitacora());

        fields += ", BIT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBitAnoAltaReg());

        fields += ", BIT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBitMesAltaReg());

        fields += ", BIT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBitDiaAltaReg());

        fields += ", BIT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBitAnoUltMod());

        fields += ", BIT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBitMesUltMod());

        fields += ", BIT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBitDiaUltMod());

        fields += ", BIT_CVE_ST_BITACOR";
        fieldValues += ", ?";
        values.add(this.getBitCveStBitacor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM BITACORA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND BIT_ANO_TRANSAC = ?";
        values.add(this.getBitAnoTransac());
        conditions += " AND BIT_MES_TRANSAC = ?";
        values.add(this.getBitMesTransac());
        conditions += " AND BIT_DIA_TRANSAC = ?";
        values.add(this.getBitDiaTransac());
        conditions += " AND BIT_HORA_TRANSAC = ?";
        values.add(this.getBitHoraTransac());
        conditions += " AND BIT_MIN_TRANSAC = ?";
        values.add(this.getBitMinTransac());
        conditions += " AND BIT_SEG_TRANSAC = ?";
        values.add(this.getBitSegTransac());
        conditions += " AND BIT_ID_TERMINAL = ?";
        values.add(this.getBitIdTerminal());
        conditions += " AND BIT_NUM_USUARIO = ?";
        values.add(this.getBitNumUsuario());
        conditions += " AND BIT_NOM_PGM = ?";
        values.add(this.getBitNomPgm());
        conditions += " AND BIT_CVE_FUNCION = ?";
        values.add(this.getBitCveFuncion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Bitacora instance = (Bitacora) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getBitAnoTransac().equals(instance.getBitAnoTransac()))
            equalObjects = false;
        if (equalObjects && !this.getBitMesTransac().equals(instance.getBitMesTransac()))
            equalObjects = false;
        if (equalObjects && !this.getBitDiaTransac().equals(instance.getBitDiaTransac()))
            equalObjects = false;
        if (equalObjects && !this.getBitHoraTransac().equals(instance.getBitHoraTransac()))
            equalObjects = false;
        if (equalObjects && !this.getBitMinTransac().equals(instance.getBitMinTransac()))
            equalObjects = false;
        if (equalObjects && !this.getBitSegTransac().equals(instance.getBitSegTransac()))
            equalObjects = false;
        if (equalObjects && !this.getBitIdTerminal().equals(instance.getBitIdTerminal()))
            equalObjects = false;
        if (equalObjects && !this.getBitNumUsuario().equals(instance.getBitNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getBitNomPgm().equals(instance.getBitNomPgm()))
            equalObjects = false;
        if (equalObjects && !this.getBitCveFuncion().equals(instance.getBitCveFuncion()))
            equalObjects = false;
        if (equalObjects && !this.getBitDetBitacora().equals(instance.getBitDetBitacora()))
            equalObjects = false;
        if (equalObjects && !this.getBitAnoAltaReg().equals(instance.getBitAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBitMesAltaReg().equals(instance.getBitMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBitDiaAltaReg().equals(instance.getBitDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBitAnoUltMod().equals(instance.getBitAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBitMesUltMod().equals(instance.getBitMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBitDiaUltMod().equals(instance.getBitDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBitCveStBitacor().equals(instance.getBitCveStBitacor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Bitacora result = new Bitacora();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setBitAnoTransac((BigDecimal) objectData.getData("BIT_ANO_TRANSAC"));
        result.setBitMesTransac((BigDecimal) objectData.getData("BIT_MES_TRANSAC"));
        result.setBitDiaTransac((BigDecimal) objectData.getData("BIT_DIA_TRANSAC"));
        result.setBitHoraTransac((BigDecimal) objectData.getData("BIT_HORA_TRANSAC"));
        result.setBitMinTransac((BigDecimal) objectData.getData("BIT_MIN_TRANSAC"));
        result.setBitSegTransac((BigDecimal) objectData.getData("BIT_SEG_TRANSAC"));
        result.setBitIdTerminal((String) objectData.getData("BIT_ID_TERMINAL"));
        result.setBitNumUsuario((BigDecimal) objectData.getData("BIT_NUM_USUARIO"));
        result.setBitNomPgm((String) objectData.getData("BIT_NOM_PGM"));
        result.setBitCveFuncion((String) objectData.getData("BIT_CVE_FUNCION"));
        result.setBitDetBitacora((String) objectData.getData("BIT_DET_BITACORA"));
        result.setBitAnoAltaReg((BigDecimal) objectData.getData("BIT_ANO_ALTA_REG"));
        result.setBitMesAltaReg((BigDecimal) objectData.getData("BIT_MES_ALTA_REG"));
        result.setBitDiaAltaReg((BigDecimal) objectData.getData("BIT_DIA_ALTA_REG"));
        result.setBitAnoUltMod((BigDecimal) objectData.getData("BIT_ANO_ULT_MOD"));
        result.setBitMesUltMod((BigDecimal) objectData.getData("BIT_MES_ULT_MOD"));
        result.setBitDiaUltMod((BigDecimal) objectData.getData("BIT_DIA_ULT_MOD"));
        result.setBitCveStBitacor((String) objectData.getData("BIT_CVE_ST_BITACOR"));

        return result;

    }

}
