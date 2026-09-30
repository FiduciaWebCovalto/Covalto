package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PK_SALD_CTAS_IND", columns = { "SAL_CONTRATO", "SAL_CLAVE_INV", "SAL_ANO", "SAL_MES" }, sequences = { "MANUAL" })
public class FidSaldosCtasInd extends DomainObject {

    BigDecimal salContrato = null;
    String salClaveInv = null;
    BigDecimal salAno = null;
    BigDecimal salMes = null;
    BigDecimal salInicial = null;
    BigDecimal salImpDep = null;
    BigDecimal salImpRet = null;
    BigDecimal salImporte = null;
    BigDecimal salNumDep = null;
    BigDecimal salNumRet = null;
    String salFecAlta = null;
    String salFecUltMod = null;
    String salCveStatus = null;

    public FidSaldosCtasInd() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalContrato(BigDecimal salContrato) {
        this.salContrato = salContrato;
    }

    public BigDecimal getSalContrato() {
        return this.salContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSalClaveInv(String salClaveInv) {
        this.salClaveInv = salClaveInv;
    }

    public String getSalClaveInv() {
        return this.salClaveInv;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSalAno(BigDecimal salAno) {
        this.salAno = salAno;
    }

    public BigDecimal getSalAno() {
        return this.salAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSalMes(BigDecimal salMes) {
        this.salMes = salMes;
    }

    public BigDecimal getSalMes() {
        return this.salMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 2, javaClass = BigDecimal.class)
    public void setSalInicial(BigDecimal salInicial) {
        this.salInicial = salInicial;
    }

    public BigDecimal getSalInicial() {
        return this.salInicial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 2, javaClass = BigDecimal.class)
    public void setSalImpDep(BigDecimal salImpDep) {
        this.salImpDep = salImpDep;
    }

    public BigDecimal getSalImpDep() {
        return this.salImpDep;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 2, javaClass = BigDecimal.class)
    public void setSalImpRet(BigDecimal salImpRet) {
        this.salImpRet = salImpRet;
    }

    public BigDecimal getSalImpRet() {
        return this.salImpRet;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 2, javaClass = BigDecimal.class)
    public void setSalImporte(BigDecimal salImporte) {
        this.salImporte = salImporte;
    }

    public BigDecimal getSalImporte() {
        return this.salImporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumDep(BigDecimal salNumDep) {
        this.salNumDep = salNumDep;
    }

    public BigDecimal getSalNumDep() {
        return this.salNumDep;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumRet(BigDecimal salNumRet) {
        this.salNumRet = salNumRet;
    }

    public BigDecimal getSalNumRet() {
        return this.salNumRet;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setSalFecAlta(String salFecAlta) {
        this.salFecAlta = salFecAlta;
    }

    public String getSalFecAlta() {
        return this.salFecAlta;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setSalFecUltMod(String salFecUltMod) {
        this.salFecUltMod = salFecUltMod;
    }

    public String getSalFecUltMod() {
        return this.salFecUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSalCveStatus(String salCveStatus) {
        this.salCveStatus = salCveStatus;
    }

    public String getSalCveStatus() {
        return this.salCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_SALDOS_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSalContrato() != null && this.getSalContrato().longValue() == -999) {
            conditions += " AND SAL_CONTRATO IS NULL";
        } else if (this.getSalContrato() != null) {
            conditions += " AND SAL_CONTRATO = ?";
            values.add(this.getSalContrato());
        }

        if (this.getSalClaveInv() != null && "null".equals(this.getSalClaveInv())) {
            conditions += " AND SAL_CLAVE_INV IS NULL";
        } else if (this.getSalClaveInv() != null) {
            conditions += " AND SAL_CLAVE_INV = ?";
            values.add(this.getSalClaveInv());
        }

        if (this.getSalAno() != null && this.getSalAno().longValue() == -999) {
            conditions += " AND SAL_ANO IS NULL";
        } else if (this.getSalAno() != null) {
            conditions += " AND SAL_ANO = ?";
            values.add(this.getSalAno());
        }

        if (this.getSalMes() != null && this.getSalMes().longValue() == -999) {
            conditions += " AND SAL_MES IS NULL";
        } else if (this.getSalMes() != null) {
            conditions += " AND SAL_MES = ?";
            values.add(this.getSalMes());
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
        String sql = "SELECT * FROM FID_SALDOS_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSalContrato() != null && this.getSalContrato().longValue() == -999) {
            conditions += " AND SAL_CONTRATO IS NULL";
        } else if (this.getSalContrato() != null) {
            conditions += " AND SAL_CONTRATO = ?";
            values.add(this.getSalContrato());
        }

        if (this.getSalClaveInv() != null && "null".equals(this.getSalClaveInv())) {
            conditions += " AND SAL_CLAVE_INV IS NULL";
        } else if (this.getSalClaveInv() != null) {
            conditions += " AND SAL_CLAVE_INV = ?";
            values.add(this.getSalClaveInv());
        }

        if (this.getSalAno() != null && this.getSalAno().longValue() == -999) {
            conditions += " AND SAL_ANO IS NULL";
        } else if (this.getSalAno() != null) {
            conditions += " AND SAL_ANO = ?";
            values.add(this.getSalAno());
        }

        if (this.getSalMes() != null && this.getSalMes().longValue() == -999) {
            conditions += " AND SAL_MES IS NULL";
        } else if (this.getSalMes() != null) {
            conditions += " AND SAL_MES = ?";
            values.add(this.getSalMes());
        }

        if (this.getSalInicial() != null && this.getSalInicial().longValue() == -999) {
            conditions += " AND SAL_INICIAL IS NULL";
        } else if (this.getSalInicial() != null) {
            conditions += " AND SAL_INICIAL = ?";
            values.add(this.getSalInicial());
        }

        if (this.getSalImpDep() != null && this.getSalImpDep().longValue() == -999) {
            conditions += " AND SAL_IMP_DEP IS NULL";
        } else if (this.getSalImpDep() != null) {
            conditions += " AND SAL_IMP_DEP = ?";
            values.add(this.getSalImpDep());
        }

        if (this.getSalImpRet() != null && this.getSalImpRet().longValue() == -999) {
            conditions += " AND SAL_IMP_RET IS NULL";
        } else if (this.getSalImpRet() != null) {
            conditions += " AND SAL_IMP_RET = ?";
            values.add(this.getSalImpRet());
        }

        if (this.getSalImporte() != null && this.getSalImporte().longValue() == -999) {
            conditions += " AND SAL_IMPORTE IS NULL";
        } else if (this.getSalImporte() != null) {
            conditions += " AND SAL_IMPORTE = ?";
            values.add(this.getSalImporte());
        }

        if (this.getSalNumDep() != null && this.getSalNumDep().longValue() == -999) {
            conditions += " AND SAL_NUM_DEP IS NULL";
        } else if (this.getSalNumDep() != null) {
            conditions += " AND SAL_NUM_DEP = ?";
            values.add(this.getSalNumDep());
        }

        if (this.getSalNumRet() != null && this.getSalNumRet().longValue() == -999) {
            conditions += " AND SAL_NUM_RET IS NULL";
        } else if (this.getSalNumRet() != null) {
            conditions += " AND SAL_NUM_RET = ?";
            values.add(this.getSalNumRet());
        }

        if (this.getSalFecAlta() != null && "null".equals(this.getSalFecAlta())) {
            conditions += " AND SAL_FEC_ALTA IS NULL";
        } else if (this.getSalFecAlta() != null) {
            conditions += " AND SAL_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSalFecAlta());
        }

        if (this.getSalFecUltMod() != null && "null".equals(this.getSalFecUltMod())) {
            conditions += " AND SAL_FEC_ULT_MOD IS NULL";
        } else if (this.getSalFecUltMod() != null) {
            conditions += " AND SAL_FEC_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSalFecUltMod());
        }

        if (this.getSalCveStatus() != null && "null".equals(this.getSalCveStatus())) {
            conditions += " AND SAL_CVE_STATUS IS NULL";
        } else if (this.getSalCveStatus() != null) {
            conditions += " AND SAL_CVE_STATUS = ?";
            values.add(this.getSalCveStatus());
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
        String sql = "UPDATE FID_SALDOS_CTAS_IND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SAL_CONTRATO = ?";
        pkValues.add(this.getSalContrato());
        conditions += " AND SAL_CLAVE_INV = ?";
        pkValues.add(this.getSalClaveInv());
        conditions += " AND SAL_ANO = ?";
        pkValues.add(this.getSalAno());
        conditions += " AND SAL_MES = ?";
        pkValues.add(this.getSalMes());
        fields += " SAL_INICIAL = ?, ";
        values.add(this.getSalInicial());
        fields += " SAL_IMP_DEP = ?, ";
        values.add(this.getSalImpDep());
        fields += " SAL_IMP_RET = ?, ";
        values.add(this.getSalImpRet());
        fields += " SAL_IMPORTE = ?, ";
        values.add(this.getSalImporte());
        fields += " SAL_NUM_DEP = ?, ";
        values.add(this.getSalNumDep());
        fields += " SAL_NUM_RET = ?, ";
        values.add(this.getSalNumRet());
        fields += " SAL_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getSalFecAlta());
        fields += " SAL_FEC_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getSalFecUltMod());
        fields += " SAL_CVE_STATUS = ?, ";
        values.add(this.getSalCveStatus());
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
        String sql = "INSERT INTO FID_SALDOS_CTAS_IND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SAL_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSalContrato());

        fields += ", SAL_CLAVE_INV";
        fieldValues += ", ?";
        values.add(this.getSalClaveInv());

        fields += ", SAL_ANO";
        fieldValues += ", ?";
        values.add(this.getSalAno());

        fields += ", SAL_MES";
        fieldValues += ", ?";
        values.add(this.getSalMes());

        fields += ", SAL_INICIAL";
        fieldValues += ", ?";
        values.add(this.getSalInicial());

        fields += ", SAL_IMP_DEP";
        fieldValues += ", ?";
        values.add(this.getSalImpDep());

        fields += ", SAL_IMP_RET";
        fieldValues += ", ?";
        values.add(this.getSalImpRet());

        fields += ", SAL_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getSalImporte());

        fields += ", SAL_NUM_DEP";
        fieldValues += ", ?";
        values.add(this.getSalNumDep());

        fields += ", SAL_NUM_RET";
        fieldValues += ", ?";
        values.add(this.getSalNumRet());

        fields += ", SAL_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSalFecAlta());

        fields += ", SAL_FEC_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSalFecUltMod());

        fields += ", SAL_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getSalCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_SALDOS_CTAS_IND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SAL_CONTRATO = ?";
        values.add(this.getSalContrato());
        conditions += " AND SAL_CLAVE_INV = ?";
        values.add(this.getSalClaveInv());
        conditions += " AND SAL_ANO = ?";
        values.add(this.getSalAno());
        conditions += " AND SAL_MES = ?";
        values.add(this.getSalMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidSaldosCtasInd instance = (FidSaldosCtasInd) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSalContrato().equals(instance.getSalContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSalClaveInv().equals(instance.getSalClaveInv()))
            equalObjects = false;
        if (equalObjects && !this.getSalAno().equals(instance.getSalAno()))
            equalObjects = false;
        if (equalObjects && !this.getSalMes().equals(instance.getSalMes()))
            equalObjects = false;
        if (equalObjects && !this.getSalInicial().equals(instance.getSalInicial()))
            equalObjects = false;
        if (equalObjects && !this.getSalImpDep().equals(instance.getSalImpDep()))
            equalObjects = false;
        if (equalObjects && !this.getSalImpRet().equals(instance.getSalImpRet()))
            equalObjects = false;
        if (equalObjects && !this.getSalImporte().equals(instance.getSalImporte()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumDep().equals(instance.getSalNumDep()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumRet().equals(instance.getSalNumRet()))
            equalObjects = false;
        if (equalObjects && !this.getSalFecAlta().equals(instance.getSalFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getSalFecUltMod().equals(instance.getSalFecUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSalCveStatus().equals(instance.getSalCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidSaldosCtasInd result = new FidSaldosCtasInd();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSalContrato((BigDecimal) objectData.getData("SAL_CONTRATO"));
        result.setSalClaveInv((String) objectData.getData("SAL_CLAVE_INV"));
        result.setSalAno((BigDecimal) objectData.getData("SAL_ANO"));
        result.setSalMes((BigDecimal) objectData.getData("SAL_MES"));
        result.setSalInicial((BigDecimal) objectData.getData("SAL_INICIAL"));
        result.setSalImpDep((BigDecimal) objectData.getData("SAL_IMP_DEP"));
        result.setSalImpRet((BigDecimal) objectData.getData("SAL_IMP_RET"));
        result.setSalImporte((BigDecimal) objectData.getData("SAL_IMPORTE"));
        result.setSalNumDep((BigDecimal) objectData.getData("SAL_NUM_DEP"));
        result.setSalNumRet((BigDecimal) objectData.getData("SAL_NUM_RET"));
        result.setSalFecAlta((String) objectData.getData("SAL_FEC_ALTA"));
        result.setSalFecUltMod((String) objectData.getData("SAL_FEC_ULT_MOD"));
        result.setSalCveStatus((String) objectData.getData("SAL_CVE_STATUS"));

        return result;

    }

}
