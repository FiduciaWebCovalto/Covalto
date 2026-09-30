package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_BITACORA_SOL_PK", columns = { "INS_NUM_CONTRATO", "INS_MUM_FOLIO_INST", "FBIS_NUM_ETAPA" }, sequences = { "MANUAL" })
public class FBitacoraSol extends DomainObject {

    BigDecimal insMumFolioInst = null;
    BigDecimal insNumContrato = null;
    BigDecimal fbisNumEtapa = null;
    BigDecimal usuNumUsuario = null;
    String fbisFechaIni = null;
    String fbisFechaFin = null;
    String fbisObservacion = null;
    BigDecimal fbisFirmaDig = null;

    public FBitacoraSol() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsMumFolioInst(BigDecimal insMumFolioInst) {
        this.insMumFolioInst = insMumFolioInst;
    }

    public BigDecimal getInsMumFolioInst() {
        return this.insMumFolioInst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsNumContrato(BigDecimal insNumContrato) {
        this.insNumContrato = insNumContrato;
    }

    public BigDecimal getInsNumContrato() {
        return this.insNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFbisNumEtapa(BigDecimal fbisNumEtapa) {
        this.fbisNumEtapa = fbisNumEtapa;
    }

    public BigDecimal getFbisNumEtapa() {
        return this.fbisNumEtapa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumUsuario(BigDecimal usuNumUsuario) {
        this.usuNumUsuario = usuNumUsuario;
    }

    public BigDecimal getUsuNumUsuario() {
        return this.usuNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFbisFechaIni(String fbisFechaIni) {
        this.fbisFechaIni = fbisFechaIni;
    }

    public String getFbisFechaIni() {
        return this.fbisFechaIni;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFbisFechaFin(String fbisFechaFin) {
        this.fbisFechaFin = fbisFechaFin;
    }

    public String getFbisFechaFin() {
        return this.fbisFechaFin;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbisObservacion(String fbisObservacion) {
        this.fbisObservacion = fbisObservacion;
    }

    public String getFbisObservacion() {
        return this.fbisObservacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFbisFirmaDig(BigDecimal fbisFirmaDig) {
        this.fbisFirmaDig = fbisFirmaDig;
    }

    public BigDecimal getFbisFirmaDig() {
        return this.fbisFirmaDig;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_BITACORA_SOL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInsMumFolioInst() != null && this.getInsMumFolioInst().longValue() == -999) {
            conditions += " AND INS_MUM_FOLIO_INST IS NULL";
        } else if (this.getInsMumFolioInst() != null) {
            conditions += " AND INS_MUM_FOLIO_INST = ?";
            values.add(this.getInsMumFolioInst());
        }

        if (this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
            conditions += " AND INS_NUM_CONTRATO IS NULL";
        } else if (this.getInsNumContrato() != null) {
            conditions += " AND INS_NUM_CONTRATO = ?";
            values.add(this.getInsNumContrato());
        }

        if (this.getFbisNumEtapa() != null && this.getFbisNumEtapa().longValue() == -999) {
            conditions += " AND FBIS_NUM_ETAPA IS NULL";
        } else if (this.getFbisNumEtapa() != null) {
            conditions += " AND FBIS_NUM_ETAPA = ?";
            values.add(this.getFbisNumEtapa());
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
        String sql = "SELECT * FROM F_BITACORA_SOL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInsMumFolioInst() != null && this.getInsMumFolioInst().longValue() == -999) {
            conditions += " AND INS_MUM_FOLIO_INST IS NULL";
        } else if (this.getInsMumFolioInst() != null) {
            conditions += " AND INS_MUM_FOLIO_INST = ?";
            values.add(this.getInsMumFolioInst());
        }

        if (this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
            conditions += " AND INS_NUM_CONTRATO IS NULL";
        } else if (this.getInsNumContrato() != null) {
            conditions += " AND INS_NUM_CONTRATO = ?";
            values.add(this.getInsNumContrato());
        }

        if (this.getFbisNumEtapa() != null && this.getFbisNumEtapa().longValue() == -999) {
            conditions += " AND FBIS_NUM_ETAPA IS NULL";
        } else if (this.getFbisNumEtapa() != null) {
            conditions += " AND FBIS_NUM_ETAPA = ?";
            values.add(this.getFbisNumEtapa());
        }

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getFbisFechaIni() != null && "null".equals(this.getFbisFechaIni())) {
            conditions += " AND FBIS_FECHA_INI IS NULL";
        } else if (this.getFbisFechaIni() != null) {
            conditions += " AND FBIS_FECHA_INI = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbisFechaIni());
        }

        if (this.getFbisFechaFin() != null && "null".equals(this.getFbisFechaFin())) {
            conditions += " AND FBIS_FECHA_FIN IS NULL";
        } else if (this.getFbisFechaFin() != null) {
            conditions += " AND FBIS_FECHA_FIN = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbisFechaFin());
        }

        if (this.getFbisObservacion() != null && "null".equals(this.getFbisObservacion())) {
            conditions += " AND FBIS_OBSERVACION IS NULL";
        } else if (this.getFbisObservacion() != null) {
            conditions += " AND FBIS_OBSERVACION = ?";
            values.add(this.getFbisObservacion());
        }

        if (this.getFbisFirmaDig() != null && this.getFbisFirmaDig().longValue() == -999) {
            conditions += " AND FBIS_FIRMA_DIG IS NULL";
        } else if (this.getFbisFirmaDig() != null) {
            conditions += " AND FBIS_FIRMA_DIG = ?";
            values.add(this.getFbisFirmaDig());
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
        String sql = "UPDATE F_BITACORA_SOL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND INS_MUM_FOLIO_INST = ?";
        pkValues.add(this.getInsMumFolioInst());
        conditions += " AND INS_NUM_CONTRATO = ?";
        pkValues.add(this.getInsNumContrato());
        conditions += " AND FBIS_NUM_ETAPA = ?";
        pkValues.add(this.getFbisNumEtapa());
        fields += " USU_NUM_USUARIO = ?, ";
        values.add(this.getUsuNumUsuario());
        fields += " FBIS_FECHA_INI = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFbisFechaIni());
        fields += " FBIS_FECHA_FIN = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFbisFechaFin());
        fields += " FBIS_OBSERVACION = ?, ";
        values.add(this.getFbisObservacion());
        fields += " FBIS_FIRMA_DIG = ?, ";
        values.add(this.getFbisFirmaDig());
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
        String sql = "INSERT INTO F_BITACORA_SOL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", INS_MUM_FOLIO_INST";
        fieldValues += ", ?";
        values.add(this.getInsMumFolioInst());

        fields += ", INS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getInsNumContrato());

        fields += ", FBIS_NUM_ETAPA";
        fieldValues += ", ?";
        values.add(this.getFbisNumEtapa());

        fields += ", USU_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuNumUsuario());

        fields += ", FBIS_FECHA_INI";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFbisFechaIni());

        fields += ", FBIS_FECHA_FIN";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFbisFechaFin());

        fields += ", FBIS_OBSERVACION";
        fieldValues += ", ?";
        values.add(this.getFbisObservacion());

        fields += ", FBIS_FIRMA_DIG";
        fieldValues += ", ?";
        values.add(this.getFbisFirmaDig());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_BITACORA_SOL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND INS_MUM_FOLIO_INST = ?";
        values.add(this.getInsMumFolioInst());
        conditions += " AND INS_NUM_CONTRATO = ?";
        values.add(this.getInsNumContrato());
        conditions += " AND FBIS_NUM_ETAPA = ?";
        values.add(this.getFbisNumEtapa());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FBitacoraSol instance = (FBitacoraSol) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getInsMumFolioInst().equals(instance.getInsMumFolioInst()))
            equalObjects = false;
        if (equalObjects && !this.getInsNumContrato().equals(instance.getInsNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFbisNumEtapa().equals(instance.getFbisNumEtapa()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumUsuario().equals(instance.getUsuNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getFbisFechaIni().equals(instance.getFbisFechaIni()))
            equalObjects = false;
        if (equalObjects && !this.getFbisFechaFin().equals(instance.getFbisFechaFin()))
            equalObjects = false;
        if (equalObjects && !this.getFbisObservacion().equals(instance.getFbisObservacion()))
            equalObjects = false;
        if (equalObjects && !this.getFbisFirmaDig().equals(instance.getFbisFirmaDig()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FBitacoraSol result = new FBitacoraSol();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setInsMumFolioInst((BigDecimal) objectData.getData("INS_MUM_FOLIO_INST"));
        result.setInsNumContrato((BigDecimal) objectData.getData("INS_NUM_CONTRATO"));
        result.setFbisNumEtapa((BigDecimal) objectData.getData("FBIS_NUM_ETAPA"));
        result.setUsuNumUsuario((BigDecimal) objectData.getData("USU_NUM_USUARIO"));
        result.setFbisFechaIni((String) objectData.getData("FBIS_FECHA_INI"));
        result.setFbisFechaFin((String) objectData.getData("FBIS_FECHA_FIN"));
        result.setFbisObservacion((String) objectData.getData("FBIS_OBSERVACION"));
        result.setFbisFirmaDig((BigDecimal) objectData.getData("FBIS_FIRMA_DIG"));

        return result;

    }

}
