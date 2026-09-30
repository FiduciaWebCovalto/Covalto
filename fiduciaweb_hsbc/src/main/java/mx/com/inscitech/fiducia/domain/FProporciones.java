package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PROPORCIONES_PK", columns = { "FPRO_ID_FIDEICOMISO", "FPRO_ID_CREDITO", "FPRO_ID_CTO_INVER" }, sequences = { "MANUAL" })
public class FProporciones extends DomainObject {

    BigDecimal fproIdFideicomiso = null;
    String fproIdCredito = null;
    BigDecimal fproIdCtoInver = null;
    String fproTipoFondo = null;
    String fproFormula = null;
    BigDecimal fproSaldoObjetivo = null;
    BigDecimal fproSaldo = null;
    BigDecimal fproPorcentaje = null;
    String fproConcepto = null;
    String fproPeriodicidad = null;
    BigDecimal fproReceptor = null;
    BigDecimal fproPagador = null;
    String fproTexComentario = null;
    String fcreFecReservaTras = null;
    BigDecimal fcreImpReservaTras = null;
    String fcreFecHono = null;
    BigDecimal fcrePagaHono = null;
    BigDecimal fcrePagaCredito = null;
    String fcreCuentaClabe = null;
    String fproStPropor = null;
    String fproCuentaClabe = null;

    public FProporciones() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFproIdFideicomiso(BigDecimal fproIdFideicomiso) {
        this.fproIdFideicomiso = fproIdFideicomiso;
    }

    public BigDecimal getFproIdFideicomiso() {
        return this.fproIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFproIdCredito(String fproIdCredito) {
        this.fproIdCredito = fproIdCredito;
    }

    public String getFproIdCredito() {
        return this.fproIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFproIdCtoInver(BigDecimal fproIdCtoInver) {
        this.fproIdCtoInver = fproIdCtoInver;
    }

    public BigDecimal getFproIdCtoInver() {
        return this.fproIdCtoInver;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFproTipoFondo(String fproTipoFondo) {
        this.fproTipoFondo = fproTipoFondo;
    }

    public String getFproTipoFondo() {
        return this.fproTipoFondo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFproFormula(String fproFormula) {
        this.fproFormula = fproFormula;
    }

    public String getFproFormula() {
        return this.fproFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFproSaldoObjetivo(BigDecimal fproSaldoObjetivo) {
        this.fproSaldoObjetivo = fproSaldoObjetivo;
    }

    public BigDecimal getFproSaldoObjetivo() {
        return this.fproSaldoObjetivo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFproSaldo(BigDecimal fproSaldo) {
        this.fproSaldo = fproSaldo;
    }

    public BigDecimal getFproSaldo() {
        return this.fproSaldo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 8, javaClass = BigDecimal.class)
    public void setFproPorcentaje(BigDecimal fproPorcentaje) {
        this.fproPorcentaje = fproPorcentaje;
    }

    public BigDecimal getFproPorcentaje() {
        return this.fproPorcentaje;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFproConcepto(String fproConcepto) {
        this.fproConcepto = fproConcepto;
    }

    public String getFproConcepto() {
        return this.fproConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFproPeriodicidad(String fproPeriodicidad) {
        this.fproPeriodicidad = fproPeriodicidad;
    }

    public String getFproPeriodicidad() {
        return this.fproPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFproReceptor(BigDecimal fproReceptor) {
        this.fproReceptor = fproReceptor;
    }

    public BigDecimal getFproReceptor() {
        return this.fproReceptor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFproPagador(BigDecimal fproPagador) {
        this.fproPagador = fproPagador;
    }

    public BigDecimal getFproPagador() {
        return this.fproPagador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFproTexComentario(String fproTexComentario) {
        this.fproTexComentario = fproTexComentario;
    }

    public String getFproTexComentario() {
        return this.fproTexComentario;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcreFecReservaTras(String fcreFecReservaTras) {
        this.fcreFecReservaTras = fcreFecReservaTras;
    }

    public String getFcreFecReservaTras() {
        return this.fcreFecReservaTras;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpReservaTras(BigDecimal fcreImpReservaTras) {
        this.fcreImpReservaTras = fcreImpReservaTras;
    }

    public BigDecimal getFcreImpReservaTras() {
        return this.fcreImpReservaTras;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcreFecHono(String fcreFecHono) {
        this.fcreFecHono = fcreFecHono;
    }

    public String getFcreFecHono() {
        return this.fcreFecHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcrePagaHono(BigDecimal fcrePagaHono) {
        this.fcrePagaHono = fcrePagaHono;
    }

    public BigDecimal getFcrePagaHono() {
        return this.fcrePagaHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcrePagaCredito(BigDecimal fcrePagaCredito) {
        this.fcrePagaCredito = fcrePagaCredito;
    }

    public BigDecimal getFcrePagaCredito() {
        return this.fcrePagaCredito;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreCuentaClabe(String fcreCuentaClabe) {
        this.fcreCuentaClabe = fcreCuentaClabe;
    }

    public String getFcreCuentaClabe() {
        return this.fcreCuentaClabe;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFproStPropor(String fproStPropor) {
        this.fproStPropor = fproStPropor;
    }

    public String getFproStPropor() {
        return this.fproStPropor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFproCuentaClabe(String fproCuentaClabe) {
        this.fproCuentaClabe = fproCuentaClabe;
    }

    public String getFproCuentaClabe() {
        return this.fproCuentaClabe;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PROPORCIONES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFproIdFideicomiso() != null && this.getFproIdFideicomiso().longValue() == -999) {
            conditions += " AND FPRO_ID_FIDEICOMISO IS NULL";
        } else if (this.getFproIdFideicomiso() != null) {
            conditions += " AND FPRO_ID_FIDEICOMISO = ?";
            values.add(this.getFproIdFideicomiso());
        }

        if (this.getFproIdCredito() != null && "null".equals(this.getFproIdCredito())) {
            conditions += " AND FPRO_ID_CREDITO IS NULL";
        } else if (this.getFproIdCredito() != null) {
            conditions += " AND FPRO_ID_CREDITO = ?";
            values.add(this.getFproIdCredito());
        }

        if (this.getFproIdCtoInver() != null && this.getFproIdCtoInver().longValue() == -999) {
            conditions += " AND FPRO_ID_CTO_INVER IS NULL";
        } else if (this.getFproIdCtoInver() != null) {
            conditions += " AND FPRO_ID_CTO_INVER = ?";
            values.add(this.getFproIdCtoInver());
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
        String sql = "SELECT * FROM F_PROPORCIONES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFproIdFideicomiso() != null && this.getFproIdFideicomiso().longValue() == -999) {
            conditions += " AND FPRO_ID_FIDEICOMISO IS NULL";
        } else if (this.getFproIdFideicomiso() != null) {
            conditions += " AND FPRO_ID_FIDEICOMISO = ?";
            values.add(this.getFproIdFideicomiso());
        }

        if (this.getFproIdCredito() != null && "null".equals(this.getFproIdCredito())) {
            conditions += " AND FPRO_ID_CREDITO IS NULL";
        } else if (this.getFproIdCredito() != null) {
            conditions += " AND FPRO_ID_CREDITO = ?";
            values.add(this.getFproIdCredito());
        }

        if (this.getFproIdCtoInver() != null && this.getFproIdCtoInver().longValue() == -999) {
            conditions += " AND FPRO_ID_CTO_INVER IS NULL";
        } else if (this.getFproIdCtoInver() != null) {
            conditions += " AND FPRO_ID_CTO_INVER = ?";
            values.add(this.getFproIdCtoInver());
        }

        if (this.getFproTipoFondo() != null && "null".equals(this.getFproTipoFondo())) {
            conditions += " AND FPRO_TIPO_FONDO IS NULL";
        } else if (this.getFproTipoFondo() != null) {
            conditions += " AND FPRO_TIPO_FONDO = ?";
            values.add(this.getFproTipoFondo());
        }

        if (this.getFproFormula() != null && "null".equals(this.getFproFormula())) {
            conditions += " AND FPRO_FORMULA IS NULL";
        } else if (this.getFproFormula() != null) {
            conditions += " AND FPRO_FORMULA = ?";
            values.add(this.getFproFormula());
        }

        if (this.getFproSaldoObjetivo() != null && this.getFproSaldoObjetivo().longValue() == -999) {
            conditions += " AND FPRO_SALDO_OBJETIVO IS NULL";
        } else if (this.getFproSaldoObjetivo() != null) {
            conditions += " AND FPRO_SALDO_OBJETIVO = ?";
            values.add(this.getFproSaldoObjetivo());
        }

        if (this.getFproSaldo() != null && this.getFproSaldo().longValue() == -999) {
            conditions += " AND FPRO_SALDO IS NULL";
        } else if (this.getFproSaldo() != null) {
            conditions += " AND FPRO_SALDO = ?";
            values.add(this.getFproSaldo());
        }

        if (this.getFproPorcentaje() != null && this.getFproPorcentaje().longValue() == -999) {
            conditions += " AND FPRO_PORCENTAJE IS NULL";
        } else if (this.getFproPorcentaje() != null) {
            conditions += " AND FPRO_PORCENTAJE = ?";
            values.add(this.getFproPorcentaje());
        }

        if (this.getFproConcepto() != null && "null".equals(this.getFproConcepto())) {
            conditions += " AND FPRO_CONCEPTO IS NULL";
        } else if (this.getFproConcepto() != null) {
            conditions += " AND FPRO_CONCEPTO = ?";
            values.add(this.getFproConcepto());
        }

        if (this.getFproPeriodicidad() != null && "null".equals(this.getFproPeriodicidad())) {
            conditions += " AND FPRO_PERIODICIDAD IS NULL";
        } else if (this.getFproPeriodicidad() != null) {
            conditions += " AND FPRO_PERIODICIDAD = ?";
            values.add(this.getFproPeriodicidad());
        }

        if (this.getFproReceptor() != null && this.getFproReceptor().longValue() == -999) {
            conditions += " AND FPRO_RECEPTOR IS NULL";
        } else if (this.getFproReceptor() != null) {
            conditions += " AND FPRO_RECEPTOR = ?";
            values.add(this.getFproReceptor());
        }

        if (this.getFproPagador() != null && this.getFproPagador().longValue() == -999) {
            conditions += " AND FPRO_PAGADOR IS NULL";
        } else if (this.getFproPagador() != null) {
            conditions += " AND FPRO_PAGADOR = ?";
            values.add(this.getFproPagador());
        }

        if (this.getFproTexComentario() != null && "null".equals(this.getFproTexComentario())) {
            conditions += " AND FPRO_TEX_COMENTARIO IS NULL";
        } else if (this.getFproTexComentario() != null) {
            conditions += " AND FPRO_TEX_COMENTARIO = ?";
            values.add(this.getFproTexComentario());
        }

        if (this.getFcreFecReservaTras() != null && "null".equals(this.getFcreFecReservaTras())) {
            conditions += " AND FCRE_FEC_RESERVA_TRAS IS NULL";
        } else if (this.getFcreFecReservaTras() != null) {
            conditions += " AND FCRE_FEC_RESERVA_TRAS = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcreFecReservaTras());
        }

        if (this.getFcreImpReservaTras() != null && this.getFcreImpReservaTras().longValue() == -999) {
            conditions += " AND FCRE_IMP_RESERVA_TRAS IS NULL";
        } else if (this.getFcreImpReservaTras() != null) {
            conditions += " AND FCRE_IMP_RESERVA_TRAS = ?";
            values.add(this.getFcreImpReservaTras());
        }

        if (this.getFcreFecHono() != null && "null".equals(this.getFcreFecHono())) {
            conditions += " AND FCRE_FEC_HONO IS NULL";
        } else if (this.getFcreFecHono() != null) {
            conditions += " AND FCRE_FEC_HONO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcreFecHono());
        }

        if (this.getFcrePagaHono() != null && this.getFcrePagaHono().longValue() == -999) {
            conditions += " AND FCRE_PAGA_HONO IS NULL";
        } else if (this.getFcrePagaHono() != null) {
            conditions += " AND FCRE_PAGA_HONO = ?";
            values.add(this.getFcrePagaHono());
        }

        if (this.getFcrePagaCredito() != null && this.getFcrePagaCredito().longValue() == -999) {
            conditions += " AND FCRE_PAGA_CREDITO IS NULL";
        } else if (this.getFcrePagaCredito() != null) {
            conditions += " AND FCRE_PAGA_CREDITO = ?";
            values.add(this.getFcrePagaCredito());
        }

        if (this.getFcreCuentaClabe() != null && "null".equals(this.getFcreCuentaClabe())) {
            conditions += " AND FCRE_CUENTA_CLABE IS NULL";
        } else if (this.getFcreCuentaClabe() != null) {
            conditions += " AND FCRE_CUENTA_CLABE = ?";
            values.add(this.getFcreCuentaClabe());
        }

        if (this.getFproStPropor() != null && "null".equals(this.getFproStPropor())) {
            conditions += " AND FPRO_ST_PROPOR IS NULL";
        } else if (this.getFproStPropor() != null) {
            conditions += " AND FPRO_ST_PROPOR = ?";
            values.add(this.getFproStPropor());
        }

        if (this.getFproCuentaClabe() != null && "null".equals(this.getFproCuentaClabe())) {
            conditions += " AND FPRO_CUENTA_CLABE IS NULL";
        } else if (this.getFproCuentaClabe() != null) {
            conditions += " AND FPRO_CUENTA_CLABE = ?";
            values.add(this.getFproCuentaClabe());
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
        String sql = "UPDATE F_PROPORCIONES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPRO_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFproIdFideicomiso());
        conditions += " AND FPRO_ID_CREDITO = ?";
        pkValues.add(this.getFproIdCredito());
        conditions += " AND FPRO_ID_CTO_INVER = ?";
        pkValues.add(this.getFproIdCtoInver());
        fields += " FPRO_TIPO_FONDO = ?, ";
        values.add(this.getFproTipoFondo());
        fields += " FPRO_FORMULA = ?, ";
        values.add(this.getFproFormula());
        fields += " FPRO_SALDO_OBJETIVO = ?, ";
        values.add(this.getFproSaldoObjetivo());
        fields += " FPRO_SALDO = ?, ";
        values.add(this.getFproSaldo());
        fields += " FPRO_PORCENTAJE = ?, ";
        values.add(this.getFproPorcentaje());
        fields += " FPRO_CONCEPTO = ?, ";
        values.add(this.getFproConcepto());
        fields += " FPRO_PERIODICIDAD = ?, ";
        values.add(this.getFproPeriodicidad());
        fields += " FPRO_RECEPTOR = ?, ";
        values.add(this.getFproReceptor());
        fields += " FPRO_PAGADOR = ?, ";
        values.add(this.getFproPagador());
        fields += " FPRO_TEX_COMENTARIO = ?, ";
        values.add(this.getFproTexComentario());
        fields += " FCRE_FEC_RESERVA_TRAS = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcreFecReservaTras());
        fields += " FCRE_IMP_RESERVA_TRAS = ?, ";
        values.add(this.getFcreImpReservaTras());
        fields += " FCRE_FEC_HONO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcreFecHono());
        fields += " FCRE_PAGA_HONO = ?, ";
        values.add(this.getFcrePagaHono());
        fields += " FCRE_PAGA_CREDITO = ?, ";
        values.add(this.getFcrePagaCredito());
        fields += " FCRE_CUENTA_CLABE = ?, ";
        values.add(this.getFcreCuentaClabe());
        fields += " FPRO_ST_PROPOR = ?, ";
        values.add(this.getFproStPropor());
        fields += " FPRO_CUENTA_CLABE = ?, ";
        values.add(this.getFproCuentaClabe());
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
        String sql = "INSERT INTO F_PROPORCIONES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPRO_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFproIdFideicomiso());

        fields += ", FPRO_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFproIdCredito());

        fields += ", FPRO_ID_CTO_INVER";
        fieldValues += ", ?";
        values.add(this.getFproIdCtoInver());

        fields += ", FPRO_TIPO_FONDO";
        fieldValues += ", ?";
        values.add(this.getFproTipoFondo());

        fields += ", FPRO_FORMULA";
        fieldValues += ", ?";
        values.add(this.getFproFormula());

        fields += ", FPRO_SALDO_OBJETIVO";
        fieldValues += ", ?";
        values.add(this.getFproSaldoObjetivo());

        fields += ", FPRO_SALDO";
        fieldValues += ", ?";
        values.add(this.getFproSaldo());

        fields += ", FPRO_PORCENTAJE";
        fieldValues += ", ?";
        values.add(this.getFproPorcentaje());

        fields += ", FPRO_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getFproConcepto());

        fields += ", FPRO_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getFproPeriodicidad());

        fields += ", FPRO_RECEPTOR";
        fieldValues += ", ?";
        values.add(this.getFproReceptor());

        fields += ", FPRO_PAGADOR";
        fieldValues += ", ?";
        values.add(this.getFproPagador());

        fields += ", FPRO_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFproTexComentario());

        fields += ", FCRE_FEC_RESERVA_TRAS";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcreFecReservaTras());

        fields += ", FCRE_IMP_RESERVA_TRAS";
        fieldValues += ", ?";
        values.add(this.getFcreImpReservaTras());

        fields += ", FCRE_FEC_HONO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcreFecHono());

        fields += ", FCRE_PAGA_HONO";
        fieldValues += ", ?";
        values.add(this.getFcrePagaHono());

        fields += ", FCRE_PAGA_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcrePagaCredito());

        fields += ", FCRE_CUENTA_CLABE";
        fieldValues += ", ?";
        values.add(this.getFcreCuentaClabe());

        fields += ", FPRO_ST_PROPOR";
        fieldValues += ", ?";
        values.add(this.getFproStPropor());

        fields += ", FPRO_CUENTA_CLABE";
        fieldValues += ", ?";
        values.add(this.getFproCuentaClabe());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PROPORCIONES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPRO_ID_FIDEICOMISO = ?";
        values.add(this.getFproIdFideicomiso());
        conditions += " AND FPRO_ID_CREDITO = ?";
        values.add(this.getFproIdCredito());
        conditions += " AND FPRO_ID_CTO_INVER = ?";
        values.add(this.getFproIdCtoInver());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FProporciones instance = (FProporciones) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFproIdFideicomiso().equals(instance.getFproIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFproIdCredito().equals(instance.getFproIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFproIdCtoInver().equals(instance.getFproIdCtoInver()))
            equalObjects = false;
        if (equalObjects && !this.getFproTipoFondo().equals(instance.getFproTipoFondo()))
            equalObjects = false;
        if (equalObjects && !this.getFproFormula().equals(instance.getFproFormula()))
            equalObjects = false;
        if (equalObjects && !this.getFproSaldoObjetivo().equals(instance.getFproSaldoObjetivo()))
            equalObjects = false;
        if (equalObjects && !this.getFproSaldo().equals(instance.getFproSaldo()))
            equalObjects = false;
        if (equalObjects && !this.getFproPorcentaje().equals(instance.getFproPorcentaje()))
            equalObjects = false;
        if (equalObjects && !this.getFproConcepto().equals(instance.getFproConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getFproPeriodicidad().equals(instance.getFproPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getFproReceptor().equals(instance.getFproReceptor()))
            equalObjects = false;
        if (equalObjects && !this.getFproPagador().equals(instance.getFproPagador()))
            equalObjects = false;
        if (equalObjects && !this.getFproTexComentario().equals(instance.getFproTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFecReservaTras().equals(instance.getFcreFecReservaTras()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpReservaTras().equals(instance.getFcreImpReservaTras()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFecHono().equals(instance.getFcreFecHono()))
            equalObjects = false;
        if (equalObjects && !this.getFcrePagaHono().equals(instance.getFcrePagaHono()))
            equalObjects = false;
        if (equalObjects && !this.getFcrePagaCredito().equals(instance.getFcrePagaCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFcreCuentaClabe().equals(instance.getFcreCuentaClabe()))
            equalObjects = false;
        if (equalObjects && !this.getFproStPropor().equals(instance.getFproStPropor()))
            equalObjects = false;
        if (equalObjects && !this.getFproCuentaClabe().equals(instance.getFproCuentaClabe()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FProporciones result = new FProporciones();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFproIdFideicomiso((BigDecimal) objectData.getData("FPRO_ID_FIDEICOMISO"));
        result.setFproIdCredito((String) objectData.getData("FPRO_ID_CREDITO"));
        result.setFproIdCtoInver((BigDecimal) objectData.getData("FPRO_ID_CTO_INVER"));
        result.setFproTipoFondo((String) objectData.getData("FPRO_TIPO_FONDO"));
        result.setFproFormula((String) objectData.getData("FPRO_FORMULA"));
        result.setFproSaldoObjetivo((BigDecimal) objectData.getData("FPRO_SALDO_OBJETIVO"));
        result.setFproSaldo((BigDecimal) objectData.getData("FPRO_SALDO"));
        result.setFproPorcentaje((BigDecimal) objectData.getData("FPRO_PORCENTAJE"));
        result.setFproConcepto((String) objectData.getData("FPRO_CONCEPTO"));
        result.setFproPeriodicidad((String) objectData.getData("FPRO_PERIODICIDAD"));
        result.setFproReceptor((BigDecimal) objectData.getData("FPRO_RECEPTOR"));
        result.setFproPagador((BigDecimal) objectData.getData("FPRO_PAGADOR"));
        result.setFproTexComentario((String) objectData.getData("FPRO_TEX_COMENTARIO"));
        result.setFcreFecReservaTras((String) objectData.getData("FCRE_FEC_RESERVA_TRAS"));
        result.setFcreImpReservaTras((BigDecimal) objectData.getData("FCRE_IMP_RESERVA_TRAS"));
        result.setFcreFecHono((String) objectData.getData("FCRE_FEC_HONO"));
        result.setFcrePagaHono((BigDecimal) objectData.getData("FCRE_PAGA_HONO"));
        result.setFcrePagaCredito((BigDecimal) objectData.getData("FCRE_PAGA_CREDITO"));
        result.setFcreCuentaClabe((String) objectData.getData("FCRE_CUENTA_CLABE"));
        result.setFproStPropor((String) objectData.getData("FPRO_ST_PROPOR"));
        result.setFproCuentaClabe((String) objectData.getData("FPRO_CUENTA_CLABE"));

        return result;

    }

}
