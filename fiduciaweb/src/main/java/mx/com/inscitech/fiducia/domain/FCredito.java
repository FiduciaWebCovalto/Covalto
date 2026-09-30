package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CREDITO_PK", columns = { "FCRE_ID_FIDEICOMISO", "FCRE_ID_CREDITO" }, sequences = { "MANUAL" })
public class FCredito extends DomainObject {

    BigDecimal fcreIdFideicomiso = null;
    String fcreIdCredito = null;
    String fcreTipoCredito = null;
    BigDecimal fcreImpCredito = null;
    BigDecimal fcreTasa = null;
    BigDecimal fcrePagos = null;
    String fcrePeriodicidad = null;
    BigDecimal fcreImpApertura = null;
    BigDecimal fcreImpNeto = null;
    BigDecimal fcreImpSaldo = null;
    String fcreFecApertura = null;
    String fcreFechaPago = null;
    String fcreFormulaCal = null;
    BigDecimal fcreMoneda = null;
    BigDecimal fcreImpMoneda = null;
    BigDecimal fcreTasaMora = null;
    String fcreTexComentario = null;
    String fcreFecReservaTras = null;
    BigDecimal fcreImpReservaTras = null;
    BigDecimal fcrePlazoTras = null;
    String fcreFecReservaLim = null;
    BigDecimal fcrePlazoLim = null;
    String fcreStCredito = null;

    public FCredito() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcreIdFideicomiso(BigDecimal fcreIdFideicomiso) {
        this.fcreIdFideicomiso = fcreIdFideicomiso;
    }

    public BigDecimal getFcreIdFideicomiso() {
        return this.fcreIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreIdCredito(String fcreIdCredito) {
        this.fcreIdCredito = fcreIdCredito;
    }

    public String getFcreIdCredito() {
        return this.fcreIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreTipoCredito(String fcreTipoCredito) {
        this.fcreTipoCredito = fcreTipoCredito;
    }

    public String getFcreTipoCredito() {
        return this.fcreTipoCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpCredito(BigDecimal fcreImpCredito) {
        this.fcreImpCredito = fcreImpCredito;
    }

    public BigDecimal getFcreImpCredito() {
        return this.fcreImpCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 8, javaClass = BigDecimal.class)
    public void setFcreTasa(BigDecimal fcreTasa) {
        this.fcreTasa = fcreTasa;
    }

    public BigDecimal getFcreTasa() {
        return this.fcreTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 8, javaClass = BigDecimal.class)
    public void setFcrePagos(BigDecimal fcrePagos) {
        this.fcrePagos = fcrePagos;
    }

    public BigDecimal getFcrePagos() {
        return this.fcrePagos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcrePeriodicidad(String fcrePeriodicidad) {
        this.fcrePeriodicidad = fcrePeriodicidad;
    }

    public String getFcrePeriodicidad() {
        return this.fcrePeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpApertura(BigDecimal fcreImpApertura) {
        this.fcreImpApertura = fcreImpApertura;
    }

    public BigDecimal getFcreImpApertura() {
        return this.fcreImpApertura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpNeto(BigDecimal fcreImpNeto) {
        this.fcreImpNeto = fcreImpNeto;
    }

    public BigDecimal getFcreImpNeto() {
        return this.fcreImpNeto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpSaldo(BigDecimal fcreImpSaldo) {
        this.fcreImpSaldo = fcreImpSaldo;
    }

    public BigDecimal getFcreImpSaldo() {
        return this.fcreImpSaldo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcreFecApertura(String fcreFecApertura) {
        this.fcreFecApertura = fcreFecApertura;
    }

    public String getFcreFecApertura() {
        return this.fcreFecApertura;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcreFechaPago(String fcreFechaPago) {
        this.fcreFechaPago = fcreFechaPago;
    }

    public String getFcreFechaPago() {
        return this.fcreFechaPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreFormulaCal(String fcreFormulaCal) {
        this.fcreFormulaCal = fcreFormulaCal;
    }

    public String getFcreFormulaCal() {
        return this.fcreFormulaCal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcreMoneda(BigDecimal fcreMoneda) {
        this.fcreMoneda = fcreMoneda;
    }

    public BigDecimal getFcreMoneda() {
        return this.fcreMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpMoneda(BigDecimal fcreImpMoneda) {
        this.fcreImpMoneda = fcreImpMoneda;
    }

    public BigDecimal getFcreImpMoneda() {
        return this.fcreImpMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 8, javaClass = BigDecimal.class)
    public void setFcreTasaMora(BigDecimal fcreTasaMora) {
        this.fcreTasaMora = fcreTasaMora;
    }

    public BigDecimal getFcreTasaMora() {
        return this.fcreTasaMora;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreTexComentario(String fcreTexComentario) {
        this.fcreTexComentario = fcreTexComentario;
    }

    public String getFcreTexComentario() {
        return this.fcreTexComentario;
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

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcrePlazoTras(BigDecimal fcrePlazoTras) {
        this.fcrePlazoTras = fcrePlazoTras;
    }

    public BigDecimal getFcrePlazoTras() {
        return this.fcrePlazoTras;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcreFecReservaLim(String fcreFecReservaLim) {
        this.fcreFecReservaLim = fcreFecReservaLim;
    }

    public String getFcreFecReservaLim() {
        return this.fcreFecReservaLim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcrePlazoLim(BigDecimal fcrePlazoLim) {
        this.fcrePlazoLim = fcrePlazoLim;
    }

    public BigDecimal getFcrePlazoLim() {
        return this.fcrePlazoLim;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreStCredito(String fcreStCredito) {
        this.fcreStCredito = fcreStCredito;
    }

    public String getFcreStCredito() {
        return this.fcreStCredito;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CREDITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcreIdFideicomiso() != null && this.getFcreIdFideicomiso().longValue() == -999) {
            conditions += " AND FCRE_ID_FIDEICOMISO IS NULL";
        } else if (this.getFcreIdFideicomiso() != null) {
            conditions += " AND FCRE_ID_FIDEICOMISO = ?";
            values.add(this.getFcreIdFideicomiso());
        }

        if (this.getFcreIdCredito() != null && "null".equals(this.getFcreIdCredito())) {
            conditions += " AND FCRE_ID_CREDITO IS NULL";
        } else if (this.getFcreIdCredito() != null) {
            conditions += " AND FCRE_ID_CREDITO = ?";
            values.add(this.getFcreIdCredito());
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
        String sql = "SELECT * FROM F_CREDITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcreIdFideicomiso() != null && this.getFcreIdFideicomiso().longValue() == -999) {
            conditions += " AND FCRE_ID_FIDEICOMISO IS NULL";
        } else if (this.getFcreIdFideicomiso() != null) {
            conditions += " AND FCRE_ID_FIDEICOMISO = ?";
            values.add(this.getFcreIdFideicomiso());
        }

        if (this.getFcreIdCredito() != null && "null".equals(this.getFcreIdCredito())) {
            conditions += " AND FCRE_ID_CREDITO IS NULL";
        } else if (this.getFcreIdCredito() != null) {
            conditions += " AND FCRE_ID_CREDITO = ?";
            values.add(this.getFcreIdCredito());
        }

        if (this.getFcreTipoCredito() != null && "null".equals(this.getFcreTipoCredito())) {
            conditions += " AND FCRE_TIPO_CREDITO IS NULL";
        } else if (this.getFcreTipoCredito() != null) {
            conditions += " AND FCRE_TIPO_CREDITO = ?";
            values.add(this.getFcreTipoCredito());
        }

        if (this.getFcreImpCredito() != null && this.getFcreImpCredito().longValue() == -999) {
            conditions += " AND FCRE_IMP_CREDITO IS NULL";
        } else if (this.getFcreImpCredito() != null) {
            conditions += " AND FCRE_IMP_CREDITO = ?";
            values.add(this.getFcreImpCredito());
        }

        if (this.getFcreTasa() != null && this.getFcreTasa().longValue() == -999) {
            conditions += " AND FCRE_TASA IS NULL";
        } else if (this.getFcreTasa() != null) {
            conditions += " AND FCRE_TASA = ?";
            values.add(this.getFcreTasa());
        }

        if (this.getFcrePagos() != null && this.getFcrePagos().longValue() == -999) {
            conditions += " AND FCRE_PAGOS IS NULL";
        } else if (this.getFcrePagos() != null) {
            conditions += " AND FCRE_PAGOS = ?";
            values.add(this.getFcrePagos());
        }

        if (this.getFcrePeriodicidad() != null && "null".equals(this.getFcrePeriodicidad())) {
            conditions += " AND FCRE_PERIODICIDAD IS NULL";
        } else if (this.getFcrePeriodicidad() != null) {
            conditions += " AND FCRE_PERIODICIDAD = ?";
            values.add(this.getFcrePeriodicidad());
        }

        if (this.getFcreImpApertura() != null && this.getFcreImpApertura().longValue() == -999) {
            conditions += " AND FCRE_IMP_APERTURA IS NULL";
        } else if (this.getFcreImpApertura() != null) {
            conditions += " AND FCRE_IMP_APERTURA = ?";
            values.add(this.getFcreImpApertura());
        }

        if (this.getFcreImpNeto() != null && this.getFcreImpNeto().longValue() == -999) {
            conditions += " AND FCRE_IMP_NETO IS NULL";
        } else if (this.getFcreImpNeto() != null) {
            conditions += " AND FCRE_IMP_NETO = ?";
            values.add(this.getFcreImpNeto());
        }

        if (this.getFcreImpSaldo() != null && this.getFcreImpSaldo().longValue() == -999) {
            conditions += " AND FCRE_IMP_SALDO IS NULL";
        } else if (this.getFcreImpSaldo() != null) {
            conditions += " AND FCRE_IMP_SALDO = ?";
            values.add(this.getFcreImpSaldo());
        }

        if (this.getFcreFecApertura() != null && "null".equals(this.getFcreFecApertura())) {
            conditions += " AND FCRE_FEC_APERTURA IS NULL";
        } else if (this.getFcreFecApertura() != null) {
            conditions += " AND FCRE_FEC_APERTURA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcreFecApertura());
        }

        if (this.getFcreFechaPago() != null && "null".equals(this.getFcreFechaPago())) {
            conditions += " AND FCRE_FECHA_PAGO IS NULL";
        } else if (this.getFcreFechaPago() != null) {
            conditions += " AND FCRE_FECHA_PAGO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcreFechaPago());
        }

        if (this.getFcreFormulaCal() != null && "null".equals(this.getFcreFormulaCal())) {
            conditions += " AND FCRE_FORMULA_CAL IS NULL";
        } else if (this.getFcreFormulaCal() != null) {
            conditions += " AND FCRE_FORMULA_CAL = ?";
            values.add(this.getFcreFormulaCal());
        }

        if (this.getFcreMoneda() != null && this.getFcreMoneda().longValue() == -999) {
            conditions += " AND FCRE_MONEDA IS NULL";
        } else if (this.getFcreMoneda() != null) {
            conditions += " AND FCRE_MONEDA = ?";
            values.add(this.getFcreMoneda());
        }

        if (this.getFcreImpMoneda() != null && this.getFcreImpMoneda().longValue() == -999) {
            conditions += " AND FCRE_IMP_MONEDA IS NULL";
        } else if (this.getFcreImpMoneda() != null) {
            conditions += " AND FCRE_IMP_MONEDA = ?";
            values.add(this.getFcreImpMoneda());
        }

        if (this.getFcreTasaMora() != null && this.getFcreTasaMora().longValue() == -999) {
            conditions += " AND FCRE_TASA_MORA IS NULL";
        } else if (this.getFcreTasaMora() != null) {
            conditions += " AND FCRE_TASA_MORA = ?";
            values.add(this.getFcreTasaMora());
        }

        if (this.getFcreTexComentario() != null && "null".equals(this.getFcreTexComentario())) {
            conditions += " AND FCRE_TEX_COMENTARIO IS NULL";
        } else if (this.getFcreTexComentario() != null) {
            conditions += " AND FCRE_TEX_COMENTARIO = ?";
            values.add(this.getFcreTexComentario());
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

        if (this.getFcrePlazoTras() != null && this.getFcrePlazoTras().longValue() == -999) {
            conditions += " AND FCRE_PLAZO_TRAS IS NULL";
        } else if (this.getFcrePlazoTras() != null) {
            conditions += " AND FCRE_PLAZO_TRAS = ?";
            values.add(this.getFcrePlazoTras());
        }

        if (this.getFcreFecReservaLim() != null && "null".equals(this.getFcreFecReservaLim())) {
            conditions += " AND FCRE_FEC_RESERVA_LIM IS NULL";
        } else if (this.getFcreFecReservaLim() != null) {
            conditions += " AND FCRE_FEC_RESERVA_LIM = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcreFecReservaLim());
        }

        if (this.getFcrePlazoLim() != null && this.getFcrePlazoLim().longValue() == -999) {
            conditions += " AND FCRE_PLAZO_LIM IS NULL";
        } else if (this.getFcrePlazoLim() != null) {
            conditions += " AND FCRE_PLAZO_LIM = ?";
            values.add(this.getFcrePlazoLim());
        }

        if (this.getFcreStCredito() != null && "null".equals(this.getFcreStCredito())) {
            conditions += " AND FCRE_ST_CREDITO IS NULL";
        } else if (this.getFcreStCredito() != null) {
            conditions += " AND FCRE_ST_CREDITO = ?";
            values.add(this.getFcreStCredito());
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
        String sql = "UPDATE F_CREDITO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCRE_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFcreIdFideicomiso());
        conditions += " AND FCRE_ID_CREDITO = ?";
        pkValues.add(this.getFcreIdCredito());
        fields += " FCRE_TIPO_CREDITO = ?, ";
        values.add(this.getFcreTipoCredito());
        fields += " FCRE_IMP_CREDITO = ?, ";
        values.add(this.getFcreImpCredito());
        fields += " FCRE_TASA = ?, ";
        values.add(this.getFcreTasa());
        fields += " FCRE_PAGOS = ?, ";
        values.add(this.getFcrePagos());
        fields += " FCRE_PERIODICIDAD = ?, ";
        values.add(this.getFcrePeriodicidad());
        fields += " FCRE_IMP_APERTURA = ?, ";
        values.add(this.getFcreImpApertura());
        fields += " FCRE_IMP_NETO = ?, ";
        values.add(this.getFcreImpNeto());
        fields += " FCRE_IMP_SALDO = ?, ";
        values.add(this.getFcreImpSaldo());
        fields += " FCRE_FEC_APERTURA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcreFecApertura());
        fields += " FCRE_FECHA_PAGO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcreFechaPago());
        fields += " FCRE_FORMULA_CAL = ?, ";
        values.add(this.getFcreFormulaCal());
        fields += " FCRE_MONEDA = ?, ";
        values.add(this.getFcreMoneda());
        fields += " FCRE_IMP_MONEDA = ?, ";
        values.add(this.getFcreImpMoneda());
        fields += " FCRE_TASA_MORA = ?, ";
        values.add(this.getFcreTasaMora());
        fields += " FCRE_TEX_COMENTARIO = ?, ";
        values.add(this.getFcreTexComentario());
        fields += " FCRE_FEC_RESERVA_TRAS = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcreFecReservaTras());
        fields += " FCRE_IMP_RESERVA_TRAS = ?, ";
        values.add(this.getFcreImpReservaTras());
        fields += " FCRE_PLAZO_TRAS = ?, ";
        values.add(this.getFcrePlazoTras());
        fields += " FCRE_FEC_RESERVA_LIM = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcreFecReservaLim());
        fields += " FCRE_PLAZO_LIM = ?, ";
        values.add(this.getFcrePlazoLim());
        fields += " FCRE_ST_CREDITO = ?, ";
        values.add(this.getFcreStCredito());
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
        String sql = "INSERT INTO F_CREDITO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCRE_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFcreIdFideicomiso());

        fields += ", FCRE_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreIdCredito());

        fields += ", FCRE_TIPO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreTipoCredito());

        fields += ", FCRE_IMP_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreImpCredito());

        fields += ", FCRE_TASA";
        fieldValues += ", ?";
        values.add(this.getFcreTasa());

        fields += ", FCRE_PAGOS";
        fieldValues += ", ?";
        values.add(this.getFcrePagos());

        fields += ", FCRE_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getFcrePeriodicidad());

        fields += ", FCRE_IMP_APERTURA";
        fieldValues += ", ?";
        values.add(this.getFcreImpApertura());

        fields += ", FCRE_IMP_NETO";
        fieldValues += ", ?";
        values.add(this.getFcreImpNeto());

        fields += ", FCRE_IMP_SALDO";
        fieldValues += ", ?";
        values.add(this.getFcreImpSaldo());

        fields += ", FCRE_FEC_APERTURA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcreFecApertura());

        fields += ", FCRE_FECHA_PAGO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcreFechaPago());

        fields += ", FCRE_FORMULA_CAL";
        fieldValues += ", ?";
        values.add(this.getFcreFormulaCal());

        fields += ", FCRE_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFcreMoneda());

        fields += ", FCRE_IMP_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFcreImpMoneda());

        fields += ", FCRE_TASA_MORA";
        fieldValues += ", ?";
        values.add(this.getFcreTasaMora());

        fields += ", FCRE_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFcreTexComentario());

        fields += ", FCRE_FEC_RESERVA_TRAS";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcreFecReservaTras());

        fields += ", FCRE_IMP_RESERVA_TRAS";
        fieldValues += ", ?";
        values.add(this.getFcreImpReservaTras());

        fields += ", FCRE_PLAZO_TRAS";
        fieldValues += ", ?";
        values.add(this.getFcrePlazoTras());

        fields += ", FCRE_FEC_RESERVA_LIM";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcreFecReservaLim());

        fields += ", FCRE_PLAZO_LIM";
        fieldValues += ", ?";
        values.add(this.getFcrePlazoLim());

        fields += ", FCRE_ST_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreStCredito());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CREDITO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCRE_ID_FIDEICOMISO = ?";
        values.add(this.getFcreIdFideicomiso());
        conditions += " AND FCRE_ID_CREDITO = ?";
        values.add(this.getFcreIdCredito());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCredito instance = (FCredito) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcreIdFideicomiso().equals(instance.getFcreIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFcreIdCredito().equals(instance.getFcreIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFcreTipoCredito().equals(instance.getFcreTipoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpCredito().equals(instance.getFcreImpCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFcreTasa().equals(instance.getFcreTasa()))
            equalObjects = false;
        if (equalObjects && !this.getFcrePagos().equals(instance.getFcrePagos()))
            equalObjects = false;
        if (equalObjects && !this.getFcrePeriodicidad().equals(instance.getFcrePeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpApertura().equals(instance.getFcreImpApertura()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpNeto().equals(instance.getFcreImpNeto()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpSaldo().equals(instance.getFcreImpSaldo()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFecApertura().equals(instance.getFcreFecApertura()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFechaPago().equals(instance.getFcreFechaPago()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFormulaCal().equals(instance.getFcreFormulaCal()))
            equalObjects = false;
        if (equalObjects && !this.getFcreMoneda().equals(instance.getFcreMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpMoneda().equals(instance.getFcreImpMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFcreTasaMora().equals(instance.getFcreTasaMora()))
            equalObjects = false;
        if (equalObjects && !this.getFcreTexComentario().equals(instance.getFcreTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFecReservaTras().equals(instance.getFcreFecReservaTras()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpReservaTras().equals(instance.getFcreImpReservaTras()))
            equalObjects = false;
        if (equalObjects && !this.getFcrePlazoTras().equals(instance.getFcrePlazoTras()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFecReservaLim().equals(instance.getFcreFecReservaLim()))
            equalObjects = false;
        if (equalObjects && !this.getFcrePlazoLim().equals(instance.getFcrePlazoLim()))
            equalObjects = false;
        if (equalObjects && !this.getFcreStCredito().equals(instance.getFcreStCredito()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCredito result = new FCredito();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcreIdFideicomiso((BigDecimal) objectData.getData("FCRE_ID_FIDEICOMISO"));
        result.setFcreIdCredito((String) objectData.getData("FCRE_ID_CREDITO"));
        result.setFcreTipoCredito((String) objectData.getData("FCRE_TIPO_CREDITO"));
        result.setFcreImpCredito((BigDecimal) objectData.getData("FCRE_IMP_CREDITO"));
        result.setFcreTasa((BigDecimal) objectData.getData("FCRE_TASA"));
        result.setFcrePagos((BigDecimal) objectData.getData("FCRE_PAGOS"));
        result.setFcrePeriodicidad((String) objectData.getData("FCRE_PERIODICIDAD"));
        result.setFcreImpApertura((BigDecimal) objectData.getData("FCRE_IMP_APERTURA"));
        result.setFcreImpNeto((BigDecimal) objectData.getData("FCRE_IMP_NETO"));
        result.setFcreImpSaldo((BigDecimal) objectData.getData("FCRE_IMP_SALDO"));
        result.setFcreFecApertura((String) objectData.getData("FCRE_FEC_APERTURA"));
        result.setFcreFechaPago((String) objectData.getData("FCRE_FECHA_PAGO"));
        result.setFcreFormulaCal((String) objectData.getData("FCRE_FORMULA_CAL"));
        result.setFcreMoneda((BigDecimal) objectData.getData("FCRE_MONEDA"));
        result.setFcreImpMoneda((BigDecimal) objectData.getData("FCRE_IMP_MONEDA"));
        result.setFcreTasaMora((BigDecimal) objectData.getData("FCRE_TASA_MORA"));
        result.setFcreTexComentario((String) objectData.getData("FCRE_TEX_COMENTARIO"));
        result.setFcreFecReservaTras((String) objectData.getData("FCRE_FEC_RESERVA_TRAS"));
        result.setFcreImpReservaTras((BigDecimal) objectData.getData("FCRE_IMP_RESERVA_TRAS"));
        result.setFcrePlazoTras((BigDecimal) objectData.getData("FCRE_PLAZO_TRAS"));
        result.setFcreFecReservaLim((String) objectData.getData("FCRE_FEC_RESERVA_LIM"));
        result.setFcrePlazoLim((BigDecimal) objectData.getData("FCRE_PLAZO_LIM"));
        result.setFcreStCredito((String) objectData.getData("FCRE_ST_CREDITO"));

        return result;

    }

}
