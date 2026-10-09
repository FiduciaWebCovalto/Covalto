package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PEREXPEDIENT_PK", columns = { "EXP_NUM_EXPEDIEN", "EXP_NUM_PERITO" }, sequences = { "MANUAL" })
public class Perexpedient extends DomainObject {

    BigDecimal expNumExpedien = null;
    BigDecimal expNumPerito = null;
    String expNumCajon = null;
    String expObservacion = null;
    String expCurriculum = null;
    String expActaNacimient = null;
    String expActualizacion = null;
    String expTituloProf = null;
    String expCedulaProf = null;
    String expInstPromReg = null;
    String expCartasReferen = null;
    String expCartaTrayecto = null;
    String expAvaluoEspecia = null;
    String expCurp = null;
    BigDecimal expAnoAltaReg = null;
    BigDecimal expMesAltaReg = null;
    BigDecimal expDiaAltaReg = null;
    BigDecimal expAnoUltMod = null;
    BigDecimal expMesUltMod = null;
    BigDecimal expDiaUltMod = null;
    String expCveStPerexpe = null;

    public Perexpedient() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExpNumExpedien(BigDecimal expNumExpedien) {
        this.expNumExpedien = expNumExpedien;
    }

    public BigDecimal getExpNumExpedien() {
        return this.expNumExpedien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExpNumPerito(BigDecimal expNumPerito) {
        this.expNumPerito = expNumPerito;
    }

    public BigDecimal getExpNumPerito() {
        return this.expNumPerito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpNumCajon(String expNumCajon) {
        this.expNumCajon = expNumCajon;
    }

    public String getExpNumCajon() {
        return this.expNumCajon;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpObservacion(String expObservacion) {
        this.expObservacion = expObservacion;
    }

    public String getExpObservacion() {
        return this.expObservacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpCurriculum(String expCurriculum) {
        this.expCurriculum = expCurriculum;
    }

    public String getExpCurriculum() {
        return this.expCurriculum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpActaNacimient(String expActaNacimient) {
        this.expActaNacimient = expActaNacimient;
    }

    public String getExpActaNacimient() {
        return this.expActaNacimient;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpActualizacion(String expActualizacion) {
        this.expActualizacion = expActualizacion;
    }

    public String getExpActualizacion() {
        return this.expActualizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpTituloProf(String expTituloProf) {
        this.expTituloProf = expTituloProf;
    }

    public String getExpTituloProf() {
        return this.expTituloProf;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpCedulaProf(String expCedulaProf) {
        this.expCedulaProf = expCedulaProf;
    }

    public String getExpCedulaProf() {
        return this.expCedulaProf;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpInstPromReg(String expInstPromReg) {
        this.expInstPromReg = expInstPromReg;
    }

    public String getExpInstPromReg() {
        return this.expInstPromReg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpCartasReferen(String expCartasReferen) {
        this.expCartasReferen = expCartasReferen;
    }

    public String getExpCartasReferen() {
        return this.expCartasReferen;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpCartaTrayecto(String expCartaTrayecto) {
        this.expCartaTrayecto = expCartaTrayecto;
    }

    public String getExpCartaTrayecto() {
        return this.expCartaTrayecto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpAvaluoEspecia(String expAvaluoEspecia) {
        this.expAvaluoEspecia = expAvaluoEspecia;
    }

    public String getExpAvaluoEspecia() {
        return this.expAvaluoEspecia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpCurp(String expCurp) {
        this.expCurp = expCurp;
    }

    public String getExpCurp() {
        return this.expCurp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExpAnoAltaReg(BigDecimal expAnoAltaReg) {
        this.expAnoAltaReg = expAnoAltaReg;
    }

    public BigDecimal getExpAnoAltaReg() {
        return this.expAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExpMesAltaReg(BigDecimal expMesAltaReg) {
        this.expMesAltaReg = expMesAltaReg;
    }

    public BigDecimal getExpMesAltaReg() {
        return this.expMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExpDiaAltaReg(BigDecimal expDiaAltaReg) {
        this.expDiaAltaReg = expDiaAltaReg;
    }

    public BigDecimal getExpDiaAltaReg() {
        return this.expDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExpAnoUltMod(BigDecimal expAnoUltMod) {
        this.expAnoUltMod = expAnoUltMod;
    }

    public BigDecimal getExpAnoUltMod() {
        return this.expAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExpMesUltMod(BigDecimal expMesUltMod) {
        this.expMesUltMod = expMesUltMod;
    }

    public BigDecimal getExpMesUltMod() {
        return this.expMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExpDiaUltMod(BigDecimal expDiaUltMod) {
        this.expDiaUltMod = expDiaUltMod;
    }

    public BigDecimal getExpDiaUltMod() {
        return this.expDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpCveStPerexpe(String expCveStPerexpe) {
        this.expCveStPerexpe = expCveStPerexpe;
    }

    public String getExpCveStPerexpe() {
        return this.expCveStPerexpe;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PEREXPEDIENT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExpNumExpedien() != null && this.getExpNumExpedien().longValue() == -999) {
            conditions += " AND EXP_NUM_EXPEDIEN IS NULL";
        } else if (this.getExpNumExpedien() != null) {
            conditions += " AND EXP_NUM_EXPEDIEN = ?";
            values.add(this.getExpNumExpedien());
        }

        if (this.getExpNumPerito() != null && this.getExpNumPerito().longValue() == -999) {
            conditions += " AND EXP_NUM_PERITO IS NULL";
        } else if (this.getExpNumPerito() != null) {
            conditions += " AND EXP_NUM_PERITO = ?";
            values.add(this.getExpNumPerito());
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
        String sql = "SELECT * FROM PEREXPEDIENT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExpNumExpedien() != null && this.getExpNumExpedien().longValue() == -999) {
            conditions += " AND EXP_NUM_EXPEDIEN IS NULL";
        } else if (this.getExpNumExpedien() != null) {
            conditions += " AND EXP_NUM_EXPEDIEN = ?";
            values.add(this.getExpNumExpedien());
        }

        if (this.getExpNumPerito() != null && this.getExpNumPerito().longValue() == -999) {
            conditions += " AND EXP_NUM_PERITO IS NULL";
        } else if (this.getExpNumPerito() != null) {
            conditions += " AND EXP_NUM_PERITO = ?";
            values.add(this.getExpNumPerito());
        }

        if (this.getExpNumCajon() != null && "null".equals(this.getExpNumCajon())) {
            conditions += " AND EXP_NUM_CAJON IS NULL";
        } else if (this.getExpNumCajon() != null) {
            conditions += " AND EXP_NUM_CAJON = ?";
            values.add(this.getExpNumCajon());
        }

        if (this.getExpObservacion() != null && "null".equals(this.getExpObservacion())) {
            conditions += " AND EXP_OBSERVACION IS NULL";
        } else if (this.getExpObservacion() != null) {
            conditions += " AND EXP_OBSERVACION = ?";
            values.add(this.getExpObservacion());
        }

        if (this.getExpCurriculum() != null && "null".equals(this.getExpCurriculum())) {
            conditions += " AND EXP_CURRICULUM IS NULL";
        } else if (this.getExpCurriculum() != null) {
            conditions += " AND EXP_CURRICULUM = ?";
            values.add(this.getExpCurriculum());
        }

        if (this.getExpActaNacimient() != null && "null".equals(this.getExpActaNacimient())) {
            conditions += " AND EXP_ACTA_NACIMIENT IS NULL";
        } else if (this.getExpActaNacimient() != null) {
            conditions += " AND EXP_ACTA_NACIMIENT = ?";
            values.add(this.getExpActaNacimient());
        }

        if (this.getExpActualizacion() != null && "null".equals(this.getExpActualizacion())) {
            conditions += " AND EXP_ACTUALIZACION IS NULL";
        } else if (this.getExpActualizacion() != null) {
            conditions += " AND EXP_ACTUALIZACION = ?";
            values.add(this.getExpActualizacion());
        }

        if (this.getExpTituloProf() != null && "null".equals(this.getExpTituloProf())) {
            conditions += " AND EXP_TITULO_PROF IS NULL";
        } else if (this.getExpTituloProf() != null) {
            conditions += " AND EXP_TITULO_PROF = ?";
            values.add(this.getExpTituloProf());
        }

        if (this.getExpCedulaProf() != null && "null".equals(this.getExpCedulaProf())) {
            conditions += " AND EXP_CEDULA_PROF IS NULL";
        } else if (this.getExpCedulaProf() != null) {
            conditions += " AND EXP_CEDULA_PROF = ?";
            values.add(this.getExpCedulaProf());
        }

        if (this.getExpInstPromReg() != null && "null".equals(this.getExpInstPromReg())) {
            conditions += " AND EXP_INST_PROM_REG IS NULL";
        } else if (this.getExpInstPromReg() != null) {
            conditions += " AND EXP_INST_PROM_REG = ?";
            values.add(this.getExpInstPromReg());
        }

        if (this.getExpCartasReferen() != null && "null".equals(this.getExpCartasReferen())) {
            conditions += " AND EXP_CARTAS_REFEREN IS NULL";
        } else if (this.getExpCartasReferen() != null) {
            conditions += " AND EXP_CARTAS_REFEREN = ?";
            values.add(this.getExpCartasReferen());
        }

        if (this.getExpCartaTrayecto() != null && "null".equals(this.getExpCartaTrayecto())) {
            conditions += " AND EXP_CARTA_TRAYECTO IS NULL";
        } else if (this.getExpCartaTrayecto() != null) {
            conditions += " AND EXP_CARTA_TRAYECTO = ?";
            values.add(this.getExpCartaTrayecto());
        }

        if (this.getExpAvaluoEspecia() != null && "null".equals(this.getExpAvaluoEspecia())) {
            conditions += " AND EXP_AVALUO_ESPECIA IS NULL";
        } else if (this.getExpAvaluoEspecia() != null) {
            conditions += " AND EXP_AVALUO_ESPECIA = ?";
            values.add(this.getExpAvaluoEspecia());
        }

        if (this.getExpCurp() != null && "null".equals(this.getExpCurp())) {
            conditions += " AND EXP_CURP IS NULL";
        } else if (this.getExpCurp() != null) {
            conditions += " AND EXP_CURP = ?";
            values.add(this.getExpCurp());
        }

        if (this.getExpAnoAltaReg() != null && this.getExpAnoAltaReg().longValue() == -999) {
            conditions += " AND EXP_ANO_ALTA_REG IS NULL";
        } else if (this.getExpAnoAltaReg() != null) {
            conditions += " AND EXP_ANO_ALTA_REG = ?";
            values.add(this.getExpAnoAltaReg());
        }

        if (this.getExpMesAltaReg() != null && this.getExpMesAltaReg().longValue() == -999) {
            conditions += " AND EXP_MES_ALTA_REG IS NULL";
        } else if (this.getExpMesAltaReg() != null) {
            conditions += " AND EXP_MES_ALTA_REG = ?";
            values.add(this.getExpMesAltaReg());
        }

        if (this.getExpDiaAltaReg() != null && this.getExpDiaAltaReg().longValue() == -999) {
            conditions += " AND EXP_DIA_ALTA_REG IS NULL";
        } else if (this.getExpDiaAltaReg() != null) {
            conditions += " AND EXP_DIA_ALTA_REG = ?";
            values.add(this.getExpDiaAltaReg());
        }

        if (this.getExpAnoUltMod() != null && this.getExpAnoUltMod().longValue() == -999) {
            conditions += " AND EXP_ANO_ULT_MOD IS NULL";
        } else if (this.getExpAnoUltMod() != null) {
            conditions += " AND EXP_ANO_ULT_MOD = ?";
            values.add(this.getExpAnoUltMod());
        }

        if (this.getExpMesUltMod() != null && this.getExpMesUltMod().longValue() == -999) {
            conditions += " AND EXP_MES_ULT_MOD IS NULL";
        } else if (this.getExpMesUltMod() != null) {
            conditions += " AND EXP_MES_ULT_MOD = ?";
            values.add(this.getExpMesUltMod());
        }

        if (this.getExpDiaUltMod() != null && this.getExpDiaUltMod().longValue() == -999) {
            conditions += " AND EXP_DIA_ULT_MOD IS NULL";
        } else if (this.getExpDiaUltMod() != null) {
            conditions += " AND EXP_DIA_ULT_MOD = ?";
            values.add(this.getExpDiaUltMod());
        }

        if (this.getExpCveStPerexpe() != null && "null".equals(this.getExpCveStPerexpe())) {
            conditions += " AND EXP_CVE_ST_PEREXPE IS NULL";
        } else if (this.getExpCveStPerexpe() != null) {
            conditions += " AND EXP_CVE_ST_PEREXPE = ?";
            values.add(this.getExpCveStPerexpe());
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
        String sql = "UPDATE PEREXPEDIENT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EXP_NUM_EXPEDIEN = ?";
        pkValues.add(this.getExpNumExpedien());
        conditions += " AND EXP_NUM_PERITO = ?";
        pkValues.add(this.getExpNumPerito());
        fields += " EXP_NUM_CAJON = ?, ";
        values.add(this.getExpNumCajon());
        fields += " EXP_OBSERVACION = ?, ";
        values.add(this.getExpObservacion());
        fields += " EXP_CURRICULUM = ?, ";
        values.add(this.getExpCurriculum());
        fields += " EXP_ACTA_NACIMIENT = ?, ";
        values.add(this.getExpActaNacimient());
        fields += " EXP_ACTUALIZACION = ?, ";
        values.add(this.getExpActualizacion());
        fields += " EXP_TITULO_PROF = ?, ";
        values.add(this.getExpTituloProf());
        fields += " EXP_CEDULA_PROF = ?, ";
        values.add(this.getExpCedulaProf());
        fields += " EXP_INST_PROM_REG = ?, ";
        values.add(this.getExpInstPromReg());
        fields += " EXP_CARTAS_REFEREN = ?, ";
        values.add(this.getExpCartasReferen());
        fields += " EXP_CARTA_TRAYECTO = ?, ";
        values.add(this.getExpCartaTrayecto());
        fields += " EXP_AVALUO_ESPECIA = ?, ";
        values.add(this.getExpAvaluoEspecia());
        fields += " EXP_CURP = ?, ";
        values.add(this.getExpCurp());
        fields += " EXP_ANO_ALTA_REG = ?, ";
        values.add(this.getExpAnoAltaReg());
        fields += " EXP_MES_ALTA_REG = ?, ";
        values.add(this.getExpMesAltaReg());
        fields += " EXP_DIA_ALTA_REG = ?, ";
        values.add(this.getExpDiaAltaReg());
        fields += " EXP_ANO_ULT_MOD = ?, ";
        values.add(this.getExpAnoUltMod());
        fields += " EXP_MES_ULT_MOD = ?, ";
        values.add(this.getExpMesUltMod());
        fields += " EXP_DIA_ULT_MOD = ?, ";
        values.add(this.getExpDiaUltMod());
        fields += " EXP_CVE_ST_PEREXPE = ?, ";
        values.add(this.getExpCveStPerexpe());
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
        String sql = "INSERT INTO PEREXPEDIENT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EXP_NUM_EXPEDIEN";
        fieldValues += ", ?";
        values.add(this.getExpNumExpedien());

        fields += ", EXP_NUM_PERITO";
        fieldValues += ", ?";
        values.add(this.getExpNumPerito());

        fields += ", EXP_NUM_CAJON";
        fieldValues += ", ?";
        values.add(this.getExpNumCajon());

        fields += ", EXP_OBSERVACION";
        fieldValues += ", ?";
        values.add(this.getExpObservacion());

        fields += ", EXP_CURRICULUM";
        fieldValues += ", ?";
        values.add(this.getExpCurriculum());

        fields += ", EXP_ACTA_NACIMIENT";
        fieldValues += ", ?";
        values.add(this.getExpActaNacimient());

        fields += ", EXP_ACTUALIZACION";
        fieldValues += ", ?";
        values.add(this.getExpActualizacion());

        fields += ", EXP_TITULO_PROF";
        fieldValues += ", ?";
        values.add(this.getExpTituloProf());

        fields += ", EXP_CEDULA_PROF";
        fieldValues += ", ?";
        values.add(this.getExpCedulaProf());

        fields += ", EXP_INST_PROM_REG";
        fieldValues += ", ?";
        values.add(this.getExpInstPromReg());

        fields += ", EXP_CARTAS_REFEREN";
        fieldValues += ", ?";
        values.add(this.getExpCartasReferen());

        fields += ", EXP_CARTA_TRAYECTO";
        fieldValues += ", ?";
        values.add(this.getExpCartaTrayecto());

        fields += ", EXP_AVALUO_ESPECIA";
        fieldValues += ", ?";
        values.add(this.getExpAvaluoEspecia());

        fields += ", EXP_CURP";
        fieldValues += ", ?";
        values.add(this.getExpCurp());

        fields += ", EXP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExpAnoAltaReg());

        fields += ", EXP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExpMesAltaReg());

        fields += ", EXP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExpDiaAltaReg());

        fields += ", EXP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExpAnoUltMod());

        fields += ", EXP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExpMesUltMod());

        fields += ", EXP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExpDiaUltMod());

        fields += ", EXP_CVE_ST_PEREXPE";
        fieldValues += ", ?";
        values.add(this.getExpCveStPerexpe());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PEREXPEDIENT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EXP_NUM_EXPEDIEN = ?";
        values.add(this.getExpNumExpedien());
        conditions += " AND EXP_NUM_PERITO = ?";
        values.add(this.getExpNumPerito());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Perexpedient instance = (Perexpedient) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getExpNumExpedien().equals(instance.getExpNumExpedien()))
            equalObjects = false;
        if (equalObjects && !this.getExpNumPerito().equals(instance.getExpNumPerito()))
            equalObjects = false;
        if (equalObjects && !this.getExpNumCajon().equals(instance.getExpNumCajon()))
            equalObjects = false;
        if (equalObjects && !this.getExpObservacion().equals(instance.getExpObservacion()))
            equalObjects = false;
        if (equalObjects && !this.getExpCurriculum().equals(instance.getExpCurriculum()))
            equalObjects = false;
        if (equalObjects && !this.getExpActaNacimient().equals(instance.getExpActaNacimient()))
            equalObjects = false;
        if (equalObjects && !this.getExpActualizacion().equals(instance.getExpActualizacion()))
            equalObjects = false;
        if (equalObjects && !this.getExpTituloProf().equals(instance.getExpTituloProf()))
            equalObjects = false;
        if (equalObjects && !this.getExpCedulaProf().equals(instance.getExpCedulaProf()))
            equalObjects = false;
        if (equalObjects && !this.getExpInstPromReg().equals(instance.getExpInstPromReg()))
            equalObjects = false;
        if (equalObjects && !this.getExpCartasReferen().equals(instance.getExpCartasReferen()))
            equalObjects = false;
        if (equalObjects && !this.getExpCartaTrayecto().equals(instance.getExpCartaTrayecto()))
            equalObjects = false;
        if (equalObjects && !this.getExpAvaluoEspecia().equals(instance.getExpAvaluoEspecia()))
            equalObjects = false;
        if (equalObjects && !this.getExpCurp().equals(instance.getExpCurp()))
            equalObjects = false;
        if (equalObjects && !this.getExpAnoAltaReg().equals(instance.getExpAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExpMesAltaReg().equals(instance.getExpMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExpDiaAltaReg().equals(instance.getExpDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExpAnoUltMod().equals(instance.getExpAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExpMesUltMod().equals(instance.getExpMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExpDiaUltMod().equals(instance.getExpDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExpCveStPerexpe().equals(instance.getExpCveStPerexpe()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Perexpedient result = new Perexpedient();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setExpNumExpedien((BigDecimal) objectData.getData("EXP_NUM_EXPEDIEN"));
        result.setExpNumPerito((BigDecimal) objectData.getData("EXP_NUM_PERITO"));
        result.setExpNumCajon((String) objectData.getData("EXP_NUM_CAJON"));
        result.setExpObservacion((String) objectData.getData("EXP_OBSERVACION"));
        result.setExpCurriculum((String) objectData.getData("EXP_CURRICULUM"));
        result.setExpActaNacimient((String) objectData.getData("EXP_ACTA_NACIMIENT"));
        result.setExpActualizacion((String) objectData.getData("EXP_ACTUALIZACION"));
        result.setExpTituloProf((String) objectData.getData("EXP_TITULO_PROF"));
        result.setExpCedulaProf((String) objectData.getData("EXP_CEDULA_PROF"));
        result.setExpInstPromReg((String) objectData.getData("EXP_INST_PROM_REG"));
        result.setExpCartasReferen((String) objectData.getData("EXP_CARTAS_REFEREN"));
        result.setExpCartaTrayecto((String) objectData.getData("EXP_CARTA_TRAYECTO"));
        result.setExpAvaluoEspecia((String) objectData.getData("EXP_AVALUO_ESPECIA"));
        result.setExpCurp((String) objectData.getData("EXP_CURP"));
        result.setExpAnoAltaReg((BigDecimal) objectData.getData("EXP_ANO_ALTA_REG"));
        result.setExpMesAltaReg((BigDecimal) objectData.getData("EXP_MES_ALTA_REG"));
        result.setExpDiaAltaReg((BigDecimal) objectData.getData("EXP_DIA_ALTA_REG"));
        result.setExpAnoUltMod((BigDecimal) objectData.getData("EXP_ANO_ULT_MOD"));
        result.setExpMesUltMod((BigDecimal) objectData.getData("EXP_MES_ULT_MOD"));
        result.setExpDiaUltMod((BigDecimal) objectData.getData("EXP_DIA_ULT_MOD"));
        result.setExpCveStPerexpe((String) objectData.getData("EXP_CVE_ST_PEREXPE"));

        return result;

    }

}
