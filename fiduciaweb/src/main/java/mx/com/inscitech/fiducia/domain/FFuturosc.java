package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FFuturosc extends DomainObject {

    BigDecimal defIdFideicomiso = null;
    BigDecimal defIdSubcuenta = null;
    BigDecimal defIdCtoInversion = null;
    BigDecimal defIdSecuencial = null;
    String defIdPizarra = null;
    String defIdSerie = null;
    BigDecimal defIdCupon = null;
    String defIdFecCompra = null;
    BigDecimal defNumContratos = null;
    BigDecimal defValNominal = null;
    BigDecimal defIpc = null;
    String defStatus = null;

    public FFuturosc() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDefIdFideicomiso(BigDecimal defIdFideicomiso) {
        this.defIdFideicomiso = defIdFideicomiso;
    }

    public BigDecimal getDefIdFideicomiso() {
        return this.defIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDefIdSubcuenta(BigDecimal defIdSubcuenta) {
        this.defIdSubcuenta = defIdSubcuenta;
    }

    public BigDecimal getDefIdSubcuenta() {
        return this.defIdSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDefIdCtoInversion(BigDecimal defIdCtoInversion) {
        this.defIdCtoInversion = defIdCtoInversion;
    }

    public BigDecimal getDefIdCtoInversion() {
        return this.defIdCtoInversion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDefIdSecuencial(BigDecimal defIdSecuencial) {
        this.defIdSecuencial = defIdSecuencial;
    }

    public BigDecimal getDefIdSecuencial() {
        return this.defIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDefIdPizarra(String defIdPizarra) {
        this.defIdPizarra = defIdPizarra;
    }

    public String getDefIdPizarra() {
        return this.defIdPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDefIdSerie(String defIdSerie) {
        this.defIdSerie = defIdSerie;
    }

    public String getDefIdSerie() {
        return this.defIdSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDefIdCupon(BigDecimal defIdCupon) {
        this.defIdCupon = defIdCupon;
    }

    public BigDecimal getDefIdCupon() {
        return this.defIdCupon;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setDefIdFecCompra(String defIdFecCompra) {
        this.defIdFecCompra = defIdFecCompra;
    }

    public String getDefIdFecCompra() {
        return this.defIdFecCompra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDefNumContratos(BigDecimal defNumContratos) {
        this.defNumContratos = defNumContratos;
    }

    public BigDecimal getDefNumContratos() {
        return this.defNumContratos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setDefValNominal(BigDecimal defValNominal) {
        this.defValNominal = defValNominal;
    }

    public BigDecimal getDefValNominal() {
        return this.defValNominal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setDefIpc(BigDecimal defIpc) {
        this.defIpc = defIpc;
    }

    public BigDecimal getDefIpc() {
        return this.defIpc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDefStatus(String defStatus) {
        this.defStatus = defStatus;
    }

    public String getDefStatus() {
        return this.defStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_FUTUROSC ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_FUTUROSC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDefIdFideicomiso() != null && this.getDefIdFideicomiso().longValue() == -999) {
            conditions += " AND DEF_ID_FIDEICOMISO IS NULL";
        } else if (this.getDefIdFideicomiso() != null) {
            conditions += " AND DEF_ID_FIDEICOMISO = ?";
            values.add(this.getDefIdFideicomiso());
        }

        if (this.getDefIdSubcuenta() != null && this.getDefIdSubcuenta().longValue() == -999) {
            conditions += " AND DEF_ID_SUBCUENTA IS NULL";
        } else if (this.getDefIdSubcuenta() != null) {
            conditions += " AND DEF_ID_SUBCUENTA = ?";
            values.add(this.getDefIdSubcuenta());
        }

        if (this.getDefIdCtoInversion() != null && this.getDefIdCtoInversion().longValue() == -999) {
            conditions += " AND DEF_ID_CTO_INVERSION IS NULL";
        } else if (this.getDefIdCtoInversion() != null) {
            conditions += " AND DEF_ID_CTO_INVERSION = ?";
            values.add(this.getDefIdCtoInversion());
        }

        if (this.getDefIdSecuencial() != null && this.getDefIdSecuencial().longValue() == -999) {
            conditions += " AND DEF_ID_SECUENCIAL IS NULL";
        } else if (this.getDefIdSecuencial() != null) {
            conditions += " AND DEF_ID_SECUENCIAL = ?";
            values.add(this.getDefIdSecuencial());
        }

        if (this.getDefIdPizarra() != null && "null".equals(this.getDefIdPizarra())) {
            conditions += " AND DEF_ID_PIZARRA IS NULL";
        } else if (this.getDefIdPizarra() != null) {
            conditions += " AND DEF_ID_PIZARRA = ?";
            values.add(this.getDefIdPizarra());
        }

        if (this.getDefIdSerie() != null && "null".equals(this.getDefIdSerie())) {
            conditions += " AND DEF_ID_SERIE IS NULL";
        } else if (this.getDefIdSerie() != null) {
            conditions += " AND DEF_ID_SERIE = ?";
            values.add(this.getDefIdSerie());
        }

        if (this.getDefIdCupon() != null && this.getDefIdCupon().longValue() == -999) {
            conditions += " AND DEF_ID_CUPON IS NULL";
        } else if (this.getDefIdCupon() != null) {
            conditions += " AND DEF_ID_CUPON = ?";
            values.add(this.getDefIdCupon());
        }

        if (this.getDefIdFecCompra() != null && "null".equals(this.getDefIdFecCompra())) {
            conditions += " AND DEF_ID_FEC_COMPRA IS NULL";
        } else if (this.getDefIdFecCompra() != null) {
            conditions += " AND DEF_ID_FEC_COMPRA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getDefIdFecCompra());
        }

        if (this.getDefNumContratos() != null && this.getDefNumContratos().longValue() == -999) {
            conditions += " AND DEF_NUM_CONTRATOS IS NULL";
        } else if (this.getDefNumContratos() != null) {
            conditions += " AND DEF_NUM_CONTRATOS = ?";
            values.add(this.getDefNumContratos());
        }

        if (this.getDefValNominal() != null && this.getDefValNominal().longValue() == -999) {
            conditions += " AND DEF_VAL_NOMINAL IS NULL";
        } else if (this.getDefValNominal() != null) {
            conditions += " AND DEF_VAL_NOMINAL = ?";
            values.add(this.getDefValNominal());
        }

        if (this.getDefIpc() != null && this.getDefIpc().longValue() == -999) {
            conditions += " AND DEF_IPC IS NULL";
        } else if (this.getDefIpc() != null) {
            conditions += " AND DEF_IPC = ?";
            values.add(this.getDefIpc());
        }

        if (this.getDefStatus() != null && "null".equals(this.getDefStatus())) {
            conditions += " AND DEF_STATUS IS NULL";
        } else if (this.getDefStatus() != null) {
            conditions += " AND DEF_STATUS = ?";
            values.add(this.getDefStatus());
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
        String sql = "UPDATE F_FUTUROSC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " DEF_ID_FIDEICOMISO = ?, ";
        values.add(this.getDefIdFideicomiso());
        fields += " DEF_ID_SUBCUENTA = ?, ";
        values.add(this.getDefIdSubcuenta());
        fields += " DEF_ID_CTO_INVERSION = ?, ";
        values.add(this.getDefIdCtoInversion());
        fields += " DEF_ID_SECUENCIAL = ?, ";
        values.add(this.getDefIdSecuencial());
        fields += " DEF_ID_PIZARRA = ?, ";
        values.add(this.getDefIdPizarra());
        fields += " DEF_ID_SERIE = ?, ";
        values.add(this.getDefIdSerie());
        fields += " DEF_ID_CUPON = ?, ";
        values.add(this.getDefIdCupon());
        fields += " DEF_ID_FEC_COMPRA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getDefIdFecCompra());
        fields += " DEF_NUM_CONTRATOS = ?, ";
        values.add(this.getDefNumContratos());
        fields += " DEF_VAL_NOMINAL = ?, ";
        values.add(this.getDefValNominal());
        fields += " DEF_IPC = ?, ";
        values.add(this.getDefIpc());
        fields += " DEF_STATUS = ?, ";
        values.add(this.getDefStatus());
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
        String sql = "INSERT INTO F_FUTUROSC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DEF_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getDefIdFideicomiso());

        fields += ", DEF_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getDefIdSubcuenta());

        fields += ", DEF_ID_CTO_INVERSION";
        fieldValues += ", ?";
        values.add(this.getDefIdCtoInversion());

        fields += ", DEF_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getDefIdSecuencial());

        fields += ", DEF_ID_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getDefIdPizarra());

        fields += ", DEF_ID_SERIE";
        fieldValues += ", ?";
        values.add(this.getDefIdSerie());

        fields += ", DEF_ID_CUPON";
        fieldValues += ", ?";
        values.add(this.getDefIdCupon());

        fields += ", DEF_ID_FEC_COMPRA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getDefIdFecCompra());

        fields += ", DEF_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getDefNumContratos());

        fields += ", DEF_VAL_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getDefValNominal());

        fields += ", DEF_IPC";
        fieldValues += ", ?";
        values.add(this.getDefIpc());

        fields += ", DEF_STATUS";
        fieldValues += ", ?";
        values.add(this.getDefStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_FUTUROSC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FFuturosc instance = (FFuturosc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDefIdFideicomiso().equals(instance.getDefIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getDefIdSubcuenta().equals(instance.getDefIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getDefIdCtoInversion().equals(instance.getDefIdCtoInversion()))
            equalObjects = false;
        if (equalObjects && !this.getDefIdSecuencial().equals(instance.getDefIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getDefIdPizarra().equals(instance.getDefIdPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getDefIdSerie().equals(instance.getDefIdSerie()))
            equalObjects = false;
        if (equalObjects && !this.getDefIdCupon().equals(instance.getDefIdCupon()))
            equalObjects = false;
        if (equalObjects && !this.getDefIdFecCompra().equals(instance.getDefIdFecCompra()))
            equalObjects = false;
        if (equalObjects && !this.getDefNumContratos().equals(instance.getDefNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getDefValNominal().equals(instance.getDefValNominal()))
            equalObjects = false;
        if (equalObjects && !this.getDefIpc().equals(instance.getDefIpc()))
            equalObjects = false;
        if (equalObjects && !this.getDefStatus().equals(instance.getDefStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FFuturosc result = new FFuturosc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDefIdFideicomiso((BigDecimal) objectData.getData("DEF_ID_FIDEICOMISO"));
        result.setDefIdSubcuenta((BigDecimal) objectData.getData("DEF_ID_SUBCUENTA"));
        result.setDefIdCtoInversion((BigDecimal) objectData.getData("DEF_ID_CTO_INVERSION"));
        result.setDefIdSecuencial((BigDecimal) objectData.getData("DEF_ID_SECUENCIAL"));
        result.setDefIdPizarra((String) objectData.getData("DEF_ID_PIZARRA"));
        result.setDefIdSerie((String) objectData.getData("DEF_ID_SERIE"));
        result.setDefIdCupon((BigDecimal) objectData.getData("DEF_ID_CUPON"));
        result.setDefIdFecCompra((String) objectData.getData("DEF_ID_FEC_COMPRA"));
        result.setDefNumContratos((BigDecimal) objectData.getData("DEF_NUM_CONTRATOS"));
        result.setDefValNominal((BigDecimal) objectData.getData("DEF_VAL_NOMINAL"));
        result.setDefIpc((BigDecimal) objectData.getData("DEF_IPC"));
        result.setDefStatus((String) objectData.getData("DEF_STATUS"));

        return result;

    }

}
