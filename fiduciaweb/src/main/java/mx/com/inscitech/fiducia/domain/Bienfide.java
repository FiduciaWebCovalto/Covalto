package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "BIENFIDE_PK", columns = { "BIE_NUM_CONTRATO", "BIE_SUB_CONTRATO", "BIE_CVE_TIPO_BIEN", "BIE_ID_BIEN" }, sequences = { "MANUAL" })
public class Bienfide extends DomainObject {

    BigDecimal bieNumContrato = null;
    BigDecimal bieSubContrato = null;
    String bieCveTipoBien = null;
    String bieCveBien = null;
    String bieIdBien = null;
    BigDecimal bieImpBien = null;
    BigDecimal bieImpUltValua = null;
    String bieCvePerVal = null;
    String bieDescBien = null;
    String bieFecUltValua = null;
    BigDecimal bieFecAnoInicio = null;
    BigDecimal bieFecMesInicio = null;
    BigDecimal bieFecDiaInicio = null;
    BigDecimal bieFecAnoFin = null;
    BigDecimal bieFecMesFin = null;
    BigDecimal bieFecDiaFin = null;
    BigDecimal bieAnoAltaReg = null;
    BigDecimal bieMesAltaReg = null;
    BigDecimal bieDiaAltaReg = null;
    BigDecimal bieAnoUltMod = null;
    BigDecimal bieMesUltMod = null;
    BigDecimal bieDiaUltMod = null;
    String bieTexComentario = null;
    String bieCveStBienfid = null;

    public Bienfide() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBieNumContrato(BigDecimal bieNumContrato) {
        this.bieNumContrato = bieNumContrato;
    }

    public BigDecimal getBieNumContrato() {
        return this.bieNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBieSubContrato(BigDecimal bieSubContrato) {
        this.bieSubContrato = bieSubContrato;
    }

    public BigDecimal getBieSubContrato() {
        return this.bieSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setBieCveTipoBien(String bieCveTipoBien) {
        this.bieCveTipoBien = bieCveTipoBien;
    }

    public String getBieCveTipoBien() {
        return this.bieCveTipoBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setBieCveBien(String bieCveBien) {
        this.bieCveBien = bieCveBien;
    }

    public String getBieCveBien() {
        return this.bieCveBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setBieIdBien(String bieIdBien) {
        this.bieIdBien = bieIdBien;
    }

    public String getBieIdBien() {
        return this.bieIdBien;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setBieImpBien(BigDecimal bieImpBien) {
        this.bieImpBien = bieImpBien;
    }

    public BigDecimal getBieImpBien() {
        return this.bieImpBien;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setBieImpUltValua(BigDecimal bieImpUltValua) {
        this.bieImpUltValua = bieImpUltValua;
    }

    public BigDecimal getBieImpUltValua() {
        return this.bieImpUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBieCvePerVal(String bieCvePerVal) {
        this.bieCvePerVal = bieCvePerVal;
    }

    public String getBieCvePerVal() {
        return this.bieCvePerVal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBieDescBien(String bieDescBien) {
        this.bieDescBien = bieDescBien;
    }

    public String getBieDescBien() {
        return this.bieDescBien;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBieFecUltValua(String bieFecUltValua) {
        this.bieFecUltValua = bieFecUltValua;
    }

    public String getBieFecUltValua() {
        return this.bieFecUltValua;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBieFecAnoInicio(BigDecimal bieFecAnoInicio) {
        this.bieFecAnoInicio = bieFecAnoInicio;
    }

    public BigDecimal getBieFecAnoInicio() {
        return this.bieFecAnoInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBieFecMesInicio(BigDecimal bieFecMesInicio) {
        this.bieFecMesInicio = bieFecMesInicio;
    }

    public BigDecimal getBieFecMesInicio() {
        return this.bieFecMesInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBieFecDiaInicio(BigDecimal bieFecDiaInicio) {
        this.bieFecDiaInicio = bieFecDiaInicio;
    }

    public BigDecimal getBieFecDiaInicio() {
        return this.bieFecDiaInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBieFecAnoFin(BigDecimal bieFecAnoFin) {
        this.bieFecAnoFin = bieFecAnoFin;
    }

    public BigDecimal getBieFecAnoFin() {
        return this.bieFecAnoFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBieFecMesFin(BigDecimal bieFecMesFin) {
        this.bieFecMesFin = bieFecMesFin;
    }

    public BigDecimal getBieFecMesFin() {
        return this.bieFecMesFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBieFecDiaFin(BigDecimal bieFecDiaFin) {
        this.bieFecDiaFin = bieFecDiaFin;
    }

    public BigDecimal getBieFecDiaFin() {
        return this.bieFecDiaFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBieAnoAltaReg(BigDecimal bieAnoAltaReg) {
        this.bieAnoAltaReg = bieAnoAltaReg;
    }

    public BigDecimal getBieAnoAltaReg() {
        return this.bieAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBieMesAltaReg(BigDecimal bieMesAltaReg) {
        this.bieMesAltaReg = bieMesAltaReg;
    }

    public BigDecimal getBieMesAltaReg() {
        return this.bieMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBieDiaAltaReg(BigDecimal bieDiaAltaReg) {
        this.bieDiaAltaReg = bieDiaAltaReg;
    }

    public BigDecimal getBieDiaAltaReg() {
        return this.bieDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBieAnoUltMod(BigDecimal bieAnoUltMod) {
        this.bieAnoUltMod = bieAnoUltMod;
    }

    public BigDecimal getBieAnoUltMod() {
        return this.bieAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBieMesUltMod(BigDecimal bieMesUltMod) {
        this.bieMesUltMod = bieMesUltMod;
    }

    public BigDecimal getBieMesUltMod() {
        return this.bieMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBieDiaUltMod(BigDecimal bieDiaUltMod) {
        this.bieDiaUltMod = bieDiaUltMod;
    }

    public BigDecimal getBieDiaUltMod() {
        return this.bieDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBieTexComentario(String bieTexComentario) {
        this.bieTexComentario = bieTexComentario;
    }

    public String getBieTexComentario() {
        return this.bieTexComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBieCveStBienfid(String bieCveStBienfid) {
        this.bieCveStBienfid = bieCveStBienfid;
    }

    public String getBieCveStBienfid() {
        return this.bieCveStBienfid;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM BIENFIDE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBieNumContrato() != null && this.getBieNumContrato().longValue() == -999) {
            conditions += " AND BIE_NUM_CONTRATO IS NULL";
        } else if (this.getBieNumContrato() != null) {
            conditions += " AND BIE_NUM_CONTRATO = ?";
            values.add(this.getBieNumContrato());
        }

        if (this.getBieSubContrato() != null && this.getBieSubContrato().longValue() == -999) {
            conditions += " AND BIE_SUB_CONTRATO IS NULL";
        } else if (this.getBieSubContrato() != null) {
            conditions += " AND BIE_SUB_CONTRATO = ?";
            values.add(this.getBieSubContrato());
        }

        if (this.getBieCveTipoBien() != null && "null".equals(this.getBieCveTipoBien())) {
            conditions += " AND BIE_CVE_TIPO_BIEN IS NULL";
        } else if (this.getBieCveTipoBien() != null) {
            conditions += " AND BIE_CVE_TIPO_BIEN = ?";
            values.add(this.getBieCveTipoBien());
        }

        if (this.getBieIdBien() != null && "null".equals(this.getBieIdBien())) {
            conditions += " AND BIE_ID_BIEN IS NULL";
        } else if (this.getBieIdBien() != null) {
            conditions += " AND BIE_ID_BIEN = ?";
            values.add(this.getBieIdBien());
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
        String sql = "SELECT * FROM BIENFIDE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBieNumContrato() != null && this.getBieNumContrato().longValue() == -999) {
            conditions += " AND BIE_NUM_CONTRATO IS NULL";
        } else if (this.getBieNumContrato() != null) {
            conditions += " AND BIE_NUM_CONTRATO = ?";
            values.add(this.getBieNumContrato());
        }

        if (this.getBieSubContrato() != null && this.getBieSubContrato().longValue() == -999) {
            conditions += " AND BIE_SUB_CONTRATO IS NULL";
        } else if (this.getBieSubContrato() != null) {
            conditions += " AND BIE_SUB_CONTRATO = ?";
            values.add(this.getBieSubContrato());
        }

        if (this.getBieCveTipoBien() != null && "null".equals(this.getBieCveTipoBien())) {
            conditions += " AND BIE_CVE_TIPO_BIEN IS NULL";
        } else if (this.getBieCveTipoBien() != null) {
            conditions += " AND BIE_CVE_TIPO_BIEN = ?";
            values.add(this.getBieCveTipoBien());
        }

        if (this.getBieCveBien() != null && "null".equals(this.getBieCveBien())) {
            conditions += " AND BIE_CVE_BIEN IS NULL";
        } else if (this.getBieCveBien() != null) {
            conditions += " AND BIE_CVE_BIEN = ?";
            values.add(this.getBieCveBien());
        }

        if (this.getBieIdBien() != null && "null".equals(this.getBieIdBien())) {
            conditions += " AND BIE_ID_BIEN IS NULL";
        } else if (this.getBieIdBien() != null) {
            conditions += " AND BIE_ID_BIEN = ?";
            values.add(this.getBieIdBien());
        }

        if (this.getBieImpBien() != null && this.getBieImpBien().longValue() == -999) {
            conditions += " AND BIE_IMP_BIEN IS NULL";
        } else if (this.getBieImpBien() != null) {
            conditions += " AND BIE_IMP_BIEN = ?";
            values.add(this.getBieImpBien());
        }

        if (this.getBieImpUltValua() != null && this.getBieImpUltValua().longValue() == -999) {
            conditions += " AND BIE_IMP_ULT_VALUA IS NULL";
        } else if (this.getBieImpUltValua() != null) {
            conditions += " AND BIE_IMP_ULT_VALUA = ?";
            values.add(this.getBieImpUltValua());
        }

        if (this.getBieCvePerVal() != null && "null".equals(this.getBieCvePerVal())) {
            conditions += " AND BIE_CVE_PER_VAL IS NULL";
        } else if (this.getBieCvePerVal() != null) {
            conditions += " AND BIE_CVE_PER_VAL = ?";
            values.add(this.getBieCvePerVal());
        }

        if (this.getBieDescBien() != null && "null".equals(this.getBieDescBien())) {
            conditions += " AND BIE_DESC_BIEN IS NULL";
        } else if (this.getBieDescBien() != null) {
            conditions += " AND BIE_DESC_BIEN = ?";
            values.add(this.getBieDescBien());
        }

        if (this.getBieFecUltValua() != null && "null".equals(this.getBieFecUltValua())) {
            conditions += " AND BIE_FEC_ULT_VALUA IS NULL";
        } else if (this.getBieFecUltValua() != null) {
            conditions += " AND BIE_FEC_ULT_VALUA = ?";
            values.add(this.getBieFecUltValua());
        }

        if (this.getBieFecAnoInicio() != null && this.getBieFecAnoInicio().longValue() == -999) {
            conditions += " AND BIE_FEC_ANO_INICIO IS NULL";
        } else if (this.getBieFecAnoInicio() != null) {
            conditions += " AND BIE_FEC_ANO_INICIO = ?";
            values.add(this.getBieFecAnoInicio());
        }

        if (this.getBieFecMesInicio() != null && this.getBieFecMesInicio().longValue() == -999) {
            conditions += " AND BIE_FEC_MES_INICIO IS NULL";
        } else if (this.getBieFecMesInicio() != null) {
            conditions += " AND BIE_FEC_MES_INICIO = ?";
            values.add(this.getBieFecMesInicio());
        }

        if (this.getBieFecDiaInicio() != null && this.getBieFecDiaInicio().longValue() == -999) {
            conditions += " AND BIE_FEC_DIA_INICIO IS NULL";
        } else if (this.getBieFecDiaInicio() != null) {
            conditions += " AND BIE_FEC_DIA_INICIO = ?";
            values.add(this.getBieFecDiaInicio());
        }

        if (this.getBieFecAnoFin() != null && this.getBieFecAnoFin().longValue() == -999) {
            conditions += " AND BIE_FEC_ANO_FIN IS NULL";
        } else if (this.getBieFecAnoFin() != null) {
            conditions += " AND BIE_FEC_ANO_FIN = ?";
            values.add(this.getBieFecAnoFin());
        }

        if (this.getBieFecMesFin() != null && this.getBieFecMesFin().longValue() == -999) {
            conditions += " AND BIE_FEC_MES_FIN IS NULL";
        } else if (this.getBieFecMesFin() != null) {
            conditions += " AND BIE_FEC_MES_FIN = ?";
            values.add(this.getBieFecMesFin());
        }

        if (this.getBieFecDiaFin() != null && this.getBieFecDiaFin().longValue() == -999) {
            conditions += " AND BIE_FEC_DIA_FIN IS NULL";
        } else if (this.getBieFecDiaFin() != null) {
            conditions += " AND BIE_FEC_DIA_FIN = ?";
            values.add(this.getBieFecDiaFin());
        }

        if (this.getBieAnoAltaReg() != null && this.getBieAnoAltaReg().longValue() == -999) {
            conditions += " AND BIE_ANO_ALTA_REG IS NULL";
        } else if (this.getBieAnoAltaReg() != null) {
            conditions += " AND BIE_ANO_ALTA_REG = ?";
            values.add(this.getBieAnoAltaReg());
        }

        if (this.getBieMesAltaReg() != null && this.getBieMesAltaReg().longValue() == -999) {
            conditions += " AND BIE_MES_ALTA_REG IS NULL";
        } else if (this.getBieMesAltaReg() != null) {
            conditions += " AND BIE_MES_ALTA_REG = ?";
            values.add(this.getBieMesAltaReg());
        }

        if (this.getBieDiaAltaReg() != null && this.getBieDiaAltaReg().longValue() == -999) {
            conditions += " AND BIE_DIA_ALTA_REG IS NULL";
        } else if (this.getBieDiaAltaReg() != null) {
            conditions += " AND BIE_DIA_ALTA_REG = ?";
            values.add(this.getBieDiaAltaReg());
        }

        if (this.getBieAnoUltMod() != null && this.getBieAnoUltMod().longValue() == -999) {
            conditions += " AND BIE_ANO_ULT_MOD IS NULL";
        } else if (this.getBieAnoUltMod() != null) {
            conditions += " AND BIE_ANO_ULT_MOD = ?";
            values.add(this.getBieAnoUltMod());
        }

        if (this.getBieMesUltMod() != null && this.getBieMesUltMod().longValue() == -999) {
            conditions += " AND BIE_MES_ULT_MOD IS NULL";
        } else if (this.getBieMesUltMod() != null) {
            conditions += " AND BIE_MES_ULT_MOD = ?";
            values.add(this.getBieMesUltMod());
        }

        if (this.getBieDiaUltMod() != null && this.getBieDiaUltMod().longValue() == -999) {
            conditions += " AND BIE_DIA_ULT_MOD IS NULL";
        } else if (this.getBieDiaUltMod() != null) {
            conditions += " AND BIE_DIA_ULT_MOD = ?";
            values.add(this.getBieDiaUltMod());
        }

        if (this.getBieTexComentario() != null && "null".equals(this.getBieTexComentario())) {
            conditions += " AND BIE_TEX_COMENTARIO IS NULL";
        } else if (this.getBieTexComentario() != null) {
            conditions += " AND BIE_TEX_COMENTARIO = ?";
            values.add(this.getBieTexComentario());
        }

        if (this.getBieCveStBienfid() != null && "null".equals(this.getBieCveStBienfid())) {
            conditions += " AND BIE_CVE_ST_BIENFID IS NULL";
        } else if (this.getBieCveStBienfid() != null) {
            conditions += " AND BIE_CVE_ST_BIENFID = ?";
            values.add(this.getBieCveStBienfid());
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
        String sql = "UPDATE BIENFIDE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND BIE_NUM_CONTRATO = ?";
        pkValues.add(this.getBieNumContrato());
        conditions += " AND BIE_SUB_CONTRATO = ?";
        pkValues.add(this.getBieSubContrato());
        conditions += " AND BIE_CVE_TIPO_BIEN = ?";
        pkValues.add(this.getBieCveTipoBien());
        fields += " BIE_CVE_BIEN = ?, ";
        values.add(this.getBieCveBien());
        conditions += " AND BIE_ID_BIEN = ?";
        pkValues.add(this.getBieIdBien());
        fields += " BIE_IMP_BIEN = ?, ";
        values.add(this.getBieImpBien());
        fields += " BIE_IMP_ULT_VALUA = ?, ";
        values.add(this.getBieImpUltValua());
        fields += " BIE_CVE_PER_VAL = ?, ";
        values.add(this.getBieCvePerVal());
        fields += " BIE_DESC_BIEN = ?, ";
        values.add(this.getBieDescBien());
        fields += " BIE_FEC_ULT_VALUA = ?, ";
        values.add(this.getBieFecUltValua());
        fields += " BIE_FEC_ANO_INICIO = ?, ";
        values.add(this.getBieFecAnoInicio());
        fields += " BIE_FEC_MES_INICIO = ?, ";
        values.add(this.getBieFecMesInicio());
        fields += " BIE_FEC_DIA_INICIO = ?, ";
        values.add(this.getBieFecDiaInicio());
        fields += " BIE_FEC_ANO_FIN = ?, ";
        values.add(this.getBieFecAnoFin());
        fields += " BIE_FEC_MES_FIN = ?, ";
        values.add(this.getBieFecMesFin());
        fields += " BIE_FEC_DIA_FIN = ?, ";
        values.add(this.getBieFecDiaFin());
        fields += " BIE_ANO_ALTA_REG = ?, ";
        values.add(this.getBieAnoAltaReg());
        fields += " BIE_MES_ALTA_REG = ?, ";
        values.add(this.getBieMesAltaReg());
        fields += " BIE_DIA_ALTA_REG = ?, ";
        values.add(this.getBieDiaAltaReg());
        fields += " BIE_ANO_ULT_MOD = ?, ";
        values.add(this.getBieAnoUltMod());
        fields += " BIE_MES_ULT_MOD = ?, ";
        values.add(this.getBieMesUltMod());
        fields += " BIE_DIA_ULT_MOD = ?, ";
        values.add(this.getBieDiaUltMod());
        fields += " BIE_TEX_COMENTARIO = ?, ";
        values.add(this.getBieTexComentario());
        fields += " BIE_CVE_ST_BIENFID = ?, ";
        values.add(this.getBieCveStBienfid());
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
        String sql = "INSERT INTO BIENFIDE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", BIE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getBieNumContrato());

        fields += ", BIE_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getBieSubContrato());

        fields += ", BIE_CVE_TIPO_BIEN";
        fieldValues += ", ?";
        values.add(this.getBieCveTipoBien());

        fields += ", BIE_CVE_BIEN";
        fieldValues += ", ?";
        values.add(this.getBieCveBien());

        fields += ", BIE_ID_BIEN";
        fieldValues += ", ?";
        values.add(this.getBieIdBien());

        fields += ", BIE_IMP_BIEN";
        fieldValues += ", ?";
        values.add(this.getBieImpBien());

        fields += ", BIE_IMP_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getBieImpUltValua());

        fields += ", BIE_CVE_PER_VAL";
        fieldValues += ", ?";
        values.add(this.getBieCvePerVal());

        fields += ", BIE_DESC_BIEN";
        fieldValues += ", ?";
        values.add(this.getBieDescBien());

        fields += ", BIE_FEC_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getBieFecUltValua());

        fields += ", BIE_FEC_ANO_INICIO";
        fieldValues += ", ?";
        values.add(this.getBieFecAnoInicio());

        fields += ", BIE_FEC_MES_INICIO";
        fieldValues += ", ?";
        values.add(this.getBieFecMesInicio());

        fields += ", BIE_FEC_DIA_INICIO";
        fieldValues += ", ?";
        values.add(this.getBieFecDiaInicio());

        fields += ", BIE_FEC_ANO_FIN";
        fieldValues += ", ?";
        values.add(this.getBieFecAnoFin());

        fields += ", BIE_FEC_MES_FIN";
        fieldValues += ", ?";
        values.add(this.getBieFecMesFin());

        fields += ", BIE_FEC_DIA_FIN";
        fieldValues += ", ?";
        values.add(this.getBieFecDiaFin());

        fields += ", BIE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBieAnoAltaReg());

        fields += ", BIE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBieMesAltaReg());

        fields += ", BIE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBieDiaAltaReg());

        fields += ", BIE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBieAnoUltMod());

        fields += ", BIE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBieMesUltMod());

        fields += ", BIE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBieDiaUltMod());

        fields += ", BIE_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getBieTexComentario());

        fields += ", BIE_CVE_ST_BIENFID";
        fieldValues += ", ?";
        values.add(this.getBieCveStBienfid());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM BIENFIDE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND BIE_NUM_CONTRATO = ?";
        values.add(this.getBieNumContrato());
        conditions += " AND BIE_SUB_CONTRATO = ?";
        values.add(this.getBieSubContrato());
        conditions += " AND BIE_CVE_TIPO_BIEN = ?";
        values.add(this.getBieCveTipoBien());
        conditions += " AND BIE_ID_BIEN = ?";
        values.add(this.getBieIdBien());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Bienfide instance = (Bienfide) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getBieNumContrato().equals(instance.getBieNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getBieSubContrato().equals(instance.getBieSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getBieCveTipoBien().equals(instance.getBieCveTipoBien()))
            equalObjects = false;
        if (equalObjects && !this.getBieCveBien().equals(instance.getBieCveBien()))
            equalObjects = false;
        if (equalObjects && !this.getBieIdBien().equals(instance.getBieIdBien()))
            equalObjects = false;
        if (equalObjects && !this.getBieImpBien().equals(instance.getBieImpBien()))
            equalObjects = false;
        if (equalObjects && !this.getBieImpUltValua().equals(instance.getBieImpUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getBieCvePerVal().equals(instance.getBieCvePerVal()))
            equalObjects = false;
        if (equalObjects && !this.getBieDescBien().equals(instance.getBieDescBien()))
            equalObjects = false;
        if (equalObjects && !this.getBieFecUltValua().equals(instance.getBieFecUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getBieFecAnoInicio().equals(instance.getBieFecAnoInicio()))
            equalObjects = false;
        if (equalObjects && !this.getBieFecMesInicio().equals(instance.getBieFecMesInicio()))
            equalObjects = false;
        if (equalObjects && !this.getBieFecDiaInicio().equals(instance.getBieFecDiaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getBieFecAnoFin().equals(instance.getBieFecAnoFin()))
            equalObjects = false;
        if (equalObjects && !this.getBieFecMesFin().equals(instance.getBieFecMesFin()))
            equalObjects = false;
        if (equalObjects && !this.getBieFecDiaFin().equals(instance.getBieFecDiaFin()))
            equalObjects = false;
        if (equalObjects && !this.getBieAnoAltaReg().equals(instance.getBieAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBieMesAltaReg().equals(instance.getBieMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBieDiaAltaReg().equals(instance.getBieDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBieAnoUltMod().equals(instance.getBieAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBieMesUltMod().equals(instance.getBieMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBieDiaUltMod().equals(instance.getBieDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBieTexComentario().equals(instance.getBieTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getBieCveStBienfid().equals(instance.getBieCveStBienfid()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Bienfide result = new Bienfide();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setBieNumContrato((BigDecimal) objectData.getData("BIE_NUM_CONTRATO"));
        result.setBieSubContrato((BigDecimal) objectData.getData("BIE_SUB_CONTRATO"));
        result.setBieCveTipoBien((String) objectData.getData("BIE_CVE_TIPO_BIEN"));
        result.setBieCveBien((String) objectData.getData("BIE_CVE_BIEN"));
        result.setBieIdBien((String) objectData.getData("BIE_ID_BIEN"));
        result.setBieImpBien((BigDecimal) objectData.getData("BIE_IMP_BIEN"));
        result.setBieImpUltValua((BigDecimal) objectData.getData("BIE_IMP_ULT_VALUA"));
        result.setBieCvePerVal((String) objectData.getData("BIE_CVE_PER_VAL"));
        result.setBieDescBien((String) objectData.getData("BIE_DESC_BIEN"));
        result.setBieFecUltValua((String) objectData.getData("BIE_FEC_ULT_VALUA"));
        result.setBieFecAnoInicio((BigDecimal) objectData.getData("BIE_FEC_ANO_INICIO"));
        result.setBieFecMesInicio((BigDecimal) objectData.getData("BIE_FEC_MES_INICIO"));
        result.setBieFecDiaInicio((BigDecimal) objectData.getData("BIE_FEC_DIA_INICIO"));
        result.setBieFecAnoFin((BigDecimal) objectData.getData("BIE_FEC_ANO_FIN"));
        result.setBieFecMesFin((BigDecimal) objectData.getData("BIE_FEC_MES_FIN"));
        result.setBieFecDiaFin((BigDecimal) objectData.getData("BIE_FEC_DIA_FIN"));
        result.setBieAnoAltaReg((BigDecimal) objectData.getData("BIE_ANO_ALTA_REG"));
        result.setBieMesAltaReg((BigDecimal) objectData.getData("BIE_MES_ALTA_REG"));
        result.setBieDiaAltaReg((BigDecimal) objectData.getData("BIE_DIA_ALTA_REG"));
        result.setBieAnoUltMod((BigDecimal) objectData.getData("BIE_ANO_ULT_MOD"));
        result.setBieMesUltMod((BigDecimal) objectData.getData("BIE_MES_ULT_MOD"));
        result.setBieDiaUltMod((BigDecimal) objectData.getData("BIE_DIA_ULT_MOD"));
        result.setBieTexComentario((String) objectData.getData("BIE_TEX_COMENTARIO"));
        result.setBieCveStBienfid((String) objectData.getData("BIE_CVE_ST_BIENFID"));

        return result;

    }

}
