package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARAEMP_PK", columns = { "PAE_LICENCIA_USO" }, sequences = { "MAX" })
public class Paraemp extends DomainObject {

    String paeLicenciaUso = null;
    String paeNomCorto = null;
    String paeNombre = null;
    String paeTipoInstituc = null;
    String paePiePag1 = null;
    String paePiePag2 = null;
    BigDecimal paeAnoAltaReg = null;
    BigDecimal paeMesAltaReg = null;
    BigDecimal paeDiaAltaReg = null;
    BigDecimal paeAnoUltMod = null;
    BigDecimal paeMesUltMod = null;
    BigDecimal paeDiaUltMod = null;
    String paeCveStParaemp = null;

    public Paraemp() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaeLicenciaUso(String paeLicenciaUso) {
        this.paeLicenciaUso = paeLicenciaUso;
    }

    public String getPaeLicenciaUso() {
        return this.paeLicenciaUso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaeNomCorto(String paeNomCorto) {
        this.paeNomCorto = paeNomCorto;
    }

    public String getPaeNomCorto() {
        return this.paeNomCorto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaeNombre(String paeNombre) {
        this.paeNombre = paeNombre;
    }

    public String getPaeNombre() {
        return this.paeNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaeTipoInstituc(String paeTipoInstituc) {
        this.paeTipoInstituc = paeTipoInstituc;
    }

    public String getPaeTipoInstituc() {
        return this.paeTipoInstituc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaePiePag1(String paePiePag1) {
        this.paePiePag1 = paePiePag1;
    }

    public String getPaePiePag1() {
        return this.paePiePag1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaePiePag2(String paePiePag2) {
        this.paePiePag2 = paePiePag2;
    }

    public String getPaePiePag2() {
        return this.paePiePag2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPaeAnoAltaReg(BigDecimal paeAnoAltaReg) {
        this.paeAnoAltaReg = paeAnoAltaReg;
    }

    public BigDecimal getPaeAnoAltaReg() {
        return this.paeAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaeMesAltaReg(BigDecimal paeMesAltaReg) {
        this.paeMesAltaReg = paeMesAltaReg;
    }

    public BigDecimal getPaeMesAltaReg() {
        return this.paeMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaeDiaAltaReg(BigDecimal paeDiaAltaReg) {
        this.paeDiaAltaReg = paeDiaAltaReg;
    }

    public BigDecimal getPaeDiaAltaReg() {
        return this.paeDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPaeAnoUltMod(BigDecimal paeAnoUltMod) {
        this.paeAnoUltMod = paeAnoUltMod;
    }

    public BigDecimal getPaeAnoUltMod() {
        return this.paeAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaeMesUltMod(BigDecimal paeMesUltMod) {
        this.paeMesUltMod = paeMesUltMod;
    }

    public BigDecimal getPaeMesUltMod() {
        return this.paeMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaeDiaUltMod(BigDecimal paeDiaUltMod) {
        this.paeDiaUltMod = paeDiaUltMod;
    }

    public BigDecimal getPaeDiaUltMod() {
        return this.paeDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaeCveStParaemp(String paeCveStParaemp) {
        this.paeCveStParaemp = paeCveStParaemp;
    }

    public String getPaeCveStParaemp() {
        return this.paeCveStParaemp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARAEMP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPaeLicenciaUso() != null && "null".equals(this.getPaeLicenciaUso())) {
            conditions += " AND PAE_LICENCIA_USO IS NULL";
        } else if (this.getPaeLicenciaUso() != null) {
            conditions += " AND PAE_LICENCIA_USO = ?";
            values.add(this.getPaeLicenciaUso());
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
        String sql = "SELECT * FROM PARAEMP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPaeLicenciaUso() != null && "null".equals(this.getPaeLicenciaUso())) {
            conditions += " AND PAE_LICENCIA_USO IS NULL";
        } else if (this.getPaeLicenciaUso() != null) {
            conditions += " AND PAE_LICENCIA_USO = ?";
            values.add(this.getPaeLicenciaUso());
        }

        if (this.getPaeNomCorto() != null && "null".equals(this.getPaeNomCorto())) {
            conditions += " AND PAE_NOM_CORTO IS NULL";
        } else if (this.getPaeNomCorto() != null) {
            conditions += " AND PAE_NOM_CORTO = ?";
            values.add(this.getPaeNomCorto());
        }

        if (this.getPaeNombre() != null && "null".equals(this.getPaeNombre())) {
            conditions += " AND PAE_NOMBRE IS NULL";
        } else if (this.getPaeNombre() != null) {
            conditions += " AND PAE_NOMBRE = ?";
            values.add(this.getPaeNombre());
        }

        if (this.getPaeTipoInstituc() != null && "null".equals(this.getPaeTipoInstituc())) {
            conditions += " AND PAE_TIPO_INSTITUC IS NULL";
        } else if (this.getPaeTipoInstituc() != null) {
            conditions += " AND PAE_TIPO_INSTITUC = ?";
            values.add(this.getPaeTipoInstituc());
        }

        if (this.getPaePiePag1() != null && "null".equals(this.getPaePiePag1())) {
            conditions += " AND PAE_PIE_PAG1 IS NULL";
        } else if (this.getPaePiePag1() != null) {
            conditions += " AND PAE_PIE_PAG1 = ?";
            values.add(this.getPaePiePag1());
        }

        if (this.getPaePiePag2() != null && "null".equals(this.getPaePiePag2())) {
            conditions += " AND PAE_PIE_PAG2 IS NULL";
        } else if (this.getPaePiePag2() != null) {
            conditions += " AND PAE_PIE_PAG2 = ?";
            values.add(this.getPaePiePag2());
        }

        if (this.getPaeAnoAltaReg() != null && this.getPaeAnoAltaReg().longValue() == -999) {
            conditions += " AND PAE_ANO_ALTA_REG IS NULL";
        } else if (this.getPaeAnoAltaReg() != null) {
            conditions += " AND PAE_ANO_ALTA_REG = ?";
            values.add(this.getPaeAnoAltaReg());
        }

        if (this.getPaeMesAltaReg() != null && this.getPaeMesAltaReg().longValue() == -999) {
            conditions += " AND PAE_MES_ALTA_REG IS NULL";
        } else if (this.getPaeMesAltaReg() != null) {
            conditions += " AND PAE_MES_ALTA_REG = ?";
            values.add(this.getPaeMesAltaReg());
        }

        if (this.getPaeDiaAltaReg() != null && this.getPaeDiaAltaReg().longValue() == -999) {
            conditions += " AND PAE_DIA_ALTA_REG IS NULL";
        } else if (this.getPaeDiaAltaReg() != null) {
            conditions += " AND PAE_DIA_ALTA_REG = ?";
            values.add(this.getPaeDiaAltaReg());
        }

        if (this.getPaeAnoUltMod() != null && this.getPaeAnoUltMod().longValue() == -999) {
            conditions += " AND PAE_ANO_ULT_MOD IS NULL";
        } else if (this.getPaeAnoUltMod() != null) {
            conditions += " AND PAE_ANO_ULT_MOD = ?";
            values.add(this.getPaeAnoUltMod());
        }

        if (this.getPaeMesUltMod() != null && this.getPaeMesUltMod().longValue() == -999) {
            conditions += " AND PAE_MES_ULT_MOD IS NULL";
        } else if (this.getPaeMesUltMod() != null) {
            conditions += " AND PAE_MES_ULT_MOD = ?";
            values.add(this.getPaeMesUltMod());
        }

        if (this.getPaeDiaUltMod() != null && this.getPaeDiaUltMod().longValue() == -999) {
            conditions += " AND PAE_DIA_ULT_MOD IS NULL";
        } else if (this.getPaeDiaUltMod() != null) {
            conditions += " AND PAE_DIA_ULT_MOD = ?";
            values.add(this.getPaeDiaUltMod());
        }

        if (this.getPaeCveStParaemp() != null && "null".equals(this.getPaeCveStParaemp())) {
            conditions += " AND PAE_CVE_ST_PARAEMP IS NULL";
        } else if (this.getPaeCveStParaemp() != null) {
            conditions += " AND PAE_CVE_ST_PARAEMP = ?";
            values.add(this.getPaeCveStParaemp());
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
        String sql = "UPDATE PARAEMP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAE_LICENCIA_USO = ?";
        pkValues.add(this.getPaeLicenciaUso());
        fields += " PAE_NOM_CORTO = ?, ";
        values.add(this.getPaeNomCorto());
        fields += " PAE_NOMBRE = ?, ";
        values.add(this.getPaeNombre());
        fields += " PAE_TIPO_INSTITUC = ?, ";
        values.add(this.getPaeTipoInstituc());
        fields += " PAE_PIE_PAG1 = ?, ";
        values.add(this.getPaePiePag1());
        fields += " PAE_PIE_PAG2 = ?, ";
        values.add(this.getPaePiePag2());
        fields += " PAE_ANO_ALTA_REG = ?, ";
        values.add(this.getPaeAnoAltaReg());
        fields += " PAE_MES_ALTA_REG = ?, ";
        values.add(this.getPaeMesAltaReg());
        fields += " PAE_DIA_ALTA_REG = ?, ";
        values.add(this.getPaeDiaAltaReg());
        fields += " PAE_ANO_ULT_MOD = ?, ";
        values.add(this.getPaeAnoUltMod());
        fields += " PAE_MES_ULT_MOD = ?, ";
        values.add(this.getPaeMesUltMod());
        fields += " PAE_DIA_ULT_MOD = ?, ";
        values.add(this.getPaeDiaUltMod());
        fields += " PAE_CVE_ST_PARAEMP = ?, ";
        values.add(this.getPaeCveStParaemp());
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
        String sql = "INSERT INTO PARAEMP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAE_LICENCIA_USO";
        fieldValues += ", ?";
        values.add(this.getPaeLicenciaUso());

        fields += ", PAE_NOM_CORTO";
        fieldValues += ", ?";
        values.add(this.getPaeNomCorto());

        fields += ", PAE_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getPaeNombre());

        fields += ", PAE_TIPO_INSTITUC";
        fieldValues += ", ?";
        values.add(this.getPaeTipoInstituc());

        fields += ", PAE_PIE_PAG1";
        fieldValues += ", ?";
        values.add(this.getPaePiePag1());

        fields += ", PAE_PIE_PAG2";
        fieldValues += ", ?";
        values.add(this.getPaePiePag2());

        fields += ", PAE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPaeAnoAltaReg());

        fields += ", PAE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPaeMesAltaReg());

        fields += ", PAE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPaeDiaAltaReg());

        fields += ", PAE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPaeAnoUltMod());

        fields += ", PAE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPaeMesUltMod());

        fields += ", PAE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPaeDiaUltMod());

        fields += ", PAE_CVE_ST_PARAEMP";
        fieldValues += ", ?";
        values.add(this.getPaeCveStParaemp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARAEMP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAE_LICENCIA_USO = ?";
        values.add(this.getPaeLicenciaUso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Paraemp instance = (Paraemp) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPaeLicenciaUso().equals(instance.getPaeLicenciaUso()))
            equalObjects = false;
        if (equalObjects && !this.getPaeNomCorto().equals(instance.getPaeNomCorto()))
            equalObjects = false;
        if (equalObjects && !this.getPaeNombre().equals(instance.getPaeNombre()))
            equalObjects = false;
        if (equalObjects && !this.getPaeTipoInstituc().equals(instance.getPaeTipoInstituc()))
            equalObjects = false;
        if (equalObjects && !this.getPaePiePag1().equals(instance.getPaePiePag1()))
            equalObjects = false;
        if (equalObjects && !this.getPaePiePag2().equals(instance.getPaePiePag2()))
            equalObjects = false;
        if (equalObjects && !this.getPaeAnoAltaReg().equals(instance.getPaeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPaeMesAltaReg().equals(instance.getPaeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPaeDiaAltaReg().equals(instance.getPaeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPaeAnoUltMod().equals(instance.getPaeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPaeMesUltMod().equals(instance.getPaeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPaeDiaUltMod().equals(instance.getPaeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPaeCveStParaemp().equals(instance.getPaeCveStParaemp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Paraemp result = new Paraemp();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPaeLicenciaUso((String) objectData.getData("PAE_LICENCIA_USO"));
        result.setPaeNomCorto((String) objectData.getData("PAE_NOM_CORTO"));
        result.setPaeNombre((String) objectData.getData("PAE_NOMBRE"));
        result.setPaeTipoInstituc((String) objectData.getData("PAE_TIPO_INSTITUC"));
        result.setPaePiePag1((String) objectData.getData("PAE_PIE_PAG1"));
        result.setPaePiePag2((String) objectData.getData("PAE_PIE_PAG2"));
        result.setPaeAnoAltaReg((BigDecimal) objectData.getData("PAE_ANO_ALTA_REG"));
        result.setPaeMesAltaReg((BigDecimal) objectData.getData("PAE_MES_ALTA_REG"));
        result.setPaeDiaAltaReg((BigDecimal) objectData.getData("PAE_DIA_ALTA_REG"));
        result.setPaeAnoUltMod((BigDecimal) objectData.getData("PAE_ANO_ULT_MOD"));
        result.setPaeMesUltMod((BigDecimal) objectData.getData("PAE_MES_ULT_MOD"));
        result.setPaeDiaUltMod((BigDecimal) objectData.getData("PAE_DIA_ULT_MOD"));
        result.setPaeCveStParaemp((String) objectData.getData("PAE_CVE_ST_PARAEMP"));

        return result;

    }

}
