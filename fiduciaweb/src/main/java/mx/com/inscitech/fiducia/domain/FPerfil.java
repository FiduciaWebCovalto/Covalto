package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PERFIL_PK", columns = { "FPER_ID_PERFIL" }, sequences = { "MAX" })
public class FPerfil extends DomainObject {

    BigDecimal fperIdPerfil = null;
    String fperNombrePerfil = null;
    BigDecimal fperImporteDispOpmon = null;
    BigDecimal fperTipoOpemonAut = null;
    BigDecimal fperInterno = null;

    public FPerfil() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFperIdPerfil(BigDecimal fperIdPerfil) {
        this.fperIdPerfil = fperIdPerfil;
    }

    public BigDecimal getFperIdPerfil() {
        return this.fperIdPerfil;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFperNombrePerfil(String fperNombrePerfil) {
        this.fperNombrePerfil = fperNombrePerfil;
    }

    public String getFperNombrePerfil() {
        return this.fperNombrePerfil;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFperImporteDispOpmon(BigDecimal fperImporteDispOpmon) {
        this.fperImporteDispOpmon = fperImporteDispOpmon;
    }

    public BigDecimal getFperImporteDispOpmon() {
        return this.fperImporteDispOpmon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFperTipoOpemonAut(BigDecimal fperTipoOpemonAut) {
        this.fperTipoOpemonAut = fperTipoOpemonAut;
    }

    public BigDecimal getFperTipoOpemonAut() {
        return this.fperTipoOpemonAut;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFperInterno(BigDecimal fperInterno) {
        this.fperInterno = fperInterno;
    }

    public BigDecimal getFperInterno() {
        return this.fperInterno;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PERFIL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFperIdPerfil() != null && this.getFperIdPerfil().longValue() == -999) {
            conditions += " AND FPER_ID_PERFIL IS NULL";
        } else if (this.getFperIdPerfil() != null) {
            conditions += " AND FPER_ID_PERFIL = ?";
            values.add(this.getFperIdPerfil());
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
        String sql = "SELECT * FROM F_PERFIL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFperIdPerfil() != null && this.getFperIdPerfil().longValue() == -999) {
            conditions += " AND FPER_ID_PERFIL IS NULL";
        } else if (this.getFperIdPerfil() != null) {
            conditions += " AND FPER_ID_PERFIL = ?";
            values.add(this.getFperIdPerfil());
        }

        if (this.getFperNombrePerfil() != null && "null".equals(this.getFperNombrePerfil())) {
            conditions += " AND FPER_NOMBRE_PERFIL IS NULL";
        } else if (this.getFperNombrePerfil() != null) {
            conditions += " AND FPER_NOMBRE_PERFIL = ?";
            values.add(this.getFperNombrePerfil());
        }

        if (this.getFperImporteDispOpmon() != null && this.getFperImporteDispOpmon().longValue() == -999) {
            conditions += " AND FPER_IMPORTE_DISP_OPMON IS NULL";
        } else if (this.getFperImporteDispOpmon() != null) {
            conditions += " AND FPER_IMPORTE_DISP_OPMON = ?";
            values.add(this.getFperImporteDispOpmon());
        }

        if (this.getFperTipoOpemonAut() != null && this.getFperTipoOpemonAut().longValue() == -999) {
            conditions += " AND FPER_TIPO_OPEMON_AUT IS NULL";
        } else if (this.getFperTipoOpemonAut() != null) {
            conditions += " AND FPER_TIPO_OPEMON_AUT = ?";
            values.add(this.getFperTipoOpemonAut());
        }

        if (this.getFperInterno() != null && this.getFperInterno().longValue() == -999) {
            conditions += " AND FPER_INTERNO IS NULL";
        } else if (this.getFperInterno() != null) {
            conditions += " AND FPER_INTERNO = ?";
            values.add(this.getFperInterno());
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
        String sql = "UPDATE F_PERFIL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPER_ID_PERFIL = ?";
        pkValues.add(this.getFperIdPerfil());
        fields += " FPER_NOMBRE_PERFIL = ?, ";
        values.add(this.getFperNombrePerfil());
        fields += " FPER_IMPORTE_DISP_OPMON = ?, ";
        values.add(this.getFperImporteDispOpmon());
        fields += " FPER_TIPO_OPEMON_AUT = ?, ";
        values.add(this.getFperTipoOpemonAut());
        fields += " FPER_INTERNO = ?, ";
        values.add(this.getFperInterno());
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
        String sql = "INSERT INTO F_PERFIL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPER_ID_PERFIL";
        fieldValues += ", ?";
        values.add(this.getFperIdPerfil());

        fields += ", FPER_NOMBRE_PERFIL";
        fieldValues += ", ?";
        values.add(this.getFperNombrePerfil());

        fields += ", FPER_IMPORTE_DISP_OPMON";
        fieldValues += ", ?";
        values.add(this.getFperImporteDispOpmon());

        fields += ", FPER_TIPO_OPEMON_AUT";
        fieldValues += ", ?";
        values.add(this.getFperTipoOpemonAut());

        fields += ", FPER_INTERNO";
        fieldValues += ", ?";
        values.add(this.getFperInterno());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PERFIL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPER_ID_PERFIL = ?";
        values.add(this.getFperIdPerfil());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FPerfil instance = (FPerfil) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFperIdPerfil().equals(instance.getFperIdPerfil()))
            equalObjects = false;
        if (equalObjects && !this.getFperNombrePerfil().equals(instance.getFperNombrePerfil()))
            equalObjects = false;
        if (equalObjects && !this.getFperImporteDispOpmon().equals(instance.getFperImporteDispOpmon()))
            equalObjects = false;
        if (equalObjects && !this.getFperTipoOpemonAut().equals(instance.getFperTipoOpemonAut()))
            equalObjects = false;
        if (equalObjects && !this.getFperInterno().equals(instance.getFperInterno()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPerfil result = new FPerfil();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFperIdPerfil((BigDecimal) objectData.getData("FPER_ID_PERFIL"));
        result.setFperNombrePerfil((String) objectData.getData("FPER_NOMBRE_PERFIL"));
        result.setFperImporteDispOpmon((BigDecimal) objectData.getData("FPER_IMPORTE_DISP_OPMON"));
        result.setFperTipoOpemonAut((BigDecimal) objectData.getData("FPER_TIPO_OPEMON_AUT"));
        result.setFperInterno((BigDecimal) objectData.getData("FPER_INTERNO"));

        return result;

    }

}
