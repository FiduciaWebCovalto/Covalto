package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PROGRAMA_PK", columns = { "EPRO_ID_PROGRAMA", "EPRO_EMISOR" }, sequences = { "MANUAL" })
public class FPrograma extends DomainObject {

    BigDecimal eproIdPrograma = null;
    BigDecimal eproTipoNegocio = null;
    String eproNomPrograma = null;
    String eproInstrumento = null;
    String eproModalidadEmision = null;
    BigDecimal eproEmisor = null;
    BigDecimal eproTipoEmisor = null;
    BigDecimal eproImpPrograma = null;
    BigDecimal eproImpDisponible = null;
    BigDecimal eproMoneda = null;
    String eproFecInicio = null;
    String eproFecVencimiento = null;
    BigDecimal eproAnoPlazo = null;
    BigDecimal eproDiasPlazo = null;
    String eproNumSerie = null;
    String eproAutorizacionRegval = null;
    String eproFecRegval = null;
    String eproAutorizacionCnbv = null;
    String eproFecCnbv = null;
    String eproAutorizacionBanxico = null;
    String eproFecBanxico = null;
    String eproStPrograma = null;

    public FPrograma() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEproIdPrograma(BigDecimal eproIdPrograma) {
        this.eproIdPrograma = eproIdPrograma;
    }

    public BigDecimal getEproIdPrograma() {
        return this.eproIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEproTipoNegocio(BigDecimal eproTipoNegocio) {
        this.eproTipoNegocio = eproTipoNegocio;
    }

    public BigDecimal getEproTipoNegocio() {
        return this.eproTipoNegocio;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEproNomPrograma(String eproNomPrograma) {
        this.eproNomPrograma = eproNomPrograma;
    }

    public String getEproNomPrograma() {
        return this.eproNomPrograma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEproInstrumento(String eproInstrumento) {
        this.eproInstrumento = eproInstrumento;
    }

    public String getEproInstrumento() {
        return this.eproInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEproModalidadEmision(String eproModalidadEmision) {
        this.eproModalidadEmision = eproModalidadEmision;
    }

    public String getEproModalidadEmision() {
        return this.eproModalidadEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEproEmisor(BigDecimal eproEmisor) {
        this.eproEmisor = eproEmisor;
    }

    public BigDecimal getEproEmisor() {
        return this.eproEmisor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEproTipoEmisor(BigDecimal eproTipoEmisor) {
        this.eproTipoEmisor = eproTipoEmisor;
    }

    public BigDecimal getEproTipoEmisor() {
        return this.eproTipoEmisor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEproImpPrograma(BigDecimal eproImpPrograma) {
        this.eproImpPrograma = eproImpPrograma;
    }

    public BigDecimal getEproImpPrograma() {
        return this.eproImpPrograma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEproImpDisponible(BigDecimal eproImpDisponible) {
        this.eproImpDisponible = eproImpDisponible;
    }

    public BigDecimal getEproImpDisponible() {
        return this.eproImpDisponible;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEproMoneda(BigDecimal eproMoneda) {
        this.eproMoneda = eproMoneda;
    }

    public BigDecimal getEproMoneda() {
        return this.eproMoneda;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEproFecInicio(String eproFecInicio) {
        this.eproFecInicio = eproFecInicio;
    }

    public String getEproFecInicio() {
        return this.eproFecInicio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEproFecVencimiento(String eproFecVencimiento) {
        this.eproFecVencimiento = eproFecVencimiento;
    }

    public String getEproFecVencimiento() {
        return this.eproFecVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEproAnoPlazo(BigDecimal eproAnoPlazo) {
        this.eproAnoPlazo = eproAnoPlazo;
    }

    public BigDecimal getEproAnoPlazo() {
        return this.eproAnoPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEproDiasPlazo(BigDecimal eproDiasPlazo) {
        this.eproDiasPlazo = eproDiasPlazo;
    }

    public BigDecimal getEproDiasPlazo() {
        return this.eproDiasPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEproNumSerie(String eproNumSerie) {
        this.eproNumSerie = eproNumSerie;
    }

    public String getEproNumSerie() {
        return this.eproNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEproAutorizacionRegval(String eproAutorizacionRegval) {
        this.eproAutorizacionRegval = eproAutorizacionRegval;
    }

    public String getEproAutorizacionRegval() {
        return this.eproAutorizacionRegval;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEproFecRegval(String eproFecRegval) {
        this.eproFecRegval = eproFecRegval;
    }

    public String getEproFecRegval() {
        return this.eproFecRegval;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEproAutorizacionCnbv(String eproAutorizacionCnbv) {
        this.eproAutorizacionCnbv = eproAutorizacionCnbv;
    }

    public String getEproAutorizacionCnbv() {
        return this.eproAutorizacionCnbv;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEproFecCnbv(String eproFecCnbv) {
        this.eproFecCnbv = eproFecCnbv;
    }

    public String getEproFecCnbv() {
        return this.eproFecCnbv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEproAutorizacionBanxico(String eproAutorizacionBanxico) {
        this.eproAutorizacionBanxico = eproAutorizacionBanxico;
    }

    public String getEproAutorizacionBanxico() {
        return this.eproAutorizacionBanxico;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEproFecBanxico(String eproFecBanxico) {
        this.eproFecBanxico = eproFecBanxico;
    }

    public String getEproFecBanxico() {
        return this.eproFecBanxico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEproStPrograma(String eproStPrograma) {
        this.eproStPrograma = eproStPrograma;
    }

    public String getEproStPrograma() {
        return this.eproStPrograma;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PROGRAMA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEproIdPrograma() != null && this.getEproIdPrograma().longValue() == -999) {
            conditions += " AND EPRO_ID_PROGRAMA IS NULL";
        } else if (this.getEproIdPrograma() != null) {
            conditions += " AND EPRO_ID_PROGRAMA = ?";
            values.add(this.getEproIdPrograma());
        }

        if (this.getEproEmisor() != null && this.getEproEmisor().longValue() == -999) {
            conditions += " AND EPRO_EMISOR IS NULL";
        } else if (this.getEproEmisor() != null) {
            conditions += " AND EPRO_EMISOR = ?";
            values.add(this.getEproEmisor());
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
        String sql = "SELECT * FROM F_PROGRAMA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEproIdPrograma() != null && this.getEproIdPrograma().longValue() == -999) {
            conditions += " AND EPRO_ID_PROGRAMA IS NULL";
        } else if (this.getEproIdPrograma() != null) {
            conditions += " AND EPRO_ID_PROGRAMA = ?";
            values.add(this.getEproIdPrograma());
        }

        if (this.getEproTipoNegocio() != null && this.getEproTipoNegocio().longValue() == -999) {
            conditions += " AND EPRO_TIPO_NEGOCIO IS NULL";
        } else if (this.getEproTipoNegocio() != null) {
            conditions += " AND EPRO_TIPO_NEGOCIO = ?";
            values.add(this.getEproTipoNegocio());
        }

        if (this.getEproNomPrograma() != null && "null".equals(this.getEproNomPrograma())) {
            conditions += " AND EPRO_NOM_PROGRAMA IS NULL";
        } else if (this.getEproNomPrograma() != null) {
            conditions += " AND EPRO_NOM_PROGRAMA = ?";
            values.add(this.getEproNomPrograma());
        }

        if (this.getEproInstrumento() != null && "null".equals(this.getEproInstrumento())) {
            conditions += " AND EPRO_INSTRUMENTO IS NULL";
        } else if (this.getEproInstrumento() != null) {
            conditions += " AND EPRO_INSTRUMENTO = ?";
            values.add(this.getEproInstrumento());
        }

        if (this.getEproModalidadEmision() != null && "null".equals(this.getEproModalidadEmision())) {
            conditions += " AND EPRO_MODALIDAD_EMISION IS NULL";
        } else if (this.getEproModalidadEmision() != null) {
            conditions += " AND EPRO_MODALIDAD_EMISION = ?";
            values.add(this.getEproModalidadEmision());
        }

        if (this.getEproEmisor() != null && this.getEproEmisor().longValue() == -999) {
            conditions += " AND EPRO_EMISOR IS NULL";
        } else if (this.getEproEmisor() != null) {
            conditions += " AND EPRO_EMISOR = ?";
            values.add(this.getEproEmisor());
        }

        if (this.getEproTipoEmisor() != null && this.getEproTipoEmisor().longValue() == -999) {
            conditions += " AND EPRO_TIPO_EMISOR IS NULL";
        } else if (this.getEproTipoEmisor() != null) {
            conditions += " AND EPRO_TIPO_EMISOR = ?";
            values.add(this.getEproTipoEmisor());
        }

        if (this.getEproImpPrograma() != null && this.getEproImpPrograma().longValue() == -999) {
            conditions += " AND EPRO_IMP_PROGRAMA IS NULL";
        } else if (this.getEproImpPrograma() != null) {
            conditions += " AND EPRO_IMP_PROGRAMA = ?";
            values.add(this.getEproImpPrograma());
        }

        if (this.getEproImpDisponible() != null && this.getEproImpDisponible().longValue() == -999) {
            conditions += " AND EPRO_IMP_DISPONIBLE IS NULL";
        } else if (this.getEproImpDisponible() != null) {
            conditions += " AND EPRO_IMP_DISPONIBLE = ?";
            values.add(this.getEproImpDisponible());
        }

        if (this.getEproMoneda() != null && this.getEproMoneda().longValue() == -999) {
            conditions += " AND EPRO_MONEDA IS NULL";
        } else if (this.getEproMoneda() != null) {
            conditions += " AND EPRO_MONEDA = ?";
            values.add(this.getEproMoneda());
        }

        if (this.getEproFecInicio() != null && "null".equals(this.getEproFecInicio())) {
            conditions += " AND EPRO_FEC_INICIO IS NULL";
        } else if (this.getEproFecInicio() != null) {
            conditions += " AND EPRO_FEC_INICIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEproFecInicio());
        }

        if (this.getEproFecVencimiento() != null && "null".equals(this.getEproFecVencimiento())) {
            conditions += " AND EPRO_FEC_VENCIMIENTO IS NULL";
        } else if (this.getEproFecVencimiento() != null) {
            conditions += " AND EPRO_FEC_VENCIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEproFecVencimiento());
        }

        if (this.getEproAnoPlazo() != null && this.getEproAnoPlazo().longValue() == -999) {
            conditions += " AND EPRO_ANO_PLAZO IS NULL";
        } else if (this.getEproAnoPlazo() != null) {
            conditions += " AND EPRO_ANO_PLAZO = ?";
            values.add(this.getEproAnoPlazo());
        }

        if (this.getEproDiasPlazo() != null && this.getEproDiasPlazo().longValue() == -999) {
            conditions += " AND EPRO_DIAS_PLAZO IS NULL";
        } else if (this.getEproDiasPlazo() != null) {
            conditions += " AND EPRO_DIAS_PLAZO = ?";
            values.add(this.getEproDiasPlazo());
        }

        if (this.getEproNumSerie() != null && "null".equals(this.getEproNumSerie())) {
            conditions += " AND EPRO_NUM_SERIE IS NULL";
        } else if (this.getEproNumSerie() != null) {
            conditions += " AND EPRO_NUM_SERIE = ?";
            values.add(this.getEproNumSerie());
        }

        if (this.getEproAutorizacionRegval() != null && "null".equals(this.getEproAutorizacionRegval())) {
            conditions += " AND EPRO_AUTORIZACION_REGVAL IS NULL";
        } else if (this.getEproAutorizacionRegval() != null) {
            conditions += " AND EPRO_AUTORIZACION_REGVAL = ?";
            values.add(this.getEproAutorizacionRegval());
        }

        if (this.getEproFecRegval() != null && "null".equals(this.getEproFecRegval())) {
            conditions += " AND EPRO_FEC_REGVAL IS NULL";
        } else if (this.getEproFecRegval() != null) {
            conditions += " AND EPRO_FEC_REGVAL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEproFecRegval());
        }

        if (this.getEproAutorizacionCnbv() != null && "null".equals(this.getEproAutorizacionCnbv())) {
            conditions += " AND EPRO_AUTORIZACION_CNBV IS NULL";
        } else if (this.getEproAutorizacionCnbv() != null) {
            conditions += " AND EPRO_AUTORIZACION_CNBV = ?";
            values.add(this.getEproAutorizacionCnbv());
        }

        if (this.getEproFecCnbv() != null && "null".equals(this.getEproFecCnbv())) {
            conditions += " AND EPRO_FEC_CNBV IS NULL";
        } else if (this.getEproFecCnbv() != null) {
            conditions += " AND EPRO_FEC_CNBV = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEproFecCnbv());
        }

        if (this.getEproAutorizacionBanxico() != null && "null".equals(this.getEproAutorizacionBanxico())) {
            conditions += " AND EPRO_AUTORIZACION_BANXICO IS NULL";
        } else if (this.getEproAutorizacionBanxico() != null) {
            conditions += " AND EPRO_AUTORIZACION_BANXICO = ?";
            values.add(this.getEproAutorizacionBanxico());
        }

        if (this.getEproFecBanxico() != null && "null".equals(this.getEproFecBanxico())) {
            conditions += " AND EPRO_FEC_BANXICO IS NULL";
        } else if (this.getEproFecBanxico() != null) {
            conditions += " AND EPRO_FEC_BANXICO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEproFecBanxico());
        }

        if (this.getEproStPrograma() != null && "null".equals(this.getEproStPrograma())) {
            conditions += " AND EPRO_ST_PROGRAMA IS NULL";
        } else if (this.getEproStPrograma() != null) {
            conditions += " AND EPRO_ST_PROGRAMA = ?";
            values.add(this.getEproStPrograma());
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
        String sql = "UPDATE F_PROGRAMA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EPRO_ID_PROGRAMA = ?";
        pkValues.add(this.getEproIdPrograma());
        fields += " EPRO_TIPO_NEGOCIO = ?, ";
        values.add(this.getEproTipoNegocio());
        fields += " EPRO_NOM_PROGRAMA = ?, ";
        values.add(this.getEproNomPrograma());
        fields += " EPRO_INSTRUMENTO = ?, ";
        values.add(this.getEproInstrumento());
        fields += " EPRO_MODALIDAD_EMISION = ?, ";
        values.add(this.getEproModalidadEmision());
        conditions += " AND EPRO_EMISOR = ?";
        pkValues.add(this.getEproEmisor());
        fields += " EPRO_TIPO_EMISOR = ?, ";
        values.add(this.getEproTipoEmisor());
        fields += " EPRO_IMP_PROGRAMA = ?, ";
        values.add(this.getEproImpPrograma());
        fields += " EPRO_IMP_DISPONIBLE = ?, ";
        values.add(this.getEproImpDisponible());
        fields += " EPRO_MONEDA = ?, ";
        values.add(this.getEproMoneda());
        fields += " EPRO_FEC_INICIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEproFecInicio());
        fields += " EPRO_FEC_VENCIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEproFecVencimiento());
        fields += " EPRO_ANO_PLAZO = ?, ";
        values.add(this.getEproAnoPlazo());
        fields += " EPRO_DIAS_PLAZO = ?, ";
        values.add(this.getEproDiasPlazo());
        fields += " EPRO_NUM_SERIE = ?, ";
        values.add(this.getEproNumSerie());
        fields += " EPRO_AUTORIZACION_REGVAL = ?, ";
        values.add(this.getEproAutorizacionRegval());
        fields += " EPRO_FEC_REGVAL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEproFecRegval());
        fields += " EPRO_AUTORIZACION_CNBV = ?, ";
        values.add(this.getEproAutorizacionCnbv());
        fields += " EPRO_FEC_CNBV = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEproFecCnbv());
        fields += " EPRO_AUTORIZACION_BANXICO = ?, ";
        values.add(this.getEproAutorizacionBanxico());
        fields += " EPRO_FEC_BANXICO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEproFecBanxico());
        fields += " EPRO_ST_PROGRAMA = ?, ";
        values.add(this.getEproStPrograma());
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
        String sql = "INSERT INTO F_PROGRAMA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EPRO_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEproIdPrograma());

        fields += ", EPRO_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getEproTipoNegocio());

        fields += ", EPRO_NOM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEproNomPrograma());

        fields += ", EPRO_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getEproInstrumento());

        fields += ", EPRO_MODALIDAD_EMISION";
        fieldValues += ", ?";
        values.add(this.getEproModalidadEmision());

        fields += ", EPRO_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEproEmisor());

        fields += ", EPRO_TIPO_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEproTipoEmisor());

        fields += ", EPRO_IMP_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEproImpPrograma());

        fields += ", EPRO_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getEproImpDisponible());

        fields += ", EPRO_MONEDA";
        fieldValues += ", ?";
        values.add(this.getEproMoneda());

        fields += ", EPRO_FEC_INICIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEproFecInicio());

        fields += ", EPRO_FEC_VENCIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEproFecVencimiento());

        fields += ", EPRO_ANO_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEproAnoPlazo());

        fields += ", EPRO_DIAS_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEproDiasPlazo());

        fields += ", EPRO_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getEproNumSerie());

        fields += ", EPRO_AUTORIZACION_REGVAL";
        fieldValues += ", ?";
        values.add(this.getEproAutorizacionRegval());

        fields += ", EPRO_FEC_REGVAL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEproFecRegval());

        fields += ", EPRO_AUTORIZACION_CNBV";
        fieldValues += ", ?";
        values.add(this.getEproAutorizacionCnbv());

        fields += ", EPRO_FEC_CNBV";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEproFecCnbv());

        fields += ", EPRO_AUTORIZACION_BANXICO";
        fieldValues += ", ?";
        values.add(this.getEproAutorizacionBanxico());

        fields += ", EPRO_FEC_BANXICO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEproFecBanxico());

        fields += ", EPRO_ST_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEproStPrograma());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PROGRAMA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EPRO_ID_PROGRAMA = ?";
        values.add(this.getEproIdPrograma());
        conditions += " AND EPRO_EMISOR = ?";
        values.add(this.getEproEmisor());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FPrograma instance = (FPrograma) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEproIdPrograma().equals(instance.getEproIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEproTipoNegocio().equals(instance.getEproTipoNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getEproNomPrograma().equals(instance.getEproNomPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEproInstrumento().equals(instance.getEproInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getEproModalidadEmision().equals(instance.getEproModalidadEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEproEmisor().equals(instance.getEproEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEproTipoEmisor().equals(instance.getEproTipoEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEproImpPrograma().equals(instance.getEproImpPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEproImpDisponible().equals(instance.getEproImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getEproMoneda().equals(instance.getEproMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getEproFecInicio().equals(instance.getEproFecInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEproFecVencimiento().equals(instance.getEproFecVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEproAnoPlazo().equals(instance.getEproAnoPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEproDiasPlazo().equals(instance.getEproDiasPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEproNumSerie().equals(instance.getEproNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEproAutorizacionRegval().equals(instance.getEproAutorizacionRegval()))
            equalObjects = false;
        if (equalObjects && !this.getEproFecRegval().equals(instance.getEproFecRegval()))
            equalObjects = false;
        if (equalObjects && !this.getEproAutorizacionCnbv().equals(instance.getEproAutorizacionCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getEproFecCnbv().equals(instance.getEproFecCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getEproAutorizacionBanxico().equals(instance.getEproAutorizacionBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getEproFecBanxico().equals(instance.getEproFecBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getEproStPrograma().equals(instance.getEproStPrograma()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPrograma result = new FPrograma();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEproIdPrograma((BigDecimal) objectData.getData("EPRO_ID_PROGRAMA"));
        result.setEproTipoNegocio((BigDecimal) objectData.getData("EPRO_TIPO_NEGOCIO"));
        result.setEproNomPrograma((String) objectData.getData("EPRO_NOM_PROGRAMA"));
        result.setEproInstrumento((String) objectData.getData("EPRO_INSTRUMENTO"));
        result.setEproModalidadEmision((String) objectData.getData("EPRO_MODALIDAD_EMISION"));
        result.setEproEmisor((BigDecimal) objectData.getData("EPRO_EMISOR"));
        result.setEproTipoEmisor((BigDecimal) objectData.getData("EPRO_TIPO_EMISOR"));
        result.setEproImpPrograma((BigDecimal) objectData.getData("EPRO_IMP_PROGRAMA"));
        result.setEproImpDisponible((BigDecimal) objectData.getData("EPRO_IMP_DISPONIBLE"));
        result.setEproMoneda((BigDecimal) objectData.getData("EPRO_MONEDA"));
        result.setEproFecInicio((String) objectData.getData("EPRO_FEC_INICIO"));
        result.setEproFecVencimiento((String) objectData.getData("EPRO_FEC_VENCIMIENTO"));
        result.setEproAnoPlazo((BigDecimal) objectData.getData("EPRO_ANO_PLAZO"));
        result.setEproDiasPlazo((BigDecimal) objectData.getData("EPRO_DIAS_PLAZO"));
        result.setEproNumSerie((String) objectData.getData("EPRO_NUM_SERIE"));
        result.setEproAutorizacionRegval((String) objectData.getData("EPRO_AUTORIZACION_REGVAL"));
        result.setEproFecRegval((String) objectData.getData("EPRO_FEC_REGVAL"));
        result.setEproAutorizacionCnbv((String) objectData.getData("EPRO_AUTORIZACION_CNBV"));
        result.setEproFecCnbv((String) objectData.getData("EPRO_FEC_CNBV"));
        result.setEproAutorizacionBanxico((String) objectData.getData("EPRO_AUTORIZACION_BANXICO"));
        result.setEproFecBanxico((String) objectData.getData("EPRO_FEC_BANXICO"));
        result.setEproStPrograma((String) objectData.getData("EPRO_ST_PROGRAMA"));

        return result;

    }

}
