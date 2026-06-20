package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CARTA_LIBERACION_PK", columns = { "FLIB_ID_FIDEICOMISO", "FLIB_ID_SUBCUENTA", "FLIB_ID_BIEN", "FLIB_ID_EDIFICIO", "FLIB_ID_DEPTO" },
            sequences = { "MANUAL" })
public class FCartaLiberacion extends DomainObject {

    BigDecimal flibIdFideicomiso = null;
    BigDecimal flibIdSubcuenta = null;
    String flibIdBien = null;
    String flibIdEdificio = null;
    String flibIdDepto = null;
    String flibNomEmpresa = null;
    String flibNomArea = null;
    String flibDireccion = null;
    String flibSitio = null;
    String flibFecha = null;
    String flibNomNotario = null;
    String flibNomPuesto = null;
    String flibDescFidBen = null;
    String flibDescSaneamiento = null;
    String flibDescResponsabilidad = null;
    String flibDescOtorgamiento = null;
    String flibTransmisionReversion = null;
    String flibParcialTotal = null;
    String flibDescripcionInmueble = null;
    BigDecimal flibSujetoRegimen = null;
    String flibDescripcionRegimen1 = null;
    String flibDescripcionRegimen2 = null;
    String flibDescripcionRegimen3 = null;
    String flibNomAdquirente = null;
    String flibNomCalle = null;
    String flibNomColonia = null;
    String flibDelegacionMunicipio = null;
    String flibNomPoblacion = null;
    String flibNomEstado = null;
    String flibTipoInmueble = null;
    BigDecimal flibIndiviso = null;
    String flibNumEscritura = null;
    String flibNomEnvio = null;
    String flibEmailEnvio = null;
    String flibObservacion = null;
    String flibNomDelegado = null;
    String flibNomFirma = null;

    public FCartaLiberacion() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlibIdFideicomiso(BigDecimal flibIdFideicomiso) {
        this.flibIdFideicomiso = flibIdFideicomiso;
    }

    public BigDecimal getFlibIdFideicomiso() {
        return this.flibIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlibIdSubcuenta(BigDecimal flibIdSubcuenta) {
        this.flibIdSubcuenta = flibIdSubcuenta;
    }

    public BigDecimal getFlibIdSubcuenta() {
        return this.flibIdSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibIdBien(String flibIdBien) {
        this.flibIdBien = flibIdBien;
    }

    public String getFlibIdBien() {
        return this.flibIdBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibIdEdificio(String flibIdEdificio) {
        this.flibIdEdificio = flibIdEdificio;
    }

    public String getFlibIdEdificio() {
        return this.flibIdEdificio;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibIdDepto(String flibIdDepto) {
        this.flibIdDepto = flibIdDepto;
    }

    public String getFlibIdDepto() {
        return this.flibIdDepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomEmpresa(String flibNomEmpresa) {
        this.flibNomEmpresa = flibNomEmpresa;
    }

    public String getFlibNomEmpresa() {
        return this.flibNomEmpresa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomArea(String flibNomArea) {
        this.flibNomArea = flibNomArea;
    }

    public String getFlibNomArea() {
        return this.flibNomArea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDireccion(String flibDireccion) {
        this.flibDireccion = flibDireccion;
    }

    public String getFlibDireccion() {
        return this.flibDireccion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibSitio(String flibSitio) {
        this.flibSitio = flibSitio;
    }

    public String getFlibSitio() {
        return this.flibSitio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFlibFecha(String flibFecha) {
        this.flibFecha = flibFecha;
    }

    public String getFlibFecha() {
        return this.flibFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomNotario(String flibNomNotario) {
        this.flibNomNotario = flibNomNotario;
    }

    public String getFlibNomNotario() {
        return this.flibNomNotario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomPuesto(String flibNomPuesto) {
        this.flibNomPuesto = flibNomPuesto;
    }

    public String getFlibNomPuesto() {
        return this.flibNomPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDescFidBen(String flibDescFidBen) {
        this.flibDescFidBen = flibDescFidBen;
    }

    public String getFlibDescFidBen() {
        return this.flibDescFidBen;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDescSaneamiento(String flibDescSaneamiento) {
        this.flibDescSaneamiento = flibDescSaneamiento;
    }

    public String getFlibDescSaneamiento() {
        return this.flibDescSaneamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDescResponsabilidad(String flibDescResponsabilidad) {
        this.flibDescResponsabilidad = flibDescResponsabilidad;
    }

    public String getFlibDescResponsabilidad() {
        return this.flibDescResponsabilidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDescOtorgamiento(String flibDescOtorgamiento) {
        this.flibDescOtorgamiento = flibDescOtorgamiento;
    }

    public String getFlibDescOtorgamiento() {
        return this.flibDescOtorgamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibTransmisionReversion(String flibTransmisionReversion) {
        this.flibTransmisionReversion = flibTransmisionReversion;
    }

    public String getFlibTransmisionReversion() {
        return this.flibTransmisionReversion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibParcialTotal(String flibParcialTotal) {
        this.flibParcialTotal = flibParcialTotal;
    }

    public String getFlibParcialTotal() {
        return this.flibParcialTotal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDescripcionInmueble(String flibDescripcionInmueble) {
        this.flibDescripcionInmueble = flibDescripcionInmueble;
    }

    public String getFlibDescripcionInmueble() {
        return this.flibDescripcionInmueble;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlibSujetoRegimen(BigDecimal flibSujetoRegimen) {
        this.flibSujetoRegimen = flibSujetoRegimen;
    }

    public BigDecimal getFlibSujetoRegimen() {
        return this.flibSujetoRegimen;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDescripcionRegimen1(String flibDescripcionRegimen1) {
        this.flibDescripcionRegimen1 = flibDescripcionRegimen1;
    }

    public String getFlibDescripcionRegimen1() {
        return this.flibDescripcionRegimen1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDescripcionRegimen2(String flibDescripcionRegimen2) {
        this.flibDescripcionRegimen2 = flibDescripcionRegimen2;
    }

    public String getFlibDescripcionRegimen2() {
        return this.flibDescripcionRegimen2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDescripcionRegimen3(String flibDescripcionRegimen3) {
        this.flibDescripcionRegimen3 = flibDescripcionRegimen3;
    }

    public String getFlibDescripcionRegimen3() {
        return this.flibDescripcionRegimen3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomAdquirente(String flibNomAdquirente) {
        this.flibNomAdquirente = flibNomAdquirente;
    }

    public String getFlibNomAdquirente() {
        return this.flibNomAdquirente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomCalle(String flibNomCalle) {
        this.flibNomCalle = flibNomCalle;
    }

    public String getFlibNomCalle() {
        return this.flibNomCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomColonia(String flibNomColonia) {
        this.flibNomColonia = flibNomColonia;
    }

    public String getFlibNomColonia() {
        return this.flibNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibDelegacionMunicipio(String flibDelegacionMunicipio) {
        this.flibDelegacionMunicipio = flibDelegacionMunicipio;
    }

    public String getFlibDelegacionMunicipio() {
        return this.flibDelegacionMunicipio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomPoblacion(String flibNomPoblacion) {
        this.flibNomPoblacion = flibNomPoblacion;
    }

    public String getFlibNomPoblacion() {
        return this.flibNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomEstado(String flibNomEstado) {
        this.flibNomEstado = flibNomEstado;
    }

    public String getFlibNomEstado() {
        return this.flibNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibTipoInmueble(String flibTipoInmueble) {
        this.flibTipoInmueble = flibTipoInmueble;
    }

    public String getFlibTipoInmueble() {
        return this.flibTipoInmueble;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setFlibIndiviso(BigDecimal flibIndiviso) {
        this.flibIndiviso = flibIndiviso;
    }

    public BigDecimal getFlibIndiviso() {
        return this.flibIndiviso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNumEscritura(String flibNumEscritura) {
        this.flibNumEscritura = flibNumEscritura;
    }

    public String getFlibNumEscritura() {
        return this.flibNumEscritura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomEnvio(String flibNomEnvio) {
        this.flibNomEnvio = flibNomEnvio;
    }

    public String getFlibNomEnvio() {
        return this.flibNomEnvio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibEmailEnvio(String flibEmailEnvio) {
        this.flibEmailEnvio = flibEmailEnvio;
    }

    public String getFlibEmailEnvio() {
        return this.flibEmailEnvio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibObservacion(String flibObservacion) {
        this.flibObservacion = flibObservacion;
    }

    public String getFlibObservacion() {
        return this.flibObservacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomDelegado(String flibNomDelegado) {
        this.flibNomDelegado = flibNomDelegado;
    }

    public String getFlibNomDelegado() {
        return this.flibNomDelegado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlibNomFirma(String flibNomFirma) {
        this.flibNomFirma = flibNomFirma;
    }

    public String getFlibNomFirma() {
        return this.flibNomFirma;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CARTA_LIBERACION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFlibIdFideicomiso() != null && this.getFlibIdFideicomiso().longValue() == -999) {
            conditions += " AND FLIB_ID_FIDEICOMISO IS NULL";
        } else if (this.getFlibIdFideicomiso() != null) {
            conditions += " AND FLIB_ID_FIDEICOMISO = ?";
            values.add(this.getFlibIdFideicomiso());
        }

        if (this.getFlibIdSubcuenta() != null && this.getFlibIdSubcuenta().longValue() == -999) {
            conditions += " AND FLIB_ID_SUBCUENTA IS NULL";
        } else if (this.getFlibIdSubcuenta() != null) {
            conditions += " AND FLIB_ID_SUBCUENTA = ?";
            values.add(this.getFlibIdSubcuenta());
        }

        if (this.getFlibIdBien() != null && "null".equals(this.getFlibIdBien())) {
            conditions += " AND FLIB_ID_BIEN IS NULL";
        } else if (this.getFlibIdBien() != null) {
            conditions += " AND FLIB_ID_BIEN = ?";
            values.add(this.getFlibIdBien());
        }

        if (this.getFlibIdEdificio() != null && "null".equals(this.getFlibIdEdificio())) {
            conditions += " AND FLIB_ID_EDIFICIO IS NULL";
        } else if (this.getFlibIdEdificio() != null) {
            conditions += " AND FLIB_ID_EDIFICIO = ?";
            values.add(this.getFlibIdEdificio());
        }

        if (this.getFlibIdDepto() != null && "null".equals(this.getFlibIdDepto())) {
            conditions += " AND FLIB_ID_DEPTO IS NULL";
        } else if (this.getFlibIdDepto() != null) {
            conditions += " AND FLIB_ID_DEPTO = ?";
            values.add(this.getFlibIdDepto());
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
        String sql = "SELECT * FROM F_CARTA_LIBERACION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFlibIdFideicomiso() != null && this.getFlibIdFideicomiso().longValue() == -999) {
            conditions += " AND FLIB_ID_FIDEICOMISO IS NULL";
        } else if (this.getFlibIdFideicomiso() != null) {
            conditions += " AND FLIB_ID_FIDEICOMISO = ?";
            values.add(this.getFlibIdFideicomiso());
        }

        if (this.getFlibIdSubcuenta() != null && this.getFlibIdSubcuenta().longValue() == -999) {
            conditions += " AND FLIB_ID_SUBCUENTA IS NULL";
        } else if (this.getFlibIdSubcuenta() != null) {
            conditions += " AND FLIB_ID_SUBCUENTA = ?";
            values.add(this.getFlibIdSubcuenta());
        }

        if (this.getFlibIdBien() != null && "null".equals(this.getFlibIdBien())) {
            conditions += " AND FLIB_ID_BIEN IS NULL";
        } else if (this.getFlibIdBien() != null) {
            conditions += " AND FLIB_ID_BIEN = ?";
            values.add(this.getFlibIdBien());
        }

        if (this.getFlibIdEdificio() != null && "null".equals(this.getFlibIdEdificio())) {
            conditions += " AND FLIB_ID_EDIFICIO IS NULL";
        } else if (this.getFlibIdEdificio() != null) {
            conditions += " AND FLIB_ID_EDIFICIO = ?";
            values.add(this.getFlibIdEdificio());
        }

        if (this.getFlibIdDepto() != null && "null".equals(this.getFlibIdDepto())) {
            conditions += " AND FLIB_ID_DEPTO IS NULL";
        } else if (this.getFlibIdDepto() != null) {
            conditions += " AND FLIB_ID_DEPTO = ?";
            values.add(this.getFlibIdDepto());
        }

        if (this.getFlibNomEmpresa() != null && "null".equals(this.getFlibNomEmpresa())) {
            conditions += " AND FLIB_NOM_EMPRESA IS NULL";
        } else if (this.getFlibNomEmpresa() != null) {
            conditions += " AND FLIB_NOM_EMPRESA = ?";
            values.add(this.getFlibNomEmpresa());
        }

        if (this.getFlibNomArea() != null && "null".equals(this.getFlibNomArea())) {
            conditions += " AND FLIB_NOM_AREA IS NULL";
        } else if (this.getFlibNomArea() != null) {
            conditions += " AND FLIB_NOM_AREA = ?";
            values.add(this.getFlibNomArea());
        }

        if (this.getFlibDireccion() != null && "null".equals(this.getFlibDireccion())) {
            conditions += " AND FLIB_DIRECCION IS NULL";
        } else if (this.getFlibDireccion() != null) {
            conditions += " AND FLIB_DIRECCION = ?";
            values.add(this.getFlibDireccion());
        }

        if (this.getFlibSitio() != null && "null".equals(this.getFlibSitio())) {
            conditions += " AND FLIB_SITIO IS NULL";
        } else if (this.getFlibSitio() != null) {
            conditions += " AND FLIB_SITIO = ?";
            values.add(this.getFlibSitio());
        }

        if (this.getFlibFecha() != null && "null".equals(this.getFlibFecha())) {
            conditions += " AND FLIB_FECHA IS NULL";
        } else if (this.getFlibFecha() != null) {
            conditions += " AND FLIB_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFlibFecha());
        }

        if (this.getFlibNomNotario() != null && "null".equals(this.getFlibNomNotario())) {
            conditions += " AND FLIB_NOM_NOTARIO IS NULL";
        } else if (this.getFlibNomNotario() != null) {
            conditions += " AND FLIB_NOM_NOTARIO = ?";
            values.add(this.getFlibNomNotario());
        }

        if (this.getFlibNomPuesto() != null && "null".equals(this.getFlibNomPuesto())) {
            conditions += " AND FLIB_NOM_PUESTO IS NULL";
        } else if (this.getFlibNomPuesto() != null) {
            conditions += " AND FLIB_NOM_PUESTO = ?";
            values.add(this.getFlibNomPuesto());
        }

        if (this.getFlibDescFidBen() != null && "null".equals(this.getFlibDescFidBen())) {
            conditions += " AND FLIB_DESC_FID_BEN IS NULL";
        } else if (this.getFlibDescFidBen() != null) {
            conditions += " AND FLIB_DESC_FID_BEN = ?";
            values.add(this.getFlibDescFidBen());
        }

        if (this.getFlibDescSaneamiento() != null && "null".equals(this.getFlibDescSaneamiento())) {
            conditions += " AND FLIB_DESC_SANEAMIENTO IS NULL";
        } else if (this.getFlibDescSaneamiento() != null) {
            conditions += " AND FLIB_DESC_SANEAMIENTO = ?";
            values.add(this.getFlibDescSaneamiento());
        }

        if (this.getFlibDescResponsabilidad() != null && "null".equals(this.getFlibDescResponsabilidad())) {
            conditions += " AND FLIB_DESC_RESPONSABILIDAD IS NULL";
        } else if (this.getFlibDescResponsabilidad() != null) {
            conditions += " AND FLIB_DESC_RESPONSABILIDAD = ?";
            values.add(this.getFlibDescResponsabilidad());
        }

        if (this.getFlibDescOtorgamiento() != null && "null".equals(this.getFlibDescOtorgamiento())) {
            conditions += " AND FLIB_DESC_OTORGAMIENTO IS NULL";
        } else if (this.getFlibDescOtorgamiento() != null) {
            conditions += " AND FLIB_DESC_OTORGAMIENTO = ?";
            values.add(this.getFlibDescOtorgamiento());
        }

        if (this.getFlibTransmisionReversion() != null && "null".equals(this.getFlibTransmisionReversion())) {
            conditions += " AND FLIB_TRANSMISION_REVERSION IS NULL";
        } else if (this.getFlibTransmisionReversion() != null) {
            conditions += " AND FLIB_TRANSMISION_REVERSION = ?";
            values.add(this.getFlibTransmisionReversion());
        }

        if (this.getFlibParcialTotal() != null && "null".equals(this.getFlibParcialTotal())) {
            conditions += " AND FLIB_PARCIAL_TOTAL IS NULL";
        } else if (this.getFlibParcialTotal() != null) {
            conditions += " AND FLIB_PARCIAL_TOTAL = ?";
            values.add(this.getFlibParcialTotal());
        }

        if (this.getFlibDescripcionInmueble() != null && "null".equals(this.getFlibDescripcionInmueble())) {
            conditions += " AND FLIB_DESCRIPCION_INMUEBLE IS NULL";
        } else if (this.getFlibDescripcionInmueble() != null) {
            conditions += " AND FLIB_DESCRIPCION_INMUEBLE = ?";
            values.add(this.getFlibDescripcionInmueble());
        }

        if (this.getFlibSujetoRegimen() != null && this.getFlibSujetoRegimen().longValue() == -999) {
            conditions += " AND FLIB_SUJETO_REGIMEN IS NULL";
        } else if (this.getFlibSujetoRegimen() != null) {
            conditions += " AND FLIB_SUJETO_REGIMEN = ?";
            values.add(this.getFlibSujetoRegimen());
        }

        if (this.getFlibDescripcionRegimen1() != null && "null".equals(this.getFlibDescripcionRegimen1())) {
            conditions += " AND FLIB_DESCRIPCION_REGIMEN1 IS NULL";
        } else if (this.getFlibDescripcionRegimen1() != null) {
            conditions += " AND FLIB_DESCRIPCION_REGIMEN1 = ?";
            values.add(this.getFlibDescripcionRegimen1());
        }

        if (this.getFlibDescripcionRegimen2() != null && "null".equals(this.getFlibDescripcionRegimen2())) {
            conditions += " AND FLIB_DESCRIPCION_REGIMEN2 IS NULL";
        } else if (this.getFlibDescripcionRegimen2() != null) {
            conditions += " AND FLIB_DESCRIPCION_REGIMEN2 = ?";
            values.add(this.getFlibDescripcionRegimen2());
        }

        if (this.getFlibDescripcionRegimen3() != null && "null".equals(this.getFlibDescripcionRegimen3())) {
            conditions += " AND FLIB_DESCRIPCION_REGIMEN3 IS NULL";
        } else if (this.getFlibDescripcionRegimen3() != null) {
            conditions += " AND FLIB_DESCRIPCION_REGIMEN3 = ?";
            values.add(this.getFlibDescripcionRegimen3());
        }

        if (this.getFlibNomAdquirente() != null && "null".equals(this.getFlibNomAdquirente())) {
            conditions += " AND FLIB_NOM_ADQUIRENTE IS NULL";
        } else if (this.getFlibNomAdquirente() != null) {
            conditions += " AND FLIB_NOM_ADQUIRENTE = ?";
            values.add(this.getFlibNomAdquirente());
        }

        if (this.getFlibNomCalle() != null && "null".equals(this.getFlibNomCalle())) {
            conditions += " AND FLIB_NOM_CALLE IS NULL";
        } else if (this.getFlibNomCalle() != null) {
            conditions += " AND FLIB_NOM_CALLE = ?";
            values.add(this.getFlibNomCalle());
        }

        if (this.getFlibNomColonia() != null && "null".equals(this.getFlibNomColonia())) {
            conditions += " AND FLIB_NOM_COLONIA IS NULL";
        } else if (this.getFlibNomColonia() != null) {
            conditions += " AND FLIB_NOM_COLONIA = ?";
            values.add(this.getFlibNomColonia());
        }

        if (this.getFlibDelegacionMunicipio() != null && "null".equals(this.getFlibDelegacionMunicipio())) {
            conditions += " AND FLIB_DELEGACION_MUNICIPIO IS NULL";
        } else if (this.getFlibDelegacionMunicipio() != null) {
            conditions += " AND FLIB_DELEGACION_MUNICIPIO = ?";
            values.add(this.getFlibDelegacionMunicipio());
        }

        if (this.getFlibNomPoblacion() != null && "null".equals(this.getFlibNomPoblacion())) {
            conditions += " AND FLIB_NOM_POBLACION IS NULL";
        } else if (this.getFlibNomPoblacion() != null) {
            conditions += " AND FLIB_NOM_POBLACION = ?";
            values.add(this.getFlibNomPoblacion());
        }

        if (this.getFlibNomEstado() != null && "null".equals(this.getFlibNomEstado())) {
            conditions += " AND FLIB_NOM_ESTADO IS NULL";
        } else if (this.getFlibNomEstado() != null) {
            conditions += " AND FLIB_NOM_ESTADO = ?";
            values.add(this.getFlibNomEstado());
        }

        if (this.getFlibTipoInmueble() != null && "null".equals(this.getFlibTipoInmueble())) {
            conditions += " AND FLIB_TIPO_INMUEBLE IS NULL";
        } else if (this.getFlibTipoInmueble() != null) {
            conditions += " AND FLIB_TIPO_INMUEBLE = ?";
            values.add(this.getFlibTipoInmueble());
        }

        if (this.getFlibIndiviso() != null && this.getFlibIndiviso().longValue() == -999) {
            conditions += " AND FLIB_INDIVISO IS NULL";
        } else if (this.getFlibIndiviso() != null) {
            conditions += " AND FLIB_INDIVISO = ?";
            values.add(this.getFlibIndiviso());
        }

        if (this.getFlibNumEscritura() != null && "null".equals(this.getFlibNumEscritura())) {
            conditions += " AND FLIB_NUM_ESCRITURA IS NULL";
        } else if (this.getFlibNumEscritura() != null) {
            conditions += " AND FLIB_NUM_ESCRITURA = ?";
            values.add(this.getFlibNumEscritura());
        }

        if (this.getFlibNomEnvio() != null && "null".equals(this.getFlibNomEnvio())) {
            conditions += " AND FLIB_NOM_ENVIO IS NULL";
        } else if (this.getFlibNomEnvio() != null) {
            conditions += " AND FLIB_NOM_ENVIO = ?";
            values.add(this.getFlibNomEnvio());
        }

        if (this.getFlibEmailEnvio() != null && "null".equals(this.getFlibEmailEnvio())) {
            conditions += " AND FLIB_EMAIL_ENVIO IS NULL";
        } else if (this.getFlibEmailEnvio() != null) {
            conditions += " AND FLIB_EMAIL_ENVIO = ?";
            values.add(this.getFlibEmailEnvio());
        }

        if (this.getFlibObservacion() != null && "null".equals(this.getFlibObservacion())) {
            conditions += " AND FLIB_OBSERVACION IS NULL";
        } else if (this.getFlibObservacion() != null) {
            conditions += " AND FLIB_OBSERVACION = ?";
            values.add(this.getFlibObservacion());
        }

        if (this.getFlibNomDelegado() != null && "null".equals(this.getFlibNomDelegado())) {
            conditions += " AND FLIB_NOM_DELEGADO IS NULL";
        } else if (this.getFlibNomDelegado() != null) {
            conditions += " AND FLIB_NOM_DELEGADO = ?";
            values.add(this.getFlibNomDelegado());
        }

        if (this.getFlibNomFirma() != null && "null".equals(this.getFlibNomFirma())) {
            conditions += " AND FLIB_NOM_FIRMA IS NULL";
        } else if (this.getFlibNomFirma() != null) {
            conditions += " AND FLIB_NOM_FIRMA = ?";
            values.add(this.getFlibNomFirma());
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
        String sql = "UPDATE F_CARTA_LIBERACION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FLIB_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFlibIdFideicomiso());
        conditions += " AND FLIB_ID_SUBCUENTA = ?";
        pkValues.add(this.getFlibIdSubcuenta());
        conditions += " AND FLIB_ID_BIEN = ?";
        pkValues.add(this.getFlibIdBien());
        conditions += " AND FLIB_ID_EDIFICIO = ?";
        pkValues.add(this.getFlibIdEdificio());
        conditions += " AND FLIB_ID_DEPTO = ?";
        pkValues.add(this.getFlibIdDepto());
        fields += " FLIB_NOM_EMPRESA = ?, ";
        values.add(this.getFlibNomEmpresa());
        fields += " FLIB_NOM_AREA = ?, ";
        values.add(this.getFlibNomArea());
        fields += " FLIB_DIRECCION = ?, ";
        values.add(this.getFlibDireccion());
        fields += " FLIB_SITIO = ?, ";
        values.add(this.getFlibSitio());
        fields += " FLIB_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFlibFecha());
        fields += " FLIB_NOM_NOTARIO = ?, ";
        values.add(this.getFlibNomNotario());
        fields += " FLIB_NOM_PUESTO = ?, ";
        values.add(this.getFlibNomPuesto());
        fields += " FLIB_DESC_FID_BEN = ?, ";
        values.add(this.getFlibDescFidBen());
        fields += " FLIB_DESC_SANEAMIENTO = ?, ";
        values.add(this.getFlibDescSaneamiento());
        fields += " FLIB_DESC_RESPONSABILIDAD = ?, ";
        values.add(this.getFlibDescResponsabilidad());
        fields += " FLIB_DESC_OTORGAMIENTO = ?, ";
        values.add(this.getFlibDescOtorgamiento());
        fields += " FLIB_TRANSMISION_REVERSION = ?, ";
        values.add(this.getFlibTransmisionReversion());
        fields += " FLIB_PARCIAL_TOTAL = ?, ";
        values.add(this.getFlibParcialTotal());
        fields += " FLIB_DESCRIPCION_INMUEBLE = ?, ";
        values.add(this.getFlibDescripcionInmueble());
        fields += " FLIB_SUJETO_REGIMEN = ?, ";
        values.add(this.getFlibSujetoRegimen());
        fields += " FLIB_DESCRIPCION_REGIMEN1 = ?, ";
        values.add(this.getFlibDescripcionRegimen1());
        fields += " FLIB_DESCRIPCION_REGIMEN2 = ?, ";
        values.add(this.getFlibDescripcionRegimen2());
        fields += " FLIB_DESCRIPCION_REGIMEN3 = ?, ";
        values.add(this.getFlibDescripcionRegimen3());
        fields += " FLIB_NOM_ADQUIRENTE = ?, ";
        values.add(this.getFlibNomAdquirente());
        fields += " FLIB_NOM_CALLE = ?, ";
        values.add(this.getFlibNomCalle());
        fields += " FLIB_NOM_COLONIA = ?, ";
        values.add(this.getFlibNomColonia());
        fields += " FLIB_DELEGACION_MUNICIPIO = ?, ";
        values.add(this.getFlibDelegacionMunicipio());
        fields += " FLIB_NOM_POBLACION = ?, ";
        values.add(this.getFlibNomPoblacion());
        fields += " FLIB_NOM_ESTADO = ?, ";
        values.add(this.getFlibNomEstado());
        fields += " FLIB_TIPO_INMUEBLE = ?, ";
        values.add(this.getFlibTipoInmueble());
        fields += " FLIB_INDIVISO = ?, ";
        values.add(this.getFlibIndiviso());
        fields += " FLIB_NUM_ESCRITURA = ?, ";
        values.add(this.getFlibNumEscritura());
        fields += " FLIB_NOM_ENVIO = ?, ";
        values.add(this.getFlibNomEnvio());
        fields += " FLIB_EMAIL_ENVIO = ?, ";
        values.add(this.getFlibEmailEnvio());
        fields += " FLIB_OBSERVACION = ?, ";
        values.add(this.getFlibObservacion());
        fields += " FLIB_NOM_DELEGADO = ?, ";
        values.add(this.getFlibNomDelegado());
        fields += " FLIB_NOM_FIRMA = ?, ";
        values.add(this.getFlibNomFirma());
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
        String sql = "INSERT INTO F_CARTA_LIBERACION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FLIB_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFlibIdFideicomiso());

        fields += ", FLIB_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFlibIdSubcuenta());

        fields += ", FLIB_ID_BIEN";
        fieldValues += ", ?";
        values.add(this.getFlibIdBien());

        fields += ", FLIB_ID_EDIFICIO";
        fieldValues += ", ?";
        values.add(this.getFlibIdEdificio());

        fields += ", FLIB_ID_DEPTO";
        fieldValues += ", ?";
        values.add(this.getFlibIdDepto());

        fields += ", FLIB_NOM_EMPRESA";
        fieldValues += ", ?";
        values.add(this.getFlibNomEmpresa());

        fields += ", FLIB_NOM_AREA";
        fieldValues += ", ?";
        values.add(this.getFlibNomArea());

        fields += ", FLIB_DIRECCION";
        fieldValues += ", ?";
        values.add(this.getFlibDireccion());

        fields += ", FLIB_SITIO";
        fieldValues += ", ?";
        values.add(this.getFlibSitio());

        fields += ", FLIB_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFlibFecha());

        fields += ", FLIB_NOM_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getFlibNomNotario());

        fields += ", FLIB_NOM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getFlibNomPuesto());

        fields += ", FLIB_DESC_FID_BEN";
        fieldValues += ", ?";
        values.add(this.getFlibDescFidBen());

        fields += ", FLIB_DESC_SANEAMIENTO";
        fieldValues += ", ?";
        values.add(this.getFlibDescSaneamiento());

        fields += ", FLIB_DESC_RESPONSABILIDAD";
        fieldValues += ", ?";
        values.add(this.getFlibDescResponsabilidad());

        fields += ", FLIB_DESC_OTORGAMIENTO";
        fieldValues += ", ?";
        values.add(this.getFlibDescOtorgamiento());

        fields += ", FLIB_TRANSMISION_REVERSION";
        fieldValues += ", ?";
        values.add(this.getFlibTransmisionReversion());

        fields += ", FLIB_PARCIAL_TOTAL";
        fieldValues += ", ?";
        values.add(this.getFlibParcialTotal());

        fields += ", FLIB_DESCRIPCION_INMUEBLE";
        fieldValues += ", ?";
        values.add(this.getFlibDescripcionInmueble());

        fields += ", FLIB_SUJETO_REGIMEN";
        fieldValues += ", ?";
        values.add(this.getFlibSujetoRegimen());

        fields += ", FLIB_DESCRIPCION_REGIMEN1";
        fieldValues += ", ?";
        values.add(this.getFlibDescripcionRegimen1());

        fields += ", FLIB_DESCRIPCION_REGIMEN2";
        fieldValues += ", ?";
        values.add(this.getFlibDescripcionRegimen2());

        fields += ", FLIB_DESCRIPCION_REGIMEN3";
        fieldValues += ", ?";
        values.add(this.getFlibDescripcionRegimen3());

        fields += ", FLIB_NOM_ADQUIRENTE";
        fieldValues += ", ?";
        values.add(this.getFlibNomAdquirente());

        fields += ", FLIB_NOM_CALLE";
        fieldValues += ", ?";
        values.add(this.getFlibNomCalle());

        fields += ", FLIB_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getFlibNomColonia());

        fields += ", FLIB_DELEGACION_MUNICIPIO";
        fieldValues += ", ?";
        values.add(this.getFlibDelegacionMunicipio());

        fields += ", FLIB_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getFlibNomPoblacion());

        fields += ", FLIB_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getFlibNomEstado());

        fields += ", FLIB_TIPO_INMUEBLE";
        fieldValues += ", ?";
        values.add(this.getFlibTipoInmueble());

        fields += ", FLIB_INDIVISO";
        fieldValues += ", ?";
        values.add(this.getFlibIndiviso());

        fields += ", FLIB_NUM_ESCRITURA";
        fieldValues += ", ?";
        values.add(this.getFlibNumEscritura());

        fields += ", FLIB_NOM_ENVIO";
        fieldValues += ", ?";
        values.add(this.getFlibNomEnvio());

        fields += ", FLIB_EMAIL_ENVIO";
        fieldValues += ", ?";
        values.add(this.getFlibEmailEnvio());

        fields += ", FLIB_OBSERVACION";
        fieldValues += ", ?";
        values.add(this.getFlibObservacion());

        fields += ", FLIB_NOM_DELEGADO";
        fieldValues += ", ?";
        values.add(this.getFlibNomDelegado());

        fields += ", FLIB_NOM_FIRMA";
        fieldValues += ", ?";
        values.add(this.getFlibNomFirma());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CARTA_LIBERACION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FLIB_ID_FIDEICOMISO = ?";
        values.add(this.getFlibIdFideicomiso());
        conditions += " AND FLIB_ID_SUBCUENTA = ?";
        values.add(this.getFlibIdSubcuenta());
        conditions += " AND FLIB_ID_BIEN = ?";
        values.add(this.getFlibIdBien());
        conditions += " AND FLIB_ID_EDIFICIO = ?";
        values.add(this.getFlibIdEdificio());
        conditions += " AND FLIB_ID_DEPTO = ?";
        values.add(this.getFlibIdDepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCartaLiberacion instance = (FCartaLiberacion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFlibIdFideicomiso().equals(instance.getFlibIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFlibIdSubcuenta().equals(instance.getFlibIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFlibIdBien().equals(instance.getFlibIdBien()))
            equalObjects = false;
        if (equalObjects && !this.getFlibIdEdificio().equals(instance.getFlibIdEdificio()))
            equalObjects = false;
        if (equalObjects && !this.getFlibIdDepto().equals(instance.getFlibIdDepto()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomEmpresa().equals(instance.getFlibNomEmpresa()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomArea().equals(instance.getFlibNomArea()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDireccion().equals(instance.getFlibDireccion()))
            equalObjects = false;
        if (equalObjects && !this.getFlibSitio().equals(instance.getFlibSitio()))
            equalObjects = false;
        if (equalObjects && !this.getFlibFecha().equals(instance.getFlibFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomNotario().equals(instance.getFlibNomNotario()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomPuesto().equals(instance.getFlibNomPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDescFidBen().equals(instance.getFlibDescFidBen()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDescSaneamiento().equals(instance.getFlibDescSaneamiento()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDescResponsabilidad().equals(instance.getFlibDescResponsabilidad()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDescOtorgamiento().equals(instance.getFlibDescOtorgamiento()))
            equalObjects = false;
        if (equalObjects && !this.getFlibTransmisionReversion().equals(instance.getFlibTransmisionReversion()))
            equalObjects = false;
        if (equalObjects && !this.getFlibParcialTotal().equals(instance.getFlibParcialTotal()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDescripcionInmueble().equals(instance.getFlibDescripcionInmueble()))
            equalObjects = false;
        if (equalObjects && !this.getFlibSujetoRegimen().equals(instance.getFlibSujetoRegimen()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDescripcionRegimen1().equals(instance.getFlibDescripcionRegimen1()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDescripcionRegimen2().equals(instance.getFlibDescripcionRegimen2()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDescripcionRegimen3().equals(instance.getFlibDescripcionRegimen3()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomAdquirente().equals(instance.getFlibNomAdquirente()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomCalle().equals(instance.getFlibNomCalle()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomColonia().equals(instance.getFlibNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getFlibDelegacionMunicipio().equals(instance.getFlibDelegacionMunicipio()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomPoblacion().equals(instance.getFlibNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomEstado().equals(instance.getFlibNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getFlibTipoInmueble().equals(instance.getFlibTipoInmueble()))
            equalObjects = false;
        if (equalObjects && !this.getFlibIndiviso().equals(instance.getFlibIndiviso()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNumEscritura().equals(instance.getFlibNumEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomEnvio().equals(instance.getFlibNomEnvio()))
            equalObjects = false;
        if (equalObjects && !this.getFlibEmailEnvio().equals(instance.getFlibEmailEnvio()))
            equalObjects = false;
        if (equalObjects && !this.getFlibObservacion().equals(instance.getFlibObservacion()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomDelegado().equals(instance.getFlibNomDelegado()))
            equalObjects = false;
        if (equalObjects && !this.getFlibNomFirma().equals(instance.getFlibNomFirma()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCartaLiberacion result = new FCartaLiberacion();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFlibIdFideicomiso((BigDecimal) objectData.getData("FLIB_ID_FIDEICOMISO"));
        result.setFlibIdSubcuenta((BigDecimal) objectData.getData("FLIB_ID_SUBCUENTA"));
        result.setFlibIdBien((String) objectData.getData("FLIB_ID_BIEN"));
        result.setFlibIdEdificio((String) objectData.getData("FLIB_ID_EDIFICIO"));
        result.setFlibIdDepto((String) objectData.getData("FLIB_ID_DEPTO"));
        result.setFlibNomEmpresa((String) objectData.getData("FLIB_NOM_EMPRESA"));
        result.setFlibNomArea((String) objectData.getData("FLIB_NOM_AREA"));
        result.setFlibDireccion((String) objectData.getData("FLIB_DIRECCION"));
        result.setFlibSitio((String) objectData.getData("FLIB_SITIO"));
        result.setFlibFecha((String) objectData.getData("FLIB_FECHA"));
        result.setFlibNomNotario((String) objectData.getData("FLIB_NOM_NOTARIO"));
        result.setFlibNomPuesto((String) objectData.getData("FLIB_NOM_PUESTO"));
        result.setFlibDescFidBen((String) objectData.getData("FLIB_DESC_FID_BEN"));
        result.setFlibDescSaneamiento((String) objectData.getData("FLIB_DESC_SANEAMIENTO"));
        result.setFlibDescResponsabilidad((String) objectData.getData("FLIB_DESC_RESPONSABILIDAD"));
        result.setFlibDescOtorgamiento((String) objectData.getData("FLIB_DESC_OTORGAMIENTO"));
        result.setFlibTransmisionReversion((String) objectData.getData("FLIB_TRANSMISION_REVERSION"));
        result.setFlibParcialTotal((String) objectData.getData("FLIB_PARCIAL_TOTAL"));
        result.setFlibDescripcionInmueble((String) objectData.getData("FLIB_DESCRIPCION_INMUEBLE"));
        result.setFlibSujetoRegimen((BigDecimal) objectData.getData("FLIB_SUJETO_REGIMEN"));
        result.setFlibDescripcionRegimen1((String) objectData.getData("FLIB_DESCRIPCION_REGIMEN1"));
        result.setFlibDescripcionRegimen2((String) objectData.getData("FLIB_DESCRIPCION_REGIMEN2"));
        result.setFlibDescripcionRegimen3((String) objectData.getData("FLIB_DESCRIPCION_REGIMEN3"));
        result.setFlibNomAdquirente((String) objectData.getData("FLIB_NOM_ADQUIRENTE"));
        result.setFlibNomCalle((String) objectData.getData("FLIB_NOM_CALLE"));
        result.setFlibNomColonia((String) objectData.getData("FLIB_NOM_COLONIA"));
        result.setFlibDelegacionMunicipio((String) objectData.getData("FLIB_DELEGACION_MUNICIPIO"));
        result.setFlibNomPoblacion((String) objectData.getData("FLIB_NOM_POBLACION"));
        result.setFlibNomEstado((String) objectData.getData("FLIB_NOM_ESTADO"));
        result.setFlibTipoInmueble((String) objectData.getData("FLIB_TIPO_INMUEBLE"));
        result.setFlibIndiviso((BigDecimal) objectData.getData("FLIB_INDIVISO"));
        result.setFlibNumEscritura((String) objectData.getData("FLIB_NUM_ESCRITURA"));
        result.setFlibNomEnvio((String) objectData.getData("FLIB_NOM_ENVIO"));
        result.setFlibEmailEnvio((String) objectData.getData("FLIB_EMAIL_ENVIO"));
        result.setFlibObservacion((String) objectData.getData("FLIB_OBSERVACION"));
        result.setFlibNomDelegado((String) objectData.getData("FLIB_NOM_DELEGADO"));
        result.setFlibNomFirma((String) objectData.getData("FLIB_NOM_FIRMA"));

        return result;

    }

}
