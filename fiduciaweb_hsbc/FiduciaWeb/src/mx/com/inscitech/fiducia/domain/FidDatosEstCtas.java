package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PK_FID_DATOS_EST_CTAS", columns = { "DAT_CONTRATO", "DAT_CLAVE" }, sequences = { "MANUAL" })
public class FidDatosEstCtas extends DomainObject {

    BigDecimal datContrato = null;
    BigDecimal datNivel = null;
    BigDecimal datId = null;
    BigDecimal datParentId = null;
    String datClave = null;
    String datDato = null;
    String datDescripcion = null;
    String datFecAlta = null;
    String datFecUltMod = null;
    String datEstatus = null;

    public FidDatosEstCtas() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDatContrato(BigDecimal datContrato) {
        this.datContrato = datContrato;
    }

    public BigDecimal getDatContrato() {
        return this.datContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDatNivel(BigDecimal datNivel) {
        this.datNivel = datNivel;
    }

    public BigDecimal getDatNivel() {
        return this.datNivel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 21, scale = 0, javaClass = BigDecimal.class)
    public void setDatId(BigDecimal datId) {
        this.datId = datId;
    }

    public BigDecimal getDatId() {
        return this.datId;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 21, scale = 0, javaClass = BigDecimal.class)
    public void setDatParentId(BigDecimal datParentId) {
        this.datParentId = datParentId;
    }

    public BigDecimal getDatParentId() {
        return this.datParentId;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDatClave(String datClave) {
        this.datClave = datClave;
    }

    public String getDatClave() {
        return this.datClave;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDatDato(String datDato) {
        this.datDato = datDato;
    }

    public String getDatDato() {
        return this.datDato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDatDescripcion(String datDescripcion) {
        this.datDescripcion = datDescripcion;
    }

    public String getDatDescripcion() {
        return this.datDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setDatFecAlta(String datFecAlta) {
        this.datFecAlta = datFecAlta;
    }

    public String getDatFecAlta() {
        return this.datFecAlta;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setDatFecUltMod(String datFecUltMod) {
        this.datFecUltMod = datFecUltMod;
    }

    public String getDatFecUltMod() {
        return this.datFecUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDatEstatus(String datEstatus) {
        this.datEstatus = datEstatus;
    }

    public String getDatEstatus() {
        return this.datEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_DATOS_EST_CTAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDatContrato() != null && this.getDatContrato().longValue() == -999) {
            conditions += " AND DAT_CONTRATO IS NULL";
        } else if (this.getDatContrato() != null) {
            conditions += " AND DAT_CONTRATO = ?";
            values.add(this.getDatContrato());
        }

        if (this.getDatClave() != null && "null".equals(this.getDatClave())) {
            conditions += " AND DAT_CLAVE IS NULL";
        } else if (this.getDatClave() != null) {
            conditions += " AND DAT_CLAVE = ?";
            values.add(this.getDatClave());
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
        String sql = "SELECT * FROM FID_DATOS_EST_CTAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDatContrato() != null && this.getDatContrato().longValue() == -999) {
            conditions += " AND DAT_CONTRATO IS NULL";
        } else if (this.getDatContrato() != null) {
            conditions += " AND DAT_CONTRATO = ?";
            values.add(this.getDatContrato());
        }

        if (this.getDatNivel() != null && this.getDatNivel().longValue() == -999) {
            conditions += " AND DAT_NIVEL IS NULL";
        } else if (this.getDatNivel() != null) {
            conditions += " AND DAT_NIVEL = ?";
            values.add(this.getDatNivel());
        }

        if (this.getDatId() != null && this.getDatId().longValue() == -999) {
            conditions += " AND DAT_ID IS NULL";
        } else if (this.getDatId() != null) {
            conditions += " AND DAT_ID = ?";
            values.add(this.getDatId());
        }

        if (this.getDatParentId() != null && this.getDatParentId().longValue() == -999) {
            conditions += " AND DAT_PARENT_ID IS NULL";
        } else if (this.getDatParentId() != null) {
            conditions += " AND DAT_PARENT_ID = ?";
            values.add(this.getDatParentId());
        }

        if (this.getDatClave() != null && "null".equals(this.getDatClave())) {
            conditions += " AND DAT_CLAVE IS NULL";
        } else if (this.getDatClave() != null) {
            conditions += " AND DAT_CLAVE = ?";
            values.add(this.getDatClave());
        }

        if (this.getDatDato() != null && "null".equals(this.getDatDato())) {
            conditions += " AND DAT_DATO IS NULL";
        } else if (this.getDatDato() != null) {
            conditions += " AND DAT_DATO = ?";
            values.add(this.getDatDato());
        }

        if (this.getDatDescripcion() != null && "null".equals(this.getDatDescripcion())) {
            conditions += " AND DAT_DESCRIPCION IS NULL";
        } else if (this.getDatDescripcion() != null) {
            conditions += " AND DAT_DESCRIPCION = ?";
            values.add(this.getDatDescripcion());
        }

        if (this.getDatFecAlta() != null && "null".equals(this.getDatFecAlta())) {
            conditions += " AND DAT_FEC_ALTA IS NULL";
        } else if (this.getDatFecAlta() != null) {
            conditions += " AND DAT_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDatFecAlta());
        }

        if (this.getDatFecUltMod() != null && "null".equals(this.getDatFecUltMod())) {
            conditions += " AND DAT_FEC_ULT_MOD IS NULL";
        } else if (this.getDatFecUltMod() != null) {
            conditions += " AND DAT_FEC_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDatFecUltMod());
        }

        if (this.getDatEstatus() != null && "null".equals(this.getDatEstatus())) {
            conditions += " AND DAT_ESTATUS IS NULL";
        } else if (this.getDatEstatus() != null) {
            conditions += " AND DAT_ESTATUS = ?";
            values.add(this.getDatEstatus());
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
        String sql = "UPDATE FID_DATOS_EST_CTAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DAT_CONTRATO = ?";
        pkValues.add(this.getDatContrato());
        fields += " DAT_NIVEL = ?, ";
        values.add(this.getDatNivel());
        fields += " DAT_ID = ?, ";
        values.add(this.getDatId());
        fields += " DAT_PARENT_ID = ?, ";
        values.add(this.getDatParentId());
        conditions += " AND DAT_CLAVE = ?";
        pkValues.add(this.getDatClave());
        fields += " DAT_DATO = ?, ";
        values.add(this.getDatDato());
        fields += " DAT_DESCRIPCION = ?, ";
        values.add(this.getDatDescripcion());
        fields += " DAT_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDatFecAlta());
        fields += " DAT_FEC_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDatFecUltMod());
        fields += " DAT_ESTATUS = ?, ";
        values.add(this.getDatEstatus());
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
        String sql = "INSERT INTO FID_DATOS_EST_CTAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DAT_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDatContrato());

        fields += ", DAT_NIVEL";
        fieldValues += ", ?";
        values.add(this.getDatNivel());

        fields += ", DAT_ID";
        fieldValues += ", ?";
        values.add(this.getDatId());

        fields += ", DAT_PARENT_ID";
        fieldValues += ", ?";
        values.add(this.getDatParentId());

        fields += ", DAT_CLAVE";
        fieldValues += ", ?";
        values.add(this.getDatClave());

        fields += ", DAT_DATO";
        fieldValues += ", ?";
        values.add(this.getDatDato());

        fields += ", DAT_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getDatDescripcion());

        fields += ", DAT_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDatFecAlta());

        fields += ", DAT_FEC_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDatFecUltMod());

        fields += ", DAT_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getDatEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_DATOS_EST_CTAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DAT_CONTRATO = ?";
        values.add(this.getDatContrato());
        conditions += " AND DAT_CLAVE = ?";
        values.add(this.getDatClave());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidDatosEstCtas instance = (FidDatosEstCtas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDatContrato().equals(instance.getDatContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDatNivel().equals(instance.getDatNivel()))
            equalObjects = false;
        if (equalObjects && !this.getDatId().equals(instance.getDatId()))
            equalObjects = false;
        if (equalObjects && !this.getDatParentId().equals(instance.getDatParentId()))
            equalObjects = false;
        if (equalObjects && !this.getDatClave().equals(instance.getDatClave()))
            equalObjects = false;
        if (equalObjects && !this.getDatDato().equals(instance.getDatDato()))
            equalObjects = false;
        if (equalObjects && !this.getDatDescripcion().equals(instance.getDatDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getDatFecAlta().equals(instance.getDatFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getDatFecUltMod().equals(instance.getDatFecUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDatEstatus().equals(instance.getDatEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidDatosEstCtas result = new FidDatosEstCtas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDatContrato((BigDecimal) objectData.getData("DAT_CONTRATO"));
        result.setDatNivel((BigDecimal) objectData.getData("DAT_NIVEL"));
        result.setDatId((BigDecimal) objectData.getData("DAT_ID"));
        result.setDatParentId((BigDecimal) objectData.getData("DAT_PARENT_ID"));
        result.setDatClave((String) objectData.getData("DAT_CLAVE"));
        result.setDatDato((String) objectData.getData("DAT_DATO"));
        result.setDatDescripcion((String) objectData.getData("DAT_DESCRIPCION"));
        result.setDatFecAlta((String) objectData.getData("DAT_FEC_ALTA"));
        result.setDatFecUltMod((String) objectData.getData("DAT_FEC_ULT_MOD"));
        result.setDatEstatus((String) objectData.getData("DAT_ESTATUS"));

        return result;

    }

}
