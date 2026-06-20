package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COMVTA_PK", columns = { "CMA_INTERMEDIARIO", "CMA_TIPO_MOVIM", "CMA_PIZARRA", "CMA_SERIE", "CMA_CUPON" }, sequences = { "MANUAL" })
public class Comvta extends DomainObject {

    String cmaIntermediario = null;
    String cmaTipoMovim = null;
    String cmaPizarra = null;
    String cmaSerie = null;
    BigDecimal cmaCupon = null;
    BigDecimal cmaTitulos = null;
    BigDecimal cmaImporte = null;
    BigDecimal cmaFolio = null;
    BigDecimal cmaTipoMercado = null;

    public Comvta() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCmaIntermediario(String cmaIntermediario) {
        this.cmaIntermediario = cmaIntermediario;
    }

    public String getCmaIntermediario() {
        return this.cmaIntermediario;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCmaTipoMovim(String cmaTipoMovim) {
        this.cmaTipoMovim = cmaTipoMovim;
    }

    public String getCmaTipoMovim() {
        return this.cmaTipoMovim;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCmaPizarra(String cmaPizarra) {
        this.cmaPizarra = cmaPizarra;
    }

    public String getCmaPizarra() {
        return this.cmaPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCmaSerie(String cmaSerie) {
        this.cmaSerie = cmaSerie;
    }

    public String getCmaSerie() {
        return this.cmaSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmaCupon(BigDecimal cmaCupon) {
        this.cmaCupon = cmaCupon;
    }

    public BigDecimal getCmaCupon() {
        return this.cmaCupon;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmaTitulos(BigDecimal cmaTitulos) {
        this.cmaTitulos = cmaTitulos;
    }

    public BigDecimal getCmaTitulos() {
        return this.cmaTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCmaImporte(BigDecimal cmaImporte) {
        this.cmaImporte = cmaImporte;
    }

    public BigDecimal getCmaImporte() {
        return this.cmaImporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmaFolio(BigDecimal cmaFolio) {
        this.cmaFolio = cmaFolio;
    }

    public BigDecimal getCmaFolio() {
        return this.cmaFolio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmaTipoMercado(BigDecimal cmaTipoMercado) {
        this.cmaTipoMercado = cmaTipoMercado;
    }

    public BigDecimal getCmaTipoMercado() {
        return this.cmaTipoMercado;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COMVTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCmaIntermediario() != null && "null".equals(this.getCmaIntermediario())) {
            conditions += " AND CMA_INTERMEDIARIO IS NULL";
        } else if (this.getCmaIntermediario() != null) {
            conditions += " AND CMA_INTERMEDIARIO = ?";
            values.add(this.getCmaIntermediario());
        }

        if (this.getCmaTipoMovim() != null && "null".equals(this.getCmaTipoMovim())) {
            conditions += " AND CMA_TIPO_MOVIM IS NULL";
        } else if (this.getCmaTipoMovim() != null) {
            conditions += " AND CMA_TIPO_MOVIM = ?";
            values.add(this.getCmaTipoMovim());
        }

        if (this.getCmaPizarra() != null && "null".equals(this.getCmaPizarra())) {
            conditions += " AND CMA_PIZARRA IS NULL";
        } else if (this.getCmaPizarra() != null) {
            conditions += " AND CMA_PIZARRA = ?";
            values.add(this.getCmaPizarra());
        }

        if (this.getCmaSerie() != null && "null".equals(this.getCmaSerie())) {
            conditions += " AND CMA_SERIE IS NULL";
        } else if (this.getCmaSerie() != null) {
            conditions += " AND CMA_SERIE = ?";
            values.add(this.getCmaSerie());
        }

        if (this.getCmaCupon() != null && this.getCmaCupon().longValue() == -999) {
            conditions += " AND CMA_CUPON IS NULL";
        } else if (this.getCmaCupon() != null) {
            conditions += " AND CMA_CUPON = ?";
            values.add(this.getCmaCupon());
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
        String sql = "SELECT * FROM COMVTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCmaIntermediario() != null && "null".equals(this.getCmaIntermediario())) {
            conditions += " AND CMA_INTERMEDIARIO IS NULL";
        } else if (this.getCmaIntermediario() != null) {
            conditions += " AND CMA_INTERMEDIARIO = ?";
            values.add(this.getCmaIntermediario());
        }

        if (this.getCmaTipoMovim() != null && "null".equals(this.getCmaTipoMovim())) {
            conditions += " AND CMA_TIPO_MOVIM IS NULL";
        } else if (this.getCmaTipoMovim() != null) {
            conditions += " AND CMA_TIPO_MOVIM = ?";
            values.add(this.getCmaTipoMovim());
        }

        if (this.getCmaPizarra() != null && "null".equals(this.getCmaPizarra())) {
            conditions += " AND CMA_PIZARRA IS NULL";
        } else if (this.getCmaPizarra() != null) {
            conditions += " AND CMA_PIZARRA = ?";
            values.add(this.getCmaPizarra());
        }

        if (this.getCmaSerie() != null && "null".equals(this.getCmaSerie())) {
            conditions += " AND CMA_SERIE IS NULL";
        } else if (this.getCmaSerie() != null) {
            conditions += " AND CMA_SERIE = ?";
            values.add(this.getCmaSerie());
        }

        if (this.getCmaCupon() != null && this.getCmaCupon().longValue() == -999) {
            conditions += " AND CMA_CUPON IS NULL";
        } else if (this.getCmaCupon() != null) {
            conditions += " AND CMA_CUPON = ?";
            values.add(this.getCmaCupon());
        }

        if (this.getCmaTitulos() != null && this.getCmaTitulos().longValue() == -999) {
            conditions += " AND CMA_TITULOS IS NULL";
        } else if (this.getCmaTitulos() != null) {
            conditions += " AND CMA_TITULOS = ?";
            values.add(this.getCmaTitulos());
        }

        if (this.getCmaImporte() != null && this.getCmaImporte().longValue() == -999) {
            conditions += " AND CMA_IMPORTE IS NULL";
        } else if (this.getCmaImporte() != null) {
            conditions += " AND CMA_IMPORTE = ?";
            values.add(this.getCmaImporte());
        }

        if (this.getCmaFolio() != null && this.getCmaFolio().longValue() == -999) {
            conditions += " AND CMA_FOLIO IS NULL";
        } else if (this.getCmaFolio() != null) {
            conditions += " AND CMA_FOLIO = ?";
            values.add(this.getCmaFolio());
        }

        if (this.getCmaTipoMercado() != null && this.getCmaTipoMercado().longValue() == -999) {
            conditions += " AND CMA_TIPO_MERCADO IS NULL";
        } else if (this.getCmaTipoMercado() != null) {
            conditions += " AND CMA_TIPO_MERCADO = ?";
            values.add(this.getCmaTipoMercado());
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
        String sql = "UPDATE COMVTA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CMA_INTERMEDIARIO = ?";
        pkValues.add(this.getCmaIntermediario());
        conditions += " AND CMA_TIPO_MOVIM = ?";
        pkValues.add(this.getCmaTipoMovim());
        conditions += " AND CMA_PIZARRA = ?";
        pkValues.add(this.getCmaPizarra());
        conditions += " AND CMA_SERIE = ?";
        pkValues.add(this.getCmaSerie());
        conditions += " AND CMA_CUPON = ?";
        pkValues.add(this.getCmaCupon());
        fields += " CMA_TITULOS = ?, ";
        values.add(this.getCmaTitulos());
        fields += " CMA_IMPORTE = ?, ";
        values.add(this.getCmaImporte());
        fields += " CMA_FOLIO = ?, ";
        values.add(this.getCmaFolio());
        fields += " CMA_TIPO_MERCADO = ?, ";
        values.add(this.getCmaTipoMercado());
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
        String sql = "INSERT INTO COMVTA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CMA_INTERMEDIARIO";
        fieldValues += ", ?";
        values.add(this.getCmaIntermediario());

        fields += ", CMA_TIPO_MOVIM";
        fieldValues += ", ?";
        values.add(this.getCmaTipoMovim());

        fields += ", CMA_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCmaPizarra());

        fields += ", CMA_SERIE";
        fieldValues += ", ?";
        values.add(this.getCmaSerie());

        fields += ", CMA_CUPON";
        fieldValues += ", ?";
        values.add(this.getCmaCupon());

        fields += ", CMA_TITULOS";
        fieldValues += ", ?";
        values.add(this.getCmaTitulos());

        fields += ", CMA_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getCmaImporte());

        fields += ", CMA_FOLIO";
        fieldValues += ", ?";
        values.add(this.getCmaFolio());

        fields += ", CMA_TIPO_MERCADO";
        fieldValues += ", ?";
        values.add(this.getCmaTipoMercado());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COMVTA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CMA_INTERMEDIARIO = ?";
        values.add(this.getCmaIntermediario());
        conditions += " AND CMA_TIPO_MOVIM = ?";
        values.add(this.getCmaTipoMovim());
        conditions += " AND CMA_PIZARRA = ?";
        values.add(this.getCmaPizarra());
        conditions += " AND CMA_SERIE = ?";
        values.add(this.getCmaSerie());
        conditions += " AND CMA_CUPON = ?";
        values.add(this.getCmaCupon());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Comvta instance = (Comvta) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCmaIntermediario().equals(instance.getCmaIntermediario()))
            equalObjects = false;
        if (equalObjects && !this.getCmaTipoMovim().equals(instance.getCmaTipoMovim()))
            equalObjects = false;
        if (equalObjects && !this.getCmaPizarra().equals(instance.getCmaPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCmaSerie().equals(instance.getCmaSerie()))
            equalObjects = false;
        if (equalObjects && !this.getCmaCupon().equals(instance.getCmaCupon()))
            equalObjects = false;
        if (equalObjects && !this.getCmaTitulos().equals(instance.getCmaTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getCmaImporte().equals(instance.getCmaImporte()))
            equalObjects = false;
        if (equalObjects && !this.getCmaFolio().equals(instance.getCmaFolio()))
            equalObjects = false;
        if (equalObjects && !this.getCmaTipoMercado().equals(instance.getCmaTipoMercado()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Comvta result = new Comvta();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCmaIntermediario((String) objectData.getData("CMA_INTERMEDIARIO"));
        result.setCmaTipoMovim((String) objectData.getData("CMA_TIPO_MOVIM"));
        result.setCmaPizarra((String) objectData.getData("CMA_PIZARRA"));
        result.setCmaSerie((String) objectData.getData("CMA_SERIE"));
        result.setCmaCupon((BigDecimal) objectData.getData("CMA_CUPON"));
        result.setCmaTitulos((BigDecimal) objectData.getData("CMA_TITULOS"));
        result.setCmaImporte((BigDecimal) objectData.getData("CMA_IMPORTE"));
        result.setCmaFolio((BigDecimal) objectData.getData("CMA_FOLIO"));
        result.setCmaTipoMercado((BigDecimal) objectData.getData("CMA_TIPO_MERCADO"));

        return result;

    }

}
