package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTOPAINV_PK", columns = { "CVA_NUM_CONTRATO" }, sequences = { "MAX" })
public class Ctopainv extends DomainObject {

    BigDecimal cvaNumContrato = null;
    String cvaCveEntFin = null;
    String cvaNomAsesorFin = null;
    BigDecimal cvaCveBursatiles = null;
    BigDecimal cvaCveNoBursati = null;
    BigDecimal cvaCveBancarios = null;
    BigDecimal cvaCveMonExt = null;
    BigDecimal cvaCveComisExe = null;
    BigDecimal cvaCveIsrExento = null;
    String cvaTexComision = null;
    String cvaTexIsr = null;
    String cvaCveStCtopain = null;
    BigDecimal cvaPjeLiquida = null;

    public Ctopainv() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCvaNumContrato(BigDecimal cvaNumContrato) {
        this.cvaNumContrato = cvaNumContrato;
    }

    public BigDecimal getCvaNumContrato() {
        return this.cvaNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCvaCveEntFin(String cvaCveEntFin) {
        this.cvaCveEntFin = cvaCveEntFin;
    }

    public String getCvaCveEntFin() {
        return this.cvaCveEntFin;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCvaNomAsesorFin(String cvaNomAsesorFin) {
        this.cvaNomAsesorFin = cvaNomAsesorFin;
    }

    public String getCvaNomAsesorFin() {
        return this.cvaNomAsesorFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCvaCveBursatiles(BigDecimal cvaCveBursatiles) {
        this.cvaCveBursatiles = cvaCveBursatiles;
    }

    public BigDecimal getCvaCveBursatiles() {
        return this.cvaCveBursatiles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCvaCveNoBursati(BigDecimal cvaCveNoBursati) {
        this.cvaCveNoBursati = cvaCveNoBursati;
    }

    public BigDecimal getCvaCveNoBursati() {
        return this.cvaCveNoBursati;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCvaCveBancarios(BigDecimal cvaCveBancarios) {
        this.cvaCveBancarios = cvaCveBancarios;
    }

    public BigDecimal getCvaCveBancarios() {
        return this.cvaCveBancarios;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCvaCveMonExt(BigDecimal cvaCveMonExt) {
        this.cvaCveMonExt = cvaCveMonExt;
    }

    public BigDecimal getCvaCveMonExt() {
        return this.cvaCveMonExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCvaCveComisExe(BigDecimal cvaCveComisExe) {
        this.cvaCveComisExe = cvaCveComisExe;
    }

    public BigDecimal getCvaCveComisExe() {
        return this.cvaCveComisExe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCvaCveIsrExento(BigDecimal cvaCveIsrExento) {
        this.cvaCveIsrExento = cvaCveIsrExento;
    }

    public BigDecimal getCvaCveIsrExento() {
        return this.cvaCveIsrExento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCvaTexComision(String cvaTexComision) {
        this.cvaTexComision = cvaTexComision;
    }

    public String getCvaTexComision() {
        return this.cvaTexComision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCvaTexIsr(String cvaTexIsr) {
        this.cvaTexIsr = cvaTexIsr;
    }

    public String getCvaTexIsr() {
        return this.cvaTexIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCvaCveStCtopain(String cvaCveStCtopain) {
        this.cvaCveStCtopain = cvaCveStCtopain;
    }

    public String getCvaCveStCtopain() {
        return this.cvaCveStCtopain;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCvaPjeLiquida(BigDecimal cvaPjeLiquida) {
        this.cvaPjeLiquida = cvaPjeLiquida;
    }

    public BigDecimal getCvaPjeLiquida() {
        return this.cvaPjeLiquida;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTOPAINV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCvaNumContrato() != null && this.getCvaNumContrato().longValue() == -999) {
            conditions += " AND CVA_NUM_CONTRATO IS NULL";
        } else if (this.getCvaNumContrato() != null) {
            conditions += " AND CVA_NUM_CONTRATO = ?";
            values.add(this.getCvaNumContrato());
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
        String sql = "SELECT * FROM CTOPAINV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCvaNumContrato() != null && this.getCvaNumContrato().longValue() == -999) {
            conditions += " AND CVA_NUM_CONTRATO IS NULL";
        } else if (this.getCvaNumContrato() != null) {
            conditions += " AND CVA_NUM_CONTRATO = ?";
            values.add(this.getCvaNumContrato());
        }

        if (this.getCvaCveEntFin() != null && "null".equals(this.getCvaCveEntFin())) {
            conditions += " AND CVA_CVE_ENT_FIN IS NULL";
        } else if (this.getCvaCveEntFin() != null) {
            conditions += " AND CVA_CVE_ENT_FIN = ?";
            values.add(this.getCvaCveEntFin());
        }

        if (this.getCvaNomAsesorFin() != null && "null".equals(this.getCvaNomAsesorFin())) {
            conditions += " AND CVA_NOM_ASESOR_FIN IS NULL";
        } else if (this.getCvaNomAsesorFin() != null) {
            conditions += " AND CVA_NOM_ASESOR_FIN = ?";
            values.add(this.getCvaNomAsesorFin());
        }

        if (this.getCvaCveBursatiles() != null && this.getCvaCveBursatiles().longValue() == -999) {
            conditions += " AND CVA_CVE_BURSATILES IS NULL";
        } else if (this.getCvaCveBursatiles() != null) {
            conditions += " AND CVA_CVE_BURSATILES = ?";
            values.add(this.getCvaCveBursatiles());
        }

        if (this.getCvaCveNoBursati() != null && this.getCvaCveNoBursati().longValue() == -999) {
            conditions += " AND CVA_CVE_NO_BURSATI IS NULL";
        } else if (this.getCvaCveNoBursati() != null) {
            conditions += " AND CVA_CVE_NO_BURSATI = ?";
            values.add(this.getCvaCveNoBursati());
        }

        if (this.getCvaCveBancarios() != null && this.getCvaCveBancarios().longValue() == -999) {
            conditions += " AND CVA_CVE_BANCARIOS IS NULL";
        } else if (this.getCvaCveBancarios() != null) {
            conditions += " AND CVA_CVE_BANCARIOS = ?";
            values.add(this.getCvaCveBancarios());
        }

        if (this.getCvaCveMonExt() != null && this.getCvaCveMonExt().longValue() == -999) {
            conditions += " AND CVA_CVE_MON_EXT IS NULL";
        } else if (this.getCvaCveMonExt() != null) {
            conditions += " AND CVA_CVE_MON_EXT = ?";
            values.add(this.getCvaCveMonExt());
        }

        if (this.getCvaCveComisExe() != null && this.getCvaCveComisExe().longValue() == -999) {
            conditions += " AND CVA_CVE_COMIS_EXE IS NULL";
        } else if (this.getCvaCveComisExe() != null) {
            conditions += " AND CVA_CVE_COMIS_EXE = ?";
            values.add(this.getCvaCveComisExe());
        }

        if (this.getCvaCveIsrExento() != null && this.getCvaCveIsrExento().longValue() == -999) {
            conditions += " AND CVA_CVE_ISR_EXENTO IS NULL";
        } else if (this.getCvaCveIsrExento() != null) {
            conditions += " AND CVA_CVE_ISR_EXENTO = ?";
            values.add(this.getCvaCveIsrExento());
        }

        if (this.getCvaTexComision() != null && "null".equals(this.getCvaTexComision())) {
            conditions += " AND CVA_TEX_COMISION IS NULL";
        } else if (this.getCvaTexComision() != null) {
            conditions += " AND CVA_TEX_COMISION = ?";
            values.add(this.getCvaTexComision());
        }

        if (this.getCvaTexIsr() != null && "null".equals(this.getCvaTexIsr())) {
            conditions += " AND CVA_TEX_ISR IS NULL";
        } else if (this.getCvaTexIsr() != null) {
            conditions += " AND CVA_TEX_ISR = ?";
            values.add(this.getCvaTexIsr());
        }

        if (this.getCvaCveStCtopain() != null && "null".equals(this.getCvaCveStCtopain())) {
            conditions += " AND CVA_CVE_ST_CTOPAIN IS NULL";
        } else if (this.getCvaCveStCtopain() != null) {
            conditions += " AND CVA_CVE_ST_CTOPAIN = ?";
            values.add(this.getCvaCveStCtopain());
        }

        if (this.getCvaPjeLiquida() != null && this.getCvaPjeLiquida().longValue() == -999) {
            conditions += " AND CVA_PJE_LIQUIDA IS NULL";
        } else if (this.getCvaPjeLiquida() != null) {
            conditions += " AND CVA_PJE_LIQUIDA = ?";
            values.add(this.getCvaPjeLiquida());
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
        String sql = "UPDATE CTOPAINV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CVA_NUM_CONTRATO = ?";
        pkValues.add(this.getCvaNumContrato());
        fields += " CVA_CVE_ENT_FIN = ?, ";
        values.add(this.getCvaCveEntFin());
        fields += " CVA_NOM_ASESOR_FIN = ?, ";
        values.add(this.getCvaNomAsesorFin());
        fields += " CVA_CVE_BURSATILES = ?, ";
        values.add(this.getCvaCveBursatiles());
        fields += " CVA_CVE_NO_BURSATI = ?, ";
        values.add(this.getCvaCveNoBursati());
        fields += " CVA_CVE_BANCARIOS = ?, ";
        values.add(this.getCvaCveBancarios());
        fields += " CVA_CVE_MON_EXT = ?, ";
        values.add(this.getCvaCveMonExt());
        fields += " CVA_CVE_COMIS_EXE = ?, ";
        values.add(this.getCvaCveComisExe());
        fields += " CVA_CVE_ISR_EXENTO = ?, ";
        values.add(this.getCvaCveIsrExento());
        fields += " CVA_TEX_COMISION = ?, ";
        values.add(this.getCvaTexComision());
        fields += " CVA_TEX_ISR = ?, ";
        values.add(this.getCvaTexIsr());
        fields += " CVA_CVE_ST_CTOPAIN = ?, ";
        values.add(this.getCvaCveStCtopain());
        fields += " CVA_PJE_LIQUIDA = ?, ";
        values.add(this.getCvaPjeLiquida());
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
        String sql = "INSERT INTO CTOPAINV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CVA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCvaNumContrato());

        fields += ", CVA_CVE_ENT_FIN";
        fieldValues += ", ?";
        values.add(this.getCvaCveEntFin());

        fields += ", CVA_NOM_ASESOR_FIN";
        fieldValues += ", ?";
        values.add(this.getCvaNomAsesorFin());

        fields += ", CVA_CVE_BURSATILES";
        fieldValues += ", ?";
        values.add(this.getCvaCveBursatiles());

        fields += ", CVA_CVE_NO_BURSATI";
        fieldValues += ", ?";
        values.add(this.getCvaCveNoBursati());

        fields += ", CVA_CVE_BANCARIOS";
        fieldValues += ", ?";
        values.add(this.getCvaCveBancarios());

        fields += ", CVA_CVE_MON_EXT";
        fieldValues += ", ?";
        values.add(this.getCvaCveMonExt());

        fields += ", CVA_CVE_COMIS_EXE";
        fieldValues += ", ?";
        values.add(this.getCvaCveComisExe());

        fields += ", CVA_CVE_ISR_EXENTO";
        fieldValues += ", ?";
        values.add(this.getCvaCveIsrExento());

        fields += ", CVA_TEX_COMISION";
        fieldValues += ", ?";
        values.add(this.getCvaTexComision());

        fields += ", CVA_TEX_ISR";
        fieldValues += ", ?";
        values.add(this.getCvaTexIsr());

        fields += ", CVA_CVE_ST_CTOPAIN";
        fieldValues += ", ?";
        values.add(this.getCvaCveStCtopain());

        fields += ", CVA_PJE_LIQUIDA";
        fieldValues += ", ?";
        values.add(this.getCvaPjeLiquida());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTOPAINV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CVA_NUM_CONTRATO = ?";
        values.add(this.getCvaNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctopainv instance = (Ctopainv) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCvaNumContrato().equals(instance.getCvaNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCvaCveEntFin().equals(instance.getCvaCveEntFin()))
            equalObjects = false;
        if (equalObjects && !this.getCvaNomAsesorFin().equals(instance.getCvaNomAsesorFin()))
            equalObjects = false;
        if (equalObjects && !this.getCvaCveBursatiles().equals(instance.getCvaCveBursatiles()))
            equalObjects = false;
        if (equalObjects && !this.getCvaCveNoBursati().equals(instance.getCvaCveNoBursati()))
            equalObjects = false;
        if (equalObjects && !this.getCvaCveBancarios().equals(instance.getCvaCveBancarios()))
            equalObjects = false;
        if (equalObjects && !this.getCvaCveMonExt().equals(instance.getCvaCveMonExt()))
            equalObjects = false;
        if (equalObjects && !this.getCvaCveComisExe().equals(instance.getCvaCveComisExe()))
            equalObjects = false;
        if (equalObjects && !this.getCvaCveIsrExento().equals(instance.getCvaCveIsrExento()))
            equalObjects = false;
        if (equalObjects && !this.getCvaTexComision().equals(instance.getCvaTexComision()))
            equalObjects = false;
        if (equalObjects && !this.getCvaTexIsr().equals(instance.getCvaTexIsr()))
            equalObjects = false;
        if (equalObjects && !this.getCvaCveStCtopain().equals(instance.getCvaCveStCtopain()))
            equalObjects = false;
        if (equalObjects && !this.getCvaPjeLiquida().equals(instance.getCvaPjeLiquida()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctopainv result = new Ctopainv();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCvaNumContrato((BigDecimal) objectData.getData("CVA_NUM_CONTRATO"));
        result.setCvaCveEntFin((String) objectData.getData("CVA_CVE_ENT_FIN"));
        result.setCvaNomAsesorFin((String) objectData.getData("CVA_NOM_ASESOR_FIN"));
        result.setCvaCveBursatiles((BigDecimal) objectData.getData("CVA_CVE_BURSATILES"));
        result.setCvaCveNoBursati((BigDecimal) objectData.getData("CVA_CVE_NO_BURSATI"));
        result.setCvaCveBancarios((BigDecimal) objectData.getData("CVA_CVE_BANCARIOS"));
        result.setCvaCveMonExt((BigDecimal) objectData.getData("CVA_CVE_MON_EXT"));
        result.setCvaCveComisExe((BigDecimal) objectData.getData("CVA_CVE_COMIS_EXE"));
        result.setCvaCveIsrExento((BigDecimal) objectData.getData("CVA_CVE_ISR_EXENTO"));
        result.setCvaTexComision((String) objectData.getData("CVA_TEX_COMISION"));
        result.setCvaTexIsr((String) objectData.getData("CVA_TEX_ISR"));
        result.setCvaCveStCtopain((String) objectData.getData("CVA_CVE_ST_CTOPAIN"));
        result.setCvaPjeLiquida((BigDecimal) objectData.getData("CVA_PJE_LIQUIDA"));

        return result;

    }

}
