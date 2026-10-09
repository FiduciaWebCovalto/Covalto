package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INVER_PLAZO_PK", columns = { "IVP_FECHA", "IVP_TIPO", "IVP_NOM_ARCHIVO", "IVP_NUM_CONTRATO", "IVP_NUM_INVERS" }, sequences = { "MANUAL" })
public class InverPlazo extends DomainObject {

    String ivpFecha = null;
    String ivpTipo = null;
    String ivpNomArchivo = null;
    BigDecimal ivpNumContrato = null;
    BigDecimal ivpNumInvers = null;
    String ivpNomInvers = null;
    BigDecimal ivpImporte = null;
    BigDecimal ivpInverExis = null;

    public InverPlazo() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setIvpFecha(String ivpFecha) {
        this.ivpFecha = ivpFecha;
    }

    public String getIvpFecha() {
        return this.ivpFecha;
    }

    @FieldInfo(nullable = false, dataType = "CHAR", javaClass = String.class)
    public void setIvpTipo(String ivpTipo) {
        this.ivpTipo = ivpTipo;
    }

    public String getIvpTipo() {
        return this.ivpTipo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIvpNomArchivo(String ivpNomArchivo) {
        this.ivpNomArchivo = ivpNomArchivo;
    }

    public String getIvpNomArchivo() {
        return this.ivpNomArchivo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIvpNumContrato(BigDecimal ivpNumContrato) {
        this.ivpNumContrato = ivpNumContrato;
    }

    public BigDecimal getIvpNumContrato() {
        return this.ivpNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 30, scale = 0, javaClass = BigDecimal.class)
    public void setIvpNumInvers(BigDecimal ivpNumInvers) {
        this.ivpNumInvers = ivpNumInvers;
    }

    public BigDecimal getIvpNumInvers() {
        return this.ivpNumInvers;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIvpNomInvers(String ivpNomInvers) {
        this.ivpNomInvers = ivpNomInvers;
    }

    public String getIvpNomInvers() {
        return this.ivpNomInvers;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setIvpImporte(BigDecimal ivpImporte) {
        this.ivpImporte = ivpImporte;
    }

    public BigDecimal getIvpImporte() {
        return this.ivpImporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setIvpInverExis(BigDecimal ivpInverExis) {
        this.ivpInverExis = ivpInverExis;
    }

    public BigDecimal getIvpInverExis() {
        return this.ivpInverExis;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INVER_PLAZO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIvpFecha() != null && "null".equals(this.getIvpFecha())) {
            conditions += " AND IVP_FECHA IS NULL";
        } else if (this.getIvpFecha() != null) {
            conditions += " AND IVP_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getIvpFecha());
        }

        if (this.getIvpTipo() != null && "null".equals(this.getIvpTipo())) {
            conditions += " AND IVP_TIPO IS NULL";
        } else if (this.getIvpTipo() != null) {
            conditions += " AND IVP_TIPO = ?";
            values.add(this.getIvpTipo());
        }

        if (this.getIvpNomArchivo() != null && "null".equals(this.getIvpNomArchivo())) {
            conditions += " AND IVP_NOM_ARCHIVO IS NULL";
        } else if (this.getIvpNomArchivo() != null) {
            conditions += " AND IVP_NOM_ARCHIVO = ?";
            values.add(this.getIvpNomArchivo());
        }

        if (this.getIvpNumContrato() != null && this.getIvpNumContrato().longValue() == -999) {
            conditions += " AND IVP_NUM_CONTRATO IS NULL";
        } else if (this.getIvpNumContrato() != null) {
            conditions += " AND IVP_NUM_CONTRATO = ?";
            values.add(this.getIvpNumContrato());
        }

        if (this.getIvpNumInvers() != null && this.getIvpNumInvers().longValue() == -999) {
            conditions += " AND IVP_NUM_INVERS IS NULL";
        } else if (this.getIvpNumInvers() != null) {
            conditions += " AND IVP_NUM_INVERS = ?";
            values.add(this.getIvpNumInvers());
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
        String sql = "SELECT * FROM INVER_PLAZO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIvpFecha() != null && "null".equals(this.getIvpFecha())) {
            conditions += " AND IVP_FECHA IS NULL";
        } else if (this.getIvpFecha() != null) {
            conditions += " AND IVP_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getIvpFecha());
        }

        if (this.getIvpTipo() != null && "null".equals(this.getIvpTipo())) {
            conditions += " AND IVP_TIPO IS NULL";
        } else if (this.getIvpTipo() != null) {
            conditions += " AND IVP_TIPO = ?";
            values.add(this.getIvpTipo());
        }

        if (this.getIvpNomArchivo() != null && "null".equals(this.getIvpNomArchivo())) {
            conditions += " AND IVP_NOM_ARCHIVO IS NULL";
        } else if (this.getIvpNomArchivo() != null) {
            conditions += " AND IVP_NOM_ARCHIVO = ?";
            values.add(this.getIvpNomArchivo());
        }

        if (this.getIvpNumContrato() != null && this.getIvpNumContrato().longValue() == -999) {
            conditions += " AND IVP_NUM_CONTRATO IS NULL";
        } else if (this.getIvpNumContrato() != null) {
            conditions += " AND IVP_NUM_CONTRATO = ?";
            values.add(this.getIvpNumContrato());
        }

        if (this.getIvpNumInvers() != null && this.getIvpNumInvers().longValue() == -999) {
            conditions += " AND IVP_NUM_INVERS IS NULL";
        } else if (this.getIvpNumInvers() != null) {
            conditions += " AND IVP_NUM_INVERS = ?";
            values.add(this.getIvpNumInvers());
        }

        if (this.getIvpNomInvers() != null && "null".equals(this.getIvpNomInvers())) {
            conditions += " AND IVP_NOM_INVERS IS NULL";
        } else if (this.getIvpNomInvers() != null) {
            conditions += " AND IVP_NOM_INVERS = ?";
            values.add(this.getIvpNomInvers());
        }

        if (this.getIvpImporte() != null && this.getIvpImporte().longValue() == -999) {
            conditions += " AND IVP_IMPORTE IS NULL";
        } else if (this.getIvpImporte() != null) {
            conditions += " AND IVP_IMPORTE = ?";
            values.add(this.getIvpImporte());
        }

        if (this.getIvpInverExis() != null && this.getIvpInverExis().longValue() == -999) {
            conditions += " AND IVP_INVER_EXIS IS NULL";
        } else if (this.getIvpInverExis() != null) {
            conditions += " AND IVP_INVER_EXIS = ?";
            values.add(this.getIvpInverExis());
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
        String sql = "UPDATE INVER_PLAZO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND IVP_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getIvpFecha());
        conditions += " AND IVP_TIPO = ?";
        pkValues.add(this.getIvpTipo());
        conditions += " AND IVP_NOM_ARCHIVO = ?";
        pkValues.add(this.getIvpNomArchivo());
        conditions += " AND IVP_NUM_CONTRATO = ?";
        pkValues.add(this.getIvpNumContrato());
        conditions += " AND IVP_NUM_INVERS = ?";
        pkValues.add(this.getIvpNumInvers());
        fields += " IVP_NOM_INVERS = ?, ";
        values.add(this.getIvpNomInvers());
        fields += " IVP_IMPORTE = ?, ";
        values.add(this.getIvpImporte());
        fields += " IVP_INVER_EXIS = ?, ";
        values.add(this.getIvpInverExis());
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
        String sql = "INSERT INTO INVER_PLAZO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", IVP_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getIvpFecha());

        fields += ", IVP_TIPO";
        fieldValues += ", ?";
        values.add(this.getIvpTipo());

        fields += ", IVP_NOM_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getIvpNomArchivo());

        fields += ", IVP_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getIvpNumContrato());

        fields += ", IVP_NUM_INVERS";
        fieldValues += ", ?";
        values.add(this.getIvpNumInvers());

        fields += ", IVP_NOM_INVERS";
        fieldValues += ", ?";
        values.add(this.getIvpNomInvers());

        fields += ", IVP_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getIvpImporte());

        fields += ", IVP_INVER_EXIS";
        fieldValues += ", ?";
        values.add(this.getIvpInverExis());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INVER_PLAZO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND IVP_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getIvpFecha());
        conditions += " AND IVP_TIPO = ?";
        values.add(this.getIvpTipo());
        conditions += " AND IVP_NOM_ARCHIVO = ?";
        values.add(this.getIvpNomArchivo());
        conditions += " AND IVP_NUM_CONTRATO = ?";
        values.add(this.getIvpNumContrato());
        conditions += " AND IVP_NUM_INVERS = ?";
        values.add(this.getIvpNumInvers());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        InverPlazo instance = (InverPlazo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIvpFecha().equals(instance.getIvpFecha()))
            equalObjects = false;
        if (equalObjects && !this.getIvpTipo().equals(instance.getIvpTipo()))
            equalObjects = false;
        if (equalObjects && !this.getIvpNomArchivo().equals(instance.getIvpNomArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getIvpNumContrato().equals(instance.getIvpNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getIvpNumInvers().equals(instance.getIvpNumInvers()))
            equalObjects = false;
        if (equalObjects && !this.getIvpNomInvers().equals(instance.getIvpNomInvers()))
            equalObjects = false;
        if (equalObjects && !this.getIvpImporte().equals(instance.getIvpImporte()))
            equalObjects = false;
        if (equalObjects && !this.getIvpInverExis().equals(instance.getIvpInverExis()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        InverPlazo result = new InverPlazo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIvpFecha((String) objectData.getData("IVP_FECHA"));
        result.setIvpTipo((String) objectData.getData("IVP_TIPO"));
        result.setIvpNomArchivo((String) objectData.getData("IVP_NOM_ARCHIVO"));
        result.setIvpNumContrato((BigDecimal) objectData.getData("IVP_NUM_CONTRATO"));
        result.setIvpNumInvers((BigDecimal) objectData.getData("IVP_NUM_INVERS"));
        result.setIvpNomInvers((String) objectData.getData("IVP_NOM_INVERS"));
        result.setIvpImporte((BigDecimal) objectData.getData("IVP_IMPORTE"));
        result.setIvpInverExis((BigDecimal) objectData.getData("IVP_INVER_EXIS"));

        return result;

    }

}
