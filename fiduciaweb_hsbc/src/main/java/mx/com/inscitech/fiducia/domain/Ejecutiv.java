package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EJECUTIV_PK", columns = { "EJE_CVE_BANCA", "EJE_NUM_EJEC_ATENC" }, sequences = { "MANUAL" })
public class Ejecutiv extends DomainObject {

    String ejeCveBanca = null;
    BigDecimal ejeNumEjecAtenc = null;
    String ejeNomEjecutivo = null;
    String ejeCveTipoEjec = null;
    String ejeCalleNum = null;
    String ejeNomColonia = null;
    String ejeNomPoblacion = null;
    BigDecimal ejeCodigoPostal = null;
    BigDecimal ejeNumPais = null;
    String ejeNomPais = null;
    BigDecimal ejeNumEstado = null;
    String ejeNomEstado = null;
    String ejeNumCveLada1 = null;
    String ejeNumTelef1 = null;
    String ejeNumExt1 = null;
    String ejeNumCveLada2 = null;
    String ejeNumTelef2 = null;
    String ejeNumExt2 = null;
    String ejeNumLadaFax = null;
    String ejeNumTelefFax = null;
    String ejeNumExtFax = null;
    BigDecimal ejeAnoAltaReg = null;
    BigDecimal ejeMesAltaReg = null;
    BigDecimal ejeDiaAltaReg = null;
    BigDecimal ejeAnoUltMod = null;
    BigDecimal ejeMesUltMod = null;
    BigDecimal ejeDiaUltMod = null;
    String ejeCveStEjecuti = null;
    BigDecimal ejeNumNivel1 = null;
    BigDecimal ejeNumNivel2 = null;
    BigDecimal ejeNumNivel3 = null;
    BigDecimal ejeNumNivel4 = null;
    BigDecimal ejeNumNivel5 = null;
    String ejeEmail = null;

    public Ejecutiv() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeCveBanca(String ejeCveBanca) {
        this.ejeCveBanca = ejeCveBanca;
    }

    public String getEjeCveBanca() {
        return this.ejeCveBanca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumEjecAtenc(BigDecimal ejeNumEjecAtenc) {
        this.ejeNumEjecAtenc = ejeNumEjecAtenc;
    }

    public BigDecimal getEjeNumEjecAtenc() {
        return this.ejeNumEjecAtenc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNomEjecutivo(String ejeNomEjecutivo) {
        this.ejeNomEjecutivo = ejeNomEjecutivo;
    }

    public String getEjeNomEjecutivo() {
        return this.ejeNomEjecutivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeCveTipoEjec(String ejeCveTipoEjec) {
        this.ejeCveTipoEjec = ejeCveTipoEjec;
    }

    public String getEjeCveTipoEjec() {
        return this.ejeCveTipoEjec;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeCalleNum(String ejeCalleNum) {
        this.ejeCalleNum = ejeCalleNum;
    }

    public String getEjeCalleNum() {
        return this.ejeCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNomColonia(String ejeNomColonia) {
        this.ejeNomColonia = ejeNomColonia;
    }

    public String getEjeNomColonia() {
        return this.ejeNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNomPoblacion(String ejeNomPoblacion) {
        this.ejeNomPoblacion = ejeNomPoblacion;
    }

    public String getEjeNomPoblacion() {
        return this.ejeNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeCodigoPostal(BigDecimal ejeCodigoPostal) {
        this.ejeCodigoPostal = ejeCodigoPostal;
    }

    public BigDecimal getEjeCodigoPostal() {
        return this.ejeCodigoPostal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumPais(BigDecimal ejeNumPais) {
        this.ejeNumPais = ejeNumPais;
    }

    public BigDecimal getEjeNumPais() {
        return this.ejeNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNomPais(String ejeNomPais) {
        this.ejeNomPais = ejeNomPais;
    }

    public String getEjeNomPais() {
        return this.ejeNomPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumEstado(BigDecimal ejeNumEstado) {
        this.ejeNumEstado = ejeNumEstado;
    }

    public BigDecimal getEjeNumEstado() {
        return this.ejeNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNomEstado(String ejeNomEstado) {
        this.ejeNomEstado = ejeNomEstado;
    }

    public String getEjeNomEstado() {
        return this.ejeNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumCveLada1(String ejeNumCveLada1) {
        this.ejeNumCveLada1 = ejeNumCveLada1;
    }

    public String getEjeNumCveLada1() {
        return this.ejeNumCveLada1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumTelef1(String ejeNumTelef1) {
        this.ejeNumTelef1 = ejeNumTelef1;
    }

    public String getEjeNumTelef1() {
        return this.ejeNumTelef1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumExt1(String ejeNumExt1) {
        this.ejeNumExt1 = ejeNumExt1;
    }

    public String getEjeNumExt1() {
        return this.ejeNumExt1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumCveLada2(String ejeNumCveLada2) {
        this.ejeNumCveLada2 = ejeNumCveLada2;
    }

    public String getEjeNumCveLada2() {
        return this.ejeNumCveLada2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumTelef2(String ejeNumTelef2) {
        this.ejeNumTelef2 = ejeNumTelef2;
    }

    public String getEjeNumTelef2() {
        return this.ejeNumTelef2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumExt2(String ejeNumExt2) {
        this.ejeNumExt2 = ejeNumExt2;
    }

    public String getEjeNumExt2() {
        return this.ejeNumExt2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumLadaFax(String ejeNumLadaFax) {
        this.ejeNumLadaFax = ejeNumLadaFax;
    }

    public String getEjeNumLadaFax() {
        return this.ejeNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumTelefFax(String ejeNumTelefFax) {
        this.ejeNumTelefFax = ejeNumTelefFax;
    }

    public String getEjeNumTelefFax() {
        return this.ejeNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNumExtFax(String ejeNumExtFax) {
        this.ejeNumExtFax = ejeNumExtFax;
    }

    public String getEjeNumExtFax() {
        return this.ejeNumExtFax;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEjeAnoAltaReg(BigDecimal ejeAnoAltaReg) {
        this.ejeAnoAltaReg = ejeAnoAltaReg;
    }

    public BigDecimal getEjeAnoAltaReg() {
        return this.ejeAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEjeMesAltaReg(BigDecimal ejeMesAltaReg) {
        this.ejeMesAltaReg = ejeMesAltaReg;
    }

    public BigDecimal getEjeMesAltaReg() {
        return this.ejeMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEjeDiaAltaReg(BigDecimal ejeDiaAltaReg) {
        this.ejeDiaAltaReg = ejeDiaAltaReg;
    }

    public BigDecimal getEjeDiaAltaReg() {
        return this.ejeDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEjeAnoUltMod(BigDecimal ejeAnoUltMod) {
        this.ejeAnoUltMod = ejeAnoUltMod;
    }

    public BigDecimal getEjeAnoUltMod() {
        return this.ejeAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEjeMesUltMod(BigDecimal ejeMesUltMod) {
        this.ejeMesUltMod = ejeMesUltMod;
    }

    public BigDecimal getEjeMesUltMod() {
        return this.ejeMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEjeDiaUltMod(BigDecimal ejeDiaUltMod) {
        this.ejeDiaUltMod = ejeDiaUltMod;
    }

    public BigDecimal getEjeDiaUltMod() {
        return this.ejeDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeCveStEjecuti(String ejeCveStEjecuti) {
        this.ejeCveStEjecuti = ejeCveStEjecuti;
    }

    public String getEjeCveStEjecuti() {
        return this.ejeCveStEjecuti;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumNivel1(BigDecimal ejeNumNivel1) {
        this.ejeNumNivel1 = ejeNumNivel1;
    }

    public BigDecimal getEjeNumNivel1() {
        return this.ejeNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumNivel2(BigDecimal ejeNumNivel2) {
        this.ejeNumNivel2 = ejeNumNivel2;
    }

    public BigDecimal getEjeNumNivel2() {
        return this.ejeNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumNivel3(BigDecimal ejeNumNivel3) {
        this.ejeNumNivel3 = ejeNumNivel3;
    }

    public BigDecimal getEjeNumNivel3() {
        return this.ejeNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumNivel4(BigDecimal ejeNumNivel4) {
        this.ejeNumNivel4 = ejeNumNivel4;
    }

    public BigDecimal getEjeNumNivel4() {
        return this.ejeNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumNivel5(BigDecimal ejeNumNivel5) {
        this.ejeNumNivel5 = ejeNumNivel5;
    }

    public BigDecimal getEjeNumNivel5() {
        return this.ejeNumNivel5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeEmail(String ejeEmail) {
        this.ejeEmail = ejeEmail;
    }

    public String getEjeEmail() {
        return this.ejeEmail;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EJECUTIV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEjeCveBanca() != null && "null".equals(this.getEjeCveBanca())) {
            conditions += " AND EJE_CVE_BANCA IS NULL";
        } else if (this.getEjeCveBanca() != null) {
            conditions += " AND EJE_CVE_BANCA = ?";
            values.add(this.getEjeCveBanca());
        }

        if (this.getEjeNumEjecAtenc() != null && this.getEjeNumEjecAtenc().longValue() == -999) {
            conditions += " AND EJE_NUM_EJEC_ATENC IS NULL";
        } else if (this.getEjeNumEjecAtenc() != null) {
            conditions += " AND EJE_NUM_EJEC_ATENC = ?";
            values.add(this.getEjeNumEjecAtenc());
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
        String sql = "SELECT * FROM EJECUTIV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEjeCveBanca() != null && "null".equals(this.getEjeCveBanca())) {
            conditions += " AND EJE_CVE_BANCA IS NULL";
        } else if (this.getEjeCveBanca() != null) {
            conditions += " AND EJE_CVE_BANCA = ?";
            values.add(this.getEjeCveBanca());
        }

        if (this.getEjeNumEjecAtenc() != null && this.getEjeNumEjecAtenc().longValue() == -999) {
            conditions += " AND EJE_NUM_EJEC_ATENC IS NULL";
        } else if (this.getEjeNumEjecAtenc() != null) {
            conditions += " AND EJE_NUM_EJEC_ATENC = ?";
            values.add(this.getEjeNumEjecAtenc());
        }

        if (this.getEjeNomEjecutivo() != null && "null".equals(this.getEjeNomEjecutivo())) {
            conditions += " AND EJE_NOM_EJECUTIVO IS NULL";
        } else if (this.getEjeNomEjecutivo() != null) {
            conditions += " AND EJE_NOM_EJECUTIVO = ?";
            values.add(this.getEjeNomEjecutivo());
        }

        if (this.getEjeCveTipoEjec() != null && "null".equals(this.getEjeCveTipoEjec())) {
            conditions += " AND EJE_CVE_TIPO_EJEC IS NULL";
        } else if (this.getEjeCveTipoEjec() != null) {
            conditions += " AND EJE_CVE_TIPO_EJEC = ?";
            values.add(this.getEjeCveTipoEjec());
        }

        if (this.getEjeCalleNum() != null && "null".equals(this.getEjeCalleNum())) {
            conditions += " AND EJE_CALLE_NUM IS NULL";
        } else if (this.getEjeCalleNum() != null) {
            conditions += " AND EJE_CALLE_NUM = ?";
            values.add(this.getEjeCalleNum());
        }

        if (this.getEjeNomColonia() != null && "null".equals(this.getEjeNomColonia())) {
            conditions += " AND EJE_NOM_COLONIA IS NULL";
        } else if (this.getEjeNomColonia() != null) {
            conditions += " AND EJE_NOM_COLONIA = ?";
            values.add(this.getEjeNomColonia());
        }

        if (this.getEjeNomPoblacion() != null && "null".equals(this.getEjeNomPoblacion())) {
            conditions += " AND EJE_NOM_POBLACION IS NULL";
        } else if (this.getEjeNomPoblacion() != null) {
            conditions += " AND EJE_NOM_POBLACION = ?";
            values.add(this.getEjeNomPoblacion());
        }

        if (this.getEjeCodigoPostal() != null && this.getEjeCodigoPostal().longValue() == -999) {
            conditions += " AND EJE_CODIGO_POSTAL IS NULL";
        } else if (this.getEjeCodigoPostal() != null) {
            conditions += " AND EJE_CODIGO_POSTAL = ?";
            values.add(this.getEjeCodigoPostal());
        }

        if (this.getEjeNumPais() != null && this.getEjeNumPais().longValue() == -999) {
            conditions += " AND EJE_NUM_PAIS IS NULL";
        } else if (this.getEjeNumPais() != null) {
            conditions += " AND EJE_NUM_PAIS = ?";
            values.add(this.getEjeNumPais());
        }

        if (this.getEjeNomPais() != null && "null".equals(this.getEjeNomPais())) {
            conditions += " AND EJE_NOM_PAIS IS NULL";
        } else if (this.getEjeNomPais() != null) {
            conditions += " AND EJE_NOM_PAIS = ?";
            values.add(this.getEjeNomPais());
        }

        if (this.getEjeNumEstado() != null && this.getEjeNumEstado().longValue() == -999) {
            conditions += " AND EJE_NUM_ESTADO IS NULL";
        } else if (this.getEjeNumEstado() != null) {
            conditions += " AND EJE_NUM_ESTADO = ?";
            values.add(this.getEjeNumEstado());
        }

        if (this.getEjeNomEstado() != null && "null".equals(this.getEjeNomEstado())) {
            conditions += " AND EJE_NOM_ESTADO IS NULL";
        } else if (this.getEjeNomEstado() != null) {
            conditions += " AND EJE_NOM_ESTADO = ?";
            values.add(this.getEjeNomEstado());
        }

        if (this.getEjeNumCveLada1() != null && "null".equals(this.getEjeNumCveLada1())) {
            conditions += " AND EJE_NUM_CVE_LADA1 IS NULL";
        } else if (this.getEjeNumCveLada1() != null) {
            conditions += " AND EJE_NUM_CVE_LADA1 = ?";
            values.add(this.getEjeNumCveLada1());
        }

        if (this.getEjeNumTelef1() != null && "null".equals(this.getEjeNumTelef1())) {
            conditions += " AND EJE_NUM_TELEF1 IS NULL";
        } else if (this.getEjeNumTelef1() != null) {
            conditions += " AND EJE_NUM_TELEF1 = ?";
            values.add(this.getEjeNumTelef1());
        }

        if (this.getEjeNumExt1() != null && "null".equals(this.getEjeNumExt1())) {
            conditions += " AND EJE_NUM_EXT1 IS NULL";
        } else if (this.getEjeNumExt1() != null) {
            conditions += " AND EJE_NUM_EXT1 = ?";
            values.add(this.getEjeNumExt1());
        }

        if (this.getEjeNumCveLada2() != null && "null".equals(this.getEjeNumCveLada2())) {
            conditions += " AND EJE_NUM_CVE_LADA2 IS NULL";
        } else if (this.getEjeNumCveLada2() != null) {
            conditions += " AND EJE_NUM_CVE_LADA2 = ?";
            values.add(this.getEjeNumCveLada2());
        }

        if (this.getEjeNumTelef2() != null && "null".equals(this.getEjeNumTelef2())) {
            conditions += " AND EJE_NUM_TELEF2 IS NULL";
        } else if (this.getEjeNumTelef2() != null) {
            conditions += " AND EJE_NUM_TELEF2 = ?";
            values.add(this.getEjeNumTelef2());
        }

        if (this.getEjeNumExt2() != null && "null".equals(this.getEjeNumExt2())) {
            conditions += " AND EJE_NUM_EXT2 IS NULL";
        } else if (this.getEjeNumExt2() != null) {
            conditions += " AND EJE_NUM_EXT2 = ?";
            values.add(this.getEjeNumExt2());
        }

        if (this.getEjeNumLadaFax() != null && "null".equals(this.getEjeNumLadaFax())) {
            conditions += " AND EJE_NUM_LADA_FAX IS NULL";
        } else if (this.getEjeNumLadaFax() != null) {
            conditions += " AND EJE_NUM_LADA_FAX = ?";
            values.add(this.getEjeNumLadaFax());
        }

        if (this.getEjeNumTelefFax() != null && "null".equals(this.getEjeNumTelefFax())) {
            conditions += " AND EJE_NUM_TELEF_FAX IS NULL";
        } else if (this.getEjeNumTelefFax() != null) {
            conditions += " AND EJE_NUM_TELEF_FAX = ?";
            values.add(this.getEjeNumTelefFax());
        }

        if (this.getEjeNumExtFax() != null && "null".equals(this.getEjeNumExtFax())) {
            conditions += " AND EJE_NUM_EXT_FAX IS NULL";
        } else if (this.getEjeNumExtFax() != null) {
            conditions += " AND EJE_NUM_EXT_FAX = ?";
            values.add(this.getEjeNumExtFax());
        }

        if (this.getEjeAnoAltaReg() != null && this.getEjeAnoAltaReg().longValue() == -999) {
            conditions += " AND EJE_ANO_ALTA_REG IS NULL";
        } else if (this.getEjeAnoAltaReg() != null) {
            conditions += " AND EJE_ANO_ALTA_REG = ?";
            values.add(this.getEjeAnoAltaReg());
        }

        if (this.getEjeMesAltaReg() != null && this.getEjeMesAltaReg().longValue() == -999) {
            conditions += " AND EJE_MES_ALTA_REG IS NULL";
        } else if (this.getEjeMesAltaReg() != null) {
            conditions += " AND EJE_MES_ALTA_REG = ?";
            values.add(this.getEjeMesAltaReg());
        }

        if (this.getEjeDiaAltaReg() != null && this.getEjeDiaAltaReg().longValue() == -999) {
            conditions += " AND EJE_DIA_ALTA_REG IS NULL";
        } else if (this.getEjeDiaAltaReg() != null) {
            conditions += " AND EJE_DIA_ALTA_REG = ?";
            values.add(this.getEjeDiaAltaReg());
        }

        if (this.getEjeAnoUltMod() != null && this.getEjeAnoUltMod().longValue() == -999) {
            conditions += " AND EJE_ANO_ULT_MOD IS NULL";
        } else if (this.getEjeAnoUltMod() != null) {
            conditions += " AND EJE_ANO_ULT_MOD = ?";
            values.add(this.getEjeAnoUltMod());
        }

        if (this.getEjeMesUltMod() != null && this.getEjeMesUltMod().longValue() == -999) {
            conditions += " AND EJE_MES_ULT_MOD IS NULL";
        } else if (this.getEjeMesUltMod() != null) {
            conditions += " AND EJE_MES_ULT_MOD = ?";
            values.add(this.getEjeMesUltMod());
        }

        if (this.getEjeDiaUltMod() != null && this.getEjeDiaUltMod().longValue() == -999) {
            conditions += " AND EJE_DIA_ULT_MOD IS NULL";
        } else if (this.getEjeDiaUltMod() != null) {
            conditions += " AND EJE_DIA_ULT_MOD = ?";
            values.add(this.getEjeDiaUltMod());
        }

        if (this.getEjeCveStEjecuti() != null && "null".equals(this.getEjeCveStEjecuti())) {
            conditions += " AND EJE_CVE_ST_EJECUTI IS NULL";
        } else if (this.getEjeCveStEjecuti() != null) {
            conditions += " AND EJE_CVE_ST_EJECUTI = ?";
            values.add(this.getEjeCveStEjecuti());
        }

        if (this.getEjeNumNivel1() != null && this.getEjeNumNivel1().longValue() == -999) {
            conditions += " AND EJE_NUM_NIVEL1 IS NULL";
        } else if (this.getEjeNumNivel1() != null) {
            conditions += " AND EJE_NUM_NIVEL1 = ?";
            values.add(this.getEjeNumNivel1());
        }

        if (this.getEjeNumNivel2() != null && this.getEjeNumNivel2().longValue() == -999) {
            conditions += " AND EJE_NUM_NIVEL2 IS NULL";
        } else if (this.getEjeNumNivel2() != null) {
            conditions += " AND EJE_NUM_NIVEL2 = ?";
            values.add(this.getEjeNumNivel2());
        }

        if (this.getEjeNumNivel3() != null && this.getEjeNumNivel3().longValue() == -999) {
            conditions += " AND EJE_NUM_NIVEL3 IS NULL";
        } else if (this.getEjeNumNivel3() != null) {
            conditions += " AND EJE_NUM_NIVEL3 = ?";
            values.add(this.getEjeNumNivel3());
        }

        if (this.getEjeNumNivel4() != null && this.getEjeNumNivel4().longValue() == -999) {
            conditions += " AND EJE_NUM_NIVEL4 IS NULL";
        } else if (this.getEjeNumNivel4() != null) {
            conditions += " AND EJE_NUM_NIVEL4 = ?";
            values.add(this.getEjeNumNivel4());
        }

        if (this.getEjeNumNivel5() != null && this.getEjeNumNivel5().longValue() == -999) {
            conditions += " AND EJE_NUM_NIVEL5 IS NULL";
        } else if (this.getEjeNumNivel5() != null) {
            conditions += " AND EJE_NUM_NIVEL5 = ?";
            values.add(this.getEjeNumNivel5());
        }

        if (this.getEjeEmail() != null && "null".equals(this.getEjeEmail())) {
            conditions += " AND EJE_EMAIL IS NULL";
        } else if (this.getEjeEmail() != null) {
            conditions += " AND EJE_EMAIL = ?";
            values.add(this.getEjeEmail());
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
        String sql = "UPDATE EJECUTIV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EJE_CVE_BANCA = ?";
        pkValues.add(this.getEjeCveBanca());
        conditions += " AND EJE_NUM_EJEC_ATENC = ?";
        pkValues.add(this.getEjeNumEjecAtenc());
        fields += " EJE_NOM_EJECUTIVO = ?, ";
        values.add(this.getEjeNomEjecutivo());
        fields += " EJE_CVE_TIPO_EJEC = ?, ";
        values.add(this.getEjeCveTipoEjec());
        fields += " EJE_CALLE_NUM = ?, ";
        values.add(this.getEjeCalleNum());
        fields += " EJE_NOM_COLONIA = ?, ";
        values.add(this.getEjeNomColonia());
        fields += " EJE_NOM_POBLACION = ?, ";
        values.add(this.getEjeNomPoblacion());
        fields += " EJE_CODIGO_POSTAL = ?, ";
        values.add(this.getEjeCodigoPostal());
        fields += " EJE_NUM_PAIS = ?, ";
        values.add(this.getEjeNumPais());
        fields += " EJE_NOM_PAIS = ?, ";
        values.add(this.getEjeNomPais());
        fields += " EJE_NUM_ESTADO = ?, ";
        values.add(this.getEjeNumEstado());
        fields += " EJE_NOM_ESTADO = ?, ";
        values.add(this.getEjeNomEstado());
        fields += " EJE_NUM_CVE_LADA1 = ?, ";
        values.add(this.getEjeNumCveLada1());
        fields += " EJE_NUM_TELEF1 = ?, ";
        values.add(this.getEjeNumTelef1());
        fields += " EJE_NUM_EXT1 = ?, ";
        values.add(this.getEjeNumExt1());
        fields += " EJE_NUM_CVE_LADA2 = ?, ";
        values.add(this.getEjeNumCveLada2());
        fields += " EJE_NUM_TELEF2 = ?, ";
        values.add(this.getEjeNumTelef2());
        fields += " EJE_NUM_EXT2 = ?, ";
        values.add(this.getEjeNumExt2());
        fields += " EJE_NUM_LADA_FAX = ?, ";
        values.add(this.getEjeNumLadaFax());
        fields += " EJE_NUM_TELEF_FAX = ?, ";
        values.add(this.getEjeNumTelefFax());
        fields += " EJE_NUM_EXT_FAX = ?, ";
        values.add(this.getEjeNumExtFax());
        fields += " EJE_ANO_ALTA_REG = ?, ";
        values.add(this.getEjeAnoAltaReg());
        fields += " EJE_MES_ALTA_REG = ?, ";
        values.add(this.getEjeMesAltaReg());
        fields += " EJE_DIA_ALTA_REG = ?, ";
        values.add(this.getEjeDiaAltaReg());
        fields += " EJE_ANO_ULT_MOD = ?, ";
        values.add(this.getEjeAnoUltMod());
        fields += " EJE_MES_ULT_MOD = ?, ";
        values.add(this.getEjeMesUltMod());
        fields += " EJE_DIA_ULT_MOD = ?, ";
        values.add(this.getEjeDiaUltMod());
        fields += " EJE_CVE_ST_EJECUTI = ?, ";
        values.add(this.getEjeCveStEjecuti());
        fields += " EJE_NUM_NIVEL1 = ?, ";
        values.add(this.getEjeNumNivel1());
        fields += " EJE_NUM_NIVEL2 = ?, ";
        values.add(this.getEjeNumNivel2());
        fields += " EJE_NUM_NIVEL3 = ?, ";
        values.add(this.getEjeNumNivel3());
        fields += " EJE_NUM_NIVEL4 = ?, ";
        values.add(this.getEjeNumNivel4());
        fields += " EJE_NUM_NIVEL5 = ?, ";
        values.add(this.getEjeNumNivel5());
        fields += " EJE_EMAIL = ?, ";
        values.add(this.getEjeEmail());
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
        String sql = "INSERT INTO EJECUTIV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EJE_CVE_BANCA";
        fieldValues += ", ?";
        values.add(this.getEjeCveBanca());

        fields += ", EJE_NUM_EJEC_ATENC";
        fieldValues += ", ?";
        values.add(this.getEjeNumEjecAtenc());

        fields += ", EJE_NOM_EJECUTIVO";
        fieldValues += ", ?";
        values.add(this.getEjeNomEjecutivo());

        fields += ", EJE_CVE_TIPO_EJEC";
        fieldValues += ", ?";
        values.add(this.getEjeCveTipoEjec());

        fields += ", EJE_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getEjeCalleNum());

        fields += ", EJE_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getEjeNomColonia());

        fields += ", EJE_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getEjeNomPoblacion());

        fields += ", EJE_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getEjeCodigoPostal());

        fields += ", EJE_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getEjeNumPais());

        fields += ", EJE_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getEjeNomPais());

        fields += ", EJE_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getEjeNumEstado());

        fields += ", EJE_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getEjeNomEstado());

        fields += ", EJE_NUM_CVE_LADA1";
        fieldValues += ", ?";
        values.add(this.getEjeNumCveLada1());

        fields += ", EJE_NUM_TELEF1";
        fieldValues += ", ?";
        values.add(this.getEjeNumTelef1());

        fields += ", EJE_NUM_EXT1";
        fieldValues += ", ?";
        values.add(this.getEjeNumExt1());

        fields += ", EJE_NUM_CVE_LADA2";
        fieldValues += ", ?";
        values.add(this.getEjeNumCveLada2());

        fields += ", EJE_NUM_TELEF2";
        fieldValues += ", ?";
        values.add(this.getEjeNumTelef2());

        fields += ", EJE_NUM_EXT2";
        fieldValues += ", ?";
        values.add(this.getEjeNumExt2());

        fields += ", EJE_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getEjeNumLadaFax());

        fields += ", EJE_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getEjeNumTelefFax());

        fields += ", EJE_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getEjeNumExtFax());

        fields += ", EJE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEjeAnoAltaReg());

        fields += ", EJE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEjeMesAltaReg());

        fields += ", EJE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEjeDiaAltaReg());

        fields += ", EJE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEjeAnoUltMod());

        fields += ", EJE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEjeMesUltMod());

        fields += ", EJE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEjeDiaUltMod());

        fields += ", EJE_CVE_ST_EJECUTI";
        fieldValues += ", ?";
        values.add(this.getEjeCveStEjecuti());

        fields += ", EJE_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEjeNumNivel1());

        fields += ", EJE_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEjeNumNivel2());

        fields += ", EJE_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEjeNumNivel3());

        fields += ", EJE_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEjeNumNivel4());

        fields += ", EJE_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEjeNumNivel5());

        fields += ", EJE_EMAIL";
        fieldValues += ", ?";
        values.add(this.getEjeEmail());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EJECUTIV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EJE_CVE_BANCA = ?";
        values.add(this.getEjeCveBanca());
        conditions += " AND EJE_NUM_EJEC_ATENC = ?";
        values.add(this.getEjeNumEjecAtenc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ejecutiv instance = (Ejecutiv) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEjeCveBanca().equals(instance.getEjeCveBanca()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumEjecAtenc().equals(instance.getEjeNumEjecAtenc()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNomEjecutivo().equals(instance.getEjeNomEjecutivo()))
            equalObjects = false;
        if (equalObjects && !this.getEjeCveTipoEjec().equals(instance.getEjeCveTipoEjec()))
            equalObjects = false;
        if (equalObjects && !this.getEjeCalleNum().equals(instance.getEjeCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNomColonia().equals(instance.getEjeNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNomPoblacion().equals(instance.getEjeNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getEjeCodigoPostal().equals(instance.getEjeCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumPais().equals(instance.getEjeNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNomPais().equals(instance.getEjeNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumEstado().equals(instance.getEjeNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNomEstado().equals(instance.getEjeNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumCveLada1().equals(instance.getEjeNumCveLada1()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumTelef1().equals(instance.getEjeNumTelef1()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumExt1().equals(instance.getEjeNumExt1()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumCveLada2().equals(instance.getEjeNumCveLada2()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumTelef2().equals(instance.getEjeNumTelef2()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumExt2().equals(instance.getEjeNumExt2()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumLadaFax().equals(instance.getEjeNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumTelefFax().equals(instance.getEjeNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumExtFax().equals(instance.getEjeNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getEjeAnoAltaReg().equals(instance.getEjeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEjeMesAltaReg().equals(instance.getEjeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEjeDiaAltaReg().equals(instance.getEjeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEjeAnoUltMod().equals(instance.getEjeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEjeMesUltMod().equals(instance.getEjeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEjeDiaUltMod().equals(instance.getEjeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEjeCveStEjecuti().equals(instance.getEjeCveStEjecuti()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumNivel1().equals(instance.getEjeNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumNivel2().equals(instance.getEjeNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumNivel3().equals(instance.getEjeNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumNivel4().equals(instance.getEjeNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumNivel5().equals(instance.getEjeNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEjeEmail().equals(instance.getEjeEmail()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ejecutiv result = new Ejecutiv();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEjeCveBanca((String) objectData.getData("EJE_CVE_BANCA"));
        result.setEjeNumEjecAtenc((BigDecimal) objectData.getData("EJE_NUM_EJEC_ATENC"));
        result.setEjeNomEjecutivo((String) objectData.getData("EJE_NOM_EJECUTIVO"));
        result.setEjeCveTipoEjec((String) objectData.getData("EJE_CVE_TIPO_EJEC"));
        result.setEjeCalleNum((String) objectData.getData("EJE_CALLE_NUM"));
        result.setEjeNomColonia((String) objectData.getData("EJE_NOM_COLONIA"));
        result.setEjeNomPoblacion((String) objectData.getData("EJE_NOM_POBLACION"));
        result.setEjeCodigoPostal((BigDecimal) objectData.getData("EJE_CODIGO_POSTAL"));
        result.setEjeNumPais((BigDecimal) objectData.getData("EJE_NUM_PAIS"));
        result.setEjeNomPais((String) objectData.getData("EJE_NOM_PAIS"));
        result.setEjeNumEstado((BigDecimal) objectData.getData("EJE_NUM_ESTADO"));
        result.setEjeNomEstado((String) objectData.getData("EJE_NOM_ESTADO"));
        result.setEjeNumCveLada1((String) objectData.getData("EJE_NUM_CVE_LADA1"));
        result.setEjeNumTelef1((String) objectData.getData("EJE_NUM_TELEF1"));
        result.setEjeNumExt1((String) objectData.getData("EJE_NUM_EXT1"));
        result.setEjeNumCveLada2((String) objectData.getData("EJE_NUM_CVE_LADA2"));
        result.setEjeNumTelef2((String) objectData.getData("EJE_NUM_TELEF2"));
        result.setEjeNumExt2((String) objectData.getData("EJE_NUM_EXT2"));
        result.setEjeNumLadaFax((String) objectData.getData("EJE_NUM_LADA_FAX"));
        result.setEjeNumTelefFax((String) objectData.getData("EJE_NUM_TELEF_FAX"));
        result.setEjeNumExtFax((String) objectData.getData("EJE_NUM_EXT_FAX"));
        result.setEjeAnoAltaReg((BigDecimal) objectData.getData("EJE_ANO_ALTA_REG"));
        result.setEjeMesAltaReg((BigDecimal) objectData.getData("EJE_MES_ALTA_REG"));
        result.setEjeDiaAltaReg((BigDecimal) objectData.getData("EJE_DIA_ALTA_REG"));
        result.setEjeAnoUltMod((BigDecimal) objectData.getData("EJE_ANO_ULT_MOD"));
        result.setEjeMesUltMod((BigDecimal) objectData.getData("EJE_MES_ULT_MOD"));
        result.setEjeDiaUltMod((BigDecimal) objectData.getData("EJE_DIA_ULT_MOD"));
        result.setEjeCveStEjecuti((String) objectData.getData("EJE_CVE_ST_EJECUTI"));
        result.setEjeNumNivel1((BigDecimal) objectData.getData("EJE_NUM_NIVEL1"));
        result.setEjeNumNivel2((BigDecimal) objectData.getData("EJE_NUM_NIVEL2"));
        result.setEjeNumNivel3((BigDecimal) objectData.getData("EJE_NUM_NIVEL3"));
        result.setEjeNumNivel4((BigDecimal) objectData.getData("EJE_NUM_NIVEL4"));
        result.setEjeNumNivel5((BigDecimal) objectData.getData("EJE_NUM_NIVEL5"));
        result.setEjeEmail((String) objectData.getData("EJE_EMAIL"));

        return result;

    }

}
