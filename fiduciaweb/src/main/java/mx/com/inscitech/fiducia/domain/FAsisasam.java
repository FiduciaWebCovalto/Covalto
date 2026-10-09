package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ASISASAM_PK", columns = { "EASI_ID_PROGRAMA", "EASI_ID_EMISION", "EASI_ID_SEC_ASAMBLEA", "EASI_ID_PARTICIPANTE" }, sequences = { "MANUAL" })
public class FAsisasam extends DomainObject {

    BigDecimal easiIdPrograma = null;
    BigDecimal easiIdFideicomiso = null;
    BigDecimal easiIdEmision = null;
    BigDecimal easiIdSecAsamblea = null;
    BigDecimal easiIdParticipante = null;
    String easiNomParticipante = null;
    String easiNomInstitucion = null;
    BigDecimal easiTitulosRepresenta = null;
    String easiStAsisasam = null;

    public FAsisasam() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasiIdPrograma(BigDecimal easiIdPrograma) {
        this.easiIdPrograma = easiIdPrograma;
    }

    public BigDecimal getEasiIdPrograma() {
        return this.easiIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasiIdFideicomiso(BigDecimal easiIdFideicomiso) {
        this.easiIdFideicomiso = easiIdFideicomiso;
    }

    public BigDecimal getEasiIdFideicomiso() {
        return this.easiIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasiIdEmision(BigDecimal easiIdEmision) {
        this.easiIdEmision = easiIdEmision;
    }

    public BigDecimal getEasiIdEmision() {
        return this.easiIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasiIdSecAsamblea(BigDecimal easiIdSecAsamblea) {
        this.easiIdSecAsamblea = easiIdSecAsamblea;
    }

    public BigDecimal getEasiIdSecAsamblea() {
        return this.easiIdSecAsamblea;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEasiIdParticipante(BigDecimal easiIdParticipante) {
        this.easiIdParticipante = easiIdParticipante;
    }

    public BigDecimal getEasiIdParticipante() {
        return this.easiIdParticipante;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasiNomParticipante(String easiNomParticipante) {
        this.easiNomParticipante = easiNomParticipante;
    }

    public String getEasiNomParticipante() {
        return this.easiNomParticipante;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasiNomInstitucion(String easiNomInstitucion) {
        this.easiNomInstitucion = easiNomInstitucion;
    }

    public String getEasiNomInstitucion() {
        return this.easiNomInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEasiTitulosRepresenta(BigDecimal easiTitulosRepresenta) {
        this.easiTitulosRepresenta = easiTitulosRepresenta;
    }

    public BigDecimal getEasiTitulosRepresenta() {
        return this.easiTitulosRepresenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEasiStAsisasam(String easiStAsisasam) {
        this.easiStAsisasam = easiStAsisasam;
    }

    public String getEasiStAsisasam() {
        return this.easiStAsisasam;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ASISASAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEasiIdPrograma() != null && this.getEasiIdPrograma().longValue() == -999) {
            conditions += " AND EASI_ID_PROGRAMA IS NULL";
        } else if (this.getEasiIdPrograma() != null) {
            conditions += " AND EASI_ID_PROGRAMA = ?";
            values.add(this.getEasiIdPrograma());
        }

        if (this.getEasiIdEmision() != null && this.getEasiIdEmision().longValue() == -999) {
            conditions += " AND EASI_ID_EMISION IS NULL";
        } else if (this.getEasiIdEmision() != null) {
            conditions += " AND EASI_ID_EMISION = ?";
            values.add(this.getEasiIdEmision());
        }

        if (this.getEasiIdSecAsamblea() != null && this.getEasiIdSecAsamblea().longValue() == -999) {
            conditions += " AND EASI_ID_SEC_ASAMBLEA IS NULL";
        } else if (this.getEasiIdSecAsamblea() != null) {
            conditions += " AND EASI_ID_SEC_ASAMBLEA = ?";
            values.add(this.getEasiIdSecAsamblea());
        }

        if (this.getEasiIdParticipante() != null && this.getEasiIdParticipante().longValue() == -999) {
            conditions += " AND EASI_ID_PARTICIPANTE IS NULL";
        } else if (this.getEasiIdParticipante() != null) {
            conditions += " AND EASI_ID_PARTICIPANTE = ?";
            values.add(this.getEasiIdParticipante());
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
        String sql = "SELECT * FROM F_ASISASAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEasiIdPrograma() != null && this.getEasiIdPrograma().longValue() == -999) {
            conditions += " AND EASI_ID_PROGRAMA IS NULL";
        } else if (this.getEasiIdPrograma() != null) {
            conditions += " AND EASI_ID_PROGRAMA = ?";
            values.add(this.getEasiIdPrograma());
        }

        if (this.getEasiIdFideicomiso() != null && this.getEasiIdFideicomiso().longValue() == -999) {
            conditions += " AND EASI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEasiIdFideicomiso() != null) {
            conditions += " AND EASI_ID_FIDEICOMISO = ?";
            values.add(this.getEasiIdFideicomiso());
        }

        if (this.getEasiIdEmision() != null && this.getEasiIdEmision().longValue() == -999) {
            conditions += " AND EASI_ID_EMISION IS NULL";
        } else if (this.getEasiIdEmision() != null) {
            conditions += " AND EASI_ID_EMISION = ?";
            values.add(this.getEasiIdEmision());
        }

        if (this.getEasiIdSecAsamblea() != null && this.getEasiIdSecAsamblea().longValue() == -999) {
            conditions += " AND EASI_ID_SEC_ASAMBLEA IS NULL";
        } else if (this.getEasiIdSecAsamblea() != null) {
            conditions += " AND EASI_ID_SEC_ASAMBLEA = ?";
            values.add(this.getEasiIdSecAsamblea());
        }

        if (this.getEasiIdParticipante() != null && this.getEasiIdParticipante().longValue() == -999) {
            conditions += " AND EASI_ID_PARTICIPANTE IS NULL";
        } else if (this.getEasiIdParticipante() != null) {
            conditions += " AND EASI_ID_PARTICIPANTE = ?";
            values.add(this.getEasiIdParticipante());
        }

        if (this.getEasiNomParticipante() != null && "null".equals(this.getEasiNomParticipante())) {
            conditions += " AND EASI_NOM_PARTICIPANTE IS NULL";
        } else if (this.getEasiNomParticipante() != null) {
            conditions += " AND EASI_NOM_PARTICIPANTE = ?";
            values.add(this.getEasiNomParticipante());
        }

        if (this.getEasiNomInstitucion() != null && "null".equals(this.getEasiNomInstitucion())) {
            conditions += " AND EASI_NOM_INSTITUCION IS NULL";
        } else if (this.getEasiNomInstitucion() != null) {
            conditions += " AND EASI_NOM_INSTITUCION = ?";
            values.add(this.getEasiNomInstitucion());
        }

        if (this.getEasiTitulosRepresenta() != null && this.getEasiTitulosRepresenta().longValue() == -999) {
            conditions += " AND EASI_TITULOS_REPRESENTA IS NULL";
        } else if (this.getEasiTitulosRepresenta() != null) {
            conditions += " AND EASI_TITULOS_REPRESENTA = ?";
            values.add(this.getEasiTitulosRepresenta());
        }

        if (this.getEasiStAsisasam() != null && "null".equals(this.getEasiStAsisasam())) {
            conditions += " AND EASI_ST_ASISASAM IS NULL";
        } else if (this.getEasiStAsisasam() != null) {
            conditions += " AND EASI_ST_ASISASAM = ?";
            values.add(this.getEasiStAsisasam());
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
        String sql = "UPDATE F_ASISASAM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EASI_ID_PROGRAMA = ?";
        pkValues.add(this.getEasiIdPrograma());
        fields += " EASI_ID_FIDEICOMISO = ?, ";
        values.add(this.getEasiIdFideicomiso());
        conditions += " AND EASI_ID_EMISION = ?";
        pkValues.add(this.getEasiIdEmision());
        conditions += " AND EASI_ID_SEC_ASAMBLEA = ?";
        pkValues.add(this.getEasiIdSecAsamblea());
        conditions += " AND EASI_ID_PARTICIPANTE = ?";
        pkValues.add(this.getEasiIdParticipante());
        fields += " EASI_NOM_PARTICIPANTE = ?, ";
        values.add(this.getEasiNomParticipante());
        fields += " EASI_NOM_INSTITUCION = ?, ";
        values.add(this.getEasiNomInstitucion());
        fields += " EASI_TITULOS_REPRESENTA = ?, ";
        values.add(this.getEasiTitulosRepresenta());
        fields += " EASI_ST_ASISASAM = ?, ";
        values.add(this.getEasiStAsisasam());
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
        String sql = "INSERT INTO F_ASISASAM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EASI_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEasiIdPrograma());

        fields += ", EASI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEasiIdFideicomiso());

        fields += ", EASI_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEasiIdEmision());

        fields += ", EASI_ID_SEC_ASAMBLEA";
        fieldValues += ", ?";
        values.add(this.getEasiIdSecAsamblea());

        fields += ", EASI_ID_PARTICIPANTE";
        fieldValues += ", ?";
        values.add(this.getEasiIdParticipante());

        fields += ", EASI_NOM_PARTICIPANTE";
        fieldValues += ", ?";
        values.add(this.getEasiNomParticipante());

        fields += ", EASI_NOM_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getEasiNomInstitucion());

        fields += ", EASI_TITULOS_REPRESENTA";
        fieldValues += ", ?";
        values.add(this.getEasiTitulosRepresenta());

        fields += ", EASI_ST_ASISASAM";
        fieldValues += ", ?";
        values.add(this.getEasiStAsisasam());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ASISASAM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EASI_ID_PROGRAMA = ?";
        values.add(this.getEasiIdPrograma());
        conditions += " AND EASI_ID_EMISION = ?";
        values.add(this.getEasiIdEmision());
        conditions += " AND EASI_ID_SEC_ASAMBLEA = ?";
        values.add(this.getEasiIdSecAsamblea());
        conditions += " AND EASI_ID_PARTICIPANTE = ?";
        values.add(this.getEasiIdParticipante());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAsisasam instance = (FAsisasam) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEasiIdPrograma().equals(instance.getEasiIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEasiIdFideicomiso().equals(instance.getEasiIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEasiIdEmision().equals(instance.getEasiIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEasiIdSecAsamblea().equals(instance.getEasiIdSecAsamblea()))
            equalObjects = false;
        if (equalObjects && !this.getEasiIdParticipante().equals(instance.getEasiIdParticipante()))
            equalObjects = false;
        if (equalObjects && !this.getEasiNomParticipante().equals(instance.getEasiNomParticipante()))
            equalObjects = false;
        if (equalObjects && !this.getEasiNomInstitucion().equals(instance.getEasiNomInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getEasiTitulosRepresenta().equals(instance.getEasiTitulosRepresenta()))
            equalObjects = false;
        if (equalObjects && !this.getEasiStAsisasam().equals(instance.getEasiStAsisasam()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAsisasam result = new FAsisasam();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEasiIdPrograma((BigDecimal) objectData.getData("EASI_ID_PROGRAMA"));
        result.setEasiIdFideicomiso((BigDecimal) objectData.getData("EASI_ID_FIDEICOMISO"));
        result.setEasiIdEmision((BigDecimal) objectData.getData("EASI_ID_EMISION"));
        result.setEasiIdSecAsamblea((BigDecimal) objectData.getData("EASI_ID_SEC_ASAMBLEA"));
        result.setEasiIdParticipante((BigDecimal) objectData.getData("EASI_ID_PARTICIPANTE"));
        result.setEasiNomParticipante((String) objectData.getData("EASI_NOM_PARTICIPANTE"));
        result.setEasiNomInstitucion((String) objectData.getData("EASI_NOM_INSTITUCION"));
        result.setEasiTitulosRepresenta((BigDecimal) objectData.getData("EASI_TITULOS_REPRESENTA"));
        result.setEasiStAsisasam((String) objectData.getData("EASI_ST_ASISASAM"));

        return result;

    }

}
