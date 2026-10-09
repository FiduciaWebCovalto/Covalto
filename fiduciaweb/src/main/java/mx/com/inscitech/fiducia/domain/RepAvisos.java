package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REP_AVISOS_PK", columns = { "RAV_SECUENCIAL", "RAV_NUM_CONTRATO", "RAV_NOM_CONTRATO" }, sequences = { "MANUAL" })
public class RepAvisos extends DomainObject {

    BigDecimal ravSecuencial = null;
    BigDecimal ravNumContrato = null;
    String ravNomContrato = null;
    String ravDirigidoA = null;
    String ravFechaAviso = null;
    String ravFechaPri = null;
    String ravFechaSeg = null;
    String ravPeriodicidad = null;
    BigDecimal ravImportePer = null;
    BigDecimal ravImporte30 = null;
    BigDecimal ravImporte60 = null;
    BigDecimal ravImporte90 = null;
    BigDecimal ravImporteTot = null;
    String ravCargo = null;
    String ravCalleNum = null;
    String ravColonia = null;
    String ravCp = null;
    String ravCiudadEdo = null;
    String ravPeriodo = null;
    String ravPeriodoAdeudo = null;
    String ravReferenciaCie = null;

    public RepAvisos() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRavSecuencial(BigDecimal ravSecuencial) {
        this.ravSecuencial = ravSecuencial;
    }

    public BigDecimal getRavSecuencial() {
        return this.ravSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRavNumContrato(BigDecimal ravNumContrato) {
        this.ravNumContrato = ravNumContrato;
    }

    public BigDecimal getRavNumContrato() {
        return this.ravNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavNomContrato(String ravNomContrato) {
        this.ravNomContrato = ravNomContrato;
    }

    public String getRavNomContrato() {
        return this.ravNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavDirigidoA(String ravDirigidoA) {
        this.ravDirigidoA = ravDirigidoA;
    }

    public String getRavDirigidoA() {
        return this.ravDirigidoA;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavFechaAviso(String ravFechaAviso) {
        this.ravFechaAviso = ravFechaAviso;
    }

    public String getRavFechaAviso() {
        return this.ravFechaAviso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavFechaPri(String ravFechaPri) {
        this.ravFechaPri = ravFechaPri;
    }

    public String getRavFechaPri() {
        return this.ravFechaPri;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavFechaSeg(String ravFechaSeg) {
        this.ravFechaSeg = ravFechaSeg;
    }

    public String getRavFechaSeg() {
        return this.ravFechaSeg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavPeriodicidad(String ravPeriodicidad) {
        this.ravPeriodicidad = ravPeriodicidad;
    }

    public String getRavPeriodicidad() {
        return this.ravPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRavImportePer(BigDecimal ravImportePer) {
        this.ravImportePer = ravImportePer;
    }

    public BigDecimal getRavImportePer() {
        return this.ravImportePer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRavImporte30(BigDecimal ravImporte30) {
        this.ravImporte30 = ravImporte30;
    }

    public BigDecimal getRavImporte30() {
        return this.ravImporte30;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRavImporte60(BigDecimal ravImporte60) {
        this.ravImporte60 = ravImporte60;
    }

    public BigDecimal getRavImporte60() {
        return this.ravImporte60;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRavImporte90(BigDecimal ravImporte90) {
        this.ravImporte90 = ravImporte90;
    }

    public BigDecimal getRavImporte90() {
        return this.ravImporte90;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRavImporteTot(BigDecimal ravImporteTot) {
        this.ravImporteTot = ravImporteTot;
    }

    public BigDecimal getRavImporteTot() {
        return this.ravImporteTot;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavCargo(String ravCargo) {
        this.ravCargo = ravCargo;
    }

    public String getRavCargo() {
        return this.ravCargo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavCalleNum(String ravCalleNum) {
        this.ravCalleNum = ravCalleNum;
    }

    public String getRavCalleNum() {
        return this.ravCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavColonia(String ravColonia) {
        this.ravColonia = ravColonia;
    }

    public String getRavColonia() {
        return this.ravColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavCp(String ravCp) {
        this.ravCp = ravCp;
    }

    public String getRavCp() {
        return this.ravCp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavCiudadEdo(String ravCiudadEdo) {
        this.ravCiudadEdo = ravCiudadEdo;
    }

    public String getRavCiudadEdo() {
        return this.ravCiudadEdo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavPeriodo(String ravPeriodo) {
        this.ravPeriodo = ravPeriodo;
    }

    public String getRavPeriodo() {
        return this.ravPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavPeriodoAdeudo(String ravPeriodoAdeudo) {
        this.ravPeriodoAdeudo = ravPeriodoAdeudo;
    }

    public String getRavPeriodoAdeudo() {
        return this.ravPeriodoAdeudo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRavReferenciaCie(String ravReferenciaCie) {
        this.ravReferenciaCie = ravReferenciaCie;
    }

    public String getRavReferenciaCie() {
        return this.ravReferenciaCie;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REP_AVISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRavSecuencial() != null && this.getRavSecuencial().longValue() == -999) {
            conditions += " AND RAV_SECUENCIAL IS NULL";
        } else if (this.getRavSecuencial() != null) {
            conditions += " AND RAV_SECUENCIAL = ?";
            values.add(this.getRavSecuencial());
        }

        if (this.getRavNumContrato() != null && this.getRavNumContrato().longValue() == -999) {
            conditions += " AND RAV_NUM_CONTRATO IS NULL";
        } else if (this.getRavNumContrato() != null) {
            conditions += " AND RAV_NUM_CONTRATO = ?";
            values.add(this.getRavNumContrato());
        }

        if (this.getRavNomContrato() != null && "null".equals(this.getRavNomContrato())) {
            conditions += " AND RAV_NOM_CONTRATO IS NULL";
        } else if (this.getRavNomContrato() != null) {
            conditions += " AND RAV_NOM_CONTRATO = ?";
            values.add(this.getRavNomContrato());
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
        String sql = "SELECT * FROM REP_AVISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRavSecuencial() != null && this.getRavSecuencial().longValue() == -999) {
            conditions += " AND RAV_SECUENCIAL IS NULL";
        } else if (this.getRavSecuencial() != null) {
            conditions += " AND RAV_SECUENCIAL = ?";
            values.add(this.getRavSecuencial());
        }

        if (this.getRavNumContrato() != null && this.getRavNumContrato().longValue() == -999) {
            conditions += " AND RAV_NUM_CONTRATO IS NULL";
        } else if (this.getRavNumContrato() != null) {
            conditions += " AND RAV_NUM_CONTRATO = ?";
            values.add(this.getRavNumContrato());
        }

        if (this.getRavNomContrato() != null && "null".equals(this.getRavNomContrato())) {
            conditions += " AND RAV_NOM_CONTRATO IS NULL";
        } else if (this.getRavNomContrato() != null) {
            conditions += " AND RAV_NOM_CONTRATO = ?";
            values.add(this.getRavNomContrato());
        }

        if (this.getRavDirigidoA() != null && "null".equals(this.getRavDirigidoA())) {
            conditions += " AND RAV_DIRIGIDO_A IS NULL";
        } else if (this.getRavDirigidoA() != null) {
            conditions += " AND RAV_DIRIGIDO_A = ?";
            values.add(this.getRavDirigidoA());
        }

        if (this.getRavFechaAviso() != null && "null".equals(this.getRavFechaAviso())) {
            conditions += " AND RAV_FECHA_AVISO IS NULL";
        } else if (this.getRavFechaAviso() != null) {
            conditions += " AND RAV_FECHA_AVISO = ?";
            values.add(this.getRavFechaAviso());
        }

        if (this.getRavFechaPri() != null && "null".equals(this.getRavFechaPri())) {
            conditions += " AND RAV_FECHA_PRI IS NULL";
        } else if (this.getRavFechaPri() != null) {
            conditions += " AND RAV_FECHA_PRI = ?";
            values.add(this.getRavFechaPri());
        }

        if (this.getRavFechaSeg() != null && "null".equals(this.getRavFechaSeg())) {
            conditions += " AND RAV_FECHA_SEG IS NULL";
        } else if (this.getRavFechaSeg() != null) {
            conditions += " AND RAV_FECHA_SEG = ?";
            values.add(this.getRavFechaSeg());
        }

        if (this.getRavPeriodicidad() != null && "null".equals(this.getRavPeriodicidad())) {
            conditions += " AND RAV_PERIODICIDAD IS NULL";
        } else if (this.getRavPeriodicidad() != null) {
            conditions += " AND RAV_PERIODICIDAD = ?";
            values.add(this.getRavPeriodicidad());
        }

        if (this.getRavImportePer() != null && this.getRavImportePer().longValue() == -999) {
            conditions += " AND RAV_IMPORTE_PER IS NULL";
        } else if (this.getRavImportePer() != null) {
            conditions += " AND RAV_IMPORTE_PER = ?";
            values.add(this.getRavImportePer());
        }

        if (this.getRavImporte30() != null && this.getRavImporte30().longValue() == -999) {
            conditions += " AND RAV_IMPORTE_30 IS NULL";
        } else if (this.getRavImporte30() != null) {
            conditions += " AND RAV_IMPORTE_30 = ?";
            values.add(this.getRavImporte30());
        }

        if (this.getRavImporte60() != null && this.getRavImporte60().longValue() == -999) {
            conditions += " AND RAV_IMPORTE_60 IS NULL";
        } else if (this.getRavImporte60() != null) {
            conditions += " AND RAV_IMPORTE_60 = ?";
            values.add(this.getRavImporte60());
        }

        if (this.getRavImporte90() != null && this.getRavImporte90().longValue() == -999) {
            conditions += " AND RAV_IMPORTE_90 IS NULL";
        } else if (this.getRavImporte90() != null) {
            conditions += " AND RAV_IMPORTE_90 = ?";
            values.add(this.getRavImporte90());
        }

        if (this.getRavImporteTot() != null && this.getRavImporteTot().longValue() == -999) {
            conditions += " AND RAV_IMPORTE_TOT IS NULL";
        } else if (this.getRavImporteTot() != null) {
            conditions += " AND RAV_IMPORTE_TOT = ?";
            values.add(this.getRavImporteTot());
        }

        if (this.getRavCargo() != null && "null".equals(this.getRavCargo())) {
            conditions += " AND RAV_CARGO IS NULL";
        } else if (this.getRavCargo() != null) {
            conditions += " AND RAV_CARGO = ?";
            values.add(this.getRavCargo());
        }

        if (this.getRavCalleNum() != null && "null".equals(this.getRavCalleNum())) {
            conditions += " AND RAV_CALLE_NUM IS NULL";
        } else if (this.getRavCalleNum() != null) {
            conditions += " AND RAV_CALLE_NUM = ?";
            values.add(this.getRavCalleNum());
        }

        if (this.getRavColonia() != null && "null".equals(this.getRavColonia())) {
            conditions += " AND RAV_COLONIA IS NULL";
        } else if (this.getRavColonia() != null) {
            conditions += " AND RAV_COLONIA = ?";
            values.add(this.getRavColonia());
        }

        if (this.getRavCp() != null && "null".equals(this.getRavCp())) {
            conditions += " AND RAV_CP IS NULL";
        } else if (this.getRavCp() != null) {
            conditions += " AND RAV_CP = ?";
            values.add(this.getRavCp());
        }

        if (this.getRavCiudadEdo() != null && "null".equals(this.getRavCiudadEdo())) {
            conditions += " AND RAV_CIUDAD_EDO IS NULL";
        } else if (this.getRavCiudadEdo() != null) {
            conditions += " AND RAV_CIUDAD_EDO = ?";
            values.add(this.getRavCiudadEdo());
        }

        if (this.getRavPeriodo() != null && "null".equals(this.getRavPeriodo())) {
            conditions += " AND RAV_PERIODO IS NULL";
        } else if (this.getRavPeriodo() != null) {
            conditions += " AND RAV_PERIODO = ?";
            values.add(this.getRavPeriodo());
        }

        if (this.getRavPeriodoAdeudo() != null && "null".equals(this.getRavPeriodoAdeudo())) {
            conditions += " AND RAV_PERIODO_ADEUDO IS NULL";
        } else if (this.getRavPeriodoAdeudo() != null) {
            conditions += " AND RAV_PERIODO_ADEUDO = ?";
            values.add(this.getRavPeriodoAdeudo());
        }

        if (this.getRavReferenciaCie() != null && "null".equals(this.getRavReferenciaCie())) {
            conditions += " AND RAV_REFERENCIA_CIE IS NULL";
        } else if (this.getRavReferenciaCie() != null) {
            conditions += " AND RAV_REFERENCIA_CIE = ?";
            values.add(this.getRavReferenciaCie());
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
        String sql = "UPDATE REP_AVISOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RAV_SECUENCIAL = ?";
        pkValues.add(this.getRavSecuencial());
        conditions += " AND RAV_NUM_CONTRATO = ?";
        pkValues.add(this.getRavNumContrato());
        conditions += " AND RAV_NOM_CONTRATO = ?";
        pkValues.add(this.getRavNomContrato());
        fields += " RAV_DIRIGIDO_A = ?, ";
        values.add(this.getRavDirigidoA());
        fields += " RAV_FECHA_AVISO = ?, ";
        values.add(this.getRavFechaAviso());
        fields += " RAV_FECHA_PRI = ?, ";
        values.add(this.getRavFechaPri());
        fields += " RAV_FECHA_SEG = ?, ";
        values.add(this.getRavFechaSeg());
        fields += " RAV_PERIODICIDAD = ?, ";
        values.add(this.getRavPeriodicidad());
        fields += " RAV_IMPORTE_PER = ?, ";
        values.add(this.getRavImportePer());
        fields += " RAV_IMPORTE_30 = ?, ";
        values.add(this.getRavImporte30());
        fields += " RAV_IMPORTE_60 = ?, ";
        values.add(this.getRavImporte60());
        fields += " RAV_IMPORTE_90 = ?, ";
        values.add(this.getRavImporte90());
        fields += " RAV_IMPORTE_TOT = ?, ";
        values.add(this.getRavImporteTot());
        fields += " RAV_CARGO = ?, ";
        values.add(this.getRavCargo());
        fields += " RAV_CALLE_NUM = ?, ";
        values.add(this.getRavCalleNum());
        fields += " RAV_COLONIA = ?, ";
        values.add(this.getRavColonia());
        fields += " RAV_CP = ?, ";
        values.add(this.getRavCp());
        fields += " RAV_CIUDAD_EDO = ?, ";
        values.add(this.getRavCiudadEdo());
        fields += " RAV_PERIODO = ?, ";
        values.add(this.getRavPeriodo());
        fields += " RAV_PERIODO_ADEUDO = ?, ";
        values.add(this.getRavPeriodoAdeudo());
        fields += " RAV_REFERENCIA_CIE = ?, ";
        values.add(this.getRavReferenciaCie());
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
        String sql = "INSERT INTO REP_AVISOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RAV_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getRavSecuencial());

        fields += ", RAV_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRavNumContrato());

        fields += ", RAV_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRavNomContrato());

        fields += ", RAV_DIRIGIDO_A";
        fieldValues += ", ?";
        values.add(this.getRavDirigidoA());

        fields += ", RAV_FECHA_AVISO";
        fieldValues += ", ?";
        values.add(this.getRavFechaAviso());

        fields += ", RAV_FECHA_PRI";
        fieldValues += ", ?";
        values.add(this.getRavFechaPri());

        fields += ", RAV_FECHA_SEG";
        fieldValues += ", ?";
        values.add(this.getRavFechaSeg());

        fields += ", RAV_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getRavPeriodicidad());

        fields += ", RAV_IMPORTE_PER";
        fieldValues += ", ?";
        values.add(this.getRavImportePer());

        fields += ", RAV_IMPORTE_30";
        fieldValues += ", ?";
        values.add(this.getRavImporte30());

        fields += ", RAV_IMPORTE_60";
        fieldValues += ", ?";
        values.add(this.getRavImporte60());

        fields += ", RAV_IMPORTE_90";
        fieldValues += ", ?";
        values.add(this.getRavImporte90());

        fields += ", RAV_IMPORTE_TOT";
        fieldValues += ", ?";
        values.add(this.getRavImporteTot());

        fields += ", RAV_CARGO";
        fieldValues += ", ?";
        values.add(this.getRavCargo());

        fields += ", RAV_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getRavCalleNum());

        fields += ", RAV_COLONIA";
        fieldValues += ", ?";
        values.add(this.getRavColonia());

        fields += ", RAV_CP";
        fieldValues += ", ?";
        values.add(this.getRavCp());

        fields += ", RAV_CIUDAD_EDO";
        fieldValues += ", ?";
        values.add(this.getRavCiudadEdo());

        fields += ", RAV_PERIODO";
        fieldValues += ", ?";
        values.add(this.getRavPeriodo());

        fields += ", RAV_PERIODO_ADEUDO";
        fieldValues += ", ?";
        values.add(this.getRavPeriodoAdeudo());

        fields += ", RAV_REFERENCIA_CIE";
        fieldValues += ", ?";
        values.add(this.getRavReferenciaCie());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REP_AVISOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RAV_SECUENCIAL = ?";
        values.add(this.getRavSecuencial());
        conditions += " AND RAV_NUM_CONTRATO = ?";
        values.add(this.getRavNumContrato());
        conditions += " AND RAV_NOM_CONTRATO = ?";
        values.add(this.getRavNomContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        RepAvisos instance = (RepAvisos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRavSecuencial().equals(instance.getRavSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getRavNumContrato().equals(instance.getRavNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRavNomContrato().equals(instance.getRavNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRavDirigidoA().equals(instance.getRavDirigidoA()))
            equalObjects = false;
        if (equalObjects && !this.getRavFechaAviso().equals(instance.getRavFechaAviso()))
            equalObjects = false;
        if (equalObjects && !this.getRavFechaPri().equals(instance.getRavFechaPri()))
            equalObjects = false;
        if (equalObjects && !this.getRavFechaSeg().equals(instance.getRavFechaSeg()))
            equalObjects = false;
        if (equalObjects && !this.getRavPeriodicidad().equals(instance.getRavPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getRavImportePer().equals(instance.getRavImportePer()))
            equalObjects = false;
        if (equalObjects && !this.getRavImporte30().equals(instance.getRavImporte30()))
            equalObjects = false;
        if (equalObjects && !this.getRavImporte60().equals(instance.getRavImporte60()))
            equalObjects = false;
        if (equalObjects && !this.getRavImporte90().equals(instance.getRavImporte90()))
            equalObjects = false;
        if (equalObjects && !this.getRavImporteTot().equals(instance.getRavImporteTot()))
            equalObjects = false;
        if (equalObjects && !this.getRavCargo().equals(instance.getRavCargo()))
            equalObjects = false;
        if (equalObjects && !this.getRavCalleNum().equals(instance.getRavCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getRavColonia().equals(instance.getRavColonia()))
            equalObjects = false;
        if (equalObjects && !this.getRavCp().equals(instance.getRavCp()))
            equalObjects = false;
        if (equalObjects && !this.getRavCiudadEdo().equals(instance.getRavCiudadEdo()))
            equalObjects = false;
        if (equalObjects && !this.getRavPeriodo().equals(instance.getRavPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getRavPeriodoAdeudo().equals(instance.getRavPeriodoAdeudo()))
            equalObjects = false;
        if (equalObjects && !this.getRavReferenciaCie().equals(instance.getRavReferenciaCie()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        RepAvisos result = new RepAvisos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRavSecuencial((BigDecimal) objectData.getData("RAV_SECUENCIAL"));
        result.setRavNumContrato((BigDecimal) objectData.getData("RAV_NUM_CONTRATO"));
        result.setRavNomContrato((String) objectData.getData("RAV_NOM_CONTRATO"));
        result.setRavDirigidoA((String) objectData.getData("RAV_DIRIGIDO_A"));
        result.setRavFechaAviso((String) objectData.getData("RAV_FECHA_AVISO"));
        result.setRavFechaPri((String) objectData.getData("RAV_FECHA_PRI"));
        result.setRavFechaSeg((String) objectData.getData("RAV_FECHA_SEG"));
        result.setRavPeriodicidad((String) objectData.getData("RAV_PERIODICIDAD"));
        result.setRavImportePer((BigDecimal) objectData.getData("RAV_IMPORTE_PER"));
        result.setRavImporte30((BigDecimal) objectData.getData("RAV_IMPORTE_30"));
        result.setRavImporte60((BigDecimal) objectData.getData("RAV_IMPORTE_60"));
        result.setRavImporte90((BigDecimal) objectData.getData("RAV_IMPORTE_90"));
        result.setRavImporteTot((BigDecimal) objectData.getData("RAV_IMPORTE_TOT"));
        result.setRavCargo((String) objectData.getData("RAV_CARGO"));
        result.setRavCalleNum((String) objectData.getData("RAV_CALLE_NUM"));
        result.setRavColonia((String) objectData.getData("RAV_COLONIA"));
        result.setRavCp((String) objectData.getData("RAV_CP"));
        result.setRavCiudadEdo((String) objectData.getData("RAV_CIUDAD_EDO"));
        result.setRavPeriodo((String) objectData.getData("RAV_PERIODO"));
        result.setRavPeriodoAdeudo((String) objectData.getData("RAV_PERIODO_ADEUDO"));
        result.setRavReferenciaCie((String) objectData.getData("RAV_REFERENCIA_CIE"));

        return result;

    }

}
