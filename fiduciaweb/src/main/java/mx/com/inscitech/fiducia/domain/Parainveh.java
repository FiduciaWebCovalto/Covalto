package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARAINVEH_PK",
            columns =
            { "PAR_NUM_SUB_CONT", "PAR_NUM_ENTID_FIN", "PAR_CONTRATO_INTER", "PAR_CVE_CPA_VTA", "PAR_CVE_TIPO_MERCA", "PAR_NUM_INSTRUME", "PAR_NUM_PLAZO", "PAR_NUM_CONTRATO"
    }, sequences = { "MANUAL" })
public class Parainveh extends DomainObject {

    BigDecimal parNumContrato = null;
    BigDecimal parNumSubCont = null;
    BigDecimal parNumEntidFin = null;
    BigDecimal parContratoInter = null;
    String parCveCpaVta = null;
    BigDecimal parCveTipoMerca = null;
    BigDecimal parNumInstrume = null;
    BigDecimal parNumPlazo = null;
    String parNomPizarra = null;
    String parNumSerEmis = null;
    BigDecimal parNumCuponVig = null;
    String parCveTipoOpera = null;
    BigDecimal parPjeInstrume = null;
    BigDecimal parAnoAltaReg = null;
    BigDecimal parMesAltaReg = null;
    BigDecimal parDiaAltaReg = null;
    BigDecimal parAnoUltMod = null;
    BigDecimal parMesUltMod = null;
    BigDecimal parDiaUltMod = null;
    String parCveStParainv = null;

    public Parainveh() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParNumContrato(BigDecimal parNumContrato) {
        this.parNumContrato = parNumContrato;
    }

    public BigDecimal getParNumContrato() {
        return this.parNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParNumSubCont(BigDecimal parNumSubCont) {
        this.parNumSubCont = parNumSubCont;
    }

    public BigDecimal getParNumSubCont() {
        return this.parNumSubCont;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParNumEntidFin(BigDecimal parNumEntidFin) {
        this.parNumEntidFin = parNumEntidFin;
    }

    public BigDecimal getParNumEntidFin() {
        return this.parNumEntidFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParContratoInter(BigDecimal parContratoInter) {
        this.parContratoInter = parContratoInter;
    }

    public BigDecimal getParContratoInter() {
        return this.parContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setParCveCpaVta(String parCveCpaVta) {
        this.parCveCpaVta = parCveCpaVta;
    }

    public String getParCveCpaVta() {
        return this.parCveCpaVta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParCveTipoMerca(BigDecimal parCveTipoMerca) {
        this.parCveTipoMerca = parCveTipoMerca;
    }

    public BigDecimal getParCveTipoMerca() {
        return this.parCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParNumInstrume(BigDecimal parNumInstrume) {
        this.parNumInstrume = parNumInstrume;
    }

    public BigDecimal getParNumInstrume() {
        return this.parNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParNumPlazo(BigDecimal parNumPlazo) {
        this.parNumPlazo = parNumPlazo;
    }

    public BigDecimal getParNumPlazo() {
        return this.parNumPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setParNomPizarra(String parNomPizarra) {
        this.parNomPizarra = parNomPizarra;
    }

    public String getParNomPizarra() {
        return this.parNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setParNumSerEmis(String parNumSerEmis) {
        this.parNumSerEmis = parNumSerEmis;
    }

    public String getParNumSerEmis() {
        return this.parNumSerEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParNumCuponVig(BigDecimal parNumCuponVig) {
        this.parNumCuponVig = parNumCuponVig;
    }

    public BigDecimal getParNumCuponVig() {
        return this.parNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setParCveTipoOpera(String parCveTipoOpera) {
        this.parCveTipoOpera = parCveTipoOpera;
    }

    public String getParCveTipoOpera() {
        return this.parCveTipoOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 8, scale = 5, javaClass = BigDecimal.class)
    public void setParPjeInstrume(BigDecimal parPjeInstrume) {
        this.parPjeInstrume = parPjeInstrume;
    }

    public BigDecimal getParPjeInstrume() {
        return this.parPjeInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setParAnoAltaReg(BigDecimal parAnoAltaReg) {
        this.parAnoAltaReg = parAnoAltaReg;
    }

    public BigDecimal getParAnoAltaReg() {
        return this.parAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setParMesAltaReg(BigDecimal parMesAltaReg) {
        this.parMesAltaReg = parMesAltaReg;
    }

    public BigDecimal getParMesAltaReg() {
        return this.parMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setParDiaAltaReg(BigDecimal parDiaAltaReg) {
        this.parDiaAltaReg = parDiaAltaReg;
    }

    public BigDecimal getParDiaAltaReg() {
        return this.parDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setParAnoUltMod(BigDecimal parAnoUltMod) {
        this.parAnoUltMod = parAnoUltMod;
    }

    public BigDecimal getParAnoUltMod() {
        return this.parAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setParMesUltMod(BigDecimal parMesUltMod) {
        this.parMesUltMod = parMesUltMod;
    }

    public BigDecimal getParMesUltMod() {
        return this.parMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setParDiaUltMod(BigDecimal parDiaUltMod) {
        this.parDiaUltMod = parDiaUltMod;
    }

    public BigDecimal getParDiaUltMod() {
        return this.parDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setParCveStParainv(String parCveStParainv) {
        this.parCveStParainv = parCveStParainv;
    }

    public String getParCveStParainv() {
        return this.parCveStParainv;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARAINVEH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getParNumContrato() != null && this.getParNumContrato().longValue() == -999) {
            conditions += " AND PAR_NUM_CONTRATO IS NULL";
        } else if (this.getParNumContrato() != null) {
            conditions += " AND PAR_NUM_CONTRATO = ?";
            values.add(this.getParNumContrato());
        }

        if (this.getParNumSubCont() != null && this.getParNumSubCont().longValue() == -999) {
            conditions += " AND PAR_NUM_SUB_CONT IS NULL";
        } else if (this.getParNumSubCont() != null) {
            conditions += " AND PAR_NUM_SUB_CONT = ?";
            values.add(this.getParNumSubCont());
        }

        if (this.getParNumEntidFin() != null && this.getParNumEntidFin().longValue() == -999) {
            conditions += " AND PAR_NUM_ENTID_FIN IS NULL";
        } else if (this.getParNumEntidFin() != null) {
            conditions += " AND PAR_NUM_ENTID_FIN = ?";
            values.add(this.getParNumEntidFin());
        }

        if (this.getParContratoInter() != null && this.getParContratoInter().longValue() == -999) {
            conditions += " AND PAR_CONTRATO_INTER IS NULL";
        } else if (this.getParContratoInter() != null) {
            conditions += " AND PAR_CONTRATO_INTER = ?";
            values.add(this.getParContratoInter());
        }

        if (this.getParCveCpaVta() != null && "null".equals(this.getParCveCpaVta())) {
            conditions += " AND PAR_CVE_CPA_VTA IS NULL";
        } else if (this.getParCveCpaVta() != null) {
            conditions += " AND PAR_CVE_CPA_VTA = ?";
            values.add(this.getParCveCpaVta());
        }

        if (this.getParCveTipoMerca() != null && this.getParCveTipoMerca().longValue() == -999) {
            conditions += " AND PAR_CVE_TIPO_MERCA IS NULL";
        } else if (this.getParCveTipoMerca() != null) {
            conditions += " AND PAR_CVE_TIPO_MERCA = ?";
            values.add(this.getParCveTipoMerca());
        }

        if (this.getParNumInstrume() != null && this.getParNumInstrume().longValue() == -999) {
            conditions += " AND PAR_NUM_INSTRUME IS NULL";
        } else if (this.getParNumInstrume() != null) {
            conditions += " AND PAR_NUM_INSTRUME = ?";
            values.add(this.getParNumInstrume());
        }

        if (this.getParNumPlazo() != null && this.getParNumPlazo().longValue() == -999) {
            conditions += " AND PAR_NUM_PLAZO IS NULL";
        } else if (this.getParNumPlazo() != null) {
            conditions += " AND PAR_NUM_PLAZO = ?";
            values.add(this.getParNumPlazo());
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
        String sql = "SELECT * FROM PARAINVEH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getParNumContrato() != null && this.getParNumContrato().longValue() == -999) {
            conditions += " AND PAR_NUM_CONTRATO IS NULL";
        } else if (this.getParNumContrato() != null) {
            conditions += " AND PAR_NUM_CONTRATO = ?";
            values.add(this.getParNumContrato());
        }

        if (this.getParNumSubCont() != null && this.getParNumSubCont().longValue() == -999) {
            conditions += " AND PAR_NUM_SUB_CONT IS NULL";
        } else if (this.getParNumSubCont() != null) {
            conditions += " AND PAR_NUM_SUB_CONT = ?";
            values.add(this.getParNumSubCont());
        }

        if (this.getParNumEntidFin() != null && this.getParNumEntidFin().longValue() == -999) {
            conditions += " AND PAR_NUM_ENTID_FIN IS NULL";
        } else if (this.getParNumEntidFin() != null) {
            conditions += " AND PAR_NUM_ENTID_FIN = ?";
            values.add(this.getParNumEntidFin());
        }

        if (this.getParContratoInter() != null && this.getParContratoInter().longValue() == -999) {
            conditions += " AND PAR_CONTRATO_INTER IS NULL";
        } else if (this.getParContratoInter() != null) {
            conditions += " AND PAR_CONTRATO_INTER = ?";
            values.add(this.getParContratoInter());
        }

        if (this.getParCveCpaVta() != null && "null".equals(this.getParCveCpaVta())) {
            conditions += " AND PAR_CVE_CPA_VTA IS NULL";
        } else if (this.getParCveCpaVta() != null) {
            conditions += " AND PAR_CVE_CPA_VTA = ?";
            values.add(this.getParCveCpaVta());
        }

        if (this.getParCveTipoMerca() != null && this.getParCveTipoMerca().longValue() == -999) {
            conditions += " AND PAR_CVE_TIPO_MERCA IS NULL";
        } else if (this.getParCveTipoMerca() != null) {
            conditions += " AND PAR_CVE_TIPO_MERCA = ?";
            values.add(this.getParCveTipoMerca());
        }

        if (this.getParNumInstrume() != null && this.getParNumInstrume().longValue() == -999) {
            conditions += " AND PAR_NUM_INSTRUME IS NULL";
        } else if (this.getParNumInstrume() != null) {
            conditions += " AND PAR_NUM_INSTRUME = ?";
            values.add(this.getParNumInstrume());
        }

        if (this.getParNumPlazo() != null && this.getParNumPlazo().longValue() == -999) {
            conditions += " AND PAR_NUM_PLAZO IS NULL";
        } else if (this.getParNumPlazo() != null) {
            conditions += " AND PAR_NUM_PLAZO = ?";
            values.add(this.getParNumPlazo());
        }

        if (this.getParNomPizarra() != null && "null".equals(this.getParNomPizarra())) {
            conditions += " AND PAR_NOM_PIZARRA IS NULL";
        } else if (this.getParNomPizarra() != null) {
            conditions += " AND PAR_NOM_PIZARRA = ?";
            values.add(this.getParNomPizarra());
        }

        if (this.getParNumSerEmis() != null && "null".equals(this.getParNumSerEmis())) {
            conditions += " AND PAR_NUM_SER_EMIS IS NULL";
        } else if (this.getParNumSerEmis() != null) {
            conditions += " AND PAR_NUM_SER_EMIS = ?";
            values.add(this.getParNumSerEmis());
        }

        if (this.getParNumCuponVig() != null && this.getParNumCuponVig().longValue() == -999) {
            conditions += " AND PAR_NUM_CUPON_VIG IS NULL";
        } else if (this.getParNumCuponVig() != null) {
            conditions += " AND PAR_NUM_CUPON_VIG = ?";
            values.add(this.getParNumCuponVig());
        }

        if (this.getParCveTipoOpera() != null && "null".equals(this.getParCveTipoOpera())) {
            conditions += " AND PAR_CVE_TIPO_OPERA IS NULL";
        } else if (this.getParCveTipoOpera() != null) {
            conditions += " AND PAR_CVE_TIPO_OPERA = ?";
            values.add(this.getParCveTipoOpera());
        }

        if (this.getParPjeInstrume() != null && this.getParPjeInstrume().longValue() == -999) {
            conditions += " AND PAR_PJE_INSTRUME IS NULL";
        } else if (this.getParPjeInstrume() != null) {
            conditions += " AND PAR_PJE_INSTRUME = ?";
            values.add(this.getParPjeInstrume());
        }

        if (this.getParAnoAltaReg() != null && this.getParAnoAltaReg().longValue() == -999) {
            conditions += " AND PAR_ANO_ALTA_REG IS NULL";
        } else if (this.getParAnoAltaReg() != null) {
            conditions += " AND PAR_ANO_ALTA_REG = ?";
            values.add(this.getParAnoAltaReg());
        }

        if (this.getParMesAltaReg() != null && this.getParMesAltaReg().longValue() == -999) {
            conditions += " AND PAR_MES_ALTA_REG IS NULL";
        } else if (this.getParMesAltaReg() != null) {
            conditions += " AND PAR_MES_ALTA_REG = ?";
            values.add(this.getParMesAltaReg());
        }

        if (this.getParDiaAltaReg() != null && this.getParDiaAltaReg().longValue() == -999) {
            conditions += " AND PAR_DIA_ALTA_REG IS NULL";
        } else if (this.getParDiaAltaReg() != null) {
            conditions += " AND PAR_DIA_ALTA_REG = ?";
            values.add(this.getParDiaAltaReg());
        }

        if (this.getParAnoUltMod() != null && this.getParAnoUltMod().longValue() == -999) {
            conditions += " AND PAR_ANO_ULT_MOD IS NULL";
        } else if (this.getParAnoUltMod() != null) {
            conditions += " AND PAR_ANO_ULT_MOD = ?";
            values.add(this.getParAnoUltMod());
        }

        if (this.getParMesUltMod() != null && this.getParMesUltMod().longValue() == -999) {
            conditions += " AND PAR_MES_ULT_MOD IS NULL";
        } else if (this.getParMesUltMod() != null) {
            conditions += " AND PAR_MES_ULT_MOD = ?";
            values.add(this.getParMesUltMod());
        }

        if (this.getParDiaUltMod() != null && this.getParDiaUltMod().longValue() == -999) {
            conditions += " AND PAR_DIA_ULT_MOD IS NULL";
        } else if (this.getParDiaUltMod() != null) {
            conditions += " AND PAR_DIA_ULT_MOD = ?";
            values.add(this.getParDiaUltMod());
        }

        if (this.getParCveStParainv() != null && "null".equals(this.getParCveStParainv())) {
            conditions += " AND PAR_CVE_ST_PARAINV IS NULL";
        } else if (this.getParCveStParainv() != null) {
            conditions += " AND PAR_CVE_ST_PARAINV = ?";
            values.add(this.getParCveStParainv());
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
        String sql = "UPDATE PARAINVEH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAR_NUM_CONTRATO = ?";
        pkValues.add(this.getParNumContrato());
        conditions += " AND PAR_NUM_SUB_CONT = ?";
        pkValues.add(this.getParNumSubCont());
        conditions += " AND PAR_NUM_ENTID_FIN = ?";
        pkValues.add(this.getParNumEntidFin());
        conditions += " AND PAR_CONTRATO_INTER = ?";
        pkValues.add(this.getParContratoInter());
        conditions += " AND PAR_CVE_CPA_VTA = ?";
        pkValues.add(this.getParCveCpaVta());
        conditions += " AND PAR_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getParCveTipoMerca());
        conditions += " AND PAR_NUM_INSTRUME = ?";
        pkValues.add(this.getParNumInstrume());
        conditions += " AND PAR_NUM_PLAZO = ?";
        pkValues.add(this.getParNumPlazo());
        fields += " PAR_NOM_PIZARRA = ?, ";
        values.add(this.getParNomPizarra());
        fields += " PAR_NUM_SER_EMIS = ?, ";
        values.add(this.getParNumSerEmis());
        fields += " PAR_NUM_CUPON_VIG = ?, ";
        values.add(this.getParNumCuponVig());
        fields += " PAR_CVE_TIPO_OPERA = ?, ";
        values.add(this.getParCveTipoOpera());
        fields += " PAR_PJE_INSTRUME = ?, ";
        values.add(this.getParPjeInstrume());
        fields += " PAR_ANO_ALTA_REG = ?, ";
        values.add(this.getParAnoAltaReg());
        fields += " PAR_MES_ALTA_REG = ?, ";
        values.add(this.getParMesAltaReg());
        fields += " PAR_DIA_ALTA_REG = ?, ";
        values.add(this.getParDiaAltaReg());
        fields += " PAR_ANO_ULT_MOD = ?, ";
        values.add(this.getParAnoUltMod());
        fields += " PAR_MES_ULT_MOD = ?, ";
        values.add(this.getParMesUltMod());
        fields += " PAR_DIA_ULT_MOD = ?, ";
        values.add(this.getParDiaUltMod());
        fields += " PAR_CVE_ST_PARAINV = ?, ";
        values.add(this.getParCveStParainv());
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
        String sql = "INSERT INTO PARAINVEH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAR_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getParNumContrato());

        fields += ", PAR_NUM_SUB_CONT";
        fieldValues += ", ?";
        values.add(this.getParNumSubCont());

        fields += ", PAR_NUM_ENTID_FIN";
        fieldValues += ", ?";
        values.add(this.getParNumEntidFin());

        fields += ", PAR_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getParContratoInter());

        fields += ", PAR_CVE_CPA_VTA";
        fieldValues += ", ?";
        values.add(this.getParCveCpaVta());

        fields += ", PAR_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getParCveTipoMerca());

        fields += ", PAR_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getParNumInstrume());

        fields += ", PAR_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getParNumPlazo());

        fields += ", PAR_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getParNomPizarra());

        fields += ", PAR_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getParNumSerEmis());

        fields += ", PAR_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getParNumCuponVig());

        fields += ", PAR_CVE_TIPO_OPERA";
        fieldValues += ", ?";
        values.add(this.getParCveTipoOpera());

        fields += ", PAR_PJE_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getParPjeInstrume());

        fields += ", PAR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getParAnoAltaReg());

        fields += ", PAR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getParMesAltaReg());

        fields += ", PAR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getParDiaAltaReg());

        fields += ", PAR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getParAnoUltMod());

        fields += ", PAR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getParMesUltMod());

        fields += ", PAR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getParDiaUltMod());

        fields += ", PAR_CVE_ST_PARAINV";
        fieldValues += ", ?";
        values.add(this.getParCveStParainv());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARAINVEH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAR_NUM_CONTRATO = ?";
        values.add(this.getParNumContrato());
        conditions += " AND PAR_NUM_SUB_CONT = ?";
        values.add(this.getParNumSubCont());
        conditions += " AND PAR_NUM_ENTID_FIN = ?";
        values.add(this.getParNumEntidFin());
        conditions += " AND PAR_CONTRATO_INTER = ?";
        values.add(this.getParContratoInter());
        conditions += " AND PAR_CVE_CPA_VTA = ?";
        values.add(this.getParCveCpaVta());
        conditions += " AND PAR_CVE_TIPO_MERCA = ?";
        values.add(this.getParCveTipoMerca());
        conditions += " AND PAR_NUM_INSTRUME = ?";
        values.add(this.getParNumInstrume());
        conditions += " AND PAR_NUM_PLAZO = ?";
        values.add(this.getParNumPlazo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Parainveh instance = (Parainveh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getParNumContrato().equals(instance.getParNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getParNumSubCont().equals(instance.getParNumSubCont()))
            equalObjects = false;
        if (equalObjects && !this.getParNumEntidFin().equals(instance.getParNumEntidFin()))
            equalObjects = false;
        if (equalObjects && !this.getParContratoInter().equals(instance.getParContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getParCveCpaVta().equals(instance.getParCveCpaVta()))
            equalObjects = false;
        if (equalObjects && !this.getParCveTipoMerca().equals(instance.getParCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getParNumInstrume().equals(instance.getParNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getParNumPlazo().equals(instance.getParNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getParNomPizarra().equals(instance.getParNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getParNumSerEmis().equals(instance.getParNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getParNumCuponVig().equals(instance.getParNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getParCveTipoOpera().equals(instance.getParCveTipoOpera()))
            equalObjects = false;
        if (equalObjects && !this.getParPjeInstrume().equals(instance.getParPjeInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getParAnoAltaReg().equals(instance.getParAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getParMesAltaReg().equals(instance.getParMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getParDiaAltaReg().equals(instance.getParDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getParAnoUltMod().equals(instance.getParAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getParMesUltMod().equals(instance.getParMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getParDiaUltMod().equals(instance.getParDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getParCveStParainv().equals(instance.getParCveStParainv()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Parainveh result = new Parainveh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setParNumContrato((BigDecimal) objectData.getData("PAR_NUM_CONTRATO"));
        result.setParNumSubCont((BigDecimal) objectData.getData("PAR_NUM_SUB_CONT"));
        result.setParNumEntidFin((BigDecimal) objectData.getData("PAR_NUM_ENTID_FIN"));
        result.setParContratoInter((BigDecimal) objectData.getData("PAR_CONTRATO_INTER"));
        result.setParCveCpaVta((String) objectData.getData("PAR_CVE_CPA_VTA"));
        result.setParCveTipoMerca((BigDecimal) objectData.getData("PAR_CVE_TIPO_MERCA"));
        result.setParNumInstrume((BigDecimal) objectData.getData("PAR_NUM_INSTRUME"));
        result.setParNumPlazo((BigDecimal) objectData.getData("PAR_NUM_PLAZO"));
        result.setParNomPizarra((String) objectData.getData("PAR_NOM_PIZARRA"));
        result.setParNumSerEmis((String) objectData.getData("PAR_NUM_SER_EMIS"));
        result.setParNumCuponVig((BigDecimal) objectData.getData("PAR_NUM_CUPON_VIG"));
        result.setParCveTipoOpera((String) objectData.getData("PAR_CVE_TIPO_OPERA"));
        result.setParPjeInstrume((BigDecimal) objectData.getData("PAR_PJE_INSTRUME"));
        result.setParAnoAltaReg((BigDecimal) objectData.getData("PAR_ANO_ALTA_REG"));
        result.setParMesAltaReg((BigDecimal) objectData.getData("PAR_MES_ALTA_REG"));
        result.setParDiaAltaReg((BigDecimal) objectData.getData("PAR_DIA_ALTA_REG"));
        result.setParAnoUltMod((BigDecimal) objectData.getData("PAR_ANO_ULT_MOD"));
        result.setParMesUltMod((BigDecimal) objectData.getData("PAR_MES_ULT_MOD"));
        result.setParDiaUltMod((BigDecimal) objectData.getData("PAR_DIA_ULT_MOD"));
        result.setParCveStParainv((String) objectData.getData("PAR_CVE_ST_PARAINV"));

        return result;

    }

}
