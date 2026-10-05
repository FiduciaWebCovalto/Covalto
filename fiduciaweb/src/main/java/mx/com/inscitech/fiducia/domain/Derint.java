package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DERINT_PK",
            columns =
            { "DEI_CVE_TIPO_DERE", "DEI_NUM_CONTRATO", "DEI_SUB_CONTRATO", "DEI_NOM_PIZARRA", "DEI_NUM_SER_EMIS", "DEI_NUM_CUPON_VIG", "DEI_ENTIDAD_FIN", "DEI_CONTRATO_INTER"
    }, sequences = { "MANUAL" })
public class Derint extends DomainObject {

    String deiCveTipoDere = null;
    BigDecimal deiNumContrato = null;
    BigDecimal deiSubContrato = null;
    String deiNomPizarra = null;
    String deiNumSerEmis = null;
    BigDecimal deiNumCuponVig = null;
    BigDecimal deiEntidadFin = null;
    BigDecimal deiContratoInter = null;
    BigDecimal deiPosicActual = null;
    BigDecimal deiValorNominal = null;
    BigDecimal deiValores = null;
    BigDecimal deiImporte = null;
    BigDecimal deiAnoUltMod = null;
    BigDecimal deiMesUltMod = null;
    BigDecimal deiDiaUltMod = null;
    String deiCveStDerint = null;

    public Derint() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDeiCveTipoDere(String deiCveTipoDere) {
        this.deiCveTipoDere = deiCveTipoDere;
    }

    public String getDeiCveTipoDere() {
        return this.deiCveTipoDere;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDeiNumContrato(BigDecimal deiNumContrato) {
        this.deiNumContrato = deiNumContrato;
    }

    public BigDecimal getDeiNumContrato() {
        return this.deiNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDeiSubContrato(BigDecimal deiSubContrato) {
        this.deiSubContrato = deiSubContrato;
    }

    public BigDecimal getDeiSubContrato() {
        return this.deiSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDeiNomPizarra(String deiNomPizarra) {
        this.deiNomPizarra = deiNomPizarra;
    }

    public String getDeiNomPizarra() {
        return this.deiNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDeiNumSerEmis(String deiNumSerEmis) {
        this.deiNumSerEmis = deiNumSerEmis;
    }

    public String getDeiNumSerEmis() {
        return this.deiNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDeiNumCuponVig(BigDecimal deiNumCuponVig) {
        this.deiNumCuponVig = deiNumCuponVig;
    }

    public BigDecimal getDeiNumCuponVig() {
        return this.deiNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDeiEntidadFin(BigDecimal deiEntidadFin) {
        this.deiEntidadFin = deiEntidadFin;
    }

    public BigDecimal getDeiEntidadFin() {
        return this.deiEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDeiContratoInter(BigDecimal deiContratoInter) {
        this.deiContratoInter = deiContratoInter;
    }

    public BigDecimal getDeiContratoInter() {
        return this.deiContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDeiPosicActual(BigDecimal deiPosicActual) {
        this.deiPosicActual = deiPosicActual;
    }

    public BigDecimal getDeiPosicActual() {
        return this.deiPosicActual;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDeiValorNominal(BigDecimal deiValorNominal) {
        this.deiValorNominal = deiValorNominal;
    }

    public BigDecimal getDeiValorNominal() {
        return this.deiValorNominal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDeiValores(BigDecimal deiValores) {
        this.deiValores = deiValores;
    }

    public BigDecimal getDeiValores() {
        return this.deiValores;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDeiImporte(BigDecimal deiImporte) {
        this.deiImporte = deiImporte;
    }

    public BigDecimal getDeiImporte() {
        return this.deiImporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDeiAnoUltMod(BigDecimal deiAnoUltMod) {
        this.deiAnoUltMod = deiAnoUltMod;
    }

    public BigDecimal getDeiAnoUltMod() {
        return this.deiAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDeiMesUltMod(BigDecimal deiMesUltMod) {
        this.deiMesUltMod = deiMesUltMod;
    }

    public BigDecimal getDeiMesUltMod() {
        return this.deiMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDeiDiaUltMod(BigDecimal deiDiaUltMod) {
        this.deiDiaUltMod = deiDiaUltMod;
    }

    public BigDecimal getDeiDiaUltMod() {
        return this.deiDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDeiCveStDerint(String deiCveStDerint) {
        this.deiCveStDerint = deiCveStDerint;
    }

    public String getDeiCveStDerint() {
        return this.deiCveStDerint;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DERINT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDeiCveTipoDere() != null && "null".equals(this.getDeiCveTipoDere())) {
            conditions += " AND DEI_CVE_TIPO_DERE IS NULL";
        } else if (this.getDeiCveTipoDere() != null) {
            conditions += " AND DEI_CVE_TIPO_DERE = ?";
            values.add(this.getDeiCveTipoDere());
        }

        if (this.getDeiNumContrato() != null && this.getDeiNumContrato().longValue() == -999) {
            conditions += " AND DEI_NUM_CONTRATO IS NULL";
        } else if (this.getDeiNumContrato() != null) {
            conditions += " AND DEI_NUM_CONTRATO = ?";
            values.add(this.getDeiNumContrato());
        }

        if (this.getDeiSubContrato() != null && this.getDeiSubContrato().longValue() == -999) {
            conditions += " AND DEI_SUB_CONTRATO IS NULL";
        } else if (this.getDeiSubContrato() != null) {
            conditions += " AND DEI_SUB_CONTRATO = ?";
            values.add(this.getDeiSubContrato());
        }

        if (this.getDeiNomPizarra() != null && "null".equals(this.getDeiNomPizarra())) {
            conditions += " AND DEI_NOM_PIZARRA IS NULL";
        } else if (this.getDeiNomPizarra() != null) {
            conditions += " AND DEI_NOM_PIZARRA = ?";
            values.add(this.getDeiNomPizarra());
        }

        if (this.getDeiNumSerEmis() != null && "null".equals(this.getDeiNumSerEmis())) {
            conditions += " AND DEI_NUM_SER_EMIS IS NULL";
        } else if (this.getDeiNumSerEmis() != null) {
            conditions += " AND DEI_NUM_SER_EMIS = ?";
            values.add(this.getDeiNumSerEmis());
        }

        if (this.getDeiNumCuponVig() != null && this.getDeiNumCuponVig().longValue() == -999) {
            conditions += " AND DEI_NUM_CUPON_VIG IS NULL";
        } else if (this.getDeiNumCuponVig() != null) {
            conditions += " AND DEI_NUM_CUPON_VIG = ?";
            values.add(this.getDeiNumCuponVig());
        }

        if (this.getDeiEntidadFin() != null && this.getDeiEntidadFin().longValue() == -999) {
            conditions += " AND DEI_ENTIDAD_FIN IS NULL";
        } else if (this.getDeiEntidadFin() != null) {
            conditions += " AND DEI_ENTIDAD_FIN = ?";
            values.add(this.getDeiEntidadFin());
        }

        if (this.getDeiContratoInter() != null && this.getDeiContratoInter().longValue() == -999) {
            conditions += " AND DEI_CONTRATO_INTER IS NULL";
        } else if (this.getDeiContratoInter() != null) {
            conditions += " AND DEI_CONTRATO_INTER = ?";
            values.add(this.getDeiContratoInter());
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
        String sql = "SELECT * FROM DERINT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDeiCveTipoDere() != null && "null".equals(this.getDeiCveTipoDere())) {
            conditions += " AND DEI_CVE_TIPO_DERE IS NULL";
        } else if (this.getDeiCveTipoDere() != null) {
            conditions += " AND DEI_CVE_TIPO_DERE = ?";
            values.add(this.getDeiCveTipoDere());
        }

        if (this.getDeiNumContrato() != null && this.getDeiNumContrato().longValue() == -999) {
            conditions += " AND DEI_NUM_CONTRATO IS NULL";
        } else if (this.getDeiNumContrato() != null) {
            conditions += " AND DEI_NUM_CONTRATO = ?";
            values.add(this.getDeiNumContrato());
        }

        if (this.getDeiSubContrato() != null && this.getDeiSubContrato().longValue() == -999) {
            conditions += " AND DEI_SUB_CONTRATO IS NULL";
        } else if (this.getDeiSubContrato() != null) {
            conditions += " AND DEI_SUB_CONTRATO = ?";
            values.add(this.getDeiSubContrato());
        }

        if (this.getDeiNomPizarra() != null && "null".equals(this.getDeiNomPizarra())) {
            conditions += " AND DEI_NOM_PIZARRA IS NULL";
        } else if (this.getDeiNomPizarra() != null) {
            conditions += " AND DEI_NOM_PIZARRA = ?";
            values.add(this.getDeiNomPizarra());
        }

        if (this.getDeiNumSerEmis() != null && "null".equals(this.getDeiNumSerEmis())) {
            conditions += " AND DEI_NUM_SER_EMIS IS NULL";
        } else if (this.getDeiNumSerEmis() != null) {
            conditions += " AND DEI_NUM_SER_EMIS = ?";
            values.add(this.getDeiNumSerEmis());
        }

        if (this.getDeiNumCuponVig() != null && this.getDeiNumCuponVig().longValue() == -999) {
            conditions += " AND DEI_NUM_CUPON_VIG IS NULL";
        } else if (this.getDeiNumCuponVig() != null) {
            conditions += " AND DEI_NUM_CUPON_VIG = ?";
            values.add(this.getDeiNumCuponVig());
        }

        if (this.getDeiEntidadFin() != null && this.getDeiEntidadFin().longValue() == -999) {
            conditions += " AND DEI_ENTIDAD_FIN IS NULL";
        } else if (this.getDeiEntidadFin() != null) {
            conditions += " AND DEI_ENTIDAD_FIN = ?";
            values.add(this.getDeiEntidadFin());
        }

        if (this.getDeiContratoInter() != null && this.getDeiContratoInter().longValue() == -999) {
            conditions += " AND DEI_CONTRATO_INTER IS NULL";
        } else if (this.getDeiContratoInter() != null) {
            conditions += " AND DEI_CONTRATO_INTER = ?";
            values.add(this.getDeiContratoInter());
        }

        if (this.getDeiPosicActual() != null && this.getDeiPosicActual().longValue() == -999) {
            conditions += " AND DEI_POSIC_ACTUAL IS NULL";
        } else if (this.getDeiPosicActual() != null) {
            conditions += " AND DEI_POSIC_ACTUAL = ?";
            values.add(this.getDeiPosicActual());
        }

        if (this.getDeiValorNominal() != null && this.getDeiValorNominal().longValue() == -999) {
            conditions += " AND DEI_VALOR_NOMINAL IS NULL";
        } else if (this.getDeiValorNominal() != null) {
            conditions += " AND DEI_VALOR_NOMINAL = ?";
            values.add(this.getDeiValorNominal());
        }

        if (this.getDeiValores() != null && this.getDeiValores().longValue() == -999) {
            conditions += " AND DEI_VALORES IS NULL";
        } else if (this.getDeiValores() != null) {
            conditions += " AND DEI_VALORES = ?";
            values.add(this.getDeiValores());
        }

        if (this.getDeiImporte() != null && this.getDeiImporte().longValue() == -999) {
            conditions += " AND DEI_IMPORTE IS NULL";
        } else if (this.getDeiImporte() != null) {
            conditions += " AND DEI_IMPORTE = ?";
            values.add(this.getDeiImporte());
        }

        if (this.getDeiAnoUltMod() != null && this.getDeiAnoUltMod().longValue() == -999) {
            conditions += " AND DEI_ANO_ULT_MOD IS NULL";
        } else if (this.getDeiAnoUltMod() != null) {
            conditions += " AND DEI_ANO_ULT_MOD = ?";
            values.add(this.getDeiAnoUltMod());
        }

        if (this.getDeiMesUltMod() != null && this.getDeiMesUltMod().longValue() == -999) {
            conditions += " AND DEI_MES_ULT_MOD IS NULL";
        } else if (this.getDeiMesUltMod() != null) {
            conditions += " AND DEI_MES_ULT_MOD = ?";
            values.add(this.getDeiMesUltMod());
        }

        if (this.getDeiDiaUltMod() != null && this.getDeiDiaUltMod().longValue() == -999) {
            conditions += " AND DEI_DIA_ULT_MOD IS NULL";
        } else if (this.getDeiDiaUltMod() != null) {
            conditions += " AND DEI_DIA_ULT_MOD = ?";
            values.add(this.getDeiDiaUltMod());
        }

        if (this.getDeiCveStDerint() != null && "null".equals(this.getDeiCveStDerint())) {
            conditions += " AND DEI_CVE_ST_DERINT IS NULL";
        } else if (this.getDeiCveStDerint() != null) {
            conditions += " AND DEI_CVE_ST_DERINT = ?";
            values.add(this.getDeiCveStDerint());
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
        String sql = "UPDATE DERINT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DEI_CVE_TIPO_DERE = ?";
        pkValues.add(this.getDeiCveTipoDere());
        conditions += " AND DEI_NUM_CONTRATO = ?";
        pkValues.add(this.getDeiNumContrato());
        conditions += " AND DEI_SUB_CONTRATO = ?";
        pkValues.add(this.getDeiSubContrato());
        conditions += " AND DEI_NOM_PIZARRA = ?";
        pkValues.add(this.getDeiNomPizarra());
        conditions += " AND DEI_NUM_SER_EMIS = ?";
        pkValues.add(this.getDeiNumSerEmis());
        conditions += " AND DEI_NUM_CUPON_VIG = ?";
        pkValues.add(this.getDeiNumCuponVig());
        conditions += " AND DEI_ENTIDAD_FIN = ?";
        pkValues.add(this.getDeiEntidadFin());
        conditions += " AND DEI_CONTRATO_INTER = ?";
        pkValues.add(this.getDeiContratoInter());
        fields += " DEI_POSIC_ACTUAL = ?, ";
        values.add(this.getDeiPosicActual());
        fields += " DEI_VALOR_NOMINAL = ?, ";
        values.add(this.getDeiValorNominal());
        fields += " DEI_VALORES = ?, ";
        values.add(this.getDeiValores());
        fields += " DEI_IMPORTE = ?, ";
        values.add(this.getDeiImporte());
        fields += " DEI_ANO_ULT_MOD = ?, ";
        values.add(this.getDeiAnoUltMod());
        fields += " DEI_MES_ULT_MOD = ?, ";
        values.add(this.getDeiMesUltMod());
        fields += " DEI_DIA_ULT_MOD = ?, ";
        values.add(this.getDeiDiaUltMod());
        fields += " DEI_CVE_ST_DERINT = ?, ";
        values.add(this.getDeiCveStDerint());
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
        String sql = "INSERT INTO DERINT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DEI_CVE_TIPO_DERE";
        fieldValues += ", ?";
        values.add(this.getDeiCveTipoDere());

        fields += ", DEI_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDeiNumContrato());

        fields += ", DEI_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDeiSubContrato());

        fields += ", DEI_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getDeiNomPizarra());

        fields += ", DEI_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getDeiNumSerEmis());

        fields += ", DEI_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getDeiNumCuponVig());

        fields += ", DEI_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getDeiEntidadFin());

        fields += ", DEI_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getDeiContratoInter());

        fields += ", DEI_POSIC_ACTUAL";
        fieldValues += ", ?";
        values.add(this.getDeiPosicActual());

        fields += ", DEI_VALOR_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getDeiValorNominal());

        fields += ", DEI_VALORES";
        fieldValues += ", ?";
        values.add(this.getDeiValores());

        fields += ", DEI_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getDeiImporte());

        fields += ", DEI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDeiAnoUltMod());

        fields += ", DEI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDeiMesUltMod());

        fields += ", DEI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDeiDiaUltMod());

        fields += ", DEI_CVE_ST_DERINT";
        fieldValues += ", ?";
        values.add(this.getDeiCveStDerint());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DERINT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DEI_CVE_TIPO_DERE = ?";
        values.add(this.getDeiCveTipoDere());
        conditions += " AND DEI_NUM_CONTRATO = ?";
        values.add(this.getDeiNumContrato());
        conditions += " AND DEI_SUB_CONTRATO = ?";
        values.add(this.getDeiSubContrato());
        conditions += " AND DEI_NOM_PIZARRA = ?";
        values.add(this.getDeiNomPizarra());
        conditions += " AND DEI_NUM_SER_EMIS = ?";
        values.add(this.getDeiNumSerEmis());
        conditions += " AND DEI_NUM_CUPON_VIG = ?";
        values.add(this.getDeiNumCuponVig());
        conditions += " AND DEI_ENTIDAD_FIN = ?";
        values.add(this.getDeiEntidadFin());
        conditions += " AND DEI_CONTRATO_INTER = ?";
        values.add(this.getDeiContratoInter());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Derint instance = (Derint) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDeiCveTipoDere().equals(instance.getDeiCveTipoDere()))
            equalObjects = false;
        if (equalObjects && !this.getDeiNumContrato().equals(instance.getDeiNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDeiSubContrato().equals(instance.getDeiSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDeiNomPizarra().equals(instance.getDeiNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getDeiNumSerEmis().equals(instance.getDeiNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getDeiNumCuponVig().equals(instance.getDeiNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getDeiEntidadFin().equals(instance.getDeiEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getDeiContratoInter().equals(instance.getDeiContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getDeiPosicActual().equals(instance.getDeiPosicActual()))
            equalObjects = false;
        if (equalObjects && !this.getDeiValorNominal().equals(instance.getDeiValorNominal()))
            equalObjects = false;
        if (equalObjects && !this.getDeiValores().equals(instance.getDeiValores()))
            equalObjects = false;
        if (equalObjects && !this.getDeiImporte().equals(instance.getDeiImporte()))
            equalObjects = false;
        if (equalObjects && !this.getDeiAnoUltMod().equals(instance.getDeiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDeiMesUltMod().equals(instance.getDeiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDeiDiaUltMod().equals(instance.getDeiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDeiCveStDerint().equals(instance.getDeiCveStDerint()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Derint result = new Derint();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDeiCveTipoDere((String) objectData.getData("DEI_CVE_TIPO_DERE"));
        result.setDeiNumContrato((BigDecimal) objectData.getData("DEI_NUM_CONTRATO"));
        result.setDeiSubContrato((BigDecimal) objectData.getData("DEI_SUB_CONTRATO"));
        result.setDeiNomPizarra((String) objectData.getData("DEI_NOM_PIZARRA"));
        result.setDeiNumSerEmis((String) objectData.getData("DEI_NUM_SER_EMIS"));
        result.setDeiNumCuponVig((BigDecimal) objectData.getData("DEI_NUM_CUPON_VIG"));
        result.setDeiEntidadFin((BigDecimal) objectData.getData("DEI_ENTIDAD_FIN"));
        result.setDeiContratoInter((BigDecimal) objectData.getData("DEI_CONTRATO_INTER"));
        result.setDeiPosicActual((BigDecimal) objectData.getData("DEI_POSIC_ACTUAL"));
        result.setDeiValorNominal((BigDecimal) objectData.getData("DEI_VALOR_NOMINAL"));
        result.setDeiValores((BigDecimal) objectData.getData("DEI_VALORES"));
        result.setDeiImporte((BigDecimal) objectData.getData("DEI_IMPORTE"));
        result.setDeiAnoUltMod((BigDecimal) objectData.getData("DEI_ANO_ULT_MOD"));
        result.setDeiMesUltMod((BigDecimal) objectData.getData("DEI_MES_ULT_MOD"));
        result.setDeiDiaUltMod((BigDecimal) objectData.getData("DEI_DIA_ULT_MOD"));
        result.setDeiCveStDerint((String) objectData.getData("DEI_CVE_ST_DERINT"));

        return result;

    }

}
