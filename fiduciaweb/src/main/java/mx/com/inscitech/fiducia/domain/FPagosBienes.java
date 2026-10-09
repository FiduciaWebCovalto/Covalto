package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PAGOS_BIENES_PK", columns = { "FPB_ID_FIDEICOMISO", "FPB_ID_SUBCUENTA", "FPB_ID_GARANTIA", "FPB_ID_COBRO", "FPB_ID_BIEN_GARANTIA" },
            sequences = { "MANUAL" })
public class FPagosBienes extends DomainObject {

    BigDecimal fpbIdFideicomiso = null;
    BigDecimal fpbIdSubcuenta = null;
    BigDecimal fpbIdGarantia = null;
    BigDecimal fpbIdCobro = null;
    BigDecimal fpbImporte = null;
    BigDecimal fpbCveMoneda = null;
    BigDecimal fpbTipoCambio = null;
    BigDecimal fpbImporteExt = null;
    String fpbFecha = null;
    String fpbComentario = null;
    BigDecimal fpbIdBienGarantia = null;

    public FPagosBienes() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpbIdFideicomiso(BigDecimal fpbIdFideicomiso) {
        this.fpbIdFideicomiso = fpbIdFideicomiso;
    }

    public BigDecimal getFpbIdFideicomiso() {
        return this.fpbIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpbIdSubcuenta(BigDecimal fpbIdSubcuenta) {
        this.fpbIdSubcuenta = fpbIdSubcuenta;
    }

    public BigDecimal getFpbIdSubcuenta() {
        return this.fpbIdSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpbIdGarantia(BigDecimal fpbIdGarantia) {
        this.fpbIdGarantia = fpbIdGarantia;
    }

    public BigDecimal getFpbIdGarantia() {
        return this.fpbIdGarantia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpbIdCobro(BigDecimal fpbIdCobro) {
        this.fpbIdCobro = fpbIdCobro;
    }

    public BigDecimal getFpbIdCobro() {
        return this.fpbIdCobro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFpbImporte(BigDecimal fpbImporte) {
        this.fpbImporte = fpbImporte;
    }

    public BigDecimal getFpbImporte() {
        return this.fpbImporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpbCveMoneda(BigDecimal fpbCveMoneda) {
        this.fpbCveMoneda = fpbCveMoneda;
    }

    public BigDecimal getFpbCveMoneda() {
        return this.fpbCveMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 8, javaClass = BigDecimal.class)
    public void setFpbTipoCambio(BigDecimal fpbTipoCambio) {
        this.fpbTipoCambio = fpbTipoCambio;
    }

    public BigDecimal getFpbTipoCambio() {
        return this.fpbTipoCambio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFpbImporteExt(BigDecimal fpbImporteExt) {
        this.fpbImporteExt = fpbImporteExt;
    }

    public BigDecimal getFpbImporteExt() {
        return this.fpbImporteExt;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFpbFecha(String fpbFecha) {
        this.fpbFecha = fpbFecha;
    }

    public String getFpbFecha() {
        return this.fpbFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFpbComentario(String fpbComentario) {
        this.fpbComentario = fpbComentario;
    }

    public String getFpbComentario() {
        return this.fpbComentario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFpbIdBienGarantia(BigDecimal fpbIdBienGarantia) {
        this.fpbIdBienGarantia = fpbIdBienGarantia;
    }

    public BigDecimal getFpbIdBienGarantia() {
        return this.fpbIdBienGarantia;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PAGOS_BIENES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpbIdFideicomiso() != null && this.getFpbIdFideicomiso().longValue() == -999) {
            conditions += " AND FPB_ID_FIDEICOMISO IS NULL";
        } else if (this.getFpbIdFideicomiso() != null) {
            conditions += " AND FPB_ID_FIDEICOMISO = ?";
            values.add(this.getFpbIdFideicomiso());
        }

        if (this.getFpbIdSubcuenta() != null && this.getFpbIdSubcuenta().longValue() == -999) {
            conditions += " AND FPB_ID_SUBCUENTA IS NULL";
        } else if (this.getFpbIdSubcuenta() != null) {
            conditions += " AND FPB_ID_SUBCUENTA = ?";
            values.add(this.getFpbIdSubcuenta());
        }

        if (this.getFpbIdGarantia() != null && this.getFpbIdGarantia().longValue() == -999) {
            conditions += " AND FPB_ID_GARANTIA IS NULL";
        } else if (this.getFpbIdGarantia() != null) {
            conditions += " AND FPB_ID_GARANTIA = ?";
            values.add(this.getFpbIdGarantia());
        }

        if (this.getFpbIdCobro() != null && this.getFpbIdCobro().longValue() == -999) {
            conditions += " AND FPB_ID_COBRO IS NULL";
        } else if (this.getFpbIdCobro() != null) {
            conditions += " AND FPB_ID_COBRO = ?";
            values.add(this.getFpbIdCobro());
        }

        if (this.getFpbIdBienGarantia() != null && this.getFpbIdBienGarantia().longValue() == -999) {
            conditions += " AND FPB_ID_BIEN_GARANTIA IS NULL";
        } else if (this.getFpbIdBienGarantia() != null) {
            conditions += " AND FPB_ID_BIEN_GARANTIA = ?";
            values.add(this.getFpbIdBienGarantia());
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
        String sql = "SELECT * FROM F_PAGOS_BIENES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpbIdFideicomiso() != null && this.getFpbIdFideicomiso().longValue() == -999) {
            conditions += " AND FPB_ID_FIDEICOMISO IS NULL";
        } else if (this.getFpbIdFideicomiso() != null) {
            conditions += " AND FPB_ID_FIDEICOMISO = ?";
            values.add(this.getFpbIdFideicomiso());
        }

        if (this.getFpbIdSubcuenta() != null && this.getFpbIdSubcuenta().longValue() == -999) {
            conditions += " AND FPB_ID_SUBCUENTA IS NULL";
        } else if (this.getFpbIdSubcuenta() != null) {
            conditions += " AND FPB_ID_SUBCUENTA = ?";
            values.add(this.getFpbIdSubcuenta());
        }

        if (this.getFpbIdGarantia() != null && this.getFpbIdGarantia().longValue() == -999) {
            conditions += " AND FPB_ID_GARANTIA IS NULL";
        } else if (this.getFpbIdGarantia() != null) {
            conditions += " AND FPB_ID_GARANTIA = ?";
            values.add(this.getFpbIdGarantia());
        }

        if (this.getFpbIdCobro() != null && this.getFpbIdCobro().longValue() == -999) {
            conditions += " AND FPB_ID_COBRO IS NULL";
        } else if (this.getFpbIdCobro() != null) {
            conditions += " AND FPB_ID_COBRO = ?";
            values.add(this.getFpbIdCobro());
        }

        if (this.getFpbImporte() != null && this.getFpbImporte().longValue() == -999) {
            conditions += " AND FPB_IMPORTE IS NULL";
        } else if (this.getFpbImporte() != null) {
            conditions += " AND FPB_IMPORTE = ?";
            values.add(this.getFpbImporte());
        }

        if (this.getFpbCveMoneda() != null && this.getFpbCveMoneda().longValue() == -999) {
            conditions += " AND FPB_CVE_MONEDA IS NULL";
        } else if (this.getFpbCveMoneda() != null) {
            conditions += " AND FPB_CVE_MONEDA = ?";
            values.add(this.getFpbCveMoneda());
        }

        if (this.getFpbTipoCambio() != null && this.getFpbTipoCambio().longValue() == -999) {
            conditions += " AND FPB_TIPO_CAMBIO IS NULL";
        } else if (this.getFpbTipoCambio() != null) {
            conditions += " AND FPB_TIPO_CAMBIO = ?";
            values.add(this.getFpbTipoCambio());
        }

        if (this.getFpbImporteExt() != null && this.getFpbImporteExt().longValue() == -999) {
            conditions += " AND FPB_IMPORTE_EXT IS NULL";
        } else if (this.getFpbImporteExt() != null) {
            conditions += " AND FPB_IMPORTE_EXT = ?";
            values.add(this.getFpbImporteExt());
        }

        if (this.getFpbFecha() != null && "null".equals(this.getFpbFecha())) {
            conditions += " AND FPB_FECHA IS NULL";
        } else if (this.getFpbFecha() != null) {
            conditions += " AND FPB_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFpbFecha());
        }

        if (this.getFpbComentario() != null && "null".equals(this.getFpbComentario())) {
            conditions += " AND FPB_COMENTARIO IS NULL";
        } else if (this.getFpbComentario() != null) {
            conditions += " AND FPB_COMENTARIO = ?";
            values.add(this.getFpbComentario());
        }

        if (this.getFpbIdBienGarantia() != null && this.getFpbIdBienGarantia().longValue() == -999) {
            conditions += " AND FPB_ID_BIEN_GARANTIA IS NULL";
        } else if (this.getFpbIdBienGarantia() != null) {
            conditions += " AND FPB_ID_BIEN_GARANTIA = ?";
            values.add(this.getFpbIdBienGarantia());
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
        String sql = "UPDATE F_PAGOS_BIENES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPB_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFpbIdFideicomiso());
        conditions += " AND FPB_ID_SUBCUENTA = ?";
        pkValues.add(this.getFpbIdSubcuenta());
        conditions += " AND FPB_ID_GARANTIA = ?";
        pkValues.add(this.getFpbIdGarantia());
        conditions += " AND FPB_ID_COBRO = ?";
        pkValues.add(this.getFpbIdCobro());
        fields += " FPB_IMPORTE = ?, ";
        values.add(this.getFpbImporte());
        fields += " FPB_CVE_MONEDA = ?, ";
        values.add(this.getFpbCveMoneda());
        fields += " FPB_TIPO_CAMBIO = ?, ";
        values.add(this.getFpbTipoCambio());
        fields += " FPB_IMPORTE_EXT = ?, ";
        values.add(this.getFpbImporteExt());
        fields += " FPB_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFpbFecha());
        fields += " FPB_COMENTARIO = ?, ";
        values.add(this.getFpbComentario());
        conditions += " AND FPB_ID_BIEN_GARANTIA = ?";
        pkValues.add(this.getFpbIdBienGarantia());
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
        String sql = "INSERT INTO F_PAGOS_BIENES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPB_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFpbIdFideicomiso());

        fields += ", FPB_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFpbIdSubcuenta());

        fields += ", FPB_ID_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFpbIdGarantia());

        fields += ", FPB_ID_COBRO";
        fieldValues += ", ?";
        values.add(this.getFpbIdCobro());

        fields += ", FPB_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFpbImporte());

        fields += ", FPB_CVE_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFpbCveMoneda());

        fields += ", FPB_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getFpbTipoCambio());

        fields += ", FPB_IMPORTE_EXT";
        fieldValues += ", ?";
        values.add(this.getFpbImporteExt());

        fields += ", FPB_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFpbFecha());

        fields += ", FPB_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFpbComentario());

        fields += ", FPB_ID_BIEN_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFpbIdBienGarantia());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PAGOS_BIENES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPB_ID_FIDEICOMISO = ?";
        values.add(this.getFpbIdFideicomiso());
        conditions += " AND FPB_ID_SUBCUENTA = ?";
        values.add(this.getFpbIdSubcuenta());
        conditions += " AND FPB_ID_GARANTIA = ?";
        values.add(this.getFpbIdGarantia());
        conditions += " AND FPB_ID_COBRO = ?";
        values.add(this.getFpbIdCobro());
        conditions += " AND FPB_ID_BIEN_GARANTIA = ?";
        values.add(this.getFpbIdBienGarantia());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FPagosBienes instance = (FPagosBienes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFpbIdFideicomiso().equals(instance.getFpbIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFpbIdSubcuenta().equals(instance.getFpbIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFpbIdGarantia().equals(instance.getFpbIdGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFpbIdCobro().equals(instance.getFpbIdCobro()))
            equalObjects = false;
        if (equalObjects && !this.getFpbImporte().equals(instance.getFpbImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFpbCveMoneda().equals(instance.getFpbCveMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFpbTipoCambio().equals(instance.getFpbTipoCambio()))
            equalObjects = false;
        if (equalObjects && !this.getFpbImporteExt().equals(instance.getFpbImporteExt()))
            equalObjects = false;
        if (equalObjects && !this.getFpbFecha().equals(instance.getFpbFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFpbComentario().equals(instance.getFpbComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFpbIdBienGarantia().equals(instance.getFpbIdBienGarantia()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPagosBienes result = new FPagosBienes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFpbIdFideicomiso((BigDecimal) objectData.getData("FPB_ID_FIDEICOMISO"));
        result.setFpbIdSubcuenta((BigDecimal) objectData.getData("FPB_ID_SUBCUENTA"));
        result.setFpbIdGarantia((BigDecimal) objectData.getData("FPB_ID_GARANTIA"));
        result.setFpbIdCobro((BigDecimal) objectData.getData("FPB_ID_COBRO"));
        result.setFpbImporte((BigDecimal) objectData.getData("FPB_IMPORTE"));
        result.setFpbCveMoneda((BigDecimal) objectData.getData("FPB_CVE_MONEDA"));
        result.setFpbTipoCambio((BigDecimal) objectData.getData("FPB_TIPO_CAMBIO"));
        result.setFpbImporteExt((BigDecimal) objectData.getData("FPB_IMPORTE_EXT"));
        result.setFpbFecha((String) objectData.getData("FPB_FECHA"));
        result.setFpbComentario((String) objectData.getData("FPB_COMENTARIO"));
        result.setFpbIdBienGarantia((BigDecimal) objectData.getData("FPB_ID_BIEN_GARANTIA"));

        return result;

    }

}
