package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONCETIT_PK",
            columns =
            { "COT_DIA_SUGERENCIA", "COT_MES_SUGERENCIA", "COT_ANO_SUGERENCIA", "COT_CVE_TIPO_MERCA", "COT_NUM_INSTRUME", "COT_NUM_SEC_EMIS", "COT_NUM_PLAZO", "COT_NUM_CORTE"
    }, sequences = { "MANUAL" })
public class Concetit extends DomainObject {

    BigDecimal cotAnoSugerencia = null;
    BigDecimal cotMesSugerencia = null;
    BigDecimal cotDiaSugerencia = null;
    BigDecimal cotNumCorte = null;
    BigDecimal cotCveTipoMerca = null;
    BigDecimal cotNumInstrume = null;
    BigDecimal cotNumSecEmis = null;
    BigDecimal cotNumPlazo = null;
    String cotNomPizarra = null;
    String cotSerieEmision = null;
    BigDecimal cotNumCuponVig = null;
    String cotCveTipoOpera = null;
    String cotCveFormaNego = null;
    BigDecimal cotImpSugerencia = null;
    BigDecimal cotImpAsignado = null;
    BigDecimal cotImpDisponible = null;
    BigDecimal cotNumContratos = null;
    String cotHoraCorte = null;
    String cotCveStConceti = null;

    public Concetit() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCotAnoSugerencia(BigDecimal cotAnoSugerencia) {
        this.cotAnoSugerencia = cotAnoSugerencia;
    }

    public BigDecimal getCotAnoSugerencia() {
        return this.cotAnoSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCotMesSugerencia(BigDecimal cotMesSugerencia) {
        this.cotMesSugerencia = cotMesSugerencia;
    }

    public BigDecimal getCotMesSugerencia() {
        return this.cotMesSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCotDiaSugerencia(BigDecimal cotDiaSugerencia) {
        this.cotDiaSugerencia = cotDiaSugerencia;
    }

    public BigDecimal getCotDiaSugerencia() {
        return this.cotDiaSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCotNumCorte(BigDecimal cotNumCorte) {
        this.cotNumCorte = cotNumCorte;
    }

    public BigDecimal getCotNumCorte() {
        return this.cotNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCotCveTipoMerca(BigDecimal cotCveTipoMerca) {
        this.cotCveTipoMerca = cotCveTipoMerca;
    }

    public BigDecimal getCotCveTipoMerca() {
        return this.cotCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCotNumInstrume(BigDecimal cotNumInstrume) {
        this.cotNumInstrume = cotNumInstrume;
    }

    public BigDecimal getCotNumInstrume() {
        return this.cotNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCotNumSecEmis(BigDecimal cotNumSecEmis) {
        this.cotNumSecEmis = cotNumSecEmis;
    }

    public BigDecimal getCotNumSecEmis() {
        return this.cotNumSecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCotNumPlazo(BigDecimal cotNumPlazo) {
        this.cotNumPlazo = cotNumPlazo;
    }

    public BigDecimal getCotNumPlazo() {
        return this.cotNumPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCotNomPizarra(String cotNomPizarra) {
        this.cotNomPizarra = cotNomPizarra;
    }

    public String getCotNomPizarra() {
        return this.cotNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCotSerieEmision(String cotSerieEmision) {
        this.cotSerieEmision = cotSerieEmision;
    }

    public String getCotSerieEmision() {
        return this.cotSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCotNumCuponVig(BigDecimal cotNumCuponVig) {
        this.cotNumCuponVig = cotNumCuponVig;
    }

    public BigDecimal getCotNumCuponVig() {
        return this.cotNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCotCveTipoOpera(String cotCveTipoOpera) {
        this.cotCveTipoOpera = cotCveTipoOpera;
    }

    public String getCotCveTipoOpera() {
        return this.cotCveTipoOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCotCveFormaNego(String cotCveFormaNego) {
        this.cotCveFormaNego = cotCveFormaNego;
    }

    public String getCotCveFormaNego() {
        return this.cotCveFormaNego;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCotImpSugerencia(BigDecimal cotImpSugerencia) {
        this.cotImpSugerencia = cotImpSugerencia;
    }

    public BigDecimal getCotImpSugerencia() {
        return this.cotImpSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCotImpAsignado(BigDecimal cotImpAsignado) {
        this.cotImpAsignado = cotImpAsignado;
    }

    public BigDecimal getCotImpAsignado() {
        return this.cotImpAsignado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCotImpDisponible(BigDecimal cotImpDisponible) {
        this.cotImpDisponible = cotImpDisponible;
    }

    public BigDecimal getCotImpDisponible() {
        return this.cotImpDisponible;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCotNumContratos(BigDecimal cotNumContratos) {
        this.cotNumContratos = cotNumContratos;
    }

    public BigDecimal getCotNumContratos() {
        return this.cotNumContratos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCotHoraCorte(String cotHoraCorte) {
        this.cotHoraCorte = cotHoraCorte;
    }

    public String getCotHoraCorte() {
        return this.cotHoraCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCotCveStConceti(String cotCveStConceti) {
        this.cotCveStConceti = cotCveStConceti;
    }

    public String getCotCveStConceti() {
        return this.cotCveStConceti;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONCETIT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCotAnoSugerencia() != null && this.getCotAnoSugerencia().longValue() == -999) {
            conditions += " AND COT_ANO_SUGERENCIA IS NULL";
        } else if (this.getCotAnoSugerencia() != null) {
            conditions += " AND COT_ANO_SUGERENCIA = ?";
            values.add(this.getCotAnoSugerencia());
        }

        if (this.getCotMesSugerencia() != null && this.getCotMesSugerencia().longValue() == -999) {
            conditions += " AND COT_MES_SUGERENCIA IS NULL";
        } else if (this.getCotMesSugerencia() != null) {
            conditions += " AND COT_MES_SUGERENCIA = ?";
            values.add(this.getCotMesSugerencia());
        }

        if (this.getCotDiaSugerencia() != null && this.getCotDiaSugerencia().longValue() == -999) {
            conditions += " AND COT_DIA_SUGERENCIA IS NULL";
        } else if (this.getCotDiaSugerencia() != null) {
            conditions += " AND COT_DIA_SUGERENCIA = ?";
            values.add(this.getCotDiaSugerencia());
        }

        if (this.getCotNumCorte() != null && this.getCotNumCorte().longValue() == -999) {
            conditions += " AND COT_NUM_CORTE IS NULL";
        } else if (this.getCotNumCorte() != null) {
            conditions += " AND COT_NUM_CORTE = ?";
            values.add(this.getCotNumCorte());
        }

        if (this.getCotCveTipoMerca() != null && this.getCotCveTipoMerca().longValue() == -999) {
            conditions += " AND COT_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCotCveTipoMerca() != null) {
            conditions += " AND COT_CVE_TIPO_MERCA = ?";
            values.add(this.getCotCveTipoMerca());
        }

        if (this.getCotNumInstrume() != null && this.getCotNumInstrume().longValue() == -999) {
            conditions += " AND COT_NUM_INSTRUME IS NULL";
        } else if (this.getCotNumInstrume() != null) {
            conditions += " AND COT_NUM_INSTRUME = ?";
            values.add(this.getCotNumInstrume());
        }

        if (this.getCotNumSecEmis() != null && this.getCotNumSecEmis().longValue() == -999) {
            conditions += " AND COT_NUM_SEC_EMIS IS NULL";
        } else if (this.getCotNumSecEmis() != null) {
            conditions += " AND COT_NUM_SEC_EMIS = ?";
            values.add(this.getCotNumSecEmis());
        }

        if (this.getCotNumPlazo() != null && this.getCotNumPlazo().longValue() == -999) {
            conditions += " AND COT_NUM_PLAZO IS NULL";
        } else if (this.getCotNumPlazo() != null) {
            conditions += " AND COT_NUM_PLAZO = ?";
            values.add(this.getCotNumPlazo());
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
        String sql = "SELECT * FROM CONCETIT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCotAnoSugerencia() != null && this.getCotAnoSugerencia().longValue() == -999) {
            conditions += " AND COT_ANO_SUGERENCIA IS NULL";
        } else if (this.getCotAnoSugerencia() != null) {
            conditions += " AND COT_ANO_SUGERENCIA = ?";
            values.add(this.getCotAnoSugerencia());
        }

        if (this.getCotMesSugerencia() != null && this.getCotMesSugerencia().longValue() == -999) {
            conditions += " AND COT_MES_SUGERENCIA IS NULL";
        } else if (this.getCotMesSugerencia() != null) {
            conditions += " AND COT_MES_SUGERENCIA = ?";
            values.add(this.getCotMesSugerencia());
        }

        if (this.getCotDiaSugerencia() != null && this.getCotDiaSugerencia().longValue() == -999) {
            conditions += " AND COT_DIA_SUGERENCIA IS NULL";
        } else if (this.getCotDiaSugerencia() != null) {
            conditions += " AND COT_DIA_SUGERENCIA = ?";
            values.add(this.getCotDiaSugerencia());
        }

        if (this.getCotNumCorte() != null && this.getCotNumCorte().longValue() == -999) {
            conditions += " AND COT_NUM_CORTE IS NULL";
        } else if (this.getCotNumCorte() != null) {
            conditions += " AND COT_NUM_CORTE = ?";
            values.add(this.getCotNumCorte());
        }

        if (this.getCotCveTipoMerca() != null && this.getCotCveTipoMerca().longValue() == -999) {
            conditions += " AND COT_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCotCveTipoMerca() != null) {
            conditions += " AND COT_CVE_TIPO_MERCA = ?";
            values.add(this.getCotCveTipoMerca());
        }

        if (this.getCotNumInstrume() != null && this.getCotNumInstrume().longValue() == -999) {
            conditions += " AND COT_NUM_INSTRUME IS NULL";
        } else if (this.getCotNumInstrume() != null) {
            conditions += " AND COT_NUM_INSTRUME = ?";
            values.add(this.getCotNumInstrume());
        }

        if (this.getCotNumSecEmis() != null && this.getCotNumSecEmis().longValue() == -999) {
            conditions += " AND COT_NUM_SEC_EMIS IS NULL";
        } else if (this.getCotNumSecEmis() != null) {
            conditions += " AND COT_NUM_SEC_EMIS = ?";
            values.add(this.getCotNumSecEmis());
        }

        if (this.getCotNumPlazo() != null && this.getCotNumPlazo().longValue() == -999) {
            conditions += " AND COT_NUM_PLAZO IS NULL";
        } else if (this.getCotNumPlazo() != null) {
            conditions += " AND COT_NUM_PLAZO = ?";
            values.add(this.getCotNumPlazo());
        }

        if (this.getCotNomPizarra() != null && "null".equals(this.getCotNomPizarra())) {
            conditions += " AND COT_NOM_PIZARRA IS NULL";
        } else if (this.getCotNomPizarra() != null) {
            conditions += " AND COT_NOM_PIZARRA = ?";
            values.add(this.getCotNomPizarra());
        }

        if (this.getCotSerieEmision() != null && "null".equals(this.getCotSerieEmision())) {
            conditions += " AND COT_SERIE_EMISION IS NULL";
        } else if (this.getCotSerieEmision() != null) {
            conditions += " AND COT_SERIE_EMISION = ?";
            values.add(this.getCotSerieEmision());
        }

        if (this.getCotNumCuponVig() != null && this.getCotNumCuponVig().longValue() == -999) {
            conditions += " AND COT_NUM_CUPON_VIG IS NULL";
        } else if (this.getCotNumCuponVig() != null) {
            conditions += " AND COT_NUM_CUPON_VIG = ?";
            values.add(this.getCotNumCuponVig());
        }

        if (this.getCotCveTipoOpera() != null && "null".equals(this.getCotCveTipoOpera())) {
            conditions += " AND COT_CVE_TIPO_OPERA IS NULL";
        } else if (this.getCotCveTipoOpera() != null) {
            conditions += " AND COT_CVE_TIPO_OPERA = ?";
            values.add(this.getCotCveTipoOpera());
        }

        if (this.getCotCveFormaNego() != null && "null".equals(this.getCotCveFormaNego())) {
            conditions += " AND COT_CVE_FORMA_NEGO IS NULL";
        } else if (this.getCotCveFormaNego() != null) {
            conditions += " AND COT_CVE_FORMA_NEGO = ?";
            values.add(this.getCotCveFormaNego());
        }

        if (this.getCotImpSugerencia() != null && this.getCotImpSugerencia().longValue() == -999) {
            conditions += " AND COT_IMP_SUGERENCIA IS NULL";
        } else if (this.getCotImpSugerencia() != null) {
            conditions += " AND COT_IMP_SUGERENCIA = ?";
            values.add(this.getCotImpSugerencia());
        }

        if (this.getCotImpAsignado() != null && this.getCotImpAsignado().longValue() == -999) {
            conditions += " AND COT_IMP_ASIGNADO IS NULL";
        } else if (this.getCotImpAsignado() != null) {
            conditions += " AND COT_IMP_ASIGNADO = ?";
            values.add(this.getCotImpAsignado());
        }

        if (this.getCotImpDisponible() != null && this.getCotImpDisponible().longValue() == -999) {
            conditions += " AND COT_IMP_DISPONIBLE IS NULL";
        } else if (this.getCotImpDisponible() != null) {
            conditions += " AND COT_IMP_DISPONIBLE = ?";
            values.add(this.getCotImpDisponible());
        }

        if (this.getCotNumContratos() != null && this.getCotNumContratos().longValue() == -999) {
            conditions += " AND COT_NUM_CONTRATOS IS NULL";
        } else if (this.getCotNumContratos() != null) {
            conditions += " AND COT_NUM_CONTRATOS = ?";
            values.add(this.getCotNumContratos());
        }

        if (this.getCotHoraCorte() != null && "null".equals(this.getCotHoraCorte())) {
            conditions += " AND COT_HORA_CORTE IS NULL";
        } else if (this.getCotHoraCorte() != null) {
            conditions += " AND COT_HORA_CORTE = ?";
            values.add(this.getCotHoraCorte());
        }

        if (this.getCotCveStConceti() != null && "null".equals(this.getCotCveStConceti())) {
            conditions += " AND COT_CVE_ST_CONCETI IS NULL";
        } else if (this.getCotCveStConceti() != null) {
            conditions += " AND COT_CVE_ST_CONCETI = ?";
            values.add(this.getCotCveStConceti());
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
        String sql = "UPDATE CONCETIT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND COT_ANO_SUGERENCIA = ?";
        pkValues.add(this.getCotAnoSugerencia());
        conditions += " AND COT_MES_SUGERENCIA = ?";
        pkValues.add(this.getCotMesSugerencia());
        conditions += " AND COT_DIA_SUGERENCIA = ?";
        pkValues.add(this.getCotDiaSugerencia());
        conditions += " AND COT_NUM_CORTE = ?";
        pkValues.add(this.getCotNumCorte());
        conditions += " AND COT_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getCotCveTipoMerca());
        conditions += " AND COT_NUM_INSTRUME = ?";
        pkValues.add(this.getCotNumInstrume());
        conditions += " AND COT_NUM_SEC_EMIS = ?";
        pkValues.add(this.getCotNumSecEmis());
        conditions += " AND COT_NUM_PLAZO = ?";
        pkValues.add(this.getCotNumPlazo());
        fields += " COT_NOM_PIZARRA = ?, ";
        values.add(this.getCotNomPizarra());
        fields += " COT_SERIE_EMISION = ?, ";
        values.add(this.getCotSerieEmision());
        fields += " COT_NUM_CUPON_VIG = ?, ";
        values.add(this.getCotNumCuponVig());
        fields += " COT_CVE_TIPO_OPERA = ?, ";
        values.add(this.getCotCveTipoOpera());
        fields += " COT_CVE_FORMA_NEGO = ?, ";
        values.add(this.getCotCveFormaNego());
        fields += " COT_IMP_SUGERENCIA = ?, ";
        values.add(this.getCotImpSugerencia());
        fields += " COT_IMP_ASIGNADO = ?, ";
        values.add(this.getCotImpAsignado());
        fields += " COT_IMP_DISPONIBLE = ?, ";
        values.add(this.getCotImpDisponible());
        fields += " COT_NUM_CONTRATOS = ?, ";
        values.add(this.getCotNumContratos());
        fields += " COT_HORA_CORTE = ?, ";
        values.add(this.getCotHoraCorte());
        fields += " COT_CVE_ST_CONCETI = ?, ";
        values.add(this.getCotCveStConceti());
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
        String sql = "INSERT INTO CONCETIT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", COT_ANO_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getCotAnoSugerencia());

        fields += ", COT_MES_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getCotMesSugerencia());

        fields += ", COT_DIA_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getCotDiaSugerencia());

        fields += ", COT_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getCotNumCorte());

        fields += ", COT_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getCotCveTipoMerca());

        fields += ", COT_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getCotNumInstrume());

        fields += ", COT_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getCotNumSecEmis());

        fields += ", COT_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCotNumPlazo());

        fields += ", COT_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCotNomPizarra());

        fields += ", COT_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getCotSerieEmision());

        fields += ", COT_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getCotNumCuponVig());

        fields += ", COT_CVE_TIPO_OPERA";
        fieldValues += ", ?";
        values.add(this.getCotCveTipoOpera());

        fields += ", COT_CVE_FORMA_NEGO";
        fieldValues += ", ?";
        values.add(this.getCotCveFormaNego());

        fields += ", COT_IMP_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getCotImpSugerencia());

        fields += ", COT_IMP_ASIGNADO";
        fieldValues += ", ?";
        values.add(this.getCotImpAsignado());

        fields += ", COT_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getCotImpDisponible());

        fields += ", COT_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getCotNumContratos());

        fields += ", COT_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getCotHoraCorte());

        fields += ", COT_CVE_ST_CONCETI";
        fieldValues += ", ?";
        values.add(this.getCotCveStConceti());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONCETIT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND COT_ANO_SUGERENCIA = ?";
        values.add(this.getCotAnoSugerencia());
        conditions += " AND COT_MES_SUGERENCIA = ?";
        values.add(this.getCotMesSugerencia());
        conditions += " AND COT_DIA_SUGERENCIA = ?";
        values.add(this.getCotDiaSugerencia());
        conditions += " AND COT_NUM_CORTE = ?";
        values.add(this.getCotNumCorte());
        conditions += " AND COT_CVE_TIPO_MERCA = ?";
        values.add(this.getCotCveTipoMerca());
        conditions += " AND COT_NUM_INSTRUME = ?";
        values.add(this.getCotNumInstrume());
        conditions += " AND COT_NUM_SEC_EMIS = ?";
        values.add(this.getCotNumSecEmis());
        conditions += " AND COT_NUM_PLAZO = ?";
        values.add(this.getCotNumPlazo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Concetit instance = (Concetit) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCotAnoSugerencia().equals(instance.getCotAnoSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getCotMesSugerencia().equals(instance.getCotMesSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getCotDiaSugerencia().equals(instance.getCotDiaSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getCotNumCorte().equals(instance.getCotNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCotCveTipoMerca().equals(instance.getCotCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getCotNumInstrume().equals(instance.getCotNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getCotNumSecEmis().equals(instance.getCotNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCotNumPlazo().equals(instance.getCotNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCotNomPizarra().equals(instance.getCotNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCotSerieEmision().equals(instance.getCotSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCotNumCuponVig().equals(instance.getCotNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getCotCveTipoOpera().equals(instance.getCotCveTipoOpera()))
            equalObjects = false;
        if (equalObjects && !this.getCotCveFormaNego().equals(instance.getCotCveFormaNego()))
            equalObjects = false;
        if (equalObjects && !this.getCotImpSugerencia().equals(instance.getCotImpSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getCotImpAsignado().equals(instance.getCotImpAsignado()))
            equalObjects = false;
        if (equalObjects && !this.getCotImpDisponible().equals(instance.getCotImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getCotNumContratos().equals(instance.getCotNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getCotHoraCorte().equals(instance.getCotHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCotCveStConceti().equals(instance.getCotCveStConceti()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Concetit result = new Concetit();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCotAnoSugerencia((BigDecimal) objectData.getData("COT_ANO_SUGERENCIA"));
        result.setCotMesSugerencia((BigDecimal) objectData.getData("COT_MES_SUGERENCIA"));
        result.setCotDiaSugerencia((BigDecimal) objectData.getData("COT_DIA_SUGERENCIA"));
        result.setCotNumCorte((BigDecimal) objectData.getData("COT_NUM_CORTE"));
        result.setCotCveTipoMerca((BigDecimal) objectData.getData("COT_CVE_TIPO_MERCA"));
        result.setCotNumInstrume((BigDecimal) objectData.getData("COT_NUM_INSTRUME"));
        result.setCotNumSecEmis((BigDecimal) objectData.getData("COT_NUM_SEC_EMIS"));
        result.setCotNumPlazo((BigDecimal) objectData.getData("COT_NUM_PLAZO"));
        result.setCotNomPizarra((String) objectData.getData("COT_NOM_PIZARRA"));
        result.setCotSerieEmision((String) objectData.getData("COT_SERIE_EMISION"));
        result.setCotNumCuponVig((BigDecimal) objectData.getData("COT_NUM_CUPON_VIG"));
        result.setCotCveTipoOpera((String) objectData.getData("COT_CVE_TIPO_OPERA"));
        result.setCotCveFormaNego((String) objectData.getData("COT_CVE_FORMA_NEGO"));
        result.setCotImpSugerencia((BigDecimal) objectData.getData("COT_IMP_SUGERENCIA"));
        result.setCotImpAsignado((BigDecimal) objectData.getData("COT_IMP_ASIGNADO"));
        result.setCotImpDisponible((BigDecimal) objectData.getData("COT_IMP_DISPONIBLE"));
        result.setCotNumContratos((BigDecimal) objectData.getData("COT_NUM_CONTRATOS"));
        result.setCotHoraCorte((String) objectData.getData("COT_HORA_CORTE"));
        result.setCotCveStConceti((String) objectData.getData("COT_CVE_ST_CONCETI"));

        return result;

    }

}
