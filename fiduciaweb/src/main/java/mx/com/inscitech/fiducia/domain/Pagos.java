package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PAGOS_PK", columns = { "PGS_NUM_PAGO" }, sequences = { "MAX" })
public class Pagos extends DomainObject {

    BigDecimal pgsNumPago = null;
    String pgsOtprinc = null;
    String pgsTurno = null;
    String pgsNumSolicitud = null;
    BigDecimal pgsNumPerito = null;
    String pgsConcepto = null;
    BigDecimal pgsMontoPago = null;
    String pgsPagoDe = null;
    BigDecimal pgsPagoIsr = null;
    BigDecimal pgsPagoIva = null;
    String pgsFactura = null;
    String pgsRecibo = null;
    BigDecimal pgsAnoAltaReg = null;
    BigDecimal pgsMesAltaReg = null;
    BigDecimal pgsDiaAltaReg = null;
    BigDecimal pgsAnoUltMod = null;
    BigDecimal pgsMesUltMod = null;
    BigDecimal pgsDiaUltMod = null;

    public Pagos() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPgsNumPago(BigDecimal pgsNumPago) {
        this.pgsNumPago = pgsNumPago;
    }

    public BigDecimal getPgsNumPago() {
        return this.pgsNumPago;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPgsOtprinc(String pgsOtprinc) {
        this.pgsOtprinc = pgsOtprinc;
    }

    public String getPgsOtprinc() {
        return this.pgsOtprinc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPgsTurno(String pgsTurno) {
        this.pgsTurno = pgsTurno;
    }

    public String getPgsTurno() {
        return this.pgsTurno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPgsNumSolicitud(String pgsNumSolicitud) {
        this.pgsNumSolicitud = pgsNumSolicitud;
    }

    public String getPgsNumSolicitud() {
        return this.pgsNumSolicitud;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPgsNumPerito(BigDecimal pgsNumPerito) {
        this.pgsNumPerito = pgsNumPerito;
    }

    public BigDecimal getPgsNumPerito() {
        return this.pgsNumPerito;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPgsConcepto(String pgsConcepto) {
        this.pgsConcepto = pgsConcepto;
    }

    public String getPgsConcepto() {
        return this.pgsConcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPgsMontoPago(BigDecimal pgsMontoPago) {
        this.pgsMontoPago = pgsMontoPago;
    }

    public BigDecimal getPgsMontoPago() {
        return this.pgsMontoPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPgsPagoDe(String pgsPagoDe) {
        this.pgsPagoDe = pgsPagoDe;
    }

    public String getPgsPagoDe() {
        return this.pgsPagoDe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPgsPagoIsr(BigDecimal pgsPagoIsr) {
        this.pgsPagoIsr = pgsPagoIsr;
    }

    public BigDecimal getPgsPagoIsr() {
        return this.pgsPagoIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPgsPagoIva(BigDecimal pgsPagoIva) {
        this.pgsPagoIva = pgsPagoIva;
    }

    public BigDecimal getPgsPagoIva() {
        return this.pgsPagoIva;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPgsFactura(String pgsFactura) {
        this.pgsFactura = pgsFactura;
    }

    public String getPgsFactura() {
        return this.pgsFactura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPgsRecibo(String pgsRecibo) {
        this.pgsRecibo = pgsRecibo;
    }

    public String getPgsRecibo() {
        return this.pgsRecibo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPgsAnoAltaReg(BigDecimal pgsAnoAltaReg) {
        this.pgsAnoAltaReg = pgsAnoAltaReg;
    }

    public BigDecimal getPgsAnoAltaReg() {
        return this.pgsAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPgsMesAltaReg(BigDecimal pgsMesAltaReg) {
        this.pgsMesAltaReg = pgsMesAltaReg;
    }

    public BigDecimal getPgsMesAltaReg() {
        return this.pgsMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPgsDiaAltaReg(BigDecimal pgsDiaAltaReg) {
        this.pgsDiaAltaReg = pgsDiaAltaReg;
    }

    public BigDecimal getPgsDiaAltaReg() {
        return this.pgsDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPgsAnoUltMod(BigDecimal pgsAnoUltMod) {
        this.pgsAnoUltMod = pgsAnoUltMod;
    }

    public BigDecimal getPgsAnoUltMod() {
        return this.pgsAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPgsMesUltMod(BigDecimal pgsMesUltMod) {
        this.pgsMesUltMod = pgsMesUltMod;
    }

    public BigDecimal getPgsMesUltMod() {
        return this.pgsMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPgsDiaUltMod(BigDecimal pgsDiaUltMod) {
        this.pgsDiaUltMod = pgsDiaUltMod;
    }

    public BigDecimal getPgsDiaUltMod() {
        return this.pgsDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PAGOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPgsNumPago() != null && this.getPgsNumPago().longValue() == -999) {
            conditions += " AND PGS_NUM_PAGO IS NULL";
        } else if (this.getPgsNumPago() != null) {
            conditions += " AND PGS_NUM_PAGO = ?";
            values.add(this.getPgsNumPago());
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
        String sql = "SELECT * FROM PAGOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPgsNumPago() != null && this.getPgsNumPago().longValue() == -999) {
            conditions += " AND PGS_NUM_PAGO IS NULL";
        } else if (this.getPgsNumPago() != null) {
            conditions += " AND PGS_NUM_PAGO = ?";
            values.add(this.getPgsNumPago());
        }

        if (this.getPgsOtprinc() != null && "null".equals(this.getPgsOtprinc())) {
            conditions += " AND PGS_OTPRINC IS NULL";
        } else if (this.getPgsOtprinc() != null) {
            conditions += " AND PGS_OTPRINC = ?";
            values.add(this.getPgsOtprinc());
        }

        if (this.getPgsTurno() != null && "null".equals(this.getPgsTurno())) {
            conditions += " AND PGS_TURNO IS NULL";
        } else if (this.getPgsTurno() != null) {
            conditions += " AND PGS_TURNO = ?";
            values.add(this.getPgsTurno());
        }

        if (this.getPgsNumSolicitud() != null && "null".equals(this.getPgsNumSolicitud())) {
            conditions += " AND PGS_NUM_SOLICITUD IS NULL";
        } else if (this.getPgsNumSolicitud() != null) {
            conditions += " AND PGS_NUM_SOLICITUD = ?";
            values.add(this.getPgsNumSolicitud());
        }

        if (this.getPgsNumPerito() != null && this.getPgsNumPerito().longValue() == -999) {
            conditions += " AND PGS_NUM_PERITO IS NULL";
        } else if (this.getPgsNumPerito() != null) {
            conditions += " AND PGS_NUM_PERITO = ?";
            values.add(this.getPgsNumPerito());
        }

        if (this.getPgsConcepto() != null && "null".equals(this.getPgsConcepto())) {
            conditions += " AND PGS_CONCEPTO IS NULL";
        } else if (this.getPgsConcepto() != null) {
            conditions += " AND PGS_CONCEPTO = ?";
            values.add(this.getPgsConcepto());
        }

        if (this.getPgsMontoPago() != null && this.getPgsMontoPago().longValue() == -999) {
            conditions += " AND PGS_MONTO_PAGO IS NULL";
        } else if (this.getPgsMontoPago() != null) {
            conditions += " AND PGS_MONTO_PAGO = ?";
            values.add(this.getPgsMontoPago());
        }

        if (this.getPgsPagoDe() != null && "null".equals(this.getPgsPagoDe())) {
            conditions += " AND PGS_PAGO_DE IS NULL";
        } else if (this.getPgsPagoDe() != null) {
            conditions += " AND PGS_PAGO_DE = ?";
            values.add(this.getPgsPagoDe());
        }

        if (this.getPgsPagoIsr() != null && this.getPgsPagoIsr().longValue() == -999) {
            conditions += " AND PGS_PAGO_ISR IS NULL";
        } else if (this.getPgsPagoIsr() != null) {
            conditions += " AND PGS_PAGO_ISR = ?";
            values.add(this.getPgsPagoIsr());
        }

        if (this.getPgsPagoIva() != null && this.getPgsPagoIva().longValue() == -999) {
            conditions += " AND PGS_PAGO_IVA IS NULL";
        } else if (this.getPgsPagoIva() != null) {
            conditions += " AND PGS_PAGO_IVA = ?";
            values.add(this.getPgsPagoIva());
        }

        if (this.getPgsFactura() != null && "null".equals(this.getPgsFactura())) {
            conditions += " AND PGS_FACTURA IS NULL";
        } else if (this.getPgsFactura() != null) {
            conditions += " AND PGS_FACTURA = ?";
            values.add(this.getPgsFactura());
        }

        if (this.getPgsRecibo() != null && "null".equals(this.getPgsRecibo())) {
            conditions += " AND PGS_RECIBO IS NULL";
        } else if (this.getPgsRecibo() != null) {
            conditions += " AND PGS_RECIBO = ?";
            values.add(this.getPgsRecibo());
        }

        if (this.getPgsAnoAltaReg() != null && this.getPgsAnoAltaReg().longValue() == -999) {
            conditions += " AND PGS_ANO_ALTA_REG IS NULL";
        } else if (this.getPgsAnoAltaReg() != null) {
            conditions += " AND PGS_ANO_ALTA_REG = ?";
            values.add(this.getPgsAnoAltaReg());
        }

        if (this.getPgsMesAltaReg() != null && this.getPgsMesAltaReg().longValue() == -999) {
            conditions += " AND PGS_MES_ALTA_REG IS NULL";
        } else if (this.getPgsMesAltaReg() != null) {
            conditions += " AND PGS_MES_ALTA_REG = ?";
            values.add(this.getPgsMesAltaReg());
        }

        if (this.getPgsDiaAltaReg() != null && this.getPgsDiaAltaReg().longValue() == -999) {
            conditions += " AND PGS_DIA_ALTA_REG IS NULL";
        } else if (this.getPgsDiaAltaReg() != null) {
            conditions += " AND PGS_DIA_ALTA_REG = ?";
            values.add(this.getPgsDiaAltaReg());
        }

        if (this.getPgsAnoUltMod() != null && this.getPgsAnoUltMod().longValue() == -999) {
            conditions += " AND PGS_ANO_ULT_MOD IS NULL";
        } else if (this.getPgsAnoUltMod() != null) {
            conditions += " AND PGS_ANO_ULT_MOD = ?";
            values.add(this.getPgsAnoUltMod());
        }

        if (this.getPgsMesUltMod() != null && this.getPgsMesUltMod().longValue() == -999) {
            conditions += " AND PGS_MES_ULT_MOD IS NULL";
        } else if (this.getPgsMesUltMod() != null) {
            conditions += " AND PGS_MES_ULT_MOD = ?";
            values.add(this.getPgsMesUltMod());
        }

        if (this.getPgsDiaUltMod() != null && this.getPgsDiaUltMod().longValue() == -999) {
            conditions += " AND PGS_DIA_ULT_MOD IS NULL";
        } else if (this.getPgsDiaUltMod() != null) {
            conditions += " AND PGS_DIA_ULT_MOD = ?";
            values.add(this.getPgsDiaUltMod());
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
        String sql = "UPDATE PAGOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PGS_NUM_PAGO = ?";
        pkValues.add(this.getPgsNumPago());
        fields += " PGS_OTPRINC = ?, ";
        values.add(this.getPgsOtprinc());
        fields += " PGS_TURNO = ?, ";
        values.add(this.getPgsTurno());
        fields += " PGS_NUM_SOLICITUD = ?, ";
        values.add(this.getPgsNumSolicitud());
        fields += " PGS_NUM_PERITO = ?, ";
        values.add(this.getPgsNumPerito());
        fields += " PGS_CONCEPTO = ?, ";
        values.add(this.getPgsConcepto());
        fields += " PGS_MONTO_PAGO = ?, ";
        values.add(this.getPgsMontoPago());
        fields += " PGS_PAGO_DE = ?, ";
        values.add(this.getPgsPagoDe());
        fields += " PGS_PAGO_ISR = ?, ";
        values.add(this.getPgsPagoIsr());
        fields += " PGS_PAGO_IVA = ?, ";
        values.add(this.getPgsPagoIva());
        fields += " PGS_FACTURA = ?, ";
        values.add(this.getPgsFactura());
        fields += " PGS_RECIBO = ?, ";
        values.add(this.getPgsRecibo());
        fields += " PGS_ANO_ALTA_REG = ?, ";
        values.add(this.getPgsAnoAltaReg());
        fields += " PGS_MES_ALTA_REG = ?, ";
        values.add(this.getPgsMesAltaReg());
        fields += " PGS_DIA_ALTA_REG = ?, ";
        values.add(this.getPgsDiaAltaReg());
        fields += " PGS_ANO_ULT_MOD = ?, ";
        values.add(this.getPgsAnoUltMod());
        fields += " PGS_MES_ULT_MOD = ?, ";
        values.add(this.getPgsMesUltMod());
        fields += " PGS_DIA_ULT_MOD = ?, ";
        values.add(this.getPgsDiaUltMod());
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
        String sql = "INSERT INTO PAGOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PGS_NUM_PAGO";
        fieldValues += ", ?";
        values.add(this.getPgsNumPago());

        fields += ", PGS_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getPgsOtprinc());

        fields += ", PGS_TURNO";
        fieldValues += ", ?";
        values.add(this.getPgsTurno());

        fields += ", PGS_NUM_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getPgsNumSolicitud());

        fields += ", PGS_NUM_PERITO";
        fieldValues += ", ?";
        values.add(this.getPgsNumPerito());

        fields += ", PGS_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getPgsConcepto());

        fields += ", PGS_MONTO_PAGO";
        fieldValues += ", ?";
        values.add(this.getPgsMontoPago());

        fields += ", PGS_PAGO_DE";
        fieldValues += ", ?";
        values.add(this.getPgsPagoDe());

        fields += ", PGS_PAGO_ISR";
        fieldValues += ", ?";
        values.add(this.getPgsPagoIsr());

        fields += ", PGS_PAGO_IVA";
        fieldValues += ", ?";
        values.add(this.getPgsPagoIva());

        fields += ", PGS_FACTURA";
        fieldValues += ", ?";
        values.add(this.getPgsFactura());

        fields += ", PGS_RECIBO";
        fieldValues += ", ?";
        values.add(this.getPgsRecibo());

        fields += ", PGS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPgsAnoAltaReg());

        fields += ", PGS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPgsMesAltaReg());

        fields += ", PGS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPgsDiaAltaReg());

        fields += ", PGS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPgsAnoUltMod());

        fields += ", PGS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPgsMesUltMod());

        fields += ", PGS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPgsDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PAGOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PGS_NUM_PAGO = ?";
        values.add(this.getPgsNumPago());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Pagos instance = (Pagos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPgsNumPago().equals(instance.getPgsNumPago()))
            equalObjects = false;
        if (equalObjects && !this.getPgsOtprinc().equals(instance.getPgsOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getPgsTurno().equals(instance.getPgsTurno()))
            equalObjects = false;
        if (equalObjects && !this.getPgsNumSolicitud().equals(instance.getPgsNumSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getPgsNumPerito().equals(instance.getPgsNumPerito()))
            equalObjects = false;
        if (equalObjects && !this.getPgsConcepto().equals(instance.getPgsConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getPgsMontoPago().equals(instance.getPgsMontoPago()))
            equalObjects = false;
        if (equalObjects && !this.getPgsPagoDe().equals(instance.getPgsPagoDe()))
            equalObjects = false;
        if (equalObjects && !this.getPgsPagoIsr().equals(instance.getPgsPagoIsr()))
            equalObjects = false;
        if (equalObjects && !this.getPgsPagoIva().equals(instance.getPgsPagoIva()))
            equalObjects = false;
        if (equalObjects && !this.getPgsFactura().equals(instance.getPgsFactura()))
            equalObjects = false;
        if (equalObjects && !this.getPgsRecibo().equals(instance.getPgsRecibo()))
            equalObjects = false;
        if (equalObjects && !this.getPgsAnoAltaReg().equals(instance.getPgsAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPgsMesAltaReg().equals(instance.getPgsMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPgsDiaAltaReg().equals(instance.getPgsDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPgsAnoUltMod().equals(instance.getPgsAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPgsMesUltMod().equals(instance.getPgsMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPgsDiaUltMod().equals(instance.getPgsDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Pagos result = new Pagos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPgsNumPago((BigDecimal) objectData.getData("PGS_NUM_PAGO"));
        result.setPgsOtprinc((String) objectData.getData("PGS_OTPRINC"));
        result.setPgsTurno((String) objectData.getData("PGS_TURNO"));
        result.setPgsNumSolicitud((String) objectData.getData("PGS_NUM_SOLICITUD"));
        result.setPgsNumPerito((BigDecimal) objectData.getData("PGS_NUM_PERITO"));
        result.setPgsConcepto((String) objectData.getData("PGS_CONCEPTO"));
        result.setPgsMontoPago((BigDecimal) objectData.getData("PGS_MONTO_PAGO"));
        result.setPgsPagoDe((String) objectData.getData("PGS_PAGO_DE"));
        result.setPgsPagoIsr((BigDecimal) objectData.getData("PGS_PAGO_ISR"));
        result.setPgsPagoIva((BigDecimal) objectData.getData("PGS_PAGO_IVA"));
        result.setPgsFactura((String) objectData.getData("PGS_FACTURA"));
        result.setPgsRecibo((String) objectData.getData("PGS_RECIBO"));
        result.setPgsAnoAltaReg((BigDecimal) objectData.getData("PGS_ANO_ALTA_REG"));
        result.setPgsMesAltaReg((BigDecimal) objectData.getData("PGS_MES_ALTA_REG"));
        result.setPgsDiaAltaReg((BigDecimal) objectData.getData("PGS_DIA_ALTA_REG"));
        result.setPgsAnoUltMod((BigDecimal) objectData.getData("PGS_ANO_ULT_MOD"));
        result.setPgsMesUltMod((BigDecimal) objectData.getData("PGS_MES_ULT_MOD"));
        result.setPgsDiaUltMod((BigDecimal) objectData.getData("PGS_DIA_ULT_MOD"));

        return result;

    }

}
