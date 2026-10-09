package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PROLTRAM_PK", columns = { "PLT_NUM_PRODUCTO", "PLT_NUM_TRAMITE" }, sequences = { "MANUAL" })
public class Proltram extends DomainObject {

    BigDecimal pltNumProducto = null;
    BigDecimal pltNumTramite = null;
    String pltNomTramite = null;
    BigDecimal pltTarifaTram = null;
    BigDecimal pltNotEjecTram = null;
    BigDecimal pltGesEjecTram = null;
    BigDecimal pltValEjecTram = null;
    BigDecimal pltAnoAltaReg = null;
    BigDecimal pltMesAltaReg = null;
    BigDecimal pltDiaAltaReg = null;
    BigDecimal pltAnoUltMod = null;
    BigDecimal pltMesUltMod = null;
    BigDecimal pltDiaUltMod = null;
    String pltCveStProltra = null;

    public Proltram() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPltNumProducto(BigDecimal pltNumProducto) {
        this.pltNumProducto = pltNumProducto;
    }

    public BigDecimal getPltNumProducto() {
        return this.pltNumProducto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPltNumTramite(BigDecimal pltNumTramite) {
        this.pltNumTramite = pltNumTramite;
    }

    public BigDecimal getPltNumTramite() {
        return this.pltNumTramite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPltNomTramite(String pltNomTramite) {
        this.pltNomTramite = pltNomTramite;
    }

    public String getPltNomTramite() {
        return this.pltNomTramite;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPltTarifaTram(BigDecimal pltTarifaTram) {
        this.pltTarifaTram = pltTarifaTram;
    }

    public BigDecimal getPltTarifaTram() {
        return this.pltTarifaTram;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPltNotEjecTram(BigDecimal pltNotEjecTram) {
        this.pltNotEjecTram = pltNotEjecTram;
    }

    public BigDecimal getPltNotEjecTram() {
        return this.pltNotEjecTram;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPltGesEjecTram(BigDecimal pltGesEjecTram) {
        this.pltGesEjecTram = pltGesEjecTram;
    }

    public BigDecimal getPltGesEjecTram() {
        return this.pltGesEjecTram;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPltValEjecTram(BigDecimal pltValEjecTram) {
        this.pltValEjecTram = pltValEjecTram;
    }

    public BigDecimal getPltValEjecTram() {
        return this.pltValEjecTram;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPltAnoAltaReg(BigDecimal pltAnoAltaReg) {
        this.pltAnoAltaReg = pltAnoAltaReg;
    }

    public BigDecimal getPltAnoAltaReg() {
        return this.pltAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPltMesAltaReg(BigDecimal pltMesAltaReg) {
        this.pltMesAltaReg = pltMesAltaReg;
    }

    public BigDecimal getPltMesAltaReg() {
        return this.pltMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPltDiaAltaReg(BigDecimal pltDiaAltaReg) {
        this.pltDiaAltaReg = pltDiaAltaReg;
    }

    public BigDecimal getPltDiaAltaReg() {
        return this.pltDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPltAnoUltMod(BigDecimal pltAnoUltMod) {
        this.pltAnoUltMod = pltAnoUltMod;
    }

    public BigDecimal getPltAnoUltMod() {
        return this.pltAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPltMesUltMod(BigDecimal pltMesUltMod) {
        this.pltMesUltMod = pltMesUltMod;
    }

    public BigDecimal getPltMesUltMod() {
        return this.pltMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPltDiaUltMod(BigDecimal pltDiaUltMod) {
        this.pltDiaUltMod = pltDiaUltMod;
    }

    public BigDecimal getPltDiaUltMod() {
        return this.pltDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPltCveStProltra(String pltCveStProltra) {
        this.pltCveStProltra = pltCveStProltra;
    }

    public String getPltCveStProltra() {
        return this.pltCveStProltra;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PROLTRAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPltNumProducto() != null && this.getPltNumProducto().longValue() == -999) {
            conditions += " AND PLT_NUM_PRODUCTO IS NULL";
        } else if (this.getPltNumProducto() != null) {
            conditions += " AND PLT_NUM_PRODUCTO = ?";
            values.add(this.getPltNumProducto());
        }

        if (this.getPltNumTramite() != null && this.getPltNumTramite().longValue() == -999) {
            conditions += " AND PLT_NUM_TRAMITE IS NULL";
        } else if (this.getPltNumTramite() != null) {
            conditions += " AND PLT_NUM_TRAMITE = ?";
            values.add(this.getPltNumTramite());
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
        String sql = "SELECT * FROM PROLTRAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPltNumProducto() != null && this.getPltNumProducto().longValue() == -999) {
            conditions += " AND PLT_NUM_PRODUCTO IS NULL";
        } else if (this.getPltNumProducto() != null) {
            conditions += " AND PLT_NUM_PRODUCTO = ?";
            values.add(this.getPltNumProducto());
        }

        if (this.getPltNumTramite() != null && this.getPltNumTramite().longValue() == -999) {
            conditions += " AND PLT_NUM_TRAMITE IS NULL";
        } else if (this.getPltNumTramite() != null) {
            conditions += " AND PLT_NUM_TRAMITE = ?";
            values.add(this.getPltNumTramite());
        }

        if (this.getPltNomTramite() != null && "null".equals(this.getPltNomTramite())) {
            conditions += " AND PLT_NOM_TRAMITE IS NULL";
        } else if (this.getPltNomTramite() != null) {
            conditions += " AND PLT_NOM_TRAMITE = ?";
            values.add(this.getPltNomTramite());
        }

        if (this.getPltTarifaTram() != null && this.getPltTarifaTram().longValue() == -999) {
            conditions += " AND PLT_TARIFA_TRAM IS NULL";
        } else if (this.getPltTarifaTram() != null) {
            conditions += " AND PLT_TARIFA_TRAM = ?";
            values.add(this.getPltTarifaTram());
        }

        if (this.getPltNotEjecTram() != null && this.getPltNotEjecTram().longValue() == -999) {
            conditions += " AND PLT_NOT_EJEC_TRAM IS NULL";
        } else if (this.getPltNotEjecTram() != null) {
            conditions += " AND PLT_NOT_EJEC_TRAM = ?";
            values.add(this.getPltNotEjecTram());
        }

        if (this.getPltGesEjecTram() != null && this.getPltGesEjecTram().longValue() == -999) {
            conditions += " AND PLT_GES_EJEC_TRAM IS NULL";
        } else if (this.getPltGesEjecTram() != null) {
            conditions += " AND PLT_GES_EJEC_TRAM = ?";
            values.add(this.getPltGesEjecTram());
        }

        if (this.getPltValEjecTram() != null && this.getPltValEjecTram().longValue() == -999) {
            conditions += " AND PLT_VAL_EJEC_TRAM IS NULL";
        } else if (this.getPltValEjecTram() != null) {
            conditions += " AND PLT_VAL_EJEC_TRAM = ?";
            values.add(this.getPltValEjecTram());
        }

        if (this.getPltAnoAltaReg() != null && this.getPltAnoAltaReg().longValue() == -999) {
            conditions += " AND PLT_ANO_ALTA_REG IS NULL";
        } else if (this.getPltAnoAltaReg() != null) {
            conditions += " AND PLT_ANO_ALTA_REG = ?";
            values.add(this.getPltAnoAltaReg());
        }

        if (this.getPltMesAltaReg() != null && this.getPltMesAltaReg().longValue() == -999) {
            conditions += " AND PLT_MES_ALTA_REG IS NULL";
        } else if (this.getPltMesAltaReg() != null) {
            conditions += " AND PLT_MES_ALTA_REG = ?";
            values.add(this.getPltMesAltaReg());
        }

        if (this.getPltDiaAltaReg() != null && this.getPltDiaAltaReg().longValue() == -999) {
            conditions += " AND PLT_DIA_ALTA_REG IS NULL";
        } else if (this.getPltDiaAltaReg() != null) {
            conditions += " AND PLT_DIA_ALTA_REG = ?";
            values.add(this.getPltDiaAltaReg());
        }

        if (this.getPltAnoUltMod() != null && this.getPltAnoUltMod().longValue() == -999) {
            conditions += " AND PLT_ANO_ULT_MOD IS NULL";
        } else if (this.getPltAnoUltMod() != null) {
            conditions += " AND PLT_ANO_ULT_MOD = ?";
            values.add(this.getPltAnoUltMod());
        }

        if (this.getPltMesUltMod() != null && this.getPltMesUltMod().longValue() == -999) {
            conditions += " AND PLT_MES_ULT_MOD IS NULL";
        } else if (this.getPltMesUltMod() != null) {
            conditions += " AND PLT_MES_ULT_MOD = ?";
            values.add(this.getPltMesUltMod());
        }

        if (this.getPltDiaUltMod() != null && this.getPltDiaUltMod().longValue() == -999) {
            conditions += " AND PLT_DIA_ULT_MOD IS NULL";
        } else if (this.getPltDiaUltMod() != null) {
            conditions += " AND PLT_DIA_ULT_MOD = ?";
            values.add(this.getPltDiaUltMod());
        }

        if (this.getPltCveStProltra() != null && "null".equals(this.getPltCveStProltra())) {
            conditions += " AND PLT_CVE_ST_PROLTRA IS NULL";
        } else if (this.getPltCveStProltra() != null) {
            conditions += " AND PLT_CVE_ST_PROLTRA = ?";
            values.add(this.getPltCveStProltra());
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
        String sql = "UPDATE PROLTRAM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PLT_NUM_PRODUCTO = ?";
        pkValues.add(this.getPltNumProducto());
        conditions += " AND PLT_NUM_TRAMITE = ?";
        pkValues.add(this.getPltNumTramite());
        fields += " PLT_NOM_TRAMITE = ?, ";
        values.add(this.getPltNomTramite());
        fields += " PLT_TARIFA_TRAM = ?, ";
        values.add(this.getPltTarifaTram());
        fields += " PLT_NOT_EJEC_TRAM = ?, ";
        values.add(this.getPltNotEjecTram());
        fields += " PLT_GES_EJEC_TRAM = ?, ";
        values.add(this.getPltGesEjecTram());
        fields += " PLT_VAL_EJEC_TRAM = ?, ";
        values.add(this.getPltValEjecTram());
        fields += " PLT_ANO_ALTA_REG = ?, ";
        values.add(this.getPltAnoAltaReg());
        fields += " PLT_MES_ALTA_REG = ?, ";
        values.add(this.getPltMesAltaReg());
        fields += " PLT_DIA_ALTA_REG = ?, ";
        values.add(this.getPltDiaAltaReg());
        fields += " PLT_ANO_ULT_MOD = ?, ";
        values.add(this.getPltAnoUltMod());
        fields += " PLT_MES_ULT_MOD = ?, ";
        values.add(this.getPltMesUltMod());
        fields += " PLT_DIA_ULT_MOD = ?, ";
        values.add(this.getPltDiaUltMod());
        fields += " PLT_CVE_ST_PROLTRA = ?, ";
        values.add(this.getPltCveStProltra());
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
        String sql = "INSERT INTO PROLTRAM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PLT_NUM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getPltNumProducto());

        fields += ", PLT_NUM_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getPltNumTramite());

        fields += ", PLT_NOM_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getPltNomTramite());

        fields += ", PLT_TARIFA_TRAM";
        fieldValues += ", ?";
        values.add(this.getPltTarifaTram());

        fields += ", PLT_NOT_EJEC_TRAM";
        fieldValues += ", ?";
        values.add(this.getPltNotEjecTram());

        fields += ", PLT_GES_EJEC_TRAM";
        fieldValues += ", ?";
        values.add(this.getPltGesEjecTram());

        fields += ", PLT_VAL_EJEC_TRAM";
        fieldValues += ", ?";
        values.add(this.getPltValEjecTram());

        fields += ", PLT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPltAnoAltaReg());

        fields += ", PLT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPltMesAltaReg());

        fields += ", PLT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPltDiaAltaReg());

        fields += ", PLT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPltAnoUltMod());

        fields += ", PLT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPltMesUltMod());

        fields += ", PLT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPltDiaUltMod());

        fields += ", PLT_CVE_ST_PROLTRA";
        fieldValues += ", ?";
        values.add(this.getPltCveStProltra());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PROLTRAM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PLT_NUM_PRODUCTO = ?";
        values.add(this.getPltNumProducto());
        conditions += " AND PLT_NUM_TRAMITE = ?";
        values.add(this.getPltNumTramite());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Proltram instance = (Proltram) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPltNumProducto().equals(instance.getPltNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getPltNumTramite().equals(instance.getPltNumTramite()))
            equalObjects = false;
        if (equalObjects && !this.getPltNomTramite().equals(instance.getPltNomTramite()))
            equalObjects = false;
        if (equalObjects && !this.getPltTarifaTram().equals(instance.getPltTarifaTram()))
            equalObjects = false;
        if (equalObjects && !this.getPltNotEjecTram().equals(instance.getPltNotEjecTram()))
            equalObjects = false;
        if (equalObjects && !this.getPltGesEjecTram().equals(instance.getPltGesEjecTram()))
            equalObjects = false;
        if (equalObjects && !this.getPltValEjecTram().equals(instance.getPltValEjecTram()))
            equalObjects = false;
        if (equalObjects && !this.getPltAnoAltaReg().equals(instance.getPltAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPltMesAltaReg().equals(instance.getPltMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPltDiaAltaReg().equals(instance.getPltDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPltAnoUltMod().equals(instance.getPltAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPltMesUltMod().equals(instance.getPltMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPltDiaUltMod().equals(instance.getPltDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPltCveStProltra().equals(instance.getPltCveStProltra()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Proltram result = new Proltram();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPltNumProducto((BigDecimal) objectData.getData("PLT_NUM_PRODUCTO"));
        result.setPltNumTramite((BigDecimal) objectData.getData("PLT_NUM_TRAMITE"));
        result.setPltNomTramite((String) objectData.getData("PLT_NOM_TRAMITE"));
        result.setPltTarifaTram((BigDecimal) objectData.getData("PLT_TARIFA_TRAM"));
        result.setPltNotEjecTram((BigDecimal) objectData.getData("PLT_NOT_EJEC_TRAM"));
        result.setPltGesEjecTram((BigDecimal) objectData.getData("PLT_GES_EJEC_TRAM"));
        result.setPltValEjecTram((BigDecimal) objectData.getData("PLT_VAL_EJEC_TRAM"));
        result.setPltAnoAltaReg((BigDecimal) objectData.getData("PLT_ANO_ALTA_REG"));
        result.setPltMesAltaReg((BigDecimal) objectData.getData("PLT_MES_ALTA_REG"));
        result.setPltDiaAltaReg((BigDecimal) objectData.getData("PLT_DIA_ALTA_REG"));
        result.setPltAnoUltMod((BigDecimal) objectData.getData("PLT_ANO_ULT_MOD"));
        result.setPltMesUltMod((BigDecimal) objectData.getData("PLT_MES_ULT_MOD"));
        result.setPltDiaUltMod((BigDecimal) objectData.getData("PLT_DIA_ULT_MOD"));
        result.setPltCveStProltra((String) objectData.getData("PLT_CVE_ST_PROLTRA"));

        return result;

    }

}
