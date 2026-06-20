package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPCTAIND_PK", columns = { "RCI_SECUENCIAL" }, sequences = { "MAX" })
public class Repctaind extends DomainObject {

    BigDecimal rciSecuencial = null;
    BigDecimal rciNumFideicomiso = null;
    String rciNomFideicomiso = null;
    String rciPeriodo = null;
    String rciFecha = null;
    String rciNomNivel1 = null;
    String rciNomNivel2 = null;
    String rciNomNivel3 = null;
    String rciNomInvers = null;
    BigDecimal rciNumN1 = null;
    BigDecimal rciNumN2 = null;
    BigDecimal rciNumN3 = null;
    String rciNomN1 = null;
    String rciNomN2 = null;
    BigDecimal rciNumInver = null;
    BigDecimal rciSaldoAnt = null;
    BigDecimal rciTasa = null;
    BigDecimal rciDepositos = null;
    BigDecimal rciRetiros = null;
    BigDecimal rciIntereses = null;
    BigDecimal rciIsr = null;
    BigDecimal rciSaldoParcial = null;
    BigDecimal rciParticipacion = null;
    BigDecimal rciSaldoFinal = null;

    public Repctaind() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRciSecuencial(BigDecimal rciSecuencial) {
        this.rciSecuencial = rciSecuencial;
    }

    public BigDecimal getRciSecuencial() {
        return this.rciSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRciNumFideicomiso(BigDecimal rciNumFideicomiso) {
        this.rciNumFideicomiso = rciNumFideicomiso;
    }

    public BigDecimal getRciNumFideicomiso() {
        return this.rciNumFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciNomFideicomiso(String rciNomFideicomiso) {
        this.rciNomFideicomiso = rciNomFideicomiso;
    }

    public String getRciNomFideicomiso() {
        return this.rciNomFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciPeriodo(String rciPeriodo) {
        this.rciPeriodo = rciPeriodo;
    }

    public String getRciPeriodo() {
        return this.rciPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciFecha(String rciFecha) {
        this.rciFecha = rciFecha;
    }

    public String getRciFecha() {
        return this.rciFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciNomNivel1(String rciNomNivel1) {
        this.rciNomNivel1 = rciNomNivel1;
    }

    public String getRciNomNivel1() {
        return this.rciNomNivel1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciNomNivel2(String rciNomNivel2) {
        this.rciNomNivel2 = rciNomNivel2;
    }

    public String getRciNomNivel2() {
        return this.rciNomNivel2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciNomNivel3(String rciNomNivel3) {
        this.rciNomNivel3 = rciNomNivel3;
    }

    public String getRciNomNivel3() {
        return this.rciNomNivel3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciNomInvers(String rciNomInvers) {
        this.rciNomInvers = rciNomInvers;
    }

    public String getRciNomInvers() {
        return this.rciNomInvers;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRciNumN1(BigDecimal rciNumN1) {
        this.rciNumN1 = rciNumN1;
    }

    public BigDecimal getRciNumN1() {
        return this.rciNumN1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRciNumN2(BigDecimal rciNumN2) {
        this.rciNumN2 = rciNumN2;
    }

    public BigDecimal getRciNumN2() {
        return this.rciNumN2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRciNumN3(BigDecimal rciNumN3) {
        this.rciNumN3 = rciNumN3;
    }

    public BigDecimal getRciNumN3() {
        return this.rciNumN3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciNomN1(String rciNomN1) {
        this.rciNomN1 = rciNomN1;
    }

    public String getRciNomN1() {
        return this.rciNomN1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRciNomN2(String rciNomN2) {
        this.rciNomN2 = rciNomN2;
    }

    public String getRciNomN2() {
        return this.rciNomN2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRciNumInver(BigDecimal rciNumInver) {
        this.rciNumInver = rciNumInver;
    }

    public BigDecimal getRciNumInver() {
        return this.rciNumInver;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciSaldoAnt(BigDecimal rciSaldoAnt) {
        this.rciSaldoAnt = rciSaldoAnt;
    }

    public BigDecimal getRciSaldoAnt() {
        return this.rciSaldoAnt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciTasa(BigDecimal rciTasa) {
        this.rciTasa = rciTasa;
    }

    public BigDecimal getRciTasa() {
        return this.rciTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciDepositos(BigDecimal rciDepositos) {
        this.rciDepositos = rciDepositos;
    }

    public BigDecimal getRciDepositos() {
        return this.rciDepositos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciRetiros(BigDecimal rciRetiros) {
        this.rciRetiros = rciRetiros;
    }

    public BigDecimal getRciRetiros() {
        return this.rciRetiros;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciIntereses(BigDecimal rciIntereses) {
        this.rciIntereses = rciIntereses;
    }

    public BigDecimal getRciIntereses() {
        return this.rciIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciIsr(BigDecimal rciIsr) {
        this.rciIsr = rciIsr;
    }

    public BigDecimal getRciIsr() {
        return this.rciIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciSaldoParcial(BigDecimal rciSaldoParcial) {
        this.rciSaldoParcial = rciSaldoParcial;
    }

    public BigDecimal getRciSaldoParcial() {
        return this.rciSaldoParcial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciParticipacion(BigDecimal rciParticipacion) {
        this.rciParticipacion = rciParticipacion;
    }

    public BigDecimal getRciParticipacion() {
        return this.rciParticipacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRciSaldoFinal(BigDecimal rciSaldoFinal) {
        this.rciSaldoFinal = rciSaldoFinal;
    }

    public BigDecimal getRciSaldoFinal() {
        return this.rciSaldoFinal;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPCTAIND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRciSecuencial() != null && this.getRciSecuencial().longValue() == -999) {
            conditions += " AND RCI_SECUENCIAL IS NULL";
        } else if (this.getRciSecuencial() != null) {
            conditions += " AND RCI_SECUENCIAL = ?";
            values.add(this.getRciSecuencial());
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
        String sql = "SELECT * FROM REPCTAIND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRciSecuencial() != null && this.getRciSecuencial().longValue() == -999) {
            conditions += " AND RCI_SECUENCIAL IS NULL";
        } else if (this.getRciSecuencial() != null) {
            conditions += " AND RCI_SECUENCIAL = ?";
            values.add(this.getRciSecuencial());
        }

        if (this.getRciNumFideicomiso() != null && this.getRciNumFideicomiso().longValue() == -999) {
            conditions += " AND RCI_NUM_FIDEICOMISO IS NULL";
        } else if (this.getRciNumFideicomiso() != null) {
            conditions += " AND RCI_NUM_FIDEICOMISO = ?";
            values.add(this.getRciNumFideicomiso());
        }

        if (this.getRciNomFideicomiso() != null && "null".equals(this.getRciNomFideicomiso())) {
            conditions += " AND RCI_NOM_FIDEICOMISO IS NULL";
        } else if (this.getRciNomFideicomiso() != null) {
            conditions += " AND RCI_NOM_FIDEICOMISO = ?";
            values.add(this.getRciNomFideicomiso());
        }

        if (this.getRciPeriodo() != null && "null".equals(this.getRciPeriodo())) {
            conditions += " AND RCI_PERIODO IS NULL";
        } else if (this.getRciPeriodo() != null) {
            conditions += " AND RCI_PERIODO = ?";
            values.add(this.getRciPeriodo());
        }

        if (this.getRciFecha() != null && "null".equals(this.getRciFecha())) {
            conditions += " AND RCI_FECHA IS NULL";
        } else if (this.getRciFecha() != null) {
            conditions += " AND RCI_FECHA = ?";
            values.add(this.getRciFecha());
        }

        if (this.getRciNomNivel1() != null && "null".equals(this.getRciNomNivel1())) {
            conditions += " AND RCI_NOM_NIVEL1 IS NULL";
        } else if (this.getRciNomNivel1() != null) {
            conditions += " AND RCI_NOM_NIVEL1 = ?";
            values.add(this.getRciNomNivel1());
        }

        if (this.getRciNomNivel2() != null && "null".equals(this.getRciNomNivel2())) {
            conditions += " AND RCI_NOM_NIVEL2 IS NULL";
        } else if (this.getRciNomNivel2() != null) {
            conditions += " AND RCI_NOM_NIVEL2 = ?";
            values.add(this.getRciNomNivel2());
        }

        if (this.getRciNomNivel3() != null && "null".equals(this.getRciNomNivel3())) {
            conditions += " AND RCI_NOM_NIVEL3 IS NULL";
        } else if (this.getRciNomNivel3() != null) {
            conditions += " AND RCI_NOM_NIVEL3 = ?";
            values.add(this.getRciNomNivel3());
        }

        if (this.getRciNomInvers() != null && "null".equals(this.getRciNomInvers())) {
            conditions += " AND RCI_NOM_INVERS IS NULL";
        } else if (this.getRciNomInvers() != null) {
            conditions += " AND RCI_NOM_INVERS = ?";
            values.add(this.getRciNomInvers());
        }

        if (this.getRciNumN1() != null && this.getRciNumN1().longValue() == -999) {
            conditions += " AND RCI_NUM_N1 IS NULL";
        } else if (this.getRciNumN1() != null) {
            conditions += " AND RCI_NUM_N1 = ?";
            values.add(this.getRciNumN1());
        }

        if (this.getRciNumN2() != null && this.getRciNumN2().longValue() == -999) {
            conditions += " AND RCI_NUM_N2 IS NULL";
        } else if (this.getRciNumN2() != null) {
            conditions += " AND RCI_NUM_N2 = ?";
            values.add(this.getRciNumN2());
        }

        if (this.getRciNumN3() != null && this.getRciNumN3().longValue() == -999) {
            conditions += " AND RCI_NUM_N3 IS NULL";
        } else if (this.getRciNumN3() != null) {
            conditions += " AND RCI_NUM_N3 = ?";
            values.add(this.getRciNumN3());
        }

        if (this.getRciNomN1() != null && "null".equals(this.getRciNomN1())) {
            conditions += " AND RCI_NOM_N1 IS NULL";
        } else if (this.getRciNomN1() != null) {
            conditions += " AND RCI_NOM_N1 = ?";
            values.add(this.getRciNomN1());
        }

        if (this.getRciNomN2() != null && "null".equals(this.getRciNomN2())) {
            conditions += " AND RCI_NOM_N2 IS NULL";
        } else if (this.getRciNomN2() != null) {
            conditions += " AND RCI_NOM_N2 = ?";
            values.add(this.getRciNomN2());
        }

        if (this.getRciNumInver() != null && this.getRciNumInver().longValue() == -999) {
            conditions += " AND RCI_NUM_INVER IS NULL";
        } else if (this.getRciNumInver() != null) {
            conditions += " AND RCI_NUM_INVER = ?";
            values.add(this.getRciNumInver());
        }

        if (this.getRciSaldoAnt() != null && this.getRciSaldoAnt().longValue() == -999) {
            conditions += " AND RCI_SALDO_ANT IS NULL";
        } else if (this.getRciSaldoAnt() != null) {
            conditions += " AND RCI_SALDO_ANT = ?";
            values.add(this.getRciSaldoAnt());
        }

        if (this.getRciTasa() != null && this.getRciTasa().longValue() == -999) {
            conditions += " AND RCI_TASA IS NULL";
        } else if (this.getRciTasa() != null) {
            conditions += " AND RCI_TASA = ?";
            values.add(this.getRciTasa());
        }

        if (this.getRciDepositos() != null && this.getRciDepositos().longValue() == -999) {
            conditions += " AND RCI_DEPOSITOS IS NULL";
        } else if (this.getRciDepositos() != null) {
            conditions += " AND RCI_DEPOSITOS = ?";
            values.add(this.getRciDepositos());
        }

        if (this.getRciRetiros() != null && this.getRciRetiros().longValue() == -999) {
            conditions += " AND RCI_RETIROS IS NULL";
        } else if (this.getRciRetiros() != null) {
            conditions += " AND RCI_RETIROS = ?";
            values.add(this.getRciRetiros());
        }

        if (this.getRciIntereses() != null && this.getRciIntereses().longValue() == -999) {
            conditions += " AND RCI_INTERESES IS NULL";
        } else if (this.getRciIntereses() != null) {
            conditions += " AND RCI_INTERESES = ?";
            values.add(this.getRciIntereses());
        }

        if (this.getRciIsr() != null && this.getRciIsr().longValue() == -999) {
            conditions += " AND RCI_ISR IS NULL";
        } else if (this.getRciIsr() != null) {
            conditions += " AND RCI_ISR = ?";
            values.add(this.getRciIsr());
        }

        if (this.getRciSaldoParcial() != null && this.getRciSaldoParcial().longValue() == -999) {
            conditions += " AND RCI_SALDO_PARCIAL IS NULL";
        } else if (this.getRciSaldoParcial() != null) {
            conditions += " AND RCI_SALDO_PARCIAL = ?";
            values.add(this.getRciSaldoParcial());
        }

        if (this.getRciParticipacion() != null && this.getRciParticipacion().longValue() == -999) {
            conditions += " AND RCI_PARTICIPACION IS NULL";
        } else if (this.getRciParticipacion() != null) {
            conditions += " AND RCI_PARTICIPACION = ?";
            values.add(this.getRciParticipacion());
        }

        if (this.getRciSaldoFinal() != null && this.getRciSaldoFinal().longValue() == -999) {
            conditions += " AND RCI_SALDO_FINAL IS NULL";
        } else if (this.getRciSaldoFinal() != null) {
            conditions += " AND RCI_SALDO_FINAL = ?";
            values.add(this.getRciSaldoFinal());
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
        String sql = "UPDATE REPCTAIND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RCI_SECUENCIAL = ?";
        pkValues.add(this.getRciSecuencial());
        fields += " RCI_NUM_FIDEICOMISO = ?, ";
        values.add(this.getRciNumFideicomiso());
        fields += " RCI_NOM_FIDEICOMISO = ?, ";
        values.add(this.getRciNomFideicomiso());
        fields += " RCI_PERIODO = ?, ";
        values.add(this.getRciPeriodo());
        fields += " RCI_FECHA = ?, ";
        values.add(this.getRciFecha());
        fields += " RCI_NOM_NIVEL1 = ?, ";
        values.add(this.getRciNomNivel1());
        fields += " RCI_NOM_NIVEL2 = ?, ";
        values.add(this.getRciNomNivel2());
        fields += " RCI_NOM_NIVEL3 = ?, ";
        values.add(this.getRciNomNivel3());
        fields += " RCI_NOM_INVERS = ?, ";
        values.add(this.getRciNomInvers());
        fields += " RCI_NUM_N1 = ?, ";
        values.add(this.getRciNumN1());
        fields += " RCI_NUM_N2 = ?, ";
        values.add(this.getRciNumN2());
        fields += " RCI_NUM_N3 = ?, ";
        values.add(this.getRciNumN3());
        fields += " RCI_NOM_N1 = ?, ";
        values.add(this.getRciNomN1());
        fields += " RCI_NOM_N2 = ?, ";
        values.add(this.getRciNomN2());
        fields += " RCI_NUM_INVER = ?, ";
        values.add(this.getRciNumInver());
        fields += " RCI_SALDO_ANT = ?, ";
        values.add(this.getRciSaldoAnt());
        fields += " RCI_TASA = ?, ";
        values.add(this.getRciTasa());
        fields += " RCI_DEPOSITOS = ?, ";
        values.add(this.getRciDepositos());
        fields += " RCI_RETIROS = ?, ";
        values.add(this.getRciRetiros());
        fields += " RCI_INTERESES = ?, ";
        values.add(this.getRciIntereses());
        fields += " RCI_ISR = ?, ";
        values.add(this.getRciIsr());
        fields += " RCI_SALDO_PARCIAL = ?, ";
        values.add(this.getRciSaldoParcial());
        fields += " RCI_PARTICIPACION = ?, ";
        values.add(this.getRciParticipacion());
        fields += " RCI_SALDO_FINAL = ?, ";
        values.add(this.getRciSaldoFinal());
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
        String sql = "INSERT INTO REPCTAIND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RCI_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getRciSecuencial());

        fields += ", RCI_NUM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getRciNumFideicomiso());

        fields += ", RCI_NOM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getRciNomFideicomiso());

        fields += ", RCI_PERIODO";
        fieldValues += ", ?";
        values.add(this.getRciPeriodo());

        fields += ", RCI_FECHA";
        fieldValues += ", ?";
        values.add(this.getRciFecha());

        fields += ", RCI_NOM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getRciNomNivel1());

        fields += ", RCI_NOM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getRciNomNivel2());

        fields += ", RCI_NOM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getRciNomNivel3());

        fields += ", RCI_NOM_INVERS";
        fieldValues += ", ?";
        values.add(this.getRciNomInvers());

        fields += ", RCI_NUM_N1";
        fieldValues += ", ?";
        values.add(this.getRciNumN1());

        fields += ", RCI_NUM_N2";
        fieldValues += ", ?";
        values.add(this.getRciNumN2());

        fields += ", RCI_NUM_N3";
        fieldValues += ", ?";
        values.add(this.getRciNumN3());

        fields += ", RCI_NOM_N1";
        fieldValues += ", ?";
        values.add(this.getRciNomN1());

        fields += ", RCI_NOM_N2";
        fieldValues += ", ?";
        values.add(this.getRciNomN2());

        fields += ", RCI_NUM_INVER";
        fieldValues += ", ?";
        values.add(this.getRciNumInver());

        fields += ", RCI_SALDO_ANT";
        fieldValues += ", ?";
        values.add(this.getRciSaldoAnt());

        fields += ", RCI_TASA";
        fieldValues += ", ?";
        values.add(this.getRciTasa());

        fields += ", RCI_DEPOSITOS";
        fieldValues += ", ?";
        values.add(this.getRciDepositos());

        fields += ", RCI_RETIROS";
        fieldValues += ", ?";
        values.add(this.getRciRetiros());

        fields += ", RCI_INTERESES";
        fieldValues += ", ?";
        values.add(this.getRciIntereses());

        fields += ", RCI_ISR";
        fieldValues += ", ?";
        values.add(this.getRciIsr());

        fields += ", RCI_SALDO_PARCIAL";
        fieldValues += ", ?";
        values.add(this.getRciSaldoParcial());

        fields += ", RCI_PARTICIPACION";
        fieldValues += ", ?";
        values.add(this.getRciParticipacion());

        fields += ", RCI_SALDO_FINAL";
        fieldValues += ", ?";
        values.add(this.getRciSaldoFinal());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPCTAIND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RCI_SECUENCIAL = ?";
        values.add(this.getRciSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Repctaind instance = (Repctaind) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRciSecuencial().equals(instance.getRciSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getRciNumFideicomiso().equals(instance.getRciNumFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getRciNomFideicomiso().equals(instance.getRciNomFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getRciPeriodo().equals(instance.getRciPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getRciFecha().equals(instance.getRciFecha()))
            equalObjects = false;
        if (equalObjects && !this.getRciNomNivel1().equals(instance.getRciNomNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getRciNomNivel2().equals(instance.getRciNomNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getRciNomNivel3().equals(instance.getRciNomNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getRciNomInvers().equals(instance.getRciNomInvers()))
            equalObjects = false;
        if (equalObjects && !this.getRciNumN1().equals(instance.getRciNumN1()))
            equalObjects = false;
        if (equalObjects && !this.getRciNumN2().equals(instance.getRciNumN2()))
            equalObjects = false;
        if (equalObjects && !this.getRciNumN3().equals(instance.getRciNumN3()))
            equalObjects = false;
        if (equalObjects && !this.getRciNomN1().equals(instance.getRciNomN1()))
            equalObjects = false;
        if (equalObjects && !this.getRciNomN2().equals(instance.getRciNomN2()))
            equalObjects = false;
        if (equalObjects && !this.getRciNumInver().equals(instance.getRciNumInver()))
            equalObjects = false;
        if (equalObjects && !this.getRciSaldoAnt().equals(instance.getRciSaldoAnt()))
            equalObjects = false;
        if (equalObjects && !this.getRciTasa().equals(instance.getRciTasa()))
            equalObjects = false;
        if (equalObjects && !this.getRciDepositos().equals(instance.getRciDepositos()))
            equalObjects = false;
        if (equalObjects && !this.getRciRetiros().equals(instance.getRciRetiros()))
            equalObjects = false;
        if (equalObjects && !this.getRciIntereses().equals(instance.getRciIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getRciIsr().equals(instance.getRciIsr()))
            equalObjects = false;
        if (equalObjects && !this.getRciSaldoParcial().equals(instance.getRciSaldoParcial()))
            equalObjects = false;
        if (equalObjects && !this.getRciParticipacion().equals(instance.getRciParticipacion()))
            equalObjects = false;
        if (equalObjects && !this.getRciSaldoFinal().equals(instance.getRciSaldoFinal()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Repctaind result = new Repctaind();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRciSecuencial((BigDecimal) objectData.getData("RCI_SECUENCIAL"));
        result.setRciNumFideicomiso((BigDecimal) objectData.getData("RCI_NUM_FIDEICOMISO"));
        result.setRciNomFideicomiso((String) objectData.getData("RCI_NOM_FIDEICOMISO"));
        result.setRciPeriodo((String) objectData.getData("RCI_PERIODO"));
        result.setRciFecha((String) objectData.getData("RCI_FECHA"));
        result.setRciNomNivel1((String) objectData.getData("RCI_NOM_NIVEL1"));
        result.setRciNomNivel2((String) objectData.getData("RCI_NOM_NIVEL2"));
        result.setRciNomNivel3((String) objectData.getData("RCI_NOM_NIVEL3"));
        result.setRciNomInvers((String) objectData.getData("RCI_NOM_INVERS"));
        result.setRciNumN1((BigDecimal) objectData.getData("RCI_NUM_N1"));
        result.setRciNumN2((BigDecimal) objectData.getData("RCI_NUM_N2"));
        result.setRciNumN3((BigDecimal) objectData.getData("RCI_NUM_N3"));
        result.setRciNomN1((String) objectData.getData("RCI_NOM_N1"));
        result.setRciNomN2((String) objectData.getData("RCI_NOM_N2"));
        result.setRciNumInver((BigDecimal) objectData.getData("RCI_NUM_INVER"));
        result.setRciSaldoAnt((BigDecimal) objectData.getData("RCI_SALDO_ANT"));
        result.setRciTasa((BigDecimal) objectData.getData("RCI_TASA"));
        result.setRciDepositos((BigDecimal) objectData.getData("RCI_DEPOSITOS"));
        result.setRciRetiros((BigDecimal) objectData.getData("RCI_RETIROS"));
        result.setRciIntereses((BigDecimal) objectData.getData("RCI_INTERESES"));
        result.setRciIsr((BigDecimal) objectData.getData("RCI_ISR"));
        result.setRciSaldoParcial((BigDecimal) objectData.getData("RCI_SALDO_PARCIAL"));
        result.setRciParticipacion((BigDecimal) objectData.getData("RCI_PARTICIPACION"));
        result.setRciSaldoFinal((BigDecimal) objectData.getData("RCI_SALDO_FINAL"));

        return result;

    }

}
