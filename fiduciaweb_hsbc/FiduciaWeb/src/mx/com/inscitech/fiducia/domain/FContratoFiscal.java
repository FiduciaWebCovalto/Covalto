package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;

@PrimaryKey(constraintName = "F_CONTRATO_FISCAL", columns = { "FPF_PROSPECTO" }, sequences = { "MANUAL" })
public class FContratoFiscal extends DomainObject {
    BigDecimal fpfProspecto = null;
    BigDecimal fpfFideicomiso = null;
    String fpfClasFatca = null;
    BigDecimal fpfAutocerFatca = null;
    String fpfClasCrs = null;
    BigDecimal fpfAutocerCrs = null;
    String fpfGin = null;
    BigDecimal fpfRetencionFiscal = null;
    String fpfTin = null;
    String fpfExcento = null;
    String fpfPaisResidencia = null;
    String fpfClasificacionSat = null;

    public FContratoFiscal() {
        super();
        this.pkColumns = 8;
    }

    public void setFpfProspecto(BigDecimal fpfProspecto) {
        this.fpfProspecto = fpfProspecto;
    }

    public void setFpfFideicomiso(BigDecimal fpfFideicomiso) {
        this.fpfFideicomiso = fpfFideicomiso;
    }

    public void setFpfClasFatca(String fpfClasFatca) {
        this.fpfClasFatca = fpfClasFatca;
    }

    public void setFpfAutocerFatca(BigDecimal fpfAutocerFatca) {
        this.fpfAutocerFatca = fpfAutocerFatca;
    }

    public void setFpfClasCrs(String fpfClasCrs) {
        this.fpfClasCrs = fpfClasCrs;
    }

    public void setFpfAutocerCrs(BigDecimal fpfAutocerCrs) {
        this.fpfAutocerCrs = fpfAutocerCrs;
    }

    public void setFpfGin(String fpfGin) {
        this.fpfGin = fpfGin;
    }

    public void setFpfRetencionFiscal(BigDecimal fpfRetencionFiscal) {
        this.fpfRetencionFiscal = fpfRetencionFiscal;
    }

    public void setFpfTin(String fpfTin) {
        this.fpfTin = fpfTin;
    }

    public void setFpfExcento(String fpfExcento) {
        this.fpfExcento = fpfExcento;
    }

    public void setFpfPaisResidencia(String fpfPaisResidencia) {
        this.fpfPaisResidencia = fpfPaisResidencia;
    }

    public void setFpfClasificacionSat(String fpfClasificacionSat) {
        this.fpfClasificacionSat = fpfClasificacionSat;
    }

    public BigDecimal getFpfProspecto() {
        return this.fpfProspecto;
    }

    public BigDecimal getFpfFideicomiso() {
        return this.fpfFideicomiso;
    }

    public String getFpfClasFatca() {
        return this.fpfClasFatca;
    }

    public BigDecimal getFpfAutocerFatca() {
        return this.fpfAutocerFatca;
    }

    public String getFpfClasCrs() {
        return this.fpfClasCrs;
    }

    public BigDecimal getFpfAutocerCrs() {
        return this.fpfAutocerCrs;
    }

    public String getFpfGin() {
        return this.fpfGin;
    }

    public BigDecimal getFpfRetencionFiscal() {
        return this.fpfRetencionFiscal;
    }

    public String getFpfTin() {
        return this.fpfTin;
    }

    public String getFpfExcento() {
        return this.fpfExcento;
    }

    public String getFpfPaisResidencia() {
        return this.fpfPaisResidencia;
    }

    public String getFpfClasificacionSat() {
        return this.fpfClasificacionSat;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONTRATO_FISCAL";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFpfProspecto() != null && this.getFpfProspecto().longValue() == -999) {
            conditions += " AND FPF_PROSPECTO IS NULL";
        } else if (this.getFpfProspecto() != null) {
            conditions += " AND FPF_PROSPECTO =?";
            values.add(this.getFpfProspecto());
        }
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getSelect() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONTRATO_FISCAL ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE F_CONTRATO_FISCAL SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND FPF_PROSPECTO = ?";
        pkValues.add(this.getFpfProspecto());
        fields += " FPF_FIDEICOMISO = ?, ";
        values.add(this.getFpfFideicomiso());
        fields += " FPF_CLAS_FATCA = ?, ";
        values.add(this.getFpfClasFatca());
        fields += " FPF_AUTOCER_FATCA = ?, ";
        values.add(this.getFpfAutocerFatca());
        fields += " FPF_CLAS_CRS = ?, ";
        values.add(this.getFpfClasCrs());
        fields += " FPF_AUTOCER_CRS = ?, ";
        values.add(this.getFpfAutocerCrs());
        fields += " FPF_GIN = ?, ";
        values.add(this.getFpfGin());
        fields += " FPF_RETENCION_FISCAL = ?, ";
        values.add(this.getFpfRetencionFiscal());
        fields += " FPF_TIN = ?, ";
        values.add(this.getFpfTin());
        fields += " FPF_EXCENTO = ?, ";
        values.add(this.getFpfExcento());
        fields += " FPF_PAIS_RESIDENCIA = ?, ";
        values.add(this.getFpfPaisResidencia());
        fields += " FPF_CLASIFICACION_SAT = ?, ";
        values.add(this.getFpfClasificacionSat());
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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO F_CONTRATO_FISCAL ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FPF_PROSPECTO ";
        fieldValues += ", ?";
        values.add(this.getFpfProspecto());
        fields += ",FPF_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFpfFideicomiso());
        fields += ",FPF_CLAS_FATCA ";
        fieldValues += ", ?";
        values.add(this.getFpfClasFatca());
        fields += ",FPF_AUTOCER_FATCA ";
        fieldValues += ", ?";
        values.add(this.getFpfAutocerFatca());
        fields += ",FPF_CLAS_CRS ";
        fieldValues += ", ?";
        values.add(this.getFpfClasCrs());
        fields += ",FPF_AUTOCER_CRS ";
        fieldValues += ", ?";
        values.add(this.getFpfAutocerCrs());
        fields += ",FPF_GIN ";
        fieldValues += ", ?";
        values.add(this.getFpfGin());
        fields += ",FPF_RETENCION_FISCAL ";
        fieldValues += ", ?";
        values.add(this.getFpfRetencionFiscal());
        fields += ",FPF_TIN ";
        fieldValues += ", ?";
        values.add(this.getFpfTin());
        fields += ",FPF_EXCENTO ";
        fieldValues += ", ?";
        values.add(this.getFpfExcento());
        fields += ",FPF_PAIS_RESIDENCIA ";
        fieldValues += ", ?";
        values.add(this.getFpfPaisResidencia());
        fields += ",FPF_CLASIFICACION_SAT ";
        fieldValues += ", ?";
        values.add(this.getFpfClasificacionSat());
        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();
        sql += fields + " ) VALUES (" + fieldValues + ")";
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONTRATO_FISCAL WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FPF_PROSPECTO = ?";
        values.add(this.getFpfProspecto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FContratoFiscal instance = (FContratoFiscal) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFpfProspecto().equals(instance.getFpfProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getFpfFideicomiso().equals(instance.getFpfFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFpfClasFatca().equals(instance.getFpfClasFatca()))
            equalObjects = false;
        if (equalObjects && !this.getFpfAutocerFatca().equals(instance.getFpfAutocerFatca()))
            equalObjects = false;
        if (equalObjects && !this.getFpfClasCrs().equals(instance.getFpfClasCrs()))
            equalObjects = false;
        if (equalObjects && !this.getFpfAutocerCrs().equals(instance.getFpfAutocerCrs()))
            equalObjects = false;
        if (equalObjects && !this.getFpfGin().equals(instance.getFpfGin()))
            equalObjects = false;
        if (equalObjects && !this.getFpfRetencionFiscal().equals(instance.getFpfRetencionFiscal()))
            equalObjects = false;
        if (equalObjects && !this.getFpfTin().equals(instance.getFpfTin()))
            equalObjects = false;
        if (equalObjects && !this.getFpfExcento().equals(instance.getFpfExcento()))
            equalObjects = false;
        if (equalObjects && !this.getFpfPaisResidencia().equals(instance.getFpfPaisResidencia()))
            equalObjects = false;
        if (equalObjects && !this.getFpfClasificacionSat().equals(instance.getFpfClasificacionSat()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FContratoFiscal result = new FContratoFiscal();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFpfProspecto((BigDecimal) objectData.getData("FPF_PROSPECTO"));
        result.setFpfFideicomiso((BigDecimal) objectData.getData("FPF_FIDEICOMISO"));
        result.setFpfClasFatca((String) objectData.getData("FPF_CLAS_FATCA"));
        result.setFpfAutocerFatca((BigDecimal) objectData.getData("FPF_AUTOCER_FATCA"));
        result.setFpfClasCrs((String) objectData.getData("FPF_CLAS_CRS"));
        result.setFpfAutocerCrs((BigDecimal) objectData.getData("FPF_AUTOCER_CRS"));
        result.setFpfGin((String) objectData.getData("FPF_GIN"));
        result.setFpfRetencionFiscal((BigDecimal) objectData.getData("FPF_RETENCION_FISCAL"));
        result.setFpfTin((String) objectData.getData("FPF_TIN"));
        result.setFpfExcento((String) objectData.getData("FPF_EXCENTO"));
        result.setFpfPaisResidencia((String) objectData.getData("FPF_PAIS_RESIDENCIA"));
        result.setFpfClasificacionSat((String) objectData.getData("FPF_CLASIFICACION_SAT"));
        return result;
    }
}
