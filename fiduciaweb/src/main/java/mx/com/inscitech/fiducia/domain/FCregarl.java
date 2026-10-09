package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CREGARL_PK", columns = { "FCRE_ID_FIDEICOMISO", "FCRE_ID_CREDITO", "FCRE_ID_TIPO_CREDITO" }, sequences = { "MANUAL" })
public class FCregarl extends DomainObject {

    BigDecimal fcreIdFideicomiso = null;
    String fcreIdCredito = null;
    String fcreIdTipoCredito = null;
    String fcreProductoCredito = null;
    BigDecimal fcreImpCredito = null;
    BigDecimal fcreTasa = null;
    BigDecimal fcrePagos = null;
    BigDecimal fcreImpGarantia = null;
    BigDecimal fcrePjeGarantia = null;
    BigDecimal fcreMoneda = null;
    String fcreFecSuscripcion = null;
    String fcreFecVencimiento = null;
    BigDecimal fcreNumDisposiciones = null;
    BigDecimal fcreImpDisposiciones = null;
    BigDecimal fcreNumInstitucion = null;
    BigDecimal fcreImpGarLiberada = null;
    BigDecimal fcreImpGarAport = null;
    BigDecimal fcreNumNotario = null;
    String fcreLocalidad = null;
    String fcreRegistro = null;
    String fcreStCredito = null;

    public FCregarl() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcreIdFideicomiso(BigDecimal fcreIdFideicomiso) {
        this.fcreIdFideicomiso = fcreIdFideicomiso;
    }

    public BigDecimal getFcreIdFideicomiso() {
        return this.fcreIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreIdCredito(String fcreIdCredito) {
        this.fcreIdCredito = fcreIdCredito;
    }

    public String getFcreIdCredito() {
        return this.fcreIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreIdTipoCredito(String fcreIdTipoCredito) {
        this.fcreIdTipoCredito = fcreIdTipoCredito;
    }

    public String getFcreIdTipoCredito() {
        return this.fcreIdTipoCredito;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreProductoCredito(String fcreProductoCredito) {
        this.fcreProductoCredito = fcreProductoCredito;
    }

    public String getFcreProductoCredito() {
        return this.fcreProductoCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpCredito(BigDecimal fcreImpCredito) {
        this.fcreImpCredito = fcreImpCredito;
    }

    public BigDecimal getFcreImpCredito() {
        return this.fcreImpCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 8, javaClass = BigDecimal.class)
    public void setFcreTasa(BigDecimal fcreTasa) {
        this.fcreTasa = fcreTasa;
    }

    public BigDecimal getFcreTasa() {
        return this.fcreTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcrePagos(BigDecimal fcrePagos) {
        this.fcrePagos = fcrePagos;
    }

    public BigDecimal getFcrePagos() {
        return this.fcrePagos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpGarantia(BigDecimal fcreImpGarantia) {
        this.fcreImpGarantia = fcreImpGarantia;
    }

    public BigDecimal getFcreImpGarantia() {
        return this.fcreImpGarantia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 4, javaClass = BigDecimal.class)
    public void setFcrePjeGarantia(BigDecimal fcrePjeGarantia) {
        this.fcrePjeGarantia = fcrePjeGarantia;
    }

    public BigDecimal getFcrePjeGarantia() {
        return this.fcrePjeGarantia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcreMoneda(BigDecimal fcreMoneda) {
        this.fcreMoneda = fcreMoneda;
    }

    public BigDecimal getFcreMoneda() {
        return this.fcreMoneda;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcreFecSuscripcion(String fcreFecSuscripcion) {
        this.fcreFecSuscripcion = fcreFecSuscripcion;
    }

    public String getFcreFecSuscripcion() {
        return this.fcreFecSuscripcion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFcreFecVencimiento(String fcreFecVencimiento) {
        this.fcreFecVencimiento = fcreFecVencimiento;
    }

    public String getFcreFecVencimiento() {
        return this.fcreFecVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcreNumDisposiciones(BigDecimal fcreNumDisposiciones) {
        this.fcreNumDisposiciones = fcreNumDisposiciones;
    }

    public BigDecimal getFcreNumDisposiciones() {
        return this.fcreNumDisposiciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpDisposiciones(BigDecimal fcreImpDisposiciones) {
        this.fcreImpDisposiciones = fcreImpDisposiciones;
    }

    public BigDecimal getFcreImpDisposiciones() {
        return this.fcreImpDisposiciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcreNumInstitucion(BigDecimal fcreNumInstitucion) {
        this.fcreNumInstitucion = fcreNumInstitucion;
    }

    public BigDecimal getFcreNumInstitucion() {
        return this.fcreNumInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpGarLiberada(BigDecimal fcreImpGarLiberada) {
        this.fcreImpGarLiberada = fcreImpGarLiberada;
    }

    public BigDecimal getFcreImpGarLiberada() {
        return this.fcreImpGarLiberada;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcreImpGarAport(BigDecimal fcreImpGarAport) {
        this.fcreImpGarAport = fcreImpGarAport;
    }

    public BigDecimal getFcreImpGarAport() {
        return this.fcreImpGarAport;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcreNumNotario(BigDecimal fcreNumNotario) {
        this.fcreNumNotario = fcreNumNotario;
    }

    public BigDecimal getFcreNumNotario() {
        return this.fcreNumNotario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreLocalidad(String fcreLocalidad) {
        this.fcreLocalidad = fcreLocalidad;
    }

    public String getFcreLocalidad() {
        return this.fcreLocalidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreRegistro(String fcreRegistro) {
        this.fcreRegistro = fcreRegistro;
    }

    public String getFcreRegistro() {
        return this.fcreRegistro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcreStCredito(String fcreStCredito) {
        this.fcreStCredito = fcreStCredito;
    }

    public String getFcreStCredito() {
        return this.fcreStCredito;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CREGARL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcreIdFideicomiso() != null && this.getFcreIdFideicomiso().longValue() == -999) {
            conditions += " AND FCRE_ID_FIDEICOMISO IS NULL";
        } else if (this.getFcreIdFideicomiso() != null) {
            conditions += " AND FCRE_ID_FIDEICOMISO = ?";
            values.add(this.getFcreIdFideicomiso());
        }

        if (this.getFcreIdCredito() != null && "null".equals(this.getFcreIdCredito())) {
            conditions += " AND FCRE_ID_CREDITO IS NULL";
        } else if (this.getFcreIdCredito() != null) {
            conditions += " AND FCRE_ID_CREDITO = ?";
            values.add(this.getFcreIdCredito());
        }

        if (this.getFcreIdTipoCredito() != null && "null".equals(this.getFcreIdTipoCredito())) {
            conditions += " AND FCRE_ID_TIPO_CREDITO IS NULL";
        } else if (this.getFcreIdTipoCredito() != null) {
            conditions += " AND FCRE_ID_TIPO_CREDITO = ?";
            values.add(this.getFcreIdTipoCredito());
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
        String sql = "SELECT * FROM F_CREGARL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcreIdFideicomiso() != null && this.getFcreIdFideicomiso().longValue() == -999) {
            conditions += " AND FCRE_ID_FIDEICOMISO IS NULL";
        } else if (this.getFcreIdFideicomiso() != null) {
            conditions += " AND FCRE_ID_FIDEICOMISO = ?";
            values.add(this.getFcreIdFideicomiso());
        }

        if (this.getFcreIdCredito() != null && "null".equals(this.getFcreIdCredito())) {
            conditions += " AND FCRE_ID_CREDITO IS NULL";
        } else if (this.getFcreIdCredito() != null) {
            conditions += " AND FCRE_ID_CREDITO = ?";
            values.add(this.getFcreIdCredito());
        }

        if (this.getFcreIdTipoCredito() != null && "null".equals(this.getFcreIdTipoCredito())) {
            conditions += " AND FCRE_ID_TIPO_CREDITO IS NULL";
        } else if (this.getFcreIdTipoCredito() != null) {
            conditions += " AND FCRE_ID_TIPO_CREDITO = ?";
            values.add(this.getFcreIdTipoCredito());
        }

        if (this.getFcreProductoCredito() != null && "null".equals(this.getFcreProductoCredito())) {
            conditions += " AND FCRE_PRODUCTO_CREDITO IS NULL";
        } else if (this.getFcreProductoCredito() != null) {
            conditions += " AND FCRE_PRODUCTO_CREDITO = ?";
            values.add(this.getFcreProductoCredito());
        }

        if (this.getFcreImpCredito() != null && this.getFcreImpCredito().longValue() == -999) {
            conditions += " AND FCRE_IMP_CREDITO IS NULL";
        } else if (this.getFcreImpCredito() != null) {
            conditions += " AND FCRE_IMP_CREDITO = ?";
            values.add(this.getFcreImpCredito());
        }

        if (this.getFcreTasa() != null && this.getFcreTasa().longValue() == -999) {
            conditions += " AND FCRE_TASA IS NULL";
        } else if (this.getFcreTasa() != null) {
            conditions += " AND FCRE_TASA = ?";
            values.add(this.getFcreTasa());
        }

        if (this.getFcrePagos() != null && this.getFcrePagos().longValue() == -999) {
            conditions += " AND FCRE_PAGOS IS NULL";
        } else if (this.getFcrePagos() != null) {
            conditions += " AND FCRE_PAGOS = ?";
            values.add(this.getFcrePagos());
        }

        if (this.getFcreImpGarantia() != null && this.getFcreImpGarantia().longValue() == -999) {
            conditions += " AND FCRE_IMP_GARANTIA IS NULL";
        } else if (this.getFcreImpGarantia() != null) {
            conditions += " AND FCRE_IMP_GARANTIA = ?";
            values.add(this.getFcreImpGarantia());
        }

        if (this.getFcrePjeGarantia() != null && this.getFcrePjeGarantia().longValue() == -999) {
            conditions += " AND FCRE_PJE_GARANTIA IS NULL";
        } else if (this.getFcrePjeGarantia() != null) {
            conditions += " AND FCRE_PJE_GARANTIA = ?";
            values.add(this.getFcrePjeGarantia());
        }

        if (this.getFcreMoneda() != null && this.getFcreMoneda().longValue() == -999) {
            conditions += " AND FCRE_MONEDA IS NULL";
        } else if (this.getFcreMoneda() != null) {
            conditions += " AND FCRE_MONEDA = ?";
            values.add(this.getFcreMoneda());
        }

        if (this.getFcreFecSuscripcion() != null && "null".equals(this.getFcreFecSuscripcion())) {
            conditions += " AND FCRE_FEC_SUSCRIPCION IS NULL";
        } else if (this.getFcreFecSuscripcion() != null) {
            conditions += " AND FCRE_FEC_SUSCRIPCION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcreFecSuscripcion());
        }

        if (this.getFcreFecVencimiento() != null && "null".equals(this.getFcreFecVencimiento())) {
            conditions += " AND FCRE_FEC_VENCIMIENTO IS NULL";
        } else if (this.getFcreFecVencimiento() != null) {
            conditions += " AND FCRE_FEC_VENCIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcreFecVencimiento());
        }

        if (this.getFcreNumDisposiciones() != null && this.getFcreNumDisposiciones().longValue() == -999) {
            conditions += " AND FCRE_NUM_DISPOSICIONES IS NULL";
        } else if (this.getFcreNumDisposiciones() != null) {
            conditions += " AND FCRE_NUM_DISPOSICIONES = ?";
            values.add(this.getFcreNumDisposiciones());
        }

        if (this.getFcreImpDisposiciones() != null && this.getFcreImpDisposiciones().longValue() == -999) {
            conditions += " AND FCRE_IMP_DISPOSICIONES IS NULL";
        } else if (this.getFcreImpDisposiciones() != null) {
            conditions += " AND FCRE_IMP_DISPOSICIONES = ?";
            values.add(this.getFcreImpDisposiciones());
        }

        if (this.getFcreNumInstitucion() != null && this.getFcreNumInstitucion().longValue() == -999) {
            conditions += " AND FCRE_NUM_INSTITUCION IS NULL";
        } else if (this.getFcreNumInstitucion() != null) {
            conditions += " AND FCRE_NUM_INSTITUCION = ?";
            values.add(this.getFcreNumInstitucion());
        }

        if (this.getFcreImpGarLiberada() != null && this.getFcreImpGarLiberada().longValue() == -999) {
            conditions += " AND FCRE_IMP_GAR_LIBERADA IS NULL";
        } else if (this.getFcreImpGarLiberada() != null) {
            conditions += " AND FCRE_IMP_GAR_LIBERADA = ?";
            values.add(this.getFcreImpGarLiberada());
        }

        if (this.getFcreImpGarAport() != null && this.getFcreImpGarAport().longValue() == -999) {
            conditions += " AND FCRE_IMP_GAR_APORT IS NULL";
        } else if (this.getFcreImpGarAport() != null) {
            conditions += " AND FCRE_IMP_GAR_APORT = ?";
            values.add(this.getFcreImpGarAport());
        }

        if (this.getFcreNumNotario() != null && this.getFcreNumNotario().longValue() == -999) {
            conditions += " AND FCRE_NUM_NOTARIO IS NULL";
        } else if (this.getFcreNumNotario() != null) {
            conditions += " AND FCRE_NUM_NOTARIO = ?";
            values.add(this.getFcreNumNotario());
        }

        if (this.getFcreLocalidad() != null && "null".equals(this.getFcreLocalidad())) {
            conditions += " AND FCRE_LOCALIDAD IS NULL";
        } else if (this.getFcreLocalidad() != null) {
            conditions += " AND FCRE_LOCALIDAD = ?";
            values.add(this.getFcreLocalidad());
        }

        if (this.getFcreRegistro() != null && "null".equals(this.getFcreRegistro())) {
            conditions += " AND FCRE_REGISTRO IS NULL";
        } else if (this.getFcreRegistro() != null) {
            conditions += " AND FCRE_REGISTRO = ?";
            values.add(this.getFcreRegistro());
        }

        if (this.getFcreStCredito() != null && "null".equals(this.getFcreStCredito())) {
            conditions += " AND FCRE_ST_CREDITO IS NULL";
        } else if (this.getFcreStCredito() != null) {
            conditions += " AND FCRE_ST_CREDITO = ?";
            values.add(this.getFcreStCredito());
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
        String sql = "UPDATE F_CREGARL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCRE_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFcreIdFideicomiso());
        conditions += " AND FCRE_ID_CREDITO = ?";
        pkValues.add(this.getFcreIdCredito());
        conditions += " AND FCRE_ID_TIPO_CREDITO = ?";
        pkValues.add(this.getFcreIdTipoCredito());
        fields += " FCRE_PRODUCTO_CREDITO = ?, ";
        values.add(this.getFcreProductoCredito());
        fields += " FCRE_IMP_CREDITO = ?, ";
        values.add(this.getFcreImpCredito());
        fields += " FCRE_TASA = ?, ";
        values.add(this.getFcreTasa());
        fields += " FCRE_PAGOS = ?, ";
        values.add(this.getFcrePagos());
        fields += " FCRE_IMP_GARANTIA = ?, ";
        values.add(this.getFcreImpGarantia());
        fields += " FCRE_PJE_GARANTIA = ?, ";
        values.add(this.getFcrePjeGarantia());
        fields += " FCRE_MONEDA = ?, ";
        values.add(this.getFcreMoneda());
        fields += " FCRE_FEC_SUSCRIPCION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcreFecSuscripcion());
        fields += " FCRE_FEC_VENCIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFcreFecVencimiento());
        fields += " FCRE_NUM_DISPOSICIONES = ?, ";
        values.add(this.getFcreNumDisposiciones());
        fields += " FCRE_IMP_DISPOSICIONES = ?, ";
        values.add(this.getFcreImpDisposiciones());
        fields += " FCRE_NUM_INSTITUCION = ?, ";
        values.add(this.getFcreNumInstitucion());
        fields += " FCRE_IMP_GAR_LIBERADA = ?, ";
        values.add(this.getFcreImpGarLiberada());
        fields += " FCRE_IMP_GAR_APORT = ?, ";
        values.add(this.getFcreImpGarAport());
        fields += " FCRE_NUM_NOTARIO = ?, ";
        values.add(this.getFcreNumNotario());
        fields += " FCRE_LOCALIDAD = ?, ";
        values.add(this.getFcreLocalidad());
        fields += " FCRE_REGISTRO = ?, ";
        values.add(this.getFcreRegistro());
        fields += " FCRE_ST_CREDITO = ?, ";
        values.add(this.getFcreStCredito());
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
        String sql = "INSERT INTO F_CREGARL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCRE_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFcreIdFideicomiso());

        fields += ", FCRE_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreIdCredito());

        fields += ", FCRE_ID_TIPO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreIdTipoCredito());

        fields += ", FCRE_PRODUCTO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreProductoCredito());

        fields += ", FCRE_IMP_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreImpCredito());

        fields += ", FCRE_TASA";
        fieldValues += ", ?";
        values.add(this.getFcreTasa());

        fields += ", FCRE_PAGOS";
        fieldValues += ", ?";
        values.add(this.getFcrePagos());

        fields += ", FCRE_IMP_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFcreImpGarantia());

        fields += ", FCRE_PJE_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFcrePjeGarantia());

        fields += ", FCRE_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFcreMoneda());

        fields += ", FCRE_FEC_SUSCRIPCION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcreFecSuscripcion());

        fields += ", FCRE_FEC_VENCIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcreFecVencimiento());

        fields += ", FCRE_NUM_DISPOSICIONES";
        fieldValues += ", ?";
        values.add(this.getFcreNumDisposiciones());

        fields += ", FCRE_IMP_DISPOSICIONES";
        fieldValues += ", ?";
        values.add(this.getFcreImpDisposiciones());

        fields += ", FCRE_NUM_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getFcreNumInstitucion());

        fields += ", FCRE_IMP_GAR_LIBERADA";
        fieldValues += ", ?";
        values.add(this.getFcreImpGarLiberada());

        fields += ", FCRE_IMP_GAR_APORT";
        fieldValues += ", ?";
        values.add(this.getFcreImpGarAport());

        fields += ", FCRE_NUM_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getFcreNumNotario());

        fields += ", FCRE_LOCALIDAD";
        fieldValues += ", ?";
        values.add(this.getFcreLocalidad());

        fields += ", FCRE_REGISTRO";
        fieldValues += ", ?";
        values.add(this.getFcreRegistro());

        fields += ", FCRE_ST_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFcreStCredito());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CREGARL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCRE_ID_FIDEICOMISO = ?";
        values.add(this.getFcreIdFideicomiso());
        conditions += " AND FCRE_ID_CREDITO = ?";
        values.add(this.getFcreIdCredito());
        conditions += " AND FCRE_ID_TIPO_CREDITO = ?";
        values.add(this.getFcreIdTipoCredito());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCregarl instance = (FCregarl) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcreIdFideicomiso().equals(instance.getFcreIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFcreIdCredito().equals(instance.getFcreIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFcreIdTipoCredito().equals(instance.getFcreIdTipoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFcreProductoCredito().equals(instance.getFcreProductoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpCredito().equals(instance.getFcreImpCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFcreTasa().equals(instance.getFcreTasa()))
            equalObjects = false;
        if (equalObjects && !this.getFcrePagos().equals(instance.getFcrePagos()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpGarantia().equals(instance.getFcreImpGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFcrePjeGarantia().equals(instance.getFcrePjeGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFcreMoneda().equals(instance.getFcreMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFecSuscripcion().equals(instance.getFcreFecSuscripcion()))
            equalObjects = false;
        if (equalObjects && !this.getFcreFecVencimiento().equals(instance.getFcreFecVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getFcreNumDisposiciones().equals(instance.getFcreNumDisposiciones()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpDisposiciones().equals(instance.getFcreImpDisposiciones()))
            equalObjects = false;
        if (equalObjects && !this.getFcreNumInstitucion().equals(instance.getFcreNumInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpGarLiberada().equals(instance.getFcreImpGarLiberada()))
            equalObjects = false;
        if (equalObjects && !this.getFcreImpGarAport().equals(instance.getFcreImpGarAport()))
            equalObjects = false;
        if (equalObjects && !this.getFcreNumNotario().equals(instance.getFcreNumNotario()))
            equalObjects = false;
        if (equalObjects && !this.getFcreLocalidad().equals(instance.getFcreLocalidad()))
            equalObjects = false;
        if (equalObjects && !this.getFcreRegistro().equals(instance.getFcreRegistro()))
            equalObjects = false;
        if (equalObjects && !this.getFcreStCredito().equals(instance.getFcreStCredito()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCregarl result = new FCregarl();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcreIdFideicomiso((BigDecimal) objectData.getData("FCRE_ID_FIDEICOMISO"));
        result.setFcreIdCredito((String) objectData.getData("FCRE_ID_CREDITO"));
        result.setFcreIdTipoCredito((String) objectData.getData("FCRE_ID_TIPO_CREDITO"));
        result.setFcreProductoCredito((String) objectData.getData("FCRE_PRODUCTO_CREDITO"));
        result.setFcreImpCredito((BigDecimal) objectData.getData("FCRE_IMP_CREDITO"));
        result.setFcreTasa((BigDecimal) objectData.getData("FCRE_TASA"));
        result.setFcrePagos((BigDecimal) objectData.getData("FCRE_PAGOS"));
        result.setFcreImpGarantia((BigDecimal) objectData.getData("FCRE_IMP_GARANTIA"));
        result.setFcrePjeGarantia((BigDecimal) objectData.getData("FCRE_PJE_GARANTIA"));
        result.setFcreMoneda((BigDecimal) objectData.getData("FCRE_MONEDA"));
        result.setFcreFecSuscripcion((String) objectData.getData("FCRE_FEC_SUSCRIPCION"));
        result.setFcreFecVencimiento((String) objectData.getData("FCRE_FEC_VENCIMIENTO"));
        result.setFcreNumDisposiciones((BigDecimal) objectData.getData("FCRE_NUM_DISPOSICIONES"));
        result.setFcreImpDisposiciones((BigDecimal) objectData.getData("FCRE_IMP_DISPOSICIONES"));
        result.setFcreNumInstitucion((BigDecimal) objectData.getData("FCRE_NUM_INSTITUCION"));
        result.setFcreImpGarLiberada((BigDecimal) objectData.getData("FCRE_IMP_GAR_LIBERADA"));
        result.setFcreImpGarAport((BigDecimal) objectData.getData("FCRE_IMP_GAR_APORT"));
        result.setFcreNumNotario((BigDecimal) objectData.getData("FCRE_NUM_NOTARIO"));
        result.setFcreLocalidad((String) objectData.getData("FCRE_LOCALIDAD"));
        result.setFcreRegistro((String) objectData.getData("FCRE_REGISTRO"));
        result.setFcreStCredito((String) objectData.getData("FCRE_ST_CREDITO"));

        return result;

    }

}
