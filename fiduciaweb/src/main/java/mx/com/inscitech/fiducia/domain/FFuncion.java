package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_FUNCION_PK", columns = { "FFUN_ID_FUNCION" }, sequences = { "MAX" })
public class FFuncion extends DomainObject {

    BigDecimal ffunIdFuncion = null;
    String ffunNomMenu = null;
    BigDecimal ffunIdPadre = null;
    String ffunNombreFuncion = null;
    BigDecimal ffunOrden = null;

    public FFuncion() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfunIdFuncion(BigDecimal ffunIdFuncion) {
        this.ffunIdFuncion = ffunIdFuncion;
    }

    public BigDecimal getFfunIdFuncion() {
        return this.ffunIdFuncion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFfunNomMenu(String ffunNomMenu) {
        this.ffunNomMenu = ffunNomMenu;
    }

    public String getFfunNomMenu() {
        return this.ffunNomMenu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfunIdPadre(BigDecimal ffunIdPadre) {
        this.ffunIdPadre = ffunIdPadre;
    }

    public BigDecimal getFfunIdPadre() {
        return this.ffunIdPadre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFfunNombreFuncion(String ffunNombreFuncion) {
        this.ffunNombreFuncion = ffunNombreFuncion;
    }

    public String getFfunNombreFuncion() {
        return this.ffunNombreFuncion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFfunOrden(BigDecimal ffunOrden) {
        this.ffunOrden = ffunOrden;
    }

    public BigDecimal getFfunOrden() {
        return this.ffunOrden;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_FUNCION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFfunIdFuncion() != null && this.getFfunIdFuncion().longValue() == -999) {
            conditions += " AND FFUN_ID_FUNCION IS NULL";
        } else if (this.getFfunIdFuncion() != null) {
            conditions += " AND FFUN_ID_FUNCION = ?";
            values.add(this.getFfunIdFuncion());
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
        String sql = "SELECT * FROM F_FUNCION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFfunIdFuncion() != null && this.getFfunIdFuncion().longValue() == -999) {
            conditions += " AND FFUN_ID_FUNCION IS NULL";
        } else if (this.getFfunIdFuncion() != null) {
            conditions += " AND FFUN_ID_FUNCION = ?";
            values.add(this.getFfunIdFuncion());
        }

        if (this.getFfunNomMenu() != null && "null".equals(this.getFfunNomMenu())) {
            conditions += " AND FFUN_NOM_MENU IS NULL";
        } else if (this.getFfunNomMenu() != null) {
            conditions += " AND FFUN_NOM_MENU = ?";
            values.add(this.getFfunNomMenu());
        }

        if (this.getFfunIdPadre() != null && this.getFfunIdPadre().longValue() == -999) {
            conditions += " AND FFUN_ID_PADRE IS NULL";
        } else if (this.getFfunIdPadre() != null) {
            conditions += " AND FFUN_ID_PADRE = ?";
            values.add(this.getFfunIdPadre());
        }

        if (this.getFfunNombreFuncion() != null && "null".equals(this.getFfunNombreFuncion())) {
            conditions += " AND FFUN_NOMBRE_FUNCION IS NULL";
        } else if (this.getFfunNombreFuncion() != null) {
            conditions += " AND FFUN_NOMBRE_FUNCION = ?";
            values.add(this.getFfunNombreFuncion());
        }

        if (this.getFfunOrden() != null && this.getFfunOrden().longValue() == -999) {
            conditions += " AND FFUN_ORDEN IS NULL";
        } else if (this.getFfunOrden() != null) {
            conditions += " AND FFUN_ORDEN = ?";
            values.add(this.getFfunOrden());
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
        String sql = "UPDATE F_FUNCION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FFUN_ID_FUNCION = ?";
        pkValues.add(this.getFfunIdFuncion());
        fields += " FFUN_NOM_MENU = ?, ";
        values.add(this.getFfunNomMenu());
        fields += " FFUN_ID_PADRE = ?, ";
        values.add(this.getFfunIdPadre());
        fields += " FFUN_NOMBRE_FUNCION = ?, ";
        values.add(this.getFfunNombreFuncion());
        fields += " FFUN_ORDEN = ?, ";
        values.add(this.getFfunOrden());
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
        String sql = "INSERT INTO F_FUNCION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FFUN_ID_FUNCION";
        fieldValues += ", ?";
        values.add(this.getFfunIdFuncion());

        fields += ", FFUN_NOM_MENU";
        fieldValues += ", ?";
        values.add(this.getFfunNomMenu());

        fields += ", FFUN_ID_PADRE";
        fieldValues += ", ?";
        values.add(this.getFfunIdPadre());

        fields += ", FFUN_NOMBRE_FUNCION";
        fieldValues += ", ?";
        values.add(this.getFfunNombreFuncion());

        fields += ", FFUN_ORDEN";
        fieldValues += ", ?";
        values.add(this.getFfunOrden());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_FUNCION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FFUN_ID_FUNCION = ?";
        values.add(this.getFfunIdFuncion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FFuncion instance = (FFuncion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFfunIdFuncion().equals(instance.getFfunIdFuncion()))
            equalObjects = false;
        if (equalObjects && !this.getFfunNomMenu().equals(instance.getFfunNomMenu()))
            equalObjects = false;
        if (equalObjects && !this.getFfunIdPadre().equals(instance.getFfunIdPadre()))
            equalObjects = false;
        if (equalObjects && !this.getFfunNombreFuncion().equals(instance.getFfunNombreFuncion()))
            equalObjects = false;
        if (equalObjects && !this.getFfunOrden().equals(instance.getFfunOrden()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FFuncion result = new FFuncion();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFfunIdFuncion((BigDecimal) objectData.getData("FFUN_ID_FUNCION"));
        result.setFfunNomMenu((String) objectData.getData("FFUN_NOM_MENU"));
        result.setFfunIdPadre((BigDecimal) objectData.getData("FFUN_ID_PADRE"));
        result.setFfunNombreFuncion((String) objectData.getData("FFUN_NOMBRE_FUNCION"));
        result.setFfunOrden((BigDecimal) objectData.getData("FFUN_ORDEN"));

        return result;

    }

}
