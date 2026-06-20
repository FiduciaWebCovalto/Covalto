package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FACTURA_PK", columns = { "FAC_NUM_CONTRATO", "FAC_SEC_FACTURA", "FAC_NUM_FACTURA" }, sequences = { "MANUAL" })
public class Factura extends DomainObject {

    BigDecimal facNumContrato = null;
    BigDecimal facSecFactura = null;
    String facNumFactura = null;
    String facNumFacNuevo = null;
    String facNombre = null;
    String facDomicilio = null;
    String facRfc = null;
    String facConcepto = null;
    BigDecimal facNumMoneda = null;
    BigDecimal facImpConcepto = null;
    BigDecimal facImpIva = null;
    String facPerDel = null;
    String facPerAl = null;
    String facFechaFactura = null;
    BigDecimal facFolioOpera = null;
    String facObservaciones = null;
    String facFechaAltaReg = null;
    String facFechaUltMod = null;
    String facStFactura = null;
    String facMotivo = null;

    public Factura() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacNumContrato(BigDecimal facNumContrato) {
        this.facNumContrato = facNumContrato;
    }

    public BigDecimal getFacNumContrato() {
        return this.facNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacSecFactura(BigDecimal facSecFactura) {
        this.facSecFactura = facSecFactura;
    }

    public BigDecimal getFacSecFactura() {
        return this.facSecFactura;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacNumFactura(String facNumFactura) {
        this.facNumFactura = facNumFactura;
    }

    public String getFacNumFactura() {
        return this.facNumFactura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacNumFacNuevo(String facNumFacNuevo) {
        this.facNumFacNuevo = facNumFacNuevo;
    }

    public String getFacNumFacNuevo() {
        return this.facNumFacNuevo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacNombre(String facNombre) {
        this.facNombre = facNombre;
    }

    public String getFacNombre() {
        return this.facNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacDomicilio(String facDomicilio) {
        this.facDomicilio = facDomicilio;
    }

    public String getFacDomicilio() {
        return this.facDomicilio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacRfc(String facRfc) {
        this.facRfc = facRfc;
    }

    public String getFacRfc() {
        return this.facRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacConcepto(String facConcepto) {
        this.facConcepto = facConcepto;
    }

    public String getFacConcepto() {
        return this.facConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacNumMoneda(BigDecimal facNumMoneda) {
        this.facNumMoneda = facNumMoneda;
    }

    public BigDecimal getFacNumMoneda() {
        return this.facNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFacImpConcepto(BigDecimal facImpConcepto) {
        this.facImpConcepto = facImpConcepto;
    }

    public BigDecimal getFacImpConcepto() {
        return this.facImpConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFacImpIva(BigDecimal facImpIva) {
        this.facImpIva = facImpIva;
    }

    public BigDecimal getFacImpIva() {
        return this.facImpIva;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFacPerDel(String facPerDel) {
        this.facPerDel = facPerDel;
    }

    public String getFacPerDel() {
        return this.facPerDel;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFacPerAl(String facPerAl) {
        this.facPerAl = facPerAl;
    }

    public String getFacPerAl() {
        return this.facPerAl;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFacFechaFactura(String facFechaFactura) {
        this.facFechaFactura = facFechaFactura;
    }

    public String getFacFechaFactura() {
        return this.facFechaFactura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacFolioOpera(BigDecimal facFolioOpera) {
        this.facFolioOpera = facFolioOpera;
    }

    public BigDecimal getFacFolioOpera() {
        return this.facFolioOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacObservaciones(String facObservaciones) {
        this.facObservaciones = facObservaciones;
    }

    public String getFacObservaciones() {
        return this.facObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFacFechaAltaReg(String facFechaAltaReg) {
        this.facFechaAltaReg = facFechaAltaReg;
    }

    public String getFacFechaAltaReg() {
        return this.facFechaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFacFechaUltMod(String facFechaUltMod) {
        this.facFechaUltMod = facFechaUltMod;
    }

    public String getFacFechaUltMod() {
        return this.facFechaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacStFactura(String facStFactura) {
        this.facStFactura = facStFactura;
    }

    public String getFacStFactura() {
        return this.facStFactura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacMotivo(String facMotivo) {
        this.facMotivo = facMotivo;
    }

    public String getFacMotivo() {
        return this.facMotivo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FACTURA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacNumContrato() != null && this.getFacNumContrato().longValue() == -999) {
            conditions += " AND FAC_NUM_CONTRATO IS NULL";
        } else if (this.getFacNumContrato() != null) {
            conditions += " AND FAC_NUM_CONTRATO = ?";
            values.add(this.getFacNumContrato());
        }

        if (this.getFacSecFactura() != null && this.getFacSecFactura().longValue() == -999) {
            conditions += " AND FAC_SEC_FACTURA IS NULL";
        } else if (this.getFacSecFactura() != null) {
            conditions += " AND FAC_SEC_FACTURA = ?";
            values.add(this.getFacSecFactura());
        }

        if (this.getFacNumFactura() != null && "null".equals(this.getFacNumFactura())) {
            conditions += " AND FAC_NUM_FACTURA IS NULL";
        } else if (this.getFacNumFactura() != null) {
            conditions += " AND FAC_NUM_FACTURA = ?";
            values.add(this.getFacNumFactura());
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
        String sql = "SELECT * FROM FACTURA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacNumContrato() != null && this.getFacNumContrato().longValue() == -999) {
            conditions += " AND FAC_NUM_CONTRATO IS NULL";
        } else if (this.getFacNumContrato() != null) {
            conditions += " AND FAC_NUM_CONTRATO = ?";
            values.add(this.getFacNumContrato());
        }

        if (this.getFacSecFactura() != null && this.getFacSecFactura().longValue() == -999) {
            conditions += " AND FAC_SEC_FACTURA IS NULL";
        } else if (this.getFacSecFactura() != null) {
            conditions += " AND FAC_SEC_FACTURA = ?";
            values.add(this.getFacSecFactura());
        }

        if (this.getFacNumFactura() != null && "null".equals(this.getFacNumFactura())) {
            conditions += " AND FAC_NUM_FACTURA IS NULL";
        } else if (this.getFacNumFactura() != null) {
            conditions += " AND FAC_NUM_FACTURA = ?";
            values.add(this.getFacNumFactura());
        }

        if (this.getFacNumFacNuevo() != null && "null".equals(this.getFacNumFacNuevo())) {
            conditions += " AND FAC_NUM_FAC_NUEVO IS NULL";
        } else if (this.getFacNumFacNuevo() != null) {
            conditions += " AND FAC_NUM_FAC_NUEVO = ?";
            values.add(this.getFacNumFacNuevo());
        }

        if (this.getFacNombre() != null && "null".equals(this.getFacNombre())) {
            conditions += " AND FAC_NOMBRE IS NULL";
        } else if (this.getFacNombre() != null) {
            conditions += " AND FAC_NOMBRE = ?";
            values.add(this.getFacNombre());
        }

        if (this.getFacDomicilio() != null && "null".equals(this.getFacDomicilio())) {
            conditions += " AND FAC_DOMICILIO IS NULL";
        } else if (this.getFacDomicilio() != null) {
            conditions += " AND FAC_DOMICILIO = ?";
            values.add(this.getFacDomicilio());
        }

        if (this.getFacRfc() != null && "null".equals(this.getFacRfc())) {
            conditions += " AND FAC_RFC IS NULL";
        } else if (this.getFacRfc() != null) {
            conditions += " AND FAC_RFC = ?";
            values.add(this.getFacRfc());
        }

        if (this.getFacConcepto() != null && "null".equals(this.getFacConcepto())) {
            conditions += " AND FAC_CONCEPTO IS NULL";
        } else if (this.getFacConcepto() != null) {
            conditions += " AND FAC_CONCEPTO = ?";
            values.add(this.getFacConcepto());
        }

        if (this.getFacNumMoneda() != null && this.getFacNumMoneda().longValue() == -999) {
            conditions += " AND FAC_NUM_MONEDA IS NULL";
        } else if (this.getFacNumMoneda() != null) {
            conditions += " AND FAC_NUM_MONEDA = ?";
            values.add(this.getFacNumMoneda());
        }

        if (this.getFacImpConcepto() != null && this.getFacImpConcepto().longValue() == -999) {
            conditions += " AND FAC_IMP_CONCEPTO IS NULL";
        } else if (this.getFacImpConcepto() != null) {
            conditions += " AND FAC_IMP_CONCEPTO = ?";
            values.add(this.getFacImpConcepto());
        }

        if (this.getFacImpIva() != null && this.getFacImpIva().longValue() == -999) {
            conditions += " AND FAC_IMP_IVA IS NULL";
        } else if (this.getFacImpIva() != null) {
            conditions += " AND FAC_IMP_IVA = ?";
            values.add(this.getFacImpIva());
        }

        if (this.getFacPerDel() != null && "null".equals(this.getFacPerDel())) {
            conditions += " AND FAC_PER_DEL IS NULL";
        } else if (this.getFacPerDel() != null) {
            conditions += " AND FAC_PER_DEL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFacPerDel());
        }

        if (this.getFacPerAl() != null && "null".equals(this.getFacPerAl())) {
            conditions += " AND FAC_PER_AL IS NULL";
        } else if (this.getFacPerAl() != null) {
            conditions += " AND FAC_PER_AL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFacPerAl());
        }

        if (this.getFacFechaFactura() != null && "null".equals(this.getFacFechaFactura())) {
            conditions += " AND FAC_FECHA_FACTURA IS NULL";
        } else if (this.getFacFechaFactura() != null) {
            conditions += " AND FAC_FECHA_FACTURA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFacFechaFactura());
        }

        if (this.getFacFolioOpera() != null && this.getFacFolioOpera().longValue() == -999) {
            conditions += " AND FAC_FOLIO_OPERA IS NULL";
        } else if (this.getFacFolioOpera() != null) {
            conditions += " AND FAC_FOLIO_OPERA = ?";
            values.add(this.getFacFolioOpera());
        }

        if (this.getFacObservaciones() != null && "null".equals(this.getFacObservaciones())) {
            conditions += " AND FAC_OBSERVACIONES IS NULL";
        } else if (this.getFacObservaciones() != null) {
            conditions += " AND FAC_OBSERVACIONES = ?";
            values.add(this.getFacObservaciones());
        }

        if (this.getFacFechaAltaReg() != null && "null".equals(this.getFacFechaAltaReg())) {
            conditions += " AND FAC_FECHA_ALTA_REG IS NULL";
        } else if (this.getFacFechaAltaReg() != null) {
            conditions += " AND FAC_FECHA_ALTA_REG = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFacFechaAltaReg());
        }

        if (this.getFacFechaUltMod() != null && "null".equals(this.getFacFechaUltMod())) {
            conditions += " AND FAC_FECHA_ULT_MOD IS NULL";
        } else if (this.getFacFechaUltMod() != null) {
            conditions += " AND FAC_FECHA_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFacFechaUltMod());
        }

        if (this.getFacStFactura() != null && "null".equals(this.getFacStFactura())) {
            conditions += " AND FAC_ST_FACTURA IS NULL";
        } else if (this.getFacStFactura() != null) {
            conditions += " AND FAC_ST_FACTURA = ?";
            values.add(this.getFacStFactura());
        }

        if (this.getFacMotivo() != null && "null".equals(this.getFacMotivo())) {
            conditions += " AND FAC_MOTIVO IS NULL";
        } else if (this.getFacMotivo() != null) {
            conditions += " AND FAC_MOTIVO = ?";
            values.add(this.getFacMotivo());
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
        String sql = "UPDATE FACTURA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FAC_NUM_CONTRATO = ?";
        pkValues.add(this.getFacNumContrato());
        conditions += " AND FAC_SEC_FACTURA = ?";
        pkValues.add(this.getFacSecFactura());
        conditions += " AND FAC_NUM_FACTURA = ?";
        pkValues.add(this.getFacNumFactura());
        fields += " FAC_NUM_FAC_NUEVO = ?, ";
        values.add(this.getFacNumFacNuevo());
        fields += " FAC_NOMBRE = ?, ";
        values.add(this.getFacNombre());
        fields += " FAC_DOMICILIO = ?, ";
        values.add(this.getFacDomicilio());
        fields += " FAC_RFC = ?, ";
        values.add(this.getFacRfc());
        fields += " FAC_CONCEPTO = ?, ";
        values.add(this.getFacConcepto());
        fields += " FAC_NUM_MONEDA = ?, ";
        values.add(this.getFacNumMoneda());
        fields += " FAC_IMP_CONCEPTO = ?, ";
        values.add(this.getFacImpConcepto());
        fields += " FAC_IMP_IVA = ?, ";
        values.add(this.getFacImpIva());
        fields += " FAC_PER_DEL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFacPerDel());
        fields += " FAC_PER_AL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFacPerAl());
        fields += " FAC_FECHA_FACTURA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFacFechaFactura());
        fields += " FAC_FOLIO_OPERA = ?, ";
        values.add(this.getFacFolioOpera());
        fields += " FAC_OBSERVACIONES = ?, ";
        values.add(this.getFacObservaciones());
        fields += " FAC_FECHA_ALTA_REG = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFacFechaAltaReg());
        fields += " FAC_FECHA_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFacFechaUltMod());
        fields += " FAC_ST_FACTURA = ?, ";
        values.add(this.getFacStFactura());
        fields += " FAC_MOTIVO = ?, ";
        values.add(this.getFacMotivo());
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
        String sql = "INSERT INTO FACTURA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FAC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFacNumContrato());

        fields += ", FAC_SEC_FACTURA";
        fieldValues += ", ?";
        values.add(this.getFacSecFactura());

        fields += ", FAC_NUM_FACTURA";
        fieldValues += ", ?";
        values.add(this.getFacNumFactura());

        fields += ", FAC_NUM_FAC_NUEVO";
        fieldValues += ", ?";
        values.add(this.getFacNumFacNuevo());

        fields += ", FAC_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFacNombre());

        fields += ", FAC_DOMICILIO";
        fieldValues += ", ?";
        values.add(this.getFacDomicilio());

        fields += ", FAC_RFC";
        fieldValues += ", ?";
        values.add(this.getFacRfc());

        fields += ", FAC_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getFacConcepto());

        fields += ", FAC_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFacNumMoneda());

        fields += ", FAC_IMP_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getFacImpConcepto());

        fields += ", FAC_IMP_IVA";
        fieldValues += ", ?";
        values.add(this.getFacImpIva());

        fields += ", FAC_PER_DEL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFacPerDel());

        fields += ", FAC_PER_AL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFacPerAl());

        fields += ", FAC_FECHA_FACTURA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFacFechaFactura());

        fields += ", FAC_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getFacFolioOpera());

        fields += ", FAC_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getFacObservaciones());

        fields += ", FAC_FECHA_ALTA_REG";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFacFechaAltaReg());

        fields += ", FAC_FECHA_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFacFechaUltMod());

        fields += ", FAC_ST_FACTURA";
        fieldValues += ", ?";
        values.add(this.getFacStFactura());

        fields += ", FAC_MOTIVO";
        fieldValues += ", ?";
        values.add(this.getFacMotivo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FACTURA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FAC_NUM_CONTRATO = ?";
        values.add(this.getFacNumContrato());
        conditions += " AND FAC_SEC_FACTURA = ?";
        values.add(this.getFacSecFactura());
        conditions += " AND FAC_NUM_FACTURA = ?";
        values.add(this.getFacNumFactura());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Factura instance = (Factura) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFacNumContrato().equals(instance.getFacNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFacSecFactura().equals(instance.getFacSecFactura()))
            equalObjects = false;
        if (equalObjects && !this.getFacNumFactura().equals(instance.getFacNumFactura()))
            equalObjects = false;
        if (equalObjects && !this.getFacNumFacNuevo().equals(instance.getFacNumFacNuevo()))
            equalObjects = false;
        if (equalObjects && !this.getFacNombre().equals(instance.getFacNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFacDomicilio().equals(instance.getFacDomicilio()))
            equalObjects = false;
        if (equalObjects && !this.getFacRfc().equals(instance.getFacRfc()))
            equalObjects = false;
        if (equalObjects && !this.getFacConcepto().equals(instance.getFacConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getFacNumMoneda().equals(instance.getFacNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFacImpConcepto().equals(instance.getFacImpConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getFacImpIva().equals(instance.getFacImpIva()))
            equalObjects = false;
        if (equalObjects && !this.getFacPerDel().equals(instance.getFacPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getFacPerAl().equals(instance.getFacPerAl()))
            equalObjects = false;
        if (equalObjects && !this.getFacFechaFactura().equals(instance.getFacFechaFactura()))
            equalObjects = false;
        if (equalObjects && !this.getFacFolioOpera().equals(instance.getFacFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getFacObservaciones().equals(instance.getFacObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getFacFechaAltaReg().equals(instance.getFacFechaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFacFechaUltMod().equals(instance.getFacFechaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFacStFactura().equals(instance.getFacStFactura()))
            equalObjects = false;
        if (equalObjects && !this.getFacMotivo().equals(instance.getFacMotivo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Factura result = new Factura();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFacNumContrato((BigDecimal) objectData.getData("FAC_NUM_CONTRATO"));
        result.setFacSecFactura((BigDecimal) objectData.getData("FAC_SEC_FACTURA"));
        result.setFacNumFactura((String) objectData.getData("FAC_NUM_FACTURA"));
        result.setFacNumFacNuevo((String) objectData.getData("FAC_NUM_FAC_NUEVO"));
        result.setFacNombre((String) objectData.getData("FAC_NOMBRE"));
        result.setFacDomicilio((String) objectData.getData("FAC_DOMICILIO"));
        result.setFacRfc((String) objectData.getData("FAC_RFC"));
        result.setFacConcepto((String) objectData.getData("FAC_CONCEPTO"));
        result.setFacNumMoneda((BigDecimal) objectData.getData("FAC_NUM_MONEDA"));
        result.setFacImpConcepto((BigDecimal) objectData.getData("FAC_IMP_CONCEPTO"));
        result.setFacImpIva((BigDecimal) objectData.getData("FAC_IMP_IVA"));
        result.setFacPerDel((String) objectData.getData("FAC_PER_DEL"));
        result.setFacPerAl((String) objectData.getData("FAC_PER_AL"));
        result.setFacFechaFactura((String) objectData.getData("FAC_FECHA_FACTURA"));
        result.setFacFolioOpera((BigDecimal) objectData.getData("FAC_FOLIO_OPERA"));
        result.setFacObservaciones((String) objectData.getData("FAC_OBSERVACIONES"));
        result.setFacFechaAltaReg((String) objectData.getData("FAC_FECHA_ALTA_REG"));
        result.setFacFechaUltMod((String) objectData.getData("FAC_FECHA_ULT_MOD"));
        result.setFacStFactura((String) objectData.getData("FAC_ST_FACTURA"));
        result.setFacMotivo((String) objectData.getData("FAC_MOTIVO"));

        return result;

    }

}
