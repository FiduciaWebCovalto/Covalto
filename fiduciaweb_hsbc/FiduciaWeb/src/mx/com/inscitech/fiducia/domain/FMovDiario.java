package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FMovDiario extends DomainObject {

    BigDecimal fmdFolio = null;
    BigDecimal fmdNumFideicomiso = null;
    String fmdNomFideicomiso = null;
    BigDecimal fmdIdSecuencial = null;
    String fmdNumSubcuenta = null;
    String fmdPeriodo = null;
    String fmdFecha = null;
    String fmdDescripcion = null;
    BigDecimal fmdCargo = null;
    BigDecimal fmdAbono = null;
    BigDecimal fmdSaldo = null;
    String fmdCuenta = null;
    BigDecimal fmdSaldoInicial = null;
    BigDecimal fmdSaldoFinal = null;
    BigDecimal fmdUsuario = null;

    public FMovDiario() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmdFolio(BigDecimal fmdFolio) {
        this.fmdFolio = fmdFolio;
    }

    public BigDecimal getFmdFolio() {
        return this.fmdFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmdNumFideicomiso(BigDecimal fmdNumFideicomiso) {
        this.fmdNumFideicomiso = fmdNumFideicomiso;
    }

    public BigDecimal getFmdNumFideicomiso() {
        return this.fmdNumFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFmdNomFideicomiso(String fmdNomFideicomiso) {
        this.fmdNomFideicomiso = fmdNomFideicomiso;
    }

    public String getFmdNomFideicomiso() {
        return this.fmdNomFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmdIdSecuencial(BigDecimal fmdIdSecuencial) {
        this.fmdIdSecuencial = fmdIdSecuencial;
    }

    public BigDecimal getFmdIdSecuencial() {
        return this.fmdIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFmdNumSubcuenta(String fmdNumSubcuenta) {
        this.fmdNumSubcuenta = fmdNumSubcuenta;
    }

    public String getFmdNumSubcuenta() {
        return this.fmdNumSubcuenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFmdPeriodo(String fmdPeriodo) {
        this.fmdPeriodo = fmdPeriodo;
    }

    public String getFmdPeriodo() {
        return this.fmdPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFmdFecha(String fmdFecha) {
        this.fmdFecha = fmdFecha;
    }

    public String getFmdFecha() {
        return this.fmdFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFmdDescripcion(String fmdDescripcion) {
        this.fmdDescripcion = fmdDescripcion;
    }

    public String getFmdDescripcion() {
        return this.fmdDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFmdCargo(BigDecimal fmdCargo) {
        this.fmdCargo = fmdCargo;
    }

    public BigDecimal getFmdCargo() {
        return this.fmdCargo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFmdAbono(BigDecimal fmdAbono) {
        this.fmdAbono = fmdAbono;
    }

    public BigDecimal getFmdAbono() {
        return this.fmdAbono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFmdSaldo(BigDecimal fmdSaldo) {
        this.fmdSaldo = fmdSaldo;
    }

    public BigDecimal getFmdSaldo() {
        return this.fmdSaldo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFmdCuenta(String fmdCuenta) {
        this.fmdCuenta = fmdCuenta;
    }

    public String getFmdCuenta() {
        return this.fmdCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFmdSaldoInicial(BigDecimal fmdSaldoInicial) {
        this.fmdSaldoInicial = fmdSaldoInicial;
    }

    public BigDecimal getFmdSaldoInicial() {
        return this.fmdSaldoInicial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFmdSaldoFinal(BigDecimal fmdSaldoFinal) {
        this.fmdSaldoFinal = fmdSaldoFinal;
    }

    public BigDecimal getFmdSaldoFinal() {
        return this.fmdSaldoFinal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFmdUsuario(BigDecimal fmdUsuario) {
        this.fmdUsuario = fmdUsuario;
    }

    public BigDecimal getFmdUsuario() {
        return this.fmdUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_MOV_DIARIO ";

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
        String sql = "SELECT * FROM F_MOV_DIARIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFmdFolio() != null && this.getFmdFolio().longValue() == -999) {
            conditions += " AND FMD_FOLIO IS NULL";
        } else if (this.getFmdFolio() != null) {
            conditions += " AND FMD_FOLIO = ?";
            values.add(this.getFmdFolio());
        }

        if (this.getFmdNumFideicomiso() != null && this.getFmdNumFideicomiso().longValue() == -999) {
            conditions += " AND FMD_NUM_FIDEICOMISO IS NULL";
        } else if (this.getFmdNumFideicomiso() != null) {
            conditions += " AND FMD_NUM_FIDEICOMISO = ?";
            values.add(this.getFmdNumFideicomiso());
        }

        if (this.getFmdNomFideicomiso() != null && "null".equals(this.getFmdNomFideicomiso())) {
            conditions += " AND FMD_NOM_FIDEICOMISO IS NULL";
        } else if (this.getFmdNomFideicomiso() != null) {
            conditions += " AND FMD_NOM_FIDEICOMISO = ?";
            values.add(this.getFmdNomFideicomiso());
        }

        if (this.getFmdIdSecuencial() != null && this.getFmdIdSecuencial().longValue() == -999) {
            conditions += " AND FMD_ID_SECUENCIAL IS NULL";
        } else if (this.getFmdIdSecuencial() != null) {
            conditions += " AND FMD_ID_SECUENCIAL = ?";
            values.add(this.getFmdIdSecuencial());
        }

        if (this.getFmdNumSubcuenta() != null && "null".equals(this.getFmdNumSubcuenta())) {
            conditions += " AND FMD_NUM_SUBCUENTA IS NULL";
        } else if (this.getFmdNumSubcuenta() != null) {
            conditions += " AND FMD_NUM_SUBCUENTA = ?";
            values.add(this.getFmdNumSubcuenta());
        }

        if (this.getFmdPeriodo() != null && "null".equals(this.getFmdPeriodo())) {
            conditions += " AND FMD_PERIODO IS NULL";
        } else if (this.getFmdPeriodo() != null) {
            conditions += " AND FMD_PERIODO = ?";
            values.add(this.getFmdPeriodo());
        }

        if (this.getFmdFecha() != null && "null".equals(this.getFmdFecha())) {
            conditions += " AND FMD_FECHA IS NULL";
        } else if (this.getFmdFecha() != null) {
            conditions += " AND FMD_FECHA = ?";
            values.add(this.getFmdFecha());
        }

        if (this.getFmdDescripcion() != null && "null".equals(this.getFmdDescripcion())) {
            conditions += " AND FMD_DESCRIPCION IS NULL";
        } else if (this.getFmdDescripcion() != null) {
            conditions += " AND FMD_DESCRIPCION = ?";
            values.add(this.getFmdDescripcion());
        }

        if (this.getFmdCargo() != null && this.getFmdCargo().longValue() == -999) {
            conditions += " AND FMD_CARGO IS NULL";
        } else if (this.getFmdCargo() != null) {
            conditions += " AND FMD_CARGO = ?";
            values.add(this.getFmdCargo());
        }

        if (this.getFmdAbono() != null && this.getFmdAbono().longValue() == -999) {
            conditions += " AND FMD_ABONO IS NULL";
        } else if (this.getFmdAbono() != null) {
            conditions += " AND FMD_ABONO = ?";
            values.add(this.getFmdAbono());
        }

        if (this.getFmdSaldo() != null && this.getFmdSaldo().longValue() == -999) {
            conditions += " AND FMD_SALDO IS NULL";
        } else if (this.getFmdSaldo() != null) {
            conditions += " AND FMD_SALDO = ?";
            values.add(this.getFmdSaldo());
        }

        if (this.getFmdCuenta() != null && "null".equals(this.getFmdCuenta())) {
            conditions += " AND FMD_CUENTA IS NULL";
        } else if (this.getFmdCuenta() != null) {
            conditions += " AND FMD_CUENTA = ?";
            values.add(this.getFmdCuenta());
        }

        if (this.getFmdSaldoInicial() != null && this.getFmdSaldoInicial().longValue() == -999) {
            conditions += " AND FMD_SALDO_INICIAL IS NULL";
        } else if (this.getFmdSaldoInicial() != null) {
            conditions += " AND FMD_SALDO_INICIAL = ?";
            values.add(this.getFmdSaldoInicial());
        }

        if (this.getFmdSaldoFinal() != null && this.getFmdSaldoFinal().longValue() == -999) {
            conditions += " AND FMD_SALDO_FINAL IS NULL";
        } else if (this.getFmdSaldoFinal() != null) {
            conditions += " AND FMD_SALDO_FINAL = ?";
            values.add(this.getFmdSaldoFinal());
        }

        if (this.getFmdUsuario() != null && this.getFmdUsuario().longValue() == -999) {
            conditions += " AND FMD_USUARIO IS NULL";
        } else if (this.getFmdUsuario() != null) {
            conditions += " AND FMD_USUARIO = ?";
            values.add(this.getFmdUsuario());
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
        String sql = "UPDATE F_MOV_DIARIO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FMD_FOLIO = ?, ";
        values.add(this.getFmdFolio());
        fields += " FMD_NUM_FIDEICOMISO = ?, ";
        values.add(this.getFmdNumFideicomiso());
        fields += " FMD_NOM_FIDEICOMISO = ?, ";
        values.add(this.getFmdNomFideicomiso());
        fields += " FMD_ID_SECUENCIAL = ?, ";
        values.add(this.getFmdIdSecuencial());
        fields += " FMD_NUM_SUBCUENTA = ?, ";
        values.add(this.getFmdNumSubcuenta());
        fields += " FMD_PERIODO = ?, ";
        values.add(this.getFmdPeriodo());
        fields += " FMD_FECHA = ?, ";
        values.add(this.getFmdFecha());
        fields += " FMD_DESCRIPCION = ?, ";
        values.add(this.getFmdDescripcion());
        fields += " FMD_CARGO = ?, ";
        values.add(this.getFmdCargo());
        fields += " FMD_ABONO = ?, ";
        values.add(this.getFmdAbono());
        fields += " FMD_SALDO = ?, ";
        values.add(this.getFmdSaldo());
        fields += " FMD_CUENTA = ?, ";
        values.add(this.getFmdCuenta());
        fields += " FMD_SALDO_INICIAL = ?, ";
        values.add(this.getFmdSaldoInicial());
        fields += " FMD_SALDO_FINAL = ?, ";
        values.add(this.getFmdSaldoFinal());
        fields += " FMD_USUARIO = ?, ";
        values.add(this.getFmdUsuario());
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
        String sql = "INSERT INTO F_MOV_DIARIO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FMD_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFmdFolio());

        fields += ", FMD_NUM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFmdNumFideicomiso());

        fields += ", FMD_NOM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFmdNomFideicomiso());

        fields += ", FMD_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFmdIdSecuencial());

        fields += ", FMD_NUM_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFmdNumSubcuenta());

        fields += ", FMD_PERIODO";
        fieldValues += ", ?";
        values.add(this.getFmdPeriodo());

        fields += ", FMD_FECHA";
        fieldValues += ", ?";
        values.add(this.getFmdFecha());

        fields += ", FMD_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFmdDescripcion());

        fields += ", FMD_CARGO";
        fieldValues += ", ?";
        values.add(this.getFmdCargo());

        fields += ", FMD_ABONO";
        fieldValues += ", ?";
        values.add(this.getFmdAbono());

        fields += ", FMD_SALDO";
        fieldValues += ", ?";
        values.add(this.getFmdSaldo());

        fields += ", FMD_CUENTA";
        fieldValues += ", ?";
        values.add(this.getFmdCuenta());

        fields += ", FMD_SALDO_INICIAL";
        fieldValues += ", ?";
        values.add(this.getFmdSaldoInicial());

        fields += ", FMD_SALDO_FINAL";
        fieldValues += ", ?";
        values.add(this.getFmdSaldoFinal());

        fields += ", FMD_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFmdUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_MOV_DIARIO WHERE ";

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
        FMovDiario instance = (FMovDiario) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFmdFolio().equals(instance.getFmdFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFmdNumFideicomiso().equals(instance.getFmdNumFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFmdNomFideicomiso().equals(instance.getFmdNomFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFmdIdSecuencial().equals(instance.getFmdIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFmdNumSubcuenta().equals(instance.getFmdNumSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFmdPeriodo().equals(instance.getFmdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getFmdFecha().equals(instance.getFmdFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFmdDescripcion().equals(instance.getFmdDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getFmdCargo().equals(instance.getFmdCargo()))
            equalObjects = false;
        if (equalObjects && !this.getFmdAbono().equals(instance.getFmdAbono()))
            equalObjects = false;
        if (equalObjects && !this.getFmdSaldo().equals(instance.getFmdSaldo()))
            equalObjects = false;
        if (equalObjects && !this.getFmdCuenta().equals(instance.getFmdCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFmdSaldoInicial().equals(instance.getFmdSaldoInicial()))
            equalObjects = false;
        if (equalObjects && !this.getFmdSaldoFinal().equals(instance.getFmdSaldoFinal()))
            equalObjects = false;
        if (equalObjects && !this.getFmdUsuario().equals(instance.getFmdUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FMovDiario result = new FMovDiario();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFmdFolio((BigDecimal) objectData.getData("FMD_FOLIO"));
        result.setFmdNumFideicomiso((BigDecimal) objectData.getData("FMD_NUM_FIDEICOMISO"));
        result.setFmdNomFideicomiso((String) objectData.getData("FMD_NOM_FIDEICOMISO"));
        result.setFmdIdSecuencial((BigDecimal) objectData.getData("FMD_ID_SECUENCIAL"));
        result.setFmdNumSubcuenta((String) objectData.getData("FMD_NUM_SUBCUENTA"));
        result.setFmdPeriodo((String) objectData.getData("FMD_PERIODO"));
        result.setFmdFecha((String) objectData.getData("FMD_FECHA"));
        result.setFmdDescripcion((String) objectData.getData("FMD_DESCRIPCION"));
        result.setFmdCargo((BigDecimal) objectData.getData("FMD_CARGO"));
        result.setFmdAbono((BigDecimal) objectData.getData("FMD_ABONO"));
        result.setFmdSaldo((BigDecimal) objectData.getData("FMD_SALDO"));
        result.setFmdCuenta((String) objectData.getData("FMD_CUENTA"));
        result.setFmdSaldoInicial((BigDecimal) objectData.getData("FMD_SALDO_INICIAL"));
        result.setFmdSaldoFinal((BigDecimal) objectData.getData("FMD_SALDO_FINAL"));
        result.setFmdUsuario((BigDecimal) objectData.getData("FMD_USUARIO"));

        return result;

    }

}
