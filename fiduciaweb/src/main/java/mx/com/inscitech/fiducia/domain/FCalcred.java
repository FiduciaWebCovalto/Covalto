package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CALCRED_PK", columns = { "FCCR_ID_FIDEICOMISO", "FCCR_ID_CREDITO", "FCCR_ID_PAGO" }, sequences = { "MANUAL" })
public class FCalcred extends DomainObject {

    BigDecimal fccrIdFideicomiso = null;
    BigDecimal fccrIdCredito = null;
    String fccrIdPago = null;
    String fccrFechaPago = null;
    BigDecimal fccrImpPago = null;
    BigDecimal fccrImpCapital = null;
    BigDecimal fccrImpIntereses = null;
    String fccrFecPagado = null;
    BigDecimal fccrTasa = null;
    BigDecimal fccrMoneda = null;
    BigDecimal fccrImpMoneda = null;
    BigDecimal fccrTipoCambio = null;
    String fccrTexComentario = null;
    BigDecimal fccrImpIntMora = null;
    String fccrAntSaldo = null;
    String fccrStPago = null;

    public FCalcred() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFccrIdFideicomiso(BigDecimal fccrIdFideicomiso) {
        this.fccrIdFideicomiso = fccrIdFideicomiso;
    }

    public BigDecimal getFccrIdFideicomiso() {
        return this.fccrIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFccrIdCredito(BigDecimal fccrIdCredito) {
        this.fccrIdCredito = fccrIdCredito;
    }

    public BigDecimal getFccrIdCredito() {
        return this.fccrIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccrIdPago(String fccrIdPago) {
        this.fccrIdPago = fccrIdPago;
    }

    public String getFccrIdPago() {
        return this.fccrIdPago;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFccrFechaPago(String fccrFechaPago) {
        this.fccrFechaPago = fccrFechaPago;
    }

    public String getFccrFechaPago() {
        return this.fccrFechaPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFccrImpPago(BigDecimal fccrImpPago) {
        this.fccrImpPago = fccrImpPago;
    }

    public BigDecimal getFccrImpPago() {
        return this.fccrImpPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFccrImpCapital(BigDecimal fccrImpCapital) {
        this.fccrImpCapital = fccrImpCapital;
    }

    public BigDecimal getFccrImpCapital() {
        return this.fccrImpCapital;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFccrImpIntereses(BigDecimal fccrImpIntereses) {
        this.fccrImpIntereses = fccrImpIntereses;
    }

    public BigDecimal getFccrImpIntereses() {
        return this.fccrImpIntereses;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFccrFecPagado(String fccrFecPagado) {
        this.fccrFecPagado = fccrFecPagado;
    }

    public String getFccrFecPagado() {
        return this.fccrFecPagado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 8, javaClass = BigDecimal.class)
    public void setFccrTasa(BigDecimal fccrTasa) {
        this.fccrTasa = fccrTasa;
    }

    public BigDecimal getFccrTasa() {
        return this.fccrTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFccrMoneda(BigDecimal fccrMoneda) {
        this.fccrMoneda = fccrMoneda;
    }

    public BigDecimal getFccrMoneda() {
        return this.fccrMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFccrImpMoneda(BigDecimal fccrImpMoneda) {
        this.fccrImpMoneda = fccrImpMoneda;
    }

    public BigDecimal getFccrImpMoneda() {
        return this.fccrImpMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFccrTipoCambio(BigDecimal fccrTipoCambio) {
        this.fccrTipoCambio = fccrTipoCambio;
    }

    public BigDecimal getFccrTipoCambio() {
        return this.fccrTipoCambio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccrTexComentario(String fccrTexComentario) {
        this.fccrTexComentario = fccrTexComentario;
    }

    public String getFccrTexComentario() {
        return this.fccrTexComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFccrImpIntMora(BigDecimal fccrImpIntMora) {
        this.fccrImpIntMora = fccrImpIntMora;
    }

    public BigDecimal getFccrImpIntMora() {
        return this.fccrImpIntMora;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccrAntSaldo(String fccrAntSaldo) {
        this.fccrAntSaldo = fccrAntSaldo;
    }

    public String getFccrAntSaldo() {
        return this.fccrAntSaldo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccrStPago(String fccrStPago) {
        this.fccrStPago = fccrStPago;
    }

    public String getFccrStPago() {
        return this.fccrStPago;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CALCRED ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFccrIdFideicomiso() != null && this.getFccrIdFideicomiso().longValue() == -999) {
            conditions += " AND FCCR_ID_FIDEICOMISO IS NULL";
        } else if (this.getFccrIdFideicomiso() != null) {
            conditions += " AND FCCR_ID_FIDEICOMISO = ?";
            values.add(this.getFccrIdFideicomiso());
        }

        if (this.getFccrIdCredito() != null && this.getFccrIdCredito().longValue() == -999) {
            conditions += " AND FCCR_ID_CREDITO IS NULL";
        } else if (this.getFccrIdCredito() != null) {
            conditions += " AND FCCR_ID_CREDITO = ?";
            values.add(this.getFccrIdCredito());
        }

        if (this.getFccrIdPago() != null && "null".equals(this.getFccrIdPago())) {
            conditions += " AND FCCR_ID_PAGO IS NULL";
        } else if (this.getFccrIdPago() != null) {
            conditions += " AND FCCR_ID_PAGO = ?";
            values.add(this.getFccrIdPago());
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
        String sql = "SELECT * FROM F_CALCRED ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFccrIdFideicomiso() != null && this.getFccrIdFideicomiso().longValue() == -999) {
            conditions += " AND FCCR_ID_FIDEICOMISO IS NULL";
        } else if (this.getFccrIdFideicomiso() != null) {
            conditions += " AND FCCR_ID_FIDEICOMISO = ?";
            values.add(this.getFccrIdFideicomiso());
        }

        if (this.getFccrIdCredito() != null && this.getFccrIdCredito().longValue() == -999) {
            conditions += " AND FCCR_ID_CREDITO IS NULL";
        } else if (this.getFccrIdCredito() != null) {
            conditions += " AND FCCR_ID_CREDITO = ?";
            values.add(this.getFccrIdCredito());
        }

        if (this.getFccrIdPago() != null && "null".equals(this.getFccrIdPago())) {
            conditions += " AND FCCR_ID_PAGO IS NULL";
        } else if (this.getFccrIdPago() != null) {
            conditions += " AND FCCR_ID_PAGO = ?";
            values.add(this.getFccrIdPago());
        }

        if (this.getFccrFechaPago() != null && "null".equals(this.getFccrFechaPago())) {
            conditions += " AND FCCR_FECHA_PAGO IS NULL";
        } else if (this.getFccrFechaPago() != null) {
            conditions += " AND FCCR_FECHA_PAGO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFccrFechaPago());
        }

        if (this.getFccrImpPago() != null && this.getFccrImpPago().longValue() == -999) {
            conditions += " AND FCCR_IMP_PAGO IS NULL";
        } else if (this.getFccrImpPago() != null) {
            conditions += " AND FCCR_IMP_PAGO = ?";
            values.add(this.getFccrImpPago());
        }

        if (this.getFccrImpCapital() != null && this.getFccrImpCapital().longValue() == -999) {
            conditions += " AND FCCR_IMP_CAPITAL IS NULL";
        } else if (this.getFccrImpCapital() != null) {
            conditions += " AND FCCR_IMP_CAPITAL = ?";
            values.add(this.getFccrImpCapital());
        }

        if (this.getFccrImpIntereses() != null && this.getFccrImpIntereses().longValue() == -999) {
            conditions += " AND FCCR_IMP_INTERESES IS NULL";
        } else if (this.getFccrImpIntereses() != null) {
            conditions += " AND FCCR_IMP_INTERESES = ?";
            values.add(this.getFccrImpIntereses());
        }

        if (this.getFccrFecPagado() != null && "null".equals(this.getFccrFecPagado())) {
            conditions += " AND FCCR_FEC_PAGADO IS NULL";
        } else if (this.getFccrFecPagado() != null) {
            conditions += " AND FCCR_FEC_PAGADO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFccrFecPagado());
        }

        if (this.getFccrTasa() != null && this.getFccrTasa().longValue() == -999) {
            conditions += " AND FCCR_TASA IS NULL";
        } else if (this.getFccrTasa() != null) {
            conditions += " AND FCCR_TASA = ?";
            values.add(this.getFccrTasa());
        }

        if (this.getFccrMoneda() != null && this.getFccrMoneda().longValue() == -999) {
            conditions += " AND FCCR_MONEDA IS NULL";
        } else if (this.getFccrMoneda() != null) {
            conditions += " AND FCCR_MONEDA = ?";
            values.add(this.getFccrMoneda());
        }

        if (this.getFccrImpMoneda() != null && this.getFccrImpMoneda().longValue() == -999) {
            conditions += " AND FCCR_IMP_MONEDA IS NULL";
        } else if (this.getFccrImpMoneda() != null) {
            conditions += " AND FCCR_IMP_MONEDA = ?";
            values.add(this.getFccrImpMoneda());
        }

        if (this.getFccrTipoCambio() != null && this.getFccrTipoCambio().longValue() == -999) {
            conditions += " AND FCCR_TIPO_CAMBIO IS NULL";
        } else if (this.getFccrTipoCambio() != null) {
            conditions += " AND FCCR_TIPO_CAMBIO = ?";
            values.add(this.getFccrTipoCambio());
        }

        if (this.getFccrTexComentario() != null && "null".equals(this.getFccrTexComentario())) {
            conditions += " AND FCCR_TEX_COMENTARIO IS NULL";
        } else if (this.getFccrTexComentario() != null) {
            conditions += " AND FCCR_TEX_COMENTARIO = ?";
            values.add(this.getFccrTexComentario());
        }

        if (this.getFccrImpIntMora() != null && this.getFccrImpIntMora().longValue() == -999) {
            conditions += " AND FCCR_IMP_INT_MORA IS NULL";
        } else if (this.getFccrImpIntMora() != null) {
            conditions += " AND FCCR_IMP_INT_MORA = ?";
            values.add(this.getFccrImpIntMora());
        }

        if (this.getFccrAntSaldo() != null && "null".equals(this.getFccrAntSaldo())) {
            conditions += " AND FCCR_ANT_SALDO IS NULL";
        } else if (this.getFccrAntSaldo() != null) {
            conditions += " AND FCCR_ANT_SALDO = ?";
            values.add(this.getFccrAntSaldo());
        }

        if (this.getFccrStPago() != null && "null".equals(this.getFccrStPago())) {
            conditions += " AND FCCR_ST_PAGO IS NULL";
        } else if (this.getFccrStPago() != null) {
            conditions += " AND FCCR_ST_PAGO = ?";
            values.add(this.getFccrStPago());
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
        String sql = "UPDATE F_CALCRED SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCCR_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFccrIdFideicomiso());
        conditions += " AND FCCR_ID_CREDITO = ?";
        pkValues.add(this.getFccrIdCredito());
        conditions += " AND FCCR_ID_PAGO = ?";
        pkValues.add(this.getFccrIdPago());
        fields += " FCCR_FECHA_PAGO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFccrFechaPago());
        fields += " FCCR_IMP_PAGO = ?, ";
        values.add(this.getFccrImpPago());
        fields += " FCCR_IMP_CAPITAL = ?, ";
        values.add(this.getFccrImpCapital());
        fields += " FCCR_IMP_INTERESES = ?, ";
        values.add(this.getFccrImpIntereses());
        fields += " FCCR_FEC_PAGADO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFccrFecPagado());
        fields += " FCCR_TASA = ?, ";
        values.add(this.getFccrTasa());
        fields += " FCCR_MONEDA = ?, ";
        values.add(this.getFccrMoneda());
        fields += " FCCR_IMP_MONEDA = ?, ";
        values.add(this.getFccrImpMoneda());
        fields += " FCCR_TIPO_CAMBIO = ?, ";
        values.add(this.getFccrTipoCambio());
        fields += " FCCR_TEX_COMENTARIO = ?, ";
        values.add(this.getFccrTexComentario());
        fields += " FCCR_IMP_INT_MORA = ?, ";
        values.add(this.getFccrImpIntMora());
        fields += " FCCR_ANT_SALDO = ?, ";
        values.add(this.getFccrAntSaldo());
        fields += " FCCR_ST_PAGO = ?, ";
        values.add(this.getFccrStPago());
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
        String sql = "INSERT INTO F_CALCRED ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCCR_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFccrIdFideicomiso());

        fields += ", FCCR_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFccrIdCredito());

        fields += ", FCCR_ID_PAGO";
        fieldValues += ", ?";
        values.add(this.getFccrIdPago());

        fields += ", FCCR_FECHA_PAGO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFccrFechaPago());

        fields += ", FCCR_IMP_PAGO";
        fieldValues += ", ?";
        values.add(this.getFccrImpPago());

        fields += ", FCCR_IMP_CAPITAL";
        fieldValues += ", ?";
        values.add(this.getFccrImpCapital());

        fields += ", FCCR_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getFccrImpIntereses());

        fields += ", FCCR_FEC_PAGADO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFccrFecPagado());

        fields += ", FCCR_TASA";
        fieldValues += ", ?";
        values.add(this.getFccrTasa());

        fields += ", FCCR_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFccrMoneda());

        fields += ", FCCR_IMP_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFccrImpMoneda());

        fields += ", FCCR_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getFccrTipoCambio());

        fields += ", FCCR_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFccrTexComentario());

        fields += ", FCCR_IMP_INT_MORA";
        fieldValues += ", ?";
        values.add(this.getFccrImpIntMora());

        fields += ", FCCR_ANT_SALDO";
        fieldValues += ", ?";
        values.add(this.getFccrAntSaldo());

        fields += ", FCCR_ST_PAGO";
        fieldValues += ", ?";
        values.add(this.getFccrStPago());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CALCRED WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCCR_ID_FIDEICOMISO = ?";
        values.add(this.getFccrIdFideicomiso());
        conditions += " AND FCCR_ID_CREDITO = ?";
        values.add(this.getFccrIdCredito());
        conditions += " AND FCCR_ID_PAGO = ?";
        values.add(this.getFccrIdPago());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCalcred instance = (FCalcred) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFccrIdFideicomiso().equals(instance.getFccrIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFccrIdCredito().equals(instance.getFccrIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFccrIdPago().equals(instance.getFccrIdPago()))
            equalObjects = false;
        if (equalObjects && !this.getFccrFechaPago().equals(instance.getFccrFechaPago()))
            equalObjects = false;
        if (equalObjects && !this.getFccrImpPago().equals(instance.getFccrImpPago()))
            equalObjects = false;
        if (equalObjects && !this.getFccrImpCapital().equals(instance.getFccrImpCapital()))
            equalObjects = false;
        if (equalObjects && !this.getFccrImpIntereses().equals(instance.getFccrImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getFccrFecPagado().equals(instance.getFccrFecPagado()))
            equalObjects = false;
        if (equalObjects && !this.getFccrTasa().equals(instance.getFccrTasa()))
            equalObjects = false;
        if (equalObjects && !this.getFccrMoneda().equals(instance.getFccrMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFccrImpMoneda().equals(instance.getFccrImpMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFccrTipoCambio().equals(instance.getFccrTipoCambio()))
            equalObjects = false;
        if (equalObjects && !this.getFccrTexComentario().equals(instance.getFccrTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFccrImpIntMora().equals(instance.getFccrImpIntMora()))
            equalObjects = false;
        if (equalObjects && !this.getFccrAntSaldo().equals(instance.getFccrAntSaldo()))
            equalObjects = false;
        if (equalObjects && !this.getFccrStPago().equals(instance.getFccrStPago()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCalcred result = new FCalcred();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFccrIdFideicomiso((BigDecimal) objectData.getData("FCCR_ID_FIDEICOMISO"));
        result.setFccrIdCredito((BigDecimal) objectData.getData("FCCR_ID_CREDITO"));
        result.setFccrIdPago((String) objectData.getData("FCCR_ID_PAGO"));
        result.setFccrFechaPago((String) objectData.getData("FCCR_FECHA_PAGO"));
        result.setFccrImpPago((BigDecimal) objectData.getData("FCCR_IMP_PAGO"));
        result.setFccrImpCapital((BigDecimal) objectData.getData("FCCR_IMP_CAPITAL"));
        result.setFccrImpIntereses((BigDecimal) objectData.getData("FCCR_IMP_INTERESES"));
        result.setFccrFecPagado((String) objectData.getData("FCCR_FEC_PAGADO"));
        result.setFccrTasa((BigDecimal) objectData.getData("FCCR_TASA"));
        result.setFccrMoneda((BigDecimal) objectData.getData("FCCR_MONEDA"));
        result.setFccrImpMoneda((BigDecimal) objectData.getData("FCCR_IMP_MONEDA"));
        result.setFccrTipoCambio((BigDecimal) objectData.getData("FCCR_TIPO_CAMBIO"));
        result.setFccrTexComentario((String) objectData.getData("FCCR_TEX_COMENTARIO"));
        result.setFccrImpIntMora((BigDecimal) objectData.getData("FCCR_IMP_INT_MORA"));
        result.setFccrAntSaldo((String) objectData.getData("FCCR_ANT_SALDO"));
        result.setFccrStPago((String) objectData.getData("FCCR_ST_PAGO"));

        return result;

    }

}
