package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_AUTENVP_PK",
            columns = { "ENVP_ID_PROGRAMA", "ENVP_ID_FIDEICOMISO", "ENVP_ID_EMISION", "ENVP_ID_TIPO_AVISO", "ENVP_ID_NUM_POS", "ENVP_ID_SECUENCIAL" }, sequences = { "MANUAL" })
public class FAutenvp extends DomainObject {

    BigDecimal envpIdPrograma = null;
    BigDecimal envpIdFideicomiso = null;
    BigDecimal envpIdEmision = null;
    String envpIdTipoAviso = null;
    BigDecimal envpIdNumPos = null;
    BigDecimal envpIdSecuencial = null;
    String envpNomAut = null;
    String envpNombre = null;
    String envpPuesto = null;
    String envpDireccion = null;
    String envpStAutenvp = null;

    public FAutenvp() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvpIdPrograma(BigDecimal envpIdPrograma) {
        this.envpIdPrograma = envpIdPrograma;
    }

    public BigDecimal getEnvpIdPrograma() {
        return this.envpIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvpIdFideicomiso(BigDecimal envpIdFideicomiso) {
        this.envpIdFideicomiso = envpIdFideicomiso;
    }

    public BigDecimal getEnvpIdFideicomiso() {
        return this.envpIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvpIdEmision(BigDecimal envpIdEmision) {
        this.envpIdEmision = envpIdEmision;
    }

    public BigDecimal getEnvpIdEmision() {
        return this.envpIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvpIdTipoAviso(String envpIdTipoAviso) {
        this.envpIdTipoAviso = envpIdTipoAviso;
    }

    public String getEnvpIdTipoAviso() {
        return this.envpIdTipoAviso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setEnvpIdNumPos(BigDecimal envpIdNumPos) {
        this.envpIdNumPos = envpIdNumPos;
    }

    public BigDecimal getEnvpIdNumPos() {
        return this.envpIdNumPos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setEnvpIdSecuencial(BigDecimal envpIdSecuencial) {
        this.envpIdSecuencial = envpIdSecuencial;
    }

    public BigDecimal getEnvpIdSecuencial() {
        return this.envpIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvpNomAut(String envpNomAut) {
        this.envpNomAut = envpNomAut;
    }

    public String getEnvpNomAut() {
        return this.envpNomAut;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvpNombre(String envpNombre) {
        this.envpNombre = envpNombre;
    }

    public String getEnvpNombre() {
        return this.envpNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvpPuesto(String envpPuesto) {
        this.envpPuesto = envpPuesto;
    }

    public String getEnvpPuesto() {
        return this.envpPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvpDireccion(String envpDireccion) {
        this.envpDireccion = envpDireccion;
    }

    public String getEnvpDireccion() {
        return this.envpDireccion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvpStAutenvp(String envpStAutenvp) {
        this.envpStAutenvp = envpStAutenvp;
    }

    public String getEnvpStAutenvp() {
        return this.envpStAutenvp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_AUTENVP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEnvpIdPrograma() != null && this.getEnvpIdPrograma().longValue() == -999) {
            conditions += " AND ENVP_ID_PROGRAMA IS NULL";
        } else if (this.getEnvpIdPrograma() != null) {
            conditions += " AND ENVP_ID_PROGRAMA = ?";
            values.add(this.getEnvpIdPrograma());
        }

        if (this.getEnvpIdFideicomiso() != null && this.getEnvpIdFideicomiso().longValue() == -999) {
            conditions += " AND ENVP_ID_FIDEICOMISO IS NULL";
        } else if (this.getEnvpIdFideicomiso() != null) {
            conditions += " AND ENVP_ID_FIDEICOMISO = ?";
            values.add(this.getEnvpIdFideicomiso());
        }

        if (this.getEnvpIdEmision() != null && this.getEnvpIdEmision().longValue() == -999) {
            conditions += " AND ENVP_ID_EMISION IS NULL";
        } else if (this.getEnvpIdEmision() != null) {
            conditions += " AND ENVP_ID_EMISION = ?";
            values.add(this.getEnvpIdEmision());
        }

        if (this.getEnvpIdTipoAviso() != null && "null".equals(this.getEnvpIdTipoAviso())) {
            conditions += " AND ENVP_ID_TIPO_AVISO IS NULL";
        } else if (this.getEnvpIdTipoAviso() != null) {
            conditions += " AND ENVP_ID_TIPO_AVISO = ?";
            values.add(this.getEnvpIdTipoAviso());
        }

        if (this.getEnvpIdNumPos() != null && this.getEnvpIdNumPos().longValue() == -999) {
            conditions += " AND ENVP_ID_NUM_POS IS NULL";
        } else if (this.getEnvpIdNumPos() != null) {
            conditions += " AND ENVP_ID_NUM_POS = ?";
            values.add(this.getEnvpIdNumPos());
        }

        if (this.getEnvpIdSecuencial() != null && this.getEnvpIdSecuencial().longValue() == -999) {
            conditions += " AND ENVP_ID_SECUENCIAL IS NULL";
        } else if (this.getEnvpIdSecuencial() != null) {
            conditions += " AND ENVP_ID_SECUENCIAL = ?";
            values.add(this.getEnvpIdSecuencial());
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
        String sql = "SELECT * FROM F_AUTENVP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEnvpIdPrograma() != null && this.getEnvpIdPrograma().longValue() == -999) {
            conditions += " AND ENVP_ID_PROGRAMA IS NULL";
        } else if (this.getEnvpIdPrograma() != null) {
            conditions += " AND ENVP_ID_PROGRAMA = ?";
            values.add(this.getEnvpIdPrograma());
        }

        if (this.getEnvpIdFideicomiso() != null && this.getEnvpIdFideicomiso().longValue() == -999) {
            conditions += " AND ENVP_ID_FIDEICOMISO IS NULL";
        } else if (this.getEnvpIdFideicomiso() != null) {
            conditions += " AND ENVP_ID_FIDEICOMISO = ?";
            values.add(this.getEnvpIdFideicomiso());
        }

        if (this.getEnvpIdEmision() != null && this.getEnvpIdEmision().longValue() == -999) {
            conditions += " AND ENVP_ID_EMISION IS NULL";
        } else if (this.getEnvpIdEmision() != null) {
            conditions += " AND ENVP_ID_EMISION = ?";
            values.add(this.getEnvpIdEmision());
        }

        if (this.getEnvpIdTipoAviso() != null && "null".equals(this.getEnvpIdTipoAviso())) {
            conditions += " AND ENVP_ID_TIPO_AVISO IS NULL";
        } else if (this.getEnvpIdTipoAviso() != null) {
            conditions += " AND ENVP_ID_TIPO_AVISO = ?";
            values.add(this.getEnvpIdTipoAviso());
        }

        if (this.getEnvpIdNumPos() != null && this.getEnvpIdNumPos().longValue() == -999) {
            conditions += " AND ENVP_ID_NUM_POS IS NULL";
        } else if (this.getEnvpIdNumPos() != null) {
            conditions += " AND ENVP_ID_NUM_POS = ?";
            values.add(this.getEnvpIdNumPos());
        }

        if (this.getEnvpIdSecuencial() != null && this.getEnvpIdSecuencial().longValue() == -999) {
            conditions += " AND ENVP_ID_SECUENCIAL IS NULL";
        } else if (this.getEnvpIdSecuencial() != null) {
            conditions += " AND ENVP_ID_SECUENCIAL = ?";
            values.add(this.getEnvpIdSecuencial());
        }

        if (this.getEnvpNomAut() != null && "null".equals(this.getEnvpNomAut())) {
            conditions += " AND ENVP_NOM_AUT IS NULL";
        } else if (this.getEnvpNomAut() != null) {
            conditions += " AND ENVP_NOM_AUT = ?";
            values.add(this.getEnvpNomAut());
        }

        if (this.getEnvpNombre() != null && "null".equals(this.getEnvpNombre())) {
            conditions += " AND ENVP_NOMBRE IS NULL";
        } else if (this.getEnvpNombre() != null) {
            conditions += " AND ENVP_NOMBRE = ?";
            values.add(this.getEnvpNombre());
        }

        if (this.getEnvpPuesto() != null && "null".equals(this.getEnvpPuesto())) {
            conditions += " AND ENVP_PUESTO IS NULL";
        } else if (this.getEnvpPuesto() != null) {
            conditions += " AND ENVP_PUESTO = ?";
            values.add(this.getEnvpPuesto());
        }

        if (this.getEnvpDireccion() != null && "null".equals(this.getEnvpDireccion())) {
            conditions += " AND ENVP_DIRECCION IS NULL";
        } else if (this.getEnvpDireccion() != null) {
            conditions += " AND ENVP_DIRECCION = ?";
            values.add(this.getEnvpDireccion());
        }

        if (this.getEnvpStAutenvp() != null && "null".equals(this.getEnvpStAutenvp())) {
            conditions += " AND ENVP_ST_AUTENVP IS NULL";
        } else if (this.getEnvpStAutenvp() != null) {
            conditions += " AND ENVP_ST_AUTENVP = ?";
            values.add(this.getEnvpStAutenvp());
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
        String sql = "UPDATE F_AUTENVP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ENVP_ID_PROGRAMA = ?";
        pkValues.add(this.getEnvpIdPrograma());
        conditions += " AND ENVP_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEnvpIdFideicomiso());
        conditions += " AND ENVP_ID_EMISION = ?";
        pkValues.add(this.getEnvpIdEmision());
        conditions += " AND ENVP_ID_TIPO_AVISO = ?";
        pkValues.add(this.getEnvpIdTipoAviso());
        conditions += " AND ENVP_ID_NUM_POS = ?";
        pkValues.add(this.getEnvpIdNumPos());
        conditions += " AND ENVP_ID_SECUENCIAL = ?";
        pkValues.add(this.getEnvpIdSecuencial());
        fields += " ENVP_NOM_AUT = ?, ";
        values.add(this.getEnvpNomAut());
        fields += " ENVP_NOMBRE = ?, ";
        values.add(this.getEnvpNombre());
        fields += " ENVP_PUESTO = ?, ";
        values.add(this.getEnvpPuesto());
        fields += " ENVP_DIRECCION = ?, ";
        values.add(this.getEnvpDireccion());
        fields += " ENVP_ST_AUTENVP = ?, ";
        values.add(this.getEnvpStAutenvp());
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
        String sql = "INSERT INTO F_AUTENVP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ENVP_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEnvpIdPrograma());

        fields += ", ENVP_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEnvpIdFideicomiso());

        fields += ", ENVP_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEnvpIdEmision());

        fields += ", ENVP_ID_TIPO_AVISO";
        fieldValues += ", ?";
        values.add(this.getEnvpIdTipoAviso());

        fields += ", ENVP_ID_NUM_POS";
        fieldValues += ", ?";
        values.add(this.getEnvpIdNumPos());

        fields += ", ENVP_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getEnvpIdSecuencial());

        fields += ", ENVP_NOM_AUT";
        fieldValues += ", ?";
        values.add(this.getEnvpNomAut());

        fields += ", ENVP_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getEnvpNombre());

        fields += ", ENVP_PUESTO";
        fieldValues += ", ?";
        values.add(this.getEnvpPuesto());

        fields += ", ENVP_DIRECCION";
        fieldValues += ", ?";
        values.add(this.getEnvpDireccion());

        fields += ", ENVP_ST_AUTENVP";
        fieldValues += ", ?";
        values.add(this.getEnvpStAutenvp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_AUTENVP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ENVP_ID_PROGRAMA = ?";
        values.add(this.getEnvpIdPrograma());
        conditions += " AND ENVP_ID_FIDEICOMISO = ?";
        values.add(this.getEnvpIdFideicomiso());
        conditions += " AND ENVP_ID_EMISION = ?";
        values.add(this.getEnvpIdEmision());
        conditions += " AND ENVP_ID_TIPO_AVISO = ?";
        values.add(this.getEnvpIdTipoAviso());
        conditions += " AND ENVP_ID_NUM_POS = ?";
        values.add(this.getEnvpIdNumPos());
        conditions += " AND ENVP_ID_SECUENCIAL = ?";
        values.add(this.getEnvpIdSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAutenvp instance = (FAutenvp) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEnvpIdPrograma().equals(instance.getEnvpIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpIdFideicomiso().equals(instance.getEnvpIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpIdEmision().equals(instance.getEnvpIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpIdTipoAviso().equals(instance.getEnvpIdTipoAviso()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpIdNumPos().equals(instance.getEnvpIdNumPos()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpIdSecuencial().equals(instance.getEnvpIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpNomAut().equals(instance.getEnvpNomAut()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpNombre().equals(instance.getEnvpNombre()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpPuesto().equals(instance.getEnvpPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpDireccion().equals(instance.getEnvpDireccion()))
            equalObjects = false;
        if (equalObjects && !this.getEnvpStAutenvp().equals(instance.getEnvpStAutenvp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAutenvp result = new FAutenvp();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEnvpIdPrograma((BigDecimal) objectData.getData("ENVP_ID_PROGRAMA"));
        result.setEnvpIdFideicomiso((BigDecimal) objectData.getData("ENVP_ID_FIDEICOMISO"));
        result.setEnvpIdEmision((BigDecimal) objectData.getData("ENVP_ID_EMISION"));
        result.setEnvpIdTipoAviso((String) objectData.getData("ENVP_ID_TIPO_AVISO"));
        result.setEnvpIdNumPos((BigDecimal) objectData.getData("ENVP_ID_NUM_POS"));
        result.setEnvpIdSecuencial((BigDecimal) objectData.getData("ENVP_ID_SECUENCIAL"));
        result.setEnvpNomAut((String) objectData.getData("ENVP_NOM_AUT"));
        result.setEnvpNombre((String) objectData.getData("ENVP_NOMBRE"));
        result.setEnvpPuesto((String) objectData.getData("ENVP_PUESTO"));
        result.setEnvpDireccion((String) objectData.getData("ENVP_DIRECCION"));
        result.setEnvpStAutenvp((String) objectData.getData("ENVP_ST_AUTENVP"));

        return result;

    }

}
