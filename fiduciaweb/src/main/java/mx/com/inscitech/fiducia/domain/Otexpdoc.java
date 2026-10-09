package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OTEXPDOC_PK", columns = { "DXO_NUM_CAJON", "DXO_NUM_CARPETA", "DXO_OTPRINC", "DXO_TURNO", "DXO_NUM_SOLICITUD", "DXO_NUM_DOCUMEN" },
            sequences = { "MANUAL" })
public class Otexpdoc extends DomainObject {

    String dxoNumCajon = null;
    String dxoNumCarpeta = null;
    String dxoOtprinc = null;
    String dxoTurno = null;
    String dxoNumSolicitud = null;
    BigDecimal dxoNumDocumen = null;
    BigDecimal dxoNumSecDocume = null;
    String dxoDescripcion = null;
    BigDecimal dxoAnoAltaReg = null;
    BigDecimal dxoMesAltaReg = null;
    BigDecimal dxoDiaAltaReg = null;
    BigDecimal dxoAnoUltMod = null;
    BigDecimal dxoMesUltMod = null;
    BigDecimal dxoDiaUltMod = null;
    String dxoStatusOtexpdo = null;

    public Otexpdoc() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxoNumCajon(String dxoNumCajon) {
        this.dxoNumCajon = dxoNumCajon;
    }

    public String getDxoNumCajon() {
        return this.dxoNumCajon;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxoNumCarpeta(String dxoNumCarpeta) {
        this.dxoNumCarpeta = dxoNumCarpeta;
    }

    public String getDxoNumCarpeta() {
        return this.dxoNumCarpeta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxoOtprinc(String dxoOtprinc) {
        this.dxoOtprinc = dxoOtprinc;
    }

    public String getDxoOtprinc() {
        return this.dxoOtprinc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxoTurno(String dxoTurno) {
        this.dxoTurno = dxoTurno;
    }

    public String getDxoTurno() {
        return this.dxoTurno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxoNumSolicitud(String dxoNumSolicitud) {
        this.dxoNumSolicitud = dxoNumSolicitud;
    }

    public String getDxoNumSolicitud() {
        return this.dxoNumSolicitud;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDxoNumDocumen(BigDecimal dxoNumDocumen) {
        this.dxoNumDocumen = dxoNumDocumen;
    }

    public BigDecimal getDxoNumDocumen() {
        return this.dxoNumDocumen;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDxoNumSecDocume(BigDecimal dxoNumSecDocume) {
        this.dxoNumSecDocume = dxoNumSecDocume;
    }

    public BigDecimal getDxoNumSecDocume() {
        return this.dxoNumSecDocume;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxoDescripcion(String dxoDescripcion) {
        this.dxoDescripcion = dxoDescripcion;
    }

    public String getDxoDescripcion() {
        return this.dxoDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDxoAnoAltaReg(BigDecimal dxoAnoAltaReg) {
        this.dxoAnoAltaReg = dxoAnoAltaReg;
    }

    public BigDecimal getDxoAnoAltaReg() {
        return this.dxoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDxoMesAltaReg(BigDecimal dxoMesAltaReg) {
        this.dxoMesAltaReg = dxoMesAltaReg;
    }

    public BigDecimal getDxoMesAltaReg() {
        return this.dxoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDxoDiaAltaReg(BigDecimal dxoDiaAltaReg) {
        this.dxoDiaAltaReg = dxoDiaAltaReg;
    }

    public BigDecimal getDxoDiaAltaReg() {
        return this.dxoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDxoAnoUltMod(BigDecimal dxoAnoUltMod) {
        this.dxoAnoUltMod = dxoAnoUltMod;
    }

    public BigDecimal getDxoAnoUltMod() {
        return this.dxoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDxoMesUltMod(BigDecimal dxoMesUltMod) {
        this.dxoMesUltMod = dxoMesUltMod;
    }

    public BigDecimal getDxoMesUltMod() {
        return this.dxoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDxoDiaUltMod(BigDecimal dxoDiaUltMod) {
        this.dxoDiaUltMod = dxoDiaUltMod;
    }

    public BigDecimal getDxoDiaUltMod() {
        return this.dxoDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxoStatusOtexpdo(String dxoStatusOtexpdo) {
        this.dxoStatusOtexpdo = dxoStatusOtexpdo;
    }

    public String getDxoStatusOtexpdo() {
        return this.dxoStatusOtexpdo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OTEXPDOC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDxoNumCajon() != null && "null".equals(this.getDxoNumCajon())) {
            conditions += " AND DXO_NUM_CAJON IS NULL";
        } else if (this.getDxoNumCajon() != null) {
            conditions += " AND DXO_NUM_CAJON = ?";
            values.add(this.getDxoNumCajon());
        }

        if (this.getDxoNumCarpeta() != null && "null".equals(this.getDxoNumCarpeta())) {
            conditions += " AND DXO_NUM_CARPETA IS NULL";
        } else if (this.getDxoNumCarpeta() != null) {
            conditions += " AND DXO_NUM_CARPETA = ?";
            values.add(this.getDxoNumCarpeta());
        }

        if (this.getDxoOtprinc() != null && "null".equals(this.getDxoOtprinc())) {
            conditions += " AND DXO_OTPRINC IS NULL";
        } else if (this.getDxoOtprinc() != null) {
            conditions += " AND DXO_OTPRINC = ?";
            values.add(this.getDxoOtprinc());
        }

        if (this.getDxoTurno() != null && "null".equals(this.getDxoTurno())) {
            conditions += " AND DXO_TURNO IS NULL";
        } else if (this.getDxoTurno() != null) {
            conditions += " AND DXO_TURNO = ?";
            values.add(this.getDxoTurno());
        }

        if (this.getDxoNumSolicitud() != null && "null".equals(this.getDxoNumSolicitud())) {
            conditions += " AND DXO_NUM_SOLICITUD IS NULL";
        } else if (this.getDxoNumSolicitud() != null) {
            conditions += " AND DXO_NUM_SOLICITUD = ?";
            values.add(this.getDxoNumSolicitud());
        }

        if (this.getDxoNumDocumen() != null && this.getDxoNumDocumen().longValue() == -999) {
            conditions += " AND DXO_NUM_DOCUMEN IS NULL";
        } else if (this.getDxoNumDocumen() != null) {
            conditions += " AND DXO_NUM_DOCUMEN = ?";
            values.add(this.getDxoNumDocumen());
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
        String sql = "SELECT * FROM OTEXPDOC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDxoNumCajon() != null && "null".equals(this.getDxoNumCajon())) {
            conditions += " AND DXO_NUM_CAJON IS NULL";
        } else if (this.getDxoNumCajon() != null) {
            conditions += " AND DXO_NUM_CAJON = ?";
            values.add(this.getDxoNumCajon());
        }

        if (this.getDxoNumCarpeta() != null && "null".equals(this.getDxoNumCarpeta())) {
            conditions += " AND DXO_NUM_CARPETA IS NULL";
        } else if (this.getDxoNumCarpeta() != null) {
            conditions += " AND DXO_NUM_CARPETA = ?";
            values.add(this.getDxoNumCarpeta());
        }

        if (this.getDxoOtprinc() != null && "null".equals(this.getDxoOtprinc())) {
            conditions += " AND DXO_OTPRINC IS NULL";
        } else if (this.getDxoOtprinc() != null) {
            conditions += " AND DXO_OTPRINC = ?";
            values.add(this.getDxoOtprinc());
        }

        if (this.getDxoTurno() != null && "null".equals(this.getDxoTurno())) {
            conditions += " AND DXO_TURNO IS NULL";
        } else if (this.getDxoTurno() != null) {
            conditions += " AND DXO_TURNO = ?";
            values.add(this.getDxoTurno());
        }

        if (this.getDxoNumSolicitud() != null && "null".equals(this.getDxoNumSolicitud())) {
            conditions += " AND DXO_NUM_SOLICITUD IS NULL";
        } else if (this.getDxoNumSolicitud() != null) {
            conditions += " AND DXO_NUM_SOLICITUD = ?";
            values.add(this.getDxoNumSolicitud());
        }

        if (this.getDxoNumDocumen() != null && this.getDxoNumDocumen().longValue() == -999) {
            conditions += " AND DXO_NUM_DOCUMEN IS NULL";
        } else if (this.getDxoNumDocumen() != null) {
            conditions += " AND DXO_NUM_DOCUMEN = ?";
            values.add(this.getDxoNumDocumen());
        }

        if (this.getDxoNumSecDocume() != null && this.getDxoNumSecDocume().longValue() == -999) {
            conditions += " AND DXO_NUM_SEC_DOCUME IS NULL";
        } else if (this.getDxoNumSecDocume() != null) {
            conditions += " AND DXO_NUM_SEC_DOCUME = ?";
            values.add(this.getDxoNumSecDocume());
        }

        if (this.getDxoDescripcion() != null && "null".equals(this.getDxoDescripcion())) {
            conditions += " AND DXO_DESCRIPCION IS NULL";
        } else if (this.getDxoDescripcion() != null) {
            conditions += " AND DXO_DESCRIPCION = ?";
            values.add(this.getDxoDescripcion());
        }

        if (this.getDxoAnoAltaReg() != null && this.getDxoAnoAltaReg().longValue() == -999) {
            conditions += " AND DXO_ANO_ALTA_REG IS NULL";
        } else if (this.getDxoAnoAltaReg() != null) {
            conditions += " AND DXO_ANO_ALTA_REG = ?";
            values.add(this.getDxoAnoAltaReg());
        }

        if (this.getDxoMesAltaReg() != null && this.getDxoMesAltaReg().longValue() == -999) {
            conditions += " AND DXO_MES_ALTA_REG IS NULL";
        } else if (this.getDxoMesAltaReg() != null) {
            conditions += " AND DXO_MES_ALTA_REG = ?";
            values.add(this.getDxoMesAltaReg());
        }

        if (this.getDxoDiaAltaReg() != null && this.getDxoDiaAltaReg().longValue() == -999) {
            conditions += " AND DXO_DIA_ALTA_REG IS NULL";
        } else if (this.getDxoDiaAltaReg() != null) {
            conditions += " AND DXO_DIA_ALTA_REG = ?";
            values.add(this.getDxoDiaAltaReg());
        }

        if (this.getDxoAnoUltMod() != null && this.getDxoAnoUltMod().longValue() == -999) {
            conditions += " AND DXO_ANO_ULT_MOD IS NULL";
        } else if (this.getDxoAnoUltMod() != null) {
            conditions += " AND DXO_ANO_ULT_MOD = ?";
            values.add(this.getDxoAnoUltMod());
        }

        if (this.getDxoMesUltMod() != null && this.getDxoMesUltMod().longValue() == -999) {
            conditions += " AND DXO_MES_ULT_MOD IS NULL";
        } else if (this.getDxoMesUltMod() != null) {
            conditions += " AND DXO_MES_ULT_MOD = ?";
            values.add(this.getDxoMesUltMod());
        }

        if (this.getDxoDiaUltMod() != null && this.getDxoDiaUltMod().longValue() == -999) {
            conditions += " AND DXO_DIA_ULT_MOD IS NULL";
        } else if (this.getDxoDiaUltMod() != null) {
            conditions += " AND DXO_DIA_ULT_MOD = ?";
            values.add(this.getDxoDiaUltMod());
        }

        if (this.getDxoStatusOtexpdo() != null && "null".equals(this.getDxoStatusOtexpdo())) {
            conditions += " AND DXO_STATUS_OTEXPDO IS NULL";
        } else if (this.getDxoStatusOtexpdo() != null) {
            conditions += " AND DXO_STATUS_OTEXPDO = ?";
            values.add(this.getDxoStatusOtexpdo());
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
        String sql = "UPDATE OTEXPDOC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DXO_NUM_CAJON = ?";
        pkValues.add(this.getDxoNumCajon());
        conditions += " AND DXO_NUM_CARPETA = ?";
        pkValues.add(this.getDxoNumCarpeta());
        conditions += " AND DXO_OTPRINC = ?";
        pkValues.add(this.getDxoOtprinc());
        conditions += " AND DXO_TURNO = ?";
        pkValues.add(this.getDxoTurno());
        conditions += " AND DXO_NUM_SOLICITUD = ?";
        pkValues.add(this.getDxoNumSolicitud());
        conditions += " AND DXO_NUM_DOCUMEN = ?";
        pkValues.add(this.getDxoNumDocumen());
        fields += " DXO_NUM_SEC_DOCUME = ?, ";
        values.add(this.getDxoNumSecDocume());
        fields += " DXO_DESCRIPCION = ?, ";
        values.add(this.getDxoDescripcion());
        fields += " DXO_ANO_ALTA_REG = ?, ";
        values.add(this.getDxoAnoAltaReg());
        fields += " DXO_MES_ALTA_REG = ?, ";
        values.add(this.getDxoMesAltaReg());
        fields += " DXO_DIA_ALTA_REG = ?, ";
        values.add(this.getDxoDiaAltaReg());
        fields += " DXO_ANO_ULT_MOD = ?, ";
        values.add(this.getDxoAnoUltMod());
        fields += " DXO_MES_ULT_MOD = ?, ";
        values.add(this.getDxoMesUltMod());
        fields += " DXO_DIA_ULT_MOD = ?, ";
        values.add(this.getDxoDiaUltMod());
        fields += " DXO_STATUS_OTEXPDO = ?, ";
        values.add(this.getDxoStatusOtexpdo());
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
        String sql = "INSERT INTO OTEXPDOC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DXO_NUM_CAJON";
        fieldValues += ", ?";
        values.add(this.getDxoNumCajon());

        fields += ", DXO_NUM_CARPETA";
        fieldValues += ", ?";
        values.add(this.getDxoNumCarpeta());

        fields += ", DXO_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getDxoOtprinc());

        fields += ", DXO_TURNO";
        fieldValues += ", ?";
        values.add(this.getDxoTurno());

        fields += ", DXO_NUM_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getDxoNumSolicitud());

        fields += ", DXO_NUM_DOCUMEN";
        fieldValues += ", ?";
        values.add(this.getDxoNumDocumen());

        fields += ", DXO_NUM_SEC_DOCUME";
        fieldValues += ", ?";
        values.add(this.getDxoNumSecDocume());

        fields += ", DXO_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getDxoDescripcion());

        fields += ", DXO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDxoAnoAltaReg());

        fields += ", DXO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDxoMesAltaReg());

        fields += ", DXO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDxoDiaAltaReg());

        fields += ", DXO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDxoAnoUltMod());

        fields += ", DXO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDxoMesUltMod());

        fields += ", DXO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDxoDiaUltMod());

        fields += ", DXO_STATUS_OTEXPDO";
        fieldValues += ", ?";
        values.add(this.getDxoStatusOtexpdo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OTEXPDOC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DXO_NUM_CAJON = ?";
        values.add(this.getDxoNumCajon());
        conditions += " AND DXO_NUM_CARPETA = ?";
        values.add(this.getDxoNumCarpeta());
        conditions += " AND DXO_OTPRINC = ?";
        values.add(this.getDxoOtprinc());
        conditions += " AND DXO_TURNO = ?";
        values.add(this.getDxoTurno());
        conditions += " AND DXO_NUM_SOLICITUD = ?";
        values.add(this.getDxoNumSolicitud());
        conditions += " AND DXO_NUM_DOCUMEN = ?";
        values.add(this.getDxoNumDocumen());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Otexpdoc instance = (Otexpdoc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDxoNumCajon().equals(instance.getDxoNumCajon()))
            equalObjects = false;
        if (equalObjects && !this.getDxoNumCarpeta().equals(instance.getDxoNumCarpeta()))
            equalObjects = false;
        if (equalObjects && !this.getDxoOtprinc().equals(instance.getDxoOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getDxoTurno().equals(instance.getDxoTurno()))
            equalObjects = false;
        if (equalObjects && !this.getDxoNumSolicitud().equals(instance.getDxoNumSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getDxoNumDocumen().equals(instance.getDxoNumDocumen()))
            equalObjects = false;
        if (equalObjects && !this.getDxoNumSecDocume().equals(instance.getDxoNumSecDocume()))
            equalObjects = false;
        if (equalObjects && !this.getDxoDescripcion().equals(instance.getDxoDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getDxoAnoAltaReg().equals(instance.getDxoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDxoMesAltaReg().equals(instance.getDxoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDxoDiaAltaReg().equals(instance.getDxoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDxoAnoUltMod().equals(instance.getDxoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDxoMesUltMod().equals(instance.getDxoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDxoDiaUltMod().equals(instance.getDxoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDxoStatusOtexpdo().equals(instance.getDxoStatusOtexpdo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Otexpdoc result = new Otexpdoc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDxoNumCajon((String) objectData.getData("DXO_NUM_CAJON"));
        result.setDxoNumCarpeta((String) objectData.getData("DXO_NUM_CARPETA"));
        result.setDxoOtprinc((String) objectData.getData("DXO_OTPRINC"));
        result.setDxoTurno((String) objectData.getData("DXO_TURNO"));
        result.setDxoNumSolicitud((String) objectData.getData("DXO_NUM_SOLICITUD"));
        result.setDxoNumDocumen((BigDecimal) objectData.getData("DXO_NUM_DOCUMEN"));
        result.setDxoNumSecDocume((BigDecimal) objectData.getData("DXO_NUM_SEC_DOCUME"));
        result.setDxoDescripcion((String) objectData.getData("DXO_DESCRIPCION"));
        result.setDxoAnoAltaReg((BigDecimal) objectData.getData("DXO_ANO_ALTA_REG"));
        result.setDxoMesAltaReg((BigDecimal) objectData.getData("DXO_MES_ALTA_REG"));
        result.setDxoDiaAltaReg((BigDecimal) objectData.getData("DXO_DIA_ALTA_REG"));
        result.setDxoAnoUltMod((BigDecimal) objectData.getData("DXO_ANO_ULT_MOD"));
        result.setDxoMesUltMod((BigDecimal) objectData.getData("DXO_MES_ULT_MOD"));
        result.setDxoDiaUltMod((BigDecimal) objectData.getData("DXO_DIA_ULT_MOD"));
        result.setDxoStatusOtexpdo((String) objectData.getData("DXO_STATUS_OTEXPDO"));

        return result;

    }

}
