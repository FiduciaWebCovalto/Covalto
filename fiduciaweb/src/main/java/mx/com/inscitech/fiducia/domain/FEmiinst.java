package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIINST_PK", columns = { "EINT_ID_PROGRAMA", "EINT_ID_FIDEICOMISO", "EINT_ID_EMISION", "EINT_ID_SEC_INSTRUMENTO" }, sequences = { "MANUAL" })
public class FEmiinst extends DomainObject {

    BigDecimal eintIdPrograma = null;
    BigDecimal eintIdFideicomiso = null;
    BigDecimal eintIdEmision = null;
    BigDecimal eintIdSecInstrumento = null;
    String eintCveInstrumento = null;
    BigDecimal eintPlazo = null;
    BigDecimal eintTasaCalculo = null;
    BigDecimal eintPlazoHasta = null;
    BigDecimal eintTasaEquivalente = null;
    BigDecimal eintTipoInstPlazo = null;
    String eintStEmiinst = null;

    public FEmiinst() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEintIdPrograma(BigDecimal eintIdPrograma) {
        this.eintIdPrograma = eintIdPrograma;
    }

    public BigDecimal getEintIdPrograma() {
        return this.eintIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEintIdFideicomiso(BigDecimal eintIdFideicomiso) {
        this.eintIdFideicomiso = eintIdFideicomiso;
    }

    public BigDecimal getEintIdFideicomiso() {
        return this.eintIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEintIdEmision(BigDecimal eintIdEmision) {
        this.eintIdEmision = eintIdEmision;
    }

    public BigDecimal getEintIdEmision() {
        return this.eintIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEintIdSecInstrumento(BigDecimal eintIdSecInstrumento) {
        this.eintIdSecInstrumento = eintIdSecInstrumento;
    }

    public BigDecimal getEintIdSecInstrumento() {
        return this.eintIdSecInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEintCveInstrumento(String eintCveInstrumento) {
        this.eintCveInstrumento = eintCveInstrumento;
    }

    public String getEintCveInstrumento() {
        return this.eintCveInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEintPlazo(BigDecimal eintPlazo) {
        this.eintPlazo = eintPlazo;
    }

    public BigDecimal getEintPlazo() {
        return this.eintPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEintTasaCalculo(BigDecimal eintTasaCalculo) {
        this.eintTasaCalculo = eintTasaCalculo;
    }

    public BigDecimal getEintTasaCalculo() {
        return this.eintTasaCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEintPlazoHasta(BigDecimal eintPlazoHasta) {
        this.eintPlazoHasta = eintPlazoHasta;
    }

    public BigDecimal getEintPlazoHasta() {
        return this.eintPlazoHasta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEintTasaEquivalente(BigDecimal eintTasaEquivalente) {
        this.eintTasaEquivalente = eintTasaEquivalente;
    }

    public BigDecimal getEintTasaEquivalente() {
        return this.eintTasaEquivalente;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEintTipoInstPlazo(BigDecimal eintTipoInstPlazo) {
        this.eintTipoInstPlazo = eintTipoInstPlazo;
    }

    public BigDecimal getEintTipoInstPlazo() {
        return this.eintTipoInstPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEintStEmiinst(String eintStEmiinst) {
        this.eintStEmiinst = eintStEmiinst;
    }

    public String getEintStEmiinst() {
        return this.eintStEmiinst;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIINST ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEintIdPrograma() != null && this.getEintIdPrograma().longValue() == -999) {
            conditions += " AND EINT_ID_PROGRAMA IS NULL";
        } else if (this.getEintIdPrograma() != null) {
            conditions += " AND EINT_ID_PROGRAMA = ?";
            values.add(this.getEintIdPrograma());
        }

        if (this.getEintIdFideicomiso() != null && this.getEintIdFideicomiso().longValue() == -999) {
            conditions += " AND EINT_ID_FIDEICOMISO IS NULL";
        } else if (this.getEintIdFideicomiso() != null) {
            conditions += " AND EINT_ID_FIDEICOMISO = ?";
            values.add(this.getEintIdFideicomiso());
        }

        if (this.getEintIdEmision() != null && this.getEintIdEmision().longValue() == -999) {
            conditions += " AND EINT_ID_EMISION IS NULL";
        } else if (this.getEintIdEmision() != null) {
            conditions += " AND EINT_ID_EMISION = ?";
            values.add(this.getEintIdEmision());
        }

        if (this.getEintIdSecInstrumento() != null && this.getEintIdSecInstrumento().longValue() == -999) {
            conditions += " AND EINT_ID_SEC_INSTRUMENTO IS NULL";
        } else if (this.getEintIdSecInstrumento() != null) {
            conditions += " AND EINT_ID_SEC_INSTRUMENTO = ?";
            values.add(this.getEintIdSecInstrumento());
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
        String sql = "SELECT * FROM F_EMIINST ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEintIdPrograma() != null && this.getEintIdPrograma().longValue() == -999) {
            conditions += " AND EINT_ID_PROGRAMA IS NULL";
        } else if (this.getEintIdPrograma() != null) {
            conditions += " AND EINT_ID_PROGRAMA = ?";
            values.add(this.getEintIdPrograma());
        }

        if (this.getEintIdFideicomiso() != null && this.getEintIdFideicomiso().longValue() == -999) {
            conditions += " AND EINT_ID_FIDEICOMISO IS NULL";
        } else if (this.getEintIdFideicomiso() != null) {
            conditions += " AND EINT_ID_FIDEICOMISO = ?";
            values.add(this.getEintIdFideicomiso());
        }

        if (this.getEintIdEmision() != null && this.getEintIdEmision().longValue() == -999) {
            conditions += " AND EINT_ID_EMISION IS NULL";
        } else if (this.getEintIdEmision() != null) {
            conditions += " AND EINT_ID_EMISION = ?";
            values.add(this.getEintIdEmision());
        }

        if (this.getEintIdSecInstrumento() != null && this.getEintIdSecInstrumento().longValue() == -999) {
            conditions += " AND EINT_ID_SEC_INSTRUMENTO IS NULL";
        } else if (this.getEintIdSecInstrumento() != null) {
            conditions += " AND EINT_ID_SEC_INSTRUMENTO = ?";
            values.add(this.getEintIdSecInstrumento());
        }

        if (this.getEintCveInstrumento() != null && "null".equals(this.getEintCveInstrumento())) {
            conditions += " AND EINT_CVE_INSTRUMENTO IS NULL";
        } else if (this.getEintCveInstrumento() != null) {
            conditions += " AND EINT_CVE_INSTRUMENTO = ?";
            values.add(this.getEintCveInstrumento());
        }

        if (this.getEintPlazo() != null && this.getEintPlazo().longValue() == -999) {
            conditions += " AND EINT_PLAZO IS NULL";
        } else if (this.getEintPlazo() != null) {
            conditions += " AND EINT_PLAZO = ?";
            values.add(this.getEintPlazo());
        }

        if (this.getEintTasaCalculo() != null && this.getEintTasaCalculo().longValue() == -999) {
            conditions += " AND EINT_TASA_CALCULO IS NULL";
        } else if (this.getEintTasaCalculo() != null) {
            conditions += " AND EINT_TASA_CALCULO = ?";
            values.add(this.getEintTasaCalculo());
        }

        if (this.getEintPlazoHasta() != null && this.getEintPlazoHasta().longValue() == -999) {
            conditions += " AND EINT_PLAZO_HASTA IS NULL";
        } else if (this.getEintPlazoHasta() != null) {
            conditions += " AND EINT_PLAZO_HASTA = ?";
            values.add(this.getEintPlazoHasta());
        }

        if (this.getEintTasaEquivalente() != null && this.getEintTasaEquivalente().longValue() == -999) {
            conditions += " AND EINT_TASA_EQUIVALENTE IS NULL";
        } else if (this.getEintTasaEquivalente() != null) {
            conditions += " AND EINT_TASA_EQUIVALENTE = ?";
            values.add(this.getEintTasaEquivalente());
        }

        if (this.getEintTipoInstPlazo() != null && this.getEintTipoInstPlazo().longValue() == -999) {
            conditions += " AND EINT_TIPO_INST_PLAZO IS NULL";
        } else if (this.getEintTipoInstPlazo() != null) {
            conditions += " AND EINT_TIPO_INST_PLAZO = ?";
            values.add(this.getEintTipoInstPlazo());
        }

        if (this.getEintStEmiinst() != null && "null".equals(this.getEintStEmiinst())) {
            conditions += " AND EINT_ST_EMIINST IS NULL";
        } else if (this.getEintStEmiinst() != null) {
            conditions += " AND EINT_ST_EMIINST = ?";
            values.add(this.getEintStEmiinst());
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
        String sql = "UPDATE F_EMIINST SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EINT_ID_PROGRAMA = ?";
        pkValues.add(this.getEintIdPrograma());
        conditions += " AND EINT_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEintIdFideicomiso());
        conditions += " AND EINT_ID_EMISION = ?";
        pkValues.add(this.getEintIdEmision());
        conditions += " AND EINT_ID_SEC_INSTRUMENTO = ?";
        pkValues.add(this.getEintIdSecInstrumento());
        fields += " EINT_CVE_INSTRUMENTO = ?, ";
        values.add(this.getEintCveInstrumento());
        fields += " EINT_PLAZO = ?, ";
        values.add(this.getEintPlazo());
        fields += " EINT_TASA_CALCULO = ?, ";
        values.add(this.getEintTasaCalculo());
        fields += " EINT_PLAZO_HASTA = ?, ";
        values.add(this.getEintPlazoHasta());
        fields += " EINT_TASA_EQUIVALENTE = ?, ";
        values.add(this.getEintTasaEquivalente());
        fields += " EINT_TIPO_INST_PLAZO = ?, ";
        values.add(this.getEintTipoInstPlazo());
        fields += " EINT_ST_EMIINST = ?, ";
        values.add(this.getEintStEmiinst());
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
        String sql = "INSERT INTO F_EMIINST ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EINT_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEintIdPrograma());

        fields += ", EINT_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEintIdFideicomiso());

        fields += ", EINT_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEintIdEmision());

        fields += ", EINT_ID_SEC_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getEintIdSecInstrumento());

        fields += ", EINT_CVE_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getEintCveInstrumento());

        fields += ", EINT_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEintPlazo());

        fields += ", EINT_TASA_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEintTasaCalculo());

        fields += ", EINT_PLAZO_HASTA";
        fieldValues += ", ?";
        values.add(this.getEintPlazoHasta());

        fields += ", EINT_TASA_EQUIVALENTE";
        fieldValues += ", ?";
        values.add(this.getEintTasaEquivalente());

        fields += ", EINT_TIPO_INST_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEintTipoInstPlazo());

        fields += ", EINT_ST_EMIINST";
        fieldValues += ", ?";
        values.add(this.getEintStEmiinst());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIINST WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EINT_ID_PROGRAMA = ?";
        values.add(this.getEintIdPrograma());
        conditions += " AND EINT_ID_FIDEICOMISO = ?";
        values.add(this.getEintIdFideicomiso());
        conditions += " AND EINT_ID_EMISION = ?";
        values.add(this.getEintIdEmision());
        conditions += " AND EINT_ID_SEC_INSTRUMENTO = ?";
        values.add(this.getEintIdSecInstrumento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiinst instance = (FEmiinst) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEintIdPrograma().equals(instance.getEintIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEintIdFideicomiso().equals(instance.getEintIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEintIdEmision().equals(instance.getEintIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEintIdSecInstrumento().equals(instance.getEintIdSecInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getEintCveInstrumento().equals(instance.getEintCveInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getEintPlazo().equals(instance.getEintPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEintTasaCalculo().equals(instance.getEintTasaCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEintPlazoHasta().equals(instance.getEintPlazoHasta()))
            equalObjects = false;
        if (equalObjects && !this.getEintTasaEquivalente().equals(instance.getEintTasaEquivalente()))
            equalObjects = false;
        if (equalObjects && !this.getEintTipoInstPlazo().equals(instance.getEintTipoInstPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEintStEmiinst().equals(instance.getEintStEmiinst()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiinst result = new FEmiinst();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEintIdPrograma((BigDecimal) objectData.getData("EINT_ID_PROGRAMA"));
        result.setEintIdFideicomiso((BigDecimal) objectData.getData("EINT_ID_FIDEICOMISO"));
        result.setEintIdEmision((BigDecimal) objectData.getData("EINT_ID_EMISION"));
        result.setEintIdSecInstrumento((BigDecimal) objectData.getData("EINT_ID_SEC_INSTRUMENTO"));
        result.setEintCveInstrumento((String) objectData.getData("EINT_CVE_INSTRUMENTO"));
        result.setEintPlazo((BigDecimal) objectData.getData("EINT_PLAZO"));
        result.setEintTasaCalculo((BigDecimal) objectData.getData("EINT_TASA_CALCULO"));
        result.setEintPlazoHasta((BigDecimal) objectData.getData("EINT_PLAZO_HASTA"));
        result.setEintTasaEquivalente((BigDecimal) objectData.getData("EINT_TASA_EQUIVALENTE"));
        result.setEintTipoInstPlazo((BigDecimal) objectData.getData("EINT_TIPO_INST_PLAZO"));
        result.setEintStEmiinst((String) objectData.getData("EINT_ST_EMIINST"));

        return result;

    }

}
