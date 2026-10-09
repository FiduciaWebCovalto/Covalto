package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "VENTADIR_PK", columns = { "VTD_SUB_CONTRATO", "VTD_CVE_TIPO_MERCA", "VTD_NUM_INSTRUME", "VTD_NUM_SEC_EMIS", "VTD_NUM_CONTRATO", "VTD_NUM_CORTE" },
            sequences = { "MANUAL" })
public class Ventadir extends DomainObject {

    BigDecimal vtdNumCorte = null;
    BigDecimal vtdNumContrato = null;
    BigDecimal vtdSubContrato = null;
    BigDecimal vtdCveTipoMerca = null;
    BigDecimal vtdNumInstrume = null;
    BigDecimal vtdNumSecEmis = null;
    String vtdCveFormaNego = null;
    String vtdNomPizarra = null;
    String vtdSerieEmision = null;
    BigDecimal vtdNumCuponVig = null;
    BigDecimal vtdTitRequerido = null;
    BigDecimal vtdTitVendidos = null;
    BigDecimal vtdTitDisponible = null;
    BigDecimal vtdPrecioCierre = null;
    BigDecimal vtdFolioOperacio = null;
    String vtdCveStVentadi = null;

    public Ventadir() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdNumCorte(BigDecimal vtdNumCorte) {
        this.vtdNumCorte = vtdNumCorte;
    }

    public BigDecimal getVtdNumCorte() {
        return this.vtdNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdNumContrato(BigDecimal vtdNumContrato) {
        this.vtdNumContrato = vtdNumContrato;
    }

    public BigDecimal getVtdNumContrato() {
        return this.vtdNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdSubContrato(BigDecimal vtdSubContrato) {
        this.vtdSubContrato = vtdSubContrato;
    }

    public BigDecimal getVtdSubContrato() {
        return this.vtdSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdCveTipoMerca(BigDecimal vtdCveTipoMerca) {
        this.vtdCveTipoMerca = vtdCveTipoMerca;
    }

    public BigDecimal getVtdCveTipoMerca() {
        return this.vtdCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdNumInstrume(BigDecimal vtdNumInstrume) {
        this.vtdNumInstrume = vtdNumInstrume;
    }

    public BigDecimal getVtdNumInstrume() {
        return this.vtdNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdNumSecEmis(BigDecimal vtdNumSecEmis) {
        this.vtdNumSecEmis = vtdNumSecEmis;
    }

    public BigDecimal getVtdNumSecEmis() {
        return this.vtdNumSecEmis;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtdCveFormaNego(String vtdCveFormaNego) {
        this.vtdCveFormaNego = vtdCveFormaNego;
    }

    public String getVtdCveFormaNego() {
        return this.vtdCveFormaNego;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtdNomPizarra(String vtdNomPizarra) {
        this.vtdNomPizarra = vtdNomPizarra;
    }

    public String getVtdNomPizarra() {
        return this.vtdNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtdSerieEmision(String vtdSerieEmision) {
        this.vtdSerieEmision = vtdSerieEmision;
    }

    public String getVtdSerieEmision() {
        return this.vtdSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdNumCuponVig(BigDecimal vtdNumCuponVig) {
        this.vtdNumCuponVig = vtdNumCuponVig;
    }

    public BigDecimal getVtdNumCuponVig() {
        return this.vtdNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdTitRequerido(BigDecimal vtdTitRequerido) {
        this.vtdTitRequerido = vtdTitRequerido;
    }

    public BigDecimal getVtdTitRequerido() {
        return this.vtdTitRequerido;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdTitVendidos(BigDecimal vtdTitVendidos) {
        this.vtdTitVendidos = vtdTitVendidos;
    }

    public BigDecimal getVtdTitVendidos() {
        return this.vtdTitVendidos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdTitDisponible(BigDecimal vtdTitDisponible) {
        this.vtdTitDisponible = vtdTitDisponible;
    }

    public BigDecimal getVtdTitDisponible() {
        return this.vtdTitDisponible;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setVtdPrecioCierre(BigDecimal vtdPrecioCierre) {
        this.vtdPrecioCierre = vtdPrecioCierre;
    }

    public BigDecimal getVtdPrecioCierre() {
        return this.vtdPrecioCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtdFolioOperacio(BigDecimal vtdFolioOperacio) {
        this.vtdFolioOperacio = vtdFolioOperacio;
    }

    public BigDecimal getVtdFolioOperacio() {
        return this.vtdFolioOperacio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtdCveStVentadi(String vtdCveStVentadi) {
        this.vtdCveStVentadi = vtdCveStVentadi;
    }

    public String getVtdCveStVentadi() {
        return this.vtdCveStVentadi;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM VENTADIR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVtdNumCorte() != null && this.getVtdNumCorte().longValue() == -999) {
            conditions += " AND VTD_NUM_CORTE IS NULL";
        } else if (this.getVtdNumCorte() != null) {
            conditions += " AND VTD_NUM_CORTE = ?";
            values.add(this.getVtdNumCorte());
        }

        if (this.getVtdNumContrato() != null && this.getVtdNumContrato().longValue() == -999) {
            conditions += " AND VTD_NUM_CONTRATO IS NULL";
        } else if (this.getVtdNumContrato() != null) {
            conditions += " AND VTD_NUM_CONTRATO = ?";
            values.add(this.getVtdNumContrato());
        }

        if (this.getVtdSubContrato() != null && this.getVtdSubContrato().longValue() == -999) {
            conditions += " AND VTD_SUB_CONTRATO IS NULL";
        } else if (this.getVtdSubContrato() != null) {
            conditions += " AND VTD_SUB_CONTRATO = ?";
            values.add(this.getVtdSubContrato());
        }

        if (this.getVtdCveTipoMerca() != null && this.getVtdCveTipoMerca().longValue() == -999) {
            conditions += " AND VTD_CVE_TIPO_MERCA IS NULL";
        } else if (this.getVtdCveTipoMerca() != null) {
            conditions += " AND VTD_CVE_TIPO_MERCA = ?";
            values.add(this.getVtdCveTipoMerca());
        }

        if (this.getVtdNumInstrume() != null && this.getVtdNumInstrume().longValue() == -999) {
            conditions += " AND VTD_NUM_INSTRUME IS NULL";
        } else if (this.getVtdNumInstrume() != null) {
            conditions += " AND VTD_NUM_INSTRUME = ?";
            values.add(this.getVtdNumInstrume());
        }

        if (this.getVtdNumSecEmis() != null && this.getVtdNumSecEmis().longValue() == -999) {
            conditions += " AND VTD_NUM_SEC_EMIS IS NULL";
        } else if (this.getVtdNumSecEmis() != null) {
            conditions += " AND VTD_NUM_SEC_EMIS = ?";
            values.add(this.getVtdNumSecEmis());
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
        String sql = "SELECT * FROM VENTADIR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVtdNumCorte() != null && this.getVtdNumCorte().longValue() == -999) {
            conditions += " AND VTD_NUM_CORTE IS NULL";
        } else if (this.getVtdNumCorte() != null) {
            conditions += " AND VTD_NUM_CORTE = ?";
            values.add(this.getVtdNumCorte());
        }

        if (this.getVtdNumContrato() != null && this.getVtdNumContrato().longValue() == -999) {
            conditions += " AND VTD_NUM_CONTRATO IS NULL";
        } else if (this.getVtdNumContrato() != null) {
            conditions += " AND VTD_NUM_CONTRATO = ?";
            values.add(this.getVtdNumContrato());
        }

        if (this.getVtdSubContrato() != null && this.getVtdSubContrato().longValue() == -999) {
            conditions += " AND VTD_SUB_CONTRATO IS NULL";
        } else if (this.getVtdSubContrato() != null) {
            conditions += " AND VTD_SUB_CONTRATO = ?";
            values.add(this.getVtdSubContrato());
        }

        if (this.getVtdCveTipoMerca() != null && this.getVtdCveTipoMerca().longValue() == -999) {
            conditions += " AND VTD_CVE_TIPO_MERCA IS NULL";
        } else if (this.getVtdCveTipoMerca() != null) {
            conditions += " AND VTD_CVE_TIPO_MERCA = ?";
            values.add(this.getVtdCveTipoMerca());
        }

        if (this.getVtdNumInstrume() != null && this.getVtdNumInstrume().longValue() == -999) {
            conditions += " AND VTD_NUM_INSTRUME IS NULL";
        } else if (this.getVtdNumInstrume() != null) {
            conditions += " AND VTD_NUM_INSTRUME = ?";
            values.add(this.getVtdNumInstrume());
        }

        if (this.getVtdNumSecEmis() != null && this.getVtdNumSecEmis().longValue() == -999) {
            conditions += " AND VTD_NUM_SEC_EMIS IS NULL";
        } else if (this.getVtdNumSecEmis() != null) {
            conditions += " AND VTD_NUM_SEC_EMIS = ?";
            values.add(this.getVtdNumSecEmis());
        }

        if (this.getVtdCveFormaNego() != null && "null".equals(this.getVtdCveFormaNego())) {
            conditions += " AND VTD_CVE_FORMA_NEGO IS NULL";
        } else if (this.getVtdCveFormaNego() != null) {
            conditions += " AND VTD_CVE_FORMA_NEGO = ?";
            values.add(this.getVtdCveFormaNego());
        }

        if (this.getVtdNomPizarra() != null && "null".equals(this.getVtdNomPizarra())) {
            conditions += " AND VTD_NOM_PIZARRA IS NULL";
        } else if (this.getVtdNomPizarra() != null) {
            conditions += " AND VTD_NOM_PIZARRA = ?";
            values.add(this.getVtdNomPizarra());
        }

        if (this.getVtdSerieEmision() != null && "null".equals(this.getVtdSerieEmision())) {
            conditions += " AND VTD_SERIE_EMISION IS NULL";
        } else if (this.getVtdSerieEmision() != null) {
            conditions += " AND VTD_SERIE_EMISION = ?";
            values.add(this.getVtdSerieEmision());
        }

        if (this.getVtdNumCuponVig() != null && this.getVtdNumCuponVig().longValue() == -999) {
            conditions += " AND VTD_NUM_CUPON_VIG IS NULL";
        } else if (this.getVtdNumCuponVig() != null) {
            conditions += " AND VTD_NUM_CUPON_VIG = ?";
            values.add(this.getVtdNumCuponVig());
        }

        if (this.getVtdTitRequerido() != null && this.getVtdTitRequerido().longValue() == -999) {
            conditions += " AND VTD_TIT_REQUERIDO IS NULL";
        } else if (this.getVtdTitRequerido() != null) {
            conditions += " AND VTD_TIT_REQUERIDO = ?";
            values.add(this.getVtdTitRequerido());
        }

        if (this.getVtdTitVendidos() != null && this.getVtdTitVendidos().longValue() == -999) {
            conditions += " AND VTD_TIT_VENDIDOS IS NULL";
        } else if (this.getVtdTitVendidos() != null) {
            conditions += " AND VTD_TIT_VENDIDOS = ?";
            values.add(this.getVtdTitVendidos());
        }

        if (this.getVtdTitDisponible() != null && this.getVtdTitDisponible().longValue() == -999) {
            conditions += " AND VTD_TIT_DISPONIBLE IS NULL";
        } else if (this.getVtdTitDisponible() != null) {
            conditions += " AND VTD_TIT_DISPONIBLE = ?";
            values.add(this.getVtdTitDisponible());
        }

        if (this.getVtdPrecioCierre() != null && this.getVtdPrecioCierre().longValue() == -999) {
            conditions += " AND VTD_PRECIO_CIERRE IS NULL";
        } else if (this.getVtdPrecioCierre() != null) {
            conditions += " AND VTD_PRECIO_CIERRE = ?";
            values.add(this.getVtdPrecioCierre());
        }

        if (this.getVtdFolioOperacio() != null && this.getVtdFolioOperacio().longValue() == -999) {
            conditions += " AND VTD_FOLIO_OPERACIO IS NULL";
        } else if (this.getVtdFolioOperacio() != null) {
            conditions += " AND VTD_FOLIO_OPERACIO = ?";
            values.add(this.getVtdFolioOperacio());
        }

        if (this.getVtdCveStVentadi() != null && "null".equals(this.getVtdCveStVentadi())) {
            conditions += " AND VTD_CVE_ST_VENTADI IS NULL";
        } else if (this.getVtdCveStVentadi() != null) {
            conditions += " AND VTD_CVE_ST_VENTADI = ?";
            values.add(this.getVtdCveStVentadi());
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
        String sql = "UPDATE VENTADIR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND VTD_NUM_CORTE = ?";
        pkValues.add(this.getVtdNumCorte());
        conditions += " AND VTD_NUM_CONTRATO = ?";
        pkValues.add(this.getVtdNumContrato());
        conditions += " AND VTD_SUB_CONTRATO = ?";
        pkValues.add(this.getVtdSubContrato());
        conditions += " AND VTD_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getVtdCveTipoMerca());
        conditions += " AND VTD_NUM_INSTRUME = ?";
        pkValues.add(this.getVtdNumInstrume());
        conditions += " AND VTD_NUM_SEC_EMIS = ?";
        pkValues.add(this.getVtdNumSecEmis());
        fields += " VTD_CVE_FORMA_NEGO = ?, ";
        values.add(this.getVtdCveFormaNego());
        fields += " VTD_NOM_PIZARRA = ?, ";
        values.add(this.getVtdNomPizarra());
        fields += " VTD_SERIE_EMISION = ?, ";
        values.add(this.getVtdSerieEmision());
        fields += " VTD_NUM_CUPON_VIG = ?, ";
        values.add(this.getVtdNumCuponVig());
        fields += " VTD_TIT_REQUERIDO = ?, ";
        values.add(this.getVtdTitRequerido());
        fields += " VTD_TIT_VENDIDOS = ?, ";
        values.add(this.getVtdTitVendidos());
        fields += " VTD_TIT_DISPONIBLE = ?, ";
        values.add(this.getVtdTitDisponible());
        fields += " VTD_PRECIO_CIERRE = ?, ";
        values.add(this.getVtdPrecioCierre());
        fields += " VTD_FOLIO_OPERACIO = ?, ";
        values.add(this.getVtdFolioOperacio());
        fields += " VTD_CVE_ST_VENTADI = ?, ";
        values.add(this.getVtdCveStVentadi());
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
        String sql = "INSERT INTO VENTADIR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", VTD_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getVtdNumCorte());

        fields += ", VTD_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getVtdNumContrato());

        fields += ", VTD_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getVtdSubContrato());

        fields += ", VTD_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getVtdCveTipoMerca());

        fields += ", VTD_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getVtdNumInstrume());

        fields += ", VTD_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getVtdNumSecEmis());

        fields += ", VTD_CVE_FORMA_NEGO";
        fieldValues += ", ?";
        values.add(this.getVtdCveFormaNego());

        fields += ", VTD_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getVtdNomPizarra());

        fields += ", VTD_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getVtdSerieEmision());

        fields += ", VTD_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getVtdNumCuponVig());

        fields += ", VTD_TIT_REQUERIDO";
        fieldValues += ", ?";
        values.add(this.getVtdTitRequerido());

        fields += ", VTD_TIT_VENDIDOS";
        fieldValues += ", ?";
        values.add(this.getVtdTitVendidos());

        fields += ", VTD_TIT_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getVtdTitDisponible());

        fields += ", VTD_PRECIO_CIERRE";
        fieldValues += ", ?";
        values.add(this.getVtdPrecioCierre());

        fields += ", VTD_FOLIO_OPERACIO";
        fieldValues += ", ?";
        values.add(this.getVtdFolioOperacio());

        fields += ", VTD_CVE_ST_VENTADI";
        fieldValues += ", ?";
        values.add(this.getVtdCveStVentadi());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM VENTADIR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND VTD_NUM_CORTE = ?";
        values.add(this.getVtdNumCorte());
        conditions += " AND VTD_NUM_CONTRATO = ?";
        values.add(this.getVtdNumContrato());
        conditions += " AND VTD_SUB_CONTRATO = ?";
        values.add(this.getVtdSubContrato());
        conditions += " AND VTD_CVE_TIPO_MERCA = ?";
        values.add(this.getVtdCveTipoMerca());
        conditions += " AND VTD_NUM_INSTRUME = ?";
        values.add(this.getVtdNumInstrume());
        conditions += " AND VTD_NUM_SEC_EMIS = ?";
        values.add(this.getVtdNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ventadir instance = (Ventadir) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getVtdNumCorte().equals(instance.getVtdNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getVtdNumContrato().equals(instance.getVtdNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getVtdSubContrato().equals(instance.getVtdSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getVtdCveTipoMerca().equals(instance.getVtdCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getVtdNumInstrume().equals(instance.getVtdNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getVtdNumSecEmis().equals(instance.getVtdNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getVtdCveFormaNego().equals(instance.getVtdCveFormaNego()))
            equalObjects = false;
        if (equalObjects && !this.getVtdNomPizarra().equals(instance.getVtdNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getVtdSerieEmision().equals(instance.getVtdSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getVtdNumCuponVig().equals(instance.getVtdNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getVtdTitRequerido().equals(instance.getVtdTitRequerido()))
            equalObjects = false;
        if (equalObjects && !this.getVtdTitVendidos().equals(instance.getVtdTitVendidos()))
            equalObjects = false;
        if (equalObjects && !this.getVtdTitDisponible().equals(instance.getVtdTitDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getVtdPrecioCierre().equals(instance.getVtdPrecioCierre()))
            equalObjects = false;
        if (equalObjects && !this.getVtdFolioOperacio().equals(instance.getVtdFolioOperacio()))
            equalObjects = false;
        if (equalObjects && !this.getVtdCveStVentadi().equals(instance.getVtdCveStVentadi()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ventadir result = new Ventadir();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setVtdNumCorte((BigDecimal) objectData.getData("VTD_NUM_CORTE"));
        result.setVtdNumContrato((BigDecimal) objectData.getData("VTD_NUM_CONTRATO"));
        result.setVtdSubContrato((BigDecimal) objectData.getData("VTD_SUB_CONTRATO"));
        result.setVtdCveTipoMerca((BigDecimal) objectData.getData("VTD_CVE_TIPO_MERCA"));
        result.setVtdNumInstrume((BigDecimal) objectData.getData("VTD_NUM_INSTRUME"));
        result.setVtdNumSecEmis((BigDecimal) objectData.getData("VTD_NUM_SEC_EMIS"));
        result.setVtdCveFormaNego((String) objectData.getData("VTD_CVE_FORMA_NEGO"));
        result.setVtdNomPizarra((String) objectData.getData("VTD_NOM_PIZARRA"));
        result.setVtdSerieEmision((String) objectData.getData("VTD_SERIE_EMISION"));
        result.setVtdNumCuponVig((BigDecimal) objectData.getData("VTD_NUM_CUPON_VIG"));
        result.setVtdTitRequerido((BigDecimal) objectData.getData("VTD_TIT_REQUERIDO"));
        result.setVtdTitVendidos((BigDecimal) objectData.getData("VTD_TIT_VENDIDOS"));
        result.setVtdTitDisponible((BigDecimal) objectData.getData("VTD_TIT_DISPONIBLE"));
        result.setVtdPrecioCierre((BigDecimal) objectData.getData("VTD_PRECIO_CIERRE"));
        result.setVtdFolioOperacio((BigDecimal) objectData.getData("VTD_FOLIO_OPERACIO"));
        result.setVtdCveStVentadi((String) objectData.getData("VTD_CVE_ST_VENTADI"));

        return result;

    }

}
