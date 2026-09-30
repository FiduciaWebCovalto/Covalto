package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INTREP_PK", columns = { "INT_PIZARRA", "INT_SERIE", "INT_CUPON", "INT_FECHA_LIQ" }, sequences = { "MANUAL" })
public class Intrep extends DomainObject {

    String intPizarra = null;
    String intSerie = null;
    BigDecimal intCupon = null;
    String intFechaLiq = null;
    BigDecimal intNumTitulos = null;
    BigDecimal intImporte = null;
    BigDecimal intImporteIsr = null;
    BigDecimal intNumContratos = null;
    BigDecimal intNumUsuario = null;

    public Intrep() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntPizarra(String intPizarra) {
        this.intPizarra = intPizarra;
    }

    public String getIntPizarra() {
        return this.intPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntSerie(String intSerie) {
        this.intSerie = intSerie;
    }

    public String getIntSerie() {
        return this.intSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntCupon(BigDecimal intCupon) {
        this.intCupon = intCupon;
    }

    public BigDecimal getIntCupon() {
        return this.intCupon;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntFechaLiq(String intFechaLiq) {
        this.intFechaLiq = intFechaLiq;
    }

    public String getIntFechaLiq() {
        return this.intFechaLiq;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setIntNumTitulos(BigDecimal intNumTitulos) {
        this.intNumTitulos = intNumTitulos;
    }

    public BigDecimal getIntNumTitulos() {
        return this.intNumTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setIntImporte(BigDecimal intImporte) {
        this.intImporte = intImporte;
    }

    public BigDecimal getIntImporte() {
        return this.intImporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setIntImporteIsr(BigDecimal intImporteIsr) {
        this.intImporteIsr = intImporteIsr;
    }

    public BigDecimal getIntImporteIsr() {
        return this.intImporteIsr;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntNumContratos(BigDecimal intNumContratos) {
        this.intNumContratos = intNumContratos;
    }

    public BigDecimal getIntNumContratos() {
        return this.intNumContratos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIntNumUsuario(BigDecimal intNumUsuario) {
        this.intNumUsuario = intNumUsuario;
    }

    public BigDecimal getIntNumUsuario() {
        return this.intNumUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INTREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIntPizarra() != null && "null".equals(this.getIntPizarra())) {
            conditions += " AND INT_PIZARRA IS NULL";
        } else if (this.getIntPizarra() != null) {
            conditions += " AND INT_PIZARRA = ?";
            values.add(this.getIntPizarra());
        }

        if (this.getIntSerie() != null && "null".equals(this.getIntSerie())) {
            conditions += " AND INT_SERIE IS NULL";
        } else if (this.getIntSerie() != null) {
            conditions += " AND INT_SERIE = ?";
            values.add(this.getIntSerie());
        }

        if (this.getIntCupon() != null && this.getIntCupon().longValue() == -999) {
            conditions += " AND INT_CUPON IS NULL";
        } else if (this.getIntCupon() != null) {
            conditions += " AND INT_CUPON = ?";
            values.add(this.getIntCupon());
        }

        if (this.getIntFechaLiq() != null && "null".equals(this.getIntFechaLiq())) {
            conditions += " AND INT_FECHA_LIQ IS NULL";
        } else if (this.getIntFechaLiq() != null) {
            conditions += " AND INT_FECHA_LIQ = ?";
            values.add(this.getIntFechaLiq());
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
        String sql = "SELECT * FROM INTREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIntPizarra() != null && "null".equals(this.getIntPizarra())) {
            conditions += " AND INT_PIZARRA IS NULL";
        } else if (this.getIntPizarra() != null) {
            conditions += " AND INT_PIZARRA = ?";
            values.add(this.getIntPizarra());
        }

        if (this.getIntSerie() != null && "null".equals(this.getIntSerie())) {
            conditions += " AND INT_SERIE IS NULL";
        } else if (this.getIntSerie() != null) {
            conditions += " AND INT_SERIE = ?";
            values.add(this.getIntSerie());
        }

        if (this.getIntCupon() != null && this.getIntCupon().longValue() == -999) {
            conditions += " AND INT_CUPON IS NULL";
        } else if (this.getIntCupon() != null) {
            conditions += " AND INT_CUPON = ?";
            values.add(this.getIntCupon());
        }

        if (this.getIntFechaLiq() != null && "null".equals(this.getIntFechaLiq())) {
            conditions += " AND INT_FECHA_LIQ IS NULL";
        } else if (this.getIntFechaLiq() != null) {
            conditions += " AND INT_FECHA_LIQ = ?";
            values.add(this.getIntFechaLiq());
        }

        if (this.getIntNumTitulos() != null && this.getIntNumTitulos().longValue() == -999) {
            conditions += " AND INT_NUM_TITULOS IS NULL";
        } else if (this.getIntNumTitulos() != null) {
            conditions += " AND INT_NUM_TITULOS = ?";
            values.add(this.getIntNumTitulos());
        }

        if (this.getIntImporte() != null && this.getIntImporte().longValue() == -999) {
            conditions += " AND INT_IMPORTE IS NULL";
        } else if (this.getIntImporte() != null) {
            conditions += " AND INT_IMPORTE = ?";
            values.add(this.getIntImporte());
        }

        if (this.getIntImporteIsr() != null && this.getIntImporteIsr().longValue() == -999) {
            conditions += " AND INT_IMPORTE_ISR IS NULL";
        } else if (this.getIntImporteIsr() != null) {
            conditions += " AND INT_IMPORTE_ISR = ?";
            values.add(this.getIntImporteIsr());
        }

        if (this.getIntNumContratos() != null && this.getIntNumContratos().longValue() == -999) {
            conditions += " AND INT_NUM_CONTRATOS IS NULL";
        } else if (this.getIntNumContratos() != null) {
            conditions += " AND INT_NUM_CONTRATOS = ?";
            values.add(this.getIntNumContratos());
        }

        if (this.getIntNumUsuario() != null && this.getIntNumUsuario().longValue() == -999) {
            conditions += " AND INT_NUM_USUARIO IS NULL";
        } else if (this.getIntNumUsuario() != null) {
            conditions += " AND INT_NUM_USUARIO = ?";
            values.add(this.getIntNumUsuario());
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
        String sql = "UPDATE INTREP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND INT_PIZARRA = ?";
        pkValues.add(this.getIntPizarra());
        conditions += " AND INT_SERIE = ?";
        pkValues.add(this.getIntSerie());
        conditions += " AND INT_CUPON = ?";
        pkValues.add(this.getIntCupon());
        conditions += " AND INT_FECHA_LIQ = ?";
        pkValues.add(this.getIntFechaLiq());
        fields += " INT_NUM_TITULOS = ?, ";
        values.add(this.getIntNumTitulos());
        fields += " INT_IMPORTE = ?, ";
        values.add(this.getIntImporte());
        fields += " INT_IMPORTE_ISR = ?, ";
        values.add(this.getIntImporteIsr());
        fields += " INT_NUM_CONTRATOS = ?, ";
        values.add(this.getIntNumContratos());
        fields += " INT_NUM_USUARIO = ?, ";
        values.add(this.getIntNumUsuario());
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
        String sql = "INSERT INTO INTREP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", INT_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getIntPizarra());

        fields += ", INT_SERIE";
        fieldValues += ", ?";
        values.add(this.getIntSerie());

        fields += ", INT_CUPON";
        fieldValues += ", ?";
        values.add(this.getIntCupon());

        fields += ", INT_FECHA_LIQ";
        fieldValues += ", ?";
        values.add(this.getIntFechaLiq());

        fields += ", INT_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getIntNumTitulos());

        fields += ", INT_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getIntImporte());

        fields += ", INT_IMPORTE_ISR";
        fieldValues += ", ?";
        values.add(this.getIntImporteIsr());

        fields += ", INT_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getIntNumContratos());

        fields += ", INT_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getIntNumUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INTREP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND INT_PIZARRA = ?";
        values.add(this.getIntPizarra());
        conditions += " AND INT_SERIE = ?";
        values.add(this.getIntSerie());
        conditions += " AND INT_CUPON = ?";
        values.add(this.getIntCupon());
        conditions += " AND INT_FECHA_LIQ = ?";
        values.add(this.getIntFechaLiq());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Intrep instance = (Intrep) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIntPizarra().equals(instance.getIntPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getIntSerie().equals(instance.getIntSerie()))
            equalObjects = false;
        if (equalObjects && !this.getIntCupon().equals(instance.getIntCupon()))
            equalObjects = false;
        if (equalObjects && !this.getIntFechaLiq().equals(instance.getIntFechaLiq()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumTitulos().equals(instance.getIntNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getIntImporte().equals(instance.getIntImporte()))
            equalObjects = false;
        if (equalObjects && !this.getIntImporteIsr().equals(instance.getIntImporteIsr()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumContratos().equals(instance.getIntNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getIntNumUsuario().equals(instance.getIntNumUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Intrep result = new Intrep();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIntPizarra((String) objectData.getData("INT_PIZARRA"));
        result.setIntSerie((String) objectData.getData("INT_SERIE"));
        result.setIntCupon((BigDecimal) objectData.getData("INT_CUPON"));
        result.setIntFechaLiq((String) objectData.getData("INT_FECHA_LIQ"));
        result.setIntNumTitulos((BigDecimal) objectData.getData("INT_NUM_TITULOS"));
        result.setIntImporte((BigDecimal) objectData.getData("INT_IMPORTE"));
        result.setIntImporteIsr((BigDecimal) objectData.getData("INT_IMPORTE_ISR"));
        result.setIntNumContratos((BigDecimal) objectData.getData("INT_NUM_CONTRATOS"));
        result.setIntNumUsuario((BigDecimal) objectData.getData("INT_NUM_USUARIO"));

        return result;

    }

}
