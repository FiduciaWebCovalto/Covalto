package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUVTAGLO_PK",
            columns = { "SVG_NUM_CORTE", "SVG_CVE_TIPO_MERCA", "SVG_NUM_INSTRUME", "SVG_NUM_SEC_EMIS", "SVG_ANO_SUGERENCIA", "SVG_MES_SUGERENCIA", "SVG_DIA_SUGERENCIA" },
            sequences = { "MANUAL" })
public class Suvtaglo extends DomainObject {

    BigDecimal svgAnoSugerencia = null;
    BigDecimal svgMesSugerencia = null;
    BigDecimal svgDiaSugerencia = null;
    BigDecimal svgNumCorte = null;
    BigDecimal svgCveTipoMerca = null;
    BigDecimal svgNumInstrume = null;
    BigDecimal svgNumSecEmis = null;
    String svgNomPizarra = null;
    String svgSerieEmision = null;
    BigDecimal svgNumCuponVig = null;
    BigDecimal svgTitRequeridos = null;
    BigDecimal svgTitVendidos = null;
    BigDecimal svgNumTitDisp = null;
    BigDecimal svgImpTitVta = null;
    BigDecimal svgPrecioCierre = null;
    BigDecimal svgNumContratos = null;
    String svgHoraCorte = null;
    BigDecimal svgMinutosCorte = null;
    String svgCveStSuvtagl = null;

    public Suvtaglo() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSvgAnoSugerencia(BigDecimal svgAnoSugerencia) {
        this.svgAnoSugerencia = svgAnoSugerencia;
    }

    public BigDecimal getSvgAnoSugerencia() {
        return this.svgAnoSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSvgMesSugerencia(BigDecimal svgMesSugerencia) {
        this.svgMesSugerencia = svgMesSugerencia;
    }

    public BigDecimal getSvgMesSugerencia() {
        return this.svgMesSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSvgDiaSugerencia(BigDecimal svgDiaSugerencia) {
        this.svgDiaSugerencia = svgDiaSugerencia;
    }

    public BigDecimal getSvgDiaSugerencia() {
        return this.svgDiaSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSvgNumCorte(BigDecimal svgNumCorte) {
        this.svgNumCorte = svgNumCorte;
    }

    public BigDecimal getSvgNumCorte() {
        return this.svgNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSvgCveTipoMerca(BigDecimal svgCveTipoMerca) {
        this.svgCveTipoMerca = svgCveTipoMerca;
    }

    public BigDecimal getSvgCveTipoMerca() {
        return this.svgCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSvgNumInstrume(BigDecimal svgNumInstrume) {
        this.svgNumInstrume = svgNumInstrume;
    }

    public BigDecimal getSvgNumInstrume() {
        return this.svgNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSvgNumSecEmis(BigDecimal svgNumSecEmis) {
        this.svgNumSecEmis = svgNumSecEmis;
    }

    public BigDecimal getSvgNumSecEmis() {
        return this.svgNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSvgNomPizarra(String svgNomPizarra) {
        this.svgNomPizarra = svgNomPizarra;
    }

    public String getSvgNomPizarra() {
        return this.svgNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSvgSerieEmision(String svgSerieEmision) {
        this.svgSerieEmision = svgSerieEmision;
    }

    public String getSvgSerieEmision() {
        return this.svgSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 14, scale = 0, javaClass = BigDecimal.class)
    public void setSvgNumCuponVig(BigDecimal svgNumCuponVig) {
        this.svgNumCuponVig = svgNumCuponVig;
    }

    public BigDecimal getSvgNumCuponVig() {
        return this.svgNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 14, scale = 0, javaClass = BigDecimal.class)
    public void setSvgTitRequeridos(BigDecimal svgTitRequeridos) {
        this.svgTitRequeridos = svgTitRequeridos;
    }

    public BigDecimal getSvgTitRequeridos() {
        return this.svgTitRequeridos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 14, scale = 0, javaClass = BigDecimal.class)
    public void setSvgTitVendidos(BigDecimal svgTitVendidos) {
        this.svgTitVendidos = svgTitVendidos;
    }

    public BigDecimal getSvgTitVendidos() {
        return this.svgTitVendidos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 14, scale = 0, javaClass = BigDecimal.class)
    public void setSvgNumTitDisp(BigDecimal svgNumTitDisp) {
        this.svgNumTitDisp = svgNumTitDisp;
    }

    public BigDecimal getSvgNumTitDisp() {
        return this.svgNumTitDisp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSvgImpTitVta(BigDecimal svgImpTitVta) {
        this.svgImpTitVta = svgImpTitVta;
    }

    public BigDecimal getSvgImpTitVta() {
        return this.svgImpTitVta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setSvgPrecioCierre(BigDecimal svgPrecioCierre) {
        this.svgPrecioCierre = svgPrecioCierre;
    }

    public BigDecimal getSvgPrecioCierre() {
        return this.svgPrecioCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSvgNumContratos(BigDecimal svgNumContratos) {
        this.svgNumContratos = svgNumContratos;
    }

    public BigDecimal getSvgNumContratos() {
        return this.svgNumContratos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSvgHoraCorte(String svgHoraCorte) {
        this.svgHoraCorte = svgHoraCorte;
    }

    public String getSvgHoraCorte() {
        return this.svgHoraCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSvgMinutosCorte(BigDecimal svgMinutosCorte) {
        this.svgMinutosCorte = svgMinutosCorte;
    }

    public BigDecimal getSvgMinutosCorte() {
        return this.svgMinutosCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSvgCveStSuvtagl(String svgCveStSuvtagl) {
        this.svgCveStSuvtagl = svgCveStSuvtagl;
    }

    public String getSvgCveStSuvtagl() {
        return this.svgCveStSuvtagl;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUVTAGLO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSvgAnoSugerencia() != null && this.getSvgAnoSugerencia().longValue() == -999) {
            conditions += " AND SVG_ANO_SUGERENCIA IS NULL";
        } else if (this.getSvgAnoSugerencia() != null) {
            conditions += " AND SVG_ANO_SUGERENCIA = ?";
            values.add(this.getSvgAnoSugerencia());
        }

        if (this.getSvgMesSugerencia() != null && this.getSvgMesSugerencia().longValue() == -999) {
            conditions += " AND SVG_MES_SUGERENCIA IS NULL";
        } else if (this.getSvgMesSugerencia() != null) {
            conditions += " AND SVG_MES_SUGERENCIA = ?";
            values.add(this.getSvgMesSugerencia());
        }

        if (this.getSvgDiaSugerencia() != null && this.getSvgDiaSugerencia().longValue() == -999) {
            conditions += " AND SVG_DIA_SUGERENCIA IS NULL";
        } else if (this.getSvgDiaSugerencia() != null) {
            conditions += " AND SVG_DIA_SUGERENCIA = ?";
            values.add(this.getSvgDiaSugerencia());
        }

        if (this.getSvgNumCorte() != null && this.getSvgNumCorte().longValue() == -999) {
            conditions += " AND SVG_NUM_CORTE IS NULL";
        } else if (this.getSvgNumCorte() != null) {
            conditions += " AND SVG_NUM_CORTE = ?";
            values.add(this.getSvgNumCorte());
        }

        if (this.getSvgCveTipoMerca() != null && this.getSvgCveTipoMerca().longValue() == -999) {
            conditions += " AND SVG_CVE_TIPO_MERCA IS NULL";
        } else if (this.getSvgCveTipoMerca() != null) {
            conditions += " AND SVG_CVE_TIPO_MERCA = ?";
            values.add(this.getSvgCveTipoMerca());
        }

        if (this.getSvgNumInstrume() != null && this.getSvgNumInstrume().longValue() == -999) {
            conditions += " AND SVG_NUM_INSTRUME IS NULL";
        } else if (this.getSvgNumInstrume() != null) {
            conditions += " AND SVG_NUM_INSTRUME = ?";
            values.add(this.getSvgNumInstrume());
        }

        if (this.getSvgNumSecEmis() != null && this.getSvgNumSecEmis().longValue() == -999) {
            conditions += " AND SVG_NUM_SEC_EMIS IS NULL";
        } else if (this.getSvgNumSecEmis() != null) {
            conditions += " AND SVG_NUM_SEC_EMIS = ?";
            values.add(this.getSvgNumSecEmis());
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
        String sql = "SELECT * FROM SUVTAGLO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSvgAnoSugerencia() != null && this.getSvgAnoSugerencia().longValue() == -999) {
            conditions += " AND SVG_ANO_SUGERENCIA IS NULL";
        } else if (this.getSvgAnoSugerencia() != null) {
            conditions += " AND SVG_ANO_SUGERENCIA = ?";
            values.add(this.getSvgAnoSugerencia());
        }

        if (this.getSvgMesSugerencia() != null && this.getSvgMesSugerencia().longValue() == -999) {
            conditions += " AND SVG_MES_SUGERENCIA IS NULL";
        } else if (this.getSvgMesSugerencia() != null) {
            conditions += " AND SVG_MES_SUGERENCIA = ?";
            values.add(this.getSvgMesSugerencia());
        }

        if (this.getSvgDiaSugerencia() != null && this.getSvgDiaSugerencia().longValue() == -999) {
            conditions += " AND SVG_DIA_SUGERENCIA IS NULL";
        } else if (this.getSvgDiaSugerencia() != null) {
            conditions += " AND SVG_DIA_SUGERENCIA = ?";
            values.add(this.getSvgDiaSugerencia());
        }

        if (this.getSvgNumCorte() != null && this.getSvgNumCorte().longValue() == -999) {
            conditions += " AND SVG_NUM_CORTE IS NULL";
        } else if (this.getSvgNumCorte() != null) {
            conditions += " AND SVG_NUM_CORTE = ?";
            values.add(this.getSvgNumCorte());
        }

        if (this.getSvgCveTipoMerca() != null && this.getSvgCveTipoMerca().longValue() == -999) {
            conditions += " AND SVG_CVE_TIPO_MERCA IS NULL";
        } else if (this.getSvgCveTipoMerca() != null) {
            conditions += " AND SVG_CVE_TIPO_MERCA = ?";
            values.add(this.getSvgCveTipoMerca());
        }

        if (this.getSvgNumInstrume() != null && this.getSvgNumInstrume().longValue() == -999) {
            conditions += " AND SVG_NUM_INSTRUME IS NULL";
        } else if (this.getSvgNumInstrume() != null) {
            conditions += " AND SVG_NUM_INSTRUME = ?";
            values.add(this.getSvgNumInstrume());
        }

        if (this.getSvgNumSecEmis() != null && this.getSvgNumSecEmis().longValue() == -999) {
            conditions += " AND SVG_NUM_SEC_EMIS IS NULL";
        } else if (this.getSvgNumSecEmis() != null) {
            conditions += " AND SVG_NUM_SEC_EMIS = ?";
            values.add(this.getSvgNumSecEmis());
        }

        if (this.getSvgNomPizarra() != null && "null".equals(this.getSvgNomPizarra())) {
            conditions += " AND SVG_NOM_PIZARRA IS NULL";
        } else if (this.getSvgNomPizarra() != null) {
            conditions += " AND SVG_NOM_PIZARRA = ?";
            values.add(this.getSvgNomPizarra());
        }

        if (this.getSvgSerieEmision() != null && "null".equals(this.getSvgSerieEmision())) {
            conditions += " AND SVG_SERIE_EMISION IS NULL";
        } else if (this.getSvgSerieEmision() != null) {
            conditions += " AND SVG_SERIE_EMISION = ?";
            values.add(this.getSvgSerieEmision());
        }

        if (this.getSvgNumCuponVig() != null && this.getSvgNumCuponVig().longValue() == -999) {
            conditions += " AND SVG_NUM_CUPON_VIG IS NULL";
        } else if (this.getSvgNumCuponVig() != null) {
            conditions += " AND SVG_NUM_CUPON_VIG = ?";
            values.add(this.getSvgNumCuponVig());
        }

        if (this.getSvgTitRequeridos() != null && this.getSvgTitRequeridos().longValue() == -999) {
            conditions += " AND SVG_TIT_REQUERIDOS IS NULL";
        } else if (this.getSvgTitRequeridos() != null) {
            conditions += " AND SVG_TIT_REQUERIDOS = ?";
            values.add(this.getSvgTitRequeridos());
        }

        if (this.getSvgTitVendidos() != null && this.getSvgTitVendidos().longValue() == -999) {
            conditions += " AND SVG_TIT_VENDIDOS IS NULL";
        } else if (this.getSvgTitVendidos() != null) {
            conditions += " AND SVG_TIT_VENDIDOS = ?";
            values.add(this.getSvgTitVendidos());
        }

        if (this.getSvgNumTitDisp() != null && this.getSvgNumTitDisp().longValue() == -999) {
            conditions += " AND SVG_NUM_TIT_DISP IS NULL";
        } else if (this.getSvgNumTitDisp() != null) {
            conditions += " AND SVG_NUM_TIT_DISP = ?";
            values.add(this.getSvgNumTitDisp());
        }

        if (this.getSvgImpTitVta() != null && this.getSvgImpTitVta().longValue() == -999) {
            conditions += " AND SVG_IMP_TIT_VTA IS NULL";
        } else if (this.getSvgImpTitVta() != null) {
            conditions += " AND SVG_IMP_TIT_VTA = ?";
            values.add(this.getSvgImpTitVta());
        }

        if (this.getSvgPrecioCierre() != null && this.getSvgPrecioCierre().longValue() == -999) {
            conditions += " AND SVG_PRECIO_CIERRE IS NULL";
        } else if (this.getSvgPrecioCierre() != null) {
            conditions += " AND SVG_PRECIO_CIERRE = ?";
            values.add(this.getSvgPrecioCierre());
        }

        if (this.getSvgNumContratos() != null && this.getSvgNumContratos().longValue() == -999) {
            conditions += " AND SVG_NUM_CONTRATOS IS NULL";
        } else if (this.getSvgNumContratos() != null) {
            conditions += " AND SVG_NUM_CONTRATOS = ?";
            values.add(this.getSvgNumContratos());
        }

        if (this.getSvgHoraCorte() != null && "null".equals(this.getSvgHoraCorte())) {
            conditions += " AND SVG_HORA_CORTE IS NULL";
        } else if (this.getSvgHoraCorte() != null) {
            conditions += " AND SVG_HORA_CORTE = ?";
            values.add(this.getSvgHoraCorte());
        }

        if (this.getSvgMinutosCorte() != null && this.getSvgMinutosCorte().longValue() == -999) {
            conditions += " AND SVG_MINUTOS_CORTE IS NULL";
        } else if (this.getSvgMinutosCorte() != null) {
            conditions += " AND SVG_MINUTOS_CORTE = ?";
            values.add(this.getSvgMinutosCorte());
        }

        if (this.getSvgCveStSuvtagl() != null && "null".equals(this.getSvgCveStSuvtagl())) {
            conditions += " AND SVG_CVE_ST_SUVTAGL IS NULL";
        } else if (this.getSvgCveStSuvtagl() != null) {
            conditions += " AND SVG_CVE_ST_SUVTAGL = ?";
            values.add(this.getSvgCveStSuvtagl());
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
        String sql = "UPDATE SUVTAGLO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SVG_ANO_SUGERENCIA = ?";
        pkValues.add(this.getSvgAnoSugerencia());
        conditions += " AND SVG_MES_SUGERENCIA = ?";
        pkValues.add(this.getSvgMesSugerencia());
        conditions += " AND SVG_DIA_SUGERENCIA = ?";
        pkValues.add(this.getSvgDiaSugerencia());
        conditions += " AND SVG_NUM_CORTE = ?";
        pkValues.add(this.getSvgNumCorte());
        conditions += " AND SVG_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getSvgCveTipoMerca());
        conditions += " AND SVG_NUM_INSTRUME = ?";
        pkValues.add(this.getSvgNumInstrume());
        conditions += " AND SVG_NUM_SEC_EMIS = ?";
        pkValues.add(this.getSvgNumSecEmis());
        fields += " SVG_NOM_PIZARRA = ?, ";
        values.add(this.getSvgNomPizarra());
        fields += " SVG_SERIE_EMISION = ?, ";
        values.add(this.getSvgSerieEmision());
        fields += " SVG_NUM_CUPON_VIG = ?, ";
        values.add(this.getSvgNumCuponVig());
        fields += " SVG_TIT_REQUERIDOS = ?, ";
        values.add(this.getSvgTitRequeridos());
        fields += " SVG_TIT_VENDIDOS = ?, ";
        values.add(this.getSvgTitVendidos());
        fields += " SVG_NUM_TIT_DISP = ?, ";
        values.add(this.getSvgNumTitDisp());
        fields += " SVG_IMP_TIT_VTA = ?, ";
        values.add(this.getSvgImpTitVta());
        fields += " SVG_PRECIO_CIERRE = ?, ";
        values.add(this.getSvgPrecioCierre());
        fields += " SVG_NUM_CONTRATOS = ?, ";
        values.add(this.getSvgNumContratos());
        fields += " SVG_HORA_CORTE = ?, ";
        values.add(this.getSvgHoraCorte());
        fields += " SVG_MINUTOS_CORTE = ?, ";
        values.add(this.getSvgMinutosCorte());
        fields += " SVG_CVE_ST_SUVTAGL = ?, ";
        values.add(this.getSvgCveStSuvtagl());
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
        String sql = "INSERT INTO SUVTAGLO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SVG_ANO_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSvgAnoSugerencia());

        fields += ", SVG_MES_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSvgMesSugerencia());

        fields += ", SVG_DIA_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSvgDiaSugerencia());

        fields += ", SVG_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getSvgNumCorte());

        fields += ", SVG_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getSvgCveTipoMerca());

        fields += ", SVG_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getSvgNumInstrume());

        fields += ", SVG_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getSvgNumSecEmis());

        fields += ", SVG_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getSvgNomPizarra());

        fields += ", SVG_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getSvgSerieEmision());

        fields += ", SVG_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getSvgNumCuponVig());

        fields += ", SVG_TIT_REQUERIDOS";
        fieldValues += ", ?";
        values.add(this.getSvgTitRequeridos());

        fields += ", SVG_TIT_VENDIDOS";
        fieldValues += ", ?";
        values.add(this.getSvgTitVendidos());

        fields += ", SVG_NUM_TIT_DISP";
        fieldValues += ", ?";
        values.add(this.getSvgNumTitDisp());

        fields += ", SVG_IMP_TIT_VTA";
        fieldValues += ", ?";
        values.add(this.getSvgImpTitVta());

        fields += ", SVG_PRECIO_CIERRE";
        fieldValues += ", ?";
        values.add(this.getSvgPrecioCierre());

        fields += ", SVG_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getSvgNumContratos());

        fields += ", SVG_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getSvgHoraCorte());

        fields += ", SVG_MINUTOS_CORTE";
        fieldValues += ", ?";
        values.add(this.getSvgMinutosCorte());

        fields += ", SVG_CVE_ST_SUVTAGL";
        fieldValues += ", ?";
        values.add(this.getSvgCveStSuvtagl());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUVTAGLO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SVG_ANO_SUGERENCIA = ?";
        values.add(this.getSvgAnoSugerencia());
        conditions += " AND SVG_MES_SUGERENCIA = ?";
        values.add(this.getSvgMesSugerencia());
        conditions += " AND SVG_DIA_SUGERENCIA = ?";
        values.add(this.getSvgDiaSugerencia());
        conditions += " AND SVG_NUM_CORTE = ?";
        values.add(this.getSvgNumCorte());
        conditions += " AND SVG_CVE_TIPO_MERCA = ?";
        values.add(this.getSvgCveTipoMerca());
        conditions += " AND SVG_NUM_INSTRUME = ?";
        values.add(this.getSvgNumInstrume());
        conditions += " AND SVG_NUM_SEC_EMIS = ?";
        values.add(this.getSvgNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Suvtaglo instance = (Suvtaglo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSvgAnoSugerencia().equals(instance.getSvgAnoSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSvgMesSugerencia().equals(instance.getSvgMesSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSvgDiaSugerencia().equals(instance.getSvgDiaSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSvgNumCorte().equals(instance.getSvgNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSvgCveTipoMerca().equals(instance.getSvgCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getSvgNumInstrume().equals(instance.getSvgNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getSvgNumSecEmis().equals(instance.getSvgNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getSvgNomPizarra().equals(instance.getSvgNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getSvgSerieEmision().equals(instance.getSvgSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getSvgNumCuponVig().equals(instance.getSvgNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getSvgTitRequeridos().equals(instance.getSvgTitRequeridos()))
            equalObjects = false;
        if (equalObjects && !this.getSvgTitVendidos().equals(instance.getSvgTitVendidos()))
            equalObjects = false;
        if (equalObjects && !this.getSvgNumTitDisp().equals(instance.getSvgNumTitDisp()))
            equalObjects = false;
        if (equalObjects && !this.getSvgImpTitVta().equals(instance.getSvgImpTitVta()))
            equalObjects = false;
        if (equalObjects && !this.getSvgPrecioCierre().equals(instance.getSvgPrecioCierre()))
            equalObjects = false;
        if (equalObjects && !this.getSvgNumContratos().equals(instance.getSvgNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getSvgHoraCorte().equals(instance.getSvgHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSvgMinutosCorte().equals(instance.getSvgMinutosCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSvgCveStSuvtagl().equals(instance.getSvgCveStSuvtagl()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Suvtaglo result = new Suvtaglo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSvgAnoSugerencia((BigDecimal) objectData.getData("SVG_ANO_SUGERENCIA"));
        result.setSvgMesSugerencia((BigDecimal) objectData.getData("SVG_MES_SUGERENCIA"));
        result.setSvgDiaSugerencia((BigDecimal) objectData.getData("SVG_DIA_SUGERENCIA"));
        result.setSvgNumCorte((BigDecimal) objectData.getData("SVG_NUM_CORTE"));
        result.setSvgCveTipoMerca((BigDecimal) objectData.getData("SVG_CVE_TIPO_MERCA"));
        result.setSvgNumInstrume((BigDecimal) objectData.getData("SVG_NUM_INSTRUME"));
        result.setSvgNumSecEmis((BigDecimal) objectData.getData("SVG_NUM_SEC_EMIS"));
        result.setSvgNomPizarra((String) objectData.getData("SVG_NOM_PIZARRA"));
        result.setSvgSerieEmision((String) objectData.getData("SVG_SERIE_EMISION"));
        result.setSvgNumCuponVig((BigDecimal) objectData.getData("SVG_NUM_CUPON_VIG"));
        result.setSvgTitRequeridos((BigDecimal) objectData.getData("SVG_TIT_REQUERIDOS"));
        result.setSvgTitVendidos((BigDecimal) objectData.getData("SVG_TIT_VENDIDOS"));
        result.setSvgNumTitDisp((BigDecimal) objectData.getData("SVG_NUM_TIT_DISP"));
        result.setSvgImpTitVta((BigDecimal) objectData.getData("SVG_IMP_TIT_VTA"));
        result.setSvgPrecioCierre((BigDecimal) objectData.getData("SVG_PRECIO_CIERRE"));
        result.setSvgNumContratos((BigDecimal) objectData.getData("SVG_NUM_CONTRATOS"));
        result.setSvgHoraCorte((String) objectData.getData("SVG_HORA_CORTE"));
        result.setSvgMinutosCorte((BigDecimal) objectData.getData("SVG_MINUTOS_CORTE"));
        result.setSvgCveStSuvtagl((String) objectData.getData("SVG_CVE_ST_SUVTAGL"));

        return result;

    }

}
