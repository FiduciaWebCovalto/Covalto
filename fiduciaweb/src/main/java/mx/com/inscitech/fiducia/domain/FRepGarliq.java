package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FRepGarliq extends DomainObject {

    BigDecimal cgrIdFolio = null;
    BigDecimal cgrTipoReporte = null;
    String cgrFideicomiso = null;
    String cgrCredito = null;
    String cgrTipoCredito = null;
    BigDecimal cgrNumDisposicion = null;
    String cgrReporte = null;
    String cgrDato1 = null;
    String cgrDato2 = null;
    String cgrDato3 = null;
    String cgrDato4 = null;
    String cgrDato5 = null;
    String cgrDato6 = null;
    String cgrDato7 = null;
    String cgrDato8 = null;
    String cgrDato9 = null;
    String cgrDato10 = null;
    String cgrDato11 = null;
    String cgrDato12 = null;
    String cgrDato13 = null;
    String cgrDato14 = null;
    String cgrDato15 = null;
    String cgrInstitucion = null;
    String cgrAtencion = null;
    String cgrPuestoAtencion = null;
    String cgrCalle = null;
    String cgrColonia = null;
    String cgrDelegacion = null;
    String cgrEstado = null;
    String cgrCp = null;
    String cgrFecha = null;
    String cgrNombreAutoriza1 = null;
    String cgrPuestoAutoriza1 = null;
    String cgrInstitucionAutoriza1 = null;
    String cgrFirma1 = null;
    String cgrNombreAutoriza2 = null;
    String cgrPuestoAutoriza2 = null;
    String cgrInstitucionAutoriza2 = null;
    String cgrFirma2 = null;
    String cgrCcp1 = null;
    String cgrCcp2 = null;

    public FRepGarliq() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCgrIdFolio(BigDecimal cgrIdFolio) {
        this.cgrIdFolio = cgrIdFolio;
    }

    public BigDecimal getCgrIdFolio() {
        return this.cgrIdFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCgrTipoReporte(BigDecimal cgrTipoReporte) {
        this.cgrTipoReporte = cgrTipoReporte;
    }

    public BigDecimal getCgrTipoReporte() {
        return this.cgrTipoReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrFideicomiso(String cgrFideicomiso) {
        this.cgrFideicomiso = cgrFideicomiso;
    }

    public String getCgrFideicomiso() {
        return this.cgrFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrCredito(String cgrCredito) {
        this.cgrCredito = cgrCredito;
    }

    public String getCgrCredito() {
        return this.cgrCredito;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrTipoCredito(String cgrTipoCredito) {
        this.cgrTipoCredito = cgrTipoCredito;
    }

    public String getCgrTipoCredito() {
        return this.cgrTipoCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCgrNumDisposicion(BigDecimal cgrNumDisposicion) {
        this.cgrNumDisposicion = cgrNumDisposicion;
    }

    public BigDecimal getCgrNumDisposicion() {
        return this.cgrNumDisposicion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrReporte(String cgrReporte) {
        this.cgrReporte = cgrReporte;
    }

    public String getCgrReporte() {
        return this.cgrReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato1(String cgrDato1) {
        this.cgrDato1 = cgrDato1;
    }

    public String getCgrDato1() {
        return this.cgrDato1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato2(String cgrDato2) {
        this.cgrDato2 = cgrDato2;
    }

    public String getCgrDato2() {
        return this.cgrDato2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato3(String cgrDato3) {
        this.cgrDato3 = cgrDato3;
    }

    public String getCgrDato3() {
        return this.cgrDato3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato4(String cgrDato4) {
        this.cgrDato4 = cgrDato4;
    }

    public String getCgrDato4() {
        return this.cgrDato4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato5(String cgrDato5) {
        this.cgrDato5 = cgrDato5;
    }

    public String getCgrDato5() {
        return this.cgrDato5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato6(String cgrDato6) {
        this.cgrDato6 = cgrDato6;
    }

    public String getCgrDato6() {
        return this.cgrDato6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato7(String cgrDato7) {
        this.cgrDato7 = cgrDato7;
    }

    public String getCgrDato7() {
        return this.cgrDato7;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato8(String cgrDato8) {
        this.cgrDato8 = cgrDato8;
    }

    public String getCgrDato8() {
        return this.cgrDato8;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato9(String cgrDato9) {
        this.cgrDato9 = cgrDato9;
    }

    public String getCgrDato9() {
        return this.cgrDato9;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato10(String cgrDato10) {
        this.cgrDato10 = cgrDato10;
    }

    public String getCgrDato10() {
        return this.cgrDato10;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato11(String cgrDato11) {
        this.cgrDato11 = cgrDato11;
    }

    public String getCgrDato11() {
        return this.cgrDato11;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato12(String cgrDato12) {
        this.cgrDato12 = cgrDato12;
    }

    public String getCgrDato12() {
        return this.cgrDato12;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato13(String cgrDato13) {
        this.cgrDato13 = cgrDato13;
    }

    public String getCgrDato13() {
        return this.cgrDato13;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato14(String cgrDato14) {
        this.cgrDato14 = cgrDato14;
    }

    public String getCgrDato14() {
        return this.cgrDato14;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDato15(String cgrDato15) {
        this.cgrDato15 = cgrDato15;
    }

    public String getCgrDato15() {
        return this.cgrDato15;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrInstitucion(String cgrInstitucion) {
        this.cgrInstitucion = cgrInstitucion;
    }

    public String getCgrInstitucion() {
        return this.cgrInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrAtencion(String cgrAtencion) {
        this.cgrAtencion = cgrAtencion;
    }

    public String getCgrAtencion() {
        return this.cgrAtencion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrPuestoAtencion(String cgrPuestoAtencion) {
        this.cgrPuestoAtencion = cgrPuestoAtencion;
    }

    public String getCgrPuestoAtencion() {
        return this.cgrPuestoAtencion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrCalle(String cgrCalle) {
        this.cgrCalle = cgrCalle;
    }

    public String getCgrCalle() {
        return this.cgrCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrColonia(String cgrColonia) {
        this.cgrColonia = cgrColonia;
    }

    public String getCgrColonia() {
        return this.cgrColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrDelegacion(String cgrDelegacion) {
        this.cgrDelegacion = cgrDelegacion;
    }

    public String getCgrDelegacion() {
        return this.cgrDelegacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrEstado(String cgrEstado) {
        this.cgrEstado = cgrEstado;
    }

    public String getCgrEstado() {
        return this.cgrEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrCp(String cgrCp) {
        this.cgrCp = cgrCp;
    }

    public String getCgrCp() {
        return this.cgrCp;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setCgrFecha(String cgrFecha) {
        this.cgrFecha = cgrFecha;
    }

    public String getCgrFecha() {
        return this.cgrFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrNombreAutoriza1(String cgrNombreAutoriza1) {
        this.cgrNombreAutoriza1 = cgrNombreAutoriza1;
    }

    public String getCgrNombreAutoriza1() {
        return this.cgrNombreAutoriza1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrPuestoAutoriza1(String cgrPuestoAutoriza1) {
        this.cgrPuestoAutoriza1 = cgrPuestoAutoriza1;
    }

    public String getCgrPuestoAutoriza1() {
        return this.cgrPuestoAutoriza1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrInstitucionAutoriza1(String cgrInstitucionAutoriza1) {
        this.cgrInstitucionAutoriza1 = cgrInstitucionAutoriza1;
    }

    public String getCgrInstitucionAutoriza1() {
        return this.cgrInstitucionAutoriza1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrFirma1(String cgrFirma1) {
        this.cgrFirma1 = cgrFirma1;
    }

    public String getCgrFirma1() {
        return this.cgrFirma1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrNombreAutoriza2(String cgrNombreAutoriza2) {
        this.cgrNombreAutoriza2 = cgrNombreAutoriza2;
    }

    public String getCgrNombreAutoriza2() {
        return this.cgrNombreAutoriza2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrPuestoAutoriza2(String cgrPuestoAutoriza2) {
        this.cgrPuestoAutoriza2 = cgrPuestoAutoriza2;
    }

    public String getCgrPuestoAutoriza2() {
        return this.cgrPuestoAutoriza2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrInstitucionAutoriza2(String cgrInstitucionAutoriza2) {
        this.cgrInstitucionAutoriza2 = cgrInstitucionAutoriza2;
    }

    public String getCgrInstitucionAutoriza2() {
        return this.cgrInstitucionAutoriza2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrFirma2(String cgrFirma2) {
        this.cgrFirma2 = cgrFirma2;
    }

    public String getCgrFirma2() {
        return this.cgrFirma2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrCcp1(String cgrCcp1) {
        this.cgrCcp1 = cgrCcp1;
    }

    public String getCgrCcp1() {
        return this.cgrCcp1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCgrCcp2(String cgrCcp2) {
        this.cgrCcp2 = cgrCcp2;
    }

    public String getCgrCcp2() {
        return this.cgrCcp2;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_GARLIQ ";

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
        String sql = "SELECT * FROM F_REP_GARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCgrIdFolio() != null && this.getCgrIdFolio().longValue() == -999) {
            conditions += " AND CGR_ID_FOLIO IS NULL";
        } else if (this.getCgrIdFolio() != null) {
            conditions += " AND CGR_ID_FOLIO = ?";
            values.add(this.getCgrIdFolio());
        }

        if (this.getCgrTipoReporte() != null && this.getCgrTipoReporte().longValue() == -999) {
            conditions += " AND CGR_TIPO_REPORTE IS NULL";
        } else if (this.getCgrTipoReporte() != null) {
            conditions += " AND CGR_TIPO_REPORTE = ?";
            values.add(this.getCgrTipoReporte());
        }

        if (this.getCgrFideicomiso() != null && "null".equals(this.getCgrFideicomiso())) {
            conditions += " AND CGR_FIDEICOMISO IS NULL";
        } else if (this.getCgrFideicomiso() != null) {
            conditions += " AND CGR_FIDEICOMISO = ?";
            values.add(this.getCgrFideicomiso());
        }

        if (this.getCgrCredito() != null && "null".equals(this.getCgrCredito())) {
            conditions += " AND CGR_CREDITO IS NULL";
        } else if (this.getCgrCredito() != null) {
            conditions += " AND CGR_CREDITO = ?";
            values.add(this.getCgrCredito());
        }

        if (this.getCgrTipoCredito() != null && "null".equals(this.getCgrTipoCredito())) {
            conditions += " AND CGR_TIPO_CREDITO IS NULL";
        } else if (this.getCgrTipoCredito() != null) {
            conditions += " AND CGR_TIPO_CREDITO = ?";
            values.add(this.getCgrTipoCredito());
        }

        if (this.getCgrNumDisposicion() != null && this.getCgrNumDisposicion().longValue() == -999) {
            conditions += " AND CGR_NUM_DISPOSICION IS NULL";
        } else if (this.getCgrNumDisposicion() != null) {
            conditions += " AND CGR_NUM_DISPOSICION = ?";
            values.add(this.getCgrNumDisposicion());
        }

        if (this.getCgrReporte() != null && "null".equals(this.getCgrReporte())) {
            conditions += " AND CGR_REPORTE IS NULL";
        } else if (this.getCgrReporte() != null) {
            conditions += " AND CGR_REPORTE = ?";
            values.add(this.getCgrReporte());
        }

        if (this.getCgrDato1() != null && "null".equals(this.getCgrDato1())) {
            conditions += " AND CGR_DATO1 IS NULL";
        } else if (this.getCgrDato1() != null) {
            conditions += " AND CGR_DATO1 = ?";
            values.add(this.getCgrDato1());
        }

        if (this.getCgrDato2() != null && "null".equals(this.getCgrDato2())) {
            conditions += " AND CGR_DATO2 IS NULL";
        } else if (this.getCgrDato2() != null) {
            conditions += " AND CGR_DATO2 = ?";
            values.add(this.getCgrDato2());
        }

        if (this.getCgrDato3() != null && "null".equals(this.getCgrDato3())) {
            conditions += " AND CGR_DATO3 IS NULL";
        } else if (this.getCgrDato3() != null) {
            conditions += " AND CGR_DATO3 = ?";
            values.add(this.getCgrDato3());
        }

        if (this.getCgrDato4() != null && "null".equals(this.getCgrDato4())) {
            conditions += " AND CGR_DATO4 IS NULL";
        } else if (this.getCgrDato4() != null) {
            conditions += " AND CGR_DATO4 = ?";
            values.add(this.getCgrDato4());
        }

        if (this.getCgrDato5() != null && "null".equals(this.getCgrDato5())) {
            conditions += " AND CGR_DATO5 IS NULL";
        } else if (this.getCgrDato5() != null) {
            conditions += " AND CGR_DATO5 = ?";
            values.add(this.getCgrDato5());
        }

        if (this.getCgrDato6() != null && "null".equals(this.getCgrDato6())) {
            conditions += " AND CGR_DATO6 IS NULL";
        } else if (this.getCgrDato6() != null) {
            conditions += " AND CGR_DATO6 = ?";
            values.add(this.getCgrDato6());
        }

        if (this.getCgrDato7() != null && "null".equals(this.getCgrDato7())) {
            conditions += " AND CGR_DATO7 IS NULL";
        } else if (this.getCgrDato7() != null) {
            conditions += " AND CGR_DATO7 = ?";
            values.add(this.getCgrDato7());
        }

        if (this.getCgrDato8() != null && "null".equals(this.getCgrDato8())) {
            conditions += " AND CGR_DATO8 IS NULL";
        } else if (this.getCgrDato8() != null) {
            conditions += " AND CGR_DATO8 = ?";
            values.add(this.getCgrDato8());
        }

        if (this.getCgrDato9() != null && "null".equals(this.getCgrDato9())) {
            conditions += " AND CGR_DATO9 IS NULL";
        } else if (this.getCgrDato9() != null) {
            conditions += " AND CGR_DATO9 = ?";
            values.add(this.getCgrDato9());
        }

        if (this.getCgrDato10() != null && "null".equals(this.getCgrDato10())) {
            conditions += " AND CGR_DATO10 IS NULL";
        } else if (this.getCgrDato10() != null) {
            conditions += " AND CGR_DATO10 = ?";
            values.add(this.getCgrDato10());
        }

        if (this.getCgrDato11() != null && "null".equals(this.getCgrDato11())) {
            conditions += " AND CGR_DATO11 IS NULL";
        } else if (this.getCgrDato11() != null) {
            conditions += " AND CGR_DATO11 = ?";
            values.add(this.getCgrDato11());
        }

        if (this.getCgrDato12() != null && "null".equals(this.getCgrDato12())) {
            conditions += " AND CGR_DATO12 IS NULL";
        } else if (this.getCgrDato12() != null) {
            conditions += " AND CGR_DATO12 = ?";
            values.add(this.getCgrDato12());
        }

        if (this.getCgrDato13() != null && "null".equals(this.getCgrDato13())) {
            conditions += " AND CGR_DATO13 IS NULL";
        } else if (this.getCgrDato13() != null) {
            conditions += " AND CGR_DATO13 = ?";
            values.add(this.getCgrDato13());
        }

        if (this.getCgrDato14() != null && "null".equals(this.getCgrDato14())) {
            conditions += " AND CGR_DATO14 IS NULL";
        } else if (this.getCgrDato14() != null) {
            conditions += " AND CGR_DATO14 = ?";
            values.add(this.getCgrDato14());
        }

        if (this.getCgrDato15() != null && "null".equals(this.getCgrDato15())) {
            conditions += " AND CGR_DATO15 IS NULL";
        } else if (this.getCgrDato15() != null) {
            conditions += " AND CGR_DATO15 = ?";
            values.add(this.getCgrDato15());
        }

        if (this.getCgrInstitucion() != null && "null".equals(this.getCgrInstitucion())) {
            conditions += " AND CGR_INSTITUCION IS NULL";
        } else if (this.getCgrInstitucion() != null) {
            conditions += " AND CGR_INSTITUCION = ?";
            values.add(this.getCgrInstitucion());
        }

        if (this.getCgrAtencion() != null && "null".equals(this.getCgrAtencion())) {
            conditions += " AND CGR_ATENCION IS NULL";
        } else if (this.getCgrAtencion() != null) {
            conditions += " AND CGR_ATENCION = ?";
            values.add(this.getCgrAtencion());
        }

        if (this.getCgrPuestoAtencion() != null && "null".equals(this.getCgrPuestoAtencion())) {
            conditions += " AND CGR_PUESTO_ATENCION IS NULL";
        } else if (this.getCgrPuestoAtencion() != null) {
            conditions += " AND CGR_PUESTO_ATENCION = ?";
            values.add(this.getCgrPuestoAtencion());
        }

        if (this.getCgrCalle() != null && "null".equals(this.getCgrCalle())) {
            conditions += " AND CGR_CALLE IS NULL";
        } else if (this.getCgrCalle() != null) {
            conditions += " AND CGR_CALLE = ?";
            values.add(this.getCgrCalle());
        }

        if (this.getCgrColonia() != null && "null".equals(this.getCgrColonia())) {
            conditions += " AND CGR_COLONIA IS NULL";
        } else if (this.getCgrColonia() != null) {
            conditions += " AND CGR_COLONIA = ?";
            values.add(this.getCgrColonia());
        }

        if (this.getCgrDelegacion() != null && "null".equals(this.getCgrDelegacion())) {
            conditions += " AND CGR_DELEGACION IS NULL";
        } else if (this.getCgrDelegacion() != null) {
            conditions += " AND CGR_DELEGACION = ?";
            values.add(this.getCgrDelegacion());
        }

        if (this.getCgrEstado() != null && "null".equals(this.getCgrEstado())) {
            conditions += " AND CGR_ESTADO IS NULL";
        } else if (this.getCgrEstado() != null) {
            conditions += " AND CGR_ESTADO = ?";
            values.add(this.getCgrEstado());
        }

        if (this.getCgrCp() != null && "null".equals(this.getCgrCp())) {
            conditions += " AND CGR_CP IS NULL";
        } else if (this.getCgrCp() != null) {
            conditions += " AND CGR_CP = ?";
            values.add(this.getCgrCp());
        }

        if (this.getCgrFecha() != null && "null".equals(this.getCgrFecha())) {
            conditions += " AND CGR_FECHA IS NULL";
        } else if (this.getCgrFecha() != null) {
            conditions += " AND CGR_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getCgrFecha());
        }

        if (this.getCgrNombreAutoriza1() != null && "null".equals(this.getCgrNombreAutoriza1())) {
            conditions += " AND CGR_NOMBRE_AUTORIZA1 IS NULL";
        } else if (this.getCgrNombreAutoriza1() != null) {
            conditions += " AND CGR_NOMBRE_AUTORIZA1 = ?";
            values.add(this.getCgrNombreAutoriza1());
        }

        if (this.getCgrPuestoAutoriza1() != null && "null".equals(this.getCgrPuestoAutoriza1())) {
            conditions += " AND CGR_PUESTO_AUTORIZA1 IS NULL";
        } else if (this.getCgrPuestoAutoriza1() != null) {
            conditions += " AND CGR_PUESTO_AUTORIZA1 = ?";
            values.add(this.getCgrPuestoAutoriza1());
        }

        if (this.getCgrInstitucionAutoriza1() != null && "null".equals(this.getCgrInstitucionAutoriza1())) {
            conditions += " AND CGR_INSTITUCION_AUTORIZA1 IS NULL";
        } else if (this.getCgrInstitucionAutoriza1() != null) {
            conditions += " AND CGR_INSTITUCION_AUTORIZA1 = ?";
            values.add(this.getCgrInstitucionAutoriza1());
        }

        if (this.getCgrFirma1() != null && "null".equals(this.getCgrFirma1())) {
            conditions += " AND CGR_FIRMA1 IS NULL";
        } else if (this.getCgrFirma1() != null) {
            conditions += " AND CGR_FIRMA1 = ?";
            values.add(this.getCgrFirma1());
        }

        if (this.getCgrNombreAutoriza2() != null && "null".equals(this.getCgrNombreAutoriza2())) {
            conditions += " AND CGR_NOMBRE_AUTORIZA2 IS NULL";
        } else if (this.getCgrNombreAutoriza2() != null) {
            conditions += " AND CGR_NOMBRE_AUTORIZA2 = ?";
            values.add(this.getCgrNombreAutoriza2());
        }

        if (this.getCgrPuestoAutoriza2() != null && "null".equals(this.getCgrPuestoAutoriza2())) {
            conditions += " AND CGR_PUESTO_AUTORIZA2 IS NULL";
        } else if (this.getCgrPuestoAutoriza2() != null) {
            conditions += " AND CGR_PUESTO_AUTORIZA2 = ?";
            values.add(this.getCgrPuestoAutoriza2());
        }

        if (this.getCgrInstitucionAutoriza2() != null && "null".equals(this.getCgrInstitucionAutoriza2())) {
            conditions += " AND CGR_INSTITUCION_AUTORIZA2 IS NULL";
        } else if (this.getCgrInstitucionAutoriza2() != null) {
            conditions += " AND CGR_INSTITUCION_AUTORIZA2 = ?";
            values.add(this.getCgrInstitucionAutoriza2());
        }

        if (this.getCgrFirma2() != null && "null".equals(this.getCgrFirma2())) {
            conditions += " AND CGR_FIRMA2 IS NULL";
        } else if (this.getCgrFirma2() != null) {
            conditions += " AND CGR_FIRMA2 = ?";
            values.add(this.getCgrFirma2());
        }

        if (this.getCgrCcp1() != null && "null".equals(this.getCgrCcp1())) {
            conditions += " AND CGR_CCP1 IS NULL";
        } else if (this.getCgrCcp1() != null) {
            conditions += " AND CGR_CCP1 = ?";
            values.add(this.getCgrCcp1());
        }

        if (this.getCgrCcp2() != null && "null".equals(this.getCgrCcp2())) {
            conditions += " AND CGR_CCP2 IS NULL";
        } else if (this.getCgrCcp2() != null) {
            conditions += " AND CGR_CCP2 = ?";
            values.add(this.getCgrCcp2());
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
        String sql = "UPDATE F_REP_GARLIQ SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " CGR_ID_FOLIO = ?, ";
        values.add(this.getCgrIdFolio());
        fields += " CGR_TIPO_REPORTE = ?, ";
        values.add(this.getCgrTipoReporte());
        fields += " CGR_FIDEICOMISO = ?, ";
        values.add(this.getCgrFideicomiso());
        fields += " CGR_CREDITO = ?, ";
        values.add(this.getCgrCredito());
        fields += " CGR_TIPO_CREDITO = ?, ";
        values.add(this.getCgrTipoCredito());
        fields += " CGR_NUM_DISPOSICION = ?, ";
        values.add(this.getCgrNumDisposicion());
        fields += " CGR_REPORTE = ?, ";
        values.add(this.getCgrReporte());
        fields += " CGR_DATO1 = ?, ";
        values.add(this.getCgrDato1());
        fields += " CGR_DATO2 = ?, ";
        values.add(this.getCgrDato2());
        fields += " CGR_DATO3 = ?, ";
        values.add(this.getCgrDato3());
        fields += " CGR_DATO4 = ?, ";
        values.add(this.getCgrDato4());
        fields += " CGR_DATO5 = ?, ";
        values.add(this.getCgrDato5());
        fields += " CGR_DATO6 = ?, ";
        values.add(this.getCgrDato6());
        fields += " CGR_DATO7 = ?, ";
        values.add(this.getCgrDato7());
        fields += " CGR_DATO8 = ?, ";
        values.add(this.getCgrDato8());
        fields += " CGR_DATO9 = ?, ";
        values.add(this.getCgrDato9());
        fields += " CGR_DATO10 = ?, ";
        values.add(this.getCgrDato10());
        fields += " CGR_DATO11 = ?, ";
        values.add(this.getCgrDato11());
        fields += " CGR_DATO12 = ?, ";
        values.add(this.getCgrDato12());
        fields += " CGR_DATO13 = ?, ";
        values.add(this.getCgrDato13());
        fields += " CGR_DATO14 = ?, ";
        values.add(this.getCgrDato14());
        fields += " CGR_DATO15 = ?, ";
        values.add(this.getCgrDato15());
        fields += " CGR_INSTITUCION = ?, ";
        values.add(this.getCgrInstitucion());
        fields += " CGR_ATENCION = ?, ";
        values.add(this.getCgrAtencion());
        fields += " CGR_PUESTO_ATENCION = ?, ";
        values.add(this.getCgrPuestoAtencion());
        fields += " CGR_CALLE = ?, ";
        values.add(this.getCgrCalle());
        fields += " CGR_COLONIA = ?, ";
        values.add(this.getCgrColonia());
        fields += " CGR_DELEGACION = ?, ";
        values.add(this.getCgrDelegacion());
        fields += " CGR_ESTADO = ?, ";
        values.add(this.getCgrEstado());
        fields += " CGR_CP = ?, ";
        values.add(this.getCgrCp());
        fields += " CGR_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getCgrFecha());
        fields += " CGR_NOMBRE_AUTORIZA1 = ?, ";
        values.add(this.getCgrNombreAutoriza1());
        fields += " CGR_PUESTO_AUTORIZA1 = ?, ";
        values.add(this.getCgrPuestoAutoriza1());
        fields += " CGR_INSTITUCION_AUTORIZA1 = ?, ";
        values.add(this.getCgrInstitucionAutoriza1());
        fields += " CGR_FIRMA1 = ?, ";
        values.add(this.getCgrFirma1());
        fields += " CGR_NOMBRE_AUTORIZA2 = ?, ";
        values.add(this.getCgrNombreAutoriza2());
        fields += " CGR_PUESTO_AUTORIZA2 = ?, ";
        values.add(this.getCgrPuestoAutoriza2());
        fields += " CGR_INSTITUCION_AUTORIZA2 = ?, ";
        values.add(this.getCgrInstitucionAutoriza2());
        fields += " CGR_FIRMA2 = ?, ";
        values.add(this.getCgrFirma2());
        fields += " CGR_CCP1 = ?, ";
        values.add(this.getCgrCcp1());
        fields += " CGR_CCP2 = ?, ";
        values.add(this.getCgrCcp2());
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
        String sql = "INSERT INTO F_REP_GARLIQ ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CGR_ID_FOLIO";
        fieldValues += ", ?";
        values.add(this.getCgrIdFolio());

        fields += ", CGR_TIPO_REPORTE";
        fieldValues += ", ?";
        values.add(this.getCgrTipoReporte());

        fields += ", CGR_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getCgrFideicomiso());

        fields += ", CGR_CREDITO";
        fieldValues += ", ?";
        values.add(this.getCgrCredito());

        fields += ", CGR_TIPO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getCgrTipoCredito());

        fields += ", CGR_NUM_DISPOSICION";
        fieldValues += ", ?";
        values.add(this.getCgrNumDisposicion());

        fields += ", CGR_REPORTE";
        fieldValues += ", ?";
        values.add(this.getCgrReporte());

        fields += ", CGR_DATO1";
        fieldValues += ", ?";
        values.add(this.getCgrDato1());

        fields += ", CGR_DATO2";
        fieldValues += ", ?";
        values.add(this.getCgrDato2());

        fields += ", CGR_DATO3";
        fieldValues += ", ?";
        values.add(this.getCgrDato3());

        fields += ", CGR_DATO4";
        fieldValues += ", ?";
        values.add(this.getCgrDato4());

        fields += ", CGR_DATO5";
        fieldValues += ", ?";
        values.add(this.getCgrDato5());

        fields += ", CGR_DATO6";
        fieldValues += ", ?";
        values.add(this.getCgrDato6());

        fields += ", CGR_DATO7";
        fieldValues += ", ?";
        values.add(this.getCgrDato7());

        fields += ", CGR_DATO8";
        fieldValues += ", ?";
        values.add(this.getCgrDato8());

        fields += ", CGR_DATO9";
        fieldValues += ", ?";
        values.add(this.getCgrDato9());

        fields += ", CGR_DATO10";
        fieldValues += ", ?";
        values.add(this.getCgrDato10());

        fields += ", CGR_DATO11";
        fieldValues += ", ?";
        values.add(this.getCgrDato11());

        fields += ", CGR_DATO12";
        fieldValues += ", ?";
        values.add(this.getCgrDato12());

        fields += ", CGR_DATO13";
        fieldValues += ", ?";
        values.add(this.getCgrDato13());

        fields += ", CGR_DATO14";
        fieldValues += ", ?";
        values.add(this.getCgrDato14());

        fields += ", CGR_DATO15";
        fieldValues += ", ?";
        values.add(this.getCgrDato15());

        fields += ", CGR_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getCgrInstitucion());

        fields += ", CGR_ATENCION";
        fieldValues += ", ?";
        values.add(this.getCgrAtencion());

        fields += ", CGR_PUESTO_ATENCION";
        fieldValues += ", ?";
        values.add(this.getCgrPuestoAtencion());

        fields += ", CGR_CALLE";
        fieldValues += ", ?";
        values.add(this.getCgrCalle());

        fields += ", CGR_COLONIA";
        fieldValues += ", ?";
        values.add(this.getCgrColonia());

        fields += ", CGR_DELEGACION";
        fieldValues += ", ?";
        values.add(this.getCgrDelegacion());

        fields += ", CGR_ESTADO";
        fieldValues += ", ?";
        values.add(this.getCgrEstado());

        fields += ", CGR_CP";
        fieldValues += ", ?";
        values.add(this.getCgrCp());

        fields += ", CGR_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getCgrFecha());

        fields += ", CGR_NOMBRE_AUTORIZA1";
        fieldValues += ", ?";
        values.add(this.getCgrNombreAutoriza1());

        fields += ", CGR_PUESTO_AUTORIZA1";
        fieldValues += ", ?";
        values.add(this.getCgrPuestoAutoriza1());

        fields += ", CGR_INSTITUCION_AUTORIZA1";
        fieldValues += ", ?";
        values.add(this.getCgrInstitucionAutoriza1());

        fields += ", CGR_FIRMA1";
        fieldValues += ", ?";
        values.add(this.getCgrFirma1());

        fields += ", CGR_NOMBRE_AUTORIZA2";
        fieldValues += ", ?";
        values.add(this.getCgrNombreAutoriza2());

        fields += ", CGR_PUESTO_AUTORIZA2";
        fieldValues += ", ?";
        values.add(this.getCgrPuestoAutoriza2());

        fields += ", CGR_INSTITUCION_AUTORIZA2";
        fieldValues += ", ?";
        values.add(this.getCgrInstitucionAutoriza2());

        fields += ", CGR_FIRMA2";
        fieldValues += ", ?";
        values.add(this.getCgrFirma2());

        fields += ", CGR_CCP1";
        fieldValues += ", ?";
        values.add(this.getCgrCcp1());

        fields += ", CGR_CCP2";
        fieldValues += ", ?";
        values.add(this.getCgrCcp2());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REP_GARLIQ WHERE ";

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
        FRepGarliq instance = (FRepGarliq) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCgrIdFolio().equals(instance.getCgrIdFolio()))
            equalObjects = false;
        if (equalObjects && !this.getCgrTipoReporte().equals(instance.getCgrTipoReporte()))
            equalObjects = false;
        if (equalObjects && !this.getCgrFideicomiso().equals(instance.getCgrFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getCgrCredito().equals(instance.getCgrCredito()))
            equalObjects = false;
        if (equalObjects && !this.getCgrTipoCredito().equals(instance.getCgrTipoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getCgrNumDisposicion().equals(instance.getCgrNumDisposicion()))
            equalObjects = false;
        if (equalObjects && !this.getCgrReporte().equals(instance.getCgrReporte()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato1().equals(instance.getCgrDato1()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato2().equals(instance.getCgrDato2()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato3().equals(instance.getCgrDato3()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato4().equals(instance.getCgrDato4()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato5().equals(instance.getCgrDato5()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato6().equals(instance.getCgrDato6()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato7().equals(instance.getCgrDato7()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato8().equals(instance.getCgrDato8()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato9().equals(instance.getCgrDato9()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato10().equals(instance.getCgrDato10()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato11().equals(instance.getCgrDato11()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato12().equals(instance.getCgrDato12()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato13().equals(instance.getCgrDato13()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato14().equals(instance.getCgrDato14()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDato15().equals(instance.getCgrDato15()))
            equalObjects = false;
        if (equalObjects && !this.getCgrInstitucion().equals(instance.getCgrInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getCgrAtencion().equals(instance.getCgrAtencion()))
            equalObjects = false;
        if (equalObjects && !this.getCgrPuestoAtencion().equals(instance.getCgrPuestoAtencion()))
            equalObjects = false;
        if (equalObjects && !this.getCgrCalle().equals(instance.getCgrCalle()))
            equalObjects = false;
        if (equalObjects && !this.getCgrColonia().equals(instance.getCgrColonia()))
            equalObjects = false;
        if (equalObjects && !this.getCgrDelegacion().equals(instance.getCgrDelegacion()))
            equalObjects = false;
        if (equalObjects && !this.getCgrEstado().equals(instance.getCgrEstado()))
            equalObjects = false;
        if (equalObjects && !this.getCgrCp().equals(instance.getCgrCp()))
            equalObjects = false;
        if (equalObjects && !this.getCgrFecha().equals(instance.getCgrFecha()))
            equalObjects = false;
        if (equalObjects && !this.getCgrNombreAutoriza1().equals(instance.getCgrNombreAutoriza1()))
            equalObjects = false;
        if (equalObjects && !this.getCgrPuestoAutoriza1().equals(instance.getCgrPuestoAutoriza1()))
            equalObjects = false;
        if (equalObjects && !this.getCgrInstitucionAutoriza1().equals(instance.getCgrInstitucionAutoriza1()))
            equalObjects = false;
        if (equalObjects && !this.getCgrFirma1().equals(instance.getCgrFirma1()))
            equalObjects = false;
        if (equalObjects && !this.getCgrNombreAutoriza2().equals(instance.getCgrNombreAutoriza2()))
            equalObjects = false;
        if (equalObjects && !this.getCgrPuestoAutoriza2().equals(instance.getCgrPuestoAutoriza2()))
            equalObjects = false;
        if (equalObjects && !this.getCgrInstitucionAutoriza2().equals(instance.getCgrInstitucionAutoriza2()))
            equalObjects = false;
        if (equalObjects && !this.getCgrFirma2().equals(instance.getCgrFirma2()))
            equalObjects = false;
        if (equalObjects && !this.getCgrCcp1().equals(instance.getCgrCcp1()))
            equalObjects = false;
        if (equalObjects && !this.getCgrCcp2().equals(instance.getCgrCcp2()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepGarliq result = new FRepGarliq();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCgrIdFolio((BigDecimal) objectData.getData("CGR_ID_FOLIO"));
        result.setCgrTipoReporte((BigDecimal) objectData.getData("CGR_TIPO_REPORTE"));
        result.setCgrFideicomiso((String) objectData.getData("CGR_FIDEICOMISO"));
        result.setCgrCredito((String) objectData.getData("CGR_CREDITO"));
        result.setCgrTipoCredito((String) objectData.getData("CGR_TIPO_CREDITO"));
        result.setCgrNumDisposicion((BigDecimal) objectData.getData("CGR_NUM_DISPOSICION"));
        result.setCgrReporte((String) objectData.getData("CGR_REPORTE"));
        result.setCgrDato1((String) objectData.getData("CGR_DATO1"));
        result.setCgrDato2((String) objectData.getData("CGR_DATO2"));
        result.setCgrDato3((String) objectData.getData("CGR_DATO3"));
        result.setCgrDato4((String) objectData.getData("CGR_DATO4"));
        result.setCgrDato5((String) objectData.getData("CGR_DATO5"));
        result.setCgrDato6((String) objectData.getData("CGR_DATO6"));
        result.setCgrDato7((String) objectData.getData("CGR_DATO7"));
        result.setCgrDato8((String) objectData.getData("CGR_DATO8"));
        result.setCgrDato9((String) objectData.getData("CGR_DATO9"));
        result.setCgrDato10((String) objectData.getData("CGR_DATO10"));
        result.setCgrDato11((String) objectData.getData("CGR_DATO11"));
        result.setCgrDato12((String) objectData.getData("CGR_DATO12"));
        result.setCgrDato13((String) objectData.getData("CGR_DATO13"));
        result.setCgrDato14((String) objectData.getData("CGR_DATO14"));
        result.setCgrDato15((String) objectData.getData("CGR_DATO15"));
        result.setCgrInstitucion((String) objectData.getData("CGR_INSTITUCION"));
        result.setCgrAtencion((String) objectData.getData("CGR_ATENCION"));
        result.setCgrPuestoAtencion((String) objectData.getData("CGR_PUESTO_ATENCION"));
        result.setCgrCalle((String) objectData.getData("CGR_CALLE"));
        result.setCgrColonia((String) objectData.getData("CGR_COLONIA"));
        result.setCgrDelegacion((String) objectData.getData("CGR_DELEGACION"));
        result.setCgrEstado((String) objectData.getData("CGR_ESTADO"));
        result.setCgrCp((String) objectData.getData("CGR_CP"));
        result.setCgrFecha((String) objectData.getData("CGR_FECHA"));
        result.setCgrNombreAutoriza1((String) objectData.getData("CGR_NOMBRE_AUTORIZA1"));
        result.setCgrPuestoAutoriza1((String) objectData.getData("CGR_PUESTO_AUTORIZA1"));
        result.setCgrInstitucionAutoriza1((String) objectData.getData("CGR_INSTITUCION_AUTORIZA1"));
        result.setCgrFirma1((String) objectData.getData("CGR_FIRMA1"));
        result.setCgrNombreAutoriza2((String) objectData.getData("CGR_NOMBRE_AUTORIZA2"));
        result.setCgrPuestoAutoriza2((String) objectData.getData("CGR_PUESTO_AUTORIZA2"));
        result.setCgrInstitucionAutoriza2((String) objectData.getData("CGR_INSTITUCION_AUTORIZA2"));
        result.setCgrFirma2((String) objectData.getData("CGR_FIRMA2"));
        result.setCgrCcp1((String) objectData.getData("CGR_CCP1"));
        result.setCgrCcp2((String) objectData.getData("CGR_CCP2"));

        return result;

    }

}
