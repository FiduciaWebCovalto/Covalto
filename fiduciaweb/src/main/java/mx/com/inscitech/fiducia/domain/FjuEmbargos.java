package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class FjuEmbargos extends DomainObject {
    String femIdFideicomiso = null;
    String femTipoDeEmbargo = null;
    String femMontoEmbargado = null;
    String femDescripcionInmueble = null;
    String femNoDeOficio = null;
    String femDictamenLegal = null;
    BigDecimal femFolioWf = null;

    public FjuEmbargos() {
        super();
        this.pkColumns = 8;
    }

    public void setFemIdFideicomiso(String femIdFideicomiso) {
        this.femIdFideicomiso = femIdFideicomiso;
    }

    public void setFemTipoDeEmbargo(String femTipoDeEmbargo) {
        this.femTipoDeEmbargo = femTipoDeEmbargo;
    }

    public void setFemMontoEmbargado(String femMontoEmbargado) {
        this.femMontoEmbargado = femMontoEmbargado;
    }

    public void setFemDescripcionInmueble(String femDescripcionInmueble) {
        this.femDescripcionInmueble = femDescripcionInmueble;
    }

    public void setFemNoDeOficio(String femNoDeOficio) {
        this.femNoDeOficio = femNoDeOficio;
    }

    public void setFemDictamenLegal(String femDictamenLegal) {
        this.femDictamenLegal = femDictamenLegal;
    }

    public void setFemFolioWf(BigDecimal femFolioWf) {
        this.femFolioWf = femFolioWf;
    }

    public String getFemIdFideicomiso() {
        return this.femIdFideicomiso;
    }

    public String getFemTipoDeEmbargo() {
        return this.femTipoDeEmbargo;
    }

    public String getFemMontoEmbargado() {
        return this.femMontoEmbargado;
    }

    public String getFemDescripcionInmueble() {
        return this.femDescripcionInmueble;
    }

    public String getFemNoDeOficio() {
        return this.femNoDeOficio;
    }

    public String getFemDictamenLegal() {
        return this.femDictamenLegal;
    }

    public BigDecimal getFemFolioWf() {
        return this.femFolioWf;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FJU_EMBARGOS";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFemIdFideicomiso() != null && "null".equals(this.getFemIdFideicomiso())) {
            conditions += " AND FEM_ID_FIDEICOMISO IS NULL";
        } else if (this.getFemIdFideicomiso() != null) {
            conditions += " AND FEM_ID_FIDEICOMISO =?";
            values.add(this.getFemIdFideicomiso());
        }
        if (this.getFemNoDeOficio() != null && "null".equals(this.getFemNoDeOficio())) {
            conditions += " AND FEM_NO_DE_OFICIO IS NULL";
        } else if (this.getFemNoDeOficio() != null) {
            conditions += " AND FEM_NO_DE_OFICIO =?";
            values.add(this.getFemNoDeOficio());
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
        String sql = "SELECT * FROM FJU_EMBARGOS ";
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
        String sql = "UPDATE FJU_EMBARGOS SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND FEM_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFemIdFideicomiso());
        fields += " FEM_TIPO_DE_EMBARGO = ?, ";
        values.add(this.getFemTipoDeEmbargo());
        fields += " FEM_MONTO_EMBARGADO = ?, ";
        values.add(this.getFemMontoEmbargado());
        fields += " FEM_DESCRIPCION_INMUEBLE = ?, ";
        values.add(this.getFemDescripcionInmueble());
        conditions += " AND FEM_NO_DE_OFICIO = ?";
        pkValues.add(this.getFemNoDeOficio());
        fields += " FEM_DICTAMEN_LEGAL = ?, ";
        values.add(this.getFemDictamenLegal());
        fields += " FEM_FOLIO_WF = ?, ";
        values.add(this.getFemFolioWf());
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
        String sql = "INSERT INTO FJU_EMBARGOS ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FEM_ID_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFemIdFideicomiso());
        fields += ",FEM_TIPO_DE_EMBARGO ";
        fieldValues += ", ?";
        values.add(this.getFemTipoDeEmbargo());
        fields += ",FEM_MONTO_EMBARGADO ";
        fieldValues += ", ?";
        values.add(this.getFemMontoEmbargado());
        fields += ",FEM_DESCRIPCION_INMUEBLE ";
        fieldValues += ", ?";
        values.add(this.getFemDescripcionInmueble());
        fields += ",FEM_NO_DE_OFICIO ";
        fieldValues += ", ?";
        values.add(this.getFemNoDeOficio());
        fields += ",FEM_DICTAMEN_LEGAL ";
        fieldValues += ", ?";
        values.add(this.getFemDictamenLegal());
        fields += ",FEM_FOLIO_WF ";
        fieldValues += ", ?";
        values.add(this.getFemFolioWf());
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
        String sql = "DELETE FROM FJU_EMBARGOS WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FEM_ID_FIDEICOMISO = ?";
        values.add(this.getFemIdFideicomiso());
        conditions += " AND FEM_NO_DE_OFICIO = ?";
        values.add(this.getFemNoDeOficio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FjuEmbargos instance = (FjuEmbargos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFemIdFideicomiso().equals(instance.getFemIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFemTipoDeEmbargo().equals(instance.getFemTipoDeEmbargo()))
            equalObjects = false;
        if (equalObjects && !this.getFemMontoEmbargado().equals(instance.getFemMontoEmbargado()))
            equalObjects = false;
        if (equalObjects && !this.getFemDescripcionInmueble().equals(instance.getFemDescripcionInmueble()))
            equalObjects = false;
        if (equalObjects && !this.getFemNoDeOficio().equals(instance.getFemNoDeOficio()))
            equalObjects = false;
        if (equalObjects && !this.getFemDictamenLegal().equals(instance.getFemDictamenLegal()))
            equalObjects = false;
        if (equalObjects && !this.getFemFolioWf().equals(instance.getFemFolioWf()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FjuEmbargos result = new FjuEmbargos();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFemIdFideicomiso((String) objectData.getData("FEM_ID_FIDEICOMISO"));
        result.setFemTipoDeEmbargo((String) objectData.getData("FEM_TIPO_DE_EMBARGO"));
        result.setFemMontoEmbargado((String) objectData.getData("FEM_MONTO_EMBARGADO"));
        result.setFemDescripcionInmueble((String) objectData.getData("FEM_DESCRIPCION_INMUEBLE"));
        result.setFemNoDeOficio((String) objectData.getData("FEM_NO_DE_OFICIO"));
        result.setFemDictamenLegal((String) objectData.getData("FEM_DICTAMEN_LEGAL"));
        result.setFemFolioWf((BigDecimal) objectData.getData("FEM_FOLIO_WF"));
        return result;
    }
}
