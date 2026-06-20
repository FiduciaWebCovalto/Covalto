package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CONTROL_PK", columns = { "CTRL_ID_MOVTO", "CTRL_ID_TIPO_MOVTO", "CTRL_FECHA" }, sequences = { "MANUAL" })
public class FControl extends DomainObject {

    BigDecimal ctrlIdMovto = null;
    BigDecimal ctrlIdTipoMovto = null;
    String ctrlFecha = null;
    BigDecimal ctrlFiso = null;
    BigDecimal ctrlSubcta = null;
    BigDecimal ctrlCtoinver = null;
    BigDecimal ctrlCtaCheques = null;
    BigDecimal ctrlFisoDestino = null;
    BigDecimal ctrlSubctaDestino = null;
    BigDecimal ctrlCtoinverDestino = null;
    BigDecimal ctrlCtaChequesDestino = null;
    BigDecimal ctrlImporte = null;
    String ctrlDescripcion = null;
    BigDecimal ctrlMoneda = null;
    String ctrlStatus = null;

    public FControl() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlIdMovto(BigDecimal ctrlIdMovto) {
        this.ctrlIdMovto = ctrlIdMovto;
    }

    public BigDecimal getCtrlIdMovto() {
        return this.ctrlIdMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlIdTipoMovto(BigDecimal ctrlIdTipoMovto) {
        this.ctrlIdTipoMovto = ctrlIdTipoMovto;
    }

    public BigDecimal getCtrlIdTipoMovto() {
        return this.ctrlIdTipoMovto;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setCtrlFecha(String ctrlFecha) {
        this.ctrlFecha = ctrlFecha;
    }

    public String getCtrlFecha() {
        return this.ctrlFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlFiso(BigDecimal ctrlFiso) {
        this.ctrlFiso = ctrlFiso;
    }

    public BigDecimal getCtrlFiso() {
        return this.ctrlFiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlSubcta(BigDecimal ctrlSubcta) {
        this.ctrlSubcta = ctrlSubcta;
    }

    public BigDecimal getCtrlSubcta() {
        return this.ctrlSubcta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlCtoinver(BigDecimal ctrlCtoinver) {
        this.ctrlCtoinver = ctrlCtoinver;
    }

    public BigDecimal getCtrlCtoinver() {
        return this.ctrlCtoinver;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlCtaCheques(BigDecimal ctrlCtaCheques) {
        this.ctrlCtaCheques = ctrlCtaCheques;
    }

    public BigDecimal getCtrlCtaCheques() {
        return this.ctrlCtaCheques;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlFisoDestino(BigDecimal ctrlFisoDestino) {
        this.ctrlFisoDestino = ctrlFisoDestino;
    }

    public BigDecimal getCtrlFisoDestino() {
        return this.ctrlFisoDestino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlSubctaDestino(BigDecimal ctrlSubctaDestino) {
        this.ctrlSubctaDestino = ctrlSubctaDestino;
    }

    public BigDecimal getCtrlSubctaDestino() {
        return this.ctrlSubctaDestino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlCtoinverDestino(BigDecimal ctrlCtoinverDestino) {
        this.ctrlCtoinverDestino = ctrlCtoinverDestino;
    }

    public BigDecimal getCtrlCtoinverDestino() {
        return this.ctrlCtoinverDestino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlCtaChequesDestino(BigDecimal ctrlCtaChequesDestino) {
        this.ctrlCtaChequesDestino = ctrlCtaChequesDestino;
    }

    public BigDecimal getCtrlCtaChequesDestino() {
        return this.ctrlCtaChequesDestino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCtrlImporte(BigDecimal ctrlImporte) {
        this.ctrlImporte = ctrlImporte;
    }

    public BigDecimal getCtrlImporte() {
        return this.ctrlImporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtrlDescripcion(String ctrlDescripcion) {
        this.ctrlDescripcion = ctrlDescripcion;
    }

    public String getCtrlDescripcion() {
        return this.ctrlDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtrlMoneda(BigDecimal ctrlMoneda) {
        this.ctrlMoneda = ctrlMoneda;
    }

    public BigDecimal getCtrlMoneda() {
        return this.ctrlMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtrlStatus(String ctrlStatus) {
        this.ctrlStatus = ctrlStatus;
    }

    public String getCtrlStatus() {
        return this.ctrlStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONTROL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtrlIdMovto() != null && this.getCtrlIdMovto().longValue() == -999) {
            conditions += " AND CTRL_ID_MOVTO IS NULL";
        } else if (this.getCtrlIdMovto() != null) {
            conditions += " AND CTRL_ID_MOVTO = ?";
            values.add(this.getCtrlIdMovto());
        }

        if (this.getCtrlIdTipoMovto() != null && this.getCtrlIdTipoMovto().longValue() == -999) {
            conditions += " AND CTRL_ID_TIPO_MOVTO IS NULL";
        } else if (this.getCtrlIdTipoMovto() != null) {
            conditions += " AND CTRL_ID_TIPO_MOVTO = ?";
            values.add(this.getCtrlIdTipoMovto());
        }

        if (this.getCtrlFecha() != null && "null".equals(this.getCtrlFecha())) {
            conditions += " AND CTRL_FECHA IS NULL";
        } else if (this.getCtrlFecha() != null) {
            conditions += " AND CTRL_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getCtrlFecha());
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
        String sql = "SELECT * FROM F_CONTROL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtrlIdMovto() != null && this.getCtrlIdMovto().longValue() == -999) {
            conditions += " AND CTRL_ID_MOVTO IS NULL";
        } else if (this.getCtrlIdMovto() != null) {
            conditions += " AND CTRL_ID_MOVTO = ?";
            values.add(this.getCtrlIdMovto());
        }

        if (this.getCtrlIdTipoMovto() != null && this.getCtrlIdTipoMovto().longValue() == -999) {
            conditions += " AND CTRL_ID_TIPO_MOVTO IS NULL";
        } else if (this.getCtrlIdTipoMovto() != null) {
            conditions += " AND CTRL_ID_TIPO_MOVTO = ?";
            values.add(this.getCtrlIdTipoMovto());
        }

        if (this.getCtrlFecha() != null && "null".equals(this.getCtrlFecha())) {
            conditions += " AND CTRL_FECHA IS NULL";
        } else if (this.getCtrlFecha() != null) {
            conditions += " AND CTRL_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getCtrlFecha());
        }

        if (this.getCtrlFiso() != null && this.getCtrlFiso().longValue() == -999) {
            conditions += " AND CTRL_FISO IS NULL";
        } else if (this.getCtrlFiso() != null) {
            conditions += " AND CTRL_FISO = ?";
            values.add(this.getCtrlFiso());
        }

        if (this.getCtrlSubcta() != null && this.getCtrlSubcta().longValue() == -999) {
            conditions += " AND CTRL_SUBCTA IS NULL";
        } else if (this.getCtrlSubcta() != null) {
            conditions += " AND CTRL_SUBCTA = ?";
            values.add(this.getCtrlSubcta());
        }

        if (this.getCtrlCtoinver() != null && this.getCtrlCtoinver().longValue() == -999) {
            conditions += " AND CTRL_CTOINVER IS NULL";
        } else if (this.getCtrlCtoinver() != null) {
            conditions += " AND CTRL_CTOINVER = ?";
            values.add(this.getCtrlCtoinver());
        }

        if (this.getCtrlCtaCheques() != null && this.getCtrlCtaCheques().longValue() == -999) {
            conditions += " AND CTRL_CTA_CHEQUES IS NULL";
        } else if (this.getCtrlCtaCheques() != null) {
            conditions += " AND CTRL_CTA_CHEQUES = ?";
            values.add(this.getCtrlCtaCheques());
        }

        if (this.getCtrlFisoDestino() != null && this.getCtrlFisoDestino().longValue() == -999) {
            conditions += " AND CTRL_FISO_DESTINO IS NULL";
        } else if (this.getCtrlFisoDestino() != null) {
            conditions += " AND CTRL_FISO_DESTINO = ?";
            values.add(this.getCtrlFisoDestino());
        }

        if (this.getCtrlSubctaDestino() != null && this.getCtrlSubctaDestino().longValue() == -999) {
            conditions += " AND CTRL_SUBCTA_DESTINO IS NULL";
        } else if (this.getCtrlSubctaDestino() != null) {
            conditions += " AND CTRL_SUBCTA_DESTINO = ?";
            values.add(this.getCtrlSubctaDestino());
        }

        if (this.getCtrlCtoinverDestino() != null && this.getCtrlCtoinverDestino().longValue() == -999) {
            conditions += " AND CTRL_CTOINVER_DESTINO IS NULL";
        } else if (this.getCtrlCtoinverDestino() != null) {
            conditions += " AND CTRL_CTOINVER_DESTINO = ?";
            values.add(this.getCtrlCtoinverDestino());
        }

        if (this.getCtrlCtaChequesDestino() != null && this.getCtrlCtaChequesDestino().longValue() == -999) {
            conditions += " AND CTRL_CTA_CHEQUES_DESTINO IS NULL";
        } else if (this.getCtrlCtaChequesDestino() != null) {
            conditions += " AND CTRL_CTA_CHEQUES_DESTINO = ?";
            values.add(this.getCtrlCtaChequesDestino());
        }

        if (this.getCtrlImporte() != null && this.getCtrlImporte().longValue() == -999) {
            conditions += " AND CTRL_IMPORTE IS NULL";
        } else if (this.getCtrlImporte() != null) {
            conditions += " AND CTRL_IMPORTE = ?";
            values.add(this.getCtrlImporte());
        }

        if (this.getCtrlDescripcion() != null && "null".equals(this.getCtrlDescripcion())) {
            conditions += " AND CTRL_DESCRIPCION IS NULL";
        } else if (this.getCtrlDescripcion() != null) {
            conditions += " AND CTRL_DESCRIPCION = ?";
            values.add(this.getCtrlDescripcion());
        }

        if (this.getCtrlMoneda() != null && this.getCtrlMoneda().longValue() == -999) {
            conditions += " AND CTRL_MONEDA IS NULL";
        } else if (this.getCtrlMoneda() != null) {
            conditions += " AND CTRL_MONEDA = ?";
            values.add(this.getCtrlMoneda());
        }

        if (this.getCtrlStatus() != null && "null".equals(this.getCtrlStatus())) {
            conditions += " AND CTRL_STATUS IS NULL";
        } else if (this.getCtrlStatus() != null) {
            conditions += " AND CTRL_STATUS = ?";
            values.add(this.getCtrlStatus());
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
        String sql = "UPDATE F_CONTROL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTRL_ID_MOVTO = ?";
        pkValues.add(this.getCtrlIdMovto());
        conditions += " AND CTRL_ID_TIPO_MOVTO = ?";
        pkValues.add(this.getCtrlIdTipoMovto());
        conditions += " AND CTRL_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getCtrlFecha());
        fields += " CTRL_FISO = ?, ";
        values.add(this.getCtrlFiso());
        fields += " CTRL_SUBCTA = ?, ";
        values.add(this.getCtrlSubcta());
        fields += " CTRL_CTOINVER = ?, ";
        values.add(this.getCtrlCtoinver());
        fields += " CTRL_CTA_CHEQUES = ?, ";
        values.add(this.getCtrlCtaCheques());
        fields += " CTRL_FISO_DESTINO = ?, ";
        values.add(this.getCtrlFisoDestino());
        fields += " CTRL_SUBCTA_DESTINO = ?, ";
        values.add(this.getCtrlSubctaDestino());
        fields += " CTRL_CTOINVER_DESTINO = ?, ";
        values.add(this.getCtrlCtoinverDestino());
        fields += " CTRL_CTA_CHEQUES_DESTINO = ?, ";
        values.add(this.getCtrlCtaChequesDestino());
        fields += " CTRL_IMPORTE = ?, ";
        values.add(this.getCtrlImporte());
        fields += " CTRL_DESCRIPCION = ?, ";
        values.add(this.getCtrlDescripcion());
        fields += " CTRL_MONEDA = ?, ";
        values.add(this.getCtrlMoneda());
        fields += " CTRL_STATUS = ?, ";
        values.add(this.getCtrlStatus());
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
        String sql = "INSERT INTO F_CONTROL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTRL_ID_MOVTO";
        fieldValues += ", ?";
        values.add(this.getCtrlIdMovto());

        fields += ", CTRL_ID_TIPO_MOVTO";
        fieldValues += ", ?";
        values.add(this.getCtrlIdTipoMovto());

        fields += ", CTRL_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getCtrlFecha());

        fields += ", CTRL_FISO";
        fieldValues += ", ?";
        values.add(this.getCtrlFiso());

        fields += ", CTRL_SUBCTA";
        fieldValues += ", ?";
        values.add(this.getCtrlSubcta());

        fields += ", CTRL_CTOINVER";
        fieldValues += ", ?";
        values.add(this.getCtrlCtoinver());

        fields += ", CTRL_CTA_CHEQUES";
        fieldValues += ", ?";
        values.add(this.getCtrlCtaCheques());

        fields += ", CTRL_FISO_DESTINO";
        fieldValues += ", ?";
        values.add(this.getCtrlFisoDestino());

        fields += ", CTRL_SUBCTA_DESTINO";
        fieldValues += ", ?";
        values.add(this.getCtrlSubctaDestino());

        fields += ", CTRL_CTOINVER_DESTINO";
        fieldValues += ", ?";
        values.add(this.getCtrlCtoinverDestino());

        fields += ", CTRL_CTA_CHEQUES_DESTINO";
        fieldValues += ", ?";
        values.add(this.getCtrlCtaChequesDestino());

        fields += ", CTRL_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getCtrlImporte());

        fields += ", CTRL_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getCtrlDescripcion());

        fields += ", CTRL_MONEDA";
        fieldValues += ", ?";
        values.add(this.getCtrlMoneda());

        fields += ", CTRL_STATUS";
        fieldValues += ", ?";
        values.add(this.getCtrlStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONTROL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTRL_ID_MOVTO = ?";
        values.add(this.getCtrlIdMovto());
        conditions += " AND CTRL_ID_TIPO_MOVTO = ?";
        values.add(this.getCtrlIdTipoMovto());
        conditions += " AND CTRL_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getCtrlFecha());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FControl instance = (FControl) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtrlIdMovto().equals(instance.getCtrlIdMovto()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlIdTipoMovto().equals(instance.getCtrlIdTipoMovto()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlFecha().equals(instance.getCtrlFecha()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlFiso().equals(instance.getCtrlFiso()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlSubcta().equals(instance.getCtrlSubcta()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlCtoinver().equals(instance.getCtrlCtoinver()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlCtaCheques().equals(instance.getCtrlCtaCheques()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlFisoDestino().equals(instance.getCtrlFisoDestino()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlSubctaDestino().equals(instance.getCtrlSubctaDestino()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlCtoinverDestino().equals(instance.getCtrlCtoinverDestino()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlCtaChequesDestino().equals(instance.getCtrlCtaChequesDestino()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlImporte().equals(instance.getCtrlImporte()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlDescripcion().equals(instance.getCtrlDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlMoneda().equals(instance.getCtrlMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getCtrlStatus().equals(instance.getCtrlStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FControl result = new FControl();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtrlIdMovto((BigDecimal) objectData.getData("CTRL_ID_MOVTO"));
        result.setCtrlIdTipoMovto((BigDecimal) objectData.getData("CTRL_ID_TIPO_MOVTO"));
        result.setCtrlFecha((String) objectData.getData("CTRL_FECHA"));
        result.setCtrlFiso((BigDecimal) objectData.getData("CTRL_FISO"));
        result.setCtrlSubcta((BigDecimal) objectData.getData("CTRL_SUBCTA"));
        result.setCtrlCtoinver((BigDecimal) objectData.getData("CTRL_CTOINVER"));
        result.setCtrlCtaCheques((BigDecimal) objectData.getData("CTRL_CTA_CHEQUES"));
        result.setCtrlFisoDestino((BigDecimal) objectData.getData("CTRL_FISO_DESTINO"));
        result.setCtrlSubctaDestino((BigDecimal) objectData.getData("CTRL_SUBCTA_DESTINO"));
        result.setCtrlCtoinverDestino((BigDecimal) objectData.getData("CTRL_CTOINVER_DESTINO"));
        result.setCtrlCtaChequesDestino((BigDecimal) objectData.getData("CTRL_CTA_CHEQUES_DESTINO"));
        result.setCtrlImporte((BigDecimal) objectData.getData("CTRL_IMPORTE"));
        result.setCtrlDescripcion((String) objectData.getData("CTRL_DESCRIPCION"));
        result.setCtrlMoneda((BigDecimal) objectData.getData("CTRL_MONEDA"));
        result.setCtrlStatus((String) objectData.getData("CTRL_STATUS"));

        return result;

    }

}
