package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FRepConcilia extends DomainObject {

    BigDecimal frcIdSecuencial = null;
    String frcFecha = null;
    BigDecimal frcFolioExt = null;
    BigDecimal frcCuentaExt = null;
    String frcTipoMovExt = null;
    BigDecimal frcImporteMovExt = null;
    String frcFoliosConcExt = null;
    String frcEstatusMovExt = null;
    BigDecimal frcFolioInt = null;
    BigDecimal frcCuentaInt = null;
    String frcTipoMovInt = null;
    BigDecimal frcImporteMovInt = null;
    String frcFoliosConcInt = null;
    String frcEstatusMovInt = null;

    public FRepConcilia() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrcIdSecuencial(BigDecimal frcIdSecuencial) {
        this.frcIdSecuencial = frcIdSecuencial;
    }

    public BigDecimal getFrcIdSecuencial() {
        return this.frcIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFrcFecha(String frcFecha) {
        this.frcFecha = frcFecha;
    }

    public String getFrcFecha() {
        return this.frcFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrcFolioExt(BigDecimal frcFolioExt) {
        this.frcFolioExt = frcFolioExt;
    }

    public BigDecimal getFrcFolioExt() {
        return this.frcFolioExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 0, javaClass = BigDecimal.class)
    public void setFrcCuentaExt(BigDecimal frcCuentaExt) {
        this.frcCuentaExt = frcCuentaExt;
    }

    public BigDecimal getFrcCuentaExt() {
        return this.frcCuentaExt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrcTipoMovExt(String frcTipoMovExt) {
        this.frcTipoMovExt = frcTipoMovExt;
    }

    public String getFrcTipoMovExt() {
        return this.frcTipoMovExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFrcImporteMovExt(BigDecimal frcImporteMovExt) {
        this.frcImporteMovExt = frcImporteMovExt;
    }

    public BigDecimal getFrcImporteMovExt() {
        return this.frcImporteMovExt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrcFoliosConcExt(String frcFoliosConcExt) {
        this.frcFoliosConcExt = frcFoliosConcExt;
    }

    public String getFrcFoliosConcExt() {
        return this.frcFoliosConcExt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrcEstatusMovExt(String frcEstatusMovExt) {
        this.frcEstatusMovExt = frcEstatusMovExt;
    }

    public String getFrcEstatusMovExt() {
        return this.frcEstatusMovExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrcFolioInt(BigDecimal frcFolioInt) {
        this.frcFolioInt = frcFolioInt;
    }

    public BigDecimal getFrcFolioInt() {
        return this.frcFolioInt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 0, javaClass = BigDecimal.class)
    public void setFrcCuentaInt(BigDecimal frcCuentaInt) {
        this.frcCuentaInt = frcCuentaInt;
    }

    public BigDecimal getFrcCuentaInt() {
        return this.frcCuentaInt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrcTipoMovInt(String frcTipoMovInt) {
        this.frcTipoMovInt = frcTipoMovInt;
    }

    public String getFrcTipoMovInt() {
        return this.frcTipoMovInt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFrcImporteMovInt(BigDecimal frcImporteMovInt) {
        this.frcImporteMovInt = frcImporteMovInt;
    }

    public BigDecimal getFrcImporteMovInt() {
        return this.frcImporteMovInt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrcFoliosConcInt(String frcFoliosConcInt) {
        this.frcFoliosConcInt = frcFoliosConcInt;
    }

    public String getFrcFoliosConcInt() {
        return this.frcFoliosConcInt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrcEstatusMovInt(String frcEstatusMovInt) {
        this.frcEstatusMovInt = frcEstatusMovInt;
    }

    public String getFrcEstatusMovInt() {
        return this.frcEstatusMovInt;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_CONCILIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_REP_CONCILIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrcIdSecuencial() != null && this.getFrcIdSecuencial().longValue() == -999) {
            conditions += " AND FRC_ID_SECUENCIAL IS NULL";
        } else if (this.getFrcIdSecuencial() != null) {
            conditions += " AND FRC_ID_SECUENCIAL = ?";
            values.add(this.getFrcIdSecuencial());
        }

        if (this.getFrcFecha() != null && "null".equals(this.getFrcFecha())) {
            conditions += " AND FRC_FECHA IS NULL";
        } else if (this.getFrcFecha() != null) {
            conditions += " AND FRC_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFrcFecha());
        }

        if (this.getFrcFolioExt() != null && this.getFrcFolioExt().longValue() == -999) {
            conditions += " AND FRC_FOLIO_EXT IS NULL";
        } else if (this.getFrcFolioExt() != null) {
            conditions += " AND FRC_FOLIO_EXT = ?";
            values.add(this.getFrcFolioExt());
        }

        if (this.getFrcCuentaExt() != null && this.getFrcCuentaExt().longValue() == -999) {
            conditions += " AND FRC_CUENTA_EXT IS NULL";
        } else if (this.getFrcCuentaExt() != null) {
            conditions += " AND FRC_CUENTA_EXT = ?";
            values.add(this.getFrcCuentaExt());
        }

        if (this.getFrcTipoMovExt() != null && "null".equals(this.getFrcTipoMovExt())) {
            conditions += " AND FRC_TIPO_MOV_EXT IS NULL";
        } else if (this.getFrcTipoMovExt() != null) {
            conditions += " AND FRC_TIPO_MOV_EXT = ?";
            values.add(this.getFrcTipoMovExt());
        }

        if (this.getFrcImporteMovExt() != null && this.getFrcImporteMovExt().longValue() == -999) {
            conditions += " AND FRC_IMPORTE_MOV_EXT IS NULL";
        } else if (this.getFrcImporteMovExt() != null) {
            conditions += " AND FRC_IMPORTE_MOV_EXT = ?";
            values.add(this.getFrcImporteMovExt());
        }

        if (this.getFrcFoliosConcExt() != null && "null".equals(this.getFrcFoliosConcExt())) {
            conditions += " AND FRC_FOLIOS_CONC_EXT IS NULL";
        } else if (this.getFrcFoliosConcExt() != null) {
            conditions += " AND FRC_FOLIOS_CONC_EXT = ?";
            values.add(this.getFrcFoliosConcExt());
        }

        if (this.getFrcEstatusMovExt() != null && "null".equals(this.getFrcEstatusMovExt())) {
            conditions += " AND FRC_ESTATUS_MOV_EXT IS NULL";
        } else if (this.getFrcEstatusMovExt() != null) {
            conditions += " AND FRC_ESTATUS_MOV_EXT = ?";
            values.add(this.getFrcEstatusMovExt());
        }

        if (this.getFrcFolioInt() != null && this.getFrcFolioInt().longValue() == -999) {
            conditions += " AND FRC_FOLIO_INT IS NULL";
        } else if (this.getFrcFolioInt() != null) {
            conditions += " AND FRC_FOLIO_INT = ?";
            values.add(this.getFrcFolioInt());
        }

        if (this.getFrcCuentaInt() != null && this.getFrcCuentaInt().longValue() == -999) {
            conditions += " AND FRC_CUENTA_INT IS NULL";
        } else if (this.getFrcCuentaInt() != null) {
            conditions += " AND FRC_CUENTA_INT = ?";
            values.add(this.getFrcCuentaInt());
        }

        if (this.getFrcTipoMovInt() != null && "null".equals(this.getFrcTipoMovInt())) {
            conditions += " AND FRC_TIPO_MOV_INT IS NULL";
        } else if (this.getFrcTipoMovInt() != null) {
            conditions += " AND FRC_TIPO_MOV_INT = ?";
            values.add(this.getFrcTipoMovInt());
        }

        if (this.getFrcImporteMovInt() != null && this.getFrcImporteMovInt().longValue() == -999) {
            conditions += " AND FRC_IMPORTE_MOV_INT IS NULL";
        } else if (this.getFrcImporteMovInt() != null) {
            conditions += " AND FRC_IMPORTE_MOV_INT = ?";
            values.add(this.getFrcImporteMovInt());
        }

        if (this.getFrcFoliosConcInt() != null && "null".equals(this.getFrcFoliosConcInt())) {
            conditions += " AND FRC_FOLIOS_CONC_INT IS NULL";
        } else if (this.getFrcFoliosConcInt() != null) {
            conditions += " AND FRC_FOLIOS_CONC_INT = ?";
            values.add(this.getFrcFoliosConcInt());
        }

        if (this.getFrcEstatusMovInt() != null && "null".equals(this.getFrcEstatusMovInt())) {
            conditions += " AND FRC_ESTATUS_MOV_INT IS NULL";
        } else if (this.getFrcEstatusMovInt() != null) {
            conditions += " AND FRC_ESTATUS_MOV_INT = ?";
            values.add(this.getFrcEstatusMovInt());
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
        String sql = "UPDATE F_REP_CONCILIA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FRC_ID_SECUENCIAL = ?, ";
        values.add(this.getFrcIdSecuencial());
        fields += " FRC_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFrcFecha());
        fields += " FRC_FOLIO_EXT = ?, ";
        values.add(this.getFrcFolioExt());
        fields += " FRC_CUENTA_EXT = ?, ";
        values.add(this.getFrcCuentaExt());
        fields += " FRC_TIPO_MOV_EXT = ?, ";
        values.add(this.getFrcTipoMovExt());
        fields += " FRC_IMPORTE_MOV_EXT = ?, ";
        values.add(this.getFrcImporteMovExt());
        fields += " FRC_FOLIOS_CONC_EXT = ?, ";
        values.add(this.getFrcFoliosConcExt());
        fields += " FRC_ESTATUS_MOV_EXT = ?, ";
        values.add(this.getFrcEstatusMovExt());
        fields += " FRC_FOLIO_INT = ?, ";
        values.add(this.getFrcFolioInt());
        fields += " FRC_CUENTA_INT = ?, ";
        values.add(this.getFrcCuentaInt());
        fields += " FRC_TIPO_MOV_INT = ?, ";
        values.add(this.getFrcTipoMovInt());
        fields += " FRC_IMPORTE_MOV_INT = ?, ";
        values.add(this.getFrcImporteMovInt());
        fields += " FRC_FOLIOS_CONC_INT = ?, ";
        values.add(this.getFrcFoliosConcInt());
        fields += " FRC_ESTATUS_MOV_INT = ?, ";
        values.add(this.getFrcEstatusMovInt());
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
        String sql = "INSERT INTO F_REP_CONCILIA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRC_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFrcIdSecuencial());

        fields += ", FRC_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFrcFecha());

        fields += ", FRC_FOLIO_EXT";
        fieldValues += ", ?";
        values.add(this.getFrcFolioExt());

        fields += ", FRC_CUENTA_EXT";
        fieldValues += ", ?";
        values.add(this.getFrcCuentaExt());

        fields += ", FRC_TIPO_MOV_EXT";
        fieldValues += ", ?";
        values.add(this.getFrcTipoMovExt());

        fields += ", FRC_IMPORTE_MOV_EXT";
        fieldValues += ", ?";
        values.add(this.getFrcImporteMovExt());

        fields += ", FRC_FOLIOS_CONC_EXT";
        fieldValues += ", ?";
        values.add(this.getFrcFoliosConcExt());

        fields += ", FRC_ESTATUS_MOV_EXT";
        fieldValues += ", ?";
        values.add(this.getFrcEstatusMovExt());

        fields += ", FRC_FOLIO_INT";
        fieldValues += ", ?";
        values.add(this.getFrcFolioInt());

        fields += ", FRC_CUENTA_INT";
        fieldValues += ", ?";
        values.add(this.getFrcCuentaInt());

        fields += ", FRC_TIPO_MOV_INT";
        fieldValues += ", ?";
        values.add(this.getFrcTipoMovInt());

        fields += ", FRC_IMPORTE_MOV_INT";
        fieldValues += ", ?";
        values.add(this.getFrcImporteMovInt());

        fields += ", FRC_FOLIOS_CONC_INT";
        fieldValues += ", ?";
        values.add(this.getFrcFoliosConcInt());

        fields += ", FRC_ESTATUS_MOV_INT";
        fieldValues += ", ?";
        values.add(this.getFrcEstatusMovInt());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REP_CONCILIA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepConcilia instance = (FRepConcilia) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrcIdSecuencial().equals(instance.getFrcIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFrcFecha().equals(instance.getFrcFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFrcFolioExt().equals(instance.getFrcFolioExt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcCuentaExt().equals(instance.getFrcCuentaExt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcTipoMovExt().equals(instance.getFrcTipoMovExt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcImporteMovExt().equals(instance.getFrcImporteMovExt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcFoliosConcExt().equals(instance.getFrcFoliosConcExt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcEstatusMovExt().equals(instance.getFrcEstatusMovExt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcFolioInt().equals(instance.getFrcFolioInt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcCuentaInt().equals(instance.getFrcCuentaInt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcTipoMovInt().equals(instance.getFrcTipoMovInt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcImporteMovInt().equals(instance.getFrcImporteMovInt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcFoliosConcInt().equals(instance.getFrcFoliosConcInt()))
            equalObjects = false;
        if (equalObjects && !this.getFrcEstatusMovInt().equals(instance.getFrcEstatusMovInt()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepConcilia result = new FRepConcilia();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFrcIdSecuencial((BigDecimal) objectData.getData("FRC_ID_SECUENCIAL"));
        result.setFrcFecha((String) objectData.getData("FRC_FECHA"));
        result.setFrcFolioExt((BigDecimal) objectData.getData("FRC_FOLIO_EXT"));
        result.setFrcCuentaExt((BigDecimal) objectData.getData("FRC_CUENTA_EXT"));
        result.setFrcTipoMovExt((String) objectData.getData("FRC_TIPO_MOV_EXT"));
        result.setFrcImporteMovExt((BigDecimal) objectData.getData("FRC_IMPORTE_MOV_EXT"));
        result.setFrcFoliosConcExt((String) objectData.getData("FRC_FOLIOS_CONC_EXT"));
        result.setFrcEstatusMovExt((String) objectData.getData("FRC_ESTATUS_MOV_EXT"));
        result.setFrcFolioInt((BigDecimal) objectData.getData("FRC_FOLIO_INT"));
        result.setFrcCuentaInt((BigDecimal) objectData.getData("FRC_CUENTA_INT"));
        result.setFrcTipoMovInt((String) objectData.getData("FRC_TIPO_MOV_INT"));
        result.setFrcImporteMovInt((BigDecimal) objectData.getData("FRC_IMPORTE_MOV_INT"));
        result.setFrcFoliosConcInt((String) objectData.getData("FRC_FOLIOS_CONC_INT"));
        result.setFrcEstatusMovInt((String) objectData.getData("FRC_ESTATUS_MOV_INT"));

        return result;

    }

}
