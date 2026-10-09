package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COTIZAVE_PK", columns = { "COV_NUM_CORTE", "COV_CVE_TIPO_MERCA", "COV_NUM_INSTRUME", "COV_NUM_SEC_EMIS", "COV_ENTIDAD_FIN" },
            sequences = { "MANUAL" })
public class Cotizave extends DomainObject {

    BigDecimal covNumCorte = null;
    BigDecimal covEntidadFin = null;
    BigDecimal covCveTipoMerca = null;
    BigDecimal covNumInstrume = null;
    BigDecimal covNumSecEmis = null;
    String covNomPizarra = null;
    String covSerieEmision = null;
    BigDecimal covNumCuponVig = null;
    BigDecimal covNumPlazo = null;
    BigDecimal covNumTitulos = null;
    BigDecimal covImpTitulos = null;
    BigDecimal covPrecioTitInt = null;
    String covHoraCotiza = null;
    String covCveStCotizav = null;

    public Cotizave() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCovNumCorte(BigDecimal covNumCorte) {
        this.covNumCorte = covNumCorte;
    }

    public BigDecimal getCovNumCorte() {
        return this.covNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCovEntidadFin(BigDecimal covEntidadFin) {
        this.covEntidadFin = covEntidadFin;
    }

    public BigDecimal getCovEntidadFin() {
        return this.covEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCovCveTipoMerca(BigDecimal covCveTipoMerca) {
        this.covCveTipoMerca = covCveTipoMerca;
    }

    public BigDecimal getCovCveTipoMerca() {
        return this.covCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCovNumInstrume(BigDecimal covNumInstrume) {
        this.covNumInstrume = covNumInstrume;
    }

    public BigDecimal getCovNumInstrume() {
        return this.covNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCovNumSecEmis(BigDecimal covNumSecEmis) {
        this.covNumSecEmis = covNumSecEmis;
    }

    public BigDecimal getCovNumSecEmis() {
        return this.covNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCovNomPizarra(String covNomPizarra) {
        this.covNomPizarra = covNomPizarra;
    }

    public String getCovNomPizarra() {
        return this.covNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCovSerieEmision(String covSerieEmision) {
        this.covSerieEmision = covSerieEmision;
    }

    public String getCovSerieEmision() {
        return this.covSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCovNumCuponVig(BigDecimal covNumCuponVig) {
        this.covNumCuponVig = covNumCuponVig;
    }

    public BigDecimal getCovNumCuponVig() {
        return this.covNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCovNumPlazo(BigDecimal covNumPlazo) {
        this.covNumPlazo = covNumPlazo;
    }

    public BigDecimal getCovNumPlazo() {
        return this.covNumPlazo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCovNumTitulos(BigDecimal covNumTitulos) {
        this.covNumTitulos = covNumTitulos;
    }

    public BigDecimal getCovNumTitulos() {
        return this.covNumTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCovImpTitulos(BigDecimal covImpTitulos) {
        this.covImpTitulos = covImpTitulos;
    }

    public BigDecimal getCovImpTitulos() {
        return this.covImpTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setCovPrecioTitInt(BigDecimal covPrecioTitInt) {
        this.covPrecioTitInt = covPrecioTitInt;
    }

    public BigDecimal getCovPrecioTitInt() {
        return this.covPrecioTitInt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCovHoraCotiza(String covHoraCotiza) {
        this.covHoraCotiza = covHoraCotiza;
    }

    public String getCovHoraCotiza() {
        return this.covHoraCotiza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCovCveStCotizav(String covCveStCotizav) {
        this.covCveStCotizav = covCveStCotizav;
    }

    public String getCovCveStCotizav() {
        return this.covCveStCotizav;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COTIZAVE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCovNumCorte() != null && this.getCovNumCorte().longValue() == -999) {
            conditions += " AND COV_NUM_CORTE IS NULL";
        } else if (this.getCovNumCorte() != null) {
            conditions += " AND COV_NUM_CORTE = ?";
            values.add(this.getCovNumCorte());
        }

        if (this.getCovEntidadFin() != null && this.getCovEntidadFin().longValue() == -999) {
            conditions += " AND COV_ENTIDAD_FIN IS NULL";
        } else if (this.getCovEntidadFin() != null) {
            conditions += " AND COV_ENTIDAD_FIN = ?";
            values.add(this.getCovEntidadFin());
        }

        if (this.getCovCveTipoMerca() != null && this.getCovCveTipoMerca().longValue() == -999) {
            conditions += " AND COV_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCovCveTipoMerca() != null) {
            conditions += " AND COV_CVE_TIPO_MERCA = ?";
            values.add(this.getCovCveTipoMerca());
        }

        if (this.getCovNumInstrume() != null && this.getCovNumInstrume().longValue() == -999) {
            conditions += " AND COV_NUM_INSTRUME IS NULL";
        } else if (this.getCovNumInstrume() != null) {
            conditions += " AND COV_NUM_INSTRUME = ?";
            values.add(this.getCovNumInstrume());
        }

        if (this.getCovNumSecEmis() != null && this.getCovNumSecEmis().longValue() == -999) {
            conditions += " AND COV_NUM_SEC_EMIS IS NULL";
        } else if (this.getCovNumSecEmis() != null) {
            conditions += " AND COV_NUM_SEC_EMIS = ?";
            values.add(this.getCovNumSecEmis());
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
        String sql = "SELECT * FROM COTIZAVE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCovNumCorte() != null && this.getCovNumCorte().longValue() == -999) {
            conditions += " AND COV_NUM_CORTE IS NULL";
        } else if (this.getCovNumCorte() != null) {
            conditions += " AND COV_NUM_CORTE = ?";
            values.add(this.getCovNumCorte());
        }

        if (this.getCovEntidadFin() != null && this.getCovEntidadFin().longValue() == -999) {
            conditions += " AND COV_ENTIDAD_FIN IS NULL";
        } else if (this.getCovEntidadFin() != null) {
            conditions += " AND COV_ENTIDAD_FIN = ?";
            values.add(this.getCovEntidadFin());
        }

        if (this.getCovCveTipoMerca() != null && this.getCovCveTipoMerca().longValue() == -999) {
            conditions += " AND COV_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCovCveTipoMerca() != null) {
            conditions += " AND COV_CVE_TIPO_MERCA = ?";
            values.add(this.getCovCveTipoMerca());
        }

        if (this.getCovNumInstrume() != null && this.getCovNumInstrume().longValue() == -999) {
            conditions += " AND COV_NUM_INSTRUME IS NULL";
        } else if (this.getCovNumInstrume() != null) {
            conditions += " AND COV_NUM_INSTRUME = ?";
            values.add(this.getCovNumInstrume());
        }

        if (this.getCovNumSecEmis() != null && this.getCovNumSecEmis().longValue() == -999) {
            conditions += " AND COV_NUM_SEC_EMIS IS NULL";
        } else if (this.getCovNumSecEmis() != null) {
            conditions += " AND COV_NUM_SEC_EMIS = ?";
            values.add(this.getCovNumSecEmis());
        }

        if (this.getCovNomPizarra() != null && "null".equals(this.getCovNomPizarra())) {
            conditions += " AND COV_NOM_PIZARRA IS NULL";
        } else if (this.getCovNomPizarra() != null) {
            conditions += " AND COV_NOM_PIZARRA = ?";
            values.add(this.getCovNomPizarra());
        }

        if (this.getCovSerieEmision() != null && "null".equals(this.getCovSerieEmision())) {
            conditions += " AND COV_SERIE_EMISION IS NULL";
        } else if (this.getCovSerieEmision() != null) {
            conditions += " AND COV_SERIE_EMISION = ?";
            values.add(this.getCovSerieEmision());
        }

        if (this.getCovNumCuponVig() != null && this.getCovNumCuponVig().longValue() == -999) {
            conditions += " AND COV_NUM_CUPON_VIG IS NULL";
        } else if (this.getCovNumCuponVig() != null) {
            conditions += " AND COV_NUM_CUPON_VIG = ?";
            values.add(this.getCovNumCuponVig());
        }

        if (this.getCovNumPlazo() != null && this.getCovNumPlazo().longValue() == -999) {
            conditions += " AND COV_NUM_PLAZO IS NULL";
        } else if (this.getCovNumPlazo() != null) {
            conditions += " AND COV_NUM_PLAZO = ?";
            values.add(this.getCovNumPlazo());
        }

        if (this.getCovNumTitulos() != null && this.getCovNumTitulos().longValue() == -999) {
            conditions += " AND COV_NUM_TITULOS IS NULL";
        } else if (this.getCovNumTitulos() != null) {
            conditions += " AND COV_NUM_TITULOS = ?";
            values.add(this.getCovNumTitulos());
        }

        if (this.getCovImpTitulos() != null && this.getCovImpTitulos().longValue() == -999) {
            conditions += " AND COV_IMP_TITULOS IS NULL";
        } else if (this.getCovImpTitulos() != null) {
            conditions += " AND COV_IMP_TITULOS = ?";
            values.add(this.getCovImpTitulos());
        }

        if (this.getCovPrecioTitInt() != null && this.getCovPrecioTitInt().longValue() == -999) {
            conditions += " AND COV_PRECIO_TIT_INT IS NULL";
        } else if (this.getCovPrecioTitInt() != null) {
            conditions += " AND COV_PRECIO_TIT_INT = ?";
            values.add(this.getCovPrecioTitInt());
        }

        if (this.getCovHoraCotiza() != null && "null".equals(this.getCovHoraCotiza())) {
            conditions += " AND COV_HORA_COTIZA IS NULL";
        } else if (this.getCovHoraCotiza() != null) {
            conditions += " AND COV_HORA_COTIZA = ?";
            values.add(this.getCovHoraCotiza());
        }

        if (this.getCovCveStCotizav() != null && "null".equals(this.getCovCveStCotizav())) {
            conditions += " AND COV_CVE_ST_COTIZAV IS NULL";
        } else if (this.getCovCveStCotizav() != null) {
            conditions += " AND COV_CVE_ST_COTIZAV = ?";
            values.add(this.getCovCveStCotizav());
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
        String sql = "UPDATE COTIZAVE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND COV_NUM_CORTE = ?";
        pkValues.add(this.getCovNumCorte());
        conditions += " AND COV_ENTIDAD_FIN = ?";
        pkValues.add(this.getCovEntidadFin());
        conditions += " AND COV_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getCovCveTipoMerca());
        conditions += " AND COV_NUM_INSTRUME = ?";
        pkValues.add(this.getCovNumInstrume());
        conditions += " AND COV_NUM_SEC_EMIS = ?";
        pkValues.add(this.getCovNumSecEmis());
        fields += " COV_NOM_PIZARRA = ?, ";
        values.add(this.getCovNomPizarra());
        fields += " COV_SERIE_EMISION = ?, ";
        values.add(this.getCovSerieEmision());
        fields += " COV_NUM_CUPON_VIG = ?, ";
        values.add(this.getCovNumCuponVig());
        fields += " COV_NUM_PLAZO = ?, ";
        values.add(this.getCovNumPlazo());
        fields += " COV_NUM_TITULOS = ?, ";
        values.add(this.getCovNumTitulos());
        fields += " COV_IMP_TITULOS = ?, ";
        values.add(this.getCovImpTitulos());
        fields += " COV_PRECIO_TIT_INT = ?, ";
        values.add(this.getCovPrecioTitInt());
        fields += " COV_HORA_COTIZA = ?, ";
        values.add(this.getCovHoraCotiza());
        fields += " COV_CVE_ST_COTIZAV = ?, ";
        values.add(this.getCovCveStCotizav());
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
        String sql = "INSERT INTO COTIZAVE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", COV_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getCovNumCorte());

        fields += ", COV_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getCovEntidadFin());

        fields += ", COV_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getCovCveTipoMerca());

        fields += ", COV_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getCovNumInstrume());

        fields += ", COV_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getCovNumSecEmis());

        fields += ", COV_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCovNomPizarra());

        fields += ", COV_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getCovSerieEmision());

        fields += ", COV_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getCovNumCuponVig());

        fields += ", COV_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCovNumPlazo());

        fields += ", COV_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getCovNumTitulos());

        fields += ", COV_IMP_TITULOS";
        fieldValues += ", ?";
        values.add(this.getCovImpTitulos());

        fields += ", COV_PRECIO_TIT_INT";
        fieldValues += ", ?";
        values.add(this.getCovPrecioTitInt());

        fields += ", COV_HORA_COTIZA";
        fieldValues += ", ?";
        values.add(this.getCovHoraCotiza());

        fields += ", COV_CVE_ST_COTIZAV";
        fieldValues += ", ?";
        values.add(this.getCovCveStCotizav());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COTIZAVE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND COV_NUM_CORTE = ?";
        values.add(this.getCovNumCorte());
        conditions += " AND COV_ENTIDAD_FIN = ?";
        values.add(this.getCovEntidadFin());
        conditions += " AND COV_CVE_TIPO_MERCA = ?";
        values.add(this.getCovCveTipoMerca());
        conditions += " AND COV_NUM_INSTRUME = ?";
        values.add(this.getCovNumInstrume());
        conditions += " AND COV_NUM_SEC_EMIS = ?";
        values.add(this.getCovNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cotizave instance = (Cotizave) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCovNumCorte().equals(instance.getCovNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCovEntidadFin().equals(instance.getCovEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getCovCveTipoMerca().equals(instance.getCovCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getCovNumInstrume().equals(instance.getCovNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getCovNumSecEmis().equals(instance.getCovNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCovNomPizarra().equals(instance.getCovNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCovSerieEmision().equals(instance.getCovSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCovNumCuponVig().equals(instance.getCovNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getCovNumPlazo().equals(instance.getCovNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCovNumTitulos().equals(instance.getCovNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getCovImpTitulos().equals(instance.getCovImpTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getCovPrecioTitInt().equals(instance.getCovPrecioTitInt()))
            equalObjects = false;
        if (equalObjects && !this.getCovHoraCotiza().equals(instance.getCovHoraCotiza()))
            equalObjects = false;
        if (equalObjects && !this.getCovCveStCotizav().equals(instance.getCovCveStCotizav()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cotizave result = new Cotizave();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCovNumCorte((BigDecimal) objectData.getData("COV_NUM_CORTE"));
        result.setCovEntidadFin((BigDecimal) objectData.getData("COV_ENTIDAD_FIN"));
        result.setCovCveTipoMerca((BigDecimal) objectData.getData("COV_CVE_TIPO_MERCA"));
        result.setCovNumInstrume((BigDecimal) objectData.getData("COV_NUM_INSTRUME"));
        result.setCovNumSecEmis((BigDecimal) objectData.getData("COV_NUM_SEC_EMIS"));
        result.setCovNomPizarra((String) objectData.getData("COV_NOM_PIZARRA"));
        result.setCovSerieEmision((String) objectData.getData("COV_SERIE_EMISION"));
        result.setCovNumCuponVig((BigDecimal) objectData.getData("COV_NUM_CUPON_VIG"));
        result.setCovNumPlazo((BigDecimal) objectData.getData("COV_NUM_PLAZO"));
        result.setCovNumTitulos((BigDecimal) objectData.getData("COV_NUM_TITULOS"));
        result.setCovImpTitulos((BigDecimal) objectData.getData("COV_IMP_TITULOS"));
        result.setCovPrecioTitInt((BigDecimal) objectData.getData("COV_PRECIO_TIT_INT"));
        result.setCovHoraCotiza((String) objectData.getData("COV_HORA_COTIZA"));
        result.setCovCveStCotizav((String) objectData.getData("COV_CVE_ST_COTIZAV"));

        return result;

    }

}
