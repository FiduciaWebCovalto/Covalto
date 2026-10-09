package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARTICIP_PK", columns = { "PFA_NUM_CONTRATO", "PFA_NUM_DEPTO", "PFA_NUM_PARTICIP" }, sequences = { "MANUAL" })
public class Particip extends DomainObject {

    BigDecimal pfaNumContrato = null;
    BigDecimal pfaNumDepto = null;
    BigDecimal pfaNumParticip = null;
    String pfaNomParticip = null;
    String pfaRfcParticip = null;
    String pfaCveSexo = null;
    String pfaCveAbonoCta = null;
    String pfaCalleNum = null;
    String pfaNomColonia = null;
    String pfaNomPoblacion = null;
    BigDecimal pfaCodigoPostal = null;
    BigDecimal pfaNumEstado = null;
    String pfaNomEstado = null;
    BigDecimal pfaNumPais = null;
    String pfaNomPais = null;
    String pfaNumLadaCasa = null;
    String pfaNumTelefCasa = null;
    String pfaNumLadaOfic = null;
    String pfaNumTelefOfic = null;
    String pfaNumExtOfic = null;
    BigDecimal pfaAnoIngreso = null;
    BigDecimal pfaMesIngreso = null;
    BigDecimal pfaDiaIngreso = null;
    BigDecimal pfaAnoBaja = null;
    BigDecimal pfaMesBaja = null;
    BigDecimal pfaDiaBaja = null;
    BigDecimal pfaAnoReingreso = null;
    BigDecimal pfaMesReingreso = null;
    BigDecimal pfaDiaReingreso = null;
    BigDecimal pfaAnoAltaReg = null;
    BigDecimal pfaMesAltaReg = null;
    BigDecimal pfaDiaAltaReg = null;
    BigDecimal pfaAnoUltMod = null;
    BigDecimal pfaMesUltMod = null;
    BigDecimal pfaDiaUltMod = null;
    String pfaCveStPartici = null;

    public Particip() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfaNumContrato(BigDecimal pfaNumContrato) {
        this.pfaNumContrato = pfaNumContrato;
    }

    public BigDecimal getPfaNumContrato() {
        return this.pfaNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfaNumDepto(BigDecimal pfaNumDepto) {
        this.pfaNumDepto = pfaNumDepto;
    }

    public BigDecimal getPfaNumDepto() {
        return this.pfaNumDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfaNumParticip(BigDecimal pfaNumParticip) {
        this.pfaNumParticip = pfaNumParticip;
    }

    public BigDecimal getPfaNumParticip() {
        return this.pfaNumParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNomParticip(String pfaNomParticip) {
        this.pfaNomParticip = pfaNomParticip;
    }

    public String getPfaNomParticip() {
        return this.pfaNomParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaRfcParticip(String pfaRfcParticip) {
        this.pfaRfcParticip = pfaRfcParticip;
    }

    public String getPfaRfcParticip() {
        return this.pfaRfcParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaCveSexo(String pfaCveSexo) {
        this.pfaCveSexo = pfaCveSexo;
    }

    public String getPfaCveSexo() {
        return this.pfaCveSexo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaCveAbonoCta(String pfaCveAbonoCta) {
        this.pfaCveAbonoCta = pfaCveAbonoCta;
    }

    public String getPfaCveAbonoCta() {
        return this.pfaCveAbonoCta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaCalleNum(String pfaCalleNum) {
        this.pfaCalleNum = pfaCalleNum;
    }

    public String getPfaCalleNum() {
        return this.pfaCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNomColonia(String pfaNomColonia) {
        this.pfaNomColonia = pfaNomColonia;
    }

    public String getPfaNomColonia() {
        return this.pfaNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNomPoblacion(String pfaNomPoblacion) {
        this.pfaNomPoblacion = pfaNomPoblacion;
    }

    public String getPfaNomPoblacion() {
        return this.pfaNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfaCodigoPostal(BigDecimal pfaCodigoPostal) {
        this.pfaCodigoPostal = pfaCodigoPostal;
    }

    public BigDecimal getPfaCodigoPostal() {
        return this.pfaCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfaNumEstado(BigDecimal pfaNumEstado) {
        this.pfaNumEstado = pfaNumEstado;
    }

    public BigDecimal getPfaNumEstado() {
        return this.pfaNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNomEstado(String pfaNomEstado) {
        this.pfaNomEstado = pfaNomEstado;
    }

    public String getPfaNomEstado() {
        return this.pfaNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfaNumPais(BigDecimal pfaNumPais) {
        this.pfaNumPais = pfaNumPais;
    }

    public BigDecimal getPfaNumPais() {
        return this.pfaNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNomPais(String pfaNomPais) {
        this.pfaNomPais = pfaNomPais;
    }

    public String getPfaNomPais() {
        return this.pfaNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNumLadaCasa(String pfaNumLadaCasa) {
        this.pfaNumLadaCasa = pfaNumLadaCasa;
    }

    public String getPfaNumLadaCasa() {
        return this.pfaNumLadaCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNumTelefCasa(String pfaNumTelefCasa) {
        this.pfaNumTelefCasa = pfaNumTelefCasa;
    }

    public String getPfaNumTelefCasa() {
        return this.pfaNumTelefCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNumLadaOfic(String pfaNumLadaOfic) {
        this.pfaNumLadaOfic = pfaNumLadaOfic;
    }

    public String getPfaNumLadaOfic() {
        return this.pfaNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNumTelefOfic(String pfaNumTelefOfic) {
        this.pfaNumTelefOfic = pfaNumTelefOfic;
    }

    public String getPfaNumTelefOfic() {
        return this.pfaNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaNumExtOfic(String pfaNumExtOfic) {
        this.pfaNumExtOfic = pfaNumExtOfic;
    }

    public String getPfaNumExtOfic() {
        return this.pfaNumExtOfic;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPfaAnoIngreso(BigDecimal pfaAnoIngreso) {
        this.pfaAnoIngreso = pfaAnoIngreso;
    }

    public BigDecimal getPfaAnoIngreso() {
        return this.pfaAnoIngreso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaMesIngreso(BigDecimal pfaMesIngreso) {
        this.pfaMesIngreso = pfaMesIngreso;
    }

    public BigDecimal getPfaMesIngreso() {
        return this.pfaMesIngreso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaDiaIngreso(BigDecimal pfaDiaIngreso) {
        this.pfaDiaIngreso = pfaDiaIngreso;
    }

    public BigDecimal getPfaDiaIngreso() {
        return this.pfaDiaIngreso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPfaAnoBaja(BigDecimal pfaAnoBaja) {
        this.pfaAnoBaja = pfaAnoBaja;
    }

    public BigDecimal getPfaAnoBaja() {
        return this.pfaAnoBaja;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaMesBaja(BigDecimal pfaMesBaja) {
        this.pfaMesBaja = pfaMesBaja;
    }

    public BigDecimal getPfaMesBaja() {
        return this.pfaMesBaja;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaDiaBaja(BigDecimal pfaDiaBaja) {
        this.pfaDiaBaja = pfaDiaBaja;
    }

    public BigDecimal getPfaDiaBaja() {
        return this.pfaDiaBaja;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPfaAnoReingreso(BigDecimal pfaAnoReingreso) {
        this.pfaAnoReingreso = pfaAnoReingreso;
    }

    public BigDecimal getPfaAnoReingreso() {
        return this.pfaAnoReingreso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaMesReingreso(BigDecimal pfaMesReingreso) {
        this.pfaMesReingreso = pfaMesReingreso;
    }

    public BigDecimal getPfaMesReingreso() {
        return this.pfaMesReingreso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaDiaReingreso(BigDecimal pfaDiaReingreso) {
        this.pfaDiaReingreso = pfaDiaReingreso;
    }

    public BigDecimal getPfaDiaReingreso() {
        return this.pfaDiaReingreso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPfaAnoAltaReg(BigDecimal pfaAnoAltaReg) {
        this.pfaAnoAltaReg = pfaAnoAltaReg;
    }

    public BigDecimal getPfaAnoAltaReg() {
        return this.pfaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaMesAltaReg(BigDecimal pfaMesAltaReg) {
        this.pfaMesAltaReg = pfaMesAltaReg;
    }

    public BigDecimal getPfaMesAltaReg() {
        return this.pfaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaDiaAltaReg(BigDecimal pfaDiaAltaReg) {
        this.pfaDiaAltaReg = pfaDiaAltaReg;
    }

    public BigDecimal getPfaDiaAltaReg() {
        return this.pfaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPfaAnoUltMod(BigDecimal pfaAnoUltMod) {
        this.pfaAnoUltMod = pfaAnoUltMod;
    }

    public BigDecimal getPfaAnoUltMod() {
        return this.pfaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaMesUltMod(BigDecimal pfaMesUltMod) {
        this.pfaMesUltMod = pfaMesUltMod;
    }

    public BigDecimal getPfaMesUltMod() {
        return this.pfaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfaDiaUltMod(BigDecimal pfaDiaUltMod) {
        this.pfaDiaUltMod = pfaDiaUltMod;
    }

    public BigDecimal getPfaDiaUltMod() {
        return this.pfaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfaCveStPartici(String pfaCveStPartici) {
        this.pfaCveStPartici = pfaCveStPartici;
    }

    public String getPfaCveStPartici() {
        return this.pfaCveStPartici;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARTICIP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPfaNumContrato() != null && this.getPfaNumContrato().longValue() == -999) {
            conditions += " AND PFA_NUM_CONTRATO IS NULL";
        } else if (this.getPfaNumContrato() != null) {
            conditions += " AND PFA_NUM_CONTRATO = ?";
            values.add(this.getPfaNumContrato());
        }

        if (this.getPfaNumDepto() != null && this.getPfaNumDepto().longValue() == -999) {
            conditions += " AND PFA_NUM_DEPTO IS NULL";
        } else if (this.getPfaNumDepto() != null) {
            conditions += " AND PFA_NUM_DEPTO = ?";
            values.add(this.getPfaNumDepto());
        }

        if (this.getPfaNumParticip() != null && this.getPfaNumParticip().longValue() == -999) {
            conditions += " AND PFA_NUM_PARTICIP IS NULL";
        } else if (this.getPfaNumParticip() != null) {
            conditions += " AND PFA_NUM_PARTICIP = ?";
            values.add(this.getPfaNumParticip());
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
        String sql = "SELECT * FROM PARTICIP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPfaNumContrato() != null && this.getPfaNumContrato().longValue() == -999) {
            conditions += " AND PFA_NUM_CONTRATO IS NULL";
        } else if (this.getPfaNumContrato() != null) {
            conditions += " AND PFA_NUM_CONTRATO = ?";
            values.add(this.getPfaNumContrato());
        }

        if (this.getPfaNumDepto() != null && this.getPfaNumDepto().longValue() == -999) {
            conditions += " AND PFA_NUM_DEPTO IS NULL";
        } else if (this.getPfaNumDepto() != null) {
            conditions += " AND PFA_NUM_DEPTO = ?";
            values.add(this.getPfaNumDepto());
        }

        if (this.getPfaNumParticip() != null && this.getPfaNumParticip().longValue() == -999) {
            conditions += " AND PFA_NUM_PARTICIP IS NULL";
        } else if (this.getPfaNumParticip() != null) {
            conditions += " AND PFA_NUM_PARTICIP = ?";
            values.add(this.getPfaNumParticip());
        }

        if (this.getPfaNomParticip() != null && "null".equals(this.getPfaNomParticip())) {
            conditions += " AND PFA_NOM_PARTICIP IS NULL";
        } else if (this.getPfaNomParticip() != null) {
            conditions += " AND PFA_NOM_PARTICIP = ?";
            values.add(this.getPfaNomParticip());
        }

        if (this.getPfaRfcParticip() != null && "null".equals(this.getPfaRfcParticip())) {
            conditions += " AND PFA_RFC_PARTICIP IS NULL";
        } else if (this.getPfaRfcParticip() != null) {
            conditions += " AND PFA_RFC_PARTICIP = ?";
            values.add(this.getPfaRfcParticip());
        }

        if (this.getPfaCveSexo() != null && "null".equals(this.getPfaCveSexo())) {
            conditions += " AND PFA_CVE_SEXO IS NULL";
        } else if (this.getPfaCveSexo() != null) {
            conditions += " AND PFA_CVE_SEXO = ?";
            values.add(this.getPfaCveSexo());
        }

        if (this.getPfaCveAbonoCta() != null && "null".equals(this.getPfaCveAbonoCta())) {
            conditions += " AND PFA_CVE_ABONO_CTA IS NULL";
        } else if (this.getPfaCveAbonoCta() != null) {
            conditions += " AND PFA_CVE_ABONO_CTA = ?";
            values.add(this.getPfaCveAbonoCta());
        }

        if (this.getPfaCalleNum() != null && "null".equals(this.getPfaCalleNum())) {
            conditions += " AND PFA_CALLE_NUM IS NULL";
        } else if (this.getPfaCalleNum() != null) {
            conditions += " AND PFA_CALLE_NUM = ?";
            values.add(this.getPfaCalleNum());
        }

        if (this.getPfaNomColonia() != null && "null".equals(this.getPfaNomColonia())) {
            conditions += " AND PFA_NOM_COLONIA IS NULL";
        } else if (this.getPfaNomColonia() != null) {
            conditions += " AND PFA_NOM_COLONIA = ?";
            values.add(this.getPfaNomColonia());
        }

        if (this.getPfaNomPoblacion() != null && "null".equals(this.getPfaNomPoblacion())) {
            conditions += " AND PFA_NOM_POBLACION IS NULL";
        } else if (this.getPfaNomPoblacion() != null) {
            conditions += " AND PFA_NOM_POBLACION = ?";
            values.add(this.getPfaNomPoblacion());
        }

        if (this.getPfaCodigoPostal() != null && this.getPfaCodigoPostal().longValue() == -999) {
            conditions += " AND PFA_CODIGO_POSTAL IS NULL";
        } else if (this.getPfaCodigoPostal() != null) {
            conditions += " AND PFA_CODIGO_POSTAL = ?";
            values.add(this.getPfaCodigoPostal());
        }

        if (this.getPfaNumEstado() != null && this.getPfaNumEstado().longValue() == -999) {
            conditions += " AND PFA_NUM_ESTADO IS NULL";
        } else if (this.getPfaNumEstado() != null) {
            conditions += " AND PFA_NUM_ESTADO = ?";
            values.add(this.getPfaNumEstado());
        }

        if (this.getPfaNomEstado() != null && "null".equals(this.getPfaNomEstado())) {
            conditions += " AND PFA_NOM_ESTADO IS NULL";
        } else if (this.getPfaNomEstado() != null) {
            conditions += " AND PFA_NOM_ESTADO = ?";
            values.add(this.getPfaNomEstado());
        }

        if (this.getPfaNumPais() != null && this.getPfaNumPais().longValue() == -999) {
            conditions += " AND PFA_NUM_PAIS IS NULL";
        } else if (this.getPfaNumPais() != null) {
            conditions += " AND PFA_NUM_PAIS = ?";
            values.add(this.getPfaNumPais());
        }

        if (this.getPfaNomPais() != null && "null".equals(this.getPfaNomPais())) {
            conditions += " AND PFA_NOM_PAIS IS NULL";
        } else if (this.getPfaNomPais() != null) {
            conditions += " AND PFA_NOM_PAIS = ?";
            values.add(this.getPfaNomPais());
        }

        if (this.getPfaNumLadaCasa() != null && "null".equals(this.getPfaNumLadaCasa())) {
            conditions += " AND PFA_NUM_LADA_CASA IS NULL";
        } else if (this.getPfaNumLadaCasa() != null) {
            conditions += " AND PFA_NUM_LADA_CASA = ?";
            values.add(this.getPfaNumLadaCasa());
        }

        if (this.getPfaNumTelefCasa() != null && "null".equals(this.getPfaNumTelefCasa())) {
            conditions += " AND PFA_NUM_TELEF_CASA IS NULL";
        } else if (this.getPfaNumTelefCasa() != null) {
            conditions += " AND PFA_NUM_TELEF_CASA = ?";
            values.add(this.getPfaNumTelefCasa());
        }

        if (this.getPfaNumLadaOfic() != null && "null".equals(this.getPfaNumLadaOfic())) {
            conditions += " AND PFA_NUM_LADA_OFIC IS NULL";
        } else if (this.getPfaNumLadaOfic() != null) {
            conditions += " AND PFA_NUM_LADA_OFIC = ?";
            values.add(this.getPfaNumLadaOfic());
        }

        if (this.getPfaNumTelefOfic() != null && "null".equals(this.getPfaNumTelefOfic())) {
            conditions += " AND PFA_NUM_TELEF_OFIC IS NULL";
        } else if (this.getPfaNumTelefOfic() != null) {
            conditions += " AND PFA_NUM_TELEF_OFIC = ?";
            values.add(this.getPfaNumTelefOfic());
        }

        if (this.getPfaNumExtOfic() != null && "null".equals(this.getPfaNumExtOfic())) {
            conditions += " AND PFA_NUM_EXT_OFIC IS NULL";
        } else if (this.getPfaNumExtOfic() != null) {
            conditions += " AND PFA_NUM_EXT_OFIC = ?";
            values.add(this.getPfaNumExtOfic());
        }

        if (this.getPfaAnoIngreso() != null && this.getPfaAnoIngreso().longValue() == -999) {
            conditions += " AND PFA_ANO_INGRESO IS NULL";
        } else if (this.getPfaAnoIngreso() != null) {
            conditions += " AND PFA_ANO_INGRESO = ?";
            values.add(this.getPfaAnoIngreso());
        }

        if (this.getPfaMesIngreso() != null && this.getPfaMesIngreso().longValue() == -999) {
            conditions += " AND PFA_MES_INGRESO IS NULL";
        } else if (this.getPfaMesIngreso() != null) {
            conditions += " AND PFA_MES_INGRESO = ?";
            values.add(this.getPfaMesIngreso());
        }

        if (this.getPfaDiaIngreso() != null && this.getPfaDiaIngreso().longValue() == -999) {
            conditions += " AND PFA_DIA_INGRESO IS NULL";
        } else if (this.getPfaDiaIngreso() != null) {
            conditions += " AND PFA_DIA_INGRESO = ?";
            values.add(this.getPfaDiaIngreso());
        }

        if (this.getPfaAnoBaja() != null && this.getPfaAnoBaja().longValue() == -999) {
            conditions += " AND PFA_ANO_BAJA IS NULL";
        } else if (this.getPfaAnoBaja() != null) {
            conditions += " AND PFA_ANO_BAJA = ?";
            values.add(this.getPfaAnoBaja());
        }

        if (this.getPfaMesBaja() != null && this.getPfaMesBaja().longValue() == -999) {
            conditions += " AND PFA_MES_BAJA IS NULL";
        } else if (this.getPfaMesBaja() != null) {
            conditions += " AND PFA_MES_BAJA = ?";
            values.add(this.getPfaMesBaja());
        }

        if (this.getPfaDiaBaja() != null && this.getPfaDiaBaja().longValue() == -999) {
            conditions += " AND PFA_DIA_BAJA IS NULL";
        } else if (this.getPfaDiaBaja() != null) {
            conditions += " AND PFA_DIA_BAJA = ?";
            values.add(this.getPfaDiaBaja());
        }

        if (this.getPfaAnoReingreso() != null && this.getPfaAnoReingreso().longValue() == -999) {
            conditions += " AND PFA_ANO_REINGRESO IS NULL";
        } else if (this.getPfaAnoReingreso() != null) {
            conditions += " AND PFA_ANO_REINGRESO = ?";
            values.add(this.getPfaAnoReingreso());
        }

        if (this.getPfaMesReingreso() != null && this.getPfaMesReingreso().longValue() == -999) {
            conditions += " AND PFA_MES_REINGRESO IS NULL";
        } else if (this.getPfaMesReingreso() != null) {
            conditions += " AND PFA_MES_REINGRESO = ?";
            values.add(this.getPfaMesReingreso());
        }

        if (this.getPfaDiaReingreso() != null && this.getPfaDiaReingreso().longValue() == -999) {
            conditions += " AND PFA_DIA_REINGRESO IS NULL";
        } else if (this.getPfaDiaReingreso() != null) {
            conditions += " AND PFA_DIA_REINGRESO = ?";
            values.add(this.getPfaDiaReingreso());
        }

        if (this.getPfaAnoAltaReg() != null && this.getPfaAnoAltaReg().longValue() == -999) {
            conditions += " AND PFA_ANO_ALTA_REG IS NULL";
        } else if (this.getPfaAnoAltaReg() != null) {
            conditions += " AND PFA_ANO_ALTA_REG = ?";
            values.add(this.getPfaAnoAltaReg());
        }

        if (this.getPfaMesAltaReg() != null && this.getPfaMesAltaReg().longValue() == -999) {
            conditions += " AND PFA_MES_ALTA_REG IS NULL";
        } else if (this.getPfaMesAltaReg() != null) {
            conditions += " AND PFA_MES_ALTA_REG = ?";
            values.add(this.getPfaMesAltaReg());
        }

        if (this.getPfaDiaAltaReg() != null && this.getPfaDiaAltaReg().longValue() == -999) {
            conditions += " AND PFA_DIA_ALTA_REG IS NULL";
        } else if (this.getPfaDiaAltaReg() != null) {
            conditions += " AND PFA_DIA_ALTA_REG = ?";
            values.add(this.getPfaDiaAltaReg());
        }

        if (this.getPfaAnoUltMod() != null && this.getPfaAnoUltMod().longValue() == -999) {
            conditions += " AND PFA_ANO_ULT_MOD IS NULL";
        } else if (this.getPfaAnoUltMod() != null) {
            conditions += " AND PFA_ANO_ULT_MOD = ?";
            values.add(this.getPfaAnoUltMod());
        }

        if (this.getPfaMesUltMod() != null && this.getPfaMesUltMod().longValue() == -999) {
            conditions += " AND PFA_MES_ULT_MOD IS NULL";
        } else if (this.getPfaMesUltMod() != null) {
            conditions += " AND PFA_MES_ULT_MOD = ?";
            values.add(this.getPfaMesUltMod());
        }

        if (this.getPfaDiaUltMod() != null && this.getPfaDiaUltMod().longValue() == -999) {
            conditions += " AND PFA_DIA_ULT_MOD IS NULL";
        } else if (this.getPfaDiaUltMod() != null) {
            conditions += " AND PFA_DIA_ULT_MOD = ?";
            values.add(this.getPfaDiaUltMod());
        }

        if (this.getPfaCveStPartici() != null && "null".equals(this.getPfaCveStPartici())) {
            conditions += " AND PFA_CVE_ST_PARTICI IS NULL";
        } else if (this.getPfaCveStPartici() != null) {
            conditions += " AND PFA_CVE_ST_PARTICI = ?";
            values.add(this.getPfaCveStPartici());
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
        String sql = "UPDATE PARTICIP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PFA_NUM_CONTRATO = ?";
        pkValues.add(this.getPfaNumContrato());
        conditions += " AND PFA_NUM_DEPTO = ?";
        pkValues.add(this.getPfaNumDepto());
        conditions += " AND PFA_NUM_PARTICIP = ?";
        pkValues.add(this.getPfaNumParticip());
        fields += " PFA_NOM_PARTICIP = ?, ";
        values.add(this.getPfaNomParticip());
        fields += " PFA_RFC_PARTICIP = ?, ";
        values.add(this.getPfaRfcParticip());
        fields += " PFA_CVE_SEXO = ?, ";
        values.add(this.getPfaCveSexo());
        fields += " PFA_CVE_ABONO_CTA = ?, ";
        values.add(this.getPfaCveAbonoCta());
        fields += " PFA_CALLE_NUM = ?, ";
        values.add(this.getPfaCalleNum());
        fields += " PFA_NOM_COLONIA = ?, ";
        values.add(this.getPfaNomColonia());
        fields += " PFA_NOM_POBLACION = ?, ";
        values.add(this.getPfaNomPoblacion());
        fields += " PFA_CODIGO_POSTAL = ?, ";
        values.add(this.getPfaCodigoPostal());
        fields += " PFA_NUM_ESTADO = ?, ";
        values.add(this.getPfaNumEstado());
        fields += " PFA_NOM_ESTADO = ?, ";
        values.add(this.getPfaNomEstado());
        fields += " PFA_NUM_PAIS = ?, ";
        values.add(this.getPfaNumPais());
        fields += " PFA_NOM_PAIS = ?, ";
        values.add(this.getPfaNomPais());
        fields += " PFA_NUM_LADA_CASA = ?, ";
        values.add(this.getPfaNumLadaCasa());
        fields += " PFA_NUM_TELEF_CASA = ?, ";
        values.add(this.getPfaNumTelefCasa());
        fields += " PFA_NUM_LADA_OFIC = ?, ";
        values.add(this.getPfaNumLadaOfic());
        fields += " PFA_NUM_TELEF_OFIC = ?, ";
        values.add(this.getPfaNumTelefOfic());
        fields += " PFA_NUM_EXT_OFIC = ?, ";
        values.add(this.getPfaNumExtOfic());
        fields += " PFA_ANO_INGRESO = ?, ";
        values.add(this.getPfaAnoIngreso());
        fields += " PFA_MES_INGRESO = ?, ";
        values.add(this.getPfaMesIngreso());
        fields += " PFA_DIA_INGRESO = ?, ";
        values.add(this.getPfaDiaIngreso());
        fields += " PFA_ANO_BAJA = ?, ";
        values.add(this.getPfaAnoBaja());
        fields += " PFA_MES_BAJA = ?, ";
        values.add(this.getPfaMesBaja());
        fields += " PFA_DIA_BAJA = ?, ";
        values.add(this.getPfaDiaBaja());
        fields += " PFA_ANO_REINGRESO = ?, ";
        values.add(this.getPfaAnoReingreso());
        fields += " PFA_MES_REINGRESO = ?, ";
        values.add(this.getPfaMesReingreso());
        fields += " PFA_DIA_REINGRESO = ?, ";
        values.add(this.getPfaDiaReingreso());
        fields += " PFA_ANO_ALTA_REG = ?, ";
        values.add(this.getPfaAnoAltaReg());
        fields += " PFA_MES_ALTA_REG = ?, ";
        values.add(this.getPfaMesAltaReg());
        fields += " PFA_DIA_ALTA_REG = ?, ";
        values.add(this.getPfaDiaAltaReg());
        fields += " PFA_ANO_ULT_MOD = ?, ";
        values.add(this.getPfaAnoUltMod());
        fields += " PFA_MES_ULT_MOD = ?, ";
        values.add(this.getPfaMesUltMod());
        fields += " PFA_DIA_ULT_MOD = ?, ";
        values.add(this.getPfaDiaUltMod());
        fields += " PFA_CVE_ST_PARTICI = ?, ";
        values.add(this.getPfaCveStPartici());
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
        String sql = "INSERT INTO PARTICIP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PFA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPfaNumContrato());

        fields += ", PFA_NUM_DEPTO";
        fieldValues += ", ?";
        values.add(this.getPfaNumDepto());

        fields += ", PFA_NUM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getPfaNumParticip());

        fields += ", PFA_NOM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getPfaNomParticip());

        fields += ", PFA_RFC_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getPfaRfcParticip());

        fields += ", PFA_CVE_SEXO";
        fieldValues += ", ?";
        values.add(this.getPfaCveSexo());

        fields += ", PFA_CVE_ABONO_CTA";
        fieldValues += ", ?";
        values.add(this.getPfaCveAbonoCta());

        fields += ", PFA_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getPfaCalleNum());

        fields += ", PFA_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getPfaNomColonia());

        fields += ", PFA_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getPfaNomPoblacion());

        fields += ", PFA_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getPfaCodigoPostal());

        fields += ", PFA_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getPfaNumEstado());

        fields += ", PFA_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getPfaNomEstado());

        fields += ", PFA_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getPfaNumPais());

        fields += ", PFA_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getPfaNomPais());

        fields += ", PFA_NUM_LADA_CASA";
        fieldValues += ", ?";
        values.add(this.getPfaNumLadaCasa());

        fields += ", PFA_NUM_TELEF_CASA";
        fieldValues += ", ?";
        values.add(this.getPfaNumTelefCasa());

        fields += ", PFA_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getPfaNumLadaOfic());

        fields += ", PFA_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getPfaNumTelefOfic());

        fields += ", PFA_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getPfaNumExtOfic());

        fields += ", PFA_ANO_INGRESO";
        fieldValues += ", ?";
        values.add(this.getPfaAnoIngreso());

        fields += ", PFA_MES_INGRESO";
        fieldValues += ", ?";
        values.add(this.getPfaMesIngreso());

        fields += ", PFA_DIA_INGRESO";
        fieldValues += ", ?";
        values.add(this.getPfaDiaIngreso());

        fields += ", PFA_ANO_BAJA";
        fieldValues += ", ?";
        values.add(this.getPfaAnoBaja());

        fields += ", PFA_MES_BAJA";
        fieldValues += ", ?";
        values.add(this.getPfaMesBaja());

        fields += ", PFA_DIA_BAJA";
        fieldValues += ", ?";
        values.add(this.getPfaDiaBaja());

        fields += ", PFA_ANO_REINGRESO";
        fieldValues += ", ?";
        values.add(this.getPfaAnoReingreso());

        fields += ", PFA_MES_REINGRESO";
        fieldValues += ", ?";
        values.add(this.getPfaMesReingreso());

        fields += ", PFA_DIA_REINGRESO";
        fieldValues += ", ?";
        values.add(this.getPfaDiaReingreso());

        fields += ", PFA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPfaAnoAltaReg());

        fields += ", PFA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPfaMesAltaReg());

        fields += ", PFA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPfaDiaAltaReg());

        fields += ", PFA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPfaAnoUltMod());

        fields += ", PFA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPfaMesUltMod());

        fields += ", PFA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPfaDiaUltMod());

        fields += ", PFA_CVE_ST_PARTICI";
        fieldValues += ", ?";
        values.add(this.getPfaCveStPartici());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARTICIP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PFA_NUM_CONTRATO = ?";
        values.add(this.getPfaNumContrato());
        conditions += " AND PFA_NUM_DEPTO = ?";
        values.add(this.getPfaNumDepto());
        conditions += " AND PFA_NUM_PARTICIP = ?";
        values.add(this.getPfaNumParticip());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Particip instance = (Particip) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPfaNumContrato().equals(instance.getPfaNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumDepto().equals(instance.getPfaNumDepto()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumParticip().equals(instance.getPfaNumParticip()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNomParticip().equals(instance.getPfaNomParticip()))
            equalObjects = false;
        if (equalObjects && !this.getPfaRfcParticip().equals(instance.getPfaRfcParticip()))
            equalObjects = false;
        if (equalObjects && !this.getPfaCveSexo().equals(instance.getPfaCveSexo()))
            equalObjects = false;
        if (equalObjects && !this.getPfaCveAbonoCta().equals(instance.getPfaCveAbonoCta()))
            equalObjects = false;
        if (equalObjects && !this.getPfaCalleNum().equals(instance.getPfaCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNomColonia().equals(instance.getPfaNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNomPoblacion().equals(instance.getPfaNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getPfaCodigoPostal().equals(instance.getPfaCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumEstado().equals(instance.getPfaNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNomEstado().equals(instance.getPfaNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumPais().equals(instance.getPfaNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNomPais().equals(instance.getPfaNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumLadaCasa().equals(instance.getPfaNumLadaCasa()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumTelefCasa().equals(instance.getPfaNumTelefCasa()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumLadaOfic().equals(instance.getPfaNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumTelefOfic().equals(instance.getPfaNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getPfaNumExtOfic().equals(instance.getPfaNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getPfaAnoIngreso().equals(instance.getPfaAnoIngreso()))
            equalObjects = false;
        if (equalObjects && !this.getPfaMesIngreso().equals(instance.getPfaMesIngreso()))
            equalObjects = false;
        if (equalObjects && !this.getPfaDiaIngreso().equals(instance.getPfaDiaIngreso()))
            equalObjects = false;
        if (equalObjects && !this.getPfaAnoBaja().equals(instance.getPfaAnoBaja()))
            equalObjects = false;
        if (equalObjects && !this.getPfaMesBaja().equals(instance.getPfaMesBaja()))
            equalObjects = false;
        if (equalObjects && !this.getPfaDiaBaja().equals(instance.getPfaDiaBaja()))
            equalObjects = false;
        if (equalObjects && !this.getPfaAnoReingreso().equals(instance.getPfaAnoReingreso()))
            equalObjects = false;
        if (equalObjects && !this.getPfaMesReingreso().equals(instance.getPfaMesReingreso()))
            equalObjects = false;
        if (equalObjects && !this.getPfaDiaReingreso().equals(instance.getPfaDiaReingreso()))
            equalObjects = false;
        if (equalObjects && !this.getPfaAnoAltaReg().equals(instance.getPfaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPfaMesAltaReg().equals(instance.getPfaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPfaDiaAltaReg().equals(instance.getPfaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPfaAnoUltMod().equals(instance.getPfaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPfaMesUltMod().equals(instance.getPfaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPfaDiaUltMod().equals(instance.getPfaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPfaCveStPartici().equals(instance.getPfaCveStPartici()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Particip result = new Particip();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPfaNumContrato((BigDecimal) objectData.getData("PFA_NUM_CONTRATO"));
        result.setPfaNumDepto((BigDecimal) objectData.getData("PFA_NUM_DEPTO"));
        result.setPfaNumParticip((BigDecimal) objectData.getData("PFA_NUM_PARTICIP"));
        result.setPfaNomParticip((String) objectData.getData("PFA_NOM_PARTICIP"));
        result.setPfaRfcParticip((String) objectData.getData("PFA_RFC_PARTICIP"));
        result.setPfaCveSexo((String) objectData.getData("PFA_CVE_SEXO"));
        result.setPfaCveAbonoCta((String) objectData.getData("PFA_CVE_ABONO_CTA"));
        result.setPfaCalleNum((String) objectData.getData("PFA_CALLE_NUM"));
        result.setPfaNomColonia((String) objectData.getData("PFA_NOM_COLONIA"));
        result.setPfaNomPoblacion((String) objectData.getData("PFA_NOM_POBLACION"));
        result.setPfaCodigoPostal((BigDecimal) objectData.getData("PFA_CODIGO_POSTAL"));
        result.setPfaNumEstado((BigDecimal) objectData.getData("PFA_NUM_ESTADO"));
        result.setPfaNomEstado((String) objectData.getData("PFA_NOM_ESTADO"));
        result.setPfaNumPais((BigDecimal) objectData.getData("PFA_NUM_PAIS"));
        result.setPfaNomPais((String) objectData.getData("PFA_NOM_PAIS"));
        result.setPfaNumLadaCasa((String) objectData.getData("PFA_NUM_LADA_CASA"));
        result.setPfaNumTelefCasa((String) objectData.getData("PFA_NUM_TELEF_CASA"));
        result.setPfaNumLadaOfic((String) objectData.getData("PFA_NUM_LADA_OFIC"));
        result.setPfaNumTelefOfic((String) objectData.getData("PFA_NUM_TELEF_OFIC"));
        result.setPfaNumExtOfic((String) objectData.getData("PFA_NUM_EXT_OFIC"));
        result.setPfaAnoIngreso((BigDecimal) objectData.getData("PFA_ANO_INGRESO"));
        result.setPfaMesIngreso((BigDecimal) objectData.getData("PFA_MES_INGRESO"));
        result.setPfaDiaIngreso((BigDecimal) objectData.getData("PFA_DIA_INGRESO"));
        result.setPfaAnoBaja((BigDecimal) objectData.getData("PFA_ANO_BAJA"));
        result.setPfaMesBaja((BigDecimal) objectData.getData("PFA_MES_BAJA"));
        result.setPfaDiaBaja((BigDecimal) objectData.getData("PFA_DIA_BAJA"));
        result.setPfaAnoReingreso((BigDecimal) objectData.getData("PFA_ANO_REINGRESO"));
        result.setPfaMesReingreso((BigDecimal) objectData.getData("PFA_MES_REINGRESO"));
        result.setPfaDiaReingreso((BigDecimal) objectData.getData("PFA_DIA_REINGRESO"));
        result.setPfaAnoAltaReg((BigDecimal) objectData.getData("PFA_ANO_ALTA_REG"));
        result.setPfaMesAltaReg((BigDecimal) objectData.getData("PFA_MES_ALTA_REG"));
        result.setPfaDiaAltaReg((BigDecimal) objectData.getData("PFA_DIA_ALTA_REG"));
        result.setPfaAnoUltMod((BigDecimal) objectData.getData("PFA_ANO_ULT_MOD"));
        result.setPfaMesUltMod((BigDecimal) objectData.getData("PFA_MES_ULT_MOD"));
        result.setPfaDiaUltMod((BigDecimal) objectData.getData("PFA_DIA_ULT_MOD"));
        result.setPfaCveStPartici((String) objectData.getData("PFA_CVE_ST_PARTICI"));

        return result;

    }

}
