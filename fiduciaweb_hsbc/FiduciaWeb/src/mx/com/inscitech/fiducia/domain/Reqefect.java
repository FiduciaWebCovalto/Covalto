package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REQEFECT_PK",
            columns = { "REQ_DIA_SUGERENCIA", "REQ_MES_SUGERENCIA", "REQ_ANO_SUGERENCIA", "REQ_SUB_CONTRATO", "REQ_FOLIO_OPERA", "REQ_NUM_CONTRATO", "REQ_NUM_CORTE" },
            sequences = { "MANUAL" })
public class Reqefect extends DomainObject {

    BigDecimal reqAnoSugerencia = null;
    BigDecimal reqMesSugerencia = null;
    BigDecimal reqDiaSugerencia = null;
    BigDecimal reqNumCorte = null;
    BigDecimal reqNumContrato = null;
    BigDecimal reqSubContrato = null;
    BigDecimal reqFolioOpera = null;
    String reqHoraRequerim = null;
    BigDecimal reqImpRequerido = null;
    BigDecimal reqImpVendido = null;
    BigDecimal reqImpFaltante = null;
    BigDecimal reqNumOperacion = null;
    String reqHoraCorte = null;
    String reqCveStReqefec = null;

    public Reqefect() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setReqAnoSugerencia(BigDecimal reqAnoSugerencia) {
        this.reqAnoSugerencia = reqAnoSugerencia;
    }

    public BigDecimal getReqAnoSugerencia() {
        return this.reqAnoSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setReqMesSugerencia(BigDecimal reqMesSugerencia) {
        this.reqMesSugerencia = reqMesSugerencia;
    }

    public BigDecimal getReqMesSugerencia() {
        return this.reqMesSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setReqDiaSugerencia(BigDecimal reqDiaSugerencia) {
        this.reqDiaSugerencia = reqDiaSugerencia;
    }

    public BigDecimal getReqDiaSugerencia() {
        return this.reqDiaSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReqNumCorte(BigDecimal reqNumCorte) {
        this.reqNumCorte = reqNumCorte;
    }

    public BigDecimal getReqNumCorte() {
        return this.reqNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReqNumContrato(BigDecimal reqNumContrato) {
        this.reqNumContrato = reqNumContrato;
    }

    public BigDecimal getReqNumContrato() {
        return this.reqNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReqSubContrato(BigDecimal reqSubContrato) {
        this.reqSubContrato = reqSubContrato;
    }

    public BigDecimal getReqSubContrato() {
        return this.reqSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReqFolioOpera(BigDecimal reqFolioOpera) {
        this.reqFolioOpera = reqFolioOpera;
    }

    public BigDecimal getReqFolioOpera() {
        return this.reqFolioOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReqHoraRequerim(String reqHoraRequerim) {
        this.reqHoraRequerim = reqHoraRequerim;
    }

    public String getReqHoraRequerim() {
        return this.reqHoraRequerim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setReqImpRequerido(BigDecimal reqImpRequerido) {
        this.reqImpRequerido = reqImpRequerido;
    }

    public BigDecimal getReqImpRequerido() {
        return this.reqImpRequerido;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setReqImpVendido(BigDecimal reqImpVendido) {
        this.reqImpVendido = reqImpVendido;
    }

    public BigDecimal getReqImpVendido() {
        return this.reqImpVendido;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setReqImpFaltante(BigDecimal reqImpFaltante) {
        this.reqImpFaltante = reqImpFaltante;
    }

    public BigDecimal getReqImpFaltante() {
        return this.reqImpFaltante;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReqNumOperacion(BigDecimal reqNumOperacion) {
        this.reqNumOperacion = reqNumOperacion;
    }

    public BigDecimal getReqNumOperacion() {
        return this.reqNumOperacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReqHoraCorte(String reqHoraCorte) {
        this.reqHoraCorte = reqHoraCorte;
    }

    public String getReqHoraCorte() {
        return this.reqHoraCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReqCveStReqefec(String reqCveStReqefec) {
        this.reqCveStReqefec = reqCveStReqefec;
    }

    public String getReqCveStReqefec() {
        return this.reqCveStReqefec;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REQEFECT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getReqAnoSugerencia() != null && this.getReqAnoSugerencia().longValue() == -999) {
            conditions += " AND REQ_ANO_SUGERENCIA IS NULL";
        } else if (this.getReqAnoSugerencia() != null) {
            conditions += " AND REQ_ANO_SUGERENCIA = ?";
            values.add(this.getReqAnoSugerencia());
        }

        if (this.getReqMesSugerencia() != null && this.getReqMesSugerencia().longValue() == -999) {
            conditions += " AND REQ_MES_SUGERENCIA IS NULL";
        } else if (this.getReqMesSugerencia() != null) {
            conditions += " AND REQ_MES_SUGERENCIA = ?";
            values.add(this.getReqMesSugerencia());
        }

        if (this.getReqDiaSugerencia() != null && this.getReqDiaSugerencia().longValue() == -999) {
            conditions += " AND REQ_DIA_SUGERENCIA IS NULL";
        } else if (this.getReqDiaSugerencia() != null) {
            conditions += " AND REQ_DIA_SUGERENCIA = ?";
            values.add(this.getReqDiaSugerencia());
        }

        if (this.getReqNumCorte() != null && this.getReqNumCorte().longValue() == -999) {
            conditions += " AND REQ_NUM_CORTE IS NULL";
        } else if (this.getReqNumCorte() != null) {
            conditions += " AND REQ_NUM_CORTE = ?";
            values.add(this.getReqNumCorte());
        }

        if (this.getReqNumContrato() != null && this.getReqNumContrato().longValue() == -999) {
            conditions += " AND REQ_NUM_CONTRATO IS NULL";
        } else if (this.getReqNumContrato() != null) {
            conditions += " AND REQ_NUM_CONTRATO = ?";
            values.add(this.getReqNumContrato());
        }

        if (this.getReqSubContrato() != null && this.getReqSubContrato().longValue() == -999) {
            conditions += " AND REQ_SUB_CONTRATO IS NULL";
        } else if (this.getReqSubContrato() != null) {
            conditions += " AND REQ_SUB_CONTRATO = ?";
            values.add(this.getReqSubContrato());
        }

        if (this.getReqFolioOpera() != null && this.getReqFolioOpera().longValue() == -999) {
            conditions += " AND REQ_FOLIO_OPERA IS NULL";
        } else if (this.getReqFolioOpera() != null) {
            conditions += " AND REQ_FOLIO_OPERA = ?";
            values.add(this.getReqFolioOpera());
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
        String sql = "SELECT * FROM REQEFECT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getReqAnoSugerencia() != null && this.getReqAnoSugerencia().longValue() == -999) {
            conditions += " AND REQ_ANO_SUGERENCIA IS NULL";
        } else if (this.getReqAnoSugerencia() != null) {
            conditions += " AND REQ_ANO_SUGERENCIA = ?";
            values.add(this.getReqAnoSugerencia());
        }

        if (this.getReqMesSugerencia() != null && this.getReqMesSugerencia().longValue() == -999) {
            conditions += " AND REQ_MES_SUGERENCIA IS NULL";
        } else if (this.getReqMesSugerencia() != null) {
            conditions += " AND REQ_MES_SUGERENCIA = ?";
            values.add(this.getReqMesSugerencia());
        }

        if (this.getReqDiaSugerencia() != null && this.getReqDiaSugerencia().longValue() == -999) {
            conditions += " AND REQ_DIA_SUGERENCIA IS NULL";
        } else if (this.getReqDiaSugerencia() != null) {
            conditions += " AND REQ_DIA_SUGERENCIA = ?";
            values.add(this.getReqDiaSugerencia());
        }

        if (this.getReqNumCorte() != null && this.getReqNumCorte().longValue() == -999) {
            conditions += " AND REQ_NUM_CORTE IS NULL";
        } else if (this.getReqNumCorte() != null) {
            conditions += " AND REQ_NUM_CORTE = ?";
            values.add(this.getReqNumCorte());
        }

        if (this.getReqNumContrato() != null && this.getReqNumContrato().longValue() == -999) {
            conditions += " AND REQ_NUM_CONTRATO IS NULL";
        } else if (this.getReqNumContrato() != null) {
            conditions += " AND REQ_NUM_CONTRATO = ?";
            values.add(this.getReqNumContrato());
        }

        if (this.getReqSubContrato() != null && this.getReqSubContrato().longValue() == -999) {
            conditions += " AND REQ_SUB_CONTRATO IS NULL";
        } else if (this.getReqSubContrato() != null) {
            conditions += " AND REQ_SUB_CONTRATO = ?";
            values.add(this.getReqSubContrato());
        }

        if (this.getReqFolioOpera() != null && this.getReqFolioOpera().longValue() == -999) {
            conditions += " AND REQ_FOLIO_OPERA IS NULL";
        } else if (this.getReqFolioOpera() != null) {
            conditions += " AND REQ_FOLIO_OPERA = ?";
            values.add(this.getReqFolioOpera());
        }

        if (this.getReqHoraRequerim() != null && "null".equals(this.getReqHoraRequerim())) {
            conditions += " AND REQ_HORA_REQUERIM IS NULL";
        } else if (this.getReqHoraRequerim() != null) {
            conditions += " AND REQ_HORA_REQUERIM = ?";
            values.add(this.getReqHoraRequerim());
        }

        if (this.getReqImpRequerido() != null && this.getReqImpRequerido().longValue() == -999) {
            conditions += " AND REQ_IMP_REQUERIDO IS NULL";
        } else if (this.getReqImpRequerido() != null) {
            conditions += " AND REQ_IMP_REQUERIDO = ?";
            values.add(this.getReqImpRequerido());
        }

        if (this.getReqImpVendido() != null && this.getReqImpVendido().longValue() == -999) {
            conditions += " AND REQ_IMP_VENDIDO IS NULL";
        } else if (this.getReqImpVendido() != null) {
            conditions += " AND REQ_IMP_VENDIDO = ?";
            values.add(this.getReqImpVendido());
        }

        if (this.getReqImpFaltante() != null && this.getReqImpFaltante().longValue() == -999) {
            conditions += " AND REQ_IMP_FALTANTE IS NULL";
        } else if (this.getReqImpFaltante() != null) {
            conditions += " AND REQ_IMP_FALTANTE = ?";
            values.add(this.getReqImpFaltante());
        }

        if (this.getReqNumOperacion() != null && this.getReqNumOperacion().longValue() == -999) {
            conditions += " AND REQ_NUM_OPERACION IS NULL";
        } else if (this.getReqNumOperacion() != null) {
            conditions += " AND REQ_NUM_OPERACION = ?";
            values.add(this.getReqNumOperacion());
        }

        if (this.getReqHoraCorte() != null && "null".equals(this.getReqHoraCorte())) {
            conditions += " AND REQ_HORA_CORTE IS NULL";
        } else if (this.getReqHoraCorte() != null) {
            conditions += " AND REQ_HORA_CORTE = ?";
            values.add(this.getReqHoraCorte());
        }

        if (this.getReqCveStReqefec() != null && "null".equals(this.getReqCveStReqefec())) {
            conditions += " AND REQ_CVE_ST_REQEFEC IS NULL";
        } else if (this.getReqCveStReqefec() != null) {
            conditions += " AND REQ_CVE_ST_REQEFEC = ?";
            values.add(this.getReqCveStReqefec());
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
        String sql = "UPDATE REQEFECT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REQ_ANO_SUGERENCIA = ?";
        pkValues.add(this.getReqAnoSugerencia());
        conditions += " AND REQ_MES_SUGERENCIA = ?";
        pkValues.add(this.getReqMesSugerencia());
        conditions += " AND REQ_DIA_SUGERENCIA = ?";
        pkValues.add(this.getReqDiaSugerencia());
        conditions += " AND REQ_NUM_CORTE = ?";
        pkValues.add(this.getReqNumCorte());
        conditions += " AND REQ_NUM_CONTRATO = ?";
        pkValues.add(this.getReqNumContrato());
        conditions += " AND REQ_SUB_CONTRATO = ?";
        pkValues.add(this.getReqSubContrato());
        conditions += " AND REQ_FOLIO_OPERA = ?";
        pkValues.add(this.getReqFolioOpera());
        fields += " REQ_HORA_REQUERIM = ?, ";
        values.add(this.getReqHoraRequerim());
        fields += " REQ_IMP_REQUERIDO = ?, ";
        values.add(this.getReqImpRequerido());
        fields += " REQ_IMP_VENDIDO = ?, ";
        values.add(this.getReqImpVendido());
        fields += " REQ_IMP_FALTANTE = ?, ";
        values.add(this.getReqImpFaltante());
        fields += " REQ_NUM_OPERACION = ?, ";
        values.add(this.getReqNumOperacion());
        fields += " REQ_HORA_CORTE = ?, ";
        values.add(this.getReqHoraCorte());
        fields += " REQ_CVE_ST_REQEFEC = ?, ";
        values.add(this.getReqCveStReqefec());
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
        String sql = "INSERT INTO REQEFECT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REQ_ANO_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getReqAnoSugerencia());

        fields += ", REQ_MES_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getReqMesSugerencia());

        fields += ", REQ_DIA_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getReqDiaSugerencia());

        fields += ", REQ_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getReqNumCorte());

        fields += ", REQ_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getReqNumContrato());

        fields += ", REQ_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getReqSubContrato());

        fields += ", REQ_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getReqFolioOpera());

        fields += ", REQ_HORA_REQUERIM";
        fieldValues += ", ?";
        values.add(this.getReqHoraRequerim());

        fields += ", REQ_IMP_REQUERIDO";
        fieldValues += ", ?";
        values.add(this.getReqImpRequerido());

        fields += ", REQ_IMP_VENDIDO";
        fieldValues += ", ?";
        values.add(this.getReqImpVendido());

        fields += ", REQ_IMP_FALTANTE";
        fieldValues += ", ?";
        values.add(this.getReqImpFaltante());

        fields += ", REQ_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getReqNumOperacion());

        fields += ", REQ_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getReqHoraCorte());

        fields += ", REQ_CVE_ST_REQEFEC";
        fieldValues += ", ?";
        values.add(this.getReqCveStReqefec());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REQEFECT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REQ_ANO_SUGERENCIA = ?";
        values.add(this.getReqAnoSugerencia());
        conditions += " AND REQ_MES_SUGERENCIA = ?";
        values.add(this.getReqMesSugerencia());
        conditions += " AND REQ_DIA_SUGERENCIA = ?";
        values.add(this.getReqDiaSugerencia());
        conditions += " AND REQ_NUM_CORTE = ?";
        values.add(this.getReqNumCorte());
        conditions += " AND REQ_NUM_CONTRATO = ?";
        values.add(this.getReqNumContrato());
        conditions += " AND REQ_SUB_CONTRATO = ?";
        values.add(this.getReqSubContrato());
        conditions += " AND REQ_FOLIO_OPERA = ?";
        values.add(this.getReqFolioOpera());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Reqefect instance = (Reqefect) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getReqAnoSugerencia().equals(instance.getReqAnoSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getReqMesSugerencia().equals(instance.getReqMesSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getReqDiaSugerencia().equals(instance.getReqDiaSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getReqNumCorte().equals(instance.getReqNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getReqNumContrato().equals(instance.getReqNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getReqSubContrato().equals(instance.getReqSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getReqFolioOpera().equals(instance.getReqFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getReqHoraRequerim().equals(instance.getReqHoraRequerim()))
            equalObjects = false;
        if (equalObjects && !this.getReqImpRequerido().equals(instance.getReqImpRequerido()))
            equalObjects = false;
        if (equalObjects && !this.getReqImpVendido().equals(instance.getReqImpVendido()))
            equalObjects = false;
        if (equalObjects && !this.getReqImpFaltante().equals(instance.getReqImpFaltante()))
            equalObjects = false;
        if (equalObjects && !this.getReqNumOperacion().equals(instance.getReqNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getReqHoraCorte().equals(instance.getReqHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getReqCveStReqefec().equals(instance.getReqCveStReqefec()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Reqefect result = new Reqefect();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setReqAnoSugerencia((BigDecimal) objectData.getData("REQ_ANO_SUGERENCIA"));
        result.setReqMesSugerencia((BigDecimal) objectData.getData("REQ_MES_SUGERENCIA"));
        result.setReqDiaSugerencia((BigDecimal) objectData.getData("REQ_DIA_SUGERENCIA"));
        result.setReqNumCorte((BigDecimal) objectData.getData("REQ_NUM_CORTE"));
        result.setReqNumContrato((BigDecimal) objectData.getData("REQ_NUM_CONTRATO"));
        result.setReqSubContrato((BigDecimal) objectData.getData("REQ_SUB_CONTRATO"));
        result.setReqFolioOpera((BigDecimal) objectData.getData("REQ_FOLIO_OPERA"));
        result.setReqHoraRequerim((String) objectData.getData("REQ_HORA_REQUERIM"));
        result.setReqImpRequerido((BigDecimal) objectData.getData("REQ_IMP_REQUERIDO"));
        result.setReqImpVendido((BigDecimal) objectData.getData("REQ_IMP_VENDIDO"));
        result.setReqImpFaltante((BigDecimal) objectData.getData("REQ_IMP_FALTANTE"));
        result.setReqNumOperacion((BigDecimal) objectData.getData("REQ_NUM_OPERACION"));
        result.setReqHoraCorte((String) objectData.getData("REQ_HORA_CORTE"));
        result.setReqCveStReqefec((String) objectData.getData("REQ_CVE_ST_REQEFEC"));

        return result;

    }

}
