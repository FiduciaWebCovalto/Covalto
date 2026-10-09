package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CLIENTES_PK", columns = { "CLI_NUM_CLIENTE" }, sequences = { "MAX" })
public class Clientes extends DomainObject {

    BigDecimal cliNumCliente = null;
    String cliNomCliente = null;
    String cliRfc = null;
    String cliFecNacimiento = null;
    String cliCveTipoPer = null;
    String cliNomRepres = null;
    BigDecimal cliNumNacional = null;
    String cliNomNacional = null;
    String cliCalleNum = null;
    String cliNomColonia = null;
    String cliNomPoblacion = null;
    BigDecimal cliCodigoPostal = null;
    BigDecimal cliNumEstado = null;
    String cliNomEstado = null;
    BigDecimal cliNumPais = null;
    String cliNomPais = null;
    String cliNumLadaCasa = null;
    String cliNumTelefCasa = null;
    String cliNumLadaOfic = null;
    String cliNumTelefOfic = null;
    String cliNumExtOfic = null;
    String cliNumLadaFax = null;
    String cliNumTelefFax = null;
    String cliNumExtFax = null;
    BigDecimal cliAnoAltaReg = null;
    BigDecimal cliMesAltaReg = null;
    BigDecimal cliDiaAltaReg = null;
    BigDecimal cliAnoUltMod = null;
    BigDecimal cliMesUltMod = null;
    BigDecimal cliDiaUltMod = null;
    String cliCveStCliente = null;
    String cliCveTipoCli = null;

    public Clientes() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCliNumCliente(BigDecimal cliNumCliente) {
        this.cliNumCliente = cliNumCliente;
    }

    public BigDecimal getCliNumCliente() {
        return this.cliNumCliente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNomCliente(String cliNomCliente) {
        this.cliNomCliente = cliNomCliente;
    }

    public String getCliNomCliente() {
        return this.cliNomCliente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliRfc(String cliRfc) {
        this.cliRfc = cliRfc;
    }

    public String getCliRfc() {
        return this.cliRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliFecNacimiento(String cliFecNacimiento) {
        this.cliFecNacimiento = cliFecNacimiento;
    }

    public String getCliFecNacimiento() {
        return this.cliFecNacimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliCveTipoPer(String cliCveTipoPer) {
        this.cliCveTipoPer = cliCveTipoPer;
    }

    public String getCliCveTipoPer() {
        return this.cliCveTipoPer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNomRepres(String cliNomRepres) {
        this.cliNomRepres = cliNomRepres;
    }

    public String getCliNomRepres() {
        return this.cliNomRepres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCliNumNacional(BigDecimal cliNumNacional) {
        this.cliNumNacional = cliNumNacional;
    }

    public BigDecimal getCliNumNacional() {
        return this.cliNumNacional;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNomNacional(String cliNomNacional) {
        this.cliNomNacional = cliNomNacional;
    }

    public String getCliNomNacional() {
        return this.cliNomNacional;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliCalleNum(String cliCalleNum) {
        this.cliCalleNum = cliCalleNum;
    }

    public String getCliCalleNum() {
        return this.cliCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNomColonia(String cliNomColonia) {
        this.cliNomColonia = cliNomColonia;
    }

    public String getCliNomColonia() {
        return this.cliNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNomPoblacion(String cliNomPoblacion) {
        this.cliNomPoblacion = cliNomPoblacion;
    }

    public String getCliNomPoblacion() {
        return this.cliNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCliCodigoPostal(BigDecimal cliCodigoPostal) {
        this.cliCodigoPostal = cliCodigoPostal;
    }

    public BigDecimal getCliCodigoPostal() {
        return this.cliCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCliNumEstado(BigDecimal cliNumEstado) {
        this.cliNumEstado = cliNumEstado;
    }

    public BigDecimal getCliNumEstado() {
        return this.cliNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNomEstado(String cliNomEstado) {
        this.cliNomEstado = cliNomEstado;
    }

    public String getCliNomEstado() {
        return this.cliNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCliNumPais(BigDecimal cliNumPais) {
        this.cliNumPais = cliNumPais;
    }

    public BigDecimal getCliNumPais() {
        return this.cliNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNomPais(String cliNomPais) {
        this.cliNomPais = cliNomPais;
    }

    public String getCliNomPais() {
        return this.cliNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumLadaCasa(String cliNumLadaCasa) {
        this.cliNumLadaCasa = cliNumLadaCasa;
    }

    public String getCliNumLadaCasa() {
        return this.cliNumLadaCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumTelefCasa(String cliNumTelefCasa) {
        this.cliNumTelefCasa = cliNumTelefCasa;
    }

    public String getCliNumTelefCasa() {
        return this.cliNumTelefCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumLadaOfic(String cliNumLadaOfic) {
        this.cliNumLadaOfic = cliNumLadaOfic;
    }

    public String getCliNumLadaOfic() {
        return this.cliNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumTelefOfic(String cliNumTelefOfic) {
        this.cliNumTelefOfic = cliNumTelefOfic;
    }

    public String getCliNumTelefOfic() {
        return this.cliNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumExtOfic(String cliNumExtOfic) {
        this.cliNumExtOfic = cliNumExtOfic;
    }

    public String getCliNumExtOfic() {
        return this.cliNumExtOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumLadaFax(String cliNumLadaFax) {
        this.cliNumLadaFax = cliNumLadaFax;
    }

    public String getCliNumLadaFax() {
        return this.cliNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumTelefFax(String cliNumTelefFax) {
        this.cliNumTelefFax = cliNumTelefFax;
    }

    public String getCliNumTelefFax() {
        return this.cliNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumExtFax(String cliNumExtFax) {
        this.cliNumExtFax = cliNumExtFax;
    }

    public String getCliNumExtFax() {
        return this.cliNumExtFax;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCliAnoAltaReg(BigDecimal cliAnoAltaReg) {
        this.cliAnoAltaReg = cliAnoAltaReg;
    }

    public BigDecimal getCliAnoAltaReg() {
        return this.cliAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCliMesAltaReg(BigDecimal cliMesAltaReg) {
        this.cliMesAltaReg = cliMesAltaReg;
    }

    public BigDecimal getCliMesAltaReg() {
        return this.cliMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCliDiaAltaReg(BigDecimal cliDiaAltaReg) {
        this.cliDiaAltaReg = cliDiaAltaReg;
    }

    public BigDecimal getCliDiaAltaReg() {
        return this.cliDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCliAnoUltMod(BigDecimal cliAnoUltMod) {
        this.cliAnoUltMod = cliAnoUltMod;
    }

    public BigDecimal getCliAnoUltMod() {
        return this.cliAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCliMesUltMod(BigDecimal cliMesUltMod) {
        this.cliMesUltMod = cliMesUltMod;
    }

    public BigDecimal getCliMesUltMod() {
        return this.cliMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCliDiaUltMod(BigDecimal cliDiaUltMod) {
        this.cliDiaUltMod = cliDiaUltMod;
    }

    public BigDecimal getCliDiaUltMod() {
        return this.cliDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliCveStCliente(String cliCveStCliente) {
        this.cliCveStCliente = cliCveStCliente;
    }

    public String getCliCveStCliente() {
        return this.cliCveStCliente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliCveTipoCli(String cliCveTipoCli) {
        this.cliCveTipoCli = cliCveTipoCli;
    }

    public String getCliCveTipoCli() {
        return this.cliCveTipoCli;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CLIENTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCliNumCliente() != null && this.getCliNumCliente().longValue() == -999) {
            conditions += " AND CLI_NUM_CLIENTE IS NULL";
        } else if (this.getCliNumCliente() != null) {
            conditions += " AND CLI_NUM_CLIENTE = ?";
            values.add(this.getCliNumCliente());
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
        String sql = "SELECT * FROM CLIENTES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCliNumCliente() != null && this.getCliNumCliente().longValue() == -999) {
            conditions += " AND CLI_NUM_CLIENTE IS NULL";
        } else if (this.getCliNumCliente() != null) {
            conditions += " AND CLI_NUM_CLIENTE = ?";
            values.add(this.getCliNumCliente());
        }

        if (this.getCliNomCliente() != null && "null".equals(this.getCliNomCliente())) {
            conditions += " AND CLI_NOM_CLIENTE IS NULL";
        } else if (this.getCliNomCliente() != null) {
            conditions += " AND CLI_NOM_CLIENTE = ?";
            values.add(this.getCliNomCliente());
        }

        if (this.getCliRfc() != null && "null".equals(this.getCliRfc())) {
            conditions += " AND CLI_RFC IS NULL";
        } else if (this.getCliRfc() != null) {
            conditions += " AND CLI_RFC = ?";
            values.add(this.getCliRfc());
        }

        if (this.getCliFecNacimiento() != null && "null".equals(this.getCliFecNacimiento())) {
            conditions += " AND CLI_FEC_NACIMIENTO IS NULL";
        } else if (this.getCliFecNacimiento() != null) {
            conditions += " AND CLI_FEC_NACIMIENTO = ?";
            values.add(this.getCliFecNacimiento());
        }

        if (this.getCliCveTipoPer() != null && "null".equals(this.getCliCveTipoPer())) {
            conditions += " AND CLI_CVE_TIPO_PER IS NULL";
        } else if (this.getCliCveTipoPer() != null) {
            conditions += " AND CLI_CVE_TIPO_PER = ?";
            values.add(this.getCliCveTipoPer());
        }

        if (this.getCliNomRepres() != null && "null".equals(this.getCliNomRepres())) {
            conditions += " AND CLI_NOM_REPRES IS NULL";
        } else if (this.getCliNomRepres() != null) {
            conditions += " AND CLI_NOM_REPRES = ?";
            values.add(this.getCliNomRepres());
        }

        if (this.getCliNumNacional() != null && this.getCliNumNacional().longValue() == -999) {
            conditions += " AND CLI_NUM_NACIONAL IS NULL";
        } else if (this.getCliNumNacional() != null) {
            conditions += " AND CLI_NUM_NACIONAL = ?";
            values.add(this.getCliNumNacional());
        }

        if (this.getCliNomNacional() != null && "null".equals(this.getCliNomNacional())) {
            conditions += " AND CLI_NOM_NACIONAL IS NULL";
        } else if (this.getCliNomNacional() != null) {
            conditions += " AND CLI_NOM_NACIONAL = ?";
            values.add(this.getCliNomNacional());
        }

        if (this.getCliCalleNum() != null && "null".equals(this.getCliCalleNum())) {
            conditions += " AND CLI_CALLE_NUM IS NULL";
        } else if (this.getCliCalleNum() != null) {
            conditions += " AND CLI_CALLE_NUM = ?";
            values.add(this.getCliCalleNum());
        }

        if (this.getCliNomColonia() != null && "null".equals(this.getCliNomColonia())) {
            conditions += " AND CLI_NOM_COLONIA IS NULL";
        } else if (this.getCliNomColonia() != null) {
            conditions += " AND CLI_NOM_COLONIA = ?";
            values.add(this.getCliNomColonia());
        }

        if (this.getCliNomPoblacion() != null && "null".equals(this.getCliNomPoblacion())) {
            conditions += " AND CLI_NOM_POBLACION IS NULL";
        } else if (this.getCliNomPoblacion() != null) {
            conditions += " AND CLI_NOM_POBLACION = ?";
            values.add(this.getCliNomPoblacion());
        }

        if (this.getCliCodigoPostal() != null && this.getCliCodigoPostal().longValue() == -999) {
            conditions += " AND CLI_CODIGO_POSTAL IS NULL";
        } else if (this.getCliCodigoPostal() != null) {
            conditions += " AND CLI_CODIGO_POSTAL = ?";
            values.add(this.getCliCodigoPostal());
        }

        if (this.getCliNumEstado() != null && this.getCliNumEstado().longValue() == -999) {
            conditions += " AND CLI_NUM_ESTADO IS NULL";
        } else if (this.getCliNumEstado() != null) {
            conditions += " AND CLI_NUM_ESTADO = ?";
            values.add(this.getCliNumEstado());
        }

        if (this.getCliNomEstado() != null && "null".equals(this.getCliNomEstado())) {
            conditions += " AND CLI_NOM_ESTADO IS NULL";
        } else if (this.getCliNomEstado() != null) {
            conditions += " AND CLI_NOM_ESTADO = ?";
            values.add(this.getCliNomEstado());
        }

        if (this.getCliNumPais() != null && this.getCliNumPais().longValue() == -999) {
            conditions += " AND CLI_NUM_PAIS IS NULL";
        } else if (this.getCliNumPais() != null) {
            conditions += " AND CLI_NUM_PAIS = ?";
            values.add(this.getCliNumPais());
        }

        if (this.getCliNomPais() != null && "null".equals(this.getCliNomPais())) {
            conditions += " AND CLI_NOM_PAIS IS NULL";
        } else if (this.getCliNomPais() != null) {
            conditions += " AND CLI_NOM_PAIS = ?";
            values.add(this.getCliNomPais());
        }

        if (this.getCliNumLadaCasa() != null && "null".equals(this.getCliNumLadaCasa())) {
            conditions += " AND CLI_NUM_LADA_CASA IS NULL";
        } else if (this.getCliNumLadaCasa() != null) {
            conditions += " AND CLI_NUM_LADA_CASA = ?";
            values.add(this.getCliNumLadaCasa());
        }

        if (this.getCliNumTelefCasa() != null && "null".equals(this.getCliNumTelefCasa())) {
            conditions += " AND CLI_NUM_TELEF_CASA IS NULL";
        } else if (this.getCliNumTelefCasa() != null) {
            conditions += " AND CLI_NUM_TELEF_CASA = ?";
            values.add(this.getCliNumTelefCasa());
        }

        if (this.getCliNumLadaOfic() != null && "null".equals(this.getCliNumLadaOfic())) {
            conditions += " AND CLI_NUM_LADA_OFIC IS NULL";
        } else if (this.getCliNumLadaOfic() != null) {
            conditions += " AND CLI_NUM_LADA_OFIC = ?";
            values.add(this.getCliNumLadaOfic());
        }

        if (this.getCliNumTelefOfic() != null && "null".equals(this.getCliNumTelefOfic())) {
            conditions += " AND CLI_NUM_TELEF_OFIC IS NULL";
        } else if (this.getCliNumTelefOfic() != null) {
            conditions += " AND CLI_NUM_TELEF_OFIC = ?";
            values.add(this.getCliNumTelefOfic());
        }

        if (this.getCliNumExtOfic() != null && "null".equals(this.getCliNumExtOfic())) {
            conditions += " AND CLI_NUM_EXT_OFIC IS NULL";
        } else if (this.getCliNumExtOfic() != null) {
            conditions += " AND CLI_NUM_EXT_OFIC = ?";
            values.add(this.getCliNumExtOfic());
        }

        if (this.getCliNumLadaFax() != null && "null".equals(this.getCliNumLadaFax())) {
            conditions += " AND CLI_NUM_LADA_FAX IS NULL";
        } else if (this.getCliNumLadaFax() != null) {
            conditions += " AND CLI_NUM_LADA_FAX = ?";
            values.add(this.getCliNumLadaFax());
        }

        if (this.getCliNumTelefFax() != null && "null".equals(this.getCliNumTelefFax())) {
            conditions += " AND CLI_NUM_TELEF_FAX IS NULL";
        } else if (this.getCliNumTelefFax() != null) {
            conditions += " AND CLI_NUM_TELEF_FAX = ?";
            values.add(this.getCliNumTelefFax());
        }

        if (this.getCliNumExtFax() != null && "null".equals(this.getCliNumExtFax())) {
            conditions += " AND CLI_NUM_EXT_FAX IS NULL";
        } else if (this.getCliNumExtFax() != null) {
            conditions += " AND CLI_NUM_EXT_FAX = ?";
            values.add(this.getCliNumExtFax());
        }

        if (this.getCliAnoAltaReg() != null && this.getCliAnoAltaReg().longValue() == -999) {
            conditions += " AND CLI_ANO_ALTA_REG IS NULL";
        } else if (this.getCliAnoAltaReg() != null) {
            conditions += " AND CLI_ANO_ALTA_REG = ?";
            values.add(this.getCliAnoAltaReg());
        }

        if (this.getCliMesAltaReg() != null && this.getCliMesAltaReg().longValue() == -999) {
            conditions += " AND CLI_MES_ALTA_REG IS NULL";
        } else if (this.getCliMesAltaReg() != null) {
            conditions += " AND CLI_MES_ALTA_REG = ?";
            values.add(this.getCliMesAltaReg());
        }

        if (this.getCliDiaAltaReg() != null && this.getCliDiaAltaReg().longValue() == -999) {
            conditions += " AND CLI_DIA_ALTA_REG IS NULL";
        } else if (this.getCliDiaAltaReg() != null) {
            conditions += " AND CLI_DIA_ALTA_REG = ?";
            values.add(this.getCliDiaAltaReg());
        }

        if (this.getCliAnoUltMod() != null && this.getCliAnoUltMod().longValue() == -999) {
            conditions += " AND CLI_ANO_ULT_MOD IS NULL";
        } else if (this.getCliAnoUltMod() != null) {
            conditions += " AND CLI_ANO_ULT_MOD = ?";
            values.add(this.getCliAnoUltMod());
        }

        if (this.getCliMesUltMod() != null && this.getCliMesUltMod().longValue() == -999) {
            conditions += " AND CLI_MES_ULT_MOD IS NULL";
        } else if (this.getCliMesUltMod() != null) {
            conditions += " AND CLI_MES_ULT_MOD = ?";
            values.add(this.getCliMesUltMod());
        }

        if (this.getCliDiaUltMod() != null && this.getCliDiaUltMod().longValue() == -999) {
            conditions += " AND CLI_DIA_ULT_MOD IS NULL";
        } else if (this.getCliDiaUltMod() != null) {
            conditions += " AND CLI_DIA_ULT_MOD = ?";
            values.add(this.getCliDiaUltMod());
        }

        if (this.getCliCveStCliente() != null && "null".equals(this.getCliCveStCliente())) {
            conditions += " AND CLI_CVE_ST_CLIENTE IS NULL";
        } else if (this.getCliCveStCliente() != null) {
            conditions += " AND CLI_CVE_ST_CLIENTE = ?";
            values.add(this.getCliCveStCliente());
        }

        if (this.getCliCveTipoCli() != null && "null".equals(this.getCliCveTipoCli())) {
            conditions += " AND CLI_CVE_TIPO_CLI IS NULL";
        } else if (this.getCliCveTipoCli() != null) {
            conditions += " AND CLI_CVE_TIPO_CLI = ?";
            values.add(this.getCliCveTipoCli());
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
        String sql = "UPDATE CLIENTES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CLI_NUM_CLIENTE = ?";
        pkValues.add(this.getCliNumCliente());
        fields += " CLI_NOM_CLIENTE = ?, ";
        values.add(this.getCliNomCliente());
        fields += " CLI_RFC = ?, ";
        values.add(this.getCliRfc());
        fields += " CLI_FEC_NACIMIENTO = ?, ";
        values.add(this.getCliFecNacimiento());
        fields += " CLI_CVE_TIPO_PER = ?, ";
        values.add(this.getCliCveTipoPer());
        fields += " CLI_NOM_REPRES = ?, ";
        values.add(this.getCliNomRepres());
        fields += " CLI_NUM_NACIONAL = ?, ";
        values.add(this.getCliNumNacional());
        fields += " CLI_NOM_NACIONAL = ?, ";
        values.add(this.getCliNomNacional());
        fields += " CLI_CALLE_NUM = ?, ";
        values.add(this.getCliCalleNum());
        fields += " CLI_NOM_COLONIA = ?, ";
        values.add(this.getCliNomColonia());
        fields += " CLI_NOM_POBLACION = ?, ";
        values.add(this.getCliNomPoblacion());
        fields += " CLI_CODIGO_POSTAL = ?, ";
        values.add(this.getCliCodigoPostal());
        fields += " CLI_NUM_ESTADO = ?, ";
        values.add(this.getCliNumEstado());
        fields += " CLI_NOM_ESTADO = ?, ";
        values.add(this.getCliNomEstado());
        fields += " CLI_NUM_PAIS = ?, ";
        values.add(this.getCliNumPais());
        fields += " CLI_NOM_PAIS = ?, ";
        values.add(this.getCliNomPais());
        fields += " CLI_NUM_LADA_CASA = ?, ";
        values.add(this.getCliNumLadaCasa());
        fields += " CLI_NUM_TELEF_CASA = ?, ";
        values.add(this.getCliNumTelefCasa());
        fields += " CLI_NUM_LADA_OFIC = ?, ";
        values.add(this.getCliNumLadaOfic());
        fields += " CLI_NUM_TELEF_OFIC = ?, ";
        values.add(this.getCliNumTelefOfic());
        fields += " CLI_NUM_EXT_OFIC = ?, ";
        values.add(this.getCliNumExtOfic());
        fields += " CLI_NUM_LADA_FAX = ?, ";
        values.add(this.getCliNumLadaFax());
        fields += " CLI_NUM_TELEF_FAX = ?, ";
        values.add(this.getCliNumTelefFax());
        fields += " CLI_NUM_EXT_FAX = ?, ";
        values.add(this.getCliNumExtFax());
        fields += " CLI_ANO_ALTA_REG = ?, ";
        values.add(this.getCliAnoAltaReg());
        fields += " CLI_MES_ALTA_REG = ?, ";
        values.add(this.getCliMesAltaReg());
        fields += " CLI_DIA_ALTA_REG = ?, ";
        values.add(this.getCliDiaAltaReg());
        fields += " CLI_ANO_ULT_MOD = ?, ";
        values.add(this.getCliAnoUltMod());
        fields += " CLI_MES_ULT_MOD = ?, ";
        values.add(this.getCliMesUltMod());
        fields += " CLI_DIA_ULT_MOD = ?, ";
        values.add(this.getCliDiaUltMod());
        fields += " CLI_CVE_ST_CLIENTE = ?, ";
        values.add(this.getCliCveStCliente());
        fields += " CLI_CVE_TIPO_CLI = ?, ";
        values.add(this.getCliCveTipoCli());
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
        String sql = "INSERT INTO CLIENTES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CLI_NUM_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCliNumCliente());

        fields += ", CLI_NOM_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCliNomCliente());

        fields += ", CLI_RFC";
        fieldValues += ", ?";
        values.add(this.getCliRfc());

        fields += ", CLI_FEC_NACIMIENTO";
        fieldValues += ", ?";
        values.add(this.getCliFecNacimiento());

        fields += ", CLI_CVE_TIPO_PER";
        fieldValues += ", ?";
        values.add(this.getCliCveTipoPer());

        fields += ", CLI_NOM_REPRES";
        fieldValues += ", ?";
        values.add(this.getCliNomRepres());

        fields += ", CLI_NUM_NACIONAL";
        fieldValues += ", ?";
        values.add(this.getCliNumNacional());

        fields += ", CLI_NOM_NACIONAL";
        fieldValues += ", ?";
        values.add(this.getCliNomNacional());

        fields += ", CLI_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getCliCalleNum());

        fields += ", CLI_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getCliNomColonia());

        fields += ", CLI_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getCliNomPoblacion());

        fields += ", CLI_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getCliCodigoPostal());

        fields += ", CLI_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getCliNumEstado());

        fields += ", CLI_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getCliNomEstado());

        fields += ", CLI_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getCliNumPais());

        fields += ", CLI_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getCliNomPais());

        fields += ", CLI_NUM_LADA_CASA";
        fieldValues += ", ?";
        values.add(this.getCliNumLadaCasa());

        fields += ", CLI_NUM_TELEF_CASA";
        fieldValues += ", ?";
        values.add(this.getCliNumTelefCasa());

        fields += ", CLI_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getCliNumLadaOfic());

        fields += ", CLI_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getCliNumTelefOfic());

        fields += ", CLI_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getCliNumExtOfic());

        fields += ", CLI_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getCliNumLadaFax());

        fields += ", CLI_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getCliNumTelefFax());

        fields += ", CLI_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getCliNumExtFax());

        fields += ", CLI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCliAnoAltaReg());

        fields += ", CLI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCliMesAltaReg());

        fields += ", CLI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCliDiaAltaReg());

        fields += ", CLI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCliAnoUltMod());

        fields += ", CLI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCliMesUltMod());

        fields += ", CLI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCliDiaUltMod());

        fields += ", CLI_CVE_ST_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCliCveStCliente());

        fields += ", CLI_CVE_TIPO_CLI";
        fieldValues += ", ?";
        values.add(this.getCliCveTipoCli());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CLIENTES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CLI_NUM_CLIENTE = ?";
        values.add(this.getCliNumCliente());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Clientes instance = (Clientes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCliNumCliente().equals(instance.getCliNumCliente()))
            equalObjects = false;
        if (equalObjects && !this.getCliNomCliente().equals(instance.getCliNomCliente()))
            equalObjects = false;
        if (equalObjects && !this.getCliRfc().equals(instance.getCliRfc()))
            equalObjects = false;
        if (equalObjects && !this.getCliFecNacimiento().equals(instance.getCliFecNacimiento()))
            equalObjects = false;
        if (equalObjects && !this.getCliCveTipoPer().equals(instance.getCliCveTipoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCliNomRepres().equals(instance.getCliNomRepres()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumNacional().equals(instance.getCliNumNacional()))
            equalObjects = false;
        if (equalObjects && !this.getCliNomNacional().equals(instance.getCliNomNacional()))
            equalObjects = false;
        if (equalObjects && !this.getCliCalleNum().equals(instance.getCliCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getCliNomColonia().equals(instance.getCliNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getCliNomPoblacion().equals(instance.getCliNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getCliCodigoPostal().equals(instance.getCliCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumEstado().equals(instance.getCliNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getCliNomEstado().equals(instance.getCliNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumPais().equals(instance.getCliNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getCliNomPais().equals(instance.getCliNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumLadaCasa().equals(instance.getCliNumLadaCasa()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumTelefCasa().equals(instance.getCliNumTelefCasa()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumLadaOfic().equals(instance.getCliNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumTelefOfic().equals(instance.getCliNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumExtOfic().equals(instance.getCliNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumLadaFax().equals(instance.getCliNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumTelefFax().equals(instance.getCliNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumExtFax().equals(instance.getCliNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getCliAnoAltaReg().equals(instance.getCliAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCliMesAltaReg().equals(instance.getCliMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCliDiaAltaReg().equals(instance.getCliDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCliAnoUltMod().equals(instance.getCliAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCliMesUltMod().equals(instance.getCliMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCliDiaUltMod().equals(instance.getCliDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCliCveStCliente().equals(instance.getCliCveStCliente()))
            equalObjects = false;
        if (equalObjects && !this.getCliCveTipoCli().equals(instance.getCliCveTipoCli()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Clientes result = new Clientes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCliNumCliente((BigDecimal) objectData.getData("CLI_NUM_CLIENTE"));
        result.setCliNomCliente((String) objectData.getData("CLI_NOM_CLIENTE"));
        result.setCliRfc((String) objectData.getData("CLI_RFC"));
        result.setCliFecNacimiento((String) objectData.getData("CLI_FEC_NACIMIENTO"));
        result.setCliCveTipoPer((String) objectData.getData("CLI_CVE_TIPO_PER"));
        result.setCliNomRepres((String) objectData.getData("CLI_NOM_REPRES"));
        result.setCliNumNacional((BigDecimal) objectData.getData("CLI_NUM_NACIONAL"));
        result.setCliNomNacional((String) objectData.getData("CLI_NOM_NACIONAL"));
        result.setCliCalleNum((String) objectData.getData("CLI_CALLE_NUM"));
        result.setCliNomColonia((String) objectData.getData("CLI_NOM_COLONIA"));
        result.setCliNomPoblacion((String) objectData.getData("CLI_NOM_POBLACION"));
        result.setCliCodigoPostal((BigDecimal) objectData.getData("CLI_CODIGO_POSTAL"));
        result.setCliNumEstado((BigDecimal) objectData.getData("CLI_NUM_ESTADO"));
        result.setCliNomEstado((String) objectData.getData("CLI_NOM_ESTADO"));
        result.setCliNumPais((BigDecimal) objectData.getData("CLI_NUM_PAIS"));
        result.setCliNomPais((String) objectData.getData("CLI_NOM_PAIS"));
        result.setCliNumLadaCasa((String) objectData.getData("CLI_NUM_LADA_CASA"));
        result.setCliNumTelefCasa((String) objectData.getData("CLI_NUM_TELEF_CASA"));
        result.setCliNumLadaOfic((String) objectData.getData("CLI_NUM_LADA_OFIC"));
        result.setCliNumTelefOfic((String) objectData.getData("CLI_NUM_TELEF_OFIC"));
        result.setCliNumExtOfic((String) objectData.getData("CLI_NUM_EXT_OFIC"));
        result.setCliNumLadaFax((String) objectData.getData("CLI_NUM_LADA_FAX"));
        result.setCliNumTelefFax((String) objectData.getData("CLI_NUM_TELEF_FAX"));
        result.setCliNumExtFax((String) objectData.getData("CLI_NUM_EXT_FAX"));
        result.setCliAnoAltaReg((BigDecimal) objectData.getData("CLI_ANO_ALTA_REG"));
        result.setCliMesAltaReg((BigDecimal) objectData.getData("CLI_MES_ALTA_REG"));
        result.setCliDiaAltaReg((BigDecimal) objectData.getData("CLI_DIA_ALTA_REG"));
        result.setCliAnoUltMod((BigDecimal) objectData.getData("CLI_ANO_ULT_MOD"));
        result.setCliMesUltMod((BigDecimal) objectData.getData("CLI_MES_ULT_MOD"));
        result.setCliDiaUltMod((BigDecimal) objectData.getData("CLI_DIA_ULT_MOD"));
        result.setCliCveStCliente((String) objectData.getData("CLI_CVE_ST_CLIENTE"));
        result.setCliCveTipoCli((String) objectData.getData("CLI_CVE_TIPO_CLI"));

        return result;

    }

}
