package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMISOR_PK", columns = { "ESOR_ID_EMSISOR" }, sequences = { "MAX" })
public class FEmisor extends DomainObject {

    BigDecimal esorIdEmsisor = null;
    String esorNombre = null;
    String esorTipoEmisor = null;
    String esorFecCreacion = null;
    String esorComentario = null;
    String esorComentario1 = null;
    String esorStFEmifisos = null;
    String esorEmisor = null;

    public FEmisor() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsorIdEmsisor(BigDecimal esorIdEmsisor) {
        this.esorIdEmsisor = esorIdEmsisor;
    }

    public BigDecimal getEsorIdEmsisor() {
        return this.esorIdEmsisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEsorNombre(String esorNombre) {
        this.esorNombre = esorNombre;
    }

    public String getEsorNombre() {
        return this.esorNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEsorTipoEmisor(String esorTipoEmisor) {
        this.esorTipoEmisor = esorTipoEmisor;
    }

    public String getEsorTipoEmisor() {
        return this.esorTipoEmisor;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEsorFecCreacion(String esorFecCreacion) {
        this.esorFecCreacion = esorFecCreacion;
    }

    public String getEsorFecCreacion() {
        return this.esorFecCreacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEsorComentario(String esorComentario) {
        this.esorComentario = esorComentario;
    }

    public String getEsorComentario() {
        return this.esorComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEsorComentario1(String esorComentario1) {
        this.esorComentario1 = esorComentario1;
    }

    public String getEsorComentario1() {
        return this.esorComentario1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEsorStFEmifisos(String esorStFEmifisos) {
        this.esorStFEmifisos = esorStFEmifisos;
    }

    public String getEsorStFEmifisos() {
        return this.esorStFEmifisos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEsorEmisor(String esorEmisor) {
        this.esorEmisor = esorEmisor;
    }

    public String getEsorEmisor() {
        return this.esorEmisor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMISOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEsorIdEmsisor() != null && this.getEsorIdEmsisor().longValue() == -999) {
            conditions += " AND ESOR_ID_EMSISOR IS NULL";
        } else if (this.getEsorIdEmsisor() != null) {
            conditions += " AND ESOR_ID_EMSISOR = ?";
            values.add(this.getEsorIdEmsisor());
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
        String sql = "SELECT * FROM F_EMISOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEsorIdEmsisor() != null && this.getEsorIdEmsisor().longValue() == -999) {
            conditions += " AND ESOR_ID_EMSISOR IS NULL";
        } else if (this.getEsorIdEmsisor() != null) {
            conditions += " AND ESOR_ID_EMSISOR = ?";
            values.add(this.getEsorIdEmsisor());
        }

        if (this.getEsorNombre() != null && "null".equals(this.getEsorNombre())) {
            conditions += " AND ESOR_NOMBRE IS NULL";
        } else if (this.getEsorNombre() != null) {
            conditions += " AND ESOR_NOMBRE = ?";
            values.add(this.getEsorNombre());
        }

        if (this.getEsorTipoEmisor() != null && "null".equals(this.getEsorTipoEmisor())) {
            conditions += " AND ESOR_TIPO_EMISOR IS NULL";
        } else if (this.getEsorTipoEmisor() != null) {
            conditions += " AND ESOR_TIPO_EMISOR = ?";
            values.add(this.getEsorTipoEmisor());
        }

        if (this.getEsorFecCreacion() != null && "null".equals(this.getEsorFecCreacion())) {
            conditions += " AND ESOR_FEC_CREACION IS NULL";
        } else if (this.getEsorFecCreacion() != null) {
            conditions += " AND ESOR_FEC_CREACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEsorFecCreacion());
        }

        if (this.getEsorComentario() != null && "null".equals(this.getEsorComentario())) {
            conditions += " AND ESOR_COMENTARIO IS NULL";
        } else if (this.getEsorComentario() != null) {
            conditions += " AND ESOR_COMENTARIO = ?";
            values.add(this.getEsorComentario());
        }

        if (this.getEsorComentario1() != null && "null".equals(this.getEsorComentario1())) {
            conditions += " AND ESOR_COMENTARIO1 IS NULL";
        } else if (this.getEsorComentario1() != null) {
            conditions += " AND ESOR_COMENTARIO1 = ?";
            values.add(this.getEsorComentario1());
        }

        if (this.getEsorStFEmifisos() != null && "null".equals(this.getEsorStFEmifisos())) {
            conditions += " AND ESOR_ST_F_EMIFISOS IS NULL";
        } else if (this.getEsorStFEmifisos() != null) {
            conditions += " AND ESOR_ST_F_EMIFISOS = ?";
            values.add(this.getEsorStFEmifisos());
        }

        if (this.getEsorEmisor() != null && "null".equals(this.getEsorEmisor())) {
            conditions += " AND ESOR_EMISOR IS NULL";
        } else if (this.getEsorEmisor() != null) {
            conditions += " AND ESOR_EMISOR = ?";
            values.add(this.getEsorEmisor());
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
        String sql = "UPDATE F_EMISOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESOR_ID_EMSISOR = ?";
        pkValues.add(this.getEsorIdEmsisor());
        fields += " ESOR_NOMBRE = ?, ";
        values.add(this.getEsorNombre());
        fields += " ESOR_TIPO_EMISOR = ?, ";
        values.add(this.getEsorTipoEmisor());
        fields += " ESOR_FEC_CREACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEsorFecCreacion());
        fields += " ESOR_COMENTARIO = ?, ";
        values.add(this.getEsorComentario());
        fields += " ESOR_COMENTARIO1 = ?, ";
        values.add(this.getEsorComentario1());
        fields += " ESOR_ST_F_EMIFISOS = ?, ";
        values.add(this.getEsorStFEmifisos());
        fields += " ESOR_EMISOR = ?, ";
        values.add(this.getEsorEmisor());
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
        String sql = "INSERT INTO F_EMISOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESOR_ID_EMSISOR";
        fieldValues += ", ?";
        values.add(this.getEsorIdEmsisor());

        fields += ", ESOR_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getEsorNombre());

        fields += ", ESOR_TIPO_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEsorTipoEmisor());

        fields += ", ESOR_FEC_CREACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEsorFecCreacion());

        fields += ", ESOR_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getEsorComentario());

        fields += ", ESOR_COMENTARIO1";
        fieldValues += ", ?";
        values.add(this.getEsorComentario1());

        fields += ", ESOR_ST_F_EMIFISOS";
        fieldValues += ", ?";
        values.add(this.getEsorStFEmifisos());

        fields += ", ESOR_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEsorEmisor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMISOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESOR_ID_EMSISOR = ?";
        values.add(this.getEsorIdEmsisor());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmisor instance = (FEmisor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEsorIdEmsisor().equals(instance.getEsorIdEmsisor()))
            equalObjects = false;
        if (equalObjects && !this.getEsorNombre().equals(instance.getEsorNombre()))
            equalObjects = false;
        if (equalObjects && !this.getEsorTipoEmisor().equals(instance.getEsorTipoEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEsorFecCreacion().equals(instance.getEsorFecCreacion()))
            equalObjects = false;
        if (equalObjects && !this.getEsorComentario().equals(instance.getEsorComentario()))
            equalObjects = false;
        if (equalObjects && !this.getEsorComentario1().equals(instance.getEsorComentario1()))
            equalObjects = false;
        if (equalObjects && !this.getEsorStFEmifisos().equals(instance.getEsorStFEmifisos()))
            equalObjects = false;
        if (equalObjects && !this.getEsorEmisor().equals(instance.getEsorEmisor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmisor result = new FEmisor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEsorIdEmsisor((BigDecimal) objectData.getData("ESOR_ID_EMSISOR"));
        result.setEsorNombre((String) objectData.getData("ESOR_NOMBRE"));
        result.setEsorTipoEmisor((String) objectData.getData("ESOR_TIPO_EMISOR"));
        result.setEsorFecCreacion((String) objectData.getData("ESOR_FEC_CREACION"));
        result.setEsorComentario((String) objectData.getData("ESOR_COMENTARIO"));
        result.setEsorComentario1((String) objectData.getData("ESOR_COMENTARIO1"));
        result.setEsorStFEmifisos((String) objectData.getData("ESOR_ST_F_EMIFISOS"));
        result.setEsorEmisor((String) objectData.getData("ESOR_EMISOR"));

        return result;

    }

}
