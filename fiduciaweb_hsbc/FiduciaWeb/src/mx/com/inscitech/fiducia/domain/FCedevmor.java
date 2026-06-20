package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CEDEVMOR_PK", columns = { "ECMO_ID_PROGRAMA", "ECMO_ID_FIDEICOMISO", "ECMO_ID_EMISION", "ECMO_ID_PERIODO", "ECMO_ID_SEC_MOR" },
            sequences = { "MANUAL" })
public class FCedevmor extends DomainObject {

    BigDecimal ecmoIdPrograma = null;
    BigDecimal ecmoIdFideicomiso = null;
    BigDecimal ecmoIdEmision = null;
    BigDecimal ecmoIdPeriodo = null;
    BigDecimal ecmoIdSecMor = null;
    String ecmoConcepMor = null;
    String ecmoFecInicioExt = null;
    String ecmoFecFinExt = null;
    BigDecimal ecmoNumCtas = null;
    BigDecimal ecmoPorCtas = null;
    BigDecimal ecmoImpSaldo = null;
    String ecmoStCedevmor = null;

    public FCedevmor() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcmoIdPrograma(BigDecimal ecmoIdPrograma) {
        this.ecmoIdPrograma = ecmoIdPrograma;
    }

    public BigDecimal getEcmoIdPrograma() {
        return this.ecmoIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcmoIdFideicomiso(BigDecimal ecmoIdFideicomiso) {
        this.ecmoIdFideicomiso = ecmoIdFideicomiso;
    }

    public BigDecimal getEcmoIdFideicomiso() {
        return this.ecmoIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcmoIdEmision(BigDecimal ecmoIdEmision) {
        this.ecmoIdEmision = ecmoIdEmision;
    }

    public BigDecimal getEcmoIdEmision() {
        return this.ecmoIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcmoIdPeriodo(BigDecimal ecmoIdPeriodo) {
        this.ecmoIdPeriodo = ecmoIdPeriodo;
    }

    public BigDecimal getEcmoIdPeriodo() {
        return this.ecmoIdPeriodo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcmoIdSecMor(BigDecimal ecmoIdSecMor) {
        this.ecmoIdSecMor = ecmoIdSecMor;
    }

    public BigDecimal getEcmoIdSecMor() {
        return this.ecmoIdSecMor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcmoConcepMor(String ecmoConcepMor) {
        this.ecmoConcepMor = ecmoConcepMor;
    }

    public String getEcmoConcepMor() {
        return this.ecmoConcepMor;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcmoFecInicioExt(String ecmoFecInicioExt) {
        this.ecmoFecInicioExt = ecmoFecInicioExt;
    }

    public String getEcmoFecInicioExt() {
        return this.ecmoFecInicioExt;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcmoFecFinExt(String ecmoFecFinExt) {
        this.ecmoFecFinExt = ecmoFecFinExt;
    }

    public String getEcmoFecFinExt() {
        return this.ecmoFecFinExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcmoNumCtas(BigDecimal ecmoNumCtas) {
        this.ecmoNumCtas = ecmoNumCtas;
    }

    public BigDecimal getEcmoNumCtas() {
        return this.ecmoNumCtas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setEcmoPorCtas(BigDecimal ecmoPorCtas) {
        this.ecmoPorCtas = ecmoPorCtas;
    }

    public BigDecimal getEcmoPorCtas() {
        return this.ecmoPorCtas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcmoImpSaldo(BigDecimal ecmoImpSaldo) {
        this.ecmoImpSaldo = ecmoImpSaldo;
    }

    public BigDecimal getEcmoImpSaldo() {
        return this.ecmoImpSaldo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcmoStCedevmor(String ecmoStCedevmor) {
        this.ecmoStCedevmor = ecmoStCedevmor;
    }

    public String getEcmoStCedevmor() {
        return this.ecmoStCedevmor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CEDEVMOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcmoIdPrograma() != null && this.getEcmoIdPrograma().longValue() == -999) {
            conditions += " AND ECMO_ID_PROGRAMA IS NULL";
        } else if (this.getEcmoIdPrograma() != null) {
            conditions += " AND ECMO_ID_PROGRAMA = ?";
            values.add(this.getEcmoIdPrograma());
        }

        if (this.getEcmoIdFideicomiso() != null && this.getEcmoIdFideicomiso().longValue() == -999) {
            conditions += " AND ECMO_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcmoIdFideicomiso() != null) {
            conditions += " AND ECMO_ID_FIDEICOMISO = ?";
            values.add(this.getEcmoIdFideicomiso());
        }

        if (this.getEcmoIdEmision() != null && this.getEcmoIdEmision().longValue() == -999) {
            conditions += " AND ECMO_ID_EMISION IS NULL";
        } else if (this.getEcmoIdEmision() != null) {
            conditions += " AND ECMO_ID_EMISION = ?";
            values.add(this.getEcmoIdEmision());
        }

        if (this.getEcmoIdPeriodo() != null && this.getEcmoIdPeriodo().longValue() == -999) {
            conditions += " AND ECMO_ID_PERIODO IS NULL";
        } else if (this.getEcmoIdPeriodo() != null) {
            conditions += " AND ECMO_ID_PERIODO = ?";
            values.add(this.getEcmoIdPeriodo());
        }

        if (this.getEcmoIdSecMor() != null && this.getEcmoIdSecMor().longValue() == -999) {
            conditions += " AND ECMO_ID_SEC_MOR IS NULL";
        } else if (this.getEcmoIdSecMor() != null) {
            conditions += " AND ECMO_ID_SEC_MOR = ?";
            values.add(this.getEcmoIdSecMor());
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
        String sql = "SELECT * FROM F_CEDEVMOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcmoIdPrograma() != null && this.getEcmoIdPrograma().longValue() == -999) {
            conditions += " AND ECMO_ID_PROGRAMA IS NULL";
        } else if (this.getEcmoIdPrograma() != null) {
            conditions += " AND ECMO_ID_PROGRAMA = ?";
            values.add(this.getEcmoIdPrograma());
        }

        if (this.getEcmoIdFideicomiso() != null && this.getEcmoIdFideicomiso().longValue() == -999) {
            conditions += " AND ECMO_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcmoIdFideicomiso() != null) {
            conditions += " AND ECMO_ID_FIDEICOMISO = ?";
            values.add(this.getEcmoIdFideicomiso());
        }

        if (this.getEcmoIdEmision() != null && this.getEcmoIdEmision().longValue() == -999) {
            conditions += " AND ECMO_ID_EMISION IS NULL";
        } else if (this.getEcmoIdEmision() != null) {
            conditions += " AND ECMO_ID_EMISION = ?";
            values.add(this.getEcmoIdEmision());
        }

        if (this.getEcmoIdPeriodo() != null && this.getEcmoIdPeriodo().longValue() == -999) {
            conditions += " AND ECMO_ID_PERIODO IS NULL";
        } else if (this.getEcmoIdPeriodo() != null) {
            conditions += " AND ECMO_ID_PERIODO = ?";
            values.add(this.getEcmoIdPeriodo());
        }

        if (this.getEcmoIdSecMor() != null && this.getEcmoIdSecMor().longValue() == -999) {
            conditions += " AND ECMO_ID_SEC_MOR IS NULL";
        } else if (this.getEcmoIdSecMor() != null) {
            conditions += " AND ECMO_ID_SEC_MOR = ?";
            values.add(this.getEcmoIdSecMor());
        }

        if (this.getEcmoConcepMor() != null && "null".equals(this.getEcmoConcepMor())) {
            conditions += " AND ECMO_CONCEP_MOR IS NULL";
        } else if (this.getEcmoConcepMor() != null) {
            conditions += " AND ECMO_CONCEP_MOR = ?";
            values.add(this.getEcmoConcepMor());
        }

        if (this.getEcmoFecInicioExt() != null && "null".equals(this.getEcmoFecInicioExt())) {
            conditions += " AND ECMO_FEC_INICIO_EXT IS NULL";
        } else if (this.getEcmoFecInicioExt() != null) {
            conditions += " AND ECMO_FEC_INICIO_EXT = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcmoFecInicioExt());
        }

        if (this.getEcmoFecFinExt() != null && "null".equals(this.getEcmoFecFinExt())) {
            conditions += " AND ECMO_FEC_FIN_EXT IS NULL";
        } else if (this.getEcmoFecFinExt() != null) {
            conditions += " AND ECMO_FEC_FIN_EXT = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcmoFecFinExt());
        }

        if (this.getEcmoNumCtas() != null && this.getEcmoNumCtas().longValue() == -999) {
            conditions += " AND ECMO_NUM_CTAS IS NULL";
        } else if (this.getEcmoNumCtas() != null) {
            conditions += " AND ECMO_NUM_CTAS = ?";
            values.add(this.getEcmoNumCtas());
        }

        if (this.getEcmoPorCtas() != null && this.getEcmoPorCtas().longValue() == -999) {
            conditions += " AND ECMO_POR_CTAS IS NULL";
        } else if (this.getEcmoPorCtas() != null) {
            conditions += " AND ECMO_POR_CTAS = ?";
            values.add(this.getEcmoPorCtas());
        }

        if (this.getEcmoImpSaldo() != null && this.getEcmoImpSaldo().longValue() == -999) {
            conditions += " AND ECMO_IMP_SALDO IS NULL";
        } else if (this.getEcmoImpSaldo() != null) {
            conditions += " AND ECMO_IMP_SALDO = ?";
            values.add(this.getEcmoImpSaldo());
        }

        if (this.getEcmoStCedevmor() != null && "null".equals(this.getEcmoStCedevmor())) {
            conditions += " AND ECMO_ST_CEDEVMOR IS NULL";
        } else if (this.getEcmoStCedevmor() != null) {
            conditions += " AND ECMO_ST_CEDEVMOR = ?";
            values.add(this.getEcmoStCedevmor());
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
        String sql = "UPDATE F_CEDEVMOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECMO_ID_PROGRAMA = ?";
        pkValues.add(this.getEcmoIdPrograma());
        conditions += " AND ECMO_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEcmoIdFideicomiso());
        conditions += " AND ECMO_ID_EMISION = ?";
        pkValues.add(this.getEcmoIdEmision());
        conditions += " AND ECMO_ID_PERIODO = ?";
        pkValues.add(this.getEcmoIdPeriodo());
        conditions += " AND ECMO_ID_SEC_MOR = ?";
        pkValues.add(this.getEcmoIdSecMor());
        fields += " ECMO_CONCEP_MOR = ?, ";
        values.add(this.getEcmoConcepMor());
        fields += " ECMO_FEC_INICIO_EXT = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcmoFecInicioExt());
        fields += " ECMO_FEC_FIN_EXT = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcmoFecFinExt());
        fields += " ECMO_NUM_CTAS = ?, ";
        values.add(this.getEcmoNumCtas());
        fields += " ECMO_POR_CTAS = ?, ";
        values.add(this.getEcmoPorCtas());
        fields += " ECMO_IMP_SALDO = ?, ";
        values.add(this.getEcmoImpSaldo());
        fields += " ECMO_ST_CEDEVMOR = ?, ";
        values.add(this.getEcmoStCedevmor());
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
        String sql = "INSERT INTO F_CEDEVMOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECMO_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEcmoIdPrograma());

        fields += ", ECMO_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEcmoIdFideicomiso());

        fields += ", ECMO_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEcmoIdEmision());

        fields += ", ECMO_ID_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEcmoIdPeriodo());

        fields += ", ECMO_ID_SEC_MOR";
        fieldValues += ", ?";
        values.add(this.getEcmoIdSecMor());

        fields += ", ECMO_CONCEP_MOR";
        fieldValues += ", ?";
        values.add(this.getEcmoConcepMor());

        fields += ", ECMO_FEC_INICIO_EXT";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcmoFecInicioExt());

        fields += ", ECMO_FEC_FIN_EXT";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcmoFecFinExt());

        fields += ", ECMO_NUM_CTAS";
        fieldValues += ", ?";
        values.add(this.getEcmoNumCtas());

        fields += ", ECMO_POR_CTAS";
        fieldValues += ", ?";
        values.add(this.getEcmoPorCtas());

        fields += ", ECMO_IMP_SALDO";
        fieldValues += ", ?";
        values.add(this.getEcmoImpSaldo());

        fields += ", ECMO_ST_CEDEVMOR";
        fieldValues += ", ?";
        values.add(this.getEcmoStCedevmor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CEDEVMOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECMO_ID_PROGRAMA = ?";
        values.add(this.getEcmoIdPrograma());
        conditions += " AND ECMO_ID_FIDEICOMISO = ?";
        values.add(this.getEcmoIdFideicomiso());
        conditions += " AND ECMO_ID_EMISION = ?";
        values.add(this.getEcmoIdEmision());
        conditions += " AND ECMO_ID_PERIODO = ?";
        values.add(this.getEcmoIdPeriodo());
        conditions += " AND ECMO_ID_SEC_MOR = ?";
        values.add(this.getEcmoIdSecMor());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCedevmor instance = (FCedevmor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcmoIdPrograma().equals(instance.getEcmoIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoIdFideicomiso().equals(instance.getEcmoIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoIdEmision().equals(instance.getEcmoIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoIdPeriodo().equals(instance.getEcmoIdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoIdSecMor().equals(instance.getEcmoIdSecMor()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoConcepMor().equals(instance.getEcmoConcepMor()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoFecInicioExt().equals(instance.getEcmoFecInicioExt()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoFecFinExt().equals(instance.getEcmoFecFinExt()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoNumCtas().equals(instance.getEcmoNumCtas()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoPorCtas().equals(instance.getEcmoPorCtas()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoImpSaldo().equals(instance.getEcmoImpSaldo()))
            equalObjects = false;
        if (equalObjects && !this.getEcmoStCedevmor().equals(instance.getEcmoStCedevmor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCedevmor result = new FCedevmor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcmoIdPrograma((BigDecimal) objectData.getData("ECMO_ID_PROGRAMA"));
        result.setEcmoIdFideicomiso((BigDecimal) objectData.getData("ECMO_ID_FIDEICOMISO"));
        result.setEcmoIdEmision((BigDecimal) objectData.getData("ECMO_ID_EMISION"));
        result.setEcmoIdPeriodo((BigDecimal) objectData.getData("ECMO_ID_PERIODO"));
        result.setEcmoIdSecMor((BigDecimal) objectData.getData("ECMO_ID_SEC_MOR"));
        result.setEcmoConcepMor((String) objectData.getData("ECMO_CONCEP_MOR"));
        result.setEcmoFecInicioExt((String) objectData.getData("ECMO_FEC_INICIO_EXT"));
        result.setEcmoFecFinExt((String) objectData.getData("ECMO_FEC_FIN_EXT"));
        result.setEcmoNumCtas((BigDecimal) objectData.getData("ECMO_NUM_CTAS"));
        result.setEcmoPorCtas((BigDecimal) objectData.getData("ECMO_POR_CTAS"));
        result.setEcmoImpSaldo((BigDecimal) objectData.getData("ECMO_IMP_SALDO"));
        result.setEcmoStCedevmor((String) objectData.getData("ECMO_ST_CEDEVMOR"));

        return result;

    }

}
