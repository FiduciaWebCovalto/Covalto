package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTO_REV_PK", columns = { "CTR_CONTRATO" }, sequences = { "MAX" })
public class CtoRev extends DomainObject {

    BigDecimal ctrContrato = null;
    String ctrMotivo = null;
    String ctrComentario = null;
    String ctrFecha = null;
    BigDecimal ctrUsuario = null;
    String ctrFiducSust = null;
    String ctrFecSust = null;
    BigDecimal ctrAnoAltReg = null;
    BigDecimal ctrMesAltReg = null;
    BigDecimal ctrDiaAltReg = null;
    BigDecimal ctrAnoUltMod = null;
    BigDecimal ctrMesUltMod = null;
    BigDecimal ctrDiaUltMod = null;
    String ctrCveStatus = null;

    public CtoRev() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtrContrato(BigDecimal ctrContrato) {
        this.ctrContrato = ctrContrato;
    }

    public BigDecimal getCtrContrato() {
        return this.ctrContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtrMotivo(String ctrMotivo) {
        this.ctrMotivo = ctrMotivo;
    }

    public String getCtrMotivo() {
        return this.ctrMotivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtrComentario(String ctrComentario) {
        this.ctrComentario = ctrComentario;
    }

    public String getCtrComentario() {
        return this.ctrComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtrFecha(String ctrFecha) {
        this.ctrFecha = ctrFecha;
    }

    public String getCtrFecha() {
        return this.ctrFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtrUsuario(BigDecimal ctrUsuario) {
        this.ctrUsuario = ctrUsuario;
    }

    public BigDecimal getCtrUsuario() {
        return this.ctrUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtrFiducSust(String ctrFiducSust) {
        this.ctrFiducSust = ctrFiducSust;
    }

    public String getCtrFiducSust() {
        return this.ctrFiducSust;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtrFecSust(String ctrFecSust) {
        this.ctrFecSust = ctrFecSust;
    }

    public String getCtrFecSust() {
        return this.ctrFecSust;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtrAnoAltReg(BigDecimal ctrAnoAltReg) {
        this.ctrAnoAltReg = ctrAnoAltReg;
    }

    public BigDecimal getCtrAnoAltReg() {
        return this.ctrAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtrMesAltReg(BigDecimal ctrMesAltReg) {
        this.ctrMesAltReg = ctrMesAltReg;
    }

    public BigDecimal getCtrMesAltReg() {
        return this.ctrMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtrDiaAltReg(BigDecimal ctrDiaAltReg) {
        this.ctrDiaAltReg = ctrDiaAltReg;
    }

    public BigDecimal getCtrDiaAltReg() {
        return this.ctrDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtrAnoUltMod(BigDecimal ctrAnoUltMod) {
        this.ctrAnoUltMod = ctrAnoUltMod;
    }

    public BigDecimal getCtrAnoUltMod() {
        return this.ctrAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtrMesUltMod(BigDecimal ctrMesUltMod) {
        this.ctrMesUltMod = ctrMesUltMod;
    }

    public BigDecimal getCtrMesUltMod() {
        return this.ctrMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtrDiaUltMod(BigDecimal ctrDiaUltMod) {
        this.ctrDiaUltMod = ctrDiaUltMod;
    }

    public BigDecimal getCtrDiaUltMod() {
        return this.ctrDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtrCveStatus(String ctrCveStatus) {
        this.ctrCveStatus = ctrCveStatus;
    }

    public String getCtrCveStatus() {
        return this.ctrCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTO_REV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtrContrato() != null && this.getCtrContrato().longValue() == -999) {
            conditions += " AND CTR_CONTRATO IS NULL";
        } else if (this.getCtrContrato() != null) {
            conditions += " AND CTR_CONTRATO = ?";
            values.add(this.getCtrContrato());
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
        String sql = "SELECT * FROM CTO_REV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtrContrato() != null && this.getCtrContrato().longValue() == -999) {
            conditions += " AND CTR_CONTRATO IS NULL";
        } else if (this.getCtrContrato() != null) {
            conditions += " AND CTR_CONTRATO = ?";
            values.add(this.getCtrContrato());
        }

        if (this.getCtrMotivo() != null && "null".equals(this.getCtrMotivo())) {
            conditions += " AND CTR_MOTIVO IS NULL";
        } else if (this.getCtrMotivo() != null) {
            conditions += " AND CTR_MOTIVO = ?";
            values.add(this.getCtrMotivo());
        }

        if (this.getCtrComentario() != null && "null".equals(this.getCtrComentario())) {
            conditions += " AND CTR_COMENTARIO IS NULL";
        } else if (this.getCtrComentario() != null) {
            conditions += " AND CTR_COMENTARIO = ?";
            values.add(this.getCtrComentario());
        }

        if (this.getCtrFecha() != null && "null".equals(this.getCtrFecha())) {
            conditions += " AND CTR_FECHA IS NULL";
        } else if (this.getCtrFecha() != null) {
            conditions += " AND CTR_FECHA = ?";
            values.add(this.getCtrFecha());
        }

        if (this.getCtrUsuario() != null && this.getCtrUsuario().longValue() == -999) {
            conditions += " AND CTR_USUARIO IS NULL";
        } else if (this.getCtrUsuario() != null) {
            conditions += " AND CTR_USUARIO = ?";
            values.add(this.getCtrUsuario());
        }

        if (this.getCtrFiducSust() != null && "null".equals(this.getCtrFiducSust())) {
            conditions += " AND CTR_FIDUC_SUST IS NULL";
        } else if (this.getCtrFiducSust() != null) {
            conditions += " AND CTR_FIDUC_SUST = ?";
            values.add(this.getCtrFiducSust());
        }

        if (this.getCtrFecSust() != null && "null".equals(this.getCtrFecSust())) {
            conditions += " AND CTR_FEC_SUST IS NULL";
        } else if (this.getCtrFecSust() != null) {
            conditions += " AND CTR_FEC_SUST = ?";
            values.add(this.getCtrFecSust());
        }

        if (this.getCtrAnoAltReg() != null && this.getCtrAnoAltReg().longValue() == -999) {
            conditions += " AND CTR_ANO_ALT_REG IS NULL";
        } else if (this.getCtrAnoAltReg() != null) {
            conditions += " AND CTR_ANO_ALT_REG = ?";
            values.add(this.getCtrAnoAltReg());
        }

        if (this.getCtrMesAltReg() != null && this.getCtrMesAltReg().longValue() == -999) {
            conditions += " AND CTR_MES_ALT_REG IS NULL";
        } else if (this.getCtrMesAltReg() != null) {
            conditions += " AND CTR_MES_ALT_REG = ?";
            values.add(this.getCtrMesAltReg());
        }

        if (this.getCtrDiaAltReg() != null && this.getCtrDiaAltReg().longValue() == -999) {
            conditions += " AND CTR_DIA_ALT_REG IS NULL";
        } else if (this.getCtrDiaAltReg() != null) {
            conditions += " AND CTR_DIA_ALT_REG = ?";
            values.add(this.getCtrDiaAltReg());
        }

        if (this.getCtrAnoUltMod() != null && this.getCtrAnoUltMod().longValue() == -999) {
            conditions += " AND CTR_ANO_ULT_MOD IS NULL";
        } else if (this.getCtrAnoUltMod() != null) {
            conditions += " AND CTR_ANO_ULT_MOD = ?";
            values.add(this.getCtrAnoUltMod());
        }

        if (this.getCtrMesUltMod() != null && this.getCtrMesUltMod().longValue() == -999) {
            conditions += " AND CTR_MES_ULT_MOD IS NULL";
        } else if (this.getCtrMesUltMod() != null) {
            conditions += " AND CTR_MES_ULT_MOD = ?";
            values.add(this.getCtrMesUltMod());
        }

        if (this.getCtrDiaUltMod() != null && this.getCtrDiaUltMod().longValue() == -999) {
            conditions += " AND CTR_DIA_ULT_MOD IS NULL";
        } else if (this.getCtrDiaUltMod() != null) {
            conditions += " AND CTR_DIA_ULT_MOD = ?";
            values.add(this.getCtrDiaUltMod());
        }

        if (this.getCtrCveStatus() != null && "null".equals(this.getCtrCveStatus())) {
            conditions += " AND CTR_CVE_STATUS IS NULL";
        } else if (this.getCtrCveStatus() != null) {
            conditions += " AND CTR_CVE_STATUS = ?";
            values.add(this.getCtrCveStatus());
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
        String sql = "UPDATE CTO_REV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTR_CONTRATO = ?";
        pkValues.add(this.getCtrContrato());
        fields += " CTR_MOTIVO = ?, ";
        values.add(this.getCtrMotivo());
        fields += " CTR_COMENTARIO = ?, ";
        values.add(this.getCtrComentario());
        fields += " CTR_FECHA = ?, ";
        values.add(this.getCtrFecha());
        fields += " CTR_USUARIO = ?, ";
        values.add(this.getCtrUsuario());
        fields += " CTR_FIDUC_SUST = ?, ";
        values.add(this.getCtrFiducSust());
        fields += " CTR_FEC_SUST = ?, ";
        values.add(this.getCtrFecSust());
        fields += " CTR_ANO_ALT_REG = ?, ";
        values.add(this.getCtrAnoAltReg());
        fields += " CTR_MES_ALT_REG = ?, ";
        values.add(this.getCtrMesAltReg());
        fields += " CTR_DIA_ALT_REG = ?, ";
        values.add(this.getCtrDiaAltReg());
        fields += " CTR_ANO_ULT_MOD = ?, ";
        values.add(this.getCtrAnoUltMod());
        fields += " CTR_MES_ULT_MOD = ?, ";
        values.add(this.getCtrMesUltMod());
        fields += " CTR_DIA_ULT_MOD = ?, ";
        values.add(this.getCtrDiaUltMod());
        fields += " CTR_CVE_STATUS = ?, ";
        values.add(this.getCtrCveStatus());
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
        String sql = "INSERT INTO CTO_REV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTR_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtrContrato());

        fields += ", CTR_MOTIVO";
        fieldValues += ", ?";
        values.add(this.getCtrMotivo());

        fields += ", CTR_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getCtrComentario());

        fields += ", CTR_FECHA";
        fieldValues += ", ?";
        values.add(this.getCtrFecha());

        fields += ", CTR_USUARIO";
        fieldValues += ", ?";
        values.add(this.getCtrUsuario());

        fields += ", CTR_FIDUC_SUST";
        fieldValues += ", ?";
        values.add(this.getCtrFiducSust());

        fields += ", CTR_FEC_SUST";
        fieldValues += ", ?";
        values.add(this.getCtrFecSust());

        fields += ", CTR_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCtrAnoAltReg());

        fields += ", CTR_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCtrMesAltReg());

        fields += ", CTR_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCtrDiaAltReg());

        fields += ", CTR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtrAnoUltMod());

        fields += ", CTR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtrMesUltMod());

        fields += ", CTR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtrDiaUltMod());

        fields += ", CTR_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getCtrCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTO_REV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTR_CONTRATO = ?";
        values.add(this.getCtrContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        CtoRev instance = (CtoRev) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtrContrato().equals(instance.getCtrContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtrMotivo().equals(instance.getCtrMotivo()))
            equalObjects = false;
        if (equalObjects && !this.getCtrComentario().equals(instance.getCtrComentario()))
            equalObjects = false;
        if (equalObjects && !this.getCtrFecha().equals(instance.getCtrFecha()))
            equalObjects = false;
        if (equalObjects && !this.getCtrUsuario().equals(instance.getCtrUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getCtrFiducSust().equals(instance.getCtrFiducSust()))
            equalObjects = false;
        if (equalObjects && !this.getCtrFecSust().equals(instance.getCtrFecSust()))
            equalObjects = false;
        if (equalObjects && !this.getCtrAnoAltReg().equals(instance.getCtrAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtrMesAltReg().equals(instance.getCtrMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtrDiaAltReg().equals(instance.getCtrDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtrAnoUltMod().equals(instance.getCtrAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtrMesUltMod().equals(instance.getCtrMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtrDiaUltMod().equals(instance.getCtrDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtrCveStatus().equals(instance.getCtrCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CtoRev result = new CtoRev();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtrContrato((BigDecimal) objectData.getData("CTR_CONTRATO"));
        result.setCtrMotivo((String) objectData.getData("CTR_MOTIVO"));
        result.setCtrComentario((String) objectData.getData("CTR_COMENTARIO"));
        result.setCtrFecha((String) objectData.getData("CTR_FECHA"));
        result.setCtrUsuario((BigDecimal) objectData.getData("CTR_USUARIO"));
        result.setCtrFiducSust((String) objectData.getData("CTR_FIDUC_SUST"));
        result.setCtrFecSust((String) objectData.getData("CTR_FEC_SUST"));
        result.setCtrAnoAltReg((BigDecimal) objectData.getData("CTR_ANO_ALT_REG"));
        result.setCtrMesAltReg((BigDecimal) objectData.getData("CTR_MES_ALT_REG"));
        result.setCtrDiaAltReg((BigDecimal) objectData.getData("CTR_DIA_ALT_REG"));
        result.setCtrAnoUltMod((BigDecimal) objectData.getData("CTR_ANO_ULT_MOD"));
        result.setCtrMesUltMod((BigDecimal) objectData.getData("CTR_MES_ULT_MOD"));
        result.setCtrDiaUltMod((BigDecimal) objectData.getData("CTR_DIA_ULT_MOD"));
        result.setCtrCveStatus((String) objectData.getData("CTR_CVE_STATUS"));

        return result;

    }

}
