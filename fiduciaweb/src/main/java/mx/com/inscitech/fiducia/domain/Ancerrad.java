package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ANCERRAD_PK", columns = { "NGC_NUM_CONTRATO" }, sequences = { "MAX" })
public class Ancerrad extends DomainObject {

    BigDecimal ngcNumContrato = null;
    String ngcCveTipoNeg = null;
    String ngcCveClasifPro = null;
    String ngcCveFormaMan = null;
    String ngcNomProducto = null;
    BigDecimal ngcNumProspecto = null;
    BigDecimal ngcImpConstituc = null;
    String ngcPatrimonioEnt = null;
    String ngcTexComentario = null;
    BigDecimal ngcEjecutivoAsig = null;
    String ngcFecProspecto = null;
    String ngcFecConstituc = null;
    String ngcCveStatus = null;

    public Ancerrad() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNgcNumContrato(BigDecimal ngcNumContrato) {
        this.ngcNumContrato = ngcNumContrato;
    }

    public BigDecimal getNgcNumContrato() {
        return this.ngcNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcCveTipoNeg(String ngcCveTipoNeg) {
        this.ngcCveTipoNeg = ngcCveTipoNeg;
    }

    public String getNgcCveTipoNeg() {
        return this.ngcCveTipoNeg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcCveClasifPro(String ngcCveClasifPro) {
        this.ngcCveClasifPro = ngcCveClasifPro;
    }

    public String getNgcCveClasifPro() {
        return this.ngcCveClasifPro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcCveFormaMan(String ngcCveFormaMan) {
        this.ngcCveFormaMan = ngcCveFormaMan;
    }

    public String getNgcCveFormaMan() {
        return this.ngcCveFormaMan;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcNomProducto(String ngcNomProducto) {
        this.ngcNomProducto = ngcNomProducto;
    }

    public String getNgcNomProducto() {
        return this.ngcNomProducto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNgcNumProspecto(BigDecimal ngcNumProspecto) {
        this.ngcNumProspecto = ngcNumProspecto;
    }

    public BigDecimal getNgcNumProspecto() {
        return this.ngcNumProspecto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setNgcImpConstituc(BigDecimal ngcImpConstituc) {
        this.ngcImpConstituc = ngcImpConstituc;
    }

    public BigDecimal getNgcImpConstituc() {
        return this.ngcImpConstituc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcPatrimonioEnt(String ngcPatrimonioEnt) {
        this.ngcPatrimonioEnt = ngcPatrimonioEnt;
    }

    public String getNgcPatrimonioEnt() {
        return this.ngcPatrimonioEnt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcTexComentario(String ngcTexComentario) {
        this.ngcTexComentario = ngcTexComentario;
    }

    public String getNgcTexComentario() {
        return this.ngcTexComentario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNgcEjecutivoAsig(BigDecimal ngcEjecutivoAsig) {
        this.ngcEjecutivoAsig = ngcEjecutivoAsig;
    }

    public BigDecimal getNgcEjecutivoAsig() {
        return this.ngcEjecutivoAsig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcFecProspecto(String ngcFecProspecto) {
        this.ngcFecProspecto = ngcFecProspecto;
    }

    public String getNgcFecProspecto() {
        return this.ngcFecProspecto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcFecConstituc(String ngcFecConstituc) {
        this.ngcFecConstituc = ngcFecConstituc;
    }

    public String getNgcFecConstituc() {
        return this.ngcFecConstituc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNgcCveStatus(String ngcCveStatus) {
        this.ngcCveStatus = ngcCveStatus;
    }

    public String getNgcCveStatus() {
        return this.ngcCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ANCERRAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNgcNumContrato() != null && this.getNgcNumContrato().longValue() == -999) {
            conditions += " AND NGC_NUM_CONTRATO IS NULL";
        } else if (this.getNgcNumContrato() != null) {
            conditions += " AND NGC_NUM_CONTRATO = ?";
            values.add(this.getNgcNumContrato());
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
        String sql = "SELECT * FROM ANCERRAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNgcNumContrato() != null && this.getNgcNumContrato().longValue() == -999) {
            conditions += " AND NGC_NUM_CONTRATO IS NULL";
        } else if (this.getNgcNumContrato() != null) {
            conditions += " AND NGC_NUM_CONTRATO = ?";
            values.add(this.getNgcNumContrato());
        }

        if (this.getNgcCveTipoNeg() != null && "null".equals(this.getNgcCveTipoNeg())) {
            conditions += " AND NGC_CVE_TIPO_NEG IS NULL";
        } else if (this.getNgcCveTipoNeg() != null) {
            conditions += " AND NGC_CVE_TIPO_NEG = ?";
            values.add(this.getNgcCveTipoNeg());
        }

        if (this.getNgcCveClasifPro() != null && "null".equals(this.getNgcCveClasifPro())) {
            conditions += " AND NGC_CVE_CLASIF_PRO IS NULL";
        } else if (this.getNgcCveClasifPro() != null) {
            conditions += " AND NGC_CVE_CLASIF_PRO = ?";
            values.add(this.getNgcCveClasifPro());
        }

        if (this.getNgcCveFormaMan() != null && "null".equals(this.getNgcCveFormaMan())) {
            conditions += " AND NGC_CVE_FORMA_MAN IS NULL";
        } else if (this.getNgcCveFormaMan() != null) {
            conditions += " AND NGC_CVE_FORMA_MAN = ?";
            values.add(this.getNgcCveFormaMan());
        }

        if (this.getNgcNomProducto() != null && "null".equals(this.getNgcNomProducto())) {
            conditions += " AND NGC_NOM_PRODUCTO IS NULL";
        } else if (this.getNgcNomProducto() != null) {
            conditions += " AND NGC_NOM_PRODUCTO = ?";
            values.add(this.getNgcNomProducto());
        }

        if (this.getNgcNumProspecto() != null && this.getNgcNumProspecto().longValue() == -999) {
            conditions += " AND NGC_NUM_PROSPECTO IS NULL";
        } else if (this.getNgcNumProspecto() != null) {
            conditions += " AND NGC_NUM_PROSPECTO = ?";
            values.add(this.getNgcNumProspecto());
        }

        if (this.getNgcImpConstituc() != null && this.getNgcImpConstituc().longValue() == -999) {
            conditions += " AND NGC_IMP_CONSTITUC IS NULL";
        } else if (this.getNgcImpConstituc() != null) {
            conditions += " AND NGC_IMP_CONSTITUC = ?";
            values.add(this.getNgcImpConstituc());
        }

        if (this.getNgcPatrimonioEnt() != null && "null".equals(this.getNgcPatrimonioEnt())) {
            conditions += " AND NGC_PATRIMONIO_ENT IS NULL";
        } else if (this.getNgcPatrimonioEnt() != null) {
            conditions += " AND NGC_PATRIMONIO_ENT = ?";
            values.add(this.getNgcPatrimonioEnt());
        }

        if (this.getNgcTexComentario() != null && "null".equals(this.getNgcTexComentario())) {
            conditions += " AND NGC_TEX_COMENTARIO IS NULL";
        } else if (this.getNgcTexComentario() != null) {
            conditions += " AND NGC_TEX_COMENTARIO = ?";
            values.add(this.getNgcTexComentario());
        }

        if (this.getNgcEjecutivoAsig() != null && this.getNgcEjecutivoAsig().longValue() == -999) {
            conditions += " AND NGC_EJECUTIVO_ASIG IS NULL";
        } else if (this.getNgcEjecutivoAsig() != null) {
            conditions += " AND NGC_EJECUTIVO_ASIG = ?";
            values.add(this.getNgcEjecutivoAsig());
        }

        if (this.getNgcFecProspecto() != null && "null".equals(this.getNgcFecProspecto())) {
            conditions += " AND NGC_FEC_PROSPECTO IS NULL";
        } else if (this.getNgcFecProspecto() != null) {
            conditions += " AND NGC_FEC_PROSPECTO = ?";
            values.add(this.getNgcFecProspecto());
        }

        if (this.getNgcFecConstituc() != null && "null".equals(this.getNgcFecConstituc())) {
            conditions += " AND NGC_FEC_CONSTITUC IS NULL";
        } else if (this.getNgcFecConstituc() != null) {
            conditions += " AND NGC_FEC_CONSTITUC = ?";
            values.add(this.getNgcFecConstituc());
        }

        if (this.getNgcCveStatus() != null && "null".equals(this.getNgcCveStatus())) {
            conditions += " AND NGC_CVE_STATUS IS NULL";
        } else if (this.getNgcCveStatus() != null) {
            conditions += " AND NGC_CVE_STATUS = ?";
            values.add(this.getNgcCveStatus());
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
        String sql = "UPDATE ANCERRAD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND NGC_NUM_CONTRATO = ?";
        pkValues.add(this.getNgcNumContrato());
        fields += " NGC_CVE_TIPO_NEG = ?, ";
        values.add(this.getNgcCveTipoNeg());
        fields += " NGC_CVE_CLASIF_PRO = ?, ";
        values.add(this.getNgcCveClasifPro());
        fields += " NGC_CVE_FORMA_MAN = ?, ";
        values.add(this.getNgcCveFormaMan());
        fields += " NGC_NOM_PRODUCTO = ?, ";
        values.add(this.getNgcNomProducto());
        fields += " NGC_NUM_PROSPECTO = ?, ";
        values.add(this.getNgcNumProspecto());
        fields += " NGC_IMP_CONSTITUC = ?, ";
        values.add(this.getNgcImpConstituc());
        fields += " NGC_PATRIMONIO_ENT = ?, ";
        values.add(this.getNgcPatrimonioEnt());
        fields += " NGC_TEX_COMENTARIO = ?, ";
        values.add(this.getNgcTexComentario());
        fields += " NGC_EJECUTIVO_ASIG = ?, ";
        values.add(this.getNgcEjecutivoAsig());
        fields += " NGC_FEC_PROSPECTO = ?, ";
        values.add(this.getNgcFecProspecto());
        fields += " NGC_FEC_CONSTITUC = ?, ";
        values.add(this.getNgcFecConstituc());
        fields += " NGC_CVE_STATUS = ?, ";
        values.add(this.getNgcCveStatus());
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
        String sql = "INSERT INTO ANCERRAD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", NGC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getNgcNumContrato());

        fields += ", NGC_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getNgcCveTipoNeg());

        fields += ", NGC_CVE_CLASIF_PRO";
        fieldValues += ", ?";
        values.add(this.getNgcCveClasifPro());

        fields += ", NGC_CVE_FORMA_MAN";
        fieldValues += ", ?";
        values.add(this.getNgcCveFormaMan());

        fields += ", NGC_NOM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getNgcNomProducto());

        fields += ", NGC_NUM_PROSPECTO";
        fieldValues += ", ?";
        values.add(this.getNgcNumProspecto());

        fields += ", NGC_IMP_CONSTITUC";
        fieldValues += ", ?";
        values.add(this.getNgcImpConstituc());

        fields += ", NGC_PATRIMONIO_ENT";
        fieldValues += ", ?";
        values.add(this.getNgcPatrimonioEnt());

        fields += ", NGC_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getNgcTexComentario());

        fields += ", NGC_EJECUTIVO_ASIG";
        fieldValues += ", ?";
        values.add(this.getNgcEjecutivoAsig());

        fields += ", NGC_FEC_PROSPECTO";
        fieldValues += ", ?";
        values.add(this.getNgcFecProspecto());

        fields += ", NGC_FEC_CONSTITUC";
        fieldValues += ", ?";
        values.add(this.getNgcFecConstituc());

        fields += ", NGC_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getNgcCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ANCERRAD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND NGC_NUM_CONTRATO = ?";
        values.add(this.getNgcNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ancerrad instance = (Ancerrad) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getNgcNumContrato().equals(instance.getNgcNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getNgcCveTipoNeg().equals(instance.getNgcCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getNgcCveClasifPro().equals(instance.getNgcCveClasifPro()))
            equalObjects = false;
        if (equalObjects && !this.getNgcCveFormaMan().equals(instance.getNgcCveFormaMan()))
            equalObjects = false;
        if (equalObjects && !this.getNgcNomProducto().equals(instance.getNgcNomProducto()))
            equalObjects = false;
        if (equalObjects && !this.getNgcNumProspecto().equals(instance.getNgcNumProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getNgcImpConstituc().equals(instance.getNgcImpConstituc()))
            equalObjects = false;
        if (equalObjects && !this.getNgcPatrimonioEnt().equals(instance.getNgcPatrimonioEnt()))
            equalObjects = false;
        if (equalObjects && !this.getNgcTexComentario().equals(instance.getNgcTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getNgcEjecutivoAsig().equals(instance.getNgcEjecutivoAsig()))
            equalObjects = false;
        if (equalObjects && !this.getNgcFecProspecto().equals(instance.getNgcFecProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getNgcFecConstituc().equals(instance.getNgcFecConstituc()))
            equalObjects = false;
        if (equalObjects && !this.getNgcCveStatus().equals(instance.getNgcCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ancerrad result = new Ancerrad();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setNgcNumContrato((BigDecimal) objectData.getData("NGC_NUM_CONTRATO"));
        result.setNgcCveTipoNeg((String) objectData.getData("NGC_CVE_TIPO_NEG"));
        result.setNgcCveClasifPro((String) objectData.getData("NGC_CVE_CLASIF_PRO"));
        result.setNgcCveFormaMan((String) objectData.getData("NGC_CVE_FORMA_MAN"));
        result.setNgcNomProducto((String) objectData.getData("NGC_NOM_PRODUCTO"));
        result.setNgcNumProspecto((BigDecimal) objectData.getData("NGC_NUM_PROSPECTO"));
        result.setNgcImpConstituc((BigDecimal) objectData.getData("NGC_IMP_CONSTITUC"));
        result.setNgcPatrimonioEnt((String) objectData.getData("NGC_PATRIMONIO_ENT"));
        result.setNgcTexComentario((String) objectData.getData("NGC_TEX_COMENTARIO"));
        result.setNgcEjecutivoAsig((BigDecimal) objectData.getData("NGC_EJECUTIVO_ASIG"));
        result.setNgcFecProspecto((String) objectData.getData("NGC_FEC_PROSPECTO"));
        result.setNgcFecConstituc((String) objectData.getData("NGC_FEC_CONSTITUC"));
        result.setNgcCveStatus((String) objectData.getData("NGC_CVE_STATUS"));

        return result;

    }

}
