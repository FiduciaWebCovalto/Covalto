package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0016517", columns = { "FCUE_MAYOR", "FCUE_SUB_CTA", "FCUE_SS_CTA", "FCUE_SSS_CTA", "FCUE_SSSS_CTA", "FCUE_SSSSS_CTA", "FACO_ID_AGRUPACION" },
            sequences = { "MANUAL" })
public class FCuencoRubro extends DomainObject {

    BigDecimal fcueMayor = null;
    BigDecimal fcueSubCta = null;
    BigDecimal fcueSsCta = null;
    BigDecimal fcueSssCta = null;
    BigDecimal fcueSsssCta = null;
    BigDecimal fcueSssssCta = null;
    BigDecimal facoIdAgrupacion = null;

    public FCuencoRubro() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFcueMayor(BigDecimal fcueMayor) {
        this.fcueMayor = fcueMayor;
    }

    public BigDecimal getFcueMayor() {
        return this.fcueMayor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcueSubCta(BigDecimal fcueSubCta) {
        this.fcueSubCta = fcueSubCta;
    }

    public BigDecimal getFcueSubCta() {
        return this.fcueSubCta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcueSsCta(BigDecimal fcueSsCta) {
        this.fcueSsCta = fcueSsCta;
    }

    public BigDecimal getFcueSsCta() {
        return this.fcueSsCta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcueSssCta(BigDecimal fcueSssCta) {
        this.fcueSssCta = fcueSssCta;
    }

    public BigDecimal getFcueSssCta() {
        return this.fcueSssCta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcueSsssCta(BigDecimal fcueSsssCta) {
        this.fcueSsssCta = fcueSsssCta;
    }

    public BigDecimal getFcueSsssCta() {
        return this.fcueSsssCta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcueSssssCta(BigDecimal fcueSssssCta) {
        this.fcueSssssCta = fcueSssssCta;
    }

    public BigDecimal getFcueSssssCta() {
        return this.fcueSssssCta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFacoIdAgrupacion(BigDecimal facoIdAgrupacion) {
        this.facoIdAgrupacion = facoIdAgrupacion;
    }

    public BigDecimal getFacoIdAgrupacion() {
        return this.facoIdAgrupacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CUENCO_RUBRO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcueMayor() != null && this.getFcueMayor().longValue() == -999) {
            conditions += " AND FCUE_MAYOR IS NULL";
        } else if (this.getFcueMayor() != null) {
            conditions += " AND FCUE_MAYOR = ?";
            values.add(this.getFcueMayor());
        }

        if (this.getFcueSubCta() != null && this.getFcueSubCta().longValue() == -999) {
            conditions += " AND FCUE_SUB_CTA IS NULL";
        } else if (this.getFcueSubCta() != null) {
            conditions += " AND FCUE_SUB_CTA = ?";
            values.add(this.getFcueSubCta());
        }

        if (this.getFcueSsCta() != null && this.getFcueSsCta().longValue() == -999) {
            conditions += " AND FCUE_SS_CTA IS NULL";
        } else if (this.getFcueSsCta() != null) {
            conditions += " AND FCUE_SS_CTA = ?";
            values.add(this.getFcueSsCta());
        }

        if (this.getFcueSssCta() != null && this.getFcueSssCta().longValue() == -999) {
            conditions += " AND FCUE_SSS_CTA IS NULL";
        } else if (this.getFcueSssCta() != null) {
            conditions += " AND FCUE_SSS_CTA = ?";
            values.add(this.getFcueSssCta());
        }

        if (this.getFcueSsssCta() != null && this.getFcueSsssCta().longValue() == -999) {
            conditions += " AND FCUE_SSSS_CTA IS NULL";
        } else if (this.getFcueSsssCta() != null) {
            conditions += " AND FCUE_SSSS_CTA = ?";
            values.add(this.getFcueSsssCta());
        }

        if (this.getFcueSssssCta() != null && this.getFcueSssssCta().longValue() == -999) {
            conditions += " AND FCUE_SSSSS_CTA IS NULL";
        } else if (this.getFcueSssssCta() != null) {
            conditions += " AND FCUE_SSSSS_CTA = ?";
            values.add(this.getFcueSssssCta());
        }

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
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
        String sql = "SELECT * FROM F_CUENCO_RUBRO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcueMayor() != null && this.getFcueMayor().longValue() == -999) {
            conditions += " AND FCUE_MAYOR IS NULL";
        } else if (this.getFcueMayor() != null) {
            conditions += " AND FCUE_MAYOR = ?";
            values.add(this.getFcueMayor());
        }

        if (this.getFcueSubCta() != null && this.getFcueSubCta().longValue() == -999) {
            conditions += " AND FCUE_SUB_CTA IS NULL";
        } else if (this.getFcueSubCta() != null) {
            conditions += " AND FCUE_SUB_CTA = ?";
            values.add(this.getFcueSubCta());
        }

        if (this.getFcueSsCta() != null && this.getFcueSsCta().longValue() == -999) {
            conditions += " AND FCUE_SS_CTA IS NULL";
        } else if (this.getFcueSsCta() != null) {
            conditions += " AND FCUE_SS_CTA = ?";
            values.add(this.getFcueSsCta());
        }

        if (this.getFcueSssCta() != null && this.getFcueSssCta().longValue() == -999) {
            conditions += " AND FCUE_SSS_CTA IS NULL";
        } else if (this.getFcueSssCta() != null) {
            conditions += " AND FCUE_SSS_CTA = ?";
            values.add(this.getFcueSssCta());
        }

        if (this.getFcueSsssCta() != null && this.getFcueSsssCta().longValue() == -999) {
            conditions += " AND FCUE_SSSS_CTA IS NULL";
        } else if (this.getFcueSsssCta() != null) {
            conditions += " AND FCUE_SSSS_CTA = ?";
            values.add(this.getFcueSsssCta());
        }

        if (this.getFcueSssssCta() != null && this.getFcueSssssCta().longValue() == -999) {
            conditions += " AND FCUE_SSSSS_CTA IS NULL";
        } else if (this.getFcueSssssCta() != null) {
            conditions += " AND FCUE_SSSSS_CTA = ?";
            values.add(this.getFcueSssssCta());
        }

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
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
        String sql = "UPDATE F_CUENCO_RUBRO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCUE_MAYOR = ?";
        pkValues.add(this.getFcueMayor());
        conditions += " AND FCUE_SUB_CTA = ?";
        pkValues.add(this.getFcueSubCta());
        conditions += " AND FCUE_SS_CTA = ?";
        pkValues.add(this.getFcueSsCta());
        conditions += " AND FCUE_SSS_CTA = ?";
        pkValues.add(this.getFcueSssCta());
        conditions += " AND FCUE_SSSS_CTA = ?";
        pkValues.add(this.getFcueSsssCta());
        conditions += " AND FCUE_SSSSS_CTA = ?";
        pkValues.add(this.getFcueSssssCta());
        conditions += " AND FACO_ID_AGRUPACION = ?";
        pkValues.add(this.getFacoIdAgrupacion());
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
        String sql = "INSERT INTO F_CUENCO_RUBRO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCUE_MAYOR";
        fieldValues += ", ?";
        values.add(this.getFcueMayor());

        fields += ", FCUE_SUB_CTA";
        fieldValues += ", ?";
        values.add(this.getFcueSubCta());

        fields += ", FCUE_SS_CTA";
        fieldValues += ", ?";
        values.add(this.getFcueSsCta());

        fields += ", FCUE_SSS_CTA";
        fieldValues += ", ?";
        values.add(this.getFcueSssCta());

        fields += ", FCUE_SSSS_CTA";
        fieldValues += ", ?";
        values.add(this.getFcueSsssCta());

        fields += ", FCUE_SSSSS_CTA";
        fieldValues += ", ?";
        values.add(this.getFcueSssssCta());

        fields += ", FACO_ID_AGRUPACION";
        fieldValues += ", ?";
        values.add(this.getFacoIdAgrupacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CUENCO_RUBRO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCUE_MAYOR = ?";
        values.add(this.getFcueMayor());
        conditions += " AND FCUE_SUB_CTA = ?";
        values.add(this.getFcueSubCta());
        conditions += " AND FCUE_SS_CTA = ?";
        values.add(this.getFcueSsCta());
        conditions += " AND FCUE_SSS_CTA = ?";
        values.add(this.getFcueSssCta());
        conditions += " AND FCUE_SSSS_CTA = ?";
        values.add(this.getFcueSsssCta());
        conditions += " AND FCUE_SSSSS_CTA = ?";
        values.add(this.getFcueSssssCta());
        conditions += " AND FACO_ID_AGRUPACION = ?";
        values.add(this.getFacoIdAgrupacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCuencoRubro instance = (FCuencoRubro) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcueMayor().equals(instance.getFcueMayor()))
            equalObjects = false;
        if (equalObjects && !this.getFcueSubCta().equals(instance.getFcueSubCta()))
            equalObjects = false;
        if (equalObjects && !this.getFcueSsCta().equals(instance.getFcueSsCta()))
            equalObjects = false;
        if (equalObjects && !this.getFcueSssCta().equals(instance.getFcueSssCta()))
            equalObjects = false;
        if (equalObjects && !this.getFcueSsssCta().equals(instance.getFcueSsssCta()))
            equalObjects = false;
        if (equalObjects && !this.getFcueSssssCta().equals(instance.getFcueSssssCta()))
            equalObjects = false;
        if (equalObjects && !this.getFacoIdAgrupacion().equals(instance.getFacoIdAgrupacion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCuencoRubro result = new FCuencoRubro();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcueMayor((BigDecimal) objectData.getData("FCUE_MAYOR"));
        result.setFcueSubCta((BigDecimal) objectData.getData("FCUE_SUB_CTA"));
        result.setFcueSsCta((BigDecimal) objectData.getData("FCUE_SS_CTA"));
        result.setFcueSssCta((BigDecimal) objectData.getData("FCUE_SSS_CTA"));
        result.setFcueSsssCta((BigDecimal) objectData.getData("FCUE_SSSS_CTA"));
        result.setFcueSssssCta((BigDecimal) objectData.getData("FCUE_SSSSS_CTA"));
        result.setFacoIdAgrupacion((BigDecimal) objectData.getData("FACO_ID_AGRUPACION"));

        return result;

    }

}
