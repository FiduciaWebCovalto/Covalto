package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DETLIQUIHONO_PK", columns = { "DETH_NUM_CONTRATO", "DETH_FOLIO_OPERA" }, sequences = { "MANUAL" })
public class DetliquiHono extends DomainObject {

    BigDecimal dethNumContrato = null;
    BigDecimal dethFolioOpera = null;
    BigDecimal dethImpTot = null;
    BigDecimal dethImpHonor = null;
    BigDecimal dethIva = null;
    BigDecimal dethRetIsr = null;
    BigDecimal dethRetIva = null;

    public DetliquiHono() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDethNumContrato(BigDecimal dethNumContrato) {
        this.dethNumContrato = dethNumContrato;
    }

    public BigDecimal getDethNumContrato() {
        return this.dethNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDethFolioOpera(BigDecimal dethFolioOpera) {
        this.dethFolioOpera = dethFolioOpera;
    }

    public BigDecimal getDethFolioOpera() {
        return this.dethFolioOpera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDethImpTot(BigDecimal dethImpTot) {
        this.dethImpTot = dethImpTot;
    }

    public BigDecimal getDethImpTot() {
        return this.dethImpTot;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDethImpHonor(BigDecimal dethImpHonor) {
        this.dethImpHonor = dethImpHonor;
    }

    public BigDecimal getDethImpHonor() {
        return this.dethImpHonor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDethIva(BigDecimal dethIva) {
        this.dethIva = dethIva;
    }

    public BigDecimal getDethIva() {
        return this.dethIva;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDethRetIsr(BigDecimal dethRetIsr) {
        this.dethRetIsr = dethRetIsr;
    }

    public BigDecimal getDethRetIsr() {
        return this.dethRetIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDethRetIva(BigDecimal dethRetIva) {
        this.dethRetIva = dethRetIva;
    }

    public BigDecimal getDethRetIva() {
        return this.dethRetIva;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DETLIQUI_HONO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDethNumContrato() != null && this.getDethNumContrato().longValue() == -999) {
            conditions += " AND DETH_NUM_CONTRATO IS NULL";
        } else if (this.getDethNumContrato() != null) {
            conditions += " AND DETH_NUM_CONTRATO = ?";
            values.add(this.getDethNumContrato());
        }

        if (this.getDethFolioOpera() != null && this.getDethFolioOpera().longValue() == -999) {
            conditions += " AND DETH_FOLIO_OPERA IS NULL";
        } else if (this.getDethFolioOpera() != null) {
            conditions += " AND DETH_FOLIO_OPERA = ?";
            values.add(this.getDethFolioOpera());
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
        String sql = "SELECT * FROM DETLIQUI_HONO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDethNumContrato() != null && this.getDethNumContrato().longValue() == -999) {
            conditions += " AND DETH_NUM_CONTRATO IS NULL";
        } else if (this.getDethNumContrato() != null) {
            conditions += " AND DETH_NUM_CONTRATO = ?";
            values.add(this.getDethNumContrato());
        }

        if (this.getDethFolioOpera() != null && this.getDethFolioOpera().longValue() == -999) {
            conditions += " AND DETH_FOLIO_OPERA IS NULL";
        } else if (this.getDethFolioOpera() != null) {
            conditions += " AND DETH_FOLIO_OPERA = ?";
            values.add(this.getDethFolioOpera());
        }

        if (this.getDethImpTot() != null && this.getDethImpTot().longValue() == -999) {
            conditions += " AND DETH_IMP_TOT IS NULL";
        } else if (this.getDethImpTot() != null) {
            conditions += " AND DETH_IMP_TOT = ?";
            values.add(this.getDethImpTot());
        }

        if (this.getDethImpHonor() != null && this.getDethImpHonor().longValue() == -999) {
            conditions += " AND DETH_IMP_HONOR IS NULL";
        } else if (this.getDethImpHonor() != null) {
            conditions += " AND DETH_IMP_HONOR = ?";
            values.add(this.getDethImpHonor());
        }

        if (this.getDethIva() != null && this.getDethIva().longValue() == -999) {
            conditions += " AND DETH_IVA IS NULL";
        } else if (this.getDethIva() != null) {
            conditions += " AND DETH_IVA = ?";
            values.add(this.getDethIva());
        }

        if (this.getDethRetIsr() != null && this.getDethRetIsr().longValue() == -999) {
            conditions += " AND DETH_RET_ISR IS NULL";
        } else if (this.getDethRetIsr() != null) {
            conditions += " AND DETH_RET_ISR = ?";
            values.add(this.getDethRetIsr());
        }

        if (this.getDethRetIva() != null && this.getDethRetIva().longValue() == -999) {
            conditions += " AND DETH_RET_IVA IS NULL";
        } else if (this.getDethRetIva() != null) {
            conditions += " AND DETH_RET_IVA = ?";
            values.add(this.getDethRetIva());
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
        String sql = "UPDATE DETLIQUI_HONO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DETH_NUM_CONTRATO = ?";
        pkValues.add(this.getDethNumContrato());
        conditions += " AND DETH_FOLIO_OPERA = ?";
        pkValues.add(this.getDethFolioOpera());
        fields += " DETH_IMP_TOT = ?, ";
        values.add(this.getDethImpTot());
        fields += " DETH_IMP_HONOR = ?, ";
        values.add(this.getDethImpHonor());
        fields += " DETH_IVA = ?, ";
        values.add(this.getDethIva());
        fields += " DETH_RET_ISR = ?, ";
        values.add(this.getDethRetIsr());
        fields += " DETH_RET_IVA = ?, ";
        values.add(this.getDethRetIva());
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
        String sql = "INSERT INTO DETLIQUI_HONO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DETH_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDethNumContrato());

        fields += ", DETH_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDethFolioOpera());

        fields += ", DETH_IMP_TOT";
        fieldValues += ", ?";
        values.add(this.getDethImpTot());

        fields += ", DETH_IMP_HONOR";
        fieldValues += ", ?";
        values.add(this.getDethImpHonor());

        fields += ", DETH_IVA";
        fieldValues += ", ?";
        values.add(this.getDethIva());

        fields += ", DETH_RET_ISR";
        fieldValues += ", ?";
        values.add(this.getDethRetIsr());

        fields += ", DETH_RET_IVA";
        fieldValues += ", ?";
        values.add(this.getDethRetIva());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DETLIQUI_HONO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DETH_NUM_CONTRATO = ?";
        values.add(this.getDethNumContrato());
        conditions += " AND DETH_FOLIO_OPERA = ?";
        values.add(this.getDethFolioOpera());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        DetliquiHono instance = (DetliquiHono) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDethNumContrato().equals(instance.getDethNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDethFolioOpera().equals(instance.getDethFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDethImpTot().equals(instance.getDethImpTot()))
            equalObjects = false;
        if (equalObjects && !this.getDethImpHonor().equals(instance.getDethImpHonor()))
            equalObjects = false;
        if (equalObjects && !this.getDethIva().equals(instance.getDethIva()))
            equalObjects = false;
        if (equalObjects && !this.getDethRetIsr().equals(instance.getDethRetIsr()))
            equalObjects = false;
        if (equalObjects && !this.getDethRetIva().equals(instance.getDethRetIva()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        DetliquiHono result = new DetliquiHono();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDethNumContrato((BigDecimal) objectData.getData("DETH_NUM_CONTRATO"));
        result.setDethFolioOpera((BigDecimal) objectData.getData("DETH_FOLIO_OPERA"));
        result.setDethImpTot((BigDecimal) objectData.getData("DETH_IMP_TOT"));
        result.setDethImpHonor((BigDecimal) objectData.getData("DETH_IMP_HONOR"));
        result.setDethIva((BigDecimal) objectData.getData("DETH_IVA"));
        result.setDethRetIsr((BigDecimal) objectData.getData("DETH_RET_ISR"));
        result.setDethRetIva((BigDecimal) objectData.getData("DETH_RET_IVA"));

        return result;

    }

}
