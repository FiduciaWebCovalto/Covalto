package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESTACTIV_PK", columns = { "ESA_NUM_NIVEL1", "ESA_NUM_NIVEL2", "ESA_NUM_NIVEL3", "ESA_NUM_NIVEL4", "ESA_NUM_NIVEL5" }, sequences = { "MANUAL" })
public class Estactiv extends DomainObject {

    BigDecimal esaNumNivel1 = null;
    BigDecimal esaNumNivel2 = null;
    BigDecimal esaNumNivel3 = null;
    BigDecimal esaNumNivel4 = null;
    BigDecimal esaNumNivel5 = null;
    BigDecimal esaNumRama = null;
    BigDecimal esaNumSrama = null;
    BigDecimal esaNumMes = null;
    BigDecimal esaNumAno = null;
    String esaNomRama = null;
    BigDecimal esaNumContrato = null;
    BigDecimal esaImpContrato = null;
    BigDecimal esaAnoAltaReg = null;
    BigDecimal esaMesAltaReg = null;
    BigDecimal esaDiaAltaReg = null;
    BigDecimal esaAnoUltMod = null;
    BigDecimal esaMesUltMod = null;
    BigDecimal esaDiaUltMod = null;
    String esaCveStEstacti = null;

    public Estactiv() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumNivel1(BigDecimal esaNumNivel1) {
        this.esaNumNivel1 = esaNumNivel1;
    }

    public BigDecimal getEsaNumNivel1() {
        return this.esaNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumNivel2(BigDecimal esaNumNivel2) {
        this.esaNumNivel2 = esaNumNivel2;
    }

    public BigDecimal getEsaNumNivel2() {
        return this.esaNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumNivel3(BigDecimal esaNumNivel3) {
        this.esaNumNivel3 = esaNumNivel3;
    }

    public BigDecimal getEsaNumNivel3() {
        return this.esaNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumNivel4(BigDecimal esaNumNivel4) {
        this.esaNumNivel4 = esaNumNivel4;
    }

    public BigDecimal getEsaNumNivel4() {
        return this.esaNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumNivel5(BigDecimal esaNumNivel5) {
        this.esaNumNivel5 = esaNumNivel5;
    }

    public BigDecimal getEsaNumNivel5() {
        return this.esaNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumRama(BigDecimal esaNumRama) {
        this.esaNumRama = esaNumRama;
    }

    public BigDecimal getEsaNumRama() {
        return this.esaNumRama;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumSrama(BigDecimal esaNumSrama) {
        this.esaNumSrama = esaNumSrama;
    }

    public BigDecimal getEsaNumSrama() {
        return this.esaNumSrama;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumMes(BigDecimal esaNumMes) {
        this.esaNumMes = esaNumMes;
    }

    public BigDecimal getEsaNumMes() {
        return this.esaNumMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumAno(BigDecimal esaNumAno) {
        this.esaNumAno = esaNumAno;
    }

    public BigDecimal getEsaNumAno() {
        return this.esaNumAno;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEsaNomRama(String esaNomRama) {
        this.esaNomRama = esaNomRama;
    }

    public String getEsaNomRama() {
        return this.esaNomRama;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEsaNumContrato(BigDecimal esaNumContrato) {
        this.esaNumContrato = esaNumContrato;
    }

    public BigDecimal getEsaNumContrato() {
        return this.esaNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEsaImpContrato(BigDecimal esaImpContrato) {
        this.esaImpContrato = esaImpContrato;
    }

    public BigDecimal getEsaImpContrato() {
        return this.esaImpContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEsaAnoAltaReg(BigDecimal esaAnoAltaReg) {
        this.esaAnoAltaReg = esaAnoAltaReg;
    }

    public BigDecimal getEsaAnoAltaReg() {
        return this.esaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEsaMesAltaReg(BigDecimal esaMesAltaReg) {
        this.esaMesAltaReg = esaMesAltaReg;
    }

    public BigDecimal getEsaMesAltaReg() {
        return this.esaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEsaDiaAltaReg(BigDecimal esaDiaAltaReg) {
        this.esaDiaAltaReg = esaDiaAltaReg;
    }

    public BigDecimal getEsaDiaAltaReg() {
        return this.esaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEsaAnoUltMod(BigDecimal esaAnoUltMod) {
        this.esaAnoUltMod = esaAnoUltMod;
    }

    public BigDecimal getEsaAnoUltMod() {
        return this.esaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEsaMesUltMod(BigDecimal esaMesUltMod) {
        this.esaMesUltMod = esaMesUltMod;
    }

    public BigDecimal getEsaMesUltMod() {
        return this.esaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEsaDiaUltMod(BigDecimal esaDiaUltMod) {
        this.esaDiaUltMod = esaDiaUltMod;
    }

    public BigDecimal getEsaDiaUltMod() {
        return this.esaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEsaCveStEstacti(String esaCveStEstacti) {
        this.esaCveStEstacti = esaCveStEstacti;
    }

    public String getEsaCveStEstacti() {
        return this.esaCveStEstacti;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESTACTIV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEsaNumNivel1() != null && this.getEsaNumNivel1().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL1 IS NULL";
        } else if (this.getEsaNumNivel1() != null) {
            conditions += " AND ESA_NUM_NIVEL1 = ?";
            values.add(this.getEsaNumNivel1());
        }

        if (this.getEsaNumNivel2() != null && this.getEsaNumNivel2().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL2 IS NULL";
        } else if (this.getEsaNumNivel2() != null) {
            conditions += " AND ESA_NUM_NIVEL2 = ?";
            values.add(this.getEsaNumNivel2());
        }

        if (this.getEsaNumNivel3() != null && this.getEsaNumNivel3().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL3 IS NULL";
        } else if (this.getEsaNumNivel3() != null) {
            conditions += " AND ESA_NUM_NIVEL3 = ?";
            values.add(this.getEsaNumNivel3());
        }

        if (this.getEsaNumNivel4() != null && this.getEsaNumNivel4().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL4 IS NULL";
        } else if (this.getEsaNumNivel4() != null) {
            conditions += " AND ESA_NUM_NIVEL4 = ?";
            values.add(this.getEsaNumNivel4());
        }

        if (this.getEsaNumNivel5() != null && this.getEsaNumNivel5().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL5 IS NULL";
        } else if (this.getEsaNumNivel5() != null) {
            conditions += " AND ESA_NUM_NIVEL5 = ?";
            values.add(this.getEsaNumNivel5());
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
        String sql = "SELECT * FROM ESTACTIV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEsaNumNivel1() != null && this.getEsaNumNivel1().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL1 IS NULL";
        } else if (this.getEsaNumNivel1() != null) {
            conditions += " AND ESA_NUM_NIVEL1 = ?";
            values.add(this.getEsaNumNivel1());
        }

        if (this.getEsaNumNivel2() != null && this.getEsaNumNivel2().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL2 IS NULL";
        } else if (this.getEsaNumNivel2() != null) {
            conditions += " AND ESA_NUM_NIVEL2 = ?";
            values.add(this.getEsaNumNivel2());
        }

        if (this.getEsaNumNivel3() != null && this.getEsaNumNivel3().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL3 IS NULL";
        } else if (this.getEsaNumNivel3() != null) {
            conditions += " AND ESA_NUM_NIVEL3 = ?";
            values.add(this.getEsaNumNivel3());
        }

        if (this.getEsaNumNivel4() != null && this.getEsaNumNivel4().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL4 IS NULL";
        } else if (this.getEsaNumNivel4() != null) {
            conditions += " AND ESA_NUM_NIVEL4 = ?";
            values.add(this.getEsaNumNivel4());
        }

        if (this.getEsaNumNivel5() != null && this.getEsaNumNivel5().longValue() == -999) {
            conditions += " AND ESA_NUM_NIVEL5 IS NULL";
        } else if (this.getEsaNumNivel5() != null) {
            conditions += " AND ESA_NUM_NIVEL5 = ?";
            values.add(this.getEsaNumNivel5());
        }

        if (this.getEsaNumRama() != null && this.getEsaNumRama().longValue() == -999) {
            conditions += " AND ESA_NUM_RAMA IS NULL";
        } else if (this.getEsaNumRama() != null) {
            conditions += " AND ESA_NUM_RAMA = ?";
            values.add(this.getEsaNumRama());
        }

        if (this.getEsaNumSrama() != null && this.getEsaNumSrama().longValue() == -999) {
            conditions += " AND ESA_NUM_SRAMA IS NULL";
        } else if (this.getEsaNumSrama() != null) {
            conditions += " AND ESA_NUM_SRAMA = ?";
            values.add(this.getEsaNumSrama());
        }

        if (this.getEsaNumMes() != null && this.getEsaNumMes().longValue() == -999) {
            conditions += " AND ESA_NUM_MES IS NULL";
        } else if (this.getEsaNumMes() != null) {
            conditions += " AND ESA_NUM_MES = ?";
            values.add(this.getEsaNumMes());
        }

        if (this.getEsaNumAno() != null && this.getEsaNumAno().longValue() == -999) {
            conditions += " AND ESA_NUM_ANO IS NULL";
        } else if (this.getEsaNumAno() != null) {
            conditions += " AND ESA_NUM_ANO = ?";
            values.add(this.getEsaNumAno());
        }

        if (this.getEsaNomRama() != null && "null".equals(this.getEsaNomRama())) {
            conditions += " AND ESA_NOM_RAMA IS NULL";
        } else if (this.getEsaNomRama() != null) {
            conditions += " AND ESA_NOM_RAMA = ?";
            values.add(this.getEsaNomRama());
        }

        if (this.getEsaNumContrato() != null && this.getEsaNumContrato().longValue() == -999) {
            conditions += " AND ESA_NUM_CONTRATO IS NULL";
        } else if (this.getEsaNumContrato() != null) {
            conditions += " AND ESA_NUM_CONTRATO = ?";
            values.add(this.getEsaNumContrato());
        }

        if (this.getEsaImpContrato() != null && this.getEsaImpContrato().longValue() == -999) {
            conditions += " AND ESA_IMP_CONTRATO IS NULL";
        } else if (this.getEsaImpContrato() != null) {
            conditions += " AND ESA_IMP_CONTRATO = ?";
            values.add(this.getEsaImpContrato());
        }

        if (this.getEsaAnoAltaReg() != null && this.getEsaAnoAltaReg().longValue() == -999) {
            conditions += " AND ESA_ANO_ALTA_REG IS NULL";
        } else if (this.getEsaAnoAltaReg() != null) {
            conditions += " AND ESA_ANO_ALTA_REG = ?";
            values.add(this.getEsaAnoAltaReg());
        }

        if (this.getEsaMesAltaReg() != null && this.getEsaMesAltaReg().longValue() == -999) {
            conditions += " AND ESA_MES_ALTA_REG IS NULL";
        } else if (this.getEsaMesAltaReg() != null) {
            conditions += " AND ESA_MES_ALTA_REG = ?";
            values.add(this.getEsaMesAltaReg());
        }

        if (this.getEsaDiaAltaReg() != null && this.getEsaDiaAltaReg().longValue() == -999) {
            conditions += " AND ESA_DIA_ALTA_REG IS NULL";
        } else if (this.getEsaDiaAltaReg() != null) {
            conditions += " AND ESA_DIA_ALTA_REG = ?";
            values.add(this.getEsaDiaAltaReg());
        }

        if (this.getEsaAnoUltMod() != null && this.getEsaAnoUltMod().longValue() == -999) {
            conditions += " AND ESA_ANO_ULT_MOD IS NULL";
        } else if (this.getEsaAnoUltMod() != null) {
            conditions += " AND ESA_ANO_ULT_MOD = ?";
            values.add(this.getEsaAnoUltMod());
        }

        if (this.getEsaMesUltMod() != null && this.getEsaMesUltMod().longValue() == -999) {
            conditions += " AND ESA_MES_ULT_MOD IS NULL";
        } else if (this.getEsaMesUltMod() != null) {
            conditions += " AND ESA_MES_ULT_MOD = ?";
            values.add(this.getEsaMesUltMod());
        }

        if (this.getEsaDiaUltMod() != null && this.getEsaDiaUltMod().longValue() == -999) {
            conditions += " AND ESA_DIA_ULT_MOD IS NULL";
        } else if (this.getEsaDiaUltMod() != null) {
            conditions += " AND ESA_DIA_ULT_MOD = ?";
            values.add(this.getEsaDiaUltMod());
        }

        if (this.getEsaCveStEstacti() != null && "null".equals(this.getEsaCveStEstacti())) {
            conditions += " AND ESA_CVE_ST_ESTACTI IS NULL";
        } else if (this.getEsaCveStEstacti() != null) {
            conditions += " AND ESA_CVE_ST_ESTACTI = ?";
            values.add(this.getEsaCveStEstacti());
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
        String sql = "UPDATE ESTACTIV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESA_NUM_NIVEL1 = ?";
        pkValues.add(this.getEsaNumNivel1());
        conditions += " AND ESA_NUM_NIVEL2 = ?";
        pkValues.add(this.getEsaNumNivel2());
        conditions += " AND ESA_NUM_NIVEL3 = ?";
        pkValues.add(this.getEsaNumNivel3());
        conditions += " AND ESA_NUM_NIVEL4 = ?";
        pkValues.add(this.getEsaNumNivel4());
        conditions += " AND ESA_NUM_NIVEL5 = ?";
        pkValues.add(this.getEsaNumNivel5());
        fields += " ESA_NUM_RAMA = ?, ";
        values.add(this.getEsaNumRama());
        fields += " ESA_NUM_SRAMA = ?, ";
        values.add(this.getEsaNumSrama());
        fields += " ESA_NUM_MES = ?, ";
        values.add(this.getEsaNumMes());
        fields += " ESA_NUM_ANO = ?, ";
        values.add(this.getEsaNumAno());
        fields += " ESA_NOM_RAMA = ?, ";
        values.add(this.getEsaNomRama());
        fields += " ESA_NUM_CONTRATO = ?, ";
        values.add(this.getEsaNumContrato());
        fields += " ESA_IMP_CONTRATO = ?, ";
        values.add(this.getEsaImpContrato());
        fields += " ESA_ANO_ALTA_REG = ?, ";
        values.add(this.getEsaAnoAltaReg());
        fields += " ESA_MES_ALTA_REG = ?, ";
        values.add(this.getEsaMesAltaReg());
        fields += " ESA_DIA_ALTA_REG = ?, ";
        values.add(this.getEsaDiaAltaReg());
        fields += " ESA_ANO_ULT_MOD = ?, ";
        values.add(this.getEsaAnoUltMod());
        fields += " ESA_MES_ULT_MOD = ?, ";
        values.add(this.getEsaMesUltMod());
        fields += " ESA_DIA_ULT_MOD = ?, ";
        values.add(this.getEsaDiaUltMod());
        fields += " ESA_CVE_ST_ESTACTI = ?, ";
        values.add(this.getEsaCveStEstacti());
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
        String sql = "INSERT INTO ESTACTIV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESA_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEsaNumNivel1());

        fields += ", ESA_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEsaNumNivel2());

        fields += ", ESA_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEsaNumNivel3());

        fields += ", ESA_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEsaNumNivel4());

        fields += ", ESA_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEsaNumNivel5());

        fields += ", ESA_NUM_RAMA";
        fieldValues += ", ?";
        values.add(this.getEsaNumRama());

        fields += ", ESA_NUM_SRAMA";
        fieldValues += ", ?";
        values.add(this.getEsaNumSrama());

        fields += ", ESA_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEsaNumMes());

        fields += ", ESA_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEsaNumAno());

        fields += ", ESA_NOM_RAMA";
        fieldValues += ", ?";
        values.add(this.getEsaNomRama());

        fields += ", ESA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getEsaNumContrato());

        fields += ", ESA_IMP_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getEsaImpContrato());

        fields += ", ESA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEsaAnoAltaReg());

        fields += ", ESA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEsaMesAltaReg());

        fields += ", ESA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEsaDiaAltaReg());

        fields += ", ESA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEsaAnoUltMod());

        fields += ", ESA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEsaMesUltMod());

        fields += ", ESA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEsaDiaUltMod());

        fields += ", ESA_CVE_ST_ESTACTI";
        fieldValues += ", ?";
        values.add(this.getEsaCveStEstacti());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESTACTIV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESA_NUM_NIVEL1 = ?";
        values.add(this.getEsaNumNivel1());
        conditions += " AND ESA_NUM_NIVEL2 = ?";
        values.add(this.getEsaNumNivel2());
        conditions += " AND ESA_NUM_NIVEL3 = ?";
        values.add(this.getEsaNumNivel3());
        conditions += " AND ESA_NUM_NIVEL4 = ?";
        values.add(this.getEsaNumNivel4());
        conditions += " AND ESA_NUM_NIVEL5 = ?";
        values.add(this.getEsaNumNivel5());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Estactiv instance = (Estactiv) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEsaNumNivel1().equals(instance.getEsaNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumNivel2().equals(instance.getEsaNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumNivel3().equals(instance.getEsaNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumNivel4().equals(instance.getEsaNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumNivel5().equals(instance.getEsaNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumRama().equals(instance.getEsaNumRama()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumSrama().equals(instance.getEsaNumSrama()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumMes().equals(instance.getEsaNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumAno().equals(instance.getEsaNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNomRama().equals(instance.getEsaNomRama()))
            equalObjects = false;
        if (equalObjects && !this.getEsaNumContrato().equals(instance.getEsaNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEsaImpContrato().equals(instance.getEsaImpContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEsaAnoAltaReg().equals(instance.getEsaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEsaMesAltaReg().equals(instance.getEsaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEsaDiaAltaReg().equals(instance.getEsaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEsaAnoUltMod().equals(instance.getEsaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEsaMesUltMod().equals(instance.getEsaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEsaDiaUltMod().equals(instance.getEsaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEsaCveStEstacti().equals(instance.getEsaCveStEstacti()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Estactiv result = new Estactiv();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEsaNumNivel1((BigDecimal) objectData.getData("ESA_NUM_NIVEL1"));
        result.setEsaNumNivel2((BigDecimal) objectData.getData("ESA_NUM_NIVEL2"));
        result.setEsaNumNivel3((BigDecimal) objectData.getData("ESA_NUM_NIVEL3"));
        result.setEsaNumNivel4((BigDecimal) objectData.getData("ESA_NUM_NIVEL4"));
        result.setEsaNumNivel5((BigDecimal) objectData.getData("ESA_NUM_NIVEL5"));
        result.setEsaNumRama((BigDecimal) objectData.getData("ESA_NUM_RAMA"));
        result.setEsaNumSrama((BigDecimal) objectData.getData("ESA_NUM_SRAMA"));
        result.setEsaNumMes((BigDecimal) objectData.getData("ESA_NUM_MES"));
        result.setEsaNumAno((BigDecimal) objectData.getData("ESA_NUM_ANO"));
        result.setEsaNomRama((String) objectData.getData("ESA_NOM_RAMA"));
        result.setEsaNumContrato((BigDecimal) objectData.getData("ESA_NUM_CONTRATO"));
        result.setEsaImpContrato((BigDecimal) objectData.getData("ESA_IMP_CONTRATO"));
        result.setEsaAnoAltaReg((BigDecimal) objectData.getData("ESA_ANO_ALTA_REG"));
        result.setEsaMesAltaReg((BigDecimal) objectData.getData("ESA_MES_ALTA_REG"));
        result.setEsaDiaAltaReg((BigDecimal) objectData.getData("ESA_DIA_ALTA_REG"));
        result.setEsaAnoUltMod((BigDecimal) objectData.getData("ESA_ANO_ULT_MOD"));
        result.setEsaMesUltMod((BigDecimal) objectData.getData("ESA_MES_ULT_MOD"));
        result.setEsaDiaUltMod((BigDecimal) objectData.getData("ESA_DIA_ULT_MOD"));
        result.setEsaCveStEstacti((String) objectData.getData("ESA_CVE_ST_ESTACTI"));

        return result;

    }

}
