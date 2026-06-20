package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "NOTARIOS_PK", columns = { "NOT_NUM_NOTARIO" }, sequences = { "MAX" })
public class Notarios extends DomainObject {

    BigDecimal notNumNotario = null;
    BigDecimal notNumOficNota = null;
    String notNomNotario = null;
    String notLocalidadNota = null;
    String notRfc = null;
    String notCalleNum = null;
    String notNomColonia = null;
    String notNomPoblacion = null;
    BigDecimal notCodigoPostal = null;
    BigDecimal notNumEstado = null;
    String notNomEstado = null;
    BigDecimal notNumPais = null;
    String notNomPais = null;
    String notCveLada1Ofic = null;
    String notTelef1Ofic = null;
    String notNumExt1Ofic = null;
    String notCveLada2Ofic = null;
    String notTelef2Ofic = null;
    String notNumExt2Ofic = null;
    String notNumLadaFax = null;
    String notNumTelefFax = null;
    String notNumExtFax = null;
    BigDecimal notAnoAltaReg = null;
    BigDecimal notMesAltaReg = null;
    BigDecimal notDiaAltaReg = null;
    BigDecimal notAnoUltMod = null;
    BigDecimal notMesUltMod = null;
    BigDecimal notDiaUltMod = null;
    String notCveStNotario = null;
    String notEMail = null;
    String notNomOperador = null;
    String notNomDelegacion = null;

    public Notarios() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNotNumNotario(BigDecimal notNumNotario) {
        this.notNumNotario = notNumNotario;
    }

    public BigDecimal getNotNumNotario() {
        return this.notNumNotario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNotNumOficNota(BigDecimal notNumOficNota) {
        this.notNumOficNota = notNumOficNota;
    }

    public BigDecimal getNotNumOficNota() {
        return this.notNumOficNota;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNomNotario(String notNomNotario) {
        this.notNomNotario = notNomNotario;
    }

    public String getNotNomNotario() {
        return this.notNomNotario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotLocalidadNota(String notLocalidadNota) {
        this.notLocalidadNota = notLocalidadNota;
    }

    public String getNotLocalidadNota() {
        return this.notLocalidadNota;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotRfc(String notRfc) {
        this.notRfc = notRfc;
    }

    public String getNotRfc() {
        return this.notRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotCalleNum(String notCalleNum) {
        this.notCalleNum = notCalleNum;
    }

    public String getNotCalleNum() {
        return this.notCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNomColonia(String notNomColonia) {
        this.notNomColonia = notNomColonia;
    }

    public String getNotNomColonia() {
        return this.notNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNomPoblacion(String notNomPoblacion) {
        this.notNomPoblacion = notNomPoblacion;
    }

    public String getNotNomPoblacion() {
        return this.notNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNotCodigoPostal(BigDecimal notCodigoPostal) {
        this.notCodigoPostal = notCodigoPostal;
    }

    public BigDecimal getNotCodigoPostal() {
        return this.notCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNotNumEstado(BigDecimal notNumEstado) {
        this.notNumEstado = notNumEstado;
    }

    public BigDecimal getNotNumEstado() {
        return this.notNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNomEstado(String notNomEstado) {
        this.notNomEstado = notNomEstado;
    }

    public String getNotNomEstado() {
        return this.notNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setNotNumPais(BigDecimal notNumPais) {
        this.notNumPais = notNumPais;
    }

    public BigDecimal getNotNumPais() {
        return this.notNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNomPais(String notNomPais) {
        this.notNomPais = notNomPais;
    }

    public String getNotNomPais() {
        return this.notNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotCveLada1Ofic(String notCveLada1Ofic) {
        this.notCveLada1Ofic = notCveLada1Ofic;
    }

    public String getNotCveLada1Ofic() {
        return this.notCveLada1Ofic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotTelef1Ofic(String notTelef1Ofic) {
        this.notTelef1Ofic = notTelef1Ofic;
    }

    public String getNotTelef1Ofic() {
        return this.notTelef1Ofic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNumExt1Ofic(String notNumExt1Ofic) {
        this.notNumExt1Ofic = notNumExt1Ofic;
    }

    public String getNotNumExt1Ofic() {
        return this.notNumExt1Ofic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotCveLada2Ofic(String notCveLada2Ofic) {
        this.notCveLada2Ofic = notCveLada2Ofic;
    }

    public String getNotCveLada2Ofic() {
        return this.notCveLada2Ofic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotTelef2Ofic(String notTelef2Ofic) {
        this.notTelef2Ofic = notTelef2Ofic;
    }

    public String getNotTelef2Ofic() {
        return this.notTelef2Ofic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNumExt2Ofic(String notNumExt2Ofic) {
        this.notNumExt2Ofic = notNumExt2Ofic;
    }

    public String getNotNumExt2Ofic() {
        return this.notNumExt2Ofic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNumLadaFax(String notNumLadaFax) {
        this.notNumLadaFax = notNumLadaFax;
    }

    public String getNotNumLadaFax() {
        return this.notNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNumTelefFax(String notNumTelefFax) {
        this.notNumTelefFax = notNumTelefFax;
    }

    public String getNotNumTelefFax() {
        return this.notNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNumExtFax(String notNumExtFax) {
        this.notNumExtFax = notNumExtFax;
    }

    public String getNotNumExtFax() {
        return this.notNumExtFax;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNotAnoAltaReg(BigDecimal notAnoAltaReg) {
        this.notAnoAltaReg = notAnoAltaReg;
    }

    public BigDecimal getNotAnoAltaReg() {
        return this.notAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNotMesAltaReg(BigDecimal notMesAltaReg) {
        this.notMesAltaReg = notMesAltaReg;
    }

    public BigDecimal getNotMesAltaReg() {
        return this.notMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNotDiaAltaReg(BigDecimal notDiaAltaReg) {
        this.notDiaAltaReg = notDiaAltaReg;
    }

    public BigDecimal getNotDiaAltaReg() {
        return this.notDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNotAnoUltMod(BigDecimal notAnoUltMod) {
        this.notAnoUltMod = notAnoUltMod;
    }

    public BigDecimal getNotAnoUltMod() {
        return this.notAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNotMesUltMod(BigDecimal notMesUltMod) {
        this.notMesUltMod = notMesUltMod;
    }

    public BigDecimal getNotMesUltMod() {
        return this.notMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNotDiaUltMod(BigDecimal notDiaUltMod) {
        this.notDiaUltMod = notDiaUltMod;
    }

    public BigDecimal getNotDiaUltMod() {
        return this.notDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotCveStNotario(String notCveStNotario) {
        this.notCveStNotario = notCveStNotario;
    }

    public String getNotCveStNotario() {
        return this.notCveStNotario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotEMail(String notEMail) {
        this.notEMail = notEMail;
    }

    public String getNotEMail() {
        return this.notEMail;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNomOperador(String notNomOperador) {
        this.notNomOperador = notNomOperador;
    }

    public String getNotNomOperador() {
        return this.notNomOperador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNotNomDelegacion(String notNomDelegacion) {
        this.notNomDelegacion = notNomDelegacion;
    }

    public String getNotNomDelegacion() {
        return this.notNomDelegacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM NOTARIOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNotNumNotario() != null && this.getNotNumNotario().longValue() == -999) {
            conditions += " AND NOT_NUM_NOTARIO IS NULL";
        } else if (this.getNotNumNotario() != null) {
            conditions += " AND NOT_NUM_NOTARIO = ?";
            values.add(this.getNotNumNotario());
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
        String sql = "SELECT * FROM NOTARIOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNotNumNotario() != null && this.getNotNumNotario().longValue() == -999) {
            conditions += " AND NOT_NUM_NOTARIO IS NULL";
        } else if (this.getNotNumNotario() != null) {
            conditions += " AND NOT_NUM_NOTARIO = ?";
            values.add(this.getNotNumNotario());
        }

        if (this.getNotNumOficNota() != null && this.getNotNumOficNota().longValue() == -999) {
            conditions += " AND NOT_NUM_OFIC_NOTA IS NULL";
        } else if (this.getNotNumOficNota() != null) {
            conditions += " AND NOT_NUM_OFIC_NOTA = ?";
            values.add(this.getNotNumOficNota());
        }

        if (this.getNotNomNotario() != null && "null".equals(this.getNotNomNotario())) {
            conditions += " AND NOT_NOM_NOTARIO IS NULL";
        } else if (this.getNotNomNotario() != null) {
            conditions += " AND NOT_NOM_NOTARIO = ?";
            values.add(this.getNotNomNotario());
        }

        if (this.getNotLocalidadNota() != null && "null".equals(this.getNotLocalidadNota())) {
            conditions += " AND NOT_LOCALIDAD_NOTA IS NULL";
        } else if (this.getNotLocalidadNota() != null) {
            conditions += " AND NOT_LOCALIDAD_NOTA = ?";
            values.add(this.getNotLocalidadNota());
        }

        if (this.getNotRfc() != null && "null".equals(this.getNotRfc())) {
            conditions += " AND NOT_RFC IS NULL";
        } else if (this.getNotRfc() != null) {
            conditions += " AND NOT_RFC = ?";
            values.add(this.getNotRfc());
        }

        if (this.getNotCalleNum() != null && "null".equals(this.getNotCalleNum())) {
            conditions += " AND NOT_CALLE_NUM IS NULL";
        } else if (this.getNotCalleNum() != null) {
            conditions += " AND NOT_CALLE_NUM = ?";
            values.add(this.getNotCalleNum());
        }

        if (this.getNotNomColonia() != null && "null".equals(this.getNotNomColonia())) {
            conditions += " AND NOT_NOM_COLONIA IS NULL";
        } else if (this.getNotNomColonia() != null) {
            conditions += " AND NOT_NOM_COLONIA = ?";
            values.add(this.getNotNomColonia());
        }

        if (this.getNotNomPoblacion() != null && "null".equals(this.getNotNomPoblacion())) {
            conditions += " AND NOT_NOM_POBLACION IS NULL";
        } else if (this.getNotNomPoblacion() != null) {
            conditions += " AND NOT_NOM_POBLACION = ?";
            values.add(this.getNotNomPoblacion());
        }

        if (this.getNotCodigoPostal() != null && this.getNotCodigoPostal().longValue() == -999) {
            conditions += " AND NOT_CODIGO_POSTAL IS NULL";
        } else if (this.getNotCodigoPostal() != null) {
            conditions += " AND NOT_CODIGO_POSTAL = ?";
            values.add(this.getNotCodigoPostal());
        }

        if (this.getNotNumEstado() != null && this.getNotNumEstado().longValue() == -999) {
            conditions += " AND NOT_NUM_ESTADO IS NULL";
        } else if (this.getNotNumEstado() != null) {
            conditions += " AND NOT_NUM_ESTADO = ?";
            values.add(this.getNotNumEstado());
        }

        if (this.getNotNomEstado() != null && "null".equals(this.getNotNomEstado())) {
            conditions += " AND NOT_NOM_ESTADO IS NULL";
        } else if (this.getNotNomEstado() != null) {
            conditions += " AND NOT_NOM_ESTADO = ?";
            values.add(this.getNotNomEstado());
        }

        if (this.getNotNumPais() != null && this.getNotNumPais().longValue() == -999) {
            conditions += " AND NOT_NUM_PAIS IS NULL";
        } else if (this.getNotNumPais() != null) {
            conditions += " AND NOT_NUM_PAIS = ?";
            values.add(this.getNotNumPais());
        }

        if (this.getNotNomPais() != null && "null".equals(this.getNotNomPais())) {
            conditions += " AND NOT_NOM_PAIS IS NULL";
        } else if (this.getNotNomPais() != null) {
            conditions += " AND NOT_NOM_PAIS = ?";
            values.add(this.getNotNomPais());
        }

        if (this.getNotCveLada1Ofic() != null && "null".equals(this.getNotCveLada1Ofic())) {
            conditions += " AND NOT_CVE_LADA1_OFIC IS NULL";
        } else if (this.getNotCveLada1Ofic() != null) {
            conditions += " AND NOT_CVE_LADA1_OFIC = ?";
            values.add(this.getNotCveLada1Ofic());
        }

        if (this.getNotTelef1Ofic() != null && "null".equals(this.getNotTelef1Ofic())) {
            conditions += " AND NOT_TELEF1_OFIC IS NULL";
        } else if (this.getNotTelef1Ofic() != null) {
            conditions += " AND NOT_TELEF1_OFIC = ?";
            values.add(this.getNotTelef1Ofic());
        }

        if (this.getNotNumExt1Ofic() != null && "null".equals(this.getNotNumExt1Ofic())) {
            conditions += " AND NOT_NUM_EXT1_OFIC IS NULL";
        } else if (this.getNotNumExt1Ofic() != null) {
            conditions += " AND NOT_NUM_EXT1_OFIC = ?";
            values.add(this.getNotNumExt1Ofic());
        }

        if (this.getNotCveLada2Ofic() != null && "null".equals(this.getNotCveLada2Ofic())) {
            conditions += " AND NOT_CVE_LADA2_OFIC IS NULL";
        } else if (this.getNotCveLada2Ofic() != null) {
            conditions += " AND NOT_CVE_LADA2_OFIC = ?";
            values.add(this.getNotCveLada2Ofic());
        }

        if (this.getNotTelef2Ofic() != null && "null".equals(this.getNotTelef2Ofic())) {
            conditions += " AND NOT_TELEF2_OFIC IS NULL";
        } else if (this.getNotTelef2Ofic() != null) {
            conditions += " AND NOT_TELEF2_OFIC = ?";
            values.add(this.getNotTelef2Ofic());
        }

        if (this.getNotNumExt2Ofic() != null && "null".equals(this.getNotNumExt2Ofic())) {
            conditions += " AND NOT_NUM_EXT2_OFIC IS NULL";
        } else if (this.getNotNumExt2Ofic() != null) {
            conditions += " AND NOT_NUM_EXT2_OFIC = ?";
            values.add(this.getNotNumExt2Ofic());
        }

        if (this.getNotNumLadaFax() != null && "null".equals(this.getNotNumLadaFax())) {
            conditions += " AND NOT_NUM_LADA_FAX IS NULL";
        } else if (this.getNotNumLadaFax() != null) {
            conditions += " AND NOT_NUM_LADA_FAX = ?";
            values.add(this.getNotNumLadaFax());
        }

        if (this.getNotNumTelefFax() != null && "null".equals(this.getNotNumTelefFax())) {
            conditions += " AND NOT_NUM_TELEF_FAX IS NULL";
        } else if (this.getNotNumTelefFax() != null) {
            conditions += " AND NOT_NUM_TELEF_FAX = ?";
            values.add(this.getNotNumTelefFax());
        }

        if (this.getNotNumExtFax() != null && "null".equals(this.getNotNumExtFax())) {
            conditions += " AND NOT_NUM_EXT_FAX IS NULL";
        } else if (this.getNotNumExtFax() != null) {
            conditions += " AND NOT_NUM_EXT_FAX = ?";
            values.add(this.getNotNumExtFax());
        }

        if (this.getNotAnoAltaReg() != null && this.getNotAnoAltaReg().longValue() == -999) {
            conditions += " AND NOT_ANO_ALTA_REG IS NULL";
        } else if (this.getNotAnoAltaReg() != null) {
            conditions += " AND NOT_ANO_ALTA_REG = ?";
            values.add(this.getNotAnoAltaReg());
        }

        if (this.getNotMesAltaReg() != null && this.getNotMesAltaReg().longValue() == -999) {
            conditions += " AND NOT_MES_ALTA_REG IS NULL";
        } else if (this.getNotMesAltaReg() != null) {
            conditions += " AND NOT_MES_ALTA_REG = ?";
            values.add(this.getNotMesAltaReg());
        }

        if (this.getNotDiaAltaReg() != null && this.getNotDiaAltaReg().longValue() == -999) {
            conditions += " AND NOT_DIA_ALTA_REG IS NULL";
        } else if (this.getNotDiaAltaReg() != null) {
            conditions += " AND NOT_DIA_ALTA_REG = ?";
            values.add(this.getNotDiaAltaReg());
        }

        if (this.getNotAnoUltMod() != null && this.getNotAnoUltMod().longValue() == -999) {
            conditions += " AND NOT_ANO_ULT_MOD IS NULL";
        } else if (this.getNotAnoUltMod() != null) {
            conditions += " AND NOT_ANO_ULT_MOD = ?";
            values.add(this.getNotAnoUltMod());
        }

        if (this.getNotMesUltMod() != null && this.getNotMesUltMod().longValue() == -999) {
            conditions += " AND NOT_MES_ULT_MOD IS NULL";
        } else if (this.getNotMesUltMod() != null) {
            conditions += " AND NOT_MES_ULT_MOD = ?";
            values.add(this.getNotMesUltMod());
        }

        if (this.getNotDiaUltMod() != null && this.getNotDiaUltMod().longValue() == -999) {
            conditions += " AND NOT_DIA_ULT_MOD IS NULL";
        } else if (this.getNotDiaUltMod() != null) {
            conditions += " AND NOT_DIA_ULT_MOD = ?";
            values.add(this.getNotDiaUltMod());
        }

        if (this.getNotCveStNotario() != null && "null".equals(this.getNotCveStNotario())) {
            conditions += " AND NOT_CVE_ST_NOTARIO IS NULL";
        } else if (this.getNotCveStNotario() != null) {
            conditions += " AND NOT_CVE_ST_NOTARIO = ?";
            values.add(this.getNotCveStNotario());
        }

        if (this.getNotEMail() != null && "null".equals(this.getNotEMail())) {
            conditions += " AND NOT_E_MAIL IS NULL";
        } else if (this.getNotEMail() != null) {
            conditions += " AND NOT_E_MAIL = ?";
            values.add(this.getNotEMail());
        }

        if (this.getNotNomOperador() != null && "null".equals(this.getNotNomOperador())) {
            conditions += " AND NOT_NOM_OPERADOR IS NULL";
        } else if (this.getNotNomOperador() != null) {
            conditions += " AND NOT_NOM_OPERADOR = ?";
            values.add(this.getNotNomOperador());
        }

        if (this.getNotNomDelegacion() != null && "null".equals(this.getNotNomDelegacion())) {
            conditions += " AND NOT_NOM_DELEGACION IS NULL";
        } else if (this.getNotNomDelegacion() != null) {
            conditions += " AND NOT_NOM_DELEGACION = ?";
            values.add(this.getNotNomDelegacion());
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
        String sql = "UPDATE NOTARIOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND NOT_NUM_NOTARIO = ?";
        pkValues.add(this.getNotNumNotario());
        fields += " NOT_NUM_OFIC_NOTA = ?, ";
        values.add(this.getNotNumOficNota());
        fields += " NOT_NOM_NOTARIO = ?, ";
        values.add(this.getNotNomNotario());
        fields += " NOT_LOCALIDAD_NOTA = ?, ";
        values.add(this.getNotLocalidadNota());
        fields += " NOT_RFC = ?, ";
        values.add(this.getNotRfc());
        fields += " NOT_CALLE_NUM = ?, ";
        values.add(this.getNotCalleNum());
        fields += " NOT_NOM_COLONIA = ?, ";
        values.add(this.getNotNomColonia());
        fields += " NOT_NOM_POBLACION = ?, ";
        values.add(this.getNotNomPoblacion());
        fields += " NOT_CODIGO_POSTAL = ?, ";
        values.add(this.getNotCodigoPostal());
        fields += " NOT_NUM_ESTADO = ?, ";
        values.add(this.getNotNumEstado());
        fields += " NOT_NOM_ESTADO = ?, ";
        values.add(this.getNotNomEstado());
        fields += " NOT_NUM_PAIS = ?, ";
        values.add(this.getNotNumPais());
        fields += " NOT_NOM_PAIS = ?, ";
        values.add(this.getNotNomPais());
        fields += " NOT_CVE_LADA1_OFIC = ?, ";
        values.add(this.getNotCveLada1Ofic());
        fields += " NOT_TELEF1_OFIC = ?, ";
        values.add(this.getNotTelef1Ofic());
        fields += " NOT_NUM_EXT1_OFIC = ?, ";
        values.add(this.getNotNumExt1Ofic());
        fields += " NOT_CVE_LADA2_OFIC = ?, ";
        values.add(this.getNotCveLada2Ofic());
        fields += " NOT_TELEF2_OFIC = ?, ";
        values.add(this.getNotTelef2Ofic());
        fields += " NOT_NUM_EXT2_OFIC = ?, ";
        values.add(this.getNotNumExt2Ofic());
        fields += " NOT_NUM_LADA_FAX = ?, ";
        values.add(this.getNotNumLadaFax());
        fields += " NOT_NUM_TELEF_FAX = ?, ";
        values.add(this.getNotNumTelefFax());
        fields += " NOT_NUM_EXT_FAX = ?, ";
        values.add(this.getNotNumExtFax());
        fields += " NOT_ANO_ALTA_REG = ?, ";
        values.add(this.getNotAnoAltaReg());
        fields += " NOT_MES_ALTA_REG = ?, ";
        values.add(this.getNotMesAltaReg());
        fields += " NOT_DIA_ALTA_REG = ?, ";
        values.add(this.getNotDiaAltaReg());
        fields += " NOT_ANO_ULT_MOD = ?, ";
        values.add(this.getNotAnoUltMod());
        fields += " NOT_MES_ULT_MOD = ?, ";
        values.add(this.getNotMesUltMod());
        fields += " NOT_DIA_ULT_MOD = ?, ";
        values.add(this.getNotDiaUltMod());
        fields += " NOT_CVE_ST_NOTARIO = ?, ";
        values.add(this.getNotCveStNotario());
        fields += " NOT_E_MAIL = ?, ";
        values.add(this.getNotEMail());
        fields += " NOT_NOM_OPERADOR = ?, ";
        values.add(this.getNotNomOperador());
        fields += " NOT_NOM_DELEGACION = ?, ";
        values.add(this.getNotNomDelegacion());
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
        String sql = "INSERT INTO NOTARIOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", NOT_NUM_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getNotNumNotario());

        fields += ", NOT_NUM_OFIC_NOTA";
        fieldValues += ", ?";
        values.add(this.getNotNumOficNota());

        fields += ", NOT_NOM_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getNotNomNotario());

        fields += ", NOT_LOCALIDAD_NOTA";
        fieldValues += ", ?";
        values.add(this.getNotLocalidadNota());

        fields += ", NOT_RFC";
        fieldValues += ", ?";
        values.add(this.getNotRfc());

        fields += ", NOT_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getNotCalleNum());

        fields += ", NOT_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getNotNomColonia());

        fields += ", NOT_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getNotNomPoblacion());

        fields += ", NOT_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getNotCodigoPostal());

        fields += ", NOT_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getNotNumEstado());

        fields += ", NOT_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getNotNomEstado());

        fields += ", NOT_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getNotNumPais());

        fields += ", NOT_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getNotNomPais());

        fields += ", NOT_CVE_LADA1_OFIC";
        fieldValues += ", ?";
        values.add(this.getNotCveLada1Ofic());

        fields += ", NOT_TELEF1_OFIC";
        fieldValues += ", ?";
        values.add(this.getNotTelef1Ofic());

        fields += ", NOT_NUM_EXT1_OFIC";
        fieldValues += ", ?";
        values.add(this.getNotNumExt1Ofic());

        fields += ", NOT_CVE_LADA2_OFIC";
        fieldValues += ", ?";
        values.add(this.getNotCveLada2Ofic());

        fields += ", NOT_TELEF2_OFIC";
        fieldValues += ", ?";
        values.add(this.getNotTelef2Ofic());

        fields += ", NOT_NUM_EXT2_OFIC";
        fieldValues += ", ?";
        values.add(this.getNotNumExt2Ofic());

        fields += ", NOT_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getNotNumLadaFax());

        fields += ", NOT_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getNotNumTelefFax());

        fields += ", NOT_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getNotNumExtFax());

        fields += ", NOT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNotAnoAltaReg());

        fields += ", NOT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNotMesAltaReg());

        fields += ", NOT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNotDiaAltaReg());

        fields += ", NOT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNotAnoUltMod());

        fields += ", NOT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNotMesUltMod());

        fields += ", NOT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNotDiaUltMod());

        fields += ", NOT_CVE_ST_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getNotCveStNotario());

        fields += ", NOT_E_MAIL";
        fieldValues += ", ?";
        values.add(this.getNotEMail());

        fields += ", NOT_NOM_OPERADOR";
        fieldValues += ", ?";
        values.add(this.getNotNomOperador());

        fields += ", NOT_NOM_DELEGACION";
        fieldValues += ", ?";
        values.add(this.getNotNomDelegacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM NOTARIOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND NOT_NUM_NOTARIO = ?";
        values.add(this.getNotNumNotario());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Notarios instance = (Notarios) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getNotNumNotario().equals(instance.getNotNumNotario()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumOficNota().equals(instance.getNotNumOficNota()))
            equalObjects = false;
        if (equalObjects && !this.getNotNomNotario().equals(instance.getNotNomNotario()))
            equalObjects = false;
        if (equalObjects && !this.getNotLocalidadNota().equals(instance.getNotLocalidadNota()))
            equalObjects = false;
        if (equalObjects && !this.getNotRfc().equals(instance.getNotRfc()))
            equalObjects = false;
        if (equalObjects && !this.getNotCalleNum().equals(instance.getNotCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getNotNomColonia().equals(instance.getNotNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getNotNomPoblacion().equals(instance.getNotNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getNotCodigoPostal().equals(instance.getNotCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumEstado().equals(instance.getNotNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getNotNomEstado().equals(instance.getNotNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumPais().equals(instance.getNotNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getNotNomPais().equals(instance.getNotNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getNotCveLada1Ofic().equals(instance.getNotCveLada1Ofic()))
            equalObjects = false;
        if (equalObjects && !this.getNotTelef1Ofic().equals(instance.getNotTelef1Ofic()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumExt1Ofic().equals(instance.getNotNumExt1Ofic()))
            equalObjects = false;
        if (equalObjects && !this.getNotCveLada2Ofic().equals(instance.getNotCveLada2Ofic()))
            equalObjects = false;
        if (equalObjects && !this.getNotTelef2Ofic().equals(instance.getNotTelef2Ofic()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumExt2Ofic().equals(instance.getNotNumExt2Ofic()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumLadaFax().equals(instance.getNotNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumTelefFax().equals(instance.getNotNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumExtFax().equals(instance.getNotNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getNotAnoAltaReg().equals(instance.getNotAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNotMesAltaReg().equals(instance.getNotMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNotDiaAltaReg().equals(instance.getNotDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNotAnoUltMod().equals(instance.getNotAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNotMesUltMod().equals(instance.getNotMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNotDiaUltMod().equals(instance.getNotDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNotCveStNotario().equals(instance.getNotCveStNotario()))
            equalObjects = false;
        if (equalObjects && !this.getNotEMail().equals(instance.getNotEMail()))
            equalObjects = false;
        if (equalObjects && !this.getNotNomOperador().equals(instance.getNotNomOperador()))
            equalObjects = false;
        if (equalObjects && !this.getNotNomDelegacion().equals(instance.getNotNomDelegacion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Notarios result = new Notarios();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setNotNumNotario((BigDecimal) objectData.getData("NOT_NUM_NOTARIO"));
        result.setNotNumOficNota((BigDecimal) objectData.getData("NOT_NUM_OFIC_NOTA"));
        result.setNotNomNotario((String) objectData.getData("NOT_NOM_NOTARIO"));
        result.setNotLocalidadNota((String) objectData.getData("NOT_LOCALIDAD_NOTA"));
        result.setNotRfc((String) objectData.getData("NOT_RFC"));
        result.setNotCalleNum((String) objectData.getData("NOT_CALLE_NUM"));
        result.setNotNomColonia((String) objectData.getData("NOT_NOM_COLONIA"));
        result.setNotNomPoblacion((String) objectData.getData("NOT_NOM_POBLACION"));
        result.setNotCodigoPostal((BigDecimal) objectData.getData("NOT_CODIGO_POSTAL"));
        result.setNotNumEstado((BigDecimal) objectData.getData("NOT_NUM_ESTADO"));
        result.setNotNomEstado((String) objectData.getData("NOT_NOM_ESTADO"));
        result.setNotNumPais((BigDecimal) objectData.getData("NOT_NUM_PAIS"));
        result.setNotNomPais((String) objectData.getData("NOT_NOM_PAIS"));
        result.setNotCveLada1Ofic((String) objectData.getData("NOT_CVE_LADA1_OFIC"));
        result.setNotTelef1Ofic((String) objectData.getData("NOT_TELEF1_OFIC"));
        result.setNotNumExt1Ofic((String) objectData.getData("NOT_NUM_EXT1_OFIC"));
        result.setNotCveLada2Ofic((String) objectData.getData("NOT_CVE_LADA2_OFIC"));
        result.setNotTelef2Ofic((String) objectData.getData("NOT_TELEF2_OFIC"));
        result.setNotNumExt2Ofic((String) objectData.getData("NOT_NUM_EXT2_OFIC"));
        result.setNotNumLadaFax((String) objectData.getData("NOT_NUM_LADA_FAX"));
        result.setNotNumTelefFax((String) objectData.getData("NOT_NUM_TELEF_FAX"));
        result.setNotNumExtFax((String) objectData.getData("NOT_NUM_EXT_FAX"));
        result.setNotAnoAltaReg((BigDecimal) objectData.getData("NOT_ANO_ALTA_REG"));
        result.setNotMesAltaReg((BigDecimal) objectData.getData("NOT_MES_ALTA_REG"));
        result.setNotDiaAltaReg((BigDecimal) objectData.getData("NOT_DIA_ALTA_REG"));
        result.setNotAnoUltMod((BigDecimal) objectData.getData("NOT_ANO_ULT_MOD"));
        result.setNotMesUltMod((BigDecimal) objectData.getData("NOT_MES_ULT_MOD"));
        result.setNotDiaUltMod((BigDecimal) objectData.getData("NOT_DIA_ULT_MOD"));
        result.setNotCveStNotario((String) objectData.getData("NOT_CVE_ST_NOTARIO"));
        result.setNotEMail((String) objectData.getData("NOT_E_MAIL"));
        result.setNotNomOperador((String) objectData.getData("NOT_NOM_OPERADOR"));
        result.setNotNomDelegacion((String) objectData.getData("NOT_NOM_DELEGACION"));

        return result;

    }

}
