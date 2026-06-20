package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;


@PrimaryKey(constraintName = "ACOMITE_PK", columns = { "ACO_NUM_MIEMBRO", "ACO_ANTEPROYECTO" }, sequences = { "MANUAL" })
public class Acomite extends DomainObject {

    BigDecimal acoAnteproyecto = null;
    BigDecimal acoNumMiembro = null;
    String acoNomMiembro = null;
    String acoCveParticipa = null;
    String acoCveTipoFirma = null;
    String acoCveStAcomite = null;
    String acoInstitucion = null;
    String acoNomPuesto = null;

    public Acomite() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcoAnteproyecto(BigDecimal acoAnteproyecto) {
        this.acoAnteproyecto = acoAnteproyecto;
    }

    public BigDecimal getAcoAnteproyecto() {
        return this.acoAnteproyecto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcoNumMiembro(BigDecimal acoNumMiembro) {
        this.acoNumMiembro = acoNumMiembro;
    }

    public BigDecimal getAcoNumMiembro() {
        return this.acoNumMiembro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcoNomMiembro(String acoNomMiembro) {
        this.acoNomMiembro = acoNomMiembro;
    }

    public String getAcoNomMiembro() {
        return this.acoNomMiembro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcoCveParticipa(String acoCveParticipa) {
        this.acoCveParticipa = acoCveParticipa;
    }

    public String getAcoCveParticipa() {
        return this.acoCveParticipa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcoCveTipoFirma(String acoCveTipoFirma) {
        this.acoCveTipoFirma = acoCveTipoFirma;
    }

    public String getAcoCveTipoFirma() {
        return this.acoCveTipoFirma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcoCveStAcomite(String acoCveStAcomite) {
        this.acoCveStAcomite = acoCveStAcomite;
    }

    public String getAcoCveStAcomite() {
        return this.acoCveStAcomite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcoInstitucion(String acoInstitucion) {
        this.acoInstitucion = acoInstitucion;
    }

    public String getAcoInstitucion() {
        return this.acoInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcoNomPuesto(String acoNomPuesto) {
        this.acoNomPuesto = acoNomPuesto;
    }

    public String getAcoNomPuesto() {
        return this.acoNomPuesto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ACOMITE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAcoAnteproyecto() != null && this.getAcoAnteproyecto().longValue() == -999) {
            conditions += " AND ACO_ANTEPROYECTO IS NULL";
        } else if (this.getAcoAnteproyecto() != null) {
            conditions += " AND ACO_ANTEPROYECTO = ?";
            values.add(this.getAcoAnteproyecto());
        }

        if (this.getAcoNumMiembro() != null && this.getAcoNumMiembro().longValue() == -999) {
            conditions += " AND ACO_NUM_MIEMBRO IS NULL";
        } else if (this.getAcoNumMiembro() != null) {
            conditions += " AND ACO_NUM_MIEMBRO = ?";
            values.add(this.getAcoNumMiembro());
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
        String sql = "SELECT * FROM ACOMITE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAcoAnteproyecto() != null && this.getAcoAnteproyecto().longValue() == -999) {
            conditions += " AND ACO_ANTEPROYECTO IS NULL";
        } else if (this.getAcoAnteproyecto() != null) {
            conditions += " AND ACO_ANTEPROYECTO = ?";
            values.add(this.getAcoAnteproyecto());
        }

        if (this.getAcoNumMiembro() != null && this.getAcoNumMiembro().longValue() == -999) {
            conditions += " AND ACO_NUM_MIEMBRO IS NULL";
        } else if (this.getAcoNumMiembro() != null) {
            conditions += " AND ACO_NUM_MIEMBRO = ?";
            values.add(this.getAcoNumMiembro());
        }

        if (this.getAcoNomMiembro() != null && "null".equals(this.getAcoNomMiembro())) {
            conditions += " AND ACO_NOM_MIEMBRO IS NULL";
        } else if (this.getAcoNomMiembro() != null) {
            conditions += " AND ACO_NOM_MIEMBRO = ?";
            values.add(this.getAcoNomMiembro());
        }

        if (this.getAcoCveParticipa() != null && "null".equals(this.getAcoCveParticipa())) {
            conditions += " AND ACO_CVE_PARTICIPA IS NULL";
        } else if (this.getAcoCveParticipa() != null) {
            conditions += " AND ACO_CVE_PARTICIPA = ?";
            values.add(this.getAcoCveParticipa());
        }

        if (this.getAcoCveTipoFirma() != null && "null".equals(this.getAcoCveTipoFirma())) {
            conditions += " AND ACO_CVE_TIPO_FIRMA IS NULL";
        } else if (this.getAcoCveTipoFirma() != null) {
            conditions += " AND ACO_CVE_TIPO_FIRMA = ?";
            values.add(this.getAcoCveTipoFirma());
        }

        if (this.getAcoCveStAcomite() != null && "null".equals(this.getAcoCveStAcomite())) {
            conditions += " AND ACO_CVE_ST_ACOMITE IS NULL";
        } else if (this.getAcoCveStAcomite() != null) {
            conditions += " AND ACO_CVE_ST_ACOMITE = ?";
            values.add(this.getAcoCveStAcomite());
        }

        if (this.getAcoInstitucion() != null && "null".equals(this.getAcoInstitucion())) {
            conditions += " AND ACO_INSTITUCION IS NULL";
        } else if (this.getAcoInstitucion() != null) {
            conditions += " AND ACO_INSTITUCION = ?";
            values.add(this.getAcoInstitucion());
        }

        if (this.getAcoNomPuesto() != null && "null".equals(this.getAcoNomPuesto())) {
            conditions += " AND ACO_NOM_PUESTO IS NULL";
        } else if (this.getAcoNomPuesto() != null) {
            conditions += " AND ACO_NOM_PUESTO = ?";
            values.add(this.getAcoNomPuesto());
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
        String sql = "UPDATE ACOMITE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ACO_ANTEPROYECTO = ?";
        pkValues.add(this.getAcoAnteproyecto());
        conditions += " AND ACO_NUM_MIEMBRO = ?";
        pkValues.add(this.getAcoNumMiembro());
        fields += " ACO_NOM_MIEMBRO = ?, ";
        values.add(this.getAcoNomMiembro());
        fields += " ACO_CVE_PARTICIPA = ?, ";
        values.add(this.getAcoCveParticipa());
        fields += " ACO_CVE_TIPO_FIRMA = ?, ";
        values.add(this.getAcoCveTipoFirma());
        fields += " ACO_CVE_ST_ACOMITE = ?, ";
        values.add(this.getAcoCveStAcomite());
        fields += " ACO_INSTITUCION = ?, ";
        values.add(this.getAcoInstitucion());
        fields += " ACO_NOM_PUESTO = ?, ";
        values.add(this.getAcoNomPuesto());
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
        String sql = "INSERT INTO ACOMITE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ACO_ANTEPROYECTO";
        fieldValues += ", ?";
        values.add(this.getAcoAnteproyecto());

        fields += ", ACO_NUM_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getAcoNumMiembro());

        fields += ", ACO_NOM_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getAcoNomMiembro());

        fields += ", ACO_CVE_PARTICIPA";
        fieldValues += ", ?";
        values.add(this.getAcoCveParticipa());

        fields += ", ACO_CVE_TIPO_FIRMA";
        fieldValues += ", ?";
        values.add(this.getAcoCveTipoFirma());

        fields += ", ACO_CVE_ST_ACOMITE";
        fieldValues += ", ?";
        values.add(this.getAcoCveStAcomite());

        fields += ", ACO_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getAcoInstitucion());

        fields += ", ACO_NOM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getAcoNomPuesto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ACOMITE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ACO_ANTEPROYECTO = ?";
        values.add(this.getAcoAnteproyecto());
        conditions += " AND ACO_NUM_MIEMBRO = ?";
        values.add(this.getAcoNumMiembro());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Acomite instance = (Acomite) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAcoAnteproyecto().equals(instance.getAcoAnteproyecto()))
            equalObjects = false;
        if (equalObjects && !this.getAcoNumMiembro().equals(instance.getAcoNumMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getAcoNomMiembro().equals(instance.getAcoNomMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getAcoCveParticipa().equals(instance.getAcoCveParticipa()))
            equalObjects = false;
        if (equalObjects && !this.getAcoCveTipoFirma().equals(instance.getAcoCveTipoFirma()))
            equalObjects = false;
        if (equalObjects && !this.getAcoCveStAcomite().equals(instance.getAcoCveStAcomite()))
            equalObjects = false;
        if (equalObjects && !this.getAcoInstitucion().equals(instance.getAcoInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getAcoNomPuesto().equals(instance.getAcoNomPuesto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Acomite result = new Acomite();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAcoAnteproyecto((BigDecimal) objectData.getData("ACO_ANTEPROYECTO"));
        result.setAcoNumMiembro((BigDecimal) objectData.getData("ACO_NUM_MIEMBRO"));
        result.setAcoNomMiembro((String) objectData.getData("ACO_NOM_MIEMBRO"));
        result.setAcoCveParticipa((String) objectData.getData("ACO_CVE_PARTICIPA"));
        result.setAcoCveTipoFirma((String) objectData.getData("ACO_CVE_TIPO_FIRMA"));
        result.setAcoCveStAcomite((String) objectData.getData("ACO_CVE_ST_ACOMITE"));
        result.setAcoInstitucion((String) objectData.getData("ACO_INSTITUCION"));
        result.setAcoNomPuesto((String) objectData.getData("ACO_NOM_PUESTO"));

        return result;

    }

}
