package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PERSONAL_PK", columns = { "PER_NUM_USUARIO" }, sequences = { "MAX" })
public class Personal extends DomainObject {

    String perNomUsuario = null;
    BigDecimal perNumUsuario = null;
    BigDecimal perEscIdentifica = null;
    BigDecimal perTprIdentifica = null;
    BigDecimal perClaIdentifica = null;
    String perClave = null;
    String perRangoNivel = null;
    BigDecimal perNumNomina = null;
    BigDecimal perSueldoPerc = null;
    BigDecimal perAnoIng = null;
    BigDecimal perMesIng = null;
    BigDecimal perDiaIng = null;
    BigDecimal perAntigAnos = null;
    String perNivelEstudios = null;
    BigDecimal perAnoNac = null;
    BigDecimal perMesNac = null;
    BigDecimal perDiaNac = null;
    String perTelefono = null;
    String perExtension = null;
    String perFax = null;
    String perAntigPuesto = null;
    String perMotivoMovto = null;
    String perHonorarios = null;
    BigDecimal perAnoMotivo = null;
    BigDecimal perMesMotivo = null;
    BigDecimal perDiaMotivo = null;
    String perDireccion = null;
    String perTelefParti = null;
    BigDecimal perEdoCivil = null;
    String perSexo = null;
    String perHorarioEsp = null;
    String perPzaVacante = null;
    BigDecimal perNoO = null;
    BigDecimal perNoV = null;
    String perNoHijos = null;
    String perRfc = null;
    String perDesPza = null;
    String perRegistroAsis = null;
    String perObservaciones = null;
    String perUbicacion = null;
    String perClaveInic = null;
    String perCargoFide = null;
    String perHonInic = null;
    String perImss = null;
    BigDecimal perAnoVigDel = null;
    BigDecimal perMesVigDel = null;
    BigDecimal perDiaVigDel = null;
    BigDecimal perAnoVigAl = null;
    BigDecimal perMesVigAl = null;
    BigDecimal perDiaVigAl = null;
    BigDecimal perNumContrato = null;
    BigDecimal perNumNivel1 = null;
    BigDecimal perNumNivel2 = null;
    BigDecimal perNumNivel3 = null;
    BigDecimal perNumNivel4 = null;
    BigDecimal perNumNivel5 = null;
    BigDecimal perNumPuesto = null;
    String perExpLaboral = null;
    BigDecimal perAnoCoini = null;
    BigDecimal perMesCoini = null;
    BigDecimal perDiaCoini = null;
    BigDecimal perEdad = null;
    BigDecimal perPjeIngles = null;
    BigDecimal perPjeFrances = null;
    BigDecimal perPjeOtros = null;
    String perEspecialidad = null;

    public Personal() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNomUsuario(String perNomUsuario) {
        this.perNomUsuario = perNomUsuario;
    }

    public String getPerNomUsuario() {
        return this.perNomUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumUsuario(BigDecimal perNumUsuario) {
        this.perNumUsuario = perNumUsuario;
    }

    public BigDecimal getPerNumUsuario() {
        return this.perNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerEscIdentifica(BigDecimal perEscIdentifica) {
        this.perEscIdentifica = perEscIdentifica;
    }

    public BigDecimal getPerEscIdentifica() {
        return this.perEscIdentifica;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerTprIdentifica(BigDecimal perTprIdentifica) {
        this.perTprIdentifica = perTprIdentifica;
    }

    public BigDecimal getPerTprIdentifica() {
        return this.perTprIdentifica;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerClaIdentifica(BigDecimal perClaIdentifica) {
        this.perClaIdentifica = perClaIdentifica;
    }

    public BigDecimal getPerClaIdentifica() {
        return this.perClaIdentifica;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerClave(String perClave) {
        this.perClave = perClave;
    }

    public String getPerClave() {
        return this.perClave;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerRangoNivel(String perRangoNivel) {
        this.perRangoNivel = perRangoNivel;
    }

    public String getPerRangoNivel() {
        return this.perRangoNivel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumNomina(BigDecimal perNumNomina) {
        this.perNumNomina = perNumNomina;
    }

    public BigDecimal getPerNumNomina() {
        return this.perNumNomina;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 2, javaClass = BigDecimal.class)
    public void setPerSueldoPerc(BigDecimal perSueldoPerc) {
        this.perSueldoPerc = perSueldoPerc;
    }

    public BigDecimal getPerSueldoPerc() {
        return this.perSueldoPerc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPerAnoIng(BigDecimal perAnoIng) {
        this.perAnoIng = perAnoIng;
    }

    public BigDecimal getPerAnoIng() {
        return this.perAnoIng;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerMesIng(BigDecimal perMesIng) {
        this.perMesIng = perMesIng;
    }

    public BigDecimal getPerMesIng() {
        return this.perMesIng;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerDiaIng(BigDecimal perDiaIng) {
        this.perDiaIng = perDiaIng;
    }

    public BigDecimal getPerDiaIng() {
        return this.perDiaIng;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerAntigAnos(BigDecimal perAntigAnos) {
        this.perAntigAnos = perAntigAnos;
    }

    public BigDecimal getPerAntigAnos() {
        return this.perAntigAnos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNivelEstudios(String perNivelEstudios) {
        this.perNivelEstudios = perNivelEstudios;
    }

    public String getPerNivelEstudios() {
        return this.perNivelEstudios;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPerAnoNac(BigDecimal perAnoNac) {
        this.perAnoNac = perAnoNac;
    }

    public BigDecimal getPerAnoNac() {
        return this.perAnoNac;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerMesNac(BigDecimal perMesNac) {
        this.perMesNac = perMesNac;
    }

    public BigDecimal getPerMesNac() {
        return this.perMesNac;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerDiaNac(BigDecimal perDiaNac) {
        this.perDiaNac = perDiaNac;
    }

    public BigDecimal getPerDiaNac() {
        return this.perDiaNac;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerTelefono(String perTelefono) {
        this.perTelefono = perTelefono;
    }

    public String getPerTelefono() {
        return this.perTelefono;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerExtension(String perExtension) {
        this.perExtension = perExtension;
    }

    public String getPerExtension() {
        return this.perExtension;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerFax(String perFax) {
        this.perFax = perFax;
    }

    public String getPerFax() {
        return this.perFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerAntigPuesto(String perAntigPuesto) {
        this.perAntigPuesto = perAntigPuesto;
    }

    public String getPerAntigPuesto() {
        return this.perAntigPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerMotivoMovto(String perMotivoMovto) {
        this.perMotivoMovto = perMotivoMovto;
    }

    public String getPerMotivoMovto() {
        return this.perMotivoMovto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerHonorarios(String perHonorarios) {
        this.perHonorarios = perHonorarios;
    }

    public String getPerHonorarios() {
        return this.perHonorarios;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPerAnoMotivo(BigDecimal perAnoMotivo) {
        this.perAnoMotivo = perAnoMotivo;
    }

    public BigDecimal getPerAnoMotivo() {
        return this.perAnoMotivo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerMesMotivo(BigDecimal perMesMotivo) {
        this.perMesMotivo = perMesMotivo;
    }

    public BigDecimal getPerMesMotivo() {
        return this.perMesMotivo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerDiaMotivo(BigDecimal perDiaMotivo) {
        this.perDiaMotivo = perDiaMotivo;
    }

    public BigDecimal getPerDiaMotivo() {
        return this.perDiaMotivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    public String getPerDireccion() {
        return this.perDireccion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerTelefParti(String perTelefParti) {
        this.perTelefParti = perTelefParti;
    }

    public String getPerTelefParti() {
        return this.perTelefParti;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerEdoCivil(BigDecimal perEdoCivil) {
        this.perEdoCivil = perEdoCivil;
    }

    public BigDecimal getPerEdoCivil() {
        return this.perEdoCivil;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerSexo(String perSexo) {
        this.perSexo = perSexo;
    }

    public String getPerSexo() {
        return this.perSexo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerHorarioEsp(String perHorarioEsp) {
        this.perHorarioEsp = perHorarioEsp;
    }

    public String getPerHorarioEsp() {
        return this.perHorarioEsp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerPzaVacante(String perPzaVacante) {
        this.perPzaVacante = perPzaVacante;
    }

    public String getPerPzaVacante() {
        return this.perPzaVacante;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setPerNoO(BigDecimal perNoO) {
        this.perNoO = perNoO;
    }

    public BigDecimal getPerNoO() {
        return this.perNoO;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setPerNoV(BigDecimal perNoV) {
        this.perNoV = perNoV;
    }

    public BigDecimal getPerNoV() {
        return this.perNoV;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNoHijos(String perNoHijos) {
        this.perNoHijos = perNoHijos;
    }

    public String getPerNoHijos() {
        return this.perNoHijos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerRfc(String perRfc) {
        this.perRfc = perRfc;
    }

    public String getPerRfc() {
        return this.perRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerDesPza(String perDesPza) {
        this.perDesPza = perDesPza;
    }

    public String getPerDesPza() {
        return this.perDesPza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerRegistroAsis(String perRegistroAsis) {
        this.perRegistroAsis = perRegistroAsis;
    }

    public String getPerRegistroAsis() {
        return this.perRegistroAsis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerObservaciones(String perObservaciones) {
        this.perObservaciones = perObservaciones;
    }

    public String getPerObservaciones() {
        return this.perObservaciones;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerUbicacion(String perUbicacion) {
        this.perUbicacion = perUbicacion;
    }

    public String getPerUbicacion() {
        return this.perUbicacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerClaveInic(String perClaveInic) {
        this.perClaveInic = perClaveInic;
    }

    public String getPerClaveInic() {
        return this.perClaveInic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerCargoFide(String perCargoFide) {
        this.perCargoFide = perCargoFide;
    }

    public String getPerCargoFide() {
        return this.perCargoFide;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerHonInic(String perHonInic) {
        this.perHonInic = perHonInic;
    }

    public String getPerHonInic() {
        return this.perHonInic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerImss(String perImss) {
        this.perImss = perImss;
    }

    public String getPerImss() {
        return this.perImss;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPerAnoVigDel(BigDecimal perAnoVigDel) {
        this.perAnoVigDel = perAnoVigDel;
    }

    public BigDecimal getPerAnoVigDel() {
        return this.perAnoVigDel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerMesVigDel(BigDecimal perMesVigDel) {
        this.perMesVigDel = perMesVigDel;
    }

    public BigDecimal getPerMesVigDel() {
        return this.perMesVigDel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerDiaVigDel(BigDecimal perDiaVigDel) {
        this.perDiaVigDel = perDiaVigDel;
    }

    public BigDecimal getPerDiaVigDel() {
        return this.perDiaVigDel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPerAnoVigAl(BigDecimal perAnoVigAl) {
        this.perAnoVigAl = perAnoVigAl;
    }

    public BigDecimal getPerAnoVigAl() {
        return this.perAnoVigAl;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerMesVigAl(BigDecimal perMesVigAl) {
        this.perMesVigAl = perMesVigAl;
    }

    public BigDecimal getPerMesVigAl() {
        return this.perMesVigAl;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerDiaVigAl(BigDecimal perDiaVigAl) {
        this.perDiaVigAl = perDiaVigAl;
    }

    public BigDecimal getPerDiaVigAl() {
        return this.perDiaVigAl;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumContrato(BigDecimal perNumContrato) {
        this.perNumContrato = perNumContrato;
    }

    public BigDecimal getPerNumContrato() {
        return this.perNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumNivel1(BigDecimal perNumNivel1) {
        this.perNumNivel1 = perNumNivel1;
    }

    public BigDecimal getPerNumNivel1() {
        return this.perNumNivel1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumNivel2(BigDecimal perNumNivel2) {
        this.perNumNivel2 = perNumNivel2;
    }

    public BigDecimal getPerNumNivel2() {
        return this.perNumNivel2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumNivel3(BigDecimal perNumNivel3) {
        this.perNumNivel3 = perNumNivel3;
    }

    public BigDecimal getPerNumNivel3() {
        return this.perNumNivel3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumNivel4(BigDecimal perNumNivel4) {
        this.perNumNivel4 = perNumNivel4;
    }

    public BigDecimal getPerNumNivel4() {
        return this.perNumNivel4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumNivel5(BigDecimal perNumNivel5) {
        this.perNumNivel5 = perNumNivel5;
    }

    public BigDecimal getPerNumNivel5() {
        return this.perNumNivel5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumPuesto(BigDecimal perNumPuesto) {
        this.perNumPuesto = perNumPuesto;
    }

    public BigDecimal getPerNumPuesto() {
        return this.perNumPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerExpLaboral(String perExpLaboral) {
        this.perExpLaboral = perExpLaboral;
    }

    public String getPerExpLaboral() {
        return this.perExpLaboral;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPerAnoCoini(BigDecimal perAnoCoini) {
        this.perAnoCoini = perAnoCoini;
    }

    public BigDecimal getPerAnoCoini() {
        return this.perAnoCoini;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerMesCoini(BigDecimal perMesCoini) {
        this.perMesCoini = perMesCoini;
    }

    public BigDecimal getPerMesCoini() {
        return this.perMesCoini;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerDiaCoini(BigDecimal perDiaCoini) {
        this.perDiaCoini = perDiaCoini;
    }

    public BigDecimal getPerDiaCoini() {
        return this.perDiaCoini;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setPerEdad(BigDecimal perEdad) {
        this.perEdad = perEdad;
    }

    public BigDecimal getPerEdad() {
        return this.perEdad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setPerPjeIngles(BigDecimal perPjeIngles) {
        this.perPjeIngles = perPjeIngles;
    }

    public BigDecimal getPerPjeIngles() {
        return this.perPjeIngles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setPerPjeFrances(BigDecimal perPjeFrances) {
        this.perPjeFrances = perPjeFrances;
    }

    public BigDecimal getPerPjeFrances() {
        return this.perPjeFrances;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setPerPjeOtros(BigDecimal perPjeOtros) {
        this.perPjeOtros = perPjeOtros;
    }

    public BigDecimal getPerPjeOtros() {
        return this.perPjeOtros;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerEspecialidad(String perEspecialidad) {
        this.perEspecialidad = perEspecialidad;
    }

    public String getPerEspecialidad() {
        return this.perEspecialidad;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PERSONAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPerNumUsuario() != null && this.getPerNumUsuario().longValue() == -999) {
            conditions += " AND PER_NUM_USUARIO IS NULL";
        } else if (this.getPerNumUsuario() != null) {
            conditions += " AND PER_NUM_USUARIO = ?";
            values.add(this.getPerNumUsuario());
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
        String sql = "SELECT * FROM PERSONAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPerNomUsuario() != null && "null".equals(this.getPerNomUsuario())) {
            conditions += " AND PER_NOM_USUARIO IS NULL";
        } else if (this.getPerNomUsuario() != null) {
            conditions += " AND PER_NOM_USUARIO = ?";
            values.add(this.getPerNomUsuario());
        }

        if (this.getPerNumUsuario() != null && this.getPerNumUsuario().longValue() == -999) {
            conditions += " AND PER_NUM_USUARIO IS NULL";
        } else if (this.getPerNumUsuario() != null) {
            conditions += " AND PER_NUM_USUARIO = ?";
            values.add(this.getPerNumUsuario());
        }

        if (this.getPerEscIdentifica() != null && this.getPerEscIdentifica().longValue() == -999) {
            conditions += " AND PER_ESC_IDENTIFICA IS NULL";
        } else if (this.getPerEscIdentifica() != null) {
            conditions += " AND PER_ESC_IDENTIFICA = ?";
            values.add(this.getPerEscIdentifica());
        }

        if (this.getPerTprIdentifica() != null && this.getPerTprIdentifica().longValue() == -999) {
            conditions += " AND PER_TPR_IDENTIFICA IS NULL";
        } else if (this.getPerTprIdentifica() != null) {
            conditions += " AND PER_TPR_IDENTIFICA = ?";
            values.add(this.getPerTprIdentifica());
        }

        if (this.getPerClaIdentifica() != null && this.getPerClaIdentifica().longValue() == -999) {
            conditions += " AND PER_CLA_IDENTIFICA IS NULL";
        } else if (this.getPerClaIdentifica() != null) {
            conditions += " AND PER_CLA_IDENTIFICA = ?";
            values.add(this.getPerClaIdentifica());
        }

        if (this.getPerClave() != null && "null".equals(this.getPerClave())) {
            conditions += " AND PER_CLAVE IS NULL";
        } else if (this.getPerClave() != null) {
            conditions += " AND PER_CLAVE = ?";
            values.add(this.getPerClave());
        }

        if (this.getPerRangoNivel() != null && "null".equals(this.getPerRangoNivel())) {
            conditions += " AND PER_RANGO_NIVEL IS NULL";
        } else if (this.getPerRangoNivel() != null) {
            conditions += " AND PER_RANGO_NIVEL = ?";
            values.add(this.getPerRangoNivel());
        }

        if (this.getPerNumNomina() != null && this.getPerNumNomina().longValue() == -999) {
            conditions += " AND PER_NUM_NOMINA IS NULL";
        } else if (this.getPerNumNomina() != null) {
            conditions += " AND PER_NUM_NOMINA = ?";
            values.add(this.getPerNumNomina());
        }

        if (this.getPerSueldoPerc() != null && this.getPerSueldoPerc().longValue() == -999) {
            conditions += " AND PER_SUELDO_PERC IS NULL";
        } else if (this.getPerSueldoPerc() != null) {
            conditions += " AND PER_SUELDO_PERC = ?";
            values.add(this.getPerSueldoPerc());
        }

        if (this.getPerAnoIng() != null && this.getPerAnoIng().longValue() == -999) {
            conditions += " AND PER_ANO_ING IS NULL";
        } else if (this.getPerAnoIng() != null) {
            conditions += " AND PER_ANO_ING = ?";
            values.add(this.getPerAnoIng());
        }

        if (this.getPerMesIng() != null && this.getPerMesIng().longValue() == -999) {
            conditions += " AND PER_MES_ING IS NULL";
        } else if (this.getPerMesIng() != null) {
            conditions += " AND PER_MES_ING = ?";
            values.add(this.getPerMesIng());
        }

        if (this.getPerDiaIng() != null && this.getPerDiaIng().longValue() == -999) {
            conditions += " AND PER_DIA_ING IS NULL";
        } else if (this.getPerDiaIng() != null) {
            conditions += " AND PER_DIA_ING = ?";
            values.add(this.getPerDiaIng());
        }

        if (this.getPerAntigAnos() != null && this.getPerAntigAnos().longValue() == -999) {
            conditions += " AND PER_ANTIG_ANOS IS NULL";
        } else if (this.getPerAntigAnos() != null) {
            conditions += " AND PER_ANTIG_ANOS = ?";
            values.add(this.getPerAntigAnos());
        }

        if (this.getPerNivelEstudios() != null && "null".equals(this.getPerNivelEstudios())) {
            conditions += " AND PER_NIVEL_ESTUDIOS IS NULL";
        } else if (this.getPerNivelEstudios() != null) {
            conditions += " AND PER_NIVEL_ESTUDIOS = ?";
            values.add(this.getPerNivelEstudios());
        }

        if (this.getPerAnoNac() != null && this.getPerAnoNac().longValue() == -999) {
            conditions += " AND PER_ANO_NAC IS NULL";
        } else if (this.getPerAnoNac() != null) {
            conditions += " AND PER_ANO_NAC = ?";
            values.add(this.getPerAnoNac());
        }

        if (this.getPerMesNac() != null && this.getPerMesNac().longValue() == -999) {
            conditions += " AND PER_MES_NAC IS NULL";
        } else if (this.getPerMesNac() != null) {
            conditions += " AND PER_MES_NAC = ?";
            values.add(this.getPerMesNac());
        }

        if (this.getPerDiaNac() != null && this.getPerDiaNac().longValue() == -999) {
            conditions += " AND PER_DIA_NAC IS NULL";
        } else if (this.getPerDiaNac() != null) {
            conditions += " AND PER_DIA_NAC = ?";
            values.add(this.getPerDiaNac());
        }

        if (this.getPerTelefono() != null && "null".equals(this.getPerTelefono())) {
            conditions += " AND PER_TELEFONO IS NULL";
        } else if (this.getPerTelefono() != null) {
            conditions += " AND PER_TELEFONO = ?";
            values.add(this.getPerTelefono());
        }

        if (this.getPerExtension() != null && "null".equals(this.getPerExtension())) {
            conditions += " AND PER_EXTENSION IS NULL";
        } else if (this.getPerExtension() != null) {
            conditions += " AND PER_EXTENSION = ?";
            values.add(this.getPerExtension());
        }

        if (this.getPerFax() != null && "null".equals(this.getPerFax())) {
            conditions += " AND PER_FAX IS NULL";
        } else if (this.getPerFax() != null) {
            conditions += " AND PER_FAX = ?";
            values.add(this.getPerFax());
        }

        if (this.getPerAntigPuesto() != null && "null".equals(this.getPerAntigPuesto())) {
            conditions += " AND PER_ANTIG_PUESTO IS NULL";
        } else if (this.getPerAntigPuesto() != null) {
            conditions += " AND PER_ANTIG_PUESTO = ?";
            values.add(this.getPerAntigPuesto());
        }

        if (this.getPerMotivoMovto() != null && "null".equals(this.getPerMotivoMovto())) {
            conditions += " AND PER_MOTIVO_MOVTO IS NULL";
        } else if (this.getPerMotivoMovto() != null) {
            conditions += " AND PER_MOTIVO_MOVTO = ?";
            values.add(this.getPerMotivoMovto());
        }

        if (this.getPerHonorarios() != null && "null".equals(this.getPerHonorarios())) {
            conditions += " AND PER_HONORARIOS IS NULL";
        } else if (this.getPerHonorarios() != null) {
            conditions += " AND PER_HONORARIOS = ?";
            values.add(this.getPerHonorarios());
        }

        if (this.getPerAnoMotivo() != null && this.getPerAnoMotivo().longValue() == -999) {
            conditions += " AND PER_ANO_MOTIVO IS NULL";
        } else if (this.getPerAnoMotivo() != null) {
            conditions += " AND PER_ANO_MOTIVO = ?";
            values.add(this.getPerAnoMotivo());
        }

        if (this.getPerMesMotivo() != null && this.getPerMesMotivo().longValue() == -999) {
            conditions += " AND PER_MES_MOTIVO IS NULL";
        } else if (this.getPerMesMotivo() != null) {
            conditions += " AND PER_MES_MOTIVO = ?";
            values.add(this.getPerMesMotivo());
        }

        if (this.getPerDiaMotivo() != null && this.getPerDiaMotivo().longValue() == -999) {
            conditions += " AND PER_DIA_MOTIVO IS NULL";
        } else if (this.getPerDiaMotivo() != null) {
            conditions += " AND PER_DIA_MOTIVO = ?";
            values.add(this.getPerDiaMotivo());
        }

        if (this.getPerDireccion() != null && "null".equals(this.getPerDireccion())) {
            conditions += " AND PER_DIRECCION IS NULL";
        } else if (this.getPerDireccion() != null) {
            conditions += " AND PER_DIRECCION = ?";
            values.add(this.getPerDireccion());
        }

        if (this.getPerTelefParti() != null && "null".equals(this.getPerTelefParti())) {
            conditions += " AND PER_TELEF_PARTI IS NULL";
        } else if (this.getPerTelefParti() != null) {
            conditions += " AND PER_TELEF_PARTI = ?";
            values.add(this.getPerTelefParti());
        }

        if (this.getPerEdoCivil() != null && this.getPerEdoCivil().longValue() == -999) {
            conditions += " AND PER_EDO_CIVIL IS NULL";
        } else if (this.getPerEdoCivil() != null) {
            conditions += " AND PER_EDO_CIVIL = ?";
            values.add(this.getPerEdoCivil());
        }

        if (this.getPerSexo() != null && "null".equals(this.getPerSexo())) {
            conditions += " AND PER_SEXO IS NULL";
        } else if (this.getPerSexo() != null) {
            conditions += " AND PER_SEXO = ?";
            values.add(this.getPerSexo());
        }

        if (this.getPerHorarioEsp() != null && "null".equals(this.getPerHorarioEsp())) {
            conditions += " AND PER_HORARIO_ESP IS NULL";
        } else if (this.getPerHorarioEsp() != null) {
            conditions += " AND PER_HORARIO_ESP = ?";
            values.add(this.getPerHorarioEsp());
        }

        if (this.getPerPzaVacante() != null && "null".equals(this.getPerPzaVacante())) {
            conditions += " AND PER_PZA_VACANTE IS NULL";
        } else if (this.getPerPzaVacante() != null) {
            conditions += " AND PER_PZA_VACANTE = ?";
            values.add(this.getPerPzaVacante());
        }

        if (this.getPerNoO() != null && this.getPerNoO().longValue() == -999) {
            conditions += " AND PER_NO_O IS NULL";
        } else if (this.getPerNoO() != null) {
            conditions += " AND PER_NO_O = ?";
            values.add(this.getPerNoO());
        }

        if (this.getPerNoV() != null && this.getPerNoV().longValue() == -999) {
            conditions += " AND PER_NO_V IS NULL";
        } else if (this.getPerNoV() != null) {
            conditions += " AND PER_NO_V = ?";
            values.add(this.getPerNoV());
        }

        if (this.getPerNoHijos() != null && "null".equals(this.getPerNoHijos())) {
            conditions += " AND PER_NO_HIJOS IS NULL";
        } else if (this.getPerNoHijos() != null) {
            conditions += " AND PER_NO_HIJOS = ?";
            values.add(this.getPerNoHijos());
        }

        if (this.getPerRfc() != null && "null".equals(this.getPerRfc())) {
            conditions += " AND PER_RFC IS NULL";
        } else if (this.getPerRfc() != null) {
            conditions += " AND PER_RFC = ?";
            values.add(this.getPerRfc());
        }

        if (this.getPerDesPza() != null && "null".equals(this.getPerDesPza())) {
            conditions += " AND PER_DES_PZA IS NULL";
        } else if (this.getPerDesPza() != null) {
            conditions += " AND PER_DES_PZA = ?";
            values.add(this.getPerDesPza());
        }

        if (this.getPerRegistroAsis() != null && "null".equals(this.getPerRegistroAsis())) {
            conditions += " AND PER_REGISTRO_ASIS IS NULL";
        } else if (this.getPerRegistroAsis() != null) {
            conditions += " AND PER_REGISTRO_ASIS = ?";
            values.add(this.getPerRegistroAsis());
        }

        if (this.getPerObservaciones() != null && "null".equals(this.getPerObservaciones())) {
            conditions += " AND PER_OBSERVACIONES IS NULL";
        } else if (this.getPerObservaciones() != null) {
            conditions += " AND PER_OBSERVACIONES = ?";
            values.add(this.getPerObservaciones());
        }

        if (this.getPerUbicacion() != null && "null".equals(this.getPerUbicacion())) {
            conditions += " AND PER_UBICACION IS NULL";
        } else if (this.getPerUbicacion() != null) {
            conditions += " AND PER_UBICACION = ?";
            values.add(this.getPerUbicacion());
        }

        if (this.getPerClaveInic() != null && "null".equals(this.getPerClaveInic())) {
            conditions += " AND PER_CLAVE_INIC IS NULL";
        } else if (this.getPerClaveInic() != null) {
            conditions += " AND PER_CLAVE_INIC = ?";
            values.add(this.getPerClaveInic());
        }

        if (this.getPerCargoFide() != null && "null".equals(this.getPerCargoFide())) {
            conditions += " AND PER_CARGO_FIDE IS NULL";
        } else if (this.getPerCargoFide() != null) {
            conditions += " AND PER_CARGO_FIDE = ?";
            values.add(this.getPerCargoFide());
        }

        if (this.getPerHonInic() != null && "null".equals(this.getPerHonInic())) {
            conditions += " AND PER_HON_INIC IS NULL";
        } else if (this.getPerHonInic() != null) {
            conditions += " AND PER_HON_INIC = ?";
            values.add(this.getPerHonInic());
        }

        if (this.getPerImss() != null && "null".equals(this.getPerImss())) {
            conditions += " AND PER_IMSS IS NULL";
        } else if (this.getPerImss() != null) {
            conditions += " AND PER_IMSS = ?";
            values.add(this.getPerImss());
        }

        if (this.getPerAnoVigDel() != null && this.getPerAnoVigDel().longValue() == -999) {
            conditions += " AND PER_ANO_VIG_DEL IS NULL";
        } else if (this.getPerAnoVigDel() != null) {
            conditions += " AND PER_ANO_VIG_DEL = ?";
            values.add(this.getPerAnoVigDel());
        }

        if (this.getPerMesVigDel() != null && this.getPerMesVigDel().longValue() == -999) {
            conditions += " AND PER_MES_VIG_DEL IS NULL";
        } else if (this.getPerMesVigDel() != null) {
            conditions += " AND PER_MES_VIG_DEL = ?";
            values.add(this.getPerMesVigDel());
        }

        if (this.getPerDiaVigDel() != null && this.getPerDiaVigDel().longValue() == -999) {
            conditions += " AND PER_DIA_VIG_DEL IS NULL";
        } else if (this.getPerDiaVigDel() != null) {
            conditions += " AND PER_DIA_VIG_DEL = ?";
            values.add(this.getPerDiaVigDel());
        }

        if (this.getPerAnoVigAl() != null && this.getPerAnoVigAl().longValue() == -999) {
            conditions += " AND PER_ANO_VIG_AL IS NULL";
        } else if (this.getPerAnoVigAl() != null) {
            conditions += " AND PER_ANO_VIG_AL = ?";
            values.add(this.getPerAnoVigAl());
        }

        if (this.getPerMesVigAl() != null && this.getPerMesVigAl().longValue() == -999) {
            conditions += " AND PER_MES_VIG_AL IS NULL";
        } else if (this.getPerMesVigAl() != null) {
            conditions += " AND PER_MES_VIG_AL = ?";
            values.add(this.getPerMesVigAl());
        }

        if (this.getPerDiaVigAl() != null && this.getPerDiaVigAl().longValue() == -999) {
            conditions += " AND PER_DIA_VIG_AL IS NULL";
        } else if (this.getPerDiaVigAl() != null) {
            conditions += " AND PER_DIA_VIG_AL = ?";
            values.add(this.getPerDiaVigAl());
        }

        if (this.getPerNumContrato() != null && this.getPerNumContrato().longValue() == -999) {
            conditions += " AND PER_NUM_CONTRATO IS NULL";
        } else if (this.getPerNumContrato() != null) {
            conditions += " AND PER_NUM_CONTRATO = ?";
            values.add(this.getPerNumContrato());
        }

        if (this.getPerNumNivel1() != null && this.getPerNumNivel1().longValue() == -999) {
            conditions += " AND PER_NUM_NIVEL1 IS NULL";
        } else if (this.getPerNumNivel1() != null) {
            conditions += " AND PER_NUM_NIVEL1 = ?";
            values.add(this.getPerNumNivel1());
        }

        if (this.getPerNumNivel2() != null && this.getPerNumNivel2().longValue() == -999) {
            conditions += " AND PER_NUM_NIVEL2 IS NULL";
        } else if (this.getPerNumNivel2() != null) {
            conditions += " AND PER_NUM_NIVEL2 = ?";
            values.add(this.getPerNumNivel2());
        }

        if (this.getPerNumNivel3() != null && this.getPerNumNivel3().longValue() == -999) {
            conditions += " AND PER_NUM_NIVEL3 IS NULL";
        } else if (this.getPerNumNivel3() != null) {
            conditions += " AND PER_NUM_NIVEL3 = ?";
            values.add(this.getPerNumNivel3());
        }

        if (this.getPerNumNivel4() != null && this.getPerNumNivel4().longValue() == -999) {
            conditions += " AND PER_NUM_NIVEL4 IS NULL";
        } else if (this.getPerNumNivel4() != null) {
            conditions += " AND PER_NUM_NIVEL4 = ?";
            values.add(this.getPerNumNivel4());
        }

        if (this.getPerNumNivel5() != null && this.getPerNumNivel5().longValue() == -999) {
            conditions += " AND PER_NUM_NIVEL5 IS NULL";
        } else if (this.getPerNumNivel5() != null) {
            conditions += " AND PER_NUM_NIVEL5 = ?";
            values.add(this.getPerNumNivel5());
        }

        if (this.getPerNumPuesto() != null && this.getPerNumPuesto().longValue() == -999) {
            conditions += " AND PER_NUM_PUESTO IS NULL";
        } else if (this.getPerNumPuesto() != null) {
            conditions += " AND PER_NUM_PUESTO = ?";
            values.add(this.getPerNumPuesto());
        }

        if (this.getPerExpLaboral() != null && "null".equals(this.getPerExpLaboral())) {
            conditions += " AND PER_EXP_LABORAL IS NULL";
        } else if (this.getPerExpLaboral() != null) {
            conditions += " AND PER_EXP_LABORAL = ?";
            values.add(this.getPerExpLaboral());
        }

        if (this.getPerAnoCoini() != null && this.getPerAnoCoini().longValue() == -999) {
            conditions += " AND PER_ANO_COINI IS NULL";
        } else if (this.getPerAnoCoini() != null) {
            conditions += " AND PER_ANO_COINI = ?";
            values.add(this.getPerAnoCoini());
        }

        if (this.getPerMesCoini() != null && this.getPerMesCoini().longValue() == -999) {
            conditions += " AND PER_MES_COINI IS NULL";
        } else if (this.getPerMesCoini() != null) {
            conditions += " AND PER_MES_COINI = ?";
            values.add(this.getPerMesCoini());
        }

        if (this.getPerDiaCoini() != null && this.getPerDiaCoini().longValue() == -999) {
            conditions += " AND PER_DIA_COINI IS NULL";
        } else if (this.getPerDiaCoini() != null) {
            conditions += " AND PER_DIA_COINI = ?";
            values.add(this.getPerDiaCoini());
        }

        if (this.getPerEdad() != null && this.getPerEdad().longValue() == -999) {
            conditions += " AND PER_EDAD IS NULL";
        } else if (this.getPerEdad() != null) {
            conditions += " AND PER_EDAD = ?";
            values.add(this.getPerEdad());
        }

        if (this.getPerPjeIngles() != null && this.getPerPjeIngles().longValue() == -999) {
            conditions += " AND PER_PJE_INGLES IS NULL";
        } else if (this.getPerPjeIngles() != null) {
            conditions += " AND PER_PJE_INGLES = ?";
            values.add(this.getPerPjeIngles());
        }

        if (this.getPerPjeFrances() != null && this.getPerPjeFrances().longValue() == -999) {
            conditions += " AND PER_PJE_FRANCES IS NULL";
        } else if (this.getPerPjeFrances() != null) {
            conditions += " AND PER_PJE_FRANCES = ?";
            values.add(this.getPerPjeFrances());
        }

        if (this.getPerPjeOtros() != null && this.getPerPjeOtros().longValue() == -999) {
            conditions += " AND PER_PJE_OTROS IS NULL";
        } else if (this.getPerPjeOtros() != null) {
            conditions += " AND PER_PJE_OTROS = ?";
            values.add(this.getPerPjeOtros());
        }

        if (this.getPerEspecialidad() != null && "null".equals(this.getPerEspecialidad())) {
            conditions += " AND PER_ESPECIALIDAD IS NULL";
        } else if (this.getPerEspecialidad() != null) {
            conditions += " AND PER_ESPECIALIDAD = ?";
            values.add(this.getPerEspecialidad());
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
        String sql = "UPDATE PERSONAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " PER_NOM_USUARIO = ?, ";
        values.add(this.getPerNomUsuario());
        conditions += " AND PER_NUM_USUARIO = ?";
        pkValues.add(this.getPerNumUsuario());
        fields += " PER_ESC_IDENTIFICA = ?, ";
        values.add(this.getPerEscIdentifica());
        fields += " PER_TPR_IDENTIFICA = ?, ";
        values.add(this.getPerTprIdentifica());
        fields += " PER_CLA_IDENTIFICA = ?, ";
        values.add(this.getPerClaIdentifica());
        fields += " PER_CLAVE = ?, ";
        values.add(this.getPerClave());
        fields += " PER_RANGO_NIVEL = ?, ";
        values.add(this.getPerRangoNivel());
        fields += " PER_NUM_NOMINA = ?, ";
        values.add(this.getPerNumNomina());
        fields += " PER_SUELDO_PERC = ?, ";
        values.add(this.getPerSueldoPerc());
        fields += " PER_ANO_ING = ?, ";
        values.add(this.getPerAnoIng());
        fields += " PER_MES_ING = ?, ";
        values.add(this.getPerMesIng());
        fields += " PER_DIA_ING = ?, ";
        values.add(this.getPerDiaIng());
        fields += " PER_ANTIG_ANOS = ?, ";
        values.add(this.getPerAntigAnos());
        fields += " PER_NIVEL_ESTUDIOS = ?, ";
        values.add(this.getPerNivelEstudios());
        fields += " PER_ANO_NAC = ?, ";
        values.add(this.getPerAnoNac());
        fields += " PER_MES_NAC = ?, ";
        values.add(this.getPerMesNac());
        fields += " PER_DIA_NAC = ?, ";
        values.add(this.getPerDiaNac());
        fields += " PER_TELEFONO = ?, ";
        values.add(this.getPerTelefono());
        fields += " PER_EXTENSION = ?, ";
        values.add(this.getPerExtension());
        fields += " PER_FAX = ?, ";
        values.add(this.getPerFax());
        fields += " PER_ANTIG_PUESTO = ?, ";
        values.add(this.getPerAntigPuesto());
        fields += " PER_MOTIVO_MOVTO = ?, ";
        values.add(this.getPerMotivoMovto());
        fields += " PER_HONORARIOS = ?, ";
        values.add(this.getPerHonorarios());
        fields += " PER_ANO_MOTIVO = ?, ";
        values.add(this.getPerAnoMotivo());
        fields += " PER_MES_MOTIVO = ?, ";
        values.add(this.getPerMesMotivo());
        fields += " PER_DIA_MOTIVO = ?, ";
        values.add(this.getPerDiaMotivo());
        fields += " PER_DIRECCION = ?, ";
        values.add(this.getPerDireccion());
        fields += " PER_TELEF_PARTI = ?, ";
        values.add(this.getPerTelefParti());
        fields += " PER_EDO_CIVIL = ?, ";
        values.add(this.getPerEdoCivil());
        fields += " PER_SEXO = ?, ";
        values.add(this.getPerSexo());
        fields += " PER_HORARIO_ESP = ?, ";
        values.add(this.getPerHorarioEsp());
        fields += " PER_PZA_VACANTE = ?, ";
        values.add(this.getPerPzaVacante());
        fields += " PER_NO_O = ?, ";
        values.add(this.getPerNoO());
        fields += " PER_NO_V = ?, ";
        values.add(this.getPerNoV());
        fields += " PER_NO_HIJOS = ?, ";
        values.add(this.getPerNoHijos());
        fields += " PER_RFC = ?, ";
        values.add(this.getPerRfc());
        fields += " PER_DES_PZA = ?, ";
        values.add(this.getPerDesPza());
        fields += " PER_REGISTRO_ASIS = ?, ";
        values.add(this.getPerRegistroAsis());
        fields += " PER_OBSERVACIONES = ?, ";
        values.add(this.getPerObservaciones());
        fields += " PER_UBICACION = ?, ";
        values.add(this.getPerUbicacion());
        fields += " PER_CLAVE_INIC = ?, ";
        values.add(this.getPerClaveInic());
        fields += " PER_CARGO_FIDE = ?, ";
        values.add(this.getPerCargoFide());
        fields += " PER_HON_INIC = ?, ";
        values.add(this.getPerHonInic());
        fields += " PER_IMSS = ?, ";
        values.add(this.getPerImss());
        fields += " PER_ANO_VIG_DEL = ?, ";
        values.add(this.getPerAnoVigDel());
        fields += " PER_MES_VIG_DEL = ?, ";
        values.add(this.getPerMesVigDel());
        fields += " PER_DIA_VIG_DEL = ?, ";
        values.add(this.getPerDiaVigDel());
        fields += " PER_ANO_VIG_AL = ?, ";
        values.add(this.getPerAnoVigAl());
        fields += " PER_MES_VIG_AL = ?, ";
        values.add(this.getPerMesVigAl());
        fields += " PER_DIA_VIG_AL = ?, ";
        values.add(this.getPerDiaVigAl());
        fields += " PER_NUM_CONTRATO = ?, ";
        values.add(this.getPerNumContrato());
        fields += " PER_NUM_NIVEL1 = ?, ";
        values.add(this.getPerNumNivel1());
        fields += " PER_NUM_NIVEL2 = ?, ";
        values.add(this.getPerNumNivel2());
        fields += " PER_NUM_NIVEL3 = ?, ";
        values.add(this.getPerNumNivel3());
        fields += " PER_NUM_NIVEL4 = ?, ";
        values.add(this.getPerNumNivel4());
        fields += " PER_NUM_NIVEL5 = ?, ";
        values.add(this.getPerNumNivel5());
        fields += " PER_NUM_PUESTO = ?, ";
        values.add(this.getPerNumPuesto());
        fields += " PER_EXP_LABORAL = ?, ";
        values.add(this.getPerExpLaboral());
        fields += " PER_ANO_COINI = ?, ";
        values.add(this.getPerAnoCoini());
        fields += " PER_MES_COINI = ?, ";
        values.add(this.getPerMesCoini());
        fields += " PER_DIA_COINI = ?, ";
        values.add(this.getPerDiaCoini());
        fields += " PER_EDAD = ?, ";
        values.add(this.getPerEdad());
        fields += " PER_PJE_INGLES = ?, ";
        values.add(this.getPerPjeIngles());
        fields += " PER_PJE_FRANCES = ?, ";
        values.add(this.getPerPjeFrances());
        fields += " PER_PJE_OTROS = ?, ";
        values.add(this.getPerPjeOtros());
        fields += " PER_ESPECIALIDAD = ?, ";
        values.add(this.getPerEspecialidad());
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
        String sql = "INSERT INTO PERSONAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PER_NOM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getPerNomUsuario());

        fields += ", PER_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getPerNumUsuario());

        fields += ", PER_ESC_IDENTIFICA";
        fieldValues += ", ?";
        values.add(this.getPerEscIdentifica());

        fields += ", PER_TPR_IDENTIFICA";
        fieldValues += ", ?";
        values.add(this.getPerTprIdentifica());

        fields += ", PER_CLA_IDENTIFICA";
        fieldValues += ", ?";
        values.add(this.getPerClaIdentifica());

        fields += ", PER_CLAVE";
        fieldValues += ", ?";
        values.add(this.getPerClave());

        fields += ", PER_RANGO_NIVEL";
        fieldValues += ", ?";
        values.add(this.getPerRangoNivel());

        fields += ", PER_NUM_NOMINA";
        fieldValues += ", ?";
        values.add(this.getPerNumNomina());

        fields += ", PER_SUELDO_PERC";
        fieldValues += ", ?";
        values.add(this.getPerSueldoPerc());

        fields += ", PER_ANO_ING";
        fieldValues += ", ?";
        values.add(this.getPerAnoIng());

        fields += ", PER_MES_ING";
        fieldValues += ", ?";
        values.add(this.getPerMesIng());

        fields += ", PER_DIA_ING";
        fieldValues += ", ?";
        values.add(this.getPerDiaIng());

        fields += ", PER_ANTIG_ANOS";
        fieldValues += ", ?";
        values.add(this.getPerAntigAnos());

        fields += ", PER_NIVEL_ESTUDIOS";
        fieldValues += ", ?";
        values.add(this.getPerNivelEstudios());

        fields += ", PER_ANO_NAC";
        fieldValues += ", ?";
        values.add(this.getPerAnoNac());

        fields += ", PER_MES_NAC";
        fieldValues += ", ?";
        values.add(this.getPerMesNac());

        fields += ", PER_DIA_NAC";
        fieldValues += ", ?";
        values.add(this.getPerDiaNac());

        fields += ", PER_TELEFONO";
        fieldValues += ", ?";
        values.add(this.getPerTelefono());

        fields += ", PER_EXTENSION";
        fieldValues += ", ?";
        values.add(this.getPerExtension());

        fields += ", PER_FAX";
        fieldValues += ", ?";
        values.add(this.getPerFax());

        fields += ", PER_ANTIG_PUESTO";
        fieldValues += ", ?";
        values.add(this.getPerAntigPuesto());

        fields += ", PER_MOTIVO_MOVTO";
        fieldValues += ", ?";
        values.add(this.getPerMotivoMovto());

        fields += ", PER_HONORARIOS";
        fieldValues += ", ?";
        values.add(this.getPerHonorarios());

        fields += ", PER_ANO_MOTIVO";
        fieldValues += ", ?";
        values.add(this.getPerAnoMotivo());

        fields += ", PER_MES_MOTIVO";
        fieldValues += ", ?";
        values.add(this.getPerMesMotivo());

        fields += ", PER_DIA_MOTIVO";
        fieldValues += ", ?";
        values.add(this.getPerDiaMotivo());

        fields += ", PER_DIRECCION";
        fieldValues += ", ?";
        values.add(this.getPerDireccion());

        fields += ", PER_TELEF_PARTI";
        fieldValues += ", ?";
        values.add(this.getPerTelefParti());

        fields += ", PER_EDO_CIVIL";
        fieldValues += ", ?";
        values.add(this.getPerEdoCivil());

        fields += ", PER_SEXO";
        fieldValues += ", ?";
        values.add(this.getPerSexo());

        fields += ", PER_HORARIO_ESP";
        fieldValues += ", ?";
        values.add(this.getPerHorarioEsp());

        fields += ", PER_PZA_VACANTE";
        fieldValues += ", ?";
        values.add(this.getPerPzaVacante());

        fields += ", PER_NO_O";
        fieldValues += ", ?";
        values.add(this.getPerNoO());

        fields += ", PER_NO_V";
        fieldValues += ", ?";
        values.add(this.getPerNoV());

        fields += ", PER_NO_HIJOS";
        fieldValues += ", ?";
        values.add(this.getPerNoHijos());

        fields += ", PER_RFC";
        fieldValues += ", ?";
        values.add(this.getPerRfc());

        fields += ", PER_DES_PZA";
        fieldValues += ", ?";
        values.add(this.getPerDesPza());

        fields += ", PER_REGISTRO_ASIS";
        fieldValues += ", ?";
        values.add(this.getPerRegistroAsis());

        fields += ", PER_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getPerObservaciones());

        fields += ", PER_UBICACION";
        fieldValues += ", ?";
        values.add(this.getPerUbicacion());

        fields += ", PER_CLAVE_INIC";
        fieldValues += ", ?";
        values.add(this.getPerClaveInic());

        fields += ", PER_CARGO_FIDE";
        fieldValues += ", ?";
        values.add(this.getPerCargoFide());

        fields += ", PER_HON_INIC";
        fieldValues += ", ?";
        values.add(this.getPerHonInic());

        fields += ", PER_IMSS";
        fieldValues += ", ?";
        values.add(this.getPerImss());

        fields += ", PER_ANO_VIG_DEL";
        fieldValues += ", ?";
        values.add(this.getPerAnoVigDel());

        fields += ", PER_MES_VIG_DEL";
        fieldValues += ", ?";
        values.add(this.getPerMesVigDel());

        fields += ", PER_DIA_VIG_DEL";
        fieldValues += ", ?";
        values.add(this.getPerDiaVigDel());

        fields += ", PER_ANO_VIG_AL";
        fieldValues += ", ?";
        values.add(this.getPerAnoVigAl());

        fields += ", PER_MES_VIG_AL";
        fieldValues += ", ?";
        values.add(this.getPerMesVigAl());

        fields += ", PER_DIA_VIG_AL";
        fieldValues += ", ?";
        values.add(this.getPerDiaVigAl());

        fields += ", PER_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPerNumContrato());

        fields += ", PER_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getPerNumNivel1());

        fields += ", PER_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getPerNumNivel2());

        fields += ", PER_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getPerNumNivel3());

        fields += ", PER_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getPerNumNivel4());

        fields += ", PER_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getPerNumNivel5());

        fields += ", PER_NUM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getPerNumPuesto());

        fields += ", PER_EXP_LABORAL";
        fieldValues += ", ?";
        values.add(this.getPerExpLaboral());

        fields += ", PER_ANO_COINI";
        fieldValues += ", ?";
        values.add(this.getPerAnoCoini());

        fields += ", PER_MES_COINI";
        fieldValues += ", ?";
        values.add(this.getPerMesCoini());

        fields += ", PER_DIA_COINI";
        fieldValues += ", ?";
        values.add(this.getPerDiaCoini());

        fields += ", PER_EDAD";
        fieldValues += ", ?";
        values.add(this.getPerEdad());

        fields += ", PER_PJE_INGLES";
        fieldValues += ", ?";
        values.add(this.getPerPjeIngles());

        fields += ", PER_PJE_FRANCES";
        fieldValues += ", ?";
        values.add(this.getPerPjeFrances());

        fields += ", PER_PJE_OTROS";
        fieldValues += ", ?";
        values.add(this.getPerPjeOtros());

        fields += ", PER_ESPECIALIDAD";
        fieldValues += ", ?";
        values.add(this.getPerEspecialidad());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PERSONAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PER_NUM_USUARIO = ?";
        values.add(this.getPerNumUsuario());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Personal instance = (Personal) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPerNomUsuario().equals(instance.getPerNomUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumUsuario().equals(instance.getPerNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getPerEscIdentifica().equals(instance.getPerEscIdentifica()))
            equalObjects = false;
        if (equalObjects && !this.getPerTprIdentifica().equals(instance.getPerTprIdentifica()))
            equalObjects = false;
        if (equalObjects && !this.getPerClaIdentifica().equals(instance.getPerClaIdentifica()))
            equalObjects = false;
        if (equalObjects && !this.getPerClave().equals(instance.getPerClave()))
            equalObjects = false;
        if (equalObjects && !this.getPerRangoNivel().equals(instance.getPerRangoNivel()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumNomina().equals(instance.getPerNumNomina()))
            equalObjects = false;
        if (equalObjects && !this.getPerSueldoPerc().equals(instance.getPerSueldoPerc()))
            equalObjects = false;
        if (equalObjects && !this.getPerAnoIng().equals(instance.getPerAnoIng()))
            equalObjects = false;
        if (equalObjects && !this.getPerMesIng().equals(instance.getPerMesIng()))
            equalObjects = false;
        if (equalObjects && !this.getPerDiaIng().equals(instance.getPerDiaIng()))
            equalObjects = false;
        if (equalObjects && !this.getPerAntigAnos().equals(instance.getPerAntigAnos()))
            equalObjects = false;
        if (equalObjects && !this.getPerNivelEstudios().equals(instance.getPerNivelEstudios()))
            equalObjects = false;
        if (equalObjects && !this.getPerAnoNac().equals(instance.getPerAnoNac()))
            equalObjects = false;
        if (equalObjects && !this.getPerMesNac().equals(instance.getPerMesNac()))
            equalObjects = false;
        if (equalObjects && !this.getPerDiaNac().equals(instance.getPerDiaNac()))
            equalObjects = false;
        if (equalObjects && !this.getPerTelefono().equals(instance.getPerTelefono()))
            equalObjects = false;
        if (equalObjects && !this.getPerExtension().equals(instance.getPerExtension()))
            equalObjects = false;
        if (equalObjects && !this.getPerFax().equals(instance.getPerFax()))
            equalObjects = false;
        if (equalObjects && !this.getPerAntigPuesto().equals(instance.getPerAntigPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getPerMotivoMovto().equals(instance.getPerMotivoMovto()))
            equalObjects = false;
        if (equalObjects && !this.getPerHonorarios().equals(instance.getPerHonorarios()))
            equalObjects = false;
        if (equalObjects && !this.getPerAnoMotivo().equals(instance.getPerAnoMotivo()))
            equalObjects = false;
        if (equalObjects && !this.getPerMesMotivo().equals(instance.getPerMesMotivo()))
            equalObjects = false;
        if (equalObjects && !this.getPerDiaMotivo().equals(instance.getPerDiaMotivo()))
            equalObjects = false;
        if (equalObjects && !this.getPerDireccion().equals(instance.getPerDireccion()))
            equalObjects = false;
        if (equalObjects && !this.getPerTelefParti().equals(instance.getPerTelefParti()))
            equalObjects = false;
        if (equalObjects && !this.getPerEdoCivil().equals(instance.getPerEdoCivil()))
            equalObjects = false;
        if (equalObjects && !this.getPerSexo().equals(instance.getPerSexo()))
            equalObjects = false;
        if (equalObjects && !this.getPerHorarioEsp().equals(instance.getPerHorarioEsp()))
            equalObjects = false;
        if (equalObjects && !this.getPerPzaVacante().equals(instance.getPerPzaVacante()))
            equalObjects = false;
        if (equalObjects && !this.getPerNoO().equals(instance.getPerNoO()))
            equalObjects = false;
        if (equalObjects && !this.getPerNoV().equals(instance.getPerNoV()))
            equalObjects = false;
        if (equalObjects && !this.getPerNoHijos().equals(instance.getPerNoHijos()))
            equalObjects = false;
        if (equalObjects && !this.getPerRfc().equals(instance.getPerRfc()))
            equalObjects = false;
        if (equalObjects && !this.getPerDesPza().equals(instance.getPerDesPza()))
            equalObjects = false;
        if (equalObjects && !this.getPerRegistroAsis().equals(instance.getPerRegistroAsis()))
            equalObjects = false;
        if (equalObjects && !this.getPerObservaciones().equals(instance.getPerObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getPerUbicacion().equals(instance.getPerUbicacion()))
            equalObjects = false;
        if (equalObjects && !this.getPerClaveInic().equals(instance.getPerClaveInic()))
            equalObjects = false;
        if (equalObjects && !this.getPerCargoFide().equals(instance.getPerCargoFide()))
            equalObjects = false;
        if (equalObjects && !this.getPerHonInic().equals(instance.getPerHonInic()))
            equalObjects = false;
        if (equalObjects && !this.getPerImss().equals(instance.getPerImss()))
            equalObjects = false;
        if (equalObjects && !this.getPerAnoVigDel().equals(instance.getPerAnoVigDel()))
            equalObjects = false;
        if (equalObjects && !this.getPerMesVigDel().equals(instance.getPerMesVigDel()))
            equalObjects = false;
        if (equalObjects && !this.getPerDiaVigDel().equals(instance.getPerDiaVigDel()))
            equalObjects = false;
        if (equalObjects && !this.getPerAnoVigAl().equals(instance.getPerAnoVigAl()))
            equalObjects = false;
        if (equalObjects && !this.getPerMesVigAl().equals(instance.getPerMesVigAl()))
            equalObjects = false;
        if (equalObjects && !this.getPerDiaVigAl().equals(instance.getPerDiaVigAl()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumContrato().equals(instance.getPerNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumNivel1().equals(instance.getPerNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumNivel2().equals(instance.getPerNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumNivel3().equals(instance.getPerNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumNivel4().equals(instance.getPerNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumNivel5().equals(instance.getPerNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumPuesto().equals(instance.getPerNumPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getPerExpLaboral().equals(instance.getPerExpLaboral()))
            equalObjects = false;
        if (equalObjects && !this.getPerAnoCoini().equals(instance.getPerAnoCoini()))
            equalObjects = false;
        if (equalObjects && !this.getPerMesCoini().equals(instance.getPerMesCoini()))
            equalObjects = false;
        if (equalObjects && !this.getPerDiaCoini().equals(instance.getPerDiaCoini()))
            equalObjects = false;
        if (equalObjects && !this.getPerEdad().equals(instance.getPerEdad()))
            equalObjects = false;
        if (equalObjects && !this.getPerPjeIngles().equals(instance.getPerPjeIngles()))
            equalObjects = false;
        if (equalObjects && !this.getPerPjeFrances().equals(instance.getPerPjeFrances()))
            equalObjects = false;
        if (equalObjects && !this.getPerPjeOtros().equals(instance.getPerPjeOtros()))
            equalObjects = false;
        if (equalObjects && !this.getPerEspecialidad().equals(instance.getPerEspecialidad()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Personal result = new Personal();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPerNomUsuario((String) objectData.getData("PER_NOM_USUARIO"));
        result.setPerNumUsuario((BigDecimal) objectData.getData("PER_NUM_USUARIO"));
        result.setPerEscIdentifica((BigDecimal) objectData.getData("PER_ESC_IDENTIFICA"));
        result.setPerTprIdentifica((BigDecimal) objectData.getData("PER_TPR_IDENTIFICA"));
        result.setPerClaIdentifica((BigDecimal) objectData.getData("PER_CLA_IDENTIFICA"));
        result.setPerClave((String) objectData.getData("PER_CLAVE"));
        result.setPerRangoNivel((String) objectData.getData("PER_RANGO_NIVEL"));
        result.setPerNumNomina((BigDecimal) objectData.getData("PER_NUM_NOMINA"));
        result.setPerSueldoPerc((BigDecimal) objectData.getData("PER_SUELDO_PERC"));
        result.setPerAnoIng((BigDecimal) objectData.getData("PER_ANO_ING"));
        result.setPerMesIng((BigDecimal) objectData.getData("PER_MES_ING"));
        result.setPerDiaIng((BigDecimal) objectData.getData("PER_DIA_ING"));
        result.setPerAntigAnos((BigDecimal) objectData.getData("PER_ANTIG_ANOS"));
        result.setPerNivelEstudios((String) objectData.getData("PER_NIVEL_ESTUDIOS"));
        result.setPerAnoNac((BigDecimal) objectData.getData("PER_ANO_NAC"));
        result.setPerMesNac((BigDecimal) objectData.getData("PER_MES_NAC"));
        result.setPerDiaNac((BigDecimal) objectData.getData("PER_DIA_NAC"));
        result.setPerTelefono((String) objectData.getData("PER_TELEFONO"));
        result.setPerExtension((String) objectData.getData("PER_EXTENSION"));
        result.setPerFax((String) objectData.getData("PER_FAX"));
        result.setPerAntigPuesto((String) objectData.getData("PER_ANTIG_PUESTO"));
        result.setPerMotivoMovto((String) objectData.getData("PER_MOTIVO_MOVTO"));
        result.setPerHonorarios((String) objectData.getData("PER_HONORARIOS"));
        result.setPerAnoMotivo((BigDecimal) objectData.getData("PER_ANO_MOTIVO"));
        result.setPerMesMotivo((BigDecimal) objectData.getData("PER_MES_MOTIVO"));
        result.setPerDiaMotivo((BigDecimal) objectData.getData("PER_DIA_MOTIVO"));
        result.setPerDireccion((String) objectData.getData("PER_DIRECCION"));
        result.setPerTelefParti((String) objectData.getData("PER_TELEF_PARTI"));
        result.setPerEdoCivil((BigDecimal) objectData.getData("PER_EDO_CIVIL"));
        result.setPerSexo((String) objectData.getData("PER_SEXO"));
        result.setPerHorarioEsp((String) objectData.getData("PER_HORARIO_ESP"));
        result.setPerPzaVacante((String) objectData.getData("PER_PZA_VACANTE"));
        result.setPerNoO((BigDecimal) objectData.getData("PER_NO_O"));
        result.setPerNoV((BigDecimal) objectData.getData("PER_NO_V"));
        result.setPerNoHijos((String) objectData.getData("PER_NO_HIJOS"));
        result.setPerRfc((String) objectData.getData("PER_RFC"));
        result.setPerDesPza((String) objectData.getData("PER_DES_PZA"));
        result.setPerRegistroAsis((String) objectData.getData("PER_REGISTRO_ASIS"));
        result.setPerObservaciones((String) objectData.getData("PER_OBSERVACIONES"));
        result.setPerUbicacion((String) objectData.getData("PER_UBICACION"));
        result.setPerClaveInic((String) objectData.getData("PER_CLAVE_INIC"));
        result.setPerCargoFide((String) objectData.getData("PER_CARGO_FIDE"));
        result.setPerHonInic((String) objectData.getData("PER_HON_INIC"));
        result.setPerImss((String) objectData.getData("PER_IMSS"));
        result.setPerAnoVigDel((BigDecimal) objectData.getData("PER_ANO_VIG_DEL"));
        result.setPerMesVigDel((BigDecimal) objectData.getData("PER_MES_VIG_DEL"));
        result.setPerDiaVigDel((BigDecimal) objectData.getData("PER_DIA_VIG_DEL"));
        result.setPerAnoVigAl((BigDecimal) objectData.getData("PER_ANO_VIG_AL"));
        result.setPerMesVigAl((BigDecimal) objectData.getData("PER_MES_VIG_AL"));
        result.setPerDiaVigAl((BigDecimal) objectData.getData("PER_DIA_VIG_AL"));
        result.setPerNumContrato((BigDecimal) objectData.getData("PER_NUM_CONTRATO"));
        result.setPerNumNivel1((BigDecimal) objectData.getData("PER_NUM_NIVEL1"));
        result.setPerNumNivel2((BigDecimal) objectData.getData("PER_NUM_NIVEL2"));
        result.setPerNumNivel3((BigDecimal) objectData.getData("PER_NUM_NIVEL3"));
        result.setPerNumNivel4((BigDecimal) objectData.getData("PER_NUM_NIVEL4"));
        result.setPerNumNivel5((BigDecimal) objectData.getData("PER_NUM_NIVEL5"));
        result.setPerNumPuesto((BigDecimal) objectData.getData("PER_NUM_PUESTO"));
        result.setPerExpLaboral((String) objectData.getData("PER_EXP_LABORAL"));
        result.setPerAnoCoini((BigDecimal) objectData.getData("PER_ANO_COINI"));
        result.setPerMesCoini((BigDecimal) objectData.getData("PER_MES_COINI"));
        result.setPerDiaCoini((BigDecimal) objectData.getData("PER_DIA_COINI"));
        result.setPerEdad((BigDecimal) objectData.getData("PER_EDAD"));
        result.setPerPjeIngles((BigDecimal) objectData.getData("PER_PJE_INGLES"));
        result.setPerPjeFrances((BigDecimal) objectData.getData("PER_PJE_FRANCES"));
        result.setPerPjeOtros((BigDecimal) objectData.getData("PER_PJE_OTROS"));
        result.setPerEspecialidad((String) objectData.getData("PER_ESPECIALIDAD"));

        return result;

    }

}
