package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ACREDITADOSS_PK", columns = { "ACT_ID_INTERMEDIARIO", "ACT_ID_ACREDITADO" }, sequences = { "MANUAL" })
public class FAcreditados extends DomainObject {

    BigDecimal actIdIntermediario = null;
    BigDecimal actIdAcreditado = null;
    String actNombreAcreditado = null;
    String actFirmaAcreditado = null;
    String actEmail = null;
    String actNumTelefono1 = null;
    String actCalle = null;
    String actNumero = null;
    String actColonia = null;
    String actDelMunicipio = null;
    String actEstado = null;
    String actPais = null;
    String actCodigoPostal = null;
    String actNumTelefono2 = null;
    String actFecAlta = null;
    String actStatus = null;
    String actPuesto = null;
    String actComentario = null;

    public FAcreditados() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setActIdIntermediario(BigDecimal actIdIntermediario) {
        this.actIdIntermediario = actIdIntermediario;
    }

    public BigDecimal getActIdIntermediario() {
        return this.actIdIntermediario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setActIdAcreditado(BigDecimal actIdAcreditado) {
        this.actIdAcreditado = actIdAcreditado;
    }

    public BigDecimal getActIdAcreditado() {
        return this.actIdAcreditado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActNombreAcreditado(String actNombreAcreditado) {
        this.actNombreAcreditado = actNombreAcreditado;
    }

    public String getActNombreAcreditado() {
        return this.actNombreAcreditado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActFirmaAcreditado(String actFirmaAcreditado) {
        this.actFirmaAcreditado = actFirmaAcreditado;
    }

    public String getActFirmaAcreditado() {
        return this.actFirmaAcreditado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActEmail(String actEmail) {
        this.actEmail = actEmail;
    }

    public String getActEmail() {
        return this.actEmail;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActNumTelefono1(String actNumTelefono1) {
        this.actNumTelefono1 = actNumTelefono1;
    }

    public String getActNumTelefono1() {
        return this.actNumTelefono1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActCalle(String actCalle) {
        this.actCalle = actCalle;
    }

    public String getActCalle() {
        return this.actCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActNumero(String actNumero) {
        this.actNumero = actNumero;
    }

    public String getActNumero() {
        return this.actNumero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActColonia(String actColonia) {
        this.actColonia = actColonia;
    }

    public String getActColonia() {
        return this.actColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActDelMunicipio(String actDelMunicipio) {
        this.actDelMunicipio = actDelMunicipio;
    }

    public String getActDelMunicipio() {
        return this.actDelMunicipio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActEstado(String actEstado) {
        this.actEstado = actEstado;
    }

    public String getActEstado() {
        return this.actEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActPais(String actPais) {
        this.actPais = actPais;
    }

    public String getActPais() {
        return this.actPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActCodigoPostal(String actCodigoPostal) {
        this.actCodigoPostal = actCodigoPostal;
    }

    public String getActCodigoPostal() {
        return this.actCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActNumTelefono2(String actNumTelefono2) {
        this.actNumTelefono2 = actNumTelefono2;
    }

    public String getActNumTelefono2() {
        return this.actNumTelefono2;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setActFecAlta(String actFecAlta) {
        this.actFecAlta = actFecAlta;
    }

    public String getActFecAlta() {
        return this.actFecAlta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActStatus(String actStatus) {
        this.actStatus = actStatus;
    }

    public String getActStatus() {
        return this.actStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActPuesto(String actPuesto) {
        this.actPuesto = actPuesto;
    }

    public String getActPuesto() {
        return this.actPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActComentario(String actComentario) {
        this.actComentario = actComentario;
    }

    public String getActComentario() {
        return this.actComentario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ACREDITADOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getActIdIntermediario() != null && this.getActIdIntermediario().longValue() == -999) {
            conditions += " AND ACT_ID_INTERMEDIARIO IS NULL";
        } else if (this.getActIdIntermediario() != null) {
            conditions += " AND ACT_ID_INTERMEDIARIO = ?";
            values.add(this.getActIdIntermediario());
        }

        if (this.getActIdAcreditado() != null && this.getActIdAcreditado().longValue() == -999) {
            conditions += " AND ACT_ID_ACREDITADO IS NULL";
        } else if (this.getActIdAcreditado() != null) {
            conditions += " AND ACT_ID_ACREDITADO = ?";
            values.add(this.getActIdAcreditado());
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
        String sql = "SELECT * FROM F_ACREDITADOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getActIdIntermediario() != null && this.getActIdIntermediario().longValue() == -999) {
            conditions += " AND ACT_ID_INTERMEDIARIO IS NULL";
        } else if (this.getActIdIntermediario() != null) {
            conditions += " AND ACT_ID_INTERMEDIARIO = ?";
            values.add(this.getActIdIntermediario());
        }

        if (this.getActIdAcreditado() != null && this.getActIdAcreditado().longValue() == -999) {
            conditions += " AND ACT_ID_ACREDITADO IS NULL";
        } else if (this.getActIdAcreditado() != null) {
            conditions += " AND ACT_ID_ACREDITADO = ?";
            values.add(this.getActIdAcreditado());
        }

        if (this.getActNombreAcreditado() != null && "null".equals(this.getActNombreAcreditado())) {
            conditions += " AND ACT_NOMBRE_ACREDITADO IS NULL";
        } else if (this.getActNombreAcreditado() != null) {
            conditions += " AND ACT_NOMBRE_ACREDITADO = ?";
            values.add(this.getActNombreAcreditado());
        }

        if (this.getActFirmaAcreditado() != null && "null".equals(this.getActFirmaAcreditado())) {
            conditions += " AND ACT_FIRMA_ACREDITADO IS NULL";
        } else if (this.getActFirmaAcreditado() != null) {
            conditions += " AND ACT_FIRMA_ACREDITADO = ?";
            values.add(this.getActFirmaAcreditado());
        }

        if (this.getActEmail() != null && "null".equals(this.getActEmail())) {
            conditions += " AND ACT_EMAIL IS NULL";
        } else if (this.getActEmail() != null) {
            conditions += " AND ACT_EMAIL = ?";
            values.add(this.getActEmail());
        }

        if (this.getActNumTelefono1() != null && "null".equals(this.getActNumTelefono1())) {
            conditions += " AND ACT_NUM_TELEFONO1 IS NULL";
        } else if (this.getActNumTelefono1() != null) {
            conditions += " AND ACT_NUM_TELEFONO1 = ?";
            values.add(this.getActNumTelefono1());
        }

        if (this.getActCalle() != null && "null".equals(this.getActCalle())) {
            conditions += " AND ACT_CALLE IS NULL";
        } else if (this.getActCalle() != null) {
            conditions += " AND ACT_CALLE = ?";
            values.add(this.getActCalle());
        }

        if (this.getActNumero() != null && "null".equals(this.getActNumero())) {
            conditions += " AND ACT_NUMERO IS NULL";
        } else if (this.getActNumero() != null) {
            conditions += " AND ACT_NUMERO = ?";
            values.add(this.getActNumero());
        }

        if (this.getActColonia() != null && "null".equals(this.getActColonia())) {
            conditions += " AND ACT_COLONIA IS NULL";
        } else if (this.getActColonia() != null) {
            conditions += " AND ACT_COLONIA = ?";
            values.add(this.getActColonia());
        }

        if (this.getActDelMunicipio() != null && "null".equals(this.getActDelMunicipio())) {
            conditions += " AND ACT_DEL_MUNICIPIO IS NULL";
        } else if (this.getActDelMunicipio() != null) {
            conditions += " AND ACT_DEL_MUNICIPIO = ?";
            values.add(this.getActDelMunicipio());
        }

        if (this.getActEstado() != null && "null".equals(this.getActEstado())) {
            conditions += " AND ACT_ESTADO IS NULL";
        } else if (this.getActEstado() != null) {
            conditions += " AND ACT_ESTADO = ?";
            values.add(this.getActEstado());
        }

        if (this.getActPais() != null && "null".equals(this.getActPais())) {
            conditions += " AND ACT_PAIS IS NULL";
        } else if (this.getActPais() != null) {
            conditions += " AND ACT_PAIS = ?";
            values.add(this.getActPais());
        }

        if (this.getActCodigoPostal() != null && "null".equals(this.getActCodigoPostal())) {
            conditions += " AND ACT_CODIGO_POSTAL IS NULL";
        } else if (this.getActCodigoPostal() != null) {
            conditions += " AND ACT_CODIGO_POSTAL = ?";
            values.add(this.getActCodigoPostal());
        }

        if (this.getActNumTelefono2() != null && "null".equals(this.getActNumTelefono2())) {
            conditions += " AND ACT_NUM_TELEFONO2 IS NULL";
        } else if (this.getActNumTelefono2() != null) {
            conditions += " AND ACT_NUM_TELEFONO2 = ?";
            values.add(this.getActNumTelefono2());
        }

        if (this.getActFecAlta() != null && "null".equals(this.getActFecAlta())) {
            conditions += " AND ACT_FEC_ALTA IS NULL";
        } else if (this.getActFecAlta() != null) {
            conditions += " AND ACT_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getActFecAlta());
        }

        if (this.getActStatus() != null && "null".equals(this.getActStatus())) {
            conditions += " AND ACT_STATUS IS NULL";
        } else if (this.getActStatus() != null) {
            conditions += " AND ACT_STATUS = ?";
            values.add(this.getActStatus());
        }

        if (this.getActPuesto() != null && "null".equals(this.getActPuesto())) {
            conditions += " AND ACT_PUESTO IS NULL";
        } else if (this.getActPuesto() != null) {
            conditions += " AND ACT_PUESTO = ?";
            values.add(this.getActPuesto());
        }

        if (this.getActComentario() != null && "null".equals(this.getActComentario())) {
            conditions += " AND ACT_COMENTARIO IS NULL";
        } else if (this.getActComentario() != null) {
            conditions += " AND ACT_COMENTARIO = ?";
            values.add(this.getActComentario());
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
        String sql = "UPDATE F_ACREDITADOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ACT_ID_INTERMEDIARIO = ?";
        pkValues.add(this.getActIdIntermediario());
        conditions += " AND ACT_ID_ACREDITADO = ?";
        pkValues.add(this.getActIdAcreditado());
        fields += " ACT_NOMBRE_ACREDITADO = ?, ";
        values.add(this.getActNombreAcreditado());
        fields += " ACT_FIRMA_ACREDITADO = ?, ";
        values.add(this.getActFirmaAcreditado());
        fields += " ACT_EMAIL = ?, ";
        values.add(this.getActEmail());
        fields += " ACT_NUM_TELEFONO1 = ?, ";
        values.add(this.getActNumTelefono1());
        fields += " ACT_CALLE = ?, ";
        values.add(this.getActCalle());
        fields += " ACT_NUMERO = ?, ";
        values.add(this.getActNumero());
        fields += " ACT_COLONIA = ?, ";
        values.add(this.getActColonia());
        fields += " ACT_DEL_MUNICIPIO = ?, ";
        values.add(this.getActDelMunicipio());
        fields += " ACT_ESTADO = ?, ";
        values.add(this.getActEstado());
        fields += " ACT_PAIS = ?, ";
        values.add(this.getActPais());
        fields += " ACT_CODIGO_POSTAL = ?, ";
        values.add(this.getActCodigoPostal());
        fields += " ACT_NUM_TELEFONO2 = ?, ";
        values.add(this.getActNumTelefono2());
        fields += " ACT_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getActFecAlta());
        fields += " ACT_STATUS = ?, ";
        values.add(this.getActStatus());
        fields += " ACT_PUESTO = ?, ";
        values.add(this.getActPuesto());
        fields += " ACT_COMENTARIO = ?, ";
        values.add(this.getActComentario());
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
        String sql = "INSERT INTO F_ACREDITADOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ACT_ID_INTERMEDIARIO";
        fieldValues += ", ?";
        values.add(this.getActIdIntermediario());

        fields += ", ACT_ID_ACREDITADO";
        fieldValues += ", ?";
        values.add(this.getActIdAcreditado());

        fields += ", ACT_NOMBRE_ACREDITADO";
        fieldValues += ", ?";
        values.add(this.getActNombreAcreditado());

        fields += ", ACT_FIRMA_ACREDITADO";
        fieldValues += ", ?";
        values.add(this.getActFirmaAcreditado());

        fields += ", ACT_EMAIL";
        fieldValues += ", ?";
        values.add(this.getActEmail());

        fields += ", ACT_NUM_TELEFONO1";
        fieldValues += ", ?";
        values.add(this.getActNumTelefono1());

        fields += ", ACT_CALLE";
        fieldValues += ", ?";
        values.add(this.getActCalle());

        fields += ", ACT_NUMERO";
        fieldValues += ", ?";
        values.add(this.getActNumero());

        fields += ", ACT_COLONIA";
        fieldValues += ", ?";
        values.add(this.getActColonia());

        fields += ", ACT_DEL_MUNICIPIO";
        fieldValues += ", ?";
        values.add(this.getActDelMunicipio());

        fields += ", ACT_ESTADO";
        fieldValues += ", ?";
        values.add(this.getActEstado());

        fields += ", ACT_PAIS";
        fieldValues += ", ?";
        values.add(this.getActPais());

        fields += ", ACT_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getActCodigoPostal());

        fields += ", ACT_NUM_TELEFONO2";
        fieldValues += ", ?";
        values.add(this.getActNumTelefono2());

        fields += ", ACT_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getActFecAlta());

        fields += ", ACT_STATUS";
        fieldValues += ", ?";
        values.add(this.getActStatus());

        fields += ", ACT_PUESTO";
        fieldValues += ", ?";
        values.add(this.getActPuesto());

        fields += ", ACT_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getActComentario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ACREDITADOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ACT_ID_INTERMEDIARIO = ?";
        values.add(this.getActIdIntermediario());
        conditions += " AND ACT_ID_ACREDITADO = ?";
        values.add(this.getActIdAcreditado());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAcreditados instance = (FAcreditados) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getActIdIntermediario().equals(instance.getActIdIntermediario()))
            equalObjects = false;
        if (equalObjects && !this.getActIdAcreditado().equals(instance.getActIdAcreditado()))
            equalObjects = false;
        if (equalObjects && !this.getActNombreAcreditado().equals(instance.getActNombreAcreditado()))
            equalObjects = false;
        if (equalObjects && !this.getActFirmaAcreditado().equals(instance.getActFirmaAcreditado()))
            equalObjects = false;
        if (equalObjects && !this.getActEmail().equals(instance.getActEmail()))
            equalObjects = false;
        if (equalObjects && !this.getActNumTelefono1().equals(instance.getActNumTelefono1()))
            equalObjects = false;
        if (equalObjects && !this.getActCalle().equals(instance.getActCalle()))
            equalObjects = false;
        if (equalObjects && !this.getActNumero().equals(instance.getActNumero()))
            equalObjects = false;
        if (equalObjects && !this.getActColonia().equals(instance.getActColonia()))
            equalObjects = false;
        if (equalObjects && !this.getActDelMunicipio().equals(instance.getActDelMunicipio()))
            equalObjects = false;
        if (equalObjects && !this.getActEstado().equals(instance.getActEstado()))
            equalObjects = false;
        if (equalObjects && !this.getActPais().equals(instance.getActPais()))
            equalObjects = false;
        if (equalObjects && !this.getActCodigoPostal().equals(instance.getActCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getActNumTelefono2().equals(instance.getActNumTelefono2()))
            equalObjects = false;
        if (equalObjects && !this.getActFecAlta().equals(instance.getActFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getActStatus().equals(instance.getActStatus()))
            equalObjects = false;
        if (equalObjects && !this.getActPuesto().equals(instance.getActPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getActComentario().equals(instance.getActComentario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAcreditados result = new FAcreditados();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setActIdIntermediario((BigDecimal) objectData.getData("ACT_ID_INTERMEDIARIO"));
        result.setActIdAcreditado((BigDecimal) objectData.getData("ACT_ID_ACREDITADO"));
        result.setActNombreAcreditado((String) objectData.getData("ACT_NOMBRE_ACREDITADO"));
        result.setActFirmaAcreditado((String) objectData.getData("ACT_FIRMA_ACREDITADO"));
        result.setActEmail((String) objectData.getData("ACT_EMAIL"));
        result.setActNumTelefono1((String) objectData.getData("ACT_NUM_TELEFONO1"));
        result.setActCalle((String) objectData.getData("ACT_CALLE"));
        result.setActNumero((String) objectData.getData("ACT_NUMERO"));
        result.setActColonia((String) objectData.getData("ACT_COLONIA"));
        result.setActDelMunicipio((String) objectData.getData("ACT_DEL_MUNICIPIO"));
        result.setActEstado((String) objectData.getData("ACT_ESTADO"));
        result.setActPais((String) objectData.getData("ACT_PAIS"));
        result.setActCodigoPostal((String) objectData.getData("ACT_CODIGO_POSTAL"));
        result.setActNumTelefono2((String) objectData.getData("ACT_NUM_TELEFONO2"));
        result.setActFecAlta((String) objectData.getData("ACT_FEC_ALTA"));
        result.setActStatus((String) objectData.getData("ACT_STATUS"));
        result.setActPuesto((String) objectData.getData("ACT_PUESTO"));
        result.setActComentario((String) objectData.getData("ACT_COMENTARIO"));

        return result;

    }

}
