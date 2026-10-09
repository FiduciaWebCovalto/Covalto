package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_LIQUIDACIONES_BIENES_PK", columns = { "FLB_ID_FIDEICOMISO", "FLB_ID_SUBCUENTA", "FLB_ID_GARANTIA", "FLB_ID_BIEN_GARANTIA", "FLB_ID_LIQUIDACION" },
            sequences = { "MANUAL" })
public class FLiquidacionesBienes extends DomainObject {

    BigDecimal flbIdFideicomiso = null;
    BigDecimal flbIdSubcuenta = null;
    BigDecimal flbIdGarantia = null;
    BigDecimal flbIdBienGarantia = null;
    BigDecimal flbIdLiquidacion = null;
    BigDecimal flbImporte = null;
    BigDecimal flbCveMoneda = null;
    BigDecimal flbTipoCambio = null;
    BigDecimal flbImporteExt = null;
    String flbFecha = null;
    String flbComentario = null;
    BigDecimal flbAfecta = null;

    public FLiquidacionesBienes() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlbIdFideicomiso(BigDecimal flbIdFideicomiso) {
        this.flbIdFideicomiso = flbIdFideicomiso;
    }

    public BigDecimal getFlbIdFideicomiso() {
        return this.flbIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlbIdSubcuenta(BigDecimal flbIdSubcuenta) {
        this.flbIdSubcuenta = flbIdSubcuenta;
    }

    public BigDecimal getFlbIdSubcuenta() {
        return this.flbIdSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlbIdGarantia(BigDecimal flbIdGarantia) {
        this.flbIdGarantia = flbIdGarantia;
    }

    public BigDecimal getFlbIdGarantia() {
        return this.flbIdGarantia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlbIdBienGarantia(BigDecimal flbIdBienGarantia) {
        this.flbIdBienGarantia = flbIdBienGarantia;
    }

    public BigDecimal getFlbIdBienGarantia() {
        return this.flbIdBienGarantia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlbIdLiquidacion(BigDecimal flbIdLiquidacion) {
        this.flbIdLiquidacion = flbIdLiquidacion;
    }

    public BigDecimal getFlbIdLiquidacion() {
        return this.flbIdLiquidacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFlbImporte(BigDecimal flbImporte) {
        this.flbImporte = flbImporte;
    }

    public BigDecimal getFlbImporte() {
        return this.flbImporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlbCveMoneda(BigDecimal flbCveMoneda) {
        this.flbCveMoneda = flbCveMoneda;
    }

    public BigDecimal getFlbCveMoneda() {
        return this.flbCveMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 8, javaClass = BigDecimal.class)
    public void setFlbTipoCambio(BigDecimal flbTipoCambio) {
        this.flbTipoCambio = flbTipoCambio;
    }

    public BigDecimal getFlbTipoCambio() {
        return this.flbTipoCambio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFlbImporteExt(BigDecimal flbImporteExt) {
        this.flbImporteExt = flbImporteExt;
    }

    public BigDecimal getFlbImporteExt() {
        return this.flbImporteExt;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFlbFecha(String flbFecha) {
        this.flbFecha = flbFecha;
    }

    public String getFlbFecha() {
        return this.flbFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlbComentario(String flbComentario) {
        this.flbComentario = flbComentario;
    }

    public String getFlbComentario() {
        return this.flbComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFlbAfecta(BigDecimal flbAfecta) {
        this.flbAfecta = flbAfecta;
    }

    public BigDecimal getFlbAfecta() {
        return this.flbAfecta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_LIQUIDACIONES_BIENES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFlbIdFideicomiso() != null && this.getFlbIdFideicomiso().longValue() == -999) {
            conditions += " AND FLB_ID_FIDEICOMISO IS NULL";
        } else if (this.getFlbIdFideicomiso() != null) {
            conditions += " AND FLB_ID_FIDEICOMISO = ?";
            values.add(this.getFlbIdFideicomiso());
        }

        if (this.getFlbIdSubcuenta() != null && this.getFlbIdSubcuenta().longValue() == -999) {
            conditions += " AND FLB_ID_SUBCUENTA IS NULL";
        } else if (this.getFlbIdSubcuenta() != null) {
            conditions += " AND FLB_ID_SUBCUENTA = ?";
            values.add(this.getFlbIdSubcuenta());
        }

        if (this.getFlbIdGarantia() != null && this.getFlbIdGarantia().longValue() == -999) {
            conditions += " AND FLB_ID_GARANTIA IS NULL";
        } else if (this.getFlbIdGarantia() != null) {
            conditions += " AND FLB_ID_GARANTIA = ?";
            values.add(this.getFlbIdGarantia());
        }

        if (this.getFlbIdBienGarantia() != null && this.getFlbIdBienGarantia().longValue() == -999) {
            conditions += " AND FLB_ID_BIEN_GARANTIA IS NULL";
        } else if (this.getFlbIdBienGarantia() != null) {
            conditions += " AND FLB_ID_BIEN_GARANTIA = ?";
            values.add(this.getFlbIdBienGarantia());
        }

        if (this.getFlbIdLiquidacion() != null && this.getFlbIdLiquidacion().longValue() == -999) {
            conditions += " AND FLB_ID_LIQUIDACION IS NULL";
        } else if (this.getFlbIdLiquidacion() != null) {
            conditions += " AND FLB_ID_LIQUIDACION = ?";
            values.add(this.getFlbIdLiquidacion());
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
        String sql = "SELECT * FROM F_LIQUIDACIONES_BIENES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFlbIdFideicomiso() != null && this.getFlbIdFideicomiso().longValue() == -999) {
            conditions += " AND FLB_ID_FIDEICOMISO IS NULL";
        } else if (this.getFlbIdFideicomiso() != null) {
            conditions += " AND FLB_ID_FIDEICOMISO = ?";
            values.add(this.getFlbIdFideicomiso());
        }

        if (this.getFlbIdSubcuenta() != null && this.getFlbIdSubcuenta().longValue() == -999) {
            conditions += " AND FLB_ID_SUBCUENTA IS NULL";
        } else if (this.getFlbIdSubcuenta() != null) {
            conditions += " AND FLB_ID_SUBCUENTA = ?";
            values.add(this.getFlbIdSubcuenta());
        }

        if (this.getFlbIdGarantia() != null && this.getFlbIdGarantia().longValue() == -999) {
            conditions += " AND FLB_ID_GARANTIA IS NULL";
        } else if (this.getFlbIdGarantia() != null) {
            conditions += " AND FLB_ID_GARANTIA = ?";
            values.add(this.getFlbIdGarantia());
        }

        if (this.getFlbIdBienGarantia() != null && this.getFlbIdBienGarantia().longValue() == -999) {
            conditions += " AND FLB_ID_BIEN_GARANTIA IS NULL";
        } else if (this.getFlbIdBienGarantia() != null) {
            conditions += " AND FLB_ID_BIEN_GARANTIA = ?";
            values.add(this.getFlbIdBienGarantia());
        }

        if (this.getFlbIdLiquidacion() != null && this.getFlbIdLiquidacion().longValue() == -999) {
            conditions += " AND FLB_ID_LIQUIDACION IS NULL";
        } else if (this.getFlbIdLiquidacion() != null) {
            conditions += " AND FLB_ID_LIQUIDACION = ?";
            values.add(this.getFlbIdLiquidacion());
        }

        if (this.getFlbImporte() != null && this.getFlbImporte().longValue() == -999) {
            conditions += " AND FLB_IMPORTE IS NULL";
        } else if (this.getFlbImporte() != null) {
            conditions += " AND FLB_IMPORTE = ?";
            values.add(this.getFlbImporte());
        }

        if (this.getFlbCveMoneda() != null && this.getFlbCveMoneda().longValue() == -999) {
            conditions += " AND FLB_CVE_MONEDA IS NULL";
        } else if (this.getFlbCveMoneda() != null) {
            conditions += " AND FLB_CVE_MONEDA = ?";
            values.add(this.getFlbCveMoneda());
        }

        if (this.getFlbTipoCambio() != null && this.getFlbTipoCambio().longValue() == -999) {
            conditions += " AND FLB_TIPO_CAMBIO IS NULL";
        } else if (this.getFlbTipoCambio() != null) {
            conditions += " AND FLB_TIPO_CAMBIO = ?";
            values.add(this.getFlbTipoCambio());
        }

        if (this.getFlbImporteExt() != null && this.getFlbImporteExt().longValue() == -999) {
            conditions += " AND FLB_IMPORTE_EXT IS NULL";
        } else if (this.getFlbImporteExt() != null) {
            conditions += " AND FLB_IMPORTE_EXT = ?";
            values.add(this.getFlbImporteExt());
        }

        if (this.getFlbFecha() != null && "null".equals(this.getFlbFecha())) {
            conditions += " AND FLB_FECHA IS NULL";
        } else if (this.getFlbFecha() != null) {
            conditions += " AND FLB_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFlbFecha());
        }

        if (this.getFlbComentario() != null && "null".equals(this.getFlbComentario())) {
            conditions += " AND FLB_COMENTARIO IS NULL";
        } else if (this.getFlbComentario() != null) {
            conditions += " AND FLB_COMENTARIO = ?";
            values.add(this.getFlbComentario());
        }

        if (this.getFlbAfecta() != null && this.getFlbAfecta().longValue() == -999) {
            conditions += " AND FLB_AFECTA IS NULL";
        } else if (this.getFlbAfecta() != null) {
            conditions += " AND FLB_AFECTA = ?";
            values.add(this.getFlbAfecta());
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
        String sql = "UPDATE F_LIQUIDACIONES_BIENES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FLB_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFlbIdFideicomiso());
        conditions += " AND FLB_ID_SUBCUENTA = ?";
        pkValues.add(this.getFlbIdSubcuenta());
        conditions += " AND FLB_ID_GARANTIA = ?";
        pkValues.add(this.getFlbIdGarantia());
        conditions += " AND FLB_ID_BIEN_GARANTIA = ?";
        pkValues.add(this.getFlbIdBienGarantia());
        conditions += " AND FLB_ID_LIQUIDACION = ?";
        pkValues.add(this.getFlbIdLiquidacion());
        fields += " FLB_IMPORTE = ?, ";
        values.add(this.getFlbImporte());
        fields += " FLB_CVE_MONEDA = ?, ";
        values.add(this.getFlbCveMoneda());
        fields += " FLB_TIPO_CAMBIO = ?, ";
        values.add(this.getFlbTipoCambio());
        fields += " FLB_IMPORTE_EXT = ?, ";
        values.add(this.getFlbImporteExt());
        fields += " FLB_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFlbFecha());
        fields += " FLB_COMENTARIO = ?, ";
        values.add(this.getFlbComentario());
        fields += " FLB_AFECTA = ?, ";
        values.add(this.getFlbAfecta());
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
        String sql = "INSERT INTO F_LIQUIDACIONES_BIENES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FLB_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFlbIdFideicomiso());

        fields += ", FLB_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFlbIdSubcuenta());

        fields += ", FLB_ID_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFlbIdGarantia());

        fields += ", FLB_ID_BIEN_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFlbIdBienGarantia());

        fields += ", FLB_ID_LIQUIDACION";
        fieldValues += ", ?";
        values.add(this.getFlbIdLiquidacion());

        fields += ", FLB_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFlbImporte());

        fields += ", FLB_CVE_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFlbCveMoneda());

        fields += ", FLB_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getFlbTipoCambio());

        fields += ", FLB_IMPORTE_EXT";
        fieldValues += ", ?";
        values.add(this.getFlbImporteExt());

        fields += ", FLB_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFlbFecha());

        fields += ", FLB_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFlbComentario());

        fields += ", FLB_AFECTA";
        fieldValues += ", ?";
        values.add(this.getFlbAfecta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_LIQUIDACIONES_BIENES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FLB_ID_FIDEICOMISO = ?";
        values.add(this.getFlbIdFideicomiso());
        conditions += " AND FLB_ID_SUBCUENTA = ?";
        values.add(this.getFlbIdSubcuenta());
        conditions += " AND FLB_ID_GARANTIA = ?";
        values.add(this.getFlbIdGarantia());
        conditions += " AND FLB_ID_BIEN_GARANTIA = ?";
        values.add(this.getFlbIdBienGarantia());
        conditions += " AND FLB_ID_LIQUIDACION = ?";
        values.add(this.getFlbIdLiquidacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FLiquidacionesBienes instance = (FLiquidacionesBienes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFlbIdFideicomiso().equals(instance.getFlbIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFlbIdSubcuenta().equals(instance.getFlbIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFlbIdGarantia().equals(instance.getFlbIdGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFlbIdBienGarantia().equals(instance.getFlbIdBienGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFlbIdLiquidacion().equals(instance.getFlbIdLiquidacion()))
            equalObjects = false;
        if (equalObjects && !this.getFlbImporte().equals(instance.getFlbImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFlbCveMoneda().equals(instance.getFlbCveMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFlbTipoCambio().equals(instance.getFlbTipoCambio()))
            equalObjects = false;
        if (equalObjects && !this.getFlbImporteExt().equals(instance.getFlbImporteExt()))
            equalObjects = false;
        if (equalObjects && !this.getFlbFecha().equals(instance.getFlbFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFlbComentario().equals(instance.getFlbComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFlbAfecta().equals(instance.getFlbAfecta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FLiquidacionesBienes result = new FLiquidacionesBienes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFlbIdFideicomiso((BigDecimal) objectData.getData("FLB_ID_FIDEICOMISO"));
        result.setFlbIdSubcuenta((BigDecimal) objectData.getData("FLB_ID_SUBCUENTA"));
        result.setFlbIdGarantia((BigDecimal) objectData.getData("FLB_ID_GARANTIA"));
        result.setFlbIdBienGarantia((BigDecimal) objectData.getData("FLB_ID_BIEN_GARANTIA"));
        result.setFlbIdLiquidacion((BigDecimal) objectData.getData("FLB_ID_LIQUIDACION"));
        result.setFlbImporte((BigDecimal) objectData.getData("FLB_IMPORTE"));
        result.setFlbCveMoneda((BigDecimal) objectData.getData("FLB_CVE_MONEDA"));
        result.setFlbTipoCambio((BigDecimal) objectData.getData("FLB_TIPO_CAMBIO"));
        result.setFlbImporteExt((BigDecimal) objectData.getData("FLB_IMPORTE_EXT"));
        result.setFlbFecha((String) objectData.getData("FLB_FECHA"));
        result.setFlbComentario((String) objectData.getData("FLB_COMENTARIO"));
        result.setFlbAfecta((BigDecimal) objectData.getData("FLB_AFECTA"));

        return result;

    }

}
