package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONCILIA_SALDOS_PK",
            columns =
            { "CSA_NUM_CTAM", "CSA_NUM_SCTA", "CSA_NUM_SSCTA", "CSA_NUM_SSSCTA", "CSA_NUM_SSSSCTA", "CSA_NUM_SSSSSCTA", "CSA_NUM_AUX1", "CSA_NUM_AUX2", "CSA_NUM_AUX3",
              "CSA_TRANSACCION", "CSA_SEC_ASIENTO", "CSA_FOLIO"
    }, sequences = { "MANUAL" })
public class ConciliaSaldos extends DomainObject {

    BigDecimal csaNumCtam = null;
    BigDecimal csaNumScta = null;
    BigDecimal csaNumSscta = null;
    BigDecimal csaNumSsscta = null;
    BigDecimal csaNumSssscta = null;
    BigDecimal csaNumSsssscta = null;
    BigDecimal csaNumAux1 = null;
    BigDecimal csaNumAux2 = null;
    BigDecimal csaNumAux3 = null;
    BigDecimal csaTransaccion = null;
    BigDecimal csaSecAsiento = null;
    BigDecimal csaFolio = null;
    BigDecimal csaSalInicial = null;
    BigDecimal csaCargos = null;
    BigDecimal csaAbonos = null;
    BigDecimal csaSalFinal = null;

    public ConciliaSaldos() {
        super();
        this.pkColumns = 12;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumCtam(BigDecimal csaNumCtam) {
        this.csaNumCtam = csaNumCtam;
    }

    public BigDecimal getCsaNumCtam() {
        return this.csaNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumScta(BigDecimal csaNumScta) {
        this.csaNumScta = csaNumScta;
    }

    public BigDecimal getCsaNumScta() {
        return this.csaNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumSscta(BigDecimal csaNumSscta) {
        this.csaNumSscta = csaNumSscta;
    }

    public BigDecimal getCsaNumSscta() {
        return this.csaNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumSsscta(BigDecimal csaNumSsscta) {
        this.csaNumSsscta = csaNumSsscta;
    }

    public BigDecimal getCsaNumSsscta() {
        return this.csaNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumSssscta(BigDecimal csaNumSssscta) {
        this.csaNumSssscta = csaNumSssscta;
    }

    public BigDecimal getCsaNumSssscta() {
        return this.csaNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumSsssscta(BigDecimal csaNumSsssscta) {
        this.csaNumSsssscta = csaNumSsssscta;
    }

    public BigDecimal getCsaNumSsssscta() {
        return this.csaNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumAux1(BigDecimal csaNumAux1) {
        this.csaNumAux1 = csaNumAux1;
    }

    public BigDecimal getCsaNumAux1() {
        return this.csaNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumAux2(BigDecimal csaNumAux2) {
        this.csaNumAux2 = csaNumAux2;
    }

    public BigDecimal getCsaNumAux2() {
        return this.csaNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumAux3(BigDecimal csaNumAux3) {
        this.csaNumAux3 = csaNumAux3;
    }

    public BigDecimal getCsaNumAux3() {
        return this.csaNumAux3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaTransaccion(BigDecimal csaTransaccion) {
        this.csaTransaccion = csaTransaccion;
    }

    public BigDecimal getCsaTransaccion() {
        return this.csaTransaccion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaSecAsiento(BigDecimal csaSecAsiento) {
        this.csaSecAsiento = csaSecAsiento;
    }

    public BigDecimal getCsaSecAsiento() {
        return this.csaSecAsiento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaFolio(BigDecimal csaFolio) {
        this.csaFolio = csaFolio;
    }

    public BigDecimal getCsaFolio() {
        return this.csaFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCsaSalInicial(BigDecimal csaSalInicial) {
        this.csaSalInicial = csaSalInicial;
    }

    public BigDecimal getCsaSalInicial() {
        return this.csaSalInicial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCsaCargos(BigDecimal csaCargos) {
        this.csaCargos = csaCargos;
    }

    public BigDecimal getCsaCargos() {
        return this.csaCargos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCsaAbonos(BigDecimal csaAbonos) {
        this.csaAbonos = csaAbonos;
    }

    public BigDecimal getCsaAbonos() {
        return this.csaAbonos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCsaSalFinal(BigDecimal csaSalFinal) {
        this.csaSalFinal = csaSalFinal;
    }

    public BigDecimal getCsaSalFinal() {
        return this.csaSalFinal;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONCILIA_SALDOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCsaNumCtam() != null && this.getCsaNumCtam().longValue() == -999) {
            conditions += " AND CSA_NUM_CTAM IS NULL";
        } else if (this.getCsaNumCtam() != null) {
            conditions += " AND CSA_NUM_CTAM = ?";
            values.add(this.getCsaNumCtam());
        }

        if (this.getCsaNumScta() != null && this.getCsaNumScta().longValue() == -999) {
            conditions += " AND CSA_NUM_SCTA IS NULL";
        } else if (this.getCsaNumScta() != null) {
            conditions += " AND CSA_NUM_SCTA = ?";
            values.add(this.getCsaNumScta());
        }

        if (this.getCsaNumSscta() != null && this.getCsaNumSscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSCTA IS NULL";
        } else if (this.getCsaNumSscta() != null) {
            conditions += " AND CSA_NUM_SSCTA = ?";
            values.add(this.getCsaNumSscta());
        }

        if (this.getCsaNumSsscta() != null && this.getCsaNumSsscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSCTA IS NULL";
        } else if (this.getCsaNumSsscta() != null) {
            conditions += " AND CSA_NUM_SSSCTA = ?";
            values.add(this.getCsaNumSsscta());
        }

        if (this.getCsaNumSssscta() != null && this.getCsaNumSssscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSSCTA IS NULL";
        } else if (this.getCsaNumSssscta() != null) {
            conditions += " AND CSA_NUM_SSSSCTA = ?";
            values.add(this.getCsaNumSssscta());
        }

        if (this.getCsaNumSsssscta() != null && this.getCsaNumSsssscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSSSCTA IS NULL";
        } else if (this.getCsaNumSsssscta() != null) {
            conditions += " AND CSA_NUM_SSSSSCTA = ?";
            values.add(this.getCsaNumSsssscta());
        }

        if (this.getCsaNumAux1() != null && this.getCsaNumAux1().longValue() == -999) {
            conditions += " AND CSA_NUM_AUX1 IS NULL";
        } else if (this.getCsaNumAux1() != null) {
            conditions += " AND CSA_NUM_AUX1 = ?";
            values.add(this.getCsaNumAux1());
        }

        if (this.getCsaNumAux2() != null && this.getCsaNumAux2().longValue() == -999) {
            conditions += " AND CSA_NUM_AUX2 IS NULL";
        } else if (this.getCsaNumAux2() != null) {
            conditions += " AND CSA_NUM_AUX2 = ?";
            values.add(this.getCsaNumAux2());
        }

        if (this.getCsaNumAux3() != null && this.getCsaNumAux3().longValue() == -999) {
            conditions += " AND CSA_NUM_AUX3 IS NULL";
        } else if (this.getCsaNumAux3() != null) {
            conditions += " AND CSA_NUM_AUX3 = ?";
            values.add(this.getCsaNumAux3());
        }

        if (this.getCsaTransaccion() != null && this.getCsaTransaccion().longValue() == -999) {
            conditions += " AND CSA_TRANSACCION IS NULL";
        } else if (this.getCsaTransaccion() != null) {
            conditions += " AND CSA_TRANSACCION = ?";
            values.add(this.getCsaTransaccion());
        }

        if (this.getCsaSecAsiento() != null && this.getCsaSecAsiento().longValue() == -999) {
            conditions += " AND CSA_SEC_ASIENTO IS NULL";
        } else if (this.getCsaSecAsiento() != null) {
            conditions += " AND CSA_SEC_ASIENTO = ?";
            values.add(this.getCsaSecAsiento());
        }

        if (this.getCsaFolio() != null && this.getCsaFolio().longValue() == -999) {
            conditions += " AND CSA_FOLIO IS NULL";
        } else if (this.getCsaFolio() != null) {
            conditions += " AND CSA_FOLIO = ?";
            values.add(this.getCsaFolio());
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
        String sql = "SELECT * FROM CONCILIA_SALDOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCsaNumCtam() != null && this.getCsaNumCtam().longValue() == -999) {
            conditions += " AND CSA_NUM_CTAM IS NULL";
        } else if (this.getCsaNumCtam() != null) {
            conditions += " AND CSA_NUM_CTAM = ?";
            values.add(this.getCsaNumCtam());
        }

        if (this.getCsaNumScta() != null && this.getCsaNumScta().longValue() == -999) {
            conditions += " AND CSA_NUM_SCTA IS NULL";
        } else if (this.getCsaNumScta() != null) {
            conditions += " AND CSA_NUM_SCTA = ?";
            values.add(this.getCsaNumScta());
        }

        if (this.getCsaNumSscta() != null && this.getCsaNumSscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSCTA IS NULL";
        } else if (this.getCsaNumSscta() != null) {
            conditions += " AND CSA_NUM_SSCTA = ?";
            values.add(this.getCsaNumSscta());
        }

        if (this.getCsaNumSsscta() != null && this.getCsaNumSsscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSCTA IS NULL";
        } else if (this.getCsaNumSsscta() != null) {
            conditions += " AND CSA_NUM_SSSCTA = ?";
            values.add(this.getCsaNumSsscta());
        }

        if (this.getCsaNumSssscta() != null && this.getCsaNumSssscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSSCTA IS NULL";
        } else if (this.getCsaNumSssscta() != null) {
            conditions += " AND CSA_NUM_SSSSCTA = ?";
            values.add(this.getCsaNumSssscta());
        }

        if (this.getCsaNumSsssscta() != null && this.getCsaNumSsssscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSSSCTA IS NULL";
        } else if (this.getCsaNumSsssscta() != null) {
            conditions += " AND CSA_NUM_SSSSSCTA = ?";
            values.add(this.getCsaNumSsssscta());
        }

        if (this.getCsaNumAux1() != null && this.getCsaNumAux1().longValue() == -999) {
            conditions += " AND CSA_NUM_AUX1 IS NULL";
        } else if (this.getCsaNumAux1() != null) {
            conditions += " AND CSA_NUM_AUX1 = ?";
            values.add(this.getCsaNumAux1());
        }

        if (this.getCsaNumAux2() != null && this.getCsaNumAux2().longValue() == -999) {
            conditions += " AND CSA_NUM_AUX2 IS NULL";
        } else if (this.getCsaNumAux2() != null) {
            conditions += " AND CSA_NUM_AUX2 = ?";
            values.add(this.getCsaNumAux2());
        }

        if (this.getCsaNumAux3() != null && this.getCsaNumAux3().longValue() == -999) {
            conditions += " AND CSA_NUM_AUX3 IS NULL";
        } else if (this.getCsaNumAux3() != null) {
            conditions += " AND CSA_NUM_AUX3 = ?";
            values.add(this.getCsaNumAux3());
        }

        if (this.getCsaTransaccion() != null && this.getCsaTransaccion().longValue() == -999) {
            conditions += " AND CSA_TRANSACCION IS NULL";
        } else if (this.getCsaTransaccion() != null) {
            conditions += " AND CSA_TRANSACCION = ?";
            values.add(this.getCsaTransaccion());
        }

        if (this.getCsaSecAsiento() != null && this.getCsaSecAsiento().longValue() == -999) {
            conditions += " AND CSA_SEC_ASIENTO IS NULL";
        } else if (this.getCsaSecAsiento() != null) {
            conditions += " AND CSA_SEC_ASIENTO = ?";
            values.add(this.getCsaSecAsiento());
        }

        if (this.getCsaFolio() != null && this.getCsaFolio().longValue() == -999) {
            conditions += " AND CSA_FOLIO IS NULL";
        } else if (this.getCsaFolio() != null) {
            conditions += " AND CSA_FOLIO = ?";
            values.add(this.getCsaFolio());
        }

        if (this.getCsaSalInicial() != null && this.getCsaSalInicial().longValue() == -999) {
            conditions += " AND CSA_SAL_INICIAL IS NULL";
        } else if (this.getCsaSalInicial() != null) {
            conditions += " AND CSA_SAL_INICIAL = ?";
            values.add(this.getCsaSalInicial());
        }

        if (this.getCsaCargos() != null && this.getCsaCargos().longValue() == -999) {
            conditions += " AND CSA_CARGOS IS NULL";
        } else if (this.getCsaCargos() != null) {
            conditions += " AND CSA_CARGOS = ?";
            values.add(this.getCsaCargos());
        }

        if (this.getCsaAbonos() != null && this.getCsaAbonos().longValue() == -999) {
            conditions += " AND CSA_ABONOS IS NULL";
        } else if (this.getCsaAbonos() != null) {
            conditions += " AND CSA_ABONOS = ?";
            values.add(this.getCsaAbonos());
        }

        if (this.getCsaSalFinal() != null && this.getCsaSalFinal().longValue() == -999) {
            conditions += " AND CSA_SAL_FINAL IS NULL";
        } else if (this.getCsaSalFinal() != null) {
            conditions += " AND CSA_SAL_FINAL = ?";
            values.add(this.getCsaSalFinal());
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
        String sql = "UPDATE CONCILIA_SALDOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CSA_NUM_CTAM = ?";
        pkValues.add(this.getCsaNumCtam());
        conditions += " AND CSA_NUM_SCTA = ?";
        pkValues.add(this.getCsaNumScta());
        conditions += " AND CSA_NUM_SSCTA = ?";
        pkValues.add(this.getCsaNumSscta());
        conditions += " AND CSA_NUM_SSSCTA = ?";
        pkValues.add(this.getCsaNumSsscta());
        conditions += " AND CSA_NUM_SSSSCTA = ?";
        pkValues.add(this.getCsaNumSssscta());
        conditions += " AND CSA_NUM_SSSSSCTA = ?";
        pkValues.add(this.getCsaNumSsssscta());
        conditions += " AND CSA_NUM_AUX1 = ?";
        pkValues.add(this.getCsaNumAux1());
        conditions += " AND CSA_NUM_AUX2 = ?";
        pkValues.add(this.getCsaNumAux2());
        conditions += " AND CSA_NUM_AUX3 = ?";
        pkValues.add(this.getCsaNumAux3());
        conditions += " AND CSA_TRANSACCION = ?";
        pkValues.add(this.getCsaTransaccion());
        conditions += " AND CSA_SEC_ASIENTO = ?";
        pkValues.add(this.getCsaSecAsiento());
        conditions += " AND CSA_FOLIO = ?";
        pkValues.add(this.getCsaFolio());
        fields += " CSA_SAL_INICIAL = ?, ";
        values.add(this.getCsaSalInicial());
        fields += " CSA_CARGOS = ?, ";
        values.add(this.getCsaCargos());
        fields += " CSA_ABONOS = ?, ";
        values.add(this.getCsaAbonos());
        fields += " CSA_SAL_FINAL = ?, ";
        values.add(this.getCsaSalFinal());
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
        String sql = "INSERT INTO CONCILIA_SALDOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CSA_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getCsaNumCtam());

        fields += ", CSA_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumScta());

        fields += ", CSA_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumSscta());

        fields += ", CSA_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumSsscta());

        fields += ", CSA_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumSssscta());

        fields += ", CSA_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumSsssscta());

        fields += ", CSA_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getCsaNumAux1());

        fields += ", CSA_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getCsaNumAux2());

        fields += ", CSA_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getCsaNumAux3());

        fields += ", CSA_TRANSACCION";
        fieldValues += ", ?";
        values.add(this.getCsaTransaccion());

        fields += ", CSA_SEC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getCsaSecAsiento());

        fields += ", CSA_FOLIO";
        fieldValues += ", ?";
        values.add(this.getCsaFolio());

        fields += ", CSA_SAL_INICIAL";
        fieldValues += ", ?";
        values.add(this.getCsaSalInicial());

        fields += ", CSA_CARGOS";
        fieldValues += ", ?";
        values.add(this.getCsaCargos());

        fields += ", CSA_ABONOS";
        fieldValues += ", ?";
        values.add(this.getCsaAbonos());

        fields += ", CSA_SAL_FINAL";
        fieldValues += ", ?";
        values.add(this.getCsaSalFinal());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONCILIA_SALDOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CSA_NUM_CTAM = ?";
        values.add(this.getCsaNumCtam());
        conditions += " AND CSA_NUM_SCTA = ?";
        values.add(this.getCsaNumScta());
        conditions += " AND CSA_NUM_SSCTA = ?";
        values.add(this.getCsaNumSscta());
        conditions += " AND CSA_NUM_SSSCTA = ?";
        values.add(this.getCsaNumSsscta());
        conditions += " AND CSA_NUM_SSSSCTA = ?";
        values.add(this.getCsaNumSssscta());
        conditions += " AND CSA_NUM_SSSSSCTA = ?";
        values.add(this.getCsaNumSsssscta());
        conditions += " AND CSA_NUM_AUX1 = ?";
        values.add(this.getCsaNumAux1());
        conditions += " AND CSA_NUM_AUX2 = ?";
        values.add(this.getCsaNumAux2());
        conditions += " AND CSA_NUM_AUX3 = ?";
        values.add(this.getCsaNumAux3());
        conditions += " AND CSA_TRANSACCION = ?";
        values.add(this.getCsaTransaccion());
        conditions += " AND CSA_SEC_ASIENTO = ?";
        values.add(this.getCsaSecAsiento());
        conditions += " AND CSA_FOLIO = ?";
        values.add(this.getCsaFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ConciliaSaldos instance = (ConciliaSaldos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCsaNumCtam().equals(instance.getCsaNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumScta().equals(instance.getCsaNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumSscta().equals(instance.getCsaNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumSsscta().equals(instance.getCsaNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumSssscta().equals(instance.getCsaNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumSsssscta().equals(instance.getCsaNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumAux1().equals(instance.getCsaNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumAux2().equals(instance.getCsaNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumAux3().equals(instance.getCsaNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getCsaTransaccion().equals(instance.getCsaTransaccion()))
            equalObjects = false;
        if (equalObjects && !this.getCsaSecAsiento().equals(instance.getCsaSecAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getCsaFolio().equals(instance.getCsaFolio()))
            equalObjects = false;
        if (equalObjects && !this.getCsaSalInicial().equals(instance.getCsaSalInicial()))
            equalObjects = false;
        if (equalObjects && !this.getCsaCargos().equals(instance.getCsaCargos()))
            equalObjects = false;
        if (equalObjects && !this.getCsaAbonos().equals(instance.getCsaAbonos()))
            equalObjects = false;
        if (equalObjects && !this.getCsaSalFinal().equals(instance.getCsaSalFinal()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ConciliaSaldos result = new ConciliaSaldos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCsaNumCtam((BigDecimal) objectData.getData("CSA_NUM_CTAM"));
        result.setCsaNumScta((BigDecimal) objectData.getData("CSA_NUM_SCTA"));
        result.setCsaNumSscta((BigDecimal) objectData.getData("CSA_NUM_SSCTA"));
        result.setCsaNumSsscta((BigDecimal) objectData.getData("CSA_NUM_SSSCTA"));
        result.setCsaNumSssscta((BigDecimal) objectData.getData("CSA_NUM_SSSSCTA"));
        result.setCsaNumSsssscta((BigDecimal) objectData.getData("CSA_NUM_SSSSSCTA"));
        result.setCsaNumAux1((BigDecimal) objectData.getData("CSA_NUM_AUX1"));
        result.setCsaNumAux2((BigDecimal) objectData.getData("CSA_NUM_AUX2"));
        result.setCsaNumAux3((BigDecimal) objectData.getData("CSA_NUM_AUX3"));
        result.setCsaTransaccion((BigDecimal) objectData.getData("CSA_TRANSACCION"));
        result.setCsaSecAsiento((BigDecimal) objectData.getData("CSA_SEC_ASIENTO"));
        result.setCsaFolio((BigDecimal) objectData.getData("CSA_FOLIO"));
        result.setCsaSalInicial((BigDecimal) objectData.getData("CSA_SAL_INICIAL"));
        result.setCsaCargos((BigDecimal) objectData.getData("CSA_CARGOS"));
        result.setCsaAbonos((BigDecimal) objectData.getData("CSA_ABONOS"));
        result.setCsaSalFinal((BigDecimal) objectData.getData("CSA_SAL_FINAL"));

        return result;

    }

}
