package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIFISOS_PK", columns = { "EFSO_INSTITUCION", "EFSO_ID_FIDEICOMISO" }, sequences = { "MANUAL" })
public class FEmifisos extends DomainObject {

    BigDecimal efsoIdFideicomiso = null;
    BigDecimal efsoIdEmisor = null;
    String efsoInstitucion = null;
    String efsoFecCreacion = null;
    String efsoComentario = null;
    String efsoComentario1 = null;
    String efsoStFEmifisos = null;
    BigDecimal efiCveChk = null;

    public FEmifisos() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfsoIdFideicomiso(BigDecimal efsoIdFideicomiso) {
        this.efsoIdFideicomiso = efsoIdFideicomiso;
    }

    public BigDecimal getEfsoIdFideicomiso() {
        return this.efsoIdFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfsoIdEmisor(BigDecimal efsoIdEmisor) {
        this.efsoIdEmisor = efsoIdEmisor;
    }

    public BigDecimal getEfsoIdEmisor() {
        return this.efsoIdEmisor;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfsoInstitucion(String efsoInstitucion) {
        this.efsoInstitucion = efsoInstitucion;
    }

    public String getEfsoInstitucion() {
        return this.efsoInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEfsoFecCreacion(String efsoFecCreacion) {
        this.efsoFecCreacion = efsoFecCreacion;
    }

    public String getEfsoFecCreacion() {
        return this.efsoFecCreacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfsoComentario(String efsoComentario) {
        this.efsoComentario = efsoComentario;
    }

    public String getEfsoComentario() {
        return this.efsoComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfsoComentario1(String efsoComentario1) {
        this.efsoComentario1 = efsoComentario1;
    }

    public String getEfsoComentario1() {
        return this.efsoComentario1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfsoStFEmifisos(String efsoStFEmifisos) {
        this.efsoStFEmifisos = efsoStFEmifisos;
    }

    public String getEfsoStFEmifisos() {
        return this.efsoStFEmifisos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEfiCveChk(BigDecimal efiCveChk) {
        this.efiCveChk = efiCveChk;
    }

    public BigDecimal getEfiCveChk() {
        return this.efiCveChk;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIFISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfsoIdFideicomiso() != null && this.getEfsoIdFideicomiso().longValue() == -999) {
            conditions += " AND EFSO_ID_FIDEICOMISO IS NULL";
        } else if (this.getEfsoIdFideicomiso() != null) {
            conditions += " AND EFSO_ID_FIDEICOMISO = ?";
            values.add(this.getEfsoIdFideicomiso());
        }

        if (this.getEfsoInstitucion() != null && "null".equals(this.getEfsoInstitucion())) {
            conditions += " AND EFSO_INSTITUCION IS NULL";
        } else if (this.getEfsoInstitucion() != null) {
            conditions += " AND EFSO_INSTITUCION = ?";
            values.add(this.getEfsoInstitucion());
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
        String sql = "SELECT * FROM F_EMIFISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfsoIdFideicomiso() != null && this.getEfsoIdFideicomiso().longValue() == -999) {
            conditions += " AND EFSO_ID_FIDEICOMISO IS NULL";
        } else if (this.getEfsoIdFideicomiso() != null) {
            conditions += " AND EFSO_ID_FIDEICOMISO = ?";
            values.add(this.getEfsoIdFideicomiso());
        }

        if (this.getEfsoIdEmisor() != null && this.getEfsoIdEmisor().longValue() == -999) {
            conditions += " AND EFSO_ID_EMISOR IS NULL";
        } else if (this.getEfsoIdEmisor() != null) {
            conditions += " AND EFSO_ID_EMISOR = ?";
            values.add(this.getEfsoIdEmisor());
        }

        if (this.getEfsoInstitucion() != null && "null".equals(this.getEfsoInstitucion())) {
            conditions += " AND EFSO_INSTITUCION IS NULL";
        } else if (this.getEfsoInstitucion() != null) {
            conditions += " AND EFSO_INSTITUCION = ?";
            values.add(this.getEfsoInstitucion());
        }

        if (this.getEfsoFecCreacion() != null && "null".equals(this.getEfsoFecCreacion())) {
            conditions += " AND EFSO_FEC_CREACION IS NULL";
        } else if (this.getEfsoFecCreacion() != null) {
            conditions += " AND EFSO_FEC_CREACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEfsoFecCreacion());
        }

        if (this.getEfsoComentario() != null && "null".equals(this.getEfsoComentario())) {
            conditions += " AND EFSO_COMENTARIO IS NULL";
        } else if (this.getEfsoComentario() != null) {
            conditions += " AND EFSO_COMENTARIO = ?";
            values.add(this.getEfsoComentario());
        }

        if (this.getEfsoComentario1() != null && "null".equals(this.getEfsoComentario1())) {
            conditions += " AND EFSO_COMENTARIO1 IS NULL";
        } else if (this.getEfsoComentario1() != null) {
            conditions += " AND EFSO_COMENTARIO1 = ?";
            values.add(this.getEfsoComentario1());
        }

        if (this.getEfsoStFEmifisos() != null && "null".equals(this.getEfsoStFEmifisos())) {
            conditions += " AND EFSO_ST_F_EMIFISOS IS NULL";
        } else if (this.getEfsoStFEmifisos() != null) {
            conditions += " AND EFSO_ST_F_EMIFISOS = ?";
            values.add(this.getEfsoStFEmifisos());
        }

        if (this.getEfiCveChk() != null && this.getEfiCveChk().longValue() == -999) {
            conditions += " AND EFI_CVE_CHK IS NULL";
        } else if (this.getEfiCveChk() != null) {
            conditions += " AND EFI_CVE_CHK = ?";
            values.add(this.getEfiCveChk());
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
        String sql = "UPDATE F_EMIFISOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EFSO_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEfsoIdFideicomiso());
        fields += " EFSO_ID_EMISOR = ?, ";
        values.add(this.getEfsoIdEmisor());
        conditions += " AND EFSO_INSTITUCION = ?";
        pkValues.add(this.getEfsoInstitucion());
        fields += " EFSO_FEC_CREACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEfsoFecCreacion());
        fields += " EFSO_COMENTARIO = ?, ";
        values.add(this.getEfsoComentario());
        fields += " EFSO_COMENTARIO1 = ?, ";
        values.add(this.getEfsoComentario1());
        fields += " EFSO_ST_F_EMIFISOS = ?, ";
        values.add(this.getEfsoStFEmifisos());
        fields += " EFI_CVE_CHK = ?, ";
        values.add(this.getEfiCveChk());
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
        String sql = "INSERT INTO F_EMIFISOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EFSO_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEfsoIdFideicomiso());

        fields += ", EFSO_ID_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEfsoIdEmisor());

        fields += ", EFSO_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getEfsoInstitucion());

        fields += ", EFSO_FEC_CREACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEfsoFecCreacion());

        fields += ", EFSO_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getEfsoComentario());

        fields += ", EFSO_COMENTARIO1";
        fieldValues += ", ?";
        values.add(this.getEfsoComentario1());

        fields += ", EFSO_ST_F_EMIFISOS";
        fieldValues += ", ?";
        values.add(this.getEfsoStFEmifisos());

        fields += ", EFI_CVE_CHK";
        fieldValues += ", ?";
        values.add(this.getEfiCveChk());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIFISOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EFSO_ID_FIDEICOMISO = ?";
        values.add(this.getEfsoIdFideicomiso());
        conditions += " AND EFSO_INSTITUCION = ?";
        values.add(this.getEfsoInstitucion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmifisos instance = (FEmifisos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEfsoIdFideicomiso().equals(instance.getEfsoIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEfsoIdEmisor().equals(instance.getEfsoIdEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEfsoInstitucion().equals(instance.getEfsoInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getEfsoFecCreacion().equals(instance.getEfsoFecCreacion()))
            equalObjects = false;
        if (equalObjects && !this.getEfsoComentario().equals(instance.getEfsoComentario()))
            equalObjects = false;
        if (equalObjects && !this.getEfsoComentario1().equals(instance.getEfsoComentario1()))
            equalObjects = false;
        if (equalObjects && !this.getEfsoStFEmifisos().equals(instance.getEfsoStFEmifisos()))
            equalObjects = false;
        if (equalObjects && !this.getEfiCveChk().equals(instance.getEfiCveChk()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmifisos result = new FEmifisos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEfsoIdFideicomiso((BigDecimal) objectData.getData("EFSO_ID_FIDEICOMISO"));
        result.setEfsoIdEmisor((BigDecimal) objectData.getData("EFSO_ID_EMISOR"));
        result.setEfsoInstitucion((String) objectData.getData("EFSO_INSTITUCION"));
        result.setEfsoFecCreacion((String) objectData.getData("EFSO_FEC_CREACION"));
        result.setEfsoComentario((String) objectData.getData("EFSO_COMENTARIO"));
        result.setEfsoComentario1((String) objectData.getData("EFSO_COMENTARIO1"));
        result.setEfsoStFEmifisos((String) objectData.getData("EFSO_ST_F_EMIFISOS"));
        result.setEfiCveChk((BigDecimal) objectData.getData("EFI_CVE_CHK"));

        return result;

    }

}
