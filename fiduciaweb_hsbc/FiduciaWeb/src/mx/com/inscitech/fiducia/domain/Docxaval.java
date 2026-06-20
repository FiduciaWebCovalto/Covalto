package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DOCXAVAL_PK", columns = { "DXA_NUM_DOCTO" }, sequences = { "MAX" })
public class Docxaval extends DomainObject {

    BigDecimal dxaNumDocto = null;
    String dxaNomDocto = null;
    BigDecimal dxaTipoBien = null;
    BigDecimal dxaClasBien = null;
    String dxaTipoAvaluo = null;
    String dxaDescDocto = null;
    BigDecimal dxaAnoAltaReg = null;
    BigDecimal dxaMesAltaReg = null;
    BigDecimal dxaDiaAltaReg = null;
    BigDecimal dxaAnoUltMod = null;
    BigDecimal dxaMesUltMod = null;
    BigDecimal dxaDiaUltMod = null;
    String dxaCveStDocxa = null;

    public Docxaval() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDxaNumDocto(BigDecimal dxaNumDocto) {
        this.dxaNumDocto = dxaNumDocto;
    }

    public BigDecimal getDxaNumDocto() {
        return this.dxaNumDocto;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxaNomDocto(String dxaNomDocto) {
        this.dxaNomDocto = dxaNomDocto;
    }

    public String getDxaNomDocto() {
        return this.dxaNomDocto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDxaTipoBien(BigDecimal dxaTipoBien) {
        this.dxaTipoBien = dxaTipoBien;
    }

    public BigDecimal getDxaTipoBien() {
        return this.dxaTipoBien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDxaClasBien(BigDecimal dxaClasBien) {
        this.dxaClasBien = dxaClasBien;
    }

    public BigDecimal getDxaClasBien() {
        return this.dxaClasBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxaTipoAvaluo(String dxaTipoAvaluo) {
        this.dxaTipoAvaluo = dxaTipoAvaluo;
    }

    public String getDxaTipoAvaluo() {
        return this.dxaTipoAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxaDescDocto(String dxaDescDocto) {
        this.dxaDescDocto = dxaDescDocto;
    }

    public String getDxaDescDocto() {
        return this.dxaDescDocto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDxaAnoAltaReg(BigDecimal dxaAnoAltaReg) {
        this.dxaAnoAltaReg = dxaAnoAltaReg;
    }

    public BigDecimal getDxaAnoAltaReg() {
        return this.dxaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDxaMesAltaReg(BigDecimal dxaMesAltaReg) {
        this.dxaMesAltaReg = dxaMesAltaReg;
    }

    public BigDecimal getDxaMesAltaReg() {
        return this.dxaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDxaDiaAltaReg(BigDecimal dxaDiaAltaReg) {
        this.dxaDiaAltaReg = dxaDiaAltaReg;
    }

    public BigDecimal getDxaDiaAltaReg() {
        return this.dxaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDxaAnoUltMod(BigDecimal dxaAnoUltMod) {
        this.dxaAnoUltMod = dxaAnoUltMod;
    }

    public BigDecimal getDxaAnoUltMod() {
        return this.dxaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDxaMesUltMod(BigDecimal dxaMesUltMod) {
        this.dxaMesUltMod = dxaMesUltMod;
    }

    public BigDecimal getDxaMesUltMod() {
        return this.dxaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDxaDiaUltMod(BigDecimal dxaDiaUltMod) {
        this.dxaDiaUltMod = dxaDiaUltMod;
    }

    public BigDecimal getDxaDiaUltMod() {
        return this.dxaDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDxaCveStDocxa(String dxaCveStDocxa) {
        this.dxaCveStDocxa = dxaCveStDocxa;
    }

    public String getDxaCveStDocxa() {
        return this.dxaCveStDocxa;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DOCXAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDxaNumDocto() != null && this.getDxaNumDocto().longValue() == -999) {
            conditions += " AND DXA_NUM_DOCTO IS NULL";
        } else if (this.getDxaNumDocto() != null) {
            conditions += " AND DXA_NUM_DOCTO = ?";
            values.add(this.getDxaNumDocto());
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
        String sql = "SELECT * FROM DOCXAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDxaNumDocto() != null && this.getDxaNumDocto().longValue() == -999) {
            conditions += " AND DXA_NUM_DOCTO IS NULL";
        } else if (this.getDxaNumDocto() != null) {
            conditions += " AND DXA_NUM_DOCTO = ?";
            values.add(this.getDxaNumDocto());
        }

        if (this.getDxaNomDocto() != null && "null".equals(this.getDxaNomDocto())) {
            conditions += " AND DXA_NOM_DOCTO IS NULL";
        } else if (this.getDxaNomDocto() != null) {
            conditions += " AND DXA_NOM_DOCTO = ?";
            values.add(this.getDxaNomDocto());
        }

        if (this.getDxaTipoBien() != null && this.getDxaTipoBien().longValue() == -999) {
            conditions += " AND DXA_TIPO_BIEN IS NULL";
        } else if (this.getDxaTipoBien() != null) {
            conditions += " AND DXA_TIPO_BIEN = ?";
            values.add(this.getDxaTipoBien());
        }

        if (this.getDxaClasBien() != null && this.getDxaClasBien().longValue() == -999) {
            conditions += " AND DXA_CLAS_BIEN IS NULL";
        } else if (this.getDxaClasBien() != null) {
            conditions += " AND DXA_CLAS_BIEN = ?";
            values.add(this.getDxaClasBien());
        }

        if (this.getDxaTipoAvaluo() != null && "null".equals(this.getDxaTipoAvaluo())) {
            conditions += " AND DXA_TIPO_AVALUO IS NULL";
        } else if (this.getDxaTipoAvaluo() != null) {
            conditions += " AND DXA_TIPO_AVALUO = ?";
            values.add(this.getDxaTipoAvaluo());
        }

        if (this.getDxaDescDocto() != null && "null".equals(this.getDxaDescDocto())) {
            conditions += " AND DXA_DESC_DOCTO IS NULL";
        } else if (this.getDxaDescDocto() != null) {
            conditions += " AND DXA_DESC_DOCTO = ?";
            values.add(this.getDxaDescDocto());
        }

        if (this.getDxaAnoAltaReg() != null && this.getDxaAnoAltaReg().longValue() == -999) {
            conditions += " AND DXA_ANO_ALTA_REG IS NULL";
        } else if (this.getDxaAnoAltaReg() != null) {
            conditions += " AND DXA_ANO_ALTA_REG = ?";
            values.add(this.getDxaAnoAltaReg());
        }

        if (this.getDxaMesAltaReg() != null && this.getDxaMesAltaReg().longValue() == -999) {
            conditions += " AND DXA_MES_ALTA_REG IS NULL";
        } else if (this.getDxaMesAltaReg() != null) {
            conditions += " AND DXA_MES_ALTA_REG = ?";
            values.add(this.getDxaMesAltaReg());
        }

        if (this.getDxaDiaAltaReg() != null && this.getDxaDiaAltaReg().longValue() == -999) {
            conditions += " AND DXA_DIA_ALTA_REG IS NULL";
        } else if (this.getDxaDiaAltaReg() != null) {
            conditions += " AND DXA_DIA_ALTA_REG = ?";
            values.add(this.getDxaDiaAltaReg());
        }

        if (this.getDxaAnoUltMod() != null && this.getDxaAnoUltMod().longValue() == -999) {
            conditions += " AND DXA_ANO_ULT_MOD IS NULL";
        } else if (this.getDxaAnoUltMod() != null) {
            conditions += " AND DXA_ANO_ULT_MOD = ?";
            values.add(this.getDxaAnoUltMod());
        }

        if (this.getDxaMesUltMod() != null && this.getDxaMesUltMod().longValue() == -999) {
            conditions += " AND DXA_MES_ULT_MOD IS NULL";
        } else if (this.getDxaMesUltMod() != null) {
            conditions += " AND DXA_MES_ULT_MOD = ?";
            values.add(this.getDxaMesUltMod());
        }

        if (this.getDxaDiaUltMod() != null && this.getDxaDiaUltMod().longValue() == -999) {
            conditions += " AND DXA_DIA_ULT_MOD IS NULL";
        } else if (this.getDxaDiaUltMod() != null) {
            conditions += " AND DXA_DIA_ULT_MOD = ?";
            values.add(this.getDxaDiaUltMod());
        }

        if (this.getDxaCveStDocxa() != null && "null".equals(this.getDxaCveStDocxa())) {
            conditions += " AND DXA_CVE_ST_DOCXA IS NULL";
        } else if (this.getDxaCveStDocxa() != null) {
            conditions += " AND DXA_CVE_ST_DOCXA = ?";
            values.add(this.getDxaCveStDocxa());
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
        String sql = "UPDATE DOCXAVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DXA_NUM_DOCTO = ?";
        pkValues.add(this.getDxaNumDocto());
        fields += " DXA_NOM_DOCTO = ?, ";
        values.add(this.getDxaNomDocto());
        fields += " DXA_TIPO_BIEN = ?, ";
        values.add(this.getDxaTipoBien());
        fields += " DXA_CLAS_BIEN = ?, ";
        values.add(this.getDxaClasBien());
        fields += " DXA_TIPO_AVALUO = ?, ";
        values.add(this.getDxaTipoAvaluo());
        fields += " DXA_DESC_DOCTO = ?, ";
        values.add(this.getDxaDescDocto());
        fields += " DXA_ANO_ALTA_REG = ?, ";
        values.add(this.getDxaAnoAltaReg());
        fields += " DXA_MES_ALTA_REG = ?, ";
        values.add(this.getDxaMesAltaReg());
        fields += " DXA_DIA_ALTA_REG = ?, ";
        values.add(this.getDxaDiaAltaReg());
        fields += " DXA_ANO_ULT_MOD = ?, ";
        values.add(this.getDxaAnoUltMod());
        fields += " DXA_MES_ULT_MOD = ?, ";
        values.add(this.getDxaMesUltMod());
        fields += " DXA_DIA_ULT_MOD = ?, ";
        values.add(this.getDxaDiaUltMod());
        fields += " DXA_CVE_ST_DOCXA = ?, ";
        values.add(this.getDxaCveStDocxa());
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
        String sql = "INSERT INTO DOCXAVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DXA_NUM_DOCTO";
        fieldValues += ", ?";
        values.add(this.getDxaNumDocto());

        fields += ", DXA_NOM_DOCTO";
        fieldValues += ", ?";
        values.add(this.getDxaNomDocto());

        fields += ", DXA_TIPO_BIEN";
        fieldValues += ", ?";
        values.add(this.getDxaTipoBien());

        fields += ", DXA_CLAS_BIEN";
        fieldValues += ", ?";
        values.add(this.getDxaClasBien());

        fields += ", DXA_TIPO_AVALUO";
        fieldValues += ", ?";
        values.add(this.getDxaTipoAvaluo());

        fields += ", DXA_DESC_DOCTO";
        fieldValues += ", ?";
        values.add(this.getDxaDescDocto());

        fields += ", DXA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDxaAnoAltaReg());

        fields += ", DXA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDxaMesAltaReg());

        fields += ", DXA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDxaDiaAltaReg());

        fields += ", DXA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDxaAnoUltMod());

        fields += ", DXA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDxaMesUltMod());

        fields += ", DXA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDxaDiaUltMod());

        fields += ", DXA_CVE_ST_DOCXA";
        fieldValues += ", ?";
        values.add(this.getDxaCveStDocxa());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DOCXAVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DXA_NUM_DOCTO = ?";
        values.add(this.getDxaNumDocto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Docxaval instance = (Docxaval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDxaNumDocto().equals(instance.getDxaNumDocto()))
            equalObjects = false;
        if (equalObjects && !this.getDxaNomDocto().equals(instance.getDxaNomDocto()))
            equalObjects = false;
        if (equalObjects && !this.getDxaTipoBien().equals(instance.getDxaTipoBien()))
            equalObjects = false;
        if (equalObjects && !this.getDxaClasBien().equals(instance.getDxaClasBien()))
            equalObjects = false;
        if (equalObjects && !this.getDxaTipoAvaluo().equals(instance.getDxaTipoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getDxaDescDocto().equals(instance.getDxaDescDocto()))
            equalObjects = false;
        if (equalObjects && !this.getDxaAnoAltaReg().equals(instance.getDxaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDxaMesAltaReg().equals(instance.getDxaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDxaDiaAltaReg().equals(instance.getDxaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDxaAnoUltMod().equals(instance.getDxaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDxaMesUltMod().equals(instance.getDxaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDxaDiaUltMod().equals(instance.getDxaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDxaCveStDocxa().equals(instance.getDxaCveStDocxa()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Docxaval result = new Docxaval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDxaNumDocto((BigDecimal) objectData.getData("DXA_NUM_DOCTO"));
        result.setDxaNomDocto((String) objectData.getData("DXA_NOM_DOCTO"));
        result.setDxaTipoBien((BigDecimal) objectData.getData("DXA_TIPO_BIEN"));
        result.setDxaClasBien((BigDecimal) objectData.getData("DXA_CLAS_BIEN"));
        result.setDxaTipoAvaluo((String) objectData.getData("DXA_TIPO_AVALUO"));
        result.setDxaDescDocto((String) objectData.getData("DXA_DESC_DOCTO"));
        result.setDxaAnoAltaReg((BigDecimal) objectData.getData("DXA_ANO_ALTA_REG"));
        result.setDxaMesAltaReg((BigDecimal) objectData.getData("DXA_MES_ALTA_REG"));
        result.setDxaDiaAltaReg((BigDecimal) objectData.getData("DXA_DIA_ALTA_REG"));
        result.setDxaAnoUltMod((BigDecimal) objectData.getData("DXA_ANO_ULT_MOD"));
        result.setDxaMesUltMod((BigDecimal) objectData.getData("DXA_MES_ULT_MOD"));
        result.setDxaDiaUltMod((BigDecimal) objectData.getData("DXA_DIA_ULT_MOD"));
        result.setDxaCveStDocxa((String) objectData.getData("DXA_CVE_ST_DOCXA"));

        return result;

    }

}
