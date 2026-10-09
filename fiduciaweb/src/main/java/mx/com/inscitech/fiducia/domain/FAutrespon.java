package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_AUTRESPON_PK", columns = { "EARE_ID_AUTORIDAD", "EARE_ID_RESPONSABLE" }, sequences = { "MANUAL" })
public class FAutrespon extends DomainObject {

    BigDecimal eareIdAutoridad = null;
    BigDecimal eareIdResponsable = null;
    String eareNomResponsable = null;
    String eareNomPuestRespo = null;
    String eareNumTelefono = null;
    String eareNumFax = null;
    String eareCveCorreo = null;
    String eareStAutrespon = null;

    public FAutrespon() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEareIdAutoridad(BigDecimal eareIdAutoridad) {
        this.eareIdAutoridad = eareIdAutoridad;
    }

    public BigDecimal getEareIdAutoridad() {
        return this.eareIdAutoridad;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEareIdResponsable(BigDecimal eareIdResponsable) {
        this.eareIdResponsable = eareIdResponsable;
    }

    public BigDecimal getEareIdResponsable() {
        return this.eareIdResponsable;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEareNomResponsable(String eareNomResponsable) {
        this.eareNomResponsable = eareNomResponsable;
    }

    public String getEareNomResponsable() {
        return this.eareNomResponsable;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEareNomPuestRespo(String eareNomPuestRespo) {
        this.eareNomPuestRespo = eareNomPuestRespo;
    }

    public String getEareNomPuestRespo() {
        return this.eareNomPuestRespo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEareNumTelefono(String eareNumTelefono) {
        this.eareNumTelefono = eareNumTelefono;
    }

    public String getEareNumTelefono() {
        return this.eareNumTelefono;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEareNumFax(String eareNumFax) {
        this.eareNumFax = eareNumFax;
    }

    public String getEareNumFax() {
        return this.eareNumFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEareCveCorreo(String eareCveCorreo) {
        this.eareCveCorreo = eareCveCorreo;
    }

    public String getEareCveCorreo() {
        return this.eareCveCorreo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEareStAutrespon(String eareStAutrespon) {
        this.eareStAutrespon = eareStAutrespon;
    }

    public String getEareStAutrespon() {
        return this.eareStAutrespon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_AUTRESPON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEareIdAutoridad() != null && this.getEareIdAutoridad().longValue() == -999) {
            conditions += " AND EARE_ID_AUTORIDAD IS NULL";
        } else if (this.getEareIdAutoridad() != null) {
            conditions += " AND EARE_ID_AUTORIDAD = ?";
            values.add(this.getEareIdAutoridad());
        }

        if (this.getEareIdResponsable() != null && this.getEareIdResponsable().longValue() == -999) {
            conditions += " AND EARE_ID_RESPONSABLE IS NULL";
        } else if (this.getEareIdResponsable() != null) {
            conditions += " AND EARE_ID_RESPONSABLE = ?";
            values.add(this.getEareIdResponsable());
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
        String sql = "SELECT * FROM F_AUTRESPON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEareIdAutoridad() != null && this.getEareIdAutoridad().longValue() == -999) {
            conditions += " AND EARE_ID_AUTORIDAD IS NULL";
        } else if (this.getEareIdAutoridad() != null) {
            conditions += " AND EARE_ID_AUTORIDAD = ?";
            values.add(this.getEareIdAutoridad());
        }

        if (this.getEareIdResponsable() != null && this.getEareIdResponsable().longValue() == -999) {
            conditions += " AND EARE_ID_RESPONSABLE IS NULL";
        } else if (this.getEareIdResponsable() != null) {
            conditions += " AND EARE_ID_RESPONSABLE = ?";
            values.add(this.getEareIdResponsable());
        }

        if (this.getEareNomResponsable() != null && "null".equals(this.getEareNomResponsable())) {
            conditions += " AND EARE_NOM_RESPONSABLE IS NULL";
        } else if (this.getEareNomResponsable() != null) {
            conditions += " AND EARE_NOM_RESPONSABLE = ?";
            values.add(this.getEareNomResponsable());
        }

        if (this.getEareNomPuestRespo() != null && "null".equals(this.getEareNomPuestRespo())) {
            conditions += " AND EARE_NOM_PUEST_RESPO IS NULL";
        } else if (this.getEareNomPuestRespo() != null) {
            conditions += " AND EARE_NOM_PUEST_RESPO = ?";
            values.add(this.getEareNomPuestRespo());
        }

        if (this.getEareNumTelefono() != null && "null".equals(this.getEareNumTelefono())) {
            conditions += " AND EARE_NUM_TELEFONO IS NULL";
        } else if (this.getEareNumTelefono() != null) {
            conditions += " AND EARE_NUM_TELEFONO = ?";
            values.add(this.getEareNumTelefono());
        }

        if (this.getEareNumFax() != null && "null".equals(this.getEareNumFax())) {
            conditions += " AND EARE_NUM_FAX IS NULL";
        } else if (this.getEareNumFax() != null) {
            conditions += " AND EARE_NUM_FAX = ?";
            values.add(this.getEareNumFax());
        }

        if (this.getEareCveCorreo() != null && "null".equals(this.getEareCveCorreo())) {
            conditions += " AND EARE_CVE_CORREO IS NULL";
        } else if (this.getEareCveCorreo() != null) {
            conditions += " AND EARE_CVE_CORREO = ?";
            values.add(this.getEareCveCorreo());
        }

        if (this.getEareStAutrespon() != null && "null".equals(this.getEareStAutrespon())) {
            conditions += " AND EARE_ST_AUTRESPON IS NULL";
        } else if (this.getEareStAutrespon() != null) {
            conditions += " AND EARE_ST_AUTRESPON = ?";
            values.add(this.getEareStAutrespon());
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
        String sql = "UPDATE F_AUTRESPON SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EARE_ID_AUTORIDAD = ?";
        pkValues.add(this.getEareIdAutoridad());
        conditions += " AND EARE_ID_RESPONSABLE = ?";
        pkValues.add(this.getEareIdResponsable());
        fields += " EARE_NOM_RESPONSABLE = ?, ";
        values.add(this.getEareNomResponsable());
        fields += " EARE_NOM_PUEST_RESPO = ?, ";
        values.add(this.getEareNomPuestRespo());
        fields += " EARE_NUM_TELEFONO = ?, ";
        values.add(this.getEareNumTelefono());
        fields += " EARE_NUM_FAX = ?, ";
        values.add(this.getEareNumFax());
        fields += " EARE_CVE_CORREO = ?, ";
        values.add(this.getEareCveCorreo());
        fields += " EARE_ST_AUTRESPON = ?, ";
        values.add(this.getEareStAutrespon());
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
        String sql = "INSERT INTO F_AUTRESPON ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EARE_ID_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getEareIdAutoridad());

        fields += ", EARE_ID_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getEareIdResponsable());

        fields += ", EARE_NOM_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getEareNomResponsable());

        fields += ", EARE_NOM_PUEST_RESPO";
        fieldValues += ", ?";
        values.add(this.getEareNomPuestRespo());

        fields += ", EARE_NUM_TELEFONO";
        fieldValues += ", ?";
        values.add(this.getEareNumTelefono());

        fields += ", EARE_NUM_FAX";
        fieldValues += ", ?";
        values.add(this.getEareNumFax());

        fields += ", EARE_CVE_CORREO";
        fieldValues += ", ?";
        values.add(this.getEareCveCorreo());

        fields += ", EARE_ST_AUTRESPON";
        fieldValues += ", ?";
        values.add(this.getEareStAutrespon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_AUTRESPON WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EARE_ID_AUTORIDAD = ?";
        values.add(this.getEareIdAutoridad());
        conditions += " AND EARE_ID_RESPONSABLE = ?";
        values.add(this.getEareIdResponsable());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAutrespon instance = (FAutrespon) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEareIdAutoridad().equals(instance.getEareIdAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getEareIdResponsable().equals(instance.getEareIdResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getEareNomResponsable().equals(instance.getEareNomResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getEareNomPuestRespo().equals(instance.getEareNomPuestRespo()))
            equalObjects = false;
        if (equalObjects && !this.getEareNumTelefono().equals(instance.getEareNumTelefono()))
            equalObjects = false;
        if (equalObjects && !this.getEareNumFax().equals(instance.getEareNumFax()))
            equalObjects = false;
        if (equalObjects && !this.getEareCveCorreo().equals(instance.getEareCveCorreo()))
            equalObjects = false;
        if (equalObjects && !this.getEareStAutrespon().equals(instance.getEareStAutrespon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAutrespon result = new FAutrespon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEareIdAutoridad((BigDecimal) objectData.getData("EARE_ID_AUTORIDAD"));
        result.setEareIdResponsable((BigDecimal) objectData.getData("EARE_ID_RESPONSABLE"));
        result.setEareNomResponsable((String) objectData.getData("EARE_NOM_RESPONSABLE"));
        result.setEareNomPuestRespo((String) objectData.getData("EARE_NOM_PUEST_RESPO"));
        result.setEareNumTelefono((String) objectData.getData("EARE_NUM_TELEFONO"));
        result.setEareNumFax((String) objectData.getData("EARE_NUM_FAX"));
        result.setEareCveCorreo((String) objectData.getData("EARE_CVE_CORREO"));
        result.setEareStAutrespon((String) objectData.getData("EARE_ST_AUTRESPON"));

        return result;

    }

}
