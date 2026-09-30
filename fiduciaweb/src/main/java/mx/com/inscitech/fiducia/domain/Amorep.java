package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AMOREP_PK", columns = { "AMO_PIZARRA", "AMO_SERIE", "AMO_CUPON" }, sequences = { "MANUAL" })
public class Amorep extends DomainObject {

    String amoPizarra = null;
    String amoSerie = null;
    BigDecimal amoCupon = null;
    String amoFechaInicio = null;
    String amoFechaVmto = null;
    BigDecimal amoNumTitulos = null;
    BigDecimal amoImporte = null;
    BigDecimal amoImporteIsr = null;
    BigDecimal amoNumContratos = null;
    BigDecimal amoNumUsuario = null;

    public Amorep() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmoPizarra(String amoPizarra) {
        this.amoPizarra = amoPizarra;
    }

    public String getAmoPizarra() {
        return this.amoPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmoSerie(String amoSerie) {
        this.amoSerie = amoSerie;
    }

    public String getAmoSerie() {
        return this.amoSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmoCupon(BigDecimal amoCupon) {
        this.amoCupon = amoCupon;
    }

    public BigDecimal getAmoCupon() {
        return this.amoCupon;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmoFechaInicio(String amoFechaInicio) {
        this.amoFechaInicio = amoFechaInicio;
    }

    public String getAmoFechaInicio() {
        return this.amoFechaInicio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAmoFechaVmto(String amoFechaVmto) {
        this.amoFechaVmto = amoFechaVmto;
    }

    public String getAmoFechaVmto() {
        return this.amoFechaVmto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmoNumTitulos(BigDecimal amoNumTitulos) {
        this.amoNumTitulos = amoNumTitulos;
    }

    public BigDecimal getAmoNumTitulos() {
        return this.amoNumTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAmoImporte(BigDecimal amoImporte) {
        this.amoImporte = amoImporte;
    }

    public BigDecimal getAmoImporte() {
        return this.amoImporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAmoImporteIsr(BigDecimal amoImporteIsr) {
        this.amoImporteIsr = amoImporteIsr;
    }

    public BigDecimal getAmoImporteIsr() {
        return this.amoImporteIsr;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmoNumContratos(BigDecimal amoNumContratos) {
        this.amoNumContratos = amoNumContratos;
    }

    public BigDecimal getAmoNumContratos() {
        return this.amoNumContratos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAmoNumUsuario(BigDecimal amoNumUsuario) {
        this.amoNumUsuario = amoNumUsuario;
    }

    public BigDecimal getAmoNumUsuario() {
        return this.amoNumUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AMOREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAmoPizarra() != null && "null".equals(this.getAmoPizarra())) {
            conditions += " AND AMO_PIZARRA IS NULL";
        } else if (this.getAmoPizarra() != null) {
            conditions += " AND AMO_PIZARRA = ?";
            values.add(this.getAmoPizarra());
        }

        if (this.getAmoSerie() != null && "null".equals(this.getAmoSerie())) {
            conditions += " AND AMO_SERIE IS NULL";
        } else if (this.getAmoSerie() != null) {
            conditions += " AND AMO_SERIE = ?";
            values.add(this.getAmoSerie());
        }

        if (this.getAmoCupon() != null && this.getAmoCupon().longValue() == -999) {
            conditions += " AND AMO_CUPON IS NULL";
        } else if (this.getAmoCupon() != null) {
            conditions += " AND AMO_CUPON = ?";
            values.add(this.getAmoCupon());
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
        String sql = "SELECT * FROM AMOREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAmoPizarra() != null && "null".equals(this.getAmoPizarra())) {
            conditions += " AND AMO_PIZARRA IS NULL";
        } else if (this.getAmoPizarra() != null) {
            conditions += " AND AMO_PIZARRA = ?";
            values.add(this.getAmoPizarra());
        }

        if (this.getAmoSerie() != null && "null".equals(this.getAmoSerie())) {
            conditions += " AND AMO_SERIE IS NULL";
        } else if (this.getAmoSerie() != null) {
            conditions += " AND AMO_SERIE = ?";
            values.add(this.getAmoSerie());
        }

        if (this.getAmoCupon() != null && this.getAmoCupon().longValue() == -999) {
            conditions += " AND AMO_CUPON IS NULL";
        } else if (this.getAmoCupon() != null) {
            conditions += " AND AMO_CUPON = ?";
            values.add(this.getAmoCupon());
        }

        if (this.getAmoFechaInicio() != null && "null".equals(this.getAmoFechaInicio())) {
            conditions += " AND AMO_FECHA_INICIO IS NULL";
        } else if (this.getAmoFechaInicio() != null) {
            conditions += " AND AMO_FECHA_INICIO = ?";
            values.add(this.getAmoFechaInicio());
        }

        if (this.getAmoFechaVmto() != null && "null".equals(this.getAmoFechaVmto())) {
            conditions += " AND AMO_FECHA_VMTO IS NULL";
        } else if (this.getAmoFechaVmto() != null) {
            conditions += " AND AMO_FECHA_VMTO = ?";
            values.add(this.getAmoFechaVmto());
        }

        if (this.getAmoNumTitulos() != null && this.getAmoNumTitulos().longValue() == -999) {
            conditions += " AND AMO_NUM_TITULOS IS NULL";
        } else if (this.getAmoNumTitulos() != null) {
            conditions += " AND AMO_NUM_TITULOS = ?";
            values.add(this.getAmoNumTitulos());
        }

        if (this.getAmoImporte() != null && this.getAmoImporte().longValue() == -999) {
            conditions += " AND AMO_IMPORTE IS NULL";
        } else if (this.getAmoImporte() != null) {
            conditions += " AND AMO_IMPORTE = ?";
            values.add(this.getAmoImporte());
        }

        if (this.getAmoImporteIsr() != null && this.getAmoImporteIsr().longValue() == -999) {
            conditions += " AND AMO_IMPORTE_ISR IS NULL";
        } else if (this.getAmoImporteIsr() != null) {
            conditions += " AND AMO_IMPORTE_ISR = ?";
            values.add(this.getAmoImporteIsr());
        }

        if (this.getAmoNumContratos() != null && this.getAmoNumContratos().longValue() == -999) {
            conditions += " AND AMO_NUM_CONTRATOS IS NULL";
        } else if (this.getAmoNumContratos() != null) {
            conditions += " AND AMO_NUM_CONTRATOS = ?";
            values.add(this.getAmoNumContratos());
        }

        if (this.getAmoNumUsuario() != null && this.getAmoNumUsuario().longValue() == -999) {
            conditions += " AND AMO_NUM_USUARIO IS NULL";
        } else if (this.getAmoNumUsuario() != null) {
            conditions += " AND AMO_NUM_USUARIO = ?";
            values.add(this.getAmoNumUsuario());
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
        String sql = "UPDATE AMOREP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AMO_PIZARRA = ?";
        pkValues.add(this.getAmoPizarra());
        conditions += " AND AMO_SERIE = ?";
        pkValues.add(this.getAmoSerie());
        conditions += " AND AMO_CUPON = ?";
        pkValues.add(this.getAmoCupon());
        fields += " AMO_FECHA_INICIO = ?, ";
        values.add(this.getAmoFechaInicio());
        fields += " AMO_FECHA_VMTO = ?, ";
        values.add(this.getAmoFechaVmto());
        fields += " AMO_NUM_TITULOS = ?, ";
        values.add(this.getAmoNumTitulos());
        fields += " AMO_IMPORTE = ?, ";
        values.add(this.getAmoImporte());
        fields += " AMO_IMPORTE_ISR = ?, ";
        values.add(this.getAmoImporteIsr());
        fields += " AMO_NUM_CONTRATOS = ?, ";
        values.add(this.getAmoNumContratos());
        fields += " AMO_NUM_USUARIO = ?, ";
        values.add(this.getAmoNumUsuario());
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
        String sql = "INSERT INTO AMOREP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AMO_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getAmoPizarra());

        fields += ", AMO_SERIE";
        fieldValues += ", ?";
        values.add(this.getAmoSerie());

        fields += ", AMO_CUPON";
        fieldValues += ", ?";
        values.add(this.getAmoCupon());

        fields += ", AMO_FECHA_INICIO";
        fieldValues += ", ?";
        values.add(this.getAmoFechaInicio());

        fields += ", AMO_FECHA_VMTO";
        fieldValues += ", ?";
        values.add(this.getAmoFechaVmto());

        fields += ", AMO_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getAmoNumTitulos());

        fields += ", AMO_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getAmoImporte());

        fields += ", AMO_IMPORTE_ISR";
        fieldValues += ", ?";
        values.add(this.getAmoImporteIsr());

        fields += ", AMO_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getAmoNumContratos());

        fields += ", AMO_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getAmoNumUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AMOREP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AMO_PIZARRA = ?";
        values.add(this.getAmoPizarra());
        conditions += " AND AMO_SERIE = ?";
        values.add(this.getAmoSerie());
        conditions += " AND AMO_CUPON = ?";
        values.add(this.getAmoCupon());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Amorep instance = (Amorep) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAmoPizarra().equals(instance.getAmoPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getAmoSerie().equals(instance.getAmoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getAmoCupon().equals(instance.getAmoCupon()))
            equalObjects = false;
        if (equalObjects && !this.getAmoFechaInicio().equals(instance.getAmoFechaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getAmoFechaVmto().equals(instance.getAmoFechaVmto()))
            equalObjects = false;
        if (equalObjects && !this.getAmoNumTitulos().equals(instance.getAmoNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getAmoImporte().equals(instance.getAmoImporte()))
            equalObjects = false;
        if (equalObjects && !this.getAmoImporteIsr().equals(instance.getAmoImporteIsr()))
            equalObjects = false;
        if (equalObjects && !this.getAmoNumContratos().equals(instance.getAmoNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getAmoNumUsuario().equals(instance.getAmoNumUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Amorep result = new Amorep();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAmoPizarra((String) objectData.getData("AMO_PIZARRA"));
        result.setAmoSerie((String) objectData.getData("AMO_SERIE"));
        result.setAmoCupon((BigDecimal) objectData.getData("AMO_CUPON"));
        result.setAmoFechaInicio((String) objectData.getData("AMO_FECHA_INICIO"));
        result.setAmoFechaVmto((String) objectData.getData("AMO_FECHA_VMTO"));
        result.setAmoNumTitulos((BigDecimal) objectData.getData("AMO_NUM_TITULOS"));
        result.setAmoImporte((BigDecimal) objectData.getData("AMO_IMPORTE"));
        result.setAmoImporteIsr((BigDecimal) objectData.getData("AMO_IMPORTE_ISR"));
        result.setAmoNumContratos((BigDecimal) objectData.getData("AMO_NUM_CONTRATOS"));
        result.setAmoNumUsuario((BigDecimal) objectData.getData("AMO_NUM_USUARIO"));

        return result;

    }

}
