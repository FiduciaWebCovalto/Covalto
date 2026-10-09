package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SALDO_INI_CONCILIA_PK",
            columns = { "SIC_NUM_CTAM", "SIC_NUM_SCTA", "SIC_NUM_SSCTA", "SIC_NUM_SSSCTA", "SIC_NUM_SSSSCTA", "SIC_NUM_SSSSSCTA", "SIC_TIPO_ENTE", "SIC_ENTE", "SIC_ANO", "SIC_MES"
    }, sequences = { "MANUAL" })
public class SaldoIniConcilia extends DomainObject {

    BigDecimal sicNumCtam = null;
    BigDecimal sicNumScta = null;
    BigDecimal sicNumSscta = null;
    BigDecimal sicNumSsscta = null;
    BigDecimal sicNumSssscta = null;
    BigDecimal sicNumSsssscta = null;
    BigDecimal sicTipoEnte = null;
    BigDecimal sicEnte = null;
    BigDecimal sicAno = null;
    BigDecimal sicMes = null;
    BigDecimal sicSalInicial = null;

    public SaldoIniConcilia() {
        super();
        this.pkColumns = 10;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSicNumCtam(BigDecimal sicNumCtam) {
        this.sicNumCtam = sicNumCtam;
    }

    public BigDecimal getSicNumCtam() {
        return this.sicNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSicNumScta(BigDecimal sicNumScta) {
        this.sicNumScta = sicNumScta;
    }

    public BigDecimal getSicNumScta() {
        return this.sicNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSicNumSscta(BigDecimal sicNumSscta) {
        this.sicNumSscta = sicNumSscta;
    }

    public BigDecimal getSicNumSscta() {
        return this.sicNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSicNumSsscta(BigDecimal sicNumSsscta) {
        this.sicNumSsscta = sicNumSsscta;
    }

    public BigDecimal getSicNumSsscta() {
        return this.sicNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSicNumSssscta(BigDecimal sicNumSssscta) {
        this.sicNumSssscta = sicNumSssscta;
    }

    public BigDecimal getSicNumSssscta() {
        return this.sicNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSicNumSsssscta(BigDecimal sicNumSsssscta) {
        this.sicNumSsssscta = sicNumSsssscta;
    }

    public BigDecimal getSicNumSsssscta() {
        return this.sicNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setSicTipoEnte(BigDecimal sicTipoEnte) {
        this.sicTipoEnte = sicTipoEnte;
    }

    public BigDecimal getSicTipoEnte() {
        return this.sicTipoEnte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 7, scale = 0, javaClass = BigDecimal.class)
    public void setSicEnte(BigDecimal sicEnte) {
        this.sicEnte = sicEnte;
    }

    public BigDecimal getSicEnte() {
        return this.sicEnte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSicAno(BigDecimal sicAno) {
        this.sicAno = sicAno;
    }

    public BigDecimal getSicAno() {
        return this.sicAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSicMes(BigDecimal sicMes) {
        this.sicMes = sicMes;
    }

    public BigDecimal getSicMes() {
        return this.sicMes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSicSalInicial(BigDecimal sicSalInicial) {
        this.sicSalInicial = sicSalInicial;
    }

    public BigDecimal getSicSalInicial() {
        return this.sicSalInicial;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SALDO_INI_CONCILIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSicNumCtam() != null && this.getSicNumCtam().longValue() == -999) {
            conditions += " AND SIC_NUM_CTAM IS NULL";
        } else if (this.getSicNumCtam() != null) {
            conditions += " AND SIC_NUM_CTAM = ?";
            values.add(this.getSicNumCtam());
        }

        if (this.getSicNumScta() != null && this.getSicNumScta().longValue() == -999) {
            conditions += " AND SIC_NUM_SCTA IS NULL";
        } else if (this.getSicNumScta() != null) {
            conditions += " AND SIC_NUM_SCTA = ?";
            values.add(this.getSicNumScta());
        }

        if (this.getSicNumSscta() != null && this.getSicNumSscta().longValue() == -999) {
            conditions += " AND SIC_NUM_SSCTA IS NULL";
        } else if (this.getSicNumSscta() != null) {
            conditions += " AND SIC_NUM_SSCTA = ?";
            values.add(this.getSicNumSscta());
        }

        if (this.getSicNumSsscta() != null && this.getSicNumSsscta().longValue() == -999) {
            conditions += " AND SIC_NUM_SSSCTA IS NULL";
        } else if (this.getSicNumSsscta() != null) {
            conditions += " AND SIC_NUM_SSSCTA = ?";
            values.add(this.getSicNumSsscta());
        }

        if (this.getSicNumSssscta() != null && this.getSicNumSssscta().longValue() == -999) {
            conditions += " AND SIC_NUM_SSSSCTA IS NULL";
        } else if (this.getSicNumSssscta() != null) {
            conditions += " AND SIC_NUM_SSSSCTA = ?";
            values.add(this.getSicNumSssscta());
        }

        if (this.getSicNumSsssscta() != null && this.getSicNumSsssscta().longValue() == -999) {
            conditions += " AND SIC_NUM_SSSSSCTA IS NULL";
        } else if (this.getSicNumSsssscta() != null) {
            conditions += " AND SIC_NUM_SSSSSCTA = ?";
            values.add(this.getSicNumSsssscta());
        }

        if (this.getSicTipoEnte() != null && this.getSicTipoEnte().longValue() == -999) {
            conditions += " AND SIC_TIPO_ENTE IS NULL";
        } else if (this.getSicTipoEnte() != null) {
            conditions += " AND SIC_TIPO_ENTE = ?";
            values.add(this.getSicTipoEnte());
        }

        if (this.getSicEnte() != null && this.getSicEnte().longValue() == -999) {
            conditions += " AND SIC_ENTE IS NULL";
        } else if (this.getSicEnte() != null) {
            conditions += " AND SIC_ENTE = ?";
            values.add(this.getSicEnte());
        }

        if (this.getSicAno() != null && this.getSicAno().longValue() == -999) {
            conditions += " AND SIC_ANO IS NULL";
        } else if (this.getSicAno() != null) {
            conditions += " AND SIC_ANO = ?";
            values.add(this.getSicAno());
        }

        if (this.getSicMes() != null && this.getSicMes().longValue() == -999) {
            conditions += " AND SIC_MES IS NULL";
        } else if (this.getSicMes() != null) {
            conditions += " AND SIC_MES = ?";
            values.add(this.getSicMes());
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
        String sql = "SELECT * FROM SALDO_INI_CONCILIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSicNumCtam() != null && this.getSicNumCtam().longValue() == -999) {
            conditions += " AND SIC_NUM_CTAM IS NULL";
        } else if (this.getSicNumCtam() != null) {
            conditions += " AND SIC_NUM_CTAM = ?";
            values.add(this.getSicNumCtam());
        }

        if (this.getSicNumScta() != null && this.getSicNumScta().longValue() == -999) {
            conditions += " AND SIC_NUM_SCTA IS NULL";
        } else if (this.getSicNumScta() != null) {
            conditions += " AND SIC_NUM_SCTA = ?";
            values.add(this.getSicNumScta());
        }

        if (this.getSicNumSscta() != null && this.getSicNumSscta().longValue() == -999) {
            conditions += " AND SIC_NUM_SSCTA IS NULL";
        } else if (this.getSicNumSscta() != null) {
            conditions += " AND SIC_NUM_SSCTA = ?";
            values.add(this.getSicNumSscta());
        }

        if (this.getSicNumSsscta() != null && this.getSicNumSsscta().longValue() == -999) {
            conditions += " AND SIC_NUM_SSSCTA IS NULL";
        } else if (this.getSicNumSsscta() != null) {
            conditions += " AND SIC_NUM_SSSCTA = ?";
            values.add(this.getSicNumSsscta());
        }

        if (this.getSicNumSssscta() != null && this.getSicNumSssscta().longValue() == -999) {
            conditions += " AND SIC_NUM_SSSSCTA IS NULL";
        } else if (this.getSicNumSssscta() != null) {
            conditions += " AND SIC_NUM_SSSSCTA = ?";
            values.add(this.getSicNumSssscta());
        }

        if (this.getSicNumSsssscta() != null && this.getSicNumSsssscta().longValue() == -999) {
            conditions += " AND SIC_NUM_SSSSSCTA IS NULL";
        } else if (this.getSicNumSsssscta() != null) {
            conditions += " AND SIC_NUM_SSSSSCTA = ?";
            values.add(this.getSicNumSsssscta());
        }

        if (this.getSicTipoEnte() != null && this.getSicTipoEnte().longValue() == -999) {
            conditions += " AND SIC_TIPO_ENTE IS NULL";
        } else if (this.getSicTipoEnte() != null) {
            conditions += " AND SIC_TIPO_ENTE = ?";
            values.add(this.getSicTipoEnte());
        }

        if (this.getSicEnte() != null && this.getSicEnte().longValue() == -999) {
            conditions += " AND SIC_ENTE IS NULL";
        } else if (this.getSicEnte() != null) {
            conditions += " AND SIC_ENTE = ?";
            values.add(this.getSicEnte());
        }

        if (this.getSicAno() != null && this.getSicAno().longValue() == -999) {
            conditions += " AND SIC_ANO IS NULL";
        } else if (this.getSicAno() != null) {
            conditions += " AND SIC_ANO = ?";
            values.add(this.getSicAno());
        }

        if (this.getSicMes() != null && this.getSicMes().longValue() == -999) {
            conditions += " AND SIC_MES IS NULL";
        } else if (this.getSicMes() != null) {
            conditions += " AND SIC_MES = ?";
            values.add(this.getSicMes());
        }

        if (this.getSicSalInicial() != null && this.getSicSalInicial().longValue() == -999) {
            conditions += " AND SIC_SAL_INICIAL IS NULL";
        } else if (this.getSicSalInicial() != null) {
            conditions += " AND SIC_SAL_INICIAL = ?";
            values.add(this.getSicSalInicial());
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
        String sql = "UPDATE SALDO_INI_CONCILIA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SIC_NUM_CTAM = ?";
        pkValues.add(this.getSicNumCtam());
        conditions += " AND SIC_NUM_SCTA = ?";
        pkValues.add(this.getSicNumScta());
        conditions += " AND SIC_NUM_SSCTA = ?";
        pkValues.add(this.getSicNumSscta());
        conditions += " AND SIC_NUM_SSSCTA = ?";
        pkValues.add(this.getSicNumSsscta());
        conditions += " AND SIC_NUM_SSSSCTA = ?";
        pkValues.add(this.getSicNumSssscta());
        conditions += " AND SIC_NUM_SSSSSCTA = ?";
        pkValues.add(this.getSicNumSsssscta());
        conditions += " AND SIC_TIPO_ENTE = ?";
        pkValues.add(this.getSicTipoEnte());
        conditions += " AND SIC_ENTE = ?";
        pkValues.add(this.getSicEnte());
        conditions += " AND SIC_ANO = ?";
        pkValues.add(this.getSicAno());
        conditions += " AND SIC_MES = ?";
        pkValues.add(this.getSicMes());
        fields += " SIC_SAL_INICIAL = ?, ";
        values.add(this.getSicSalInicial());
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
        String sql = "INSERT INTO SALDO_INI_CONCILIA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SIC_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getSicNumCtam());

        fields += ", SIC_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getSicNumScta());

        fields += ", SIC_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getSicNumSscta());

        fields += ", SIC_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getSicNumSsscta());

        fields += ", SIC_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getSicNumSssscta());

        fields += ", SIC_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getSicNumSsssscta());

        fields += ", SIC_TIPO_ENTE";
        fieldValues += ", ?";
        values.add(this.getSicTipoEnte());

        fields += ", SIC_ENTE";
        fieldValues += ", ?";
        values.add(this.getSicEnte());

        fields += ", SIC_ANO";
        fieldValues += ", ?";
        values.add(this.getSicAno());

        fields += ", SIC_MES";
        fieldValues += ", ?";
        values.add(this.getSicMes());

        fields += ", SIC_SAL_INICIAL";
        fieldValues += ", ?";
        values.add(this.getSicSalInicial());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SALDO_INI_CONCILIA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SIC_NUM_CTAM = ?";
        values.add(this.getSicNumCtam());
        conditions += " AND SIC_NUM_SCTA = ?";
        values.add(this.getSicNumScta());
        conditions += " AND SIC_NUM_SSCTA = ?";
        values.add(this.getSicNumSscta());
        conditions += " AND SIC_NUM_SSSCTA = ?";
        values.add(this.getSicNumSsscta());
        conditions += " AND SIC_NUM_SSSSCTA = ?";
        values.add(this.getSicNumSssscta());
        conditions += " AND SIC_NUM_SSSSSCTA = ?";
        values.add(this.getSicNumSsssscta());
        conditions += " AND SIC_TIPO_ENTE = ?";
        values.add(this.getSicTipoEnte());
        conditions += " AND SIC_ENTE = ?";
        values.add(this.getSicEnte());
        conditions += " AND SIC_ANO = ?";
        values.add(this.getSicAno());
        conditions += " AND SIC_MES = ?";
        values.add(this.getSicMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        SaldoIniConcilia instance = (SaldoIniConcilia) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSicNumCtam().equals(instance.getSicNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getSicNumScta().equals(instance.getSicNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getSicNumSscta().equals(instance.getSicNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getSicNumSsscta().equals(instance.getSicNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getSicNumSssscta().equals(instance.getSicNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getSicNumSsssscta().equals(instance.getSicNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getSicTipoEnte().equals(instance.getSicTipoEnte()))
            equalObjects = false;
        if (equalObjects && !this.getSicEnte().equals(instance.getSicEnte()))
            equalObjects = false;
        if (equalObjects && !this.getSicAno().equals(instance.getSicAno()))
            equalObjects = false;
        if (equalObjects && !this.getSicMes().equals(instance.getSicMes()))
            equalObjects = false;
        if (equalObjects && !this.getSicSalInicial().equals(instance.getSicSalInicial()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        SaldoIniConcilia result = new SaldoIniConcilia();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSicNumCtam((BigDecimal) objectData.getData("SIC_NUM_CTAM"));
        result.setSicNumScta((BigDecimal) objectData.getData("SIC_NUM_SCTA"));
        result.setSicNumSscta((BigDecimal) objectData.getData("SIC_NUM_SSCTA"));
        result.setSicNumSsscta((BigDecimal) objectData.getData("SIC_NUM_SSSCTA"));
        result.setSicNumSssscta((BigDecimal) objectData.getData("SIC_NUM_SSSSCTA"));
        result.setSicNumSsssscta((BigDecimal) objectData.getData("SIC_NUM_SSSSSCTA"));
        result.setSicTipoEnte((BigDecimal) objectData.getData("SIC_TIPO_ENTE"));
        result.setSicEnte((BigDecimal) objectData.getData("SIC_ENTE"));
        result.setSicAno((BigDecimal) objectData.getData("SIC_ANO"));
        result.setSicMes((BigDecimal) objectData.getData("SIC_MES"));
        result.setSicSalInicial((BigDecimal) objectData.getData("SIC_SAL_INICIAL"));

        return result;

    }

}
