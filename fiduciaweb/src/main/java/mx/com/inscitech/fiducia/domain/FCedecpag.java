package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CEDECPAG_PK", columns = { "ECPG_ID_PROGRAMA", "ECPG_ID_FIDEICOMISO", "ECPG_ID_EMISION", "ECPG_ID_PERIODO", "ECFC_ID_CON_PAG" },
            sequences = { "MANUAL" })
public class FCedecpag extends DomainObject {

    BigDecimal ecpgIdPrograma = null;
    BigDecimal ecpgIdFideicomiso = null;
    BigDecimal ecpgIdEmision = null;
    BigDecimal ecpgIdPeriodo = null;
    BigDecimal ecfcIdConPag = null;
    String ecpgConcepto = null;
    BigDecimal ecpgImpPago = null;
    BigDecimal ecpgImpPagoDis = null;
    String ecfcStCedevfco = null;

    public FCedecpag() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpgIdPrograma(BigDecimal ecpgIdPrograma) {
        this.ecpgIdPrograma = ecpgIdPrograma;
    }

    public BigDecimal getEcpgIdPrograma() {
        return this.ecpgIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpgIdFideicomiso(BigDecimal ecpgIdFideicomiso) {
        this.ecpgIdFideicomiso = ecpgIdFideicomiso;
    }

    public BigDecimal getEcpgIdFideicomiso() {
        return this.ecpgIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpgIdEmision(BigDecimal ecpgIdEmision) {
        this.ecpgIdEmision = ecpgIdEmision;
    }

    public BigDecimal getEcpgIdEmision() {
        return this.ecpgIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcpgIdPeriodo(BigDecimal ecpgIdPeriodo) {
        this.ecpgIdPeriodo = ecpgIdPeriodo;
    }

    public BigDecimal getEcpgIdPeriodo() {
        return this.ecpgIdPeriodo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcfcIdConPag(BigDecimal ecfcIdConPag) {
        this.ecfcIdConPag = ecfcIdConPag;
    }

    public BigDecimal getEcfcIdConPag() {
        return this.ecfcIdConPag;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcpgConcepto(String ecpgConcepto) {
        this.ecpgConcepto = ecpgConcepto;
    }

    public String getEcpgConcepto() {
        return this.ecpgConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcpgImpPago(BigDecimal ecpgImpPago) {
        this.ecpgImpPago = ecpgImpPago;
    }

    public BigDecimal getEcpgImpPago() {
        return this.ecpgImpPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcpgImpPagoDis(BigDecimal ecpgImpPagoDis) {
        this.ecpgImpPagoDis = ecpgImpPagoDis;
    }

    public BigDecimal getEcpgImpPagoDis() {
        return this.ecpgImpPagoDis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcfcStCedevfco(String ecfcStCedevfco) {
        this.ecfcStCedevfco = ecfcStCedevfco;
    }

    public String getEcfcStCedevfco() {
        return this.ecfcStCedevfco;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CEDECPAG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcpgIdPrograma() != null && this.getEcpgIdPrograma().longValue() == -999) {
            conditions += " AND ECPG_ID_PROGRAMA IS NULL";
        } else if (this.getEcpgIdPrograma() != null) {
            conditions += " AND ECPG_ID_PROGRAMA = ?";
            values.add(this.getEcpgIdPrograma());
        }

        if (this.getEcpgIdFideicomiso() != null && this.getEcpgIdFideicomiso().longValue() == -999) {
            conditions += " AND ECPG_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcpgIdFideicomiso() != null) {
            conditions += " AND ECPG_ID_FIDEICOMISO = ?";
            values.add(this.getEcpgIdFideicomiso());
        }

        if (this.getEcpgIdEmision() != null && this.getEcpgIdEmision().longValue() == -999) {
            conditions += " AND ECPG_ID_EMISION IS NULL";
        } else if (this.getEcpgIdEmision() != null) {
            conditions += " AND ECPG_ID_EMISION = ?";
            values.add(this.getEcpgIdEmision());
        }

        if (this.getEcpgIdPeriodo() != null && this.getEcpgIdPeriodo().longValue() == -999) {
            conditions += " AND ECPG_ID_PERIODO IS NULL";
        } else if (this.getEcpgIdPeriodo() != null) {
            conditions += " AND ECPG_ID_PERIODO = ?";
            values.add(this.getEcpgIdPeriodo());
        }

        if (this.getEcfcIdConPag() != null && this.getEcfcIdConPag().longValue() == -999) {
            conditions += " AND ECFC_ID_CON_PAG IS NULL";
        } else if (this.getEcfcIdConPag() != null) {
            conditions += " AND ECFC_ID_CON_PAG = ?";
            values.add(this.getEcfcIdConPag());
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
        String sql = "SELECT * FROM F_CEDECPAG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcpgIdPrograma() != null && this.getEcpgIdPrograma().longValue() == -999) {
            conditions += " AND ECPG_ID_PROGRAMA IS NULL";
        } else if (this.getEcpgIdPrograma() != null) {
            conditions += " AND ECPG_ID_PROGRAMA = ?";
            values.add(this.getEcpgIdPrograma());
        }

        if (this.getEcpgIdFideicomiso() != null && this.getEcpgIdFideicomiso().longValue() == -999) {
            conditions += " AND ECPG_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcpgIdFideicomiso() != null) {
            conditions += " AND ECPG_ID_FIDEICOMISO = ?";
            values.add(this.getEcpgIdFideicomiso());
        }

        if (this.getEcpgIdEmision() != null && this.getEcpgIdEmision().longValue() == -999) {
            conditions += " AND ECPG_ID_EMISION IS NULL";
        } else if (this.getEcpgIdEmision() != null) {
            conditions += " AND ECPG_ID_EMISION = ?";
            values.add(this.getEcpgIdEmision());
        }

        if (this.getEcpgIdPeriodo() != null && this.getEcpgIdPeriodo().longValue() == -999) {
            conditions += " AND ECPG_ID_PERIODO IS NULL";
        } else if (this.getEcpgIdPeriodo() != null) {
            conditions += " AND ECPG_ID_PERIODO = ?";
            values.add(this.getEcpgIdPeriodo());
        }

        if (this.getEcfcIdConPag() != null && this.getEcfcIdConPag().longValue() == -999) {
            conditions += " AND ECFC_ID_CON_PAG IS NULL";
        } else if (this.getEcfcIdConPag() != null) {
            conditions += " AND ECFC_ID_CON_PAG = ?";
            values.add(this.getEcfcIdConPag());
        }

        if (this.getEcpgConcepto() != null && "null".equals(this.getEcpgConcepto())) {
            conditions += " AND ECPG_CONCEPTO IS NULL";
        } else if (this.getEcpgConcepto() != null) {
            conditions += " AND ECPG_CONCEPTO = ?";
            values.add(this.getEcpgConcepto());
        }

        if (this.getEcpgImpPago() != null && this.getEcpgImpPago().longValue() == -999) {
            conditions += " AND ECPG_IMP_PAGO IS NULL";
        } else if (this.getEcpgImpPago() != null) {
            conditions += " AND ECPG_IMP_PAGO = ?";
            values.add(this.getEcpgImpPago());
        }

        if (this.getEcpgImpPagoDis() != null && this.getEcpgImpPagoDis().longValue() == -999) {
            conditions += " AND ECPG_IMP_PAGO_DIS IS NULL";
        } else if (this.getEcpgImpPagoDis() != null) {
            conditions += " AND ECPG_IMP_PAGO_DIS = ?";
            values.add(this.getEcpgImpPagoDis());
        }

        if (this.getEcfcStCedevfco() != null && "null".equals(this.getEcfcStCedevfco())) {
            conditions += " AND ECFC_ST_CEDEVFCO IS NULL";
        } else if (this.getEcfcStCedevfco() != null) {
            conditions += " AND ECFC_ST_CEDEVFCO = ?";
            values.add(this.getEcfcStCedevfco());
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
        String sql = "UPDATE F_CEDECPAG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECPG_ID_PROGRAMA = ?";
        pkValues.add(this.getEcpgIdPrograma());
        conditions += " AND ECPG_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEcpgIdFideicomiso());
        conditions += " AND ECPG_ID_EMISION = ?";
        pkValues.add(this.getEcpgIdEmision());
        conditions += " AND ECPG_ID_PERIODO = ?";
        pkValues.add(this.getEcpgIdPeriodo());
        conditions += " AND ECFC_ID_CON_PAG = ?";
        pkValues.add(this.getEcfcIdConPag());
        fields += " ECPG_CONCEPTO = ?, ";
        values.add(this.getEcpgConcepto());
        fields += " ECPG_IMP_PAGO = ?, ";
        values.add(this.getEcpgImpPago());
        fields += " ECPG_IMP_PAGO_DIS = ?, ";
        values.add(this.getEcpgImpPagoDis());
        fields += " ECFC_ST_CEDEVFCO = ?, ";
        values.add(this.getEcfcStCedevfco());
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
        String sql = "INSERT INTO F_CEDECPAG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECPG_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEcpgIdPrograma());

        fields += ", ECPG_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEcpgIdFideicomiso());

        fields += ", ECPG_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEcpgIdEmision());

        fields += ", ECPG_ID_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEcpgIdPeriodo());

        fields += ", ECFC_ID_CON_PAG";
        fieldValues += ", ?";
        values.add(this.getEcfcIdConPag());

        fields += ", ECPG_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getEcpgConcepto());

        fields += ", ECPG_IMP_PAGO";
        fieldValues += ", ?";
        values.add(this.getEcpgImpPago());

        fields += ", ECPG_IMP_PAGO_DIS";
        fieldValues += ", ?";
        values.add(this.getEcpgImpPagoDis());

        fields += ", ECFC_ST_CEDEVFCO";
        fieldValues += ", ?";
        values.add(this.getEcfcStCedevfco());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CEDECPAG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECPG_ID_PROGRAMA = ?";
        values.add(this.getEcpgIdPrograma());
        conditions += " AND ECPG_ID_FIDEICOMISO = ?";
        values.add(this.getEcpgIdFideicomiso());
        conditions += " AND ECPG_ID_EMISION = ?";
        values.add(this.getEcpgIdEmision());
        conditions += " AND ECPG_ID_PERIODO = ?";
        values.add(this.getEcpgIdPeriodo());
        conditions += " AND ECFC_ID_CON_PAG = ?";
        values.add(this.getEcfcIdConPag());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCedecpag instance = (FCedecpag) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcpgIdPrograma().equals(instance.getEcpgIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEcpgIdFideicomiso().equals(instance.getEcpgIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEcpgIdEmision().equals(instance.getEcpgIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcpgIdPeriodo().equals(instance.getEcpgIdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcIdConPag().equals(instance.getEcfcIdConPag()))
            equalObjects = false;
        if (equalObjects && !this.getEcpgConcepto().equals(instance.getEcpgConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getEcpgImpPago().equals(instance.getEcpgImpPago()))
            equalObjects = false;
        if (equalObjects && !this.getEcpgImpPagoDis().equals(instance.getEcpgImpPagoDis()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcStCedevfco().equals(instance.getEcfcStCedevfco()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCedecpag result = new FCedecpag();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcpgIdPrograma((BigDecimal) objectData.getData("ECPG_ID_PROGRAMA"));
        result.setEcpgIdFideicomiso((BigDecimal) objectData.getData("ECPG_ID_FIDEICOMISO"));
        result.setEcpgIdEmision((BigDecimal) objectData.getData("ECPG_ID_EMISION"));
        result.setEcpgIdPeriodo((BigDecimal) objectData.getData("ECPG_ID_PERIODO"));
        result.setEcfcIdConPag((BigDecimal) objectData.getData("ECFC_ID_CON_PAG"));
        result.setEcpgConcepto((String) objectData.getData("ECPG_CONCEPTO"));
        result.setEcpgImpPago((BigDecimal) objectData.getData("ECPG_IMP_PAGO"));
        result.setEcpgImpPagoDis((BigDecimal) objectData.getData("ECPG_IMP_PAGO_DIS"));
        result.setEcfcStCedevfco((String) objectData.getData("ECFC_ST_CEDEVFCO"));

        return result;

    }

}
