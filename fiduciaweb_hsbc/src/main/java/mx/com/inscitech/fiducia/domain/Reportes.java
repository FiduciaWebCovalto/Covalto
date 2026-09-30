package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPORTES_PK", columns = { "REP_NUM_REPORTE" }, sequences = { "MAX" })
public class Reportes extends DomainObject {

    BigDecimal repNumReporte = null;
    String repNomFisicoRep = null;
    String repNomReporte = null;
    String repDescReporte = null;
    BigDecimal repCveCliente = null;
    BigDecimal repCveUsuario = null;
    BigDecimal repCveOficial = null;
    String repTipoPapeleria = null;
    BigDecimal repImpCostoHoja = null;
    BigDecimal repAnoAltaReg = null;
    BigDecimal repMesAltaReg = null;
    BigDecimal repDiaAltaReg = null;
    BigDecimal repAnoUltMod = null;
    BigDecimal repMesUltMod = null;
    BigDecimal repDiaUltMod = null;
    String repCveStReporte = null;

    public Reportes() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumReporte(BigDecimal repNumReporte) {
        this.repNumReporte = repNumReporte;
    }

    public BigDecimal getRepNumReporte() {
        return this.repNumReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepNomFisicoRep(String repNomFisicoRep) {
        this.repNomFisicoRep = repNomFisicoRep;
    }

    public String getRepNomFisicoRep() {
        return this.repNomFisicoRep;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepNomReporte(String repNomReporte) {
        this.repNomReporte = repNomReporte;
    }

    public String getRepNomReporte() {
        return this.repNomReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepDescReporte(String repDescReporte) {
        this.repDescReporte = repDescReporte;
    }

    public String getRepDescReporte() {
        return this.repDescReporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepCveCliente(BigDecimal repCveCliente) {
        this.repCveCliente = repCveCliente;
    }

    public BigDecimal getRepCveCliente() {
        return this.repCveCliente;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepCveUsuario(BigDecimal repCveUsuario) {
        this.repCveUsuario = repCveUsuario;
    }

    public BigDecimal getRepCveUsuario() {
        return this.repCveUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepCveOficial(BigDecimal repCveOficial) {
        this.repCveOficial = repCveOficial;
    }

    public BigDecimal getRepCveOficial() {
        return this.repCveOficial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepTipoPapeleria(String repTipoPapeleria) {
        this.repTipoPapeleria = repTipoPapeleria;
    }

    public String getRepTipoPapeleria() {
        return this.repTipoPapeleria;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRepImpCostoHoja(BigDecimal repImpCostoHoja) {
        this.repImpCostoHoja = repImpCostoHoja;
    }

    public BigDecimal getRepImpCostoHoja() {
        return this.repImpCostoHoja;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRepAnoAltaReg(BigDecimal repAnoAltaReg) {
        this.repAnoAltaReg = repAnoAltaReg;
    }

    public BigDecimal getRepAnoAltaReg() {
        return this.repAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRepMesAltaReg(BigDecimal repMesAltaReg) {
        this.repMesAltaReg = repMesAltaReg;
    }

    public BigDecimal getRepMesAltaReg() {
        return this.repMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRepDiaAltaReg(BigDecimal repDiaAltaReg) {
        this.repDiaAltaReg = repDiaAltaReg;
    }

    public BigDecimal getRepDiaAltaReg() {
        return this.repDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRepAnoUltMod(BigDecimal repAnoUltMod) {
        this.repAnoUltMod = repAnoUltMod;
    }

    public BigDecimal getRepAnoUltMod() {
        return this.repAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRepMesUltMod(BigDecimal repMesUltMod) {
        this.repMesUltMod = repMesUltMod;
    }

    public BigDecimal getRepMesUltMod() {
        return this.repMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRepDiaUltMod(BigDecimal repDiaUltMod) {
        this.repDiaUltMod = repDiaUltMod;
    }

    public BigDecimal getRepDiaUltMod() {
        return this.repDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepCveStReporte(String repCveStReporte) {
        this.repCveStReporte = repCveStReporte;
    }

    public String getRepCveStReporte() {
        return this.repCveStReporte;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPORTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepNumReporte() != null && this.getRepNumReporte().longValue() == -999) {
            conditions += " AND REP_NUM_REPORTE IS NULL";
        } else if (this.getRepNumReporte() != null) {
            conditions += " AND REP_NUM_REPORTE = ?";
            values.add(this.getRepNumReporte());
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
        String sql = "SELECT * FROM REPORTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepNumReporte() != null && this.getRepNumReporte().longValue() == -999) {
            conditions += " AND REP_NUM_REPORTE IS NULL";
        } else if (this.getRepNumReporte() != null) {
            conditions += " AND REP_NUM_REPORTE = ?";
            values.add(this.getRepNumReporte());
        }

        if (this.getRepNomFisicoRep() != null && "null".equals(this.getRepNomFisicoRep())) {
            conditions += " AND REP_NOM_FISICO_REP IS NULL";
        } else if (this.getRepNomFisicoRep() != null) {
            conditions += " AND REP_NOM_FISICO_REP = ?";
            values.add(this.getRepNomFisicoRep());
        }

        if (this.getRepNomReporte() != null && "null".equals(this.getRepNomReporte())) {
            conditions += " AND REP_NOM_REPORTE IS NULL";
        } else if (this.getRepNomReporte() != null) {
            conditions += " AND REP_NOM_REPORTE = ?";
            values.add(this.getRepNomReporte());
        }

        if (this.getRepDescReporte() != null && "null".equals(this.getRepDescReporte())) {
            conditions += " AND REP_DESC_REPORTE IS NULL";
        } else if (this.getRepDescReporte() != null) {
            conditions += " AND REP_DESC_REPORTE = ?";
            values.add(this.getRepDescReporte());
        }

        if (this.getRepCveCliente() != null && this.getRepCveCliente().longValue() == -999) {
            conditions += " AND REP_CVE_CLIENTE IS NULL";
        } else if (this.getRepCveCliente() != null) {
            conditions += " AND REP_CVE_CLIENTE = ?";
            values.add(this.getRepCveCliente());
        }

        if (this.getRepCveUsuario() != null && this.getRepCveUsuario().longValue() == -999) {
            conditions += " AND REP_CVE_USUARIO IS NULL";
        } else if (this.getRepCveUsuario() != null) {
            conditions += " AND REP_CVE_USUARIO = ?";
            values.add(this.getRepCveUsuario());
        }

        if (this.getRepCveOficial() != null && this.getRepCveOficial().longValue() == -999) {
            conditions += " AND REP_CVE_OFICIAL IS NULL";
        } else if (this.getRepCveOficial() != null) {
            conditions += " AND REP_CVE_OFICIAL = ?";
            values.add(this.getRepCveOficial());
        }

        if (this.getRepTipoPapeleria() != null && "null".equals(this.getRepTipoPapeleria())) {
            conditions += " AND REP_TIPO_PAPELERIA IS NULL";
        } else if (this.getRepTipoPapeleria() != null) {
            conditions += " AND REP_TIPO_PAPELERIA = ?";
            values.add(this.getRepTipoPapeleria());
        }

        if (this.getRepImpCostoHoja() != null && this.getRepImpCostoHoja().longValue() == -999) {
            conditions += " AND REP_IMP_COSTO_HOJA IS NULL";
        } else if (this.getRepImpCostoHoja() != null) {
            conditions += " AND REP_IMP_COSTO_HOJA = ?";
            values.add(this.getRepImpCostoHoja());
        }

        if (this.getRepAnoAltaReg() != null && this.getRepAnoAltaReg().longValue() == -999) {
            conditions += " AND REP_ANO_ALTA_REG IS NULL";
        } else if (this.getRepAnoAltaReg() != null) {
            conditions += " AND REP_ANO_ALTA_REG = ?";
            values.add(this.getRepAnoAltaReg());
        }

        if (this.getRepMesAltaReg() != null && this.getRepMesAltaReg().longValue() == -999) {
            conditions += " AND REP_MES_ALTA_REG IS NULL";
        } else if (this.getRepMesAltaReg() != null) {
            conditions += " AND REP_MES_ALTA_REG = ?";
            values.add(this.getRepMesAltaReg());
        }

        if (this.getRepDiaAltaReg() != null && this.getRepDiaAltaReg().longValue() == -999) {
            conditions += " AND REP_DIA_ALTA_REG IS NULL";
        } else if (this.getRepDiaAltaReg() != null) {
            conditions += " AND REP_DIA_ALTA_REG = ?";
            values.add(this.getRepDiaAltaReg());
        }

        if (this.getRepAnoUltMod() != null && this.getRepAnoUltMod().longValue() == -999) {
            conditions += " AND REP_ANO_ULT_MOD IS NULL";
        } else if (this.getRepAnoUltMod() != null) {
            conditions += " AND REP_ANO_ULT_MOD = ?";
            values.add(this.getRepAnoUltMod());
        }

        if (this.getRepMesUltMod() != null && this.getRepMesUltMod().longValue() == -999) {
            conditions += " AND REP_MES_ULT_MOD IS NULL";
        } else if (this.getRepMesUltMod() != null) {
            conditions += " AND REP_MES_ULT_MOD = ?";
            values.add(this.getRepMesUltMod());
        }

        if (this.getRepDiaUltMod() != null && this.getRepDiaUltMod().longValue() == -999) {
            conditions += " AND REP_DIA_ULT_MOD IS NULL";
        } else if (this.getRepDiaUltMod() != null) {
            conditions += " AND REP_DIA_ULT_MOD = ?";
            values.add(this.getRepDiaUltMod());
        }

        if (this.getRepCveStReporte() != null && "null".equals(this.getRepCveStReporte())) {
            conditions += " AND REP_CVE_ST_REPORTE IS NULL";
        } else if (this.getRepCveStReporte() != null) {
            conditions += " AND REP_CVE_ST_REPORTE = ?";
            values.add(this.getRepCveStReporte());
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
        String sql = "UPDATE REPORTES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REP_NUM_REPORTE = ?";
        pkValues.add(this.getRepNumReporte());
        fields += " REP_NOM_FISICO_REP = ?, ";
        values.add(this.getRepNomFisicoRep());
        fields += " REP_NOM_REPORTE = ?, ";
        values.add(this.getRepNomReporte());
        fields += " REP_DESC_REPORTE = ?, ";
        values.add(this.getRepDescReporte());
        fields += " REP_CVE_CLIENTE = ?, ";
        values.add(this.getRepCveCliente());
        fields += " REP_CVE_USUARIO = ?, ";
        values.add(this.getRepCveUsuario());
        fields += " REP_CVE_OFICIAL = ?, ";
        values.add(this.getRepCveOficial());
        fields += " REP_TIPO_PAPELERIA = ?, ";
        values.add(this.getRepTipoPapeleria());
        fields += " REP_IMP_COSTO_HOJA = ?, ";
        values.add(this.getRepImpCostoHoja());
        fields += " REP_ANO_ALTA_REG = ?, ";
        values.add(this.getRepAnoAltaReg());
        fields += " REP_MES_ALTA_REG = ?, ";
        values.add(this.getRepMesAltaReg());
        fields += " REP_DIA_ALTA_REG = ?, ";
        values.add(this.getRepDiaAltaReg());
        fields += " REP_ANO_ULT_MOD = ?, ";
        values.add(this.getRepAnoUltMod());
        fields += " REP_MES_ULT_MOD = ?, ";
        values.add(this.getRepMesUltMod());
        fields += " REP_DIA_ULT_MOD = ?, ";
        values.add(this.getRepDiaUltMod());
        fields += " REP_CVE_ST_REPORTE = ?, ";
        values.add(this.getRepCveStReporte());
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
        String sql = "INSERT INTO REPORTES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REP_NUM_REPORTE";
        fieldValues += ", ?";
        values.add(this.getRepNumReporte());

        fields += ", REP_NOM_FISICO_REP";
        fieldValues += ", ?";
        values.add(this.getRepNomFisicoRep());

        fields += ", REP_NOM_REPORTE";
        fieldValues += ", ?";
        values.add(this.getRepNomReporte());

        fields += ", REP_DESC_REPORTE";
        fieldValues += ", ?";
        values.add(this.getRepDescReporte());

        fields += ", REP_CVE_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getRepCveCliente());

        fields += ", REP_CVE_USUARIO";
        fieldValues += ", ?";
        values.add(this.getRepCveUsuario());

        fields += ", REP_CVE_OFICIAL";
        fieldValues += ", ?";
        values.add(this.getRepCveOficial());

        fields += ", REP_TIPO_PAPELERIA";
        fieldValues += ", ?";
        values.add(this.getRepTipoPapeleria());

        fields += ", REP_IMP_COSTO_HOJA";
        fieldValues += ", ?";
        values.add(this.getRepImpCostoHoja());

        fields += ", REP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRepAnoAltaReg());

        fields += ", REP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRepMesAltaReg());

        fields += ", REP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRepDiaAltaReg());

        fields += ", REP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRepAnoUltMod());

        fields += ", REP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRepMesUltMod());

        fields += ", REP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRepDiaUltMod());

        fields += ", REP_CVE_ST_REPORTE";
        fieldValues += ", ?";
        values.add(this.getRepCveStReporte());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPORTES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REP_NUM_REPORTE = ?";
        values.add(this.getRepNumReporte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Reportes instance = (Reportes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRepNumReporte().equals(instance.getRepNumReporte()))
            equalObjects = false;
        if (equalObjects && !this.getRepNomFisicoRep().equals(instance.getRepNomFisicoRep()))
            equalObjects = false;
        if (equalObjects && !this.getRepNomReporte().equals(instance.getRepNomReporte()))
            equalObjects = false;
        if (equalObjects && !this.getRepDescReporte().equals(instance.getRepDescReporte()))
            equalObjects = false;
        if (equalObjects && !this.getRepCveCliente().equals(instance.getRepCveCliente()))
            equalObjects = false;
        if (equalObjects && !this.getRepCveUsuario().equals(instance.getRepCveUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getRepCveOficial().equals(instance.getRepCveOficial()))
            equalObjects = false;
        if (equalObjects && !this.getRepTipoPapeleria().equals(instance.getRepTipoPapeleria()))
            equalObjects = false;
        if (equalObjects && !this.getRepImpCostoHoja().equals(instance.getRepImpCostoHoja()))
            equalObjects = false;
        if (equalObjects && !this.getRepAnoAltaReg().equals(instance.getRepAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRepMesAltaReg().equals(instance.getRepMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRepDiaAltaReg().equals(instance.getRepDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRepAnoUltMod().equals(instance.getRepAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRepMesUltMod().equals(instance.getRepMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRepDiaUltMod().equals(instance.getRepDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRepCveStReporte().equals(instance.getRepCveStReporte()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Reportes result = new Reportes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRepNumReporte((BigDecimal) objectData.getData("REP_NUM_REPORTE"));
        result.setRepNomFisicoRep((String) objectData.getData("REP_NOM_FISICO_REP"));
        result.setRepNomReporte((String) objectData.getData("REP_NOM_REPORTE"));
        result.setRepDescReporte((String) objectData.getData("REP_DESC_REPORTE"));
        result.setRepCveCliente((BigDecimal) objectData.getData("REP_CVE_CLIENTE"));
        result.setRepCveUsuario((BigDecimal) objectData.getData("REP_CVE_USUARIO"));
        result.setRepCveOficial((BigDecimal) objectData.getData("REP_CVE_OFICIAL"));
        result.setRepTipoPapeleria((String) objectData.getData("REP_TIPO_PAPELERIA"));
        result.setRepImpCostoHoja((BigDecimal) objectData.getData("REP_IMP_COSTO_HOJA"));
        result.setRepAnoAltaReg((BigDecimal) objectData.getData("REP_ANO_ALTA_REG"));
        result.setRepMesAltaReg((BigDecimal) objectData.getData("REP_MES_ALTA_REG"));
        result.setRepDiaAltaReg((BigDecimal) objectData.getData("REP_DIA_ALTA_REG"));
        result.setRepAnoUltMod((BigDecimal) objectData.getData("REP_ANO_ULT_MOD"));
        result.setRepMesUltMod((BigDecimal) objectData.getData("REP_MES_ULT_MOD"));
        result.setRepDiaUltMod((BigDecimal) objectData.getData("REP_DIA_ULT_MOD"));
        result.setRepCveStReporte((String) objectData.getData("REP_CVE_ST_REPORTE"));

        return result;

    }

}
