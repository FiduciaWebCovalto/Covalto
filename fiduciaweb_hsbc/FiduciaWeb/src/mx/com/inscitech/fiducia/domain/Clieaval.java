package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CLIEAVAL_PK", columns = { "CLI_ID_CLIENTE" }, sequences = { "MAX" })
public class Clieaval extends DomainObject {

    BigDecimal cliIdCliente = null;
    String cliNomCliente = null;
    String cliCurp = null;
    String cliTelefono = null;
    String cliCalle = null;
    String cliNumero = null;
    String cliColonia = null;
    String cliMuniDelega = null;
    String cliEstado = null;
    String cliPais = null;
    String cliCodigoPostal = null;
    String cliTipoCliente = null;
    String cliObservaciones = null;
    BigDecimal cliAnoAltaReg = null;
    BigDecimal cliMesAltaReg = null;
    BigDecimal cliDiaAltaReg = null;
    BigDecimal cliAnoUltMod = null;
    BigDecimal cliMesUltMod = null;
    BigDecimal cliDiaUltMod = null;
    String cliCveStCliente = null;

    public Clieaval() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCliIdCliente(BigDecimal cliIdCliente) {
        this.cliIdCliente = cliIdCliente;
    }

    public BigDecimal getCliIdCliente() {
        return this.cliIdCliente;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNomCliente(String cliNomCliente) {
        this.cliNomCliente = cliNomCliente;
    }

    public String getCliNomCliente() {
        return this.cliNomCliente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliCurp(String cliCurp) {
        this.cliCurp = cliCurp;
    }

    public String getCliCurp() {
        return this.cliCurp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public String getCliTelefono() {
        return this.cliTelefono;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliCalle(String cliCalle) {
        this.cliCalle = cliCalle;
    }

    public String getCliCalle() {
        return this.cliCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliNumero(String cliNumero) {
        this.cliNumero = cliNumero;
    }

    public String getCliNumero() {
        return this.cliNumero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliColonia(String cliColonia) {
        this.cliColonia = cliColonia;
    }

    public String getCliColonia() {
        return this.cliColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliMuniDelega(String cliMuniDelega) {
        this.cliMuniDelega = cliMuniDelega;
    }

    public String getCliMuniDelega() {
        return this.cliMuniDelega;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliEstado(String cliEstado) {
        this.cliEstado = cliEstado;
    }

    public String getCliEstado() {
        return this.cliEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliPais(String cliPais) {
        this.cliPais = cliPais;
    }

    public String getCliPais() {
        return this.cliPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliCodigoPostal(String cliCodigoPostal) {
        this.cliCodigoPostal = cliCodigoPostal;
    }

    public String getCliCodigoPostal() {
        return this.cliCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliTipoCliente(String cliTipoCliente) {
        this.cliTipoCliente = cliTipoCliente;
    }

    public String getCliTipoCliente() {
        return this.cliTipoCliente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliObservaciones(String cliObservaciones) {
        this.cliObservaciones = cliObservaciones;
    }

    public String getCliObservaciones() {
        return this.cliObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCliAnoAltaReg(BigDecimal cliAnoAltaReg) {
        this.cliAnoAltaReg = cliAnoAltaReg;
    }

    public BigDecimal getCliAnoAltaReg() {
        return this.cliAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCliMesAltaReg(BigDecimal cliMesAltaReg) {
        this.cliMesAltaReg = cliMesAltaReg;
    }

    public BigDecimal getCliMesAltaReg() {
        return this.cliMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCliDiaAltaReg(BigDecimal cliDiaAltaReg) {
        this.cliDiaAltaReg = cliDiaAltaReg;
    }

    public BigDecimal getCliDiaAltaReg() {
        return this.cliDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCliAnoUltMod(BigDecimal cliAnoUltMod) {
        this.cliAnoUltMod = cliAnoUltMod;
    }

    public BigDecimal getCliAnoUltMod() {
        return this.cliAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCliMesUltMod(BigDecimal cliMesUltMod) {
        this.cliMesUltMod = cliMesUltMod;
    }

    public BigDecimal getCliMesUltMod() {
        return this.cliMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCliDiaUltMod(BigDecimal cliDiaUltMod) {
        this.cliDiaUltMod = cliDiaUltMod;
    }

    public BigDecimal getCliDiaUltMod() {
        return this.cliDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCliCveStCliente(String cliCveStCliente) {
        this.cliCveStCliente = cliCveStCliente;
    }

    public String getCliCveStCliente() {
        return this.cliCveStCliente;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CLIEAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCliIdCliente() != null && this.getCliIdCliente().longValue() == -999) {
            conditions += " AND CLI_ID_CLIENTE IS NULL";
        } else if (this.getCliIdCliente() != null) {
            conditions += " AND CLI_ID_CLIENTE = ?";
            values.add(this.getCliIdCliente());
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
        String sql = "SELECT * FROM CLIEAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCliIdCliente() != null && this.getCliIdCliente().longValue() == -999) {
            conditions += " AND CLI_ID_CLIENTE IS NULL";
        } else if (this.getCliIdCliente() != null) {
            conditions += " AND CLI_ID_CLIENTE = ?";
            values.add(this.getCliIdCliente());
        }

        if (this.getCliNomCliente() != null && "null".equals(this.getCliNomCliente())) {
            conditions += " AND CLI_NOM_CLIENTE IS NULL";
        } else if (this.getCliNomCliente() != null) {
            conditions += " AND CLI_NOM_CLIENTE = ?";
            values.add(this.getCliNomCliente());
        }

        if (this.getCliCurp() != null && "null".equals(this.getCliCurp())) {
            conditions += " AND CLI_CURP IS NULL";
        } else if (this.getCliCurp() != null) {
            conditions += " AND CLI_CURP = ?";
            values.add(this.getCliCurp());
        }

        if (this.getCliTelefono() != null && "null".equals(this.getCliTelefono())) {
            conditions += " AND CLI_TELEFONO IS NULL";
        } else if (this.getCliTelefono() != null) {
            conditions += " AND CLI_TELEFONO = ?";
            values.add(this.getCliTelefono());
        }

        if (this.getCliCalle() != null && "null".equals(this.getCliCalle())) {
            conditions += " AND CLI_CALLE IS NULL";
        } else if (this.getCliCalle() != null) {
            conditions += " AND CLI_CALLE = ?";
            values.add(this.getCliCalle());
        }

        if (this.getCliNumero() != null && "null".equals(this.getCliNumero())) {
            conditions += " AND CLI_NUMERO IS NULL";
        } else if (this.getCliNumero() != null) {
            conditions += " AND CLI_NUMERO = ?";
            values.add(this.getCliNumero());
        }

        if (this.getCliColonia() != null && "null".equals(this.getCliColonia())) {
            conditions += " AND CLI_COLONIA IS NULL";
        } else if (this.getCliColonia() != null) {
            conditions += " AND CLI_COLONIA = ?";
            values.add(this.getCliColonia());
        }

        if (this.getCliMuniDelega() != null && "null".equals(this.getCliMuniDelega())) {
            conditions += " AND CLI_MUNI_DELEGA IS NULL";
        } else if (this.getCliMuniDelega() != null) {
            conditions += " AND CLI_MUNI_DELEGA = ?";
            values.add(this.getCliMuniDelega());
        }

        if (this.getCliEstado() != null && "null".equals(this.getCliEstado())) {
            conditions += " AND CLI_ESTADO IS NULL";
        } else if (this.getCliEstado() != null) {
            conditions += " AND CLI_ESTADO = ?";
            values.add(this.getCliEstado());
        }

        if (this.getCliPais() != null && "null".equals(this.getCliPais())) {
            conditions += " AND CLI_PAIS IS NULL";
        } else if (this.getCliPais() != null) {
            conditions += " AND CLI_PAIS = ?";
            values.add(this.getCliPais());
        }

        if (this.getCliCodigoPostal() != null && "null".equals(this.getCliCodigoPostal())) {
            conditions += " AND CLI_CODIGO_POSTAL IS NULL";
        } else if (this.getCliCodigoPostal() != null) {
            conditions += " AND CLI_CODIGO_POSTAL = ?";
            values.add(this.getCliCodigoPostal());
        }

        if (this.getCliTipoCliente() != null && "null".equals(this.getCliTipoCliente())) {
            conditions += " AND CLI_TIPO_CLIENTE IS NULL";
        } else if (this.getCliTipoCliente() != null) {
            conditions += " AND CLI_TIPO_CLIENTE = ?";
            values.add(this.getCliTipoCliente());
        }

        if (this.getCliObservaciones() != null && "null".equals(this.getCliObservaciones())) {
            conditions += " AND CLI_OBSERVACIONES IS NULL";
        } else if (this.getCliObservaciones() != null) {
            conditions += " AND CLI_OBSERVACIONES = ?";
            values.add(this.getCliObservaciones());
        }

        if (this.getCliAnoAltaReg() != null && this.getCliAnoAltaReg().longValue() == -999) {
            conditions += " AND CLI_ANO_ALTA_REG IS NULL";
        } else if (this.getCliAnoAltaReg() != null) {
            conditions += " AND CLI_ANO_ALTA_REG = ?";
            values.add(this.getCliAnoAltaReg());
        }

        if (this.getCliMesAltaReg() != null && this.getCliMesAltaReg().longValue() == -999) {
            conditions += " AND CLI_MES_ALTA_REG IS NULL";
        } else if (this.getCliMesAltaReg() != null) {
            conditions += " AND CLI_MES_ALTA_REG = ?";
            values.add(this.getCliMesAltaReg());
        }

        if (this.getCliDiaAltaReg() != null && this.getCliDiaAltaReg().longValue() == -999) {
            conditions += " AND CLI_DIA_ALTA_REG IS NULL";
        } else if (this.getCliDiaAltaReg() != null) {
            conditions += " AND CLI_DIA_ALTA_REG = ?";
            values.add(this.getCliDiaAltaReg());
        }

        if (this.getCliAnoUltMod() != null && this.getCliAnoUltMod().longValue() == -999) {
            conditions += " AND CLI_ANO_ULT_MOD IS NULL";
        } else if (this.getCliAnoUltMod() != null) {
            conditions += " AND CLI_ANO_ULT_MOD = ?";
            values.add(this.getCliAnoUltMod());
        }

        if (this.getCliMesUltMod() != null && this.getCliMesUltMod().longValue() == -999) {
            conditions += " AND CLI_MES_ULT_MOD IS NULL";
        } else if (this.getCliMesUltMod() != null) {
            conditions += " AND CLI_MES_ULT_MOD = ?";
            values.add(this.getCliMesUltMod());
        }

        if (this.getCliDiaUltMod() != null && this.getCliDiaUltMod().longValue() == -999) {
            conditions += " AND CLI_DIA_ULT_MOD IS NULL";
        } else if (this.getCliDiaUltMod() != null) {
            conditions += " AND CLI_DIA_ULT_MOD = ?";
            values.add(this.getCliDiaUltMod());
        }

        if (this.getCliCveStCliente() != null && "null".equals(this.getCliCveStCliente())) {
            conditions += " AND CLI_CVE_ST_CLIENTE IS NULL";
        } else if (this.getCliCveStCliente() != null) {
            conditions += " AND CLI_CVE_ST_CLIENTE = ?";
            values.add(this.getCliCveStCliente());
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
        String sql = "UPDATE CLIEAVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CLI_ID_CLIENTE = ?";
        pkValues.add(this.getCliIdCliente());
        fields += " CLI_NOM_CLIENTE = ?, ";
        values.add(this.getCliNomCliente());
        fields += " CLI_CURP = ?, ";
        values.add(this.getCliCurp());
        fields += " CLI_TELEFONO = ?, ";
        values.add(this.getCliTelefono());
        fields += " CLI_CALLE = ?, ";
        values.add(this.getCliCalle());
        fields += " CLI_NUMERO = ?, ";
        values.add(this.getCliNumero());
        fields += " CLI_COLONIA = ?, ";
        values.add(this.getCliColonia());
        fields += " CLI_MUNI_DELEGA = ?, ";
        values.add(this.getCliMuniDelega());
        fields += " CLI_ESTADO = ?, ";
        values.add(this.getCliEstado());
        fields += " CLI_PAIS = ?, ";
        values.add(this.getCliPais());
        fields += " CLI_CODIGO_POSTAL = ?, ";
        values.add(this.getCliCodigoPostal());
        fields += " CLI_TIPO_CLIENTE = ?, ";
        values.add(this.getCliTipoCliente());
        fields += " CLI_OBSERVACIONES = ?, ";
        values.add(this.getCliObservaciones());
        fields += " CLI_ANO_ALTA_REG = ?, ";
        values.add(this.getCliAnoAltaReg());
        fields += " CLI_MES_ALTA_REG = ?, ";
        values.add(this.getCliMesAltaReg());
        fields += " CLI_DIA_ALTA_REG = ?, ";
        values.add(this.getCliDiaAltaReg());
        fields += " CLI_ANO_ULT_MOD = ?, ";
        values.add(this.getCliAnoUltMod());
        fields += " CLI_MES_ULT_MOD = ?, ";
        values.add(this.getCliMesUltMod());
        fields += " CLI_DIA_ULT_MOD = ?, ";
        values.add(this.getCliDiaUltMod());
        fields += " CLI_CVE_ST_CLIENTE = ?, ";
        values.add(this.getCliCveStCliente());
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
        String sql = "INSERT INTO CLIEAVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CLI_ID_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCliIdCliente());

        fields += ", CLI_NOM_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCliNomCliente());

        fields += ", CLI_CURP";
        fieldValues += ", ?";
        values.add(this.getCliCurp());

        fields += ", CLI_TELEFONO";
        fieldValues += ", ?";
        values.add(this.getCliTelefono());

        fields += ", CLI_CALLE";
        fieldValues += ", ?";
        values.add(this.getCliCalle());

        fields += ", CLI_NUMERO";
        fieldValues += ", ?";
        values.add(this.getCliNumero());

        fields += ", CLI_COLONIA";
        fieldValues += ", ?";
        values.add(this.getCliColonia());

        fields += ", CLI_MUNI_DELEGA";
        fieldValues += ", ?";
        values.add(this.getCliMuniDelega());

        fields += ", CLI_ESTADO";
        fieldValues += ", ?";
        values.add(this.getCliEstado());

        fields += ", CLI_PAIS";
        fieldValues += ", ?";
        values.add(this.getCliPais());

        fields += ", CLI_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getCliCodigoPostal());

        fields += ", CLI_TIPO_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCliTipoCliente());

        fields += ", CLI_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getCliObservaciones());

        fields += ", CLI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCliAnoAltaReg());

        fields += ", CLI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCliMesAltaReg());

        fields += ", CLI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCliDiaAltaReg());

        fields += ", CLI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCliAnoUltMod());

        fields += ", CLI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCliMesUltMod());

        fields += ", CLI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCliDiaUltMod());

        fields += ", CLI_CVE_ST_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCliCveStCliente());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CLIEAVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CLI_ID_CLIENTE = ?";
        values.add(this.getCliIdCliente());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Clieaval instance = (Clieaval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCliIdCliente().equals(instance.getCliIdCliente()))
            equalObjects = false;
        if (equalObjects && !this.getCliNomCliente().equals(instance.getCliNomCliente()))
            equalObjects = false;
        if (equalObjects && !this.getCliCurp().equals(instance.getCliCurp()))
            equalObjects = false;
        if (equalObjects && !this.getCliTelefono().equals(instance.getCliTelefono()))
            equalObjects = false;
        if (equalObjects && !this.getCliCalle().equals(instance.getCliCalle()))
            equalObjects = false;
        if (equalObjects && !this.getCliNumero().equals(instance.getCliNumero()))
            equalObjects = false;
        if (equalObjects && !this.getCliColonia().equals(instance.getCliColonia()))
            equalObjects = false;
        if (equalObjects && !this.getCliMuniDelega().equals(instance.getCliMuniDelega()))
            equalObjects = false;
        if (equalObjects && !this.getCliEstado().equals(instance.getCliEstado()))
            equalObjects = false;
        if (equalObjects && !this.getCliPais().equals(instance.getCliPais()))
            equalObjects = false;
        if (equalObjects && !this.getCliCodigoPostal().equals(instance.getCliCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getCliTipoCliente().equals(instance.getCliTipoCliente()))
            equalObjects = false;
        if (equalObjects && !this.getCliObservaciones().equals(instance.getCliObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getCliAnoAltaReg().equals(instance.getCliAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCliMesAltaReg().equals(instance.getCliMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCliDiaAltaReg().equals(instance.getCliDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCliAnoUltMod().equals(instance.getCliAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCliMesUltMod().equals(instance.getCliMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCliDiaUltMod().equals(instance.getCliDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCliCveStCliente().equals(instance.getCliCveStCliente()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Clieaval result = new Clieaval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCliIdCliente((BigDecimal) objectData.getData("CLI_ID_CLIENTE"));
        result.setCliNomCliente((String) objectData.getData("CLI_NOM_CLIENTE"));
        result.setCliCurp((String) objectData.getData("CLI_CURP"));
        result.setCliTelefono((String) objectData.getData("CLI_TELEFONO"));
        result.setCliCalle((String) objectData.getData("CLI_CALLE"));
        result.setCliNumero((String) objectData.getData("CLI_NUMERO"));
        result.setCliColonia((String) objectData.getData("CLI_COLONIA"));
        result.setCliMuniDelega((String) objectData.getData("CLI_MUNI_DELEGA"));
        result.setCliEstado((String) objectData.getData("CLI_ESTADO"));
        result.setCliPais((String) objectData.getData("CLI_PAIS"));
        result.setCliCodigoPostal((String) objectData.getData("CLI_CODIGO_POSTAL"));
        result.setCliTipoCliente((String) objectData.getData("CLI_TIPO_CLIENTE"));
        result.setCliObservaciones((String) objectData.getData("CLI_OBSERVACIONES"));
        result.setCliAnoAltaReg((BigDecimal) objectData.getData("CLI_ANO_ALTA_REG"));
        result.setCliMesAltaReg((BigDecimal) objectData.getData("CLI_MES_ALTA_REG"));
        result.setCliDiaAltaReg((BigDecimal) objectData.getData("CLI_DIA_ALTA_REG"));
        result.setCliAnoUltMod((BigDecimal) objectData.getData("CLI_ANO_ULT_MOD"));
        result.setCliMesUltMod((BigDecimal) objectData.getData("CLI_MES_ULT_MOD"));
        result.setCliDiaUltMod((BigDecimal) objectData.getData("CLI_DIA_ULT_MOD"));
        result.setCliCveStCliente((String) objectData.getData("CLI_CVE_ST_CLIENTE"));

        return result;

    }

}
