package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "E_AVALUO_PK", columns = { "ESTA_CVE_TIPO_NEG", "ESTA_NUM_ANO", "ESTA_NUM_MES" }, sequences = { "MANUAL" })
public class EAvaluo extends DomainObject {

    String estaCveTipoNeg = null;
    BigDecimal estaNumAno = null;
    String estaNumMes = null;
    BigDecimal estaImpNeg = null;
    BigDecimal estaNumNeg = null;
    BigDecimal estaAnoAltaReg = null;
    BigDecimal estaMesAltaReg = null;
    BigDecimal estaDiaAltaReg = null;
    BigDecimal estaAnoUltMod = null;
    BigDecimal estaMesUltMod = null;
    BigDecimal estaDiaUltMod = null;
    String estaCveStNivel = null;

    public EAvaluo() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstaCveTipoNeg(String estaCveTipoNeg) {
        this.estaCveTipoNeg = estaCveTipoNeg;
    }

    public String getEstaCveTipoNeg() {
        return this.estaCveTipoNeg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstaNumAno(BigDecimal estaNumAno) {
        this.estaNumAno = estaNumAno;
    }

    public BigDecimal getEstaNumAno() {
        return this.estaNumAno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstaNumMes(String estaNumMes) {
        this.estaNumMes = estaNumMes;
    }

    public String getEstaNumMes() {
        return this.estaNumMes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstaImpNeg(BigDecimal estaImpNeg) {
        this.estaImpNeg = estaImpNeg;
    }

    public BigDecimal getEstaImpNeg() {
        return this.estaImpNeg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstaNumNeg(BigDecimal estaNumNeg) {
        this.estaNumNeg = estaNumNeg;
    }

    public BigDecimal getEstaNumNeg() {
        return this.estaNumNeg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstaAnoAltaReg(BigDecimal estaAnoAltaReg) {
        this.estaAnoAltaReg = estaAnoAltaReg;
    }

    public BigDecimal getEstaAnoAltaReg() {
        return this.estaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstaMesAltaReg(BigDecimal estaMesAltaReg) {
        this.estaMesAltaReg = estaMesAltaReg;
    }

    public BigDecimal getEstaMesAltaReg() {
        return this.estaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstaDiaAltaReg(BigDecimal estaDiaAltaReg) {
        this.estaDiaAltaReg = estaDiaAltaReg;
    }

    public BigDecimal getEstaDiaAltaReg() {
        return this.estaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstaAnoUltMod(BigDecimal estaAnoUltMod) {
        this.estaAnoUltMod = estaAnoUltMod;
    }

    public BigDecimal getEstaAnoUltMod() {
        return this.estaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstaMesUltMod(BigDecimal estaMesUltMod) {
        this.estaMesUltMod = estaMesUltMod;
    }

    public BigDecimal getEstaMesUltMod() {
        return this.estaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstaDiaUltMod(BigDecimal estaDiaUltMod) {
        this.estaDiaUltMod = estaDiaUltMod;
    }

    public BigDecimal getEstaDiaUltMod() {
        return this.estaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstaCveStNivel(String estaCveStNivel) {
        this.estaCveStNivel = estaCveStNivel;
    }

    public String getEstaCveStNivel() {
        return this.estaCveStNivel;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM E_AVALUO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstaCveTipoNeg() != null && "null".equals(this.getEstaCveTipoNeg())) {
            conditions += " AND ESTA_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstaCveTipoNeg() != null) {
            conditions += " AND ESTA_CVE_TIPO_NEG = ?";
            values.add(this.getEstaCveTipoNeg());
        }

        if (this.getEstaNumAno() != null && this.getEstaNumAno().longValue() == -999) {
            conditions += " AND ESTA_NUM_ANO IS NULL";
        } else if (this.getEstaNumAno() != null) {
            conditions += " AND ESTA_NUM_ANO = ?";
            values.add(this.getEstaNumAno());
        }

        if (this.getEstaNumMes() != null && "null".equals(this.getEstaNumMes())) {
            conditions += " AND ESTA_NUM_MES IS NULL";
        } else if (this.getEstaNumMes() != null) {
            conditions += " AND ESTA_NUM_MES = ?";
            values.add(this.getEstaNumMes());
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
        String sql = "SELECT * FROM E_AVALUO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstaCveTipoNeg() != null && "null".equals(this.getEstaCveTipoNeg())) {
            conditions += " AND ESTA_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstaCveTipoNeg() != null) {
            conditions += " AND ESTA_CVE_TIPO_NEG = ?";
            values.add(this.getEstaCveTipoNeg());
        }

        if (this.getEstaNumAno() != null && this.getEstaNumAno().longValue() == -999) {
            conditions += " AND ESTA_NUM_ANO IS NULL";
        } else if (this.getEstaNumAno() != null) {
            conditions += " AND ESTA_NUM_ANO = ?";
            values.add(this.getEstaNumAno());
        }

        if (this.getEstaNumMes() != null && "null".equals(this.getEstaNumMes())) {
            conditions += " AND ESTA_NUM_MES IS NULL";
        } else if (this.getEstaNumMes() != null) {
            conditions += " AND ESTA_NUM_MES = ?";
            values.add(this.getEstaNumMes());
        }

        if (this.getEstaImpNeg() != null && this.getEstaImpNeg().longValue() == -999) {
            conditions += " AND ESTA_IMP_NEG IS NULL";
        } else if (this.getEstaImpNeg() != null) {
            conditions += " AND ESTA_IMP_NEG = ?";
            values.add(this.getEstaImpNeg());
        }

        if (this.getEstaNumNeg() != null && this.getEstaNumNeg().longValue() == -999) {
            conditions += " AND ESTA_NUM_NEG IS NULL";
        } else if (this.getEstaNumNeg() != null) {
            conditions += " AND ESTA_NUM_NEG = ?";
            values.add(this.getEstaNumNeg());
        }

        if (this.getEstaAnoAltaReg() != null && this.getEstaAnoAltaReg().longValue() == -999) {
            conditions += " AND ESTA_ANO_ALTA_REG IS NULL";
        } else if (this.getEstaAnoAltaReg() != null) {
            conditions += " AND ESTA_ANO_ALTA_REG = ?";
            values.add(this.getEstaAnoAltaReg());
        }

        if (this.getEstaMesAltaReg() != null && this.getEstaMesAltaReg().longValue() == -999) {
            conditions += " AND ESTA_MES_ALTA_REG IS NULL";
        } else if (this.getEstaMesAltaReg() != null) {
            conditions += " AND ESTA_MES_ALTA_REG = ?";
            values.add(this.getEstaMesAltaReg());
        }

        if (this.getEstaDiaAltaReg() != null && this.getEstaDiaAltaReg().longValue() == -999) {
            conditions += " AND ESTA_DIA_ALTA_REG IS NULL";
        } else if (this.getEstaDiaAltaReg() != null) {
            conditions += " AND ESTA_DIA_ALTA_REG = ?";
            values.add(this.getEstaDiaAltaReg());
        }

        if (this.getEstaAnoUltMod() != null && this.getEstaAnoUltMod().longValue() == -999) {
            conditions += " AND ESTA_ANO_ULT_MOD IS NULL";
        } else if (this.getEstaAnoUltMod() != null) {
            conditions += " AND ESTA_ANO_ULT_MOD = ?";
            values.add(this.getEstaAnoUltMod());
        }

        if (this.getEstaMesUltMod() != null && this.getEstaMesUltMod().longValue() == -999) {
            conditions += " AND ESTA_MES_ULT_MOD IS NULL";
        } else if (this.getEstaMesUltMod() != null) {
            conditions += " AND ESTA_MES_ULT_MOD = ?";
            values.add(this.getEstaMesUltMod());
        }

        if (this.getEstaDiaUltMod() != null && this.getEstaDiaUltMod().longValue() == -999) {
            conditions += " AND ESTA_DIA_ULT_MOD IS NULL";
        } else if (this.getEstaDiaUltMod() != null) {
            conditions += " AND ESTA_DIA_ULT_MOD = ?";
            values.add(this.getEstaDiaUltMod());
        }

        if (this.getEstaCveStNivel() != null && "null".equals(this.getEstaCveStNivel())) {
            conditions += " AND ESTA_CVE_ST_NIVEL IS NULL";
        } else if (this.getEstaCveStNivel() != null) {
            conditions += " AND ESTA_CVE_ST_NIVEL = ?";
            values.add(this.getEstaCveStNivel());
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
        String sql = "UPDATE E_AVALUO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESTA_CVE_TIPO_NEG = ?";
        pkValues.add(this.getEstaCveTipoNeg());
        conditions += " AND ESTA_NUM_ANO = ?";
        pkValues.add(this.getEstaNumAno());
        conditions += " AND ESTA_NUM_MES = ?";
        pkValues.add(this.getEstaNumMes());
        fields += " ESTA_IMP_NEG = ?, ";
        values.add(this.getEstaImpNeg());
        fields += " ESTA_NUM_NEG = ?, ";
        values.add(this.getEstaNumNeg());
        fields += " ESTA_ANO_ALTA_REG = ?, ";
        values.add(this.getEstaAnoAltaReg());
        fields += " ESTA_MES_ALTA_REG = ?, ";
        values.add(this.getEstaMesAltaReg());
        fields += " ESTA_DIA_ALTA_REG = ?, ";
        values.add(this.getEstaDiaAltaReg());
        fields += " ESTA_ANO_ULT_MOD = ?, ";
        values.add(this.getEstaAnoUltMod());
        fields += " ESTA_MES_ULT_MOD = ?, ";
        values.add(this.getEstaMesUltMod());
        fields += " ESTA_DIA_ULT_MOD = ?, ";
        values.add(this.getEstaDiaUltMod());
        fields += " ESTA_CVE_ST_NIVEL = ?, ";
        values.add(this.getEstaCveStNivel());
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
        String sql = "INSERT INTO E_AVALUO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESTA_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getEstaCveTipoNeg());

        fields += ", ESTA_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEstaNumAno());

        fields += ", ESTA_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEstaNumMes());

        fields += ", ESTA_IMP_NEG";
        fieldValues += ", ?";
        values.add(this.getEstaImpNeg());

        fields += ", ESTA_NUM_NEG";
        fieldValues += ", ?";
        values.add(this.getEstaNumNeg());

        fields += ", ESTA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstaAnoAltaReg());

        fields += ", ESTA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstaMesAltaReg());

        fields += ", ESTA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstaDiaAltaReg());

        fields += ", ESTA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstaAnoUltMod());

        fields += ", ESTA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstaMesUltMod());

        fields += ", ESTA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstaDiaUltMod());

        fields += ", ESTA_CVE_ST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstaCveStNivel());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM E_AVALUO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESTA_CVE_TIPO_NEG = ?";
        values.add(this.getEstaCveTipoNeg());
        conditions += " AND ESTA_NUM_ANO = ?";
        values.add(this.getEstaNumAno());
        conditions += " AND ESTA_NUM_MES = ?";
        values.add(this.getEstaNumMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        EAvaluo instance = (EAvaluo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstaCveTipoNeg().equals(instance.getEstaCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getEstaNumAno().equals(instance.getEstaNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEstaNumMes().equals(instance.getEstaNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEstaImpNeg().equals(instance.getEstaImpNeg()))
            equalObjects = false;
        if (equalObjects && !this.getEstaNumNeg().equals(instance.getEstaNumNeg()))
            equalObjects = false;
        if (equalObjects && !this.getEstaAnoAltaReg().equals(instance.getEstaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstaMesAltaReg().equals(instance.getEstaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstaDiaAltaReg().equals(instance.getEstaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstaAnoUltMod().equals(instance.getEstaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstaMesUltMod().equals(instance.getEstaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstaDiaUltMod().equals(instance.getEstaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstaCveStNivel().equals(instance.getEstaCveStNivel()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        EAvaluo result = new EAvaluo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstaCveTipoNeg((String) objectData.getData("ESTA_CVE_TIPO_NEG"));
        result.setEstaNumAno((BigDecimal) objectData.getData("ESTA_NUM_ANO"));
        result.setEstaNumMes((String) objectData.getData("ESTA_NUM_MES"));
        result.setEstaImpNeg((BigDecimal) objectData.getData("ESTA_IMP_NEG"));
        result.setEstaNumNeg((BigDecimal) objectData.getData("ESTA_NUM_NEG"));
        result.setEstaAnoAltaReg((BigDecimal) objectData.getData("ESTA_ANO_ALTA_REG"));
        result.setEstaMesAltaReg((BigDecimal) objectData.getData("ESTA_MES_ALTA_REG"));
        result.setEstaDiaAltaReg((BigDecimal) objectData.getData("ESTA_DIA_ALTA_REG"));
        result.setEstaAnoUltMod((BigDecimal) objectData.getData("ESTA_ANO_ULT_MOD"));
        result.setEstaMesUltMod((BigDecimal) objectData.getData("ESTA_MES_ULT_MOD"));
        result.setEstaDiaUltMod((BigDecimal) objectData.getData("ESTA_DIA_ULT_MOD"));
        result.setEstaCveStNivel((String) objectData.getData("ESTA_CVE_ST_NIVEL"));

        return result;

    }

}
