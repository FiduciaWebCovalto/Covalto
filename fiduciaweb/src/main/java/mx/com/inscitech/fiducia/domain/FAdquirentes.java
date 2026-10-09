package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ADQUIRENTES_PK", columns = { "FADQ_ID_FIDEICOMISO", "FADQ_ID_SUBCUENTA", "FADQ_ID_BIEN", "FADQ_ID_EDIFICIO", "FADQ_ID_DEPTO", "FADQ_ID_VENTA" },
            sequences = { "MANUAL" })
public class FAdquirentes extends DomainObject {

    BigDecimal fadqIdFideicomiso = null;
    BigDecimal fadqIdSubcuenta = null;
    String fadqIdBien = null;
    String fadqIdEdificio = null;
    String fadqIdDepto = null;
    BigDecimal fadqIdVenta = null;
    BigDecimal fadqPeriodo = null;
    String fadqNombreComprador = null;
    BigDecimal fadqValor = null;
    BigDecimal fadqMoneda = null;
    String fadqTipoVenta = null;
    String fadqTipoPlazo = null;
    BigDecimal fadqNumPlazo = null;
    BigDecimal fadqEnganche = null;
    BigDecimal fadqAbono = null;
    BigDecimal fadqSaldo = null;
    BigDecimal fadqPagos = null;
    BigDecimal fadqNotario = null;
    String fadqLocalidad = null;
    String fadqCv = null;
    String fadqContrato = null;
    String fadqFolio = null;
    String fadqRegPub = null;
    String fadqFecAlta = null;
    String fadqFecMod = null;
    String fadqStatus = null;
    String fadqNomComprador = null;
    String fadqNumEscrcom = null;
    String fadqFecEscricom = null;

    public FAdquirentes() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFadqIdFideicomiso(BigDecimal fadqIdFideicomiso) {
        this.fadqIdFideicomiso = fadqIdFideicomiso;
    }

    public BigDecimal getFadqIdFideicomiso() {
        return this.fadqIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFadqIdSubcuenta(BigDecimal fadqIdSubcuenta) {
        this.fadqIdSubcuenta = fadqIdSubcuenta;
    }

    public BigDecimal getFadqIdSubcuenta() {
        return this.fadqIdSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqIdBien(String fadqIdBien) {
        this.fadqIdBien = fadqIdBien;
    }

    public String getFadqIdBien() {
        return this.fadqIdBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqIdEdificio(String fadqIdEdificio) {
        this.fadqIdEdificio = fadqIdEdificio;
    }

    public String getFadqIdEdificio() {
        return this.fadqIdEdificio;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqIdDepto(String fadqIdDepto) {
        this.fadqIdDepto = fadqIdDepto;
    }

    public String getFadqIdDepto() {
        return this.fadqIdDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFadqIdVenta(BigDecimal fadqIdVenta) {
        this.fadqIdVenta = fadqIdVenta;
    }

    public BigDecimal getFadqIdVenta() {
        return this.fadqIdVenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFadqPeriodo(BigDecimal fadqPeriodo) {
        this.fadqPeriodo = fadqPeriodo;
    }

    public BigDecimal getFadqPeriodo() {
        return this.fadqPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqNombreComprador(String fadqNombreComprador) {
        this.fadqNombreComprador = fadqNombreComprador;
    }

    public String getFadqNombreComprador() {
        return this.fadqNombreComprador;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFadqValor(BigDecimal fadqValor) {
        this.fadqValor = fadqValor;
    }

    public BigDecimal getFadqValor() {
        return this.fadqValor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFadqMoneda(BigDecimal fadqMoneda) {
        this.fadqMoneda = fadqMoneda;
    }

    public BigDecimal getFadqMoneda() {
        return this.fadqMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqTipoVenta(String fadqTipoVenta) {
        this.fadqTipoVenta = fadqTipoVenta;
    }

    public String getFadqTipoVenta() {
        return this.fadqTipoVenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqTipoPlazo(String fadqTipoPlazo) {
        this.fadqTipoPlazo = fadqTipoPlazo;
    }

    public String getFadqTipoPlazo() {
        return this.fadqTipoPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFadqNumPlazo(BigDecimal fadqNumPlazo) {
        this.fadqNumPlazo = fadqNumPlazo;
    }

    public BigDecimal getFadqNumPlazo() {
        return this.fadqNumPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFadqEnganche(BigDecimal fadqEnganche) {
        this.fadqEnganche = fadqEnganche;
    }

    public BigDecimal getFadqEnganche() {
        return this.fadqEnganche;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFadqAbono(BigDecimal fadqAbono) {
        this.fadqAbono = fadqAbono;
    }

    public BigDecimal getFadqAbono() {
        return this.fadqAbono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFadqSaldo(BigDecimal fadqSaldo) {
        this.fadqSaldo = fadqSaldo;
    }

    public BigDecimal getFadqSaldo() {
        return this.fadqSaldo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFadqPagos(BigDecimal fadqPagos) {
        this.fadqPagos = fadqPagos;
    }

    public BigDecimal getFadqPagos() {
        return this.fadqPagos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFadqNotario(BigDecimal fadqNotario) {
        this.fadqNotario = fadqNotario;
    }

    public BigDecimal getFadqNotario() {
        return this.fadqNotario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqLocalidad(String fadqLocalidad) {
        this.fadqLocalidad = fadqLocalidad;
    }

    public String getFadqLocalidad() {
        return this.fadqLocalidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqCv(String fadqCv) {
        this.fadqCv = fadqCv;
    }

    public String getFadqCv() {
        return this.fadqCv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqContrato(String fadqContrato) {
        this.fadqContrato = fadqContrato;
    }

    public String getFadqContrato() {
        return this.fadqContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqFolio(String fadqFolio) {
        this.fadqFolio = fadqFolio;
    }

    public String getFadqFolio() {
        return this.fadqFolio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqRegPub(String fadqRegPub) {
        this.fadqRegPub = fadqRegPub;
    }

    public String getFadqRegPub() {
        return this.fadqRegPub;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFadqFecAlta(String fadqFecAlta) {
        this.fadqFecAlta = fadqFecAlta;
    }

    public String getFadqFecAlta() {
        return this.fadqFecAlta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFadqFecMod(String fadqFecMod) {
        this.fadqFecMod = fadqFecMod;
    }

    public String getFadqFecMod() {
        return this.fadqFecMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqStatus(String fadqStatus) {
        this.fadqStatus = fadqStatus;
    }

    public String getFadqStatus() {
        return this.fadqStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqNomComprador(String fadqNomComprador) {
        this.fadqNomComprador = fadqNomComprador;
    }

    public String getFadqNomComprador() {
        return this.fadqNomComprador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFadqNumEscrcom(String fadqNumEscrcom) {
        this.fadqNumEscrcom = fadqNumEscrcom;
    }

    public String getFadqNumEscrcom() {
        return this.fadqNumEscrcom;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFadqFecEscricom(String fadqFecEscricom) {
        this.fadqFecEscricom = fadqFecEscricom;
    }

    public String getFadqFecEscricom() {
        return this.fadqFecEscricom;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ADQUIRENTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFadqIdFideicomiso() != null && this.getFadqIdFideicomiso().longValue() == -999) {
            conditions += " AND FADQ_ID_FIDEICOMISO IS NULL";
        } else if (this.getFadqIdFideicomiso() != null) {
            conditions += " AND FADQ_ID_FIDEICOMISO = ?";
            values.add(this.getFadqIdFideicomiso());
        }

        if (this.getFadqIdSubcuenta() != null && this.getFadqIdSubcuenta().longValue() == -999) {
            conditions += " AND FADQ_ID_SUBCUENTA IS NULL";
        } else if (this.getFadqIdSubcuenta() != null) {
            conditions += " AND FADQ_ID_SUBCUENTA = ?";
            values.add(this.getFadqIdSubcuenta());
        }

        if (this.getFadqIdBien() != null && "null".equals(this.getFadqIdBien())) {
            conditions += " AND FADQ_ID_BIEN IS NULL";
        } else if (this.getFadqIdBien() != null) {
            conditions += " AND FADQ_ID_BIEN = ?";
            values.add(this.getFadqIdBien());
        }

        if (this.getFadqIdEdificio() != null && "null".equals(this.getFadqIdEdificio())) {
            conditions += " AND FADQ_ID_EDIFICIO IS NULL";
        } else if (this.getFadqIdEdificio() != null) {
            conditions += " AND FADQ_ID_EDIFICIO = ?";
            values.add(this.getFadqIdEdificio());
        }

        if (this.getFadqIdDepto() != null && "null".equals(this.getFadqIdDepto())) {
            conditions += " AND FADQ_ID_DEPTO IS NULL";
        } else if (this.getFadqIdDepto() != null) {
            conditions += " AND FADQ_ID_DEPTO = ?";
            values.add(this.getFadqIdDepto());
        }

        if (this.getFadqIdVenta() != null && this.getFadqIdVenta().longValue() == -999) {
            conditions += " AND FADQ_ID_VENTA IS NULL";
        } else if (this.getFadqIdVenta() != null) {
            conditions += " AND FADQ_ID_VENTA = ?";
            values.add(this.getFadqIdVenta());
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
        String sql = "SELECT * FROM F_ADQUIRENTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFadqIdFideicomiso() != null && this.getFadqIdFideicomiso().longValue() == -999) {
            conditions += " AND FADQ_ID_FIDEICOMISO IS NULL";
        } else if (this.getFadqIdFideicomiso() != null) {
            conditions += " AND FADQ_ID_FIDEICOMISO = ?";
            values.add(this.getFadqIdFideicomiso());
        }

        if (this.getFadqIdSubcuenta() != null && this.getFadqIdSubcuenta().longValue() == -999) {
            conditions += " AND FADQ_ID_SUBCUENTA IS NULL";
        } else if (this.getFadqIdSubcuenta() != null) {
            conditions += " AND FADQ_ID_SUBCUENTA = ?";
            values.add(this.getFadqIdSubcuenta());
        }

        if (this.getFadqIdBien() != null && "null".equals(this.getFadqIdBien())) {
            conditions += " AND FADQ_ID_BIEN IS NULL";
        } else if (this.getFadqIdBien() != null) {
            conditions += " AND FADQ_ID_BIEN = ?";
            values.add(this.getFadqIdBien());
        }

        if (this.getFadqIdEdificio() != null && "null".equals(this.getFadqIdEdificio())) {
            conditions += " AND FADQ_ID_EDIFICIO IS NULL";
        } else if (this.getFadqIdEdificio() != null) {
            conditions += " AND FADQ_ID_EDIFICIO = ?";
            values.add(this.getFadqIdEdificio());
        }

        if (this.getFadqIdDepto() != null && "null".equals(this.getFadqIdDepto())) {
            conditions += " AND FADQ_ID_DEPTO IS NULL";
        } else if (this.getFadqIdDepto() != null) {
            conditions += " AND FADQ_ID_DEPTO = ?";
            values.add(this.getFadqIdDepto());
        }

        if (this.getFadqIdVenta() != null && this.getFadqIdVenta().longValue() == -999) {
            conditions += " AND FADQ_ID_VENTA IS NULL";
        } else if (this.getFadqIdVenta() != null) {
            conditions += " AND FADQ_ID_VENTA = ?";
            values.add(this.getFadqIdVenta());
        }

        if (this.getFadqPeriodo() != null && this.getFadqPeriodo().longValue() == -999) {
            conditions += " AND FADQ_PERIODO IS NULL";
        } else if (this.getFadqPeriodo() != null) {
            conditions += " AND FADQ_PERIODO = ?";
            values.add(this.getFadqPeriodo());
        }

        if (this.getFadqNombreComprador() != null && "null".equals(this.getFadqNombreComprador())) {
            conditions += " AND FADQ_NOMBRE_COMPRADOR IS NULL";
        } else if (this.getFadqNombreComprador() != null) {
            conditions += " AND FADQ_NOMBRE_COMPRADOR = ?";
            values.add(this.getFadqNombreComprador());
        }

        if (this.getFadqValor() != null && this.getFadqValor().longValue() == -999) {
            conditions += " AND FADQ_VALOR IS NULL";
        } else if (this.getFadqValor() != null) {
            conditions += " AND FADQ_VALOR = ?";
            values.add(this.getFadqValor());
        }

        if (this.getFadqMoneda() != null && this.getFadqMoneda().longValue() == -999) {
            conditions += " AND FADQ_MONEDA IS NULL";
        } else if (this.getFadqMoneda() != null) {
            conditions += " AND FADQ_MONEDA = ?";
            values.add(this.getFadqMoneda());
        }

        if (this.getFadqTipoVenta() != null && "null".equals(this.getFadqTipoVenta())) {
            conditions += " AND FADQ_TIPO_VENTA IS NULL";
        } else if (this.getFadqTipoVenta() != null) {
            conditions += " AND FADQ_TIPO_VENTA = ?";
            values.add(this.getFadqTipoVenta());
        }

        if (this.getFadqTipoPlazo() != null && "null".equals(this.getFadqTipoPlazo())) {
            conditions += " AND FADQ_TIPO_PLAZO IS NULL";
        } else if (this.getFadqTipoPlazo() != null) {
            conditions += " AND FADQ_TIPO_PLAZO = ?";
            values.add(this.getFadqTipoPlazo());
        }

        if (this.getFadqNumPlazo() != null && this.getFadqNumPlazo().longValue() == -999) {
            conditions += " AND FADQ_NUM_PLAZO IS NULL";
        } else if (this.getFadqNumPlazo() != null) {
            conditions += " AND FADQ_NUM_PLAZO = ?";
            values.add(this.getFadqNumPlazo());
        }

        if (this.getFadqEnganche() != null && this.getFadqEnganche().longValue() == -999) {
            conditions += " AND FADQ_ENGANCHE IS NULL";
        } else if (this.getFadqEnganche() != null) {
            conditions += " AND FADQ_ENGANCHE = ?";
            values.add(this.getFadqEnganche());
        }

        if (this.getFadqAbono() != null && this.getFadqAbono().longValue() == -999) {
            conditions += " AND FADQ_ABONO IS NULL";
        } else if (this.getFadqAbono() != null) {
            conditions += " AND FADQ_ABONO = ?";
            values.add(this.getFadqAbono());
        }

        if (this.getFadqSaldo() != null && this.getFadqSaldo().longValue() == -999) {
            conditions += " AND FADQ_SALDO IS NULL";
        } else if (this.getFadqSaldo() != null) {
            conditions += " AND FADQ_SALDO = ?";
            values.add(this.getFadqSaldo());
        }

        if (this.getFadqPagos() != null && this.getFadqPagos().longValue() == -999) {
            conditions += " AND FADQ_PAGOS IS NULL";
        } else if (this.getFadqPagos() != null) {
            conditions += " AND FADQ_PAGOS = ?";
            values.add(this.getFadqPagos());
        }

        if (this.getFadqNotario() != null && this.getFadqNotario().longValue() == -999) {
            conditions += " AND FADQ_NOTARIO IS NULL";
        } else if (this.getFadqNotario() != null) {
            conditions += " AND FADQ_NOTARIO = ?";
            values.add(this.getFadqNotario());
        }

        if (this.getFadqLocalidad() != null && "null".equals(this.getFadqLocalidad())) {
            conditions += " AND FADQ_LOCALIDAD IS NULL";
        } else if (this.getFadqLocalidad() != null) {
            conditions += " AND FADQ_LOCALIDAD = ?";
            values.add(this.getFadqLocalidad());
        }

        if (this.getFadqCv() != null && "null".equals(this.getFadqCv())) {
            conditions += " AND FADQ_CV IS NULL";
        } else if (this.getFadqCv() != null) {
            conditions += " AND FADQ_CV = ?";
            values.add(this.getFadqCv());
        }

        if (this.getFadqContrato() != null && "null".equals(this.getFadqContrato())) {
            conditions += " AND FADQ_CONTRATO IS NULL";
        } else if (this.getFadqContrato() != null) {
            conditions += " AND FADQ_CONTRATO = ?";
            values.add(this.getFadqContrato());
        }

        if (this.getFadqFolio() != null && "null".equals(this.getFadqFolio())) {
            conditions += " AND FADQ_FOLIO IS NULL";
        } else if (this.getFadqFolio() != null) {
            conditions += " AND FADQ_FOLIO = ?";
            values.add(this.getFadqFolio());
        }

        if (this.getFadqRegPub() != null && "null".equals(this.getFadqRegPub())) {
            conditions += " AND FADQ_REG_PUB IS NULL";
        } else if (this.getFadqRegPub() != null) {
            conditions += " AND FADQ_REG_PUB = ?";
            values.add(this.getFadqRegPub());
        }

        if (this.getFadqFecAlta() != null && "null".equals(this.getFadqFecAlta())) {
            conditions += " AND FADQ_FEC_ALTA IS NULL";
        } else if (this.getFadqFecAlta() != null) {
            conditions += " AND FADQ_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFadqFecAlta());
        }

        if (this.getFadqFecMod() != null && "null".equals(this.getFadqFecMod())) {
            conditions += " AND FADQ_FEC_MOD IS NULL";
        } else if (this.getFadqFecMod() != null) {
            conditions += " AND FADQ_FEC_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFadqFecMod());
        }

        if (this.getFadqStatus() != null && "null".equals(this.getFadqStatus())) {
            conditions += " AND FADQ_STATUS IS NULL";
        } else if (this.getFadqStatus() != null) {
            conditions += " AND FADQ_STATUS = ?";
            values.add(this.getFadqStatus());
        }

        if (this.getFadqNomComprador() != null && "null".equals(this.getFadqNomComprador())) {
            conditions += " AND FADQ_NOM_COMPRADOR IS NULL";
        } else if (this.getFadqNomComprador() != null) {
            conditions += " AND FADQ_NOM_COMPRADOR = ?";
            values.add(this.getFadqNomComprador());
        }

        if (this.getFadqNumEscrcom() != null && "null".equals(this.getFadqNumEscrcom())) {
            conditions += " AND FADQ_NUM_ESCRCOM IS NULL";
        } else if (this.getFadqNumEscrcom() != null) {
            conditions += " AND FADQ_NUM_ESCRCOM = ?";
            values.add(this.getFadqNumEscrcom());
        }

        if (this.getFadqFecEscricom() != null && "null".equals(this.getFadqFecEscricom())) {
            conditions += " AND FADQ_FEC_ESCRICOM IS NULL";
        } else if (this.getFadqFecEscricom() != null) {
            conditions += " AND FADQ_FEC_ESCRICOM = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFadqFecEscricom());
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
        String sql = "UPDATE F_ADQUIRENTES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FADQ_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFadqIdFideicomiso());
        conditions += " AND FADQ_ID_SUBCUENTA = ?";
        pkValues.add(this.getFadqIdSubcuenta());
        conditions += " AND FADQ_ID_BIEN = ?";
        pkValues.add(this.getFadqIdBien());
        conditions += " AND FADQ_ID_EDIFICIO = ?";
        pkValues.add(this.getFadqIdEdificio());
        conditions += " AND FADQ_ID_DEPTO = ?";
        pkValues.add(this.getFadqIdDepto());
        conditions += " AND FADQ_ID_VENTA = ?";
        pkValues.add(this.getFadqIdVenta());
        fields += " FADQ_PERIODO = ?, ";
        values.add(this.getFadqPeriodo());
        fields += " FADQ_NOMBRE_COMPRADOR = ?, ";
        values.add(this.getFadqNombreComprador());
        fields += " FADQ_VALOR = ?, ";
        values.add(this.getFadqValor());
        fields += " FADQ_MONEDA = ?, ";
        values.add(this.getFadqMoneda());
        fields += " FADQ_TIPO_VENTA = ?, ";
        values.add(this.getFadqTipoVenta());
        fields += " FADQ_TIPO_PLAZO = ?, ";
        values.add(this.getFadqTipoPlazo());
        fields += " FADQ_NUM_PLAZO = ?, ";
        values.add(this.getFadqNumPlazo());
        fields += " FADQ_ENGANCHE = ?, ";
        values.add(this.getFadqEnganche());
        fields += " FADQ_ABONO = ?, ";
        values.add(this.getFadqAbono());
        fields += " FADQ_SALDO = ?, ";
        values.add(this.getFadqSaldo());
        fields += " FADQ_PAGOS = ?, ";
        values.add(this.getFadqPagos());
        fields += " FADQ_NOTARIO = ?, ";
        values.add(this.getFadqNotario());
        fields += " FADQ_LOCALIDAD = ?, ";
        values.add(this.getFadqLocalidad());
        fields += " FADQ_CV = ?, ";
        values.add(this.getFadqCv());
        fields += " FADQ_CONTRATO = ?, ";
        values.add(this.getFadqContrato());
        fields += " FADQ_FOLIO = ?, ";
        values.add(this.getFadqFolio());
        fields += " FADQ_REG_PUB = ?, ";
        values.add(this.getFadqRegPub());
        fields += " FADQ_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFadqFecAlta());
        fields += " FADQ_FEC_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFadqFecMod());
        fields += " FADQ_STATUS = ?, ";
        values.add(this.getFadqStatus());
        fields += " FADQ_NOM_COMPRADOR = ?, ";
        values.add(this.getFadqNomComprador());
        fields += " FADQ_NUM_ESCRCOM = ?, ";
        values.add(this.getFadqNumEscrcom());
        fields += " FADQ_FEC_ESCRICOM = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFadqFecEscricom());
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
        String sql = "INSERT INTO F_ADQUIRENTES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FADQ_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFadqIdFideicomiso());

        fields += ", FADQ_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFadqIdSubcuenta());

        fields += ", FADQ_ID_BIEN";
        fieldValues += ", ?";
        values.add(this.getFadqIdBien());

        fields += ", FADQ_ID_EDIFICIO";
        fieldValues += ", ?";
        values.add(this.getFadqIdEdificio());

        fields += ", FADQ_ID_DEPTO";
        fieldValues += ", ?";
        values.add(this.getFadqIdDepto());

        fields += ", FADQ_ID_VENTA";
        fieldValues += ", ?";
        values.add(this.getFadqIdVenta());

        fields += ", FADQ_PERIODO";
        fieldValues += ", ?";
        values.add(this.getFadqPeriodo());

        fields += ", FADQ_NOMBRE_COMPRADOR";
        fieldValues += ", ?";
        values.add(this.getFadqNombreComprador());

        fields += ", FADQ_VALOR";
        fieldValues += ", ?";
        values.add(this.getFadqValor());

        fields += ", FADQ_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFadqMoneda());

        fields += ", FADQ_TIPO_VENTA";
        fieldValues += ", ?";
        values.add(this.getFadqTipoVenta());

        fields += ", FADQ_TIPO_PLAZO";
        fieldValues += ", ?";
        values.add(this.getFadqTipoPlazo());

        fields += ", FADQ_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getFadqNumPlazo());

        fields += ", FADQ_ENGANCHE";
        fieldValues += ", ?";
        values.add(this.getFadqEnganche());

        fields += ", FADQ_ABONO";
        fieldValues += ", ?";
        values.add(this.getFadqAbono());

        fields += ", FADQ_SALDO";
        fieldValues += ", ?";
        values.add(this.getFadqSaldo());

        fields += ", FADQ_PAGOS";
        fieldValues += ", ?";
        values.add(this.getFadqPagos());

        fields += ", FADQ_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getFadqNotario());

        fields += ", FADQ_LOCALIDAD";
        fieldValues += ", ?";
        values.add(this.getFadqLocalidad());

        fields += ", FADQ_CV";
        fieldValues += ", ?";
        values.add(this.getFadqCv());

        fields += ", FADQ_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFadqContrato());

        fields += ", FADQ_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFadqFolio());

        fields += ", FADQ_REG_PUB";
        fieldValues += ", ?";
        values.add(this.getFadqRegPub());

        fields += ", FADQ_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFadqFecAlta());

        fields += ", FADQ_FEC_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFadqFecMod());

        fields += ", FADQ_STATUS";
        fieldValues += ", ?";
        values.add(this.getFadqStatus());

        fields += ", FADQ_NOM_COMPRADOR";
        fieldValues += ", ?";
        values.add(this.getFadqNomComprador());

        fields += ", FADQ_NUM_ESCRCOM";
        fieldValues += ", ?";
        values.add(this.getFadqNumEscrcom());

        fields += ", FADQ_FEC_ESCRICOM";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFadqFecEscricom());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ADQUIRENTES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FADQ_ID_FIDEICOMISO = ?";
        values.add(this.getFadqIdFideicomiso());
        conditions += " AND FADQ_ID_SUBCUENTA = ?";
        values.add(this.getFadqIdSubcuenta());
        conditions += " AND FADQ_ID_BIEN = ?";
        values.add(this.getFadqIdBien());
        conditions += " AND FADQ_ID_EDIFICIO = ?";
        values.add(this.getFadqIdEdificio());
        conditions += " AND FADQ_ID_DEPTO = ?";
        values.add(this.getFadqIdDepto());
        conditions += " AND FADQ_ID_VENTA = ?";
        values.add(this.getFadqIdVenta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAdquirentes instance = (FAdquirentes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFadqIdFideicomiso().equals(instance.getFadqIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFadqIdSubcuenta().equals(instance.getFadqIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFadqIdBien().equals(instance.getFadqIdBien()))
            equalObjects = false;
        if (equalObjects && !this.getFadqIdEdificio().equals(instance.getFadqIdEdificio()))
            equalObjects = false;
        if (equalObjects && !this.getFadqIdDepto().equals(instance.getFadqIdDepto()))
            equalObjects = false;
        if (equalObjects && !this.getFadqIdVenta().equals(instance.getFadqIdVenta()))
            equalObjects = false;
        if (equalObjects && !this.getFadqPeriodo().equals(instance.getFadqPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getFadqNombreComprador().equals(instance.getFadqNombreComprador()))
            equalObjects = false;
        if (equalObjects && !this.getFadqValor().equals(instance.getFadqValor()))
            equalObjects = false;
        if (equalObjects && !this.getFadqMoneda().equals(instance.getFadqMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFadqTipoVenta().equals(instance.getFadqTipoVenta()))
            equalObjects = false;
        if (equalObjects && !this.getFadqTipoPlazo().equals(instance.getFadqTipoPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getFadqNumPlazo().equals(instance.getFadqNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getFadqEnganche().equals(instance.getFadqEnganche()))
            equalObjects = false;
        if (equalObjects && !this.getFadqAbono().equals(instance.getFadqAbono()))
            equalObjects = false;
        if (equalObjects && !this.getFadqSaldo().equals(instance.getFadqSaldo()))
            equalObjects = false;
        if (equalObjects && !this.getFadqPagos().equals(instance.getFadqPagos()))
            equalObjects = false;
        if (equalObjects && !this.getFadqNotario().equals(instance.getFadqNotario()))
            equalObjects = false;
        if (equalObjects && !this.getFadqLocalidad().equals(instance.getFadqLocalidad()))
            equalObjects = false;
        if (equalObjects && !this.getFadqCv().equals(instance.getFadqCv()))
            equalObjects = false;
        if (equalObjects && !this.getFadqContrato().equals(instance.getFadqContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFadqFolio().equals(instance.getFadqFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFadqRegPub().equals(instance.getFadqRegPub()))
            equalObjects = false;
        if (equalObjects && !this.getFadqFecAlta().equals(instance.getFadqFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getFadqFecMod().equals(instance.getFadqFecMod()))
            equalObjects = false;
        if (equalObjects && !this.getFadqStatus().equals(instance.getFadqStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFadqNomComprador().equals(instance.getFadqNomComprador()))
            equalObjects = false;
        if (equalObjects && !this.getFadqNumEscrcom().equals(instance.getFadqNumEscrcom()))
            equalObjects = false;
        if (equalObjects && !this.getFadqFecEscricom().equals(instance.getFadqFecEscricom()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAdquirentes result = new FAdquirentes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFadqIdFideicomiso((BigDecimal) objectData.getData("FADQ_ID_FIDEICOMISO"));
        result.setFadqIdSubcuenta((BigDecimal) objectData.getData("FADQ_ID_SUBCUENTA"));
        result.setFadqIdBien((String) objectData.getData("FADQ_ID_BIEN"));
        result.setFadqIdEdificio((String) objectData.getData("FADQ_ID_EDIFICIO"));
        result.setFadqIdDepto((String) objectData.getData("FADQ_ID_DEPTO"));
        result.setFadqIdVenta((BigDecimal) objectData.getData("FADQ_ID_VENTA"));
        result.setFadqPeriodo((BigDecimal) objectData.getData("FADQ_PERIODO"));
        result.setFadqNombreComprador((String) objectData.getData("FADQ_NOMBRE_COMPRADOR"));
        result.setFadqValor((BigDecimal) objectData.getData("FADQ_VALOR"));
        result.setFadqMoneda((BigDecimal) objectData.getData("FADQ_MONEDA"));
        result.setFadqTipoVenta((String) objectData.getData("FADQ_TIPO_VENTA"));
        result.setFadqTipoPlazo((String) objectData.getData("FADQ_TIPO_PLAZO"));
        result.setFadqNumPlazo((BigDecimal) objectData.getData("FADQ_NUM_PLAZO"));
        result.setFadqEnganche((BigDecimal) objectData.getData("FADQ_ENGANCHE"));
        result.setFadqAbono((BigDecimal) objectData.getData("FADQ_ABONO"));
        result.setFadqSaldo((BigDecimal) objectData.getData("FADQ_SALDO"));
        result.setFadqPagos((BigDecimal) objectData.getData("FADQ_PAGOS"));
        result.setFadqNotario((BigDecimal) objectData.getData("FADQ_NOTARIO"));
        result.setFadqLocalidad((String) objectData.getData("FADQ_LOCALIDAD"));
        result.setFadqCv((String) objectData.getData("FADQ_CV"));
        result.setFadqContrato((String) objectData.getData("FADQ_CONTRATO"));
        result.setFadqFolio((String) objectData.getData("FADQ_FOLIO"));
        result.setFadqRegPub((String) objectData.getData("FADQ_REG_PUB"));
        result.setFadqFecAlta((String) objectData.getData("FADQ_FEC_ALTA"));
        result.setFadqFecMod((String) objectData.getData("FADQ_FEC_MOD"));
        result.setFadqStatus((String) objectData.getData("FADQ_STATUS"));
        result.setFadqNomComprador((String) objectData.getData("FADQ_NOM_COMPRADOR"));
        result.setFadqNumEscrcom((String) objectData.getData("FADQ_NUM_ESCRCOM"));
        result.setFadqFecEscricom((String) objectData.getData("FADQ_FEC_ESCRICOM"));

        return result;

    }

}
