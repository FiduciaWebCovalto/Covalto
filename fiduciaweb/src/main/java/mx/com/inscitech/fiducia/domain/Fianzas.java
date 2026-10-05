package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FIANZAS_PK", columns = { "FIA_NUM_CONTRATO", "FIA_ID_CTO_DERIVA", "FIA_ID_FIANZA" }, sequences = { "MANUAL" })
public class Fianzas extends DomainObject {

    BigDecimal fiaNumContrato = null;
    String fiaIdCtoDeriva = null;
    String fiaIdFianza = null;
    String fiaCveFianza = null;
    String fiaNomAfianza = null;
    String fiaObjetoFianza = null;
    BigDecimal fiaImpFianza = null;
    BigDecimal fiaAnoIniFianza = null;
    BigDecimal fiaMesIniFianza = null;
    BigDecimal fiaDiaIniFianza = null;
    BigDecimal fiaAnoFinFianza = null;
    BigDecimal fiaMesFinFianza = null;
    BigDecimal fiaDiaFinFianza = null;
    BigDecimal fiaAnoAltaReg = null;
    BigDecimal fiaMesAltaReg = null;
    BigDecimal fiaDiaAltaReg = null;
    BigDecimal fiaAnoUltMod = null;
    BigDecimal fiaMesUltMod = null;
    BigDecimal fiaDiaUltMod = null;
    String fiaCveStFianzas = null;

    public Fianzas() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFiaNumContrato(BigDecimal fiaNumContrato) {
        this.fiaNumContrato = fiaNumContrato;
    }

    public BigDecimal getFiaNumContrato() {
        return this.fiaNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFiaIdCtoDeriva(String fiaIdCtoDeriva) {
        this.fiaIdCtoDeriva = fiaIdCtoDeriva;
    }

    public String getFiaIdCtoDeriva() {
        return this.fiaIdCtoDeriva;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFiaIdFianza(String fiaIdFianza) {
        this.fiaIdFianza = fiaIdFianza;
    }

    public String getFiaIdFianza() {
        return this.fiaIdFianza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFiaCveFianza(String fiaCveFianza) {
        this.fiaCveFianza = fiaCveFianza;
    }

    public String getFiaCveFianza() {
        return this.fiaCveFianza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFiaNomAfianza(String fiaNomAfianza) {
        this.fiaNomAfianza = fiaNomAfianza;
    }

    public String getFiaNomAfianza() {
        return this.fiaNomAfianza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFiaObjetoFianza(String fiaObjetoFianza) {
        this.fiaObjetoFianza = fiaObjetoFianza;
    }

    public String getFiaObjetoFianza() {
        return this.fiaObjetoFianza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFiaImpFianza(BigDecimal fiaImpFianza) {
        this.fiaImpFianza = fiaImpFianza;
    }

    public BigDecimal getFiaImpFianza() {
        return this.fiaImpFianza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFiaAnoIniFianza(BigDecimal fiaAnoIniFianza) {
        this.fiaAnoIniFianza = fiaAnoIniFianza;
    }

    public BigDecimal getFiaAnoIniFianza() {
        return this.fiaAnoIniFianza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFiaMesIniFianza(BigDecimal fiaMesIniFianza) {
        this.fiaMesIniFianza = fiaMesIniFianza;
    }

    public BigDecimal getFiaMesIniFianza() {
        return this.fiaMesIniFianza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFiaDiaIniFianza(BigDecimal fiaDiaIniFianza) {
        this.fiaDiaIniFianza = fiaDiaIniFianza;
    }

    public BigDecimal getFiaDiaIniFianza() {
        return this.fiaDiaIniFianza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFiaAnoFinFianza(BigDecimal fiaAnoFinFianza) {
        this.fiaAnoFinFianza = fiaAnoFinFianza;
    }

    public BigDecimal getFiaAnoFinFianza() {
        return this.fiaAnoFinFianza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFiaMesFinFianza(BigDecimal fiaMesFinFianza) {
        this.fiaMesFinFianza = fiaMesFinFianza;
    }

    public BigDecimal getFiaMesFinFianza() {
        return this.fiaMesFinFianza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFiaDiaFinFianza(BigDecimal fiaDiaFinFianza) {
        this.fiaDiaFinFianza = fiaDiaFinFianza;
    }

    public BigDecimal getFiaDiaFinFianza() {
        return this.fiaDiaFinFianza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFiaAnoAltaReg(BigDecimal fiaAnoAltaReg) {
        this.fiaAnoAltaReg = fiaAnoAltaReg;
    }

    public BigDecimal getFiaAnoAltaReg() {
        return this.fiaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFiaMesAltaReg(BigDecimal fiaMesAltaReg) {
        this.fiaMesAltaReg = fiaMesAltaReg;
    }

    public BigDecimal getFiaMesAltaReg() {
        return this.fiaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFiaDiaAltaReg(BigDecimal fiaDiaAltaReg) {
        this.fiaDiaAltaReg = fiaDiaAltaReg;
    }

    public BigDecimal getFiaDiaAltaReg() {
        return this.fiaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFiaAnoUltMod(BigDecimal fiaAnoUltMod) {
        this.fiaAnoUltMod = fiaAnoUltMod;
    }

    public BigDecimal getFiaAnoUltMod() {
        return this.fiaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFiaMesUltMod(BigDecimal fiaMesUltMod) {
        this.fiaMesUltMod = fiaMesUltMod;
    }

    public BigDecimal getFiaMesUltMod() {
        return this.fiaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFiaDiaUltMod(BigDecimal fiaDiaUltMod) {
        this.fiaDiaUltMod = fiaDiaUltMod;
    }

    public BigDecimal getFiaDiaUltMod() {
        return this.fiaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFiaCveStFianzas(String fiaCveStFianzas) {
        this.fiaCveStFianzas = fiaCveStFianzas;
    }

    public String getFiaCveStFianzas() {
        return this.fiaCveStFianzas;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FIANZAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFiaNumContrato() != null && this.getFiaNumContrato().longValue() == -999) {
            conditions += " AND FIA_NUM_CONTRATO IS NULL";
        } else if (this.getFiaNumContrato() != null) {
            conditions += " AND FIA_NUM_CONTRATO = ?";
            values.add(this.getFiaNumContrato());
        }

        if (this.getFiaIdCtoDeriva() != null && "null".equals(this.getFiaIdCtoDeriva())) {
            conditions += " AND FIA_ID_CTO_DERIVA IS NULL";
        } else if (this.getFiaIdCtoDeriva() != null) {
            conditions += " AND FIA_ID_CTO_DERIVA = ?";
            values.add(this.getFiaIdCtoDeriva());
        }

        if (this.getFiaIdFianza() != null && "null".equals(this.getFiaIdFianza())) {
            conditions += " AND FIA_ID_FIANZA IS NULL";
        } else if (this.getFiaIdFianza() != null) {
            conditions += " AND FIA_ID_FIANZA = ?";
            values.add(this.getFiaIdFianza());
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
        String sql = "SELECT * FROM FIANZAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFiaNumContrato() != null && this.getFiaNumContrato().longValue() == -999) {
            conditions += " AND FIA_NUM_CONTRATO IS NULL";
        } else if (this.getFiaNumContrato() != null) {
            conditions += " AND FIA_NUM_CONTRATO = ?";
            values.add(this.getFiaNumContrato());
        }

        if (this.getFiaIdCtoDeriva() != null && "null".equals(this.getFiaIdCtoDeriva())) {
            conditions += " AND FIA_ID_CTO_DERIVA IS NULL";
        } else if (this.getFiaIdCtoDeriva() != null) {
            conditions += " AND FIA_ID_CTO_DERIVA = ?";
            values.add(this.getFiaIdCtoDeriva());
        }

        if (this.getFiaIdFianza() != null && "null".equals(this.getFiaIdFianza())) {
            conditions += " AND FIA_ID_FIANZA IS NULL";
        } else if (this.getFiaIdFianza() != null) {
            conditions += " AND FIA_ID_FIANZA = ?";
            values.add(this.getFiaIdFianza());
        }

        if (this.getFiaCveFianza() != null && "null".equals(this.getFiaCveFianza())) {
            conditions += " AND FIA_CVE_FIANZA IS NULL";
        } else if (this.getFiaCveFianza() != null) {
            conditions += " AND FIA_CVE_FIANZA = ?";
            values.add(this.getFiaCveFianza());
        }

        if (this.getFiaNomAfianza() != null && "null".equals(this.getFiaNomAfianza())) {
            conditions += " AND FIA_NOM_AFIANZA IS NULL";
        } else if (this.getFiaNomAfianza() != null) {
            conditions += " AND FIA_NOM_AFIANZA = ?";
            values.add(this.getFiaNomAfianza());
        }

        if (this.getFiaObjetoFianza() != null && "null".equals(this.getFiaObjetoFianza())) {
            conditions += " AND FIA_OBJETO_FIANZA IS NULL";
        } else if (this.getFiaObjetoFianza() != null) {
            conditions += " AND FIA_OBJETO_FIANZA = ?";
            values.add(this.getFiaObjetoFianza());
        }

        if (this.getFiaImpFianza() != null && this.getFiaImpFianza().longValue() == -999) {
            conditions += " AND FIA_IMP_FIANZA IS NULL";
        } else if (this.getFiaImpFianza() != null) {
            conditions += " AND FIA_IMP_FIANZA = ?";
            values.add(this.getFiaImpFianza());
        }

        if (this.getFiaAnoIniFianza() != null && this.getFiaAnoIniFianza().longValue() == -999) {
            conditions += " AND FIA_ANO_INI_FIANZA IS NULL";
        } else if (this.getFiaAnoIniFianza() != null) {
            conditions += " AND FIA_ANO_INI_FIANZA = ?";
            values.add(this.getFiaAnoIniFianza());
        }

        if (this.getFiaMesIniFianza() != null && this.getFiaMesIniFianza().longValue() == -999) {
            conditions += " AND FIA_MES_INI_FIANZA IS NULL";
        } else if (this.getFiaMesIniFianza() != null) {
            conditions += " AND FIA_MES_INI_FIANZA = ?";
            values.add(this.getFiaMesIniFianza());
        }

        if (this.getFiaDiaIniFianza() != null && this.getFiaDiaIniFianza().longValue() == -999) {
            conditions += " AND FIA_DIA_INI_FIANZA IS NULL";
        } else if (this.getFiaDiaIniFianza() != null) {
            conditions += " AND FIA_DIA_INI_FIANZA = ?";
            values.add(this.getFiaDiaIniFianza());
        }

        if (this.getFiaAnoFinFianza() != null && this.getFiaAnoFinFianza().longValue() == -999) {
            conditions += " AND FIA_ANO_FIN_FIANZA IS NULL";
        } else if (this.getFiaAnoFinFianza() != null) {
            conditions += " AND FIA_ANO_FIN_FIANZA = ?";
            values.add(this.getFiaAnoFinFianza());
        }

        if (this.getFiaMesFinFianza() != null && this.getFiaMesFinFianza().longValue() == -999) {
            conditions += " AND FIA_MES_FIN_FIANZA IS NULL";
        } else if (this.getFiaMesFinFianza() != null) {
            conditions += " AND FIA_MES_FIN_FIANZA = ?";
            values.add(this.getFiaMesFinFianza());
        }

        if (this.getFiaDiaFinFianza() != null && this.getFiaDiaFinFianza().longValue() == -999) {
            conditions += " AND FIA_DIA_FIN_FIANZA IS NULL";
        } else if (this.getFiaDiaFinFianza() != null) {
            conditions += " AND FIA_DIA_FIN_FIANZA = ?";
            values.add(this.getFiaDiaFinFianza());
        }

        if (this.getFiaAnoAltaReg() != null && this.getFiaAnoAltaReg().longValue() == -999) {
            conditions += " AND FIA_ANO_ALTA_REG IS NULL";
        } else if (this.getFiaAnoAltaReg() != null) {
            conditions += " AND FIA_ANO_ALTA_REG = ?";
            values.add(this.getFiaAnoAltaReg());
        }

        if (this.getFiaMesAltaReg() != null && this.getFiaMesAltaReg().longValue() == -999) {
            conditions += " AND FIA_MES_ALTA_REG IS NULL";
        } else if (this.getFiaMesAltaReg() != null) {
            conditions += " AND FIA_MES_ALTA_REG = ?";
            values.add(this.getFiaMesAltaReg());
        }

        if (this.getFiaDiaAltaReg() != null && this.getFiaDiaAltaReg().longValue() == -999) {
            conditions += " AND FIA_DIA_ALTA_REG IS NULL";
        } else if (this.getFiaDiaAltaReg() != null) {
            conditions += " AND FIA_DIA_ALTA_REG = ?";
            values.add(this.getFiaDiaAltaReg());
        }

        if (this.getFiaAnoUltMod() != null && this.getFiaAnoUltMod().longValue() == -999) {
            conditions += " AND FIA_ANO_ULT_MOD IS NULL";
        } else if (this.getFiaAnoUltMod() != null) {
            conditions += " AND FIA_ANO_ULT_MOD = ?";
            values.add(this.getFiaAnoUltMod());
        }

        if (this.getFiaMesUltMod() != null && this.getFiaMesUltMod().longValue() == -999) {
            conditions += " AND FIA_MES_ULT_MOD IS NULL";
        } else if (this.getFiaMesUltMod() != null) {
            conditions += " AND FIA_MES_ULT_MOD = ?";
            values.add(this.getFiaMesUltMod());
        }

        if (this.getFiaDiaUltMod() != null && this.getFiaDiaUltMod().longValue() == -999) {
            conditions += " AND FIA_DIA_ULT_MOD IS NULL";
        } else if (this.getFiaDiaUltMod() != null) {
            conditions += " AND FIA_DIA_ULT_MOD = ?";
            values.add(this.getFiaDiaUltMod());
        }

        if (this.getFiaCveStFianzas() != null && "null".equals(this.getFiaCveStFianzas())) {
            conditions += " AND FIA_CVE_ST_FIANZAS IS NULL";
        } else if (this.getFiaCveStFianzas() != null) {
            conditions += " AND FIA_CVE_ST_FIANZAS = ?";
            values.add(this.getFiaCveStFianzas());
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
        String sql = "UPDATE FIANZAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FIA_NUM_CONTRATO = ?";
        pkValues.add(this.getFiaNumContrato());
        conditions += " AND FIA_ID_CTO_DERIVA = ?";
        pkValues.add(this.getFiaIdCtoDeriva());
        conditions += " AND FIA_ID_FIANZA = ?";
        pkValues.add(this.getFiaIdFianza());
        fields += " FIA_CVE_FIANZA = ?, ";
        values.add(this.getFiaCveFianza());
        fields += " FIA_NOM_AFIANZA = ?, ";
        values.add(this.getFiaNomAfianza());
        fields += " FIA_OBJETO_FIANZA = ?, ";
        values.add(this.getFiaObjetoFianza());
        fields += " FIA_IMP_FIANZA = ?, ";
        values.add(this.getFiaImpFianza());
        fields += " FIA_ANO_INI_FIANZA = ?, ";
        values.add(this.getFiaAnoIniFianza());
        fields += " FIA_MES_INI_FIANZA = ?, ";
        values.add(this.getFiaMesIniFianza());
        fields += " FIA_DIA_INI_FIANZA = ?, ";
        values.add(this.getFiaDiaIniFianza());
        fields += " FIA_ANO_FIN_FIANZA = ?, ";
        values.add(this.getFiaAnoFinFianza());
        fields += " FIA_MES_FIN_FIANZA = ?, ";
        values.add(this.getFiaMesFinFianza());
        fields += " FIA_DIA_FIN_FIANZA = ?, ";
        values.add(this.getFiaDiaFinFianza());
        fields += " FIA_ANO_ALTA_REG = ?, ";
        values.add(this.getFiaAnoAltaReg());
        fields += " FIA_MES_ALTA_REG = ?, ";
        values.add(this.getFiaMesAltaReg());
        fields += " FIA_DIA_ALTA_REG = ?, ";
        values.add(this.getFiaDiaAltaReg());
        fields += " FIA_ANO_ULT_MOD = ?, ";
        values.add(this.getFiaAnoUltMod());
        fields += " FIA_MES_ULT_MOD = ?, ";
        values.add(this.getFiaMesUltMod());
        fields += " FIA_DIA_ULT_MOD = ?, ";
        values.add(this.getFiaDiaUltMod());
        fields += " FIA_CVE_ST_FIANZAS = ?, ";
        values.add(this.getFiaCveStFianzas());
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
        String sql = "INSERT INTO FIANZAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FIA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFiaNumContrato());

        fields += ", FIA_ID_CTO_DERIVA";
        fieldValues += ", ?";
        values.add(this.getFiaIdCtoDeriva());

        fields += ", FIA_ID_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaIdFianza());

        fields += ", FIA_CVE_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaCveFianza());

        fields += ", FIA_NOM_AFIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaNomAfianza());

        fields += ", FIA_OBJETO_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaObjetoFianza());

        fields += ", FIA_IMP_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaImpFianza());

        fields += ", FIA_ANO_INI_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaAnoIniFianza());

        fields += ", FIA_MES_INI_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaMesIniFianza());

        fields += ", FIA_DIA_INI_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaDiaIniFianza());

        fields += ", FIA_ANO_FIN_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaAnoFinFianza());

        fields += ", FIA_MES_FIN_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaMesFinFianza());

        fields += ", FIA_DIA_FIN_FIANZA";
        fieldValues += ", ?";
        values.add(this.getFiaDiaFinFianza());

        fields += ", FIA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFiaAnoAltaReg());

        fields += ", FIA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFiaMesAltaReg());

        fields += ", FIA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFiaDiaAltaReg());

        fields += ", FIA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFiaAnoUltMod());

        fields += ", FIA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFiaMesUltMod());

        fields += ", FIA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFiaDiaUltMod());

        fields += ", FIA_CVE_ST_FIANZAS";
        fieldValues += ", ?";
        values.add(this.getFiaCveStFianzas());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FIANZAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FIA_NUM_CONTRATO = ?";
        values.add(this.getFiaNumContrato());
        conditions += " AND FIA_ID_CTO_DERIVA = ?";
        values.add(this.getFiaIdCtoDeriva());
        conditions += " AND FIA_ID_FIANZA = ?";
        values.add(this.getFiaIdFianza());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Fianzas instance = (Fianzas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFiaNumContrato().equals(instance.getFiaNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFiaIdCtoDeriva().equals(instance.getFiaIdCtoDeriva()))
            equalObjects = false;
        if (equalObjects && !this.getFiaIdFianza().equals(instance.getFiaIdFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaCveFianza().equals(instance.getFiaCveFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaNomAfianza().equals(instance.getFiaNomAfianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaObjetoFianza().equals(instance.getFiaObjetoFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaImpFianza().equals(instance.getFiaImpFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaAnoIniFianza().equals(instance.getFiaAnoIniFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaMesIniFianza().equals(instance.getFiaMesIniFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaDiaIniFianza().equals(instance.getFiaDiaIniFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaAnoFinFianza().equals(instance.getFiaAnoFinFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaMesFinFianza().equals(instance.getFiaMesFinFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaDiaFinFianza().equals(instance.getFiaDiaFinFianza()))
            equalObjects = false;
        if (equalObjects && !this.getFiaAnoAltaReg().equals(instance.getFiaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFiaMesAltaReg().equals(instance.getFiaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFiaDiaAltaReg().equals(instance.getFiaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFiaAnoUltMod().equals(instance.getFiaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFiaMesUltMod().equals(instance.getFiaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFiaDiaUltMod().equals(instance.getFiaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFiaCveStFianzas().equals(instance.getFiaCveStFianzas()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Fianzas result = new Fianzas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFiaNumContrato((BigDecimal) objectData.getData("FIA_NUM_CONTRATO"));
        result.setFiaIdCtoDeriva((String) objectData.getData("FIA_ID_CTO_DERIVA"));
        result.setFiaIdFianza((String) objectData.getData("FIA_ID_FIANZA"));
        result.setFiaCveFianza((String) objectData.getData("FIA_CVE_FIANZA"));
        result.setFiaNomAfianza((String) objectData.getData("FIA_NOM_AFIANZA"));
        result.setFiaObjetoFianza((String) objectData.getData("FIA_OBJETO_FIANZA"));
        result.setFiaImpFianza((BigDecimal) objectData.getData("FIA_IMP_FIANZA"));
        result.setFiaAnoIniFianza((BigDecimal) objectData.getData("FIA_ANO_INI_FIANZA"));
        result.setFiaMesIniFianza((BigDecimal) objectData.getData("FIA_MES_INI_FIANZA"));
        result.setFiaDiaIniFianza((BigDecimal) objectData.getData("FIA_DIA_INI_FIANZA"));
        result.setFiaAnoFinFianza((BigDecimal) objectData.getData("FIA_ANO_FIN_FIANZA"));
        result.setFiaMesFinFianza((BigDecimal) objectData.getData("FIA_MES_FIN_FIANZA"));
        result.setFiaDiaFinFianza((BigDecimal) objectData.getData("FIA_DIA_FIN_FIANZA"));
        result.setFiaAnoAltaReg((BigDecimal) objectData.getData("FIA_ANO_ALTA_REG"));
        result.setFiaMesAltaReg((BigDecimal) objectData.getData("FIA_MES_ALTA_REG"));
        result.setFiaDiaAltaReg((BigDecimal) objectData.getData("FIA_DIA_ALTA_REG"));
        result.setFiaAnoUltMod((BigDecimal) objectData.getData("FIA_ANO_ULT_MOD"));
        result.setFiaMesUltMod((BigDecimal) objectData.getData("FIA_MES_ULT_MOD"));
        result.setFiaDiaUltMod((BigDecimal) objectData.getData("FIA_DIA_ULT_MOD"));
        result.setFiaCveStFianzas((String) objectData.getData("FIA_CVE_ST_FIANZAS"));

        return result;

    }

}
