package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "APLICON_PK", columns = { "APC_SISTEMA", "APC_AREA", "APC_ANO", "APC_MES", "APC_DIA", "APC_TIPO_POLIZA", "APC_POLIZA", "APC_SECUENCIAL" },
            sequences = { "MANUAL" })
public class Aplicon extends DomainObject {

    BigDecimal apcSistema = null;
    BigDecimal apcArea = null;
    BigDecimal apcAno = null;
    BigDecimal apcMes = null;
    BigDecimal apcDia = null;
    String apcTipoPoliza = null;
    BigDecimal apcPoliza = null;
    BigDecimal apcSecuencial = null;
    BigDecimal apcMoneda = null;
    BigDecimal apcConcepto = null;
    BigDecimal apcOperacion = null;
    BigDecimal apcEnteCargo = null;
    BigDecimal apcTipoEnteCa = null;
    BigDecimal apcEnteAbono = null;
    BigDecimal apcTipoEnteAb = null;
    String apcSigno = null;
    BigDecimal apcImpMe = null;
    BigDecimal apcImpMn = null;
    String apcTipoIniCo = null;
    BigDecimal apcNumIniCo = null;
    BigDecimal apcTipoDeuacre = null;
    BigDecimal apcNumDeuacre = null;
    String apcDependencia = null;
    BigDecimal apcMda5000Car = null;
    BigDecimal apcMda5000Abo = null;
    BigDecimal apcCentro = null;
    BigDecimal apcSubcentro = null;
    BigDecimal apcSucursal1503 = null;
    BigDecimal apcFolio = null;
    BigDecimal apcSucursalOrigen = null;
    BigDecimal apcProducto = null;
    BigDecimal apcSubproducto = null;
    BigDecimal apcFiller = null;
    BigDecimal apcFolioOper = null;

    public Aplicon() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcSistema(BigDecimal apcSistema) {
        this.apcSistema = apcSistema;
    }

    public BigDecimal getApcSistema() {
        return this.apcSistema;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcArea(BigDecimal apcArea) {
        this.apcArea = apcArea;
    }

    public BigDecimal getApcArea() {
        return this.apcArea;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApcAno(BigDecimal apcAno) {
        this.apcAno = apcAno;
    }

    public BigDecimal getApcAno() {
        return this.apcAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcMes(BigDecimal apcMes) {
        this.apcMes = apcMes;
    }

    public BigDecimal getApcMes() {
        return this.apcMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcDia(BigDecimal apcDia) {
        this.apcDia = apcDia;
    }

    public BigDecimal getApcDia() {
        return this.apcDia;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setApcTipoPoliza(String apcTipoPoliza) {
        this.apcTipoPoliza = apcTipoPoliza;
    }

    public String getApcTipoPoliza() {
        return this.apcTipoPoliza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setApcPoliza(BigDecimal apcPoliza) {
        this.apcPoliza = apcPoliza;
    }

    public BigDecimal getApcPoliza() {
        return this.apcPoliza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setApcSecuencial(BigDecimal apcSecuencial) {
        this.apcSecuencial = apcSecuencial;
    }

    public BigDecimal getApcSecuencial() {
        return this.apcSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApcMoneda(BigDecimal apcMoneda) {
        this.apcMoneda = apcMoneda;
    }

    public BigDecimal getApcMoneda() {
        return this.apcMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setApcConcepto(BigDecimal apcConcepto) {
        this.apcConcepto = apcConcepto;
    }

    public BigDecimal getApcConcepto() {
        return this.apcConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcOperacion(BigDecimal apcOperacion) {
        this.apcOperacion = apcOperacion;
    }

    public BigDecimal getApcOperacion() {
        return this.apcOperacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setApcEnteCargo(BigDecimal apcEnteCargo) {
        this.apcEnteCargo = apcEnteCargo;
    }

    public BigDecimal getApcEnteCargo() {
        return this.apcEnteCargo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setApcTipoEnteCa(BigDecimal apcTipoEnteCa) {
        this.apcTipoEnteCa = apcTipoEnteCa;
    }

    public BigDecimal getApcTipoEnteCa() {
        return this.apcTipoEnteCa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setApcEnteAbono(BigDecimal apcEnteAbono) {
        this.apcEnteAbono = apcEnteAbono;
    }

    public BigDecimal getApcEnteAbono() {
        return this.apcEnteAbono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setApcTipoEnteAb(BigDecimal apcTipoEnteAb) {
        this.apcTipoEnteAb = apcTipoEnteAb;
    }

    public BigDecimal getApcTipoEnteAb() {
        return this.apcTipoEnteAb;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setApcSigno(String apcSigno) {
        this.apcSigno = apcSigno;
    }

    public String getApcSigno() {
        return this.apcSigno;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 15, scale = 0, javaClass = BigDecimal.class)
    public void setApcImpMe(BigDecimal apcImpMe) {
        this.apcImpMe = apcImpMe;
    }

    public BigDecimal getApcImpMe() {
        return this.apcImpMe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 15, scale = 0, javaClass = BigDecimal.class)
    public void setApcImpMn(BigDecimal apcImpMn) {
        this.apcImpMn = apcImpMn;
    }

    public BigDecimal getApcImpMn() {
        return this.apcImpMn;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setApcTipoIniCo(String apcTipoIniCo) {
        this.apcTipoIniCo = apcTipoIniCo;
    }

    public String getApcTipoIniCo() {
        return this.apcTipoIniCo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setApcNumIniCo(BigDecimal apcNumIniCo) {
        this.apcNumIniCo = apcNumIniCo;
    }

    public BigDecimal getApcNumIniCo() {
        return this.apcNumIniCo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setApcTipoDeuacre(BigDecimal apcTipoDeuacre) {
        this.apcTipoDeuacre = apcTipoDeuacre;
    }

    public BigDecimal getApcTipoDeuacre() {
        return this.apcTipoDeuacre;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setApcNumDeuacre(BigDecimal apcNumDeuacre) {
        this.apcNumDeuacre = apcNumDeuacre;
    }

    public BigDecimal getApcNumDeuacre() {
        return this.apcNumDeuacre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setApcDependencia(String apcDependencia) {
        this.apcDependencia = apcDependencia;
    }

    public String getApcDependencia() {
        return this.apcDependencia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApcMda5000Car(BigDecimal apcMda5000Car) {
        this.apcMda5000Car = apcMda5000Car;
    }

    public BigDecimal getApcMda5000Car() {
        return this.apcMda5000Car;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApcMda5000Abo(BigDecimal apcMda5000Abo) {
        this.apcMda5000Abo = apcMda5000Abo;
    }

    public BigDecimal getApcMda5000Abo() {
        return this.apcMda5000Abo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcCentro(BigDecimal apcCentro) {
        this.apcCentro = apcCentro;
    }

    public BigDecimal getApcCentro() {
        return this.apcCentro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcSubcentro(BigDecimal apcSubcentro) {
        this.apcSubcentro = apcSubcentro;
    }

    public BigDecimal getApcSubcentro() {
        return this.apcSubcentro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcSucursal1503(BigDecimal apcSucursal1503) {
        this.apcSucursal1503 = apcSucursal1503;
    }

    public BigDecimal getApcSucursal1503() {
        return this.apcSucursal1503;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setApcFolio(BigDecimal apcFolio) {
        this.apcFolio = apcFolio;
    }

    public BigDecimal getApcFolio() {
        return this.apcFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcSucursalOrigen(BigDecimal apcSucursalOrigen) {
        this.apcSucursalOrigen = apcSucursalOrigen;
    }

    public BigDecimal getApcSucursalOrigen() {
        return this.apcSucursalOrigen;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcProducto(BigDecimal apcProducto) {
        this.apcProducto = apcProducto;
    }

    public BigDecimal getApcProducto() {
        return this.apcProducto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApcSubproducto(BigDecimal apcSubproducto) {
        this.apcSubproducto = apcSubproducto;
    }

    public BigDecimal getApcSubproducto() {
        return this.apcSubproducto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 7, scale = 0, javaClass = BigDecimal.class)
    public void setApcFiller(BigDecimal apcFiller) {
        this.apcFiller = apcFiller;
    }

    public BigDecimal getApcFiller() {
        return this.apcFiller;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setApcFolioOper(BigDecimal apcFolioOper) {
        this.apcFolioOper = apcFolioOper;
    }

    public BigDecimal getApcFolioOper() {
        return this.apcFolioOper;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM APLICON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApcSistema() != null && this.getApcSistema().longValue() == -999) {
            conditions += " AND APC_SISTEMA IS NULL";
        } else if (this.getApcSistema() != null) {
            conditions += " AND APC_SISTEMA = ?";
            values.add(this.getApcSistema());
        }

        if (this.getApcArea() != null && this.getApcArea().longValue() == -999) {
            conditions += " AND APC_AREA IS NULL";
        } else if (this.getApcArea() != null) {
            conditions += " AND APC_AREA = ?";
            values.add(this.getApcArea());
        }

        if (this.getApcAno() != null && this.getApcAno().longValue() == -999) {
            conditions += " AND APC_ANO IS NULL";
        } else if (this.getApcAno() != null) {
            conditions += " AND APC_ANO = ?";
            values.add(this.getApcAno());
        }

        if (this.getApcMes() != null && this.getApcMes().longValue() == -999) {
            conditions += " AND APC_MES IS NULL";
        } else if (this.getApcMes() != null) {
            conditions += " AND APC_MES = ?";
            values.add(this.getApcMes());
        }

        if (this.getApcDia() != null && this.getApcDia().longValue() == -999) {
            conditions += " AND APC_DIA IS NULL";
        } else if (this.getApcDia() != null) {
            conditions += " AND APC_DIA = ?";
            values.add(this.getApcDia());
        }

        if (this.getApcTipoPoliza() != null && "null".equals(this.getApcTipoPoliza())) {
            conditions += " AND APC_TIPO_POLIZA IS NULL";
        } else if (this.getApcTipoPoliza() != null) {
            conditions += " AND APC_TIPO_POLIZA = ?";
            values.add(this.getApcTipoPoliza());
        }

        if (this.getApcPoliza() != null && this.getApcPoliza().longValue() == -999) {
            conditions += " AND APC_POLIZA IS NULL";
        } else if (this.getApcPoliza() != null) {
            conditions += " AND APC_POLIZA = ?";
            values.add(this.getApcPoliza());
        }

        if (this.getApcSecuencial() != null && this.getApcSecuencial().longValue() == -999) {
            conditions += " AND APC_SECUENCIAL IS NULL";
        } else if (this.getApcSecuencial() != null) {
            conditions += " AND APC_SECUENCIAL = ?";
            values.add(this.getApcSecuencial());
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
        String sql = "SELECT * FROM APLICON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApcSistema() != null && this.getApcSistema().longValue() == -999) {
            conditions += " AND APC_SISTEMA IS NULL";
        } else if (this.getApcSistema() != null) {
            conditions += " AND APC_SISTEMA = ?";
            values.add(this.getApcSistema());
        }

        if (this.getApcArea() != null && this.getApcArea().longValue() == -999) {
            conditions += " AND APC_AREA IS NULL";
        } else if (this.getApcArea() != null) {
            conditions += " AND APC_AREA = ?";
            values.add(this.getApcArea());
        }

        if (this.getApcAno() != null && this.getApcAno().longValue() == -999) {
            conditions += " AND APC_ANO IS NULL";
        } else if (this.getApcAno() != null) {
            conditions += " AND APC_ANO = ?";
            values.add(this.getApcAno());
        }

        if (this.getApcMes() != null && this.getApcMes().longValue() == -999) {
            conditions += " AND APC_MES IS NULL";
        } else if (this.getApcMes() != null) {
            conditions += " AND APC_MES = ?";
            values.add(this.getApcMes());
        }

        if (this.getApcDia() != null && this.getApcDia().longValue() == -999) {
            conditions += " AND APC_DIA IS NULL";
        } else if (this.getApcDia() != null) {
            conditions += " AND APC_DIA = ?";
            values.add(this.getApcDia());
        }

        if (this.getApcTipoPoliza() != null && "null".equals(this.getApcTipoPoliza())) {
            conditions += " AND APC_TIPO_POLIZA IS NULL";
        } else if (this.getApcTipoPoliza() != null) {
            conditions += " AND APC_TIPO_POLIZA = ?";
            values.add(this.getApcTipoPoliza());
        }

        if (this.getApcPoliza() != null && this.getApcPoliza().longValue() == -999) {
            conditions += " AND APC_POLIZA IS NULL";
        } else if (this.getApcPoliza() != null) {
            conditions += " AND APC_POLIZA = ?";
            values.add(this.getApcPoliza());
        }

        if (this.getApcSecuencial() != null && this.getApcSecuencial().longValue() == -999) {
            conditions += " AND APC_SECUENCIAL IS NULL";
        } else if (this.getApcSecuencial() != null) {
            conditions += " AND APC_SECUENCIAL = ?";
            values.add(this.getApcSecuencial());
        }

        if (this.getApcMoneda() != null && this.getApcMoneda().longValue() == -999) {
            conditions += " AND APC_MONEDA IS NULL";
        } else if (this.getApcMoneda() != null) {
            conditions += " AND APC_MONEDA = ?";
            values.add(this.getApcMoneda());
        }

        if (this.getApcConcepto() != null && this.getApcConcepto().longValue() == -999) {
            conditions += " AND APC_CONCEPTO IS NULL";
        } else if (this.getApcConcepto() != null) {
            conditions += " AND APC_CONCEPTO = ?";
            values.add(this.getApcConcepto());
        }

        if (this.getApcOperacion() != null && this.getApcOperacion().longValue() == -999) {
            conditions += " AND APC_OPERACION IS NULL";
        } else if (this.getApcOperacion() != null) {
            conditions += " AND APC_OPERACION = ?";
            values.add(this.getApcOperacion());
        }

        if (this.getApcEnteCargo() != null && this.getApcEnteCargo().longValue() == -999) {
            conditions += " AND APC_ENTE_CARGO IS NULL";
        } else if (this.getApcEnteCargo() != null) {
            conditions += " AND APC_ENTE_CARGO = ?";
            values.add(this.getApcEnteCargo());
        }

        if (this.getApcTipoEnteCa() != null && this.getApcTipoEnteCa().longValue() == -999) {
            conditions += " AND APC_TIPO_ENTE_CA IS NULL";
        } else if (this.getApcTipoEnteCa() != null) {
            conditions += " AND APC_TIPO_ENTE_CA = ?";
            values.add(this.getApcTipoEnteCa());
        }

        if (this.getApcEnteAbono() != null && this.getApcEnteAbono().longValue() == -999) {
            conditions += " AND APC_ENTE_ABONO IS NULL";
        } else if (this.getApcEnteAbono() != null) {
            conditions += " AND APC_ENTE_ABONO = ?";
            values.add(this.getApcEnteAbono());
        }

        if (this.getApcTipoEnteAb() != null && this.getApcTipoEnteAb().longValue() == -999) {
            conditions += " AND APC_TIPO_ENTE_AB IS NULL";
        } else if (this.getApcTipoEnteAb() != null) {
            conditions += " AND APC_TIPO_ENTE_AB = ?";
            values.add(this.getApcTipoEnteAb());
        }

        if (this.getApcSigno() != null && "null".equals(this.getApcSigno())) {
            conditions += " AND APC_SIGNO IS NULL";
        } else if (this.getApcSigno() != null) {
            conditions += " AND APC_SIGNO = ?";
            values.add(this.getApcSigno());
        }

        if (this.getApcImpMe() != null && this.getApcImpMe().longValue() == -999) {
            conditions += " AND APC_IMP_ME IS NULL";
        } else if (this.getApcImpMe() != null) {
            conditions += " AND APC_IMP_ME = ?";
            values.add(this.getApcImpMe());
        }

        if (this.getApcImpMn() != null && this.getApcImpMn().longValue() == -999) {
            conditions += " AND APC_IMP_MN IS NULL";
        } else if (this.getApcImpMn() != null) {
            conditions += " AND APC_IMP_MN = ?";
            values.add(this.getApcImpMn());
        }

        if (this.getApcTipoIniCo() != null && "null".equals(this.getApcTipoIniCo())) {
            conditions += " AND APC_TIPO_INI_CO IS NULL";
        } else if (this.getApcTipoIniCo() != null) {
            conditions += " AND APC_TIPO_INI_CO = ?";
            values.add(this.getApcTipoIniCo());
        }

        if (this.getApcNumIniCo() != null && this.getApcNumIniCo().longValue() == -999) {
            conditions += " AND APC_NUM_INI_CO IS NULL";
        } else if (this.getApcNumIniCo() != null) {
            conditions += " AND APC_NUM_INI_CO = ?";
            values.add(this.getApcNumIniCo());
        }

        if (this.getApcTipoDeuacre() != null && this.getApcTipoDeuacre().longValue() == -999) {
            conditions += " AND APC_TIPO_DEUACRE IS NULL";
        } else if (this.getApcTipoDeuacre() != null) {
            conditions += " AND APC_TIPO_DEUACRE = ?";
            values.add(this.getApcTipoDeuacre());
        }

        if (this.getApcNumDeuacre() != null && this.getApcNumDeuacre().longValue() == -999) {
            conditions += " AND APC_NUM_DEUACRE IS NULL";
        } else if (this.getApcNumDeuacre() != null) {
            conditions += " AND APC_NUM_DEUACRE = ?";
            values.add(this.getApcNumDeuacre());
        }

        if (this.getApcDependencia() != null && "null".equals(this.getApcDependencia())) {
            conditions += " AND APC_DEPENDENCIA IS NULL";
        } else if (this.getApcDependencia() != null) {
            conditions += " AND APC_DEPENDENCIA = ?";
            values.add(this.getApcDependencia());
        }

        if (this.getApcMda5000Car() != null && this.getApcMda5000Car().longValue() == -999) {
            conditions += " AND APC_MDA_5000_CAR IS NULL";
        } else if (this.getApcMda5000Car() != null) {
            conditions += " AND APC_MDA_5000_CAR = ?";
            values.add(this.getApcMda5000Car());
        }

        if (this.getApcMda5000Abo() != null && this.getApcMda5000Abo().longValue() == -999) {
            conditions += " AND APC_MDA_5000_ABO IS NULL";
        } else if (this.getApcMda5000Abo() != null) {
            conditions += " AND APC_MDA_5000_ABO = ?";
            values.add(this.getApcMda5000Abo());
        }

        if (this.getApcCentro() != null && this.getApcCentro().longValue() == -999) {
            conditions += " AND APC_CENTRO IS NULL";
        } else if (this.getApcCentro() != null) {
            conditions += " AND APC_CENTRO = ?";
            values.add(this.getApcCentro());
        }

        if (this.getApcSubcentro() != null && this.getApcSubcentro().longValue() == -999) {
            conditions += " AND APC_SUBCENTRO IS NULL";
        } else if (this.getApcSubcentro() != null) {
            conditions += " AND APC_SUBCENTRO = ?";
            values.add(this.getApcSubcentro());
        }

        if (this.getApcSucursal1503() != null && this.getApcSucursal1503().longValue() == -999) {
            conditions += " AND APC_SUCURSAL_1503 IS NULL";
        } else if (this.getApcSucursal1503() != null) {
            conditions += " AND APC_SUCURSAL_1503 = ?";
            values.add(this.getApcSucursal1503());
        }

        if (this.getApcFolio() != null && this.getApcFolio().longValue() == -999) {
            conditions += " AND APC_FOLIO IS NULL";
        } else if (this.getApcFolio() != null) {
            conditions += " AND APC_FOLIO = ?";
            values.add(this.getApcFolio());
        }

        if (this.getApcSucursalOrigen() != null && this.getApcSucursalOrigen().longValue() == -999) {
            conditions += " AND APC_SUCURSAL_ORIGEN IS NULL";
        } else if (this.getApcSucursalOrigen() != null) {
            conditions += " AND APC_SUCURSAL_ORIGEN = ?";
            values.add(this.getApcSucursalOrigen());
        }

        if (this.getApcProducto() != null && this.getApcProducto().longValue() == -999) {
            conditions += " AND APC_PRODUCTO IS NULL";
        } else if (this.getApcProducto() != null) {
            conditions += " AND APC_PRODUCTO = ?";
            values.add(this.getApcProducto());
        }

        if (this.getApcSubproducto() != null && this.getApcSubproducto().longValue() == -999) {
            conditions += " AND APC_SUBPRODUCTO IS NULL";
        } else if (this.getApcSubproducto() != null) {
            conditions += " AND APC_SUBPRODUCTO = ?";
            values.add(this.getApcSubproducto());
        }

        if (this.getApcFiller() != null && this.getApcFiller().longValue() == -999) {
            conditions += " AND APC_FILLER IS NULL";
        } else if (this.getApcFiller() != null) {
            conditions += " AND APC_FILLER = ?";
            values.add(this.getApcFiller());
        }

        if (this.getApcFolioOper() != null && this.getApcFolioOper().longValue() == -999) {
            conditions += " AND APC_FOLIO_OPER IS NULL";
        } else if (this.getApcFolioOper() != null) {
            conditions += " AND APC_FOLIO_OPER = ?";
            values.add(this.getApcFolioOper());
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
        String sql = "UPDATE APLICON SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND APC_SISTEMA = ?";
        pkValues.add(this.getApcSistema());
        conditions += " AND APC_AREA = ?";
        pkValues.add(this.getApcArea());
        conditions += " AND APC_ANO = ?";
        pkValues.add(this.getApcAno());
        conditions += " AND APC_MES = ?";
        pkValues.add(this.getApcMes());
        conditions += " AND APC_DIA = ?";
        pkValues.add(this.getApcDia());
        conditions += " AND APC_TIPO_POLIZA = ?";
        pkValues.add(this.getApcTipoPoliza());
        conditions += " AND APC_POLIZA = ?";
        pkValues.add(this.getApcPoliza());
        conditions += " AND APC_SECUENCIAL = ?";
        pkValues.add(this.getApcSecuencial());
        fields += " APC_MONEDA = ?, ";
        values.add(this.getApcMoneda());
        fields += " APC_CONCEPTO = ?, ";
        values.add(this.getApcConcepto());
        fields += " APC_OPERACION = ?, ";
        values.add(this.getApcOperacion());
        fields += " APC_ENTE_CARGO = ?, ";
        values.add(this.getApcEnteCargo());
        fields += " APC_TIPO_ENTE_CA = ?, ";
        values.add(this.getApcTipoEnteCa());
        fields += " APC_ENTE_ABONO = ?, ";
        values.add(this.getApcEnteAbono());
        fields += " APC_TIPO_ENTE_AB = ?, ";
        values.add(this.getApcTipoEnteAb());
        fields += " APC_SIGNO = ?, ";
        values.add(this.getApcSigno());
        fields += " APC_IMP_ME = ?, ";
        values.add(this.getApcImpMe());
        fields += " APC_IMP_MN = ?, ";
        values.add(this.getApcImpMn());
        fields += " APC_TIPO_INI_CO = ?, ";
        values.add(this.getApcTipoIniCo());
        fields += " APC_NUM_INI_CO = ?, ";
        values.add(this.getApcNumIniCo());
        fields += " APC_TIPO_DEUACRE = ?, ";
        values.add(this.getApcTipoDeuacre());
        fields += " APC_NUM_DEUACRE = ?, ";
        values.add(this.getApcNumDeuacre());
        fields += " APC_DEPENDENCIA = ?, ";
        values.add(this.getApcDependencia());
        fields += " APC_MDA_5000_CAR = ?, ";
        values.add(this.getApcMda5000Car());
        fields += " APC_MDA_5000_ABO = ?, ";
        values.add(this.getApcMda5000Abo());
        fields += " APC_CENTRO = ?, ";
        values.add(this.getApcCentro());
        fields += " APC_SUBCENTRO = ?, ";
        values.add(this.getApcSubcentro());
        fields += " APC_SUCURSAL_1503 = ?, ";
        values.add(this.getApcSucursal1503());
        fields += " APC_FOLIO = ?, ";
        values.add(this.getApcFolio());
        fields += " APC_SUCURSAL_ORIGEN = ?, ";
        values.add(this.getApcSucursalOrigen());
        fields += " APC_PRODUCTO = ?, ";
        values.add(this.getApcProducto());
        fields += " APC_SUBPRODUCTO = ?, ";
        values.add(this.getApcSubproducto());
        fields += " APC_FILLER = ?, ";
        values.add(this.getApcFiller());
        fields += " APC_FOLIO_OPER = ?, ";
        values.add(this.getApcFolioOper());
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
        String sql = "INSERT INTO APLICON ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", APC_SISTEMA";
        fieldValues += ", ?";
        values.add(this.getApcSistema());

        fields += ", APC_AREA";
        fieldValues += ", ?";
        values.add(this.getApcArea());

        fields += ", APC_ANO";
        fieldValues += ", ?";
        values.add(this.getApcAno());

        fields += ", APC_MES";
        fieldValues += ", ?";
        values.add(this.getApcMes());

        fields += ", APC_DIA";
        fieldValues += ", ?";
        values.add(this.getApcDia());

        fields += ", APC_TIPO_POLIZA";
        fieldValues += ", ?";
        values.add(this.getApcTipoPoliza());

        fields += ", APC_POLIZA";
        fieldValues += ", ?";
        values.add(this.getApcPoliza());

        fields += ", APC_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getApcSecuencial());

        fields += ", APC_MONEDA";
        fieldValues += ", ?";
        values.add(this.getApcMoneda());

        fields += ", APC_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getApcConcepto());

        fields += ", APC_OPERACION";
        fieldValues += ", ?";
        values.add(this.getApcOperacion());

        fields += ", APC_ENTE_CARGO";
        fieldValues += ", ?";
        values.add(this.getApcEnteCargo());

        fields += ", APC_TIPO_ENTE_CA";
        fieldValues += ", ?";
        values.add(this.getApcTipoEnteCa());

        fields += ", APC_ENTE_ABONO";
        fieldValues += ", ?";
        values.add(this.getApcEnteAbono());

        fields += ", APC_TIPO_ENTE_AB";
        fieldValues += ", ?";
        values.add(this.getApcTipoEnteAb());

        fields += ", APC_SIGNO";
        fieldValues += ", ?";
        values.add(this.getApcSigno());

        fields += ", APC_IMP_ME";
        fieldValues += ", ?";
        values.add(this.getApcImpMe());

        fields += ", APC_IMP_MN";
        fieldValues += ", ?";
        values.add(this.getApcImpMn());

        fields += ", APC_TIPO_INI_CO";
        fieldValues += ", ?";
        values.add(this.getApcTipoIniCo());

        fields += ", APC_NUM_INI_CO";
        fieldValues += ", ?";
        values.add(this.getApcNumIniCo());

        fields += ", APC_TIPO_DEUACRE";
        fieldValues += ", ?";
        values.add(this.getApcTipoDeuacre());

        fields += ", APC_NUM_DEUACRE";
        fieldValues += ", ?";
        values.add(this.getApcNumDeuacre());

        fields += ", APC_DEPENDENCIA";
        fieldValues += ", ?";
        values.add(this.getApcDependencia());

        fields += ", APC_MDA_5000_CAR";
        fieldValues += ", ?";
        values.add(this.getApcMda5000Car());

        fields += ", APC_MDA_5000_ABO";
        fieldValues += ", ?";
        values.add(this.getApcMda5000Abo());

        fields += ", APC_CENTRO";
        fieldValues += ", ?";
        values.add(this.getApcCentro());

        fields += ", APC_SUBCENTRO";
        fieldValues += ", ?";
        values.add(this.getApcSubcentro());

        fields += ", APC_SUCURSAL_1503";
        fieldValues += ", ?";
        values.add(this.getApcSucursal1503());

        fields += ", APC_FOLIO";
        fieldValues += ", ?";
        values.add(this.getApcFolio());

        fields += ", APC_SUCURSAL_ORIGEN";
        fieldValues += ", ?";
        values.add(this.getApcSucursalOrigen());

        fields += ", APC_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getApcProducto());

        fields += ", APC_SUBPRODUCTO";
        fieldValues += ", ?";
        values.add(this.getApcSubproducto());

        fields += ", APC_FILLER";
        fieldValues += ", ?";
        values.add(this.getApcFiller());

        fields += ", APC_FOLIO_OPER";
        fieldValues += ", ?";
        values.add(this.getApcFolioOper());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM APLICON WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND APC_SISTEMA = ?";
        values.add(this.getApcSistema());
        conditions += " AND APC_AREA = ?";
        values.add(this.getApcArea());
        conditions += " AND APC_ANO = ?";
        values.add(this.getApcAno());
        conditions += " AND APC_MES = ?";
        values.add(this.getApcMes());
        conditions += " AND APC_DIA = ?";
        values.add(this.getApcDia());
        conditions += " AND APC_TIPO_POLIZA = ?";
        values.add(this.getApcTipoPoliza());
        conditions += " AND APC_POLIZA = ?";
        values.add(this.getApcPoliza());
        conditions += " AND APC_SECUENCIAL = ?";
        values.add(this.getApcSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Aplicon instance = (Aplicon) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getApcSistema().equals(instance.getApcSistema()))
            equalObjects = false;
        if (equalObjects && !this.getApcArea().equals(instance.getApcArea()))
            equalObjects = false;
        if (equalObjects && !this.getApcAno().equals(instance.getApcAno()))
            equalObjects = false;
        if (equalObjects && !this.getApcMes().equals(instance.getApcMes()))
            equalObjects = false;
        if (equalObjects && !this.getApcDia().equals(instance.getApcDia()))
            equalObjects = false;
        if (equalObjects && !this.getApcTipoPoliza().equals(instance.getApcTipoPoliza()))
            equalObjects = false;
        if (equalObjects && !this.getApcPoliza().equals(instance.getApcPoliza()))
            equalObjects = false;
        if (equalObjects && !this.getApcSecuencial().equals(instance.getApcSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getApcMoneda().equals(instance.getApcMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getApcConcepto().equals(instance.getApcConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getApcOperacion().equals(instance.getApcOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getApcEnteCargo().equals(instance.getApcEnteCargo()))
            equalObjects = false;
        if (equalObjects && !this.getApcTipoEnteCa().equals(instance.getApcTipoEnteCa()))
            equalObjects = false;
        if (equalObjects && !this.getApcEnteAbono().equals(instance.getApcEnteAbono()))
            equalObjects = false;
        if (equalObjects && !this.getApcTipoEnteAb().equals(instance.getApcTipoEnteAb()))
            equalObjects = false;
        if (equalObjects && !this.getApcSigno().equals(instance.getApcSigno()))
            equalObjects = false;
        if (equalObjects && !this.getApcImpMe().equals(instance.getApcImpMe()))
            equalObjects = false;
        if (equalObjects && !this.getApcImpMn().equals(instance.getApcImpMn()))
            equalObjects = false;
        if (equalObjects && !this.getApcTipoIniCo().equals(instance.getApcTipoIniCo()))
            equalObjects = false;
        if (equalObjects && !this.getApcNumIniCo().equals(instance.getApcNumIniCo()))
            equalObjects = false;
        if (equalObjects && !this.getApcTipoDeuacre().equals(instance.getApcTipoDeuacre()))
            equalObjects = false;
        if (equalObjects && !this.getApcNumDeuacre().equals(instance.getApcNumDeuacre()))
            equalObjects = false;
        if (equalObjects && !this.getApcDependencia().equals(instance.getApcDependencia()))
            equalObjects = false;
        if (equalObjects && !this.getApcMda5000Car().equals(instance.getApcMda5000Car()))
            equalObjects = false;
        if (equalObjects && !this.getApcMda5000Abo().equals(instance.getApcMda5000Abo()))
            equalObjects = false;
        if (equalObjects && !this.getApcCentro().equals(instance.getApcCentro()))
            equalObjects = false;
        if (equalObjects && !this.getApcSubcentro().equals(instance.getApcSubcentro()))
            equalObjects = false;
        if (equalObjects && !this.getApcSucursal1503().equals(instance.getApcSucursal1503()))
            equalObjects = false;
        if (equalObjects && !this.getApcFolio().equals(instance.getApcFolio()))
            equalObjects = false;
        if (equalObjects && !this.getApcSucursalOrigen().equals(instance.getApcSucursalOrigen()))
            equalObjects = false;
        if (equalObjects && !this.getApcProducto().equals(instance.getApcProducto()))
            equalObjects = false;
        if (equalObjects && !this.getApcSubproducto().equals(instance.getApcSubproducto()))
            equalObjects = false;
        if (equalObjects && !this.getApcFiller().equals(instance.getApcFiller()))
            equalObjects = false;
        if (equalObjects && !this.getApcFolioOper().equals(instance.getApcFolioOper()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Aplicon result = new Aplicon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setApcSistema((BigDecimal) objectData.getData("APC_SISTEMA"));
        result.setApcArea((BigDecimal) objectData.getData("APC_AREA"));
        result.setApcAno((BigDecimal) objectData.getData("APC_ANO"));
        result.setApcMes((BigDecimal) objectData.getData("APC_MES"));
        result.setApcDia((BigDecimal) objectData.getData("APC_DIA"));
        result.setApcTipoPoliza((String) objectData.getData("APC_TIPO_POLIZA"));
        result.setApcPoliza((BigDecimal) objectData.getData("APC_POLIZA"));
        result.setApcSecuencial((BigDecimal) objectData.getData("APC_SECUENCIAL"));
        result.setApcMoneda((BigDecimal) objectData.getData("APC_MONEDA"));
        result.setApcConcepto((BigDecimal) objectData.getData("APC_CONCEPTO"));
        result.setApcOperacion((BigDecimal) objectData.getData("APC_OPERACION"));
        result.setApcEnteCargo((BigDecimal) objectData.getData("APC_ENTE_CARGO"));
        result.setApcTipoEnteCa((BigDecimal) objectData.getData("APC_TIPO_ENTE_CA"));
        result.setApcEnteAbono((BigDecimal) objectData.getData("APC_ENTE_ABONO"));
        result.setApcTipoEnteAb((BigDecimal) objectData.getData("APC_TIPO_ENTE_AB"));
        result.setApcSigno((String) objectData.getData("APC_SIGNO"));
        result.setApcImpMe((BigDecimal) objectData.getData("APC_IMP_ME"));
        result.setApcImpMn((BigDecimal) objectData.getData("APC_IMP_MN"));
        result.setApcTipoIniCo((String) objectData.getData("APC_TIPO_INI_CO"));
        result.setApcNumIniCo((BigDecimal) objectData.getData("APC_NUM_INI_CO"));
        result.setApcTipoDeuacre((BigDecimal) objectData.getData("APC_TIPO_DEUACRE"));
        result.setApcNumDeuacre((BigDecimal) objectData.getData("APC_NUM_DEUACRE"));
        result.setApcDependencia((String) objectData.getData("APC_DEPENDENCIA"));
        result.setApcMda5000Car((BigDecimal) objectData.getData("APC_MDA_5000_CAR"));
        result.setApcMda5000Abo((BigDecimal) objectData.getData("APC_MDA_5000_ABO"));
        result.setApcCentro((BigDecimal) objectData.getData("APC_CENTRO"));
        result.setApcSubcentro((BigDecimal) objectData.getData("APC_SUBCENTRO"));
        result.setApcSucursal1503((BigDecimal) objectData.getData("APC_SUCURSAL_1503"));
        result.setApcFolio((BigDecimal) objectData.getData("APC_FOLIO"));
        result.setApcSucursalOrigen((BigDecimal) objectData.getData("APC_SUCURSAL_ORIGEN"));
        result.setApcProducto((BigDecimal) objectData.getData("APC_PRODUCTO"));
        result.setApcSubproducto((BigDecimal) objectData.getData("APC_SUBPRODUCTO"));
        result.setApcFiller((BigDecimal) objectData.getData("APC_FILLER"));
        result.setApcFolioOper((BigDecimal) objectData.getData("APC_FOLIO_OPER"));

        return result;

    }

}
