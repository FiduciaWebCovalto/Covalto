package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CLAS_CPO_PK", columns = { "CLA_DESCRIPCION", "CPO_SERIE", "CPO_ACTA_EMIS" }, sequences = { "MANUAL" })
public class ClasCpo extends DomainObject {

    BigDecimal cpoActaEmis = null;
    BigDecimal ticNumPais = null;
    BigDecimal ticAnoAltaReg = null;
    BigDecimal ticMesAltaReg = null;
    BigDecimal ticDiaAltaReg = null;
    BigDecimal ticHoraAlta = null;
    BigDecimal ticMinutoAlta = null;
    String claDescripcion = null;
    String cpoSerie = null;

    public ClasCpo() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTicNumPais(BigDecimal ticNumPais) {
        this.ticNumPais = ticNumPais;
    }

    public BigDecimal getTicNumPais() {
        return this.ticNumPais;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTicAnoAltaReg(BigDecimal ticAnoAltaReg) {
        this.ticAnoAltaReg = ticAnoAltaReg;
    }

    public BigDecimal getTicAnoAltaReg() {
        return this.ticAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTicMesAltaReg(BigDecimal ticMesAltaReg) {
        this.ticMesAltaReg = ticMesAltaReg;
    }

    public BigDecimal getTicMesAltaReg() {
        return this.ticMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTicDiaAltaReg(BigDecimal ticDiaAltaReg) {
        this.ticDiaAltaReg = ticDiaAltaReg;
    }

    public BigDecimal getTicDiaAltaReg() {
        return this.ticDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTicHoraAlta(BigDecimal ticHoraAlta) {
        this.ticHoraAlta = ticHoraAlta;
    }

    public BigDecimal getTicHoraAlta() {
        return this.ticHoraAlta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTicMinutoAlta(BigDecimal ticMinutoAlta) {
        this.ticMinutoAlta = ticMinutoAlta;
    }

    public BigDecimal getTicMinutoAlta() {
        return this.ticMinutoAlta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaDescripcion(String claDescripcion) {
        this.claDescripcion = claDescripcion;
    }

    public String getClaDescripcion() {
        return this.claDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoSerie(String cpoSerie) {
        this.cpoSerie = cpoSerie;
    }

    public String getCpoSerie() {
        return this.cpoSerie;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CLAS_CPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
        }

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
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
        String sql = "SELECT * FROM CLAS_CPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getTicNumPais() != null && this.getTicNumPais().longValue() == -999) {
            conditions += " AND TIC_NUM_PAIS IS NULL";
        } else if (this.getTicNumPais() != null) {
            conditions += " AND TIC_NUM_PAIS = ?";
            values.add(this.getTicNumPais());
        }

        if (this.getTicAnoAltaReg() != null && this.getTicAnoAltaReg().longValue() == -999) {
            conditions += " AND TIC_ANO_ALTA_REG IS NULL";
        } else if (this.getTicAnoAltaReg() != null) {
            conditions += " AND TIC_ANO_ALTA_REG = ?";
            values.add(this.getTicAnoAltaReg());
        }

        if (this.getTicMesAltaReg() != null && this.getTicMesAltaReg().longValue() == -999) {
            conditions += " AND TIC_MES_ALTA_REG IS NULL";
        } else if (this.getTicMesAltaReg() != null) {
            conditions += " AND TIC_MES_ALTA_REG = ?";
            values.add(this.getTicMesAltaReg());
        }

        if (this.getTicDiaAltaReg() != null && this.getTicDiaAltaReg().longValue() == -999) {
            conditions += " AND TIC_DIA_ALTA_REG IS NULL";
        } else if (this.getTicDiaAltaReg() != null) {
            conditions += " AND TIC_DIA_ALTA_REG = ?";
            values.add(this.getTicDiaAltaReg());
        }

        if (this.getTicHoraAlta() != null && this.getTicHoraAlta().longValue() == -999) {
            conditions += " AND TIC_HORA_ALTA IS NULL";
        } else if (this.getTicHoraAlta() != null) {
            conditions += " AND TIC_HORA_ALTA = ?";
            values.add(this.getTicHoraAlta());
        }

        if (this.getTicMinutoAlta() != null && this.getTicMinutoAlta().longValue() == -999) {
            conditions += " AND TIC_MINUTO_ALTA IS NULL";
        } else if (this.getTicMinutoAlta() != null) {
            conditions += " AND TIC_MINUTO_ALTA = ?";
            values.add(this.getTicMinutoAlta());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
        }

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
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
        String sql = "UPDATE CLAS_CPO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        fields += " TIC_NUM_PAIS = ?, ";
        values.add(this.getTicNumPais());
        fields += " TIC_ANO_ALTA_REG = ?, ";
        values.add(this.getTicAnoAltaReg());
        fields += " TIC_MES_ALTA_REG = ?, ";
        values.add(this.getTicMesAltaReg());
        fields += " TIC_DIA_ALTA_REG = ?, ";
        values.add(this.getTicDiaAltaReg());
        fields += " TIC_HORA_ALTA = ?, ";
        values.add(this.getTicHoraAlta());
        fields += " TIC_MINUTO_ALTA = ?, ";
        values.add(this.getTicMinutoAlta());
        conditions += " AND CLA_DESCRIPCION = ?";
        pkValues.add(this.getClaDescripcion());
        conditions += " AND CPO_SERIE = ?";
        pkValues.add(this.getCpoSerie());
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
        String sql = "INSERT INTO CLAS_CPO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", TIC_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getTicNumPais());

        fields += ", TIC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTicAnoAltaReg());

        fields += ", TIC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTicMesAltaReg());

        fields += ", TIC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTicDiaAltaReg());

        fields += ", TIC_HORA_ALTA";
        fieldValues += ", ?";
        values.add(this.getTicHoraAlta());

        fields += ", TIC_MINUTO_ALTA";
        fieldValues += ", ?";
        values.add(this.getTicMinutoAlta());

        fields += ", CLA_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getClaDescripcion());

        fields += ", CPO_SERIE";
        fieldValues += ", ?";
        values.add(this.getCpoSerie());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CLAS_CPO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPO_ACTA_EMIS = ?";
        values.add(this.getCpoActaEmis());
        conditions += " AND CLA_DESCRIPCION = ?";
        values.add(this.getClaDescripcion());
        conditions += " AND CPO_SERIE = ?";
        values.add(this.getCpoSerie());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ClasCpo instance = (ClasCpo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getTicNumPais().equals(instance.getTicNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getTicAnoAltaReg().equals(instance.getTicAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTicMesAltaReg().equals(instance.getTicMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTicDiaAltaReg().equals(instance.getTicDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTicHoraAlta().equals(instance.getTicHoraAlta()))
            equalObjects = false;
        if (equalObjects && !this.getTicMinutoAlta().equals(instance.getTicMinutoAlta()))
            equalObjects = false;
        if (equalObjects && !this.getClaDescripcion().equals(instance.getClaDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getCpoSerie().equals(instance.getCpoSerie()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ClasCpo result = new ClasCpo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setTicNumPais((BigDecimal) objectData.getData("TIC_NUM_PAIS"));
        result.setTicAnoAltaReg((BigDecimal) objectData.getData("TIC_ANO_ALTA_REG"));
        result.setTicMesAltaReg((BigDecimal) objectData.getData("TIC_MES_ALTA_REG"));
        result.setTicDiaAltaReg((BigDecimal) objectData.getData("TIC_DIA_ALTA_REG"));
        result.setTicHoraAlta((BigDecimal) objectData.getData("TIC_HORA_ALTA"));
        result.setTicMinutoAlta((BigDecimal) objectData.getData("TIC_MINUTO_ALTA"));
        result.setClaDescripcion((String) objectData.getData("CLA_DESCRIPCION"));
        result.setCpoSerie((String) objectData.getData("CPO_SERIE"));

        return result;

    }

}
