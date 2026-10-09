package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COMPRAS_ACT_PK",
            columns =
            { "CAC_NUM_CONTRATO", "CAC_ENTIDAD_FIN", "CAC_CONTRATO_INTER", "CAC_NOM_PIZARRA", "CAC_NUM_SERIE_EMIS", "CAC_NUM_CUPON_VIG", "CAC_DIA_COMPRA", "CAC_SEC_DIA_COMPRA"
    }, sequences = { "MANUAL" })
public class ComprasAct extends DomainObject {

    BigDecimal cacNumContrato = null;
    BigDecimal cacEntidadFin = null;
    BigDecimal cacContratoInter = null;
    String cacNomPizarra = null;
    String cacNumSerieEmis = null;
    BigDecimal cacNumCuponVig = null;
    String cacDiaCompra = null;
    BigDecimal cacSecDiaCompra = null;
    BigDecimal cacNumMoneda = null;
    BigDecimal cacPrecioEmision = null;
    BigDecimal cacImpCompra = null;
    BigDecimal cacNumTitCompra = null;
    BigDecimal cacTitDispComp = null;

    public ComprasAct() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCacNumContrato(BigDecimal cacNumContrato) {
        this.cacNumContrato = cacNumContrato;
    }

    public BigDecimal getCacNumContrato() {
        return this.cacNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCacEntidadFin(BigDecimal cacEntidadFin) {
        this.cacEntidadFin = cacEntidadFin;
    }

    public BigDecimal getCacEntidadFin() {
        return this.cacEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCacContratoInter(BigDecimal cacContratoInter) {
        this.cacContratoInter = cacContratoInter;
    }

    public BigDecimal getCacContratoInter() {
        return this.cacContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCacNomPizarra(String cacNomPizarra) {
        this.cacNomPizarra = cacNomPizarra;
    }

    public String getCacNomPizarra() {
        return this.cacNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCacNumSerieEmis(String cacNumSerieEmis) {
        this.cacNumSerieEmis = cacNumSerieEmis;
    }

    public String getCacNumSerieEmis() {
        return this.cacNumSerieEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCacNumCuponVig(BigDecimal cacNumCuponVig) {
        this.cacNumCuponVig = cacNumCuponVig;
    }

    public BigDecimal getCacNumCuponVig() {
        return this.cacNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCacDiaCompra(String cacDiaCompra) {
        this.cacDiaCompra = cacDiaCompra;
    }

    public String getCacDiaCompra() {
        return this.cacDiaCompra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCacSecDiaCompra(BigDecimal cacSecDiaCompra) {
        this.cacSecDiaCompra = cacSecDiaCompra;
    }

    public BigDecimal getCacSecDiaCompra() {
        return this.cacSecDiaCompra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCacNumMoneda(BigDecimal cacNumMoneda) {
        this.cacNumMoneda = cacNumMoneda;
    }

    public BigDecimal getCacNumMoneda() {
        return this.cacNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 32, scale = 11, javaClass = BigDecimal.class)
    public void setCacPrecioEmision(BigDecimal cacPrecioEmision) {
        this.cacPrecioEmision = cacPrecioEmision;
    }

    public BigDecimal getCacPrecioEmision() {
        return this.cacPrecioEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 23, scale = 2, javaClass = BigDecimal.class)
    public void setCacImpCompra(BigDecimal cacImpCompra) {
        this.cacImpCompra = cacImpCompra;
    }

    public BigDecimal getCacImpCompra() {
        return this.cacImpCompra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setCacNumTitCompra(BigDecimal cacNumTitCompra) {
        this.cacNumTitCompra = cacNumTitCompra;
    }

    public BigDecimal getCacNumTitCompra() {
        return this.cacNumTitCompra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setCacTitDispComp(BigDecimal cacTitDispComp) {
        this.cacTitDispComp = cacTitDispComp;
    }

    public BigDecimal getCacTitDispComp() {
        return this.cacTitDispComp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COMPRAS_ACT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCacNumContrato() != null && this.getCacNumContrato().longValue() == -999) {
            conditions += " AND CAC_NUM_CONTRATO IS NULL";
        } else if (this.getCacNumContrato() != null) {
            conditions += " AND CAC_NUM_CONTRATO = ?";
            values.add(this.getCacNumContrato());
        }

        if (this.getCacEntidadFin() != null && this.getCacEntidadFin().longValue() == -999) {
            conditions += " AND CAC_ENTIDAD_FIN IS NULL";
        } else if (this.getCacEntidadFin() != null) {
            conditions += " AND CAC_ENTIDAD_FIN = ?";
            values.add(this.getCacEntidadFin());
        }

        if (this.getCacContratoInter() != null && this.getCacContratoInter().longValue() == -999) {
            conditions += " AND CAC_CONTRATO_INTER IS NULL";
        } else if (this.getCacContratoInter() != null) {
            conditions += " AND CAC_CONTRATO_INTER = ?";
            values.add(this.getCacContratoInter());
        }

        if (this.getCacNomPizarra() != null && "null".equals(this.getCacNomPizarra())) {
            conditions += " AND CAC_NOM_PIZARRA IS NULL";
        } else if (this.getCacNomPizarra() != null) {
            conditions += " AND CAC_NOM_PIZARRA = ?";
            values.add(this.getCacNomPizarra());
        }

        if (this.getCacNumSerieEmis() != null && "null".equals(this.getCacNumSerieEmis())) {
            conditions += " AND CAC_NUM_SERIE_EMIS IS NULL";
        } else if (this.getCacNumSerieEmis() != null) {
            conditions += " AND CAC_NUM_SERIE_EMIS = ?";
            values.add(this.getCacNumSerieEmis());
        }

        if (this.getCacNumCuponVig() != null && this.getCacNumCuponVig().longValue() == -999) {
            conditions += " AND CAC_NUM_CUPON_VIG IS NULL";
        } else if (this.getCacNumCuponVig() != null) {
            conditions += " AND CAC_NUM_CUPON_VIG = ?";
            values.add(this.getCacNumCuponVig());
        }

        if (this.getCacDiaCompra() != null && "null".equals(this.getCacDiaCompra())) {
            conditions += " AND CAC_DIA_COMPRA IS NULL";
        } else if (this.getCacDiaCompra() != null) {
            conditions += " AND CAC_DIA_COMPRA = ?";
            values.add(this.getCacDiaCompra());
        }

        if (this.getCacSecDiaCompra() != null && this.getCacSecDiaCompra().longValue() == -999) {
            conditions += " AND CAC_SEC_DIA_COMPRA IS NULL";
        } else if (this.getCacSecDiaCompra() != null) {
            conditions += " AND CAC_SEC_DIA_COMPRA = ?";
            values.add(this.getCacSecDiaCompra());
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
        String sql = "SELECT * FROM COMPRAS_ACT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCacNumContrato() != null && this.getCacNumContrato().longValue() == -999) {
            conditions += " AND CAC_NUM_CONTRATO IS NULL";
        } else if (this.getCacNumContrato() != null) {
            conditions += " AND CAC_NUM_CONTRATO = ?";
            values.add(this.getCacNumContrato());
        }

        if (this.getCacEntidadFin() != null && this.getCacEntidadFin().longValue() == -999) {
            conditions += " AND CAC_ENTIDAD_FIN IS NULL";
        } else if (this.getCacEntidadFin() != null) {
            conditions += " AND CAC_ENTIDAD_FIN = ?";
            values.add(this.getCacEntidadFin());
        }

        if (this.getCacContratoInter() != null && this.getCacContratoInter().longValue() == -999) {
            conditions += " AND CAC_CONTRATO_INTER IS NULL";
        } else if (this.getCacContratoInter() != null) {
            conditions += " AND CAC_CONTRATO_INTER = ?";
            values.add(this.getCacContratoInter());
        }

        if (this.getCacNomPizarra() != null && "null".equals(this.getCacNomPizarra())) {
            conditions += " AND CAC_NOM_PIZARRA IS NULL";
        } else if (this.getCacNomPizarra() != null) {
            conditions += " AND CAC_NOM_PIZARRA = ?";
            values.add(this.getCacNomPizarra());
        }

        if (this.getCacNumSerieEmis() != null && "null".equals(this.getCacNumSerieEmis())) {
            conditions += " AND CAC_NUM_SERIE_EMIS IS NULL";
        } else if (this.getCacNumSerieEmis() != null) {
            conditions += " AND CAC_NUM_SERIE_EMIS = ?";
            values.add(this.getCacNumSerieEmis());
        }

        if (this.getCacNumCuponVig() != null && this.getCacNumCuponVig().longValue() == -999) {
            conditions += " AND CAC_NUM_CUPON_VIG IS NULL";
        } else if (this.getCacNumCuponVig() != null) {
            conditions += " AND CAC_NUM_CUPON_VIG = ?";
            values.add(this.getCacNumCuponVig());
        }

        if (this.getCacDiaCompra() != null && "null".equals(this.getCacDiaCompra())) {
            conditions += " AND CAC_DIA_COMPRA IS NULL";
        } else if (this.getCacDiaCompra() != null) {
            conditions += " AND CAC_DIA_COMPRA = ?";
            values.add(this.getCacDiaCompra());
        }

        if (this.getCacSecDiaCompra() != null && this.getCacSecDiaCompra().longValue() == -999) {
            conditions += " AND CAC_SEC_DIA_COMPRA IS NULL";
        } else if (this.getCacSecDiaCompra() != null) {
            conditions += " AND CAC_SEC_DIA_COMPRA = ?";
            values.add(this.getCacSecDiaCompra());
        }

        if (this.getCacNumMoneda() != null && this.getCacNumMoneda().longValue() == -999) {
            conditions += " AND CAC_NUM_MONEDA IS NULL";
        } else if (this.getCacNumMoneda() != null) {
            conditions += " AND CAC_NUM_MONEDA = ?";
            values.add(this.getCacNumMoneda());
        }

        if (this.getCacPrecioEmision() != null && this.getCacPrecioEmision().longValue() == -999) {
            conditions += " AND CAC_PRECIO_EMISION IS NULL";
        } else if (this.getCacPrecioEmision() != null) {
            conditions += " AND CAC_PRECIO_EMISION = ?";
            values.add(this.getCacPrecioEmision());
        }

        if (this.getCacImpCompra() != null && this.getCacImpCompra().longValue() == -999) {
            conditions += " AND CAC_IMP_COMPRA IS NULL";
        } else if (this.getCacImpCompra() != null) {
            conditions += " AND CAC_IMP_COMPRA = ?";
            values.add(this.getCacImpCompra());
        }

        if (this.getCacNumTitCompra() != null && this.getCacNumTitCompra().longValue() == -999) {
            conditions += " AND CAC_NUM_TIT_COMPRA IS NULL";
        } else if (this.getCacNumTitCompra() != null) {
            conditions += " AND CAC_NUM_TIT_COMPRA = ?";
            values.add(this.getCacNumTitCompra());
        }

        if (this.getCacTitDispComp() != null && this.getCacTitDispComp().longValue() == -999) {
            conditions += " AND CAC_TIT_DISP_COMP IS NULL";
        } else if (this.getCacTitDispComp() != null) {
            conditions += " AND CAC_TIT_DISP_COMP = ?";
            values.add(this.getCacTitDispComp());
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
        String sql = "UPDATE COMPRAS_ACT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CAC_NUM_CONTRATO = ?";
        pkValues.add(this.getCacNumContrato());
        conditions += " AND CAC_ENTIDAD_FIN = ?";
        pkValues.add(this.getCacEntidadFin());
        conditions += " AND CAC_CONTRATO_INTER = ?";
        pkValues.add(this.getCacContratoInter());
        conditions += " AND CAC_NOM_PIZARRA = ?";
        pkValues.add(this.getCacNomPizarra());
        conditions += " AND CAC_NUM_SERIE_EMIS = ?";
        pkValues.add(this.getCacNumSerieEmis());
        conditions += " AND CAC_NUM_CUPON_VIG = ?";
        pkValues.add(this.getCacNumCuponVig());
        conditions += " AND CAC_DIA_COMPRA = ?";
        pkValues.add(this.getCacDiaCompra());
        conditions += " AND CAC_SEC_DIA_COMPRA = ?";
        pkValues.add(this.getCacSecDiaCompra());
        fields += " CAC_NUM_MONEDA = ?, ";
        values.add(this.getCacNumMoneda());
        fields += " CAC_PRECIO_EMISION = ?, ";
        values.add(this.getCacPrecioEmision());
        fields += " CAC_IMP_COMPRA = ?, ";
        values.add(this.getCacImpCompra());
        fields += " CAC_NUM_TIT_COMPRA = ?, ";
        values.add(this.getCacNumTitCompra());
        fields += " CAC_TIT_DISP_COMP = ?, ";
        values.add(this.getCacTitDispComp());
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
        String sql = "INSERT INTO COMPRAS_ACT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CAC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCacNumContrato());

        fields += ", CAC_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getCacEntidadFin());

        fields += ", CAC_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getCacContratoInter());

        fields += ", CAC_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCacNomPizarra());

        fields += ", CAC_NUM_SERIE_EMIS";
        fieldValues += ", ?";
        values.add(this.getCacNumSerieEmis());

        fields += ", CAC_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getCacNumCuponVig());

        fields += ", CAC_DIA_COMPRA";
        fieldValues += ", ?";
        values.add(this.getCacDiaCompra());

        fields += ", CAC_SEC_DIA_COMPRA";
        fieldValues += ", ?";
        values.add(this.getCacSecDiaCompra());

        fields += ", CAC_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getCacNumMoneda());

        fields += ", CAC_PRECIO_EMISION";
        fieldValues += ", ?";
        values.add(this.getCacPrecioEmision());

        fields += ", CAC_IMP_COMPRA";
        fieldValues += ", ?";
        values.add(this.getCacImpCompra());

        fields += ", CAC_NUM_TIT_COMPRA";
        fieldValues += ", ?";
        values.add(this.getCacNumTitCompra());

        fields += ", CAC_TIT_DISP_COMP";
        fieldValues += ", ?";
        values.add(this.getCacTitDispComp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COMPRAS_ACT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CAC_NUM_CONTRATO = ?";
        values.add(this.getCacNumContrato());
        conditions += " AND CAC_ENTIDAD_FIN = ?";
        values.add(this.getCacEntidadFin());
        conditions += " AND CAC_CONTRATO_INTER = ?";
        values.add(this.getCacContratoInter());
        conditions += " AND CAC_NOM_PIZARRA = ?";
        values.add(this.getCacNomPizarra());
        conditions += " AND CAC_NUM_SERIE_EMIS = ?";
        values.add(this.getCacNumSerieEmis());
        conditions += " AND CAC_NUM_CUPON_VIG = ?";
        values.add(this.getCacNumCuponVig());
        conditions += " AND CAC_DIA_COMPRA = ?";
        values.add(this.getCacDiaCompra());
        conditions += " AND CAC_SEC_DIA_COMPRA = ?";
        values.add(this.getCacSecDiaCompra());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ComprasAct instance = (ComprasAct) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCacNumContrato().equals(instance.getCacNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCacEntidadFin().equals(instance.getCacEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getCacContratoInter().equals(instance.getCacContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getCacNomPizarra().equals(instance.getCacNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCacNumSerieEmis().equals(instance.getCacNumSerieEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCacNumCuponVig().equals(instance.getCacNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getCacDiaCompra().equals(instance.getCacDiaCompra()))
            equalObjects = false;
        if (equalObjects && !this.getCacSecDiaCompra().equals(instance.getCacSecDiaCompra()))
            equalObjects = false;
        if (equalObjects && !this.getCacNumMoneda().equals(instance.getCacNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getCacPrecioEmision().equals(instance.getCacPrecioEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCacImpCompra().equals(instance.getCacImpCompra()))
            equalObjects = false;
        if (equalObjects && !this.getCacNumTitCompra().equals(instance.getCacNumTitCompra()))
            equalObjects = false;
        if (equalObjects && !this.getCacTitDispComp().equals(instance.getCacTitDispComp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ComprasAct result = new ComprasAct();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCacNumContrato((BigDecimal) objectData.getData("CAC_NUM_CONTRATO"));
        result.setCacEntidadFin((BigDecimal) objectData.getData("CAC_ENTIDAD_FIN"));
        result.setCacContratoInter((BigDecimal) objectData.getData("CAC_CONTRATO_INTER"));
        result.setCacNomPizarra((String) objectData.getData("CAC_NOM_PIZARRA"));
        result.setCacNumSerieEmis((String) objectData.getData("CAC_NUM_SERIE_EMIS"));
        result.setCacNumCuponVig((BigDecimal) objectData.getData("CAC_NUM_CUPON_VIG"));
        result.setCacDiaCompra((String) objectData.getData("CAC_DIA_COMPRA"));
        result.setCacSecDiaCompra((BigDecimal) objectData.getData("CAC_SEC_DIA_COMPRA"));
        result.setCacNumMoneda((BigDecimal) objectData.getData("CAC_NUM_MONEDA"));
        result.setCacPrecioEmision((BigDecimal) objectData.getData("CAC_PRECIO_EMISION"));
        result.setCacImpCompra((BigDecimal) objectData.getData("CAC_IMP_COMPRA"));
        result.setCacNumTitCompra((BigDecimal) objectData.getData("CAC_NUM_TIT_COMPRA"));
        result.setCacTitDispComp((BigDecimal) objectData.getData("CAC_TIT_DISP_COMP"));

        return result;

    }

}
