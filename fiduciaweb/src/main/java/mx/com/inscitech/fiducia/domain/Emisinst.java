package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISINST_PK", columns = { "EIN_NUM_PROGRAMA", "EIN_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emisinst extends DomainObject {

    BigDecimal einNumPrograma = null;
    BigDecimal einNumEmision = null;
    BigDecimal einPlazo = null;
    String einFechaConsiderar = null;
    BigDecimal einCapitaEquival = null;
    BigDecimal einPjeSobretasa = null;
    BigDecimal einPpAdicional = null;
    BigDecimal einIsr = null;
    BigDecimal einImpIsr = null;
    String einMayorMenor = null;
    BigDecimal einAbsolutaTrb = null;
    BigDecimal einPublicadaConocer = null;
    BigDecimal einNumDiasIns = null;
    BigDecimal einAnoAltaReg = null;
    BigDecimal einMesAltaReg = null;
    BigDecimal einDiaAltaReg = null;
    BigDecimal einAnoUltMod = null;
    BigDecimal einMesUltMod = null;
    BigDecimal einDiaUltMod = null;
    String einCveStEmisinst = null;

    public Emisinst() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEinNumPrograma(BigDecimal einNumPrograma) {
        this.einNumPrograma = einNumPrograma;
    }

    public BigDecimal getEinNumPrograma() {
        return this.einNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEinNumEmision(BigDecimal einNumEmision) {
        this.einNumEmision = einNumEmision;
    }

    public BigDecimal getEinNumEmision() {
        return this.einNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinPlazo(BigDecimal einPlazo) {
        this.einPlazo = einPlazo;
    }

    public BigDecimal getEinPlazo() {
        return this.einPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEinFechaConsiderar(String einFechaConsiderar) {
        this.einFechaConsiderar = einFechaConsiderar;
    }

    public String getEinFechaConsiderar() {
        return this.einFechaConsiderar;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinCapitaEquival(BigDecimal einCapitaEquival) {
        this.einCapitaEquival = einCapitaEquival;
    }

    public BigDecimal getEinCapitaEquival() {
        return this.einCapitaEquival;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEinPjeSobretasa(BigDecimal einPjeSobretasa) {
        this.einPjeSobretasa = einPjeSobretasa;
    }

    public BigDecimal getEinPjeSobretasa() {
        return this.einPjeSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinPpAdicional(BigDecimal einPpAdicional) {
        this.einPpAdicional = einPpAdicional;
    }

    public BigDecimal getEinPpAdicional() {
        return this.einPpAdicional;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinIsr(BigDecimal einIsr) {
        this.einIsr = einIsr;
    }

    public BigDecimal getEinIsr() {
        return this.einIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEinImpIsr(BigDecimal einImpIsr) {
        this.einImpIsr = einImpIsr;
    }

    public BigDecimal getEinImpIsr() {
        return this.einImpIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEinMayorMenor(String einMayorMenor) {
        this.einMayorMenor = einMayorMenor;
    }

    public String getEinMayorMenor() {
        return this.einMayorMenor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinAbsolutaTrb(BigDecimal einAbsolutaTrb) {
        this.einAbsolutaTrb = einAbsolutaTrb;
    }

    public BigDecimal getEinAbsolutaTrb() {
        return this.einAbsolutaTrb;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinPublicadaConocer(BigDecimal einPublicadaConocer) {
        this.einPublicadaConocer = einPublicadaConocer;
    }

    public BigDecimal getEinPublicadaConocer() {
        return this.einPublicadaConocer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinNumDiasIns(BigDecimal einNumDiasIns) {
        this.einNumDiasIns = einNumDiasIns;
    }

    public BigDecimal getEinNumDiasIns() {
        return this.einNumDiasIns;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinAnoAltaReg(BigDecimal einAnoAltaReg) {
        this.einAnoAltaReg = einAnoAltaReg;
    }

    public BigDecimal getEinAnoAltaReg() {
        return this.einAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEinMesAltaReg(BigDecimal einMesAltaReg) {
        this.einMesAltaReg = einMesAltaReg;
    }

    public BigDecimal getEinMesAltaReg() {
        return this.einMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEinDiaAltaReg(BigDecimal einDiaAltaReg) {
        this.einDiaAltaReg = einDiaAltaReg;
    }

    public BigDecimal getEinDiaAltaReg() {
        return this.einDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEinAnoUltMod(BigDecimal einAnoUltMod) {
        this.einAnoUltMod = einAnoUltMod;
    }

    public BigDecimal getEinAnoUltMod() {
        return this.einAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEinMesUltMod(BigDecimal einMesUltMod) {
        this.einMesUltMod = einMesUltMod;
    }

    public BigDecimal getEinMesUltMod() {
        return this.einMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEinDiaUltMod(BigDecimal einDiaUltMod) {
        this.einDiaUltMod = einDiaUltMod;
    }

    public BigDecimal getEinDiaUltMod() {
        return this.einDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEinCveStEmisinst(String einCveStEmisinst) {
        this.einCveStEmisinst = einCveStEmisinst;
    }

    public String getEinCveStEmisinst() {
        return this.einCveStEmisinst;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISINST ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEinNumPrograma() != null && this.getEinNumPrograma().longValue() == -999) {
            conditions += " AND EIN_NUM_PROGRAMA IS NULL";
        } else if (this.getEinNumPrograma() != null) {
            conditions += " AND EIN_NUM_PROGRAMA = ?";
            values.add(this.getEinNumPrograma());
        }

        if (this.getEinNumEmision() != null && this.getEinNumEmision().longValue() == -999) {
            conditions += " AND EIN_NUM_EMISION IS NULL";
        } else if (this.getEinNumEmision() != null) {
            conditions += " AND EIN_NUM_EMISION = ?";
            values.add(this.getEinNumEmision());
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
        String sql = "SELECT * FROM EMISINST ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEinNumPrograma() != null && this.getEinNumPrograma().longValue() == -999) {
            conditions += " AND EIN_NUM_PROGRAMA IS NULL";
        } else if (this.getEinNumPrograma() != null) {
            conditions += " AND EIN_NUM_PROGRAMA = ?";
            values.add(this.getEinNumPrograma());
        }

        if (this.getEinNumEmision() != null && this.getEinNumEmision().longValue() == -999) {
            conditions += " AND EIN_NUM_EMISION IS NULL";
        } else if (this.getEinNumEmision() != null) {
            conditions += " AND EIN_NUM_EMISION = ?";
            values.add(this.getEinNumEmision());
        }

        if (this.getEinPlazo() != null && this.getEinPlazo().longValue() == -999) {
            conditions += " AND EIN_PLAZO IS NULL";
        } else if (this.getEinPlazo() != null) {
            conditions += " AND EIN_PLAZO = ?";
            values.add(this.getEinPlazo());
        }

        if (this.getEinFechaConsiderar() != null && "null".equals(this.getEinFechaConsiderar())) {
            conditions += " AND EIN_FECHA_CONSIDERAR IS NULL";
        } else if (this.getEinFechaConsiderar() != null) {
            conditions += " AND EIN_FECHA_CONSIDERAR = ?";
            values.add(this.getEinFechaConsiderar());
        }

        if (this.getEinCapitaEquival() != null && this.getEinCapitaEquival().longValue() == -999) {
            conditions += " AND EIN_CAPITA_EQUIVAL IS NULL";
        } else if (this.getEinCapitaEquival() != null) {
            conditions += " AND EIN_CAPITA_EQUIVAL = ?";
            values.add(this.getEinCapitaEquival());
        }

        if (this.getEinPjeSobretasa() != null && this.getEinPjeSobretasa().longValue() == -999) {
            conditions += " AND EIN_PJE_SOBRETASA IS NULL";
        } else if (this.getEinPjeSobretasa() != null) {
            conditions += " AND EIN_PJE_SOBRETASA = ?";
            values.add(this.getEinPjeSobretasa());
        }

        if (this.getEinPpAdicional() != null && this.getEinPpAdicional().longValue() == -999) {
            conditions += " AND EIN_PP_ADICIONAL IS NULL";
        } else if (this.getEinPpAdicional() != null) {
            conditions += " AND EIN_PP_ADICIONAL = ?";
            values.add(this.getEinPpAdicional());
        }

        if (this.getEinIsr() != null && this.getEinIsr().longValue() == -999) {
            conditions += " AND EIN_ISR IS NULL";
        } else if (this.getEinIsr() != null) {
            conditions += " AND EIN_ISR = ?";
            values.add(this.getEinIsr());
        }

        if (this.getEinImpIsr() != null && this.getEinImpIsr().longValue() == -999) {
            conditions += " AND EIN_IMP_ISR IS NULL";
        } else if (this.getEinImpIsr() != null) {
            conditions += " AND EIN_IMP_ISR = ?";
            values.add(this.getEinImpIsr());
        }

        if (this.getEinMayorMenor() != null && "null".equals(this.getEinMayorMenor())) {
            conditions += " AND EIN_MAYOR_MENOR IS NULL";
        } else if (this.getEinMayorMenor() != null) {
            conditions += " AND EIN_MAYOR_MENOR = ?";
            values.add(this.getEinMayorMenor());
        }

        if (this.getEinAbsolutaTrb() != null && this.getEinAbsolutaTrb().longValue() == -999) {
            conditions += " AND EIN_ABSOLUTA_TRB IS NULL";
        } else if (this.getEinAbsolutaTrb() != null) {
            conditions += " AND EIN_ABSOLUTA_TRB = ?";
            values.add(this.getEinAbsolutaTrb());
        }

        if (this.getEinPublicadaConocer() != null && this.getEinPublicadaConocer().longValue() == -999) {
            conditions += " AND EIN_PUBLICADA_CONOCER IS NULL";
        } else if (this.getEinPublicadaConocer() != null) {
            conditions += " AND EIN_PUBLICADA_CONOCER = ?";
            values.add(this.getEinPublicadaConocer());
        }

        if (this.getEinNumDiasIns() != null && this.getEinNumDiasIns().longValue() == -999) {
            conditions += " AND EIN_NUM_DIAS_INS IS NULL";
        } else if (this.getEinNumDiasIns() != null) {
            conditions += " AND EIN_NUM_DIAS_INS = ?";
            values.add(this.getEinNumDiasIns());
        }

        if (this.getEinAnoAltaReg() != null && this.getEinAnoAltaReg().longValue() == -999) {
            conditions += " AND EIN_ANO_ALTA_REG IS NULL";
        } else if (this.getEinAnoAltaReg() != null) {
            conditions += " AND EIN_ANO_ALTA_REG = ?";
            values.add(this.getEinAnoAltaReg());
        }

        if (this.getEinMesAltaReg() != null && this.getEinMesAltaReg().longValue() == -999) {
            conditions += " AND EIN_MES_ALTA_REG IS NULL";
        } else if (this.getEinMesAltaReg() != null) {
            conditions += " AND EIN_MES_ALTA_REG = ?";
            values.add(this.getEinMesAltaReg());
        }

        if (this.getEinDiaAltaReg() != null && this.getEinDiaAltaReg().longValue() == -999) {
            conditions += " AND EIN_DIA_ALTA_REG IS NULL";
        } else if (this.getEinDiaAltaReg() != null) {
            conditions += " AND EIN_DIA_ALTA_REG = ?";
            values.add(this.getEinDiaAltaReg());
        }

        if (this.getEinAnoUltMod() != null && this.getEinAnoUltMod().longValue() == -999) {
            conditions += " AND EIN_ANO_ULT_MOD IS NULL";
        } else if (this.getEinAnoUltMod() != null) {
            conditions += " AND EIN_ANO_ULT_MOD = ?";
            values.add(this.getEinAnoUltMod());
        }

        if (this.getEinMesUltMod() != null && this.getEinMesUltMod().longValue() == -999) {
            conditions += " AND EIN_MES_ULT_MOD IS NULL";
        } else if (this.getEinMesUltMod() != null) {
            conditions += " AND EIN_MES_ULT_MOD = ?";
            values.add(this.getEinMesUltMod());
        }

        if (this.getEinDiaUltMod() != null && this.getEinDiaUltMod().longValue() == -999) {
            conditions += " AND EIN_DIA_ULT_MOD IS NULL";
        } else if (this.getEinDiaUltMod() != null) {
            conditions += " AND EIN_DIA_ULT_MOD = ?";
            values.add(this.getEinDiaUltMod());
        }

        if (this.getEinCveStEmisinst() != null && "null".equals(this.getEinCveStEmisinst())) {
            conditions += " AND EIN_CVE_ST_EMISINST IS NULL";
        } else if (this.getEinCveStEmisinst() != null) {
            conditions += " AND EIN_CVE_ST_EMISINST = ?";
            values.add(this.getEinCveStEmisinst());
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
        String sql = "UPDATE EMISINST SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EIN_NUM_PROGRAMA = ?";
        pkValues.add(this.getEinNumPrograma());
        conditions += " AND EIN_NUM_EMISION = ?";
        pkValues.add(this.getEinNumEmision());
        fields += " EIN_PLAZO = ?, ";
        values.add(this.getEinPlazo());
        fields += " EIN_FECHA_CONSIDERAR = ?, ";
        values.add(this.getEinFechaConsiderar());
        fields += " EIN_CAPITA_EQUIVAL = ?, ";
        values.add(this.getEinCapitaEquival());
        fields += " EIN_PJE_SOBRETASA = ?, ";
        values.add(this.getEinPjeSobretasa());
        fields += " EIN_PP_ADICIONAL = ?, ";
        values.add(this.getEinPpAdicional());
        fields += " EIN_ISR = ?, ";
        values.add(this.getEinIsr());
        fields += " EIN_IMP_ISR = ?, ";
        values.add(this.getEinImpIsr());
        fields += " EIN_MAYOR_MENOR = ?, ";
        values.add(this.getEinMayorMenor());
        fields += " EIN_ABSOLUTA_TRB = ?, ";
        values.add(this.getEinAbsolutaTrb());
        fields += " EIN_PUBLICADA_CONOCER = ?, ";
        values.add(this.getEinPublicadaConocer());
        fields += " EIN_NUM_DIAS_INS = ?, ";
        values.add(this.getEinNumDiasIns());
        fields += " EIN_ANO_ALTA_REG = ?, ";
        values.add(this.getEinAnoAltaReg());
        fields += " EIN_MES_ALTA_REG = ?, ";
        values.add(this.getEinMesAltaReg());
        fields += " EIN_DIA_ALTA_REG = ?, ";
        values.add(this.getEinDiaAltaReg());
        fields += " EIN_ANO_ULT_MOD = ?, ";
        values.add(this.getEinAnoUltMod());
        fields += " EIN_MES_ULT_MOD = ?, ";
        values.add(this.getEinMesUltMod());
        fields += " EIN_DIA_ULT_MOD = ?, ";
        values.add(this.getEinDiaUltMod());
        fields += " EIN_CVE_ST_EMISINST = ?, ";
        values.add(this.getEinCveStEmisinst());
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
        String sql = "INSERT INTO EMISINST ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EIN_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEinNumPrograma());

        fields += ", EIN_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEinNumEmision());

        fields += ", EIN_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEinPlazo());

        fields += ", EIN_FECHA_CONSIDERAR";
        fieldValues += ", ?";
        values.add(this.getEinFechaConsiderar());

        fields += ", EIN_CAPITA_EQUIVAL";
        fieldValues += ", ?";
        values.add(this.getEinCapitaEquival());

        fields += ", EIN_PJE_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getEinPjeSobretasa());

        fields += ", EIN_PP_ADICIONAL";
        fieldValues += ", ?";
        values.add(this.getEinPpAdicional());

        fields += ", EIN_ISR";
        fieldValues += ", ?";
        values.add(this.getEinIsr());

        fields += ", EIN_IMP_ISR";
        fieldValues += ", ?";
        values.add(this.getEinImpIsr());

        fields += ", EIN_MAYOR_MENOR";
        fieldValues += ", ?";
        values.add(this.getEinMayorMenor());

        fields += ", EIN_ABSOLUTA_TRB";
        fieldValues += ", ?";
        values.add(this.getEinAbsolutaTrb());

        fields += ", EIN_PUBLICADA_CONOCER";
        fieldValues += ", ?";
        values.add(this.getEinPublicadaConocer());

        fields += ", EIN_NUM_DIAS_INS";
        fieldValues += ", ?";
        values.add(this.getEinNumDiasIns());

        fields += ", EIN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEinAnoAltaReg());

        fields += ", EIN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEinMesAltaReg());

        fields += ", EIN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEinDiaAltaReg());

        fields += ", EIN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEinAnoUltMod());

        fields += ", EIN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEinMesUltMod());

        fields += ", EIN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEinDiaUltMod());

        fields += ", EIN_CVE_ST_EMISINST";
        fieldValues += ", ?";
        values.add(this.getEinCveStEmisinst());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISINST WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EIN_NUM_PROGRAMA = ?";
        values.add(this.getEinNumPrograma());
        conditions += " AND EIN_NUM_EMISION = ?";
        values.add(this.getEinNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisinst instance = (Emisinst) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEinNumPrograma().equals(instance.getEinNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEinNumEmision().equals(instance.getEinNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEinPlazo().equals(instance.getEinPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEinFechaConsiderar().equals(instance.getEinFechaConsiderar()))
            equalObjects = false;
        if (equalObjects && !this.getEinCapitaEquival().equals(instance.getEinCapitaEquival()))
            equalObjects = false;
        if (equalObjects && !this.getEinPjeSobretasa().equals(instance.getEinPjeSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getEinPpAdicional().equals(instance.getEinPpAdicional()))
            equalObjects = false;
        if (equalObjects && !this.getEinIsr().equals(instance.getEinIsr()))
            equalObjects = false;
        if (equalObjects && !this.getEinImpIsr().equals(instance.getEinImpIsr()))
            equalObjects = false;
        if (equalObjects && !this.getEinMayorMenor().equals(instance.getEinMayorMenor()))
            equalObjects = false;
        if (equalObjects && !this.getEinAbsolutaTrb().equals(instance.getEinAbsolutaTrb()))
            equalObjects = false;
        if (equalObjects && !this.getEinPublicadaConocer().equals(instance.getEinPublicadaConocer()))
            equalObjects = false;
        if (equalObjects && !this.getEinNumDiasIns().equals(instance.getEinNumDiasIns()))
            equalObjects = false;
        if (equalObjects && !this.getEinAnoAltaReg().equals(instance.getEinAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEinMesAltaReg().equals(instance.getEinMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEinDiaAltaReg().equals(instance.getEinDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEinAnoUltMod().equals(instance.getEinAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEinMesUltMod().equals(instance.getEinMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEinDiaUltMod().equals(instance.getEinDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEinCveStEmisinst().equals(instance.getEinCveStEmisinst()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisinst result = new Emisinst();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEinNumPrograma((BigDecimal) objectData.getData("EIN_NUM_PROGRAMA"));
        result.setEinNumEmision((BigDecimal) objectData.getData("EIN_NUM_EMISION"));
        result.setEinPlazo((BigDecimal) objectData.getData("EIN_PLAZO"));
        result.setEinFechaConsiderar((String) objectData.getData("EIN_FECHA_CONSIDERAR"));
        result.setEinCapitaEquival((BigDecimal) objectData.getData("EIN_CAPITA_EQUIVAL"));
        result.setEinPjeSobretasa((BigDecimal) objectData.getData("EIN_PJE_SOBRETASA"));
        result.setEinPpAdicional((BigDecimal) objectData.getData("EIN_PP_ADICIONAL"));
        result.setEinIsr((BigDecimal) objectData.getData("EIN_ISR"));
        result.setEinImpIsr((BigDecimal) objectData.getData("EIN_IMP_ISR"));
        result.setEinMayorMenor((String) objectData.getData("EIN_MAYOR_MENOR"));
        result.setEinAbsolutaTrb((BigDecimal) objectData.getData("EIN_ABSOLUTA_TRB"));
        result.setEinPublicadaConocer((BigDecimal) objectData.getData("EIN_PUBLICADA_CONOCER"));
        result.setEinNumDiasIns((BigDecimal) objectData.getData("EIN_NUM_DIAS_INS"));
        result.setEinAnoAltaReg((BigDecimal) objectData.getData("EIN_ANO_ALTA_REG"));
        result.setEinMesAltaReg((BigDecimal) objectData.getData("EIN_MES_ALTA_REG"));
        result.setEinDiaAltaReg((BigDecimal) objectData.getData("EIN_DIA_ALTA_REG"));
        result.setEinAnoUltMod((BigDecimal) objectData.getData("EIN_ANO_ULT_MOD"));
        result.setEinMesUltMod((BigDecimal) objectData.getData("EIN_MES_ULT_MOD"));
        result.setEinDiaUltMod((BigDecimal) objectData.getData("EIN_DIA_ULT_MOD"));
        result.setEinCveStEmisinst((String) objectData.getData("EIN_CVE_ST_EMISINST"));

        return result;

    }

}
