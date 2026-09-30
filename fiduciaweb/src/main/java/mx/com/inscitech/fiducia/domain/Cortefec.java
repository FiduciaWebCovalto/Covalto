package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CORTEFEC_PK", columns = { "EFE_NUM_CORTE", "EFE_ANO_SUGERENCIA", "EFE_MES_SUGERENCIA", "EFE_DIA_SUGERENCIA" }, sequences = { "MANUAL" })
public class Cortefec extends DomainObject {

    BigDecimal efeAnoSugerencia = null;
    BigDecimal efeMesSugerencia = null;
    BigDecimal efeDiaSugerencia = null;
    BigDecimal efeNumCorte = null;
    BigDecimal efeNumContratos = null;
    String efeHoraCorte = null;
    BigDecimal efeImpIncremento = null;
    BigDecimal efeImpAsignados = null;
    BigDecimal efeImpDisponible = null;
    String efeCveStCotefe = null;

    public Cortefec() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEfeAnoSugerencia(BigDecimal efeAnoSugerencia) {
        this.efeAnoSugerencia = efeAnoSugerencia;
    }

    public BigDecimal getEfeAnoSugerencia() {
        return this.efeAnoSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEfeMesSugerencia(BigDecimal efeMesSugerencia) {
        this.efeMesSugerencia = efeMesSugerencia;
    }

    public BigDecimal getEfeMesSugerencia() {
        return this.efeMesSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEfeDiaSugerencia(BigDecimal efeDiaSugerencia) {
        this.efeDiaSugerencia = efeDiaSugerencia;
    }

    public BigDecimal getEfeDiaSugerencia() {
        return this.efeDiaSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfeNumCorte(BigDecimal efeNumCorte) {
        this.efeNumCorte = efeNumCorte;
    }

    public BigDecimal getEfeNumCorte() {
        return this.efeNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfeNumContratos(BigDecimal efeNumContratos) {
        this.efeNumContratos = efeNumContratos;
    }

    public BigDecimal getEfeNumContratos() {
        return this.efeNumContratos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfeHoraCorte(String efeHoraCorte) {
        this.efeHoraCorte = efeHoraCorte;
    }

    public String getEfeHoraCorte() {
        return this.efeHoraCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEfeImpIncremento(BigDecimal efeImpIncremento) {
        this.efeImpIncremento = efeImpIncremento;
    }

    public BigDecimal getEfeImpIncremento() {
        return this.efeImpIncremento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEfeImpAsignados(BigDecimal efeImpAsignados) {
        this.efeImpAsignados = efeImpAsignados;
    }

    public BigDecimal getEfeImpAsignados() {
        return this.efeImpAsignados;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEfeImpDisponible(BigDecimal efeImpDisponible) {
        this.efeImpDisponible = efeImpDisponible;
    }

    public BigDecimal getEfeImpDisponible() {
        return this.efeImpDisponible;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfeCveStCotefe(String efeCveStCotefe) {
        this.efeCveStCotefe = efeCveStCotefe;
    }

    public String getEfeCveStCotefe() {
        return this.efeCveStCotefe;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CORTEFEC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfeAnoSugerencia() != null && this.getEfeAnoSugerencia().longValue() == -999) {
            conditions += " AND EFE_ANO_SUGERENCIA IS NULL";
        } else if (this.getEfeAnoSugerencia() != null) {
            conditions += " AND EFE_ANO_SUGERENCIA = ?";
            values.add(this.getEfeAnoSugerencia());
        }

        if (this.getEfeMesSugerencia() != null && this.getEfeMesSugerencia().longValue() == -999) {
            conditions += " AND EFE_MES_SUGERENCIA IS NULL";
        } else if (this.getEfeMesSugerencia() != null) {
            conditions += " AND EFE_MES_SUGERENCIA = ?";
            values.add(this.getEfeMesSugerencia());
        }

        if (this.getEfeDiaSugerencia() != null && this.getEfeDiaSugerencia().longValue() == -999) {
            conditions += " AND EFE_DIA_SUGERENCIA IS NULL";
        } else if (this.getEfeDiaSugerencia() != null) {
            conditions += " AND EFE_DIA_SUGERENCIA = ?";
            values.add(this.getEfeDiaSugerencia());
        }

        if (this.getEfeNumCorte() != null && this.getEfeNumCorte().longValue() == -999) {
            conditions += " AND EFE_NUM_CORTE IS NULL";
        } else if (this.getEfeNumCorte() != null) {
            conditions += " AND EFE_NUM_CORTE = ?";
            values.add(this.getEfeNumCorte());
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
        String sql = "SELECT * FROM CORTEFEC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfeAnoSugerencia() != null && this.getEfeAnoSugerencia().longValue() == -999) {
            conditions += " AND EFE_ANO_SUGERENCIA IS NULL";
        } else if (this.getEfeAnoSugerencia() != null) {
            conditions += " AND EFE_ANO_SUGERENCIA = ?";
            values.add(this.getEfeAnoSugerencia());
        }

        if (this.getEfeMesSugerencia() != null && this.getEfeMesSugerencia().longValue() == -999) {
            conditions += " AND EFE_MES_SUGERENCIA IS NULL";
        } else if (this.getEfeMesSugerencia() != null) {
            conditions += " AND EFE_MES_SUGERENCIA = ?";
            values.add(this.getEfeMesSugerencia());
        }

        if (this.getEfeDiaSugerencia() != null && this.getEfeDiaSugerencia().longValue() == -999) {
            conditions += " AND EFE_DIA_SUGERENCIA IS NULL";
        } else if (this.getEfeDiaSugerencia() != null) {
            conditions += " AND EFE_DIA_SUGERENCIA = ?";
            values.add(this.getEfeDiaSugerencia());
        }

        if (this.getEfeNumCorte() != null && this.getEfeNumCorte().longValue() == -999) {
            conditions += " AND EFE_NUM_CORTE IS NULL";
        } else if (this.getEfeNumCorte() != null) {
            conditions += " AND EFE_NUM_CORTE = ?";
            values.add(this.getEfeNumCorte());
        }

        if (this.getEfeNumContratos() != null && this.getEfeNumContratos().longValue() == -999) {
            conditions += " AND EFE_NUM_CONTRATOS IS NULL";
        } else if (this.getEfeNumContratos() != null) {
            conditions += " AND EFE_NUM_CONTRATOS = ?";
            values.add(this.getEfeNumContratos());
        }

        if (this.getEfeHoraCorte() != null && "null".equals(this.getEfeHoraCorte())) {
            conditions += " AND EFE_HORA_CORTE IS NULL";
        } else if (this.getEfeHoraCorte() != null) {
            conditions += " AND EFE_HORA_CORTE = ?";
            values.add(this.getEfeHoraCorte());
        }

        if (this.getEfeImpIncremento() != null && this.getEfeImpIncremento().longValue() == -999) {
            conditions += " AND EFE_IMP_INCREMENTO IS NULL";
        } else if (this.getEfeImpIncremento() != null) {
            conditions += " AND EFE_IMP_INCREMENTO = ?";
            values.add(this.getEfeImpIncremento());
        }

        if (this.getEfeImpAsignados() != null && this.getEfeImpAsignados().longValue() == -999) {
            conditions += " AND EFE_IMP_ASIGNADOS IS NULL";
        } else if (this.getEfeImpAsignados() != null) {
            conditions += " AND EFE_IMP_ASIGNADOS = ?";
            values.add(this.getEfeImpAsignados());
        }

        if (this.getEfeImpDisponible() != null && this.getEfeImpDisponible().longValue() == -999) {
            conditions += " AND EFE_IMP_DISPONIBLE IS NULL";
        } else if (this.getEfeImpDisponible() != null) {
            conditions += " AND EFE_IMP_DISPONIBLE = ?";
            values.add(this.getEfeImpDisponible());
        }

        if (this.getEfeCveStCotefe() != null && "null".equals(this.getEfeCveStCotefe())) {
            conditions += " AND EFE_CVE_ST_COTEFE IS NULL";
        } else if (this.getEfeCveStCotefe() != null) {
            conditions += " AND EFE_CVE_ST_COTEFE = ?";
            values.add(this.getEfeCveStCotefe());
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
        String sql = "UPDATE CORTEFEC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EFE_ANO_SUGERENCIA = ?";
        pkValues.add(this.getEfeAnoSugerencia());
        conditions += " AND EFE_MES_SUGERENCIA = ?";
        pkValues.add(this.getEfeMesSugerencia());
        conditions += " AND EFE_DIA_SUGERENCIA = ?";
        pkValues.add(this.getEfeDiaSugerencia());
        conditions += " AND EFE_NUM_CORTE = ?";
        pkValues.add(this.getEfeNumCorte());
        fields += " EFE_NUM_CONTRATOS = ?, ";
        values.add(this.getEfeNumContratos());
        fields += " EFE_HORA_CORTE = ?, ";
        values.add(this.getEfeHoraCorte());
        fields += " EFE_IMP_INCREMENTO = ?, ";
        values.add(this.getEfeImpIncremento());
        fields += " EFE_IMP_ASIGNADOS = ?, ";
        values.add(this.getEfeImpAsignados());
        fields += " EFE_IMP_DISPONIBLE = ?, ";
        values.add(this.getEfeImpDisponible());
        fields += " EFE_CVE_ST_COTEFE = ?, ";
        values.add(this.getEfeCveStCotefe());
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
        String sql = "INSERT INTO CORTEFEC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EFE_ANO_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getEfeAnoSugerencia());

        fields += ", EFE_MES_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getEfeMesSugerencia());

        fields += ", EFE_DIA_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getEfeDiaSugerencia());

        fields += ", EFE_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getEfeNumCorte());

        fields += ", EFE_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getEfeNumContratos());

        fields += ", EFE_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getEfeHoraCorte());

        fields += ", EFE_IMP_INCREMENTO";
        fieldValues += ", ?";
        values.add(this.getEfeImpIncremento());

        fields += ", EFE_IMP_ASIGNADOS";
        fieldValues += ", ?";
        values.add(this.getEfeImpAsignados());

        fields += ", EFE_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getEfeImpDisponible());

        fields += ", EFE_CVE_ST_COTEFE";
        fieldValues += ", ?";
        values.add(this.getEfeCveStCotefe());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CORTEFEC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EFE_ANO_SUGERENCIA = ?";
        values.add(this.getEfeAnoSugerencia());
        conditions += " AND EFE_MES_SUGERENCIA = ?";
        values.add(this.getEfeMesSugerencia());
        conditions += " AND EFE_DIA_SUGERENCIA = ?";
        values.add(this.getEfeDiaSugerencia());
        conditions += " AND EFE_NUM_CORTE = ?";
        values.add(this.getEfeNumCorte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cortefec instance = (Cortefec) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEfeAnoSugerencia().equals(instance.getEfeAnoSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getEfeMesSugerencia().equals(instance.getEfeMesSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getEfeDiaSugerencia().equals(instance.getEfeDiaSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getEfeNumCorte().equals(instance.getEfeNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getEfeNumContratos().equals(instance.getEfeNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getEfeHoraCorte().equals(instance.getEfeHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getEfeImpIncremento().equals(instance.getEfeImpIncremento()))
            equalObjects = false;
        if (equalObjects && !this.getEfeImpAsignados().equals(instance.getEfeImpAsignados()))
            equalObjects = false;
        if (equalObjects && !this.getEfeImpDisponible().equals(instance.getEfeImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getEfeCveStCotefe().equals(instance.getEfeCveStCotefe()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cortefec result = new Cortefec();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEfeAnoSugerencia((BigDecimal) objectData.getData("EFE_ANO_SUGERENCIA"));
        result.setEfeMesSugerencia((BigDecimal) objectData.getData("EFE_MES_SUGERENCIA"));
        result.setEfeDiaSugerencia((BigDecimal) objectData.getData("EFE_DIA_SUGERENCIA"));
        result.setEfeNumCorte((BigDecimal) objectData.getData("EFE_NUM_CORTE"));
        result.setEfeNumContratos((BigDecimal) objectData.getData("EFE_NUM_CONTRATOS"));
        result.setEfeHoraCorte((String) objectData.getData("EFE_HORA_CORTE"));
        result.setEfeImpIncremento((BigDecimal) objectData.getData("EFE_IMP_INCREMENTO"));
        result.setEfeImpAsignados((BigDecimal) objectData.getData("EFE_IMP_ASIGNADOS"));
        result.setEfeImpDisponible((BigDecimal) objectData.getData("EFE_IMP_DISPONIBLE"));
        result.setEfeCveStCotefe((String) objectData.getData("EFE_CVE_ST_COTEFE"));

        return result;

    }

}
