package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FIRMAS_PK", columns = { "FIR_FOLIO" }, sequences = { "MAX" })
public class Firmas extends DomainObject {

    BigDecimal firFolio = null;
    BigDecimal firNumContrato = null;
    BigDecimal firUsuarioCaptura = null;
    String firFechaCaptura = null;
    BigDecimal firUsuarioFirma1 = null;
    String firStFirma1 = null;
    String firFechaFirma1 = null;
    BigDecimal firUsuarioFirma2 = null;
    String firStFirma2 = null;
    String firFechaFirma2 = null;

    public Firmas() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFirFolio(BigDecimal firFolio) {
        this.firFolio = firFolio;
    }

    public BigDecimal getFirFolio() {
        return this.firFolio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFirNumContrato(BigDecimal firNumContrato) {
        this.firNumContrato = firNumContrato;
    }

    public BigDecimal getFirNumContrato() {
        return this.firNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFirUsuarioCaptura(BigDecimal firUsuarioCaptura) {
        this.firUsuarioCaptura = firUsuarioCaptura;
    }

    public BigDecimal getFirUsuarioCaptura() {
        return this.firUsuarioCaptura;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFirFechaCaptura(String firFechaCaptura) {
        this.firFechaCaptura = firFechaCaptura;
    }

    public String getFirFechaCaptura() {
        return this.firFechaCaptura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFirUsuarioFirma1(BigDecimal firUsuarioFirma1) {
        this.firUsuarioFirma1 = firUsuarioFirma1;
    }

    public BigDecimal getFirUsuarioFirma1() {
        return this.firUsuarioFirma1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFirStFirma1(String firStFirma1) {
        this.firStFirma1 = firStFirma1;
    }

    public String getFirStFirma1() {
        return this.firStFirma1;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFirFechaFirma1(String firFechaFirma1) {
        this.firFechaFirma1 = firFechaFirma1;
    }

    public String getFirFechaFirma1() {
        return this.firFechaFirma1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFirUsuarioFirma2(BigDecimal firUsuarioFirma2) {
        this.firUsuarioFirma2 = firUsuarioFirma2;
    }

    public BigDecimal getFirUsuarioFirma2() {
        return this.firUsuarioFirma2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFirStFirma2(String firStFirma2) {
        this.firStFirma2 = firStFirma2;
    }

    public String getFirStFirma2() {
        return this.firStFirma2;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFirFechaFirma2(String firFechaFirma2) {
        this.firFechaFirma2 = firFechaFirma2;
    }

    public String getFirFechaFirma2() {
        return this.firFechaFirma2;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FIRMAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFirFolio() != null && this.getFirFolio().longValue() == -999) {
            conditions += " AND FIR_FOLIO IS NULL";
        } else if (this.getFirFolio() != null) {
            conditions += " AND FIR_FOLIO = ?";
            values.add(this.getFirFolio());
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
        String sql = "SELECT * FROM FIRMAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFirFolio() != null && this.getFirFolio().longValue() == -999) {
            conditions += " AND FIR_FOLIO IS NULL";
        } else if (this.getFirFolio() != null) {
            conditions += " AND FIR_FOLIO = ?";
            values.add(this.getFirFolio());
        }

        if (this.getFirNumContrato() != null && this.getFirNumContrato().longValue() == -999) {
            conditions += " AND FIR_NUM_CONTRATO IS NULL";
        } else if (this.getFirNumContrato() != null) {
            conditions += " AND FIR_NUM_CONTRATO = ?";
            values.add(this.getFirNumContrato());
        }

        if (this.getFirUsuarioCaptura() != null && this.getFirUsuarioCaptura().longValue() == -999) {
            conditions += " AND FIR_USUARIO_CAPTURA IS NULL";
        } else if (this.getFirUsuarioCaptura() != null) {
            conditions += " AND FIR_USUARIO_CAPTURA = ?";
            values.add(this.getFirUsuarioCaptura());
        }

        if (this.getFirFechaCaptura() != null && "null".equals(this.getFirFechaCaptura())) {
            conditions += " AND FIR_FECHA_CAPTURA IS NULL";
        } else if (this.getFirFechaCaptura() != null) {
            conditions += " AND FIR_FECHA_CAPTURA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFirFechaCaptura());
        }

        if (this.getFirUsuarioFirma1() != null && this.getFirUsuarioFirma1().longValue() == -999) {
            conditions += " AND FIR_USUARIO_FIRMA1 IS NULL";
        } else if (this.getFirUsuarioFirma1() != null) {
            conditions += " AND FIR_USUARIO_FIRMA1 = ?";
            values.add(this.getFirUsuarioFirma1());
        }

        if (this.getFirStFirma1() != null && "null".equals(this.getFirStFirma1())) {
            conditions += " AND FIR_ST_FIRMA1 IS NULL";
        } else if (this.getFirStFirma1() != null) {
            conditions += " AND FIR_ST_FIRMA1 = ?";
            values.add(this.getFirStFirma1());
        }

        if (this.getFirFechaFirma1() != null && "null".equals(this.getFirFechaFirma1())) {
            conditions += " AND FIR_FECHA_FIRMA1 IS NULL";
        } else if (this.getFirFechaFirma1() != null) {
            conditions += " AND FIR_FECHA_FIRMA1 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFirFechaFirma1());
        }

        if (this.getFirUsuarioFirma2() != null && this.getFirUsuarioFirma2().longValue() == -999) {
            conditions += " AND FIR_USUARIO_FIRMA2 IS NULL";
        } else if (this.getFirUsuarioFirma2() != null) {
            conditions += " AND FIR_USUARIO_FIRMA2 = ?";
            values.add(this.getFirUsuarioFirma2());
        }

        if (this.getFirStFirma2() != null && "null".equals(this.getFirStFirma2())) {
            conditions += " AND FIR_ST_FIRMA2 IS NULL";
        } else if (this.getFirStFirma2() != null) {
            conditions += " AND FIR_ST_FIRMA2 = ?";
            values.add(this.getFirStFirma2());
        }

        if (this.getFirFechaFirma2() != null && "null".equals(this.getFirFechaFirma2())) {
            conditions += " AND FIR_FECHA_FIRMA2 IS NULL";
        } else if (this.getFirFechaFirma2() != null) {
            conditions += " AND FIR_FECHA_FIRMA2 = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFirFechaFirma2());
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
        String sql = "UPDATE FIRMAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FIR_FOLIO = ?";
        pkValues.add(this.getFirFolio());
        fields += " FIR_NUM_CONTRATO = ?, ";
        values.add(this.getFirNumContrato());
        fields += " FIR_USUARIO_CAPTURA = ?, ";
        values.add(this.getFirUsuarioCaptura());
        fields += " FIR_FECHA_CAPTURA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFirFechaCaptura());
        fields += " FIR_USUARIO_FIRMA1 = ?, ";
        values.add(this.getFirUsuarioFirma1());
        fields += " FIR_ST_FIRMA1 = ?, ";
        values.add(this.getFirStFirma1());
        fields += " FIR_FECHA_FIRMA1 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFirFechaFirma1());
        fields += " FIR_USUARIO_FIRMA2 = ?, ";
        values.add(this.getFirUsuarioFirma2());
        fields += " FIR_ST_FIRMA2 = ?, ";
        values.add(this.getFirStFirma2());
        fields += " FIR_FECHA_FIRMA2 = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFirFechaFirma2());
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
        String sql = "INSERT INTO FIRMAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FIR_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFirFolio());

        fields += ", FIR_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFirNumContrato());

        fields += ", FIR_USUARIO_CAPTURA";
        fieldValues += ", ?";
        values.add(this.getFirUsuarioCaptura());

        fields += ", FIR_FECHA_CAPTURA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFirFechaCaptura());

        fields += ", FIR_USUARIO_FIRMA1";
        fieldValues += ", ?";
        values.add(this.getFirUsuarioFirma1());

        fields += ", FIR_ST_FIRMA1";
        fieldValues += ", ?";
        values.add(this.getFirStFirma1());

        fields += ", FIR_FECHA_FIRMA1";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFirFechaFirma1());

        fields += ", FIR_USUARIO_FIRMA2";
        fieldValues += ", ?";
        values.add(this.getFirUsuarioFirma2());

        fields += ", FIR_ST_FIRMA2";
        fieldValues += ", ?";
        values.add(this.getFirStFirma2());

        fields += ", FIR_FECHA_FIRMA2";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFirFechaFirma2());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FIRMAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FIR_FOLIO = ?";
        values.add(this.getFirFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Firmas instance = (Firmas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFirFolio().equals(instance.getFirFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFirNumContrato().equals(instance.getFirNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFirUsuarioCaptura().equals(instance.getFirUsuarioCaptura()))
            equalObjects = false;
        if (equalObjects && !this.getFirFechaCaptura().equals(instance.getFirFechaCaptura()))
            equalObjects = false;
        if (equalObjects && !this.getFirUsuarioFirma1().equals(instance.getFirUsuarioFirma1()))
            equalObjects = false;
        if (equalObjects && !this.getFirStFirma1().equals(instance.getFirStFirma1()))
            equalObjects = false;
        if (equalObjects && !this.getFirFechaFirma1().equals(instance.getFirFechaFirma1()))
            equalObjects = false;
        if (equalObjects && !this.getFirUsuarioFirma2().equals(instance.getFirUsuarioFirma2()))
            equalObjects = false;
        if (equalObjects && !this.getFirStFirma2().equals(instance.getFirStFirma2()))
            equalObjects = false;
        if (equalObjects && !this.getFirFechaFirma2().equals(instance.getFirFechaFirma2()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Firmas result = new Firmas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFirFolio((BigDecimal) objectData.getData("FIR_FOLIO"));
        result.setFirNumContrato((BigDecimal) objectData.getData("FIR_NUM_CONTRATO"));
        result.setFirUsuarioCaptura((BigDecimal) objectData.getData("FIR_USUARIO_CAPTURA"));
        result.setFirFechaCaptura((String) objectData.getData("FIR_FECHA_CAPTURA"));
        result.setFirUsuarioFirma1((BigDecimal) objectData.getData("FIR_USUARIO_FIRMA1"));
        result.setFirStFirma1((String) objectData.getData("FIR_ST_FIRMA1"));
        result.setFirFechaFirma1((String) objectData.getData("FIR_FECHA_FIRMA1"));
        result.setFirUsuarioFirma2((BigDecimal) objectData.getData("FIR_USUARIO_FIRMA2"));
        result.setFirStFirma2((String) objectData.getData("FIR_ST_FIRMA2"));
        result.setFirFechaFirma2((String) objectData.getData("FIR_FECHA_FIRMA2"));

        return result;

    }

}
