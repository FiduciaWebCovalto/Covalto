package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REGLAOPE_PK",
            columns = { "RDO_NUM_CONTRATO", "RDO_TIPO_REGLA", "RDO_NUM_TITULO", "RDO_NUM_CAPITULO", "RDO_NUM_SUBCAPT", "RDO_NUM_INCISO", "RDO_NUM_SUBINCISO" },
            sequences = { "MANUAL" })
public class Reglaope extends DomainObject {

    BigDecimal rdoNumContrato = null;
    String rdoTipoRegla = null;
    String rdoNumTitulo = null;
    String rdoNumCapitulo = null;
    String rdoNumSubcapt = null;
    String rdoNumInciso = null;
    String rdoNumSubinciso = null;
    String rdoTxtRegla = null;
    String rdoRefMod = null;
    Long rdoDescRegla = null;
    BigDecimal rdoAnoAltaReg = null;
    BigDecimal rdoMesAltaReg = null;
    BigDecimal rdoDiaAltaReg = null;
    BigDecimal rdoAnoUltMod = null;
    BigDecimal rdoMesUltMod = null;
    BigDecimal rdoDiaUltMod = null;
    String rdoCveStReglaop = null;

    public Reglaope() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdoNumContrato(BigDecimal rdoNumContrato) {
        this.rdoNumContrato = rdoNumContrato;
    }

    public BigDecimal getRdoNumContrato() {
        return this.rdoNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoTipoRegla(String rdoTipoRegla) {
        this.rdoTipoRegla = rdoTipoRegla;
    }

    public String getRdoTipoRegla() {
        return this.rdoTipoRegla;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoNumTitulo(String rdoNumTitulo) {
        this.rdoNumTitulo = rdoNumTitulo;
    }

    public String getRdoNumTitulo() {
        return this.rdoNumTitulo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoNumCapitulo(String rdoNumCapitulo) {
        this.rdoNumCapitulo = rdoNumCapitulo;
    }

    public String getRdoNumCapitulo() {
        return this.rdoNumCapitulo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoNumSubcapt(String rdoNumSubcapt) {
        this.rdoNumSubcapt = rdoNumSubcapt;
    }

    public String getRdoNumSubcapt() {
        return this.rdoNumSubcapt;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoNumInciso(String rdoNumInciso) {
        this.rdoNumInciso = rdoNumInciso;
    }

    public String getRdoNumInciso() {
        return this.rdoNumInciso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoNumSubinciso(String rdoNumSubinciso) {
        this.rdoNumSubinciso = rdoNumSubinciso;
    }

    public String getRdoNumSubinciso() {
        return this.rdoNumSubinciso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoTxtRegla(String rdoTxtRegla) {
        this.rdoTxtRegla = rdoTxtRegla;
    }

    public String getRdoTxtRegla() {
        return this.rdoTxtRegla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoRefMod(String rdoRefMod) {
        this.rdoRefMod = rdoRefMod;
    }

    public String getRdoRefMod() {
        return this.rdoRefMod;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setRdoDescRegla(Long rdoDescRegla) {
        this.rdoDescRegla = rdoDescRegla;
    }

    public Long getRdoDescRegla() {
        return this.rdoDescRegla;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRdoAnoAltaReg(BigDecimal rdoAnoAltaReg) {
        this.rdoAnoAltaReg = rdoAnoAltaReg;
    }

    public BigDecimal getRdoAnoAltaReg() {
        return this.rdoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRdoMesAltaReg(BigDecimal rdoMesAltaReg) {
        this.rdoMesAltaReg = rdoMesAltaReg;
    }

    public BigDecimal getRdoMesAltaReg() {
        return this.rdoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRdoDiaAltaReg(BigDecimal rdoDiaAltaReg) {
        this.rdoDiaAltaReg = rdoDiaAltaReg;
    }

    public BigDecimal getRdoDiaAltaReg() {
        return this.rdoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRdoAnoUltMod(BigDecimal rdoAnoUltMod) {
        this.rdoAnoUltMod = rdoAnoUltMod;
    }

    public BigDecimal getRdoAnoUltMod() {
        return this.rdoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRdoMesUltMod(BigDecimal rdoMesUltMod) {
        this.rdoMesUltMod = rdoMesUltMod;
    }

    public BigDecimal getRdoMesUltMod() {
        return this.rdoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRdoDiaUltMod(BigDecimal rdoDiaUltMod) {
        this.rdoDiaUltMod = rdoDiaUltMod;
    }

    public BigDecimal getRdoDiaUltMod() {
        return this.rdoDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdoCveStReglaop(String rdoCveStReglaop) {
        this.rdoCveStReglaop = rdoCveStReglaop;
    }

    public String getRdoCveStReglaop() {
        return this.rdoCveStReglaop;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REGLAOPE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRdoNumContrato() != null && this.getRdoNumContrato().longValue() == -999) {
            conditions += " AND RDO_NUM_CONTRATO IS NULL";
        } else if (this.getRdoNumContrato() != null) {
            conditions += " AND RDO_NUM_CONTRATO = ?";
            values.add(this.getRdoNumContrato());
        }

        if (this.getRdoTipoRegla() != null && "null".equals(this.getRdoTipoRegla())) {
            conditions += " AND RDO_TIPO_REGLA IS NULL";
        } else if (this.getRdoTipoRegla() != null) {
            conditions += " AND RDO_TIPO_REGLA = ?";
            values.add(this.getRdoTipoRegla());
        }

        if (this.getRdoNumTitulo() != null && "null".equals(this.getRdoNumTitulo())) {
            conditions += " AND RDO_NUM_TITULO IS NULL";
        } else if (this.getRdoNumTitulo() != null) {
            conditions += " AND RDO_NUM_TITULO = ?";
            values.add(this.getRdoNumTitulo());
        }

        if (this.getRdoNumCapitulo() != null && "null".equals(this.getRdoNumCapitulo())) {
            conditions += " AND RDO_NUM_CAPITULO IS NULL";
        } else if (this.getRdoNumCapitulo() != null) {
            conditions += " AND RDO_NUM_CAPITULO = ?";
            values.add(this.getRdoNumCapitulo());
        }

        if (this.getRdoNumSubcapt() != null && "null".equals(this.getRdoNumSubcapt())) {
            conditions += " AND RDO_NUM_SUBCAPT IS NULL";
        } else if (this.getRdoNumSubcapt() != null) {
            conditions += " AND RDO_NUM_SUBCAPT = ?";
            values.add(this.getRdoNumSubcapt());
        }

        if (this.getRdoNumInciso() != null && "null".equals(this.getRdoNumInciso())) {
            conditions += " AND RDO_NUM_INCISO IS NULL";
        } else if (this.getRdoNumInciso() != null) {
            conditions += " AND RDO_NUM_INCISO = ?";
            values.add(this.getRdoNumInciso());
        }

        if (this.getRdoNumSubinciso() != null && "null".equals(this.getRdoNumSubinciso())) {
            conditions += " AND RDO_NUM_SUBINCISO IS NULL";
        } else if (this.getRdoNumSubinciso() != null) {
            conditions += " AND RDO_NUM_SUBINCISO = ?";
            values.add(this.getRdoNumSubinciso());
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
        String sql = "SELECT * FROM REGLAOPE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRdoNumContrato() != null && this.getRdoNumContrato().longValue() == -999) {
            conditions += " AND RDO_NUM_CONTRATO IS NULL";
        } else if (this.getRdoNumContrato() != null) {
            conditions += " AND RDO_NUM_CONTRATO = ?";
            values.add(this.getRdoNumContrato());
        }

        if (this.getRdoTipoRegla() != null && "null".equals(this.getRdoTipoRegla())) {
            conditions += " AND RDO_TIPO_REGLA IS NULL";
        } else if (this.getRdoTipoRegla() != null) {
            conditions += " AND RDO_TIPO_REGLA = ?";
            values.add(this.getRdoTipoRegla());
        }

        if (this.getRdoNumTitulo() != null && "null".equals(this.getRdoNumTitulo())) {
            conditions += " AND RDO_NUM_TITULO IS NULL";
        } else if (this.getRdoNumTitulo() != null) {
            conditions += " AND RDO_NUM_TITULO = ?";
            values.add(this.getRdoNumTitulo());
        }

        if (this.getRdoNumCapitulo() != null && "null".equals(this.getRdoNumCapitulo())) {
            conditions += " AND RDO_NUM_CAPITULO IS NULL";
        } else if (this.getRdoNumCapitulo() != null) {
            conditions += " AND RDO_NUM_CAPITULO = ?";
            values.add(this.getRdoNumCapitulo());
        }

        if (this.getRdoNumSubcapt() != null && "null".equals(this.getRdoNumSubcapt())) {
            conditions += " AND RDO_NUM_SUBCAPT IS NULL";
        } else if (this.getRdoNumSubcapt() != null) {
            conditions += " AND RDO_NUM_SUBCAPT = ?";
            values.add(this.getRdoNumSubcapt());
        }

        if (this.getRdoNumInciso() != null && "null".equals(this.getRdoNumInciso())) {
            conditions += " AND RDO_NUM_INCISO IS NULL";
        } else if (this.getRdoNumInciso() != null) {
            conditions += " AND RDO_NUM_INCISO = ?";
            values.add(this.getRdoNumInciso());
        }

        if (this.getRdoNumSubinciso() != null && "null".equals(this.getRdoNumSubinciso())) {
            conditions += " AND RDO_NUM_SUBINCISO IS NULL";
        } else if (this.getRdoNumSubinciso() != null) {
            conditions += " AND RDO_NUM_SUBINCISO = ?";
            values.add(this.getRdoNumSubinciso());
        }

        if (this.getRdoTxtRegla() != null && "null".equals(this.getRdoTxtRegla())) {
            conditions += " AND RDO_TXT_REGLA IS NULL";
        } else if (this.getRdoTxtRegla() != null) {
            conditions += " AND RDO_TXT_REGLA = ?";
            values.add(this.getRdoTxtRegla());
        }

        if (this.getRdoRefMod() != null && "null".equals(this.getRdoRefMod())) {
            conditions += " AND RDO_REF_MOD IS NULL";
        } else if (this.getRdoRefMod() != null) {
            conditions += " AND RDO_REF_MOD = ?";
            values.add(this.getRdoRefMod());
        }

        if (this.getRdoDescRegla() != null && this.getRdoDescRegla() == -999) {
            conditions += " AND RDO_DESC_REGLA IS NULL";
        } else if (this.getRdoDescRegla() != null) {
            conditions += " AND RDO_DESC_REGLA = ?";
            values.add(this.getRdoDescRegla());
        }

        if (this.getRdoAnoAltaReg() != null && this.getRdoAnoAltaReg().longValue() == -999) {
            conditions += " AND RDO_ANO_ALTA_REG IS NULL";
        } else if (this.getRdoAnoAltaReg() != null) {
            conditions += " AND RDO_ANO_ALTA_REG = ?";
            values.add(this.getRdoAnoAltaReg());
        }

        if (this.getRdoMesAltaReg() != null && this.getRdoMesAltaReg().longValue() == -999) {
            conditions += " AND RDO_MES_ALTA_REG IS NULL";
        } else if (this.getRdoMesAltaReg() != null) {
            conditions += " AND RDO_MES_ALTA_REG = ?";
            values.add(this.getRdoMesAltaReg());
        }

        if (this.getRdoDiaAltaReg() != null && this.getRdoDiaAltaReg().longValue() == -999) {
            conditions += " AND RDO_DIA_ALTA_REG IS NULL";
        } else if (this.getRdoDiaAltaReg() != null) {
            conditions += " AND RDO_DIA_ALTA_REG = ?";
            values.add(this.getRdoDiaAltaReg());
        }

        if (this.getRdoAnoUltMod() != null && this.getRdoAnoUltMod().longValue() == -999) {
            conditions += " AND RDO_ANO_ULT_MOD IS NULL";
        } else if (this.getRdoAnoUltMod() != null) {
            conditions += " AND RDO_ANO_ULT_MOD = ?";
            values.add(this.getRdoAnoUltMod());
        }

        if (this.getRdoMesUltMod() != null && this.getRdoMesUltMod().longValue() == -999) {
            conditions += " AND RDO_MES_ULT_MOD IS NULL";
        } else if (this.getRdoMesUltMod() != null) {
            conditions += " AND RDO_MES_ULT_MOD = ?";
            values.add(this.getRdoMesUltMod());
        }

        if (this.getRdoDiaUltMod() != null && this.getRdoDiaUltMod().longValue() == -999) {
            conditions += " AND RDO_DIA_ULT_MOD IS NULL";
        } else if (this.getRdoDiaUltMod() != null) {
            conditions += " AND RDO_DIA_ULT_MOD = ?";
            values.add(this.getRdoDiaUltMod());
        }

        if (this.getRdoCveStReglaop() != null && "null".equals(this.getRdoCveStReglaop())) {
            conditions += " AND RDO_CVE_ST_REGLAOP IS NULL";
        } else if (this.getRdoCveStReglaop() != null) {
            conditions += " AND RDO_CVE_ST_REGLAOP = ?";
            values.add(this.getRdoCveStReglaop());
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
        String sql = "UPDATE REGLAOPE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RDO_NUM_CONTRATO = ?";
        pkValues.add(this.getRdoNumContrato());
        conditions += " AND RDO_TIPO_REGLA = ?";
        pkValues.add(this.getRdoTipoRegla());
        conditions += " AND RDO_NUM_TITULO = ?";
        pkValues.add(this.getRdoNumTitulo());
        conditions += " AND RDO_NUM_CAPITULO = ?";
        pkValues.add(this.getRdoNumCapitulo());
        conditions += " AND RDO_NUM_SUBCAPT = ?";
        pkValues.add(this.getRdoNumSubcapt());
        conditions += " AND RDO_NUM_INCISO = ?";
        pkValues.add(this.getRdoNumInciso());
        conditions += " AND RDO_NUM_SUBINCISO = ?";
        pkValues.add(this.getRdoNumSubinciso());
        fields += " RDO_TXT_REGLA = ?, ";
        values.add(this.getRdoTxtRegla());
        fields += " RDO_REF_MOD = ?, ";
        values.add(this.getRdoRefMod());
        fields += " RDO_DESC_REGLA = ?, ";
        values.add(this.getRdoDescRegla());
        fields += " RDO_ANO_ALTA_REG = ?, ";
        values.add(this.getRdoAnoAltaReg());
        fields += " RDO_MES_ALTA_REG = ?, ";
        values.add(this.getRdoMesAltaReg());
        fields += " RDO_DIA_ALTA_REG = ?, ";
        values.add(this.getRdoDiaAltaReg());
        fields += " RDO_ANO_ULT_MOD = ?, ";
        values.add(this.getRdoAnoUltMod());
        fields += " RDO_MES_ULT_MOD = ?, ";
        values.add(this.getRdoMesUltMod());
        fields += " RDO_DIA_ULT_MOD = ?, ";
        values.add(this.getRdoDiaUltMod());
        fields += " RDO_CVE_ST_REGLAOP = ?, ";
        values.add(this.getRdoCveStReglaop());
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
        String sql = "INSERT INTO REGLAOPE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RDO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRdoNumContrato());

        fields += ", RDO_TIPO_REGLA";
        fieldValues += ", ?";
        values.add(this.getRdoTipoRegla());

        fields += ", RDO_NUM_TITULO";
        fieldValues += ", ?";
        values.add(this.getRdoNumTitulo());

        fields += ", RDO_NUM_CAPITULO";
        fieldValues += ", ?";
        values.add(this.getRdoNumCapitulo());

        fields += ", RDO_NUM_SUBCAPT";
        fieldValues += ", ?";
        values.add(this.getRdoNumSubcapt());

        fields += ", RDO_NUM_INCISO";
        fieldValues += ", ?";
        values.add(this.getRdoNumInciso());

        fields += ", RDO_NUM_SUBINCISO";
        fieldValues += ", ?";
        values.add(this.getRdoNumSubinciso());

        fields += ", RDO_TXT_REGLA";
        fieldValues += ", ?";
        values.add(this.getRdoTxtRegla());

        fields += ", RDO_REF_MOD";
        fieldValues += ", ?";
        values.add(this.getRdoRefMod());

        fields += ", RDO_DESC_REGLA";
        fieldValues += ", ?";
        values.add(this.getRdoDescRegla());

        fields += ", RDO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRdoAnoAltaReg());

        fields += ", RDO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRdoMesAltaReg());

        fields += ", RDO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRdoDiaAltaReg());

        fields += ", RDO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRdoAnoUltMod());

        fields += ", RDO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRdoMesUltMod());

        fields += ", RDO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRdoDiaUltMod());

        fields += ", RDO_CVE_ST_REGLAOP";
        fieldValues += ", ?";
        values.add(this.getRdoCveStReglaop());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REGLAOPE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RDO_NUM_CONTRATO = ?";
        values.add(this.getRdoNumContrato());
        conditions += " AND RDO_TIPO_REGLA = ?";
        values.add(this.getRdoTipoRegla());
        conditions += " AND RDO_NUM_TITULO = ?";
        values.add(this.getRdoNumTitulo());
        conditions += " AND RDO_NUM_CAPITULO = ?";
        values.add(this.getRdoNumCapitulo());
        conditions += " AND RDO_NUM_SUBCAPT = ?";
        values.add(this.getRdoNumSubcapt());
        conditions += " AND RDO_NUM_INCISO = ?";
        values.add(this.getRdoNumInciso());
        conditions += " AND RDO_NUM_SUBINCISO = ?";
        values.add(this.getRdoNumSubinciso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Reglaope instance = (Reglaope) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRdoNumContrato().equals(instance.getRdoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRdoTipoRegla().equals(instance.getRdoTipoRegla()))
            equalObjects = false;
        if (equalObjects && !this.getRdoNumTitulo().equals(instance.getRdoNumTitulo()))
            equalObjects = false;
        if (equalObjects && !this.getRdoNumCapitulo().equals(instance.getRdoNumCapitulo()))
            equalObjects = false;
        if (equalObjects && !this.getRdoNumSubcapt().equals(instance.getRdoNumSubcapt()))
            equalObjects = false;
        if (equalObjects && !this.getRdoNumInciso().equals(instance.getRdoNumInciso()))
            equalObjects = false;
        if (equalObjects && !this.getRdoNumSubinciso().equals(instance.getRdoNumSubinciso()))
            equalObjects = false;
        if (equalObjects && !this.getRdoTxtRegla().equals(instance.getRdoTxtRegla()))
            equalObjects = false;
        if (equalObjects && !this.getRdoRefMod().equals(instance.getRdoRefMod()))
            equalObjects = false;
        if (equalObjects && !this.getRdoDescRegla().equals(instance.getRdoDescRegla()))
            equalObjects = false;
        if (equalObjects && !this.getRdoAnoAltaReg().equals(instance.getRdoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRdoMesAltaReg().equals(instance.getRdoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRdoDiaAltaReg().equals(instance.getRdoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRdoAnoUltMod().equals(instance.getRdoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRdoMesUltMod().equals(instance.getRdoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRdoDiaUltMod().equals(instance.getRdoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRdoCveStReglaop().equals(instance.getRdoCveStReglaop()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Reglaope result = new Reglaope();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRdoNumContrato((BigDecimal) objectData.getData("RDO_NUM_CONTRATO"));
        result.setRdoTipoRegla((String) objectData.getData("RDO_TIPO_REGLA"));
        result.setRdoNumTitulo((String) objectData.getData("RDO_NUM_TITULO"));
        result.setRdoNumCapitulo((String) objectData.getData("RDO_NUM_CAPITULO"));
        result.setRdoNumSubcapt((String) objectData.getData("RDO_NUM_SUBCAPT"));
        result.setRdoNumInciso((String) objectData.getData("RDO_NUM_INCISO"));
        result.setRdoNumSubinciso((String) objectData.getData("RDO_NUM_SUBINCISO"));
        result.setRdoTxtRegla((String) objectData.getData("RDO_TXT_REGLA"));
        result.setRdoRefMod((String) objectData.getData("RDO_REF_MOD"));
        result.setRdoDescRegla((Long) objectData.getData("RDO_DESC_REGLA"));
        result.setRdoAnoAltaReg((BigDecimal) objectData.getData("RDO_ANO_ALTA_REG"));
        result.setRdoMesAltaReg((BigDecimal) objectData.getData("RDO_MES_ALTA_REG"));
        result.setRdoDiaAltaReg((BigDecimal) objectData.getData("RDO_DIA_ALTA_REG"));
        result.setRdoAnoUltMod((BigDecimal) objectData.getData("RDO_ANO_ULT_MOD"));
        result.setRdoMesUltMod((BigDecimal) objectData.getData("RDO_MES_ULT_MOD"));
        result.setRdoDiaUltMod((BigDecimal) objectData.getData("RDO_DIA_ULT_MOD"));
        result.setRdoCveStReglaop((String) objectData.getData("RDO_CVE_ST_REGLAOP"));

        return result;

    }

}
