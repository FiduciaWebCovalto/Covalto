package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OPE_COMP_PK",
            columns =
            { "SUV_CONTRATO_INTER", "SUV_NOM_PIZARRA", "SUV_SERIE_EMISION", "SUC_NUM_CORTE", "SUC_NUM_ENTID_FIN", "SUC_CONTRATO_INTER", "SUC_NOM_PIZARRA", "SUC_SERIE_EMISION",
              "INT_INTERMEDIARIO", "CTO_NUM_CONTRATO", "OPC_SECUENCIAL"
    }, sequences = { "MANUAL" })
public class OpeComp extends DomainObject {

    BigDecimal suvContratoInter = null;
    String suvNomPizarra = null;
    String suvSerieEmision = null;
    BigDecimal suvImpTitVta = null;
    BigDecimal sucNumCorte = null;
    BigDecimal sucNumEntidFin = null;
    BigDecimal sucContratoInter = null;
    String sucNomPizarra = null;
    String sucSerieEmision = null;
    BigDecimal sucImpSugerCpa = null;
    String intIntermediario = null;
    BigDecimal ctoNumContrato = null;
    BigDecimal opcSecuencial = null;

    public OpeComp() {
        super();
        this.pkColumns = 11;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvContratoInter(BigDecimal suvContratoInter) {
        this.suvContratoInter = suvContratoInter;
    }

    public BigDecimal getSuvContratoInter() {
        return this.suvContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSuvNomPizarra(String suvNomPizarra) {
        this.suvNomPizarra = suvNomPizarra;
    }

    public String getSuvNomPizarra() {
        return this.suvNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSuvSerieEmision(String suvSerieEmision) {
        this.suvSerieEmision = suvSerieEmision;
    }

    public String getSuvSerieEmision() {
        return this.suvSerieEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSuvImpTitVta(BigDecimal suvImpTitVta) {
        this.suvImpTitVta = suvImpTitVta;
    }

    public BigDecimal getSuvImpTitVta() {
        return this.suvImpTitVta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumCorte(BigDecimal sucNumCorte) {
        this.sucNumCorte = sucNumCorte;
    }

    public BigDecimal getSucNumCorte() {
        return this.sucNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumEntidFin(BigDecimal sucNumEntidFin) {
        this.sucNumEntidFin = sucNumEntidFin;
    }

    public BigDecimal getSucNumEntidFin() {
        return this.sucNumEntidFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucContratoInter(BigDecimal sucContratoInter) {
        this.sucContratoInter = sucContratoInter;
    }

    public BigDecimal getSucContratoInter() {
        return this.sucContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSucNomPizarra(String sucNomPizarra) {
        this.sucNomPizarra = sucNomPizarra;
    }

    public String getSucNomPizarra() {
        return this.sucNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSucSerieEmision(String sucSerieEmision) {
        this.sucSerieEmision = sucSerieEmision;
    }

    public String getSucSerieEmision() {
        return this.sucSerieEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSucImpSugerCpa(BigDecimal sucImpSugerCpa) {
        this.sucImpSugerCpa = sucImpSugerCpa;
    }

    public BigDecimal getSucImpSugerCpa() {
        return this.sucImpSugerCpa;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIntIntermediario(String intIntermediario) {
        this.intIntermediario = intIntermediario;
    }

    public String getIntIntermediario() {
        return this.intIntermediario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumContrato(BigDecimal ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public BigDecimal getCtoNumContrato() {
        return this.ctoNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpcSecuencial(BigDecimal opcSecuencial) {
        this.opcSecuencial = opcSecuencial;
    }

    public BigDecimal getOpcSecuencial() {
        return this.opcSecuencial;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OPE_COMP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSuvContratoInter() != null && this.getSuvContratoInter().longValue() == -999) {
            conditions += " AND SUV_CONTRATO_INTER IS NULL";
        } else if (this.getSuvContratoInter() != null) {
            conditions += " AND SUV_CONTRATO_INTER = ?";
            values.add(this.getSuvContratoInter());
        }

        if (this.getSuvNomPizarra() != null && "null".equals(this.getSuvNomPizarra())) {
            conditions += " AND SUV_NOM_PIZARRA IS NULL";
        } else if (this.getSuvNomPizarra() != null) {
            conditions += " AND SUV_NOM_PIZARRA = ?";
            values.add(this.getSuvNomPizarra());
        }

        if (this.getSuvSerieEmision() != null && "null".equals(this.getSuvSerieEmision())) {
            conditions += " AND SUV_SERIE_EMISION IS NULL";
        } else if (this.getSuvSerieEmision() != null) {
            conditions += " AND SUV_SERIE_EMISION = ?";
            values.add(this.getSuvSerieEmision());
        }

        if (this.getSucNumCorte() != null && this.getSucNumCorte().longValue() == -999) {
            conditions += " AND SUC_NUM_CORTE IS NULL";
        } else if (this.getSucNumCorte() != null) {
            conditions += " AND SUC_NUM_CORTE = ?";
            values.add(this.getSucNumCorte());
        }

        if (this.getSucNumEntidFin() != null && this.getSucNumEntidFin().longValue() == -999) {
            conditions += " AND SUC_NUM_ENTID_FIN IS NULL";
        } else if (this.getSucNumEntidFin() != null) {
            conditions += " AND SUC_NUM_ENTID_FIN = ?";
            values.add(this.getSucNumEntidFin());
        }

        if (this.getSucContratoInter() != null && this.getSucContratoInter().longValue() == -999) {
            conditions += " AND SUC_CONTRATO_INTER IS NULL";
        } else if (this.getSucContratoInter() != null) {
            conditions += " AND SUC_CONTRATO_INTER = ?";
            values.add(this.getSucContratoInter());
        }

        if (this.getSucNomPizarra() != null && "null".equals(this.getSucNomPizarra())) {
            conditions += " AND SUC_NOM_PIZARRA IS NULL";
        } else if (this.getSucNomPizarra() != null) {
            conditions += " AND SUC_NOM_PIZARRA = ?";
            values.add(this.getSucNomPizarra());
        }

        if (this.getSucSerieEmision() != null && "null".equals(this.getSucSerieEmision())) {
            conditions += " AND SUC_SERIE_EMISION IS NULL";
        } else if (this.getSucSerieEmision() != null) {
            conditions += " AND SUC_SERIE_EMISION = ?";
            values.add(this.getSucSerieEmision());
        }

        if (this.getIntIntermediario() != null && "null".equals(this.getIntIntermediario())) {
            conditions += " AND INT_INTERMEDIARIO IS NULL";
        } else if (this.getIntIntermediario() != null) {
            conditions += " AND INT_INTERMEDIARIO = ?";
            values.add(this.getIntIntermediario());
        }

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
            values.add(this.getCtoNumContrato());
        }

        if (this.getOpcSecuencial() != null && this.getOpcSecuencial().longValue() == -999) {
            conditions += " AND OPC_SECUENCIAL IS NULL";
        } else if (this.getOpcSecuencial() != null) {
            conditions += " AND OPC_SECUENCIAL = ?";
            values.add(this.getOpcSecuencial());
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
        String sql = "SELECT * FROM OPE_COMP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSuvContratoInter() != null && this.getSuvContratoInter().longValue() == -999) {
            conditions += " AND SUV_CONTRATO_INTER IS NULL";
        } else if (this.getSuvContratoInter() != null) {
            conditions += " AND SUV_CONTRATO_INTER = ?";
            values.add(this.getSuvContratoInter());
        }

        if (this.getSuvNomPizarra() != null && "null".equals(this.getSuvNomPizarra())) {
            conditions += " AND SUV_NOM_PIZARRA IS NULL";
        } else if (this.getSuvNomPizarra() != null) {
            conditions += " AND SUV_NOM_PIZARRA = ?";
            values.add(this.getSuvNomPizarra());
        }

        if (this.getSuvSerieEmision() != null && "null".equals(this.getSuvSerieEmision())) {
            conditions += " AND SUV_SERIE_EMISION IS NULL";
        } else if (this.getSuvSerieEmision() != null) {
            conditions += " AND SUV_SERIE_EMISION = ?";
            values.add(this.getSuvSerieEmision());
        }

        if (this.getSuvImpTitVta() != null && this.getSuvImpTitVta().longValue() == -999) {
            conditions += " AND SUV_IMP_TIT_VTA IS NULL";
        } else if (this.getSuvImpTitVta() != null) {
            conditions += " AND SUV_IMP_TIT_VTA = ?";
            values.add(this.getSuvImpTitVta());
        }

        if (this.getSucNumCorte() != null && this.getSucNumCorte().longValue() == -999) {
            conditions += " AND SUC_NUM_CORTE IS NULL";
        } else if (this.getSucNumCorte() != null) {
            conditions += " AND SUC_NUM_CORTE = ?";
            values.add(this.getSucNumCorte());
        }

        if (this.getSucNumEntidFin() != null && this.getSucNumEntidFin().longValue() == -999) {
            conditions += " AND SUC_NUM_ENTID_FIN IS NULL";
        } else if (this.getSucNumEntidFin() != null) {
            conditions += " AND SUC_NUM_ENTID_FIN = ?";
            values.add(this.getSucNumEntidFin());
        }

        if (this.getSucContratoInter() != null && this.getSucContratoInter().longValue() == -999) {
            conditions += " AND SUC_CONTRATO_INTER IS NULL";
        } else if (this.getSucContratoInter() != null) {
            conditions += " AND SUC_CONTRATO_INTER = ?";
            values.add(this.getSucContratoInter());
        }

        if (this.getSucNomPizarra() != null && "null".equals(this.getSucNomPizarra())) {
            conditions += " AND SUC_NOM_PIZARRA IS NULL";
        } else if (this.getSucNomPizarra() != null) {
            conditions += " AND SUC_NOM_PIZARRA = ?";
            values.add(this.getSucNomPizarra());
        }

        if (this.getSucSerieEmision() != null && "null".equals(this.getSucSerieEmision())) {
            conditions += " AND SUC_SERIE_EMISION IS NULL";
        } else if (this.getSucSerieEmision() != null) {
            conditions += " AND SUC_SERIE_EMISION = ?";
            values.add(this.getSucSerieEmision());
        }

        if (this.getSucImpSugerCpa() != null && this.getSucImpSugerCpa().longValue() == -999) {
            conditions += " AND SUC_IMP_SUGER_CPA IS NULL";
        } else if (this.getSucImpSugerCpa() != null) {
            conditions += " AND SUC_IMP_SUGER_CPA = ?";
            values.add(this.getSucImpSugerCpa());
        }

        if (this.getIntIntermediario() != null && "null".equals(this.getIntIntermediario())) {
            conditions += " AND INT_INTERMEDIARIO IS NULL";
        } else if (this.getIntIntermediario() != null) {
            conditions += " AND INT_INTERMEDIARIO = ?";
            values.add(this.getIntIntermediario());
        }

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
            values.add(this.getCtoNumContrato());
        }

        if (this.getOpcSecuencial() != null && this.getOpcSecuencial().longValue() == -999) {
            conditions += " AND OPC_SECUENCIAL IS NULL";
        } else if (this.getOpcSecuencial() != null) {
            conditions += " AND OPC_SECUENCIAL = ?";
            values.add(this.getOpcSecuencial());
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
        String sql = "UPDATE OPE_COMP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SUV_CONTRATO_INTER = ?";
        pkValues.add(this.getSuvContratoInter());
        conditions += " AND SUV_NOM_PIZARRA = ?";
        pkValues.add(this.getSuvNomPizarra());
        conditions += " AND SUV_SERIE_EMISION = ?";
        pkValues.add(this.getSuvSerieEmision());
        fields += " SUV_IMP_TIT_VTA = ?, ";
        values.add(this.getSuvImpTitVta());
        conditions += " AND SUC_NUM_CORTE = ?";
        pkValues.add(this.getSucNumCorte());
        conditions += " AND SUC_NUM_ENTID_FIN = ?";
        pkValues.add(this.getSucNumEntidFin());
        conditions += " AND SUC_CONTRATO_INTER = ?";
        pkValues.add(this.getSucContratoInter());
        conditions += " AND SUC_NOM_PIZARRA = ?";
        pkValues.add(this.getSucNomPizarra());
        conditions += " AND SUC_SERIE_EMISION = ?";
        pkValues.add(this.getSucSerieEmision());
        fields += " SUC_IMP_SUGER_CPA = ?, ";
        values.add(this.getSucImpSugerCpa());
        conditions += " AND INT_INTERMEDIARIO = ?";
        pkValues.add(this.getIntIntermediario());
        conditions += " AND CTO_NUM_CONTRATO = ?";
        pkValues.add(this.getCtoNumContrato());
        conditions += " AND OPC_SECUENCIAL = ?";
        pkValues.add(this.getOpcSecuencial());
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
        String sql = "INSERT INTO OPE_COMP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SUV_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getSuvContratoInter());

        fields += ", SUV_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getSuvNomPizarra());

        fields += ", SUV_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getSuvSerieEmision());

        fields += ", SUV_IMP_TIT_VTA";
        fieldValues += ", ?";
        values.add(this.getSuvImpTitVta());

        fields += ", SUC_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getSucNumCorte());

        fields += ", SUC_NUM_ENTID_FIN";
        fieldValues += ", ?";
        values.add(this.getSucNumEntidFin());

        fields += ", SUC_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getSucContratoInter());

        fields += ", SUC_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getSucNomPizarra());

        fields += ", SUC_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getSucSerieEmision());

        fields += ", SUC_IMP_SUGER_CPA";
        fieldValues += ", ?";
        values.add(this.getSucImpSugerCpa());

        fields += ", INT_INTERMEDIARIO";
        fieldValues += ", ?";
        values.add(this.getIntIntermediario());

        fields += ", CTO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNumContrato());

        fields += ", OPC_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getOpcSecuencial());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OPE_COMP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SUV_CONTRATO_INTER = ?";
        values.add(this.getSuvContratoInter());
        conditions += " AND SUV_NOM_PIZARRA = ?";
        values.add(this.getSuvNomPizarra());
        conditions += " AND SUV_SERIE_EMISION = ?";
        values.add(this.getSuvSerieEmision());
        conditions += " AND SUC_NUM_CORTE = ?";
        values.add(this.getSucNumCorte());
        conditions += " AND SUC_NUM_ENTID_FIN = ?";
        values.add(this.getSucNumEntidFin());
        conditions += " AND SUC_CONTRATO_INTER = ?";
        values.add(this.getSucContratoInter());
        conditions += " AND SUC_NOM_PIZARRA = ?";
        values.add(this.getSucNomPizarra());
        conditions += " AND SUC_SERIE_EMISION = ?";
        values.add(this.getSucSerieEmision());
        conditions += " AND INT_INTERMEDIARIO = ?";
        values.add(this.getIntIntermediario());
        conditions += " AND CTO_NUM_CONTRATO = ?";
        values.add(this.getCtoNumContrato());
        conditions += " AND OPC_SECUENCIAL = ?";
        values.add(this.getOpcSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        OpeComp instance = (OpeComp) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSuvContratoInter().equals(instance.getSuvContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNomPizarra().equals(instance.getSuvNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getSuvSerieEmision().equals(instance.getSuvSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getSuvImpTitVta().equals(instance.getSuvImpTitVta()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumCorte().equals(instance.getSucNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumEntidFin().equals(instance.getSucNumEntidFin()))
            equalObjects = false;
        if (equalObjects && !this.getSucContratoInter().equals(instance.getSucContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getSucNomPizarra().equals(instance.getSucNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getSucSerieEmision().equals(instance.getSucSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getSucImpSugerCpa().equals(instance.getSucImpSugerCpa()))
            equalObjects = false;
        if (equalObjects && !this.getIntIntermediario().equals(instance.getIntIntermediario()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumContrato().equals(instance.getCtoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getOpcSecuencial().equals(instance.getOpcSecuencial()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        OpeComp result = new OpeComp();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSuvContratoInter((BigDecimal) objectData.getData("SUV_CONTRATO_INTER"));
        result.setSuvNomPizarra((String) objectData.getData("SUV_NOM_PIZARRA"));
        result.setSuvSerieEmision((String) objectData.getData("SUV_SERIE_EMISION"));
        result.setSuvImpTitVta((BigDecimal) objectData.getData("SUV_IMP_TIT_VTA"));
        result.setSucNumCorte((BigDecimal) objectData.getData("SUC_NUM_CORTE"));
        result.setSucNumEntidFin((BigDecimal) objectData.getData("SUC_NUM_ENTID_FIN"));
        result.setSucContratoInter((BigDecimal) objectData.getData("SUC_CONTRATO_INTER"));
        result.setSucNomPizarra((String) objectData.getData("SUC_NOM_PIZARRA"));
        result.setSucSerieEmision((String) objectData.getData("SUC_SERIE_EMISION"));
        result.setSucImpSugerCpa((BigDecimal) objectData.getData("SUC_IMP_SUGER_CPA"));
        result.setIntIntermediario((String) objectData.getData("INT_INTERMEDIARIO"));
        result.setCtoNumContrato((BigDecimal) objectData.getData("CTO_NUM_CONTRATO"));
        result.setOpcSecuencial((BigDecimal) objectData.getData("OPC_SECUENCIAL"));

        return result;

    }

}
