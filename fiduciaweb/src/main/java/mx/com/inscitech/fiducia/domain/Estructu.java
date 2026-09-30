package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESTRUCTU_PK", columns = { "EST_NUM_NIVEL1", "EST_NUM_NIVEL2", "EST_NUM_NIVEL3", "EST_NUM_NIVEL4", "EST_NUM_NIVEL5" }, sequences = { "MANUAL" })
public class Estructu extends DomainObject {

    BigDecimal estNumNivel1 = null;
    BigDecimal estNumNivel2 = null;
    BigDecimal estNumNivel3 = null;
    BigDecimal estNumNivel4 = null;
    BigDecimal estNumNivel5 = null;
    String estDescNivel = null;
    String estNomRespNivel = null;
    String estCalleNum = null;
    String estNomColonia = null;
    String estNomPoblacion = null;
    BigDecimal estCodigoPostal = null;
    BigDecimal estNumEstado = null;
    String estNomEstado = null;
    BigDecimal estNumPais = null;
    String estNomPais = null;
    String estNumCveLada1 = null;
    String estNumTelef1 = null;
    String estNumExt1 = null;
    String estNumCveLada2 = null;
    String estNumTelef2 = null;
    String estNumExt2 = null;
    String estNumLadaFax = null;
    String estNumTelefFax = null;
    String estNumExtFax = null;
    BigDecimal estNumCenLogro = null;
    BigDecimal estNumCenCosto = null;
    BigDecimal estAnoAltaReg = null;
    BigDecimal estMesAltaReg = null;
    BigDecimal estDiaAltaReg = null;
    BigDecimal estAnoUltMod = null;
    BigDecimal estMesUltMod = null;
    BigDecimal estDiaUltMod = null;
    String estCveStNivel = null;

    public Estructu() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumNivel1(BigDecimal estNumNivel1) {
        this.estNumNivel1 = estNumNivel1;
    }

    public BigDecimal getEstNumNivel1() {
        return this.estNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumNivel2(BigDecimal estNumNivel2) {
        this.estNumNivel2 = estNumNivel2;
    }

    public BigDecimal getEstNumNivel2() {
        return this.estNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumNivel3(BigDecimal estNumNivel3) {
        this.estNumNivel3 = estNumNivel3;
    }

    public BigDecimal getEstNumNivel3() {
        return this.estNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumNivel4(BigDecimal estNumNivel4) {
        this.estNumNivel4 = estNumNivel4;
    }

    public BigDecimal getEstNumNivel4() {
        return this.estNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumNivel5(BigDecimal estNumNivel5) {
        this.estNumNivel5 = estNumNivel5;
    }

    public BigDecimal getEstNumNivel5() {
        return this.estNumNivel5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstDescNivel(String estDescNivel) {
        this.estDescNivel = estDescNivel;
    }

    public String getEstDescNivel() {
        return this.estDescNivel;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNomRespNivel(String estNomRespNivel) {
        this.estNomRespNivel = estNomRespNivel;
    }

    public String getEstNomRespNivel() {
        return this.estNomRespNivel;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstCalleNum(String estCalleNum) {
        this.estCalleNum = estCalleNum;
    }

    public String getEstCalleNum() {
        return this.estCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNomColonia(String estNomColonia) {
        this.estNomColonia = estNomColonia;
    }

    public String getEstNomColonia() {
        return this.estNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNomPoblacion(String estNomPoblacion) {
        this.estNomPoblacion = estNomPoblacion;
    }

    public String getEstNomPoblacion() {
        return this.estNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstCodigoPostal(BigDecimal estCodigoPostal) {
        this.estCodigoPostal = estCodigoPostal;
    }

    public BigDecimal getEstCodigoPostal() {
        return this.estCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumEstado(BigDecimal estNumEstado) {
        this.estNumEstado = estNumEstado;
    }

    public BigDecimal getEstNumEstado() {
        return this.estNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNomEstado(String estNomEstado) {
        this.estNomEstado = estNomEstado;
    }

    public String getEstNomEstado() {
        return this.estNomEstado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumPais(BigDecimal estNumPais) {
        this.estNumPais = estNumPais;
    }

    public BigDecimal getEstNumPais() {
        return this.estNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNomPais(String estNomPais) {
        this.estNomPais = estNomPais;
    }

    public String getEstNomPais() {
        return this.estNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumCveLada1(String estNumCveLada1) {
        this.estNumCveLada1 = estNumCveLada1;
    }

    public String getEstNumCveLada1() {
        return this.estNumCveLada1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumTelef1(String estNumTelef1) {
        this.estNumTelef1 = estNumTelef1;
    }

    public String getEstNumTelef1() {
        return this.estNumTelef1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumExt1(String estNumExt1) {
        this.estNumExt1 = estNumExt1;
    }

    public String getEstNumExt1() {
        return this.estNumExt1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumCveLada2(String estNumCveLada2) {
        this.estNumCveLada2 = estNumCveLada2;
    }

    public String getEstNumCveLada2() {
        return this.estNumCveLada2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumTelef2(String estNumTelef2) {
        this.estNumTelef2 = estNumTelef2;
    }

    public String getEstNumTelef2() {
        return this.estNumTelef2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumExt2(String estNumExt2) {
        this.estNumExt2 = estNumExt2;
    }

    public String getEstNumExt2() {
        return this.estNumExt2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumLadaFax(String estNumLadaFax) {
        this.estNumLadaFax = estNumLadaFax;
    }

    public String getEstNumLadaFax() {
        return this.estNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumTelefFax(String estNumTelefFax) {
        this.estNumTelefFax = estNumTelefFax;
    }

    public String getEstNumTelefFax() {
        return this.estNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstNumExtFax(String estNumExtFax) {
        this.estNumExtFax = estNumExtFax;
    }

    public String getEstNumExtFax() {
        return this.estNumExtFax;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumCenLogro(BigDecimal estNumCenLogro) {
        this.estNumCenLogro = estNumCenLogro;
    }

    public BigDecimal getEstNumCenLogro() {
        return this.estNumCenLogro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstNumCenCosto(BigDecimal estNumCenCosto) {
        this.estNumCenCosto = estNumCenCosto;
    }

    public BigDecimal getEstNumCenCosto() {
        return this.estNumCenCosto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstAnoAltaReg(BigDecimal estAnoAltaReg) {
        this.estAnoAltaReg = estAnoAltaReg;
    }

    public BigDecimal getEstAnoAltaReg() {
        return this.estAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstMesAltaReg(BigDecimal estMesAltaReg) {
        this.estMesAltaReg = estMesAltaReg;
    }

    public BigDecimal getEstMesAltaReg() {
        return this.estMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstDiaAltaReg(BigDecimal estDiaAltaReg) {
        this.estDiaAltaReg = estDiaAltaReg;
    }

    public BigDecimal getEstDiaAltaReg() {
        return this.estDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstAnoUltMod(BigDecimal estAnoUltMod) {
        this.estAnoUltMod = estAnoUltMod;
    }

    public BigDecimal getEstAnoUltMod() {
        return this.estAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstMesUltMod(BigDecimal estMesUltMod) {
        this.estMesUltMod = estMesUltMod;
    }

    public BigDecimal getEstMesUltMod() {
        return this.estMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstDiaUltMod(BigDecimal estDiaUltMod) {
        this.estDiaUltMod = estDiaUltMod;
    }

    public BigDecimal getEstDiaUltMod() {
        return this.estDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstCveStNivel(String estCveStNivel) {
        this.estCveStNivel = estCveStNivel;
    }

    public String getEstCveStNivel() {
        return this.estCveStNivel;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESTRUCTU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstNumNivel1() != null && this.getEstNumNivel1().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL1 IS NULL";
        } else if (this.getEstNumNivel1() != null) {
            conditions += " AND EST_NUM_NIVEL1 = ?";
            values.add(this.getEstNumNivel1());
        }

        if (this.getEstNumNivel2() != null && this.getEstNumNivel2().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL2 IS NULL";
        } else if (this.getEstNumNivel2() != null) {
            conditions += " AND EST_NUM_NIVEL2 = ?";
            values.add(this.getEstNumNivel2());
        }

        if (this.getEstNumNivel3() != null && this.getEstNumNivel3().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL3 IS NULL";
        } else if (this.getEstNumNivel3() != null) {
            conditions += " AND EST_NUM_NIVEL3 = ?";
            values.add(this.getEstNumNivel3());
        }

        if (this.getEstNumNivel4() != null && this.getEstNumNivel4().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL4 IS NULL";
        } else if (this.getEstNumNivel4() != null) {
            conditions += " AND EST_NUM_NIVEL4 = ?";
            values.add(this.getEstNumNivel4());
        }

        if (this.getEstNumNivel5() != null && this.getEstNumNivel5().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL5 IS NULL";
        } else if (this.getEstNumNivel5() != null) {
            conditions += " AND EST_NUM_NIVEL5 = ?";
            values.add(this.getEstNumNivel5());
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
        String sql = "SELECT * FROM ESTRUCTU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstNumNivel1() != null && this.getEstNumNivel1().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL1 IS NULL";
        } else if (this.getEstNumNivel1() != null) {
            conditions += " AND EST_NUM_NIVEL1 = ?";
            values.add(this.getEstNumNivel1());
        }

        if (this.getEstNumNivel2() != null && this.getEstNumNivel2().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL2 IS NULL";
        } else if (this.getEstNumNivel2() != null) {
            conditions += " AND EST_NUM_NIVEL2 = ?";
            values.add(this.getEstNumNivel2());
        }

        if (this.getEstNumNivel3() != null && this.getEstNumNivel3().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL3 IS NULL";
        } else if (this.getEstNumNivel3() != null) {
            conditions += " AND EST_NUM_NIVEL3 = ?";
            values.add(this.getEstNumNivel3());
        }

        if (this.getEstNumNivel4() != null && this.getEstNumNivel4().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL4 IS NULL";
        } else if (this.getEstNumNivel4() != null) {
            conditions += " AND EST_NUM_NIVEL4 = ?";
            values.add(this.getEstNumNivel4());
        }

        if (this.getEstNumNivel5() != null && this.getEstNumNivel5().longValue() == -999) {
            conditions += " AND EST_NUM_NIVEL5 IS NULL";
        } else if (this.getEstNumNivel5() != null) {
            conditions += " AND EST_NUM_NIVEL5 = ?";
            values.add(this.getEstNumNivel5());
        }

        if (this.getEstDescNivel() != null && "null".equals(this.getEstDescNivel())) {
            conditions += " AND EST_DESC_NIVEL IS NULL";
        } else if (this.getEstDescNivel() != null) {
            conditions += " AND EST_DESC_NIVEL = ?";
            values.add(this.getEstDescNivel());
        }

        if (this.getEstNomRespNivel() != null && "null".equals(this.getEstNomRespNivel())) {
            conditions += " AND EST_NOM_RESP_NIVEL IS NULL";
        } else if (this.getEstNomRespNivel() != null) {
            conditions += " AND EST_NOM_RESP_NIVEL = ?";
            values.add(this.getEstNomRespNivel());
        }

        if (this.getEstCalleNum() != null && "null".equals(this.getEstCalleNum())) {
            conditions += " AND EST_CALLE_NUM IS NULL";
        } else if (this.getEstCalleNum() != null) {
            conditions += " AND EST_CALLE_NUM = ?";
            values.add(this.getEstCalleNum());
        }

        if (this.getEstNomColonia() != null && "null".equals(this.getEstNomColonia())) {
            conditions += " AND EST_NOM_COLONIA IS NULL";
        } else if (this.getEstNomColonia() != null) {
            conditions += " AND EST_NOM_COLONIA = ?";
            values.add(this.getEstNomColonia());
        }

        if (this.getEstNomPoblacion() != null && "null".equals(this.getEstNomPoblacion())) {
            conditions += " AND EST_NOM_POBLACION IS NULL";
        } else if (this.getEstNomPoblacion() != null) {
            conditions += " AND EST_NOM_POBLACION = ?";
            values.add(this.getEstNomPoblacion());
        }

        if (this.getEstCodigoPostal() != null && this.getEstCodigoPostal().longValue() == -999) {
            conditions += " AND EST_CODIGO_POSTAL IS NULL";
        } else if (this.getEstCodigoPostal() != null) {
            conditions += " AND EST_CODIGO_POSTAL = ?";
            values.add(this.getEstCodigoPostal());
        }

        if (this.getEstNumEstado() != null && this.getEstNumEstado().longValue() == -999) {
            conditions += " AND EST_NUM_ESTADO IS NULL";
        } else if (this.getEstNumEstado() != null) {
            conditions += " AND EST_NUM_ESTADO = ?";
            values.add(this.getEstNumEstado());
        }

        if (this.getEstNomEstado() != null && "null".equals(this.getEstNomEstado())) {
            conditions += " AND EST_NOM_ESTADO IS NULL";
        } else if (this.getEstNomEstado() != null) {
            conditions += " AND EST_NOM_ESTADO = ?";
            values.add(this.getEstNomEstado());
        }

        if (this.getEstNumPais() != null && this.getEstNumPais().longValue() == -999) {
            conditions += " AND EST_NUM_PAIS IS NULL";
        } else if (this.getEstNumPais() != null) {
            conditions += " AND EST_NUM_PAIS = ?";
            values.add(this.getEstNumPais());
        }

        if (this.getEstNomPais() != null && "null".equals(this.getEstNomPais())) {
            conditions += " AND EST_NOM_PAIS IS NULL";
        } else if (this.getEstNomPais() != null) {
            conditions += " AND EST_NOM_PAIS = ?";
            values.add(this.getEstNomPais());
        }

        if (this.getEstNumCveLada1() != null && "null".equals(this.getEstNumCveLada1())) {
            conditions += " AND EST_NUM_CVE_LADA1 IS NULL";
        } else if (this.getEstNumCveLada1() != null) {
            conditions += " AND EST_NUM_CVE_LADA1 = ?";
            values.add(this.getEstNumCveLada1());
        }

        if (this.getEstNumTelef1() != null && "null".equals(this.getEstNumTelef1())) {
            conditions += " AND EST_NUM_TELEF1 IS NULL";
        } else if (this.getEstNumTelef1() != null) {
            conditions += " AND EST_NUM_TELEF1 = ?";
            values.add(this.getEstNumTelef1());
        }

        if (this.getEstNumExt1() != null && "null".equals(this.getEstNumExt1())) {
            conditions += " AND EST_NUM_EXT1 IS NULL";
        } else if (this.getEstNumExt1() != null) {
            conditions += " AND EST_NUM_EXT1 = ?";
            values.add(this.getEstNumExt1());
        }

        if (this.getEstNumCveLada2() != null && "null".equals(this.getEstNumCveLada2())) {
            conditions += " AND EST_NUM_CVE_LADA2 IS NULL";
        } else if (this.getEstNumCveLada2() != null) {
            conditions += " AND EST_NUM_CVE_LADA2 = ?";
            values.add(this.getEstNumCveLada2());
        }

        if (this.getEstNumTelef2() != null && "null".equals(this.getEstNumTelef2())) {
            conditions += " AND EST_NUM_TELEF2 IS NULL";
        } else if (this.getEstNumTelef2() != null) {
            conditions += " AND EST_NUM_TELEF2 = ?";
            values.add(this.getEstNumTelef2());
        }

        if (this.getEstNumExt2() != null && "null".equals(this.getEstNumExt2())) {
            conditions += " AND EST_NUM_EXT2 IS NULL";
        } else if (this.getEstNumExt2() != null) {
            conditions += " AND EST_NUM_EXT2 = ?";
            values.add(this.getEstNumExt2());
        }

        if (this.getEstNumLadaFax() != null && "null".equals(this.getEstNumLadaFax())) {
            conditions += " AND EST_NUM_LADA_FAX IS NULL";
        } else if (this.getEstNumLadaFax() != null) {
            conditions += " AND EST_NUM_LADA_FAX = ?";
            values.add(this.getEstNumLadaFax());
        }

        if (this.getEstNumTelefFax() != null && "null".equals(this.getEstNumTelefFax())) {
            conditions += " AND EST_NUM_TELEF_FAX IS NULL";
        } else if (this.getEstNumTelefFax() != null) {
            conditions += " AND EST_NUM_TELEF_FAX = ?";
            values.add(this.getEstNumTelefFax());
        }

        if (this.getEstNumExtFax() != null && "null".equals(this.getEstNumExtFax())) {
            conditions += " AND EST_NUM_EXT_FAX IS NULL";
        } else if (this.getEstNumExtFax() != null) {
            conditions += " AND EST_NUM_EXT_FAX = ?";
            values.add(this.getEstNumExtFax());
        }

        if (this.getEstNumCenLogro() != null && this.getEstNumCenLogro().longValue() == -999) {
            conditions += " AND EST_NUM_CEN_LOGRO IS NULL";
        } else if (this.getEstNumCenLogro() != null) {
            conditions += " AND EST_NUM_CEN_LOGRO = ?";
            values.add(this.getEstNumCenLogro());
        }

        if (this.getEstNumCenCosto() != null && this.getEstNumCenCosto().longValue() == -999) {
            conditions += " AND EST_NUM_CEN_COSTO IS NULL";
        } else if (this.getEstNumCenCosto() != null) {
            conditions += " AND EST_NUM_CEN_COSTO = ?";
            values.add(this.getEstNumCenCosto());
        }

        if (this.getEstAnoAltaReg() != null && this.getEstAnoAltaReg().longValue() == -999) {
            conditions += " AND EST_ANO_ALTA_REG IS NULL";
        } else if (this.getEstAnoAltaReg() != null) {
            conditions += " AND EST_ANO_ALTA_REG = ?";
            values.add(this.getEstAnoAltaReg());
        }

        if (this.getEstMesAltaReg() != null && this.getEstMesAltaReg().longValue() == -999) {
            conditions += " AND EST_MES_ALTA_REG IS NULL";
        } else if (this.getEstMesAltaReg() != null) {
            conditions += " AND EST_MES_ALTA_REG = ?";
            values.add(this.getEstMesAltaReg());
        }

        if (this.getEstDiaAltaReg() != null && this.getEstDiaAltaReg().longValue() == -999) {
            conditions += " AND EST_DIA_ALTA_REG IS NULL";
        } else if (this.getEstDiaAltaReg() != null) {
            conditions += " AND EST_DIA_ALTA_REG = ?";
            values.add(this.getEstDiaAltaReg());
        }

        if (this.getEstAnoUltMod() != null && this.getEstAnoUltMod().longValue() == -999) {
            conditions += " AND EST_ANO_ULT_MOD IS NULL";
        } else if (this.getEstAnoUltMod() != null) {
            conditions += " AND EST_ANO_ULT_MOD = ?";
            values.add(this.getEstAnoUltMod());
        }

        if (this.getEstMesUltMod() != null && this.getEstMesUltMod().longValue() == -999) {
            conditions += " AND EST_MES_ULT_MOD IS NULL";
        } else if (this.getEstMesUltMod() != null) {
            conditions += " AND EST_MES_ULT_MOD = ?";
            values.add(this.getEstMesUltMod());
        }

        if (this.getEstDiaUltMod() != null && this.getEstDiaUltMod().longValue() == -999) {
            conditions += " AND EST_DIA_ULT_MOD IS NULL";
        } else if (this.getEstDiaUltMod() != null) {
            conditions += " AND EST_DIA_ULT_MOD = ?";
            values.add(this.getEstDiaUltMod());
        }

        if (this.getEstCveStNivel() != null && "null".equals(this.getEstCveStNivel())) {
            conditions += " AND EST_CVE_ST_NIVEL IS NULL";
        } else if (this.getEstCveStNivel() != null) {
            conditions += " AND EST_CVE_ST_NIVEL = ?";
            values.add(this.getEstCveStNivel());
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
        String sql = "UPDATE ESTRUCTU SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EST_NUM_NIVEL1 = ?";
        pkValues.add(this.getEstNumNivel1());
        conditions += " AND EST_NUM_NIVEL2 = ?";
        pkValues.add(this.getEstNumNivel2());
        conditions += " AND EST_NUM_NIVEL3 = ?";
        pkValues.add(this.getEstNumNivel3());
        conditions += " AND EST_NUM_NIVEL4 = ?";
        pkValues.add(this.getEstNumNivel4());
        conditions += " AND EST_NUM_NIVEL5 = ?";
        pkValues.add(this.getEstNumNivel5());
        fields += " EST_DESC_NIVEL = ?, ";
        values.add(this.getEstDescNivel());
        fields += " EST_NOM_RESP_NIVEL = ?, ";
        values.add(this.getEstNomRespNivel());
        fields += " EST_CALLE_NUM = ?, ";
        values.add(this.getEstCalleNum());
        fields += " EST_NOM_COLONIA = ?, ";
        values.add(this.getEstNomColonia());
        fields += " EST_NOM_POBLACION = ?, ";
        values.add(this.getEstNomPoblacion());
        fields += " EST_CODIGO_POSTAL = ?, ";
        values.add(this.getEstCodigoPostal());
        fields += " EST_NUM_ESTADO = ?, ";
        values.add(this.getEstNumEstado());
        fields += " EST_NOM_ESTADO = ?, ";
        values.add(this.getEstNomEstado());
        fields += " EST_NUM_PAIS = ?, ";
        values.add(this.getEstNumPais());
        fields += " EST_NOM_PAIS = ?, ";
        values.add(this.getEstNomPais());
        fields += " EST_NUM_CVE_LADA1 = ?, ";
        values.add(this.getEstNumCveLada1());
        fields += " EST_NUM_TELEF1 = ?, ";
        values.add(this.getEstNumTelef1());
        fields += " EST_NUM_EXT1 = ?, ";
        values.add(this.getEstNumExt1());
        fields += " EST_NUM_CVE_LADA2 = ?, ";
        values.add(this.getEstNumCveLada2());
        fields += " EST_NUM_TELEF2 = ?, ";
        values.add(this.getEstNumTelef2());
        fields += " EST_NUM_EXT2 = ?, ";
        values.add(this.getEstNumExt2());
        fields += " EST_NUM_LADA_FAX = ?, ";
        values.add(this.getEstNumLadaFax());
        fields += " EST_NUM_TELEF_FAX = ?, ";
        values.add(this.getEstNumTelefFax());
        fields += " EST_NUM_EXT_FAX = ?, ";
        values.add(this.getEstNumExtFax());
        fields += " EST_NUM_CEN_LOGRO = ?, ";
        values.add(this.getEstNumCenLogro());
        fields += " EST_NUM_CEN_COSTO = ?, ";
        values.add(this.getEstNumCenCosto());
        fields += " EST_ANO_ALTA_REG = ?, ";
        values.add(this.getEstAnoAltaReg());
        fields += " EST_MES_ALTA_REG = ?, ";
        values.add(this.getEstMesAltaReg());
        fields += " EST_DIA_ALTA_REG = ?, ";
        values.add(this.getEstDiaAltaReg());
        fields += " EST_ANO_ULT_MOD = ?, ";
        values.add(this.getEstAnoUltMod());
        fields += " EST_MES_ULT_MOD = ?, ";
        values.add(this.getEstMesUltMod());
        fields += " EST_DIA_ULT_MOD = ?, ";
        values.add(this.getEstDiaUltMod());
        fields += " EST_CVE_ST_NIVEL = ?, ";
        values.add(this.getEstCveStNivel());
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
        String sql = "INSERT INTO ESTRUCTU ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EST_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEstNumNivel1());

        fields += ", EST_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEstNumNivel2());

        fields += ", EST_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEstNumNivel3());

        fields += ", EST_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEstNumNivel4());

        fields += ", EST_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEstNumNivel5());

        fields += ", EST_DESC_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstDescNivel());

        fields += ", EST_NOM_RESP_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstNomRespNivel());

        fields += ", EST_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getEstCalleNum());

        fields += ", EST_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getEstNomColonia());

        fields += ", EST_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getEstNomPoblacion());

        fields += ", EST_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getEstCodigoPostal());

        fields += ", EST_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getEstNumEstado());

        fields += ", EST_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getEstNomEstado());

        fields += ", EST_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getEstNumPais());

        fields += ", EST_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getEstNomPais());

        fields += ", EST_NUM_CVE_LADA1";
        fieldValues += ", ?";
        values.add(this.getEstNumCveLada1());

        fields += ", EST_NUM_TELEF1";
        fieldValues += ", ?";
        values.add(this.getEstNumTelef1());

        fields += ", EST_NUM_EXT1";
        fieldValues += ", ?";
        values.add(this.getEstNumExt1());

        fields += ", EST_NUM_CVE_LADA2";
        fieldValues += ", ?";
        values.add(this.getEstNumCveLada2());

        fields += ", EST_NUM_TELEF2";
        fieldValues += ", ?";
        values.add(this.getEstNumTelef2());

        fields += ", EST_NUM_EXT2";
        fieldValues += ", ?";
        values.add(this.getEstNumExt2());

        fields += ", EST_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getEstNumLadaFax());

        fields += ", EST_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getEstNumTelefFax());

        fields += ", EST_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getEstNumExtFax());

        fields += ", EST_NUM_CEN_LOGRO";
        fieldValues += ", ?";
        values.add(this.getEstNumCenLogro());

        fields += ", EST_NUM_CEN_COSTO";
        fieldValues += ", ?";
        values.add(this.getEstNumCenCosto());

        fields += ", EST_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstAnoAltaReg());

        fields += ", EST_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstMesAltaReg());

        fields += ", EST_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstDiaAltaReg());

        fields += ", EST_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstAnoUltMod());

        fields += ", EST_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstMesUltMod());

        fields += ", EST_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstDiaUltMod());

        fields += ", EST_CVE_ST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstCveStNivel());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESTRUCTU WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EST_NUM_NIVEL1 = ?";
        values.add(this.getEstNumNivel1());
        conditions += " AND EST_NUM_NIVEL2 = ?";
        values.add(this.getEstNumNivel2());
        conditions += " AND EST_NUM_NIVEL3 = ?";
        values.add(this.getEstNumNivel3());
        conditions += " AND EST_NUM_NIVEL4 = ?";
        values.add(this.getEstNumNivel4());
        conditions += " AND EST_NUM_NIVEL5 = ?";
        values.add(this.getEstNumNivel5());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Estructu instance = (Estructu) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstNumNivel1().equals(instance.getEstNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumNivel2().equals(instance.getEstNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumNivel3().equals(instance.getEstNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumNivel4().equals(instance.getEstNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumNivel5().equals(instance.getEstNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEstDescNivel().equals(instance.getEstDescNivel()))
            equalObjects = false;
        if (equalObjects && !this.getEstNomRespNivel().equals(instance.getEstNomRespNivel()))
            equalObjects = false;
        if (equalObjects && !this.getEstCalleNum().equals(instance.getEstCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getEstNomColonia().equals(instance.getEstNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getEstNomPoblacion().equals(instance.getEstNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getEstCodigoPostal().equals(instance.getEstCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumEstado().equals(instance.getEstNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getEstNomEstado().equals(instance.getEstNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumPais().equals(instance.getEstNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getEstNomPais().equals(instance.getEstNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumCveLada1().equals(instance.getEstNumCveLada1()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumTelef1().equals(instance.getEstNumTelef1()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumExt1().equals(instance.getEstNumExt1()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumCveLada2().equals(instance.getEstNumCveLada2()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumTelef2().equals(instance.getEstNumTelef2()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumExt2().equals(instance.getEstNumExt2()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumLadaFax().equals(instance.getEstNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumTelefFax().equals(instance.getEstNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumExtFax().equals(instance.getEstNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumCenLogro().equals(instance.getEstNumCenLogro()))
            equalObjects = false;
        if (equalObjects && !this.getEstNumCenCosto().equals(instance.getEstNumCenCosto()))
            equalObjects = false;
        if (equalObjects && !this.getEstAnoAltaReg().equals(instance.getEstAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstMesAltaReg().equals(instance.getEstMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstDiaAltaReg().equals(instance.getEstDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstAnoUltMod().equals(instance.getEstAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstMesUltMod().equals(instance.getEstMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstDiaUltMod().equals(instance.getEstDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstCveStNivel().equals(instance.getEstCveStNivel()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Estructu result = new Estructu();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstNumNivel1((BigDecimal) objectData.getData("EST_NUM_NIVEL1"));
        result.setEstNumNivel2((BigDecimal) objectData.getData("EST_NUM_NIVEL2"));
        result.setEstNumNivel3((BigDecimal) objectData.getData("EST_NUM_NIVEL3"));
        result.setEstNumNivel4((BigDecimal) objectData.getData("EST_NUM_NIVEL4"));
        result.setEstNumNivel5((BigDecimal) objectData.getData("EST_NUM_NIVEL5"));
        result.setEstDescNivel((String) objectData.getData("EST_DESC_NIVEL"));
        result.setEstNomRespNivel((String) objectData.getData("EST_NOM_RESP_NIVEL"));
        result.setEstCalleNum((String) objectData.getData("EST_CALLE_NUM"));
        result.setEstNomColonia((String) objectData.getData("EST_NOM_COLONIA"));
        result.setEstNomPoblacion((String) objectData.getData("EST_NOM_POBLACION"));
        result.setEstCodigoPostal((BigDecimal) objectData.getData("EST_CODIGO_POSTAL"));
        result.setEstNumEstado((BigDecimal) objectData.getData("EST_NUM_ESTADO"));
        result.setEstNomEstado((String) objectData.getData("EST_NOM_ESTADO"));
        result.setEstNumPais((BigDecimal) objectData.getData("EST_NUM_PAIS"));
        result.setEstNomPais((String) objectData.getData("EST_NOM_PAIS"));
        result.setEstNumCveLada1((String) objectData.getData("EST_NUM_CVE_LADA1"));
        result.setEstNumTelef1((String) objectData.getData("EST_NUM_TELEF1"));
        result.setEstNumExt1((String) objectData.getData("EST_NUM_EXT1"));
        result.setEstNumCveLada2((String) objectData.getData("EST_NUM_CVE_LADA2"));
        result.setEstNumTelef2((String) objectData.getData("EST_NUM_TELEF2"));
        result.setEstNumExt2((String) objectData.getData("EST_NUM_EXT2"));
        result.setEstNumLadaFax((String) objectData.getData("EST_NUM_LADA_FAX"));
        result.setEstNumTelefFax((String) objectData.getData("EST_NUM_TELEF_FAX"));
        result.setEstNumExtFax((String) objectData.getData("EST_NUM_EXT_FAX"));
        result.setEstNumCenLogro((BigDecimal) objectData.getData("EST_NUM_CEN_LOGRO"));
        result.setEstNumCenCosto((BigDecimal) objectData.getData("EST_NUM_CEN_COSTO"));
        result.setEstAnoAltaReg((BigDecimal) objectData.getData("EST_ANO_ALTA_REG"));
        result.setEstMesAltaReg((BigDecimal) objectData.getData("EST_MES_ALTA_REG"));
        result.setEstDiaAltaReg((BigDecimal) objectData.getData("EST_DIA_ALTA_REG"));
        result.setEstAnoUltMod((BigDecimal) objectData.getData("EST_ANO_ULT_MOD"));
        result.setEstMesUltMod((BigDecimal) objectData.getData("EST_MES_ULT_MOD"));
        result.setEstDiaUltMod((BigDecimal) objectData.getData("EST_DIA_ULT_MOD"));
        result.setEstCveStNivel((String) objectData.getData("EST_CVE_ST_NIVEL"));

        return result;

    }

}
