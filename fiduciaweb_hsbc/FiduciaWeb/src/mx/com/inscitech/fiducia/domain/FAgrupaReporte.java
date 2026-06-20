package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0016346", columns = { "FACO_ID_AGRUPACION", "FRCO_ID_REPORTE" }, sequences = { "MANUAL" })
public class FAgrupaReporte extends DomainObject {

    BigDecimal facoIdAgrupacion = null;
    BigDecimal frcoIdReporte = null;
    BigDecimal avrOrden = null;
    BigDecimal avrNumCol = null;

    public FAgrupaReporte() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacoIdAgrupacion(BigDecimal facoIdAgrupacion) {
        this.facoIdAgrupacion = facoIdAgrupacion;
    }

    public BigDecimal getFacoIdAgrupacion() {
        return this.facoIdAgrupacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrcoIdReporte(BigDecimal frcoIdReporte) {
        this.frcoIdReporte = frcoIdReporte;
    }

    public BigDecimal getFrcoIdReporte() {
        return this.frcoIdReporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvrOrden(BigDecimal avrOrden) {
        this.avrOrden = avrOrden;
    }

    public BigDecimal getAvrOrden() {
        return this.avrOrden;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setAvrNumCol(BigDecimal avrNumCol) {
        this.avrNumCol = avrNumCol;
    }

    public BigDecimal getAvrNumCol() {
        return this.avrNumCol;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_AGRUPA_REPORTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
        }

        if (this.getFrcoIdReporte() != null && this.getFrcoIdReporte().longValue() == -999) {
            conditions += " AND FRCO_ID_REPORTE IS NULL";
        } else if (this.getFrcoIdReporte() != null) {
            conditions += " AND FRCO_ID_REPORTE = ?";
            values.add(this.getFrcoIdReporte());
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
        String sql = "SELECT * FROM F_AGRUPA_REPORTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
        }

        if (this.getFrcoIdReporte() != null && this.getFrcoIdReporte().longValue() == -999) {
            conditions += " AND FRCO_ID_REPORTE IS NULL";
        } else if (this.getFrcoIdReporte() != null) {
            conditions += " AND FRCO_ID_REPORTE = ?";
            values.add(this.getFrcoIdReporte());
        }

        if (this.getAvrOrden() != null && this.getAvrOrden().longValue() == -999) {
            conditions += " AND AVR_ORDEN IS NULL";
        } else if (this.getAvrOrden() != null) {
            conditions += " AND AVR_ORDEN = ?";
            values.add(this.getAvrOrden());
        }

        if (this.getAvrNumCol() != null && this.getAvrNumCol().longValue() == -999) {
            conditions += " AND AVR_NUM_COL IS NULL";
        } else if (this.getAvrNumCol() != null) {
            conditions += " AND AVR_NUM_COL = ?";
            values.add(this.getAvrNumCol());
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
        String sql = "UPDATE F_AGRUPA_REPORTE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FACO_ID_AGRUPACION = ?";
        pkValues.add(this.getFacoIdAgrupacion());
        conditions += " AND FRCO_ID_REPORTE = ?";
        pkValues.add(this.getFrcoIdReporte());
        fields += " AVR_ORDEN = ?, ";
        values.add(this.getAvrOrden());
        fields += " AVR_NUM_COL = ?, ";
        values.add(this.getAvrNumCol());
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
        String sql = "INSERT INTO F_AGRUPA_REPORTE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FACO_ID_AGRUPACION";
        fieldValues += ", ?";
        values.add(this.getFacoIdAgrupacion());

        fields += ", FRCO_ID_REPORTE";
        fieldValues += ", ?";
        values.add(this.getFrcoIdReporte());

        fields += ", AVR_ORDEN";
        fieldValues += ", ?";
        values.add(this.getAvrOrden());

        fields += ", AVR_NUM_COL";
        fieldValues += ", ?";
        values.add(this.getAvrNumCol());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_AGRUPA_REPORTE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FACO_ID_AGRUPACION = ?";
        values.add(this.getFacoIdAgrupacion());
        conditions += " AND FRCO_ID_REPORTE = ?";
        values.add(this.getFrcoIdReporte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAgrupaReporte instance = (FAgrupaReporte) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFacoIdAgrupacion().equals(instance.getFacoIdAgrupacion()))
            equalObjects = false;
        if (equalObjects && !this.getFrcoIdReporte().equals(instance.getFrcoIdReporte()))
            equalObjects = false;
        if (equalObjects && !this.getAvrOrden().equals(instance.getAvrOrden()))
            equalObjects = false;
        if (equalObjects && !this.getAvrNumCol().equals(instance.getAvrNumCol()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAgrupaReporte result = new FAgrupaReporte();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFacoIdAgrupacion((BigDecimal) objectData.getData("FACO_ID_AGRUPACION"));
        result.setFrcoIdReporte((BigDecimal) objectData.getData("FRCO_ID_REPORTE"));
        result.setAvrOrden((BigDecimal) objectData.getData("AVR_ORDEN"));
        result.setAvrNumCol((BigDecimal) objectData.getData("AVR_NUM_COL"));

        return result;

    }

}
