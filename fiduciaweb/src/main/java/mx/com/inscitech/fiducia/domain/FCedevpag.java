package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CEDEVPAG_PK", columns = { "ECED_ID_PROGRAMA", "ECED_ID_FIDEICOMISO", "ECED_ID_EMISION", "ECED_ID_PERIODO" }, sequences = { "MANUAL" })
public class FCedevpag extends DomainObject {

    BigDecimal ecedIdPrograma = null;
    BigDecimal ecedIdFideicomiso = null;
    BigDecimal ecedIdEmision = null;
    BigDecimal ecedIdPeriodo = null;
    String ecedFideicomitente = null;
    String ecedFecEmision = null;
    String ecedFecInicioPer = null;
    String ecedFecFinPer = null;
    String ecedFecPagoPer = null;
    String ecedFecDetermina = null;
    BigDecimal ecedPlazo = null;
    BigDecimal ecedTipoMoneda = null;
    BigDecimal ecedValorMoneda = null;
    BigDecimal ecedFacProrrata = null;
    BigDecimal ecedImpIntereses = null;
    BigDecimal ecedImpAmortizacion = null;
    String ecedStCedevpag = null;

    public FCedevpag() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcedIdPrograma(BigDecimal ecedIdPrograma) {
        this.ecedIdPrograma = ecedIdPrograma;
    }

    public BigDecimal getEcedIdPrograma() {
        return this.ecedIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcedIdFideicomiso(BigDecimal ecedIdFideicomiso) {
        this.ecedIdFideicomiso = ecedIdFideicomiso;
    }

    public BigDecimal getEcedIdFideicomiso() {
        return this.ecedIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcedIdEmision(BigDecimal ecedIdEmision) {
        this.ecedIdEmision = ecedIdEmision;
    }

    public BigDecimal getEcedIdEmision() {
        return this.ecedIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcedIdPeriodo(BigDecimal ecedIdPeriodo) {
        this.ecedIdPeriodo = ecedIdPeriodo;
    }

    public BigDecimal getEcedIdPeriodo() {
        return this.ecedIdPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcedFideicomitente(String ecedFideicomitente) {
        this.ecedFideicomitente = ecedFideicomitente;
    }

    public String getEcedFideicomitente() {
        return this.ecedFideicomitente;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcedFecEmision(String ecedFecEmision) {
        this.ecedFecEmision = ecedFecEmision;
    }

    public String getEcedFecEmision() {
        return this.ecedFecEmision;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcedFecInicioPer(String ecedFecInicioPer) {
        this.ecedFecInicioPer = ecedFecInicioPer;
    }

    public String getEcedFecInicioPer() {
        return this.ecedFecInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcedFecFinPer(String ecedFecFinPer) {
        this.ecedFecFinPer = ecedFecFinPer;
    }

    public String getEcedFecFinPer() {
        return this.ecedFecFinPer;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcedFecPagoPer(String ecedFecPagoPer) {
        this.ecedFecPagoPer = ecedFecPagoPer;
    }

    public String getEcedFecPagoPer() {
        return this.ecedFecPagoPer;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcedFecDetermina(String ecedFecDetermina) {
        this.ecedFecDetermina = ecedFecDetermina;
    }

    public String getEcedFecDetermina() {
        return this.ecedFecDetermina;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcedPlazo(BigDecimal ecedPlazo) {
        this.ecedPlazo = ecedPlazo;
    }

    public BigDecimal getEcedPlazo() {
        return this.ecedPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEcedTipoMoneda(BigDecimal ecedTipoMoneda) {
        this.ecedTipoMoneda = ecedTipoMoneda;
    }

    public BigDecimal getEcedTipoMoneda() {
        return this.ecedTipoMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setEcedValorMoneda(BigDecimal ecedValorMoneda) {
        this.ecedValorMoneda = ecedValorMoneda;
    }

    public BigDecimal getEcedValorMoneda() {
        return this.ecedValorMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcedFacProrrata(BigDecimal ecedFacProrrata) {
        this.ecedFacProrrata = ecedFacProrrata;
    }

    public BigDecimal getEcedFacProrrata() {
        return this.ecedFacProrrata;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcedImpIntereses(BigDecimal ecedImpIntereses) {
        this.ecedImpIntereses = ecedImpIntereses;
    }

    public BigDecimal getEcedImpIntereses() {
        return this.ecedImpIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcedImpAmortizacion(BigDecimal ecedImpAmortizacion) {
        this.ecedImpAmortizacion = ecedImpAmortizacion;
    }

    public BigDecimal getEcedImpAmortizacion() {
        return this.ecedImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcedStCedevpag(String ecedStCedevpag) {
        this.ecedStCedevpag = ecedStCedevpag;
    }

    public String getEcedStCedevpag() {
        return this.ecedStCedevpag;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CEDEVPAG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcedIdPrograma() != null && this.getEcedIdPrograma().longValue() == -999) {
            conditions += " AND ECED_ID_PROGRAMA IS NULL";
        } else if (this.getEcedIdPrograma() != null) {
            conditions += " AND ECED_ID_PROGRAMA = ?";
            values.add(this.getEcedIdPrograma());
        }

        if (this.getEcedIdFideicomiso() != null && this.getEcedIdFideicomiso().longValue() == -999) {
            conditions += " AND ECED_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcedIdFideicomiso() != null) {
            conditions += " AND ECED_ID_FIDEICOMISO = ?";
            values.add(this.getEcedIdFideicomiso());
        }

        if (this.getEcedIdEmision() != null && this.getEcedIdEmision().longValue() == -999) {
            conditions += " AND ECED_ID_EMISION IS NULL";
        } else if (this.getEcedIdEmision() != null) {
            conditions += " AND ECED_ID_EMISION = ?";
            values.add(this.getEcedIdEmision());
        }

        if (this.getEcedIdPeriodo() != null && this.getEcedIdPeriodo().longValue() == -999) {
            conditions += " AND ECED_ID_PERIODO IS NULL";
        } else if (this.getEcedIdPeriodo() != null) {
            conditions += " AND ECED_ID_PERIODO = ?";
            values.add(this.getEcedIdPeriodo());
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
        String sql = "SELECT * FROM F_CEDEVPAG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcedIdPrograma() != null && this.getEcedIdPrograma().longValue() == -999) {
            conditions += " AND ECED_ID_PROGRAMA IS NULL";
        } else if (this.getEcedIdPrograma() != null) {
            conditions += " AND ECED_ID_PROGRAMA = ?";
            values.add(this.getEcedIdPrograma());
        }

        if (this.getEcedIdFideicomiso() != null && this.getEcedIdFideicomiso().longValue() == -999) {
            conditions += " AND ECED_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcedIdFideicomiso() != null) {
            conditions += " AND ECED_ID_FIDEICOMISO = ?";
            values.add(this.getEcedIdFideicomiso());
        }

        if (this.getEcedIdEmision() != null && this.getEcedIdEmision().longValue() == -999) {
            conditions += " AND ECED_ID_EMISION IS NULL";
        } else if (this.getEcedIdEmision() != null) {
            conditions += " AND ECED_ID_EMISION = ?";
            values.add(this.getEcedIdEmision());
        }

        if (this.getEcedIdPeriodo() != null && this.getEcedIdPeriodo().longValue() == -999) {
            conditions += " AND ECED_ID_PERIODO IS NULL";
        } else if (this.getEcedIdPeriodo() != null) {
            conditions += " AND ECED_ID_PERIODO = ?";
            values.add(this.getEcedIdPeriodo());
        }

        if (this.getEcedFideicomitente() != null && "null".equals(this.getEcedFideicomitente())) {
            conditions += " AND ECED_FIDEICOMITENTE IS NULL";
        } else if (this.getEcedFideicomitente() != null) {
            conditions += " AND ECED_FIDEICOMITENTE = ?";
            values.add(this.getEcedFideicomitente());
        }

        if (this.getEcedFecEmision() != null && "null".equals(this.getEcedFecEmision())) {
            conditions += " AND ECED_FEC_EMISION IS NULL";
        } else if (this.getEcedFecEmision() != null) {
            conditions += " AND ECED_FEC_EMISION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcedFecEmision());
        }

        if (this.getEcedFecInicioPer() != null && "null".equals(this.getEcedFecInicioPer())) {
            conditions += " AND ECED_FEC_INICIO_PER IS NULL";
        } else if (this.getEcedFecInicioPer() != null) {
            conditions += " AND ECED_FEC_INICIO_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcedFecInicioPer());
        }

        if (this.getEcedFecFinPer() != null && "null".equals(this.getEcedFecFinPer())) {
            conditions += " AND ECED_FEC_FIN_PER IS NULL";
        } else if (this.getEcedFecFinPer() != null) {
            conditions += " AND ECED_FEC_FIN_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcedFecFinPer());
        }

        if (this.getEcedFecPagoPer() != null && "null".equals(this.getEcedFecPagoPer())) {
            conditions += " AND ECED_FEC_PAGO_PER IS NULL";
        } else if (this.getEcedFecPagoPer() != null) {
            conditions += " AND ECED_FEC_PAGO_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcedFecPagoPer());
        }

        if (this.getEcedFecDetermina() != null && "null".equals(this.getEcedFecDetermina())) {
            conditions += " AND ECED_FEC_DETERMINA IS NULL";
        } else if (this.getEcedFecDetermina() != null) {
            conditions += " AND ECED_FEC_DETERMINA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcedFecDetermina());
        }

        if (this.getEcedPlazo() != null && this.getEcedPlazo().longValue() == -999) {
            conditions += " AND ECED_PLAZO IS NULL";
        } else if (this.getEcedPlazo() != null) {
            conditions += " AND ECED_PLAZO = ?";
            values.add(this.getEcedPlazo());
        }

        if (this.getEcedTipoMoneda() != null && this.getEcedTipoMoneda().longValue() == -999) {
            conditions += " AND ECED_TIPO_MONEDA IS NULL";
        } else if (this.getEcedTipoMoneda() != null) {
            conditions += " AND ECED_TIPO_MONEDA = ?";
            values.add(this.getEcedTipoMoneda());
        }

        if (this.getEcedValorMoneda() != null && this.getEcedValorMoneda().longValue() == -999) {
            conditions += " AND ECED_VALOR_MONEDA IS NULL";
        } else if (this.getEcedValorMoneda() != null) {
            conditions += " AND ECED_VALOR_MONEDA = ?";
            values.add(this.getEcedValorMoneda());
        }

        if (this.getEcedFacProrrata() != null && this.getEcedFacProrrata().longValue() == -999) {
            conditions += " AND ECED_FAC_PRORRATA IS NULL";
        } else if (this.getEcedFacProrrata() != null) {
            conditions += " AND ECED_FAC_PRORRATA = ?";
            values.add(this.getEcedFacProrrata());
        }

        if (this.getEcedImpIntereses() != null && this.getEcedImpIntereses().longValue() == -999) {
            conditions += " AND ECED_IMP_INTERESES IS NULL";
        } else if (this.getEcedImpIntereses() != null) {
            conditions += " AND ECED_IMP_INTERESES = ?";
            values.add(this.getEcedImpIntereses());
        }

        if (this.getEcedImpAmortizacion() != null && this.getEcedImpAmortizacion().longValue() == -999) {
            conditions += " AND ECED_IMP_AMORTIZACION IS NULL";
        } else if (this.getEcedImpAmortizacion() != null) {
            conditions += " AND ECED_IMP_AMORTIZACION = ?";
            values.add(this.getEcedImpAmortizacion());
        }

        if (this.getEcedStCedevpag() != null && "null".equals(this.getEcedStCedevpag())) {
            conditions += " AND ECED_ST_CEDEVPAG IS NULL";
        } else if (this.getEcedStCedevpag() != null) {
            conditions += " AND ECED_ST_CEDEVPAG = ?";
            values.add(this.getEcedStCedevpag());
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
        String sql = "UPDATE F_CEDEVPAG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECED_ID_PROGRAMA = ?";
        pkValues.add(this.getEcedIdPrograma());
        conditions += " AND ECED_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEcedIdFideicomiso());
        conditions += " AND ECED_ID_EMISION = ?";
        pkValues.add(this.getEcedIdEmision());
        conditions += " AND ECED_ID_PERIODO = ?";
        pkValues.add(this.getEcedIdPeriodo());
        fields += " ECED_FIDEICOMITENTE = ?, ";
        values.add(this.getEcedFideicomitente());
        fields += " ECED_FEC_EMISION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcedFecEmision());
        fields += " ECED_FEC_INICIO_PER = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcedFecInicioPer());
        fields += " ECED_FEC_FIN_PER = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcedFecFinPer());
        fields += " ECED_FEC_PAGO_PER = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcedFecPagoPer());
        fields += " ECED_FEC_DETERMINA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcedFecDetermina());
        fields += " ECED_PLAZO = ?, ";
        values.add(this.getEcedPlazo());
        fields += " ECED_TIPO_MONEDA = ?, ";
        values.add(this.getEcedTipoMoneda());
        fields += " ECED_VALOR_MONEDA = ?, ";
        values.add(this.getEcedValorMoneda());
        fields += " ECED_FAC_PRORRATA = ?, ";
        values.add(this.getEcedFacProrrata());
        fields += " ECED_IMP_INTERESES = ?, ";
        values.add(this.getEcedImpIntereses());
        fields += " ECED_IMP_AMORTIZACION = ?, ";
        values.add(this.getEcedImpAmortizacion());
        fields += " ECED_ST_CEDEVPAG = ?, ";
        values.add(this.getEcedStCedevpag());
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
        String sql = "INSERT INTO F_CEDEVPAG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECED_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEcedIdPrograma());

        fields += ", ECED_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEcedIdFideicomiso());

        fields += ", ECED_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEcedIdEmision());

        fields += ", ECED_ID_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEcedIdPeriodo());

        fields += ", ECED_FIDEICOMITENTE";
        fieldValues += ", ?";
        values.add(this.getEcedFideicomitente());

        fields += ", ECED_FEC_EMISION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcedFecEmision());

        fields += ", ECED_FEC_INICIO_PER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcedFecInicioPer());

        fields += ", ECED_FEC_FIN_PER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcedFecFinPer());

        fields += ", ECED_FEC_PAGO_PER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcedFecPagoPer());

        fields += ", ECED_FEC_DETERMINA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcedFecDetermina());

        fields += ", ECED_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEcedPlazo());

        fields += ", ECED_TIPO_MONEDA";
        fieldValues += ", ?";
        values.add(this.getEcedTipoMoneda());

        fields += ", ECED_VALOR_MONEDA";
        fieldValues += ", ?";
        values.add(this.getEcedValorMoneda());

        fields += ", ECED_FAC_PRORRATA";
        fieldValues += ", ?";
        values.add(this.getEcedFacProrrata());

        fields += ", ECED_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getEcedImpIntereses());

        fields += ", ECED_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEcedImpAmortizacion());

        fields += ", ECED_ST_CEDEVPAG";
        fieldValues += ", ?";
        values.add(this.getEcedStCedevpag());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CEDEVPAG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECED_ID_PROGRAMA = ?";
        values.add(this.getEcedIdPrograma());
        conditions += " AND ECED_ID_FIDEICOMISO = ?";
        values.add(this.getEcedIdFideicomiso());
        conditions += " AND ECED_ID_EMISION = ?";
        values.add(this.getEcedIdEmision());
        conditions += " AND ECED_ID_PERIODO = ?";
        values.add(this.getEcedIdPeriodo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCedevpag instance = (FCedevpag) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcedIdPrograma().equals(instance.getEcedIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEcedIdFideicomiso().equals(instance.getEcedIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEcedIdEmision().equals(instance.getEcedIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcedIdPeriodo().equals(instance.getEcedIdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEcedFideicomitente().equals(instance.getEcedFideicomitente()))
            equalObjects = false;
        if (equalObjects && !this.getEcedFecEmision().equals(instance.getEcedFecEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcedFecInicioPer().equals(instance.getEcedFecInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getEcedFecFinPer().equals(instance.getEcedFecFinPer()))
            equalObjects = false;
        if (equalObjects && !this.getEcedFecPagoPer().equals(instance.getEcedFecPagoPer()))
            equalObjects = false;
        if (equalObjects && !this.getEcedFecDetermina().equals(instance.getEcedFecDetermina()))
            equalObjects = false;
        if (equalObjects && !this.getEcedPlazo().equals(instance.getEcedPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEcedTipoMoneda().equals(instance.getEcedTipoMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getEcedValorMoneda().equals(instance.getEcedValorMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getEcedFacProrrata().equals(instance.getEcedFacProrrata()))
            equalObjects = false;
        if (equalObjects && !this.getEcedImpIntereses().equals(instance.getEcedImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getEcedImpAmortizacion().equals(instance.getEcedImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcedStCedevpag().equals(instance.getEcedStCedevpag()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCedevpag result = new FCedevpag();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcedIdPrograma((BigDecimal) objectData.getData("ECED_ID_PROGRAMA"));
        result.setEcedIdFideicomiso((BigDecimal) objectData.getData("ECED_ID_FIDEICOMISO"));
        result.setEcedIdEmision((BigDecimal) objectData.getData("ECED_ID_EMISION"));
        result.setEcedIdPeriodo((BigDecimal) objectData.getData("ECED_ID_PERIODO"));
        result.setEcedFideicomitente((String) objectData.getData("ECED_FIDEICOMITENTE"));
        result.setEcedFecEmision((String) objectData.getData("ECED_FEC_EMISION"));
        result.setEcedFecInicioPer((String) objectData.getData("ECED_FEC_INICIO_PER"));
        result.setEcedFecFinPer((String) objectData.getData("ECED_FEC_FIN_PER"));
        result.setEcedFecPagoPer((String) objectData.getData("ECED_FEC_PAGO_PER"));
        result.setEcedFecDetermina((String) objectData.getData("ECED_FEC_DETERMINA"));
        result.setEcedPlazo((BigDecimal) objectData.getData("ECED_PLAZO"));
        result.setEcedTipoMoneda((BigDecimal) objectData.getData("ECED_TIPO_MONEDA"));
        result.setEcedValorMoneda((BigDecimal) objectData.getData("ECED_VALOR_MONEDA"));
        result.setEcedFacProrrata((BigDecimal) objectData.getData("ECED_FAC_PRORRATA"));
        result.setEcedImpIntereses((BigDecimal) objectData.getData("ECED_IMP_INTERESES"));
        result.setEcedImpAmortizacion((BigDecimal) objectData.getData("ECED_IMP_AMORTIZACION"));
        result.setEcedStCedevpag((String) objectData.getData("ECED_ST_CEDEVPAG"));

        return result;

    }

}
