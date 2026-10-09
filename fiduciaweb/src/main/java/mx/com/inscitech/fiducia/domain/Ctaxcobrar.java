package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTAXCOBRAR_PK", columns = { "CPC_OTPRINC", "CPC_TURNO", "CPC_NUM_SOLICITUD" }, sequences = { "MANUAL" })
public class Ctaxcobrar extends DomainObject {

    String cpcOtprinc = null;
    String cpcTurno = null;
    String cpcNumSolicitud = null;
    BigDecimal cpcNumPerito = null;
    String cpcCliente = null;
    String cpcConcepto = null;
    String cpcNumFactura = null;
    String cpcFecFactura = null;
    BigDecimal cpcImpComision = null;
    BigDecimal cpcImpViaticos = null;
    BigDecimal cpcSaldo = null;
    BigDecimal cpcAnoAltaReg = null;
    BigDecimal cpcMesAltaReg = null;
    BigDecimal cpcDiaAltaReg = null;
    BigDecimal cpcAnoUltMod = null;
    BigDecimal cpcMesUltMod = null;
    BigDecimal cpcDiaUltMod = null;
    String cpcCveStCtcobra = null;

    public Ctaxcobrar() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpcOtprinc(String cpcOtprinc) {
        this.cpcOtprinc = cpcOtprinc;
    }

    public String getCpcOtprinc() {
        return this.cpcOtprinc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpcTurno(String cpcTurno) {
        this.cpcTurno = cpcTurno;
    }

    public String getCpcTurno() {
        return this.cpcTurno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpcNumSolicitud(String cpcNumSolicitud) {
        this.cpcNumSolicitud = cpcNumSolicitud;
    }

    public String getCpcNumSolicitud() {
        return this.cpcNumSolicitud;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpcNumPerito(BigDecimal cpcNumPerito) {
        this.cpcNumPerito = cpcNumPerito;
    }

    public BigDecimal getCpcNumPerito() {
        return this.cpcNumPerito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpcCliente(String cpcCliente) {
        this.cpcCliente = cpcCliente;
    }

    public String getCpcCliente() {
        return this.cpcCliente;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpcConcepto(String cpcConcepto) {
        this.cpcConcepto = cpcConcepto;
    }

    public String getCpcConcepto() {
        return this.cpcConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpcNumFactura(String cpcNumFactura) {
        this.cpcNumFactura = cpcNumFactura;
    }

    public String getCpcNumFactura() {
        return this.cpcNumFactura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpcFecFactura(String cpcFecFactura) {
        this.cpcFecFactura = cpcFecFactura;
    }

    public String getCpcFecFactura() {
        return this.cpcFecFactura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpcImpComision(BigDecimal cpcImpComision) {
        this.cpcImpComision = cpcImpComision;
    }

    public BigDecimal getCpcImpComision() {
        return this.cpcImpComision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpcImpViaticos(BigDecimal cpcImpViaticos) {
        this.cpcImpViaticos = cpcImpViaticos;
    }

    public BigDecimal getCpcImpViaticos() {
        return this.cpcImpViaticos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCpcSaldo(BigDecimal cpcSaldo) {
        this.cpcSaldo = cpcSaldo;
    }

    public BigDecimal getCpcSaldo() {
        return this.cpcSaldo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCpcAnoAltaReg(BigDecimal cpcAnoAltaReg) {
        this.cpcAnoAltaReg = cpcAnoAltaReg;
    }

    public BigDecimal getCpcAnoAltaReg() {
        return this.cpcAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpcMesAltaReg(BigDecimal cpcMesAltaReg) {
        this.cpcMesAltaReg = cpcMesAltaReg;
    }

    public BigDecimal getCpcMesAltaReg() {
        return this.cpcMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpcDiaAltaReg(BigDecimal cpcDiaAltaReg) {
        this.cpcDiaAltaReg = cpcDiaAltaReg;
    }

    public BigDecimal getCpcDiaAltaReg() {
        return this.cpcDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCpcAnoUltMod(BigDecimal cpcAnoUltMod) {
        this.cpcAnoUltMod = cpcAnoUltMod;
    }

    public BigDecimal getCpcAnoUltMod() {
        return this.cpcAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpcMesUltMod(BigDecimal cpcMesUltMod) {
        this.cpcMesUltMod = cpcMesUltMod;
    }

    public BigDecimal getCpcMesUltMod() {
        return this.cpcMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpcDiaUltMod(BigDecimal cpcDiaUltMod) {
        this.cpcDiaUltMod = cpcDiaUltMod;
    }

    public BigDecimal getCpcDiaUltMod() {
        return this.cpcDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpcCveStCtcobra(String cpcCveStCtcobra) {
        this.cpcCveStCtcobra = cpcCveStCtcobra;
    }

    public String getCpcCveStCtcobra() {
        return this.cpcCveStCtcobra;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTAXCOBRAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpcOtprinc() != null && "null".equals(this.getCpcOtprinc())) {
            conditions += " AND CPC_OTPRINC IS NULL";
        } else if (this.getCpcOtprinc() != null) {
            conditions += " AND CPC_OTPRINC = ?";
            values.add(this.getCpcOtprinc());
        }

        if (this.getCpcTurno() != null && "null".equals(this.getCpcTurno())) {
            conditions += " AND CPC_TURNO IS NULL";
        } else if (this.getCpcTurno() != null) {
            conditions += " AND CPC_TURNO = ?";
            values.add(this.getCpcTurno());
        }

        if (this.getCpcNumSolicitud() != null && "null".equals(this.getCpcNumSolicitud())) {
            conditions += " AND CPC_NUM_SOLICITUD IS NULL";
        } else if (this.getCpcNumSolicitud() != null) {
            conditions += " AND CPC_NUM_SOLICITUD = ?";
            values.add(this.getCpcNumSolicitud());
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
        String sql = "SELECT * FROM CTAXCOBRAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpcOtprinc() != null && "null".equals(this.getCpcOtprinc())) {
            conditions += " AND CPC_OTPRINC IS NULL";
        } else if (this.getCpcOtprinc() != null) {
            conditions += " AND CPC_OTPRINC = ?";
            values.add(this.getCpcOtprinc());
        }

        if (this.getCpcTurno() != null && "null".equals(this.getCpcTurno())) {
            conditions += " AND CPC_TURNO IS NULL";
        } else if (this.getCpcTurno() != null) {
            conditions += " AND CPC_TURNO = ?";
            values.add(this.getCpcTurno());
        }

        if (this.getCpcNumSolicitud() != null && "null".equals(this.getCpcNumSolicitud())) {
            conditions += " AND CPC_NUM_SOLICITUD IS NULL";
        } else if (this.getCpcNumSolicitud() != null) {
            conditions += " AND CPC_NUM_SOLICITUD = ?";
            values.add(this.getCpcNumSolicitud());
        }

        if (this.getCpcNumPerito() != null && this.getCpcNumPerito().longValue() == -999) {
            conditions += " AND CPC_NUM_PERITO IS NULL";
        } else if (this.getCpcNumPerito() != null) {
            conditions += " AND CPC_NUM_PERITO = ?";
            values.add(this.getCpcNumPerito());
        }

        if (this.getCpcCliente() != null && "null".equals(this.getCpcCliente())) {
            conditions += " AND CPC_CLIENTE IS NULL";
        } else if (this.getCpcCliente() != null) {
            conditions += " AND CPC_CLIENTE = ?";
            values.add(this.getCpcCliente());
        }

        if (this.getCpcConcepto() != null && "null".equals(this.getCpcConcepto())) {
            conditions += " AND CPC_CONCEPTO IS NULL";
        } else if (this.getCpcConcepto() != null) {
            conditions += " AND CPC_CONCEPTO = ?";
            values.add(this.getCpcConcepto());
        }

        if (this.getCpcNumFactura() != null && "null".equals(this.getCpcNumFactura())) {
            conditions += " AND CPC_NUM_FACTURA IS NULL";
        } else if (this.getCpcNumFactura() != null) {
            conditions += " AND CPC_NUM_FACTURA = ?";
            values.add(this.getCpcNumFactura());
        }

        if (this.getCpcFecFactura() != null && "null".equals(this.getCpcFecFactura())) {
            conditions += " AND CPC_FEC_FACTURA IS NULL";
        } else if (this.getCpcFecFactura() != null) {
            conditions += " AND CPC_FEC_FACTURA = ?";
            values.add(this.getCpcFecFactura());
        }

        if (this.getCpcImpComision() != null && this.getCpcImpComision().longValue() == -999) {
            conditions += " AND CPC_IMP_COMISION IS NULL";
        } else if (this.getCpcImpComision() != null) {
            conditions += " AND CPC_IMP_COMISION = ?";
            values.add(this.getCpcImpComision());
        }

        if (this.getCpcImpViaticos() != null && this.getCpcImpViaticos().longValue() == -999) {
            conditions += " AND CPC_IMP_VIATICOS IS NULL";
        } else if (this.getCpcImpViaticos() != null) {
            conditions += " AND CPC_IMP_VIATICOS = ?";
            values.add(this.getCpcImpViaticos());
        }

        if (this.getCpcSaldo() != null && this.getCpcSaldo().longValue() == -999) {
            conditions += " AND CPC_SALDO IS NULL";
        } else if (this.getCpcSaldo() != null) {
            conditions += " AND CPC_SALDO = ?";
            values.add(this.getCpcSaldo());
        }

        if (this.getCpcAnoAltaReg() != null && this.getCpcAnoAltaReg().longValue() == -999) {
            conditions += " AND CPC_ANO_ALTA_REG IS NULL";
        } else if (this.getCpcAnoAltaReg() != null) {
            conditions += " AND CPC_ANO_ALTA_REG = ?";
            values.add(this.getCpcAnoAltaReg());
        }

        if (this.getCpcMesAltaReg() != null && this.getCpcMesAltaReg().longValue() == -999) {
            conditions += " AND CPC_MES_ALTA_REG IS NULL";
        } else if (this.getCpcMesAltaReg() != null) {
            conditions += " AND CPC_MES_ALTA_REG = ?";
            values.add(this.getCpcMesAltaReg());
        }

        if (this.getCpcDiaAltaReg() != null && this.getCpcDiaAltaReg().longValue() == -999) {
            conditions += " AND CPC_DIA_ALTA_REG IS NULL";
        } else if (this.getCpcDiaAltaReg() != null) {
            conditions += " AND CPC_DIA_ALTA_REG = ?";
            values.add(this.getCpcDiaAltaReg());
        }

        if (this.getCpcAnoUltMod() != null && this.getCpcAnoUltMod().longValue() == -999) {
            conditions += " AND CPC_ANO_ULT_MOD IS NULL";
        } else if (this.getCpcAnoUltMod() != null) {
            conditions += " AND CPC_ANO_ULT_MOD = ?";
            values.add(this.getCpcAnoUltMod());
        }

        if (this.getCpcMesUltMod() != null && this.getCpcMesUltMod().longValue() == -999) {
            conditions += " AND CPC_MES_ULT_MOD IS NULL";
        } else if (this.getCpcMesUltMod() != null) {
            conditions += " AND CPC_MES_ULT_MOD = ?";
            values.add(this.getCpcMesUltMod());
        }

        if (this.getCpcDiaUltMod() != null && this.getCpcDiaUltMod().longValue() == -999) {
            conditions += " AND CPC_DIA_ULT_MOD IS NULL";
        } else if (this.getCpcDiaUltMod() != null) {
            conditions += " AND CPC_DIA_ULT_MOD = ?";
            values.add(this.getCpcDiaUltMod());
        }

        if (this.getCpcCveStCtcobra() != null && "null".equals(this.getCpcCveStCtcobra())) {
            conditions += " AND CPC_CVE_ST_CTCOBRA IS NULL";
        } else if (this.getCpcCveStCtcobra() != null) {
            conditions += " AND CPC_CVE_ST_CTCOBRA = ?";
            values.add(this.getCpcCveStCtcobra());
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
        String sql = "UPDATE CTAXCOBRAR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPC_OTPRINC = ?";
        pkValues.add(this.getCpcOtprinc());
        conditions += " AND CPC_TURNO = ?";
        pkValues.add(this.getCpcTurno());
        conditions += " AND CPC_NUM_SOLICITUD = ?";
        pkValues.add(this.getCpcNumSolicitud());
        fields += " CPC_NUM_PERITO = ?, ";
        values.add(this.getCpcNumPerito());
        fields += " CPC_CLIENTE = ?, ";
        values.add(this.getCpcCliente());
        fields += " CPC_CONCEPTO = ?, ";
        values.add(this.getCpcConcepto());
        fields += " CPC_NUM_FACTURA = ?, ";
        values.add(this.getCpcNumFactura());
        fields += " CPC_FEC_FACTURA = ?, ";
        values.add(this.getCpcFecFactura());
        fields += " CPC_IMP_COMISION = ?, ";
        values.add(this.getCpcImpComision());
        fields += " CPC_IMP_VIATICOS = ?, ";
        values.add(this.getCpcImpViaticos());
        fields += " CPC_SALDO = ?, ";
        values.add(this.getCpcSaldo());
        fields += " CPC_ANO_ALTA_REG = ?, ";
        values.add(this.getCpcAnoAltaReg());
        fields += " CPC_MES_ALTA_REG = ?, ";
        values.add(this.getCpcMesAltaReg());
        fields += " CPC_DIA_ALTA_REG = ?, ";
        values.add(this.getCpcDiaAltaReg());
        fields += " CPC_ANO_ULT_MOD = ?, ";
        values.add(this.getCpcAnoUltMod());
        fields += " CPC_MES_ULT_MOD = ?, ";
        values.add(this.getCpcMesUltMod());
        fields += " CPC_DIA_ULT_MOD = ?, ";
        values.add(this.getCpcDiaUltMod());
        fields += " CPC_CVE_ST_CTCOBRA = ?, ";
        values.add(this.getCpcCveStCtcobra());
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
        String sql = "INSERT INTO CTAXCOBRAR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPC_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getCpcOtprinc());

        fields += ", CPC_TURNO";
        fieldValues += ", ?";
        values.add(this.getCpcTurno());

        fields += ", CPC_NUM_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getCpcNumSolicitud());

        fields += ", CPC_NUM_PERITO";
        fieldValues += ", ?";
        values.add(this.getCpcNumPerito());

        fields += ", CPC_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCpcCliente());

        fields += ", CPC_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCpcConcepto());

        fields += ", CPC_NUM_FACTURA";
        fieldValues += ", ?";
        values.add(this.getCpcNumFactura());

        fields += ", CPC_FEC_FACTURA";
        fieldValues += ", ?";
        values.add(this.getCpcFecFactura());

        fields += ", CPC_IMP_COMISION";
        fieldValues += ", ?";
        values.add(this.getCpcImpComision());

        fields += ", CPC_IMP_VIATICOS";
        fieldValues += ", ?";
        values.add(this.getCpcImpViaticos());

        fields += ", CPC_SALDO";
        fieldValues += ", ?";
        values.add(this.getCpcSaldo());

        fields += ", CPC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCpcAnoAltaReg());

        fields += ", CPC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCpcMesAltaReg());

        fields += ", CPC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCpcDiaAltaReg());

        fields += ", CPC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpcAnoUltMod());

        fields += ", CPC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpcMesUltMod());

        fields += ", CPC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpcDiaUltMod());

        fields += ", CPC_CVE_ST_CTCOBRA";
        fieldValues += ", ?";
        values.add(this.getCpcCveStCtcobra());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTAXCOBRAR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPC_OTPRINC = ?";
        values.add(this.getCpcOtprinc());
        conditions += " AND CPC_TURNO = ?";
        values.add(this.getCpcTurno());
        conditions += " AND CPC_NUM_SOLICITUD = ?";
        values.add(this.getCpcNumSolicitud());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctaxcobrar instance = (Ctaxcobrar) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpcOtprinc().equals(instance.getCpcOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getCpcTurno().equals(instance.getCpcTurno()))
            equalObjects = false;
        if (equalObjects && !this.getCpcNumSolicitud().equals(instance.getCpcNumSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getCpcNumPerito().equals(instance.getCpcNumPerito()))
            equalObjects = false;
        if (equalObjects && !this.getCpcCliente().equals(instance.getCpcCliente()))
            equalObjects = false;
        if (equalObjects && !this.getCpcConcepto().equals(instance.getCpcConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCpcNumFactura().equals(instance.getCpcNumFactura()))
            equalObjects = false;
        if (equalObjects && !this.getCpcFecFactura().equals(instance.getCpcFecFactura()))
            equalObjects = false;
        if (equalObjects && !this.getCpcImpComision().equals(instance.getCpcImpComision()))
            equalObjects = false;
        if (equalObjects && !this.getCpcImpViaticos().equals(instance.getCpcImpViaticos()))
            equalObjects = false;
        if (equalObjects && !this.getCpcSaldo().equals(instance.getCpcSaldo()))
            equalObjects = false;
        if (equalObjects && !this.getCpcAnoAltaReg().equals(instance.getCpcAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpcMesAltaReg().equals(instance.getCpcMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpcDiaAltaReg().equals(instance.getCpcDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpcAnoUltMod().equals(instance.getCpcAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpcMesUltMod().equals(instance.getCpcMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpcDiaUltMod().equals(instance.getCpcDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpcCveStCtcobra().equals(instance.getCpcCveStCtcobra()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctaxcobrar result = new Ctaxcobrar();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpcOtprinc((String) objectData.getData("CPC_OTPRINC"));
        result.setCpcTurno((String) objectData.getData("CPC_TURNO"));
        result.setCpcNumSolicitud((String) objectData.getData("CPC_NUM_SOLICITUD"));
        result.setCpcNumPerito((BigDecimal) objectData.getData("CPC_NUM_PERITO"));
        result.setCpcCliente((String) objectData.getData("CPC_CLIENTE"));
        result.setCpcConcepto((String) objectData.getData("CPC_CONCEPTO"));
        result.setCpcNumFactura((String) objectData.getData("CPC_NUM_FACTURA"));
        result.setCpcFecFactura((String) objectData.getData("CPC_FEC_FACTURA"));
        result.setCpcImpComision((BigDecimal) objectData.getData("CPC_IMP_COMISION"));
        result.setCpcImpViaticos((BigDecimal) objectData.getData("CPC_IMP_VIATICOS"));
        result.setCpcSaldo((BigDecimal) objectData.getData("CPC_SALDO"));
        result.setCpcAnoAltaReg((BigDecimal) objectData.getData("CPC_ANO_ALTA_REG"));
        result.setCpcMesAltaReg((BigDecimal) objectData.getData("CPC_MES_ALTA_REG"));
        result.setCpcDiaAltaReg((BigDecimal) objectData.getData("CPC_DIA_ALTA_REG"));
        result.setCpcAnoUltMod((BigDecimal) objectData.getData("CPC_ANO_ULT_MOD"));
        result.setCpcMesUltMod((BigDecimal) objectData.getData("CPC_MES_ULT_MOD"));
        result.setCpcDiaUltMod((BigDecimal) objectData.getData("CPC_DIA_ULT_MOD"));
        result.setCpcCveStCtcobra((String) objectData.getData("CPC_CVE_ST_CTCOBRA"));

        return result;

    }

}
