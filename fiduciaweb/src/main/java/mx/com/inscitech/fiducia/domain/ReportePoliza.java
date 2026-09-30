package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPORTE_POLIZA_PK",
            columns =
            { "RAS_NUM_CONTRATO", "RAS_FOLIO_OPERA", "RAS_SEC_ASIENTO", "RAS_NUM_CTAM", "RAS_NUM_SCTA", "RAS_NUM_SSCTA", "RAS_NUM_SSSCTA", "RAS_NUM_SSSSCTA", "RAS_NUM_SSSSSCTA"
    }, sequences = { "MANUAL" })
public class ReportePoliza extends DomainObject {

    BigDecimal rasNumContrato = null;
    BigDecimal rasFolioOpera = null;
    BigDecimal rasSecAsiento = null;
    String rasNomContrato = null;
    String rasDescMovto = null;
    String rasDescAsiento = null;
    BigDecimal rasNumCtam = null;
    BigDecimal rasNumScta = null;
    BigDecimal rasNumSscta = null;
    BigDecimal rasNumSsscta = null;
    BigDecimal rasNumSssscta = null;
    BigDecimal rasNumSsssscta = null;
    BigDecimal rasNumAux2 = null;
    BigDecimal rasNumAux3 = null;
    BigDecimal rasImpCargo = null;
    BigDecimal rasImpAbono = null;
    BigDecimal rasFolioCto = null;

    public ReportePoliza() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumContrato(BigDecimal rasNumContrato) {
        this.rasNumContrato = rasNumContrato;
    }

    public BigDecimal getRasNumContrato() {
        return this.rasNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRasFolioOpera(BigDecimal rasFolioOpera) {
        this.rasFolioOpera = rasFolioOpera;
    }

    public BigDecimal getRasFolioOpera() {
        return this.rasFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRasSecAsiento(BigDecimal rasSecAsiento) {
        this.rasSecAsiento = rasSecAsiento;
    }

    public BigDecimal getRasSecAsiento() {
        return this.rasSecAsiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRasNomContrato(String rasNomContrato) {
        this.rasNomContrato = rasNomContrato;
    }

    public String getRasNomContrato() {
        return this.rasNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRasDescMovto(String rasDescMovto) {
        this.rasDescMovto = rasDescMovto;
    }

    public String getRasDescMovto() {
        return this.rasDescMovto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRasDescAsiento(String rasDescAsiento) {
        this.rasDescAsiento = rasDescAsiento;
    }

    public String getRasDescAsiento() {
        return this.rasDescAsiento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumCtam(BigDecimal rasNumCtam) {
        this.rasNumCtam = rasNumCtam;
    }

    public BigDecimal getRasNumCtam() {
        return this.rasNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumScta(BigDecimal rasNumScta) {
        this.rasNumScta = rasNumScta;
    }

    public BigDecimal getRasNumScta() {
        return this.rasNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumSscta(BigDecimal rasNumSscta) {
        this.rasNumSscta = rasNumSscta;
    }

    public BigDecimal getRasNumSscta() {
        return this.rasNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumSsscta(BigDecimal rasNumSsscta) {
        this.rasNumSsscta = rasNumSsscta;
    }

    public BigDecimal getRasNumSsscta() {
        return this.rasNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumSssscta(BigDecimal rasNumSssscta) {
        this.rasNumSssscta = rasNumSssscta;
    }

    public BigDecimal getRasNumSssscta() {
        return this.rasNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumSsssscta(BigDecimal rasNumSsssscta) {
        this.rasNumSsssscta = rasNumSsssscta;
    }

    public BigDecimal getRasNumSsssscta() {
        return this.rasNumSsssscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumAux2(BigDecimal rasNumAux2) {
        this.rasNumAux2 = rasNumAux2;
    }

    public BigDecimal getRasNumAux2() {
        return this.rasNumAux2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRasNumAux3(BigDecimal rasNumAux3) {
        this.rasNumAux3 = rasNumAux3;
    }

    public BigDecimal getRasNumAux3() {
        return this.rasNumAux3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRasImpCargo(BigDecimal rasImpCargo) {
        this.rasImpCargo = rasImpCargo;
    }

    public BigDecimal getRasImpCargo() {
        return this.rasImpCargo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRasImpAbono(BigDecimal rasImpAbono) {
        this.rasImpAbono = rasImpAbono;
    }

    public BigDecimal getRasImpAbono() {
        return this.rasImpAbono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRasFolioCto(BigDecimal rasFolioCto) {
        this.rasFolioCto = rasFolioCto;
    }

    public BigDecimal getRasFolioCto() {
        return this.rasFolioCto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPORTE_POLIZA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRasNumContrato() != null && this.getRasNumContrato().longValue() == -999) {
            conditions += " AND RAS_NUM_CONTRATO IS NULL";
        } else if (this.getRasNumContrato() != null) {
            conditions += " AND RAS_NUM_CONTRATO = ?";
            values.add(this.getRasNumContrato());
        }

        if (this.getRasFolioOpera() != null && this.getRasFolioOpera().longValue() == -999) {
            conditions += " AND RAS_FOLIO_OPERA IS NULL";
        } else if (this.getRasFolioOpera() != null) {
            conditions += " AND RAS_FOLIO_OPERA = ?";
            values.add(this.getRasFolioOpera());
        }

        if (this.getRasSecAsiento() != null && this.getRasSecAsiento().longValue() == -999) {
            conditions += " AND RAS_SEC_ASIENTO IS NULL";
        } else if (this.getRasSecAsiento() != null) {
            conditions += " AND RAS_SEC_ASIENTO = ?";
            values.add(this.getRasSecAsiento());
        }

        if (this.getRasNumCtam() != null && this.getRasNumCtam().longValue() == -999) {
            conditions += " AND RAS_NUM_CTAM IS NULL";
        } else if (this.getRasNumCtam() != null) {
            conditions += " AND RAS_NUM_CTAM = ?";
            values.add(this.getRasNumCtam());
        }

        if (this.getRasNumScta() != null && this.getRasNumScta().longValue() == -999) {
            conditions += " AND RAS_NUM_SCTA IS NULL";
        } else if (this.getRasNumScta() != null) {
            conditions += " AND RAS_NUM_SCTA = ?";
            values.add(this.getRasNumScta());
        }

        if (this.getRasNumSscta() != null && this.getRasNumSscta().longValue() == -999) {
            conditions += " AND RAS_NUM_SSCTA IS NULL";
        } else if (this.getRasNumSscta() != null) {
            conditions += " AND RAS_NUM_SSCTA = ?";
            values.add(this.getRasNumSscta());
        }

        if (this.getRasNumSsscta() != null && this.getRasNumSsscta().longValue() == -999) {
            conditions += " AND RAS_NUM_SSSCTA IS NULL";
        } else if (this.getRasNumSsscta() != null) {
            conditions += " AND RAS_NUM_SSSCTA = ?";
            values.add(this.getRasNumSsscta());
        }

        if (this.getRasNumSssscta() != null && this.getRasNumSssscta().longValue() == -999) {
            conditions += " AND RAS_NUM_SSSSCTA IS NULL";
        } else if (this.getRasNumSssscta() != null) {
            conditions += " AND RAS_NUM_SSSSCTA = ?";
            values.add(this.getRasNumSssscta());
        }

        if (this.getRasNumSsssscta() != null && this.getRasNumSsssscta().longValue() == -999) {
            conditions += " AND RAS_NUM_SSSSSCTA IS NULL";
        } else if (this.getRasNumSsssscta() != null) {
            conditions += " AND RAS_NUM_SSSSSCTA = ?";
            values.add(this.getRasNumSsssscta());
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
        String sql = "SELECT * FROM REPORTE_POLIZA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRasNumContrato() != null && this.getRasNumContrato().longValue() == -999) {
            conditions += " AND RAS_NUM_CONTRATO IS NULL";
        } else if (this.getRasNumContrato() != null) {
            conditions += " AND RAS_NUM_CONTRATO = ?";
            values.add(this.getRasNumContrato());
        }

        if (this.getRasFolioOpera() != null && this.getRasFolioOpera().longValue() == -999) {
            conditions += " AND RAS_FOLIO_OPERA IS NULL";
        } else if (this.getRasFolioOpera() != null) {
            conditions += " AND RAS_FOLIO_OPERA = ?";
            values.add(this.getRasFolioOpera());
        }

        if (this.getRasSecAsiento() != null && this.getRasSecAsiento().longValue() == -999) {
            conditions += " AND RAS_SEC_ASIENTO IS NULL";
        } else if (this.getRasSecAsiento() != null) {
            conditions += " AND RAS_SEC_ASIENTO = ?";
            values.add(this.getRasSecAsiento());
        }

        if (this.getRasNomContrato() != null && "null".equals(this.getRasNomContrato())) {
            conditions += " AND RAS_NOM_CONTRATO IS NULL";
        } else if (this.getRasNomContrato() != null) {
            conditions += " AND RAS_NOM_CONTRATO = ?";
            values.add(this.getRasNomContrato());
        }

        if (this.getRasDescMovto() != null && "null".equals(this.getRasDescMovto())) {
            conditions += " AND RAS_DESC_MOVTO IS NULL";
        } else if (this.getRasDescMovto() != null) {
            conditions += " AND RAS_DESC_MOVTO = ?";
            values.add(this.getRasDescMovto());
        }

        if (this.getRasDescAsiento() != null && "null".equals(this.getRasDescAsiento())) {
            conditions += " AND RAS_DESC_ASIENTO IS NULL";
        } else if (this.getRasDescAsiento() != null) {
            conditions += " AND RAS_DESC_ASIENTO = ?";
            values.add(this.getRasDescAsiento());
        }

        if (this.getRasNumCtam() != null && this.getRasNumCtam().longValue() == -999) {
            conditions += " AND RAS_NUM_CTAM IS NULL";
        } else if (this.getRasNumCtam() != null) {
            conditions += " AND RAS_NUM_CTAM = ?";
            values.add(this.getRasNumCtam());
        }

        if (this.getRasNumScta() != null && this.getRasNumScta().longValue() == -999) {
            conditions += " AND RAS_NUM_SCTA IS NULL";
        } else if (this.getRasNumScta() != null) {
            conditions += " AND RAS_NUM_SCTA = ?";
            values.add(this.getRasNumScta());
        }

        if (this.getRasNumSscta() != null && this.getRasNumSscta().longValue() == -999) {
            conditions += " AND RAS_NUM_SSCTA IS NULL";
        } else if (this.getRasNumSscta() != null) {
            conditions += " AND RAS_NUM_SSCTA = ?";
            values.add(this.getRasNumSscta());
        }

        if (this.getRasNumSsscta() != null && this.getRasNumSsscta().longValue() == -999) {
            conditions += " AND RAS_NUM_SSSCTA IS NULL";
        } else if (this.getRasNumSsscta() != null) {
            conditions += " AND RAS_NUM_SSSCTA = ?";
            values.add(this.getRasNumSsscta());
        }

        if (this.getRasNumSssscta() != null && this.getRasNumSssscta().longValue() == -999) {
            conditions += " AND RAS_NUM_SSSSCTA IS NULL";
        } else if (this.getRasNumSssscta() != null) {
            conditions += " AND RAS_NUM_SSSSCTA = ?";
            values.add(this.getRasNumSssscta());
        }

        if (this.getRasNumSsssscta() != null && this.getRasNumSsssscta().longValue() == -999) {
            conditions += " AND RAS_NUM_SSSSSCTA IS NULL";
        } else if (this.getRasNumSsssscta() != null) {
            conditions += " AND RAS_NUM_SSSSSCTA = ?";
            values.add(this.getRasNumSsssscta());
        }

        if (this.getRasNumAux2() != null && this.getRasNumAux2().longValue() == -999) {
            conditions += " AND RAS_NUM_AUX2 IS NULL";
        } else if (this.getRasNumAux2() != null) {
            conditions += " AND RAS_NUM_AUX2 = ?";
            values.add(this.getRasNumAux2());
        }

        if (this.getRasNumAux3() != null && this.getRasNumAux3().longValue() == -999) {
            conditions += " AND RAS_NUM_AUX3 IS NULL";
        } else if (this.getRasNumAux3() != null) {
            conditions += " AND RAS_NUM_AUX3 = ?";
            values.add(this.getRasNumAux3());
        }

        if (this.getRasImpCargo() != null && this.getRasImpCargo().longValue() == -999) {
            conditions += " AND RAS_IMP_CARGO IS NULL";
        } else if (this.getRasImpCargo() != null) {
            conditions += " AND RAS_IMP_CARGO = ?";
            values.add(this.getRasImpCargo());
        }

        if (this.getRasImpAbono() != null && this.getRasImpAbono().longValue() == -999) {
            conditions += " AND RAS_IMP_ABONO IS NULL";
        } else if (this.getRasImpAbono() != null) {
            conditions += " AND RAS_IMP_ABONO = ?";
            values.add(this.getRasImpAbono());
        }

        if (this.getRasFolioCto() != null && this.getRasFolioCto().longValue() == -999) {
            conditions += " AND RAS_FOLIO_CTO IS NULL";
        } else if (this.getRasFolioCto() != null) {
            conditions += " AND RAS_FOLIO_CTO = ?";
            values.add(this.getRasFolioCto());
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
        String sql = "UPDATE REPORTE_POLIZA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RAS_NUM_CONTRATO = ?";
        pkValues.add(this.getRasNumContrato());
        conditions += " AND RAS_FOLIO_OPERA = ?";
        pkValues.add(this.getRasFolioOpera());
        conditions += " AND RAS_SEC_ASIENTO = ?";
        pkValues.add(this.getRasSecAsiento());
        fields += " RAS_NOM_CONTRATO = ?, ";
        values.add(this.getRasNomContrato());
        fields += " RAS_DESC_MOVTO = ?, ";
        values.add(this.getRasDescMovto());
        fields += " RAS_DESC_ASIENTO = ?, ";
        values.add(this.getRasDescAsiento());
        conditions += " AND RAS_NUM_CTAM = ?";
        pkValues.add(this.getRasNumCtam());
        conditions += " AND RAS_NUM_SCTA = ?";
        pkValues.add(this.getRasNumScta());
        conditions += " AND RAS_NUM_SSCTA = ?";
        pkValues.add(this.getRasNumSscta());
        conditions += " AND RAS_NUM_SSSCTA = ?";
        pkValues.add(this.getRasNumSsscta());
        conditions += " AND RAS_NUM_SSSSCTA = ?";
        pkValues.add(this.getRasNumSssscta());
        conditions += " AND RAS_NUM_SSSSSCTA = ?";
        pkValues.add(this.getRasNumSsssscta());
        fields += " RAS_NUM_AUX2 = ?, ";
        values.add(this.getRasNumAux2());
        fields += " RAS_NUM_AUX3 = ?, ";
        values.add(this.getRasNumAux3());
        fields += " RAS_IMP_CARGO = ?, ";
        values.add(this.getRasImpCargo());
        fields += " RAS_IMP_ABONO = ?, ";
        values.add(this.getRasImpAbono());
        fields += " RAS_FOLIO_CTO = ?, ";
        values.add(this.getRasFolioCto());
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
        String sql = "INSERT INTO REPORTE_POLIZA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RAS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRasNumContrato());

        fields += ", RAS_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getRasFolioOpera());

        fields += ", RAS_SEC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getRasSecAsiento());

        fields += ", RAS_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRasNomContrato());

        fields += ", RAS_DESC_MOVTO";
        fieldValues += ", ?";
        values.add(this.getRasDescMovto());

        fields += ", RAS_DESC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getRasDescAsiento());

        fields += ", RAS_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getRasNumCtam());

        fields += ", RAS_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getRasNumScta());

        fields += ", RAS_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getRasNumSscta());

        fields += ", RAS_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getRasNumSsscta());

        fields += ", RAS_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getRasNumSssscta());

        fields += ", RAS_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getRasNumSsssscta());

        fields += ", RAS_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getRasNumAux2());

        fields += ", RAS_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getRasNumAux3());

        fields += ", RAS_IMP_CARGO";
        fieldValues += ", ?";
        values.add(this.getRasImpCargo());

        fields += ", RAS_IMP_ABONO";
        fieldValues += ", ?";
        values.add(this.getRasImpAbono());

        fields += ", RAS_FOLIO_CTO";
        fieldValues += ", ?";
        values.add(this.getRasFolioCto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPORTE_POLIZA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RAS_NUM_CONTRATO = ?";
        values.add(this.getRasNumContrato());
        conditions += " AND RAS_FOLIO_OPERA = ?";
        values.add(this.getRasFolioOpera());
        conditions += " AND RAS_SEC_ASIENTO = ?";
        values.add(this.getRasSecAsiento());
        conditions += " AND RAS_NUM_CTAM = ?";
        values.add(this.getRasNumCtam());
        conditions += " AND RAS_NUM_SCTA = ?";
        values.add(this.getRasNumScta());
        conditions += " AND RAS_NUM_SSCTA = ?";
        values.add(this.getRasNumSscta());
        conditions += " AND RAS_NUM_SSSCTA = ?";
        values.add(this.getRasNumSsscta());
        conditions += " AND RAS_NUM_SSSSCTA = ?";
        values.add(this.getRasNumSssscta());
        conditions += " AND RAS_NUM_SSSSSCTA = ?";
        values.add(this.getRasNumSsssscta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ReportePoliza instance = (ReportePoliza) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRasNumContrato().equals(instance.getRasNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRasFolioOpera().equals(instance.getRasFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getRasSecAsiento().equals(instance.getRasSecAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getRasNomContrato().equals(instance.getRasNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRasDescMovto().equals(instance.getRasDescMovto()))
            equalObjects = false;
        if (equalObjects && !this.getRasDescAsiento().equals(instance.getRasDescAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getRasNumCtam().equals(instance.getRasNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getRasNumScta().equals(instance.getRasNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getRasNumSscta().equals(instance.getRasNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getRasNumSsscta().equals(instance.getRasNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getRasNumSssscta().equals(instance.getRasNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getRasNumSsssscta().equals(instance.getRasNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getRasNumAux2().equals(instance.getRasNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getRasNumAux3().equals(instance.getRasNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getRasImpCargo().equals(instance.getRasImpCargo()))
            equalObjects = false;
        if (equalObjects && !this.getRasImpAbono().equals(instance.getRasImpAbono()))
            equalObjects = false;
        if (equalObjects && !this.getRasFolioCto().equals(instance.getRasFolioCto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ReportePoliza result = new ReportePoliza();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRasNumContrato((BigDecimal) objectData.getData("RAS_NUM_CONTRATO"));
        result.setRasFolioOpera((BigDecimal) objectData.getData("RAS_FOLIO_OPERA"));
        result.setRasSecAsiento((BigDecimal) objectData.getData("RAS_SEC_ASIENTO"));
        result.setRasNomContrato((String) objectData.getData("RAS_NOM_CONTRATO"));
        result.setRasDescMovto((String) objectData.getData("RAS_DESC_MOVTO"));
        result.setRasDescAsiento((String) objectData.getData("RAS_DESC_ASIENTO"));
        result.setRasNumCtam((BigDecimal) objectData.getData("RAS_NUM_CTAM"));
        result.setRasNumScta((BigDecimal) objectData.getData("RAS_NUM_SCTA"));
        result.setRasNumSscta((BigDecimal) objectData.getData("RAS_NUM_SSCTA"));
        result.setRasNumSsscta((BigDecimal) objectData.getData("RAS_NUM_SSSCTA"));
        result.setRasNumSssscta((BigDecimal) objectData.getData("RAS_NUM_SSSSCTA"));
        result.setRasNumSsssscta((BigDecimal) objectData.getData("RAS_NUM_SSSSSCTA"));
        result.setRasNumAux2((BigDecimal) objectData.getData("RAS_NUM_AUX2"));
        result.setRasNumAux3((BigDecimal) objectData.getData("RAS_NUM_AUX3"));
        result.setRasImpCargo((BigDecimal) objectData.getData("RAS_IMP_CARGO"));
        result.setRasImpAbono((BigDecimal) objectData.getData("RAS_IMP_ABONO"));
        result.setRasFolioCto((BigDecimal) objectData.getData("RAS_FOLIO_CTO"));

        return result;

    }

}
