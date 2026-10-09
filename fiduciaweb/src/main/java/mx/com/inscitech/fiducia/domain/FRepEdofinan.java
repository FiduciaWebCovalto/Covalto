package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REP_EDOFINAN_PK", columns = { "FRCO_ID_REPORTE", "REF_USUARIO", "FACO_ID_AGRUPACION", "REF_NUM_FIDEICOMISO" }, sequences = { "MANUAL" })
public class FRepEdofinan extends DomainObject {

    BigDecimal frcoIdReporte = null;
    BigDecimal refUsuario = null;
    BigDecimal refNumFideicomiso = null;
    String refNomFideicomiso = null;
    BigDecimal facoIdAgrupacion = null;
    String refNombreReporte = null;
    String refPeriodoReporte = null;
    BigDecimal refValorDato = null;
    BigDecimal refEtiqueta = null;
    BigDecimal refNumColDato = null;
    BigDecimal refOrdenDato = null;
    String refValorEtiqueta = null;

    public FRepEdofinan() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrcoIdReporte(BigDecimal frcoIdReporte) {
        this.frcoIdReporte = frcoIdReporte;
    }

    public BigDecimal getFrcoIdReporte() {
        return this.frcoIdReporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRefUsuario(BigDecimal refUsuario) {
        this.refUsuario = refUsuario;
    }

    public BigDecimal getRefUsuario() {
        return this.refUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRefNumFideicomiso(BigDecimal refNumFideicomiso) {
        this.refNumFideicomiso = refNumFideicomiso;
    }

    public BigDecimal getRefNumFideicomiso() {
        return this.refNumFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRefNomFideicomiso(String refNomFideicomiso) {
        this.refNomFideicomiso = refNomFideicomiso;
    }

    public String getRefNomFideicomiso() {
        return this.refNomFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFacoIdAgrupacion(BigDecimal facoIdAgrupacion) {
        this.facoIdAgrupacion = facoIdAgrupacion;
    }

    public BigDecimal getFacoIdAgrupacion() {
        return this.facoIdAgrupacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRefNombreReporte(String refNombreReporte) {
        this.refNombreReporte = refNombreReporte;
    }

    public String getRefNombreReporte() {
        return this.refNombreReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRefPeriodoReporte(String refPeriodoReporte) {
        this.refPeriodoReporte = refPeriodoReporte;
    }

    public String getRefPeriodoReporte() {
        return this.refPeriodoReporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRefValorDato(BigDecimal refValorDato) {
        this.refValorDato = refValorDato;
    }

    public BigDecimal getRefValorDato() {
        return this.refValorDato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setRefEtiqueta(BigDecimal refEtiqueta) {
        this.refEtiqueta = refEtiqueta;
    }

    public BigDecimal getRefEtiqueta() {
        return this.refEtiqueta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setRefNumColDato(BigDecimal refNumColDato) {
        this.refNumColDato = refNumColDato;
    }

    public BigDecimal getRefNumColDato() {
        return this.refNumColDato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRefOrdenDato(BigDecimal refOrdenDato) {
        this.refOrdenDato = refOrdenDato;
    }

    public BigDecimal getRefOrdenDato() {
        return this.refOrdenDato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRefValorEtiqueta(String refValorEtiqueta) {
        this.refValorEtiqueta = refValorEtiqueta;
    }

    public String getRefValorEtiqueta() {
        return this.refValorEtiqueta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_EDOFINAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrcoIdReporte() != null && this.getFrcoIdReporte().longValue() == -999) {
            conditions += " AND FRCO_ID_REPORTE IS NULL";
        } else if (this.getFrcoIdReporte() != null) {
            conditions += " AND FRCO_ID_REPORTE = ?";
            values.add(this.getFrcoIdReporte());
        }

        if (this.getRefUsuario() != null && this.getRefUsuario().longValue() == -999) {
            conditions += " AND REF_USUARIO IS NULL";
        } else if (this.getRefUsuario() != null) {
            conditions += " AND REF_USUARIO = ?";
            values.add(this.getRefUsuario());
        }

        if (this.getRefNumFideicomiso() != null && this.getRefNumFideicomiso().longValue() == -999) {
            conditions += " AND REF_NUM_FIDEICOMISO IS NULL";
        } else if (this.getRefNumFideicomiso() != null) {
            conditions += " AND REF_NUM_FIDEICOMISO = ?";
            values.add(this.getRefNumFideicomiso());
        }

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
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
        String sql = "SELECT * FROM F_REP_EDOFINAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrcoIdReporte() != null && this.getFrcoIdReporte().longValue() == -999) {
            conditions += " AND FRCO_ID_REPORTE IS NULL";
        } else if (this.getFrcoIdReporte() != null) {
            conditions += " AND FRCO_ID_REPORTE = ?";
            values.add(this.getFrcoIdReporte());
        }

        if (this.getRefUsuario() != null && this.getRefUsuario().longValue() == -999) {
            conditions += " AND REF_USUARIO IS NULL";
        } else if (this.getRefUsuario() != null) {
            conditions += " AND REF_USUARIO = ?";
            values.add(this.getRefUsuario());
        }

        if (this.getRefNumFideicomiso() != null && this.getRefNumFideicomiso().longValue() == -999) {
            conditions += " AND REF_NUM_FIDEICOMISO IS NULL";
        } else if (this.getRefNumFideicomiso() != null) {
            conditions += " AND REF_NUM_FIDEICOMISO = ?";
            values.add(this.getRefNumFideicomiso());
        }

        if (this.getRefNomFideicomiso() != null && "null".equals(this.getRefNomFideicomiso())) {
            conditions += " AND REF_NOM_FIDEICOMISO IS NULL";
        } else if (this.getRefNomFideicomiso() != null) {
            conditions += " AND REF_NOM_FIDEICOMISO = ?";
            values.add(this.getRefNomFideicomiso());
        }

        if (this.getFacoIdAgrupacion() != null && this.getFacoIdAgrupacion().longValue() == -999) {
            conditions += " AND FACO_ID_AGRUPACION IS NULL";
        } else if (this.getFacoIdAgrupacion() != null) {
            conditions += " AND FACO_ID_AGRUPACION = ?";
            values.add(this.getFacoIdAgrupacion());
        }

        if (this.getRefNombreReporte() != null && "null".equals(this.getRefNombreReporte())) {
            conditions += " AND REF_NOMBRE_REPORTE IS NULL";
        } else if (this.getRefNombreReporte() != null) {
            conditions += " AND REF_NOMBRE_REPORTE = ?";
            values.add(this.getRefNombreReporte());
        }

        if (this.getRefPeriodoReporte() != null && "null".equals(this.getRefPeriodoReporte())) {
            conditions += " AND REF_PERIODO_REPORTE IS NULL";
        } else if (this.getRefPeriodoReporte() != null) {
            conditions += " AND REF_PERIODO_REPORTE = ?";
            values.add(this.getRefPeriodoReporte());
        }

        if (this.getRefValorDato() != null && this.getRefValorDato().longValue() == -999) {
            conditions += " AND REF_VALOR_DATO IS NULL";
        } else if (this.getRefValorDato() != null) {
            conditions += " AND REF_VALOR_DATO = ?";
            values.add(this.getRefValorDato());
        }

        if (this.getRefEtiqueta() != null && this.getRefEtiqueta().longValue() == -999) {
            conditions += " AND REF_ETIQUETA IS NULL";
        } else if (this.getRefEtiqueta() != null) {
            conditions += " AND REF_ETIQUETA = ?";
            values.add(this.getRefEtiqueta());
        }

        if (this.getRefNumColDato() != null && this.getRefNumColDato().longValue() == -999) {
            conditions += " AND REF_NUM_COL_DATO IS NULL";
        } else if (this.getRefNumColDato() != null) {
            conditions += " AND REF_NUM_COL_DATO = ?";
            values.add(this.getRefNumColDato());
        }

        if (this.getRefOrdenDato() != null && this.getRefOrdenDato().longValue() == -999) {
            conditions += " AND REF_ORDEN_DATO IS NULL";
        } else if (this.getRefOrdenDato() != null) {
            conditions += " AND REF_ORDEN_DATO = ?";
            values.add(this.getRefOrdenDato());
        }

        if (this.getRefValorEtiqueta() != null && "null".equals(this.getRefValorEtiqueta())) {
            conditions += " AND REF_VALOR_ETIQUETA IS NULL";
        } else if (this.getRefValorEtiqueta() != null) {
            conditions += " AND REF_VALOR_ETIQUETA = ?";
            values.add(this.getRefValorEtiqueta());
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
        String sql = "UPDATE F_REP_EDOFINAN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FRCO_ID_REPORTE = ?";
        pkValues.add(this.getFrcoIdReporte());
        conditions += " AND REF_USUARIO = ?";
        pkValues.add(this.getRefUsuario());
        conditions += " AND REF_NUM_FIDEICOMISO = ?";
        pkValues.add(this.getRefNumFideicomiso());
        fields += " REF_NOM_FIDEICOMISO = ?, ";
        values.add(this.getRefNomFideicomiso());
        conditions += " AND FACO_ID_AGRUPACION = ?";
        pkValues.add(this.getFacoIdAgrupacion());
        fields += " REF_NOMBRE_REPORTE = ?, ";
        values.add(this.getRefNombreReporte());
        fields += " REF_PERIODO_REPORTE = ?, ";
        values.add(this.getRefPeriodoReporte());
        fields += " REF_VALOR_DATO = ?, ";
        values.add(this.getRefValorDato());
        fields += " REF_ETIQUETA = ?, ";
        values.add(this.getRefEtiqueta());
        fields += " REF_NUM_COL_DATO = ?, ";
        values.add(this.getRefNumColDato());
        fields += " REF_ORDEN_DATO = ?, ";
        values.add(this.getRefOrdenDato());
        fields += " REF_VALOR_ETIQUETA = ?, ";
        values.add(this.getRefValorEtiqueta());
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
        String sql = "INSERT INTO F_REP_EDOFINAN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRCO_ID_REPORTE";
        fieldValues += ", ?";
        values.add(this.getFrcoIdReporte());

        fields += ", REF_USUARIO";
        fieldValues += ", ?";
        values.add(this.getRefUsuario());

        fields += ", REF_NUM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getRefNumFideicomiso());

        fields += ", REF_NOM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getRefNomFideicomiso());

        fields += ", FACO_ID_AGRUPACION";
        fieldValues += ", ?";
        values.add(this.getFacoIdAgrupacion());

        fields += ", REF_NOMBRE_REPORTE";
        fieldValues += ", ?";
        values.add(this.getRefNombreReporte());

        fields += ", REF_PERIODO_REPORTE";
        fieldValues += ", ?";
        values.add(this.getRefPeriodoReporte());

        fields += ", REF_VALOR_DATO";
        fieldValues += ", ?";
        values.add(this.getRefValorDato());

        fields += ", REF_ETIQUETA";
        fieldValues += ", ?";
        values.add(this.getRefEtiqueta());

        fields += ", REF_NUM_COL_DATO";
        fieldValues += ", ?";
        values.add(this.getRefNumColDato());

        fields += ", REF_ORDEN_DATO";
        fieldValues += ", ?";
        values.add(this.getRefOrdenDato());

        fields += ", REF_VALOR_ETIQUETA";
        fieldValues += ", ?";
        values.add(this.getRefValorEtiqueta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REP_EDOFINAN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FRCO_ID_REPORTE = ?";
        values.add(this.getFrcoIdReporte());
        conditions += " AND REF_USUARIO = ?";
        values.add(this.getRefUsuario());
        conditions += " AND REF_NUM_FIDEICOMISO = ?";
        values.add(this.getRefNumFideicomiso());
        conditions += " AND FACO_ID_AGRUPACION = ?";
        values.add(this.getFacoIdAgrupacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepEdofinan instance = (FRepEdofinan) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrcoIdReporte().equals(instance.getFrcoIdReporte()))
            equalObjects = false;
        if (equalObjects && !this.getRefUsuario().equals(instance.getRefUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getRefNumFideicomiso().equals(instance.getRefNumFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getRefNomFideicomiso().equals(instance.getRefNomFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFacoIdAgrupacion().equals(instance.getFacoIdAgrupacion()))
            equalObjects = false;
        if (equalObjects && !this.getRefNombreReporte().equals(instance.getRefNombreReporte()))
            equalObjects = false;
        if (equalObjects && !this.getRefPeriodoReporte().equals(instance.getRefPeriodoReporte()))
            equalObjects = false;
        if (equalObjects && !this.getRefValorDato().equals(instance.getRefValorDato()))
            equalObjects = false;
        if (equalObjects && !this.getRefEtiqueta().equals(instance.getRefEtiqueta()))
            equalObjects = false;
        if (equalObjects && !this.getRefNumColDato().equals(instance.getRefNumColDato()))
            equalObjects = false;
        if (equalObjects && !this.getRefOrdenDato().equals(instance.getRefOrdenDato()))
            equalObjects = false;
        if (equalObjects && !this.getRefValorEtiqueta().equals(instance.getRefValorEtiqueta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepEdofinan result = new FRepEdofinan();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFrcoIdReporte((BigDecimal) objectData.getData("FRCO_ID_REPORTE"));
        result.setRefUsuario((BigDecimal) objectData.getData("REF_USUARIO"));
        result.setRefNumFideicomiso((BigDecimal) objectData.getData("REF_NUM_FIDEICOMISO"));
        result.setRefNomFideicomiso((String) objectData.getData("REF_NOM_FIDEICOMISO"));
        result.setFacoIdAgrupacion((BigDecimal) objectData.getData("FACO_ID_AGRUPACION"));
        result.setRefNombreReporte((String) objectData.getData("REF_NOMBRE_REPORTE"));
        result.setRefPeriodoReporte((String) objectData.getData("REF_PERIODO_REPORTE"));
        result.setRefValorDato((BigDecimal) objectData.getData("REF_VALOR_DATO"));
        result.setRefEtiqueta((BigDecimal) objectData.getData("REF_ETIQUETA"));
        result.setRefNumColDato((BigDecimal) objectData.getData("REF_NUM_COL_DATO"));
        result.setRefOrdenDato((BigDecimal) objectData.getData("REF_ORDEN_DATO"));
        result.setRefValorEtiqueta((String) objectData.getData("REF_VALOR_ETIQUETA"));

        return result;

    }

}
