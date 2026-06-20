package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CEDECOBR_PK", columns = { "CCO_NUM_PROGRAMA", "CCO_NUM_EMISION", "CCO_NUM_CEDEVIS", "CCO_NUM_SEC_COB" }, sequences = { "MANUAL" })
public class Cedecobr extends DomainObject {

    BigDecimal ccoNumPrograma = null;
    BigDecimal ccoNumEmision = null;
    BigDecimal ccoNumCedevis = null;
    BigDecimal ccoNumSecCob = null;
    BigDecimal ccoAnoInicioPer = null;
    BigDecimal ccoMesInicioPer = null;
    BigDecimal ccoDiaInicioPer = null;
    BigDecimal ccoAnoFinPer = null;
    BigDecimal ccoMesFinPer = null;
    BigDecimal ccoDiaFinPer = null;
    BigDecimal ccoAnoPagoPer = null;
    BigDecimal ccoMesPagoPer = null;
    BigDecimal ccoDiaPagoPer = null;
    String ccoConcepto = null;
    String ccoComentario = null;
    BigDecimal ccoImpCobranza = null;
    BigDecimal ccoAnoAltaReg = null;
    BigDecimal ccoMesAltaReg = null;
    BigDecimal ccoDiaAltaReg = null;
    BigDecimal ccoAnoUltMod = null;
    BigDecimal ccoMesUltMod = null;
    BigDecimal ccoDiaUltMod = null;
    String ccoCveStCedecobr = null;

    public Cedecobr() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcoNumPrograma(BigDecimal ccoNumPrograma) {
        this.ccoNumPrograma = ccoNumPrograma;
    }

    public BigDecimal getCcoNumPrograma() {
        return this.ccoNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcoNumEmision(BigDecimal ccoNumEmision) {
        this.ccoNumEmision = ccoNumEmision;
    }

    public BigDecimal getCcoNumEmision() {
        return this.ccoNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcoNumCedevis(BigDecimal ccoNumCedevis) {
        this.ccoNumCedevis = ccoNumCedevis;
    }

    public BigDecimal getCcoNumCedevis() {
        return this.ccoNumCedevis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcoNumSecCob(BigDecimal ccoNumSecCob) {
        this.ccoNumSecCob = ccoNumSecCob;
    }

    public BigDecimal getCcoNumSecCob() {
        return this.ccoNumSecCob;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcoAnoInicioPer(BigDecimal ccoAnoInicioPer) {
        this.ccoAnoInicioPer = ccoAnoInicioPer;
    }

    public BigDecimal getCcoAnoInicioPer() {
        return this.ccoAnoInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoMesInicioPer(BigDecimal ccoMesInicioPer) {
        this.ccoMesInicioPer = ccoMesInicioPer;
    }

    public BigDecimal getCcoMesInicioPer() {
        return this.ccoMesInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoDiaInicioPer(BigDecimal ccoDiaInicioPer) {
        this.ccoDiaInicioPer = ccoDiaInicioPer;
    }

    public BigDecimal getCcoDiaInicioPer() {
        return this.ccoDiaInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcoAnoFinPer(BigDecimal ccoAnoFinPer) {
        this.ccoAnoFinPer = ccoAnoFinPer;
    }

    public BigDecimal getCcoAnoFinPer() {
        return this.ccoAnoFinPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoMesFinPer(BigDecimal ccoMesFinPer) {
        this.ccoMesFinPer = ccoMesFinPer;
    }

    public BigDecimal getCcoMesFinPer() {
        return this.ccoMesFinPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoDiaFinPer(BigDecimal ccoDiaFinPer) {
        this.ccoDiaFinPer = ccoDiaFinPer;
    }

    public BigDecimal getCcoDiaFinPer() {
        return this.ccoDiaFinPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcoAnoPagoPer(BigDecimal ccoAnoPagoPer) {
        this.ccoAnoPagoPer = ccoAnoPagoPer;
    }

    public BigDecimal getCcoAnoPagoPer() {
        return this.ccoAnoPagoPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoMesPagoPer(BigDecimal ccoMesPagoPer) {
        this.ccoMesPagoPer = ccoMesPagoPer;
    }

    public BigDecimal getCcoMesPagoPer() {
        return this.ccoMesPagoPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoDiaPagoPer(BigDecimal ccoDiaPagoPer) {
        this.ccoDiaPagoPer = ccoDiaPagoPer;
    }

    public BigDecimal getCcoDiaPagoPer() {
        return this.ccoDiaPagoPer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcoConcepto(String ccoConcepto) {
        this.ccoConcepto = ccoConcepto;
    }

    public String getCcoConcepto() {
        return this.ccoConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcoComentario(String ccoComentario) {
        this.ccoComentario = ccoComentario;
    }

    public String getCcoComentario() {
        return this.ccoComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCcoImpCobranza(BigDecimal ccoImpCobranza) {
        this.ccoImpCobranza = ccoImpCobranza;
    }

    public BigDecimal getCcoImpCobranza() {
        return this.ccoImpCobranza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcoAnoAltaReg(BigDecimal ccoAnoAltaReg) {
        this.ccoAnoAltaReg = ccoAnoAltaReg;
    }

    public BigDecimal getCcoAnoAltaReg() {
        return this.ccoAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoMesAltaReg(BigDecimal ccoMesAltaReg) {
        this.ccoMesAltaReg = ccoMesAltaReg;
    }

    public BigDecimal getCcoMesAltaReg() {
        return this.ccoMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoDiaAltaReg(BigDecimal ccoDiaAltaReg) {
        this.ccoDiaAltaReg = ccoDiaAltaReg;
    }

    public BigDecimal getCcoDiaAltaReg() {
        return this.ccoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcoAnoUltMod(BigDecimal ccoAnoUltMod) {
        this.ccoAnoUltMod = ccoAnoUltMod;
    }

    public BigDecimal getCcoAnoUltMod() {
        return this.ccoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoMesUltMod(BigDecimal ccoMesUltMod) {
        this.ccoMesUltMod = ccoMesUltMod;
    }

    public BigDecimal getCcoMesUltMod() {
        return this.ccoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcoDiaUltMod(BigDecimal ccoDiaUltMod) {
        this.ccoDiaUltMod = ccoDiaUltMod;
    }

    public BigDecimal getCcoDiaUltMod() {
        return this.ccoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcoCveStCedecobr(String ccoCveStCedecobr) {
        this.ccoCveStCedecobr = ccoCveStCedecobr;
    }

    public String getCcoCveStCedecobr() {
        return this.ccoCveStCedecobr;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CEDECOBR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCcoNumPrograma() != null && this.getCcoNumPrograma().longValue() == -999) {
            conditions += " AND CCO_NUM_PROGRAMA IS NULL";
        } else if (this.getCcoNumPrograma() != null) {
            conditions += " AND CCO_NUM_PROGRAMA = ?";
            values.add(this.getCcoNumPrograma());
        }

        if (this.getCcoNumEmision() != null && this.getCcoNumEmision().longValue() == -999) {
            conditions += " AND CCO_NUM_EMISION IS NULL";
        } else if (this.getCcoNumEmision() != null) {
            conditions += " AND CCO_NUM_EMISION = ?";
            values.add(this.getCcoNumEmision());
        }

        if (this.getCcoNumCedevis() != null && this.getCcoNumCedevis().longValue() == -999) {
            conditions += " AND CCO_NUM_CEDEVIS IS NULL";
        } else if (this.getCcoNumCedevis() != null) {
            conditions += " AND CCO_NUM_CEDEVIS = ?";
            values.add(this.getCcoNumCedevis());
        }

        if (this.getCcoNumSecCob() != null && this.getCcoNumSecCob().longValue() == -999) {
            conditions += " AND CCO_NUM_SEC_COB IS NULL";
        } else if (this.getCcoNumSecCob() != null) {
            conditions += " AND CCO_NUM_SEC_COB = ?";
            values.add(this.getCcoNumSecCob());
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
        String sql = "SELECT * FROM CEDECOBR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCcoNumPrograma() != null && this.getCcoNumPrograma().longValue() == -999) {
            conditions += " AND CCO_NUM_PROGRAMA IS NULL";
        } else if (this.getCcoNumPrograma() != null) {
            conditions += " AND CCO_NUM_PROGRAMA = ?";
            values.add(this.getCcoNumPrograma());
        }

        if (this.getCcoNumEmision() != null && this.getCcoNumEmision().longValue() == -999) {
            conditions += " AND CCO_NUM_EMISION IS NULL";
        } else if (this.getCcoNumEmision() != null) {
            conditions += " AND CCO_NUM_EMISION = ?";
            values.add(this.getCcoNumEmision());
        }

        if (this.getCcoNumCedevis() != null && this.getCcoNumCedevis().longValue() == -999) {
            conditions += " AND CCO_NUM_CEDEVIS IS NULL";
        } else if (this.getCcoNumCedevis() != null) {
            conditions += " AND CCO_NUM_CEDEVIS = ?";
            values.add(this.getCcoNumCedevis());
        }

        if (this.getCcoNumSecCob() != null && this.getCcoNumSecCob().longValue() == -999) {
            conditions += " AND CCO_NUM_SEC_COB IS NULL";
        } else if (this.getCcoNumSecCob() != null) {
            conditions += " AND CCO_NUM_SEC_COB = ?";
            values.add(this.getCcoNumSecCob());
        }

        if (this.getCcoAnoInicioPer() != null && this.getCcoAnoInicioPer().longValue() == -999) {
            conditions += " AND CCO_ANO_INICIO_PER IS NULL";
        } else if (this.getCcoAnoInicioPer() != null) {
            conditions += " AND CCO_ANO_INICIO_PER = ?";
            values.add(this.getCcoAnoInicioPer());
        }

        if (this.getCcoMesInicioPer() != null && this.getCcoMesInicioPer().longValue() == -999) {
            conditions += " AND CCO_MES_INICIO_PER IS NULL";
        } else if (this.getCcoMesInicioPer() != null) {
            conditions += " AND CCO_MES_INICIO_PER = ?";
            values.add(this.getCcoMesInicioPer());
        }

        if (this.getCcoDiaInicioPer() != null && this.getCcoDiaInicioPer().longValue() == -999) {
            conditions += " AND CCO_DIA_INICIO_PER IS NULL";
        } else if (this.getCcoDiaInicioPer() != null) {
            conditions += " AND CCO_DIA_INICIO_PER = ?";
            values.add(this.getCcoDiaInicioPer());
        }

        if (this.getCcoAnoFinPer() != null && this.getCcoAnoFinPer().longValue() == -999) {
            conditions += " AND CCO_ANO_FIN_PER IS NULL";
        } else if (this.getCcoAnoFinPer() != null) {
            conditions += " AND CCO_ANO_FIN_PER = ?";
            values.add(this.getCcoAnoFinPer());
        }

        if (this.getCcoMesFinPer() != null && this.getCcoMesFinPer().longValue() == -999) {
            conditions += " AND CCO_MES_FIN_PER IS NULL";
        } else if (this.getCcoMesFinPer() != null) {
            conditions += " AND CCO_MES_FIN_PER = ?";
            values.add(this.getCcoMesFinPer());
        }

        if (this.getCcoDiaFinPer() != null && this.getCcoDiaFinPer().longValue() == -999) {
            conditions += " AND CCO_DIA_FIN_PER IS NULL";
        } else if (this.getCcoDiaFinPer() != null) {
            conditions += " AND CCO_DIA_FIN_PER = ?";
            values.add(this.getCcoDiaFinPer());
        }

        if (this.getCcoAnoPagoPer() != null && this.getCcoAnoPagoPer().longValue() == -999) {
            conditions += " AND CCO_ANO_PAGO_PER IS NULL";
        } else if (this.getCcoAnoPagoPer() != null) {
            conditions += " AND CCO_ANO_PAGO_PER = ?";
            values.add(this.getCcoAnoPagoPer());
        }

        if (this.getCcoMesPagoPer() != null && this.getCcoMesPagoPer().longValue() == -999) {
            conditions += " AND CCO_MES_PAGO_PER IS NULL";
        } else if (this.getCcoMesPagoPer() != null) {
            conditions += " AND CCO_MES_PAGO_PER = ?";
            values.add(this.getCcoMesPagoPer());
        }

        if (this.getCcoDiaPagoPer() != null && this.getCcoDiaPagoPer().longValue() == -999) {
            conditions += " AND CCO_DIA_PAGO_PER IS NULL";
        } else if (this.getCcoDiaPagoPer() != null) {
            conditions += " AND CCO_DIA_PAGO_PER = ?";
            values.add(this.getCcoDiaPagoPer());
        }

        if (this.getCcoConcepto() != null && "null".equals(this.getCcoConcepto())) {
            conditions += " AND CCO_CONCEPTO IS NULL";
        } else if (this.getCcoConcepto() != null) {
            conditions += " AND CCO_CONCEPTO = ?";
            values.add(this.getCcoConcepto());
        }

        if (this.getCcoComentario() != null && "null".equals(this.getCcoComentario())) {
            conditions += " AND CCO_COMENTARIO IS NULL";
        } else if (this.getCcoComentario() != null) {
            conditions += " AND CCO_COMENTARIO = ?";
            values.add(this.getCcoComentario());
        }

        if (this.getCcoImpCobranza() != null && this.getCcoImpCobranza().longValue() == -999) {
            conditions += " AND CCO_IMP_COBRANZA IS NULL";
        } else if (this.getCcoImpCobranza() != null) {
            conditions += " AND CCO_IMP_COBRANZA = ?";
            values.add(this.getCcoImpCobranza());
        }

        if (this.getCcoAnoAltaReg() != null && this.getCcoAnoAltaReg().longValue() == -999) {
            conditions += " AND CCO_ANO_ALTA_REG IS NULL";
        } else if (this.getCcoAnoAltaReg() != null) {
            conditions += " AND CCO_ANO_ALTA_REG = ?";
            values.add(this.getCcoAnoAltaReg());
        }

        if (this.getCcoMesAltaReg() != null && this.getCcoMesAltaReg().longValue() == -999) {
            conditions += " AND CCO_MES_ALTA_REG IS NULL";
        } else if (this.getCcoMesAltaReg() != null) {
            conditions += " AND CCO_MES_ALTA_REG = ?";
            values.add(this.getCcoMesAltaReg());
        }

        if (this.getCcoDiaAltaReg() != null && this.getCcoDiaAltaReg().longValue() == -999) {
            conditions += " AND CCO_DIA_ALTA_REG IS NULL";
        } else if (this.getCcoDiaAltaReg() != null) {
            conditions += " AND CCO_DIA_ALTA_REG = ?";
            values.add(this.getCcoDiaAltaReg());
        }

        if (this.getCcoAnoUltMod() != null && this.getCcoAnoUltMod().longValue() == -999) {
            conditions += " AND CCO_ANO_ULT_MOD IS NULL";
        } else if (this.getCcoAnoUltMod() != null) {
            conditions += " AND CCO_ANO_ULT_MOD = ?";
            values.add(this.getCcoAnoUltMod());
        }

        if (this.getCcoMesUltMod() != null && this.getCcoMesUltMod().longValue() == -999) {
            conditions += " AND CCO_MES_ULT_MOD IS NULL";
        } else if (this.getCcoMesUltMod() != null) {
            conditions += " AND CCO_MES_ULT_MOD = ?";
            values.add(this.getCcoMesUltMod());
        }

        if (this.getCcoDiaUltMod() != null && this.getCcoDiaUltMod().longValue() == -999) {
            conditions += " AND CCO_DIA_ULT_MOD IS NULL";
        } else if (this.getCcoDiaUltMod() != null) {
            conditions += " AND CCO_DIA_ULT_MOD = ?";
            values.add(this.getCcoDiaUltMod());
        }

        if (this.getCcoCveStCedecobr() != null && "null".equals(this.getCcoCveStCedecobr())) {
            conditions += " AND CCO_CVE_ST_CEDECOBR IS NULL";
        } else if (this.getCcoCveStCedecobr() != null) {
            conditions += " AND CCO_CVE_ST_CEDECOBR = ?";
            values.add(this.getCcoCveStCedecobr());
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
        String sql = "UPDATE CEDECOBR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CCO_NUM_PROGRAMA = ?";
        pkValues.add(this.getCcoNumPrograma());
        conditions += " AND CCO_NUM_EMISION = ?";
        pkValues.add(this.getCcoNumEmision());
        conditions += " AND CCO_NUM_CEDEVIS = ?";
        pkValues.add(this.getCcoNumCedevis());
        conditions += " AND CCO_NUM_SEC_COB = ?";
        pkValues.add(this.getCcoNumSecCob());
        fields += " CCO_ANO_INICIO_PER = ?, ";
        values.add(this.getCcoAnoInicioPer());
        fields += " CCO_MES_INICIO_PER = ?, ";
        values.add(this.getCcoMesInicioPer());
        fields += " CCO_DIA_INICIO_PER = ?, ";
        values.add(this.getCcoDiaInicioPer());
        fields += " CCO_ANO_FIN_PER = ?, ";
        values.add(this.getCcoAnoFinPer());
        fields += " CCO_MES_FIN_PER = ?, ";
        values.add(this.getCcoMesFinPer());
        fields += " CCO_DIA_FIN_PER = ?, ";
        values.add(this.getCcoDiaFinPer());
        fields += " CCO_ANO_PAGO_PER = ?, ";
        values.add(this.getCcoAnoPagoPer());
        fields += " CCO_MES_PAGO_PER = ?, ";
        values.add(this.getCcoMesPagoPer());
        fields += " CCO_DIA_PAGO_PER = ?, ";
        values.add(this.getCcoDiaPagoPer());
        fields += " CCO_CONCEPTO = ?, ";
        values.add(this.getCcoConcepto());
        fields += " CCO_COMENTARIO = ?, ";
        values.add(this.getCcoComentario());
        fields += " CCO_IMP_COBRANZA = ?, ";
        values.add(this.getCcoImpCobranza());
        fields += " CCO_ANO_ALTA_REG = ?, ";
        values.add(this.getCcoAnoAltaReg());
        fields += " CCO_MES_ALTA_REG = ?, ";
        values.add(this.getCcoMesAltaReg());
        fields += " CCO_DIA_ALTA_REG = ?, ";
        values.add(this.getCcoDiaAltaReg());
        fields += " CCO_ANO_ULT_MOD = ?, ";
        values.add(this.getCcoAnoUltMod());
        fields += " CCO_MES_ULT_MOD = ?, ";
        values.add(this.getCcoMesUltMod());
        fields += " CCO_DIA_ULT_MOD = ?, ";
        values.add(this.getCcoDiaUltMod());
        fields += " CCO_CVE_ST_CEDECOBR = ?, ";
        values.add(this.getCcoCveStCedecobr());
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
        String sql = "INSERT INTO CEDECOBR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CCO_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getCcoNumPrograma());

        fields += ", CCO_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getCcoNumEmision());

        fields += ", CCO_NUM_CEDEVIS";
        fieldValues += ", ?";
        values.add(this.getCcoNumCedevis());

        fields += ", CCO_NUM_SEC_COB";
        fieldValues += ", ?";
        values.add(this.getCcoNumSecCob());

        fields += ", CCO_ANO_INICIO_PER";
        fieldValues += ", ?";
        values.add(this.getCcoAnoInicioPer());

        fields += ", CCO_MES_INICIO_PER";
        fieldValues += ", ?";
        values.add(this.getCcoMesInicioPer());

        fields += ", CCO_DIA_INICIO_PER";
        fieldValues += ", ?";
        values.add(this.getCcoDiaInicioPer());

        fields += ", CCO_ANO_FIN_PER";
        fieldValues += ", ?";
        values.add(this.getCcoAnoFinPer());

        fields += ", CCO_MES_FIN_PER";
        fieldValues += ", ?";
        values.add(this.getCcoMesFinPer());

        fields += ", CCO_DIA_FIN_PER";
        fieldValues += ", ?";
        values.add(this.getCcoDiaFinPer());

        fields += ", CCO_ANO_PAGO_PER";
        fieldValues += ", ?";
        values.add(this.getCcoAnoPagoPer());

        fields += ", CCO_MES_PAGO_PER";
        fieldValues += ", ?";
        values.add(this.getCcoMesPagoPer());

        fields += ", CCO_DIA_PAGO_PER";
        fieldValues += ", ?";
        values.add(this.getCcoDiaPagoPer());

        fields += ", CCO_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCcoConcepto());

        fields += ", CCO_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getCcoComentario());

        fields += ", CCO_IMP_COBRANZA";
        fieldValues += ", ?";
        values.add(this.getCcoImpCobranza());

        fields += ", CCO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCcoAnoAltaReg());

        fields += ", CCO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCcoMesAltaReg());

        fields += ", CCO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCcoDiaAltaReg());

        fields += ", CCO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCcoAnoUltMod());

        fields += ", CCO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCcoMesUltMod());

        fields += ", CCO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCcoDiaUltMod());

        fields += ", CCO_CVE_ST_CEDECOBR";
        fieldValues += ", ?";
        values.add(this.getCcoCveStCedecobr());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CEDECOBR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CCO_NUM_PROGRAMA = ?";
        values.add(this.getCcoNumPrograma());
        conditions += " AND CCO_NUM_EMISION = ?";
        values.add(this.getCcoNumEmision());
        conditions += " AND CCO_NUM_CEDEVIS = ?";
        values.add(this.getCcoNumCedevis());
        conditions += " AND CCO_NUM_SEC_COB = ?";
        values.add(this.getCcoNumSecCob());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cedecobr instance = (Cedecobr) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCcoNumPrograma().equals(instance.getCcoNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getCcoNumEmision().equals(instance.getCcoNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCcoNumCedevis().equals(instance.getCcoNumCedevis()))
            equalObjects = false;
        if (equalObjects && !this.getCcoNumSecCob().equals(instance.getCcoNumSecCob()))
            equalObjects = false;
        if (equalObjects && !this.getCcoAnoInicioPer().equals(instance.getCcoAnoInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoMesInicioPer().equals(instance.getCcoMesInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoDiaInicioPer().equals(instance.getCcoDiaInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoAnoFinPer().equals(instance.getCcoAnoFinPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoMesFinPer().equals(instance.getCcoMesFinPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoDiaFinPer().equals(instance.getCcoDiaFinPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoAnoPagoPer().equals(instance.getCcoAnoPagoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoMesPagoPer().equals(instance.getCcoMesPagoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoDiaPagoPer().equals(instance.getCcoDiaPagoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCcoConcepto().equals(instance.getCcoConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCcoComentario().equals(instance.getCcoComentario()))
            equalObjects = false;
        if (equalObjects && !this.getCcoImpCobranza().equals(instance.getCcoImpCobranza()))
            equalObjects = false;
        if (equalObjects && !this.getCcoAnoAltaReg().equals(instance.getCcoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCcoMesAltaReg().equals(instance.getCcoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCcoDiaAltaReg().equals(instance.getCcoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCcoAnoUltMod().equals(instance.getCcoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCcoMesUltMod().equals(instance.getCcoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCcoDiaUltMod().equals(instance.getCcoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCcoCveStCedecobr().equals(instance.getCcoCveStCedecobr()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cedecobr result = new Cedecobr();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCcoNumPrograma((BigDecimal) objectData.getData("CCO_NUM_PROGRAMA"));
        result.setCcoNumEmision((BigDecimal) objectData.getData("CCO_NUM_EMISION"));
        result.setCcoNumCedevis((BigDecimal) objectData.getData("CCO_NUM_CEDEVIS"));
        result.setCcoNumSecCob((BigDecimal) objectData.getData("CCO_NUM_SEC_COB"));
        result.setCcoAnoInicioPer((BigDecimal) objectData.getData("CCO_ANO_INICIO_PER"));
        result.setCcoMesInicioPer((BigDecimal) objectData.getData("CCO_MES_INICIO_PER"));
        result.setCcoDiaInicioPer((BigDecimal) objectData.getData("CCO_DIA_INICIO_PER"));
        result.setCcoAnoFinPer((BigDecimal) objectData.getData("CCO_ANO_FIN_PER"));
        result.setCcoMesFinPer((BigDecimal) objectData.getData("CCO_MES_FIN_PER"));
        result.setCcoDiaFinPer((BigDecimal) objectData.getData("CCO_DIA_FIN_PER"));
        result.setCcoAnoPagoPer((BigDecimal) objectData.getData("CCO_ANO_PAGO_PER"));
        result.setCcoMesPagoPer((BigDecimal) objectData.getData("CCO_MES_PAGO_PER"));
        result.setCcoDiaPagoPer((BigDecimal) objectData.getData("CCO_DIA_PAGO_PER"));
        result.setCcoConcepto((String) objectData.getData("CCO_CONCEPTO"));
        result.setCcoComentario((String) objectData.getData("CCO_COMENTARIO"));
        result.setCcoImpCobranza((BigDecimal) objectData.getData("CCO_IMP_COBRANZA"));
        result.setCcoAnoAltaReg((BigDecimal) objectData.getData("CCO_ANO_ALTA_REG"));
        result.setCcoMesAltaReg((BigDecimal) objectData.getData("CCO_MES_ALTA_REG"));
        result.setCcoDiaAltaReg((BigDecimal) objectData.getData("CCO_DIA_ALTA_REG"));
        result.setCcoAnoUltMod((BigDecimal) objectData.getData("CCO_ANO_ULT_MOD"));
        result.setCcoMesUltMod((BigDecimal) objectData.getData("CCO_MES_ULT_MOD"));
        result.setCcoDiaUltMod((BigDecimal) objectData.getData("CCO_DIA_ULT_MOD"));
        result.setCcoCveStCedecobr((String) objectData.getData("CCO_CVE_ST_CEDECOBR"));

        return result;

    }

}
