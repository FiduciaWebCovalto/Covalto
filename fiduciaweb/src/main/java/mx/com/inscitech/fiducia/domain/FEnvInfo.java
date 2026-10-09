package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ENV_INFO_PK", columns = { "FEI_ID_SECUENCIAL" }, sequences = { "MAX" })
public class FEnvInfo extends DomainObject {

    BigDecimal feiIdSecuencial = null;
    String feiCalle = null;
    String feiNumInterno = null;
    String feiNumExterno = null;
    String feiColonia = null;
    String feiDelMun = null;
    String feiCiuPob = null;
    String feiCodPostal = null;
    String feiEntFed = null;
    String feiPais = null;
    String feiNombre = null;
    String feiNomFide = null;

    public FEnvInfo() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFeiIdSecuencial(BigDecimal feiIdSecuencial) {
        this.feiIdSecuencial = feiIdSecuencial;
    }

    public BigDecimal getFeiIdSecuencial() {
        return this.feiIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiCalle(String feiCalle) {
        this.feiCalle = feiCalle;
    }

    public String getFeiCalle() {
        return this.feiCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiNumInterno(String feiNumInterno) {
        this.feiNumInterno = feiNumInterno;
    }

    public String getFeiNumInterno() {
        return this.feiNumInterno;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiNumExterno(String feiNumExterno) {
        this.feiNumExterno = feiNumExterno;
    }

    public String getFeiNumExterno() {
        return this.feiNumExterno;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiColonia(String feiColonia) {
        this.feiColonia = feiColonia;
    }

    public String getFeiColonia() {
        return this.feiColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiDelMun(String feiDelMun) {
        this.feiDelMun = feiDelMun;
    }

    public String getFeiDelMun() {
        return this.feiDelMun;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiCiuPob(String feiCiuPob) {
        this.feiCiuPob = feiCiuPob;
    }

    public String getFeiCiuPob() {
        return this.feiCiuPob;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiCodPostal(String feiCodPostal) {
        this.feiCodPostal = feiCodPostal;
    }

    public String getFeiCodPostal() {
        return this.feiCodPostal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiEntFed(String feiEntFed) {
        this.feiEntFed = feiEntFed;
    }

    public String getFeiEntFed() {
        return this.feiEntFed;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiPais(String feiPais) {
        this.feiPais = feiPais;
    }

    public String getFeiPais() {
        return this.feiPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiNombre(String feiNombre) {
        this.feiNombre = feiNombre;
    }

    public String getFeiNombre() {
        return this.feiNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFeiNomFide(String feiNomFide) {
        this.feiNomFide = feiNomFide;
    }

    public String getFeiNomFide() {
        return this.feiNomFide;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ENV_INFO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFeiIdSecuencial() != null && this.getFeiIdSecuencial().longValue() == -999) {
            conditions += " AND FEI_ID_SECUENCIAL IS NULL";
        } else if (this.getFeiIdSecuencial() != null) {
            conditions += " AND FEI_ID_SECUENCIAL = ?";
            values.add(this.getFeiIdSecuencial());
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
        String sql = "SELECT * FROM F_ENV_INFO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFeiIdSecuencial() != null && this.getFeiIdSecuencial().longValue() == -999) {
            conditions += " AND FEI_ID_SECUENCIAL IS NULL";
        } else if (this.getFeiIdSecuencial() != null) {
            conditions += " AND FEI_ID_SECUENCIAL = ?";
            values.add(this.getFeiIdSecuencial());
        }

        if (this.getFeiCalle() != null && "null".equals(this.getFeiCalle())) {
            conditions += " AND FEI_CALLE IS NULL";
        } else if (this.getFeiCalle() != null) {
            conditions += " AND FEI_CALLE = ?";
            values.add(this.getFeiCalle());
        }

        if (this.getFeiNumInterno() != null && "null".equals(this.getFeiNumInterno())) {
            conditions += " AND FEI_NUM_INTERNO IS NULL";
        } else if (this.getFeiNumInterno() != null) {
            conditions += " AND FEI_NUM_INTERNO = ?";
            values.add(this.getFeiNumInterno());
        }

        if (this.getFeiNumExterno() != null && "null".equals(this.getFeiNumExterno())) {
            conditions += " AND FEI_NUM_EXTERNO IS NULL";
        } else if (this.getFeiNumExterno() != null) {
            conditions += " AND FEI_NUM_EXTERNO = ?";
            values.add(this.getFeiNumExterno());
        }

        if (this.getFeiColonia() != null && "null".equals(this.getFeiColonia())) {
            conditions += " AND FEI_COLONIA IS NULL";
        } else if (this.getFeiColonia() != null) {
            conditions += " AND FEI_COLONIA = ?";
            values.add(this.getFeiColonia());
        }

        if (this.getFeiDelMun() != null && "null".equals(this.getFeiDelMun())) {
            conditions += " AND FEI_DEL_MUN IS NULL";
        } else if (this.getFeiDelMun() != null) {
            conditions += " AND FEI_DEL_MUN = ?";
            values.add(this.getFeiDelMun());
        }

        if (this.getFeiCiuPob() != null && "null".equals(this.getFeiCiuPob())) {
            conditions += " AND FEI_CIU_POB IS NULL";
        } else if (this.getFeiCiuPob() != null) {
            conditions += " AND FEI_CIU_POB = ?";
            values.add(this.getFeiCiuPob());
        }

        if (this.getFeiCodPostal() != null && "null".equals(this.getFeiCodPostal())) {
            conditions += " AND FEI_COD_POSTAL IS NULL";
        } else if (this.getFeiCodPostal() != null) {
            conditions += " AND FEI_COD_POSTAL = ?";
            values.add(this.getFeiCodPostal());
        }

        if (this.getFeiEntFed() != null && "null".equals(this.getFeiEntFed())) {
            conditions += " AND FEI_ENT_FED IS NULL";
        } else if (this.getFeiEntFed() != null) {
            conditions += " AND FEI_ENT_FED = ?";
            values.add(this.getFeiEntFed());
        }

        if (this.getFeiPais() != null && "null".equals(this.getFeiPais())) {
            conditions += " AND FEI_PAIS IS NULL";
        } else if (this.getFeiPais() != null) {
            conditions += " AND FEI_PAIS = ?";
            values.add(this.getFeiPais());
        }

        if (this.getFeiNombre() != null && "null".equals(this.getFeiNombre())) {
            conditions += " AND FEI_NOMBRE IS NULL";
        } else if (this.getFeiNombre() != null) {
            conditions += " AND FEI_NOMBRE = ?";
            values.add(this.getFeiNombre());
        }

        if (this.getFeiNomFide() != null && "null".equals(this.getFeiNomFide())) {
            conditions += " AND FEI_NOM_FIDE IS NULL";
        } else if (this.getFeiNomFide() != null) {
            conditions += " AND FEI_NOM_FIDE = ?";
            values.add(this.getFeiNomFide());
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
        String sql = "UPDATE F_ENV_INFO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FEI_ID_SECUENCIAL = ?";
        pkValues.add(this.getFeiIdSecuencial());
        fields += " FEI_CALLE = ?, ";
        values.add(this.getFeiCalle());
        fields += " FEI_NUM_INTERNO = ?, ";
        values.add(this.getFeiNumInterno());
        fields += " FEI_NUM_EXTERNO = ?, ";
        values.add(this.getFeiNumExterno());
        fields += " FEI_COLONIA = ?, ";
        values.add(this.getFeiColonia());
        fields += " FEI_DEL_MUN = ?, ";
        values.add(this.getFeiDelMun());
        fields += " FEI_CIU_POB = ?, ";
        values.add(this.getFeiCiuPob());
        fields += " FEI_COD_POSTAL = ?, ";
        values.add(this.getFeiCodPostal());
        fields += " FEI_ENT_FED = ?, ";
        values.add(this.getFeiEntFed());
        fields += " FEI_PAIS = ?, ";
        values.add(this.getFeiPais());
        fields += " FEI_NOMBRE = ?, ";
        values.add(this.getFeiNombre());
        fields += " FEI_NOM_FIDE = ?, ";
        values.add(this.getFeiNomFide());
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
        String sql = "INSERT INTO F_ENV_INFO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FEI_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFeiIdSecuencial());

        fields += ", FEI_CALLE";
        fieldValues += ", ?";
        values.add(this.getFeiCalle());

        fields += ", FEI_NUM_INTERNO";
        fieldValues += ", ?";
        values.add(this.getFeiNumInterno());

        fields += ", FEI_NUM_EXTERNO";
        fieldValues += ", ?";
        values.add(this.getFeiNumExterno());

        fields += ", FEI_COLONIA";
        fieldValues += ", ?";
        values.add(this.getFeiColonia());

        fields += ", FEI_DEL_MUN";
        fieldValues += ", ?";
        values.add(this.getFeiDelMun());

        fields += ", FEI_CIU_POB";
        fieldValues += ", ?";
        values.add(this.getFeiCiuPob());

        fields += ", FEI_COD_POSTAL";
        fieldValues += ", ?";
        values.add(this.getFeiCodPostal());

        fields += ", FEI_ENT_FED";
        fieldValues += ", ?";
        values.add(this.getFeiEntFed());

        fields += ", FEI_PAIS";
        fieldValues += ", ?";
        values.add(this.getFeiPais());

        fields += ", FEI_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFeiNombre());

        fields += ", FEI_NOM_FIDE";
        fieldValues += ", ?";
        values.add(this.getFeiNomFide());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ENV_INFO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FEI_ID_SECUENCIAL = ?";
        values.add(this.getFeiIdSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEnvInfo instance = (FEnvInfo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFeiIdSecuencial().equals(instance.getFeiIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFeiCalle().equals(instance.getFeiCalle()))
            equalObjects = false;
        if (equalObjects && !this.getFeiNumInterno().equals(instance.getFeiNumInterno()))
            equalObjects = false;
        if (equalObjects && !this.getFeiNumExterno().equals(instance.getFeiNumExterno()))
            equalObjects = false;
        if (equalObjects && !this.getFeiColonia().equals(instance.getFeiColonia()))
            equalObjects = false;
        if (equalObjects && !this.getFeiDelMun().equals(instance.getFeiDelMun()))
            equalObjects = false;
        if (equalObjects && !this.getFeiCiuPob().equals(instance.getFeiCiuPob()))
            equalObjects = false;
        if (equalObjects && !this.getFeiCodPostal().equals(instance.getFeiCodPostal()))
            equalObjects = false;
        if (equalObjects && !this.getFeiEntFed().equals(instance.getFeiEntFed()))
            equalObjects = false;
        if (equalObjects && !this.getFeiPais().equals(instance.getFeiPais()))
            equalObjects = false;
        if (equalObjects && !this.getFeiNombre().equals(instance.getFeiNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFeiNomFide().equals(instance.getFeiNomFide()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEnvInfo result = new FEnvInfo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFeiIdSecuencial((BigDecimal) objectData.getData("FEI_ID_SECUENCIAL"));
        result.setFeiCalle((String) objectData.getData("FEI_CALLE"));
        result.setFeiNumInterno((String) objectData.getData("FEI_NUM_INTERNO"));
        result.setFeiNumExterno((String) objectData.getData("FEI_NUM_EXTERNO"));
        result.setFeiColonia((String) objectData.getData("FEI_COLONIA"));
        result.setFeiDelMun((String) objectData.getData("FEI_DEL_MUN"));
        result.setFeiCiuPob((String) objectData.getData("FEI_CIU_POB"));
        result.setFeiCodPostal((String) objectData.getData("FEI_COD_POSTAL"));
        result.setFeiEntFed((String) objectData.getData("FEI_ENT_FED"));
        result.setFeiPais((String) objectData.getData("FEI_PAIS"));
        result.setFeiNombre((String) objectData.getData("FEI_NOMBRE"));
        result.setFeiNomFide((String) objectData.getData("FEI_NOM_FIDE"));

        return result;

    }

}
