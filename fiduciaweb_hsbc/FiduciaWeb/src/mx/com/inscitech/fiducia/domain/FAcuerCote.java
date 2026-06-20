package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ACUER_COTE_PK", columns = { "FSCE_ID_SESION_COM_TEC", "FACE_ID_ACUERDO", "FFID_ID_FIDEICOMISO" }, sequences = { "MANUAL" })
public class FAcuerCote extends DomainObject {

    BigDecimal fsceIdSesionComTec = null;
    BigDecimal faceIdAcuerdo = null;
    String faceDescripcionAcuerdo = null;
    BigDecimal faceAvanceAcuerdo = null;
    BigDecimal faceImpAutoriza = null;
    BigDecimal faceImpDisponible = null;
    BigDecimal faceImpEjercido = null;
    String faceStatus = null;
    BigDecimal ffidIdFideicomiso = null;

    public FAcuerCote() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsceIdSesionComTec(BigDecimal fsceIdSesionComTec) {
        this.fsceIdSesionComTec = fsceIdSesionComTec;
    }

    public BigDecimal getFsceIdSesionComTec() {
        return this.fsceIdSesionComTec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFaceIdAcuerdo(BigDecimal faceIdAcuerdo) {
        this.faceIdAcuerdo = faceIdAcuerdo;
    }

    public BigDecimal getFaceIdAcuerdo() {
        return this.faceIdAcuerdo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFaceDescripcionAcuerdo(String faceDescripcionAcuerdo) {
        this.faceDescripcionAcuerdo = faceDescripcionAcuerdo;
    }

    public String getFaceDescripcionAcuerdo() {
        return this.faceDescripcionAcuerdo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFaceAvanceAcuerdo(BigDecimal faceAvanceAcuerdo) {
        this.faceAvanceAcuerdo = faceAvanceAcuerdo;
    }

    public BigDecimal getFaceAvanceAcuerdo() {
        return this.faceAvanceAcuerdo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFaceImpAutoriza(BigDecimal faceImpAutoriza) {
        this.faceImpAutoriza = faceImpAutoriza;
    }

    public BigDecimal getFaceImpAutoriza() {
        return this.faceImpAutoriza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFaceImpDisponible(BigDecimal faceImpDisponible) {
        this.faceImpDisponible = faceImpDisponible;
    }

    public BigDecimal getFaceImpDisponible() {
        return this.faceImpDisponible;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFaceImpEjercido(BigDecimal faceImpEjercido) {
        this.faceImpEjercido = faceImpEjercido;
    }

    public BigDecimal getFaceImpEjercido() {
        return this.faceImpEjercido;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFaceStatus(String faceStatus) {
        this.faceStatus = faceStatus;
    }

    public String getFaceStatus() {
        return this.faceStatus;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfidIdFideicomiso(BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return this.ffidIdFideicomiso;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ACUER_COTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsceIdSesionComTec() != null && this.getFsceIdSesionComTec().longValue() == -999) {
            conditions += " AND FSCE_ID_SESION_COM_TEC IS NULL";
        } else if (this.getFsceIdSesionComTec() != null) {
            conditions += " AND FSCE_ID_SESION_COM_TEC = ?";
            values.add(this.getFsceIdSesionComTec());
        }

        if (this.getFaceIdAcuerdo() != null && this.getFaceIdAcuerdo().longValue() == -999) {
            conditions += " AND FACE_ID_ACUERDO IS NULL";
        } else if (this.getFaceIdAcuerdo() != null) {
            conditions += " AND FACE_ID_ACUERDO = ?";
            values.add(this.getFaceIdAcuerdo());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
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
        String sql = "SELECT * FROM F_ACUER_COTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsceIdSesionComTec() != null && this.getFsceIdSesionComTec().longValue() == -999) {
            conditions += " AND FSCE_ID_SESION_COM_TEC IS NULL";
        } else if (this.getFsceIdSesionComTec() != null) {
            conditions += " AND FSCE_ID_SESION_COM_TEC = ?";
            values.add(this.getFsceIdSesionComTec());
        }

        if (this.getFaceIdAcuerdo() != null && this.getFaceIdAcuerdo().longValue() == -999) {
            conditions += " AND FACE_ID_ACUERDO IS NULL";
        } else if (this.getFaceIdAcuerdo() != null) {
            conditions += " AND FACE_ID_ACUERDO = ?";
            values.add(this.getFaceIdAcuerdo());
        }

        if (this.getFaceDescripcionAcuerdo() != null && "null".equals(this.getFaceDescripcionAcuerdo())) {
            conditions += " AND FACE_DESCRIPCION_ACUERDO IS NULL";
        } else if (this.getFaceDescripcionAcuerdo() != null) {
            conditions += " AND FACE_DESCRIPCION_ACUERDO = ?";
            values.add(this.getFaceDescripcionAcuerdo());
        }

        if (this.getFaceAvanceAcuerdo() != null && this.getFaceAvanceAcuerdo().longValue() == -999) {
            conditions += " AND FACE_AVANCE_ACUERDO IS NULL";
        } else if (this.getFaceAvanceAcuerdo() != null) {
            conditions += " AND FACE_AVANCE_ACUERDO = ?";
            values.add(this.getFaceAvanceAcuerdo());
        }

        if (this.getFaceImpAutoriza() != null && this.getFaceImpAutoriza().longValue() == -999) {
            conditions += " AND FACE_IMP_AUTORIZA IS NULL";
        } else if (this.getFaceImpAutoriza() != null) {
            conditions += " AND FACE_IMP_AUTORIZA = ?";
            values.add(this.getFaceImpAutoriza());
        }

        if (this.getFaceImpDisponible() != null && this.getFaceImpDisponible().longValue() == -999) {
            conditions += " AND FACE_IMP_DISPONIBLE IS NULL";
        } else if (this.getFaceImpDisponible() != null) {
            conditions += " AND FACE_IMP_DISPONIBLE = ?";
            values.add(this.getFaceImpDisponible());
        }

        if (this.getFaceImpEjercido() != null && this.getFaceImpEjercido().longValue() == -999) {
            conditions += " AND FACE_IMP_EJERCIDO IS NULL";
        } else if (this.getFaceImpEjercido() != null) {
            conditions += " AND FACE_IMP_EJERCIDO = ?";
            values.add(this.getFaceImpEjercido());
        }

        if (this.getFaceStatus() != null && "null".equals(this.getFaceStatus())) {
            conditions += " AND FACE_STATUS IS NULL";
        } else if (this.getFaceStatus() != null) {
            conditions += " AND FACE_STATUS = ?";
            values.add(this.getFaceStatus());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
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
        String sql = "UPDATE F_ACUER_COTE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FSCE_ID_SESION_COM_TEC = ?";
        pkValues.add(this.getFsceIdSesionComTec());
        conditions += " AND FACE_ID_ACUERDO = ?";
        pkValues.add(this.getFaceIdAcuerdo());
        fields += " FACE_DESCRIPCION_ACUERDO = ?, ";
        values.add(this.getFaceDescripcionAcuerdo());
        fields += " FACE_AVANCE_ACUERDO = ?, ";
        values.add(this.getFaceAvanceAcuerdo());
        fields += " FACE_IMP_AUTORIZA = ?, ";
        values.add(this.getFaceImpAutoriza());
        fields += " FACE_IMP_DISPONIBLE = ?, ";
        values.add(this.getFaceImpDisponible());
        fields += " FACE_IMP_EJERCIDO = ?, ";
        values.add(this.getFaceImpEjercido());
        fields += " FACE_STATUS = ?, ";
        values.add(this.getFaceStatus());
        conditions += " AND FFID_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFfidIdFideicomiso());
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
        String sql = "INSERT INTO F_ACUER_COTE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FSCE_ID_SESION_COM_TEC";
        fieldValues += ", ?";
        values.add(this.getFsceIdSesionComTec());

        fields += ", FACE_ID_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getFaceIdAcuerdo());

        fields += ", FACE_DESCRIPCION_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getFaceDescripcionAcuerdo());

        fields += ", FACE_AVANCE_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getFaceAvanceAcuerdo());

        fields += ", FACE_IMP_AUTORIZA";
        fieldValues += ", ?";
        values.add(this.getFaceImpAutoriza());

        fields += ", FACE_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getFaceImpDisponible());

        fields += ", FACE_IMP_EJERCIDO";
        fieldValues += ", ?";
        values.add(this.getFaceImpEjercido());

        fields += ", FACE_STATUS";
        fieldValues += ", ?";
        values.add(this.getFaceStatus());

        fields += ", FFID_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFfidIdFideicomiso());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ACUER_COTE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FSCE_ID_SESION_COM_TEC = ?";
        values.add(this.getFsceIdSesionComTec());
        conditions += " AND FACE_ID_ACUERDO = ?";
        values.add(this.getFaceIdAcuerdo());
        conditions += " AND FFID_ID_FIDEICOMISO = ?";
        values.add(this.getFfidIdFideicomiso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAcuerCote instance = (FAcuerCote) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFsceIdSesionComTec().equals(instance.getFsceIdSesionComTec()))
            equalObjects = false;
        if (equalObjects && !this.getFaceIdAcuerdo().equals(instance.getFaceIdAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getFaceDescripcionAcuerdo().equals(instance.getFaceDescripcionAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getFaceAvanceAcuerdo().equals(instance.getFaceAvanceAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getFaceImpAutoriza().equals(instance.getFaceImpAutoriza()))
            equalObjects = false;
        if (equalObjects && !this.getFaceImpDisponible().equals(instance.getFaceImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getFaceImpEjercido().equals(instance.getFaceImpEjercido()))
            equalObjects = false;
        if (equalObjects && !this.getFaceStatus().equals(instance.getFaceStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFfidIdFideicomiso().equals(instance.getFfidIdFideicomiso()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAcuerCote result = new FAcuerCote();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFsceIdSesionComTec((BigDecimal) objectData.getData("FSCE_ID_SESION_COM_TEC"));
        result.setFaceIdAcuerdo((BigDecimal) objectData.getData("FACE_ID_ACUERDO"));
        result.setFaceDescripcionAcuerdo((String) objectData.getData("FACE_DESCRIPCION_ACUERDO"));
        result.setFaceAvanceAcuerdo((BigDecimal) objectData.getData("FACE_AVANCE_ACUERDO"));
        result.setFaceImpAutoriza((BigDecimal) objectData.getData("FACE_IMP_AUTORIZA"));
        result.setFaceImpDisponible((BigDecimal) objectData.getData("FACE_IMP_DISPONIBLE"));
        result.setFaceImpEjercido((BigDecimal) objectData.getData("FACE_IMP_EJERCIDO"));
        result.setFaceStatus((String) objectData.getData("FACE_STATUS"));
        result.setFfidIdFideicomiso((BigDecimal) objectData.getData("FFID_ID_FIDEICOMISO"));

        return result;

    }

}
