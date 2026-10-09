package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_TKYC_CONCEPTOS_PK", columns = { "FTCP_ID_CONCEPTOS" }, sequences = { "MAX" })
public class FTkycConceptos extends DomainObject {

    BigDecimal ftcpIdConceptos = null;
    BigDecimal ftcpLista = null;
    String ftcpEtiqueta = null;
    String ftcpValorCapturado = null;
    BigDecimal ftcpObligatorio = null;
    BigDecimal ftcpAlfanumerico = null;
    BigDecimal ftcpTipoFecha = null;
    BigDecimal ftcpExiste = null;
    String ftcpUbicacion = null;
    BigDecimal ftcpHijos = null;

    public FTkycConceptos() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtcpIdConceptos(BigDecimal ftcpIdConceptos) {
        this.ftcpIdConceptos = ftcpIdConceptos;
    }

    public BigDecimal getFtcpIdConceptos() {
        return this.ftcpIdConceptos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFtcpLista(BigDecimal ftcpLista) {
        this.ftcpLista = ftcpLista;
    }

    public BigDecimal getFtcpLista() {
        return this.ftcpLista;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFtcpEtiqueta(String ftcpEtiqueta) {
        this.ftcpEtiqueta = ftcpEtiqueta;
    }

    public String getFtcpEtiqueta() {
        return this.ftcpEtiqueta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFtcpValorCapturado(String ftcpValorCapturado) {
        this.ftcpValorCapturado = ftcpValorCapturado;
    }

    public String getFtcpValorCapturado() {
        return this.ftcpValorCapturado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFtcpObligatorio(BigDecimal ftcpObligatorio) {
        this.ftcpObligatorio = ftcpObligatorio;
    }

    public BigDecimal getFtcpObligatorio() {
        return this.ftcpObligatorio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFtcpAlfanumerico(BigDecimal ftcpAlfanumerico) {
        this.ftcpAlfanumerico = ftcpAlfanumerico;
    }

    public BigDecimal getFtcpAlfanumerico() {
        return this.ftcpAlfanumerico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFtcpTipoFecha(BigDecimal ftcpTipoFecha) {
        this.ftcpTipoFecha = ftcpTipoFecha;
    }

    public BigDecimal getFtcpTipoFecha() {
        return this.ftcpTipoFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtcpExiste(BigDecimal ftcpExiste) {
        this.ftcpExiste = ftcpExiste;
    }

    public BigDecimal getFtcpExiste() {
        return this.ftcpExiste;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFtcpUbicacion(String ftcpUbicacion) {
        this.ftcpUbicacion = ftcpUbicacion;
    }

    public String getFtcpUbicacion() {
        return this.ftcpUbicacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFtcpHijos(BigDecimal ftcpHijos) {
        this.ftcpHijos = ftcpHijos;
    }

    public BigDecimal getFtcpHijos() {
        return this.ftcpHijos;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_TKYC_CONCEPTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFtcpIdConceptos() != null && this.getFtcpIdConceptos().longValue() == -999) {
            conditions += " AND FTCP_ID_CONCEPTOS IS NULL";
        } else if (this.getFtcpIdConceptos() != null) {
            conditions += " AND FTCP_ID_CONCEPTOS = ?";
            values.add(this.getFtcpIdConceptos());
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
        String sql = "SELECT * FROM F_TKYC_CONCEPTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFtcpIdConceptos() != null && this.getFtcpIdConceptos().longValue() == -999) {
            conditions += " AND FTCP_ID_CONCEPTOS IS NULL";
        } else if (this.getFtcpIdConceptos() != null) {
            conditions += " AND FTCP_ID_CONCEPTOS = ?";
            values.add(this.getFtcpIdConceptos());
        }

        if (this.getFtcpLista() != null && this.getFtcpLista().longValue() == -999) {
            conditions += " AND FTCP_LISTA IS NULL";
        } else if (this.getFtcpLista() != null) {
            conditions += " AND FTCP_LISTA = ?";
            values.add(this.getFtcpLista());
        }

        if (this.getFtcpEtiqueta() != null && "null".equals(this.getFtcpEtiqueta())) {
            conditions += " AND FTCP_ETIQUETA IS NULL";
        } else if (this.getFtcpEtiqueta() != null) {
            conditions += " AND FTCP_ETIQUETA = ?";
            values.add(this.getFtcpEtiqueta());
        }

        if (this.getFtcpValorCapturado() != null && "null".equals(this.getFtcpValorCapturado())) {
            conditions += " AND FTCP_VALOR_CAPTURADO IS NULL";
        } else if (this.getFtcpValorCapturado() != null) {
            conditions += " AND FTCP_VALOR_CAPTURADO = ?";
            values.add(this.getFtcpValorCapturado());
        }

        if (this.getFtcpObligatorio() != null && this.getFtcpObligatorio().longValue() == -999) {
            conditions += " AND FTCP_OBLIGATORIO IS NULL";
        } else if (this.getFtcpObligatorio() != null) {
            conditions += " AND FTCP_OBLIGATORIO = ?";
            values.add(this.getFtcpObligatorio());
        }

        if (this.getFtcpAlfanumerico() != null && this.getFtcpAlfanumerico().longValue() == -999) {
            conditions += " AND FTCP_ALFANUMERICO IS NULL";
        } else if (this.getFtcpAlfanumerico() != null) {
            conditions += " AND FTCP_ALFANUMERICO = ?";
            values.add(this.getFtcpAlfanumerico());
        }

        if (this.getFtcpTipoFecha() != null && this.getFtcpTipoFecha().longValue() == -999) {
            conditions += " AND FTCP_TIPO_FECHA IS NULL";
        } else if (this.getFtcpTipoFecha() != null) {
            conditions += " AND FTCP_TIPO_FECHA = ?";
            values.add(this.getFtcpTipoFecha());
        }

        if (this.getFtcpExiste() != null && this.getFtcpExiste().longValue() == -999) {
            conditions += " AND FTCP_EXISTE IS NULL";
        } else if (this.getFtcpExiste() != null) {
            conditions += " AND FTCP_EXISTE = ?";
            values.add(this.getFtcpExiste());
        }

        if (this.getFtcpUbicacion() != null && "null".equals(this.getFtcpUbicacion())) {
            conditions += " AND FTCP_UBICACION IS NULL";
        } else if (this.getFtcpUbicacion() != null) {
            conditions += " AND FTCP_UBICACION = ?";
            values.add(this.getFtcpUbicacion());
        }

        if (this.getFtcpHijos() != null && this.getFtcpHijos().longValue() == -999) {
            conditions += " AND FTCP_HIJOS IS NULL";
        } else if (this.getFtcpHijos() != null) {
            conditions += " AND FTCP_HIJOS = ?";
            values.add(this.getFtcpHijos());
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
        String sql = "UPDATE F_TKYC_CONCEPTOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FTCP_ID_CONCEPTOS = ?";
        pkValues.add(this.getFtcpIdConceptos());
        fields += " FTCP_LISTA = ?, ";
        values.add(this.getFtcpLista());
        fields += " FTCP_ETIQUETA = ?, ";
        values.add(this.getFtcpEtiqueta());
        fields += " FTCP_VALOR_CAPTURADO = ?, ";
        values.add(this.getFtcpValorCapturado());
        fields += " FTCP_OBLIGATORIO = ?, ";
        values.add(this.getFtcpObligatorio());
        fields += " FTCP_ALFANUMERICO = ?, ";
        values.add(this.getFtcpAlfanumerico());
        fields += " FTCP_TIPO_FECHA = ?, ";
        values.add(this.getFtcpTipoFecha());
        fields += " FTCP_EXISTE = ?, ";
        values.add(this.getFtcpExiste());
        fields += " FTCP_UBICACION = ?, ";
        values.add(this.getFtcpUbicacion());
        fields += " FTCP_HIJOS = ?, ";
        values.add(this.getFtcpHijos());
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
        String sql = "INSERT INTO F_TKYC_CONCEPTOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FTCP_ID_CONCEPTOS";
        fieldValues += ", ?";
        values.add(this.getFtcpIdConceptos());

        fields += ", FTCP_LISTA";
        fieldValues += ", ?";
        values.add(this.getFtcpLista());

        fields += ", FTCP_ETIQUETA";
        fieldValues += ", ?";
        values.add(this.getFtcpEtiqueta());

        fields += ", FTCP_VALOR_CAPTURADO";
        fieldValues += ", ?";
        values.add(this.getFtcpValorCapturado());

        fields += ", FTCP_OBLIGATORIO";
        fieldValues += ", ?";
        values.add(this.getFtcpObligatorio());

        fields += ", FTCP_ALFANUMERICO";
        fieldValues += ", ?";
        values.add(this.getFtcpAlfanumerico());

        fields += ", FTCP_TIPO_FECHA";
        fieldValues += ", ?";
        values.add(this.getFtcpTipoFecha());

        fields += ", FTCP_EXISTE";
        fieldValues += ", ?";
        values.add(this.getFtcpExiste());

        fields += ", FTCP_UBICACION";
        fieldValues += ", ?";
        values.add(this.getFtcpUbicacion());

        fields += ", FTCP_HIJOS";
        fieldValues += ", ?";
        values.add(this.getFtcpHijos());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_TKYC_CONCEPTOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FTCP_ID_CONCEPTOS = ?";
        values.add(this.getFtcpIdConceptos());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FTkycConceptos instance = (FTkycConceptos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFtcpIdConceptos().equals(instance.getFtcpIdConceptos()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpLista().equals(instance.getFtcpLista()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpEtiqueta().equals(instance.getFtcpEtiqueta()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpValorCapturado().equals(instance.getFtcpValorCapturado()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpObligatorio().equals(instance.getFtcpObligatorio()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpAlfanumerico().equals(instance.getFtcpAlfanumerico()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpTipoFecha().equals(instance.getFtcpTipoFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpExiste().equals(instance.getFtcpExiste()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpUbicacion().equals(instance.getFtcpUbicacion()))
            equalObjects = false;
        if (equalObjects && !this.getFtcpHijos().equals(instance.getFtcpHijos()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FTkycConceptos result = new FTkycConceptos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFtcpIdConceptos((BigDecimal) objectData.getData("FTCP_ID_CONCEPTOS"));
        result.setFtcpLista((BigDecimal) objectData.getData("FTCP_LISTA"));
        result.setFtcpEtiqueta((String) objectData.getData("FTCP_ETIQUETA"));
        result.setFtcpValorCapturado((String) objectData.getData("FTCP_VALOR_CAPTURADO"));
        result.setFtcpObligatorio((BigDecimal) objectData.getData("FTCP_OBLIGATORIO"));
        result.setFtcpAlfanumerico((BigDecimal) objectData.getData("FTCP_ALFANUMERICO"));
        result.setFtcpTipoFecha((BigDecimal) objectData.getData("FTCP_TIPO_FECHA"));
        result.setFtcpExiste((BigDecimal) objectData.getData("FTCP_EXISTE"));
        result.setFtcpUbicacion((String) objectData.getData("FTCP_UBICACION"));
        result.setFtcpHijos((BigDecimal) objectData.getData("FTCP_HIJOS"));

        return result;

    }

}
