package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "VRINMOBILIARIO_PK", columns = { "VRI_OT", "VRI_FECH_AVALUO" }, sequences = { "MANUAL" })
public class Vrinmobiliario extends DomainObject {

    String vriOt = null;
    String vriFechAvaluo = null;
    String vriSolicitante = null;
    String vriCalle = null;
    String vriCadenamiento = null;
    String vriColonia = null;
    String vriPoblacion = null;
    String vriEstado = null;
    String vriTipoAvaluo = null;
    String vriClasificaAva = null;
    String vriCaracteFisica = null;
    String vriUsoSuelo = null;
    String vriSuperficie = null;
    BigDecimal vriValorFisico = null;
    String vriIndiviso = null;
    String vriClasifiCalida = null;
    BigDecimal vriEdad = null;
    String vriConservacion = null;
    BigDecimal vriSupConstruT1 = null;
    BigDecimal vriSupConstruT2 = null;
    BigDecimal vriSupConstruT3 = null;
    BigDecimal vriSupConstruT4 = null;
    BigDecimal vriSupConstruT5 = null;
    BigDecimal vriTotalSupcont = null;
    BigDecimal vriUnitarioCont1 = null;
    BigDecimal vriUnitarioCont2 = null;
    BigDecimal vriUnitarioCont3 = null;
    BigDecimal vriUnitarioCont4 = null;
    BigDecimal vriUnitarioCont5 = null;
    BigDecimal vriValFisConstr = null;
    BigDecimal vriInstalaEspeci = null;
    BigDecimal vriElementAcceso = null;
    BigDecimal vriObrasCompleme = null;
    BigDecimal vriValFisiTotal = null;
    BigDecimal vriCapitalizaRnt = null;
    BigDecimal vriUnitarioRent1 = null;
    BigDecimal vriUnitarioRent2 = null;
    BigDecimal vriUnitarioRent3 = null;
    BigDecimal vriUnitarioRent4 = null;
    BigDecimal vriUnitarioRent5 = null;
    BigDecimal vriComparatMerca = null;
    BigDecimal vriUnitarioMerca = null;
    BigDecimal vriValorComercia = null;
    BigDecimal vriComUnitaRest = null;
    String vriObservaciones = null;
    BigDecimal vriAnoAltaReg = null;
    BigDecimal vriMesAltaReg = null;
    BigDecimal vriDiaAltaReg = null;
    BigDecimal vriAnoUltMod = null;
    BigDecimal vriMesUltMod = null;
    BigDecimal vriDiaUltMod = null;
    String vriCveStVrinmob = null;

    public Vrinmobiliario() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriOt(String vriOt) {
        this.vriOt = vriOt;
    }

    public String getVriOt() {
        return this.vriOt;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriFechAvaluo(String vriFechAvaluo) {
        this.vriFechAvaluo = vriFechAvaluo;
    }

    public String getVriFechAvaluo() {
        return this.vriFechAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriSolicitante(String vriSolicitante) {
        this.vriSolicitante = vriSolicitante;
    }

    public String getVriSolicitante() {
        return this.vriSolicitante;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriCalle(String vriCalle) {
        this.vriCalle = vriCalle;
    }

    public String getVriCalle() {
        return this.vriCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriCadenamiento(String vriCadenamiento) {
        this.vriCadenamiento = vriCadenamiento;
    }

    public String getVriCadenamiento() {
        return this.vriCadenamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriColonia(String vriColonia) {
        this.vriColonia = vriColonia;
    }

    public String getVriColonia() {
        return this.vriColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriPoblacion(String vriPoblacion) {
        this.vriPoblacion = vriPoblacion;
    }

    public String getVriPoblacion() {
        return this.vriPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriEstado(String vriEstado) {
        this.vriEstado = vriEstado;
    }

    public String getVriEstado() {
        return this.vriEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriTipoAvaluo(String vriTipoAvaluo) {
        this.vriTipoAvaluo = vriTipoAvaluo;
    }

    public String getVriTipoAvaluo() {
        return this.vriTipoAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriClasificaAva(String vriClasificaAva) {
        this.vriClasificaAva = vriClasificaAva;
    }

    public String getVriClasificaAva() {
        return this.vriClasificaAva;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriCaracteFisica(String vriCaracteFisica) {
        this.vriCaracteFisica = vriCaracteFisica;
    }

    public String getVriCaracteFisica() {
        return this.vriCaracteFisica;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriUsoSuelo(String vriUsoSuelo) {
        this.vriUsoSuelo = vriUsoSuelo;
    }

    public String getVriUsoSuelo() {
        return this.vriUsoSuelo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriSuperficie(String vriSuperficie) {
        this.vriSuperficie = vriSuperficie;
    }

    public String getVriSuperficie() {
        return this.vriSuperficie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriValorFisico(BigDecimal vriValorFisico) {
        this.vriValorFisico = vriValorFisico;
    }

    public BigDecimal getVriValorFisico() {
        return this.vriValorFisico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriIndiviso(String vriIndiviso) {
        this.vriIndiviso = vriIndiviso;
    }

    public String getVriIndiviso() {
        return this.vriIndiviso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriClasifiCalida(String vriClasifiCalida) {
        this.vriClasifiCalida = vriClasifiCalida;
    }

    public String getVriClasifiCalida() {
        return this.vriClasifiCalida;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setVriEdad(BigDecimal vriEdad) {
        this.vriEdad = vriEdad;
    }

    public BigDecimal getVriEdad() {
        return this.vriEdad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriConservacion(String vriConservacion) {
        this.vriConservacion = vriConservacion;
    }

    public String getVriConservacion() {
        return this.vriConservacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 0, javaClass = BigDecimal.class)
    public void setVriSupConstruT1(BigDecimal vriSupConstruT1) {
        this.vriSupConstruT1 = vriSupConstruT1;
    }

    public BigDecimal getVriSupConstruT1() {
        return this.vriSupConstruT1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 0, javaClass = BigDecimal.class)
    public void setVriSupConstruT2(BigDecimal vriSupConstruT2) {
        this.vriSupConstruT2 = vriSupConstruT2;
    }

    public BigDecimal getVriSupConstruT2() {
        return this.vriSupConstruT2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 0, javaClass = BigDecimal.class)
    public void setVriSupConstruT3(BigDecimal vriSupConstruT3) {
        this.vriSupConstruT3 = vriSupConstruT3;
    }

    public BigDecimal getVriSupConstruT3() {
        return this.vriSupConstruT3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 0, javaClass = BigDecimal.class)
    public void setVriSupConstruT4(BigDecimal vriSupConstruT4) {
        this.vriSupConstruT4 = vriSupConstruT4;
    }

    public BigDecimal getVriSupConstruT4() {
        return this.vriSupConstruT4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 0, javaClass = BigDecimal.class)
    public void setVriSupConstruT5(BigDecimal vriSupConstruT5) {
        this.vriSupConstruT5 = vriSupConstruT5;
    }

    public BigDecimal getVriSupConstruT5() {
        return this.vriSupConstruT5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 0, javaClass = BigDecimal.class)
    public void setVriTotalSupcont(BigDecimal vriTotalSupcont) {
        this.vriTotalSupcont = vriTotalSupcont;
    }

    public BigDecimal getVriTotalSupcont() {
        return this.vriTotalSupcont;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioCont1(BigDecimal vriUnitarioCont1) {
        this.vriUnitarioCont1 = vriUnitarioCont1;
    }

    public BigDecimal getVriUnitarioCont1() {
        return this.vriUnitarioCont1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioCont2(BigDecimal vriUnitarioCont2) {
        this.vriUnitarioCont2 = vriUnitarioCont2;
    }

    public BigDecimal getVriUnitarioCont2() {
        return this.vriUnitarioCont2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioCont3(BigDecimal vriUnitarioCont3) {
        this.vriUnitarioCont3 = vriUnitarioCont3;
    }

    public BigDecimal getVriUnitarioCont3() {
        return this.vriUnitarioCont3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioCont4(BigDecimal vriUnitarioCont4) {
        this.vriUnitarioCont4 = vriUnitarioCont4;
    }

    public BigDecimal getVriUnitarioCont4() {
        return this.vriUnitarioCont4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioCont5(BigDecimal vriUnitarioCont5) {
        this.vriUnitarioCont5 = vriUnitarioCont5;
    }

    public BigDecimal getVriUnitarioCont5() {
        return this.vriUnitarioCont5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriValFisConstr(BigDecimal vriValFisConstr) {
        this.vriValFisConstr = vriValFisConstr;
    }

    public BigDecimal getVriValFisConstr() {
        return this.vriValFisConstr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriInstalaEspeci(BigDecimal vriInstalaEspeci) {
        this.vriInstalaEspeci = vriInstalaEspeci;
    }

    public BigDecimal getVriInstalaEspeci() {
        return this.vriInstalaEspeci;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriElementAcceso(BigDecimal vriElementAcceso) {
        this.vriElementAcceso = vriElementAcceso;
    }

    public BigDecimal getVriElementAcceso() {
        return this.vriElementAcceso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriObrasCompleme(BigDecimal vriObrasCompleme) {
        this.vriObrasCompleme = vriObrasCompleme;
    }

    public BigDecimal getVriObrasCompleme() {
        return this.vriObrasCompleme;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriValFisiTotal(BigDecimal vriValFisiTotal) {
        this.vriValFisiTotal = vriValFisiTotal;
    }

    public BigDecimal getVriValFisiTotal() {
        return this.vriValFisiTotal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriCapitalizaRnt(BigDecimal vriCapitalizaRnt) {
        this.vriCapitalizaRnt = vriCapitalizaRnt;
    }

    public BigDecimal getVriCapitalizaRnt() {
        return this.vriCapitalizaRnt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioRent1(BigDecimal vriUnitarioRent1) {
        this.vriUnitarioRent1 = vriUnitarioRent1;
    }

    public BigDecimal getVriUnitarioRent1() {
        return this.vriUnitarioRent1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioRent2(BigDecimal vriUnitarioRent2) {
        this.vriUnitarioRent2 = vriUnitarioRent2;
    }

    public BigDecimal getVriUnitarioRent2() {
        return this.vriUnitarioRent2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioRent3(BigDecimal vriUnitarioRent3) {
        this.vriUnitarioRent3 = vriUnitarioRent3;
    }

    public BigDecimal getVriUnitarioRent3() {
        return this.vriUnitarioRent3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioRent4(BigDecimal vriUnitarioRent4) {
        this.vriUnitarioRent4 = vriUnitarioRent4;
    }

    public BigDecimal getVriUnitarioRent4() {
        return this.vriUnitarioRent4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioRent5(BigDecimal vriUnitarioRent5) {
        this.vriUnitarioRent5 = vriUnitarioRent5;
    }

    public BigDecimal getVriUnitarioRent5() {
        return this.vriUnitarioRent5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriComparatMerca(BigDecimal vriComparatMerca) {
        this.vriComparatMerca = vriComparatMerca;
    }

    public BigDecimal getVriComparatMerca() {
        return this.vriComparatMerca;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriUnitarioMerca(BigDecimal vriUnitarioMerca) {
        this.vriUnitarioMerca = vriUnitarioMerca;
    }

    public BigDecimal getVriUnitarioMerca() {
        return this.vriUnitarioMerca;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriValorComercia(BigDecimal vriValorComercia) {
        this.vriValorComercia = vriValorComercia;
    }

    public BigDecimal getVriValorComercia() {
        return this.vriValorComercia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVriComUnitaRest(BigDecimal vriComUnitaRest) {
        this.vriComUnitaRest = vriComUnitaRest;
    }

    public BigDecimal getVriComUnitaRest() {
        return this.vriComUnitaRest;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriObservaciones(String vriObservaciones) {
        this.vriObservaciones = vriObservaciones;
    }

    public String getVriObservaciones() {
        return this.vriObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVriAnoAltaReg(BigDecimal vriAnoAltaReg) {
        this.vriAnoAltaReg = vriAnoAltaReg;
    }

    public BigDecimal getVriAnoAltaReg() {
        return this.vriAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVriMesAltaReg(BigDecimal vriMesAltaReg) {
        this.vriMesAltaReg = vriMesAltaReg;
    }

    public BigDecimal getVriMesAltaReg() {
        return this.vriMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVriDiaAltaReg(BigDecimal vriDiaAltaReg) {
        this.vriDiaAltaReg = vriDiaAltaReg;
    }

    public BigDecimal getVriDiaAltaReg() {
        return this.vriDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVriAnoUltMod(BigDecimal vriAnoUltMod) {
        this.vriAnoUltMod = vriAnoUltMod;
    }

    public BigDecimal getVriAnoUltMod() {
        return this.vriAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVriMesUltMod(BigDecimal vriMesUltMod) {
        this.vriMesUltMod = vriMesUltMod;
    }

    public BigDecimal getVriMesUltMod() {
        return this.vriMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVriDiaUltMod(BigDecimal vriDiaUltMod) {
        this.vriDiaUltMod = vriDiaUltMod;
    }

    public BigDecimal getVriDiaUltMod() {
        return this.vriDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVriCveStVrinmob(String vriCveStVrinmob) {
        this.vriCveStVrinmob = vriCveStVrinmob;
    }

    public String getVriCveStVrinmob() {
        return this.vriCveStVrinmob;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM VRINMOBILIARIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVriOt() != null && "null".equals(this.getVriOt())) {
            conditions += " AND VRI_OT IS NULL";
        } else if (this.getVriOt() != null) {
            conditions += " AND VRI_OT = ?";
            values.add(this.getVriOt());
        }

        if (this.getVriFechAvaluo() != null && "null".equals(this.getVriFechAvaluo())) {
            conditions += " AND VRI_FECH_AVALUO IS NULL";
        } else if (this.getVriFechAvaluo() != null) {
            conditions += " AND VRI_FECH_AVALUO = ?";
            values.add(this.getVriFechAvaluo());
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
        String sql = "SELECT * FROM VRINMOBILIARIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVriOt() != null && "null".equals(this.getVriOt())) {
            conditions += " AND VRI_OT IS NULL";
        } else if (this.getVriOt() != null) {
            conditions += " AND VRI_OT = ?";
            values.add(this.getVriOt());
        }

        if (this.getVriFechAvaluo() != null && "null".equals(this.getVriFechAvaluo())) {
            conditions += " AND VRI_FECH_AVALUO IS NULL";
        } else if (this.getVriFechAvaluo() != null) {
            conditions += " AND VRI_FECH_AVALUO = ?";
            values.add(this.getVriFechAvaluo());
        }

        if (this.getVriSolicitante() != null && "null".equals(this.getVriSolicitante())) {
            conditions += " AND VRI_SOLICITANTE IS NULL";
        } else if (this.getVriSolicitante() != null) {
            conditions += " AND VRI_SOLICITANTE = ?";
            values.add(this.getVriSolicitante());
        }

        if (this.getVriCalle() != null && "null".equals(this.getVriCalle())) {
            conditions += " AND VRI_CALLE IS NULL";
        } else if (this.getVriCalle() != null) {
            conditions += " AND VRI_CALLE = ?";
            values.add(this.getVriCalle());
        }

        if (this.getVriCadenamiento() != null && "null".equals(this.getVriCadenamiento())) {
            conditions += " AND VRI_CADENAMIENTO IS NULL";
        } else if (this.getVriCadenamiento() != null) {
            conditions += " AND VRI_CADENAMIENTO = ?";
            values.add(this.getVriCadenamiento());
        }

        if (this.getVriColonia() != null && "null".equals(this.getVriColonia())) {
            conditions += " AND VRI_COLONIA IS NULL";
        } else if (this.getVriColonia() != null) {
            conditions += " AND VRI_COLONIA = ?";
            values.add(this.getVriColonia());
        }

        if (this.getVriPoblacion() != null && "null".equals(this.getVriPoblacion())) {
            conditions += " AND VRI_POBLACION IS NULL";
        } else if (this.getVriPoblacion() != null) {
            conditions += " AND VRI_POBLACION = ?";
            values.add(this.getVriPoblacion());
        }

        if (this.getVriEstado() != null && "null".equals(this.getVriEstado())) {
            conditions += " AND VRI_ESTADO IS NULL";
        } else if (this.getVriEstado() != null) {
            conditions += " AND VRI_ESTADO = ?";
            values.add(this.getVriEstado());
        }

        if (this.getVriTipoAvaluo() != null && "null".equals(this.getVriTipoAvaluo())) {
            conditions += " AND VRI_TIPO_AVALUO IS NULL";
        } else if (this.getVriTipoAvaluo() != null) {
            conditions += " AND VRI_TIPO_AVALUO = ?";
            values.add(this.getVriTipoAvaluo());
        }

        if (this.getVriClasificaAva() != null && "null".equals(this.getVriClasificaAva())) {
            conditions += " AND VRI_CLASIFICA_AVA IS NULL";
        } else if (this.getVriClasificaAva() != null) {
            conditions += " AND VRI_CLASIFICA_AVA = ?";
            values.add(this.getVriClasificaAva());
        }

        if (this.getVriCaracteFisica() != null && "null".equals(this.getVriCaracteFisica())) {
            conditions += " AND VRI_CARACTE_FISICA IS NULL";
        } else if (this.getVriCaracteFisica() != null) {
            conditions += " AND VRI_CARACTE_FISICA = ?";
            values.add(this.getVriCaracteFisica());
        }

        if (this.getVriUsoSuelo() != null && "null".equals(this.getVriUsoSuelo())) {
            conditions += " AND VRI_USO_SUELO IS NULL";
        } else if (this.getVriUsoSuelo() != null) {
            conditions += " AND VRI_USO_SUELO = ?";
            values.add(this.getVriUsoSuelo());
        }

        if (this.getVriSuperficie() != null && "null".equals(this.getVriSuperficie())) {
            conditions += " AND VRI_SUPERFICIE IS NULL";
        } else if (this.getVriSuperficie() != null) {
            conditions += " AND VRI_SUPERFICIE = ?";
            values.add(this.getVriSuperficie());
        }

        if (this.getVriValorFisico() != null && this.getVriValorFisico().longValue() == -999) {
            conditions += " AND VRI_VALOR_FISICO IS NULL";
        } else if (this.getVriValorFisico() != null) {
            conditions += " AND VRI_VALOR_FISICO = ?";
            values.add(this.getVriValorFisico());
        }

        if (this.getVriIndiviso() != null && "null".equals(this.getVriIndiviso())) {
            conditions += " AND VRI_INDIVISO IS NULL";
        } else if (this.getVriIndiviso() != null) {
            conditions += " AND VRI_INDIVISO = ?";
            values.add(this.getVriIndiviso());
        }

        if (this.getVriClasifiCalida() != null && "null".equals(this.getVriClasifiCalida())) {
            conditions += " AND VRI_CLASIFI_CALIDA IS NULL";
        } else if (this.getVriClasifiCalida() != null) {
            conditions += " AND VRI_CLASIFI_CALIDA = ?";
            values.add(this.getVriClasifiCalida());
        }

        if (this.getVriEdad() != null && this.getVriEdad().longValue() == -999) {
            conditions += " AND VRI_EDAD IS NULL";
        } else if (this.getVriEdad() != null) {
            conditions += " AND VRI_EDAD = ?";
            values.add(this.getVriEdad());
        }

        if (this.getVriConservacion() != null && "null".equals(this.getVriConservacion())) {
            conditions += " AND VRI_CONSERVACION IS NULL";
        } else if (this.getVriConservacion() != null) {
            conditions += " AND VRI_CONSERVACION = ?";
            values.add(this.getVriConservacion());
        }

        if (this.getVriSupConstruT1() != null && this.getVriSupConstruT1().longValue() == -999) {
            conditions += " AND VRI_SUP_CONSTRU_T1 IS NULL";
        } else if (this.getVriSupConstruT1() != null) {
            conditions += " AND VRI_SUP_CONSTRU_T1 = ?";
            values.add(this.getVriSupConstruT1());
        }

        if (this.getVriSupConstruT2() != null && this.getVriSupConstruT2().longValue() == -999) {
            conditions += " AND VRI_SUP_CONSTRU_T2 IS NULL";
        } else if (this.getVriSupConstruT2() != null) {
            conditions += " AND VRI_SUP_CONSTRU_T2 = ?";
            values.add(this.getVriSupConstruT2());
        }

        if (this.getVriSupConstruT3() != null && this.getVriSupConstruT3().longValue() == -999) {
            conditions += " AND VRI_SUP_CONSTRU_T3 IS NULL";
        } else if (this.getVriSupConstruT3() != null) {
            conditions += " AND VRI_SUP_CONSTRU_T3 = ?";
            values.add(this.getVriSupConstruT3());
        }

        if (this.getVriSupConstruT4() != null && this.getVriSupConstruT4().longValue() == -999) {
            conditions += " AND VRI_SUP_CONSTRU_T4 IS NULL";
        } else if (this.getVriSupConstruT4() != null) {
            conditions += " AND VRI_SUP_CONSTRU_T4 = ?";
            values.add(this.getVriSupConstruT4());
        }

        if (this.getVriSupConstruT5() != null && this.getVriSupConstruT5().longValue() == -999) {
            conditions += " AND VRI_SUP_CONSTRU_T5 IS NULL";
        } else if (this.getVriSupConstruT5() != null) {
            conditions += " AND VRI_SUP_CONSTRU_T5 = ?";
            values.add(this.getVriSupConstruT5());
        }

        if (this.getVriTotalSupcont() != null && this.getVriTotalSupcont().longValue() == -999) {
            conditions += " AND VRI_TOTAL_SUPCONT IS NULL";
        } else if (this.getVriTotalSupcont() != null) {
            conditions += " AND VRI_TOTAL_SUPCONT = ?";
            values.add(this.getVriTotalSupcont());
        }

        if (this.getVriUnitarioCont1() != null && this.getVriUnitarioCont1().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_CONT1 IS NULL";
        } else if (this.getVriUnitarioCont1() != null) {
            conditions += " AND VRI_UNITARIO_CONT1 = ?";
            values.add(this.getVriUnitarioCont1());
        }

        if (this.getVriUnitarioCont2() != null && this.getVriUnitarioCont2().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_CONT2 IS NULL";
        } else if (this.getVriUnitarioCont2() != null) {
            conditions += " AND VRI_UNITARIO_CONT2 = ?";
            values.add(this.getVriUnitarioCont2());
        }

        if (this.getVriUnitarioCont3() != null && this.getVriUnitarioCont3().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_CONT3 IS NULL";
        } else if (this.getVriUnitarioCont3() != null) {
            conditions += " AND VRI_UNITARIO_CONT3 = ?";
            values.add(this.getVriUnitarioCont3());
        }

        if (this.getVriUnitarioCont4() != null && this.getVriUnitarioCont4().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_CONT4 IS NULL";
        } else if (this.getVriUnitarioCont4() != null) {
            conditions += " AND VRI_UNITARIO_CONT4 = ?";
            values.add(this.getVriUnitarioCont4());
        }

        if (this.getVriUnitarioCont5() != null && this.getVriUnitarioCont5().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_CONT5 IS NULL";
        } else if (this.getVriUnitarioCont5() != null) {
            conditions += " AND VRI_UNITARIO_CONT5 = ?";
            values.add(this.getVriUnitarioCont5());
        }

        if (this.getVriValFisConstr() != null && this.getVriValFisConstr().longValue() == -999) {
            conditions += " AND VRI_VAL_FIS_CONSTR IS NULL";
        } else if (this.getVriValFisConstr() != null) {
            conditions += " AND VRI_VAL_FIS_CONSTR = ?";
            values.add(this.getVriValFisConstr());
        }

        if (this.getVriInstalaEspeci() != null && this.getVriInstalaEspeci().longValue() == -999) {
            conditions += " AND VRI_INSTALA_ESPECI IS NULL";
        } else if (this.getVriInstalaEspeci() != null) {
            conditions += " AND VRI_INSTALA_ESPECI = ?";
            values.add(this.getVriInstalaEspeci());
        }

        if (this.getVriElementAcceso() != null && this.getVriElementAcceso().longValue() == -999) {
            conditions += " AND VRI_ELEMENT_ACCESO IS NULL";
        } else if (this.getVriElementAcceso() != null) {
            conditions += " AND VRI_ELEMENT_ACCESO = ?";
            values.add(this.getVriElementAcceso());
        }

        if (this.getVriObrasCompleme() != null && this.getVriObrasCompleme().longValue() == -999) {
            conditions += " AND VRI_OBRAS_COMPLEME IS NULL";
        } else if (this.getVriObrasCompleme() != null) {
            conditions += " AND VRI_OBRAS_COMPLEME = ?";
            values.add(this.getVriObrasCompleme());
        }

        if (this.getVriValFisiTotal() != null && this.getVriValFisiTotal().longValue() == -999) {
            conditions += " AND VRI_VAL_FISI_TOTAL IS NULL";
        } else if (this.getVriValFisiTotal() != null) {
            conditions += " AND VRI_VAL_FISI_TOTAL = ?";
            values.add(this.getVriValFisiTotal());
        }

        if (this.getVriCapitalizaRnt() != null && this.getVriCapitalizaRnt().longValue() == -999) {
            conditions += " AND VRI_CAPITALIZA_RNT IS NULL";
        } else if (this.getVriCapitalizaRnt() != null) {
            conditions += " AND VRI_CAPITALIZA_RNT = ?";
            values.add(this.getVriCapitalizaRnt());
        }

        if (this.getVriUnitarioRent1() != null && this.getVriUnitarioRent1().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_RENT1 IS NULL";
        } else if (this.getVriUnitarioRent1() != null) {
            conditions += " AND VRI_UNITARIO_RENT1 = ?";
            values.add(this.getVriUnitarioRent1());
        }

        if (this.getVriUnitarioRent2() != null && this.getVriUnitarioRent2().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_RENT2 IS NULL";
        } else if (this.getVriUnitarioRent2() != null) {
            conditions += " AND VRI_UNITARIO_RENT2 = ?";
            values.add(this.getVriUnitarioRent2());
        }

        if (this.getVriUnitarioRent3() != null && this.getVriUnitarioRent3().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_RENT3 IS NULL";
        } else if (this.getVriUnitarioRent3() != null) {
            conditions += " AND VRI_UNITARIO_RENT3 = ?";
            values.add(this.getVriUnitarioRent3());
        }

        if (this.getVriUnitarioRent4() != null && this.getVriUnitarioRent4().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_RENT4 IS NULL";
        } else if (this.getVriUnitarioRent4() != null) {
            conditions += " AND VRI_UNITARIO_RENT4 = ?";
            values.add(this.getVriUnitarioRent4());
        }

        if (this.getVriUnitarioRent5() != null && this.getVriUnitarioRent5().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_RENT5 IS NULL";
        } else if (this.getVriUnitarioRent5() != null) {
            conditions += " AND VRI_UNITARIO_RENT5 = ?";
            values.add(this.getVriUnitarioRent5());
        }

        if (this.getVriComparatMerca() != null && this.getVriComparatMerca().longValue() == -999) {
            conditions += " AND VRI_COMPARAT_MERCA IS NULL";
        } else if (this.getVriComparatMerca() != null) {
            conditions += " AND VRI_COMPARAT_MERCA = ?";
            values.add(this.getVriComparatMerca());
        }

        if (this.getVriUnitarioMerca() != null && this.getVriUnitarioMerca().longValue() == -999) {
            conditions += " AND VRI_UNITARIO_MERCA IS NULL";
        } else if (this.getVriUnitarioMerca() != null) {
            conditions += " AND VRI_UNITARIO_MERCA = ?";
            values.add(this.getVriUnitarioMerca());
        }

        if (this.getVriValorComercia() != null && this.getVriValorComercia().longValue() == -999) {
            conditions += " AND VRI_VALOR_COMERCIA IS NULL";
        } else if (this.getVriValorComercia() != null) {
            conditions += " AND VRI_VALOR_COMERCIA = ?";
            values.add(this.getVriValorComercia());
        }

        if (this.getVriComUnitaRest() != null && this.getVriComUnitaRest().longValue() == -999) {
            conditions += " AND VRI_COM_UNITA_REST IS NULL";
        } else if (this.getVriComUnitaRest() != null) {
            conditions += " AND VRI_COM_UNITA_REST = ?";
            values.add(this.getVriComUnitaRest());
        }

        if (this.getVriObservaciones() != null && "null".equals(this.getVriObservaciones())) {
            conditions += " AND VRI_OBSERVACIONES IS NULL";
        } else if (this.getVriObservaciones() != null) {
            conditions += " AND VRI_OBSERVACIONES = ?";
            values.add(this.getVriObservaciones());
        }

        if (this.getVriAnoAltaReg() != null && this.getVriAnoAltaReg().longValue() == -999) {
            conditions += " AND VRI_ANO_ALTA_REG IS NULL";
        } else if (this.getVriAnoAltaReg() != null) {
            conditions += " AND VRI_ANO_ALTA_REG = ?";
            values.add(this.getVriAnoAltaReg());
        }

        if (this.getVriMesAltaReg() != null && this.getVriMesAltaReg().longValue() == -999) {
            conditions += " AND VRI_MES_ALTA_REG IS NULL";
        } else if (this.getVriMesAltaReg() != null) {
            conditions += " AND VRI_MES_ALTA_REG = ?";
            values.add(this.getVriMesAltaReg());
        }

        if (this.getVriDiaAltaReg() != null && this.getVriDiaAltaReg().longValue() == -999) {
            conditions += " AND VRI_DIA_ALTA_REG IS NULL";
        } else if (this.getVriDiaAltaReg() != null) {
            conditions += " AND VRI_DIA_ALTA_REG = ?";
            values.add(this.getVriDiaAltaReg());
        }

        if (this.getVriAnoUltMod() != null && this.getVriAnoUltMod().longValue() == -999) {
            conditions += " AND VRI_ANO_ULT_MOD IS NULL";
        } else if (this.getVriAnoUltMod() != null) {
            conditions += " AND VRI_ANO_ULT_MOD = ?";
            values.add(this.getVriAnoUltMod());
        }

        if (this.getVriMesUltMod() != null && this.getVriMesUltMod().longValue() == -999) {
            conditions += " AND VRI_MES_ULT_MOD IS NULL";
        } else if (this.getVriMesUltMod() != null) {
            conditions += " AND VRI_MES_ULT_MOD = ?";
            values.add(this.getVriMesUltMod());
        }

        if (this.getVriDiaUltMod() != null && this.getVriDiaUltMod().longValue() == -999) {
            conditions += " AND VRI_DIA_ULT_MOD IS NULL";
        } else if (this.getVriDiaUltMod() != null) {
            conditions += " AND VRI_DIA_ULT_MOD = ?";
            values.add(this.getVriDiaUltMod());
        }

        if (this.getVriCveStVrinmob() != null && "null".equals(this.getVriCveStVrinmob())) {
            conditions += " AND VRI_CVE_ST_VRINMOB IS NULL";
        } else if (this.getVriCveStVrinmob() != null) {
            conditions += " AND VRI_CVE_ST_VRINMOB = ?";
            values.add(this.getVriCveStVrinmob());
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
        String sql = "UPDATE VRINMOBILIARIO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND VRI_OT = ?";
        pkValues.add(this.getVriOt());
        conditions += " AND VRI_FECH_AVALUO = ?";
        pkValues.add(this.getVriFechAvaluo());
        fields += " VRI_SOLICITANTE = ?, ";
        values.add(this.getVriSolicitante());
        fields += " VRI_CALLE = ?, ";
        values.add(this.getVriCalle());
        fields += " VRI_CADENAMIENTO = ?, ";
        values.add(this.getVriCadenamiento());
        fields += " VRI_COLONIA = ?, ";
        values.add(this.getVriColonia());
        fields += " VRI_POBLACION = ?, ";
        values.add(this.getVriPoblacion());
        fields += " VRI_ESTADO = ?, ";
        values.add(this.getVriEstado());
        fields += " VRI_TIPO_AVALUO = ?, ";
        values.add(this.getVriTipoAvaluo());
        fields += " VRI_CLASIFICA_AVA = ?, ";
        values.add(this.getVriClasificaAva());
        fields += " VRI_CARACTE_FISICA = ?, ";
        values.add(this.getVriCaracteFisica());
        fields += " VRI_USO_SUELO = ?, ";
        values.add(this.getVriUsoSuelo());
        fields += " VRI_SUPERFICIE = ?, ";
        values.add(this.getVriSuperficie());
        fields += " VRI_VALOR_FISICO = ?, ";
        values.add(this.getVriValorFisico());
        fields += " VRI_INDIVISO = ?, ";
        values.add(this.getVriIndiviso());
        fields += " VRI_CLASIFI_CALIDA = ?, ";
        values.add(this.getVriClasifiCalida());
        fields += " VRI_EDAD = ?, ";
        values.add(this.getVriEdad());
        fields += " VRI_CONSERVACION = ?, ";
        values.add(this.getVriConservacion());
        fields += " VRI_SUP_CONSTRU_T1 = ?, ";
        values.add(this.getVriSupConstruT1());
        fields += " VRI_SUP_CONSTRU_T2 = ?, ";
        values.add(this.getVriSupConstruT2());
        fields += " VRI_SUP_CONSTRU_T3 = ?, ";
        values.add(this.getVriSupConstruT3());
        fields += " VRI_SUP_CONSTRU_T4 = ?, ";
        values.add(this.getVriSupConstruT4());
        fields += " VRI_SUP_CONSTRU_T5 = ?, ";
        values.add(this.getVriSupConstruT5());
        fields += " VRI_TOTAL_SUPCONT = ?, ";
        values.add(this.getVriTotalSupcont());
        fields += " VRI_UNITARIO_CONT1 = ?, ";
        values.add(this.getVriUnitarioCont1());
        fields += " VRI_UNITARIO_CONT2 = ?, ";
        values.add(this.getVriUnitarioCont2());
        fields += " VRI_UNITARIO_CONT3 = ?, ";
        values.add(this.getVriUnitarioCont3());
        fields += " VRI_UNITARIO_CONT4 = ?, ";
        values.add(this.getVriUnitarioCont4());
        fields += " VRI_UNITARIO_CONT5 = ?, ";
        values.add(this.getVriUnitarioCont5());
        fields += " VRI_VAL_FIS_CONSTR = ?, ";
        values.add(this.getVriValFisConstr());
        fields += " VRI_INSTALA_ESPECI = ?, ";
        values.add(this.getVriInstalaEspeci());
        fields += " VRI_ELEMENT_ACCESO = ?, ";
        values.add(this.getVriElementAcceso());
        fields += " VRI_OBRAS_COMPLEME = ?, ";
        values.add(this.getVriObrasCompleme());
        fields += " VRI_VAL_FISI_TOTAL = ?, ";
        values.add(this.getVriValFisiTotal());
        fields += " VRI_CAPITALIZA_RNT = ?, ";
        values.add(this.getVriCapitalizaRnt());
        fields += " VRI_UNITARIO_RENT1 = ?, ";
        values.add(this.getVriUnitarioRent1());
        fields += " VRI_UNITARIO_RENT2 = ?, ";
        values.add(this.getVriUnitarioRent2());
        fields += " VRI_UNITARIO_RENT3 = ?, ";
        values.add(this.getVriUnitarioRent3());
        fields += " VRI_UNITARIO_RENT4 = ?, ";
        values.add(this.getVriUnitarioRent4());
        fields += " VRI_UNITARIO_RENT5 = ?, ";
        values.add(this.getVriUnitarioRent5());
        fields += " VRI_COMPARAT_MERCA = ?, ";
        values.add(this.getVriComparatMerca());
        fields += " VRI_UNITARIO_MERCA = ?, ";
        values.add(this.getVriUnitarioMerca());
        fields += " VRI_VALOR_COMERCIA = ?, ";
        values.add(this.getVriValorComercia());
        fields += " VRI_COM_UNITA_REST = ?, ";
        values.add(this.getVriComUnitaRest());
        fields += " VRI_OBSERVACIONES = ?, ";
        values.add(this.getVriObservaciones());
        fields += " VRI_ANO_ALTA_REG = ?, ";
        values.add(this.getVriAnoAltaReg());
        fields += " VRI_MES_ALTA_REG = ?, ";
        values.add(this.getVriMesAltaReg());
        fields += " VRI_DIA_ALTA_REG = ?, ";
        values.add(this.getVriDiaAltaReg());
        fields += " VRI_ANO_ULT_MOD = ?, ";
        values.add(this.getVriAnoUltMod());
        fields += " VRI_MES_ULT_MOD = ?, ";
        values.add(this.getVriMesUltMod());
        fields += " VRI_DIA_ULT_MOD = ?, ";
        values.add(this.getVriDiaUltMod());
        fields += " VRI_CVE_ST_VRINMOB = ?, ";
        values.add(this.getVriCveStVrinmob());
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
        String sql = "INSERT INTO VRINMOBILIARIO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", VRI_OT";
        fieldValues += ", ?";
        values.add(this.getVriOt());

        fields += ", VRI_FECH_AVALUO";
        fieldValues += ", ?";
        values.add(this.getVriFechAvaluo());

        fields += ", VRI_SOLICITANTE";
        fieldValues += ", ?";
        values.add(this.getVriSolicitante());

        fields += ", VRI_CALLE";
        fieldValues += ", ?";
        values.add(this.getVriCalle());

        fields += ", VRI_CADENAMIENTO";
        fieldValues += ", ?";
        values.add(this.getVriCadenamiento());

        fields += ", VRI_COLONIA";
        fieldValues += ", ?";
        values.add(this.getVriColonia());

        fields += ", VRI_POBLACION";
        fieldValues += ", ?";
        values.add(this.getVriPoblacion());

        fields += ", VRI_ESTADO";
        fieldValues += ", ?";
        values.add(this.getVriEstado());

        fields += ", VRI_TIPO_AVALUO";
        fieldValues += ", ?";
        values.add(this.getVriTipoAvaluo());

        fields += ", VRI_CLASIFICA_AVA";
        fieldValues += ", ?";
        values.add(this.getVriClasificaAva());

        fields += ", VRI_CARACTE_FISICA";
        fieldValues += ", ?";
        values.add(this.getVriCaracteFisica());

        fields += ", VRI_USO_SUELO";
        fieldValues += ", ?";
        values.add(this.getVriUsoSuelo());

        fields += ", VRI_SUPERFICIE";
        fieldValues += ", ?";
        values.add(this.getVriSuperficie());

        fields += ", VRI_VALOR_FISICO";
        fieldValues += ", ?";
        values.add(this.getVriValorFisico());

        fields += ", VRI_INDIVISO";
        fieldValues += ", ?";
        values.add(this.getVriIndiviso());

        fields += ", VRI_CLASIFI_CALIDA";
        fieldValues += ", ?";
        values.add(this.getVriClasifiCalida());

        fields += ", VRI_EDAD";
        fieldValues += ", ?";
        values.add(this.getVriEdad());

        fields += ", VRI_CONSERVACION";
        fieldValues += ", ?";
        values.add(this.getVriConservacion());

        fields += ", VRI_SUP_CONSTRU_T1";
        fieldValues += ", ?";
        values.add(this.getVriSupConstruT1());

        fields += ", VRI_SUP_CONSTRU_T2";
        fieldValues += ", ?";
        values.add(this.getVriSupConstruT2());

        fields += ", VRI_SUP_CONSTRU_T3";
        fieldValues += ", ?";
        values.add(this.getVriSupConstruT3());

        fields += ", VRI_SUP_CONSTRU_T4";
        fieldValues += ", ?";
        values.add(this.getVriSupConstruT4());

        fields += ", VRI_SUP_CONSTRU_T5";
        fieldValues += ", ?";
        values.add(this.getVriSupConstruT5());

        fields += ", VRI_TOTAL_SUPCONT";
        fieldValues += ", ?";
        values.add(this.getVriTotalSupcont());

        fields += ", VRI_UNITARIO_CONT1";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioCont1());

        fields += ", VRI_UNITARIO_CONT2";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioCont2());

        fields += ", VRI_UNITARIO_CONT3";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioCont3());

        fields += ", VRI_UNITARIO_CONT4";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioCont4());

        fields += ", VRI_UNITARIO_CONT5";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioCont5());

        fields += ", VRI_VAL_FIS_CONSTR";
        fieldValues += ", ?";
        values.add(this.getVriValFisConstr());

        fields += ", VRI_INSTALA_ESPECI";
        fieldValues += ", ?";
        values.add(this.getVriInstalaEspeci());

        fields += ", VRI_ELEMENT_ACCESO";
        fieldValues += ", ?";
        values.add(this.getVriElementAcceso());

        fields += ", VRI_OBRAS_COMPLEME";
        fieldValues += ", ?";
        values.add(this.getVriObrasCompleme());

        fields += ", VRI_VAL_FISI_TOTAL";
        fieldValues += ", ?";
        values.add(this.getVriValFisiTotal());

        fields += ", VRI_CAPITALIZA_RNT";
        fieldValues += ", ?";
        values.add(this.getVriCapitalizaRnt());

        fields += ", VRI_UNITARIO_RENT1";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioRent1());

        fields += ", VRI_UNITARIO_RENT2";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioRent2());

        fields += ", VRI_UNITARIO_RENT3";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioRent3());

        fields += ", VRI_UNITARIO_RENT4";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioRent4());

        fields += ", VRI_UNITARIO_RENT5";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioRent5());

        fields += ", VRI_COMPARAT_MERCA";
        fieldValues += ", ?";
        values.add(this.getVriComparatMerca());

        fields += ", VRI_UNITARIO_MERCA";
        fieldValues += ", ?";
        values.add(this.getVriUnitarioMerca());

        fields += ", VRI_VALOR_COMERCIA";
        fieldValues += ", ?";
        values.add(this.getVriValorComercia());

        fields += ", VRI_COM_UNITA_REST";
        fieldValues += ", ?";
        values.add(this.getVriComUnitaRest());

        fields += ", VRI_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getVriObservaciones());

        fields += ", VRI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVriAnoAltaReg());

        fields += ", VRI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVriMesAltaReg());

        fields += ", VRI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVriDiaAltaReg());

        fields += ", VRI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVriAnoUltMod());

        fields += ", VRI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVriMesUltMod());

        fields += ", VRI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVriDiaUltMod());

        fields += ", VRI_CVE_ST_VRINMOB";
        fieldValues += ", ?";
        values.add(this.getVriCveStVrinmob());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM VRINMOBILIARIO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND VRI_OT = ?";
        values.add(this.getVriOt());
        conditions += " AND VRI_FECH_AVALUO = ?";
        values.add(this.getVriFechAvaluo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Vrinmobiliario instance = (Vrinmobiliario) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getVriOt().equals(instance.getVriOt()))
            equalObjects = false;
        if (equalObjects && !this.getVriFechAvaluo().equals(instance.getVriFechAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getVriSolicitante().equals(instance.getVriSolicitante()))
            equalObjects = false;
        if (equalObjects && !this.getVriCalle().equals(instance.getVriCalle()))
            equalObjects = false;
        if (equalObjects && !this.getVriCadenamiento().equals(instance.getVriCadenamiento()))
            equalObjects = false;
        if (equalObjects && !this.getVriColonia().equals(instance.getVriColonia()))
            equalObjects = false;
        if (equalObjects && !this.getVriPoblacion().equals(instance.getVriPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getVriEstado().equals(instance.getVriEstado()))
            equalObjects = false;
        if (equalObjects && !this.getVriTipoAvaluo().equals(instance.getVriTipoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getVriClasificaAva().equals(instance.getVriClasificaAva()))
            equalObjects = false;
        if (equalObjects && !this.getVriCaracteFisica().equals(instance.getVriCaracteFisica()))
            equalObjects = false;
        if (equalObjects && !this.getVriUsoSuelo().equals(instance.getVriUsoSuelo()))
            equalObjects = false;
        if (equalObjects && !this.getVriSuperficie().equals(instance.getVriSuperficie()))
            equalObjects = false;
        if (equalObjects && !this.getVriValorFisico().equals(instance.getVriValorFisico()))
            equalObjects = false;
        if (equalObjects && !this.getVriIndiviso().equals(instance.getVriIndiviso()))
            equalObjects = false;
        if (equalObjects && !this.getVriClasifiCalida().equals(instance.getVriClasifiCalida()))
            equalObjects = false;
        if (equalObjects && !this.getVriEdad().equals(instance.getVriEdad()))
            equalObjects = false;
        if (equalObjects && !this.getVriConservacion().equals(instance.getVriConservacion()))
            equalObjects = false;
        if (equalObjects && !this.getVriSupConstruT1().equals(instance.getVriSupConstruT1()))
            equalObjects = false;
        if (equalObjects && !this.getVriSupConstruT2().equals(instance.getVriSupConstruT2()))
            equalObjects = false;
        if (equalObjects && !this.getVriSupConstruT3().equals(instance.getVriSupConstruT3()))
            equalObjects = false;
        if (equalObjects && !this.getVriSupConstruT4().equals(instance.getVriSupConstruT4()))
            equalObjects = false;
        if (equalObjects && !this.getVriSupConstruT5().equals(instance.getVriSupConstruT5()))
            equalObjects = false;
        if (equalObjects && !this.getVriTotalSupcont().equals(instance.getVriTotalSupcont()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioCont1().equals(instance.getVriUnitarioCont1()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioCont2().equals(instance.getVriUnitarioCont2()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioCont3().equals(instance.getVriUnitarioCont3()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioCont4().equals(instance.getVriUnitarioCont4()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioCont5().equals(instance.getVriUnitarioCont5()))
            equalObjects = false;
        if (equalObjects && !this.getVriValFisConstr().equals(instance.getVriValFisConstr()))
            equalObjects = false;
        if (equalObjects && !this.getVriInstalaEspeci().equals(instance.getVriInstalaEspeci()))
            equalObjects = false;
        if (equalObjects && !this.getVriElementAcceso().equals(instance.getVriElementAcceso()))
            equalObjects = false;
        if (equalObjects && !this.getVriObrasCompleme().equals(instance.getVriObrasCompleme()))
            equalObjects = false;
        if (equalObjects && !this.getVriValFisiTotal().equals(instance.getVriValFisiTotal()))
            equalObjects = false;
        if (equalObjects && !this.getVriCapitalizaRnt().equals(instance.getVriCapitalizaRnt()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioRent1().equals(instance.getVriUnitarioRent1()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioRent2().equals(instance.getVriUnitarioRent2()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioRent3().equals(instance.getVriUnitarioRent3()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioRent4().equals(instance.getVriUnitarioRent4()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioRent5().equals(instance.getVriUnitarioRent5()))
            equalObjects = false;
        if (equalObjects && !this.getVriComparatMerca().equals(instance.getVriComparatMerca()))
            equalObjects = false;
        if (equalObjects && !this.getVriUnitarioMerca().equals(instance.getVriUnitarioMerca()))
            equalObjects = false;
        if (equalObjects && !this.getVriValorComercia().equals(instance.getVriValorComercia()))
            equalObjects = false;
        if (equalObjects && !this.getVriComUnitaRest().equals(instance.getVriComUnitaRest()))
            equalObjects = false;
        if (equalObjects && !this.getVriObservaciones().equals(instance.getVriObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getVriAnoAltaReg().equals(instance.getVriAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVriMesAltaReg().equals(instance.getVriMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVriDiaAltaReg().equals(instance.getVriDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVriAnoUltMod().equals(instance.getVriAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVriMesUltMod().equals(instance.getVriMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVriDiaUltMod().equals(instance.getVriDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVriCveStVrinmob().equals(instance.getVriCveStVrinmob()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Vrinmobiliario result = new Vrinmobiliario();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setVriOt((String) objectData.getData("VRI_OT"));
        result.setVriFechAvaluo((String) objectData.getData("VRI_FECH_AVALUO"));
        result.setVriSolicitante((String) objectData.getData("VRI_SOLICITANTE"));
        result.setVriCalle((String) objectData.getData("VRI_CALLE"));
        result.setVriCadenamiento((String) objectData.getData("VRI_CADENAMIENTO"));
        result.setVriColonia((String) objectData.getData("VRI_COLONIA"));
        result.setVriPoblacion((String) objectData.getData("VRI_POBLACION"));
        result.setVriEstado((String) objectData.getData("VRI_ESTADO"));
        result.setVriTipoAvaluo((String) objectData.getData("VRI_TIPO_AVALUO"));
        result.setVriClasificaAva((String) objectData.getData("VRI_CLASIFICA_AVA"));
        result.setVriCaracteFisica((String) objectData.getData("VRI_CARACTE_FISICA"));
        result.setVriUsoSuelo((String) objectData.getData("VRI_USO_SUELO"));
        result.setVriSuperficie((String) objectData.getData("VRI_SUPERFICIE"));
        result.setVriValorFisico((BigDecimal) objectData.getData("VRI_VALOR_FISICO"));
        result.setVriIndiviso((String) objectData.getData("VRI_INDIVISO"));
        result.setVriClasifiCalida((String) objectData.getData("VRI_CLASIFI_CALIDA"));
        result.setVriEdad((BigDecimal) objectData.getData("VRI_EDAD"));
        result.setVriConservacion((String) objectData.getData("VRI_CONSERVACION"));
        result.setVriSupConstruT1((BigDecimal) objectData.getData("VRI_SUP_CONSTRU_T1"));
        result.setVriSupConstruT2((BigDecimal) objectData.getData("VRI_SUP_CONSTRU_T2"));
        result.setVriSupConstruT3((BigDecimal) objectData.getData("VRI_SUP_CONSTRU_T3"));
        result.setVriSupConstruT4((BigDecimal) objectData.getData("VRI_SUP_CONSTRU_T4"));
        result.setVriSupConstruT5((BigDecimal) objectData.getData("VRI_SUP_CONSTRU_T5"));
        result.setVriTotalSupcont((BigDecimal) objectData.getData("VRI_TOTAL_SUPCONT"));
        result.setVriUnitarioCont1((BigDecimal) objectData.getData("VRI_UNITARIO_CONT1"));
        result.setVriUnitarioCont2((BigDecimal) objectData.getData("VRI_UNITARIO_CONT2"));
        result.setVriUnitarioCont3((BigDecimal) objectData.getData("VRI_UNITARIO_CONT3"));
        result.setVriUnitarioCont4((BigDecimal) objectData.getData("VRI_UNITARIO_CONT4"));
        result.setVriUnitarioCont5((BigDecimal) objectData.getData("VRI_UNITARIO_CONT5"));
        result.setVriValFisConstr((BigDecimal) objectData.getData("VRI_VAL_FIS_CONSTR"));
        result.setVriInstalaEspeci((BigDecimal) objectData.getData("VRI_INSTALA_ESPECI"));
        result.setVriElementAcceso((BigDecimal) objectData.getData("VRI_ELEMENT_ACCESO"));
        result.setVriObrasCompleme((BigDecimal) objectData.getData("VRI_OBRAS_COMPLEME"));
        result.setVriValFisiTotal((BigDecimal) objectData.getData("VRI_VAL_FISI_TOTAL"));
        result.setVriCapitalizaRnt((BigDecimal) objectData.getData("VRI_CAPITALIZA_RNT"));
        result.setVriUnitarioRent1((BigDecimal) objectData.getData("VRI_UNITARIO_RENT1"));
        result.setVriUnitarioRent2((BigDecimal) objectData.getData("VRI_UNITARIO_RENT2"));
        result.setVriUnitarioRent3((BigDecimal) objectData.getData("VRI_UNITARIO_RENT3"));
        result.setVriUnitarioRent4((BigDecimal) objectData.getData("VRI_UNITARIO_RENT4"));
        result.setVriUnitarioRent5((BigDecimal) objectData.getData("VRI_UNITARIO_RENT5"));
        result.setVriComparatMerca((BigDecimal) objectData.getData("VRI_COMPARAT_MERCA"));
        result.setVriUnitarioMerca((BigDecimal) objectData.getData("VRI_UNITARIO_MERCA"));
        result.setVriValorComercia((BigDecimal) objectData.getData("VRI_VALOR_COMERCIA"));
        result.setVriComUnitaRest((BigDecimal) objectData.getData("VRI_COM_UNITA_REST"));
        result.setVriObservaciones((String) objectData.getData("VRI_OBSERVACIONES"));
        result.setVriAnoAltaReg((BigDecimal) objectData.getData("VRI_ANO_ALTA_REG"));
        result.setVriMesAltaReg((BigDecimal) objectData.getData("VRI_MES_ALTA_REG"));
        result.setVriDiaAltaReg((BigDecimal) objectData.getData("VRI_DIA_ALTA_REG"));
        result.setVriAnoUltMod((BigDecimal) objectData.getData("VRI_ANO_ULT_MOD"));
        result.setVriMesUltMod((BigDecimal) objectData.getData("VRI_MES_ULT_MOD"));
        result.setVriDiaUltMod((BigDecimal) objectData.getData("VRI_DIA_ULT_MOD"));
        result.setVriCveStVrinmob((String) objectData.getData("VRI_CVE_ST_VRINMOB"));

        return result;

    }

}
