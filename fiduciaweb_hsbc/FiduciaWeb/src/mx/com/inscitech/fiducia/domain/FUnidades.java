package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_UNIDADES_PK", columns = { "FUNI_ID_FIDEICOMISO", "FUNI_ID_SUBCUENTA", "FUNI_ID_BIEN", "FUNI_ID_EDIFICIO", "FUNI_ID_DEPTO" },
            sequences = { "MANUAL" })
public class FUnidades extends DomainObject {

    BigDecimal funiIdFideicomiso = null;
    BigDecimal funiIdSubcuenta = null;
    String funiIdBien = null;
    String funiIdEdificio = null;
    String funiIdDepto = null;
    String funiTipo = null;
    String funiNiveles = null;
    String funiCalleNum = null;
    String funiNomColonia = null;
    String funiNomPoblacion = null;
    String funiCodigoPostal = null;
    BigDecimal funiNumEstado = null;
    BigDecimal funiNumPais = null;
    String funiColindancias = null;
    String funiMedidas = null;
    String funiEstacionamiento1 = null;
    String funiSuperficie1 = null;
    String funiEstacionamiento2 = null;
    String funiSuperficie2 = null;
    String funiEstacionamiento3 = null;
    String funiSuperficie3 = null;
    String funiRoofGarden = null;
    String funiRoofSuperficie = null;
    String funiSotano = null;
    String funiSotanoSuperficie = null;
    BigDecimal funiIndiviso = null;
    BigDecimal funiPrecio = null;
    BigDecimal funiPrecioCatastro = null;
    BigDecimal funiUltimoAvaluo = null;
    String funiFechaUltimoAvaluo = null;
    BigDecimal funiMoneda = null;
    String funiActo1 = null;
    String funiActo2 = null;
    String funiActo3 = null;
    String funiActo4 = null;
    BigDecimal funiNotario = null;
    String funiFechaReversion = null;
    String funiLocalidadNota = null;
    String funiNumEscritura = null;
    String funiFolioReal = null;
    String funiFechaTrasladoDominio = null;
    String funiStatus = null;
    BigDecimal funiCveGrahipo = null;
    String funiNumHipoteca = null;
    String funiAFavor = null;

    public FUnidades() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFuniIdFideicomiso(BigDecimal funiIdFideicomiso) {
        this.funiIdFideicomiso = funiIdFideicomiso;
    }

    public BigDecimal getFuniIdFideicomiso() {
        return this.funiIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFuniIdSubcuenta(BigDecimal funiIdSubcuenta) {
        this.funiIdSubcuenta = funiIdSubcuenta;
    }

    public BigDecimal getFuniIdSubcuenta() {
        return this.funiIdSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniIdBien(String funiIdBien) {
        this.funiIdBien = funiIdBien;
    }

    public String getFuniIdBien() {
        return this.funiIdBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniIdEdificio(String funiIdEdificio) {
        this.funiIdEdificio = funiIdEdificio;
    }

    public String getFuniIdEdificio() {
        return this.funiIdEdificio;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniIdDepto(String funiIdDepto) {
        this.funiIdDepto = funiIdDepto;
    }

    public String getFuniIdDepto() {
        return this.funiIdDepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniTipo(String funiTipo) {
        this.funiTipo = funiTipo;
    }

    public String getFuniTipo() {
        return this.funiTipo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniNiveles(String funiNiveles) {
        this.funiNiveles = funiNiveles;
    }

    public String getFuniNiveles() {
        return this.funiNiveles;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniCalleNum(String funiCalleNum) {
        this.funiCalleNum = funiCalleNum;
    }

    public String getFuniCalleNum() {
        return this.funiCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniNomColonia(String funiNomColonia) {
        this.funiNomColonia = funiNomColonia;
    }

    public String getFuniNomColonia() {
        return this.funiNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniNomPoblacion(String funiNomPoblacion) {
        this.funiNomPoblacion = funiNomPoblacion;
    }

    public String getFuniNomPoblacion() {
        return this.funiNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniCodigoPostal(String funiCodigoPostal) {
        this.funiCodigoPostal = funiCodigoPostal;
    }

    public String getFuniCodigoPostal() {
        return this.funiCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFuniNumEstado(BigDecimal funiNumEstado) {
        this.funiNumEstado = funiNumEstado;
    }

    public BigDecimal getFuniNumEstado() {
        return this.funiNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFuniNumPais(BigDecimal funiNumPais) {
        this.funiNumPais = funiNumPais;
    }

    public BigDecimal getFuniNumPais() {
        return this.funiNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniColindancias(String funiColindancias) {
        this.funiColindancias = funiColindancias;
    }

    public String getFuniColindancias() {
        return this.funiColindancias;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniMedidas(String funiMedidas) {
        this.funiMedidas = funiMedidas;
    }

    public String getFuniMedidas() {
        return this.funiMedidas;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniEstacionamiento1(String funiEstacionamiento1) {
        this.funiEstacionamiento1 = funiEstacionamiento1;
    }

    public String getFuniEstacionamiento1() {
        return this.funiEstacionamiento1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniSuperficie1(String funiSuperficie1) {
        this.funiSuperficie1 = funiSuperficie1;
    }

    public String getFuniSuperficie1() {
        return this.funiSuperficie1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniEstacionamiento2(String funiEstacionamiento2) {
        this.funiEstacionamiento2 = funiEstacionamiento2;
    }

    public String getFuniEstacionamiento2() {
        return this.funiEstacionamiento2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniSuperficie2(String funiSuperficie2) {
        this.funiSuperficie2 = funiSuperficie2;
    }

    public String getFuniSuperficie2() {
        return this.funiSuperficie2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniEstacionamiento3(String funiEstacionamiento3) {
        this.funiEstacionamiento3 = funiEstacionamiento3;
    }

    public String getFuniEstacionamiento3() {
        return this.funiEstacionamiento3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniSuperficie3(String funiSuperficie3) {
        this.funiSuperficie3 = funiSuperficie3;
    }

    public String getFuniSuperficie3() {
        return this.funiSuperficie3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniRoofGarden(String funiRoofGarden) {
        this.funiRoofGarden = funiRoofGarden;
    }

    public String getFuniRoofGarden() {
        return this.funiRoofGarden;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniRoofSuperficie(String funiRoofSuperficie) {
        this.funiRoofSuperficie = funiRoofSuperficie;
    }

    public String getFuniRoofSuperficie() {
        return this.funiRoofSuperficie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniSotano(String funiSotano) {
        this.funiSotano = funiSotano;
    }

    public String getFuniSotano() {
        return this.funiSotano;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniSotanoSuperficie(String funiSotanoSuperficie) {
        this.funiSotanoSuperficie = funiSotanoSuperficie;
    }

    public String getFuniSotanoSuperficie() {
        return this.funiSotanoSuperficie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setFuniIndiviso(BigDecimal funiIndiviso) {
        this.funiIndiviso = funiIndiviso;
    }

    public BigDecimal getFuniIndiviso() {
        return this.funiIndiviso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFuniPrecio(BigDecimal funiPrecio) {
        this.funiPrecio = funiPrecio;
    }

    public BigDecimal getFuniPrecio() {
        return this.funiPrecio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFuniPrecioCatastro(BigDecimal funiPrecioCatastro) {
        this.funiPrecioCatastro = funiPrecioCatastro;
    }

    public BigDecimal getFuniPrecioCatastro() {
        return this.funiPrecioCatastro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFuniUltimoAvaluo(BigDecimal funiUltimoAvaluo) {
        this.funiUltimoAvaluo = funiUltimoAvaluo;
    }

    public BigDecimal getFuniUltimoAvaluo() {
        return this.funiUltimoAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFuniFechaUltimoAvaluo(String funiFechaUltimoAvaluo) {
        this.funiFechaUltimoAvaluo = funiFechaUltimoAvaluo;
    }

    public String getFuniFechaUltimoAvaluo() {
        return this.funiFechaUltimoAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFuniMoneda(BigDecimal funiMoneda) {
        this.funiMoneda = funiMoneda;
    }

    public BigDecimal getFuniMoneda() {
        return this.funiMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniActo1(String funiActo1) {
        this.funiActo1 = funiActo1;
    }

    public String getFuniActo1() {
        return this.funiActo1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniActo2(String funiActo2) {
        this.funiActo2 = funiActo2;
    }

    public String getFuniActo2() {
        return this.funiActo2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniActo3(String funiActo3) {
        this.funiActo3 = funiActo3;
    }

    public String getFuniActo3() {
        return this.funiActo3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniActo4(String funiActo4) {
        this.funiActo4 = funiActo4;
    }

    public String getFuniActo4() {
        return this.funiActo4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFuniNotario(BigDecimal funiNotario) {
        this.funiNotario = funiNotario;
    }

    public BigDecimal getFuniNotario() {
        return this.funiNotario;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFuniFechaReversion(String funiFechaReversion) {
        this.funiFechaReversion = funiFechaReversion;
    }

    public String getFuniFechaReversion() {
        return this.funiFechaReversion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniLocalidadNota(String funiLocalidadNota) {
        this.funiLocalidadNota = funiLocalidadNota;
    }

    public String getFuniLocalidadNota() {
        return this.funiLocalidadNota;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniNumEscritura(String funiNumEscritura) {
        this.funiNumEscritura = funiNumEscritura;
    }

    public String getFuniNumEscritura() {
        return this.funiNumEscritura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniFolioReal(String funiFolioReal) {
        this.funiFolioReal = funiFolioReal;
    }

    public String getFuniFolioReal() {
        return this.funiFolioReal;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFuniFechaTrasladoDominio(String funiFechaTrasladoDominio) {
        this.funiFechaTrasladoDominio = funiFechaTrasladoDominio;
    }

    public String getFuniFechaTrasladoDominio() {
        return this.funiFechaTrasladoDominio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniStatus(String funiStatus) {
        this.funiStatus = funiStatus;
    }

    public String getFuniStatus() {
        return this.funiStatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFuniCveGrahipo(BigDecimal funiCveGrahipo) {
        this.funiCveGrahipo = funiCveGrahipo;
    }

    public BigDecimal getFuniCveGrahipo() {
        return this.funiCveGrahipo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniNumHipoteca(String funiNumHipoteca) {
        this.funiNumHipoteca = funiNumHipoteca;
    }

    public String getFuniNumHipoteca() {
        return this.funiNumHipoteca;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFuniAFavor(String funiAFavor) {
        this.funiAFavor = funiAFavor;
    }

    public String getFuniAFavor() {
        return this.funiAFavor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_UNIDADES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFuniIdFideicomiso() != null && this.getFuniIdFideicomiso().longValue() == -999) {
            conditions += " AND FUNI_ID_FIDEICOMISO IS NULL";
        } else if (this.getFuniIdFideicomiso() != null) {
            conditions += " AND FUNI_ID_FIDEICOMISO = ?";
            values.add(this.getFuniIdFideicomiso());
        }

        if (this.getFuniIdSubcuenta() != null && this.getFuniIdSubcuenta().longValue() == -999) {
            conditions += " AND FUNI_ID_SUBCUENTA IS NULL";
        } else if (this.getFuniIdSubcuenta() != null) {
            conditions += " AND FUNI_ID_SUBCUENTA = ?";
            values.add(this.getFuniIdSubcuenta());
        }

        if (this.getFuniIdBien() != null && "null".equals(this.getFuniIdBien())) {
            conditions += " AND FUNI_ID_BIEN IS NULL";
        } else if (this.getFuniIdBien() != null) {
            conditions += " AND FUNI_ID_BIEN = ?";
            values.add(this.getFuniIdBien());
        }

        if (this.getFuniIdEdificio() != null && "null".equals(this.getFuniIdEdificio())) {
            conditions += " AND FUNI_ID_EDIFICIO IS NULL";
        } else if (this.getFuniIdEdificio() != null) {
            conditions += " AND FUNI_ID_EDIFICIO = ?";
            values.add(this.getFuniIdEdificio());
        }

        if (this.getFuniIdDepto() != null && "null".equals(this.getFuniIdDepto())) {
            conditions += " AND FUNI_ID_DEPTO IS NULL";
        } else if (this.getFuniIdDepto() != null) {
            conditions += " AND FUNI_ID_DEPTO = ?";
            values.add(this.getFuniIdDepto());
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
        String sql = "SELECT * FROM F_UNIDADES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFuniIdFideicomiso() != null && this.getFuniIdFideicomiso().longValue() == -999) {
            conditions += " AND FUNI_ID_FIDEICOMISO IS NULL";
        } else if (this.getFuniIdFideicomiso() != null) {
            conditions += " AND FUNI_ID_FIDEICOMISO = ?";
            values.add(this.getFuniIdFideicomiso());
        }

        if (this.getFuniIdSubcuenta() != null && this.getFuniIdSubcuenta().longValue() == -999) {
            conditions += " AND FUNI_ID_SUBCUENTA IS NULL";
        } else if (this.getFuniIdSubcuenta() != null) {
            conditions += " AND FUNI_ID_SUBCUENTA = ?";
            values.add(this.getFuniIdSubcuenta());
        }

        if (this.getFuniIdBien() != null && "null".equals(this.getFuniIdBien())) {
            conditions += " AND FUNI_ID_BIEN IS NULL";
        } else if (this.getFuniIdBien() != null) {
            conditions += " AND FUNI_ID_BIEN = ?";
            values.add(this.getFuniIdBien());
        }

        if (this.getFuniIdEdificio() != null && "null".equals(this.getFuniIdEdificio())) {
            conditions += " AND FUNI_ID_EDIFICIO IS NULL";
        } else if (this.getFuniIdEdificio() != null) {
            conditions += " AND FUNI_ID_EDIFICIO = ?";
            values.add(this.getFuniIdEdificio());
        }

        if (this.getFuniIdDepto() != null && "null".equals(this.getFuniIdDepto())) {
            conditions += " AND FUNI_ID_DEPTO IS NULL";
        } else if (this.getFuniIdDepto() != null) {
            conditions += " AND FUNI_ID_DEPTO = ?";
            values.add(this.getFuniIdDepto());
        }

        if (this.getFuniTipo() != null && "null".equals(this.getFuniTipo())) {
            conditions += " AND FUNI_TIPO IS NULL";
        } else if (this.getFuniTipo() != null) {
            conditions += " AND FUNI_TIPO = ?";
            values.add(this.getFuniTipo());
        }

        if (this.getFuniNiveles() != null && "null".equals(this.getFuniNiveles())) {
            conditions += " AND FUNI_NIVELES IS NULL";
        } else if (this.getFuniNiveles() != null) {
            conditions += " AND FUNI_NIVELES = ?";
            values.add(this.getFuniNiveles());
        }

        if (this.getFuniCalleNum() != null && "null".equals(this.getFuniCalleNum())) {
            conditions += " AND FUNI_CALLE_NUM IS NULL";
        } else if (this.getFuniCalleNum() != null) {
            conditions += " AND FUNI_CALLE_NUM = ?";
            values.add(this.getFuniCalleNum());
        }

        if (this.getFuniNomColonia() != null && "null".equals(this.getFuniNomColonia())) {
            conditions += " AND FUNI_NOM_COLONIA IS NULL";
        } else if (this.getFuniNomColonia() != null) {
            conditions += " AND FUNI_NOM_COLONIA = ?";
            values.add(this.getFuniNomColonia());
        }

        if (this.getFuniNomPoblacion() != null && "null".equals(this.getFuniNomPoblacion())) {
            conditions += " AND FUNI_NOM_POBLACION IS NULL";
        } else if (this.getFuniNomPoblacion() != null) {
            conditions += " AND FUNI_NOM_POBLACION = ?";
            values.add(this.getFuniNomPoblacion());
        }

        if (this.getFuniCodigoPostal() != null && "null".equals(this.getFuniCodigoPostal())) {
            conditions += " AND FUNI_CODIGO_POSTAL IS NULL";
        } else if (this.getFuniCodigoPostal() != null) {
            conditions += " AND FUNI_CODIGO_POSTAL = ?";
            values.add(this.getFuniCodigoPostal());
        }

        if (this.getFuniNumEstado() != null && this.getFuniNumEstado().longValue() == -999) {
            conditions += " AND FUNI_NUM_ESTADO IS NULL";
        } else if (this.getFuniNumEstado() != null) {
            conditions += " AND FUNI_NUM_ESTADO = ?";
            values.add(this.getFuniNumEstado());
        }

        if (this.getFuniNumPais() != null && this.getFuniNumPais().longValue() == -999) {
            conditions += " AND FUNI_NUM_PAIS IS NULL";
        } else if (this.getFuniNumPais() != null) {
            conditions += " AND FUNI_NUM_PAIS = ?";
            values.add(this.getFuniNumPais());
        }

        if (this.getFuniColindancias() != null && "null".equals(this.getFuniColindancias())) {
            conditions += " AND FUNI_COLINDANCIAS IS NULL";
        } else if (this.getFuniColindancias() != null) {
            conditions += " AND FUNI_COLINDANCIAS = ?";
            values.add(this.getFuniColindancias());
        }

        if (this.getFuniMedidas() != null && "null".equals(this.getFuniMedidas())) {
            conditions += " AND FUNI_MEDIDAS IS NULL";
        } else if (this.getFuniMedidas() != null) {
            conditions += " AND FUNI_MEDIDAS = ?";
            values.add(this.getFuniMedidas());
        }

        if (this.getFuniEstacionamiento1() != null && "null".equals(this.getFuniEstacionamiento1())) {
            conditions += " AND FUNI_ESTACIONAMIENTO1 IS NULL";
        } else if (this.getFuniEstacionamiento1() != null) {
            conditions += " AND FUNI_ESTACIONAMIENTO1 = ?";
            values.add(this.getFuniEstacionamiento1());
        }

        if (this.getFuniSuperficie1() != null && "null".equals(this.getFuniSuperficie1())) {
            conditions += " AND FUNI_SUPERFICIE1 IS NULL";
        } else if (this.getFuniSuperficie1() != null) {
            conditions += " AND FUNI_SUPERFICIE1 = ?";
            values.add(this.getFuniSuperficie1());
        }

        if (this.getFuniEstacionamiento2() != null && "null".equals(this.getFuniEstacionamiento2())) {
            conditions += " AND FUNI_ESTACIONAMIENTO2 IS NULL";
        } else if (this.getFuniEstacionamiento2() != null) {
            conditions += " AND FUNI_ESTACIONAMIENTO2 = ?";
            values.add(this.getFuniEstacionamiento2());
        }

        if (this.getFuniSuperficie2() != null && "null".equals(this.getFuniSuperficie2())) {
            conditions += " AND FUNI_SUPERFICIE2 IS NULL";
        } else if (this.getFuniSuperficie2() != null) {
            conditions += " AND FUNI_SUPERFICIE2 = ?";
            values.add(this.getFuniSuperficie2());
        }

        if (this.getFuniEstacionamiento3() != null && "null".equals(this.getFuniEstacionamiento3())) {
            conditions += " AND FUNI_ESTACIONAMIENTO3 IS NULL";
        } else if (this.getFuniEstacionamiento3() != null) {
            conditions += " AND FUNI_ESTACIONAMIENTO3 = ?";
            values.add(this.getFuniEstacionamiento3());
        }

        if (this.getFuniSuperficie3() != null && "null".equals(this.getFuniSuperficie3())) {
            conditions += " AND FUNI_SUPERFICIE3 IS NULL";
        } else if (this.getFuniSuperficie3() != null) {
            conditions += " AND FUNI_SUPERFICIE3 = ?";
            values.add(this.getFuniSuperficie3());
        }

        if (this.getFuniRoofGarden() != null && "null".equals(this.getFuniRoofGarden())) {
            conditions += " AND FUNI_ROOF_GARDEN IS NULL";
        } else if (this.getFuniRoofGarden() != null) {
            conditions += " AND FUNI_ROOF_GARDEN = ?";
            values.add(this.getFuniRoofGarden());
        }

        if (this.getFuniRoofSuperficie() != null && "null".equals(this.getFuniRoofSuperficie())) {
            conditions += " AND FUNI_ROOF_SUPERFICIE IS NULL";
        } else if (this.getFuniRoofSuperficie() != null) {
            conditions += " AND FUNI_ROOF_SUPERFICIE = ?";
            values.add(this.getFuniRoofSuperficie());
        }

        if (this.getFuniSotano() != null && "null".equals(this.getFuniSotano())) {
            conditions += " AND FUNI_SOTANO IS NULL";
        } else if (this.getFuniSotano() != null) {
            conditions += " AND FUNI_SOTANO = ?";
            values.add(this.getFuniSotano());
        }

        if (this.getFuniSotanoSuperficie() != null && "null".equals(this.getFuniSotanoSuperficie())) {
            conditions += " AND FUNI_SOTANO_SUPERFICIE IS NULL";
        } else if (this.getFuniSotanoSuperficie() != null) {
            conditions += " AND FUNI_SOTANO_SUPERFICIE = ?";
            values.add(this.getFuniSotanoSuperficie());
        }

        if (this.getFuniIndiviso() != null && this.getFuniIndiviso().longValue() == -999) {
            conditions += " AND FUNI_INDIVISO IS NULL";
        } else if (this.getFuniIndiviso() != null) {
            conditions += " AND FUNI_INDIVISO = ?";
            values.add(this.getFuniIndiviso());
        }

        if (this.getFuniPrecio() != null && this.getFuniPrecio().longValue() == -999) {
            conditions += " AND FUNI_PRECIO IS NULL";
        } else if (this.getFuniPrecio() != null) {
            conditions += " AND FUNI_PRECIO = ?";
            values.add(this.getFuniPrecio());
        }

        if (this.getFuniPrecioCatastro() != null && this.getFuniPrecioCatastro().longValue() == -999) {
            conditions += " AND FUNI_PRECIO_CATASTRO IS NULL";
        } else if (this.getFuniPrecioCatastro() != null) {
            conditions += " AND FUNI_PRECIO_CATASTRO = ?";
            values.add(this.getFuniPrecioCatastro());
        }

        if (this.getFuniUltimoAvaluo() != null && this.getFuniUltimoAvaluo().longValue() == -999) {
            conditions += " AND FUNI_ULTIMO_AVALUO IS NULL";
        } else if (this.getFuniUltimoAvaluo() != null) {
            conditions += " AND FUNI_ULTIMO_AVALUO = ?";
            values.add(this.getFuniUltimoAvaluo());
        }

        if (this.getFuniFechaUltimoAvaluo() != null && "null".equals(this.getFuniFechaUltimoAvaluo())) {
            conditions += " AND FUNI_FECHA_ULTIMO_AVALUO IS NULL";
        } else if (this.getFuniFechaUltimoAvaluo() != null) {
            conditions += " AND FUNI_FECHA_ULTIMO_AVALUO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFuniFechaUltimoAvaluo());
        }

        if (this.getFuniMoneda() != null && this.getFuniMoneda().longValue() == -999) {
            conditions += " AND FUNI_MONEDA IS NULL";
        } else if (this.getFuniMoneda() != null) {
            conditions += " AND FUNI_MONEDA = ?";
            values.add(this.getFuniMoneda());
        }

        if (this.getFuniActo1() != null && "null".equals(this.getFuniActo1())) {
            conditions += " AND FUNI_ACTO1 IS NULL";
        } else if (this.getFuniActo1() != null) {
            conditions += " AND FUNI_ACTO1 = ?";
            values.add(this.getFuniActo1());
        }

        if (this.getFuniActo2() != null && "null".equals(this.getFuniActo2())) {
            conditions += " AND FUNI_ACTO2 IS NULL";
        } else if (this.getFuniActo2() != null) {
            conditions += " AND FUNI_ACTO2 = ?";
            values.add(this.getFuniActo2());
        }

        if (this.getFuniActo3() != null && "null".equals(this.getFuniActo3())) {
            conditions += " AND FUNI_ACTO3 IS NULL";
        } else if (this.getFuniActo3() != null) {
            conditions += " AND FUNI_ACTO3 = ?";
            values.add(this.getFuniActo3());
        }

        if (this.getFuniActo4() != null && "null".equals(this.getFuniActo4())) {
            conditions += " AND FUNI_ACTO4 IS NULL";
        } else if (this.getFuniActo4() != null) {
            conditions += " AND FUNI_ACTO4 = ?";
            values.add(this.getFuniActo4());
        }

        if (this.getFuniNotario() != null && this.getFuniNotario().longValue() == -999) {
            conditions += " AND FUNI_NOTARIO IS NULL";
        } else if (this.getFuniNotario() != null) {
            conditions += " AND FUNI_NOTARIO = ?";
            values.add(this.getFuniNotario());
        }

        if (this.getFuniFechaReversion() != null && "null".equals(this.getFuniFechaReversion())) {
            conditions += " AND FUNI_FECHA_REVERSION IS NULL";
        } else if (this.getFuniFechaReversion() != null) {
            conditions += " AND FUNI_FECHA_REVERSION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFuniFechaReversion());
        }

        if (this.getFuniLocalidadNota() != null && "null".equals(this.getFuniLocalidadNota())) {
            conditions += " AND FUNI_LOCALIDAD_NOTA IS NULL";
        } else if (this.getFuniLocalidadNota() != null) {
            conditions += " AND FUNI_LOCALIDAD_NOTA = ?";
            values.add(this.getFuniLocalidadNota());
        }

        if (this.getFuniNumEscritura() != null && "null".equals(this.getFuniNumEscritura())) {
            conditions += " AND FUNI_NUM_ESCRITURA IS NULL";
        } else if (this.getFuniNumEscritura() != null) {
            conditions += " AND FUNI_NUM_ESCRITURA = ?";
            values.add(this.getFuniNumEscritura());
        }

        if (this.getFuniFolioReal() != null && "null".equals(this.getFuniFolioReal())) {
            conditions += " AND FUNI_FOLIO_REAL IS NULL";
        } else if (this.getFuniFolioReal() != null) {
            conditions += " AND FUNI_FOLIO_REAL = ?";
            values.add(this.getFuniFolioReal());
        }

        if (this.getFuniFechaTrasladoDominio() != null && "null".equals(this.getFuniFechaTrasladoDominio())) {
            conditions += " AND FUNI_FECHA_TRASLADO_DOMINIO IS NULL";
        } else if (this.getFuniFechaTrasladoDominio() != null) {
            conditions += " AND FUNI_FECHA_TRASLADO_DOMINIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFuniFechaTrasladoDominio());
        }

        if (this.getFuniStatus() != null && "null".equals(this.getFuniStatus())) {
            conditions += " AND FUNI_STATUS IS NULL";
        } else if (this.getFuniStatus() != null) {
            conditions += " AND FUNI_STATUS = ?";
            values.add(this.getFuniStatus());
        }

        if (this.getFuniCveGrahipo() != null && this.getFuniCveGrahipo().longValue() == -999) {
            conditions += " AND FUNI_CVE_GRAHIPO IS NULL";
        } else if (this.getFuniCveGrahipo() != null) {
            conditions += " AND FUNI_CVE_GRAHIPO = ?";
            values.add(this.getFuniCveGrahipo());
        }

        if (this.getFuniNumHipoteca() != null && "null".equals(this.getFuniNumHipoteca())) {
            conditions += " AND FUNI_NUM_HIPOTECA IS NULL";
        } else if (this.getFuniNumHipoteca() != null) {
            conditions += " AND FUNI_NUM_HIPOTECA = ?";
            values.add(this.getFuniNumHipoteca());
        }

        if (this.getFuniAFavor() != null && "null".equals(this.getFuniAFavor())) {
            conditions += " AND FUNI_A_FAVOR IS NULL";
        } else if (this.getFuniAFavor() != null) {
            conditions += " AND FUNI_A_FAVOR = ?";
            values.add(this.getFuniAFavor());
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
        String sql = "UPDATE F_UNIDADES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FUNI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFuniIdFideicomiso());
        conditions += " AND FUNI_ID_SUBCUENTA = ?";
        pkValues.add(this.getFuniIdSubcuenta());
        conditions += " AND FUNI_ID_BIEN = ?";
        pkValues.add(this.getFuniIdBien());
        conditions += " AND FUNI_ID_EDIFICIO = ?";
        pkValues.add(this.getFuniIdEdificio());
        conditions += " AND FUNI_ID_DEPTO = ?";
        pkValues.add(this.getFuniIdDepto());
        fields += " FUNI_TIPO = ?, ";
        values.add(this.getFuniTipo());
        fields += " FUNI_NIVELES = ?, ";
        values.add(this.getFuniNiveles());
        fields += " FUNI_CALLE_NUM = ?, ";
        values.add(this.getFuniCalleNum());
        fields += " FUNI_NOM_COLONIA = ?, ";
        values.add(this.getFuniNomColonia());
        fields += " FUNI_NOM_POBLACION = ?, ";
        values.add(this.getFuniNomPoblacion());
        fields += " FUNI_CODIGO_POSTAL = ?, ";
        values.add(this.getFuniCodigoPostal());
        fields += " FUNI_NUM_ESTADO = ?, ";
        values.add(this.getFuniNumEstado());
        fields += " FUNI_NUM_PAIS = ?, ";
        values.add(this.getFuniNumPais());
        fields += " FUNI_COLINDANCIAS = ?, ";
        values.add(this.getFuniColindancias());
        fields += " FUNI_MEDIDAS = ?, ";
        values.add(this.getFuniMedidas());
        fields += " FUNI_ESTACIONAMIENTO1 = ?, ";
        values.add(this.getFuniEstacionamiento1());
        fields += " FUNI_SUPERFICIE1 = ?, ";
        values.add(this.getFuniSuperficie1());
        fields += " FUNI_ESTACIONAMIENTO2 = ?, ";
        values.add(this.getFuniEstacionamiento2());
        fields += " FUNI_SUPERFICIE2 = ?, ";
        values.add(this.getFuniSuperficie2());
        fields += " FUNI_ESTACIONAMIENTO3 = ?, ";
        values.add(this.getFuniEstacionamiento3());
        fields += " FUNI_SUPERFICIE3 = ?, ";
        values.add(this.getFuniSuperficie3());
        fields += " FUNI_ROOF_GARDEN = ?, ";
        values.add(this.getFuniRoofGarden());
        fields += " FUNI_ROOF_SUPERFICIE = ?, ";
        values.add(this.getFuniRoofSuperficie());
        fields += " FUNI_SOTANO = ?, ";
        values.add(this.getFuniSotano());
        fields += " FUNI_SOTANO_SUPERFICIE = ?, ";
        values.add(this.getFuniSotanoSuperficie());
        fields += " FUNI_INDIVISO = ?, ";
        values.add(this.getFuniIndiviso());
        fields += " FUNI_PRECIO = ?, ";
        values.add(this.getFuniPrecio());
        fields += " FUNI_PRECIO_CATASTRO = ?, ";
        values.add(this.getFuniPrecioCatastro());
        fields += " FUNI_ULTIMO_AVALUO = ?, ";
        values.add(this.getFuniUltimoAvaluo());
        fields += " FUNI_FECHA_ULTIMO_AVALUO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFuniFechaUltimoAvaluo());
        fields += " FUNI_MONEDA = ?, ";
        values.add(this.getFuniMoneda());
        fields += " FUNI_ACTO1 = ?, ";
        values.add(this.getFuniActo1());
        fields += " FUNI_ACTO2 = ?, ";
        values.add(this.getFuniActo2());
        fields += " FUNI_ACTO3 = ?, ";
        values.add(this.getFuniActo3());
        fields += " FUNI_ACTO4 = ?, ";
        values.add(this.getFuniActo4());
        fields += " FUNI_NOTARIO = ?, ";
        values.add(this.getFuniNotario());
        fields += " FUNI_FECHA_REVERSION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFuniFechaReversion());
        fields += " FUNI_LOCALIDAD_NOTA = ?, ";
        values.add(this.getFuniLocalidadNota());
        fields += " FUNI_NUM_ESCRITURA = ?, ";
        values.add(this.getFuniNumEscritura());
        fields += " FUNI_FOLIO_REAL = ?, ";
        values.add(this.getFuniFolioReal());
        fields += " FUNI_FECHA_TRASLADO_DOMINIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFuniFechaTrasladoDominio());
        fields += " FUNI_STATUS = ?, ";
        values.add(this.getFuniStatus());
        fields += " FUNI_CVE_GRAHIPO = ?, ";
        values.add(this.getFuniCveGrahipo());
        fields += " FUNI_NUM_HIPOTECA = ?, ";
        values.add(this.getFuniNumHipoteca());
        fields += " FUNI_A_FAVOR = ?, ";
        values.add(this.getFuniAFavor());
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
        String sql = "INSERT INTO F_UNIDADES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FUNI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFuniIdFideicomiso());

        fields += ", FUNI_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFuniIdSubcuenta());

        fields += ", FUNI_ID_BIEN";
        fieldValues += ", ?";
        values.add(this.getFuniIdBien());

        fields += ", FUNI_ID_EDIFICIO";
        fieldValues += ", ?";
        values.add(this.getFuniIdEdificio());

        fields += ", FUNI_ID_DEPTO";
        fieldValues += ", ?";
        values.add(this.getFuniIdDepto());

        fields += ", FUNI_TIPO";
        fieldValues += ", ?";
        values.add(this.getFuniTipo());

        fields += ", FUNI_NIVELES";
        fieldValues += ", ?";
        values.add(this.getFuniNiveles());

        fields += ", FUNI_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getFuniCalleNum());

        fields += ", FUNI_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getFuniNomColonia());

        fields += ", FUNI_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getFuniNomPoblacion());

        fields += ", FUNI_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getFuniCodigoPostal());

        fields += ", FUNI_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getFuniNumEstado());

        fields += ", FUNI_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getFuniNumPais());

        fields += ", FUNI_COLINDANCIAS";
        fieldValues += ", ?";
        values.add(this.getFuniColindancias());

        fields += ", FUNI_MEDIDAS";
        fieldValues += ", ?";
        values.add(this.getFuniMedidas());

        fields += ", FUNI_ESTACIONAMIENTO1";
        fieldValues += ", ?";
        values.add(this.getFuniEstacionamiento1());

        fields += ", FUNI_SUPERFICIE1";
        fieldValues += ", ?";
        values.add(this.getFuniSuperficie1());

        fields += ", FUNI_ESTACIONAMIENTO2";
        fieldValues += ", ?";
        values.add(this.getFuniEstacionamiento2());

        fields += ", FUNI_SUPERFICIE2";
        fieldValues += ", ?";
        values.add(this.getFuniSuperficie2());

        fields += ", FUNI_ESTACIONAMIENTO3";
        fieldValues += ", ?";
        values.add(this.getFuniEstacionamiento3());

        fields += ", FUNI_SUPERFICIE3";
        fieldValues += ", ?";
        values.add(this.getFuniSuperficie3());

        fields += ", FUNI_ROOF_GARDEN";
        fieldValues += ", ?";
        values.add(this.getFuniRoofGarden());

        fields += ", FUNI_ROOF_SUPERFICIE";
        fieldValues += ", ?";
        values.add(this.getFuniRoofSuperficie());

        fields += ", FUNI_SOTANO";
        fieldValues += ", ?";
        values.add(this.getFuniSotano());

        fields += ", FUNI_SOTANO_SUPERFICIE";
        fieldValues += ", ?";
        values.add(this.getFuniSotanoSuperficie());

        fields += ", FUNI_INDIVISO";
        fieldValues += ", ?";
        values.add(this.getFuniIndiviso());

        fields += ", FUNI_PRECIO";
        fieldValues += ", ?";
        values.add(this.getFuniPrecio());

        fields += ", FUNI_PRECIO_CATASTRO";
        fieldValues += ", ?";
        values.add(this.getFuniPrecioCatastro());

        fields += ", FUNI_ULTIMO_AVALUO";
        fieldValues += ", ?";
        values.add(this.getFuniUltimoAvaluo());

        fields += ", FUNI_FECHA_ULTIMO_AVALUO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFuniFechaUltimoAvaluo());

        fields += ", FUNI_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFuniMoneda());

        fields += ", FUNI_ACTO1";
        fieldValues += ", ?";
        values.add(this.getFuniActo1());

        fields += ", FUNI_ACTO2";
        fieldValues += ", ?";
        values.add(this.getFuniActo2());

        fields += ", FUNI_ACTO3";
        fieldValues += ", ?";
        values.add(this.getFuniActo3());

        fields += ", FUNI_ACTO4";
        fieldValues += ", ?";
        values.add(this.getFuniActo4());

        fields += ", FUNI_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getFuniNotario());

        fields += ", FUNI_FECHA_REVERSION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFuniFechaReversion());

        fields += ", FUNI_LOCALIDAD_NOTA";
        fieldValues += ", ?";
        values.add(this.getFuniLocalidadNota());

        fields += ", FUNI_NUM_ESCRITURA";
        fieldValues += ", ?";
        values.add(this.getFuniNumEscritura());

        fields += ", FUNI_FOLIO_REAL";
        fieldValues += ", ?";
        values.add(this.getFuniFolioReal());

        fields += ", FUNI_FECHA_TRASLADO_DOMINIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFuniFechaTrasladoDominio());

        fields += ", FUNI_STATUS";
        fieldValues += ", ?";
        values.add(this.getFuniStatus());

        fields += ", FUNI_CVE_GRAHIPO";
        fieldValues += ", ?";
        values.add(this.getFuniCveGrahipo());

        fields += ", FUNI_NUM_HIPOTECA";
        fieldValues += ", ?";
        values.add(this.getFuniNumHipoteca());

        fields += ", FUNI_A_FAVOR";
        fieldValues += ", ?";
        values.add(this.getFuniAFavor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_UNIDADES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FUNI_ID_FIDEICOMISO = ?";
        values.add(this.getFuniIdFideicomiso());
        conditions += " AND FUNI_ID_SUBCUENTA = ?";
        values.add(this.getFuniIdSubcuenta());
        conditions += " AND FUNI_ID_BIEN = ?";
        values.add(this.getFuniIdBien());
        conditions += " AND FUNI_ID_EDIFICIO = ?";
        values.add(this.getFuniIdEdificio());
        conditions += " AND FUNI_ID_DEPTO = ?";
        values.add(this.getFuniIdDepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FUnidades instance = (FUnidades) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFuniIdFideicomiso().equals(instance.getFuniIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFuniIdSubcuenta().equals(instance.getFuniIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFuniIdBien().equals(instance.getFuniIdBien()))
            equalObjects = false;
        if (equalObjects && !this.getFuniIdEdificio().equals(instance.getFuniIdEdificio()))
            equalObjects = false;
        if (equalObjects && !this.getFuniIdDepto().equals(instance.getFuniIdDepto()))
            equalObjects = false;
        if (equalObjects && !this.getFuniTipo().equals(instance.getFuniTipo()))
            equalObjects = false;
        if (equalObjects && !this.getFuniNiveles().equals(instance.getFuniNiveles()))
            equalObjects = false;
        if (equalObjects && !this.getFuniCalleNum().equals(instance.getFuniCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getFuniNomColonia().equals(instance.getFuniNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getFuniNomPoblacion().equals(instance.getFuniNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getFuniCodigoPostal().equals(instance.getFuniCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getFuniNumEstado().equals(instance.getFuniNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getFuniNumPais().equals(instance.getFuniNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getFuniColindancias().equals(instance.getFuniColindancias()))
            equalObjects = false;
        if (equalObjects && !this.getFuniMedidas().equals(instance.getFuniMedidas()))
            equalObjects = false;
        if (equalObjects && !this.getFuniEstacionamiento1().equals(instance.getFuniEstacionamiento1()))
            equalObjects = false;
        if (equalObjects && !this.getFuniSuperficie1().equals(instance.getFuniSuperficie1()))
            equalObjects = false;
        if (equalObjects && !this.getFuniEstacionamiento2().equals(instance.getFuniEstacionamiento2()))
            equalObjects = false;
        if (equalObjects && !this.getFuniSuperficie2().equals(instance.getFuniSuperficie2()))
            equalObjects = false;
        if (equalObjects && !this.getFuniEstacionamiento3().equals(instance.getFuniEstacionamiento3()))
            equalObjects = false;
        if (equalObjects && !this.getFuniSuperficie3().equals(instance.getFuniSuperficie3()))
            equalObjects = false;
        if (equalObjects && !this.getFuniRoofGarden().equals(instance.getFuniRoofGarden()))
            equalObjects = false;
        if (equalObjects && !this.getFuniRoofSuperficie().equals(instance.getFuniRoofSuperficie()))
            equalObjects = false;
        if (equalObjects && !this.getFuniSotano().equals(instance.getFuniSotano()))
            equalObjects = false;
        if (equalObjects && !this.getFuniSotanoSuperficie().equals(instance.getFuniSotanoSuperficie()))
            equalObjects = false;
        if (equalObjects && !this.getFuniIndiviso().equals(instance.getFuniIndiviso()))
            equalObjects = false;
        if (equalObjects && !this.getFuniPrecio().equals(instance.getFuniPrecio()))
            equalObjects = false;
        if (equalObjects && !this.getFuniPrecioCatastro().equals(instance.getFuniPrecioCatastro()))
            equalObjects = false;
        if (equalObjects && !this.getFuniUltimoAvaluo().equals(instance.getFuniUltimoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getFuniFechaUltimoAvaluo().equals(instance.getFuniFechaUltimoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getFuniMoneda().equals(instance.getFuniMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFuniActo1().equals(instance.getFuniActo1()))
            equalObjects = false;
        if (equalObjects && !this.getFuniActo2().equals(instance.getFuniActo2()))
            equalObjects = false;
        if (equalObjects && !this.getFuniActo3().equals(instance.getFuniActo3()))
            equalObjects = false;
        if (equalObjects && !this.getFuniActo4().equals(instance.getFuniActo4()))
            equalObjects = false;
        if (equalObjects && !this.getFuniNotario().equals(instance.getFuniNotario()))
            equalObjects = false;
        if (equalObjects && !this.getFuniFechaReversion().equals(instance.getFuniFechaReversion()))
            equalObjects = false;
        if (equalObjects && !this.getFuniLocalidadNota().equals(instance.getFuniLocalidadNota()))
            equalObjects = false;
        if (equalObjects && !this.getFuniNumEscritura().equals(instance.getFuniNumEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getFuniFolioReal().equals(instance.getFuniFolioReal()))
            equalObjects = false;
        if (equalObjects && !this.getFuniFechaTrasladoDominio().equals(instance.getFuniFechaTrasladoDominio()))
            equalObjects = false;
        if (equalObjects && !this.getFuniStatus().equals(instance.getFuniStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFuniCveGrahipo().equals(instance.getFuniCveGrahipo()))
            equalObjects = false;
        if (equalObjects && !this.getFuniNumHipoteca().equals(instance.getFuniNumHipoteca()))
            equalObjects = false;
        if (equalObjects && !this.getFuniAFavor().equals(instance.getFuniAFavor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FUnidades result = new FUnidades();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFuniIdFideicomiso((BigDecimal) objectData.getData("FUNI_ID_FIDEICOMISO"));
        result.setFuniIdSubcuenta((BigDecimal) objectData.getData("FUNI_ID_SUBCUENTA"));
        result.setFuniIdBien((String) objectData.getData("FUNI_ID_BIEN"));
        result.setFuniIdEdificio((String) objectData.getData("FUNI_ID_EDIFICIO"));
        result.setFuniIdDepto((String) objectData.getData("FUNI_ID_DEPTO"));
        result.setFuniTipo((String) objectData.getData("FUNI_TIPO"));
        result.setFuniNiveles((String) objectData.getData("FUNI_NIVELES"));
        result.setFuniCalleNum((String) objectData.getData("FUNI_CALLE_NUM"));
        result.setFuniNomColonia((String) objectData.getData("FUNI_NOM_COLONIA"));
        result.setFuniNomPoblacion((String) objectData.getData("FUNI_NOM_POBLACION"));
        result.setFuniCodigoPostal((String) objectData.getData("FUNI_CODIGO_POSTAL"));
        result.setFuniNumEstado((BigDecimal) objectData.getData("FUNI_NUM_ESTADO"));
        result.setFuniNumPais((BigDecimal) objectData.getData("FUNI_NUM_PAIS"));
        result.setFuniColindancias((String) objectData.getData("FUNI_COLINDANCIAS"));
        result.setFuniMedidas((String) objectData.getData("FUNI_MEDIDAS"));
        result.setFuniEstacionamiento1((String) objectData.getData("FUNI_ESTACIONAMIENTO1"));
        result.setFuniSuperficie1((String) objectData.getData("FUNI_SUPERFICIE1"));
        result.setFuniEstacionamiento2((String) objectData.getData("FUNI_ESTACIONAMIENTO2"));
        result.setFuniSuperficie2((String) objectData.getData("FUNI_SUPERFICIE2"));
        result.setFuniEstacionamiento3((String) objectData.getData("FUNI_ESTACIONAMIENTO3"));
        result.setFuniSuperficie3((String) objectData.getData("FUNI_SUPERFICIE3"));
        result.setFuniRoofGarden((String) objectData.getData("FUNI_ROOF_GARDEN"));
        result.setFuniRoofSuperficie((String) objectData.getData("FUNI_ROOF_SUPERFICIE"));
        result.setFuniSotano((String) objectData.getData("FUNI_SOTANO"));
        result.setFuniSotanoSuperficie((String) objectData.getData("FUNI_SOTANO_SUPERFICIE"));
        result.setFuniIndiviso((BigDecimal) objectData.getData("FUNI_INDIVISO"));
        result.setFuniPrecio((BigDecimal) objectData.getData("FUNI_PRECIO"));
        result.setFuniPrecioCatastro((BigDecimal) objectData.getData("FUNI_PRECIO_CATASTRO"));
        result.setFuniUltimoAvaluo((BigDecimal) objectData.getData("FUNI_ULTIMO_AVALUO"));
        result.setFuniFechaUltimoAvaluo((String) objectData.getData("FUNI_FECHA_ULTIMO_AVALUO"));
        result.setFuniMoneda((BigDecimal) objectData.getData("FUNI_MONEDA"));
        result.setFuniActo1((String) objectData.getData("FUNI_ACTO1"));
        result.setFuniActo2((String) objectData.getData("FUNI_ACTO2"));
        result.setFuniActo3((String) objectData.getData("FUNI_ACTO3"));
        result.setFuniActo4((String) objectData.getData("FUNI_ACTO4"));
        result.setFuniNotario((BigDecimal) objectData.getData("FUNI_NOTARIO"));
        result.setFuniFechaReversion((String) objectData.getData("FUNI_FECHA_REVERSION"));
        result.setFuniLocalidadNota((String) objectData.getData("FUNI_LOCALIDAD_NOTA"));
        result.setFuniNumEscritura((String) objectData.getData("FUNI_NUM_ESCRITURA"));
        result.setFuniFolioReal((String) objectData.getData("FUNI_FOLIO_REAL"));
        result.setFuniFechaTrasladoDominio((String) objectData.getData("FUNI_FECHA_TRASLADO_DOMINIO"));
        result.setFuniStatus((String) objectData.getData("FUNI_STATUS"));
        result.setFuniCveGrahipo((BigDecimal) objectData.getData("FUNI_CVE_GRAHIPO"));
        result.setFuniNumHipoteca((String) objectData.getData("FUNI_NUM_HIPOTECA"));
        result.setFuniAFavor((String) objectData.getData("FUNI_A_FAVOR"));

        return result;

    }

}
