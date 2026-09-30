package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUMAVALUO_PK", columns = { "AVA_TURNO" }, sequences = { "MAX" })
public class Sumavaluo extends DomainObject {

    String avaTurno = null;
    BigDecimal avaSumValConclu = null;
    String avaObservaciones = null;
    BigDecimal avaAnoAltaReg = null;
    BigDecimal avaMesAltaReg = null;
    BigDecimal avaDiaAltaReg = null;
    BigDecimal avaAnoUltMod = null;
    BigDecimal avaMesUltMod = null;
    BigDecimal avaDiaUltMod = null;
    String avaCveStAvaluos = null;

    public Sumavaluo() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaTurno(String avaTurno) {
        this.avaTurno = avaTurno;
    }

    public String getAvaTurno() {
        return this.avaTurno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAvaSumValConclu(BigDecimal avaSumValConclu) {
        this.avaSumValConclu = avaSumValConclu;
    }

    public BigDecimal getAvaSumValConclu() {
        return this.avaSumValConclu;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaObservaciones(String avaObservaciones) {
        this.avaObservaciones = avaObservaciones;
    }

    public String getAvaObservaciones() {
        return this.avaObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAvaAnoAltaReg(BigDecimal avaAnoAltaReg) {
        this.avaAnoAltaReg = avaAnoAltaReg;
    }

    public BigDecimal getAvaAnoAltaReg() {
        return this.avaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAvaMesAltaReg(BigDecimal avaMesAltaReg) {
        this.avaMesAltaReg = avaMesAltaReg;
    }

    public BigDecimal getAvaMesAltaReg() {
        return this.avaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAvaDiaAltaReg(BigDecimal avaDiaAltaReg) {
        this.avaDiaAltaReg = avaDiaAltaReg;
    }

    public BigDecimal getAvaDiaAltaReg() {
        return this.avaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAvaAnoUltMod(BigDecimal avaAnoUltMod) {
        this.avaAnoUltMod = avaAnoUltMod;
    }

    public BigDecimal getAvaAnoUltMod() {
        return this.avaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAvaMesUltMod(BigDecimal avaMesUltMod) {
        this.avaMesUltMod = avaMesUltMod;
    }

    public BigDecimal getAvaMesUltMod() {
        return this.avaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAvaDiaUltMod(BigDecimal avaDiaUltMod) {
        this.avaDiaUltMod = avaDiaUltMod;
    }

    public BigDecimal getAvaDiaUltMod() {
        return this.avaDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaCveStAvaluos(String avaCveStAvaluos) {
        this.avaCveStAvaluos = avaCveStAvaluos;
    }

    public String getAvaCveStAvaluos() {
        return this.avaCveStAvaluos;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUMAVALUO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAvaTurno() != null && "null".equals(this.getAvaTurno())) {
            conditions += " AND AVA_TURNO IS NULL";
        } else if (this.getAvaTurno() != null) {
            conditions += " AND AVA_TURNO = ?";
            values.add(this.getAvaTurno());
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
        String sql = "SELECT * FROM SUMAVALUO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAvaTurno() != null && "null".equals(this.getAvaTurno())) {
            conditions += " AND AVA_TURNO IS NULL";
        } else if (this.getAvaTurno() != null) {
            conditions += " AND AVA_TURNO = ?";
            values.add(this.getAvaTurno());
        }

        if (this.getAvaSumValConclu() != null && this.getAvaSumValConclu().longValue() == -999) {
            conditions += " AND AVA_SUM_VAL_CONCLU IS NULL";
        } else if (this.getAvaSumValConclu() != null) {
            conditions += " AND AVA_SUM_VAL_CONCLU = ?";
            values.add(this.getAvaSumValConclu());
        }

        if (this.getAvaObservaciones() != null && "null".equals(this.getAvaObservaciones())) {
            conditions += " AND AVA_OBSERVACIONES IS NULL";
        } else if (this.getAvaObservaciones() != null) {
            conditions += " AND AVA_OBSERVACIONES = ?";
            values.add(this.getAvaObservaciones());
        }

        if (this.getAvaAnoAltaReg() != null && this.getAvaAnoAltaReg().longValue() == -999) {
            conditions += " AND AVA_ANO_ALTA_REG IS NULL";
        } else if (this.getAvaAnoAltaReg() != null) {
            conditions += " AND AVA_ANO_ALTA_REG = ?";
            values.add(this.getAvaAnoAltaReg());
        }

        if (this.getAvaMesAltaReg() != null && this.getAvaMesAltaReg().longValue() == -999) {
            conditions += " AND AVA_MES_ALTA_REG IS NULL";
        } else if (this.getAvaMesAltaReg() != null) {
            conditions += " AND AVA_MES_ALTA_REG = ?";
            values.add(this.getAvaMesAltaReg());
        }

        if (this.getAvaDiaAltaReg() != null && this.getAvaDiaAltaReg().longValue() == -999) {
            conditions += " AND AVA_DIA_ALTA_REG IS NULL";
        } else if (this.getAvaDiaAltaReg() != null) {
            conditions += " AND AVA_DIA_ALTA_REG = ?";
            values.add(this.getAvaDiaAltaReg());
        }

        if (this.getAvaAnoUltMod() != null && this.getAvaAnoUltMod().longValue() == -999) {
            conditions += " AND AVA_ANO_ULT_MOD IS NULL";
        } else if (this.getAvaAnoUltMod() != null) {
            conditions += " AND AVA_ANO_ULT_MOD = ?";
            values.add(this.getAvaAnoUltMod());
        }

        if (this.getAvaMesUltMod() != null && this.getAvaMesUltMod().longValue() == -999) {
            conditions += " AND AVA_MES_ULT_MOD IS NULL";
        } else if (this.getAvaMesUltMod() != null) {
            conditions += " AND AVA_MES_ULT_MOD = ?";
            values.add(this.getAvaMesUltMod());
        }

        if (this.getAvaDiaUltMod() != null && this.getAvaDiaUltMod().longValue() == -999) {
            conditions += " AND AVA_DIA_ULT_MOD IS NULL";
        } else if (this.getAvaDiaUltMod() != null) {
            conditions += " AND AVA_DIA_ULT_MOD = ?";
            values.add(this.getAvaDiaUltMod());
        }

        if (this.getAvaCveStAvaluos() != null && "null".equals(this.getAvaCveStAvaluos())) {
            conditions += " AND AVA_CVE_ST_AVALUOS IS NULL";
        } else if (this.getAvaCveStAvaluos() != null) {
            conditions += " AND AVA_CVE_ST_AVALUOS = ?";
            values.add(this.getAvaCveStAvaluos());
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
        String sql = "UPDATE SUMAVALUO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AVA_TURNO = ?";
        pkValues.add(this.getAvaTurno());
        fields += " AVA_SUM_VAL_CONCLU = ?, ";
        values.add(this.getAvaSumValConclu());
        fields += " AVA_OBSERVACIONES = ?, ";
        values.add(this.getAvaObservaciones());
        fields += " AVA_ANO_ALTA_REG = ?, ";
        values.add(this.getAvaAnoAltaReg());
        fields += " AVA_MES_ALTA_REG = ?, ";
        values.add(this.getAvaMesAltaReg());
        fields += " AVA_DIA_ALTA_REG = ?, ";
        values.add(this.getAvaDiaAltaReg());
        fields += " AVA_ANO_ULT_MOD = ?, ";
        values.add(this.getAvaAnoUltMod());
        fields += " AVA_MES_ULT_MOD = ?, ";
        values.add(this.getAvaMesUltMod());
        fields += " AVA_DIA_ULT_MOD = ?, ";
        values.add(this.getAvaDiaUltMod());
        fields += " AVA_CVE_ST_AVALUOS = ?, ";
        values.add(this.getAvaCveStAvaluos());
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
        String sql = "INSERT INTO SUMAVALUO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AVA_TURNO";
        fieldValues += ", ?";
        values.add(this.getAvaTurno());

        fields += ", AVA_SUM_VAL_CONCLU";
        fieldValues += ", ?";
        values.add(this.getAvaSumValConclu());

        fields += ", AVA_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getAvaObservaciones());

        fields += ", AVA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAvaAnoAltaReg());

        fields += ", AVA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAvaMesAltaReg());

        fields += ", AVA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAvaDiaAltaReg());

        fields += ", AVA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAvaAnoUltMod());

        fields += ", AVA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAvaMesUltMod());

        fields += ", AVA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAvaDiaUltMod());

        fields += ", AVA_CVE_ST_AVALUOS";
        fieldValues += ", ?";
        values.add(this.getAvaCveStAvaluos());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUMAVALUO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AVA_TURNO = ?";
        values.add(this.getAvaTurno());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Sumavaluo instance = (Sumavaluo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAvaTurno().equals(instance.getAvaTurno()))
            equalObjects = false;
        if (equalObjects && !this.getAvaSumValConclu().equals(instance.getAvaSumValConclu()))
            equalObjects = false;
        if (equalObjects && !this.getAvaObservaciones().equals(instance.getAvaObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getAvaAnoAltaReg().equals(instance.getAvaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAvaMesAltaReg().equals(instance.getAvaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAvaDiaAltaReg().equals(instance.getAvaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAvaAnoUltMod().equals(instance.getAvaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAvaMesUltMod().equals(instance.getAvaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAvaDiaUltMod().equals(instance.getAvaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveStAvaluos().equals(instance.getAvaCveStAvaluos()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Sumavaluo result = new Sumavaluo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAvaTurno((String) objectData.getData("AVA_TURNO"));
        result.setAvaSumValConclu((BigDecimal) objectData.getData("AVA_SUM_VAL_CONCLU"));
        result.setAvaObservaciones((String) objectData.getData("AVA_OBSERVACIONES"));
        result.setAvaAnoAltaReg((BigDecimal) objectData.getData("AVA_ANO_ALTA_REG"));
        result.setAvaMesAltaReg((BigDecimal) objectData.getData("AVA_MES_ALTA_REG"));
        result.setAvaDiaAltaReg((BigDecimal) objectData.getData("AVA_DIA_ALTA_REG"));
        result.setAvaAnoUltMod((BigDecimal) objectData.getData("AVA_ANO_ULT_MOD"));
        result.setAvaMesUltMod((BigDecimal) objectData.getData("AVA_MES_ULT_MOD"));
        result.setAvaDiaUltMod((BigDecimal) objectData.getData("AVA_DIA_ULT_MOD"));
        result.setAvaCveStAvaluos((String) objectData.getData("AVA_CVE_ST_AVALUOS"));

        return result;

    }

}
