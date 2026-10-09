package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMIREPO_PK", columns = { "ERE_NUM_FOLIO_REPO", "ERE_NOM_PIZARRA", "ERE_NUM_SER_EMIS", "ERE_NUM_CUPON_VIG" }, sequences = { "MANUAL" })
public class Emirepo extends DomainObject {

    BigDecimal ereNumFolioRepo = null;
    String ereNomPizarra = null;
    String ereNumSerEmis = null;
    BigDecimal ereNumCuponVig = null;
    String ereNumTitulos = null;
    BigDecimal ereAnoAltaReg = null;
    BigDecimal ereMesAltaReg = null;
    BigDecimal ereDiaAltaReg = null;
    BigDecimal ereAnoUltMod = null;
    BigDecimal ereMesUltMod = null;
    BigDecimal ereDiaUltMod = null;
    String ereCveStEmirepo = null;

    public Emirepo() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumFolioRepo(BigDecimal ereNumFolioRepo) {
        this.ereNumFolioRepo = ereNumFolioRepo;
    }

    public BigDecimal getEreNumFolioRepo() {
        return this.ereNumFolioRepo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEreNomPizarra(String ereNomPizarra) {
        this.ereNomPizarra = ereNomPizarra;
    }

    public String getEreNomPizarra() {
        return this.ereNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEreNumSerEmis(String ereNumSerEmis) {
        this.ereNumSerEmis = ereNumSerEmis;
    }

    public String getEreNumSerEmis() {
        return this.ereNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumCuponVig(BigDecimal ereNumCuponVig) {
        this.ereNumCuponVig = ereNumCuponVig;
    }

    public BigDecimal getEreNumCuponVig() {
        return this.ereNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEreNumTitulos(String ereNumTitulos) {
        this.ereNumTitulos = ereNumTitulos;
    }

    public String getEreNumTitulos() {
        return this.ereNumTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreAnoAltaReg(BigDecimal ereAnoAltaReg) {
        this.ereAnoAltaReg = ereAnoAltaReg;
    }

    public BigDecimal getEreAnoAltaReg() {
        return this.ereAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEreMesAltaReg(BigDecimal ereMesAltaReg) {
        this.ereMesAltaReg = ereMesAltaReg;
    }

    public BigDecimal getEreMesAltaReg() {
        return this.ereMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEreDiaAltaReg(BigDecimal ereDiaAltaReg) {
        this.ereDiaAltaReg = ereDiaAltaReg;
    }

    public BigDecimal getEreDiaAltaReg() {
        return this.ereDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreAnoUltMod(BigDecimal ereAnoUltMod) {
        this.ereAnoUltMod = ereAnoUltMod;
    }

    public BigDecimal getEreAnoUltMod() {
        return this.ereAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEreMesUltMod(BigDecimal ereMesUltMod) {
        this.ereMesUltMod = ereMesUltMod;
    }

    public BigDecimal getEreMesUltMod() {
        return this.ereMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEreDiaUltMod(BigDecimal ereDiaUltMod) {
        this.ereDiaUltMod = ereDiaUltMod;
    }

    public BigDecimal getEreDiaUltMod() {
        return this.ereDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEreCveStEmirepo(String ereCveStEmirepo) {
        this.ereCveStEmirepo = ereCveStEmirepo;
    }

    public String getEreCveStEmirepo() {
        return this.ereCveStEmirepo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMIREPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEreNumFolioRepo() != null && this.getEreNumFolioRepo().longValue() == -999) {
            conditions += " AND ERE_NUM_FOLIO_REPO IS NULL";
        } else if (this.getEreNumFolioRepo() != null) {
            conditions += " AND ERE_NUM_FOLIO_REPO = ?";
            values.add(this.getEreNumFolioRepo());
        }

        if (this.getEreNomPizarra() != null && "null".equals(this.getEreNomPizarra())) {
            conditions += " AND ERE_NOM_PIZARRA IS NULL";
        } else if (this.getEreNomPizarra() != null) {
            conditions += " AND ERE_NOM_PIZARRA = ?";
            values.add(this.getEreNomPizarra());
        }

        if (this.getEreNumSerEmis() != null && "null".equals(this.getEreNumSerEmis())) {
            conditions += " AND ERE_NUM_SER_EMIS IS NULL";
        } else if (this.getEreNumSerEmis() != null) {
            conditions += " AND ERE_NUM_SER_EMIS = ?";
            values.add(this.getEreNumSerEmis());
        }

        if (this.getEreNumCuponVig() != null && this.getEreNumCuponVig().longValue() == -999) {
            conditions += " AND ERE_NUM_CUPON_VIG IS NULL";
        } else if (this.getEreNumCuponVig() != null) {
            conditions += " AND ERE_NUM_CUPON_VIG = ?";
            values.add(this.getEreNumCuponVig());
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
        String sql = "SELECT * FROM EMIREPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEreNumFolioRepo() != null && this.getEreNumFolioRepo().longValue() == -999) {
            conditions += " AND ERE_NUM_FOLIO_REPO IS NULL";
        } else if (this.getEreNumFolioRepo() != null) {
            conditions += " AND ERE_NUM_FOLIO_REPO = ?";
            values.add(this.getEreNumFolioRepo());
        }

        if (this.getEreNomPizarra() != null && "null".equals(this.getEreNomPizarra())) {
            conditions += " AND ERE_NOM_PIZARRA IS NULL";
        } else if (this.getEreNomPizarra() != null) {
            conditions += " AND ERE_NOM_PIZARRA = ?";
            values.add(this.getEreNomPizarra());
        }

        if (this.getEreNumSerEmis() != null && "null".equals(this.getEreNumSerEmis())) {
            conditions += " AND ERE_NUM_SER_EMIS IS NULL";
        } else if (this.getEreNumSerEmis() != null) {
            conditions += " AND ERE_NUM_SER_EMIS = ?";
            values.add(this.getEreNumSerEmis());
        }

        if (this.getEreNumCuponVig() != null && this.getEreNumCuponVig().longValue() == -999) {
            conditions += " AND ERE_NUM_CUPON_VIG IS NULL";
        } else if (this.getEreNumCuponVig() != null) {
            conditions += " AND ERE_NUM_CUPON_VIG = ?";
            values.add(this.getEreNumCuponVig());
        }

        if (this.getEreNumTitulos() != null && "null".equals(this.getEreNumTitulos())) {
            conditions += " AND ERE_NUM_TITULOS IS NULL";
        } else if (this.getEreNumTitulos() != null) {
            conditions += " AND ERE_NUM_TITULOS = ?";
            values.add(this.getEreNumTitulos());
        }

        if (this.getEreAnoAltaReg() != null && this.getEreAnoAltaReg().longValue() == -999) {
            conditions += " AND ERE_ANO_ALTA_REG IS NULL";
        } else if (this.getEreAnoAltaReg() != null) {
            conditions += " AND ERE_ANO_ALTA_REG = ?";
            values.add(this.getEreAnoAltaReg());
        }

        if (this.getEreMesAltaReg() != null && this.getEreMesAltaReg().longValue() == -999) {
            conditions += " AND ERE_MES_ALTA_REG IS NULL";
        } else if (this.getEreMesAltaReg() != null) {
            conditions += " AND ERE_MES_ALTA_REG = ?";
            values.add(this.getEreMesAltaReg());
        }

        if (this.getEreDiaAltaReg() != null && this.getEreDiaAltaReg().longValue() == -999) {
            conditions += " AND ERE_DIA_ALTA_REG IS NULL";
        } else if (this.getEreDiaAltaReg() != null) {
            conditions += " AND ERE_DIA_ALTA_REG = ?";
            values.add(this.getEreDiaAltaReg());
        }

        if (this.getEreAnoUltMod() != null && this.getEreAnoUltMod().longValue() == -999) {
            conditions += " AND ERE_ANO_ULT_MOD IS NULL";
        } else if (this.getEreAnoUltMod() != null) {
            conditions += " AND ERE_ANO_ULT_MOD = ?";
            values.add(this.getEreAnoUltMod());
        }

        if (this.getEreMesUltMod() != null && this.getEreMesUltMod().longValue() == -999) {
            conditions += " AND ERE_MES_ULT_MOD IS NULL";
        } else if (this.getEreMesUltMod() != null) {
            conditions += " AND ERE_MES_ULT_MOD = ?";
            values.add(this.getEreMesUltMod());
        }

        if (this.getEreDiaUltMod() != null && this.getEreDiaUltMod().longValue() == -999) {
            conditions += " AND ERE_DIA_ULT_MOD IS NULL";
        } else if (this.getEreDiaUltMod() != null) {
            conditions += " AND ERE_DIA_ULT_MOD = ?";
            values.add(this.getEreDiaUltMod());
        }

        if (this.getEreCveStEmirepo() != null && "null".equals(this.getEreCveStEmirepo())) {
            conditions += " AND ERE_CVE_ST_EMIREPO IS NULL";
        } else if (this.getEreCveStEmirepo() != null) {
            conditions += " AND ERE_CVE_ST_EMIREPO = ?";
            values.add(this.getEreCveStEmirepo());
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
        String sql = "UPDATE EMIREPO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ERE_NUM_FOLIO_REPO = ?";
        pkValues.add(this.getEreNumFolioRepo());
        conditions += " AND ERE_NOM_PIZARRA = ?";
        pkValues.add(this.getEreNomPizarra());
        conditions += " AND ERE_NUM_SER_EMIS = ?";
        pkValues.add(this.getEreNumSerEmis());
        conditions += " AND ERE_NUM_CUPON_VIG = ?";
        pkValues.add(this.getEreNumCuponVig());
        fields += " ERE_NUM_TITULOS = ?, ";
        values.add(this.getEreNumTitulos());
        fields += " ERE_ANO_ALTA_REG = ?, ";
        values.add(this.getEreAnoAltaReg());
        fields += " ERE_MES_ALTA_REG = ?, ";
        values.add(this.getEreMesAltaReg());
        fields += " ERE_DIA_ALTA_REG = ?, ";
        values.add(this.getEreDiaAltaReg());
        fields += " ERE_ANO_ULT_MOD = ?, ";
        values.add(this.getEreAnoUltMod());
        fields += " ERE_MES_ULT_MOD = ?, ";
        values.add(this.getEreMesUltMod());
        fields += " ERE_DIA_ULT_MOD = ?, ";
        values.add(this.getEreDiaUltMod());
        fields += " ERE_CVE_ST_EMIREPO = ?, ";
        values.add(this.getEreCveStEmirepo());
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
        String sql = "INSERT INTO EMIREPO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ERE_NUM_FOLIO_REPO";
        fieldValues += ", ?";
        values.add(this.getEreNumFolioRepo());

        fields += ", ERE_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getEreNomPizarra());

        fields += ", ERE_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getEreNumSerEmis());

        fields += ", ERE_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getEreNumCuponVig());

        fields += ", ERE_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEreNumTitulos());

        fields += ", ERE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEreAnoAltaReg());

        fields += ", ERE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEreMesAltaReg());

        fields += ", ERE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEreDiaAltaReg());

        fields += ", ERE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEreAnoUltMod());

        fields += ", ERE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEreMesUltMod());

        fields += ", ERE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEreDiaUltMod());

        fields += ", ERE_CVE_ST_EMIREPO";
        fieldValues += ", ?";
        values.add(this.getEreCveStEmirepo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMIREPO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ERE_NUM_FOLIO_REPO = ?";
        values.add(this.getEreNumFolioRepo());
        conditions += " AND ERE_NOM_PIZARRA = ?";
        values.add(this.getEreNomPizarra());
        conditions += " AND ERE_NUM_SER_EMIS = ?";
        values.add(this.getEreNumSerEmis());
        conditions += " AND ERE_NUM_CUPON_VIG = ?";
        values.add(this.getEreNumCuponVig());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emirepo instance = (Emirepo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEreNumFolioRepo().equals(instance.getEreNumFolioRepo()))
            equalObjects = false;
        if (equalObjects && !this.getEreNomPizarra().equals(instance.getEreNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumSerEmis().equals(instance.getEreNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumCuponVig().equals(instance.getEreNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumTitulos().equals(instance.getEreNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEreAnoAltaReg().equals(instance.getEreAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEreMesAltaReg().equals(instance.getEreMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEreDiaAltaReg().equals(instance.getEreDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEreAnoUltMod().equals(instance.getEreAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEreMesUltMod().equals(instance.getEreMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEreDiaUltMod().equals(instance.getEreDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEreCveStEmirepo().equals(instance.getEreCveStEmirepo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emirepo result = new Emirepo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEreNumFolioRepo((BigDecimal) objectData.getData("ERE_NUM_FOLIO_REPO"));
        result.setEreNomPizarra((String) objectData.getData("ERE_NOM_PIZARRA"));
        result.setEreNumSerEmis((String) objectData.getData("ERE_NUM_SER_EMIS"));
        result.setEreNumCuponVig((BigDecimal) objectData.getData("ERE_NUM_CUPON_VIG"));
        result.setEreNumTitulos((String) objectData.getData("ERE_NUM_TITULOS"));
        result.setEreAnoAltaReg((BigDecimal) objectData.getData("ERE_ANO_ALTA_REG"));
        result.setEreMesAltaReg((BigDecimal) objectData.getData("ERE_MES_ALTA_REG"));
        result.setEreDiaAltaReg((BigDecimal) objectData.getData("ERE_DIA_ALTA_REG"));
        result.setEreAnoUltMod((BigDecimal) objectData.getData("ERE_ANO_ULT_MOD"));
        result.setEreMesUltMod((BigDecimal) objectData.getData("ERE_MES_ULT_MOD"));
        result.setEreDiaUltMod((BigDecimal) objectData.getData("ERE_DIA_ULT_MOD"));
        result.setEreCveStEmirepo((String) objectData.getData("ERE_CVE_ST_EMIREPO"));

        return result;

    }

}
