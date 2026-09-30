package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COCIERRE_PK", columns = { "CCI_ANO_CIERRE", "CCI_MES_CIERRE", "CCI_DIA_CIERRE" }, sequences = { "MANUAL" })
public class Cocierre extends DomainObject {

    BigDecimal cciAnoCierre = null;
    BigDecimal cciMesCierre = null;
    BigDecimal cciDiaCierre = null;
    BigDecimal cciCveFinancia = null;
    BigDecimal cciCveCtasMayor = null;
    BigDecimal cciCveCierre = null;
    BigDecimal cciCveSobregiros = null;
    BigDecimal cciCveValores = null;
    BigDecimal cciCveImpreSob = null;
    BigDecimal cciCveImpreLiq = null;

    public Cocierre() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCciAnoCierre(BigDecimal cciAnoCierre) {
        this.cciAnoCierre = cciAnoCierre;
    }

    public BigDecimal getCciAnoCierre() {
        return this.cciAnoCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCciMesCierre(BigDecimal cciMesCierre) {
        this.cciMesCierre = cciMesCierre;
    }

    public BigDecimal getCciMesCierre() {
        return this.cciMesCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCciDiaCierre(BigDecimal cciDiaCierre) {
        this.cciDiaCierre = cciDiaCierre;
    }

    public BigDecimal getCciDiaCierre() {
        return this.cciDiaCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCciCveFinancia(BigDecimal cciCveFinancia) {
        this.cciCveFinancia = cciCveFinancia;
    }

    public BigDecimal getCciCveFinancia() {
        return this.cciCveFinancia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCciCveCtasMayor(BigDecimal cciCveCtasMayor) {
        this.cciCveCtasMayor = cciCveCtasMayor;
    }

    public BigDecimal getCciCveCtasMayor() {
        return this.cciCveCtasMayor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCciCveCierre(BigDecimal cciCveCierre) {
        this.cciCveCierre = cciCveCierre;
    }

    public BigDecimal getCciCveCierre() {
        return this.cciCveCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCciCveSobregiros(BigDecimal cciCveSobregiros) {
        this.cciCveSobregiros = cciCveSobregiros;
    }

    public BigDecimal getCciCveSobregiros() {
        return this.cciCveSobregiros;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCciCveValores(BigDecimal cciCveValores) {
        this.cciCveValores = cciCveValores;
    }

    public BigDecimal getCciCveValores() {
        return this.cciCveValores;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCciCveImpreSob(BigDecimal cciCveImpreSob) {
        this.cciCveImpreSob = cciCveImpreSob;
    }

    public BigDecimal getCciCveImpreSob() {
        return this.cciCveImpreSob;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCciCveImpreLiq(BigDecimal cciCveImpreLiq) {
        this.cciCveImpreLiq = cciCveImpreLiq;
    }

    public BigDecimal getCciCveImpreLiq() {
        return this.cciCveImpreLiq;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COCIERRE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCciAnoCierre() != null && this.getCciAnoCierre().longValue() == -999) {
            conditions += " AND CCI_ANO_CIERRE IS NULL";
        } else if (this.getCciAnoCierre() != null) {
            conditions += " AND CCI_ANO_CIERRE = ?";
            values.add(this.getCciAnoCierre());
        }

        if (this.getCciMesCierre() != null && this.getCciMesCierre().longValue() == -999) {
            conditions += " AND CCI_MES_CIERRE IS NULL";
        } else if (this.getCciMesCierre() != null) {
            conditions += " AND CCI_MES_CIERRE = ?";
            values.add(this.getCciMesCierre());
        }

        if (this.getCciDiaCierre() != null && this.getCciDiaCierre().longValue() == -999) {
            conditions += " AND CCI_DIA_CIERRE IS NULL";
        } else if (this.getCciDiaCierre() != null) {
            conditions += " AND CCI_DIA_CIERRE = ?";
            values.add(this.getCciDiaCierre());
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
        String sql = "SELECT * FROM COCIERRE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCciAnoCierre() != null && this.getCciAnoCierre().longValue() == -999) {
            conditions += " AND CCI_ANO_CIERRE IS NULL";
        } else if (this.getCciAnoCierre() != null) {
            conditions += " AND CCI_ANO_CIERRE = ?";
            values.add(this.getCciAnoCierre());
        }

        if (this.getCciMesCierre() != null && this.getCciMesCierre().longValue() == -999) {
            conditions += " AND CCI_MES_CIERRE IS NULL";
        } else if (this.getCciMesCierre() != null) {
            conditions += " AND CCI_MES_CIERRE = ?";
            values.add(this.getCciMesCierre());
        }

        if (this.getCciDiaCierre() != null && this.getCciDiaCierre().longValue() == -999) {
            conditions += " AND CCI_DIA_CIERRE IS NULL";
        } else if (this.getCciDiaCierre() != null) {
            conditions += " AND CCI_DIA_CIERRE = ?";
            values.add(this.getCciDiaCierre());
        }

        if (this.getCciCveFinancia() != null && this.getCciCveFinancia().longValue() == -999) {
            conditions += " AND CCI_CVE_FINANCIA IS NULL";
        } else if (this.getCciCveFinancia() != null) {
            conditions += " AND CCI_CVE_FINANCIA = ?";
            values.add(this.getCciCveFinancia());
        }

        if (this.getCciCveCtasMayor() != null && this.getCciCveCtasMayor().longValue() == -999) {
            conditions += " AND CCI_CVE_CTAS_MAYOR IS NULL";
        } else if (this.getCciCveCtasMayor() != null) {
            conditions += " AND CCI_CVE_CTAS_MAYOR = ?";
            values.add(this.getCciCveCtasMayor());
        }

        if (this.getCciCveCierre() != null && this.getCciCveCierre().longValue() == -999) {
            conditions += " AND CCI_CVE_CIERRE IS NULL";
        } else if (this.getCciCveCierre() != null) {
            conditions += " AND CCI_CVE_CIERRE = ?";
            values.add(this.getCciCveCierre());
        }

        if (this.getCciCveSobregiros() != null && this.getCciCveSobregiros().longValue() == -999) {
            conditions += " AND CCI_CVE_SOBREGIROS IS NULL";
        } else if (this.getCciCveSobregiros() != null) {
            conditions += " AND CCI_CVE_SOBREGIROS = ?";
            values.add(this.getCciCveSobregiros());
        }

        if (this.getCciCveValores() != null && this.getCciCveValores().longValue() == -999) {
            conditions += " AND CCI_CVE_VALORES IS NULL";
        } else if (this.getCciCveValores() != null) {
            conditions += " AND CCI_CVE_VALORES = ?";
            values.add(this.getCciCveValores());
        }

        if (this.getCciCveImpreSob() != null && this.getCciCveImpreSob().longValue() == -999) {
            conditions += " AND CCI_CVE_IMPRE_SOB IS NULL";
        } else if (this.getCciCveImpreSob() != null) {
            conditions += " AND CCI_CVE_IMPRE_SOB = ?";
            values.add(this.getCciCveImpreSob());
        }

        if (this.getCciCveImpreLiq() != null && this.getCciCveImpreLiq().longValue() == -999) {
            conditions += " AND CCI_CVE_IMPRE_LIQ IS NULL";
        } else if (this.getCciCveImpreLiq() != null) {
            conditions += " AND CCI_CVE_IMPRE_LIQ = ?";
            values.add(this.getCciCveImpreLiq());
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
        String sql = "UPDATE COCIERRE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CCI_ANO_CIERRE = ?";
        pkValues.add(this.getCciAnoCierre());
        conditions += " AND CCI_MES_CIERRE = ?";
        pkValues.add(this.getCciMesCierre());
        conditions += " AND CCI_DIA_CIERRE = ?";
        pkValues.add(this.getCciDiaCierre());
        fields += " CCI_CVE_FINANCIA = ?, ";
        values.add(this.getCciCveFinancia());
        fields += " CCI_CVE_CTAS_MAYOR = ?, ";
        values.add(this.getCciCveCtasMayor());
        fields += " CCI_CVE_CIERRE = ?, ";
        values.add(this.getCciCveCierre());
        fields += " CCI_CVE_SOBREGIROS = ?, ";
        values.add(this.getCciCveSobregiros());
        fields += " CCI_CVE_VALORES = ?, ";
        values.add(this.getCciCveValores());
        fields += " CCI_CVE_IMPRE_SOB = ?, ";
        values.add(this.getCciCveImpreSob());
        fields += " CCI_CVE_IMPRE_LIQ = ?, ";
        values.add(this.getCciCveImpreLiq());
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
        String sql = "INSERT INTO COCIERRE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CCI_ANO_CIERRE";
        fieldValues += ", ?";
        values.add(this.getCciAnoCierre());

        fields += ", CCI_MES_CIERRE";
        fieldValues += ", ?";
        values.add(this.getCciMesCierre());

        fields += ", CCI_DIA_CIERRE";
        fieldValues += ", ?";
        values.add(this.getCciDiaCierre());

        fields += ", CCI_CVE_FINANCIA";
        fieldValues += ", ?";
        values.add(this.getCciCveFinancia());

        fields += ", CCI_CVE_CTAS_MAYOR";
        fieldValues += ", ?";
        values.add(this.getCciCveCtasMayor());

        fields += ", CCI_CVE_CIERRE";
        fieldValues += ", ?";
        values.add(this.getCciCveCierre());

        fields += ", CCI_CVE_SOBREGIROS";
        fieldValues += ", ?";
        values.add(this.getCciCveSobregiros());

        fields += ", CCI_CVE_VALORES";
        fieldValues += ", ?";
        values.add(this.getCciCveValores());

        fields += ", CCI_CVE_IMPRE_SOB";
        fieldValues += ", ?";
        values.add(this.getCciCveImpreSob());

        fields += ", CCI_CVE_IMPRE_LIQ";
        fieldValues += ", ?";
        values.add(this.getCciCveImpreLiq());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COCIERRE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CCI_ANO_CIERRE = ?";
        values.add(this.getCciAnoCierre());
        conditions += " AND CCI_MES_CIERRE = ?";
        values.add(this.getCciMesCierre());
        conditions += " AND CCI_DIA_CIERRE = ?";
        values.add(this.getCciDiaCierre());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cocierre instance = (Cocierre) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCciAnoCierre().equals(instance.getCciAnoCierre()))
            equalObjects = false;
        if (equalObjects && !this.getCciMesCierre().equals(instance.getCciMesCierre()))
            equalObjects = false;
        if (equalObjects && !this.getCciDiaCierre().equals(instance.getCciDiaCierre()))
            equalObjects = false;
        if (equalObjects && !this.getCciCveFinancia().equals(instance.getCciCveFinancia()))
            equalObjects = false;
        if (equalObjects && !this.getCciCveCtasMayor().equals(instance.getCciCveCtasMayor()))
            equalObjects = false;
        if (equalObjects && !this.getCciCveCierre().equals(instance.getCciCveCierre()))
            equalObjects = false;
        if (equalObjects && !this.getCciCveSobregiros().equals(instance.getCciCveSobregiros()))
            equalObjects = false;
        if (equalObjects && !this.getCciCveValores().equals(instance.getCciCveValores()))
            equalObjects = false;
        if (equalObjects && !this.getCciCveImpreSob().equals(instance.getCciCveImpreSob()))
            equalObjects = false;
        if (equalObjects && !this.getCciCveImpreLiq().equals(instance.getCciCveImpreLiq()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cocierre result = new Cocierre();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCciAnoCierre((BigDecimal) objectData.getData("CCI_ANO_CIERRE"));
        result.setCciMesCierre((BigDecimal) objectData.getData("CCI_MES_CIERRE"));
        result.setCciDiaCierre((BigDecimal) objectData.getData("CCI_DIA_CIERRE"));
        result.setCciCveFinancia((BigDecimal) objectData.getData("CCI_CVE_FINANCIA"));
        result.setCciCveCtasMayor((BigDecimal) objectData.getData("CCI_CVE_CTAS_MAYOR"));
        result.setCciCveCierre((BigDecimal) objectData.getData("CCI_CVE_CIERRE"));
        result.setCciCveSobregiros((BigDecimal) objectData.getData("CCI_CVE_SOBREGIROS"));
        result.setCciCveValores((BigDecimal) objectData.getData("CCI_CVE_VALORES"));
        result.setCciCveImpreSob((BigDecimal) objectData.getData("CCI_CVE_IMPRE_SOB"));
        result.setCciCveImpreLiq((BigDecimal) objectData.getData("CCI_CVE_IMPRE_LIQ"));

        return result;

    }

}
