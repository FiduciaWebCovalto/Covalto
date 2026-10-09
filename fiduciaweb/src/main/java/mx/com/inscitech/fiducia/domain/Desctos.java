package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DESCTOS_PK", columns = { "DES_SUB_CONTRATO", "DES_NUM_MES", "DES_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Desctos extends DomainObject {

    BigDecimal desNumContrato = null;
    BigDecimal desSubContrato = null;
    BigDecimal desNumMes = null;
    String desNomContrato = null;
    BigDecimal desValorFondo = null;
    BigDecimal desImpLiquidez = null;
    BigDecimal desImpValorMc = null;
    BigDecimal desImpValorMd = null;
    BigDecimal desValorFondos = null;
    BigDecimal desValorMonExt = null;
    BigDecimal desValorGarantia = null;
    BigDecimal desImpDepositos = null;
    BigDecimal desImpRetiros = null;
    BigDecimal desImpHonorarios = null;
    BigDecimal desImpMoratorios = null;
    BigDecimal desNumDepositos = null;
    BigDecimal desNumRetiros = null;
    BigDecimal desPeriodosPend = null;
    BigDecimal desAnoAltaReg = null;
    BigDecimal desMesAltaReg = null;
    BigDecimal desDiaAltaReg = null;
    BigDecimal desAnoUltMod = null;
    BigDecimal desMesUltMod = null;
    BigDecimal desDiaUltMod = null;
    String desCveStDesctos = null;

    public Desctos() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDesNumContrato(BigDecimal desNumContrato) {
        this.desNumContrato = desNumContrato;
    }

    public BigDecimal getDesNumContrato() {
        return this.desNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDesSubContrato(BigDecimal desSubContrato) {
        this.desSubContrato = desSubContrato;
    }

    public BigDecimal getDesSubContrato() {
        return this.desSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDesNumMes(BigDecimal desNumMes) {
        this.desNumMes = desNumMes;
    }

    public BigDecimal getDesNumMes() {
        return this.desNumMes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDesNomContrato(String desNomContrato) {
        this.desNomContrato = desNomContrato;
    }

    public String getDesNomContrato() {
        return this.desNomContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesValorFondo(BigDecimal desValorFondo) {
        this.desValorFondo = desValorFondo;
    }

    public BigDecimal getDesValorFondo() {
        return this.desValorFondo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesImpLiquidez(BigDecimal desImpLiquidez) {
        this.desImpLiquidez = desImpLiquidez;
    }

    public BigDecimal getDesImpLiquidez() {
        return this.desImpLiquidez;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesImpValorMc(BigDecimal desImpValorMc) {
        this.desImpValorMc = desImpValorMc;
    }

    public BigDecimal getDesImpValorMc() {
        return this.desImpValorMc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesImpValorMd(BigDecimal desImpValorMd) {
        this.desImpValorMd = desImpValorMd;
    }

    public BigDecimal getDesImpValorMd() {
        return this.desImpValorMd;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesValorFondos(BigDecimal desValorFondos) {
        this.desValorFondos = desValorFondos;
    }

    public BigDecimal getDesValorFondos() {
        return this.desValorFondos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesValorMonExt(BigDecimal desValorMonExt) {
        this.desValorMonExt = desValorMonExt;
    }

    public BigDecimal getDesValorMonExt() {
        return this.desValorMonExt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesValorGarantia(BigDecimal desValorGarantia) {
        this.desValorGarantia = desValorGarantia;
    }

    public BigDecimal getDesValorGarantia() {
        return this.desValorGarantia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesImpDepositos(BigDecimal desImpDepositos) {
        this.desImpDepositos = desImpDepositos;
    }

    public BigDecimal getDesImpDepositos() {
        return this.desImpDepositos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesImpRetiros(BigDecimal desImpRetiros) {
        this.desImpRetiros = desImpRetiros;
    }

    public BigDecimal getDesImpRetiros() {
        return this.desImpRetiros;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesImpHonorarios(BigDecimal desImpHonorarios) {
        this.desImpHonorarios = desImpHonorarios;
    }

    public BigDecimal getDesImpHonorarios() {
        return this.desImpHonorarios;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDesImpMoratorios(BigDecimal desImpMoratorios) {
        this.desImpMoratorios = desImpMoratorios;
    }

    public BigDecimal getDesImpMoratorios() {
        return this.desImpMoratorios;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDesNumDepositos(BigDecimal desNumDepositos) {
        this.desNumDepositos = desNumDepositos;
    }

    public BigDecimal getDesNumDepositos() {
        return this.desNumDepositos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDesNumRetiros(BigDecimal desNumRetiros) {
        this.desNumRetiros = desNumRetiros;
    }

    public BigDecimal getDesNumRetiros() {
        return this.desNumRetiros;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDesPeriodosPend(BigDecimal desPeriodosPend) {
        this.desPeriodosPend = desPeriodosPend;
    }

    public BigDecimal getDesPeriodosPend() {
        return this.desPeriodosPend;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDesAnoAltaReg(BigDecimal desAnoAltaReg) {
        this.desAnoAltaReg = desAnoAltaReg;
    }

    public BigDecimal getDesAnoAltaReg() {
        return this.desAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDesMesAltaReg(BigDecimal desMesAltaReg) {
        this.desMesAltaReg = desMesAltaReg;
    }

    public BigDecimal getDesMesAltaReg() {
        return this.desMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDesDiaAltaReg(BigDecimal desDiaAltaReg) {
        this.desDiaAltaReg = desDiaAltaReg;
    }

    public BigDecimal getDesDiaAltaReg() {
        return this.desDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDesAnoUltMod(BigDecimal desAnoUltMod) {
        this.desAnoUltMod = desAnoUltMod;
    }

    public BigDecimal getDesAnoUltMod() {
        return this.desAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDesMesUltMod(BigDecimal desMesUltMod) {
        this.desMesUltMod = desMesUltMod;
    }

    public BigDecimal getDesMesUltMod() {
        return this.desMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDesDiaUltMod(BigDecimal desDiaUltMod) {
        this.desDiaUltMod = desDiaUltMod;
    }

    public BigDecimal getDesDiaUltMod() {
        return this.desDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDesCveStDesctos(String desCveStDesctos) {
        this.desCveStDesctos = desCveStDesctos;
    }

    public String getDesCveStDesctos() {
        return this.desCveStDesctos;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DESCTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDesNumContrato() != null && this.getDesNumContrato().longValue() == -999) {
            conditions += " AND DES_NUM_CONTRATO IS NULL";
        } else if (this.getDesNumContrato() != null) {
            conditions += " AND DES_NUM_CONTRATO = ?";
            values.add(this.getDesNumContrato());
        }

        if (this.getDesSubContrato() != null && this.getDesSubContrato().longValue() == -999) {
            conditions += " AND DES_SUB_CONTRATO IS NULL";
        } else if (this.getDesSubContrato() != null) {
            conditions += " AND DES_SUB_CONTRATO = ?";
            values.add(this.getDesSubContrato());
        }

        if (this.getDesNumMes() != null && this.getDesNumMes().longValue() == -999) {
            conditions += " AND DES_NUM_MES IS NULL";
        } else if (this.getDesNumMes() != null) {
            conditions += " AND DES_NUM_MES = ?";
            values.add(this.getDesNumMes());
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
        String sql = "SELECT * FROM DESCTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDesNumContrato() != null && this.getDesNumContrato().longValue() == -999) {
            conditions += " AND DES_NUM_CONTRATO IS NULL";
        } else if (this.getDesNumContrato() != null) {
            conditions += " AND DES_NUM_CONTRATO = ?";
            values.add(this.getDesNumContrato());
        }

        if (this.getDesSubContrato() != null && this.getDesSubContrato().longValue() == -999) {
            conditions += " AND DES_SUB_CONTRATO IS NULL";
        } else if (this.getDesSubContrato() != null) {
            conditions += " AND DES_SUB_CONTRATO = ?";
            values.add(this.getDesSubContrato());
        }

        if (this.getDesNumMes() != null && this.getDesNumMes().longValue() == -999) {
            conditions += " AND DES_NUM_MES IS NULL";
        } else if (this.getDesNumMes() != null) {
            conditions += " AND DES_NUM_MES = ?";
            values.add(this.getDesNumMes());
        }

        if (this.getDesNomContrato() != null && "null".equals(this.getDesNomContrato())) {
            conditions += " AND DES_NOM_CONTRATO IS NULL";
        } else if (this.getDesNomContrato() != null) {
            conditions += " AND DES_NOM_CONTRATO = ?";
            values.add(this.getDesNomContrato());
        }

        if (this.getDesValorFondo() != null && this.getDesValorFondo().longValue() == -999) {
            conditions += " AND DES_VALOR_FONDO IS NULL";
        } else if (this.getDesValorFondo() != null) {
            conditions += " AND DES_VALOR_FONDO = ?";
            values.add(this.getDesValorFondo());
        }

        if (this.getDesImpLiquidez() != null && this.getDesImpLiquidez().longValue() == -999) {
            conditions += " AND DES_IMP_LIQUIDEZ IS NULL";
        } else if (this.getDesImpLiquidez() != null) {
            conditions += " AND DES_IMP_LIQUIDEZ = ?";
            values.add(this.getDesImpLiquidez());
        }

        if (this.getDesImpValorMc() != null && this.getDesImpValorMc().longValue() == -999) {
            conditions += " AND DES_IMP_VALOR_MC IS NULL";
        } else if (this.getDesImpValorMc() != null) {
            conditions += " AND DES_IMP_VALOR_MC = ?";
            values.add(this.getDesImpValorMc());
        }

        if (this.getDesImpValorMd() != null && this.getDesImpValorMd().longValue() == -999) {
            conditions += " AND DES_IMP_VALOR_MD IS NULL";
        } else if (this.getDesImpValorMd() != null) {
            conditions += " AND DES_IMP_VALOR_MD = ?";
            values.add(this.getDesImpValorMd());
        }

        if (this.getDesValorFondos() != null && this.getDesValorFondos().longValue() == -999) {
            conditions += " AND DES_VALOR_FONDOS IS NULL";
        } else if (this.getDesValorFondos() != null) {
            conditions += " AND DES_VALOR_FONDOS = ?";
            values.add(this.getDesValorFondos());
        }

        if (this.getDesValorMonExt() != null && this.getDesValorMonExt().longValue() == -999) {
            conditions += " AND DES_VALOR_MON_EXT IS NULL";
        } else if (this.getDesValorMonExt() != null) {
            conditions += " AND DES_VALOR_MON_EXT = ?";
            values.add(this.getDesValorMonExt());
        }

        if (this.getDesValorGarantia() != null && this.getDesValorGarantia().longValue() == -999) {
            conditions += " AND DES_VALOR_GARANTIA IS NULL";
        } else if (this.getDesValorGarantia() != null) {
            conditions += " AND DES_VALOR_GARANTIA = ?";
            values.add(this.getDesValorGarantia());
        }

        if (this.getDesImpDepositos() != null && this.getDesImpDepositos().longValue() == -999) {
            conditions += " AND DES_IMP_DEPOSITOS IS NULL";
        } else if (this.getDesImpDepositos() != null) {
            conditions += " AND DES_IMP_DEPOSITOS = ?";
            values.add(this.getDesImpDepositos());
        }

        if (this.getDesImpRetiros() != null && this.getDesImpRetiros().longValue() == -999) {
            conditions += " AND DES_IMP_RETIROS IS NULL";
        } else if (this.getDesImpRetiros() != null) {
            conditions += " AND DES_IMP_RETIROS = ?";
            values.add(this.getDesImpRetiros());
        }

        if (this.getDesImpHonorarios() != null && this.getDesImpHonorarios().longValue() == -999) {
            conditions += " AND DES_IMP_HONORARIOS IS NULL";
        } else if (this.getDesImpHonorarios() != null) {
            conditions += " AND DES_IMP_HONORARIOS = ?";
            values.add(this.getDesImpHonorarios());
        }

        if (this.getDesImpMoratorios() != null && this.getDesImpMoratorios().longValue() == -999) {
            conditions += " AND DES_IMP_MORATORIOS IS NULL";
        } else if (this.getDesImpMoratorios() != null) {
            conditions += " AND DES_IMP_MORATORIOS = ?";
            values.add(this.getDesImpMoratorios());
        }

        if (this.getDesNumDepositos() != null && this.getDesNumDepositos().longValue() == -999) {
            conditions += " AND DES_NUM_DEPOSITOS IS NULL";
        } else if (this.getDesNumDepositos() != null) {
            conditions += " AND DES_NUM_DEPOSITOS = ?";
            values.add(this.getDesNumDepositos());
        }

        if (this.getDesNumRetiros() != null && this.getDesNumRetiros().longValue() == -999) {
            conditions += " AND DES_NUM_RETIROS IS NULL";
        } else if (this.getDesNumRetiros() != null) {
            conditions += " AND DES_NUM_RETIROS = ?";
            values.add(this.getDesNumRetiros());
        }

        if (this.getDesPeriodosPend() != null && this.getDesPeriodosPend().longValue() == -999) {
            conditions += " AND DES_PERIODOS_PEND IS NULL";
        } else if (this.getDesPeriodosPend() != null) {
            conditions += " AND DES_PERIODOS_PEND = ?";
            values.add(this.getDesPeriodosPend());
        }

        if (this.getDesAnoAltaReg() != null && this.getDesAnoAltaReg().longValue() == -999) {
            conditions += " AND DES_ANO_ALTA_REG IS NULL";
        } else if (this.getDesAnoAltaReg() != null) {
            conditions += " AND DES_ANO_ALTA_REG = ?";
            values.add(this.getDesAnoAltaReg());
        }

        if (this.getDesMesAltaReg() != null && this.getDesMesAltaReg().longValue() == -999) {
            conditions += " AND DES_MES_ALTA_REG IS NULL";
        } else if (this.getDesMesAltaReg() != null) {
            conditions += " AND DES_MES_ALTA_REG = ?";
            values.add(this.getDesMesAltaReg());
        }

        if (this.getDesDiaAltaReg() != null && this.getDesDiaAltaReg().longValue() == -999) {
            conditions += " AND DES_DIA_ALTA_REG IS NULL";
        } else if (this.getDesDiaAltaReg() != null) {
            conditions += " AND DES_DIA_ALTA_REG = ?";
            values.add(this.getDesDiaAltaReg());
        }

        if (this.getDesAnoUltMod() != null && this.getDesAnoUltMod().longValue() == -999) {
            conditions += " AND DES_ANO_ULT_MOD IS NULL";
        } else if (this.getDesAnoUltMod() != null) {
            conditions += " AND DES_ANO_ULT_MOD = ?";
            values.add(this.getDesAnoUltMod());
        }

        if (this.getDesMesUltMod() != null && this.getDesMesUltMod().longValue() == -999) {
            conditions += " AND DES_MES_ULT_MOD IS NULL";
        } else if (this.getDesMesUltMod() != null) {
            conditions += " AND DES_MES_ULT_MOD = ?";
            values.add(this.getDesMesUltMod());
        }

        if (this.getDesDiaUltMod() != null && this.getDesDiaUltMod().longValue() == -999) {
            conditions += " AND DES_DIA_ULT_MOD IS NULL";
        } else if (this.getDesDiaUltMod() != null) {
            conditions += " AND DES_DIA_ULT_MOD = ?";
            values.add(this.getDesDiaUltMod());
        }

        if (this.getDesCveStDesctos() != null && "null".equals(this.getDesCveStDesctos())) {
            conditions += " AND DES_CVE_ST_DESCTOS IS NULL";
        } else if (this.getDesCveStDesctos() != null) {
            conditions += " AND DES_CVE_ST_DESCTOS = ?";
            values.add(this.getDesCveStDesctos());
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
        String sql = "UPDATE DESCTOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DES_NUM_CONTRATO = ?";
        pkValues.add(this.getDesNumContrato());
        conditions += " AND DES_SUB_CONTRATO = ?";
        pkValues.add(this.getDesSubContrato());
        conditions += " AND DES_NUM_MES = ?";
        pkValues.add(this.getDesNumMes());
        fields += " DES_NOM_CONTRATO = ?, ";
        values.add(this.getDesNomContrato());
        fields += " DES_VALOR_FONDO = ?, ";
        values.add(this.getDesValorFondo());
        fields += " DES_IMP_LIQUIDEZ = ?, ";
        values.add(this.getDesImpLiquidez());
        fields += " DES_IMP_VALOR_MC = ?, ";
        values.add(this.getDesImpValorMc());
        fields += " DES_IMP_VALOR_MD = ?, ";
        values.add(this.getDesImpValorMd());
        fields += " DES_VALOR_FONDOS = ?, ";
        values.add(this.getDesValorFondos());
        fields += " DES_VALOR_MON_EXT = ?, ";
        values.add(this.getDesValorMonExt());
        fields += " DES_VALOR_GARANTIA = ?, ";
        values.add(this.getDesValorGarantia());
        fields += " DES_IMP_DEPOSITOS = ?, ";
        values.add(this.getDesImpDepositos());
        fields += " DES_IMP_RETIROS = ?, ";
        values.add(this.getDesImpRetiros());
        fields += " DES_IMP_HONORARIOS = ?, ";
        values.add(this.getDesImpHonorarios());
        fields += " DES_IMP_MORATORIOS = ?, ";
        values.add(this.getDesImpMoratorios());
        fields += " DES_NUM_DEPOSITOS = ?, ";
        values.add(this.getDesNumDepositos());
        fields += " DES_NUM_RETIROS = ?, ";
        values.add(this.getDesNumRetiros());
        fields += " DES_PERIODOS_PEND = ?, ";
        values.add(this.getDesPeriodosPend());
        fields += " DES_ANO_ALTA_REG = ?, ";
        values.add(this.getDesAnoAltaReg());
        fields += " DES_MES_ALTA_REG = ?, ";
        values.add(this.getDesMesAltaReg());
        fields += " DES_DIA_ALTA_REG = ?, ";
        values.add(this.getDesDiaAltaReg());
        fields += " DES_ANO_ULT_MOD = ?, ";
        values.add(this.getDesAnoUltMod());
        fields += " DES_MES_ULT_MOD = ?, ";
        values.add(this.getDesMesUltMod());
        fields += " DES_DIA_ULT_MOD = ?, ";
        values.add(this.getDesDiaUltMod());
        fields += " DES_CVE_ST_DESCTOS = ?, ";
        values.add(this.getDesCveStDesctos());
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
        String sql = "INSERT INTO DESCTOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DES_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDesNumContrato());

        fields += ", DES_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDesSubContrato());

        fields += ", DES_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getDesNumMes());

        fields += ", DES_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDesNomContrato());

        fields += ", DES_VALOR_FONDO";
        fieldValues += ", ?";
        values.add(this.getDesValorFondo());

        fields += ", DES_IMP_LIQUIDEZ";
        fieldValues += ", ?";
        values.add(this.getDesImpLiquidez());

        fields += ", DES_IMP_VALOR_MC";
        fieldValues += ", ?";
        values.add(this.getDesImpValorMc());

        fields += ", DES_IMP_VALOR_MD";
        fieldValues += ", ?";
        values.add(this.getDesImpValorMd());

        fields += ", DES_VALOR_FONDOS";
        fieldValues += ", ?";
        values.add(this.getDesValorFondos());

        fields += ", DES_VALOR_MON_EXT";
        fieldValues += ", ?";
        values.add(this.getDesValorMonExt());

        fields += ", DES_VALOR_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getDesValorGarantia());

        fields += ", DES_IMP_DEPOSITOS";
        fieldValues += ", ?";
        values.add(this.getDesImpDepositos());

        fields += ", DES_IMP_RETIROS";
        fieldValues += ", ?";
        values.add(this.getDesImpRetiros());

        fields += ", DES_IMP_HONORARIOS";
        fieldValues += ", ?";
        values.add(this.getDesImpHonorarios());

        fields += ", DES_IMP_MORATORIOS";
        fieldValues += ", ?";
        values.add(this.getDesImpMoratorios());

        fields += ", DES_NUM_DEPOSITOS";
        fieldValues += ", ?";
        values.add(this.getDesNumDepositos());

        fields += ", DES_NUM_RETIROS";
        fieldValues += ", ?";
        values.add(this.getDesNumRetiros());

        fields += ", DES_PERIODOS_PEND";
        fieldValues += ", ?";
        values.add(this.getDesPeriodosPend());

        fields += ", DES_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDesAnoAltaReg());

        fields += ", DES_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDesMesAltaReg());

        fields += ", DES_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDesDiaAltaReg());

        fields += ", DES_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDesAnoUltMod());

        fields += ", DES_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDesMesUltMod());

        fields += ", DES_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDesDiaUltMod());

        fields += ", DES_CVE_ST_DESCTOS";
        fieldValues += ", ?";
        values.add(this.getDesCveStDesctos());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DESCTOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DES_NUM_CONTRATO = ?";
        values.add(this.getDesNumContrato());
        conditions += " AND DES_SUB_CONTRATO = ?";
        values.add(this.getDesSubContrato());
        conditions += " AND DES_NUM_MES = ?";
        values.add(this.getDesNumMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Desctos instance = (Desctos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDesNumContrato().equals(instance.getDesNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDesSubContrato().equals(instance.getDesSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDesNumMes().equals(instance.getDesNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getDesNomContrato().equals(instance.getDesNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDesValorFondo().equals(instance.getDesValorFondo()))
            equalObjects = false;
        if (equalObjects && !this.getDesImpLiquidez().equals(instance.getDesImpLiquidez()))
            equalObjects = false;
        if (equalObjects && !this.getDesImpValorMc().equals(instance.getDesImpValorMc()))
            equalObjects = false;
        if (equalObjects && !this.getDesImpValorMd().equals(instance.getDesImpValorMd()))
            equalObjects = false;
        if (equalObjects && !this.getDesValorFondos().equals(instance.getDesValorFondos()))
            equalObjects = false;
        if (equalObjects && !this.getDesValorMonExt().equals(instance.getDesValorMonExt()))
            equalObjects = false;
        if (equalObjects && !this.getDesValorGarantia().equals(instance.getDesValorGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getDesImpDepositos().equals(instance.getDesImpDepositos()))
            equalObjects = false;
        if (equalObjects && !this.getDesImpRetiros().equals(instance.getDesImpRetiros()))
            equalObjects = false;
        if (equalObjects && !this.getDesImpHonorarios().equals(instance.getDesImpHonorarios()))
            equalObjects = false;
        if (equalObjects && !this.getDesImpMoratorios().equals(instance.getDesImpMoratorios()))
            equalObjects = false;
        if (equalObjects && !this.getDesNumDepositos().equals(instance.getDesNumDepositos()))
            equalObjects = false;
        if (equalObjects && !this.getDesNumRetiros().equals(instance.getDesNumRetiros()))
            equalObjects = false;
        if (equalObjects && !this.getDesPeriodosPend().equals(instance.getDesPeriodosPend()))
            equalObjects = false;
        if (equalObjects && !this.getDesAnoAltaReg().equals(instance.getDesAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDesMesAltaReg().equals(instance.getDesMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDesDiaAltaReg().equals(instance.getDesDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDesAnoUltMod().equals(instance.getDesAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDesMesUltMod().equals(instance.getDesMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDesDiaUltMod().equals(instance.getDesDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDesCveStDesctos().equals(instance.getDesCveStDesctos()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Desctos result = new Desctos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDesNumContrato((BigDecimal) objectData.getData("DES_NUM_CONTRATO"));
        result.setDesSubContrato((BigDecimal) objectData.getData("DES_SUB_CONTRATO"));
        result.setDesNumMes((BigDecimal) objectData.getData("DES_NUM_MES"));
        result.setDesNomContrato((String) objectData.getData("DES_NOM_CONTRATO"));
        result.setDesValorFondo((BigDecimal) objectData.getData("DES_VALOR_FONDO"));
        result.setDesImpLiquidez((BigDecimal) objectData.getData("DES_IMP_LIQUIDEZ"));
        result.setDesImpValorMc((BigDecimal) objectData.getData("DES_IMP_VALOR_MC"));
        result.setDesImpValorMd((BigDecimal) objectData.getData("DES_IMP_VALOR_MD"));
        result.setDesValorFondos((BigDecimal) objectData.getData("DES_VALOR_FONDOS"));
        result.setDesValorMonExt((BigDecimal) objectData.getData("DES_VALOR_MON_EXT"));
        result.setDesValorGarantia((BigDecimal) objectData.getData("DES_VALOR_GARANTIA"));
        result.setDesImpDepositos((BigDecimal) objectData.getData("DES_IMP_DEPOSITOS"));
        result.setDesImpRetiros((BigDecimal) objectData.getData("DES_IMP_RETIROS"));
        result.setDesImpHonorarios((BigDecimal) objectData.getData("DES_IMP_HONORARIOS"));
        result.setDesImpMoratorios((BigDecimal) objectData.getData("DES_IMP_MORATORIOS"));
        result.setDesNumDepositos((BigDecimal) objectData.getData("DES_NUM_DEPOSITOS"));
        result.setDesNumRetiros((BigDecimal) objectData.getData("DES_NUM_RETIROS"));
        result.setDesPeriodosPend((BigDecimal) objectData.getData("DES_PERIODOS_PEND"));
        result.setDesAnoAltaReg((BigDecimal) objectData.getData("DES_ANO_ALTA_REG"));
        result.setDesMesAltaReg((BigDecimal) objectData.getData("DES_MES_ALTA_REG"));
        result.setDesDiaAltaReg((BigDecimal) objectData.getData("DES_DIA_ALTA_REG"));
        result.setDesAnoUltMod((BigDecimal) objectData.getData("DES_ANO_ULT_MOD"));
        result.setDesMesUltMod((BigDecimal) objectData.getData("DES_MES_ULT_MOD"));
        result.setDesDiaUltMod((BigDecimal) objectData.getData("DES_DIA_ULT_MOD"));
        result.setDesCveStDesctos((String) objectData.getData("DES_CVE_ST_DESCTOS"));

        return result;

    }

}
