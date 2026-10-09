package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CPADIR_PK",
            columns =
            { "CPD_FOLIO_OPERA", "CPD_NUM_CORTE", "CPD_NUM_CONTRATO", "CPD_SUB_CONTRATO", "CPD_CVE_TIPO_MERCA", "CPD_NUM_INSTRUME", "CPD_NUM_SEC_EMIS", "CPD_CONTRATO_INTER",
              "CPD_ENTIDAD_FIN"
    }, sequences = { "MANUAL" })
public class Cpadir extends DomainObject {

    BigDecimal cpdFolioOpera = null;
    BigDecimal cpdNumCorte = null;
    BigDecimal cpdNumContrato = null;
    BigDecimal cpdSubContrato = null;
    String cpdCveTipoOper = null;
    BigDecimal cpdNumInstrume = null;
    BigDecimal cpdNumSecEmis = null;
    BigDecimal cpdEntidadFin = null;
    BigDecimal cpdContratoInter = null;
    BigDecimal cpdCveTipoMerca = null;
    String cpdNomPizarra = null;
    String cpdSerieEmision = null;
    BigDecimal cpdNumCupon = null;
    String cpdCveFormaNeg = null;
    BigDecimal cpdNumPlazo = null;
    BigDecimal cpdImpAsignado = null;
    BigDecimal cpdImpDisponible = null;
    BigDecimal cpdImpSugerido = null;
    String cpdCveStCpadir = null;
    BigDecimal cpdNumMoneda = null;

    public Cpadir() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdFolioOpera(BigDecimal cpdFolioOpera) {
        this.cpdFolioOpera = cpdFolioOpera;
    }

    public BigDecimal getCpdFolioOpera() {
        return this.cpdFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumCorte(BigDecimal cpdNumCorte) {
        this.cpdNumCorte = cpdNumCorte;
    }

    public BigDecimal getCpdNumCorte() {
        return this.cpdNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumContrato(BigDecimal cpdNumContrato) {
        this.cpdNumContrato = cpdNumContrato;
    }

    public BigDecimal getCpdNumContrato() {
        return this.cpdNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdSubContrato(BigDecimal cpdSubContrato) {
        this.cpdSubContrato = cpdSubContrato;
    }

    public BigDecimal getCpdSubContrato() {
        return this.cpdSubContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdCveTipoOper(String cpdCveTipoOper) {
        this.cpdCveTipoOper = cpdCveTipoOper;
    }

    public String getCpdCveTipoOper() {
        return this.cpdCveTipoOper;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumInstrume(BigDecimal cpdNumInstrume) {
        this.cpdNumInstrume = cpdNumInstrume;
    }

    public BigDecimal getCpdNumInstrume() {
        return this.cpdNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumSecEmis(BigDecimal cpdNumSecEmis) {
        this.cpdNumSecEmis = cpdNumSecEmis;
    }

    public BigDecimal getCpdNumSecEmis() {
        return this.cpdNumSecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdEntidadFin(BigDecimal cpdEntidadFin) {
        this.cpdEntidadFin = cpdEntidadFin;
    }

    public BigDecimal getCpdEntidadFin() {
        return this.cpdEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdContratoInter(BigDecimal cpdContratoInter) {
        this.cpdContratoInter = cpdContratoInter;
    }

    public BigDecimal getCpdContratoInter() {
        return this.cpdContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdCveTipoMerca(BigDecimal cpdCveTipoMerca) {
        this.cpdCveTipoMerca = cpdCveTipoMerca;
    }

    public BigDecimal getCpdCveTipoMerca() {
        return this.cpdCveTipoMerca;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdNomPizarra(String cpdNomPizarra) {
        this.cpdNomPizarra = cpdNomPizarra;
    }

    public String getCpdNomPizarra() {
        return this.cpdNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdSerieEmision(String cpdSerieEmision) {
        this.cpdSerieEmision = cpdSerieEmision;
    }

    public String getCpdSerieEmision() {
        return this.cpdSerieEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumCupon(BigDecimal cpdNumCupon) {
        this.cpdNumCupon = cpdNumCupon;
    }

    public BigDecimal getCpdNumCupon() {
        return this.cpdNumCupon;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdCveFormaNeg(String cpdCveFormaNeg) {
        this.cpdCveFormaNeg = cpdCveFormaNeg;
    }

    public String getCpdCveFormaNeg() {
        return this.cpdCveFormaNeg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumPlazo(BigDecimal cpdNumPlazo) {
        this.cpdNumPlazo = cpdNumPlazo;
    }

    public BigDecimal getCpdNumPlazo() {
        return this.cpdNumPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpdImpAsignado(BigDecimal cpdImpAsignado) {
        this.cpdImpAsignado = cpdImpAsignado;
    }

    public BigDecimal getCpdImpAsignado() {
        return this.cpdImpAsignado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpdImpDisponible(BigDecimal cpdImpDisponible) {
        this.cpdImpDisponible = cpdImpDisponible;
    }

    public BigDecimal getCpdImpDisponible() {
        return this.cpdImpDisponible;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpdImpSugerido(BigDecimal cpdImpSugerido) {
        this.cpdImpSugerido = cpdImpSugerido;
    }

    public BigDecimal getCpdImpSugerido() {
        return this.cpdImpSugerido;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdCveStCpadir(String cpdCveStCpadir) {
        this.cpdCveStCpadir = cpdCveStCpadir;
    }

    public String getCpdCveStCpadir() {
        return this.cpdCveStCpadir;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumMoneda(BigDecimal cpdNumMoneda) {
        this.cpdNumMoneda = cpdNumMoneda;
    }

    public BigDecimal getCpdNumMoneda() {
        return this.cpdNumMoneda;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CPADIR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpdFolioOpera() != null && this.getCpdFolioOpera().longValue() == -999) {
            conditions += " AND CPD_FOLIO_OPERA IS NULL";
        } else if (this.getCpdFolioOpera() != null) {
            conditions += " AND CPD_FOLIO_OPERA = ?";
            values.add(this.getCpdFolioOpera());
        }

        if (this.getCpdNumCorte() != null && this.getCpdNumCorte().longValue() == -999) {
            conditions += " AND CPD_NUM_CORTE IS NULL";
        } else if (this.getCpdNumCorte() != null) {
            conditions += " AND CPD_NUM_CORTE = ?";
            values.add(this.getCpdNumCorte());
        }

        if (this.getCpdNumContrato() != null && this.getCpdNumContrato().longValue() == -999) {
            conditions += " AND CPD_NUM_CONTRATO IS NULL";
        } else if (this.getCpdNumContrato() != null) {
            conditions += " AND CPD_NUM_CONTRATO = ?";
            values.add(this.getCpdNumContrato());
        }

        if (this.getCpdSubContrato() != null && this.getCpdSubContrato().longValue() == -999) {
            conditions += " AND CPD_SUB_CONTRATO IS NULL";
        } else if (this.getCpdSubContrato() != null) {
            conditions += " AND CPD_SUB_CONTRATO = ?";
            values.add(this.getCpdSubContrato());
        }

        if (this.getCpdNumInstrume() != null && this.getCpdNumInstrume().longValue() == -999) {
            conditions += " AND CPD_NUM_INSTRUME IS NULL";
        } else if (this.getCpdNumInstrume() != null) {
            conditions += " AND CPD_NUM_INSTRUME = ?";
            values.add(this.getCpdNumInstrume());
        }

        if (this.getCpdNumSecEmis() != null && this.getCpdNumSecEmis().longValue() == -999) {
            conditions += " AND CPD_NUM_SEC_EMIS IS NULL";
        } else if (this.getCpdNumSecEmis() != null) {
            conditions += " AND CPD_NUM_SEC_EMIS = ?";
            values.add(this.getCpdNumSecEmis());
        }

        if (this.getCpdEntidadFin() != null && this.getCpdEntidadFin().longValue() == -999) {
            conditions += " AND CPD_ENTIDAD_FIN IS NULL";
        } else if (this.getCpdEntidadFin() != null) {
            conditions += " AND CPD_ENTIDAD_FIN = ?";
            values.add(this.getCpdEntidadFin());
        }

        if (this.getCpdContratoInter() != null && this.getCpdContratoInter().longValue() == -999) {
            conditions += " AND CPD_CONTRATO_INTER IS NULL";
        } else if (this.getCpdContratoInter() != null) {
            conditions += " AND CPD_CONTRATO_INTER = ?";
            values.add(this.getCpdContratoInter());
        }

        if (this.getCpdCveTipoMerca() != null && this.getCpdCveTipoMerca().longValue() == -999) {
            conditions += " AND CPD_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCpdCveTipoMerca() != null) {
            conditions += " AND CPD_CVE_TIPO_MERCA = ?";
            values.add(this.getCpdCveTipoMerca());
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
        String sql = "SELECT * FROM CPADIR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpdFolioOpera() != null && this.getCpdFolioOpera().longValue() == -999) {
            conditions += " AND CPD_FOLIO_OPERA IS NULL";
        } else if (this.getCpdFolioOpera() != null) {
            conditions += " AND CPD_FOLIO_OPERA = ?";
            values.add(this.getCpdFolioOpera());
        }

        if (this.getCpdNumCorte() != null && this.getCpdNumCorte().longValue() == -999) {
            conditions += " AND CPD_NUM_CORTE IS NULL";
        } else if (this.getCpdNumCorte() != null) {
            conditions += " AND CPD_NUM_CORTE = ?";
            values.add(this.getCpdNumCorte());
        }

        if (this.getCpdNumContrato() != null && this.getCpdNumContrato().longValue() == -999) {
            conditions += " AND CPD_NUM_CONTRATO IS NULL";
        } else if (this.getCpdNumContrato() != null) {
            conditions += " AND CPD_NUM_CONTRATO = ?";
            values.add(this.getCpdNumContrato());
        }

        if (this.getCpdSubContrato() != null && this.getCpdSubContrato().longValue() == -999) {
            conditions += " AND CPD_SUB_CONTRATO IS NULL";
        } else if (this.getCpdSubContrato() != null) {
            conditions += " AND CPD_SUB_CONTRATO = ?";
            values.add(this.getCpdSubContrato());
        }

        if (this.getCpdCveTipoOper() != null && "null".equals(this.getCpdCveTipoOper())) {
            conditions += " AND CPD_CVE_TIPO_OPER IS NULL";
        } else if (this.getCpdCveTipoOper() != null) {
            conditions += " AND CPD_CVE_TIPO_OPER = ?";
            values.add(this.getCpdCveTipoOper());
        }

        if (this.getCpdNumInstrume() != null && this.getCpdNumInstrume().longValue() == -999) {
            conditions += " AND CPD_NUM_INSTRUME IS NULL";
        } else if (this.getCpdNumInstrume() != null) {
            conditions += " AND CPD_NUM_INSTRUME = ?";
            values.add(this.getCpdNumInstrume());
        }

        if (this.getCpdNumSecEmis() != null && this.getCpdNumSecEmis().longValue() == -999) {
            conditions += " AND CPD_NUM_SEC_EMIS IS NULL";
        } else if (this.getCpdNumSecEmis() != null) {
            conditions += " AND CPD_NUM_SEC_EMIS = ?";
            values.add(this.getCpdNumSecEmis());
        }

        if (this.getCpdEntidadFin() != null && this.getCpdEntidadFin().longValue() == -999) {
            conditions += " AND CPD_ENTIDAD_FIN IS NULL";
        } else if (this.getCpdEntidadFin() != null) {
            conditions += " AND CPD_ENTIDAD_FIN = ?";
            values.add(this.getCpdEntidadFin());
        }

        if (this.getCpdContratoInter() != null && this.getCpdContratoInter().longValue() == -999) {
            conditions += " AND CPD_CONTRATO_INTER IS NULL";
        } else if (this.getCpdContratoInter() != null) {
            conditions += " AND CPD_CONTRATO_INTER = ?";
            values.add(this.getCpdContratoInter());
        }

        if (this.getCpdCveTipoMerca() != null && this.getCpdCveTipoMerca().longValue() == -999) {
            conditions += " AND CPD_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCpdCveTipoMerca() != null) {
            conditions += " AND CPD_CVE_TIPO_MERCA = ?";
            values.add(this.getCpdCveTipoMerca());
        }

        if (this.getCpdNomPizarra() != null && "null".equals(this.getCpdNomPizarra())) {
            conditions += " AND CPD_NOM_PIZARRA IS NULL";
        } else if (this.getCpdNomPizarra() != null) {
            conditions += " AND CPD_NOM_PIZARRA = ?";
            values.add(this.getCpdNomPizarra());
        }

        if (this.getCpdSerieEmision() != null && "null".equals(this.getCpdSerieEmision())) {
            conditions += " AND CPD_SERIE_EMISION IS NULL";
        } else if (this.getCpdSerieEmision() != null) {
            conditions += " AND CPD_SERIE_EMISION = ?";
            values.add(this.getCpdSerieEmision());
        }

        if (this.getCpdNumCupon() != null && this.getCpdNumCupon().longValue() == -999) {
            conditions += " AND CPD_NUM_CUPON IS NULL";
        } else if (this.getCpdNumCupon() != null) {
            conditions += " AND CPD_NUM_CUPON = ?";
            values.add(this.getCpdNumCupon());
        }

        if (this.getCpdCveFormaNeg() != null && "null".equals(this.getCpdCveFormaNeg())) {
            conditions += " AND CPD_CVE_FORMA_NEG IS NULL";
        } else if (this.getCpdCveFormaNeg() != null) {
            conditions += " AND CPD_CVE_FORMA_NEG = ?";
            values.add(this.getCpdCveFormaNeg());
        }

        if (this.getCpdNumPlazo() != null && this.getCpdNumPlazo().longValue() == -999) {
            conditions += " AND CPD_NUM_PLAZO IS NULL";
        } else if (this.getCpdNumPlazo() != null) {
            conditions += " AND CPD_NUM_PLAZO = ?";
            values.add(this.getCpdNumPlazo());
        }

        if (this.getCpdImpAsignado() != null && this.getCpdImpAsignado().longValue() == -999) {
            conditions += " AND CPD_IMP_ASIGNADO IS NULL";
        } else if (this.getCpdImpAsignado() != null) {
            conditions += " AND CPD_IMP_ASIGNADO = ?";
            values.add(this.getCpdImpAsignado());
        }

        if (this.getCpdImpDisponible() != null && this.getCpdImpDisponible().longValue() == -999) {
            conditions += " AND CPD_IMP_DISPONIBLE IS NULL";
        } else if (this.getCpdImpDisponible() != null) {
            conditions += " AND CPD_IMP_DISPONIBLE = ?";
            values.add(this.getCpdImpDisponible());
        }

        if (this.getCpdImpSugerido() != null && this.getCpdImpSugerido().longValue() == -999) {
            conditions += " AND CPD_IMP_SUGERIDO IS NULL";
        } else if (this.getCpdImpSugerido() != null) {
            conditions += " AND CPD_IMP_SUGERIDO = ?";
            values.add(this.getCpdImpSugerido());
        }

        if (this.getCpdCveStCpadir() != null && "null".equals(this.getCpdCveStCpadir())) {
            conditions += " AND CPD_CVE_ST_CPADIR IS NULL";
        } else if (this.getCpdCveStCpadir() != null) {
            conditions += " AND CPD_CVE_ST_CPADIR = ?";
            values.add(this.getCpdCveStCpadir());
        }

        if (this.getCpdNumMoneda() != null && this.getCpdNumMoneda().longValue() == -999) {
            conditions += " AND CPD_NUM_MONEDA IS NULL";
        } else if (this.getCpdNumMoneda() != null) {
            conditions += " AND CPD_NUM_MONEDA = ?";
            values.add(this.getCpdNumMoneda());
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
        String sql = "UPDATE CPADIR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPD_FOLIO_OPERA = ?";
        pkValues.add(this.getCpdFolioOpera());
        conditions += " AND CPD_NUM_CORTE = ?";
        pkValues.add(this.getCpdNumCorte());
        conditions += " AND CPD_NUM_CONTRATO = ?";
        pkValues.add(this.getCpdNumContrato());
        conditions += " AND CPD_SUB_CONTRATO = ?";
        pkValues.add(this.getCpdSubContrato());
        fields += " CPD_CVE_TIPO_OPER = ?, ";
        values.add(this.getCpdCveTipoOper());
        conditions += " AND CPD_NUM_INSTRUME = ?";
        pkValues.add(this.getCpdNumInstrume());
        conditions += " AND CPD_NUM_SEC_EMIS = ?";
        pkValues.add(this.getCpdNumSecEmis());
        conditions += " AND CPD_ENTIDAD_FIN = ?";
        pkValues.add(this.getCpdEntidadFin());
        conditions += " AND CPD_CONTRATO_INTER = ?";
        pkValues.add(this.getCpdContratoInter());
        conditions += " AND CPD_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getCpdCveTipoMerca());
        fields += " CPD_NOM_PIZARRA = ?, ";
        values.add(this.getCpdNomPizarra());
        fields += " CPD_SERIE_EMISION = ?, ";
        values.add(this.getCpdSerieEmision());
        fields += " CPD_NUM_CUPON = ?, ";
        values.add(this.getCpdNumCupon());
        fields += " CPD_CVE_FORMA_NEG = ?, ";
        values.add(this.getCpdCveFormaNeg());
        fields += " CPD_NUM_PLAZO = ?, ";
        values.add(this.getCpdNumPlazo());
        fields += " CPD_IMP_ASIGNADO = ?, ";
        values.add(this.getCpdImpAsignado());
        fields += " CPD_IMP_DISPONIBLE = ?, ";
        values.add(this.getCpdImpDisponible());
        fields += " CPD_IMP_SUGERIDO = ?, ";
        values.add(this.getCpdImpSugerido());
        fields += " CPD_CVE_ST_CPADIR = ?, ";
        values.add(this.getCpdCveStCpadir());
        fields += " CPD_NUM_MONEDA = ?, ";
        values.add(this.getCpdNumMoneda());
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
        String sql = "INSERT INTO CPADIR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPD_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getCpdFolioOpera());

        fields += ", CPD_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getCpdNumCorte());

        fields += ", CPD_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCpdNumContrato());

        fields += ", CPD_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCpdSubContrato());

        fields += ", CPD_CVE_TIPO_OPER";
        fieldValues += ", ?";
        values.add(this.getCpdCveTipoOper());

        fields += ", CPD_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getCpdNumInstrume());

        fields += ", CPD_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpdNumSecEmis());

        fields += ", CPD_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getCpdEntidadFin());

        fields += ", CPD_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getCpdContratoInter());

        fields += ", CPD_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getCpdCveTipoMerca());

        fields += ", CPD_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCpdNomPizarra());

        fields += ", CPD_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getCpdSerieEmision());

        fields += ", CPD_NUM_CUPON";
        fieldValues += ", ?";
        values.add(this.getCpdNumCupon());

        fields += ", CPD_CVE_FORMA_NEG";
        fieldValues += ", ?";
        values.add(this.getCpdCveFormaNeg());

        fields += ", CPD_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCpdNumPlazo());

        fields += ", CPD_IMP_ASIGNADO";
        fieldValues += ", ?";
        values.add(this.getCpdImpAsignado());

        fields += ", CPD_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getCpdImpDisponible());

        fields += ", CPD_IMP_SUGERIDO";
        fieldValues += ", ?";
        values.add(this.getCpdImpSugerido());

        fields += ", CPD_CVE_ST_CPADIR";
        fieldValues += ", ?";
        values.add(this.getCpdCveStCpadir());

        fields += ", CPD_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getCpdNumMoneda());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CPADIR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPD_FOLIO_OPERA = ?";
        values.add(this.getCpdFolioOpera());
        conditions += " AND CPD_NUM_CORTE = ?";
        values.add(this.getCpdNumCorte());
        conditions += " AND CPD_NUM_CONTRATO = ?";
        values.add(this.getCpdNumContrato());
        conditions += " AND CPD_SUB_CONTRATO = ?";
        values.add(this.getCpdSubContrato());
        conditions += " AND CPD_NUM_INSTRUME = ?";
        values.add(this.getCpdNumInstrume());
        conditions += " AND CPD_NUM_SEC_EMIS = ?";
        values.add(this.getCpdNumSecEmis());
        conditions += " AND CPD_ENTIDAD_FIN = ?";
        values.add(this.getCpdEntidadFin());
        conditions += " AND CPD_CONTRATO_INTER = ?";
        values.add(this.getCpdContratoInter());
        conditions += " AND CPD_CVE_TIPO_MERCA = ?";
        values.add(this.getCpdCveTipoMerca());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cpadir instance = (Cpadir) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpdFolioOpera().equals(instance.getCpdFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumCorte().equals(instance.getCpdNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumContrato().equals(instance.getCpdNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCpdSubContrato().equals(instance.getCpdSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveTipoOper().equals(instance.getCpdCveTipoOper()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumInstrume().equals(instance.getCpdNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumSecEmis().equals(instance.getCpdNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCpdEntidadFin().equals(instance.getCpdEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getCpdContratoInter().equals(instance.getCpdContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveTipoMerca().equals(instance.getCpdCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNomPizarra().equals(instance.getCpdNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCpdSerieEmision().equals(instance.getCpdSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumCupon().equals(instance.getCpdNumCupon()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveFormaNeg().equals(instance.getCpdCveFormaNeg()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumPlazo().equals(instance.getCpdNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCpdImpAsignado().equals(instance.getCpdImpAsignado()))
            equalObjects = false;
        if (equalObjects && !this.getCpdImpDisponible().equals(instance.getCpdImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getCpdImpSugerido().equals(instance.getCpdImpSugerido()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveStCpadir().equals(instance.getCpdCveStCpadir()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumMoneda().equals(instance.getCpdNumMoneda()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cpadir result = new Cpadir();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpdFolioOpera((BigDecimal) objectData.getData("CPD_FOLIO_OPERA"));
        result.setCpdNumCorte((BigDecimal) objectData.getData("CPD_NUM_CORTE"));
        result.setCpdNumContrato((BigDecimal) objectData.getData("CPD_NUM_CONTRATO"));
        result.setCpdSubContrato((BigDecimal) objectData.getData("CPD_SUB_CONTRATO"));
        result.setCpdCveTipoOper((String) objectData.getData("CPD_CVE_TIPO_OPER"));
        result.setCpdNumInstrume((BigDecimal) objectData.getData("CPD_NUM_INSTRUME"));
        result.setCpdNumSecEmis((BigDecimal) objectData.getData("CPD_NUM_SEC_EMIS"));
        result.setCpdEntidadFin((BigDecimal) objectData.getData("CPD_ENTIDAD_FIN"));
        result.setCpdContratoInter((BigDecimal) objectData.getData("CPD_CONTRATO_INTER"));
        result.setCpdCveTipoMerca((BigDecimal) objectData.getData("CPD_CVE_TIPO_MERCA"));
        result.setCpdNomPizarra((String) objectData.getData("CPD_NOM_PIZARRA"));
        result.setCpdSerieEmision((String) objectData.getData("CPD_SERIE_EMISION"));
        result.setCpdNumCupon((BigDecimal) objectData.getData("CPD_NUM_CUPON"));
        result.setCpdCveFormaNeg((String) objectData.getData("CPD_CVE_FORMA_NEG"));
        result.setCpdNumPlazo((BigDecimal) objectData.getData("CPD_NUM_PLAZO"));
        result.setCpdImpAsignado((BigDecimal) objectData.getData("CPD_IMP_ASIGNADO"));
        result.setCpdImpDisponible((BigDecimal) objectData.getData("CPD_IMP_DISPONIBLE"));
        result.setCpdImpSugerido((BigDecimal) objectData.getData("CPD_IMP_SUGERIDO"));
        result.setCpdCveStCpadir((String) objectData.getData("CPD_CVE_ST_CPADIR"));
        result.setCpdNumMoneda((BigDecimal) objectData.getData("CPD_NUM_MONEDA"));

        return result;

    }

}
