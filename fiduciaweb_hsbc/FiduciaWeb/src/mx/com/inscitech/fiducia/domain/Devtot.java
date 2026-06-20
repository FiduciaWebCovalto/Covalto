package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DEVTOT_PK", columns = { "DVT_ACTIVIDAD", "DVT_NIVEL1", "DVT_NIVEL2", "DVT_NIVEL3", "DVT_NIVEL4", "DVT_NIVEL5" }, sequences = { "MANUAL" })
public class Devtot extends DomainObject {

    String dvtActividad = null;
    BigDecimal dvtNivel1 = null;
    BigDecimal dvtNivel2 = null;
    BigDecimal dvtNivel3 = null;
    BigDecimal dvtNivel4 = null;
    BigDecimal dvtNivel5 = null;
    BigDecimal dvtTotalMes = null;
    BigDecimal dvtTotalAno = null;
    BigDecimal dvtVariAbs = null;

    public Devtot() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvtActividad(String dvtActividad) {
        this.dvtActividad = dvtActividad;
    }

    public String getDvtActividad() {
        return this.dvtActividad;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDvtNivel1(BigDecimal dvtNivel1) {
        this.dvtNivel1 = dvtNivel1;
    }

    public BigDecimal getDvtNivel1() {
        return this.dvtNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDvtNivel2(BigDecimal dvtNivel2) {
        this.dvtNivel2 = dvtNivel2;
    }

    public BigDecimal getDvtNivel2() {
        return this.dvtNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDvtNivel3(BigDecimal dvtNivel3) {
        this.dvtNivel3 = dvtNivel3;
    }

    public BigDecimal getDvtNivel3() {
        return this.dvtNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDvtNivel4(BigDecimal dvtNivel4) {
        this.dvtNivel4 = dvtNivel4;
    }

    public BigDecimal getDvtNivel4() {
        return this.dvtNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDvtNivel5(BigDecimal dvtNivel5) {
        this.dvtNivel5 = dvtNivel5;
    }

    public BigDecimal getDvtNivel5() {
        return this.dvtNivel5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 4, javaClass = BigDecimal.class)
    public void setDvtTotalMes(BigDecimal dvtTotalMes) {
        this.dvtTotalMes = dvtTotalMes;
    }

    public BigDecimal getDvtTotalMes() {
        return this.dvtTotalMes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 4, javaClass = BigDecimal.class)
    public void setDvtTotalAno(BigDecimal dvtTotalAno) {
        this.dvtTotalAno = dvtTotalAno;
    }

    public BigDecimal getDvtTotalAno() {
        return this.dvtTotalAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setDvtVariAbs(BigDecimal dvtVariAbs) {
        this.dvtVariAbs = dvtVariAbs;
    }

    public BigDecimal getDvtVariAbs() {
        return this.dvtVariAbs;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DEVTOT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDvtActividad() != null && "null".equals(this.getDvtActividad())) {
            conditions += " AND DVT_ACTIVIDAD IS NULL";
        } else if (this.getDvtActividad() != null) {
            conditions += " AND DVT_ACTIVIDAD = ?";
            values.add(this.getDvtActividad());
        }

        if (this.getDvtNivel1() != null && this.getDvtNivel1().longValue() == -999) {
            conditions += " AND DVT_NIVEL1 IS NULL";
        } else if (this.getDvtNivel1() != null) {
            conditions += " AND DVT_NIVEL1 = ?";
            values.add(this.getDvtNivel1());
        }

        if (this.getDvtNivel2() != null && this.getDvtNivel2().longValue() == -999) {
            conditions += " AND DVT_NIVEL2 IS NULL";
        } else if (this.getDvtNivel2() != null) {
            conditions += " AND DVT_NIVEL2 = ?";
            values.add(this.getDvtNivel2());
        }

        if (this.getDvtNivel3() != null && this.getDvtNivel3().longValue() == -999) {
            conditions += " AND DVT_NIVEL3 IS NULL";
        } else if (this.getDvtNivel3() != null) {
            conditions += " AND DVT_NIVEL3 = ?";
            values.add(this.getDvtNivel3());
        }

        if (this.getDvtNivel4() != null && this.getDvtNivel4().longValue() == -999) {
            conditions += " AND DVT_NIVEL4 IS NULL";
        } else if (this.getDvtNivel4() != null) {
            conditions += " AND DVT_NIVEL4 = ?";
            values.add(this.getDvtNivel4());
        }

        if (this.getDvtNivel5() != null && this.getDvtNivel5().longValue() == -999) {
            conditions += " AND DVT_NIVEL5 IS NULL";
        } else if (this.getDvtNivel5() != null) {
            conditions += " AND DVT_NIVEL5 = ?";
            values.add(this.getDvtNivel5());
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
        String sql = "SELECT * FROM DEVTOT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDvtActividad() != null && "null".equals(this.getDvtActividad())) {
            conditions += " AND DVT_ACTIVIDAD IS NULL";
        } else if (this.getDvtActividad() != null) {
            conditions += " AND DVT_ACTIVIDAD = ?";
            values.add(this.getDvtActividad());
        }

        if (this.getDvtNivel1() != null && this.getDvtNivel1().longValue() == -999) {
            conditions += " AND DVT_NIVEL1 IS NULL";
        } else if (this.getDvtNivel1() != null) {
            conditions += " AND DVT_NIVEL1 = ?";
            values.add(this.getDvtNivel1());
        }

        if (this.getDvtNivel2() != null && this.getDvtNivel2().longValue() == -999) {
            conditions += " AND DVT_NIVEL2 IS NULL";
        } else if (this.getDvtNivel2() != null) {
            conditions += " AND DVT_NIVEL2 = ?";
            values.add(this.getDvtNivel2());
        }

        if (this.getDvtNivel3() != null && this.getDvtNivel3().longValue() == -999) {
            conditions += " AND DVT_NIVEL3 IS NULL";
        } else if (this.getDvtNivel3() != null) {
            conditions += " AND DVT_NIVEL3 = ?";
            values.add(this.getDvtNivel3());
        }

        if (this.getDvtNivel4() != null && this.getDvtNivel4().longValue() == -999) {
            conditions += " AND DVT_NIVEL4 IS NULL";
        } else if (this.getDvtNivel4() != null) {
            conditions += " AND DVT_NIVEL4 = ?";
            values.add(this.getDvtNivel4());
        }

        if (this.getDvtNivel5() != null && this.getDvtNivel5().longValue() == -999) {
            conditions += " AND DVT_NIVEL5 IS NULL";
        } else if (this.getDvtNivel5() != null) {
            conditions += " AND DVT_NIVEL5 = ?";
            values.add(this.getDvtNivel5());
        }

        if (this.getDvtTotalMes() != null && this.getDvtTotalMes().longValue() == -999) {
            conditions += " AND DVT_TOTAL_MES IS NULL";
        } else if (this.getDvtTotalMes() != null) {
            conditions += " AND DVT_TOTAL_MES = ?";
            values.add(this.getDvtTotalMes());
        }

        if (this.getDvtTotalAno() != null && this.getDvtTotalAno().longValue() == -999) {
            conditions += " AND DVT_TOTAL_ANO IS NULL";
        } else if (this.getDvtTotalAno() != null) {
            conditions += " AND DVT_TOTAL_ANO = ?";
            values.add(this.getDvtTotalAno());
        }

        if (this.getDvtVariAbs() != null && this.getDvtVariAbs().longValue() == -999) {
            conditions += " AND DVT_VARI_ABS IS NULL";
        } else if (this.getDvtVariAbs() != null) {
            conditions += " AND DVT_VARI_ABS = ?";
            values.add(this.getDvtVariAbs());
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
        String sql = "UPDATE DEVTOT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DVT_ACTIVIDAD = ?";
        pkValues.add(this.getDvtActividad());
        conditions += " AND DVT_NIVEL1 = ?";
        pkValues.add(this.getDvtNivel1());
        conditions += " AND DVT_NIVEL2 = ?";
        pkValues.add(this.getDvtNivel2());
        conditions += " AND DVT_NIVEL3 = ?";
        pkValues.add(this.getDvtNivel3());
        conditions += " AND DVT_NIVEL4 = ?";
        pkValues.add(this.getDvtNivel4());
        conditions += " AND DVT_NIVEL5 = ?";
        pkValues.add(this.getDvtNivel5());
        fields += " DVT_TOTAL_MES = ?, ";
        values.add(this.getDvtTotalMes());
        fields += " DVT_TOTAL_ANO = ?, ";
        values.add(this.getDvtTotalAno());
        fields += " DVT_VARI_ABS = ?, ";
        values.add(this.getDvtVariAbs());
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
        String sql = "INSERT INTO DEVTOT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DVT_ACTIVIDAD";
        fieldValues += ", ?";
        values.add(this.getDvtActividad());

        fields += ", DVT_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getDvtNivel1());

        fields += ", DVT_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getDvtNivel2());

        fields += ", DVT_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getDvtNivel3());

        fields += ", DVT_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getDvtNivel4());

        fields += ", DVT_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getDvtNivel5());

        fields += ", DVT_TOTAL_MES";
        fieldValues += ", ?";
        values.add(this.getDvtTotalMes());

        fields += ", DVT_TOTAL_ANO";
        fieldValues += ", ?";
        values.add(this.getDvtTotalAno());

        fields += ", DVT_VARI_ABS";
        fieldValues += ", ?";
        values.add(this.getDvtVariAbs());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DEVTOT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DVT_ACTIVIDAD = ?";
        values.add(this.getDvtActividad());
        conditions += " AND DVT_NIVEL1 = ?";
        values.add(this.getDvtNivel1());
        conditions += " AND DVT_NIVEL2 = ?";
        values.add(this.getDvtNivel2());
        conditions += " AND DVT_NIVEL3 = ?";
        values.add(this.getDvtNivel3());
        conditions += " AND DVT_NIVEL4 = ?";
        values.add(this.getDvtNivel4());
        conditions += " AND DVT_NIVEL5 = ?";
        values.add(this.getDvtNivel5());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Devtot instance = (Devtot) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDvtActividad().equals(instance.getDvtActividad()))
            equalObjects = false;
        if (equalObjects && !this.getDvtNivel1().equals(instance.getDvtNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getDvtNivel2().equals(instance.getDvtNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getDvtNivel3().equals(instance.getDvtNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getDvtNivel4().equals(instance.getDvtNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getDvtNivel5().equals(instance.getDvtNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getDvtTotalMes().equals(instance.getDvtTotalMes()))
            equalObjects = false;
        if (equalObjects && !this.getDvtTotalAno().equals(instance.getDvtTotalAno()))
            equalObjects = false;
        if (equalObjects && !this.getDvtVariAbs().equals(instance.getDvtVariAbs()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Devtot result = new Devtot();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDvtActividad((String) objectData.getData("DVT_ACTIVIDAD"));
        result.setDvtNivel1((BigDecimal) objectData.getData("DVT_NIVEL1"));
        result.setDvtNivel2((BigDecimal) objectData.getData("DVT_NIVEL2"));
        result.setDvtNivel3((BigDecimal) objectData.getData("DVT_NIVEL3"));
        result.setDvtNivel4((BigDecimal) objectData.getData("DVT_NIVEL4"));
        result.setDvtNivel5((BigDecimal) objectData.getData("DVT_NIVEL5"));
        result.setDvtTotalMes((BigDecimal) objectData.getData("DVT_TOTAL_MES"));
        result.setDvtTotalAno((BigDecimal) objectData.getData("DVT_TOTAL_ANO"));
        result.setDvtVariAbs((BigDecimal) objectData.getData("DVT_VARI_ABS"));

        return result;

    }

}
