package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FISCAL_SAT_PK", columns = { "FSA_NUM_CONTRATO", "FSA_ANO", "FSA_MES" }, sequences = { "MANUAL" })
public class FiscalSat extends DomainObject {

    BigDecimal fsaNumContrato = null;
    BigDecimal fsaAno = null;
    BigDecimal fsaMes = null;
    String fsaTipo = null;
    BigDecimal fsaImporte = null;

    public FiscalSat() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsaNumContrato(BigDecimal fsaNumContrato) {
        this.fsaNumContrato = fsaNumContrato;
    }

    public BigDecimal getFsaNumContrato() {
        return this.fsaNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFsaAno(BigDecimal fsaAno) {
        this.fsaAno = fsaAno;
    }

    public BigDecimal getFsaAno() {
        return this.fsaAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFsaMes(BigDecimal fsaMes) {
        this.fsaMes = fsaMes;
    }

    public BigDecimal getFsaMes() {
        return this.fsaMes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFsaTipo(String fsaTipo) {
        this.fsaTipo = fsaTipo;
    }

    public String getFsaTipo() {
        return this.fsaTipo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFsaImporte(BigDecimal fsaImporte) {
        this.fsaImporte = fsaImporte;
    }

    public BigDecimal getFsaImporte() {
        return this.fsaImporte;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FISCAL_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsaNumContrato() != null && this.getFsaNumContrato().longValue() == -999) {
            conditions += " AND FSA_NUM_CONTRATO IS NULL";
        } else if (this.getFsaNumContrato() != null) {
            conditions += " AND FSA_NUM_CONTRATO = ?";
            values.add(this.getFsaNumContrato());
        }

        if (this.getFsaAno() != null && this.getFsaAno().longValue() == -999) {
            conditions += " AND FSA_ANO IS NULL";
        } else if (this.getFsaAno() != null) {
            conditions += " AND FSA_ANO = ?";
            values.add(this.getFsaAno());
        }

        if (this.getFsaMes() != null && this.getFsaMes().longValue() == -999) {
            conditions += " AND FSA_MES IS NULL";
        } else if (this.getFsaMes() != null) {
            conditions += " AND FSA_MES = ?";
            values.add(this.getFsaMes());
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
        String sql = "SELECT * FROM FISCAL_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsaNumContrato() != null && this.getFsaNumContrato().longValue() == -999) {
            conditions += " AND FSA_NUM_CONTRATO IS NULL";
        } else if (this.getFsaNumContrato() != null) {
            conditions += " AND FSA_NUM_CONTRATO = ?";
            values.add(this.getFsaNumContrato());
        }

        if (this.getFsaAno() != null && this.getFsaAno().longValue() == -999) {
            conditions += " AND FSA_ANO IS NULL";
        } else if (this.getFsaAno() != null) {
            conditions += " AND FSA_ANO = ?";
            values.add(this.getFsaAno());
        }

        if (this.getFsaMes() != null && this.getFsaMes().longValue() == -999) {
            conditions += " AND FSA_MES IS NULL";
        } else if (this.getFsaMes() != null) {
            conditions += " AND FSA_MES = ?";
            values.add(this.getFsaMes());
        }

        if (this.getFsaTipo() != null && "null".equals(this.getFsaTipo())) {
            conditions += " AND FSA_TIPO IS NULL";
        } else if (this.getFsaTipo() != null) {
            conditions += " AND FSA_TIPO = ?";
            values.add(this.getFsaTipo());
        }

        if (this.getFsaImporte() != null && this.getFsaImporte().longValue() == -999) {
            conditions += " AND FSA_IMPORTE IS NULL";
        } else if (this.getFsaImporte() != null) {
            conditions += " AND FSA_IMPORTE = ?";
            values.add(this.getFsaImporte());
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
        String sql = "UPDATE FISCAL_SAT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FSA_NUM_CONTRATO = ?";
        pkValues.add(this.getFsaNumContrato());
        conditions += " AND FSA_ANO = ?";
        pkValues.add(this.getFsaAno());
        conditions += " AND FSA_MES = ?";
        pkValues.add(this.getFsaMes());
        fields += " FSA_TIPO = ?, ";
        values.add(this.getFsaTipo());
        fields += " FSA_IMPORTE = ?, ";
        values.add(this.getFsaImporte());
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
        String sql = "INSERT INTO FISCAL_SAT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FSA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFsaNumContrato());

        fields += ", FSA_ANO";
        fieldValues += ", ?";
        values.add(this.getFsaAno());

        fields += ", FSA_MES";
        fieldValues += ", ?";
        values.add(this.getFsaMes());

        fields += ", FSA_TIPO";
        fieldValues += ", ?";
        values.add(this.getFsaTipo());

        fields += ", FSA_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFsaImporte());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FISCAL_SAT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FSA_NUM_CONTRATO = ?";
        values.add(this.getFsaNumContrato());
        conditions += " AND FSA_ANO = ?";
        values.add(this.getFsaAno());
        conditions += " AND FSA_MES = ?";
        values.add(this.getFsaMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FiscalSat instance = (FiscalSat) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFsaNumContrato().equals(instance.getFsaNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFsaAno().equals(instance.getFsaAno()))
            equalObjects = false;
        if (equalObjects && !this.getFsaMes().equals(instance.getFsaMes()))
            equalObjects = false;
        if (equalObjects && !this.getFsaTipo().equals(instance.getFsaTipo()))
            equalObjects = false;
        if (equalObjects && !this.getFsaImporte().equals(instance.getFsaImporte()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FiscalSat result = new FiscalSat();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFsaNumContrato((BigDecimal) objectData.getData("FSA_NUM_CONTRATO"));
        result.setFsaAno((BigDecimal) objectData.getData("FSA_ANO"));
        result.setFsaMes((BigDecimal) objectData.getData("FSA_MES"));
        result.setFsaTipo((String) objectData.getData("FSA_TIPO"));
        result.setFsaImporte((BigDecimal) objectData.getData("FSA_IMPORTE"));

        return result;

    }

}
