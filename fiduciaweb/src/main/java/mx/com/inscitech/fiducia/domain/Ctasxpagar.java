package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTASXPAGAR_PK", columns = { "CPP_NUM_PERITO", "CPP_OTPRINC" }, sequences = { "MANUAL" })
public class Ctasxpagar extends DomainObject {

    BigDecimal cppNumPerito = null;
    String cppOtprinc = null;
    String cppTurno = null;
    String cppNumFactura = null;
    String cppFecFactura = null;
    BigDecimal cppImportePago = null;
    BigDecimal cppImpViaticos = null;
    BigDecimal cppSaldo = null;
    String cppConcepto = null;
    BigDecimal cppAnoAltaReg = null;
    BigDecimal cppMesAltaReg = null;
    BigDecimal cppDiaAltaReg = null;
    BigDecimal cppAnoUltMod = null;
    BigDecimal cppMesUltMod = null;
    BigDecimal cppDiaUltMod = null;
    String cppCveStPagos = null;

    public Ctasxpagar() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCppNumPerito(BigDecimal cppNumPerito) {
        this.cppNumPerito = cppNumPerito;
    }

    public BigDecimal getCppNumPerito() {
        return this.cppNumPerito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCppOtprinc(String cppOtprinc) {
        this.cppOtprinc = cppOtprinc;
    }

    public String getCppOtprinc() {
        return this.cppOtprinc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCppTurno(String cppTurno) {
        this.cppTurno = cppTurno;
    }

    public String getCppTurno() {
        return this.cppTurno;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCppNumFactura(String cppNumFactura) {
        this.cppNumFactura = cppNumFactura;
    }

    public String getCppNumFactura() {
        return this.cppNumFactura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCppFecFactura(String cppFecFactura) {
        this.cppFecFactura = cppFecFactura;
    }

    public String getCppFecFactura() {
        return this.cppFecFactura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCppImportePago(BigDecimal cppImportePago) {
        this.cppImportePago = cppImportePago;
    }

    public BigDecimal getCppImportePago() {
        return this.cppImportePago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCppImpViaticos(BigDecimal cppImpViaticos) {
        this.cppImpViaticos = cppImpViaticos;
    }

    public BigDecimal getCppImpViaticos() {
        return this.cppImpViaticos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCppSaldo(BigDecimal cppSaldo) {
        this.cppSaldo = cppSaldo;
    }

    public BigDecimal getCppSaldo() {
        return this.cppSaldo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCppConcepto(String cppConcepto) {
        this.cppConcepto = cppConcepto;
    }

    public String getCppConcepto() {
        return this.cppConcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCppAnoAltaReg(BigDecimal cppAnoAltaReg) {
        this.cppAnoAltaReg = cppAnoAltaReg;
    }

    public BigDecimal getCppAnoAltaReg() {
        return this.cppAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCppMesAltaReg(BigDecimal cppMesAltaReg) {
        this.cppMesAltaReg = cppMesAltaReg;
    }

    public BigDecimal getCppMesAltaReg() {
        return this.cppMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCppDiaAltaReg(BigDecimal cppDiaAltaReg) {
        this.cppDiaAltaReg = cppDiaAltaReg;
    }

    public BigDecimal getCppDiaAltaReg() {
        return this.cppDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCppAnoUltMod(BigDecimal cppAnoUltMod) {
        this.cppAnoUltMod = cppAnoUltMod;
    }

    public BigDecimal getCppAnoUltMod() {
        return this.cppAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCppMesUltMod(BigDecimal cppMesUltMod) {
        this.cppMesUltMod = cppMesUltMod;
    }

    public BigDecimal getCppMesUltMod() {
        return this.cppMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCppDiaUltMod(BigDecimal cppDiaUltMod) {
        this.cppDiaUltMod = cppDiaUltMod;
    }

    public BigDecimal getCppDiaUltMod() {
        return this.cppDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCppCveStPagos(String cppCveStPagos) {
        this.cppCveStPagos = cppCveStPagos;
    }

    public String getCppCveStPagos() {
        return this.cppCveStPagos;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTASXPAGAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCppNumPerito() != null && this.getCppNumPerito().longValue() == -999) {
            conditions += " AND CPP_NUM_PERITO IS NULL";
        } else if (this.getCppNumPerito() != null) {
            conditions += " AND CPP_NUM_PERITO = ?";
            values.add(this.getCppNumPerito());
        }

        if (this.getCppOtprinc() != null && "null".equals(this.getCppOtprinc())) {
            conditions += " AND CPP_OTPRINC IS NULL";
        } else if (this.getCppOtprinc() != null) {
            conditions += " AND CPP_OTPRINC = ?";
            values.add(this.getCppOtprinc());
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
        String sql = "SELECT * FROM CTASXPAGAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCppNumPerito() != null && this.getCppNumPerito().longValue() == -999) {
            conditions += " AND CPP_NUM_PERITO IS NULL";
        } else if (this.getCppNumPerito() != null) {
            conditions += " AND CPP_NUM_PERITO = ?";
            values.add(this.getCppNumPerito());
        }

        if (this.getCppOtprinc() != null && "null".equals(this.getCppOtprinc())) {
            conditions += " AND CPP_OTPRINC IS NULL";
        } else if (this.getCppOtprinc() != null) {
            conditions += " AND CPP_OTPRINC = ?";
            values.add(this.getCppOtprinc());
        }

        if (this.getCppTurno() != null && "null".equals(this.getCppTurno())) {
            conditions += " AND CPP_TURNO IS NULL";
        } else if (this.getCppTurno() != null) {
            conditions += " AND CPP_TURNO = ?";
            values.add(this.getCppTurno());
        }

        if (this.getCppNumFactura() != null && "null".equals(this.getCppNumFactura())) {
            conditions += " AND CPP_NUM_FACTURA IS NULL";
        } else if (this.getCppNumFactura() != null) {
            conditions += " AND CPP_NUM_FACTURA = ?";
            values.add(this.getCppNumFactura());
        }

        if (this.getCppFecFactura() != null && "null".equals(this.getCppFecFactura())) {
            conditions += " AND CPP_FEC_FACTURA IS NULL";
        } else if (this.getCppFecFactura() != null) {
            conditions += " AND CPP_FEC_FACTURA = ?";
            values.add(this.getCppFecFactura());
        }

        if (this.getCppImportePago() != null && this.getCppImportePago().longValue() == -999) {
            conditions += " AND CPP_IMPORTE_PAGO IS NULL";
        } else if (this.getCppImportePago() != null) {
            conditions += " AND CPP_IMPORTE_PAGO = ?";
            values.add(this.getCppImportePago());
        }

        if (this.getCppImpViaticos() != null && this.getCppImpViaticos().longValue() == -999) {
            conditions += " AND CPP_IMP_VIATICOS IS NULL";
        } else if (this.getCppImpViaticos() != null) {
            conditions += " AND CPP_IMP_VIATICOS = ?";
            values.add(this.getCppImpViaticos());
        }

        if (this.getCppSaldo() != null && this.getCppSaldo().longValue() == -999) {
            conditions += " AND CPP_SALDO IS NULL";
        } else if (this.getCppSaldo() != null) {
            conditions += " AND CPP_SALDO = ?";
            values.add(this.getCppSaldo());
        }

        if (this.getCppConcepto() != null && "null".equals(this.getCppConcepto())) {
            conditions += " AND CPP_CONCEPTO IS NULL";
        } else if (this.getCppConcepto() != null) {
            conditions += " AND CPP_CONCEPTO = ?";
            values.add(this.getCppConcepto());
        }

        if (this.getCppAnoAltaReg() != null && this.getCppAnoAltaReg().longValue() == -999) {
            conditions += " AND CPP_ANO_ALTA_REG IS NULL";
        } else if (this.getCppAnoAltaReg() != null) {
            conditions += " AND CPP_ANO_ALTA_REG = ?";
            values.add(this.getCppAnoAltaReg());
        }

        if (this.getCppMesAltaReg() != null && this.getCppMesAltaReg().longValue() == -999) {
            conditions += " AND CPP_MES_ALTA_REG IS NULL";
        } else if (this.getCppMesAltaReg() != null) {
            conditions += " AND CPP_MES_ALTA_REG = ?";
            values.add(this.getCppMesAltaReg());
        }

        if (this.getCppDiaAltaReg() != null && this.getCppDiaAltaReg().longValue() == -999) {
            conditions += " AND CPP_DIA_ALTA_REG IS NULL";
        } else if (this.getCppDiaAltaReg() != null) {
            conditions += " AND CPP_DIA_ALTA_REG = ?";
            values.add(this.getCppDiaAltaReg());
        }

        if (this.getCppAnoUltMod() != null && this.getCppAnoUltMod().longValue() == -999) {
            conditions += " AND CPP_ANO_ULT_MOD IS NULL";
        } else if (this.getCppAnoUltMod() != null) {
            conditions += " AND CPP_ANO_ULT_MOD = ?";
            values.add(this.getCppAnoUltMod());
        }

        if (this.getCppMesUltMod() != null && this.getCppMesUltMod().longValue() == -999) {
            conditions += " AND CPP_MES_ULT_MOD IS NULL";
        } else if (this.getCppMesUltMod() != null) {
            conditions += " AND CPP_MES_ULT_MOD = ?";
            values.add(this.getCppMesUltMod());
        }

        if (this.getCppDiaUltMod() != null && this.getCppDiaUltMod().longValue() == -999) {
            conditions += " AND CPP_DIA_ULT_MOD IS NULL";
        } else if (this.getCppDiaUltMod() != null) {
            conditions += " AND CPP_DIA_ULT_MOD = ?";
            values.add(this.getCppDiaUltMod());
        }

        if (this.getCppCveStPagos() != null && "null".equals(this.getCppCveStPagos())) {
            conditions += " AND CPP_CVE_ST_PAGOS IS NULL";
        } else if (this.getCppCveStPagos() != null) {
            conditions += " AND CPP_CVE_ST_PAGOS = ?";
            values.add(this.getCppCveStPagos());
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
        String sql = "UPDATE CTASXPAGAR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPP_NUM_PERITO = ?";
        pkValues.add(this.getCppNumPerito());
        conditions += " AND CPP_OTPRINC = ?";
        pkValues.add(this.getCppOtprinc());
        fields += " CPP_TURNO = ?, ";
        values.add(this.getCppTurno());
        fields += " CPP_NUM_FACTURA = ?, ";
        values.add(this.getCppNumFactura());
        fields += " CPP_FEC_FACTURA = ?, ";
        values.add(this.getCppFecFactura());
        fields += " CPP_IMPORTE_PAGO = ?, ";
        values.add(this.getCppImportePago());
        fields += " CPP_IMP_VIATICOS = ?, ";
        values.add(this.getCppImpViaticos());
        fields += " CPP_SALDO = ?, ";
        values.add(this.getCppSaldo());
        fields += " CPP_CONCEPTO = ?, ";
        values.add(this.getCppConcepto());
        fields += " CPP_ANO_ALTA_REG = ?, ";
        values.add(this.getCppAnoAltaReg());
        fields += " CPP_MES_ALTA_REG = ?, ";
        values.add(this.getCppMesAltaReg());
        fields += " CPP_DIA_ALTA_REG = ?, ";
        values.add(this.getCppDiaAltaReg());
        fields += " CPP_ANO_ULT_MOD = ?, ";
        values.add(this.getCppAnoUltMod());
        fields += " CPP_MES_ULT_MOD = ?, ";
        values.add(this.getCppMesUltMod());
        fields += " CPP_DIA_ULT_MOD = ?, ";
        values.add(this.getCppDiaUltMod());
        fields += " CPP_CVE_ST_PAGOS = ?, ";
        values.add(this.getCppCveStPagos());
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
        String sql = "INSERT INTO CTASXPAGAR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPP_NUM_PERITO";
        fieldValues += ", ?";
        values.add(this.getCppNumPerito());

        fields += ", CPP_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getCppOtprinc());

        fields += ", CPP_TURNO";
        fieldValues += ", ?";
        values.add(this.getCppTurno());

        fields += ", CPP_NUM_FACTURA";
        fieldValues += ", ?";
        values.add(this.getCppNumFactura());

        fields += ", CPP_FEC_FACTURA";
        fieldValues += ", ?";
        values.add(this.getCppFecFactura());

        fields += ", CPP_IMPORTE_PAGO";
        fieldValues += ", ?";
        values.add(this.getCppImportePago());

        fields += ", CPP_IMP_VIATICOS";
        fieldValues += ", ?";
        values.add(this.getCppImpViaticos());

        fields += ", CPP_SALDO";
        fieldValues += ", ?";
        values.add(this.getCppSaldo());

        fields += ", CPP_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCppConcepto());

        fields += ", CPP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCppAnoAltaReg());

        fields += ", CPP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCppMesAltaReg());

        fields += ", CPP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCppDiaAltaReg());

        fields += ", CPP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCppAnoUltMod());

        fields += ", CPP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCppMesUltMod());

        fields += ", CPP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCppDiaUltMod());

        fields += ", CPP_CVE_ST_PAGOS";
        fieldValues += ", ?";
        values.add(this.getCppCveStPagos());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTASXPAGAR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPP_NUM_PERITO = ?";
        values.add(this.getCppNumPerito());
        conditions += " AND CPP_OTPRINC = ?";
        values.add(this.getCppOtprinc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctasxpagar instance = (Ctasxpagar) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCppNumPerito().equals(instance.getCppNumPerito()))
            equalObjects = false;
        if (equalObjects && !this.getCppOtprinc().equals(instance.getCppOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getCppTurno().equals(instance.getCppTurno()))
            equalObjects = false;
        if (equalObjects && !this.getCppNumFactura().equals(instance.getCppNumFactura()))
            equalObjects = false;
        if (equalObjects && !this.getCppFecFactura().equals(instance.getCppFecFactura()))
            equalObjects = false;
        if (equalObjects && !this.getCppImportePago().equals(instance.getCppImportePago()))
            equalObjects = false;
        if (equalObjects && !this.getCppImpViaticos().equals(instance.getCppImpViaticos()))
            equalObjects = false;
        if (equalObjects && !this.getCppSaldo().equals(instance.getCppSaldo()))
            equalObjects = false;
        if (equalObjects && !this.getCppConcepto().equals(instance.getCppConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCppAnoAltaReg().equals(instance.getCppAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCppMesAltaReg().equals(instance.getCppMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCppDiaAltaReg().equals(instance.getCppDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCppAnoUltMod().equals(instance.getCppAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCppMesUltMod().equals(instance.getCppMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCppDiaUltMod().equals(instance.getCppDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCppCveStPagos().equals(instance.getCppCveStPagos()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctasxpagar result = new Ctasxpagar();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCppNumPerito((BigDecimal) objectData.getData("CPP_NUM_PERITO"));
        result.setCppOtprinc((String) objectData.getData("CPP_OTPRINC"));
        result.setCppTurno((String) objectData.getData("CPP_TURNO"));
        result.setCppNumFactura((String) objectData.getData("CPP_NUM_FACTURA"));
        result.setCppFecFactura((String) objectData.getData("CPP_FEC_FACTURA"));
        result.setCppImportePago((BigDecimal) objectData.getData("CPP_IMPORTE_PAGO"));
        result.setCppImpViaticos((BigDecimal) objectData.getData("CPP_IMP_VIATICOS"));
        result.setCppSaldo((BigDecimal) objectData.getData("CPP_SALDO"));
        result.setCppConcepto((String) objectData.getData("CPP_CONCEPTO"));
        result.setCppAnoAltaReg((BigDecimal) objectData.getData("CPP_ANO_ALTA_REG"));
        result.setCppMesAltaReg((BigDecimal) objectData.getData("CPP_MES_ALTA_REG"));
        result.setCppDiaAltaReg((BigDecimal) objectData.getData("CPP_DIA_ALTA_REG"));
        result.setCppAnoUltMod((BigDecimal) objectData.getData("CPP_ANO_ULT_MOD"));
        result.setCppMesUltMod((BigDecimal) objectData.getData("CPP_MES_ULT_MOD"));
        result.setCppDiaUltMod((BigDecimal) objectData.getData("CPP_DIA_ULT_MOD"));
        result.setCppCveStPagos((String) objectData.getData("CPP_CVE_ST_PAGOS"));

        return result;

    }

}
