package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CONCILIA_VALORES_PK", columns = { "FCVA_FECHA", "FCVA_FIDEICOMISO", "FCVA_SUBCUENTA", "FCVA_CTO_INVER" }, sequences = { "MANUAL" })
public class FConciliaValores extends DomainObject {

    String fcvaFecha = null;
    BigDecimal fcvaFideicomiso = null;
    BigDecimal fcvaSubcuenta = null;
    BigDecimal fcvaCtoInver = null;
    BigDecimal fcvaSaldoMcP = null;
    BigDecimal fcvaSaldoMdP = null;
    BigDecimal fcvaSaldoReP = null;
    BigDecimal fcvaSaldoEfectivoP = null;
    BigDecimal fcvaSaldoTotalP = null;
    BigDecimal fcvaSaldoMcF = null;
    BigDecimal fcvaSaldoMdF = null;
    BigDecimal fcvaSaldoReF = null;
    BigDecimal fcvaSaldoEfectivoF = null;
    BigDecimal fcvaSaldoTotalF = null;
    BigDecimal fcvaSaldoMcC = null;
    BigDecimal fcvaSaldoMdC = null;
    BigDecimal fcvaSaldoReC = null;
    BigDecimal fcvaSaldoEfectivoC = null;
    BigDecimal fcvaSaldoTotalC = null;
    BigDecimal fcvaDiferencia = null;
    String fcvaComentario = null;
    String fcvaCveStatus = null;

    public FConciliaValores() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFcvaFecha(String fcvaFecha) {
        this.fcvaFecha = fcvaFecha;
    }

    public String getFcvaFecha() {
        return this.fcvaFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcvaFideicomiso(BigDecimal fcvaFideicomiso) {
        this.fcvaFideicomiso = fcvaFideicomiso;
    }

    public BigDecimal getFcvaFideicomiso() {
        return this.fcvaFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcvaSubcuenta(BigDecimal fcvaSubcuenta) {
        this.fcvaSubcuenta = fcvaSubcuenta;
    }

    public BigDecimal getFcvaSubcuenta() {
        return this.fcvaSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcvaCtoInver(BigDecimal fcvaCtoInver) {
        this.fcvaCtoInver = fcvaCtoInver;
    }

    public BigDecimal getFcvaCtoInver() {
        return this.fcvaCtoInver;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoMcP(BigDecimal fcvaSaldoMcP) {
        this.fcvaSaldoMcP = fcvaSaldoMcP;
    }

    public BigDecimal getFcvaSaldoMcP() {
        return this.fcvaSaldoMcP;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoMdP(BigDecimal fcvaSaldoMdP) {
        this.fcvaSaldoMdP = fcvaSaldoMdP;
    }

    public BigDecimal getFcvaSaldoMdP() {
        return this.fcvaSaldoMdP;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoReP(BigDecimal fcvaSaldoReP) {
        this.fcvaSaldoReP = fcvaSaldoReP;
    }

    public BigDecimal getFcvaSaldoReP() {
        return this.fcvaSaldoReP;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoEfectivoP(BigDecimal fcvaSaldoEfectivoP) {
        this.fcvaSaldoEfectivoP = fcvaSaldoEfectivoP;
    }

    public BigDecimal getFcvaSaldoEfectivoP() {
        return this.fcvaSaldoEfectivoP;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoTotalP(BigDecimal fcvaSaldoTotalP) {
        this.fcvaSaldoTotalP = fcvaSaldoTotalP;
    }

    public BigDecimal getFcvaSaldoTotalP() {
        return this.fcvaSaldoTotalP;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoMcF(BigDecimal fcvaSaldoMcF) {
        this.fcvaSaldoMcF = fcvaSaldoMcF;
    }

    public BigDecimal getFcvaSaldoMcF() {
        return this.fcvaSaldoMcF;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoMdF(BigDecimal fcvaSaldoMdF) {
        this.fcvaSaldoMdF = fcvaSaldoMdF;
    }

    public BigDecimal getFcvaSaldoMdF() {
        return this.fcvaSaldoMdF;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoReF(BigDecimal fcvaSaldoReF) {
        this.fcvaSaldoReF = fcvaSaldoReF;
    }

    public BigDecimal getFcvaSaldoReF() {
        return this.fcvaSaldoReF;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoEfectivoF(BigDecimal fcvaSaldoEfectivoF) {
        this.fcvaSaldoEfectivoF = fcvaSaldoEfectivoF;
    }

    public BigDecimal getFcvaSaldoEfectivoF() {
        return this.fcvaSaldoEfectivoF;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoTotalF(BigDecimal fcvaSaldoTotalF) {
        this.fcvaSaldoTotalF = fcvaSaldoTotalF;
    }

    public BigDecimal getFcvaSaldoTotalF() {
        return this.fcvaSaldoTotalF;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoMcC(BigDecimal fcvaSaldoMcC) {
        this.fcvaSaldoMcC = fcvaSaldoMcC;
    }

    public BigDecimal getFcvaSaldoMcC() {
        return this.fcvaSaldoMcC;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoMdC(BigDecimal fcvaSaldoMdC) {
        this.fcvaSaldoMdC = fcvaSaldoMdC;
    }

    public BigDecimal getFcvaSaldoMdC() {
        return this.fcvaSaldoMdC;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoReC(BigDecimal fcvaSaldoReC) {
        this.fcvaSaldoReC = fcvaSaldoReC;
    }

    public BigDecimal getFcvaSaldoReC() {
        return this.fcvaSaldoReC;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoEfectivoC(BigDecimal fcvaSaldoEfectivoC) {
        this.fcvaSaldoEfectivoC = fcvaSaldoEfectivoC;
    }

    public BigDecimal getFcvaSaldoEfectivoC() {
        return this.fcvaSaldoEfectivoC;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaSaldoTotalC(BigDecimal fcvaSaldoTotalC) {
        this.fcvaSaldoTotalC = fcvaSaldoTotalC;
    }

    public BigDecimal getFcvaSaldoTotalC() {
        return this.fcvaSaldoTotalC;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFcvaDiferencia(BigDecimal fcvaDiferencia) {
        this.fcvaDiferencia = fcvaDiferencia;
    }

    public BigDecimal getFcvaDiferencia() {
        return this.fcvaDiferencia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcvaComentario(String fcvaComentario) {
        this.fcvaComentario = fcvaComentario;
    }

    public String getFcvaComentario() {
        return this.fcvaComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcvaCveStatus(String fcvaCveStatus) {
        this.fcvaCveStatus = fcvaCveStatus;
    }

    public String getFcvaCveStatus() {
        return this.fcvaCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONCILIA_VALORES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcvaFecha() != null && "null".equals(this.getFcvaFecha())) {
            conditions += " AND FCVA_FECHA IS NULL";
        } else if (this.getFcvaFecha() != null) {
            conditions += " AND FCVA_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcvaFecha());
        }

        if (this.getFcvaFideicomiso() != null && this.getFcvaFideicomiso().longValue() == -999) {
            conditions += " AND FCVA_FIDEICOMISO IS NULL";
        } else if (this.getFcvaFideicomiso() != null) {
            conditions += " AND FCVA_FIDEICOMISO = ?";
            values.add(this.getFcvaFideicomiso());
        }

        if (this.getFcvaSubcuenta() != null && this.getFcvaSubcuenta().longValue() == -999) {
            conditions += " AND FCVA_SUBCUENTA IS NULL";
        } else if (this.getFcvaSubcuenta() != null) {
            conditions += " AND FCVA_SUBCUENTA = ?";
            values.add(this.getFcvaSubcuenta());
        }

        if (this.getFcvaCtoInver() != null && this.getFcvaCtoInver().longValue() == -999) {
            conditions += " AND FCVA_CTO_INVER IS NULL";
        } else if (this.getFcvaCtoInver() != null) {
            conditions += " AND FCVA_CTO_INVER = ?";
            values.add(this.getFcvaCtoInver());
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
        String sql = "SELECT * FROM F_CONCILIA_VALORES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcvaFecha() != null && "null".equals(this.getFcvaFecha())) {
            conditions += " AND FCVA_FECHA IS NULL";
        } else if (this.getFcvaFecha() != null) {
            conditions += " AND FCVA_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcvaFecha());
        }

        if (this.getFcvaFideicomiso() != null && this.getFcvaFideicomiso().longValue() == -999) {
            conditions += " AND FCVA_FIDEICOMISO IS NULL";
        } else if (this.getFcvaFideicomiso() != null) {
            conditions += " AND FCVA_FIDEICOMISO = ?";
            values.add(this.getFcvaFideicomiso());
        }

        if (this.getFcvaSubcuenta() != null && this.getFcvaSubcuenta().longValue() == -999) {
            conditions += " AND FCVA_SUBCUENTA IS NULL";
        } else if (this.getFcvaSubcuenta() != null) {
            conditions += " AND FCVA_SUBCUENTA = ?";
            values.add(this.getFcvaSubcuenta());
        }

        if (this.getFcvaCtoInver() != null && this.getFcvaCtoInver().longValue() == -999) {
            conditions += " AND FCVA_CTO_INVER IS NULL";
        } else if (this.getFcvaCtoInver() != null) {
            conditions += " AND FCVA_CTO_INVER = ?";
            values.add(this.getFcvaCtoInver());
        }

        if (this.getFcvaSaldoMcP() != null && this.getFcvaSaldoMcP().longValue() == -999) {
            conditions += " AND FCVA_SALDO_MC_P IS NULL";
        } else if (this.getFcvaSaldoMcP() != null) {
            conditions += " AND FCVA_SALDO_MC_P = ?";
            values.add(this.getFcvaSaldoMcP());
        }

        if (this.getFcvaSaldoMdP() != null && this.getFcvaSaldoMdP().longValue() == -999) {
            conditions += " AND FCVA_SALDO_MD_P IS NULL";
        } else if (this.getFcvaSaldoMdP() != null) {
            conditions += " AND FCVA_SALDO_MD_P = ?";
            values.add(this.getFcvaSaldoMdP());
        }

        if (this.getFcvaSaldoReP() != null && this.getFcvaSaldoReP().longValue() == -999) {
            conditions += " AND FCVA_SALDO_RE_P IS NULL";
        } else if (this.getFcvaSaldoReP() != null) {
            conditions += " AND FCVA_SALDO_RE_P = ?";
            values.add(this.getFcvaSaldoReP());
        }

        if (this.getFcvaSaldoEfectivoP() != null && this.getFcvaSaldoEfectivoP().longValue() == -999) {
            conditions += " AND FCVA_SALDO_EFECTIVO_P IS NULL";
        } else if (this.getFcvaSaldoEfectivoP() != null) {
            conditions += " AND FCVA_SALDO_EFECTIVO_P = ?";
            values.add(this.getFcvaSaldoEfectivoP());
        }

        if (this.getFcvaSaldoTotalP() != null && this.getFcvaSaldoTotalP().longValue() == -999) {
            conditions += " AND FCVA_SALDO_TOTAL_P IS NULL";
        } else if (this.getFcvaSaldoTotalP() != null) {
            conditions += " AND FCVA_SALDO_TOTAL_P = ?";
            values.add(this.getFcvaSaldoTotalP());
        }

        if (this.getFcvaSaldoMcF() != null && this.getFcvaSaldoMcF().longValue() == -999) {
            conditions += " AND FCVA_SALDO_MC_F IS NULL";
        } else if (this.getFcvaSaldoMcF() != null) {
            conditions += " AND FCVA_SALDO_MC_F = ?";
            values.add(this.getFcvaSaldoMcF());
        }

        if (this.getFcvaSaldoMdF() != null && this.getFcvaSaldoMdF().longValue() == -999) {
            conditions += " AND FCVA_SALDO_MD_F IS NULL";
        } else if (this.getFcvaSaldoMdF() != null) {
            conditions += " AND FCVA_SALDO_MD_F = ?";
            values.add(this.getFcvaSaldoMdF());
        }

        if (this.getFcvaSaldoReF() != null && this.getFcvaSaldoReF().longValue() == -999) {
            conditions += " AND FCVA_SALDO_RE_F IS NULL";
        } else if (this.getFcvaSaldoReF() != null) {
            conditions += " AND FCVA_SALDO_RE_F = ?";
            values.add(this.getFcvaSaldoReF());
        }

        if (this.getFcvaSaldoEfectivoF() != null && this.getFcvaSaldoEfectivoF().longValue() == -999) {
            conditions += " AND FCVA_SALDO_EFECTIVO_F IS NULL";
        } else if (this.getFcvaSaldoEfectivoF() != null) {
            conditions += " AND FCVA_SALDO_EFECTIVO_F = ?";
            values.add(this.getFcvaSaldoEfectivoF());
        }

        if (this.getFcvaSaldoTotalF() != null && this.getFcvaSaldoTotalF().longValue() == -999) {
            conditions += " AND FCVA_SALDO_TOTAL_F IS NULL";
        } else if (this.getFcvaSaldoTotalF() != null) {
            conditions += " AND FCVA_SALDO_TOTAL_F = ?";
            values.add(this.getFcvaSaldoTotalF());
        }

        if (this.getFcvaSaldoMcC() != null && this.getFcvaSaldoMcC().longValue() == -999) {
            conditions += " AND FCVA_SALDO_MC_C IS NULL";
        } else if (this.getFcvaSaldoMcC() != null) {
            conditions += " AND FCVA_SALDO_MC_C = ?";
            values.add(this.getFcvaSaldoMcC());
        }

        if (this.getFcvaSaldoMdC() != null && this.getFcvaSaldoMdC().longValue() == -999) {
            conditions += " AND FCVA_SALDO_MD_C IS NULL";
        } else if (this.getFcvaSaldoMdC() != null) {
            conditions += " AND FCVA_SALDO_MD_C = ?";
            values.add(this.getFcvaSaldoMdC());
        }

        if (this.getFcvaSaldoReC() != null && this.getFcvaSaldoReC().longValue() == -999) {
            conditions += " AND FCVA_SALDO_RE_C IS NULL";
        } else if (this.getFcvaSaldoReC() != null) {
            conditions += " AND FCVA_SALDO_RE_C = ?";
            values.add(this.getFcvaSaldoReC());
        }

        if (this.getFcvaSaldoEfectivoC() != null && this.getFcvaSaldoEfectivoC().longValue() == -999) {
            conditions += " AND FCVA_SALDO_EFECTIVO_C IS NULL";
        } else if (this.getFcvaSaldoEfectivoC() != null) {
            conditions += " AND FCVA_SALDO_EFECTIVO_C = ?";
            values.add(this.getFcvaSaldoEfectivoC());
        }

        if (this.getFcvaSaldoTotalC() != null && this.getFcvaSaldoTotalC().longValue() == -999) {
            conditions += " AND FCVA_SALDO_TOTAL_C IS NULL";
        } else if (this.getFcvaSaldoTotalC() != null) {
            conditions += " AND FCVA_SALDO_TOTAL_C = ?";
            values.add(this.getFcvaSaldoTotalC());
        }

        if (this.getFcvaDiferencia() != null && this.getFcvaDiferencia().longValue() == -999) {
            conditions += " AND FCVA_DIFERENCIA IS NULL";
        } else if (this.getFcvaDiferencia() != null) {
            conditions += " AND FCVA_DIFERENCIA = ?";
            values.add(this.getFcvaDiferencia());
        }

        if (this.getFcvaComentario() != null && "null".equals(this.getFcvaComentario())) {
            conditions += " AND FCVA_COMENTARIO IS NULL";
        } else if (this.getFcvaComentario() != null) {
            conditions += " AND FCVA_COMENTARIO = ?";
            values.add(this.getFcvaComentario());
        }

        if (this.getFcvaCveStatus() != null && "null".equals(this.getFcvaCveStatus())) {
            conditions += " AND FCVA_CVE_STATUS IS NULL";
        } else if (this.getFcvaCveStatus() != null) {
            conditions += " AND FCVA_CVE_STATUS = ?";
            values.add(this.getFcvaCveStatus());
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
        String sql = "UPDATE F_CONCILIA_VALORES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCVA_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFcvaFecha());
        conditions += " AND FCVA_FIDEICOMISO = ?";
        pkValues.add(this.getFcvaFideicomiso());
        conditions += " AND FCVA_SUBCUENTA = ?";
        pkValues.add(this.getFcvaSubcuenta());
        conditions += " AND FCVA_CTO_INVER = ?";
        pkValues.add(this.getFcvaCtoInver());
        fields += " FCVA_SALDO_MC_P = ?, ";
        values.add(this.getFcvaSaldoMcP());
        fields += " FCVA_SALDO_MD_P = ?, ";
        values.add(this.getFcvaSaldoMdP());
        fields += " FCVA_SALDO_RE_P = ?, ";
        values.add(this.getFcvaSaldoReP());
        fields += " FCVA_SALDO_EFECTIVO_P = ?, ";
        values.add(this.getFcvaSaldoEfectivoP());
        fields += " FCVA_SALDO_TOTAL_P = ?, ";
        values.add(this.getFcvaSaldoTotalP());
        fields += " FCVA_SALDO_MC_F = ?, ";
        values.add(this.getFcvaSaldoMcF());
        fields += " FCVA_SALDO_MD_F = ?, ";
        values.add(this.getFcvaSaldoMdF());
        fields += " FCVA_SALDO_RE_F = ?, ";
        values.add(this.getFcvaSaldoReF());
        fields += " FCVA_SALDO_EFECTIVO_F = ?, ";
        values.add(this.getFcvaSaldoEfectivoF());
        fields += " FCVA_SALDO_TOTAL_F = ?, ";
        values.add(this.getFcvaSaldoTotalF());
        fields += " FCVA_SALDO_MC_C = ?, ";
        values.add(this.getFcvaSaldoMcC());
        fields += " FCVA_SALDO_MD_C = ?, ";
        values.add(this.getFcvaSaldoMdC());
        fields += " FCVA_SALDO_RE_C = ?, ";
        values.add(this.getFcvaSaldoReC());
        fields += " FCVA_SALDO_EFECTIVO_C = ?, ";
        values.add(this.getFcvaSaldoEfectivoC());
        fields += " FCVA_SALDO_TOTAL_C = ?, ";
        values.add(this.getFcvaSaldoTotalC());
        fields += " FCVA_DIFERENCIA = ?, ";
        values.add(this.getFcvaDiferencia());
        fields += " FCVA_COMENTARIO = ?, ";
        values.add(this.getFcvaComentario());
        fields += " FCVA_CVE_STATUS = ?, ";
        values.add(this.getFcvaCveStatus());
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
        String sql = "INSERT INTO F_CONCILIA_VALORES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCVA_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcvaFecha());

        fields += ", FCVA_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFcvaFideicomiso());

        fields += ", FCVA_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFcvaSubcuenta());

        fields += ", FCVA_CTO_INVER";
        fieldValues += ", ?";
        values.add(this.getFcvaCtoInver());

        fields += ", FCVA_SALDO_MC_P";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoMcP());

        fields += ", FCVA_SALDO_MD_P";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoMdP());

        fields += ", FCVA_SALDO_RE_P";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoReP());

        fields += ", FCVA_SALDO_EFECTIVO_P";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoEfectivoP());

        fields += ", FCVA_SALDO_TOTAL_P";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoTotalP());

        fields += ", FCVA_SALDO_MC_F";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoMcF());

        fields += ", FCVA_SALDO_MD_F";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoMdF());

        fields += ", FCVA_SALDO_RE_F";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoReF());

        fields += ", FCVA_SALDO_EFECTIVO_F";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoEfectivoF());

        fields += ", FCVA_SALDO_TOTAL_F";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoTotalF());

        fields += ", FCVA_SALDO_MC_C";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoMcC());

        fields += ", FCVA_SALDO_MD_C";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoMdC());

        fields += ", FCVA_SALDO_RE_C";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoReC());

        fields += ", FCVA_SALDO_EFECTIVO_C";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoEfectivoC());

        fields += ", FCVA_SALDO_TOTAL_C";
        fieldValues += ", ?";
        values.add(this.getFcvaSaldoTotalC());

        fields += ", FCVA_DIFERENCIA";
        fieldValues += ", ?";
        values.add(this.getFcvaDiferencia());

        fields += ", FCVA_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFcvaComentario());

        fields += ", FCVA_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getFcvaCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONCILIA_VALORES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCVA_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFcvaFecha());
        conditions += " AND FCVA_FIDEICOMISO = ?";
        values.add(this.getFcvaFideicomiso());
        conditions += " AND FCVA_SUBCUENTA = ?";
        values.add(this.getFcvaSubcuenta());
        conditions += " AND FCVA_CTO_INVER = ?";
        values.add(this.getFcvaCtoInver());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FConciliaValores instance = (FConciliaValores) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcvaFecha().equals(instance.getFcvaFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaFideicomiso().equals(instance.getFcvaFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSubcuenta().equals(instance.getFcvaSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaCtoInver().equals(instance.getFcvaCtoInver()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoMcP().equals(instance.getFcvaSaldoMcP()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoMdP().equals(instance.getFcvaSaldoMdP()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoReP().equals(instance.getFcvaSaldoReP()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoEfectivoP().equals(instance.getFcvaSaldoEfectivoP()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoTotalP().equals(instance.getFcvaSaldoTotalP()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoMcF().equals(instance.getFcvaSaldoMcF()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoMdF().equals(instance.getFcvaSaldoMdF()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoReF().equals(instance.getFcvaSaldoReF()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoEfectivoF().equals(instance.getFcvaSaldoEfectivoF()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoTotalF().equals(instance.getFcvaSaldoTotalF()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoMcC().equals(instance.getFcvaSaldoMcC()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoMdC().equals(instance.getFcvaSaldoMdC()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoReC().equals(instance.getFcvaSaldoReC()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoEfectivoC().equals(instance.getFcvaSaldoEfectivoC()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaSaldoTotalC().equals(instance.getFcvaSaldoTotalC()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaDiferencia().equals(instance.getFcvaDiferencia()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaComentario().equals(instance.getFcvaComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFcvaCveStatus().equals(instance.getFcvaCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FConciliaValores result = new FConciliaValores();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcvaFecha((String) objectData.getData("FCVA_FECHA"));
        result.setFcvaFideicomiso((BigDecimal) objectData.getData("FCVA_FIDEICOMISO"));
        result.setFcvaSubcuenta((BigDecimal) objectData.getData("FCVA_SUBCUENTA"));
        result.setFcvaCtoInver((BigDecimal) objectData.getData("FCVA_CTO_INVER"));
        result.setFcvaSaldoMcP((BigDecimal) objectData.getData("FCVA_SALDO_MC_P"));
        result.setFcvaSaldoMdP((BigDecimal) objectData.getData("FCVA_SALDO_MD_P"));
        result.setFcvaSaldoReP((BigDecimal) objectData.getData("FCVA_SALDO_RE_P"));
        result.setFcvaSaldoEfectivoP((BigDecimal) objectData.getData("FCVA_SALDO_EFECTIVO_P"));
        result.setFcvaSaldoTotalP((BigDecimal) objectData.getData("FCVA_SALDO_TOTAL_P"));
        result.setFcvaSaldoMcF((BigDecimal) objectData.getData("FCVA_SALDO_MC_F"));
        result.setFcvaSaldoMdF((BigDecimal) objectData.getData("FCVA_SALDO_MD_F"));
        result.setFcvaSaldoReF((BigDecimal) objectData.getData("FCVA_SALDO_RE_F"));
        result.setFcvaSaldoEfectivoF((BigDecimal) objectData.getData("FCVA_SALDO_EFECTIVO_F"));
        result.setFcvaSaldoTotalF((BigDecimal) objectData.getData("FCVA_SALDO_TOTAL_F"));
        result.setFcvaSaldoMcC((BigDecimal) objectData.getData("FCVA_SALDO_MC_C"));
        result.setFcvaSaldoMdC((BigDecimal) objectData.getData("FCVA_SALDO_MD_C"));
        result.setFcvaSaldoReC((BigDecimal) objectData.getData("FCVA_SALDO_RE_C"));
        result.setFcvaSaldoEfectivoC((BigDecimal) objectData.getData("FCVA_SALDO_EFECTIVO_C"));
        result.setFcvaSaldoTotalC((BigDecimal) objectData.getData("FCVA_SALDO_TOTAL_C"));
        result.setFcvaDiferencia((BigDecimal) objectData.getData("FCVA_DIFERENCIA"));
        result.setFcvaComentario((String) objectData.getData("FCVA_COMENTARIO"));
        result.setFcvaCveStatus((String) objectData.getData("FCVA_CVE_STATUS"));

        return result;

    }

}
