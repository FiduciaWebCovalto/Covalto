package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "VALUADOR_PK", columns = { "VAL_NUM_VALUADOR" }, sequences = { "MAX" })
public class Valuador extends DomainObject {

    BigDecimal valNumValuador = null;
    String valNomValuador = null;
    String valRfc = null;
    String valCveAvaluos = null;
    String valRegValuador = null;
    String valCalleNum = null;
    String valNomColonia = null;
    String valNomPoblacion = null;
    BigDecimal valCodigoPostal = null;
    BigDecimal valNumEstado = null;
    String valNomEstado = null;
    BigDecimal valNumPais = null;
    String valNomPais = null;
    String valNumLadaOfic = null;
    String valNumTelefOfic = null;
    String valNumExtOfic = null;
    String valNumLadaFax = null;
    String valNumTelefFax = null;
    String valNumExtFax = null;
    BigDecimal valAnoAltaReg = null;
    BigDecimal valMesAltaReg = null;
    BigDecimal valDiaAltaReg = null;
    BigDecimal valAnoUltMod = null;
    BigDecimal valMesUltMod = null;
    BigDecimal valDiaUltMod = null;
    String valCveStValuado = null;
    String valNumLada2Ofi = null;
    String valNumTel2Ofi = null;
    String valNumExt2Ofi = null;
    String valEMail = null;
    String valNumRegistro = null;

    public Valuador() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setValNumValuador(BigDecimal valNumValuador) {
        this.valNumValuador = valNumValuador;
    }

    public BigDecimal getValNumValuador() {
        return this.valNumValuador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNomValuador(String valNomValuador) {
        this.valNomValuador = valNomValuador;
    }

    public String getValNomValuador() {
        return this.valNomValuador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValRfc(String valRfc) {
        this.valRfc = valRfc;
    }

    public String getValRfc() {
        return this.valRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValCveAvaluos(String valCveAvaluos) {
        this.valCveAvaluos = valCveAvaluos;
    }

    public String getValCveAvaluos() {
        return this.valCveAvaluos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValRegValuador(String valRegValuador) {
        this.valRegValuador = valRegValuador;
    }

    public String getValRegValuador() {
        return this.valRegValuador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValCalleNum(String valCalleNum) {
        this.valCalleNum = valCalleNum;
    }

    public String getValCalleNum() {
        return this.valCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNomColonia(String valNomColonia) {
        this.valNomColonia = valNomColonia;
    }

    public String getValNomColonia() {
        return this.valNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNomPoblacion(String valNomPoblacion) {
        this.valNomPoblacion = valNomPoblacion;
    }

    public String getValNomPoblacion() {
        return this.valNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setValCodigoPostal(BigDecimal valCodigoPostal) {
        this.valCodigoPostal = valCodigoPostal;
    }

    public BigDecimal getValCodigoPostal() {
        return this.valCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setValNumEstado(BigDecimal valNumEstado) {
        this.valNumEstado = valNumEstado;
    }

    public BigDecimal getValNumEstado() {
        return this.valNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNomEstado(String valNomEstado) {
        this.valNomEstado = valNomEstado;
    }

    public String getValNomEstado() {
        return this.valNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setValNumPais(BigDecimal valNumPais) {
        this.valNumPais = valNumPais;
    }

    public BigDecimal getValNumPais() {
        return this.valNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNomPais(String valNomPais) {
        this.valNomPais = valNomPais;
    }

    public String getValNomPais() {
        return this.valNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumLadaOfic(String valNumLadaOfic) {
        this.valNumLadaOfic = valNumLadaOfic;
    }

    public String getValNumLadaOfic() {
        return this.valNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumTelefOfic(String valNumTelefOfic) {
        this.valNumTelefOfic = valNumTelefOfic;
    }

    public String getValNumTelefOfic() {
        return this.valNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumExtOfic(String valNumExtOfic) {
        this.valNumExtOfic = valNumExtOfic;
    }

    public String getValNumExtOfic() {
        return this.valNumExtOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumLadaFax(String valNumLadaFax) {
        this.valNumLadaFax = valNumLadaFax;
    }

    public String getValNumLadaFax() {
        return this.valNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumTelefFax(String valNumTelefFax) {
        this.valNumTelefFax = valNumTelefFax;
    }

    public String getValNumTelefFax() {
        return this.valNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumExtFax(String valNumExtFax) {
        this.valNumExtFax = valNumExtFax;
    }

    public String getValNumExtFax() {
        return this.valNumExtFax;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setValAnoAltaReg(BigDecimal valAnoAltaReg) {
        this.valAnoAltaReg = valAnoAltaReg;
    }

    public BigDecimal getValAnoAltaReg() {
        return this.valAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setValMesAltaReg(BigDecimal valMesAltaReg) {
        this.valMesAltaReg = valMesAltaReg;
    }

    public BigDecimal getValMesAltaReg() {
        return this.valMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setValDiaAltaReg(BigDecimal valDiaAltaReg) {
        this.valDiaAltaReg = valDiaAltaReg;
    }

    public BigDecimal getValDiaAltaReg() {
        return this.valDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setValAnoUltMod(BigDecimal valAnoUltMod) {
        this.valAnoUltMod = valAnoUltMod;
    }

    public BigDecimal getValAnoUltMod() {
        return this.valAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setValMesUltMod(BigDecimal valMesUltMod) {
        this.valMesUltMod = valMesUltMod;
    }

    public BigDecimal getValMesUltMod() {
        return this.valMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setValDiaUltMod(BigDecimal valDiaUltMod) {
        this.valDiaUltMod = valDiaUltMod;
    }

    public BigDecimal getValDiaUltMod() {
        return this.valDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValCveStValuado(String valCveStValuado) {
        this.valCveStValuado = valCveStValuado;
    }

    public String getValCveStValuado() {
        return this.valCveStValuado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumLada2Ofi(String valNumLada2Ofi) {
        this.valNumLada2Ofi = valNumLada2Ofi;
    }

    public String getValNumLada2Ofi() {
        return this.valNumLada2Ofi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumTel2Ofi(String valNumTel2Ofi) {
        this.valNumTel2Ofi = valNumTel2Ofi;
    }

    public String getValNumTel2Ofi() {
        return this.valNumTel2Ofi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumExt2Ofi(String valNumExt2Ofi) {
        this.valNumExt2Ofi = valNumExt2Ofi;
    }

    public String getValNumExt2Ofi() {
        return this.valNumExt2Ofi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValEMail(String valEMail) {
        this.valEMail = valEMail;
    }

    public String getValEMail() {
        return this.valEMail;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setValNumRegistro(String valNumRegistro) {
        this.valNumRegistro = valNumRegistro;
    }

    public String getValNumRegistro() {
        return this.valNumRegistro;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM VALUADOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getValNumValuador() != null && this.getValNumValuador().longValue() == -999) {
            conditions += " AND VAL_NUM_VALUADOR IS NULL";
        } else if (this.getValNumValuador() != null) {
            conditions += " AND VAL_NUM_VALUADOR = ?";
            values.add(this.getValNumValuador());
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
        String sql = "SELECT * FROM VALUADOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getValNumValuador() != null && this.getValNumValuador().longValue() == -999) {
            conditions += " AND VAL_NUM_VALUADOR IS NULL";
        } else if (this.getValNumValuador() != null) {
            conditions += " AND VAL_NUM_VALUADOR = ?";
            values.add(this.getValNumValuador());
        }

        if (this.getValNomValuador() != null && "null".equals(this.getValNomValuador())) {
            conditions += " AND VAL_NOM_VALUADOR IS NULL";
        } else if (this.getValNomValuador() != null) {
            conditions += " AND VAL_NOM_VALUADOR = ?";
            values.add(this.getValNomValuador());
        }

        if (this.getValRfc() != null && "null".equals(this.getValRfc())) {
            conditions += " AND VAL_RFC IS NULL";
        } else if (this.getValRfc() != null) {
            conditions += " AND VAL_RFC = ?";
            values.add(this.getValRfc());
        }

        if (this.getValCveAvaluos() != null && "null".equals(this.getValCveAvaluos())) {
            conditions += " AND VAL_CVE_AVALUOS IS NULL";
        } else if (this.getValCveAvaluos() != null) {
            conditions += " AND VAL_CVE_AVALUOS = ?";
            values.add(this.getValCveAvaluos());
        }

        if (this.getValRegValuador() != null && "null".equals(this.getValRegValuador())) {
            conditions += " AND VAL_REG_VALUADOR IS NULL";
        } else if (this.getValRegValuador() != null) {
            conditions += " AND VAL_REG_VALUADOR = ?";
            values.add(this.getValRegValuador());
        }

        if (this.getValCalleNum() != null && "null".equals(this.getValCalleNum())) {
            conditions += " AND VAL_CALLE_NUM IS NULL";
        } else if (this.getValCalleNum() != null) {
            conditions += " AND VAL_CALLE_NUM = ?";
            values.add(this.getValCalleNum());
        }

        if (this.getValNomColonia() != null && "null".equals(this.getValNomColonia())) {
            conditions += " AND VAL_NOM_COLONIA IS NULL";
        } else if (this.getValNomColonia() != null) {
            conditions += " AND VAL_NOM_COLONIA = ?";
            values.add(this.getValNomColonia());
        }

        if (this.getValNomPoblacion() != null && "null".equals(this.getValNomPoblacion())) {
            conditions += " AND VAL_NOM_POBLACION IS NULL";
        } else if (this.getValNomPoblacion() != null) {
            conditions += " AND VAL_NOM_POBLACION = ?";
            values.add(this.getValNomPoblacion());
        }

        if (this.getValCodigoPostal() != null && this.getValCodigoPostal().longValue() == -999) {
            conditions += " AND VAL_CODIGO_POSTAL IS NULL";
        } else if (this.getValCodigoPostal() != null) {
            conditions += " AND VAL_CODIGO_POSTAL = ?";
            values.add(this.getValCodigoPostal());
        }

        if (this.getValNumEstado() != null && this.getValNumEstado().longValue() == -999) {
            conditions += " AND VAL_NUM_ESTADO IS NULL";
        } else if (this.getValNumEstado() != null) {
            conditions += " AND VAL_NUM_ESTADO = ?";
            values.add(this.getValNumEstado());
        }

        if (this.getValNomEstado() != null && "null".equals(this.getValNomEstado())) {
            conditions += " AND VAL_NOM_ESTADO IS NULL";
        } else if (this.getValNomEstado() != null) {
            conditions += " AND VAL_NOM_ESTADO = ?";
            values.add(this.getValNomEstado());
        }

        if (this.getValNumPais() != null && this.getValNumPais().longValue() == -999) {
            conditions += " AND VAL_NUM_PAIS IS NULL";
        } else if (this.getValNumPais() != null) {
            conditions += " AND VAL_NUM_PAIS = ?";
            values.add(this.getValNumPais());
        }

        if (this.getValNomPais() != null && "null".equals(this.getValNomPais())) {
            conditions += " AND VAL_NOM_PAIS IS NULL";
        } else if (this.getValNomPais() != null) {
            conditions += " AND VAL_NOM_PAIS = ?";
            values.add(this.getValNomPais());
        }

        if (this.getValNumLadaOfic() != null && "null".equals(this.getValNumLadaOfic())) {
            conditions += " AND VAL_NUM_LADA_OFIC IS NULL";
        } else if (this.getValNumLadaOfic() != null) {
            conditions += " AND VAL_NUM_LADA_OFIC = ?";
            values.add(this.getValNumLadaOfic());
        }

        if (this.getValNumTelefOfic() != null && "null".equals(this.getValNumTelefOfic())) {
            conditions += " AND VAL_NUM_TELEF_OFIC IS NULL";
        } else if (this.getValNumTelefOfic() != null) {
            conditions += " AND VAL_NUM_TELEF_OFIC = ?";
            values.add(this.getValNumTelefOfic());
        }

        if (this.getValNumExtOfic() != null && "null".equals(this.getValNumExtOfic())) {
            conditions += " AND VAL_NUM_EXT_OFIC IS NULL";
        } else if (this.getValNumExtOfic() != null) {
            conditions += " AND VAL_NUM_EXT_OFIC = ?";
            values.add(this.getValNumExtOfic());
        }

        if (this.getValNumLadaFax() != null && "null".equals(this.getValNumLadaFax())) {
            conditions += " AND VAL_NUM_LADA_FAX IS NULL";
        } else if (this.getValNumLadaFax() != null) {
            conditions += " AND VAL_NUM_LADA_FAX = ?";
            values.add(this.getValNumLadaFax());
        }

        if (this.getValNumTelefFax() != null && "null".equals(this.getValNumTelefFax())) {
            conditions += " AND VAL_NUM_TELEF_FAX IS NULL";
        } else if (this.getValNumTelefFax() != null) {
            conditions += " AND VAL_NUM_TELEF_FAX = ?";
            values.add(this.getValNumTelefFax());
        }

        if (this.getValNumExtFax() != null && "null".equals(this.getValNumExtFax())) {
            conditions += " AND VAL_NUM_EXT_FAX IS NULL";
        } else if (this.getValNumExtFax() != null) {
            conditions += " AND VAL_NUM_EXT_FAX = ?";
            values.add(this.getValNumExtFax());
        }

        if (this.getValAnoAltaReg() != null && this.getValAnoAltaReg().longValue() == -999) {
            conditions += " AND VAL_ANO_ALTA_REG IS NULL";
        } else if (this.getValAnoAltaReg() != null) {
            conditions += " AND VAL_ANO_ALTA_REG = ?";
            values.add(this.getValAnoAltaReg());
        }

        if (this.getValMesAltaReg() != null && this.getValMesAltaReg().longValue() == -999) {
            conditions += " AND VAL_MES_ALTA_REG IS NULL";
        } else if (this.getValMesAltaReg() != null) {
            conditions += " AND VAL_MES_ALTA_REG = ?";
            values.add(this.getValMesAltaReg());
        }

        if (this.getValDiaAltaReg() != null && this.getValDiaAltaReg().longValue() == -999) {
            conditions += " AND VAL_DIA_ALTA_REG IS NULL";
        } else if (this.getValDiaAltaReg() != null) {
            conditions += " AND VAL_DIA_ALTA_REG = ?";
            values.add(this.getValDiaAltaReg());
        }

        if (this.getValAnoUltMod() != null && this.getValAnoUltMod().longValue() == -999) {
            conditions += " AND VAL_ANO_ULT_MOD IS NULL";
        } else if (this.getValAnoUltMod() != null) {
            conditions += " AND VAL_ANO_ULT_MOD = ?";
            values.add(this.getValAnoUltMod());
        }

        if (this.getValMesUltMod() != null && this.getValMesUltMod().longValue() == -999) {
            conditions += " AND VAL_MES_ULT_MOD IS NULL";
        } else if (this.getValMesUltMod() != null) {
            conditions += " AND VAL_MES_ULT_MOD = ?";
            values.add(this.getValMesUltMod());
        }

        if (this.getValDiaUltMod() != null && this.getValDiaUltMod().longValue() == -999) {
            conditions += " AND VAL_DIA_ULT_MOD IS NULL";
        } else if (this.getValDiaUltMod() != null) {
            conditions += " AND VAL_DIA_ULT_MOD = ?";
            values.add(this.getValDiaUltMod());
        }

        if (this.getValCveStValuado() != null && "null".equals(this.getValCveStValuado())) {
            conditions += " AND VAL_CVE_ST_VALUADO IS NULL";
        } else if (this.getValCveStValuado() != null) {
            conditions += " AND VAL_CVE_ST_VALUADO = ?";
            values.add(this.getValCveStValuado());
        }

        if (this.getValNumLada2Ofi() != null && "null".equals(this.getValNumLada2Ofi())) {
            conditions += " AND VAL_NUM_LADA2_OFI IS NULL";
        } else if (this.getValNumLada2Ofi() != null) {
            conditions += " AND VAL_NUM_LADA2_OFI = ?";
            values.add(this.getValNumLada2Ofi());
        }

        if (this.getValNumTel2Ofi() != null && "null".equals(this.getValNumTel2Ofi())) {
            conditions += " AND VAL_NUM_TEL2_OFI IS NULL";
        } else if (this.getValNumTel2Ofi() != null) {
            conditions += " AND VAL_NUM_TEL2_OFI = ?";
            values.add(this.getValNumTel2Ofi());
        }

        if (this.getValNumExt2Ofi() != null && "null".equals(this.getValNumExt2Ofi())) {
            conditions += " AND VAL_NUM_EXT2_OFI IS NULL";
        } else if (this.getValNumExt2Ofi() != null) {
            conditions += " AND VAL_NUM_EXT2_OFI = ?";
            values.add(this.getValNumExt2Ofi());
        }

        if (this.getValEMail() != null && "null".equals(this.getValEMail())) {
            conditions += " AND VAL_E_MAIL IS NULL";
        } else if (this.getValEMail() != null) {
            conditions += " AND VAL_E_MAIL = ?";
            values.add(this.getValEMail());
        }

        if (this.getValNumRegistro() != null && "null".equals(this.getValNumRegistro())) {
            conditions += " AND VAL_NUM_REGISTRO IS NULL";
        } else if (this.getValNumRegistro() != null) {
            conditions += " AND VAL_NUM_REGISTRO = ?";
            values.add(this.getValNumRegistro());
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
        String sql = "UPDATE VALUADOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND VAL_NUM_VALUADOR = ?";
        pkValues.add(this.getValNumValuador());
        fields += " VAL_NOM_VALUADOR = ?, ";
        values.add(this.getValNomValuador());
        fields += " VAL_RFC = ?, ";
        values.add(this.getValRfc());
        fields += " VAL_CVE_AVALUOS = ?, ";
        values.add(this.getValCveAvaluos());
        fields += " VAL_REG_VALUADOR = ?, ";
        values.add(this.getValRegValuador());
        fields += " VAL_CALLE_NUM = ?, ";
        values.add(this.getValCalleNum());
        fields += " VAL_NOM_COLONIA = ?, ";
        values.add(this.getValNomColonia());
        fields += " VAL_NOM_POBLACION = ?, ";
        values.add(this.getValNomPoblacion());
        fields += " VAL_CODIGO_POSTAL = ?, ";
        values.add(this.getValCodigoPostal());
        fields += " VAL_NUM_ESTADO = ?, ";
        values.add(this.getValNumEstado());
        fields += " VAL_NOM_ESTADO = ?, ";
        values.add(this.getValNomEstado());
        fields += " VAL_NUM_PAIS = ?, ";
        values.add(this.getValNumPais());
        fields += " VAL_NOM_PAIS = ?, ";
        values.add(this.getValNomPais());
        fields += " VAL_NUM_LADA_OFIC = ?, ";
        values.add(this.getValNumLadaOfic());
        fields += " VAL_NUM_TELEF_OFIC = ?, ";
        values.add(this.getValNumTelefOfic());
        fields += " VAL_NUM_EXT_OFIC = ?, ";
        values.add(this.getValNumExtOfic());
        fields += " VAL_NUM_LADA_FAX = ?, ";
        values.add(this.getValNumLadaFax());
        fields += " VAL_NUM_TELEF_FAX = ?, ";
        values.add(this.getValNumTelefFax());
        fields += " VAL_NUM_EXT_FAX = ?, ";
        values.add(this.getValNumExtFax());
        fields += " VAL_ANO_ALTA_REG = ?, ";
        values.add(this.getValAnoAltaReg());
        fields += " VAL_MES_ALTA_REG = ?, ";
        values.add(this.getValMesAltaReg());
        fields += " VAL_DIA_ALTA_REG = ?, ";
        values.add(this.getValDiaAltaReg());
        fields += " VAL_ANO_ULT_MOD = ?, ";
        values.add(this.getValAnoUltMod());
        fields += " VAL_MES_ULT_MOD = ?, ";
        values.add(this.getValMesUltMod());
        fields += " VAL_DIA_ULT_MOD = ?, ";
        values.add(this.getValDiaUltMod());
        fields += " VAL_CVE_ST_VALUADO = ?, ";
        values.add(this.getValCveStValuado());
        fields += " VAL_NUM_LADA2_OFI = ?, ";
        values.add(this.getValNumLada2Ofi());
        fields += " VAL_NUM_TEL2_OFI = ?, ";
        values.add(this.getValNumTel2Ofi());
        fields += " VAL_NUM_EXT2_OFI = ?, ";
        values.add(this.getValNumExt2Ofi());
        fields += " VAL_E_MAIL = ?, ";
        values.add(this.getValEMail());
        fields += " VAL_NUM_REGISTRO = ?, ";
        values.add(this.getValNumRegistro());
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
        String sql = "INSERT INTO VALUADOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", VAL_NUM_VALUADOR";
        fieldValues += ", ?";
        values.add(this.getValNumValuador());

        fields += ", VAL_NOM_VALUADOR";
        fieldValues += ", ?";
        values.add(this.getValNomValuador());

        fields += ", VAL_RFC";
        fieldValues += ", ?";
        values.add(this.getValRfc());

        fields += ", VAL_CVE_AVALUOS";
        fieldValues += ", ?";
        values.add(this.getValCveAvaluos());

        fields += ", VAL_REG_VALUADOR";
        fieldValues += ", ?";
        values.add(this.getValRegValuador());

        fields += ", VAL_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getValCalleNum());

        fields += ", VAL_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getValNomColonia());

        fields += ", VAL_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getValNomPoblacion());

        fields += ", VAL_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getValCodigoPostal());

        fields += ", VAL_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getValNumEstado());

        fields += ", VAL_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getValNomEstado());

        fields += ", VAL_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getValNumPais());

        fields += ", VAL_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getValNomPais());

        fields += ", VAL_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getValNumLadaOfic());

        fields += ", VAL_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getValNumTelefOfic());

        fields += ", VAL_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getValNumExtOfic());

        fields += ", VAL_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getValNumLadaFax());

        fields += ", VAL_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getValNumTelefFax());

        fields += ", VAL_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getValNumExtFax());

        fields += ", VAL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getValAnoAltaReg());

        fields += ", VAL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getValMesAltaReg());

        fields += ", VAL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getValDiaAltaReg());

        fields += ", VAL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getValAnoUltMod());

        fields += ", VAL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getValMesUltMod());

        fields += ", VAL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getValDiaUltMod());

        fields += ", VAL_CVE_ST_VALUADO";
        fieldValues += ", ?";
        values.add(this.getValCveStValuado());

        fields += ", VAL_NUM_LADA2_OFI";
        fieldValues += ", ?";
        values.add(this.getValNumLada2Ofi());

        fields += ", VAL_NUM_TEL2_OFI";
        fieldValues += ", ?";
        values.add(this.getValNumTel2Ofi());

        fields += ", VAL_NUM_EXT2_OFI";
        fieldValues += ", ?";
        values.add(this.getValNumExt2Ofi());

        fields += ", VAL_E_MAIL";
        fieldValues += ", ?";
        values.add(this.getValEMail());

        fields += ", VAL_NUM_REGISTRO";
        fieldValues += ", ?";
        values.add(this.getValNumRegistro());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM VALUADOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND VAL_NUM_VALUADOR = ?";
        values.add(this.getValNumValuador());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Valuador instance = (Valuador) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getValNumValuador().equals(instance.getValNumValuador()))
            equalObjects = false;
        if (equalObjects && !this.getValNomValuador().equals(instance.getValNomValuador()))
            equalObjects = false;
        if (equalObjects && !this.getValRfc().equals(instance.getValRfc()))
            equalObjects = false;
        if (equalObjects && !this.getValCveAvaluos().equals(instance.getValCveAvaluos()))
            equalObjects = false;
        if (equalObjects && !this.getValRegValuador().equals(instance.getValRegValuador()))
            equalObjects = false;
        if (equalObjects && !this.getValCalleNum().equals(instance.getValCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getValNomColonia().equals(instance.getValNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getValNomPoblacion().equals(instance.getValNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getValCodigoPostal().equals(instance.getValCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getValNumEstado().equals(instance.getValNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getValNomEstado().equals(instance.getValNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getValNumPais().equals(instance.getValNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getValNomPais().equals(instance.getValNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getValNumLadaOfic().equals(instance.getValNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getValNumTelefOfic().equals(instance.getValNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getValNumExtOfic().equals(instance.getValNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getValNumLadaFax().equals(instance.getValNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getValNumTelefFax().equals(instance.getValNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getValNumExtFax().equals(instance.getValNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getValAnoAltaReg().equals(instance.getValAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getValMesAltaReg().equals(instance.getValMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getValDiaAltaReg().equals(instance.getValDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getValAnoUltMod().equals(instance.getValAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getValMesUltMod().equals(instance.getValMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getValDiaUltMod().equals(instance.getValDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getValCveStValuado().equals(instance.getValCveStValuado()))
            equalObjects = false;
        if (equalObjects && !this.getValNumLada2Ofi().equals(instance.getValNumLada2Ofi()))
            equalObjects = false;
        if (equalObjects && !this.getValNumTel2Ofi().equals(instance.getValNumTel2Ofi()))
            equalObjects = false;
        if (equalObjects && !this.getValNumExt2Ofi().equals(instance.getValNumExt2Ofi()))
            equalObjects = false;
        if (equalObjects && !this.getValEMail().equals(instance.getValEMail()))
            equalObjects = false;
        if (equalObjects && !this.getValNumRegistro().equals(instance.getValNumRegistro()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Valuador result = new Valuador();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setValNumValuador((BigDecimal) objectData.getData("VAL_NUM_VALUADOR"));
        result.setValNomValuador((String) objectData.getData("VAL_NOM_VALUADOR"));
        result.setValRfc((String) objectData.getData("VAL_RFC"));
        result.setValCveAvaluos((String) objectData.getData("VAL_CVE_AVALUOS"));
        result.setValRegValuador((String) objectData.getData("VAL_REG_VALUADOR"));
        result.setValCalleNum((String) objectData.getData("VAL_CALLE_NUM"));
        result.setValNomColonia((String) objectData.getData("VAL_NOM_COLONIA"));
        result.setValNomPoblacion((String) objectData.getData("VAL_NOM_POBLACION"));
        result.setValCodigoPostal((BigDecimal) objectData.getData("VAL_CODIGO_POSTAL"));
        result.setValNumEstado((BigDecimal) objectData.getData("VAL_NUM_ESTADO"));
        result.setValNomEstado((String) objectData.getData("VAL_NOM_ESTADO"));
        result.setValNumPais((BigDecimal) objectData.getData("VAL_NUM_PAIS"));
        result.setValNomPais((String) objectData.getData("VAL_NOM_PAIS"));
        result.setValNumLadaOfic((String) objectData.getData("VAL_NUM_LADA_OFIC"));
        result.setValNumTelefOfic((String) objectData.getData("VAL_NUM_TELEF_OFIC"));
        result.setValNumExtOfic((String) objectData.getData("VAL_NUM_EXT_OFIC"));
        result.setValNumLadaFax((String) objectData.getData("VAL_NUM_LADA_FAX"));
        result.setValNumTelefFax((String) objectData.getData("VAL_NUM_TELEF_FAX"));
        result.setValNumExtFax((String) objectData.getData("VAL_NUM_EXT_FAX"));
        result.setValAnoAltaReg((BigDecimal) objectData.getData("VAL_ANO_ALTA_REG"));
        result.setValMesAltaReg((BigDecimal) objectData.getData("VAL_MES_ALTA_REG"));
        result.setValDiaAltaReg((BigDecimal) objectData.getData("VAL_DIA_ALTA_REG"));
        result.setValAnoUltMod((BigDecimal) objectData.getData("VAL_ANO_ULT_MOD"));
        result.setValMesUltMod((BigDecimal) objectData.getData("VAL_MES_ULT_MOD"));
        result.setValDiaUltMod((BigDecimal) objectData.getData("VAL_DIA_ULT_MOD"));
        result.setValCveStValuado((String) objectData.getData("VAL_CVE_ST_VALUADO"));
        result.setValNumLada2Ofi((String) objectData.getData("VAL_NUM_LADA2_OFI"));
        result.setValNumTel2Ofi((String) objectData.getData("VAL_NUM_TEL2_OFI"));
        result.setValNumExt2Ofi((String) objectData.getData("VAL_NUM_EXT2_OFI"));
        result.setValEMail((String) objectData.getData("VAL_E_MAIL"));
        result.setValNumRegistro((String) objectData.getData("VAL_NUM_REGISTRO"));

        return result;

    }

}
