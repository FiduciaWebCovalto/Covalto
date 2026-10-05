package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CPAINTER_PK",
            columns = { "CIN_ENTIDAD_FIN", "CIN_CONTRATO_INTER", "CIN_CVE_TIPO_MERCA", "CIN_NUM_INSTRUME", "CIN_NUM_SEC_EMIS", "CIN_NUM_PLAZO", "CIN_NUM_CORTE" },
            sequences = { "MANUAL" })
public class Cpainter extends DomainObject {

    BigDecimal cinNumCorte = null;
    BigDecimal cinEntidadFin = null;
    BigDecimal cinContratoInter = null;
    BigDecimal cinCveTipoMerca = null;
    BigDecimal cinNumInstrume = null;
    BigDecimal cinNumSecEmis = null;
    BigDecimal cinNumPlazo = null;
    String cinNomPizarra = null;
    String cinSerieEmision = null;
    BigDecimal cinNumCuponVig = null;
    String cinCveTipoOpera = null;
    String cinCveFormaNeg = null;
    String cinCveTipoPer = null;
    BigDecimal cinNumTitCpa = null;
    BigDecimal cinNumTitAsig = null;
    BigDecimal cinNumTitDisp = null;
    BigDecimal cinImpTitCpa = null;
    BigDecimal cinImpPrecioTit = null;
    BigDecimal cinTasaPactada = null;
    String cinHoraCorte = null;
    String cinCveStCpainte = null;

    public Cpainter() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumCorte(BigDecimal cinNumCorte) {
        this.cinNumCorte = cinNumCorte;
    }

    public BigDecimal getCinNumCorte() {
        return this.cinNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinEntidadFin(BigDecimal cinEntidadFin) {
        this.cinEntidadFin = cinEntidadFin;
    }

    public BigDecimal getCinEntidadFin() {
        return this.cinEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinContratoInter(BigDecimal cinContratoInter) {
        this.cinContratoInter = cinContratoInter;
    }

    public BigDecimal getCinContratoInter() {
        return this.cinContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinCveTipoMerca(BigDecimal cinCveTipoMerca) {
        this.cinCveTipoMerca = cinCveTipoMerca;
    }

    public BigDecimal getCinCveTipoMerca() {
        return this.cinCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumInstrume(BigDecimal cinNumInstrume) {
        this.cinNumInstrume = cinNumInstrume;
    }

    public BigDecimal getCinNumInstrume() {
        return this.cinNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumSecEmis(BigDecimal cinNumSecEmis) {
        this.cinNumSecEmis = cinNumSecEmis;
    }

    public BigDecimal getCinNumSecEmis() {
        return this.cinNumSecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumPlazo(BigDecimal cinNumPlazo) {
        this.cinNumPlazo = cinNumPlazo;
    }

    public BigDecimal getCinNumPlazo() {
        return this.cinNumPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCinNomPizarra(String cinNomPizarra) {
        this.cinNomPizarra = cinNomPizarra;
    }

    public String getCinNomPizarra() {
        return this.cinNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCinSerieEmision(String cinSerieEmision) {
        this.cinSerieEmision = cinSerieEmision;
    }

    public String getCinSerieEmision() {
        return this.cinSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumCuponVig(BigDecimal cinNumCuponVig) {
        this.cinNumCuponVig = cinNumCuponVig;
    }

    public BigDecimal getCinNumCuponVig() {
        return this.cinNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCinCveTipoOpera(String cinCveTipoOpera) {
        this.cinCveTipoOpera = cinCveTipoOpera;
    }

    public String getCinCveTipoOpera() {
        return this.cinCveTipoOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCinCveFormaNeg(String cinCveFormaNeg) {
        this.cinCveFormaNeg = cinCveFormaNeg;
    }

    public String getCinCveFormaNeg() {
        return this.cinCveFormaNeg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCinCveTipoPer(String cinCveTipoPer) {
        this.cinCveTipoPer = cinCveTipoPer;
    }

    public String getCinCveTipoPer() {
        return this.cinCveTipoPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumTitCpa(BigDecimal cinNumTitCpa) {
        this.cinNumTitCpa = cinNumTitCpa;
    }

    public BigDecimal getCinNumTitCpa() {
        return this.cinNumTitCpa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumTitAsig(BigDecimal cinNumTitAsig) {
        this.cinNumTitAsig = cinNumTitAsig;
    }

    public BigDecimal getCinNumTitAsig() {
        return this.cinNumTitAsig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumTitDisp(BigDecimal cinNumTitDisp) {
        this.cinNumTitDisp = cinNumTitDisp;
    }

    public BigDecimal getCinNumTitDisp() {
        return this.cinNumTitDisp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCinImpTitCpa(BigDecimal cinImpTitCpa) {
        this.cinImpTitCpa = cinImpTitCpa;
    }

    public BigDecimal getCinImpTitCpa() {
        return this.cinImpTitCpa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setCinImpPrecioTit(BigDecimal cinImpPrecioTit) {
        this.cinImpPrecioTit = cinImpPrecioTit;
    }

    public BigDecimal getCinImpPrecioTit() {
        return this.cinImpPrecioTit;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCinTasaPactada(BigDecimal cinTasaPactada) {
        this.cinTasaPactada = cinTasaPactada;
    }

    public BigDecimal getCinTasaPactada() {
        return this.cinTasaPactada;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCinHoraCorte(String cinHoraCorte) {
        this.cinHoraCorte = cinHoraCorte;
    }

    public String getCinHoraCorte() {
        return this.cinHoraCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCinCveStCpainte(String cinCveStCpainte) {
        this.cinCveStCpainte = cinCveStCpainte;
    }

    public String getCinCveStCpainte() {
        return this.cinCveStCpainte;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CPAINTER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCinNumCorte() != null && this.getCinNumCorte().longValue() == -999) {
            conditions += " AND CIN_NUM_CORTE IS NULL";
        } else if (this.getCinNumCorte() != null) {
            conditions += " AND CIN_NUM_CORTE = ?";
            values.add(this.getCinNumCorte());
        }

        if (this.getCinEntidadFin() != null && this.getCinEntidadFin().longValue() == -999) {
            conditions += " AND CIN_ENTIDAD_FIN IS NULL";
        } else if (this.getCinEntidadFin() != null) {
            conditions += " AND CIN_ENTIDAD_FIN = ?";
            values.add(this.getCinEntidadFin());
        }

        if (this.getCinContratoInter() != null && this.getCinContratoInter().longValue() == -999) {
            conditions += " AND CIN_CONTRATO_INTER IS NULL";
        } else if (this.getCinContratoInter() != null) {
            conditions += " AND CIN_CONTRATO_INTER = ?";
            values.add(this.getCinContratoInter());
        }

        if (this.getCinCveTipoMerca() != null && this.getCinCveTipoMerca().longValue() == -999) {
            conditions += " AND CIN_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCinCveTipoMerca() != null) {
            conditions += " AND CIN_CVE_TIPO_MERCA = ?";
            values.add(this.getCinCveTipoMerca());
        }

        if (this.getCinNumInstrume() != null && this.getCinNumInstrume().longValue() == -999) {
            conditions += " AND CIN_NUM_INSTRUME IS NULL";
        } else if (this.getCinNumInstrume() != null) {
            conditions += " AND CIN_NUM_INSTRUME = ?";
            values.add(this.getCinNumInstrume());
        }

        if (this.getCinNumSecEmis() != null && this.getCinNumSecEmis().longValue() == -999) {
            conditions += " AND CIN_NUM_SEC_EMIS IS NULL";
        } else if (this.getCinNumSecEmis() != null) {
            conditions += " AND CIN_NUM_SEC_EMIS = ?";
            values.add(this.getCinNumSecEmis());
        }

        if (this.getCinNumPlazo() != null && this.getCinNumPlazo().longValue() == -999) {
            conditions += " AND CIN_NUM_PLAZO IS NULL";
        } else if (this.getCinNumPlazo() != null) {
            conditions += " AND CIN_NUM_PLAZO = ?";
            values.add(this.getCinNumPlazo());
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
        String sql = "SELECT * FROM CPAINTER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCinNumCorte() != null && this.getCinNumCorte().longValue() == -999) {
            conditions += " AND CIN_NUM_CORTE IS NULL";
        } else if (this.getCinNumCorte() != null) {
            conditions += " AND CIN_NUM_CORTE = ?";
            values.add(this.getCinNumCorte());
        }

        if (this.getCinEntidadFin() != null && this.getCinEntidadFin().longValue() == -999) {
            conditions += " AND CIN_ENTIDAD_FIN IS NULL";
        } else if (this.getCinEntidadFin() != null) {
            conditions += " AND CIN_ENTIDAD_FIN = ?";
            values.add(this.getCinEntidadFin());
        }

        if (this.getCinContratoInter() != null && this.getCinContratoInter().longValue() == -999) {
            conditions += " AND CIN_CONTRATO_INTER IS NULL";
        } else if (this.getCinContratoInter() != null) {
            conditions += " AND CIN_CONTRATO_INTER = ?";
            values.add(this.getCinContratoInter());
        }

        if (this.getCinCveTipoMerca() != null && this.getCinCveTipoMerca().longValue() == -999) {
            conditions += " AND CIN_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCinCveTipoMerca() != null) {
            conditions += " AND CIN_CVE_TIPO_MERCA = ?";
            values.add(this.getCinCveTipoMerca());
        }

        if (this.getCinNumInstrume() != null && this.getCinNumInstrume().longValue() == -999) {
            conditions += " AND CIN_NUM_INSTRUME IS NULL";
        } else if (this.getCinNumInstrume() != null) {
            conditions += " AND CIN_NUM_INSTRUME = ?";
            values.add(this.getCinNumInstrume());
        }

        if (this.getCinNumSecEmis() != null && this.getCinNumSecEmis().longValue() == -999) {
            conditions += " AND CIN_NUM_SEC_EMIS IS NULL";
        } else if (this.getCinNumSecEmis() != null) {
            conditions += " AND CIN_NUM_SEC_EMIS = ?";
            values.add(this.getCinNumSecEmis());
        }

        if (this.getCinNumPlazo() != null && this.getCinNumPlazo().longValue() == -999) {
            conditions += " AND CIN_NUM_PLAZO IS NULL";
        } else if (this.getCinNumPlazo() != null) {
            conditions += " AND CIN_NUM_PLAZO = ?";
            values.add(this.getCinNumPlazo());
        }

        if (this.getCinNomPizarra() != null && "null".equals(this.getCinNomPizarra())) {
            conditions += " AND CIN_NOM_PIZARRA IS NULL";
        } else if (this.getCinNomPizarra() != null) {
            conditions += " AND CIN_NOM_PIZARRA = ?";
            values.add(this.getCinNomPizarra());
        }

        if (this.getCinSerieEmision() != null && "null".equals(this.getCinSerieEmision())) {
            conditions += " AND CIN_SERIE_EMISION IS NULL";
        } else if (this.getCinSerieEmision() != null) {
            conditions += " AND CIN_SERIE_EMISION = ?";
            values.add(this.getCinSerieEmision());
        }

        if (this.getCinNumCuponVig() != null && this.getCinNumCuponVig().longValue() == -999) {
            conditions += " AND CIN_NUM_CUPON_VIG IS NULL";
        } else if (this.getCinNumCuponVig() != null) {
            conditions += " AND CIN_NUM_CUPON_VIG = ?";
            values.add(this.getCinNumCuponVig());
        }

        if (this.getCinCveTipoOpera() != null && "null".equals(this.getCinCveTipoOpera())) {
            conditions += " AND CIN_CVE_TIPO_OPERA IS NULL";
        } else if (this.getCinCveTipoOpera() != null) {
            conditions += " AND CIN_CVE_TIPO_OPERA = ?";
            values.add(this.getCinCveTipoOpera());
        }

        if (this.getCinCveFormaNeg() != null && "null".equals(this.getCinCveFormaNeg())) {
            conditions += " AND CIN_CVE_FORMA_NEG IS NULL";
        } else if (this.getCinCveFormaNeg() != null) {
            conditions += " AND CIN_CVE_FORMA_NEG = ?";
            values.add(this.getCinCveFormaNeg());
        }

        if (this.getCinCveTipoPer() != null && "null".equals(this.getCinCveTipoPer())) {
            conditions += " AND CIN_CVE_TIPO_PER IS NULL";
        } else if (this.getCinCveTipoPer() != null) {
            conditions += " AND CIN_CVE_TIPO_PER = ?";
            values.add(this.getCinCveTipoPer());
        }

        if (this.getCinNumTitCpa() != null && this.getCinNumTitCpa().longValue() == -999) {
            conditions += " AND CIN_NUM_TIT_CPA IS NULL";
        } else if (this.getCinNumTitCpa() != null) {
            conditions += " AND CIN_NUM_TIT_CPA = ?";
            values.add(this.getCinNumTitCpa());
        }

        if (this.getCinNumTitAsig() != null && this.getCinNumTitAsig().longValue() == -999) {
            conditions += " AND CIN_NUM_TIT_ASIG IS NULL";
        } else if (this.getCinNumTitAsig() != null) {
            conditions += " AND CIN_NUM_TIT_ASIG = ?";
            values.add(this.getCinNumTitAsig());
        }

        if (this.getCinNumTitDisp() != null && this.getCinNumTitDisp().longValue() == -999) {
            conditions += " AND CIN_NUM_TIT_DISP IS NULL";
        } else if (this.getCinNumTitDisp() != null) {
            conditions += " AND CIN_NUM_TIT_DISP = ?";
            values.add(this.getCinNumTitDisp());
        }

        if (this.getCinImpTitCpa() != null && this.getCinImpTitCpa().longValue() == -999) {
            conditions += " AND CIN_IMP_TIT_CPA IS NULL";
        } else if (this.getCinImpTitCpa() != null) {
            conditions += " AND CIN_IMP_TIT_CPA = ?";
            values.add(this.getCinImpTitCpa());
        }

        if (this.getCinImpPrecioTit() != null && this.getCinImpPrecioTit().longValue() == -999) {
            conditions += " AND CIN_IMP_PRECIO_TIT IS NULL";
        } else if (this.getCinImpPrecioTit() != null) {
            conditions += " AND CIN_IMP_PRECIO_TIT = ?";
            values.add(this.getCinImpPrecioTit());
        }

        if (this.getCinTasaPactada() != null && this.getCinTasaPactada().longValue() == -999) {
            conditions += " AND CIN_TASA_PACTADA IS NULL";
        } else if (this.getCinTasaPactada() != null) {
            conditions += " AND CIN_TASA_PACTADA = ?";
            values.add(this.getCinTasaPactada());
        }

        if (this.getCinHoraCorte() != null && "null".equals(this.getCinHoraCorte())) {
            conditions += " AND CIN_HORA_CORTE IS NULL";
        } else if (this.getCinHoraCorte() != null) {
            conditions += " AND CIN_HORA_CORTE = ?";
            values.add(this.getCinHoraCorte());
        }

        if (this.getCinCveStCpainte() != null && "null".equals(this.getCinCveStCpainte())) {
            conditions += " AND CIN_CVE_ST_CPAINTE IS NULL";
        } else if (this.getCinCveStCpainte() != null) {
            conditions += " AND CIN_CVE_ST_CPAINTE = ?";
            values.add(this.getCinCveStCpainte());
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
        String sql = "UPDATE CPAINTER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CIN_NUM_CORTE = ?";
        pkValues.add(this.getCinNumCorte());
        conditions += " AND CIN_ENTIDAD_FIN = ?";
        pkValues.add(this.getCinEntidadFin());
        conditions += " AND CIN_CONTRATO_INTER = ?";
        pkValues.add(this.getCinContratoInter());
        conditions += " AND CIN_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getCinCveTipoMerca());
        conditions += " AND CIN_NUM_INSTRUME = ?";
        pkValues.add(this.getCinNumInstrume());
        conditions += " AND CIN_NUM_SEC_EMIS = ?";
        pkValues.add(this.getCinNumSecEmis());
        conditions += " AND CIN_NUM_PLAZO = ?";
        pkValues.add(this.getCinNumPlazo());
        fields += " CIN_NOM_PIZARRA = ?, ";
        values.add(this.getCinNomPizarra());
        fields += " CIN_SERIE_EMISION = ?, ";
        values.add(this.getCinSerieEmision());
        fields += " CIN_NUM_CUPON_VIG = ?, ";
        values.add(this.getCinNumCuponVig());
        fields += " CIN_CVE_TIPO_OPERA = ?, ";
        values.add(this.getCinCveTipoOpera());
        fields += " CIN_CVE_FORMA_NEG = ?, ";
        values.add(this.getCinCveFormaNeg());
        fields += " CIN_CVE_TIPO_PER = ?, ";
        values.add(this.getCinCveTipoPer());
        fields += " CIN_NUM_TIT_CPA = ?, ";
        values.add(this.getCinNumTitCpa());
        fields += " CIN_NUM_TIT_ASIG = ?, ";
        values.add(this.getCinNumTitAsig());
        fields += " CIN_NUM_TIT_DISP = ?, ";
        values.add(this.getCinNumTitDisp());
        fields += " CIN_IMP_TIT_CPA = ?, ";
        values.add(this.getCinImpTitCpa());
        fields += " CIN_IMP_PRECIO_TIT = ?, ";
        values.add(this.getCinImpPrecioTit());
        fields += " CIN_TASA_PACTADA = ?, ";
        values.add(this.getCinTasaPactada());
        fields += " CIN_HORA_CORTE = ?, ";
        values.add(this.getCinHoraCorte());
        fields += " CIN_CVE_ST_CPAINTE = ?, ";
        values.add(this.getCinCveStCpainte());
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
        String sql = "INSERT INTO CPAINTER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CIN_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getCinNumCorte());

        fields += ", CIN_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getCinEntidadFin());

        fields += ", CIN_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getCinContratoInter());

        fields += ", CIN_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getCinCveTipoMerca());

        fields += ", CIN_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getCinNumInstrume());

        fields += ", CIN_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getCinNumSecEmis());

        fields += ", CIN_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCinNumPlazo());

        fields += ", CIN_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCinNomPizarra());

        fields += ", CIN_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getCinSerieEmision());

        fields += ", CIN_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getCinNumCuponVig());

        fields += ", CIN_CVE_TIPO_OPERA";
        fieldValues += ", ?";
        values.add(this.getCinCveTipoOpera());

        fields += ", CIN_CVE_FORMA_NEG";
        fieldValues += ", ?";
        values.add(this.getCinCveFormaNeg());

        fields += ", CIN_CVE_TIPO_PER";
        fieldValues += ", ?";
        values.add(this.getCinCveTipoPer());

        fields += ", CIN_NUM_TIT_CPA";
        fieldValues += ", ?";
        values.add(this.getCinNumTitCpa());

        fields += ", CIN_NUM_TIT_ASIG";
        fieldValues += ", ?";
        values.add(this.getCinNumTitAsig());

        fields += ", CIN_NUM_TIT_DISP";
        fieldValues += ", ?";
        values.add(this.getCinNumTitDisp());

        fields += ", CIN_IMP_TIT_CPA";
        fieldValues += ", ?";
        values.add(this.getCinImpTitCpa());

        fields += ", CIN_IMP_PRECIO_TIT";
        fieldValues += ", ?";
        values.add(this.getCinImpPrecioTit());

        fields += ", CIN_TASA_PACTADA";
        fieldValues += ", ?";
        values.add(this.getCinTasaPactada());

        fields += ", CIN_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getCinHoraCorte());

        fields += ", CIN_CVE_ST_CPAINTE";
        fieldValues += ", ?";
        values.add(this.getCinCveStCpainte());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CPAINTER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CIN_NUM_CORTE = ?";
        values.add(this.getCinNumCorte());
        conditions += " AND CIN_ENTIDAD_FIN = ?";
        values.add(this.getCinEntidadFin());
        conditions += " AND CIN_CONTRATO_INTER = ?";
        values.add(this.getCinContratoInter());
        conditions += " AND CIN_CVE_TIPO_MERCA = ?";
        values.add(this.getCinCveTipoMerca());
        conditions += " AND CIN_NUM_INSTRUME = ?";
        values.add(this.getCinNumInstrume());
        conditions += " AND CIN_NUM_SEC_EMIS = ?";
        values.add(this.getCinNumSecEmis());
        conditions += " AND CIN_NUM_PLAZO = ?";
        values.add(this.getCinNumPlazo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cpainter instance = (Cpainter) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCinNumCorte().equals(instance.getCinNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCinEntidadFin().equals(instance.getCinEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getCinContratoInter().equals(instance.getCinContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getCinCveTipoMerca().equals(instance.getCinCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getCinNumInstrume().equals(instance.getCinNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getCinNumSecEmis().equals(instance.getCinNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCinNumPlazo().equals(instance.getCinNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCinNomPizarra().equals(instance.getCinNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCinSerieEmision().equals(instance.getCinSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCinNumCuponVig().equals(instance.getCinNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getCinCveTipoOpera().equals(instance.getCinCveTipoOpera()))
            equalObjects = false;
        if (equalObjects && !this.getCinCveFormaNeg().equals(instance.getCinCveFormaNeg()))
            equalObjects = false;
        if (equalObjects && !this.getCinCveTipoPer().equals(instance.getCinCveTipoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCinNumTitCpa().equals(instance.getCinNumTitCpa()))
            equalObjects = false;
        if (equalObjects && !this.getCinNumTitAsig().equals(instance.getCinNumTitAsig()))
            equalObjects = false;
        if (equalObjects && !this.getCinNumTitDisp().equals(instance.getCinNumTitDisp()))
            equalObjects = false;
        if (equalObjects && !this.getCinImpTitCpa().equals(instance.getCinImpTitCpa()))
            equalObjects = false;
        if (equalObjects && !this.getCinImpPrecioTit().equals(instance.getCinImpPrecioTit()))
            equalObjects = false;
        if (equalObjects && !this.getCinTasaPactada().equals(instance.getCinTasaPactada()))
            equalObjects = false;
        if (equalObjects && !this.getCinHoraCorte().equals(instance.getCinHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCinCveStCpainte().equals(instance.getCinCveStCpainte()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cpainter result = new Cpainter();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCinNumCorte((BigDecimal) objectData.getData("CIN_NUM_CORTE"));
        result.setCinEntidadFin((BigDecimal) objectData.getData("CIN_ENTIDAD_FIN"));
        result.setCinContratoInter((BigDecimal) objectData.getData("CIN_CONTRATO_INTER"));
        result.setCinCveTipoMerca((BigDecimal) objectData.getData("CIN_CVE_TIPO_MERCA"));
        result.setCinNumInstrume((BigDecimal) objectData.getData("CIN_NUM_INSTRUME"));
        result.setCinNumSecEmis((BigDecimal) objectData.getData("CIN_NUM_SEC_EMIS"));
        result.setCinNumPlazo((BigDecimal) objectData.getData("CIN_NUM_PLAZO"));
        result.setCinNomPizarra((String) objectData.getData("CIN_NOM_PIZARRA"));
        result.setCinSerieEmision((String) objectData.getData("CIN_SERIE_EMISION"));
        result.setCinNumCuponVig((BigDecimal) objectData.getData("CIN_NUM_CUPON_VIG"));
        result.setCinCveTipoOpera((String) objectData.getData("CIN_CVE_TIPO_OPERA"));
        result.setCinCveFormaNeg((String) objectData.getData("CIN_CVE_FORMA_NEG"));
        result.setCinCveTipoPer((String) objectData.getData("CIN_CVE_TIPO_PER"));
        result.setCinNumTitCpa((BigDecimal) objectData.getData("CIN_NUM_TIT_CPA"));
        result.setCinNumTitAsig((BigDecimal) objectData.getData("CIN_NUM_TIT_ASIG"));
        result.setCinNumTitDisp((BigDecimal) objectData.getData("CIN_NUM_TIT_DISP"));
        result.setCinImpTitCpa((BigDecimal) objectData.getData("CIN_IMP_TIT_CPA"));
        result.setCinImpPrecioTit((BigDecimal) objectData.getData("CIN_IMP_PRECIO_TIT"));
        result.setCinTasaPactada((BigDecimal) objectData.getData("CIN_TASA_PACTADA"));
        result.setCinHoraCorte((String) objectData.getData("CIN_HORA_CORTE"));
        result.setCinCveStCpainte((String) objectData.getData("CIN_CVE_ST_CPAINTE"));

        return result;

    }

}
