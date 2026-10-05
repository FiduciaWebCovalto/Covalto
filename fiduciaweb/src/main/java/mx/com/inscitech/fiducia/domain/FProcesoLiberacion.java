package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PROCESO_LIBERACION_PK", columns = { "FPL_ID_FIDEICOMISO", "FPL_ID_SUBCUENTA", "FPL_ID_BIEN", "FPL_ID_EDIFICIO", "FPL_ID_DEPTO" },
            sequences = { "MANUAL" })
public class FProcesoLiberacion extends DomainObject {

    BigDecimal fplIdFideicomiso = null;
    BigDecimal fplIdSubcuenta = null;
    String fplIdBien = null;
    String fplIdEdificio = null;
    String fplIdDepto = null;
    BigDecimal fplNotario = null;
    String fplAdquirente = null;
    String fplTercero = null;
    String fplFideicomBenefici = null;
    String fplNomPersona = null;
    String fplNumLugar = null;
    String fplNomPersona1 = null;
    String fplNumLugar1 = null;
    String fplFidBenSaneamiento = null;
    String fplNomSaneamiento = null;
    String fplNumLugarSaneamiento = null;
    String fplNomSaneamiento1 = null;
    String fplNumLugarSaneamiento1 = null;
    String fplFidBenResponsabilidad = null;
    String fplNomResponsabilidad = null;
    String fplNumLugarResponsabilidad = null;
    String fplNomResponsabilidad1 = null;
    String fplNumLugarResponsabilidad1 = null;
    String fplFidBenOtorgamiento = null;
    String fplNomOtorgamiento = null;
    String fplNumLugarOtorgamiento = null;
    String fplNomOtorgamiento1 = null;
    String fplNumLugarOtorgamiento1 = null;
    String fplTransmisionReversion = null;
    String fplParcialTotal = null;
    BigDecimal fplSujetoRegimen = null;
    String fplTipoInmueble = null;
    String fplNomEnvio = null;
    String fplEmailEnvio = null;
    String fplObservacion = null;
    String fplEscritura = null;
    String fplFecEscritura = null;
    String fplDelegado = null;
    String fplFecFirma = null;
    String fplCveStatus = null;

    public FProcesoLiberacion() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFplIdFideicomiso(BigDecimal fplIdFideicomiso) {
        this.fplIdFideicomiso = fplIdFideicomiso;
    }

    public BigDecimal getFplIdFideicomiso() {
        return this.fplIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFplIdSubcuenta(BigDecimal fplIdSubcuenta) {
        this.fplIdSubcuenta = fplIdSubcuenta;
    }

    public BigDecimal getFplIdSubcuenta() {
        return this.fplIdSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplIdBien(String fplIdBien) {
        this.fplIdBien = fplIdBien;
    }

    public String getFplIdBien() {
        return this.fplIdBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplIdEdificio(String fplIdEdificio) {
        this.fplIdEdificio = fplIdEdificio;
    }

    public String getFplIdEdificio() {
        return this.fplIdEdificio;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplIdDepto(String fplIdDepto) {
        this.fplIdDepto = fplIdDepto;
    }

    public String getFplIdDepto() {
        return this.fplIdDepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFplNotario(BigDecimal fplNotario) {
        this.fplNotario = fplNotario;
    }

    public BigDecimal getFplNotario() {
        return this.fplNotario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplAdquirente(String fplAdquirente) {
        this.fplAdquirente = fplAdquirente;
    }

    public String getFplAdquirente() {
        return this.fplAdquirente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplTercero(String fplTercero) {
        this.fplTercero = fplTercero;
    }

    public String getFplTercero() {
        return this.fplTercero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplFideicomBenefici(String fplFideicomBenefici) {
        this.fplFideicomBenefici = fplFideicomBenefici;
    }

    public String getFplFideicomBenefici() {
        return this.fplFideicomBenefici;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomPersona(String fplNomPersona) {
        this.fplNomPersona = fplNomPersona;
    }

    public String getFplNomPersona() {
        return this.fplNomPersona;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNumLugar(String fplNumLugar) {
        this.fplNumLugar = fplNumLugar;
    }

    public String getFplNumLugar() {
        return this.fplNumLugar;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomPersona1(String fplNomPersona1) {
        this.fplNomPersona1 = fplNomPersona1;
    }

    public String getFplNomPersona1() {
        return this.fplNomPersona1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNumLugar1(String fplNumLugar1) {
        this.fplNumLugar1 = fplNumLugar1;
    }

    public String getFplNumLugar1() {
        return this.fplNumLugar1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplFidBenSaneamiento(String fplFidBenSaneamiento) {
        this.fplFidBenSaneamiento = fplFidBenSaneamiento;
    }

    public String getFplFidBenSaneamiento() {
        return this.fplFidBenSaneamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomSaneamiento(String fplNomSaneamiento) {
        this.fplNomSaneamiento = fplNomSaneamiento;
    }

    public String getFplNomSaneamiento() {
        return this.fplNomSaneamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNumLugarSaneamiento(String fplNumLugarSaneamiento) {
        this.fplNumLugarSaneamiento = fplNumLugarSaneamiento;
    }

    public String getFplNumLugarSaneamiento() {
        return this.fplNumLugarSaneamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomSaneamiento1(String fplNomSaneamiento1) {
        this.fplNomSaneamiento1 = fplNomSaneamiento1;
    }

    public String getFplNomSaneamiento1() {
        return this.fplNomSaneamiento1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNumLugarSaneamiento1(String fplNumLugarSaneamiento1) {
        this.fplNumLugarSaneamiento1 = fplNumLugarSaneamiento1;
    }

    public String getFplNumLugarSaneamiento1() {
        return this.fplNumLugarSaneamiento1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplFidBenResponsabilidad(String fplFidBenResponsabilidad) {
        this.fplFidBenResponsabilidad = fplFidBenResponsabilidad;
    }

    public String getFplFidBenResponsabilidad() {
        return this.fplFidBenResponsabilidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomResponsabilidad(String fplNomResponsabilidad) {
        this.fplNomResponsabilidad = fplNomResponsabilidad;
    }

    public String getFplNomResponsabilidad() {
        return this.fplNomResponsabilidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNumLugarResponsabilidad(String fplNumLugarResponsabilidad) {
        this.fplNumLugarResponsabilidad = fplNumLugarResponsabilidad;
    }

    public String getFplNumLugarResponsabilidad() {
        return this.fplNumLugarResponsabilidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomResponsabilidad1(String fplNomResponsabilidad1) {
        this.fplNomResponsabilidad1 = fplNomResponsabilidad1;
    }

    public String getFplNomResponsabilidad1() {
        return this.fplNomResponsabilidad1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNumLugarResponsabilidad1(String fplNumLugarResponsabilidad1) {
        this.fplNumLugarResponsabilidad1 = fplNumLugarResponsabilidad1;
    }

    public String getFplNumLugarResponsabilidad1() {
        return this.fplNumLugarResponsabilidad1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplFidBenOtorgamiento(String fplFidBenOtorgamiento) {
        this.fplFidBenOtorgamiento = fplFidBenOtorgamiento;
    }

    public String getFplFidBenOtorgamiento() {
        return this.fplFidBenOtorgamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomOtorgamiento(String fplNomOtorgamiento) {
        this.fplNomOtorgamiento = fplNomOtorgamiento;
    }

    public String getFplNomOtorgamiento() {
        return this.fplNomOtorgamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNumLugarOtorgamiento(String fplNumLugarOtorgamiento) {
        this.fplNumLugarOtorgamiento = fplNumLugarOtorgamiento;
    }

    public String getFplNumLugarOtorgamiento() {
        return this.fplNumLugarOtorgamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomOtorgamiento1(String fplNomOtorgamiento1) {
        this.fplNomOtorgamiento1 = fplNomOtorgamiento1;
    }

    public String getFplNomOtorgamiento1() {
        return this.fplNomOtorgamiento1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNumLugarOtorgamiento1(String fplNumLugarOtorgamiento1) {
        this.fplNumLugarOtorgamiento1 = fplNumLugarOtorgamiento1;
    }

    public String getFplNumLugarOtorgamiento1() {
        return this.fplNumLugarOtorgamiento1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplTransmisionReversion(String fplTransmisionReversion) {
        this.fplTransmisionReversion = fplTransmisionReversion;
    }

    public String getFplTransmisionReversion() {
        return this.fplTransmisionReversion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplParcialTotal(String fplParcialTotal) {
        this.fplParcialTotal = fplParcialTotal;
    }

    public String getFplParcialTotal() {
        return this.fplParcialTotal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFplSujetoRegimen(BigDecimal fplSujetoRegimen) {
        this.fplSujetoRegimen = fplSujetoRegimen;
    }

    public BigDecimal getFplSujetoRegimen() {
        return this.fplSujetoRegimen;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplTipoInmueble(String fplTipoInmueble) {
        this.fplTipoInmueble = fplTipoInmueble;
    }

    public String getFplTipoInmueble() {
        return this.fplTipoInmueble;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplNomEnvio(String fplNomEnvio) {
        this.fplNomEnvio = fplNomEnvio;
    }

    public String getFplNomEnvio() {
        return this.fplNomEnvio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplEmailEnvio(String fplEmailEnvio) {
        this.fplEmailEnvio = fplEmailEnvio;
    }

    public String getFplEmailEnvio() {
        return this.fplEmailEnvio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplObservacion(String fplObservacion) {
        this.fplObservacion = fplObservacion;
    }

    public String getFplObservacion() {
        return this.fplObservacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplEscritura(String fplEscritura) {
        this.fplEscritura = fplEscritura;
    }

    public String getFplEscritura() {
        return this.fplEscritura;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFplFecEscritura(String fplFecEscritura) {
        this.fplFecEscritura = fplFecEscritura;
    }

    public String getFplFecEscritura() {
        return this.fplFecEscritura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplDelegado(String fplDelegado) {
        this.fplDelegado = fplDelegado;
    }

    public String getFplDelegado() {
        return this.fplDelegado;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFplFecFirma(String fplFecFirma) {
        this.fplFecFirma = fplFecFirma;
    }

    public String getFplFecFirma() {
        return this.fplFecFirma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplCveStatus(String fplCveStatus) {
        this.fplCveStatus = fplCveStatus;
    }

    public String getFplCveStatus() {
        return this.fplCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PROCESO_LIBERACION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFplIdFideicomiso() != null && this.getFplIdFideicomiso().longValue() == -999) {
            conditions += " AND FPL_ID_FIDEICOMISO IS NULL";
        } else if (this.getFplIdFideicomiso() != null) {
            conditions += " AND FPL_ID_FIDEICOMISO = ?";
            values.add(this.getFplIdFideicomiso());
        }

        if (this.getFplIdSubcuenta() != null && this.getFplIdSubcuenta().longValue() == -999) {
            conditions += " AND FPL_ID_SUBCUENTA IS NULL";
        } else if (this.getFplIdSubcuenta() != null) {
            conditions += " AND FPL_ID_SUBCUENTA = ?";
            values.add(this.getFplIdSubcuenta());
        }

        if (this.getFplIdBien() != null && "null".equals(this.getFplIdBien())) {
            conditions += " AND FPL_ID_BIEN IS NULL";
        } else if (this.getFplIdBien() != null) {
            conditions += " AND FPL_ID_BIEN = ?";
            values.add(this.getFplIdBien());
        }

        if (this.getFplIdEdificio() != null && "null".equals(this.getFplIdEdificio())) {
            conditions += " AND FPL_ID_EDIFICIO IS NULL";
        } else if (this.getFplIdEdificio() != null) {
            conditions += " AND FPL_ID_EDIFICIO = ?";
            values.add(this.getFplIdEdificio());
        }

        if (this.getFplIdDepto() != null && "null".equals(this.getFplIdDepto())) {
            conditions += " AND FPL_ID_DEPTO IS NULL";
        } else if (this.getFplIdDepto() != null) {
            conditions += " AND FPL_ID_DEPTO = ?";
            values.add(this.getFplIdDepto());
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
        String sql = "SELECT * FROM F_PROCESO_LIBERACION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFplIdFideicomiso() != null && this.getFplIdFideicomiso().longValue() == -999) {
            conditions += " AND FPL_ID_FIDEICOMISO IS NULL";
        } else if (this.getFplIdFideicomiso() != null) {
            conditions += " AND FPL_ID_FIDEICOMISO = ?";
            values.add(this.getFplIdFideicomiso());
        }

        if (this.getFplIdSubcuenta() != null && this.getFplIdSubcuenta().longValue() == -999) {
            conditions += " AND FPL_ID_SUBCUENTA IS NULL";
        } else if (this.getFplIdSubcuenta() != null) {
            conditions += " AND FPL_ID_SUBCUENTA = ?";
            values.add(this.getFplIdSubcuenta());
        }

        if (this.getFplIdBien() != null && "null".equals(this.getFplIdBien())) {
            conditions += " AND FPL_ID_BIEN IS NULL";
        } else if (this.getFplIdBien() != null) {
            conditions += " AND FPL_ID_BIEN = ?";
            values.add(this.getFplIdBien());
        }

        if (this.getFplIdEdificio() != null && "null".equals(this.getFplIdEdificio())) {
            conditions += " AND FPL_ID_EDIFICIO IS NULL";
        } else if (this.getFplIdEdificio() != null) {
            conditions += " AND FPL_ID_EDIFICIO = ?";
            values.add(this.getFplIdEdificio());
        }

        if (this.getFplIdDepto() != null && "null".equals(this.getFplIdDepto())) {
            conditions += " AND FPL_ID_DEPTO IS NULL";
        } else if (this.getFplIdDepto() != null) {
            conditions += " AND FPL_ID_DEPTO = ?";
            values.add(this.getFplIdDepto());
        }

        if (this.getFplNotario() != null && this.getFplNotario().longValue() == -999) {
            conditions += " AND FPL_NOTARIO IS NULL";
        } else if (this.getFplNotario() != null) {
            conditions += " AND FPL_NOTARIO = ?";
            values.add(this.getFplNotario());
        }

        if (this.getFplAdquirente() != null && "null".equals(this.getFplAdquirente())) {
            conditions += " AND FPL_ADQUIRENTE IS NULL";
        } else if (this.getFplAdquirente() != null) {
            conditions += " AND FPL_ADQUIRENTE = ?";
            values.add(this.getFplAdquirente());
        }

        if (this.getFplTercero() != null && "null".equals(this.getFplTercero())) {
            conditions += " AND FPL_TERCERO IS NULL";
        } else if (this.getFplTercero() != null) {
            conditions += " AND FPL_TERCERO = ?";
            values.add(this.getFplTercero());
        }

        if (this.getFplFideicomBenefici() != null && "null".equals(this.getFplFideicomBenefici())) {
            conditions += " AND FPL_FIDEICOM_BENEFICI IS NULL";
        } else if (this.getFplFideicomBenefici() != null) {
            conditions += " AND FPL_FIDEICOM_BENEFICI = ?";
            values.add(this.getFplFideicomBenefici());
        }

        if (this.getFplNomPersona() != null && "null".equals(this.getFplNomPersona())) {
            conditions += " AND FPL_NOM_PERSONA IS NULL";
        } else if (this.getFplNomPersona() != null) {
            conditions += " AND FPL_NOM_PERSONA = ?";
            values.add(this.getFplNomPersona());
        }

        if (this.getFplNumLugar() != null && "null".equals(this.getFplNumLugar())) {
            conditions += " AND FPL_NUM_LUGAR IS NULL";
        } else if (this.getFplNumLugar() != null) {
            conditions += " AND FPL_NUM_LUGAR = ?";
            values.add(this.getFplNumLugar());
        }

        if (this.getFplNomPersona1() != null && "null".equals(this.getFplNomPersona1())) {
            conditions += " AND FPL_NOM_PERSONA1 IS NULL";
        } else if (this.getFplNomPersona1() != null) {
            conditions += " AND FPL_NOM_PERSONA1 = ?";
            values.add(this.getFplNomPersona1());
        }

        if (this.getFplNumLugar1() != null && "null".equals(this.getFplNumLugar1())) {
            conditions += " AND FPL_NUM_LUGAR1 IS NULL";
        } else if (this.getFplNumLugar1() != null) {
            conditions += " AND FPL_NUM_LUGAR1 = ?";
            values.add(this.getFplNumLugar1());
        }

        if (this.getFplFidBenSaneamiento() != null && "null".equals(this.getFplFidBenSaneamiento())) {
            conditions += " AND FPL_FID_BEN_SANEAMIENTO IS NULL";
        } else if (this.getFplFidBenSaneamiento() != null) {
            conditions += " AND FPL_FID_BEN_SANEAMIENTO = ?";
            values.add(this.getFplFidBenSaneamiento());
        }

        if (this.getFplNomSaneamiento() != null && "null".equals(this.getFplNomSaneamiento())) {
            conditions += " AND FPL_NOM_SANEAMIENTO IS NULL";
        } else if (this.getFplNomSaneamiento() != null) {
            conditions += " AND FPL_NOM_SANEAMIENTO = ?";
            values.add(this.getFplNomSaneamiento());
        }

        if (this.getFplNumLugarSaneamiento() != null && "null".equals(this.getFplNumLugarSaneamiento())) {
            conditions += " AND FPL_NUM_LUGAR_SANEAMIENTO IS NULL";
        } else if (this.getFplNumLugarSaneamiento() != null) {
            conditions += " AND FPL_NUM_LUGAR_SANEAMIENTO = ?";
            values.add(this.getFplNumLugarSaneamiento());
        }

        if (this.getFplNomSaneamiento1() != null && "null".equals(this.getFplNomSaneamiento1())) {
            conditions += " AND FPL_NOM_SANEAMIENTO1 IS NULL";
        } else if (this.getFplNomSaneamiento1() != null) {
            conditions += " AND FPL_NOM_SANEAMIENTO1 = ?";
            values.add(this.getFplNomSaneamiento1());
        }

        if (this.getFplNumLugarSaneamiento1() != null && "null".equals(this.getFplNumLugarSaneamiento1())) {
            conditions += " AND FPL_NUM_LUGAR_SANEAMIENTO1 IS NULL";
        } else if (this.getFplNumLugarSaneamiento1() != null) {
            conditions += " AND FPL_NUM_LUGAR_SANEAMIENTO1 = ?";
            values.add(this.getFplNumLugarSaneamiento1());
        }

        if (this.getFplFidBenResponsabilidad() != null && "null".equals(this.getFplFidBenResponsabilidad())) {
            conditions += " AND FPL_FID_BEN_RESPONSABILIDAD IS NULL";
        } else if (this.getFplFidBenResponsabilidad() != null) {
            conditions += " AND FPL_FID_BEN_RESPONSABILIDAD = ?";
            values.add(this.getFplFidBenResponsabilidad());
        }

        if (this.getFplNomResponsabilidad() != null && "null".equals(this.getFplNomResponsabilidad())) {
            conditions += " AND FPL_NOM_RESPONSABILIDAD IS NULL";
        } else if (this.getFplNomResponsabilidad() != null) {
            conditions += " AND FPL_NOM_RESPONSABILIDAD = ?";
            values.add(this.getFplNomResponsabilidad());
        }

        if (this.getFplNumLugarResponsabilidad() != null && "null".equals(this.getFplNumLugarResponsabilidad())) {
            conditions += " AND FPL_NUM_LUGAR_RESPONSABILIDAD IS NULL";
        } else if (this.getFplNumLugarResponsabilidad() != null) {
            conditions += " AND FPL_NUM_LUGAR_RESPONSABILIDAD = ?";
            values.add(this.getFplNumLugarResponsabilidad());
        }

        if (this.getFplNomResponsabilidad1() != null && "null".equals(this.getFplNomResponsabilidad1())) {
            conditions += " AND FPL_NOM_RESPONSABILIDAD1 IS NULL";
        } else if (this.getFplNomResponsabilidad1() != null) {
            conditions += " AND FPL_NOM_RESPONSABILIDAD1 = ?";
            values.add(this.getFplNomResponsabilidad1());
        }

        if (this.getFplNumLugarResponsabilidad1() != null && "null".equals(this.getFplNumLugarResponsabilidad1())) {
            conditions += " AND FPL_NUM_LUGAR_RESPONSABILIDAD1 IS NULL";
        } else if (this.getFplNumLugarResponsabilidad1() != null) {
            conditions += " AND FPL_NUM_LUGAR_RESPONSABILIDAD1 = ?";
            values.add(this.getFplNumLugarResponsabilidad1());
        }

        if (this.getFplFidBenOtorgamiento() != null && "null".equals(this.getFplFidBenOtorgamiento())) {
            conditions += " AND FPL_FID_BEN_OTORGAMIENTO IS NULL";
        } else if (this.getFplFidBenOtorgamiento() != null) {
            conditions += " AND FPL_FID_BEN_OTORGAMIENTO = ?";
            values.add(this.getFplFidBenOtorgamiento());
        }

        if (this.getFplNomOtorgamiento() != null && "null".equals(this.getFplNomOtorgamiento())) {
            conditions += " AND FPL_NOM_OTORGAMIENTO IS NULL";
        } else if (this.getFplNomOtorgamiento() != null) {
            conditions += " AND FPL_NOM_OTORGAMIENTO = ?";
            values.add(this.getFplNomOtorgamiento());
        }

        if (this.getFplNumLugarOtorgamiento() != null && "null".equals(this.getFplNumLugarOtorgamiento())) {
            conditions += " AND FPL_NUM_LUGAR_OTORGAMIENTO IS NULL";
        } else if (this.getFplNumLugarOtorgamiento() != null) {
            conditions += " AND FPL_NUM_LUGAR_OTORGAMIENTO = ?";
            values.add(this.getFplNumLugarOtorgamiento());
        }

        if (this.getFplNomOtorgamiento1() != null && "null".equals(this.getFplNomOtorgamiento1())) {
            conditions += " AND FPL_NOM_OTORGAMIENTO1 IS NULL";
        } else if (this.getFplNomOtorgamiento1() != null) {
            conditions += " AND FPL_NOM_OTORGAMIENTO1 = ?";
            values.add(this.getFplNomOtorgamiento1());
        }

        if (this.getFplNumLugarOtorgamiento1() != null && "null".equals(this.getFplNumLugarOtorgamiento1())) {
            conditions += " AND FPL_NUM_LUGAR_OTORGAMIENTO1 IS NULL";
        } else if (this.getFplNumLugarOtorgamiento1() != null) {
            conditions += " AND FPL_NUM_LUGAR_OTORGAMIENTO1 = ?";
            values.add(this.getFplNumLugarOtorgamiento1());
        }

        if (this.getFplTransmisionReversion() != null && "null".equals(this.getFplTransmisionReversion())) {
            conditions += " AND FPL_TRANSMISION_REVERSION IS NULL";
        } else if (this.getFplTransmisionReversion() != null) {
            conditions += " AND FPL_TRANSMISION_REVERSION = ?";
            values.add(this.getFplTransmisionReversion());
        }

        if (this.getFplParcialTotal() != null && "null".equals(this.getFplParcialTotal())) {
            conditions += " AND FPL_PARCIAL_TOTAL IS NULL";
        } else if (this.getFplParcialTotal() != null) {
            conditions += " AND FPL_PARCIAL_TOTAL = ?";
            values.add(this.getFplParcialTotal());
        }

        if (this.getFplSujetoRegimen() != null && this.getFplSujetoRegimen().longValue() == -999) {
            conditions += " AND FPL_SUJETO_REGIMEN IS NULL";
        } else if (this.getFplSujetoRegimen() != null) {
            conditions += " AND FPL_SUJETO_REGIMEN = ?";
            values.add(this.getFplSujetoRegimen());
        }

        if (this.getFplTipoInmueble() != null && "null".equals(this.getFplTipoInmueble())) {
            conditions += " AND FPL_TIPO_INMUEBLE IS NULL";
        } else if (this.getFplTipoInmueble() != null) {
            conditions += " AND FPL_TIPO_INMUEBLE = ?";
            values.add(this.getFplTipoInmueble());
        }

        if (this.getFplNomEnvio() != null && "null".equals(this.getFplNomEnvio())) {
            conditions += " AND FPL_NOM_ENVIO IS NULL";
        } else if (this.getFplNomEnvio() != null) {
            conditions += " AND FPL_NOM_ENVIO = ?";
            values.add(this.getFplNomEnvio());
        }

        if (this.getFplEmailEnvio() != null && "null".equals(this.getFplEmailEnvio())) {
            conditions += " AND FPL_EMAIL_ENVIO IS NULL";
        } else if (this.getFplEmailEnvio() != null) {
            conditions += " AND FPL_EMAIL_ENVIO = ?";
            values.add(this.getFplEmailEnvio());
        }

        if (this.getFplObservacion() != null && "null".equals(this.getFplObservacion())) {
            conditions += " AND FPL_OBSERVACION IS NULL";
        } else if (this.getFplObservacion() != null) {
            conditions += " AND FPL_OBSERVACION = ?";
            values.add(this.getFplObservacion());
        }

        if (this.getFplEscritura() != null && "null".equals(this.getFplEscritura())) {
            conditions += " AND FPL_ESCRITURA IS NULL";
        } else if (this.getFplEscritura() != null) {
            conditions += " AND FPL_ESCRITURA = ?";
            values.add(this.getFplEscritura());
        }

        if (this.getFplFecEscritura() != null && "null".equals(this.getFplFecEscritura())) {
            conditions += " AND FPL_FEC_ESCRITURA IS NULL";
        } else if (this.getFplFecEscritura() != null) {
            conditions += " AND FPL_FEC_ESCRITURA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFplFecEscritura());
        }

        if (this.getFplDelegado() != null && "null".equals(this.getFplDelegado())) {
            conditions += " AND FPL_DELEGADO IS NULL";
        } else if (this.getFplDelegado() != null) {
            conditions += " AND FPL_DELEGADO = ?";
            values.add(this.getFplDelegado());
        }

        if (this.getFplFecFirma() != null && "null".equals(this.getFplFecFirma())) {
            conditions += " AND FPL_FEC_FIRMA IS NULL";
        } else if (this.getFplFecFirma() != null) {
            conditions += " AND FPL_FEC_FIRMA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFplFecFirma());
        }

        if (this.getFplCveStatus() != null && "null".equals(this.getFplCveStatus())) {
            conditions += " AND FPL_CVE_STATUS IS NULL";
        } else if (this.getFplCveStatus() != null) {
            conditions += " AND FPL_CVE_STATUS = ?";
            values.add(this.getFplCveStatus());
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
        String sql = "UPDATE F_PROCESO_LIBERACION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPL_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFplIdFideicomiso());
        conditions += " AND FPL_ID_SUBCUENTA = ?";
        pkValues.add(this.getFplIdSubcuenta());
        conditions += " AND FPL_ID_BIEN = ?";
        pkValues.add(this.getFplIdBien());
        conditions += " AND FPL_ID_EDIFICIO = ?";
        pkValues.add(this.getFplIdEdificio());
        conditions += " AND FPL_ID_DEPTO = ?";
        pkValues.add(this.getFplIdDepto());
        fields += " FPL_NOTARIO = ?, ";
        values.add(this.getFplNotario());
        fields += " FPL_ADQUIRENTE = ?, ";
        values.add(this.getFplAdquirente());
        fields += " FPL_TERCERO = ?, ";
        values.add(this.getFplTercero());
        fields += " FPL_FIDEICOM_BENEFICI = ?, ";
        values.add(this.getFplFideicomBenefici());
        fields += " FPL_NOM_PERSONA = ?, ";
        values.add(this.getFplNomPersona());
        fields += " FPL_NUM_LUGAR = ?, ";
        values.add(this.getFplNumLugar());
        fields += " FPL_NOM_PERSONA1 = ?, ";
        values.add(this.getFplNomPersona1());
        fields += " FPL_NUM_LUGAR1 = ?, ";
        values.add(this.getFplNumLugar1());
        fields += " FPL_FID_BEN_SANEAMIENTO = ?, ";
        values.add(this.getFplFidBenSaneamiento());
        fields += " FPL_NOM_SANEAMIENTO = ?, ";
        values.add(this.getFplNomSaneamiento());
        fields += " FPL_NUM_LUGAR_SANEAMIENTO = ?, ";
        values.add(this.getFplNumLugarSaneamiento());
        fields += " FPL_NOM_SANEAMIENTO1 = ?, ";
        values.add(this.getFplNomSaneamiento1());
        fields += " FPL_NUM_LUGAR_SANEAMIENTO1 = ?, ";
        values.add(this.getFplNumLugarSaneamiento1());
        fields += " FPL_FID_BEN_RESPONSABILIDAD = ?, ";
        values.add(this.getFplFidBenResponsabilidad());
        fields += " FPL_NOM_RESPONSABILIDAD = ?, ";
        values.add(this.getFplNomResponsabilidad());
        fields += " FPL_NUM_LUGAR_RESPONSABILIDAD = ?, ";
        values.add(this.getFplNumLugarResponsabilidad());
        fields += " FPL_NOM_RESPONSABILIDAD1 = ?, ";
        values.add(this.getFplNomResponsabilidad1());
        fields += " FPL_NUM_LUGAR_RESPONSABILIDAD1 = ?, ";
        values.add(this.getFplNumLugarResponsabilidad1());
        fields += " FPL_FID_BEN_OTORGAMIENTO = ?, ";
        values.add(this.getFplFidBenOtorgamiento());
        fields += " FPL_NOM_OTORGAMIENTO = ?, ";
        values.add(this.getFplNomOtorgamiento());
        fields += " FPL_NUM_LUGAR_OTORGAMIENTO = ?, ";
        values.add(this.getFplNumLugarOtorgamiento());
        fields += " FPL_NOM_OTORGAMIENTO1 = ?, ";
        values.add(this.getFplNomOtorgamiento1());
        fields += " FPL_NUM_LUGAR_OTORGAMIENTO1 = ?, ";
        values.add(this.getFplNumLugarOtorgamiento1());
        fields += " FPL_TRANSMISION_REVERSION = ?, ";
        values.add(this.getFplTransmisionReversion());
        fields += " FPL_PARCIAL_TOTAL = ?, ";
        values.add(this.getFplParcialTotal());
        fields += " FPL_SUJETO_REGIMEN = ?, ";
        values.add(this.getFplSujetoRegimen());
        fields += " FPL_TIPO_INMUEBLE = ?, ";
        values.add(this.getFplTipoInmueble());
        fields += " FPL_NOM_ENVIO = ?, ";
        values.add(this.getFplNomEnvio());
        fields += " FPL_EMAIL_ENVIO = ?, ";
        values.add(this.getFplEmailEnvio());
        fields += " FPL_OBSERVACION = ?, ";
        values.add(this.getFplObservacion());
        fields += " FPL_ESCRITURA = ?, ";
        values.add(this.getFplEscritura());
        fields += " FPL_FEC_ESCRITURA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFplFecEscritura());
        fields += " FPL_DELEGADO = ?, ";
        values.add(this.getFplDelegado());
        fields += " FPL_FEC_FIRMA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFplFecFirma());
        fields += " FPL_CVE_STATUS = ?, ";
        values.add(this.getFplCveStatus());
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
        String sql = "INSERT INTO F_PROCESO_LIBERACION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPL_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFplIdFideicomiso());

        fields += ", FPL_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFplIdSubcuenta());

        fields += ", FPL_ID_BIEN";
        fieldValues += ", ?";
        values.add(this.getFplIdBien());

        fields += ", FPL_ID_EDIFICIO";
        fieldValues += ", ?";
        values.add(this.getFplIdEdificio());

        fields += ", FPL_ID_DEPTO";
        fieldValues += ", ?";
        values.add(this.getFplIdDepto());

        fields += ", FPL_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getFplNotario());

        fields += ", FPL_ADQUIRENTE";
        fieldValues += ", ?";
        values.add(this.getFplAdquirente());

        fields += ", FPL_TERCERO";
        fieldValues += ", ?";
        values.add(this.getFplTercero());

        fields += ", FPL_FIDEICOM_BENEFICI";
        fieldValues += ", ?";
        values.add(this.getFplFideicomBenefici());

        fields += ", FPL_NOM_PERSONA";
        fieldValues += ", ?";
        values.add(this.getFplNomPersona());

        fields += ", FPL_NUM_LUGAR";
        fieldValues += ", ?";
        values.add(this.getFplNumLugar());

        fields += ", FPL_NOM_PERSONA1";
        fieldValues += ", ?";
        values.add(this.getFplNomPersona1());

        fields += ", FPL_NUM_LUGAR1";
        fieldValues += ", ?";
        values.add(this.getFplNumLugar1());

        fields += ", FPL_FID_BEN_SANEAMIENTO";
        fieldValues += ", ?";
        values.add(this.getFplFidBenSaneamiento());

        fields += ", FPL_NOM_SANEAMIENTO";
        fieldValues += ", ?";
        values.add(this.getFplNomSaneamiento());

        fields += ", FPL_NUM_LUGAR_SANEAMIENTO";
        fieldValues += ", ?";
        values.add(this.getFplNumLugarSaneamiento());

        fields += ", FPL_NOM_SANEAMIENTO1";
        fieldValues += ", ?";
        values.add(this.getFplNomSaneamiento1());

        fields += ", FPL_NUM_LUGAR_SANEAMIENTO1";
        fieldValues += ", ?";
        values.add(this.getFplNumLugarSaneamiento1());

        fields += ", FPL_FID_BEN_RESPONSABILIDAD";
        fieldValues += ", ?";
        values.add(this.getFplFidBenResponsabilidad());

        fields += ", FPL_NOM_RESPONSABILIDAD";
        fieldValues += ", ?";
        values.add(this.getFplNomResponsabilidad());

        fields += ", FPL_NUM_LUGAR_RESPONSABILIDAD";
        fieldValues += ", ?";
        values.add(this.getFplNumLugarResponsabilidad());

        fields += ", FPL_NOM_RESPONSABILIDAD1";
        fieldValues += ", ?";
        values.add(this.getFplNomResponsabilidad1());

        fields += ", FPL_NUM_LUGAR_RESPONSABILIDAD1";
        fieldValues += ", ?";
        values.add(this.getFplNumLugarResponsabilidad1());

        fields += ", FPL_FID_BEN_OTORGAMIENTO";
        fieldValues += ", ?";
        values.add(this.getFplFidBenOtorgamiento());

        fields += ", FPL_NOM_OTORGAMIENTO";
        fieldValues += ", ?";
        values.add(this.getFplNomOtorgamiento());

        fields += ", FPL_NUM_LUGAR_OTORGAMIENTO";
        fieldValues += ", ?";
        values.add(this.getFplNumLugarOtorgamiento());

        fields += ", FPL_NOM_OTORGAMIENTO1";
        fieldValues += ", ?";
        values.add(this.getFplNomOtorgamiento1());

        fields += ", FPL_NUM_LUGAR_OTORGAMIENTO1";
        fieldValues += ", ?";
        values.add(this.getFplNumLugarOtorgamiento1());

        fields += ", FPL_TRANSMISION_REVERSION";
        fieldValues += ", ?";
        values.add(this.getFplTransmisionReversion());

        fields += ", FPL_PARCIAL_TOTAL";
        fieldValues += ", ?";
        values.add(this.getFplParcialTotal());

        fields += ", FPL_SUJETO_REGIMEN";
        fieldValues += ", ?";
        values.add(this.getFplSujetoRegimen());

        fields += ", FPL_TIPO_INMUEBLE";
        fieldValues += ", ?";
        values.add(this.getFplTipoInmueble());

        fields += ", FPL_NOM_ENVIO";
        fieldValues += ", ?";
        values.add(this.getFplNomEnvio());

        fields += ", FPL_EMAIL_ENVIO";
        fieldValues += ", ?";
        values.add(this.getFplEmailEnvio());

        fields += ", FPL_OBSERVACION";
        fieldValues += ", ?";
        values.add(this.getFplObservacion());

        fields += ", FPL_ESCRITURA";
        fieldValues += ", ?";
        values.add(this.getFplEscritura());

        fields += ", FPL_FEC_ESCRITURA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFplFecEscritura());

        fields += ", FPL_DELEGADO";
        fieldValues += ", ?";
        values.add(this.getFplDelegado());

        fields += ", FPL_FEC_FIRMA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFplFecFirma());

        fields += ", FPL_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getFplCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PROCESO_LIBERACION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPL_ID_FIDEICOMISO = ?";
        values.add(this.getFplIdFideicomiso());
        conditions += " AND FPL_ID_SUBCUENTA = ?";
        values.add(this.getFplIdSubcuenta());
        conditions += " AND FPL_ID_BIEN = ?";
        values.add(this.getFplIdBien());
        conditions += " AND FPL_ID_EDIFICIO = ?";
        values.add(this.getFplIdEdificio());
        conditions += " AND FPL_ID_DEPTO = ?";
        values.add(this.getFplIdDepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FProcesoLiberacion instance = (FProcesoLiberacion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFplIdFideicomiso().equals(instance.getFplIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFplIdSubcuenta().equals(instance.getFplIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFplIdBien().equals(instance.getFplIdBien()))
            equalObjects = false;
        if (equalObjects && !this.getFplIdEdificio().equals(instance.getFplIdEdificio()))
            equalObjects = false;
        if (equalObjects && !this.getFplIdDepto().equals(instance.getFplIdDepto()))
            equalObjects = false;
        if (equalObjects && !this.getFplNotario().equals(instance.getFplNotario()))
            equalObjects = false;
        if (equalObjects && !this.getFplAdquirente().equals(instance.getFplAdquirente()))
            equalObjects = false;
        if (equalObjects && !this.getFplTercero().equals(instance.getFplTercero()))
            equalObjects = false;
        if (equalObjects && !this.getFplFideicomBenefici().equals(instance.getFplFideicomBenefici()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomPersona().equals(instance.getFplNomPersona()))
            equalObjects = false;
        if (equalObjects && !this.getFplNumLugar().equals(instance.getFplNumLugar()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomPersona1().equals(instance.getFplNomPersona1()))
            equalObjects = false;
        if (equalObjects && !this.getFplNumLugar1().equals(instance.getFplNumLugar1()))
            equalObjects = false;
        if (equalObjects && !this.getFplFidBenSaneamiento().equals(instance.getFplFidBenSaneamiento()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomSaneamiento().equals(instance.getFplNomSaneamiento()))
            equalObjects = false;
        if (equalObjects && !this.getFplNumLugarSaneamiento().equals(instance.getFplNumLugarSaneamiento()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomSaneamiento1().equals(instance.getFplNomSaneamiento1()))
            equalObjects = false;
        if (equalObjects && !this.getFplNumLugarSaneamiento1().equals(instance.getFplNumLugarSaneamiento1()))
            equalObjects = false;
        if (equalObjects && !this.getFplFidBenResponsabilidad().equals(instance.getFplFidBenResponsabilidad()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomResponsabilidad().equals(instance.getFplNomResponsabilidad()))
            equalObjects = false;
        if (equalObjects && !this.getFplNumLugarResponsabilidad().equals(instance.getFplNumLugarResponsabilidad()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomResponsabilidad1().equals(instance.getFplNomResponsabilidad1()))
            equalObjects = false;
        if (equalObjects && !this.getFplNumLugarResponsabilidad1().equals(instance.getFplNumLugarResponsabilidad1()))
            equalObjects = false;
        if (equalObjects && !this.getFplFidBenOtorgamiento().equals(instance.getFplFidBenOtorgamiento()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomOtorgamiento().equals(instance.getFplNomOtorgamiento()))
            equalObjects = false;
        if (equalObjects && !this.getFplNumLugarOtorgamiento().equals(instance.getFplNumLugarOtorgamiento()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomOtorgamiento1().equals(instance.getFplNomOtorgamiento1()))
            equalObjects = false;
        if (equalObjects && !this.getFplNumLugarOtorgamiento1().equals(instance.getFplNumLugarOtorgamiento1()))
            equalObjects = false;
        if (equalObjects && !this.getFplTransmisionReversion().equals(instance.getFplTransmisionReversion()))
            equalObjects = false;
        if (equalObjects && !this.getFplParcialTotal().equals(instance.getFplParcialTotal()))
            equalObjects = false;
        if (equalObjects && !this.getFplSujetoRegimen().equals(instance.getFplSujetoRegimen()))
            equalObjects = false;
        if (equalObjects && !this.getFplTipoInmueble().equals(instance.getFplTipoInmueble()))
            equalObjects = false;
        if (equalObjects && !this.getFplNomEnvio().equals(instance.getFplNomEnvio()))
            equalObjects = false;
        if (equalObjects && !this.getFplEmailEnvio().equals(instance.getFplEmailEnvio()))
            equalObjects = false;
        if (equalObjects && !this.getFplObservacion().equals(instance.getFplObservacion()))
            equalObjects = false;
        if (equalObjects && !this.getFplEscritura().equals(instance.getFplEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getFplFecEscritura().equals(instance.getFplFecEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getFplDelegado().equals(instance.getFplDelegado()))
            equalObjects = false;
        if (equalObjects && !this.getFplFecFirma().equals(instance.getFplFecFirma()))
            equalObjects = false;
        if (equalObjects && !this.getFplCveStatus().equals(instance.getFplCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FProcesoLiberacion result = new FProcesoLiberacion();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFplIdFideicomiso((BigDecimal) objectData.getData("FPL_ID_FIDEICOMISO"));
        result.setFplIdSubcuenta((BigDecimal) objectData.getData("FPL_ID_SUBCUENTA"));
        result.setFplIdBien((String) objectData.getData("FPL_ID_BIEN"));
        result.setFplIdEdificio((String) objectData.getData("FPL_ID_EDIFICIO"));
        result.setFplIdDepto((String) objectData.getData("FPL_ID_DEPTO"));
        result.setFplNotario((BigDecimal) objectData.getData("FPL_NOTARIO"));
        result.setFplAdquirente((String) objectData.getData("FPL_ADQUIRENTE"));
        result.setFplTercero((String) objectData.getData("FPL_TERCERO"));
        result.setFplFideicomBenefici((String) objectData.getData("FPL_FIDEICOM_BENEFICI"));
        result.setFplNomPersona((String) objectData.getData("FPL_NOM_PERSONA"));
        result.setFplNumLugar((String) objectData.getData("FPL_NUM_LUGAR"));
        result.setFplNomPersona1((String) objectData.getData("FPL_NOM_PERSONA1"));
        result.setFplNumLugar1((String) objectData.getData("FPL_NUM_LUGAR1"));
        result.setFplFidBenSaneamiento((String) objectData.getData("FPL_FID_BEN_SANEAMIENTO"));
        result.setFplNomSaneamiento((String) objectData.getData("FPL_NOM_SANEAMIENTO"));
        result.setFplNumLugarSaneamiento((String) objectData.getData("FPL_NUM_LUGAR_SANEAMIENTO"));
        result.setFplNomSaneamiento1((String) objectData.getData("FPL_NOM_SANEAMIENTO1"));
        result.setFplNumLugarSaneamiento1((String) objectData.getData("FPL_NUM_LUGAR_SANEAMIENTO1"));
        result.setFplFidBenResponsabilidad((String) objectData.getData("FPL_FID_BEN_RESPONSABILIDAD"));
        result.setFplNomResponsabilidad((String) objectData.getData("FPL_NOM_RESPONSABILIDAD"));
        result.setFplNumLugarResponsabilidad((String) objectData.getData("FPL_NUM_LUGAR_RESPONSABILIDAD"));
        result.setFplNomResponsabilidad1((String) objectData.getData("FPL_NOM_RESPONSABILIDAD1"));
        result.setFplNumLugarResponsabilidad1((String) objectData.getData("FPL_NUM_LUGAR_RESPONSABILIDAD1"));
        result.setFplFidBenOtorgamiento((String) objectData.getData("FPL_FID_BEN_OTORGAMIENTO"));
        result.setFplNomOtorgamiento((String) objectData.getData("FPL_NOM_OTORGAMIENTO"));
        result.setFplNumLugarOtorgamiento((String) objectData.getData("FPL_NUM_LUGAR_OTORGAMIENTO"));
        result.setFplNomOtorgamiento1((String) objectData.getData("FPL_NOM_OTORGAMIENTO1"));
        result.setFplNumLugarOtorgamiento1((String) objectData.getData("FPL_NUM_LUGAR_OTORGAMIENTO1"));
        result.setFplTransmisionReversion((String) objectData.getData("FPL_TRANSMISION_REVERSION"));
        result.setFplParcialTotal((String) objectData.getData("FPL_PARCIAL_TOTAL"));
        result.setFplSujetoRegimen((BigDecimal) objectData.getData("FPL_SUJETO_REGIMEN"));
        result.setFplTipoInmueble((String) objectData.getData("FPL_TIPO_INMUEBLE"));
        result.setFplNomEnvio((String) objectData.getData("FPL_NOM_ENVIO"));
        result.setFplEmailEnvio((String) objectData.getData("FPL_EMAIL_ENVIO"));
        result.setFplObservacion((String) objectData.getData("FPL_OBSERVACION"));
        result.setFplEscritura((String) objectData.getData("FPL_ESCRITURA"));
        result.setFplFecEscritura((String) objectData.getData("FPL_FEC_ESCRITURA"));
        result.setFplDelegado((String) objectData.getData("FPL_DELEGADO"));
        result.setFplFecFirma((String) objectData.getData("FPL_FEC_FIRMA"));
        result.setFplCveStatus((String) objectData.getData("FPL_CVE_STATUS"));

        return result;

    }

}
