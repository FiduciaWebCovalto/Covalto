package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_DEPOSITOS_MASIVOS_PK", columns = { "FDMA_FOLIO_TEMP", "FDMA_FOLIO", "FDMA_SECUENCIAL" }, sequences = { "MANUAL" })
public class FDepositosMasivos extends DomainObject {

    BigDecimal fdmaFolioTemp = null;
    BigDecimal fdmaFolio = null;
    BigDecimal fdmaSecuencial = null;
    String fdmaInstitucion = null;
    String fdmaCuenta = null;
    BigDecimal fdmaImporte = null;
    String fdmaComentario = null;
    String fdmaReferencia = null;

    public FDepositosMasivos() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdmaFolioTemp(BigDecimal fdmaFolioTemp) {
        this.fdmaFolioTemp = fdmaFolioTemp;
    }

    public BigDecimal getFdmaFolioTemp() {
        return this.fdmaFolioTemp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdmaFolio(BigDecimal fdmaFolio) {
        this.fdmaFolio = fdmaFolio;
    }

    public BigDecimal getFdmaFolio() {
        return this.fdmaFolio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdmaSecuencial(BigDecimal fdmaSecuencial) {
        this.fdmaSecuencial = fdmaSecuencial;
    }

    public BigDecimal getFdmaSecuencial() {
        return this.fdmaSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdmaInstitucion(String fdmaInstitucion) {
        this.fdmaInstitucion = fdmaInstitucion;
    }

    public String getFdmaInstitucion() {
        return this.fdmaInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdmaCuenta(String fdmaCuenta) {
        this.fdmaCuenta = fdmaCuenta;
    }

    public String getFdmaCuenta() {
        return this.fdmaCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFdmaImporte(BigDecimal fdmaImporte) {
        this.fdmaImporte = fdmaImporte;
    }

    public BigDecimal getFdmaImporte() {
        return this.fdmaImporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdmaComentario(String fdmaComentario) {
        this.fdmaComentario = fdmaComentario;
    }

    public String getFdmaComentario() {
        return this.fdmaComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdmaReferencia(String fdmaReferencia) {
        this.fdmaReferencia = fdmaReferencia;
    }

    public String getFdmaReferencia() {
        return this.fdmaReferencia;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_DEPOSITOS_MASIVOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFdmaFolioTemp() != null && this.getFdmaFolioTemp().longValue() == -999) {
            conditions += " AND FDMA_FOLIO_TEMP IS NULL";
        } else if (this.getFdmaFolioTemp() != null) {
            conditions += " AND FDMA_FOLIO_TEMP = ?";
            values.add(this.getFdmaFolioTemp());
        }

        if (this.getFdmaFolio() != null && this.getFdmaFolio().longValue() == -999) {
            conditions += " AND FDMA_FOLIO IS NULL";
        } else if (this.getFdmaFolio() != null) {
            conditions += " AND FDMA_FOLIO = ?";
            values.add(this.getFdmaFolio());
        }

        if (this.getFdmaSecuencial() != null && this.getFdmaSecuencial().longValue() == -999) {
            conditions += " AND FDMA_SECUENCIAL IS NULL";
        } else if (this.getFdmaSecuencial() != null) {
            conditions += " AND FDMA_SECUENCIAL = ?";
            values.add(this.getFdmaSecuencial());
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
        String sql = "SELECT * FROM F_DEPOSITOS_MASIVOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFdmaFolioTemp() != null && this.getFdmaFolioTemp().longValue() == -999) {
            conditions += " AND FDMA_FOLIO_TEMP IS NULL";
        } else if (this.getFdmaFolioTemp() != null) {
            conditions += " AND FDMA_FOLIO_TEMP = ?";
            values.add(this.getFdmaFolioTemp());
        }

        if (this.getFdmaFolio() != null && this.getFdmaFolio().longValue() == -999) {
            conditions += " AND FDMA_FOLIO IS NULL";
        } else if (this.getFdmaFolio() != null) {
            conditions += " AND FDMA_FOLIO = ?";
            values.add(this.getFdmaFolio());
        }

        if (this.getFdmaSecuencial() != null && this.getFdmaSecuencial().longValue() == -999) {
            conditions += " AND FDMA_SECUENCIAL IS NULL";
        } else if (this.getFdmaSecuencial() != null) {
            conditions += " AND FDMA_SECUENCIAL = ?";
            values.add(this.getFdmaSecuencial());
        }

        if (this.getFdmaInstitucion() != null && "null".equals(this.getFdmaInstitucion())) {
            conditions += " AND FDMA_INSTITUCION IS NULL";
        } else if (this.getFdmaInstitucion() != null) {
            conditions += " AND FDMA_INSTITUCION = ?";
            values.add(this.getFdmaInstitucion());
        }

        if (this.getFdmaCuenta() != null && "null".equals(this.getFdmaCuenta())) {
            conditions += " AND FDMA_CUENTA IS NULL";
        } else if (this.getFdmaCuenta() != null) {
            conditions += " AND FDMA_CUENTA = ?";
            values.add(this.getFdmaCuenta());
        }

        if (this.getFdmaImporte() != null && this.getFdmaImporte().longValue() == -999) {
            conditions += " AND FDMA_IMPORTE IS NULL";
        } else if (this.getFdmaImporte() != null) {
            conditions += " AND FDMA_IMPORTE = ?";
            values.add(this.getFdmaImporte());
        }

        if (this.getFdmaComentario() != null && "null".equals(this.getFdmaComentario())) {
            conditions += " AND FDMA_COMENTARIO IS NULL";
        } else if (this.getFdmaComentario() != null) {
            conditions += " AND FDMA_COMENTARIO = ?";
            values.add(this.getFdmaComentario());
        }

        if (this.getFdmaReferencia() != null && "null".equals(this.getFdmaReferencia())) {
            conditions += " AND FDMA_REFERENCIA IS NULL";
        } else if (this.getFdmaReferencia() != null) {
            conditions += " AND FDMA_REFERENCIA = ?";
            values.add(this.getFdmaReferencia());
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
        String sql = "UPDATE F_DEPOSITOS_MASIVOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FDMA_FOLIO_TEMP = ?";
        pkValues.add(this.getFdmaFolioTemp());
        conditions += " AND FDMA_FOLIO = ?";
        pkValues.add(this.getFdmaFolio());
        conditions += " AND FDMA_SECUENCIAL = ?";
        pkValues.add(this.getFdmaSecuencial());
        fields += " FDMA_INSTITUCION = ?, ";
        values.add(this.getFdmaInstitucion());
        fields += " FDMA_CUENTA = ?, ";
        values.add(this.getFdmaCuenta());
        fields += " FDMA_IMPORTE = ?, ";
        values.add(this.getFdmaImporte());
        fields += " FDMA_COMENTARIO = ?, ";
        values.add(this.getFdmaComentario());
        fields += " FDMA_REFERENCIA = ?, ";
        values.add(this.getFdmaReferencia());
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
        String sql = "INSERT INTO F_DEPOSITOS_MASIVOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FDMA_FOLIO_TEMP";
        fieldValues += ", ?";
        values.add(this.getFdmaFolioTemp());

        fields += ", FDMA_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFdmaFolio());

        fields += ", FDMA_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFdmaSecuencial());

        fields += ", FDMA_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getFdmaInstitucion());

        fields += ", FDMA_CUENTA";
        fieldValues += ", ?";
        values.add(this.getFdmaCuenta());

        fields += ", FDMA_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFdmaImporte());

        fields += ", FDMA_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFdmaComentario());

        fields += ", FDMA_REFERENCIA";
        fieldValues += ", ?";
        values.add(this.getFdmaReferencia());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_DEPOSITOS_MASIVOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FDMA_FOLIO_TEMP = ?";
        values.add(this.getFdmaFolioTemp());
        conditions += " AND FDMA_FOLIO = ?";
        values.add(this.getFdmaFolio());
        conditions += " AND FDMA_SECUENCIAL = ?";
        values.add(this.getFdmaSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FDepositosMasivos instance = (FDepositosMasivos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFdmaFolioTemp().equals(instance.getFdmaFolioTemp()))
            equalObjects = false;
        if (equalObjects && !this.getFdmaFolio().equals(instance.getFdmaFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFdmaSecuencial().equals(instance.getFdmaSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFdmaInstitucion().equals(instance.getFdmaInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getFdmaCuenta().equals(instance.getFdmaCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFdmaImporte().equals(instance.getFdmaImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFdmaComentario().equals(instance.getFdmaComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFdmaReferencia().equals(instance.getFdmaReferencia()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FDepositosMasivos result = new FDepositosMasivos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFdmaFolioTemp((BigDecimal) objectData.getData("FDMA_FOLIO_TEMP"));
        result.setFdmaFolio((BigDecimal) objectData.getData("FDMA_FOLIO"));
        result.setFdmaSecuencial((BigDecimal) objectData.getData("FDMA_SECUENCIAL"));
        result.setFdmaInstitucion((String) objectData.getData("FDMA_INSTITUCION"));
        result.setFdmaCuenta((String) objectData.getData("FDMA_CUENTA"));
        result.setFdmaImporte((BigDecimal) objectData.getData("FDMA_IMPORTE"));
        result.setFdmaComentario((String) objectData.getData("FDMA_COMENTARIO"));
        result.setFdmaReferencia((String) objectData.getData("FDMA_REFERENCIA"));

        return result;

    }

}
