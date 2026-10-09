package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIINTE_PK", columns = { "EEIN_ID_PROGRAMA", "EEIN_ID_FIDEICOMISO", "EEIN_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmiinte extends DomainObject {

    BigDecimal eeinIdPrograma = null;
    BigDecimal eeinIdFideicomiso = null;
    BigDecimal eeinIdEmision = null;
    BigDecimal eeinPlazo = null;
    BigDecimal eeinTasaConsiderar = null;
    BigDecimal eeinCapitaEquival = null;
    BigDecimal eeinPjeSobretasa = null;
    BigDecimal eeinPpAdicional = null;
    BigDecimal eeinIsr = null;
    BigDecimal eeinImpIsr = null;
    String eeinMayorMenor = null;
    BigDecimal eeinAbsolutaTrb = null;
    BigDecimal eeinPublicadaConocer = null;
    BigDecimal eeinNumDiasIns = null;
    String eeinStEmiinte = null;

    public FEmiinte() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeinIdPrograma(BigDecimal eeinIdPrograma) {
        this.eeinIdPrograma = eeinIdPrograma;
    }

    public BigDecimal getEeinIdPrograma() {
        return this.eeinIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeinIdFideicomiso(BigDecimal eeinIdFideicomiso) {
        this.eeinIdFideicomiso = eeinIdFideicomiso;
    }

    public BigDecimal getEeinIdFideicomiso() {
        return this.eeinIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeinIdEmision(BigDecimal eeinIdEmision) {
        this.eeinIdEmision = eeinIdEmision;
    }

    public BigDecimal getEeinIdEmision() {
        return this.eeinIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeinPlazo(BigDecimal eeinPlazo) {
        this.eeinPlazo = eeinPlazo;
    }

    public BigDecimal getEeinPlazo() {
        return this.eeinPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeinTasaConsiderar(BigDecimal eeinTasaConsiderar) {
        this.eeinTasaConsiderar = eeinTasaConsiderar;
    }

    public BigDecimal getEeinTasaConsiderar() {
        return this.eeinTasaConsiderar;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeinCapitaEquival(BigDecimal eeinCapitaEquival) {
        this.eeinCapitaEquival = eeinCapitaEquival;
    }

    public BigDecimal getEeinCapitaEquival() {
        return this.eeinCapitaEquival;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeinPjeSobretasa(BigDecimal eeinPjeSobretasa) {
        this.eeinPjeSobretasa = eeinPjeSobretasa;
    }

    public BigDecimal getEeinPjeSobretasa() {
        return this.eeinPjeSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeinPpAdicional(BigDecimal eeinPpAdicional) {
        this.eeinPpAdicional = eeinPpAdicional;
    }

    public BigDecimal getEeinPpAdicional() {
        return this.eeinPpAdicional;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeinIsr(BigDecimal eeinIsr) {
        this.eeinIsr = eeinIsr;
    }

    public BigDecimal getEeinIsr() {
        return this.eeinIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeinImpIsr(BigDecimal eeinImpIsr) {
        this.eeinImpIsr = eeinImpIsr;
    }

    public BigDecimal getEeinImpIsr() {
        return this.eeinImpIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeinMayorMenor(String eeinMayorMenor) {
        this.eeinMayorMenor = eeinMayorMenor;
    }

    public String getEeinMayorMenor() {
        return this.eeinMayorMenor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeinAbsolutaTrb(BigDecimal eeinAbsolutaTrb) {
        this.eeinAbsolutaTrb = eeinAbsolutaTrb;
    }

    public BigDecimal getEeinAbsolutaTrb() {
        return this.eeinAbsolutaTrb;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeinPublicadaConocer(BigDecimal eeinPublicadaConocer) {
        this.eeinPublicadaConocer = eeinPublicadaConocer;
    }

    public BigDecimal getEeinPublicadaConocer() {
        return this.eeinPublicadaConocer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeinNumDiasIns(BigDecimal eeinNumDiasIns) {
        this.eeinNumDiasIns = eeinNumDiasIns;
    }

    public BigDecimal getEeinNumDiasIns() {
        return this.eeinNumDiasIns;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeinStEmiinte(String eeinStEmiinte) {
        this.eeinStEmiinte = eeinStEmiinte;
    }

    public String getEeinStEmiinte() {
        return this.eeinStEmiinte;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIINTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeinIdPrograma() != null && this.getEeinIdPrograma().longValue() == -999) {
            conditions += " AND EEIN_ID_PROGRAMA IS NULL";
        } else if (this.getEeinIdPrograma() != null) {
            conditions += " AND EEIN_ID_PROGRAMA = ?";
            values.add(this.getEeinIdPrograma());
        }

        if (this.getEeinIdFideicomiso() != null && this.getEeinIdFideicomiso().longValue() == -999) {
            conditions += " AND EEIN_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeinIdFideicomiso() != null) {
            conditions += " AND EEIN_ID_FIDEICOMISO = ?";
            values.add(this.getEeinIdFideicomiso());
        }

        if (this.getEeinIdEmision() != null && this.getEeinIdEmision().longValue() == -999) {
            conditions += " AND EEIN_ID_EMISION IS NULL";
        } else if (this.getEeinIdEmision() != null) {
            conditions += " AND EEIN_ID_EMISION = ?";
            values.add(this.getEeinIdEmision());
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
        String sql = "SELECT * FROM F_EMIINTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeinIdPrograma() != null && this.getEeinIdPrograma().longValue() == -999) {
            conditions += " AND EEIN_ID_PROGRAMA IS NULL";
        } else if (this.getEeinIdPrograma() != null) {
            conditions += " AND EEIN_ID_PROGRAMA = ?";
            values.add(this.getEeinIdPrograma());
        }

        if (this.getEeinIdFideicomiso() != null && this.getEeinIdFideicomiso().longValue() == -999) {
            conditions += " AND EEIN_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeinIdFideicomiso() != null) {
            conditions += " AND EEIN_ID_FIDEICOMISO = ?";
            values.add(this.getEeinIdFideicomiso());
        }

        if (this.getEeinIdEmision() != null && this.getEeinIdEmision().longValue() == -999) {
            conditions += " AND EEIN_ID_EMISION IS NULL";
        } else if (this.getEeinIdEmision() != null) {
            conditions += " AND EEIN_ID_EMISION = ?";
            values.add(this.getEeinIdEmision());
        }

        if (this.getEeinPlazo() != null && this.getEeinPlazo().longValue() == -999) {
            conditions += " AND EEIN_PLAZO IS NULL";
        } else if (this.getEeinPlazo() != null) {
            conditions += " AND EEIN_PLAZO = ?";
            values.add(this.getEeinPlazo());
        }

        if (this.getEeinTasaConsiderar() != null && this.getEeinTasaConsiderar().longValue() == -999) {
            conditions += " AND EEIN_TASA_CONSIDERAR IS NULL";
        } else if (this.getEeinTasaConsiderar() != null) {
            conditions += " AND EEIN_TASA_CONSIDERAR = ?";
            values.add(this.getEeinTasaConsiderar());
        }

        if (this.getEeinCapitaEquival() != null && this.getEeinCapitaEquival().longValue() == -999) {
            conditions += " AND EEIN_CAPITA_EQUIVAL IS NULL";
        } else if (this.getEeinCapitaEquival() != null) {
            conditions += " AND EEIN_CAPITA_EQUIVAL = ?";
            values.add(this.getEeinCapitaEquival());
        }

        if (this.getEeinPjeSobretasa() != null && this.getEeinPjeSobretasa().longValue() == -999) {
            conditions += " AND EEIN_PJE_SOBRETASA IS NULL";
        } else if (this.getEeinPjeSobretasa() != null) {
            conditions += " AND EEIN_PJE_SOBRETASA = ?";
            values.add(this.getEeinPjeSobretasa());
        }

        if (this.getEeinPpAdicional() != null && this.getEeinPpAdicional().longValue() == -999) {
            conditions += " AND EEIN_PP_ADICIONAL IS NULL";
        } else if (this.getEeinPpAdicional() != null) {
            conditions += " AND EEIN_PP_ADICIONAL = ?";
            values.add(this.getEeinPpAdicional());
        }

        if (this.getEeinIsr() != null && this.getEeinIsr().longValue() == -999) {
            conditions += " AND EEIN_ISR IS NULL";
        } else if (this.getEeinIsr() != null) {
            conditions += " AND EEIN_ISR = ?";
            values.add(this.getEeinIsr());
        }

        if (this.getEeinImpIsr() != null && this.getEeinImpIsr().longValue() == -999) {
            conditions += " AND EEIN_IMP_ISR IS NULL";
        } else if (this.getEeinImpIsr() != null) {
            conditions += " AND EEIN_IMP_ISR = ?";
            values.add(this.getEeinImpIsr());
        }

        if (this.getEeinMayorMenor() != null && "null".equals(this.getEeinMayorMenor())) {
            conditions += " AND EEIN_MAYOR_MENOR IS NULL";
        } else if (this.getEeinMayorMenor() != null) {
            conditions += " AND EEIN_MAYOR_MENOR = ?";
            values.add(this.getEeinMayorMenor());
        }

        if (this.getEeinAbsolutaTrb() != null && this.getEeinAbsolutaTrb().longValue() == -999) {
            conditions += " AND EEIN_ABSOLUTA_TRB IS NULL";
        } else if (this.getEeinAbsolutaTrb() != null) {
            conditions += " AND EEIN_ABSOLUTA_TRB = ?";
            values.add(this.getEeinAbsolutaTrb());
        }

        if (this.getEeinPublicadaConocer() != null && this.getEeinPublicadaConocer().longValue() == -999) {
            conditions += " AND EEIN_PUBLICADA_CONOCER IS NULL";
        } else if (this.getEeinPublicadaConocer() != null) {
            conditions += " AND EEIN_PUBLICADA_CONOCER = ?";
            values.add(this.getEeinPublicadaConocer());
        }

        if (this.getEeinNumDiasIns() != null && this.getEeinNumDiasIns().longValue() == -999) {
            conditions += " AND EEIN_NUM_DIAS_INS IS NULL";
        } else if (this.getEeinNumDiasIns() != null) {
            conditions += " AND EEIN_NUM_DIAS_INS = ?";
            values.add(this.getEeinNumDiasIns());
        }

        if (this.getEeinStEmiinte() != null && "null".equals(this.getEeinStEmiinte())) {
            conditions += " AND EEIN_ST_EMIINTE IS NULL";
        } else if (this.getEeinStEmiinte() != null) {
            conditions += " AND EEIN_ST_EMIINTE = ?";
            values.add(this.getEeinStEmiinte());
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
        String sql = "UPDATE F_EMIINTE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEIN_ID_PROGRAMA = ?";
        pkValues.add(this.getEeinIdPrograma());
        conditions += " AND EEIN_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeinIdFideicomiso());
        conditions += " AND EEIN_ID_EMISION = ?";
        pkValues.add(this.getEeinIdEmision());
        fields += " EEIN_PLAZO = ?, ";
        values.add(this.getEeinPlazo());
        fields += " EEIN_TASA_CONSIDERAR = ?, ";
        values.add(this.getEeinTasaConsiderar());
        fields += " EEIN_CAPITA_EQUIVAL = ?, ";
        values.add(this.getEeinCapitaEquival());
        fields += " EEIN_PJE_SOBRETASA = ?, ";
        values.add(this.getEeinPjeSobretasa());
        fields += " EEIN_PP_ADICIONAL = ?, ";
        values.add(this.getEeinPpAdicional());
        fields += " EEIN_ISR = ?, ";
        values.add(this.getEeinIsr());
        fields += " EEIN_IMP_ISR = ?, ";
        values.add(this.getEeinImpIsr());
        fields += " EEIN_MAYOR_MENOR = ?, ";
        values.add(this.getEeinMayorMenor());
        fields += " EEIN_ABSOLUTA_TRB = ?, ";
        values.add(this.getEeinAbsolutaTrb());
        fields += " EEIN_PUBLICADA_CONOCER = ?, ";
        values.add(this.getEeinPublicadaConocer());
        fields += " EEIN_NUM_DIAS_INS = ?, ";
        values.add(this.getEeinNumDiasIns());
        fields += " EEIN_ST_EMIINTE = ?, ";
        values.add(this.getEeinStEmiinte());
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
        String sql = "INSERT INTO F_EMIINTE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEIN_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeinIdPrograma());

        fields += ", EEIN_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeinIdFideicomiso());

        fields += ", EEIN_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeinIdEmision());

        fields += ", EEIN_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEeinPlazo());

        fields += ", EEIN_TASA_CONSIDERAR";
        fieldValues += ", ?";
        values.add(this.getEeinTasaConsiderar());

        fields += ", EEIN_CAPITA_EQUIVAL";
        fieldValues += ", ?";
        values.add(this.getEeinCapitaEquival());

        fields += ", EEIN_PJE_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getEeinPjeSobretasa());

        fields += ", EEIN_PP_ADICIONAL";
        fieldValues += ", ?";
        values.add(this.getEeinPpAdicional());

        fields += ", EEIN_ISR";
        fieldValues += ", ?";
        values.add(this.getEeinIsr());

        fields += ", EEIN_IMP_ISR";
        fieldValues += ", ?";
        values.add(this.getEeinImpIsr());

        fields += ", EEIN_MAYOR_MENOR";
        fieldValues += ", ?";
        values.add(this.getEeinMayorMenor());

        fields += ", EEIN_ABSOLUTA_TRB";
        fieldValues += ", ?";
        values.add(this.getEeinAbsolutaTrb());

        fields += ", EEIN_PUBLICADA_CONOCER";
        fieldValues += ", ?";
        values.add(this.getEeinPublicadaConocer());

        fields += ", EEIN_NUM_DIAS_INS";
        fieldValues += ", ?";
        values.add(this.getEeinNumDiasIns());

        fields += ", EEIN_ST_EMIINTE";
        fieldValues += ", ?";
        values.add(this.getEeinStEmiinte());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIINTE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEIN_ID_PROGRAMA = ?";
        values.add(this.getEeinIdPrograma());
        conditions += " AND EEIN_ID_FIDEICOMISO = ?";
        values.add(this.getEeinIdFideicomiso());
        conditions += " AND EEIN_ID_EMISION = ?";
        values.add(this.getEeinIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiinte instance = (FEmiinte) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeinIdPrograma().equals(instance.getEeinIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeinIdFideicomiso().equals(instance.getEeinIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeinIdEmision().equals(instance.getEeinIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeinPlazo().equals(instance.getEeinPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEeinTasaConsiderar().equals(instance.getEeinTasaConsiderar()))
            equalObjects = false;
        if (equalObjects && !this.getEeinCapitaEquival().equals(instance.getEeinCapitaEquival()))
            equalObjects = false;
        if (equalObjects && !this.getEeinPjeSobretasa().equals(instance.getEeinPjeSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getEeinPpAdicional().equals(instance.getEeinPpAdicional()))
            equalObjects = false;
        if (equalObjects && !this.getEeinIsr().equals(instance.getEeinIsr()))
            equalObjects = false;
        if (equalObjects && !this.getEeinImpIsr().equals(instance.getEeinImpIsr()))
            equalObjects = false;
        if (equalObjects && !this.getEeinMayorMenor().equals(instance.getEeinMayorMenor()))
            equalObjects = false;
        if (equalObjects && !this.getEeinAbsolutaTrb().equals(instance.getEeinAbsolutaTrb()))
            equalObjects = false;
        if (equalObjects && !this.getEeinPublicadaConocer().equals(instance.getEeinPublicadaConocer()))
            equalObjects = false;
        if (equalObjects && !this.getEeinNumDiasIns().equals(instance.getEeinNumDiasIns()))
            equalObjects = false;
        if (equalObjects && !this.getEeinStEmiinte().equals(instance.getEeinStEmiinte()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiinte result = new FEmiinte();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeinIdPrograma((BigDecimal) objectData.getData("EEIN_ID_PROGRAMA"));
        result.setEeinIdFideicomiso((BigDecimal) objectData.getData("EEIN_ID_FIDEICOMISO"));
        result.setEeinIdEmision((BigDecimal) objectData.getData("EEIN_ID_EMISION"));
        result.setEeinPlazo((BigDecimal) objectData.getData("EEIN_PLAZO"));
        result.setEeinTasaConsiderar((BigDecimal) objectData.getData("EEIN_TASA_CONSIDERAR"));
        result.setEeinCapitaEquival((BigDecimal) objectData.getData("EEIN_CAPITA_EQUIVAL"));
        result.setEeinPjeSobretasa((BigDecimal) objectData.getData("EEIN_PJE_SOBRETASA"));
        result.setEeinPpAdicional((BigDecimal) objectData.getData("EEIN_PP_ADICIONAL"));
        result.setEeinIsr((BigDecimal) objectData.getData("EEIN_ISR"));
        result.setEeinImpIsr((BigDecimal) objectData.getData("EEIN_IMP_ISR"));
        result.setEeinMayorMenor((String) objectData.getData("EEIN_MAYOR_MENOR"));
        result.setEeinAbsolutaTrb((BigDecimal) objectData.getData("EEIN_ABSOLUTA_TRB"));
        result.setEeinPublicadaConocer((BigDecimal) objectData.getData("EEIN_PUBLICADA_CONOCER"));
        result.setEeinNumDiasIns((BigDecimal) objectData.getData("EEIN_NUM_DIAS_INS"));
        result.setEeinStEmiinte((String) objectData.getData("EEIN_ST_EMIINTE"));

        return result;

    }

}
