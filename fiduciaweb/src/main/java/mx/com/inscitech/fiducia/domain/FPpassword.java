package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PPASSWORD_PK", columns = { "FPA_NUM_INSTITUCION" }, sequences = { "MAX" })
public class FPpassword extends DomainObject {

    BigDecimal fpaNumInstitucion = null;
    BigDecimal fpaNumFallas = null;
    BigDecimal fpaNumCaracteres = null;
    BigDecimal fpaNumLetras = null;
    BigDecimal fpaNumNumeros = null;
    BigDecimal fpaNumHistoria = null;
    BigDecimal fpaNumDiasCambio = null;
    BigDecimal fpaNumDiasInactivo = null;
    BigDecimal fpaNumConecciones = null;
    BigDecimal fpaMinDesconeccion = null;
    String fpaPasswordDfl = null;

    public FPpassword() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumInstitucion(BigDecimal fpaNumInstitucion) {
        this.fpaNumInstitucion = fpaNumInstitucion;
    }

    public BigDecimal getFpaNumInstitucion() {
        return this.fpaNumInstitucion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumFallas(BigDecimal fpaNumFallas) {
        this.fpaNumFallas = fpaNumFallas;
    }

    public BigDecimal getFpaNumFallas() {
        return this.fpaNumFallas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumCaracteres(BigDecimal fpaNumCaracteres) {
        this.fpaNumCaracteres = fpaNumCaracteres;
    }

    public BigDecimal getFpaNumCaracteres() {
        return this.fpaNumCaracteres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumLetras(BigDecimal fpaNumLetras) {
        this.fpaNumLetras = fpaNumLetras;
    }

    public BigDecimal getFpaNumLetras() {
        return this.fpaNumLetras;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumNumeros(BigDecimal fpaNumNumeros) {
        this.fpaNumNumeros = fpaNumNumeros;
    }

    public BigDecimal getFpaNumNumeros() {
        return this.fpaNumNumeros;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumHistoria(BigDecimal fpaNumHistoria) {
        this.fpaNumHistoria = fpaNumHistoria;
    }

    public BigDecimal getFpaNumHistoria() {
        return this.fpaNumHistoria;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumDiasCambio(BigDecimal fpaNumDiasCambio) {
        this.fpaNumDiasCambio = fpaNumDiasCambio;
    }

    public BigDecimal getFpaNumDiasCambio() {
        return this.fpaNumDiasCambio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumDiasInactivo(BigDecimal fpaNumDiasInactivo) {
        this.fpaNumDiasInactivo = fpaNumDiasInactivo;
    }

    public BigDecimal getFpaNumDiasInactivo() {
        return this.fpaNumDiasInactivo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaNumConecciones(BigDecimal fpaNumConecciones) {
        this.fpaNumConecciones = fpaNumConecciones;
    }

    public BigDecimal getFpaNumConecciones() {
        return this.fpaNumConecciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaMinDesconeccion(BigDecimal fpaMinDesconeccion) {
        this.fpaMinDesconeccion = fpaMinDesconeccion;
    }

    public BigDecimal getFpaMinDesconeccion() {
        return this.fpaMinDesconeccion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFpaPasswordDfl(String fpaPasswordDfl) {
        this.fpaPasswordDfl = fpaPasswordDfl;
    }

    public String getFpaPasswordDfl() {
        return this.fpaPasswordDfl;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PPASSWORD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpaNumInstitucion() != null && this.getFpaNumInstitucion().longValue() == -999) {
            conditions += " AND FPA_NUM_INSTITUCION IS NULL";
        } else if (this.getFpaNumInstitucion() != null) {
            conditions += " AND FPA_NUM_INSTITUCION = ?";
            values.add(this.getFpaNumInstitucion());
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
        String sql = "SELECT * FROM F_PPASSWORD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpaNumInstitucion() != null && this.getFpaNumInstitucion().longValue() == -999) {
            conditions += " AND FPA_NUM_INSTITUCION IS NULL";
        } else if (this.getFpaNumInstitucion() != null) {
            conditions += " AND FPA_NUM_INSTITUCION = ?";
            values.add(this.getFpaNumInstitucion());
        }

        if (this.getFpaNumFallas() != null && this.getFpaNumFallas().longValue() == -999) {
            conditions += " AND FPA_NUM_FALLAS IS NULL";
        } else if (this.getFpaNumFallas() != null) {
            conditions += " AND FPA_NUM_FALLAS = ?";
            values.add(this.getFpaNumFallas());
        }

        if (this.getFpaNumCaracteres() != null && this.getFpaNumCaracteres().longValue() == -999) {
            conditions += " AND FPA_NUM_CARACTERES IS NULL";
        } else if (this.getFpaNumCaracteres() != null) {
            conditions += " AND FPA_NUM_CARACTERES = ?";
            values.add(this.getFpaNumCaracteres());
        }

        if (this.getFpaNumLetras() != null && this.getFpaNumLetras().longValue() == -999) {
            conditions += " AND FPA_NUM_LETRAS IS NULL";
        } else if (this.getFpaNumLetras() != null) {
            conditions += " AND FPA_NUM_LETRAS = ?";
            values.add(this.getFpaNumLetras());
        }

        if (this.getFpaNumNumeros() != null && this.getFpaNumNumeros().longValue() == -999) {
            conditions += " AND FPA_NUM_NUMEROS IS NULL";
        } else if (this.getFpaNumNumeros() != null) {
            conditions += " AND FPA_NUM_NUMEROS = ?";
            values.add(this.getFpaNumNumeros());
        }

        if (this.getFpaNumHistoria() != null && this.getFpaNumHistoria().longValue() == -999) {
            conditions += " AND FPA_NUM_HISTORIA IS NULL";
        } else if (this.getFpaNumHistoria() != null) {
            conditions += " AND FPA_NUM_HISTORIA = ?";
            values.add(this.getFpaNumHistoria());
        }

        if (this.getFpaNumDiasCambio() != null && this.getFpaNumDiasCambio().longValue() == -999) {
            conditions += " AND FPA_NUM_DIAS_CAMBIO IS NULL";
        } else if (this.getFpaNumDiasCambio() != null) {
            conditions += " AND FPA_NUM_DIAS_CAMBIO = ?";
            values.add(this.getFpaNumDiasCambio());
        }

        if (this.getFpaNumDiasInactivo() != null && this.getFpaNumDiasInactivo().longValue() == -999) {
            conditions += " AND FPA_NUM_DIAS_INACTIVO IS NULL";
        } else if (this.getFpaNumDiasInactivo() != null) {
            conditions += " AND FPA_NUM_DIAS_INACTIVO = ?";
            values.add(this.getFpaNumDiasInactivo());
        }

        if (this.getFpaNumConecciones() != null && this.getFpaNumConecciones().longValue() == -999) {
            conditions += " AND FPA_NUM_CONECCIONES IS NULL";
        } else if (this.getFpaNumConecciones() != null) {
            conditions += " AND FPA_NUM_CONECCIONES = ?";
            values.add(this.getFpaNumConecciones());
        }

        if (this.getFpaMinDesconeccion() != null && this.getFpaMinDesconeccion().longValue() == -999) {
            conditions += " AND FPA_MIN_DESCONECCION IS NULL";
        } else if (this.getFpaMinDesconeccion() != null) {
            conditions += " AND FPA_MIN_DESCONECCION = ?";
            values.add(this.getFpaMinDesconeccion());
        }

        if (this.getFpaPasswordDfl() != null && "null".equals(this.getFpaPasswordDfl())) {
            conditions += " AND FPA_PASSWORD_DFL IS NULL";
        } else if (this.getFpaPasswordDfl() != null) {
            conditions += " AND FPA_PASSWORD_DFL = ?";
            values.add(this.getFpaPasswordDfl());
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
        String sql = "UPDATE F_PPASSWORD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPA_NUM_INSTITUCION = ?";
        pkValues.add(this.getFpaNumInstitucion());
        fields += " FPA_NUM_FALLAS = ?, ";
        values.add(this.getFpaNumFallas());
        fields += " FPA_NUM_CARACTERES = ?, ";
        values.add(this.getFpaNumCaracteres());
        fields += " FPA_NUM_LETRAS = ?, ";
        values.add(this.getFpaNumLetras());
        fields += " FPA_NUM_NUMEROS = ?, ";
        values.add(this.getFpaNumNumeros());
        fields += " FPA_NUM_HISTORIA = ?, ";
        values.add(this.getFpaNumHistoria());
        fields += " FPA_NUM_DIAS_CAMBIO = ?, ";
        values.add(this.getFpaNumDiasCambio());
        fields += " FPA_NUM_DIAS_INACTIVO = ?, ";
        values.add(this.getFpaNumDiasInactivo());
        fields += " FPA_NUM_CONECCIONES = ?, ";
        values.add(this.getFpaNumConecciones());
        fields += " FPA_MIN_DESCONECCION = ?, ";
        values.add(this.getFpaMinDesconeccion());
        fields += " FPA_PASSWORD_DFL = ?, ";
        values.add(this.getFpaPasswordDfl());
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
        String sql = "INSERT INTO F_PPASSWORD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPA_NUM_INSTITUCION";
        fieldValues += ", ?";
        values.add(this.getFpaNumInstitucion());

        fields += ", FPA_NUM_FALLAS";
        fieldValues += ", ?";
        values.add(this.getFpaNumFallas());

        fields += ", FPA_NUM_CARACTERES";
        fieldValues += ", ?";
        values.add(this.getFpaNumCaracteres());

        fields += ", FPA_NUM_LETRAS";
        fieldValues += ", ?";
        values.add(this.getFpaNumLetras());

        fields += ", FPA_NUM_NUMEROS";
        fieldValues += ", ?";
        values.add(this.getFpaNumNumeros());

        fields += ", FPA_NUM_HISTORIA";
        fieldValues += ", ?";
        values.add(this.getFpaNumHistoria());

        fields += ", FPA_NUM_DIAS_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getFpaNumDiasCambio());

        fields += ", FPA_NUM_DIAS_INACTIVO";
        fieldValues += ", ?";
        values.add(this.getFpaNumDiasInactivo());

        fields += ", FPA_NUM_CONECCIONES";
        fieldValues += ", ?";
        values.add(this.getFpaNumConecciones());

        fields += ", FPA_MIN_DESCONECCION";
        fieldValues += ", ?";
        values.add(this.getFpaMinDesconeccion());

        fields += ", FPA_PASSWORD_DFL";
        fieldValues += ", ?";
        values.add(this.getFpaPasswordDfl());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PPASSWORD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPA_NUM_INSTITUCION = ?";
        values.add(this.getFpaNumInstitucion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FPpassword instance = (FPpassword) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFpaNumInstitucion().equals(instance.getFpaNumInstitucion()))
            equalObjects = false;
        if (equalObjects && !this.getFpaNumFallas().equals(instance.getFpaNumFallas()))
            equalObjects = false;
        if (equalObjects && !this.getFpaNumCaracteres().equals(instance.getFpaNumCaracteres()))
            equalObjects = false;
        if (equalObjects && !this.getFpaNumLetras().equals(instance.getFpaNumLetras()))
            equalObjects = false;
        if (equalObjects && !this.getFpaNumNumeros().equals(instance.getFpaNumNumeros()))
            equalObjects = false;
        if (equalObjects && !this.getFpaNumHistoria().equals(instance.getFpaNumHistoria()))
            equalObjects = false;
        if (equalObjects && !this.getFpaNumDiasCambio().equals(instance.getFpaNumDiasCambio()))
            equalObjects = false;
        if (equalObjects && !this.getFpaNumDiasInactivo().equals(instance.getFpaNumDiasInactivo()))
            equalObjects = false;
        if (equalObjects && !this.getFpaNumConecciones().equals(instance.getFpaNumConecciones()))
            equalObjects = false;
        if (equalObjects && !this.getFpaMinDesconeccion().equals(instance.getFpaMinDesconeccion()))
            equalObjects = false;
        if (equalObjects && !this.getFpaPasswordDfl().equals(instance.getFpaPasswordDfl()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPpassword result = new FPpassword();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFpaNumInstitucion((BigDecimal) objectData.getData("FPA_NUM_INSTITUCION"));
        result.setFpaNumFallas((BigDecimal) objectData.getData("FPA_NUM_FALLAS"));
        result.setFpaNumCaracteres((BigDecimal) objectData.getData("FPA_NUM_CARACTERES"));
        result.setFpaNumLetras((BigDecimal) objectData.getData("FPA_NUM_LETRAS"));
        result.setFpaNumNumeros((BigDecimal) objectData.getData("FPA_NUM_NUMEROS"));
        result.setFpaNumHistoria((BigDecimal) objectData.getData("FPA_NUM_HISTORIA"));
        result.setFpaNumDiasCambio((BigDecimal) objectData.getData("FPA_NUM_DIAS_CAMBIO"));
        result.setFpaNumDiasInactivo((BigDecimal) objectData.getData("FPA_NUM_DIAS_INACTIVO"));
        result.setFpaNumConecciones((BigDecimal) objectData.getData("FPA_NUM_CONECCIONES"));
        result.setFpaMinDesconeccion((BigDecimal) objectData.getData("FPA_MIN_DESCONECCION"));
        result.setFpaPasswordDfl((String) objectData.getData("FPA_PASSWORD_DFL"));

        return result;

    }

}
