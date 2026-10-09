package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0020096",
            columns =
            { "PFD_NUM_CONTRATO", "PFD_NUMERO_PERS", "PFD_TIPO_PERS", "PFD_NOMBRE_FIRMA", "PFD_UBICACION_FIRMA", "PFD_SUB_CONTRATO", "PFD_CTO_INTER", "PFD_NUM_INTERMED",
              "PFD_CVE_CUENDEP"
    }, sequences = { "MANUAL" })
public class Perfirdi extends DomainObject {

    BigDecimal pfdNumContrato = null;
    BigDecimal pfdNumeroPers = null;
    String pfdTipoPers = null;
    String pfdNombreFirma = null;
    String pfdUbicacionFirma = null;
    BigDecimal pfdSubContrato = null;
    BigDecimal pfdCtoInter = null;
    BigDecimal pfdNumIntermed = null;
    BigDecimal pfdCveCuendep = null;
    String pfdDescripcion = null;
    String pfdUsuSolicit = null;
    String pfdFechaAlta = null;
    String pfdFechaUltMod = null;
    String pfdSt = null;
    BigDecimal pfdFolio = null;

    public Perfirdi() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfdNumContrato(BigDecimal pfdNumContrato) {
        this.pfdNumContrato = pfdNumContrato;
    }

    public BigDecimal getPfdNumContrato() {
        return this.pfdNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfdNumeroPers(BigDecimal pfdNumeroPers) {
        this.pfdNumeroPers = pfdNumeroPers;
    }

    public BigDecimal getPfdNumeroPers() {
        return this.pfdNumeroPers;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfdTipoPers(String pfdTipoPers) {
        this.pfdTipoPers = pfdTipoPers;
    }

    public String getPfdTipoPers() {
        return this.pfdTipoPers;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfdNombreFirma(String pfdNombreFirma) {
        this.pfdNombreFirma = pfdNombreFirma;
    }

    public String getPfdNombreFirma() {
        return this.pfdNombreFirma;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfdUbicacionFirma(String pfdUbicacionFirma) {
        this.pfdUbicacionFirma = pfdUbicacionFirma;
    }

    public String getPfdUbicacionFirma() {
        return this.pfdUbicacionFirma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfdSubContrato(BigDecimal pfdSubContrato) {
        this.pfdSubContrato = pfdSubContrato;
    }

    public BigDecimal getPfdSubContrato() {
        return this.pfdSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfdCtoInter(BigDecimal pfdCtoInter) {
        this.pfdCtoInter = pfdCtoInter;
    }

    public BigDecimal getPfdCtoInter() {
        return this.pfdCtoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfdNumIntermed(BigDecimal pfdNumIntermed) {
        this.pfdNumIntermed = pfdNumIntermed;
    }

    public BigDecimal getPfdNumIntermed() {
        return this.pfdNumIntermed;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfdCveCuendep(BigDecimal pfdCveCuendep) {
        this.pfdCveCuendep = pfdCveCuendep;
    }

    public BigDecimal getPfdCveCuendep() {
        return this.pfdCveCuendep;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfdDescripcion(String pfdDescripcion) {
        this.pfdDescripcion = pfdDescripcion;
    }

    public String getPfdDescripcion() {
        return this.pfdDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfdUsuSolicit(String pfdUsuSolicit) {
        this.pfdUsuSolicit = pfdUsuSolicit;
    }

    public String getPfdUsuSolicit() {
        return this.pfdUsuSolicit;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setPfdFechaAlta(String pfdFechaAlta) {
        this.pfdFechaAlta = pfdFechaAlta;
    }

    public String getPfdFechaAlta() {
        return this.pfdFechaAlta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setPfdFechaUltMod(String pfdFechaUltMod) {
        this.pfdFechaUltMod = pfdFechaUltMod;
    }

    public String getPfdFechaUltMod() {
        return this.pfdFechaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfdSt(String pfdSt) {
        this.pfdSt = pfdSt;
    }

    public String getPfdSt() {
        return this.pfdSt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfdFolio(BigDecimal pfdFolio) {
        this.pfdFolio = pfdFolio;
    }

    public BigDecimal getPfdFolio() {
        return this.pfdFolio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PERFIRDI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPfdNumContrato() != null && this.getPfdNumContrato().longValue() == -999) {
            conditions += " AND PFD_NUM_CONTRATO IS NULL";
        } else if (this.getPfdNumContrato() != null) {
            conditions += " AND PFD_NUM_CONTRATO = ?";
            values.add(this.getPfdNumContrato());
        }

        if (this.getPfdNumeroPers() != null && this.getPfdNumeroPers().longValue() == -999) {
            conditions += " AND PFD_NUMERO_PERS IS NULL";
        } else if (this.getPfdNumeroPers() != null) {
            conditions += " AND PFD_NUMERO_PERS = ?";
            values.add(this.getPfdNumeroPers());
        }

        if (this.getPfdTipoPers() != null && "null".equals(this.getPfdTipoPers())) {
            conditions += " AND PFD_TIPO_PERS IS NULL";
        } else if (this.getPfdTipoPers() != null) {
            conditions += " AND PFD_TIPO_PERS = ?";
            values.add(this.getPfdTipoPers());
        }

        if (this.getPfdNombreFirma() != null && "null".equals(this.getPfdNombreFirma())) {
            conditions += " AND PFD_NOMBRE_FIRMA IS NULL";
        } else if (this.getPfdNombreFirma() != null) {
            conditions += " AND PFD_NOMBRE_FIRMA = ?";
            values.add(this.getPfdNombreFirma());
        }

        if (this.getPfdUbicacionFirma() != null && "null".equals(this.getPfdUbicacionFirma())) {
            conditions += " AND PFD_UBICACION_FIRMA IS NULL";
        } else if (this.getPfdUbicacionFirma() != null) {
            conditions += " AND PFD_UBICACION_FIRMA = ?";
            values.add(this.getPfdUbicacionFirma());
        }

        if (this.getPfdSubContrato() != null && this.getPfdSubContrato().longValue() == -999) {
            conditions += " AND PFD_SUB_CONTRATO IS NULL";
        } else if (this.getPfdSubContrato() != null) {
            conditions += " AND PFD_SUB_CONTRATO = ?";
            values.add(this.getPfdSubContrato());
        }

        if (this.getPfdCtoInter() != null && this.getPfdCtoInter().longValue() == -999) {
            conditions += " AND PFD_CTO_INTER IS NULL";
        } else if (this.getPfdCtoInter() != null) {
            conditions += " AND PFD_CTO_INTER = ?";
            values.add(this.getPfdCtoInter());
        }

        if (this.getPfdNumIntermed() != null && this.getPfdNumIntermed().longValue() == -999) {
            conditions += " AND PFD_NUM_INTERMED IS NULL";
        } else if (this.getPfdNumIntermed() != null) {
            conditions += " AND PFD_NUM_INTERMED = ?";
            values.add(this.getPfdNumIntermed());
        }

        if (this.getPfdCveCuendep() != null && this.getPfdCveCuendep().longValue() == -999) {
            conditions += " AND PFD_CVE_CUENDEP IS NULL";
        } else if (this.getPfdCveCuendep() != null) {
            conditions += " AND PFD_CVE_CUENDEP = ?";
            values.add(this.getPfdCveCuendep());
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
        String sql = "SELECT * FROM PERFIRDI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPfdNumContrato() != null && this.getPfdNumContrato().longValue() == -999) {
            conditions += " AND PFD_NUM_CONTRATO IS NULL";
        } else if (this.getPfdNumContrato() != null) {
            conditions += " AND PFD_NUM_CONTRATO = ?";
            values.add(this.getPfdNumContrato());
        }

        if (this.getPfdNumeroPers() != null && this.getPfdNumeroPers().longValue() == -999) {
            conditions += " AND PFD_NUMERO_PERS IS NULL";
        } else if (this.getPfdNumeroPers() != null) {
            conditions += " AND PFD_NUMERO_PERS = ?";
            values.add(this.getPfdNumeroPers());
        }

        if (this.getPfdTipoPers() != null && "null".equals(this.getPfdTipoPers())) {
            conditions += " AND PFD_TIPO_PERS IS NULL";
        } else if (this.getPfdTipoPers() != null) {
            conditions += " AND PFD_TIPO_PERS = ?";
            values.add(this.getPfdTipoPers());
        }

        if (this.getPfdNombreFirma() != null && "null".equals(this.getPfdNombreFirma())) {
            conditions += " AND PFD_NOMBRE_FIRMA IS NULL";
        } else if (this.getPfdNombreFirma() != null) {
            conditions += " AND PFD_NOMBRE_FIRMA = ?";
            values.add(this.getPfdNombreFirma());
        }

        if (this.getPfdUbicacionFirma() != null && "null".equals(this.getPfdUbicacionFirma())) {
            conditions += " AND PFD_UBICACION_FIRMA IS NULL";
        } else if (this.getPfdUbicacionFirma() != null) {
            conditions += " AND PFD_UBICACION_FIRMA = ?";
            values.add(this.getPfdUbicacionFirma());
        }

        if (this.getPfdSubContrato() != null && this.getPfdSubContrato().longValue() == -999) {
            conditions += " AND PFD_SUB_CONTRATO IS NULL";
        } else if (this.getPfdSubContrato() != null) {
            conditions += " AND PFD_SUB_CONTRATO = ?";
            values.add(this.getPfdSubContrato());
        }

        if (this.getPfdCtoInter() != null && this.getPfdCtoInter().longValue() == -999) {
            conditions += " AND PFD_CTO_INTER IS NULL";
        } else if (this.getPfdCtoInter() != null) {
            conditions += " AND PFD_CTO_INTER = ?";
            values.add(this.getPfdCtoInter());
        }

        if (this.getPfdNumIntermed() != null && this.getPfdNumIntermed().longValue() == -999) {
            conditions += " AND PFD_NUM_INTERMED IS NULL";
        } else if (this.getPfdNumIntermed() != null) {
            conditions += " AND PFD_NUM_INTERMED = ?";
            values.add(this.getPfdNumIntermed());
        }

        if (this.getPfdCveCuendep() != null && this.getPfdCveCuendep().longValue() == -999) {
            conditions += " AND PFD_CVE_CUENDEP IS NULL";
        } else if (this.getPfdCveCuendep() != null) {
            conditions += " AND PFD_CVE_CUENDEP = ?";
            values.add(this.getPfdCveCuendep());
        }

        if (this.getPfdDescripcion() != null && "null".equals(this.getPfdDescripcion())) {
            conditions += " AND PFD_DESCRIPCION IS NULL";
        } else if (this.getPfdDescripcion() != null) {
            conditions += " AND PFD_DESCRIPCION = ?";
            values.add(this.getPfdDescripcion());
        }

        if (this.getPfdUsuSolicit() != null && "null".equals(this.getPfdUsuSolicit())) {
            conditions += " AND PFD_USU_SOLICIT IS NULL";
        } else if (this.getPfdUsuSolicit() != null) {
            conditions += " AND PFD_USU_SOLICIT = ?";
            values.add(this.getPfdUsuSolicit());
        }

        if (this.getPfdFechaAlta() != null && "null".equals(this.getPfdFechaAlta())) {
            conditions += " AND PFD_FECHA_ALTA IS NULL";
        } else if (this.getPfdFechaAlta() != null) {
            conditions += " AND PFD_FECHA_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getPfdFechaAlta());
        }

        if (this.getPfdFechaUltMod() != null && "null".equals(this.getPfdFechaUltMod())) {
            conditions += " AND PFD_FECHA_ULT_MOD IS NULL";
        } else if (this.getPfdFechaUltMod() != null) {
            conditions += " AND PFD_FECHA_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getPfdFechaUltMod());
        }

        if (this.getPfdSt() != null && "null".equals(this.getPfdSt())) {
            conditions += " AND PFD_ST IS NULL";
        } else if (this.getPfdSt() != null) {
            conditions += " AND PFD_ST = ?";
            values.add(this.getPfdSt());
        }

        if (this.getPfdFolio() != null && this.getPfdFolio().longValue() == -999) {
            conditions += " AND PFD_FOLIO IS NULL";
        } else if (this.getPfdFolio() != null) {
            conditions += " AND PFD_FOLIO = ?";
            values.add(this.getPfdFolio());
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
        String sql = "UPDATE PERFIRDI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PFD_NUM_CONTRATO = ?";
        pkValues.add(this.getPfdNumContrato());
        conditions += " AND PFD_NUMERO_PERS = ?";
        pkValues.add(this.getPfdNumeroPers());
        conditions += " AND PFD_TIPO_PERS = ?";
        pkValues.add(this.getPfdTipoPers());
        conditions += " AND PFD_NOMBRE_FIRMA = ?";
        pkValues.add(this.getPfdNombreFirma());
        conditions += " AND PFD_UBICACION_FIRMA = ?";
        pkValues.add(this.getPfdUbicacionFirma());
        conditions += " AND PFD_SUB_CONTRATO = ?";
        pkValues.add(this.getPfdSubContrato());
        conditions += " AND PFD_CTO_INTER = ?";
        pkValues.add(this.getPfdCtoInter());
        conditions += " AND PFD_NUM_INTERMED = ?";
        pkValues.add(this.getPfdNumIntermed());
        conditions += " AND PFD_CVE_CUENDEP = ?";
        pkValues.add(this.getPfdCveCuendep());
        fields += " PFD_DESCRIPCION = ?, ";
        values.add(this.getPfdDescripcion());
        fields += " PFD_USU_SOLICIT = ?, ";
        values.add(this.getPfdUsuSolicit());
        fields += " PFD_FECHA_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getPfdFechaAlta());
        fields += " PFD_FECHA_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getPfdFechaUltMod());
        fields += " PFD_ST = ?, ";
        values.add(this.getPfdSt());
        fields += " PFD_FOLIO = ?, ";
        values.add(this.getPfdFolio());
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
        String sql = "INSERT INTO PERFIRDI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PFD_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPfdNumContrato());

        fields += ", PFD_NUMERO_PERS";
        fieldValues += ", ?";
        values.add(this.getPfdNumeroPers());

        fields += ", PFD_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getPfdTipoPers());

        fields += ", PFD_NOMBRE_FIRMA";
        fieldValues += ", ?";
        values.add(this.getPfdNombreFirma());

        fields += ", PFD_UBICACION_FIRMA";
        fieldValues += ", ?";
        values.add(this.getPfdUbicacionFirma());

        fields += ", PFD_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPfdSubContrato());

        fields += ", PFD_CTO_INTER";
        fieldValues += ", ?";
        values.add(this.getPfdCtoInter());

        fields += ", PFD_NUM_INTERMED";
        fieldValues += ", ?";
        values.add(this.getPfdNumIntermed());

        fields += ", PFD_CVE_CUENDEP";
        fieldValues += ", ?";
        values.add(this.getPfdCveCuendep());

        fields += ", PFD_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getPfdDescripcion());

        fields += ", PFD_USU_SOLICIT";
        fieldValues += ", ?";
        values.add(this.getPfdUsuSolicit());

        fields += ", PFD_FECHA_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getPfdFechaAlta());

        fields += ", PFD_FECHA_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getPfdFechaUltMod());

        fields += ", PFD_ST";
        fieldValues += ", ?";
        values.add(this.getPfdSt());

        fields += ", PFD_FOLIO";
        fieldValues += ", ?";
        values.add(this.getPfdFolio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PERFIRDI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PFD_NUM_CONTRATO = ?";
        values.add(this.getPfdNumContrato());
        conditions += " AND PFD_NUMERO_PERS = ?";
        values.add(this.getPfdNumeroPers());
        conditions += " AND PFD_TIPO_PERS = ?";
        values.add(this.getPfdTipoPers());
        conditions += " AND PFD_NOMBRE_FIRMA = ?";
        values.add(this.getPfdNombreFirma());
        conditions += " AND PFD_UBICACION_FIRMA = ?";
        values.add(this.getPfdUbicacionFirma());
        conditions += " AND PFD_SUB_CONTRATO = ?";
        values.add(this.getPfdSubContrato());
        conditions += " AND PFD_CTO_INTER = ?";
        values.add(this.getPfdCtoInter());
        conditions += " AND PFD_NUM_INTERMED = ?";
        values.add(this.getPfdNumIntermed());
        conditions += " AND PFD_CVE_CUENDEP = ?";
        values.add(this.getPfdCveCuendep());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Perfirdi instance = (Perfirdi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPfdNumContrato().equals(instance.getPfdNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPfdNumeroPers().equals(instance.getPfdNumeroPers()))
            equalObjects = false;
        if (equalObjects && !this.getPfdTipoPers().equals(instance.getPfdTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getPfdNombreFirma().equals(instance.getPfdNombreFirma()))
            equalObjects = false;
        if (equalObjects && !this.getPfdUbicacionFirma().equals(instance.getPfdUbicacionFirma()))
            equalObjects = false;
        if (equalObjects && !this.getPfdSubContrato().equals(instance.getPfdSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPfdCtoInter().equals(instance.getPfdCtoInter()))
            equalObjects = false;
        if (equalObjects && !this.getPfdNumIntermed().equals(instance.getPfdNumIntermed()))
            equalObjects = false;
        if (equalObjects && !this.getPfdCveCuendep().equals(instance.getPfdCveCuendep()))
            equalObjects = false;
        if (equalObjects && !this.getPfdDescripcion().equals(instance.getPfdDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getPfdUsuSolicit().equals(instance.getPfdUsuSolicit()))
            equalObjects = false;
        if (equalObjects && !this.getPfdFechaAlta().equals(instance.getPfdFechaAlta()))
            equalObjects = false;
        if (equalObjects && !this.getPfdFechaUltMod().equals(instance.getPfdFechaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPfdSt().equals(instance.getPfdSt()))
            equalObjects = false;
        if (equalObjects && !this.getPfdFolio().equals(instance.getPfdFolio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Perfirdi result = new Perfirdi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPfdNumContrato((BigDecimal) objectData.getData("PFD_NUM_CONTRATO"));
        result.setPfdNumeroPers((BigDecimal) objectData.getData("PFD_NUMERO_PERS"));
        result.setPfdTipoPers((String) objectData.getData("PFD_TIPO_PERS"));
        result.setPfdNombreFirma((String) objectData.getData("PFD_NOMBRE_FIRMA"));
        result.setPfdUbicacionFirma((String) objectData.getData("PFD_UBICACION_FIRMA"));
        result.setPfdSubContrato((BigDecimal) objectData.getData("PFD_SUB_CONTRATO"));
        result.setPfdCtoInter((BigDecimal) objectData.getData("PFD_CTO_INTER"));
        result.setPfdNumIntermed((BigDecimal) objectData.getData("PFD_NUM_INTERMED"));
        result.setPfdCveCuendep((BigDecimal) objectData.getData("PFD_CVE_CUENDEP"));
        result.setPfdDescripcion((String) objectData.getData("PFD_DESCRIPCION"));
        result.setPfdUsuSolicit((String) objectData.getData("PFD_USU_SOLICIT"));
        result.setPfdFechaAlta((String) objectData.getData("PFD_FECHA_ALTA"));
        result.setPfdFechaUltMod((String) objectData.getData("PFD_FECHA_ULT_MOD"));
        result.setPfdSt((String) objectData.getData("PFD_ST"));
        result.setPfdFolio((BigDecimal) objectData.getData("PFD_FOLIO"));

        return result;

    }

}
