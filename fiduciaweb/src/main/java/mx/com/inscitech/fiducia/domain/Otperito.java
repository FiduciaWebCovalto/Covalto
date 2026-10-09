package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OTPERITO_PK", columns = { "OTP_OTPRINC", "OTP_NUM_PERITO", "OTP_NUM_SOLICITUD" }, sequences = { "MANUAL" })
public class Otperito extends DomainObject {

    String otpOtprinc = null;
    BigDecimal otpNumPerito = null;
    String otpNumSolicitud = null;
    String otpTurno = null;
    String otpFecAsignacion = null;
    String otpFecEsperada = null;
    String otpFecEntrega = null;
    String otpTipoAvaluo = null;
    String otpObserReasigna = null;
    BigDecimal otpAnoAltaReg = null;
    BigDecimal otpMesAltaReg = null;
    BigDecimal otpDiaAltaReg = null;
    BigDecimal otpAnoUltMod = null;
    BigDecimal otpMesUltMod = null;
    BigDecimal otpDiaUltMod = null;
    String otpCveStStatus = null;

    public Otperito() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpOtprinc(String otpOtprinc) {
        this.otpOtprinc = otpOtprinc;
    }

    public String getOtpOtprinc() {
        return this.otpOtprinc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOtpNumPerito(BigDecimal otpNumPerito) {
        this.otpNumPerito = otpNumPerito;
    }

    public BigDecimal getOtpNumPerito() {
        return this.otpNumPerito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpNumSolicitud(String otpNumSolicitud) {
        this.otpNumSolicitud = otpNumSolicitud;
    }

    public String getOtpNumSolicitud() {
        return this.otpNumSolicitud;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpTurno(String otpTurno) {
        this.otpTurno = otpTurno;
    }

    public String getOtpTurno() {
        return this.otpTurno;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpFecAsignacion(String otpFecAsignacion) {
        this.otpFecAsignacion = otpFecAsignacion;
    }

    public String getOtpFecAsignacion() {
        return this.otpFecAsignacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpFecEsperada(String otpFecEsperada) {
        this.otpFecEsperada = otpFecEsperada;
    }

    public String getOtpFecEsperada() {
        return this.otpFecEsperada;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpFecEntrega(String otpFecEntrega) {
        this.otpFecEntrega = otpFecEntrega;
    }

    public String getOtpFecEntrega() {
        return this.otpFecEntrega;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpTipoAvaluo(String otpTipoAvaluo) {
        this.otpTipoAvaluo = otpTipoAvaluo;
    }

    public String getOtpTipoAvaluo() {
        return this.otpTipoAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpObserReasigna(String otpObserReasigna) {
        this.otpObserReasigna = otpObserReasigna;
    }

    public String getOtpObserReasigna() {
        return this.otpObserReasigna;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOtpAnoAltaReg(BigDecimal otpAnoAltaReg) {
        this.otpAnoAltaReg = otpAnoAltaReg;
    }

    public BigDecimal getOtpAnoAltaReg() {
        return this.otpAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtpMesAltaReg(BigDecimal otpMesAltaReg) {
        this.otpMesAltaReg = otpMesAltaReg;
    }

    public BigDecimal getOtpMesAltaReg() {
        return this.otpMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtpDiaAltaReg(BigDecimal otpDiaAltaReg) {
        this.otpDiaAltaReg = otpDiaAltaReg;
    }

    public BigDecimal getOtpDiaAltaReg() {
        return this.otpDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOtpAnoUltMod(BigDecimal otpAnoUltMod) {
        this.otpAnoUltMod = otpAnoUltMod;
    }

    public BigDecimal getOtpAnoUltMod() {
        return this.otpAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtpMesUltMod(BigDecimal otpMesUltMod) {
        this.otpMesUltMod = otpMesUltMod;
    }

    public BigDecimal getOtpMesUltMod() {
        return this.otpMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtpDiaUltMod(BigDecimal otpDiaUltMod) {
        this.otpDiaUltMod = otpDiaUltMod;
    }

    public BigDecimal getOtpDiaUltMod() {
        return this.otpDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtpCveStStatus(String otpCveStStatus) {
        this.otpCveStStatus = otpCveStStatus;
    }

    public String getOtpCveStStatus() {
        return this.otpCveStStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OTPERITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOtpOtprinc() != null && "null".equals(this.getOtpOtprinc())) {
            conditions += " AND OTP_OTPRINC IS NULL";
        } else if (this.getOtpOtprinc() != null) {
            conditions += " AND OTP_OTPRINC = ?";
            values.add(this.getOtpOtprinc());
        }

        if (this.getOtpNumPerito() != null && this.getOtpNumPerito().longValue() == -999) {
            conditions += " AND OTP_NUM_PERITO IS NULL";
        } else if (this.getOtpNumPerito() != null) {
            conditions += " AND OTP_NUM_PERITO = ?";
            values.add(this.getOtpNumPerito());
        }

        if (this.getOtpNumSolicitud() != null && "null".equals(this.getOtpNumSolicitud())) {
            conditions += " AND OTP_NUM_SOLICITUD IS NULL";
        } else if (this.getOtpNumSolicitud() != null) {
            conditions += " AND OTP_NUM_SOLICITUD = ?";
            values.add(this.getOtpNumSolicitud());
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
        String sql = "SELECT * FROM OTPERITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOtpOtprinc() != null && "null".equals(this.getOtpOtprinc())) {
            conditions += " AND OTP_OTPRINC IS NULL";
        } else if (this.getOtpOtprinc() != null) {
            conditions += " AND OTP_OTPRINC = ?";
            values.add(this.getOtpOtprinc());
        }

        if (this.getOtpNumPerito() != null && this.getOtpNumPerito().longValue() == -999) {
            conditions += " AND OTP_NUM_PERITO IS NULL";
        } else if (this.getOtpNumPerito() != null) {
            conditions += " AND OTP_NUM_PERITO = ?";
            values.add(this.getOtpNumPerito());
        }

        if (this.getOtpNumSolicitud() != null && "null".equals(this.getOtpNumSolicitud())) {
            conditions += " AND OTP_NUM_SOLICITUD IS NULL";
        } else if (this.getOtpNumSolicitud() != null) {
            conditions += " AND OTP_NUM_SOLICITUD = ?";
            values.add(this.getOtpNumSolicitud());
        }

        if (this.getOtpTurno() != null && "null".equals(this.getOtpTurno())) {
            conditions += " AND OTP_TURNO IS NULL";
        } else if (this.getOtpTurno() != null) {
            conditions += " AND OTP_TURNO = ?";
            values.add(this.getOtpTurno());
        }

        if (this.getOtpFecAsignacion() != null && "null".equals(this.getOtpFecAsignacion())) {
            conditions += " AND OTP_FEC_ASIGNACION IS NULL";
        } else if (this.getOtpFecAsignacion() != null) {
            conditions += " AND OTP_FEC_ASIGNACION = ?";
            values.add(this.getOtpFecAsignacion());
        }

        if (this.getOtpFecEsperada() != null && "null".equals(this.getOtpFecEsperada())) {
            conditions += " AND OTP_FEC_ESPERADA IS NULL";
        } else if (this.getOtpFecEsperada() != null) {
            conditions += " AND OTP_FEC_ESPERADA = ?";
            values.add(this.getOtpFecEsperada());
        }

        if (this.getOtpFecEntrega() != null && "null".equals(this.getOtpFecEntrega())) {
            conditions += " AND OTP_FEC_ENTREGA IS NULL";
        } else if (this.getOtpFecEntrega() != null) {
            conditions += " AND OTP_FEC_ENTREGA = ?";
            values.add(this.getOtpFecEntrega());
        }

        if (this.getOtpTipoAvaluo() != null && "null".equals(this.getOtpTipoAvaluo())) {
            conditions += " AND OTP_TIPO_AVALUO IS NULL";
        } else if (this.getOtpTipoAvaluo() != null) {
            conditions += " AND OTP_TIPO_AVALUO = ?";
            values.add(this.getOtpTipoAvaluo());
        }

        if (this.getOtpObserReasigna() != null && "null".equals(this.getOtpObserReasigna())) {
            conditions += " AND OTP_OBSER_REASIGNA IS NULL";
        } else if (this.getOtpObserReasigna() != null) {
            conditions += " AND OTP_OBSER_REASIGNA = ?";
            values.add(this.getOtpObserReasigna());
        }

        if (this.getOtpAnoAltaReg() != null && this.getOtpAnoAltaReg().longValue() == -999) {
            conditions += " AND OTP_ANO_ALTA_REG IS NULL";
        } else if (this.getOtpAnoAltaReg() != null) {
            conditions += " AND OTP_ANO_ALTA_REG = ?";
            values.add(this.getOtpAnoAltaReg());
        }

        if (this.getOtpMesAltaReg() != null && this.getOtpMesAltaReg().longValue() == -999) {
            conditions += " AND OTP_MES_ALTA_REG IS NULL";
        } else if (this.getOtpMesAltaReg() != null) {
            conditions += " AND OTP_MES_ALTA_REG = ?";
            values.add(this.getOtpMesAltaReg());
        }

        if (this.getOtpDiaAltaReg() != null && this.getOtpDiaAltaReg().longValue() == -999) {
            conditions += " AND OTP_DIA_ALTA_REG IS NULL";
        } else if (this.getOtpDiaAltaReg() != null) {
            conditions += " AND OTP_DIA_ALTA_REG = ?";
            values.add(this.getOtpDiaAltaReg());
        }

        if (this.getOtpAnoUltMod() != null && this.getOtpAnoUltMod().longValue() == -999) {
            conditions += " AND OTP_ANO_ULT_MOD IS NULL";
        } else if (this.getOtpAnoUltMod() != null) {
            conditions += " AND OTP_ANO_ULT_MOD = ?";
            values.add(this.getOtpAnoUltMod());
        }

        if (this.getOtpMesUltMod() != null && this.getOtpMesUltMod().longValue() == -999) {
            conditions += " AND OTP_MES_ULT_MOD IS NULL";
        } else if (this.getOtpMesUltMod() != null) {
            conditions += " AND OTP_MES_ULT_MOD = ?";
            values.add(this.getOtpMesUltMod());
        }

        if (this.getOtpDiaUltMod() != null && this.getOtpDiaUltMod().longValue() == -999) {
            conditions += " AND OTP_DIA_ULT_MOD IS NULL";
        } else if (this.getOtpDiaUltMod() != null) {
            conditions += " AND OTP_DIA_ULT_MOD = ?";
            values.add(this.getOtpDiaUltMod());
        }

        if (this.getOtpCveStStatus() != null && "null".equals(this.getOtpCveStStatus())) {
            conditions += " AND OTP_CVE_ST_STATUS IS NULL";
        } else if (this.getOtpCveStStatus() != null) {
            conditions += " AND OTP_CVE_ST_STATUS = ?";
            values.add(this.getOtpCveStStatus());
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
        String sql = "UPDATE OTPERITO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OTP_OTPRINC = ?";
        pkValues.add(this.getOtpOtprinc());
        conditions += " AND OTP_NUM_PERITO = ?";
        pkValues.add(this.getOtpNumPerito());
        conditions += " AND OTP_NUM_SOLICITUD = ?";
        pkValues.add(this.getOtpNumSolicitud());
        fields += " OTP_TURNO = ?, ";
        values.add(this.getOtpTurno());
        fields += " OTP_FEC_ASIGNACION = ?, ";
        values.add(this.getOtpFecAsignacion());
        fields += " OTP_FEC_ESPERADA = ?, ";
        values.add(this.getOtpFecEsperada());
        fields += " OTP_FEC_ENTREGA = ?, ";
        values.add(this.getOtpFecEntrega());
        fields += " OTP_TIPO_AVALUO = ?, ";
        values.add(this.getOtpTipoAvaluo());
        fields += " OTP_OBSER_REASIGNA = ?, ";
        values.add(this.getOtpObserReasigna());
        fields += " OTP_ANO_ALTA_REG = ?, ";
        values.add(this.getOtpAnoAltaReg());
        fields += " OTP_MES_ALTA_REG = ?, ";
        values.add(this.getOtpMesAltaReg());
        fields += " OTP_DIA_ALTA_REG = ?, ";
        values.add(this.getOtpDiaAltaReg());
        fields += " OTP_ANO_ULT_MOD = ?, ";
        values.add(this.getOtpAnoUltMod());
        fields += " OTP_MES_ULT_MOD = ?, ";
        values.add(this.getOtpMesUltMod());
        fields += " OTP_DIA_ULT_MOD = ?, ";
        values.add(this.getOtpDiaUltMod());
        fields += " OTP_CVE_ST_STATUS = ?, ";
        values.add(this.getOtpCveStStatus());
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
        String sql = "INSERT INTO OTPERITO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OTP_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getOtpOtprinc());

        fields += ", OTP_NUM_PERITO";
        fieldValues += ", ?";
        values.add(this.getOtpNumPerito());

        fields += ", OTP_NUM_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getOtpNumSolicitud());

        fields += ", OTP_TURNO";
        fieldValues += ", ?";
        values.add(this.getOtpTurno());

        fields += ", OTP_FEC_ASIGNACION";
        fieldValues += ", ?";
        values.add(this.getOtpFecAsignacion());

        fields += ", OTP_FEC_ESPERADA";
        fieldValues += ", ?";
        values.add(this.getOtpFecEsperada());

        fields += ", OTP_FEC_ENTREGA";
        fieldValues += ", ?";
        values.add(this.getOtpFecEntrega());

        fields += ", OTP_TIPO_AVALUO";
        fieldValues += ", ?";
        values.add(this.getOtpTipoAvaluo());

        fields += ", OTP_OBSER_REASIGNA";
        fieldValues += ", ?";
        values.add(this.getOtpObserReasigna());

        fields += ", OTP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtpAnoAltaReg());

        fields += ", OTP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtpMesAltaReg());

        fields += ", OTP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtpDiaAltaReg());

        fields += ", OTP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtpAnoUltMod());

        fields += ", OTP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtpMesUltMod());

        fields += ", OTP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtpDiaUltMod());

        fields += ", OTP_CVE_ST_STATUS";
        fieldValues += ", ?";
        values.add(this.getOtpCveStStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OTPERITO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OTP_OTPRINC = ?";
        values.add(this.getOtpOtprinc());
        conditions += " AND OTP_NUM_PERITO = ?";
        values.add(this.getOtpNumPerito());
        conditions += " AND OTP_NUM_SOLICITUD = ?";
        values.add(this.getOtpNumSolicitud());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Otperito instance = (Otperito) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOtpOtprinc().equals(instance.getOtpOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getOtpNumPerito().equals(instance.getOtpNumPerito()))
            equalObjects = false;
        if (equalObjects && !this.getOtpNumSolicitud().equals(instance.getOtpNumSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getOtpTurno().equals(instance.getOtpTurno()))
            equalObjects = false;
        if (equalObjects && !this.getOtpFecAsignacion().equals(instance.getOtpFecAsignacion()))
            equalObjects = false;
        if (equalObjects && !this.getOtpFecEsperada().equals(instance.getOtpFecEsperada()))
            equalObjects = false;
        if (equalObjects && !this.getOtpFecEntrega().equals(instance.getOtpFecEntrega()))
            equalObjects = false;
        if (equalObjects && !this.getOtpTipoAvaluo().equals(instance.getOtpTipoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getOtpObserReasigna().equals(instance.getOtpObserReasigna()))
            equalObjects = false;
        if (equalObjects && !this.getOtpAnoAltaReg().equals(instance.getOtpAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtpMesAltaReg().equals(instance.getOtpMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtpDiaAltaReg().equals(instance.getOtpDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtpAnoUltMod().equals(instance.getOtpAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtpMesUltMod().equals(instance.getOtpMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtpDiaUltMod().equals(instance.getOtpDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtpCveStStatus().equals(instance.getOtpCveStStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Otperito result = new Otperito();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOtpOtprinc((String) objectData.getData("OTP_OTPRINC"));
        result.setOtpNumPerito((BigDecimal) objectData.getData("OTP_NUM_PERITO"));
        result.setOtpNumSolicitud((String) objectData.getData("OTP_NUM_SOLICITUD"));
        result.setOtpTurno((String) objectData.getData("OTP_TURNO"));
        result.setOtpFecAsignacion((String) objectData.getData("OTP_FEC_ASIGNACION"));
        result.setOtpFecEsperada((String) objectData.getData("OTP_FEC_ESPERADA"));
        result.setOtpFecEntrega((String) objectData.getData("OTP_FEC_ENTREGA"));
        result.setOtpTipoAvaluo((String) objectData.getData("OTP_TIPO_AVALUO"));
        result.setOtpObserReasigna((String) objectData.getData("OTP_OBSER_REASIGNA"));
        result.setOtpAnoAltaReg((BigDecimal) objectData.getData("OTP_ANO_ALTA_REG"));
        result.setOtpMesAltaReg((BigDecimal) objectData.getData("OTP_MES_ALTA_REG"));
        result.setOtpDiaAltaReg((BigDecimal) objectData.getData("OTP_DIA_ALTA_REG"));
        result.setOtpAnoUltMod((BigDecimal) objectData.getData("OTP_ANO_ULT_MOD"));
        result.setOtpMesUltMod((BigDecimal) objectData.getData("OTP_MES_ULT_MOD"));
        result.setOtpDiaUltMod((BigDecimal) objectData.getData("OTP_DIA_ULT_MOD"));
        result.setOtpCveStStatus((String) objectData.getData("OTP_CVE_ST_STATUS"));

        return result;

    }

}
