package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIMORA_PK", columns = { "EEIM_ID_PROGRAMA", "EEIM_ID_FIDEICOMISO", "EEIM_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmimora extends DomainObject {

    BigDecimal eeimIdPrograma = null;
    BigDecimal eeimIdFideicomiso = null;
    BigDecimal eeimIdEmision = null;
    BigDecimal eeimDiasTrans = null;
    BigDecimal eeimSaldosInsoluto = null;
    BigDecimal eeimPjeMoratorios = null;
    BigDecimal eeimImpMoratorios = null;
    String eeimStEmimora = null;

    public FEmimora() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeimIdPrograma(BigDecimal eeimIdPrograma) {
        this.eeimIdPrograma = eeimIdPrograma;
    }

    public BigDecimal getEeimIdPrograma() {
        return this.eeimIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeimIdFideicomiso(BigDecimal eeimIdFideicomiso) {
        this.eeimIdFideicomiso = eeimIdFideicomiso;
    }

    public BigDecimal getEeimIdFideicomiso() {
        return this.eeimIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeimIdEmision(BigDecimal eeimIdEmision) {
        this.eeimIdEmision = eeimIdEmision;
    }

    public BigDecimal getEeimIdEmision() {
        return this.eeimIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeimDiasTrans(BigDecimal eeimDiasTrans) {
        this.eeimDiasTrans = eeimDiasTrans;
    }

    public BigDecimal getEeimDiasTrans() {
        return this.eeimDiasTrans;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeimSaldosInsoluto(BigDecimal eeimSaldosInsoluto) {
        this.eeimSaldosInsoluto = eeimSaldosInsoluto;
    }

    public BigDecimal getEeimSaldosInsoluto() {
        return this.eeimSaldosInsoluto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeimPjeMoratorios(BigDecimal eeimPjeMoratorios) {
        this.eeimPjeMoratorios = eeimPjeMoratorios;
    }

    public BigDecimal getEeimPjeMoratorios() {
        return this.eeimPjeMoratorios;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeimImpMoratorios(BigDecimal eeimImpMoratorios) {
        this.eeimImpMoratorios = eeimImpMoratorios;
    }

    public BigDecimal getEeimImpMoratorios() {
        return this.eeimImpMoratorios;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeimStEmimora(String eeimStEmimora) {
        this.eeimStEmimora = eeimStEmimora;
    }

    public String getEeimStEmimora() {
        return this.eeimStEmimora;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIMORA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeimIdPrograma() != null && this.getEeimIdPrograma().longValue() == -999) {
            conditions += " AND EEIM_ID_PROGRAMA IS NULL";
        } else if (this.getEeimIdPrograma() != null) {
            conditions += " AND EEIM_ID_PROGRAMA = ?";
            values.add(this.getEeimIdPrograma());
        }

        if (this.getEeimIdFideicomiso() != null && this.getEeimIdFideicomiso().longValue() == -999) {
            conditions += " AND EEIM_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeimIdFideicomiso() != null) {
            conditions += " AND EEIM_ID_FIDEICOMISO = ?";
            values.add(this.getEeimIdFideicomiso());
        }

        if (this.getEeimIdEmision() != null && this.getEeimIdEmision().longValue() == -999) {
            conditions += " AND EEIM_ID_EMISION IS NULL";
        } else if (this.getEeimIdEmision() != null) {
            conditions += " AND EEIM_ID_EMISION = ?";
            values.add(this.getEeimIdEmision());
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
        String sql = "SELECT * FROM F_EMIMORA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeimIdPrograma() != null && this.getEeimIdPrograma().longValue() == -999) {
            conditions += " AND EEIM_ID_PROGRAMA IS NULL";
        } else if (this.getEeimIdPrograma() != null) {
            conditions += " AND EEIM_ID_PROGRAMA = ?";
            values.add(this.getEeimIdPrograma());
        }

        if (this.getEeimIdFideicomiso() != null && this.getEeimIdFideicomiso().longValue() == -999) {
            conditions += " AND EEIM_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeimIdFideicomiso() != null) {
            conditions += " AND EEIM_ID_FIDEICOMISO = ?";
            values.add(this.getEeimIdFideicomiso());
        }

        if (this.getEeimIdEmision() != null && this.getEeimIdEmision().longValue() == -999) {
            conditions += " AND EEIM_ID_EMISION IS NULL";
        } else if (this.getEeimIdEmision() != null) {
            conditions += " AND EEIM_ID_EMISION = ?";
            values.add(this.getEeimIdEmision());
        }

        if (this.getEeimDiasTrans() != null && this.getEeimDiasTrans().longValue() == -999) {
            conditions += " AND EEIM_DIAS_TRANS IS NULL";
        } else if (this.getEeimDiasTrans() != null) {
            conditions += " AND EEIM_DIAS_TRANS = ?";
            values.add(this.getEeimDiasTrans());
        }

        if (this.getEeimSaldosInsoluto() != null && this.getEeimSaldosInsoluto().longValue() == -999) {
            conditions += " AND EEIM_SALDOS_INSOLUTO IS NULL";
        } else if (this.getEeimSaldosInsoluto() != null) {
            conditions += " AND EEIM_SALDOS_INSOLUTO = ?";
            values.add(this.getEeimSaldosInsoluto());
        }

        if (this.getEeimPjeMoratorios() != null && this.getEeimPjeMoratorios().longValue() == -999) {
            conditions += " AND EEIM_PJE_MORATORIOS IS NULL";
        } else if (this.getEeimPjeMoratorios() != null) {
            conditions += " AND EEIM_PJE_MORATORIOS = ?";
            values.add(this.getEeimPjeMoratorios());
        }

        if (this.getEeimImpMoratorios() != null && this.getEeimImpMoratorios().longValue() == -999) {
            conditions += " AND EEIM_IMP_MORATORIOS IS NULL";
        } else if (this.getEeimImpMoratorios() != null) {
            conditions += " AND EEIM_IMP_MORATORIOS = ?";
            values.add(this.getEeimImpMoratorios());
        }

        if (this.getEeimStEmimora() != null && "null".equals(this.getEeimStEmimora())) {
            conditions += " AND EEIM_ST_EMIMORA IS NULL";
        } else if (this.getEeimStEmimora() != null) {
            conditions += " AND EEIM_ST_EMIMORA = ?";
            values.add(this.getEeimStEmimora());
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
        String sql = "UPDATE F_EMIMORA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEIM_ID_PROGRAMA = ?";
        pkValues.add(this.getEeimIdPrograma());
        conditions += " AND EEIM_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeimIdFideicomiso());
        conditions += " AND EEIM_ID_EMISION = ?";
        pkValues.add(this.getEeimIdEmision());
        fields += " EEIM_DIAS_TRANS = ?, ";
        values.add(this.getEeimDiasTrans());
        fields += " EEIM_SALDOS_INSOLUTO = ?, ";
        values.add(this.getEeimSaldosInsoluto());
        fields += " EEIM_PJE_MORATORIOS = ?, ";
        values.add(this.getEeimPjeMoratorios());
        fields += " EEIM_IMP_MORATORIOS = ?, ";
        values.add(this.getEeimImpMoratorios());
        fields += " EEIM_ST_EMIMORA = ?, ";
        values.add(this.getEeimStEmimora());
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
        String sql = "INSERT INTO F_EMIMORA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEIM_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeimIdPrograma());

        fields += ", EEIM_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeimIdFideicomiso());

        fields += ", EEIM_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeimIdEmision());

        fields += ", EEIM_DIAS_TRANS";
        fieldValues += ", ?";
        values.add(this.getEeimDiasTrans());

        fields += ", EEIM_SALDOS_INSOLUTO";
        fieldValues += ", ?";
        values.add(this.getEeimSaldosInsoluto());

        fields += ", EEIM_PJE_MORATORIOS";
        fieldValues += ", ?";
        values.add(this.getEeimPjeMoratorios());

        fields += ", EEIM_IMP_MORATORIOS";
        fieldValues += ", ?";
        values.add(this.getEeimImpMoratorios());

        fields += ", EEIM_ST_EMIMORA";
        fieldValues += ", ?";
        values.add(this.getEeimStEmimora());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIMORA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEIM_ID_PROGRAMA = ?";
        values.add(this.getEeimIdPrograma());
        conditions += " AND EEIM_ID_FIDEICOMISO = ?";
        values.add(this.getEeimIdFideicomiso());
        conditions += " AND EEIM_ID_EMISION = ?";
        values.add(this.getEeimIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmimora instance = (FEmimora) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeimIdPrograma().equals(instance.getEeimIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeimIdFideicomiso().equals(instance.getEeimIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeimIdEmision().equals(instance.getEeimIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeimDiasTrans().equals(instance.getEeimDiasTrans()))
            equalObjects = false;
        if (equalObjects && !this.getEeimSaldosInsoluto().equals(instance.getEeimSaldosInsoluto()))
            equalObjects = false;
        if (equalObjects && !this.getEeimPjeMoratorios().equals(instance.getEeimPjeMoratorios()))
            equalObjects = false;
        if (equalObjects && !this.getEeimImpMoratorios().equals(instance.getEeimImpMoratorios()))
            equalObjects = false;
        if (equalObjects && !this.getEeimStEmimora().equals(instance.getEeimStEmimora()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmimora result = new FEmimora();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeimIdPrograma((BigDecimal) objectData.getData("EEIM_ID_PROGRAMA"));
        result.setEeimIdFideicomiso((BigDecimal) objectData.getData("EEIM_ID_FIDEICOMISO"));
        result.setEeimIdEmision((BigDecimal) objectData.getData("EEIM_ID_EMISION"));
        result.setEeimDiasTrans((BigDecimal) objectData.getData("EEIM_DIAS_TRANS"));
        result.setEeimSaldosInsoluto((BigDecimal) objectData.getData("EEIM_SALDOS_INSOLUTO"));
        result.setEeimPjeMoratorios((BigDecimal) objectData.getData("EEIM_PJE_MORATORIOS"));
        result.setEeimImpMoratorios((BigDecimal) objectData.getData("EEIM_IMP_MORATORIOS"));
        result.setEeimStEmimora((String) objectData.getData("EEIM_ST_EMIMORA"));

        return result;

    }

}
