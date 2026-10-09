package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REP_IND_MEN_MON_PK", columns = { "RIM_FECHA" }, sequences = { "MAX" })
public class FRepIndMenMon extends DomainObject {

    String rimFecha = null;
    BigDecimal rimNumoperRec = null;
    BigDecimal rimNumoperCon = null;
    BigDecimal rimNumoperRech = null;
    BigDecimal rimNumfidTot = null;
    BigDecimal rimNumfidMov = null;
    BigDecimal rimImpTotal = null;
    BigDecimal rimNumopeDep = null;
    BigDecimal rimImpDep = null;
    BigDecimal rimNumopeRet = null;
    BigDecimal rimImpRet = null;

    public FRepIndMenMon() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setRimFecha(String rimFecha) {
        this.rimFecha = rimFecha;
    }

    public String getRimFecha() {
        return this.rimFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setRimNumoperRec(BigDecimal rimNumoperRec) {
        this.rimNumoperRec = rimNumoperRec;
    }

    public BigDecimal getRimNumoperRec() {
        return this.rimNumoperRec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setRimNumoperCon(BigDecimal rimNumoperCon) {
        this.rimNumoperCon = rimNumoperCon;
    }

    public BigDecimal getRimNumoperCon() {
        return this.rimNumoperCon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setRimNumoperRech(BigDecimal rimNumoperRech) {
        this.rimNumoperRech = rimNumoperRech;
    }

    public BigDecimal getRimNumoperRech() {
        return this.rimNumoperRech;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setRimNumfidTot(BigDecimal rimNumfidTot) {
        this.rimNumfidTot = rimNumfidTot;
    }

    public BigDecimal getRimNumfidTot() {
        return this.rimNumfidTot;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setRimNumfidMov(BigDecimal rimNumfidMov) {
        this.rimNumfidMov = rimNumfidMov;
    }

    public BigDecimal getRimNumfidMov() {
        return this.rimNumfidMov;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRimImpTotal(BigDecimal rimImpTotal) {
        this.rimImpTotal = rimImpTotal;
    }

    public BigDecimal getRimImpTotal() {
        return this.rimImpTotal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setRimNumopeDep(BigDecimal rimNumopeDep) {
        this.rimNumopeDep = rimNumopeDep;
    }

    public BigDecimal getRimNumopeDep() {
        return this.rimNumopeDep;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRimImpDep(BigDecimal rimImpDep) {
        this.rimImpDep = rimImpDep;
    }

    public BigDecimal getRimImpDep() {
        return this.rimImpDep;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setRimNumopeRet(BigDecimal rimNumopeRet) {
        this.rimNumopeRet = rimNumopeRet;
    }

    public BigDecimal getRimNumopeRet() {
        return this.rimNumopeRet;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRimImpRet(BigDecimal rimImpRet) {
        this.rimImpRet = rimImpRet;
    }

    public BigDecimal getRimImpRet() {
        return this.rimImpRet;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_IND_MEN_MON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRimFecha() != null && "null".equals(this.getRimFecha())) {
            conditions += " AND RIM_FECHA IS NULL";
        } else if (this.getRimFecha() != null) {
            conditions += " AND RIM_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRimFecha());
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
        String sql = "SELECT * FROM F_REP_IND_MEN_MON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRimFecha() != null && "null".equals(this.getRimFecha())) {
            conditions += " AND RIM_FECHA IS NULL";
        } else if (this.getRimFecha() != null) {
            conditions += " AND RIM_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRimFecha());
        }

        if (this.getRimNumoperRec() != null && this.getRimNumoperRec().longValue() == -999) {
            conditions += " AND RIM_NUMOPER_REC IS NULL";
        } else if (this.getRimNumoperRec() != null) {
            conditions += " AND RIM_NUMOPER_REC = ?";
            values.add(this.getRimNumoperRec());
        }

        if (this.getRimNumoperCon() != null && this.getRimNumoperCon().longValue() == -999) {
            conditions += " AND RIM_NUMOPER_CON IS NULL";
        } else if (this.getRimNumoperCon() != null) {
            conditions += " AND RIM_NUMOPER_CON = ?";
            values.add(this.getRimNumoperCon());
        }

        if (this.getRimNumoperRech() != null && this.getRimNumoperRech().longValue() == -999) {
            conditions += " AND RIM_NUMOPER_RECH IS NULL";
        } else if (this.getRimNumoperRech() != null) {
            conditions += " AND RIM_NUMOPER_RECH = ?";
            values.add(this.getRimNumoperRech());
        }

        if (this.getRimNumfidTot() != null && this.getRimNumfidTot().longValue() == -999) {
            conditions += " AND RIM_NUMFID_TOT IS NULL";
        } else if (this.getRimNumfidTot() != null) {
            conditions += " AND RIM_NUMFID_TOT = ?";
            values.add(this.getRimNumfidTot());
        }

        if (this.getRimNumfidMov() != null && this.getRimNumfidMov().longValue() == -999) {
            conditions += " AND RIM_NUMFID_MOV IS NULL";
        } else if (this.getRimNumfidMov() != null) {
            conditions += " AND RIM_NUMFID_MOV = ?";
            values.add(this.getRimNumfidMov());
        }

        if (this.getRimImpTotal() != null && this.getRimImpTotal().longValue() == -999) {
            conditions += " AND RIM_IMP_TOTAL IS NULL";
        } else if (this.getRimImpTotal() != null) {
            conditions += " AND RIM_IMP_TOTAL = ?";
            values.add(this.getRimImpTotal());
        }

        if (this.getRimNumopeDep() != null && this.getRimNumopeDep().longValue() == -999) {
            conditions += " AND RIM_NUMOPE_DEP IS NULL";
        } else if (this.getRimNumopeDep() != null) {
            conditions += " AND RIM_NUMOPE_DEP = ?";
            values.add(this.getRimNumopeDep());
        }

        if (this.getRimImpDep() != null && this.getRimImpDep().longValue() == -999) {
            conditions += " AND RIM_IMP_DEP IS NULL";
        } else if (this.getRimImpDep() != null) {
            conditions += " AND RIM_IMP_DEP = ?";
            values.add(this.getRimImpDep());
        }

        if (this.getRimNumopeRet() != null && this.getRimNumopeRet().longValue() == -999) {
            conditions += " AND RIM_NUMOPE_RET IS NULL";
        } else if (this.getRimNumopeRet() != null) {
            conditions += " AND RIM_NUMOPE_RET = ?";
            values.add(this.getRimNumopeRet());
        }

        if (this.getRimImpRet() != null && this.getRimImpRet().longValue() == -999) {
            conditions += " AND RIM_IMP_RET IS NULL";
        } else if (this.getRimImpRet() != null) {
            conditions += " AND RIM_IMP_RET = ?";
            values.add(this.getRimImpRet());
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
        String sql = "UPDATE F_REP_IND_MEN_MON SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RIM_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getRimFecha());
        fields += " RIM_NUMOPER_REC = ?, ";
        values.add(this.getRimNumoperRec());
        fields += " RIM_NUMOPER_CON = ?, ";
        values.add(this.getRimNumoperCon());
        fields += " RIM_NUMOPER_RECH = ?, ";
        values.add(this.getRimNumoperRech());
        fields += " RIM_NUMFID_TOT = ?, ";
        values.add(this.getRimNumfidTot());
        fields += " RIM_NUMFID_MOV = ?, ";
        values.add(this.getRimNumfidMov());
        fields += " RIM_IMP_TOTAL = ?, ";
        values.add(this.getRimImpTotal());
        fields += " RIM_NUMOPE_DEP = ?, ";
        values.add(this.getRimNumopeDep());
        fields += " RIM_IMP_DEP = ?, ";
        values.add(this.getRimImpDep());
        fields += " RIM_NUMOPE_RET = ?, ";
        values.add(this.getRimNumopeRet());
        fields += " RIM_IMP_RET = ?, ";
        values.add(this.getRimImpRet());
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
        String sql = "INSERT INTO F_REP_IND_MEN_MON ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RIM_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRimFecha());

        fields += ", RIM_NUMOPER_REC";
        fieldValues += ", ?";
        values.add(this.getRimNumoperRec());

        fields += ", RIM_NUMOPER_CON";
        fieldValues += ", ?";
        values.add(this.getRimNumoperCon());

        fields += ", RIM_NUMOPER_RECH";
        fieldValues += ", ?";
        values.add(this.getRimNumoperRech());

        fields += ", RIM_NUMFID_TOT";
        fieldValues += ", ?";
        values.add(this.getRimNumfidTot());

        fields += ", RIM_NUMFID_MOV";
        fieldValues += ", ?";
        values.add(this.getRimNumfidMov());

        fields += ", RIM_IMP_TOTAL";
        fieldValues += ", ?";
        values.add(this.getRimImpTotal());

        fields += ", RIM_NUMOPE_DEP";
        fieldValues += ", ?";
        values.add(this.getRimNumopeDep());

        fields += ", RIM_IMP_DEP";
        fieldValues += ", ?";
        values.add(this.getRimImpDep());

        fields += ", RIM_NUMOPE_RET";
        fieldValues += ", ?";
        values.add(this.getRimNumopeRet());

        fields += ", RIM_IMP_RET";
        fieldValues += ", ?";
        values.add(this.getRimImpRet());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REP_IND_MEN_MON WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RIM_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getRimFecha());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepIndMenMon instance = (FRepIndMenMon) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRimFecha().equals(instance.getRimFecha()))
            equalObjects = false;
        if (equalObjects && !this.getRimNumoperRec().equals(instance.getRimNumoperRec()))
            equalObjects = false;
        if (equalObjects && !this.getRimNumoperCon().equals(instance.getRimNumoperCon()))
            equalObjects = false;
        if (equalObjects && !this.getRimNumoperRech().equals(instance.getRimNumoperRech()))
            equalObjects = false;
        if (equalObjects && !this.getRimNumfidTot().equals(instance.getRimNumfidTot()))
            equalObjects = false;
        if (equalObjects && !this.getRimNumfidMov().equals(instance.getRimNumfidMov()))
            equalObjects = false;
        if (equalObjects && !this.getRimImpTotal().equals(instance.getRimImpTotal()))
            equalObjects = false;
        if (equalObjects && !this.getRimNumopeDep().equals(instance.getRimNumopeDep()))
            equalObjects = false;
        if (equalObjects && !this.getRimImpDep().equals(instance.getRimImpDep()))
            equalObjects = false;
        if (equalObjects && !this.getRimNumopeRet().equals(instance.getRimNumopeRet()))
            equalObjects = false;
        if (equalObjects && !this.getRimImpRet().equals(instance.getRimImpRet()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepIndMenMon result = new FRepIndMenMon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRimFecha((String) objectData.getData("RIM_FECHA"));
        result.setRimNumoperRec((BigDecimal) objectData.getData("RIM_NUMOPER_REC"));
        result.setRimNumoperCon((BigDecimal) objectData.getData("RIM_NUMOPER_CON"));
        result.setRimNumoperRech((BigDecimal) objectData.getData("RIM_NUMOPER_RECH"));
        result.setRimNumfidTot((BigDecimal) objectData.getData("RIM_NUMFID_TOT"));
        result.setRimNumfidMov((BigDecimal) objectData.getData("RIM_NUMFID_MOV"));
        result.setRimImpTotal((BigDecimal) objectData.getData("RIM_IMP_TOTAL"));
        result.setRimNumopeDep((BigDecimal) objectData.getData("RIM_NUMOPE_DEP"));
        result.setRimImpDep((BigDecimal) objectData.getData("RIM_IMP_DEP"));
        result.setRimNumopeRet((BigDecimal) objectData.getData("RIM_NUMOPE_RET"));
        result.setRimImpRet((BigDecimal) objectData.getData("RIM_IMP_RET"));

        return result;

    }

}
