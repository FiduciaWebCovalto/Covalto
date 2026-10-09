package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OTEXPEDIEN_PK", columns = { "EXO_NUM_CAJON", "EXO_NUM_CARPETA", "EXO_NUM_SOLICITUD", "EXO_OTPRINC", "EXO_TURNO" }, sequences = { "MANUAL" })
public class Otexpedien extends DomainObject {

    String exoNumCajon = null;
    String exoNumCarpeta = null;
    String exoOtprinc = null;
    String exoTurno = null;
    String exoNumSolicitud = null;
    String exoObservaciones = null;
    BigDecimal exoAnoAltaReg = null;
    BigDecimal exoMesAltaReg = null;
    BigDecimal exoDiaAltaReg = null;
    BigDecimal exoAnoUltMod = null;
    BigDecimal exoMesUltMod = null;
    BigDecimal exoDiaUltMod = null;
    String exoCveStOtexped = null;

    public Otexpedien() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExoNumCajon(String exoNumCajon) {
        this.exoNumCajon = exoNumCajon;
    }

    public String getExoNumCajon() {
        return this.exoNumCajon;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExoNumCarpeta(String exoNumCarpeta) {
        this.exoNumCarpeta = exoNumCarpeta;
    }

    public String getExoNumCarpeta() {
        return this.exoNumCarpeta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExoOtprinc(String exoOtprinc) {
        this.exoOtprinc = exoOtprinc;
    }

    public String getExoOtprinc() {
        return this.exoOtprinc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExoTurno(String exoTurno) {
        this.exoTurno = exoTurno;
    }

    public String getExoTurno() {
        return this.exoTurno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExoNumSolicitud(String exoNumSolicitud) {
        this.exoNumSolicitud = exoNumSolicitud;
    }

    public String getExoNumSolicitud() {
        return this.exoNumSolicitud;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExoObservaciones(String exoObservaciones) {
        this.exoObservaciones = exoObservaciones;
    }

    public String getExoObservaciones() {
        return this.exoObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExoAnoAltaReg(BigDecimal exoAnoAltaReg) {
        this.exoAnoAltaReg = exoAnoAltaReg;
    }

    public BigDecimal getExoAnoAltaReg() {
        return this.exoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExoMesAltaReg(BigDecimal exoMesAltaReg) {
        this.exoMesAltaReg = exoMesAltaReg;
    }

    public BigDecimal getExoMesAltaReg() {
        return this.exoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExoDiaAltaReg(BigDecimal exoDiaAltaReg) {
        this.exoDiaAltaReg = exoDiaAltaReg;
    }

    public BigDecimal getExoDiaAltaReg() {
        return this.exoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExoAnoUltMod(BigDecimal exoAnoUltMod) {
        this.exoAnoUltMod = exoAnoUltMod;
    }

    public BigDecimal getExoAnoUltMod() {
        return this.exoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExoMesUltMod(BigDecimal exoMesUltMod) {
        this.exoMesUltMod = exoMesUltMod;
    }

    public BigDecimal getExoMesUltMod() {
        return this.exoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExoDiaUltMod(BigDecimal exoDiaUltMod) {
        this.exoDiaUltMod = exoDiaUltMod;
    }

    public BigDecimal getExoDiaUltMod() {
        return this.exoDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExoCveStOtexped(String exoCveStOtexped) {
        this.exoCveStOtexped = exoCveStOtexped;
    }

    public String getExoCveStOtexped() {
        return this.exoCveStOtexped;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OTEXPEDIEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExoNumCajon() != null && "null".equals(this.getExoNumCajon())) {
            conditions += " AND EXO_NUM_CAJON IS NULL";
        } else if (this.getExoNumCajon() != null) {
            conditions += " AND EXO_NUM_CAJON = ?";
            values.add(this.getExoNumCajon());
        }

        if (this.getExoNumCarpeta() != null && "null".equals(this.getExoNumCarpeta())) {
            conditions += " AND EXO_NUM_CARPETA IS NULL";
        } else if (this.getExoNumCarpeta() != null) {
            conditions += " AND EXO_NUM_CARPETA = ?";
            values.add(this.getExoNumCarpeta());
        }

        if (this.getExoOtprinc() != null && "null".equals(this.getExoOtprinc())) {
            conditions += " AND EXO_OTPRINC IS NULL";
        } else if (this.getExoOtprinc() != null) {
            conditions += " AND EXO_OTPRINC = ?";
            values.add(this.getExoOtprinc());
        }

        if (this.getExoTurno() != null && "null".equals(this.getExoTurno())) {
            conditions += " AND EXO_TURNO IS NULL";
        } else if (this.getExoTurno() != null) {
            conditions += " AND EXO_TURNO = ?";
            values.add(this.getExoTurno());
        }

        if (this.getExoNumSolicitud() != null && "null".equals(this.getExoNumSolicitud())) {
            conditions += " AND EXO_NUM_SOLICITUD IS NULL";
        } else if (this.getExoNumSolicitud() != null) {
            conditions += " AND EXO_NUM_SOLICITUD = ?";
            values.add(this.getExoNumSolicitud());
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
        String sql = "SELECT * FROM OTEXPEDIEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExoNumCajon() != null && "null".equals(this.getExoNumCajon())) {
            conditions += " AND EXO_NUM_CAJON IS NULL";
        } else if (this.getExoNumCajon() != null) {
            conditions += " AND EXO_NUM_CAJON = ?";
            values.add(this.getExoNumCajon());
        }

        if (this.getExoNumCarpeta() != null && "null".equals(this.getExoNumCarpeta())) {
            conditions += " AND EXO_NUM_CARPETA IS NULL";
        } else if (this.getExoNumCarpeta() != null) {
            conditions += " AND EXO_NUM_CARPETA = ?";
            values.add(this.getExoNumCarpeta());
        }

        if (this.getExoOtprinc() != null && "null".equals(this.getExoOtprinc())) {
            conditions += " AND EXO_OTPRINC IS NULL";
        } else if (this.getExoOtprinc() != null) {
            conditions += " AND EXO_OTPRINC = ?";
            values.add(this.getExoOtprinc());
        }

        if (this.getExoTurno() != null && "null".equals(this.getExoTurno())) {
            conditions += " AND EXO_TURNO IS NULL";
        } else if (this.getExoTurno() != null) {
            conditions += " AND EXO_TURNO = ?";
            values.add(this.getExoTurno());
        }

        if (this.getExoNumSolicitud() != null && "null".equals(this.getExoNumSolicitud())) {
            conditions += " AND EXO_NUM_SOLICITUD IS NULL";
        } else if (this.getExoNumSolicitud() != null) {
            conditions += " AND EXO_NUM_SOLICITUD = ?";
            values.add(this.getExoNumSolicitud());
        }

        if (this.getExoObservaciones() != null && "null".equals(this.getExoObservaciones())) {
            conditions += " AND EXO_OBSERVACIONES IS NULL";
        } else if (this.getExoObservaciones() != null) {
            conditions += " AND EXO_OBSERVACIONES = ?";
            values.add(this.getExoObservaciones());
        }

        if (this.getExoAnoAltaReg() != null && this.getExoAnoAltaReg().longValue() == -999) {
            conditions += " AND EXO_ANO_ALTA_REG IS NULL";
        } else if (this.getExoAnoAltaReg() != null) {
            conditions += " AND EXO_ANO_ALTA_REG = ?";
            values.add(this.getExoAnoAltaReg());
        }

        if (this.getExoMesAltaReg() != null && this.getExoMesAltaReg().longValue() == -999) {
            conditions += " AND EXO_MES_ALTA_REG IS NULL";
        } else if (this.getExoMesAltaReg() != null) {
            conditions += " AND EXO_MES_ALTA_REG = ?";
            values.add(this.getExoMesAltaReg());
        }

        if (this.getExoDiaAltaReg() != null && this.getExoDiaAltaReg().longValue() == -999) {
            conditions += " AND EXO_DIA_ALTA_REG IS NULL";
        } else if (this.getExoDiaAltaReg() != null) {
            conditions += " AND EXO_DIA_ALTA_REG = ?";
            values.add(this.getExoDiaAltaReg());
        }

        if (this.getExoAnoUltMod() != null && this.getExoAnoUltMod().longValue() == -999) {
            conditions += " AND EXO_ANO_ULT_MOD IS NULL";
        } else if (this.getExoAnoUltMod() != null) {
            conditions += " AND EXO_ANO_ULT_MOD = ?";
            values.add(this.getExoAnoUltMod());
        }

        if (this.getExoMesUltMod() != null && this.getExoMesUltMod().longValue() == -999) {
            conditions += " AND EXO_MES_ULT_MOD IS NULL";
        } else if (this.getExoMesUltMod() != null) {
            conditions += " AND EXO_MES_ULT_MOD = ?";
            values.add(this.getExoMesUltMod());
        }

        if (this.getExoDiaUltMod() != null && this.getExoDiaUltMod().longValue() == -999) {
            conditions += " AND EXO_DIA_ULT_MOD IS NULL";
        } else if (this.getExoDiaUltMod() != null) {
            conditions += " AND EXO_DIA_ULT_MOD = ?";
            values.add(this.getExoDiaUltMod());
        }

        if (this.getExoCveStOtexped() != null && "null".equals(this.getExoCveStOtexped())) {
            conditions += " AND EXO_CVE_ST_OTEXPED IS NULL";
        } else if (this.getExoCveStOtexped() != null) {
            conditions += " AND EXO_CVE_ST_OTEXPED = ?";
            values.add(this.getExoCveStOtexped());
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
        String sql = "UPDATE OTEXPEDIEN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EXO_NUM_CAJON = ?";
        pkValues.add(this.getExoNumCajon());
        conditions += " AND EXO_NUM_CARPETA = ?";
        pkValues.add(this.getExoNumCarpeta());
        conditions += " AND EXO_OTPRINC = ?";
        pkValues.add(this.getExoOtprinc());
        conditions += " AND EXO_TURNO = ?";
        pkValues.add(this.getExoTurno());
        conditions += " AND EXO_NUM_SOLICITUD = ?";
        pkValues.add(this.getExoNumSolicitud());
        fields += " EXO_OBSERVACIONES = ?, ";
        values.add(this.getExoObservaciones());
        fields += " EXO_ANO_ALTA_REG = ?, ";
        values.add(this.getExoAnoAltaReg());
        fields += " EXO_MES_ALTA_REG = ?, ";
        values.add(this.getExoMesAltaReg());
        fields += " EXO_DIA_ALTA_REG = ?, ";
        values.add(this.getExoDiaAltaReg());
        fields += " EXO_ANO_ULT_MOD = ?, ";
        values.add(this.getExoAnoUltMod());
        fields += " EXO_MES_ULT_MOD = ?, ";
        values.add(this.getExoMesUltMod());
        fields += " EXO_DIA_ULT_MOD = ?, ";
        values.add(this.getExoDiaUltMod());
        fields += " EXO_CVE_ST_OTEXPED = ?, ";
        values.add(this.getExoCveStOtexped());
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
        String sql = "INSERT INTO OTEXPEDIEN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EXO_NUM_CAJON";
        fieldValues += ", ?";
        values.add(this.getExoNumCajon());

        fields += ", EXO_NUM_CARPETA";
        fieldValues += ", ?";
        values.add(this.getExoNumCarpeta());

        fields += ", EXO_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getExoOtprinc());

        fields += ", EXO_TURNO";
        fieldValues += ", ?";
        values.add(this.getExoTurno());

        fields += ", EXO_NUM_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getExoNumSolicitud());

        fields += ", EXO_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getExoObservaciones());

        fields += ", EXO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExoAnoAltaReg());

        fields += ", EXO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExoMesAltaReg());

        fields += ", EXO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExoDiaAltaReg());

        fields += ", EXO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExoAnoUltMod());

        fields += ", EXO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExoMesUltMod());

        fields += ", EXO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExoDiaUltMod());

        fields += ", EXO_CVE_ST_OTEXPED";
        fieldValues += ", ?";
        values.add(this.getExoCveStOtexped());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OTEXPEDIEN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EXO_NUM_CAJON = ?";
        values.add(this.getExoNumCajon());
        conditions += " AND EXO_NUM_CARPETA = ?";
        values.add(this.getExoNumCarpeta());
        conditions += " AND EXO_OTPRINC = ?";
        values.add(this.getExoOtprinc());
        conditions += " AND EXO_TURNO = ?";
        values.add(this.getExoTurno());
        conditions += " AND EXO_NUM_SOLICITUD = ?";
        values.add(this.getExoNumSolicitud());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Otexpedien instance = (Otexpedien) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getExoNumCajon().equals(instance.getExoNumCajon()))
            equalObjects = false;
        if (equalObjects && !this.getExoNumCarpeta().equals(instance.getExoNumCarpeta()))
            equalObjects = false;
        if (equalObjects && !this.getExoOtprinc().equals(instance.getExoOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getExoTurno().equals(instance.getExoTurno()))
            equalObjects = false;
        if (equalObjects && !this.getExoNumSolicitud().equals(instance.getExoNumSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getExoObservaciones().equals(instance.getExoObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getExoAnoAltaReg().equals(instance.getExoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExoMesAltaReg().equals(instance.getExoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExoDiaAltaReg().equals(instance.getExoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExoAnoUltMod().equals(instance.getExoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExoMesUltMod().equals(instance.getExoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExoDiaUltMod().equals(instance.getExoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExoCveStOtexped().equals(instance.getExoCveStOtexped()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Otexpedien result = new Otexpedien();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setExoNumCajon((String) objectData.getData("EXO_NUM_CAJON"));
        result.setExoNumCarpeta((String) objectData.getData("EXO_NUM_CARPETA"));
        result.setExoOtprinc((String) objectData.getData("EXO_OTPRINC"));
        result.setExoTurno((String) objectData.getData("EXO_TURNO"));
        result.setExoNumSolicitud((String) objectData.getData("EXO_NUM_SOLICITUD"));
        result.setExoObservaciones((String) objectData.getData("EXO_OBSERVACIONES"));
        result.setExoAnoAltaReg((BigDecimal) objectData.getData("EXO_ANO_ALTA_REG"));
        result.setExoMesAltaReg((BigDecimal) objectData.getData("EXO_MES_ALTA_REG"));
        result.setExoDiaAltaReg((BigDecimal) objectData.getData("EXO_DIA_ALTA_REG"));
        result.setExoAnoUltMod((BigDecimal) objectData.getData("EXO_ANO_ULT_MOD"));
        result.setExoMesUltMod((BigDecimal) objectData.getData("EXO_MES_ULT_MOD"));
        result.setExoDiaUltMod((BigDecimal) objectData.getData("EXO_DIA_ULT_MOD"));
        result.setExoCveStOtexped((String) objectData.getData("EXO_CVE_ST_OTEXPED"));

        return result;

    }

}
