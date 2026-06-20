package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REP_BALANZA_DESGLOSADA_PK",
            columns =
            { "FRB_SECUENCIAL", "FRB_CVE_SAL_ASI", "FRB_NUM_AUX1", "FRB_FECHA", "FRB_NUM_CTAM", "FRB_NUM_SCTA", "FRB_NUM_SSCTA", "FRB_NUM_SSSCTA", "FRB_NUM_SSSSCTA",
              "FRB_NUM_SSSSSCTA", "FRB_NUM_AUX2", "FRB_NUM_AUX3"
    }, sequences = { "MANUAL" })
public class FRepBalanzaDesglosada extends DomainObject {

    BigDecimal frbSecuencial = null;
    String frbCveSalAsi = null;
    BigDecimal frbNumAux1 = null;
    String frbFecha = null;
    BigDecimal frbNumCtam = null;
    BigDecimal frbNumScta = null;
    BigDecimal frbNumSscta = null;
    BigDecimal frbNumSsscta = null;
    BigDecimal frbNumSssscta = null;
    BigDecimal frbNumSsssscta = null;
    BigDecimal frbNumAux2 = null;
    BigDecimal frbNumAux3 = null;
    BigDecimal frbFolioOpera = null;
    String frbDescAsiento = null;
    BigDecimal frbCargos = null;
    BigDecimal frbAbonos = null;
    BigDecimal frbSalIni = null;
    String frbCtoNomContrato = null;
    String frbUsuario = null;

    public FRepBalanzaDesglosada() {
        super();
        this.pkColumns = 12;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrbSecuencial(BigDecimal frbSecuencial) {
        this.frbSecuencial = frbSecuencial;
    }

    public BigDecimal getFrbSecuencial() {
        return this.frbSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrbCveSalAsi(String frbCveSalAsi) {
        this.frbCveSalAsi = frbCveSalAsi;
    }

    public String getFrbCveSalAsi() {
        return this.frbCveSalAsi;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumAux1(BigDecimal frbNumAux1) {
        this.frbNumAux1 = frbNumAux1;
    }

    public BigDecimal getFrbNumAux1() {
        return this.frbNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFrbFecha(String frbFecha) {
        this.frbFecha = frbFecha;
    }

    public String getFrbFecha() {
        return this.frbFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumCtam(BigDecimal frbNumCtam) {
        this.frbNumCtam = frbNumCtam;
    }

    public BigDecimal getFrbNumCtam() {
        return this.frbNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumScta(BigDecimal frbNumScta) {
        this.frbNumScta = frbNumScta;
    }

    public BigDecimal getFrbNumScta() {
        return this.frbNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumSscta(BigDecimal frbNumSscta) {
        this.frbNumSscta = frbNumSscta;
    }

    public BigDecimal getFrbNumSscta() {
        return this.frbNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumSsscta(BigDecimal frbNumSsscta) {
        this.frbNumSsscta = frbNumSsscta;
    }

    public BigDecimal getFrbNumSsscta() {
        return this.frbNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumSssscta(BigDecimal frbNumSssscta) {
        this.frbNumSssscta = frbNumSssscta;
    }

    public BigDecimal getFrbNumSssscta() {
        return this.frbNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumSsssscta(BigDecimal frbNumSsssscta) {
        this.frbNumSsssscta = frbNumSsssscta;
    }

    public BigDecimal getFrbNumSsssscta() {
        return this.frbNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumAux2(BigDecimal frbNumAux2) {
        this.frbNumAux2 = frbNumAux2;
    }

    public BigDecimal getFrbNumAux2() {
        return this.frbNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setFrbNumAux3(BigDecimal frbNumAux3) {
        this.frbNumAux3 = frbNumAux3;
    }

    public BigDecimal getFrbNumAux3() {
        return this.frbNumAux3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrbFolioOpera(BigDecimal frbFolioOpera) {
        this.frbFolioOpera = frbFolioOpera;
    }

    public BigDecimal getFrbFolioOpera() {
        return this.frbFolioOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrbDescAsiento(String frbDescAsiento) {
        this.frbDescAsiento = frbDescAsiento;
    }

    public String getFrbDescAsiento() {
        return this.frbDescAsiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFrbCargos(BigDecimal frbCargos) {
        this.frbCargos = frbCargos;
    }

    public BigDecimal getFrbCargos() {
        return this.frbCargos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFrbAbonos(BigDecimal frbAbonos) {
        this.frbAbonos = frbAbonos;
    }

    public BigDecimal getFrbAbonos() {
        return this.frbAbonos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFrbSalIni(BigDecimal frbSalIni) {
        this.frbSalIni = frbSalIni;
    }

    public BigDecimal getFrbSalIni() {
        return this.frbSalIni;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrbCtoNomContrato(String frbCtoNomContrato) {
        this.frbCtoNomContrato = frbCtoNomContrato;
    }

    public String getFrbCtoNomContrato() {
        return this.frbCtoNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrbUsuario(String frbUsuario) {
        this.frbUsuario = frbUsuario;
    }

    public String getFrbUsuario() {
        return this.frbUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_BALANZA_DESGLOSADA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrbSecuencial() != null && this.getFrbSecuencial().longValue() == -999) {
            conditions += " AND FRB_SECUENCIAL IS NULL";
        } else if (this.getFrbSecuencial() != null) {
            conditions += " AND FRB_SECUENCIAL = ?";
            values.add(this.getFrbSecuencial());
        }

        if (this.getFrbCveSalAsi() != null && "null".equals(this.getFrbCveSalAsi())) {
            conditions += " AND FRB_CVE_SAL_ASI IS NULL";
        } else if (this.getFrbCveSalAsi() != null) {
            conditions += " AND FRB_CVE_SAL_ASI = ?";
            values.add(this.getFrbCveSalAsi());
        }

        if (this.getFrbNumAux1() != null && this.getFrbNumAux1().longValue() == -999) {
            conditions += " AND FRB_NUM_AUX1 IS NULL";
        } else if (this.getFrbNumAux1() != null) {
            conditions += " AND FRB_NUM_AUX1 = ?";
            values.add(this.getFrbNumAux1());
        }

        if (this.getFrbFecha() != null && "null".equals(this.getFrbFecha())) {
            conditions += " AND FRB_FECHA IS NULL";
        } else if (this.getFrbFecha() != null) {
            conditions += " AND FRB_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFrbFecha());
        }

        if (this.getFrbNumCtam() != null && this.getFrbNumCtam().longValue() == -999) {
            conditions += " AND FRB_NUM_CTAM IS NULL";
        } else if (this.getFrbNumCtam() != null) {
            conditions += " AND FRB_NUM_CTAM = ?";
            values.add(this.getFrbNumCtam());
        }

        if (this.getFrbNumScta() != null && this.getFrbNumScta().longValue() == -999) {
            conditions += " AND FRB_NUM_SCTA IS NULL";
        } else if (this.getFrbNumScta() != null) {
            conditions += " AND FRB_NUM_SCTA = ?";
            values.add(this.getFrbNumScta());
        }

        if (this.getFrbNumSscta() != null && this.getFrbNumSscta().longValue() == -999) {
            conditions += " AND FRB_NUM_SSCTA IS NULL";
        } else if (this.getFrbNumSscta() != null) {
            conditions += " AND FRB_NUM_SSCTA = ?";
            values.add(this.getFrbNumSscta());
        }

        if (this.getFrbNumSsscta() != null && this.getFrbNumSsscta().longValue() == -999) {
            conditions += " AND FRB_NUM_SSSCTA IS NULL";
        } else if (this.getFrbNumSsscta() != null) {
            conditions += " AND FRB_NUM_SSSCTA = ?";
            values.add(this.getFrbNumSsscta());
        }

        if (this.getFrbNumSssscta() != null && this.getFrbNumSssscta().longValue() == -999) {
            conditions += " AND FRB_NUM_SSSSCTA IS NULL";
        } else if (this.getFrbNumSssscta() != null) {
            conditions += " AND FRB_NUM_SSSSCTA = ?";
            values.add(this.getFrbNumSssscta());
        }

        if (this.getFrbNumSsssscta() != null && this.getFrbNumSsssscta().longValue() == -999) {
            conditions += " AND FRB_NUM_SSSSSCTA IS NULL";
        } else if (this.getFrbNumSsssscta() != null) {
            conditions += " AND FRB_NUM_SSSSSCTA = ?";
            values.add(this.getFrbNumSsssscta());
        }

        if (this.getFrbNumAux2() != null && this.getFrbNumAux2().longValue() == -999) {
            conditions += " AND FRB_NUM_AUX2 IS NULL";
        } else if (this.getFrbNumAux2() != null) {
            conditions += " AND FRB_NUM_AUX2 = ?";
            values.add(this.getFrbNumAux2());
        }

        if (this.getFrbNumAux3() != null && this.getFrbNumAux3().longValue() == -999) {
            conditions += " AND FRB_NUM_AUX3 IS NULL";
        } else if (this.getFrbNumAux3() != null) {
            conditions += " AND FRB_NUM_AUX3 = ?";
            values.add(this.getFrbNumAux3());
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
        String sql = "SELECT * FROM F_REP_BALANZA_DESGLOSADA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrbSecuencial() != null && this.getFrbSecuencial().longValue() == -999) {
            conditions += " AND FRB_SECUENCIAL IS NULL";
        } else if (this.getFrbSecuencial() != null) {
            conditions += " AND FRB_SECUENCIAL = ?";
            values.add(this.getFrbSecuencial());
        }

        if (this.getFrbCveSalAsi() != null && "null".equals(this.getFrbCveSalAsi())) {
            conditions += " AND FRB_CVE_SAL_ASI IS NULL";
        } else if (this.getFrbCveSalAsi() != null) {
            conditions += " AND FRB_CVE_SAL_ASI = ?";
            values.add(this.getFrbCveSalAsi());
        }

        if (this.getFrbNumAux1() != null && this.getFrbNumAux1().longValue() == -999) {
            conditions += " AND FRB_NUM_AUX1 IS NULL";
        } else if (this.getFrbNumAux1() != null) {
            conditions += " AND FRB_NUM_AUX1 = ?";
            values.add(this.getFrbNumAux1());
        }

        if (this.getFrbFecha() != null && "null".equals(this.getFrbFecha())) {
            conditions += " AND FRB_FECHA IS NULL";
        } else if (this.getFrbFecha() != null) {
            conditions += " AND FRB_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFrbFecha());
        }

        if (this.getFrbNumCtam() != null && this.getFrbNumCtam().longValue() == -999) {
            conditions += " AND FRB_NUM_CTAM IS NULL";
        } else if (this.getFrbNumCtam() != null) {
            conditions += " AND FRB_NUM_CTAM = ?";
            values.add(this.getFrbNumCtam());
        }

        if (this.getFrbNumScta() != null && this.getFrbNumScta().longValue() == -999) {
            conditions += " AND FRB_NUM_SCTA IS NULL";
        } else if (this.getFrbNumScta() != null) {
            conditions += " AND FRB_NUM_SCTA = ?";
            values.add(this.getFrbNumScta());
        }

        if (this.getFrbNumSscta() != null && this.getFrbNumSscta().longValue() == -999) {
            conditions += " AND FRB_NUM_SSCTA IS NULL";
        } else if (this.getFrbNumSscta() != null) {
            conditions += " AND FRB_NUM_SSCTA = ?";
            values.add(this.getFrbNumSscta());
        }

        if (this.getFrbNumSsscta() != null && this.getFrbNumSsscta().longValue() == -999) {
            conditions += " AND FRB_NUM_SSSCTA IS NULL";
        } else if (this.getFrbNumSsscta() != null) {
            conditions += " AND FRB_NUM_SSSCTA = ?";
            values.add(this.getFrbNumSsscta());
        }

        if (this.getFrbNumSssscta() != null && this.getFrbNumSssscta().longValue() == -999) {
            conditions += " AND FRB_NUM_SSSSCTA IS NULL";
        } else if (this.getFrbNumSssscta() != null) {
            conditions += " AND FRB_NUM_SSSSCTA = ?";
            values.add(this.getFrbNumSssscta());
        }

        if (this.getFrbNumSsssscta() != null && this.getFrbNumSsssscta().longValue() == -999) {
            conditions += " AND FRB_NUM_SSSSSCTA IS NULL";
        } else if (this.getFrbNumSsssscta() != null) {
            conditions += " AND FRB_NUM_SSSSSCTA = ?";
            values.add(this.getFrbNumSsssscta());
        }

        if (this.getFrbNumAux2() != null && this.getFrbNumAux2().longValue() == -999) {
            conditions += " AND FRB_NUM_AUX2 IS NULL";
        } else if (this.getFrbNumAux2() != null) {
            conditions += " AND FRB_NUM_AUX2 = ?";
            values.add(this.getFrbNumAux2());
        }

        if (this.getFrbNumAux3() != null && this.getFrbNumAux3().longValue() == -999) {
            conditions += " AND FRB_NUM_AUX3 IS NULL";
        } else if (this.getFrbNumAux3() != null) {
            conditions += " AND FRB_NUM_AUX3 = ?";
            values.add(this.getFrbNumAux3());
        }

        if (this.getFrbFolioOpera() != null && this.getFrbFolioOpera().longValue() == -999) {
            conditions += " AND FRB_FOLIO_OPERA IS NULL";
        } else if (this.getFrbFolioOpera() != null) {
            conditions += " AND FRB_FOLIO_OPERA = ?";
            values.add(this.getFrbFolioOpera());
        }

        if (this.getFrbDescAsiento() != null && "null".equals(this.getFrbDescAsiento())) {
            conditions += " AND FRB_DESC_ASIENTO IS NULL";
        } else if (this.getFrbDescAsiento() != null) {
            conditions += " AND FRB_DESC_ASIENTO = ?";
            values.add(this.getFrbDescAsiento());
        }

        if (this.getFrbCargos() != null && this.getFrbCargos().longValue() == -999) {
            conditions += " AND FRB_CARGOS IS NULL";
        } else if (this.getFrbCargos() != null) {
            conditions += " AND FRB_CARGOS = ?";
            values.add(this.getFrbCargos());
        }

        if (this.getFrbAbonos() != null && this.getFrbAbonos().longValue() == -999) {
            conditions += " AND FRB_ABONOS IS NULL";
        } else if (this.getFrbAbonos() != null) {
            conditions += " AND FRB_ABONOS = ?";
            values.add(this.getFrbAbonos());
        }

        if (this.getFrbSalIni() != null && this.getFrbSalIni().longValue() == -999) {
            conditions += " AND FRB_SAL_INI IS NULL";
        } else if (this.getFrbSalIni() != null) {
            conditions += " AND FRB_SAL_INI = ?";
            values.add(this.getFrbSalIni());
        }

        if (this.getFrbCtoNomContrato() != null && "null".equals(this.getFrbCtoNomContrato())) {
            conditions += " AND FRB_CTO_NOM_CONTRATO IS NULL";
        } else if (this.getFrbCtoNomContrato() != null) {
            conditions += " AND FRB_CTO_NOM_CONTRATO = ?";
            values.add(this.getFrbCtoNomContrato());
        }

        if (this.getFrbUsuario() != null && "null".equals(this.getFrbUsuario())) {
            conditions += " AND FRB_USUARIO IS NULL";
        } else if (this.getFrbUsuario() != null) {
            conditions += " AND FRB_USUARIO = ?";
            values.add(this.getFrbUsuario());
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
        String sql = "UPDATE F_REP_BALANZA_DESGLOSADA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FRB_SECUENCIAL = ?";
        pkValues.add(this.getFrbSecuencial());
        conditions += " AND FRB_CVE_SAL_ASI = ?";
        pkValues.add(this.getFrbCveSalAsi());
        conditions += " AND FRB_NUM_AUX1 = ?";
        pkValues.add(this.getFrbNumAux1());
        conditions += " AND FRB_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFrbFecha());
        conditions += " AND FRB_NUM_CTAM = ?";
        pkValues.add(this.getFrbNumCtam());
        conditions += " AND FRB_NUM_SCTA = ?";
        pkValues.add(this.getFrbNumScta());
        conditions += " AND FRB_NUM_SSCTA = ?";
        pkValues.add(this.getFrbNumSscta());
        conditions += " AND FRB_NUM_SSSCTA = ?";
        pkValues.add(this.getFrbNumSsscta());
        conditions += " AND FRB_NUM_SSSSCTA = ?";
        pkValues.add(this.getFrbNumSssscta());
        conditions += " AND FRB_NUM_SSSSSCTA = ?";
        pkValues.add(this.getFrbNumSsssscta());
        conditions += " AND FRB_NUM_AUX2 = ?";
        pkValues.add(this.getFrbNumAux2());
        conditions += " AND FRB_NUM_AUX3 = ?";
        pkValues.add(this.getFrbNumAux3());
        fields += " FRB_FOLIO_OPERA = ?, ";
        values.add(this.getFrbFolioOpera());
        fields += " FRB_DESC_ASIENTO = ?, ";
        values.add(this.getFrbDescAsiento());
        fields += " FRB_CARGOS = ?, ";
        values.add(this.getFrbCargos());
        fields += " FRB_ABONOS = ?, ";
        values.add(this.getFrbAbonos());
        fields += " FRB_SAL_INI = ?, ";
        values.add(this.getFrbSalIni());
        fields += " FRB_CTO_NOM_CONTRATO = ?, ";
        values.add(this.getFrbCtoNomContrato());
        fields += " FRB_USUARIO = ?, ";
        values.add(this.getFrbUsuario());
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
        String sql = "INSERT INTO F_REP_BALANZA_DESGLOSADA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRB_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFrbSecuencial());

        fields += ", FRB_CVE_SAL_ASI";
        fieldValues += ", ?";
        values.add(this.getFrbCveSalAsi());

        fields += ", FRB_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getFrbNumAux1());

        fields += ", FRB_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFrbFecha());

        fields += ", FRB_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getFrbNumCtam());

        fields += ", FRB_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getFrbNumScta());

        fields += ", FRB_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getFrbNumSscta());

        fields += ", FRB_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getFrbNumSsscta());

        fields += ", FRB_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getFrbNumSssscta());

        fields += ", FRB_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getFrbNumSsssscta());

        fields += ", FRB_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getFrbNumAux2());

        fields += ", FRB_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getFrbNumAux3());

        fields += ", FRB_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getFrbFolioOpera());

        fields += ", FRB_DESC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getFrbDescAsiento());

        fields += ", FRB_CARGOS";
        fieldValues += ", ?";
        values.add(this.getFrbCargos());

        fields += ", FRB_ABONOS";
        fieldValues += ", ?";
        values.add(this.getFrbAbonos());

        fields += ", FRB_SAL_INI";
        fieldValues += ", ?";
        values.add(this.getFrbSalIni());

        fields += ", FRB_CTO_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFrbCtoNomContrato());

        fields += ", FRB_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFrbUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REP_BALANZA_DESGLOSADA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FRB_SECUENCIAL = ?";
        values.add(this.getFrbSecuencial());
        conditions += " AND FRB_CVE_SAL_ASI = ?";
        values.add(this.getFrbCveSalAsi());
        conditions += " AND FRB_NUM_AUX1 = ?";
        values.add(this.getFrbNumAux1());
        conditions += " AND FRB_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFrbFecha());
        conditions += " AND FRB_NUM_CTAM = ?";
        values.add(this.getFrbNumCtam());
        conditions += " AND FRB_NUM_SCTA = ?";
        values.add(this.getFrbNumScta());
        conditions += " AND FRB_NUM_SSCTA = ?";
        values.add(this.getFrbNumSscta());
        conditions += " AND FRB_NUM_SSSCTA = ?";
        values.add(this.getFrbNumSsscta());
        conditions += " AND FRB_NUM_SSSSCTA = ?";
        values.add(this.getFrbNumSssscta());
        conditions += " AND FRB_NUM_SSSSSCTA = ?";
        values.add(this.getFrbNumSsssscta());
        conditions += " AND FRB_NUM_AUX2 = ?";
        values.add(this.getFrbNumAux2());
        conditions += " AND FRB_NUM_AUX3 = ?";
        values.add(this.getFrbNumAux3());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepBalanzaDesglosada instance = (FRepBalanzaDesglosada) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrbSecuencial().equals(instance.getFrbSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFrbCveSalAsi().equals(instance.getFrbCveSalAsi()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumAux1().equals(instance.getFrbNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getFrbFecha().equals(instance.getFrbFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumCtam().equals(instance.getFrbNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumScta().equals(instance.getFrbNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumSscta().equals(instance.getFrbNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumSsscta().equals(instance.getFrbNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumSssscta().equals(instance.getFrbNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumSsssscta().equals(instance.getFrbNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumAux2().equals(instance.getFrbNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getFrbNumAux3().equals(instance.getFrbNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getFrbFolioOpera().equals(instance.getFrbFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getFrbDescAsiento().equals(instance.getFrbDescAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getFrbCargos().equals(instance.getFrbCargos()))
            equalObjects = false;
        if (equalObjects && !this.getFrbAbonos().equals(instance.getFrbAbonos()))
            equalObjects = false;
        if (equalObjects && !this.getFrbSalIni().equals(instance.getFrbSalIni()))
            equalObjects = false;
        if (equalObjects && !this.getFrbCtoNomContrato().equals(instance.getFrbCtoNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFrbUsuario().equals(instance.getFrbUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepBalanzaDesglosada result = new FRepBalanzaDesglosada();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFrbSecuencial((BigDecimal) objectData.getData("FRB_SECUENCIAL"));
        result.setFrbCveSalAsi((String) objectData.getData("FRB_CVE_SAL_ASI"));
        result.setFrbNumAux1((BigDecimal) objectData.getData("FRB_NUM_AUX1"));
        result.setFrbFecha((String) objectData.getData("FRB_FECHA"));
        result.setFrbNumCtam((BigDecimal) objectData.getData("FRB_NUM_CTAM"));
        result.setFrbNumScta((BigDecimal) objectData.getData("FRB_NUM_SCTA"));
        result.setFrbNumSscta((BigDecimal) objectData.getData("FRB_NUM_SSCTA"));
        result.setFrbNumSsscta((BigDecimal) objectData.getData("FRB_NUM_SSSCTA"));
        result.setFrbNumSssscta((BigDecimal) objectData.getData("FRB_NUM_SSSSCTA"));
        result.setFrbNumSsssscta((BigDecimal) objectData.getData("FRB_NUM_SSSSSCTA"));
        result.setFrbNumAux2((BigDecimal) objectData.getData("FRB_NUM_AUX2"));
        result.setFrbNumAux3((BigDecimal) objectData.getData("FRB_NUM_AUX3"));
        result.setFrbFolioOpera((BigDecimal) objectData.getData("FRB_FOLIO_OPERA"));
        result.setFrbDescAsiento((String) objectData.getData("FRB_DESC_ASIENTO"));
        result.setFrbCargos((BigDecimal) objectData.getData("FRB_CARGOS"));
        result.setFrbAbonos((BigDecimal) objectData.getData("FRB_ABONOS"));
        result.setFrbSalIni((BigDecimal) objectData.getData("FRB_SAL_INI"));
        result.setFrbCtoNomContrato((String) objectData.getData("FRB_CTO_NOM_CONTRATO"));
        result.setFrbUsuario((String) objectData.getData("FRB_USUARIO"));

        return result;

    }

}
