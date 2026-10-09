package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COMPRADI_PK",
            columns = { "CPD_NUM_CONTRATO", "CPD_NUM_CORTE", "CPD_SUB_CONTRATO", "CPD_CVE_TIPO_MERCA", "CPD_NUM_INSTRUME", "CPD_NUM_SEC_EMIS", "CPD_NUM_PLAZO" },
            sequences = { "MANUAL" })
public class Compradi extends DomainObject {

    BigDecimal cpdNumCorte = null;
    BigDecimal cpdNumContrato = null;
    BigDecimal cpdSubContrato = null;
    BigDecimal cpdCveTipoMerca = null;
    BigDecimal cpdNumInstrume = null;
    BigDecimal cpdNumSecEmis = null;
    BigDecimal cpdNumPlazo = null;
    String cpdNomPizarra = null;
    String cpdSerieEmision = null;
    BigDecimal cpdNumCuponVig = null;
    String cpdCveTipoPers = null;
    String cpdCvePersonAdq = null;
    BigDecimal cpdNumProducto = null;
    String cpdCveTipoOpera = null;
    String cpdCveFormaNeg = null;
    BigDecimal cpdImpSugerido = null;
    BigDecimal cpdImpAsignado = null;
    BigDecimal cpdImpDisponible = null;
    String cpdCveStComprad = null;

    public Compradi() {
        super();
        this.pkColumns = 7;
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

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdCveTipoMerca(BigDecimal cpdCveTipoMerca) {
        this.cpdCveTipoMerca = cpdCveTipoMerca;
    }

    public BigDecimal getCpdCveTipoMerca() {
        return this.cpdCveTipoMerca;
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
    public void setCpdNumPlazo(BigDecimal cpdNumPlazo) {
        this.cpdNumPlazo = cpdNumPlazo;
    }

    public BigDecimal getCpdNumPlazo() {
        return this.cpdNumPlazo;
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

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumCuponVig(BigDecimal cpdNumCuponVig) {
        this.cpdNumCuponVig = cpdNumCuponVig;
    }

    public BigDecimal getCpdNumCuponVig() {
        return this.cpdNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdCveTipoPers(String cpdCveTipoPers) {
        this.cpdCveTipoPers = cpdCveTipoPers;
    }

    public String getCpdCveTipoPers() {
        return this.cpdCveTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdCvePersonAdq(String cpdCvePersonAdq) {
        this.cpdCvePersonAdq = cpdCvePersonAdq;
    }

    public String getCpdCvePersonAdq() {
        return this.cpdCvePersonAdq;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpdNumProducto(BigDecimal cpdNumProducto) {
        this.cpdNumProducto = cpdNumProducto;
    }

    public BigDecimal getCpdNumProducto() {
        return this.cpdNumProducto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdCveTipoOpera(String cpdCveTipoOpera) {
        this.cpdCveTipoOpera = cpdCveTipoOpera;
    }

    public String getCpdCveTipoOpera() {
        return this.cpdCveTipoOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdCveFormaNeg(String cpdCveFormaNeg) {
        this.cpdCveFormaNeg = cpdCveFormaNeg;
    }

    public String getCpdCveFormaNeg() {
        return this.cpdCveFormaNeg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpdImpSugerido(BigDecimal cpdImpSugerido) {
        this.cpdImpSugerido = cpdImpSugerido;
    }

    public BigDecimal getCpdImpSugerido() {
        return this.cpdImpSugerido;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpdImpAsignado(BigDecimal cpdImpAsignado) {
        this.cpdImpAsignado = cpdImpAsignado;
    }

    public BigDecimal getCpdImpAsignado() {
        return this.cpdImpAsignado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpdImpDisponible(BigDecimal cpdImpDisponible) {
        this.cpdImpDisponible = cpdImpDisponible;
    }

    public BigDecimal getCpdImpDisponible() {
        return this.cpdImpDisponible;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpdCveStComprad(String cpdCveStComprad) {
        this.cpdCveStComprad = cpdCveStComprad;
    }

    public String getCpdCveStComprad() {
        return this.cpdCveStComprad;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COMPRADI ";

        String conditions = "";
        ArrayList values = new ArrayList();

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

        if (this.getCpdCveTipoMerca() != null && this.getCpdCveTipoMerca().longValue() == -999) {
            conditions += " AND CPD_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCpdCveTipoMerca() != null) {
            conditions += " AND CPD_CVE_TIPO_MERCA = ?";
            values.add(this.getCpdCveTipoMerca());
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

        if (this.getCpdNumPlazo() != null && this.getCpdNumPlazo().longValue() == -999) {
            conditions += " AND CPD_NUM_PLAZO IS NULL";
        } else if (this.getCpdNumPlazo() != null) {
            conditions += " AND CPD_NUM_PLAZO = ?";
            values.add(this.getCpdNumPlazo());
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
        String sql = "SELECT * FROM COMPRADI ";

        String conditions = "";
        ArrayList values = new ArrayList();

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

        if (this.getCpdCveTipoMerca() != null && this.getCpdCveTipoMerca().longValue() == -999) {
            conditions += " AND CPD_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCpdCveTipoMerca() != null) {
            conditions += " AND CPD_CVE_TIPO_MERCA = ?";
            values.add(this.getCpdCveTipoMerca());
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

        if (this.getCpdNumPlazo() != null && this.getCpdNumPlazo().longValue() == -999) {
            conditions += " AND CPD_NUM_PLAZO IS NULL";
        } else if (this.getCpdNumPlazo() != null) {
            conditions += " AND CPD_NUM_PLAZO = ?";
            values.add(this.getCpdNumPlazo());
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

        if (this.getCpdNumCuponVig() != null && this.getCpdNumCuponVig().longValue() == -999) {
            conditions += " AND CPD_NUM_CUPON_VIG IS NULL";
        } else if (this.getCpdNumCuponVig() != null) {
            conditions += " AND CPD_NUM_CUPON_VIG = ?";
            values.add(this.getCpdNumCuponVig());
        }

        if (this.getCpdCveTipoPers() != null && "null".equals(this.getCpdCveTipoPers())) {
            conditions += " AND CPD_CVE_TIPO_PERS IS NULL";
        } else if (this.getCpdCveTipoPers() != null) {
            conditions += " AND CPD_CVE_TIPO_PERS = ?";
            values.add(this.getCpdCveTipoPers());
        }

        if (this.getCpdCvePersonAdq() != null && "null".equals(this.getCpdCvePersonAdq())) {
            conditions += " AND CPD_CVE_PERSON_ADQ IS NULL";
        } else if (this.getCpdCvePersonAdq() != null) {
            conditions += " AND CPD_CVE_PERSON_ADQ = ?";
            values.add(this.getCpdCvePersonAdq());
        }

        if (this.getCpdNumProducto() != null && this.getCpdNumProducto().longValue() == -999) {
            conditions += " AND CPD_NUM_PRODUCTO IS NULL";
        } else if (this.getCpdNumProducto() != null) {
            conditions += " AND CPD_NUM_PRODUCTO = ?";
            values.add(this.getCpdNumProducto());
        }

        if (this.getCpdCveTipoOpera() != null && "null".equals(this.getCpdCveTipoOpera())) {
            conditions += " AND CPD_CVE_TIPO_OPERA IS NULL";
        } else if (this.getCpdCveTipoOpera() != null) {
            conditions += " AND CPD_CVE_TIPO_OPERA = ?";
            values.add(this.getCpdCveTipoOpera());
        }

        if (this.getCpdCveFormaNeg() != null && "null".equals(this.getCpdCveFormaNeg())) {
            conditions += " AND CPD_CVE_FORMA_NEG IS NULL";
        } else if (this.getCpdCveFormaNeg() != null) {
            conditions += " AND CPD_CVE_FORMA_NEG = ?";
            values.add(this.getCpdCveFormaNeg());
        }

        if (this.getCpdImpSugerido() != null && this.getCpdImpSugerido().longValue() == -999) {
            conditions += " AND CPD_IMP_SUGERIDO IS NULL";
        } else if (this.getCpdImpSugerido() != null) {
            conditions += " AND CPD_IMP_SUGERIDO = ?";
            values.add(this.getCpdImpSugerido());
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

        if (this.getCpdCveStComprad() != null && "null".equals(this.getCpdCveStComprad())) {
            conditions += " AND CPD_CVE_ST_COMPRAD IS NULL";
        } else if (this.getCpdCveStComprad() != null) {
            conditions += " AND CPD_CVE_ST_COMPRAD = ?";
            values.add(this.getCpdCveStComprad());
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
        String sql = "UPDATE COMPRADI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPD_NUM_CORTE = ?";
        pkValues.add(this.getCpdNumCorte());
        conditions += " AND CPD_NUM_CONTRATO = ?";
        pkValues.add(this.getCpdNumContrato());
        conditions += " AND CPD_SUB_CONTRATO = ?";
        pkValues.add(this.getCpdSubContrato());
        conditions += " AND CPD_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getCpdCveTipoMerca());
        conditions += " AND CPD_NUM_INSTRUME = ?";
        pkValues.add(this.getCpdNumInstrume());
        conditions += " AND CPD_NUM_SEC_EMIS = ?";
        pkValues.add(this.getCpdNumSecEmis());
        conditions += " AND CPD_NUM_PLAZO = ?";
        pkValues.add(this.getCpdNumPlazo());
        fields += " CPD_NOM_PIZARRA = ?, ";
        values.add(this.getCpdNomPizarra());
        fields += " CPD_SERIE_EMISION = ?, ";
        values.add(this.getCpdSerieEmision());
        fields += " CPD_NUM_CUPON_VIG = ?, ";
        values.add(this.getCpdNumCuponVig());
        fields += " CPD_CVE_TIPO_PERS = ?, ";
        values.add(this.getCpdCveTipoPers());
        fields += " CPD_CVE_PERSON_ADQ = ?, ";
        values.add(this.getCpdCvePersonAdq());
        fields += " CPD_NUM_PRODUCTO = ?, ";
        values.add(this.getCpdNumProducto());
        fields += " CPD_CVE_TIPO_OPERA = ?, ";
        values.add(this.getCpdCveTipoOpera());
        fields += " CPD_CVE_FORMA_NEG = ?, ";
        values.add(this.getCpdCveFormaNeg());
        fields += " CPD_IMP_SUGERIDO = ?, ";
        values.add(this.getCpdImpSugerido());
        fields += " CPD_IMP_ASIGNADO = ?, ";
        values.add(this.getCpdImpAsignado());
        fields += " CPD_IMP_DISPONIBLE = ?, ";
        values.add(this.getCpdImpDisponible());
        fields += " CPD_CVE_ST_COMPRAD = ?, ";
        values.add(this.getCpdCveStComprad());
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
        String sql = "INSERT INTO COMPRADI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPD_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getCpdNumCorte());

        fields += ", CPD_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCpdNumContrato());

        fields += ", CPD_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCpdSubContrato());

        fields += ", CPD_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getCpdCveTipoMerca());

        fields += ", CPD_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getCpdNumInstrume());

        fields += ", CPD_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpdNumSecEmis());

        fields += ", CPD_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCpdNumPlazo());

        fields += ", CPD_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCpdNomPizarra());

        fields += ", CPD_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getCpdSerieEmision());

        fields += ", CPD_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getCpdNumCuponVig());

        fields += ", CPD_CVE_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getCpdCveTipoPers());

        fields += ", CPD_CVE_PERSON_ADQ";
        fieldValues += ", ?";
        values.add(this.getCpdCvePersonAdq());

        fields += ", CPD_NUM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getCpdNumProducto());

        fields += ", CPD_CVE_TIPO_OPERA";
        fieldValues += ", ?";
        values.add(this.getCpdCveTipoOpera());

        fields += ", CPD_CVE_FORMA_NEG";
        fieldValues += ", ?";
        values.add(this.getCpdCveFormaNeg());

        fields += ", CPD_IMP_SUGERIDO";
        fieldValues += ", ?";
        values.add(this.getCpdImpSugerido());

        fields += ", CPD_IMP_ASIGNADO";
        fieldValues += ", ?";
        values.add(this.getCpdImpAsignado());

        fields += ", CPD_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getCpdImpDisponible());

        fields += ", CPD_CVE_ST_COMPRAD";
        fieldValues += ", ?";
        values.add(this.getCpdCveStComprad());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COMPRADI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPD_NUM_CORTE = ?";
        values.add(this.getCpdNumCorte());
        conditions += " AND CPD_NUM_CONTRATO = ?";
        values.add(this.getCpdNumContrato());
        conditions += " AND CPD_SUB_CONTRATO = ?";
        values.add(this.getCpdSubContrato());
        conditions += " AND CPD_CVE_TIPO_MERCA = ?";
        values.add(this.getCpdCveTipoMerca());
        conditions += " AND CPD_NUM_INSTRUME = ?";
        values.add(this.getCpdNumInstrume());
        conditions += " AND CPD_NUM_SEC_EMIS = ?";
        values.add(this.getCpdNumSecEmis());
        conditions += " AND CPD_NUM_PLAZO = ?";
        values.add(this.getCpdNumPlazo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Compradi instance = (Compradi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpdNumCorte().equals(instance.getCpdNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumContrato().equals(instance.getCpdNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCpdSubContrato().equals(instance.getCpdSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveTipoMerca().equals(instance.getCpdCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumInstrume().equals(instance.getCpdNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumSecEmis().equals(instance.getCpdNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumPlazo().equals(instance.getCpdNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNomPizarra().equals(instance.getCpdNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCpdSerieEmision().equals(instance.getCpdSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumCuponVig().equals(instance.getCpdNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveTipoPers().equals(instance.getCpdCveTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCvePersonAdq().equals(instance.getCpdCvePersonAdq()))
            equalObjects = false;
        if (equalObjects && !this.getCpdNumProducto().equals(instance.getCpdNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveTipoOpera().equals(instance.getCpdCveTipoOpera()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveFormaNeg().equals(instance.getCpdCveFormaNeg()))
            equalObjects = false;
        if (equalObjects && !this.getCpdImpSugerido().equals(instance.getCpdImpSugerido()))
            equalObjects = false;
        if (equalObjects && !this.getCpdImpAsignado().equals(instance.getCpdImpAsignado()))
            equalObjects = false;
        if (equalObjects && !this.getCpdImpDisponible().equals(instance.getCpdImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getCpdCveStComprad().equals(instance.getCpdCveStComprad()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Compradi result = new Compradi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpdNumCorte((BigDecimal) objectData.getData("CPD_NUM_CORTE"));
        result.setCpdNumContrato((BigDecimal) objectData.getData("CPD_NUM_CONTRATO"));
        result.setCpdSubContrato((BigDecimal) objectData.getData("CPD_SUB_CONTRATO"));
        result.setCpdCveTipoMerca((BigDecimal) objectData.getData("CPD_CVE_TIPO_MERCA"));
        result.setCpdNumInstrume((BigDecimal) objectData.getData("CPD_NUM_INSTRUME"));
        result.setCpdNumSecEmis((BigDecimal) objectData.getData("CPD_NUM_SEC_EMIS"));
        result.setCpdNumPlazo((BigDecimal) objectData.getData("CPD_NUM_PLAZO"));
        result.setCpdNomPizarra((String) objectData.getData("CPD_NOM_PIZARRA"));
        result.setCpdSerieEmision((String) objectData.getData("CPD_SERIE_EMISION"));
        result.setCpdNumCuponVig((BigDecimal) objectData.getData("CPD_NUM_CUPON_VIG"));
        result.setCpdCveTipoPers((String) objectData.getData("CPD_CVE_TIPO_PERS"));
        result.setCpdCvePersonAdq((String) objectData.getData("CPD_CVE_PERSON_ADQ"));
        result.setCpdNumProducto((BigDecimal) objectData.getData("CPD_NUM_PRODUCTO"));
        result.setCpdCveTipoOpera((String) objectData.getData("CPD_CVE_TIPO_OPERA"));
        result.setCpdCveFormaNeg((String) objectData.getData("CPD_CVE_FORMA_NEG"));
        result.setCpdImpSugerido((BigDecimal) objectData.getData("CPD_IMP_SUGERIDO"));
        result.setCpdImpAsignado((BigDecimal) objectData.getData("CPD_IMP_ASIGNADO"));
        result.setCpdImpDisponible((BigDecimal) objectData.getData("CPD_IMP_DISPONIBLE"));
        result.setCpdCveStComprad((String) objectData.getData("CPD_CVE_ST_COMPRAD"));

        return result;

    }

}
