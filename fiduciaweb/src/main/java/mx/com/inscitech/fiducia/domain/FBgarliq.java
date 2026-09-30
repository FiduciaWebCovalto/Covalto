package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_BGARLIQ_PK",
            columns = { "GLBE_ID_FIDEICOMISO", "GLBE_ID_CREDITO", "GLBE_ID_TIPO_CREDITO", "GLBE_ID_DISPOSICION", "GLBE_ID_SECUENCIAL", "GLBE_ID_BENEFICIARIO" },
            sequences = { "MANUAL" })
public class FBgarliq extends DomainObject {

    BigDecimal glbeIdFideicomiso = null;
    String glbeIdCredito = null;
    String glbeIdTipoCredito = null;
    BigDecimal glbeIdDisposicion = null;
    BigDecimal glbeIdSecuencial = null;
    String glbeIdBeneficiario = null;
    String glbeNombreBen = null;
    BigDecimal glbeImpCredito = null;
    BigDecimal glbePjeGarantia = null;
    BigDecimal glbeImpGarliq = null;
    BigDecimal glbeImpGarliqLib = null;
    BigDecimal glbeImpIntereses = null;
    BigDecimal glbeFolioConstancia = null;
    BigDecimal glbeFolioLiberacion = null;
    String glbeTipoMovto = null;
    BigDecimal glbeImpMovtoConst = null;
    BigDecimal glbeImpMovtoLibera = null;
    String glbeCveStatus = null;
    String glbeRfcCurp = null;

    public FBgarliq() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlbeIdFideicomiso(BigDecimal glbeIdFideicomiso) {
        this.glbeIdFideicomiso = glbeIdFideicomiso;
    }

    public BigDecimal getGlbeIdFideicomiso() {
        return this.glbeIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlbeIdCredito(String glbeIdCredito) {
        this.glbeIdCredito = glbeIdCredito;
    }

    public String getGlbeIdCredito() {
        return this.glbeIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlbeIdTipoCredito(String glbeIdTipoCredito) {
        this.glbeIdTipoCredito = glbeIdTipoCredito;
    }

    public String getGlbeIdTipoCredito() {
        return this.glbeIdTipoCredito;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlbeIdDisposicion(BigDecimal glbeIdDisposicion) {
        this.glbeIdDisposicion = glbeIdDisposicion;
    }

    public BigDecimal getGlbeIdDisposicion() {
        return this.glbeIdDisposicion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlbeIdSecuencial(BigDecimal glbeIdSecuencial) {
        this.glbeIdSecuencial = glbeIdSecuencial;
    }

    public BigDecimal getGlbeIdSecuencial() {
        return this.glbeIdSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlbeIdBeneficiario(String glbeIdBeneficiario) {
        this.glbeIdBeneficiario = glbeIdBeneficiario;
    }

    public String getGlbeIdBeneficiario() {
        return this.glbeIdBeneficiario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlbeNombreBen(String glbeNombreBen) {
        this.glbeNombreBen = glbeNombreBen;
    }

    public String getGlbeNombreBen() {
        return this.glbeNombreBen;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlbeImpCredito(BigDecimal glbeImpCredito) {
        this.glbeImpCredito = glbeImpCredito;
    }

    public BigDecimal getGlbeImpCredito() {
        return this.glbeImpCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 4, javaClass = BigDecimal.class)
    public void setGlbePjeGarantia(BigDecimal glbePjeGarantia) {
        this.glbePjeGarantia = glbePjeGarantia;
    }

    public BigDecimal getGlbePjeGarantia() {
        return this.glbePjeGarantia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlbeImpGarliq(BigDecimal glbeImpGarliq) {
        this.glbeImpGarliq = glbeImpGarliq;
    }

    public BigDecimal getGlbeImpGarliq() {
        return this.glbeImpGarliq;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlbeImpGarliqLib(BigDecimal glbeImpGarliqLib) {
        this.glbeImpGarliqLib = glbeImpGarliqLib;
    }

    public BigDecimal getGlbeImpGarliqLib() {
        return this.glbeImpGarliqLib;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlbeImpIntereses(BigDecimal glbeImpIntereses) {
        this.glbeImpIntereses = glbeImpIntereses;
    }

    public BigDecimal getGlbeImpIntereses() {
        return this.glbeImpIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlbeFolioConstancia(BigDecimal glbeFolioConstancia) {
        this.glbeFolioConstancia = glbeFolioConstancia;
    }

    public BigDecimal getGlbeFolioConstancia() {
        return this.glbeFolioConstancia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlbeFolioLiberacion(BigDecimal glbeFolioLiberacion) {
        this.glbeFolioLiberacion = glbeFolioLiberacion;
    }

    public BigDecimal getGlbeFolioLiberacion() {
        return this.glbeFolioLiberacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlbeTipoMovto(String glbeTipoMovto) {
        this.glbeTipoMovto = glbeTipoMovto;
    }

    public String getGlbeTipoMovto() {
        return this.glbeTipoMovto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlbeImpMovtoConst(BigDecimal glbeImpMovtoConst) {
        this.glbeImpMovtoConst = glbeImpMovtoConst;
    }

    public BigDecimal getGlbeImpMovtoConst() {
        return this.glbeImpMovtoConst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlbeImpMovtoLibera(BigDecimal glbeImpMovtoLibera) {
        this.glbeImpMovtoLibera = glbeImpMovtoLibera;
    }

    public BigDecimal getGlbeImpMovtoLibera() {
        return this.glbeImpMovtoLibera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlbeCveStatus(String glbeCveStatus) {
        this.glbeCveStatus = glbeCveStatus;
    }

    public String getGlbeCveStatus() {
        return this.glbeCveStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlbeRfcCurp(String glbeRfcCurp) {
        this.glbeRfcCurp = glbeRfcCurp;
    }

    public String getGlbeRfcCurp() {
        return this.glbeRfcCurp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_BGARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGlbeIdFideicomiso() != null && this.getGlbeIdFideicomiso().longValue() == -999) {
            conditions += " AND GLBE_ID_FIDEICOMISO IS NULL";
        } else if (this.getGlbeIdFideicomiso() != null) {
            conditions += " AND GLBE_ID_FIDEICOMISO = ?";
            values.add(this.getGlbeIdFideicomiso());
        }

        if (this.getGlbeIdCredito() != null && "null".equals(this.getGlbeIdCredito())) {
            conditions += " AND GLBE_ID_CREDITO IS NULL";
        } else if (this.getGlbeIdCredito() != null) {
            conditions += " AND GLBE_ID_CREDITO = ?";
            values.add(this.getGlbeIdCredito());
        }

        if (this.getGlbeIdTipoCredito() != null && "null".equals(this.getGlbeIdTipoCredito())) {
            conditions += " AND GLBE_ID_TIPO_CREDITO IS NULL";
        } else if (this.getGlbeIdTipoCredito() != null) {
            conditions += " AND GLBE_ID_TIPO_CREDITO = ?";
            values.add(this.getGlbeIdTipoCredito());
        }

        if (this.getGlbeIdDisposicion() != null && this.getGlbeIdDisposicion().longValue() == -999) {
            conditions += " AND GLBE_ID_DISPOSICION IS NULL";
        } else if (this.getGlbeIdDisposicion() != null) {
            conditions += " AND GLBE_ID_DISPOSICION = ?";
            values.add(this.getGlbeIdDisposicion());
        }

        if (this.getGlbeIdSecuencial() != null && this.getGlbeIdSecuencial().longValue() == -999) {
            conditions += " AND GLBE_ID_SECUENCIAL IS NULL";
        } else if (this.getGlbeIdSecuencial() != null) {
            conditions += " AND GLBE_ID_SECUENCIAL = ?";
            values.add(this.getGlbeIdSecuencial());
        }

        if (this.getGlbeIdBeneficiario() != null && "null".equals(this.getGlbeIdBeneficiario())) {
            conditions += " AND GLBE_ID_BENEFICIARIO IS NULL";
        } else if (this.getGlbeIdBeneficiario() != null) {
            conditions += " AND GLBE_ID_BENEFICIARIO = ?";
            values.add(this.getGlbeIdBeneficiario());
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
        String sql = "SELECT * FROM F_BGARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGlbeIdFideicomiso() != null && this.getGlbeIdFideicomiso().longValue() == -999) {
            conditions += " AND GLBE_ID_FIDEICOMISO IS NULL";
        } else if (this.getGlbeIdFideicomiso() != null) {
            conditions += " AND GLBE_ID_FIDEICOMISO = ?";
            values.add(this.getGlbeIdFideicomiso());
        }

        if (this.getGlbeIdCredito() != null && "null".equals(this.getGlbeIdCredito())) {
            conditions += " AND GLBE_ID_CREDITO IS NULL";
        } else if (this.getGlbeIdCredito() != null) {
            conditions += " AND GLBE_ID_CREDITO = ?";
            values.add(this.getGlbeIdCredito());
        }

        if (this.getGlbeIdTipoCredito() != null && "null".equals(this.getGlbeIdTipoCredito())) {
            conditions += " AND GLBE_ID_TIPO_CREDITO IS NULL";
        } else if (this.getGlbeIdTipoCredito() != null) {
            conditions += " AND GLBE_ID_TIPO_CREDITO = ?";
            values.add(this.getGlbeIdTipoCredito());
        }

        if (this.getGlbeIdDisposicion() != null && this.getGlbeIdDisposicion().longValue() == -999) {
            conditions += " AND GLBE_ID_DISPOSICION IS NULL";
        } else if (this.getGlbeIdDisposicion() != null) {
            conditions += " AND GLBE_ID_DISPOSICION = ?";
            values.add(this.getGlbeIdDisposicion());
        }

        if (this.getGlbeIdSecuencial() != null && this.getGlbeIdSecuencial().longValue() == -999) {
            conditions += " AND GLBE_ID_SECUENCIAL IS NULL";
        } else if (this.getGlbeIdSecuencial() != null) {
            conditions += " AND GLBE_ID_SECUENCIAL = ?";
            values.add(this.getGlbeIdSecuencial());
        }

        if (this.getGlbeIdBeneficiario() != null && "null".equals(this.getGlbeIdBeneficiario())) {
            conditions += " AND GLBE_ID_BENEFICIARIO IS NULL";
        } else if (this.getGlbeIdBeneficiario() != null) {
            conditions += " AND GLBE_ID_BENEFICIARIO = ?";
            values.add(this.getGlbeIdBeneficiario());
        }

        if (this.getGlbeNombreBen() != null && "null".equals(this.getGlbeNombreBen())) {
            conditions += " AND GLBE_NOMBRE_BEN IS NULL";
        } else if (this.getGlbeNombreBen() != null) {
            conditions += " AND GLBE_NOMBRE_BEN = ?";
            values.add(this.getGlbeNombreBen());
        }

        if (this.getGlbeImpCredito() != null && this.getGlbeImpCredito().longValue() == -999) {
            conditions += " AND GLBE_IMP_CREDITO IS NULL";
        } else if (this.getGlbeImpCredito() != null) {
            conditions += " AND GLBE_IMP_CREDITO = ?";
            values.add(this.getGlbeImpCredito());
        }

        if (this.getGlbePjeGarantia() != null && this.getGlbePjeGarantia().longValue() == -999) {
            conditions += " AND GLBE_PJE_GARANTIA IS NULL";
        } else if (this.getGlbePjeGarantia() != null) {
            conditions += " AND GLBE_PJE_GARANTIA = ?";
            values.add(this.getGlbePjeGarantia());
        }

        if (this.getGlbeImpGarliq() != null && this.getGlbeImpGarliq().longValue() == -999) {
            conditions += " AND GLBE_IMP_GARLIQ IS NULL";
        } else if (this.getGlbeImpGarliq() != null) {
            conditions += " AND GLBE_IMP_GARLIQ = ?";
            values.add(this.getGlbeImpGarliq());
        }

        if (this.getGlbeImpGarliqLib() != null && this.getGlbeImpGarliqLib().longValue() == -999) {
            conditions += " AND GLBE_IMP_GARLIQ_LIB IS NULL";
        } else if (this.getGlbeImpGarliqLib() != null) {
            conditions += " AND GLBE_IMP_GARLIQ_LIB = ?";
            values.add(this.getGlbeImpGarliqLib());
        }

        if (this.getGlbeImpIntereses() != null && this.getGlbeImpIntereses().longValue() == -999) {
            conditions += " AND GLBE_IMP_INTERESES IS NULL";
        } else if (this.getGlbeImpIntereses() != null) {
            conditions += " AND GLBE_IMP_INTERESES = ?";
            values.add(this.getGlbeImpIntereses());
        }

        if (this.getGlbeFolioConstancia() != null && this.getGlbeFolioConstancia().longValue() == -999) {
            conditions += " AND GLBE_FOLIO_CONSTANCIA IS NULL";
        } else if (this.getGlbeFolioConstancia() != null) {
            conditions += " AND GLBE_FOLIO_CONSTANCIA = ?";
            values.add(this.getGlbeFolioConstancia());
        }

        if (this.getGlbeFolioLiberacion() != null && this.getGlbeFolioLiberacion().longValue() == -999) {
            conditions += " AND GLBE_FOLIO_LIBERACION IS NULL";
        } else if (this.getGlbeFolioLiberacion() != null) {
            conditions += " AND GLBE_FOLIO_LIBERACION = ?";
            values.add(this.getGlbeFolioLiberacion());
        }

        if (this.getGlbeTipoMovto() != null && "null".equals(this.getGlbeTipoMovto())) {
            conditions += " AND GLBE_TIPO_MOVTO IS NULL";
        } else if (this.getGlbeTipoMovto() != null) {
            conditions += " AND GLBE_TIPO_MOVTO = ?";
            values.add(this.getGlbeTipoMovto());
        }

        if (this.getGlbeImpMovtoConst() != null && this.getGlbeImpMovtoConst().longValue() == -999) {
            conditions += " AND GLBE_IMP_MOVTO_CONST IS NULL";
        } else if (this.getGlbeImpMovtoConst() != null) {
            conditions += " AND GLBE_IMP_MOVTO_CONST = ?";
            values.add(this.getGlbeImpMovtoConst());
        }

        if (this.getGlbeImpMovtoLibera() != null && this.getGlbeImpMovtoLibera().longValue() == -999) {
            conditions += " AND GLBE_IMP_MOVTO_LIBERA IS NULL";
        } else if (this.getGlbeImpMovtoLibera() != null) {
            conditions += " AND GLBE_IMP_MOVTO_LIBERA = ?";
            values.add(this.getGlbeImpMovtoLibera());
        }

        if (this.getGlbeCveStatus() != null && "null".equals(this.getGlbeCveStatus())) {
            conditions += " AND GLBE_CVE_STATUS IS NULL";
        } else if (this.getGlbeCveStatus() != null) {
            conditions += " AND GLBE_CVE_STATUS = ?";
            values.add(this.getGlbeCveStatus());
        }

        if (this.getGlbeRfcCurp() != null && "null".equals(this.getGlbeRfcCurp())) {
            conditions += " AND GLBE_RFC_CURP IS NULL";
        } else if (this.getGlbeRfcCurp() != null) {
            conditions += " AND GLBE_RFC_CURP = ?";
            values.add(this.getGlbeRfcCurp());
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
        String sql = "UPDATE F_BGARLIQ SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GLBE_ID_FIDEICOMISO = ?";
        pkValues.add(this.getGlbeIdFideicomiso());
        conditions += " AND GLBE_ID_CREDITO = ?";
        pkValues.add(this.getGlbeIdCredito());
        conditions += " AND GLBE_ID_TIPO_CREDITO = ?";
        pkValues.add(this.getGlbeIdTipoCredito());
        conditions += " AND GLBE_ID_DISPOSICION = ?";
        pkValues.add(this.getGlbeIdDisposicion());
        conditions += " AND GLBE_ID_SECUENCIAL = ?";
        pkValues.add(this.getGlbeIdSecuencial());
        conditions += " AND GLBE_ID_BENEFICIARIO = ?";
        pkValues.add(this.getGlbeIdBeneficiario());
        fields += " GLBE_NOMBRE_BEN = ?, ";
        values.add(this.getGlbeNombreBen());
        fields += " GLBE_IMP_CREDITO = ?, ";
        values.add(this.getGlbeImpCredito());
        fields += " GLBE_PJE_GARANTIA = ?, ";
        values.add(this.getGlbePjeGarantia());
        fields += " GLBE_IMP_GARLIQ = ?, ";
        values.add(this.getGlbeImpGarliq());
        fields += " GLBE_IMP_GARLIQ_LIB = ?, ";
        values.add(this.getGlbeImpGarliqLib());
        fields += " GLBE_IMP_INTERESES = ?, ";
        values.add(this.getGlbeImpIntereses());
        fields += " GLBE_FOLIO_CONSTANCIA = ?, ";
        values.add(this.getGlbeFolioConstancia());
        fields += " GLBE_FOLIO_LIBERACION = ?, ";
        values.add(this.getGlbeFolioLiberacion());
        fields += " GLBE_TIPO_MOVTO = ?, ";
        values.add(this.getGlbeTipoMovto());
        fields += " GLBE_IMP_MOVTO_CONST = ?, ";
        values.add(this.getGlbeImpMovtoConst());
        fields += " GLBE_IMP_MOVTO_LIBERA = ?, ";
        values.add(this.getGlbeImpMovtoLibera());
        fields += " GLBE_CVE_STATUS = ?, ";
        values.add(this.getGlbeCveStatus());
        fields += " GLBE_RFC_CURP = ?, ";
        values.add(this.getGlbeRfcCurp());
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
        String sql = "INSERT INTO F_BGARLIQ ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GLBE_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getGlbeIdFideicomiso());

        fields += ", GLBE_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGlbeIdCredito());

        fields += ", GLBE_ID_TIPO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGlbeIdTipoCredito());

        fields += ", GLBE_ID_DISPOSICION";
        fieldValues += ", ?";
        values.add(this.getGlbeIdDisposicion());

        fields += ", GLBE_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getGlbeIdSecuencial());

        fields += ", GLBE_ID_BENEFICIARIO";
        fieldValues += ", ?";
        values.add(this.getGlbeIdBeneficiario());

        fields += ", GLBE_NOMBRE_BEN";
        fieldValues += ", ?";
        values.add(this.getGlbeNombreBen());

        fields += ", GLBE_IMP_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGlbeImpCredito());

        fields += ", GLBE_PJE_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getGlbePjeGarantia());

        fields += ", GLBE_IMP_GARLIQ";
        fieldValues += ", ?";
        values.add(this.getGlbeImpGarliq());

        fields += ", GLBE_IMP_GARLIQ_LIB";
        fieldValues += ", ?";
        values.add(this.getGlbeImpGarliqLib());

        fields += ", GLBE_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getGlbeImpIntereses());

        fields += ", GLBE_FOLIO_CONSTANCIA";
        fieldValues += ", ?";
        values.add(this.getGlbeFolioConstancia());

        fields += ", GLBE_FOLIO_LIBERACION";
        fieldValues += ", ?";
        values.add(this.getGlbeFolioLiberacion());

        fields += ", GLBE_TIPO_MOVTO";
        fieldValues += ", ?";
        values.add(this.getGlbeTipoMovto());

        fields += ", GLBE_IMP_MOVTO_CONST";
        fieldValues += ", ?";
        values.add(this.getGlbeImpMovtoConst());

        fields += ", GLBE_IMP_MOVTO_LIBERA";
        fieldValues += ", ?";
        values.add(this.getGlbeImpMovtoLibera());

        fields += ", GLBE_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getGlbeCveStatus());

        fields += ", GLBE_RFC_CURP";
        fieldValues += ", ?";
        values.add(this.getGlbeRfcCurp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_BGARLIQ WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GLBE_ID_FIDEICOMISO = ?";
        values.add(this.getGlbeIdFideicomiso());
        conditions += " AND GLBE_ID_CREDITO = ?";
        values.add(this.getGlbeIdCredito());
        conditions += " AND GLBE_ID_TIPO_CREDITO = ?";
        values.add(this.getGlbeIdTipoCredito());
        conditions += " AND GLBE_ID_DISPOSICION = ?";
        values.add(this.getGlbeIdDisposicion());
        conditions += " AND GLBE_ID_SECUENCIAL = ?";
        values.add(this.getGlbeIdSecuencial());
        conditions += " AND GLBE_ID_BENEFICIARIO = ?";
        values.add(this.getGlbeIdBeneficiario());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FBgarliq instance = (FBgarliq) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGlbeIdFideicomiso().equals(instance.getGlbeIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeIdCredito().equals(instance.getGlbeIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeIdTipoCredito().equals(instance.getGlbeIdTipoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeIdDisposicion().equals(instance.getGlbeIdDisposicion()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeIdSecuencial().equals(instance.getGlbeIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeIdBeneficiario().equals(instance.getGlbeIdBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeNombreBen().equals(instance.getGlbeNombreBen()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeImpCredito().equals(instance.getGlbeImpCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGlbePjeGarantia().equals(instance.getGlbePjeGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeImpGarliq().equals(instance.getGlbeImpGarliq()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeImpGarliqLib().equals(instance.getGlbeImpGarliqLib()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeImpIntereses().equals(instance.getGlbeImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeFolioConstancia().equals(instance.getGlbeFolioConstancia()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeFolioLiberacion().equals(instance.getGlbeFolioLiberacion()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeTipoMovto().equals(instance.getGlbeTipoMovto()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeImpMovtoConst().equals(instance.getGlbeImpMovtoConst()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeImpMovtoLibera().equals(instance.getGlbeImpMovtoLibera()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeCveStatus().equals(instance.getGlbeCveStatus()))
            equalObjects = false;
        if (equalObjects && !this.getGlbeRfcCurp().equals(instance.getGlbeRfcCurp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FBgarliq result = new FBgarliq();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGlbeIdFideicomiso((BigDecimal) objectData.getData("GLBE_ID_FIDEICOMISO"));
        result.setGlbeIdCredito((String) objectData.getData("GLBE_ID_CREDITO"));
        result.setGlbeIdTipoCredito((String) objectData.getData("GLBE_ID_TIPO_CREDITO"));
        result.setGlbeIdDisposicion((BigDecimal) objectData.getData("GLBE_ID_DISPOSICION"));
        result.setGlbeIdSecuencial((BigDecimal) objectData.getData("GLBE_ID_SECUENCIAL"));
        result.setGlbeIdBeneficiario((String) objectData.getData("GLBE_ID_BENEFICIARIO"));
        result.setGlbeNombreBen((String) objectData.getData("GLBE_NOMBRE_BEN"));
        result.setGlbeImpCredito((BigDecimal) objectData.getData("GLBE_IMP_CREDITO"));
        result.setGlbePjeGarantia((BigDecimal) objectData.getData("GLBE_PJE_GARANTIA"));
        result.setGlbeImpGarliq((BigDecimal) objectData.getData("GLBE_IMP_GARLIQ"));
        result.setGlbeImpGarliqLib((BigDecimal) objectData.getData("GLBE_IMP_GARLIQ_LIB"));
        result.setGlbeImpIntereses((BigDecimal) objectData.getData("GLBE_IMP_INTERESES"));
        result.setGlbeFolioConstancia((BigDecimal) objectData.getData("GLBE_FOLIO_CONSTANCIA"));
        result.setGlbeFolioLiberacion((BigDecimal) objectData.getData("GLBE_FOLIO_LIBERACION"));
        result.setGlbeTipoMovto((String) objectData.getData("GLBE_TIPO_MOVTO"));
        result.setGlbeImpMovtoConst((BigDecimal) objectData.getData("GLBE_IMP_MOVTO_CONST"));
        result.setGlbeImpMovtoLibera((BigDecimal) objectData.getData("GLBE_IMP_MOVTO_LIBERA"));
        result.setGlbeCveStatus((String) objectData.getData("GLBE_CVE_STATUS"));
        result.setGlbeRfcCurp((String) objectData.getData("GLBE_RFC_CURP"));

        return result;

    }

}
