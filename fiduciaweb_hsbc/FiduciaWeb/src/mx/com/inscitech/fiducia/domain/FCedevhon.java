package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CEDEVHON_PK", columns = { "ECPA_ID_PROGRAMA", "ECPA_ID_FIDEICOMISO", "ECPA_ID_EMISION", "ECPA_ID_PERIODO", "ECPA_ID_SEC_PAGO" },
            sequences = { "MANUAL" })
public class FCedevhon extends DomainObject {

    BigDecimal ecpaIdPrograma = null;
    BigDecimal ecpaIdFideicomiso = null;
    BigDecimal ecpaIdEmision = null;
    BigDecimal ecpaIdPeriodo = null;
    BigDecimal ecpaIdSecPago = null;
    String ecpaConcepto = null;
    BigDecimal ecpaImpHonorario = null;
    String ecpaFecInicioExt = null;
    String ecpaFecFinExt = null;
    String ecpaStCedevhon = null;

    public FCedevhon() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpaIdPrograma(BigDecimal ecpaIdPrograma) {
        this.ecpaIdPrograma = ecpaIdPrograma;
    }

    public BigDecimal getEcpaIdPrograma() {
        return this.ecpaIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpaIdFideicomiso(BigDecimal ecpaIdFideicomiso) {
        this.ecpaIdFideicomiso = ecpaIdFideicomiso;
    }

    public BigDecimal getEcpaIdFideicomiso() {
        return this.ecpaIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpaIdEmision(BigDecimal ecpaIdEmision) {
        this.ecpaIdEmision = ecpaIdEmision;
    }

    public BigDecimal getEcpaIdEmision() {
        return this.ecpaIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpaIdPeriodo(BigDecimal ecpaIdPeriodo) {
        this.ecpaIdPeriodo = ecpaIdPeriodo;
    }

    public BigDecimal getEcpaIdPeriodo() {
        return this.ecpaIdPeriodo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpaIdSecPago(BigDecimal ecpaIdSecPago) {
        this.ecpaIdSecPago = ecpaIdSecPago;
    }

    public BigDecimal getEcpaIdSecPago() {
        return this.ecpaIdSecPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcpaConcepto(String ecpaConcepto) {
        this.ecpaConcepto = ecpaConcepto;
    }

    public String getEcpaConcepto() {
        return this.ecpaConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcpaImpHonorario(BigDecimal ecpaImpHonorario) {
        this.ecpaImpHonorario = ecpaImpHonorario;
    }

    public BigDecimal getEcpaImpHonorario() {
        return this.ecpaImpHonorario;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcpaFecInicioExt(String ecpaFecInicioExt) {
        this.ecpaFecInicioExt = ecpaFecInicioExt;
    }

    public String getEcpaFecInicioExt() {
        return this.ecpaFecInicioExt;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcpaFecFinExt(String ecpaFecFinExt) {
        this.ecpaFecFinExt = ecpaFecFinExt;
    }

    public String getEcpaFecFinExt() {
        return this.ecpaFecFinExt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcpaStCedevhon(String ecpaStCedevhon) {
        this.ecpaStCedevhon = ecpaStCedevhon;
    }

    public String getEcpaStCedevhon() {
        return this.ecpaStCedevhon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CEDEVHON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcpaIdPrograma() != null && this.getEcpaIdPrograma().longValue() == -999) {
            conditions += " AND ECPA_ID_PROGRAMA IS NULL";
        } else if (this.getEcpaIdPrograma() != null) {
            conditions += " AND ECPA_ID_PROGRAMA = ?";
            values.add(this.getEcpaIdPrograma());
        }

        if (this.getEcpaIdFideicomiso() != null && this.getEcpaIdFideicomiso().longValue() == -999) {
            conditions += " AND ECPA_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcpaIdFideicomiso() != null) {
            conditions += " AND ECPA_ID_FIDEICOMISO = ?";
            values.add(this.getEcpaIdFideicomiso());
        }

        if (this.getEcpaIdEmision() != null && this.getEcpaIdEmision().longValue() == -999) {
            conditions += " AND ECPA_ID_EMISION IS NULL";
        } else if (this.getEcpaIdEmision() != null) {
            conditions += " AND ECPA_ID_EMISION = ?";
            values.add(this.getEcpaIdEmision());
        }

        if (this.getEcpaIdPeriodo() != null && this.getEcpaIdPeriodo().longValue() == -999) {
            conditions += " AND ECPA_ID_PERIODO IS NULL";
        } else if (this.getEcpaIdPeriodo() != null) {
            conditions += " AND ECPA_ID_PERIODO = ?";
            values.add(this.getEcpaIdPeriodo());
        }

        if (this.getEcpaIdSecPago() != null && this.getEcpaIdSecPago().longValue() == -999) {
            conditions += " AND ECPA_ID_SEC_PAGO IS NULL";
        } else if (this.getEcpaIdSecPago() != null) {
            conditions += " AND ECPA_ID_SEC_PAGO = ?";
            values.add(this.getEcpaIdSecPago());
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
        String sql = "SELECT * FROM F_CEDEVHON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcpaIdPrograma() != null && this.getEcpaIdPrograma().longValue() == -999) {
            conditions += " AND ECPA_ID_PROGRAMA IS NULL";
        } else if (this.getEcpaIdPrograma() != null) {
            conditions += " AND ECPA_ID_PROGRAMA = ?";
            values.add(this.getEcpaIdPrograma());
        }

        if (this.getEcpaIdFideicomiso() != null && this.getEcpaIdFideicomiso().longValue() == -999) {
            conditions += " AND ECPA_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcpaIdFideicomiso() != null) {
            conditions += " AND ECPA_ID_FIDEICOMISO = ?";
            values.add(this.getEcpaIdFideicomiso());
        }

        if (this.getEcpaIdEmision() != null && this.getEcpaIdEmision().longValue() == -999) {
            conditions += " AND ECPA_ID_EMISION IS NULL";
        } else if (this.getEcpaIdEmision() != null) {
            conditions += " AND ECPA_ID_EMISION = ?";
            values.add(this.getEcpaIdEmision());
        }

        if (this.getEcpaIdPeriodo() != null && this.getEcpaIdPeriodo().longValue() == -999) {
            conditions += " AND ECPA_ID_PERIODO IS NULL";
        } else if (this.getEcpaIdPeriodo() != null) {
            conditions += " AND ECPA_ID_PERIODO = ?";
            values.add(this.getEcpaIdPeriodo());
        }

        if (this.getEcpaIdSecPago() != null && this.getEcpaIdSecPago().longValue() == -999) {
            conditions += " AND ECPA_ID_SEC_PAGO IS NULL";
        } else if (this.getEcpaIdSecPago() != null) {
            conditions += " AND ECPA_ID_SEC_PAGO = ?";
            values.add(this.getEcpaIdSecPago());
        }

        if (this.getEcpaConcepto() != null && "null".equals(this.getEcpaConcepto())) {
            conditions += " AND ECPA_CONCEPTO IS NULL";
        } else if (this.getEcpaConcepto() != null) {
            conditions += " AND ECPA_CONCEPTO = ?";
            values.add(this.getEcpaConcepto());
        }

        if (this.getEcpaImpHonorario() != null && this.getEcpaImpHonorario().longValue() == -999) {
            conditions += " AND ECPA_IMP_HONORARIO IS NULL";
        } else if (this.getEcpaImpHonorario() != null) {
            conditions += " AND ECPA_IMP_HONORARIO = ?";
            values.add(this.getEcpaImpHonorario());
        }

        if (this.getEcpaFecInicioExt() != null && "null".equals(this.getEcpaFecInicioExt())) {
            conditions += " AND ECPA_FEC_INICIO_EXT IS NULL";
        } else if (this.getEcpaFecInicioExt() != null) {
            conditions += " AND ECPA_FEC_INICIO_EXT = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcpaFecInicioExt());
        }

        if (this.getEcpaFecFinExt() != null && "null".equals(this.getEcpaFecFinExt())) {
            conditions += " AND ECPA_FEC_FIN_EXT IS NULL";
        } else if (this.getEcpaFecFinExt() != null) {
            conditions += " AND ECPA_FEC_FIN_EXT = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcpaFecFinExt());
        }

        if (this.getEcpaStCedevhon() != null && "null".equals(this.getEcpaStCedevhon())) {
            conditions += " AND ECPA_ST_CEDEVHON IS NULL";
        } else if (this.getEcpaStCedevhon() != null) {
            conditions += " AND ECPA_ST_CEDEVHON = ?";
            values.add(this.getEcpaStCedevhon());
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
        String sql = "UPDATE F_CEDEVHON SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECPA_ID_PROGRAMA = ?";
        pkValues.add(this.getEcpaIdPrograma());
        conditions += " AND ECPA_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEcpaIdFideicomiso());
        conditions += " AND ECPA_ID_EMISION = ?";
        pkValues.add(this.getEcpaIdEmision());
        conditions += " AND ECPA_ID_PERIODO = ?";
        pkValues.add(this.getEcpaIdPeriodo());
        conditions += " AND ECPA_ID_SEC_PAGO = ?";
        pkValues.add(this.getEcpaIdSecPago());
        fields += " ECPA_CONCEPTO = ?, ";
        values.add(this.getEcpaConcepto());
        fields += " ECPA_IMP_HONORARIO = ?, ";
        values.add(this.getEcpaImpHonorario());
        fields += " ECPA_FEC_INICIO_EXT = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcpaFecInicioExt());
        fields += " ECPA_FEC_FIN_EXT = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcpaFecFinExt());
        fields += " ECPA_ST_CEDEVHON = ?, ";
        values.add(this.getEcpaStCedevhon());
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
        String sql = "INSERT INTO F_CEDEVHON ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECPA_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEcpaIdPrograma());

        fields += ", ECPA_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEcpaIdFideicomiso());

        fields += ", ECPA_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEcpaIdEmision());

        fields += ", ECPA_ID_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEcpaIdPeriodo());

        fields += ", ECPA_ID_SEC_PAGO";
        fieldValues += ", ?";
        values.add(this.getEcpaIdSecPago());

        fields += ", ECPA_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getEcpaConcepto());

        fields += ", ECPA_IMP_HONORARIO";
        fieldValues += ", ?";
        values.add(this.getEcpaImpHonorario());

        fields += ", ECPA_FEC_INICIO_EXT";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcpaFecInicioExt());

        fields += ", ECPA_FEC_FIN_EXT";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcpaFecFinExt());

        fields += ", ECPA_ST_CEDEVHON";
        fieldValues += ", ?";
        values.add(this.getEcpaStCedevhon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CEDEVHON WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECPA_ID_PROGRAMA = ?";
        values.add(this.getEcpaIdPrograma());
        conditions += " AND ECPA_ID_FIDEICOMISO = ?";
        values.add(this.getEcpaIdFideicomiso());
        conditions += " AND ECPA_ID_EMISION = ?";
        values.add(this.getEcpaIdEmision());
        conditions += " AND ECPA_ID_PERIODO = ?";
        values.add(this.getEcpaIdPeriodo());
        conditions += " AND ECPA_ID_SEC_PAGO = ?";
        values.add(this.getEcpaIdSecPago());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCedevhon instance = (FCedevhon) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcpaIdPrograma().equals(instance.getEcpaIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaIdFideicomiso().equals(instance.getEcpaIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaIdEmision().equals(instance.getEcpaIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaIdPeriodo().equals(instance.getEcpaIdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaIdSecPago().equals(instance.getEcpaIdSecPago()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaConcepto().equals(instance.getEcpaConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaImpHonorario().equals(instance.getEcpaImpHonorario()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaFecInicioExt().equals(instance.getEcpaFecInicioExt()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaFecFinExt().equals(instance.getEcpaFecFinExt()))
            equalObjects = false;
        if (equalObjects && !this.getEcpaStCedevhon().equals(instance.getEcpaStCedevhon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCedevhon result = new FCedevhon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcpaIdPrograma((BigDecimal) objectData.getData("ECPA_ID_PROGRAMA"));
        result.setEcpaIdFideicomiso((BigDecimal) objectData.getData("ECPA_ID_FIDEICOMISO"));
        result.setEcpaIdEmision((BigDecimal) objectData.getData("ECPA_ID_EMISION"));
        result.setEcpaIdPeriodo((BigDecimal) objectData.getData("ECPA_ID_PERIODO"));
        result.setEcpaIdSecPago((BigDecimal) objectData.getData("ECPA_ID_SEC_PAGO"));
        result.setEcpaConcepto((String) objectData.getData("ECPA_CONCEPTO"));
        result.setEcpaImpHonorario((BigDecimal) objectData.getData("ECPA_IMP_HONORARIO"));
        result.setEcpaFecInicioExt((String) objectData.getData("ECPA_FEC_INICIO_EXT"));
        result.setEcpaFecFinExt((String) objectData.getData("ECPA_FEC_FIN_EXT"));
        result.setEcpaStCedevhon((String) objectData.getData("ECPA_ST_CEDEVHON"));

        return result;

    }

}
