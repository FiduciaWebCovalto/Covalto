package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ACUERDO_PK", columns = { "ACU_NO_SESION", "ACU_CLAVE" }, sequences = { "MANUAL" })
public class Acuerdo extends DomainObject {

    BigDecimal acuNoSesion = null;
    String acuClave = null;
    BigDecimal acuNumUsuario = null;
    BigDecimal acuSesNoSesion = null;
    BigDecimal acuIdentificador = null;
    String acuDesCorta = null;
    Long acuDesDetallada = null;
    String acuResolucion = null;
    BigDecimal acuAnoAcuerdo = null;
    BigDecimal acuMesAcuerdo = null;
    BigDecimal acuDiaAcuerdo = null;
    BigDecimal acuAnoAltaReg = null;
    BigDecimal acuMesAltaReg = null;
    BigDecimal acuDiaAltaReg = null;
    BigDecimal acuAnoUltMod = null;
    BigDecimal acuMesUltMod = null;
    BigDecimal acuDiaUltMod = null;

    public Acuerdo() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcuNoSesion(BigDecimal acuNoSesion) {
        this.acuNoSesion = acuNoSesion;
    }

    public BigDecimal getAcuNoSesion() {
        return this.acuNoSesion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuClave(String acuClave) {
        this.acuClave = acuClave;
    }

    public String getAcuClave() {
        return this.acuClave;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcuNumUsuario(BigDecimal acuNumUsuario) {
        this.acuNumUsuario = acuNumUsuario;
    }

    public BigDecimal getAcuNumUsuario() {
        return this.acuNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcuSesNoSesion(BigDecimal acuSesNoSesion) {
        this.acuSesNoSesion = acuSesNoSesion;
    }

    public BigDecimal getAcuSesNoSesion() {
        return this.acuSesNoSesion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuIdentificador(BigDecimal acuIdentificador) {
        this.acuIdentificador = acuIdentificador;
    }

    public BigDecimal getAcuIdentificador() {
        return this.acuIdentificador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuDesCorta(String acuDesCorta) {
        this.acuDesCorta = acuDesCorta;
    }

    public String getAcuDesCorta() {
        return this.acuDesCorta;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setAcuDesDetallada(Long acuDesDetallada) {
        this.acuDesDetallada = acuDesDetallada;
    }

    public Long getAcuDesDetallada() {
        return this.acuDesDetallada;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuResolucion(String acuResolucion) {
        this.acuResolucion = acuResolucion;
    }

    public String getAcuResolucion() {
        return this.acuResolucion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAcuAnoAcuerdo(BigDecimal acuAnoAcuerdo) {
        this.acuAnoAcuerdo = acuAnoAcuerdo;
    }

    public BigDecimal getAcuAnoAcuerdo() {
        return this.acuAnoAcuerdo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuMesAcuerdo(BigDecimal acuMesAcuerdo) {
        this.acuMesAcuerdo = acuMesAcuerdo;
    }

    public BigDecimal getAcuMesAcuerdo() {
        return this.acuMesAcuerdo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuDiaAcuerdo(BigDecimal acuDiaAcuerdo) {
        this.acuDiaAcuerdo = acuDiaAcuerdo;
    }

    public BigDecimal getAcuDiaAcuerdo() {
        return this.acuDiaAcuerdo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAcuAnoAltaReg(BigDecimal acuAnoAltaReg) {
        this.acuAnoAltaReg = acuAnoAltaReg;
    }

    public BigDecimal getAcuAnoAltaReg() {
        return this.acuAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuMesAltaReg(BigDecimal acuMesAltaReg) {
        this.acuMesAltaReg = acuMesAltaReg;
    }

    public BigDecimal getAcuMesAltaReg() {
        return this.acuMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuDiaAltaReg(BigDecimal acuDiaAltaReg) {
        this.acuDiaAltaReg = acuDiaAltaReg;
    }

    public BigDecimal getAcuDiaAltaReg() {
        return this.acuDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAcuAnoUltMod(BigDecimal acuAnoUltMod) {
        this.acuAnoUltMod = acuAnoUltMod;
    }

    public BigDecimal getAcuAnoUltMod() {
        return this.acuAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuMesUltMod(BigDecimal acuMesUltMod) {
        this.acuMesUltMod = acuMesUltMod;
    }

    public BigDecimal getAcuMesUltMod() {
        return this.acuMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAcuDiaUltMod(BigDecimal acuDiaUltMod) {
        this.acuDiaUltMod = acuDiaUltMod;
    }

    public BigDecimal getAcuDiaUltMod() {
        return this.acuDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ACUERDO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAcuNoSesion() != null && this.getAcuNoSesion().longValue() == -999) {
            conditions += " AND ACU_NO_SESION IS NULL";
        } else if (this.getAcuNoSesion() != null) {
            conditions += " AND ACU_NO_SESION = ?";
            values.add(this.getAcuNoSesion());
        }

        if (this.getAcuClave() != null && "null".equals(this.getAcuClave())) {
            conditions += " AND ACU_CLAVE IS NULL";
        } else if (this.getAcuClave() != null) {
            conditions += " AND ACU_CLAVE = ?";
            values.add(this.getAcuClave());
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
        String sql = "SELECT * FROM ACUERDO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAcuNoSesion() != null && this.getAcuNoSesion().longValue() == -999) {
            conditions += " AND ACU_NO_SESION IS NULL";
        } else if (this.getAcuNoSesion() != null) {
            conditions += " AND ACU_NO_SESION = ?";
            values.add(this.getAcuNoSesion());
        }

        if (this.getAcuClave() != null && "null".equals(this.getAcuClave())) {
            conditions += " AND ACU_CLAVE IS NULL";
        } else if (this.getAcuClave() != null) {
            conditions += " AND ACU_CLAVE = ?";
            values.add(this.getAcuClave());
        }

        if (this.getAcuNumUsuario() != null && this.getAcuNumUsuario().longValue() == -999) {
            conditions += " AND ACU_NUM_USUARIO IS NULL";
        } else if (this.getAcuNumUsuario() != null) {
            conditions += " AND ACU_NUM_USUARIO = ?";
            values.add(this.getAcuNumUsuario());
        }

        if (this.getAcuSesNoSesion() != null && this.getAcuSesNoSesion().longValue() == -999) {
            conditions += " AND ACU_SES_NO_SESION IS NULL";
        } else if (this.getAcuSesNoSesion() != null) {
            conditions += " AND ACU_SES_NO_SESION = ?";
            values.add(this.getAcuSesNoSesion());
        }

        if (this.getAcuIdentificador() != null && this.getAcuIdentificador().longValue() == -999) {
            conditions += " AND ACU_IDENTIFICADOR IS NULL";
        } else if (this.getAcuIdentificador() != null) {
            conditions += " AND ACU_IDENTIFICADOR = ?";
            values.add(this.getAcuIdentificador());
        }

        if (this.getAcuDesCorta() != null && "null".equals(this.getAcuDesCorta())) {
            conditions += " AND ACU_DES_CORTA IS NULL";
        } else if (this.getAcuDesCorta() != null) {
            conditions += " AND ACU_DES_CORTA = ?";
            values.add(this.getAcuDesCorta());
        }

        if (this.getAcuDesDetallada() != null && this.getAcuDesDetallada() == -999) {
            conditions += " AND ACU_DES_DETALLADA IS NULL";
        } else if (this.getAcuDesDetallada() != null) {
            conditions += " AND ACU_DES_DETALLADA = ?";
            values.add(this.getAcuDesDetallada());
        }

        if (this.getAcuResolucion() != null && "null".equals(this.getAcuResolucion())) {
            conditions += " AND ACU_RESOLUCION IS NULL";
        } else if (this.getAcuResolucion() != null) {
            conditions += " AND ACU_RESOLUCION = ?";
            values.add(this.getAcuResolucion());
        }

        if (this.getAcuAnoAcuerdo() != null && this.getAcuAnoAcuerdo().longValue() == -999) {
            conditions += " AND ACU_ANO_ACUERDO IS NULL";
        } else if (this.getAcuAnoAcuerdo() != null) {
            conditions += " AND ACU_ANO_ACUERDO = ?";
            values.add(this.getAcuAnoAcuerdo());
        }

        if (this.getAcuMesAcuerdo() != null && this.getAcuMesAcuerdo().longValue() == -999) {
            conditions += " AND ACU_MES_ACUERDO IS NULL";
        } else if (this.getAcuMesAcuerdo() != null) {
            conditions += " AND ACU_MES_ACUERDO = ?";
            values.add(this.getAcuMesAcuerdo());
        }

        if (this.getAcuDiaAcuerdo() != null && this.getAcuDiaAcuerdo().longValue() == -999) {
            conditions += " AND ACU_DIA_ACUERDO IS NULL";
        } else if (this.getAcuDiaAcuerdo() != null) {
            conditions += " AND ACU_DIA_ACUERDO = ?";
            values.add(this.getAcuDiaAcuerdo());
        }

        if (this.getAcuAnoAltaReg() != null && this.getAcuAnoAltaReg().longValue() == -999) {
            conditions += " AND ACU_ANO_ALTA_REG IS NULL";
        } else if (this.getAcuAnoAltaReg() != null) {
            conditions += " AND ACU_ANO_ALTA_REG = ?";
            values.add(this.getAcuAnoAltaReg());
        }

        if (this.getAcuMesAltaReg() != null && this.getAcuMesAltaReg().longValue() == -999) {
            conditions += " AND ACU_MES_ALTA_REG IS NULL";
        } else if (this.getAcuMesAltaReg() != null) {
            conditions += " AND ACU_MES_ALTA_REG = ?";
            values.add(this.getAcuMesAltaReg());
        }

        if (this.getAcuDiaAltaReg() != null && this.getAcuDiaAltaReg().longValue() == -999) {
            conditions += " AND ACU_DIA_ALTA_REG IS NULL";
        } else if (this.getAcuDiaAltaReg() != null) {
            conditions += " AND ACU_DIA_ALTA_REG = ?";
            values.add(this.getAcuDiaAltaReg());
        }

        if (this.getAcuAnoUltMod() != null && this.getAcuAnoUltMod().longValue() == -999) {
            conditions += " AND ACU_ANO_ULT_MOD IS NULL";
        } else if (this.getAcuAnoUltMod() != null) {
            conditions += " AND ACU_ANO_ULT_MOD = ?";
            values.add(this.getAcuAnoUltMod());
        }

        if (this.getAcuMesUltMod() != null && this.getAcuMesUltMod().longValue() == -999) {
            conditions += " AND ACU_MES_ULT_MOD IS NULL";
        } else if (this.getAcuMesUltMod() != null) {
            conditions += " AND ACU_MES_ULT_MOD = ?";
            values.add(this.getAcuMesUltMod());
        }

        if (this.getAcuDiaUltMod() != null && this.getAcuDiaUltMod().longValue() == -999) {
            conditions += " AND ACU_DIA_ULT_MOD IS NULL";
        } else if (this.getAcuDiaUltMod() != null) {
            conditions += " AND ACU_DIA_ULT_MOD = ?";
            values.add(this.getAcuDiaUltMod());
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
        String sql = "UPDATE ACUERDO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ACU_NO_SESION = ?";
        pkValues.add(this.getAcuNoSesion());
        conditions += " AND ACU_CLAVE = ?";
        pkValues.add(this.getAcuClave());
        fields += " ACU_NUM_USUARIO = ?, ";
        values.add(this.getAcuNumUsuario());
        fields += " ACU_SES_NO_SESION = ?, ";
        values.add(this.getAcuSesNoSesion());
        fields += " ACU_IDENTIFICADOR = ?, ";
        values.add(this.getAcuIdentificador());
        fields += " ACU_DES_CORTA = ?, ";
        values.add(this.getAcuDesCorta());
        fields += " ACU_DES_DETALLADA = ?, ";
        values.add(this.getAcuDesDetallada());
        fields += " ACU_RESOLUCION = ?, ";
        values.add(this.getAcuResolucion());
        fields += " ACU_ANO_ACUERDO = ?, ";
        values.add(this.getAcuAnoAcuerdo());
        fields += " ACU_MES_ACUERDO = ?, ";
        values.add(this.getAcuMesAcuerdo());
        fields += " ACU_DIA_ACUERDO = ?, ";
        values.add(this.getAcuDiaAcuerdo());
        fields += " ACU_ANO_ALTA_REG = ?, ";
        values.add(this.getAcuAnoAltaReg());
        fields += " ACU_MES_ALTA_REG = ?, ";
        values.add(this.getAcuMesAltaReg());
        fields += " ACU_DIA_ALTA_REG = ?, ";
        values.add(this.getAcuDiaAltaReg());
        fields += " ACU_ANO_ULT_MOD = ?, ";
        values.add(this.getAcuAnoUltMod());
        fields += " ACU_MES_ULT_MOD = ?, ";
        values.add(this.getAcuMesUltMod());
        fields += " ACU_DIA_ULT_MOD = ?, ";
        values.add(this.getAcuDiaUltMod());
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
        String sql = "INSERT INTO ACUERDO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ACU_NO_SESION";
        fieldValues += ", ?";
        values.add(this.getAcuNoSesion());

        fields += ", ACU_CLAVE";
        fieldValues += ", ?";
        values.add(this.getAcuClave());

        fields += ", ACU_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getAcuNumUsuario());

        fields += ", ACU_SES_NO_SESION";
        fieldValues += ", ?";
        values.add(this.getAcuSesNoSesion());

        fields += ", ACU_IDENTIFICADOR";
        fieldValues += ", ?";
        values.add(this.getAcuIdentificador());

        fields += ", ACU_DES_CORTA";
        fieldValues += ", ?";
        values.add(this.getAcuDesCorta());

        fields += ", ACU_DES_DETALLADA";
        fieldValues += ", ?";
        values.add(this.getAcuDesDetallada());

        fields += ", ACU_RESOLUCION";
        fieldValues += ", ?";
        values.add(this.getAcuResolucion());

        fields += ", ACU_ANO_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getAcuAnoAcuerdo());

        fields += ", ACU_MES_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getAcuMesAcuerdo());

        fields += ", ACU_DIA_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getAcuDiaAcuerdo());

        fields += ", ACU_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAcuAnoAltaReg());

        fields += ", ACU_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAcuMesAltaReg());

        fields += ", ACU_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAcuDiaAltaReg());

        fields += ", ACU_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAcuAnoUltMod());

        fields += ", ACU_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAcuMesUltMod());

        fields += ", ACU_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAcuDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ACUERDO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ACU_NO_SESION = ?";
        values.add(this.getAcuNoSesion());
        conditions += " AND ACU_CLAVE = ?";
        values.add(this.getAcuClave());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Acuerdo instance = (Acuerdo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAcuNoSesion().equals(instance.getAcuNoSesion()))
            equalObjects = false;
        if (equalObjects && !this.getAcuClave().equals(instance.getAcuClave()))
            equalObjects = false;
        if (equalObjects && !this.getAcuNumUsuario().equals(instance.getAcuNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getAcuSesNoSesion().equals(instance.getAcuSesNoSesion()))
            equalObjects = false;
        if (equalObjects && !this.getAcuIdentificador().equals(instance.getAcuIdentificador()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDesCorta().equals(instance.getAcuDesCorta()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDesDetallada().equals(instance.getAcuDesDetallada()))
            equalObjects = false;
        if (equalObjects && !this.getAcuResolucion().equals(instance.getAcuResolucion()))
            equalObjects = false;
        if (equalObjects && !this.getAcuAnoAcuerdo().equals(instance.getAcuAnoAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMesAcuerdo().equals(instance.getAcuMesAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDiaAcuerdo().equals(instance.getAcuDiaAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getAcuAnoAltaReg().equals(instance.getAcuAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMesAltaReg().equals(instance.getAcuMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDiaAltaReg().equals(instance.getAcuDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAcuAnoUltMod().equals(instance.getAcuAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMesUltMod().equals(instance.getAcuMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDiaUltMod().equals(instance.getAcuDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Acuerdo result = new Acuerdo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAcuNoSesion((BigDecimal) objectData.getData("ACU_NO_SESION"));
        result.setAcuClave((String) objectData.getData("ACU_CLAVE"));
        result.setAcuNumUsuario((BigDecimal) objectData.getData("ACU_NUM_USUARIO"));
        result.setAcuSesNoSesion((BigDecimal) objectData.getData("ACU_SES_NO_SESION"));
        result.setAcuIdentificador((BigDecimal) objectData.getData("ACU_IDENTIFICADOR"));
        result.setAcuDesCorta((String) objectData.getData("ACU_DES_CORTA"));
        result.setAcuDesDetallada((Long) objectData.getData("ACU_DES_DETALLADA"));
        result.setAcuResolucion((String) objectData.getData("ACU_RESOLUCION"));
        result.setAcuAnoAcuerdo((BigDecimal) objectData.getData("ACU_ANO_ACUERDO"));
        result.setAcuMesAcuerdo((BigDecimal) objectData.getData("ACU_MES_ACUERDO"));
        result.setAcuDiaAcuerdo((BigDecimal) objectData.getData("ACU_DIA_ACUERDO"));
        result.setAcuAnoAltaReg((BigDecimal) objectData.getData("ACU_ANO_ALTA_REG"));
        result.setAcuMesAltaReg((BigDecimal) objectData.getData("ACU_MES_ALTA_REG"));
        result.setAcuDiaAltaReg((BigDecimal) objectData.getData("ACU_DIA_ALTA_REG"));
        result.setAcuAnoUltMod((BigDecimal) objectData.getData("ACU_ANO_ULT_MOD"));
        result.setAcuMesUltMod((BigDecimal) objectData.getData("ACU_MES_ULT_MOD"));
        result.setAcuDiaUltMod((BigDecimal) objectData.getData("ACU_DIA_ULT_MOD"));

        return result;

    }

}
