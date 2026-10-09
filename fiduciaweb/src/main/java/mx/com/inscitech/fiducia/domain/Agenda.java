package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AGENDA_PK", columns = { "AGE_NUM_FOLIO" }, sequences = { "MAX" })
public class Agenda extends DomainObject {

    BigDecimal ageNumFolio = null;
    BigDecimal ageNumContrato = null;
    BigDecimal ageSubContrato = null;
    String ageDesInstruc = null;
    BigDecimal ageNumUsuario = null;
    Long ageTextInst = null;
    String ageCvePerioInst = null;
    BigDecimal ageCveInstSis = null;
    BigDecimal ageInstrucOrigen = null;
    BigDecimal ageNumEventos = null;
    BigDecimal ageEventosTrans = null;
    BigDecimal ageAnoIniInst = null;
    BigDecimal ageMesIniInst = null;
    BigDecimal ageDiaIniInst = null;
    BigDecimal ageAnoFinInst = null;
    BigDecimal ageMesFinInst = null;
    BigDecimal ageDiaFinInst = null;
    BigDecimal ageAnoProxApli = null;
    BigDecimal ageMesProxApli = null;
    BigDecimal ageDiaProxApli = null;
    String ageCveStInst = null;
    String ageRespAtencion = null;

    public Agenda() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAgeNumFolio(BigDecimal ageNumFolio) {
        this.ageNumFolio = ageNumFolio;
    }

    public BigDecimal getAgeNumFolio() {
        return this.ageNumFolio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAgeNumContrato(BigDecimal ageNumContrato) {
        this.ageNumContrato = ageNumContrato;
    }

    public BigDecimal getAgeNumContrato() {
        return this.ageNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAgeSubContrato(BigDecimal ageSubContrato) {
        this.ageSubContrato = ageSubContrato;
    }

    public BigDecimal getAgeSubContrato() {
        return this.ageSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAgeDesInstruc(String ageDesInstruc) {
        this.ageDesInstruc = ageDesInstruc;
    }

    public String getAgeDesInstruc() {
        return this.ageDesInstruc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAgeNumUsuario(BigDecimal ageNumUsuario) {
        this.ageNumUsuario = ageNumUsuario;
    }

    public BigDecimal getAgeNumUsuario() {
        return this.ageNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setAgeTextInst(Long ageTextInst) {
        this.ageTextInst = ageTextInst;
    }

    public Long getAgeTextInst() {
        return this.ageTextInst;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAgeCvePerioInst(String ageCvePerioInst) {
        this.ageCvePerioInst = ageCvePerioInst;
    }

    public String getAgeCvePerioInst() {
        return this.ageCvePerioInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAgeCveInstSis(BigDecimal ageCveInstSis) {
        this.ageCveInstSis = ageCveInstSis;
    }

    public BigDecimal getAgeCveInstSis() {
        return this.ageCveInstSis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAgeInstrucOrigen(BigDecimal ageInstrucOrigen) {
        this.ageInstrucOrigen = ageInstrucOrigen;
    }

    public BigDecimal getAgeInstrucOrigen() {
        return this.ageInstrucOrigen;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAgeNumEventos(BigDecimal ageNumEventos) {
        this.ageNumEventos = ageNumEventos;
    }

    public BigDecimal getAgeNumEventos() {
        return this.ageNumEventos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAgeEventosTrans(BigDecimal ageEventosTrans) {
        this.ageEventosTrans = ageEventosTrans;
    }

    public BigDecimal getAgeEventosTrans() {
        return this.ageEventosTrans;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAgeAnoIniInst(BigDecimal ageAnoIniInst) {
        this.ageAnoIniInst = ageAnoIniInst;
    }

    public BigDecimal getAgeAnoIniInst() {
        return this.ageAnoIniInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAgeMesIniInst(BigDecimal ageMesIniInst) {
        this.ageMesIniInst = ageMesIniInst;
    }

    public BigDecimal getAgeMesIniInst() {
        return this.ageMesIniInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAgeDiaIniInst(BigDecimal ageDiaIniInst) {
        this.ageDiaIniInst = ageDiaIniInst;
    }

    public BigDecimal getAgeDiaIniInst() {
        return this.ageDiaIniInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAgeAnoFinInst(BigDecimal ageAnoFinInst) {
        this.ageAnoFinInst = ageAnoFinInst;
    }

    public BigDecimal getAgeAnoFinInst() {
        return this.ageAnoFinInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAgeMesFinInst(BigDecimal ageMesFinInst) {
        this.ageMesFinInst = ageMesFinInst;
    }

    public BigDecimal getAgeMesFinInst() {
        return this.ageMesFinInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAgeDiaFinInst(BigDecimal ageDiaFinInst) {
        this.ageDiaFinInst = ageDiaFinInst;
    }

    public BigDecimal getAgeDiaFinInst() {
        return this.ageDiaFinInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAgeAnoProxApli(BigDecimal ageAnoProxApli) {
        this.ageAnoProxApli = ageAnoProxApli;
    }

    public BigDecimal getAgeAnoProxApli() {
        return this.ageAnoProxApli;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAgeMesProxApli(BigDecimal ageMesProxApli) {
        this.ageMesProxApli = ageMesProxApli;
    }

    public BigDecimal getAgeMesProxApli() {
        return this.ageMesProxApli;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAgeDiaProxApli(BigDecimal ageDiaProxApli) {
        this.ageDiaProxApli = ageDiaProxApli;
    }

    public BigDecimal getAgeDiaProxApli() {
        return this.ageDiaProxApli;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAgeCveStInst(String ageCveStInst) {
        this.ageCveStInst = ageCveStInst;
    }

    public String getAgeCveStInst() {
        return this.ageCveStInst;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAgeRespAtencion(String ageRespAtencion) {
        this.ageRespAtencion = ageRespAtencion;
    }

    public String getAgeRespAtencion() {
        return this.ageRespAtencion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AGENDA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAgeNumFolio() != null && this.getAgeNumFolio().longValue() == -999) {
            conditions += " AND AGE_NUM_FOLIO IS NULL";
        } else if (this.getAgeNumFolio() != null) {
            conditions += " AND AGE_NUM_FOLIO = ?";
            values.add(this.getAgeNumFolio());
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
        String sql = "SELECT * FROM AGENDA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAgeNumFolio() != null && this.getAgeNumFolio().longValue() == -999) {
            conditions += " AND AGE_NUM_FOLIO IS NULL";
        } else if (this.getAgeNumFolio() != null) {
            conditions += " AND AGE_NUM_FOLIO = ?";
            values.add(this.getAgeNumFolio());
        }

        if (this.getAgeNumContrato() != null && this.getAgeNumContrato().longValue() == -999) {
            conditions += " AND AGE_NUM_CONTRATO IS NULL";
        } else if (this.getAgeNumContrato() != null) {
            conditions += " AND AGE_NUM_CONTRATO = ?";
            values.add(this.getAgeNumContrato());
        }

        if (this.getAgeSubContrato() != null && this.getAgeSubContrato().longValue() == -999) {
            conditions += " AND AGE_SUB_CONTRATO IS NULL";
        } else if (this.getAgeSubContrato() != null) {
            conditions += " AND AGE_SUB_CONTRATO = ?";
            values.add(this.getAgeSubContrato());
        }

        if (this.getAgeDesInstruc() != null && "null".equals(this.getAgeDesInstruc())) {
            conditions += " AND AGE_DES_INSTRUC IS NULL";
        } else if (this.getAgeDesInstruc() != null) {
            conditions += " AND AGE_DES_INSTRUC = ?";
            values.add(this.getAgeDesInstruc());
        }

        if (this.getAgeNumUsuario() != null && this.getAgeNumUsuario().longValue() == -999) {
            conditions += " AND AGE_NUM_USUARIO IS NULL";
        } else if (this.getAgeNumUsuario() != null) {
            conditions += " AND AGE_NUM_USUARIO = ?";
            values.add(this.getAgeNumUsuario());
        }

        if (this.getAgeTextInst() != null && this.getAgeTextInst() == -999) {
            conditions += " AND AGE_TEXT_INST IS NULL";
        } else if (this.getAgeTextInst() != null) {
            conditions += " AND AGE_TEXT_INST = ?";
            values.add(this.getAgeTextInst());
        }

        if (this.getAgeCvePerioInst() != null && "null".equals(this.getAgeCvePerioInst())) {
            conditions += " AND AGE_CVE_PERIO_INST IS NULL";
        } else if (this.getAgeCvePerioInst() != null) {
            conditions += " AND AGE_CVE_PERIO_INST = ?";
            values.add(this.getAgeCvePerioInst());
        }

        if (this.getAgeCveInstSis() != null && this.getAgeCveInstSis().longValue() == -999) {
            conditions += " AND AGE_CVE_INST_SIS IS NULL";
        } else if (this.getAgeCveInstSis() != null) {
            conditions += " AND AGE_CVE_INST_SIS = ?";
            values.add(this.getAgeCveInstSis());
        }

        if (this.getAgeInstrucOrigen() != null && this.getAgeInstrucOrigen().longValue() == -999) {
            conditions += " AND AGE_INSTRUC_ORIGEN IS NULL";
        } else if (this.getAgeInstrucOrigen() != null) {
            conditions += " AND AGE_INSTRUC_ORIGEN = ?";
            values.add(this.getAgeInstrucOrigen());
        }

        if (this.getAgeNumEventos() != null && this.getAgeNumEventos().longValue() == -999) {
            conditions += " AND AGE_NUM_EVENTOS IS NULL";
        } else if (this.getAgeNumEventos() != null) {
            conditions += " AND AGE_NUM_EVENTOS = ?";
            values.add(this.getAgeNumEventos());
        }

        if (this.getAgeEventosTrans() != null && this.getAgeEventosTrans().longValue() == -999) {
            conditions += " AND AGE_EVENTOS_TRANS IS NULL";
        } else if (this.getAgeEventosTrans() != null) {
            conditions += " AND AGE_EVENTOS_TRANS = ?";
            values.add(this.getAgeEventosTrans());
        }

        if (this.getAgeAnoIniInst() != null && this.getAgeAnoIniInst().longValue() == -999) {
            conditions += " AND AGE_ANO_INI_INST IS NULL";
        } else if (this.getAgeAnoIniInst() != null) {
            conditions += " AND AGE_ANO_INI_INST = ?";
            values.add(this.getAgeAnoIniInst());
        }

        if (this.getAgeMesIniInst() != null && this.getAgeMesIniInst().longValue() == -999) {
            conditions += " AND AGE_MES_INI_INST IS NULL";
        } else if (this.getAgeMesIniInst() != null) {
            conditions += " AND AGE_MES_INI_INST = ?";
            values.add(this.getAgeMesIniInst());
        }

        if (this.getAgeDiaIniInst() != null && this.getAgeDiaIniInst().longValue() == -999) {
            conditions += " AND AGE_DIA_INI_INST IS NULL";
        } else if (this.getAgeDiaIniInst() != null) {
            conditions += " AND AGE_DIA_INI_INST = ?";
            values.add(this.getAgeDiaIniInst());
        }

        if (this.getAgeAnoFinInst() != null && this.getAgeAnoFinInst().longValue() == -999) {
            conditions += " AND AGE_ANO_FIN_INST IS NULL";
        } else if (this.getAgeAnoFinInst() != null) {
            conditions += " AND AGE_ANO_FIN_INST = ?";
            values.add(this.getAgeAnoFinInst());
        }

        if (this.getAgeMesFinInst() != null && this.getAgeMesFinInst().longValue() == -999) {
            conditions += " AND AGE_MES_FIN_INST IS NULL";
        } else if (this.getAgeMesFinInst() != null) {
            conditions += " AND AGE_MES_FIN_INST = ?";
            values.add(this.getAgeMesFinInst());
        }

        if (this.getAgeDiaFinInst() != null && this.getAgeDiaFinInst().longValue() == -999) {
            conditions += " AND AGE_DIA_FIN_INST IS NULL";
        } else if (this.getAgeDiaFinInst() != null) {
            conditions += " AND AGE_DIA_FIN_INST = ?";
            values.add(this.getAgeDiaFinInst());
        }

        if (this.getAgeAnoProxApli() != null && this.getAgeAnoProxApli().longValue() == -999) {
            conditions += " AND AGE_ANO_PROX_APLI IS NULL";
        } else if (this.getAgeAnoProxApli() != null) {
            conditions += " AND AGE_ANO_PROX_APLI = ?";
            values.add(this.getAgeAnoProxApli());
        }

        if (this.getAgeMesProxApli() != null && this.getAgeMesProxApli().longValue() == -999) {
            conditions += " AND AGE_MES_PROX_APLI IS NULL";
        } else if (this.getAgeMesProxApli() != null) {
            conditions += " AND AGE_MES_PROX_APLI = ?";
            values.add(this.getAgeMesProxApli());
        }

        if (this.getAgeDiaProxApli() != null && this.getAgeDiaProxApli().longValue() == -999) {
            conditions += " AND AGE_DIA_PROX_APLI IS NULL";
        } else if (this.getAgeDiaProxApli() != null) {
            conditions += " AND AGE_DIA_PROX_APLI = ?";
            values.add(this.getAgeDiaProxApli());
        }

        if (this.getAgeCveStInst() != null && "null".equals(this.getAgeCveStInst())) {
            conditions += " AND AGE_CVE_ST_INST IS NULL";
        } else if (this.getAgeCveStInst() != null) {
            conditions += " AND AGE_CVE_ST_INST = ?";
            values.add(this.getAgeCveStInst());
        }

        if (this.getAgeRespAtencion() != null && "null".equals(this.getAgeRespAtencion())) {
            conditions += " AND AGE_RESP_ATENCION IS NULL";
        } else if (this.getAgeRespAtencion() != null) {
            conditions += " AND AGE_RESP_ATENCION = ?";
            values.add(this.getAgeRespAtencion());
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
        String sql = "UPDATE AGENDA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AGE_NUM_FOLIO = ?";
        pkValues.add(this.getAgeNumFolio());
        fields += " AGE_NUM_CONTRATO = ?, ";
        values.add(this.getAgeNumContrato());
        fields += " AGE_SUB_CONTRATO = ?, ";
        values.add(this.getAgeSubContrato());
        fields += " AGE_DES_INSTRUC = ?, ";
        values.add(this.getAgeDesInstruc());
        fields += " AGE_NUM_USUARIO = ?, ";
        values.add(this.getAgeNumUsuario());
        fields += " AGE_TEXT_INST = ?, ";
        values.add(this.getAgeTextInst());
        fields += " AGE_CVE_PERIO_INST = ?, ";
        values.add(this.getAgeCvePerioInst());
        fields += " AGE_CVE_INST_SIS = ?, ";
        values.add(this.getAgeCveInstSis());
        fields += " AGE_INSTRUC_ORIGEN = ?, ";
        values.add(this.getAgeInstrucOrigen());
        fields += " AGE_NUM_EVENTOS = ?, ";
        values.add(this.getAgeNumEventos());
        fields += " AGE_EVENTOS_TRANS = ?, ";
        values.add(this.getAgeEventosTrans());
        fields += " AGE_ANO_INI_INST = ?, ";
        values.add(this.getAgeAnoIniInst());
        fields += " AGE_MES_INI_INST = ?, ";
        values.add(this.getAgeMesIniInst());
        fields += " AGE_DIA_INI_INST = ?, ";
        values.add(this.getAgeDiaIniInst());
        fields += " AGE_ANO_FIN_INST = ?, ";
        values.add(this.getAgeAnoFinInst());
        fields += " AGE_MES_FIN_INST = ?, ";
        values.add(this.getAgeMesFinInst());
        fields += " AGE_DIA_FIN_INST = ?, ";
        values.add(this.getAgeDiaFinInst());
        fields += " AGE_ANO_PROX_APLI = ?, ";
        values.add(this.getAgeAnoProxApli());
        fields += " AGE_MES_PROX_APLI = ?, ";
        values.add(this.getAgeMesProxApli());
        fields += " AGE_DIA_PROX_APLI = ?, ";
        values.add(this.getAgeDiaProxApli());
        fields += " AGE_CVE_ST_INST = ?, ";
        values.add(this.getAgeCveStInst());
        fields += " AGE_RESP_ATENCION = ?, ";
        values.add(this.getAgeRespAtencion());
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
        String sql = "INSERT INTO AGENDA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AGE_NUM_FOLIO";
        fieldValues += ", ?";
        values.add(this.getAgeNumFolio());

        fields += ", AGE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAgeNumContrato());

        fields += ", AGE_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAgeSubContrato());

        fields += ", AGE_DES_INSTRUC";
        fieldValues += ", ?";
        values.add(this.getAgeDesInstruc());

        fields += ", AGE_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getAgeNumUsuario());

        fields += ", AGE_TEXT_INST";
        fieldValues += ", ?";
        values.add(this.getAgeTextInst());

        fields += ", AGE_CVE_PERIO_INST";
        fieldValues += ", ?";
        values.add(this.getAgeCvePerioInst());

        fields += ", AGE_CVE_INST_SIS";
        fieldValues += ", ?";
        values.add(this.getAgeCveInstSis());

        fields += ", AGE_INSTRUC_ORIGEN";
        fieldValues += ", ?";
        values.add(this.getAgeInstrucOrigen());

        fields += ", AGE_NUM_EVENTOS";
        fieldValues += ", ?";
        values.add(this.getAgeNumEventos());

        fields += ", AGE_EVENTOS_TRANS";
        fieldValues += ", ?";
        values.add(this.getAgeEventosTrans());

        fields += ", AGE_ANO_INI_INST";
        fieldValues += ", ?";
        values.add(this.getAgeAnoIniInst());

        fields += ", AGE_MES_INI_INST";
        fieldValues += ", ?";
        values.add(this.getAgeMesIniInst());

        fields += ", AGE_DIA_INI_INST";
        fieldValues += ", ?";
        values.add(this.getAgeDiaIniInst());

        fields += ", AGE_ANO_FIN_INST";
        fieldValues += ", ?";
        values.add(this.getAgeAnoFinInst());

        fields += ", AGE_MES_FIN_INST";
        fieldValues += ", ?";
        values.add(this.getAgeMesFinInst());

        fields += ", AGE_DIA_FIN_INST";
        fieldValues += ", ?";
        values.add(this.getAgeDiaFinInst());

        fields += ", AGE_ANO_PROX_APLI";
        fieldValues += ", ?";
        values.add(this.getAgeAnoProxApli());

        fields += ", AGE_MES_PROX_APLI";
        fieldValues += ", ?";
        values.add(this.getAgeMesProxApli());

        fields += ", AGE_DIA_PROX_APLI";
        fieldValues += ", ?";
        values.add(this.getAgeDiaProxApli());

        fields += ", AGE_CVE_ST_INST";
        fieldValues += ", ?";
        values.add(this.getAgeCveStInst());

        fields += ", AGE_RESP_ATENCION";
        fieldValues += ", ?";
        values.add(this.getAgeRespAtencion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AGENDA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AGE_NUM_FOLIO = ?";
        values.add(this.getAgeNumFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Agenda instance = (Agenda) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAgeNumFolio().equals(instance.getAgeNumFolio()))
            equalObjects = false;
        if (equalObjects && !this.getAgeNumContrato().equals(instance.getAgeNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAgeSubContrato().equals(instance.getAgeSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAgeDesInstruc().equals(instance.getAgeDesInstruc()))
            equalObjects = false;
        if (equalObjects && !this.getAgeNumUsuario().equals(instance.getAgeNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getAgeTextInst().equals(instance.getAgeTextInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeCvePerioInst().equals(instance.getAgeCvePerioInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeCveInstSis().equals(instance.getAgeCveInstSis()))
            equalObjects = false;
        if (equalObjects && !this.getAgeInstrucOrigen().equals(instance.getAgeInstrucOrigen()))
            equalObjects = false;
        if (equalObjects && !this.getAgeNumEventos().equals(instance.getAgeNumEventos()))
            equalObjects = false;
        if (equalObjects && !this.getAgeEventosTrans().equals(instance.getAgeEventosTrans()))
            equalObjects = false;
        if (equalObjects && !this.getAgeAnoIniInst().equals(instance.getAgeAnoIniInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeMesIniInst().equals(instance.getAgeMesIniInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeDiaIniInst().equals(instance.getAgeDiaIniInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeAnoFinInst().equals(instance.getAgeAnoFinInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeMesFinInst().equals(instance.getAgeMesFinInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeDiaFinInst().equals(instance.getAgeDiaFinInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeAnoProxApli().equals(instance.getAgeAnoProxApli()))
            equalObjects = false;
        if (equalObjects && !this.getAgeMesProxApli().equals(instance.getAgeMesProxApli()))
            equalObjects = false;
        if (equalObjects && !this.getAgeDiaProxApli().equals(instance.getAgeDiaProxApli()))
            equalObjects = false;
        if (equalObjects && !this.getAgeCveStInst().equals(instance.getAgeCveStInst()))
            equalObjects = false;
        if (equalObjects && !this.getAgeRespAtencion().equals(instance.getAgeRespAtencion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Agenda result = new Agenda();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAgeNumFolio((BigDecimal) objectData.getData("AGE_NUM_FOLIO"));
        result.setAgeNumContrato((BigDecimal) objectData.getData("AGE_NUM_CONTRATO"));
        result.setAgeSubContrato((BigDecimal) objectData.getData("AGE_SUB_CONTRATO"));
        result.setAgeDesInstruc((String) objectData.getData("AGE_DES_INSTRUC"));
        result.setAgeNumUsuario((BigDecimal) objectData.getData("AGE_NUM_USUARIO"));
        result.setAgeTextInst((Long) objectData.getData("AGE_TEXT_INST"));
        result.setAgeCvePerioInst((String) objectData.getData("AGE_CVE_PERIO_INST"));
        result.setAgeCveInstSis((BigDecimal) objectData.getData("AGE_CVE_INST_SIS"));
        result.setAgeInstrucOrigen((BigDecimal) objectData.getData("AGE_INSTRUC_ORIGEN"));
        result.setAgeNumEventos((BigDecimal) objectData.getData("AGE_NUM_EVENTOS"));
        result.setAgeEventosTrans((BigDecimal) objectData.getData("AGE_EVENTOS_TRANS"));
        result.setAgeAnoIniInst((BigDecimal) objectData.getData("AGE_ANO_INI_INST"));
        result.setAgeMesIniInst((BigDecimal) objectData.getData("AGE_MES_INI_INST"));
        result.setAgeDiaIniInst((BigDecimal) objectData.getData("AGE_DIA_INI_INST"));
        result.setAgeAnoFinInst((BigDecimal) objectData.getData("AGE_ANO_FIN_INST"));
        result.setAgeMesFinInst((BigDecimal) objectData.getData("AGE_MES_FIN_INST"));
        result.setAgeDiaFinInst((BigDecimal) objectData.getData("AGE_DIA_FIN_INST"));
        result.setAgeAnoProxApli((BigDecimal) objectData.getData("AGE_ANO_PROX_APLI"));
        result.setAgeMesProxApli((BigDecimal) objectData.getData("AGE_MES_PROX_APLI"));
        result.setAgeDiaProxApli((BigDecimal) objectData.getData("AGE_DIA_PROX_APLI"));
        result.setAgeCveStInst((String) objectData.getData("AGE_CVE_ST_INST"));
        result.setAgeRespAtencion((String) objectData.getData("AGE_RESP_ATENCION"));

        return result;

    }

}
