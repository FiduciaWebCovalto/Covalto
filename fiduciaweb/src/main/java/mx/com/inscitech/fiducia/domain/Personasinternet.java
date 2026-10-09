package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PERSONASINTERNET_PK", columns = { "PIN_NUM_CONTRATO", "PIN_NUM_PERSONA", "PIN_TIPO_PERS", "PIN_TIPO_OPERACION" }, sequences = { "MANUAL" })
public class Personasinternet extends DomainObject {

    BigDecimal pinNumContrato = null;
    BigDecimal pinNumPersona = null;
    String pinTipoPers = null;
    BigDecimal pinFormaLiq = null;
    String pinTipoOperacion = null;

    public Personasinternet() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 18, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumContrato(BigDecimal pinNumContrato) {
        this.pinNumContrato = pinNumContrato;
    }

    public BigDecimal getPinNumContrato() {
        return this.pinNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumPersona(BigDecimal pinNumPersona) {
        this.pinNumPersona = pinNumPersona;
    }

    public BigDecimal getPinNumPersona() {
        return this.pinNumPersona;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinTipoPers(String pinTipoPers) {
        this.pinTipoPers = pinTipoPers;
    }

    public String getPinTipoPers() {
        return this.pinTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinFormaLiq(BigDecimal pinFormaLiq) {
        this.pinFormaLiq = pinFormaLiq;
    }

    public BigDecimal getPinFormaLiq() {
        return this.pinFormaLiq;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinTipoOperacion(String pinTipoOperacion) {
        this.pinTipoOperacion = pinTipoOperacion;
    }

    public String getPinTipoOperacion() {
        return this.pinTipoOperacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PERSONASINTERNET ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPinNumContrato() != null && this.getPinNumContrato().longValue() == -999) {
            conditions += " AND PIN_NUM_CONTRATO IS NULL";
        } else if (this.getPinNumContrato() != null) {
            conditions += " AND PIN_NUM_CONTRATO = ?";
            values.add(this.getPinNumContrato());
        }

        if (this.getPinNumPersona() != null && this.getPinNumPersona().longValue() == -999) {
            conditions += " AND PIN_NUM_PERSONA IS NULL";
        } else if (this.getPinNumPersona() != null) {
            conditions += " AND PIN_NUM_PERSONA = ?";
            values.add(this.getPinNumPersona());
        }

        if (this.getPinTipoPers() != null && "null".equals(this.getPinTipoPers())) {
            conditions += " AND PIN_TIPO_PERS IS NULL";
        } else if (this.getPinTipoPers() != null) {
            conditions += " AND PIN_TIPO_PERS = ?";
            values.add(this.getPinTipoPers());
        }

        if (this.getPinTipoOperacion() != null && "null".equals(this.getPinTipoOperacion())) {
            conditions += " AND PIN_TIPO_OPERACION IS NULL";
        } else if (this.getPinTipoOperacion() != null) {
            conditions += " AND PIN_TIPO_OPERACION = ?";
            values.add(this.getPinTipoOperacion());
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
        String sql = "SELECT * FROM PERSONASINTERNET ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPinNumContrato() != null && this.getPinNumContrato().longValue() == -999) {
            conditions += " AND PIN_NUM_CONTRATO IS NULL";
        } else if (this.getPinNumContrato() != null) {
            conditions += " AND PIN_NUM_CONTRATO = ?";
            values.add(this.getPinNumContrato());
        }

        if (this.getPinNumPersona() != null && this.getPinNumPersona().longValue() == -999) {
            conditions += " AND PIN_NUM_PERSONA IS NULL";
        } else if (this.getPinNumPersona() != null) {
            conditions += " AND PIN_NUM_PERSONA = ?";
            values.add(this.getPinNumPersona());
        }

        if (this.getPinTipoPers() != null && "null".equals(this.getPinTipoPers())) {
            conditions += " AND PIN_TIPO_PERS IS NULL";
        } else if (this.getPinTipoPers() != null) {
            conditions += " AND PIN_TIPO_PERS = ?";
            values.add(this.getPinTipoPers());
        }

        if (this.getPinFormaLiq() != null && this.getPinFormaLiq().longValue() == -999) {
            conditions += " AND PIN_FORMA_LIQ IS NULL";
        } else if (this.getPinFormaLiq() != null) {
            conditions += " AND PIN_FORMA_LIQ = ?";
            values.add(this.getPinFormaLiq());
        }

        if (this.getPinTipoOperacion() != null && "null".equals(this.getPinTipoOperacion())) {
            conditions += " AND PIN_TIPO_OPERACION IS NULL";
        } else if (this.getPinTipoOperacion() != null) {
            conditions += " AND PIN_TIPO_OPERACION = ?";
            values.add(this.getPinTipoOperacion());
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
        String sql = "UPDATE PERSONASINTERNET SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PIN_NUM_CONTRATO = ?";
        pkValues.add(this.getPinNumContrato());
        conditions += " AND PIN_NUM_PERSONA = ?";
        pkValues.add(this.getPinNumPersona());
        conditions += " AND PIN_TIPO_PERS = ?";
        pkValues.add(this.getPinTipoPers());
        fields += " PIN_FORMA_LIQ = ?, ";
        values.add(this.getPinFormaLiq());
        conditions += " AND PIN_TIPO_OPERACION = ?";
        pkValues.add(this.getPinTipoOperacion());
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
        String sql = "INSERT INTO PERSONASINTERNET ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PIN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPinNumContrato());

        fields += ", PIN_NUM_PERSONA";
        fieldValues += ", ?";
        values.add(this.getPinNumPersona());

        fields += ", PIN_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getPinTipoPers());

        fields += ", PIN_FORMA_LIQ";
        fieldValues += ", ?";
        values.add(this.getPinFormaLiq());

        fields += ", PIN_TIPO_OPERACION";
        fieldValues += ", ?";
        values.add(this.getPinTipoOperacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PERSONASINTERNET WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PIN_NUM_CONTRATO = ?";
        values.add(this.getPinNumContrato());
        conditions += " AND PIN_NUM_PERSONA = ?";
        values.add(this.getPinNumPersona());
        conditions += " AND PIN_TIPO_PERS = ?";
        values.add(this.getPinTipoPers());
        conditions += " AND PIN_TIPO_OPERACION = ?";
        values.add(this.getPinTipoOperacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Personasinternet instance = (Personasinternet) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPinNumContrato().equals(instance.getPinNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumPersona().equals(instance.getPinNumPersona()))
            equalObjects = false;
        if (equalObjects && !this.getPinTipoPers().equals(instance.getPinTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getPinFormaLiq().equals(instance.getPinFormaLiq()))
            equalObjects = false;
        if (equalObjects && !this.getPinTipoOperacion().equals(instance.getPinTipoOperacion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Personasinternet result = new Personasinternet();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPinNumContrato((BigDecimal) objectData.getData("PIN_NUM_CONTRATO"));
        result.setPinNumPersona((BigDecimal) objectData.getData("PIN_NUM_PERSONA"));
        result.setPinTipoPers((String) objectData.getData("PIN_TIPO_PERS"));
        result.setPinFormaLiq((BigDecimal) objectData.getData("PIN_FORMA_LIQ"));
        result.setPinTipoOperacion((String) objectData.getData("PIN_TIPO_OPERACION"));

        return result;

    }

}
