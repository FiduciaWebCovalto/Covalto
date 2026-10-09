package mx.com.inscitech.fiducia.domain;


import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_MATRIZ_CONF_PK", columns = { "FMCO_ARCH_CONF", "FMCO_FIDUCIAWEB", "FMCO_OPERACION" }, sequences = { "MANUAL" })
public class FMatrizConf extends DomainObject {


    public FMatrizConf() {
        super();
        this.pkColumns = 3;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_MATRIZ_CONF ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getSelect() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_MATRIZ_CONF ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE F_MATRIZ_CONF SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO F_MATRIZ_CONF ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_MATRIZ_CONF WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FMatrizConf instance = (FMatrizConf) compareWith;
        boolean equalObjects = true;
        return equalObjects;
    }

    public Object selectAsObject() {
        FMatrizConf result = new FMatrizConf();
        DataRow objectData = null;
        objectData = selectAsDataRow();


        return result;

    }

}
