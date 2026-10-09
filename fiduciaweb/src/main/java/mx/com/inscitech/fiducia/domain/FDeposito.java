package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_DEPOSITO_PK", columns = { "FDPO_ID_DEPOSITO" }, sequences = { "MAX" })
public class FDeposito extends DomainObject {

    BigDecimal fdpoIdDeposito = null;
    BigDecimal fdpoImporteDeposito = null;
    String fdepFecha = null;
    BigDecimal fdpoCbaInstitucion = null;
    BigDecimal fdepMoneda = null;
    BigDecimal fdpoConceptoDep = null;
    BigDecimal fcinIdCtoInversion = null;
    String fdepDescripcion = null;
    String fdepStatus = null;
    BigDecimal ftpfIdTipoPer = null;
    BigDecimal ftpfIdPersona = null;
    BigDecimal ffidIdFideicomiso = null;
    BigDecimal fdpoTipoCambioProv = null;
    BigDecimal fdpoTipoCambioFirme = null;
    BigDecimal fdpoCtaCheques = null;
    BigDecimal fdpoSubcta = null;

    public FDeposito() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdpoIdDeposito(BigDecimal fdpoIdDeposito) {
        this.fdpoIdDeposito = fdpoIdDeposito;
    }

    public BigDecimal getFdpoIdDeposito() {
        return this.fdpoIdDeposito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFdpoImporteDeposito(BigDecimal fdpoImporteDeposito) {
        this.fdpoImporteDeposito = fdpoImporteDeposito;
    }

    public BigDecimal getFdpoImporteDeposito() {
        return this.fdpoImporteDeposito;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFdepFecha(String fdepFecha) {
        this.fdepFecha = fdepFecha;
    }

    public String getFdepFecha() {
        return this.fdepFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFdpoCbaInstitucion(BigDecimal fdpoCbaInstitucion) {
        this.fdpoCbaInstitucion = fdpoCbaInstitucion;
    }

    public BigDecimal getFdpoCbaInstitucion() {
        return this.fdpoCbaInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setFdepMoneda(BigDecimal fdepMoneda) {
        this.fdepMoneda = fdepMoneda;
    }

    public BigDecimal getFdepMoneda() {
        return this.fdepMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdpoConceptoDep(BigDecimal fdpoConceptoDep) {
        this.fdpoConceptoDep = fdpoConceptoDep;
    }

    public BigDecimal getFdpoConceptoDep() {
        return this.fdpoConceptoDep;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcinIdCtoInversion(BigDecimal fcinIdCtoInversion) {
        this.fcinIdCtoInversion = fcinIdCtoInversion;
    }

    public BigDecimal getFcinIdCtoInversion() {
        return this.fcinIdCtoInversion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdepDescripcion(String fdepDescripcion) {
        this.fdepDescripcion = fdepDescripcion;
    }

    public String getFdepDescripcion() {
        return this.fdepDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdepStatus(String fdepStatus) {
        this.fdepStatus = fdepStatus;
    }

    public String getFdepStatus() {
        return this.fdepStatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtpfIdTipoPer(BigDecimal ftpfIdTipoPer) {
        this.ftpfIdTipoPer = ftpfIdTipoPer;
    }

    public BigDecimal getFtpfIdTipoPer() {
        return this.ftpfIdTipoPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtpfIdPersona(BigDecimal ftpfIdPersona) {
        this.ftpfIdPersona = ftpfIdPersona;
    }

    public BigDecimal getFtpfIdPersona() {
        return this.ftpfIdPersona;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfidIdFideicomiso(BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return this.ffidIdFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFdpoTipoCambioProv(BigDecimal fdpoTipoCambioProv) {
        this.fdpoTipoCambioProv = fdpoTipoCambioProv;
    }

    public BigDecimal getFdpoTipoCambioProv() {
        return this.fdpoTipoCambioProv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFdpoTipoCambioFirme(BigDecimal fdpoTipoCambioFirme) {
        this.fdpoTipoCambioFirme = fdpoTipoCambioFirme;
    }

    public BigDecimal getFdpoTipoCambioFirme() {
        return this.fdpoTipoCambioFirme;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setFdpoCtaCheques(BigDecimal fdpoCtaCheques) {
        this.fdpoCtaCheques = fdpoCtaCheques;
    }

    public BigDecimal getFdpoCtaCheques() {
        return this.fdpoCtaCheques;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setFdpoSubcta(BigDecimal fdpoSubcta) {
        this.fdpoSubcta = fdpoSubcta;
    }

    public BigDecimal getFdpoSubcta() {
        return this.fdpoSubcta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_DEPOSITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFdpoIdDeposito() != null && this.getFdpoIdDeposito().longValue() == -999) {
            conditions += " AND FDPO_ID_DEPOSITO IS NULL";
        } else if (this.getFdpoIdDeposito() != null) {
            conditions += " AND FDPO_ID_DEPOSITO = ?";
            values.add(this.getFdpoIdDeposito());
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
        String sql = "SELECT * FROM F_DEPOSITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFdpoIdDeposito() != null && this.getFdpoIdDeposito().longValue() == -999) {
            conditions += " AND FDPO_ID_DEPOSITO IS NULL";
        } else if (this.getFdpoIdDeposito() != null) {
            conditions += " AND FDPO_ID_DEPOSITO = ?";
            values.add(this.getFdpoIdDeposito());
        }

        if (this.getFdpoImporteDeposito() != null && this.getFdpoImporteDeposito().longValue() == -999) {
            conditions += " AND FDPO_IMPORTE_DEPOSITO IS NULL";
        } else if (this.getFdpoImporteDeposito() != null) {
            conditions += " AND FDPO_IMPORTE_DEPOSITO = ?";
            values.add(this.getFdpoImporteDeposito());
        }

        if (this.getFdepFecha() != null && "null".equals(this.getFdepFecha())) {
            conditions += " AND FDEP_FECHA IS NULL";
        } else if (this.getFdepFecha() != null) {
            conditions += " AND FDEP_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFdepFecha());
        }

        if (this.getFdpoCbaInstitucion() != null && this.getFdpoCbaInstitucion().longValue() == -999) {
            conditions += " AND FDPO_CBA_INSTITUCION IS NULL";
        } else if (this.getFdpoCbaInstitucion() != null) {
            conditions += " AND FDPO_CBA_INSTITUCION = ?";
            values.add(this.getFdpoCbaInstitucion());
        }

        if (this.getFdepMoneda() != null && this.getFdepMoneda().longValue() == -999) {
            conditions += " AND FDEP_MONEDA IS NULL";
        } else if (this.getFdepMoneda() != null) {
            conditions += " AND FDEP_MONEDA = ?";
            values.add(this.getFdepMoneda());
        }

        if (this.getFdpoConceptoDep() != null && this.getFdpoConceptoDep().longValue() == -999) {
            conditions += " AND FDPO_CONCEPTO_DEP IS NULL";
        } else if (this.getFdpoConceptoDep() != null) {
            conditions += " AND FDPO_CONCEPTO_DEP = ?";
            values.add(this.getFdpoConceptoDep());
        }

        if (this.getFcinIdCtoInversion() != null && this.getFcinIdCtoInversion().longValue() == -999) {
            conditions += " AND FCIN_ID_CTO_INVERSION IS NULL";
        } else if (this.getFcinIdCtoInversion() != null) {
            conditions += " AND FCIN_ID_CTO_INVERSION = ?";
            values.add(this.getFcinIdCtoInversion());
        }

        if (this.getFdepDescripcion() != null && "null".equals(this.getFdepDescripcion())) {
            conditions += " AND FDEP_DESCRIPCION IS NULL";
        } else if (this.getFdepDescripcion() != null) {
            conditions += " AND FDEP_DESCRIPCION = ?";
            values.add(this.getFdepDescripcion());
        }

        if (this.getFdepStatus() != null && "null".equals(this.getFdepStatus())) {
            conditions += " AND FDEP_STATUS IS NULL";
        } else if (this.getFdepStatus() != null) {
            conditions += " AND FDEP_STATUS = ?";
            values.add(this.getFdepStatus());
        }

        if (this.getFtpfIdTipoPer() != null && this.getFtpfIdTipoPer().longValue() == -999) {
            conditions += " AND FTPF_ID_TIPO_PER IS NULL";
        } else if (this.getFtpfIdTipoPer() != null) {
            conditions += " AND FTPF_ID_TIPO_PER = ?";
            values.add(this.getFtpfIdTipoPer());
        }

        if (this.getFtpfIdPersona() != null && this.getFtpfIdPersona().longValue() == -999) {
            conditions += " AND FTPF_ID_PERSONA IS NULL";
        } else if (this.getFtpfIdPersona() != null) {
            conditions += " AND FTPF_ID_PERSONA = ?";
            values.add(this.getFtpfIdPersona());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
        }

        if (this.getFdpoTipoCambioProv() != null && this.getFdpoTipoCambioProv().longValue() == -999) {
            conditions += " AND FDPO_TIPO_CAMBIO_PROV IS NULL";
        } else if (this.getFdpoTipoCambioProv() != null) {
            conditions += " AND FDPO_TIPO_CAMBIO_PROV = ?";
            values.add(this.getFdpoTipoCambioProv());
        }

        if (this.getFdpoTipoCambioFirme() != null && this.getFdpoTipoCambioFirme().longValue() == -999) {
            conditions += " AND FDPO_TIPO_CAMBIO_FIRME IS NULL";
        } else if (this.getFdpoTipoCambioFirme() != null) {
            conditions += " AND FDPO_TIPO_CAMBIO_FIRME = ?";
            values.add(this.getFdpoTipoCambioFirme());
        }

        if (this.getFdpoCtaCheques() != null && this.getFdpoCtaCheques().longValue() == -999) {
            conditions += " AND FDPO_CTA_CHEQUES IS NULL";
        } else if (this.getFdpoCtaCheques() != null) {
            conditions += " AND FDPO_CTA_CHEQUES = ?";
            values.add(this.getFdpoCtaCheques());
        }

        if (this.getFdpoSubcta() != null && this.getFdpoSubcta().longValue() == -999) {
            conditions += " AND FDPO_SUBCTA IS NULL";
        } else if (this.getFdpoSubcta() != null) {
            conditions += " AND FDPO_SUBCTA = ?";
            values.add(this.getFdpoSubcta());
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
        String sql = "UPDATE F_DEPOSITO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FDPO_ID_DEPOSITO = ?";
        pkValues.add(this.getFdpoIdDeposito());
        fields += " FDPO_IMPORTE_DEPOSITO = ?, ";
        values.add(this.getFdpoImporteDeposito());
        fields += " FDEP_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFdepFecha());
        fields += " FDPO_CBA_INSTITUCION = ?, ";
        values.add(this.getFdpoCbaInstitucion());
        fields += " FDEP_MONEDA = ?, ";
        values.add(this.getFdepMoneda());
        fields += " FDPO_CONCEPTO_DEP = ?, ";
        values.add(this.getFdpoConceptoDep());
        fields += " FCIN_ID_CTO_INVERSION = ?, ";
        values.add(this.getFcinIdCtoInversion());
        fields += " FDEP_DESCRIPCION = ?, ";
        values.add(this.getFdepDescripcion());
        fields += " FDEP_STATUS = ?, ";
        values.add(this.getFdepStatus());
        fields += " FTPF_ID_TIPO_PER = ?, ";
        values.add(this.getFtpfIdTipoPer());
        fields += " FTPF_ID_PERSONA = ?, ";
        values.add(this.getFtpfIdPersona());
        fields += " FFID_ID_FIDEICOMISO = ?, ";
        values.add(this.getFfidIdFideicomiso());
        fields += " FDPO_TIPO_CAMBIO_PROV = ?, ";
        values.add(this.getFdpoTipoCambioProv());
        fields += " FDPO_TIPO_CAMBIO_FIRME = ?, ";
        values.add(this.getFdpoTipoCambioFirme());
        fields += " FDPO_CTA_CHEQUES = ?, ";
        values.add(this.getFdpoCtaCheques());
        fields += " FDPO_SUBCTA = ?, ";
        values.add(this.getFdpoSubcta());
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
        String sql = "INSERT INTO F_DEPOSITO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FDPO_ID_DEPOSITO";
        fieldValues += ", ?";
        values.add(this.getFdpoIdDeposito());

        fields += ", FDPO_IMPORTE_DEPOSITO";
        fieldValues += ", ?";
        values.add(this.getFdpoImporteDeposito());

        fields += ", FDEP_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFdepFecha());

        fields += ", FDPO_CBA_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getFdpoCbaInstitucion());

        fields += ", FDEP_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFdepMoneda());

        fields += ", FDPO_CONCEPTO_DEP";
        fieldValues += ", ?";
        values.add(this.getFdpoConceptoDep());

        fields += ", FCIN_ID_CTO_INVERSION";
        fieldValues += ", ?";
        values.add(this.getFcinIdCtoInversion());

        fields += ", FDEP_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFdepDescripcion());

        fields += ", FDEP_STATUS";
        fieldValues += ", ?";
        values.add(this.getFdepStatus());

        fields += ", FTPF_ID_TIPO_PER";
        fieldValues += ", ?";
        values.add(this.getFtpfIdTipoPer());

        fields += ", FTPF_ID_PERSONA";
        fieldValues += ", ?";
        values.add(this.getFtpfIdPersona());

        fields += ", FFID_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFfidIdFideicomiso());

        fields += ", FDPO_TIPO_CAMBIO_PROV";
        fieldValues += ", ?";
        values.add(this.getFdpoTipoCambioProv());

        fields += ", FDPO_TIPO_CAMBIO_FIRME";
        fieldValues += ", ?";
        values.add(this.getFdpoTipoCambioFirme());

        fields += ", FDPO_CTA_CHEQUES";
        fieldValues += ", ?";
        values.add(this.getFdpoCtaCheques());

        fields += ", FDPO_SUBCTA";
        fieldValues += ", ?";
        values.add(this.getFdpoSubcta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_DEPOSITO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FDPO_ID_DEPOSITO = ?";
        values.add(this.getFdpoIdDeposito());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FDeposito instance = (FDeposito) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFdpoIdDeposito().equals(instance.getFdpoIdDeposito()))
            equalObjects = false;
        if (equalObjects && !this.getFdpoImporteDeposito().equals(instance.getFdpoImporteDeposito()))
            equalObjects = false;
        if (equalObjects && !this.getFdepFecha().equals(instance.getFdepFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFdpoCbaInstitucion().equals(instance.getFdpoCbaInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getFdepMoneda().equals(instance.getFdepMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFdpoConceptoDep().equals(instance.getFdpoConceptoDep()))
            equalObjects = false;
        if (equalObjects && !this.getFcinIdCtoInversion().equals(instance.getFcinIdCtoInversion()))
            equalObjects = false;
        if (equalObjects && !this.getFdepDescripcion().equals(instance.getFdepDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getFdepStatus().equals(instance.getFdepStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFtpfIdTipoPer().equals(instance.getFtpfIdTipoPer()))
            equalObjects = false;
        if (equalObjects && !this.getFtpfIdPersona().equals(instance.getFtpfIdPersona()))
            equalObjects = false;
        if (equalObjects && !this.getFfidIdFideicomiso().equals(instance.getFfidIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFdpoTipoCambioProv().equals(instance.getFdpoTipoCambioProv()))
            equalObjects = false;
        if (equalObjects && !this.getFdpoTipoCambioFirme().equals(instance.getFdpoTipoCambioFirme()))
            equalObjects = false;
        if (equalObjects && !this.getFdpoCtaCheques().equals(instance.getFdpoCtaCheques()))
            equalObjects = false;
        if (equalObjects && !this.getFdpoSubcta().equals(instance.getFdpoSubcta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FDeposito result = new FDeposito();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFdpoIdDeposito((BigDecimal) objectData.getData("FDPO_ID_DEPOSITO"));
        result.setFdpoImporteDeposito((BigDecimal) objectData.getData("FDPO_IMPORTE_DEPOSITO"));
        result.setFdepFecha((String) objectData.getData("FDEP_FECHA"));
        result.setFdpoCbaInstitucion((BigDecimal) objectData.getData("FDPO_CBA_INSTITUCION"));
        result.setFdepMoneda((BigDecimal) objectData.getData("FDEP_MONEDA"));
        result.setFdpoConceptoDep((BigDecimal) objectData.getData("FDPO_CONCEPTO_DEP"));
        result.setFcinIdCtoInversion((BigDecimal) objectData.getData("FCIN_ID_CTO_INVERSION"));
        result.setFdepDescripcion((String) objectData.getData("FDEP_DESCRIPCION"));
        result.setFdepStatus((String) objectData.getData("FDEP_STATUS"));
        result.setFtpfIdTipoPer((BigDecimal) objectData.getData("FTPF_ID_TIPO_PER"));
        result.setFtpfIdPersona((BigDecimal) objectData.getData("FTPF_ID_PERSONA"));
        result.setFfidIdFideicomiso((BigDecimal) objectData.getData("FFID_ID_FIDEICOMISO"));
        result.setFdpoTipoCambioProv((BigDecimal) objectData.getData("FDPO_TIPO_CAMBIO_PROV"));
        result.setFdpoTipoCambioFirme((BigDecimal) objectData.getData("FDPO_TIPO_CAMBIO_FIRME"));
        result.setFdpoCtaCheques((BigDecimal) objectData.getData("FDPO_CTA_CHEQUES"));
        result.setFdpoSubcta((BigDecimal) objectData.getData("FDPO_SUBCTA"));

        return result;

    }

}
