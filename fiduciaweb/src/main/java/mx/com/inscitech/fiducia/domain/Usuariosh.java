package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Usuariosh extends DomainObject {

    BigDecimal usuNumUsuario = null;
    String usuNomUsuario = null;
    String usuTipoUsuario = null;
    BigDecimal usuNumPuesto = null;
    String usuNomPuesto = null;
    String usuPassword = null;
    BigDecimal usuAnoAltaReg = null;
    BigDecimal usuMesAltaReg = null;
    BigDecimal usuDiaAltaReg = null;
    BigDecimal usuAnoUltMod = null;
    BigDecimal usuMesUltMod = null;
    BigDecimal usuDiaUltMod = null;
    String usuCveStUsuario = null;
    BigDecimal usuNumNivel1 = null;
    BigDecimal usuNumNivel2 = null;
    BigDecimal usuNumNivel3 = null;
    BigDecimal usuNumNivel4 = null;
    BigDecimal usuNumNivel5 = null;
    BigDecimal usuCentroLogro = null;
    BigDecimal usuCentroCosto = null;
    BigDecimal usuPtceGpot = null;
    String usuFechaUltAcceso = null;
    String usuFechaPassword = null;
    BigDecimal usuEstatusSeguridad = null;
    BigDecimal usuToken = null;
    BigDecimal usuMontoAutorizado = null;
    String usuPerfilInterno = null;

    public Usuariosh() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumUsuario(BigDecimal usuNumUsuario) {
        this.usuNumUsuario = usuNumUsuario;
    }

    public BigDecimal getUsuNumUsuario() {
        return this.usuNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setUsuNomUsuario(String usuNomUsuario) {
        this.usuNomUsuario = usuNomUsuario;
    }

    public String getUsuNomUsuario() {
        return this.usuNomUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setUsuTipoUsuario(String usuTipoUsuario) {
        this.usuTipoUsuario = usuTipoUsuario;
    }

    public String getUsuTipoUsuario() {
        return this.usuTipoUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumPuesto(BigDecimal usuNumPuesto) {
        this.usuNumPuesto = usuNumPuesto;
    }

    public BigDecimal getUsuNumPuesto() {
        return this.usuNumPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setUsuNomPuesto(String usuNomPuesto) {
        this.usuNomPuesto = usuNomPuesto;
    }

    public String getUsuNomPuesto() {
        return this.usuNomPuesto;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

    public String getUsuPassword() {
        return this.usuPassword;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setUsuAnoAltaReg(BigDecimal usuAnoAltaReg) {
        this.usuAnoAltaReg = usuAnoAltaReg;
    }

    public BigDecimal getUsuAnoAltaReg() {
        return this.usuAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setUsuMesAltaReg(BigDecimal usuMesAltaReg) {
        this.usuMesAltaReg = usuMesAltaReg;
    }

    public BigDecimal getUsuMesAltaReg() {
        return this.usuMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setUsuDiaAltaReg(BigDecimal usuDiaAltaReg) {
        this.usuDiaAltaReg = usuDiaAltaReg;
    }

    public BigDecimal getUsuDiaAltaReg() {
        return this.usuDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setUsuAnoUltMod(BigDecimal usuAnoUltMod) {
        this.usuAnoUltMod = usuAnoUltMod;
    }

    public BigDecimal getUsuAnoUltMod() {
        return this.usuAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setUsuMesUltMod(BigDecimal usuMesUltMod) {
        this.usuMesUltMod = usuMesUltMod;
    }

    public BigDecimal getUsuMesUltMod() {
        return this.usuMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setUsuDiaUltMod(BigDecimal usuDiaUltMod) {
        this.usuDiaUltMod = usuDiaUltMod;
    }

    public BigDecimal getUsuDiaUltMod() {
        return this.usuDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setUsuCveStUsuario(String usuCveStUsuario) {
        this.usuCveStUsuario = usuCveStUsuario;
    }

    public String getUsuCveStUsuario() {
        return this.usuCveStUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumNivel1(BigDecimal usuNumNivel1) {
        this.usuNumNivel1 = usuNumNivel1;
    }

    public BigDecimal getUsuNumNivel1() {
        return this.usuNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumNivel2(BigDecimal usuNumNivel2) {
        this.usuNumNivel2 = usuNumNivel2;
    }

    public BigDecimal getUsuNumNivel2() {
        return this.usuNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumNivel3(BigDecimal usuNumNivel3) {
        this.usuNumNivel3 = usuNumNivel3;
    }

    public BigDecimal getUsuNumNivel3() {
        return this.usuNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumNivel4(BigDecimal usuNumNivel4) {
        this.usuNumNivel4 = usuNumNivel4;
    }

    public BigDecimal getUsuNumNivel4() {
        return this.usuNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumNivel5(BigDecimal usuNumNivel5) {
        this.usuNumNivel5 = usuNumNivel5;
    }

    public BigDecimal getUsuNumNivel5() {
        return this.usuNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuCentroLogro(BigDecimal usuCentroLogro) {
        this.usuCentroLogro = usuCentroLogro;
    }

    public BigDecimal getUsuCentroLogro() {
        return this.usuCentroLogro;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuCentroCosto(BigDecimal usuCentroCosto) {
        this.usuCentroCosto = usuCentroCosto;
    }

    public BigDecimal getUsuCentroCosto() {
        return this.usuCentroCosto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setUsuPtceGpot(BigDecimal usuPtceGpot) {
        this.usuPtceGpot = usuPtceGpot;
    }

    public BigDecimal getUsuPtceGpot() {
        return this.usuPtceGpot;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setUsuFechaUltAcceso(String usuFechaUltAcceso) {
        this.usuFechaUltAcceso = usuFechaUltAcceso;
    }

    public String getUsuFechaUltAcceso() {
        return this.usuFechaUltAcceso;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setUsuFechaPassword(String usuFechaPassword) {
        this.usuFechaPassword = usuFechaPassword;
    }

    public String getUsuFechaPassword() {
        return this.usuFechaPassword;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setUsuEstatusSeguridad(BigDecimal usuEstatusSeguridad) {
        this.usuEstatusSeguridad = usuEstatusSeguridad;
    }

    public BigDecimal getUsuEstatusSeguridad() {
        return this.usuEstatusSeguridad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setUsuToken(BigDecimal usuToken) {
        this.usuToken = usuToken;
    }

    public BigDecimal getUsuToken() {
        return this.usuToken;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setUsuMontoAutorizado(BigDecimal usuMontoAutorizado) {
        this.usuMontoAutorizado = usuMontoAutorizado;
    }

    public BigDecimal getUsuMontoAutorizado() {
        return this.usuMontoAutorizado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setUsuPerfilInterno(String usuPerfilInterno) {
        this.usuPerfilInterno = usuPerfilInterno;
    }

    public String getUsuPerfilInterno() {
        return this.usuPerfilInterno;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM USUARIOSH ";

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
        String sql = "SELECT * FROM USUARIOSH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getUsuNomUsuario() != null && "null".equals(this.getUsuNomUsuario())) {
            conditions += " AND USU_NOM_USUARIO IS NULL";
        } else if (this.getUsuNomUsuario() != null) {
            conditions += " AND USU_NOM_USUARIO = ?";
            values.add(this.getUsuNomUsuario());
        }

        if (this.getUsuTipoUsuario() != null && "null".equals(this.getUsuTipoUsuario())) {
            conditions += " AND USU_TIPO_USUARIO IS NULL";
        } else if (this.getUsuTipoUsuario() != null) {
            conditions += " AND USU_TIPO_USUARIO = ?";
            values.add(this.getUsuTipoUsuario());
        }

        if (this.getUsuNumPuesto() != null && this.getUsuNumPuesto().longValue() == -999) {
            conditions += " AND USU_NUM_PUESTO IS NULL";
        } else if (this.getUsuNumPuesto() != null) {
            conditions += " AND USU_NUM_PUESTO = ?";
            values.add(this.getUsuNumPuesto());
        }

        if (this.getUsuNomPuesto() != null && "null".equals(this.getUsuNomPuesto())) {
            conditions += " AND USU_NOM_PUESTO IS NULL";
        } else if (this.getUsuNomPuesto() != null) {
            conditions += " AND USU_NOM_PUESTO = ?";
            values.add(this.getUsuNomPuesto());
        }

        if (this.getUsuPassword() != null && "null".equals(this.getUsuPassword())) {
            conditions += " AND USU_PASSWORD IS NULL";
        } else if (this.getUsuPassword() != null) {
            conditions += " AND USU_PASSWORD = ?";
            values.add(this.getUsuPassword());
        }

        if (this.getUsuAnoAltaReg() != null && this.getUsuAnoAltaReg().longValue() == -999) {
            conditions += " AND USU_ANO_ALTA_REG IS NULL";
        } else if (this.getUsuAnoAltaReg() != null) {
            conditions += " AND USU_ANO_ALTA_REG = ?";
            values.add(this.getUsuAnoAltaReg());
        }

        if (this.getUsuMesAltaReg() != null && this.getUsuMesAltaReg().longValue() == -999) {
            conditions += " AND USU_MES_ALTA_REG IS NULL";
        } else if (this.getUsuMesAltaReg() != null) {
            conditions += " AND USU_MES_ALTA_REG = ?";
            values.add(this.getUsuMesAltaReg());
        }

        if (this.getUsuDiaAltaReg() != null && this.getUsuDiaAltaReg().longValue() == -999) {
            conditions += " AND USU_DIA_ALTA_REG IS NULL";
        } else if (this.getUsuDiaAltaReg() != null) {
            conditions += " AND USU_DIA_ALTA_REG = ?";
            values.add(this.getUsuDiaAltaReg());
        }

        if (this.getUsuAnoUltMod() != null && this.getUsuAnoUltMod().longValue() == -999) {
            conditions += " AND USU_ANO_ULT_MOD IS NULL";
        } else if (this.getUsuAnoUltMod() != null) {
            conditions += " AND USU_ANO_ULT_MOD = ?";
            values.add(this.getUsuAnoUltMod());
        }

        if (this.getUsuMesUltMod() != null && this.getUsuMesUltMod().longValue() == -999) {
            conditions += " AND USU_MES_ULT_MOD IS NULL";
        } else if (this.getUsuMesUltMod() != null) {
            conditions += " AND USU_MES_ULT_MOD = ?";
            values.add(this.getUsuMesUltMod());
        }

        if (this.getUsuDiaUltMod() != null && this.getUsuDiaUltMod().longValue() == -999) {
            conditions += " AND USU_DIA_ULT_MOD IS NULL";
        } else if (this.getUsuDiaUltMod() != null) {
            conditions += " AND USU_DIA_ULT_MOD = ?";
            values.add(this.getUsuDiaUltMod());
        }

        if (this.getUsuCveStUsuario() != null && "null".equals(this.getUsuCveStUsuario())) {
            conditions += " AND USU_CVE_ST_USUARIO IS NULL";
        } else if (this.getUsuCveStUsuario() != null) {
            conditions += " AND USU_CVE_ST_USUARIO = ?";
            values.add(this.getUsuCveStUsuario());
        }

        if (this.getUsuNumNivel1() != null && this.getUsuNumNivel1().longValue() == -999) {
            conditions += " AND USU_NUM_NIVEL1 IS NULL";
        } else if (this.getUsuNumNivel1() != null) {
            conditions += " AND USU_NUM_NIVEL1 = ?";
            values.add(this.getUsuNumNivel1());
        }

        if (this.getUsuNumNivel2() != null && this.getUsuNumNivel2().longValue() == -999) {
            conditions += " AND USU_NUM_NIVEL2 IS NULL";
        } else if (this.getUsuNumNivel2() != null) {
            conditions += " AND USU_NUM_NIVEL2 = ?";
            values.add(this.getUsuNumNivel2());
        }

        if (this.getUsuNumNivel3() != null && this.getUsuNumNivel3().longValue() == -999) {
            conditions += " AND USU_NUM_NIVEL3 IS NULL";
        } else if (this.getUsuNumNivel3() != null) {
            conditions += " AND USU_NUM_NIVEL3 = ?";
            values.add(this.getUsuNumNivel3());
        }

        if (this.getUsuNumNivel4() != null && this.getUsuNumNivel4().longValue() == -999) {
            conditions += " AND USU_NUM_NIVEL4 IS NULL";
        } else if (this.getUsuNumNivel4() != null) {
            conditions += " AND USU_NUM_NIVEL4 = ?";
            values.add(this.getUsuNumNivel4());
        }

        if (this.getUsuNumNivel5() != null && this.getUsuNumNivel5().longValue() == -999) {
            conditions += " AND USU_NUM_NIVEL5 IS NULL";
        } else if (this.getUsuNumNivel5() != null) {
            conditions += " AND USU_NUM_NIVEL5 = ?";
            values.add(this.getUsuNumNivel5());
        }

        if (this.getUsuCentroLogro() != null && this.getUsuCentroLogro().longValue() == -999) {
            conditions += " AND USU_CENTRO_LOGRO IS NULL";
        } else if (this.getUsuCentroLogro() != null) {
            conditions += " AND USU_CENTRO_LOGRO = ?";
            values.add(this.getUsuCentroLogro());
        }

        if (this.getUsuCentroCosto() != null && this.getUsuCentroCosto().longValue() == -999) {
            conditions += " AND USU_CENTRO_COSTO IS NULL";
        } else if (this.getUsuCentroCosto() != null) {
            conditions += " AND USU_CENTRO_COSTO = ?";
            values.add(this.getUsuCentroCosto());
        }

        if (this.getUsuPtceGpot() != null && this.getUsuPtceGpot().longValue() == -999) {
            conditions += " AND USU_PTCE_GPOT IS NULL";
        } else if (this.getUsuPtceGpot() != null) {
            conditions += " AND USU_PTCE_GPOT = ?";
            values.add(this.getUsuPtceGpot());
        }

        if (this.getUsuFechaUltAcceso() != null && "null".equals(this.getUsuFechaUltAcceso())) {
            conditions += " AND USU_FECHA_ULT_ACCESO IS NULL";
        } else if (this.getUsuFechaUltAcceso() != null) {
            conditions += " AND USU_FECHA_ULT_ACCESO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getUsuFechaUltAcceso());
        }

        if (this.getUsuFechaPassword() != null && "null".equals(this.getUsuFechaPassword())) {
            conditions += " AND USU_FECHA_PASSWORD IS NULL";
        } else if (this.getUsuFechaPassword() != null) {
            conditions += " AND USU_FECHA_PASSWORD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getUsuFechaPassword());
        }

        if (this.getUsuEstatusSeguridad() != null && this.getUsuEstatusSeguridad().longValue() == -999) {
            conditions += " AND USU_ESTATUS_SEGURIDAD IS NULL";
        } else if (this.getUsuEstatusSeguridad() != null) {
            conditions += " AND USU_ESTATUS_SEGURIDAD = ?";
            values.add(this.getUsuEstatusSeguridad());
        }

        if (this.getUsuToken() != null && this.getUsuToken().longValue() == -999) {
            conditions += " AND USU_TOKEN IS NULL";
        } else if (this.getUsuToken() != null) {
            conditions += " AND USU_TOKEN = ?";
            values.add(this.getUsuToken());
        }

        if (this.getUsuMontoAutorizado() != null && this.getUsuMontoAutorizado().longValue() == -999) {
            conditions += " AND USU_MONTO_AUTORIZADO IS NULL";
        } else if (this.getUsuMontoAutorizado() != null) {
            conditions += " AND USU_MONTO_AUTORIZADO = ?";
            values.add(this.getUsuMontoAutorizado());
        }

        if (this.getUsuPerfilInterno() != null && "null".equals(this.getUsuPerfilInterno())) {
            conditions += " AND USU_PERFIL_INTERNO IS NULL";
        } else if (this.getUsuPerfilInterno() != null) {
            conditions += " AND USU_PERFIL_INTERNO = ?";
            values.add(this.getUsuPerfilInterno());
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
        String sql = "UPDATE USUARIOSH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " USU_NUM_USUARIO = ?, ";
        values.add(this.getUsuNumUsuario());
        fields += " USU_NOM_USUARIO = ?, ";
        values.add(this.getUsuNomUsuario());
        fields += " USU_TIPO_USUARIO = ?, ";
        values.add(this.getUsuTipoUsuario());
        fields += " USU_NUM_PUESTO = ?, ";
        values.add(this.getUsuNumPuesto());
        fields += " USU_NOM_PUESTO = ?, ";
        values.add(this.getUsuNomPuesto());
        fields += " USU_PASSWORD = ?, ";
        values.add(this.getUsuPassword());
        fields += " USU_ANO_ALTA_REG = ?, ";
        values.add(this.getUsuAnoAltaReg());
        fields += " USU_MES_ALTA_REG = ?, ";
        values.add(this.getUsuMesAltaReg());
        fields += " USU_DIA_ALTA_REG = ?, ";
        values.add(this.getUsuDiaAltaReg());
        fields += " USU_ANO_ULT_MOD = ?, ";
        values.add(this.getUsuAnoUltMod());
        fields += " USU_MES_ULT_MOD = ?, ";
        values.add(this.getUsuMesUltMod());
        fields += " USU_DIA_ULT_MOD = ?, ";
        values.add(this.getUsuDiaUltMod());
        fields += " USU_CVE_ST_USUARIO = ?, ";
        values.add(this.getUsuCveStUsuario());
        fields += " USU_NUM_NIVEL1 = ?, ";
        values.add(this.getUsuNumNivel1());
        fields += " USU_NUM_NIVEL2 = ?, ";
        values.add(this.getUsuNumNivel2());
        fields += " USU_NUM_NIVEL3 = ?, ";
        values.add(this.getUsuNumNivel3());
        fields += " USU_NUM_NIVEL4 = ?, ";
        values.add(this.getUsuNumNivel4());
        fields += " USU_NUM_NIVEL5 = ?, ";
        values.add(this.getUsuNumNivel5());
        fields += " USU_CENTRO_LOGRO = ?, ";
        values.add(this.getUsuCentroLogro());
        fields += " USU_CENTRO_COSTO = ?, ";
        values.add(this.getUsuCentroCosto());
        fields += " USU_PTCE_GPOT = ?, ";
        values.add(this.getUsuPtceGpot());
        fields += " USU_FECHA_ULT_ACCESO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getUsuFechaUltAcceso());
        fields += " USU_FECHA_PASSWORD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getUsuFechaPassword());
        fields += " USU_ESTATUS_SEGURIDAD = ?, ";
        values.add(this.getUsuEstatusSeguridad());
        fields += " USU_TOKEN = ?, ";
        values.add(this.getUsuToken());
        fields += " USU_MONTO_AUTORIZADO = ?, ";
        values.add(this.getUsuMontoAutorizado());
        fields += " USU_PERFIL_INTERNO = ?, ";
        values.add(this.getUsuPerfilInterno());
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
        String sql = "INSERT INTO USUARIOSH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", USU_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuNumUsuario());

        fields += ", USU_NOM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuNomUsuario());

        fields += ", USU_TIPO_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuTipoUsuario());

        fields += ", USU_NUM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getUsuNumPuesto());

        fields += ", USU_NOM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getUsuNomPuesto());

        fields += ", USU_PASSWORD";
        fieldValues += ", ?";
        values.add(this.getUsuPassword());

        fields += ", USU_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getUsuAnoAltaReg());

        fields += ", USU_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getUsuMesAltaReg());

        fields += ", USU_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getUsuDiaAltaReg());

        fields += ", USU_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getUsuAnoUltMod());

        fields += ", USU_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getUsuMesUltMod());

        fields += ", USU_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getUsuDiaUltMod());

        fields += ", USU_CVE_ST_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuCveStUsuario());

        fields += ", USU_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getUsuNumNivel1());

        fields += ", USU_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getUsuNumNivel2());

        fields += ", USU_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getUsuNumNivel3());

        fields += ", USU_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getUsuNumNivel4());

        fields += ", USU_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getUsuNumNivel5());

        fields += ", USU_CENTRO_LOGRO";
        fieldValues += ", ?";
        values.add(this.getUsuCentroLogro());

        fields += ", USU_CENTRO_COSTO";
        fieldValues += ", ?";
        values.add(this.getUsuCentroCosto());

        fields += ", USU_PTCE_GPOT";
        fieldValues += ", ?";
        values.add(this.getUsuPtceGpot());

        fields += ", USU_FECHA_ULT_ACCESO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getUsuFechaUltAcceso());

        fields += ", USU_FECHA_PASSWORD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getUsuFechaPassword());

        fields += ", USU_ESTATUS_SEGURIDAD";
        fieldValues += ", ?";
        values.add(this.getUsuEstatusSeguridad());

        fields += ", USU_TOKEN";
        fieldValues += ", ?";
        values.add(this.getUsuToken());

        fields += ", USU_MONTO_AUTORIZADO";
        fieldValues += ", ?";
        values.add(this.getUsuMontoAutorizado());

        fields += ", USU_PERFIL_INTERNO";
        fieldValues += ", ?";
        values.add(this.getUsuPerfilInterno());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM USUARIOSH WHERE ";

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
        Usuariosh instance = (Usuariosh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getUsuNumUsuario().equals(instance.getUsuNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNomUsuario().equals(instance.getUsuNomUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getUsuTipoUsuario().equals(instance.getUsuTipoUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumPuesto().equals(instance.getUsuNumPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNomPuesto().equals(instance.getUsuNomPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getUsuPassword().equals(instance.getUsuPassword()))
            equalObjects = false;
        if (equalObjects && !this.getUsuAnoAltaReg().equals(instance.getUsuAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getUsuMesAltaReg().equals(instance.getUsuMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getUsuDiaAltaReg().equals(instance.getUsuDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getUsuAnoUltMod().equals(instance.getUsuAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getUsuMesUltMod().equals(instance.getUsuMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getUsuDiaUltMod().equals(instance.getUsuDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getUsuCveStUsuario().equals(instance.getUsuCveStUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumNivel1().equals(instance.getUsuNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumNivel2().equals(instance.getUsuNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumNivel3().equals(instance.getUsuNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumNivel4().equals(instance.getUsuNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumNivel5().equals(instance.getUsuNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getUsuCentroLogro().equals(instance.getUsuCentroLogro()))
            equalObjects = false;
        if (equalObjects && !this.getUsuCentroCosto().equals(instance.getUsuCentroCosto()))
            equalObjects = false;
        if (equalObjects && !this.getUsuPtceGpot().equals(instance.getUsuPtceGpot()))
            equalObjects = false;
        if (equalObjects && !this.getUsuFechaUltAcceso().equals(instance.getUsuFechaUltAcceso()))
            equalObjects = false;
        if (equalObjects && !this.getUsuFechaPassword().equals(instance.getUsuFechaPassword()))
            equalObjects = false;
        if (equalObjects && !this.getUsuEstatusSeguridad().equals(instance.getUsuEstatusSeguridad()))
            equalObjects = false;
        if (equalObjects && !this.getUsuToken().equals(instance.getUsuToken()))
            equalObjects = false;
        if (equalObjects && !this.getUsuMontoAutorizado().equals(instance.getUsuMontoAutorizado()))
            equalObjects = false;
        if (equalObjects && !this.getUsuPerfilInterno().equals(instance.getUsuPerfilInterno()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Usuariosh result = new Usuariosh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setUsuNumUsuario((BigDecimal) objectData.getData("USU_NUM_USUARIO"));
        result.setUsuNomUsuario((String) objectData.getData("USU_NOM_USUARIO"));
        result.setUsuTipoUsuario((String) objectData.getData("USU_TIPO_USUARIO"));
        result.setUsuNumPuesto((BigDecimal) objectData.getData("USU_NUM_PUESTO"));
        result.setUsuNomPuesto((String) objectData.getData("USU_NOM_PUESTO"));
        result.setUsuPassword((String) objectData.getData("USU_PASSWORD"));
        result.setUsuAnoAltaReg((BigDecimal) objectData.getData("USU_ANO_ALTA_REG"));
        result.setUsuMesAltaReg((BigDecimal) objectData.getData("USU_MES_ALTA_REG"));
        result.setUsuDiaAltaReg((BigDecimal) objectData.getData("USU_DIA_ALTA_REG"));
        result.setUsuAnoUltMod((BigDecimal) objectData.getData("USU_ANO_ULT_MOD"));
        result.setUsuMesUltMod((BigDecimal) objectData.getData("USU_MES_ULT_MOD"));
        result.setUsuDiaUltMod((BigDecimal) objectData.getData("USU_DIA_ULT_MOD"));
        result.setUsuCveStUsuario((String) objectData.getData("USU_CVE_ST_USUARIO"));
        result.setUsuNumNivel1((BigDecimal) objectData.getData("USU_NUM_NIVEL1"));
        result.setUsuNumNivel2((BigDecimal) objectData.getData("USU_NUM_NIVEL2"));
        result.setUsuNumNivel3((BigDecimal) objectData.getData("USU_NUM_NIVEL3"));
        result.setUsuNumNivel4((BigDecimal) objectData.getData("USU_NUM_NIVEL4"));
        result.setUsuNumNivel5((BigDecimal) objectData.getData("USU_NUM_NIVEL5"));
        result.setUsuCentroLogro((BigDecimal) objectData.getData("USU_CENTRO_LOGRO"));
        result.setUsuCentroCosto((BigDecimal) objectData.getData("USU_CENTRO_COSTO"));
        result.setUsuPtceGpot((BigDecimal) objectData.getData("USU_PTCE_GPOT"));
        result.setUsuFechaUltAcceso((String) objectData.getData("USU_FECHA_ULT_ACCESO"));
        result.setUsuFechaPassword((String) objectData.getData("USU_FECHA_PASSWORD"));
        result.setUsuEstatusSeguridad((BigDecimal) objectData.getData("USU_ESTATUS_SEGURIDAD"));
        result.setUsuToken((BigDecimal) objectData.getData("USU_TOKEN"));
        result.setUsuMontoAutorizado((BigDecimal) objectData.getData("USU_MONTO_AUTORIZADO"));
        result.setUsuPerfilInterno((String) objectData.getData("USU_PERFIL_INTERNO"));

        return result;

    }

}
