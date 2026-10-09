package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REPBIT_MON_PK", columns = { "RBI_FECHA", "USU_NUM_USUARIO", "INS_NUM_FOLIO_INST", "INS_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class FRepbitMon extends DomainObject {

    String rbiFecha = null;
    BigDecimal usuNumUsuario = null;
    BigDecimal insNumFolioInst = null;
    BigDecimal insNumContrato = null;
    String ctoNomContrato = null;
    String ftopNombreTipoper = null;
    BigDecimal ftopCveNaturaleza = null;
    String rbiFormaLiq = null;
    BigDecimal rbiImporte = null;
    BigDecimal rbiNumMoneda = null;
    String rbiFechainiEtapa1 = null;
    String rbiFechafinEtapa1 = null;
    String rbiUsuarioEtapa1 = null;
    String rbiFechainiEtapa2 = null;
    String rbiFechafinEtapa2 = null;
    String rbiUsuarioEtapa2 = null;
    String rbiFechainiEtapa3 = null;
    String rbiFechafinEtapa3 = null;
    String rbiUsuarioEtapa3 = null;
    String rbiFechainiEtapa4 = null;
    String rbiFechafinEtapa4 = null;
    String rbiUsuarioEtapa4 = null;
    String insCveStInstruc = null;
    String rbiFechainiEtapa5 = null;
    String rbiFechafinEtapa5 = null;
    String rbiUsuarioEtapa5 = null;

    public FRepbitMon() {
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

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFtopCveNaturaleza(BigDecimal ftopCveNaturaleza) {
        this.ftopCveNaturaleza = ftopCveNaturaleza;
    }

    public BigDecimal getFtopCveNaturaleza() {
        return this.ftopCveNaturaleza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbiFormaLiq(String rbiFormaLiq) {
        this.rbiFormaLiq = rbiFormaLiq;
    }

    public String getRbiFormaLiq() {
        return this.rbiFormaLiq;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRbiImporte(BigDecimal rbiImporte) {
        this.rbiImporte = rbiImporte;
    }

    public BigDecimal getRbiImporte() {
        return this.rbiImporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRbiNumMoneda(BigDecimal rbiNumMoneda) {
        this.rbiNumMoneda = rbiNumMoneda;
    }

    public BigDecimal getRbiNumMoneda() {
        return this.rbiNumMoneda;
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

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechainiEtapa4(String rbiFechainiEtapa4) {
        this.rbiFechainiEtapa4 = rbiFechainiEtapa4;
    }

    public String getRbiFechainiEtapa4() {
        return this.rbiFechainiEtapa4;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechafinEtapa4(String rbiFechafinEtapa4) {
        this.rbiFechafinEtapa4 = rbiFechafinEtapa4;
    }

    public String getRbiFechafinEtapa4() {
        return this.rbiFechafinEtapa4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbiUsuarioEtapa4(String rbiUsuarioEtapa4) {
        this.rbiUsuarioEtapa4 = rbiUsuarioEtapa4;
    }

    public String getRbiUsuarioEtapa4() {
        return this.rbiUsuarioEtapa4;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCveStInstruc(String insCveStInstruc) {
        this.insCveStInstruc = insCveStInstruc;
    }

    public String getInsCveStInstruc() {
        return this.insCveStInstruc;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechainiEtapa5(String rbiFechainiEtapa5) {
        this.rbiFechainiEtapa5 = rbiFechainiEtapa5;
    }

    public String getRbiFechainiEtapa5() {
        return this.rbiFechainiEtapa5;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRbiFechafinEtapa5(String rbiFechafinEtapa5) {
        this.rbiFechafinEtapa5 = rbiFechafinEtapa5;
    }

    public String getRbiFechafinEtapa5() {
        return this.rbiFechafinEtapa5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbiUsuarioEtapa5(String rbiUsuarioEtapa5) {
        this.rbiUsuarioEtapa5 = rbiUsuarioEtapa5;
    }

    public String getRbiUsuarioEtapa5() {
        return this.rbiUsuarioEtapa5;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REPBIT_MON ";

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
        String sql = "SELECT * FROM F_REPBIT_MON ";

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

        if (this.getFtopCveNaturaleza() != null && this.getFtopCveNaturaleza().longValue() == -999) {
            conditions += " AND FTOP_CVE_NATURALEZA IS NULL";
        } else if (this.getFtopCveNaturaleza() != null) {
            conditions += " AND FTOP_CVE_NATURALEZA = ?";
            values.add(this.getFtopCveNaturaleza());
        }

        if (this.getRbiFormaLiq() != null && "null".equals(this.getRbiFormaLiq())) {
            conditions += " AND RBI_FORMA_LIQ IS NULL";
        } else if (this.getRbiFormaLiq() != null) {
            conditions += " AND RBI_FORMA_LIQ = ?";
            values.add(this.getRbiFormaLiq());
        }

        if (this.getRbiImporte() != null && this.getRbiImporte().longValue() == -999) {
            conditions += " AND RBI_IMPORTE IS NULL";
        } else if (this.getRbiImporte() != null) {
            conditions += " AND RBI_IMPORTE = ?";
            values.add(this.getRbiImporte());
        }

        if (this.getRbiNumMoneda() != null && this.getRbiNumMoneda().longValue() == -999) {
            conditions += " AND RBI_NUM_MONEDA IS NULL";
        } else if (this.getRbiNumMoneda() != null) {
            conditions += " AND RBI_NUM_MONEDA = ?";
            values.add(this.getRbiNumMoneda());
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

        if (this.getRbiFechainiEtapa4() != null && "null".equals(this.getRbiFechainiEtapa4())) {
            conditions += " AND RBI_FECHAINI_ETAPA4 IS NULL";
        } else if (this.getRbiFechainiEtapa4() != null) {
            conditions += " AND RBI_FECHAINI_ETAPA4 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechainiEtapa4());
        }

        if (this.getRbiFechafinEtapa4() != null && "null".equals(this.getRbiFechafinEtapa4())) {
            conditions += " AND RBI_FECHAFIN_ETAPA4 IS NULL";
        } else if (this.getRbiFechafinEtapa4() != null) {
            conditions += " AND RBI_FECHAFIN_ETAPA4 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechafinEtapa4());
        }

        if (this.getRbiUsuarioEtapa4() != null && "null".equals(this.getRbiUsuarioEtapa4())) {
            conditions += " AND RBI_USUARIO_ETAPA4 IS NULL";
        } else if (this.getRbiUsuarioEtapa4() != null) {
            conditions += " AND RBI_USUARIO_ETAPA4 = ?";
            values.add(this.getRbiUsuarioEtapa4());
        }

        if (this.getInsCveStInstruc() != null && "null".equals(this.getInsCveStInstruc())) {
            conditions += " AND INS_CVE_ST_INSTRUC IS NULL";
        } else if (this.getInsCveStInstruc() != null) {
            conditions += " AND INS_CVE_ST_INSTRUC = ?";
            values.add(this.getInsCveStInstruc());
        }

        if (this.getRbiFechainiEtapa5() != null && "null".equals(this.getRbiFechainiEtapa5())) {
            conditions += " AND RBI_FECHAINI_ETAPA5 IS NULL";
        } else if (this.getRbiFechainiEtapa5() != null) {
            conditions += " AND RBI_FECHAINI_ETAPA5 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechainiEtapa5());
        }

        if (this.getRbiFechafinEtapa5() != null && "null".equals(this.getRbiFechafinEtapa5())) {
            conditions += " AND RBI_FECHAFIN_ETAPA5 IS NULL";
        } else if (this.getRbiFechafinEtapa5() != null) {
            conditions += " AND RBI_FECHAFIN_ETAPA5 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRbiFechafinEtapa5());
        }

        if (this.getRbiUsuarioEtapa5() != null && "null".equals(this.getRbiUsuarioEtapa5())) {
            conditions += " AND RBI_USUARIO_ETAPA5 IS NULL";
        } else if (this.getRbiUsuarioEtapa5() != null) {
            conditions += " AND RBI_USUARIO_ETAPA5 = ?";
            values.add(this.getRbiUsuarioEtapa5());
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
        String sql = "UPDATE F_REPBIT_MON SET ";

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
        fields += " FTOP_CVE_NATURALEZA = ?, ";
        values.add(this.getFtopCveNaturaleza());
        fields += " RBI_FORMA_LIQ = ?, ";
        values.add(this.getRbiFormaLiq());
        fields += " RBI_IMPORTE = ?, ";
        values.add(this.getRbiImporte());
        fields += " RBI_NUM_MONEDA = ?, ";
        values.add(this.getRbiNumMoneda());
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
        fields += " RBI_FECHAINI_ETAPA4 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechainiEtapa4());
        fields += " RBI_FECHAFIN_ETAPA4 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechafinEtapa4());
        fields += " RBI_USUARIO_ETAPA4 = ?, ";
        values.add(this.getRbiUsuarioEtapa4());
        fields += " INS_CVE_ST_INSTRUC = ?, ";
        values.add(this.getInsCveStInstruc());
        fields += " RBI_FECHAINI_ETAPA5 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechainiEtapa5());
        fields += " RBI_FECHAFIN_ETAPA5 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRbiFechafinEtapa5());
        fields += " RBI_USUARIO_ETAPA5 = ?, ";
        values.add(this.getRbiUsuarioEtapa5());
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
        String sql = "INSERT INTO F_REPBIT_MON ( ";

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

        fields += ", FTOP_CVE_NATURALEZA";
        fieldValues += ", ?";
        values.add(this.getFtopCveNaturaleza());

        fields += ", RBI_FORMA_LIQ";
        fieldValues += ", ?";
        values.add(this.getRbiFormaLiq());

        fields += ", RBI_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getRbiImporte());

        fields += ", RBI_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getRbiNumMoneda());

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

        fields += ", RBI_FECHAINI_ETAPA4";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechainiEtapa4());

        fields += ", RBI_FECHAFIN_ETAPA4";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechafinEtapa4());

        fields += ", RBI_USUARIO_ETAPA4";
        fieldValues += ", ?";
        values.add(this.getRbiUsuarioEtapa4());

        fields += ", INS_CVE_ST_INSTRUC";
        fieldValues += ", ?";
        values.add(this.getInsCveStInstruc());

        fields += ", RBI_FECHAINI_ETAPA5";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechainiEtapa5());

        fields += ", RBI_FECHAFIN_ETAPA5";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRbiFechafinEtapa5());

        fields += ", RBI_USUARIO_ETAPA5";
        fieldValues += ", ?";
        values.add(this.getRbiUsuarioEtapa5());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REPBIT_MON WHERE ";

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
        FRepbitMon instance = (FRepbitMon) compareWith;
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
        if (equalObjects && !this.getFtopCveNaturaleza().equals(instance.getFtopCveNaturaleza()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFormaLiq().equals(instance.getRbiFormaLiq()))
            equalObjects = false;
        if (equalObjects && !this.getRbiImporte().equals(instance.getRbiImporte()))
            equalObjects = false;
        if (equalObjects && !this.getRbiNumMoneda().equals(instance.getRbiNumMoneda()))
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
        if (equalObjects && !this.getRbiFechainiEtapa4().equals(instance.getRbiFechainiEtapa4()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechafinEtapa4().equals(instance.getRbiFechafinEtapa4()))
            equalObjects = false;
        if (equalObjects && !this.getRbiUsuarioEtapa4().equals(instance.getRbiUsuarioEtapa4()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveStInstruc().equals(instance.getInsCveStInstruc()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechainiEtapa5().equals(instance.getRbiFechainiEtapa5()))
            equalObjects = false;
        if (equalObjects && !this.getRbiFechafinEtapa5().equals(instance.getRbiFechafinEtapa5()))
            equalObjects = false;
        if (equalObjects && !this.getRbiUsuarioEtapa5().equals(instance.getRbiUsuarioEtapa5()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepbitMon result = new FRepbitMon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRbiFecha((String) objectData.getData("RBI_FECHA"));
        result.setUsuNumUsuario((BigDecimal) objectData.getData("USU_NUM_USUARIO"));
        result.setInsNumFolioInst((BigDecimal) objectData.getData("INS_NUM_FOLIO_INST"));
        result.setInsNumContrato((BigDecimal) objectData.getData("INS_NUM_CONTRATO"));
        result.setCtoNomContrato((String) objectData.getData("CTO_NOM_CONTRATO"));
        result.setFtopNombreTipoper((String) objectData.getData("FTOP_NOMBRE_TIPOPER"));
        result.setFtopCveNaturaleza((BigDecimal) objectData.getData("FTOP_CVE_NATURALEZA"));
        result.setRbiFormaLiq((String) objectData.getData("RBI_FORMA_LIQ"));
        result.setRbiImporte((BigDecimal) objectData.getData("RBI_IMPORTE"));
        result.setRbiNumMoneda((BigDecimal) objectData.getData("RBI_NUM_MONEDA"));
        result.setRbiFechainiEtapa1((String) objectData.getData("RBI_FECHAINI_ETAPA1"));
        result.setRbiFechafinEtapa1((String) objectData.getData("RBI_FECHAFIN_ETAPA1"));
        result.setRbiUsuarioEtapa1((String) objectData.getData("RBI_USUARIO_ETAPA1"));
        result.setRbiFechainiEtapa2((String) objectData.getData("RBI_FECHAINI_ETAPA2"));
        result.setRbiFechafinEtapa2((String) objectData.getData("RBI_FECHAFIN_ETAPA2"));
        result.setRbiUsuarioEtapa2((String) objectData.getData("RBI_USUARIO_ETAPA2"));
        result.setRbiFechainiEtapa3((String) objectData.getData("RBI_FECHAINI_ETAPA3"));
        result.setRbiFechafinEtapa3((String) objectData.getData("RBI_FECHAFIN_ETAPA3"));
        result.setRbiUsuarioEtapa3((String) objectData.getData("RBI_USUARIO_ETAPA3"));
        result.setRbiFechainiEtapa4((String) objectData.getData("RBI_FECHAINI_ETAPA4"));
        result.setRbiFechafinEtapa4((String) objectData.getData("RBI_FECHAFIN_ETAPA4"));
        result.setRbiUsuarioEtapa4((String) objectData.getData("RBI_USUARIO_ETAPA4"));
        result.setInsCveStInstruc((String) objectData.getData("INS_CVE_ST_INSTRUC"));
        result.setRbiFechainiEtapa5((String) objectData.getData("RBI_FECHAINI_ETAPA5"));
        result.setRbiFechafinEtapa5((String) objectData.getData("RBI_FECHAFIN_ETAPA5"));
        result.setRbiUsuarioEtapa5((String) objectData.getData("RBI_USUARIO_ETAPA5"));

        return result;

    }

}
