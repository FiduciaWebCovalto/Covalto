package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "MOVIMIFOSEG_PK",
            columns =
            { "MFO_NUM_CTAM", "MFO_NUM_SCTA", "MFO_NUM_SSCTA", "MFO_NUM_SSSCTA", "MFO_NUM_SSSSCTA", "MFO_NUM_SSSSSCTA", "MFO_NUM_AUX1", "MFO_NUM_AUX2", "MFO_NUM_AUX3", "MFO_FOLIO"
    }, sequences = { "MANUAL" })
public class Movimifoseg extends DomainObject {

    BigDecimal mfoNumCtam = null;
    BigDecimal mfoNumScta = null;
    BigDecimal mfoNumSscta = null;
    BigDecimal mfoNumSsscta = null;
    BigDecimal mfoNumSssscta = null;
    BigDecimal mfoNumSsssscta = null;
    BigDecimal mfoNumAux1 = null;
    BigDecimal mfoNumAux2 = null;
    BigDecimal mfoNumAux3 = null;
    BigDecimal mfoFolio = null;
    String mfoFecha = null;
    BigDecimal mfoImporte = null;
    String mfoTipoOper = null;
    String mfoComprometido = null;
    BigDecimal mfoFolioDetliqui = null;
    String mfoAcuerdo = null;
    String mfoConcepto = null;
    BigDecimal mfoAnoAltaReg = null;
    BigDecimal mfoMesAltaReg = null;
    BigDecimal mfoDiaAltaReg = null;
    BigDecimal mfoAnoUltMod = null;
    BigDecimal mfoMesUltMod = null;
    BigDecimal mfoDiaUltMod = null;
    String mfoCveStMovimfo = null;

    public Movimifoseg() {
        super();
        this.pkColumns = 10;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumCtam(BigDecimal mfoNumCtam) {
        this.mfoNumCtam = mfoNumCtam;
    }

    public BigDecimal getMfoNumCtam() {
        return this.mfoNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumScta(BigDecimal mfoNumScta) {
        this.mfoNumScta = mfoNumScta;
    }

    public BigDecimal getMfoNumScta() {
        return this.mfoNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumSscta(BigDecimal mfoNumSscta) {
        this.mfoNumSscta = mfoNumSscta;
    }

    public BigDecimal getMfoNumSscta() {
        return this.mfoNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumSsscta(BigDecimal mfoNumSsscta) {
        this.mfoNumSsscta = mfoNumSsscta;
    }

    public BigDecimal getMfoNumSsscta() {
        return this.mfoNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumSssscta(BigDecimal mfoNumSssscta) {
        this.mfoNumSssscta = mfoNumSssscta;
    }

    public BigDecimal getMfoNumSssscta() {
        return this.mfoNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumSsssscta(BigDecimal mfoNumSsssscta) {
        this.mfoNumSsssscta = mfoNumSsssscta;
    }

    public BigDecimal getMfoNumSsssscta() {
        return this.mfoNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumAux1(BigDecimal mfoNumAux1) {
        this.mfoNumAux1 = mfoNumAux1;
    }

    public BigDecimal getMfoNumAux1() {
        return this.mfoNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumAux2(BigDecimal mfoNumAux2) {
        this.mfoNumAux2 = mfoNumAux2;
    }

    public BigDecimal getMfoNumAux2() {
        return this.mfoNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoNumAux3(BigDecimal mfoNumAux3) {
        this.mfoNumAux3 = mfoNumAux3;
    }

    public BigDecimal getMfoNumAux3() {
        return this.mfoNumAux3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoFolio(BigDecimal mfoFolio) {
        this.mfoFolio = mfoFolio;
    }

    public BigDecimal getMfoFolio() {
        return this.mfoFolio;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setMfoFecha(String mfoFecha) {
        this.mfoFecha = mfoFecha;
    }

    public String getMfoFecha() {
        return this.mfoFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 24, scale = 8, javaClass = BigDecimal.class)
    public void setMfoImporte(BigDecimal mfoImporte) {
        this.mfoImporte = mfoImporte;
    }

    public BigDecimal getMfoImporte() {
        return this.mfoImporte;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMfoTipoOper(String mfoTipoOper) {
        this.mfoTipoOper = mfoTipoOper;
    }

    public String getMfoTipoOper() {
        return this.mfoTipoOper;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMfoComprometido(String mfoComprometido) {
        this.mfoComprometido = mfoComprometido;
    }

    public String getMfoComprometido() {
        return this.mfoComprometido;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMfoFolioDetliqui(BigDecimal mfoFolioDetliqui) {
        this.mfoFolioDetliqui = mfoFolioDetliqui;
    }

    public BigDecimal getMfoFolioDetliqui() {
        return this.mfoFolioDetliqui;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMfoAcuerdo(String mfoAcuerdo) {
        this.mfoAcuerdo = mfoAcuerdo;
    }

    public String getMfoAcuerdo() {
        return this.mfoAcuerdo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMfoConcepto(String mfoConcepto) {
        this.mfoConcepto = mfoConcepto;
    }

    public String getMfoConcepto() {
        return this.mfoConcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMfoAnoAltaReg(BigDecimal mfoAnoAltaReg) {
        this.mfoAnoAltaReg = mfoAnoAltaReg;
    }

    public BigDecimal getMfoAnoAltaReg() {
        return this.mfoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMfoMesAltaReg(BigDecimal mfoMesAltaReg) {
        this.mfoMesAltaReg = mfoMesAltaReg;
    }

    public BigDecimal getMfoMesAltaReg() {
        return this.mfoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMfoDiaAltaReg(BigDecimal mfoDiaAltaReg) {
        this.mfoDiaAltaReg = mfoDiaAltaReg;
    }

    public BigDecimal getMfoDiaAltaReg() {
        return this.mfoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMfoAnoUltMod(BigDecimal mfoAnoUltMod) {
        this.mfoAnoUltMod = mfoAnoUltMod;
    }

    public BigDecimal getMfoAnoUltMod() {
        return this.mfoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMfoMesUltMod(BigDecimal mfoMesUltMod) {
        this.mfoMesUltMod = mfoMesUltMod;
    }

    public BigDecimal getMfoMesUltMod() {
        return this.mfoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMfoDiaUltMod(BigDecimal mfoDiaUltMod) {
        this.mfoDiaUltMod = mfoDiaUltMod;
    }

    public BigDecimal getMfoDiaUltMod() {
        return this.mfoDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMfoCveStMovimfo(String mfoCveStMovimfo) {
        this.mfoCveStMovimfo = mfoCveStMovimfo;
    }

    public String getMfoCveStMovimfo() {
        return this.mfoCveStMovimfo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM MOVIMIFOSEG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMfoNumCtam() != null && this.getMfoNumCtam().longValue() == -999) {
            conditions += " AND MFO_NUM_CTAM IS NULL";
        } else if (this.getMfoNumCtam() != null) {
            conditions += " AND MFO_NUM_CTAM = ?";
            values.add(this.getMfoNumCtam());
        }

        if (this.getMfoNumScta() != null && this.getMfoNumScta().longValue() == -999) {
            conditions += " AND MFO_NUM_SCTA IS NULL";
        } else if (this.getMfoNumScta() != null) {
            conditions += " AND MFO_NUM_SCTA = ?";
            values.add(this.getMfoNumScta());
        }

        if (this.getMfoNumSscta() != null && this.getMfoNumSscta().longValue() == -999) {
            conditions += " AND MFO_NUM_SSCTA IS NULL";
        } else if (this.getMfoNumSscta() != null) {
            conditions += " AND MFO_NUM_SSCTA = ?";
            values.add(this.getMfoNumSscta());
        }

        if (this.getMfoNumSsscta() != null && this.getMfoNumSsscta().longValue() == -999) {
            conditions += " AND MFO_NUM_SSSCTA IS NULL";
        } else if (this.getMfoNumSsscta() != null) {
            conditions += " AND MFO_NUM_SSSCTA = ?";
            values.add(this.getMfoNumSsscta());
        }

        if (this.getMfoNumSssscta() != null && this.getMfoNumSssscta().longValue() == -999) {
            conditions += " AND MFO_NUM_SSSSCTA IS NULL";
        } else if (this.getMfoNumSssscta() != null) {
            conditions += " AND MFO_NUM_SSSSCTA = ?";
            values.add(this.getMfoNumSssscta());
        }

        if (this.getMfoNumSsssscta() != null && this.getMfoNumSsssscta().longValue() == -999) {
            conditions += " AND MFO_NUM_SSSSSCTA IS NULL";
        } else if (this.getMfoNumSsssscta() != null) {
            conditions += " AND MFO_NUM_SSSSSCTA = ?";
            values.add(this.getMfoNumSsssscta());
        }

        if (this.getMfoNumAux1() != null && this.getMfoNumAux1().longValue() == -999) {
            conditions += " AND MFO_NUM_AUX1 IS NULL";
        } else if (this.getMfoNumAux1() != null) {
            conditions += " AND MFO_NUM_AUX1 = ?";
            values.add(this.getMfoNumAux1());
        }

        if (this.getMfoNumAux2() != null && this.getMfoNumAux2().longValue() == -999) {
            conditions += " AND MFO_NUM_AUX2 IS NULL";
        } else if (this.getMfoNumAux2() != null) {
            conditions += " AND MFO_NUM_AUX2 = ?";
            values.add(this.getMfoNumAux2());
        }

        if (this.getMfoNumAux3() != null && this.getMfoNumAux3().longValue() == -999) {
            conditions += " AND MFO_NUM_AUX3 IS NULL";
        } else if (this.getMfoNumAux3() != null) {
            conditions += " AND MFO_NUM_AUX3 = ?";
            values.add(this.getMfoNumAux3());
        }

        if (this.getMfoFolio() != null && this.getMfoFolio().longValue() == -999) {
            conditions += " AND MFO_FOLIO IS NULL";
        } else if (this.getMfoFolio() != null) {
            conditions += " AND MFO_FOLIO = ?";
            values.add(this.getMfoFolio());
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
        String sql = "SELECT * FROM MOVIMIFOSEG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMfoNumCtam() != null && this.getMfoNumCtam().longValue() == -999) {
            conditions += " AND MFO_NUM_CTAM IS NULL";
        } else if (this.getMfoNumCtam() != null) {
            conditions += " AND MFO_NUM_CTAM = ?";
            values.add(this.getMfoNumCtam());
        }

        if (this.getMfoNumScta() != null && this.getMfoNumScta().longValue() == -999) {
            conditions += " AND MFO_NUM_SCTA IS NULL";
        } else if (this.getMfoNumScta() != null) {
            conditions += " AND MFO_NUM_SCTA = ?";
            values.add(this.getMfoNumScta());
        }

        if (this.getMfoNumSscta() != null && this.getMfoNumSscta().longValue() == -999) {
            conditions += " AND MFO_NUM_SSCTA IS NULL";
        } else if (this.getMfoNumSscta() != null) {
            conditions += " AND MFO_NUM_SSCTA = ?";
            values.add(this.getMfoNumSscta());
        }

        if (this.getMfoNumSsscta() != null && this.getMfoNumSsscta().longValue() == -999) {
            conditions += " AND MFO_NUM_SSSCTA IS NULL";
        } else if (this.getMfoNumSsscta() != null) {
            conditions += " AND MFO_NUM_SSSCTA = ?";
            values.add(this.getMfoNumSsscta());
        }

        if (this.getMfoNumSssscta() != null && this.getMfoNumSssscta().longValue() == -999) {
            conditions += " AND MFO_NUM_SSSSCTA IS NULL";
        } else if (this.getMfoNumSssscta() != null) {
            conditions += " AND MFO_NUM_SSSSCTA = ?";
            values.add(this.getMfoNumSssscta());
        }

        if (this.getMfoNumSsssscta() != null && this.getMfoNumSsssscta().longValue() == -999) {
            conditions += " AND MFO_NUM_SSSSSCTA IS NULL";
        } else if (this.getMfoNumSsssscta() != null) {
            conditions += " AND MFO_NUM_SSSSSCTA = ?";
            values.add(this.getMfoNumSsssscta());
        }

        if (this.getMfoNumAux1() != null && this.getMfoNumAux1().longValue() == -999) {
            conditions += " AND MFO_NUM_AUX1 IS NULL";
        } else if (this.getMfoNumAux1() != null) {
            conditions += " AND MFO_NUM_AUX1 = ?";
            values.add(this.getMfoNumAux1());
        }

        if (this.getMfoNumAux2() != null && this.getMfoNumAux2().longValue() == -999) {
            conditions += " AND MFO_NUM_AUX2 IS NULL";
        } else if (this.getMfoNumAux2() != null) {
            conditions += " AND MFO_NUM_AUX2 = ?";
            values.add(this.getMfoNumAux2());
        }

        if (this.getMfoNumAux3() != null && this.getMfoNumAux3().longValue() == -999) {
            conditions += " AND MFO_NUM_AUX3 IS NULL";
        } else if (this.getMfoNumAux3() != null) {
            conditions += " AND MFO_NUM_AUX3 = ?";
            values.add(this.getMfoNumAux3());
        }

        if (this.getMfoFolio() != null && this.getMfoFolio().longValue() == -999) {
            conditions += " AND MFO_FOLIO IS NULL";
        } else if (this.getMfoFolio() != null) {
            conditions += " AND MFO_FOLIO = ?";
            values.add(this.getMfoFolio());
        }

        if (this.getMfoFecha() != null && "null".equals(this.getMfoFecha())) {
            conditions += " AND MFO_FECHA IS NULL";
        } else if (this.getMfoFecha() != null) {
            conditions += " AND MFO_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getMfoFecha());
        }

        if (this.getMfoImporte() != null && this.getMfoImporte().longValue() == -999) {
            conditions += " AND MFO_IMPORTE IS NULL";
        } else if (this.getMfoImporte() != null) {
            conditions += " AND MFO_IMPORTE = ?";
            values.add(this.getMfoImporte());
        }

        if (this.getMfoTipoOper() != null && "null".equals(this.getMfoTipoOper())) {
            conditions += " AND MFO_TIPO_OPER IS NULL";
        } else if (this.getMfoTipoOper() != null) {
            conditions += " AND MFO_TIPO_OPER = ?";
            values.add(this.getMfoTipoOper());
        }

        if (this.getMfoComprometido() != null && "null".equals(this.getMfoComprometido())) {
            conditions += " AND MFO_COMPROMETIDO IS NULL";
        } else if (this.getMfoComprometido() != null) {
            conditions += " AND MFO_COMPROMETIDO = ?";
            values.add(this.getMfoComprometido());
        }

        if (this.getMfoFolioDetliqui() != null && this.getMfoFolioDetliqui().longValue() == -999) {
            conditions += " AND MFO_FOLIO_DETLIQUI IS NULL";
        } else if (this.getMfoFolioDetliqui() != null) {
            conditions += " AND MFO_FOLIO_DETLIQUI = ?";
            values.add(this.getMfoFolioDetliqui());
        }

        if (this.getMfoAcuerdo() != null && "null".equals(this.getMfoAcuerdo())) {
            conditions += " AND MFO_ACUERDO IS NULL";
        } else if (this.getMfoAcuerdo() != null) {
            conditions += " AND MFO_ACUERDO = ?";
            values.add(this.getMfoAcuerdo());
        }

        if (this.getMfoConcepto() != null && "null".equals(this.getMfoConcepto())) {
            conditions += " AND MFO_CONCEPTO IS NULL";
        } else if (this.getMfoConcepto() != null) {
            conditions += " AND MFO_CONCEPTO = ?";
            values.add(this.getMfoConcepto());
        }

        if (this.getMfoAnoAltaReg() != null && this.getMfoAnoAltaReg().longValue() == -999) {
            conditions += " AND MFO_ANO_ALTA_REG IS NULL";
        } else if (this.getMfoAnoAltaReg() != null) {
            conditions += " AND MFO_ANO_ALTA_REG = ?";
            values.add(this.getMfoAnoAltaReg());
        }

        if (this.getMfoMesAltaReg() != null && this.getMfoMesAltaReg().longValue() == -999) {
            conditions += " AND MFO_MES_ALTA_REG IS NULL";
        } else if (this.getMfoMesAltaReg() != null) {
            conditions += " AND MFO_MES_ALTA_REG = ?";
            values.add(this.getMfoMesAltaReg());
        }

        if (this.getMfoDiaAltaReg() != null && this.getMfoDiaAltaReg().longValue() == -999) {
            conditions += " AND MFO_DIA_ALTA_REG IS NULL";
        } else if (this.getMfoDiaAltaReg() != null) {
            conditions += " AND MFO_DIA_ALTA_REG = ?";
            values.add(this.getMfoDiaAltaReg());
        }

        if (this.getMfoAnoUltMod() != null && this.getMfoAnoUltMod().longValue() == -999) {
            conditions += " AND MFO_ANO_ULT_MOD IS NULL";
        } else if (this.getMfoAnoUltMod() != null) {
            conditions += " AND MFO_ANO_ULT_MOD = ?";
            values.add(this.getMfoAnoUltMod());
        }

        if (this.getMfoMesUltMod() != null && this.getMfoMesUltMod().longValue() == -999) {
            conditions += " AND MFO_MES_ULT_MOD IS NULL";
        } else if (this.getMfoMesUltMod() != null) {
            conditions += " AND MFO_MES_ULT_MOD = ?";
            values.add(this.getMfoMesUltMod());
        }

        if (this.getMfoDiaUltMod() != null && this.getMfoDiaUltMod().longValue() == -999) {
            conditions += " AND MFO_DIA_ULT_MOD IS NULL";
        } else if (this.getMfoDiaUltMod() != null) {
            conditions += " AND MFO_DIA_ULT_MOD = ?";
            values.add(this.getMfoDiaUltMod());
        }

        if (this.getMfoCveStMovimfo() != null && "null".equals(this.getMfoCveStMovimfo())) {
            conditions += " AND MFO_CVE_ST_MOVIMFO IS NULL";
        } else if (this.getMfoCveStMovimfo() != null) {
            conditions += " AND MFO_CVE_ST_MOVIMFO = ?";
            values.add(this.getMfoCveStMovimfo());
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
        String sql = "UPDATE MOVIMIFOSEG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND MFO_NUM_CTAM = ?";
        pkValues.add(this.getMfoNumCtam());
        conditions += " AND MFO_NUM_SCTA = ?";
        pkValues.add(this.getMfoNumScta());
        conditions += " AND MFO_NUM_SSCTA = ?";
        pkValues.add(this.getMfoNumSscta());
        conditions += " AND MFO_NUM_SSSCTA = ?";
        pkValues.add(this.getMfoNumSsscta());
        conditions += " AND MFO_NUM_SSSSCTA = ?";
        pkValues.add(this.getMfoNumSssscta());
        conditions += " AND MFO_NUM_SSSSSCTA = ?";
        pkValues.add(this.getMfoNumSsssscta());
        conditions += " AND MFO_NUM_AUX1 = ?";
        pkValues.add(this.getMfoNumAux1());
        conditions += " AND MFO_NUM_AUX2 = ?";
        pkValues.add(this.getMfoNumAux2());
        conditions += " AND MFO_NUM_AUX3 = ?";
        pkValues.add(this.getMfoNumAux3());
        conditions += " AND MFO_FOLIO = ?";
        pkValues.add(this.getMfoFolio());
        fields += " MFO_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getMfoFecha());
        fields += " MFO_IMPORTE = ?, ";
        values.add(this.getMfoImporte());
        fields += " MFO_TIPO_OPER = ?, ";
        values.add(this.getMfoTipoOper());
        fields += " MFO_COMPROMETIDO = ?, ";
        values.add(this.getMfoComprometido());
        fields += " MFO_FOLIO_DETLIQUI = ?, ";
        values.add(this.getMfoFolioDetliqui());
        fields += " MFO_ACUERDO = ?, ";
        values.add(this.getMfoAcuerdo());
        fields += " MFO_CONCEPTO = ?, ";
        values.add(this.getMfoConcepto());
        fields += " MFO_ANO_ALTA_REG = ?, ";
        values.add(this.getMfoAnoAltaReg());
        fields += " MFO_MES_ALTA_REG = ?, ";
        values.add(this.getMfoMesAltaReg());
        fields += " MFO_DIA_ALTA_REG = ?, ";
        values.add(this.getMfoDiaAltaReg());
        fields += " MFO_ANO_ULT_MOD = ?, ";
        values.add(this.getMfoAnoUltMod());
        fields += " MFO_MES_ULT_MOD = ?, ";
        values.add(this.getMfoMesUltMod());
        fields += " MFO_DIA_ULT_MOD = ?, ";
        values.add(this.getMfoDiaUltMod());
        fields += " MFO_CVE_ST_MOVIMFO = ?, ";
        values.add(this.getMfoCveStMovimfo());
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
        String sql = "INSERT INTO MOVIMIFOSEG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", MFO_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getMfoNumCtam());

        fields += ", MFO_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getMfoNumScta());

        fields += ", MFO_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getMfoNumSscta());

        fields += ", MFO_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getMfoNumSsscta());

        fields += ", MFO_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getMfoNumSssscta());

        fields += ", MFO_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getMfoNumSsssscta());

        fields += ", MFO_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getMfoNumAux1());

        fields += ", MFO_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getMfoNumAux2());

        fields += ", MFO_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getMfoNumAux3());

        fields += ", MFO_FOLIO";
        fieldValues += ", ?";
        values.add(this.getMfoFolio());

        fields += ", MFO_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getMfoFecha());

        fields += ", MFO_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getMfoImporte());

        fields += ", MFO_TIPO_OPER";
        fieldValues += ", ?";
        values.add(this.getMfoTipoOper());

        fields += ", MFO_COMPROMETIDO";
        fieldValues += ", ?";
        values.add(this.getMfoComprometido());

        fields += ", MFO_FOLIO_DETLIQUI";
        fieldValues += ", ?";
        values.add(this.getMfoFolioDetliqui());

        fields += ", MFO_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getMfoAcuerdo());

        fields += ", MFO_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getMfoConcepto());

        fields += ", MFO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMfoAnoAltaReg());

        fields += ", MFO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMfoMesAltaReg());

        fields += ", MFO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMfoDiaAltaReg());

        fields += ", MFO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMfoAnoUltMod());

        fields += ", MFO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMfoMesUltMod());

        fields += ", MFO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMfoDiaUltMod());

        fields += ", MFO_CVE_ST_MOVIMFO";
        fieldValues += ", ?";
        values.add(this.getMfoCveStMovimfo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM MOVIMIFOSEG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND MFO_NUM_CTAM = ?";
        values.add(this.getMfoNumCtam());
        conditions += " AND MFO_NUM_SCTA = ?";
        values.add(this.getMfoNumScta());
        conditions += " AND MFO_NUM_SSCTA = ?";
        values.add(this.getMfoNumSscta());
        conditions += " AND MFO_NUM_SSSCTA = ?";
        values.add(this.getMfoNumSsscta());
        conditions += " AND MFO_NUM_SSSSCTA = ?";
        values.add(this.getMfoNumSssscta());
        conditions += " AND MFO_NUM_SSSSSCTA = ?";
        values.add(this.getMfoNumSsssscta());
        conditions += " AND MFO_NUM_AUX1 = ?";
        values.add(this.getMfoNumAux1());
        conditions += " AND MFO_NUM_AUX2 = ?";
        values.add(this.getMfoNumAux2());
        conditions += " AND MFO_NUM_AUX3 = ?";
        values.add(this.getMfoNumAux3());
        conditions += " AND MFO_FOLIO = ?";
        values.add(this.getMfoFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Movimifoseg instance = (Movimifoseg) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getMfoNumCtam().equals(instance.getMfoNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getMfoNumScta().equals(instance.getMfoNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getMfoNumSscta().equals(instance.getMfoNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getMfoNumSsscta().equals(instance.getMfoNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getMfoNumSssscta().equals(instance.getMfoNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getMfoNumSsssscta().equals(instance.getMfoNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getMfoNumAux1().equals(instance.getMfoNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getMfoNumAux2().equals(instance.getMfoNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getMfoNumAux3().equals(instance.getMfoNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getMfoFolio().equals(instance.getMfoFolio()))
            equalObjects = false;
        if (equalObjects && !this.getMfoFecha().equals(instance.getMfoFecha()))
            equalObjects = false;
        if (equalObjects && !this.getMfoImporte().equals(instance.getMfoImporte()))
            equalObjects = false;
        if (equalObjects && !this.getMfoTipoOper().equals(instance.getMfoTipoOper()))
            equalObjects = false;
        if (equalObjects && !this.getMfoComprometido().equals(instance.getMfoComprometido()))
            equalObjects = false;
        if (equalObjects && !this.getMfoFolioDetliqui().equals(instance.getMfoFolioDetliqui()))
            equalObjects = false;
        if (equalObjects && !this.getMfoAcuerdo().equals(instance.getMfoAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getMfoConcepto().equals(instance.getMfoConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getMfoAnoAltaReg().equals(instance.getMfoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMfoMesAltaReg().equals(instance.getMfoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMfoDiaAltaReg().equals(instance.getMfoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMfoAnoUltMod().equals(instance.getMfoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMfoMesUltMod().equals(instance.getMfoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMfoDiaUltMod().equals(instance.getMfoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMfoCveStMovimfo().equals(instance.getMfoCveStMovimfo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Movimifoseg result = new Movimifoseg();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setMfoNumCtam((BigDecimal) objectData.getData("MFO_NUM_CTAM"));
        result.setMfoNumScta((BigDecimal) objectData.getData("MFO_NUM_SCTA"));
        result.setMfoNumSscta((BigDecimal) objectData.getData("MFO_NUM_SSCTA"));
        result.setMfoNumSsscta((BigDecimal) objectData.getData("MFO_NUM_SSSCTA"));
        result.setMfoNumSssscta((BigDecimal) objectData.getData("MFO_NUM_SSSSCTA"));
        result.setMfoNumSsssscta((BigDecimal) objectData.getData("MFO_NUM_SSSSSCTA"));
        result.setMfoNumAux1((BigDecimal) objectData.getData("MFO_NUM_AUX1"));
        result.setMfoNumAux2((BigDecimal) objectData.getData("MFO_NUM_AUX2"));
        result.setMfoNumAux3((BigDecimal) objectData.getData("MFO_NUM_AUX3"));
        result.setMfoFolio((BigDecimal) objectData.getData("MFO_FOLIO"));
        result.setMfoFecha((String) objectData.getData("MFO_FECHA"));
        result.setMfoImporte((BigDecimal) objectData.getData("MFO_IMPORTE"));
        result.setMfoTipoOper((String) objectData.getData("MFO_TIPO_OPER"));
        result.setMfoComprometido((String) objectData.getData("MFO_COMPROMETIDO"));
        result.setMfoFolioDetliqui((BigDecimal) objectData.getData("MFO_FOLIO_DETLIQUI"));
        result.setMfoAcuerdo((String) objectData.getData("MFO_ACUERDO"));
        result.setMfoConcepto((String) objectData.getData("MFO_CONCEPTO"));
        result.setMfoAnoAltaReg((BigDecimal) objectData.getData("MFO_ANO_ALTA_REG"));
        result.setMfoMesAltaReg((BigDecimal) objectData.getData("MFO_MES_ALTA_REG"));
        result.setMfoDiaAltaReg((BigDecimal) objectData.getData("MFO_DIA_ALTA_REG"));
        result.setMfoAnoUltMod((BigDecimal) objectData.getData("MFO_ANO_ULT_MOD"));
        result.setMfoMesUltMod((BigDecimal) objectData.getData("MFO_MES_ULT_MOD"));
        result.setMfoDiaUltMod((BigDecimal) objectData.getData("MFO_DIA_ULT_MOD"));
        result.setMfoCveStMovimfo((String) objectData.getData("MFO_CVE_ST_MOVIMFO"));

        return result;

    }

}
