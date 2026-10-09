package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PODERES_PK", columns = { "POD_ID_PODER", "POD_NUM_PODER" }, sequences = { "MANUAL" })
public class Poderes extends DomainObject {

    BigDecimal podIdPoder = null;
    BigDecimal podNumPoder = null;
    BigDecimal podNumContrato = null;
    String podTipoApoderado = null;
    String podNomApoderado = null;
    BigDecimal podContrato = null;
    BigDecimal podConsejoDir = null;
    BigDecimal podFodeocomisario = null;
    BigDecimal podReglasOper = null;
    BigDecimal podComiteTec = null;
    BigDecimal podOtro = null;
    BigDecimal podPoliticas = null;
    BigDecimal podFideicomitente = null;
    String podComentario = null;
    String podEscrituraOto = null;
    String podFecEscrOto = null;
    BigDecimal podNotarioOto = null;
    BigDecimal podTipoGeneral = null;
    BigDecimal podPleitosCobran = null;
    BigDecimal podAdmLocal = null;
    BigDecimal podActDominio = null;
    BigDecimal podActAdmon = null;
    BigDecimal podSusTitCred = null;
    BigDecimal podTipoEspecial = null;
    String podComentarioOto = null;
    String podFacSustitucio = null;
    BigDecimal podInsRegpubOto = null;
    String podFolMercanOto = null;
    String podFecRegOto = null;
    BigDecimal podAbogadoOto = null;
    String podFecSolOto = null;
    String podEscrituraRev = null;
    String podFecEscrRev = null;
    BigDecimal podNotarioRev = null;
    String podComentarioRev = null;
    BigDecimal podInsregPubRev = null;
    String podFolMercaRev = null;
    String podFecRegRev = null;
    BigDecimal podAbogadoRev = null;
    String podFecSolRev = null;
    BigDecimal podAnoAltaReg = null;
    BigDecimal podMesAltaReg = null;
    BigDecimal podDiaAltaReg = null;
    BigDecimal podAnoUltMod = null;
    BigDecimal podMesUltMod = null;
    BigDecimal podDiaUltMod = null;
    String podCveStPoderes = null;
    String podDesEspecia = null;
    String podTipoPoder = null;

    public Poderes() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPodIdPoder(BigDecimal podIdPoder) {
        this.podIdPoder = podIdPoder;
    }

    public BigDecimal getPodIdPoder() {
        return this.podIdPoder;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPodNumPoder(BigDecimal podNumPoder) {
        this.podNumPoder = podNumPoder;
    }

    public BigDecimal getPodNumPoder() {
        return this.podNumPoder;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPodNumContrato(BigDecimal podNumContrato) {
        this.podNumContrato = podNumContrato;
    }

    public BigDecimal getPodNumContrato() {
        return this.podNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodTipoApoderado(String podTipoApoderado) {
        this.podTipoApoderado = podTipoApoderado;
    }

    public String getPodTipoApoderado() {
        return this.podTipoApoderado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodNomApoderado(String podNomApoderado) {
        this.podNomApoderado = podNomApoderado;
    }

    public String getPodNomApoderado() {
        return this.podNomApoderado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodContrato(BigDecimal podContrato) {
        this.podContrato = podContrato;
    }

    public BigDecimal getPodContrato() {
        return this.podContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodConsejoDir(BigDecimal podConsejoDir) {
        this.podConsejoDir = podConsejoDir;
    }

    public BigDecimal getPodConsejoDir() {
        return this.podConsejoDir;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodFodeocomisario(BigDecimal podFodeocomisario) {
        this.podFodeocomisario = podFodeocomisario;
    }

    public BigDecimal getPodFodeocomisario() {
        return this.podFodeocomisario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodReglasOper(BigDecimal podReglasOper) {
        this.podReglasOper = podReglasOper;
    }

    public BigDecimal getPodReglasOper() {
        return this.podReglasOper;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodComiteTec(BigDecimal podComiteTec) {
        this.podComiteTec = podComiteTec;
    }

    public BigDecimal getPodComiteTec() {
        return this.podComiteTec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodOtro(BigDecimal podOtro) {
        this.podOtro = podOtro;
    }

    public BigDecimal getPodOtro() {
        return this.podOtro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodPoliticas(BigDecimal podPoliticas) {
        this.podPoliticas = podPoliticas;
    }

    public BigDecimal getPodPoliticas() {
        return this.podPoliticas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodFideicomitente(BigDecimal podFideicomitente) {
        this.podFideicomitente = podFideicomitente;
    }

    public BigDecimal getPodFideicomitente() {
        return this.podFideicomitente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodComentario(String podComentario) {
        this.podComentario = podComentario;
    }

    public String getPodComentario() {
        return this.podComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodEscrituraOto(String podEscrituraOto) {
        this.podEscrituraOto = podEscrituraOto;
    }

    public String getPodEscrituraOto() {
        return this.podEscrituraOto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFecEscrOto(String podFecEscrOto) {
        this.podFecEscrOto = podFecEscrOto;
    }

    public String getPodFecEscrOto() {
        return this.podFecEscrOto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPodNotarioOto(BigDecimal podNotarioOto) {
        this.podNotarioOto = podNotarioOto;
    }

    public BigDecimal getPodNotarioOto() {
        return this.podNotarioOto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodTipoGeneral(BigDecimal podTipoGeneral) {
        this.podTipoGeneral = podTipoGeneral;
    }

    public BigDecimal getPodTipoGeneral() {
        return this.podTipoGeneral;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodPleitosCobran(BigDecimal podPleitosCobran) {
        this.podPleitosCobran = podPleitosCobran;
    }

    public BigDecimal getPodPleitosCobran() {
        return this.podPleitosCobran;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodAdmLocal(BigDecimal podAdmLocal) {
        this.podAdmLocal = podAdmLocal;
    }

    public BigDecimal getPodAdmLocal() {
        return this.podAdmLocal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodActDominio(BigDecimal podActDominio) {
        this.podActDominio = podActDominio;
    }

    public BigDecimal getPodActDominio() {
        return this.podActDominio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodActAdmon(BigDecimal podActAdmon) {
        this.podActAdmon = podActAdmon;
    }

    public BigDecimal getPodActAdmon() {
        return this.podActAdmon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodSusTitCred(BigDecimal podSusTitCred) {
        this.podSusTitCred = podSusTitCred;
    }

    public BigDecimal getPodSusTitCred() {
        return this.podSusTitCred;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodTipoEspecial(BigDecimal podTipoEspecial) {
        this.podTipoEspecial = podTipoEspecial;
    }

    public BigDecimal getPodTipoEspecial() {
        return this.podTipoEspecial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodComentarioOto(String podComentarioOto) {
        this.podComentarioOto = podComentarioOto;
    }

    public String getPodComentarioOto() {
        return this.podComentarioOto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFacSustitucio(String podFacSustitucio) {
        this.podFacSustitucio = podFacSustitucio;
    }

    public String getPodFacSustitucio() {
        return this.podFacSustitucio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodInsRegpubOto(BigDecimal podInsRegpubOto) {
        this.podInsRegpubOto = podInsRegpubOto;
    }

    public BigDecimal getPodInsRegpubOto() {
        return this.podInsRegpubOto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFolMercanOto(String podFolMercanOto) {
        this.podFolMercanOto = podFolMercanOto;
    }

    public String getPodFolMercanOto() {
        return this.podFolMercanOto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFecRegOto(String podFecRegOto) {
        this.podFecRegOto = podFecRegOto;
    }

    public String getPodFecRegOto() {
        return this.podFecRegOto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setPodAbogadoOto(BigDecimal podAbogadoOto) {
        this.podAbogadoOto = podAbogadoOto;
    }

    public BigDecimal getPodAbogadoOto() {
        return this.podAbogadoOto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFecSolOto(String podFecSolOto) {
        this.podFecSolOto = podFecSolOto;
    }

    public String getPodFecSolOto() {
        return this.podFecSolOto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodEscrituraRev(String podEscrituraRev) {
        this.podEscrituraRev = podEscrituraRev;
    }

    public String getPodEscrituraRev() {
        return this.podEscrituraRev;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFecEscrRev(String podFecEscrRev) {
        this.podFecEscrRev = podFecEscrRev;
    }

    public String getPodFecEscrRev() {
        return this.podFecEscrRev;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPodNotarioRev(BigDecimal podNotarioRev) {
        this.podNotarioRev = podNotarioRev;
    }

    public BigDecimal getPodNotarioRev() {
        return this.podNotarioRev;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodComentarioRev(String podComentarioRev) {
        this.podComentarioRev = podComentarioRev;
    }

    public String getPodComentarioRev() {
        return this.podComentarioRev;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodInsregPubRev(BigDecimal podInsregPubRev) {
        this.podInsregPubRev = podInsregPubRev;
    }

    public BigDecimal getPodInsregPubRev() {
        return this.podInsregPubRev;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFolMercaRev(String podFolMercaRev) {
        this.podFolMercaRev = podFolMercaRev;
    }

    public String getPodFolMercaRev() {
        return this.podFolMercaRev;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFecRegRev(String podFecRegRev) {
        this.podFecRegRev = podFecRegRev;
    }

    public String getPodFecRegRev() {
        return this.podFecRegRev;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setPodAbogadoRev(BigDecimal podAbogadoRev) {
        this.podAbogadoRev = podAbogadoRev;
    }

    public BigDecimal getPodAbogadoRev() {
        return this.podAbogadoRev;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodFecSolRev(String podFecSolRev) {
        this.podFecSolRev = podFecSolRev;
    }

    public String getPodFecSolRev() {
        return this.podFecSolRev;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPodAnoAltaReg(BigDecimal podAnoAltaReg) {
        this.podAnoAltaReg = podAnoAltaReg;
    }

    public BigDecimal getPodAnoAltaReg() {
        return this.podAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodMesAltaReg(BigDecimal podMesAltaReg) {
        this.podMesAltaReg = podMesAltaReg;
    }

    public BigDecimal getPodMesAltaReg() {
        return this.podMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodDiaAltaReg(BigDecimal podDiaAltaReg) {
        this.podDiaAltaReg = podDiaAltaReg;
    }

    public BigDecimal getPodDiaAltaReg() {
        return this.podDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPodAnoUltMod(BigDecimal podAnoUltMod) {
        this.podAnoUltMod = podAnoUltMod;
    }

    public BigDecimal getPodAnoUltMod() {
        return this.podAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodMesUltMod(BigDecimal podMesUltMod) {
        this.podMesUltMod = podMesUltMod;
    }

    public BigDecimal getPodMesUltMod() {
        return this.podMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPodDiaUltMod(BigDecimal podDiaUltMod) {
        this.podDiaUltMod = podDiaUltMod;
    }

    public BigDecimal getPodDiaUltMod() {
        return this.podDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodCveStPoderes(String podCveStPoderes) {
        this.podCveStPoderes = podCveStPoderes;
    }

    public String getPodCveStPoderes() {
        return this.podCveStPoderes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodDesEspecia(String podDesEspecia) {
        this.podDesEspecia = podDesEspecia;
    }

    public String getPodDesEspecia() {
        return this.podDesEspecia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPodTipoPoder(String podTipoPoder) {
        this.podTipoPoder = podTipoPoder;
    }

    public String getPodTipoPoder() {
        return this.podTipoPoder;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PODERES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPodIdPoder() != null && this.getPodIdPoder().longValue() == -999) {
            conditions += " AND POD_ID_PODER IS NULL";
        } else if (this.getPodIdPoder() != null) {
            conditions += " AND POD_ID_PODER = ?";
            values.add(this.getPodIdPoder());
        }

        if (this.getPodNumPoder() != null && this.getPodNumPoder().longValue() == -999) {
            conditions += " AND POD_NUM_PODER IS NULL";
        } else if (this.getPodNumPoder() != null) {
            conditions += " AND POD_NUM_PODER = ?";
            values.add(this.getPodNumPoder());
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
        String sql = "SELECT * FROM PODERES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPodIdPoder() != null && this.getPodIdPoder().longValue() == -999) {
            conditions += " AND POD_ID_PODER IS NULL";
        } else if (this.getPodIdPoder() != null) {
            conditions += " AND POD_ID_PODER = ?";
            values.add(this.getPodIdPoder());
        }

        if (this.getPodNumPoder() != null && this.getPodNumPoder().longValue() == -999) {
            conditions += " AND POD_NUM_PODER IS NULL";
        } else if (this.getPodNumPoder() != null) {
            conditions += " AND POD_NUM_PODER = ?";
            values.add(this.getPodNumPoder());
        }

        if (this.getPodNumContrato() != null && this.getPodNumContrato().longValue() == -999) {
            conditions += " AND POD_NUM_CONTRATO IS NULL";
        } else if (this.getPodNumContrato() != null) {
            conditions += " AND POD_NUM_CONTRATO = ?";
            values.add(this.getPodNumContrato());
        }

        if (this.getPodTipoApoderado() != null && "null".equals(this.getPodTipoApoderado())) {
            conditions += " AND POD_TIPO_APODERADO IS NULL";
        } else if (this.getPodTipoApoderado() != null) {
            conditions += " AND POD_TIPO_APODERADO = ?";
            values.add(this.getPodTipoApoderado());
        }

        if (this.getPodNomApoderado() != null && "null".equals(this.getPodNomApoderado())) {
            conditions += " AND POD_NOM_APODERADO IS NULL";
        } else if (this.getPodNomApoderado() != null) {
            conditions += " AND POD_NOM_APODERADO = ?";
            values.add(this.getPodNomApoderado());
        }

        if (this.getPodContrato() != null && this.getPodContrato().longValue() == -999) {
            conditions += " AND POD_CONTRATO IS NULL";
        } else if (this.getPodContrato() != null) {
            conditions += " AND POD_CONTRATO = ?";
            values.add(this.getPodContrato());
        }

        if (this.getPodConsejoDir() != null && this.getPodConsejoDir().longValue() == -999) {
            conditions += " AND POD_CONSEJO_DIR IS NULL";
        } else if (this.getPodConsejoDir() != null) {
            conditions += " AND POD_CONSEJO_DIR = ?";
            values.add(this.getPodConsejoDir());
        }

        if (this.getPodFodeocomisario() != null && this.getPodFodeocomisario().longValue() == -999) {
            conditions += " AND POD_FODEOCOMISARIO IS NULL";
        } else if (this.getPodFodeocomisario() != null) {
            conditions += " AND POD_FODEOCOMISARIO = ?";
            values.add(this.getPodFodeocomisario());
        }

        if (this.getPodReglasOper() != null && this.getPodReglasOper().longValue() == -999) {
            conditions += " AND POD_REGLAS_OPER IS NULL";
        } else if (this.getPodReglasOper() != null) {
            conditions += " AND POD_REGLAS_OPER = ?";
            values.add(this.getPodReglasOper());
        }

        if (this.getPodComiteTec() != null && this.getPodComiteTec().longValue() == -999) {
            conditions += " AND POD_COMITE_TEC IS NULL";
        } else if (this.getPodComiteTec() != null) {
            conditions += " AND POD_COMITE_TEC = ?";
            values.add(this.getPodComiteTec());
        }

        if (this.getPodOtro() != null && this.getPodOtro().longValue() == -999) {
            conditions += " AND POD_OTRO IS NULL";
        } else if (this.getPodOtro() != null) {
            conditions += " AND POD_OTRO = ?";
            values.add(this.getPodOtro());
        }

        if (this.getPodPoliticas() != null && this.getPodPoliticas().longValue() == -999) {
            conditions += " AND POD_POLITICAS IS NULL";
        } else if (this.getPodPoliticas() != null) {
            conditions += " AND POD_POLITICAS = ?";
            values.add(this.getPodPoliticas());
        }

        if (this.getPodFideicomitente() != null && this.getPodFideicomitente().longValue() == -999) {
            conditions += " AND POD_FIDEICOMITENTE IS NULL";
        } else if (this.getPodFideicomitente() != null) {
            conditions += " AND POD_FIDEICOMITENTE = ?";
            values.add(this.getPodFideicomitente());
        }

        if (this.getPodComentario() != null && "null".equals(this.getPodComentario())) {
            conditions += " AND POD_COMENTARIO IS NULL";
        } else if (this.getPodComentario() != null) {
            conditions += " AND POD_COMENTARIO = ?";
            values.add(this.getPodComentario());
        }

        if (this.getPodEscrituraOto() != null && "null".equals(this.getPodEscrituraOto())) {
            conditions += " AND POD_ESCRITURA_OTO IS NULL";
        } else if (this.getPodEscrituraOto() != null) {
            conditions += " AND POD_ESCRITURA_OTO = ?";
            values.add(this.getPodEscrituraOto());
        }

        if (this.getPodFecEscrOto() != null && "null".equals(this.getPodFecEscrOto())) {
            conditions += " AND POD_FEC_ESCR_OTO IS NULL";
        } else if (this.getPodFecEscrOto() != null) {
            conditions += " AND POD_FEC_ESCR_OTO = ?";
            values.add(this.getPodFecEscrOto());
        }

        if (this.getPodNotarioOto() != null && this.getPodNotarioOto().longValue() == -999) {
            conditions += " AND POD_NOTARIO_OTO IS NULL";
        } else if (this.getPodNotarioOto() != null) {
            conditions += " AND POD_NOTARIO_OTO = ?";
            values.add(this.getPodNotarioOto());
        }

        if (this.getPodTipoGeneral() != null && this.getPodTipoGeneral().longValue() == -999) {
            conditions += " AND POD_TIPO_GENERAL IS NULL";
        } else if (this.getPodTipoGeneral() != null) {
            conditions += " AND POD_TIPO_GENERAL = ?";
            values.add(this.getPodTipoGeneral());
        }

        if (this.getPodPleitosCobran() != null && this.getPodPleitosCobran().longValue() == -999) {
            conditions += " AND POD_PLEITOS_COBRAN IS NULL";
        } else if (this.getPodPleitosCobran() != null) {
            conditions += " AND POD_PLEITOS_COBRAN = ?";
            values.add(this.getPodPleitosCobran());
        }

        if (this.getPodAdmLocal() != null && this.getPodAdmLocal().longValue() == -999) {
            conditions += " AND POD_ADM_LOCAL IS NULL";
        } else if (this.getPodAdmLocal() != null) {
            conditions += " AND POD_ADM_LOCAL = ?";
            values.add(this.getPodAdmLocal());
        }

        if (this.getPodActDominio() != null && this.getPodActDominio().longValue() == -999) {
            conditions += " AND POD_ACT_DOMINIO IS NULL";
        } else if (this.getPodActDominio() != null) {
            conditions += " AND POD_ACT_DOMINIO = ?";
            values.add(this.getPodActDominio());
        }

        if (this.getPodActAdmon() != null && this.getPodActAdmon().longValue() == -999) {
            conditions += " AND POD_ACT_ADMON IS NULL";
        } else if (this.getPodActAdmon() != null) {
            conditions += " AND POD_ACT_ADMON = ?";
            values.add(this.getPodActAdmon());
        }

        if (this.getPodSusTitCred() != null && this.getPodSusTitCred().longValue() == -999) {
            conditions += " AND POD_SUS_TIT_CRED IS NULL";
        } else if (this.getPodSusTitCred() != null) {
            conditions += " AND POD_SUS_TIT_CRED = ?";
            values.add(this.getPodSusTitCred());
        }

        if (this.getPodTipoEspecial() != null && this.getPodTipoEspecial().longValue() == -999) {
            conditions += " AND POD_TIPO_ESPECIAL IS NULL";
        } else if (this.getPodTipoEspecial() != null) {
            conditions += " AND POD_TIPO_ESPECIAL = ?";
            values.add(this.getPodTipoEspecial());
        }

        if (this.getPodComentarioOto() != null && "null".equals(this.getPodComentarioOto())) {
            conditions += " AND POD_COMENTARIO_OTO IS NULL";
        } else if (this.getPodComentarioOto() != null) {
            conditions += " AND POD_COMENTARIO_OTO = ?";
            values.add(this.getPodComentarioOto());
        }

        if (this.getPodFacSustitucio() != null && "null".equals(this.getPodFacSustitucio())) {
            conditions += " AND POD_FAC_SUSTITUCIO IS NULL";
        } else if (this.getPodFacSustitucio() != null) {
            conditions += " AND POD_FAC_SUSTITUCIO = ?";
            values.add(this.getPodFacSustitucio());
        }

        if (this.getPodInsRegpubOto() != null && this.getPodInsRegpubOto().longValue() == -999) {
            conditions += " AND POD_INS_REGPUB_OTO IS NULL";
        } else if (this.getPodInsRegpubOto() != null) {
            conditions += " AND POD_INS_REGPUB_OTO = ?";
            values.add(this.getPodInsRegpubOto());
        }

        if (this.getPodFolMercanOto() != null && "null".equals(this.getPodFolMercanOto())) {
            conditions += " AND POD_FOL_MERCAN_OTO IS NULL";
        } else if (this.getPodFolMercanOto() != null) {
            conditions += " AND POD_FOL_MERCAN_OTO = ?";
            values.add(this.getPodFolMercanOto());
        }

        if (this.getPodFecRegOto() != null && "null".equals(this.getPodFecRegOto())) {
            conditions += " AND POD_FEC_REG_OTO IS NULL";
        } else if (this.getPodFecRegOto() != null) {
            conditions += " AND POD_FEC_REG_OTO = ?";
            values.add(this.getPodFecRegOto());
        }

        if (this.getPodAbogadoOto() != null && this.getPodAbogadoOto().longValue() == -999) {
            conditions += " AND POD_ABOGADO_OTO IS NULL";
        } else if (this.getPodAbogadoOto() != null) {
            conditions += " AND POD_ABOGADO_OTO = ?";
            values.add(this.getPodAbogadoOto());
        }

        if (this.getPodFecSolOto() != null && "null".equals(this.getPodFecSolOto())) {
            conditions += " AND POD_FEC_SOL_OTO IS NULL";
        } else if (this.getPodFecSolOto() != null) {
            conditions += " AND POD_FEC_SOL_OTO = ?";
            values.add(this.getPodFecSolOto());
        }

        if (this.getPodEscrituraRev() != null && "null".equals(this.getPodEscrituraRev())) {
            conditions += " AND POD_ESCRITURA_REV IS NULL";
        } else if (this.getPodEscrituraRev() != null) {
            conditions += " AND POD_ESCRITURA_REV = ?";
            values.add(this.getPodEscrituraRev());
        }

        if (this.getPodFecEscrRev() != null && "null".equals(this.getPodFecEscrRev())) {
            conditions += " AND POD_FEC_ESCR_REV IS NULL";
        } else if (this.getPodFecEscrRev() != null) {
            conditions += " AND POD_FEC_ESCR_REV = ?";
            values.add(this.getPodFecEscrRev());
        }

        if (this.getPodNotarioRev() != null && this.getPodNotarioRev().longValue() == -999) {
            conditions += " AND POD_NOTARIO_REV IS NULL";
        } else if (this.getPodNotarioRev() != null) {
            conditions += " AND POD_NOTARIO_REV = ?";
            values.add(this.getPodNotarioRev());
        }

        if (this.getPodComentarioRev() != null && "null".equals(this.getPodComentarioRev())) {
            conditions += " AND POD_COMENTARIO_REV IS NULL";
        } else if (this.getPodComentarioRev() != null) {
            conditions += " AND POD_COMENTARIO_REV = ?";
            values.add(this.getPodComentarioRev());
        }

        if (this.getPodInsregPubRev() != null && this.getPodInsregPubRev().longValue() == -999) {
            conditions += " AND POD_INSREG_PUB_REV IS NULL";
        } else if (this.getPodInsregPubRev() != null) {
            conditions += " AND POD_INSREG_PUB_REV = ?";
            values.add(this.getPodInsregPubRev());
        }

        if (this.getPodFolMercaRev() != null && "null".equals(this.getPodFolMercaRev())) {
            conditions += " AND POD_FOL_MERCA_REV IS NULL";
        } else if (this.getPodFolMercaRev() != null) {
            conditions += " AND POD_FOL_MERCA_REV = ?";
            values.add(this.getPodFolMercaRev());
        }

        if (this.getPodFecRegRev() != null && "null".equals(this.getPodFecRegRev())) {
            conditions += " AND POD_FEC_REG_REV IS NULL";
        } else if (this.getPodFecRegRev() != null) {
            conditions += " AND POD_FEC_REG_REV = ?";
            values.add(this.getPodFecRegRev());
        }

        if (this.getPodAbogadoRev() != null && this.getPodAbogadoRev().longValue() == -999) {
            conditions += " AND POD_ABOGADO_REV IS NULL";
        } else if (this.getPodAbogadoRev() != null) {
            conditions += " AND POD_ABOGADO_REV = ?";
            values.add(this.getPodAbogadoRev());
        }

        if (this.getPodFecSolRev() != null && "null".equals(this.getPodFecSolRev())) {
            conditions += " AND POD_FEC_SOL_REV IS NULL";
        } else if (this.getPodFecSolRev() != null) {
            conditions += " AND POD_FEC_SOL_REV = ?";
            values.add(this.getPodFecSolRev());
        }

        if (this.getPodAnoAltaReg() != null && this.getPodAnoAltaReg().longValue() == -999) {
            conditions += " AND POD_ANO_ALTA_REG IS NULL";
        } else if (this.getPodAnoAltaReg() != null) {
            conditions += " AND POD_ANO_ALTA_REG = ?";
            values.add(this.getPodAnoAltaReg());
        }

        if (this.getPodMesAltaReg() != null && this.getPodMesAltaReg().longValue() == -999) {
            conditions += " AND POD_MES_ALTA_REG IS NULL";
        } else if (this.getPodMesAltaReg() != null) {
            conditions += " AND POD_MES_ALTA_REG = ?";
            values.add(this.getPodMesAltaReg());
        }

        if (this.getPodDiaAltaReg() != null && this.getPodDiaAltaReg().longValue() == -999) {
            conditions += " AND POD_DIA_ALTA_REG IS NULL";
        } else if (this.getPodDiaAltaReg() != null) {
            conditions += " AND POD_DIA_ALTA_REG = ?";
            values.add(this.getPodDiaAltaReg());
        }

        if (this.getPodAnoUltMod() != null && this.getPodAnoUltMod().longValue() == -999) {
            conditions += " AND POD_ANO_ULT_MOD IS NULL";
        } else if (this.getPodAnoUltMod() != null) {
            conditions += " AND POD_ANO_ULT_MOD = ?";
            values.add(this.getPodAnoUltMod());
        }

        if (this.getPodMesUltMod() != null && this.getPodMesUltMod().longValue() == -999) {
            conditions += " AND POD_MES_ULT_MOD IS NULL";
        } else if (this.getPodMesUltMod() != null) {
            conditions += " AND POD_MES_ULT_MOD = ?";
            values.add(this.getPodMesUltMod());
        }

        if (this.getPodDiaUltMod() != null && this.getPodDiaUltMod().longValue() == -999) {
            conditions += " AND POD_DIA_ULT_MOD IS NULL";
        } else if (this.getPodDiaUltMod() != null) {
            conditions += " AND POD_DIA_ULT_MOD = ?";
            values.add(this.getPodDiaUltMod());
        }

        if (this.getPodCveStPoderes() != null && "null".equals(this.getPodCveStPoderes())) {
            conditions += " AND POD_CVE_ST_PODERES IS NULL";
        } else if (this.getPodCveStPoderes() != null) {
            conditions += " AND POD_CVE_ST_PODERES = ?";
            values.add(this.getPodCveStPoderes());
        }

        if (this.getPodDesEspecia() != null && "null".equals(this.getPodDesEspecia())) {
            conditions += " AND POD_DES_ESPECIA IS NULL";
        } else if (this.getPodDesEspecia() != null) {
            conditions += " AND POD_DES_ESPECIA = ?";
            values.add(this.getPodDesEspecia());
        }

        if (this.getPodTipoPoder() != null && "null".equals(this.getPodTipoPoder())) {
            conditions += " AND POD_TIPO_PODER IS NULL";
        } else if (this.getPodTipoPoder() != null) {
            conditions += " AND POD_TIPO_PODER = ?";
            values.add(this.getPodTipoPoder());
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
        String sql = "UPDATE PODERES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND POD_ID_PODER = ?";
        pkValues.add(this.getPodIdPoder());
        conditions += " AND POD_NUM_PODER = ?";
        pkValues.add(this.getPodNumPoder());
        fields += " POD_NUM_CONTRATO = ?, ";
        values.add(this.getPodNumContrato());
        fields += " POD_TIPO_APODERADO = ?, ";
        values.add(this.getPodTipoApoderado());
        fields += " POD_NOM_APODERADO = ?, ";
        values.add(this.getPodNomApoderado());
        fields += " POD_CONTRATO = ?, ";
        values.add(this.getPodContrato());
        fields += " POD_CONSEJO_DIR = ?, ";
        values.add(this.getPodConsejoDir());
        fields += " POD_FODEOCOMISARIO = ?, ";
        values.add(this.getPodFodeocomisario());
        fields += " POD_REGLAS_OPER = ?, ";
        values.add(this.getPodReglasOper());
        fields += " POD_COMITE_TEC = ?, ";
        values.add(this.getPodComiteTec());
        fields += " POD_OTRO = ?, ";
        values.add(this.getPodOtro());
        fields += " POD_POLITICAS = ?, ";
        values.add(this.getPodPoliticas());
        fields += " POD_FIDEICOMITENTE = ?, ";
        values.add(this.getPodFideicomitente());
        fields += " POD_COMENTARIO = ?, ";
        values.add(this.getPodComentario());
        fields += " POD_ESCRITURA_OTO = ?, ";
        values.add(this.getPodEscrituraOto());
        fields += " POD_FEC_ESCR_OTO = ?, ";
        values.add(this.getPodFecEscrOto());
        fields += " POD_NOTARIO_OTO = ?, ";
        values.add(this.getPodNotarioOto());
        fields += " POD_TIPO_GENERAL = ?, ";
        values.add(this.getPodTipoGeneral());
        fields += " POD_PLEITOS_COBRAN = ?, ";
        values.add(this.getPodPleitosCobran());
        fields += " POD_ADM_LOCAL = ?, ";
        values.add(this.getPodAdmLocal());
        fields += " POD_ACT_DOMINIO = ?, ";
        values.add(this.getPodActDominio());
        fields += " POD_ACT_ADMON = ?, ";
        values.add(this.getPodActAdmon());
        fields += " POD_SUS_TIT_CRED = ?, ";
        values.add(this.getPodSusTitCred());
        fields += " POD_TIPO_ESPECIAL = ?, ";
        values.add(this.getPodTipoEspecial());
        fields += " POD_COMENTARIO_OTO = ?, ";
        values.add(this.getPodComentarioOto());
        fields += " POD_FAC_SUSTITUCIO = ?, ";
        values.add(this.getPodFacSustitucio());
        fields += " POD_INS_REGPUB_OTO = ?, ";
        values.add(this.getPodInsRegpubOto());
        fields += " POD_FOL_MERCAN_OTO = ?, ";
        values.add(this.getPodFolMercanOto());
        fields += " POD_FEC_REG_OTO = ?, ";
        values.add(this.getPodFecRegOto());
        fields += " POD_ABOGADO_OTO = ?, ";
        values.add(this.getPodAbogadoOto());
        fields += " POD_FEC_SOL_OTO = ?, ";
        values.add(this.getPodFecSolOto());
        fields += " POD_ESCRITURA_REV = ?, ";
        values.add(this.getPodEscrituraRev());
        fields += " POD_FEC_ESCR_REV = ?, ";
        values.add(this.getPodFecEscrRev());
        fields += " POD_NOTARIO_REV = ?, ";
        values.add(this.getPodNotarioRev());
        fields += " POD_COMENTARIO_REV = ?, ";
        values.add(this.getPodComentarioRev());
        fields += " POD_INSREG_PUB_REV = ?, ";
        values.add(this.getPodInsregPubRev());
        fields += " POD_FOL_MERCA_REV = ?, ";
        values.add(this.getPodFolMercaRev());
        fields += " POD_FEC_REG_REV = ?, ";
        values.add(this.getPodFecRegRev());
        fields += " POD_ABOGADO_REV = ?, ";
        values.add(this.getPodAbogadoRev());
        fields += " POD_FEC_SOL_REV = ?, ";
        values.add(this.getPodFecSolRev());
        fields += " POD_ANO_ALTA_REG = ?, ";
        values.add(this.getPodAnoAltaReg());
        fields += " POD_MES_ALTA_REG = ?, ";
        values.add(this.getPodMesAltaReg());
        fields += " POD_DIA_ALTA_REG = ?, ";
        values.add(this.getPodDiaAltaReg());
        fields += " POD_ANO_ULT_MOD = ?, ";
        values.add(this.getPodAnoUltMod());
        fields += " POD_MES_ULT_MOD = ?, ";
        values.add(this.getPodMesUltMod());
        fields += " POD_DIA_ULT_MOD = ?, ";
        values.add(this.getPodDiaUltMod());
        fields += " POD_CVE_ST_PODERES = ?, ";
        values.add(this.getPodCveStPoderes());
        fields += " POD_DES_ESPECIA = ?, ";
        values.add(this.getPodDesEspecia());
        fields += " POD_TIPO_PODER = ?, ";
        values.add(this.getPodTipoPoder());
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
        String sql = "INSERT INTO PODERES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", POD_ID_PODER";
        fieldValues += ", ?";
        values.add(this.getPodIdPoder());

        fields += ", POD_NUM_PODER";
        fieldValues += ", ?";
        values.add(this.getPodNumPoder());

        fields += ", POD_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPodNumContrato());

        fields += ", POD_TIPO_APODERADO";
        fieldValues += ", ?";
        values.add(this.getPodTipoApoderado());

        fields += ", POD_NOM_APODERADO";
        fieldValues += ", ?";
        values.add(this.getPodNomApoderado());

        fields += ", POD_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPodContrato());

        fields += ", POD_CONSEJO_DIR";
        fieldValues += ", ?";
        values.add(this.getPodConsejoDir());

        fields += ", POD_FODEOCOMISARIO";
        fieldValues += ", ?";
        values.add(this.getPodFodeocomisario());

        fields += ", POD_REGLAS_OPER";
        fieldValues += ", ?";
        values.add(this.getPodReglasOper());

        fields += ", POD_COMITE_TEC";
        fieldValues += ", ?";
        values.add(this.getPodComiteTec());

        fields += ", POD_OTRO";
        fieldValues += ", ?";
        values.add(this.getPodOtro());

        fields += ", POD_POLITICAS";
        fieldValues += ", ?";
        values.add(this.getPodPoliticas());

        fields += ", POD_FIDEICOMITENTE";
        fieldValues += ", ?";
        values.add(this.getPodFideicomitente());

        fields += ", POD_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getPodComentario());

        fields += ", POD_ESCRITURA_OTO";
        fieldValues += ", ?";
        values.add(this.getPodEscrituraOto());

        fields += ", POD_FEC_ESCR_OTO";
        fieldValues += ", ?";
        values.add(this.getPodFecEscrOto());

        fields += ", POD_NOTARIO_OTO";
        fieldValues += ", ?";
        values.add(this.getPodNotarioOto());

        fields += ", POD_TIPO_GENERAL";
        fieldValues += ", ?";
        values.add(this.getPodTipoGeneral());

        fields += ", POD_PLEITOS_COBRAN";
        fieldValues += ", ?";
        values.add(this.getPodPleitosCobran());

        fields += ", POD_ADM_LOCAL";
        fieldValues += ", ?";
        values.add(this.getPodAdmLocal());

        fields += ", POD_ACT_DOMINIO";
        fieldValues += ", ?";
        values.add(this.getPodActDominio());

        fields += ", POD_ACT_ADMON";
        fieldValues += ", ?";
        values.add(this.getPodActAdmon());

        fields += ", POD_SUS_TIT_CRED";
        fieldValues += ", ?";
        values.add(this.getPodSusTitCred());

        fields += ", POD_TIPO_ESPECIAL";
        fieldValues += ", ?";
        values.add(this.getPodTipoEspecial());

        fields += ", POD_COMENTARIO_OTO";
        fieldValues += ", ?";
        values.add(this.getPodComentarioOto());

        fields += ", POD_FAC_SUSTITUCIO";
        fieldValues += ", ?";
        values.add(this.getPodFacSustitucio());

        fields += ", POD_INS_REGPUB_OTO";
        fieldValues += ", ?";
        values.add(this.getPodInsRegpubOto());

        fields += ", POD_FOL_MERCAN_OTO";
        fieldValues += ", ?";
        values.add(this.getPodFolMercanOto());

        fields += ", POD_FEC_REG_OTO";
        fieldValues += ", ?";
        values.add(this.getPodFecRegOto());

        fields += ", POD_ABOGADO_OTO";
        fieldValues += ", ?";
        values.add(this.getPodAbogadoOto());

        fields += ", POD_FEC_SOL_OTO";
        fieldValues += ", ?";
        values.add(this.getPodFecSolOto());

        fields += ", POD_ESCRITURA_REV";
        fieldValues += ", ?";
        values.add(this.getPodEscrituraRev());

        fields += ", POD_FEC_ESCR_REV";
        fieldValues += ", ?";
        values.add(this.getPodFecEscrRev());

        fields += ", POD_NOTARIO_REV";
        fieldValues += ", ?";
        values.add(this.getPodNotarioRev());

        fields += ", POD_COMENTARIO_REV";
        fieldValues += ", ?";
        values.add(this.getPodComentarioRev());

        fields += ", POD_INSREG_PUB_REV";
        fieldValues += ", ?";
        values.add(this.getPodInsregPubRev());

        fields += ", POD_FOL_MERCA_REV";
        fieldValues += ", ?";
        values.add(this.getPodFolMercaRev());

        fields += ", POD_FEC_REG_REV";
        fieldValues += ", ?";
        values.add(this.getPodFecRegRev());

        fields += ", POD_ABOGADO_REV";
        fieldValues += ", ?";
        values.add(this.getPodAbogadoRev());

        fields += ", POD_FEC_SOL_REV";
        fieldValues += ", ?";
        values.add(this.getPodFecSolRev());

        fields += ", POD_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPodAnoAltaReg());

        fields += ", POD_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPodMesAltaReg());

        fields += ", POD_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPodDiaAltaReg());

        fields += ", POD_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPodAnoUltMod());

        fields += ", POD_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPodMesUltMod());

        fields += ", POD_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPodDiaUltMod());

        fields += ", POD_CVE_ST_PODERES";
        fieldValues += ", ?";
        values.add(this.getPodCveStPoderes());

        fields += ", POD_DES_ESPECIA";
        fieldValues += ", ?";
        values.add(this.getPodDesEspecia());

        fields += ", POD_TIPO_PODER";
        fieldValues += ", ?";
        values.add(this.getPodTipoPoder());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PODERES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND POD_ID_PODER = ?";
        values.add(this.getPodIdPoder());
        conditions += " AND POD_NUM_PODER = ?";
        values.add(this.getPodNumPoder());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Poderes instance = (Poderes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPodIdPoder().equals(instance.getPodIdPoder()))
            equalObjects = false;
        if (equalObjects && !this.getPodNumPoder().equals(instance.getPodNumPoder()))
            equalObjects = false;
        if (equalObjects && !this.getPodNumContrato().equals(instance.getPodNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPodTipoApoderado().equals(instance.getPodTipoApoderado()))
            equalObjects = false;
        if (equalObjects && !this.getPodNomApoderado().equals(instance.getPodNomApoderado()))
            equalObjects = false;
        if (equalObjects && !this.getPodContrato().equals(instance.getPodContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPodConsejoDir().equals(instance.getPodConsejoDir()))
            equalObjects = false;
        if (equalObjects && !this.getPodFodeocomisario().equals(instance.getPodFodeocomisario()))
            equalObjects = false;
        if (equalObjects && !this.getPodReglasOper().equals(instance.getPodReglasOper()))
            equalObjects = false;
        if (equalObjects && !this.getPodComiteTec().equals(instance.getPodComiteTec()))
            equalObjects = false;
        if (equalObjects && !this.getPodOtro().equals(instance.getPodOtro()))
            equalObjects = false;
        if (equalObjects && !this.getPodPoliticas().equals(instance.getPodPoliticas()))
            equalObjects = false;
        if (equalObjects && !this.getPodFideicomitente().equals(instance.getPodFideicomitente()))
            equalObjects = false;
        if (equalObjects && !this.getPodComentario().equals(instance.getPodComentario()))
            equalObjects = false;
        if (equalObjects && !this.getPodEscrituraOto().equals(instance.getPodEscrituraOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodFecEscrOto().equals(instance.getPodFecEscrOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodNotarioOto().equals(instance.getPodNotarioOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodTipoGeneral().equals(instance.getPodTipoGeneral()))
            equalObjects = false;
        if (equalObjects && !this.getPodPleitosCobran().equals(instance.getPodPleitosCobran()))
            equalObjects = false;
        if (equalObjects && !this.getPodAdmLocal().equals(instance.getPodAdmLocal()))
            equalObjects = false;
        if (equalObjects && !this.getPodActDominio().equals(instance.getPodActDominio()))
            equalObjects = false;
        if (equalObjects && !this.getPodActAdmon().equals(instance.getPodActAdmon()))
            equalObjects = false;
        if (equalObjects && !this.getPodSusTitCred().equals(instance.getPodSusTitCred()))
            equalObjects = false;
        if (equalObjects && !this.getPodTipoEspecial().equals(instance.getPodTipoEspecial()))
            equalObjects = false;
        if (equalObjects && !this.getPodComentarioOto().equals(instance.getPodComentarioOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodFacSustitucio().equals(instance.getPodFacSustitucio()))
            equalObjects = false;
        if (equalObjects && !this.getPodInsRegpubOto().equals(instance.getPodInsRegpubOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodFolMercanOto().equals(instance.getPodFolMercanOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodFecRegOto().equals(instance.getPodFecRegOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodAbogadoOto().equals(instance.getPodAbogadoOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodFecSolOto().equals(instance.getPodFecSolOto()))
            equalObjects = false;
        if (equalObjects && !this.getPodEscrituraRev().equals(instance.getPodEscrituraRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodFecEscrRev().equals(instance.getPodFecEscrRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodNotarioRev().equals(instance.getPodNotarioRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodComentarioRev().equals(instance.getPodComentarioRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodInsregPubRev().equals(instance.getPodInsregPubRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodFolMercaRev().equals(instance.getPodFolMercaRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodFecRegRev().equals(instance.getPodFecRegRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodAbogadoRev().equals(instance.getPodAbogadoRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodFecSolRev().equals(instance.getPodFecSolRev()))
            equalObjects = false;
        if (equalObjects && !this.getPodAnoAltaReg().equals(instance.getPodAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPodMesAltaReg().equals(instance.getPodMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPodDiaAltaReg().equals(instance.getPodDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPodAnoUltMod().equals(instance.getPodAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPodMesUltMod().equals(instance.getPodMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPodDiaUltMod().equals(instance.getPodDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPodCveStPoderes().equals(instance.getPodCveStPoderes()))
            equalObjects = false;
        if (equalObjects && !this.getPodDesEspecia().equals(instance.getPodDesEspecia()))
            equalObjects = false;
        if (equalObjects && !this.getPodTipoPoder().equals(instance.getPodTipoPoder()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Poderes result = new Poderes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPodIdPoder((BigDecimal) objectData.getData("POD_ID_PODER"));
        result.setPodNumPoder((BigDecimal) objectData.getData("POD_NUM_PODER"));
        result.setPodNumContrato((BigDecimal) objectData.getData("POD_NUM_CONTRATO"));
        result.setPodTipoApoderado((String) objectData.getData("POD_TIPO_APODERADO"));
        result.setPodNomApoderado((String) objectData.getData("POD_NOM_APODERADO"));
        result.setPodContrato((BigDecimal) objectData.getData("POD_CONTRATO"));
        result.setPodConsejoDir((BigDecimal) objectData.getData("POD_CONSEJO_DIR"));
        result.setPodFodeocomisario((BigDecimal) objectData.getData("POD_FODEOCOMISARIO"));
        result.setPodReglasOper((BigDecimal) objectData.getData("POD_REGLAS_OPER"));
        result.setPodComiteTec((BigDecimal) objectData.getData("POD_COMITE_TEC"));
        result.setPodOtro((BigDecimal) objectData.getData("POD_OTRO"));
        result.setPodPoliticas((BigDecimal) objectData.getData("POD_POLITICAS"));
        result.setPodFideicomitente((BigDecimal) objectData.getData("POD_FIDEICOMITENTE"));
        result.setPodComentario((String) objectData.getData("POD_COMENTARIO"));
        result.setPodEscrituraOto((String) objectData.getData("POD_ESCRITURA_OTO"));
        result.setPodFecEscrOto((String) objectData.getData("POD_FEC_ESCR_OTO"));
        result.setPodNotarioOto((BigDecimal) objectData.getData("POD_NOTARIO_OTO"));
        result.setPodTipoGeneral((BigDecimal) objectData.getData("POD_TIPO_GENERAL"));
        result.setPodPleitosCobran((BigDecimal) objectData.getData("POD_PLEITOS_COBRAN"));
        result.setPodAdmLocal((BigDecimal) objectData.getData("POD_ADM_LOCAL"));
        result.setPodActDominio((BigDecimal) objectData.getData("POD_ACT_DOMINIO"));
        result.setPodActAdmon((BigDecimal) objectData.getData("POD_ACT_ADMON"));
        result.setPodSusTitCred((BigDecimal) objectData.getData("POD_SUS_TIT_CRED"));
        result.setPodTipoEspecial((BigDecimal) objectData.getData("POD_TIPO_ESPECIAL"));
        result.setPodComentarioOto((String) objectData.getData("POD_COMENTARIO_OTO"));
        result.setPodFacSustitucio((String) objectData.getData("POD_FAC_SUSTITUCIO"));
        result.setPodInsRegpubOto((BigDecimal) objectData.getData("POD_INS_REGPUB_OTO"));
        result.setPodFolMercanOto((String) objectData.getData("POD_FOL_MERCAN_OTO"));
        result.setPodFecRegOto((String) objectData.getData("POD_FEC_REG_OTO"));
        result.setPodAbogadoOto((BigDecimal) objectData.getData("POD_ABOGADO_OTO"));
        result.setPodFecSolOto((String) objectData.getData("POD_FEC_SOL_OTO"));
        result.setPodEscrituraRev((String) objectData.getData("POD_ESCRITURA_REV"));
        result.setPodFecEscrRev((String) objectData.getData("POD_FEC_ESCR_REV"));
        result.setPodNotarioRev((BigDecimal) objectData.getData("POD_NOTARIO_REV"));
        result.setPodComentarioRev((String) objectData.getData("POD_COMENTARIO_REV"));
        result.setPodInsregPubRev((BigDecimal) objectData.getData("POD_INSREG_PUB_REV"));
        result.setPodFolMercaRev((String) objectData.getData("POD_FOL_MERCA_REV"));
        result.setPodFecRegRev((String) objectData.getData("POD_FEC_REG_REV"));
        result.setPodAbogadoRev((BigDecimal) objectData.getData("POD_ABOGADO_REV"));
        result.setPodFecSolRev((String) objectData.getData("POD_FEC_SOL_REV"));
        result.setPodAnoAltaReg((BigDecimal) objectData.getData("POD_ANO_ALTA_REG"));
        result.setPodMesAltaReg((BigDecimal) objectData.getData("POD_MES_ALTA_REG"));
        result.setPodDiaAltaReg((BigDecimal) objectData.getData("POD_DIA_ALTA_REG"));
        result.setPodAnoUltMod((BigDecimal) objectData.getData("POD_ANO_ULT_MOD"));
        result.setPodMesUltMod((BigDecimal) objectData.getData("POD_MES_ULT_MOD"));
        result.setPodDiaUltMod((BigDecimal) objectData.getData("POD_DIA_ULT_MOD"));
        result.setPodCveStPoderes((String) objectData.getData("POD_CVE_ST_PODERES"));
        result.setPodDesEspecia((String) objectData.getData("POD_DES_ESPECIA"));
        result.setPodTipoPoder((String) objectData.getData("POD_TIPO_PODER"));

        return result;

    }

}
