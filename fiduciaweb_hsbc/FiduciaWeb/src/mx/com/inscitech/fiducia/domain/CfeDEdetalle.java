package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PK_CFE_D_EDETALLE", columns = { "IDOPERACION_CEN_I", "IDSISTEMA_CEN_I", "IDCAMPO_CEN_I", "IDREGISTRO_EDT_I" }, sequences = { "MANUAL" })
public class CfeDEdetalle extends DomainObject {

    BigDecimal idoperacionCenI = null;
    BigDecimal idsistemaCenI = null;
    BigDecimal idregistroEdtI = null;
    BigDecimal idcampoCenI = null;
    String valorEdtS = null;
    String hora = null;

    public CfeDEdetalle() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 13, scale = 0, javaClass = BigDecimal.class)
    public void setIdoperacionCenI(BigDecimal idoperacionCenI) {
        this.idoperacionCenI = idoperacionCenI;
    }

    public BigDecimal getIdoperacionCenI() {
        return this.idoperacionCenI;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 9, scale = 0, javaClass = BigDecimal.class)
    public void setIdsistemaCenI(BigDecimal idsistemaCenI) {
        this.idsistemaCenI = idsistemaCenI;
    }

    public BigDecimal getIdsistemaCenI() {
        return this.idsistemaCenI;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 9, scale = 0, javaClass = BigDecimal.class)
    public void setIdregistroEdtI(BigDecimal idregistroEdtI) {
        this.idregistroEdtI = idregistroEdtI;
    }

    public BigDecimal getIdregistroEdtI() {
        return this.idregistroEdtI;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 9, scale = 0, javaClass = BigDecimal.class)
    public void setIdcampoCenI(BigDecimal idcampoCenI) {
        this.idcampoCenI = idcampoCenI;
    }

    public BigDecimal getIdcampoCenI() {
        return this.idcampoCenI;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValorEdtS(String valorEdtS) {
        this.valorEdtS = valorEdtS;
    }

    public String getValorEdtS() {
        return this.valorEdtS;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFhora(String hora) {
        this.hora = hora;
    }

    public String getFhora() {
        return this.hora;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CFE_D_EDETALLE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIdoperacionCenI() != null && this.getIdoperacionCenI().longValue() == -999) {
            conditions += " AND IDOPERACION_CEN_I IS NULL";
        } else if (this.getIdoperacionCenI() != null) {
            conditions += " AND IDOPERACION_CEN_I = ?";
            values.add(this.getIdoperacionCenI());
        }

        if (this.getIdsistemaCenI() != null && this.getIdsistemaCenI().longValue() == -999) {
            conditions += " AND IDSISTEMA_CEN_I IS NULL";
        } else if (this.getIdsistemaCenI() != null) {
            conditions += " AND IDSISTEMA_CEN_I = ?";
            values.add(this.getIdsistemaCenI());
        }

        if (this.getIdregistroEdtI() != null && this.getIdregistroEdtI().longValue() == -999) {
            conditions += " AND IDREGISTRO_EDT_I IS NULL";
        } else if (this.getIdregistroEdtI() != null) {
            conditions += " AND IDREGISTRO_EDT_I = ?";
            values.add(this.getIdregistroEdtI());
        }

        if (this.getIdcampoCenI() != null && this.getIdcampoCenI().longValue() == -999) {
            conditions += " AND IDCAMPO_CEN_I IS NULL";
        } else if (this.getIdcampoCenI() != null) {
            conditions += " AND IDCAMPO_CEN_I = ?";
            values.add(this.getIdcampoCenI());
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
        String sql = "SELECT * FROM CFE_D_EDETALLE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIdoperacionCenI() != null && this.getIdoperacionCenI().longValue() == -999) {
            conditions += " AND IDOPERACION_CEN_I IS NULL";
        } else if (this.getIdoperacionCenI() != null) {
            conditions += " AND IDOPERACION_CEN_I = ?";
            values.add(this.getIdoperacionCenI());
        }

        if (this.getIdsistemaCenI() != null && this.getIdsistemaCenI().longValue() == -999) {
            conditions += " AND IDSISTEMA_CEN_I IS NULL";
        } else if (this.getIdsistemaCenI() != null) {
            conditions += " AND IDSISTEMA_CEN_I = ?";
            values.add(this.getIdsistemaCenI());
        }

        if (this.getIdregistroEdtI() != null && this.getIdregistroEdtI().longValue() == -999) {
            conditions += " AND IDREGISTRO_EDT_I IS NULL";
        } else if (this.getIdregistroEdtI() != null) {
            conditions += " AND IDREGISTRO_EDT_I = ?";
            values.add(this.getIdregistroEdtI());
        }

        if (this.getIdcampoCenI() != null && this.getIdcampoCenI().longValue() == -999) {
            conditions += " AND IDCAMPO_CEN_I IS NULL";
        } else if (this.getIdcampoCenI() != null) {
            conditions += " AND IDCAMPO_CEN_I = ?";
            values.add(this.getIdcampoCenI());
        }

        if (this.getValorEdtS() != null && "null".equals(this.getValorEdtS())) {
            conditions += " AND VALOR_EDT_S IS NULL";
        } else if (this.getValorEdtS() != null) {
            conditions += " AND VALOR_EDT_S = ?";
            values.add(this.getValorEdtS());
        }

        if (this.getFhora() != null && "null".equals(this.getFhora())) {
            conditions += " AND FHORA IS NULL";
        } else if (this.getFhora() != null) {
            conditions += " AND FHORA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFhora());
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
        String sql = "UPDATE CFE_D_EDETALLE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND IDOPERACION_CEN_I = ?";
        pkValues.add(this.getIdoperacionCenI());
        conditions += " AND IDSISTEMA_CEN_I = ?";
        pkValues.add(this.getIdsistemaCenI());
        conditions += " AND IDREGISTRO_EDT_I = ?";
        pkValues.add(this.getIdregistroEdtI());
        conditions += " AND IDCAMPO_CEN_I = ?";
        pkValues.add(this.getIdcampoCenI());
        fields += " VALOR_EDT_S = ?, ";
        values.add(this.getValorEdtS());
        fields += " FHORA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFhora());
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
        String sql = "INSERT INTO CFE_D_EDETALLE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", IDOPERACION_CEN_I";
        fieldValues += ", ?";
        values.add(this.getIdoperacionCenI());

        fields += ", IDSISTEMA_CEN_I";
        fieldValues += ", ?";
        values.add(this.getIdsistemaCenI());

        fields += ", IDREGISTRO_EDT_I";
        fieldValues += ", ?";
        values.add(this.getIdregistroEdtI());

        fields += ", IDCAMPO_CEN_I";
        fieldValues += ", ?";
        values.add(this.getIdcampoCenI());

        fields += ", VALOR_EDT_S";
        fieldValues += ", ?";
        values.add(this.getValorEdtS());

        fields += ", FHORA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFhora());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CFE_D_EDETALLE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND IDOPERACION_CEN_I = ?";
        values.add(this.getIdoperacionCenI());
        conditions += " AND IDSISTEMA_CEN_I = ?";
        values.add(this.getIdsistemaCenI());
        conditions += " AND IDREGISTRO_EDT_I = ?";
        values.add(this.getIdregistroEdtI());
        conditions += " AND IDCAMPO_CEN_I = ?";
        values.add(this.getIdcampoCenI());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        CfeDEdetalle instance = (CfeDEdetalle) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIdoperacionCenI().equals(instance.getIdoperacionCenI()))
            equalObjects = false;
        if (equalObjects && !this.getIdsistemaCenI().equals(instance.getIdsistemaCenI()))
            equalObjects = false;
        if (equalObjects && !this.getIdregistroEdtI().equals(instance.getIdregistroEdtI()))
            equalObjects = false;
        if (equalObjects && !this.getIdcampoCenI().equals(instance.getIdcampoCenI()))
            equalObjects = false;
        if (equalObjects && !this.getValorEdtS().equals(instance.getValorEdtS()))
            equalObjects = false;
        if (equalObjects && !this.getFhora().equals(instance.getFhora()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CfeDEdetalle result = new CfeDEdetalle();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIdoperacionCenI((BigDecimal) objectData.getData("IDOPERACION_CEN_I"));
        result.setIdsistemaCenI((BigDecimal) objectData.getData("IDSISTEMA_CEN_I"));
        result.setIdregistroEdtI((BigDecimal) objectData.getData("IDREGISTRO_EDT_I"));
        result.setIdcampoCenI((BigDecimal) objectData.getData("IDCAMPO_CEN_I"));
        result.setValorEdtS((String) objectData.getData("VALOR_EDT_S"));
        result.setFhora((String) objectData.getData("FHORA"));

        return result;

    }

}
