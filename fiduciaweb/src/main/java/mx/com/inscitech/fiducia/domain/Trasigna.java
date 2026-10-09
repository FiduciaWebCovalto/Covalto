package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TRASIGNA_PK", columns = { "TAS_NUM_CONTRATO", "TAS_NUM_TRAMITE", "TAS_SEC_TRAMITE" }, sequences = { "MANUAL" })
public class Trasigna extends DomainObject {

    BigDecimal tasNumContrato = null;
    BigDecimal tasNumTramite = null;
    BigDecimal tasSecTramite = null;
    String tasCvePersTram = null;
    BigDecimal tasNumPersTram = null;
    BigDecimal tasImpPagarTram = null;
    String tasComentTramite = null;
    BigDecimal tasAnoInicioTra = null;
    BigDecimal tasMesInicioTra = null;
    BigDecimal tasDiaInicioTra = null;
    BigDecimal tasAnoFinTra = null;
    BigDecimal tasMesFinTra = null;
    BigDecimal tasDiaFinTra = null;
    BigDecimal tasAnoAltaReg = null;
    BigDecimal tasMesAltaReg = null;
    BigDecimal tasDiaAltaReg = null;
    BigDecimal tasAnoUltMod = null;
    BigDecimal tasMesUltMod = null;
    BigDecimal tasDiaUltMod = null;
    String tasCveStTrasign = null;
    BigDecimal tasNumAnteproy = null;

    public Trasigna() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasNumContrato(BigDecimal tasNumContrato) {
        this.tasNumContrato = tasNumContrato;
    }

    public BigDecimal getTasNumContrato() {
        return this.tasNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasNumTramite(BigDecimal tasNumTramite) {
        this.tasNumTramite = tasNumTramite;
    }

    public BigDecimal getTasNumTramite() {
        return this.tasNumTramite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasSecTramite(BigDecimal tasSecTramite) {
        this.tasSecTramite = tasSecTramite;
    }

    public BigDecimal getTasSecTramite() {
        return this.tasSecTramite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTasCvePersTram(String tasCvePersTram) {
        this.tasCvePersTram = tasCvePersTram;
    }

    public String getTasCvePersTram() {
        return this.tasCvePersTram;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasNumPersTram(BigDecimal tasNumPersTram) {
        this.tasNumPersTram = tasNumPersTram;
    }

    public BigDecimal getTasNumPersTram() {
        return this.tasNumPersTram;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTasImpPagarTram(BigDecimal tasImpPagarTram) {
        this.tasImpPagarTram = tasImpPagarTram;
    }

    public BigDecimal getTasImpPagarTram() {
        return this.tasImpPagarTram;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTasComentTramite(String tasComentTramite) {
        this.tasComentTramite = tasComentTramite;
    }

    public String getTasComentTramite() {
        return this.tasComentTramite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasAnoInicioTra(BigDecimal tasAnoInicioTra) {
        this.tasAnoInicioTra = tasAnoInicioTra;
    }

    public BigDecimal getTasAnoInicioTra() {
        return this.tasAnoInicioTra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setTasMesInicioTra(BigDecimal tasMesInicioTra) {
        this.tasMesInicioTra = tasMesInicioTra;
    }

    public BigDecimal getTasMesInicioTra() {
        return this.tasMesInicioTra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setTasDiaInicioTra(BigDecimal tasDiaInicioTra) {
        this.tasDiaInicioTra = tasDiaInicioTra;
    }

    public BigDecimal getTasDiaInicioTra() {
        return this.tasDiaInicioTra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasAnoFinTra(BigDecimal tasAnoFinTra) {
        this.tasAnoFinTra = tasAnoFinTra;
    }

    public BigDecimal getTasAnoFinTra() {
        return this.tasAnoFinTra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setTasMesFinTra(BigDecimal tasMesFinTra) {
        this.tasMesFinTra = tasMesFinTra;
    }

    public BigDecimal getTasMesFinTra() {
        return this.tasMesFinTra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setTasDiaFinTra(BigDecimal tasDiaFinTra) {
        this.tasDiaFinTra = tasDiaFinTra;
    }

    public BigDecimal getTasDiaFinTra() {
        return this.tasDiaFinTra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasAnoAltaReg(BigDecimal tasAnoAltaReg) {
        this.tasAnoAltaReg = tasAnoAltaReg;
    }

    public BigDecimal getTasAnoAltaReg() {
        return this.tasAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setTasMesAltaReg(BigDecimal tasMesAltaReg) {
        this.tasMesAltaReg = tasMesAltaReg;
    }

    public BigDecimal getTasMesAltaReg() {
        return this.tasMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setTasDiaAltaReg(BigDecimal tasDiaAltaReg) {
        this.tasDiaAltaReg = tasDiaAltaReg;
    }

    public BigDecimal getTasDiaAltaReg() {
        return this.tasDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasAnoUltMod(BigDecimal tasAnoUltMod) {
        this.tasAnoUltMod = tasAnoUltMod;
    }

    public BigDecimal getTasAnoUltMod() {
        return this.tasAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setTasMesUltMod(BigDecimal tasMesUltMod) {
        this.tasMesUltMod = tasMesUltMod;
    }

    public BigDecimal getTasMesUltMod() {
        return this.tasMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setTasDiaUltMod(BigDecimal tasDiaUltMod) {
        this.tasDiaUltMod = tasDiaUltMod;
    }

    public BigDecimal getTasDiaUltMod() {
        return this.tasDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTasCveStTrasign(String tasCveStTrasign) {
        this.tasCveStTrasign = tasCveStTrasign;
    }

    public String getTasCveStTrasign() {
        return this.tasCveStTrasign;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTasNumAnteproy(BigDecimal tasNumAnteproy) {
        this.tasNumAnteproy = tasNumAnteproy;
    }

    public BigDecimal getTasNumAnteproy() {
        return this.tasNumAnteproy;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TRASIGNA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTasNumContrato() != null && this.getTasNumContrato().longValue() == -999) {
            conditions += " AND TAS_NUM_CONTRATO IS NULL";
        } else if (this.getTasNumContrato() != null) {
            conditions += " AND TAS_NUM_CONTRATO = ?";
            values.add(this.getTasNumContrato());
        }

        if (this.getTasNumTramite() != null && this.getTasNumTramite().longValue() == -999) {
            conditions += " AND TAS_NUM_TRAMITE IS NULL";
        } else if (this.getTasNumTramite() != null) {
            conditions += " AND TAS_NUM_TRAMITE = ?";
            values.add(this.getTasNumTramite());
        }

        if (this.getTasSecTramite() != null && this.getTasSecTramite().longValue() == -999) {
            conditions += " AND TAS_SEC_TRAMITE IS NULL";
        } else if (this.getTasSecTramite() != null) {
            conditions += " AND TAS_SEC_TRAMITE = ?";
            values.add(this.getTasSecTramite());
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
        String sql = "SELECT * FROM TRASIGNA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTasNumContrato() != null && this.getTasNumContrato().longValue() == -999) {
            conditions += " AND TAS_NUM_CONTRATO IS NULL";
        } else if (this.getTasNumContrato() != null) {
            conditions += " AND TAS_NUM_CONTRATO = ?";
            values.add(this.getTasNumContrato());
        }

        if (this.getTasNumTramite() != null && this.getTasNumTramite().longValue() == -999) {
            conditions += " AND TAS_NUM_TRAMITE IS NULL";
        } else if (this.getTasNumTramite() != null) {
            conditions += " AND TAS_NUM_TRAMITE = ?";
            values.add(this.getTasNumTramite());
        }

        if (this.getTasSecTramite() != null && this.getTasSecTramite().longValue() == -999) {
            conditions += " AND TAS_SEC_TRAMITE IS NULL";
        } else if (this.getTasSecTramite() != null) {
            conditions += " AND TAS_SEC_TRAMITE = ?";
            values.add(this.getTasSecTramite());
        }

        if (this.getTasCvePersTram() != null && "null".equals(this.getTasCvePersTram())) {
            conditions += " AND TAS_CVE_PERS_TRAM IS NULL";
        } else if (this.getTasCvePersTram() != null) {
            conditions += " AND TAS_CVE_PERS_TRAM = ?";
            values.add(this.getTasCvePersTram());
        }

        if (this.getTasNumPersTram() != null && this.getTasNumPersTram().longValue() == -999) {
            conditions += " AND TAS_NUM_PERS_TRAM IS NULL";
        } else if (this.getTasNumPersTram() != null) {
            conditions += " AND TAS_NUM_PERS_TRAM = ?";
            values.add(this.getTasNumPersTram());
        }

        if (this.getTasImpPagarTram() != null && this.getTasImpPagarTram().longValue() == -999) {
            conditions += " AND TAS_IMP_PAGAR_TRAM IS NULL";
        } else if (this.getTasImpPagarTram() != null) {
            conditions += " AND TAS_IMP_PAGAR_TRAM = ?";
            values.add(this.getTasImpPagarTram());
        }

        if (this.getTasComentTramite() != null && "null".equals(this.getTasComentTramite())) {
            conditions += " AND TAS_COMENT_TRAMITE IS NULL";
        } else if (this.getTasComentTramite() != null) {
            conditions += " AND TAS_COMENT_TRAMITE = ?";
            values.add(this.getTasComentTramite());
        }

        if (this.getTasAnoInicioTra() != null && this.getTasAnoInicioTra().longValue() == -999) {
            conditions += " AND TAS_ANO_INICIO_TRA IS NULL";
        } else if (this.getTasAnoInicioTra() != null) {
            conditions += " AND TAS_ANO_INICIO_TRA = ?";
            values.add(this.getTasAnoInicioTra());
        }

        if (this.getTasMesInicioTra() != null && this.getTasMesInicioTra().longValue() == -999) {
            conditions += " AND TAS_MES_INICIO_TRA IS NULL";
        } else if (this.getTasMesInicioTra() != null) {
            conditions += " AND TAS_MES_INICIO_TRA = ?";
            values.add(this.getTasMesInicioTra());
        }

        if (this.getTasDiaInicioTra() != null && this.getTasDiaInicioTra().longValue() == -999) {
            conditions += " AND TAS_DIA_INICIO_TRA IS NULL";
        } else if (this.getTasDiaInicioTra() != null) {
            conditions += " AND TAS_DIA_INICIO_TRA = ?";
            values.add(this.getTasDiaInicioTra());
        }

        if (this.getTasAnoFinTra() != null && this.getTasAnoFinTra().longValue() == -999) {
            conditions += " AND TAS_ANO_FIN_TRA IS NULL";
        } else if (this.getTasAnoFinTra() != null) {
            conditions += " AND TAS_ANO_FIN_TRA = ?";
            values.add(this.getTasAnoFinTra());
        }

        if (this.getTasMesFinTra() != null && this.getTasMesFinTra().longValue() == -999) {
            conditions += " AND TAS_MES_FIN_TRA IS NULL";
        } else if (this.getTasMesFinTra() != null) {
            conditions += " AND TAS_MES_FIN_TRA = ?";
            values.add(this.getTasMesFinTra());
        }

        if (this.getTasDiaFinTra() != null && this.getTasDiaFinTra().longValue() == -999) {
            conditions += " AND TAS_DIA_FIN_TRA IS NULL";
        } else if (this.getTasDiaFinTra() != null) {
            conditions += " AND TAS_DIA_FIN_TRA = ?";
            values.add(this.getTasDiaFinTra());
        }

        if (this.getTasAnoAltaReg() != null && this.getTasAnoAltaReg().longValue() == -999) {
            conditions += " AND TAS_ANO_ALTA_REG IS NULL";
        } else if (this.getTasAnoAltaReg() != null) {
            conditions += " AND TAS_ANO_ALTA_REG = ?";
            values.add(this.getTasAnoAltaReg());
        }

        if (this.getTasMesAltaReg() != null && this.getTasMesAltaReg().longValue() == -999) {
            conditions += " AND TAS_MES_ALTA_REG IS NULL";
        } else if (this.getTasMesAltaReg() != null) {
            conditions += " AND TAS_MES_ALTA_REG = ?";
            values.add(this.getTasMesAltaReg());
        }

        if (this.getTasDiaAltaReg() != null && this.getTasDiaAltaReg().longValue() == -999) {
            conditions += " AND TAS_DIA_ALTA_REG IS NULL";
        } else if (this.getTasDiaAltaReg() != null) {
            conditions += " AND TAS_DIA_ALTA_REG = ?";
            values.add(this.getTasDiaAltaReg());
        }

        if (this.getTasAnoUltMod() != null && this.getTasAnoUltMod().longValue() == -999) {
            conditions += " AND TAS_ANO_ULT_MOD IS NULL";
        } else if (this.getTasAnoUltMod() != null) {
            conditions += " AND TAS_ANO_ULT_MOD = ?";
            values.add(this.getTasAnoUltMod());
        }

        if (this.getTasMesUltMod() != null && this.getTasMesUltMod().longValue() == -999) {
            conditions += " AND TAS_MES_ULT_MOD IS NULL";
        } else if (this.getTasMesUltMod() != null) {
            conditions += " AND TAS_MES_ULT_MOD = ?";
            values.add(this.getTasMesUltMod());
        }

        if (this.getTasDiaUltMod() != null && this.getTasDiaUltMod().longValue() == -999) {
            conditions += " AND TAS_DIA_ULT_MOD IS NULL";
        } else if (this.getTasDiaUltMod() != null) {
            conditions += " AND TAS_DIA_ULT_MOD = ?";
            values.add(this.getTasDiaUltMod());
        }

        if (this.getTasCveStTrasign() != null && "null".equals(this.getTasCveStTrasign())) {
            conditions += " AND TAS_CVE_ST_TRASIGN IS NULL";
        } else if (this.getTasCveStTrasign() != null) {
            conditions += " AND TAS_CVE_ST_TRASIGN = ?";
            values.add(this.getTasCveStTrasign());
        }

        if (this.getTasNumAnteproy() != null && this.getTasNumAnteproy().longValue() == -999) {
            conditions += " AND TAS_NUM_ANTEPROY IS NULL";
        } else if (this.getTasNumAnteproy() != null) {
            conditions += " AND TAS_NUM_ANTEPROY = ?";
            values.add(this.getTasNumAnteproy());
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
        String sql = "UPDATE TRASIGNA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TAS_NUM_CONTRATO = ?";
        pkValues.add(this.getTasNumContrato());
        conditions += " AND TAS_NUM_TRAMITE = ?";
        pkValues.add(this.getTasNumTramite());
        conditions += " AND TAS_SEC_TRAMITE = ?";
        pkValues.add(this.getTasSecTramite());
        fields += " TAS_CVE_PERS_TRAM = ?, ";
        values.add(this.getTasCvePersTram());
        fields += " TAS_NUM_PERS_TRAM = ?, ";
        values.add(this.getTasNumPersTram());
        fields += " TAS_IMP_PAGAR_TRAM = ?, ";
        values.add(this.getTasImpPagarTram());
        fields += " TAS_COMENT_TRAMITE = ?, ";
        values.add(this.getTasComentTramite());
        fields += " TAS_ANO_INICIO_TRA = ?, ";
        values.add(this.getTasAnoInicioTra());
        fields += " TAS_MES_INICIO_TRA = ?, ";
        values.add(this.getTasMesInicioTra());
        fields += " TAS_DIA_INICIO_TRA = ?, ";
        values.add(this.getTasDiaInicioTra());
        fields += " TAS_ANO_FIN_TRA = ?, ";
        values.add(this.getTasAnoFinTra());
        fields += " TAS_MES_FIN_TRA = ?, ";
        values.add(this.getTasMesFinTra());
        fields += " TAS_DIA_FIN_TRA = ?, ";
        values.add(this.getTasDiaFinTra());
        fields += " TAS_ANO_ALTA_REG = ?, ";
        values.add(this.getTasAnoAltaReg());
        fields += " TAS_MES_ALTA_REG = ?, ";
        values.add(this.getTasMesAltaReg());
        fields += " TAS_DIA_ALTA_REG = ?, ";
        values.add(this.getTasDiaAltaReg());
        fields += " TAS_ANO_ULT_MOD = ?, ";
        values.add(this.getTasAnoUltMod());
        fields += " TAS_MES_ULT_MOD = ?, ";
        values.add(this.getTasMesUltMod());
        fields += " TAS_DIA_ULT_MOD = ?, ";
        values.add(this.getTasDiaUltMod());
        fields += " TAS_CVE_ST_TRASIGN = ?, ";
        values.add(this.getTasCveStTrasign());
        fields += " TAS_NUM_ANTEPROY = ?, ";
        values.add(this.getTasNumAnteproy());
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
        String sql = "INSERT INTO TRASIGNA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TAS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getTasNumContrato());

        fields += ", TAS_NUM_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getTasNumTramite());

        fields += ", TAS_SEC_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getTasSecTramite());

        fields += ", TAS_CVE_PERS_TRAM";
        fieldValues += ", ?";
        values.add(this.getTasCvePersTram());

        fields += ", TAS_NUM_PERS_TRAM";
        fieldValues += ", ?";
        values.add(this.getTasNumPersTram());

        fields += ", TAS_IMP_PAGAR_TRAM";
        fieldValues += ", ?";
        values.add(this.getTasImpPagarTram());

        fields += ", TAS_COMENT_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getTasComentTramite());

        fields += ", TAS_ANO_INICIO_TRA";
        fieldValues += ", ?";
        values.add(this.getTasAnoInicioTra());

        fields += ", TAS_MES_INICIO_TRA";
        fieldValues += ", ?";
        values.add(this.getTasMesInicioTra());

        fields += ", TAS_DIA_INICIO_TRA";
        fieldValues += ", ?";
        values.add(this.getTasDiaInicioTra());

        fields += ", TAS_ANO_FIN_TRA";
        fieldValues += ", ?";
        values.add(this.getTasAnoFinTra());

        fields += ", TAS_MES_FIN_TRA";
        fieldValues += ", ?";
        values.add(this.getTasMesFinTra());

        fields += ", TAS_DIA_FIN_TRA";
        fieldValues += ", ?";
        values.add(this.getTasDiaFinTra());

        fields += ", TAS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTasAnoAltaReg());

        fields += ", TAS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTasMesAltaReg());

        fields += ", TAS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTasDiaAltaReg());

        fields += ", TAS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTasAnoUltMod());

        fields += ", TAS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTasMesUltMod());

        fields += ", TAS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTasDiaUltMod());

        fields += ", TAS_CVE_ST_TRASIGN";
        fieldValues += ", ?";
        values.add(this.getTasCveStTrasign());

        fields += ", TAS_NUM_ANTEPROY";
        fieldValues += ", ?";
        values.add(this.getTasNumAnteproy());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TRASIGNA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TAS_NUM_CONTRATO = ?";
        values.add(this.getTasNumContrato());
        conditions += " AND TAS_NUM_TRAMITE = ?";
        values.add(this.getTasNumTramite());
        conditions += " AND TAS_SEC_TRAMITE = ?";
        values.add(this.getTasSecTramite());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Trasigna instance = (Trasigna) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTasNumContrato().equals(instance.getTasNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getTasNumTramite().equals(instance.getTasNumTramite()))
            equalObjects = false;
        if (equalObjects && !this.getTasSecTramite().equals(instance.getTasSecTramite()))
            equalObjects = false;
        if (equalObjects && !this.getTasCvePersTram().equals(instance.getTasCvePersTram()))
            equalObjects = false;
        if (equalObjects && !this.getTasNumPersTram().equals(instance.getTasNumPersTram()))
            equalObjects = false;
        if (equalObjects && !this.getTasImpPagarTram().equals(instance.getTasImpPagarTram()))
            equalObjects = false;
        if (equalObjects && !this.getTasComentTramite().equals(instance.getTasComentTramite()))
            equalObjects = false;
        if (equalObjects && !this.getTasAnoInicioTra().equals(instance.getTasAnoInicioTra()))
            equalObjects = false;
        if (equalObjects && !this.getTasMesInicioTra().equals(instance.getTasMesInicioTra()))
            equalObjects = false;
        if (equalObjects && !this.getTasDiaInicioTra().equals(instance.getTasDiaInicioTra()))
            equalObjects = false;
        if (equalObjects && !this.getTasAnoFinTra().equals(instance.getTasAnoFinTra()))
            equalObjects = false;
        if (equalObjects && !this.getTasMesFinTra().equals(instance.getTasMesFinTra()))
            equalObjects = false;
        if (equalObjects && !this.getTasDiaFinTra().equals(instance.getTasDiaFinTra()))
            equalObjects = false;
        if (equalObjects && !this.getTasAnoAltaReg().equals(instance.getTasAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTasMesAltaReg().equals(instance.getTasMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTasDiaAltaReg().equals(instance.getTasDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTasAnoUltMod().equals(instance.getTasAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTasMesUltMod().equals(instance.getTasMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTasDiaUltMod().equals(instance.getTasDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTasCveStTrasign().equals(instance.getTasCveStTrasign()))
            equalObjects = false;
        if (equalObjects && !this.getTasNumAnteproy().equals(instance.getTasNumAnteproy()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Trasigna result = new Trasigna();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTasNumContrato((BigDecimal) objectData.getData("TAS_NUM_CONTRATO"));
        result.setTasNumTramite((BigDecimal) objectData.getData("TAS_NUM_TRAMITE"));
        result.setTasSecTramite((BigDecimal) objectData.getData("TAS_SEC_TRAMITE"));
        result.setTasCvePersTram((String) objectData.getData("TAS_CVE_PERS_TRAM"));
        result.setTasNumPersTram((BigDecimal) objectData.getData("TAS_NUM_PERS_TRAM"));
        result.setTasImpPagarTram((BigDecimal) objectData.getData("TAS_IMP_PAGAR_TRAM"));
        result.setTasComentTramite((String) objectData.getData("TAS_COMENT_TRAMITE"));
        result.setTasAnoInicioTra((BigDecimal) objectData.getData("TAS_ANO_INICIO_TRA"));
        result.setTasMesInicioTra((BigDecimal) objectData.getData("TAS_MES_INICIO_TRA"));
        result.setTasDiaInicioTra((BigDecimal) objectData.getData("TAS_DIA_INICIO_TRA"));
        result.setTasAnoFinTra((BigDecimal) objectData.getData("TAS_ANO_FIN_TRA"));
        result.setTasMesFinTra((BigDecimal) objectData.getData("TAS_MES_FIN_TRA"));
        result.setTasDiaFinTra((BigDecimal) objectData.getData("TAS_DIA_FIN_TRA"));
        result.setTasAnoAltaReg((BigDecimal) objectData.getData("TAS_ANO_ALTA_REG"));
        result.setTasMesAltaReg((BigDecimal) objectData.getData("TAS_MES_ALTA_REG"));
        result.setTasDiaAltaReg((BigDecimal) objectData.getData("TAS_DIA_ALTA_REG"));
        result.setTasAnoUltMod((BigDecimal) objectData.getData("TAS_ANO_ULT_MOD"));
        result.setTasMesUltMod((BigDecimal) objectData.getData("TAS_MES_ULT_MOD"));
        result.setTasDiaUltMod((BigDecimal) objectData.getData("TAS_DIA_ULT_MOD"));
        result.setTasCveStTrasign((String) objectData.getData("TAS_CVE_ST_TRASIGN"));
        result.setTasNumAnteproy((BigDecimal) objectData.getData("TAS_NUM_ANTEPROY"));

        return result;

    }

}
