package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FUsuarioc extends DomainObject {

    String fusuIdUsuario = null;
    String fusuContrasena = null;
    String fusuNombreUsuario = null;
    BigDecimal fusuPreguntaSecreta = null;
    String fusuRespuestaSecreta = null;
    String fusuStatus = null;
    String fusuEmail = null;
    BigDecimal fperIdPerfil = null;
    BigDecimal fusuImpMaximo = null;
    String fusuUltAcceso = null;
    BigDecimal fusuMteo = null;

    public FUsuarioc() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFusuIdUsuario(String fusuIdUsuario) {
        this.fusuIdUsuario = fusuIdUsuario;
    }

    public String getFusuIdUsuario() {
        return this.fusuIdUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFusuContrasena(String fusuContrasena) {
        this.fusuContrasena = fusuContrasena;
    }

    public String getFusuContrasena() {
        return this.fusuContrasena;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFusuNombreUsuario(String fusuNombreUsuario) {
        this.fusuNombreUsuario = fusuNombreUsuario;
    }

    public String getFusuNombreUsuario() {
        return this.fusuNombreUsuario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFusuPreguntaSecreta(BigDecimal fusuPreguntaSecreta) {
        this.fusuPreguntaSecreta = fusuPreguntaSecreta;
    }

    public BigDecimal getFusuPreguntaSecreta() {
        return this.fusuPreguntaSecreta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFusuRespuestaSecreta(String fusuRespuestaSecreta) {
        this.fusuRespuestaSecreta = fusuRespuestaSecreta;
    }

    public String getFusuRespuestaSecreta() {
        return this.fusuRespuestaSecreta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFusuStatus(String fusuStatus) {
        this.fusuStatus = fusuStatus;
    }

    public String getFusuStatus() {
        return this.fusuStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFusuEmail(String fusuEmail) {
        this.fusuEmail = fusuEmail;
    }

    public String getFusuEmail() {
        return this.fusuEmail;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFperIdPerfil(BigDecimal fperIdPerfil) {
        this.fperIdPerfil = fperIdPerfil;
    }

    public BigDecimal getFperIdPerfil() {
        return this.fperIdPerfil;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFusuImpMaximo(BigDecimal fusuImpMaximo) {
        this.fusuImpMaximo = fusuImpMaximo;
    }

    public BigDecimal getFusuImpMaximo() {
        return this.fusuImpMaximo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFusuUltAcceso(String fusuUltAcceso) {
        this.fusuUltAcceso = fusuUltAcceso;
    }

    public String getFusuUltAcceso() {
        return this.fusuUltAcceso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFusuMteo(BigDecimal fusuMteo) {
        this.fusuMteo = fusuMteo;
    }

    public BigDecimal getFusuMteo() {
        return this.fusuMteo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_USUARIOC ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_USUARIOC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFusuIdUsuario() != null && "null".equals(this.getFusuIdUsuario())) {
            conditions += " AND FUSU_ID_USUARIO IS NULL";
        } else if (this.getFusuIdUsuario() != null) {
            conditions += " AND FUSU_ID_USUARIO = ?";
            values.add(this.getFusuIdUsuario());
        }

        if (this.getFusuContrasena() != null && "null".equals(this.getFusuContrasena())) {
            conditions += " AND FUSU_CONTRASENA IS NULL";
        } else if (this.getFusuContrasena() != null) {
            conditions += " AND FUSU_CONTRASENA = ?";
            values.add(this.getFusuContrasena());
        }

        if (this.getFusuNombreUsuario() != null && "null".equals(this.getFusuNombreUsuario())) {
            conditions += " AND FUSU_NOMBRE_USUARIO IS NULL";
        } else if (this.getFusuNombreUsuario() != null) {
            conditions += " AND FUSU_NOMBRE_USUARIO = ?";
            values.add(this.getFusuNombreUsuario());
        }

        if (this.getFusuPreguntaSecreta() != null && this.getFusuPreguntaSecreta().longValue() == -999) {
            conditions += " AND FUSU_PREGUNTA_SECRETA IS NULL";
        } else if (this.getFusuPreguntaSecreta() != null) {
            conditions += " AND FUSU_PREGUNTA_SECRETA = ?";
            values.add(this.getFusuPreguntaSecreta());
        }

        if (this.getFusuRespuestaSecreta() != null && "null".equals(this.getFusuRespuestaSecreta())) {
            conditions += " AND FUSU_RESPUESTA_SECRETA IS NULL";
        } else if (this.getFusuRespuestaSecreta() != null) {
            conditions += " AND FUSU_RESPUESTA_SECRETA = ?";
            values.add(this.getFusuRespuestaSecreta());
        }

        if (this.getFusuStatus() != null && "null".equals(this.getFusuStatus())) {
            conditions += " AND FUSU_STATUS IS NULL";
        } else if (this.getFusuStatus() != null) {
            conditions += " AND FUSU_STATUS = ?";
            values.add(this.getFusuStatus());
        }

        if (this.getFusuEmail() != null && "null".equals(this.getFusuEmail())) {
            conditions += " AND FUSU_EMAIL IS NULL";
        } else if (this.getFusuEmail() != null) {
            conditions += " AND FUSU_EMAIL = ?";
            values.add(this.getFusuEmail());
        }

        if (this.getFperIdPerfil() != null && this.getFperIdPerfil().longValue() == -999) {
            conditions += " AND FPER_ID_PERFIL IS NULL";
        } else if (this.getFperIdPerfil() != null) {
            conditions += " AND FPER_ID_PERFIL = ?";
            values.add(this.getFperIdPerfil());
        }

        if (this.getFusuImpMaximo() != null && this.getFusuImpMaximo().longValue() == -999) {
            conditions += " AND FUSU_IMP_MAXIMO IS NULL";
        } else if (this.getFusuImpMaximo() != null) {
            conditions += " AND FUSU_IMP_MAXIMO = ?";
            values.add(this.getFusuImpMaximo());
        }

        if (this.getFusuUltAcceso() != null && "null".equals(this.getFusuUltAcceso())) {
            conditions += " AND FUSU_ULT_ACCESO IS NULL";
        } else if (this.getFusuUltAcceso() != null) {
            conditions += " AND FUSU_ULT_ACCESO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFusuUltAcceso());
        }

        if (this.getFusuMteo() != null && this.getFusuMteo().longValue() == -999) {
            conditions += " AND FUSU_MTEO IS NULL";
        } else if (this.getFusuMteo() != null) {
            conditions += " AND FUSU_MTEO = ?";
            values.add(this.getFusuMteo());
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
        String sql = "UPDATE F_USUARIOC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FUSU_ID_USUARIO = ?, ";
        values.add(this.getFusuIdUsuario());
        fields += " FUSU_CONTRASENA = ?, ";
        values.add(this.getFusuContrasena());
        fields += " FUSU_NOMBRE_USUARIO = ?, ";
        values.add(this.getFusuNombreUsuario());
        fields += " FUSU_PREGUNTA_SECRETA = ?, ";
        values.add(this.getFusuPreguntaSecreta());
        fields += " FUSU_RESPUESTA_SECRETA = ?, ";
        values.add(this.getFusuRespuestaSecreta());
        fields += " FUSU_STATUS = ?, ";
        values.add(this.getFusuStatus());
        fields += " FUSU_EMAIL = ?, ";
        values.add(this.getFusuEmail());
        fields += " FPER_ID_PERFIL = ?, ";
        values.add(this.getFperIdPerfil());
        fields += " FUSU_IMP_MAXIMO = ?, ";
        values.add(this.getFusuImpMaximo());
        fields += " FUSU_ULT_ACCESO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFusuUltAcceso());
        fields += " FUSU_MTEO = ?, ";
        values.add(this.getFusuMteo());
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
        String sql = "INSERT INTO F_USUARIOC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FUSU_ID_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFusuIdUsuario());

        fields += ", FUSU_CONTRASENA";
        fieldValues += ", ?";
        values.add(this.getFusuContrasena());

        fields += ", FUSU_NOMBRE_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFusuNombreUsuario());

        fields += ", FUSU_PREGUNTA_SECRETA";
        fieldValues += ", ?";
        values.add(this.getFusuPreguntaSecreta());

        fields += ", FUSU_RESPUESTA_SECRETA";
        fieldValues += ", ?";
        values.add(this.getFusuRespuestaSecreta());

        fields += ", FUSU_STATUS";
        fieldValues += ", ?";
        values.add(this.getFusuStatus());

        fields += ", FUSU_EMAIL";
        fieldValues += ", ?";
        values.add(this.getFusuEmail());

        fields += ", FPER_ID_PERFIL";
        fieldValues += ", ?";
        values.add(this.getFperIdPerfil());

        fields += ", FUSU_IMP_MAXIMO";
        fieldValues += ", ?";
        values.add(this.getFusuImpMaximo());

        fields += ", FUSU_ULT_ACCESO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFusuUltAcceso());

        fields += ", FUSU_MTEO";
        fieldValues += ", ?";
        values.add(this.getFusuMteo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_USUARIOC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FUsuarioc instance = (FUsuarioc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFusuIdUsuario().equals(instance.getFusuIdUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getFusuContrasena().equals(instance.getFusuContrasena()))
            equalObjects = false;
        if (equalObjects && !this.getFusuNombreUsuario().equals(instance.getFusuNombreUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getFusuPreguntaSecreta().equals(instance.getFusuPreguntaSecreta()))
            equalObjects = false;
        if (equalObjects && !this.getFusuRespuestaSecreta().equals(instance.getFusuRespuestaSecreta()))
            equalObjects = false;
        if (equalObjects && !this.getFusuStatus().equals(instance.getFusuStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFusuEmail().equals(instance.getFusuEmail()))
            equalObjects = false;
        if (equalObjects && !this.getFperIdPerfil().equals(instance.getFperIdPerfil()))
            equalObjects = false;
        if (equalObjects && !this.getFusuImpMaximo().equals(instance.getFusuImpMaximo()))
            equalObjects = false;
        if (equalObjects && !this.getFusuUltAcceso().equals(instance.getFusuUltAcceso()))
            equalObjects = false;
        if (equalObjects && !this.getFusuMteo().equals(instance.getFusuMteo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FUsuarioc result = new FUsuarioc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFusuIdUsuario((String) objectData.getData("FUSU_ID_USUARIO"));
        result.setFusuContrasena((String) objectData.getData("FUSU_CONTRASENA"));
        result.setFusuNombreUsuario((String) objectData.getData("FUSU_NOMBRE_USUARIO"));
        result.setFusuPreguntaSecreta((BigDecimal) objectData.getData("FUSU_PREGUNTA_SECRETA"));
        result.setFusuRespuestaSecreta((String) objectData.getData("FUSU_RESPUESTA_SECRETA"));
        result.setFusuStatus((String) objectData.getData("FUSU_STATUS"));
        result.setFusuEmail((String) objectData.getData("FUSU_EMAIL"));
        result.setFperIdPerfil((BigDecimal) objectData.getData("FPER_ID_PERFIL"));
        result.setFusuImpMaximo((BigDecimal) objectData.getData("FUSU_IMP_MAXIMO"));
        result.setFusuUltAcceso((String) objectData.getData("FUSU_ULT_ACCESO"));
        result.setFusuMteo((BigDecimal) objectData.getData("FUSU_MTEO"));

        return result;

    }

}
