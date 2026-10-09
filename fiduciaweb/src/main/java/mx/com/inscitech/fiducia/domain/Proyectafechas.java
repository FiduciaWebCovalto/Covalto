package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PROYECTAFECHAS_PK",
            columns =
            { "PRO_NUM_CONTRATO", "PRO_CVE_TIPO_HONO", "PRO_FEC_CALC_HONO", "PRO_CONCEPTO_HONO", "PRO_ANO_PER_DEL", "PRO_MES_PER_DEL", "PRO_DIA_PER_DEL", "PRO_ANO_PER_AL",
              "PRO_MES_PER_AL", "PRO_DIA_PER_AL"
    }, sequences = { "MANUAL" })
public class Proyectafechas extends DomainObject {

    BigDecimal proNumContrato = null;
    String proCveTipoHono = null;
    String proFecCalcHono = null;
    String proConceptoHono = null;
    BigDecimal proAnoPerDel = null;
    BigDecimal proMesPerDel = null;
    BigDecimal proDiaPerDel = null;
    BigDecimal proAnoPerAl = null;
    BigDecimal proMesPerAl = null;
    BigDecimal proDiaPerAl = null;
    BigDecimal proImporte = null;
    BigDecimal proIva = null;

    public Proyectafechas() {
        super();
        this.pkColumns = 10;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProNumContrato(BigDecimal proNumContrato) {
        this.proNumContrato = proNumContrato;
    }

    public BigDecimal getProNumContrato() {
        return this.proNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setProCveTipoHono(String proCveTipoHono) {
        this.proCveTipoHono = proCveTipoHono;
    }

    public String getProCveTipoHono() {
        return this.proCveTipoHono;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setProFecCalcHono(String proFecCalcHono) {
        this.proFecCalcHono = proFecCalcHono;
    }

    public String getProFecCalcHono() {
        return this.proFecCalcHono;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setProConceptoHono(String proConceptoHono) {
        this.proConceptoHono = proConceptoHono;
    }

    public String getProConceptoHono() {
        return this.proConceptoHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setProAnoPerDel(BigDecimal proAnoPerDel) {
        this.proAnoPerDel = proAnoPerDel;
    }

    public BigDecimal getProAnoPerDel() {
        return this.proAnoPerDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setProMesPerDel(BigDecimal proMesPerDel) {
        this.proMesPerDel = proMesPerDel;
    }

    public BigDecimal getProMesPerDel() {
        return this.proMesPerDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setProDiaPerDel(BigDecimal proDiaPerDel) {
        this.proDiaPerDel = proDiaPerDel;
    }

    public BigDecimal getProDiaPerDel() {
        return this.proDiaPerDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setProAnoPerAl(BigDecimal proAnoPerAl) {
        this.proAnoPerAl = proAnoPerAl;
    }

    public BigDecimal getProAnoPerAl() {
        return this.proAnoPerAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setProMesPerAl(BigDecimal proMesPerAl) {
        this.proMesPerAl = proMesPerAl;
    }

    public BigDecimal getProMesPerAl() {
        return this.proMesPerAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setProDiaPerAl(BigDecimal proDiaPerAl) {
        this.proDiaPerAl = proDiaPerAl;
    }

    public BigDecimal getProDiaPerAl() {
        return this.proDiaPerAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setProImporte(BigDecimal proImporte) {
        this.proImporte = proImporte;
    }

    public BigDecimal getProImporte() {
        return this.proImporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setProIva(BigDecimal proIva) {
        this.proIva = proIva;
    }

    public BigDecimal getProIva() {
        return this.proIva;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PROYECTAFECHAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getProNumContrato() != null && this.getProNumContrato().longValue() == -999) {
            conditions += " AND PRO_NUM_CONTRATO IS NULL";
        } else if (this.getProNumContrato() != null) {
            conditions += " AND PRO_NUM_CONTRATO = ?";
            values.add(this.getProNumContrato());
        }

        if (this.getProCveTipoHono() != null && "null".equals(this.getProCveTipoHono())) {
            conditions += " AND PRO_CVE_TIPO_HONO IS NULL";
        } else if (this.getProCveTipoHono() != null) {
            conditions += " AND PRO_CVE_TIPO_HONO = ?";
            values.add(this.getProCveTipoHono());
        }

        if (this.getProFecCalcHono() != null && "null".equals(this.getProFecCalcHono())) {
            conditions += " AND PRO_FEC_CALC_HONO IS NULL";
        } else if (this.getProFecCalcHono() != null) {
            conditions += " AND PRO_FEC_CALC_HONO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getProFecCalcHono());
        }

        if (this.getProConceptoHono() != null && "null".equals(this.getProConceptoHono())) {
            conditions += " AND PRO_CONCEPTO_HONO IS NULL";
        } else if (this.getProConceptoHono() != null) {
            conditions += " AND PRO_CONCEPTO_HONO = ?";
            values.add(this.getProConceptoHono());
        }

        if (this.getProAnoPerDel() != null && this.getProAnoPerDel().longValue() == -999) {
            conditions += " AND PRO_ANO_PER_DEL IS NULL";
        } else if (this.getProAnoPerDel() != null) {
            conditions += " AND PRO_ANO_PER_DEL = ?";
            values.add(this.getProAnoPerDel());
        }

        if (this.getProMesPerDel() != null && this.getProMesPerDel().longValue() == -999) {
            conditions += " AND PRO_MES_PER_DEL IS NULL";
        } else if (this.getProMesPerDel() != null) {
            conditions += " AND PRO_MES_PER_DEL = ?";
            values.add(this.getProMesPerDel());
        }

        if (this.getProDiaPerDel() != null && this.getProDiaPerDel().longValue() == -999) {
            conditions += " AND PRO_DIA_PER_DEL IS NULL";
        } else if (this.getProDiaPerDel() != null) {
            conditions += " AND PRO_DIA_PER_DEL = ?";
            values.add(this.getProDiaPerDel());
        }

        if (this.getProAnoPerAl() != null && this.getProAnoPerAl().longValue() == -999) {
            conditions += " AND PRO_ANO_PER_AL IS NULL";
        } else if (this.getProAnoPerAl() != null) {
            conditions += " AND PRO_ANO_PER_AL = ?";
            values.add(this.getProAnoPerAl());
        }

        if (this.getProMesPerAl() != null && this.getProMesPerAl().longValue() == -999) {
            conditions += " AND PRO_MES_PER_AL IS NULL";
        } else if (this.getProMesPerAl() != null) {
            conditions += " AND PRO_MES_PER_AL = ?";
            values.add(this.getProMesPerAl());
        }

        if (this.getProDiaPerAl() != null && this.getProDiaPerAl().longValue() == -999) {
            conditions += " AND PRO_DIA_PER_AL IS NULL";
        } else if (this.getProDiaPerAl() != null) {
            conditions += " AND PRO_DIA_PER_AL = ?";
            values.add(this.getProDiaPerAl());
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
        String sql = "SELECT * FROM PROYECTAFECHAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getProNumContrato() != null && this.getProNumContrato().longValue() == -999) {
            conditions += " AND PRO_NUM_CONTRATO IS NULL";
        } else if (this.getProNumContrato() != null) {
            conditions += " AND PRO_NUM_CONTRATO = ?";
            values.add(this.getProNumContrato());
        }

        if (this.getProCveTipoHono() != null && "null".equals(this.getProCveTipoHono())) {
            conditions += " AND PRO_CVE_TIPO_HONO IS NULL";
        } else if (this.getProCveTipoHono() != null) {
            conditions += " AND PRO_CVE_TIPO_HONO = ?";
            values.add(this.getProCveTipoHono());
        }

        if (this.getProFecCalcHono() != null && "null".equals(this.getProFecCalcHono())) {
            conditions += " AND PRO_FEC_CALC_HONO IS NULL";
        } else if (this.getProFecCalcHono() != null) {
            conditions += " AND PRO_FEC_CALC_HONO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getProFecCalcHono());
        }

        if (this.getProConceptoHono() != null && "null".equals(this.getProConceptoHono())) {
            conditions += " AND PRO_CONCEPTO_HONO IS NULL";
        } else if (this.getProConceptoHono() != null) {
            conditions += " AND PRO_CONCEPTO_HONO = ?";
            values.add(this.getProConceptoHono());
        }

        if (this.getProAnoPerDel() != null && this.getProAnoPerDel().longValue() == -999) {
            conditions += " AND PRO_ANO_PER_DEL IS NULL";
        } else if (this.getProAnoPerDel() != null) {
            conditions += " AND PRO_ANO_PER_DEL = ?";
            values.add(this.getProAnoPerDel());
        }

        if (this.getProMesPerDel() != null && this.getProMesPerDel().longValue() == -999) {
            conditions += " AND PRO_MES_PER_DEL IS NULL";
        } else if (this.getProMesPerDel() != null) {
            conditions += " AND PRO_MES_PER_DEL = ?";
            values.add(this.getProMesPerDel());
        }

        if (this.getProDiaPerDel() != null && this.getProDiaPerDel().longValue() == -999) {
            conditions += " AND PRO_DIA_PER_DEL IS NULL";
        } else if (this.getProDiaPerDel() != null) {
            conditions += " AND PRO_DIA_PER_DEL = ?";
            values.add(this.getProDiaPerDel());
        }

        if (this.getProAnoPerAl() != null && this.getProAnoPerAl().longValue() == -999) {
            conditions += " AND PRO_ANO_PER_AL IS NULL";
        } else if (this.getProAnoPerAl() != null) {
            conditions += " AND PRO_ANO_PER_AL = ?";
            values.add(this.getProAnoPerAl());
        }

        if (this.getProMesPerAl() != null && this.getProMesPerAl().longValue() == -999) {
            conditions += " AND PRO_MES_PER_AL IS NULL";
        } else if (this.getProMesPerAl() != null) {
            conditions += " AND PRO_MES_PER_AL = ?";
            values.add(this.getProMesPerAl());
        }

        if (this.getProDiaPerAl() != null && this.getProDiaPerAl().longValue() == -999) {
            conditions += " AND PRO_DIA_PER_AL IS NULL";
        } else if (this.getProDiaPerAl() != null) {
            conditions += " AND PRO_DIA_PER_AL = ?";
            values.add(this.getProDiaPerAl());
        }

        if (this.getProImporte() != null && this.getProImporte().longValue() == -999) {
            conditions += " AND PRO_IMPORTE IS NULL";
        } else if (this.getProImporte() != null) {
            conditions += " AND PRO_IMPORTE = ?";
            values.add(this.getProImporte());
        }

        if (this.getProIva() != null && this.getProIva().longValue() == -999) {
            conditions += " AND PRO_IVA IS NULL";
        } else if (this.getProIva() != null) {
            conditions += " AND PRO_IVA = ?";
            values.add(this.getProIva());
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
        String sql = "UPDATE PROYECTAFECHAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PRO_NUM_CONTRATO = ?";
        pkValues.add(this.getProNumContrato());
        conditions += " AND PRO_CVE_TIPO_HONO = ?";
        pkValues.add(this.getProCveTipoHono());
        conditions += " AND PRO_FEC_CALC_HONO = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getProFecCalcHono());
        conditions += " AND PRO_CONCEPTO_HONO = ?";
        pkValues.add(this.getProConceptoHono());
        conditions += " AND PRO_ANO_PER_DEL = ?";
        pkValues.add(this.getProAnoPerDel());
        conditions += " AND PRO_MES_PER_DEL = ?";
        pkValues.add(this.getProMesPerDel());
        conditions += " AND PRO_DIA_PER_DEL = ?";
        pkValues.add(this.getProDiaPerDel());
        conditions += " AND PRO_ANO_PER_AL = ?";
        pkValues.add(this.getProAnoPerAl());
        conditions += " AND PRO_MES_PER_AL = ?";
        pkValues.add(this.getProMesPerAl());
        conditions += " AND PRO_DIA_PER_AL = ?";
        pkValues.add(this.getProDiaPerAl());
        fields += " PRO_IMPORTE = ?, ";
        values.add(this.getProImporte());
        fields += " PRO_IVA = ?, ";
        values.add(this.getProIva());
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
        String sql = "INSERT INTO PROYECTAFECHAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getProNumContrato());

        fields += ", PRO_CVE_TIPO_HONO";
        fieldValues += ", ?";
        values.add(this.getProCveTipoHono());

        fields += ", PRO_FEC_CALC_HONO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getProFecCalcHono());

        fields += ", PRO_CONCEPTO_HONO";
        fieldValues += ", ?";
        values.add(this.getProConceptoHono());

        fields += ", PRO_ANO_PER_DEL";
        fieldValues += ", ?";
        values.add(this.getProAnoPerDel());

        fields += ", PRO_MES_PER_DEL";
        fieldValues += ", ?";
        values.add(this.getProMesPerDel());

        fields += ", PRO_DIA_PER_DEL";
        fieldValues += ", ?";
        values.add(this.getProDiaPerDel());

        fields += ", PRO_ANO_PER_AL";
        fieldValues += ", ?";
        values.add(this.getProAnoPerAl());

        fields += ", PRO_MES_PER_AL";
        fieldValues += ", ?";
        values.add(this.getProMesPerAl());

        fields += ", PRO_DIA_PER_AL";
        fieldValues += ", ?";
        values.add(this.getProDiaPerAl());

        fields += ", PRO_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getProImporte());

        fields += ", PRO_IVA";
        fieldValues += ", ?";
        values.add(this.getProIva());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PROYECTAFECHAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PRO_NUM_CONTRATO = ?";
        values.add(this.getProNumContrato());
        conditions += " AND PRO_CVE_TIPO_HONO = ?";
        values.add(this.getProCveTipoHono());
        conditions += " AND PRO_FEC_CALC_HONO = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getProFecCalcHono());
        conditions += " AND PRO_CONCEPTO_HONO = ?";
        values.add(this.getProConceptoHono());
        conditions += " AND PRO_ANO_PER_DEL = ?";
        values.add(this.getProAnoPerDel());
        conditions += " AND PRO_MES_PER_DEL = ?";
        values.add(this.getProMesPerDel());
        conditions += " AND PRO_DIA_PER_DEL = ?";
        values.add(this.getProDiaPerDel());
        conditions += " AND PRO_ANO_PER_AL = ?";
        values.add(this.getProAnoPerAl());
        conditions += " AND PRO_MES_PER_AL = ?";
        values.add(this.getProMesPerAl());
        conditions += " AND PRO_DIA_PER_AL = ?";
        values.add(this.getProDiaPerAl());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Proyectafechas instance = (Proyectafechas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getProNumContrato().equals(instance.getProNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getProCveTipoHono().equals(instance.getProCveTipoHono()))
            equalObjects = false;
        if (equalObjects && !this.getProFecCalcHono().equals(instance.getProFecCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getProConceptoHono().equals(instance.getProConceptoHono()))
            equalObjects = false;
        if (equalObjects && !this.getProAnoPerDel().equals(instance.getProAnoPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getProMesPerDel().equals(instance.getProMesPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getProDiaPerDel().equals(instance.getProDiaPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getProAnoPerAl().equals(instance.getProAnoPerAl()))
            equalObjects = false;
        if (equalObjects && !this.getProMesPerAl().equals(instance.getProMesPerAl()))
            equalObjects = false;
        if (equalObjects && !this.getProDiaPerAl().equals(instance.getProDiaPerAl()))
            equalObjects = false;
        if (equalObjects && !this.getProImporte().equals(instance.getProImporte()))
            equalObjects = false;
        if (equalObjects && !this.getProIva().equals(instance.getProIva()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Proyectafechas result = new Proyectafechas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setProNumContrato((BigDecimal) objectData.getData("PRO_NUM_CONTRATO"));
        result.setProCveTipoHono((String) objectData.getData("PRO_CVE_TIPO_HONO"));
        result.setProFecCalcHono((String) objectData.getData("PRO_FEC_CALC_HONO"));
        result.setProConceptoHono((String) objectData.getData("PRO_CONCEPTO_HONO"));
        result.setProAnoPerDel((BigDecimal) objectData.getData("PRO_ANO_PER_DEL"));
        result.setProMesPerDel((BigDecimal) objectData.getData("PRO_MES_PER_DEL"));
        result.setProDiaPerDel((BigDecimal) objectData.getData("PRO_DIA_PER_DEL"));
        result.setProAnoPerAl((BigDecimal) objectData.getData("PRO_ANO_PER_AL"));
        result.setProMesPerAl((BigDecimal) objectData.getData("PRO_MES_PER_AL"));
        result.setProDiaPerAl((BigDecimal) objectData.getData("PRO_DIA_PER_AL"));
        result.setProImporte((BigDecimal) objectData.getData("PRO_IMPORTE"));
        result.setProIva((BigDecimal) objectData.getData("PRO_IVA"));

        return result;

    }

}
