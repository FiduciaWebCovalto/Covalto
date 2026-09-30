package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DATOSCALCULO_PK", columns = { "DAT_ENT_CLAVE", "DAT_FECHA" }, sequences = { "MANUAL" })
public class Datoscalculo extends DomainObject {

    String datFecha = null;
    BigDecimal datTasa = null;
    BigDecimal datCveTipoMerca = null;
    BigDecimal datNumInstrume = null;
    BigDecimal datAnoAltaReg = null;
    BigDecimal datMesAltaReg = null;
    BigDecimal datDiaAltaReg = null;
    BigDecimal datAnoUltMod = null;
    BigDecimal datMesUltMod = null;
    BigDecimal datDiaUltMod = null;
    String datCveStDatoscalc = null;
    BigDecimal datEntClave = null;
    BigDecimal datCveRetIsr = null;
    String datFechaAl = null;
    String datFechaDel = null;
    BigDecimal datTasaIsr = new BigDecimal(0.0085);

    public Datoscalculo() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setDatFecha(String datFecha) {
        this.datFecha = datFecha;
    }

    public String getDatFecha() {
        return this.datFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 11, scale = 8, javaClass = BigDecimal.class)
    public void setDatTasa(BigDecimal datTasa) {
        this.datTasa = datTasa;
    }

    public BigDecimal getDatTasa() {
        return this.datTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDatCveTipoMerca(BigDecimal datCveTipoMerca) {
        this.datCveTipoMerca = datCveTipoMerca;
    }

    public BigDecimal getDatCveTipoMerca() {
        return this.datCveTipoMerca;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDatNumInstrume(BigDecimal datNumInstrume) {
        this.datNumInstrume = datNumInstrume;
    }

    public BigDecimal getDatNumInstrume() {
        return this.datNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDatAnoAltaReg(BigDecimal datAnoAltaReg) {
        this.datAnoAltaReg = datAnoAltaReg;
    }

    public BigDecimal getDatAnoAltaReg() {
        return this.datAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDatMesAltaReg(BigDecimal datMesAltaReg) {
        this.datMesAltaReg = datMesAltaReg;
    }

    public BigDecimal getDatMesAltaReg() {
        return this.datMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDatDiaAltaReg(BigDecimal datDiaAltaReg) {
        this.datDiaAltaReg = datDiaAltaReg;
    }

    public BigDecimal getDatDiaAltaReg() {
        return this.datDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDatAnoUltMod(BigDecimal datAnoUltMod) {
        this.datAnoUltMod = datAnoUltMod;
    }

    public BigDecimal getDatAnoUltMod() {
        return this.datAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDatMesUltMod(BigDecimal datMesUltMod) {
        this.datMesUltMod = datMesUltMod;
    }

    public BigDecimal getDatMesUltMod() {
        return this.datMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDatDiaUltMod(BigDecimal datDiaUltMod) {
        this.datDiaUltMod = datDiaUltMod;
    }

    public BigDecimal getDatDiaUltMod() {
        return this.datDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDatCveStDatoscalc(String datCveStDatoscalc) {
        this.datCveStDatoscalc = datCveStDatoscalc;
    }

    public String getDatCveStDatoscalc() {
        return this.datCveStDatoscalc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDatEntClave(BigDecimal datEntClave) {
        this.datEntClave = datEntClave;
    }

    public BigDecimal getDatEntClave() {
        return this.datEntClave;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setDatCveRetIsr(BigDecimal datCveRetIsr) {
        this.datCveRetIsr = datCveRetIsr;
    }

    public BigDecimal getDatCveRetIsr() {
        return this.datCveRetIsr;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setDatFechaAl(String datFechaAl) {
        this.datFechaAl = datFechaAl;
    }

    public String getDatFechaAl() {
        return this.datFechaAl;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setDatFechaDel(String datFechaDel) {
        this.datFechaDel = datFechaDel;
    }

    public String getDatFechaDel() {
        return this.datFechaDel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 4, javaClass = BigDecimal.class)
    public void setDatTasaIsr(BigDecimal datTasaIsr) {
        this.datTasaIsr = datTasaIsr;
    }

    public BigDecimal getDatTasaIsr() {
        return this.datTasaIsr;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DATOSCALCULO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDatFecha() != null && "null".equals(this.getDatFecha())) {
            conditions += " AND DAT_FECHA IS NULL";
        } else if (this.getDatFecha() != null) {
            conditions += " AND DAT_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDatFecha());
        }

        if (this.getDatEntClave() != null && this.getDatEntClave().longValue() == -999) {
            conditions += " AND DAT_ENT_CLAVE IS NULL";
        } else if (this.getDatEntClave() != null) {
            conditions += " AND DAT_ENT_CLAVE = ?";
            values.add(this.getDatEntClave());
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
        String sql = "SELECT * FROM DATOSCALCULO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDatFecha() != null && "null".equals(this.getDatFecha())) {
            conditions += " AND DAT_FECHA IS NULL";
        } else if (this.getDatFecha() != null) {
            conditions += " AND DAT_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDatFecha());
        }

        if (this.getDatTasa() != null && this.getDatTasa().longValue() == -999) {
            conditions += " AND DAT_TASA IS NULL";
        } else if (this.getDatTasa() != null) {
            conditions += " AND DAT_TASA = ?";
            values.add(this.getDatTasa());
        }

        if (this.getDatCveTipoMerca() != null && this.getDatCveTipoMerca().longValue() == -999) {
            conditions += " AND DAT_CVE_TIPO_MERCA IS NULL";
        } else if (this.getDatCveTipoMerca() != null) {
            conditions += " AND DAT_CVE_TIPO_MERCA = ?";
            values.add(this.getDatCveTipoMerca());
        }

        if (this.getDatNumInstrume() != null && this.getDatNumInstrume().longValue() == -999) {
            conditions += " AND DAT_NUM_INSTRUME IS NULL";
        } else if (this.getDatNumInstrume() != null) {
            conditions += " AND DAT_NUM_INSTRUME = ?";
            values.add(this.getDatNumInstrume());
        }

        if (this.getDatAnoAltaReg() != null && this.getDatAnoAltaReg().longValue() == -999) {
            conditions += " AND DAT_ANO_ALTA_REG IS NULL";
        } else if (this.getDatAnoAltaReg() != null) {
            conditions += " AND DAT_ANO_ALTA_REG = ?";
            values.add(this.getDatAnoAltaReg());
        }

        if (this.getDatMesAltaReg() != null && this.getDatMesAltaReg().longValue() == -999) {
            conditions += " AND DAT_MES_ALTA_REG IS NULL";
        } else if (this.getDatMesAltaReg() != null) {
            conditions += " AND DAT_MES_ALTA_REG = ?";
            values.add(this.getDatMesAltaReg());
        }

        if (this.getDatDiaAltaReg() != null && this.getDatDiaAltaReg().longValue() == -999) {
            conditions += " AND DAT_DIA_ALTA_REG IS NULL";
        } else if (this.getDatDiaAltaReg() != null) {
            conditions += " AND DAT_DIA_ALTA_REG = ?";
            values.add(this.getDatDiaAltaReg());
        }

        if (this.getDatAnoUltMod() != null && this.getDatAnoUltMod().longValue() == -999) {
            conditions += " AND DAT_ANO_ULT_MOD IS NULL";
        } else if (this.getDatAnoUltMod() != null) {
            conditions += " AND DAT_ANO_ULT_MOD = ?";
            values.add(this.getDatAnoUltMod());
        }

        if (this.getDatMesUltMod() != null && this.getDatMesUltMod().longValue() == -999) {
            conditions += " AND DAT_MES_ULT_MOD IS NULL";
        } else if (this.getDatMesUltMod() != null) {
            conditions += " AND DAT_MES_ULT_MOD = ?";
            values.add(this.getDatMesUltMod());
        }

        if (this.getDatDiaUltMod() != null && this.getDatDiaUltMod().longValue() == -999) {
            conditions += " AND DAT_DIA_ULT_MOD IS NULL";
        } else if (this.getDatDiaUltMod() != null) {
            conditions += " AND DAT_DIA_ULT_MOD = ?";
            values.add(this.getDatDiaUltMod());
        }

        if (this.getDatCveStDatoscalc() != null && "null".equals(this.getDatCveStDatoscalc())) {
            conditions += " AND DAT_CVE_ST_DATOSCALC IS NULL";
        } else if (this.getDatCveStDatoscalc() != null) {
            conditions += " AND DAT_CVE_ST_DATOSCALC = ?";
            values.add(this.getDatCveStDatoscalc());
        }

        if (this.getDatEntClave() != null && this.getDatEntClave().longValue() == -999) {
            conditions += " AND DAT_ENT_CLAVE IS NULL";
        } else if (this.getDatEntClave() != null) {
            conditions += " AND DAT_ENT_CLAVE = ?";
            values.add(this.getDatEntClave());
        }

        if (this.getDatCveRetIsr() != null && this.getDatCveRetIsr().longValue() == -999) {
            conditions += " AND DAT_CVE_RET_ISR IS NULL";
        } else if (this.getDatCveRetIsr() != null) {
            conditions += " AND DAT_CVE_RET_ISR = ?";
            values.add(this.getDatCveRetIsr());
        }

        if (this.getDatFechaAl() != null && "null".equals(this.getDatFechaAl())) {
            conditions += " AND DAT_FECHA_AL IS NULL";
        } else if (this.getDatFechaAl() != null) {
            conditions += " AND DAT_FECHA_AL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDatFechaAl());
        }

        if (this.getDatFechaDel() != null && "null".equals(this.getDatFechaDel())) {
            conditions += " AND DAT_FECHA_DEL IS NULL";
        } else if (this.getDatFechaDel() != null) {
            conditions += " AND DAT_FECHA_DEL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDatFechaDel());
        }

        if (this.getDatTasaIsr() != null && this.getDatTasaIsr().longValue() == -999) {
            conditions += " AND DAT_TASA_ISR IS NULL";
        } else if (this.getDatTasaIsr() != null) {
            conditions += " AND DAT_TASA_ISR = ?";
            values.add(this.getDatTasaIsr());
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
        String sql = "UPDATE DATOSCALCULO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DAT_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getDatFecha());
        fields += " DAT_TASA = ?, ";
        values.add(this.getDatTasa());
        fields += " DAT_CVE_TIPO_MERCA = ?, ";
        values.add(this.getDatCveTipoMerca());
        fields += " DAT_NUM_INSTRUME = ?, ";
        values.add(this.getDatNumInstrume());
        fields += " DAT_ANO_ALTA_REG = ?, ";
        values.add(this.getDatAnoAltaReg());
        fields += " DAT_MES_ALTA_REG = ?, ";
        values.add(this.getDatMesAltaReg());
        fields += " DAT_DIA_ALTA_REG = ?, ";
        values.add(this.getDatDiaAltaReg());
        fields += " DAT_ANO_ULT_MOD = ?, ";
        values.add(this.getDatAnoUltMod());
        fields += " DAT_MES_ULT_MOD = ?, ";
        values.add(this.getDatMesUltMod());
        fields += " DAT_DIA_ULT_MOD = ?, ";
        values.add(this.getDatDiaUltMod());
        fields += " DAT_CVE_ST_DATOSCALC = ?, ";
        values.add(this.getDatCveStDatoscalc());
        conditions += " AND DAT_ENT_CLAVE = ?";
        pkValues.add(this.getDatEntClave());
        fields += " DAT_CVE_RET_ISR = ?, ";
        values.add(this.getDatCveRetIsr());
        fields += " DAT_FECHA_AL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDatFechaAl());
        fields += " DAT_FECHA_DEL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDatFechaDel());
        fields += " DAT_TASA_ISR = ?, ";
        values.add(this.getDatTasaIsr());
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
        String sql = "INSERT INTO DATOSCALCULO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DAT_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDatFecha());

        fields += ", DAT_TASA";
        fieldValues += ", ?";
        values.add(this.getDatTasa());

        fields += ", DAT_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getDatCveTipoMerca());

        fields += ", DAT_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getDatNumInstrume());

        fields += ", DAT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDatAnoAltaReg());

        fields += ", DAT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDatMesAltaReg());

        fields += ", DAT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDatDiaAltaReg());

        fields += ", DAT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDatAnoUltMod());

        fields += ", DAT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDatMesUltMod());

        fields += ", DAT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDatDiaUltMod());

        fields += ", DAT_CVE_ST_DATOSCALC";
        fieldValues += ", ?";
        values.add(this.getDatCveStDatoscalc());

        fields += ", DAT_ENT_CLAVE";
        fieldValues += ", ?";
        values.add(this.getDatEntClave());

        fields += ", DAT_CVE_RET_ISR";
        fieldValues += ", ?";
        values.add(this.getDatCveRetIsr());

        fields += ", DAT_FECHA_AL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDatFechaAl());

        fields += ", DAT_FECHA_DEL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDatFechaDel());

        fields += ", DAT_TASA_ISR";
        fieldValues += ", ?";
        values.add(this.getDatTasaIsr());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DATOSCALCULO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DAT_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getDatFecha());
        conditions += " AND DAT_ENT_CLAVE = ?";
        values.add(this.getDatEntClave());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Datoscalculo instance = (Datoscalculo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDatFecha().equals(instance.getDatFecha()))
            equalObjects = false;
        if (equalObjects && !this.getDatTasa().equals(instance.getDatTasa()))
            equalObjects = false;
        if (equalObjects && !this.getDatCveTipoMerca().equals(instance.getDatCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getDatNumInstrume().equals(instance.getDatNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getDatAnoAltaReg().equals(instance.getDatAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDatMesAltaReg().equals(instance.getDatMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDatDiaAltaReg().equals(instance.getDatDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDatAnoUltMod().equals(instance.getDatAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDatMesUltMod().equals(instance.getDatMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDatDiaUltMod().equals(instance.getDatDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDatCveStDatoscalc().equals(instance.getDatCveStDatoscalc()))
            equalObjects = false;
        if (equalObjects && !this.getDatEntClave().equals(instance.getDatEntClave()))
            equalObjects = false;
        if (equalObjects && !this.getDatCveRetIsr().equals(instance.getDatCveRetIsr()))
            equalObjects = false;
        if (equalObjects && !this.getDatFechaAl().equals(instance.getDatFechaAl()))
            equalObjects = false;
        if (equalObjects && !this.getDatFechaDel().equals(instance.getDatFechaDel()))
            equalObjects = false;
        if (equalObjects && !this.getDatTasaIsr().equals(instance.getDatTasaIsr()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Datoscalculo result = new Datoscalculo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDatFecha((String) objectData.getData("DAT_FECHA"));
        result.setDatTasa((BigDecimal) objectData.getData("DAT_TASA"));
        result.setDatCveTipoMerca((BigDecimal) objectData.getData("DAT_CVE_TIPO_MERCA"));
        result.setDatNumInstrume((BigDecimal) objectData.getData("DAT_NUM_INSTRUME"));
        result.setDatAnoAltaReg((BigDecimal) objectData.getData("DAT_ANO_ALTA_REG"));
        result.setDatMesAltaReg((BigDecimal) objectData.getData("DAT_MES_ALTA_REG"));
        result.setDatDiaAltaReg((BigDecimal) objectData.getData("DAT_DIA_ALTA_REG"));
        result.setDatAnoUltMod((BigDecimal) objectData.getData("DAT_ANO_ULT_MOD"));
        result.setDatMesUltMod((BigDecimal) objectData.getData("DAT_MES_ULT_MOD"));
        result.setDatDiaUltMod((BigDecimal) objectData.getData("DAT_DIA_ULT_MOD"));
        result.setDatCveStDatoscalc((String) objectData.getData("DAT_CVE_ST_DATOSCALC"));
        result.setDatEntClave((BigDecimal) objectData.getData("DAT_ENT_CLAVE"));
        result.setDatCveRetIsr((BigDecimal) objectData.getData("DAT_CVE_RET_ISR"));
        result.setDatFechaAl((String) objectData.getData("DAT_FECHA_AL"));
        result.setDatFechaDel((String) objectData.getData("DAT_FECHA_DEL"));
        result.setDatTasaIsr((BigDecimal) objectData.getData("DAT_TASA_ISR"));

        return result;

    }

}
