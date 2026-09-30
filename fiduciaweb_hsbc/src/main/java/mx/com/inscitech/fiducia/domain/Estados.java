package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESTADOS_PK", columns = { "EDO_NUM_ESTADO", "EDO_NUM_PAIS" }, sequences = { "MANUAL" })
public class Estados extends DomainObject {

    BigDecimal edoNumPais = null;
    BigDecimal edoNumEstado = null;
    String edoNomEstado = null;
    String edoAbrvEstado = null;
    BigDecimal edoHrDiferencia = null;
    BigDecimal edoMinDiferencia = null;
    BigDecimal edoAnoAltaReg = null;
    BigDecimal edoMesAltaReg = null;
    BigDecimal edoDiaAltaReg = null;
    BigDecimal edoAnoUltMod = null;
    BigDecimal edoMesUltMod = null;
    BigDecimal edoDiaUltMod = null;
    String edoCveStEstado = null;

    public Estados() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdoNumPais(BigDecimal edoNumPais) {
        this.edoNumPais = edoNumPais;
    }

    public BigDecimal getEdoNumPais() {
        return this.edoNumPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdoNumEstado(BigDecimal edoNumEstado) {
        this.edoNumEstado = edoNumEstado;
    }

    public BigDecimal getEdoNumEstado() {
        return this.edoNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdoNomEstado(String edoNomEstado) {
        this.edoNomEstado = edoNomEstado;
    }

    public String getEdoNomEstado() {
        return this.edoNomEstado;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdoAbrvEstado(String edoAbrvEstado) {
        this.edoAbrvEstado = edoAbrvEstado;
    }

    public String getEdoAbrvEstado() {
        return this.edoAbrvEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdoHrDiferencia(BigDecimal edoHrDiferencia) {
        this.edoHrDiferencia = edoHrDiferencia;
    }

    public BigDecimal getEdoHrDiferencia() {
        return this.edoHrDiferencia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdoMinDiferencia(BigDecimal edoMinDiferencia) {
        this.edoMinDiferencia = edoMinDiferencia;
    }

    public BigDecimal getEdoMinDiferencia() {
        return this.edoMinDiferencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdoAnoAltaReg(BigDecimal edoAnoAltaReg) {
        this.edoAnoAltaReg = edoAnoAltaReg;
    }

    public BigDecimal getEdoAnoAltaReg() {
        return this.edoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdoMesAltaReg(BigDecimal edoMesAltaReg) {
        this.edoMesAltaReg = edoMesAltaReg;
    }

    public BigDecimal getEdoMesAltaReg() {
        return this.edoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdoDiaAltaReg(BigDecimal edoDiaAltaReg) {
        this.edoDiaAltaReg = edoDiaAltaReg;
    }

    public BigDecimal getEdoDiaAltaReg() {
        return this.edoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdoAnoUltMod(BigDecimal edoAnoUltMod) {
        this.edoAnoUltMod = edoAnoUltMod;
    }

    public BigDecimal getEdoAnoUltMod() {
        return this.edoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdoMesUltMod(BigDecimal edoMesUltMod) {
        this.edoMesUltMod = edoMesUltMod;
    }

    public BigDecimal getEdoMesUltMod() {
        return this.edoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdoDiaUltMod(BigDecimal edoDiaUltMod) {
        this.edoDiaUltMod = edoDiaUltMod;
    }

    public BigDecimal getEdoDiaUltMod() {
        return this.edoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdoCveStEstado(String edoCveStEstado) {
        this.edoCveStEstado = edoCveStEstado;
    }

    public String getEdoCveStEstado() {
        return this.edoCveStEstado;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESTADOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdoNumPais() != null && this.getEdoNumPais().longValue() == -999) {
            conditions += " AND EDO_NUM_PAIS IS NULL";
        } else if (this.getEdoNumPais() != null) {
            conditions += " AND EDO_NUM_PAIS = ?";
            values.add(this.getEdoNumPais());
        }

        if (this.getEdoNumEstado() != null && this.getEdoNumEstado().longValue() == -999) {
            conditions += " AND EDO_NUM_ESTADO IS NULL";
        } else if (this.getEdoNumEstado() != null) {
            conditions += " AND EDO_NUM_ESTADO = ?";
            values.add(this.getEdoNumEstado());
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
        String sql = "SELECT * FROM ESTADOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdoNumPais() != null && this.getEdoNumPais().longValue() == -999) {
            conditions += " AND EDO_NUM_PAIS IS NULL";
        } else if (this.getEdoNumPais() != null) {
            conditions += " AND EDO_NUM_PAIS = ?";
            values.add(this.getEdoNumPais());
        }

        if (this.getEdoNumEstado() != null && this.getEdoNumEstado().longValue() == -999) {
            conditions += " AND EDO_NUM_ESTADO IS NULL";
        } else if (this.getEdoNumEstado() != null) {
            conditions += " AND EDO_NUM_ESTADO = ?";
            values.add(this.getEdoNumEstado());
        }

        if (this.getEdoNomEstado() != null && "null".equals(this.getEdoNomEstado())) {
            conditions += " AND EDO_NOM_ESTADO IS NULL";
        } else if (this.getEdoNomEstado() != null) {
            conditions += " AND EDO_NOM_ESTADO = ?";
            values.add(this.getEdoNomEstado());
        }

        if (this.getEdoAbrvEstado() != null && "null".equals(this.getEdoAbrvEstado())) {
            conditions += " AND EDO_ABRV_ESTADO IS NULL";
        } else if (this.getEdoAbrvEstado() != null) {
            conditions += " AND EDO_ABRV_ESTADO = ?";
            values.add(this.getEdoAbrvEstado());
        }

        if (this.getEdoHrDiferencia() != null && this.getEdoHrDiferencia().longValue() == -999) {
            conditions += " AND EDO_HR_DIFERENCIA IS NULL";
        } else if (this.getEdoHrDiferencia() != null) {
            conditions += " AND EDO_HR_DIFERENCIA = ?";
            values.add(this.getEdoHrDiferencia());
        }

        if (this.getEdoMinDiferencia() != null && this.getEdoMinDiferencia().longValue() == -999) {
            conditions += " AND EDO_MIN_DIFERENCIA IS NULL";
        } else if (this.getEdoMinDiferencia() != null) {
            conditions += " AND EDO_MIN_DIFERENCIA = ?";
            values.add(this.getEdoMinDiferencia());
        }

        if (this.getEdoAnoAltaReg() != null && this.getEdoAnoAltaReg().longValue() == -999) {
            conditions += " AND EDO_ANO_ALTA_REG IS NULL";
        } else if (this.getEdoAnoAltaReg() != null) {
            conditions += " AND EDO_ANO_ALTA_REG = ?";
            values.add(this.getEdoAnoAltaReg());
        }

        if (this.getEdoMesAltaReg() != null && this.getEdoMesAltaReg().longValue() == -999) {
            conditions += " AND EDO_MES_ALTA_REG IS NULL";
        } else if (this.getEdoMesAltaReg() != null) {
            conditions += " AND EDO_MES_ALTA_REG = ?";
            values.add(this.getEdoMesAltaReg());
        }

        if (this.getEdoDiaAltaReg() != null && this.getEdoDiaAltaReg().longValue() == -999) {
            conditions += " AND EDO_DIA_ALTA_REG IS NULL";
        } else if (this.getEdoDiaAltaReg() != null) {
            conditions += " AND EDO_DIA_ALTA_REG = ?";
            values.add(this.getEdoDiaAltaReg());
        }

        if (this.getEdoAnoUltMod() != null && this.getEdoAnoUltMod().longValue() == -999) {
            conditions += " AND EDO_ANO_ULT_MOD IS NULL";
        } else if (this.getEdoAnoUltMod() != null) {
            conditions += " AND EDO_ANO_ULT_MOD = ?";
            values.add(this.getEdoAnoUltMod());
        }

        if (this.getEdoMesUltMod() != null && this.getEdoMesUltMod().longValue() == -999) {
            conditions += " AND EDO_MES_ULT_MOD IS NULL";
        } else if (this.getEdoMesUltMod() != null) {
            conditions += " AND EDO_MES_ULT_MOD = ?";
            values.add(this.getEdoMesUltMod());
        }

        if (this.getEdoDiaUltMod() != null && this.getEdoDiaUltMod().longValue() == -999) {
            conditions += " AND EDO_DIA_ULT_MOD IS NULL";
        } else if (this.getEdoDiaUltMod() != null) {
            conditions += " AND EDO_DIA_ULT_MOD = ?";
            values.add(this.getEdoDiaUltMod());
        }

        if (this.getEdoCveStEstado() != null && "null".equals(this.getEdoCveStEstado())) {
            conditions += " AND EDO_CVE_ST_ESTADO IS NULL";
        } else if (this.getEdoCveStEstado() != null) {
            conditions += " AND EDO_CVE_ST_ESTADO = ?";
            values.add(this.getEdoCveStEstado());
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
        String sql = "UPDATE ESTADOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EDO_NUM_PAIS = ?";
        pkValues.add(this.getEdoNumPais());
        conditions += " AND EDO_NUM_ESTADO = ?";
        pkValues.add(this.getEdoNumEstado());
        fields += " EDO_NOM_ESTADO = ?, ";
        values.add(this.getEdoNomEstado());
        fields += " EDO_ABRV_ESTADO = ?, ";
        values.add(this.getEdoAbrvEstado());
        fields += " EDO_HR_DIFERENCIA = ?, ";
        values.add(this.getEdoHrDiferencia());
        fields += " EDO_MIN_DIFERENCIA = ?, ";
        values.add(this.getEdoMinDiferencia());
        fields += " EDO_ANO_ALTA_REG = ?, ";
        values.add(this.getEdoAnoAltaReg());
        fields += " EDO_MES_ALTA_REG = ?, ";
        values.add(this.getEdoMesAltaReg());
        fields += " EDO_DIA_ALTA_REG = ?, ";
        values.add(this.getEdoDiaAltaReg());
        fields += " EDO_ANO_ULT_MOD = ?, ";
        values.add(this.getEdoAnoUltMod());
        fields += " EDO_MES_ULT_MOD = ?, ";
        values.add(this.getEdoMesUltMod());
        fields += " EDO_DIA_ULT_MOD = ?, ";
        values.add(this.getEdoDiaUltMod());
        fields += " EDO_CVE_ST_ESTADO = ?, ";
        values.add(this.getEdoCveStEstado());
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
        String sql = "INSERT INTO ESTADOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EDO_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getEdoNumPais());

        fields += ", EDO_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getEdoNumEstado());

        fields += ", EDO_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getEdoNomEstado());

        fields += ", EDO_ABRV_ESTADO";
        fieldValues += ", ?";
        values.add(this.getEdoAbrvEstado());

        fields += ", EDO_HR_DIFERENCIA";
        fieldValues += ", ?";
        values.add(this.getEdoHrDiferencia());

        fields += ", EDO_MIN_DIFERENCIA";
        fieldValues += ", ?";
        values.add(this.getEdoMinDiferencia());

        fields += ", EDO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdoAnoAltaReg());

        fields += ", EDO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdoMesAltaReg());

        fields += ", EDO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdoDiaAltaReg());

        fields += ", EDO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdoAnoUltMod());

        fields += ", EDO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdoMesUltMod());

        fields += ", EDO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdoDiaUltMod());

        fields += ", EDO_CVE_ST_ESTADO";
        fieldValues += ", ?";
        values.add(this.getEdoCveStEstado());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESTADOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EDO_NUM_PAIS = ?";
        values.add(this.getEdoNumPais());
        conditions += " AND EDO_NUM_ESTADO = ?";
        values.add(this.getEdoNumEstado());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Estados instance = (Estados) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEdoNumPais().equals(instance.getEdoNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getEdoNumEstado().equals(instance.getEdoNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getEdoNomEstado().equals(instance.getEdoNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getEdoAbrvEstado().equals(instance.getEdoAbrvEstado()))
            equalObjects = false;
        if (equalObjects && !this.getEdoHrDiferencia().equals(instance.getEdoHrDiferencia()))
            equalObjects = false;
        if (equalObjects && !this.getEdoMinDiferencia().equals(instance.getEdoMinDiferencia()))
            equalObjects = false;
        if (equalObjects && !this.getEdoAnoAltaReg().equals(instance.getEdoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdoMesAltaReg().equals(instance.getEdoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdoDiaAltaReg().equals(instance.getEdoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdoAnoUltMod().equals(instance.getEdoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdoMesUltMod().equals(instance.getEdoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdoDiaUltMod().equals(instance.getEdoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdoCveStEstado().equals(instance.getEdoCveStEstado()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Estados result = new Estados();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEdoNumPais((BigDecimal) objectData.getData("EDO_NUM_PAIS"));
        result.setEdoNumEstado((BigDecimal) objectData.getData("EDO_NUM_ESTADO"));
        result.setEdoNomEstado((String) objectData.getData("EDO_NOM_ESTADO"));
        result.setEdoAbrvEstado((String) objectData.getData("EDO_ABRV_ESTADO"));
        result.setEdoHrDiferencia((BigDecimal) objectData.getData("EDO_HR_DIFERENCIA"));
        result.setEdoMinDiferencia((BigDecimal) objectData.getData("EDO_MIN_DIFERENCIA"));
        result.setEdoAnoAltaReg((BigDecimal) objectData.getData("EDO_ANO_ALTA_REG"));
        result.setEdoMesAltaReg((BigDecimal) objectData.getData("EDO_MES_ALTA_REG"));
        result.setEdoDiaAltaReg((BigDecimal) objectData.getData("EDO_DIA_ALTA_REG"));
        result.setEdoAnoUltMod((BigDecimal) objectData.getData("EDO_ANO_ULT_MOD"));
        result.setEdoMesUltMod((BigDecimal) objectData.getData("EDO_MES_ULT_MOD"));
        result.setEdoDiaUltMod((BigDecimal) objectData.getData("EDO_DIA_ULT_MOD"));
        result.setEdoCveStEstado((String) objectData.getData("EDO_CVE_ST_ESTADO"));

        return result;

    }

}
