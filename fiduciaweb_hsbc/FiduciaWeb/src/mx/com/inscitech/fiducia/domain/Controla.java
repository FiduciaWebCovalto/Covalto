package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONTROLA_PK", columns = { "CTL_ANO_CONTROL", "CTL_MES_CONTROL", "CTL_DIA_CONTROL" }, sequences = { "MANUAL" })
public class Controla extends DomainObject {

    BigDecimal ctlAnoControl = null;
    BigDecimal ctlMesControl = null;
    BigDecimal ctlDiaControl = null;
    BigDecimal ctlCveFinInicio = null;
    String ctlHrFinInicio = null;
    BigDecimal ctlCveFinCierre = null;
    String ctlHrFinCierre = null;
    BigDecimal ctlCveFinDiario = null;
    String ctlHrFinDiario = null;
    BigDecimal ctlCveFinSemana = null;
    String ctlHrFinSemana = null;
    BigDecimal ctlCveFinQuince = null;
    String ctlHrFinQuince = null;
    BigDecimal ctlCveFinMens = null;
    String ctlHrFinMens = null;
    BigDecimal ctlCveFinBimes = null;
    String ctlHrFinBimes = null;
    BigDecimal ctlCveFinTrimes = null;
    String ctlHrFinTrimes = null;
    BigDecimal ctlCveFinSemes = null;
    String ctlHrFinSemes = null;
    BigDecimal ctlCveFinAnual = null;
    String ctlHoraFinAnual = null;
    BigDecimal ctlCveFinDia = null;
    String ctlHoraFinDia = null;
    BigDecimal ctlAnoUltMod = null;
    BigDecimal ctlMesUltMod = null;
    BigDecimal ctlDiaUltMod = null;
    String ctlCveStControl = null;
    BigDecimal ctlCveInternet = null;

    public Controla() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlAnoControl(BigDecimal ctlAnoControl) {
        this.ctlAnoControl = ctlAnoControl;
    }

    public BigDecimal getCtlAnoControl() {
        return this.ctlAnoControl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setCtlMesControl(BigDecimal ctlMesControl) {
        this.ctlMesControl = ctlMesControl;
    }

    public BigDecimal getCtlMesControl() {
        return this.ctlMesControl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setCtlDiaControl(BigDecimal ctlDiaControl) {
        this.ctlDiaControl = ctlDiaControl;
    }

    public BigDecimal getCtlDiaControl() {
        return this.ctlDiaControl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinInicio(BigDecimal ctlCveFinInicio) {
        this.ctlCveFinInicio = ctlCveFinInicio;
    }

    public BigDecimal getCtlCveFinInicio() {
        return this.ctlCveFinInicio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinInicio(String ctlHrFinInicio) {
        this.ctlHrFinInicio = ctlHrFinInicio;
    }

    public String getCtlHrFinInicio() {
        return this.ctlHrFinInicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinCierre(BigDecimal ctlCveFinCierre) {
        this.ctlCveFinCierre = ctlCveFinCierre;
    }

    public BigDecimal getCtlCveFinCierre() {
        return this.ctlCveFinCierre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinCierre(String ctlHrFinCierre) {
        this.ctlHrFinCierre = ctlHrFinCierre;
    }

    public String getCtlHrFinCierre() {
        return this.ctlHrFinCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinDiario(BigDecimal ctlCveFinDiario) {
        this.ctlCveFinDiario = ctlCveFinDiario;
    }

    public BigDecimal getCtlCveFinDiario() {
        return this.ctlCveFinDiario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinDiario(String ctlHrFinDiario) {
        this.ctlHrFinDiario = ctlHrFinDiario;
    }

    public String getCtlHrFinDiario() {
        return this.ctlHrFinDiario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinSemana(BigDecimal ctlCveFinSemana) {
        this.ctlCveFinSemana = ctlCveFinSemana;
    }

    public BigDecimal getCtlCveFinSemana() {
        return this.ctlCveFinSemana;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinSemana(String ctlHrFinSemana) {
        this.ctlHrFinSemana = ctlHrFinSemana;
    }

    public String getCtlHrFinSemana() {
        return this.ctlHrFinSemana;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinQuince(BigDecimal ctlCveFinQuince) {
        this.ctlCveFinQuince = ctlCveFinQuince;
    }

    public BigDecimal getCtlCveFinQuince() {
        return this.ctlCveFinQuince;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinQuince(String ctlHrFinQuince) {
        this.ctlHrFinQuince = ctlHrFinQuince;
    }

    public String getCtlHrFinQuince() {
        return this.ctlHrFinQuince;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinMens(BigDecimal ctlCveFinMens) {
        this.ctlCveFinMens = ctlCveFinMens;
    }

    public BigDecimal getCtlCveFinMens() {
        return this.ctlCveFinMens;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinMens(String ctlHrFinMens) {
        this.ctlHrFinMens = ctlHrFinMens;
    }

    public String getCtlHrFinMens() {
        return this.ctlHrFinMens;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinBimes(BigDecimal ctlCveFinBimes) {
        this.ctlCveFinBimes = ctlCveFinBimes;
    }

    public BigDecimal getCtlCveFinBimes() {
        return this.ctlCveFinBimes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinBimes(String ctlHrFinBimes) {
        this.ctlHrFinBimes = ctlHrFinBimes;
    }

    public String getCtlHrFinBimes() {
        return this.ctlHrFinBimes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinTrimes(BigDecimal ctlCveFinTrimes) {
        this.ctlCveFinTrimes = ctlCveFinTrimes;
    }

    public BigDecimal getCtlCveFinTrimes() {
        return this.ctlCveFinTrimes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinTrimes(String ctlHrFinTrimes) {
        this.ctlHrFinTrimes = ctlHrFinTrimes;
    }

    public String getCtlHrFinTrimes() {
        return this.ctlHrFinTrimes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinSemes(BigDecimal ctlCveFinSemes) {
        this.ctlCveFinSemes = ctlCveFinSemes;
    }

    public BigDecimal getCtlCveFinSemes() {
        return this.ctlCveFinSemes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHrFinSemes(String ctlHrFinSemes) {
        this.ctlHrFinSemes = ctlHrFinSemes;
    }

    public String getCtlHrFinSemes() {
        return this.ctlHrFinSemes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinAnual(BigDecimal ctlCveFinAnual) {
        this.ctlCveFinAnual = ctlCveFinAnual;
    }

    public BigDecimal getCtlCveFinAnual() {
        return this.ctlCveFinAnual;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHoraFinAnual(String ctlHoraFinAnual) {
        this.ctlHoraFinAnual = ctlHoraFinAnual;
    }

    public String getCtlHoraFinAnual() {
        return this.ctlHoraFinAnual;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveFinDia(BigDecimal ctlCveFinDia) {
        this.ctlCveFinDia = ctlCveFinDia;
    }

    public BigDecimal getCtlCveFinDia() {
        return this.ctlCveFinDia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlHoraFinDia(String ctlHoraFinDia) {
        this.ctlHoraFinDia = ctlHoraFinDia;
    }

    public String getCtlHoraFinDia() {
        return this.ctlHoraFinDia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtlAnoUltMod(BigDecimal ctlAnoUltMod) {
        this.ctlAnoUltMod = ctlAnoUltMod;
    }

    public BigDecimal getCtlAnoUltMod() {
        return this.ctlAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtlMesUltMod(BigDecimal ctlMesUltMod) {
        this.ctlMesUltMod = ctlMesUltMod;
    }

    public BigDecimal getCtlMesUltMod() {
        return this.ctlMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtlDiaUltMod(BigDecimal ctlDiaUltMod) {
        this.ctlDiaUltMod = ctlDiaUltMod;
    }

    public BigDecimal getCtlDiaUltMod() {
        return this.ctlDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtlCveStControl(String ctlCveStControl) {
        this.ctlCveStControl = ctlCveStControl;
    }

    public String getCtlCveStControl() {
        return this.ctlCveStControl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCtlCveInternet(BigDecimal ctlCveInternet) {
        this.ctlCveInternet = ctlCveInternet;
    }

    public BigDecimal getCtlCveInternet() {
        return this.ctlCveInternet;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONTROLA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtlAnoControl() != null && this.getCtlAnoControl().longValue() == -999) {
            conditions += " AND CTL_ANO_CONTROL IS NULL";
        } else if (this.getCtlAnoControl() != null) {
            conditions += " AND CTL_ANO_CONTROL = ?";
            values.add(this.getCtlAnoControl());
        }

        if (this.getCtlMesControl() != null && this.getCtlMesControl().longValue() == -999) {
            conditions += " AND CTL_MES_CONTROL IS NULL";
        } else if (this.getCtlMesControl() != null) {
            conditions += " AND CTL_MES_CONTROL = ?";
            values.add(this.getCtlMesControl());
        }

        if (this.getCtlDiaControl() != null && this.getCtlDiaControl().longValue() == -999) {
            conditions += " AND CTL_DIA_CONTROL IS NULL";
        } else if (this.getCtlDiaControl() != null) {
            conditions += " AND CTL_DIA_CONTROL = ?";
            values.add(this.getCtlDiaControl());
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
        String sql = "SELECT * FROM CONTROLA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtlAnoControl() != null && this.getCtlAnoControl().longValue() == -999) {
            conditions += " AND CTL_ANO_CONTROL IS NULL";
        } else if (this.getCtlAnoControl() != null) {
            conditions += " AND CTL_ANO_CONTROL = ?";
            values.add(this.getCtlAnoControl());
        }

        if (this.getCtlMesControl() != null && this.getCtlMesControl().longValue() == -999) {
            conditions += " AND CTL_MES_CONTROL IS NULL";
        } else if (this.getCtlMesControl() != null) {
            conditions += " AND CTL_MES_CONTROL = ?";
            values.add(this.getCtlMesControl());
        }

        if (this.getCtlDiaControl() != null && this.getCtlDiaControl().longValue() == -999) {
            conditions += " AND CTL_DIA_CONTROL IS NULL";
        } else if (this.getCtlDiaControl() != null) {
            conditions += " AND CTL_DIA_CONTROL = ?";
            values.add(this.getCtlDiaControl());
        }

        if (this.getCtlCveFinInicio() != null && this.getCtlCveFinInicio().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_INICIO IS NULL";
        } else if (this.getCtlCveFinInicio() != null) {
            conditions += " AND CTL_CVE_FIN_INICIO = ?";
            values.add(this.getCtlCveFinInicio());
        }

        if (this.getCtlHrFinInicio() != null && "null".equals(this.getCtlHrFinInicio())) {
            conditions += " AND CTL_HR_FIN_INICIO IS NULL";
        } else if (this.getCtlHrFinInicio() != null) {
            conditions += " AND CTL_HR_FIN_INICIO = ?";
            values.add(this.getCtlHrFinInicio());
        }

        if (this.getCtlCveFinCierre() != null && this.getCtlCveFinCierre().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_CIERRE IS NULL";
        } else if (this.getCtlCveFinCierre() != null) {
            conditions += " AND CTL_CVE_FIN_CIERRE = ?";
            values.add(this.getCtlCveFinCierre());
        }

        if (this.getCtlHrFinCierre() != null && "null".equals(this.getCtlHrFinCierre())) {
            conditions += " AND CTL_HR_FIN_CIERRE IS NULL";
        } else if (this.getCtlHrFinCierre() != null) {
            conditions += " AND CTL_HR_FIN_CIERRE = ?";
            values.add(this.getCtlHrFinCierre());
        }

        if (this.getCtlCveFinDiario() != null && this.getCtlCveFinDiario().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_DIARIO IS NULL";
        } else if (this.getCtlCveFinDiario() != null) {
            conditions += " AND CTL_CVE_FIN_DIARIO = ?";
            values.add(this.getCtlCveFinDiario());
        }

        if (this.getCtlHrFinDiario() != null && "null".equals(this.getCtlHrFinDiario())) {
            conditions += " AND CTL_HR_FIN_DIARIO IS NULL";
        } else if (this.getCtlHrFinDiario() != null) {
            conditions += " AND CTL_HR_FIN_DIARIO = ?";
            values.add(this.getCtlHrFinDiario());
        }

        if (this.getCtlCveFinSemana() != null && this.getCtlCveFinSemana().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_SEMANA IS NULL";
        } else if (this.getCtlCveFinSemana() != null) {
            conditions += " AND CTL_CVE_FIN_SEMANA = ?";
            values.add(this.getCtlCveFinSemana());
        }

        if (this.getCtlHrFinSemana() != null && "null".equals(this.getCtlHrFinSemana())) {
            conditions += " AND CTL_HR_FIN_SEMANA IS NULL";
        } else if (this.getCtlHrFinSemana() != null) {
            conditions += " AND CTL_HR_FIN_SEMANA = ?";
            values.add(this.getCtlHrFinSemana());
        }

        if (this.getCtlCveFinQuince() != null && this.getCtlCveFinQuince().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_QUINCE IS NULL";
        } else if (this.getCtlCveFinQuince() != null) {
            conditions += " AND CTL_CVE_FIN_QUINCE = ?";
            values.add(this.getCtlCveFinQuince());
        }

        if (this.getCtlHrFinQuince() != null && "null".equals(this.getCtlHrFinQuince())) {
            conditions += " AND CTL_HR_FIN_QUINCE IS NULL";
        } else if (this.getCtlHrFinQuince() != null) {
            conditions += " AND CTL_HR_FIN_QUINCE = ?";
            values.add(this.getCtlHrFinQuince());
        }

        if (this.getCtlCveFinMens() != null && this.getCtlCveFinMens().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_MENS IS NULL";
        } else if (this.getCtlCveFinMens() != null) {
            conditions += " AND CTL_CVE_FIN_MENS = ?";
            values.add(this.getCtlCveFinMens());
        }

        if (this.getCtlHrFinMens() != null && "null".equals(this.getCtlHrFinMens())) {
            conditions += " AND CTL_HR_FIN_MENS IS NULL";
        } else if (this.getCtlHrFinMens() != null) {
            conditions += " AND CTL_HR_FIN_MENS = ?";
            values.add(this.getCtlHrFinMens());
        }

        if (this.getCtlCveFinBimes() != null && this.getCtlCveFinBimes().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_BIMES IS NULL";
        } else if (this.getCtlCveFinBimes() != null) {
            conditions += " AND CTL_CVE_FIN_BIMES = ?";
            values.add(this.getCtlCveFinBimes());
        }

        if (this.getCtlHrFinBimes() != null && "null".equals(this.getCtlHrFinBimes())) {
            conditions += " AND CTL_HR_FIN_BIMES IS NULL";
        } else if (this.getCtlHrFinBimes() != null) {
            conditions += " AND CTL_HR_FIN_BIMES = ?";
            values.add(this.getCtlHrFinBimes());
        }

        if (this.getCtlCveFinTrimes() != null && this.getCtlCveFinTrimes().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_TRIMES IS NULL";
        } else if (this.getCtlCveFinTrimes() != null) {
            conditions += " AND CTL_CVE_FIN_TRIMES = ?";
            values.add(this.getCtlCveFinTrimes());
        }

        if (this.getCtlHrFinTrimes() != null && "null".equals(this.getCtlHrFinTrimes())) {
            conditions += " AND CTL_HR_FIN_TRIMES IS NULL";
        } else if (this.getCtlHrFinTrimes() != null) {
            conditions += " AND CTL_HR_FIN_TRIMES = ?";
            values.add(this.getCtlHrFinTrimes());
        }

        if (this.getCtlCveFinSemes() != null && this.getCtlCveFinSemes().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_SEMES IS NULL";
        } else if (this.getCtlCveFinSemes() != null) {
            conditions += " AND CTL_CVE_FIN_SEMES = ?";
            values.add(this.getCtlCveFinSemes());
        }

        if (this.getCtlHrFinSemes() != null && "null".equals(this.getCtlHrFinSemes())) {
            conditions += " AND CTL_HR_FIN_SEMES IS NULL";
        } else if (this.getCtlHrFinSemes() != null) {
            conditions += " AND CTL_HR_FIN_SEMES = ?";
            values.add(this.getCtlHrFinSemes());
        }

        if (this.getCtlCveFinAnual() != null && this.getCtlCveFinAnual().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_ANUAL IS NULL";
        } else if (this.getCtlCveFinAnual() != null) {
            conditions += " AND CTL_CVE_FIN_ANUAL = ?";
            values.add(this.getCtlCveFinAnual());
        }

        if (this.getCtlHoraFinAnual() != null && "null".equals(this.getCtlHoraFinAnual())) {
            conditions += " AND CTL_HORA_FIN_ANUAL IS NULL";
        } else if (this.getCtlHoraFinAnual() != null) {
            conditions += " AND CTL_HORA_FIN_ANUAL = ?";
            values.add(this.getCtlHoraFinAnual());
        }

        if (this.getCtlCveFinDia() != null && this.getCtlCveFinDia().longValue() == -999) {
            conditions += " AND CTL_CVE_FIN_DIA IS NULL";
        } else if (this.getCtlCveFinDia() != null) {
            conditions += " AND CTL_CVE_FIN_DIA = ?";
            values.add(this.getCtlCveFinDia());
        }

        if (this.getCtlHoraFinDia() != null && "null".equals(this.getCtlHoraFinDia())) {
            conditions += " AND CTL_HORA_FIN_DIA IS NULL";
        } else if (this.getCtlHoraFinDia() != null) {
            conditions += " AND CTL_HORA_FIN_DIA = ?";
            values.add(this.getCtlHoraFinDia());
        }

        if (this.getCtlAnoUltMod() != null && this.getCtlAnoUltMod().longValue() == -999) {
            conditions += " AND CTL_ANO_ULT_MOD IS NULL";
        } else if (this.getCtlAnoUltMod() != null) {
            conditions += " AND CTL_ANO_ULT_MOD = ?";
            values.add(this.getCtlAnoUltMod());
        }

        if (this.getCtlMesUltMod() != null && this.getCtlMesUltMod().longValue() == -999) {
            conditions += " AND CTL_MES_ULT_MOD IS NULL";
        } else if (this.getCtlMesUltMod() != null) {
            conditions += " AND CTL_MES_ULT_MOD = ?";
            values.add(this.getCtlMesUltMod());
        }

        if (this.getCtlDiaUltMod() != null && this.getCtlDiaUltMod().longValue() == -999) {
            conditions += " AND CTL_DIA_ULT_MOD IS NULL";
        } else if (this.getCtlDiaUltMod() != null) {
            conditions += " AND CTL_DIA_ULT_MOD = ?";
            values.add(this.getCtlDiaUltMod());
        }

        if (this.getCtlCveStControl() != null && "null".equals(this.getCtlCveStControl())) {
            conditions += " AND CTL_CVE_ST_CONTROL IS NULL";
        } else if (this.getCtlCveStControl() != null) {
            conditions += " AND CTL_CVE_ST_CONTROL = ?";
            values.add(this.getCtlCveStControl());
        }

        if (this.getCtlCveInternet() != null && this.getCtlCveInternet().longValue() == -999) {
            conditions += " AND CTL_CVE_INTERNET IS NULL";
        } else if (this.getCtlCveInternet() != null) {
            conditions += " AND CTL_CVE_INTERNET = ?";
            values.add(this.getCtlCveInternet());
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
        String sql = "UPDATE CONTROLA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTL_ANO_CONTROL = ?";
        pkValues.add(this.getCtlAnoControl());
        conditions += " AND CTL_MES_CONTROL = ?";
        pkValues.add(this.getCtlMesControl());
        conditions += " AND CTL_DIA_CONTROL = ?";
        pkValues.add(this.getCtlDiaControl());
        fields += " CTL_CVE_FIN_INICIO = ?, ";
        values.add(this.getCtlCveFinInicio());
        fields += " CTL_HR_FIN_INICIO = ?, ";
        values.add(this.getCtlHrFinInicio());
        fields += " CTL_CVE_FIN_CIERRE = ?, ";
        values.add(this.getCtlCveFinCierre());
        fields += " CTL_HR_FIN_CIERRE = ?, ";
        values.add(this.getCtlHrFinCierre());
        fields += " CTL_CVE_FIN_DIARIO = ?, ";
        values.add(this.getCtlCveFinDiario());
        fields += " CTL_HR_FIN_DIARIO = ?, ";
        values.add(this.getCtlHrFinDiario());
        fields += " CTL_CVE_FIN_SEMANA = ?, ";
        values.add(this.getCtlCveFinSemana());
        fields += " CTL_HR_FIN_SEMANA = ?, ";
        values.add(this.getCtlHrFinSemana());
        fields += " CTL_CVE_FIN_QUINCE = ?, ";
        values.add(this.getCtlCveFinQuince());
        fields += " CTL_HR_FIN_QUINCE = ?, ";
        values.add(this.getCtlHrFinQuince());
        fields += " CTL_CVE_FIN_MENS = ?, ";
        values.add(this.getCtlCveFinMens());
        fields += " CTL_HR_FIN_MENS = ?, ";
        values.add(this.getCtlHrFinMens());
        fields += " CTL_CVE_FIN_BIMES = ?, ";
        values.add(this.getCtlCveFinBimes());
        fields += " CTL_HR_FIN_BIMES = ?, ";
        values.add(this.getCtlHrFinBimes());
        fields += " CTL_CVE_FIN_TRIMES = ?, ";
        values.add(this.getCtlCveFinTrimes());
        fields += " CTL_HR_FIN_TRIMES = ?, ";
        values.add(this.getCtlHrFinTrimes());
        fields += " CTL_CVE_FIN_SEMES = ?, ";
        values.add(this.getCtlCveFinSemes());
        fields += " CTL_HR_FIN_SEMES = ?, ";
        values.add(this.getCtlHrFinSemes());
        fields += " CTL_CVE_FIN_ANUAL = ?, ";
        values.add(this.getCtlCveFinAnual());
        fields += " CTL_HORA_FIN_ANUAL = ?, ";
        values.add(this.getCtlHoraFinAnual());
        fields += " CTL_CVE_FIN_DIA = ?, ";
        values.add(this.getCtlCveFinDia());
        fields += " CTL_HORA_FIN_DIA = ?, ";
        values.add(this.getCtlHoraFinDia());
        fields += " CTL_ANO_ULT_MOD = ?, ";
        values.add(this.getCtlAnoUltMod());
        fields += " CTL_MES_ULT_MOD = ?, ";
        values.add(this.getCtlMesUltMod());
        fields += " CTL_DIA_ULT_MOD = ?, ";
        values.add(this.getCtlDiaUltMod());
        fields += " CTL_CVE_ST_CONTROL = ?, ";
        values.add(this.getCtlCveStControl());
        fields += " CTL_CVE_INTERNET = ?, ";
        values.add(this.getCtlCveInternet());
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
        String sql = "INSERT INTO CONTROLA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTL_ANO_CONTROL";
        fieldValues += ", ?";
        values.add(this.getCtlAnoControl());

        fields += ", CTL_MES_CONTROL";
        fieldValues += ", ?";
        values.add(this.getCtlMesControl());

        fields += ", CTL_DIA_CONTROL";
        fieldValues += ", ?";
        values.add(this.getCtlDiaControl());

        fields += ", CTL_CVE_FIN_INICIO";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinInicio());

        fields += ", CTL_HR_FIN_INICIO";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinInicio());

        fields += ", CTL_CVE_FIN_CIERRE";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinCierre());

        fields += ", CTL_HR_FIN_CIERRE";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinCierre());

        fields += ", CTL_CVE_FIN_DIARIO";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinDiario());

        fields += ", CTL_HR_FIN_DIARIO";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinDiario());

        fields += ", CTL_CVE_FIN_SEMANA";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinSemana());

        fields += ", CTL_HR_FIN_SEMANA";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinSemana());

        fields += ", CTL_CVE_FIN_QUINCE";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinQuince());

        fields += ", CTL_HR_FIN_QUINCE";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinQuince());

        fields += ", CTL_CVE_FIN_MENS";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinMens());

        fields += ", CTL_HR_FIN_MENS";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinMens());

        fields += ", CTL_CVE_FIN_BIMES";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinBimes());

        fields += ", CTL_HR_FIN_BIMES";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinBimes());

        fields += ", CTL_CVE_FIN_TRIMES";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinTrimes());

        fields += ", CTL_HR_FIN_TRIMES";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinTrimes());

        fields += ", CTL_CVE_FIN_SEMES";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinSemes());

        fields += ", CTL_HR_FIN_SEMES";
        fieldValues += ", ?";
        values.add(this.getCtlHrFinSemes());

        fields += ", CTL_CVE_FIN_ANUAL";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinAnual());

        fields += ", CTL_HORA_FIN_ANUAL";
        fieldValues += ", ?";
        values.add(this.getCtlHoraFinAnual());

        fields += ", CTL_CVE_FIN_DIA";
        fieldValues += ", ?";
        values.add(this.getCtlCveFinDia());

        fields += ", CTL_HORA_FIN_DIA";
        fieldValues += ", ?";
        values.add(this.getCtlHoraFinDia());

        fields += ", CTL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtlAnoUltMod());

        fields += ", CTL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtlMesUltMod());

        fields += ", CTL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtlDiaUltMod());

        fields += ", CTL_CVE_ST_CONTROL";
        fieldValues += ", ?";
        values.add(this.getCtlCveStControl());

        fields += ", CTL_CVE_INTERNET";
        fieldValues += ", ?";
        values.add(this.getCtlCveInternet());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONTROLA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTL_ANO_CONTROL = ?";
        values.add(this.getCtlAnoControl());
        conditions += " AND CTL_MES_CONTROL = ?";
        values.add(this.getCtlMesControl());
        conditions += " AND CTL_DIA_CONTROL = ?";
        values.add(this.getCtlDiaControl());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Controla instance = (Controla) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtlAnoControl().equals(instance.getCtlAnoControl()))
            equalObjects = false;
        if (equalObjects && !this.getCtlMesControl().equals(instance.getCtlMesControl()))
            equalObjects = false;
        if (equalObjects && !this.getCtlDiaControl().equals(instance.getCtlDiaControl()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinInicio().equals(instance.getCtlCveFinInicio()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinInicio().equals(instance.getCtlHrFinInicio()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinCierre().equals(instance.getCtlCveFinCierre()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinCierre().equals(instance.getCtlHrFinCierre()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinDiario().equals(instance.getCtlCveFinDiario()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinDiario().equals(instance.getCtlHrFinDiario()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinSemana().equals(instance.getCtlCveFinSemana()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinSemana().equals(instance.getCtlHrFinSemana()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinQuince().equals(instance.getCtlCveFinQuince()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinQuince().equals(instance.getCtlHrFinQuince()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinMens().equals(instance.getCtlCveFinMens()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinMens().equals(instance.getCtlHrFinMens()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinBimes().equals(instance.getCtlCveFinBimes()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinBimes().equals(instance.getCtlHrFinBimes()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinTrimes().equals(instance.getCtlCveFinTrimes()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinTrimes().equals(instance.getCtlHrFinTrimes()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinSemes().equals(instance.getCtlCveFinSemes()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHrFinSemes().equals(instance.getCtlHrFinSemes()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinAnual().equals(instance.getCtlCveFinAnual()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHoraFinAnual().equals(instance.getCtlHoraFinAnual()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveFinDia().equals(instance.getCtlCveFinDia()))
            equalObjects = false;
        if (equalObjects && !this.getCtlHoraFinDia().equals(instance.getCtlHoraFinDia()))
            equalObjects = false;
        if (equalObjects && !this.getCtlAnoUltMod().equals(instance.getCtlAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtlMesUltMod().equals(instance.getCtlMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtlDiaUltMod().equals(instance.getCtlDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveStControl().equals(instance.getCtlCveStControl()))
            equalObjects = false;
        if (equalObjects && !this.getCtlCveInternet().equals(instance.getCtlCveInternet()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Controla result = new Controla();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtlAnoControl((BigDecimal) objectData.getData("CTL_ANO_CONTROL"));
        result.setCtlMesControl((BigDecimal) objectData.getData("CTL_MES_CONTROL"));
        result.setCtlDiaControl((BigDecimal) objectData.getData("CTL_DIA_CONTROL"));
        result.setCtlCveFinInicio((BigDecimal) objectData.getData("CTL_CVE_FIN_INICIO"));
        result.setCtlHrFinInicio((String) objectData.getData("CTL_HR_FIN_INICIO"));
        result.setCtlCveFinCierre((BigDecimal) objectData.getData("CTL_CVE_FIN_CIERRE"));
        result.setCtlHrFinCierre((String) objectData.getData("CTL_HR_FIN_CIERRE"));
        result.setCtlCveFinDiario((BigDecimal) objectData.getData("CTL_CVE_FIN_DIARIO"));
        result.setCtlHrFinDiario((String) objectData.getData("CTL_HR_FIN_DIARIO"));
        result.setCtlCveFinSemana((BigDecimal) objectData.getData("CTL_CVE_FIN_SEMANA"));
        result.setCtlHrFinSemana((String) objectData.getData("CTL_HR_FIN_SEMANA"));
        result.setCtlCveFinQuince((BigDecimal) objectData.getData("CTL_CVE_FIN_QUINCE"));
        result.setCtlHrFinQuince((String) objectData.getData("CTL_HR_FIN_QUINCE"));
        result.setCtlCveFinMens((BigDecimal) objectData.getData("CTL_CVE_FIN_MENS"));
        result.setCtlHrFinMens((String) objectData.getData("CTL_HR_FIN_MENS"));
        result.setCtlCveFinBimes((BigDecimal) objectData.getData("CTL_CVE_FIN_BIMES"));
        result.setCtlHrFinBimes((String) objectData.getData("CTL_HR_FIN_BIMES"));
        result.setCtlCveFinTrimes((BigDecimal) objectData.getData("CTL_CVE_FIN_TRIMES"));
        result.setCtlHrFinTrimes((String) objectData.getData("CTL_HR_FIN_TRIMES"));
        result.setCtlCveFinSemes((BigDecimal) objectData.getData("CTL_CVE_FIN_SEMES"));
        result.setCtlHrFinSemes((String) objectData.getData("CTL_HR_FIN_SEMES"));
        result.setCtlCveFinAnual((BigDecimal) objectData.getData("CTL_CVE_FIN_ANUAL"));
        result.setCtlHoraFinAnual((String) objectData.getData("CTL_HORA_FIN_ANUAL"));
        result.setCtlCveFinDia((BigDecimal) objectData.getData("CTL_CVE_FIN_DIA"));
        result.setCtlHoraFinDia((String) objectData.getData("CTL_HORA_FIN_DIA"));
        result.setCtlAnoUltMod((BigDecimal) objectData.getData("CTL_ANO_ULT_MOD"));
        result.setCtlMesUltMod((BigDecimal) objectData.getData("CTL_MES_ULT_MOD"));
        result.setCtlDiaUltMod((BigDecimal) objectData.getData("CTL_DIA_ULT_MOD"));
        result.setCtlCveStControl((String) objectData.getData("CTL_CVE_ST_CONTROL"));
        result.setCtlCveInternet((BigDecimal) objectData.getData("CTL_CVE_INTERNET"));

        return result;

    }

}
