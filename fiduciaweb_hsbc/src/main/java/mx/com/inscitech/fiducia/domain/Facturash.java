package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FACTURASH_PK", columns = { "FAC_NUM_CONTRATO", "FAC_NUM_FACTURA", "FAC_NUM_FAC_NUEVO", "FAC_ST_FACTURA" }, sequences = { "MANUAL" })
public class Facturash extends DomainObject {

    BigDecimal facNumContrato = null;
    BigDecimal facNumFactura = null;
    BigDecimal facNumFacNuevo = null;
    String facNombre = null;
    String facConcepto = null;
    BigDecimal facImporte = null;
    BigDecimal facImpIva = null;
    BigDecimal facFecAnoFac = null;
    BigDecimal facFecMesFac = null;
    BigDecimal facFecDiaFac = null;
    String facPerDel = null;
    String facPerAl = null;
    String facStFactura = null;

    public Facturash() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacNumContrato(BigDecimal facNumContrato) {
        this.facNumContrato = facNumContrato;
    }

    public BigDecimal getFacNumContrato() {
        return this.facNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacNumFactura(BigDecimal facNumFactura) {
        this.facNumFactura = facNumFactura;
    }

    public BigDecimal getFacNumFactura() {
        return this.facNumFactura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacNumFacNuevo(BigDecimal facNumFacNuevo) {
        this.facNumFacNuevo = facNumFacNuevo;
    }

    public BigDecimal getFacNumFacNuevo() {
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
    public void setFacConcepto(String facConcepto) {
        this.facConcepto = facConcepto;
    }

    public String getFacConcepto() {
        return this.facConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFacImporte(BigDecimal facImporte) {
        this.facImporte = facImporte;
    }

    public BigDecimal getFacImporte() {
        return this.facImporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFacImpIva(BigDecimal facImpIva) {
        this.facImpIva = facImpIva;
    }

    public BigDecimal getFacImpIva() {
        return this.facImpIva;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFacFecAnoFac(BigDecimal facFecAnoFac) {
        this.facFecAnoFac = facFecAnoFac;
    }

    public BigDecimal getFacFecAnoFac() {
        return this.facFecAnoFac;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFacFecMesFac(BigDecimal facFecMesFac) {
        this.facFecMesFac = facFecMesFac;
    }

    public BigDecimal getFacFecMesFac() {
        return this.facFecMesFac;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFacFecDiaFac(BigDecimal facFecDiaFac) {
        this.facFecDiaFac = facFecDiaFac;
    }

    public BigDecimal getFacFecDiaFac() {
        return this.facFecDiaFac;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacPerDel(String facPerDel) {
        this.facPerDel = facPerDel;
    }

    public String getFacPerDel() {
        return this.facPerDel;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacPerAl(String facPerAl) {
        this.facPerAl = facPerAl;
    }

    public String getFacPerAl() {
        return this.facPerAl;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFacStFactura(String facStFactura) {
        this.facStFactura = facStFactura;
    }

    public String getFacStFactura() {
        return this.facStFactura;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FACTURASH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacNumContrato() != null && this.getFacNumContrato().longValue() == -999) {
            conditions += " AND FAC_NUM_CONTRATO IS NULL";
        } else if (this.getFacNumContrato() != null) {
            conditions += " AND FAC_NUM_CONTRATO = ?";
            values.add(this.getFacNumContrato());
        }

        if (this.getFacNumFactura() != null && this.getFacNumFactura().longValue() == -999) {
            conditions += " AND FAC_NUM_FACTURA IS NULL";
        } else if (this.getFacNumFactura() != null) {
            conditions += " AND FAC_NUM_FACTURA = ?";
            values.add(this.getFacNumFactura());
        }

        if (this.getFacNumFacNuevo() != null && this.getFacNumFacNuevo().longValue() == -999) {
            conditions += " AND FAC_NUM_FAC_NUEVO IS NULL";
        } else if (this.getFacNumFacNuevo() != null) {
            conditions += " AND FAC_NUM_FAC_NUEVO = ?";
            values.add(this.getFacNumFacNuevo());
        }

        if (this.getFacStFactura() != null && "null".equals(this.getFacStFactura())) {
            conditions += " AND FAC_ST_FACTURA IS NULL";
        } else if (this.getFacStFactura() != null) {
            conditions += " AND FAC_ST_FACTURA = ?";
            values.add(this.getFacStFactura());
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
        String sql = "SELECT * FROM FACTURASH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacNumContrato() != null && this.getFacNumContrato().longValue() == -999) {
            conditions += " AND FAC_NUM_CONTRATO IS NULL";
        } else if (this.getFacNumContrato() != null) {
            conditions += " AND FAC_NUM_CONTRATO = ?";
            values.add(this.getFacNumContrato());
        }

        if (this.getFacNumFactura() != null && this.getFacNumFactura().longValue() == -999) {
            conditions += " AND FAC_NUM_FACTURA IS NULL";
        } else if (this.getFacNumFactura() != null) {
            conditions += " AND FAC_NUM_FACTURA = ?";
            values.add(this.getFacNumFactura());
        }

        if (this.getFacNumFacNuevo() != null && this.getFacNumFacNuevo().longValue() == -999) {
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

        if (this.getFacConcepto() != null && "null".equals(this.getFacConcepto())) {
            conditions += " AND FAC_CONCEPTO IS NULL";
        } else if (this.getFacConcepto() != null) {
            conditions += " AND FAC_CONCEPTO = ?";
            values.add(this.getFacConcepto());
        }

        if (this.getFacImporte() != null && this.getFacImporte().longValue() == -999) {
            conditions += " AND FAC_IMPORTE IS NULL";
        } else if (this.getFacImporte() != null) {
            conditions += " AND FAC_IMPORTE = ?";
            values.add(this.getFacImporte());
        }

        if (this.getFacImpIva() != null && this.getFacImpIva().longValue() == -999) {
            conditions += " AND FAC_IMP_IVA IS NULL";
        } else if (this.getFacImpIva() != null) {
            conditions += " AND FAC_IMP_IVA = ?";
            values.add(this.getFacImpIva());
        }

        if (this.getFacFecAnoFac() != null && this.getFacFecAnoFac().longValue() == -999) {
            conditions += " AND FAC_FEC_ANO_FAC IS NULL";
        } else if (this.getFacFecAnoFac() != null) {
            conditions += " AND FAC_FEC_ANO_FAC = ?";
            values.add(this.getFacFecAnoFac());
        }

        if (this.getFacFecMesFac() != null && this.getFacFecMesFac().longValue() == -999) {
            conditions += " AND FAC_FEC_MES_FAC IS NULL";
        } else if (this.getFacFecMesFac() != null) {
            conditions += " AND FAC_FEC_MES_FAC = ?";
            values.add(this.getFacFecMesFac());
        }

        if (this.getFacFecDiaFac() != null && this.getFacFecDiaFac().longValue() == -999) {
            conditions += " AND FAC_FEC_DIA_FAC IS NULL";
        } else if (this.getFacFecDiaFac() != null) {
            conditions += " AND FAC_FEC_DIA_FAC = ?";
            values.add(this.getFacFecDiaFac());
        }

        if (this.getFacPerDel() != null && "null".equals(this.getFacPerDel())) {
            conditions += " AND FAC_PER_DEL IS NULL";
        } else if (this.getFacPerDel() != null) {
            conditions += " AND FAC_PER_DEL = ?";
            values.add(this.getFacPerDel());
        }

        if (this.getFacPerAl() != null && "null".equals(this.getFacPerAl())) {
            conditions += " AND FAC_PER_AL IS NULL";
        } else if (this.getFacPerAl() != null) {
            conditions += " AND FAC_PER_AL = ?";
            values.add(this.getFacPerAl());
        }

        if (this.getFacStFactura() != null && "null".equals(this.getFacStFactura())) {
            conditions += " AND FAC_ST_FACTURA IS NULL";
        } else if (this.getFacStFactura() != null) {
            conditions += " AND FAC_ST_FACTURA = ?";
            values.add(this.getFacStFactura());
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
        String sql = "UPDATE FACTURASH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FAC_NUM_CONTRATO = ?";
        pkValues.add(this.getFacNumContrato());
        conditions += " AND FAC_NUM_FACTURA = ?";
        pkValues.add(this.getFacNumFactura());
        conditions += " AND FAC_NUM_FAC_NUEVO = ?";
        pkValues.add(this.getFacNumFacNuevo());
        fields += " FAC_NOMBRE = ?, ";
        values.add(this.getFacNombre());
        fields += " FAC_CONCEPTO = ?, ";
        values.add(this.getFacConcepto());
        fields += " FAC_IMPORTE = ?, ";
        values.add(this.getFacImporte());
        fields += " FAC_IMP_IVA = ?, ";
        values.add(this.getFacImpIva());
        fields += " FAC_FEC_ANO_FAC = ?, ";
        values.add(this.getFacFecAnoFac());
        fields += " FAC_FEC_MES_FAC = ?, ";
        values.add(this.getFacFecMesFac());
        fields += " FAC_FEC_DIA_FAC = ?, ";
        values.add(this.getFacFecDiaFac());
        fields += " FAC_PER_DEL = ?, ";
        values.add(this.getFacPerDel());
        fields += " FAC_PER_AL = ?, ";
        values.add(this.getFacPerAl());
        conditions += " AND FAC_ST_FACTURA = ?";
        pkValues.add(this.getFacStFactura());
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
        String sql = "INSERT INTO FACTURASH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FAC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFacNumContrato());

        fields += ", FAC_NUM_FACTURA";
        fieldValues += ", ?";
        values.add(this.getFacNumFactura());

        fields += ", FAC_NUM_FAC_NUEVO";
        fieldValues += ", ?";
        values.add(this.getFacNumFacNuevo());

        fields += ", FAC_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFacNombre());

        fields += ", FAC_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getFacConcepto());

        fields += ", FAC_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFacImporte());

        fields += ", FAC_IMP_IVA";
        fieldValues += ", ?";
        values.add(this.getFacImpIva());

        fields += ", FAC_FEC_ANO_FAC";
        fieldValues += ", ?";
        values.add(this.getFacFecAnoFac());

        fields += ", FAC_FEC_MES_FAC";
        fieldValues += ", ?";
        values.add(this.getFacFecMesFac());

        fields += ", FAC_FEC_DIA_FAC";
        fieldValues += ", ?";
        values.add(this.getFacFecDiaFac());

        fields += ", FAC_PER_DEL";
        fieldValues += ", ?";
        values.add(this.getFacPerDel());

        fields += ", FAC_PER_AL";
        fieldValues += ", ?";
        values.add(this.getFacPerAl());

        fields += ", FAC_ST_FACTURA";
        fieldValues += ", ?";
        values.add(this.getFacStFactura());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FACTURASH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FAC_NUM_CONTRATO = ?";
        values.add(this.getFacNumContrato());
        conditions += " AND FAC_NUM_FACTURA = ?";
        values.add(this.getFacNumFactura());
        conditions += " AND FAC_NUM_FAC_NUEVO = ?";
        values.add(this.getFacNumFacNuevo());
        conditions += " AND FAC_ST_FACTURA = ?";
        values.add(this.getFacStFactura());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Facturash instance = (Facturash) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFacNumContrato().equals(instance.getFacNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFacNumFactura().equals(instance.getFacNumFactura()))
            equalObjects = false;
        if (equalObjects && !this.getFacNumFacNuevo().equals(instance.getFacNumFacNuevo()))
            equalObjects = false;
        if (equalObjects && !this.getFacNombre().equals(instance.getFacNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFacConcepto().equals(instance.getFacConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getFacImporte().equals(instance.getFacImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFacImpIva().equals(instance.getFacImpIva()))
            equalObjects = false;
        if (equalObjects && !this.getFacFecAnoFac().equals(instance.getFacFecAnoFac()))
            equalObjects = false;
        if (equalObjects && !this.getFacFecMesFac().equals(instance.getFacFecMesFac()))
            equalObjects = false;
        if (equalObjects && !this.getFacFecDiaFac().equals(instance.getFacFecDiaFac()))
            equalObjects = false;
        if (equalObjects && !this.getFacPerDel().equals(instance.getFacPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getFacPerAl().equals(instance.getFacPerAl()))
            equalObjects = false;
        if (equalObjects && !this.getFacStFactura().equals(instance.getFacStFactura()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Facturash result = new Facturash();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFacNumContrato((BigDecimal) objectData.getData("FAC_NUM_CONTRATO"));
        result.setFacNumFactura((BigDecimal) objectData.getData("FAC_NUM_FACTURA"));
        result.setFacNumFacNuevo((BigDecimal) objectData.getData("FAC_NUM_FAC_NUEVO"));
        result.setFacNombre((String) objectData.getData("FAC_NOMBRE"));
        result.setFacConcepto((String) objectData.getData("FAC_CONCEPTO"));
        result.setFacImporte((BigDecimal) objectData.getData("FAC_IMPORTE"));
        result.setFacImpIva((BigDecimal) objectData.getData("FAC_IMP_IVA"));
        result.setFacFecAnoFac((BigDecimal) objectData.getData("FAC_FEC_ANO_FAC"));
        result.setFacFecMesFac((BigDecimal) objectData.getData("FAC_FEC_MES_FAC"));
        result.setFacFecDiaFac((BigDecimal) objectData.getData("FAC_FEC_DIA_FAC"));
        result.setFacPerDel((String) objectData.getData("FAC_PER_DEL"));
        result.setFacPerAl((String) objectData.getData("FAC_PER_AL"));
        result.setFacStFactura((String) objectData.getData("FAC_ST_FACTURA"));

        return result;

    }

}
