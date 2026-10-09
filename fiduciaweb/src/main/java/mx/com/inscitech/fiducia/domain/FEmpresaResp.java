package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FEmpresaResp extends DomainObject {

    BigDecimal empNumEmpresa = null;
    String empNomEmpresa = null;
    String empNomArea = null;
    String empDireccion = null;
    String empNomAutoriza = null;
    String empNomFirma = null;
    String empIdioma = null;
    String empEstilo = null;
    String empFecCambio = null;
    String empLlaveEmpresa = null;
    String empNomAutoriza2 = null;
    String empNomFirma2 = null;
    String empLeyendaEdosfin = null;
    String empLeyendaEdores = null;
    BigDecimal empConfirma = null;
    BigDecimal empInterValores = null;
    String empNombreValores = null;
    BigDecimal empInterConta = null;
    String empNombreConta = null;
    BigDecimal empInterLavado = null;
    String empNombreLavado = null;
    BigDecimal empInterVector = null;
    String empNombreVector = null;
    BigDecimal empInterClientes = null;
    String empNombreClientes = null;
    BigDecimal empInterCreditos = null;
    String empNombreCreditos = null;
    BigDecimal empProcedimiento = null;

    public FEmpresaResp() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpNumEmpresa(BigDecimal empNumEmpresa) {
        this.empNumEmpresa = empNumEmpresa;
    }

    public BigDecimal getEmpNumEmpresa() {
        return this.empNumEmpresa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNomEmpresa(String empNomEmpresa) {
        this.empNomEmpresa = empNomEmpresa;
    }

    public String getEmpNomEmpresa() {
        return this.empNomEmpresa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNomArea(String empNomArea) {
        this.empNomArea = empNomArea;
    }

    public String getEmpNomArea() {
        return this.empNomArea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public String getEmpDireccion() {
        return this.empDireccion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNomAutoriza(String empNomAutoriza) {
        this.empNomAutoriza = empNomAutoriza;
    }

    public String getEmpNomAutoriza() {
        return this.empNomAutoriza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNomFirma(String empNomFirma) {
        this.empNomFirma = empNomFirma;
    }

    public String getEmpNomFirma() {
        return this.empNomFirma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpIdioma(String empIdioma) {
        this.empIdioma = empIdioma;
    }

    public String getEmpIdioma() {
        return this.empIdioma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpEstilo(String empEstilo) {
        this.empEstilo = empEstilo;
    }

    public String getEmpEstilo() {
        return this.empEstilo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEmpFecCambio(String empFecCambio) {
        this.empFecCambio = empFecCambio;
    }

    public String getEmpFecCambio() {
        return this.empFecCambio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpLlaveEmpresa(String empLlaveEmpresa) {
        this.empLlaveEmpresa = empLlaveEmpresa;
    }

    public String getEmpLlaveEmpresa() {
        return this.empLlaveEmpresa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNomAutoriza2(String empNomAutoriza2) {
        this.empNomAutoriza2 = empNomAutoriza2;
    }

    public String getEmpNomAutoriza2() {
        return this.empNomAutoriza2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNomFirma2(String empNomFirma2) {
        this.empNomFirma2 = empNomFirma2;
    }

    public String getEmpNomFirma2() {
        return this.empNomFirma2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpLeyendaEdosfin(String empLeyendaEdosfin) {
        this.empLeyendaEdosfin = empLeyendaEdosfin;
    }

    public String getEmpLeyendaEdosfin() {
        return this.empLeyendaEdosfin;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpLeyendaEdores(String empLeyendaEdores) {
        this.empLeyendaEdores = empLeyendaEdores;
    }

    public String getEmpLeyendaEdores() {
        return this.empLeyendaEdores;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpConfirma(BigDecimal empConfirma) {
        this.empConfirma = empConfirma;
    }

    public BigDecimal getEmpConfirma() {
        return this.empConfirma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpInterValores(BigDecimal empInterValores) {
        this.empInterValores = empInterValores;
    }

    public BigDecimal getEmpInterValores() {
        return this.empInterValores;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNombreValores(String empNombreValores) {
        this.empNombreValores = empNombreValores;
    }

    public String getEmpNombreValores() {
        return this.empNombreValores;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpInterConta(BigDecimal empInterConta) {
        this.empInterConta = empInterConta;
    }

    public BigDecimal getEmpInterConta() {
        return this.empInterConta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNombreConta(String empNombreConta) {
        this.empNombreConta = empNombreConta;
    }

    public String getEmpNombreConta() {
        return this.empNombreConta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpInterLavado(BigDecimal empInterLavado) {
        this.empInterLavado = empInterLavado;
    }

    public BigDecimal getEmpInterLavado() {
        return this.empInterLavado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNombreLavado(String empNombreLavado) {
        this.empNombreLavado = empNombreLavado;
    }

    public String getEmpNombreLavado() {
        return this.empNombreLavado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpInterVector(BigDecimal empInterVector) {
        this.empInterVector = empInterVector;
    }

    public BigDecimal getEmpInterVector() {
        return this.empInterVector;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNombreVector(String empNombreVector) {
        this.empNombreVector = empNombreVector;
    }

    public String getEmpNombreVector() {
        return this.empNombreVector;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpInterClientes(BigDecimal empInterClientes) {
        this.empInterClientes = empInterClientes;
    }

    public BigDecimal getEmpInterClientes() {
        return this.empInterClientes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNombreClientes(String empNombreClientes) {
        this.empNombreClientes = empNombreClientes;
    }

    public String getEmpNombreClientes() {
        return this.empNombreClientes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpInterCreditos(BigDecimal empInterCreditos) {
        this.empInterCreditos = empInterCreditos;
    }

    public BigDecimal getEmpInterCreditos() {
        return this.empInterCreditos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmpNombreCreditos(String empNombreCreditos) {
        this.empNombreCreditos = empNombreCreditos;
    }

    public String getEmpNombreCreditos() {
        return this.empNombreCreditos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmpProcedimiento(BigDecimal empProcedimiento) {
        this.empProcedimiento = empProcedimiento;
    }

    public BigDecimal getEmpProcedimiento() {
        return this.empProcedimiento;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMPRESA_RESP ";

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
        String sql = "SELECT * FROM F_EMPRESA_RESP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmpNumEmpresa() != null && this.getEmpNumEmpresa().longValue() == -999) {
            conditions += " AND EMP_NUM_EMPRESA IS NULL";
        } else if (this.getEmpNumEmpresa() != null) {
            conditions += " AND EMP_NUM_EMPRESA = ?";
            values.add(this.getEmpNumEmpresa());
        }

        if (this.getEmpNomEmpresa() != null && "null".equals(this.getEmpNomEmpresa())) {
            conditions += " AND EMP_NOM_EMPRESA IS NULL";
        } else if (this.getEmpNomEmpresa() != null) {
            conditions += " AND EMP_NOM_EMPRESA = ?";
            values.add(this.getEmpNomEmpresa());
        }

        if (this.getEmpNomArea() != null && "null".equals(this.getEmpNomArea())) {
            conditions += " AND EMP_NOM_AREA IS NULL";
        } else if (this.getEmpNomArea() != null) {
            conditions += " AND EMP_NOM_AREA = ?";
            values.add(this.getEmpNomArea());
        }

        if (this.getEmpDireccion() != null && "null".equals(this.getEmpDireccion())) {
            conditions += " AND EMP_DIRECCION IS NULL";
        } else if (this.getEmpDireccion() != null) {
            conditions += " AND EMP_DIRECCION = ?";
            values.add(this.getEmpDireccion());
        }

        if (this.getEmpNomAutoriza() != null && "null".equals(this.getEmpNomAutoriza())) {
            conditions += " AND EMP_NOM_AUTORIZA IS NULL";
        } else if (this.getEmpNomAutoriza() != null) {
            conditions += " AND EMP_NOM_AUTORIZA = ?";
            values.add(this.getEmpNomAutoriza());
        }

        if (this.getEmpNomFirma() != null && "null".equals(this.getEmpNomFirma())) {
            conditions += " AND EMP_NOM_FIRMA IS NULL";
        } else if (this.getEmpNomFirma() != null) {
            conditions += " AND EMP_NOM_FIRMA = ?";
            values.add(this.getEmpNomFirma());
        }

        if (this.getEmpIdioma() != null && "null".equals(this.getEmpIdioma())) {
            conditions += " AND EMP_IDIOMA IS NULL";
        } else if (this.getEmpIdioma() != null) {
            conditions += " AND EMP_IDIOMA = ?";
            values.add(this.getEmpIdioma());
        }

        if (this.getEmpEstilo() != null && "null".equals(this.getEmpEstilo())) {
            conditions += " AND EMP_ESTILO IS NULL";
        } else if (this.getEmpEstilo() != null) {
            conditions += " AND EMP_ESTILO = ?";
            values.add(this.getEmpEstilo());
        }

        if (this.getEmpFecCambio() != null && "null".equals(this.getEmpFecCambio())) {
            conditions += " AND EMP_FEC_CAMBIO IS NULL";
        } else if (this.getEmpFecCambio() != null) {
            conditions += " AND EMP_FEC_CAMBIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEmpFecCambio());
        }

        if (this.getEmpLlaveEmpresa() != null && "null".equals(this.getEmpLlaveEmpresa())) {
            conditions += " AND EMP_LLAVE_EMPRESA IS NULL";
        } else if (this.getEmpLlaveEmpresa() != null) {
            conditions += " AND EMP_LLAVE_EMPRESA = ?";
            values.add(this.getEmpLlaveEmpresa());
        }

        if (this.getEmpNomAutoriza2() != null && "null".equals(this.getEmpNomAutoriza2())) {
            conditions += " AND EMP_NOM_AUTORIZA2 IS NULL";
        } else if (this.getEmpNomAutoriza2() != null) {
            conditions += " AND EMP_NOM_AUTORIZA2 = ?";
            values.add(this.getEmpNomAutoriza2());
        }

        if (this.getEmpNomFirma2() != null && "null".equals(this.getEmpNomFirma2())) {
            conditions += " AND EMP_NOM_FIRMA2 IS NULL";
        } else if (this.getEmpNomFirma2() != null) {
            conditions += " AND EMP_NOM_FIRMA2 = ?";
            values.add(this.getEmpNomFirma2());
        }

        if (this.getEmpLeyendaEdosfin() != null && "null".equals(this.getEmpLeyendaEdosfin())) {
            conditions += " AND EMP_LEYENDA_EDOSFIN IS NULL";
        } else if (this.getEmpLeyendaEdosfin() != null) {
            conditions += " AND EMP_LEYENDA_EDOSFIN = ?";
            values.add(this.getEmpLeyendaEdosfin());
        }

        if (this.getEmpLeyendaEdores() != null && "null".equals(this.getEmpLeyendaEdores())) {
            conditions += " AND EMP_LEYENDA_EDORES IS NULL";
        } else if (this.getEmpLeyendaEdores() != null) {
            conditions += " AND EMP_LEYENDA_EDORES = ?";
            values.add(this.getEmpLeyendaEdores());
        }

        if (this.getEmpConfirma() != null && this.getEmpConfirma().longValue() == -999) {
            conditions += " AND EMP_CONFIRMA IS NULL";
        } else if (this.getEmpConfirma() != null) {
            conditions += " AND EMP_CONFIRMA = ?";
            values.add(this.getEmpConfirma());
        }

        if (this.getEmpInterValores() != null && this.getEmpInterValores().longValue() == -999) {
            conditions += " AND EMP_INTER_VALORES IS NULL";
        } else if (this.getEmpInterValores() != null) {
            conditions += " AND EMP_INTER_VALORES = ?";
            values.add(this.getEmpInterValores());
        }

        if (this.getEmpNombreValores() != null && "null".equals(this.getEmpNombreValores())) {
            conditions += " AND EMP_NOMBRE_VALORES IS NULL";
        } else if (this.getEmpNombreValores() != null) {
            conditions += " AND EMP_NOMBRE_VALORES = ?";
            values.add(this.getEmpNombreValores());
        }

        if (this.getEmpInterConta() != null && this.getEmpInterConta().longValue() == -999) {
            conditions += " AND EMP_INTER_CONTA IS NULL";
        } else if (this.getEmpInterConta() != null) {
            conditions += " AND EMP_INTER_CONTA = ?";
            values.add(this.getEmpInterConta());
        }

        if (this.getEmpNombreConta() != null && "null".equals(this.getEmpNombreConta())) {
            conditions += " AND EMP_NOMBRE_CONTA IS NULL";
        } else if (this.getEmpNombreConta() != null) {
            conditions += " AND EMP_NOMBRE_CONTA = ?";
            values.add(this.getEmpNombreConta());
        }

        if (this.getEmpInterLavado() != null && this.getEmpInterLavado().longValue() == -999) {
            conditions += " AND EMP_INTER_LAVADO IS NULL";
        } else if (this.getEmpInterLavado() != null) {
            conditions += " AND EMP_INTER_LAVADO = ?";
            values.add(this.getEmpInterLavado());
        }

        if (this.getEmpNombreLavado() != null && "null".equals(this.getEmpNombreLavado())) {
            conditions += " AND EMP_NOMBRE_LAVADO IS NULL";
        } else if (this.getEmpNombreLavado() != null) {
            conditions += " AND EMP_NOMBRE_LAVADO = ?";
            values.add(this.getEmpNombreLavado());
        }

        if (this.getEmpInterVector() != null && this.getEmpInterVector().longValue() == -999) {
            conditions += " AND EMP_INTER_VECTOR IS NULL";
        } else if (this.getEmpInterVector() != null) {
            conditions += " AND EMP_INTER_VECTOR = ?";
            values.add(this.getEmpInterVector());
        }

        if (this.getEmpNombreVector() != null && "null".equals(this.getEmpNombreVector())) {
            conditions += " AND EMP_NOMBRE_VECTOR IS NULL";
        } else if (this.getEmpNombreVector() != null) {
            conditions += " AND EMP_NOMBRE_VECTOR = ?";
            values.add(this.getEmpNombreVector());
        }

        if (this.getEmpInterClientes() != null && this.getEmpInterClientes().longValue() == -999) {
            conditions += " AND EMP_INTER_CLIENTES IS NULL";
        } else if (this.getEmpInterClientes() != null) {
            conditions += " AND EMP_INTER_CLIENTES = ?";
            values.add(this.getEmpInterClientes());
        }

        if (this.getEmpNombreClientes() != null && "null".equals(this.getEmpNombreClientes())) {
            conditions += " AND EMP_NOMBRE_CLIENTES IS NULL";
        } else if (this.getEmpNombreClientes() != null) {
            conditions += " AND EMP_NOMBRE_CLIENTES = ?";
            values.add(this.getEmpNombreClientes());
        }

        if (this.getEmpInterCreditos() != null && this.getEmpInterCreditos().longValue() == -999) {
            conditions += " AND EMP_INTER_CREDITOS IS NULL";
        } else if (this.getEmpInterCreditos() != null) {
            conditions += " AND EMP_INTER_CREDITOS = ?";
            values.add(this.getEmpInterCreditos());
        }

        if (this.getEmpNombreCreditos() != null && "null".equals(this.getEmpNombreCreditos())) {
            conditions += " AND EMP_NOMBRE_CREDITOS IS NULL";
        } else if (this.getEmpNombreCreditos() != null) {
            conditions += " AND EMP_NOMBRE_CREDITOS = ?";
            values.add(this.getEmpNombreCreditos());
        }

        if (this.getEmpProcedimiento() != null && this.getEmpProcedimiento().longValue() == -999) {
            conditions += " AND EMP_PROCEDIMIENTO IS NULL";
        } else if (this.getEmpProcedimiento() != null) {
            conditions += " AND EMP_PROCEDIMIENTO = ?";
            values.add(this.getEmpProcedimiento());
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
        String sql = "UPDATE F_EMPRESA_RESP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " EMP_NUM_EMPRESA = ?, ";
        values.add(this.getEmpNumEmpresa());
        fields += " EMP_NOM_EMPRESA = ?, ";
        values.add(this.getEmpNomEmpresa());
        fields += " EMP_NOM_AREA = ?, ";
        values.add(this.getEmpNomArea());
        fields += " EMP_DIRECCION = ?, ";
        values.add(this.getEmpDireccion());
        fields += " EMP_NOM_AUTORIZA = ?, ";
        values.add(this.getEmpNomAutoriza());
        fields += " EMP_NOM_FIRMA = ?, ";
        values.add(this.getEmpNomFirma());
        fields += " EMP_IDIOMA = ?, ";
        values.add(this.getEmpIdioma());
        fields += " EMP_ESTILO = ?, ";
        values.add(this.getEmpEstilo());
        fields += " EMP_FEC_CAMBIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEmpFecCambio());
        fields += " EMP_LLAVE_EMPRESA = ?, ";
        values.add(this.getEmpLlaveEmpresa());
        fields += " EMP_NOM_AUTORIZA2 = ?, ";
        values.add(this.getEmpNomAutoriza2());
        fields += " EMP_NOM_FIRMA2 = ?, ";
        values.add(this.getEmpNomFirma2());
        fields += " EMP_LEYENDA_EDOSFIN = ?, ";
        values.add(this.getEmpLeyendaEdosfin());
        fields += " EMP_LEYENDA_EDORES = ?, ";
        values.add(this.getEmpLeyendaEdores());
        fields += " EMP_CONFIRMA = ?, ";
        values.add(this.getEmpConfirma());
        fields += " EMP_INTER_VALORES = ?, ";
        values.add(this.getEmpInterValores());
        fields += " EMP_NOMBRE_VALORES = ?, ";
        values.add(this.getEmpNombreValores());
        fields += " EMP_INTER_CONTA = ?, ";
        values.add(this.getEmpInterConta());
        fields += " EMP_NOMBRE_CONTA = ?, ";
        values.add(this.getEmpNombreConta());
        fields += " EMP_INTER_LAVADO = ?, ";
        values.add(this.getEmpInterLavado());
        fields += " EMP_NOMBRE_LAVADO = ?, ";
        values.add(this.getEmpNombreLavado());
        fields += " EMP_INTER_VECTOR = ?, ";
        values.add(this.getEmpInterVector());
        fields += " EMP_NOMBRE_VECTOR = ?, ";
        values.add(this.getEmpNombreVector());
        fields += " EMP_INTER_CLIENTES = ?, ";
        values.add(this.getEmpInterClientes());
        fields += " EMP_NOMBRE_CLIENTES = ?, ";
        values.add(this.getEmpNombreClientes());
        fields += " EMP_INTER_CREDITOS = ?, ";
        values.add(this.getEmpInterCreditos());
        fields += " EMP_NOMBRE_CREDITOS = ?, ";
        values.add(this.getEmpNombreCreditos());
        fields += " EMP_PROCEDIMIENTO = ?, ";
        values.add(this.getEmpProcedimiento());
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
        String sql = "INSERT INTO F_EMPRESA_RESP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EMP_NUM_EMPRESA";
        fieldValues += ", ?";
        values.add(this.getEmpNumEmpresa());

        fields += ", EMP_NOM_EMPRESA";
        fieldValues += ", ?";
        values.add(this.getEmpNomEmpresa());

        fields += ", EMP_NOM_AREA";
        fieldValues += ", ?";
        values.add(this.getEmpNomArea());

        fields += ", EMP_DIRECCION";
        fieldValues += ", ?";
        values.add(this.getEmpDireccion());

        fields += ", EMP_NOM_AUTORIZA";
        fieldValues += ", ?";
        values.add(this.getEmpNomAutoriza());

        fields += ", EMP_NOM_FIRMA";
        fieldValues += ", ?";
        values.add(this.getEmpNomFirma());

        fields += ", EMP_IDIOMA";
        fieldValues += ", ?";
        values.add(this.getEmpIdioma());

        fields += ", EMP_ESTILO";
        fieldValues += ", ?";
        values.add(this.getEmpEstilo());

        fields += ", EMP_FEC_CAMBIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEmpFecCambio());

        fields += ", EMP_LLAVE_EMPRESA";
        fieldValues += ", ?";
        values.add(this.getEmpLlaveEmpresa());

        fields += ", EMP_NOM_AUTORIZA2";
        fieldValues += ", ?";
        values.add(this.getEmpNomAutoriza2());

        fields += ", EMP_NOM_FIRMA2";
        fieldValues += ", ?";
        values.add(this.getEmpNomFirma2());

        fields += ", EMP_LEYENDA_EDOSFIN";
        fieldValues += ", ?";
        values.add(this.getEmpLeyendaEdosfin());

        fields += ", EMP_LEYENDA_EDORES";
        fieldValues += ", ?";
        values.add(this.getEmpLeyendaEdores());

        fields += ", EMP_CONFIRMA";
        fieldValues += ", ?";
        values.add(this.getEmpConfirma());

        fields += ", EMP_INTER_VALORES";
        fieldValues += ", ?";
        values.add(this.getEmpInterValores());

        fields += ", EMP_NOMBRE_VALORES";
        fieldValues += ", ?";
        values.add(this.getEmpNombreValores());

        fields += ", EMP_INTER_CONTA";
        fieldValues += ", ?";
        values.add(this.getEmpInterConta());

        fields += ", EMP_NOMBRE_CONTA";
        fieldValues += ", ?";
        values.add(this.getEmpNombreConta());

        fields += ", EMP_INTER_LAVADO";
        fieldValues += ", ?";
        values.add(this.getEmpInterLavado());

        fields += ", EMP_NOMBRE_LAVADO";
        fieldValues += ", ?";
        values.add(this.getEmpNombreLavado());

        fields += ", EMP_INTER_VECTOR";
        fieldValues += ", ?";
        values.add(this.getEmpInterVector());

        fields += ", EMP_NOMBRE_VECTOR";
        fieldValues += ", ?";
        values.add(this.getEmpNombreVector());

        fields += ", EMP_INTER_CLIENTES";
        fieldValues += ", ?";
        values.add(this.getEmpInterClientes());

        fields += ", EMP_NOMBRE_CLIENTES";
        fieldValues += ", ?";
        values.add(this.getEmpNombreClientes());

        fields += ", EMP_INTER_CREDITOS";
        fieldValues += ", ?";
        values.add(this.getEmpInterCreditos());

        fields += ", EMP_NOMBRE_CREDITOS";
        fieldValues += ", ?";
        values.add(this.getEmpNombreCreditos());

        fields += ", EMP_PROCEDIMIENTO";
        fieldValues += ", ?";
        values.add(this.getEmpProcedimiento());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMPRESA_RESP WHERE ";

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
        FEmpresaResp instance = (FEmpresaResp) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEmpNumEmpresa().equals(instance.getEmpNumEmpresa()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNomEmpresa().equals(instance.getEmpNomEmpresa()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNomArea().equals(instance.getEmpNomArea()))
            equalObjects = false;
        if (equalObjects && !this.getEmpDireccion().equals(instance.getEmpDireccion()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNomAutoriza().equals(instance.getEmpNomAutoriza()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNomFirma().equals(instance.getEmpNomFirma()))
            equalObjects = false;
        if (equalObjects && !this.getEmpIdioma().equals(instance.getEmpIdioma()))
            equalObjects = false;
        if (equalObjects && !this.getEmpEstilo().equals(instance.getEmpEstilo()))
            equalObjects = false;
        if (equalObjects && !this.getEmpFecCambio().equals(instance.getEmpFecCambio()))
            equalObjects = false;
        if (equalObjects && !this.getEmpLlaveEmpresa().equals(instance.getEmpLlaveEmpresa()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNomAutoriza2().equals(instance.getEmpNomAutoriza2()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNomFirma2().equals(instance.getEmpNomFirma2()))
            equalObjects = false;
        if (equalObjects && !this.getEmpLeyendaEdosfin().equals(instance.getEmpLeyendaEdosfin()))
            equalObjects = false;
        if (equalObjects && !this.getEmpLeyendaEdores().equals(instance.getEmpLeyendaEdores()))
            equalObjects = false;
        if (equalObjects && !this.getEmpConfirma().equals(instance.getEmpConfirma()))
            equalObjects = false;
        if (equalObjects && !this.getEmpInterValores().equals(instance.getEmpInterValores()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNombreValores().equals(instance.getEmpNombreValores()))
            equalObjects = false;
        if (equalObjects && !this.getEmpInterConta().equals(instance.getEmpInterConta()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNombreConta().equals(instance.getEmpNombreConta()))
            equalObjects = false;
        if (equalObjects && !this.getEmpInterLavado().equals(instance.getEmpInterLavado()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNombreLavado().equals(instance.getEmpNombreLavado()))
            equalObjects = false;
        if (equalObjects && !this.getEmpInterVector().equals(instance.getEmpInterVector()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNombreVector().equals(instance.getEmpNombreVector()))
            equalObjects = false;
        if (equalObjects && !this.getEmpInterClientes().equals(instance.getEmpInterClientes()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNombreClientes().equals(instance.getEmpNombreClientes()))
            equalObjects = false;
        if (equalObjects && !this.getEmpInterCreditos().equals(instance.getEmpInterCreditos()))
            equalObjects = false;
        if (equalObjects && !this.getEmpNombreCreditos().equals(instance.getEmpNombreCreditos()))
            equalObjects = false;
        if (equalObjects && !this.getEmpProcedimiento().equals(instance.getEmpProcedimiento()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmpresaResp result = new FEmpresaResp();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEmpNumEmpresa((BigDecimal) objectData.getData("EMP_NUM_EMPRESA"));
        result.setEmpNomEmpresa((String) objectData.getData("EMP_NOM_EMPRESA"));
        result.setEmpNomArea((String) objectData.getData("EMP_NOM_AREA"));
        result.setEmpDireccion((String) objectData.getData("EMP_DIRECCION"));
        result.setEmpNomAutoriza((String) objectData.getData("EMP_NOM_AUTORIZA"));
        result.setEmpNomFirma((String) objectData.getData("EMP_NOM_FIRMA"));
        result.setEmpIdioma((String) objectData.getData("EMP_IDIOMA"));
        result.setEmpEstilo((String) objectData.getData("EMP_ESTILO"));
        result.setEmpFecCambio((String) objectData.getData("EMP_FEC_CAMBIO"));
        result.setEmpLlaveEmpresa((String) objectData.getData("EMP_LLAVE_EMPRESA"));
        result.setEmpNomAutoriza2((String) objectData.getData("EMP_NOM_AUTORIZA2"));
        result.setEmpNomFirma2((String) objectData.getData("EMP_NOM_FIRMA2"));
        result.setEmpLeyendaEdosfin((String) objectData.getData("EMP_LEYENDA_EDOSFIN"));
        result.setEmpLeyendaEdores((String) objectData.getData("EMP_LEYENDA_EDORES"));
        result.setEmpConfirma((BigDecimal) objectData.getData("EMP_CONFIRMA"));
        result.setEmpInterValores((BigDecimal) objectData.getData("EMP_INTER_VALORES"));
        result.setEmpNombreValores((String) objectData.getData("EMP_NOMBRE_VALORES"));
        result.setEmpInterConta((BigDecimal) objectData.getData("EMP_INTER_CONTA"));
        result.setEmpNombreConta((String) objectData.getData("EMP_NOMBRE_CONTA"));
        result.setEmpInterLavado((BigDecimal) objectData.getData("EMP_INTER_LAVADO"));
        result.setEmpNombreLavado((String) objectData.getData("EMP_NOMBRE_LAVADO"));
        result.setEmpInterVector((BigDecimal) objectData.getData("EMP_INTER_VECTOR"));
        result.setEmpNombreVector((String) objectData.getData("EMP_NOMBRE_VECTOR"));
        result.setEmpInterClientes((BigDecimal) objectData.getData("EMP_INTER_CLIENTES"));
        result.setEmpNombreClientes((String) objectData.getData("EMP_NOMBRE_CLIENTES"));
        result.setEmpInterCreditos((BigDecimal) objectData.getData("EMP_INTER_CREDITOS"));
        result.setEmpNombreCreditos((String) objectData.getData("EMP_NOMBRE_CREDITOS"));
        result.setEmpProcedimiento((BigDecimal) objectData.getData("EMP_PROCEDIMIENTO"));

        return result;

    }

}
