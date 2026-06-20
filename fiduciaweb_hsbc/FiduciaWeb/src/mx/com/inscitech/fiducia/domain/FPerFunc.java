package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FPerFunc extends DomainObject {

    BigDecimal fperIdPerfil = null;
    BigDecimal ffunIdFuncion = null;

    public FPerFunc() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFperIdPerfil(BigDecimal fperIdPerfil) {
        this.fperIdPerfil = fperIdPerfil;
    }

    public BigDecimal getFperIdPerfil() {
        return this.fperIdPerfil;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfunIdFuncion(BigDecimal ffunIdFuncion) {
        this.ffunIdFuncion = ffunIdFuncion;
    }

    public BigDecimal getFfunIdFuncion() {
        return this.ffunIdFuncion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PER_FUNC ";

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
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PER_FUNC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFperIdPerfil() != null && this.getFperIdPerfil().longValue() == -999) {
            conditions += " AND FPER_ID_PERFIL IS NULL";
        } else if (this.getFperIdPerfil() != null) {
            conditions += " AND FPER_ID_PERFIL = ?";
            values.add(this.getFperIdPerfil());
        }

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

    public DMLObject getUpdate() {
        DMLObject result = new DMLObject();
        String sql = "UPDATE F_PER_FUNC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FPER_ID_PERFIL = ?, ";
        values.add(this.getFperIdPerfil());
        fields += " FFUN_ID_FUNCION = ?, ";
        values.add(this.getFfunIdFuncion());
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
        String sql = "INSERT INTO F_PER_FUNC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPER_ID_PERFIL";
        fieldValues += ", ?";
        values.add(this.getFperIdPerfil());

        fields += ", FFUN_ID_FUNCION";
        fieldValues += ", ?";
        values.add(this.getFfunIdFuncion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PER_FUNC WHERE ";

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
        FPerFunc instance = (FPerFunc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFperIdPerfil().equals(instance.getFperIdPerfil()))
            equalObjects = false;
        if (equalObjects && !this.getFfunIdFuncion().equals(instance.getFfunIdFuncion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPerFunc result = new FPerFunc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFperIdPerfil((BigDecimal) objectData.getData("FPER_ID_PERFIL"));
        result.setFfunIdFuncion((BigDecimal) objectData.getData("FFUN_ID_FUNCION"));

        return result;

    }

}
