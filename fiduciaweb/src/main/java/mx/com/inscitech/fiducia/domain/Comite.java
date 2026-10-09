package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COMITE_PK", columns = { "COM_NUM_MIEMBRO", "COM_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Comite extends DomainObject {

    BigDecimal comNumContrato = null;
    BigDecimal comNumMiembro = null;
    String comNomMiembro = null;
    String comRfc = null;
    String comNomInstituc = null;
    String comNomPuesto = null;
    String comCveParticip = null;
    BigDecimal comImpAutRetiro = null;
    BigDecimal comCveVoto = null;
    String comCveFirma = null;
    BigDecimal comAnoAltaReg = null;
    BigDecimal comMesAltaReg = null;
    BigDecimal comDiaAltaReg = null;
    BigDecimal comAnoUltMod = null;
    BigDecimal comMesUltMod = null;
    BigDecimal comDiaUltMod = null;
    String comCveStMiembro = null;
    BigDecimal comAnoDesig = null;
    BigDecimal comMesDesig = null;
    BigDecimal comDiaDesig = null;
    String comReferencia = null;

    public Comite() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setComNumContrato(BigDecimal comNumContrato) {
        this.comNumContrato = comNumContrato;
    }

    public BigDecimal getComNumContrato() {
        return this.comNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setComNumMiembro(BigDecimal comNumMiembro) {
        this.comNumMiembro = comNumMiembro;
    }

    public BigDecimal getComNumMiembro() {
        return this.comNumMiembro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setComNomMiembro(String comNomMiembro) {
        this.comNomMiembro = comNomMiembro;
    }

    public String getComNomMiembro() {
        return this.comNomMiembro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setComRfc(String comRfc) {
        this.comRfc = comRfc;
    }

    public String getComRfc() {
        return this.comRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setComNomInstituc(String comNomInstituc) {
        this.comNomInstituc = comNomInstituc;
    }

    public String getComNomInstituc() {
        return this.comNomInstituc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setComNomPuesto(String comNomPuesto) {
        this.comNomPuesto = comNomPuesto;
    }

    public String getComNomPuesto() {
        return this.comNomPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setComCveParticip(String comCveParticip) {
        this.comCveParticip = comCveParticip;
    }

    public String getComCveParticip() {
        return this.comCveParticip;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setComImpAutRetiro(BigDecimal comImpAutRetiro) {
        this.comImpAutRetiro = comImpAutRetiro;
    }

    public BigDecimal getComImpAutRetiro() {
        return this.comImpAutRetiro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setComCveVoto(BigDecimal comCveVoto) {
        this.comCveVoto = comCveVoto;
    }

    public BigDecimal getComCveVoto() {
        return this.comCveVoto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setComCveFirma(String comCveFirma) {
        this.comCveFirma = comCveFirma;
    }

    public String getComCveFirma() {
        return this.comCveFirma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setComAnoAltaReg(BigDecimal comAnoAltaReg) {
        this.comAnoAltaReg = comAnoAltaReg;
    }

    public BigDecimal getComAnoAltaReg() {
        return this.comAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setComMesAltaReg(BigDecimal comMesAltaReg) {
        this.comMesAltaReg = comMesAltaReg;
    }

    public BigDecimal getComMesAltaReg() {
        return this.comMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setComDiaAltaReg(BigDecimal comDiaAltaReg) {
        this.comDiaAltaReg = comDiaAltaReg;
    }

    public BigDecimal getComDiaAltaReg() {
        return this.comDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setComAnoUltMod(BigDecimal comAnoUltMod) {
        this.comAnoUltMod = comAnoUltMod;
    }

    public BigDecimal getComAnoUltMod() {
        return this.comAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setComMesUltMod(BigDecimal comMesUltMod) {
        this.comMesUltMod = comMesUltMod;
    }

    public BigDecimal getComMesUltMod() {
        return this.comMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setComDiaUltMod(BigDecimal comDiaUltMod) {
        this.comDiaUltMod = comDiaUltMod;
    }

    public BigDecimal getComDiaUltMod() {
        return this.comDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setComCveStMiembro(String comCveStMiembro) {
        this.comCveStMiembro = comCveStMiembro;
    }

    public String getComCveStMiembro() {
        return this.comCveStMiembro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setComAnoDesig(BigDecimal comAnoDesig) {
        this.comAnoDesig = comAnoDesig;
    }

    public BigDecimal getComAnoDesig() {
        return this.comAnoDesig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setComMesDesig(BigDecimal comMesDesig) {
        this.comMesDesig = comMesDesig;
    }

    public BigDecimal getComMesDesig() {
        return this.comMesDesig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setComDiaDesig(BigDecimal comDiaDesig) {
        this.comDiaDesig = comDiaDesig;
    }

    public BigDecimal getComDiaDesig() {
        return this.comDiaDesig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setComReferencia(String comReferencia) {
        this.comReferencia = comReferencia;
    }

    public String getComReferencia() {
        return this.comReferencia;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COMITE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getComNumContrato() != null && this.getComNumContrato().longValue() == -999) {
            conditions += " AND COM_NUM_CONTRATO IS NULL";
        } else if (this.getComNumContrato() != null) {
            conditions += " AND COM_NUM_CONTRATO = ?";
            values.add(this.getComNumContrato());
        }

        if (this.getComNumMiembro() != null && this.getComNumMiembro().longValue() == -999) {
            conditions += " AND COM_NUM_MIEMBRO IS NULL";
        } else if (this.getComNumMiembro() != null) {
            conditions += " AND COM_NUM_MIEMBRO = ?";
            values.add(this.getComNumMiembro());
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
        String sql = "SELECT * FROM COMITE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getComNumContrato() != null && this.getComNumContrato().longValue() == -999) {
            conditions += " AND COM_NUM_CONTRATO IS NULL";
        } else if (this.getComNumContrato() != null) {
            conditions += " AND COM_NUM_CONTRATO = ?";
            values.add(this.getComNumContrato());
        }

        if (this.getComNumMiembro() != null && this.getComNumMiembro().longValue() == -999) {
            conditions += " AND COM_NUM_MIEMBRO IS NULL";
        } else if (this.getComNumMiembro() != null) {
            conditions += " AND COM_NUM_MIEMBRO = ?";
            values.add(this.getComNumMiembro());
        }

        if (this.getComNomMiembro() != null && "null".equals(this.getComNomMiembro())) {
            conditions += " AND COM_NOM_MIEMBRO IS NULL";
        } else if (this.getComNomMiembro() != null) {
            conditions += " AND COM_NOM_MIEMBRO = ?";
            values.add(this.getComNomMiembro());
        }

        if (this.getComRfc() != null && "null".equals(this.getComRfc())) {
            conditions += " AND COM_RFC IS NULL";
        } else if (this.getComRfc() != null) {
            conditions += " AND COM_RFC = ?";
            values.add(this.getComRfc());
        }

        if (this.getComNomInstituc() != null && "null".equals(this.getComNomInstituc())) {
            conditions += " AND COM_NOM_INSTITUC IS NULL";
        } else if (this.getComNomInstituc() != null) {
            conditions += " AND COM_NOM_INSTITUC = ?";
            values.add(this.getComNomInstituc());
        }

        if (this.getComNomPuesto() != null && "null".equals(this.getComNomPuesto())) {
            conditions += " AND COM_NOM_PUESTO IS NULL";
        } else if (this.getComNomPuesto() != null) {
            conditions += " AND COM_NOM_PUESTO = ?";
            values.add(this.getComNomPuesto());
        }

        if (this.getComCveParticip() != null && "null".equals(this.getComCveParticip())) {
            conditions += " AND COM_CVE_PARTICIP IS NULL";
        } else if (this.getComCveParticip() != null) {
            conditions += " AND COM_CVE_PARTICIP = ?";
            values.add(this.getComCveParticip());
        }

        if (this.getComImpAutRetiro() != null && this.getComImpAutRetiro().longValue() == -999) {
            conditions += " AND COM_IMP_AUT_RETIRO IS NULL";
        } else if (this.getComImpAutRetiro() != null) {
            conditions += " AND COM_IMP_AUT_RETIRO = ?";
            values.add(this.getComImpAutRetiro());
        }

        if (this.getComCveVoto() != null && this.getComCveVoto().longValue() == -999) {
            conditions += " AND COM_CVE_VOTO IS NULL";
        } else if (this.getComCveVoto() != null) {
            conditions += " AND COM_CVE_VOTO = ?";
            values.add(this.getComCveVoto());
        }

        if (this.getComCveFirma() != null && "null".equals(this.getComCveFirma())) {
            conditions += " AND COM_CVE_FIRMA IS NULL";
        } else if (this.getComCveFirma() != null) {
            conditions += " AND COM_CVE_FIRMA = ?";
            values.add(this.getComCveFirma());
        }

        if (this.getComAnoAltaReg() != null && this.getComAnoAltaReg().longValue() == -999) {
            conditions += " AND COM_ANO_ALTA_REG IS NULL";
        } else if (this.getComAnoAltaReg() != null) {
            conditions += " AND COM_ANO_ALTA_REG = ?";
            values.add(this.getComAnoAltaReg());
        }

        if (this.getComMesAltaReg() != null && this.getComMesAltaReg().longValue() == -999) {
            conditions += " AND COM_MES_ALTA_REG IS NULL";
        } else if (this.getComMesAltaReg() != null) {
            conditions += " AND COM_MES_ALTA_REG = ?";
            values.add(this.getComMesAltaReg());
        }

        if (this.getComDiaAltaReg() != null && this.getComDiaAltaReg().longValue() == -999) {
            conditions += " AND COM_DIA_ALTA_REG IS NULL";
        } else if (this.getComDiaAltaReg() != null) {
            conditions += " AND COM_DIA_ALTA_REG = ?";
            values.add(this.getComDiaAltaReg());
        }

        if (this.getComAnoUltMod() != null && this.getComAnoUltMod().longValue() == -999) {
            conditions += " AND COM_ANO_ULT_MOD IS NULL";
        } else if (this.getComAnoUltMod() != null) {
            conditions += " AND COM_ANO_ULT_MOD = ?";
            values.add(this.getComAnoUltMod());
        }

        if (this.getComMesUltMod() != null && this.getComMesUltMod().longValue() == -999) {
            conditions += " AND COM_MES_ULT_MOD IS NULL";
        } else if (this.getComMesUltMod() != null) {
            conditions += " AND COM_MES_ULT_MOD = ?";
            values.add(this.getComMesUltMod());
        }

        if (this.getComDiaUltMod() != null && this.getComDiaUltMod().longValue() == -999) {
            conditions += " AND COM_DIA_ULT_MOD IS NULL";
        } else if (this.getComDiaUltMod() != null) {
            conditions += " AND COM_DIA_ULT_MOD = ?";
            values.add(this.getComDiaUltMod());
        }

        if (this.getComCveStMiembro() != null && "null".equals(this.getComCveStMiembro())) {
            conditions += " AND COM_CVE_ST_MIEMBRO IS NULL";
        } else if (this.getComCveStMiembro() != null) {
            conditions += " AND COM_CVE_ST_MIEMBRO = ?";
            values.add(this.getComCveStMiembro());
        }

        if (this.getComAnoDesig() != null && this.getComAnoDesig().longValue() == -999) {
            conditions += " AND COM_ANO_DESIG IS NULL";
        } else if (this.getComAnoDesig() != null) {
            conditions += " AND COM_ANO_DESIG = ?";
            values.add(this.getComAnoDesig());
        }

        if (this.getComMesDesig() != null && this.getComMesDesig().longValue() == -999) {
            conditions += " AND COM_MES_DESIG IS NULL";
        } else if (this.getComMesDesig() != null) {
            conditions += " AND COM_MES_DESIG = ?";
            values.add(this.getComMesDesig());
        }

        if (this.getComDiaDesig() != null && this.getComDiaDesig().longValue() == -999) {
            conditions += " AND COM_DIA_DESIG IS NULL";
        } else if (this.getComDiaDesig() != null) {
            conditions += " AND COM_DIA_DESIG = ?";
            values.add(this.getComDiaDesig());
        }

        if (this.getComReferencia() != null && "null".equals(this.getComReferencia())) {
            conditions += " AND COM_REFERENCIA IS NULL";
        } else if (this.getComReferencia() != null) {
            conditions += " AND COM_REFERENCIA = ?";
            values.add(this.getComReferencia());
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
        String sql = "UPDATE COMITE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND COM_NUM_CONTRATO = ?";
        pkValues.add(this.getComNumContrato());
        conditions += " AND COM_NUM_MIEMBRO = ?";
        pkValues.add(this.getComNumMiembro());
        fields += " COM_NOM_MIEMBRO = ?, ";
        values.add(this.getComNomMiembro());
        fields += " COM_RFC = ?, ";
        values.add(this.getComRfc());
        fields += " COM_NOM_INSTITUC = ?, ";
        values.add(this.getComNomInstituc());
        fields += " COM_NOM_PUESTO = ?, ";
        values.add(this.getComNomPuesto());
        fields += " COM_CVE_PARTICIP = ?, ";
        values.add(this.getComCveParticip());
        fields += " COM_IMP_AUT_RETIRO = ?, ";
        values.add(this.getComImpAutRetiro());
        fields += " COM_CVE_VOTO = ?, ";
        values.add(this.getComCveVoto());
        fields += " COM_CVE_FIRMA = ?, ";
        values.add(this.getComCveFirma());
        fields += " COM_ANO_ALTA_REG = ?, ";
        values.add(this.getComAnoAltaReg());
        fields += " COM_MES_ALTA_REG = ?, ";
        values.add(this.getComMesAltaReg());
        fields += " COM_DIA_ALTA_REG = ?, ";
        values.add(this.getComDiaAltaReg());
        fields += " COM_ANO_ULT_MOD = ?, ";
        values.add(this.getComAnoUltMod());
        fields += " COM_MES_ULT_MOD = ?, ";
        values.add(this.getComMesUltMod());
        fields += " COM_DIA_ULT_MOD = ?, ";
        values.add(this.getComDiaUltMod());
        fields += " COM_CVE_ST_MIEMBRO = ?, ";
        values.add(this.getComCveStMiembro());
        fields += " COM_ANO_DESIG = ?, ";
        values.add(this.getComAnoDesig());
        fields += " COM_MES_DESIG = ?, ";
        values.add(this.getComMesDesig());
        fields += " COM_DIA_DESIG = ?, ";
        values.add(this.getComDiaDesig());
        fields += " COM_REFERENCIA = ?, ";
        values.add(this.getComReferencia());
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
        String sql = "INSERT INTO COMITE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", COM_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getComNumContrato());

        fields += ", COM_NUM_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getComNumMiembro());

        fields += ", COM_NOM_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getComNomMiembro());

        fields += ", COM_RFC";
        fieldValues += ", ?";
        values.add(this.getComRfc());

        fields += ", COM_NOM_INSTITUC";
        fieldValues += ", ?";
        values.add(this.getComNomInstituc());

        fields += ", COM_NOM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getComNomPuesto());

        fields += ", COM_CVE_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getComCveParticip());

        fields += ", COM_IMP_AUT_RETIRO";
        fieldValues += ", ?";
        values.add(this.getComImpAutRetiro());

        fields += ", COM_CVE_VOTO";
        fieldValues += ", ?";
        values.add(this.getComCveVoto());

        fields += ", COM_CVE_FIRMA";
        fieldValues += ", ?";
        values.add(this.getComCveFirma());

        fields += ", COM_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getComAnoAltaReg());

        fields += ", COM_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getComMesAltaReg());

        fields += ", COM_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getComDiaAltaReg());

        fields += ", COM_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getComAnoUltMod());

        fields += ", COM_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getComMesUltMod());

        fields += ", COM_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getComDiaUltMod());

        fields += ", COM_CVE_ST_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getComCveStMiembro());

        fields += ", COM_ANO_DESIG";
        fieldValues += ", ?";
        values.add(this.getComAnoDesig());

        fields += ", COM_MES_DESIG";
        fieldValues += ", ?";
        values.add(this.getComMesDesig());

        fields += ", COM_DIA_DESIG";
        fieldValues += ", ?";
        values.add(this.getComDiaDesig());

        fields += ", COM_REFERENCIA";
        fieldValues += ", ?";
        values.add(this.getComReferencia());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COMITE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND COM_NUM_CONTRATO = ?";
        values.add(this.getComNumContrato());
        conditions += " AND COM_NUM_MIEMBRO = ?";
        values.add(this.getComNumMiembro());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Comite instance = (Comite) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getComNumContrato().equals(instance.getComNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getComNumMiembro().equals(instance.getComNumMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getComNomMiembro().equals(instance.getComNomMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getComRfc().equals(instance.getComRfc()))
            equalObjects = false;
        if (equalObjects && !this.getComNomInstituc().equals(instance.getComNomInstituc()))
            equalObjects = false;
        if (equalObjects && !this.getComNomPuesto().equals(instance.getComNomPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getComCveParticip().equals(instance.getComCveParticip()))
            equalObjects = false;
        if (equalObjects && !this.getComImpAutRetiro().equals(instance.getComImpAutRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getComCveVoto().equals(instance.getComCveVoto()))
            equalObjects = false;
        if (equalObjects && !this.getComCveFirma().equals(instance.getComCveFirma()))
            equalObjects = false;
        if (equalObjects && !this.getComAnoAltaReg().equals(instance.getComAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getComMesAltaReg().equals(instance.getComMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getComDiaAltaReg().equals(instance.getComDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getComAnoUltMod().equals(instance.getComAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getComMesUltMod().equals(instance.getComMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getComDiaUltMod().equals(instance.getComDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getComCveStMiembro().equals(instance.getComCveStMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getComAnoDesig().equals(instance.getComAnoDesig()))
            equalObjects = false;
        if (equalObjects && !this.getComMesDesig().equals(instance.getComMesDesig()))
            equalObjects = false;
        if (equalObjects && !this.getComDiaDesig().equals(instance.getComDiaDesig()))
            equalObjects = false;
        if (equalObjects && !this.getComReferencia().equals(instance.getComReferencia()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Comite result = new Comite();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setComNumContrato((BigDecimal) objectData.getData("COM_NUM_CONTRATO"));
        result.setComNumMiembro((BigDecimal) objectData.getData("COM_NUM_MIEMBRO"));
        result.setComNomMiembro((String) objectData.getData("COM_NOM_MIEMBRO"));
        result.setComRfc((String) objectData.getData("COM_RFC"));
        result.setComNomInstituc((String) objectData.getData("COM_NOM_INSTITUC"));
        result.setComNomPuesto((String) objectData.getData("COM_NOM_PUESTO"));
        result.setComCveParticip((String) objectData.getData("COM_CVE_PARTICIP"));
        result.setComImpAutRetiro((BigDecimal) objectData.getData("COM_IMP_AUT_RETIRO"));
        result.setComCveVoto((BigDecimal) objectData.getData("COM_CVE_VOTO"));
        result.setComCveFirma((String) objectData.getData("COM_CVE_FIRMA"));
        result.setComAnoAltaReg((BigDecimal) objectData.getData("COM_ANO_ALTA_REG"));
        result.setComMesAltaReg((BigDecimal) objectData.getData("COM_MES_ALTA_REG"));
        result.setComDiaAltaReg((BigDecimal) objectData.getData("COM_DIA_ALTA_REG"));
        result.setComAnoUltMod((BigDecimal) objectData.getData("COM_ANO_ULT_MOD"));
        result.setComMesUltMod((BigDecimal) objectData.getData("COM_MES_ULT_MOD"));
        result.setComDiaUltMod((BigDecimal) objectData.getData("COM_DIA_ULT_MOD"));
        result.setComCveStMiembro((String) objectData.getData("COM_CVE_ST_MIEMBRO"));
        result.setComAnoDesig((BigDecimal) objectData.getData("COM_ANO_DESIG"));
        result.setComMesDesig((BigDecimal) objectData.getData("COM_MES_DESIG"));
        result.setComDiaDesig((BigDecimal) objectData.getData("COM_DIA_DESIG"));
        result.setComReferencia((String) objectData.getData("COM_REFERENCIA"));

        return result;

    }

}
