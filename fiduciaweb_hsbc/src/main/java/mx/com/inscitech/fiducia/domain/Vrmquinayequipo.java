package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "VRMQUINAYEQUIPO_PK", columns = { "VRM_OT", "VRM_FEC_AVALUO" }, sequences = { "MANUAL" })
public class Vrmquinayequipo extends DomainObject {

    String vrmOt = null;
    String vrmFecAvaluo = null;
    String vrmSolicitante = null;
    String vrmUbicacion = null;
    String vrmCalle = null;
    String vrmColonia = null;
    String vrmPoblacion = null;
    String vrmEstado = null;
    String vrmTipoAvaluo = null;
    String vrmDescripcion = null;
    BigDecimal vrmReposiciNuevo = null;
    BigDecimal vrmNetoReposicio = null;
    BigDecimal vrmDemeritoAnual = null;
    String vrmObservaciones = null;
    BigDecimal vrmAnoAltaReg = null;
    BigDecimal vrmMesAltaReg = null;
    BigDecimal vrmDiaAltaReg = null;
    BigDecimal vrmAnoUltMod = null;
    BigDecimal vrmMesUltMod = null;
    BigDecimal vrmDiaUltMod = null;
    String vrmCveStVrmaqui = null;

    public Vrmquinayequipo() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmOt(String vrmOt) {
        this.vrmOt = vrmOt;
    }

    public String getVrmOt() {
        return this.vrmOt;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmFecAvaluo(String vrmFecAvaluo) {
        this.vrmFecAvaluo = vrmFecAvaluo;
    }

    public String getVrmFecAvaluo() {
        return this.vrmFecAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmSolicitante(String vrmSolicitante) {
        this.vrmSolicitante = vrmSolicitante;
    }

    public String getVrmSolicitante() {
        return this.vrmSolicitante;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmUbicacion(String vrmUbicacion) {
        this.vrmUbicacion = vrmUbicacion;
    }

    public String getVrmUbicacion() {
        return this.vrmUbicacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmCalle(String vrmCalle) {
        this.vrmCalle = vrmCalle;
    }

    public String getVrmCalle() {
        return this.vrmCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmColonia(String vrmColonia) {
        this.vrmColonia = vrmColonia;
    }

    public String getVrmColonia() {
        return this.vrmColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmPoblacion(String vrmPoblacion) {
        this.vrmPoblacion = vrmPoblacion;
    }

    public String getVrmPoblacion() {
        return this.vrmPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmEstado(String vrmEstado) {
        this.vrmEstado = vrmEstado;
    }

    public String getVrmEstado() {
        return this.vrmEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmTipoAvaluo(String vrmTipoAvaluo) {
        this.vrmTipoAvaluo = vrmTipoAvaluo;
    }

    public String getVrmTipoAvaluo() {
        return this.vrmTipoAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmDescripcion(String vrmDescripcion) {
        this.vrmDescripcion = vrmDescripcion;
    }

    public String getVrmDescripcion() {
        return this.vrmDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVrmReposiciNuevo(BigDecimal vrmReposiciNuevo) {
        this.vrmReposiciNuevo = vrmReposiciNuevo;
    }

    public BigDecimal getVrmReposiciNuevo() {
        return this.vrmReposiciNuevo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVrmNetoReposicio(BigDecimal vrmNetoReposicio) {
        this.vrmNetoReposicio = vrmNetoReposicio;
    }

    public BigDecimal getVrmNetoReposicio() {
        return this.vrmNetoReposicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVrmDemeritoAnual(BigDecimal vrmDemeritoAnual) {
        this.vrmDemeritoAnual = vrmDemeritoAnual;
    }

    public BigDecimal getVrmDemeritoAnual() {
        return this.vrmDemeritoAnual;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmObservaciones(String vrmObservaciones) {
        this.vrmObservaciones = vrmObservaciones;
    }

    public String getVrmObservaciones() {
        return this.vrmObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVrmAnoAltaReg(BigDecimal vrmAnoAltaReg) {
        this.vrmAnoAltaReg = vrmAnoAltaReg;
    }

    public BigDecimal getVrmAnoAltaReg() {
        return this.vrmAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVrmMesAltaReg(BigDecimal vrmMesAltaReg) {
        this.vrmMesAltaReg = vrmMesAltaReg;
    }

    public BigDecimal getVrmMesAltaReg() {
        return this.vrmMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVrmDiaAltaReg(BigDecimal vrmDiaAltaReg) {
        this.vrmDiaAltaReg = vrmDiaAltaReg;
    }

    public BigDecimal getVrmDiaAltaReg() {
        return this.vrmDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVrmAnoUltMod(BigDecimal vrmAnoUltMod) {
        this.vrmAnoUltMod = vrmAnoUltMod;
    }

    public BigDecimal getVrmAnoUltMod() {
        return this.vrmAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVrmMesUltMod(BigDecimal vrmMesUltMod) {
        this.vrmMesUltMod = vrmMesUltMod;
    }

    public BigDecimal getVrmMesUltMod() {
        return this.vrmMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVrmDiaUltMod(BigDecimal vrmDiaUltMod) {
        this.vrmDiaUltMod = vrmDiaUltMod;
    }

    public BigDecimal getVrmDiaUltMod() {
        return this.vrmDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmCveStVrmaqui(String vrmCveStVrmaqui) {
        this.vrmCveStVrmaqui = vrmCveStVrmaqui;
    }

    public String getVrmCveStVrmaqui() {
        return this.vrmCveStVrmaqui;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM VRMQUINAYEQUIPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVrmOt() != null && "null".equals(this.getVrmOt())) {
            conditions += " AND VRM_OT IS NULL";
        } else if (this.getVrmOt() != null) {
            conditions += " AND VRM_OT = ?";
            values.add(this.getVrmOt());
        }

        if (this.getVrmFecAvaluo() != null && "null".equals(this.getVrmFecAvaluo())) {
            conditions += " AND VRM_FEC_AVALUO IS NULL";
        } else if (this.getVrmFecAvaluo() != null) {
            conditions += " AND VRM_FEC_AVALUO = ?";
            values.add(this.getVrmFecAvaluo());
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
        String sql = "SELECT * FROM VRMQUINAYEQUIPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVrmOt() != null && "null".equals(this.getVrmOt())) {
            conditions += " AND VRM_OT IS NULL";
        } else if (this.getVrmOt() != null) {
            conditions += " AND VRM_OT = ?";
            values.add(this.getVrmOt());
        }

        if (this.getVrmFecAvaluo() != null && "null".equals(this.getVrmFecAvaluo())) {
            conditions += " AND VRM_FEC_AVALUO IS NULL";
        } else if (this.getVrmFecAvaluo() != null) {
            conditions += " AND VRM_FEC_AVALUO = ?";
            values.add(this.getVrmFecAvaluo());
        }

        if (this.getVrmSolicitante() != null && "null".equals(this.getVrmSolicitante())) {
            conditions += " AND VRM_SOLICITANTE IS NULL";
        } else if (this.getVrmSolicitante() != null) {
            conditions += " AND VRM_SOLICITANTE = ?";
            values.add(this.getVrmSolicitante());
        }

        if (this.getVrmUbicacion() != null && "null".equals(this.getVrmUbicacion())) {
            conditions += " AND VRM_UBICACION IS NULL";
        } else if (this.getVrmUbicacion() != null) {
            conditions += " AND VRM_UBICACION = ?";
            values.add(this.getVrmUbicacion());
        }

        if (this.getVrmCalle() != null && "null".equals(this.getVrmCalle())) {
            conditions += " AND VRM_CALLE IS NULL";
        } else if (this.getVrmCalle() != null) {
            conditions += " AND VRM_CALLE = ?";
            values.add(this.getVrmCalle());
        }

        if (this.getVrmColonia() != null && "null".equals(this.getVrmColonia())) {
            conditions += " AND VRM_COLONIA IS NULL";
        } else if (this.getVrmColonia() != null) {
            conditions += " AND VRM_COLONIA = ?";
            values.add(this.getVrmColonia());
        }

        if (this.getVrmPoblacion() != null && "null".equals(this.getVrmPoblacion())) {
            conditions += " AND VRM_POBLACION IS NULL";
        } else if (this.getVrmPoblacion() != null) {
            conditions += " AND VRM_POBLACION = ?";
            values.add(this.getVrmPoblacion());
        }

        if (this.getVrmEstado() != null && "null".equals(this.getVrmEstado())) {
            conditions += " AND VRM_ESTADO IS NULL";
        } else if (this.getVrmEstado() != null) {
            conditions += " AND VRM_ESTADO = ?";
            values.add(this.getVrmEstado());
        }

        if (this.getVrmTipoAvaluo() != null && "null".equals(this.getVrmTipoAvaluo())) {
            conditions += " AND VRM_TIPO_AVALUO IS NULL";
        } else if (this.getVrmTipoAvaluo() != null) {
            conditions += " AND VRM_TIPO_AVALUO = ?";
            values.add(this.getVrmTipoAvaluo());
        }

        if (this.getVrmDescripcion() != null && "null".equals(this.getVrmDescripcion())) {
            conditions += " AND VRM_DESCRIPCION IS NULL";
        } else if (this.getVrmDescripcion() != null) {
            conditions += " AND VRM_DESCRIPCION = ?";
            values.add(this.getVrmDescripcion());
        }

        if (this.getVrmReposiciNuevo() != null && this.getVrmReposiciNuevo().longValue() == -999) {
            conditions += " AND VRM_REPOSICI_NUEVO IS NULL";
        } else if (this.getVrmReposiciNuevo() != null) {
            conditions += " AND VRM_REPOSICI_NUEVO = ?";
            values.add(this.getVrmReposiciNuevo());
        }

        if (this.getVrmNetoReposicio() != null && this.getVrmNetoReposicio().longValue() == -999) {
            conditions += " AND VRM_NETO_REPOSICIO IS NULL";
        } else if (this.getVrmNetoReposicio() != null) {
            conditions += " AND VRM_NETO_REPOSICIO = ?";
            values.add(this.getVrmNetoReposicio());
        }

        if (this.getVrmDemeritoAnual() != null && this.getVrmDemeritoAnual().longValue() == -999) {
            conditions += " AND VRM_DEMERITO_ANUAL IS NULL";
        } else if (this.getVrmDemeritoAnual() != null) {
            conditions += " AND VRM_DEMERITO_ANUAL = ?";
            values.add(this.getVrmDemeritoAnual());
        }

        if (this.getVrmObservaciones() != null && "null".equals(this.getVrmObservaciones())) {
            conditions += " AND VRM_OBSERVACIONES IS NULL";
        } else if (this.getVrmObservaciones() != null) {
            conditions += " AND VRM_OBSERVACIONES = ?";
            values.add(this.getVrmObservaciones());
        }

        if (this.getVrmAnoAltaReg() != null && this.getVrmAnoAltaReg().longValue() == -999) {
            conditions += " AND VRM_ANO_ALTA_REG IS NULL";
        } else if (this.getVrmAnoAltaReg() != null) {
            conditions += " AND VRM_ANO_ALTA_REG = ?";
            values.add(this.getVrmAnoAltaReg());
        }

        if (this.getVrmMesAltaReg() != null && this.getVrmMesAltaReg().longValue() == -999) {
            conditions += " AND VRM_MES_ALTA_REG IS NULL";
        } else if (this.getVrmMesAltaReg() != null) {
            conditions += " AND VRM_MES_ALTA_REG = ?";
            values.add(this.getVrmMesAltaReg());
        }

        if (this.getVrmDiaAltaReg() != null && this.getVrmDiaAltaReg().longValue() == -999) {
            conditions += " AND VRM_DIA_ALTA_REG IS NULL";
        } else if (this.getVrmDiaAltaReg() != null) {
            conditions += " AND VRM_DIA_ALTA_REG = ?";
            values.add(this.getVrmDiaAltaReg());
        }

        if (this.getVrmAnoUltMod() != null && this.getVrmAnoUltMod().longValue() == -999) {
            conditions += " AND VRM_ANO_ULT_MOD IS NULL";
        } else if (this.getVrmAnoUltMod() != null) {
            conditions += " AND VRM_ANO_ULT_MOD = ?";
            values.add(this.getVrmAnoUltMod());
        }

        if (this.getVrmMesUltMod() != null && this.getVrmMesUltMod().longValue() == -999) {
            conditions += " AND VRM_MES_ULT_MOD IS NULL";
        } else if (this.getVrmMesUltMod() != null) {
            conditions += " AND VRM_MES_ULT_MOD = ?";
            values.add(this.getVrmMesUltMod());
        }

        if (this.getVrmDiaUltMod() != null && this.getVrmDiaUltMod().longValue() == -999) {
            conditions += " AND VRM_DIA_ULT_MOD IS NULL";
        } else if (this.getVrmDiaUltMod() != null) {
            conditions += " AND VRM_DIA_ULT_MOD = ?";
            values.add(this.getVrmDiaUltMod());
        }

        if (this.getVrmCveStVrmaqui() != null && "null".equals(this.getVrmCveStVrmaqui())) {
            conditions += " AND VRM_CVE_ST_VRMAQUI IS NULL";
        } else if (this.getVrmCveStVrmaqui() != null) {
            conditions += " AND VRM_CVE_ST_VRMAQUI = ?";
            values.add(this.getVrmCveStVrmaqui());
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
        String sql = "UPDATE VRMQUINAYEQUIPO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND VRM_OT = ?";
        pkValues.add(this.getVrmOt());
        conditions += " AND VRM_FEC_AVALUO = ?";
        pkValues.add(this.getVrmFecAvaluo());
        fields += " VRM_SOLICITANTE = ?, ";
        values.add(this.getVrmSolicitante());
        fields += " VRM_UBICACION = ?, ";
        values.add(this.getVrmUbicacion());
        fields += " VRM_CALLE = ?, ";
        values.add(this.getVrmCalle());
        fields += " VRM_COLONIA = ?, ";
        values.add(this.getVrmColonia());
        fields += " VRM_POBLACION = ?, ";
        values.add(this.getVrmPoblacion());
        fields += " VRM_ESTADO = ?, ";
        values.add(this.getVrmEstado());
        fields += " VRM_TIPO_AVALUO = ?, ";
        values.add(this.getVrmTipoAvaluo());
        fields += " VRM_DESCRIPCION = ?, ";
        values.add(this.getVrmDescripcion());
        fields += " VRM_REPOSICI_NUEVO = ?, ";
        values.add(this.getVrmReposiciNuevo());
        fields += " VRM_NETO_REPOSICIO = ?, ";
        values.add(this.getVrmNetoReposicio());
        fields += " VRM_DEMERITO_ANUAL = ?, ";
        values.add(this.getVrmDemeritoAnual());
        fields += " VRM_OBSERVACIONES = ?, ";
        values.add(this.getVrmObservaciones());
        fields += " VRM_ANO_ALTA_REG = ?, ";
        values.add(this.getVrmAnoAltaReg());
        fields += " VRM_MES_ALTA_REG = ?, ";
        values.add(this.getVrmMesAltaReg());
        fields += " VRM_DIA_ALTA_REG = ?, ";
        values.add(this.getVrmDiaAltaReg());
        fields += " VRM_ANO_ULT_MOD = ?, ";
        values.add(this.getVrmAnoUltMod());
        fields += " VRM_MES_ULT_MOD = ?, ";
        values.add(this.getVrmMesUltMod());
        fields += " VRM_DIA_ULT_MOD = ?, ";
        values.add(this.getVrmDiaUltMod());
        fields += " VRM_CVE_ST_VRMAQUI = ?, ";
        values.add(this.getVrmCveStVrmaqui());
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
        String sql = "INSERT INTO VRMQUINAYEQUIPO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", VRM_OT";
        fieldValues += ", ?";
        values.add(this.getVrmOt());

        fields += ", VRM_FEC_AVALUO";
        fieldValues += ", ?";
        values.add(this.getVrmFecAvaluo());

        fields += ", VRM_SOLICITANTE";
        fieldValues += ", ?";
        values.add(this.getVrmSolicitante());

        fields += ", VRM_UBICACION";
        fieldValues += ", ?";
        values.add(this.getVrmUbicacion());

        fields += ", VRM_CALLE";
        fieldValues += ", ?";
        values.add(this.getVrmCalle());

        fields += ", VRM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getVrmColonia());

        fields += ", VRM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getVrmPoblacion());

        fields += ", VRM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getVrmEstado());

        fields += ", VRM_TIPO_AVALUO";
        fieldValues += ", ?";
        values.add(this.getVrmTipoAvaluo());

        fields += ", VRM_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getVrmDescripcion());

        fields += ", VRM_REPOSICI_NUEVO";
        fieldValues += ", ?";
        values.add(this.getVrmReposiciNuevo());

        fields += ", VRM_NETO_REPOSICIO";
        fieldValues += ", ?";
        values.add(this.getVrmNetoReposicio());

        fields += ", VRM_DEMERITO_ANUAL";
        fieldValues += ", ?";
        values.add(this.getVrmDemeritoAnual());

        fields += ", VRM_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getVrmObservaciones());

        fields += ", VRM_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVrmAnoAltaReg());

        fields += ", VRM_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVrmMesAltaReg());

        fields += ", VRM_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVrmDiaAltaReg());

        fields += ", VRM_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVrmAnoUltMod());

        fields += ", VRM_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVrmMesUltMod());

        fields += ", VRM_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVrmDiaUltMod());

        fields += ", VRM_CVE_ST_VRMAQUI";
        fieldValues += ", ?";
        values.add(this.getVrmCveStVrmaqui());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM VRMQUINAYEQUIPO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND VRM_OT = ?";
        values.add(this.getVrmOt());
        conditions += " AND VRM_FEC_AVALUO = ?";
        values.add(this.getVrmFecAvaluo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Vrmquinayequipo instance = (Vrmquinayequipo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getVrmOt().equals(instance.getVrmOt()))
            equalObjects = false;
        if (equalObjects && !this.getVrmFecAvaluo().equals(instance.getVrmFecAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getVrmSolicitante().equals(instance.getVrmSolicitante()))
            equalObjects = false;
        if (equalObjects && !this.getVrmUbicacion().equals(instance.getVrmUbicacion()))
            equalObjects = false;
        if (equalObjects && !this.getVrmCalle().equals(instance.getVrmCalle()))
            equalObjects = false;
        if (equalObjects && !this.getVrmColonia().equals(instance.getVrmColonia()))
            equalObjects = false;
        if (equalObjects && !this.getVrmPoblacion().equals(instance.getVrmPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getVrmEstado().equals(instance.getVrmEstado()))
            equalObjects = false;
        if (equalObjects && !this.getVrmTipoAvaluo().equals(instance.getVrmTipoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getVrmDescripcion().equals(instance.getVrmDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getVrmReposiciNuevo().equals(instance.getVrmReposiciNuevo()))
            equalObjects = false;
        if (equalObjects && !this.getVrmNetoReposicio().equals(instance.getVrmNetoReposicio()))
            equalObjects = false;
        if (equalObjects && !this.getVrmDemeritoAnual().equals(instance.getVrmDemeritoAnual()))
            equalObjects = false;
        if (equalObjects && !this.getVrmObservaciones().equals(instance.getVrmObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getVrmAnoAltaReg().equals(instance.getVrmAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVrmMesAltaReg().equals(instance.getVrmMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVrmDiaAltaReg().equals(instance.getVrmDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVrmAnoUltMod().equals(instance.getVrmAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVrmMesUltMod().equals(instance.getVrmMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVrmDiaUltMod().equals(instance.getVrmDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVrmCveStVrmaqui().equals(instance.getVrmCveStVrmaqui()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Vrmquinayequipo result = new Vrmquinayequipo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setVrmOt((String) objectData.getData("VRM_OT"));
        result.setVrmFecAvaluo((String) objectData.getData("VRM_FEC_AVALUO"));
        result.setVrmSolicitante((String) objectData.getData("VRM_SOLICITANTE"));
        result.setVrmUbicacion((String) objectData.getData("VRM_UBICACION"));
        result.setVrmCalle((String) objectData.getData("VRM_CALLE"));
        result.setVrmColonia((String) objectData.getData("VRM_COLONIA"));
        result.setVrmPoblacion((String) objectData.getData("VRM_POBLACION"));
        result.setVrmEstado((String) objectData.getData("VRM_ESTADO"));
        result.setVrmTipoAvaluo((String) objectData.getData("VRM_TIPO_AVALUO"));
        result.setVrmDescripcion((String) objectData.getData("VRM_DESCRIPCION"));
        result.setVrmReposiciNuevo((BigDecimal) objectData.getData("VRM_REPOSICI_NUEVO"));
        result.setVrmNetoReposicio((BigDecimal) objectData.getData("VRM_NETO_REPOSICIO"));
        result.setVrmDemeritoAnual((BigDecimal) objectData.getData("VRM_DEMERITO_ANUAL"));
        result.setVrmObservaciones((String) objectData.getData("VRM_OBSERVACIONES"));
        result.setVrmAnoAltaReg((BigDecimal) objectData.getData("VRM_ANO_ALTA_REG"));
        result.setVrmMesAltaReg((BigDecimal) objectData.getData("VRM_MES_ALTA_REG"));
        result.setVrmDiaAltaReg((BigDecimal) objectData.getData("VRM_DIA_ALTA_REG"));
        result.setVrmAnoUltMod((BigDecimal) objectData.getData("VRM_ANO_ULT_MOD"));
        result.setVrmMesUltMod((BigDecimal) objectData.getData("VRM_MES_ULT_MOD"));
        result.setVrmDiaUltMod((BigDecimal) objectData.getData("VRM_DIA_ULT_MOD"));
        result.setVrmCveStVrmaqui((String) objectData.getData("VRM_CVE_ST_VRMAQUI"));

        return result;

    }

}
