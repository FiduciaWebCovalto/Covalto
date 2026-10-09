package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AVALORES_PK", columns = { "AVA_ANTEPROYECTO" }, sequences = { "MAX" })
public class Avalores extends DomainObject {

    BigDecimal avaAnteproyecto = null;
    String avaCveEntFin = null;
    String avaAsesorFin = null;
    BigDecimal avaCveBursatiles = null;
    BigDecimal avaCveNoBurs = null;
    BigDecimal avaCveBancarios = null;
    BigDecimal avaCveMonExtran = null;
    BigDecimal avaCveComisExen = null;
    BigDecimal avaCveIsrExento = null;
    String avaTexComision = null;
    String avaTexIsr = null;
    String avaCveStInver = null;

    public Avalores() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaAnteproyecto(BigDecimal avaAnteproyecto) {
        this.avaAnteproyecto = avaAnteproyecto;
    }

    public BigDecimal getAvaAnteproyecto() {
        return this.avaAnteproyecto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaCveEntFin(String avaCveEntFin) {
        this.avaCveEntFin = avaCveEntFin;
    }

    public String getAvaCveEntFin() {
        return this.avaCveEntFin;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaAsesorFin(String avaAsesorFin) {
        this.avaAsesorFin = avaAsesorFin;
    }

    public String getAvaAsesorFin() {
        return this.avaAsesorFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaCveBursatiles(BigDecimal avaCveBursatiles) {
        this.avaCveBursatiles = avaCveBursatiles;
    }

    public BigDecimal getAvaCveBursatiles() {
        return this.avaCveBursatiles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaCveNoBurs(BigDecimal avaCveNoBurs) {
        this.avaCveNoBurs = avaCveNoBurs;
    }

    public BigDecimal getAvaCveNoBurs() {
        return this.avaCveNoBurs;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaCveBancarios(BigDecimal avaCveBancarios) {
        this.avaCveBancarios = avaCveBancarios;
    }

    public BigDecimal getAvaCveBancarios() {
        return this.avaCveBancarios;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaCveMonExtran(BigDecimal avaCveMonExtran) {
        this.avaCveMonExtran = avaCveMonExtran;
    }

    public BigDecimal getAvaCveMonExtran() {
        return this.avaCveMonExtran;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaCveComisExen(BigDecimal avaCveComisExen) {
        this.avaCveComisExen = avaCveComisExen;
    }

    public BigDecimal getAvaCveComisExen() {
        return this.avaCveComisExen;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaCveIsrExento(BigDecimal avaCveIsrExento) {
        this.avaCveIsrExento = avaCveIsrExento;
    }

    public BigDecimal getAvaCveIsrExento() {
        return this.avaCveIsrExento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaTexComision(String avaTexComision) {
        this.avaTexComision = avaTexComision;
    }

    public String getAvaTexComision() {
        return this.avaTexComision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaTexIsr(String avaTexIsr) {
        this.avaTexIsr = avaTexIsr;
    }

    public String getAvaTexIsr() {
        return this.avaTexIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaCveStInver(String avaCveStInver) {
        this.avaCveStInver = avaCveStInver;
    }

    public String getAvaCveStInver() {
        return this.avaCveStInver;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AVALORES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAvaAnteproyecto() != null && this.getAvaAnteproyecto().longValue() == -999) {
            conditions += " AND AVA_ANTEPROYECTO IS NULL";
        } else if (this.getAvaAnteproyecto() != null) {
            conditions += " AND AVA_ANTEPROYECTO = ?";
            values.add(this.getAvaAnteproyecto());
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
        String sql = "SELECT * FROM AVALORES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAvaAnteproyecto() != null && this.getAvaAnteproyecto().longValue() == -999) {
            conditions += " AND AVA_ANTEPROYECTO IS NULL";
        } else if (this.getAvaAnteproyecto() != null) {
            conditions += " AND AVA_ANTEPROYECTO = ?";
            values.add(this.getAvaAnteproyecto());
        }

        if (this.getAvaCveEntFin() != null && "null".equals(this.getAvaCveEntFin())) {
            conditions += " AND AVA_CVE_ENT_FIN IS NULL";
        } else if (this.getAvaCveEntFin() != null) {
            conditions += " AND AVA_CVE_ENT_FIN = ?";
            values.add(this.getAvaCveEntFin());
        }

        if (this.getAvaAsesorFin() != null && "null".equals(this.getAvaAsesorFin())) {
            conditions += " AND AVA_ASESOR_FIN IS NULL";
        } else if (this.getAvaAsesorFin() != null) {
            conditions += " AND AVA_ASESOR_FIN = ?";
            values.add(this.getAvaAsesorFin());
        }

        if (this.getAvaCveBursatiles() != null && this.getAvaCveBursatiles().longValue() == -999) {
            conditions += " AND AVA_CVE_BURSATILES IS NULL";
        } else if (this.getAvaCveBursatiles() != null) {
            conditions += " AND AVA_CVE_BURSATILES = ?";
            values.add(this.getAvaCveBursatiles());
        }

        if (this.getAvaCveNoBurs() != null && this.getAvaCveNoBurs().longValue() == -999) {
            conditions += " AND AVA_CVE_NO_BURS IS NULL";
        } else if (this.getAvaCveNoBurs() != null) {
            conditions += " AND AVA_CVE_NO_BURS = ?";
            values.add(this.getAvaCveNoBurs());
        }

        if (this.getAvaCveBancarios() != null && this.getAvaCveBancarios().longValue() == -999) {
            conditions += " AND AVA_CVE_BANCARIOS IS NULL";
        } else if (this.getAvaCveBancarios() != null) {
            conditions += " AND AVA_CVE_BANCARIOS = ?";
            values.add(this.getAvaCveBancarios());
        }

        if (this.getAvaCveMonExtran() != null && this.getAvaCveMonExtran().longValue() == -999) {
            conditions += " AND AVA_CVE_MON_EXTRAN IS NULL";
        } else if (this.getAvaCveMonExtran() != null) {
            conditions += " AND AVA_CVE_MON_EXTRAN = ?";
            values.add(this.getAvaCveMonExtran());
        }

        if (this.getAvaCveComisExen() != null && this.getAvaCveComisExen().longValue() == -999) {
            conditions += " AND AVA_CVE_COMIS_EXEN IS NULL";
        } else if (this.getAvaCveComisExen() != null) {
            conditions += " AND AVA_CVE_COMIS_EXEN = ?";
            values.add(this.getAvaCveComisExen());
        }

        if (this.getAvaCveIsrExento() != null && this.getAvaCveIsrExento().longValue() == -999) {
            conditions += " AND AVA_CVE_ISR_EXENTO IS NULL";
        } else if (this.getAvaCveIsrExento() != null) {
            conditions += " AND AVA_CVE_ISR_EXENTO = ?";
            values.add(this.getAvaCveIsrExento());
        }

        if (this.getAvaTexComision() != null && "null".equals(this.getAvaTexComision())) {
            conditions += " AND AVA_TEX_COMISION IS NULL";
        } else if (this.getAvaTexComision() != null) {
            conditions += " AND AVA_TEX_COMISION = ?";
            values.add(this.getAvaTexComision());
        }

        if (this.getAvaTexIsr() != null && "null".equals(this.getAvaTexIsr())) {
            conditions += " AND AVA_TEX_ISR IS NULL";
        } else if (this.getAvaTexIsr() != null) {
            conditions += " AND AVA_TEX_ISR = ?";
            values.add(this.getAvaTexIsr());
        }

        if (this.getAvaCveStInver() != null && "null".equals(this.getAvaCveStInver())) {
            conditions += " AND AVA_CVE_ST_INVER IS NULL";
        } else if (this.getAvaCveStInver() != null) {
            conditions += " AND AVA_CVE_ST_INVER = ?";
            values.add(this.getAvaCveStInver());
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
        String sql = "UPDATE AVALORES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AVA_ANTEPROYECTO = ?";
        pkValues.add(this.getAvaAnteproyecto());
        fields += " AVA_CVE_ENT_FIN = ?, ";
        values.add(this.getAvaCveEntFin());
        fields += " AVA_ASESOR_FIN = ?, ";
        values.add(this.getAvaAsesorFin());
        fields += " AVA_CVE_BURSATILES = ?, ";
        values.add(this.getAvaCveBursatiles());
        fields += " AVA_CVE_NO_BURS = ?, ";
        values.add(this.getAvaCveNoBurs());
        fields += " AVA_CVE_BANCARIOS = ?, ";
        values.add(this.getAvaCveBancarios());
        fields += " AVA_CVE_MON_EXTRAN = ?, ";
        values.add(this.getAvaCveMonExtran());
        fields += " AVA_CVE_COMIS_EXEN = ?, ";
        values.add(this.getAvaCveComisExen());
        fields += " AVA_CVE_ISR_EXENTO = ?, ";
        values.add(this.getAvaCveIsrExento());
        fields += " AVA_TEX_COMISION = ?, ";
        values.add(this.getAvaTexComision());
        fields += " AVA_TEX_ISR = ?, ";
        values.add(this.getAvaTexIsr());
        fields += " AVA_CVE_ST_INVER = ?, ";
        values.add(this.getAvaCveStInver());
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
        String sql = "INSERT INTO AVALORES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AVA_ANTEPROYECTO";
        fieldValues += ", ?";
        values.add(this.getAvaAnteproyecto());

        fields += ", AVA_CVE_ENT_FIN";
        fieldValues += ", ?";
        values.add(this.getAvaCveEntFin());

        fields += ", AVA_ASESOR_FIN";
        fieldValues += ", ?";
        values.add(this.getAvaAsesorFin());

        fields += ", AVA_CVE_BURSATILES";
        fieldValues += ", ?";
        values.add(this.getAvaCveBursatiles());

        fields += ", AVA_CVE_NO_BURS";
        fieldValues += ", ?";
        values.add(this.getAvaCveNoBurs());

        fields += ", AVA_CVE_BANCARIOS";
        fieldValues += ", ?";
        values.add(this.getAvaCveBancarios());

        fields += ", AVA_CVE_MON_EXTRAN";
        fieldValues += ", ?";
        values.add(this.getAvaCveMonExtran());

        fields += ", AVA_CVE_COMIS_EXEN";
        fieldValues += ", ?";
        values.add(this.getAvaCveComisExen());

        fields += ", AVA_CVE_ISR_EXENTO";
        fieldValues += ", ?";
        values.add(this.getAvaCveIsrExento());

        fields += ", AVA_TEX_COMISION";
        fieldValues += ", ?";
        values.add(this.getAvaTexComision());

        fields += ", AVA_TEX_ISR";
        fieldValues += ", ?";
        values.add(this.getAvaTexIsr());

        fields += ", AVA_CVE_ST_INVER";
        fieldValues += ", ?";
        values.add(this.getAvaCveStInver());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AVALORES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AVA_ANTEPROYECTO = ?";
        values.add(this.getAvaAnteproyecto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Avalores instance = (Avalores) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAvaAnteproyecto().equals(instance.getAvaAnteproyecto()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveEntFin().equals(instance.getAvaCveEntFin()))
            equalObjects = false;
        if (equalObjects && !this.getAvaAsesorFin().equals(instance.getAvaAsesorFin()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveBursatiles().equals(instance.getAvaCveBursatiles()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveNoBurs().equals(instance.getAvaCveNoBurs()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveBancarios().equals(instance.getAvaCveBancarios()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveMonExtran().equals(instance.getAvaCveMonExtran()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveComisExen().equals(instance.getAvaCveComisExen()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveIsrExento().equals(instance.getAvaCveIsrExento()))
            equalObjects = false;
        if (equalObjects && !this.getAvaTexComision().equals(instance.getAvaTexComision()))
            equalObjects = false;
        if (equalObjects && !this.getAvaTexIsr().equals(instance.getAvaTexIsr()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveStInver().equals(instance.getAvaCveStInver()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Avalores result = new Avalores();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAvaAnteproyecto((BigDecimal) objectData.getData("AVA_ANTEPROYECTO"));
        result.setAvaCveEntFin((String) objectData.getData("AVA_CVE_ENT_FIN"));
        result.setAvaAsesorFin((String) objectData.getData("AVA_ASESOR_FIN"));
        result.setAvaCveBursatiles((BigDecimal) objectData.getData("AVA_CVE_BURSATILES"));
        result.setAvaCveNoBurs((BigDecimal) objectData.getData("AVA_CVE_NO_BURS"));
        result.setAvaCveBancarios((BigDecimal) objectData.getData("AVA_CVE_BANCARIOS"));
        result.setAvaCveMonExtran((BigDecimal) objectData.getData("AVA_CVE_MON_EXTRAN"));
        result.setAvaCveComisExen((BigDecimal) objectData.getData("AVA_CVE_COMIS_EXEN"));
        result.setAvaCveIsrExento((BigDecimal) objectData.getData("AVA_CVE_ISR_EXENTO"));
        result.setAvaTexComision((String) objectData.getData("AVA_TEX_COMISION"));
        result.setAvaTexIsr((String) objectData.getData("AVA_TEX_ISR"));
        result.setAvaCveStInver((String) objectData.getData("AVA_CVE_ST_INVER"));

        return result;

    }

}
