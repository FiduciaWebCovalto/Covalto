package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COTIZACO_PK", columns = { "COC_NUM_CORTE", "COC_TIPO_MERCA", "COC_NUM_INSTRUME", "COC_NUM_SEC_EMIS", "COC_ENTIDAD_FIN" }, sequences = { "MANUAL" })
public class Cotizaco extends DomainObject {

    BigDecimal cocNumCorte = null;
    BigDecimal cocEntidadFin = null;
    BigDecimal cocTipoMerca = null;
    BigDecimal cocNumInstrume = null;
    BigDecimal cocNumSecEmis = null;
    String cocNomPizarra = null;
    String cocSerieEmision = null;
    BigDecimal cocNumCuponVig = null;
    BigDecimal cocNumTitulos = null;
    BigDecimal cocNumImpTit = null;
    BigDecimal cocPrecioTitInt = null;
    BigDecimal cocNumPlazo = null;
    BigDecimal cocNumPjeTasa = null;
    String cocHoraCotiza = null;
    String cocCveStCotizac = null;

    public Cotizaco() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCocNumCorte(BigDecimal cocNumCorte) {
        this.cocNumCorte = cocNumCorte;
    }

    public BigDecimal getCocNumCorte() {
        return this.cocNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCocEntidadFin(BigDecimal cocEntidadFin) {
        this.cocEntidadFin = cocEntidadFin;
    }

    public BigDecimal getCocEntidadFin() {
        return this.cocEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCocTipoMerca(BigDecimal cocTipoMerca) {
        this.cocTipoMerca = cocTipoMerca;
    }

    public BigDecimal getCocTipoMerca() {
        return this.cocTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCocNumInstrume(BigDecimal cocNumInstrume) {
        this.cocNumInstrume = cocNumInstrume;
    }

    public BigDecimal getCocNumInstrume() {
        return this.cocNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCocNumSecEmis(BigDecimal cocNumSecEmis) {
        this.cocNumSecEmis = cocNumSecEmis;
    }

    public BigDecimal getCocNumSecEmis() {
        return this.cocNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCocNomPizarra(String cocNomPizarra) {
        this.cocNomPizarra = cocNomPizarra;
    }

    public String getCocNomPizarra() {
        return this.cocNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCocSerieEmision(String cocSerieEmision) {
        this.cocSerieEmision = cocSerieEmision;
    }

    public String getCocSerieEmision() {
        return this.cocSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCocNumCuponVig(BigDecimal cocNumCuponVig) {
        this.cocNumCuponVig = cocNumCuponVig;
    }

    public BigDecimal getCocNumCuponVig() {
        return this.cocNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCocNumTitulos(BigDecimal cocNumTitulos) {
        this.cocNumTitulos = cocNumTitulos;
    }

    public BigDecimal getCocNumTitulos() {
        return this.cocNumTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCocNumImpTit(BigDecimal cocNumImpTit) {
        this.cocNumImpTit = cocNumImpTit;
    }

    public BigDecimal getCocNumImpTit() {
        return this.cocNumImpTit;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setCocPrecioTitInt(BigDecimal cocPrecioTitInt) {
        this.cocPrecioTitInt = cocPrecioTitInt;
    }

    public BigDecimal getCocPrecioTitInt() {
        return this.cocPrecioTitInt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCocNumPlazo(BigDecimal cocNumPlazo) {
        this.cocNumPlazo = cocNumPlazo;
    }

    public BigDecimal getCocNumPlazo() {
        return this.cocNumPlazo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCocNumPjeTasa(BigDecimal cocNumPjeTasa) {
        this.cocNumPjeTasa = cocNumPjeTasa;
    }

    public BigDecimal getCocNumPjeTasa() {
        return this.cocNumPjeTasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCocHoraCotiza(String cocHoraCotiza) {
        this.cocHoraCotiza = cocHoraCotiza;
    }

    public String getCocHoraCotiza() {
        return this.cocHoraCotiza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCocCveStCotizac(String cocCveStCotizac) {
        this.cocCveStCotizac = cocCveStCotizac;
    }

    public String getCocCveStCotizac() {
        return this.cocCveStCotizac;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COTIZACO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCocNumCorte() != null && this.getCocNumCorte().longValue() == -999) {
            conditions += " AND COC_NUM_CORTE IS NULL";
        } else if (this.getCocNumCorte() != null) {
            conditions += " AND COC_NUM_CORTE = ?";
            values.add(this.getCocNumCorte());
        }

        if (this.getCocEntidadFin() != null && this.getCocEntidadFin().longValue() == -999) {
            conditions += " AND COC_ENTIDAD_FIN IS NULL";
        } else if (this.getCocEntidadFin() != null) {
            conditions += " AND COC_ENTIDAD_FIN = ?";
            values.add(this.getCocEntidadFin());
        }

        if (this.getCocTipoMerca() != null && this.getCocTipoMerca().longValue() == -999) {
            conditions += " AND COC_TIPO_MERCA IS NULL";
        } else if (this.getCocTipoMerca() != null) {
            conditions += " AND COC_TIPO_MERCA = ?";
            values.add(this.getCocTipoMerca());
        }

        if (this.getCocNumInstrume() != null && this.getCocNumInstrume().longValue() == -999) {
            conditions += " AND COC_NUM_INSTRUME IS NULL";
        } else if (this.getCocNumInstrume() != null) {
            conditions += " AND COC_NUM_INSTRUME = ?";
            values.add(this.getCocNumInstrume());
        }

        if (this.getCocNumSecEmis() != null && this.getCocNumSecEmis().longValue() == -999) {
            conditions += " AND COC_NUM_SEC_EMIS IS NULL";
        } else if (this.getCocNumSecEmis() != null) {
            conditions += " AND COC_NUM_SEC_EMIS = ?";
            values.add(this.getCocNumSecEmis());
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
        String sql = "SELECT * FROM COTIZACO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCocNumCorte() != null && this.getCocNumCorte().longValue() == -999) {
            conditions += " AND COC_NUM_CORTE IS NULL";
        } else if (this.getCocNumCorte() != null) {
            conditions += " AND COC_NUM_CORTE = ?";
            values.add(this.getCocNumCorte());
        }

        if (this.getCocEntidadFin() != null && this.getCocEntidadFin().longValue() == -999) {
            conditions += " AND COC_ENTIDAD_FIN IS NULL";
        } else if (this.getCocEntidadFin() != null) {
            conditions += " AND COC_ENTIDAD_FIN = ?";
            values.add(this.getCocEntidadFin());
        }

        if (this.getCocTipoMerca() != null && this.getCocTipoMerca().longValue() == -999) {
            conditions += " AND COC_TIPO_MERCA IS NULL";
        } else if (this.getCocTipoMerca() != null) {
            conditions += " AND COC_TIPO_MERCA = ?";
            values.add(this.getCocTipoMerca());
        }

        if (this.getCocNumInstrume() != null && this.getCocNumInstrume().longValue() == -999) {
            conditions += " AND COC_NUM_INSTRUME IS NULL";
        } else if (this.getCocNumInstrume() != null) {
            conditions += " AND COC_NUM_INSTRUME = ?";
            values.add(this.getCocNumInstrume());
        }

        if (this.getCocNumSecEmis() != null && this.getCocNumSecEmis().longValue() == -999) {
            conditions += " AND COC_NUM_SEC_EMIS IS NULL";
        } else if (this.getCocNumSecEmis() != null) {
            conditions += " AND COC_NUM_SEC_EMIS = ?";
            values.add(this.getCocNumSecEmis());
        }

        if (this.getCocNomPizarra() != null && "null".equals(this.getCocNomPizarra())) {
            conditions += " AND COC_NOM_PIZARRA IS NULL";
        } else if (this.getCocNomPizarra() != null) {
            conditions += " AND COC_NOM_PIZARRA = ?";
            values.add(this.getCocNomPizarra());
        }

        if (this.getCocSerieEmision() != null && "null".equals(this.getCocSerieEmision())) {
            conditions += " AND COC_SERIE_EMISION IS NULL";
        } else if (this.getCocSerieEmision() != null) {
            conditions += " AND COC_SERIE_EMISION = ?";
            values.add(this.getCocSerieEmision());
        }

        if (this.getCocNumCuponVig() != null && this.getCocNumCuponVig().longValue() == -999) {
            conditions += " AND COC_NUM_CUPON_VIG IS NULL";
        } else if (this.getCocNumCuponVig() != null) {
            conditions += " AND COC_NUM_CUPON_VIG = ?";
            values.add(this.getCocNumCuponVig());
        }

        if (this.getCocNumTitulos() != null && this.getCocNumTitulos().longValue() == -999) {
            conditions += " AND COC_NUM_TITULOS IS NULL";
        } else if (this.getCocNumTitulos() != null) {
            conditions += " AND COC_NUM_TITULOS = ?";
            values.add(this.getCocNumTitulos());
        }

        if (this.getCocNumImpTit() != null && this.getCocNumImpTit().longValue() == -999) {
            conditions += " AND COC_NUM_IMP_TIT IS NULL";
        } else if (this.getCocNumImpTit() != null) {
            conditions += " AND COC_NUM_IMP_TIT = ?";
            values.add(this.getCocNumImpTit());
        }

        if (this.getCocPrecioTitInt() != null && this.getCocPrecioTitInt().longValue() == -999) {
            conditions += " AND COC_PRECIO_TIT_INT IS NULL";
        } else if (this.getCocPrecioTitInt() != null) {
            conditions += " AND COC_PRECIO_TIT_INT = ?";
            values.add(this.getCocPrecioTitInt());
        }

        if (this.getCocNumPlazo() != null && this.getCocNumPlazo().longValue() == -999) {
            conditions += " AND COC_NUM_PLAZO IS NULL";
        } else if (this.getCocNumPlazo() != null) {
            conditions += " AND COC_NUM_PLAZO = ?";
            values.add(this.getCocNumPlazo());
        }

        if (this.getCocNumPjeTasa() != null && this.getCocNumPjeTasa().longValue() == -999) {
            conditions += " AND COC_NUM_PJE_TASA IS NULL";
        } else if (this.getCocNumPjeTasa() != null) {
            conditions += " AND COC_NUM_PJE_TASA = ?";
            values.add(this.getCocNumPjeTasa());
        }

        if (this.getCocHoraCotiza() != null && "null".equals(this.getCocHoraCotiza())) {
            conditions += " AND COC_HORA_COTIZA IS NULL";
        } else if (this.getCocHoraCotiza() != null) {
            conditions += " AND COC_HORA_COTIZA = ?";
            values.add(this.getCocHoraCotiza());
        }

        if (this.getCocCveStCotizac() != null && "null".equals(this.getCocCveStCotizac())) {
            conditions += " AND COC_CVE_ST_COTIZAC IS NULL";
        } else if (this.getCocCveStCotizac() != null) {
            conditions += " AND COC_CVE_ST_COTIZAC = ?";
            values.add(this.getCocCveStCotizac());
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
        String sql = "UPDATE COTIZACO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND COC_NUM_CORTE = ?";
        pkValues.add(this.getCocNumCorte());
        conditions += " AND COC_ENTIDAD_FIN = ?";
        pkValues.add(this.getCocEntidadFin());
        conditions += " AND COC_TIPO_MERCA = ?";
        pkValues.add(this.getCocTipoMerca());
        conditions += " AND COC_NUM_INSTRUME = ?";
        pkValues.add(this.getCocNumInstrume());
        conditions += " AND COC_NUM_SEC_EMIS = ?";
        pkValues.add(this.getCocNumSecEmis());
        fields += " COC_NOM_PIZARRA = ?, ";
        values.add(this.getCocNomPizarra());
        fields += " COC_SERIE_EMISION = ?, ";
        values.add(this.getCocSerieEmision());
        fields += " COC_NUM_CUPON_VIG = ?, ";
        values.add(this.getCocNumCuponVig());
        fields += " COC_NUM_TITULOS = ?, ";
        values.add(this.getCocNumTitulos());
        fields += " COC_NUM_IMP_TIT = ?, ";
        values.add(this.getCocNumImpTit());
        fields += " COC_PRECIO_TIT_INT = ?, ";
        values.add(this.getCocPrecioTitInt());
        fields += " COC_NUM_PLAZO = ?, ";
        values.add(this.getCocNumPlazo());
        fields += " COC_NUM_PJE_TASA = ?, ";
        values.add(this.getCocNumPjeTasa());
        fields += " COC_HORA_COTIZA = ?, ";
        values.add(this.getCocHoraCotiza());
        fields += " COC_CVE_ST_COTIZAC = ?, ";
        values.add(this.getCocCveStCotizac());
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
        String sql = "INSERT INTO COTIZACO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", COC_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getCocNumCorte());

        fields += ", COC_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getCocEntidadFin());

        fields += ", COC_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getCocTipoMerca());

        fields += ", COC_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getCocNumInstrume());

        fields += ", COC_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getCocNumSecEmis());

        fields += ", COC_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCocNomPizarra());

        fields += ", COC_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getCocSerieEmision());

        fields += ", COC_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getCocNumCuponVig());

        fields += ", COC_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getCocNumTitulos());

        fields += ", COC_NUM_IMP_TIT";
        fieldValues += ", ?";
        values.add(this.getCocNumImpTit());

        fields += ", COC_PRECIO_TIT_INT";
        fieldValues += ", ?";
        values.add(this.getCocPrecioTitInt());

        fields += ", COC_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCocNumPlazo());

        fields += ", COC_NUM_PJE_TASA";
        fieldValues += ", ?";
        values.add(this.getCocNumPjeTasa());

        fields += ", COC_HORA_COTIZA";
        fieldValues += ", ?";
        values.add(this.getCocHoraCotiza());

        fields += ", COC_CVE_ST_COTIZAC";
        fieldValues += ", ?";
        values.add(this.getCocCveStCotizac());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COTIZACO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND COC_NUM_CORTE = ?";
        values.add(this.getCocNumCorte());
        conditions += " AND COC_ENTIDAD_FIN = ?";
        values.add(this.getCocEntidadFin());
        conditions += " AND COC_TIPO_MERCA = ?";
        values.add(this.getCocTipoMerca());
        conditions += " AND COC_NUM_INSTRUME = ?";
        values.add(this.getCocNumInstrume());
        conditions += " AND COC_NUM_SEC_EMIS = ?";
        values.add(this.getCocNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cotizaco instance = (Cotizaco) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCocNumCorte().equals(instance.getCocNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getCocEntidadFin().equals(instance.getCocEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getCocTipoMerca().equals(instance.getCocTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getCocNumInstrume().equals(instance.getCocNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getCocNumSecEmis().equals(instance.getCocNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCocNomPizarra().equals(instance.getCocNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCocSerieEmision().equals(instance.getCocSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCocNumCuponVig().equals(instance.getCocNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getCocNumTitulos().equals(instance.getCocNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getCocNumImpTit().equals(instance.getCocNumImpTit()))
            equalObjects = false;
        if (equalObjects && !this.getCocPrecioTitInt().equals(instance.getCocPrecioTitInt()))
            equalObjects = false;
        if (equalObjects && !this.getCocNumPlazo().equals(instance.getCocNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCocNumPjeTasa().equals(instance.getCocNumPjeTasa()))
            equalObjects = false;
        if (equalObjects && !this.getCocHoraCotiza().equals(instance.getCocHoraCotiza()))
            equalObjects = false;
        if (equalObjects && !this.getCocCveStCotizac().equals(instance.getCocCveStCotizac()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cotizaco result = new Cotizaco();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCocNumCorte((BigDecimal) objectData.getData("COC_NUM_CORTE"));
        result.setCocEntidadFin((BigDecimal) objectData.getData("COC_ENTIDAD_FIN"));
        result.setCocTipoMerca((BigDecimal) objectData.getData("COC_TIPO_MERCA"));
        result.setCocNumInstrume((BigDecimal) objectData.getData("COC_NUM_INSTRUME"));
        result.setCocNumSecEmis((BigDecimal) objectData.getData("COC_NUM_SEC_EMIS"));
        result.setCocNomPizarra((String) objectData.getData("COC_NOM_PIZARRA"));
        result.setCocSerieEmision((String) objectData.getData("COC_SERIE_EMISION"));
        result.setCocNumCuponVig((BigDecimal) objectData.getData("COC_NUM_CUPON_VIG"));
        result.setCocNumTitulos((BigDecimal) objectData.getData("COC_NUM_TITULOS"));
        result.setCocNumImpTit((BigDecimal) objectData.getData("COC_NUM_IMP_TIT"));
        result.setCocPrecioTitInt((BigDecimal) objectData.getData("COC_PRECIO_TIT_INT"));
        result.setCocNumPlazo((BigDecimal) objectData.getData("COC_NUM_PLAZO"));
        result.setCocNumPjeTasa((BigDecimal) objectData.getData("COC_NUM_PJE_TASA"));
        result.setCocHoraCotiza((String) objectData.getData("COC_HORA_COTIZA"));
        result.setCocCveStCotizac((String) objectData.getData("COC_CVE_ST_COTIZAC"));

        return result;

    }

}
