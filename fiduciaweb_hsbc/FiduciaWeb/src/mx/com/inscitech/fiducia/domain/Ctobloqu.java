package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTOBLOQU_PK", columns = { "CTB_CONTRATO", "CTB_SUB_CONTRATO" }, sequences = { "MANUAL" })
public class Ctobloqu extends DomainObject {

    BigDecimal ctbContrato = null;
    BigDecimal ctbSubContrato = null;
    BigDecimal ctbAnoIniBloque = null;
    BigDecimal ctbMesIniBloque = null;
    BigDecimal ctbDiaIniBloque = null;
    BigDecimal ctbAnoFinBloque = null;
    BigDecimal ctbMesFinBloque = null;
    BigDecimal ctbDiaFinBloque = null;
    String ctbCausaBloqueo = null;
    BigDecimal ctbCveEntradas = null;
    BigDecimal ctbCveSalidas = null;
    BigDecimal ctbCveInversion = null;
    BigDecimal ctbAnoAltaReg = null;
    BigDecimal ctbMesAltaReg = null;
    BigDecimal ctbDiaAltaReg = null;
    BigDecimal ctbAnoUltMod = null;
    BigDecimal ctbMesUltMod = null;
    BigDecimal ctbDiaUltMod = null;
    String ctbCveStCtobloq = null;

    public Ctobloqu() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtbContrato(BigDecimal ctbContrato) {
        this.ctbContrato = ctbContrato;
    }

    public BigDecimal getCtbContrato() {
        return this.ctbContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtbSubContrato(BigDecimal ctbSubContrato) {
        this.ctbSubContrato = ctbSubContrato;
    }

    public BigDecimal getCtbSubContrato() {
        return this.ctbSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtbAnoIniBloque(BigDecimal ctbAnoIniBloque) {
        this.ctbAnoIniBloque = ctbAnoIniBloque;
    }

    public BigDecimal getCtbAnoIniBloque() {
        return this.ctbAnoIniBloque;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtbMesIniBloque(BigDecimal ctbMesIniBloque) {
        this.ctbMesIniBloque = ctbMesIniBloque;
    }

    public BigDecimal getCtbMesIniBloque() {
        return this.ctbMesIniBloque;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtbDiaIniBloque(BigDecimal ctbDiaIniBloque) {
        this.ctbDiaIniBloque = ctbDiaIniBloque;
    }

    public BigDecimal getCtbDiaIniBloque() {
        return this.ctbDiaIniBloque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtbAnoFinBloque(BigDecimal ctbAnoFinBloque) {
        this.ctbAnoFinBloque = ctbAnoFinBloque;
    }

    public BigDecimal getCtbAnoFinBloque() {
        return this.ctbAnoFinBloque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtbMesFinBloque(BigDecimal ctbMesFinBloque) {
        this.ctbMesFinBloque = ctbMesFinBloque;
    }

    public BigDecimal getCtbMesFinBloque() {
        return this.ctbMesFinBloque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtbDiaFinBloque(BigDecimal ctbDiaFinBloque) {
        this.ctbDiaFinBloque = ctbDiaFinBloque;
    }

    public BigDecimal getCtbDiaFinBloque() {
        return this.ctbDiaFinBloque;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtbCausaBloqueo(String ctbCausaBloqueo) {
        this.ctbCausaBloqueo = ctbCausaBloqueo;
    }

    public String getCtbCausaBloqueo() {
        return this.ctbCausaBloqueo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtbCveEntradas(BigDecimal ctbCveEntradas) {
        this.ctbCveEntradas = ctbCveEntradas;
    }

    public BigDecimal getCtbCveEntradas() {
        return this.ctbCveEntradas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtbCveSalidas(BigDecimal ctbCveSalidas) {
        this.ctbCveSalidas = ctbCveSalidas;
    }

    public BigDecimal getCtbCveSalidas() {
        return this.ctbCveSalidas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtbCveInversion(BigDecimal ctbCveInversion) {
        this.ctbCveInversion = ctbCveInversion;
    }

    public BigDecimal getCtbCveInversion() {
        return this.ctbCveInversion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtbAnoAltaReg(BigDecimal ctbAnoAltaReg) {
        this.ctbAnoAltaReg = ctbAnoAltaReg;
    }

    public BigDecimal getCtbAnoAltaReg() {
        return this.ctbAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtbMesAltaReg(BigDecimal ctbMesAltaReg) {
        this.ctbMesAltaReg = ctbMesAltaReg;
    }

    public BigDecimal getCtbMesAltaReg() {
        return this.ctbMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtbDiaAltaReg(BigDecimal ctbDiaAltaReg) {
        this.ctbDiaAltaReg = ctbDiaAltaReg;
    }

    public BigDecimal getCtbDiaAltaReg() {
        return this.ctbDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtbAnoUltMod(BigDecimal ctbAnoUltMod) {
        this.ctbAnoUltMod = ctbAnoUltMod;
    }

    public BigDecimal getCtbAnoUltMod() {
        return this.ctbAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtbMesUltMod(BigDecimal ctbMesUltMod) {
        this.ctbMesUltMod = ctbMesUltMod;
    }

    public BigDecimal getCtbMesUltMod() {
        return this.ctbMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtbDiaUltMod(BigDecimal ctbDiaUltMod) {
        this.ctbDiaUltMod = ctbDiaUltMod;
    }

    public BigDecimal getCtbDiaUltMod() {
        return this.ctbDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtbCveStCtobloq(String ctbCveStCtobloq) {
        this.ctbCveStCtobloq = ctbCveStCtobloq;
    }

    public String getCtbCveStCtobloq() {
        return this.ctbCveStCtobloq;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTOBLOQU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtbContrato() != null && this.getCtbContrato().longValue() == -999) {
            conditions += " AND CTB_CONTRATO IS NULL";
        } else if (this.getCtbContrato() != null) {
            conditions += " AND CTB_CONTRATO = ?";
            values.add(this.getCtbContrato());
        }

        if (this.getCtbSubContrato() != null && this.getCtbSubContrato().longValue() == -999) {
            conditions += " AND CTB_SUB_CONTRATO IS NULL";
        } else if (this.getCtbSubContrato() != null) {
            conditions += " AND CTB_SUB_CONTRATO = ?";
            values.add(this.getCtbSubContrato());
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
        String sql = "SELECT * FROM CTOBLOQU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtbContrato() != null && this.getCtbContrato().longValue() == -999) {
            conditions += " AND CTB_CONTRATO IS NULL";
        } else if (this.getCtbContrato() != null) {
            conditions += " AND CTB_CONTRATO = ?";
            values.add(this.getCtbContrato());
        }

        if (this.getCtbSubContrato() != null && this.getCtbSubContrato().longValue() == -999) {
            conditions += " AND CTB_SUB_CONTRATO IS NULL";
        } else if (this.getCtbSubContrato() != null) {
            conditions += " AND CTB_SUB_CONTRATO = ?";
            values.add(this.getCtbSubContrato());
        }

        if (this.getCtbAnoIniBloque() != null && this.getCtbAnoIniBloque().longValue() == -999) {
            conditions += " AND CTB_ANO_INI_BLOQUE IS NULL";
        } else if (this.getCtbAnoIniBloque() != null) {
            conditions += " AND CTB_ANO_INI_BLOQUE = ?";
            values.add(this.getCtbAnoIniBloque());
        }

        if (this.getCtbMesIniBloque() != null && this.getCtbMesIniBloque().longValue() == -999) {
            conditions += " AND CTB_MES_INI_BLOQUE IS NULL";
        } else if (this.getCtbMesIniBloque() != null) {
            conditions += " AND CTB_MES_INI_BLOQUE = ?";
            values.add(this.getCtbMesIniBloque());
        }

        if (this.getCtbDiaIniBloque() != null && this.getCtbDiaIniBloque().longValue() == -999) {
            conditions += " AND CTB_DIA_INI_BLOQUE IS NULL";
        } else if (this.getCtbDiaIniBloque() != null) {
            conditions += " AND CTB_DIA_INI_BLOQUE = ?";
            values.add(this.getCtbDiaIniBloque());
        }

        if (this.getCtbAnoFinBloque() != null && this.getCtbAnoFinBloque().longValue() == -999) {
            conditions += " AND CTB_ANO_FIN_BLOQUE IS NULL";
        } else if (this.getCtbAnoFinBloque() != null) {
            conditions += " AND CTB_ANO_FIN_BLOQUE = ?";
            values.add(this.getCtbAnoFinBloque());
        }

        if (this.getCtbMesFinBloque() != null && this.getCtbMesFinBloque().longValue() == -999) {
            conditions += " AND CTB_MES_FIN_BLOQUE IS NULL";
        } else if (this.getCtbMesFinBloque() != null) {
            conditions += " AND CTB_MES_FIN_BLOQUE = ?";
            values.add(this.getCtbMesFinBloque());
        }

        if (this.getCtbDiaFinBloque() != null && this.getCtbDiaFinBloque().longValue() == -999) {
            conditions += " AND CTB_DIA_FIN_BLOQUE IS NULL";
        } else if (this.getCtbDiaFinBloque() != null) {
            conditions += " AND CTB_DIA_FIN_BLOQUE = ?";
            values.add(this.getCtbDiaFinBloque());
        }

        if (this.getCtbCausaBloqueo() != null && "null".equals(this.getCtbCausaBloqueo())) {
            conditions += " AND CTB_CAUSA_BLOQUEO IS NULL";
        } else if (this.getCtbCausaBloqueo() != null) {
            conditions += " AND CTB_CAUSA_BLOQUEO = ?";
            values.add(this.getCtbCausaBloqueo());
        }

        if (this.getCtbCveEntradas() != null && this.getCtbCveEntradas().longValue() == -999) {
            conditions += " AND CTB_CVE_ENTRADAS IS NULL";
        } else if (this.getCtbCveEntradas() != null) {
            conditions += " AND CTB_CVE_ENTRADAS = ?";
            values.add(this.getCtbCveEntradas());
        }

        if (this.getCtbCveSalidas() != null && this.getCtbCveSalidas().longValue() == -999) {
            conditions += " AND CTB_CVE_SALIDAS IS NULL";
        } else if (this.getCtbCveSalidas() != null) {
            conditions += " AND CTB_CVE_SALIDAS = ?";
            values.add(this.getCtbCveSalidas());
        }

        if (this.getCtbCveInversion() != null && this.getCtbCveInversion().longValue() == -999) {
            conditions += " AND CTB_CVE_INVERSION IS NULL";
        } else if (this.getCtbCveInversion() != null) {
            conditions += " AND CTB_CVE_INVERSION = ?";
            values.add(this.getCtbCveInversion());
        }

        if (this.getCtbAnoAltaReg() != null && this.getCtbAnoAltaReg().longValue() == -999) {
            conditions += " AND CTB_ANO_ALTA_REG IS NULL";
        } else if (this.getCtbAnoAltaReg() != null) {
            conditions += " AND CTB_ANO_ALTA_REG = ?";
            values.add(this.getCtbAnoAltaReg());
        }

        if (this.getCtbMesAltaReg() != null && this.getCtbMesAltaReg().longValue() == -999) {
            conditions += " AND CTB_MES_ALTA_REG IS NULL";
        } else if (this.getCtbMesAltaReg() != null) {
            conditions += " AND CTB_MES_ALTA_REG = ?";
            values.add(this.getCtbMesAltaReg());
        }

        if (this.getCtbDiaAltaReg() != null && this.getCtbDiaAltaReg().longValue() == -999) {
            conditions += " AND CTB_DIA_ALTA_REG IS NULL";
        } else if (this.getCtbDiaAltaReg() != null) {
            conditions += " AND CTB_DIA_ALTA_REG = ?";
            values.add(this.getCtbDiaAltaReg());
        }

        if (this.getCtbAnoUltMod() != null && this.getCtbAnoUltMod().longValue() == -999) {
            conditions += " AND CTB_ANO_ULT_MOD IS NULL";
        } else if (this.getCtbAnoUltMod() != null) {
            conditions += " AND CTB_ANO_ULT_MOD = ?";
            values.add(this.getCtbAnoUltMod());
        }

        if (this.getCtbMesUltMod() != null && this.getCtbMesUltMod().longValue() == -999) {
            conditions += " AND CTB_MES_ULT_MOD IS NULL";
        } else if (this.getCtbMesUltMod() != null) {
            conditions += " AND CTB_MES_ULT_MOD = ?";
            values.add(this.getCtbMesUltMod());
        }

        if (this.getCtbDiaUltMod() != null && this.getCtbDiaUltMod().longValue() == -999) {
            conditions += " AND CTB_DIA_ULT_MOD IS NULL";
        } else if (this.getCtbDiaUltMod() != null) {
            conditions += " AND CTB_DIA_ULT_MOD = ?";
            values.add(this.getCtbDiaUltMod());
        }

        if (this.getCtbCveStCtobloq() != null && "null".equals(this.getCtbCveStCtobloq())) {
            conditions += " AND CTB_CVE_ST_CTOBLOQ IS NULL";
        } else if (this.getCtbCveStCtobloq() != null) {
            conditions += " AND CTB_CVE_ST_CTOBLOQ = ?";
            values.add(this.getCtbCveStCtobloq());
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
        String sql = "UPDATE CTOBLOQU SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTB_CONTRATO = ?";
        pkValues.add(this.getCtbContrato());
        conditions += " AND CTB_SUB_CONTRATO = ?";
        pkValues.add(this.getCtbSubContrato());
        fields += " CTB_ANO_INI_BLOQUE = ?, ";
        values.add(this.getCtbAnoIniBloque());
        fields += " CTB_MES_INI_BLOQUE = ?, ";
        values.add(this.getCtbMesIniBloque());
        fields += " CTB_DIA_INI_BLOQUE = ?, ";
        values.add(this.getCtbDiaIniBloque());
        fields += " CTB_ANO_FIN_BLOQUE = ?, ";
        values.add(this.getCtbAnoFinBloque());
        fields += " CTB_MES_FIN_BLOQUE = ?, ";
        values.add(this.getCtbMesFinBloque());
        fields += " CTB_DIA_FIN_BLOQUE = ?, ";
        values.add(this.getCtbDiaFinBloque());
        fields += " CTB_CAUSA_BLOQUEO = ?, ";
        values.add(this.getCtbCausaBloqueo());
        fields += " CTB_CVE_ENTRADAS = ?, ";
        values.add(this.getCtbCveEntradas());
        fields += " CTB_CVE_SALIDAS = ?, ";
        values.add(this.getCtbCveSalidas());
        fields += " CTB_CVE_INVERSION = ?, ";
        values.add(this.getCtbCveInversion());
        fields += " CTB_ANO_ALTA_REG = ?, ";
        values.add(this.getCtbAnoAltaReg());
        fields += " CTB_MES_ALTA_REG = ?, ";
        values.add(this.getCtbMesAltaReg());
        fields += " CTB_DIA_ALTA_REG = ?, ";
        values.add(this.getCtbDiaAltaReg());
        fields += " CTB_ANO_ULT_MOD = ?, ";
        values.add(this.getCtbAnoUltMod());
        fields += " CTB_MES_ULT_MOD = ?, ";
        values.add(this.getCtbMesUltMod());
        fields += " CTB_DIA_ULT_MOD = ?, ";
        values.add(this.getCtbDiaUltMod());
        fields += " CTB_CVE_ST_CTOBLOQ = ?, ";
        values.add(this.getCtbCveStCtobloq());
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
        String sql = "INSERT INTO CTOBLOQU ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtbContrato());

        fields += ", CTB_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtbSubContrato());

        fields += ", CTB_ANO_INI_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getCtbAnoIniBloque());

        fields += ", CTB_MES_INI_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getCtbMesIniBloque());

        fields += ", CTB_DIA_INI_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getCtbDiaIniBloque());

        fields += ", CTB_ANO_FIN_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getCtbAnoFinBloque());

        fields += ", CTB_MES_FIN_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getCtbMesFinBloque());

        fields += ", CTB_DIA_FIN_BLOQUE";
        fieldValues += ", ?";
        values.add(this.getCtbDiaFinBloque());

        fields += ", CTB_CAUSA_BLOQUEO";
        fieldValues += ", ?";
        values.add(this.getCtbCausaBloqueo());

        fields += ", CTB_CVE_ENTRADAS";
        fieldValues += ", ?";
        values.add(this.getCtbCveEntradas());

        fields += ", CTB_CVE_SALIDAS";
        fieldValues += ", ?";
        values.add(this.getCtbCveSalidas());

        fields += ", CTB_CVE_INVERSION";
        fieldValues += ", ?";
        values.add(this.getCtbCveInversion());

        fields += ", CTB_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtbAnoAltaReg());

        fields += ", CTB_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtbMesAltaReg());

        fields += ", CTB_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtbDiaAltaReg());

        fields += ", CTB_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtbAnoUltMod());

        fields += ", CTB_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtbMesUltMod());

        fields += ", CTB_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtbDiaUltMod());

        fields += ", CTB_CVE_ST_CTOBLOQ";
        fieldValues += ", ?";
        values.add(this.getCtbCveStCtobloq());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTOBLOQU WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTB_CONTRATO = ?";
        values.add(this.getCtbContrato());
        conditions += " AND CTB_SUB_CONTRATO = ?";
        values.add(this.getCtbSubContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctobloqu instance = (Ctobloqu) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtbContrato().equals(instance.getCtbContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtbSubContrato().equals(instance.getCtbSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtbAnoIniBloque().equals(instance.getCtbAnoIniBloque()))
            equalObjects = false;
        if (equalObjects && !this.getCtbMesIniBloque().equals(instance.getCtbMesIniBloque()))
            equalObjects = false;
        if (equalObjects && !this.getCtbDiaIniBloque().equals(instance.getCtbDiaIniBloque()))
            equalObjects = false;
        if (equalObjects && !this.getCtbAnoFinBloque().equals(instance.getCtbAnoFinBloque()))
            equalObjects = false;
        if (equalObjects && !this.getCtbMesFinBloque().equals(instance.getCtbMesFinBloque()))
            equalObjects = false;
        if (equalObjects && !this.getCtbDiaFinBloque().equals(instance.getCtbDiaFinBloque()))
            equalObjects = false;
        if (equalObjects && !this.getCtbCausaBloqueo().equals(instance.getCtbCausaBloqueo()))
            equalObjects = false;
        if (equalObjects && !this.getCtbCveEntradas().equals(instance.getCtbCveEntradas()))
            equalObjects = false;
        if (equalObjects && !this.getCtbCveSalidas().equals(instance.getCtbCveSalidas()))
            equalObjects = false;
        if (equalObjects && !this.getCtbCveInversion().equals(instance.getCtbCveInversion()))
            equalObjects = false;
        if (equalObjects && !this.getCtbAnoAltaReg().equals(instance.getCtbAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtbMesAltaReg().equals(instance.getCtbMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtbDiaAltaReg().equals(instance.getCtbDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtbAnoUltMod().equals(instance.getCtbAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtbMesUltMod().equals(instance.getCtbMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtbDiaUltMod().equals(instance.getCtbDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtbCveStCtobloq().equals(instance.getCtbCveStCtobloq()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctobloqu result = new Ctobloqu();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtbContrato((BigDecimal) objectData.getData("CTB_CONTRATO"));
        result.setCtbSubContrato((BigDecimal) objectData.getData("CTB_SUB_CONTRATO"));
        result.setCtbAnoIniBloque((BigDecimal) objectData.getData("CTB_ANO_INI_BLOQUE"));
        result.setCtbMesIniBloque((BigDecimal) objectData.getData("CTB_MES_INI_BLOQUE"));
        result.setCtbDiaIniBloque((BigDecimal) objectData.getData("CTB_DIA_INI_BLOQUE"));
        result.setCtbAnoFinBloque((BigDecimal) objectData.getData("CTB_ANO_FIN_BLOQUE"));
        result.setCtbMesFinBloque((BigDecimal) objectData.getData("CTB_MES_FIN_BLOQUE"));
        result.setCtbDiaFinBloque((BigDecimal) objectData.getData("CTB_DIA_FIN_BLOQUE"));
        result.setCtbCausaBloqueo((String) objectData.getData("CTB_CAUSA_BLOQUEO"));
        result.setCtbCveEntradas((BigDecimal) objectData.getData("CTB_CVE_ENTRADAS"));
        result.setCtbCveSalidas((BigDecimal) objectData.getData("CTB_CVE_SALIDAS"));
        result.setCtbCveInversion((BigDecimal) objectData.getData("CTB_CVE_INVERSION"));
        result.setCtbAnoAltaReg((BigDecimal) objectData.getData("CTB_ANO_ALTA_REG"));
        result.setCtbMesAltaReg((BigDecimal) objectData.getData("CTB_MES_ALTA_REG"));
        result.setCtbDiaAltaReg((BigDecimal) objectData.getData("CTB_DIA_ALTA_REG"));
        result.setCtbAnoUltMod((BigDecimal) objectData.getData("CTB_ANO_ULT_MOD"));
        result.setCtbMesUltMod((BigDecimal) objectData.getData("CTB_MES_ULT_MOD"));
        result.setCtbDiaUltMod((BigDecimal) objectData.getData("CTB_DIA_ULT_MOD"));
        result.setCtbCveStCtobloq((String) objectData.getData("CTB_CVE_ST_CTOBLOQ"));

        return result;

    }

}
