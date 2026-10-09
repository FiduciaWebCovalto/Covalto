package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OTXAVAL_PK", columns = { "OTA_OTPRINC", "OTA_TURNO", "OTA_NUM_SOLICITUD" }, sequences = { "MANUAL" })
public class Otxaval extends DomainObject {

    String otaOtprinc = null;
    String otaTurno = null;
    String otaNumSolicitud = null;
    BigDecimal otaImpAvaluo = null;
    BigDecimal otaImpArancel = null;
    BigDecimal otaImpViaticos = null;
    BigDecimal otaImpGastos = null;
    BigDecimal otaImpIva = null;
    BigDecimal otaImpTotal = null;
    BigDecimal otaAnoAltaReg = null;
    BigDecimal otaMesAltaReg = null;
    BigDecimal otaDiaAltaReg = null;
    BigDecimal otaAnoUltMod = null;
    BigDecimal otaMesUltMod = null;
    BigDecimal otaDiaUltMod = null;
    String otaCveStOtxaval = null;

    public Otxaval() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtaOtprinc(String otaOtprinc) {
        this.otaOtprinc = otaOtprinc;
    }

    public String getOtaOtprinc() {
        return this.otaOtprinc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtaTurno(String otaTurno) {
        this.otaTurno = otaTurno;
    }

    public String getOtaTurno() {
        return this.otaTurno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtaNumSolicitud(String otaNumSolicitud) {
        this.otaNumSolicitud = otaNumSolicitud;
    }

    public String getOtaNumSolicitud() {
        return this.otaNumSolicitud;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOtaImpAvaluo(BigDecimal otaImpAvaluo) {
        this.otaImpAvaluo = otaImpAvaluo;
    }

    public BigDecimal getOtaImpAvaluo() {
        return this.otaImpAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOtaImpArancel(BigDecimal otaImpArancel) {
        this.otaImpArancel = otaImpArancel;
    }

    public BigDecimal getOtaImpArancel() {
        return this.otaImpArancel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOtaImpViaticos(BigDecimal otaImpViaticos) {
        this.otaImpViaticos = otaImpViaticos;
    }

    public BigDecimal getOtaImpViaticos() {
        return this.otaImpViaticos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOtaImpGastos(BigDecimal otaImpGastos) {
        this.otaImpGastos = otaImpGastos;
    }

    public BigDecimal getOtaImpGastos() {
        return this.otaImpGastos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOtaImpIva(BigDecimal otaImpIva) {
        this.otaImpIva = otaImpIva;
    }

    public BigDecimal getOtaImpIva() {
        return this.otaImpIva;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOtaImpTotal(BigDecimal otaImpTotal) {
        this.otaImpTotal = otaImpTotal;
    }

    public BigDecimal getOtaImpTotal() {
        return this.otaImpTotal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOtaAnoAltaReg(BigDecimal otaAnoAltaReg) {
        this.otaAnoAltaReg = otaAnoAltaReg;
    }

    public BigDecimal getOtaAnoAltaReg() {
        return this.otaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtaMesAltaReg(BigDecimal otaMesAltaReg) {
        this.otaMesAltaReg = otaMesAltaReg;
    }

    public BigDecimal getOtaMesAltaReg() {
        return this.otaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtaDiaAltaReg(BigDecimal otaDiaAltaReg) {
        this.otaDiaAltaReg = otaDiaAltaReg;
    }

    public BigDecimal getOtaDiaAltaReg() {
        return this.otaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOtaAnoUltMod(BigDecimal otaAnoUltMod) {
        this.otaAnoUltMod = otaAnoUltMod;
    }

    public BigDecimal getOtaAnoUltMod() {
        return this.otaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtaMesUltMod(BigDecimal otaMesUltMod) {
        this.otaMesUltMod = otaMesUltMod;
    }

    public BigDecimal getOtaMesUltMod() {
        return this.otaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtaDiaUltMod(BigDecimal otaDiaUltMod) {
        this.otaDiaUltMod = otaDiaUltMod;
    }

    public BigDecimal getOtaDiaUltMod() {
        return this.otaDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtaCveStOtxaval(String otaCveStOtxaval) {
        this.otaCveStOtxaval = otaCveStOtxaval;
    }

    public String getOtaCveStOtxaval() {
        return this.otaCveStOtxaval;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OTXAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOtaOtprinc() != null && "null".equals(this.getOtaOtprinc())) {
            conditions += " AND OTA_OTPRINC IS NULL";
        } else if (this.getOtaOtprinc() != null) {
            conditions += " AND OTA_OTPRINC = ?";
            values.add(this.getOtaOtprinc());
        }

        if (this.getOtaTurno() != null && "null".equals(this.getOtaTurno())) {
            conditions += " AND OTA_TURNO IS NULL";
        } else if (this.getOtaTurno() != null) {
            conditions += " AND OTA_TURNO = ?";
            values.add(this.getOtaTurno());
        }

        if (this.getOtaNumSolicitud() != null && "null".equals(this.getOtaNumSolicitud())) {
            conditions += " AND OTA_NUM_SOLICITUD IS NULL";
        } else if (this.getOtaNumSolicitud() != null) {
            conditions += " AND OTA_NUM_SOLICITUD = ?";
            values.add(this.getOtaNumSolicitud());
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
        String sql = "SELECT * FROM OTXAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOtaOtprinc() != null && "null".equals(this.getOtaOtprinc())) {
            conditions += " AND OTA_OTPRINC IS NULL";
        } else if (this.getOtaOtprinc() != null) {
            conditions += " AND OTA_OTPRINC = ?";
            values.add(this.getOtaOtprinc());
        }

        if (this.getOtaTurno() != null && "null".equals(this.getOtaTurno())) {
            conditions += " AND OTA_TURNO IS NULL";
        } else if (this.getOtaTurno() != null) {
            conditions += " AND OTA_TURNO = ?";
            values.add(this.getOtaTurno());
        }

        if (this.getOtaNumSolicitud() != null && "null".equals(this.getOtaNumSolicitud())) {
            conditions += " AND OTA_NUM_SOLICITUD IS NULL";
        } else if (this.getOtaNumSolicitud() != null) {
            conditions += " AND OTA_NUM_SOLICITUD = ?";
            values.add(this.getOtaNumSolicitud());
        }

        if (this.getOtaImpAvaluo() != null && this.getOtaImpAvaluo().longValue() == -999) {
            conditions += " AND OTA_IMP_AVALUO IS NULL";
        } else if (this.getOtaImpAvaluo() != null) {
            conditions += " AND OTA_IMP_AVALUO = ?";
            values.add(this.getOtaImpAvaluo());
        }

        if (this.getOtaImpArancel() != null && this.getOtaImpArancel().longValue() == -999) {
            conditions += " AND OTA_IMP_ARANCEL IS NULL";
        } else if (this.getOtaImpArancel() != null) {
            conditions += " AND OTA_IMP_ARANCEL = ?";
            values.add(this.getOtaImpArancel());
        }

        if (this.getOtaImpViaticos() != null && this.getOtaImpViaticos().longValue() == -999) {
            conditions += " AND OTA_IMP_VIATICOS IS NULL";
        } else if (this.getOtaImpViaticos() != null) {
            conditions += " AND OTA_IMP_VIATICOS = ?";
            values.add(this.getOtaImpViaticos());
        }

        if (this.getOtaImpGastos() != null && this.getOtaImpGastos().longValue() == -999) {
            conditions += " AND OTA_IMP_GASTOS IS NULL";
        } else if (this.getOtaImpGastos() != null) {
            conditions += " AND OTA_IMP_GASTOS = ?";
            values.add(this.getOtaImpGastos());
        }

        if (this.getOtaImpIva() != null && this.getOtaImpIva().longValue() == -999) {
            conditions += " AND OTA_IMP_IVA IS NULL";
        } else if (this.getOtaImpIva() != null) {
            conditions += " AND OTA_IMP_IVA = ?";
            values.add(this.getOtaImpIva());
        }

        if (this.getOtaImpTotal() != null && this.getOtaImpTotal().longValue() == -999) {
            conditions += " AND OTA_IMP_TOTAL IS NULL";
        } else if (this.getOtaImpTotal() != null) {
            conditions += " AND OTA_IMP_TOTAL = ?";
            values.add(this.getOtaImpTotal());
        }

        if (this.getOtaAnoAltaReg() != null && this.getOtaAnoAltaReg().longValue() == -999) {
            conditions += " AND OTA_ANO_ALTA_REG IS NULL";
        } else if (this.getOtaAnoAltaReg() != null) {
            conditions += " AND OTA_ANO_ALTA_REG = ?";
            values.add(this.getOtaAnoAltaReg());
        }

        if (this.getOtaMesAltaReg() != null && this.getOtaMesAltaReg().longValue() == -999) {
            conditions += " AND OTA_MES_ALTA_REG IS NULL";
        } else if (this.getOtaMesAltaReg() != null) {
            conditions += " AND OTA_MES_ALTA_REG = ?";
            values.add(this.getOtaMesAltaReg());
        }

        if (this.getOtaDiaAltaReg() != null && this.getOtaDiaAltaReg().longValue() == -999) {
            conditions += " AND OTA_DIA_ALTA_REG IS NULL";
        } else if (this.getOtaDiaAltaReg() != null) {
            conditions += " AND OTA_DIA_ALTA_REG = ?";
            values.add(this.getOtaDiaAltaReg());
        }

        if (this.getOtaAnoUltMod() != null && this.getOtaAnoUltMod().longValue() == -999) {
            conditions += " AND OTA_ANO_ULT_MOD IS NULL";
        } else if (this.getOtaAnoUltMod() != null) {
            conditions += " AND OTA_ANO_ULT_MOD = ?";
            values.add(this.getOtaAnoUltMod());
        }

        if (this.getOtaMesUltMod() != null && this.getOtaMesUltMod().longValue() == -999) {
            conditions += " AND OTA_MES_ULT_MOD IS NULL";
        } else if (this.getOtaMesUltMod() != null) {
            conditions += " AND OTA_MES_ULT_MOD = ?";
            values.add(this.getOtaMesUltMod());
        }

        if (this.getOtaDiaUltMod() != null && this.getOtaDiaUltMod().longValue() == -999) {
            conditions += " AND OTA_DIA_ULT_MOD IS NULL";
        } else if (this.getOtaDiaUltMod() != null) {
            conditions += " AND OTA_DIA_ULT_MOD = ?";
            values.add(this.getOtaDiaUltMod());
        }

        if (this.getOtaCveStOtxaval() != null && "null".equals(this.getOtaCveStOtxaval())) {
            conditions += " AND OTA_CVE_ST_OTXAVAL IS NULL";
        } else if (this.getOtaCveStOtxaval() != null) {
            conditions += " AND OTA_CVE_ST_OTXAVAL = ?";
            values.add(this.getOtaCveStOtxaval());
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
        String sql = "UPDATE OTXAVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OTA_OTPRINC = ?";
        pkValues.add(this.getOtaOtprinc());
        conditions += " AND OTA_TURNO = ?";
        pkValues.add(this.getOtaTurno());
        conditions += " AND OTA_NUM_SOLICITUD = ?";
        pkValues.add(this.getOtaNumSolicitud());
        fields += " OTA_IMP_AVALUO = ?, ";
        values.add(this.getOtaImpAvaluo());
        fields += " OTA_IMP_ARANCEL = ?, ";
        values.add(this.getOtaImpArancel());
        fields += " OTA_IMP_VIATICOS = ?, ";
        values.add(this.getOtaImpViaticos());
        fields += " OTA_IMP_GASTOS = ?, ";
        values.add(this.getOtaImpGastos());
        fields += " OTA_IMP_IVA = ?, ";
        values.add(this.getOtaImpIva());
        fields += " OTA_IMP_TOTAL = ?, ";
        values.add(this.getOtaImpTotal());
        fields += " OTA_ANO_ALTA_REG = ?, ";
        values.add(this.getOtaAnoAltaReg());
        fields += " OTA_MES_ALTA_REG = ?, ";
        values.add(this.getOtaMesAltaReg());
        fields += " OTA_DIA_ALTA_REG = ?, ";
        values.add(this.getOtaDiaAltaReg());
        fields += " OTA_ANO_ULT_MOD = ?, ";
        values.add(this.getOtaAnoUltMod());
        fields += " OTA_MES_ULT_MOD = ?, ";
        values.add(this.getOtaMesUltMod());
        fields += " OTA_DIA_ULT_MOD = ?, ";
        values.add(this.getOtaDiaUltMod());
        fields += " OTA_CVE_ST_OTXAVAL = ?, ";
        values.add(this.getOtaCveStOtxaval());
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
        String sql = "INSERT INTO OTXAVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OTA_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getOtaOtprinc());

        fields += ", OTA_TURNO";
        fieldValues += ", ?";
        values.add(this.getOtaTurno());

        fields += ", OTA_NUM_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getOtaNumSolicitud());

        fields += ", OTA_IMP_AVALUO";
        fieldValues += ", ?";
        values.add(this.getOtaImpAvaluo());

        fields += ", OTA_IMP_ARANCEL";
        fieldValues += ", ?";
        values.add(this.getOtaImpArancel());

        fields += ", OTA_IMP_VIATICOS";
        fieldValues += ", ?";
        values.add(this.getOtaImpViaticos());

        fields += ", OTA_IMP_GASTOS";
        fieldValues += ", ?";
        values.add(this.getOtaImpGastos());

        fields += ", OTA_IMP_IVA";
        fieldValues += ", ?";
        values.add(this.getOtaImpIva());

        fields += ", OTA_IMP_TOTAL";
        fieldValues += ", ?";
        values.add(this.getOtaImpTotal());

        fields += ", OTA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtaAnoAltaReg());

        fields += ", OTA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtaMesAltaReg());

        fields += ", OTA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtaDiaAltaReg());

        fields += ", OTA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtaAnoUltMod());

        fields += ", OTA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtaMesUltMod());

        fields += ", OTA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtaDiaUltMod());

        fields += ", OTA_CVE_ST_OTXAVAL";
        fieldValues += ", ?";
        values.add(this.getOtaCveStOtxaval());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OTXAVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OTA_OTPRINC = ?";
        values.add(this.getOtaOtprinc());
        conditions += " AND OTA_TURNO = ?";
        values.add(this.getOtaTurno());
        conditions += " AND OTA_NUM_SOLICITUD = ?";
        values.add(this.getOtaNumSolicitud());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Otxaval instance = (Otxaval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOtaOtprinc().equals(instance.getOtaOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getOtaTurno().equals(instance.getOtaTurno()))
            equalObjects = false;
        if (equalObjects && !this.getOtaNumSolicitud().equals(instance.getOtaNumSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getOtaImpAvaluo().equals(instance.getOtaImpAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getOtaImpArancel().equals(instance.getOtaImpArancel()))
            equalObjects = false;
        if (equalObjects && !this.getOtaImpViaticos().equals(instance.getOtaImpViaticos()))
            equalObjects = false;
        if (equalObjects && !this.getOtaImpGastos().equals(instance.getOtaImpGastos()))
            equalObjects = false;
        if (equalObjects && !this.getOtaImpIva().equals(instance.getOtaImpIva()))
            equalObjects = false;
        if (equalObjects && !this.getOtaImpTotal().equals(instance.getOtaImpTotal()))
            equalObjects = false;
        if (equalObjects && !this.getOtaAnoAltaReg().equals(instance.getOtaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtaMesAltaReg().equals(instance.getOtaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtaDiaAltaReg().equals(instance.getOtaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtaAnoUltMod().equals(instance.getOtaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtaMesUltMod().equals(instance.getOtaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtaDiaUltMod().equals(instance.getOtaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtaCveStOtxaval().equals(instance.getOtaCveStOtxaval()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Otxaval result = new Otxaval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOtaOtprinc((String) objectData.getData("OTA_OTPRINC"));
        result.setOtaTurno((String) objectData.getData("OTA_TURNO"));
        result.setOtaNumSolicitud((String) objectData.getData("OTA_NUM_SOLICITUD"));
        result.setOtaImpAvaluo((BigDecimal) objectData.getData("OTA_IMP_AVALUO"));
        result.setOtaImpArancel((BigDecimal) objectData.getData("OTA_IMP_ARANCEL"));
        result.setOtaImpViaticos((BigDecimal) objectData.getData("OTA_IMP_VIATICOS"));
        result.setOtaImpGastos((BigDecimal) objectData.getData("OTA_IMP_GASTOS"));
        result.setOtaImpIva((BigDecimal) objectData.getData("OTA_IMP_IVA"));
        result.setOtaImpTotal((BigDecimal) objectData.getData("OTA_IMP_TOTAL"));
        result.setOtaAnoAltaReg((BigDecimal) objectData.getData("OTA_ANO_ALTA_REG"));
        result.setOtaMesAltaReg((BigDecimal) objectData.getData("OTA_MES_ALTA_REG"));
        result.setOtaDiaAltaReg((BigDecimal) objectData.getData("OTA_DIA_ALTA_REG"));
        result.setOtaAnoUltMod((BigDecimal) objectData.getData("OTA_ANO_ULT_MOD"));
        result.setOtaMesUltMod((BigDecimal) objectData.getData("OTA_MES_ULT_MOD"));
        result.setOtaDiaUltMod((BigDecimal) objectData.getData("OTA_DIA_ULT_MOD"));
        result.setOtaCveStOtxaval((String) objectData.getData("OTA_CVE_ST_OTXAVAL"));

        return result;

    }

}
