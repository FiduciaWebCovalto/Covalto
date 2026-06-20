package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FECCONT_PK", columns = { "FCO_CVE_TIPO_FECHA" }, sequences = { "MAX" })
public class Feccont extends DomainObject {

    String fcoCveTipoFecha = null;
    BigDecimal fcoAnoDia = null;
    BigDecimal fcoMesDia = null;
    BigDecimal fcoDiaDia = null;
    BigDecimal fcoAnoApliConta = null;
    BigDecimal fcoMesApliConta = null;
    BigDecimal fcoDiaApliConta = null;
    BigDecimal fcoAnoUltCierre = null;
    BigDecimal fcoMesUltCierre = null;
    BigDecimal fcoDiaUltCierre = null;
    BigDecimal fcoDiasOperAno = null;
    BigDecimal fcoDiasOperSist = null;
    BigDecimal fcoAnoIniOpers = null;
    BigDecimal fcoMesIniOpers = null;
    BigDecimal fcoDiaIniOpers = null;
    BigDecimal fcoAnoAltaReg = null;
    BigDecimal fcoMesAltaReg = null;
    BigDecimal fcoDiaAltaReg = null;
    BigDecimal fcoAnoUltMod = null;
    BigDecimal fcoMesUltMod = null;
    BigDecimal fcoDiaUltMod = null;
    String fcoCveStFeccont = null;

    public Feccont() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcoCveTipoFecha(String fcoCveTipoFecha) {
        this.fcoCveTipoFecha = fcoCveTipoFecha;
    }

    public String getFcoCveTipoFecha() {
        return this.fcoCveTipoFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFcoAnoDia(BigDecimal fcoAnoDia) {
        this.fcoAnoDia = fcoAnoDia;
    }

    public BigDecimal getFcoAnoDia() {
        return this.fcoAnoDia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoMesDia(BigDecimal fcoMesDia) {
        this.fcoMesDia = fcoMesDia;
    }

    public BigDecimal getFcoMesDia() {
        return this.fcoMesDia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoDiaDia(BigDecimal fcoDiaDia) {
        this.fcoDiaDia = fcoDiaDia;
    }

    public BigDecimal getFcoDiaDia() {
        return this.fcoDiaDia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFcoAnoApliConta(BigDecimal fcoAnoApliConta) {
        this.fcoAnoApliConta = fcoAnoApliConta;
    }

    public BigDecimal getFcoAnoApliConta() {
        return this.fcoAnoApliConta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoMesApliConta(BigDecimal fcoMesApliConta) {
        this.fcoMesApliConta = fcoMesApliConta;
    }

    public BigDecimal getFcoMesApliConta() {
        return this.fcoMesApliConta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoDiaApliConta(BigDecimal fcoDiaApliConta) {
        this.fcoDiaApliConta = fcoDiaApliConta;
    }

    public BigDecimal getFcoDiaApliConta() {
        return this.fcoDiaApliConta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFcoAnoUltCierre(BigDecimal fcoAnoUltCierre) {
        this.fcoAnoUltCierre = fcoAnoUltCierre;
    }

    public BigDecimal getFcoAnoUltCierre() {
        return this.fcoAnoUltCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoMesUltCierre(BigDecimal fcoMesUltCierre) {
        this.fcoMesUltCierre = fcoMesUltCierre;
    }

    public BigDecimal getFcoMesUltCierre() {
        return this.fcoMesUltCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoDiaUltCierre(BigDecimal fcoDiaUltCierre) {
        this.fcoDiaUltCierre = fcoDiaUltCierre;
    }

    public BigDecimal getFcoDiaUltCierre() {
        return this.fcoDiaUltCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcoDiasOperAno(BigDecimal fcoDiasOperAno) {
        this.fcoDiasOperAno = fcoDiasOperAno;
    }

    public BigDecimal getFcoDiasOperAno() {
        return this.fcoDiasOperAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcoDiasOperSist(BigDecimal fcoDiasOperSist) {
        this.fcoDiasOperSist = fcoDiasOperSist;
    }

    public BigDecimal getFcoDiasOperSist() {
        return this.fcoDiasOperSist;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFcoAnoIniOpers(BigDecimal fcoAnoIniOpers) {
        this.fcoAnoIniOpers = fcoAnoIniOpers;
    }

    public BigDecimal getFcoAnoIniOpers() {
        return this.fcoAnoIniOpers;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoMesIniOpers(BigDecimal fcoMesIniOpers) {
        this.fcoMesIniOpers = fcoMesIniOpers;
    }

    public BigDecimal getFcoMesIniOpers() {
        return this.fcoMesIniOpers;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoDiaIniOpers(BigDecimal fcoDiaIniOpers) {
        this.fcoDiaIniOpers = fcoDiaIniOpers;
    }

    public BigDecimal getFcoDiaIniOpers() {
        return this.fcoDiaIniOpers;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFcoAnoAltaReg(BigDecimal fcoAnoAltaReg) {
        this.fcoAnoAltaReg = fcoAnoAltaReg;
    }

    public BigDecimal getFcoAnoAltaReg() {
        return this.fcoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoMesAltaReg(BigDecimal fcoMesAltaReg) {
        this.fcoMesAltaReg = fcoMesAltaReg;
    }

    public BigDecimal getFcoMesAltaReg() {
        return this.fcoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoDiaAltaReg(BigDecimal fcoDiaAltaReg) {
        this.fcoDiaAltaReg = fcoDiaAltaReg;
    }

    public BigDecimal getFcoDiaAltaReg() {
        return this.fcoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFcoAnoUltMod(BigDecimal fcoAnoUltMod) {
        this.fcoAnoUltMod = fcoAnoUltMod;
    }

    public BigDecimal getFcoAnoUltMod() {
        return this.fcoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoMesUltMod(BigDecimal fcoMesUltMod) {
        this.fcoMesUltMod = fcoMesUltMod;
    }

    public BigDecimal getFcoMesUltMod() {
        return this.fcoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFcoDiaUltMod(BigDecimal fcoDiaUltMod) {
        this.fcoDiaUltMod = fcoDiaUltMod;
    }

    public BigDecimal getFcoDiaUltMod() {
        return this.fcoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcoCveStFeccont(String fcoCveStFeccont) {
        this.fcoCveStFeccont = fcoCveStFeccont;
    }

    public String getFcoCveStFeccont() {
        return this.fcoCveStFeccont;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FECCONT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcoCveTipoFecha() != null && "null".equals(this.getFcoCveTipoFecha())) {
            conditions += " AND FCO_CVE_TIPO_FECHA IS NULL";
        } else if (this.getFcoCveTipoFecha() != null) {
            conditions += " AND FCO_CVE_TIPO_FECHA = ?";
            values.add(this.getFcoCveTipoFecha());
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
        String sql = "SELECT * FROM FECCONT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcoCveTipoFecha() != null && "null".equals(this.getFcoCveTipoFecha())) {
            conditions += " AND FCO_CVE_TIPO_FECHA IS NULL";
        } else if (this.getFcoCveTipoFecha() != null) {
            conditions += " AND FCO_CVE_TIPO_FECHA = ?";
            values.add(this.getFcoCveTipoFecha());
        }

        if (this.getFcoAnoDia() != null && this.getFcoAnoDia().longValue() == -999) {
            conditions += " AND FCO_ANO_DIA IS NULL";
        } else if (this.getFcoAnoDia() != null) {
            conditions += " AND FCO_ANO_DIA = ?";
            values.add(this.getFcoAnoDia());
        }

        if (this.getFcoMesDia() != null && this.getFcoMesDia().longValue() == -999) {
            conditions += " AND FCO_MES_DIA IS NULL";
        } else if (this.getFcoMesDia() != null) {
            conditions += " AND FCO_MES_DIA = ?";
            values.add(this.getFcoMesDia());
        }

        if (this.getFcoDiaDia() != null && this.getFcoDiaDia().longValue() == -999) {
            conditions += " AND FCO_DIA_DIA IS NULL";
        } else if (this.getFcoDiaDia() != null) {
            conditions += " AND FCO_DIA_DIA = ?";
            values.add(this.getFcoDiaDia());
        }

        if (this.getFcoAnoApliConta() != null && this.getFcoAnoApliConta().longValue() == -999) {
            conditions += " AND FCO_ANO_APLI_CONTA IS NULL";
        } else if (this.getFcoAnoApliConta() != null) {
            conditions += " AND FCO_ANO_APLI_CONTA = ?";
            values.add(this.getFcoAnoApliConta());
        }

        if (this.getFcoMesApliConta() != null && this.getFcoMesApliConta().longValue() == -999) {
            conditions += " AND FCO_MES_APLI_CONTA IS NULL";
        } else if (this.getFcoMesApliConta() != null) {
            conditions += " AND FCO_MES_APLI_CONTA = ?";
            values.add(this.getFcoMesApliConta());
        }

        if (this.getFcoDiaApliConta() != null && this.getFcoDiaApliConta().longValue() == -999) {
            conditions += " AND FCO_DIA_APLI_CONTA IS NULL";
        } else if (this.getFcoDiaApliConta() != null) {
            conditions += " AND FCO_DIA_APLI_CONTA = ?";
            values.add(this.getFcoDiaApliConta());
        }

        if (this.getFcoAnoUltCierre() != null && this.getFcoAnoUltCierre().longValue() == -999) {
            conditions += " AND FCO_ANO_ULT_CIERRE IS NULL";
        } else if (this.getFcoAnoUltCierre() != null) {
            conditions += " AND FCO_ANO_ULT_CIERRE = ?";
            values.add(this.getFcoAnoUltCierre());
        }

        if (this.getFcoMesUltCierre() != null && this.getFcoMesUltCierre().longValue() == -999) {
            conditions += " AND FCO_MES_ULT_CIERRE IS NULL";
        } else if (this.getFcoMesUltCierre() != null) {
            conditions += " AND FCO_MES_ULT_CIERRE = ?";
            values.add(this.getFcoMesUltCierre());
        }

        if (this.getFcoDiaUltCierre() != null && this.getFcoDiaUltCierre().longValue() == -999) {
            conditions += " AND FCO_DIA_ULT_CIERRE IS NULL";
        } else if (this.getFcoDiaUltCierre() != null) {
            conditions += " AND FCO_DIA_ULT_CIERRE = ?";
            values.add(this.getFcoDiaUltCierre());
        }

        if (this.getFcoDiasOperAno() != null && this.getFcoDiasOperAno().longValue() == -999) {
            conditions += " AND FCO_DIAS_OPER_ANO IS NULL";
        } else if (this.getFcoDiasOperAno() != null) {
            conditions += " AND FCO_DIAS_OPER_ANO = ?";
            values.add(this.getFcoDiasOperAno());
        }

        if (this.getFcoDiasOperSist() != null && this.getFcoDiasOperSist().longValue() == -999) {
            conditions += " AND FCO_DIAS_OPER_SIST IS NULL";
        } else if (this.getFcoDiasOperSist() != null) {
            conditions += " AND FCO_DIAS_OPER_SIST = ?";
            values.add(this.getFcoDiasOperSist());
        }

        if (this.getFcoAnoIniOpers() != null && this.getFcoAnoIniOpers().longValue() == -999) {
            conditions += " AND FCO_ANO_INI_OPERS IS NULL";
        } else if (this.getFcoAnoIniOpers() != null) {
            conditions += " AND FCO_ANO_INI_OPERS = ?";
            values.add(this.getFcoAnoIniOpers());
        }

        if (this.getFcoMesIniOpers() != null && this.getFcoMesIniOpers().longValue() == -999) {
            conditions += " AND FCO_MES_INI_OPERS IS NULL";
        } else if (this.getFcoMesIniOpers() != null) {
            conditions += " AND FCO_MES_INI_OPERS = ?";
            values.add(this.getFcoMesIniOpers());
        }

        if (this.getFcoDiaIniOpers() != null && this.getFcoDiaIniOpers().longValue() == -999) {
            conditions += " AND FCO_DIA_INI_OPERS IS NULL";
        } else if (this.getFcoDiaIniOpers() != null) {
            conditions += " AND FCO_DIA_INI_OPERS = ?";
            values.add(this.getFcoDiaIniOpers());
        }

        if (this.getFcoAnoAltaReg() != null && this.getFcoAnoAltaReg().longValue() == -999) {
            conditions += " AND FCO_ANO_ALTA_REG IS NULL";
        } else if (this.getFcoAnoAltaReg() != null) {
            conditions += " AND FCO_ANO_ALTA_REG = ?";
            values.add(this.getFcoAnoAltaReg());
        }

        if (this.getFcoMesAltaReg() != null && this.getFcoMesAltaReg().longValue() == -999) {
            conditions += " AND FCO_MES_ALTA_REG IS NULL";
        } else if (this.getFcoMesAltaReg() != null) {
            conditions += " AND FCO_MES_ALTA_REG = ?";
            values.add(this.getFcoMesAltaReg());
        }

        if (this.getFcoDiaAltaReg() != null && this.getFcoDiaAltaReg().longValue() == -999) {
            conditions += " AND FCO_DIA_ALTA_REG IS NULL";
        } else if (this.getFcoDiaAltaReg() != null) {
            conditions += " AND FCO_DIA_ALTA_REG = ?";
            values.add(this.getFcoDiaAltaReg());
        }

        if (this.getFcoAnoUltMod() != null && this.getFcoAnoUltMod().longValue() == -999) {
            conditions += " AND FCO_ANO_ULT_MOD IS NULL";
        } else if (this.getFcoAnoUltMod() != null) {
            conditions += " AND FCO_ANO_ULT_MOD = ?";
            values.add(this.getFcoAnoUltMod());
        }

        if (this.getFcoMesUltMod() != null && this.getFcoMesUltMod().longValue() == -999) {
            conditions += " AND FCO_MES_ULT_MOD IS NULL";
        } else if (this.getFcoMesUltMod() != null) {
            conditions += " AND FCO_MES_ULT_MOD = ?";
            values.add(this.getFcoMesUltMod());
        }

        if (this.getFcoDiaUltMod() != null && this.getFcoDiaUltMod().longValue() == -999) {
            conditions += " AND FCO_DIA_ULT_MOD IS NULL";
        } else if (this.getFcoDiaUltMod() != null) {
            conditions += " AND FCO_DIA_ULT_MOD = ?";
            values.add(this.getFcoDiaUltMod());
        }

        if (this.getFcoCveStFeccont() != null && "null".equals(this.getFcoCveStFeccont())) {
            conditions += " AND FCO_CVE_ST_FECCONT IS NULL";
        } else if (this.getFcoCveStFeccont() != null) {
            conditions += " AND FCO_CVE_ST_FECCONT = ?";
            values.add(this.getFcoCveStFeccont());
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
        String sql = "UPDATE FECCONT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCO_CVE_TIPO_FECHA = ?";
        pkValues.add(this.getFcoCveTipoFecha());
        fields += " FCO_ANO_DIA = ?, ";
        values.add(this.getFcoAnoDia());
        fields += " FCO_MES_DIA = ?, ";
        values.add(this.getFcoMesDia());
        fields += " FCO_DIA_DIA = ?, ";
        values.add(this.getFcoDiaDia());
        fields += " FCO_ANO_APLI_CONTA = ?, ";
        values.add(this.getFcoAnoApliConta());
        fields += " FCO_MES_APLI_CONTA = ?, ";
        values.add(this.getFcoMesApliConta());
        fields += " FCO_DIA_APLI_CONTA = ?, ";
        values.add(this.getFcoDiaApliConta());
        fields += " FCO_ANO_ULT_CIERRE = ?, ";
        values.add(this.getFcoAnoUltCierre());
        fields += " FCO_MES_ULT_CIERRE = ?, ";
        values.add(this.getFcoMesUltCierre());
        fields += " FCO_DIA_ULT_CIERRE = ?, ";
        values.add(this.getFcoDiaUltCierre());
        fields += " FCO_DIAS_OPER_ANO = ?, ";
        values.add(this.getFcoDiasOperAno());
        fields += " FCO_DIAS_OPER_SIST = ?, ";
        values.add(this.getFcoDiasOperSist());
        fields += " FCO_ANO_INI_OPERS = ?, ";
        values.add(this.getFcoAnoIniOpers());
        fields += " FCO_MES_INI_OPERS = ?, ";
        values.add(this.getFcoMesIniOpers());
        fields += " FCO_DIA_INI_OPERS = ?, ";
        values.add(this.getFcoDiaIniOpers());
        fields += " FCO_ANO_ALTA_REG = ?, ";
        values.add(this.getFcoAnoAltaReg());
        fields += " FCO_MES_ALTA_REG = ?, ";
        values.add(this.getFcoMesAltaReg());
        fields += " FCO_DIA_ALTA_REG = ?, ";
        values.add(this.getFcoDiaAltaReg());
        fields += " FCO_ANO_ULT_MOD = ?, ";
        values.add(this.getFcoAnoUltMod());
        fields += " FCO_MES_ULT_MOD = ?, ";
        values.add(this.getFcoMesUltMod());
        fields += " FCO_DIA_ULT_MOD = ?, ";
        values.add(this.getFcoDiaUltMod());
        fields += " FCO_CVE_ST_FECCONT = ?, ";
        values.add(this.getFcoCveStFeccont());
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
        String sql = "INSERT INTO FECCONT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCO_CVE_TIPO_FECHA";
        fieldValues += ", ?";
        values.add(this.getFcoCveTipoFecha());

        fields += ", FCO_ANO_DIA";
        fieldValues += ", ?";
        values.add(this.getFcoAnoDia());

        fields += ", FCO_MES_DIA";
        fieldValues += ", ?";
        values.add(this.getFcoMesDia());

        fields += ", FCO_DIA_DIA";
        fieldValues += ", ?";
        values.add(this.getFcoDiaDia());

        fields += ", FCO_ANO_APLI_CONTA";
        fieldValues += ", ?";
        values.add(this.getFcoAnoApliConta());

        fields += ", FCO_MES_APLI_CONTA";
        fieldValues += ", ?";
        values.add(this.getFcoMesApliConta());

        fields += ", FCO_DIA_APLI_CONTA";
        fieldValues += ", ?";
        values.add(this.getFcoDiaApliConta());

        fields += ", FCO_ANO_ULT_CIERRE";
        fieldValues += ", ?";
        values.add(this.getFcoAnoUltCierre());

        fields += ", FCO_MES_ULT_CIERRE";
        fieldValues += ", ?";
        values.add(this.getFcoMesUltCierre());

        fields += ", FCO_DIA_ULT_CIERRE";
        fieldValues += ", ?";
        values.add(this.getFcoDiaUltCierre());

        fields += ", FCO_DIAS_OPER_ANO";
        fieldValues += ", ?";
        values.add(this.getFcoDiasOperAno());

        fields += ", FCO_DIAS_OPER_SIST";
        fieldValues += ", ?";
        values.add(this.getFcoDiasOperSist());

        fields += ", FCO_ANO_INI_OPERS";
        fieldValues += ", ?";
        values.add(this.getFcoAnoIniOpers());

        fields += ", FCO_MES_INI_OPERS";
        fieldValues += ", ?";
        values.add(this.getFcoMesIniOpers());

        fields += ", FCO_DIA_INI_OPERS";
        fieldValues += ", ?";
        values.add(this.getFcoDiaIniOpers());

        fields += ", FCO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFcoAnoAltaReg());

        fields += ", FCO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFcoMesAltaReg());

        fields += ", FCO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFcoDiaAltaReg());

        fields += ", FCO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFcoAnoUltMod());

        fields += ", FCO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFcoMesUltMod());

        fields += ", FCO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFcoDiaUltMod());

        fields += ", FCO_CVE_ST_FECCONT";
        fieldValues += ", ?";
        values.add(this.getFcoCveStFeccont());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FECCONT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCO_CVE_TIPO_FECHA = ?";
        values.add(this.getFcoCveTipoFecha());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Feccont instance = (Feccont) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcoCveTipoFecha().equals(instance.getFcoCveTipoFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFcoAnoDia().equals(instance.getFcoAnoDia()))
            equalObjects = false;
        if (equalObjects && !this.getFcoMesDia().equals(instance.getFcoMesDia()))
            equalObjects = false;
        if (equalObjects && !this.getFcoDiaDia().equals(instance.getFcoDiaDia()))
            equalObjects = false;
        if (equalObjects && !this.getFcoAnoApliConta().equals(instance.getFcoAnoApliConta()))
            equalObjects = false;
        if (equalObjects && !this.getFcoMesApliConta().equals(instance.getFcoMesApliConta()))
            equalObjects = false;
        if (equalObjects && !this.getFcoDiaApliConta().equals(instance.getFcoDiaApliConta()))
            equalObjects = false;
        if (equalObjects && !this.getFcoAnoUltCierre().equals(instance.getFcoAnoUltCierre()))
            equalObjects = false;
        if (equalObjects && !this.getFcoMesUltCierre().equals(instance.getFcoMesUltCierre()))
            equalObjects = false;
        if (equalObjects && !this.getFcoDiaUltCierre().equals(instance.getFcoDiaUltCierre()))
            equalObjects = false;
        if (equalObjects && !this.getFcoDiasOperAno().equals(instance.getFcoDiasOperAno()))
            equalObjects = false;
        if (equalObjects && !this.getFcoDiasOperSist().equals(instance.getFcoDiasOperSist()))
            equalObjects = false;
        if (equalObjects && !this.getFcoAnoIniOpers().equals(instance.getFcoAnoIniOpers()))
            equalObjects = false;
        if (equalObjects && !this.getFcoMesIniOpers().equals(instance.getFcoMesIniOpers()))
            equalObjects = false;
        if (equalObjects && !this.getFcoDiaIniOpers().equals(instance.getFcoDiaIniOpers()))
            equalObjects = false;
        if (equalObjects && !this.getFcoAnoAltaReg().equals(instance.getFcoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFcoMesAltaReg().equals(instance.getFcoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFcoDiaAltaReg().equals(instance.getFcoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFcoAnoUltMod().equals(instance.getFcoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFcoMesUltMod().equals(instance.getFcoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFcoDiaUltMod().equals(instance.getFcoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFcoCveStFeccont().equals(instance.getFcoCveStFeccont()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Feccont result = new Feccont();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcoCveTipoFecha((String) objectData.getData("FCO_CVE_TIPO_FECHA"));
        result.setFcoAnoDia((BigDecimal) objectData.getData("FCO_ANO_DIA"));
        result.setFcoMesDia((BigDecimal) objectData.getData("FCO_MES_DIA"));
        result.setFcoDiaDia((BigDecimal) objectData.getData("FCO_DIA_DIA"));
        result.setFcoAnoApliConta((BigDecimal) objectData.getData("FCO_ANO_APLI_CONTA"));
        result.setFcoMesApliConta((BigDecimal) objectData.getData("FCO_MES_APLI_CONTA"));
        result.setFcoDiaApliConta((BigDecimal) objectData.getData("FCO_DIA_APLI_CONTA"));
        result.setFcoAnoUltCierre((BigDecimal) objectData.getData("FCO_ANO_ULT_CIERRE"));
        result.setFcoMesUltCierre((BigDecimal) objectData.getData("FCO_MES_ULT_CIERRE"));
        result.setFcoDiaUltCierre((BigDecimal) objectData.getData("FCO_DIA_ULT_CIERRE"));
        result.setFcoDiasOperAno((BigDecimal) objectData.getData("FCO_DIAS_OPER_ANO"));
        result.setFcoDiasOperSist((BigDecimal) objectData.getData("FCO_DIAS_OPER_SIST"));
        result.setFcoAnoIniOpers((BigDecimal) objectData.getData("FCO_ANO_INI_OPERS"));
        result.setFcoMesIniOpers((BigDecimal) objectData.getData("FCO_MES_INI_OPERS"));
        result.setFcoDiaIniOpers((BigDecimal) objectData.getData("FCO_DIA_INI_OPERS"));
        result.setFcoAnoAltaReg((BigDecimal) objectData.getData("FCO_ANO_ALTA_REG"));
        result.setFcoMesAltaReg((BigDecimal) objectData.getData("FCO_MES_ALTA_REG"));
        result.setFcoDiaAltaReg((BigDecimal) objectData.getData("FCO_DIA_ALTA_REG"));
        result.setFcoAnoUltMod((BigDecimal) objectData.getData("FCO_ANO_ULT_MOD"));
        result.setFcoMesUltMod((BigDecimal) objectData.getData("FCO_MES_ULT_MOD"));
        result.setFcoDiaUltMod((BigDecimal) objectData.getData("FCO_DIA_ULT_MOD"));
        result.setFcoCveStFeccont((String) objectData.getData("FCO_CVE_ST_FECCONT"));

        return result;

    }

}
