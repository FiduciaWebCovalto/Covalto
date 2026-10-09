package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Movimienc extends DomainObject {

    BigDecimal movAnoMovto = null;
    BigDecimal movMesMovto = null;
    BigDecimal movDiaMovto = null;
    BigDecimal movNumContrato = null;
    BigDecimal movSubContrato = null;
    BigDecimal movFolioOpera = null;
    BigDecimal movNumModulo = null;
    BigDecimal movNumTransac = null;
    BigDecimal movNumUsuario = null;
    String movDescMovto = null;
    BigDecimal movHrTransac = null;
    BigDecimal movMinTransac = null;
    BigDecimal movImpMovto = null;
    BigDecimal movCveTipoMerca = null;
    BigDecimal movNumInstrume = null;
    BigDecimal movNumSecEmis = null;
    BigDecimal movNumTitulos = null;
    BigDecimal movCveImpreEdo = null;
    String movCveEntSal = null;
    BigDecimal movAnoAltaReg = null;
    BigDecimal movMesAltaReg = null;
    BigDecimal movDiaAltaReg = null;
    BigDecimal movAnoUltMod = null;
    BigDecimal movMesUltMod = null;
    BigDecimal movDiaUltMod = null;
    String movCveStMovto = null;
    String movCveAcumEdcta = null;

    public Movimienc() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMovAnoMovto(BigDecimal movAnoMovto) {
        this.movAnoMovto = movAnoMovto;
    }

    public BigDecimal getMovAnoMovto() {
        return this.movAnoMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMovMesMovto(BigDecimal movMesMovto) {
        this.movMesMovto = movMesMovto;
    }

    public BigDecimal getMovMesMovto() {
        return this.movMesMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMovDiaMovto(BigDecimal movDiaMovto) {
        this.movDiaMovto = movDiaMovto;
    }

    public BigDecimal getMovDiaMovto() {
        return this.movDiaMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovNumContrato(BigDecimal movNumContrato) {
        this.movNumContrato = movNumContrato;
    }

    public BigDecimal getMovNumContrato() {
        return this.movNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovSubContrato(BigDecimal movSubContrato) {
        this.movSubContrato = movSubContrato;
    }

    public BigDecimal getMovSubContrato() {
        return this.movSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovFolioOpera(BigDecimal movFolioOpera) {
        this.movFolioOpera = movFolioOpera;
    }

    public BigDecimal getMovFolioOpera() {
        return this.movFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovNumModulo(BigDecimal movNumModulo) {
        this.movNumModulo = movNumModulo;
    }

    public BigDecimal getMovNumModulo() {
        return this.movNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovNumTransac(BigDecimal movNumTransac) {
        this.movNumTransac = movNumTransac;
    }

    public BigDecimal getMovNumTransac() {
        return this.movNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovNumUsuario(BigDecimal movNumUsuario) {
        this.movNumUsuario = movNumUsuario;
    }

    public BigDecimal getMovNumUsuario() {
        return this.movNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMovDescMovto(String movDescMovto) {
        this.movDescMovto = movDescMovto;
    }

    public String getMovDescMovto() {
        return this.movDescMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovHrTransac(BigDecimal movHrTransac) {
        this.movHrTransac = movHrTransac;
    }

    public BigDecimal getMovHrTransac() {
        return this.movHrTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovMinTransac(BigDecimal movMinTransac) {
        this.movMinTransac = movMinTransac;
    }

    public BigDecimal getMovMinTransac() {
        return this.movMinTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setMovImpMovto(BigDecimal movImpMovto) {
        this.movImpMovto = movImpMovto;
    }

    public BigDecimal getMovImpMovto() {
        return this.movImpMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovCveTipoMerca(BigDecimal movCveTipoMerca) {
        this.movCveTipoMerca = movCveTipoMerca;
    }

    public BigDecimal getMovCveTipoMerca() {
        return this.movCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovNumInstrume(BigDecimal movNumInstrume) {
        this.movNumInstrume = movNumInstrume;
    }

    public BigDecimal getMovNumInstrume() {
        return this.movNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovNumSecEmis(BigDecimal movNumSecEmis) {
        this.movNumSecEmis = movNumSecEmis;
    }

    public BigDecimal getMovNumSecEmis() {
        return this.movNumSecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovNumTitulos(BigDecimal movNumTitulos) {
        this.movNumTitulos = movNumTitulos;
    }

    public BigDecimal getMovNumTitulos() {
        return this.movNumTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMovCveImpreEdo(BigDecimal movCveImpreEdo) {
        this.movCveImpreEdo = movCveImpreEdo;
    }

    public BigDecimal getMovCveImpreEdo() {
        return this.movCveImpreEdo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMovCveEntSal(String movCveEntSal) {
        this.movCveEntSal = movCveEntSal;
    }

    public String getMovCveEntSal() {
        return this.movCveEntSal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMovAnoAltaReg(BigDecimal movAnoAltaReg) {
        this.movAnoAltaReg = movAnoAltaReg;
    }

    public BigDecimal getMovAnoAltaReg() {
        return this.movAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMovMesAltaReg(BigDecimal movMesAltaReg) {
        this.movMesAltaReg = movMesAltaReg;
    }

    public BigDecimal getMovMesAltaReg() {
        return this.movMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMovDiaAltaReg(BigDecimal movDiaAltaReg) {
        this.movDiaAltaReg = movDiaAltaReg;
    }

    public BigDecimal getMovDiaAltaReg() {
        return this.movDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMovAnoUltMod(BigDecimal movAnoUltMod) {
        this.movAnoUltMod = movAnoUltMod;
    }

    public BigDecimal getMovAnoUltMod() {
        return this.movAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMovMesUltMod(BigDecimal movMesUltMod) {
        this.movMesUltMod = movMesUltMod;
    }

    public BigDecimal getMovMesUltMod() {
        return this.movMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMovDiaUltMod(BigDecimal movDiaUltMod) {
        this.movDiaUltMod = movDiaUltMod;
    }

    public BigDecimal getMovDiaUltMod() {
        return this.movDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMovCveStMovto(String movCveStMovto) {
        this.movCveStMovto = movCveStMovto;
    }

    public String getMovCveStMovto() {
        return this.movCveStMovto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMovCveAcumEdcta(String movCveAcumEdcta) {
        this.movCveAcumEdcta = movCveAcumEdcta;
    }

    public String getMovCveAcumEdcta() {
        return this.movCveAcumEdcta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM MOVIMIENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM MOVIMIENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMovAnoMovto() != null && this.getMovAnoMovto().longValue() == -999) {
            conditions += " AND MOV_ANO_MOVTO IS NULL";
        } else if (this.getMovAnoMovto() != null) {
            conditions += " AND MOV_ANO_MOVTO = ?";
            values.add(this.getMovAnoMovto());
        }

        if (this.getMovMesMovto() != null && this.getMovMesMovto().longValue() == -999) {
            conditions += " AND MOV_MES_MOVTO IS NULL";
        } else if (this.getMovMesMovto() != null) {
            conditions += " AND MOV_MES_MOVTO = ?";
            values.add(this.getMovMesMovto());
        }

        if (this.getMovDiaMovto() != null && this.getMovDiaMovto().longValue() == -999) {
            conditions += " AND MOV_DIA_MOVTO IS NULL";
        } else if (this.getMovDiaMovto() != null) {
            conditions += " AND MOV_DIA_MOVTO = ?";
            values.add(this.getMovDiaMovto());
        }

        if (this.getMovNumContrato() != null && this.getMovNumContrato().longValue() == -999) {
            conditions += " AND MOV_NUM_CONTRATO IS NULL";
        } else if (this.getMovNumContrato() != null) {
            conditions += " AND MOV_NUM_CONTRATO = ?";
            values.add(this.getMovNumContrato());
        }

        if (this.getMovSubContrato() != null && this.getMovSubContrato().longValue() == -999) {
            conditions += " AND MOV_SUB_CONTRATO IS NULL";
        } else if (this.getMovSubContrato() != null) {
            conditions += " AND MOV_SUB_CONTRATO = ?";
            values.add(this.getMovSubContrato());
        }

        if (this.getMovFolioOpera() != null && this.getMovFolioOpera().longValue() == -999) {
            conditions += " AND MOV_FOLIO_OPERA IS NULL";
        } else if (this.getMovFolioOpera() != null) {
            conditions += " AND MOV_FOLIO_OPERA = ?";
            values.add(this.getMovFolioOpera());
        }

        if (this.getMovNumModulo() != null && this.getMovNumModulo().longValue() == -999) {
            conditions += " AND MOV_NUM_MODULO IS NULL";
        } else if (this.getMovNumModulo() != null) {
            conditions += " AND MOV_NUM_MODULO = ?";
            values.add(this.getMovNumModulo());
        }

        if (this.getMovNumTransac() != null && this.getMovNumTransac().longValue() == -999) {
            conditions += " AND MOV_NUM_TRANSAC IS NULL";
        } else if (this.getMovNumTransac() != null) {
            conditions += " AND MOV_NUM_TRANSAC = ?";
            values.add(this.getMovNumTransac());
        }

        if (this.getMovNumUsuario() != null && this.getMovNumUsuario().longValue() == -999) {
            conditions += " AND MOV_NUM_USUARIO IS NULL";
        } else if (this.getMovNumUsuario() != null) {
            conditions += " AND MOV_NUM_USUARIO = ?";
            values.add(this.getMovNumUsuario());
        }

        if (this.getMovDescMovto() != null && "null".equals(this.getMovDescMovto())) {
            conditions += " AND MOV_DESC_MOVTO IS NULL";
        } else if (this.getMovDescMovto() != null) {
            conditions += " AND MOV_DESC_MOVTO = ?";
            values.add(this.getMovDescMovto());
        }

        if (this.getMovHrTransac() != null && this.getMovHrTransac().longValue() == -999) {
            conditions += " AND MOV_HR_TRANSAC IS NULL";
        } else if (this.getMovHrTransac() != null) {
            conditions += " AND MOV_HR_TRANSAC = ?";
            values.add(this.getMovHrTransac());
        }

        if (this.getMovMinTransac() != null && this.getMovMinTransac().longValue() == -999) {
            conditions += " AND MOV_MIN_TRANSAC IS NULL";
        } else if (this.getMovMinTransac() != null) {
            conditions += " AND MOV_MIN_TRANSAC = ?";
            values.add(this.getMovMinTransac());
        }

        if (this.getMovImpMovto() != null && this.getMovImpMovto().longValue() == -999) {
            conditions += " AND MOV_IMP_MOVTO IS NULL";
        } else if (this.getMovImpMovto() != null) {
            conditions += " AND MOV_IMP_MOVTO = ?";
            values.add(this.getMovImpMovto());
        }

        if (this.getMovCveTipoMerca() != null && this.getMovCveTipoMerca().longValue() == -999) {
            conditions += " AND MOV_CVE_TIPO_MERCA IS NULL";
        } else if (this.getMovCveTipoMerca() != null) {
            conditions += " AND MOV_CVE_TIPO_MERCA = ?";
            values.add(this.getMovCveTipoMerca());
        }

        if (this.getMovNumInstrume() != null && this.getMovNumInstrume().longValue() == -999) {
            conditions += " AND MOV_NUM_INSTRUME IS NULL";
        } else if (this.getMovNumInstrume() != null) {
            conditions += " AND MOV_NUM_INSTRUME = ?";
            values.add(this.getMovNumInstrume());
        }

        if (this.getMovNumSecEmis() != null && this.getMovNumSecEmis().longValue() == -999) {
            conditions += " AND MOV_NUM_SEC_EMIS IS NULL";
        } else if (this.getMovNumSecEmis() != null) {
            conditions += " AND MOV_NUM_SEC_EMIS = ?";
            values.add(this.getMovNumSecEmis());
        }

        if (this.getMovNumTitulos() != null && this.getMovNumTitulos().longValue() == -999) {
            conditions += " AND MOV_NUM_TITULOS IS NULL";
        } else if (this.getMovNumTitulos() != null) {
            conditions += " AND MOV_NUM_TITULOS = ?";
            values.add(this.getMovNumTitulos());
        }

        if (this.getMovCveImpreEdo() != null && this.getMovCveImpreEdo().longValue() == -999) {
            conditions += " AND MOV_CVE_IMPRE_EDO IS NULL";
        } else if (this.getMovCveImpreEdo() != null) {
            conditions += " AND MOV_CVE_IMPRE_EDO = ?";
            values.add(this.getMovCveImpreEdo());
        }

        if (this.getMovCveEntSal() != null && "null".equals(this.getMovCveEntSal())) {
            conditions += " AND MOV_CVE_ENT_SAL IS NULL";
        } else if (this.getMovCveEntSal() != null) {
            conditions += " AND MOV_CVE_ENT_SAL = ?";
            values.add(this.getMovCveEntSal());
        }

        if (this.getMovAnoAltaReg() != null && this.getMovAnoAltaReg().longValue() == -999) {
            conditions += " AND MOV_ANO_ALTA_REG IS NULL";
        } else if (this.getMovAnoAltaReg() != null) {
            conditions += " AND MOV_ANO_ALTA_REG = ?";
            values.add(this.getMovAnoAltaReg());
        }

        if (this.getMovMesAltaReg() != null && this.getMovMesAltaReg().longValue() == -999) {
            conditions += " AND MOV_MES_ALTA_REG IS NULL";
        } else if (this.getMovMesAltaReg() != null) {
            conditions += " AND MOV_MES_ALTA_REG = ?";
            values.add(this.getMovMesAltaReg());
        }

        if (this.getMovDiaAltaReg() != null && this.getMovDiaAltaReg().longValue() == -999) {
            conditions += " AND MOV_DIA_ALTA_REG IS NULL";
        } else if (this.getMovDiaAltaReg() != null) {
            conditions += " AND MOV_DIA_ALTA_REG = ?";
            values.add(this.getMovDiaAltaReg());
        }

        if (this.getMovAnoUltMod() != null && this.getMovAnoUltMod().longValue() == -999) {
            conditions += " AND MOV_ANO_ULT_MOD IS NULL";
        } else if (this.getMovAnoUltMod() != null) {
            conditions += " AND MOV_ANO_ULT_MOD = ?";
            values.add(this.getMovAnoUltMod());
        }

        if (this.getMovMesUltMod() != null && this.getMovMesUltMod().longValue() == -999) {
            conditions += " AND MOV_MES_ULT_MOD IS NULL";
        } else if (this.getMovMesUltMod() != null) {
            conditions += " AND MOV_MES_ULT_MOD = ?";
            values.add(this.getMovMesUltMod());
        }

        if (this.getMovDiaUltMod() != null && this.getMovDiaUltMod().longValue() == -999) {
            conditions += " AND MOV_DIA_ULT_MOD IS NULL";
        } else if (this.getMovDiaUltMod() != null) {
            conditions += " AND MOV_DIA_ULT_MOD = ?";
            values.add(this.getMovDiaUltMod());
        }

        if (this.getMovCveStMovto() != null && "null".equals(this.getMovCveStMovto())) {
            conditions += " AND MOV_CVE_ST_MOVTO IS NULL";
        } else if (this.getMovCveStMovto() != null) {
            conditions += " AND MOV_CVE_ST_MOVTO = ?";
            values.add(this.getMovCveStMovto());
        }

        if (this.getMovCveAcumEdcta() != null && "null".equals(this.getMovCveAcumEdcta())) {
            conditions += " AND MOV_CVE_ACUM_EDCTA IS NULL";
        } else if (this.getMovCveAcumEdcta() != null) {
            conditions += " AND MOV_CVE_ACUM_EDCTA = ?";
            values.add(this.getMovCveAcumEdcta());
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
        String sql = "UPDATE MOVIMIENC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " MOV_ANO_MOVTO = ?, ";
        values.add(this.getMovAnoMovto());
        fields += " MOV_MES_MOVTO = ?, ";
        values.add(this.getMovMesMovto());
        fields += " MOV_DIA_MOVTO = ?, ";
        values.add(this.getMovDiaMovto());
        fields += " MOV_NUM_CONTRATO = ?, ";
        values.add(this.getMovNumContrato());
        fields += " MOV_SUB_CONTRATO = ?, ";
        values.add(this.getMovSubContrato());
        fields += " MOV_FOLIO_OPERA = ?, ";
        values.add(this.getMovFolioOpera());
        fields += " MOV_NUM_MODULO = ?, ";
        values.add(this.getMovNumModulo());
        fields += " MOV_NUM_TRANSAC = ?, ";
        values.add(this.getMovNumTransac());
        fields += " MOV_NUM_USUARIO = ?, ";
        values.add(this.getMovNumUsuario());
        fields += " MOV_DESC_MOVTO = ?, ";
        values.add(this.getMovDescMovto());
        fields += " MOV_HR_TRANSAC = ?, ";
        values.add(this.getMovHrTransac());
        fields += " MOV_MIN_TRANSAC = ?, ";
        values.add(this.getMovMinTransac());
        fields += " MOV_IMP_MOVTO = ?, ";
        values.add(this.getMovImpMovto());
        fields += " MOV_CVE_TIPO_MERCA = ?, ";
        values.add(this.getMovCveTipoMerca());
        fields += " MOV_NUM_INSTRUME = ?, ";
        values.add(this.getMovNumInstrume());
        fields += " MOV_NUM_SEC_EMIS = ?, ";
        values.add(this.getMovNumSecEmis());
        fields += " MOV_NUM_TITULOS = ?, ";
        values.add(this.getMovNumTitulos());
        fields += " MOV_CVE_IMPRE_EDO = ?, ";
        values.add(this.getMovCveImpreEdo());
        fields += " MOV_CVE_ENT_SAL = ?, ";
        values.add(this.getMovCveEntSal());
        fields += " MOV_ANO_ALTA_REG = ?, ";
        values.add(this.getMovAnoAltaReg());
        fields += " MOV_MES_ALTA_REG = ?, ";
        values.add(this.getMovMesAltaReg());
        fields += " MOV_DIA_ALTA_REG = ?, ";
        values.add(this.getMovDiaAltaReg());
        fields += " MOV_ANO_ULT_MOD = ?, ";
        values.add(this.getMovAnoUltMod());
        fields += " MOV_MES_ULT_MOD = ?, ";
        values.add(this.getMovMesUltMod());
        fields += " MOV_DIA_ULT_MOD = ?, ";
        values.add(this.getMovDiaUltMod());
        fields += " MOV_CVE_ST_MOVTO = ?, ";
        values.add(this.getMovCveStMovto());
        fields += " MOV_CVE_ACUM_EDCTA = ?, ";
        values.add(this.getMovCveAcumEdcta());
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
        String sql = "INSERT INTO MOVIMIENC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", MOV_ANO_MOVTO";
        fieldValues += ", ?";
        values.add(this.getMovAnoMovto());

        fields += ", MOV_MES_MOVTO";
        fieldValues += ", ?";
        values.add(this.getMovMesMovto());

        fields += ", MOV_DIA_MOVTO";
        fieldValues += ", ?";
        values.add(this.getMovDiaMovto());

        fields += ", MOV_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getMovNumContrato());

        fields += ", MOV_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getMovSubContrato());

        fields += ", MOV_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getMovFolioOpera());

        fields += ", MOV_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getMovNumModulo());

        fields += ", MOV_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getMovNumTransac());

        fields += ", MOV_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getMovNumUsuario());

        fields += ", MOV_DESC_MOVTO";
        fieldValues += ", ?";
        values.add(this.getMovDescMovto());

        fields += ", MOV_HR_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getMovHrTransac());

        fields += ", MOV_MIN_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getMovMinTransac());

        fields += ", MOV_IMP_MOVTO";
        fieldValues += ", ?";
        values.add(this.getMovImpMovto());

        fields += ", MOV_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getMovCveTipoMerca());

        fields += ", MOV_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getMovNumInstrume());

        fields += ", MOV_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getMovNumSecEmis());

        fields += ", MOV_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getMovNumTitulos());

        fields += ", MOV_CVE_IMPRE_EDO";
        fieldValues += ", ?";
        values.add(this.getMovCveImpreEdo());

        fields += ", MOV_CVE_ENT_SAL";
        fieldValues += ", ?";
        values.add(this.getMovCveEntSal());

        fields += ", MOV_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMovAnoAltaReg());

        fields += ", MOV_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMovMesAltaReg());

        fields += ", MOV_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMovDiaAltaReg());

        fields += ", MOV_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMovAnoUltMod());

        fields += ", MOV_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMovMesUltMod());

        fields += ", MOV_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMovDiaUltMod());

        fields += ", MOV_CVE_ST_MOVTO";
        fieldValues += ", ?";
        values.add(this.getMovCveStMovto());

        fields += ", MOV_CVE_ACUM_EDCTA";
        fieldValues += ", ?";
        values.add(this.getMovCveAcumEdcta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM MOVIMIENC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Movimienc instance = (Movimienc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getMovAnoMovto().equals(instance.getMovAnoMovto()))
            equalObjects = false;
        if (equalObjects && !this.getMovMesMovto().equals(instance.getMovMesMovto()))
            equalObjects = false;
        if (equalObjects && !this.getMovDiaMovto().equals(instance.getMovDiaMovto()))
            equalObjects = false;
        if (equalObjects && !this.getMovNumContrato().equals(instance.getMovNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getMovSubContrato().equals(instance.getMovSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getMovFolioOpera().equals(instance.getMovFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getMovNumModulo().equals(instance.getMovNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getMovNumTransac().equals(instance.getMovNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getMovNumUsuario().equals(instance.getMovNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getMovDescMovto().equals(instance.getMovDescMovto()))
            equalObjects = false;
        if (equalObjects && !this.getMovHrTransac().equals(instance.getMovHrTransac()))
            equalObjects = false;
        if (equalObjects && !this.getMovMinTransac().equals(instance.getMovMinTransac()))
            equalObjects = false;
        if (equalObjects && !this.getMovImpMovto().equals(instance.getMovImpMovto()))
            equalObjects = false;
        if (equalObjects && !this.getMovCveTipoMerca().equals(instance.getMovCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getMovNumInstrume().equals(instance.getMovNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getMovNumSecEmis().equals(instance.getMovNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getMovNumTitulos().equals(instance.getMovNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getMovCveImpreEdo().equals(instance.getMovCveImpreEdo()))
            equalObjects = false;
        if (equalObjects && !this.getMovCveEntSal().equals(instance.getMovCveEntSal()))
            equalObjects = false;
        if (equalObjects && !this.getMovAnoAltaReg().equals(instance.getMovAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMovMesAltaReg().equals(instance.getMovMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMovDiaAltaReg().equals(instance.getMovDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMovAnoUltMod().equals(instance.getMovAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMovMesUltMod().equals(instance.getMovMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMovDiaUltMod().equals(instance.getMovDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMovCveStMovto().equals(instance.getMovCveStMovto()))
            equalObjects = false;
        if (equalObjects && !this.getMovCveAcumEdcta().equals(instance.getMovCveAcumEdcta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Movimienc result = new Movimienc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setMovAnoMovto((BigDecimal) objectData.getData("MOV_ANO_MOVTO"));
        result.setMovMesMovto((BigDecimal) objectData.getData("MOV_MES_MOVTO"));
        result.setMovDiaMovto((BigDecimal) objectData.getData("MOV_DIA_MOVTO"));
        result.setMovNumContrato((BigDecimal) objectData.getData("MOV_NUM_CONTRATO"));
        result.setMovSubContrato((BigDecimal) objectData.getData("MOV_SUB_CONTRATO"));
        result.setMovFolioOpera((BigDecimal) objectData.getData("MOV_FOLIO_OPERA"));
        result.setMovNumModulo((BigDecimal) objectData.getData("MOV_NUM_MODULO"));
        result.setMovNumTransac((BigDecimal) objectData.getData("MOV_NUM_TRANSAC"));
        result.setMovNumUsuario((BigDecimal) objectData.getData("MOV_NUM_USUARIO"));
        result.setMovDescMovto((String) objectData.getData("MOV_DESC_MOVTO"));
        result.setMovHrTransac((BigDecimal) objectData.getData("MOV_HR_TRANSAC"));
        result.setMovMinTransac((BigDecimal) objectData.getData("MOV_MIN_TRANSAC"));
        result.setMovImpMovto((BigDecimal) objectData.getData("MOV_IMP_MOVTO"));
        result.setMovCveTipoMerca((BigDecimal) objectData.getData("MOV_CVE_TIPO_MERCA"));
        result.setMovNumInstrume((BigDecimal) objectData.getData("MOV_NUM_INSTRUME"));
        result.setMovNumSecEmis((BigDecimal) objectData.getData("MOV_NUM_SEC_EMIS"));
        result.setMovNumTitulos((BigDecimal) objectData.getData("MOV_NUM_TITULOS"));
        result.setMovCveImpreEdo((BigDecimal) objectData.getData("MOV_CVE_IMPRE_EDO"));
        result.setMovCveEntSal((String) objectData.getData("MOV_CVE_ENT_SAL"));
        result.setMovAnoAltaReg((BigDecimal) objectData.getData("MOV_ANO_ALTA_REG"));
        result.setMovMesAltaReg((BigDecimal) objectData.getData("MOV_MES_ALTA_REG"));
        result.setMovDiaAltaReg((BigDecimal) objectData.getData("MOV_DIA_ALTA_REG"));
        result.setMovAnoUltMod((BigDecimal) objectData.getData("MOV_ANO_ULT_MOD"));
        result.setMovMesUltMod((BigDecimal) objectData.getData("MOV_MES_ULT_MOD"));
        result.setMovDiaUltMod((BigDecimal) objectData.getData("MOV_DIA_ULT_MOD"));
        result.setMovCveStMovto((String) objectData.getData("MOV_CVE_ST_MOVTO"));
        result.setMovCveAcumEdcta((String) objectData.getData("MOV_CVE_ACUM_EDCTA"));

        return result;

    }

}
