package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class FCuentasInversion extends DomainObject {
    BigDecimal fciNumFideicomiso = null;
    String fciNumCta = null;
    String fciTipoCta = null;
    String fciTitDeCta = null;
    String fciIntermediario = null;
    String fciMoneda = null;
    String fciPais = null;
    String fciFeDeAp = null;
    String fciClabe = null;
    String fciEstatusFisIsr = null;
    String fciRfcDeLaCta = null;
    String fciDomDeLaCta = null;
    String fciFormaManejo = null;
    String fciCtaRel = null;
    String fciEstatus = null;
    String fciEstatusHogan = null;
    String fciNombreCta = null;
    String fciObservac = null;
    String fciContratoEnviado = null;
    String fciUsuario = null;
    BigDecimal fciFolio = null;
    BigDecimal fciMontoEmbargo = null;

    public FCuentasInversion() {
        super();
        this.pkColumns = 8;
    }

    public void setFciNumFideicomiso(BigDecimal fciNumFideicomiso) {
        this.fciNumFideicomiso = fciNumFideicomiso;
    }

    public void setFciNumCta(String fciNumCta) {
        this.fciNumCta = fciNumCta;
    }

    public void setFciTipoCta(String fciTipoCta) {
        this.fciTipoCta = fciTipoCta;
    }

    public void setFciTitDeCta(String fciTitDeCta) {
        this.fciTitDeCta = fciTitDeCta;
    }

    public void setFciIntermediario(String fciIntermediario) {
        this.fciIntermediario = fciIntermediario;
    }

    public void setFciMoneda(String fciMoneda) {
        this.fciMoneda = fciMoneda;
    }

    public void setFciPais(String fciPais) {
        this.fciPais = fciPais;
    }

    public void setFciFeDeAp(String fciFeDeAp) {
        this.fciFeDeAp = fciFeDeAp;
    }

    public void setFciClabe(String fciClabe) {
        this.fciClabe = fciClabe;
    }

    public void setFciEstatusFisIsr(String fciEstatusFisIsr) {
        this.fciEstatusFisIsr = fciEstatusFisIsr;
    }

    public void setFciRfcDeLaCta(String fciRfcDeLaCta) {
        this.fciRfcDeLaCta = fciRfcDeLaCta;
    }

    public void setFciDomDeLaCta(String fciDomDeLaCta) {
        this.fciDomDeLaCta = fciDomDeLaCta;
    }

    public void setFciFormaManejo(String fciFormaManejo) {
        this.fciFormaManejo = fciFormaManejo;
    }

    public void setFciCtaRel(String fciCtaRel) {
        this.fciCtaRel = fciCtaRel;
    }

    public void setFciEstatus(String fciEstatus) {
        this.fciEstatus = fciEstatus;
    }

    public void setFciEstatusHogan(String fciEstatusHogan) {
        this.fciEstatusHogan = fciEstatusHogan;
    }

    public void setFciNombreCta(String fciNombreCta) {
        this.fciNombreCta = fciNombreCta;
    }

    public void setFciObservac(String fciObservac) {
        this.fciObservac = fciObservac;
    }

    public void setFciContratoEnviado(String fciContratoEnviado) {
        this.fciContratoEnviado = fciContratoEnviado;
    }

    public void setFciUsuario(String fciUsuario) {
        this.fciUsuario = fciUsuario;
    }

    public void setFciFolio(BigDecimal fciFolio) {
        this.fciFolio = fciFolio;
    }

    public BigDecimal getFciNumFideicomiso() {
        return this.fciNumFideicomiso;
    }

    public String getFciNumCta() {
        return this.fciNumCta;
    }

    public String getFciTipoCta() {
        return this.fciTipoCta;
    }

    public String getFciTitDeCta() {
        return this.fciTitDeCta;
    }

    public String getFciIntermediario() {
        return this.fciIntermediario;
    }

    public String getFciMoneda() {
        return this.fciMoneda;
    }

    public String getFciPais() {
        return this.fciPais;
    }

    public String getFciFeDeAp() {
        return this.fciFeDeAp;
    }

    public String getFciClabe() {
        return this.fciClabe;
    }

    public String getFciEstatusFisIsr() {
        return this.fciEstatusFisIsr;
    }

    public String getFciRfcDeLaCta() {
        return this.fciRfcDeLaCta;
    }

    public String getFciDomDeLaCta() {
        return this.fciDomDeLaCta;
    }

    public String getFciFormaManejo() {
        return this.fciFormaManejo;
    }

    public String getFciCtaRel() {
        return this.fciCtaRel;
    }

    public String getFciEstatus() {
        return this.fciEstatus;
    }

    public String getFciEstatusHogan() {
        return this.fciEstatusHogan;
    }

    public String getFciNombreCta() {
        return this.fciNombreCta;
    }

    public String getFciObservac() {
        return this.fciObservac;
    }

    public String getFciContratoEnviado() {
        return this.fciContratoEnviado;
    }

    public String getFciUsuario() {
        return this.fciUsuario;
    }

    public BigDecimal getFciFolio() {
        return this.fciFolio;
    }

    public void setFciMontoEmbargo(BigDecimal fciMontoEmbargo) {
        this.fciMontoEmbargo = fciMontoEmbargo;
    }

    public BigDecimal getFciMontoEmbargo() {
        return fciMontoEmbargo;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CUENTAS_INVERSION ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFciNumFideicomiso() != null && this.getFciNumFideicomiso().longValue() == -999) {
            conditions += " AND FCI_NUM_FIDEICOMISO IS NULL";
        } else if (this.getFciNumFideicomiso() != null) {
            conditions += " AND FCI_NUM_FIDEICOMISO =?";
            values.add(this.getFciNumFideicomiso());
        }
        if (this.getFciNumCta() != null && "null".equals(this.getFciNumCta())) {
            conditions += " AND FCI_NUM_CTA IS NULL";
        } else if (this.getFciNumCta() != null) {
            conditions += " AND FCI_NUM_CTA =?";
            values.add(this.getFciNumCta());
        }
        if (this.getFciTipoCta() != null && "null".equals(this.getFciTipoCta())) {
            conditions += " AND FCI_TIPO_CTA IS NULL";
        } else if (this.getFciTipoCta() != null) {
            conditions += " AND FCI_TIPO_CTA =?";
            values.add(this.getFciTipoCta());
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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CUENTAS_INVERSION ";
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

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE F_CUENTAS_INVERSION SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND FCI_NUM_FIDEICOMISO = ?";
        pkValues.add(this.getFciNumFideicomiso());
        conditions += " AND FCI_NUM_CTA = ?";
        pkValues.add(this.getFciNumCta());
        conditions += " AND FCI_TIPO_CTA = ?";
        pkValues.add(this.getFciTipoCta());
        fields += " FCI_TIT_DE_CTA = ?, ";
        values.add(this.getFciTitDeCta());
        fields += " FCI_INTERMEDIARIO = ?, ";
        values.add(this.getFciIntermediario());
        fields += " FCI_MONEDA = ?, ";
        values.add(this.getFciMoneda());
        fields += " FCI_PAIS = ?, ";
        values.add(this.getFciPais());
        fields += " FCI_FE_DE_AP = ?, ";
        values.add(this.getFciFeDeAp());
        fields += " FCI_CLABE = ?, ";
        values.add(this.getFciClabe());
        fields += " FCI_ESTATUS_FIS_ISR = ?, ";
        values.add(this.getFciEstatusFisIsr());
        fields += " FCI_RFC_DE_LA_CTA = ?, ";
        values.add(this.getFciRfcDeLaCta());
        fields += " FCI_DOM_DE_LA_CTA = ?, ";
        values.add(this.getFciDomDeLaCta());
        fields += " FCI_FORMA_MANEJO = ?, ";
        values.add(this.getFciFormaManejo());
        fields += " FCI_CTA_REL = ?, ";
        values.add(this.getFciCtaRel());
        fields += " FCI_ESTATUS = ?, ";
        values.add(this.getFciEstatus());
        fields += " FCI_ESTATUS_HOGAN = ?, ";
        values.add(this.getFciEstatusHogan());
        fields += " FCI_NOMBRE_CTA = ?, ";
        values.add(this.getFciNombreCta());
        fields += " FCI_OBSERVAC = ?, ";
        values.add(this.getFciObservac());
        fields += " FCI_CONTRATO_ENVIADO = ?, ";
        values.add(this.getFciContratoEnviado());
        fields += " FCI_USUARIO = ?, ";
        values.add(this.getFciUsuario());
        fields += " FCI_FOLIO = ?, ";
        values.add(this.getFciFolio());
        fields += " FCI_MONTO_EMBARGO = ?, ";
        values.add(this.getFciMontoEmbargo());
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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO F_CUENTAS_INVERSION ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FCI_NUM_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFciNumFideicomiso());
        fields += ",FCI_NUM_CTA ";
        fieldValues += ", ?";
        values.add(this.getFciNumCta());
        fields += ",FCI_TIPO_CTA ";
        fieldValues += ", ?";
        values.add(this.getFciTipoCta());
        fields += ",FCI_TIT_DE_CTA ";
        fieldValues += ", ?";
        values.add(this.getFciTitDeCta());
        fields += ",FCI_INTERMEDIARIO ";
        fieldValues += ", ?";
        values.add(this.getFciIntermediario());
        fields += ",FCI_MONEDA ";
        fieldValues += ", ?";
        values.add(this.getFciMoneda());
        fields += ",FCI_PAIS ";
        fieldValues += ", ?";
        values.add(this.getFciPais());
        fields += ",FCI_FE_DE_AP ";
        fieldValues += ", ?";
        values.add(this.getFciFeDeAp());
        fields += ",FCI_CLABE ";
        fieldValues += ", ?";
        values.add(this.getFciClabe());
        fields += ",FCI_ESTATUS_FIS_ISR ";
        fieldValues += ", ?";
        values.add(this.getFciEstatusFisIsr());
        fields += ",FCI_RFC_DE_LA_CTA ";
        fieldValues += ", ?";
        values.add(this.getFciRfcDeLaCta());
        fields += ",FCI_DOM_DE_LA_CTA ";
        fieldValues += ", ?";
        values.add(this.getFciDomDeLaCta());
        fields += ",FCI_FORMA_MANEJO ";
        fieldValues += ", ?";
        values.add(this.getFciFormaManejo());
        fields += ",FCI_CTA_REL ";
        fieldValues += ", ?";
        values.add(this.getFciCtaRel());
        fields += ",FCI_ESTATUS ";
        fieldValues += ", ?";
        values.add(this.getFciEstatus());
        fields += ",FCI_ESTATUS_HOGAN ";
        fieldValues += ", ?";
        values.add(this.getFciEstatusHogan());
        fields += ",FCI_NOMBRE_CTA ";
        fieldValues += ", ?";
        values.add(this.getFciNombreCta());
        fields += ",FCI_OBSERVAC ";
        fieldValues += ", ?";
        values.add(this.getFciObservac());
        fields += ",FCI_CONTRATO_ENVIADO ";
        fieldValues += ", ?";
        values.add(this.getFciContratoEnviado());
        fields += ",FCI_USUARIO ";
        fieldValues += ", ?";
        values.add(this.getFciUsuario());
        fields += ",FCI_FOLIO ";
        fieldValues += ", ?";
        values.add(this.getFciFolio());
        fields += ",FCI_MONTO_EMBARGO ";
        fieldValues += ", ?";
        values.add(this.getFciMontoEmbargo());
        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();
        sql += fields + " ) VALUES (" + fieldValues + ")";
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CUENTAS_INVERSION WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FCI_NUM_FIDEICOMISO = ?";
        values.add(this.getFciNumFideicomiso());
        conditions += " AND FCI_NUM_CTA = ?";
        values.add(this.getFciNumCta());
        conditions += " AND FCI_TIPO_CTA = ?";
        values.add(this.getFciTipoCta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCuentasInversion instance = (FCuentasInversion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFciNumFideicomiso().equals(instance.getFciNumFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFciNumCta().equals(instance.getFciNumCta()))
            equalObjects = false;
        if (equalObjects && !this.getFciTipoCta().equals(instance.getFciTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getFciTitDeCta().equals(instance.getFciTitDeCta()))
            equalObjects = false;
        if (equalObjects && !this.getFciIntermediario().equals(instance.getFciIntermediario()))
            equalObjects = false;
        if (equalObjects && !this.getFciMoneda().equals(instance.getFciMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFciPais().equals(instance.getFciPais()))
            equalObjects = false;
        if (equalObjects && !this.getFciFeDeAp().equals(instance.getFciFeDeAp()))
            equalObjects = false;
        if (equalObjects && !this.getFciClabe().equals(instance.getFciClabe()))
            equalObjects = false;
        if (equalObjects && !this.getFciEstatusFisIsr().equals(instance.getFciEstatusFisIsr()))
            equalObjects = false;
        if (equalObjects && !this.getFciRfcDeLaCta().equals(instance.getFciRfcDeLaCta()))
            equalObjects = false;
        if (equalObjects && !this.getFciDomDeLaCta().equals(instance.getFciDomDeLaCta()))
            equalObjects = false;
        if (equalObjects && !this.getFciFormaManejo().equals(instance.getFciFormaManejo()))
            equalObjects = false;
        if (equalObjects && !this.getFciCtaRel().equals(instance.getFciCtaRel()))
            equalObjects = false;
        if (equalObjects && !this.getFciEstatus().equals(instance.getFciEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getFciEstatusHogan().equals(instance.getFciEstatusHogan()))
            equalObjects = false;
        if (equalObjects && !this.getFciNombreCta().equals(instance.getFciNombreCta()))
            equalObjects = false;
        if (equalObjects && !this.getFciObservac().equals(instance.getFciObservac()))
            equalObjects = false;
        if (equalObjects && !this.getFciContratoEnviado().equals(instance.getFciContratoEnviado()))
            equalObjects = false;
        if (equalObjects && !this.getFciUsuario().equals(instance.getFciUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getFciFolio().equals(instance.getFciFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFciMontoEmbargo().equals(instance.getFciMontoEmbargo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCuentasInversion result = new FCuentasInversion();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFciNumFideicomiso((BigDecimal) objectData.getData("FCI_NUM_FIDEICOMISO"));
        result.setFciNumCta((String) objectData.getData("FCI_NUM_CTA"));
        result.setFciTipoCta((String) objectData.getData("FCI_TIPO_CTA"));
        result.setFciTitDeCta((String) objectData.getData("FCI_TIT_DE_CTA"));
        result.setFciIntermediario((String) objectData.getData("FCI_INTERMEDIARIO"));
        result.setFciMoneda((String) objectData.getData("FCI_MONEDA"));
        result.setFciPais((String) objectData.getData("FCI_PAIS"));
        result.setFciFeDeAp((String) objectData.getData("FCI_FE_DE_AP"));
        result.setFciClabe((String) objectData.getData("FCI_CLABE"));
        result.setFciEstatusFisIsr((String) objectData.getData("FCI_ESTATUS_FIS_ISR"));
        result.setFciRfcDeLaCta((String) objectData.getData("FCI_RFC_DE_LA_CTA"));
        result.setFciDomDeLaCta((String) objectData.getData("FCI_DOM_DE_LA_CTA"));
        result.setFciFormaManejo((String) objectData.getData("FCI_FORMA_MANEJO"));
        result.setFciCtaRel((String) objectData.getData("FCI_CTA_REL"));
        result.setFciEstatus((String) objectData.getData("FCI_ESTATUS"));
        result.setFciEstatusHogan((String) objectData.getData("FCI_ESTATUS_HOGAN"));
        result.setFciNombreCta((String) objectData.getData("FCI_NOMBRE_CTA"));
        result.setFciObservac((String) objectData.getData("FCI_OBSERVAC"));
        result.setFciContratoEnviado((String) objectData.getData("FCI_CONTRATO_ENVIADO"));
        result.setFciUsuario((String) objectData.getData("FCI_USUARIO"));
        result.setFciFolio((BigDecimal) objectData.getData("FCI_FOLIO"));
        result.setFciMontoEmbargo((BigDecimal) objectData.getData("FCI_MONTO_EMBARGO"));
        return result;
    }
}
