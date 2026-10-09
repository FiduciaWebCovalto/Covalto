package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FICHAUNICA_PK", columns = { "FCH_FOLIO_OPERA", "FCH_NUM_CONTRATO", "FCH_PERIODO_DEL", "FCH_PERIODO_AL" }, sequences = { "MANUAL" })
public class Fichaunica extends DomainObject {

    BigDecimal fchFolioOpera = null;
    BigDecimal fchNumContrato = null;
    String fchTipoInstru = null;
    String fchFechaOpera = null;
    String fchPeriodoAl = null;
    BigDecimal fchCtoInvOrg = null;
    String fchInstrumeOrg = null;
    BigDecimal fchCtoInvDes = null;
    String fchInstrumeDes = null;
    String fchPeriodoDel = null;
    BigDecimal fchImporte = null;
    String fchConcepto = null;
    String fchObservaciones = null;
    String fchCuenta = null;
    String fchBanco = null;
    BigDecimal fchSucursal = null;
    String fchPlaza = null;
    String fchBeneficiario = null;
    String fchRfc = null;
    String fchPais = null;
    String fchDetalleInstru = null;
    String fchFechaSesion = null;
    String fchTipoSesion = null;
    String fchAcuerdoId = null;
    String fchStatusInstruc = null;
    String fchStatusContabilidad = null;
    BigDecimal fchHoraTransac = null;
    BigDecimal fchMinTransac = null;
    String fchNomUsuario = null;
    String fchTipoPersona = null;
    String fchNombrePersona = null;
    String fchMonCtoInvOrg = null;
    String fchMonCtoInvDes = null;

    public Fichaunica() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFchFolioOpera(BigDecimal fchFolioOpera) {
        this.fchFolioOpera = fchFolioOpera;
    }

    public BigDecimal getFchFolioOpera() {
        return this.fchFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFchNumContrato(BigDecimal fchNumContrato) {
        this.fchNumContrato = fchNumContrato;
    }

    public BigDecimal getFchNumContrato() {
        return this.fchNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchTipoInstru(String fchTipoInstru) {
        this.fchTipoInstru = fchTipoInstru;
    }

    public String getFchTipoInstru() {
        return this.fchTipoInstru;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFchFechaOpera(String fchFechaOpera) {
        this.fchFechaOpera = fchFechaOpera;
    }

    public String getFchFechaOpera() {
        return this.fchFechaOpera;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFchPeriodoAl(String fchPeriodoAl) {
        this.fchPeriodoAl = fchPeriodoAl;
    }

    public String getFchPeriodoAl() {
        return this.fchPeriodoAl;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFchCtoInvOrg(BigDecimal fchCtoInvOrg) {
        this.fchCtoInvOrg = fchCtoInvOrg;
    }

    public BigDecimal getFchCtoInvOrg() {
        return this.fchCtoInvOrg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchInstrumeOrg(String fchInstrumeOrg) {
        this.fchInstrumeOrg = fchInstrumeOrg;
    }

    public String getFchInstrumeOrg() {
        return this.fchInstrumeOrg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 15, scale = 0, javaClass = BigDecimal.class)
    public void setFchCtoInvDes(BigDecimal fchCtoInvDes) {
        this.fchCtoInvDes = fchCtoInvDes;
    }

    public BigDecimal getFchCtoInvDes() {
        return this.fchCtoInvDes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchInstrumeDes(String fchInstrumeDes) {
        this.fchInstrumeDes = fchInstrumeDes;
    }

    public String getFchInstrumeDes() {
        return this.fchInstrumeDes;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFchPeriodoDel(String fchPeriodoDel) {
        this.fchPeriodoDel = fchPeriodoDel;
    }

    public String getFchPeriodoDel() {
        return this.fchPeriodoDel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setFchImporte(BigDecimal fchImporte) {
        this.fchImporte = fchImporte;
    }

    public BigDecimal getFchImporte() {
        return this.fchImporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchConcepto(String fchConcepto) {
        this.fchConcepto = fchConcepto;
    }

    public String getFchConcepto() {
        return this.fchConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchObservaciones(String fchObservaciones) {
        this.fchObservaciones = fchObservaciones;
    }

    public String getFchObservaciones() {
        return this.fchObservaciones;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchCuenta(String fchCuenta) {
        this.fchCuenta = fchCuenta;
    }

    public String getFchCuenta() {
        return this.fchCuenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchBanco(String fchBanco) {
        this.fchBanco = fchBanco;
    }

    public String getFchBanco() {
        return this.fchBanco;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setFchSucursal(BigDecimal fchSucursal) {
        this.fchSucursal = fchSucursal;
    }

    public BigDecimal getFchSucursal() {
        return this.fchSucursal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchPlaza(String fchPlaza) {
        this.fchPlaza = fchPlaza;
    }

    public String getFchPlaza() {
        return this.fchPlaza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchBeneficiario(String fchBeneficiario) {
        this.fchBeneficiario = fchBeneficiario;
    }

    public String getFchBeneficiario() {
        return this.fchBeneficiario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchRfc(String fchRfc) {
        this.fchRfc = fchRfc;
    }

    public String getFchRfc() {
        return this.fchRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchPais(String fchPais) {
        this.fchPais = fchPais;
    }

    public String getFchPais() {
        return this.fchPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchDetalleInstru(String fchDetalleInstru) {
        this.fchDetalleInstru = fchDetalleInstru;
    }

    public String getFchDetalleInstru() {
        return this.fchDetalleInstru;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFchFechaSesion(String fchFechaSesion) {
        this.fchFechaSesion = fchFechaSesion;
    }

    public String getFchFechaSesion() {
        return this.fchFechaSesion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchTipoSesion(String fchTipoSesion) {
        this.fchTipoSesion = fchTipoSesion;
    }

    public String getFchTipoSesion() {
        return this.fchTipoSesion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchAcuerdoId(String fchAcuerdoId) {
        this.fchAcuerdoId = fchAcuerdoId;
    }

    public String getFchAcuerdoId() {
        return this.fchAcuerdoId;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchStatusInstruc(String fchStatusInstruc) {
        this.fchStatusInstruc = fchStatusInstruc;
    }

    public String getFchStatusInstruc() {
        return this.fchStatusInstruc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchStatusContabilidad(String fchStatusContabilidad) {
        this.fchStatusContabilidad = fchStatusContabilidad;
    }

    public String getFchStatusContabilidad() {
        return this.fchStatusContabilidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFchHoraTransac(BigDecimal fchHoraTransac) {
        this.fchHoraTransac = fchHoraTransac;
    }

    public BigDecimal getFchHoraTransac() {
        return this.fchHoraTransac;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFchMinTransac(BigDecimal fchMinTransac) {
        this.fchMinTransac = fchMinTransac;
    }

    public BigDecimal getFchMinTransac() {
        return this.fchMinTransac;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchNomUsuario(String fchNomUsuario) {
        this.fchNomUsuario = fchNomUsuario;
    }

    public String getFchNomUsuario() {
        return this.fchNomUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchTipoPersona(String fchTipoPersona) {
        this.fchTipoPersona = fchTipoPersona;
    }

    public String getFchTipoPersona() {
        return this.fchTipoPersona;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchNombrePersona(String fchNombrePersona) {
        this.fchNombrePersona = fchNombrePersona;
    }

    public String getFchNombrePersona() {
        return this.fchNombrePersona;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchMonCtoInvOrg(String fchMonCtoInvOrg) {
        this.fchMonCtoInvOrg = fchMonCtoInvOrg;
    }

    public String getFchMonCtoInvOrg() {
        return this.fchMonCtoInvOrg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFchMonCtoInvDes(String fchMonCtoInvDes) {
        this.fchMonCtoInvDes = fchMonCtoInvDes;
    }

    public String getFchMonCtoInvDes() {
        return this.fchMonCtoInvDes;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FICHAUNICA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFchFolioOpera() != null && this.getFchFolioOpera().longValue() == -999) {
            conditions += " AND FCH_FOLIO_OPERA IS NULL";
        } else if (this.getFchFolioOpera() != null) {
            conditions += " AND FCH_FOLIO_OPERA = ?";
            values.add(this.getFchFolioOpera());
        }

        if (this.getFchNumContrato() != null && this.getFchNumContrato().longValue() == -999) {
            conditions += " AND FCH_NUM_CONTRATO IS NULL";
        } else if (this.getFchNumContrato() != null) {
            conditions += " AND FCH_NUM_CONTRATO = ?";
            values.add(this.getFchNumContrato());
        }

        if (this.getFchPeriodoAl() != null && "null".equals(this.getFchPeriodoAl())) {
            conditions += " AND FCH_PERIODO_AL IS NULL";
        } else if (this.getFchPeriodoAl() != null) {
            conditions += " AND FCH_PERIODO_AL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFchPeriodoAl());
        }

        if (this.getFchPeriodoDel() != null && "null".equals(this.getFchPeriodoDel())) {
            conditions += " AND FCH_PERIODO_DEL IS NULL";
        } else if (this.getFchPeriodoDel() != null) {
            conditions += " AND FCH_PERIODO_DEL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFchPeriodoDel());
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
        String sql = "SELECT * FROM FICHAUNICA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFchFolioOpera() != null && this.getFchFolioOpera().longValue() == -999) {
            conditions += " AND FCH_FOLIO_OPERA IS NULL";
        } else if (this.getFchFolioOpera() != null) {
            conditions += " AND FCH_FOLIO_OPERA = ?";
            values.add(this.getFchFolioOpera());
        }

        if (this.getFchNumContrato() != null && this.getFchNumContrato().longValue() == -999) {
            conditions += " AND FCH_NUM_CONTRATO IS NULL";
        } else if (this.getFchNumContrato() != null) {
            conditions += " AND FCH_NUM_CONTRATO = ?";
            values.add(this.getFchNumContrato());
        }

        if (this.getFchTipoInstru() != null && "null".equals(this.getFchTipoInstru())) {
            conditions += " AND FCH_TIPO_INSTRU IS NULL";
        } else if (this.getFchTipoInstru() != null) {
            conditions += " AND FCH_TIPO_INSTRU = ?";
            values.add(this.getFchTipoInstru());
        }

        if (this.getFchFechaOpera() != null && "null".equals(this.getFchFechaOpera())) {
            conditions += " AND FCH_FECHA_OPERA IS NULL";
        } else if (this.getFchFechaOpera() != null) {
            conditions += " AND FCH_FECHA_OPERA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFchFechaOpera());
        }

        if (this.getFchPeriodoAl() != null && "null".equals(this.getFchPeriodoAl())) {
            conditions += " AND FCH_PERIODO_AL IS NULL";
        } else if (this.getFchPeriodoAl() != null) {
            conditions += " AND FCH_PERIODO_AL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFchPeriodoAl());
        }

        if (this.getFchCtoInvOrg() != null && this.getFchCtoInvOrg().longValue() == -999) {
            conditions += " AND FCH_CTO_INV_ORG IS NULL";
        } else if (this.getFchCtoInvOrg() != null) {
            conditions += " AND FCH_CTO_INV_ORG = ?";
            values.add(this.getFchCtoInvOrg());
        }

        if (this.getFchInstrumeOrg() != null && "null".equals(this.getFchInstrumeOrg())) {
            conditions += " AND FCH_INSTRUME_ORG IS NULL";
        } else if (this.getFchInstrumeOrg() != null) {
            conditions += " AND FCH_INSTRUME_ORG = ?";
            values.add(this.getFchInstrumeOrg());
        }

        if (this.getFchCtoInvDes() != null && this.getFchCtoInvDes().longValue() == -999) {
            conditions += " AND FCH_CTO_INV_DES IS NULL";
        } else if (this.getFchCtoInvDes() != null) {
            conditions += " AND FCH_CTO_INV_DES = ?";
            values.add(this.getFchCtoInvDes());
        }

        if (this.getFchInstrumeDes() != null && "null".equals(this.getFchInstrumeDes())) {
            conditions += " AND FCH_INSTRUME_DES IS NULL";
        } else if (this.getFchInstrumeDes() != null) {
            conditions += " AND FCH_INSTRUME_DES = ?";
            values.add(this.getFchInstrumeDes());
        }

        if (this.getFchPeriodoDel() != null && "null".equals(this.getFchPeriodoDel())) {
            conditions += " AND FCH_PERIODO_DEL IS NULL";
        } else if (this.getFchPeriodoDel() != null) {
            conditions += " AND FCH_PERIODO_DEL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFchPeriodoDel());
        }

        if (this.getFchImporte() != null && this.getFchImporte().longValue() == -999) {
            conditions += " AND FCH_IMPORTE IS NULL";
        } else if (this.getFchImporte() != null) {
            conditions += " AND FCH_IMPORTE = ?";
            values.add(this.getFchImporte());
        }

        if (this.getFchConcepto() != null && "null".equals(this.getFchConcepto())) {
            conditions += " AND FCH_CONCEPTO IS NULL";
        } else if (this.getFchConcepto() != null) {
            conditions += " AND FCH_CONCEPTO = ?";
            values.add(this.getFchConcepto());
        }

        if (this.getFchObservaciones() != null && "null".equals(this.getFchObservaciones())) {
            conditions += " AND FCH_OBSERVACIONES IS NULL";
        } else if (this.getFchObservaciones() != null) {
            conditions += " AND FCH_OBSERVACIONES = ?";
            values.add(this.getFchObservaciones());
        }

        if (this.getFchCuenta() != null && "null".equals(this.getFchCuenta())) {
            conditions += " AND FCH_CUENTA IS NULL";
        } else if (this.getFchCuenta() != null) {
            conditions += " AND FCH_CUENTA = ?";
            values.add(this.getFchCuenta());
        }

        if (this.getFchBanco() != null && "null".equals(this.getFchBanco())) {
            conditions += " AND FCH_BANCO IS NULL";
        } else if (this.getFchBanco() != null) {
            conditions += " AND FCH_BANCO = ?";
            values.add(this.getFchBanco());
        }

        if (this.getFchSucursal() != null && this.getFchSucursal().longValue() == -999) {
            conditions += " AND FCH_SUCURSAL IS NULL";
        } else if (this.getFchSucursal() != null) {
            conditions += " AND FCH_SUCURSAL = ?";
            values.add(this.getFchSucursal());
        }

        if (this.getFchPlaza() != null && "null".equals(this.getFchPlaza())) {
            conditions += " AND FCH_PLAZA IS NULL";
        } else if (this.getFchPlaza() != null) {
            conditions += " AND FCH_PLAZA = ?";
            values.add(this.getFchPlaza());
        }

        if (this.getFchBeneficiario() != null && "null".equals(this.getFchBeneficiario())) {
            conditions += " AND FCH_BENEFICIARIO IS NULL";
        } else if (this.getFchBeneficiario() != null) {
            conditions += " AND FCH_BENEFICIARIO = ?";
            values.add(this.getFchBeneficiario());
        }

        if (this.getFchRfc() != null && "null".equals(this.getFchRfc())) {
            conditions += " AND FCH_RFC IS NULL";
        } else if (this.getFchRfc() != null) {
            conditions += " AND FCH_RFC = ?";
            values.add(this.getFchRfc());
        }

        if (this.getFchPais() != null && "null".equals(this.getFchPais())) {
            conditions += " AND FCH_PAIS IS NULL";
        } else if (this.getFchPais() != null) {
            conditions += " AND FCH_PAIS = ?";
            values.add(this.getFchPais());
        }

        if (this.getFchDetalleInstru() != null && "null".equals(this.getFchDetalleInstru())) {
            conditions += " AND FCH_DETALLE_INSTRU IS NULL";
        } else if (this.getFchDetalleInstru() != null) {
            conditions += " AND FCH_DETALLE_INSTRU = ?";
            values.add(this.getFchDetalleInstru());
        }

        if (this.getFchFechaSesion() != null && "null".equals(this.getFchFechaSesion())) {
            conditions += " AND FCH_FECHA_SESION IS NULL";
        } else if (this.getFchFechaSesion() != null) {
            conditions += " AND FCH_FECHA_SESION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFchFechaSesion());
        }

        if (this.getFchTipoSesion() != null && "null".equals(this.getFchTipoSesion())) {
            conditions += " AND FCH_TIPO_SESION IS NULL";
        } else if (this.getFchTipoSesion() != null) {
            conditions += " AND FCH_TIPO_SESION = ?";
            values.add(this.getFchTipoSesion());
        }

        if (this.getFchAcuerdoId() != null && "null".equals(this.getFchAcuerdoId())) {
            conditions += " AND FCH_ACUERDO_ID IS NULL";
        } else if (this.getFchAcuerdoId() != null) {
            conditions += " AND FCH_ACUERDO_ID = ?";
            values.add(this.getFchAcuerdoId());
        }

        if (this.getFchStatusInstruc() != null && "null".equals(this.getFchStatusInstruc())) {
            conditions += " AND FCH_STATUS_INSTRUC IS NULL";
        } else if (this.getFchStatusInstruc() != null) {
            conditions += " AND FCH_STATUS_INSTRUC = ?";
            values.add(this.getFchStatusInstruc());
        }

        if (this.getFchStatusContabilidad() != null && "null".equals(this.getFchStatusContabilidad())) {
            conditions += " AND FCH_STATUS_CONTABILIDAD IS NULL";
        } else if (this.getFchStatusContabilidad() != null) {
            conditions += " AND FCH_STATUS_CONTABILIDAD = ?";
            values.add(this.getFchStatusContabilidad());
        }

        if (this.getFchHoraTransac() != null && this.getFchHoraTransac().longValue() == -999) {
            conditions += " AND FCH_HORA_TRANSAC IS NULL";
        } else if (this.getFchHoraTransac() != null) {
            conditions += " AND FCH_HORA_TRANSAC = ?";
            values.add(this.getFchHoraTransac());
        }

        if (this.getFchMinTransac() != null && this.getFchMinTransac().longValue() == -999) {
            conditions += " AND FCH_MIN_TRANSAC IS NULL";
        } else if (this.getFchMinTransac() != null) {
            conditions += " AND FCH_MIN_TRANSAC = ?";
            values.add(this.getFchMinTransac());
        }

        if (this.getFchNomUsuario() != null && "null".equals(this.getFchNomUsuario())) {
            conditions += " AND FCH_NOM_USUARIO IS NULL";
        } else if (this.getFchNomUsuario() != null) {
            conditions += " AND FCH_NOM_USUARIO = ?";
            values.add(this.getFchNomUsuario());
        }

        if (this.getFchTipoPersona() != null && "null".equals(this.getFchTipoPersona())) {
            conditions += " AND FCH_TIPO_PERSONA IS NULL";
        } else if (this.getFchTipoPersona() != null) {
            conditions += " AND FCH_TIPO_PERSONA = ?";
            values.add(this.getFchTipoPersona());
        }

        if (this.getFchNombrePersona() != null && "null".equals(this.getFchNombrePersona())) {
            conditions += " AND FCH_NOMBRE_PERSONA IS NULL";
        } else if (this.getFchNombrePersona() != null) {
            conditions += " AND FCH_NOMBRE_PERSONA = ?";
            values.add(this.getFchNombrePersona());
        }

        if (this.getFchMonCtoInvOrg() != null && "null".equals(this.getFchMonCtoInvOrg())) {
            conditions += " AND FCH_MON_CTO_INV_ORG IS NULL";
        } else if (this.getFchMonCtoInvOrg() != null) {
            conditions += " AND FCH_MON_CTO_INV_ORG = ?";
            values.add(this.getFchMonCtoInvOrg());
        }

        if (this.getFchMonCtoInvDes() != null && "null".equals(this.getFchMonCtoInvDes())) {
            conditions += " AND FCH_MON_CTO_INV_DES IS NULL";
        } else if (this.getFchMonCtoInvDes() != null) {
            conditions += " AND FCH_MON_CTO_INV_DES = ?";
            values.add(this.getFchMonCtoInvDes());
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
        String sql = "UPDATE FICHAUNICA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCH_FOLIO_OPERA = ?";
        pkValues.add(this.getFchFolioOpera());
        conditions += " AND FCH_NUM_CONTRATO = ?";
        pkValues.add(this.getFchNumContrato());
        fields += " FCH_TIPO_INSTRU = ?, ";
        values.add(this.getFchTipoInstru());
        fields += " FCH_FECHA_OPERA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFchFechaOpera());
        conditions += " AND FCH_PERIODO_AL = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFchPeriodoAl());
        fields += " FCH_CTO_INV_ORG = ?, ";
        values.add(this.getFchCtoInvOrg());
        fields += " FCH_INSTRUME_ORG = ?, ";
        values.add(this.getFchInstrumeOrg());
        fields += " FCH_CTO_INV_DES = ?, ";
        values.add(this.getFchCtoInvDes());
        fields += " FCH_INSTRUME_DES = ?, ";
        values.add(this.getFchInstrumeDes());
        conditions += " AND FCH_PERIODO_DEL = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFchPeriodoDel());
        fields += " FCH_IMPORTE = ?, ";
        values.add(this.getFchImporte());
        fields += " FCH_CONCEPTO = ?, ";
        values.add(this.getFchConcepto());
        fields += " FCH_OBSERVACIONES = ?, ";
        values.add(this.getFchObservaciones());
        fields += " FCH_CUENTA = ?, ";
        values.add(this.getFchCuenta());
        fields += " FCH_BANCO = ?, ";
        values.add(this.getFchBanco());
        fields += " FCH_SUCURSAL = ?, ";
        values.add(this.getFchSucursal());
        fields += " FCH_PLAZA = ?, ";
        values.add(this.getFchPlaza());
        fields += " FCH_BENEFICIARIO = ?, ";
        values.add(this.getFchBeneficiario());
        fields += " FCH_RFC = ?, ";
        values.add(this.getFchRfc());
        fields += " FCH_PAIS = ?, ";
        values.add(this.getFchPais());
        fields += " FCH_DETALLE_INSTRU = ?, ";
        values.add(this.getFchDetalleInstru());
        fields += " FCH_FECHA_SESION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFchFechaSesion());
        fields += " FCH_TIPO_SESION = ?, ";
        values.add(this.getFchTipoSesion());
        fields += " FCH_ACUERDO_ID = ?, ";
        values.add(this.getFchAcuerdoId());
        fields += " FCH_STATUS_INSTRUC = ?, ";
        values.add(this.getFchStatusInstruc());
        fields += " FCH_STATUS_CONTABILIDAD = ?, ";
        values.add(this.getFchStatusContabilidad());
        fields += " FCH_HORA_TRANSAC = ?, ";
        values.add(this.getFchHoraTransac());
        fields += " FCH_MIN_TRANSAC = ?, ";
        values.add(this.getFchMinTransac());
        fields += " FCH_NOM_USUARIO = ?, ";
        values.add(this.getFchNomUsuario());
        fields += " FCH_TIPO_PERSONA = ?, ";
        values.add(this.getFchTipoPersona());
        fields += " FCH_NOMBRE_PERSONA = ?, ";
        values.add(this.getFchNombrePersona());
        fields += " FCH_MON_CTO_INV_ORG = ?, ";
        values.add(this.getFchMonCtoInvOrg());
        fields += " FCH_MON_CTO_INV_DES = ?, ";
        values.add(this.getFchMonCtoInvDes());
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
        String sql = "INSERT INTO FICHAUNICA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCH_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getFchFolioOpera());

        fields += ", FCH_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFchNumContrato());

        fields += ", FCH_TIPO_INSTRU";
        fieldValues += ", ?";
        values.add(this.getFchTipoInstru());

        fields += ", FCH_FECHA_OPERA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFchFechaOpera());

        fields += ", FCH_PERIODO_AL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFchPeriodoAl());

        fields += ", FCH_CTO_INV_ORG";
        fieldValues += ", ?";
        values.add(this.getFchCtoInvOrg());

        fields += ", FCH_INSTRUME_ORG";
        fieldValues += ", ?";
        values.add(this.getFchInstrumeOrg());

        fields += ", FCH_CTO_INV_DES";
        fieldValues += ", ?";
        values.add(this.getFchCtoInvDes());

        fields += ", FCH_INSTRUME_DES";
        fieldValues += ", ?";
        values.add(this.getFchInstrumeDes());

        fields += ", FCH_PERIODO_DEL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFchPeriodoDel());

        fields += ", FCH_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFchImporte());

        fields += ", FCH_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getFchConcepto());

        fields += ", FCH_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getFchObservaciones());

        fields += ", FCH_CUENTA";
        fieldValues += ", ?";
        values.add(this.getFchCuenta());

        fields += ", FCH_BANCO";
        fieldValues += ", ?";
        values.add(this.getFchBanco());

        fields += ", FCH_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getFchSucursal());

        fields += ", FCH_PLAZA";
        fieldValues += ", ?";
        values.add(this.getFchPlaza());

        fields += ", FCH_BENEFICIARIO";
        fieldValues += ", ?";
        values.add(this.getFchBeneficiario());

        fields += ", FCH_RFC";
        fieldValues += ", ?";
        values.add(this.getFchRfc());

        fields += ", FCH_PAIS";
        fieldValues += ", ?";
        values.add(this.getFchPais());

        fields += ", FCH_DETALLE_INSTRU";
        fieldValues += ", ?";
        values.add(this.getFchDetalleInstru());

        fields += ", FCH_FECHA_SESION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFchFechaSesion());

        fields += ", FCH_TIPO_SESION";
        fieldValues += ", ?";
        values.add(this.getFchTipoSesion());

        fields += ", FCH_ACUERDO_ID";
        fieldValues += ", ?";
        values.add(this.getFchAcuerdoId());

        fields += ", FCH_STATUS_INSTRUC";
        fieldValues += ", ?";
        values.add(this.getFchStatusInstruc());

        fields += ", FCH_STATUS_CONTABILIDAD";
        fieldValues += ", ?";
        values.add(this.getFchStatusContabilidad());

        fields += ", FCH_HORA_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getFchHoraTransac());

        fields += ", FCH_MIN_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getFchMinTransac());

        fields += ", FCH_NOM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFchNomUsuario());

        fields += ", FCH_TIPO_PERSONA";
        fieldValues += ", ?";
        values.add(this.getFchTipoPersona());

        fields += ", FCH_NOMBRE_PERSONA";
        fieldValues += ", ?";
        values.add(this.getFchNombrePersona());

        fields += ", FCH_MON_CTO_INV_ORG";
        fieldValues += ", ?";
        values.add(this.getFchMonCtoInvOrg());

        fields += ", FCH_MON_CTO_INV_DES";
        fieldValues += ", ?";
        values.add(this.getFchMonCtoInvDes());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FICHAUNICA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCH_FOLIO_OPERA = ?";
        values.add(this.getFchFolioOpera());
        conditions += " AND FCH_NUM_CONTRATO = ?";
        values.add(this.getFchNumContrato());
        conditions += " AND FCH_PERIODO_AL = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFchPeriodoAl());
        conditions += " AND FCH_PERIODO_DEL = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFchPeriodoDel());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Fichaunica instance = (Fichaunica) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFchFolioOpera().equals(instance.getFchFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getFchNumContrato().equals(instance.getFchNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFchTipoInstru().equals(instance.getFchTipoInstru()))
            equalObjects = false;
        if (equalObjects && !this.getFchFechaOpera().equals(instance.getFchFechaOpera()))
            equalObjects = false;
        if (equalObjects && !this.getFchPeriodoAl().equals(instance.getFchPeriodoAl()))
            equalObjects = false;
        if (equalObjects && !this.getFchCtoInvOrg().equals(instance.getFchCtoInvOrg()))
            equalObjects = false;
        if (equalObjects && !this.getFchInstrumeOrg().equals(instance.getFchInstrumeOrg()))
            equalObjects = false;
        if (equalObjects && !this.getFchCtoInvDes().equals(instance.getFchCtoInvDes()))
            equalObjects = false;
        if (equalObjects && !this.getFchInstrumeDes().equals(instance.getFchInstrumeDes()))
            equalObjects = false;
        if (equalObjects && !this.getFchPeriodoDel().equals(instance.getFchPeriodoDel()))
            equalObjects = false;
        if (equalObjects && !this.getFchImporte().equals(instance.getFchImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFchConcepto().equals(instance.getFchConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getFchObservaciones().equals(instance.getFchObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getFchCuenta().equals(instance.getFchCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFchBanco().equals(instance.getFchBanco()))
            equalObjects = false;
        if (equalObjects && !this.getFchSucursal().equals(instance.getFchSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getFchPlaza().equals(instance.getFchPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getFchBeneficiario().equals(instance.getFchBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getFchRfc().equals(instance.getFchRfc()))
            equalObjects = false;
        if (equalObjects && !this.getFchPais().equals(instance.getFchPais()))
            equalObjects = false;
        if (equalObjects && !this.getFchDetalleInstru().equals(instance.getFchDetalleInstru()))
            equalObjects = false;
        if (equalObjects && !this.getFchFechaSesion().equals(instance.getFchFechaSesion()))
            equalObjects = false;
        if (equalObjects && !this.getFchTipoSesion().equals(instance.getFchTipoSesion()))
            equalObjects = false;
        if (equalObjects && !this.getFchAcuerdoId().equals(instance.getFchAcuerdoId()))
            equalObjects = false;
        if (equalObjects && !this.getFchStatusInstruc().equals(instance.getFchStatusInstruc()))
            equalObjects = false;
        if (equalObjects && !this.getFchStatusContabilidad().equals(instance.getFchStatusContabilidad()))
            equalObjects = false;
        if (equalObjects && !this.getFchHoraTransac().equals(instance.getFchHoraTransac()))
            equalObjects = false;
        if (equalObjects && !this.getFchMinTransac().equals(instance.getFchMinTransac()))
            equalObjects = false;
        if (equalObjects && !this.getFchNomUsuario().equals(instance.getFchNomUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getFchTipoPersona().equals(instance.getFchTipoPersona()))
            equalObjects = false;
        if (equalObjects && !this.getFchNombrePersona().equals(instance.getFchNombrePersona()))
            equalObjects = false;
        if (equalObjects && !this.getFchMonCtoInvOrg().equals(instance.getFchMonCtoInvOrg()))
            equalObjects = false;
        if (equalObjects && !this.getFchMonCtoInvDes().equals(instance.getFchMonCtoInvDes()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Fichaunica result = new Fichaunica();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFchFolioOpera((BigDecimal) objectData.getData("FCH_FOLIO_OPERA"));
        result.setFchNumContrato((BigDecimal) objectData.getData("FCH_NUM_CONTRATO"));
        result.setFchTipoInstru((String) objectData.getData("FCH_TIPO_INSTRU"));
        result.setFchFechaOpera((String) objectData.getData("FCH_FECHA_OPERA"));
        result.setFchPeriodoAl((String) objectData.getData("FCH_PERIODO_AL"));
        result.setFchCtoInvOrg((BigDecimal) objectData.getData("FCH_CTO_INV_ORG"));
        result.setFchInstrumeOrg((String) objectData.getData("FCH_INSTRUME_ORG"));
        result.setFchCtoInvDes((BigDecimal) objectData.getData("FCH_CTO_INV_DES"));
        result.setFchInstrumeDes((String) objectData.getData("FCH_INSTRUME_DES"));
        result.setFchPeriodoDel((String) objectData.getData("FCH_PERIODO_DEL"));
        result.setFchImporte((BigDecimal) objectData.getData("FCH_IMPORTE"));
        result.setFchConcepto((String) objectData.getData("FCH_CONCEPTO"));
        result.setFchObservaciones((String) objectData.getData("FCH_OBSERVACIONES"));
        result.setFchCuenta((String) objectData.getData("FCH_CUENTA"));
        result.setFchBanco((String) objectData.getData("FCH_BANCO"));
        result.setFchSucursal((BigDecimal) objectData.getData("FCH_SUCURSAL"));
        result.setFchPlaza((String) objectData.getData("FCH_PLAZA"));
        result.setFchBeneficiario((String) objectData.getData("FCH_BENEFICIARIO"));
        result.setFchRfc((String) objectData.getData("FCH_RFC"));
        result.setFchPais((String) objectData.getData("FCH_PAIS"));
        result.setFchDetalleInstru((String) objectData.getData("FCH_DETALLE_INSTRU"));
        result.setFchFechaSesion((String) objectData.getData("FCH_FECHA_SESION"));
        result.setFchTipoSesion((String) objectData.getData("FCH_TIPO_SESION"));
        result.setFchAcuerdoId((String) objectData.getData("FCH_ACUERDO_ID"));
        result.setFchStatusInstruc((String) objectData.getData("FCH_STATUS_INSTRUC"));
        result.setFchStatusContabilidad((String) objectData.getData("FCH_STATUS_CONTABILIDAD"));
        result.setFchHoraTransac((BigDecimal) objectData.getData("FCH_HORA_TRANSAC"));
        result.setFchMinTransac((BigDecimal) objectData.getData("FCH_MIN_TRANSAC"));
        result.setFchNomUsuario((String) objectData.getData("FCH_NOM_USUARIO"));
        result.setFchTipoPersona((String) objectData.getData("FCH_TIPO_PERSONA"));
        result.setFchNombrePersona((String) objectData.getData("FCH_NOMBRE_PERSONA"));
        result.setFchMonCtoInvOrg((String) objectData.getData("FCH_MON_CTO_INV_ORG"));
        result.setFchMonCtoInvDes((String) objectData.getData("FCH_MON_CTO_INV_DES"));

        return result;

    }

}
