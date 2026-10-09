package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ACUMULA_SALDOS_SICA_PK",
            columns = { "ASS_NUM_CTAM", "ASS_NUM_SCTA", "ASS_NUM_SSCTA", "ASS_NUM_SSSCTA", "ASS_NUM_SSSSCTA", "ASS_NUM_SSSSSCTA", "ASS_TIPO_ENTE", "ASS_ENTE"
    }, sequences = { "MANUAL" })
public class AcumulaSaldosSica extends DomainObject {

    BigDecimal assNumCtam = null;
    BigDecimal assNumScta = null;
    BigDecimal assNumSscta = null;
    BigDecimal assNumSsscta = null;
    BigDecimal assNumSssscta = null;
    BigDecimal assNumSsssscta = null;
    BigDecimal assTipoEnte = null;
    BigDecimal assEnte = null;
    BigDecimal assCargos = null;
    BigDecimal assAbonos = null;
    BigDecimal assSalFinal = null;

    public AcumulaSaldosSica() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAssNumCtam(BigDecimal assNumCtam) {
        this.assNumCtam = assNumCtam;
    }

    public BigDecimal getAssNumCtam() {
        return this.assNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAssNumScta(BigDecimal assNumScta) {
        this.assNumScta = assNumScta;
    }

    public BigDecimal getAssNumScta() {
        return this.assNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAssNumSscta(BigDecimal assNumSscta) {
        this.assNumSscta = assNumSscta;
    }

    public BigDecimal getAssNumSscta() {
        return this.assNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAssNumSsscta(BigDecimal assNumSsscta) {
        this.assNumSsscta = assNumSsscta;
    }

    public BigDecimal getAssNumSsscta() {
        return this.assNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAssNumSssscta(BigDecimal assNumSssscta) {
        this.assNumSssscta = assNumSssscta;
    }

    public BigDecimal getAssNumSssscta() {
        return this.assNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAssNumSsssscta(BigDecimal assNumSsssscta) {
        this.assNumSsssscta = assNumSsssscta;
    }

    public BigDecimal getAssNumSsssscta() {
        return this.assNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setAssTipoEnte(BigDecimal assTipoEnte) {
        this.assTipoEnte = assTipoEnte;
    }

    public BigDecimal getAssTipoEnte() {
        return this.assTipoEnte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 7, scale = 0, javaClass = BigDecimal.class)
    public void setAssEnte(BigDecimal assEnte) {
        this.assEnte = assEnte;
    }

    public BigDecimal getAssEnte() {
        return this.assEnte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAssCargos(BigDecimal assCargos) {
        this.assCargos = assCargos;
    }

    public BigDecimal getAssCargos() {
        return this.assCargos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAssAbonos(BigDecimal assAbonos) {
        this.assAbonos = assAbonos;
    }

    public BigDecimal getAssAbonos() {
        return this.assAbonos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAssSalFinal(BigDecimal assSalFinal) {
        this.assSalFinal = assSalFinal;
    }

    public BigDecimal getAssSalFinal() {
        return this.assSalFinal;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ACUMULA_SALDOS_SICA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAssNumCtam() != null && this.getAssNumCtam().longValue() == -999) {
            conditions += " AND ASS_NUM_CTAM IS NULL";
        } else if (this.getAssNumCtam() != null) {
            conditions += " AND ASS_NUM_CTAM = ?";
            values.add(this.getAssNumCtam());
        }

        if (this.getAssNumScta() != null && this.getAssNumScta().longValue() == -999) {
            conditions += " AND ASS_NUM_SCTA IS NULL";
        } else if (this.getAssNumScta() != null) {
            conditions += " AND ASS_NUM_SCTA = ?";
            values.add(this.getAssNumScta());
        }

        if (this.getAssNumSscta() != null && this.getAssNumSscta().longValue() == -999) {
            conditions += " AND ASS_NUM_SSCTA IS NULL";
        } else if (this.getAssNumSscta() != null) {
            conditions += " AND ASS_NUM_SSCTA = ?";
            values.add(this.getAssNumSscta());
        }

        if (this.getAssNumSsscta() != null && this.getAssNumSsscta().longValue() == -999) {
            conditions += " AND ASS_NUM_SSSCTA IS NULL";
        } else if (this.getAssNumSsscta() != null) {
            conditions += " AND ASS_NUM_SSSCTA = ?";
            values.add(this.getAssNumSsscta());
        }

        if (this.getAssNumSssscta() != null && this.getAssNumSssscta().longValue() == -999) {
            conditions += " AND ASS_NUM_SSSSCTA IS NULL";
        } else if (this.getAssNumSssscta() != null) {
            conditions += " AND ASS_NUM_SSSSCTA = ?";
            values.add(this.getAssNumSssscta());
        }

        if (this.getAssNumSsssscta() != null && this.getAssNumSsssscta().longValue() == -999) {
            conditions += " AND ASS_NUM_SSSSSCTA IS NULL";
        } else if (this.getAssNumSsssscta() != null) {
            conditions += " AND ASS_NUM_SSSSSCTA = ?";
            values.add(this.getAssNumSsssscta());
        }

        if (this.getAssTipoEnte() != null && this.getAssTipoEnte().longValue() == -999) {
            conditions += " AND ASS_TIPO_ENTE IS NULL";
        } else if (this.getAssTipoEnte() != null) {
            conditions += " AND ASS_TIPO_ENTE = ?";
            values.add(this.getAssTipoEnte());
        }

        if (this.getAssEnte() != null && this.getAssEnte().longValue() == -999) {
            conditions += " AND ASS_ENTE IS NULL";
        } else if (this.getAssEnte() != null) {
            conditions += " AND ASS_ENTE = ?";
            values.add(this.getAssEnte());
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
        String sql = "SELECT * FROM ACUMULA_SALDOS_SICA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAssNumCtam() != null && this.getAssNumCtam().longValue() == -999) {
            conditions += " AND ASS_NUM_CTAM IS NULL";
        } else if (this.getAssNumCtam() != null) {
            conditions += " AND ASS_NUM_CTAM = ?";
            values.add(this.getAssNumCtam());
        }

        if (this.getAssNumScta() != null && this.getAssNumScta().longValue() == -999) {
            conditions += " AND ASS_NUM_SCTA IS NULL";
        } else if (this.getAssNumScta() != null) {
            conditions += " AND ASS_NUM_SCTA = ?";
            values.add(this.getAssNumScta());
        }

        if (this.getAssNumSscta() != null && this.getAssNumSscta().longValue() == -999) {
            conditions += " AND ASS_NUM_SSCTA IS NULL";
        } else if (this.getAssNumSscta() != null) {
            conditions += " AND ASS_NUM_SSCTA = ?";
            values.add(this.getAssNumSscta());
        }

        if (this.getAssNumSsscta() != null && this.getAssNumSsscta().longValue() == -999) {
            conditions += " AND ASS_NUM_SSSCTA IS NULL";
        } else if (this.getAssNumSsscta() != null) {
            conditions += " AND ASS_NUM_SSSCTA = ?";
            values.add(this.getAssNumSsscta());
        }

        if (this.getAssNumSssscta() != null && this.getAssNumSssscta().longValue() == -999) {
            conditions += " AND ASS_NUM_SSSSCTA IS NULL";
        } else if (this.getAssNumSssscta() != null) {
            conditions += " AND ASS_NUM_SSSSCTA = ?";
            values.add(this.getAssNumSssscta());
        }

        if (this.getAssNumSsssscta() != null && this.getAssNumSsssscta().longValue() == -999) {
            conditions += " AND ASS_NUM_SSSSSCTA IS NULL";
        } else if (this.getAssNumSsssscta() != null) {
            conditions += " AND ASS_NUM_SSSSSCTA = ?";
            values.add(this.getAssNumSsssscta());
        }

        if (this.getAssTipoEnte() != null && this.getAssTipoEnte().longValue() == -999) {
            conditions += " AND ASS_TIPO_ENTE IS NULL";
        } else if (this.getAssTipoEnte() != null) {
            conditions += " AND ASS_TIPO_ENTE = ?";
            values.add(this.getAssTipoEnte());
        }

        if (this.getAssEnte() != null && this.getAssEnte().longValue() == -999) {
            conditions += " AND ASS_ENTE IS NULL";
        } else if (this.getAssEnte() != null) {
            conditions += " AND ASS_ENTE = ?";
            values.add(this.getAssEnte());
        }

        if (this.getAssCargos() != null && this.getAssCargos().longValue() == -999) {
            conditions += " AND ASS_CARGOS IS NULL";
        } else if (this.getAssCargos() != null) {
            conditions += " AND ASS_CARGOS = ?";
            values.add(this.getAssCargos());
        }

        if (this.getAssAbonos() != null && this.getAssAbonos().longValue() == -999) {
            conditions += " AND ASS_ABONOS IS NULL";
        } else if (this.getAssAbonos() != null) {
            conditions += " AND ASS_ABONOS = ?";
            values.add(this.getAssAbonos());
        }

        if (this.getAssSalFinal() != null && this.getAssSalFinal().longValue() == -999) {
            conditions += " AND ASS_SAL_FINAL IS NULL";
        } else if (this.getAssSalFinal() != null) {
            conditions += " AND ASS_SAL_FINAL = ?";
            values.add(this.getAssSalFinal());
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
        String sql = "UPDATE ACUMULA_SALDOS_SICA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ASS_NUM_CTAM = ?";
        pkValues.add(this.getAssNumCtam());
        conditions += " AND ASS_NUM_SCTA = ?";
        pkValues.add(this.getAssNumScta());
        conditions += " AND ASS_NUM_SSCTA = ?";
        pkValues.add(this.getAssNumSscta());
        conditions += " AND ASS_NUM_SSSCTA = ?";
        pkValues.add(this.getAssNumSsscta());
        conditions += " AND ASS_NUM_SSSSCTA = ?";
        pkValues.add(this.getAssNumSssscta());
        conditions += " AND ASS_NUM_SSSSSCTA = ?";
        pkValues.add(this.getAssNumSsssscta());
        conditions += " AND ASS_TIPO_ENTE = ?";
        pkValues.add(this.getAssTipoEnte());
        conditions += " AND ASS_ENTE = ?";
        pkValues.add(this.getAssEnte());
        fields += " ASS_CARGOS = ?, ";
        values.add(this.getAssCargos());
        fields += " ASS_ABONOS = ?, ";
        values.add(this.getAssAbonos());
        fields += " ASS_SAL_FINAL = ?, ";
        values.add(this.getAssSalFinal());
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
        String sql = "INSERT INTO ACUMULA_SALDOS_SICA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ASS_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getAssNumCtam());

        fields += ", ASS_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getAssNumScta());

        fields += ", ASS_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getAssNumSscta());

        fields += ", ASS_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getAssNumSsscta());

        fields += ", ASS_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getAssNumSssscta());

        fields += ", ASS_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getAssNumSsssscta());

        fields += ", ASS_TIPO_ENTE";
        fieldValues += ", ?";
        values.add(this.getAssTipoEnte());

        fields += ", ASS_ENTE";
        fieldValues += ", ?";
        values.add(this.getAssEnte());

        fields += ", ASS_CARGOS";
        fieldValues += ", ?";
        values.add(this.getAssCargos());

        fields += ", ASS_ABONOS";
        fieldValues += ", ?";
        values.add(this.getAssAbonos());

        fields += ", ASS_SAL_FINAL";
        fieldValues += ", ?";
        values.add(this.getAssSalFinal());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ACUMULA_SALDOS_SICA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ASS_NUM_CTAM = ?";
        values.add(this.getAssNumCtam());
        conditions += " AND ASS_NUM_SCTA = ?";
        values.add(this.getAssNumScta());
        conditions += " AND ASS_NUM_SSCTA = ?";
        values.add(this.getAssNumSscta());
        conditions += " AND ASS_NUM_SSSCTA = ?";
        values.add(this.getAssNumSsscta());
        conditions += " AND ASS_NUM_SSSSCTA = ?";
        values.add(this.getAssNumSssscta());
        conditions += " AND ASS_NUM_SSSSSCTA = ?";
        values.add(this.getAssNumSsssscta());
        conditions += " AND ASS_TIPO_ENTE = ?";
        values.add(this.getAssTipoEnte());
        conditions += " AND ASS_ENTE = ?";
        values.add(this.getAssEnte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        AcumulaSaldosSica instance = (AcumulaSaldosSica) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAssNumCtam().equals(instance.getAssNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getAssNumScta().equals(instance.getAssNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getAssNumSscta().equals(instance.getAssNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getAssNumSsscta().equals(instance.getAssNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getAssNumSssscta().equals(instance.getAssNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getAssNumSsssscta().equals(instance.getAssNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getAssTipoEnte().equals(instance.getAssTipoEnte()))
            equalObjects = false;
        if (equalObjects && !this.getAssEnte().equals(instance.getAssEnte()))
            equalObjects = false;
        if (equalObjects && !this.getAssCargos().equals(instance.getAssCargos()))
            equalObjects = false;
        if (equalObjects && !this.getAssAbonos().equals(instance.getAssAbonos()))
            equalObjects = false;
        if (equalObjects && !this.getAssSalFinal().equals(instance.getAssSalFinal()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        AcumulaSaldosSica result = new AcumulaSaldosSica();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAssNumCtam((BigDecimal) objectData.getData("ASS_NUM_CTAM"));
        result.setAssNumScta((BigDecimal) objectData.getData("ASS_NUM_SCTA"));
        result.setAssNumSscta((BigDecimal) objectData.getData("ASS_NUM_SSCTA"));
        result.setAssNumSsscta((BigDecimal) objectData.getData("ASS_NUM_SSSCTA"));
        result.setAssNumSssscta((BigDecimal) objectData.getData("ASS_NUM_SSSSCTA"));
        result.setAssNumSsssscta((BigDecimal) objectData.getData("ASS_NUM_SSSSSCTA"));
        result.setAssTipoEnte((BigDecimal) objectData.getData("ASS_TIPO_ENTE"));
        result.setAssEnte((BigDecimal) objectData.getData("ASS_ENTE"));
        result.setAssCargos((BigDecimal) objectData.getData("ASS_CARGOS"));
        result.setAssAbonos((BigDecimal) objectData.getData("ASS_ABONOS"));
        result.setAssSalFinal((BigDecimal) objectData.getData("ASS_SAL_FINAL"));

        return result;

    }

}
