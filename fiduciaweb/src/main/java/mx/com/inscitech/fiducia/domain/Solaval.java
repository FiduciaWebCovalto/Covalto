package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SOLAVAL_PK", columns = { "SOL_NUM_SOLICITUD", "SOL_ID_CLIENTE" }, sequences = { "MANUAL" })
public class Solaval extends DomainObject {

    String solNumSolicitud = null;
    BigDecimal solIdCliente = null;
    String solNomSolicitante = null;
    String solFechaSolicitud = null;
    String solSignatario = null;
    String solObservaciones = null;
    BigDecimal solAnoAltaReg = null;
    BigDecimal solMesAltaReg = null;
    BigDecimal solDiaAltaReg = null;
    BigDecimal solAnoUltMod = null;
    BigDecimal solMesUltMod = null;
    BigDecimal solDiaUltMod = null;
    String solCveStSolaval = null;

    public Solaval() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSolNumSolicitud(String solNumSolicitud) {
        this.solNumSolicitud = solNumSolicitud;
    }

    public String getSolNumSolicitud() {
        return this.solNumSolicitud;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSolIdCliente(BigDecimal solIdCliente) {
        this.solIdCliente = solIdCliente;
    }

    public BigDecimal getSolIdCliente() {
        return this.solIdCliente;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSolNomSolicitante(String solNomSolicitante) {
        this.solNomSolicitante = solNomSolicitante;
    }

    public String getSolNomSolicitante() {
        return this.solNomSolicitante;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSolFechaSolicitud(String solFechaSolicitud) {
        this.solFechaSolicitud = solFechaSolicitud;
    }

    public String getSolFechaSolicitud() {
        return this.solFechaSolicitud;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSolSignatario(String solSignatario) {
        this.solSignatario = solSignatario;
    }

    public String getSolSignatario() {
        return this.solSignatario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSolObservaciones(String solObservaciones) {
        this.solObservaciones = solObservaciones;
    }

    public String getSolObservaciones() {
        return this.solObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSolAnoAltaReg(BigDecimal solAnoAltaReg) {
        this.solAnoAltaReg = solAnoAltaReg;
    }

    public BigDecimal getSolAnoAltaReg() {
        return this.solAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSolMesAltaReg(BigDecimal solMesAltaReg) {
        this.solMesAltaReg = solMesAltaReg;
    }

    public BigDecimal getSolMesAltaReg() {
        return this.solMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSolDiaAltaReg(BigDecimal solDiaAltaReg) {
        this.solDiaAltaReg = solDiaAltaReg;
    }

    public BigDecimal getSolDiaAltaReg() {
        return this.solDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSolAnoUltMod(BigDecimal solAnoUltMod) {
        this.solAnoUltMod = solAnoUltMod;
    }

    public BigDecimal getSolAnoUltMod() {
        return this.solAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSolMesUltMod(BigDecimal solMesUltMod) {
        this.solMesUltMod = solMesUltMod;
    }

    public BigDecimal getSolMesUltMod() {
        return this.solMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSolDiaUltMod(BigDecimal solDiaUltMod) {
        this.solDiaUltMod = solDiaUltMod;
    }

    public BigDecimal getSolDiaUltMod() {
        return this.solDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSolCveStSolaval(String solCveStSolaval) {
        this.solCveStSolaval = solCveStSolaval;
    }

    public String getSolCveStSolaval() {
        return this.solCveStSolaval;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SOLAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSolNumSolicitud() != null && "null".equals(this.getSolNumSolicitud())) {
            conditions += " AND SOL_NUM_SOLICITUD IS NULL";
        } else if (this.getSolNumSolicitud() != null) {
            conditions += " AND SOL_NUM_SOLICITUD = ?";
            values.add(this.getSolNumSolicitud());
        }

        if (this.getSolIdCliente() != null && this.getSolIdCliente().longValue() == -999) {
            conditions += " AND SOL_ID_CLIENTE IS NULL";
        } else if (this.getSolIdCliente() != null) {
            conditions += " AND SOL_ID_CLIENTE = ?";
            values.add(this.getSolIdCliente());
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
        String sql = "SELECT * FROM SOLAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSolNumSolicitud() != null && "null".equals(this.getSolNumSolicitud())) {
            conditions += " AND SOL_NUM_SOLICITUD IS NULL";
        } else if (this.getSolNumSolicitud() != null) {
            conditions += " AND SOL_NUM_SOLICITUD = ?";
            values.add(this.getSolNumSolicitud());
        }

        if (this.getSolIdCliente() != null && this.getSolIdCliente().longValue() == -999) {
            conditions += " AND SOL_ID_CLIENTE IS NULL";
        } else if (this.getSolIdCliente() != null) {
            conditions += " AND SOL_ID_CLIENTE = ?";
            values.add(this.getSolIdCliente());
        }

        if (this.getSolNomSolicitante() != null && "null".equals(this.getSolNomSolicitante())) {
            conditions += " AND SOL_NOM_SOLICITANTE IS NULL";
        } else if (this.getSolNomSolicitante() != null) {
            conditions += " AND SOL_NOM_SOLICITANTE = ?";
            values.add(this.getSolNomSolicitante());
        }

        if (this.getSolFechaSolicitud() != null && "null".equals(this.getSolFechaSolicitud())) {
            conditions += " AND SOL_FECHA_SOLICITUD IS NULL";
        } else if (this.getSolFechaSolicitud() != null) {
            conditions += " AND SOL_FECHA_SOLICITUD = ?";
            values.add(this.getSolFechaSolicitud());
        }

        if (this.getSolSignatario() != null && "null".equals(this.getSolSignatario())) {
            conditions += " AND SOL_SIGNATARIO IS NULL";
        } else if (this.getSolSignatario() != null) {
            conditions += " AND SOL_SIGNATARIO = ?";
            values.add(this.getSolSignatario());
        }

        if (this.getSolObservaciones() != null && "null".equals(this.getSolObservaciones())) {
            conditions += " AND SOL_OBSERVACIONES IS NULL";
        } else if (this.getSolObservaciones() != null) {
            conditions += " AND SOL_OBSERVACIONES = ?";
            values.add(this.getSolObservaciones());
        }

        if (this.getSolAnoAltaReg() != null && this.getSolAnoAltaReg().longValue() == -999) {
            conditions += " AND SOL_ANO_ALTA_REG IS NULL";
        } else if (this.getSolAnoAltaReg() != null) {
            conditions += " AND SOL_ANO_ALTA_REG = ?";
            values.add(this.getSolAnoAltaReg());
        }

        if (this.getSolMesAltaReg() != null && this.getSolMesAltaReg().longValue() == -999) {
            conditions += " AND SOL_MES_ALTA_REG IS NULL";
        } else if (this.getSolMesAltaReg() != null) {
            conditions += " AND SOL_MES_ALTA_REG = ?";
            values.add(this.getSolMesAltaReg());
        }

        if (this.getSolDiaAltaReg() != null && this.getSolDiaAltaReg().longValue() == -999) {
            conditions += " AND SOL_DIA_ALTA_REG IS NULL";
        } else if (this.getSolDiaAltaReg() != null) {
            conditions += " AND SOL_DIA_ALTA_REG = ?";
            values.add(this.getSolDiaAltaReg());
        }

        if (this.getSolAnoUltMod() != null && this.getSolAnoUltMod().longValue() == -999) {
            conditions += " AND SOL_ANO_ULT_MOD IS NULL";
        } else if (this.getSolAnoUltMod() != null) {
            conditions += " AND SOL_ANO_ULT_MOD = ?";
            values.add(this.getSolAnoUltMod());
        }

        if (this.getSolMesUltMod() != null && this.getSolMesUltMod().longValue() == -999) {
            conditions += " AND SOL_MES_ULT_MOD IS NULL";
        } else if (this.getSolMesUltMod() != null) {
            conditions += " AND SOL_MES_ULT_MOD = ?";
            values.add(this.getSolMesUltMod());
        }

        if (this.getSolDiaUltMod() != null && this.getSolDiaUltMod().longValue() == -999) {
            conditions += " AND SOL_DIA_ULT_MOD IS NULL";
        } else if (this.getSolDiaUltMod() != null) {
            conditions += " AND SOL_DIA_ULT_MOD = ?";
            values.add(this.getSolDiaUltMod());
        }

        if (this.getSolCveStSolaval() != null && "null".equals(this.getSolCveStSolaval())) {
            conditions += " AND SOL_CVE_ST_SOLAVAL IS NULL";
        } else if (this.getSolCveStSolaval() != null) {
            conditions += " AND SOL_CVE_ST_SOLAVAL = ?";
            values.add(this.getSolCveStSolaval());
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
        String sql = "UPDATE SOLAVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SOL_NUM_SOLICITUD = ?";
        pkValues.add(this.getSolNumSolicitud());
        conditions += " AND SOL_ID_CLIENTE = ?";
        pkValues.add(this.getSolIdCliente());
        fields += " SOL_NOM_SOLICITANTE = ?, ";
        values.add(this.getSolNomSolicitante());
        fields += " SOL_FECHA_SOLICITUD = ?, ";
        values.add(this.getSolFechaSolicitud());
        fields += " SOL_SIGNATARIO = ?, ";
        values.add(this.getSolSignatario());
        fields += " SOL_OBSERVACIONES = ?, ";
        values.add(this.getSolObservaciones());
        fields += " SOL_ANO_ALTA_REG = ?, ";
        values.add(this.getSolAnoAltaReg());
        fields += " SOL_MES_ALTA_REG = ?, ";
        values.add(this.getSolMesAltaReg());
        fields += " SOL_DIA_ALTA_REG = ?, ";
        values.add(this.getSolDiaAltaReg());
        fields += " SOL_ANO_ULT_MOD = ?, ";
        values.add(this.getSolAnoUltMod());
        fields += " SOL_MES_ULT_MOD = ?, ";
        values.add(this.getSolMesUltMod());
        fields += " SOL_DIA_ULT_MOD = ?, ";
        values.add(this.getSolDiaUltMod());
        fields += " SOL_CVE_ST_SOLAVAL = ?, ";
        values.add(this.getSolCveStSolaval());
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
        String sql = "INSERT INTO SOLAVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SOL_NUM_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getSolNumSolicitud());

        fields += ", SOL_ID_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getSolIdCliente());

        fields += ", SOL_NOM_SOLICITANTE";
        fieldValues += ", ?";
        values.add(this.getSolNomSolicitante());

        fields += ", SOL_FECHA_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getSolFechaSolicitud());

        fields += ", SOL_SIGNATARIO";
        fieldValues += ", ?";
        values.add(this.getSolSignatario());

        fields += ", SOL_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getSolObservaciones());

        fields += ", SOL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSolAnoAltaReg());

        fields += ", SOL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSolMesAltaReg());

        fields += ", SOL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSolDiaAltaReg());

        fields += ", SOL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSolAnoUltMod());

        fields += ", SOL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSolMesUltMod());

        fields += ", SOL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSolDiaUltMod());

        fields += ", SOL_CVE_ST_SOLAVAL";
        fieldValues += ", ?";
        values.add(this.getSolCveStSolaval());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SOLAVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SOL_NUM_SOLICITUD = ?";
        values.add(this.getSolNumSolicitud());
        conditions += " AND SOL_ID_CLIENTE = ?";
        values.add(this.getSolIdCliente());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Solaval instance = (Solaval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSolNumSolicitud().equals(instance.getSolNumSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getSolIdCliente().equals(instance.getSolIdCliente()))
            equalObjects = false;
        if (equalObjects && !this.getSolNomSolicitante().equals(instance.getSolNomSolicitante()))
            equalObjects = false;
        if (equalObjects && !this.getSolFechaSolicitud().equals(instance.getSolFechaSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getSolSignatario().equals(instance.getSolSignatario()))
            equalObjects = false;
        if (equalObjects && !this.getSolObservaciones().equals(instance.getSolObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getSolAnoAltaReg().equals(instance.getSolAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSolMesAltaReg().equals(instance.getSolMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSolDiaAltaReg().equals(instance.getSolDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSolAnoUltMod().equals(instance.getSolAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSolMesUltMod().equals(instance.getSolMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSolDiaUltMod().equals(instance.getSolDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSolCveStSolaval().equals(instance.getSolCveStSolaval()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Solaval result = new Solaval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSolNumSolicitud((String) objectData.getData("SOL_NUM_SOLICITUD"));
        result.setSolIdCliente((BigDecimal) objectData.getData("SOL_ID_CLIENTE"));
        result.setSolNomSolicitante((String) objectData.getData("SOL_NOM_SOLICITANTE"));
        result.setSolFechaSolicitud((String) objectData.getData("SOL_FECHA_SOLICITUD"));
        result.setSolSignatario((String) objectData.getData("SOL_SIGNATARIO"));
        result.setSolObservaciones((String) objectData.getData("SOL_OBSERVACIONES"));
        result.setSolAnoAltaReg((BigDecimal) objectData.getData("SOL_ANO_ALTA_REG"));
        result.setSolMesAltaReg((BigDecimal) objectData.getData("SOL_MES_ALTA_REG"));
        result.setSolDiaAltaReg((BigDecimal) objectData.getData("SOL_DIA_ALTA_REG"));
        result.setSolAnoUltMod((BigDecimal) objectData.getData("SOL_ANO_ULT_MOD"));
        result.setSolMesUltMod((BigDecimal) objectData.getData("SOL_MES_ULT_MOD"));
        result.setSolDiaUltMod((BigDecimal) objectData.getData("SOL_DIA_ULT_MOD"));
        result.setSolCveStSolaval((String) objectData.getData("SOL_CVE_ST_SOLAVAL"));

        return result;

    }

}
