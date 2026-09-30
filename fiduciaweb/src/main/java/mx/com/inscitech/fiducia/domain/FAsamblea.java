package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ASAMBLEA_PK", columns = { "EASA_ID_PROGRAMA", "EASA_ID_FIDEICOMISO", "EASA_ID_EMISION", "EASA_ID_SEC_ASAMBLEA" }, sequences = { "MANUAL" })
public class FAsamblea extends DomainObject {

    BigDecimal easaIdPrograma = null;
    BigDecimal easaIdFideicomiso = null;
    BigDecimal easaIdEmision = null;
    BigDecimal easaIdSecAsamblea = null;
    String easaFecAsamblea = null;
    String easaHoraAsamblea = null;
    String easaLugarAsamblea = null;
    BigDecimal easaTitCirculacion = null;
    BigDecimal easaTitRepresentados = null;
    BigDecimal easaQuorum = null;
    BigDecimal easaConvocatoria = null;
    String easaActa = null;
    String easaAsamblea = null;
    String easaResolucion = null;
    String easaStAsamblea = null;

    public FAsamblea() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasaIdPrograma(BigDecimal easaIdPrograma) {
        this.easaIdPrograma = easaIdPrograma;
    }

    public BigDecimal getEasaIdPrograma() {
        return this.easaIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasaIdFideicomiso(BigDecimal easaIdFideicomiso) {
        this.easaIdFideicomiso = easaIdFideicomiso;
    }

    public BigDecimal getEasaIdFideicomiso() {
        return this.easaIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasaIdEmision(BigDecimal easaIdEmision) {
        this.easaIdEmision = easaIdEmision;
    }

    public BigDecimal getEasaIdEmision() {
        return this.easaIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasaIdSecAsamblea(BigDecimal easaIdSecAsamblea) {
        this.easaIdSecAsamblea = easaIdSecAsamblea;
    }

    public BigDecimal getEasaIdSecAsamblea() {
        return this.easaIdSecAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEasaFecAsamblea(String easaFecAsamblea) {
        this.easaFecAsamblea = easaFecAsamblea;
    }

    public String getEasaFecAsamblea() {
        return this.easaFecAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasaHoraAsamblea(String easaHoraAsamblea) {
        this.easaHoraAsamblea = easaHoraAsamblea;
    }

    public String getEasaHoraAsamblea() {
        return this.easaHoraAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasaLugarAsamblea(String easaLugarAsamblea) {
        this.easaLugarAsamblea = easaLugarAsamblea;
    }

    public String getEasaLugarAsamblea() {
        return this.easaLugarAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEasaTitCirculacion(BigDecimal easaTitCirculacion) {
        this.easaTitCirculacion = easaTitCirculacion;
    }

    public BigDecimal getEasaTitCirculacion() {
        return this.easaTitCirculacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEasaTitRepresentados(BigDecimal easaTitRepresentados) {
        this.easaTitRepresentados = easaTitRepresentados;
    }

    public BigDecimal getEasaTitRepresentados() {
        return this.easaTitRepresentados;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEasaQuorum(BigDecimal easaQuorum) {
        this.easaQuorum = easaQuorum;
    }

    public BigDecimal getEasaQuorum() {
        return this.easaQuorum;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEasaConvocatoria(BigDecimal easaConvocatoria) {
        this.easaConvocatoria = easaConvocatoria;
    }

    public BigDecimal getEasaConvocatoria() {
        return this.easaConvocatoria;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasaActa(String easaActa) {
        this.easaActa = easaActa;
    }

    public String getEasaActa() {
        return this.easaActa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasaAsamblea(String easaAsamblea) {
        this.easaAsamblea = easaAsamblea;
    }

    public String getEasaAsamblea() {
        return this.easaAsamblea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasaResolucion(String easaResolucion) {
        this.easaResolucion = easaResolucion;
    }

    public String getEasaResolucion() {
        return this.easaResolucion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasaStAsamblea(String easaStAsamblea) {
        this.easaStAsamblea = easaStAsamblea;
    }

    public String getEasaStAsamblea() {
        return this.easaStAsamblea;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ASAMBLEA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEasaIdPrograma() != null && this.getEasaIdPrograma().longValue() == -999) {
            conditions += " AND EASA_ID_PROGRAMA IS NULL";
        } else if (this.getEasaIdPrograma() != null) {
            conditions += " AND EASA_ID_PROGRAMA = ?";
            values.add(this.getEasaIdPrograma());
        }

        if (this.getEasaIdFideicomiso() != null && this.getEasaIdFideicomiso().longValue() == -999) {
            conditions += " AND EASA_ID_FIDEICOMISO IS NULL";
        } else if (this.getEasaIdFideicomiso() != null) {
            conditions += " AND EASA_ID_FIDEICOMISO = ?";
            values.add(this.getEasaIdFideicomiso());
        }

        if (this.getEasaIdEmision() != null && this.getEasaIdEmision().longValue() == -999) {
            conditions += " AND EASA_ID_EMISION IS NULL";
        } else if (this.getEasaIdEmision() != null) {
            conditions += " AND EASA_ID_EMISION = ?";
            values.add(this.getEasaIdEmision());
        }

        if (this.getEasaIdSecAsamblea() != null && this.getEasaIdSecAsamblea().longValue() == -999) {
            conditions += " AND EASA_ID_SEC_ASAMBLEA IS NULL";
        } else if (this.getEasaIdSecAsamblea() != null) {
            conditions += " AND EASA_ID_SEC_ASAMBLEA = ?";
            values.add(this.getEasaIdSecAsamblea());
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
        String sql = "SELECT * FROM F_ASAMBLEA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEasaIdPrograma() != null && this.getEasaIdPrograma().longValue() == -999) {
            conditions += " AND EASA_ID_PROGRAMA IS NULL";
        } else if (this.getEasaIdPrograma() != null) {
            conditions += " AND EASA_ID_PROGRAMA = ?";
            values.add(this.getEasaIdPrograma());
        }

        if (this.getEasaIdFideicomiso() != null && this.getEasaIdFideicomiso().longValue() == -999) {
            conditions += " AND EASA_ID_FIDEICOMISO IS NULL";
        } else if (this.getEasaIdFideicomiso() != null) {
            conditions += " AND EASA_ID_FIDEICOMISO = ?";
            values.add(this.getEasaIdFideicomiso());
        }

        if (this.getEasaIdEmision() != null && this.getEasaIdEmision().longValue() == -999) {
            conditions += " AND EASA_ID_EMISION IS NULL";
        } else if (this.getEasaIdEmision() != null) {
            conditions += " AND EASA_ID_EMISION = ?";
            values.add(this.getEasaIdEmision());
        }

        if (this.getEasaIdSecAsamblea() != null && this.getEasaIdSecAsamblea().longValue() == -999) {
            conditions += " AND EASA_ID_SEC_ASAMBLEA IS NULL";
        } else if (this.getEasaIdSecAsamblea() != null) {
            conditions += " AND EASA_ID_SEC_ASAMBLEA = ?";
            values.add(this.getEasaIdSecAsamblea());
        }

        if (this.getEasaFecAsamblea() != null && "null".equals(this.getEasaFecAsamblea())) {
            conditions += " AND EASA_FEC_ASAMBLEA IS NULL";
        } else if (this.getEasaFecAsamblea() != null) {
            conditions += " AND EASA_FEC_ASAMBLEA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEasaFecAsamblea());
        }

        if (this.getEasaHoraAsamblea() != null && "null".equals(this.getEasaHoraAsamblea())) {
            conditions += " AND EASA_HORA_ASAMBLEA IS NULL";
        } else if (this.getEasaHoraAsamblea() != null) {
            conditions += " AND EASA_HORA_ASAMBLEA = ?";
            values.add(this.getEasaHoraAsamblea());
        }

        if (this.getEasaLugarAsamblea() != null && "null".equals(this.getEasaLugarAsamblea())) {
            conditions += " AND EASA_LUGAR_ASAMBLEA IS NULL";
        } else if (this.getEasaLugarAsamblea() != null) {
            conditions += " AND EASA_LUGAR_ASAMBLEA = ?";
            values.add(this.getEasaLugarAsamblea());
        }

        if (this.getEasaTitCirculacion() != null && this.getEasaTitCirculacion().longValue() == -999) {
            conditions += " AND EASA_TIT_CIRCULACION IS NULL";
        } else if (this.getEasaTitCirculacion() != null) {
            conditions += " AND EASA_TIT_CIRCULACION = ?";
            values.add(this.getEasaTitCirculacion());
        }

        if (this.getEasaTitRepresentados() != null && this.getEasaTitRepresentados().longValue() == -999) {
            conditions += " AND EASA_TIT_REPRESENTADOS IS NULL";
        } else if (this.getEasaTitRepresentados() != null) {
            conditions += " AND EASA_TIT_REPRESENTADOS = ?";
            values.add(this.getEasaTitRepresentados());
        }

        if (this.getEasaQuorum() != null && this.getEasaQuorum().longValue() == -999) {
            conditions += " AND EASA_QUORUM IS NULL";
        } else if (this.getEasaQuorum() != null) {
            conditions += " AND EASA_QUORUM = ?";
            values.add(this.getEasaQuorum());
        }

        if (this.getEasaConvocatoria() != null && this.getEasaConvocatoria().longValue() == -999) {
            conditions += " AND EASA_CONVOCATORIA IS NULL";
        } else if (this.getEasaConvocatoria() != null) {
            conditions += " AND EASA_CONVOCATORIA = ?";
            values.add(this.getEasaConvocatoria());
        }

        if (this.getEasaActa() != null && "null".equals(this.getEasaActa())) {
            conditions += " AND EASA_ACTA IS NULL";
        } else if (this.getEasaActa() != null) {
            conditions += " AND EASA_ACTA = ?";
            values.add(this.getEasaActa());
        }

        if (this.getEasaAsamblea() != null && "null".equals(this.getEasaAsamblea())) {
            conditions += " AND EASA_ASAMBLEA IS NULL";
        } else if (this.getEasaAsamblea() != null) {
            conditions += " AND EASA_ASAMBLEA = ?";
            values.add(this.getEasaAsamblea());
        }

        if (this.getEasaResolucion() != null && "null".equals(this.getEasaResolucion())) {
            conditions += " AND EASA_RESOLUCION IS NULL";
        } else if (this.getEasaResolucion() != null) {
            conditions += " AND EASA_RESOLUCION = ?";
            values.add(this.getEasaResolucion());
        }

        if (this.getEasaStAsamblea() != null && "null".equals(this.getEasaStAsamblea())) {
            conditions += " AND EASA_ST_ASAMBLEA IS NULL";
        } else if (this.getEasaStAsamblea() != null) {
            conditions += " AND EASA_ST_ASAMBLEA = ?";
            values.add(this.getEasaStAsamblea());
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
        String sql = "UPDATE F_ASAMBLEA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EASA_ID_PROGRAMA = ?";
        pkValues.add(this.getEasaIdPrograma());
        conditions += " AND EASA_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEasaIdFideicomiso());
        conditions += " AND EASA_ID_EMISION = ?";
        pkValues.add(this.getEasaIdEmision());
        conditions += " AND EASA_ID_SEC_ASAMBLEA = ?";
        pkValues.add(this.getEasaIdSecAsamblea());
        fields += " EASA_FEC_ASAMBLEA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEasaFecAsamblea());
        fields += " EASA_HORA_ASAMBLEA = ?, ";
        values.add(this.getEasaHoraAsamblea());
        fields += " EASA_LUGAR_ASAMBLEA = ?, ";
        values.add(this.getEasaLugarAsamblea());
        fields += " EASA_TIT_CIRCULACION = ?, ";
        values.add(this.getEasaTitCirculacion());
        fields += " EASA_TIT_REPRESENTADOS = ?, ";
        values.add(this.getEasaTitRepresentados());
        fields += " EASA_QUORUM = ?, ";
        values.add(this.getEasaQuorum());
        fields += " EASA_CONVOCATORIA = ?, ";
        values.add(this.getEasaConvocatoria());
        fields += " EASA_ACTA = ?, ";
        values.add(this.getEasaActa());
        fields += " EASA_ASAMBLEA = ?, ";
        values.add(this.getEasaAsamblea());
        fields += " EASA_RESOLUCION = ?, ";
        values.add(this.getEasaResolucion());
        fields += " EASA_ST_ASAMBLEA = ?, ";
        values.add(this.getEasaStAsamblea());
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
        String sql = "INSERT INTO F_ASAMBLEA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EASA_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEasaIdPrograma());

        fields += ", EASA_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEasaIdFideicomiso());

        fields += ", EASA_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEasaIdEmision());

        fields += ", EASA_ID_SEC_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getEasaIdSecAsamblea());

        fields += ", EASA_FEC_ASAMBLEA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEasaFecAsamblea());

        fields += ", EASA_HORA_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getEasaHoraAsamblea());

        fields += ", EASA_LUGAR_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getEasaLugarAsamblea());

        fields += ", EASA_TIT_CIRCULACION";
        fieldValues += ", ?";
        values.add(this.getEasaTitCirculacion());

        fields += ", EASA_TIT_REPRESENTADOS";
        fieldValues += ", ?";
        values.add(this.getEasaTitRepresentados());

        fields += ", EASA_QUORUM";
        fieldValues += ", ?";
        values.add(this.getEasaQuorum());

        fields += ", EASA_CONVOCATORIA";
        fieldValues += ", ?";
        values.add(this.getEasaConvocatoria());

        fields += ", EASA_ACTA";
        fieldValues += ", ?";
        values.add(this.getEasaActa());

        fields += ", EASA_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getEasaAsamblea());

        fields += ", EASA_RESOLUCION";
        fieldValues += ", ?";
        values.add(this.getEasaResolucion());

        fields += ", EASA_ST_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getEasaStAsamblea());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ASAMBLEA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EASA_ID_PROGRAMA = ?";
        values.add(this.getEasaIdPrograma());
        conditions += " AND EASA_ID_FIDEICOMISO = ?";
        values.add(this.getEasaIdFideicomiso());
        conditions += " AND EASA_ID_EMISION = ?";
        values.add(this.getEasaIdEmision());
        conditions += " AND EASA_ID_SEC_ASAMBLEA = ?";
        values.add(this.getEasaIdSecAsamblea());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAsamblea instance = (FAsamblea) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEasaIdPrograma().equals(instance.getEasaIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEasaIdFideicomiso().equals(instance.getEasaIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEasaIdEmision().equals(instance.getEasaIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEasaIdSecAsamblea().equals(instance.getEasaIdSecAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getEasaFecAsamblea().equals(instance.getEasaFecAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getEasaHoraAsamblea().equals(instance.getEasaHoraAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getEasaLugarAsamblea().equals(instance.getEasaLugarAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getEasaTitCirculacion().equals(instance.getEasaTitCirculacion()))
            equalObjects = false;
        if (equalObjects && !this.getEasaTitRepresentados().equals(instance.getEasaTitRepresentados()))
            equalObjects = false;
        if (equalObjects && !this.getEasaQuorum().equals(instance.getEasaQuorum()))
            equalObjects = false;
        if (equalObjects && !this.getEasaConvocatoria().equals(instance.getEasaConvocatoria()))
            equalObjects = false;
        if (equalObjects && !this.getEasaActa().equals(instance.getEasaActa()))
            equalObjects = false;
        if (equalObjects && !this.getEasaAsamblea().equals(instance.getEasaAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getEasaResolucion().equals(instance.getEasaResolucion()))
            equalObjects = false;
        if (equalObjects && !this.getEasaStAsamblea().equals(instance.getEasaStAsamblea()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAsamblea result = new FAsamblea();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEasaIdPrograma((BigDecimal) objectData.getData("EASA_ID_PROGRAMA"));
        result.setEasaIdFideicomiso((BigDecimal) objectData.getData("EASA_ID_FIDEICOMISO"));
        result.setEasaIdEmision((BigDecimal) objectData.getData("EASA_ID_EMISION"));
        result.setEasaIdSecAsamblea((BigDecimal) objectData.getData("EASA_ID_SEC_ASAMBLEA"));
        result.setEasaFecAsamblea((String) objectData.getData("EASA_FEC_ASAMBLEA"));
        result.setEasaHoraAsamblea((String) objectData.getData("EASA_HORA_ASAMBLEA"));
        result.setEasaLugarAsamblea((String) objectData.getData("EASA_LUGAR_ASAMBLEA"));
        result.setEasaTitCirculacion((BigDecimal) objectData.getData("EASA_TIT_CIRCULACION"));
        result.setEasaTitRepresentados((BigDecimal) objectData.getData("EASA_TIT_REPRESENTADOS"));
        result.setEasaQuorum((BigDecimal) objectData.getData("EASA_QUORUM"));
        result.setEasaConvocatoria((BigDecimal) objectData.getData("EASA_CONVOCATORIA"));
        result.setEasaActa((String) objectData.getData("EASA_ACTA"));
        result.setEasaAsamblea((String) objectData.getData("EASA_ASAMBLEA"));
        result.setEasaResolucion((String) objectData.getData("EASA_RESOLUCION"));
        result.setEasaStAsamblea((String) objectData.getData("EASA_ST_ASAMBLEA"));

        return result;

    }

}
