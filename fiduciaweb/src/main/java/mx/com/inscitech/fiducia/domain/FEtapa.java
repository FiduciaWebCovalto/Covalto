package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ETAPA_PK", columns = { "FETA_ID_ETAPA" }, sequences = { "MAX" })
public class FEtapa extends DomainObject {

    BigDecimal fetaIdEtapa = null;
    String fetaTipoSol = null;
    BigDecimal fetaSecEtapa = null;
    String fetaNombreEtapa = null;
    BigDecimal fperIdPerfil = null;
    String fetaEstatus = null;

    public FEtapa() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFetaIdEtapa(BigDecimal fetaIdEtapa) {
        this.fetaIdEtapa = fetaIdEtapa;
    }

    public BigDecimal getFetaIdEtapa() {
        return this.fetaIdEtapa;
    }

    @FieldInfo(nullable = false, dataType = "CHAR", javaClass = String.class)
    public void setFetaTipoSol(String fetaTipoSol) {
        this.fetaTipoSol = fetaTipoSol;
    }

    public String getFetaTipoSol() {
        return this.fetaTipoSol;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFetaSecEtapa(BigDecimal fetaSecEtapa) {
        this.fetaSecEtapa = fetaSecEtapa;
    }

    public BigDecimal getFetaSecEtapa() {
        return this.fetaSecEtapa;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFetaNombreEtapa(String fetaNombreEtapa) {
        this.fetaNombreEtapa = fetaNombreEtapa;
    }

    public String getFetaNombreEtapa() {
        return this.fetaNombreEtapa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFperIdPerfil(BigDecimal fperIdPerfil) {
        this.fperIdPerfil = fperIdPerfil;
    }

    public BigDecimal getFperIdPerfil() {
        return this.fperIdPerfil;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFetaEstatus(String fetaEstatus) {
        this.fetaEstatus = fetaEstatus;
    }

    public String getFetaEstatus() {
        return this.fetaEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ETAPA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFetaIdEtapa() != null && this.getFetaIdEtapa().longValue() == -999) {
            conditions += " AND FETA_ID_ETAPA IS NULL";
        } else if (this.getFetaIdEtapa() != null) {
            conditions += " AND FETA_ID_ETAPA = ?";
            values.add(this.getFetaIdEtapa());
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
        String sql = "SELECT * FROM F_ETAPA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFetaIdEtapa() != null && this.getFetaIdEtapa().longValue() == -999) {
            conditions += " AND FETA_ID_ETAPA IS NULL";
        } else if (this.getFetaIdEtapa() != null) {
            conditions += " AND FETA_ID_ETAPA = ?";
            values.add(this.getFetaIdEtapa());
        }

        if (this.getFetaTipoSol() != null && "null".equals(this.getFetaTipoSol())) {
            conditions += " AND FETA_TIPO_SOL IS NULL";
        } else if (this.getFetaTipoSol() != null) {
            conditions += " AND FETA_TIPO_SOL = ?";
            values.add(this.getFetaTipoSol());
        }

        if (this.getFetaSecEtapa() != null && this.getFetaSecEtapa().longValue() == -999) {
            conditions += " AND FETA_SEC_ETAPA IS NULL";
        } else if (this.getFetaSecEtapa() != null) {
            conditions += " AND FETA_SEC_ETAPA = ?";
            values.add(this.getFetaSecEtapa());
        }

        if (this.getFetaNombreEtapa() != null && "null".equals(this.getFetaNombreEtapa())) {
            conditions += " AND FETA_NOMBRE_ETAPA IS NULL";
        } else if (this.getFetaNombreEtapa() != null) {
            conditions += " AND FETA_NOMBRE_ETAPA = ?";
            values.add(this.getFetaNombreEtapa());
        }

        if (this.getFperIdPerfil() != null && this.getFperIdPerfil().longValue() == -999) {
            conditions += " AND FPER_ID_PERFIL IS NULL";
        } else if (this.getFperIdPerfil() != null) {
            conditions += " AND FPER_ID_PERFIL = ?";
            values.add(this.getFperIdPerfil());
        }

        if (this.getFetaEstatus() != null && "null".equals(this.getFetaEstatus())) {
            conditions += " AND FETA_ESTATUS IS NULL";
        } else if (this.getFetaEstatus() != null) {
            conditions += " AND FETA_ESTATUS = ?";
            values.add(this.getFetaEstatus());
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
        String sql = "UPDATE F_ETAPA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FETA_ID_ETAPA = ?";
        pkValues.add(this.getFetaIdEtapa());
        fields += " FETA_TIPO_SOL = ?, ";
        values.add(this.getFetaTipoSol());
        fields += " FETA_SEC_ETAPA = ?, ";
        values.add(this.getFetaSecEtapa());
        fields += " FETA_NOMBRE_ETAPA = ?, ";
        values.add(this.getFetaNombreEtapa());
        fields += " FPER_ID_PERFIL = ?, ";
        values.add(this.getFperIdPerfil());
        fields += " FETA_ESTATUS = ?, ";
        values.add(this.getFetaEstatus());
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
        String sql = "INSERT INTO F_ETAPA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FETA_ID_ETAPA";
        fieldValues += ", ?";
        values.add(this.getFetaIdEtapa());

        fields += ", FETA_TIPO_SOL";
        fieldValues += ", ?";
        values.add(this.getFetaTipoSol());

        fields += ", FETA_SEC_ETAPA";
        fieldValues += ", ?";
        values.add(this.getFetaSecEtapa());

        fields += ", FETA_NOMBRE_ETAPA";
        fieldValues += ", ?";
        values.add(this.getFetaNombreEtapa());

        fields += ", FPER_ID_PERFIL";
        fieldValues += ", ?";
        values.add(this.getFperIdPerfil());

        fields += ", FETA_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getFetaEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ETAPA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FETA_ID_ETAPA = ?";
        values.add(this.getFetaIdEtapa());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEtapa instance = (FEtapa) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFetaIdEtapa().equals(instance.getFetaIdEtapa()))
            equalObjects = false;
        if (equalObjects && !this.getFetaTipoSol().equals(instance.getFetaTipoSol()))
            equalObjects = false;
        if (equalObjects && !this.getFetaSecEtapa().equals(instance.getFetaSecEtapa()))
            equalObjects = false;
        if (equalObjects && !this.getFetaNombreEtapa().equals(instance.getFetaNombreEtapa()))
            equalObjects = false;
        if (equalObjects && !this.getFperIdPerfil().equals(instance.getFperIdPerfil()))
            equalObjects = false;
        if (equalObjects && !this.getFetaEstatus().equals(instance.getFetaEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEtapa result = new FEtapa();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFetaIdEtapa((BigDecimal) objectData.getData("FETA_ID_ETAPA"));
        result.setFetaTipoSol((String) objectData.getData("FETA_TIPO_SOL"));
        result.setFetaSecEtapa((BigDecimal) objectData.getData("FETA_SEC_ETAPA"));
        result.setFetaNombreEtapa((String) objectData.getData("FETA_NOMBRE_ETAPA"));
        result.setFperIdPerfil((BigDecimal) objectData.getData("FPER_ID_PERFIL"));
        result.setFetaEstatus((String) objectData.getData("FETA_ESTATUS"));

        return result;

    }

}
