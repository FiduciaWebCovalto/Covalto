package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REPBIT_NOMON_PK", columns = { "RBI_FECHA", "USU_NUM_USUARIO", "INS_NUM_FOLIO_INST", "INS_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class FRepbitNomon extends DomainObject {

    String rbiFecha = null;
    BigDecimal usuNumUsuario = null;
    BigDecimal insNumFolioInst = null;
    BigDecimal insNumContrato = null;
    String ctoNomContrato = null;
    String ftopNombreTipoper = null;
    String rbiFechainiEtapa1 = null;
    String rbiFechafinEtapa1 = null;
    String rbiUsuarioEtapa1 = null;
    String rbiFechainiEtapa2 = null;
    String rbiFechafinEtapa2 = null;
    String rbiUsuarioEtapa2 = null;
    String rbiFechainiEtapa3 = null;
    String rbiFechafinEtapa3 = null;
    String rbiUsuarioEtapa3 = null;
    String insCveStInstruc = null;

    public FRepbitNomon() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setRbiFecha(String rbiFecha) {
        this.rbiFecha = rbiFecha;
    }

    public String getRbiFecha() {
        return this.rbiFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumUsuario(BigDecimal usuNumUsuario) {
        this.usuNumUsuario = usuNumUsuario;
    }

    public BigDecimal getUsuNumUsuario() {
        return this.usuNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsNumFolioInst(BigDecimal insNumFolioInst) {
        this.insNumFolioInst = insNumFolioInst;
    }

    public BigDecimal getInsNumFolioInst() {
        return this.insNumFolioInst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsNumContrato(BigDecimal insNumContrato) {
        this.insNumContrato = insNumContrato;
    }

    public BigDecimal getInsNumContrato() {
        return this.insNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoNomContrato(String ctoNomContrato) {
        this.ctoNomContrato = ctoNomContrato;
    }

    public String getCtoNomContrato() {
        return this.ctoNomContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFtopNombreTipoper(String ftopNombreTipoper) {
        this.ftopNombreTipoper = ftopNombreTipoper;
    }

    public String getFtopNombreTipoper() {
        return this.ftopNombreTipoper;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setRbiFechainiEtapa1(String rbiFechainiEtapa1) {
        this.rbiFechainiEtapa1 = rbiFechainiEtapa1;
    }

    public String getRbiFechainiEtapa1() {
        return this.rbiFechainiEtapa1;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechafinEtapa1(String rbiFechafinEtapa1) {
        this.rbiFechafinEtapa1 = rbiFechafinEtapa1;
    }

    public String getRbiFechafinEtapa1() {
        return this.rbiFechafinEtapa1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbiUsuarioEtapa1(String rbiUsuarioEtapa1) {
        this.rbiUsuarioEtapa1 = rbiUsuarioEtapa1;
    }

    public String getRbiUsuarioEtapa1() {
        return this.rbiUsuarioEtapa1;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechainiEtapa2(String rbiFechainiEtapa2) {
        this.rbiFechainiEtapa2 = rbiFechainiEtapa2;
    }

    public String getRbiFechainiEtapa2() {
        return this.rbiFechainiEtapa2;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechafinEtapa2(String rbiFechafinEtapa2) {
        this.rbiFechafinEtapa2 = rbiFechafinEtapa2;
    }

    public String getRbiFechafinEtapa2() {
        return this.rbiFechafinEtapa2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbiUsuarioEtapa2(String rbiUsuarioEtapa2) {
        this.rbiUsuarioEtapa2 = rbiUsuarioEtapa2;
    }

    public String getRbiUsuarioEtapa2() {
        return this.rbiUsuarioEtapa2;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechainiEtapa3(String rbiFechainiEtapa3) {
        this.rbiFechainiEtapa3 = rbiFechainiEtapa3;
    }

    public String getRbiFechainiEtapa3() {
        return this.rbiFechainiEtapa3;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechafinEtapa3(String rbiFechafinEtapa3) {
        this.rbiFechafinEtapa3 = rbiFechafinEtapa3;
    }

    public String getRbiFechafinEtapa3() {
        return this.rbiFechafinEtapa3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbiUsuarioEtapa3(String rbiUsuarioEtapa3) {
        this.rbiUsuarioEtapa3 = rbiUsuarioEtapa3;
    }

    public String getRbiUsuarioEtapa3() {
        return this.rbiUsuarioEtapa3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCveStInstruc(String insCveStInstruc) {
        this.insCveStInstruc = insCveStInstruc;
    }

    public String getInsCveStInstruc() {
        return this.insCveStInstruc;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REPBIT_NOMON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRbiFecha() != null && "null".equals(this.getRbiFecha())) {
            conditions += " AND RBI_FECHA IS NULL";
        } else if (this.getRbiFecha() != null) {
            conditions += " AND RBI_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFecha());
        }

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getInsNumFolioInst() != null && this.getInsNumFolioInst().longValue() == -999) {
            conditions += " AND INS_NUM_FOLIO_INST IS NULL";
        } else if (this.getInsNumFolioInst() != null) {
            conditions += " AND INS_NUM_FOLIO_INST = ?";
            values.add(this.getInsNumFolioInst());
        }

        if (this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
            conditions += " AND INS_NUM_CONTRATO IS NULL";
        } else if (this.getInsNumContrato() != null) {
            conditions += " AND INS_NUM_CONTRATO = ?";
            values.add(this.getInsNumContrato());
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
        String sql = "SELECT * FROM F_REPBIT_NOMON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRbiFecha() != null && "null".equals(this.getRbiFecha())) {
            conditions += " AND RBI_FECHA IS NULL";
        } else if (this.getRbiFecha() != null) {
            conditions += " AND RBI_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFecha());
        }

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getInsNumFolioInst() != null && this.getInsNumFolioInst().longValue() == -999) {
            conditions += " AND INS_NUM_FOLIO_INST IS NULL";
        } else if (this.getInsNumFolioInst() != null) {
            conditions += " AND INS_NUM_FOLIO_INST = ?";
            values.add(this.getInsNumFolioInst());
        }

        if (this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
            conditions += " AND INS_NUM_CONTRATO IS NULL";
        } else if (this.getInsNumContrato() != null) {
            conditions += " AND INS_NUM_CONTRATO = ?";
            values.add(this.getInsNumContrato());
        }

        if (this.getCtoNomContrato() != null && "null".equals(this.getCtoNomContrato())) {
            conditions += " AND CTO_NOM_CONTRATO IS NULL";
        } else if (this.getCtoNomContrato() != null) {
            conditions += " AND CTO_NOM_CONTRATO = ?";
            values.add(this.getCtoNomContrato());
        }

        if (this.getFtopNombreTipoper() != null && "null".equals(this.getFtopNombreTipoper())) {
            conditions += " AND FTOP_NOMBRE_TIPOPER IS NULL";
        } else if (this.getFtopNombreTipoper() != null) {
            conditions += " AND FTOP_NOMBRE_TIPOPER = ?";
            values.add(this.getFtopNombreTipoper());
        }

        if (this.getRbiFechainiEtapa1() != null && "null".equals(this.getRbiFechainiEtapa1())) {
            conditions += " AND RBI_FECHAINI_ETAPA1 IS NULL";
        } else if (this.getRbiFechainiEtapa1() != null) {
            conditions += " AND RBI_FECHAINI_ETAPA1 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechainiEtapa1());
        }

        if (this.getRbiFechafinEtapa1() != null && "null".equals(this.getRbiFechafinEtapa1())) {
            conditions += " AND RBI_FECHAFIN_ETAPA1 IS NULL";
        } else if (this.getRbiFechafinEtapa1() != null) {
            conditions += " AND RBI_FECHAFIN_ETAPA1 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechafinEtapa1());
        }

        if (this.getRbiUsuarioEtapa1() != null && "null".equals(this.getRbiUsuarioEtapa1())) {
            conditions += " AND RBI_USUARIO_ETAPA1 IS NULL";
        } else if (this.getRbiUsuarioEtapa1() != null) {
            conditions += " AND RBI_USUARIO_ETAPA1 = ?";
            values.add(this.getRbiUsuarioEtapa1());
        }

        if (this.getRbiFechainiEtapa2() != null && "null".equals(this.getRbiFechainiEtapa2())) {
            conditions += " AND RBI_FECHAINI_ETAPA2 IS NULL";
        } else if (this.getRbiFechainiEtapa2() != null) {
            conditions += " AND RBI_FECHAINI_ETAPA2 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechainiEtapa2());
        }

        if (this.getRbiFechafinEtapa2() != null && "null".equals(this.getRbiFechafinEtapa2())) {
            conditions += " AND RBI_FECHAFIN_ETAPA2 IS NULL";
        } else if (this.getRbiFechafinEtapa2() != null) {
            conditions += " AND RBI_FECHAFIN_ETAPA2 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechafinEtapa2());
        }

        if (this.getRbiUsuarioEtapa2() != null && "null".equals(this.getRbiUsuarioEtapa2())) {
            conditions += " AND RBI_USUARIO_ETAPA2 IS NULL";
        } else if (this.getRbiUsuarioEtapa2() != null) {
            conditions += " AND RBI_USUARIO_ETAPA2 = ?";
            values.add(this.getRbiUsuarioEtapa2());
        }

        if (this.getRbiFechainiEtapa3() != null && "null".equals(this.getRbiFechainiEtapa3())) {
            conditions += " AND RBI_FECHAINI_ETAPA3 IS NULL";
        } else if (this.getRbiFechainiEtapa3() != null) {
            conditions += " AND RBI_FECHAINI_ETAPA3 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechainiEtapa3());
        }

        if (this.getRbiFechafinEtapa3() != null && "null".equals(this.getRbiFechafinEtapa3())) {
            conditions += " AND RBI_FECHAFIN_ETAPA3 IS NULL";
        } else if (this.getRbiFechafinEtapa3() != null) {
            conditions += " AND RBI_FECHAFIN_ETAPA3 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechafinEtapa3());
        }

        if (this.getRbiUsuarioEtapa3() != null && "null".equals(this.getRbiUsuarioEtapa3())) {
            conditions += " AND RBI_USUARIO_ETAPA3 IS NULL";
        } else if (this.getRbiUsuarioEtapa3() != null) {
            conditions += " AND RBI_USUARIO_ETAPA3 = ?";
            values.add(this.getRbiUsuarioEtapa3());
        }

        if (this.getInsCveStInstruc() != null && "null".equals(this.getInsCveStInstruc())) {
            conditions += " AND INS_CVE_ST_INSTRUC IS NULL";
        } else if (this.getInsCveStInstruc() != null) {
            conditions += " AND INS_CVE_ST_INSTRUC = ?";
            values.add(this.getInsCveStInstruc());
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
        String sql = "UPDATE F_REPBIT_NOMON SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RBI_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getRbiFecha());
        conditions += " AND USU_NUM_USUARIO = ?";
        pkValues.add(this.getUsuNumUsuario());
        conditions += " AND INS_NUM_FOLIO_INST = ?";
        pkValues.add(this.getInsNumFolioInst());
        conditions += " AND INS_NUM_CONTRATO = ?";
        pkValues.add(this.getInsNumContrato());
        fields += " CTO_NOM_CONTRATO = ?, ";
        values.add(this.getCtoNomContrato());
        fields += " FTOP_NOMBRE_TIPOPER = ?, ";
        values.add(this.getFtopNombreTipoper());
        fields += " RBI_FECHAINI_ETAPA1 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechainiEtapa1());
        fields += " RBI_FECHAFIN_ETAPA1 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechafinEtapa1());
        fields += " RBI_USUARIO_ETAPA1 = ?, ";
        values.add(this.getRbiUsuarioEtapa1());
        fields += " RBI_FECHAINI_ETAPA2 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechainiEtapa2());
        fields += " RBI_FECHAFIN_ETAPA2 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechafinEtapa2());
        fields += " RBI_USUARIO_ETAPA2 = ?, ";
        values.add(this.getRbiUsuarioEtapa2());
        fields += " RBI_FECHAINI_ETAPA3 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechainiEtapa3());
        fields += " RBI_FECHAFIN_ETAPA3 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechafinEtapa3());
        fields += " RBI_USUARIO_ETAPA3 = ?, ";
        values.add(this.getRbiUsuarioEtapa3());
        fields += " INS_CVE_ST_INSTRUC = ?, ";
        values.add(this.getInsCveStInstruc());
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
        String sql = "INSERT INTO F_REPBIT_NOMON ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RBI_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFecha());

        fields += ", USU_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuNumUsuario());

        fields += ", INS_NUM_FOLIO_INST";
        fieldValues += ", ?";
        values.add(this.getInsNumFolioInst());

        fields += ", INS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getInsNumContrato());

        fields += ", CTO_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNomContrato());

        fields += ", FTOP_NOMBRE_TIPOPER";
        fieldValues += ", ?";
        values.add(this.getFtopNombreTipoper());

        fields += ", RBI_FECHAINI_ETAPA1";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechainiEtapa1());

        fields += ", RBI_FECHAFIN_ETAPA1";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechafinEtapa1());

        fields += ", RBI_USUARIO_ETAPA1";
        fieldValues += ", ?";
        values.add(this.getRbiUsuarioEtapa1());

        fields += ", RBI_FECHAINI_ETAPA2";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechainiEtapa2());

        fields += ", RBI_FECHAFIN_ETAPA2";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechafinEtapa2());

        fields += ", RBI_USUARIO_ETAPA2";
        fieldValues += ", ?";
        values.add(this.getRbiUsuarioEtapa2());

        fields += ", RBI_FECHAINI_ETAPA3";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechainiEtapa3());

        fields += ", RBI_FECHAFIN_ETAPA3";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechafinEtapa3());

        fields += ", RBI_USUARIO_ETAPA3";
        fieldValues += ", ?";
        values.add(this.getRbiUsuarioEtapa3());

        fields += ", INS_CVE_ST_INSTRUC";
        fieldValues += ", ?";
        values.add(this.getInsCveStInstruc());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REPBIT_NOMON WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RBI_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getRbiFecha());
        conditions += " AND USU_NUM_USUARIO = ?";
        values.add(this.getUsuNumUsuario());
        conditions += " AND INS_NUM_FOLIO_INST = ?";
        values.add(this.getInsNumFolioInst());
        conditions += " AND INS_NUM_CONTRATO = ?";
        values.add(this.getInsNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepbitNomon instance = (FRepbitNomon) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRbiFecha().equals(instance.getRbiFecha()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumUsuario().equals(instance.getUsuNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getInsNumFolioInst().equals(instance.getInsNumFolioInst()))
            equalObjects = false;
        if (equalObjects && !this.getInsNumContrato().equals(instance.getInsNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNomContrato().equals(instance.getCtoNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFtopNombreTipoper().equals(instance.getFtopNombreTipoper()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechainiEtapa1().equals(instance.getRbiFechainiEtapa1()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechafinEtapa1().equals(instance.getRbiFechafinEtapa1()))
            equalObjects = false;
        if (equalObjects && !this.getRbiUsuarioEtapa1().equals(instance.getRbiUsuarioEtapa1()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechainiEtapa2().equals(instance.getRbiFechainiEtapa2()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechafinEtapa2().equals(instance.getRbiFechafinEtapa2()))
            equalObjects = false;
        if (equalObjects && !this.getRbiUsuarioEtapa2().equals(instance.getRbiUsuarioEtapa2()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechainiEtapa3().equals(instance.getRbiFechainiEtapa3()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechafinEtapa3().equals(instance.getRbiFechafinEtapa3()))
            equalObjects = false;
        if (equalObjects && !this.getRbiUsuarioEtapa3().equals(instance.getRbiUsuarioEtapa3()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveStInstruc().equals(instance.getInsCveStInstruc()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepbitNomon result = new FRepbitNomon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRbiFecha((String) objectData.getData("RBI_FECHA"));
        result.setUsuNumUsuario((BigDecimal) objectData.getData("USU_NUM_USUARIO"));
        result.setInsNumFolioInst((BigDecimal) objectData.getData("INS_NUM_FOLIO_INST"));
        result.setInsNumContrato((BigDecimal) objectData.getData("INS_NUM_CONTRATO"));
        result.setCtoNomContrato((String) objectData.getData("CTO_NOM_CONTRATO"));
        result.setFtopNombreTipoper((String) objectData.getData("FTOP_NOMBRE_TIPOPER"));
        result.setRbiFechainiEtapa1((String) objectData.getData("RBI_FECHAINI_ETAPA1"));
        result.setRbiFechafinEtapa1((String) objectData.getData("RBI_FECHAFIN_ETAPA1"));
        result.setRbiUsuarioEtapa1((String) objectData.getData("RBI_USUARIO_ETAPA1"));
        result.setRbiFechainiEtapa2((String) objectData.getData("RBI_FECHAINI_ETAPA2"));
        result.setRbiFechafinEtapa2((String) objectData.getData("RBI_FECHAFIN_ETAPA2"));
        result.setRbiUsuarioEtapa2((String) objectData.getData("RBI_USUARIO_ETAPA2"));
        result.setRbiFechainiEtapa3((String) objectData.getData("RBI_FECHAINI_ETAPA3"));
        result.setRbiFechafinEtapa3((String) objectData.getData("RBI_FECHAFIN_ETAPA3"));
        result.setRbiUsuarioEtapa3((String) objectData.getData("RBI_USUARIO_ETAPA3"));
        result.setInsCveStInstruc((String) objectData.getData("INS_CVE_ST_INSTRUC"));

        return result;

    }

}
