package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OPEREJEC_PK", columns = { "OJE_FOLIO_OPERA", "OJE_NUM_OPERACION", "OJE_NUM_SEC_OPERA" }, sequences = { "MANUAL" })
public class Operejec extends DomainObject {

    BigDecimal ojeFolioOpera = null;
    BigDecimal ojeNumOperacion = null;
    BigDecimal ojeNumSecOpera = null;
    BigDecimal ojeNumModulo = null;
    BigDecimal ojeNumTransac = null;
    BigDecimal ojeAnoEjecucion = null;
    BigDecimal ojeMesEjecucion = null;
    BigDecimal ojeDiaEjecucion = null;
    BigDecimal ojeAnoProceso = null;
    BigDecimal ojeMesProceso = null;
    BigDecimal ojeDiaProceso = null;
    BigDecimal ojeHoraProceso = null;
    BigDecimal ojeMinProceso = null;
    BigDecimal ojeFolioInstrum = null;
    BigDecimal ojeNumUsuario = null;
    BigDecimal ojeAnoAltaReg = null;
    BigDecimal ojeMesAltaReg = null;
    BigDecimal ojeDiaAltaReg = null;
    BigDecimal ojeAnoUltMod = null;
    BigDecimal ojeMesUltMod = null;
    BigDecimal ojeDiaUltMod = null;
    String ojeCveStOperaci = null;

    public Operejec() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeFolioOpera(BigDecimal ojeFolioOpera) {
        this.ojeFolioOpera = ojeFolioOpera;
    }

    public BigDecimal getOjeFolioOpera() {
        return this.ojeFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeNumOperacion(BigDecimal ojeNumOperacion) {
        this.ojeNumOperacion = ojeNumOperacion;
    }

    public BigDecimal getOjeNumOperacion() {
        return this.ojeNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeNumSecOpera(BigDecimal ojeNumSecOpera) {
        this.ojeNumSecOpera = ojeNumSecOpera;
    }

    public BigDecimal getOjeNumSecOpera() {
        return this.ojeNumSecOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeNumModulo(BigDecimal ojeNumModulo) {
        this.ojeNumModulo = ojeNumModulo;
    }

    public BigDecimal getOjeNumModulo() {
        return this.ojeNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeNumTransac(BigDecimal ojeNumTransac) {
        this.ojeNumTransac = ojeNumTransac;
    }

    public BigDecimal getOjeNumTransac() {
        return this.ojeNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOjeAnoEjecucion(BigDecimal ojeAnoEjecucion) {
        this.ojeAnoEjecucion = ojeAnoEjecucion;
    }

    public BigDecimal getOjeAnoEjecucion() {
        return this.ojeAnoEjecucion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOjeMesEjecucion(BigDecimal ojeMesEjecucion) {
        this.ojeMesEjecucion = ojeMesEjecucion;
    }

    public BigDecimal getOjeMesEjecucion() {
        return this.ojeMesEjecucion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOjeDiaEjecucion(BigDecimal ojeDiaEjecucion) {
        this.ojeDiaEjecucion = ojeDiaEjecucion;
    }

    public BigDecimal getOjeDiaEjecucion() {
        return this.ojeDiaEjecucion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOjeAnoProceso(BigDecimal ojeAnoProceso) {
        this.ojeAnoProceso = ojeAnoProceso;
    }

    public BigDecimal getOjeAnoProceso() {
        return this.ojeAnoProceso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOjeMesProceso(BigDecimal ojeMesProceso) {
        this.ojeMesProceso = ojeMesProceso;
    }

    public BigDecimal getOjeMesProceso() {
        return this.ojeMesProceso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOjeDiaProceso(BigDecimal ojeDiaProceso) {
        this.ojeDiaProceso = ojeDiaProceso;
    }

    public BigDecimal getOjeDiaProceso() {
        return this.ojeDiaProceso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeHoraProceso(BigDecimal ojeHoraProceso) {
        this.ojeHoraProceso = ojeHoraProceso;
    }

    public BigDecimal getOjeHoraProceso() {
        return this.ojeHoraProceso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeMinProceso(BigDecimal ojeMinProceso) {
        this.ojeMinProceso = ojeMinProceso;
    }

    public BigDecimal getOjeMinProceso() {
        return this.ojeMinProceso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeFolioInstrum(BigDecimal ojeFolioInstrum) {
        this.ojeFolioInstrum = ojeFolioInstrum;
    }

    public BigDecimal getOjeFolioInstrum() {
        return this.ojeFolioInstrum;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOjeNumUsuario(BigDecimal ojeNumUsuario) {
        this.ojeNumUsuario = ojeNumUsuario;
    }

    public BigDecimal getOjeNumUsuario() {
        return this.ojeNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOjeAnoAltaReg(BigDecimal ojeAnoAltaReg) {
        this.ojeAnoAltaReg = ojeAnoAltaReg;
    }

    public BigDecimal getOjeAnoAltaReg() {
        return this.ojeAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOjeMesAltaReg(BigDecimal ojeMesAltaReg) {
        this.ojeMesAltaReg = ojeMesAltaReg;
    }

    public BigDecimal getOjeMesAltaReg() {
        return this.ojeMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOjeDiaAltaReg(BigDecimal ojeDiaAltaReg) {
        this.ojeDiaAltaReg = ojeDiaAltaReg;
    }

    public BigDecimal getOjeDiaAltaReg() {
        return this.ojeDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOjeAnoUltMod(BigDecimal ojeAnoUltMod) {
        this.ojeAnoUltMod = ojeAnoUltMod;
    }

    public BigDecimal getOjeAnoUltMod() {
        return this.ojeAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOjeMesUltMod(BigDecimal ojeMesUltMod) {
        this.ojeMesUltMod = ojeMesUltMod;
    }

    public BigDecimal getOjeMesUltMod() {
        return this.ojeMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOjeDiaUltMod(BigDecimal ojeDiaUltMod) {
        this.ojeDiaUltMod = ojeDiaUltMod;
    }

    public BigDecimal getOjeDiaUltMod() {
        return this.ojeDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOjeCveStOperaci(String ojeCveStOperaci) {
        this.ojeCveStOperaci = ojeCveStOperaci;
    }

    public String getOjeCveStOperaci() {
        return this.ojeCveStOperaci;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OPEREJEC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOjeFolioOpera() != null && this.getOjeFolioOpera().longValue() == -999) {
            conditions += " AND OJE_FOLIO_OPERA IS NULL";
        } else if (this.getOjeFolioOpera() != null) {
            conditions += " AND OJE_FOLIO_OPERA = ?";
            values.add(this.getOjeFolioOpera());
        }

        if (this.getOjeNumOperacion() != null && this.getOjeNumOperacion().longValue() == -999) {
            conditions += " AND OJE_NUM_OPERACION IS NULL";
        } else if (this.getOjeNumOperacion() != null) {
            conditions += " AND OJE_NUM_OPERACION = ?";
            values.add(this.getOjeNumOperacion());
        }

        if (this.getOjeNumSecOpera() != null && this.getOjeNumSecOpera().longValue() == -999) {
            conditions += " AND OJE_NUM_SEC_OPERA IS NULL";
        } else if (this.getOjeNumSecOpera() != null) {
            conditions += " AND OJE_NUM_SEC_OPERA = ?";
            values.add(this.getOjeNumSecOpera());
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
        String sql = "SELECT * FROM OPEREJEC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOjeFolioOpera() != null && this.getOjeFolioOpera().longValue() == -999) {
            conditions += " AND OJE_FOLIO_OPERA IS NULL";
        } else if (this.getOjeFolioOpera() != null) {
            conditions += " AND OJE_FOLIO_OPERA = ?";
            values.add(this.getOjeFolioOpera());
        }

        if (this.getOjeNumOperacion() != null && this.getOjeNumOperacion().longValue() == -999) {
            conditions += " AND OJE_NUM_OPERACION IS NULL";
        } else if (this.getOjeNumOperacion() != null) {
            conditions += " AND OJE_NUM_OPERACION = ?";
            values.add(this.getOjeNumOperacion());
        }

        if (this.getOjeNumSecOpera() != null && this.getOjeNumSecOpera().longValue() == -999) {
            conditions += " AND OJE_NUM_SEC_OPERA IS NULL";
        } else if (this.getOjeNumSecOpera() != null) {
            conditions += " AND OJE_NUM_SEC_OPERA = ?";
            values.add(this.getOjeNumSecOpera());
        }

        if (this.getOjeNumModulo() != null && this.getOjeNumModulo().longValue() == -999) {
            conditions += " AND OJE_NUM_MODULO IS NULL";
        } else if (this.getOjeNumModulo() != null) {
            conditions += " AND OJE_NUM_MODULO = ?";
            values.add(this.getOjeNumModulo());
        }

        if (this.getOjeNumTransac() != null && this.getOjeNumTransac().longValue() == -999) {
            conditions += " AND OJE_NUM_TRANSAC IS NULL";
        } else if (this.getOjeNumTransac() != null) {
            conditions += " AND OJE_NUM_TRANSAC = ?";
            values.add(this.getOjeNumTransac());
        }

        if (this.getOjeAnoEjecucion() != null && this.getOjeAnoEjecucion().longValue() == -999) {
            conditions += " AND OJE_ANO_EJECUCION IS NULL";
        } else if (this.getOjeAnoEjecucion() != null) {
            conditions += " AND OJE_ANO_EJECUCION = ?";
            values.add(this.getOjeAnoEjecucion());
        }

        if (this.getOjeMesEjecucion() != null && this.getOjeMesEjecucion().longValue() == -999) {
            conditions += " AND OJE_MES_EJECUCION IS NULL";
        } else if (this.getOjeMesEjecucion() != null) {
            conditions += " AND OJE_MES_EJECUCION = ?";
            values.add(this.getOjeMesEjecucion());
        }

        if (this.getOjeDiaEjecucion() != null && this.getOjeDiaEjecucion().longValue() == -999) {
            conditions += " AND OJE_DIA_EJECUCION IS NULL";
        } else if (this.getOjeDiaEjecucion() != null) {
            conditions += " AND OJE_DIA_EJECUCION = ?";
            values.add(this.getOjeDiaEjecucion());
        }

        if (this.getOjeAnoProceso() != null && this.getOjeAnoProceso().longValue() == -999) {
            conditions += " AND OJE_ANO_PROCESO IS NULL";
        } else if (this.getOjeAnoProceso() != null) {
            conditions += " AND OJE_ANO_PROCESO = ?";
            values.add(this.getOjeAnoProceso());
        }

        if (this.getOjeMesProceso() != null && this.getOjeMesProceso().longValue() == -999) {
            conditions += " AND OJE_MES_PROCESO IS NULL";
        } else if (this.getOjeMesProceso() != null) {
            conditions += " AND OJE_MES_PROCESO = ?";
            values.add(this.getOjeMesProceso());
        }

        if (this.getOjeDiaProceso() != null && this.getOjeDiaProceso().longValue() == -999) {
            conditions += " AND OJE_DIA_PROCESO IS NULL";
        } else if (this.getOjeDiaProceso() != null) {
            conditions += " AND OJE_DIA_PROCESO = ?";
            values.add(this.getOjeDiaProceso());
        }

        if (this.getOjeHoraProceso() != null && this.getOjeHoraProceso().longValue() == -999) {
            conditions += " AND OJE_HORA_PROCESO IS NULL";
        } else if (this.getOjeHoraProceso() != null) {
            conditions += " AND OJE_HORA_PROCESO = ?";
            values.add(this.getOjeHoraProceso());
        }

        if (this.getOjeMinProceso() != null && this.getOjeMinProceso().longValue() == -999) {
            conditions += " AND OJE_MIN_PROCESO IS NULL";
        } else if (this.getOjeMinProceso() != null) {
            conditions += " AND OJE_MIN_PROCESO = ?";
            values.add(this.getOjeMinProceso());
        }

        if (this.getOjeFolioInstrum() != null && this.getOjeFolioInstrum().longValue() == -999) {
            conditions += " AND OJE_FOLIO_INSTRUM IS NULL";
        } else if (this.getOjeFolioInstrum() != null) {
            conditions += " AND OJE_FOLIO_INSTRUM = ?";
            values.add(this.getOjeFolioInstrum());
        }

        if (this.getOjeNumUsuario() != null && this.getOjeNumUsuario().longValue() == -999) {
            conditions += " AND OJE_NUM_USUARIO IS NULL";
        } else if (this.getOjeNumUsuario() != null) {
            conditions += " AND OJE_NUM_USUARIO = ?";
            values.add(this.getOjeNumUsuario());
        }

        if (this.getOjeAnoAltaReg() != null && this.getOjeAnoAltaReg().longValue() == -999) {
            conditions += " AND OJE_ANO_ALTA_REG IS NULL";
        } else if (this.getOjeAnoAltaReg() != null) {
            conditions += " AND OJE_ANO_ALTA_REG = ?";
            values.add(this.getOjeAnoAltaReg());
        }

        if (this.getOjeMesAltaReg() != null && this.getOjeMesAltaReg().longValue() == -999) {
            conditions += " AND OJE_MES_ALTA_REG IS NULL";
        } else if (this.getOjeMesAltaReg() != null) {
            conditions += " AND OJE_MES_ALTA_REG = ?";
            values.add(this.getOjeMesAltaReg());
        }

        if (this.getOjeDiaAltaReg() != null && this.getOjeDiaAltaReg().longValue() == -999) {
            conditions += " AND OJE_DIA_ALTA_REG IS NULL";
        } else if (this.getOjeDiaAltaReg() != null) {
            conditions += " AND OJE_DIA_ALTA_REG = ?";
            values.add(this.getOjeDiaAltaReg());
        }

        if (this.getOjeAnoUltMod() != null && this.getOjeAnoUltMod().longValue() == -999) {
            conditions += " AND OJE_ANO_ULT_MOD IS NULL";
        } else if (this.getOjeAnoUltMod() != null) {
            conditions += " AND OJE_ANO_ULT_MOD = ?";
            values.add(this.getOjeAnoUltMod());
        }

        if (this.getOjeMesUltMod() != null && this.getOjeMesUltMod().longValue() == -999) {
            conditions += " AND OJE_MES_ULT_MOD IS NULL";
        } else if (this.getOjeMesUltMod() != null) {
            conditions += " AND OJE_MES_ULT_MOD = ?";
            values.add(this.getOjeMesUltMod());
        }

        if (this.getOjeDiaUltMod() != null && this.getOjeDiaUltMod().longValue() == -999) {
            conditions += " AND OJE_DIA_ULT_MOD IS NULL";
        } else if (this.getOjeDiaUltMod() != null) {
            conditions += " AND OJE_DIA_ULT_MOD = ?";
            values.add(this.getOjeDiaUltMod());
        }

        if (this.getOjeCveStOperaci() != null && "null".equals(this.getOjeCveStOperaci())) {
            conditions += " AND OJE_CVE_ST_OPERACI IS NULL";
        } else if (this.getOjeCveStOperaci() != null) {
            conditions += " AND OJE_CVE_ST_OPERACI = ?";
            values.add(this.getOjeCveStOperaci());
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
        String sql = "UPDATE OPEREJEC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OJE_FOLIO_OPERA = ?";
        pkValues.add(this.getOjeFolioOpera());
        conditions += " AND OJE_NUM_OPERACION = ?";
        pkValues.add(this.getOjeNumOperacion());
        conditions += " AND OJE_NUM_SEC_OPERA = ?";
        pkValues.add(this.getOjeNumSecOpera());
        fields += " OJE_NUM_MODULO = ?, ";
        values.add(this.getOjeNumModulo());
        fields += " OJE_NUM_TRANSAC = ?, ";
        values.add(this.getOjeNumTransac());
        fields += " OJE_ANO_EJECUCION = ?, ";
        values.add(this.getOjeAnoEjecucion());
        fields += " OJE_MES_EJECUCION = ?, ";
        values.add(this.getOjeMesEjecucion());
        fields += " OJE_DIA_EJECUCION = ?, ";
        values.add(this.getOjeDiaEjecucion());
        fields += " OJE_ANO_PROCESO = ?, ";
        values.add(this.getOjeAnoProceso());
        fields += " OJE_MES_PROCESO = ?, ";
        values.add(this.getOjeMesProceso());
        fields += " OJE_DIA_PROCESO = ?, ";
        values.add(this.getOjeDiaProceso());
        fields += " OJE_HORA_PROCESO = ?, ";
        values.add(this.getOjeHoraProceso());
        fields += " OJE_MIN_PROCESO = ?, ";
        values.add(this.getOjeMinProceso());
        fields += " OJE_FOLIO_INSTRUM = ?, ";
        values.add(this.getOjeFolioInstrum());
        fields += " OJE_NUM_USUARIO = ?, ";
        values.add(this.getOjeNumUsuario());
        fields += " OJE_ANO_ALTA_REG = ?, ";
        values.add(this.getOjeAnoAltaReg());
        fields += " OJE_MES_ALTA_REG = ?, ";
        values.add(this.getOjeMesAltaReg());
        fields += " OJE_DIA_ALTA_REG = ?, ";
        values.add(this.getOjeDiaAltaReg());
        fields += " OJE_ANO_ULT_MOD = ?, ";
        values.add(this.getOjeAnoUltMod());
        fields += " OJE_MES_ULT_MOD = ?, ";
        values.add(this.getOjeMesUltMod());
        fields += " OJE_DIA_ULT_MOD = ?, ";
        values.add(this.getOjeDiaUltMod());
        fields += " OJE_CVE_ST_OPERACI = ?, ";
        values.add(this.getOjeCveStOperaci());
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
        String sql = "INSERT INTO OPEREJEC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OJE_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getOjeFolioOpera());

        fields += ", OJE_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getOjeNumOperacion());

        fields += ", OJE_NUM_SEC_OPERA";
        fieldValues += ", ?";
        values.add(this.getOjeNumSecOpera());

        fields += ", OJE_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getOjeNumModulo());

        fields += ", OJE_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getOjeNumTransac());

        fields += ", OJE_ANO_EJECUCION";
        fieldValues += ", ?";
        values.add(this.getOjeAnoEjecucion());

        fields += ", OJE_MES_EJECUCION";
        fieldValues += ", ?";
        values.add(this.getOjeMesEjecucion());

        fields += ", OJE_DIA_EJECUCION";
        fieldValues += ", ?";
        values.add(this.getOjeDiaEjecucion());

        fields += ", OJE_ANO_PROCESO";
        fieldValues += ", ?";
        values.add(this.getOjeAnoProceso());

        fields += ", OJE_MES_PROCESO";
        fieldValues += ", ?";
        values.add(this.getOjeMesProceso());

        fields += ", OJE_DIA_PROCESO";
        fieldValues += ", ?";
        values.add(this.getOjeDiaProceso());

        fields += ", OJE_HORA_PROCESO";
        fieldValues += ", ?";
        values.add(this.getOjeHoraProceso());

        fields += ", OJE_MIN_PROCESO";
        fieldValues += ", ?";
        values.add(this.getOjeMinProceso());

        fields += ", OJE_FOLIO_INSTRUM";
        fieldValues += ", ?";
        values.add(this.getOjeFolioInstrum());

        fields += ", OJE_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getOjeNumUsuario());

        fields += ", OJE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOjeAnoAltaReg());

        fields += ", OJE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOjeMesAltaReg());

        fields += ", OJE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOjeDiaAltaReg());

        fields += ", OJE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOjeAnoUltMod());

        fields += ", OJE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOjeMesUltMod());

        fields += ", OJE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOjeDiaUltMod());

        fields += ", OJE_CVE_ST_OPERACI";
        fieldValues += ", ?";
        values.add(this.getOjeCveStOperaci());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OPEREJEC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OJE_FOLIO_OPERA = ?";
        values.add(this.getOjeFolioOpera());
        conditions += " AND OJE_NUM_OPERACION = ?";
        values.add(this.getOjeNumOperacion());
        conditions += " AND OJE_NUM_SEC_OPERA = ?";
        values.add(this.getOjeNumSecOpera());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Operejec instance = (Operejec) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOjeFolioOpera().equals(instance.getOjeFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getOjeNumOperacion().equals(instance.getOjeNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getOjeNumSecOpera().equals(instance.getOjeNumSecOpera()))
            equalObjects = false;
        if (equalObjects && !this.getOjeNumModulo().equals(instance.getOjeNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getOjeNumTransac().equals(instance.getOjeNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getOjeAnoEjecucion().equals(instance.getOjeAnoEjecucion()))
            equalObjects = false;
        if (equalObjects && !this.getOjeMesEjecucion().equals(instance.getOjeMesEjecucion()))
            equalObjects = false;
        if (equalObjects && !this.getOjeDiaEjecucion().equals(instance.getOjeDiaEjecucion()))
            equalObjects = false;
        if (equalObjects && !this.getOjeAnoProceso().equals(instance.getOjeAnoProceso()))
            equalObjects = false;
        if (equalObjects && !this.getOjeMesProceso().equals(instance.getOjeMesProceso()))
            equalObjects = false;
        if (equalObjects && !this.getOjeDiaProceso().equals(instance.getOjeDiaProceso()))
            equalObjects = false;
        if (equalObjects && !this.getOjeHoraProceso().equals(instance.getOjeHoraProceso()))
            equalObjects = false;
        if (equalObjects && !this.getOjeMinProceso().equals(instance.getOjeMinProceso()))
            equalObjects = false;
        if (equalObjects && !this.getOjeFolioInstrum().equals(instance.getOjeFolioInstrum()))
            equalObjects = false;
        if (equalObjects && !this.getOjeNumUsuario().equals(instance.getOjeNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getOjeAnoAltaReg().equals(instance.getOjeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOjeMesAltaReg().equals(instance.getOjeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOjeDiaAltaReg().equals(instance.getOjeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOjeAnoUltMod().equals(instance.getOjeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOjeMesUltMod().equals(instance.getOjeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOjeDiaUltMod().equals(instance.getOjeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOjeCveStOperaci().equals(instance.getOjeCveStOperaci()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Operejec result = new Operejec();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOjeFolioOpera((BigDecimal) objectData.getData("OJE_FOLIO_OPERA"));
        result.setOjeNumOperacion((BigDecimal) objectData.getData("OJE_NUM_OPERACION"));
        result.setOjeNumSecOpera((BigDecimal) objectData.getData("OJE_NUM_SEC_OPERA"));
        result.setOjeNumModulo((BigDecimal) objectData.getData("OJE_NUM_MODULO"));
        result.setOjeNumTransac((BigDecimal) objectData.getData("OJE_NUM_TRANSAC"));
        result.setOjeAnoEjecucion((BigDecimal) objectData.getData("OJE_ANO_EJECUCION"));
        result.setOjeMesEjecucion((BigDecimal) objectData.getData("OJE_MES_EJECUCION"));
        result.setOjeDiaEjecucion((BigDecimal) objectData.getData("OJE_DIA_EJECUCION"));
        result.setOjeAnoProceso((BigDecimal) objectData.getData("OJE_ANO_PROCESO"));
        result.setOjeMesProceso((BigDecimal) objectData.getData("OJE_MES_PROCESO"));
        result.setOjeDiaProceso((BigDecimal) objectData.getData("OJE_DIA_PROCESO"));
        result.setOjeHoraProceso((BigDecimal) objectData.getData("OJE_HORA_PROCESO"));
        result.setOjeMinProceso((BigDecimal) objectData.getData("OJE_MIN_PROCESO"));
        result.setOjeFolioInstrum((BigDecimal) objectData.getData("OJE_FOLIO_INSTRUM"));
        result.setOjeNumUsuario((BigDecimal) objectData.getData("OJE_NUM_USUARIO"));
        result.setOjeAnoAltaReg((BigDecimal) objectData.getData("OJE_ANO_ALTA_REG"));
        result.setOjeMesAltaReg((BigDecimal) objectData.getData("OJE_MES_ALTA_REG"));
        result.setOjeDiaAltaReg((BigDecimal) objectData.getData("OJE_DIA_ALTA_REG"));
        result.setOjeAnoUltMod((BigDecimal) objectData.getData("OJE_ANO_ULT_MOD"));
        result.setOjeMesUltMod((BigDecimal) objectData.getData("OJE_MES_ULT_MOD"));
        result.setOjeDiaUltMod((BigDecimal) objectData.getData("OJE_DIA_ULT_MOD"));
        result.setOjeCveStOperaci((String) objectData.getData("OJE_CVE_ST_OPERACI"));

        return result;

    }

}
