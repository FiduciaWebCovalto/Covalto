package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPORTE_CONC_MOV_PK", columns = { "RCM_TIPO_NEGOCIO", "RCM_NUM_CONTRATO", "RCM_ENC_CTAM", "RCM_ENC_SCTA", "RCM_ENC_SSCTA", "RCM_ENC_CUENTA" },
            sequences = { "MANUAL" })
public class ReporteConcMov extends DomainObject {

    String rcmTipoNegocio = null;
    BigDecimal rcmNumContrato = null;
    String rcmNomContrato = null;
    String rcmEncCtam = null;
    String rcmEncScta = null;
    String rcmEncSscta = null;
    String rcmEncCuenta = null;
    BigDecimal rcmSiniCa = null;
    BigDecimal rcmSiniSa = null;
    BigDecimal rcmCargosCa = null;
    BigDecimal rcmCargosSa = null;
    BigDecimal rcmAbonosCa = null;
    BigDecimal rcmAbonosSa = null;
    BigDecimal rcmSactCa = null;
    BigDecimal rcmSactSa = null;
    String rcmUsuario = null;

    public ReporteConcMov() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcmTipoNegocio(String rcmTipoNegocio) {
        this.rcmTipoNegocio = rcmTipoNegocio;
    }

    public String getRcmTipoNegocio() {
        return this.rcmTipoNegocio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRcmNumContrato(BigDecimal rcmNumContrato) {
        this.rcmNumContrato = rcmNumContrato;
    }

    public BigDecimal getRcmNumContrato() {
        return this.rcmNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcmNomContrato(String rcmNomContrato) {
        this.rcmNomContrato = rcmNomContrato;
    }

    public String getRcmNomContrato() {
        return this.rcmNomContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcmEncCtam(String rcmEncCtam) {
        this.rcmEncCtam = rcmEncCtam;
    }

    public String getRcmEncCtam() {
        return this.rcmEncCtam;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcmEncScta(String rcmEncScta) {
        this.rcmEncScta = rcmEncScta;
    }

    public String getRcmEncScta() {
        return this.rcmEncScta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcmEncSscta(String rcmEncSscta) {
        this.rcmEncSscta = rcmEncSscta;
    }

    public String getRcmEncSscta() {
        return this.rcmEncSscta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcmEncCuenta(String rcmEncCuenta) {
        this.rcmEncCuenta = rcmEncCuenta;
    }

    public String getRcmEncCuenta() {
        return this.rcmEncCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRcmSiniCa(BigDecimal rcmSiniCa) {
        this.rcmSiniCa = rcmSiniCa;
    }

    public BigDecimal getRcmSiniCa() {
        return this.rcmSiniCa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRcmSiniSa(BigDecimal rcmSiniSa) {
        this.rcmSiniSa = rcmSiniSa;
    }

    public BigDecimal getRcmSiniSa() {
        return this.rcmSiniSa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRcmCargosCa(BigDecimal rcmCargosCa) {
        this.rcmCargosCa = rcmCargosCa;
    }

    public BigDecimal getRcmCargosCa() {
        return this.rcmCargosCa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRcmCargosSa(BigDecimal rcmCargosSa) {
        this.rcmCargosSa = rcmCargosSa;
    }

    public BigDecimal getRcmCargosSa() {
        return this.rcmCargosSa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRcmAbonosCa(BigDecimal rcmAbonosCa) {
        this.rcmAbonosCa = rcmAbonosCa;
    }

    public BigDecimal getRcmAbonosCa() {
        return this.rcmAbonosCa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRcmAbonosSa(BigDecimal rcmAbonosSa) {
        this.rcmAbonosSa = rcmAbonosSa;
    }

    public BigDecimal getRcmAbonosSa() {
        return this.rcmAbonosSa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRcmSactCa(BigDecimal rcmSactCa) {
        this.rcmSactCa = rcmSactCa;
    }

    public BigDecimal getRcmSactCa() {
        return this.rcmSactCa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRcmSactSa(BigDecimal rcmSactSa) {
        this.rcmSactSa = rcmSactSa;
    }

    public BigDecimal getRcmSactSa() {
        return this.rcmSactSa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcmUsuario(String rcmUsuario) {
        this.rcmUsuario = rcmUsuario;
    }

    public String getRcmUsuario() {
        return this.rcmUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPORTE_CONC_MOV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRcmTipoNegocio() != null && "null".equals(this.getRcmTipoNegocio())) {
            conditions += " AND RCM_TIPO_NEGOCIO IS NULL";
        } else if (this.getRcmTipoNegocio() != null) {
            conditions += " AND RCM_TIPO_NEGOCIO = ?";
            values.add(this.getRcmTipoNegocio());
        }

        if (this.getRcmNumContrato() != null && this.getRcmNumContrato().longValue() == -999) {
            conditions += " AND RCM_NUM_CONTRATO IS NULL";
        } else if (this.getRcmNumContrato() != null) {
            conditions += " AND RCM_NUM_CONTRATO = ?";
            values.add(this.getRcmNumContrato());
        }

        if (this.getRcmEncCtam() != null && "null".equals(this.getRcmEncCtam())) {
            conditions += " AND RCM_ENC_CTAM IS NULL";
        } else if (this.getRcmEncCtam() != null) {
            conditions += " AND RCM_ENC_CTAM = ?";
            values.add(this.getRcmEncCtam());
        }

        if (this.getRcmEncScta() != null && "null".equals(this.getRcmEncScta())) {
            conditions += " AND RCM_ENC_SCTA IS NULL";
        } else if (this.getRcmEncScta() != null) {
            conditions += " AND RCM_ENC_SCTA = ?";
            values.add(this.getRcmEncScta());
        }

        if (this.getRcmEncSscta() != null && "null".equals(this.getRcmEncSscta())) {
            conditions += " AND RCM_ENC_SSCTA IS NULL";
        } else if (this.getRcmEncSscta() != null) {
            conditions += " AND RCM_ENC_SSCTA = ?";
            values.add(this.getRcmEncSscta());
        }

        if (this.getRcmEncCuenta() != null && "null".equals(this.getRcmEncCuenta())) {
            conditions += " AND RCM_ENC_CUENTA IS NULL";
        } else if (this.getRcmEncCuenta() != null) {
            conditions += " AND RCM_ENC_CUENTA = ?";
            values.add(this.getRcmEncCuenta());
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
        String sql = "SELECT * FROM REPORTE_CONC_MOV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRcmTipoNegocio() != null && "null".equals(this.getRcmTipoNegocio())) {
            conditions += " AND RCM_TIPO_NEGOCIO IS NULL";
        } else if (this.getRcmTipoNegocio() != null) {
            conditions += " AND RCM_TIPO_NEGOCIO = ?";
            values.add(this.getRcmTipoNegocio());
        }

        if (this.getRcmNumContrato() != null && this.getRcmNumContrato().longValue() == -999) {
            conditions += " AND RCM_NUM_CONTRATO IS NULL";
        } else if (this.getRcmNumContrato() != null) {
            conditions += " AND RCM_NUM_CONTRATO = ?";
            values.add(this.getRcmNumContrato());
        }

        if (this.getRcmNomContrato() != null && "null".equals(this.getRcmNomContrato())) {
            conditions += " AND RCM_NOM_CONTRATO IS NULL";
        } else if (this.getRcmNomContrato() != null) {
            conditions += " AND RCM_NOM_CONTRATO = ?";
            values.add(this.getRcmNomContrato());
        }

        if (this.getRcmEncCtam() != null && "null".equals(this.getRcmEncCtam())) {
            conditions += " AND RCM_ENC_CTAM IS NULL";
        } else if (this.getRcmEncCtam() != null) {
            conditions += " AND RCM_ENC_CTAM = ?";
            values.add(this.getRcmEncCtam());
        }

        if (this.getRcmEncScta() != null && "null".equals(this.getRcmEncScta())) {
            conditions += " AND RCM_ENC_SCTA IS NULL";
        } else if (this.getRcmEncScta() != null) {
            conditions += " AND RCM_ENC_SCTA = ?";
            values.add(this.getRcmEncScta());
        }

        if (this.getRcmEncSscta() != null && "null".equals(this.getRcmEncSscta())) {
            conditions += " AND RCM_ENC_SSCTA IS NULL";
        } else if (this.getRcmEncSscta() != null) {
            conditions += " AND RCM_ENC_SSCTA = ?";
            values.add(this.getRcmEncSscta());
        }

        if (this.getRcmEncCuenta() != null && "null".equals(this.getRcmEncCuenta())) {
            conditions += " AND RCM_ENC_CUENTA IS NULL";
        } else if (this.getRcmEncCuenta() != null) {
            conditions += " AND RCM_ENC_CUENTA = ?";
            values.add(this.getRcmEncCuenta());
        }

        if (this.getRcmSiniCa() != null && this.getRcmSiniCa().longValue() == -999) {
            conditions += " AND RCM_SINI_CA IS NULL";
        } else if (this.getRcmSiniCa() != null) {
            conditions += " AND RCM_SINI_CA = ?";
            values.add(this.getRcmSiniCa());
        }

        if (this.getRcmSiniSa() != null && this.getRcmSiniSa().longValue() == -999) {
            conditions += " AND RCM_SINI_SA IS NULL";
        } else if (this.getRcmSiniSa() != null) {
            conditions += " AND RCM_SINI_SA = ?";
            values.add(this.getRcmSiniSa());
        }

        if (this.getRcmCargosCa() != null && this.getRcmCargosCa().longValue() == -999) {
            conditions += " AND RCM_CARGOS_CA IS NULL";
        } else if (this.getRcmCargosCa() != null) {
            conditions += " AND RCM_CARGOS_CA = ?";
            values.add(this.getRcmCargosCa());
        }

        if (this.getRcmCargosSa() != null && this.getRcmCargosSa().longValue() == -999) {
            conditions += " AND RCM_CARGOS_SA IS NULL";
        } else if (this.getRcmCargosSa() != null) {
            conditions += " AND RCM_CARGOS_SA = ?";
            values.add(this.getRcmCargosSa());
        }

        if (this.getRcmAbonosCa() != null && this.getRcmAbonosCa().longValue() == -999) {
            conditions += " AND RCM_ABONOS_CA IS NULL";
        } else if (this.getRcmAbonosCa() != null) {
            conditions += " AND RCM_ABONOS_CA = ?";
            values.add(this.getRcmAbonosCa());
        }

        if (this.getRcmAbonosSa() != null && this.getRcmAbonosSa().longValue() == -999) {
            conditions += " AND RCM_ABONOS_SA IS NULL";
        } else if (this.getRcmAbonosSa() != null) {
            conditions += " AND RCM_ABONOS_SA = ?";
            values.add(this.getRcmAbonosSa());
        }

        if (this.getRcmSactCa() != null && this.getRcmSactCa().longValue() == -999) {
            conditions += " AND RCM_SACT_CA IS NULL";
        } else if (this.getRcmSactCa() != null) {
            conditions += " AND RCM_SACT_CA = ?";
            values.add(this.getRcmSactCa());
        }

        if (this.getRcmSactSa() != null && this.getRcmSactSa().longValue() == -999) {
            conditions += " AND RCM_SACT_SA IS NULL";
        } else if (this.getRcmSactSa() != null) {
            conditions += " AND RCM_SACT_SA = ?";
            values.add(this.getRcmSactSa());
        }

        if (this.getRcmUsuario() != null && "null".equals(this.getRcmUsuario())) {
            conditions += " AND RCM_USUARIO IS NULL";
        } else if (this.getRcmUsuario() != null) {
            conditions += " AND RCM_USUARIO = ?";
            values.add(this.getRcmUsuario());
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
        String sql = "UPDATE REPORTE_CONC_MOV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RCM_TIPO_NEGOCIO = ?";
        pkValues.add(this.getRcmTipoNegocio());
        conditions += " AND RCM_NUM_CONTRATO = ?";
        pkValues.add(this.getRcmNumContrato());
        fields += " RCM_NOM_CONTRATO = ?, ";
        values.add(this.getRcmNomContrato());
        conditions += " AND RCM_ENC_CTAM = ?";
        pkValues.add(this.getRcmEncCtam());
        conditions += " AND RCM_ENC_SCTA = ?";
        pkValues.add(this.getRcmEncScta());
        conditions += " AND RCM_ENC_SSCTA = ?";
        pkValues.add(this.getRcmEncSscta());
        conditions += " AND RCM_ENC_CUENTA = ?";
        pkValues.add(this.getRcmEncCuenta());
        fields += " RCM_SINI_CA = ?, ";
        values.add(this.getRcmSiniCa());
        fields += " RCM_SINI_SA = ?, ";
        values.add(this.getRcmSiniSa());
        fields += " RCM_CARGOS_CA = ?, ";
        values.add(this.getRcmCargosCa());
        fields += " RCM_CARGOS_SA = ?, ";
        values.add(this.getRcmCargosSa());
        fields += " RCM_ABONOS_CA = ?, ";
        values.add(this.getRcmAbonosCa());
        fields += " RCM_ABONOS_SA = ?, ";
        values.add(this.getRcmAbonosSa());
        fields += " RCM_SACT_CA = ?, ";
        values.add(this.getRcmSactCa());
        fields += " RCM_SACT_SA = ?, ";
        values.add(this.getRcmSactSa());
        fields += " RCM_USUARIO = ?, ";
        values.add(this.getRcmUsuario());
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
        String sql = "INSERT INTO REPORTE_CONC_MOV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RCM_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getRcmTipoNegocio());

        fields += ", RCM_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRcmNumContrato());

        fields += ", RCM_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRcmNomContrato());

        fields += ", RCM_ENC_CTAM";
        fieldValues += ", ?";
        values.add(this.getRcmEncCtam());

        fields += ", RCM_ENC_SCTA";
        fieldValues += ", ?";
        values.add(this.getRcmEncScta());

        fields += ", RCM_ENC_SSCTA";
        fieldValues += ", ?";
        values.add(this.getRcmEncSscta());

        fields += ", RCM_ENC_CUENTA";
        fieldValues += ", ?";
        values.add(this.getRcmEncCuenta());

        fields += ", RCM_SINI_CA";
        fieldValues += ", ?";
        values.add(this.getRcmSiniCa());

        fields += ", RCM_SINI_SA";
        fieldValues += ", ?";
        values.add(this.getRcmSiniSa());

        fields += ", RCM_CARGOS_CA";
        fieldValues += ", ?";
        values.add(this.getRcmCargosCa());

        fields += ", RCM_CARGOS_SA";
        fieldValues += ", ?";
        values.add(this.getRcmCargosSa());

        fields += ", RCM_ABONOS_CA";
        fieldValues += ", ?";
        values.add(this.getRcmAbonosCa());

        fields += ", RCM_ABONOS_SA";
        fieldValues += ", ?";
        values.add(this.getRcmAbonosSa());

        fields += ", RCM_SACT_CA";
        fieldValues += ", ?";
        values.add(this.getRcmSactCa());

        fields += ", RCM_SACT_SA";
        fieldValues += ", ?";
        values.add(this.getRcmSactSa());

        fields += ", RCM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getRcmUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPORTE_CONC_MOV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RCM_TIPO_NEGOCIO = ?";
        values.add(this.getRcmTipoNegocio());
        conditions += " AND RCM_NUM_CONTRATO = ?";
        values.add(this.getRcmNumContrato());
        conditions += " AND RCM_ENC_CTAM = ?";
        values.add(this.getRcmEncCtam());
        conditions += " AND RCM_ENC_SCTA = ?";
        values.add(this.getRcmEncScta());
        conditions += " AND RCM_ENC_SSCTA = ?";
        values.add(this.getRcmEncSscta());
        conditions += " AND RCM_ENC_CUENTA = ?";
        values.add(this.getRcmEncCuenta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ReporteConcMov instance = (ReporteConcMov) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRcmTipoNegocio().equals(instance.getRcmTipoNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getRcmNumContrato().equals(instance.getRcmNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRcmNomContrato().equals(instance.getRcmNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRcmEncCtam().equals(instance.getRcmEncCtam()))
            equalObjects = false;
        if (equalObjects && !this.getRcmEncScta().equals(instance.getRcmEncScta()))
            equalObjects = false;
        if (equalObjects && !this.getRcmEncSscta().equals(instance.getRcmEncSscta()))
            equalObjects = false;
        if (equalObjects && !this.getRcmEncCuenta().equals(instance.getRcmEncCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getRcmSiniCa().equals(instance.getRcmSiniCa()))
            equalObjects = false;
        if (equalObjects && !this.getRcmSiniSa().equals(instance.getRcmSiniSa()))
            equalObjects = false;
        if (equalObjects && !this.getRcmCargosCa().equals(instance.getRcmCargosCa()))
            equalObjects = false;
        if (equalObjects && !this.getRcmCargosSa().equals(instance.getRcmCargosSa()))
            equalObjects = false;
        if (equalObjects && !this.getRcmAbonosCa().equals(instance.getRcmAbonosCa()))
            equalObjects = false;
        if (equalObjects && !this.getRcmAbonosSa().equals(instance.getRcmAbonosSa()))
            equalObjects = false;
        if (equalObjects && !this.getRcmSactCa().equals(instance.getRcmSactCa()))
            equalObjects = false;
        if (equalObjects && !this.getRcmSactSa().equals(instance.getRcmSactSa()))
            equalObjects = false;
        if (equalObjects && !this.getRcmUsuario().equals(instance.getRcmUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ReporteConcMov result = new ReporteConcMov();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRcmTipoNegocio((String) objectData.getData("RCM_TIPO_NEGOCIO"));
        result.setRcmNumContrato((BigDecimal) objectData.getData("RCM_NUM_CONTRATO"));
        result.setRcmNomContrato((String) objectData.getData("RCM_NOM_CONTRATO"));
        result.setRcmEncCtam((String) objectData.getData("RCM_ENC_CTAM"));
        result.setRcmEncScta((String) objectData.getData("RCM_ENC_SCTA"));
        result.setRcmEncSscta((String) objectData.getData("RCM_ENC_SSCTA"));
        result.setRcmEncCuenta((String) objectData.getData("RCM_ENC_CUENTA"));
        result.setRcmSiniCa((BigDecimal) objectData.getData("RCM_SINI_CA"));
        result.setRcmSiniSa((BigDecimal) objectData.getData("RCM_SINI_SA"));
        result.setRcmCargosCa((BigDecimal) objectData.getData("RCM_CARGOS_CA"));
        result.setRcmCargosSa((BigDecimal) objectData.getData("RCM_CARGOS_SA"));
        result.setRcmAbonosCa((BigDecimal) objectData.getData("RCM_ABONOS_CA"));
        result.setRcmAbonosSa((BigDecimal) objectData.getData("RCM_ABONOS_SA"));
        result.setRcmSactCa((BigDecimal) objectData.getData("RCM_SACT_CA"));
        result.setRcmSactSa((BigDecimal) objectData.getData("RCM_SACT_SA"));
        result.setRcmUsuario((String) objectData.getData("RCM_USUARIO"));

        return result;

    }

}
