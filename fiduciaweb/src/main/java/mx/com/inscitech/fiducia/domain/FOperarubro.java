package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0016829", columns = { "FACO_ID_AGRUPACION", "FROA_AGRUPA_HIJA" }, sequences = { "MANUAL" })
public class FOperarubro extends DomainObject {

    BigDecimal facoIdAgrupacion = null;
    BigDecimal froaAgrupaHija = null;
    String froaTipoOperacion = null;

    public FOperarubro() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacoIdAgrupacion(BigDecimal facoIdAgrupacion) {
        this.facoIdAgrupacion = facoIdAgrupacion;
    }

    public BigDecimal getFacoIdAgrupacion() {
        return this.facoIdAgrupacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFroaAgrupaHija(BigDecimal froaAgrupaHija) {
        this.froaAgrupaHija = froaAgrupaHija;
    }

    public BigDecimal getFroaAgrupaHija() {
        return this.froaAgrupaHija;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFroaTipoOperacion(String froaTipoOperacion) {
        this.froaTipoOperacion = froaTipoOperacion;
    }

    public String getFroaTipoOperacion() {
        return this.froaTipoOperacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_OPERARUBRO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
        }

        if (this.getFroaAgrupaHija() != null && this.getFroaAgrupaHija().longValue() == -999) {
            conditions += " AND FROA_AGRUPA_HIJA IS NULL";
        } else if (this.getFroaAgrupaHija() != null) {
            conditions += " AND FROA_AGRUPA_HIJA = ?";
            values.add(this.getFroaAgrupaHija());
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
        String sql = "SELECT * FROM F_OPERARUBRO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
        }

        if (this.getFroaAgrupaHija() != null && this.getFroaAgrupaHija().longValue() == -999) {
            conditions += " AND FROA_AGRUPA_HIJA IS NULL";
        } else if (this.getFroaAgrupaHija() != null) {
            conditions += " AND FROA_AGRUPA_HIJA = ?";
            values.add(this.getFroaAgrupaHija());
        }

        if (this.getFroaTipoOperacion() != null && "null".equals(this.getFroaTipoOperacion())) {
            conditions += " AND FROA_TIPO_OPERACION IS NULL";
        } else if (this.getFroaTipoOperacion() != null) {
            conditions += " AND FROA_TIPO_OPERACION = ?";
            values.add(this.getFroaTipoOperacion());
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
        String sql = "UPDATE F_OPERARUBRO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FACO_ID_AGRUPACION = ?";
        pkValues.add(this.getFacoIdAgrupacion());
        conditions += " AND FROA_AGRUPA_HIJA = ?";
        pkValues.add(this.getFroaAgrupaHija());
        fields += " FROA_TIPO_OPERACION = ?, ";
        values.add(this.getFroaTipoOperacion());
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
        String sql = "INSERT INTO F_OPERARUBRO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FACO_ID_AGRUPACION";
        fieldValues += ", ?";
        values.add(this.getFacoIdAgrupacion());

        fields += ", FROA_AGRUPA_HIJA";
        fieldValues += ", ?";
        values.add(this.getFroaAgrupaHija());

        fields += ", FROA_TIPO_OPERACION";
        fieldValues += ", ?";
        values.add(this.getFroaTipoOperacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_OPERARUBRO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FACO_ID_AGRUPACION = ?";
        values.add(this.getFacoIdAgrupacion());
        conditions += " AND FROA_AGRUPA_HIJA = ?";
        values.add(this.getFroaAgrupaHija());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FOperarubro instance = (FOperarubro) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFacoIdAgrupacion().equals(instance.getFacoIdAgrupacion()))
            equalObjects = false;
        if (equalObjects && !this.getFroaAgrupaHija().equals(instance.getFroaAgrupaHija()))
            equalObjects = false;
        if (equalObjects && !this.getFroaTipoOperacion().equals(instance.getFroaTipoOperacion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FOperarubro result = new FOperarubro();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFacoIdAgrupacion((BigDecimal) objectData.getData("FACO_ID_AGRUPACION"));
        result.setFroaAgrupaHija((BigDecimal) objectData.getData("FROA_AGRUPA_HIJA"));
        result.setFroaTipoOperacion((String) objectData.getData("FROA_TIPO_OPERACION"));

        return result;

    }

}
