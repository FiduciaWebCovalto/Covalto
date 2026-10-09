package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CEDEVFCO_PK", columns = { "ECFC_ID_PROGRAMA", "ECFC_ID_FIDEICOMISO", "ECFC_ID_EMISION", "ECFC_ID_PERIODO", "ECFC_ID_SEC_COB" },
            sequences = { "MANUAL" })
public class FCedevfco extends DomainObject {

    BigDecimal ecfcIdPrograma = null;
    BigDecimal ecfcIdFideicomiso = null;
    BigDecimal ecfcIdEmision = null;
    BigDecimal ecfcIdPeriodo = null;
    BigDecimal ecfcIdSecCob = null;
    String ecfcFecInicioPer = null;
    String ecfcFecFinPer = null;
    String ecfcFecPagoPer = null;
    String ecfcConcepto = null;
    String ecfcComentario = null;
    BigDecimal ecfcImpCobranza = null;
    String ecfcStCedevfco = null;

    public FCedevfco() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcfcIdPrograma(BigDecimal ecfcIdPrograma) {
        this.ecfcIdPrograma = ecfcIdPrograma;
    }

    public BigDecimal getEcfcIdPrograma() {
        return this.ecfcIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcfcIdFideicomiso(BigDecimal ecfcIdFideicomiso) {
        this.ecfcIdFideicomiso = ecfcIdFideicomiso;
    }

    public BigDecimal getEcfcIdFideicomiso() {
        return this.ecfcIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcfcIdEmision(BigDecimal ecfcIdEmision) {
        this.ecfcIdEmision = ecfcIdEmision;
    }

    public BigDecimal getEcfcIdEmision() {
        return this.ecfcIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcfcIdPeriodo(BigDecimal ecfcIdPeriodo) {
        this.ecfcIdPeriodo = ecfcIdPeriodo;
    }

    public BigDecimal getEcfcIdPeriodo() {
        return this.ecfcIdPeriodo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcfcIdSecCob(BigDecimal ecfcIdSecCob) {
        this.ecfcIdSecCob = ecfcIdSecCob;
    }

    public BigDecimal getEcfcIdSecCob() {
        return this.ecfcIdSecCob;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcfcFecInicioPer(String ecfcFecInicioPer) {
        this.ecfcFecInicioPer = ecfcFecInicioPer;
    }

    public String getEcfcFecInicioPer() {
        return this.ecfcFecInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcfcFecFinPer(String ecfcFecFinPer) {
        this.ecfcFecFinPer = ecfcFecFinPer;
    }

    public String getEcfcFecFinPer() {
        return this.ecfcFecFinPer;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcfcFecPagoPer(String ecfcFecPagoPer) {
        this.ecfcFecPagoPer = ecfcFecPagoPer;
    }

    public String getEcfcFecPagoPer() {
        return this.ecfcFecPagoPer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcfcConcepto(String ecfcConcepto) {
        this.ecfcConcepto = ecfcConcepto;
    }

    public String getEcfcConcepto() {
        return this.ecfcConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcfcComentario(String ecfcComentario) {
        this.ecfcComentario = ecfcComentario;
    }

    public String getEcfcComentario() {
        return this.ecfcComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcfcImpCobranza(BigDecimal ecfcImpCobranza) {
        this.ecfcImpCobranza = ecfcImpCobranza;
    }

    public BigDecimal getEcfcImpCobranza() {
        return this.ecfcImpCobranza;
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
        String sql = "SELECT * FROM F_CEDEVFCO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcfcIdPrograma() != null && this.getEcfcIdPrograma().longValue() == -999) {
            conditions += " AND ECFC_ID_PROGRAMA IS NULL";
        } else if (this.getEcfcIdPrograma() != null) {
            conditions += " AND ECFC_ID_PROGRAMA = ?";
            values.add(this.getEcfcIdPrograma());
        }

        if (this.getEcfcIdFideicomiso() != null && this.getEcfcIdFideicomiso().longValue() == -999) {
            conditions += " AND ECFC_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcfcIdFideicomiso() != null) {
            conditions += " AND ECFC_ID_FIDEICOMISO = ?";
            values.add(this.getEcfcIdFideicomiso());
        }

        if (this.getEcfcIdEmision() != null && this.getEcfcIdEmision().longValue() == -999) {
            conditions += " AND ECFC_ID_EMISION IS NULL";
        } else if (this.getEcfcIdEmision() != null) {
            conditions += " AND ECFC_ID_EMISION = ?";
            values.add(this.getEcfcIdEmision());
        }

        if (this.getEcfcIdPeriodo() != null && this.getEcfcIdPeriodo().longValue() == -999) {
            conditions += " AND ECFC_ID_PERIODO IS NULL";
        } else if (this.getEcfcIdPeriodo() != null) {
            conditions += " AND ECFC_ID_PERIODO = ?";
            values.add(this.getEcfcIdPeriodo());
        }

        if (this.getEcfcIdSecCob() != null && this.getEcfcIdSecCob().longValue() == -999) {
            conditions += " AND ECFC_ID_SEC_COB IS NULL";
        } else if (this.getEcfcIdSecCob() != null) {
            conditions += " AND ECFC_ID_SEC_COB = ?";
            values.add(this.getEcfcIdSecCob());
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
        String sql = "SELECT * FROM F_CEDEVFCO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcfcIdPrograma() != null && this.getEcfcIdPrograma().longValue() == -999) {
            conditions += " AND ECFC_ID_PROGRAMA IS NULL";
        } else if (this.getEcfcIdPrograma() != null) {
            conditions += " AND ECFC_ID_PROGRAMA = ?";
            values.add(this.getEcfcIdPrograma());
        }

        if (this.getEcfcIdFideicomiso() != null && this.getEcfcIdFideicomiso().longValue() == -999) {
            conditions += " AND ECFC_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcfcIdFideicomiso() != null) {
            conditions += " AND ECFC_ID_FIDEICOMISO = ?";
            values.add(this.getEcfcIdFideicomiso());
        }

        if (this.getEcfcIdEmision() != null && this.getEcfcIdEmision().longValue() == -999) {
            conditions += " AND ECFC_ID_EMISION IS NULL";
        } else if (this.getEcfcIdEmision() != null) {
            conditions += " AND ECFC_ID_EMISION = ?";
            values.add(this.getEcfcIdEmision());
        }

        if (this.getEcfcIdPeriodo() != null && this.getEcfcIdPeriodo().longValue() == -999) {
            conditions += " AND ECFC_ID_PERIODO IS NULL";
        } else if (this.getEcfcIdPeriodo() != null) {
            conditions += " AND ECFC_ID_PERIODO = ?";
            values.add(this.getEcfcIdPeriodo());
        }

        if (this.getEcfcIdSecCob() != null && this.getEcfcIdSecCob().longValue() == -999) {
            conditions += " AND ECFC_ID_SEC_COB IS NULL";
        } else if (this.getEcfcIdSecCob() != null) {
            conditions += " AND ECFC_ID_SEC_COB = ?";
            values.add(this.getEcfcIdSecCob());
        }

        if (this.getEcfcFecInicioPer() != null && "null".equals(this.getEcfcFecInicioPer())) {
            conditions += " AND ECFC_FEC_INICIO_PER IS NULL";
        } else if (this.getEcfcFecInicioPer() != null) {
            conditions += " AND ECFC_FEC_INICIO_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcfcFecInicioPer());
        }

        if (this.getEcfcFecFinPer() != null && "null".equals(this.getEcfcFecFinPer())) {
            conditions += " AND ECFC_FEC_FIN_PER IS NULL";
        } else if (this.getEcfcFecFinPer() != null) {
            conditions += " AND ECFC_FEC_FIN_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcfcFecFinPer());
        }

        if (this.getEcfcFecPagoPer() != null && "null".equals(this.getEcfcFecPagoPer())) {
            conditions += " AND ECFC_FEC_PAGO_PER IS NULL";
        } else if (this.getEcfcFecPagoPer() != null) {
            conditions += " AND ECFC_FEC_PAGO_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcfcFecPagoPer());
        }

        if (this.getEcfcConcepto() != null && "null".equals(this.getEcfcConcepto())) {
            conditions += " AND ECFC_CONCEPTO IS NULL";
        } else if (this.getEcfcConcepto() != null) {
            conditions += " AND ECFC_CONCEPTO = ?";
            values.add(this.getEcfcConcepto());
        }

        if (this.getEcfcComentario() != null && "null".equals(this.getEcfcComentario())) {
            conditions += " AND ECFC_COMENTARIO IS NULL";
        } else if (this.getEcfcComentario() != null) {
            conditions += " AND ECFC_COMENTARIO = ?";
            values.add(this.getEcfcComentario());
        }

        if (this.getEcfcImpCobranza() != null && this.getEcfcImpCobranza().longValue() == -999) {
            conditions += " AND ECFC_IMP_COBRANZA IS NULL";
        } else if (this.getEcfcImpCobranza() != null) {
            conditions += " AND ECFC_IMP_COBRANZA = ?";
            values.add(this.getEcfcImpCobranza());
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
        String sql = "UPDATE F_CEDEVFCO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECFC_ID_PROGRAMA = ?";
        pkValues.add(this.getEcfcIdPrograma());
        conditions += " AND ECFC_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEcfcIdFideicomiso());
        conditions += " AND ECFC_ID_EMISION = ?";
        pkValues.add(this.getEcfcIdEmision());
        conditions += " AND ECFC_ID_PERIODO = ?";
        pkValues.add(this.getEcfcIdPeriodo());
        conditions += " AND ECFC_ID_SEC_COB = ?";
        pkValues.add(this.getEcfcIdSecCob());
        fields += " ECFC_FEC_INICIO_PER = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcfcFecInicioPer());
        fields += " ECFC_FEC_FIN_PER = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcfcFecFinPer());
        fields += " ECFC_FEC_PAGO_PER = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcfcFecPagoPer());
        fields += " ECFC_CONCEPTO = ?, ";
        values.add(this.getEcfcConcepto());
        fields += " ECFC_COMENTARIO = ?, ";
        values.add(this.getEcfcComentario());
        fields += " ECFC_IMP_COBRANZA = ?, ";
        values.add(this.getEcfcImpCobranza());
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
        String sql = "INSERT INTO F_CEDEVFCO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECFC_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEcfcIdPrograma());

        fields += ", ECFC_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEcfcIdFideicomiso());

        fields += ", ECFC_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEcfcIdEmision());

        fields += ", ECFC_ID_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEcfcIdPeriodo());

        fields += ", ECFC_ID_SEC_COB";
        fieldValues += ", ?";
        values.add(this.getEcfcIdSecCob());

        fields += ", ECFC_FEC_INICIO_PER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcfcFecInicioPer());

        fields += ", ECFC_FEC_FIN_PER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcfcFecFinPer());

        fields += ", ECFC_FEC_PAGO_PER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcfcFecPagoPer());

        fields += ", ECFC_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getEcfcConcepto());

        fields += ", ECFC_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getEcfcComentario());

        fields += ", ECFC_IMP_COBRANZA";
        fieldValues += ", ?";
        values.add(this.getEcfcImpCobranza());

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
        String sql = "DELETE FROM F_CEDEVFCO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECFC_ID_PROGRAMA = ?";
        values.add(this.getEcfcIdPrograma());
        conditions += " AND ECFC_ID_FIDEICOMISO = ?";
        values.add(this.getEcfcIdFideicomiso());
        conditions += " AND ECFC_ID_EMISION = ?";
        values.add(this.getEcfcIdEmision());
        conditions += " AND ECFC_ID_PERIODO = ?";
        values.add(this.getEcfcIdPeriodo());
        conditions += " AND ECFC_ID_SEC_COB = ?";
        values.add(this.getEcfcIdSecCob());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCedevfco instance = (FCedevfco) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcfcIdPrograma().equals(instance.getEcfcIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcIdFideicomiso().equals(instance.getEcfcIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcIdEmision().equals(instance.getEcfcIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcIdPeriodo().equals(instance.getEcfcIdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcIdSecCob().equals(instance.getEcfcIdSecCob()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcFecInicioPer().equals(instance.getEcfcFecInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcFecFinPer().equals(instance.getEcfcFecFinPer()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcFecPagoPer().equals(instance.getEcfcFecPagoPer()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcConcepto().equals(instance.getEcfcConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcComentario().equals(instance.getEcfcComentario()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcImpCobranza().equals(instance.getEcfcImpCobranza()))
            equalObjects = false;
        if (equalObjects && !this.getEcfcStCedevfco().equals(instance.getEcfcStCedevfco()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCedevfco result = new FCedevfco();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcfcIdPrograma((BigDecimal) objectData.getData("ECFC_ID_PROGRAMA"));
        result.setEcfcIdFideicomiso((BigDecimal) objectData.getData("ECFC_ID_FIDEICOMISO"));
        result.setEcfcIdEmision((BigDecimal) objectData.getData("ECFC_ID_EMISION"));
        result.setEcfcIdPeriodo((BigDecimal) objectData.getData("ECFC_ID_PERIODO"));
        result.setEcfcIdSecCob((BigDecimal) objectData.getData("ECFC_ID_SEC_COB"));
        result.setEcfcFecInicioPer((String) objectData.getData("ECFC_FEC_INICIO_PER"));
        result.setEcfcFecFinPer((String) objectData.getData("ECFC_FEC_FIN_PER"));
        result.setEcfcFecPagoPer((String) objectData.getData("ECFC_FEC_PAGO_PER"));
        result.setEcfcConcepto((String) objectData.getData("ECFC_CONCEPTO"));
        result.setEcfcComentario((String) objectData.getData("ECFC_COMENTARIO"));
        result.setEcfcImpCobranza((BigDecimal) objectData.getData("ECFC_IMP_COBRANZA"));
        result.setEcfcStCedevfco((String) objectData.getData("ECFC_ST_CEDEVFCO"));

        return result;

    }

}
