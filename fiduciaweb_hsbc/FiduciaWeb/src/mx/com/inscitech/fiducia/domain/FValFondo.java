package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_VAL_FONDO_PK", columns = { "FHCC_ID_FIDEICOMISO", "FHCC_ID_CREDITO", "FHCC_ID_FEC_VALUACION", "FHCC_ID_CTO_INVER", "FHCC_ID_SECUENCIAL" },
            sequences = { "MANUAL" })
public class FValFondo extends DomainObject {

    BigDecimal fhccIdFideicomiso = null;
    String fhccIdCredito = null;
    String fhccIdFecValuacion = null;
    BigDecimal fhccIdCtoInver = null;
    BigDecimal fhccIdSecuencial = null;
    BigDecimal fhccSaldoInicio = null;
    BigDecimal fhccSaldoFinal = null;
    BigDecimal fhccMoneda = null;
    BigDecimal fhccTipoCambio = null;
    BigDecimal fhccFolioMovto = null;
    String fhroTexComentario = null;
    String fhroStPropor = null;

    public FValFondo() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFhccIdFideicomiso(BigDecimal fhccIdFideicomiso) {
        this.fhccIdFideicomiso = fhccIdFideicomiso;
    }

    public BigDecimal getFhccIdFideicomiso() {
        return this.fhccIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFhccIdCredito(String fhccIdCredito) {
        this.fhccIdCredito = fhccIdCredito;
    }

    public String getFhccIdCredito() {
        return this.fhccIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFhccIdFecValuacion(String fhccIdFecValuacion) {
        this.fhccIdFecValuacion = fhccIdFecValuacion;
    }

    public String getFhccIdFecValuacion() {
        return this.fhccIdFecValuacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFhccIdCtoInver(BigDecimal fhccIdCtoInver) {
        this.fhccIdCtoInver = fhccIdCtoInver;
    }

    public BigDecimal getFhccIdCtoInver() {
        return this.fhccIdCtoInver;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFhccIdSecuencial(BigDecimal fhccIdSecuencial) {
        this.fhccIdSecuencial = fhccIdSecuencial;
    }

    public BigDecimal getFhccIdSecuencial() {
        return this.fhccIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFhccSaldoInicio(BigDecimal fhccSaldoInicio) {
        this.fhccSaldoInicio = fhccSaldoInicio;
    }

    public BigDecimal getFhccSaldoInicio() {
        return this.fhccSaldoInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFhccSaldoFinal(BigDecimal fhccSaldoFinal) {
        this.fhccSaldoFinal = fhccSaldoFinal;
    }

    public BigDecimal getFhccSaldoFinal() {
        return this.fhccSaldoFinal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFhccMoneda(BigDecimal fhccMoneda) {
        this.fhccMoneda = fhccMoneda;
    }

    public BigDecimal getFhccMoneda() {
        return this.fhccMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFhccTipoCambio(BigDecimal fhccTipoCambio) {
        this.fhccTipoCambio = fhccTipoCambio;
    }

    public BigDecimal getFhccTipoCambio() {
        return this.fhccTipoCambio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFhccFolioMovto(BigDecimal fhccFolioMovto) {
        this.fhccFolioMovto = fhccFolioMovto;
    }

    public BigDecimal getFhccFolioMovto() {
        return this.fhccFolioMovto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFhroTexComentario(String fhroTexComentario) {
        this.fhroTexComentario = fhroTexComentario;
    }

    public String getFhroTexComentario() {
        return this.fhroTexComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFhroStPropor(String fhroStPropor) {
        this.fhroStPropor = fhroStPropor;
    }

    public String getFhroStPropor() {
        return this.fhroStPropor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_VAL_FONDO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFhccIdFideicomiso() != null && this.getFhccIdFideicomiso().longValue() == -999) {
            conditions += " AND FHCC_ID_FIDEICOMISO IS NULL";
        } else if (this.getFhccIdFideicomiso() != null) {
            conditions += " AND FHCC_ID_FIDEICOMISO = ?";
            values.add(this.getFhccIdFideicomiso());
        }

        if (this.getFhccIdCredito() != null && "null".equals(this.getFhccIdCredito())) {
            conditions += " AND FHCC_ID_CREDITO IS NULL";
        } else if (this.getFhccIdCredito() != null) {
            conditions += " AND FHCC_ID_CREDITO = ?";
            values.add(this.getFhccIdCredito());
        }

        if (this.getFhccIdFecValuacion() != null && "null".equals(this.getFhccIdFecValuacion())) {
            conditions += " AND FHCC_ID_FEC_VALUACION IS NULL";
        } else if (this.getFhccIdFecValuacion() != null) {
            conditions += " AND FHCC_ID_FEC_VALUACION = ?";
            values.add(this.getFhccIdFecValuacion());
        }

        if (this.getFhccIdCtoInver() != null && this.getFhccIdCtoInver().longValue() == -999) {
            conditions += " AND FHCC_ID_CTO_INVER IS NULL";
        } else if (this.getFhccIdCtoInver() != null) {
            conditions += " AND FHCC_ID_CTO_INVER = ?";
            values.add(this.getFhccIdCtoInver());
        }

        if (this.getFhccIdSecuencial() != null && this.getFhccIdSecuencial().longValue() == -999) {
            conditions += " AND FHCC_ID_SECUENCIAL IS NULL";
        } else if (this.getFhccIdSecuencial() != null) {
            conditions += " AND FHCC_ID_SECUENCIAL = ?";
            values.add(this.getFhccIdSecuencial());
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
        String sql = "SELECT * FROM F_VAL_FONDO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFhccIdFideicomiso() != null && this.getFhccIdFideicomiso().longValue() == -999) {
            conditions += " AND FHCC_ID_FIDEICOMISO IS NULL";
        } else if (this.getFhccIdFideicomiso() != null) {
            conditions += " AND FHCC_ID_FIDEICOMISO = ?";
            values.add(this.getFhccIdFideicomiso());
        }

        if (this.getFhccIdCredito() != null && "null".equals(this.getFhccIdCredito())) {
            conditions += " AND FHCC_ID_CREDITO IS NULL";
        } else if (this.getFhccIdCredito() != null) {
            conditions += " AND FHCC_ID_CREDITO = ?";
            values.add(this.getFhccIdCredito());
        }

        if (this.getFhccIdFecValuacion() != null && "null".equals(this.getFhccIdFecValuacion())) {
            conditions += " AND FHCC_ID_FEC_VALUACION IS NULL";
        } else if (this.getFhccIdFecValuacion() != null) {
            conditions += " AND FHCC_ID_FEC_VALUACION = ?";
            values.add(this.getFhccIdFecValuacion());
        }

        if (this.getFhccIdCtoInver() != null && this.getFhccIdCtoInver().longValue() == -999) {
            conditions += " AND FHCC_ID_CTO_INVER IS NULL";
        } else if (this.getFhccIdCtoInver() != null) {
            conditions += " AND FHCC_ID_CTO_INVER = ?";
            values.add(this.getFhccIdCtoInver());
        }

        if (this.getFhccIdSecuencial() != null && this.getFhccIdSecuencial().longValue() == -999) {
            conditions += " AND FHCC_ID_SECUENCIAL IS NULL";
        } else if (this.getFhccIdSecuencial() != null) {
            conditions += " AND FHCC_ID_SECUENCIAL = ?";
            values.add(this.getFhccIdSecuencial());
        }

        if (this.getFhccSaldoInicio() != null && this.getFhccSaldoInicio().longValue() == -999) {
            conditions += " AND FHCC_SALDO_INICIO IS NULL";
        } else if (this.getFhccSaldoInicio() != null) {
            conditions += " AND FHCC_SALDO_INICIO = ?";
            values.add(this.getFhccSaldoInicio());
        }

        if (this.getFhccSaldoFinal() != null && this.getFhccSaldoFinal().longValue() == -999) {
            conditions += " AND FHCC_SALDO_FINAL IS NULL";
        } else if (this.getFhccSaldoFinal() != null) {
            conditions += " AND FHCC_SALDO_FINAL = ?";
            values.add(this.getFhccSaldoFinal());
        }

        if (this.getFhccMoneda() != null && this.getFhccMoneda().longValue() == -999) {
            conditions += " AND FHCC_MONEDA IS NULL";
        } else if (this.getFhccMoneda() != null) {
            conditions += " AND FHCC_MONEDA = ?";
            values.add(this.getFhccMoneda());
        }

        if (this.getFhccTipoCambio() != null && this.getFhccTipoCambio().longValue() == -999) {
            conditions += " AND FHCC_TIPO_CAMBIO IS NULL";
        } else if (this.getFhccTipoCambio() != null) {
            conditions += " AND FHCC_TIPO_CAMBIO = ?";
            values.add(this.getFhccTipoCambio());
        }

        if (this.getFhccFolioMovto() != null && this.getFhccFolioMovto().longValue() == -999) {
            conditions += " AND FHCC_FOLIO_MOVTO IS NULL";
        } else if (this.getFhccFolioMovto() != null) {
            conditions += " AND FHCC_FOLIO_MOVTO = ?";
            values.add(this.getFhccFolioMovto());
        }

        if (this.getFhroTexComentario() != null && "null".equals(this.getFhroTexComentario())) {
            conditions += " AND FHRO_TEX_COMENTARIO IS NULL";
        } else if (this.getFhroTexComentario() != null) {
            conditions += " AND FHRO_TEX_COMENTARIO = ?";
            values.add(this.getFhroTexComentario());
        }

        if (this.getFhroStPropor() != null && "null".equals(this.getFhroStPropor())) {
            conditions += " AND FHRO_ST_PROPOR IS NULL";
        } else if (this.getFhroStPropor() != null) {
            conditions += " AND FHRO_ST_PROPOR = ?";
            values.add(this.getFhroStPropor());
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
        String sql = "UPDATE F_VAL_FONDO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FHCC_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFhccIdFideicomiso());
        conditions += " AND FHCC_ID_CREDITO = ?";
        pkValues.add(this.getFhccIdCredito());
        conditions += " AND FHCC_ID_FEC_VALUACION = ?";
        pkValues.add(this.getFhccIdFecValuacion());
        conditions += " AND FHCC_ID_CTO_INVER = ?";
        pkValues.add(this.getFhccIdCtoInver());
        conditions += " AND FHCC_ID_SECUENCIAL = ?";
        pkValues.add(this.getFhccIdSecuencial());
        fields += " FHCC_SALDO_INICIO = ?, ";
        values.add(this.getFhccSaldoInicio());
        fields += " FHCC_SALDO_FINAL = ?, ";
        values.add(this.getFhccSaldoFinal());
        fields += " FHCC_MONEDA = ?, ";
        values.add(this.getFhccMoneda());
        fields += " FHCC_TIPO_CAMBIO = ?, ";
        values.add(this.getFhccTipoCambio());
        fields += " FHCC_FOLIO_MOVTO = ?, ";
        values.add(this.getFhccFolioMovto());
        fields += " FHRO_TEX_COMENTARIO = ?, ";
        values.add(this.getFhroTexComentario());
        fields += " FHRO_ST_PROPOR = ?, ";
        values.add(this.getFhroStPropor());
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
        String sql = "INSERT INTO F_VAL_FONDO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FHCC_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFhccIdFideicomiso());

        fields += ", FHCC_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFhccIdCredito());

        fields += ", FHCC_ID_FEC_VALUACION";
        fieldValues += ", ?";
        values.add(this.getFhccIdFecValuacion());

        fields += ", FHCC_ID_CTO_INVER";
        fieldValues += ", ?";
        values.add(this.getFhccIdCtoInver());

        fields += ", FHCC_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFhccIdSecuencial());

        fields += ", FHCC_SALDO_INICIO";
        fieldValues += ", ?";
        values.add(this.getFhccSaldoInicio());

        fields += ", FHCC_SALDO_FINAL";
        fieldValues += ", ?";
        values.add(this.getFhccSaldoFinal());

        fields += ", FHCC_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFhccMoneda());

        fields += ", FHCC_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getFhccTipoCambio());

        fields += ", FHCC_FOLIO_MOVTO";
        fieldValues += ", ?";
        values.add(this.getFhccFolioMovto());

        fields += ", FHRO_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFhroTexComentario());

        fields += ", FHRO_ST_PROPOR";
        fieldValues += ", ?";
        values.add(this.getFhroStPropor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_VAL_FONDO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FHCC_ID_FIDEICOMISO = ?";
        values.add(this.getFhccIdFideicomiso());
        conditions += " AND FHCC_ID_CREDITO = ?";
        values.add(this.getFhccIdCredito());
        conditions += " AND FHCC_ID_FEC_VALUACION = ?";
        values.add(this.getFhccIdFecValuacion());
        conditions += " AND FHCC_ID_CTO_INVER = ?";
        values.add(this.getFhccIdCtoInver());
        conditions += " AND FHCC_ID_SECUENCIAL = ?";
        values.add(this.getFhccIdSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FValFondo instance = (FValFondo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFhccIdFideicomiso().equals(instance.getFhccIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFhccIdCredito().equals(instance.getFhccIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFhccIdFecValuacion().equals(instance.getFhccIdFecValuacion()))
            equalObjects = false;
        if (equalObjects && !this.getFhccIdCtoInver().equals(instance.getFhccIdCtoInver()))
            equalObjects = false;
        if (equalObjects && !this.getFhccIdSecuencial().equals(instance.getFhccIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFhccSaldoInicio().equals(instance.getFhccSaldoInicio()))
            equalObjects = false;
        if (equalObjects && !this.getFhccSaldoFinal().equals(instance.getFhccSaldoFinal()))
            equalObjects = false;
        if (equalObjects && !this.getFhccMoneda().equals(instance.getFhccMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFhccTipoCambio().equals(instance.getFhccTipoCambio()))
            equalObjects = false;
        if (equalObjects && !this.getFhccFolioMovto().equals(instance.getFhccFolioMovto()))
            equalObjects = false;
        if (equalObjects && !this.getFhroTexComentario().equals(instance.getFhroTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFhroStPropor().equals(instance.getFhroStPropor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FValFondo result = new FValFondo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFhccIdFideicomiso((BigDecimal) objectData.getData("FHCC_ID_FIDEICOMISO"));
        result.setFhccIdCredito((String) objectData.getData("FHCC_ID_CREDITO"));
        result.setFhccIdFecValuacion((String) objectData.getData("FHCC_ID_FEC_VALUACION"));
        result.setFhccIdCtoInver((BigDecimal) objectData.getData("FHCC_ID_CTO_INVER"));
        result.setFhccIdSecuencial((BigDecimal) objectData.getData("FHCC_ID_SECUENCIAL"));
        result.setFhccSaldoInicio((BigDecimal) objectData.getData("FHCC_SALDO_INICIO"));
        result.setFhccSaldoFinal((BigDecimal) objectData.getData("FHCC_SALDO_FINAL"));
        result.setFhccMoneda((BigDecimal) objectData.getData("FHCC_MONEDA"));
        result.setFhccTipoCambio((BigDecimal) objectData.getData("FHCC_TIPO_CAMBIO"));
        result.setFhccFolioMovto((BigDecimal) objectData.getData("FHCC_FOLIO_MOVTO"));
        result.setFhroTexComentario((String) objectData.getData("FHRO_TEX_COMENTARIO"));
        result.setFhroStPropor((String) objectData.getData("FHRO_ST_PROPOR"));

        return result;

    }

}
