package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REFEGLOB_PK", columns = { "REG_NUM_CORTE", "REG_ANO_SUGERENCIA", "REG_MES_SUGERENCIA", "REG_DIA_SUGERENCIA" }, sequences = { "MANUAL" })
public class Refeglob extends DomainObject {

    BigDecimal regAnoSugerencia = null;
    BigDecimal regMesSugerencia = null;
    BigDecimal regDiaSugerencia = null;
    BigDecimal regNumCorte = null;
    BigDecimal regImpSugerido = null;
    BigDecimal regImpAsignado = null;
    BigDecimal regImpDisponible = null;
    BigDecimal regNumContratos = null;
    String regHoraCorte = null;
    String regCveStRefeglo = null;

    public Refeglob() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRegAnoSugerencia(BigDecimal regAnoSugerencia) {
        this.regAnoSugerencia = regAnoSugerencia;
    }

    public BigDecimal getRegAnoSugerencia() {
        return this.regAnoSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRegMesSugerencia(BigDecimal regMesSugerencia) {
        this.regMesSugerencia = regMesSugerencia;
    }

    public BigDecimal getRegMesSugerencia() {
        return this.regMesSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRegDiaSugerencia(BigDecimal regDiaSugerencia) {
        this.regDiaSugerencia = regDiaSugerencia;
    }

    public BigDecimal getRegDiaSugerencia() {
        return this.regDiaSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRegNumCorte(BigDecimal regNumCorte) {
        this.regNumCorte = regNumCorte;
    }

    public BigDecimal getRegNumCorte() {
        return this.regNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRegImpSugerido(BigDecimal regImpSugerido) {
        this.regImpSugerido = regImpSugerido;
    }

    public BigDecimal getRegImpSugerido() {
        return this.regImpSugerido;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRegImpAsignado(BigDecimal regImpAsignado) {
        this.regImpAsignado = regImpAsignado;
    }

    public BigDecimal getRegImpAsignado() {
        return this.regImpAsignado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRegImpDisponible(BigDecimal regImpDisponible) {
        this.regImpDisponible = regImpDisponible;
    }

    public BigDecimal getRegImpDisponible() {
        return this.regImpDisponible;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRegNumContratos(BigDecimal regNumContratos) {
        this.regNumContratos = regNumContratos;
    }

    public BigDecimal getRegNumContratos() {
        return this.regNumContratos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRegHoraCorte(String regHoraCorte) {
        this.regHoraCorte = regHoraCorte;
    }

    public String getRegHoraCorte() {
        return this.regHoraCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRegCveStRefeglo(String regCveStRefeglo) {
        this.regCveStRefeglo = regCveStRefeglo;
    }

    public String getRegCveStRefeglo() {
        return this.regCveStRefeglo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REFEGLOB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRegAnoSugerencia() != null && this.getRegAnoSugerencia().longValue() == -999) {
            conditions += " AND REG_ANO_SUGERENCIA IS NULL";
        } else if (this.getRegAnoSugerencia() != null) {
            conditions += " AND REG_ANO_SUGERENCIA = ?";
            values.add(this.getRegAnoSugerencia());
        }

        if (this.getRegMesSugerencia() != null && this.getRegMesSugerencia().longValue() == -999) {
            conditions += " AND REG_MES_SUGERENCIA IS NULL";
        } else if (this.getRegMesSugerencia() != null) {
            conditions += " AND REG_MES_SUGERENCIA = ?";
            values.add(this.getRegMesSugerencia());
        }

        if (this.getRegDiaSugerencia() != null && this.getRegDiaSugerencia().longValue() == -999) {
            conditions += " AND REG_DIA_SUGERENCIA IS NULL";
        } else if (this.getRegDiaSugerencia() != null) {
            conditions += " AND REG_DIA_SUGERENCIA = ?";
            values.add(this.getRegDiaSugerencia());
        }

        if (this.getRegNumCorte() != null && this.getRegNumCorte().longValue() == -999) {
            conditions += " AND REG_NUM_CORTE IS NULL";
        } else if (this.getRegNumCorte() != null) {
            conditions += " AND REG_NUM_CORTE = ?";
            values.add(this.getRegNumCorte());
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
        String sql = "SELECT * FROM REFEGLOB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRegAnoSugerencia() != null && this.getRegAnoSugerencia().longValue() == -999) {
            conditions += " AND REG_ANO_SUGERENCIA IS NULL";
        } else if (this.getRegAnoSugerencia() != null) {
            conditions += " AND REG_ANO_SUGERENCIA = ?";
            values.add(this.getRegAnoSugerencia());
        }

        if (this.getRegMesSugerencia() != null && this.getRegMesSugerencia().longValue() == -999) {
            conditions += " AND REG_MES_SUGERENCIA IS NULL";
        } else if (this.getRegMesSugerencia() != null) {
            conditions += " AND REG_MES_SUGERENCIA = ?";
            values.add(this.getRegMesSugerencia());
        }

        if (this.getRegDiaSugerencia() != null && this.getRegDiaSugerencia().longValue() == -999) {
            conditions += " AND REG_DIA_SUGERENCIA IS NULL";
        } else if (this.getRegDiaSugerencia() != null) {
            conditions += " AND REG_DIA_SUGERENCIA = ?";
            values.add(this.getRegDiaSugerencia());
        }

        if (this.getRegNumCorte() != null && this.getRegNumCorte().longValue() == -999) {
            conditions += " AND REG_NUM_CORTE IS NULL";
        } else if (this.getRegNumCorte() != null) {
            conditions += " AND REG_NUM_CORTE = ?";
            values.add(this.getRegNumCorte());
        }

        if (this.getRegImpSugerido() != null && this.getRegImpSugerido().longValue() == -999) {
            conditions += " AND REG_IMP_SUGERIDO IS NULL";
        } else if (this.getRegImpSugerido() != null) {
            conditions += " AND REG_IMP_SUGERIDO = ?";
            values.add(this.getRegImpSugerido());
        }

        if (this.getRegImpAsignado() != null && this.getRegImpAsignado().longValue() == -999) {
            conditions += " AND REG_IMP_ASIGNADO IS NULL";
        } else if (this.getRegImpAsignado() != null) {
            conditions += " AND REG_IMP_ASIGNADO = ?";
            values.add(this.getRegImpAsignado());
        }

        if (this.getRegImpDisponible() != null && this.getRegImpDisponible().longValue() == -999) {
            conditions += " AND REG_IMP_DISPONIBLE IS NULL";
        } else if (this.getRegImpDisponible() != null) {
            conditions += " AND REG_IMP_DISPONIBLE = ?";
            values.add(this.getRegImpDisponible());
        }

        if (this.getRegNumContratos() != null && this.getRegNumContratos().longValue() == -999) {
            conditions += " AND REG_NUM_CONTRATOS IS NULL";
        } else if (this.getRegNumContratos() != null) {
            conditions += " AND REG_NUM_CONTRATOS = ?";
            values.add(this.getRegNumContratos());
        }

        if (this.getRegHoraCorte() != null && "null".equals(this.getRegHoraCorte())) {
            conditions += " AND REG_HORA_CORTE IS NULL";
        } else if (this.getRegHoraCorte() != null) {
            conditions += " AND REG_HORA_CORTE = ?";
            values.add(this.getRegHoraCorte());
        }

        if (this.getRegCveStRefeglo() != null && "null".equals(this.getRegCveStRefeglo())) {
            conditions += " AND REG_CVE_ST_REFEGLO IS NULL";
        } else if (this.getRegCveStRefeglo() != null) {
            conditions += " AND REG_CVE_ST_REFEGLO = ?";
            values.add(this.getRegCveStRefeglo());
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
        String sql = "UPDATE REFEGLOB SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REG_ANO_SUGERENCIA = ?";
        pkValues.add(this.getRegAnoSugerencia());
        conditions += " AND REG_MES_SUGERENCIA = ?";
        pkValues.add(this.getRegMesSugerencia());
        conditions += " AND REG_DIA_SUGERENCIA = ?";
        pkValues.add(this.getRegDiaSugerencia());
        conditions += " AND REG_NUM_CORTE = ?";
        pkValues.add(this.getRegNumCorte());
        fields += " REG_IMP_SUGERIDO = ?, ";
        values.add(this.getRegImpSugerido());
        fields += " REG_IMP_ASIGNADO = ?, ";
        values.add(this.getRegImpAsignado());
        fields += " REG_IMP_DISPONIBLE = ?, ";
        values.add(this.getRegImpDisponible());
        fields += " REG_NUM_CONTRATOS = ?, ";
        values.add(this.getRegNumContratos());
        fields += " REG_HORA_CORTE = ?, ";
        values.add(this.getRegHoraCorte());
        fields += " REG_CVE_ST_REFEGLO = ?, ";
        values.add(this.getRegCveStRefeglo());
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
        String sql = "INSERT INTO REFEGLOB ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REG_ANO_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getRegAnoSugerencia());

        fields += ", REG_MES_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getRegMesSugerencia());

        fields += ", REG_DIA_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getRegDiaSugerencia());

        fields += ", REG_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getRegNumCorte());

        fields += ", REG_IMP_SUGERIDO";
        fieldValues += ", ?";
        values.add(this.getRegImpSugerido());

        fields += ", REG_IMP_ASIGNADO";
        fieldValues += ", ?";
        values.add(this.getRegImpAsignado());

        fields += ", REG_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getRegImpDisponible());

        fields += ", REG_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getRegNumContratos());

        fields += ", REG_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getRegHoraCorte());

        fields += ", REG_CVE_ST_REFEGLO";
        fieldValues += ", ?";
        values.add(this.getRegCveStRefeglo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REFEGLOB WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REG_ANO_SUGERENCIA = ?";
        values.add(this.getRegAnoSugerencia());
        conditions += " AND REG_MES_SUGERENCIA = ?";
        values.add(this.getRegMesSugerencia());
        conditions += " AND REG_DIA_SUGERENCIA = ?";
        values.add(this.getRegDiaSugerencia());
        conditions += " AND REG_NUM_CORTE = ?";
        values.add(this.getRegNumCorte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Refeglob instance = (Refeglob) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRegAnoSugerencia().equals(instance.getRegAnoSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getRegMesSugerencia().equals(instance.getRegMesSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getRegDiaSugerencia().equals(instance.getRegDiaSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getRegNumCorte().equals(instance.getRegNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getRegImpSugerido().equals(instance.getRegImpSugerido()))
            equalObjects = false;
        if (equalObjects && !this.getRegImpAsignado().equals(instance.getRegImpAsignado()))
            equalObjects = false;
        if (equalObjects && !this.getRegImpDisponible().equals(instance.getRegImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getRegNumContratos().equals(instance.getRegNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getRegHoraCorte().equals(instance.getRegHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getRegCveStRefeglo().equals(instance.getRegCveStRefeglo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Refeglob result = new Refeglob();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRegAnoSugerencia((BigDecimal) objectData.getData("REG_ANO_SUGERENCIA"));
        result.setRegMesSugerencia((BigDecimal) objectData.getData("REG_MES_SUGERENCIA"));
        result.setRegDiaSugerencia((BigDecimal) objectData.getData("REG_DIA_SUGERENCIA"));
        result.setRegNumCorte((BigDecimal) objectData.getData("REG_NUM_CORTE"));
        result.setRegImpSugerido((BigDecimal) objectData.getData("REG_IMP_SUGERIDO"));
        result.setRegImpAsignado((BigDecimal) objectData.getData("REG_IMP_ASIGNADO"));
        result.setRegImpDisponible((BigDecimal) objectData.getData("REG_IMP_DISPONIBLE"));
        result.setRegNumContratos((BigDecimal) objectData.getData("REG_NUM_CONTRATOS"));
        result.setRegHoraCorte((String) objectData.getData("REG_HORA_CORTE"));
        result.setRegCveStRefeglo((String) objectData.getData("REG_CVE_ST_REFEGLO"));

        return result;

    }

}
