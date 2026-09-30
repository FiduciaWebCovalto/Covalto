package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REP_MDD_PK", columns = { "FMDD_SECUENCIAL", "FMDD_TIPO_ARCHIVO", "FMDD_FOLIO" }, sequences = { "MANUAL" })
public class FRepMdd extends DomainObject {

    BigDecimal fmddSecuencial = null;
    BigDecimal fmddTipoArchivo = null;
    BigDecimal fmddFolio = null;
    String fmddFiso = null;
    BigDecimal fmddCtoInversion = null;
    BigDecimal fmddImporte = null;
    BigDecimal fmddVistaPrevia = null;

    public FRepMdd() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmddSecuencial(BigDecimal fmddSecuencial) {
        this.fmddSecuencial = fmddSecuencial;
    }

    public BigDecimal getFmddSecuencial() {
        return this.fmddSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmddTipoArchivo(BigDecimal fmddTipoArchivo) {
        this.fmddTipoArchivo = fmddTipoArchivo;
    }

    public BigDecimal getFmddTipoArchivo() {
        return this.fmddTipoArchivo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmddFolio(BigDecimal fmddFolio) {
        this.fmddFolio = fmddFolio;
    }

    public BigDecimal getFmddFolio() {
        return this.fmddFolio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFmddFiso(String fmddFiso) {
        this.fmddFiso = fmddFiso;
    }

    public String getFmddFiso() {
        return this.fmddFiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmddCtoInversion(BigDecimal fmddCtoInversion) {
        this.fmddCtoInversion = fmddCtoInversion;
    }

    public BigDecimal getFmddCtoInversion() {
        return this.fmddCtoInversion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFmddImporte(BigDecimal fmddImporte) {
        this.fmddImporte = fmddImporte;
    }

    public BigDecimal getFmddImporte() {
        return this.fmddImporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFmddVistaPrevia(BigDecimal fmddVistaPrevia) {
        this.fmddVistaPrevia = fmddVistaPrevia;
    }

    public BigDecimal getFmddVistaPrevia() {
        return this.fmddVistaPrevia;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_MDD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFmddSecuencial() != null && this.getFmddSecuencial().longValue() == -999) {
            conditions += " AND FMDD_SECUENCIAL IS NULL";
        } else if (this.getFmddSecuencial() != null) {
            conditions += " AND FMDD_SECUENCIAL = ?";
            values.add(this.getFmddSecuencial());
        }

        if (this.getFmddTipoArchivo() != null && this.getFmddTipoArchivo().longValue() == -999) {
            conditions += " AND FMDD_TIPO_ARCHIVO IS NULL";
        } else if (this.getFmddTipoArchivo() != null) {
            conditions += " AND FMDD_TIPO_ARCHIVO = ?";
            values.add(this.getFmddTipoArchivo());
        }

        if (this.getFmddFolio() != null && this.getFmddFolio().longValue() == -999) {
            conditions += " AND FMDD_FOLIO IS NULL";
        } else if (this.getFmddFolio() != null) {
            conditions += " AND FMDD_FOLIO = ?";
            values.add(this.getFmddFolio());
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
        String sql = "SELECT * FROM F_REP_MDD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFmddSecuencial() != null && this.getFmddSecuencial().longValue() == -999) {
            conditions += " AND FMDD_SECUENCIAL IS NULL";
        } else if (this.getFmddSecuencial() != null) {
            conditions += " AND FMDD_SECUENCIAL = ?";
            values.add(this.getFmddSecuencial());
        }

        if (this.getFmddTipoArchivo() != null && this.getFmddTipoArchivo().longValue() == -999) {
            conditions += " AND FMDD_TIPO_ARCHIVO IS NULL";
        } else if (this.getFmddTipoArchivo() != null) {
            conditions += " AND FMDD_TIPO_ARCHIVO = ?";
            values.add(this.getFmddTipoArchivo());
        }

        if (this.getFmddFolio() != null && this.getFmddFolio().longValue() == -999) {
            conditions += " AND FMDD_FOLIO IS NULL";
        } else if (this.getFmddFolio() != null) {
            conditions += " AND FMDD_FOLIO = ?";
            values.add(this.getFmddFolio());
        }

        if (this.getFmddFiso() != null && "null".equals(this.getFmddFiso())) {
            conditions += " AND FMDD_FISO IS NULL";
        } else if (this.getFmddFiso() != null) {
            conditions += " AND FMDD_FISO = ?";
            values.add(this.getFmddFiso());
        }

        if (this.getFmddCtoInversion() != null && this.getFmddCtoInversion().longValue() == -999) {
            conditions += " AND FMDD_CTO_INVERSION IS NULL";
        } else if (this.getFmddCtoInversion() != null) {
            conditions += " AND FMDD_CTO_INVERSION = ?";
            values.add(this.getFmddCtoInversion());
        }

        if (this.getFmddImporte() != null && this.getFmddImporte().longValue() == -999) {
            conditions += " AND FMDD_IMPORTE IS NULL";
        } else if (this.getFmddImporte() != null) {
            conditions += " AND FMDD_IMPORTE = ?";
            values.add(this.getFmddImporte());
        }

        if (this.getFmddVistaPrevia() != null && this.getFmddVistaPrevia().longValue() == -999) {
            conditions += " AND FMDD_VISTA_PREVIA IS NULL";
        } else if (this.getFmddVistaPrevia() != null) {
            conditions += " AND FMDD_VISTA_PREVIA = ?";
            values.add(this.getFmddVistaPrevia());
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
        String sql = "UPDATE F_REP_MDD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FMDD_SECUENCIAL = ?";
        pkValues.add(this.getFmddSecuencial());
        conditions += " AND FMDD_TIPO_ARCHIVO = ?";
        pkValues.add(this.getFmddTipoArchivo());
        conditions += " AND FMDD_FOLIO = ?";
        pkValues.add(this.getFmddFolio());
        fields += " FMDD_FISO = ?, ";
        values.add(this.getFmddFiso());
        fields += " FMDD_CTO_INVERSION = ?, ";
        values.add(this.getFmddCtoInversion());
        fields += " FMDD_IMPORTE = ?, ";
        values.add(this.getFmddImporte());
        fields += " FMDD_VISTA_PREVIA = ?, ";
        values.add(this.getFmddVistaPrevia());
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
        String sql = "INSERT INTO F_REP_MDD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FMDD_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFmddSecuencial());

        fields += ", FMDD_TIPO_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getFmddTipoArchivo());

        fields += ", FMDD_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFmddFolio());

        fields += ", FMDD_FISO";
        fieldValues += ", ?";
        values.add(this.getFmddFiso());

        fields += ", FMDD_CTO_INVERSION";
        fieldValues += ", ?";
        values.add(this.getFmddCtoInversion());

        fields += ", FMDD_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFmddImporte());

        fields += ", FMDD_VISTA_PREVIA";
        fieldValues += ", ?";
        values.add(this.getFmddVistaPrevia());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REP_MDD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FMDD_SECUENCIAL = ?";
        values.add(this.getFmddSecuencial());
        conditions += " AND FMDD_TIPO_ARCHIVO = ?";
        values.add(this.getFmddTipoArchivo());
        conditions += " AND FMDD_FOLIO = ?";
        values.add(this.getFmddFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepMdd instance = (FRepMdd) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFmddSecuencial().equals(instance.getFmddSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFmddTipoArchivo().equals(instance.getFmddTipoArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getFmddFolio().equals(instance.getFmddFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFmddFiso().equals(instance.getFmddFiso()))
            equalObjects = false;
        if (equalObjects && !this.getFmddCtoInversion().equals(instance.getFmddCtoInversion()))
            equalObjects = false;
        if (equalObjects && !this.getFmddImporte().equals(instance.getFmddImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFmddVistaPrevia().equals(instance.getFmddVistaPrevia()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepMdd result = new FRepMdd();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFmddSecuencial((BigDecimal) objectData.getData("FMDD_SECUENCIAL"));
        result.setFmddTipoArchivo((BigDecimal) objectData.getData("FMDD_TIPO_ARCHIVO"));
        result.setFmddFolio((BigDecimal) objectData.getData("FMDD_FOLIO"));
        result.setFmddFiso((String) objectData.getData("FMDD_FISO"));
        result.setFmddCtoInversion((BigDecimal) objectData.getData("FMDD_CTO_INVERSION"));
        result.setFmddImporte((BigDecimal) objectData.getData("FMDD_IMPORTE"));
        result.setFmddVistaPrevia((BigDecimal) objectData.getData("FMDD_VISTA_PREVIA"));

        return result;

    }

}
