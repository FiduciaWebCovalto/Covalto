package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CCPREP_PK", columns = { "CCP_NUM_PROGRAMA", "CCP_NUM_EMISION", "CCP_SECUENCIAL" }, sequences = { "MANUAL" })
public class Ccprep extends DomainObject {

    BigDecimal ccpNumPrograma = null;
    BigDecimal ccpNumEmision = null;
    BigDecimal ccpSecuencial = null;
    String ccpPizarra = null;
    String ccpNombre = null;
    String ccpNomResp = null;
    String ccpPuesto = null;
    String ccpDireccion = null;
    BigDecimal ccpNumPos = null;
    String ccpCveStCcp = null;

    public Ccprep() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcpNumPrograma(BigDecimal ccpNumPrograma) {
        this.ccpNumPrograma = ccpNumPrograma;
    }

    public BigDecimal getCcpNumPrograma() {
        return this.ccpNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcpNumEmision(BigDecimal ccpNumEmision) {
        this.ccpNumEmision = ccpNumEmision;
    }

    public BigDecimal getCcpNumEmision() {
        return this.ccpNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setCcpSecuencial(BigDecimal ccpSecuencial) {
        this.ccpSecuencial = ccpSecuencial;
    }

    public BigDecimal getCcpSecuencial() {
        return this.ccpSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcpPizarra(String ccpPizarra) {
        this.ccpPizarra = ccpPizarra;
    }

    public String getCcpPizarra() {
        return this.ccpPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcpNombre(String ccpNombre) {
        this.ccpNombre = ccpNombre;
    }

    public String getCcpNombre() {
        return this.ccpNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcpNomResp(String ccpNomResp) {
        this.ccpNomResp = ccpNomResp;
    }

    public String getCcpNomResp() {
        return this.ccpNomResp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcpPuesto(String ccpPuesto) {
        this.ccpPuesto = ccpPuesto;
    }

    public String getCcpPuesto() {
        return this.ccpPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcpDireccion(String ccpDireccion) {
        this.ccpDireccion = ccpDireccion;
    }

    public String getCcpDireccion() {
        return this.ccpDireccion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcpNumPos(BigDecimal ccpNumPos) {
        this.ccpNumPos = ccpNumPos;
    }

    public BigDecimal getCcpNumPos() {
        return this.ccpNumPos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcpCveStCcp(String ccpCveStCcp) {
        this.ccpCveStCcp = ccpCveStCcp;
    }

    public String getCcpCveStCcp() {
        return this.ccpCveStCcp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CCPREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCcpNumPrograma() != null && this.getCcpNumPrograma().longValue() == -999) {
            conditions += " AND CCP_NUM_PROGRAMA IS NULL";
        } else if (this.getCcpNumPrograma() != null) {
            conditions += " AND CCP_NUM_PROGRAMA = ?";
            values.add(this.getCcpNumPrograma());
        }

        if (this.getCcpNumEmision() != null && this.getCcpNumEmision().longValue() == -999) {
            conditions += " AND CCP_NUM_EMISION IS NULL";
        } else if (this.getCcpNumEmision() != null) {
            conditions += " AND CCP_NUM_EMISION = ?";
            values.add(this.getCcpNumEmision());
        }

        if (this.getCcpSecuencial() != null && this.getCcpSecuencial().longValue() == -999) {
            conditions += " AND CCP_SECUENCIAL IS NULL";
        } else if (this.getCcpSecuencial() != null) {
            conditions += " AND CCP_SECUENCIAL = ?";
            values.add(this.getCcpSecuencial());
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
        String sql = "SELECT * FROM CCPREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCcpNumPrograma() != null && this.getCcpNumPrograma().longValue() == -999) {
            conditions += " AND CCP_NUM_PROGRAMA IS NULL";
        } else if (this.getCcpNumPrograma() != null) {
            conditions += " AND CCP_NUM_PROGRAMA = ?";
            values.add(this.getCcpNumPrograma());
        }

        if (this.getCcpNumEmision() != null && this.getCcpNumEmision().longValue() == -999) {
            conditions += " AND CCP_NUM_EMISION IS NULL";
        } else if (this.getCcpNumEmision() != null) {
            conditions += " AND CCP_NUM_EMISION = ?";
            values.add(this.getCcpNumEmision());
        }

        if (this.getCcpSecuencial() != null && this.getCcpSecuencial().longValue() == -999) {
            conditions += " AND CCP_SECUENCIAL IS NULL";
        } else if (this.getCcpSecuencial() != null) {
            conditions += " AND CCP_SECUENCIAL = ?";
            values.add(this.getCcpSecuencial());
        }

        if (this.getCcpPizarra() != null && "null".equals(this.getCcpPizarra())) {
            conditions += " AND CCP_PIZARRA IS NULL";
        } else if (this.getCcpPizarra() != null) {
            conditions += " AND CCP_PIZARRA = ?";
            values.add(this.getCcpPizarra());
        }

        if (this.getCcpNombre() != null && "null".equals(this.getCcpNombre())) {
            conditions += " AND CCP_NOMBRE IS NULL";
        } else if (this.getCcpNombre() != null) {
            conditions += " AND CCP_NOMBRE = ?";
            values.add(this.getCcpNombre());
        }

        if (this.getCcpNomResp() != null && "null".equals(this.getCcpNomResp())) {
            conditions += " AND CCP_NOM_RESP IS NULL";
        } else if (this.getCcpNomResp() != null) {
            conditions += " AND CCP_NOM_RESP = ?";
            values.add(this.getCcpNomResp());
        }

        if (this.getCcpPuesto() != null && "null".equals(this.getCcpPuesto())) {
            conditions += " AND CCP_PUESTO IS NULL";
        } else if (this.getCcpPuesto() != null) {
            conditions += " AND CCP_PUESTO = ?";
            values.add(this.getCcpPuesto());
        }

        if (this.getCcpDireccion() != null && "null".equals(this.getCcpDireccion())) {
            conditions += " AND CCP_DIRECCION IS NULL";
        } else if (this.getCcpDireccion() != null) {
            conditions += " AND CCP_DIRECCION = ?";
            values.add(this.getCcpDireccion());
        }

        if (this.getCcpNumPos() != null && this.getCcpNumPos().longValue() == -999) {
            conditions += " AND CCP_NUM_POS IS NULL";
        } else if (this.getCcpNumPos() != null) {
            conditions += " AND CCP_NUM_POS = ?";
            values.add(this.getCcpNumPos());
        }

        if (this.getCcpCveStCcp() != null && "null".equals(this.getCcpCveStCcp())) {
            conditions += " AND CCP_CVE_ST_CCP IS NULL";
        } else if (this.getCcpCveStCcp() != null) {
            conditions += " AND CCP_CVE_ST_CCP = ?";
            values.add(this.getCcpCveStCcp());
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
        String sql = "UPDATE CCPREP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CCP_NUM_PROGRAMA = ?";
        pkValues.add(this.getCcpNumPrograma());
        conditions += " AND CCP_NUM_EMISION = ?";
        pkValues.add(this.getCcpNumEmision());
        conditions += " AND CCP_SECUENCIAL = ?";
        pkValues.add(this.getCcpSecuencial());
        fields += " CCP_PIZARRA = ?, ";
        values.add(this.getCcpPizarra());
        fields += " CCP_NOMBRE = ?, ";
        values.add(this.getCcpNombre());
        fields += " CCP_NOM_RESP = ?, ";
        values.add(this.getCcpNomResp());
        fields += " CCP_PUESTO = ?, ";
        values.add(this.getCcpPuesto());
        fields += " CCP_DIRECCION = ?, ";
        values.add(this.getCcpDireccion());
        fields += " CCP_NUM_POS = ?, ";
        values.add(this.getCcpNumPos());
        fields += " CCP_CVE_ST_CCP = ?, ";
        values.add(this.getCcpCveStCcp());
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
        String sql = "INSERT INTO CCPREP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CCP_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getCcpNumPrograma());

        fields += ", CCP_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getCcpNumEmision());

        fields += ", CCP_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getCcpSecuencial());

        fields += ", CCP_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCcpPizarra());

        fields += ", CCP_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getCcpNombre());

        fields += ", CCP_NOM_RESP";
        fieldValues += ", ?";
        values.add(this.getCcpNomResp());

        fields += ", CCP_PUESTO";
        fieldValues += ", ?";
        values.add(this.getCcpPuesto());

        fields += ", CCP_DIRECCION";
        fieldValues += ", ?";
        values.add(this.getCcpDireccion());

        fields += ", CCP_NUM_POS";
        fieldValues += ", ?";
        values.add(this.getCcpNumPos());

        fields += ", CCP_CVE_ST_CCP";
        fieldValues += ", ?";
        values.add(this.getCcpCveStCcp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CCPREP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CCP_NUM_PROGRAMA = ?";
        values.add(this.getCcpNumPrograma());
        conditions += " AND CCP_NUM_EMISION = ?";
        values.add(this.getCcpNumEmision());
        conditions += " AND CCP_SECUENCIAL = ?";
        values.add(this.getCcpSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ccprep instance = (Ccprep) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCcpNumPrograma().equals(instance.getCcpNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getCcpNumEmision().equals(instance.getCcpNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCcpSecuencial().equals(instance.getCcpSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getCcpPizarra().equals(instance.getCcpPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCcpNombre().equals(instance.getCcpNombre()))
            equalObjects = false;
        if (equalObjects && !this.getCcpNomResp().equals(instance.getCcpNomResp()))
            equalObjects = false;
        if (equalObjects && !this.getCcpPuesto().equals(instance.getCcpPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getCcpDireccion().equals(instance.getCcpDireccion()))
            equalObjects = false;
        if (equalObjects && !this.getCcpNumPos().equals(instance.getCcpNumPos()))
            equalObjects = false;
        if (equalObjects && !this.getCcpCveStCcp().equals(instance.getCcpCveStCcp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ccprep result = new Ccprep();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCcpNumPrograma((BigDecimal) objectData.getData("CCP_NUM_PROGRAMA"));
        result.setCcpNumEmision((BigDecimal) objectData.getData("CCP_NUM_EMISION"));
        result.setCcpSecuencial((BigDecimal) objectData.getData("CCP_SECUENCIAL"));
        result.setCcpPizarra((String) objectData.getData("CCP_PIZARRA"));
        result.setCcpNombre((String) objectData.getData("CCP_NOMBRE"));
        result.setCcpNomResp((String) objectData.getData("CCP_NOM_RESP"));
        result.setCcpPuesto((String) objectData.getData("CCP_PUESTO"));
        result.setCcpDireccion((String) objectData.getData("CCP_DIRECCION"));
        result.setCcpNumPos((BigDecimal) objectData.getData("CCP_NUM_POS"));
        result.setCcpCveStCcp((String) objectData.getData("CCP_CVE_ST_CCP"));

        return result;

    }

}
