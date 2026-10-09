package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TABLAS_PK", columns = { "TAB_ID_TABLA", "TAB_NOM_TABLA" }, sequences = { "MANUAL" })
public class Tablas extends DomainObject {

    String tabIdTabla = null;
    String tabNomTabla = null;
    String tabDescTabla = null;
    String tabPrefijoTabla = null;
    String tabCveAreaResp = null;
    String tabCveTipoTabla = null;
    BigDecimal tabCveRestaura = null;
    String tabCvePerRestau = null;
    BigDecimal tabAnoRestaura = null;
    BigDecimal tabMesRestaura = null;
    BigDecimal tabDiaRestaura = null;
    BigDecimal tabCveResgInf = null;
    String tabCvePerResg = null;
    BigDecimal tabAnoResguardo = null;
    BigDecimal tabMesResguardo = null;
    BigDecimal tabDiaResguardo = null;
    BigDecimal tabCveHistorico = null;
    BigDecimal tabAnoAltaReg = null;
    BigDecimal tabMesAltaReg = null;
    BigDecimal tabDiaAltaReg = null;
    BigDecimal tabAnoUltMod = null;
    BigDecimal tabMesUltMod = null;
    BigDecimal tabDiaUltMod = null;
    String tabCveStTablas = null;

    public Tablas() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabIdTabla(String tabIdTabla) {
        this.tabIdTabla = tabIdTabla;
    }

    public String getTabIdTabla() {
        return this.tabIdTabla;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabNomTabla(String tabNomTabla) {
        this.tabNomTabla = tabNomTabla;
    }

    public String getTabNomTabla() {
        return this.tabNomTabla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabDescTabla(String tabDescTabla) {
        this.tabDescTabla = tabDescTabla;
    }

    public String getTabDescTabla() {
        return this.tabDescTabla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabPrefijoTabla(String tabPrefijoTabla) {
        this.tabPrefijoTabla = tabPrefijoTabla;
    }

    public String getTabPrefijoTabla() {
        return this.tabPrefijoTabla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabCveAreaResp(String tabCveAreaResp) {
        this.tabCveAreaResp = tabCveAreaResp;
    }

    public String getTabCveAreaResp() {
        return this.tabCveAreaResp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabCveTipoTabla(String tabCveTipoTabla) {
        this.tabCveTipoTabla = tabCveTipoTabla;
    }

    public String getTabCveTipoTabla() {
        return this.tabCveTipoTabla;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTabCveRestaura(BigDecimal tabCveRestaura) {
        this.tabCveRestaura = tabCveRestaura;
    }

    public BigDecimal getTabCveRestaura() {
        return this.tabCveRestaura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabCvePerRestau(String tabCvePerRestau) {
        this.tabCvePerRestau = tabCvePerRestau;
    }

    public String getTabCvePerRestau() {
        return this.tabCvePerRestau;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTabAnoRestaura(BigDecimal tabAnoRestaura) {
        this.tabAnoRestaura = tabAnoRestaura;
    }

    public BigDecimal getTabAnoRestaura() {
        return this.tabAnoRestaura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTabMesRestaura(BigDecimal tabMesRestaura) {
        this.tabMesRestaura = tabMesRestaura;
    }

    public BigDecimal getTabMesRestaura() {
        return this.tabMesRestaura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTabDiaRestaura(BigDecimal tabDiaRestaura) {
        this.tabDiaRestaura = tabDiaRestaura;
    }

    public BigDecimal getTabDiaRestaura() {
        return this.tabDiaRestaura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTabCveResgInf(BigDecimal tabCveResgInf) {
        this.tabCveResgInf = tabCveResgInf;
    }

    public BigDecimal getTabCveResgInf() {
        return this.tabCveResgInf;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabCvePerResg(String tabCvePerResg) {
        this.tabCvePerResg = tabCvePerResg;
    }

    public String getTabCvePerResg() {
        return this.tabCvePerResg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTabAnoResguardo(BigDecimal tabAnoResguardo) {
        this.tabAnoResguardo = tabAnoResguardo;
    }

    public BigDecimal getTabAnoResguardo() {
        return this.tabAnoResguardo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTabMesResguardo(BigDecimal tabMesResguardo) {
        this.tabMesResguardo = tabMesResguardo;
    }

    public BigDecimal getTabMesResguardo() {
        return this.tabMesResguardo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTabDiaResguardo(BigDecimal tabDiaResguardo) {
        this.tabDiaResguardo = tabDiaResguardo;
    }

    public BigDecimal getTabDiaResguardo() {
        return this.tabDiaResguardo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTabCveHistorico(BigDecimal tabCveHistorico) {
        this.tabCveHistorico = tabCveHistorico;
    }

    public BigDecimal getTabCveHistorico() {
        return this.tabCveHistorico;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTabAnoAltaReg(BigDecimal tabAnoAltaReg) {
        this.tabAnoAltaReg = tabAnoAltaReg;
    }

    public BigDecimal getTabAnoAltaReg() {
        return this.tabAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTabMesAltaReg(BigDecimal tabMesAltaReg) {
        this.tabMesAltaReg = tabMesAltaReg;
    }

    public BigDecimal getTabMesAltaReg() {
        return this.tabMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTabDiaAltaReg(BigDecimal tabDiaAltaReg) {
        this.tabDiaAltaReg = tabDiaAltaReg;
    }

    public BigDecimal getTabDiaAltaReg() {
        return this.tabDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTabAnoUltMod(BigDecimal tabAnoUltMod) {
        this.tabAnoUltMod = tabAnoUltMod;
    }

    public BigDecimal getTabAnoUltMod() {
        return this.tabAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTabMesUltMod(BigDecimal tabMesUltMod) {
        this.tabMesUltMod = tabMesUltMod;
    }

    public BigDecimal getTabMesUltMod() {
        return this.tabMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTabDiaUltMod(BigDecimal tabDiaUltMod) {
        this.tabDiaUltMod = tabDiaUltMod;
    }

    public BigDecimal getTabDiaUltMod() {
        return this.tabDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTabCveStTablas(String tabCveStTablas) {
        this.tabCveStTablas = tabCveStTablas;
    }

    public String getTabCveStTablas() {
        return this.tabCveStTablas;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TABLAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTabIdTabla() != null && "null".equals(this.getTabIdTabla())) {
            conditions += " AND TAB_ID_TABLA IS NULL";
        } else if (this.getTabIdTabla() != null) {
            conditions += " AND TAB_ID_TABLA = ?";
            values.add(this.getTabIdTabla());
        }

        if (this.getTabNomTabla() != null && "null".equals(this.getTabNomTabla())) {
            conditions += " AND TAB_NOM_TABLA IS NULL";
        } else if (this.getTabNomTabla() != null) {
            conditions += " AND TAB_NOM_TABLA = ?";
            values.add(this.getTabNomTabla());
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
        String sql = "SELECT * FROM TABLAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTabIdTabla() != null && "null".equals(this.getTabIdTabla())) {
            conditions += " AND TAB_ID_TABLA IS NULL";
        } else if (this.getTabIdTabla() != null) {
            conditions += " AND TAB_ID_TABLA = ?";
            values.add(this.getTabIdTabla());
        }

        if (this.getTabNomTabla() != null && "null".equals(this.getTabNomTabla())) {
            conditions += " AND TAB_NOM_TABLA IS NULL";
        } else if (this.getTabNomTabla() != null) {
            conditions += " AND TAB_NOM_TABLA = ?";
            values.add(this.getTabNomTabla());
        }

        if (this.getTabDescTabla() != null && "null".equals(this.getTabDescTabla())) {
            conditions += " AND TAB_DESC_TABLA IS NULL";
        } else if (this.getTabDescTabla() != null) {
            conditions += " AND TAB_DESC_TABLA = ?";
            values.add(this.getTabDescTabla());
        }

        if (this.getTabPrefijoTabla() != null && "null".equals(this.getTabPrefijoTabla())) {
            conditions += " AND TAB_PREFIJO_TABLA IS NULL";
        } else if (this.getTabPrefijoTabla() != null) {
            conditions += " AND TAB_PREFIJO_TABLA = ?";
            values.add(this.getTabPrefijoTabla());
        }

        if (this.getTabCveAreaResp() != null && "null".equals(this.getTabCveAreaResp())) {
            conditions += " AND TAB_CVE_AREA_RESP IS NULL";
        } else if (this.getTabCveAreaResp() != null) {
            conditions += " AND TAB_CVE_AREA_RESP = ?";
            values.add(this.getTabCveAreaResp());
        }

        if (this.getTabCveTipoTabla() != null && "null".equals(this.getTabCveTipoTabla())) {
            conditions += " AND TAB_CVE_TIPO_TABLA IS NULL";
        } else if (this.getTabCveTipoTabla() != null) {
            conditions += " AND TAB_CVE_TIPO_TABLA = ?";
            values.add(this.getTabCveTipoTabla());
        }

        if (this.getTabCveRestaura() != null && this.getTabCveRestaura().longValue() == -999) {
            conditions += " AND TAB_CVE_RESTAURA IS NULL";
        } else if (this.getTabCveRestaura() != null) {
            conditions += " AND TAB_CVE_RESTAURA = ?";
            values.add(this.getTabCveRestaura());
        }

        if (this.getTabCvePerRestau() != null && "null".equals(this.getTabCvePerRestau())) {
            conditions += " AND TAB_CVE_PER_RESTAU IS NULL";
        } else if (this.getTabCvePerRestau() != null) {
            conditions += " AND TAB_CVE_PER_RESTAU = ?";
            values.add(this.getTabCvePerRestau());
        }

        if (this.getTabAnoRestaura() != null && this.getTabAnoRestaura().longValue() == -999) {
            conditions += " AND TAB_ANO_RESTAURA IS NULL";
        } else if (this.getTabAnoRestaura() != null) {
            conditions += " AND TAB_ANO_RESTAURA = ?";
            values.add(this.getTabAnoRestaura());
        }

        if (this.getTabMesRestaura() != null && this.getTabMesRestaura().longValue() == -999) {
            conditions += " AND TAB_MES_RESTAURA IS NULL";
        } else if (this.getTabMesRestaura() != null) {
            conditions += " AND TAB_MES_RESTAURA = ?";
            values.add(this.getTabMesRestaura());
        }

        if (this.getTabDiaRestaura() != null && this.getTabDiaRestaura().longValue() == -999) {
            conditions += " AND TAB_DIA_RESTAURA IS NULL";
        } else if (this.getTabDiaRestaura() != null) {
            conditions += " AND TAB_DIA_RESTAURA = ?";
            values.add(this.getTabDiaRestaura());
        }

        if (this.getTabCveResgInf() != null && this.getTabCveResgInf().longValue() == -999) {
            conditions += " AND TAB_CVE_RESG_INF IS NULL";
        } else if (this.getTabCveResgInf() != null) {
            conditions += " AND TAB_CVE_RESG_INF = ?";
            values.add(this.getTabCveResgInf());
        }

        if (this.getTabCvePerResg() != null && "null".equals(this.getTabCvePerResg())) {
            conditions += " AND TAB_CVE_PER_RESG IS NULL";
        } else if (this.getTabCvePerResg() != null) {
            conditions += " AND TAB_CVE_PER_RESG = ?";
            values.add(this.getTabCvePerResg());
        }

        if (this.getTabAnoResguardo() != null && this.getTabAnoResguardo().longValue() == -999) {
            conditions += " AND TAB_ANO_RESGUARDO IS NULL";
        } else if (this.getTabAnoResguardo() != null) {
            conditions += " AND TAB_ANO_RESGUARDO = ?";
            values.add(this.getTabAnoResguardo());
        }

        if (this.getTabMesResguardo() != null && this.getTabMesResguardo().longValue() == -999) {
            conditions += " AND TAB_MES_RESGUARDO IS NULL";
        } else if (this.getTabMesResguardo() != null) {
            conditions += " AND TAB_MES_RESGUARDO = ?";
            values.add(this.getTabMesResguardo());
        }

        if (this.getTabDiaResguardo() != null && this.getTabDiaResguardo().longValue() == -999) {
            conditions += " AND TAB_DIA_RESGUARDO IS NULL";
        } else if (this.getTabDiaResguardo() != null) {
            conditions += " AND TAB_DIA_RESGUARDO = ?";
            values.add(this.getTabDiaResguardo());
        }

        if (this.getTabCveHistorico() != null && this.getTabCveHistorico().longValue() == -999) {
            conditions += " AND TAB_CVE_HISTORICO IS NULL";
        } else if (this.getTabCveHistorico() != null) {
            conditions += " AND TAB_CVE_HISTORICO = ?";
            values.add(this.getTabCveHistorico());
        }

        if (this.getTabAnoAltaReg() != null && this.getTabAnoAltaReg().longValue() == -999) {
            conditions += " AND TAB_ANO_ALTA_REG IS NULL";
        } else if (this.getTabAnoAltaReg() != null) {
            conditions += " AND TAB_ANO_ALTA_REG = ?";
            values.add(this.getTabAnoAltaReg());
        }

        if (this.getTabMesAltaReg() != null && this.getTabMesAltaReg().longValue() == -999) {
            conditions += " AND TAB_MES_ALTA_REG IS NULL";
        } else if (this.getTabMesAltaReg() != null) {
            conditions += " AND TAB_MES_ALTA_REG = ?";
            values.add(this.getTabMesAltaReg());
        }

        if (this.getTabDiaAltaReg() != null && this.getTabDiaAltaReg().longValue() == -999) {
            conditions += " AND TAB_DIA_ALTA_REG IS NULL";
        } else if (this.getTabDiaAltaReg() != null) {
            conditions += " AND TAB_DIA_ALTA_REG = ?";
            values.add(this.getTabDiaAltaReg());
        }

        if (this.getTabAnoUltMod() != null && this.getTabAnoUltMod().longValue() == -999) {
            conditions += " AND TAB_ANO_ULT_MOD IS NULL";
        } else if (this.getTabAnoUltMod() != null) {
            conditions += " AND TAB_ANO_ULT_MOD = ?";
            values.add(this.getTabAnoUltMod());
        }

        if (this.getTabMesUltMod() != null && this.getTabMesUltMod().longValue() == -999) {
            conditions += " AND TAB_MES_ULT_MOD IS NULL";
        } else if (this.getTabMesUltMod() != null) {
            conditions += " AND TAB_MES_ULT_MOD = ?";
            values.add(this.getTabMesUltMod());
        }

        if (this.getTabDiaUltMod() != null && this.getTabDiaUltMod().longValue() == -999) {
            conditions += " AND TAB_DIA_ULT_MOD IS NULL";
        } else if (this.getTabDiaUltMod() != null) {
            conditions += " AND TAB_DIA_ULT_MOD = ?";
            values.add(this.getTabDiaUltMod());
        }

        if (this.getTabCveStTablas() != null && "null".equals(this.getTabCveStTablas())) {
            conditions += " AND TAB_CVE_ST_TABLAS IS NULL";
        } else if (this.getTabCveStTablas() != null) {
            conditions += " AND TAB_CVE_ST_TABLAS = ?";
            values.add(this.getTabCveStTablas());
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
        String sql = "UPDATE TABLAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TAB_ID_TABLA = ?";
        pkValues.add(this.getTabIdTabla());
        conditions += " AND TAB_NOM_TABLA = ?";
        pkValues.add(this.getTabNomTabla());
        fields += " TAB_DESC_TABLA = ?, ";
        values.add(this.getTabDescTabla());
        fields += " TAB_PREFIJO_TABLA = ?, ";
        values.add(this.getTabPrefijoTabla());
        fields += " TAB_CVE_AREA_RESP = ?, ";
        values.add(this.getTabCveAreaResp());
        fields += " TAB_CVE_TIPO_TABLA = ?, ";
        values.add(this.getTabCveTipoTabla());
        fields += " TAB_CVE_RESTAURA = ?, ";
        values.add(this.getTabCveRestaura());
        fields += " TAB_CVE_PER_RESTAU = ?, ";
        values.add(this.getTabCvePerRestau());
        fields += " TAB_ANO_RESTAURA = ?, ";
        values.add(this.getTabAnoRestaura());
        fields += " TAB_MES_RESTAURA = ?, ";
        values.add(this.getTabMesRestaura());
        fields += " TAB_DIA_RESTAURA = ?, ";
        values.add(this.getTabDiaRestaura());
        fields += " TAB_CVE_RESG_INF = ?, ";
        values.add(this.getTabCveResgInf());
        fields += " TAB_CVE_PER_RESG = ?, ";
        values.add(this.getTabCvePerResg());
        fields += " TAB_ANO_RESGUARDO = ?, ";
        values.add(this.getTabAnoResguardo());
        fields += " TAB_MES_RESGUARDO = ?, ";
        values.add(this.getTabMesResguardo());
        fields += " TAB_DIA_RESGUARDO = ?, ";
        values.add(this.getTabDiaResguardo());
        fields += " TAB_CVE_HISTORICO = ?, ";
        values.add(this.getTabCveHistorico());
        fields += " TAB_ANO_ALTA_REG = ?, ";
        values.add(this.getTabAnoAltaReg());
        fields += " TAB_MES_ALTA_REG = ?, ";
        values.add(this.getTabMesAltaReg());
        fields += " TAB_DIA_ALTA_REG = ?, ";
        values.add(this.getTabDiaAltaReg());
        fields += " TAB_ANO_ULT_MOD = ?, ";
        values.add(this.getTabAnoUltMod());
        fields += " TAB_MES_ULT_MOD = ?, ";
        values.add(this.getTabMesUltMod());
        fields += " TAB_DIA_ULT_MOD = ?, ";
        values.add(this.getTabDiaUltMod());
        fields += " TAB_CVE_ST_TABLAS = ?, ";
        values.add(this.getTabCveStTablas());
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
        String sql = "INSERT INTO TABLAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TAB_ID_TABLA";
        fieldValues += ", ?";
        values.add(this.getTabIdTabla());

        fields += ", TAB_NOM_TABLA";
        fieldValues += ", ?";
        values.add(this.getTabNomTabla());

        fields += ", TAB_DESC_TABLA";
        fieldValues += ", ?";
        values.add(this.getTabDescTabla());

        fields += ", TAB_PREFIJO_TABLA";
        fieldValues += ", ?";
        values.add(this.getTabPrefijoTabla());

        fields += ", TAB_CVE_AREA_RESP";
        fieldValues += ", ?";
        values.add(this.getTabCveAreaResp());

        fields += ", TAB_CVE_TIPO_TABLA";
        fieldValues += ", ?";
        values.add(this.getTabCveTipoTabla());

        fields += ", TAB_CVE_RESTAURA";
        fieldValues += ", ?";
        values.add(this.getTabCveRestaura());

        fields += ", TAB_CVE_PER_RESTAU";
        fieldValues += ", ?";
        values.add(this.getTabCvePerRestau());

        fields += ", TAB_ANO_RESTAURA";
        fieldValues += ", ?";
        values.add(this.getTabAnoRestaura());

        fields += ", TAB_MES_RESTAURA";
        fieldValues += ", ?";
        values.add(this.getTabMesRestaura());

        fields += ", TAB_DIA_RESTAURA";
        fieldValues += ", ?";
        values.add(this.getTabDiaRestaura());

        fields += ", TAB_CVE_RESG_INF";
        fieldValues += ", ?";
        values.add(this.getTabCveResgInf());

        fields += ", TAB_CVE_PER_RESG";
        fieldValues += ", ?";
        values.add(this.getTabCvePerResg());

        fields += ", TAB_ANO_RESGUARDO";
        fieldValues += ", ?";
        values.add(this.getTabAnoResguardo());

        fields += ", TAB_MES_RESGUARDO";
        fieldValues += ", ?";
        values.add(this.getTabMesResguardo());

        fields += ", TAB_DIA_RESGUARDO";
        fieldValues += ", ?";
        values.add(this.getTabDiaResguardo());

        fields += ", TAB_CVE_HISTORICO";
        fieldValues += ", ?";
        values.add(this.getTabCveHistorico());

        fields += ", TAB_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTabAnoAltaReg());

        fields += ", TAB_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTabMesAltaReg());

        fields += ", TAB_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTabDiaAltaReg());

        fields += ", TAB_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTabAnoUltMod());

        fields += ", TAB_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTabMesUltMod());

        fields += ", TAB_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTabDiaUltMod());

        fields += ", TAB_CVE_ST_TABLAS";
        fieldValues += ", ?";
        values.add(this.getTabCveStTablas());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TABLAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TAB_ID_TABLA = ?";
        values.add(this.getTabIdTabla());
        conditions += " AND TAB_NOM_TABLA = ?";
        values.add(this.getTabNomTabla());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Tablas instance = (Tablas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTabIdTabla().equals(instance.getTabIdTabla()))
            equalObjects = false;
        if (equalObjects && !this.getTabNomTabla().equals(instance.getTabNomTabla()))
            equalObjects = false;
        if (equalObjects && !this.getTabDescTabla().equals(instance.getTabDescTabla()))
            equalObjects = false;
        if (equalObjects && !this.getTabPrefijoTabla().equals(instance.getTabPrefijoTabla()))
            equalObjects = false;
        if (equalObjects && !this.getTabCveAreaResp().equals(instance.getTabCveAreaResp()))
            equalObjects = false;
        if (equalObjects && !this.getTabCveTipoTabla().equals(instance.getTabCveTipoTabla()))
            equalObjects = false;
        if (equalObjects && !this.getTabCveRestaura().equals(instance.getTabCveRestaura()))
            equalObjects = false;
        if (equalObjects && !this.getTabCvePerRestau().equals(instance.getTabCvePerRestau()))
            equalObjects = false;
        if (equalObjects && !this.getTabAnoRestaura().equals(instance.getTabAnoRestaura()))
            equalObjects = false;
        if (equalObjects && !this.getTabMesRestaura().equals(instance.getTabMesRestaura()))
            equalObjects = false;
        if (equalObjects && !this.getTabDiaRestaura().equals(instance.getTabDiaRestaura()))
            equalObjects = false;
        if (equalObjects && !this.getTabCveResgInf().equals(instance.getTabCveResgInf()))
            equalObjects = false;
        if (equalObjects && !this.getTabCvePerResg().equals(instance.getTabCvePerResg()))
            equalObjects = false;
        if (equalObjects && !this.getTabAnoResguardo().equals(instance.getTabAnoResguardo()))
            equalObjects = false;
        if (equalObjects && !this.getTabMesResguardo().equals(instance.getTabMesResguardo()))
            equalObjects = false;
        if (equalObjects && !this.getTabDiaResguardo().equals(instance.getTabDiaResguardo()))
            equalObjects = false;
        if (equalObjects && !this.getTabCveHistorico().equals(instance.getTabCveHistorico()))
            equalObjects = false;
        if (equalObjects && !this.getTabAnoAltaReg().equals(instance.getTabAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTabMesAltaReg().equals(instance.getTabMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTabDiaAltaReg().equals(instance.getTabDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTabAnoUltMod().equals(instance.getTabAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTabMesUltMod().equals(instance.getTabMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTabDiaUltMod().equals(instance.getTabDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTabCveStTablas().equals(instance.getTabCveStTablas()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Tablas result = new Tablas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTabIdTabla((String) objectData.getData("TAB_ID_TABLA"));
        result.setTabNomTabla((String) objectData.getData("TAB_NOM_TABLA"));
        result.setTabDescTabla((String) objectData.getData("TAB_DESC_TABLA"));
        result.setTabPrefijoTabla((String) objectData.getData("TAB_PREFIJO_TABLA"));
        result.setTabCveAreaResp((String) objectData.getData("TAB_CVE_AREA_RESP"));
        result.setTabCveTipoTabla((String) objectData.getData("TAB_CVE_TIPO_TABLA"));
        result.setTabCveRestaura((BigDecimal) objectData.getData("TAB_CVE_RESTAURA"));
        result.setTabCvePerRestau((String) objectData.getData("TAB_CVE_PER_RESTAU"));
        result.setTabAnoRestaura((BigDecimal) objectData.getData("TAB_ANO_RESTAURA"));
        result.setTabMesRestaura((BigDecimal) objectData.getData("TAB_MES_RESTAURA"));
        result.setTabDiaRestaura((BigDecimal) objectData.getData("TAB_DIA_RESTAURA"));
        result.setTabCveResgInf((BigDecimal) objectData.getData("TAB_CVE_RESG_INF"));
        result.setTabCvePerResg((String) objectData.getData("TAB_CVE_PER_RESG"));
        result.setTabAnoResguardo((BigDecimal) objectData.getData("TAB_ANO_RESGUARDO"));
        result.setTabMesResguardo((BigDecimal) objectData.getData("TAB_MES_RESGUARDO"));
        result.setTabDiaResguardo((BigDecimal) objectData.getData("TAB_DIA_RESGUARDO"));
        result.setTabCveHistorico((BigDecimal) objectData.getData("TAB_CVE_HISTORICO"));
        result.setTabAnoAltaReg((BigDecimal) objectData.getData("TAB_ANO_ALTA_REG"));
        result.setTabMesAltaReg((BigDecimal) objectData.getData("TAB_MES_ALTA_REG"));
        result.setTabDiaAltaReg((BigDecimal) objectData.getData("TAB_DIA_ALTA_REG"));
        result.setTabAnoUltMod((BigDecimal) objectData.getData("TAB_ANO_ULT_MOD"));
        result.setTabMesUltMod((BigDecimal) objectData.getData("TAB_MES_ULT_MOD"));
        result.setTabDiaUltMod((BigDecimal) objectData.getData("TAB_DIA_ULT_MOD"));
        result.setTabCveStTablas((String) objectData.getData("TAB_CVE_ST_TABLAS"));

        return result;

    }

}
