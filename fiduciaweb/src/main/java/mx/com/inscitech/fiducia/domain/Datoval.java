package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DATOVAL_PK", columns = { "DVA_FOLIO_OPERA" }, sequences = { "MAX" })
public class Datoval extends DomainObject {

    BigDecimal dvaFolioOpera = null;
    BigDecimal dvaNumOperacion = null;
    BigDecimal dvaNumTransac = null;
    String dvaCveAplicaD1 = null;
    BigDecimal dvaImpDato1 = null;
    String dvaCveAplicaD2 = null;
    BigDecimal dvaImpDato2 = null;
    String dvaCveAplicaD3 = null;
    BigDecimal dvaImpDato3 = null;
    String dvaCveAplicaD4 = null;
    BigDecimal dvaImpDato4 = null;
    String dvaCveAplicaD5 = null;
    BigDecimal dvaImpDato5 = null;
    String dvaCveAplicaD6 = null;
    BigDecimal dvaNumDato6 = null;
    String dvaCveAplicaD7 = null;
    BigDecimal dvaNumDato7 = null;
    String dvaCveAplicaD8 = null;
    BigDecimal dvaNumDato8 = null;
    String dvaCveAplicaD9 = null;
    BigDecimal dvaPjeDato9 = null;
    String dvaCveAplicaD10 = null;
    BigDecimal dvaPjeDato10 = null;
    String dvaCveAplicaD11 = null;
    BigDecimal dvaPjeDato11 = null;
    String dvaCveAplicaD12 = null;
    BigDecimal dvaPjeDato12 = null;
    String dvaCveAplicaD13 = null;
    BigDecimal dvaPjeDato13 = null;
    String dvaCveAplicaD14 = null;
    BigDecimal dvaPjeDato14 = null;
    String dvaCveAplicaD15 = null;
    BigDecimal dvaPjeDato15 = null;
    String dvaCveAplicaD16 = null;
    BigDecimal dvaPjeDato16 = null;
    String dvaCveAplicaD17 = null;
    BigDecimal dvaPjeDato17 = null;
    String dvaCveAplicaD18 = null;
    BigDecimal dvaPjeDato18 = null;
    String dvaCveAplicaD19 = null;
    BigDecimal dvaPjeDato19 = null;
    String dvaCveAplicaD20 = null;
    BigDecimal dvaPjeDato20 = null;
    String dvaFecMovto = null;
    BigDecimal dvaAnoAltaReg = null;
    BigDecimal dvaMesAltaReg = null;
    BigDecimal dvaDiaAltaReg = null;
    BigDecimal dvaAnoUltMod = null;
    BigDecimal dvaMesUltMod = null;
    BigDecimal dvaDiaUltMod = null;
    String dvaCveStDatoval = null;

    public Datoval() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDvaFolioOpera(BigDecimal dvaFolioOpera) {
        this.dvaFolioOpera = dvaFolioOpera;
    }

    public BigDecimal getDvaFolioOpera() {
        return this.dvaFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setDvaNumOperacion(BigDecimal dvaNumOperacion) {
        this.dvaNumOperacion = dvaNumOperacion;
    }

    public BigDecimal getDvaNumOperacion() {
        return this.dvaNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDvaNumTransac(BigDecimal dvaNumTransac) {
        this.dvaNumTransac = dvaNumTransac;
    }

    public BigDecimal getDvaNumTransac() {
        return this.dvaNumTransac;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD1(String dvaCveAplicaD1) {
        this.dvaCveAplicaD1 = dvaCveAplicaD1;
    }

    public String getDvaCveAplicaD1() {
        return this.dvaCveAplicaD1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaImpDato1(BigDecimal dvaImpDato1) {
        this.dvaImpDato1 = dvaImpDato1;
    }

    public BigDecimal getDvaImpDato1() {
        return this.dvaImpDato1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD2(String dvaCveAplicaD2) {
        this.dvaCveAplicaD2 = dvaCveAplicaD2;
    }

    public String getDvaCveAplicaD2() {
        return this.dvaCveAplicaD2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaImpDato2(BigDecimal dvaImpDato2) {
        this.dvaImpDato2 = dvaImpDato2;
    }

    public BigDecimal getDvaImpDato2() {
        return this.dvaImpDato2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD3(String dvaCveAplicaD3) {
        this.dvaCveAplicaD3 = dvaCveAplicaD3;
    }

    public String getDvaCveAplicaD3() {
        return this.dvaCveAplicaD3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaImpDato3(BigDecimal dvaImpDato3) {
        this.dvaImpDato3 = dvaImpDato3;
    }

    public BigDecimal getDvaImpDato3() {
        return this.dvaImpDato3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD4(String dvaCveAplicaD4) {
        this.dvaCveAplicaD4 = dvaCveAplicaD4;
    }

    public String getDvaCveAplicaD4() {
        return this.dvaCveAplicaD4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaImpDato4(BigDecimal dvaImpDato4) {
        this.dvaImpDato4 = dvaImpDato4;
    }

    public BigDecimal getDvaImpDato4() {
        return this.dvaImpDato4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD5(String dvaCveAplicaD5) {
        this.dvaCveAplicaD5 = dvaCveAplicaD5;
    }

    public String getDvaCveAplicaD5() {
        return this.dvaCveAplicaD5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaImpDato5(BigDecimal dvaImpDato5) {
        this.dvaImpDato5 = dvaImpDato5;
    }

    public BigDecimal getDvaImpDato5() {
        return this.dvaImpDato5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD6(String dvaCveAplicaD6) {
        this.dvaCveAplicaD6 = dvaCveAplicaD6;
    }

    public String getDvaCveAplicaD6() {
        return this.dvaCveAplicaD6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaNumDato6(BigDecimal dvaNumDato6) {
        this.dvaNumDato6 = dvaNumDato6;
    }

    public BigDecimal getDvaNumDato6() {
        return this.dvaNumDato6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD7(String dvaCveAplicaD7) {
        this.dvaCveAplicaD7 = dvaCveAplicaD7;
    }

    public String getDvaCveAplicaD7() {
        return this.dvaCveAplicaD7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaNumDato7(BigDecimal dvaNumDato7) {
        this.dvaNumDato7 = dvaNumDato7;
    }

    public BigDecimal getDvaNumDato7() {
        return this.dvaNumDato7;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD8(String dvaCveAplicaD8) {
        this.dvaCveAplicaD8 = dvaCveAplicaD8;
    }

    public String getDvaCveAplicaD8() {
        return this.dvaCveAplicaD8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaNumDato8(BigDecimal dvaNumDato8) {
        this.dvaNumDato8 = dvaNumDato8;
    }

    public BigDecimal getDvaNumDato8() {
        return this.dvaNumDato8;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD9(String dvaCveAplicaD9) {
        this.dvaCveAplicaD9 = dvaCveAplicaD9;
    }

    public String getDvaCveAplicaD9() {
        return this.dvaCveAplicaD9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 24, scale = 8, javaClass = BigDecimal.class)
    public void setDvaPjeDato9(BigDecimal dvaPjeDato9) {
        this.dvaPjeDato9 = dvaPjeDato9;
    }

    public BigDecimal getDvaPjeDato9() {
        return this.dvaPjeDato9;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD10(String dvaCveAplicaD10) {
        this.dvaCveAplicaD10 = dvaCveAplicaD10;
    }

    public String getDvaCveAplicaD10() {
        return this.dvaCveAplicaD10;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 30, scale = 8, javaClass = BigDecimal.class)
    public void setDvaPjeDato10(BigDecimal dvaPjeDato10) {
        this.dvaPjeDato10 = dvaPjeDato10;
    }

    public BigDecimal getDvaPjeDato10() {
        return this.dvaPjeDato10;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD11(String dvaCveAplicaD11) {
        this.dvaCveAplicaD11 = dvaCveAplicaD11;
    }

    public String getDvaCveAplicaD11() {
        return this.dvaCveAplicaD11;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato11(BigDecimal dvaPjeDato11) {
        this.dvaPjeDato11 = dvaPjeDato11;
    }

    public BigDecimal getDvaPjeDato11() {
        return this.dvaPjeDato11;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD12(String dvaCveAplicaD12) {
        this.dvaCveAplicaD12 = dvaCveAplicaD12;
    }

    public String getDvaCveAplicaD12() {
        return this.dvaCveAplicaD12;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato12(BigDecimal dvaPjeDato12) {
        this.dvaPjeDato12 = dvaPjeDato12;
    }

    public BigDecimal getDvaPjeDato12() {
        return this.dvaPjeDato12;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD13(String dvaCveAplicaD13) {
        this.dvaCveAplicaD13 = dvaCveAplicaD13;
    }

    public String getDvaCveAplicaD13() {
        return this.dvaCveAplicaD13;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato13(BigDecimal dvaPjeDato13) {
        this.dvaPjeDato13 = dvaPjeDato13;
    }

    public BigDecimal getDvaPjeDato13() {
        return this.dvaPjeDato13;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD14(String dvaCveAplicaD14) {
        this.dvaCveAplicaD14 = dvaCveAplicaD14;
    }

    public String getDvaCveAplicaD14() {
        return this.dvaCveAplicaD14;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato14(BigDecimal dvaPjeDato14) {
        this.dvaPjeDato14 = dvaPjeDato14;
    }

    public BigDecimal getDvaPjeDato14() {
        return this.dvaPjeDato14;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD15(String dvaCveAplicaD15) {
        this.dvaCveAplicaD15 = dvaCveAplicaD15;
    }

    public String getDvaCveAplicaD15() {
        return this.dvaCveAplicaD15;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 24, scale = 8, javaClass = BigDecimal.class)
    public void setDvaPjeDato15(BigDecimal dvaPjeDato15) {
        this.dvaPjeDato15 = dvaPjeDato15;
    }

    public BigDecimal getDvaPjeDato15() {
        return this.dvaPjeDato15;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD16(String dvaCveAplicaD16) {
        this.dvaCveAplicaD16 = dvaCveAplicaD16;
    }

    public String getDvaCveAplicaD16() {
        return this.dvaCveAplicaD16;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato16(BigDecimal dvaPjeDato16) {
        this.dvaPjeDato16 = dvaPjeDato16;
    }

    public BigDecimal getDvaPjeDato16() {
        return this.dvaPjeDato16;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD17(String dvaCveAplicaD17) {
        this.dvaCveAplicaD17 = dvaCveAplicaD17;
    }

    public String getDvaCveAplicaD17() {
        return this.dvaCveAplicaD17;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato17(BigDecimal dvaPjeDato17) {
        this.dvaPjeDato17 = dvaPjeDato17;
    }

    public BigDecimal getDvaPjeDato17() {
        return this.dvaPjeDato17;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD18(String dvaCveAplicaD18) {
        this.dvaCveAplicaD18 = dvaCveAplicaD18;
    }

    public String getDvaCveAplicaD18() {
        return this.dvaCveAplicaD18;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato18(BigDecimal dvaPjeDato18) {
        this.dvaPjeDato18 = dvaPjeDato18;
    }

    public BigDecimal getDvaPjeDato18() {
        return this.dvaPjeDato18;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD19(String dvaCveAplicaD19) {
        this.dvaCveAplicaD19 = dvaCveAplicaD19;
    }

    public String getDvaCveAplicaD19() {
        return this.dvaCveAplicaD19;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato19(BigDecimal dvaPjeDato19) {
        this.dvaPjeDato19 = dvaPjeDato19;
    }

    public BigDecimal getDvaPjeDato19() {
        return this.dvaPjeDato19;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveAplicaD20(String dvaCveAplicaD20) {
        this.dvaCveAplicaD20 = dvaCveAplicaD20;
    }

    public String getDvaCveAplicaD20() {
        return this.dvaCveAplicaD20;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDvaPjeDato20(BigDecimal dvaPjeDato20) {
        this.dvaPjeDato20 = dvaPjeDato20;
    }

    public BigDecimal getDvaPjeDato20() {
        return this.dvaPjeDato20;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaFecMovto(String dvaFecMovto) {
        this.dvaFecMovto = dvaFecMovto;
    }

    public String getDvaFecMovto() {
        return this.dvaFecMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDvaAnoAltaReg(BigDecimal dvaAnoAltaReg) {
        this.dvaAnoAltaReg = dvaAnoAltaReg;
    }

    public BigDecimal getDvaAnoAltaReg() {
        return this.dvaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDvaMesAltaReg(BigDecimal dvaMesAltaReg) {
        this.dvaMesAltaReg = dvaMesAltaReg;
    }

    public BigDecimal getDvaMesAltaReg() {
        return this.dvaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDvaDiaAltaReg(BigDecimal dvaDiaAltaReg) {
        this.dvaDiaAltaReg = dvaDiaAltaReg;
    }

    public BigDecimal getDvaDiaAltaReg() {
        return this.dvaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDvaAnoUltMod(BigDecimal dvaAnoUltMod) {
        this.dvaAnoUltMod = dvaAnoUltMod;
    }

    public BigDecimal getDvaAnoUltMod() {
        return this.dvaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDvaMesUltMod(BigDecimal dvaMesUltMod) {
        this.dvaMesUltMod = dvaMesUltMod;
    }

    public BigDecimal getDvaMesUltMod() {
        return this.dvaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDvaDiaUltMod(BigDecimal dvaDiaUltMod) {
        this.dvaDiaUltMod = dvaDiaUltMod;
    }

    public BigDecimal getDvaDiaUltMod() {
        return this.dvaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvaCveStDatoval(String dvaCveStDatoval) {
        this.dvaCveStDatoval = dvaCveStDatoval;
    }

    public String getDvaCveStDatoval() {
        return this.dvaCveStDatoval;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DATOVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDvaFolioOpera() != null && this.getDvaFolioOpera().longValue() == -999) {
            conditions += " AND DVA_FOLIO_OPERA IS NULL";
        } else if (this.getDvaFolioOpera() != null) {
            conditions += " AND DVA_FOLIO_OPERA = ?";
            values.add(this.getDvaFolioOpera());
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
        String sql = "SELECT * FROM DATOVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDvaFolioOpera() != null && this.getDvaFolioOpera().longValue() == -999) {
            conditions += " AND DVA_FOLIO_OPERA IS NULL";
        } else if (this.getDvaFolioOpera() != null) {
            conditions += " AND DVA_FOLIO_OPERA = ?";
            values.add(this.getDvaFolioOpera());
        }

        if (this.getDvaNumOperacion() != null && this.getDvaNumOperacion().longValue() == -999) {
            conditions += " AND DVA_NUM_OPERACION IS NULL";
        } else if (this.getDvaNumOperacion() != null) {
            conditions += " AND DVA_NUM_OPERACION = ?";
            values.add(this.getDvaNumOperacion());
        }

        if (this.getDvaNumTransac() != null && this.getDvaNumTransac().longValue() == -999) {
            conditions += " AND DVA_NUM_TRANSAC IS NULL";
        } else if (this.getDvaNumTransac() != null) {
            conditions += " AND DVA_NUM_TRANSAC = ?";
            values.add(this.getDvaNumTransac());
        }

        if (this.getDvaCveAplicaD1() != null && "null".equals(this.getDvaCveAplicaD1())) {
            conditions += " AND DVA_CVE_APLICA_D1 IS NULL";
        } else if (this.getDvaCveAplicaD1() != null) {
            conditions += " AND DVA_CVE_APLICA_D1 = ?";
            values.add(this.getDvaCveAplicaD1());
        }

        if (this.getDvaImpDato1() != null && this.getDvaImpDato1().longValue() == -999) {
            conditions += " AND DVA_IMP_DATO1 IS NULL";
        } else if (this.getDvaImpDato1() != null) {
            conditions += " AND DVA_IMP_DATO1 = ?";
            values.add(this.getDvaImpDato1());
        }

        if (this.getDvaCveAplicaD2() != null && "null".equals(this.getDvaCveAplicaD2())) {
            conditions += " AND DVA_CVE_APLICA_D2 IS NULL";
        } else if (this.getDvaCveAplicaD2() != null) {
            conditions += " AND DVA_CVE_APLICA_D2 = ?";
            values.add(this.getDvaCveAplicaD2());
        }

        if (this.getDvaImpDato2() != null && this.getDvaImpDato2().longValue() == -999) {
            conditions += " AND DVA_IMP_DATO2 IS NULL";
        } else if (this.getDvaImpDato2() != null) {
            conditions += " AND DVA_IMP_DATO2 = ?";
            values.add(this.getDvaImpDato2());
        }

        if (this.getDvaCveAplicaD3() != null && "null".equals(this.getDvaCveAplicaD3())) {
            conditions += " AND DVA_CVE_APLICA_D3 IS NULL";
        } else if (this.getDvaCveAplicaD3() != null) {
            conditions += " AND DVA_CVE_APLICA_D3 = ?";
            values.add(this.getDvaCveAplicaD3());
        }

        if (this.getDvaImpDato3() != null && this.getDvaImpDato3().longValue() == -999) {
            conditions += " AND DVA_IMP_DATO3 IS NULL";
        } else if (this.getDvaImpDato3() != null) {
            conditions += " AND DVA_IMP_DATO3 = ?";
            values.add(this.getDvaImpDato3());
        }

        if (this.getDvaCveAplicaD4() != null && "null".equals(this.getDvaCveAplicaD4())) {
            conditions += " AND DVA_CVE_APLICA_D4 IS NULL";
        } else if (this.getDvaCveAplicaD4() != null) {
            conditions += " AND DVA_CVE_APLICA_D4 = ?";
            values.add(this.getDvaCveAplicaD4());
        }

        if (this.getDvaImpDato4() != null && this.getDvaImpDato4().longValue() == -999) {
            conditions += " AND DVA_IMP_DATO4 IS NULL";
        } else if (this.getDvaImpDato4() != null) {
            conditions += " AND DVA_IMP_DATO4 = ?";
            values.add(this.getDvaImpDato4());
        }

        if (this.getDvaCveAplicaD5() != null && "null".equals(this.getDvaCveAplicaD5())) {
            conditions += " AND DVA_CVE_APLICA_D5 IS NULL";
        } else if (this.getDvaCveAplicaD5() != null) {
            conditions += " AND DVA_CVE_APLICA_D5 = ?";
            values.add(this.getDvaCveAplicaD5());
        }

        if (this.getDvaImpDato5() != null && this.getDvaImpDato5().longValue() == -999) {
            conditions += " AND DVA_IMP_DATO5 IS NULL";
        } else if (this.getDvaImpDato5() != null) {
            conditions += " AND DVA_IMP_DATO5 = ?";
            values.add(this.getDvaImpDato5());
        }

        if (this.getDvaCveAplicaD6() != null && "null".equals(this.getDvaCveAplicaD6())) {
            conditions += " AND DVA_CVE_APLICA_D6 IS NULL";
        } else if (this.getDvaCveAplicaD6() != null) {
            conditions += " AND DVA_CVE_APLICA_D6 = ?";
            values.add(this.getDvaCveAplicaD6());
        }

        if (this.getDvaNumDato6() != null && this.getDvaNumDato6().longValue() == -999) {
            conditions += " AND DVA_NUM_DATO6 IS NULL";
        } else if (this.getDvaNumDato6() != null) {
            conditions += " AND DVA_NUM_DATO6 = ?";
            values.add(this.getDvaNumDato6());
        }

        if (this.getDvaCveAplicaD7() != null && "null".equals(this.getDvaCveAplicaD7())) {
            conditions += " AND DVA_CVE_APLICA_D7 IS NULL";
        } else if (this.getDvaCveAplicaD7() != null) {
            conditions += " AND DVA_CVE_APLICA_D7 = ?";
            values.add(this.getDvaCveAplicaD7());
        }

        if (this.getDvaNumDato7() != null && this.getDvaNumDato7().longValue() == -999) {
            conditions += " AND DVA_NUM_DATO7 IS NULL";
        } else if (this.getDvaNumDato7() != null) {
            conditions += " AND DVA_NUM_DATO7 = ?";
            values.add(this.getDvaNumDato7());
        }

        if (this.getDvaCveAplicaD8() != null && "null".equals(this.getDvaCveAplicaD8())) {
            conditions += " AND DVA_CVE_APLICA_D8 IS NULL";
        } else if (this.getDvaCveAplicaD8() != null) {
            conditions += " AND DVA_CVE_APLICA_D8 = ?";
            values.add(this.getDvaCveAplicaD8());
        }

        if (this.getDvaNumDato8() != null && this.getDvaNumDato8().longValue() == -999) {
            conditions += " AND DVA_NUM_DATO8 IS NULL";
        } else if (this.getDvaNumDato8() != null) {
            conditions += " AND DVA_NUM_DATO8 = ?";
            values.add(this.getDvaNumDato8());
        }

        if (this.getDvaCveAplicaD9() != null && "null".equals(this.getDvaCveAplicaD9())) {
            conditions += " AND DVA_CVE_APLICA_D9 IS NULL";
        } else if (this.getDvaCveAplicaD9() != null) {
            conditions += " AND DVA_CVE_APLICA_D9 = ?";
            values.add(this.getDvaCveAplicaD9());
        }

        if (this.getDvaPjeDato9() != null && this.getDvaPjeDato9().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO9 IS NULL";
        } else if (this.getDvaPjeDato9() != null) {
            conditions += " AND DVA_PJE_DATO9 = ?";
            values.add(this.getDvaPjeDato9());
        }

        if (this.getDvaCveAplicaD10() != null && "null".equals(this.getDvaCveAplicaD10())) {
            conditions += " AND DVA_CVE_APLICA_D10 IS NULL";
        } else if (this.getDvaCveAplicaD10() != null) {
            conditions += " AND DVA_CVE_APLICA_D10 = ?";
            values.add(this.getDvaCveAplicaD10());
        }

        if (this.getDvaPjeDato10() != null && this.getDvaPjeDato10().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO10 IS NULL";
        } else if (this.getDvaPjeDato10() != null) {
            conditions += " AND DVA_PJE_DATO10 = ?";
            values.add(this.getDvaPjeDato10());
        }

        if (this.getDvaCveAplicaD11() != null && "null".equals(this.getDvaCveAplicaD11())) {
            conditions += " AND DVA_CVE_APLICA_D11 IS NULL";
        } else if (this.getDvaCveAplicaD11() != null) {
            conditions += " AND DVA_CVE_APLICA_D11 = ?";
            values.add(this.getDvaCveAplicaD11());
        }

        if (this.getDvaPjeDato11() != null && this.getDvaPjeDato11().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO11 IS NULL";
        } else if (this.getDvaPjeDato11() != null) {
            conditions += " AND DVA_PJE_DATO11 = ?";
            values.add(this.getDvaPjeDato11());
        }

        if (this.getDvaCveAplicaD12() != null && "null".equals(this.getDvaCveAplicaD12())) {
            conditions += " AND DVA_CVE_APLICA_D12 IS NULL";
        } else if (this.getDvaCveAplicaD12() != null) {
            conditions += " AND DVA_CVE_APLICA_D12 = ?";
            values.add(this.getDvaCveAplicaD12());
        }

        if (this.getDvaPjeDato12() != null && this.getDvaPjeDato12().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO12 IS NULL";
        } else if (this.getDvaPjeDato12() != null) {
            conditions += " AND DVA_PJE_DATO12 = ?";
            values.add(this.getDvaPjeDato12());
        }

        if (this.getDvaCveAplicaD13() != null && "null".equals(this.getDvaCveAplicaD13())) {
            conditions += " AND DVA_CVE_APLICA_D13 IS NULL";
        } else if (this.getDvaCveAplicaD13() != null) {
            conditions += " AND DVA_CVE_APLICA_D13 = ?";
            values.add(this.getDvaCveAplicaD13());
        }

        if (this.getDvaPjeDato13() != null && this.getDvaPjeDato13().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO13 IS NULL";
        } else if (this.getDvaPjeDato13() != null) {
            conditions += " AND DVA_PJE_DATO13 = ?";
            values.add(this.getDvaPjeDato13());
        }

        if (this.getDvaCveAplicaD14() != null && "null".equals(this.getDvaCveAplicaD14())) {
            conditions += " AND DVA_CVE_APLICA_D14 IS NULL";
        } else if (this.getDvaCveAplicaD14() != null) {
            conditions += " AND DVA_CVE_APLICA_D14 = ?";
            values.add(this.getDvaCveAplicaD14());
        }

        if (this.getDvaPjeDato14() != null && this.getDvaPjeDato14().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO14 IS NULL";
        } else if (this.getDvaPjeDato14() != null) {
            conditions += " AND DVA_PJE_DATO14 = ?";
            values.add(this.getDvaPjeDato14());
        }

        if (this.getDvaCveAplicaD15() != null && "null".equals(this.getDvaCveAplicaD15())) {
            conditions += " AND DVA_CVE_APLICA_D15 IS NULL";
        } else if (this.getDvaCveAplicaD15() != null) {
            conditions += " AND DVA_CVE_APLICA_D15 = ?";
            values.add(this.getDvaCveAplicaD15());
        }

        if (this.getDvaPjeDato15() != null && this.getDvaPjeDato15().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO15 IS NULL";
        } else if (this.getDvaPjeDato15() != null) {
            conditions += " AND DVA_PJE_DATO15 = ?";
            values.add(this.getDvaPjeDato15());
        }

        if (this.getDvaCveAplicaD16() != null && "null".equals(this.getDvaCveAplicaD16())) {
            conditions += " AND DVA_CVE_APLICA_D16 IS NULL";
        } else if (this.getDvaCveAplicaD16() != null) {
            conditions += " AND DVA_CVE_APLICA_D16 = ?";
            values.add(this.getDvaCveAplicaD16());
        }

        if (this.getDvaPjeDato16() != null && this.getDvaPjeDato16().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO16 IS NULL";
        } else if (this.getDvaPjeDato16() != null) {
            conditions += " AND DVA_PJE_DATO16 = ?";
            values.add(this.getDvaPjeDato16());
        }

        if (this.getDvaCveAplicaD17() != null && "null".equals(this.getDvaCveAplicaD17())) {
            conditions += " AND DVA_CVE_APLICA_D17 IS NULL";
        } else if (this.getDvaCveAplicaD17() != null) {
            conditions += " AND DVA_CVE_APLICA_D17 = ?";
            values.add(this.getDvaCveAplicaD17());
        }

        if (this.getDvaPjeDato17() != null && this.getDvaPjeDato17().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO17 IS NULL";
        } else if (this.getDvaPjeDato17() != null) {
            conditions += " AND DVA_PJE_DATO17 = ?";
            values.add(this.getDvaPjeDato17());
        }

        if (this.getDvaCveAplicaD18() != null && "null".equals(this.getDvaCveAplicaD18())) {
            conditions += " AND DVA_CVE_APLICA_D18 IS NULL";
        } else if (this.getDvaCveAplicaD18() != null) {
            conditions += " AND DVA_CVE_APLICA_D18 = ?";
            values.add(this.getDvaCveAplicaD18());
        }

        if (this.getDvaPjeDato18() != null && this.getDvaPjeDato18().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO18 IS NULL";
        } else if (this.getDvaPjeDato18() != null) {
            conditions += " AND DVA_PJE_DATO18 = ?";
            values.add(this.getDvaPjeDato18());
        }

        if (this.getDvaCveAplicaD19() != null && "null".equals(this.getDvaCveAplicaD19())) {
            conditions += " AND DVA_CVE_APLICA_D19 IS NULL";
        } else if (this.getDvaCveAplicaD19() != null) {
            conditions += " AND DVA_CVE_APLICA_D19 = ?";
            values.add(this.getDvaCveAplicaD19());
        }

        if (this.getDvaPjeDato19() != null && this.getDvaPjeDato19().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO19 IS NULL";
        } else if (this.getDvaPjeDato19() != null) {
            conditions += " AND DVA_PJE_DATO19 = ?";
            values.add(this.getDvaPjeDato19());
        }

        if (this.getDvaCveAplicaD20() != null && "null".equals(this.getDvaCveAplicaD20())) {
            conditions += " AND DVA_CVE_APLICA_D20 IS NULL";
        } else if (this.getDvaCveAplicaD20() != null) {
            conditions += " AND DVA_CVE_APLICA_D20 = ?";
            values.add(this.getDvaCveAplicaD20());
        }

        if (this.getDvaPjeDato20() != null && this.getDvaPjeDato20().longValue() == -999) {
            conditions += " AND DVA_PJE_DATO20 IS NULL";
        } else if (this.getDvaPjeDato20() != null) {
            conditions += " AND DVA_PJE_DATO20 = ?";
            values.add(this.getDvaPjeDato20());
        }

        if (this.getDvaFecMovto() != null && "null".equals(this.getDvaFecMovto())) {
            conditions += " AND DVA_FEC_MOVTO IS NULL";
        } else if (this.getDvaFecMovto() != null) {
            conditions += " AND DVA_FEC_MOVTO = ?";
            values.add(this.getDvaFecMovto());
        }

        if (this.getDvaAnoAltaReg() != null && this.getDvaAnoAltaReg().longValue() == -999) {
            conditions += " AND DVA_ANO_ALTA_REG IS NULL";
        } else if (this.getDvaAnoAltaReg() != null) {
            conditions += " AND DVA_ANO_ALTA_REG = ?";
            values.add(this.getDvaAnoAltaReg());
        }

        if (this.getDvaMesAltaReg() != null && this.getDvaMesAltaReg().longValue() == -999) {
            conditions += " AND DVA_MES_ALTA_REG IS NULL";
        } else if (this.getDvaMesAltaReg() != null) {
            conditions += " AND DVA_MES_ALTA_REG = ?";
            values.add(this.getDvaMesAltaReg());
        }

        if (this.getDvaDiaAltaReg() != null && this.getDvaDiaAltaReg().longValue() == -999) {
            conditions += " AND DVA_DIA_ALTA_REG IS NULL";
        } else if (this.getDvaDiaAltaReg() != null) {
            conditions += " AND DVA_DIA_ALTA_REG = ?";
            values.add(this.getDvaDiaAltaReg());
        }

        if (this.getDvaAnoUltMod() != null && this.getDvaAnoUltMod().longValue() == -999) {
            conditions += " AND DVA_ANO_ULT_MOD IS NULL";
        } else if (this.getDvaAnoUltMod() != null) {
            conditions += " AND DVA_ANO_ULT_MOD = ?";
            values.add(this.getDvaAnoUltMod());
        }

        if (this.getDvaMesUltMod() != null && this.getDvaMesUltMod().longValue() == -999) {
            conditions += " AND DVA_MES_ULT_MOD IS NULL";
        } else if (this.getDvaMesUltMod() != null) {
            conditions += " AND DVA_MES_ULT_MOD = ?";
            values.add(this.getDvaMesUltMod());
        }

        if (this.getDvaDiaUltMod() != null && this.getDvaDiaUltMod().longValue() == -999) {
            conditions += " AND DVA_DIA_ULT_MOD IS NULL";
        } else if (this.getDvaDiaUltMod() != null) {
            conditions += " AND DVA_DIA_ULT_MOD = ?";
            values.add(this.getDvaDiaUltMod());
        }

        if (this.getDvaCveStDatoval() != null && "null".equals(this.getDvaCveStDatoval())) {
            conditions += " AND DVA_CVE_ST_DATOVAL IS NULL";
        } else if (this.getDvaCveStDatoval() != null) {
            conditions += " AND DVA_CVE_ST_DATOVAL = ?";
            values.add(this.getDvaCveStDatoval());
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
        String sql = "UPDATE DATOVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DVA_FOLIO_OPERA = ?";
        pkValues.add(this.getDvaFolioOpera());
        fields += " DVA_NUM_OPERACION = ?, ";
        values.add(this.getDvaNumOperacion());
        fields += " DVA_NUM_TRANSAC = ?, ";
        values.add(this.getDvaNumTransac());
        fields += " DVA_CVE_APLICA_D1 = ?, ";
        values.add(this.getDvaCveAplicaD1());
        fields += " DVA_IMP_DATO1 = ?, ";
        values.add(this.getDvaImpDato1());
        fields += " DVA_CVE_APLICA_D2 = ?, ";
        values.add(this.getDvaCveAplicaD2());
        fields += " DVA_IMP_DATO2 = ?, ";
        values.add(this.getDvaImpDato2());
        fields += " DVA_CVE_APLICA_D3 = ?, ";
        values.add(this.getDvaCveAplicaD3());
        fields += " DVA_IMP_DATO3 = ?, ";
        values.add(this.getDvaImpDato3());
        fields += " DVA_CVE_APLICA_D4 = ?, ";
        values.add(this.getDvaCveAplicaD4());
        fields += " DVA_IMP_DATO4 = ?, ";
        values.add(this.getDvaImpDato4());
        fields += " DVA_CVE_APLICA_D5 = ?, ";
        values.add(this.getDvaCveAplicaD5());
        fields += " DVA_IMP_DATO5 = ?, ";
        values.add(this.getDvaImpDato5());
        fields += " DVA_CVE_APLICA_D6 = ?, ";
        values.add(this.getDvaCveAplicaD6());
        fields += " DVA_NUM_DATO6 = ?, ";
        values.add(this.getDvaNumDato6());
        fields += " DVA_CVE_APLICA_D7 = ?, ";
        values.add(this.getDvaCveAplicaD7());
        fields += " DVA_NUM_DATO7 = ?, ";
        values.add(this.getDvaNumDato7());
        fields += " DVA_CVE_APLICA_D8 = ?, ";
        values.add(this.getDvaCveAplicaD8());
        fields += " DVA_NUM_DATO8 = ?, ";
        values.add(this.getDvaNumDato8());
        fields += " DVA_CVE_APLICA_D9 = ?, ";
        values.add(this.getDvaCveAplicaD9());
        fields += " DVA_PJE_DATO9 = ?, ";
        values.add(this.getDvaPjeDato9());
        fields += " DVA_CVE_APLICA_D10 = ?, ";
        values.add(this.getDvaCveAplicaD10());
        fields += " DVA_PJE_DATO10 = ?, ";
        values.add(this.getDvaPjeDato10());
        fields += " DVA_CVE_APLICA_D11 = ?, ";
        values.add(this.getDvaCveAplicaD11());
        fields += " DVA_PJE_DATO11 = ?, ";
        values.add(this.getDvaPjeDato11());
        fields += " DVA_CVE_APLICA_D12 = ?, ";
        values.add(this.getDvaCveAplicaD12());
        fields += " DVA_PJE_DATO12 = ?, ";
        values.add(this.getDvaPjeDato12());
        fields += " DVA_CVE_APLICA_D13 = ?, ";
        values.add(this.getDvaCveAplicaD13());
        fields += " DVA_PJE_DATO13 = ?, ";
        values.add(this.getDvaPjeDato13());
        fields += " DVA_CVE_APLICA_D14 = ?, ";
        values.add(this.getDvaCveAplicaD14());
        fields += " DVA_PJE_DATO14 = ?, ";
        values.add(this.getDvaPjeDato14());
        fields += " DVA_CVE_APLICA_D15 = ?, ";
        values.add(this.getDvaCveAplicaD15());
        fields += " DVA_PJE_DATO15 = ?, ";
        values.add(this.getDvaPjeDato15());
        fields += " DVA_CVE_APLICA_D16 = ?, ";
        values.add(this.getDvaCveAplicaD16());
        fields += " DVA_PJE_DATO16 = ?, ";
        values.add(this.getDvaPjeDato16());
        fields += " DVA_CVE_APLICA_D17 = ?, ";
        values.add(this.getDvaCveAplicaD17());
        fields += " DVA_PJE_DATO17 = ?, ";
        values.add(this.getDvaPjeDato17());
        fields += " DVA_CVE_APLICA_D18 = ?, ";
        values.add(this.getDvaCveAplicaD18());
        fields += " DVA_PJE_DATO18 = ?, ";
        values.add(this.getDvaPjeDato18());
        fields += " DVA_CVE_APLICA_D19 = ?, ";
        values.add(this.getDvaCveAplicaD19());
        fields += " DVA_PJE_DATO19 = ?, ";
        values.add(this.getDvaPjeDato19());
        fields += " DVA_CVE_APLICA_D20 = ?, ";
        values.add(this.getDvaCveAplicaD20());
        fields += " DVA_PJE_DATO20 = ?, ";
        values.add(this.getDvaPjeDato20());
        fields += " DVA_FEC_MOVTO = ?, ";
        values.add(this.getDvaFecMovto());
        fields += " DVA_ANO_ALTA_REG = ?, ";
        values.add(this.getDvaAnoAltaReg());
        fields += " DVA_MES_ALTA_REG = ?, ";
        values.add(this.getDvaMesAltaReg());
        fields += " DVA_DIA_ALTA_REG = ?, ";
        values.add(this.getDvaDiaAltaReg());
        fields += " DVA_ANO_ULT_MOD = ?, ";
        values.add(this.getDvaAnoUltMod());
        fields += " DVA_MES_ULT_MOD = ?, ";
        values.add(this.getDvaMesUltMod());
        fields += " DVA_DIA_ULT_MOD = ?, ";
        values.add(this.getDvaDiaUltMod());
        fields += " DVA_CVE_ST_DATOVAL = ?, ";
        values.add(this.getDvaCveStDatoval());
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
        String sql = "INSERT INTO DATOVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DVA_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDvaFolioOpera());

        fields += ", DVA_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getDvaNumOperacion());

        fields += ", DVA_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getDvaNumTransac());

        fields += ", DVA_CVE_APLICA_D1";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD1());

        fields += ", DVA_IMP_DATO1";
        fieldValues += ", ?";
        values.add(this.getDvaImpDato1());

        fields += ", DVA_CVE_APLICA_D2";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD2());

        fields += ", DVA_IMP_DATO2";
        fieldValues += ", ?";
        values.add(this.getDvaImpDato2());

        fields += ", DVA_CVE_APLICA_D3";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD3());

        fields += ", DVA_IMP_DATO3";
        fieldValues += ", ?";
        values.add(this.getDvaImpDato3());

        fields += ", DVA_CVE_APLICA_D4";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD4());

        fields += ", DVA_IMP_DATO4";
        fieldValues += ", ?";
        values.add(this.getDvaImpDato4());

        fields += ", DVA_CVE_APLICA_D5";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD5());

        fields += ", DVA_IMP_DATO5";
        fieldValues += ", ?";
        values.add(this.getDvaImpDato5());

        fields += ", DVA_CVE_APLICA_D6";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD6());

        fields += ", DVA_NUM_DATO6";
        fieldValues += ", ?";
        values.add(this.getDvaNumDato6());

        fields += ", DVA_CVE_APLICA_D7";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD7());

        fields += ", DVA_NUM_DATO7";
        fieldValues += ", ?";
        values.add(this.getDvaNumDato7());

        fields += ", DVA_CVE_APLICA_D8";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD8());

        fields += ", DVA_NUM_DATO8";
        fieldValues += ", ?";
        values.add(this.getDvaNumDato8());

        fields += ", DVA_CVE_APLICA_D9";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD9());

        fields += ", DVA_PJE_DATO9";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato9());

        fields += ", DVA_CVE_APLICA_D10";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD10());

        fields += ", DVA_PJE_DATO10";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato10());

        fields += ", DVA_CVE_APLICA_D11";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD11());

        fields += ", DVA_PJE_DATO11";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato11());

        fields += ", DVA_CVE_APLICA_D12";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD12());

        fields += ", DVA_PJE_DATO12";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato12());

        fields += ", DVA_CVE_APLICA_D13";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD13());

        fields += ", DVA_PJE_DATO13";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato13());

        fields += ", DVA_CVE_APLICA_D14";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD14());

        fields += ", DVA_PJE_DATO14";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato14());

        fields += ", DVA_CVE_APLICA_D15";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD15());

        fields += ", DVA_PJE_DATO15";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato15());

        fields += ", DVA_CVE_APLICA_D16";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD16());

        fields += ", DVA_PJE_DATO16";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato16());

        fields += ", DVA_CVE_APLICA_D17";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD17());

        fields += ", DVA_PJE_DATO17";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato17());

        fields += ", DVA_CVE_APLICA_D18";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD18());

        fields += ", DVA_PJE_DATO18";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato18());

        fields += ", DVA_CVE_APLICA_D19";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD19());

        fields += ", DVA_PJE_DATO19";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato19());

        fields += ", DVA_CVE_APLICA_D20";
        fieldValues += ", ?";
        values.add(this.getDvaCveAplicaD20());

        fields += ", DVA_PJE_DATO20";
        fieldValues += ", ?";
        values.add(this.getDvaPjeDato20());

        fields += ", DVA_FEC_MOVTO";
        fieldValues += ", ?";
        values.add(this.getDvaFecMovto());

        fields += ", DVA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDvaAnoAltaReg());

        fields += ", DVA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDvaMesAltaReg());

        fields += ", DVA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDvaDiaAltaReg());

        fields += ", DVA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDvaAnoUltMod());

        fields += ", DVA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDvaMesUltMod());

        fields += ", DVA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDvaDiaUltMod());

        fields += ", DVA_CVE_ST_DATOVAL";
        fieldValues += ", ?";
        values.add(this.getDvaCveStDatoval());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DATOVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DVA_FOLIO_OPERA = ?";
        values.add(this.getDvaFolioOpera());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Datoval instance = (Datoval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDvaFolioOpera().equals(instance.getDvaFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDvaNumOperacion().equals(instance.getDvaNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getDvaNumTransac().equals(instance.getDvaNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD1().equals(instance.getDvaCveAplicaD1()))
            equalObjects = false;
        if (equalObjects && !this.getDvaImpDato1().equals(instance.getDvaImpDato1()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD2().equals(instance.getDvaCveAplicaD2()))
            equalObjects = false;
        if (equalObjects && !this.getDvaImpDato2().equals(instance.getDvaImpDato2()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD3().equals(instance.getDvaCveAplicaD3()))
            equalObjects = false;
        if (equalObjects && !this.getDvaImpDato3().equals(instance.getDvaImpDato3()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD4().equals(instance.getDvaCveAplicaD4()))
            equalObjects = false;
        if (equalObjects && !this.getDvaImpDato4().equals(instance.getDvaImpDato4()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD5().equals(instance.getDvaCveAplicaD5()))
            equalObjects = false;
        if (equalObjects && !this.getDvaImpDato5().equals(instance.getDvaImpDato5()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD6().equals(instance.getDvaCveAplicaD6()))
            equalObjects = false;
        if (equalObjects && !this.getDvaNumDato6().equals(instance.getDvaNumDato6()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD7().equals(instance.getDvaCveAplicaD7()))
            equalObjects = false;
        if (equalObjects && !this.getDvaNumDato7().equals(instance.getDvaNumDato7()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD8().equals(instance.getDvaCveAplicaD8()))
            equalObjects = false;
        if (equalObjects && !this.getDvaNumDato8().equals(instance.getDvaNumDato8()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD9().equals(instance.getDvaCveAplicaD9()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato9().equals(instance.getDvaPjeDato9()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD10().equals(instance.getDvaCveAplicaD10()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato10().equals(instance.getDvaPjeDato10()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD11().equals(instance.getDvaCveAplicaD11()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato11().equals(instance.getDvaPjeDato11()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD12().equals(instance.getDvaCveAplicaD12()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato12().equals(instance.getDvaPjeDato12()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD13().equals(instance.getDvaCveAplicaD13()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato13().equals(instance.getDvaPjeDato13()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD14().equals(instance.getDvaCveAplicaD14()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato14().equals(instance.getDvaPjeDato14()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD15().equals(instance.getDvaCveAplicaD15()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato15().equals(instance.getDvaPjeDato15()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD16().equals(instance.getDvaCveAplicaD16()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato16().equals(instance.getDvaPjeDato16()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD17().equals(instance.getDvaCveAplicaD17()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato17().equals(instance.getDvaPjeDato17()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD18().equals(instance.getDvaCveAplicaD18()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato18().equals(instance.getDvaPjeDato18()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD19().equals(instance.getDvaCveAplicaD19()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato19().equals(instance.getDvaPjeDato19()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveAplicaD20().equals(instance.getDvaCveAplicaD20()))
            equalObjects = false;
        if (equalObjects && !this.getDvaPjeDato20().equals(instance.getDvaPjeDato20()))
            equalObjects = false;
        if (equalObjects && !this.getDvaFecMovto().equals(instance.getDvaFecMovto()))
            equalObjects = false;
        if (equalObjects && !this.getDvaAnoAltaReg().equals(instance.getDvaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDvaMesAltaReg().equals(instance.getDvaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDvaDiaAltaReg().equals(instance.getDvaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDvaAnoUltMod().equals(instance.getDvaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDvaMesUltMod().equals(instance.getDvaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDvaDiaUltMod().equals(instance.getDvaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDvaCveStDatoval().equals(instance.getDvaCveStDatoval()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Datoval result = new Datoval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDvaFolioOpera((BigDecimal) objectData.getData("DVA_FOLIO_OPERA"));
        result.setDvaNumOperacion((BigDecimal) objectData.getData("DVA_NUM_OPERACION"));
        result.setDvaNumTransac((BigDecimal) objectData.getData("DVA_NUM_TRANSAC"));
        result.setDvaCveAplicaD1((String) objectData.getData("DVA_CVE_APLICA_D1"));
        result.setDvaImpDato1((BigDecimal) objectData.getData("DVA_IMP_DATO1"));
        result.setDvaCveAplicaD2((String) objectData.getData("DVA_CVE_APLICA_D2"));
        result.setDvaImpDato2((BigDecimal) objectData.getData("DVA_IMP_DATO2"));
        result.setDvaCveAplicaD3((String) objectData.getData("DVA_CVE_APLICA_D3"));
        result.setDvaImpDato3((BigDecimal) objectData.getData("DVA_IMP_DATO3"));
        result.setDvaCveAplicaD4((String) objectData.getData("DVA_CVE_APLICA_D4"));
        result.setDvaImpDato4((BigDecimal) objectData.getData("DVA_IMP_DATO4"));
        result.setDvaCveAplicaD5((String) objectData.getData("DVA_CVE_APLICA_D5"));
        result.setDvaImpDato5((BigDecimal) objectData.getData("DVA_IMP_DATO5"));
        result.setDvaCveAplicaD6((String) objectData.getData("DVA_CVE_APLICA_D6"));
        result.setDvaNumDato6((BigDecimal) objectData.getData("DVA_NUM_DATO6"));
        result.setDvaCveAplicaD7((String) objectData.getData("DVA_CVE_APLICA_D7"));
        result.setDvaNumDato7((BigDecimal) objectData.getData("DVA_NUM_DATO7"));
        result.setDvaCveAplicaD8((String) objectData.getData("DVA_CVE_APLICA_D8"));
        result.setDvaNumDato8((BigDecimal) objectData.getData("DVA_NUM_DATO8"));
        result.setDvaCveAplicaD9((String) objectData.getData("DVA_CVE_APLICA_D9"));
        result.setDvaPjeDato9((BigDecimal) objectData.getData("DVA_PJE_DATO9"));
        result.setDvaCveAplicaD10((String) objectData.getData("DVA_CVE_APLICA_D10"));
        result.setDvaPjeDato10((BigDecimal) objectData.getData("DVA_PJE_DATO10"));
        result.setDvaCveAplicaD11((String) objectData.getData("DVA_CVE_APLICA_D11"));
        result.setDvaPjeDato11((BigDecimal) objectData.getData("DVA_PJE_DATO11"));
        result.setDvaCveAplicaD12((String) objectData.getData("DVA_CVE_APLICA_D12"));
        result.setDvaPjeDato12((BigDecimal) objectData.getData("DVA_PJE_DATO12"));
        result.setDvaCveAplicaD13((String) objectData.getData("DVA_CVE_APLICA_D13"));
        result.setDvaPjeDato13((BigDecimal) objectData.getData("DVA_PJE_DATO13"));
        result.setDvaCveAplicaD14((String) objectData.getData("DVA_CVE_APLICA_D14"));
        result.setDvaPjeDato14((BigDecimal) objectData.getData("DVA_PJE_DATO14"));
        result.setDvaCveAplicaD15((String) objectData.getData("DVA_CVE_APLICA_D15"));
        result.setDvaPjeDato15((BigDecimal) objectData.getData("DVA_PJE_DATO15"));
        result.setDvaCveAplicaD16((String) objectData.getData("DVA_CVE_APLICA_D16"));
        result.setDvaPjeDato16((BigDecimal) objectData.getData("DVA_PJE_DATO16"));
        result.setDvaCveAplicaD17((String) objectData.getData("DVA_CVE_APLICA_D17"));
        result.setDvaPjeDato17((BigDecimal) objectData.getData("DVA_PJE_DATO17"));
        result.setDvaCveAplicaD18((String) objectData.getData("DVA_CVE_APLICA_D18"));
        result.setDvaPjeDato18((BigDecimal) objectData.getData("DVA_PJE_DATO18"));
        result.setDvaCveAplicaD19((String) objectData.getData("DVA_CVE_APLICA_D19"));
        result.setDvaPjeDato19((BigDecimal) objectData.getData("DVA_PJE_DATO19"));
        result.setDvaCveAplicaD20((String) objectData.getData("DVA_CVE_APLICA_D20"));
        result.setDvaPjeDato20((BigDecimal) objectData.getData("DVA_PJE_DATO20"));
        result.setDvaFecMovto((String) objectData.getData("DVA_FEC_MOVTO"));
        result.setDvaAnoAltaReg((BigDecimal) objectData.getData("DVA_ANO_ALTA_REG"));
        result.setDvaMesAltaReg((BigDecimal) objectData.getData("DVA_MES_ALTA_REG"));
        result.setDvaDiaAltaReg((BigDecimal) objectData.getData("DVA_DIA_ALTA_REG"));
        result.setDvaAnoUltMod((BigDecimal) objectData.getData("DVA_ANO_ULT_MOD"));
        result.setDvaMesUltMod((BigDecimal) objectData.getData("DVA_MES_ULT_MOD"));
        result.setDvaDiaUltMod((BigDecimal) objectData.getData("DVA_DIA_ULT_MOD"));
        result.setDvaCveStDatoval((String) objectData.getData("DVA_CVE_ST_DATOVAL"));

        return result;

    }

}
