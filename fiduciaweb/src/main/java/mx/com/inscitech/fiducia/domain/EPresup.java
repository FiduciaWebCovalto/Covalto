package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "E_PRESUP_PK",
            columns = { "ESTI_NUM_NIVEL1", "ESTI_NUM_NIVEL2", "ESTI_NUM_NIVEL3", "ESTI_NUM_NIVEL4", "ESTI_NUM_NIVEL5", "ESTI_NUM_ANO", "ESTI_NUM_MES" }, sequences = { "MANUAL" })
public class EPresup extends DomainObject {

    BigDecimal estiNumNivel1 = null;
    BigDecimal estiNumNivel2 = null;
    BigDecimal estiNumNivel3 = null;
    BigDecimal estiNumNivel4 = null;
    BigDecimal estiNumNivel5 = null;
    BigDecimal estiNumAno = null;
    String estiNumMes = null;
    BigDecimal estiNumFisos = null;
    BigDecimal estiImpFisos = null;
    BigDecimal estiNumManda = null;
    BigDecimal estiImpManda = null;
    BigDecimal estiNumAvalu = null;
    BigDecimal estiImpAvalu = null;
    BigDecimal estiImpPresup = null;
    BigDecimal estiAnoAltaReg = null;
    BigDecimal estiMesAltaReg = null;
    BigDecimal estiDiaAltaReg = null;
    BigDecimal estiAnoUltMod = null;
    BigDecimal estiMesUltMod = null;
    BigDecimal estiDiaUltMod = null;
    String estiCveStNivel = null;

    public EPresup() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumNivel1(BigDecimal estiNumNivel1) {
        this.estiNumNivel1 = estiNumNivel1;
    }

    public BigDecimal getEstiNumNivel1() {
        return this.estiNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumNivel2(BigDecimal estiNumNivel2) {
        this.estiNumNivel2 = estiNumNivel2;
    }

    public BigDecimal getEstiNumNivel2() {
        return this.estiNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumNivel3(BigDecimal estiNumNivel3) {
        this.estiNumNivel3 = estiNumNivel3;
    }

    public BigDecimal getEstiNumNivel3() {
        return this.estiNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumNivel4(BigDecimal estiNumNivel4) {
        this.estiNumNivel4 = estiNumNivel4;
    }

    public BigDecimal getEstiNumNivel4() {
        return this.estiNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumNivel5(BigDecimal estiNumNivel5) {
        this.estiNumNivel5 = estiNumNivel5;
    }

    public BigDecimal getEstiNumNivel5() {
        return this.estiNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumAno(BigDecimal estiNumAno) {
        this.estiNumAno = estiNumAno;
    }

    public BigDecimal getEstiNumAno() {
        return this.estiNumAno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstiNumMes(String estiNumMes) {
        this.estiNumMes = estiNumMes;
    }

    public String getEstiNumMes() {
        return this.estiNumMes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumFisos(BigDecimal estiNumFisos) {
        this.estiNumFisos = estiNumFisos;
    }

    public BigDecimal getEstiNumFisos() {
        return this.estiNumFisos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setEstiImpFisos(BigDecimal estiImpFisos) {
        this.estiImpFisos = estiImpFisos;
    }

    public BigDecimal getEstiImpFisos() {
        return this.estiImpFisos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumManda(BigDecimal estiNumManda) {
        this.estiNumManda = estiNumManda;
    }

    public BigDecimal getEstiNumManda() {
        return this.estiNumManda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setEstiImpManda(BigDecimal estiImpManda) {
        this.estiImpManda = estiImpManda;
    }

    public BigDecimal getEstiImpManda() {
        return this.estiImpManda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstiNumAvalu(BigDecimal estiNumAvalu) {
        this.estiNumAvalu = estiNumAvalu;
    }

    public BigDecimal getEstiNumAvalu() {
        return this.estiNumAvalu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setEstiImpAvalu(BigDecimal estiImpAvalu) {
        this.estiImpAvalu = estiImpAvalu;
    }

    public BigDecimal getEstiImpAvalu() {
        return this.estiImpAvalu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setEstiImpPresup(BigDecimal estiImpPresup) {
        this.estiImpPresup = estiImpPresup;
    }

    public BigDecimal getEstiImpPresup() {
        return this.estiImpPresup;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstiAnoAltaReg(BigDecimal estiAnoAltaReg) {
        this.estiAnoAltaReg = estiAnoAltaReg;
    }

    public BigDecimal getEstiAnoAltaReg() {
        return this.estiAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstiMesAltaReg(BigDecimal estiMesAltaReg) {
        this.estiMesAltaReg = estiMesAltaReg;
    }

    public BigDecimal getEstiMesAltaReg() {
        return this.estiMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstiDiaAltaReg(BigDecimal estiDiaAltaReg) {
        this.estiDiaAltaReg = estiDiaAltaReg;
    }

    public BigDecimal getEstiDiaAltaReg() {
        return this.estiDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstiAnoUltMod(BigDecimal estiAnoUltMod) {
        this.estiAnoUltMod = estiAnoUltMod;
    }

    public BigDecimal getEstiAnoUltMod() {
        return this.estiAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstiMesUltMod(BigDecimal estiMesUltMod) {
        this.estiMesUltMod = estiMesUltMod;
    }

    public BigDecimal getEstiMesUltMod() {
        return this.estiMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstiDiaUltMod(BigDecimal estiDiaUltMod) {
        this.estiDiaUltMod = estiDiaUltMod;
    }

    public BigDecimal getEstiDiaUltMod() {
        return this.estiDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstiCveStNivel(String estiCveStNivel) {
        this.estiCveStNivel = estiCveStNivel;
    }

    public String getEstiCveStNivel() {
        return this.estiCveStNivel;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM E_PRESUP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstiNumNivel1() != null && this.getEstiNumNivel1().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL1 IS NULL";
        } else if (this.getEstiNumNivel1() != null) {
            conditions += " AND ESTI_NUM_NIVEL1 = ?";
            values.add(this.getEstiNumNivel1());
        }

        if (this.getEstiNumNivel2() != null && this.getEstiNumNivel2().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL2 IS NULL";
        } else if (this.getEstiNumNivel2() != null) {
            conditions += " AND ESTI_NUM_NIVEL2 = ?";
            values.add(this.getEstiNumNivel2());
        }

        if (this.getEstiNumNivel3() != null && this.getEstiNumNivel3().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL3 IS NULL";
        } else if (this.getEstiNumNivel3() != null) {
            conditions += " AND ESTI_NUM_NIVEL3 = ?";
            values.add(this.getEstiNumNivel3());
        }

        if (this.getEstiNumNivel4() != null && this.getEstiNumNivel4().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL4 IS NULL";
        } else if (this.getEstiNumNivel4() != null) {
            conditions += " AND ESTI_NUM_NIVEL4 = ?";
            values.add(this.getEstiNumNivel4());
        }

        if (this.getEstiNumNivel5() != null && this.getEstiNumNivel5().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL5 IS NULL";
        } else if (this.getEstiNumNivel5() != null) {
            conditions += " AND ESTI_NUM_NIVEL5 = ?";
            values.add(this.getEstiNumNivel5());
        }

        if (this.getEstiNumAno() != null && this.getEstiNumAno().longValue() == -999) {
            conditions += " AND ESTI_NUM_ANO IS NULL";
        } else if (this.getEstiNumAno() != null) {
            conditions += " AND ESTI_NUM_ANO = ?";
            values.add(this.getEstiNumAno());
        }

        if (this.getEstiNumMes() != null && "null".equals(this.getEstiNumMes())) {
            conditions += " AND ESTI_NUM_MES IS NULL";
        } else if (this.getEstiNumMes() != null) {
            conditions += " AND ESTI_NUM_MES = ?";
            values.add(this.getEstiNumMes());
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
        String sql = "SELECT * FROM E_PRESUP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstiNumNivel1() != null && this.getEstiNumNivel1().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL1 IS NULL";
        } else if (this.getEstiNumNivel1() != null) {
            conditions += " AND ESTI_NUM_NIVEL1 = ?";
            values.add(this.getEstiNumNivel1());
        }

        if (this.getEstiNumNivel2() != null && this.getEstiNumNivel2().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL2 IS NULL";
        } else if (this.getEstiNumNivel2() != null) {
            conditions += " AND ESTI_NUM_NIVEL2 = ?";
            values.add(this.getEstiNumNivel2());
        }

        if (this.getEstiNumNivel3() != null && this.getEstiNumNivel3().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL3 IS NULL";
        } else if (this.getEstiNumNivel3() != null) {
            conditions += " AND ESTI_NUM_NIVEL3 = ?";
            values.add(this.getEstiNumNivel3());
        }

        if (this.getEstiNumNivel4() != null && this.getEstiNumNivel4().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL4 IS NULL";
        } else if (this.getEstiNumNivel4() != null) {
            conditions += " AND ESTI_NUM_NIVEL4 = ?";
            values.add(this.getEstiNumNivel4());
        }

        if (this.getEstiNumNivel5() != null && this.getEstiNumNivel5().longValue() == -999) {
            conditions += " AND ESTI_NUM_NIVEL5 IS NULL";
        } else if (this.getEstiNumNivel5() != null) {
            conditions += " AND ESTI_NUM_NIVEL5 = ?";
            values.add(this.getEstiNumNivel5());
        }

        if (this.getEstiNumAno() != null && this.getEstiNumAno().longValue() == -999) {
            conditions += " AND ESTI_NUM_ANO IS NULL";
        } else if (this.getEstiNumAno() != null) {
            conditions += " AND ESTI_NUM_ANO = ?";
            values.add(this.getEstiNumAno());
        }

        if (this.getEstiNumMes() != null && "null".equals(this.getEstiNumMes())) {
            conditions += " AND ESTI_NUM_MES IS NULL";
        } else if (this.getEstiNumMes() != null) {
            conditions += " AND ESTI_NUM_MES = ?";
            values.add(this.getEstiNumMes());
        }

        if (this.getEstiNumFisos() != null && this.getEstiNumFisos().longValue() == -999) {
            conditions += " AND ESTI_NUM_FISOS IS NULL";
        } else if (this.getEstiNumFisos() != null) {
            conditions += " AND ESTI_NUM_FISOS = ?";
            values.add(this.getEstiNumFisos());
        }

        if (this.getEstiImpFisos() != null && this.getEstiImpFisos().longValue() == -999) {
            conditions += " AND ESTI_IMP_FISOS IS NULL";
        } else if (this.getEstiImpFisos() != null) {
            conditions += " AND ESTI_IMP_FISOS = ?";
            values.add(this.getEstiImpFisos());
        }

        if (this.getEstiNumManda() != null && this.getEstiNumManda().longValue() == -999) {
            conditions += " AND ESTI_NUM_MANDA IS NULL";
        } else if (this.getEstiNumManda() != null) {
            conditions += " AND ESTI_NUM_MANDA = ?";
            values.add(this.getEstiNumManda());
        }

        if (this.getEstiImpManda() != null && this.getEstiImpManda().longValue() == -999) {
            conditions += " AND ESTI_IMP_MANDA IS NULL";
        } else if (this.getEstiImpManda() != null) {
            conditions += " AND ESTI_IMP_MANDA = ?";
            values.add(this.getEstiImpManda());
        }

        if (this.getEstiNumAvalu() != null && this.getEstiNumAvalu().longValue() == -999) {
            conditions += " AND ESTI_NUM_AVALU IS NULL";
        } else if (this.getEstiNumAvalu() != null) {
            conditions += " AND ESTI_NUM_AVALU = ?";
            values.add(this.getEstiNumAvalu());
        }

        if (this.getEstiImpAvalu() != null && this.getEstiImpAvalu().longValue() == -999) {
            conditions += " AND ESTI_IMP_AVALU IS NULL";
        } else if (this.getEstiImpAvalu() != null) {
            conditions += " AND ESTI_IMP_AVALU = ?";
            values.add(this.getEstiImpAvalu());
        }

        if (this.getEstiImpPresup() != null && this.getEstiImpPresup().longValue() == -999) {
            conditions += " AND ESTI_IMP_PRESUP IS NULL";
        } else if (this.getEstiImpPresup() != null) {
            conditions += " AND ESTI_IMP_PRESUP = ?";
            values.add(this.getEstiImpPresup());
        }

        if (this.getEstiAnoAltaReg() != null && this.getEstiAnoAltaReg().longValue() == -999) {
            conditions += " AND ESTI_ANO_ALTA_REG IS NULL";
        } else if (this.getEstiAnoAltaReg() != null) {
            conditions += " AND ESTI_ANO_ALTA_REG = ?";
            values.add(this.getEstiAnoAltaReg());
        }

        if (this.getEstiMesAltaReg() != null && this.getEstiMesAltaReg().longValue() == -999) {
            conditions += " AND ESTI_MES_ALTA_REG IS NULL";
        } else if (this.getEstiMesAltaReg() != null) {
            conditions += " AND ESTI_MES_ALTA_REG = ?";
            values.add(this.getEstiMesAltaReg());
        }

        if (this.getEstiDiaAltaReg() != null && this.getEstiDiaAltaReg().longValue() == -999) {
            conditions += " AND ESTI_DIA_ALTA_REG IS NULL";
        } else if (this.getEstiDiaAltaReg() != null) {
            conditions += " AND ESTI_DIA_ALTA_REG = ?";
            values.add(this.getEstiDiaAltaReg());
        }

        if (this.getEstiAnoUltMod() != null && this.getEstiAnoUltMod().longValue() == -999) {
            conditions += " AND ESTI_ANO_ULT_MOD IS NULL";
        } else if (this.getEstiAnoUltMod() != null) {
            conditions += " AND ESTI_ANO_ULT_MOD = ?";
            values.add(this.getEstiAnoUltMod());
        }

        if (this.getEstiMesUltMod() != null && this.getEstiMesUltMod().longValue() == -999) {
            conditions += " AND ESTI_MES_ULT_MOD IS NULL";
        } else if (this.getEstiMesUltMod() != null) {
            conditions += " AND ESTI_MES_ULT_MOD = ?";
            values.add(this.getEstiMesUltMod());
        }

        if (this.getEstiDiaUltMod() != null && this.getEstiDiaUltMod().longValue() == -999) {
            conditions += " AND ESTI_DIA_ULT_MOD IS NULL";
        } else if (this.getEstiDiaUltMod() != null) {
            conditions += " AND ESTI_DIA_ULT_MOD = ?";
            values.add(this.getEstiDiaUltMod());
        }

        if (this.getEstiCveStNivel() != null && "null".equals(this.getEstiCveStNivel())) {
            conditions += " AND ESTI_CVE_ST_NIVEL IS NULL";
        } else if (this.getEstiCveStNivel() != null) {
            conditions += " AND ESTI_CVE_ST_NIVEL = ?";
            values.add(this.getEstiCveStNivel());
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
        String sql = "UPDATE E_PRESUP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESTI_NUM_NIVEL1 = ?";
        pkValues.add(this.getEstiNumNivel1());
        conditions += " AND ESTI_NUM_NIVEL2 = ?";
        pkValues.add(this.getEstiNumNivel2());
        conditions += " AND ESTI_NUM_NIVEL3 = ?";
        pkValues.add(this.getEstiNumNivel3());
        conditions += " AND ESTI_NUM_NIVEL4 = ?";
        pkValues.add(this.getEstiNumNivel4());
        conditions += " AND ESTI_NUM_NIVEL5 = ?";
        pkValues.add(this.getEstiNumNivel5());
        conditions += " AND ESTI_NUM_ANO = ?";
        pkValues.add(this.getEstiNumAno());
        conditions += " AND ESTI_NUM_MES = ?";
        pkValues.add(this.getEstiNumMes());
        fields += " ESTI_NUM_FISOS = ?, ";
        values.add(this.getEstiNumFisos());
        fields += " ESTI_IMP_FISOS = ?, ";
        values.add(this.getEstiImpFisos());
        fields += " ESTI_NUM_MANDA = ?, ";
        values.add(this.getEstiNumManda());
        fields += " ESTI_IMP_MANDA = ?, ";
        values.add(this.getEstiImpManda());
        fields += " ESTI_NUM_AVALU = ?, ";
        values.add(this.getEstiNumAvalu());
        fields += " ESTI_IMP_AVALU = ?, ";
        values.add(this.getEstiImpAvalu());
        fields += " ESTI_IMP_PRESUP = ?, ";
        values.add(this.getEstiImpPresup());
        fields += " ESTI_ANO_ALTA_REG = ?, ";
        values.add(this.getEstiAnoAltaReg());
        fields += " ESTI_MES_ALTA_REG = ?, ";
        values.add(this.getEstiMesAltaReg());
        fields += " ESTI_DIA_ALTA_REG = ?, ";
        values.add(this.getEstiDiaAltaReg());
        fields += " ESTI_ANO_ULT_MOD = ?, ";
        values.add(this.getEstiAnoUltMod());
        fields += " ESTI_MES_ULT_MOD = ?, ";
        values.add(this.getEstiMesUltMod());
        fields += " ESTI_DIA_ULT_MOD = ?, ";
        values.add(this.getEstiDiaUltMod());
        fields += " ESTI_CVE_ST_NIVEL = ?, ";
        values.add(this.getEstiCveStNivel());
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
        String sql = "INSERT INTO E_PRESUP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESTI_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEstiNumNivel1());

        fields += ", ESTI_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEstiNumNivel2());

        fields += ", ESTI_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEstiNumNivel3());

        fields += ", ESTI_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEstiNumNivel4());

        fields += ", ESTI_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEstiNumNivel5());

        fields += ", ESTI_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEstiNumAno());

        fields += ", ESTI_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEstiNumMes());

        fields += ", ESTI_NUM_FISOS";
        fieldValues += ", ?";
        values.add(this.getEstiNumFisos());

        fields += ", ESTI_IMP_FISOS";
        fieldValues += ", ?";
        values.add(this.getEstiImpFisos());

        fields += ", ESTI_NUM_MANDA";
        fieldValues += ", ?";
        values.add(this.getEstiNumManda());

        fields += ", ESTI_IMP_MANDA";
        fieldValues += ", ?";
        values.add(this.getEstiImpManda());

        fields += ", ESTI_NUM_AVALU";
        fieldValues += ", ?";
        values.add(this.getEstiNumAvalu());

        fields += ", ESTI_IMP_AVALU";
        fieldValues += ", ?";
        values.add(this.getEstiImpAvalu());

        fields += ", ESTI_IMP_PRESUP";
        fieldValues += ", ?";
        values.add(this.getEstiImpPresup());

        fields += ", ESTI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstiAnoAltaReg());

        fields += ", ESTI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstiMesAltaReg());

        fields += ", ESTI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstiDiaAltaReg());

        fields += ", ESTI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstiAnoUltMod());

        fields += ", ESTI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstiMesUltMod());

        fields += ", ESTI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstiDiaUltMod());

        fields += ", ESTI_CVE_ST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstiCveStNivel());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM E_PRESUP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESTI_NUM_NIVEL1 = ?";
        values.add(this.getEstiNumNivel1());
        conditions += " AND ESTI_NUM_NIVEL2 = ?";
        values.add(this.getEstiNumNivel2());
        conditions += " AND ESTI_NUM_NIVEL3 = ?";
        values.add(this.getEstiNumNivel3());
        conditions += " AND ESTI_NUM_NIVEL4 = ?";
        values.add(this.getEstiNumNivel4());
        conditions += " AND ESTI_NUM_NIVEL5 = ?";
        values.add(this.getEstiNumNivel5());
        conditions += " AND ESTI_NUM_ANO = ?";
        values.add(this.getEstiNumAno());
        conditions += " AND ESTI_NUM_MES = ?";
        values.add(this.getEstiNumMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        EPresup instance = (EPresup) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstiNumNivel1().equals(instance.getEstiNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumNivel2().equals(instance.getEstiNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumNivel3().equals(instance.getEstiNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumNivel4().equals(instance.getEstiNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumNivel5().equals(instance.getEstiNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumAno().equals(instance.getEstiNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumMes().equals(instance.getEstiNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumFisos().equals(instance.getEstiNumFisos()))
            equalObjects = false;
        if (equalObjects && !this.getEstiImpFisos().equals(instance.getEstiImpFisos()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumManda().equals(instance.getEstiNumManda()))
            equalObjects = false;
        if (equalObjects && !this.getEstiImpManda().equals(instance.getEstiImpManda()))
            equalObjects = false;
        if (equalObjects && !this.getEstiNumAvalu().equals(instance.getEstiNumAvalu()))
            equalObjects = false;
        if (equalObjects && !this.getEstiImpAvalu().equals(instance.getEstiImpAvalu()))
            equalObjects = false;
        if (equalObjects && !this.getEstiImpPresup().equals(instance.getEstiImpPresup()))
            equalObjects = false;
        if (equalObjects && !this.getEstiAnoAltaReg().equals(instance.getEstiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstiMesAltaReg().equals(instance.getEstiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstiDiaAltaReg().equals(instance.getEstiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstiAnoUltMod().equals(instance.getEstiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstiMesUltMod().equals(instance.getEstiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstiDiaUltMod().equals(instance.getEstiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstiCveStNivel().equals(instance.getEstiCveStNivel()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        EPresup result = new EPresup();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstiNumNivel1((BigDecimal) objectData.getData("ESTI_NUM_NIVEL1"));
        result.setEstiNumNivel2((BigDecimal) objectData.getData("ESTI_NUM_NIVEL2"));
        result.setEstiNumNivel3((BigDecimal) objectData.getData("ESTI_NUM_NIVEL3"));
        result.setEstiNumNivel4((BigDecimal) objectData.getData("ESTI_NUM_NIVEL4"));
        result.setEstiNumNivel5((BigDecimal) objectData.getData("ESTI_NUM_NIVEL5"));
        result.setEstiNumAno((BigDecimal) objectData.getData("ESTI_NUM_ANO"));
        result.setEstiNumMes((String) objectData.getData("ESTI_NUM_MES"));
        result.setEstiNumFisos((BigDecimal) objectData.getData("ESTI_NUM_FISOS"));
        result.setEstiImpFisos((BigDecimal) objectData.getData("ESTI_IMP_FISOS"));
        result.setEstiNumManda((BigDecimal) objectData.getData("ESTI_NUM_MANDA"));
        result.setEstiImpManda((BigDecimal) objectData.getData("ESTI_IMP_MANDA"));
        result.setEstiNumAvalu((BigDecimal) objectData.getData("ESTI_NUM_AVALU"));
        result.setEstiImpAvalu((BigDecimal) objectData.getData("ESTI_IMP_AVALU"));
        result.setEstiImpPresup((BigDecimal) objectData.getData("ESTI_IMP_PRESUP"));
        result.setEstiAnoAltaReg((BigDecimal) objectData.getData("ESTI_ANO_ALTA_REG"));
        result.setEstiMesAltaReg((BigDecimal) objectData.getData("ESTI_MES_ALTA_REG"));
        result.setEstiDiaAltaReg((BigDecimal) objectData.getData("ESTI_DIA_ALTA_REG"));
        result.setEstiAnoUltMod((BigDecimal) objectData.getData("ESTI_ANO_ULT_MOD"));
        result.setEstiMesUltMod((BigDecimal) objectData.getData("ESTI_MES_ULT_MOD"));
        result.setEstiDiaUltMod((BigDecimal) objectData.getData("ESTI_DIA_ULT_MOD"));
        result.setEstiCveStNivel((String) objectData.getData("ESTI_CVE_ST_NIVEL"));

        return result;

    }

}
