package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_LINEAS_CREDITO_PK", columns = { "LCR_ID_FIDEICOMISO", "LCR_ID_LINEA" }, sequences = { "MANUAL" })
public class FLineasCredito extends DomainObject {

    BigDecimal lcrIdFideicomiso = null;
    BigDecimal lcrIdLinea = null;
    BigDecimal lcrScta = null;
    BigDecimal lcrTipoCredito = null;
    BigDecimal lcrInstitucion = null;
    BigDecimal lcrImpCredito = null;
    BigDecimal lcrNumDispo = null;
    BigDecimal lcrImpDispo = null;
    BigDecimal lcrTasa = null;
    BigDecimal lcrPlazo = null;
    String lcrFechaApertura = null;
    String lcrFechaVencimiento = null;
    String lcrUltDispo = null;
    String lcrComentario = null;
    String lcrFecAlta = null;
    String lcrStatus = null;

    public FLineasCredito() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLcrIdFideicomiso(BigDecimal lcrIdFideicomiso) {
        this.lcrIdFideicomiso = lcrIdFideicomiso;
    }

    public BigDecimal getLcrIdFideicomiso() {
        return this.lcrIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLcrIdLinea(BigDecimal lcrIdLinea) {
        this.lcrIdLinea = lcrIdLinea;
    }

    public BigDecimal getLcrIdLinea() {
        return this.lcrIdLinea;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLcrScta(BigDecimal lcrScta) {
        this.lcrScta = lcrScta;
    }

    public BigDecimal getLcrScta() {
        return this.lcrScta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLcrTipoCredito(BigDecimal lcrTipoCredito) {
        this.lcrTipoCredito = lcrTipoCredito;
    }

    public BigDecimal getLcrTipoCredito() {
        return this.lcrTipoCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLcrInstitucion(BigDecimal lcrInstitucion) {
        this.lcrInstitucion = lcrInstitucion;
    }

    public BigDecimal getLcrInstitucion() {
        return this.lcrInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setLcrImpCredito(BigDecimal lcrImpCredito) {
        this.lcrImpCredito = lcrImpCredito;
    }

    public BigDecimal getLcrImpCredito() {
        return this.lcrImpCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLcrNumDispo(BigDecimal lcrNumDispo) {
        this.lcrNumDispo = lcrNumDispo;
    }

    public BigDecimal getLcrNumDispo() {
        return this.lcrNumDispo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setLcrImpDispo(BigDecimal lcrImpDispo) {
        this.lcrImpDispo = lcrImpDispo;
    }

    public BigDecimal getLcrImpDispo() {
        return this.lcrImpDispo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setLcrTasa(BigDecimal lcrTasa) {
        this.lcrTasa = lcrTasa;
    }

    public BigDecimal getLcrTasa() {
        return this.lcrTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLcrPlazo(BigDecimal lcrPlazo) {
        this.lcrPlazo = lcrPlazo;
    }

    public BigDecimal getLcrPlazo() {
        return this.lcrPlazo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setLcrFechaApertura(String lcrFechaApertura) {
        this.lcrFechaApertura = lcrFechaApertura;
    }

    public String getLcrFechaApertura() {
        return this.lcrFechaApertura;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setLcrFechaVencimiento(String lcrFechaVencimiento) {
        this.lcrFechaVencimiento = lcrFechaVencimiento;
    }

    public String getLcrFechaVencimiento() {
        return this.lcrFechaVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setLcrUltDispo(String lcrUltDispo) {
        this.lcrUltDispo = lcrUltDispo;
    }

    public String getLcrUltDispo() {
        return this.lcrUltDispo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLcrComentario(String lcrComentario) {
        this.lcrComentario = lcrComentario;
    }

    public String getLcrComentario() {
        return this.lcrComentario;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setLcrFecAlta(String lcrFecAlta) {
        this.lcrFecAlta = lcrFecAlta;
    }

    public String getLcrFecAlta() {
        return this.lcrFecAlta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLcrStatus(String lcrStatus) {
        this.lcrStatus = lcrStatus;
    }

    public String getLcrStatus() {
        return this.lcrStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_LINEAS_CREDITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getLcrIdFideicomiso() != null && this.getLcrIdFideicomiso().longValue() == -999) {
            conditions += " AND LCR_ID_FIDEICOMISO IS NULL";
        } else if (this.getLcrIdFideicomiso() != null) {
            conditions += " AND LCR_ID_FIDEICOMISO = ?";
            values.add(this.getLcrIdFideicomiso());
        }

        if (this.getLcrIdLinea() != null && this.getLcrIdLinea().longValue() == -999) {
            conditions += " AND LCR_ID_LINEA IS NULL";
        } else if (this.getLcrIdLinea() != null) {
            conditions += " AND LCR_ID_LINEA = ?";
            values.add(this.getLcrIdLinea());
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
        String sql = "SELECT * FROM F_LINEAS_CREDITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getLcrIdFideicomiso() != null && this.getLcrIdFideicomiso().longValue() == -999) {
            conditions += " AND LCR_ID_FIDEICOMISO IS NULL";
        } else if (this.getLcrIdFideicomiso() != null) {
            conditions += " AND LCR_ID_FIDEICOMISO = ?";
            values.add(this.getLcrIdFideicomiso());
        }

        if (this.getLcrIdLinea() != null && this.getLcrIdLinea().longValue() == -999) {
            conditions += " AND LCR_ID_LINEA IS NULL";
        } else if (this.getLcrIdLinea() != null) {
            conditions += " AND LCR_ID_LINEA = ?";
            values.add(this.getLcrIdLinea());
        }

        if (this.getLcrScta() != null && this.getLcrScta().longValue() == -999) {
            conditions += " AND LCR_SCTA IS NULL";
        } else if (this.getLcrScta() != null) {
            conditions += " AND LCR_SCTA = ?";
            values.add(this.getLcrScta());
        }

        if (this.getLcrTipoCredito() != null && this.getLcrTipoCredito().longValue() == -999) {
            conditions += " AND LCR_TIPO_CREDITO IS NULL";
        } else if (this.getLcrTipoCredito() != null) {
            conditions += " AND LCR_TIPO_CREDITO = ?";
            values.add(this.getLcrTipoCredito());
        }

        if (this.getLcrInstitucion() != null && this.getLcrInstitucion().longValue() == -999) {
            conditions += " AND LCR_INSTITUCION IS NULL";
        } else if (this.getLcrInstitucion() != null) {
            conditions += " AND LCR_INSTITUCION = ?";
            values.add(this.getLcrInstitucion());
        }

        if (this.getLcrImpCredito() != null && this.getLcrImpCredito().longValue() == -999) {
            conditions += " AND LCR_IMP_CREDITO IS NULL";
        } else if (this.getLcrImpCredito() != null) {
            conditions += " AND LCR_IMP_CREDITO = ?";
            values.add(this.getLcrImpCredito());
        }

        if (this.getLcrNumDispo() != null && this.getLcrNumDispo().longValue() == -999) {
            conditions += " AND LCR_NUM_DISPO IS NULL";
        } else if (this.getLcrNumDispo() != null) {
            conditions += " AND LCR_NUM_DISPO = ?";
            values.add(this.getLcrNumDispo());
        }

        if (this.getLcrImpDispo() != null && this.getLcrImpDispo().longValue() == -999) {
            conditions += " AND LCR_IMP_DISPO IS NULL";
        } else if (this.getLcrImpDispo() != null) {
            conditions += " AND LCR_IMP_DISPO = ?";
            values.add(this.getLcrImpDispo());
        }

        if (this.getLcrTasa() != null && this.getLcrTasa().longValue() == -999) {
            conditions += " AND LCR_TASA IS NULL";
        } else if (this.getLcrTasa() != null) {
            conditions += " AND LCR_TASA = ?";
            values.add(this.getLcrTasa());
        }

        if (this.getLcrPlazo() != null && this.getLcrPlazo().longValue() == -999) {
            conditions += " AND LCR_PLAZO IS NULL";
        } else if (this.getLcrPlazo() != null) {
            conditions += " AND LCR_PLAZO = ?";
            values.add(this.getLcrPlazo());
        }

        if (this.getLcrFechaApertura() != null && "null".equals(this.getLcrFechaApertura())) {
            conditions += " AND LCR_FECHA_APERTURA IS NULL";
        } else if (this.getLcrFechaApertura() != null) {
            conditions += " AND LCR_FECHA_APERTURA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getLcrFechaApertura());
        }

        if (this.getLcrFechaVencimiento() != null && "null".equals(this.getLcrFechaVencimiento())) {
            conditions += " AND LCR_FECHA_VENCIMIENTO IS NULL";
        } else if (this.getLcrFechaVencimiento() != null) {
            conditions += " AND LCR_FECHA_VENCIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getLcrFechaVencimiento());
        }

        if (this.getLcrUltDispo() != null && "null".equals(this.getLcrUltDispo())) {
            conditions += " AND LCR_ULT_DISPO IS NULL";
        } else if (this.getLcrUltDispo() != null) {
            conditions += " AND LCR_ULT_DISPO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getLcrUltDispo());
        }

        if (this.getLcrComentario() != null && "null".equals(this.getLcrComentario())) {
            conditions += " AND LCR_COMENTARIO IS NULL";
        } else if (this.getLcrComentario() != null) {
            conditions += " AND LCR_COMENTARIO = ?";
            values.add(this.getLcrComentario());
        }

        if (this.getLcrFecAlta() != null && "null".equals(this.getLcrFecAlta())) {
            conditions += " AND LCR_FEC_ALTA IS NULL";
        } else if (this.getLcrFecAlta() != null) {
            conditions += " AND LCR_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getLcrFecAlta());
        }

        if (this.getLcrStatus() != null && "null".equals(this.getLcrStatus())) {
            conditions += " AND LCR_STATUS IS NULL";
        } else if (this.getLcrStatus() != null) {
            conditions += " AND LCR_STATUS = ?";
            values.add(this.getLcrStatus());
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
        String sql = "UPDATE F_LINEAS_CREDITO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND LCR_ID_FIDEICOMISO = ?";
        pkValues.add(this.getLcrIdFideicomiso());
        conditions += " AND LCR_ID_LINEA = ?";
        pkValues.add(this.getLcrIdLinea());
        fields += " LCR_SCTA = ?, ";
        values.add(this.getLcrScta());
        fields += " LCR_TIPO_CREDITO = ?, ";
        values.add(this.getLcrTipoCredito());
        fields += " LCR_INSTITUCION = ?, ";
        values.add(this.getLcrInstitucion());
        fields += " LCR_IMP_CREDITO = ?, ";
        values.add(this.getLcrImpCredito());
        fields += " LCR_NUM_DISPO = ?, ";
        values.add(this.getLcrNumDispo());
        fields += " LCR_IMP_DISPO = ?, ";
        values.add(this.getLcrImpDispo());
        fields += " LCR_TASA = ?, ";
        values.add(this.getLcrTasa());
        fields += " LCR_PLAZO = ?, ";
        values.add(this.getLcrPlazo());
        fields += " LCR_FECHA_APERTURA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getLcrFechaApertura());
        fields += " LCR_FECHA_VENCIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getLcrFechaVencimiento());
        fields += " LCR_ULT_DISPO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getLcrUltDispo());
        fields += " LCR_COMENTARIO = ?, ";
        values.add(this.getLcrComentario());
        fields += " LCR_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getLcrFecAlta());
        fields += " LCR_STATUS = ?, ";
        values.add(this.getLcrStatus());
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
        String sql = "INSERT INTO F_LINEAS_CREDITO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", LCR_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getLcrIdFideicomiso());

        fields += ", LCR_ID_LINEA";
        fieldValues += ", ?";
        values.add(this.getLcrIdLinea());

        fields += ", LCR_SCTA";
        fieldValues += ", ?";
        values.add(this.getLcrScta());

        fields += ", LCR_TIPO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getLcrTipoCredito());

        fields += ", LCR_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getLcrInstitucion());

        fields += ", LCR_IMP_CREDITO";
        fieldValues += ", ?";
        values.add(this.getLcrImpCredito());

        fields += ", LCR_NUM_DISPO";
        fieldValues += ", ?";
        values.add(this.getLcrNumDispo());

        fields += ", LCR_IMP_DISPO";
        fieldValues += ", ?";
        values.add(this.getLcrImpDispo());

        fields += ", LCR_TASA";
        fieldValues += ", ?";
        values.add(this.getLcrTasa());

        fields += ", LCR_PLAZO";
        fieldValues += ", ?";
        values.add(this.getLcrPlazo());

        fields += ", LCR_FECHA_APERTURA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getLcrFechaApertura());

        fields += ", LCR_FECHA_VENCIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getLcrFechaVencimiento());

        fields += ", LCR_ULT_DISPO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getLcrUltDispo());

        fields += ", LCR_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getLcrComentario());

        fields += ", LCR_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getLcrFecAlta());

        fields += ", LCR_STATUS";
        fieldValues += ", ?";
        values.add(this.getLcrStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_LINEAS_CREDITO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND LCR_ID_FIDEICOMISO = ?";
        values.add(this.getLcrIdFideicomiso());
        conditions += " AND LCR_ID_LINEA = ?";
        values.add(this.getLcrIdLinea());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FLineasCredito instance = (FLineasCredito) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getLcrIdFideicomiso().equals(instance.getLcrIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getLcrIdLinea().equals(instance.getLcrIdLinea()))
            equalObjects = false;
        if (equalObjects && !this.getLcrScta().equals(instance.getLcrScta()))
            equalObjects = false;
        if (equalObjects && !this.getLcrTipoCredito().equals(instance.getLcrTipoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getLcrInstitucion().equals(instance.getLcrInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getLcrImpCredito().equals(instance.getLcrImpCredito()))
            equalObjects = false;
        if (equalObjects && !this.getLcrNumDispo().equals(instance.getLcrNumDispo()))
            equalObjects = false;
        if (equalObjects && !this.getLcrImpDispo().equals(instance.getLcrImpDispo()))
            equalObjects = false;
        if (equalObjects && !this.getLcrTasa().equals(instance.getLcrTasa()))
            equalObjects = false;
        if (equalObjects && !this.getLcrPlazo().equals(instance.getLcrPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getLcrFechaApertura().equals(instance.getLcrFechaApertura()))
            equalObjects = false;
        if (equalObjects && !this.getLcrFechaVencimiento().equals(instance.getLcrFechaVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getLcrUltDispo().equals(instance.getLcrUltDispo()))
            equalObjects = false;
        if (equalObjects && !this.getLcrComentario().equals(instance.getLcrComentario()))
            equalObjects = false;
        if (equalObjects && !this.getLcrFecAlta().equals(instance.getLcrFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getLcrStatus().equals(instance.getLcrStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FLineasCredito result = new FLineasCredito();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setLcrIdFideicomiso((BigDecimal) objectData.getData("LCR_ID_FIDEICOMISO"));
        result.setLcrIdLinea((BigDecimal) objectData.getData("LCR_ID_LINEA"));
        result.setLcrScta((BigDecimal) objectData.getData("LCR_SCTA"));
        result.setLcrTipoCredito((BigDecimal) objectData.getData("LCR_TIPO_CREDITO"));
        result.setLcrInstitucion((BigDecimal) objectData.getData("LCR_INSTITUCION"));
        result.setLcrImpCredito((BigDecimal) objectData.getData("LCR_IMP_CREDITO"));
        result.setLcrNumDispo((BigDecimal) objectData.getData("LCR_NUM_DISPO"));
        result.setLcrImpDispo((BigDecimal) objectData.getData("LCR_IMP_DISPO"));
        result.setLcrTasa((BigDecimal) objectData.getData("LCR_TASA"));
        result.setLcrPlazo((BigDecimal) objectData.getData("LCR_PLAZO"));
        result.setLcrFechaApertura((String) objectData.getData("LCR_FECHA_APERTURA"));
        result.setLcrFechaVencimiento((String) objectData.getData("LCR_FECHA_VENCIMIENTO"));
        result.setLcrUltDispo((String) objectData.getData("LCR_ULT_DISPO"));
        result.setLcrComentario((String) objectData.getData("LCR_COMENTARIO"));
        result.setLcrFecAlta((String) objectData.getData("LCR_FEC_ALTA"));
        result.setLcrStatus((String) objectData.getData("LCR_STATUS"));

        return result;

    }

}
