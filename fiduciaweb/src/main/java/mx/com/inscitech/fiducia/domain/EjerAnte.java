package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EJER_ANTE_PK", columns = { "EAN_NUM_CONTRATO", "EAN_NOM_CONTRATO", "EAN_ANO", "EAN_ENTE" }, sequences = { "MANUAL" })
public class EjerAnte extends DomainObject {

    BigDecimal eanNumContrato = null;
    String eanNomContrato = null;
    BigDecimal eanAno = null;
    BigDecimal eanEnte = null;
    BigDecimal eanDevengado = null;
    BigDecimal eanPagado = null;
    BigDecimal eanTotal = null;
    String eanPerDel = null;
    String eanPerAl = null;

    public EjerAnte() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEanNumContrato(BigDecimal eanNumContrato) {
        this.eanNumContrato = eanNumContrato;
    }

    public BigDecimal getEanNumContrato() {
        return this.eanNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEanNomContrato(String eanNomContrato) {
        this.eanNomContrato = eanNomContrato;
    }

    public String getEanNomContrato() {
        return this.eanNomContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEanAno(BigDecimal eanAno) {
        this.eanAno = eanAno;
    }

    public BigDecimal getEanAno() {
        return this.eanAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setEanEnte(BigDecimal eanEnte) {
        this.eanEnte = eanEnte;
    }

    public BigDecimal getEanEnte() {
        return this.eanEnte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEanDevengado(BigDecimal eanDevengado) {
        this.eanDevengado = eanDevengado;
    }

    public BigDecimal getEanDevengado() {
        return this.eanDevengado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEanPagado(BigDecimal eanPagado) {
        this.eanPagado = eanPagado;
    }

    public BigDecimal getEanPagado() {
        return this.eanPagado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEanTotal(BigDecimal eanTotal) {
        this.eanTotal = eanTotal;
    }

    public BigDecimal getEanTotal() {
        return this.eanTotal;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEanPerDel(String eanPerDel) {
        this.eanPerDel = eanPerDel;
    }

    public String getEanPerDel() {
        return this.eanPerDel;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEanPerAl(String eanPerAl) {
        this.eanPerAl = eanPerAl;
    }

    public String getEanPerAl() {
        return this.eanPerAl;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EJER_ANTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEanNumContrato() != null && this.getEanNumContrato().longValue() == -999) {
            conditions += " AND EAN_NUM_CONTRATO IS NULL";
        } else if (this.getEanNumContrato() != null) {
            conditions += " AND EAN_NUM_CONTRATO = ?";
            values.add(this.getEanNumContrato());
        }

        if (this.getEanNomContrato() != null && "null".equals(this.getEanNomContrato())) {
            conditions += " AND EAN_NOM_CONTRATO IS NULL";
        } else if (this.getEanNomContrato() != null) {
            conditions += " AND EAN_NOM_CONTRATO = ?";
            values.add(this.getEanNomContrato());
        }

        if (this.getEanAno() != null && this.getEanAno().longValue() == -999) {
            conditions += " AND EAN_ANO IS NULL";
        } else if (this.getEanAno() != null) {
            conditions += " AND EAN_ANO = ?";
            values.add(this.getEanAno());
        }

        if (this.getEanEnte() != null && this.getEanEnte().longValue() == -999) {
            conditions += " AND EAN_ENTE IS NULL";
        } else if (this.getEanEnte() != null) {
            conditions += " AND EAN_ENTE = ?";
            values.add(this.getEanEnte());
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
        String sql = "SELECT * FROM EJER_ANTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEanNumContrato() != null && this.getEanNumContrato().longValue() == -999) {
            conditions += " AND EAN_NUM_CONTRATO IS NULL";
        } else if (this.getEanNumContrato() != null) {
            conditions += " AND EAN_NUM_CONTRATO = ?";
            values.add(this.getEanNumContrato());
        }

        if (this.getEanNomContrato() != null && "null".equals(this.getEanNomContrato())) {
            conditions += " AND EAN_NOM_CONTRATO IS NULL";
        } else if (this.getEanNomContrato() != null) {
            conditions += " AND EAN_NOM_CONTRATO = ?";
            values.add(this.getEanNomContrato());
        }

        if (this.getEanAno() != null && this.getEanAno().longValue() == -999) {
            conditions += " AND EAN_ANO IS NULL";
        } else if (this.getEanAno() != null) {
            conditions += " AND EAN_ANO = ?";
            values.add(this.getEanAno());
        }

        if (this.getEanEnte() != null && this.getEanEnte().longValue() == -999) {
            conditions += " AND EAN_ENTE IS NULL";
        } else if (this.getEanEnte() != null) {
            conditions += " AND EAN_ENTE = ?";
            values.add(this.getEanEnte());
        }

        if (this.getEanDevengado() != null && this.getEanDevengado().longValue() == -999) {
            conditions += " AND EAN_DEVENGADO IS NULL";
        } else if (this.getEanDevengado() != null) {
            conditions += " AND EAN_DEVENGADO = ?";
            values.add(this.getEanDevengado());
        }

        if (this.getEanPagado() != null && this.getEanPagado().longValue() == -999) {
            conditions += " AND EAN_PAGADO IS NULL";
        } else if (this.getEanPagado() != null) {
            conditions += " AND EAN_PAGADO = ?";
            values.add(this.getEanPagado());
        }

        if (this.getEanTotal() != null && this.getEanTotal().longValue() == -999) {
            conditions += " AND EAN_TOTAL IS NULL";
        } else if (this.getEanTotal() != null) {
            conditions += " AND EAN_TOTAL = ?";
            values.add(this.getEanTotal());
        }

        if (this.getEanPerDel() != null && "null".equals(this.getEanPerDel())) {
            conditions += " AND EAN_PER_DEL IS NULL";
        } else if (this.getEanPerDel() != null) {
            conditions += " AND EAN_PER_DEL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEanPerDel());
        }

        if (this.getEanPerAl() != null && "null".equals(this.getEanPerAl())) {
            conditions += " AND EAN_PER_AL IS NULL";
        } else if (this.getEanPerAl() != null) {
            conditions += " AND EAN_PER_AL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEanPerAl());
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
        String sql = "UPDATE EJER_ANTE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EAN_NUM_CONTRATO = ?";
        pkValues.add(this.getEanNumContrato());
        conditions += " AND EAN_NOM_CONTRATO = ?";
        pkValues.add(this.getEanNomContrato());
        conditions += " AND EAN_ANO = ?";
        pkValues.add(this.getEanAno());
        conditions += " AND EAN_ENTE = ?";
        pkValues.add(this.getEanEnte());
        fields += " EAN_DEVENGADO = ?, ";
        values.add(this.getEanDevengado());
        fields += " EAN_PAGADO = ?, ";
        values.add(this.getEanPagado());
        fields += " EAN_TOTAL = ?, ";
        values.add(this.getEanTotal());
        fields += " EAN_PER_DEL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEanPerDel());
        fields += " EAN_PER_AL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEanPerAl());
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
        String sql = "INSERT INTO EJER_ANTE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EAN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getEanNumContrato());

        fields += ", EAN_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getEanNomContrato());

        fields += ", EAN_ANO";
        fieldValues += ", ?";
        values.add(this.getEanAno());

        fields += ", EAN_ENTE";
        fieldValues += ", ?";
        values.add(this.getEanEnte());

        fields += ", EAN_DEVENGADO";
        fieldValues += ", ?";
        values.add(this.getEanDevengado());

        fields += ", EAN_PAGADO";
        fieldValues += ", ?";
        values.add(this.getEanPagado());

        fields += ", EAN_TOTAL";
        fieldValues += ", ?";
        values.add(this.getEanTotal());

        fields += ", EAN_PER_DEL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEanPerDel());

        fields += ", EAN_PER_AL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEanPerAl());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EJER_ANTE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EAN_NUM_CONTRATO = ?";
        values.add(this.getEanNumContrato());
        conditions += " AND EAN_NOM_CONTRATO = ?";
        values.add(this.getEanNomContrato());
        conditions += " AND EAN_ANO = ?";
        values.add(this.getEanAno());
        conditions += " AND EAN_ENTE = ?";
        values.add(this.getEanEnte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        EjerAnte instance = (EjerAnte) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEanNumContrato().equals(instance.getEanNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEanNomContrato().equals(instance.getEanNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEanAno().equals(instance.getEanAno()))
            equalObjects = false;
        if (equalObjects && !this.getEanEnte().equals(instance.getEanEnte()))
            equalObjects = false;
        if (equalObjects && !this.getEanDevengado().equals(instance.getEanDevengado()))
            equalObjects = false;
        if (equalObjects && !this.getEanPagado().equals(instance.getEanPagado()))
            equalObjects = false;
        if (equalObjects && !this.getEanTotal().equals(instance.getEanTotal()))
            equalObjects = false;
        if (equalObjects && !this.getEanPerDel().equals(instance.getEanPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getEanPerAl().equals(instance.getEanPerAl()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        EjerAnte result = new EjerAnte();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEanNumContrato((BigDecimal) objectData.getData("EAN_NUM_CONTRATO"));
        result.setEanNomContrato((String) objectData.getData("EAN_NOM_CONTRATO"));
        result.setEanAno((BigDecimal) objectData.getData("EAN_ANO"));
        result.setEanEnte((BigDecimal) objectData.getData("EAN_ENTE"));
        result.setEanDevengado((BigDecimal) objectData.getData("EAN_DEVENGADO"));
        result.setEanPagado((BigDecimal) objectData.getData("EAN_PAGADO"));
        result.setEanTotal((BigDecimal) objectData.getData("EAN_TOTAL"));
        result.setEanPerDel((String) objectData.getData("EAN_PER_DEL"));
        result.setEanPerAl((String) objectData.getData("EAN_PER_AL"));

        return result;

    }

}
