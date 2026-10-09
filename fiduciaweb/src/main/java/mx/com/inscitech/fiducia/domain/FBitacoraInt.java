package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_BITACORA_PK", columns = { "BIT_FECHA", "USU_NUM_USUARIO", "BIT_FOLIO" }, sequences = { "MANUAL" })
public class FBitacoraInt extends DomainObject {

    String bitFecha = null;
    BigDecimal usuNumUsuario = null;
    BigDecimal bitFolio = null;
    String bitIp = null;
    BigDecimal ffunIdFuncion = null;
    String bitNumSerieCd = null;
    String bitNumSecuenciaCd = null;
    String bitDetalle = null;

    public FBitacoraInt() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setBitFecha(String bitFecha) {
        this.bitFecha = bitFecha;
    }

    public String getBitFecha() {
        return this.bitFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumUsuario(BigDecimal usuNumUsuario) {
        this.usuNumUsuario = usuNumUsuario;
    }

    public BigDecimal getUsuNumUsuario() {
        return this.usuNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBitFolio(BigDecimal bitFolio) {
        this.bitFolio = bitFolio;
    }

    public BigDecimal getBitFolio() {
        return this.bitFolio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitIp(String bitIp) {
        this.bitIp = bitIp;
    }

    public String getBitIp() {
        return this.bitIp;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfunIdFuncion(BigDecimal ffunIdFuncion) {
        this.ffunIdFuncion = ffunIdFuncion;
    }

    public BigDecimal getFfunIdFuncion() {
        return this.ffunIdFuncion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitNumSerieCd(String bitNumSerieCd) {
        this.bitNumSerieCd = bitNumSerieCd;
    }

    public String getBitNumSerieCd() {
        return this.bitNumSerieCd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitNumSecuenciaCd(String bitNumSecuenciaCd) {
        this.bitNumSecuenciaCd = bitNumSecuenciaCd;
    }

    public String getBitNumSecuenciaCd() {
        return this.bitNumSecuenciaCd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBitDetalle(String bitDetalle) {
        this.bitDetalle = bitDetalle;
    }

    public String getBitDetalle() {
        return this.bitDetalle;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_BITACORA_INT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBitFecha() != null && "null".equals(this.getBitFecha())) {
            conditions += " AND BIT_FECHA IS NULL";
        } else if (this.getBitFecha() != null) {
            conditions += " AND BIT_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getBitFecha());
        }

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getBitFolio() != null && this.getBitFolio().longValue() == -999) {
            conditions += " AND BIT_FOLIO IS NULL";
        } else if (this.getBitFolio() != null) {
            conditions += " AND BIT_FOLIO = ?";
            values.add(this.getBitFolio());
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
        String sql = "SELECT * FROM F_BITACORA_INT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBitFecha() != null && "null".equals(this.getBitFecha())) {
            conditions += " AND BIT_FECHA IS NULL";
        } else if (this.getBitFecha() != null) {
            conditions += " AND BIT_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getBitFecha());
        }

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getBitFolio() != null && this.getBitFolio().longValue() == -999) {
            conditions += " AND BIT_FOLIO IS NULL";
        } else if (this.getBitFolio() != null) {
            conditions += " AND BIT_FOLIO = ?";
            values.add(this.getBitFolio());
        }

        if (this.getBitIp() != null && "null".equals(this.getBitIp())) {
            conditions += " AND BIT_IP IS NULL";
        } else if (this.getBitIp() != null) {
            conditions += " AND BIT_IP = ?";
            values.add(this.getBitIp());
        }

        if (this.getFfunIdFuncion() != null && this.getFfunIdFuncion().longValue() == -999) {
            conditions += " AND FFUN_ID_FUNCION IS NULL";
        } else if (this.getFfunIdFuncion() != null) {
            conditions += " AND FFUN_ID_FUNCION = ?";
            values.add(this.getFfunIdFuncion());
        }

        if (this.getBitNumSerieCd() != null && "null".equals(this.getBitNumSerieCd())) {
            conditions += " AND BIT_NUM_SERIE_CD IS NULL";
        } else if (this.getBitNumSerieCd() != null) {
            conditions += " AND BIT_NUM_SERIE_CD = ?";
            values.add(this.getBitNumSerieCd());
        }

        if (this.getBitNumSecuenciaCd() != null && "null".equals(this.getBitNumSecuenciaCd())) {
            conditions += " AND BIT_NUM_SECUENCIA_CD IS NULL";
        } else if (this.getBitNumSecuenciaCd() != null) {
            conditions += " AND BIT_NUM_SECUENCIA_CD = ?";
            values.add(this.getBitNumSecuenciaCd());
        }

        if (this.getBitDetalle() != null && "null".equals(this.getBitDetalle())) {
            conditions += " AND BIT_DETALLE IS NULL";
        } else if (this.getBitDetalle() != null) {
            conditions += " AND BIT_DETALLE = ?";
            values.add(this.getBitDetalle());
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
        String sql = "UPDATE F_BITACORA_INT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND BIT_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getBitFecha());
        conditions += " AND USU_NUM_USUARIO = ?";
        pkValues.add(this.getUsuNumUsuario());
        conditions += " AND BIT_FOLIO = ?";
        pkValues.add(this.getBitFolio());
        fields += " BIT_IP = ?, ";
        values.add(this.getBitIp());
        fields += " FFUN_ID_FUNCION = ?, ";
        values.add(this.getFfunIdFuncion());
        fields += " BIT_NUM_SERIE_CD = ?, ";
        values.add(this.getBitNumSerieCd());
        fields += " BIT_NUM_SECUENCIA_CD = ?, ";
        values.add(this.getBitNumSecuenciaCd());
        fields += " BIT_DETALLE = ?, ";
        values.add(this.getBitDetalle());
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
        String sql = "INSERT INTO F_BITACORA_INT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", BIT_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getBitFecha());

        fields += ", USU_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuNumUsuario());

        fields += ", BIT_FOLIO";
        fieldValues += ", ?";
        values.add(this.getBitFolio());

        fields += ", BIT_IP";
        fieldValues += ", ?";
        values.add(this.getBitIp());

        fields += ", FFUN_ID_FUNCION";
        fieldValues += ", ?";
        values.add(this.getFfunIdFuncion());

        fields += ", BIT_NUM_SERIE_CD";
        fieldValues += ", ?";
        values.add(this.getBitNumSerieCd());

        fields += ", BIT_NUM_SECUENCIA_CD";
        fieldValues += ", ?";
        values.add(this.getBitNumSecuenciaCd());

        fields += ", BIT_DETALLE";
        fieldValues += ", ?";
        values.add(this.getBitDetalle());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_BITACORA_INT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND BIT_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getBitFecha());
        conditions += " AND USU_NUM_USUARIO = ?";
        values.add(this.getUsuNumUsuario());
        conditions += " AND BIT_FOLIO = ?";
        values.add(this.getBitFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FBitacoraInt instance = (FBitacoraInt) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getBitFecha().equals(instance.getBitFecha()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumUsuario().equals(instance.getUsuNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getBitFolio().equals(instance.getBitFolio()))
            equalObjects = false;
        if (equalObjects && !this.getBitIp().equals(instance.getBitIp()))
            equalObjects = false;
        if (equalObjects && !this.getFfunIdFuncion().equals(instance.getFfunIdFuncion()))
            equalObjects = false;
        if (equalObjects && !this.getBitNumSerieCd().equals(instance.getBitNumSerieCd()))
            equalObjects = false;
        if (equalObjects && !this.getBitNumSecuenciaCd().equals(instance.getBitNumSecuenciaCd()))
            equalObjects = false;
        if (equalObjects && !this.getBitDetalle().equals(instance.getBitDetalle()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FBitacoraInt result = new FBitacoraInt();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setBitFecha((String) objectData.getData("BIT_FECHA"));
        result.setUsuNumUsuario((BigDecimal) objectData.getData("USU_NUM_USUARIO"));
        result.setBitFolio((BigDecimal) objectData.getData("BIT_FOLIO"));
        result.setBitIp((String) objectData.getData("BIT_IP"));
        result.setFfunIdFuncion((BigDecimal) objectData.getData("FFUN_ID_FUNCION"));
        result.setBitNumSerieCd((String) objectData.getData("BIT_NUM_SERIE_CD"));
        result.setBitNumSecuenciaCd((String) objectData.getData("BIT_NUM_SECUENCIA_CD"));
        result.setBitDetalle((String) objectData.getData("BIT_DETALLE"));

        return result;

    }

}
