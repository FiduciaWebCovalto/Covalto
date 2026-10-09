package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_INTERFASE_FUTUROS_PK", columns = { "FIF_ID_FIDEICOMISO", "FIF_ID_SUBCTA", "FIF_ID_CTOINVER", "FIF_ID_SECUENCIAL", "FIF_ID_FECHA" },
            sequences = { "MANUAL" })
public class FInterfaseFuturos extends DomainObject {

    BigDecimal fifIdFideicomiso = null;
    BigDecimal fifIdSubcta = null;
    BigDecimal fifIdCtoinver = null;
    BigDecimal fifIdSecuencial = null;
    String fifPizarra = null;
    String fifSerie = null;
    BigDecimal fifCupon = null;
    BigDecimal fifCtosFuturo = null;
    BigDecimal fifValNominal = null;
    BigDecimal fifIpc = null;
    String fifIdFecha = null;
    String fifCveOperacion = null;
    BigDecimal fifSecFuturos = null;
    BigDecimal fifNumUsuario = null;
    String fifCveStatus = null;

    public FInterfaseFuturos() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFifIdFideicomiso(BigDecimal fifIdFideicomiso) {
        this.fifIdFideicomiso = fifIdFideicomiso;
    }

    public BigDecimal getFifIdFideicomiso() {
        return this.fifIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFifIdSubcta(BigDecimal fifIdSubcta) {
        this.fifIdSubcta = fifIdSubcta;
    }

    public BigDecimal getFifIdSubcta() {
        return this.fifIdSubcta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFifIdCtoinver(BigDecimal fifIdCtoinver) {
        this.fifIdCtoinver = fifIdCtoinver;
    }

    public BigDecimal getFifIdCtoinver() {
        return this.fifIdCtoinver;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFifIdSecuencial(BigDecimal fifIdSecuencial) {
        this.fifIdSecuencial = fifIdSecuencial;
    }

    public BigDecimal getFifIdSecuencial() {
        return this.fifIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFifPizarra(String fifPizarra) {
        this.fifPizarra = fifPizarra;
    }

    public String getFifPizarra() {
        return this.fifPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFifSerie(String fifSerie) {
        this.fifSerie = fifSerie;
    }

    public String getFifSerie() {
        return this.fifSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFifCupon(BigDecimal fifCupon) {
        this.fifCupon = fifCupon;
    }

    public BigDecimal getFifCupon() {
        return this.fifCupon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFifCtosFuturo(BigDecimal fifCtosFuturo) {
        this.fifCtosFuturo = fifCtosFuturo;
    }

    public BigDecimal getFifCtosFuturo() {
        return this.fifCtosFuturo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setFifValNominal(BigDecimal fifValNominal) {
        this.fifValNominal = fifValNominal;
    }

    public BigDecimal getFifValNominal() {
        return this.fifValNominal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setFifIpc(BigDecimal fifIpc) {
        this.fifIpc = fifIpc;
    }

    public BigDecimal getFifIpc() {
        return this.fifIpc;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFifIdFecha(String fifIdFecha) {
        this.fifIdFecha = fifIdFecha;
    }

    public String getFifIdFecha() {
        return this.fifIdFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFifCveOperacion(String fifCveOperacion) {
        this.fifCveOperacion = fifCveOperacion;
    }

    public String getFifCveOperacion() {
        return this.fifCveOperacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFifSecFuturos(BigDecimal fifSecFuturos) {
        this.fifSecFuturos = fifSecFuturos;
    }

    public BigDecimal getFifSecFuturos() {
        return this.fifSecFuturos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFifNumUsuario(BigDecimal fifNumUsuario) {
        this.fifNumUsuario = fifNumUsuario;
    }

    public BigDecimal getFifNumUsuario() {
        return this.fifNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFifCveStatus(String fifCveStatus) {
        this.fifCveStatus = fifCveStatus;
    }

    public String getFifCveStatus() {
        return this.fifCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_INTERFASE_FUTUROS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFifIdFideicomiso() != null && this.getFifIdFideicomiso().longValue() == -999) {
            conditions += " AND FIF_ID_FIDEICOMISO IS NULL";
        } else if (this.getFifIdFideicomiso() != null) {
            conditions += " AND FIF_ID_FIDEICOMISO = ?";
            values.add(this.getFifIdFideicomiso());
        }

        if (this.getFifIdSubcta() != null && this.getFifIdSubcta().longValue() == -999) {
            conditions += " AND FIF_ID_SUBCTA IS NULL";
        } else if (this.getFifIdSubcta() != null) {
            conditions += " AND FIF_ID_SUBCTA = ?";
            values.add(this.getFifIdSubcta());
        }

        if (this.getFifIdCtoinver() != null && this.getFifIdCtoinver().longValue() == -999) {
            conditions += " AND FIF_ID_CTOINVER IS NULL";
        } else if (this.getFifIdCtoinver() != null) {
            conditions += " AND FIF_ID_CTOINVER = ?";
            values.add(this.getFifIdCtoinver());
        }

        if (this.getFifIdSecuencial() != null && this.getFifIdSecuencial().longValue() == -999) {
            conditions += " AND FIF_ID_SECUENCIAL IS NULL";
        } else if (this.getFifIdSecuencial() != null) {
            conditions += " AND FIF_ID_SECUENCIAL = ?";
            values.add(this.getFifIdSecuencial());
        }

        if (this.getFifIdFecha() != null && "null".equals(this.getFifIdFecha())) {
            conditions += " AND FIF_ID_FECHA IS NULL";
        } else if (this.getFifIdFecha() != null) {
            conditions += " AND FIF_ID_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFifIdFecha());
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
        String sql = "SELECT * FROM F_INTERFASE_FUTUROS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFifIdFideicomiso() != null && this.getFifIdFideicomiso().longValue() == -999) {
            conditions += " AND FIF_ID_FIDEICOMISO IS NULL";
        } else if (this.getFifIdFideicomiso() != null) {
            conditions += " AND FIF_ID_FIDEICOMISO = ?";
            values.add(this.getFifIdFideicomiso());
        }

        if (this.getFifIdSubcta() != null && this.getFifIdSubcta().longValue() == -999) {
            conditions += " AND FIF_ID_SUBCTA IS NULL";
        } else if (this.getFifIdSubcta() != null) {
            conditions += " AND FIF_ID_SUBCTA = ?";
            values.add(this.getFifIdSubcta());
        }

        if (this.getFifIdCtoinver() != null && this.getFifIdCtoinver().longValue() == -999) {
            conditions += " AND FIF_ID_CTOINVER IS NULL";
        } else if (this.getFifIdCtoinver() != null) {
            conditions += " AND FIF_ID_CTOINVER = ?";
            values.add(this.getFifIdCtoinver());
        }

        if (this.getFifIdSecuencial() != null && this.getFifIdSecuencial().longValue() == -999) {
            conditions += " AND FIF_ID_SECUENCIAL IS NULL";
        } else if (this.getFifIdSecuencial() != null) {
            conditions += " AND FIF_ID_SECUENCIAL = ?";
            values.add(this.getFifIdSecuencial());
        }

        if (this.getFifPizarra() != null && "null".equals(this.getFifPizarra())) {
            conditions += " AND FIF_PIZARRA IS NULL";
        } else if (this.getFifPizarra() != null) {
            conditions += " AND FIF_PIZARRA = ?";
            values.add(this.getFifPizarra());
        }

        if (this.getFifSerie() != null && "null".equals(this.getFifSerie())) {
            conditions += " AND FIF_SERIE IS NULL";
        } else if (this.getFifSerie() != null) {
            conditions += " AND FIF_SERIE = ?";
            values.add(this.getFifSerie());
        }

        if (this.getFifCupon() != null && this.getFifCupon().longValue() == -999) {
            conditions += " AND FIF_CUPON IS NULL";
        } else if (this.getFifCupon() != null) {
            conditions += " AND FIF_CUPON = ?";
            values.add(this.getFifCupon());
        }

        if (this.getFifCtosFuturo() != null && this.getFifCtosFuturo().longValue() == -999) {
            conditions += " AND FIF_CTOS_FUTURO IS NULL";
        } else if (this.getFifCtosFuturo() != null) {
            conditions += " AND FIF_CTOS_FUTURO = ?";
            values.add(this.getFifCtosFuturo());
        }

        if (this.getFifValNominal() != null && this.getFifValNominal().longValue() == -999) {
            conditions += " AND FIF_VAL_NOMINAL IS NULL";
        } else if (this.getFifValNominal() != null) {
            conditions += " AND FIF_VAL_NOMINAL = ?";
            values.add(this.getFifValNominal());
        }

        if (this.getFifIpc() != null && this.getFifIpc().longValue() == -999) {
            conditions += " AND FIF_IPC IS NULL";
        } else if (this.getFifIpc() != null) {
            conditions += " AND FIF_IPC = ?";
            values.add(this.getFifIpc());
        }

        if (this.getFifIdFecha() != null && "null".equals(this.getFifIdFecha())) {
            conditions += " AND FIF_ID_FECHA IS NULL";
        } else if (this.getFifIdFecha() != null) {
            conditions += " AND FIF_ID_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFifIdFecha());
        }

        if (this.getFifCveOperacion() != null && "null".equals(this.getFifCveOperacion())) {
            conditions += " AND FIF_CVE_OPERACION IS NULL";
        } else if (this.getFifCveOperacion() != null) {
            conditions += " AND FIF_CVE_OPERACION = ?";
            values.add(this.getFifCveOperacion());
        }

        if (this.getFifSecFuturos() != null && this.getFifSecFuturos().longValue() == -999) {
            conditions += " AND FIF_SEC_FUTUROS IS NULL";
        } else if (this.getFifSecFuturos() != null) {
            conditions += " AND FIF_SEC_FUTUROS = ?";
            values.add(this.getFifSecFuturos());
        }

        if (this.getFifNumUsuario() != null && this.getFifNumUsuario().longValue() == -999) {
            conditions += " AND FIF_NUM_USUARIO IS NULL";
        } else if (this.getFifNumUsuario() != null) {
            conditions += " AND FIF_NUM_USUARIO = ?";
            values.add(this.getFifNumUsuario());
        }

        if (this.getFifCveStatus() != null && "null".equals(this.getFifCveStatus())) {
            conditions += " AND FIF_CVE_STATUS IS NULL";
        } else if (this.getFifCveStatus() != null) {
            conditions += " AND FIF_CVE_STATUS = ?";
            values.add(this.getFifCveStatus());
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
        String sql = "UPDATE F_INTERFASE_FUTUROS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FIF_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFifIdFideicomiso());
        conditions += " AND FIF_ID_SUBCTA = ?";
        pkValues.add(this.getFifIdSubcta());
        conditions += " AND FIF_ID_CTOINVER = ?";
        pkValues.add(this.getFifIdCtoinver());
        conditions += " AND FIF_ID_SECUENCIAL = ?";
        pkValues.add(this.getFifIdSecuencial());
        fields += " FIF_PIZARRA = ?, ";
        values.add(this.getFifPizarra());
        fields += " FIF_SERIE = ?, ";
        values.add(this.getFifSerie());
        fields += " FIF_CUPON = ?, ";
        values.add(this.getFifCupon());
        fields += " FIF_CTOS_FUTURO = ?, ";
        values.add(this.getFifCtosFuturo());
        fields += " FIF_VAL_NOMINAL = ?, ";
        values.add(this.getFifValNominal());
        fields += " FIF_IPC = ?, ";
        values.add(this.getFifIpc());
        conditions += " AND FIF_ID_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFifIdFecha());
        fields += " FIF_CVE_OPERACION = ?, ";
        values.add(this.getFifCveOperacion());
        fields += " FIF_SEC_FUTUROS = ?, ";
        values.add(this.getFifSecFuturos());
        fields += " FIF_NUM_USUARIO = ?, ";
        values.add(this.getFifNumUsuario());
        fields += " FIF_CVE_STATUS = ?, ";
        values.add(this.getFifCveStatus());
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
        String sql = "INSERT INTO F_INTERFASE_FUTUROS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FIF_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFifIdFideicomiso());

        fields += ", FIF_ID_SUBCTA";
        fieldValues += ", ?";
        values.add(this.getFifIdSubcta());

        fields += ", FIF_ID_CTOINVER";
        fieldValues += ", ?";
        values.add(this.getFifIdCtoinver());

        fields += ", FIF_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFifIdSecuencial());

        fields += ", FIF_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getFifPizarra());

        fields += ", FIF_SERIE";
        fieldValues += ", ?";
        values.add(this.getFifSerie());

        fields += ", FIF_CUPON";
        fieldValues += ", ?";
        values.add(this.getFifCupon());

        fields += ", FIF_CTOS_FUTURO";
        fieldValues += ", ?";
        values.add(this.getFifCtosFuturo());

        fields += ", FIF_VAL_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getFifValNominal());

        fields += ", FIF_IPC";
        fieldValues += ", ?";
        values.add(this.getFifIpc());

        fields += ", FIF_ID_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFifIdFecha());

        fields += ", FIF_CVE_OPERACION";
        fieldValues += ", ?";
        values.add(this.getFifCveOperacion());

        fields += ", FIF_SEC_FUTUROS";
        fieldValues += ", ?";
        values.add(this.getFifSecFuturos());

        fields += ", FIF_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFifNumUsuario());

        fields += ", FIF_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getFifCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_INTERFASE_FUTUROS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FIF_ID_FIDEICOMISO = ?";
        values.add(this.getFifIdFideicomiso());
        conditions += " AND FIF_ID_SUBCTA = ?";
        values.add(this.getFifIdSubcta());
        conditions += " AND FIF_ID_CTOINVER = ?";
        values.add(this.getFifIdCtoinver());
        conditions += " AND FIF_ID_SECUENCIAL = ?";
        values.add(this.getFifIdSecuencial());
        conditions += " AND FIF_ID_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFifIdFecha());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FInterfaseFuturos instance = (FInterfaseFuturos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFifIdFideicomiso().equals(instance.getFifIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFifIdSubcta().equals(instance.getFifIdSubcta()))
            equalObjects = false;
        if (equalObjects && !this.getFifIdCtoinver().equals(instance.getFifIdCtoinver()))
            equalObjects = false;
        if (equalObjects && !this.getFifIdSecuencial().equals(instance.getFifIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFifPizarra().equals(instance.getFifPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getFifSerie().equals(instance.getFifSerie()))
            equalObjects = false;
        if (equalObjects && !this.getFifCupon().equals(instance.getFifCupon()))
            equalObjects = false;
        if (equalObjects && !this.getFifCtosFuturo().equals(instance.getFifCtosFuturo()))
            equalObjects = false;
        if (equalObjects && !this.getFifValNominal().equals(instance.getFifValNominal()))
            equalObjects = false;
        if (equalObjects && !this.getFifIpc().equals(instance.getFifIpc()))
            equalObjects = false;
        if (equalObjects && !this.getFifIdFecha().equals(instance.getFifIdFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFifCveOperacion().equals(instance.getFifCveOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getFifSecFuturos().equals(instance.getFifSecFuturos()))
            equalObjects = false;
        if (equalObjects && !this.getFifNumUsuario().equals(instance.getFifNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getFifCveStatus().equals(instance.getFifCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FInterfaseFuturos result = new FInterfaseFuturos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFifIdFideicomiso((BigDecimal) objectData.getData("FIF_ID_FIDEICOMISO"));
        result.setFifIdSubcta((BigDecimal) objectData.getData("FIF_ID_SUBCTA"));
        result.setFifIdCtoinver((BigDecimal) objectData.getData("FIF_ID_CTOINVER"));
        result.setFifIdSecuencial((BigDecimal) objectData.getData("FIF_ID_SECUENCIAL"));
        result.setFifPizarra((String) objectData.getData("FIF_PIZARRA"));
        result.setFifSerie((String) objectData.getData("FIF_SERIE"));
        result.setFifCupon((BigDecimal) objectData.getData("FIF_CUPON"));
        result.setFifCtosFuturo((BigDecimal) objectData.getData("FIF_CTOS_FUTURO"));
        result.setFifValNominal((BigDecimal) objectData.getData("FIF_VAL_NOMINAL"));
        result.setFifIpc((BigDecimal) objectData.getData("FIF_IPC"));
        result.setFifIdFecha((String) objectData.getData("FIF_ID_FECHA"));
        result.setFifCveOperacion((String) objectData.getData("FIF_CVE_OPERACION"));
        result.setFifSecFuturos((BigDecimal) objectData.getData("FIF_SEC_FUTUROS"));
        result.setFifNumUsuario((BigDecimal) objectData.getData("FIF_NUM_USUARIO"));
        result.setFifCveStatus((String) objectData.getData("FIF_CVE_STATUS"));

        return result;

    }

}
