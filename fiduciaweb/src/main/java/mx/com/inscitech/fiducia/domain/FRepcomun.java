package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REPCOMUN_PK", columns = { "REPC_ID_REP_COMUN" }, sequences = { "MAX" })
public class FRepcomun extends DomainObject {

    BigDecimal repcIdRepComun = null;
    String repcInstitucion = null;
    String repcFecCreacion = null;
    String repcComentario = null;
    String repcComentario1 = null;
    String repcStFRepcomun = null;

    public FRepcomun() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepcIdRepComun(BigDecimal repcIdRepComun) {
        this.repcIdRepComun = repcIdRepComun;
    }

    public BigDecimal getRepcIdRepComun() {
        return this.repcIdRepComun;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepcInstitucion(String repcInstitucion) {
        this.repcInstitucion = repcInstitucion;
    }

    public String getRepcInstitucion() {
        return this.repcInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRepcFecCreacion(String repcFecCreacion) {
        this.repcFecCreacion = repcFecCreacion;
    }

    public String getRepcFecCreacion() {
        return this.repcFecCreacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepcComentario(String repcComentario) {
        this.repcComentario = repcComentario;
    }

    public String getRepcComentario() {
        return this.repcComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepcComentario1(String repcComentario1) {
        this.repcComentario1 = repcComentario1;
    }

    public String getRepcComentario1() {
        return this.repcComentario1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepcStFRepcomun(String repcStFRepcomun) {
        this.repcStFRepcomun = repcStFRepcomun;
    }

    public String getRepcStFRepcomun() {
        return this.repcStFRepcomun;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REPCOMUN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepcIdRepComun() != null && this.getRepcIdRepComun().longValue() == -999) {
            conditions += " AND REPC_ID_REP_COMUN IS NULL";
        } else if (this.getRepcIdRepComun() != null) {
            conditions += " AND REPC_ID_REP_COMUN = ?";
            values.add(this.getRepcIdRepComun());
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
        String sql = "SELECT * FROM F_REPCOMUN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepcIdRepComun() != null && this.getRepcIdRepComun().longValue() == -999) {
            conditions += " AND REPC_ID_REP_COMUN IS NULL";
        } else if (this.getRepcIdRepComun() != null) {
            conditions += " AND REPC_ID_REP_COMUN = ?";
            values.add(this.getRepcIdRepComun());
        }

        if (this.getRepcInstitucion() != null && "null".equals(this.getRepcInstitucion())) {
            conditions += " AND REPC_INSTITUCION IS NULL";
        } else if (this.getRepcInstitucion() != null) {
            conditions += " AND REPC_INSTITUCION = ?";
            values.add(this.getRepcInstitucion());
        }

        if (this.getRepcFecCreacion() != null && "null".equals(this.getRepcFecCreacion())) {
            conditions += " AND REPC_FEC_CREACION IS NULL";
        } else if (this.getRepcFecCreacion() != null) {
            conditions += " AND REPC_FEC_CREACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRepcFecCreacion());
        }

        if (this.getRepcComentario() != null && "null".equals(this.getRepcComentario())) {
            conditions += " AND REPC_COMENTARIO IS NULL";
        } else if (this.getRepcComentario() != null) {
            conditions += " AND REPC_COMENTARIO = ?";
            values.add(this.getRepcComentario());
        }

        if (this.getRepcComentario1() != null && "null".equals(this.getRepcComentario1())) {
            conditions += " AND REPC_COMENTARIO1 IS NULL";
        } else if (this.getRepcComentario1() != null) {
            conditions += " AND REPC_COMENTARIO1 = ?";
            values.add(this.getRepcComentario1());
        }

        if (this.getRepcStFRepcomun() != null && "null".equals(this.getRepcStFRepcomun())) {
            conditions += " AND REPC_ST_F_REPCOMUN IS NULL";
        } else if (this.getRepcStFRepcomun() != null) {
            conditions += " AND REPC_ST_F_REPCOMUN = ?";
            values.add(this.getRepcStFRepcomun());
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
        String sql = "UPDATE F_REPCOMUN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REPC_ID_REP_COMUN = ?";
        pkValues.add(this.getRepcIdRepComun());
        fields += " REPC_INSTITUCION = ?, ";
        values.add(this.getRepcInstitucion());
        fields += " REPC_FEC_CREACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRepcFecCreacion());
        fields += " REPC_COMENTARIO = ?, ";
        values.add(this.getRepcComentario());
        fields += " REPC_COMENTARIO1 = ?, ";
        values.add(this.getRepcComentario1());
        fields += " REPC_ST_F_REPCOMUN = ?, ";
        values.add(this.getRepcStFRepcomun());
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
        String sql = "INSERT INTO F_REPCOMUN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REPC_ID_REP_COMUN";
        fieldValues += ", ?";
        values.add(this.getRepcIdRepComun());

        fields += ", REPC_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getRepcInstitucion());

        fields += ", REPC_FEC_CREACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRepcFecCreacion());

        fields += ", REPC_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getRepcComentario());

        fields += ", REPC_COMENTARIO1";
        fieldValues += ", ?";
        values.add(this.getRepcComentario1());

        fields += ", REPC_ST_F_REPCOMUN";
        fieldValues += ", ?";
        values.add(this.getRepcStFRepcomun());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REPCOMUN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REPC_ID_REP_COMUN = ?";
        values.add(this.getRepcIdRepComun());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepcomun instance = (FRepcomun) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRepcIdRepComun().equals(instance.getRepcIdRepComun()))
            equalObjects = false;
        if (equalObjects && !this.getRepcInstitucion().equals(instance.getRepcInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getRepcFecCreacion().equals(instance.getRepcFecCreacion()))
            equalObjects = false;
        if (equalObjects && !this.getRepcComentario().equals(instance.getRepcComentario()))
            equalObjects = false;
        if (equalObjects && !this.getRepcComentario1().equals(instance.getRepcComentario1()))
            equalObjects = false;
        if (equalObjects && !this.getRepcStFRepcomun().equals(instance.getRepcStFRepcomun()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepcomun result = new FRepcomun();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRepcIdRepComun((BigDecimal) objectData.getData("REPC_ID_REP_COMUN"));
        result.setRepcInstitucion((String) objectData.getData("REPC_INSTITUCION"));
        result.setRepcFecCreacion((String) objectData.getData("REPC_FEC_CREACION"));
        result.setRepcComentario((String) objectData.getData("REPC_COMENTARIO"));
        result.setRepcComentario1((String) objectData.getData("REPC_COMENTARIO1"));
        result.setRepcStFRepcomun((String) objectData.getData("REPC_ST_F_REPCOMUN"));

        return result;

    }

}
