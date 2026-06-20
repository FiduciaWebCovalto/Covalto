package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DATOS_AVISOS_PK", columns = { "DAV_NUM_CONTRATO" }, sequences = { "MAX" })
public class DatosAvisos extends DomainObject {

    BigDecimal davNumContrato = null;
    String davDirigidoA = null;
    String davCalleNum = null;
    String davColonia = null;
    String davReferenciaCie = null;
    BigDecimal davCodigoPostal = null;
    String davCiudadEdo = null;
    BigDecimal davSecuenGcb = null;
    String davCargo = null;
    String davFechaAviso = null;
    String davFechaPr = null;
    String davFechaSr = null;
    String davPerDel = null;
    String davPerAl = null;

    public DatosAvisos() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDavNumContrato(BigDecimal davNumContrato) {
        this.davNumContrato = davNumContrato;
    }

    public BigDecimal getDavNumContrato() {
        return this.davNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDavDirigidoA(String davDirigidoA) {
        this.davDirigidoA = davDirigidoA;
    }

    public String getDavDirigidoA() {
        return this.davDirigidoA;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDavCalleNum(String davCalleNum) {
        this.davCalleNum = davCalleNum;
    }

    public String getDavCalleNum() {
        return this.davCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDavColonia(String davColonia) {
        this.davColonia = davColonia;
    }

    public String getDavColonia() {
        return this.davColonia;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDavReferenciaCie(String davReferenciaCie) {
        this.davReferenciaCie = davReferenciaCie;
    }

    public String getDavReferenciaCie() {
        return this.davReferenciaCie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDavCodigoPostal(BigDecimal davCodigoPostal) {
        this.davCodigoPostal = davCodigoPostal;
    }

    public BigDecimal getDavCodigoPostal() {
        return this.davCodigoPostal;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDavCiudadEdo(String davCiudadEdo) {
        this.davCiudadEdo = davCiudadEdo;
    }

    public String getDavCiudadEdo() {
        return this.davCiudadEdo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDavSecuenGcb(BigDecimal davSecuenGcb) {
        this.davSecuenGcb = davSecuenGcb;
    }

    public BigDecimal getDavSecuenGcb() {
        return this.davSecuenGcb;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDavCargo(String davCargo) {
        this.davCargo = davCargo;
    }

    public String getDavCargo() {
        return this.davCargo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setDavFechaAviso(String davFechaAviso) {
        this.davFechaAviso = davFechaAviso;
    }

    public String getDavFechaAviso() {
        return this.davFechaAviso;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setDavFechaPr(String davFechaPr) {
        this.davFechaPr = davFechaPr;
    }

    public String getDavFechaPr() {
        return this.davFechaPr;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setDavFechaSr(String davFechaSr) {
        this.davFechaSr = davFechaSr;
    }

    public String getDavFechaSr() {
        return this.davFechaSr;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setDavPerDel(String davPerDel) {
        this.davPerDel = davPerDel;
    }

    public String getDavPerDel() {
        return this.davPerDel;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setDavPerAl(String davPerAl) {
        this.davPerAl = davPerAl;
    }

    public String getDavPerAl() {
        return this.davPerAl;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DATOS_AVISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDavNumContrato() != null && this.getDavNumContrato().longValue() == -999) {
            conditions += " AND DAV_NUM_CONTRATO IS NULL";
        } else if (this.getDavNumContrato() != null) {
            conditions += " AND DAV_NUM_CONTRATO = ?";
            values.add(this.getDavNumContrato());
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
        String sql = "SELECT * FROM DATOS_AVISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDavNumContrato() != null && this.getDavNumContrato().longValue() == -999) {
            conditions += " AND DAV_NUM_CONTRATO IS NULL";
        } else if (this.getDavNumContrato() != null) {
            conditions += " AND DAV_NUM_CONTRATO = ?";
            values.add(this.getDavNumContrato());
        }

        if (this.getDavDirigidoA() != null && "null".equals(this.getDavDirigidoA())) {
            conditions += " AND DAV_DIRIGIDO_A IS NULL";
        } else if (this.getDavDirigidoA() != null) {
            conditions += " AND DAV_DIRIGIDO_A = ?";
            values.add(this.getDavDirigidoA());
        }

        if (this.getDavCalleNum() != null && "null".equals(this.getDavCalleNum())) {
            conditions += " AND DAV_CALLE_NUM IS NULL";
        } else if (this.getDavCalleNum() != null) {
            conditions += " AND DAV_CALLE_NUM = ?";
            values.add(this.getDavCalleNum());
        }

        if (this.getDavColonia() != null && "null".equals(this.getDavColonia())) {
            conditions += " AND DAV_COLONIA IS NULL";
        } else if (this.getDavColonia() != null) {
            conditions += " AND DAV_COLONIA = ?";
            values.add(this.getDavColonia());
        }

        if (this.getDavReferenciaCie() != null && "null".equals(this.getDavReferenciaCie())) {
            conditions += " AND DAV_REFERENCIA_CIE IS NULL";
        } else if (this.getDavReferenciaCie() != null) {
            conditions += " AND DAV_REFERENCIA_CIE = ?";
            values.add(this.getDavReferenciaCie());
        }

        if (this.getDavCodigoPostal() != null && this.getDavCodigoPostal().longValue() == -999) {
            conditions += " AND DAV_CODIGO_POSTAL IS NULL";
        } else if (this.getDavCodigoPostal() != null) {
            conditions += " AND DAV_CODIGO_POSTAL = ?";
            values.add(this.getDavCodigoPostal());
        }

        if (this.getDavCiudadEdo() != null && "null".equals(this.getDavCiudadEdo())) {
            conditions += " AND DAV_CIUDAD_EDO IS NULL";
        } else if (this.getDavCiudadEdo() != null) {
            conditions += " AND DAV_CIUDAD_EDO = ?";
            values.add(this.getDavCiudadEdo());
        }

        if (this.getDavSecuenGcb() != null && this.getDavSecuenGcb().longValue() == -999) {
            conditions += " AND DAV_SECUEN_GCB IS NULL";
        } else if (this.getDavSecuenGcb() != null) {
            conditions += " AND DAV_SECUEN_GCB = ?";
            values.add(this.getDavSecuenGcb());
        }

        if (this.getDavCargo() != null && "null".equals(this.getDavCargo())) {
            conditions += " AND DAV_CARGO IS NULL";
        } else if (this.getDavCargo() != null) {
            conditions += " AND DAV_CARGO = ?";
            values.add(this.getDavCargo());
        }

        if (this.getDavFechaAviso() != null && "null".equals(this.getDavFechaAviso())) {
            conditions += " AND DAV_FECHA_AVISO IS NULL";
        } else if (this.getDavFechaAviso() != null) {
            conditions += " AND DAV_FECHA_AVISO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDavFechaAviso());
        }

        if (this.getDavFechaPr() != null && "null".equals(this.getDavFechaPr())) {
            conditions += " AND DAV_FECHA_PR IS NULL";
        } else if (this.getDavFechaPr() != null) {
            conditions += " AND DAV_FECHA_PR = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDavFechaPr());
        }

        if (this.getDavFechaSr() != null && "null".equals(this.getDavFechaSr())) {
            conditions += " AND DAV_FECHA_SR IS NULL";
        } else if (this.getDavFechaSr() != null) {
            conditions += " AND DAV_FECHA_SR = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDavFechaSr());
        }

        if (this.getDavPerDel() != null && "null".equals(this.getDavPerDel())) {
            conditions += " AND DAV_PER_DEL IS NULL";
        } else if (this.getDavPerDel() != null) {
            conditions += " AND DAV_PER_DEL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDavPerDel());
        }

        if (this.getDavPerAl() != null && "null".equals(this.getDavPerAl())) {
            conditions += " AND DAV_PER_AL IS NULL";
        } else if (this.getDavPerAl() != null) {
            conditions += " AND DAV_PER_AL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDavPerAl());
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
        String sql = "UPDATE DATOS_AVISOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DAV_NUM_CONTRATO = ?";
        pkValues.add(this.getDavNumContrato());
        fields += " DAV_DIRIGIDO_A = ?, ";
        values.add(this.getDavDirigidoA());
        fields += " DAV_CALLE_NUM = ?, ";
        values.add(this.getDavCalleNum());
        fields += " DAV_COLONIA = ?, ";
        values.add(this.getDavColonia());
        fields += " DAV_REFERENCIA_CIE = ?, ";
        values.add(this.getDavReferenciaCie());
        fields += " DAV_CODIGO_POSTAL = ?, ";
        values.add(this.getDavCodigoPostal());
        fields += " DAV_CIUDAD_EDO = ?, ";
        values.add(this.getDavCiudadEdo());
        fields += " DAV_SECUEN_GCB = ?, ";
        values.add(this.getDavSecuenGcb());
        fields += " DAV_CARGO = ?, ";
        values.add(this.getDavCargo());
        fields += " DAV_FECHA_AVISO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDavFechaAviso());
        fields += " DAV_FECHA_PR = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDavFechaPr());
        fields += " DAV_FECHA_SR = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDavFechaSr());
        fields += " DAV_PER_DEL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDavPerDel());
        fields += " DAV_PER_AL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDavPerAl());
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
        String sql = "INSERT INTO DATOS_AVISOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DAV_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDavNumContrato());

        fields += ", DAV_DIRIGIDO_A";
        fieldValues += ", ?";
        values.add(this.getDavDirigidoA());

        fields += ", DAV_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getDavCalleNum());

        fields += ", DAV_COLONIA";
        fieldValues += ", ?";
        values.add(this.getDavColonia());

        fields += ", DAV_REFERENCIA_CIE";
        fieldValues += ", ?";
        values.add(this.getDavReferenciaCie());

        fields += ", DAV_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getDavCodigoPostal());

        fields += ", DAV_CIUDAD_EDO";
        fieldValues += ", ?";
        values.add(this.getDavCiudadEdo());

        fields += ", DAV_SECUEN_GCB";
        fieldValues += ", ?";
        values.add(this.getDavSecuenGcb());

        fields += ", DAV_CARGO";
        fieldValues += ", ?";
        values.add(this.getDavCargo());

        fields += ", DAV_FECHA_AVISO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDavFechaAviso());

        fields += ", DAV_FECHA_PR";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDavFechaPr());

        fields += ", DAV_FECHA_SR";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDavFechaSr());

        fields += ", DAV_PER_DEL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDavPerDel());

        fields += ", DAV_PER_AL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDavPerAl());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DATOS_AVISOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DAV_NUM_CONTRATO = ?";
        values.add(this.getDavNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        DatosAvisos instance = (DatosAvisos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDavNumContrato().equals(instance.getDavNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDavDirigidoA().equals(instance.getDavDirigidoA()))
            equalObjects = false;
        if (equalObjects && !this.getDavCalleNum().equals(instance.getDavCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getDavColonia().equals(instance.getDavColonia()))
            equalObjects = false;
        if (equalObjects && !this.getDavReferenciaCie().equals(instance.getDavReferenciaCie()))
            equalObjects = false;
        if (equalObjects && !this.getDavCodigoPostal().equals(instance.getDavCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getDavCiudadEdo().equals(instance.getDavCiudadEdo()))
            equalObjects = false;
        if (equalObjects && !this.getDavSecuenGcb().equals(instance.getDavSecuenGcb()))
            equalObjects = false;
        if (equalObjects && !this.getDavCargo().equals(instance.getDavCargo()))
            equalObjects = false;
        if (equalObjects && !this.getDavFechaAviso().equals(instance.getDavFechaAviso()))
            equalObjects = false;
        if (equalObjects && !this.getDavFechaPr().equals(instance.getDavFechaPr()))
            equalObjects = false;
        if (equalObjects && !this.getDavFechaSr().equals(instance.getDavFechaSr()))
            equalObjects = false;
        if (equalObjects && !this.getDavPerDel().equals(instance.getDavPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getDavPerAl().equals(instance.getDavPerAl()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        DatosAvisos result = new DatosAvisos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDavNumContrato((BigDecimal) objectData.getData("DAV_NUM_CONTRATO"));
        result.setDavDirigidoA((String) objectData.getData("DAV_DIRIGIDO_A"));
        result.setDavCalleNum((String) objectData.getData("DAV_CALLE_NUM"));
        result.setDavColonia((String) objectData.getData("DAV_COLONIA"));
        result.setDavReferenciaCie((String) objectData.getData("DAV_REFERENCIA_CIE"));
        result.setDavCodigoPostal((BigDecimal) objectData.getData("DAV_CODIGO_POSTAL"));
        result.setDavCiudadEdo((String) objectData.getData("DAV_CIUDAD_EDO"));
        result.setDavSecuenGcb((BigDecimal) objectData.getData("DAV_SECUEN_GCB"));
        result.setDavCargo((String) objectData.getData("DAV_CARGO"));
        result.setDavFechaAviso((String) objectData.getData("DAV_FECHA_AVISO"));
        result.setDavFechaPr((String) objectData.getData("DAV_FECHA_PR"));
        result.setDavFechaSr((String) objectData.getData("DAV_FECHA_SR"));
        result.setDavPerDel((String) objectData.getData("DAV_PER_DEL"));
        result.setDavPerAl((String) objectData.getData("DAV_PER_AL"));

        return result;

    }

}
