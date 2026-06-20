package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISINTE_PK", columns = { "EIT_NUM_PROGRAMA", "EIT_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emisinte extends DomainObject {

    BigDecimal eitNumPrograma = null;
    BigDecimal eitNumEmision = null;
    BigDecimal eitProtInflacion = null;
    String eitPeriodCalculo = null;
    BigDecimal eitUdiInicio = null;
    BigDecimal eitUdiFin = null;
    BigDecimal eitPrimaAdicional = null;
    BigDecimal eitImpPrimaAdic = null;
    BigDecimal eitNumMonedaInfla = null;
    BigDecimal eitAnoAltaReg = null;
    BigDecimal eitMesAltaReg = null;
    BigDecimal eitDiaAltaReg = null;
    BigDecimal eitAnoUltMod = null;
    BigDecimal eitMesUltMod = null;
    BigDecimal eitDiaUltMod = null;
    String eitCveStEmisinte = null;

    public Emisinte() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEitNumPrograma(BigDecimal eitNumPrograma) {
        this.eitNumPrograma = eitNumPrograma;
    }

    public BigDecimal getEitNumPrograma() {
        return this.eitNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEitNumEmision(BigDecimal eitNumEmision) {
        this.eitNumEmision = eitNumEmision;
    }

    public BigDecimal getEitNumEmision() {
        return this.eitNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEitProtInflacion(BigDecimal eitProtInflacion) {
        this.eitProtInflacion = eitProtInflacion;
    }

    public BigDecimal getEitProtInflacion() {
        return this.eitProtInflacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEitPeriodCalculo(String eitPeriodCalculo) {
        this.eitPeriodCalculo = eitPeriodCalculo;
    }

    public String getEitPeriodCalculo() {
        return this.eitPeriodCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEitUdiInicio(BigDecimal eitUdiInicio) {
        this.eitUdiInicio = eitUdiInicio;
    }

    public BigDecimal getEitUdiInicio() {
        return this.eitUdiInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEitUdiFin(BigDecimal eitUdiFin) {
        this.eitUdiFin = eitUdiFin;
    }

    public BigDecimal getEitUdiFin() {
        return this.eitUdiFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEitPrimaAdicional(BigDecimal eitPrimaAdicional) {
        this.eitPrimaAdicional = eitPrimaAdicional;
    }

    public BigDecimal getEitPrimaAdicional() {
        return this.eitPrimaAdicional;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEitImpPrimaAdic(BigDecimal eitImpPrimaAdic) {
        this.eitImpPrimaAdic = eitImpPrimaAdic;
    }

    public BigDecimal getEitImpPrimaAdic() {
        return this.eitImpPrimaAdic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEitNumMonedaInfla(BigDecimal eitNumMonedaInfla) {
        this.eitNumMonedaInfla = eitNumMonedaInfla;
    }

    public BigDecimal getEitNumMonedaInfla() {
        return this.eitNumMonedaInfla;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEitAnoAltaReg(BigDecimal eitAnoAltaReg) {
        this.eitAnoAltaReg = eitAnoAltaReg;
    }

    public BigDecimal getEitAnoAltaReg() {
        return this.eitAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEitMesAltaReg(BigDecimal eitMesAltaReg) {
        this.eitMesAltaReg = eitMesAltaReg;
    }

    public BigDecimal getEitMesAltaReg() {
        return this.eitMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEitDiaAltaReg(BigDecimal eitDiaAltaReg) {
        this.eitDiaAltaReg = eitDiaAltaReg;
    }

    public BigDecimal getEitDiaAltaReg() {
        return this.eitDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEitAnoUltMod(BigDecimal eitAnoUltMod) {
        this.eitAnoUltMod = eitAnoUltMod;
    }

    public BigDecimal getEitAnoUltMod() {
        return this.eitAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEitMesUltMod(BigDecimal eitMesUltMod) {
        this.eitMesUltMod = eitMesUltMod;
    }

    public BigDecimal getEitMesUltMod() {
        return this.eitMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEitDiaUltMod(BigDecimal eitDiaUltMod) {
        this.eitDiaUltMod = eitDiaUltMod;
    }

    public BigDecimal getEitDiaUltMod() {
        return this.eitDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEitCveStEmisinte(String eitCveStEmisinte) {
        this.eitCveStEmisinte = eitCveStEmisinte;
    }

    public String getEitCveStEmisinte() {
        return this.eitCveStEmisinte;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISINTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEitNumPrograma() != null && this.getEitNumPrograma().longValue() == -999) {
            conditions += " AND EIT_NUM_PROGRAMA IS NULL";
        } else if (this.getEitNumPrograma() != null) {
            conditions += " AND EIT_NUM_PROGRAMA = ?";
            values.add(this.getEitNumPrograma());
        }

        if (this.getEitNumEmision() != null && this.getEitNumEmision().longValue() == -999) {
            conditions += " AND EIT_NUM_EMISION IS NULL";
        } else if (this.getEitNumEmision() != null) {
            conditions += " AND EIT_NUM_EMISION = ?";
            values.add(this.getEitNumEmision());
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
        String sql = "SELECT * FROM EMISINTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEitNumPrograma() != null && this.getEitNumPrograma().longValue() == -999) {
            conditions += " AND EIT_NUM_PROGRAMA IS NULL";
        } else if (this.getEitNumPrograma() != null) {
            conditions += " AND EIT_NUM_PROGRAMA = ?";
            values.add(this.getEitNumPrograma());
        }

        if (this.getEitNumEmision() != null && this.getEitNumEmision().longValue() == -999) {
            conditions += " AND EIT_NUM_EMISION IS NULL";
        } else if (this.getEitNumEmision() != null) {
            conditions += " AND EIT_NUM_EMISION = ?";
            values.add(this.getEitNumEmision());
        }

        if (this.getEitProtInflacion() != null && this.getEitProtInflacion().longValue() == -999) {
            conditions += " AND EIT_PROT_INFLACION IS NULL";
        } else if (this.getEitProtInflacion() != null) {
            conditions += " AND EIT_PROT_INFLACION = ?";
            values.add(this.getEitProtInflacion());
        }

        if (this.getEitPeriodCalculo() != null && "null".equals(this.getEitPeriodCalculo())) {
            conditions += " AND EIT_PERIOD_CALCULO IS NULL";
        } else if (this.getEitPeriodCalculo() != null) {
            conditions += " AND EIT_PERIOD_CALCULO = ?";
            values.add(this.getEitPeriodCalculo());
        }

        if (this.getEitUdiInicio() != null && this.getEitUdiInicio().longValue() == -999) {
            conditions += " AND EIT_UDI_INICIO IS NULL";
        } else if (this.getEitUdiInicio() != null) {
            conditions += " AND EIT_UDI_INICIO = ?";
            values.add(this.getEitUdiInicio());
        }

        if (this.getEitUdiFin() != null && this.getEitUdiFin().longValue() == -999) {
            conditions += " AND EIT_UDI_FIN IS NULL";
        } else if (this.getEitUdiFin() != null) {
            conditions += " AND EIT_UDI_FIN = ?";
            values.add(this.getEitUdiFin());
        }

        if (this.getEitPrimaAdicional() != null && this.getEitPrimaAdicional().longValue() == -999) {
            conditions += " AND EIT_PRIMA_ADICIONAL IS NULL";
        } else if (this.getEitPrimaAdicional() != null) {
            conditions += " AND EIT_PRIMA_ADICIONAL = ?";
            values.add(this.getEitPrimaAdicional());
        }

        if (this.getEitImpPrimaAdic() != null && this.getEitImpPrimaAdic().longValue() == -999) {
            conditions += " AND EIT_IMP_PRIMA_ADIC IS NULL";
        } else if (this.getEitImpPrimaAdic() != null) {
            conditions += " AND EIT_IMP_PRIMA_ADIC = ?";
            values.add(this.getEitImpPrimaAdic());
        }

        if (this.getEitNumMonedaInfla() != null && this.getEitNumMonedaInfla().longValue() == -999) {
            conditions += " AND EIT_NUM_MONEDA_INFLA IS NULL";
        } else if (this.getEitNumMonedaInfla() != null) {
            conditions += " AND EIT_NUM_MONEDA_INFLA = ?";
            values.add(this.getEitNumMonedaInfla());
        }

        if (this.getEitAnoAltaReg() != null && this.getEitAnoAltaReg().longValue() == -999) {
            conditions += " AND EIT_ANO_ALTA_REG IS NULL";
        } else if (this.getEitAnoAltaReg() != null) {
            conditions += " AND EIT_ANO_ALTA_REG = ?";
            values.add(this.getEitAnoAltaReg());
        }

        if (this.getEitMesAltaReg() != null && this.getEitMesAltaReg().longValue() == -999) {
            conditions += " AND EIT_MES_ALTA_REG IS NULL";
        } else if (this.getEitMesAltaReg() != null) {
            conditions += " AND EIT_MES_ALTA_REG = ?";
            values.add(this.getEitMesAltaReg());
        }

        if (this.getEitDiaAltaReg() != null && this.getEitDiaAltaReg().longValue() == -999) {
            conditions += " AND EIT_DIA_ALTA_REG IS NULL";
        } else if (this.getEitDiaAltaReg() != null) {
            conditions += " AND EIT_DIA_ALTA_REG = ?";
            values.add(this.getEitDiaAltaReg());
        }

        if (this.getEitAnoUltMod() != null && this.getEitAnoUltMod().longValue() == -999) {
            conditions += " AND EIT_ANO_ULT_MOD IS NULL";
        } else if (this.getEitAnoUltMod() != null) {
            conditions += " AND EIT_ANO_ULT_MOD = ?";
            values.add(this.getEitAnoUltMod());
        }

        if (this.getEitMesUltMod() != null && this.getEitMesUltMod().longValue() == -999) {
            conditions += " AND EIT_MES_ULT_MOD IS NULL";
        } else if (this.getEitMesUltMod() != null) {
            conditions += " AND EIT_MES_ULT_MOD = ?";
            values.add(this.getEitMesUltMod());
        }

        if (this.getEitDiaUltMod() != null && this.getEitDiaUltMod().longValue() == -999) {
            conditions += " AND EIT_DIA_ULT_MOD IS NULL";
        } else if (this.getEitDiaUltMod() != null) {
            conditions += " AND EIT_DIA_ULT_MOD = ?";
            values.add(this.getEitDiaUltMod());
        }

        if (this.getEitCveStEmisinte() != null && "null".equals(this.getEitCveStEmisinte())) {
            conditions += " AND EIT_CVE_ST_EMISINTE IS NULL";
        } else if (this.getEitCveStEmisinte() != null) {
            conditions += " AND EIT_CVE_ST_EMISINTE = ?";
            values.add(this.getEitCveStEmisinte());
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
        String sql = "UPDATE EMISINTE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EIT_NUM_PROGRAMA = ?";
        pkValues.add(this.getEitNumPrograma());
        conditions += " AND EIT_NUM_EMISION = ?";
        pkValues.add(this.getEitNumEmision());
        fields += " EIT_PROT_INFLACION = ?, ";
        values.add(this.getEitProtInflacion());
        fields += " EIT_PERIOD_CALCULO = ?, ";
        values.add(this.getEitPeriodCalculo());
        fields += " EIT_UDI_INICIO = ?, ";
        values.add(this.getEitUdiInicio());
        fields += " EIT_UDI_FIN = ?, ";
        values.add(this.getEitUdiFin());
        fields += " EIT_PRIMA_ADICIONAL = ?, ";
        values.add(this.getEitPrimaAdicional());
        fields += " EIT_IMP_PRIMA_ADIC = ?, ";
        values.add(this.getEitImpPrimaAdic());
        fields += " EIT_NUM_MONEDA_INFLA = ?, ";
        values.add(this.getEitNumMonedaInfla());
        fields += " EIT_ANO_ALTA_REG = ?, ";
        values.add(this.getEitAnoAltaReg());
        fields += " EIT_MES_ALTA_REG = ?, ";
        values.add(this.getEitMesAltaReg());
        fields += " EIT_DIA_ALTA_REG = ?, ";
        values.add(this.getEitDiaAltaReg());
        fields += " EIT_ANO_ULT_MOD = ?, ";
        values.add(this.getEitAnoUltMod());
        fields += " EIT_MES_ULT_MOD = ?, ";
        values.add(this.getEitMesUltMod());
        fields += " EIT_DIA_ULT_MOD = ?, ";
        values.add(this.getEitDiaUltMod());
        fields += " EIT_CVE_ST_EMISINTE = ?, ";
        values.add(this.getEitCveStEmisinte());
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
        String sql = "INSERT INTO EMISINTE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EIT_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEitNumPrograma());

        fields += ", EIT_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEitNumEmision());

        fields += ", EIT_PROT_INFLACION";
        fieldValues += ", ?";
        values.add(this.getEitProtInflacion());

        fields += ", EIT_PERIOD_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEitPeriodCalculo());

        fields += ", EIT_UDI_INICIO";
        fieldValues += ", ?";
        values.add(this.getEitUdiInicio());

        fields += ", EIT_UDI_FIN";
        fieldValues += ", ?";
        values.add(this.getEitUdiFin());

        fields += ", EIT_PRIMA_ADICIONAL";
        fieldValues += ", ?";
        values.add(this.getEitPrimaAdicional());

        fields += ", EIT_IMP_PRIMA_ADIC";
        fieldValues += ", ?";
        values.add(this.getEitImpPrimaAdic());

        fields += ", EIT_NUM_MONEDA_INFLA";
        fieldValues += ", ?";
        values.add(this.getEitNumMonedaInfla());

        fields += ", EIT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEitAnoAltaReg());

        fields += ", EIT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEitMesAltaReg());

        fields += ", EIT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEitDiaAltaReg());

        fields += ", EIT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEitAnoUltMod());

        fields += ", EIT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEitMesUltMod());

        fields += ", EIT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEitDiaUltMod());

        fields += ", EIT_CVE_ST_EMISINTE";
        fieldValues += ", ?";
        values.add(this.getEitCveStEmisinte());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISINTE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EIT_NUM_PROGRAMA = ?";
        values.add(this.getEitNumPrograma());
        conditions += " AND EIT_NUM_EMISION = ?";
        values.add(this.getEitNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisinte instance = (Emisinte) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEitNumPrograma().equals(instance.getEitNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEitNumEmision().equals(instance.getEitNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEitProtInflacion().equals(instance.getEitProtInflacion()))
            equalObjects = false;
        if (equalObjects && !this.getEitPeriodCalculo().equals(instance.getEitPeriodCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEitUdiInicio().equals(instance.getEitUdiInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEitUdiFin().equals(instance.getEitUdiFin()))
            equalObjects = false;
        if (equalObjects && !this.getEitPrimaAdicional().equals(instance.getEitPrimaAdicional()))
            equalObjects = false;
        if (equalObjects && !this.getEitImpPrimaAdic().equals(instance.getEitImpPrimaAdic()))
            equalObjects = false;
        if (equalObjects && !this.getEitNumMonedaInfla().equals(instance.getEitNumMonedaInfla()))
            equalObjects = false;
        if (equalObjects && !this.getEitAnoAltaReg().equals(instance.getEitAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEitMesAltaReg().equals(instance.getEitMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEitDiaAltaReg().equals(instance.getEitDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEitAnoUltMod().equals(instance.getEitAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEitMesUltMod().equals(instance.getEitMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEitDiaUltMod().equals(instance.getEitDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEitCveStEmisinte().equals(instance.getEitCveStEmisinte()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisinte result = new Emisinte();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEitNumPrograma((BigDecimal) objectData.getData("EIT_NUM_PROGRAMA"));
        result.setEitNumEmision((BigDecimal) objectData.getData("EIT_NUM_EMISION"));
        result.setEitProtInflacion((BigDecimal) objectData.getData("EIT_PROT_INFLACION"));
        result.setEitPeriodCalculo((String) objectData.getData("EIT_PERIOD_CALCULO"));
        result.setEitUdiInicio((BigDecimal) objectData.getData("EIT_UDI_INICIO"));
        result.setEitUdiFin((BigDecimal) objectData.getData("EIT_UDI_FIN"));
        result.setEitPrimaAdicional((BigDecimal) objectData.getData("EIT_PRIMA_ADICIONAL"));
        result.setEitImpPrimaAdic((BigDecimal) objectData.getData("EIT_IMP_PRIMA_ADIC"));
        result.setEitNumMonedaInfla((BigDecimal) objectData.getData("EIT_NUM_MONEDA_INFLA"));
        result.setEitAnoAltaReg((BigDecimal) objectData.getData("EIT_ANO_ALTA_REG"));
        result.setEitMesAltaReg((BigDecimal) objectData.getData("EIT_MES_ALTA_REG"));
        result.setEitDiaAltaReg((BigDecimal) objectData.getData("EIT_DIA_ALTA_REG"));
        result.setEitAnoUltMod((BigDecimal) objectData.getData("EIT_ANO_ULT_MOD"));
        result.setEitMesUltMod((BigDecimal) objectData.getData("EIT_MES_ULT_MOD"));
        result.setEitDiaUltMod((BigDecimal) objectData.getData("EIT_DIA_ULT_MOD"));
        result.setEitCveStEmisinte((String) objectData.getData("EIT_CVE_ST_EMISINTE"));

        return result;

    }

}
