package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Aphonoh extends DomainObject {

    BigDecimal ahoAnteproyecto = null;
    BigDecimal ahoImpAceptacion = null;
    BigDecimal ahoCveImpFijo = null;
    BigDecimal ahoCvePjePactad = null;
    BigDecimal ahoCveTablaCalc = null;
    BigDecimal ahoCveExento = null;
    BigDecimal ahoNumDiaCorte = null;
    String ahoCveQuienCobr = null;
    String ahoCvePeriodic = null;
    BigDecimal ahoImpFijo = null;
    String ahoTablaCalculo = null;
    BigDecimal ahoPjePactado = null;
    String ahoCveFormaCobr = null;
    String ahoCveTipoCta = null;
    BigDecimal ahoNumSucursal = null;
    BigDecimal ahoNumCuenta = null;
    BigDecimal ahoNumMoneda = null;
    String ahoTexFundamento = null;
    String ahoCveEstado = null;

    public Aphonoh() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAhoAnteproyecto(BigDecimal ahoAnteproyecto) {
        this.ahoAnteproyecto = ahoAnteproyecto;
    }

    public BigDecimal getAhoAnteproyecto() {
        return this.ahoAnteproyecto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setAhoImpAceptacion(BigDecimal ahoImpAceptacion) {
        this.ahoImpAceptacion = ahoImpAceptacion;
    }

    public BigDecimal getAhoImpAceptacion() {
        return this.ahoImpAceptacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAhoCveImpFijo(BigDecimal ahoCveImpFijo) {
        this.ahoCveImpFijo = ahoCveImpFijo;
    }

    public BigDecimal getAhoCveImpFijo() {
        return this.ahoCveImpFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAhoCvePjePactad(BigDecimal ahoCvePjePactad) {
        this.ahoCvePjePactad = ahoCvePjePactad;
    }

    public BigDecimal getAhoCvePjePactad() {
        return this.ahoCvePjePactad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAhoCveTablaCalc(BigDecimal ahoCveTablaCalc) {
        this.ahoCveTablaCalc = ahoCveTablaCalc;
    }

    public BigDecimal getAhoCveTablaCalc() {
        return this.ahoCveTablaCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAhoCveExento(BigDecimal ahoCveExento) {
        this.ahoCveExento = ahoCveExento;
    }

    public BigDecimal getAhoCveExento() {
        return this.ahoCveExento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAhoNumDiaCorte(BigDecimal ahoNumDiaCorte) {
        this.ahoNumDiaCorte = ahoNumDiaCorte;
    }

    public BigDecimal getAhoNumDiaCorte() {
        return this.ahoNumDiaCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhoCveQuienCobr(String ahoCveQuienCobr) {
        this.ahoCveQuienCobr = ahoCveQuienCobr;
    }

    public String getAhoCveQuienCobr() {
        return this.ahoCveQuienCobr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhoCvePeriodic(String ahoCvePeriodic) {
        this.ahoCvePeriodic = ahoCvePeriodic;
    }

    public String getAhoCvePeriodic() {
        return this.ahoCvePeriodic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAhoImpFijo(BigDecimal ahoImpFijo) {
        this.ahoImpFijo = ahoImpFijo;
    }

    public BigDecimal getAhoImpFijo() {
        return this.ahoImpFijo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhoTablaCalculo(String ahoTablaCalculo) {
        this.ahoTablaCalculo = ahoTablaCalculo;
    }

    public String getAhoTablaCalculo() {
        return this.ahoTablaCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setAhoPjePactado(BigDecimal ahoPjePactado) {
        this.ahoPjePactado = ahoPjePactado;
    }

    public BigDecimal getAhoPjePactado() {
        return this.ahoPjePactado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhoCveFormaCobr(String ahoCveFormaCobr) {
        this.ahoCveFormaCobr = ahoCveFormaCobr;
    }

    public String getAhoCveFormaCobr() {
        return this.ahoCveFormaCobr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhoCveTipoCta(String ahoCveTipoCta) {
        this.ahoCveTipoCta = ahoCveTipoCta;
    }

    public String getAhoCveTipoCta() {
        return this.ahoCveTipoCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAhoNumSucursal(BigDecimal ahoNumSucursal) {
        this.ahoNumSucursal = ahoNumSucursal;
    }

    public BigDecimal getAhoNumSucursal() {
        return this.ahoNumSucursal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAhoNumCuenta(BigDecimal ahoNumCuenta) {
        this.ahoNumCuenta = ahoNumCuenta;
    }

    public BigDecimal getAhoNumCuenta() {
        return this.ahoNumCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAhoNumMoneda(BigDecimal ahoNumMoneda) {
        this.ahoNumMoneda = ahoNumMoneda;
    }

    public BigDecimal getAhoNumMoneda() {
        return this.ahoNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhoTexFundamento(String ahoTexFundamento) {
        this.ahoTexFundamento = ahoTexFundamento;
    }

    public String getAhoTexFundamento() {
        return this.ahoTexFundamento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAhoCveEstado(String ahoCveEstado) {
        this.ahoCveEstado = ahoCveEstado;
    }

    public String getAhoCveEstado() {
        return this.ahoCveEstado;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM APHONOH ";

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
        String sql = "SELECT * FROM APHONOH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAhoAnteproyecto() != null && this.getAhoAnteproyecto().longValue() == -999) {
            conditions += " AND AHO_ANTEPROYECTO IS NULL";
        } else if (this.getAhoAnteproyecto() != null) {
            conditions += " AND AHO_ANTEPROYECTO = ?";
            values.add(this.getAhoAnteproyecto());
        }

        if (this.getAhoImpAceptacion() != null && this.getAhoImpAceptacion().longValue() == -999) {
            conditions += " AND AHO_IMP_ACEPTACION IS NULL";
        } else if (this.getAhoImpAceptacion() != null) {
            conditions += " AND AHO_IMP_ACEPTACION = ?";
            values.add(this.getAhoImpAceptacion());
        }

        if (this.getAhoCveImpFijo() != null && this.getAhoCveImpFijo().longValue() == -999) {
            conditions += " AND AHO_CVE_IMP_FIJO IS NULL";
        } else if (this.getAhoCveImpFijo() != null) {
            conditions += " AND AHO_CVE_IMP_FIJO = ?";
            values.add(this.getAhoCveImpFijo());
        }

        if (this.getAhoCvePjePactad() != null && this.getAhoCvePjePactad().longValue() == -999) {
            conditions += " AND AHO_CVE_PJE_PACTAD IS NULL";
        } else if (this.getAhoCvePjePactad() != null) {
            conditions += " AND AHO_CVE_PJE_PACTAD = ?";
            values.add(this.getAhoCvePjePactad());
        }

        if (this.getAhoCveTablaCalc() != null && this.getAhoCveTablaCalc().longValue() == -999) {
            conditions += " AND AHO_CVE_TABLA_CALC IS NULL";
        } else if (this.getAhoCveTablaCalc() != null) {
            conditions += " AND AHO_CVE_TABLA_CALC = ?";
            values.add(this.getAhoCveTablaCalc());
        }

        if (this.getAhoCveExento() != null && this.getAhoCveExento().longValue() == -999) {
            conditions += " AND AHO_CVE_EXENTO IS NULL";
        } else if (this.getAhoCveExento() != null) {
            conditions += " AND AHO_CVE_EXENTO = ?";
            values.add(this.getAhoCveExento());
        }

        if (this.getAhoNumDiaCorte() != null && this.getAhoNumDiaCorte().longValue() == -999) {
            conditions += " AND AHO_NUM_DIA_CORTE IS NULL";
        } else if (this.getAhoNumDiaCorte() != null) {
            conditions += " AND AHO_NUM_DIA_CORTE = ?";
            values.add(this.getAhoNumDiaCorte());
        }

        if (this.getAhoCveQuienCobr() != null && "null".equals(this.getAhoCveQuienCobr())) {
            conditions += " AND AHO_CVE_QUIEN_COBR IS NULL";
        } else if (this.getAhoCveQuienCobr() != null) {
            conditions += " AND AHO_CVE_QUIEN_COBR = ?";
            values.add(this.getAhoCveQuienCobr());
        }

        if (this.getAhoCvePeriodic() != null && "null".equals(this.getAhoCvePeriodic())) {
            conditions += " AND AHO_CVE_PERIODIC IS NULL";
        } else if (this.getAhoCvePeriodic() != null) {
            conditions += " AND AHO_CVE_PERIODIC = ?";
            values.add(this.getAhoCvePeriodic());
        }

        if (this.getAhoImpFijo() != null && this.getAhoImpFijo().longValue() == -999) {
            conditions += " AND AHO_IMP_FIJO IS NULL";
        } else if (this.getAhoImpFijo() != null) {
            conditions += " AND AHO_IMP_FIJO = ?";
            values.add(this.getAhoImpFijo());
        }

        if (this.getAhoTablaCalculo() != null && "null".equals(this.getAhoTablaCalculo())) {
            conditions += " AND AHO_TABLA_CALCULO IS NULL";
        } else if (this.getAhoTablaCalculo() != null) {
            conditions += " AND AHO_TABLA_CALCULO = ?";
            values.add(this.getAhoTablaCalculo());
        }

        if (this.getAhoPjePactado() != null && this.getAhoPjePactado().longValue() == -999) {
            conditions += " AND AHO_PJE_PACTADO IS NULL";
        } else if (this.getAhoPjePactado() != null) {
            conditions += " AND AHO_PJE_PACTADO = ?";
            values.add(this.getAhoPjePactado());
        }

        if (this.getAhoCveFormaCobr() != null && "null".equals(this.getAhoCveFormaCobr())) {
            conditions += " AND AHO_CVE_FORMA_COBR IS NULL";
        } else if (this.getAhoCveFormaCobr() != null) {
            conditions += " AND AHO_CVE_FORMA_COBR = ?";
            values.add(this.getAhoCveFormaCobr());
        }

        if (this.getAhoCveTipoCta() != null && "null".equals(this.getAhoCveTipoCta())) {
            conditions += " AND AHO_CVE_TIPO_CTA IS NULL";
        } else if (this.getAhoCveTipoCta() != null) {
            conditions += " AND AHO_CVE_TIPO_CTA = ?";
            values.add(this.getAhoCveTipoCta());
        }

        if (this.getAhoNumSucursal() != null && this.getAhoNumSucursal().longValue() == -999) {
            conditions += " AND AHO_NUM_SUCURSAL IS NULL";
        } else if (this.getAhoNumSucursal() != null) {
            conditions += " AND AHO_NUM_SUCURSAL = ?";
            values.add(this.getAhoNumSucursal());
        }

        if (this.getAhoNumCuenta() != null && this.getAhoNumCuenta().longValue() == -999) {
            conditions += " AND AHO_NUM_CUENTA IS NULL";
        } else if (this.getAhoNumCuenta() != null) {
            conditions += " AND AHO_NUM_CUENTA = ?";
            values.add(this.getAhoNumCuenta());
        }

        if (this.getAhoNumMoneda() != null && this.getAhoNumMoneda().longValue() == -999) {
            conditions += " AND AHO_NUM_MONEDA IS NULL";
        } else if (this.getAhoNumMoneda() != null) {
            conditions += " AND AHO_NUM_MONEDA = ?";
            values.add(this.getAhoNumMoneda());
        }

        if (this.getAhoTexFundamento() != null && "null".equals(this.getAhoTexFundamento())) {
            conditions += " AND AHO_TEX_FUNDAMENTO IS NULL";
        } else if (this.getAhoTexFundamento() != null) {
            conditions += " AND AHO_TEX_FUNDAMENTO = ?";
            values.add(this.getAhoTexFundamento());
        }

        if (this.getAhoCveEstado() != null && "null".equals(this.getAhoCveEstado())) {
            conditions += " AND AHO_CVE_ESTADO IS NULL";
        } else if (this.getAhoCveEstado() != null) {
            conditions += " AND AHO_CVE_ESTADO = ?";
            values.add(this.getAhoCveEstado());
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
        String sql = "UPDATE APHONOH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " AHO_ANTEPROYECTO = ?, ";
        values.add(this.getAhoAnteproyecto());
        fields += " AHO_IMP_ACEPTACION = ?, ";
        values.add(this.getAhoImpAceptacion());
        fields += " AHO_CVE_IMP_FIJO = ?, ";
        values.add(this.getAhoCveImpFijo());
        fields += " AHO_CVE_PJE_PACTAD = ?, ";
        values.add(this.getAhoCvePjePactad());
        fields += " AHO_CVE_TABLA_CALC = ?, ";
        values.add(this.getAhoCveTablaCalc());
        fields += " AHO_CVE_EXENTO = ?, ";
        values.add(this.getAhoCveExento());
        fields += " AHO_NUM_DIA_CORTE = ?, ";
        values.add(this.getAhoNumDiaCorte());
        fields += " AHO_CVE_QUIEN_COBR = ?, ";
        values.add(this.getAhoCveQuienCobr());
        fields += " AHO_CVE_PERIODIC = ?, ";
        values.add(this.getAhoCvePeriodic());
        fields += " AHO_IMP_FIJO = ?, ";
        values.add(this.getAhoImpFijo());
        fields += " AHO_TABLA_CALCULO = ?, ";
        values.add(this.getAhoTablaCalculo());
        fields += " AHO_PJE_PACTADO = ?, ";
        values.add(this.getAhoPjePactado());
        fields += " AHO_CVE_FORMA_COBR = ?, ";
        values.add(this.getAhoCveFormaCobr());
        fields += " AHO_CVE_TIPO_CTA = ?, ";
        values.add(this.getAhoCveTipoCta());
        fields += " AHO_NUM_SUCURSAL = ?, ";
        values.add(this.getAhoNumSucursal());
        fields += " AHO_NUM_CUENTA = ?, ";
        values.add(this.getAhoNumCuenta());
        fields += " AHO_NUM_MONEDA = ?, ";
        values.add(this.getAhoNumMoneda());
        fields += " AHO_TEX_FUNDAMENTO = ?, ";
        values.add(this.getAhoTexFundamento());
        fields += " AHO_CVE_ESTADO = ?, ";
        values.add(this.getAhoCveEstado());
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
        String sql = "INSERT INTO APHONOH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AHO_ANTEPROYECTO";
        fieldValues += ", ?";
        values.add(this.getAhoAnteproyecto());

        fields += ", AHO_IMP_ACEPTACION";
        fieldValues += ", ?";
        values.add(this.getAhoImpAceptacion());

        fields += ", AHO_CVE_IMP_FIJO";
        fieldValues += ", ?";
        values.add(this.getAhoCveImpFijo());

        fields += ", AHO_CVE_PJE_PACTAD";
        fieldValues += ", ?";
        values.add(this.getAhoCvePjePactad());

        fields += ", AHO_CVE_TABLA_CALC";
        fieldValues += ", ?";
        values.add(this.getAhoCveTablaCalc());

        fields += ", AHO_CVE_EXENTO";
        fieldValues += ", ?";
        values.add(this.getAhoCveExento());

        fields += ", AHO_NUM_DIA_CORTE";
        fieldValues += ", ?";
        values.add(this.getAhoNumDiaCorte());

        fields += ", AHO_CVE_QUIEN_COBR";
        fieldValues += ", ?";
        values.add(this.getAhoCveQuienCobr());

        fields += ", AHO_CVE_PERIODIC";
        fieldValues += ", ?";
        values.add(this.getAhoCvePeriodic());

        fields += ", AHO_IMP_FIJO";
        fieldValues += ", ?";
        values.add(this.getAhoImpFijo());

        fields += ", AHO_TABLA_CALCULO";
        fieldValues += ", ?";
        values.add(this.getAhoTablaCalculo());

        fields += ", AHO_PJE_PACTADO";
        fieldValues += ", ?";
        values.add(this.getAhoPjePactado());

        fields += ", AHO_CVE_FORMA_COBR";
        fieldValues += ", ?";
        values.add(this.getAhoCveFormaCobr());

        fields += ", AHO_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getAhoCveTipoCta());

        fields += ", AHO_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getAhoNumSucursal());

        fields += ", AHO_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getAhoNumCuenta());

        fields += ", AHO_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getAhoNumMoneda());

        fields += ", AHO_TEX_FUNDAMENTO";
        fieldValues += ", ?";
        values.add(this.getAhoTexFundamento());

        fields += ", AHO_CVE_ESTADO";
        fieldValues += ", ?";
        values.add(this.getAhoCveEstado());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM APHONOH WHERE ";

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
        Aphonoh instance = (Aphonoh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAhoAnteproyecto().equals(instance.getAhoAnteproyecto()))
            equalObjects = false;
        if (equalObjects && !this.getAhoImpAceptacion().equals(instance.getAhoImpAceptacion()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCveImpFijo().equals(instance.getAhoCveImpFijo()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCvePjePactad().equals(instance.getAhoCvePjePactad()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCveTablaCalc().equals(instance.getAhoCveTablaCalc()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCveExento().equals(instance.getAhoCveExento()))
            equalObjects = false;
        if (equalObjects && !this.getAhoNumDiaCorte().equals(instance.getAhoNumDiaCorte()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCveQuienCobr().equals(instance.getAhoCveQuienCobr()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCvePeriodic().equals(instance.getAhoCvePeriodic()))
            equalObjects = false;
        if (equalObjects && !this.getAhoImpFijo().equals(instance.getAhoImpFijo()))
            equalObjects = false;
        if (equalObjects && !this.getAhoTablaCalculo().equals(instance.getAhoTablaCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getAhoPjePactado().equals(instance.getAhoPjePactado()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCveFormaCobr().equals(instance.getAhoCveFormaCobr()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCveTipoCta().equals(instance.getAhoCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getAhoNumSucursal().equals(instance.getAhoNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getAhoNumCuenta().equals(instance.getAhoNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getAhoNumMoneda().equals(instance.getAhoNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getAhoTexFundamento().equals(instance.getAhoTexFundamento()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCveEstado().equals(instance.getAhoCveEstado()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Aphonoh result = new Aphonoh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAhoAnteproyecto((BigDecimal) objectData.getData("AHO_ANTEPROYECTO"));
        result.setAhoImpAceptacion((BigDecimal) objectData.getData("AHO_IMP_ACEPTACION"));
        result.setAhoCveImpFijo((BigDecimal) objectData.getData("AHO_CVE_IMP_FIJO"));
        result.setAhoCvePjePactad((BigDecimal) objectData.getData("AHO_CVE_PJE_PACTAD"));
        result.setAhoCveTablaCalc((BigDecimal) objectData.getData("AHO_CVE_TABLA_CALC"));
        result.setAhoCveExento((BigDecimal) objectData.getData("AHO_CVE_EXENTO"));
        result.setAhoNumDiaCorte((BigDecimal) objectData.getData("AHO_NUM_DIA_CORTE"));
        result.setAhoCveQuienCobr((String) objectData.getData("AHO_CVE_QUIEN_COBR"));
        result.setAhoCvePeriodic((String) objectData.getData("AHO_CVE_PERIODIC"));
        result.setAhoImpFijo((BigDecimal) objectData.getData("AHO_IMP_FIJO"));
        result.setAhoTablaCalculo((String) objectData.getData("AHO_TABLA_CALCULO"));
        result.setAhoPjePactado((BigDecimal) objectData.getData("AHO_PJE_PACTADO"));
        result.setAhoCveFormaCobr((String) objectData.getData("AHO_CVE_FORMA_COBR"));
        result.setAhoCveTipoCta((String) objectData.getData("AHO_CVE_TIPO_CTA"));
        result.setAhoNumSucursal((BigDecimal) objectData.getData("AHO_NUM_SUCURSAL"));
        result.setAhoNumCuenta((BigDecimal) objectData.getData("AHO_NUM_CUENTA"));
        result.setAhoNumMoneda((BigDecimal) objectData.getData("AHO_NUM_MONEDA"));
        result.setAhoTexFundamento((String) objectData.getData("AHO_TEX_FUNDAMENTO"));
        result.setAhoCveEstado((String) objectData.getData("AHO_CVE_ESTADO"));

        return result;

    }

}
