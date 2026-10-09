package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_COBRO_PK",
            columns = { "FFID_ID_FIDEICOMISO", "FCOH_TIPO_PERSONA", "FCOH_ID_PERSONA", "FCOH_TIPO_HONO", "FCOH_FECHA_PROVISION", "FPRO_ID_PROVISION", "FCOH_ID_COBRO" },
            sequences = { "MANUAL" })
public class FCobro extends DomainObject {

    BigDecimal fproIdProvision = null;
    String fcohTipoPersona = null;
    BigDecimal fcohIdCobro = null;
    BigDecimal fcohIdPersona = null;
    BigDecimal fcohImporteCob = null;
    String fcohTipoHono = null;
    BigDecimal fcohIvaCob = null;
    String fcohPeriodoDel = null;
    String fcohFechaProvision = null;
    String fcohPeriodoAl = null;
    BigDecimal ffidIdFideicomiso = null;
    BigDecimal fcohImporteCiva = null;
    String fcohStatus = null;
    BigDecimal fcohTipoCambioProv = null;
    BigDecimal fcohTipoCambioFirme = null;
    BigDecimal fcohMoneda = null;
    String fcohFechaCobro = null;

    public FCobro() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFproIdProvision(BigDecimal fproIdProvision) {
        this.fproIdProvision = fproIdProvision;
    }

    public BigDecimal getFproIdProvision() {
        return this.fproIdProvision;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcohTipoPersona(String fcohTipoPersona) {
        this.fcohTipoPersona = fcohTipoPersona;
    }

    public String getFcohTipoPersona() {
        return this.fcohTipoPersona;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFcohIdCobro(BigDecimal fcohIdCobro) {
        this.fcohIdCobro = fcohIdCobro;
    }

    public BigDecimal getFcohIdCobro() {
        return this.fcohIdCobro;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcohIdPersona(BigDecimal fcohIdPersona) {
        this.fcohIdPersona = fcohIdPersona;
    }

    public BigDecimal getFcohIdPersona() {
        return this.fcohIdPersona;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcohImporteCob(BigDecimal fcohImporteCob) {
        this.fcohImporteCob = fcohImporteCob;
    }

    public BigDecimal getFcohImporteCob() {
        return this.fcohImporteCob;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcohTipoHono(String fcohTipoHono) {
        this.fcohTipoHono = fcohTipoHono;
    }

    public String getFcohTipoHono() {
        return this.fcohTipoHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcohIvaCob(BigDecimal fcohIvaCob) {
        this.fcohIvaCob = fcohIvaCob;
    }

    public BigDecimal getFcohIvaCob() {
        return this.fcohIvaCob;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcohPeriodoDel(String fcohPeriodoDel) {
        this.fcohPeriodoDel = fcohPeriodoDel;
    }

    public String getFcohPeriodoDel() {
        return this.fcohPeriodoDel;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFcohFechaProvision(String fcohFechaProvision) {
        this.fcohFechaProvision = fcohFechaProvision;
    }

    public String getFcohFechaProvision() {
        return this.fcohFechaProvision;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcohPeriodoAl(String fcohPeriodoAl) {
        this.fcohPeriodoAl = fcohPeriodoAl;
    }

    public String getFcohPeriodoAl() {
        return this.fcohPeriodoAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfidIdFideicomiso(BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return this.ffidIdFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcohImporteCiva(BigDecimal fcohImporteCiva) {
        this.fcohImporteCiva = fcohImporteCiva;
    }

    public BigDecimal getFcohImporteCiva() {
        return this.fcohImporteCiva;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcohStatus(String fcohStatus) {
        this.fcohStatus = fcohStatus;
    }

    public String getFcohStatus() {
        return this.fcohStatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcohTipoCambioProv(BigDecimal fcohTipoCambioProv) {
        this.fcohTipoCambioProv = fcohTipoCambioProv;
    }

    public BigDecimal getFcohTipoCambioProv() {
        return this.fcohTipoCambioProv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcohTipoCambioFirme(BigDecimal fcohTipoCambioFirme) {
        this.fcohTipoCambioFirme = fcohTipoCambioFirme;
    }

    public BigDecimal getFcohTipoCambioFirme() {
        return this.fcohTipoCambioFirme;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setFcohMoneda(BigDecimal fcohMoneda) {
        this.fcohMoneda = fcohMoneda;
    }

    public BigDecimal getFcohMoneda() {
        return this.fcohMoneda;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcohFechaCobro(String fcohFechaCobro) {
        this.fcohFechaCobro = fcohFechaCobro;
    }

    public String getFcohFechaCobro() {
        return this.fcohFechaCobro;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_COBRO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFproIdProvision() != null && this.getFproIdProvision().longValue() == -999) {
            conditions += " AND FPRO_ID_PROVISION IS NULL";
        } else if (this.getFproIdProvision() != null) {
            conditions += " AND FPRO_ID_PROVISION = ?";
            values.add(this.getFproIdProvision());
        }

        if (this.getFcohTipoPersona() != null && "null".equals(this.getFcohTipoPersona())) {
            conditions += " AND FCOH_TIPO_PERSONA IS NULL";
        } else if (this.getFcohTipoPersona() != null) {
            conditions += " AND FCOH_TIPO_PERSONA = ?";
            values.add(this.getFcohTipoPersona());
        }

        if (this.getFcohIdCobro() != null && this.getFcohIdCobro().longValue() == -999) {
            conditions += " AND FCOH_ID_COBRO IS NULL";
        } else if (this.getFcohIdCobro() != null) {
            conditions += " AND FCOH_ID_COBRO = ?";
            values.add(this.getFcohIdCobro());
        }

        if (this.getFcohIdPersona() != null && this.getFcohIdPersona().longValue() == -999) {
            conditions += " AND FCOH_ID_PERSONA IS NULL";
        } else if (this.getFcohIdPersona() != null) {
            conditions += " AND FCOH_ID_PERSONA = ?";
            values.add(this.getFcohIdPersona());
        }

        if (this.getFcohTipoHono() != null && "null".equals(this.getFcohTipoHono())) {
            conditions += " AND FCOH_TIPO_HONO IS NULL";
        } else if (this.getFcohTipoHono() != null) {
            conditions += " AND FCOH_TIPO_HONO = ?";
            values.add(this.getFcohTipoHono());
        }

        if (this.getFcohFechaProvision() != null && "null".equals(this.getFcohFechaProvision())) {
            conditions += " AND FCOH_FECHA_PROVISION IS NULL";
        } else if (this.getFcohFechaProvision() != null) {
            conditions += " AND FCOH_FECHA_PROVISION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcohFechaProvision());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
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
        String sql = "SELECT * FROM F_COBRO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFproIdProvision() != null && this.getFproIdProvision().longValue() == -999) {
            conditions += " AND FPRO_ID_PROVISION IS NULL";
        } else if (this.getFproIdProvision() != null) {
            conditions += " AND FPRO_ID_PROVISION = ?";
            values.add(this.getFproIdProvision());
        }

        if (this.getFcohTipoPersona() != null && "null".equals(this.getFcohTipoPersona())) {
            conditions += " AND FCOH_TIPO_PERSONA IS NULL";
        } else if (this.getFcohTipoPersona() != null) {
            conditions += " AND FCOH_TIPO_PERSONA = ?";
            values.add(this.getFcohTipoPersona());
        }

        if (this.getFcohIdCobro() != null && this.getFcohIdCobro().longValue() == -999) {
            conditions += " AND FCOH_ID_COBRO IS NULL";
        } else if (this.getFcohIdCobro() != null) {
            conditions += " AND FCOH_ID_COBRO = ?";
            values.add(this.getFcohIdCobro());
        }

        if (this.getFcohIdPersona() != null && this.getFcohIdPersona().longValue() == -999) {
            conditions += " AND FCOH_ID_PERSONA IS NULL";
        } else if (this.getFcohIdPersona() != null) {
            conditions += " AND FCOH_ID_PERSONA = ?";
            values.add(this.getFcohIdPersona());
        }

        if (this.getFcohImporteCob() != null && this.getFcohImporteCob().longValue() == -999) {
            conditions += " AND FCOH_IMPORTE_COB IS NULL";
        } else if (this.getFcohImporteCob() != null) {
            conditions += " AND FCOH_IMPORTE_COB = ?";
            values.add(this.getFcohImporteCob());
        }

        if (this.getFcohTipoHono() != null && "null".equals(this.getFcohTipoHono())) {
            conditions += " AND FCOH_TIPO_HONO IS NULL";
        } else if (this.getFcohTipoHono() != null) {
            conditions += " AND FCOH_TIPO_HONO = ?";
            values.add(this.getFcohTipoHono());
        }

        if (this.getFcohIvaCob() != null && this.getFcohIvaCob().longValue() == -999) {
            conditions += " AND FCOH_IVA_COB IS NULL";
        } else if (this.getFcohIvaCob() != null) {
            conditions += " AND FCOH_IVA_COB = ?";
            values.add(this.getFcohIvaCob());
        }

        if (this.getFcohPeriodoDel() != null && "null".equals(this.getFcohPeriodoDel())) {
            conditions += " AND FCOH_PERIODO_DEL IS NULL";
        } else if (this.getFcohPeriodoDel() != null) {
            conditions += " AND FCOH_PERIODO_DEL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcohPeriodoDel());
        }

        if (this.getFcohFechaProvision() != null && "null".equals(this.getFcohFechaProvision())) {
            conditions += " AND FCOH_FECHA_PROVISION IS NULL";
        } else if (this.getFcohFechaProvision() != null) {
            conditions += " AND FCOH_FECHA_PROVISION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcohFechaProvision());
        }

        if (this.getFcohPeriodoAl() != null && "null".equals(this.getFcohPeriodoAl())) {
            conditions += " AND FCOH_PERIODO_AL IS NULL";
        } else if (this.getFcohPeriodoAl() != null) {
            conditions += " AND FCOH_PERIODO_AL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcohPeriodoAl());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
        }

        if (this.getFcohImporteCiva() != null && this.getFcohImporteCiva().longValue() == -999) {
            conditions += " AND FCOH_IMPORTE_CIVA IS NULL";
        } else if (this.getFcohImporteCiva() != null) {
            conditions += " AND FCOH_IMPORTE_CIVA = ?";
            values.add(this.getFcohImporteCiva());
        }

        if (this.getFcohStatus() != null && "null".equals(this.getFcohStatus())) {
            conditions += " AND FCOH_STATUS IS NULL";
        } else if (this.getFcohStatus() != null) {
            conditions += " AND FCOH_STATUS = ?";
            values.add(this.getFcohStatus());
        }

        if (this.getFcohTipoCambioProv() != null && this.getFcohTipoCambioProv().longValue() == -999) {
            conditions += " AND FCOH_TIPO_CAMBIO_PROV IS NULL";
        } else if (this.getFcohTipoCambioProv() != null) {
            conditions += " AND FCOH_TIPO_CAMBIO_PROV = ?";
            values.add(this.getFcohTipoCambioProv());
        }

        if (this.getFcohTipoCambioFirme() != null && this.getFcohTipoCambioFirme().longValue() == -999) {
            conditions += " AND FCOH_TIPO_CAMBIO_FIRME IS NULL";
        } else if (this.getFcohTipoCambioFirme() != null) {
            conditions += " AND FCOH_TIPO_CAMBIO_FIRME = ?";
            values.add(this.getFcohTipoCambioFirme());
        }

        if (this.getFcohMoneda() != null && this.getFcohMoneda().longValue() == -999) {
            conditions += " AND FCOH_MONEDA IS NULL";
        } else if (this.getFcohMoneda() != null) {
            conditions += " AND FCOH_MONEDA = ?";
            values.add(this.getFcohMoneda());
        }

        if (this.getFcohFechaCobro() != null && "null".equals(this.getFcohFechaCobro())) {
            conditions += " AND FCOH_FECHA_COBRO IS NULL";
        } else if (this.getFcohFechaCobro() != null) {
            conditions += " AND FCOH_FECHA_COBRO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcohFechaCobro());
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
        String sql = "UPDATE F_COBRO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPRO_ID_PROVISION = ?";
        pkValues.add(this.getFproIdProvision());
        conditions += " AND FCOH_TIPO_PERSONA = ?";
        pkValues.add(this.getFcohTipoPersona());
        conditions += " AND FCOH_ID_COBRO = ?";
        pkValues.add(this.getFcohIdCobro());
        conditions += " AND FCOH_ID_PERSONA = ?";
        pkValues.add(this.getFcohIdPersona());
        fields += " FCOH_IMPORTE_COB = ?, ";
        values.add(this.getFcohImporteCob());
        conditions += " AND FCOH_TIPO_HONO = ?";
        pkValues.add(this.getFcohTipoHono());
        fields += " FCOH_IVA_COB = ?, ";
        values.add(this.getFcohIvaCob());
        fields += " FCOH_PERIODO_DEL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcohPeriodoDel());
        conditions += " AND FCOH_FECHA_PROVISION = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFcohFechaProvision());
        fields += " FCOH_PERIODO_AL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcohPeriodoAl());
        conditions += " AND FFID_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFfidIdFideicomiso());
        fields += " FCOH_IMPORTE_CIVA = ?, ";
        values.add(this.getFcohImporteCiva());
        fields += " FCOH_STATUS = ?, ";
        values.add(this.getFcohStatus());
        fields += " FCOH_TIPO_CAMBIO_PROV = ?, ";
        values.add(this.getFcohTipoCambioProv());
        fields += " FCOH_TIPO_CAMBIO_FIRME = ?, ";
        values.add(this.getFcohTipoCambioFirme());
        fields += " FCOH_MONEDA = ?, ";
        values.add(this.getFcohMoneda());
        fields += " FCOH_FECHA_COBRO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcohFechaCobro());
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
        String sql = "INSERT INTO F_COBRO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPRO_ID_PROVISION";
        fieldValues += ", ?";
        values.add(this.getFproIdProvision());

        fields += ", FCOH_TIPO_PERSONA";
        fieldValues += ", ?";
        values.add(this.getFcohTipoPersona());

        fields += ", FCOH_ID_COBRO";
        fieldValues += ", ?";
        values.add(this.getFcohIdCobro());

        fields += ", FCOH_ID_PERSONA";
        fieldValues += ", ?";
        values.add(this.getFcohIdPersona());

        fields += ", FCOH_IMPORTE_COB";
        fieldValues += ", ?";
        values.add(this.getFcohImporteCob());

        fields += ", FCOH_TIPO_HONO";
        fieldValues += ", ?";
        values.add(this.getFcohTipoHono());

        fields += ", FCOH_IVA_COB";
        fieldValues += ", ?";
        values.add(this.getFcohIvaCob());

        fields += ", FCOH_PERIODO_DEL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcohPeriodoDel());

        fields += ", FCOH_FECHA_PROVISION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcohFechaProvision());

        fields += ", FCOH_PERIODO_AL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcohPeriodoAl());

        fields += ", FFID_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFfidIdFideicomiso());

        fields += ", FCOH_IMPORTE_CIVA";
        fieldValues += ", ?";
        values.add(this.getFcohImporteCiva());

        fields += ", FCOH_STATUS";
        fieldValues += ", ?";
        values.add(this.getFcohStatus());

        fields += ", FCOH_TIPO_CAMBIO_PROV";
        fieldValues += ", ?";
        values.add(this.getFcohTipoCambioProv());

        fields += ", FCOH_TIPO_CAMBIO_FIRME";
        fieldValues += ", ?";
        values.add(this.getFcohTipoCambioFirme());

        fields += ", FCOH_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFcohMoneda());

        fields += ", FCOH_FECHA_COBRO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcohFechaCobro());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_COBRO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPRO_ID_PROVISION = ?";
        values.add(this.getFproIdProvision());
        conditions += " AND FCOH_TIPO_PERSONA = ?";
        values.add(this.getFcohTipoPersona());
        conditions += " AND FCOH_ID_COBRO = ?";
        values.add(this.getFcohIdCobro());
        conditions += " AND FCOH_ID_PERSONA = ?";
        values.add(this.getFcohIdPersona());
        conditions += " AND FCOH_TIPO_HONO = ?";
        values.add(this.getFcohTipoHono());
        conditions += " AND FCOH_FECHA_PROVISION = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFcohFechaProvision());
        conditions += " AND FFID_ID_FIDEICOMISO = ?";
        values.add(this.getFfidIdFideicomiso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCobro instance = (FCobro) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFproIdProvision().equals(instance.getFproIdProvision()))
            equalObjects = false;
        if (equalObjects && !this.getFcohTipoPersona().equals(instance.getFcohTipoPersona()))
            equalObjects = false;
        if (equalObjects && !this.getFcohIdCobro().equals(instance.getFcohIdCobro()))
            equalObjects = false;
        if (equalObjects && !this.getFcohIdPersona().equals(instance.getFcohIdPersona()))
            equalObjects = false;
        if (equalObjects && !this.getFcohImporteCob().equals(instance.getFcohImporteCob()))
            equalObjects = false;
        if (equalObjects && !this.getFcohTipoHono().equals(instance.getFcohTipoHono()))
            equalObjects = false;
        if (equalObjects && !this.getFcohIvaCob().equals(instance.getFcohIvaCob()))
            equalObjects = false;
        if (equalObjects && !this.getFcohPeriodoDel().equals(instance.getFcohPeriodoDel()))
            equalObjects = false;
        if (equalObjects && !this.getFcohFechaProvision().equals(instance.getFcohFechaProvision()))
            equalObjects = false;
        if (equalObjects && !this.getFcohPeriodoAl().equals(instance.getFcohPeriodoAl()))
            equalObjects = false;
        if (equalObjects && !this.getFfidIdFideicomiso().equals(instance.getFfidIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFcohImporteCiva().equals(instance.getFcohImporteCiva()))
            equalObjects = false;
        if (equalObjects && !this.getFcohStatus().equals(instance.getFcohStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFcohTipoCambioProv().equals(instance.getFcohTipoCambioProv()))
            equalObjects = false;
        if (equalObjects && !this.getFcohTipoCambioFirme().equals(instance.getFcohTipoCambioFirme()))
            equalObjects = false;
        if (equalObjects && !this.getFcohMoneda().equals(instance.getFcohMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFcohFechaCobro().equals(instance.getFcohFechaCobro()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCobro result = new FCobro();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFproIdProvision((BigDecimal) objectData.getData("FPRO_ID_PROVISION"));
        result.setFcohTipoPersona((String) objectData.getData("FCOH_TIPO_PERSONA"));
        result.setFcohIdCobro((BigDecimal) objectData.getData("FCOH_ID_COBRO"));
        result.setFcohIdPersona((BigDecimal) objectData.getData("FCOH_ID_PERSONA"));
        result.setFcohImporteCob((BigDecimal) objectData.getData("FCOH_IMPORTE_COB"));
        result.setFcohTipoHono((String) objectData.getData("FCOH_TIPO_HONO"));
        result.setFcohIvaCob((BigDecimal) objectData.getData("FCOH_IVA_COB"));
        result.setFcohPeriodoDel((String) objectData.getData("FCOH_PERIODO_DEL"));
        result.setFcohFechaProvision((String) objectData.getData("FCOH_FECHA_PROVISION"));
        result.setFcohPeriodoAl((String) objectData.getData("FCOH_PERIODO_AL"));
        result.setFfidIdFideicomiso((BigDecimal) objectData.getData("FFID_ID_FIDEICOMISO"));
        result.setFcohImporteCiva((BigDecimal) objectData.getData("FCOH_IMPORTE_CIVA"));
        result.setFcohStatus((String) objectData.getData("FCOH_STATUS"));
        result.setFcohTipoCambioProv((BigDecimal) objectData.getData("FCOH_TIPO_CAMBIO_PROV"));
        result.setFcohTipoCambioFirme((BigDecimal) objectData.getData("FCOH_TIPO_CAMBIO_FIRME"));
        result.setFcohMoneda((BigDecimal) objectData.getData("FCOH_MONEDA"));
        result.setFcohFechaCobro((String) objectData.getData("FCOH_FECHA_COBRO"));

        return result;

    }

}
