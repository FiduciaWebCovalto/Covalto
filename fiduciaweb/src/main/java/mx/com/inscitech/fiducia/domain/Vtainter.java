package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "VTAINTER_PK", columns = { "VTA_ENTIDAD_FIN", "VTA_NUM_CORTE", "VTA_CONTRATO_INTER", "VTA_CVE_TIPO_MERCA", "VTA_NUM_INSTRUME", "VTA_NUM_SEC_EMIS" },
            sequences = { "MANUAL" })
public class Vtainter extends DomainObject {

    BigDecimal vtaNumCorte = null;
    BigDecimal vtaEntidadFin = null;
    BigDecimal vtaContratoInter = null;
    BigDecimal vtaCveTipoMerca = null;
    BigDecimal vtaNumInstrume = null;
    BigDecimal vtaNumSecEmis = null;
    String vtaNomPizarra = null;
    String vtaSerieEmision = null;
    BigDecimal vtaNumCuponVig = null;
    String vtaCveFormaNego = null;
    BigDecimal vtaNumTitVenta = null;
    BigDecimal vtaNumTitAsig = null;
    BigDecimal vtaNumTitDisp = null;
    BigDecimal vtaImpTitVenta = null;
    BigDecimal vtaImpPrecioTit = null;
    BigDecimal vtaTasaPactada = null;
    String vtaHoraCorte = null;
    String vtaCveStVtainte = null;

    public Vtainter() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaNumCorte(BigDecimal vtaNumCorte) {
        this.vtaNumCorte = vtaNumCorte;
    }

    public BigDecimal getVtaNumCorte() {
        return this.vtaNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaEntidadFin(BigDecimal vtaEntidadFin) {
        this.vtaEntidadFin = vtaEntidadFin;
    }

    public BigDecimal getVtaEntidadFin() {
        return this.vtaEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaContratoInter(BigDecimal vtaContratoInter) {
        this.vtaContratoInter = vtaContratoInter;
    }

    public BigDecimal getVtaContratoInter() {
        return this.vtaContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaCveTipoMerca(BigDecimal vtaCveTipoMerca) {
        this.vtaCveTipoMerca = vtaCveTipoMerca;
    }

    public BigDecimal getVtaCveTipoMerca() {
        return this.vtaCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaNumInstrume(BigDecimal vtaNumInstrume) {
        this.vtaNumInstrume = vtaNumInstrume;
    }

    public BigDecimal getVtaNumInstrume() {
        return this.vtaNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaNumSecEmis(BigDecimal vtaNumSecEmis) {
        this.vtaNumSecEmis = vtaNumSecEmis;
    }

    public BigDecimal getVtaNumSecEmis() {
        return this.vtaNumSecEmis;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtaNomPizarra(String vtaNomPizarra) {
        this.vtaNomPizarra = vtaNomPizarra;
    }

    public String getVtaNomPizarra() {
        return this.vtaNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtaSerieEmision(String vtaSerieEmision) {
        this.vtaSerieEmision = vtaSerieEmision;
    }

    public String getVtaSerieEmision() {
        return this.vtaSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaNumCuponVig(BigDecimal vtaNumCuponVig) {
        this.vtaNumCuponVig = vtaNumCuponVig;
    }

    public BigDecimal getVtaNumCuponVig() {
        return this.vtaNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtaCveFormaNego(String vtaCveFormaNego) {
        this.vtaCveFormaNego = vtaCveFormaNego;
    }

    public String getVtaCveFormaNego() {
        return this.vtaCveFormaNego;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaNumTitVenta(BigDecimal vtaNumTitVenta) {
        this.vtaNumTitVenta = vtaNumTitVenta;
    }

    public BigDecimal getVtaNumTitVenta() {
        return this.vtaNumTitVenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaNumTitAsig(BigDecimal vtaNumTitAsig) {
        this.vtaNumTitAsig = vtaNumTitAsig;
    }

    public BigDecimal getVtaNumTitAsig() {
        return this.vtaNumTitAsig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVtaNumTitDisp(BigDecimal vtaNumTitDisp) {
        this.vtaNumTitDisp = vtaNumTitDisp;
    }

    public BigDecimal getVtaNumTitDisp() {
        return this.vtaNumTitDisp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVtaImpTitVenta(BigDecimal vtaImpTitVenta) {
        this.vtaImpTitVenta = vtaImpTitVenta;
    }

    public BigDecimal getVtaImpTitVenta() {
        return this.vtaImpTitVenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setVtaImpPrecioTit(BigDecimal vtaImpPrecioTit) {
        this.vtaImpPrecioTit = vtaImpPrecioTit;
    }

    public BigDecimal getVtaImpPrecioTit() {
        return this.vtaImpPrecioTit;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setVtaTasaPactada(BigDecimal vtaTasaPactada) {
        this.vtaTasaPactada = vtaTasaPactada;
    }

    public BigDecimal getVtaTasaPactada() {
        return this.vtaTasaPactada;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtaHoraCorte(String vtaHoraCorte) {
        this.vtaHoraCorte = vtaHoraCorte;
    }

    public String getVtaHoraCorte() {
        return this.vtaHoraCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVtaCveStVtainte(String vtaCveStVtainte) {
        this.vtaCveStVtainte = vtaCveStVtainte;
    }

    public String getVtaCveStVtainte() {
        return this.vtaCveStVtainte;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM VTAINTER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVtaNumCorte() != null && this.getVtaNumCorte().longValue() == -999) {
            conditions += " AND VTA_NUM_CORTE IS NULL";
        } else if (this.getVtaNumCorte() != null) {
            conditions += " AND VTA_NUM_CORTE = ?";
            values.add(this.getVtaNumCorte());
        }

        if (this.getVtaEntidadFin() != null && this.getVtaEntidadFin().longValue() == -999) {
            conditions += " AND VTA_ENTIDAD_FIN IS NULL";
        } else if (this.getVtaEntidadFin() != null) {
            conditions += " AND VTA_ENTIDAD_FIN = ?";
            values.add(this.getVtaEntidadFin());
        }

        if (this.getVtaContratoInter() != null && this.getVtaContratoInter().longValue() == -999) {
            conditions += " AND VTA_CONTRATO_INTER IS NULL";
        } else if (this.getVtaContratoInter() != null) {
            conditions += " AND VTA_CONTRATO_INTER = ?";
            values.add(this.getVtaContratoInter());
        }

        if (this.getVtaCveTipoMerca() != null && this.getVtaCveTipoMerca().longValue() == -999) {
            conditions += " AND VTA_CVE_TIPO_MERCA IS NULL";
        } else if (this.getVtaCveTipoMerca() != null) {
            conditions += " AND VTA_CVE_TIPO_MERCA = ?";
            values.add(this.getVtaCveTipoMerca());
        }

        if (this.getVtaNumInstrume() != null && this.getVtaNumInstrume().longValue() == -999) {
            conditions += " AND VTA_NUM_INSTRUME IS NULL";
        } else if (this.getVtaNumInstrume() != null) {
            conditions += " AND VTA_NUM_INSTRUME = ?";
            values.add(this.getVtaNumInstrume());
        }

        if (this.getVtaNumSecEmis() != null && this.getVtaNumSecEmis().longValue() == -999) {
            conditions += " AND VTA_NUM_SEC_EMIS IS NULL";
        } else if (this.getVtaNumSecEmis() != null) {
            conditions += " AND VTA_NUM_SEC_EMIS = ?";
            values.add(this.getVtaNumSecEmis());
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
        String sql = "SELECT * FROM VTAINTER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVtaNumCorte() != null && this.getVtaNumCorte().longValue() == -999) {
            conditions += " AND VTA_NUM_CORTE IS NULL";
        } else if (this.getVtaNumCorte() != null) {
            conditions += " AND VTA_NUM_CORTE = ?";
            values.add(this.getVtaNumCorte());
        }

        if (this.getVtaEntidadFin() != null && this.getVtaEntidadFin().longValue() == -999) {
            conditions += " AND VTA_ENTIDAD_FIN IS NULL";
        } else if (this.getVtaEntidadFin() != null) {
            conditions += " AND VTA_ENTIDAD_FIN = ?";
            values.add(this.getVtaEntidadFin());
        }

        if (this.getVtaContratoInter() != null && this.getVtaContratoInter().longValue() == -999) {
            conditions += " AND VTA_CONTRATO_INTER IS NULL";
        } else if (this.getVtaContratoInter() != null) {
            conditions += " AND VTA_CONTRATO_INTER = ?";
            values.add(this.getVtaContratoInter());
        }

        if (this.getVtaCveTipoMerca() != null && this.getVtaCveTipoMerca().longValue() == -999) {
            conditions += " AND VTA_CVE_TIPO_MERCA IS NULL";
        } else if (this.getVtaCveTipoMerca() != null) {
            conditions += " AND VTA_CVE_TIPO_MERCA = ?";
            values.add(this.getVtaCveTipoMerca());
        }

        if (this.getVtaNumInstrume() != null && this.getVtaNumInstrume().longValue() == -999) {
            conditions += " AND VTA_NUM_INSTRUME IS NULL";
        } else if (this.getVtaNumInstrume() != null) {
            conditions += " AND VTA_NUM_INSTRUME = ?";
            values.add(this.getVtaNumInstrume());
        }

        if (this.getVtaNumSecEmis() != null && this.getVtaNumSecEmis().longValue() == -999) {
            conditions += " AND VTA_NUM_SEC_EMIS IS NULL";
        } else if (this.getVtaNumSecEmis() != null) {
            conditions += " AND VTA_NUM_SEC_EMIS = ?";
            values.add(this.getVtaNumSecEmis());
        }

        if (this.getVtaNomPizarra() != null && "null".equals(this.getVtaNomPizarra())) {
            conditions += " AND VTA_NOM_PIZARRA IS NULL";
        } else if (this.getVtaNomPizarra() != null) {
            conditions += " AND VTA_NOM_PIZARRA = ?";
            values.add(this.getVtaNomPizarra());
        }

        if (this.getVtaSerieEmision() != null && "null".equals(this.getVtaSerieEmision())) {
            conditions += " AND VTA_SERIE_EMISION IS NULL";
        } else if (this.getVtaSerieEmision() != null) {
            conditions += " AND VTA_SERIE_EMISION = ?";
            values.add(this.getVtaSerieEmision());
        }

        if (this.getVtaNumCuponVig() != null && this.getVtaNumCuponVig().longValue() == -999) {
            conditions += " AND VTA_NUM_CUPON_VIG IS NULL";
        } else if (this.getVtaNumCuponVig() != null) {
            conditions += " AND VTA_NUM_CUPON_VIG = ?";
            values.add(this.getVtaNumCuponVig());
        }

        if (this.getVtaCveFormaNego() != null && "null".equals(this.getVtaCveFormaNego())) {
            conditions += " AND VTA_CVE_FORMA_NEGO IS NULL";
        } else if (this.getVtaCveFormaNego() != null) {
            conditions += " AND VTA_CVE_FORMA_NEGO = ?";
            values.add(this.getVtaCveFormaNego());
        }

        if (this.getVtaNumTitVenta() != null && this.getVtaNumTitVenta().longValue() == -999) {
            conditions += " AND VTA_NUM_TIT_VENTA IS NULL";
        } else if (this.getVtaNumTitVenta() != null) {
            conditions += " AND VTA_NUM_TIT_VENTA = ?";
            values.add(this.getVtaNumTitVenta());
        }

        if (this.getVtaNumTitAsig() != null && this.getVtaNumTitAsig().longValue() == -999) {
            conditions += " AND VTA_NUM_TIT_ASIG IS NULL";
        } else if (this.getVtaNumTitAsig() != null) {
            conditions += " AND VTA_NUM_TIT_ASIG = ?";
            values.add(this.getVtaNumTitAsig());
        }

        if (this.getVtaNumTitDisp() != null && this.getVtaNumTitDisp().longValue() == -999) {
            conditions += " AND VTA_NUM_TIT_DISP IS NULL";
        } else if (this.getVtaNumTitDisp() != null) {
            conditions += " AND VTA_NUM_TIT_DISP = ?";
            values.add(this.getVtaNumTitDisp());
        }

        if (this.getVtaImpTitVenta() != null && this.getVtaImpTitVenta().longValue() == -999) {
            conditions += " AND VTA_IMP_TIT_VENTA IS NULL";
        } else if (this.getVtaImpTitVenta() != null) {
            conditions += " AND VTA_IMP_TIT_VENTA = ?";
            values.add(this.getVtaImpTitVenta());
        }

        if (this.getVtaImpPrecioTit() != null && this.getVtaImpPrecioTit().longValue() == -999) {
            conditions += " AND VTA_IMP_PRECIO_TIT IS NULL";
        } else if (this.getVtaImpPrecioTit() != null) {
            conditions += " AND VTA_IMP_PRECIO_TIT = ?";
            values.add(this.getVtaImpPrecioTit());
        }

        if (this.getVtaTasaPactada() != null && this.getVtaTasaPactada().longValue() == -999) {
            conditions += " AND VTA_TASA_PACTADA IS NULL";
        } else if (this.getVtaTasaPactada() != null) {
            conditions += " AND VTA_TASA_PACTADA = ?";
            values.add(this.getVtaTasaPactada());
        }

        if (this.getVtaHoraCorte() != null && "null".equals(this.getVtaHoraCorte())) {
            conditions += " AND VTA_HORA_CORTE IS NULL";
        } else if (this.getVtaHoraCorte() != null) {
            conditions += " AND VTA_HORA_CORTE = ?";
            values.add(this.getVtaHoraCorte());
        }

        if (this.getVtaCveStVtainte() != null && "null".equals(this.getVtaCveStVtainte())) {
            conditions += " AND VTA_CVE_ST_VTAINTE IS NULL";
        } else if (this.getVtaCveStVtainte() != null) {
            conditions += " AND VTA_CVE_ST_VTAINTE = ?";
            values.add(this.getVtaCveStVtainte());
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
        String sql = "UPDATE VTAINTER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND VTA_NUM_CORTE = ?";
        pkValues.add(this.getVtaNumCorte());
        conditions += " AND VTA_ENTIDAD_FIN = ?";
        pkValues.add(this.getVtaEntidadFin());
        conditions += " AND VTA_CONTRATO_INTER = ?";
        pkValues.add(this.getVtaContratoInter());
        conditions += " AND VTA_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getVtaCveTipoMerca());
        conditions += " AND VTA_NUM_INSTRUME = ?";
        pkValues.add(this.getVtaNumInstrume());
        conditions += " AND VTA_NUM_SEC_EMIS = ?";
        pkValues.add(this.getVtaNumSecEmis());
        fields += " VTA_NOM_PIZARRA = ?, ";
        values.add(this.getVtaNomPizarra());
        fields += " VTA_SERIE_EMISION = ?, ";
        values.add(this.getVtaSerieEmision());
        fields += " VTA_NUM_CUPON_VIG = ?, ";
        values.add(this.getVtaNumCuponVig());
        fields += " VTA_CVE_FORMA_NEGO = ?, ";
        values.add(this.getVtaCveFormaNego());
        fields += " VTA_NUM_TIT_VENTA = ?, ";
        values.add(this.getVtaNumTitVenta());
        fields += " VTA_NUM_TIT_ASIG = ?, ";
        values.add(this.getVtaNumTitAsig());
        fields += " VTA_NUM_TIT_DISP = ?, ";
        values.add(this.getVtaNumTitDisp());
        fields += " VTA_IMP_TIT_VENTA = ?, ";
        values.add(this.getVtaImpTitVenta());
        fields += " VTA_IMP_PRECIO_TIT = ?, ";
        values.add(this.getVtaImpPrecioTit());
        fields += " VTA_TASA_PACTADA = ?, ";
        values.add(this.getVtaTasaPactada());
        fields += " VTA_HORA_CORTE = ?, ";
        values.add(this.getVtaHoraCorte());
        fields += " VTA_CVE_ST_VTAINTE = ?, ";
        values.add(this.getVtaCveStVtainte());
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
        String sql = "INSERT INTO VTAINTER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", VTA_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getVtaNumCorte());

        fields += ", VTA_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getVtaEntidadFin());

        fields += ", VTA_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getVtaContratoInter());

        fields += ", VTA_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getVtaCveTipoMerca());

        fields += ", VTA_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getVtaNumInstrume());

        fields += ", VTA_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getVtaNumSecEmis());

        fields += ", VTA_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getVtaNomPizarra());

        fields += ", VTA_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getVtaSerieEmision());

        fields += ", VTA_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getVtaNumCuponVig());

        fields += ", VTA_CVE_FORMA_NEGO";
        fieldValues += ", ?";
        values.add(this.getVtaCveFormaNego());

        fields += ", VTA_NUM_TIT_VENTA";
        fieldValues += ", ?";
        values.add(this.getVtaNumTitVenta());

        fields += ", VTA_NUM_TIT_ASIG";
        fieldValues += ", ?";
        values.add(this.getVtaNumTitAsig());

        fields += ", VTA_NUM_TIT_DISP";
        fieldValues += ", ?";
        values.add(this.getVtaNumTitDisp());

        fields += ", VTA_IMP_TIT_VENTA";
        fieldValues += ", ?";
        values.add(this.getVtaImpTitVenta());

        fields += ", VTA_IMP_PRECIO_TIT";
        fieldValues += ", ?";
        values.add(this.getVtaImpPrecioTit());

        fields += ", VTA_TASA_PACTADA";
        fieldValues += ", ?";
        values.add(this.getVtaTasaPactada());

        fields += ", VTA_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getVtaHoraCorte());

        fields += ", VTA_CVE_ST_VTAINTE";
        fieldValues += ", ?";
        values.add(this.getVtaCveStVtainte());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM VTAINTER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND VTA_NUM_CORTE = ?";
        values.add(this.getVtaNumCorte());
        conditions += " AND VTA_ENTIDAD_FIN = ?";
        values.add(this.getVtaEntidadFin());
        conditions += " AND VTA_CONTRATO_INTER = ?";
        values.add(this.getVtaContratoInter());
        conditions += " AND VTA_CVE_TIPO_MERCA = ?";
        values.add(this.getVtaCveTipoMerca());
        conditions += " AND VTA_NUM_INSTRUME = ?";
        values.add(this.getVtaNumInstrume());
        conditions += " AND VTA_NUM_SEC_EMIS = ?";
        values.add(this.getVtaNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Vtainter instance = (Vtainter) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getVtaNumCorte().equals(instance.getVtaNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getVtaEntidadFin().equals(instance.getVtaEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getVtaContratoInter().equals(instance.getVtaContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getVtaCveTipoMerca().equals(instance.getVtaCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getVtaNumInstrume().equals(instance.getVtaNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getVtaNumSecEmis().equals(instance.getVtaNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getVtaNomPizarra().equals(instance.getVtaNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getVtaSerieEmision().equals(instance.getVtaSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getVtaNumCuponVig().equals(instance.getVtaNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getVtaCveFormaNego().equals(instance.getVtaCveFormaNego()))
            equalObjects = false;
        if (equalObjects && !this.getVtaNumTitVenta().equals(instance.getVtaNumTitVenta()))
            equalObjects = false;
        if (equalObjects && !this.getVtaNumTitAsig().equals(instance.getVtaNumTitAsig()))
            equalObjects = false;
        if (equalObjects && !this.getVtaNumTitDisp().equals(instance.getVtaNumTitDisp()))
            equalObjects = false;
        if (equalObjects && !this.getVtaImpTitVenta().equals(instance.getVtaImpTitVenta()))
            equalObjects = false;
        if (equalObjects && !this.getVtaImpPrecioTit().equals(instance.getVtaImpPrecioTit()))
            equalObjects = false;
        if (equalObjects && !this.getVtaTasaPactada().equals(instance.getVtaTasaPactada()))
            equalObjects = false;
        if (equalObjects && !this.getVtaHoraCorte().equals(instance.getVtaHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getVtaCveStVtainte().equals(instance.getVtaCveStVtainte()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Vtainter result = new Vtainter();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setVtaNumCorte((BigDecimal) objectData.getData("VTA_NUM_CORTE"));
        result.setVtaEntidadFin((BigDecimal) objectData.getData("VTA_ENTIDAD_FIN"));
        result.setVtaContratoInter((BigDecimal) objectData.getData("VTA_CONTRATO_INTER"));
        result.setVtaCveTipoMerca((BigDecimal) objectData.getData("VTA_CVE_TIPO_MERCA"));
        result.setVtaNumInstrume((BigDecimal) objectData.getData("VTA_NUM_INSTRUME"));
        result.setVtaNumSecEmis((BigDecimal) objectData.getData("VTA_NUM_SEC_EMIS"));
        result.setVtaNomPizarra((String) objectData.getData("VTA_NOM_PIZARRA"));
        result.setVtaSerieEmision((String) objectData.getData("VTA_SERIE_EMISION"));
        result.setVtaNumCuponVig((BigDecimal) objectData.getData("VTA_NUM_CUPON_VIG"));
        result.setVtaCveFormaNego((String) objectData.getData("VTA_CVE_FORMA_NEGO"));
        result.setVtaNumTitVenta((BigDecimal) objectData.getData("VTA_NUM_TIT_VENTA"));
        result.setVtaNumTitAsig((BigDecimal) objectData.getData("VTA_NUM_TIT_ASIG"));
        result.setVtaNumTitDisp((BigDecimal) objectData.getData("VTA_NUM_TIT_DISP"));
        result.setVtaImpTitVenta((BigDecimal) objectData.getData("VTA_IMP_TIT_VENTA"));
        result.setVtaImpPrecioTit((BigDecimal) objectData.getData("VTA_IMP_PRECIO_TIT"));
        result.setVtaTasaPactada((BigDecimal) objectData.getData("VTA_TASA_PACTADA"));
        result.setVtaHoraCorte((String) objectData.getData("VTA_HORA_CORTE"));
        result.setVtaCveStVtainte((String) objectData.getData("VTA_CVE_ST_VTAINTE"));

        return result;

    }

}
