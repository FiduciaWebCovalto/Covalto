package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FRetiroConc extends DomainObject {

    BigDecimal fretIdRetiro = null;
    BigDecimal fretImpRetiro = null;
    String fretFecha = null;
    BigDecimal fretMoneda = null;
    String fretDescripcion = null;
    String sesFecha = null;
    String sesTipo = null;
    String acuId = null;
    BigDecimal fretConcepto = null;
    BigDecimal fretTipoLiquidacion = null;
    String fretStatusRet = null;
    String fretNomBeneficiario = null;
    String fretReferenciaCie = null;
    String fretPaisDomiciliarioSwift = null;
    String fretCiudadDomiciliarioSwift = null;
    String fretPlazaDomiciliarioSwift = null;
    String fretSucursalDomiciliaSwift = null;
    String fretBancoDomiciliarioSwift = null;
    BigDecimal fretCuentaDomiciliarioSwift = null;
    String fretBranchDomiciliarioSwift = null;
    BigDecimal fretMonedaDomiciliarioSwift = null;
    BigDecimal fretImporteMeSwift = null;
    String fretCodigoSaiSwift = null;
    BigDecimal fretTipoAbaIbanSwift = null;
    String fretNomBeneficiSwift = null;
    String fretPaisBeneficiSwift = null;
    String fretCiudadBeneficiSwift = null;
    String fretDimicilioBeneficiSwift = null;
    String fretTelefonoBeneficiSwift = null;
    BigDecimal fretTipoCambioProv = null;
    BigDecimal fretTipoCambioFirme = null;
    String fcbaClabeCba = null;
    String fretConvenioCie = null;
    BigDecimal ffidIdFideicomiso = null;
    BigDecimal fretCtaCheques = null;
    BigDecimal fretSubcta = null;

    public FRetiroConc() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFretIdRetiro(BigDecimal fretIdRetiro) {
        this.fretIdRetiro = fretIdRetiro;
    }

    public BigDecimal getFretIdRetiro() {
        return this.fretIdRetiro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFretImpRetiro(BigDecimal fretImpRetiro) {
        this.fretImpRetiro = fretImpRetiro;
    }

    public BigDecimal getFretImpRetiro() {
        return this.fretImpRetiro;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFretFecha(String fretFecha) {
        this.fretFecha = fretFecha;
    }

    public String getFretFecha() {
        return this.fretFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setFretMoneda(BigDecimal fretMoneda) {
        this.fretMoneda = fretMoneda;
    }

    public BigDecimal getFretMoneda() {
        return this.fretMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretDescripcion(String fretDescripcion) {
        this.fretDescripcion = fretDescripcion;
    }

    public String getFretDescripcion() {
        return this.fretDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setSesFecha(String sesFecha) {
        this.sesFecha = sesFecha;
    }

    public String getSesFecha() {
        return this.sesFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSesTipo(String sesTipo) {
        this.sesTipo = sesTipo;
    }

    public String getSesTipo() {
        return this.sesTipo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuId(String acuId) {
        this.acuId = acuId;
    }

    public String getAcuId() {
        return this.acuId;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFretConcepto(BigDecimal fretConcepto) {
        this.fretConcepto = fretConcepto;
    }

    public BigDecimal getFretConcepto() {
        return this.fretConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFretTipoLiquidacion(BigDecimal fretTipoLiquidacion) {
        this.fretTipoLiquidacion = fretTipoLiquidacion;
    }

    public BigDecimal getFretTipoLiquidacion() {
        return this.fretTipoLiquidacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretStatusRet(String fretStatusRet) {
        this.fretStatusRet = fretStatusRet;
    }

    public String getFretStatusRet() {
        return this.fretStatusRet;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretNomBeneficiario(String fretNomBeneficiario) {
        this.fretNomBeneficiario = fretNomBeneficiario;
    }

    public String getFretNomBeneficiario() {
        return this.fretNomBeneficiario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretReferenciaCie(String fretReferenciaCie) {
        this.fretReferenciaCie = fretReferenciaCie;
    }

    public String getFretReferenciaCie() {
        return this.fretReferenciaCie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretPaisDomiciliarioSwift(String fretPaisDomiciliarioSwift) {
        this.fretPaisDomiciliarioSwift = fretPaisDomiciliarioSwift;
    }

    public String getFretPaisDomiciliarioSwift() {
        return this.fretPaisDomiciliarioSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretCiudadDomiciliarioSwift(String fretCiudadDomiciliarioSwift) {
        this.fretCiudadDomiciliarioSwift = fretCiudadDomiciliarioSwift;
    }

    public String getFretCiudadDomiciliarioSwift() {
        return this.fretCiudadDomiciliarioSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretPlazaDomiciliarioSwift(String fretPlazaDomiciliarioSwift) {
        this.fretPlazaDomiciliarioSwift = fretPlazaDomiciliarioSwift;
    }

    public String getFretPlazaDomiciliarioSwift() {
        return this.fretPlazaDomiciliarioSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretSucursalDomiciliaSwift(String fretSucursalDomiciliaSwift) {
        this.fretSucursalDomiciliaSwift = fretSucursalDomiciliaSwift;
    }

    public String getFretSucursalDomiciliaSwift() {
        return this.fretSucursalDomiciliaSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretBancoDomiciliarioSwift(String fretBancoDomiciliarioSwift) {
        this.fretBancoDomiciliarioSwift = fretBancoDomiciliarioSwift;
    }

    public String getFretBancoDomiciliarioSwift() {
        return this.fretBancoDomiciliarioSwift;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 30, scale = 0, javaClass = BigDecimal.class)
    public void setFretCuentaDomiciliarioSwift(BigDecimal fretCuentaDomiciliarioSwift) {
        this.fretCuentaDomiciliarioSwift = fretCuentaDomiciliarioSwift;
    }

    public BigDecimal getFretCuentaDomiciliarioSwift() {
        return this.fretCuentaDomiciliarioSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretBranchDomiciliarioSwift(String fretBranchDomiciliarioSwift) {
        this.fretBranchDomiciliarioSwift = fretBranchDomiciliarioSwift;
    }

    public String getFretBranchDomiciliarioSwift() {
        return this.fretBranchDomiciliarioSwift;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setFretMonedaDomiciliarioSwift(BigDecimal fretMonedaDomiciliarioSwift) {
        this.fretMonedaDomiciliarioSwift = fretMonedaDomiciliarioSwift;
    }

    public BigDecimal getFretMonedaDomiciliarioSwift() {
        return this.fretMonedaDomiciliarioSwift;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFretImporteMeSwift(BigDecimal fretImporteMeSwift) {
        this.fretImporteMeSwift = fretImporteMeSwift;
    }

    public BigDecimal getFretImporteMeSwift() {
        return this.fretImporteMeSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretCodigoSaiSwift(String fretCodigoSaiSwift) {
        this.fretCodigoSaiSwift = fretCodigoSaiSwift;
    }

    public String getFretCodigoSaiSwift() {
        return this.fretCodigoSaiSwift;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFretTipoAbaIbanSwift(BigDecimal fretTipoAbaIbanSwift) {
        this.fretTipoAbaIbanSwift = fretTipoAbaIbanSwift;
    }

    public BigDecimal getFretTipoAbaIbanSwift() {
        return this.fretTipoAbaIbanSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretNomBeneficiSwift(String fretNomBeneficiSwift) {
        this.fretNomBeneficiSwift = fretNomBeneficiSwift;
    }

    public String getFretNomBeneficiSwift() {
        return this.fretNomBeneficiSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretPaisBeneficiSwift(String fretPaisBeneficiSwift) {
        this.fretPaisBeneficiSwift = fretPaisBeneficiSwift;
    }

    public String getFretPaisBeneficiSwift() {
        return this.fretPaisBeneficiSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretCiudadBeneficiSwift(String fretCiudadBeneficiSwift) {
        this.fretCiudadBeneficiSwift = fretCiudadBeneficiSwift;
    }

    public String getFretCiudadBeneficiSwift() {
        return this.fretCiudadBeneficiSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretDimicilioBeneficiSwift(String fretDimicilioBeneficiSwift) {
        this.fretDimicilioBeneficiSwift = fretDimicilioBeneficiSwift;
    }

    public String getFretDimicilioBeneficiSwift() {
        return this.fretDimicilioBeneficiSwift;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretTelefonoBeneficiSwift(String fretTelefonoBeneficiSwift) {
        this.fretTelefonoBeneficiSwift = fretTelefonoBeneficiSwift;
    }

    public String getFretTelefonoBeneficiSwift() {
        return this.fretTelefonoBeneficiSwift;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFretTipoCambioProv(BigDecimal fretTipoCambioProv) {
        this.fretTipoCambioProv = fretTipoCambioProv;
    }

    public BigDecimal getFretTipoCambioProv() {
        return this.fretTipoCambioProv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFretTipoCambioFirme(BigDecimal fretTipoCambioFirme) {
        this.fretTipoCambioFirme = fretTipoCambioFirme;
    }

    public BigDecimal getFretTipoCambioFirme() {
        return this.fretTipoCambioFirme;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcbaClabeCba(String fcbaClabeCba) {
        this.fcbaClabeCba = fcbaClabeCba;
    }

    public String getFcbaClabeCba() {
        return this.fcbaClabeCba;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFretConvenioCie(String fretConvenioCie) {
        this.fretConvenioCie = fretConvenioCie;
    }

    public String getFretConvenioCie() {
        return this.fretConvenioCie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfidIdFideicomiso(BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return this.ffidIdFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setFretCtaCheques(BigDecimal fretCtaCheques) {
        this.fretCtaCheques = fretCtaCheques;
    }

    public BigDecimal getFretCtaCheques() {
        return this.fretCtaCheques;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setFretSubcta(BigDecimal fretSubcta) {
        this.fretSubcta = fretSubcta;
    }

    public BigDecimal getFretSubcta() {
        return this.fretSubcta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_RETIRO_CONC ";

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
        String sql = "SELECT * FROM F_RETIRO_CONC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFretIdRetiro() != null && this.getFretIdRetiro().longValue() == -999) {
            conditions += " AND FRET_ID_RETIRO IS NULL";
        } else if (this.getFretIdRetiro() != null) {
            conditions += " AND FRET_ID_RETIRO = ?";
            values.add(this.getFretIdRetiro());
        }

        if (this.getFretImpRetiro() != null && this.getFretImpRetiro().longValue() == -999) {
            conditions += " AND FRET_IMP_RETIRO IS NULL";
        } else if (this.getFretImpRetiro() != null) {
            conditions += " AND FRET_IMP_RETIRO = ?";
            values.add(this.getFretImpRetiro());
        }

        if (this.getFretFecha() != null && "null".equals(this.getFretFecha())) {
            conditions += " AND FRET_FECHA IS NULL";
        } else if (this.getFretFecha() != null) {
            conditions += " AND FRET_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFretFecha());
        }

        if (this.getFretMoneda() != null && this.getFretMoneda().longValue() == -999) {
            conditions += " AND FRET_MONEDA IS NULL";
        } else if (this.getFretMoneda() != null) {
            conditions += " AND FRET_MONEDA = ?";
            values.add(this.getFretMoneda());
        }

        if (this.getFretDescripcion() != null && "null".equals(this.getFretDescripcion())) {
            conditions += " AND FRET_DESCRIPCION IS NULL";
        } else if (this.getFretDescripcion() != null) {
            conditions += " AND FRET_DESCRIPCION = ?";
            values.add(this.getFretDescripcion());
        }

        if (this.getSesFecha() != null && "null".equals(this.getSesFecha())) {
            conditions += " AND SES_FECHA IS NULL";
        } else if (this.getSesFecha() != null) {
            conditions += " AND SES_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSesFecha());
        }

        if (this.getSesTipo() != null && "null".equals(this.getSesTipo())) {
            conditions += " AND SES_TIPO IS NULL";
        } else if (this.getSesTipo() != null) {
            conditions += " AND SES_TIPO = ?";
            values.add(this.getSesTipo());
        }

        if (this.getAcuId() != null && "null".equals(this.getAcuId())) {
            conditions += " AND ACU_ID IS NULL";
        } else if (this.getAcuId() != null) {
            conditions += " AND ACU_ID = ?";
            values.add(this.getAcuId());
        }

        if (this.getFretConcepto() != null && this.getFretConcepto().longValue() == -999) {
            conditions += " AND FRET_CONCEPTO IS NULL";
        } else if (this.getFretConcepto() != null) {
            conditions += " AND FRET_CONCEPTO = ?";
            values.add(this.getFretConcepto());
        }

        if (this.getFretTipoLiquidacion() != null && this.getFretTipoLiquidacion().longValue() == -999) {
            conditions += " AND FRET_TIPO_LIQUIDACION IS NULL";
        } else if (this.getFretTipoLiquidacion() != null) {
            conditions += " AND FRET_TIPO_LIQUIDACION = ?";
            values.add(this.getFretTipoLiquidacion());
        }

        if (this.getFretStatusRet() != null && "null".equals(this.getFretStatusRet())) {
            conditions += " AND FRET_STATUS_RET IS NULL";
        } else if (this.getFretStatusRet() != null) {
            conditions += " AND FRET_STATUS_RET = ?";
            values.add(this.getFretStatusRet());
        }

        if (this.getFretNomBeneficiario() != null && "null".equals(this.getFretNomBeneficiario())) {
            conditions += " AND FRET_NOM_BENEFICIARIO IS NULL";
        } else if (this.getFretNomBeneficiario() != null) {
            conditions += " AND FRET_NOM_BENEFICIARIO = ?";
            values.add(this.getFretNomBeneficiario());
        }

        if (this.getFretReferenciaCie() != null && "null".equals(this.getFretReferenciaCie())) {
            conditions += " AND FRET_REFERENCIA_CIE IS NULL";
        } else if (this.getFretReferenciaCie() != null) {
            conditions += " AND FRET_REFERENCIA_CIE = ?";
            values.add(this.getFretReferenciaCie());
        }

        if (this.getFretPaisDomiciliarioSwift() != null && "null".equals(this.getFretPaisDomiciliarioSwift())) {
            conditions += " AND FRET_PAIS_DOMICILIARIO_SWIFT IS NULL";
        } else if (this.getFretPaisDomiciliarioSwift() != null) {
            conditions += " AND FRET_PAIS_DOMICILIARIO_SWIFT = ?";
            values.add(this.getFretPaisDomiciliarioSwift());
        }

        if (this.getFretCiudadDomiciliarioSwift() != null && "null".equals(this.getFretCiudadDomiciliarioSwift())) {
            conditions += " AND FRET_CIUDAD_DOMICILIARIO_SWIFT IS NULL";
        } else if (this.getFretCiudadDomiciliarioSwift() != null) {
            conditions += " AND FRET_CIUDAD_DOMICILIARIO_SWIFT = ?";
            values.add(this.getFretCiudadDomiciliarioSwift());
        }

        if (this.getFretPlazaDomiciliarioSwift() != null && "null".equals(this.getFretPlazaDomiciliarioSwift())) {
            conditions += " AND FRET_PLAZA_DOMICILIARIO_SWIFT IS NULL";
        } else if (this.getFretPlazaDomiciliarioSwift() != null) {
            conditions += " AND FRET_PLAZA_DOMICILIARIO_SWIFT = ?";
            values.add(this.getFretPlazaDomiciliarioSwift());
        }

        if (this.getFretSucursalDomiciliaSwift() != null && "null".equals(this.getFretSucursalDomiciliaSwift())) {
            conditions += " AND FRET_SUCURSAL_DOMICILIA_SWIFT IS NULL";
        } else if (this.getFretSucursalDomiciliaSwift() != null) {
            conditions += " AND FRET_SUCURSAL_DOMICILIA_SWIFT = ?";
            values.add(this.getFretSucursalDomiciliaSwift());
        }

        if (this.getFretBancoDomiciliarioSwift() != null && "null".equals(this.getFretBancoDomiciliarioSwift())) {
            conditions += " AND FRET_BANCO_DOMICILIARIO_SWIFT IS NULL";
        } else if (this.getFretBancoDomiciliarioSwift() != null) {
            conditions += " AND FRET_BANCO_DOMICILIARIO_SWIFT = ?";
            values.add(this.getFretBancoDomiciliarioSwift());
        }

        if (this.getFretCuentaDomiciliarioSwift() != null && this.getFretCuentaDomiciliarioSwift().longValue() == -999) {
            conditions += " AND FRET_CUENTA_DOMICILIARIO_SWIFT IS NULL";
        } else if (this.getFretCuentaDomiciliarioSwift() != null) {
            conditions += " AND FRET_CUENTA_DOMICILIARIO_SWIFT = ?";
            values.add(this.getFretCuentaDomiciliarioSwift());
        }

        if (this.getFretBranchDomiciliarioSwift() != null && "null".equals(this.getFretBranchDomiciliarioSwift())) {
            conditions += " AND FRET_BRANCH_DOMICILIARIO_SWIFT IS NULL";
        } else if (this.getFretBranchDomiciliarioSwift() != null) {
            conditions += " AND FRET_BRANCH_DOMICILIARIO_SWIFT = ?";
            values.add(this.getFretBranchDomiciliarioSwift());
        }

        if (this.getFretMonedaDomiciliarioSwift() != null && this.getFretMonedaDomiciliarioSwift().longValue() == -999) {
            conditions += " AND FRET_MONEDA_DOMICILIARIO_SWIFT IS NULL";
        } else if (this.getFretMonedaDomiciliarioSwift() != null) {
            conditions += " AND FRET_MONEDA_DOMICILIARIO_SWIFT = ?";
            values.add(this.getFretMonedaDomiciliarioSwift());
        }

        if (this.getFretImporteMeSwift() != null && this.getFretImporteMeSwift().longValue() == -999) {
            conditions += " AND FRET_IMPORTE_ME_SWIFT IS NULL";
        } else if (this.getFretImporteMeSwift() != null) {
            conditions += " AND FRET_IMPORTE_ME_SWIFT = ?";
            values.add(this.getFretImporteMeSwift());
        }

        if (this.getFretCodigoSaiSwift() != null && "null".equals(this.getFretCodigoSaiSwift())) {
            conditions += " AND FRET_CODIGO_SAI_SWIFT IS NULL";
        } else if (this.getFretCodigoSaiSwift() != null) {
            conditions += " AND FRET_CODIGO_SAI_SWIFT = ?";
            values.add(this.getFretCodigoSaiSwift());
        }

        if (this.getFretTipoAbaIbanSwift() != null && this.getFretTipoAbaIbanSwift().longValue() == -999) {
            conditions += " AND FRET_TIPO_ABA_IBAN_SWIFT IS NULL";
        } else if (this.getFretTipoAbaIbanSwift() != null) {
            conditions += " AND FRET_TIPO_ABA_IBAN_SWIFT = ?";
            values.add(this.getFretTipoAbaIbanSwift());
        }

        if (this.getFretNomBeneficiSwift() != null && "null".equals(this.getFretNomBeneficiSwift())) {
            conditions += " AND FRET_NOM_BENEFICI_SWIFT IS NULL";
        } else if (this.getFretNomBeneficiSwift() != null) {
            conditions += " AND FRET_NOM_BENEFICI_SWIFT = ?";
            values.add(this.getFretNomBeneficiSwift());
        }

        if (this.getFretPaisBeneficiSwift() != null && "null".equals(this.getFretPaisBeneficiSwift())) {
            conditions += " AND FRET_PAIS_BENEFICI_SWIFT IS NULL";
        } else if (this.getFretPaisBeneficiSwift() != null) {
            conditions += " AND FRET_PAIS_BENEFICI_SWIFT = ?";
            values.add(this.getFretPaisBeneficiSwift());
        }

        if (this.getFretCiudadBeneficiSwift() != null && "null".equals(this.getFretCiudadBeneficiSwift())) {
            conditions += " AND FRET_CIUDAD_BENEFICI_SWIFT IS NULL";
        } else if (this.getFretCiudadBeneficiSwift() != null) {
            conditions += " AND FRET_CIUDAD_BENEFICI_SWIFT = ?";
            values.add(this.getFretCiudadBeneficiSwift());
        }

        if (this.getFretDimicilioBeneficiSwift() != null && "null".equals(this.getFretDimicilioBeneficiSwift())) {
            conditions += " AND FRET_DIMICILIO_BENEFICI_SWIFT IS NULL";
        } else if (this.getFretDimicilioBeneficiSwift() != null) {
            conditions += " AND FRET_DIMICILIO_BENEFICI_SWIFT = ?";
            values.add(this.getFretDimicilioBeneficiSwift());
        }

        if (this.getFretTelefonoBeneficiSwift() != null && "null".equals(this.getFretTelefonoBeneficiSwift())) {
            conditions += " AND FRET_TELEFONO_BENEFICI_SWIFT IS NULL";
        } else if (this.getFretTelefonoBeneficiSwift() != null) {
            conditions += " AND FRET_TELEFONO_BENEFICI_SWIFT = ?";
            values.add(this.getFretTelefonoBeneficiSwift());
        }

        if (this.getFretTipoCambioProv() != null && this.getFretTipoCambioProv().longValue() == -999) {
            conditions += " AND FRET_TIPO_CAMBIO_PROV IS NULL";
        } else if (this.getFretTipoCambioProv() != null) {
            conditions += " AND FRET_TIPO_CAMBIO_PROV = ?";
            values.add(this.getFretTipoCambioProv());
        }

        if (this.getFretTipoCambioFirme() != null && this.getFretTipoCambioFirme().longValue() == -999) {
            conditions += " AND FRET_TIPO_CAMBIO_FIRME IS NULL";
        } else if (this.getFretTipoCambioFirme() != null) {
            conditions += " AND FRET_TIPO_CAMBIO_FIRME = ?";
            values.add(this.getFretTipoCambioFirme());
        }

        if (this.getFcbaClabeCba() != null && "null".equals(this.getFcbaClabeCba())) {
            conditions += " AND FCBA_CLABE_CBA IS NULL";
        } else if (this.getFcbaClabeCba() != null) {
            conditions += " AND FCBA_CLABE_CBA = ?";
            values.add(this.getFcbaClabeCba());
        }

        if (this.getFretConvenioCie() != null && "null".equals(this.getFretConvenioCie())) {
            conditions += " AND FRET_CONVENIO_CIE IS NULL";
        } else if (this.getFretConvenioCie() != null) {
            conditions += " AND FRET_CONVENIO_CIE = ?";
            values.add(this.getFretConvenioCie());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
        }

        if (this.getFretCtaCheques() != null && this.getFretCtaCheques().longValue() == -999) {
            conditions += " AND FRET_CTA_CHEQUES IS NULL";
        } else if (this.getFretCtaCheques() != null) {
            conditions += " AND FRET_CTA_CHEQUES = ?";
            values.add(this.getFretCtaCheques());
        }

        if (this.getFretSubcta() != null && this.getFretSubcta().longValue() == -999) {
            conditions += " AND FRET_SUBCTA IS NULL";
        } else if (this.getFretSubcta() != null) {
            conditions += " AND FRET_SUBCTA = ?";
            values.add(this.getFretSubcta());
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
        String sql = "UPDATE F_RETIRO_CONC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FRET_ID_RETIRO = ?, ";
        values.add(this.getFretIdRetiro());
        fields += " FRET_IMP_RETIRO = ?, ";
        values.add(this.getFretImpRetiro());
        fields += " FRET_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFretFecha());
        fields += " FRET_MONEDA = ?, ";
        values.add(this.getFretMoneda());
        fields += " FRET_DESCRIPCION = ?, ";
        values.add(this.getFretDescripcion());
        fields += " SES_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getSesFecha());
        fields += " SES_TIPO = ?, ";
        values.add(this.getSesTipo());
        fields += " ACU_ID = ?, ";
        values.add(this.getAcuId());
        fields += " FRET_CONCEPTO = ?, ";
        values.add(this.getFretConcepto());
        fields += " FRET_TIPO_LIQUIDACION = ?, ";
        values.add(this.getFretTipoLiquidacion());
        fields += " FRET_STATUS_RET = ?, ";
        values.add(this.getFretStatusRet());
        fields += " FRET_NOM_BENEFICIARIO = ?, ";
        values.add(this.getFretNomBeneficiario());
        fields += " FRET_REFERENCIA_CIE = ?, ";
        values.add(this.getFretReferenciaCie());
        fields += " FRET_PAIS_DOMICILIARIO_SWIFT = ?, ";
        values.add(this.getFretPaisDomiciliarioSwift());
        fields += " FRET_CIUDAD_DOMICILIARIO_SWIFT = ?, ";
        values.add(this.getFretCiudadDomiciliarioSwift());
        fields += " FRET_PLAZA_DOMICILIARIO_SWIFT = ?, ";
        values.add(this.getFretPlazaDomiciliarioSwift());
        fields += " FRET_SUCURSAL_DOMICILIA_SWIFT = ?, ";
        values.add(this.getFretSucursalDomiciliaSwift());
        fields += " FRET_BANCO_DOMICILIARIO_SWIFT = ?, ";
        values.add(this.getFretBancoDomiciliarioSwift());
        fields += " FRET_CUENTA_DOMICILIARIO_SWIFT = ?, ";
        values.add(this.getFretCuentaDomiciliarioSwift());
        fields += " FRET_BRANCH_DOMICILIARIO_SWIFT = ?, ";
        values.add(this.getFretBranchDomiciliarioSwift());
        fields += " FRET_MONEDA_DOMICILIARIO_SWIFT = ?, ";
        values.add(this.getFretMonedaDomiciliarioSwift());
        fields += " FRET_IMPORTE_ME_SWIFT = ?, ";
        values.add(this.getFretImporteMeSwift());
        fields += " FRET_CODIGO_SAI_SWIFT = ?, ";
        values.add(this.getFretCodigoSaiSwift());
        fields += " FRET_TIPO_ABA_IBAN_SWIFT = ?, ";
        values.add(this.getFretTipoAbaIbanSwift());
        fields += " FRET_NOM_BENEFICI_SWIFT = ?, ";
        values.add(this.getFretNomBeneficiSwift());
        fields += " FRET_PAIS_BENEFICI_SWIFT = ?, ";
        values.add(this.getFretPaisBeneficiSwift());
        fields += " FRET_CIUDAD_BENEFICI_SWIFT = ?, ";
        values.add(this.getFretCiudadBeneficiSwift());
        fields += " FRET_DIMICILIO_BENEFICI_SWIFT = ?, ";
        values.add(this.getFretDimicilioBeneficiSwift());
        fields += " FRET_TELEFONO_BENEFICI_SWIFT = ?, ";
        values.add(this.getFretTelefonoBeneficiSwift());
        fields += " FRET_TIPO_CAMBIO_PROV = ?, ";
        values.add(this.getFretTipoCambioProv());
        fields += " FRET_TIPO_CAMBIO_FIRME = ?, ";
        values.add(this.getFretTipoCambioFirme());
        fields += " FCBA_CLABE_CBA = ?, ";
        values.add(this.getFcbaClabeCba());
        fields += " FRET_CONVENIO_CIE = ?, ";
        values.add(this.getFretConvenioCie());
        fields += " FFID_ID_FIDEICOMISO = ?, ";
        values.add(this.getFfidIdFideicomiso());
        fields += " FRET_CTA_CHEQUES = ?, ";
        values.add(this.getFretCtaCheques());
        fields += " FRET_SUBCTA = ?, ";
        values.add(this.getFretSubcta());
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
        String sql = "INSERT INTO F_RETIRO_CONC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRET_ID_RETIRO";
        fieldValues += ", ?";
        values.add(this.getFretIdRetiro());

        fields += ", FRET_IMP_RETIRO";
        fieldValues += ", ?";
        values.add(this.getFretImpRetiro());

        fields += ", FRET_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFretFecha());

        fields += ", FRET_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFretMoneda());

        fields += ", FRET_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFretDescripcion());

        fields += ", SES_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSesFecha());

        fields += ", SES_TIPO";
        fieldValues += ", ?";
        values.add(this.getSesTipo());

        fields += ", ACU_ID";
        fieldValues += ", ?";
        values.add(this.getAcuId());

        fields += ", FRET_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getFretConcepto());

        fields += ", FRET_TIPO_LIQUIDACION";
        fieldValues += ", ?";
        values.add(this.getFretTipoLiquidacion());

        fields += ", FRET_STATUS_RET";
        fieldValues += ", ?";
        values.add(this.getFretStatusRet());

        fields += ", FRET_NOM_BENEFICIARIO";
        fieldValues += ", ?";
        values.add(this.getFretNomBeneficiario());

        fields += ", FRET_REFERENCIA_CIE";
        fieldValues += ", ?";
        values.add(this.getFretReferenciaCie());

        fields += ", FRET_PAIS_DOMICILIARIO_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretPaisDomiciliarioSwift());

        fields += ", FRET_CIUDAD_DOMICILIARIO_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretCiudadDomiciliarioSwift());

        fields += ", FRET_PLAZA_DOMICILIARIO_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretPlazaDomiciliarioSwift());

        fields += ", FRET_SUCURSAL_DOMICILIA_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretSucursalDomiciliaSwift());

        fields += ", FRET_BANCO_DOMICILIARIO_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretBancoDomiciliarioSwift());

        fields += ", FRET_CUENTA_DOMICILIARIO_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretCuentaDomiciliarioSwift());

        fields += ", FRET_BRANCH_DOMICILIARIO_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretBranchDomiciliarioSwift());

        fields += ", FRET_MONEDA_DOMICILIARIO_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretMonedaDomiciliarioSwift());

        fields += ", FRET_IMPORTE_ME_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretImporteMeSwift());

        fields += ", FRET_CODIGO_SAI_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretCodigoSaiSwift());

        fields += ", FRET_TIPO_ABA_IBAN_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretTipoAbaIbanSwift());

        fields += ", FRET_NOM_BENEFICI_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretNomBeneficiSwift());

        fields += ", FRET_PAIS_BENEFICI_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretPaisBeneficiSwift());

        fields += ", FRET_CIUDAD_BENEFICI_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretCiudadBeneficiSwift());

        fields += ", FRET_DIMICILIO_BENEFICI_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretDimicilioBeneficiSwift());

        fields += ", FRET_TELEFONO_BENEFICI_SWIFT";
        fieldValues += ", ?";
        values.add(this.getFretTelefonoBeneficiSwift());

        fields += ", FRET_TIPO_CAMBIO_PROV";
        fieldValues += ", ?";
        values.add(this.getFretTipoCambioProv());

        fields += ", FRET_TIPO_CAMBIO_FIRME";
        fieldValues += ", ?";
        values.add(this.getFretTipoCambioFirme());

        fields += ", FCBA_CLABE_CBA";
        fieldValues += ", ?";
        values.add(this.getFcbaClabeCba());

        fields += ", FRET_CONVENIO_CIE";
        fieldValues += ", ?";
        values.add(this.getFretConvenioCie());

        fields += ", FFID_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFfidIdFideicomiso());

        fields += ", FRET_CTA_CHEQUES";
        fieldValues += ", ?";
        values.add(this.getFretCtaCheques());

        fields += ", FRET_SUBCTA";
        fieldValues += ", ?";
        values.add(this.getFretSubcta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_RETIRO_CONC WHERE ";

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
        FRetiroConc instance = (FRetiroConc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFretIdRetiro().equals(instance.getFretIdRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getFretImpRetiro().equals(instance.getFretImpRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getFretFecha().equals(instance.getFretFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFretMoneda().equals(instance.getFretMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFretDescripcion().equals(instance.getFretDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getSesFecha().equals(instance.getSesFecha()))
            equalObjects = false;
        if (equalObjects && !this.getSesTipo().equals(instance.getSesTipo()))
            equalObjects = false;
        if (equalObjects && !this.getAcuId().equals(instance.getAcuId()))
            equalObjects = false;
        if (equalObjects && !this.getFretConcepto().equals(instance.getFretConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getFretTipoLiquidacion().equals(instance.getFretTipoLiquidacion()))
            equalObjects = false;
        if (equalObjects && !this.getFretStatusRet().equals(instance.getFretStatusRet()))
            equalObjects = false;
        if (equalObjects && !this.getFretNomBeneficiario().equals(instance.getFretNomBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getFretReferenciaCie().equals(instance.getFretReferenciaCie()))
            equalObjects = false;
        if (equalObjects && !this.getFretPaisDomiciliarioSwift().equals(instance.getFretPaisDomiciliarioSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretCiudadDomiciliarioSwift().equals(instance.getFretCiudadDomiciliarioSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretPlazaDomiciliarioSwift().equals(instance.getFretPlazaDomiciliarioSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretSucursalDomiciliaSwift().equals(instance.getFretSucursalDomiciliaSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretBancoDomiciliarioSwift().equals(instance.getFretBancoDomiciliarioSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretCuentaDomiciliarioSwift().equals(instance.getFretCuentaDomiciliarioSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretBranchDomiciliarioSwift().equals(instance.getFretBranchDomiciliarioSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretMonedaDomiciliarioSwift().equals(instance.getFretMonedaDomiciliarioSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretImporteMeSwift().equals(instance.getFretImporteMeSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretCodigoSaiSwift().equals(instance.getFretCodigoSaiSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretTipoAbaIbanSwift().equals(instance.getFretTipoAbaIbanSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretNomBeneficiSwift().equals(instance.getFretNomBeneficiSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretPaisBeneficiSwift().equals(instance.getFretPaisBeneficiSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretCiudadBeneficiSwift().equals(instance.getFretCiudadBeneficiSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretDimicilioBeneficiSwift().equals(instance.getFretDimicilioBeneficiSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretTelefonoBeneficiSwift().equals(instance.getFretTelefonoBeneficiSwift()))
            equalObjects = false;
        if (equalObjects && !this.getFretTipoCambioProv().equals(instance.getFretTipoCambioProv()))
            equalObjects = false;
        if (equalObjects && !this.getFretTipoCambioFirme().equals(instance.getFretTipoCambioFirme()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaClabeCba().equals(instance.getFcbaClabeCba()))
            equalObjects = false;
        if (equalObjects && !this.getFretConvenioCie().equals(instance.getFretConvenioCie()))
            equalObjects = false;
        if (equalObjects && !this.getFfidIdFideicomiso().equals(instance.getFfidIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFretCtaCheques().equals(instance.getFretCtaCheques()))
            equalObjects = false;
        if (equalObjects && !this.getFretSubcta().equals(instance.getFretSubcta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRetiroConc result = new FRetiroConc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFretIdRetiro((BigDecimal) objectData.getData("FRET_ID_RETIRO"));
        result.setFretImpRetiro((BigDecimal) objectData.getData("FRET_IMP_RETIRO"));
        result.setFretFecha((String) objectData.getData("FRET_FECHA"));
        result.setFretMoneda((BigDecimal) objectData.getData("FRET_MONEDA"));
        result.setFretDescripcion((String) objectData.getData("FRET_DESCRIPCION"));
        result.setSesFecha((String) objectData.getData("SES_FECHA"));
        result.setSesTipo((String) objectData.getData("SES_TIPO"));
        result.setAcuId((String) objectData.getData("ACU_ID"));
        result.setFretConcepto((BigDecimal) objectData.getData("FRET_CONCEPTO"));
        result.setFretTipoLiquidacion((BigDecimal) objectData.getData("FRET_TIPO_LIQUIDACION"));
        result.setFretStatusRet((String) objectData.getData("FRET_STATUS_RET"));
        result.setFretNomBeneficiario((String) objectData.getData("FRET_NOM_BENEFICIARIO"));
        result.setFretReferenciaCie((String) objectData.getData("FRET_REFERENCIA_CIE"));
        result.setFretPaisDomiciliarioSwift((String) objectData.getData("FRET_PAIS_DOMICILIARIO_SWIFT"));
        result.setFretCiudadDomiciliarioSwift((String) objectData.getData("FRET_CIUDAD_DOMICILIARIO_SWIFT"));
        result.setFretPlazaDomiciliarioSwift((String) objectData.getData("FRET_PLAZA_DOMICILIARIO_SWIFT"));
        result.setFretSucursalDomiciliaSwift((String) objectData.getData("FRET_SUCURSAL_DOMICILIA_SWIFT"));
        result.setFretBancoDomiciliarioSwift((String) objectData.getData("FRET_BANCO_DOMICILIARIO_SWIFT"));
        result.setFretCuentaDomiciliarioSwift((BigDecimal) objectData.getData("FRET_CUENTA_DOMICILIARIO_SWIFT"));
        result.setFretBranchDomiciliarioSwift((String) objectData.getData("FRET_BRANCH_DOMICILIARIO_SWIFT"));
        result.setFretMonedaDomiciliarioSwift((BigDecimal) objectData.getData("FRET_MONEDA_DOMICILIARIO_SWIFT"));
        result.setFretImporteMeSwift((BigDecimal) objectData.getData("FRET_IMPORTE_ME_SWIFT"));
        result.setFretCodigoSaiSwift((String) objectData.getData("FRET_CODIGO_SAI_SWIFT"));
        result.setFretTipoAbaIbanSwift((BigDecimal) objectData.getData("FRET_TIPO_ABA_IBAN_SWIFT"));
        result.setFretNomBeneficiSwift((String) objectData.getData("FRET_NOM_BENEFICI_SWIFT"));
        result.setFretPaisBeneficiSwift((String) objectData.getData("FRET_PAIS_BENEFICI_SWIFT"));
        result.setFretCiudadBeneficiSwift((String) objectData.getData("FRET_CIUDAD_BENEFICI_SWIFT"));
        result.setFretDimicilioBeneficiSwift((String) objectData.getData("FRET_DIMICILIO_BENEFICI_SWIFT"));
        result.setFretTelefonoBeneficiSwift((String) objectData.getData("FRET_TELEFONO_BENEFICI_SWIFT"));
        result.setFretTipoCambioProv((BigDecimal) objectData.getData("FRET_TIPO_CAMBIO_PROV"));
        result.setFretTipoCambioFirme((BigDecimal) objectData.getData("FRET_TIPO_CAMBIO_FIRME"));
        result.setFcbaClabeCba((String) objectData.getData("FCBA_CLABE_CBA"));
        result.setFretConvenioCie((String) objectData.getData("FRET_CONVENIO_CIE"));
        result.setFfidIdFideicomiso((BigDecimal) objectData.getData("FFID_ID_FIDEICOMISO"));
        result.setFretCtaCheques((BigDecimal) objectData.getData("FRET_CTA_CHEQUES"));
        result.setFretSubcta((BigDecimal) objectData.getData("FRET_SUBCTA"));

        return result;

    }

}
