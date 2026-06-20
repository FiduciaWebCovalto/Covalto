package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0016520", columns = { "FAST_IDENTIFICADOR_ARCHIVO", "FDAT_IDENTIFICADOR_DATO" }, sequences = { "MANUAL" })
public class FDatoArchivoSat extends DomainObject {

    BigDecimal fastIdentificadorArchivo = null;
    BigDecimal fdatIdentificadorDato = null;
    BigDecimal fdatOrden = null;
    BigDecimal fdatLongitud = null;
    String fdatRellenoIzDe = null;
    String fdatCaracterRelleno = null;
    BigDecimal fdatGrabaArchivo = null;
    BigDecimal fdatValorFijo = null;
    String fdatValorReferencia = null;
    String fdatNombre = null;

    public FDatoArchivoSat() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFastIdentificadorArchivo(BigDecimal fastIdentificadorArchivo) {
        this.fastIdentificadorArchivo = fastIdentificadorArchivo;
    }

    public BigDecimal getFastIdentificadorArchivo() {
        return this.fastIdentificadorArchivo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdatIdentificadorDato(BigDecimal fdatIdentificadorDato) {
        this.fdatIdentificadorDato = fdatIdentificadorDato;
    }

    public BigDecimal getFdatIdentificadorDato() {
        return this.fdatIdentificadorDato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFdatOrden(BigDecimal fdatOrden) {
        this.fdatOrden = fdatOrden;
    }

    public BigDecimal getFdatOrden() {
        return this.fdatOrden;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setFdatLongitud(BigDecimal fdatLongitud) {
        this.fdatLongitud = fdatLongitud;
    }

    public BigDecimal getFdatLongitud() {
        return this.fdatLongitud;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdatRellenoIzDe(String fdatRellenoIzDe) {
        this.fdatRellenoIzDe = fdatRellenoIzDe;
    }

    public String getFdatRellenoIzDe() {
        return this.fdatRellenoIzDe;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdatCaracterRelleno(String fdatCaracterRelleno) {
        this.fdatCaracterRelleno = fdatCaracterRelleno;
    }

    public String getFdatCaracterRelleno() {
        return this.fdatCaracterRelleno;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFdatGrabaArchivo(BigDecimal fdatGrabaArchivo) {
        this.fdatGrabaArchivo = fdatGrabaArchivo;
    }

    public BigDecimal getFdatGrabaArchivo() {
        return this.fdatGrabaArchivo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFdatValorFijo(BigDecimal fdatValorFijo) {
        this.fdatValorFijo = fdatValorFijo;
    }

    public BigDecimal getFdatValorFijo() {
        return this.fdatValorFijo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdatValorReferencia(String fdatValorReferencia) {
        this.fdatValorReferencia = fdatValorReferencia;
    }

    public String getFdatValorReferencia() {
        return this.fdatValorReferencia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdatNombre(String fdatNombre) {
        this.fdatNombre = fdatNombre;
    }

    public String getFdatNombre() {
        return this.fdatNombre;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_DATO_ARCHIVO_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFastIdentificadorArchivo() != null && this.getFastIdentificadorArchivo().longValue() == -999) {
            conditions += " AND FAST_IDENTIFICADOR_ARCHIVO IS NULL";
        } else if (this.getFastIdentificadorArchivo() != null) {
            conditions += " AND FAST_IDENTIFICADOR_ARCHIVO = ?";
            values.add(this.getFastIdentificadorArchivo());
        }

        if (this.getFdatIdentificadorDato() != null && this.getFdatIdentificadorDato().longValue() == -999) {
            conditions += " AND FDAT_IDENTIFICADOR_DATO IS NULL";
        } else if (this.getFdatIdentificadorDato() != null) {
            conditions += " AND FDAT_IDENTIFICADOR_DATO = ?";
            values.add(this.getFdatIdentificadorDato());
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
        String sql = "SELECT * FROM F_DATO_ARCHIVO_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFastIdentificadorArchivo() != null && this.getFastIdentificadorArchivo().longValue() == -999) {
            conditions += " AND FAST_IDENTIFICADOR_ARCHIVO IS NULL";
        } else if (this.getFastIdentificadorArchivo() != null) {
            conditions += " AND FAST_IDENTIFICADOR_ARCHIVO = ?";
            values.add(this.getFastIdentificadorArchivo());
        }

        if (this.getFdatIdentificadorDato() != null && this.getFdatIdentificadorDato().longValue() == -999) {
            conditions += " AND FDAT_IDENTIFICADOR_DATO IS NULL";
        } else if (this.getFdatIdentificadorDato() != null) {
            conditions += " AND FDAT_IDENTIFICADOR_DATO = ?";
            values.add(this.getFdatIdentificadorDato());
        }

        if (this.getFdatOrden() != null && this.getFdatOrden().longValue() == -999) {
            conditions += " AND FDAT_ORDEN IS NULL";
        } else if (this.getFdatOrden() != null) {
            conditions += " AND FDAT_ORDEN = ?";
            values.add(this.getFdatOrden());
        }

        if (this.getFdatLongitud() != null && this.getFdatLongitud().longValue() == -999) {
            conditions += " AND FDAT_LONGITUD IS NULL";
        } else if (this.getFdatLongitud() != null) {
            conditions += " AND FDAT_LONGITUD = ?";
            values.add(this.getFdatLongitud());
        }

        if (this.getFdatRellenoIzDe() != null && "null".equals(this.getFdatRellenoIzDe())) {
            conditions += " AND FDAT_RELLENO_IZ_DE IS NULL";
        } else if (this.getFdatRellenoIzDe() != null) {
            conditions += " AND FDAT_RELLENO_IZ_DE = ?";
            values.add(this.getFdatRellenoIzDe());
        }

        if (this.getFdatCaracterRelleno() != null && "null".equals(this.getFdatCaracterRelleno())) {
            conditions += " AND FDAT_CARACTER_RELLENO IS NULL";
        } else if (this.getFdatCaracterRelleno() != null) {
            conditions += " AND FDAT_CARACTER_RELLENO = ?";
            values.add(this.getFdatCaracterRelleno());
        }

        if (this.getFdatGrabaArchivo() != null && this.getFdatGrabaArchivo().longValue() == -999) {
            conditions += " AND FDAT_GRABA_ARCHIVO IS NULL";
        } else if (this.getFdatGrabaArchivo() != null) {
            conditions += " AND FDAT_GRABA_ARCHIVO = ?";
            values.add(this.getFdatGrabaArchivo());
        }

        if (this.getFdatValorFijo() != null && this.getFdatValorFijo().longValue() == -999) {
            conditions += " AND FDAT_VALOR_FIJO IS NULL";
        } else if (this.getFdatValorFijo() != null) {
            conditions += " AND FDAT_VALOR_FIJO = ?";
            values.add(this.getFdatValorFijo());
        }

        if (this.getFdatValorReferencia() != null && "null".equals(this.getFdatValorReferencia())) {
            conditions += " AND FDAT_VALOR_REFERENCIA IS NULL";
        } else if (this.getFdatValorReferencia() != null) {
            conditions += " AND FDAT_VALOR_REFERENCIA = ?";
            values.add(this.getFdatValorReferencia());
        }

        if (this.getFdatNombre() != null && "null".equals(this.getFdatNombre())) {
            conditions += " AND FDAT_NOMBRE IS NULL";
        } else if (this.getFdatNombre() != null) {
            conditions += " AND FDAT_NOMBRE = ?";
            values.add(this.getFdatNombre());
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
        String sql = "UPDATE F_DATO_ARCHIVO_SAT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FAST_IDENTIFICADOR_ARCHIVO = ?";
        pkValues.add(this.getFastIdentificadorArchivo());
        conditions += " AND FDAT_IDENTIFICADOR_DATO = ?";
        pkValues.add(this.getFdatIdentificadorDato());
        fields += " FDAT_ORDEN = ?, ";
        values.add(this.getFdatOrden());
        fields += " FDAT_LONGITUD = ?, ";
        values.add(this.getFdatLongitud());
        fields += " FDAT_RELLENO_IZ_DE = ?, ";
        values.add(this.getFdatRellenoIzDe());
        fields += " FDAT_CARACTER_RELLENO = ?, ";
        values.add(this.getFdatCaracterRelleno());
        fields += " FDAT_GRABA_ARCHIVO = ?, ";
        values.add(this.getFdatGrabaArchivo());
        fields += " FDAT_VALOR_FIJO = ?, ";
        values.add(this.getFdatValorFijo());
        fields += " FDAT_VALOR_REFERENCIA = ?, ";
        values.add(this.getFdatValorReferencia());
        fields += " FDAT_NOMBRE = ?, ";
        values.add(this.getFdatNombre());
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
        String sql = "INSERT INTO F_DATO_ARCHIVO_SAT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FAST_IDENTIFICADOR_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getFastIdentificadorArchivo());

        fields += ", FDAT_IDENTIFICADOR_DATO";
        fieldValues += ", ?";
        values.add(this.getFdatIdentificadorDato());

        fields += ", FDAT_ORDEN";
        fieldValues += ", ?";
        values.add(this.getFdatOrden());

        fields += ", FDAT_LONGITUD";
        fieldValues += ", ?";
        values.add(this.getFdatLongitud());

        fields += ", FDAT_RELLENO_IZ_DE";
        fieldValues += ", ?";
        values.add(this.getFdatRellenoIzDe());

        fields += ", FDAT_CARACTER_RELLENO";
        fieldValues += ", ?";
        values.add(this.getFdatCaracterRelleno());

        fields += ", FDAT_GRABA_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getFdatGrabaArchivo());

        fields += ", FDAT_VALOR_FIJO";
        fieldValues += ", ?";
        values.add(this.getFdatValorFijo());

        fields += ", FDAT_VALOR_REFERENCIA";
        fieldValues += ", ?";
        values.add(this.getFdatValorReferencia());

        fields += ", FDAT_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFdatNombre());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_DATO_ARCHIVO_SAT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FAST_IDENTIFICADOR_ARCHIVO = ?";
        values.add(this.getFastIdentificadorArchivo());
        conditions += " AND FDAT_IDENTIFICADOR_DATO = ?";
        values.add(this.getFdatIdentificadorDato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FDatoArchivoSat instance = (FDatoArchivoSat) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFastIdentificadorArchivo().equals(instance.getFastIdentificadorArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getFdatIdentificadorDato().equals(instance.getFdatIdentificadorDato()))
            equalObjects = false;
        if (equalObjects && !this.getFdatOrden().equals(instance.getFdatOrden()))
            equalObjects = false;
        if (equalObjects && !this.getFdatLongitud().equals(instance.getFdatLongitud()))
            equalObjects = false;
        if (equalObjects && !this.getFdatRellenoIzDe().equals(instance.getFdatRellenoIzDe()))
            equalObjects = false;
        if (equalObjects && !this.getFdatCaracterRelleno().equals(instance.getFdatCaracterRelleno()))
            equalObjects = false;
        if (equalObjects && !this.getFdatGrabaArchivo().equals(instance.getFdatGrabaArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getFdatValorFijo().equals(instance.getFdatValorFijo()))
            equalObjects = false;
        if (equalObjects && !this.getFdatValorReferencia().equals(instance.getFdatValorReferencia()))
            equalObjects = false;
        if (equalObjects && !this.getFdatNombre().equals(instance.getFdatNombre()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FDatoArchivoSat result = new FDatoArchivoSat();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFastIdentificadorArchivo((BigDecimal) objectData.getData("FAST_IDENTIFICADOR_ARCHIVO"));
        result.setFdatIdentificadorDato((BigDecimal) objectData.getData("FDAT_IDENTIFICADOR_DATO"));
        result.setFdatOrden((BigDecimal) objectData.getData("FDAT_ORDEN"));
        result.setFdatLongitud((BigDecimal) objectData.getData("FDAT_LONGITUD"));
        result.setFdatRellenoIzDe((String) objectData.getData("FDAT_RELLENO_IZ_DE"));
        result.setFdatCaracterRelleno((String) objectData.getData("FDAT_CARACTER_RELLENO"));
        result.setFdatGrabaArchivo((BigDecimal) objectData.getData("FDAT_GRABA_ARCHIVO"));
        result.setFdatValorFijo((BigDecimal) objectData.getData("FDAT_VALOR_FIJO"));
        result.setFdatValorReferencia((String) objectData.getData("FDAT_VALOR_REFERENCIA"));
        result.setFdatNombre((String) objectData.getData("FDAT_NOMBRE"));

        return result;

    }

}
