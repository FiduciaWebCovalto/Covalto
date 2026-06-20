package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CRC_PK", columns = { "CRC_NUM_USUARIO", "CRC_NUM_CALENDA", "CRC_ID_PREGUNTA", "CRC_ID_SUBPREGUNTA", "CRC_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Crc extends DomainObject {

    BigDecimal crcNumUsuario = null;
    BigDecimal crcNumCalenda = null;
    BigDecimal crcIdPregunta = null;
    BigDecimal crcNumContrato = null;
    BigDecimal crcIdSubpregunta = null;
    BigDecimal crcEvaluacion = null;
    String crcComentarios = null;
    BigDecimal crcAnoAltaReg = null;
    BigDecimal crcMesAltaReg = null;
    BigDecimal crcDiaAltaReg = null;
    BigDecimal crcAnoUltMod = null;
    BigDecimal crcMesUltMod = null;
    BigDecimal crcDiaUltMod = null;

    public Crc() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrcNumUsuario(BigDecimal crcNumUsuario) {
        this.crcNumUsuario = crcNumUsuario;
    }

    public BigDecimal getCrcNumUsuario() {
        return this.crcNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrcNumCalenda(BigDecimal crcNumCalenda) {
        this.crcNumCalenda = crcNumCalenda;
    }

    public BigDecimal getCrcNumCalenda() {
        return this.crcNumCalenda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrcIdPregunta(BigDecimal crcIdPregunta) {
        this.crcIdPregunta = crcIdPregunta;
    }

    public BigDecimal getCrcIdPregunta() {
        return this.crcIdPregunta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrcNumContrato(BigDecimal crcNumContrato) {
        this.crcNumContrato = crcNumContrato;
    }

    public BigDecimal getCrcNumContrato() {
        return this.crcNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrcIdSubpregunta(BigDecimal crcIdSubpregunta) {
        this.crcIdSubpregunta = crcIdSubpregunta;
    }

    public BigDecimal getCrcIdSubpregunta() {
        return this.crcIdSubpregunta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrcEvaluacion(BigDecimal crcEvaluacion) {
        this.crcEvaluacion = crcEvaluacion;
    }

    public BigDecimal getCrcEvaluacion() {
        return this.crcEvaluacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrcComentarios(String crcComentarios) {
        this.crcComentarios = crcComentarios;
    }

    public String getCrcComentarios() {
        return this.crcComentarios;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCrcAnoAltaReg(BigDecimal crcAnoAltaReg) {
        this.crcAnoAltaReg = crcAnoAltaReg;
    }

    public BigDecimal getCrcAnoAltaReg() {
        return this.crcAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrcMesAltaReg(BigDecimal crcMesAltaReg) {
        this.crcMesAltaReg = crcMesAltaReg;
    }

    public BigDecimal getCrcMesAltaReg() {
        return this.crcMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrcDiaAltaReg(BigDecimal crcDiaAltaReg) {
        this.crcDiaAltaReg = crcDiaAltaReg;
    }

    public BigDecimal getCrcDiaAltaReg() {
        return this.crcDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCrcAnoUltMod(BigDecimal crcAnoUltMod) {
        this.crcAnoUltMod = crcAnoUltMod;
    }

    public BigDecimal getCrcAnoUltMod() {
        return this.crcAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrcMesUltMod(BigDecimal crcMesUltMod) {
        this.crcMesUltMod = crcMesUltMod;
    }

    public BigDecimal getCrcMesUltMod() {
        return this.crcMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrcDiaUltMod(BigDecimal crcDiaUltMod) {
        this.crcDiaUltMod = crcDiaUltMod;
    }

    public BigDecimal getCrcDiaUltMod() {
        return this.crcDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CRC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrcNumUsuario() != null && this.getCrcNumUsuario().longValue() == -999) {
            conditions += " AND CRC_NUM_USUARIO IS NULL";
        } else if (this.getCrcNumUsuario() != null) {
            conditions += " AND CRC_NUM_USUARIO = ?";
            values.add(this.getCrcNumUsuario());
        }

        if (this.getCrcNumCalenda() != null && this.getCrcNumCalenda().longValue() == -999) {
            conditions += " AND CRC_NUM_CALENDA IS NULL";
        } else if (this.getCrcNumCalenda() != null) {
            conditions += " AND CRC_NUM_CALENDA = ?";
            values.add(this.getCrcNumCalenda());
        }

        if (this.getCrcIdPregunta() != null && this.getCrcIdPregunta().longValue() == -999) {
            conditions += " AND CRC_ID_PREGUNTA IS NULL";
        } else if (this.getCrcIdPregunta() != null) {
            conditions += " AND CRC_ID_PREGUNTA = ?";
            values.add(this.getCrcIdPregunta());
        }

        if (this.getCrcNumContrato() != null && this.getCrcNumContrato().longValue() == -999) {
            conditions += " AND CRC_NUM_CONTRATO IS NULL";
        } else if (this.getCrcNumContrato() != null) {
            conditions += " AND CRC_NUM_CONTRATO = ?";
            values.add(this.getCrcNumContrato());
        }

        if (this.getCrcIdSubpregunta() != null && this.getCrcIdSubpregunta().longValue() == -999) {
            conditions += " AND CRC_ID_SUBPREGUNTA IS NULL";
        } else if (this.getCrcIdSubpregunta() != null) {
            conditions += " AND CRC_ID_SUBPREGUNTA = ?";
            values.add(this.getCrcIdSubpregunta());
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
        String sql = "SELECT * FROM CRC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrcNumUsuario() != null && this.getCrcNumUsuario().longValue() == -999) {
            conditions += " AND CRC_NUM_USUARIO IS NULL";
        } else if (this.getCrcNumUsuario() != null) {
            conditions += " AND CRC_NUM_USUARIO = ?";
            values.add(this.getCrcNumUsuario());
        }

        if (this.getCrcNumCalenda() != null && this.getCrcNumCalenda().longValue() == -999) {
            conditions += " AND CRC_NUM_CALENDA IS NULL";
        } else if (this.getCrcNumCalenda() != null) {
            conditions += " AND CRC_NUM_CALENDA = ?";
            values.add(this.getCrcNumCalenda());
        }

        if (this.getCrcIdPregunta() != null && this.getCrcIdPregunta().longValue() == -999) {
            conditions += " AND CRC_ID_PREGUNTA IS NULL";
        } else if (this.getCrcIdPregunta() != null) {
            conditions += " AND CRC_ID_PREGUNTA = ?";
            values.add(this.getCrcIdPregunta());
        }

        if (this.getCrcNumContrato() != null && this.getCrcNumContrato().longValue() == -999) {
            conditions += " AND CRC_NUM_CONTRATO IS NULL";
        } else if (this.getCrcNumContrato() != null) {
            conditions += " AND CRC_NUM_CONTRATO = ?";
            values.add(this.getCrcNumContrato());
        }

        if (this.getCrcIdSubpregunta() != null && this.getCrcIdSubpregunta().longValue() == -999) {
            conditions += " AND CRC_ID_SUBPREGUNTA IS NULL";
        } else if (this.getCrcIdSubpregunta() != null) {
            conditions += " AND CRC_ID_SUBPREGUNTA = ?";
            values.add(this.getCrcIdSubpregunta());
        }

        if (this.getCrcEvaluacion() != null && this.getCrcEvaluacion().longValue() == -999) {
            conditions += " AND CRC_EVALUACION IS NULL";
        } else if (this.getCrcEvaluacion() != null) {
            conditions += " AND CRC_EVALUACION = ?";
            values.add(this.getCrcEvaluacion());
        }

        if (this.getCrcComentarios() != null && "null".equals(this.getCrcComentarios())) {
            conditions += " AND CRC_COMENTARIOS IS NULL";
        } else if (this.getCrcComentarios() != null) {
            conditions += " AND CRC_COMENTARIOS = ?";
            values.add(this.getCrcComentarios());
        }

        if (this.getCrcAnoAltaReg() != null && this.getCrcAnoAltaReg().longValue() == -999) {
            conditions += " AND CRC_ANO_ALTA_REG IS NULL";
        } else if (this.getCrcAnoAltaReg() != null) {
            conditions += " AND CRC_ANO_ALTA_REG = ?";
            values.add(this.getCrcAnoAltaReg());
        }

        if (this.getCrcMesAltaReg() != null && this.getCrcMesAltaReg().longValue() == -999) {
            conditions += " AND CRC_MES_ALTA_REG IS NULL";
        } else if (this.getCrcMesAltaReg() != null) {
            conditions += " AND CRC_MES_ALTA_REG = ?";
            values.add(this.getCrcMesAltaReg());
        }

        if (this.getCrcDiaAltaReg() != null && this.getCrcDiaAltaReg().longValue() == -999) {
            conditions += " AND CRC_DIA_ALTA_REG IS NULL";
        } else if (this.getCrcDiaAltaReg() != null) {
            conditions += " AND CRC_DIA_ALTA_REG = ?";
            values.add(this.getCrcDiaAltaReg());
        }

        if (this.getCrcAnoUltMod() != null && this.getCrcAnoUltMod().longValue() == -999) {
            conditions += " AND CRC_ANO_ULT_MOD IS NULL";
        } else if (this.getCrcAnoUltMod() != null) {
            conditions += " AND CRC_ANO_ULT_MOD = ?";
            values.add(this.getCrcAnoUltMod());
        }

        if (this.getCrcMesUltMod() != null && this.getCrcMesUltMod().longValue() == -999) {
            conditions += " AND CRC_MES_ULT_MOD IS NULL";
        } else if (this.getCrcMesUltMod() != null) {
            conditions += " AND CRC_MES_ULT_MOD = ?";
            values.add(this.getCrcMesUltMod());
        }

        if (this.getCrcDiaUltMod() != null && this.getCrcDiaUltMod().longValue() == -999) {
            conditions += " AND CRC_DIA_ULT_MOD IS NULL";
        } else if (this.getCrcDiaUltMod() != null) {
            conditions += " AND CRC_DIA_ULT_MOD = ?";
            values.add(this.getCrcDiaUltMod());
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
        String sql = "UPDATE CRC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CRC_NUM_USUARIO = ?";
        pkValues.add(this.getCrcNumUsuario());
        conditions += " AND CRC_NUM_CALENDA = ?";
        pkValues.add(this.getCrcNumCalenda());
        conditions += " AND CRC_ID_PREGUNTA = ?";
        pkValues.add(this.getCrcIdPregunta());
        conditions += " AND CRC_NUM_CONTRATO = ?";
        pkValues.add(this.getCrcNumContrato());
        conditions += " AND CRC_ID_SUBPREGUNTA = ?";
        pkValues.add(this.getCrcIdSubpregunta());
        fields += " CRC_EVALUACION = ?, ";
        values.add(this.getCrcEvaluacion());
        fields += " CRC_COMENTARIOS = ?, ";
        values.add(this.getCrcComentarios());
        fields += " CRC_ANO_ALTA_REG = ?, ";
        values.add(this.getCrcAnoAltaReg());
        fields += " CRC_MES_ALTA_REG = ?, ";
        values.add(this.getCrcMesAltaReg());
        fields += " CRC_DIA_ALTA_REG = ?, ";
        values.add(this.getCrcDiaAltaReg());
        fields += " CRC_ANO_ULT_MOD = ?, ";
        values.add(this.getCrcAnoUltMod());
        fields += " CRC_MES_ULT_MOD = ?, ";
        values.add(this.getCrcMesUltMod());
        fields += " CRC_DIA_ULT_MOD = ?, ";
        values.add(this.getCrcDiaUltMod());
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
        String sql = "INSERT INTO CRC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CRC_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getCrcNumUsuario());

        fields += ", CRC_NUM_CALENDA";
        fieldValues += ", ?";
        values.add(this.getCrcNumCalenda());

        fields += ", CRC_ID_PREGUNTA";
        fieldValues += ", ?";
        values.add(this.getCrcIdPregunta());

        fields += ", CRC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCrcNumContrato());

        fields += ", CRC_ID_SUBPREGUNTA";
        fieldValues += ", ?";
        values.add(this.getCrcIdSubpregunta());

        fields += ", CRC_EVALUACION";
        fieldValues += ", ?";
        values.add(this.getCrcEvaluacion());

        fields += ", CRC_COMENTARIOS";
        fieldValues += ", ?";
        values.add(this.getCrcComentarios());

        fields += ", CRC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCrcAnoAltaReg());

        fields += ", CRC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCrcMesAltaReg());

        fields += ", CRC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCrcDiaAltaReg());

        fields += ", CRC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrcAnoUltMod());

        fields += ", CRC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrcMesUltMod());

        fields += ", CRC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrcDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CRC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CRC_NUM_USUARIO = ?";
        values.add(this.getCrcNumUsuario());
        conditions += " AND CRC_NUM_CALENDA = ?";
        values.add(this.getCrcNumCalenda());
        conditions += " AND CRC_ID_PREGUNTA = ?";
        values.add(this.getCrcIdPregunta());
        conditions += " AND CRC_NUM_CONTRATO = ?";
        values.add(this.getCrcNumContrato());
        conditions += " AND CRC_ID_SUBPREGUNTA = ?";
        values.add(this.getCrcIdSubpregunta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Crc instance = (Crc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCrcNumUsuario().equals(instance.getCrcNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getCrcNumCalenda().equals(instance.getCrcNumCalenda()))
            equalObjects = false;
        if (equalObjects && !this.getCrcIdPregunta().equals(instance.getCrcIdPregunta()))
            equalObjects = false;
        if (equalObjects && !this.getCrcNumContrato().equals(instance.getCrcNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCrcIdSubpregunta().equals(instance.getCrcIdSubpregunta()))
            equalObjects = false;
        if (equalObjects && !this.getCrcEvaluacion().equals(instance.getCrcEvaluacion()))
            equalObjects = false;
        if (equalObjects && !this.getCrcComentarios().equals(instance.getCrcComentarios()))
            equalObjects = false;
        if (equalObjects && !this.getCrcAnoAltaReg().equals(instance.getCrcAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrcMesAltaReg().equals(instance.getCrcMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrcDiaAltaReg().equals(instance.getCrcDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrcAnoUltMod().equals(instance.getCrcAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCrcMesUltMod().equals(instance.getCrcMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCrcDiaUltMod().equals(instance.getCrcDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Crc result = new Crc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCrcNumUsuario((BigDecimal) objectData.getData("CRC_NUM_USUARIO"));
        result.setCrcNumCalenda((BigDecimal) objectData.getData("CRC_NUM_CALENDA"));
        result.setCrcIdPregunta((BigDecimal) objectData.getData("CRC_ID_PREGUNTA"));
        result.setCrcNumContrato((BigDecimal) objectData.getData("CRC_NUM_CONTRATO"));
        result.setCrcIdSubpregunta((BigDecimal) objectData.getData("CRC_ID_SUBPREGUNTA"));
        result.setCrcEvaluacion((BigDecimal) objectData.getData("CRC_EVALUACION"));
        result.setCrcComentarios((String) objectData.getData("CRC_COMENTARIOS"));
        result.setCrcAnoAltaReg((BigDecimal) objectData.getData("CRC_ANO_ALTA_REG"));
        result.setCrcMesAltaReg((BigDecimal) objectData.getData("CRC_MES_ALTA_REG"));
        result.setCrcDiaAltaReg((BigDecimal) objectData.getData("CRC_DIA_ALTA_REG"));
        result.setCrcAnoUltMod((BigDecimal) objectData.getData("CRC_ANO_ULT_MOD"));
        result.setCrcMesUltMod((BigDecimal) objectData.getData("CRC_MES_ULT_MOD"));
        result.setCrcDiaUltMod((BigDecimal) objectData.getData("CRC_DIA_ULT_MOD"));

        return result;

    }

}
