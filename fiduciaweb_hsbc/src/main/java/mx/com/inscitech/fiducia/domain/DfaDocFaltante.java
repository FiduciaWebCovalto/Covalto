package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;


public class DfaDocFaltante extends DomainObject {
    String dfaNumFideicomisio = null;
    String dfaTipoFideicomiso = null;
    String dfaTipoDocumento = null;
    String dfaDetalle = null;
    String dfaPrioridad = null;
    BigDecimal dfaFolioWf = null;

    public DfaDocFaltante() {
        super();
        this.pkColumns = 8;
    }

    public void setDfaNumFideicomisio(String dfaNumFideicomisio) {
        this.dfaNumFideicomisio = dfaNumFideicomisio;
    }

    public void setDfaTipoFideicomiso(String dfaTipoFideicomiso) {
        this.dfaTipoFideicomiso = dfaTipoFideicomiso;
    }

    public void setDfaTipoDocumento(String dfaTipoDocumento) {
        this.dfaTipoDocumento = dfaTipoDocumento;
    }

    public void setDfaDetalle(String dfaDetalle) {
        this.dfaDetalle = dfaDetalle;
    }

    public void setDfaPrioridad(String dfaPrioridad) {
        this.dfaPrioridad = dfaPrioridad;
    }

    public void setDfaFolioWf(BigDecimal dfaFolioWf) {
        this.dfaFolioWf = dfaFolioWf;
    }

    public String getDfaNumFideicomisio() {
        return this.dfaNumFideicomisio;
    }

    public String getDfaTipoFideicomiso() {
        return this.dfaTipoFideicomiso;
    }

    public String getDfaTipoDocumento() {
        return this.dfaTipoDocumento;
    }

    public String getDfaDetalle() {
        return this.dfaDetalle;
    }

    public String getDfaPrioridad() {
        return this.dfaPrioridad;
    }

    public BigDecimal getDfaFolioWf() {
        return this.dfaFolioWf;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DFA_DOC_FALTANTE";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getDfaNumFideicomisio() != null && "null".equals(this.getDfaNumFideicomisio())) {
            conditions += " AND DFA_NUM_FIDEICOMISIO IS NULL";
        } else if (this.getDfaNumFideicomisio() != null) {
            conditions += " AND DFA_NUM_FIDEICOMISIO =?";
            values.add(this.getDfaNumFideicomisio());
        }
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getSelect() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DFA_DOC_FALTANTE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE DFA_DOC_FALTANTE SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND DFA_NUM_FIDEICOMISIO = ?";
        pkValues.add(this.getDfaNumFideicomisio());
        fields += " DFA_TIPO_FIDEICOMISO = ?, ";
        values.add(this.getDfaTipoFideicomiso());
        fields += " DFA_TIPO_DOCUMENTO = ?, ";
        values.add(this.getDfaTipoDocumento());
        fields += " DFA_DETALLE = ?, ";
        values.add(this.getDfaDetalle());
        fields += " DFA_PRIORIDAD = ?, ";
        values.add(this.getDfaPrioridad());
        fields += " DFA_FOLIO_WF = ?, ";
        values.add(this.getDfaFolioWf());
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
        String sql = "INSERT INTO DFA_DOC_FALTANTE ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",DFA_NUM_FIDEICOMISIO ";
        fieldValues += ", ?";
        values.add(this.getDfaNumFideicomisio());
        fields += ",DFA_TIPO_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getDfaTipoFideicomiso());
        fields += ",DFA_TIPO_DOCUMENTO ";
        fieldValues += ", ?";
        values.add(this.getDfaTipoDocumento());
        fields += ",DFA_DETALLE ";
        fieldValues += ", ?";
        values.add(this.getDfaDetalle());
        fields += ",DFA_PRIORIDAD ";
        fieldValues += ", ?";
        values.add(this.getDfaPrioridad());
        fields += ",DFA_FOLIO_WF ";
        fieldValues += ", ?";
        values.add(this.getDfaFolioWf());
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
        String sql = "DELETE FROM DFA_DOC_FALTANTE WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND DFA_NUM_FIDEICOMISIO = ?";
        values.add(this.getDfaNumFideicomisio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        DfaDocFaltante instance = (DfaDocFaltante) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDfaNumFideicomisio().equals(instance.getDfaNumFideicomisio()))
            equalObjects = false;
        if (equalObjects && !this.getDfaTipoFideicomiso().equals(instance.getDfaTipoFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getDfaTipoDocumento().equals(instance.getDfaTipoDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getDfaDetalle().equals(instance.getDfaDetalle()))
            equalObjects = false;
        if (equalObjects && !this.getDfaPrioridad().equals(instance.getDfaPrioridad()))
            equalObjects = false;
        if (equalObjects && !this.getDfaFolioWf().equals(instance.getDfaFolioWf()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        DfaDocFaltante result = new DfaDocFaltante();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setDfaNumFideicomisio((String) objectData.getData("DFA_NUM_FIDEICOMISIO"));
        result.setDfaTipoFideicomiso((String) objectData.getData("DFA_TIPO_FIDEICOMISO"));
        result.setDfaTipoDocumento((String) objectData.getData("DFA_TIPO_DOCUMENTO"));
        result.setDfaDetalle((String) objectData.getData("DFA_DETALLE"));
        result.setDfaPrioridad((String) objectData.getData("DFA_PRIORIDAD"));
        result.setDfaFolioWf((BigDecimal) objectData.getData("DFA_FOLIO_WF"));
        return result;
    }
}
