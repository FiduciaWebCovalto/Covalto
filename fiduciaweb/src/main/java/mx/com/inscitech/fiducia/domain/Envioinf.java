package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ENVIOINF_PK", columns = { "ENV_NUM_SEC_DIREC", "ENV_CVE_PERS_FID", "ENV_NUM_REPORTE", "ENV_NUM_PERS_FID", "ENV_NUM_CONTRATO" },
            sequences = { "MANUAL" })
public class Envioinf extends DomainObject {

    BigDecimal envNumContrato = null;
    String envCvePersFid = null;
    BigDecimal envNumPersFid = null;
    String envCveTipoDomic = null;
    BigDecimal envNumSecDirec = null;
    BigDecimal envNumReporte = null;
    String envCvePerEnvIn = null;
    BigDecimal envCveImpresion = null;
    BigDecimal envCveDiskette = null;
    BigDecimal envCveCinta = null;
    BigDecimal envAnoProxEmis = null;
    BigDecimal envMesProxEmis = null;
    BigDecimal envDiaProxEmis = null;
    BigDecimal envAnoAltaReg = null;
    BigDecimal envMesAltaReg = null;
    BigDecimal envDiaAltaReg = null;
    BigDecimal envAnoUltMod = null;
    BigDecimal envMesUltMod = null;
    BigDecimal envDiaUltMod = null;
    String envCveStEnvioin = null;

    public Envioinf() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvNumContrato(BigDecimal envNumContrato) {
        this.envNumContrato = envNumContrato;
    }

    public BigDecimal getEnvNumContrato() {
        return this.envNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvCvePersFid(String envCvePersFid) {
        this.envCvePersFid = envCvePersFid;
    }

    public String getEnvCvePersFid() {
        return this.envCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvNumPersFid(BigDecimal envNumPersFid) {
        this.envNumPersFid = envNumPersFid;
    }

    public BigDecimal getEnvNumPersFid() {
        return this.envNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvCveTipoDomic(String envCveTipoDomic) {
        this.envCveTipoDomic = envCveTipoDomic;
    }

    public String getEnvCveTipoDomic() {
        return this.envCveTipoDomic;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvNumSecDirec(BigDecimal envNumSecDirec) {
        this.envNumSecDirec = envNumSecDirec;
    }

    public BigDecimal getEnvNumSecDirec() {
        return this.envNumSecDirec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvNumReporte(BigDecimal envNumReporte) {
        this.envNumReporte = envNumReporte;
    }

    public BigDecimal getEnvNumReporte() {
        return this.envNumReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvCvePerEnvIn(String envCvePerEnvIn) {
        this.envCvePerEnvIn = envCvePerEnvIn;
    }

    public String getEnvCvePerEnvIn() {
        return this.envCvePerEnvIn;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvCveImpresion(BigDecimal envCveImpresion) {
        this.envCveImpresion = envCveImpresion;
    }

    public BigDecimal getEnvCveImpresion() {
        return this.envCveImpresion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvCveDiskette(BigDecimal envCveDiskette) {
        this.envCveDiskette = envCveDiskette;
    }

    public BigDecimal getEnvCveDiskette() {
        return this.envCveDiskette;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEnvCveCinta(BigDecimal envCveCinta) {
        this.envCveCinta = envCveCinta;
    }

    public BigDecimal getEnvCveCinta() {
        return this.envCveCinta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEnvAnoProxEmis(BigDecimal envAnoProxEmis) {
        this.envAnoProxEmis = envAnoProxEmis;
    }

    public BigDecimal getEnvAnoProxEmis() {
        return this.envAnoProxEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEnvMesProxEmis(BigDecimal envMesProxEmis) {
        this.envMesProxEmis = envMesProxEmis;
    }

    public BigDecimal getEnvMesProxEmis() {
        return this.envMesProxEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEnvDiaProxEmis(BigDecimal envDiaProxEmis) {
        this.envDiaProxEmis = envDiaProxEmis;
    }

    public BigDecimal getEnvDiaProxEmis() {
        return this.envDiaProxEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEnvAnoAltaReg(BigDecimal envAnoAltaReg) {
        this.envAnoAltaReg = envAnoAltaReg;
    }

    public BigDecimal getEnvAnoAltaReg() {
        return this.envAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEnvMesAltaReg(BigDecimal envMesAltaReg) {
        this.envMesAltaReg = envMesAltaReg;
    }

    public BigDecimal getEnvMesAltaReg() {
        return this.envMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEnvDiaAltaReg(BigDecimal envDiaAltaReg) {
        this.envDiaAltaReg = envDiaAltaReg;
    }

    public BigDecimal getEnvDiaAltaReg() {
        return this.envDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEnvAnoUltMod(BigDecimal envAnoUltMod) {
        this.envAnoUltMod = envAnoUltMod;
    }

    public BigDecimal getEnvAnoUltMod() {
        return this.envAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEnvMesUltMod(BigDecimal envMesUltMod) {
        this.envMesUltMod = envMesUltMod;
    }

    public BigDecimal getEnvMesUltMod() {
        return this.envMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEnvDiaUltMod(BigDecimal envDiaUltMod) {
        this.envDiaUltMod = envDiaUltMod;
    }

    public BigDecimal getEnvDiaUltMod() {
        return this.envDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEnvCveStEnvioin(String envCveStEnvioin) {
        this.envCveStEnvioin = envCveStEnvioin;
    }

    public String getEnvCveStEnvioin() {
        return this.envCveStEnvioin;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ENVIOINF ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEnvNumContrato() != null && this.getEnvNumContrato().longValue() == -999) {
            conditions += " AND ENV_NUM_CONTRATO IS NULL";
        } else if (this.getEnvNumContrato() != null) {
            conditions += " AND ENV_NUM_CONTRATO = ?";
            values.add(this.getEnvNumContrato());
        }

        if (this.getEnvCvePersFid() != null && "null".equals(this.getEnvCvePersFid())) {
            conditions += " AND ENV_CVE_PERS_FID IS NULL";
        } else if (this.getEnvCvePersFid() != null) {
            conditions += " AND ENV_CVE_PERS_FID = ?";
            values.add(this.getEnvCvePersFid());
        }

        if (this.getEnvNumPersFid() != null && this.getEnvNumPersFid().longValue() == -999) {
            conditions += " AND ENV_NUM_PERS_FID IS NULL";
        } else if (this.getEnvNumPersFid() != null) {
            conditions += " AND ENV_NUM_PERS_FID = ?";
            values.add(this.getEnvNumPersFid());
        }

        if (this.getEnvNumSecDirec() != null && this.getEnvNumSecDirec().longValue() == -999) {
            conditions += " AND ENV_NUM_SEC_DIREC IS NULL";
        } else if (this.getEnvNumSecDirec() != null) {
            conditions += " AND ENV_NUM_SEC_DIREC = ?";
            values.add(this.getEnvNumSecDirec());
        }

        if (this.getEnvNumReporte() != null && this.getEnvNumReporte().longValue() == -999) {
            conditions += " AND ENV_NUM_REPORTE IS NULL";
        } else if (this.getEnvNumReporte() != null) {
            conditions += " AND ENV_NUM_REPORTE = ?";
            values.add(this.getEnvNumReporte());
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
        String sql = "SELECT * FROM ENVIOINF ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEnvNumContrato() != null && this.getEnvNumContrato().longValue() == -999) {
            conditions += " AND ENV_NUM_CONTRATO IS NULL";
        } else if (this.getEnvNumContrato() != null) {
            conditions += " AND ENV_NUM_CONTRATO = ?";
            values.add(this.getEnvNumContrato());
        }

        if (this.getEnvCvePersFid() != null && "null".equals(this.getEnvCvePersFid())) {
            conditions += " AND ENV_CVE_PERS_FID IS NULL";
        } else if (this.getEnvCvePersFid() != null) {
            conditions += " AND ENV_CVE_PERS_FID = ?";
            values.add(this.getEnvCvePersFid());
        }

        if (this.getEnvNumPersFid() != null && this.getEnvNumPersFid().longValue() == -999) {
            conditions += " AND ENV_NUM_PERS_FID IS NULL";
        } else if (this.getEnvNumPersFid() != null) {
            conditions += " AND ENV_NUM_PERS_FID = ?";
            values.add(this.getEnvNumPersFid());
        }

        if (this.getEnvCveTipoDomic() != null && "null".equals(this.getEnvCveTipoDomic())) {
            conditions += " AND ENV_CVE_TIPO_DOMIC IS NULL";
        } else if (this.getEnvCveTipoDomic() != null) {
            conditions += " AND ENV_CVE_TIPO_DOMIC = ?";
            values.add(this.getEnvCveTipoDomic());
        }

        if (this.getEnvNumSecDirec() != null && this.getEnvNumSecDirec().longValue() == -999) {
            conditions += " AND ENV_NUM_SEC_DIREC IS NULL";
        } else if (this.getEnvNumSecDirec() != null) {
            conditions += " AND ENV_NUM_SEC_DIREC = ?";
            values.add(this.getEnvNumSecDirec());
        }

        if (this.getEnvNumReporte() != null && this.getEnvNumReporte().longValue() == -999) {
            conditions += " AND ENV_NUM_REPORTE IS NULL";
        } else if (this.getEnvNumReporte() != null) {
            conditions += " AND ENV_NUM_REPORTE = ?";
            values.add(this.getEnvNumReporte());
        }

        if (this.getEnvCvePerEnvIn() != null && "null".equals(this.getEnvCvePerEnvIn())) {
            conditions += " AND ENV_CVE_PER_ENV_IN IS NULL";
        } else if (this.getEnvCvePerEnvIn() != null) {
            conditions += " AND ENV_CVE_PER_ENV_IN = ?";
            values.add(this.getEnvCvePerEnvIn());
        }

        if (this.getEnvCveImpresion() != null && this.getEnvCveImpresion().longValue() == -999) {
            conditions += " AND ENV_CVE_IMPRESION IS NULL";
        } else if (this.getEnvCveImpresion() != null) {
            conditions += " AND ENV_CVE_IMPRESION = ?";
            values.add(this.getEnvCveImpresion());
        }

        if (this.getEnvCveDiskette() != null && this.getEnvCveDiskette().longValue() == -999) {
            conditions += " AND ENV_CVE_DISKETTE IS NULL";
        } else if (this.getEnvCveDiskette() != null) {
            conditions += " AND ENV_CVE_DISKETTE = ?";
            values.add(this.getEnvCveDiskette());
        }

        if (this.getEnvCveCinta() != null && this.getEnvCveCinta().longValue() == -999) {
            conditions += " AND ENV_CVE_CINTA IS NULL";
        } else if (this.getEnvCveCinta() != null) {
            conditions += " AND ENV_CVE_CINTA = ?";
            values.add(this.getEnvCveCinta());
        }

        if (this.getEnvAnoProxEmis() != null && this.getEnvAnoProxEmis().longValue() == -999) {
            conditions += " AND ENV_ANO_PROX_EMIS IS NULL";
        } else if (this.getEnvAnoProxEmis() != null) {
            conditions += " AND ENV_ANO_PROX_EMIS = ?";
            values.add(this.getEnvAnoProxEmis());
        }

        if (this.getEnvMesProxEmis() != null && this.getEnvMesProxEmis().longValue() == -999) {
            conditions += " AND ENV_MES_PROX_EMIS IS NULL";
        } else if (this.getEnvMesProxEmis() != null) {
            conditions += " AND ENV_MES_PROX_EMIS = ?";
            values.add(this.getEnvMesProxEmis());
        }

        if (this.getEnvDiaProxEmis() != null && this.getEnvDiaProxEmis().longValue() == -999) {
            conditions += " AND ENV_DIA_PROX_EMIS IS NULL";
        } else if (this.getEnvDiaProxEmis() != null) {
            conditions += " AND ENV_DIA_PROX_EMIS = ?";
            values.add(this.getEnvDiaProxEmis());
        }

        if (this.getEnvAnoAltaReg() != null && this.getEnvAnoAltaReg().longValue() == -999) {
            conditions += " AND ENV_ANO_ALTA_REG IS NULL";
        } else if (this.getEnvAnoAltaReg() != null) {
            conditions += " AND ENV_ANO_ALTA_REG = ?";
            values.add(this.getEnvAnoAltaReg());
        }

        if (this.getEnvMesAltaReg() != null && this.getEnvMesAltaReg().longValue() == -999) {
            conditions += " AND ENV_MES_ALTA_REG IS NULL";
        } else if (this.getEnvMesAltaReg() != null) {
            conditions += " AND ENV_MES_ALTA_REG = ?";
            values.add(this.getEnvMesAltaReg());
        }

        if (this.getEnvDiaAltaReg() != null && this.getEnvDiaAltaReg().longValue() == -999) {
            conditions += " AND ENV_DIA_ALTA_REG IS NULL";
        } else if (this.getEnvDiaAltaReg() != null) {
            conditions += " AND ENV_DIA_ALTA_REG = ?";
            values.add(this.getEnvDiaAltaReg());
        }

        if (this.getEnvAnoUltMod() != null && this.getEnvAnoUltMod().longValue() == -999) {
            conditions += " AND ENV_ANO_ULT_MOD IS NULL";
        } else if (this.getEnvAnoUltMod() != null) {
            conditions += " AND ENV_ANO_ULT_MOD = ?";
            values.add(this.getEnvAnoUltMod());
        }

        if (this.getEnvMesUltMod() != null && this.getEnvMesUltMod().longValue() == -999) {
            conditions += " AND ENV_MES_ULT_MOD IS NULL";
        } else if (this.getEnvMesUltMod() != null) {
            conditions += " AND ENV_MES_ULT_MOD = ?";
            values.add(this.getEnvMesUltMod());
        }

        if (this.getEnvDiaUltMod() != null && this.getEnvDiaUltMod().longValue() == -999) {
            conditions += " AND ENV_DIA_ULT_MOD IS NULL";
        } else if (this.getEnvDiaUltMod() != null) {
            conditions += " AND ENV_DIA_ULT_MOD = ?";
            values.add(this.getEnvDiaUltMod());
        }

        if (this.getEnvCveStEnvioin() != null && "null".equals(this.getEnvCveStEnvioin())) {
            conditions += " AND ENV_CVE_ST_ENVIOIN IS NULL";
        } else if (this.getEnvCveStEnvioin() != null) {
            conditions += " AND ENV_CVE_ST_ENVIOIN = ?";
            values.add(this.getEnvCveStEnvioin());
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
        String sql = "UPDATE ENVIOINF SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ENV_NUM_CONTRATO = ?";
        pkValues.add(this.getEnvNumContrato());
        conditions += " AND ENV_CVE_PERS_FID = ?";
        pkValues.add(this.getEnvCvePersFid());
        conditions += " AND ENV_NUM_PERS_FID = ?";
        pkValues.add(this.getEnvNumPersFid());
        fields += " ENV_CVE_TIPO_DOMIC = ?, ";
        values.add(this.getEnvCveTipoDomic());
        conditions += " AND ENV_NUM_SEC_DIREC = ?";
        pkValues.add(this.getEnvNumSecDirec());
        conditions += " AND ENV_NUM_REPORTE = ?";
        pkValues.add(this.getEnvNumReporte());
        fields += " ENV_CVE_PER_ENV_IN = ?, ";
        values.add(this.getEnvCvePerEnvIn());
        fields += " ENV_CVE_IMPRESION = ?, ";
        values.add(this.getEnvCveImpresion());
        fields += " ENV_CVE_DISKETTE = ?, ";
        values.add(this.getEnvCveDiskette());
        fields += " ENV_CVE_CINTA = ?, ";
        values.add(this.getEnvCveCinta());
        fields += " ENV_ANO_PROX_EMIS = ?, ";
        values.add(this.getEnvAnoProxEmis());
        fields += " ENV_MES_PROX_EMIS = ?, ";
        values.add(this.getEnvMesProxEmis());
        fields += " ENV_DIA_PROX_EMIS = ?, ";
        values.add(this.getEnvDiaProxEmis());
        fields += " ENV_ANO_ALTA_REG = ?, ";
        values.add(this.getEnvAnoAltaReg());
        fields += " ENV_MES_ALTA_REG = ?, ";
        values.add(this.getEnvMesAltaReg());
        fields += " ENV_DIA_ALTA_REG = ?, ";
        values.add(this.getEnvDiaAltaReg());
        fields += " ENV_ANO_ULT_MOD = ?, ";
        values.add(this.getEnvAnoUltMod());
        fields += " ENV_MES_ULT_MOD = ?, ";
        values.add(this.getEnvMesUltMod());
        fields += " ENV_DIA_ULT_MOD = ?, ";
        values.add(this.getEnvDiaUltMod());
        fields += " ENV_CVE_ST_ENVIOIN = ?, ";
        values.add(this.getEnvCveStEnvioin());
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
        String sql = "INSERT INTO ENVIOINF ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ENV_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getEnvNumContrato());

        fields += ", ENV_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getEnvCvePersFid());

        fields += ", ENV_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getEnvNumPersFid());

        fields += ", ENV_CVE_TIPO_DOMIC";
        fieldValues += ", ?";
        values.add(this.getEnvCveTipoDomic());

        fields += ", ENV_NUM_SEC_DIREC";
        fieldValues += ", ?";
        values.add(this.getEnvNumSecDirec());

        fields += ", ENV_NUM_REPORTE";
        fieldValues += ", ?";
        values.add(this.getEnvNumReporte());

        fields += ", ENV_CVE_PER_ENV_IN";
        fieldValues += ", ?";
        values.add(this.getEnvCvePerEnvIn());

        fields += ", ENV_CVE_IMPRESION";
        fieldValues += ", ?";
        values.add(this.getEnvCveImpresion());

        fields += ", ENV_CVE_DISKETTE";
        fieldValues += ", ?";
        values.add(this.getEnvCveDiskette());

        fields += ", ENV_CVE_CINTA";
        fieldValues += ", ?";
        values.add(this.getEnvCveCinta());

        fields += ", ENV_ANO_PROX_EMIS";
        fieldValues += ", ?";
        values.add(this.getEnvAnoProxEmis());

        fields += ", ENV_MES_PROX_EMIS";
        fieldValues += ", ?";
        values.add(this.getEnvMesProxEmis());

        fields += ", ENV_DIA_PROX_EMIS";
        fieldValues += ", ?";
        values.add(this.getEnvDiaProxEmis());

        fields += ", ENV_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEnvAnoAltaReg());

        fields += ", ENV_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEnvMesAltaReg());

        fields += ", ENV_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEnvDiaAltaReg());

        fields += ", ENV_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEnvAnoUltMod());

        fields += ", ENV_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEnvMesUltMod());

        fields += ", ENV_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEnvDiaUltMod());

        fields += ", ENV_CVE_ST_ENVIOIN";
        fieldValues += ", ?";
        values.add(this.getEnvCveStEnvioin());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ENVIOINF WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ENV_NUM_CONTRATO = ?";
        values.add(this.getEnvNumContrato());
        conditions += " AND ENV_CVE_PERS_FID = ?";
        values.add(this.getEnvCvePersFid());
        conditions += " AND ENV_NUM_PERS_FID = ?";
        values.add(this.getEnvNumPersFid());
        conditions += " AND ENV_NUM_SEC_DIREC = ?";
        values.add(this.getEnvNumSecDirec());
        conditions += " AND ENV_NUM_REPORTE = ?";
        values.add(this.getEnvNumReporte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Envioinf instance = (Envioinf) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEnvNumContrato().equals(instance.getEnvNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEnvCvePersFid().equals(instance.getEnvCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getEnvNumPersFid().equals(instance.getEnvNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getEnvCveTipoDomic().equals(instance.getEnvCveTipoDomic()))
            equalObjects = false;
        if (equalObjects && !this.getEnvNumSecDirec().equals(instance.getEnvNumSecDirec()))
            equalObjects = false;
        if (equalObjects && !this.getEnvNumReporte().equals(instance.getEnvNumReporte()))
            equalObjects = false;
        if (equalObjects && !this.getEnvCvePerEnvIn().equals(instance.getEnvCvePerEnvIn()))
            equalObjects = false;
        if (equalObjects && !this.getEnvCveImpresion().equals(instance.getEnvCveImpresion()))
            equalObjects = false;
        if (equalObjects && !this.getEnvCveDiskette().equals(instance.getEnvCveDiskette()))
            equalObjects = false;
        if (equalObjects && !this.getEnvCveCinta().equals(instance.getEnvCveCinta()))
            equalObjects = false;
        if (equalObjects && !this.getEnvAnoProxEmis().equals(instance.getEnvAnoProxEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEnvMesProxEmis().equals(instance.getEnvMesProxEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEnvDiaProxEmis().equals(instance.getEnvDiaProxEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEnvAnoAltaReg().equals(instance.getEnvAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEnvMesAltaReg().equals(instance.getEnvMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEnvDiaAltaReg().equals(instance.getEnvDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEnvAnoUltMod().equals(instance.getEnvAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEnvMesUltMod().equals(instance.getEnvMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEnvDiaUltMod().equals(instance.getEnvDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEnvCveStEnvioin().equals(instance.getEnvCveStEnvioin()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Envioinf result = new Envioinf();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEnvNumContrato((BigDecimal) objectData.getData("ENV_NUM_CONTRATO"));
        result.setEnvCvePersFid((String) objectData.getData("ENV_CVE_PERS_FID"));
        result.setEnvNumPersFid((BigDecimal) objectData.getData("ENV_NUM_PERS_FID"));
        result.setEnvCveTipoDomic((String) objectData.getData("ENV_CVE_TIPO_DOMIC"));
        result.setEnvNumSecDirec((BigDecimal) objectData.getData("ENV_NUM_SEC_DIREC"));
        result.setEnvNumReporte((BigDecimal) objectData.getData("ENV_NUM_REPORTE"));
        result.setEnvCvePerEnvIn((String) objectData.getData("ENV_CVE_PER_ENV_IN"));
        result.setEnvCveImpresion((BigDecimal) objectData.getData("ENV_CVE_IMPRESION"));
        result.setEnvCveDiskette((BigDecimal) objectData.getData("ENV_CVE_DISKETTE"));
        result.setEnvCveCinta((BigDecimal) objectData.getData("ENV_CVE_CINTA"));
        result.setEnvAnoProxEmis((BigDecimal) objectData.getData("ENV_ANO_PROX_EMIS"));
        result.setEnvMesProxEmis((BigDecimal) objectData.getData("ENV_MES_PROX_EMIS"));
        result.setEnvDiaProxEmis((BigDecimal) objectData.getData("ENV_DIA_PROX_EMIS"));
        result.setEnvAnoAltaReg((BigDecimal) objectData.getData("ENV_ANO_ALTA_REG"));
        result.setEnvMesAltaReg((BigDecimal) objectData.getData("ENV_MES_ALTA_REG"));
        result.setEnvDiaAltaReg((BigDecimal) objectData.getData("ENV_DIA_ALTA_REG"));
        result.setEnvAnoUltMod((BigDecimal) objectData.getData("ENV_ANO_ULT_MOD"));
        result.setEnvMesUltMod((BigDecimal) objectData.getData("ENV_MES_ULT_MOD"));
        result.setEnvDiaUltMod((BigDecimal) objectData.getData("ENV_DIA_ULT_MOD"));
        result.setEnvCveStEnvioin((String) objectData.getData("ENV_CVE_ST_ENVIOIN"));

        return result;

    }

}
