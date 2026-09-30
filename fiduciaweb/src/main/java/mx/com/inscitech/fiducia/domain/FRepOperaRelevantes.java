package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REP_OPERA_RELEVANTES_PK", columns = { "FRO_ID_FOLIO" }, sequences = { "MAX" })
public class FRepOperaRelevantes extends DomainObject {

    BigDecimal froIdFolio = null;
    BigDecimal froFideicomiso = null;
    BigDecimal froSubcuenta = null;
    BigDecimal froCtaChques = null;
    BigDecimal froImporte = null;
    String froFecha = null;
    BigDecimal froNumMoneda = null;
    String froDescripcion = null;
    String froStatus = null;
    String froNombreReporte = null;
    String froRegistroReporte = null;

    public FRepOperaRelevantes() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFroIdFolio(BigDecimal froIdFolio) {
        this.froIdFolio = froIdFolio;
    }

    public BigDecimal getFroIdFolio() {
        return this.froIdFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFroFideicomiso(BigDecimal froFideicomiso) {
        this.froFideicomiso = froFideicomiso;
    }

    public BigDecimal getFroFideicomiso() {
        return this.froFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setFroSubcuenta(BigDecimal froSubcuenta) {
        this.froSubcuenta = froSubcuenta;
    }

    public BigDecimal getFroSubcuenta() {
        return this.froSubcuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setFroCtaChques(BigDecimal froCtaChques) {
        this.froCtaChques = froCtaChques;
    }

    public BigDecimal getFroCtaChques() {
        return this.froCtaChques;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFroImporte(BigDecimal froImporte) {
        this.froImporte = froImporte;
    }

    public BigDecimal getFroImporte() {
        return this.froImporte;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFroFecha(String froFecha) {
        this.froFecha = froFecha;
    }

    public String getFroFecha() {
        return this.froFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setFroNumMoneda(BigDecimal froNumMoneda) {
        this.froNumMoneda = froNumMoneda;
    }

    public BigDecimal getFroNumMoneda() {
        return this.froNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFroDescripcion(String froDescripcion) {
        this.froDescripcion = froDescripcion;
    }

    public String getFroDescripcion() {
        return this.froDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFroStatus(String froStatus) {
        this.froStatus = froStatus;
    }

    public String getFroStatus() {
        return this.froStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFroNombreReporte(String froNombreReporte) {
        this.froNombreReporte = froNombreReporte;
    }

    public String getFroNombreReporte() {
        return this.froNombreReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFroRegistroReporte(String froRegistroReporte) {
        this.froRegistroReporte = froRegistroReporte;
    }

    public String getFroRegistroReporte() {
        return this.froRegistroReporte;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_OPERA_RELEVANTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFroIdFolio() != null && this.getFroIdFolio().longValue() == -999) {
            conditions += " AND FRO_ID_FOLIO IS NULL";
        } else if (this.getFroIdFolio() != null) {
            conditions += " AND FRO_ID_FOLIO = ?";
            values.add(this.getFroIdFolio());
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
        String sql = "SELECT * FROM F_REP_OPERA_RELEVANTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFroIdFolio() != null && this.getFroIdFolio().longValue() == -999) {
            conditions += " AND FRO_ID_FOLIO IS NULL";
        } else if (this.getFroIdFolio() != null) {
            conditions += " AND FRO_ID_FOLIO = ?";
            values.add(this.getFroIdFolio());
        }

        if (this.getFroFideicomiso() != null && this.getFroFideicomiso().longValue() == -999) {
            conditions += " AND FRO_FIDEICOMISO IS NULL";
        } else if (this.getFroFideicomiso() != null) {
            conditions += " AND FRO_FIDEICOMISO = ?";
            values.add(this.getFroFideicomiso());
        }

        if (this.getFroSubcuenta() != null && this.getFroSubcuenta().longValue() == -999) {
            conditions += " AND FRO_SUBCUENTA IS NULL";
        } else if (this.getFroSubcuenta() != null) {
            conditions += " AND FRO_SUBCUENTA = ?";
            values.add(this.getFroSubcuenta());
        }

        if (this.getFroCtaChques() != null && this.getFroCtaChques().longValue() == -999) {
            conditions += " AND FRO_CTA_CHQUES IS NULL";
        } else if (this.getFroCtaChques() != null) {
            conditions += " AND FRO_CTA_CHQUES = ?";
            values.add(this.getFroCtaChques());
        }

        if (this.getFroImporte() != null && this.getFroImporte().longValue() == -999) {
            conditions += " AND FRO_IMPORTE IS NULL";
        } else if (this.getFroImporte() != null) {
            conditions += " AND FRO_IMPORTE = ?";
            values.add(this.getFroImporte());
        }

        if (this.getFroFecha() != null && "null".equals(this.getFroFecha())) {
            conditions += " AND FRO_FECHA IS NULL";
        } else if (this.getFroFecha() != null) {
            conditions += " AND FRO_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFroFecha());
        }

        if (this.getFroNumMoneda() != null && this.getFroNumMoneda().longValue() == -999) {
            conditions += " AND FRO_NUM_MONEDA IS NULL";
        } else if (this.getFroNumMoneda() != null) {
            conditions += " AND FRO_NUM_MONEDA = ?";
            values.add(this.getFroNumMoneda());
        }

        if (this.getFroDescripcion() != null && "null".equals(this.getFroDescripcion())) {
            conditions += " AND FRO_DESCRIPCION IS NULL";
        } else if (this.getFroDescripcion() != null) {
            conditions += " AND FRO_DESCRIPCION = ?";
            values.add(this.getFroDescripcion());
        }

        if (this.getFroStatus() != null && "null".equals(this.getFroStatus())) {
            conditions += " AND FRO_STATUS IS NULL";
        } else if (this.getFroStatus() != null) {
            conditions += " AND FRO_STATUS = ?";
            values.add(this.getFroStatus());
        }

        if (this.getFroNombreReporte() != null && "null".equals(this.getFroNombreReporte())) {
            conditions += " AND FRO_NOMBRE_REPORTE IS NULL";
        } else if (this.getFroNombreReporte() != null) {
            conditions += " AND FRO_NOMBRE_REPORTE = ?";
            values.add(this.getFroNombreReporte());
        }

        if (this.getFroRegistroReporte() != null && "null".equals(this.getFroRegistroReporte())) {
            conditions += " AND FRO_REGISTRO_REPORTE IS NULL";
        } else if (this.getFroRegistroReporte() != null) {
            conditions += " AND FRO_REGISTRO_REPORTE = ?";
            values.add(this.getFroRegistroReporte());
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
        String sql = "UPDATE F_REP_OPERA_RELEVANTES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FRO_ID_FOLIO = ?";
        pkValues.add(this.getFroIdFolio());
        fields += " FRO_FIDEICOMISO = ?, ";
        values.add(this.getFroFideicomiso());
        fields += " FRO_SUBCUENTA = ?, ";
        values.add(this.getFroSubcuenta());
        fields += " FRO_CTA_CHQUES = ?, ";
        values.add(this.getFroCtaChques());
        fields += " FRO_IMPORTE = ?, ";
        values.add(this.getFroImporte());
        fields += " FRO_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFroFecha());
        fields += " FRO_NUM_MONEDA = ?, ";
        values.add(this.getFroNumMoneda());
        fields += " FRO_DESCRIPCION = ?, ";
        values.add(this.getFroDescripcion());
        fields += " FRO_STATUS = ?, ";
        values.add(this.getFroStatus());
        fields += " FRO_NOMBRE_REPORTE = ?, ";
        values.add(this.getFroNombreReporte());
        fields += " FRO_REGISTRO_REPORTE = ?, ";
        values.add(this.getFroRegistroReporte());
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
        String sql = "INSERT INTO F_REP_OPERA_RELEVANTES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRO_ID_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFroIdFolio());

        fields += ", FRO_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFroFideicomiso());

        fields += ", FRO_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFroSubcuenta());

        fields += ", FRO_CTA_CHQUES";
        fieldValues += ", ?";
        values.add(this.getFroCtaChques());

        fields += ", FRO_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFroImporte());

        fields += ", FRO_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFroFecha());

        fields += ", FRO_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFroNumMoneda());

        fields += ", FRO_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFroDescripcion());

        fields += ", FRO_STATUS";
        fieldValues += ", ?";
        values.add(this.getFroStatus());

        fields += ", FRO_NOMBRE_REPORTE";
        fieldValues += ", ?";
        values.add(this.getFroNombreReporte());

        fields += ", FRO_REGISTRO_REPORTE";
        fieldValues += ", ?";
        values.add(this.getFroRegistroReporte());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REP_OPERA_RELEVANTES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FRO_ID_FOLIO = ?";
        values.add(this.getFroIdFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepOperaRelevantes instance = (FRepOperaRelevantes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFroIdFolio().equals(instance.getFroIdFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFroFideicomiso().equals(instance.getFroFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFroSubcuenta().equals(instance.getFroSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFroCtaChques().equals(instance.getFroCtaChques()))
            equalObjects = false;
        if (equalObjects && !this.getFroImporte().equals(instance.getFroImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFroFecha().equals(instance.getFroFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFroNumMoneda().equals(instance.getFroNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFroDescripcion().equals(instance.getFroDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getFroStatus().equals(instance.getFroStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFroNombreReporte().equals(instance.getFroNombreReporte()))
            equalObjects = false;
        if (equalObjects && !this.getFroRegistroReporte().equals(instance.getFroRegistroReporte()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepOperaRelevantes result = new FRepOperaRelevantes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFroIdFolio((BigDecimal) objectData.getData("FRO_ID_FOLIO"));
        result.setFroFideicomiso((BigDecimal) objectData.getData("FRO_FIDEICOMISO"));
        result.setFroSubcuenta((BigDecimal) objectData.getData("FRO_SUBCUENTA"));
        result.setFroCtaChques((BigDecimal) objectData.getData("FRO_CTA_CHQUES"));
        result.setFroImporte((BigDecimal) objectData.getData("FRO_IMPORTE"));
        result.setFroFecha((String) objectData.getData("FRO_FECHA"));
        result.setFroNumMoneda((BigDecimal) objectData.getData("FRO_NUM_MONEDA"));
        result.setFroDescripcion((String) objectData.getData("FRO_DESCRIPCION"));
        result.setFroStatus((String) objectData.getData("FRO_STATUS"));
        result.setFroNombreReporte((String) objectData.getData("FRO_NOMBRE_REPORTE"));
        result.setFroRegistroReporte((String) objectData.getData("FRO_REGISTRO_REPORTE"));

        return result;

    }

}
