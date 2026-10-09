package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_TKYC_CONC_VAL_PK", columns = { "FTCV_ID_CONC_VALOR", "FTCP_ID_CONCEPTOS" }, sequences = { "MANUAL" })
public class FTkycConcVal extends DomainObject {

    BigDecimal ftcvIdConcValor = null;
    BigDecimal ftcpIdConceptos = null;
    String ftcvValor = null;

    public FTkycConcVal() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtcvIdConcValor(BigDecimal ftcvIdConcValor) {
        this.ftcvIdConcValor = ftcvIdConcValor;
    }

    public BigDecimal getFtcvIdConcValor() {
        return this.ftcvIdConcValor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtcpIdConceptos(BigDecimal ftcpIdConceptos) {
        this.ftcpIdConceptos = ftcpIdConceptos;
    }

    public BigDecimal getFtcpIdConceptos() {
        return this.ftcpIdConceptos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFtcvValor(String ftcvValor) {
        this.ftcvValor = ftcvValor;
    }

    public String getFtcvValor() {
        return this.ftcvValor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_TKYC_CONC_VAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFtcvIdConcValor() != null && this.getFtcvIdConcValor().longValue() == -999) {
            conditions += " AND FTCV_ID_CONC_VALOR IS NULL";
        } else if (this.getFtcvIdConcValor() != null) {
            conditions += " AND FTCV_ID_CONC_VALOR = ?";
            values.add(this.getFtcvIdConcValor());
        }

        if (this.getFtcpIdConceptos() != null && this.getFtcpIdConceptos().longValue() == -999) {
            conditions += " AND FTCP_ID_CONCEPTOS IS NULL";
        } else if (this.getFtcpIdConceptos() != null) {
            conditions += " AND FTCP_ID_CONCEPTOS = ?";
            values.add(this.getFtcpIdConceptos());
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
        String sql = "SELECT * FROM F_TKYC_CONC_VAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFtcvIdConcValor() != null && this.getFtcvIdConcValor().longValue() == -999) {
            conditions += " AND FTCV_ID_CONC_VALOR IS NULL";
        } else if (this.getFtcvIdConcValor() != null) {
            conditions += " AND FTCV_ID_CONC_VALOR = ?";
            values.add(this.getFtcvIdConcValor());
        }

        if (this.getFtcpIdConceptos() != null && this.getFtcpIdConceptos().longValue() == -999) {
            conditions += " AND FTCP_ID_CONCEPTOS IS NULL";
        } else if (this.getFtcpIdConceptos() != null) {
            conditions += " AND FTCP_ID_CONCEPTOS = ?";
            values.add(this.getFtcpIdConceptos());
        }

        if (this.getFtcvValor() != null && "null".equals(this.getFtcvValor())) {
            conditions += " AND FTCV_VALOR IS NULL";
        } else if (this.getFtcvValor() != null) {
            conditions += " AND FTCV_VALOR = ?";
            values.add(this.getFtcvValor());
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
        String sql = "UPDATE F_TKYC_CONC_VAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FTCV_ID_CONC_VALOR = ?";
        pkValues.add(this.getFtcvIdConcValor());
        conditions += " AND FTCP_ID_CONCEPTOS = ?";
        pkValues.add(this.getFtcpIdConceptos());
        fields += " FTCV_VALOR = ?, ";
        values.add(this.getFtcvValor());
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
        String sql = "INSERT INTO F_TKYC_CONC_VAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FTCV_ID_CONC_VALOR";
        fieldValues += ", ?";
        values.add(this.getFtcvIdConcValor());

        fields += ", FTCP_ID_CONCEPTOS";
        fieldValues += ", ?";
        values.add(this.getFtcpIdConceptos());

        fields += ", FTCV_VALOR";
        fieldValues += ", ?";
        values.add(this.getFtcvValor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_TKYC_CONC_VAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FTCV_ID_CONC_VALOR = ?";
        values.add(this.getFtcvIdConcValor());
        conditions += " AND FTCP_ID_CONCEPTOS = ?";
        values.add(this.getFtcpIdConceptos());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FTkycConcVal instance = (FTkycConcVal) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFtcvIdConcValor().equals(instance.getFtcvIdConcValor()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpIdConceptos().equals(instance.getFtcpIdConceptos()))
            equalObjects = false;
        if (equalObjects && !this.getFtcvValor().equals(instance.getFtcvValor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FTkycConcVal result = new FTkycConcVal();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFtcvIdConcValor((BigDecimal) objectData.getData("FTCV_ID_CONC_VALOR"));
        result.setFtcpIdConceptos((BigDecimal) objectData.getData("FTCP_ID_CONCEPTOS"));
        result.setFtcvValor((String) objectData.getData("FTCV_VALOR"));

        return result;

    }

}
