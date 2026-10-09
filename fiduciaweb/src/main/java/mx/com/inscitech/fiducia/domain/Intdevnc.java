package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INTDEVNC_PK",
            columns = { "IDN_NUM_CONTRATO", "IDN_SUB_CONTRATO", "IDN_ENTIDAD_FIN", "IDN_CONTRATO_INTER", "IDN_NOM_PIZARRA", "IDN_NUM_SER_EMIS", "IDN_NUM_CUPON_VIG" },
            sequences = { "MANUAL" })
public class Intdevnc extends DomainObject {

    BigDecimal idnNumContrato = null;
    BigDecimal idnSubContrato = null;
    BigDecimal idnEntidadFin = null;
    BigDecimal idnContratoInter = null;
    String idnNomPizarra = null;
    String idnNumSerEmis = null;
    BigDecimal idnNumCuponVig = null;
    BigDecimal idnImpIntDeven = null;

    public Intdevnc() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIdnNumContrato(BigDecimal idnNumContrato) {
        this.idnNumContrato = idnNumContrato;
    }

    public BigDecimal getIdnNumContrato() {
        return this.idnNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIdnSubContrato(BigDecimal idnSubContrato) {
        this.idnSubContrato = idnSubContrato;
    }

    public BigDecimal getIdnSubContrato() {
        return this.idnSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIdnEntidadFin(BigDecimal idnEntidadFin) {
        this.idnEntidadFin = idnEntidadFin;
    }

    public BigDecimal getIdnEntidadFin() {
        return this.idnEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIdnContratoInter(BigDecimal idnContratoInter) {
        this.idnContratoInter = idnContratoInter;
    }

    public BigDecimal getIdnContratoInter() {
        return this.idnContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIdnNomPizarra(String idnNomPizarra) {
        this.idnNomPizarra = idnNomPizarra;
    }

    public String getIdnNomPizarra() {
        return this.idnNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIdnNumSerEmis(String idnNumSerEmis) {
        this.idnNumSerEmis = idnNumSerEmis;
    }

    public String getIdnNumSerEmis() {
        return this.idnNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIdnNumCuponVig(BigDecimal idnNumCuponVig) {
        this.idnNumCuponVig = idnNumCuponVig;
    }

    public BigDecimal getIdnNumCuponVig() {
        return this.idnNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setIdnImpIntDeven(BigDecimal idnImpIntDeven) {
        this.idnImpIntDeven = idnImpIntDeven;
    }

    public BigDecimal getIdnImpIntDeven() {
        return this.idnImpIntDeven;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INTDEVNC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIdnNumContrato() != null && this.getIdnNumContrato().longValue() == -999) {
            conditions += " AND IDN_NUM_CONTRATO IS NULL";
        } else if (this.getIdnNumContrato() != null) {
            conditions += " AND IDN_NUM_CONTRATO = ?";
            values.add(this.getIdnNumContrato());
        }

        if (this.getIdnSubContrato() != null && this.getIdnSubContrato().longValue() == -999) {
            conditions += " AND IDN_SUB_CONTRATO IS NULL";
        } else if (this.getIdnSubContrato() != null) {
            conditions += " AND IDN_SUB_CONTRATO = ?";
            values.add(this.getIdnSubContrato());
        }

        if (this.getIdnEntidadFin() != null && this.getIdnEntidadFin().longValue() == -999) {
            conditions += " AND IDN_ENTIDAD_FIN IS NULL";
        } else if (this.getIdnEntidadFin() != null) {
            conditions += " AND IDN_ENTIDAD_FIN = ?";
            values.add(this.getIdnEntidadFin());
        }

        if (this.getIdnContratoInter() != null && this.getIdnContratoInter().longValue() == -999) {
            conditions += " AND IDN_CONTRATO_INTER IS NULL";
        } else if (this.getIdnContratoInter() != null) {
            conditions += " AND IDN_CONTRATO_INTER = ?";
            values.add(this.getIdnContratoInter());
        }

        if (this.getIdnNomPizarra() != null && "null".equals(this.getIdnNomPizarra())) {
            conditions += " AND IDN_NOM_PIZARRA IS NULL";
        } else if (this.getIdnNomPizarra() != null) {
            conditions += " AND IDN_NOM_PIZARRA = ?";
            values.add(this.getIdnNomPizarra());
        }

        if (this.getIdnNumSerEmis() != null && "null".equals(this.getIdnNumSerEmis())) {
            conditions += " AND IDN_NUM_SER_EMIS IS NULL";
        } else if (this.getIdnNumSerEmis() != null) {
            conditions += " AND IDN_NUM_SER_EMIS = ?";
            values.add(this.getIdnNumSerEmis());
        }

        if (this.getIdnNumCuponVig() != null && this.getIdnNumCuponVig().longValue() == -999) {
            conditions += " AND IDN_NUM_CUPON_VIG IS NULL";
        } else if (this.getIdnNumCuponVig() != null) {
            conditions += " AND IDN_NUM_CUPON_VIG = ?";
            values.add(this.getIdnNumCuponVig());
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
        String sql = "SELECT * FROM INTDEVNC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIdnNumContrato() != null && this.getIdnNumContrato().longValue() == -999) {
            conditions += " AND IDN_NUM_CONTRATO IS NULL";
        } else if (this.getIdnNumContrato() != null) {
            conditions += " AND IDN_NUM_CONTRATO = ?";
            values.add(this.getIdnNumContrato());
        }

        if (this.getIdnSubContrato() != null && this.getIdnSubContrato().longValue() == -999) {
            conditions += " AND IDN_SUB_CONTRATO IS NULL";
        } else if (this.getIdnSubContrato() != null) {
            conditions += " AND IDN_SUB_CONTRATO = ?";
            values.add(this.getIdnSubContrato());
        }

        if (this.getIdnEntidadFin() != null && this.getIdnEntidadFin().longValue() == -999) {
            conditions += " AND IDN_ENTIDAD_FIN IS NULL";
        } else if (this.getIdnEntidadFin() != null) {
            conditions += " AND IDN_ENTIDAD_FIN = ?";
            values.add(this.getIdnEntidadFin());
        }

        if (this.getIdnContratoInter() != null && this.getIdnContratoInter().longValue() == -999) {
            conditions += " AND IDN_CONTRATO_INTER IS NULL";
        } else if (this.getIdnContratoInter() != null) {
            conditions += " AND IDN_CONTRATO_INTER = ?";
            values.add(this.getIdnContratoInter());
        }

        if (this.getIdnNomPizarra() != null && "null".equals(this.getIdnNomPizarra())) {
            conditions += " AND IDN_NOM_PIZARRA IS NULL";
        } else if (this.getIdnNomPizarra() != null) {
            conditions += " AND IDN_NOM_PIZARRA = ?";
            values.add(this.getIdnNomPizarra());
        }

        if (this.getIdnNumSerEmis() != null && "null".equals(this.getIdnNumSerEmis())) {
            conditions += " AND IDN_NUM_SER_EMIS IS NULL";
        } else if (this.getIdnNumSerEmis() != null) {
            conditions += " AND IDN_NUM_SER_EMIS = ?";
            values.add(this.getIdnNumSerEmis());
        }

        if (this.getIdnNumCuponVig() != null && this.getIdnNumCuponVig().longValue() == -999) {
            conditions += " AND IDN_NUM_CUPON_VIG IS NULL";
        } else if (this.getIdnNumCuponVig() != null) {
            conditions += " AND IDN_NUM_CUPON_VIG = ?";
            values.add(this.getIdnNumCuponVig());
        }

        if (this.getIdnImpIntDeven() != null && this.getIdnImpIntDeven().longValue() == -999) {
            conditions += " AND IDN_IMP_INT_DEVEN IS NULL";
        } else if (this.getIdnImpIntDeven() != null) {
            conditions += " AND IDN_IMP_INT_DEVEN = ?";
            values.add(this.getIdnImpIntDeven());
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
        String sql = "UPDATE INTDEVNC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND IDN_NUM_CONTRATO = ?";
        pkValues.add(this.getIdnNumContrato());
        conditions += " AND IDN_SUB_CONTRATO = ?";
        pkValues.add(this.getIdnSubContrato());
        conditions += " AND IDN_ENTIDAD_FIN = ?";
        pkValues.add(this.getIdnEntidadFin());
        conditions += " AND IDN_CONTRATO_INTER = ?";
        pkValues.add(this.getIdnContratoInter());
        conditions += " AND IDN_NOM_PIZARRA = ?";
        pkValues.add(this.getIdnNomPizarra());
        conditions += " AND IDN_NUM_SER_EMIS = ?";
        pkValues.add(this.getIdnNumSerEmis());
        conditions += " AND IDN_NUM_CUPON_VIG = ?";
        pkValues.add(this.getIdnNumCuponVig());
        fields += " IDN_IMP_INT_DEVEN = ?, ";
        values.add(this.getIdnImpIntDeven());
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
        String sql = "INSERT INTO INTDEVNC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", IDN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getIdnNumContrato());

        fields += ", IDN_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getIdnSubContrato());

        fields += ", IDN_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getIdnEntidadFin());

        fields += ", IDN_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getIdnContratoInter());

        fields += ", IDN_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getIdnNomPizarra());

        fields += ", IDN_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getIdnNumSerEmis());

        fields += ", IDN_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getIdnNumCuponVig());

        fields += ", IDN_IMP_INT_DEVEN";
        fieldValues += ", ?";
        values.add(this.getIdnImpIntDeven());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INTDEVNC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND IDN_NUM_CONTRATO = ?";
        values.add(this.getIdnNumContrato());
        conditions += " AND IDN_SUB_CONTRATO = ?";
        values.add(this.getIdnSubContrato());
        conditions += " AND IDN_ENTIDAD_FIN = ?";
        values.add(this.getIdnEntidadFin());
        conditions += " AND IDN_CONTRATO_INTER = ?";
        values.add(this.getIdnContratoInter());
        conditions += " AND IDN_NOM_PIZARRA = ?";
        values.add(this.getIdnNomPizarra());
        conditions += " AND IDN_NUM_SER_EMIS = ?";
        values.add(this.getIdnNumSerEmis());
        conditions += " AND IDN_NUM_CUPON_VIG = ?";
        values.add(this.getIdnNumCuponVig());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Intdevnc instance = (Intdevnc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIdnNumContrato().equals(instance.getIdnNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getIdnSubContrato().equals(instance.getIdnSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getIdnEntidadFin().equals(instance.getIdnEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getIdnContratoInter().equals(instance.getIdnContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getIdnNomPizarra().equals(instance.getIdnNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getIdnNumSerEmis().equals(instance.getIdnNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getIdnNumCuponVig().equals(instance.getIdnNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getIdnImpIntDeven().equals(instance.getIdnImpIntDeven()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Intdevnc result = new Intdevnc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIdnNumContrato((BigDecimal) objectData.getData("IDN_NUM_CONTRATO"));
        result.setIdnSubContrato((BigDecimal) objectData.getData("IDN_SUB_CONTRATO"));
        result.setIdnEntidadFin((BigDecimal) objectData.getData("IDN_ENTIDAD_FIN"));
        result.setIdnContratoInter((BigDecimal) objectData.getData("IDN_CONTRATO_INTER"));
        result.setIdnNomPizarra((String) objectData.getData("IDN_NOM_PIZARRA"));
        result.setIdnNumSerEmis((String) objectData.getData("IDN_NUM_SER_EMIS"));
        result.setIdnNumCuponVig((BigDecimal) objectData.getData("IDN_NUM_CUPON_VIG"));
        result.setIdnImpIntDeven((BigDecimal) objectData.getData("IDN_IMP_INT_DEVEN"));

        return result;

    }

}
