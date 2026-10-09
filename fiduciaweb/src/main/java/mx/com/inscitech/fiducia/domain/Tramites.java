package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TRAMITES_PK", columns = { "TRA_NUM_TRAMITE" }, sequences = { "MAX" })
public class Tramites extends DomainObject {

    BigDecimal traNumTramite = null;
    String traNomTramite = null;
    String traCicloAplica = null;
    BigDecimal traTarifaTram = null;
    BigDecimal traNotEjecTram = null;
    BigDecimal traGesEjecTram = null;
    BigDecimal traValEjecTram = null;
    BigDecimal traAnoAltaReg = null;
    BigDecimal traMesAltaReg = null;
    BigDecimal traDiaAltaReg = null;
    BigDecimal traAnoUltMod = null;
    BigDecimal traMesUltMod = null;
    BigDecimal traDiaUltMod = null;
    String traCveStTramite = null;

    public Tramites() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumTramite(BigDecimal traNumTramite) {
        this.traNumTramite = traNumTramite;
    }

    public BigDecimal getTraNumTramite() {
        return this.traNumTramite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraNomTramite(String traNomTramite) {
        this.traNomTramite = traNomTramite;
    }

    public String getTraNomTramite() {
        return this.traNomTramite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraCicloAplica(String traCicloAplica) {
        this.traCicloAplica = traCicloAplica;
    }

    public String getTraCicloAplica() {
        return this.traCicloAplica;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTraTarifaTram(BigDecimal traTarifaTram) {
        this.traTarifaTram = traTarifaTram;
    }

    public BigDecimal getTraTarifaTram() {
        return this.traTarifaTram;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTraNotEjecTram(BigDecimal traNotEjecTram) {
        this.traNotEjecTram = traNotEjecTram;
    }

    public BigDecimal getTraNotEjecTram() {
        return this.traNotEjecTram;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTraGesEjecTram(BigDecimal traGesEjecTram) {
        this.traGesEjecTram = traGesEjecTram;
    }

    public BigDecimal getTraGesEjecTram() {
        return this.traGesEjecTram;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTraValEjecTram(BigDecimal traValEjecTram) {
        this.traValEjecTram = traValEjecTram;
    }

    public BigDecimal getTraValEjecTram() {
        return this.traValEjecTram;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTraAnoAltaReg(BigDecimal traAnoAltaReg) {
        this.traAnoAltaReg = traAnoAltaReg;
    }

    public BigDecimal getTraAnoAltaReg() {
        return this.traAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraMesAltaReg(BigDecimal traMesAltaReg) {
        this.traMesAltaReg = traMesAltaReg;
    }

    public BigDecimal getTraMesAltaReg() {
        return this.traMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraDiaAltaReg(BigDecimal traDiaAltaReg) {
        this.traDiaAltaReg = traDiaAltaReg;
    }

    public BigDecimal getTraDiaAltaReg() {
        return this.traDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTraAnoUltMod(BigDecimal traAnoUltMod) {
        this.traAnoUltMod = traAnoUltMod;
    }

    public BigDecimal getTraAnoUltMod() {
        return this.traAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraMesUltMod(BigDecimal traMesUltMod) {
        this.traMesUltMod = traMesUltMod;
    }

    public BigDecimal getTraMesUltMod() {
        return this.traMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraDiaUltMod(BigDecimal traDiaUltMod) {
        this.traDiaUltMod = traDiaUltMod;
    }

    public BigDecimal getTraDiaUltMod() {
        return this.traDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraCveStTramite(String traCveStTramite) {
        this.traCveStTramite = traCveStTramite;
    }

    public String getTraCveStTramite() {
        return this.traCveStTramite;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TRAMITES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTraNumTramite() != null && this.getTraNumTramite().longValue() == -999) {
            conditions += " AND TRA_NUM_TRAMITE IS NULL";
        } else if (this.getTraNumTramite() != null) {
            conditions += " AND TRA_NUM_TRAMITE = ?";
            values.add(this.getTraNumTramite());
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
        String sql = "SELECT * FROM TRAMITES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTraNumTramite() != null && this.getTraNumTramite().longValue() == -999) {
            conditions += " AND TRA_NUM_TRAMITE IS NULL";
        } else if (this.getTraNumTramite() != null) {
            conditions += " AND TRA_NUM_TRAMITE = ?";
            values.add(this.getTraNumTramite());
        }

        if (this.getTraNomTramite() != null && "null".equals(this.getTraNomTramite())) {
            conditions += " AND TRA_NOM_TRAMITE IS NULL";
        } else if (this.getTraNomTramite() != null) {
            conditions += " AND TRA_NOM_TRAMITE = ?";
            values.add(this.getTraNomTramite());
        }

        if (this.getTraCicloAplica() != null && "null".equals(this.getTraCicloAplica())) {
            conditions += " AND TRA_CICLO_APLICA IS NULL";
        } else if (this.getTraCicloAplica() != null) {
            conditions += " AND TRA_CICLO_APLICA = ?";
            values.add(this.getTraCicloAplica());
        }

        if (this.getTraTarifaTram() != null && this.getTraTarifaTram().longValue() == -999) {
            conditions += " AND TRA_TARIFA_TRAM IS NULL";
        } else if (this.getTraTarifaTram() != null) {
            conditions += " AND TRA_TARIFA_TRAM = ?";
            values.add(this.getTraTarifaTram());
        }

        if (this.getTraNotEjecTram() != null && this.getTraNotEjecTram().longValue() == -999) {
            conditions += " AND TRA_NOT_EJEC_TRAM IS NULL";
        } else if (this.getTraNotEjecTram() != null) {
            conditions += " AND TRA_NOT_EJEC_TRAM = ?";
            values.add(this.getTraNotEjecTram());
        }

        if (this.getTraGesEjecTram() != null && this.getTraGesEjecTram().longValue() == -999) {
            conditions += " AND TRA_GES_EJEC_TRAM IS NULL";
        } else if (this.getTraGesEjecTram() != null) {
            conditions += " AND TRA_GES_EJEC_TRAM = ?";
            values.add(this.getTraGesEjecTram());
        }

        if (this.getTraValEjecTram() != null && this.getTraValEjecTram().longValue() == -999) {
            conditions += " AND TRA_VAL_EJEC_TRAM IS NULL";
        } else if (this.getTraValEjecTram() != null) {
            conditions += " AND TRA_VAL_EJEC_TRAM = ?";
            values.add(this.getTraValEjecTram());
        }

        if (this.getTraAnoAltaReg() != null && this.getTraAnoAltaReg().longValue() == -999) {
            conditions += " AND TRA_ANO_ALTA_REG IS NULL";
        } else if (this.getTraAnoAltaReg() != null) {
            conditions += " AND TRA_ANO_ALTA_REG = ?";
            values.add(this.getTraAnoAltaReg());
        }

        if (this.getTraMesAltaReg() != null && this.getTraMesAltaReg().longValue() == -999) {
            conditions += " AND TRA_MES_ALTA_REG IS NULL";
        } else if (this.getTraMesAltaReg() != null) {
            conditions += " AND TRA_MES_ALTA_REG = ?";
            values.add(this.getTraMesAltaReg());
        }

        if (this.getTraDiaAltaReg() != null && this.getTraDiaAltaReg().longValue() == -999) {
            conditions += " AND TRA_DIA_ALTA_REG IS NULL";
        } else if (this.getTraDiaAltaReg() != null) {
            conditions += " AND TRA_DIA_ALTA_REG = ?";
            values.add(this.getTraDiaAltaReg());
        }

        if (this.getTraAnoUltMod() != null && this.getTraAnoUltMod().longValue() == -999) {
            conditions += " AND TRA_ANO_ULT_MOD IS NULL";
        } else if (this.getTraAnoUltMod() != null) {
            conditions += " AND TRA_ANO_ULT_MOD = ?";
            values.add(this.getTraAnoUltMod());
        }

        if (this.getTraMesUltMod() != null && this.getTraMesUltMod().longValue() == -999) {
            conditions += " AND TRA_MES_ULT_MOD IS NULL";
        } else if (this.getTraMesUltMod() != null) {
            conditions += " AND TRA_MES_ULT_MOD = ?";
            values.add(this.getTraMesUltMod());
        }

        if (this.getTraDiaUltMod() != null && this.getTraDiaUltMod().longValue() == -999) {
            conditions += " AND TRA_DIA_ULT_MOD IS NULL";
        } else if (this.getTraDiaUltMod() != null) {
            conditions += " AND TRA_DIA_ULT_MOD = ?";
            values.add(this.getTraDiaUltMod());
        }

        if (this.getTraCveStTramite() != null && "null".equals(this.getTraCveStTramite())) {
            conditions += " AND TRA_CVE_ST_TRAMITE IS NULL";
        } else if (this.getTraCveStTramite() != null) {
            conditions += " AND TRA_CVE_ST_TRAMITE = ?";
            values.add(this.getTraCveStTramite());
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
        String sql = "UPDATE TRAMITES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TRA_NUM_TRAMITE = ?";
        pkValues.add(this.getTraNumTramite());
        fields += " TRA_NOM_TRAMITE = ?, ";
        values.add(this.getTraNomTramite());
        fields += " TRA_CICLO_APLICA = ?, ";
        values.add(this.getTraCicloAplica());
        fields += " TRA_TARIFA_TRAM = ?, ";
        values.add(this.getTraTarifaTram());
        fields += " TRA_NOT_EJEC_TRAM = ?, ";
        values.add(this.getTraNotEjecTram());
        fields += " TRA_GES_EJEC_TRAM = ?, ";
        values.add(this.getTraGesEjecTram());
        fields += " TRA_VAL_EJEC_TRAM = ?, ";
        values.add(this.getTraValEjecTram());
        fields += " TRA_ANO_ALTA_REG = ?, ";
        values.add(this.getTraAnoAltaReg());
        fields += " TRA_MES_ALTA_REG = ?, ";
        values.add(this.getTraMesAltaReg());
        fields += " TRA_DIA_ALTA_REG = ?, ";
        values.add(this.getTraDiaAltaReg());
        fields += " TRA_ANO_ULT_MOD = ?, ";
        values.add(this.getTraAnoUltMod());
        fields += " TRA_MES_ULT_MOD = ?, ";
        values.add(this.getTraMesUltMod());
        fields += " TRA_DIA_ULT_MOD = ?, ";
        values.add(this.getTraDiaUltMod());
        fields += " TRA_CVE_ST_TRAMITE = ?, ";
        values.add(this.getTraCveStTramite());
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
        String sql = "INSERT INTO TRAMITES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TRA_NUM_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getTraNumTramite());

        fields += ", TRA_NOM_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getTraNomTramite());

        fields += ", TRA_CICLO_APLICA";
        fieldValues += ", ?";
        values.add(this.getTraCicloAplica());

        fields += ", TRA_TARIFA_TRAM";
        fieldValues += ", ?";
        values.add(this.getTraTarifaTram());

        fields += ", TRA_NOT_EJEC_TRAM";
        fieldValues += ", ?";
        values.add(this.getTraNotEjecTram());

        fields += ", TRA_GES_EJEC_TRAM";
        fieldValues += ", ?";
        values.add(this.getTraGesEjecTram());

        fields += ", TRA_VAL_EJEC_TRAM";
        fieldValues += ", ?";
        values.add(this.getTraValEjecTram());

        fields += ", TRA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTraAnoAltaReg());

        fields += ", TRA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTraMesAltaReg());

        fields += ", TRA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTraDiaAltaReg());

        fields += ", TRA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTraAnoUltMod());

        fields += ", TRA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTraMesUltMod());

        fields += ", TRA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTraDiaUltMod());

        fields += ", TRA_CVE_ST_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getTraCveStTramite());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TRAMITES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TRA_NUM_TRAMITE = ?";
        values.add(this.getTraNumTramite());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Tramites instance = (Tramites) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTraNumTramite().equals(instance.getTraNumTramite()))
            equalObjects = false;
        if (equalObjects && !this.getTraNomTramite().equals(instance.getTraNomTramite()))
            equalObjects = false;
        if (equalObjects && !this.getTraCicloAplica().equals(instance.getTraCicloAplica()))
            equalObjects = false;
        if (equalObjects && !this.getTraTarifaTram().equals(instance.getTraTarifaTram()))
            equalObjects = false;
        if (equalObjects && !this.getTraNotEjecTram().equals(instance.getTraNotEjecTram()))
            equalObjects = false;
        if (equalObjects && !this.getTraGesEjecTram().equals(instance.getTraGesEjecTram()))
            equalObjects = false;
        if (equalObjects && !this.getTraValEjecTram().equals(instance.getTraValEjecTram()))
            equalObjects = false;
        if (equalObjects && !this.getTraAnoAltaReg().equals(instance.getTraAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTraMesAltaReg().equals(instance.getTraMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTraDiaAltaReg().equals(instance.getTraDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTraAnoUltMod().equals(instance.getTraAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTraMesUltMod().equals(instance.getTraMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTraDiaUltMod().equals(instance.getTraDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTraCveStTramite().equals(instance.getTraCveStTramite()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Tramites result = new Tramites();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTraNumTramite((BigDecimal) objectData.getData("TRA_NUM_TRAMITE"));
        result.setTraNomTramite((String) objectData.getData("TRA_NOM_TRAMITE"));
        result.setTraCicloAplica((String) objectData.getData("TRA_CICLO_APLICA"));
        result.setTraTarifaTram((BigDecimal) objectData.getData("TRA_TARIFA_TRAM"));
        result.setTraNotEjecTram((BigDecimal) objectData.getData("TRA_NOT_EJEC_TRAM"));
        result.setTraGesEjecTram((BigDecimal) objectData.getData("TRA_GES_EJEC_TRAM"));
        result.setTraValEjecTram((BigDecimal) objectData.getData("TRA_VAL_EJEC_TRAM"));
        result.setTraAnoAltaReg((BigDecimal) objectData.getData("TRA_ANO_ALTA_REG"));
        result.setTraMesAltaReg((BigDecimal) objectData.getData("TRA_MES_ALTA_REG"));
        result.setTraDiaAltaReg((BigDecimal) objectData.getData("TRA_DIA_ALTA_REG"));
        result.setTraAnoUltMod((BigDecimal) objectData.getData("TRA_ANO_ULT_MOD"));
        result.setTraMesUltMod((BigDecimal) objectData.getData("TRA_MES_ULT_MOD"));
        result.setTraDiaUltMod((BigDecimal) objectData.getData("TRA_DIA_ULT_MOD"));
        result.setTraCveStTramite((String) objectData.getData("TRA_CVE_ST_TRAMITE"));

        return result;

    }

}
