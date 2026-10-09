package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUBCOM_PK", columns = { "SCO_NUM_CONTRATO", "SCO_NUM_SUBCOMITE", "SCO_NUM_MIEMBRO" }, sequences = { "MANUAL" })
public class Subcom extends DomainObject {

    BigDecimal scoNumContrato = null;
    BigDecimal scoNumSubcomite = null;
    BigDecimal scoNumMiembro = null;
    String scoNomMiembro = null;
    String scoRfc = null;
    String scoNomInstituc = null;
    String scoNomPuesto = null;
    String scoCveParticip = null;
    BigDecimal scoImpAutRetiro = null;
    BigDecimal scoCveVoto = null;
    String scoCveFirma = null;
    BigDecimal scoAnoAltaReg = null;
    BigDecimal scoMesAltaReg = null;
    BigDecimal scoDiaAltaReg = null;
    BigDecimal scoAnoUltMod = null;
    BigDecimal scoMesUltMod = null;
    BigDecimal scoDiaUltMod = null;
    String scoCveStMiembro = null;
    BigDecimal scoAnoDesig = null;
    BigDecimal scoMesDesig = null;
    BigDecimal scoDiaDesig = null;
    String scoReferencia = null;

    public Subcom() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setScoNumContrato(BigDecimal scoNumContrato) {
        this.scoNumContrato = scoNumContrato;
    }

    public BigDecimal getScoNumContrato() {
        return this.scoNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setScoNumSubcomite(BigDecimal scoNumSubcomite) {
        this.scoNumSubcomite = scoNumSubcomite;
    }

    public BigDecimal getScoNumSubcomite() {
        return this.scoNumSubcomite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setScoNumMiembro(BigDecimal scoNumMiembro) {
        this.scoNumMiembro = scoNumMiembro;
    }

    public BigDecimal getScoNumMiembro() {
        return this.scoNumMiembro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setScoNomMiembro(String scoNomMiembro) {
        this.scoNomMiembro = scoNomMiembro;
    }

    public String getScoNomMiembro() {
        return this.scoNomMiembro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setScoRfc(String scoRfc) {
        this.scoRfc = scoRfc;
    }

    public String getScoRfc() {
        return this.scoRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setScoNomInstituc(String scoNomInstituc) {
        this.scoNomInstituc = scoNomInstituc;
    }

    public String getScoNomInstituc() {
        return this.scoNomInstituc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setScoNomPuesto(String scoNomPuesto) {
        this.scoNomPuesto = scoNomPuesto;
    }

    public String getScoNomPuesto() {
        return this.scoNomPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setScoCveParticip(String scoCveParticip) {
        this.scoCveParticip = scoCveParticip;
    }

    public String getScoCveParticip() {
        return this.scoCveParticip;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setScoImpAutRetiro(BigDecimal scoImpAutRetiro) {
        this.scoImpAutRetiro = scoImpAutRetiro;
    }

    public BigDecimal getScoImpAutRetiro() {
        return this.scoImpAutRetiro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setScoCveVoto(BigDecimal scoCveVoto) {
        this.scoCveVoto = scoCveVoto;
    }

    public BigDecimal getScoCveVoto() {
        return this.scoCveVoto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setScoCveFirma(String scoCveFirma) {
        this.scoCveFirma = scoCveFirma;
    }

    public String getScoCveFirma() {
        return this.scoCveFirma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setScoAnoAltaReg(BigDecimal scoAnoAltaReg) {
        this.scoAnoAltaReg = scoAnoAltaReg;
    }

    public BigDecimal getScoAnoAltaReg() {
        return this.scoAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setScoMesAltaReg(BigDecimal scoMesAltaReg) {
        this.scoMesAltaReg = scoMesAltaReg;
    }

    public BigDecimal getScoMesAltaReg() {
        return this.scoMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setScoDiaAltaReg(BigDecimal scoDiaAltaReg) {
        this.scoDiaAltaReg = scoDiaAltaReg;
    }

    public BigDecimal getScoDiaAltaReg() {
        return this.scoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setScoAnoUltMod(BigDecimal scoAnoUltMod) {
        this.scoAnoUltMod = scoAnoUltMod;
    }

    public BigDecimal getScoAnoUltMod() {
        return this.scoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setScoMesUltMod(BigDecimal scoMesUltMod) {
        this.scoMesUltMod = scoMesUltMod;
    }

    public BigDecimal getScoMesUltMod() {
        return this.scoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setScoDiaUltMod(BigDecimal scoDiaUltMod) {
        this.scoDiaUltMod = scoDiaUltMod;
    }

    public BigDecimal getScoDiaUltMod() {
        return this.scoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setScoCveStMiembro(String scoCveStMiembro) {
        this.scoCveStMiembro = scoCveStMiembro;
    }

    public String getScoCveStMiembro() {
        return this.scoCveStMiembro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setScoAnoDesig(BigDecimal scoAnoDesig) {
        this.scoAnoDesig = scoAnoDesig;
    }

    public BigDecimal getScoAnoDesig() {
        return this.scoAnoDesig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setScoMesDesig(BigDecimal scoMesDesig) {
        this.scoMesDesig = scoMesDesig;
    }

    public BigDecimal getScoMesDesig() {
        return this.scoMesDesig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setScoDiaDesig(BigDecimal scoDiaDesig) {
        this.scoDiaDesig = scoDiaDesig;
    }

    public BigDecimal getScoDiaDesig() {
        return this.scoDiaDesig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setScoReferencia(String scoReferencia) {
        this.scoReferencia = scoReferencia;
    }

    public String getScoReferencia() {
        return this.scoReferencia;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUBCOM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getScoNumContrato() != null && this.getScoNumContrato().longValue() == -999) {
            conditions += " AND SCO_NUM_CONTRATO IS NULL";
        } else if (this.getScoNumContrato() != null) {
            conditions += " AND SCO_NUM_CONTRATO = ?";
            values.add(this.getScoNumContrato());
        }

        if (this.getScoNumSubcomite() != null && this.getScoNumSubcomite().longValue() == -999) {
            conditions += " AND SCO_NUM_SUBCOMITE IS NULL";
        } else if (this.getScoNumSubcomite() != null) {
            conditions += " AND SCO_NUM_SUBCOMITE = ?";
            values.add(this.getScoNumSubcomite());
        }

        if (this.getScoNumMiembro() != null && this.getScoNumMiembro().longValue() == -999) {
            conditions += " AND SCO_NUM_MIEMBRO IS NULL";
        } else if (this.getScoNumMiembro() != null) {
            conditions += " AND SCO_NUM_MIEMBRO = ?";
            values.add(this.getScoNumMiembro());
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
        String sql = "SELECT * FROM SUBCOM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getScoNumContrato() != null && this.getScoNumContrato().longValue() == -999) {
            conditions += " AND SCO_NUM_CONTRATO IS NULL";
        } else if (this.getScoNumContrato() != null) {
            conditions += " AND SCO_NUM_CONTRATO = ?";
            values.add(this.getScoNumContrato());
        }

        if (this.getScoNumSubcomite() != null && this.getScoNumSubcomite().longValue() == -999) {
            conditions += " AND SCO_NUM_SUBCOMITE IS NULL";
        } else if (this.getScoNumSubcomite() != null) {
            conditions += " AND SCO_NUM_SUBCOMITE = ?";
            values.add(this.getScoNumSubcomite());
        }

        if (this.getScoNumMiembro() != null && this.getScoNumMiembro().longValue() == -999) {
            conditions += " AND SCO_NUM_MIEMBRO IS NULL";
        } else if (this.getScoNumMiembro() != null) {
            conditions += " AND SCO_NUM_MIEMBRO = ?";
            values.add(this.getScoNumMiembro());
        }

        if (this.getScoNomMiembro() != null && "null".equals(this.getScoNomMiembro())) {
            conditions += " AND SCO_NOM_MIEMBRO IS NULL";
        } else if (this.getScoNomMiembro() != null) {
            conditions += " AND SCO_NOM_MIEMBRO = ?";
            values.add(this.getScoNomMiembro());
        }

        if (this.getScoRfc() != null && "null".equals(this.getScoRfc())) {
            conditions += " AND SCO_RFC IS NULL";
        } else if (this.getScoRfc() != null) {
            conditions += " AND SCO_RFC = ?";
            values.add(this.getScoRfc());
        }

        if (this.getScoNomInstituc() != null && "null".equals(this.getScoNomInstituc())) {
            conditions += " AND SCO_NOM_INSTITUC IS NULL";
        } else if (this.getScoNomInstituc() != null) {
            conditions += " AND SCO_NOM_INSTITUC = ?";
            values.add(this.getScoNomInstituc());
        }

        if (this.getScoNomPuesto() != null && "null".equals(this.getScoNomPuesto())) {
            conditions += " AND SCO_NOM_PUESTO IS NULL";
        } else if (this.getScoNomPuesto() != null) {
            conditions += " AND SCO_NOM_PUESTO = ?";
            values.add(this.getScoNomPuesto());
        }

        if (this.getScoCveParticip() != null && "null".equals(this.getScoCveParticip())) {
            conditions += " AND SCO_CVE_PARTICIP IS NULL";
        } else if (this.getScoCveParticip() != null) {
            conditions += " AND SCO_CVE_PARTICIP = ?";
            values.add(this.getScoCveParticip());
        }

        if (this.getScoImpAutRetiro() != null && this.getScoImpAutRetiro().longValue() == -999) {
            conditions += " AND SCO_IMP_AUT_RETIRO IS NULL";
        } else if (this.getScoImpAutRetiro() != null) {
            conditions += " AND SCO_IMP_AUT_RETIRO = ?";
            values.add(this.getScoImpAutRetiro());
        }

        if (this.getScoCveVoto() != null && this.getScoCveVoto().longValue() == -999) {
            conditions += " AND SCO_CVE_VOTO IS NULL";
        } else if (this.getScoCveVoto() != null) {
            conditions += " AND SCO_CVE_VOTO = ?";
            values.add(this.getScoCveVoto());
        }

        if (this.getScoCveFirma() != null && "null".equals(this.getScoCveFirma())) {
            conditions += " AND SCO_CVE_FIRMA IS NULL";
        } else if (this.getScoCveFirma() != null) {
            conditions += " AND SCO_CVE_FIRMA = ?";
            values.add(this.getScoCveFirma());
        }

        if (this.getScoAnoAltaReg() != null && this.getScoAnoAltaReg().longValue() == -999) {
            conditions += " AND SCO_ANO_ALTA_REG IS NULL";
        } else if (this.getScoAnoAltaReg() != null) {
            conditions += " AND SCO_ANO_ALTA_REG = ?";
            values.add(this.getScoAnoAltaReg());
        }

        if (this.getScoMesAltaReg() != null && this.getScoMesAltaReg().longValue() == -999) {
            conditions += " AND SCO_MES_ALTA_REG IS NULL";
        } else if (this.getScoMesAltaReg() != null) {
            conditions += " AND SCO_MES_ALTA_REG = ?";
            values.add(this.getScoMesAltaReg());
        }

        if (this.getScoDiaAltaReg() != null && this.getScoDiaAltaReg().longValue() == -999) {
            conditions += " AND SCO_DIA_ALTA_REG IS NULL";
        } else if (this.getScoDiaAltaReg() != null) {
            conditions += " AND SCO_DIA_ALTA_REG = ?";
            values.add(this.getScoDiaAltaReg());
        }

        if (this.getScoAnoUltMod() != null && this.getScoAnoUltMod().longValue() == -999) {
            conditions += " AND SCO_ANO_ULT_MOD IS NULL";
        } else if (this.getScoAnoUltMod() != null) {
            conditions += " AND SCO_ANO_ULT_MOD = ?";
            values.add(this.getScoAnoUltMod());
        }

        if (this.getScoMesUltMod() != null && this.getScoMesUltMod().longValue() == -999) {
            conditions += " AND SCO_MES_ULT_MOD IS NULL";
        } else if (this.getScoMesUltMod() != null) {
            conditions += " AND SCO_MES_ULT_MOD = ?";
            values.add(this.getScoMesUltMod());
        }

        if (this.getScoDiaUltMod() != null && this.getScoDiaUltMod().longValue() == -999) {
            conditions += " AND SCO_DIA_ULT_MOD IS NULL";
        } else if (this.getScoDiaUltMod() != null) {
            conditions += " AND SCO_DIA_ULT_MOD = ?";
            values.add(this.getScoDiaUltMod());
        }

        if (this.getScoCveStMiembro() != null && "null".equals(this.getScoCveStMiembro())) {
            conditions += " AND SCO_CVE_ST_MIEMBRO IS NULL";
        } else if (this.getScoCveStMiembro() != null) {
            conditions += " AND SCO_CVE_ST_MIEMBRO = ?";
            values.add(this.getScoCveStMiembro());
        }

        if (this.getScoAnoDesig() != null && this.getScoAnoDesig().longValue() == -999) {
            conditions += " AND SCO_ANO_DESIG IS NULL";
        } else if (this.getScoAnoDesig() != null) {
            conditions += " AND SCO_ANO_DESIG = ?";
            values.add(this.getScoAnoDesig());
        }

        if (this.getScoMesDesig() != null && this.getScoMesDesig().longValue() == -999) {
            conditions += " AND SCO_MES_DESIG IS NULL";
        } else if (this.getScoMesDesig() != null) {
            conditions += " AND SCO_MES_DESIG = ?";
            values.add(this.getScoMesDesig());
        }

        if (this.getScoDiaDesig() != null && this.getScoDiaDesig().longValue() == -999) {
            conditions += " AND SCO_DIA_DESIG IS NULL";
        } else if (this.getScoDiaDesig() != null) {
            conditions += " AND SCO_DIA_DESIG = ?";
            values.add(this.getScoDiaDesig());
        }

        if (this.getScoReferencia() != null && "null".equals(this.getScoReferencia())) {
            conditions += " AND SCO_REFERENCIA IS NULL";
        } else if (this.getScoReferencia() != null) {
            conditions += " AND SCO_REFERENCIA = ?";
            values.add(this.getScoReferencia());
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
        String sql = "UPDATE SUBCOM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SCO_NUM_CONTRATO = ?";
        pkValues.add(this.getScoNumContrato());
        conditions += " AND SCO_NUM_SUBCOMITE = ?";
        pkValues.add(this.getScoNumSubcomite());
        conditions += " AND SCO_NUM_MIEMBRO = ?";
        pkValues.add(this.getScoNumMiembro());
        fields += " SCO_NOM_MIEMBRO = ?, ";
        values.add(this.getScoNomMiembro());
        fields += " SCO_RFC = ?, ";
        values.add(this.getScoRfc());
        fields += " SCO_NOM_INSTITUC = ?, ";
        values.add(this.getScoNomInstituc());
        fields += " SCO_NOM_PUESTO = ?, ";
        values.add(this.getScoNomPuesto());
        fields += " SCO_CVE_PARTICIP = ?, ";
        values.add(this.getScoCveParticip());
        fields += " SCO_IMP_AUT_RETIRO = ?, ";
        values.add(this.getScoImpAutRetiro());
        fields += " SCO_CVE_VOTO = ?, ";
        values.add(this.getScoCveVoto());
        fields += " SCO_CVE_FIRMA = ?, ";
        values.add(this.getScoCveFirma());
        fields += " SCO_ANO_ALTA_REG = ?, ";
        values.add(this.getScoAnoAltaReg());
        fields += " SCO_MES_ALTA_REG = ?, ";
        values.add(this.getScoMesAltaReg());
        fields += " SCO_DIA_ALTA_REG = ?, ";
        values.add(this.getScoDiaAltaReg());
        fields += " SCO_ANO_ULT_MOD = ?, ";
        values.add(this.getScoAnoUltMod());
        fields += " SCO_MES_ULT_MOD = ?, ";
        values.add(this.getScoMesUltMod());
        fields += " SCO_DIA_ULT_MOD = ?, ";
        values.add(this.getScoDiaUltMod());
        fields += " SCO_CVE_ST_MIEMBRO = ?, ";
        values.add(this.getScoCveStMiembro());
        fields += " SCO_ANO_DESIG = ?, ";
        values.add(this.getScoAnoDesig());
        fields += " SCO_MES_DESIG = ?, ";
        values.add(this.getScoMesDesig());
        fields += " SCO_DIA_DESIG = ?, ";
        values.add(this.getScoDiaDesig());
        fields += " SCO_REFERENCIA = ?, ";
        values.add(this.getScoReferencia());
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
        String sql = "INSERT INTO SUBCOM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SCO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getScoNumContrato());

        fields += ", SCO_NUM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getScoNumSubcomite());

        fields += ", SCO_NUM_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getScoNumMiembro());

        fields += ", SCO_NOM_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getScoNomMiembro());

        fields += ", SCO_RFC";
        fieldValues += ", ?";
        values.add(this.getScoRfc());

        fields += ", SCO_NOM_INSTITUC";
        fieldValues += ", ?";
        values.add(this.getScoNomInstituc());

        fields += ", SCO_NOM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getScoNomPuesto());

        fields += ", SCO_CVE_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getScoCveParticip());

        fields += ", SCO_IMP_AUT_RETIRO";
        fieldValues += ", ?";
        values.add(this.getScoImpAutRetiro());

        fields += ", SCO_CVE_VOTO";
        fieldValues += ", ?";
        values.add(this.getScoCveVoto());

        fields += ", SCO_CVE_FIRMA";
        fieldValues += ", ?";
        values.add(this.getScoCveFirma());

        fields += ", SCO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getScoAnoAltaReg());

        fields += ", SCO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getScoMesAltaReg());

        fields += ", SCO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getScoDiaAltaReg());

        fields += ", SCO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getScoAnoUltMod());

        fields += ", SCO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getScoMesUltMod());

        fields += ", SCO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getScoDiaUltMod());

        fields += ", SCO_CVE_ST_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getScoCveStMiembro());

        fields += ", SCO_ANO_DESIG";
        fieldValues += ", ?";
        values.add(this.getScoAnoDesig());

        fields += ", SCO_MES_DESIG";
        fieldValues += ", ?";
        values.add(this.getScoMesDesig());

        fields += ", SCO_DIA_DESIG";
        fieldValues += ", ?";
        values.add(this.getScoDiaDesig());

        fields += ", SCO_REFERENCIA";
        fieldValues += ", ?";
        values.add(this.getScoReferencia());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUBCOM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SCO_NUM_CONTRATO = ?";
        values.add(this.getScoNumContrato());
        conditions += " AND SCO_NUM_SUBCOMITE = ?";
        values.add(this.getScoNumSubcomite());
        conditions += " AND SCO_NUM_MIEMBRO = ?";
        values.add(this.getScoNumMiembro());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Subcom instance = (Subcom) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getScoNumContrato().equals(instance.getScoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getScoNumSubcomite().equals(instance.getScoNumSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getScoNumMiembro().equals(instance.getScoNumMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getScoNomMiembro().equals(instance.getScoNomMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getScoRfc().equals(instance.getScoRfc()))
            equalObjects = false;
        if (equalObjects && !this.getScoNomInstituc().equals(instance.getScoNomInstituc()))
            equalObjects = false;
        if (equalObjects && !this.getScoNomPuesto().equals(instance.getScoNomPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getScoCveParticip().equals(instance.getScoCveParticip()))
            equalObjects = false;
        if (equalObjects && !this.getScoImpAutRetiro().equals(instance.getScoImpAutRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getScoCveVoto().equals(instance.getScoCveVoto()))
            equalObjects = false;
        if (equalObjects && !this.getScoCveFirma().equals(instance.getScoCveFirma()))
            equalObjects = false;
        if (equalObjects && !this.getScoAnoAltaReg().equals(instance.getScoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getScoMesAltaReg().equals(instance.getScoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getScoDiaAltaReg().equals(instance.getScoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getScoAnoUltMod().equals(instance.getScoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getScoMesUltMod().equals(instance.getScoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getScoDiaUltMod().equals(instance.getScoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getScoCveStMiembro().equals(instance.getScoCveStMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getScoAnoDesig().equals(instance.getScoAnoDesig()))
            equalObjects = false;
        if (equalObjects && !this.getScoMesDesig().equals(instance.getScoMesDesig()))
            equalObjects = false;
        if (equalObjects && !this.getScoDiaDesig().equals(instance.getScoDiaDesig()))
            equalObjects = false;
        if (equalObjects && !this.getScoReferencia().equals(instance.getScoReferencia()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Subcom result = new Subcom();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setScoNumContrato((BigDecimal) objectData.getData("SCO_NUM_CONTRATO"));
        result.setScoNumSubcomite((BigDecimal) objectData.getData("SCO_NUM_SUBCOMITE"));
        result.setScoNumMiembro((BigDecimal) objectData.getData("SCO_NUM_MIEMBRO"));
        result.setScoNomMiembro((String) objectData.getData("SCO_NOM_MIEMBRO"));
        result.setScoRfc((String) objectData.getData("SCO_RFC"));
        result.setScoNomInstituc((String) objectData.getData("SCO_NOM_INSTITUC"));
        result.setScoNomPuesto((String) objectData.getData("SCO_NOM_PUESTO"));
        result.setScoCveParticip((String) objectData.getData("SCO_CVE_PARTICIP"));
        result.setScoImpAutRetiro((BigDecimal) objectData.getData("SCO_IMP_AUT_RETIRO"));
        result.setScoCveVoto((BigDecimal) objectData.getData("SCO_CVE_VOTO"));
        result.setScoCveFirma((String) objectData.getData("SCO_CVE_FIRMA"));
        result.setScoAnoAltaReg((BigDecimal) objectData.getData("SCO_ANO_ALTA_REG"));
        result.setScoMesAltaReg((BigDecimal) objectData.getData("SCO_MES_ALTA_REG"));
        result.setScoDiaAltaReg((BigDecimal) objectData.getData("SCO_DIA_ALTA_REG"));
        result.setScoAnoUltMod((BigDecimal) objectData.getData("SCO_ANO_ULT_MOD"));
        result.setScoMesUltMod((BigDecimal) objectData.getData("SCO_MES_ULT_MOD"));
        result.setScoDiaUltMod((BigDecimal) objectData.getData("SCO_DIA_ULT_MOD"));
        result.setScoCveStMiembro((String) objectData.getData("SCO_CVE_ST_MIEMBRO"));
        result.setScoAnoDesig((BigDecimal) objectData.getData("SCO_ANO_DESIG"));
        result.setScoMesDesig((BigDecimal) objectData.getData("SCO_MES_DESIG"));
        result.setScoDiaDesig((BigDecimal) objectData.getData("SCO_DIA_DESIG"));
        result.setScoReferencia((String) objectData.getData("SCO_REFERENCIA"));

        return result;

    }

}
