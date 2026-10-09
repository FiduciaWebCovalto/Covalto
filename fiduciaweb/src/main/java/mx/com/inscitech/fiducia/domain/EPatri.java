package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "E_PATRI_PK",
            columns = { "ESP_NUM_NIVEL1", "ESP_NUM_NIVEL2", "ESP_NUM_NIVEL3", "ESP_NUM_NIVEL4", "ESP_NUM_NIVEL5", "ESP_NUM_ANO", "ESP_NUM_MES", "ESP_ACTIVIDAD" },
            sequences = { "MANUAL" })
public class EPatri extends DomainObject {

    BigDecimal espNumNivel1 = null;
    BigDecimal espNumNivel2 = null;
    BigDecimal espNumNivel3 = null;
    BigDecimal espNumNivel4 = null;
    BigDecimal espNumNivel5 = null;
    BigDecimal espNumAno = null;
    String espNumMes = null;
    BigDecimal espNumFisos = null;
    BigDecimal espImpFisos = null;
    BigDecimal espNumManda = null;
    BigDecimal espImpManda = null;
    BigDecimal espAnoAltaReg = null;
    BigDecimal espMesAltaReg = null;
    BigDecimal espDiaAltaReg = null;
    BigDecimal espAnoUltMod = null;
    BigDecimal espMesUltMod = null;
    BigDecimal espDiaUltMod = null;
    String espCveStNivel = null;
    String espActividad = null;

    public EPatri() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel1(BigDecimal espNumNivel1) {
        this.espNumNivel1 = espNumNivel1;
    }

    public BigDecimal getEspNumNivel1() {
        return this.espNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel2(BigDecimal espNumNivel2) {
        this.espNumNivel2 = espNumNivel2;
    }

    public BigDecimal getEspNumNivel2() {
        return this.espNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel3(BigDecimal espNumNivel3) {
        this.espNumNivel3 = espNumNivel3;
    }

    public BigDecimal getEspNumNivel3() {
        return this.espNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel4(BigDecimal espNumNivel4) {
        this.espNumNivel4 = espNumNivel4;
    }

    public BigDecimal getEspNumNivel4() {
        return this.espNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel5(BigDecimal espNumNivel5) {
        this.espNumNivel5 = espNumNivel5;
    }

    public BigDecimal getEspNumNivel5() {
        return this.espNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumAno(BigDecimal espNumAno) {
        this.espNumAno = espNumAno;
    }

    public BigDecimal getEspNumAno() {
        return this.espNumAno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEspNumMes(String espNumMes) {
        this.espNumMes = espNumMes;
    }

    public String getEspNumMes() {
        return this.espNumMes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumFisos(BigDecimal espNumFisos) {
        this.espNumFisos = espNumFisos;
    }

    public BigDecimal getEspNumFisos() {
        return this.espNumFisos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEspImpFisos(BigDecimal espImpFisos) {
        this.espImpFisos = espImpFisos;
    }

    public BigDecimal getEspImpFisos() {
        return this.espImpFisos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumManda(BigDecimal espNumManda) {
        this.espNumManda = espNumManda;
    }

    public BigDecimal getEspNumManda() {
        return this.espNumManda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEspImpManda(BigDecimal espImpManda) {
        this.espImpManda = espImpManda;
    }

    public BigDecimal getEspImpManda() {
        return this.espImpManda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEspAnoAltaReg(BigDecimal espAnoAltaReg) {
        this.espAnoAltaReg = espAnoAltaReg;
    }

    public BigDecimal getEspAnoAltaReg() {
        return this.espAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEspMesAltaReg(BigDecimal espMesAltaReg) {
        this.espMesAltaReg = espMesAltaReg;
    }

    public BigDecimal getEspMesAltaReg() {
        return this.espMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEspDiaAltaReg(BigDecimal espDiaAltaReg) {
        this.espDiaAltaReg = espDiaAltaReg;
    }

    public BigDecimal getEspDiaAltaReg() {
        return this.espDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEspAnoUltMod(BigDecimal espAnoUltMod) {
        this.espAnoUltMod = espAnoUltMod;
    }

    public BigDecimal getEspAnoUltMod() {
        return this.espAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEspMesUltMod(BigDecimal espMesUltMod) {
        this.espMesUltMod = espMesUltMod;
    }

    public BigDecimal getEspMesUltMod() {
        return this.espMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEspDiaUltMod(BigDecimal espDiaUltMod) {
        this.espDiaUltMod = espDiaUltMod;
    }

    public BigDecimal getEspDiaUltMod() {
        return this.espDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEspCveStNivel(String espCveStNivel) {
        this.espCveStNivel = espCveStNivel;
    }

    public String getEspCveStNivel() {
        return this.espCveStNivel;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEspActividad(String espActividad) {
        this.espActividad = espActividad;
    }

    public String getEspActividad() {
        return this.espActividad;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM E_PATRI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEspNumNivel1() != null && this.getEspNumNivel1().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL1 IS NULL";
        } else if (this.getEspNumNivel1() != null) {
            conditions += " AND ESP_NUM_NIVEL1 = ?";
            values.add(this.getEspNumNivel1());
        }

        if (this.getEspNumNivel2() != null && this.getEspNumNivel2().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL2 IS NULL";
        } else if (this.getEspNumNivel2() != null) {
            conditions += " AND ESP_NUM_NIVEL2 = ?";
            values.add(this.getEspNumNivel2());
        }

        if (this.getEspNumNivel3() != null && this.getEspNumNivel3().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL3 IS NULL";
        } else if (this.getEspNumNivel3() != null) {
            conditions += " AND ESP_NUM_NIVEL3 = ?";
            values.add(this.getEspNumNivel3());
        }

        if (this.getEspNumNivel4() != null && this.getEspNumNivel4().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL4 IS NULL";
        } else if (this.getEspNumNivel4() != null) {
            conditions += " AND ESP_NUM_NIVEL4 = ?";
            values.add(this.getEspNumNivel4());
        }

        if (this.getEspNumNivel5() != null && this.getEspNumNivel5().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL5 IS NULL";
        } else if (this.getEspNumNivel5() != null) {
            conditions += " AND ESP_NUM_NIVEL5 = ?";
            values.add(this.getEspNumNivel5());
        }

        if (this.getEspNumAno() != null && this.getEspNumAno().longValue() == -999) {
            conditions += " AND ESP_NUM_ANO IS NULL";
        } else if (this.getEspNumAno() != null) {
            conditions += " AND ESP_NUM_ANO = ?";
            values.add(this.getEspNumAno());
        }

        if (this.getEspNumMes() != null && "null".equals(this.getEspNumMes())) {
            conditions += " AND ESP_NUM_MES IS NULL";
        } else if (this.getEspNumMes() != null) {
            conditions += " AND ESP_NUM_MES = ?";
            values.add(this.getEspNumMes());
        }

        if (this.getEspActividad() != null && "null".equals(this.getEspActividad())) {
            conditions += " AND ESP_ACTIVIDAD IS NULL";
        } else if (this.getEspActividad() != null) {
            conditions += " AND ESP_ACTIVIDAD = ?";
            values.add(this.getEspActividad());
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
        String sql = "SELECT * FROM E_PATRI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEspNumNivel1() != null && this.getEspNumNivel1().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL1 IS NULL";
        } else if (this.getEspNumNivel1() != null) {
            conditions += " AND ESP_NUM_NIVEL1 = ?";
            values.add(this.getEspNumNivel1());
        }

        if (this.getEspNumNivel2() != null && this.getEspNumNivel2().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL2 IS NULL";
        } else if (this.getEspNumNivel2() != null) {
            conditions += " AND ESP_NUM_NIVEL2 = ?";
            values.add(this.getEspNumNivel2());
        }

        if (this.getEspNumNivel3() != null && this.getEspNumNivel3().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL3 IS NULL";
        } else if (this.getEspNumNivel3() != null) {
            conditions += " AND ESP_NUM_NIVEL3 = ?";
            values.add(this.getEspNumNivel3());
        }

        if (this.getEspNumNivel4() != null && this.getEspNumNivel4().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL4 IS NULL";
        } else if (this.getEspNumNivel4() != null) {
            conditions += " AND ESP_NUM_NIVEL4 = ?";
            values.add(this.getEspNumNivel4());
        }

        if (this.getEspNumNivel5() != null && this.getEspNumNivel5().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL5 IS NULL";
        } else if (this.getEspNumNivel5() != null) {
            conditions += " AND ESP_NUM_NIVEL5 = ?";
            values.add(this.getEspNumNivel5());
        }

        if (this.getEspNumAno() != null && this.getEspNumAno().longValue() == -999) {
            conditions += " AND ESP_NUM_ANO IS NULL";
        } else if (this.getEspNumAno() != null) {
            conditions += " AND ESP_NUM_ANO = ?";
            values.add(this.getEspNumAno());
        }

        if (this.getEspNumMes() != null && "null".equals(this.getEspNumMes())) {
            conditions += " AND ESP_NUM_MES IS NULL";
        } else if (this.getEspNumMes() != null) {
            conditions += " AND ESP_NUM_MES = ?";
            values.add(this.getEspNumMes());
        }

        if (this.getEspNumFisos() != null && this.getEspNumFisos().longValue() == -999) {
            conditions += " AND ESP_NUM_FISOS IS NULL";
        } else if (this.getEspNumFisos() != null) {
            conditions += " AND ESP_NUM_FISOS = ?";
            values.add(this.getEspNumFisos());
        }

        if (this.getEspImpFisos() != null && this.getEspImpFisos().longValue() == -999) {
            conditions += " AND ESP_IMP_FISOS IS NULL";
        } else if (this.getEspImpFisos() != null) {
            conditions += " AND ESP_IMP_FISOS = ?";
            values.add(this.getEspImpFisos());
        }

        if (this.getEspNumManda() != null && this.getEspNumManda().longValue() == -999) {
            conditions += " AND ESP_NUM_MANDA IS NULL";
        } else if (this.getEspNumManda() != null) {
            conditions += " AND ESP_NUM_MANDA = ?";
            values.add(this.getEspNumManda());
        }

        if (this.getEspImpManda() != null && this.getEspImpManda().longValue() == -999) {
            conditions += " AND ESP_IMP_MANDA IS NULL";
        } else if (this.getEspImpManda() != null) {
            conditions += " AND ESP_IMP_MANDA = ?";
            values.add(this.getEspImpManda());
        }

        if (this.getEspAnoAltaReg() != null && this.getEspAnoAltaReg().longValue() == -999) {
            conditions += " AND ESP_ANO_ALTA_REG IS NULL";
        } else if (this.getEspAnoAltaReg() != null) {
            conditions += " AND ESP_ANO_ALTA_REG = ?";
            values.add(this.getEspAnoAltaReg());
        }

        if (this.getEspMesAltaReg() != null && this.getEspMesAltaReg().longValue() == -999) {
            conditions += " AND ESP_MES_ALTA_REG IS NULL";
        } else if (this.getEspMesAltaReg() != null) {
            conditions += " AND ESP_MES_ALTA_REG = ?";
            values.add(this.getEspMesAltaReg());
        }

        if (this.getEspDiaAltaReg() != null && this.getEspDiaAltaReg().longValue() == -999) {
            conditions += " AND ESP_DIA_ALTA_REG IS NULL";
        } else if (this.getEspDiaAltaReg() != null) {
            conditions += " AND ESP_DIA_ALTA_REG = ?";
            values.add(this.getEspDiaAltaReg());
        }

        if (this.getEspAnoUltMod() != null && this.getEspAnoUltMod().longValue() == -999) {
            conditions += " AND ESP_ANO_ULT_MOD IS NULL";
        } else if (this.getEspAnoUltMod() != null) {
            conditions += " AND ESP_ANO_ULT_MOD = ?";
            values.add(this.getEspAnoUltMod());
        }

        if (this.getEspMesUltMod() != null && this.getEspMesUltMod().longValue() == -999) {
            conditions += " AND ESP_MES_ULT_MOD IS NULL";
        } else if (this.getEspMesUltMod() != null) {
            conditions += " AND ESP_MES_ULT_MOD = ?";
            values.add(this.getEspMesUltMod());
        }

        if (this.getEspDiaUltMod() != null && this.getEspDiaUltMod().longValue() == -999) {
            conditions += " AND ESP_DIA_ULT_MOD IS NULL";
        } else if (this.getEspDiaUltMod() != null) {
            conditions += " AND ESP_DIA_ULT_MOD = ?";
            values.add(this.getEspDiaUltMod());
        }

        if (this.getEspCveStNivel() != null && "null".equals(this.getEspCveStNivel())) {
            conditions += " AND ESP_CVE_ST_NIVEL IS NULL";
        } else if (this.getEspCveStNivel() != null) {
            conditions += " AND ESP_CVE_ST_NIVEL = ?";
            values.add(this.getEspCveStNivel());
        }

        if (this.getEspActividad() != null && "null".equals(this.getEspActividad())) {
            conditions += " AND ESP_ACTIVIDAD IS NULL";
        } else if (this.getEspActividad() != null) {
            conditions += " AND ESP_ACTIVIDAD = ?";
            values.add(this.getEspActividad());
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
        String sql = "UPDATE E_PATRI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESP_NUM_NIVEL1 = ?";
        pkValues.add(this.getEspNumNivel1());
        conditions += " AND ESP_NUM_NIVEL2 = ?";
        pkValues.add(this.getEspNumNivel2());
        conditions += " AND ESP_NUM_NIVEL3 = ?";
        pkValues.add(this.getEspNumNivel3());
        conditions += " AND ESP_NUM_NIVEL4 = ?";
        pkValues.add(this.getEspNumNivel4());
        conditions += " AND ESP_NUM_NIVEL5 = ?";
        pkValues.add(this.getEspNumNivel5());
        conditions += " AND ESP_NUM_ANO = ?";
        pkValues.add(this.getEspNumAno());
        conditions += " AND ESP_NUM_MES = ?";
        pkValues.add(this.getEspNumMes());
        fields += " ESP_NUM_FISOS = ?, ";
        values.add(this.getEspNumFisos());
        fields += " ESP_IMP_FISOS = ?, ";
        values.add(this.getEspImpFisos());
        fields += " ESP_NUM_MANDA = ?, ";
        values.add(this.getEspNumManda());
        fields += " ESP_IMP_MANDA = ?, ";
        values.add(this.getEspImpManda());
        fields += " ESP_ANO_ALTA_REG = ?, ";
        values.add(this.getEspAnoAltaReg());
        fields += " ESP_MES_ALTA_REG = ?, ";
        values.add(this.getEspMesAltaReg());
        fields += " ESP_DIA_ALTA_REG = ?, ";
        values.add(this.getEspDiaAltaReg());
        fields += " ESP_ANO_ULT_MOD = ?, ";
        values.add(this.getEspAnoUltMod());
        fields += " ESP_MES_ULT_MOD = ?, ";
        values.add(this.getEspMesUltMod());
        fields += " ESP_DIA_ULT_MOD = ?, ";
        values.add(this.getEspDiaUltMod());
        fields += " ESP_CVE_ST_NIVEL = ?, ";
        values.add(this.getEspCveStNivel());
        conditions += " AND ESP_ACTIVIDAD = ?";
        pkValues.add(this.getEspActividad());
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
        String sql = "INSERT INTO E_PATRI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESP_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel1());

        fields += ", ESP_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel2());

        fields += ", ESP_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel3());

        fields += ", ESP_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel4());

        fields += ", ESP_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel5());

        fields += ", ESP_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEspNumAno());

        fields += ", ESP_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEspNumMes());

        fields += ", ESP_NUM_FISOS";
        fieldValues += ", ?";
        values.add(this.getEspNumFisos());

        fields += ", ESP_IMP_FISOS";
        fieldValues += ", ?";
        values.add(this.getEspImpFisos());

        fields += ", ESP_NUM_MANDA";
        fieldValues += ", ?";
        values.add(this.getEspNumManda());

        fields += ", ESP_IMP_MANDA";
        fieldValues += ", ?";
        values.add(this.getEspImpManda());

        fields += ", ESP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEspAnoAltaReg());

        fields += ", ESP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEspMesAltaReg());

        fields += ", ESP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEspDiaAltaReg());

        fields += ", ESP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEspAnoUltMod());

        fields += ", ESP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEspMesUltMod());

        fields += ", ESP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEspDiaUltMod());

        fields += ", ESP_CVE_ST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEspCveStNivel());

        fields += ", ESP_ACTIVIDAD";
        fieldValues += ", ?";
        values.add(this.getEspActividad());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM E_PATRI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESP_NUM_NIVEL1 = ?";
        values.add(this.getEspNumNivel1());
        conditions += " AND ESP_NUM_NIVEL2 = ?";
        values.add(this.getEspNumNivel2());
        conditions += " AND ESP_NUM_NIVEL3 = ?";
        values.add(this.getEspNumNivel3());
        conditions += " AND ESP_NUM_NIVEL4 = ?";
        values.add(this.getEspNumNivel4());
        conditions += " AND ESP_NUM_NIVEL5 = ?";
        values.add(this.getEspNumNivel5());
        conditions += " AND ESP_NUM_ANO = ?";
        values.add(this.getEspNumAno());
        conditions += " AND ESP_NUM_MES = ?";
        values.add(this.getEspNumMes());
        conditions += " AND ESP_ACTIVIDAD = ?";
        values.add(this.getEspActividad());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        EPatri instance = (EPatri) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEspNumNivel1().equals(instance.getEspNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumNivel2().equals(instance.getEspNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumNivel3().equals(instance.getEspNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumNivel4().equals(instance.getEspNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumNivel5().equals(instance.getEspNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumAno().equals(instance.getEspNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumMes().equals(instance.getEspNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumFisos().equals(instance.getEspNumFisos()))
            equalObjects = false;
        if (equalObjects && !this.getEspImpFisos().equals(instance.getEspImpFisos()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumManda().equals(instance.getEspNumManda()))
            equalObjects = false;
        if (equalObjects && !this.getEspImpManda().equals(instance.getEspImpManda()))
            equalObjects = false;
        if (equalObjects && !this.getEspAnoAltaReg().equals(instance.getEspAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEspMesAltaReg().equals(instance.getEspMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEspDiaAltaReg().equals(instance.getEspDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEspAnoUltMod().equals(instance.getEspAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEspMesUltMod().equals(instance.getEspMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEspDiaUltMod().equals(instance.getEspDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEspCveStNivel().equals(instance.getEspCveStNivel()))
            equalObjects = false;
        if (equalObjects && !this.getEspActividad().equals(instance.getEspActividad()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        EPatri result = new EPatri();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEspNumNivel1((BigDecimal) objectData.getData("ESP_NUM_NIVEL1"));
        result.setEspNumNivel2((BigDecimal) objectData.getData("ESP_NUM_NIVEL2"));
        result.setEspNumNivel3((BigDecimal) objectData.getData("ESP_NUM_NIVEL3"));
        result.setEspNumNivel4((BigDecimal) objectData.getData("ESP_NUM_NIVEL4"));
        result.setEspNumNivel5((BigDecimal) objectData.getData("ESP_NUM_NIVEL5"));
        result.setEspNumAno((BigDecimal) objectData.getData("ESP_NUM_ANO"));
        result.setEspNumMes((String) objectData.getData("ESP_NUM_MES"));
        result.setEspNumFisos((BigDecimal) objectData.getData("ESP_NUM_FISOS"));
        result.setEspImpFisos((BigDecimal) objectData.getData("ESP_IMP_FISOS"));
        result.setEspNumManda((BigDecimal) objectData.getData("ESP_NUM_MANDA"));
        result.setEspImpManda((BigDecimal) objectData.getData("ESP_IMP_MANDA"));
        result.setEspAnoAltaReg((BigDecimal) objectData.getData("ESP_ANO_ALTA_REG"));
        result.setEspMesAltaReg((BigDecimal) objectData.getData("ESP_MES_ALTA_REG"));
        result.setEspDiaAltaReg((BigDecimal) objectData.getData("ESP_DIA_ALTA_REG"));
        result.setEspAnoUltMod((BigDecimal) objectData.getData("ESP_ANO_ULT_MOD"));
        result.setEspMesUltMod((BigDecimal) objectData.getData("ESP_MES_ULT_MOD"));
        result.setEspDiaUltMod((BigDecimal) objectData.getData("ESP_DIA_ULT_MOD"));
        result.setEspCveStNivel((String) objectData.getData("ESP_CVE_ST_NIVEL"));
        result.setEspActividad((String) objectData.getData("ESP_ACTIVIDAD"));

        return result;

    }

}
