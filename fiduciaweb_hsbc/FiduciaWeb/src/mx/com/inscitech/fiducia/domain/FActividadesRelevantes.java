package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ACTIVIDADES_RELEVANTES_PK", columns = { "FAR_ID_TIPO_OPERACION", "FAR_ID_CONTRATO" }, sequences = { "MANUAL" })
public class FActividadesRelevantes extends DomainObject {

    BigDecimal farIdTipoOperacion = null;
    BigDecimal farIdContrato = null;
    BigDecimal farValidaDeposito = null;
    BigDecimal farImpDeposito = null;
    BigDecimal farImpMesDeposito = null;
    BigDecimal farImpDepositoExt = null;
    BigDecimal farImpMesDepositoExt = null;
    BigDecimal farValidaRetiro = null;
    BigDecimal farImpRetiro = null;
    BigDecimal farImpMesRetiro = null;
    BigDecimal farImpRetiroExt = null;
    BigDecimal farImpMesRetiroExt = null;
    BigDecimal farValidaDepositoEftvo = null;
    BigDecimal farImpDepositoEftvo = null;
    BigDecimal farImpMesDepositoEftvo = null;
    BigDecimal farValidaMonedaEftvo = null;
    BigDecimal farImpDepositoEftvoExt = null;
    BigDecimal farImpMesDepositoEftvoExt = null;
    String farCveStActividad = null;

    public FActividadesRelevantes() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFarIdTipoOperacion(BigDecimal farIdTipoOperacion) {
        this.farIdTipoOperacion = farIdTipoOperacion;
    }

    public BigDecimal getFarIdTipoOperacion() {
        return this.farIdTipoOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFarIdContrato(BigDecimal farIdContrato) {
        this.farIdContrato = farIdContrato;
    }

    public BigDecimal getFarIdContrato() {
        return this.farIdContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFarValidaDeposito(BigDecimal farValidaDeposito) {
        this.farValidaDeposito = farValidaDeposito;
    }

    public BigDecimal getFarValidaDeposito() {
        return this.farValidaDeposito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpDeposito(BigDecimal farImpDeposito) {
        this.farImpDeposito = farImpDeposito;
    }

    public BigDecimal getFarImpDeposito() {
        return this.farImpDeposito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpMesDeposito(BigDecimal farImpMesDeposito) {
        this.farImpMesDeposito = farImpMesDeposito;
    }

    public BigDecimal getFarImpMesDeposito() {
        return this.farImpMesDeposito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpDepositoExt(BigDecimal farImpDepositoExt) {
        this.farImpDepositoExt = farImpDepositoExt;
    }

    public BigDecimal getFarImpDepositoExt() {
        return this.farImpDepositoExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpMesDepositoExt(BigDecimal farImpMesDepositoExt) {
        this.farImpMesDepositoExt = farImpMesDepositoExt;
    }

    public BigDecimal getFarImpMesDepositoExt() {
        return this.farImpMesDepositoExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFarValidaRetiro(BigDecimal farValidaRetiro) {
        this.farValidaRetiro = farValidaRetiro;
    }

    public BigDecimal getFarValidaRetiro() {
        return this.farValidaRetiro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpRetiro(BigDecimal farImpRetiro) {
        this.farImpRetiro = farImpRetiro;
    }

    public BigDecimal getFarImpRetiro() {
        return this.farImpRetiro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpMesRetiro(BigDecimal farImpMesRetiro) {
        this.farImpMesRetiro = farImpMesRetiro;
    }

    public BigDecimal getFarImpMesRetiro() {
        return this.farImpMesRetiro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpRetiroExt(BigDecimal farImpRetiroExt) {
        this.farImpRetiroExt = farImpRetiroExt;
    }

    public BigDecimal getFarImpRetiroExt() {
        return this.farImpRetiroExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpMesRetiroExt(BigDecimal farImpMesRetiroExt) {
        this.farImpMesRetiroExt = farImpMesRetiroExt;
    }

    public BigDecimal getFarImpMesRetiroExt() {
        return this.farImpMesRetiroExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFarValidaDepositoEftvo(BigDecimal farValidaDepositoEftvo) {
        this.farValidaDepositoEftvo = farValidaDepositoEftvo;
    }

    public BigDecimal getFarValidaDepositoEftvo() {
        return this.farValidaDepositoEftvo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpDepositoEftvo(BigDecimal farImpDepositoEftvo) {
        this.farImpDepositoEftvo = farImpDepositoEftvo;
    }

    public BigDecimal getFarImpDepositoEftvo() {
        return this.farImpDepositoEftvo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpMesDepositoEftvo(BigDecimal farImpMesDepositoEftvo) {
        this.farImpMesDepositoEftvo = farImpMesDepositoEftvo;
    }

    public BigDecimal getFarImpMesDepositoEftvo() {
        return this.farImpMesDepositoEftvo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFarValidaMonedaEftvo(BigDecimal farValidaMonedaEftvo) {
        this.farValidaMonedaEftvo = farValidaMonedaEftvo;
    }

    public BigDecimal getFarValidaMonedaEftvo() {
        return this.farValidaMonedaEftvo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpDepositoEftvoExt(BigDecimal farImpDepositoEftvoExt) {
        this.farImpDepositoEftvoExt = farImpDepositoEftvoExt;
    }

    public BigDecimal getFarImpDepositoEftvoExt() {
        return this.farImpDepositoEftvoExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFarImpMesDepositoEftvoExt(BigDecimal farImpMesDepositoEftvoExt) {
        this.farImpMesDepositoEftvoExt = farImpMesDepositoEftvoExt;
    }

    public BigDecimal getFarImpMesDepositoEftvoExt() {
        return this.farImpMesDepositoEftvoExt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFarCveStActividad(String farCveStActividad) {
        this.farCveStActividad = farCveStActividad;
    }

    public String getFarCveStActividad() {
        return this.farCveStActividad;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ACTIVIDADES_RELEVANTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFarIdTipoOperacion() != null && this.getFarIdTipoOperacion().longValue() == -999) {
            conditions += " AND FAR_ID_TIPO_OPERACION IS NULL";
        } else if (this.getFarIdTipoOperacion() != null) {
            conditions += " AND FAR_ID_TIPO_OPERACION = ?";
            values.add(this.getFarIdTipoOperacion());
        }

        if (this.getFarIdContrato() != null && this.getFarIdContrato().longValue() == -999) {
            conditions += " AND FAR_ID_CONTRATO IS NULL";
        } else if (this.getFarIdContrato() != null) {
            conditions += " AND FAR_ID_CONTRATO = ?";
            values.add(this.getFarIdContrato());
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
        String sql = "SELECT * FROM F_ACTIVIDADES_RELEVANTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFarIdTipoOperacion() != null && this.getFarIdTipoOperacion().longValue() == -999) {
            conditions += " AND FAR_ID_TIPO_OPERACION IS NULL";
        } else if (this.getFarIdTipoOperacion() != null) {
            conditions += " AND FAR_ID_TIPO_OPERACION = ?";
            values.add(this.getFarIdTipoOperacion());
        }

        if (this.getFarIdContrato() != null && this.getFarIdContrato().longValue() == -999) {
            conditions += " AND FAR_ID_CONTRATO IS NULL";
        } else if (this.getFarIdContrato() != null) {
            conditions += " AND FAR_ID_CONTRATO = ?";
            values.add(this.getFarIdContrato());
        }

        if (this.getFarValidaDeposito() != null && this.getFarValidaDeposito().longValue() == -999) {
            conditions += " AND FAR_VALIDA_DEPOSITO IS NULL";
        } else if (this.getFarValidaDeposito() != null) {
            conditions += " AND FAR_VALIDA_DEPOSITO = ?";
            values.add(this.getFarValidaDeposito());
        }

        if (this.getFarImpDeposito() != null && this.getFarImpDeposito().longValue() == -999) {
            conditions += " AND FAR_IMP_DEPOSITO IS NULL";
        } else if (this.getFarImpDeposito() != null) {
            conditions += " AND FAR_IMP_DEPOSITO = ?";
            values.add(this.getFarImpDeposito());
        }

        if (this.getFarImpMesDeposito() != null && this.getFarImpMesDeposito().longValue() == -999) {
            conditions += " AND FAR_IMP_MES_DEPOSITO IS NULL";
        } else if (this.getFarImpMesDeposito() != null) {
            conditions += " AND FAR_IMP_MES_DEPOSITO = ?";
            values.add(this.getFarImpMesDeposito());
        }

        if (this.getFarImpDepositoExt() != null && this.getFarImpDepositoExt().longValue() == -999) {
            conditions += " AND FAR_IMP_DEPOSITO_EXT IS NULL";
        } else if (this.getFarImpDepositoExt() != null) {
            conditions += " AND FAR_IMP_DEPOSITO_EXT = ?";
            values.add(this.getFarImpDepositoExt());
        }

        if (this.getFarImpMesDepositoExt() != null && this.getFarImpMesDepositoExt().longValue() == -999) {
            conditions += " AND FAR_IMP_MES_DEPOSITO_EXT IS NULL";
        } else if (this.getFarImpMesDepositoExt() != null) {
            conditions += " AND FAR_IMP_MES_DEPOSITO_EXT = ?";
            values.add(this.getFarImpMesDepositoExt());
        }

        if (this.getFarValidaRetiro() != null && this.getFarValidaRetiro().longValue() == -999) {
            conditions += " AND FAR_VALIDA_RETIRO IS NULL";
        } else if (this.getFarValidaRetiro() != null) {
            conditions += " AND FAR_VALIDA_RETIRO = ?";
            values.add(this.getFarValidaRetiro());
        }

        if (this.getFarImpRetiro() != null && this.getFarImpRetiro().longValue() == -999) {
            conditions += " AND FAR_IMP_RETIRO IS NULL";
        } else if (this.getFarImpRetiro() != null) {
            conditions += " AND FAR_IMP_RETIRO = ?";
            values.add(this.getFarImpRetiro());
        }

        if (this.getFarImpMesRetiro() != null && this.getFarImpMesRetiro().longValue() == -999) {
            conditions += " AND FAR_IMP_MES_RETIRO IS NULL";
        } else if (this.getFarImpMesRetiro() != null) {
            conditions += " AND FAR_IMP_MES_RETIRO = ?";
            values.add(this.getFarImpMesRetiro());
        }

        if (this.getFarImpRetiroExt() != null && this.getFarImpRetiroExt().longValue() == -999) {
            conditions += " AND FAR_IMP_RETIRO_EXT IS NULL";
        } else if (this.getFarImpRetiroExt() != null) {
            conditions += " AND FAR_IMP_RETIRO_EXT = ?";
            values.add(this.getFarImpRetiroExt());
        }

        if (this.getFarImpMesRetiroExt() != null && this.getFarImpMesRetiroExt().longValue() == -999) {
            conditions += " AND FAR_IMP_MES_RETIRO_EXT IS NULL";
        } else if (this.getFarImpMesRetiroExt() != null) {
            conditions += " AND FAR_IMP_MES_RETIRO_EXT = ?";
            values.add(this.getFarImpMesRetiroExt());
        }

        if (this.getFarValidaDepositoEftvo() != null && this.getFarValidaDepositoEftvo().longValue() == -999) {
            conditions += " AND FAR_VALIDA_DEPOSITO_EFTVO IS NULL";
        } else if (this.getFarValidaDepositoEftvo() != null) {
            conditions += " AND FAR_VALIDA_DEPOSITO_EFTVO = ?";
            values.add(this.getFarValidaDepositoEftvo());
        }

        if (this.getFarImpDepositoEftvo() != null && this.getFarImpDepositoEftvo().longValue() == -999) {
            conditions += " AND FAR_IMP_DEPOSITO_EFTVO IS NULL";
        } else if (this.getFarImpDepositoEftvo() != null) {
            conditions += " AND FAR_IMP_DEPOSITO_EFTVO = ?";
            values.add(this.getFarImpDepositoEftvo());
        }

        if (this.getFarImpMesDepositoEftvo() != null && this.getFarImpMesDepositoEftvo().longValue() == -999) {
            conditions += " AND FAR_IMP_MES_DEPOSITO_EFTVO IS NULL";
        } else if (this.getFarImpMesDepositoEftvo() != null) {
            conditions += " AND FAR_IMP_MES_DEPOSITO_EFTVO = ?";
            values.add(this.getFarImpMesDepositoEftvo());
        }

        if (this.getFarValidaMonedaEftvo() != null && this.getFarValidaMonedaEftvo().longValue() == -999) {
            conditions += " AND FAR_VALIDA_MONEDA_EFTVO IS NULL";
        } else if (this.getFarValidaMonedaEftvo() != null) {
            conditions += " AND FAR_VALIDA_MONEDA_EFTVO = ?";
            values.add(this.getFarValidaMonedaEftvo());
        }

        if (this.getFarImpDepositoEftvoExt() != null && this.getFarImpDepositoEftvoExt().longValue() == -999) {
            conditions += " AND FAR_IMP_DEPOSITO_EFTVO_EXT IS NULL";
        } else if (this.getFarImpDepositoEftvoExt() != null) {
            conditions += " AND FAR_IMP_DEPOSITO_EFTVO_EXT = ?";
            values.add(this.getFarImpDepositoEftvoExt());
        }

        if (this.getFarImpMesDepositoEftvoExt() != null && this.getFarImpMesDepositoEftvoExt().longValue() == -999) {
            conditions += " AND FAR_IMP_MES_DEPOSITO_EFTVO_EXT IS NULL";
        } else if (this.getFarImpMesDepositoEftvoExt() != null) {
            conditions += " AND FAR_IMP_MES_DEPOSITO_EFTVO_EXT = ?";
            values.add(this.getFarImpMesDepositoEftvoExt());
        }

        if (this.getFarCveStActividad() != null && "null".equals(this.getFarCveStActividad())) {
            conditions += " AND FAR_CVE_ST_ACTIVIDAD IS NULL";
        } else if (this.getFarCveStActividad() != null) {
            conditions += " AND FAR_CVE_ST_ACTIVIDAD = ?";
            values.add(this.getFarCveStActividad());
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
        String sql = "UPDATE F_ACTIVIDADES_RELEVANTES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FAR_ID_TIPO_OPERACION = ?";
        pkValues.add(this.getFarIdTipoOperacion());
        conditions += " AND FAR_ID_CONTRATO = ?";
        pkValues.add(this.getFarIdContrato());
        fields += " FAR_VALIDA_DEPOSITO = ?, ";
        values.add(this.getFarValidaDeposito());
        fields += " FAR_IMP_DEPOSITO = ?, ";
        values.add(this.getFarImpDeposito());
        fields += " FAR_IMP_MES_DEPOSITO = ?, ";
        values.add(this.getFarImpMesDeposito());
        fields += " FAR_IMP_DEPOSITO_EXT = ?, ";
        values.add(this.getFarImpDepositoExt());
        fields += " FAR_IMP_MES_DEPOSITO_EXT = ?, ";
        values.add(this.getFarImpMesDepositoExt());
        fields += " FAR_VALIDA_RETIRO = ?, ";
        values.add(this.getFarValidaRetiro());
        fields += " FAR_IMP_RETIRO = ?, ";
        values.add(this.getFarImpRetiro());
        fields += " FAR_IMP_MES_RETIRO = ?, ";
        values.add(this.getFarImpMesRetiro());
        fields += " FAR_IMP_RETIRO_EXT = ?, ";
        values.add(this.getFarImpRetiroExt());
        fields += " FAR_IMP_MES_RETIRO_EXT = ?, ";
        values.add(this.getFarImpMesRetiroExt());
        fields += " FAR_VALIDA_DEPOSITO_EFTVO = ?, ";
        values.add(this.getFarValidaDepositoEftvo());
        fields += " FAR_IMP_DEPOSITO_EFTVO = ?, ";
        values.add(this.getFarImpDepositoEftvo());
        fields += " FAR_IMP_MES_DEPOSITO_EFTVO = ?, ";
        values.add(this.getFarImpMesDepositoEftvo());
        fields += " FAR_VALIDA_MONEDA_EFTVO = ?, ";
        values.add(this.getFarValidaMonedaEftvo());
        fields += " FAR_IMP_DEPOSITO_EFTVO_EXT = ?, ";
        values.add(this.getFarImpDepositoEftvoExt());
        fields += " FAR_IMP_MES_DEPOSITO_EFTVO_EXT = ?, ";
        values.add(this.getFarImpMesDepositoEftvoExt());
        fields += " FAR_CVE_ST_ACTIVIDAD = ?, ";
        values.add(this.getFarCveStActividad());
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
        String sql = "INSERT INTO F_ACTIVIDADES_RELEVANTES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FAR_ID_TIPO_OPERACION";
        fieldValues += ", ?";
        values.add(this.getFarIdTipoOperacion());

        fields += ", FAR_ID_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFarIdContrato());

        fields += ", FAR_VALIDA_DEPOSITO";
        fieldValues += ", ?";
        values.add(this.getFarValidaDeposito());

        fields += ", FAR_IMP_DEPOSITO";
        fieldValues += ", ?";
        values.add(this.getFarImpDeposito());

        fields += ", FAR_IMP_MES_DEPOSITO";
        fieldValues += ", ?";
        values.add(this.getFarImpMesDeposito());

        fields += ", FAR_IMP_DEPOSITO_EXT";
        fieldValues += ", ?";
        values.add(this.getFarImpDepositoExt());

        fields += ", FAR_IMP_MES_DEPOSITO_EXT";
        fieldValues += ", ?";
        values.add(this.getFarImpMesDepositoExt());

        fields += ", FAR_VALIDA_RETIRO";
        fieldValues += ", ?";
        values.add(this.getFarValidaRetiro());

        fields += ", FAR_IMP_RETIRO";
        fieldValues += ", ?";
        values.add(this.getFarImpRetiro());

        fields += ", FAR_IMP_MES_RETIRO";
        fieldValues += ", ?";
        values.add(this.getFarImpMesRetiro());

        fields += ", FAR_IMP_RETIRO_EXT";
        fieldValues += ", ?";
        values.add(this.getFarImpRetiroExt());

        fields += ", FAR_IMP_MES_RETIRO_EXT";
        fieldValues += ", ?";
        values.add(this.getFarImpMesRetiroExt());

        fields += ", FAR_VALIDA_DEPOSITO_EFTVO";
        fieldValues += ", ?";
        values.add(this.getFarValidaDepositoEftvo());

        fields += ", FAR_IMP_DEPOSITO_EFTVO";
        fieldValues += ", ?";
        values.add(this.getFarImpDepositoEftvo());

        fields += ", FAR_IMP_MES_DEPOSITO_EFTVO";
        fieldValues += ", ?";
        values.add(this.getFarImpMesDepositoEftvo());

        fields += ", FAR_VALIDA_MONEDA_EFTVO";
        fieldValues += ", ?";
        values.add(this.getFarValidaMonedaEftvo());

        fields += ", FAR_IMP_DEPOSITO_EFTVO_EXT";
        fieldValues += ", ?";
        values.add(this.getFarImpDepositoEftvoExt());

        fields += ", FAR_IMP_MES_DEPOSITO_EFTVO_EXT";
        fieldValues += ", ?";
        values.add(this.getFarImpMesDepositoEftvoExt());

        fields += ", FAR_CVE_ST_ACTIVIDAD";
        fieldValues += ", ?";
        values.add(this.getFarCveStActividad());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ACTIVIDADES_RELEVANTES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FAR_ID_TIPO_OPERACION = ?";
        values.add(this.getFarIdTipoOperacion());
        conditions += " AND FAR_ID_CONTRATO = ?";
        values.add(this.getFarIdContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FActividadesRelevantes instance = (FActividadesRelevantes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFarIdTipoOperacion().equals(instance.getFarIdTipoOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getFarIdContrato().equals(instance.getFarIdContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFarValidaDeposito().equals(instance.getFarValidaDeposito()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpDeposito().equals(instance.getFarImpDeposito()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpMesDeposito().equals(instance.getFarImpMesDeposito()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpDepositoExt().equals(instance.getFarImpDepositoExt()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpMesDepositoExt().equals(instance.getFarImpMesDepositoExt()))
            equalObjects = false;
        if (equalObjects && !this.getFarValidaRetiro().equals(instance.getFarValidaRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpRetiro().equals(instance.getFarImpRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpMesRetiro().equals(instance.getFarImpMesRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpRetiroExt().equals(instance.getFarImpRetiroExt()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpMesRetiroExt().equals(instance.getFarImpMesRetiroExt()))
            equalObjects = false;
        if (equalObjects && !this.getFarValidaDepositoEftvo().equals(instance.getFarValidaDepositoEftvo()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpDepositoEftvo().equals(instance.getFarImpDepositoEftvo()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpMesDepositoEftvo().equals(instance.getFarImpMesDepositoEftvo()))
            equalObjects = false;
        if (equalObjects && !this.getFarValidaMonedaEftvo().equals(instance.getFarValidaMonedaEftvo()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpDepositoEftvoExt().equals(instance.getFarImpDepositoEftvoExt()))
            equalObjects = false;
        if (equalObjects && !this.getFarImpMesDepositoEftvoExt().equals(instance.getFarImpMesDepositoEftvoExt()))
            equalObjects = false;
        if (equalObjects && !this.getFarCveStActividad().equals(instance.getFarCveStActividad()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FActividadesRelevantes result = new FActividadesRelevantes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFarIdTipoOperacion((BigDecimal) objectData.getData("FAR_ID_TIPO_OPERACION"));
        result.setFarIdContrato((BigDecimal) objectData.getData("FAR_ID_CONTRATO"));
        result.setFarValidaDeposito((BigDecimal) objectData.getData("FAR_VALIDA_DEPOSITO"));
        result.setFarImpDeposito((BigDecimal) objectData.getData("FAR_IMP_DEPOSITO"));
        result.setFarImpMesDeposito((BigDecimal) objectData.getData("FAR_IMP_MES_DEPOSITO"));
        result.setFarImpDepositoExt((BigDecimal) objectData.getData("FAR_IMP_DEPOSITO_EXT"));
        result.setFarImpMesDepositoExt((BigDecimal) objectData.getData("FAR_IMP_MES_DEPOSITO_EXT"));
        result.setFarValidaRetiro((BigDecimal) objectData.getData("FAR_VALIDA_RETIRO"));
        result.setFarImpRetiro((BigDecimal) objectData.getData("FAR_IMP_RETIRO"));
        result.setFarImpMesRetiro((BigDecimal) objectData.getData("FAR_IMP_MES_RETIRO"));
        result.setFarImpRetiroExt((BigDecimal) objectData.getData("FAR_IMP_RETIRO_EXT"));
        result.setFarImpMesRetiroExt((BigDecimal) objectData.getData("FAR_IMP_MES_RETIRO_EXT"));
        result.setFarValidaDepositoEftvo((BigDecimal) objectData.getData("FAR_VALIDA_DEPOSITO_EFTVO"));
        result.setFarImpDepositoEftvo((BigDecimal) objectData.getData("FAR_IMP_DEPOSITO_EFTVO"));
        result.setFarImpMesDepositoEftvo((BigDecimal) objectData.getData("FAR_IMP_MES_DEPOSITO_EFTVO"));
        result.setFarValidaMonedaEftvo((BigDecimal) objectData.getData("FAR_VALIDA_MONEDA_EFTVO"));
        result.setFarImpDepositoEftvoExt((BigDecimal) objectData.getData("FAR_IMP_DEPOSITO_EFTVO_EXT"));
        result.setFarImpMesDepositoEftvoExt((BigDecimal) objectData.getData("FAR_IMP_MES_DEPOSITO_EFTVO_EXT"));
        result.setFarCveStActividad((String) objectData.getData("FAR_CVE_ST_ACTIVIDAD"));

        return result;

    }

}
