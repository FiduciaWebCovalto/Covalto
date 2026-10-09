package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FUNCION_PK", columns = { "FUN_ID_OPCION" }, sequences = { "MAX" })
public class Funcion extends DomainObject {

    BigDecimal funIdOpcion = null;
    String funNomMenu = null;
    BigDecimal funIdPadre = null;
    String funNomOpcion = null;

    public Funcion() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFunIdOpcion(BigDecimal funIdOpcion) {
        this.funIdOpcion = funIdOpcion;
    }

    public BigDecimal getFunIdOpcion() {
        return this.funIdOpcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFunNomMenu(String funNomMenu) {
        this.funNomMenu = funNomMenu;
    }

    public String getFunNomMenu() {
        return this.funNomMenu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFunIdPadre(BigDecimal funIdPadre) {
        this.funIdPadre = funIdPadre;
    }

    public BigDecimal getFunIdPadre() {
        return this.funIdPadre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFunNomOpcion(String funNomOpcion) {
        this.funNomOpcion = funNomOpcion;
    }

    public String getFunNomOpcion() {
        return this.funNomOpcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FUNCION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFunIdOpcion() != null && this.getFunIdOpcion().longValue() == -999) {
            conditions += " AND FUN_ID_OPCION IS NULL";
        } else if (this.getFunIdOpcion() != null) {
            conditions += " AND FUN_ID_OPCION = ?";
            values.add(this.getFunIdOpcion());
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
        String sql = "SELECT * FROM FUNCION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFunIdOpcion() != null && this.getFunIdOpcion().longValue() == -999) {
            conditions += " AND FUN_ID_OPCION IS NULL";
        } else if (this.getFunIdOpcion() != null) {
            conditions += " AND FUN_ID_OPCION = ?";
            values.add(this.getFunIdOpcion());
        }

        if (this.getFunNomMenu() != null && "null".equals(this.getFunNomMenu())) {
            conditions += " AND FUN_NOM_MENU IS NULL";
        } else if (this.getFunNomMenu() != null) {
            conditions += " AND FUN_NOM_MENU = ?";
            values.add(this.getFunNomMenu());
        }

        if (this.getFunIdPadre() != null && this.getFunIdPadre().longValue() == -999) {
            conditions += " AND FUN_ID_PADRE IS NULL";
        } else if (this.getFunIdPadre() != null) {
            conditions += " AND FUN_ID_PADRE = ?";
            values.add(this.getFunIdPadre());
        }

        if (this.getFunNomOpcion() != null && "null".equals(this.getFunNomOpcion())) {
            conditions += " AND FUN_NOM_OPCION IS NULL";
        } else if (this.getFunNomOpcion() != null) {
            conditions += " AND FUN_NOM_OPCION = ?";
            values.add(this.getFunNomOpcion());
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
        String sql = "UPDATE FUNCION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FUN_ID_OPCION = ?";
        pkValues.add(this.getFunIdOpcion());
        fields += " FUN_NOM_MENU = ?, ";
        values.add(this.getFunNomMenu());
        fields += " FUN_ID_PADRE = ?, ";
        values.add(this.getFunIdPadre());
        fields += " FUN_NOM_OPCION = ?, ";
        values.add(this.getFunNomOpcion());
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
        String sql = "INSERT INTO FUNCION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FUN_ID_OPCION";
        fieldValues += ", ?";
        values.add(this.getFunIdOpcion());

        fields += ", FUN_NOM_MENU";
        fieldValues += ", ?";
        values.add(this.getFunNomMenu());

        fields += ", FUN_ID_PADRE";
        fieldValues += ", ?";
        values.add(this.getFunIdPadre());

        fields += ", FUN_NOM_OPCION";
        fieldValues += ", ?";
        values.add(this.getFunNomOpcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FUNCION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FUN_ID_OPCION = ?";
        values.add(this.getFunIdOpcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Funcion instance = (Funcion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFunIdOpcion().equals(instance.getFunIdOpcion()))
            equalObjects = false;
        if (equalObjects && !this.getFunNomMenu().equals(instance.getFunNomMenu()))
            equalObjects = false;
        if (equalObjects && !this.getFunIdPadre().equals(instance.getFunIdPadre()))
            equalObjects = false;
        if (equalObjects && !this.getFunNomOpcion().equals(instance.getFunNomOpcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Funcion result = new Funcion();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFunIdOpcion((BigDecimal) objectData.getData("FUN_ID_OPCION"));
        result.setFunNomMenu((String) objectData.getData("FUN_NOM_MENU"));
        result.setFunIdPadre((BigDecimal) objectData.getData("FUN_ID_PADRE"));
        result.setFunNomOpcion((String) objectData.getData("FUN_NOM_OPCION"));

        return result;

    }

}
