package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GESTORES_PK", columns = { "GES_NUM_GESTOR" }, sequences = { "MAX" })
public class Gestores extends DomainObject {

    BigDecimal gesNumGestor = null;
    String gesNomGestor = null;
    String gesRfc = null;
    String gesCveTramita = null;
    String gesCalleNum = null;
    String gesNomColonia = null;
    String gesNomPoblacion = null;
    BigDecimal gesCodigoPostal = null;
    BigDecimal gesNumEstado = null;
    String gesNomEstado = null;
    BigDecimal gesNumPais = null;
    String gesNomPais = null;
    String gesNumLadaCasa = null;
    String gesNumTelefCasa = null;
    String gesNumLadaOfic = null;
    String gesNumTelefOfic = null;
    String gesNumExtOfic = null;
    String gesNumLadaFax = null;
    String gesNumTelefFax = null;
    String gesNumExtFax = null;
    BigDecimal gesAnoAltaReg = null;
    BigDecimal gesMesAltaReg = null;
    BigDecimal gesDiaAltaReg = null;
    BigDecimal gesAnoUltMod = null;
    BigDecimal gesMesUltMod = null;
    BigDecimal gesDiaUltMod = null;
    String gesCveStGestor = null;
    String gesNumLada2Ofi = null;
    String gesNumTel2Ofi = null;
    String gesNumExt2Ofi = null;
    String gesEMail = null;
    String gesNumRegistro = null;

    public Gestores() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGesNumGestor(BigDecimal gesNumGestor) {
        this.gesNumGestor = gesNumGestor;
    }

    public BigDecimal getGesNumGestor() {
        return this.gesNumGestor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNomGestor(String gesNomGestor) {
        this.gesNomGestor = gesNomGestor;
    }

    public String getGesNomGestor() {
        return this.gesNomGestor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesRfc(String gesRfc) {
        this.gesRfc = gesRfc;
    }

    public String getGesRfc() {
        return this.gesRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesCveTramita(String gesCveTramita) {
        this.gesCveTramita = gesCveTramita;
    }

    public String getGesCveTramita() {
        return this.gesCveTramita;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesCalleNum(String gesCalleNum) {
        this.gesCalleNum = gesCalleNum;
    }

    public String getGesCalleNum() {
        return this.gesCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNomColonia(String gesNomColonia) {
        this.gesNomColonia = gesNomColonia;
    }

    public String getGesNomColonia() {
        return this.gesNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNomPoblacion(String gesNomPoblacion) {
        this.gesNomPoblacion = gesNomPoblacion;
    }

    public String getGesNomPoblacion() {
        return this.gesNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGesCodigoPostal(BigDecimal gesCodigoPostal) {
        this.gesCodigoPostal = gesCodigoPostal;
    }

    public BigDecimal getGesCodigoPostal() {
        return this.gesCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGesNumEstado(BigDecimal gesNumEstado) {
        this.gesNumEstado = gesNumEstado;
    }

    public BigDecimal getGesNumEstado() {
        return this.gesNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNomEstado(String gesNomEstado) {
        this.gesNomEstado = gesNomEstado;
    }

    public String getGesNomEstado() {
        return this.gesNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGesNumPais(BigDecimal gesNumPais) {
        this.gesNumPais = gesNumPais;
    }

    public BigDecimal getGesNumPais() {
        return this.gesNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNomPais(String gesNomPais) {
        this.gesNomPais = gesNomPais;
    }

    public String getGesNomPais() {
        return this.gesNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumLadaCasa(String gesNumLadaCasa) {
        this.gesNumLadaCasa = gesNumLadaCasa;
    }

    public String getGesNumLadaCasa() {
        return this.gesNumLadaCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumTelefCasa(String gesNumTelefCasa) {
        this.gesNumTelefCasa = gesNumTelefCasa;
    }

    public String getGesNumTelefCasa() {
        return this.gesNumTelefCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumLadaOfic(String gesNumLadaOfic) {
        this.gesNumLadaOfic = gesNumLadaOfic;
    }

    public String getGesNumLadaOfic() {
        return this.gesNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumTelefOfic(String gesNumTelefOfic) {
        this.gesNumTelefOfic = gesNumTelefOfic;
    }

    public String getGesNumTelefOfic() {
        return this.gesNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumExtOfic(String gesNumExtOfic) {
        this.gesNumExtOfic = gesNumExtOfic;
    }

    public String getGesNumExtOfic() {
        return this.gesNumExtOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumLadaFax(String gesNumLadaFax) {
        this.gesNumLadaFax = gesNumLadaFax;
    }

    public String getGesNumLadaFax() {
        return this.gesNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumTelefFax(String gesNumTelefFax) {
        this.gesNumTelefFax = gesNumTelefFax;
    }

    public String getGesNumTelefFax() {
        return this.gesNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumExtFax(String gesNumExtFax) {
        this.gesNumExtFax = gesNumExtFax;
    }

    public String getGesNumExtFax() {
        return this.gesNumExtFax;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGesAnoAltaReg(BigDecimal gesAnoAltaReg) {
        this.gesAnoAltaReg = gesAnoAltaReg;
    }

    public BigDecimal getGesAnoAltaReg() {
        return this.gesAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGesMesAltaReg(BigDecimal gesMesAltaReg) {
        this.gesMesAltaReg = gesMesAltaReg;
    }

    public BigDecimal getGesMesAltaReg() {
        return this.gesMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGesDiaAltaReg(BigDecimal gesDiaAltaReg) {
        this.gesDiaAltaReg = gesDiaAltaReg;
    }

    public BigDecimal getGesDiaAltaReg() {
        return this.gesDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGesAnoUltMod(BigDecimal gesAnoUltMod) {
        this.gesAnoUltMod = gesAnoUltMod;
    }

    public BigDecimal getGesAnoUltMod() {
        return this.gesAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGesMesUltMod(BigDecimal gesMesUltMod) {
        this.gesMesUltMod = gesMesUltMod;
    }

    public BigDecimal getGesMesUltMod() {
        return this.gesMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGesDiaUltMod(BigDecimal gesDiaUltMod) {
        this.gesDiaUltMod = gesDiaUltMod;
    }

    public BigDecimal getGesDiaUltMod() {
        return this.gesDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesCveStGestor(String gesCveStGestor) {
        this.gesCveStGestor = gesCveStGestor;
    }

    public String getGesCveStGestor() {
        return this.gesCveStGestor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumLada2Ofi(String gesNumLada2Ofi) {
        this.gesNumLada2Ofi = gesNumLada2Ofi;
    }

    public String getGesNumLada2Ofi() {
        return this.gesNumLada2Ofi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumTel2Ofi(String gesNumTel2Ofi) {
        this.gesNumTel2Ofi = gesNumTel2Ofi;
    }

    public String getGesNumTel2Ofi() {
        return this.gesNumTel2Ofi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumExt2Ofi(String gesNumExt2Ofi) {
        this.gesNumExt2Ofi = gesNumExt2Ofi;
    }

    public String getGesNumExt2Ofi() {
        return this.gesNumExt2Ofi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesEMail(String gesEMail) {
        this.gesEMail = gesEMail;
    }

    public String getGesEMail() {
        return this.gesEMail;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGesNumRegistro(String gesNumRegistro) {
        this.gesNumRegistro = gesNumRegistro;
    }

    public String getGesNumRegistro() {
        return this.gesNumRegistro;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GESTORES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGesNumGestor() != null && this.getGesNumGestor().longValue() == -999) {
            conditions += " AND GES_NUM_GESTOR IS NULL";
        } else if (this.getGesNumGestor() != null) {
            conditions += " AND GES_NUM_GESTOR = ?";
            values.add(this.getGesNumGestor());
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
        String sql = "SELECT * FROM GESTORES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGesNumGestor() != null && this.getGesNumGestor().longValue() == -999) {
            conditions += " AND GES_NUM_GESTOR IS NULL";
        } else if (this.getGesNumGestor() != null) {
            conditions += " AND GES_NUM_GESTOR = ?";
            values.add(this.getGesNumGestor());
        }

        if (this.getGesNomGestor() != null && "null".equals(this.getGesNomGestor())) {
            conditions += " AND GES_NOM_GESTOR IS NULL";
        } else if (this.getGesNomGestor() != null) {
            conditions += " AND GES_NOM_GESTOR = ?";
            values.add(this.getGesNomGestor());
        }

        if (this.getGesRfc() != null && "null".equals(this.getGesRfc())) {
            conditions += " AND GES_RFC IS NULL";
        } else if (this.getGesRfc() != null) {
            conditions += " AND GES_RFC = ?";
            values.add(this.getGesRfc());
        }

        if (this.getGesCveTramita() != null && "null".equals(this.getGesCveTramita())) {
            conditions += " AND GES_CVE_TRAMITA IS NULL";
        } else if (this.getGesCveTramita() != null) {
            conditions += " AND GES_CVE_TRAMITA = ?";
            values.add(this.getGesCveTramita());
        }

        if (this.getGesCalleNum() != null && "null".equals(this.getGesCalleNum())) {
            conditions += " AND GES_CALLE_NUM IS NULL";
        } else if (this.getGesCalleNum() != null) {
            conditions += " AND GES_CALLE_NUM = ?";
            values.add(this.getGesCalleNum());
        }

        if (this.getGesNomColonia() != null && "null".equals(this.getGesNomColonia())) {
            conditions += " AND GES_NOM_COLONIA IS NULL";
        } else if (this.getGesNomColonia() != null) {
            conditions += " AND GES_NOM_COLONIA = ?";
            values.add(this.getGesNomColonia());
        }

        if (this.getGesNomPoblacion() != null && "null".equals(this.getGesNomPoblacion())) {
            conditions += " AND GES_NOM_POBLACION IS NULL";
        } else if (this.getGesNomPoblacion() != null) {
            conditions += " AND GES_NOM_POBLACION = ?";
            values.add(this.getGesNomPoblacion());
        }

        if (this.getGesCodigoPostal() != null && this.getGesCodigoPostal().longValue() == -999) {
            conditions += " AND GES_CODIGO_POSTAL IS NULL";
        } else if (this.getGesCodigoPostal() != null) {
            conditions += " AND GES_CODIGO_POSTAL = ?";
            values.add(this.getGesCodigoPostal());
        }

        if (this.getGesNumEstado() != null && this.getGesNumEstado().longValue() == -999) {
            conditions += " AND GES_NUM_ESTADO IS NULL";
        } else if (this.getGesNumEstado() != null) {
            conditions += " AND GES_NUM_ESTADO = ?";
            values.add(this.getGesNumEstado());
        }

        if (this.getGesNomEstado() != null && "null".equals(this.getGesNomEstado())) {
            conditions += " AND GES_NOM_ESTADO IS NULL";
        } else if (this.getGesNomEstado() != null) {
            conditions += " AND GES_NOM_ESTADO = ?";
            values.add(this.getGesNomEstado());
        }

        if (this.getGesNumPais() != null && this.getGesNumPais().longValue() == -999) {
            conditions += " AND GES_NUM_PAIS IS NULL";
        } else if (this.getGesNumPais() != null) {
            conditions += " AND GES_NUM_PAIS = ?";
            values.add(this.getGesNumPais());
        }

        if (this.getGesNomPais() != null && "null".equals(this.getGesNomPais())) {
            conditions += " AND GES_NOM_PAIS IS NULL";
        } else if (this.getGesNomPais() != null) {
            conditions += " AND GES_NOM_PAIS = ?";
            values.add(this.getGesNomPais());
        }

        if (this.getGesNumLadaCasa() != null && "null".equals(this.getGesNumLadaCasa())) {
            conditions += " AND GES_NUM_LADA_CASA IS NULL";
        } else if (this.getGesNumLadaCasa() != null) {
            conditions += " AND GES_NUM_LADA_CASA = ?";
            values.add(this.getGesNumLadaCasa());
        }

        if (this.getGesNumTelefCasa() != null && "null".equals(this.getGesNumTelefCasa())) {
            conditions += " AND GES_NUM_TELEF_CASA IS NULL";
        } else if (this.getGesNumTelefCasa() != null) {
            conditions += " AND GES_NUM_TELEF_CASA = ?";
            values.add(this.getGesNumTelefCasa());
        }

        if (this.getGesNumLadaOfic() != null && "null".equals(this.getGesNumLadaOfic())) {
            conditions += " AND GES_NUM_LADA_OFIC IS NULL";
        } else if (this.getGesNumLadaOfic() != null) {
            conditions += " AND GES_NUM_LADA_OFIC = ?";
            values.add(this.getGesNumLadaOfic());
        }

        if (this.getGesNumTelefOfic() != null && "null".equals(this.getGesNumTelefOfic())) {
            conditions += " AND GES_NUM_TELEF_OFIC IS NULL";
        } else if (this.getGesNumTelefOfic() != null) {
            conditions += " AND GES_NUM_TELEF_OFIC = ?";
            values.add(this.getGesNumTelefOfic());
        }

        if (this.getGesNumExtOfic() != null && "null".equals(this.getGesNumExtOfic())) {
            conditions += " AND GES_NUM_EXT_OFIC IS NULL";
        } else if (this.getGesNumExtOfic() != null) {
            conditions += " AND GES_NUM_EXT_OFIC = ?";
            values.add(this.getGesNumExtOfic());
        }

        if (this.getGesNumLadaFax() != null && "null".equals(this.getGesNumLadaFax())) {
            conditions += " AND GES_NUM_LADA_FAX IS NULL";
        } else if (this.getGesNumLadaFax() != null) {
            conditions += " AND GES_NUM_LADA_FAX = ?";
            values.add(this.getGesNumLadaFax());
        }

        if (this.getGesNumTelefFax() != null && "null".equals(this.getGesNumTelefFax())) {
            conditions += " AND GES_NUM_TELEF_FAX IS NULL";
        } else if (this.getGesNumTelefFax() != null) {
            conditions += " AND GES_NUM_TELEF_FAX = ?";
            values.add(this.getGesNumTelefFax());
        }

        if (this.getGesNumExtFax() != null && "null".equals(this.getGesNumExtFax())) {
            conditions += " AND GES_NUM_EXT_FAX IS NULL";
        } else if (this.getGesNumExtFax() != null) {
            conditions += " AND GES_NUM_EXT_FAX = ?";
            values.add(this.getGesNumExtFax());
        }

        if (this.getGesAnoAltaReg() != null && this.getGesAnoAltaReg().longValue() == -999) {
            conditions += " AND GES_ANO_ALTA_REG IS NULL";
        } else if (this.getGesAnoAltaReg() != null) {
            conditions += " AND GES_ANO_ALTA_REG = ?";
            values.add(this.getGesAnoAltaReg());
        }

        if (this.getGesMesAltaReg() != null && this.getGesMesAltaReg().longValue() == -999) {
            conditions += " AND GES_MES_ALTA_REG IS NULL";
        } else if (this.getGesMesAltaReg() != null) {
            conditions += " AND GES_MES_ALTA_REG = ?";
            values.add(this.getGesMesAltaReg());
        }

        if (this.getGesDiaAltaReg() != null && this.getGesDiaAltaReg().longValue() == -999) {
            conditions += " AND GES_DIA_ALTA_REG IS NULL";
        } else if (this.getGesDiaAltaReg() != null) {
            conditions += " AND GES_DIA_ALTA_REG = ?";
            values.add(this.getGesDiaAltaReg());
        }

        if (this.getGesAnoUltMod() != null && this.getGesAnoUltMod().longValue() == -999) {
            conditions += " AND GES_ANO_ULT_MOD IS NULL";
        } else if (this.getGesAnoUltMod() != null) {
            conditions += " AND GES_ANO_ULT_MOD = ?";
            values.add(this.getGesAnoUltMod());
        }

        if (this.getGesMesUltMod() != null && this.getGesMesUltMod().longValue() == -999) {
            conditions += " AND GES_MES_ULT_MOD IS NULL";
        } else if (this.getGesMesUltMod() != null) {
            conditions += " AND GES_MES_ULT_MOD = ?";
            values.add(this.getGesMesUltMod());
        }

        if (this.getGesDiaUltMod() != null && this.getGesDiaUltMod().longValue() == -999) {
            conditions += " AND GES_DIA_ULT_MOD IS NULL";
        } else if (this.getGesDiaUltMod() != null) {
            conditions += " AND GES_DIA_ULT_MOD = ?";
            values.add(this.getGesDiaUltMod());
        }

        if (this.getGesCveStGestor() != null && "null".equals(this.getGesCveStGestor())) {
            conditions += " AND GES_CVE_ST_GESTOR IS NULL";
        } else if (this.getGesCveStGestor() != null) {
            conditions += " AND GES_CVE_ST_GESTOR = ?";
            values.add(this.getGesCveStGestor());
        }

        if (this.getGesNumLada2Ofi() != null && "null".equals(this.getGesNumLada2Ofi())) {
            conditions += " AND GES_NUM_LADA2_OFI IS NULL";
        } else if (this.getGesNumLada2Ofi() != null) {
            conditions += " AND GES_NUM_LADA2_OFI = ?";
            values.add(this.getGesNumLada2Ofi());
        }

        if (this.getGesNumTel2Ofi() != null && "null".equals(this.getGesNumTel2Ofi())) {
            conditions += " AND GES_NUM_TEL2_OFI IS NULL";
        } else if (this.getGesNumTel2Ofi() != null) {
            conditions += " AND GES_NUM_TEL2_OFI = ?";
            values.add(this.getGesNumTel2Ofi());
        }

        if (this.getGesNumExt2Ofi() != null && "null".equals(this.getGesNumExt2Ofi())) {
            conditions += " AND GES_NUM_EXT2_OFI IS NULL";
        } else if (this.getGesNumExt2Ofi() != null) {
            conditions += " AND GES_NUM_EXT2_OFI = ?";
            values.add(this.getGesNumExt2Ofi());
        }

        if (this.getGesEMail() != null && "null".equals(this.getGesEMail())) {
            conditions += " AND GES_E_MAIL IS NULL";
        } else if (this.getGesEMail() != null) {
            conditions += " AND GES_E_MAIL = ?";
            values.add(this.getGesEMail());
        }

        if (this.getGesNumRegistro() != null && "null".equals(this.getGesNumRegistro())) {
            conditions += " AND GES_NUM_REGISTRO IS NULL";
        } else if (this.getGesNumRegistro() != null) {
            conditions += " AND GES_NUM_REGISTRO = ?";
            values.add(this.getGesNumRegistro());
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
        String sql = "UPDATE GESTORES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GES_NUM_GESTOR = ?";
        pkValues.add(this.getGesNumGestor());
        fields += " GES_NOM_GESTOR = ?, ";
        values.add(this.getGesNomGestor());
        fields += " GES_RFC = ?, ";
        values.add(this.getGesRfc());
        fields += " GES_CVE_TRAMITA = ?, ";
        values.add(this.getGesCveTramita());
        fields += " GES_CALLE_NUM = ?, ";
        values.add(this.getGesCalleNum());
        fields += " GES_NOM_COLONIA = ?, ";
        values.add(this.getGesNomColonia());
        fields += " GES_NOM_POBLACION = ?, ";
        values.add(this.getGesNomPoblacion());
        fields += " GES_CODIGO_POSTAL = ?, ";
        values.add(this.getGesCodigoPostal());
        fields += " GES_NUM_ESTADO = ?, ";
        values.add(this.getGesNumEstado());
        fields += " GES_NOM_ESTADO = ?, ";
        values.add(this.getGesNomEstado());
        fields += " GES_NUM_PAIS = ?, ";
        values.add(this.getGesNumPais());
        fields += " GES_NOM_PAIS = ?, ";
        values.add(this.getGesNomPais());
        fields += " GES_NUM_LADA_CASA = ?, ";
        values.add(this.getGesNumLadaCasa());
        fields += " GES_NUM_TELEF_CASA = ?, ";
        values.add(this.getGesNumTelefCasa());
        fields += " GES_NUM_LADA_OFIC = ?, ";
        values.add(this.getGesNumLadaOfic());
        fields += " GES_NUM_TELEF_OFIC = ?, ";
        values.add(this.getGesNumTelefOfic());
        fields += " GES_NUM_EXT_OFIC = ?, ";
        values.add(this.getGesNumExtOfic());
        fields += " GES_NUM_LADA_FAX = ?, ";
        values.add(this.getGesNumLadaFax());
        fields += " GES_NUM_TELEF_FAX = ?, ";
        values.add(this.getGesNumTelefFax());
        fields += " GES_NUM_EXT_FAX = ?, ";
        values.add(this.getGesNumExtFax());
        fields += " GES_ANO_ALTA_REG = ?, ";
        values.add(this.getGesAnoAltaReg());
        fields += " GES_MES_ALTA_REG = ?, ";
        values.add(this.getGesMesAltaReg());
        fields += " GES_DIA_ALTA_REG = ?, ";
        values.add(this.getGesDiaAltaReg());
        fields += " GES_ANO_ULT_MOD = ?, ";
        values.add(this.getGesAnoUltMod());
        fields += " GES_MES_ULT_MOD = ?, ";
        values.add(this.getGesMesUltMod());
        fields += " GES_DIA_ULT_MOD = ?, ";
        values.add(this.getGesDiaUltMod());
        fields += " GES_CVE_ST_GESTOR = ?, ";
        values.add(this.getGesCveStGestor());
        fields += " GES_NUM_LADA2_OFI = ?, ";
        values.add(this.getGesNumLada2Ofi());
        fields += " GES_NUM_TEL2_OFI = ?, ";
        values.add(this.getGesNumTel2Ofi());
        fields += " GES_NUM_EXT2_OFI = ?, ";
        values.add(this.getGesNumExt2Ofi());
        fields += " GES_E_MAIL = ?, ";
        values.add(this.getGesEMail());
        fields += " GES_NUM_REGISTRO = ?, ";
        values.add(this.getGesNumRegistro());
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
        String sql = "INSERT INTO GESTORES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GES_NUM_GESTOR";
        fieldValues += ", ?";
        values.add(this.getGesNumGestor());

        fields += ", GES_NOM_GESTOR";
        fieldValues += ", ?";
        values.add(this.getGesNomGestor());

        fields += ", GES_RFC";
        fieldValues += ", ?";
        values.add(this.getGesRfc());

        fields += ", GES_CVE_TRAMITA";
        fieldValues += ", ?";
        values.add(this.getGesCveTramita());

        fields += ", GES_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getGesCalleNum());

        fields += ", GES_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getGesNomColonia());

        fields += ", GES_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getGesNomPoblacion());

        fields += ", GES_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getGesCodigoPostal());

        fields += ", GES_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getGesNumEstado());

        fields += ", GES_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getGesNomEstado());

        fields += ", GES_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getGesNumPais());

        fields += ", GES_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getGesNomPais());

        fields += ", GES_NUM_LADA_CASA";
        fieldValues += ", ?";
        values.add(this.getGesNumLadaCasa());

        fields += ", GES_NUM_TELEF_CASA";
        fieldValues += ", ?";
        values.add(this.getGesNumTelefCasa());

        fields += ", GES_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getGesNumLadaOfic());

        fields += ", GES_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getGesNumTelefOfic());

        fields += ", GES_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getGesNumExtOfic());

        fields += ", GES_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getGesNumLadaFax());

        fields += ", GES_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getGesNumTelefFax());

        fields += ", GES_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getGesNumExtFax());

        fields += ", GES_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGesAnoAltaReg());

        fields += ", GES_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGesMesAltaReg());

        fields += ", GES_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGesDiaAltaReg());

        fields += ", GES_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGesAnoUltMod());

        fields += ", GES_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGesMesUltMod());

        fields += ", GES_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGesDiaUltMod());

        fields += ", GES_CVE_ST_GESTOR";
        fieldValues += ", ?";
        values.add(this.getGesCveStGestor());

        fields += ", GES_NUM_LADA2_OFI";
        fieldValues += ", ?";
        values.add(this.getGesNumLada2Ofi());

        fields += ", GES_NUM_TEL2_OFI";
        fieldValues += ", ?";
        values.add(this.getGesNumTel2Ofi());

        fields += ", GES_NUM_EXT2_OFI";
        fieldValues += ", ?";
        values.add(this.getGesNumExt2Ofi());

        fields += ", GES_E_MAIL";
        fieldValues += ", ?";
        values.add(this.getGesEMail());

        fields += ", GES_NUM_REGISTRO";
        fieldValues += ", ?";
        values.add(this.getGesNumRegistro());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GESTORES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GES_NUM_GESTOR = ?";
        values.add(this.getGesNumGestor());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Gestores instance = (Gestores) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGesNumGestor().equals(instance.getGesNumGestor()))
            equalObjects = false;
        if (equalObjects && !this.getGesNomGestor().equals(instance.getGesNomGestor()))
            equalObjects = false;
        if (equalObjects && !this.getGesRfc().equals(instance.getGesRfc()))
            equalObjects = false;
        if (equalObjects && !this.getGesCveTramita().equals(instance.getGesCveTramita()))
            equalObjects = false;
        if (equalObjects && !this.getGesCalleNum().equals(instance.getGesCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getGesNomColonia().equals(instance.getGesNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getGesNomPoblacion().equals(instance.getGesNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getGesCodigoPostal().equals(instance.getGesCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumEstado().equals(instance.getGesNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getGesNomEstado().equals(instance.getGesNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumPais().equals(instance.getGesNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getGesNomPais().equals(instance.getGesNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumLadaCasa().equals(instance.getGesNumLadaCasa()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumTelefCasa().equals(instance.getGesNumTelefCasa()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumLadaOfic().equals(instance.getGesNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumTelefOfic().equals(instance.getGesNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumExtOfic().equals(instance.getGesNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumLadaFax().equals(instance.getGesNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumTelefFax().equals(instance.getGesNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumExtFax().equals(instance.getGesNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getGesAnoAltaReg().equals(instance.getGesAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGesMesAltaReg().equals(instance.getGesMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGesDiaAltaReg().equals(instance.getGesDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGesAnoUltMod().equals(instance.getGesAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGesMesUltMod().equals(instance.getGesMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGesDiaUltMod().equals(instance.getGesDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGesCveStGestor().equals(instance.getGesCveStGestor()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumLada2Ofi().equals(instance.getGesNumLada2Ofi()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumTel2Ofi().equals(instance.getGesNumTel2Ofi()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumExt2Ofi().equals(instance.getGesNumExt2Ofi()))
            equalObjects = false;
        if (equalObjects && !this.getGesEMail().equals(instance.getGesEMail()))
            equalObjects = false;
        if (equalObjects && !this.getGesNumRegistro().equals(instance.getGesNumRegistro()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Gestores result = new Gestores();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGesNumGestor((BigDecimal) objectData.getData("GES_NUM_GESTOR"));
        result.setGesNomGestor((String) objectData.getData("GES_NOM_GESTOR"));
        result.setGesRfc((String) objectData.getData("GES_RFC"));
        result.setGesCveTramita((String) objectData.getData("GES_CVE_TRAMITA"));
        result.setGesCalleNum((String) objectData.getData("GES_CALLE_NUM"));
        result.setGesNomColonia((String) objectData.getData("GES_NOM_COLONIA"));
        result.setGesNomPoblacion((String) objectData.getData("GES_NOM_POBLACION"));
        result.setGesCodigoPostal((BigDecimal) objectData.getData("GES_CODIGO_POSTAL"));
        result.setGesNumEstado((BigDecimal) objectData.getData("GES_NUM_ESTADO"));
        result.setGesNomEstado((String) objectData.getData("GES_NOM_ESTADO"));
        result.setGesNumPais((BigDecimal) objectData.getData("GES_NUM_PAIS"));
        result.setGesNomPais((String) objectData.getData("GES_NOM_PAIS"));
        result.setGesNumLadaCasa((String) objectData.getData("GES_NUM_LADA_CASA"));
        result.setGesNumTelefCasa((String) objectData.getData("GES_NUM_TELEF_CASA"));
        result.setGesNumLadaOfic((String) objectData.getData("GES_NUM_LADA_OFIC"));
        result.setGesNumTelefOfic((String) objectData.getData("GES_NUM_TELEF_OFIC"));
        result.setGesNumExtOfic((String) objectData.getData("GES_NUM_EXT_OFIC"));
        result.setGesNumLadaFax((String) objectData.getData("GES_NUM_LADA_FAX"));
        result.setGesNumTelefFax((String) objectData.getData("GES_NUM_TELEF_FAX"));
        result.setGesNumExtFax((String) objectData.getData("GES_NUM_EXT_FAX"));
        result.setGesAnoAltaReg((BigDecimal) objectData.getData("GES_ANO_ALTA_REG"));
        result.setGesMesAltaReg((BigDecimal) objectData.getData("GES_MES_ALTA_REG"));
        result.setGesDiaAltaReg((BigDecimal) objectData.getData("GES_DIA_ALTA_REG"));
        result.setGesAnoUltMod((BigDecimal) objectData.getData("GES_ANO_ULT_MOD"));
        result.setGesMesUltMod((BigDecimal) objectData.getData("GES_MES_ULT_MOD"));
        result.setGesDiaUltMod((BigDecimal) objectData.getData("GES_DIA_ULT_MOD"));
        result.setGesCveStGestor((String) objectData.getData("GES_CVE_ST_GESTOR"));
        result.setGesNumLada2Ofi((String) objectData.getData("GES_NUM_LADA2_OFI"));
        result.setGesNumTel2Ofi((String) objectData.getData("GES_NUM_TEL2_OFI"));
        result.setGesNumExt2Ofi((String) objectData.getData("GES_NUM_EXT2_OFI"));
        result.setGesEMail((String) objectData.getData("GES_E_MAIL"));
        result.setGesNumRegistro((String) objectData.getData("GES_NUM_REGISTRO"));

        return result;

    }

}
