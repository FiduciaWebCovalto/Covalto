package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONTACTO_PK", columns = { "CON_NUM_SEC_CONTAC", "CON_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Contacto extends DomainObject {

    BigDecimal conNumContrato = null;
    BigDecimal conNumSecContac = null;
    String conNomContacto = null;
    String conRfc = null;
    String conCalleNum = null;
    String conNomColonia = null;
    String conNomPoblacion = null;
    BigDecimal conCodigoPostal = null;
    BigDecimal conNumEstado = null;
    String conNomEstado = null;
    BigDecimal conNumPais = null;
    String conNomPais = null;
    String conNumLadaCasa = null;
    String conNumTelefCasa = null;
    String conNumLadaOfic = null;
    String conNumTelefOfic = null;
    String conNumExtOfic = null;
    String conNumLadaFax = null;
    String conNumTelefFax = null;
    String conNumExtFax = null;
    BigDecimal conAnoAltaReg = null;
    BigDecimal conMesAltaReg = null;
    BigDecimal conDiaAltaReg = null;
    BigDecimal conAnoUltMod = null;
    BigDecimal conMesUltMod = null;
    BigDecimal conDiaUltMod = null;
    String conCveStContact = null;
    String conCargo = null;
    String conDependencia = null;
    String conComentario = null;

    public Contacto() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConNumContrato(BigDecimal conNumContrato) {
        this.conNumContrato = conNumContrato;
    }

    public BigDecimal getConNumContrato() {
        return this.conNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConNumSecContac(BigDecimal conNumSecContac) {
        this.conNumSecContac = conNumSecContac;
    }

    public BigDecimal getConNumSecContac() {
        return this.conNumSecContac;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNomContacto(String conNomContacto) {
        this.conNomContacto = conNomContacto;
    }

    public String getConNomContacto() {
        return this.conNomContacto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConRfc(String conRfc) {
        this.conRfc = conRfc;
    }

    public String getConRfc() {
        return this.conRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConCalleNum(String conCalleNum) {
        this.conCalleNum = conCalleNum;
    }

    public String getConCalleNum() {
        return this.conCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNomColonia(String conNomColonia) {
        this.conNomColonia = conNomColonia;
    }

    public String getConNomColonia() {
        return this.conNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNomPoblacion(String conNomPoblacion) {
        this.conNomPoblacion = conNomPoblacion;
    }

    public String getConNomPoblacion() {
        return this.conNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConCodigoPostal(BigDecimal conCodigoPostal) {
        this.conCodigoPostal = conCodigoPostal;
    }

    public BigDecimal getConCodigoPostal() {
        return this.conCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConNumEstado(BigDecimal conNumEstado) {
        this.conNumEstado = conNumEstado;
    }

    public BigDecimal getConNumEstado() {
        return this.conNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNomEstado(String conNomEstado) {
        this.conNomEstado = conNomEstado;
    }

    public String getConNomEstado() {
        return this.conNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConNumPais(BigDecimal conNumPais) {
        this.conNumPais = conNumPais;
    }

    public BigDecimal getConNumPais() {
        return this.conNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNomPais(String conNomPais) {
        this.conNomPais = conNomPais;
    }

    public String getConNomPais() {
        return this.conNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNumLadaCasa(String conNumLadaCasa) {
        this.conNumLadaCasa = conNumLadaCasa;
    }

    public String getConNumLadaCasa() {
        return this.conNumLadaCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNumTelefCasa(String conNumTelefCasa) {
        this.conNumTelefCasa = conNumTelefCasa;
    }

    public String getConNumTelefCasa() {
        return this.conNumTelefCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNumLadaOfic(String conNumLadaOfic) {
        this.conNumLadaOfic = conNumLadaOfic;
    }

    public String getConNumLadaOfic() {
        return this.conNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNumTelefOfic(String conNumTelefOfic) {
        this.conNumTelefOfic = conNumTelefOfic;
    }

    public String getConNumTelefOfic() {
        return this.conNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNumExtOfic(String conNumExtOfic) {
        this.conNumExtOfic = conNumExtOfic;
    }

    public String getConNumExtOfic() {
        return this.conNumExtOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNumLadaFax(String conNumLadaFax) {
        this.conNumLadaFax = conNumLadaFax;
    }

    public String getConNumLadaFax() {
        return this.conNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNumTelefFax(String conNumTelefFax) {
        this.conNumTelefFax = conNumTelefFax;
    }

    public String getConNumTelefFax() {
        return this.conNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNumExtFax(String conNumExtFax) {
        this.conNumExtFax = conNumExtFax;
    }

    public String getConNumExtFax() {
        return this.conNumExtFax;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setConAnoAltaReg(BigDecimal conAnoAltaReg) {
        this.conAnoAltaReg = conAnoAltaReg;
    }

    public BigDecimal getConAnoAltaReg() {
        return this.conAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConMesAltaReg(BigDecimal conMesAltaReg) {
        this.conMesAltaReg = conMesAltaReg;
    }

    public BigDecimal getConMesAltaReg() {
        return this.conMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConDiaAltaReg(BigDecimal conDiaAltaReg) {
        this.conDiaAltaReg = conDiaAltaReg;
    }

    public BigDecimal getConDiaAltaReg() {
        return this.conDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setConAnoUltMod(BigDecimal conAnoUltMod) {
        this.conAnoUltMod = conAnoUltMod;
    }

    public BigDecimal getConAnoUltMod() {
        return this.conAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConMesUltMod(BigDecimal conMesUltMod) {
        this.conMesUltMod = conMesUltMod;
    }

    public BigDecimal getConMesUltMod() {
        return this.conMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConDiaUltMod(BigDecimal conDiaUltMod) {
        this.conDiaUltMod = conDiaUltMod;
    }

    public BigDecimal getConDiaUltMod() {
        return this.conDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConCveStContact(String conCveStContact) {
        this.conCveStContact = conCveStContact;
    }

    public String getConCveStContact() {
        return this.conCveStContact;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConCargo(String conCargo) {
        this.conCargo = conCargo;
    }

    public String getConCargo() {
        return this.conCargo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConDependencia(String conDependencia) {
        this.conDependencia = conDependencia;
    }

    public String getConDependencia() {
        return this.conDependencia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConComentario(String conComentario) {
        this.conComentario = conComentario;
    }

    public String getConComentario() {
        return this.conComentario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONTACTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getConNumContrato() != null && this.getConNumContrato().longValue() == -999) {
            conditions += " AND CON_NUM_CONTRATO IS NULL";
        } else if (this.getConNumContrato() != null) {
            conditions += " AND CON_NUM_CONTRATO = ?";
            values.add(this.getConNumContrato());
        }

        if (this.getConNumSecContac() != null && this.getConNumSecContac().longValue() == -999) {
            conditions += " AND CON_NUM_SEC_CONTAC IS NULL";
        } else if (this.getConNumSecContac() != null) {
            conditions += " AND CON_NUM_SEC_CONTAC = ?";
            values.add(this.getConNumSecContac());
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
        String sql = "SELECT * FROM CONTACTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getConNumContrato() != null && this.getConNumContrato().longValue() == -999) {
            conditions += " AND CON_NUM_CONTRATO IS NULL";
        } else if (this.getConNumContrato() != null) {
            conditions += " AND CON_NUM_CONTRATO = ?";
            values.add(this.getConNumContrato());
        }

        if (this.getConNumSecContac() != null && this.getConNumSecContac().longValue() == -999) {
            conditions += " AND CON_NUM_SEC_CONTAC IS NULL";
        } else if (this.getConNumSecContac() != null) {
            conditions += " AND CON_NUM_SEC_CONTAC = ?";
            values.add(this.getConNumSecContac());
        }

        if (this.getConNomContacto() != null && "null".equals(this.getConNomContacto())) {
            conditions += " AND CON_NOM_CONTACTO IS NULL";
        } else if (this.getConNomContacto() != null) {
            conditions += " AND CON_NOM_CONTACTO = ?";
            values.add(this.getConNomContacto());
        }

        if (this.getConRfc() != null && "null".equals(this.getConRfc())) {
            conditions += " AND CON_RFC IS NULL";
        } else if (this.getConRfc() != null) {
            conditions += " AND CON_RFC = ?";
            values.add(this.getConRfc());
        }

        if (this.getConCalleNum() != null && "null".equals(this.getConCalleNum())) {
            conditions += " AND CON_CALLE_NUM IS NULL";
        } else if (this.getConCalleNum() != null) {
            conditions += " AND CON_CALLE_NUM = ?";
            values.add(this.getConCalleNum());
        }

        if (this.getConNomColonia() != null && "null".equals(this.getConNomColonia())) {
            conditions += " AND CON_NOM_COLONIA IS NULL";
        } else if (this.getConNomColonia() != null) {
            conditions += " AND CON_NOM_COLONIA = ?";
            values.add(this.getConNomColonia());
        }

        if (this.getConNomPoblacion() != null && "null".equals(this.getConNomPoblacion())) {
            conditions += " AND CON_NOM_POBLACION IS NULL";
        } else if (this.getConNomPoblacion() != null) {
            conditions += " AND CON_NOM_POBLACION = ?";
            values.add(this.getConNomPoblacion());
        }

        if (this.getConCodigoPostal() != null && this.getConCodigoPostal().longValue() == -999) {
            conditions += " AND CON_CODIGO_POSTAL IS NULL";
        } else if (this.getConCodigoPostal() != null) {
            conditions += " AND CON_CODIGO_POSTAL = ?";
            values.add(this.getConCodigoPostal());
        }

        if (this.getConNumEstado() != null && this.getConNumEstado().longValue() == -999) {
            conditions += " AND CON_NUM_ESTADO IS NULL";
        } else if (this.getConNumEstado() != null) {
            conditions += " AND CON_NUM_ESTADO = ?";
            values.add(this.getConNumEstado());
        }

        if (this.getConNomEstado() != null && "null".equals(this.getConNomEstado())) {
            conditions += " AND CON_NOM_ESTADO IS NULL";
        } else if (this.getConNomEstado() != null) {
            conditions += " AND CON_NOM_ESTADO = ?";
            values.add(this.getConNomEstado());
        }

        if (this.getConNumPais() != null && this.getConNumPais().longValue() == -999) {
            conditions += " AND CON_NUM_PAIS IS NULL";
        } else if (this.getConNumPais() != null) {
            conditions += " AND CON_NUM_PAIS = ?";
            values.add(this.getConNumPais());
        }

        if (this.getConNomPais() != null && "null".equals(this.getConNomPais())) {
            conditions += " AND CON_NOM_PAIS IS NULL";
        } else if (this.getConNomPais() != null) {
            conditions += " AND CON_NOM_PAIS = ?";
            values.add(this.getConNomPais());
        }

        if (this.getConNumLadaCasa() != null && "null".equals(this.getConNumLadaCasa())) {
            conditions += " AND CON_NUM_LADA_CASA IS NULL";
        } else if (this.getConNumLadaCasa() != null) {
            conditions += " AND CON_NUM_LADA_CASA = ?";
            values.add(this.getConNumLadaCasa());
        }

        if (this.getConNumTelefCasa() != null && "null".equals(this.getConNumTelefCasa())) {
            conditions += " AND CON_NUM_TELEF_CASA IS NULL";
        } else if (this.getConNumTelefCasa() != null) {
            conditions += " AND CON_NUM_TELEF_CASA = ?";
            values.add(this.getConNumTelefCasa());
        }

        if (this.getConNumLadaOfic() != null && "null".equals(this.getConNumLadaOfic())) {
            conditions += " AND CON_NUM_LADA_OFIC IS NULL";
        } else if (this.getConNumLadaOfic() != null) {
            conditions += " AND CON_NUM_LADA_OFIC = ?";
            values.add(this.getConNumLadaOfic());
        }

        if (this.getConNumTelefOfic() != null && "null".equals(this.getConNumTelefOfic())) {
            conditions += " AND CON_NUM_TELEF_OFIC IS NULL";
        } else if (this.getConNumTelefOfic() != null) {
            conditions += " AND CON_NUM_TELEF_OFIC = ?";
            values.add(this.getConNumTelefOfic());
        }

        if (this.getConNumExtOfic() != null && "null".equals(this.getConNumExtOfic())) {
            conditions += " AND CON_NUM_EXT_OFIC IS NULL";
        } else if (this.getConNumExtOfic() != null) {
            conditions += " AND CON_NUM_EXT_OFIC = ?";
            values.add(this.getConNumExtOfic());
        }

        if (this.getConNumLadaFax() != null && "null".equals(this.getConNumLadaFax())) {
            conditions += " AND CON_NUM_LADA_FAX IS NULL";
        } else if (this.getConNumLadaFax() != null) {
            conditions += " AND CON_NUM_LADA_FAX = ?";
            values.add(this.getConNumLadaFax());
        }

        if (this.getConNumTelefFax() != null && "null".equals(this.getConNumTelefFax())) {
            conditions += " AND CON_NUM_TELEF_FAX IS NULL";
        } else if (this.getConNumTelefFax() != null) {
            conditions += " AND CON_NUM_TELEF_FAX = ?";
            values.add(this.getConNumTelefFax());
        }

        if (this.getConNumExtFax() != null && "null".equals(this.getConNumExtFax())) {
            conditions += " AND CON_NUM_EXT_FAX IS NULL";
        } else if (this.getConNumExtFax() != null) {
            conditions += " AND CON_NUM_EXT_FAX = ?";
            values.add(this.getConNumExtFax());
        }

        if (this.getConAnoAltaReg() != null && this.getConAnoAltaReg().longValue() == -999) {
            conditions += " AND CON_ANO_ALTA_REG IS NULL";
        } else if (this.getConAnoAltaReg() != null) {
            conditions += " AND CON_ANO_ALTA_REG = ?";
            values.add(this.getConAnoAltaReg());
        }

        if (this.getConMesAltaReg() != null && this.getConMesAltaReg().longValue() == -999) {
            conditions += " AND CON_MES_ALTA_REG IS NULL";
        } else if (this.getConMesAltaReg() != null) {
            conditions += " AND CON_MES_ALTA_REG = ?";
            values.add(this.getConMesAltaReg());
        }

        if (this.getConDiaAltaReg() != null && this.getConDiaAltaReg().longValue() == -999) {
            conditions += " AND CON_DIA_ALTA_REG IS NULL";
        } else if (this.getConDiaAltaReg() != null) {
            conditions += " AND CON_DIA_ALTA_REG = ?";
            values.add(this.getConDiaAltaReg());
        }

        if (this.getConAnoUltMod() != null && this.getConAnoUltMod().longValue() == -999) {
            conditions += " AND CON_ANO_ULT_MOD IS NULL";
        } else if (this.getConAnoUltMod() != null) {
            conditions += " AND CON_ANO_ULT_MOD = ?";
            values.add(this.getConAnoUltMod());
        }

        if (this.getConMesUltMod() != null && this.getConMesUltMod().longValue() == -999) {
            conditions += " AND CON_MES_ULT_MOD IS NULL";
        } else if (this.getConMesUltMod() != null) {
            conditions += " AND CON_MES_ULT_MOD = ?";
            values.add(this.getConMesUltMod());
        }

        if (this.getConDiaUltMod() != null && this.getConDiaUltMod().longValue() == -999) {
            conditions += " AND CON_DIA_ULT_MOD IS NULL";
        } else if (this.getConDiaUltMod() != null) {
            conditions += " AND CON_DIA_ULT_MOD = ?";
            values.add(this.getConDiaUltMod());
        }

        if (this.getConCveStContact() != null && "null".equals(this.getConCveStContact())) {
            conditions += " AND CON_CVE_ST_CONTACT IS NULL";
        } else if (this.getConCveStContact() != null) {
            conditions += " AND CON_CVE_ST_CONTACT = ?";
            values.add(this.getConCveStContact());
        }

        if (this.getConCargo() != null && "null".equals(this.getConCargo())) {
            conditions += " AND CON_CARGO IS NULL";
        } else if (this.getConCargo() != null) {
            conditions += " AND CON_CARGO = ?";
            values.add(this.getConCargo());
        }

        if (this.getConDependencia() != null && "null".equals(this.getConDependencia())) {
            conditions += " AND CON_DEPENDENCIA IS NULL";
        } else if (this.getConDependencia() != null) {
            conditions += " AND CON_DEPENDENCIA = ?";
            values.add(this.getConDependencia());
        }

        if (this.getConComentario() != null && "null".equals(this.getConComentario())) {
            conditions += " AND CON_COMENTARIO IS NULL";
        } else if (this.getConComentario() != null) {
            conditions += " AND CON_COMENTARIO = ?";
            values.add(this.getConComentario());
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
        String sql = "UPDATE CONTACTO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CON_NUM_CONTRATO = ?";
        pkValues.add(this.getConNumContrato());
        conditions += " AND CON_NUM_SEC_CONTAC = ?";
        pkValues.add(this.getConNumSecContac());
        fields += " CON_NOM_CONTACTO = ?, ";
        values.add(this.getConNomContacto());
        fields += " CON_RFC = ?, ";
        values.add(this.getConRfc());
        fields += " CON_CALLE_NUM = ?, ";
        values.add(this.getConCalleNum());
        fields += " CON_NOM_COLONIA = ?, ";
        values.add(this.getConNomColonia());
        fields += " CON_NOM_POBLACION = ?, ";
        values.add(this.getConNomPoblacion());
        fields += " CON_CODIGO_POSTAL = ?, ";
        values.add(this.getConCodigoPostal());
        fields += " CON_NUM_ESTADO = ?, ";
        values.add(this.getConNumEstado());
        fields += " CON_NOM_ESTADO = ?, ";
        values.add(this.getConNomEstado());
        fields += " CON_NUM_PAIS = ?, ";
        values.add(this.getConNumPais());
        fields += " CON_NOM_PAIS = ?, ";
        values.add(this.getConNomPais());
        fields += " CON_NUM_LADA_CASA = ?, ";
        values.add(this.getConNumLadaCasa());
        fields += " CON_NUM_TELEF_CASA = ?, ";
        values.add(this.getConNumTelefCasa());
        fields += " CON_NUM_LADA_OFIC = ?, ";
        values.add(this.getConNumLadaOfic());
        fields += " CON_NUM_TELEF_OFIC = ?, ";
        values.add(this.getConNumTelefOfic());
        fields += " CON_NUM_EXT_OFIC = ?, ";
        values.add(this.getConNumExtOfic());
        fields += " CON_NUM_LADA_FAX = ?, ";
        values.add(this.getConNumLadaFax());
        fields += " CON_NUM_TELEF_FAX = ?, ";
        values.add(this.getConNumTelefFax());
        fields += " CON_NUM_EXT_FAX = ?, ";
        values.add(this.getConNumExtFax());
        fields += " CON_ANO_ALTA_REG = ?, ";
        values.add(this.getConAnoAltaReg());
        fields += " CON_MES_ALTA_REG = ?, ";
        values.add(this.getConMesAltaReg());
        fields += " CON_DIA_ALTA_REG = ?, ";
        values.add(this.getConDiaAltaReg());
        fields += " CON_ANO_ULT_MOD = ?, ";
        values.add(this.getConAnoUltMod());
        fields += " CON_MES_ULT_MOD = ?, ";
        values.add(this.getConMesUltMod());
        fields += " CON_DIA_ULT_MOD = ?, ";
        values.add(this.getConDiaUltMod());
        fields += " CON_CVE_ST_CONTACT = ?, ";
        values.add(this.getConCveStContact());
        fields += " CON_CARGO = ?, ";
        values.add(this.getConCargo());
        fields += " CON_DEPENDENCIA = ?, ";
        values.add(this.getConDependencia());
        fields += " CON_COMENTARIO = ?, ";
        values.add(this.getConComentario());
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
        String sql = "INSERT INTO CONTACTO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CON_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getConNumContrato());

        fields += ", CON_NUM_SEC_CONTAC";
        fieldValues += ", ?";
        values.add(this.getConNumSecContac());

        fields += ", CON_NOM_CONTACTO";
        fieldValues += ", ?";
        values.add(this.getConNomContacto());

        fields += ", CON_RFC";
        fieldValues += ", ?";
        values.add(this.getConRfc());

        fields += ", CON_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getConCalleNum());

        fields += ", CON_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getConNomColonia());

        fields += ", CON_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getConNomPoblacion());

        fields += ", CON_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getConCodigoPostal());

        fields += ", CON_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getConNumEstado());

        fields += ", CON_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getConNomEstado());

        fields += ", CON_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getConNumPais());

        fields += ", CON_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getConNomPais());

        fields += ", CON_NUM_LADA_CASA";
        fieldValues += ", ?";
        values.add(this.getConNumLadaCasa());

        fields += ", CON_NUM_TELEF_CASA";
        fieldValues += ", ?";
        values.add(this.getConNumTelefCasa());

        fields += ", CON_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getConNumLadaOfic());

        fields += ", CON_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getConNumTelefOfic());

        fields += ", CON_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getConNumExtOfic());

        fields += ", CON_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getConNumLadaFax());

        fields += ", CON_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getConNumTelefFax());

        fields += ", CON_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getConNumExtFax());

        fields += ", CON_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getConAnoAltaReg());

        fields += ", CON_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getConMesAltaReg());

        fields += ", CON_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getConDiaAltaReg());

        fields += ", CON_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getConAnoUltMod());

        fields += ", CON_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getConMesUltMod());

        fields += ", CON_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getConDiaUltMod());

        fields += ", CON_CVE_ST_CONTACT";
        fieldValues += ", ?";
        values.add(this.getConCveStContact());

        fields += ", CON_CARGO";
        fieldValues += ", ?";
        values.add(this.getConCargo());

        fields += ", CON_DEPENDENCIA";
        fieldValues += ", ?";
        values.add(this.getConDependencia());

        fields += ", CON_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getConComentario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONTACTO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CON_NUM_CONTRATO = ?";
        values.add(this.getConNumContrato());
        conditions += " AND CON_NUM_SEC_CONTAC = ?";
        values.add(this.getConNumSecContac());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Contacto instance = (Contacto) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getConNumContrato().equals(instance.getConNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getConNumSecContac().equals(instance.getConNumSecContac()))
            equalObjects = false;
        if (equalObjects && !this.getConNomContacto().equals(instance.getConNomContacto()))
            equalObjects = false;
        if (equalObjects && !this.getConRfc().equals(instance.getConRfc()))
            equalObjects = false;
        if (equalObjects && !this.getConCalleNum().equals(instance.getConCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getConNomColonia().equals(instance.getConNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getConNomPoblacion().equals(instance.getConNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getConCodigoPostal().equals(instance.getConCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getConNumEstado().equals(instance.getConNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getConNomEstado().equals(instance.getConNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getConNumPais().equals(instance.getConNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getConNomPais().equals(instance.getConNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getConNumLadaCasa().equals(instance.getConNumLadaCasa()))
            equalObjects = false;
        if (equalObjects && !this.getConNumTelefCasa().equals(instance.getConNumTelefCasa()))
            equalObjects = false;
        if (equalObjects && !this.getConNumLadaOfic().equals(instance.getConNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getConNumTelefOfic().equals(instance.getConNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getConNumExtOfic().equals(instance.getConNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getConNumLadaFax().equals(instance.getConNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getConNumTelefFax().equals(instance.getConNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getConNumExtFax().equals(instance.getConNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getConAnoAltaReg().equals(instance.getConAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getConMesAltaReg().equals(instance.getConMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getConDiaAltaReg().equals(instance.getConDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getConAnoUltMod().equals(instance.getConAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getConMesUltMod().equals(instance.getConMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getConDiaUltMod().equals(instance.getConDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getConCveStContact().equals(instance.getConCveStContact()))
            equalObjects = false;
        if (equalObjects && !this.getConCargo().equals(instance.getConCargo()))
            equalObjects = false;
        if (equalObjects && !this.getConDependencia().equals(instance.getConDependencia()))
            equalObjects = false;
        if (equalObjects && !this.getConComentario().equals(instance.getConComentario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Contacto result = new Contacto();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setConNumContrato((BigDecimal) objectData.getData("CON_NUM_CONTRATO"));
        result.setConNumSecContac((BigDecimal) objectData.getData("CON_NUM_SEC_CONTAC"));
        result.setConNomContacto((String) objectData.getData("CON_NOM_CONTACTO"));
        result.setConRfc((String) objectData.getData("CON_RFC"));
        result.setConCalleNum((String) objectData.getData("CON_CALLE_NUM"));
        result.setConNomColonia((String) objectData.getData("CON_NOM_COLONIA"));
        result.setConNomPoblacion((String) objectData.getData("CON_NOM_POBLACION"));
        result.setConCodigoPostal((BigDecimal) objectData.getData("CON_CODIGO_POSTAL"));
        result.setConNumEstado((BigDecimal) objectData.getData("CON_NUM_ESTADO"));
        result.setConNomEstado((String) objectData.getData("CON_NOM_ESTADO"));
        result.setConNumPais((BigDecimal) objectData.getData("CON_NUM_PAIS"));
        result.setConNomPais((String) objectData.getData("CON_NOM_PAIS"));
        result.setConNumLadaCasa((String) objectData.getData("CON_NUM_LADA_CASA"));
        result.setConNumTelefCasa((String) objectData.getData("CON_NUM_TELEF_CASA"));
        result.setConNumLadaOfic((String) objectData.getData("CON_NUM_LADA_OFIC"));
        result.setConNumTelefOfic((String) objectData.getData("CON_NUM_TELEF_OFIC"));
        result.setConNumExtOfic((String) objectData.getData("CON_NUM_EXT_OFIC"));
        result.setConNumLadaFax((String) objectData.getData("CON_NUM_LADA_FAX"));
        result.setConNumTelefFax((String) objectData.getData("CON_NUM_TELEF_FAX"));
        result.setConNumExtFax((String) objectData.getData("CON_NUM_EXT_FAX"));
        result.setConAnoAltaReg((BigDecimal) objectData.getData("CON_ANO_ALTA_REG"));
        result.setConMesAltaReg((BigDecimal) objectData.getData("CON_MES_ALTA_REG"));
        result.setConDiaAltaReg((BigDecimal) objectData.getData("CON_DIA_ALTA_REG"));
        result.setConAnoUltMod((BigDecimal) objectData.getData("CON_ANO_ULT_MOD"));
        result.setConMesUltMod((BigDecimal) objectData.getData("CON_MES_ULT_MOD"));
        result.setConDiaUltMod((BigDecimal) objectData.getData("CON_DIA_ULT_MOD"));
        result.setConCveStContact((String) objectData.getData("CON_CVE_ST_CONTACT"));
        result.setConCargo((String) objectData.getData("CON_CARGO"));
        result.setConDependencia((String) objectData.getData("CON_DEPENDENCIA"));
        result.setConComentario((String) objectData.getData("CON_COMENTARIO"));

        return result;

    }

}
