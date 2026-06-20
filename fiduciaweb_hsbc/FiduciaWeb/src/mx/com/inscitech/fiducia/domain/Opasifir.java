package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OPASIFIR_PK",
            columns =
            { "OAF_NUM_CONTRATO", "OAF_NOMBRE_FIRMA", "OAF_UBICACION_FIRMA", "OAF_NUMERO_PERS", "OAF_TIPO_PERS", "OAF_NUM_OPERACION", "OAF_SUB_CONTRATO", "OAF_CTO_INTER",
              "OAF_NUM_INTERMED", "OAF_NUM_CLAVE"
    }, sequences = { "MANUAL" })
public class Opasifir extends DomainObject {

    BigDecimal oafNumContrato = null;
    String oafNombreFirma = null;
    String oafUbicacionFirma = null;
    BigDecimal oafNumeroPers = null;
    String oafTipoPers = null;
    BigDecimal oafNumOperacion = null;
    BigDecimal oafSubContrato = null;
    BigDecimal oafCtoInter = null;
    BigDecimal oafNumIntermed = null;
    BigDecimal oafImpMaxRetiro = null;
    String oafPeriodicidad = null;
    BigDecimal oafDiaPago1 = null;
    BigDecimal oafDiaPago2 = null;
    String oafVigenciaDe = null;
    String oafVigenciaA = null;
    BigDecimal oafAutomatico = null;
    BigDecimal oafCveCuendep = null;
    BigDecimal oafLiquidacion = null;
    BigDecimal oafNumClave = null;

    public Opasifir() {
        super();
        this.pkColumns = 10;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafNumContrato(BigDecimal oafNumContrato) {
        this.oafNumContrato = oafNumContrato;
    }

    public BigDecimal getOafNumContrato() {
        return this.oafNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOafNombreFirma(String oafNombreFirma) {
        this.oafNombreFirma = oafNombreFirma;
    }

    public String getOafNombreFirma() {
        return this.oafNombreFirma;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOafUbicacionFirma(String oafUbicacionFirma) {
        this.oafUbicacionFirma = oafUbicacionFirma;
    }

    public String getOafUbicacionFirma() {
        return this.oafUbicacionFirma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafNumeroPers(BigDecimal oafNumeroPers) {
        this.oafNumeroPers = oafNumeroPers;
    }

    public BigDecimal getOafNumeroPers() {
        return this.oafNumeroPers;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOafTipoPers(String oafTipoPers) {
        this.oafTipoPers = oafTipoPers;
    }

    public String getOafTipoPers() {
        return this.oafTipoPers;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafNumOperacion(BigDecimal oafNumOperacion) {
        this.oafNumOperacion = oafNumOperacion;
    }

    public BigDecimal getOafNumOperacion() {
        return this.oafNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafSubContrato(BigDecimal oafSubContrato) {
        this.oafSubContrato = oafSubContrato;
    }

    public BigDecimal getOafSubContrato() {
        return this.oafSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafCtoInter(BigDecimal oafCtoInter) {
        this.oafCtoInter = oafCtoInter;
    }

    public BigDecimal getOafCtoInter() {
        return this.oafCtoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafNumIntermed(BigDecimal oafNumIntermed) {
        this.oafNumIntermed = oafNumIntermed;
    }

    public BigDecimal getOafNumIntermed() {
        return this.oafNumIntermed;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOafImpMaxRetiro(BigDecimal oafImpMaxRetiro) {
        this.oafImpMaxRetiro = oafImpMaxRetiro;
    }

    public BigDecimal getOafImpMaxRetiro() {
        return this.oafImpMaxRetiro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOafPeriodicidad(String oafPeriodicidad) {
        this.oafPeriodicidad = oafPeriodicidad;
    }

    public String getOafPeriodicidad() {
        return this.oafPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOafDiaPago1(BigDecimal oafDiaPago1) {
        this.oafDiaPago1 = oafDiaPago1;
    }

    public BigDecimal getOafDiaPago1() {
        return this.oafDiaPago1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOafDiaPago2(BigDecimal oafDiaPago2) {
        this.oafDiaPago2 = oafDiaPago2;
    }

    public BigDecimal getOafDiaPago2() {
        return this.oafDiaPago2;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setOafVigenciaDe(String oafVigenciaDe) {
        this.oafVigenciaDe = oafVigenciaDe;
    }

    public String getOafVigenciaDe() {
        return this.oafVigenciaDe;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setOafVigenciaA(String oafVigenciaA) {
        this.oafVigenciaA = oafVigenciaA;
    }

    public String getOafVigenciaA() {
        return this.oafVigenciaA;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setOafAutomatico(BigDecimal oafAutomatico) {
        this.oafAutomatico = oafAutomatico;
    }

    public BigDecimal getOafAutomatico() {
        return this.oafAutomatico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafCveCuendep(BigDecimal oafCveCuendep) {
        this.oafCveCuendep = oafCveCuendep;
    }

    public BigDecimal getOafCveCuendep() {
        return this.oafCveCuendep;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafLiquidacion(BigDecimal oafLiquidacion) {
        this.oafLiquidacion = oafLiquidacion;
    }

    public BigDecimal getOafLiquidacion() {
        return this.oafLiquidacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOafNumClave(BigDecimal oafNumClave) {
        this.oafNumClave = oafNumClave;
    }

    public BigDecimal getOafNumClave() {
        return this.oafNumClave;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OPASIFIR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOafNumContrato() != null && this.getOafNumContrato().longValue() == -999) {
            conditions += " AND OAF_NUM_CONTRATO IS NULL";
        } else if (this.getOafNumContrato() != null) {
            conditions += " AND OAF_NUM_CONTRATO = ?";
            values.add(this.getOafNumContrato());
        }

        if (this.getOafNombreFirma() != null && "null".equals(this.getOafNombreFirma())) {
            conditions += " AND OAF_NOMBRE_FIRMA IS NULL";
        } else if (this.getOafNombreFirma() != null) {
            conditions += " AND OAF_NOMBRE_FIRMA = ?";
            values.add(this.getOafNombreFirma());
        }

        if (this.getOafUbicacionFirma() != null && "null".equals(this.getOafUbicacionFirma())) {
            conditions += " AND OAF_UBICACION_FIRMA IS NULL";
        } else if (this.getOafUbicacionFirma() != null) {
            conditions += " AND OAF_UBICACION_FIRMA = ?";
            values.add(this.getOafUbicacionFirma());
        }

        if (this.getOafNumeroPers() != null && this.getOafNumeroPers().longValue() == -999) {
            conditions += " AND OAF_NUMERO_PERS IS NULL";
        } else if (this.getOafNumeroPers() != null) {
            conditions += " AND OAF_NUMERO_PERS = ?";
            values.add(this.getOafNumeroPers());
        }

        if (this.getOafTipoPers() != null && "null".equals(this.getOafTipoPers())) {
            conditions += " AND OAF_TIPO_PERS IS NULL";
        } else if (this.getOafTipoPers() != null) {
            conditions += " AND OAF_TIPO_PERS = ?";
            values.add(this.getOafTipoPers());
        }

        if (this.getOafNumOperacion() != null && this.getOafNumOperacion().longValue() == -999) {
            conditions += " AND OAF_NUM_OPERACION IS NULL";
        } else if (this.getOafNumOperacion() != null) {
            conditions += " AND OAF_NUM_OPERACION = ?";
            values.add(this.getOafNumOperacion());
        }

        if (this.getOafSubContrato() != null && this.getOafSubContrato().longValue() == -999) {
            conditions += " AND OAF_SUB_CONTRATO IS NULL";
        } else if (this.getOafSubContrato() != null) {
            conditions += " AND OAF_SUB_CONTRATO = ?";
            values.add(this.getOafSubContrato());
        }

        if (this.getOafCtoInter() != null && this.getOafCtoInter().longValue() == -999) {
            conditions += " AND OAF_CTO_INTER IS NULL";
        } else if (this.getOafCtoInter() != null) {
            conditions += " AND OAF_CTO_INTER = ?";
            values.add(this.getOafCtoInter());
        }

        if (this.getOafNumIntermed() != null && this.getOafNumIntermed().longValue() == -999) {
            conditions += " AND OAF_NUM_INTERMED IS NULL";
        } else if (this.getOafNumIntermed() != null) {
            conditions += " AND OAF_NUM_INTERMED = ?";
            values.add(this.getOafNumIntermed());
        }

        if (this.getOafNumClave() != null && this.getOafNumClave().longValue() == -999) {
            conditions += " AND OAF_NUM_CLAVE IS NULL";
        } else if (this.getOafNumClave() != null) {
            conditions += " AND OAF_NUM_CLAVE = ?";
            values.add(this.getOafNumClave());
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
        String sql = "SELECT * FROM OPASIFIR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOafNumContrato() != null && this.getOafNumContrato().longValue() == -999) {
            conditions += " AND OAF_NUM_CONTRATO IS NULL";
        } else if (this.getOafNumContrato() != null) {
            conditions += " AND OAF_NUM_CONTRATO = ?";
            values.add(this.getOafNumContrato());
        }

        if (this.getOafNombreFirma() != null && "null".equals(this.getOafNombreFirma())) {
            conditions += " AND OAF_NOMBRE_FIRMA IS NULL";
        } else if (this.getOafNombreFirma() != null) {
            conditions += " AND OAF_NOMBRE_FIRMA = ?";
            values.add(this.getOafNombreFirma());
        }

        if (this.getOafUbicacionFirma() != null && "null".equals(this.getOafUbicacionFirma())) {
            conditions += " AND OAF_UBICACION_FIRMA IS NULL";
        } else if (this.getOafUbicacionFirma() != null) {
            conditions += " AND OAF_UBICACION_FIRMA = ?";
            values.add(this.getOafUbicacionFirma());
        }

        if (this.getOafNumeroPers() != null && this.getOafNumeroPers().longValue() == -999) {
            conditions += " AND OAF_NUMERO_PERS IS NULL";
        } else if (this.getOafNumeroPers() != null) {
            conditions += " AND OAF_NUMERO_PERS = ?";
            values.add(this.getOafNumeroPers());
        }

        if (this.getOafTipoPers() != null && "null".equals(this.getOafTipoPers())) {
            conditions += " AND OAF_TIPO_PERS IS NULL";
        } else if (this.getOafTipoPers() != null) {
            conditions += " AND OAF_TIPO_PERS = ?";
            values.add(this.getOafTipoPers());
        }

        if (this.getOafNumOperacion() != null && this.getOafNumOperacion().longValue() == -999) {
            conditions += " AND OAF_NUM_OPERACION IS NULL";
        } else if (this.getOafNumOperacion() != null) {
            conditions += " AND OAF_NUM_OPERACION = ?";
            values.add(this.getOafNumOperacion());
        }

        if (this.getOafSubContrato() != null && this.getOafSubContrato().longValue() == -999) {
            conditions += " AND OAF_SUB_CONTRATO IS NULL";
        } else if (this.getOafSubContrato() != null) {
            conditions += " AND OAF_SUB_CONTRATO = ?";
            values.add(this.getOafSubContrato());
        }

        if (this.getOafCtoInter() != null && this.getOafCtoInter().longValue() == -999) {
            conditions += " AND OAF_CTO_INTER IS NULL";
        } else if (this.getOafCtoInter() != null) {
            conditions += " AND OAF_CTO_INTER = ?";
            values.add(this.getOafCtoInter());
        }

        if (this.getOafNumIntermed() != null && this.getOafNumIntermed().longValue() == -999) {
            conditions += " AND OAF_NUM_INTERMED IS NULL";
        } else if (this.getOafNumIntermed() != null) {
            conditions += " AND OAF_NUM_INTERMED = ?";
            values.add(this.getOafNumIntermed());
        }

        if (this.getOafImpMaxRetiro() != null && this.getOafImpMaxRetiro().longValue() == -999) {
            conditions += " AND OAF_IMP_MAX_RETIRO IS NULL";
        } else if (this.getOafImpMaxRetiro() != null) {
            conditions += " AND OAF_IMP_MAX_RETIRO = ?";
            values.add(this.getOafImpMaxRetiro());
        }

        if (this.getOafPeriodicidad() != null && "null".equals(this.getOafPeriodicidad())) {
            conditions += " AND OAF_PERIODICIDAD IS NULL";
        } else if (this.getOafPeriodicidad() != null) {
            conditions += " AND OAF_PERIODICIDAD = ?";
            values.add(this.getOafPeriodicidad());
        }

        if (this.getOafDiaPago1() != null && this.getOafDiaPago1().longValue() == -999) {
            conditions += " AND OAF_DIA_PAGO1 IS NULL";
        } else if (this.getOafDiaPago1() != null) {
            conditions += " AND OAF_DIA_PAGO1 = ?";
            values.add(this.getOafDiaPago1());
        }

        if (this.getOafDiaPago2() != null && this.getOafDiaPago2().longValue() == -999) {
            conditions += " AND OAF_DIA_PAGO2 IS NULL";
        } else if (this.getOafDiaPago2() != null) {
            conditions += " AND OAF_DIA_PAGO2 = ?";
            values.add(this.getOafDiaPago2());
        }

        if (this.getOafVigenciaDe() != null && "null".equals(this.getOafVigenciaDe())) {
            conditions += " AND OAF_VIGENCIA_DE IS NULL";
        } else if (this.getOafVigenciaDe() != null) {
            conditions += " AND OAF_VIGENCIA_DE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getOafVigenciaDe());
        }

        if (this.getOafVigenciaA() != null && "null".equals(this.getOafVigenciaA())) {
            conditions += " AND OAF_VIGENCIA_A IS NULL";
        } else if (this.getOafVigenciaA() != null) {
            conditions += " AND OAF_VIGENCIA_A = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getOafVigenciaA());
        }

        if (this.getOafAutomatico() != null && this.getOafAutomatico().longValue() == -999) {
            conditions += " AND OAF_AUTOMATICO IS NULL";
        } else if (this.getOafAutomatico() != null) {
            conditions += " AND OAF_AUTOMATICO = ?";
            values.add(this.getOafAutomatico());
        }

        if (this.getOafCveCuendep() != null && this.getOafCveCuendep().longValue() == -999) {
            conditions += " AND OAF_CVE_CUENDEP IS NULL";
        } else if (this.getOafCveCuendep() != null) {
            conditions += " AND OAF_CVE_CUENDEP = ?";
            values.add(this.getOafCveCuendep());
        }

        if (this.getOafLiquidacion() != null && this.getOafLiquidacion().longValue() == -999) {
            conditions += " AND OAF_LIQUIDACION IS NULL";
        } else if (this.getOafLiquidacion() != null) {
            conditions += " AND OAF_LIQUIDACION = ?";
            values.add(this.getOafLiquidacion());
        }

        if (this.getOafNumClave() != null && this.getOafNumClave().longValue() == -999) {
            conditions += " AND OAF_NUM_CLAVE IS NULL";
        } else if (this.getOafNumClave() != null) {
            conditions += " AND OAF_NUM_CLAVE = ?";
            values.add(this.getOafNumClave());
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
        String sql = "UPDATE OPASIFIR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OAF_NUM_CONTRATO = ?";
        pkValues.add(this.getOafNumContrato());
        conditions += " AND OAF_NOMBRE_FIRMA = ?";
        pkValues.add(this.getOafNombreFirma());
        conditions += " AND OAF_UBICACION_FIRMA = ?";
        pkValues.add(this.getOafUbicacionFirma());
        conditions += " AND OAF_NUMERO_PERS = ?";
        pkValues.add(this.getOafNumeroPers());
        conditions += " AND OAF_TIPO_PERS = ?";
        pkValues.add(this.getOafTipoPers());
        conditions += " AND OAF_NUM_OPERACION = ?";
        pkValues.add(this.getOafNumOperacion());
        conditions += " AND OAF_SUB_CONTRATO = ?";
        pkValues.add(this.getOafSubContrato());
        conditions += " AND OAF_CTO_INTER = ?";
        pkValues.add(this.getOafCtoInter());
        conditions += " AND OAF_NUM_INTERMED = ?";
        pkValues.add(this.getOafNumIntermed());
        fields += " OAF_IMP_MAX_RETIRO = ?, ";
        values.add(this.getOafImpMaxRetiro());
        fields += " OAF_PERIODICIDAD = ?, ";
        values.add(this.getOafPeriodicidad());
        fields += " OAF_DIA_PAGO1 = ?, ";
        values.add(this.getOafDiaPago1());
        fields += " OAF_DIA_PAGO2 = ?, ";
        values.add(this.getOafDiaPago2());
        fields += " OAF_VIGENCIA_DE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getOafVigenciaDe());
        fields += " OAF_VIGENCIA_A = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getOafVigenciaA());
        fields += " OAF_AUTOMATICO = ?, ";
        values.add(this.getOafAutomatico());
        fields += " OAF_CVE_CUENDEP = ?, ";
        values.add(this.getOafCveCuendep());
        fields += " OAF_LIQUIDACION = ?, ";
        values.add(this.getOafLiquidacion());
        conditions += " AND OAF_NUM_CLAVE = ?";
        pkValues.add(this.getOafNumClave());
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
        String sql = "INSERT INTO OPASIFIR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OAF_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getOafNumContrato());

        fields += ", OAF_NOMBRE_FIRMA";
        fieldValues += ", ?";
        values.add(this.getOafNombreFirma());

        fields += ", OAF_UBICACION_FIRMA";
        fieldValues += ", ?";
        values.add(this.getOafUbicacionFirma());

        fields += ", OAF_NUMERO_PERS";
        fieldValues += ", ?";
        values.add(this.getOafNumeroPers());

        fields += ", OAF_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getOafTipoPers());

        fields += ", OAF_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getOafNumOperacion());

        fields += ", OAF_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getOafSubContrato());

        fields += ", OAF_CTO_INTER";
        fieldValues += ", ?";
        values.add(this.getOafCtoInter());

        fields += ", OAF_NUM_INTERMED";
        fieldValues += ", ?";
        values.add(this.getOafNumIntermed());

        fields += ", OAF_IMP_MAX_RETIRO";
        fieldValues += ", ?";
        values.add(this.getOafImpMaxRetiro());

        fields += ", OAF_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getOafPeriodicidad());

        fields += ", OAF_DIA_PAGO1";
        fieldValues += ", ?";
        values.add(this.getOafDiaPago1());

        fields += ", OAF_DIA_PAGO2";
        fieldValues += ", ?";
        values.add(this.getOafDiaPago2());

        fields += ", OAF_VIGENCIA_DE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getOafVigenciaDe());

        fields += ", OAF_VIGENCIA_A";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getOafVigenciaA());

        fields += ", OAF_AUTOMATICO";
        fieldValues += ", ?";
        values.add(this.getOafAutomatico());

        fields += ", OAF_CVE_CUENDEP";
        fieldValues += ", ?";
        values.add(this.getOafCveCuendep());

        fields += ", OAF_LIQUIDACION";
        fieldValues += ", ?";
        values.add(this.getOafLiquidacion());

        fields += ", OAF_NUM_CLAVE";
        fieldValues += ", ?";
        values.add(this.getOafNumClave());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OPASIFIR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OAF_NUM_CONTRATO = ?";
        values.add(this.getOafNumContrato());
        conditions += " AND OAF_NOMBRE_FIRMA = ?";
        values.add(this.getOafNombreFirma());
        conditions += " AND OAF_UBICACION_FIRMA = ?";
        values.add(this.getOafUbicacionFirma());
        conditions += " AND OAF_NUMERO_PERS = ?";
        values.add(this.getOafNumeroPers());
        conditions += " AND OAF_TIPO_PERS = ?";
        values.add(this.getOafTipoPers());
        conditions += " AND OAF_NUM_OPERACION = ?";
        values.add(this.getOafNumOperacion());
        conditions += " AND OAF_SUB_CONTRATO = ?";
        values.add(this.getOafSubContrato());
        conditions += " AND OAF_CTO_INTER = ?";
        values.add(this.getOafCtoInter());
        conditions += " AND OAF_NUM_INTERMED = ?";
        values.add(this.getOafNumIntermed());
        conditions += " AND OAF_NUM_CLAVE = ?";
        values.add(this.getOafNumClave());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Opasifir instance = (Opasifir) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOafNumContrato().equals(instance.getOafNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getOafNombreFirma().equals(instance.getOafNombreFirma()))
            equalObjects = false;
        if (equalObjects && !this.getOafUbicacionFirma().equals(instance.getOafUbicacionFirma()))
            equalObjects = false;
        if (equalObjects && !this.getOafNumeroPers().equals(instance.getOafNumeroPers()))
            equalObjects = false;
        if (equalObjects && !this.getOafTipoPers().equals(instance.getOafTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getOafNumOperacion().equals(instance.getOafNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getOafSubContrato().equals(instance.getOafSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getOafCtoInter().equals(instance.getOafCtoInter()))
            equalObjects = false;
        if (equalObjects && !this.getOafNumIntermed().equals(instance.getOafNumIntermed()))
            equalObjects = false;
        if (equalObjects && !this.getOafImpMaxRetiro().equals(instance.getOafImpMaxRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getOafPeriodicidad().equals(instance.getOafPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getOafDiaPago1().equals(instance.getOafDiaPago1()))
            equalObjects = false;
        if (equalObjects && !this.getOafDiaPago2().equals(instance.getOafDiaPago2()))
            equalObjects = false;
        if (equalObjects && !this.getOafVigenciaDe().equals(instance.getOafVigenciaDe()))
            equalObjects = false;
        if (equalObjects && !this.getOafVigenciaA().equals(instance.getOafVigenciaA()))
            equalObjects = false;
        if (equalObjects && !this.getOafAutomatico().equals(instance.getOafAutomatico()))
            equalObjects = false;
        if (equalObjects && !this.getOafCveCuendep().equals(instance.getOafCveCuendep()))
            equalObjects = false;
        if (equalObjects && !this.getOafLiquidacion().equals(instance.getOafLiquidacion()))
            equalObjects = false;
        if (equalObjects && !this.getOafNumClave().equals(instance.getOafNumClave()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Opasifir result = new Opasifir();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOafNumContrato((BigDecimal) objectData.getData("OAF_NUM_CONTRATO"));
        result.setOafNombreFirma((String) objectData.getData("OAF_NOMBRE_FIRMA"));
        result.setOafUbicacionFirma((String) objectData.getData("OAF_UBICACION_FIRMA"));
        result.setOafNumeroPers((BigDecimal) objectData.getData("OAF_NUMERO_PERS"));
        result.setOafTipoPers((String) objectData.getData("OAF_TIPO_PERS"));
        result.setOafNumOperacion((BigDecimal) objectData.getData("OAF_NUM_OPERACION"));
        result.setOafSubContrato((BigDecimal) objectData.getData("OAF_SUB_CONTRATO"));
        result.setOafCtoInter((BigDecimal) objectData.getData("OAF_CTO_INTER"));
        result.setOafNumIntermed((BigDecimal) objectData.getData("OAF_NUM_INTERMED"));
        result.setOafImpMaxRetiro((BigDecimal) objectData.getData("OAF_IMP_MAX_RETIRO"));
        result.setOafPeriodicidad((String) objectData.getData("OAF_PERIODICIDAD"));
        result.setOafDiaPago1((BigDecimal) objectData.getData("OAF_DIA_PAGO1"));
        result.setOafDiaPago2((BigDecimal) objectData.getData("OAF_DIA_PAGO2"));
        result.setOafVigenciaDe((String) objectData.getData("OAF_VIGENCIA_DE"));
        result.setOafVigenciaA((String) objectData.getData("OAF_VIGENCIA_A"));
        result.setOafAutomatico((BigDecimal) objectData.getData("OAF_AUTOMATICO"));
        result.setOafCveCuendep((BigDecimal) objectData.getData("OAF_CVE_CUENDEP"));
        result.setOafLiquidacion((BigDecimal) objectData.getData("OAF_LIQUIDACION"));
        result.setOafNumClave((BigDecimal) objectData.getData("OAF_NUM_CLAVE"));

        return result;

    }

}
