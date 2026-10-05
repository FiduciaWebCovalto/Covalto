package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_DOC_X_ETAPA_PK",
            columns = { "INS_NUM_CONTRATO", "INS_MUM_FOLIO_INST", "FBIS_NUM_ETAPA", "FTOP_NUM_OPER", "FETA_ID_ETAPA", "FDOC_ID_DOCUMENTO", "FPUR_ID_PUNTOREV" },
            sequences = { "MANUAL" })
public class FDocXEtapa extends DomainObject {

    BigDecimal insNumContrato = null;
    BigDecimal insMumFolioInst = null;
    BigDecimal fbisNumEtapa = null;
    String ftopNumOper = null;
    BigDecimal fetaIdEtapa = null;
    BigDecimal fdocIdDocumento = null;
    BigDecimal fpurIdPuntorev = null;
    String fdxeRevCorrecta = null;
    String fdxeObervacion = null;
    String fdxeFecha = null;

    public FDocXEtapa() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsNumContrato(BigDecimal insNumContrato) {
        this.insNumContrato = insNumContrato;
    }

    public BigDecimal getInsNumContrato() {
        return this.insNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsMumFolioInst(BigDecimal insMumFolioInst) {
        this.insMumFolioInst = insMumFolioInst;
    }

    public BigDecimal getInsMumFolioInst() {
        return this.insMumFolioInst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFbisNumEtapa(BigDecimal fbisNumEtapa) {
        this.fbisNumEtapa = fbisNumEtapa;
    }

    public BigDecimal getFbisNumEtapa() {
        return this.fbisNumEtapa;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFtopNumOper(String ftopNumOper) {
        this.ftopNumOper = ftopNumOper;
    }

    public String getFtopNumOper() {
        return this.ftopNumOper;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFetaIdEtapa(BigDecimal fetaIdEtapa) {
        this.fetaIdEtapa = fetaIdEtapa;
    }

    public BigDecimal getFetaIdEtapa() {
        return this.fetaIdEtapa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdocIdDocumento(BigDecimal fdocIdDocumento) {
        this.fdocIdDocumento = fdocIdDocumento;
    }

    public BigDecimal getFdocIdDocumento() {
        return this.fdocIdDocumento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpurIdPuntorev(BigDecimal fpurIdPuntorev) {
        this.fpurIdPuntorev = fpurIdPuntorev;
    }

    public BigDecimal getFpurIdPuntorev() {
        return this.fpurIdPuntorev;
    }

    @FieldInfo(nullable = false, dataType = "CHAR", javaClass = String.class)
    public void setFdxeRevCorrecta(String fdxeRevCorrecta) {
        this.fdxeRevCorrecta = fdxeRevCorrecta;
    }

    public String getFdxeRevCorrecta() {
        return this.fdxeRevCorrecta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdxeObervacion(String fdxeObervacion) {
        this.fdxeObervacion = fdxeObervacion;
    }

    public String getFdxeObervacion() {
        return this.fdxeObervacion;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFdxeFecha(String fdxeFecha) {
        this.fdxeFecha = fdxeFecha;
    }

    public String getFdxeFecha() {
        return this.fdxeFecha;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_DOC_X_ETAPA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
            conditions += " AND INS_NUM_CONTRATO IS NULL";
        } else if (this.getInsNumContrato() != null) {
            conditions += " AND INS_NUM_CONTRATO = ?";
            values.add(this.getInsNumContrato());
        }

        if (this.getInsMumFolioInst() != null && this.getInsMumFolioInst().longValue() == -999) {
            conditions += " AND INS_MUM_FOLIO_INST IS NULL";
        } else if (this.getInsMumFolioInst() != null) {
            conditions += " AND INS_MUM_FOLIO_INST = ?";
            values.add(this.getInsMumFolioInst());
        }

        if (this.getFbisNumEtapa() != null && this.getFbisNumEtapa().longValue() == -999) {
            conditions += " AND FBIS_NUM_ETAPA IS NULL";
        } else if (this.getFbisNumEtapa() != null) {
            conditions += " AND FBIS_NUM_ETAPA = ?";
            values.add(this.getFbisNumEtapa());
        }

        if (this.getFtopNumOper() != null && "null".equals(this.getFtopNumOper())) {
            conditions += " AND FTOP_NUM_OPER IS NULL";
        } else if (this.getFtopNumOper() != null) {
            conditions += " AND FTOP_NUM_OPER = ?";
            values.add(this.getFtopNumOper());
        }

        if (this.getFetaIdEtapa() != null && this.getFetaIdEtapa().longValue() == -999) {
            conditions += " AND FETA_ID_ETAPA IS NULL";
        } else if (this.getFetaIdEtapa() != null) {
            conditions += " AND FETA_ID_ETAPA = ?";
            values.add(this.getFetaIdEtapa());
        }

        if (this.getFdocIdDocumento() != null && this.getFdocIdDocumento().longValue() == -999) {
            conditions += " AND FDOC_ID_DOCUMENTO IS NULL";
        } else if (this.getFdocIdDocumento() != null) {
            conditions += " AND FDOC_ID_DOCUMENTO = ?";
            values.add(this.getFdocIdDocumento());
        }

        if (this.getFpurIdPuntorev() != null && this.getFpurIdPuntorev().longValue() == -999) {
            conditions += " AND FPUR_ID_PUNTOREV IS NULL";
        } else if (this.getFpurIdPuntorev() != null) {
            conditions += " AND FPUR_ID_PUNTOREV = ?";
            values.add(this.getFpurIdPuntorev());
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
        String sql = "SELECT * FROM F_DOC_X_ETAPA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
            conditions += " AND INS_NUM_CONTRATO IS NULL";
        } else if (this.getInsNumContrato() != null) {
            conditions += " AND INS_NUM_CONTRATO = ?";
            values.add(this.getInsNumContrato());
        }

        if (this.getInsMumFolioInst() != null && this.getInsMumFolioInst().longValue() == -999) {
            conditions += " AND INS_MUM_FOLIO_INST IS NULL";
        } else if (this.getInsMumFolioInst() != null) {
            conditions += " AND INS_MUM_FOLIO_INST = ?";
            values.add(this.getInsMumFolioInst());
        }

        if (this.getFbisNumEtapa() != null && this.getFbisNumEtapa().longValue() == -999) {
            conditions += " AND FBIS_NUM_ETAPA IS NULL";
        } else if (this.getFbisNumEtapa() != null) {
            conditions += " AND FBIS_NUM_ETAPA = ?";
            values.add(this.getFbisNumEtapa());
        }

        if (this.getFtopNumOper() != null && "null".equals(this.getFtopNumOper())) {
            conditions += " AND FTOP_NUM_OPER IS NULL";
        } else if (this.getFtopNumOper() != null) {
            conditions += " AND FTOP_NUM_OPER = ?";
            values.add(this.getFtopNumOper());
        }

        if (this.getFetaIdEtapa() != null && this.getFetaIdEtapa().longValue() == -999) {
            conditions += " AND FETA_ID_ETAPA IS NULL";
        } else if (this.getFetaIdEtapa() != null) {
            conditions += " AND FETA_ID_ETAPA = ?";
            values.add(this.getFetaIdEtapa());
        }

        if (this.getFdocIdDocumento() != null && this.getFdocIdDocumento().longValue() == -999) {
            conditions += " AND FDOC_ID_DOCUMENTO IS NULL";
        } else if (this.getFdocIdDocumento() != null) {
            conditions += " AND FDOC_ID_DOCUMENTO = ?";
            values.add(this.getFdocIdDocumento());
        }

        if (this.getFpurIdPuntorev() != null && this.getFpurIdPuntorev().longValue() == -999) {
            conditions += " AND FPUR_ID_PUNTOREV IS NULL";
        } else if (this.getFpurIdPuntorev() != null) {
            conditions += " AND FPUR_ID_PUNTOREV = ?";
            values.add(this.getFpurIdPuntorev());
        }

        if (this.getFdxeRevCorrecta() != null && "null".equals(this.getFdxeRevCorrecta())) {
            conditions += " AND FDXE_REV_CORRECTA IS NULL";
        } else if (this.getFdxeRevCorrecta() != null) {
            conditions += " AND FDXE_REV_CORRECTA = ?";
            values.add(this.getFdxeRevCorrecta());
        }

        if (this.getFdxeObervacion() != null && "null".equals(this.getFdxeObervacion())) {
            conditions += " AND FDXE_OBERVACION IS NULL";
        } else if (this.getFdxeObervacion() != null) {
            conditions += " AND FDXE_OBERVACION = ?";
            values.add(this.getFdxeObervacion());
        }

        if (this.getFdxeFecha() != null && "null".equals(this.getFdxeFecha())) {
            conditions += " AND FDXE_FECHA IS NULL";
        } else if (this.getFdxeFecha() != null) {
            conditions += " AND FDXE_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFdxeFecha());
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
        String sql = "UPDATE F_DOC_X_ETAPA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND INS_NUM_CONTRATO = ?";
        pkValues.add(this.getInsNumContrato());
        conditions += " AND INS_MUM_FOLIO_INST = ?";
        pkValues.add(this.getInsMumFolioInst());
        conditions += " AND FBIS_NUM_ETAPA = ?";
        pkValues.add(this.getFbisNumEtapa());
        conditions += " AND FTOP_NUM_OPER = ?";
        pkValues.add(this.getFtopNumOper());
        conditions += " AND FETA_ID_ETAPA = ?";
        pkValues.add(this.getFetaIdEtapa());
        conditions += " AND FDOC_ID_DOCUMENTO = ?";
        pkValues.add(this.getFdocIdDocumento());
        conditions += " AND FPUR_ID_PUNTOREV = ?";
        pkValues.add(this.getFpurIdPuntorev());
        fields += " FDXE_REV_CORRECTA = ?, ";
        values.add(this.getFdxeRevCorrecta());
        fields += " FDXE_OBERVACION = ?, ";
        values.add(this.getFdxeObervacion());
        fields += " FDXE_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFdxeFecha());
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
        String sql = "INSERT INTO F_DOC_X_ETAPA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", INS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getInsNumContrato());

        fields += ", INS_MUM_FOLIO_INST";
        fieldValues += ", ?";
        values.add(this.getInsMumFolioInst());

        fields += ", FBIS_NUM_ETAPA";
        fieldValues += ", ?";
        values.add(this.getFbisNumEtapa());

        fields += ", FTOP_NUM_OPER";
        fieldValues += ", ?";
        values.add(this.getFtopNumOper());

        fields += ", FETA_ID_ETAPA";
        fieldValues += ", ?";
        values.add(this.getFetaIdEtapa());

        fields += ", FDOC_ID_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getFdocIdDocumento());

        fields += ", FPUR_ID_PUNTOREV";
        fieldValues += ", ?";
        values.add(this.getFpurIdPuntorev());

        fields += ", FDXE_REV_CORRECTA";
        fieldValues += ", ?";
        values.add(this.getFdxeRevCorrecta());

        fields += ", FDXE_OBERVACION";
        fieldValues += ", ?";
        values.add(this.getFdxeObervacion());

        fields += ", FDXE_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFdxeFecha());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_DOC_X_ETAPA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND INS_NUM_CONTRATO = ?";
        values.add(this.getInsNumContrato());
        conditions += " AND INS_MUM_FOLIO_INST = ?";
        values.add(this.getInsMumFolioInst());
        conditions += " AND FBIS_NUM_ETAPA = ?";
        values.add(this.getFbisNumEtapa());
        conditions += " AND FTOP_NUM_OPER = ?";
        values.add(this.getFtopNumOper());
        conditions += " AND FETA_ID_ETAPA = ?";
        values.add(this.getFetaIdEtapa());
        conditions += " AND FDOC_ID_DOCUMENTO = ?";
        values.add(this.getFdocIdDocumento());
        conditions += " AND FPUR_ID_PUNTOREV = ?";
        values.add(this.getFpurIdPuntorev());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FDocXEtapa instance = (FDocXEtapa) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getInsNumContrato().equals(instance.getInsNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getInsMumFolioInst().equals(instance.getInsMumFolioInst()))
            equalObjects = false;
        if (equalObjects && !this.getFbisNumEtapa().equals(instance.getFbisNumEtapa()))
            equalObjects = false;
        if (equalObjects && !this.getFtopNumOper().equals(instance.getFtopNumOper()))
            equalObjects = false;
        if (equalObjects && !this.getFetaIdEtapa().equals(instance.getFetaIdEtapa()))
            equalObjects = false;
        if (equalObjects && !this.getFdocIdDocumento().equals(instance.getFdocIdDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getFpurIdPuntorev().equals(instance.getFpurIdPuntorev()))
            equalObjects = false;
        if (equalObjects && !this.getFdxeRevCorrecta().equals(instance.getFdxeRevCorrecta()))
            equalObjects = false;
        if (equalObjects && !this.getFdxeObervacion().equals(instance.getFdxeObervacion()))
            equalObjects = false;
        if (equalObjects && !this.getFdxeFecha().equals(instance.getFdxeFecha()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FDocXEtapa result = new FDocXEtapa();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setInsNumContrato((BigDecimal) objectData.getData("INS_NUM_CONTRATO"));
        result.setInsMumFolioInst((BigDecimal) objectData.getData("INS_MUM_FOLIO_INST"));
        result.setFbisNumEtapa((BigDecimal) objectData.getData("FBIS_NUM_ETAPA"));
        result.setFtopNumOper((String) objectData.getData("FTOP_NUM_OPER"));
        result.setFetaIdEtapa((BigDecimal) objectData.getData("FETA_ID_ETAPA"));
        result.setFdocIdDocumento((BigDecimal) objectData.getData("FDOC_ID_DOCUMENTO"));
        result.setFpurIdPuntorev((BigDecimal) objectData.getData("FPUR_ID_PUNTOREV"));
        result.setFdxeRevCorrecta((String) objectData.getData("FDXE_REV_CORRECTA"));
        result.setFdxeObervacion((String) objectData.getData("FDXE_OBERVACION"));
        result.setFdxeFecha((String) objectData.getData("FDXE_FECHA"));

        return result;

    }

}
