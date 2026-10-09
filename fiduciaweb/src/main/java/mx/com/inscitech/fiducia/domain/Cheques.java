package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CHEQUES_PK", columns = { "CHE_NUM_CHEQUE" }, sequences = { "MAX" })
public class Cheques extends DomainObject {

    BigDecimal cheNumCheque = null;
    BigDecimal cheFolioOpera = null;
    BigDecimal cheNumContrato = null;
    BigDecimal cheImpLiquidar = null;
    String cheNomPersonFid = null;
    BigDecimal cheAnoExpecicion = null;
    BigDecimal cheMesExpedicion = null;
    BigDecimal cheDiaExpedicion = null;
    String cheHrExpedicion = null;
    BigDecimal cheCveReimprime = null;
    BigDecimal cheNumChequeAnt = null;
    BigDecimal cheAnoUltMod = null;
    BigDecimal cheMesUltMod = null;
    BigDecimal cheDiaUltMod = null;
    String cheCveStCheques = null;
    String cheImpLetra = null;

    public Cheques() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCheNumCheque(BigDecimal cheNumCheque) {
        this.cheNumCheque = cheNumCheque;
    }

    public BigDecimal getCheNumCheque() {
        return this.cheNumCheque;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCheFolioOpera(BigDecimal cheFolioOpera) {
        this.cheFolioOpera = cheFolioOpera;
    }

    public BigDecimal getCheFolioOpera() {
        return this.cheFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCheNumContrato(BigDecimal cheNumContrato) {
        this.cheNumContrato = cheNumContrato;
    }

    public BigDecimal getCheNumContrato() {
        return this.cheNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCheImpLiquidar(BigDecimal cheImpLiquidar) {
        this.cheImpLiquidar = cheImpLiquidar;
    }

    public BigDecimal getCheImpLiquidar() {
        return this.cheImpLiquidar;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCheNomPersonFid(String cheNomPersonFid) {
        this.cheNomPersonFid = cheNomPersonFid;
    }

    public String getCheNomPersonFid() {
        return this.cheNomPersonFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCheAnoExpecicion(BigDecimal cheAnoExpecicion) {
        this.cheAnoExpecicion = cheAnoExpecicion;
    }

    public BigDecimal getCheAnoExpecicion() {
        return this.cheAnoExpecicion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCheMesExpedicion(BigDecimal cheMesExpedicion) {
        this.cheMesExpedicion = cheMesExpedicion;
    }

    public BigDecimal getCheMesExpedicion() {
        return this.cheMesExpedicion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCheDiaExpedicion(BigDecimal cheDiaExpedicion) {
        this.cheDiaExpedicion = cheDiaExpedicion;
    }

    public BigDecimal getCheDiaExpedicion() {
        return this.cheDiaExpedicion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCheHrExpedicion(String cheHrExpedicion) {
        this.cheHrExpedicion = cheHrExpedicion;
    }

    public String getCheHrExpedicion() {
        return this.cheHrExpedicion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCheCveReimprime(BigDecimal cheCveReimprime) {
        this.cheCveReimprime = cheCveReimprime;
    }

    public BigDecimal getCheCveReimprime() {
        return this.cheCveReimprime;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCheNumChequeAnt(BigDecimal cheNumChequeAnt) {
        this.cheNumChequeAnt = cheNumChequeAnt;
    }

    public BigDecimal getCheNumChequeAnt() {
        return this.cheNumChequeAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCheAnoUltMod(BigDecimal cheAnoUltMod) {
        this.cheAnoUltMod = cheAnoUltMod;
    }

    public BigDecimal getCheAnoUltMod() {
        return this.cheAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCheMesUltMod(BigDecimal cheMesUltMod) {
        this.cheMesUltMod = cheMesUltMod;
    }

    public BigDecimal getCheMesUltMod() {
        return this.cheMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCheDiaUltMod(BigDecimal cheDiaUltMod) {
        this.cheDiaUltMod = cheDiaUltMod;
    }

    public BigDecimal getCheDiaUltMod() {
        return this.cheDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCheCveStCheques(String cheCveStCheques) {
        this.cheCveStCheques = cheCveStCheques;
    }

    public String getCheCveStCheques() {
        return this.cheCveStCheques;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCheImpLetra(String cheImpLetra) {
        this.cheImpLetra = cheImpLetra;
    }

    public String getCheImpLetra() {
        return this.cheImpLetra;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CHEQUES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCheNumCheque() != null && this.getCheNumCheque().longValue() == -999) {
            conditions += " AND CHE_NUM_CHEQUE IS NULL";
        } else if (this.getCheNumCheque() != null) {
            conditions += " AND CHE_NUM_CHEQUE = ?";
            values.add(this.getCheNumCheque());
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
        String sql = "SELECT * FROM CHEQUES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCheNumCheque() != null && this.getCheNumCheque().longValue() == -999) {
            conditions += " AND CHE_NUM_CHEQUE IS NULL";
        } else if (this.getCheNumCheque() != null) {
            conditions += " AND CHE_NUM_CHEQUE = ?";
            values.add(this.getCheNumCheque());
        }

        if (this.getCheFolioOpera() != null && this.getCheFolioOpera().longValue() == -999) {
            conditions += " AND CHE_FOLIO_OPERA IS NULL";
        } else if (this.getCheFolioOpera() != null) {
            conditions += " AND CHE_FOLIO_OPERA = ?";
            values.add(this.getCheFolioOpera());
        }

        if (this.getCheNumContrato() != null && this.getCheNumContrato().longValue() == -999) {
            conditions += " AND CHE_NUM_CONTRATO IS NULL";
        } else if (this.getCheNumContrato() != null) {
            conditions += " AND CHE_NUM_CONTRATO = ?";
            values.add(this.getCheNumContrato());
        }

        if (this.getCheImpLiquidar() != null && this.getCheImpLiquidar().longValue() == -999) {
            conditions += " AND CHE_IMP_LIQUIDAR IS NULL";
        } else if (this.getCheImpLiquidar() != null) {
            conditions += " AND CHE_IMP_LIQUIDAR = ?";
            values.add(this.getCheImpLiquidar());
        }

        if (this.getCheNomPersonFid() != null && "null".equals(this.getCheNomPersonFid())) {
            conditions += " AND CHE_NOM_PERSON_FID IS NULL";
        } else if (this.getCheNomPersonFid() != null) {
            conditions += " AND CHE_NOM_PERSON_FID = ?";
            values.add(this.getCheNomPersonFid());
        }

        if (this.getCheAnoExpecicion() != null && this.getCheAnoExpecicion().longValue() == -999) {
            conditions += " AND CHE_ANO_EXPECICION IS NULL";
        } else if (this.getCheAnoExpecicion() != null) {
            conditions += " AND CHE_ANO_EXPECICION = ?";
            values.add(this.getCheAnoExpecicion());
        }

        if (this.getCheMesExpedicion() != null && this.getCheMesExpedicion().longValue() == -999) {
            conditions += " AND CHE_MES_EXPEDICION IS NULL";
        } else if (this.getCheMesExpedicion() != null) {
            conditions += " AND CHE_MES_EXPEDICION = ?";
            values.add(this.getCheMesExpedicion());
        }

        if (this.getCheDiaExpedicion() != null && this.getCheDiaExpedicion().longValue() == -999) {
            conditions += " AND CHE_DIA_EXPEDICION IS NULL";
        } else if (this.getCheDiaExpedicion() != null) {
            conditions += " AND CHE_DIA_EXPEDICION = ?";
            values.add(this.getCheDiaExpedicion());
        }

        if (this.getCheHrExpedicion() != null && "null".equals(this.getCheHrExpedicion())) {
            conditions += " AND CHE_HR_EXPEDICION IS NULL";
        } else if (this.getCheHrExpedicion() != null) {
            conditions += " AND CHE_HR_EXPEDICION = ?";
            values.add(this.getCheHrExpedicion());
        }

        if (this.getCheCveReimprime() != null && this.getCheCveReimprime().longValue() == -999) {
            conditions += " AND CHE_CVE_REIMPRIME IS NULL";
        } else if (this.getCheCveReimprime() != null) {
            conditions += " AND CHE_CVE_REIMPRIME = ?";
            values.add(this.getCheCveReimprime());
        }

        if (this.getCheNumChequeAnt() != null && this.getCheNumChequeAnt().longValue() == -999) {
            conditions += " AND CHE_NUM_CHEQUE_ANT IS NULL";
        } else if (this.getCheNumChequeAnt() != null) {
            conditions += " AND CHE_NUM_CHEQUE_ANT = ?";
            values.add(this.getCheNumChequeAnt());
        }

        if (this.getCheAnoUltMod() != null && this.getCheAnoUltMod().longValue() == -999) {
            conditions += " AND CHE_ANO_ULT_MOD IS NULL";
        } else if (this.getCheAnoUltMod() != null) {
            conditions += " AND CHE_ANO_ULT_MOD = ?";
            values.add(this.getCheAnoUltMod());
        }

        if (this.getCheMesUltMod() != null && this.getCheMesUltMod().longValue() == -999) {
            conditions += " AND CHE_MES_ULT_MOD IS NULL";
        } else if (this.getCheMesUltMod() != null) {
            conditions += " AND CHE_MES_ULT_MOD = ?";
            values.add(this.getCheMesUltMod());
        }

        if (this.getCheDiaUltMod() != null && this.getCheDiaUltMod().longValue() == -999) {
            conditions += " AND CHE_DIA_ULT_MOD IS NULL";
        } else if (this.getCheDiaUltMod() != null) {
            conditions += " AND CHE_DIA_ULT_MOD = ?";
            values.add(this.getCheDiaUltMod());
        }

        if (this.getCheCveStCheques() != null && "null".equals(this.getCheCveStCheques())) {
            conditions += " AND CHE_CVE_ST_CHEQUES IS NULL";
        } else if (this.getCheCveStCheques() != null) {
            conditions += " AND CHE_CVE_ST_CHEQUES = ?";
            values.add(this.getCheCveStCheques());
        }

        if (this.getCheImpLetra() != null && "null".equals(this.getCheImpLetra())) {
            conditions += " AND CHE_IMP_LETRA IS NULL";
        } else if (this.getCheImpLetra() != null) {
            conditions += " AND CHE_IMP_LETRA = ?";
            values.add(this.getCheImpLetra());
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
        String sql = "UPDATE CHEQUES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CHE_NUM_CHEQUE = ?";
        pkValues.add(this.getCheNumCheque());
        fields += " CHE_FOLIO_OPERA = ?, ";
        values.add(this.getCheFolioOpera());
        fields += " CHE_NUM_CONTRATO = ?, ";
        values.add(this.getCheNumContrato());
        fields += " CHE_IMP_LIQUIDAR = ?, ";
        values.add(this.getCheImpLiquidar());
        fields += " CHE_NOM_PERSON_FID = ?, ";
        values.add(this.getCheNomPersonFid());
        fields += " CHE_ANO_EXPECICION = ?, ";
        values.add(this.getCheAnoExpecicion());
        fields += " CHE_MES_EXPEDICION = ?, ";
        values.add(this.getCheMesExpedicion());
        fields += " CHE_DIA_EXPEDICION = ?, ";
        values.add(this.getCheDiaExpedicion());
        fields += " CHE_HR_EXPEDICION = ?, ";
        values.add(this.getCheHrExpedicion());
        fields += " CHE_CVE_REIMPRIME = ?, ";
        values.add(this.getCheCveReimprime());
        fields += " CHE_NUM_CHEQUE_ANT = ?, ";
        values.add(this.getCheNumChequeAnt());
        fields += " CHE_ANO_ULT_MOD = ?, ";
        values.add(this.getCheAnoUltMod());
        fields += " CHE_MES_ULT_MOD = ?, ";
        values.add(this.getCheMesUltMod());
        fields += " CHE_DIA_ULT_MOD = ?, ";
        values.add(this.getCheDiaUltMod());
        fields += " CHE_CVE_ST_CHEQUES = ?, ";
        values.add(this.getCheCveStCheques());
        fields += " CHE_IMP_LETRA = ?, ";
        values.add(this.getCheImpLetra());
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
        String sql = "INSERT INTO CHEQUES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CHE_NUM_CHEQUE";
        fieldValues += ", ?";
        values.add(this.getCheNumCheque());

        fields += ", CHE_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getCheFolioOpera());

        fields += ", CHE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCheNumContrato());

        fields += ", CHE_IMP_LIQUIDAR";
        fieldValues += ", ?";
        values.add(this.getCheImpLiquidar());

        fields += ", CHE_NOM_PERSON_FID";
        fieldValues += ", ?";
        values.add(this.getCheNomPersonFid());

        fields += ", CHE_ANO_EXPECICION";
        fieldValues += ", ?";
        values.add(this.getCheAnoExpecicion());

        fields += ", CHE_MES_EXPEDICION";
        fieldValues += ", ?";
        values.add(this.getCheMesExpedicion());

        fields += ", CHE_DIA_EXPEDICION";
        fieldValues += ", ?";
        values.add(this.getCheDiaExpedicion());

        fields += ", CHE_HR_EXPEDICION";
        fieldValues += ", ?";
        values.add(this.getCheHrExpedicion());

        fields += ", CHE_CVE_REIMPRIME";
        fieldValues += ", ?";
        values.add(this.getCheCveReimprime());

        fields += ", CHE_NUM_CHEQUE_ANT";
        fieldValues += ", ?";
        values.add(this.getCheNumChequeAnt());

        fields += ", CHE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCheAnoUltMod());

        fields += ", CHE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCheMesUltMod());

        fields += ", CHE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCheDiaUltMod());

        fields += ", CHE_CVE_ST_CHEQUES";
        fieldValues += ", ?";
        values.add(this.getCheCveStCheques());

        fields += ", CHE_IMP_LETRA";
        fieldValues += ", ?";
        values.add(this.getCheImpLetra());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CHEQUES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CHE_NUM_CHEQUE = ?";
        values.add(this.getCheNumCheque());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cheques instance = (Cheques) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCheNumCheque().equals(instance.getCheNumCheque()))
            equalObjects = false;
        if (equalObjects && !this.getCheFolioOpera().equals(instance.getCheFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getCheNumContrato().equals(instance.getCheNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCheImpLiquidar().equals(instance.getCheImpLiquidar()))
            equalObjects = false;
        if (equalObjects && !this.getCheNomPersonFid().equals(instance.getCheNomPersonFid()))
            equalObjects = false;
        if (equalObjects && !this.getCheAnoExpecicion().equals(instance.getCheAnoExpecicion()))
            equalObjects = false;
        if (equalObjects && !this.getCheMesExpedicion().equals(instance.getCheMesExpedicion()))
            equalObjects = false;
        if (equalObjects && !this.getCheDiaExpedicion().equals(instance.getCheDiaExpedicion()))
            equalObjects = false;
        if (equalObjects && !this.getCheHrExpedicion().equals(instance.getCheHrExpedicion()))
            equalObjects = false;
        if (equalObjects && !this.getCheCveReimprime().equals(instance.getCheCveReimprime()))
            equalObjects = false;
        if (equalObjects && !this.getCheNumChequeAnt().equals(instance.getCheNumChequeAnt()))
            equalObjects = false;
        if (equalObjects && !this.getCheAnoUltMod().equals(instance.getCheAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCheMesUltMod().equals(instance.getCheMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCheDiaUltMod().equals(instance.getCheDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCheCveStCheques().equals(instance.getCheCveStCheques()))
            equalObjects = false;
        if (equalObjects && !this.getCheImpLetra().equals(instance.getCheImpLetra()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cheques result = new Cheques();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCheNumCheque((BigDecimal) objectData.getData("CHE_NUM_CHEQUE"));
        result.setCheFolioOpera((BigDecimal) objectData.getData("CHE_FOLIO_OPERA"));
        result.setCheNumContrato((BigDecimal) objectData.getData("CHE_NUM_CONTRATO"));
        result.setCheImpLiquidar((BigDecimal) objectData.getData("CHE_IMP_LIQUIDAR"));
        result.setCheNomPersonFid((String) objectData.getData("CHE_NOM_PERSON_FID"));
        result.setCheAnoExpecicion((BigDecimal) objectData.getData("CHE_ANO_EXPECICION"));
        result.setCheMesExpedicion((BigDecimal) objectData.getData("CHE_MES_EXPEDICION"));
        result.setCheDiaExpedicion((BigDecimal) objectData.getData("CHE_DIA_EXPEDICION"));
        result.setCheHrExpedicion((String) objectData.getData("CHE_HR_EXPEDICION"));
        result.setCheCveReimprime((BigDecimal) objectData.getData("CHE_CVE_REIMPRIME"));
        result.setCheNumChequeAnt((BigDecimal) objectData.getData("CHE_NUM_CHEQUE_ANT"));
        result.setCheAnoUltMod((BigDecimal) objectData.getData("CHE_ANO_ULT_MOD"));
        result.setCheMesUltMod((BigDecimal) objectData.getData("CHE_MES_ULT_MOD"));
        result.setCheDiaUltMod((BigDecimal) objectData.getData("CHE_DIA_ULT_MOD"));
        result.setCheCveStCheques((String) objectData.getData("CHE_CVE_ST_CHEQUES"));
        result.setCheImpLetra((String) objectData.getData("CHE_IMP_LETRA"));

        return result;

    }

}
