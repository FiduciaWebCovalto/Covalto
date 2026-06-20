package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REPNAFIN_PK",
            columns = { "TRN_ID_FISO", "TEM_ID_PIZARRA", "TEM_ID_SERIE", "TEM_ID_CUPON", "TRN_ID_FECHA", "TRN_ID_ARCHIVO", "TRN_ID_TIPO_OPE", "TRN_ID_CASA_BOLSA" },
            sequences = { "MANUAL" })
public class FRepnafin extends DomainObject {

    BigDecimal trnIdFiso = null;
    String temIdPizarra = null;
    String temIdSerie = null;
    BigDecimal temIdCupon = null;
    String trnIdFecha = null;
    String trnIdArchivo = null;
    BigDecimal trnIdTipoOpe = null;
    BigDecimal trnIdCasaBolsa = null;
    String trnNomCasaBolsa = null;
    BigDecimal trnNumUnidadesSol = null;
    BigDecimal trnNumUnidadesAsi = null;
    BigDecimal trnNumNaftracks = null;

    public FRepnafin() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrnIdFiso(BigDecimal trnIdFiso) {
        this.trnIdFiso = trnIdFiso;
    }

    public BigDecimal getTrnIdFiso() {
        return this.trnIdFiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTemIdPizarra(String temIdPizarra) {
        this.temIdPizarra = temIdPizarra;
    }

    public String getTemIdPizarra() {
        return this.temIdPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTemIdSerie(String temIdSerie) {
        this.temIdSerie = temIdSerie;
    }

    public String getTemIdSerie() {
        return this.temIdSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemIdCupon(BigDecimal temIdCupon) {
        this.temIdCupon = temIdCupon;
    }

    public BigDecimal getTemIdCupon() {
        return this.temIdCupon;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setTrnIdFecha(String trnIdFecha) {
        this.trnIdFecha = trnIdFecha;
    }

    public String getTrnIdFecha() {
        return this.trnIdFecha;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrnIdArchivo(String trnIdArchivo) {
        this.trnIdArchivo = trnIdArchivo;
    }

    public String getTrnIdArchivo() {
        return this.trnIdArchivo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrnIdTipoOpe(BigDecimal trnIdTipoOpe) {
        this.trnIdTipoOpe = trnIdTipoOpe;
    }

    public BigDecimal getTrnIdTipoOpe() {
        return this.trnIdTipoOpe;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrnIdCasaBolsa(BigDecimal trnIdCasaBolsa) {
        this.trnIdCasaBolsa = trnIdCasaBolsa;
    }

    public BigDecimal getTrnIdCasaBolsa() {
        return this.trnIdCasaBolsa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrnNomCasaBolsa(String trnNomCasaBolsa) {
        this.trnNomCasaBolsa = trnNomCasaBolsa;
    }

    public String getTrnNomCasaBolsa() {
        return this.trnNomCasaBolsa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrnNumUnidadesSol(BigDecimal trnNumUnidadesSol) {
        this.trnNumUnidadesSol = trnNumUnidadesSol;
    }

    public BigDecimal getTrnNumUnidadesSol() {
        return this.trnNumUnidadesSol;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrnNumUnidadesAsi(BigDecimal trnNumUnidadesAsi) {
        this.trnNumUnidadesAsi = trnNumUnidadesAsi;
    }

    public BigDecimal getTrnNumUnidadesAsi() {
        return this.trnNumUnidadesAsi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrnNumNaftracks(BigDecimal trnNumNaftracks) {
        this.trnNumNaftracks = trnNumNaftracks;
    }

    public BigDecimal getTrnNumNaftracks() {
        return this.trnNumNaftracks;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REPNAFIN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrnIdFiso() != null && this.getTrnIdFiso().longValue() == -999) {
            conditions += " AND TRN_ID_FISO IS NULL";
        } else if (this.getTrnIdFiso() != null) {
            conditions += " AND TRN_ID_FISO = ?";
            values.add(this.getTrnIdFiso());
        }

        if (this.getTemIdPizarra() != null && "null".equals(this.getTemIdPizarra())) {
            conditions += " AND TEM_ID_PIZARRA IS NULL";
        } else if (this.getTemIdPizarra() != null) {
            conditions += " AND TEM_ID_PIZARRA = ?";
            values.add(this.getTemIdPizarra());
        }

        if (this.getTemIdSerie() != null && "null".equals(this.getTemIdSerie())) {
            conditions += " AND TEM_ID_SERIE IS NULL";
        } else if (this.getTemIdSerie() != null) {
            conditions += " AND TEM_ID_SERIE = ?";
            values.add(this.getTemIdSerie());
        }

        if (this.getTemIdCupon() != null && this.getTemIdCupon().longValue() == -999) {
            conditions += " AND TEM_ID_CUPON IS NULL";
        } else if (this.getTemIdCupon() != null) {
            conditions += " AND TEM_ID_CUPON = ?";
            values.add(this.getTemIdCupon());
        }

        if (this.getTrnIdFecha() != null && "null".equals(this.getTrnIdFecha())) {
            conditions += " AND TRN_ID_FECHA IS NULL";
        } else if (this.getTrnIdFecha() != null) {
            conditions += " AND TRN_ID_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTrnIdFecha());
        }

        if (this.getTrnIdArchivo() != null && "null".equals(this.getTrnIdArchivo())) {
            conditions += " AND TRN_ID_ARCHIVO IS NULL";
        } else if (this.getTrnIdArchivo() != null) {
            conditions += " AND TRN_ID_ARCHIVO = ?";
            values.add(this.getTrnIdArchivo());
        }

        if (this.getTrnIdTipoOpe() != null && this.getTrnIdTipoOpe().longValue() == -999) {
            conditions += " AND TRN_ID_TIPO_OPE IS NULL";
        } else if (this.getTrnIdTipoOpe() != null) {
            conditions += " AND TRN_ID_TIPO_OPE = ?";
            values.add(this.getTrnIdTipoOpe());
        }

        if (this.getTrnIdCasaBolsa() != null && this.getTrnIdCasaBolsa().longValue() == -999) {
            conditions += " AND TRN_ID_CASA_BOLSA IS NULL";
        } else if (this.getTrnIdCasaBolsa() != null) {
            conditions += " AND TRN_ID_CASA_BOLSA = ?";
            values.add(this.getTrnIdCasaBolsa());
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
        String sql = "SELECT * FROM F_REPNAFIN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrnIdFiso() != null && this.getTrnIdFiso().longValue() == -999) {
            conditions += " AND TRN_ID_FISO IS NULL";
        } else if (this.getTrnIdFiso() != null) {
            conditions += " AND TRN_ID_FISO = ?";
            values.add(this.getTrnIdFiso());
        }

        if (this.getTemIdPizarra() != null && "null".equals(this.getTemIdPizarra())) {
            conditions += " AND TEM_ID_PIZARRA IS NULL";
        } else if (this.getTemIdPizarra() != null) {
            conditions += " AND TEM_ID_PIZARRA = ?";
            values.add(this.getTemIdPizarra());
        }

        if (this.getTemIdSerie() != null && "null".equals(this.getTemIdSerie())) {
            conditions += " AND TEM_ID_SERIE IS NULL";
        } else if (this.getTemIdSerie() != null) {
            conditions += " AND TEM_ID_SERIE = ?";
            values.add(this.getTemIdSerie());
        }

        if (this.getTemIdCupon() != null && this.getTemIdCupon().longValue() == -999) {
            conditions += " AND TEM_ID_CUPON IS NULL";
        } else if (this.getTemIdCupon() != null) {
            conditions += " AND TEM_ID_CUPON = ?";
            values.add(this.getTemIdCupon());
        }

        if (this.getTrnIdFecha() != null && "null".equals(this.getTrnIdFecha())) {
            conditions += " AND TRN_ID_FECHA IS NULL";
        } else if (this.getTrnIdFecha() != null) {
            conditions += " AND TRN_ID_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTrnIdFecha());
        }

        if (this.getTrnIdArchivo() != null && "null".equals(this.getTrnIdArchivo())) {
            conditions += " AND TRN_ID_ARCHIVO IS NULL";
        } else if (this.getTrnIdArchivo() != null) {
            conditions += " AND TRN_ID_ARCHIVO = ?";
            values.add(this.getTrnIdArchivo());
        }

        if (this.getTrnIdTipoOpe() != null && this.getTrnIdTipoOpe().longValue() == -999) {
            conditions += " AND TRN_ID_TIPO_OPE IS NULL";
        } else if (this.getTrnIdTipoOpe() != null) {
            conditions += " AND TRN_ID_TIPO_OPE = ?";
            values.add(this.getTrnIdTipoOpe());
        }

        if (this.getTrnIdCasaBolsa() != null && this.getTrnIdCasaBolsa().longValue() == -999) {
            conditions += " AND TRN_ID_CASA_BOLSA IS NULL";
        } else if (this.getTrnIdCasaBolsa() != null) {
            conditions += " AND TRN_ID_CASA_BOLSA = ?";
            values.add(this.getTrnIdCasaBolsa());
        }

        if (this.getTrnNomCasaBolsa() != null && "null".equals(this.getTrnNomCasaBolsa())) {
            conditions += " AND TRN_NOM_CASA_BOLSA IS NULL";
        } else if (this.getTrnNomCasaBolsa() != null) {
            conditions += " AND TRN_NOM_CASA_BOLSA = ?";
            values.add(this.getTrnNomCasaBolsa());
        }

        if (this.getTrnNumUnidadesSol() != null && this.getTrnNumUnidadesSol().longValue() == -999) {
            conditions += " AND TRN_NUM_UNIDADES_SOL IS NULL";
        } else if (this.getTrnNumUnidadesSol() != null) {
            conditions += " AND TRN_NUM_UNIDADES_SOL = ?";
            values.add(this.getTrnNumUnidadesSol());
        }

        if (this.getTrnNumUnidadesAsi() != null && this.getTrnNumUnidadesAsi().longValue() == -999) {
            conditions += " AND TRN_NUM_UNIDADES_ASI IS NULL";
        } else if (this.getTrnNumUnidadesAsi() != null) {
            conditions += " AND TRN_NUM_UNIDADES_ASI = ?";
            values.add(this.getTrnNumUnidadesAsi());
        }

        if (this.getTrnNumNaftracks() != null && this.getTrnNumNaftracks().longValue() == -999) {
            conditions += " AND TRN_NUM_NAFTRACKS IS NULL";
        } else if (this.getTrnNumNaftracks() != null) {
            conditions += " AND TRN_NUM_NAFTRACKS = ?";
            values.add(this.getTrnNumNaftracks());
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
        String sql = "UPDATE F_REPNAFIN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TRN_ID_FISO = ?";
        pkValues.add(this.getTrnIdFiso());
        conditions += " AND TEM_ID_PIZARRA = ?";
        pkValues.add(this.getTemIdPizarra());
        conditions += " AND TEM_ID_SERIE = ?";
        pkValues.add(this.getTemIdSerie());
        conditions += " AND TEM_ID_CUPON = ?";
        pkValues.add(this.getTemIdCupon());
        conditions += " AND TRN_ID_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getTrnIdFecha());
        conditions += " AND TRN_ID_ARCHIVO = ?";
        pkValues.add(this.getTrnIdArchivo());
        conditions += " AND TRN_ID_TIPO_OPE = ?";
        pkValues.add(this.getTrnIdTipoOpe());
        conditions += " AND TRN_ID_CASA_BOLSA = ?";
        pkValues.add(this.getTrnIdCasaBolsa());
        fields += " TRN_NOM_CASA_BOLSA = ?, ";
        values.add(this.getTrnNomCasaBolsa());
        fields += " TRN_NUM_UNIDADES_SOL = ?, ";
        values.add(this.getTrnNumUnidadesSol());
        fields += " TRN_NUM_UNIDADES_ASI = ?, ";
        values.add(this.getTrnNumUnidadesAsi());
        fields += " TRN_NUM_NAFTRACKS = ?, ";
        values.add(this.getTrnNumNaftracks());
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
        String sql = "INSERT INTO F_REPNAFIN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TRN_ID_FISO";
        fieldValues += ", ?";
        values.add(this.getTrnIdFiso());

        fields += ", TEM_ID_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getTemIdPizarra());

        fields += ", TEM_ID_SERIE";
        fieldValues += ", ?";
        values.add(this.getTemIdSerie());

        fields += ", TEM_ID_CUPON";
        fieldValues += ", ?";
        values.add(this.getTemIdCupon());

        fields += ", TRN_ID_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getTrnIdFecha());

        fields += ", TRN_ID_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getTrnIdArchivo());

        fields += ", TRN_ID_TIPO_OPE";
        fieldValues += ", ?";
        values.add(this.getTrnIdTipoOpe());

        fields += ", TRN_ID_CASA_BOLSA";
        fieldValues += ", ?";
        values.add(this.getTrnIdCasaBolsa());

        fields += ", TRN_NOM_CASA_BOLSA";
        fieldValues += ", ?";
        values.add(this.getTrnNomCasaBolsa());

        fields += ", TRN_NUM_UNIDADES_SOL";
        fieldValues += ", ?";
        values.add(this.getTrnNumUnidadesSol());

        fields += ", TRN_NUM_UNIDADES_ASI";
        fieldValues += ", ?";
        values.add(this.getTrnNumUnidadesAsi());

        fields += ", TRN_NUM_NAFTRACKS";
        fieldValues += ", ?";
        values.add(this.getTrnNumNaftracks());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REPNAFIN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TRN_ID_FISO = ?";
        values.add(this.getTrnIdFiso());
        conditions += " AND TEM_ID_PIZARRA = ?";
        values.add(this.getTemIdPizarra());
        conditions += " AND TEM_ID_SERIE = ?";
        values.add(this.getTemIdSerie());
        conditions += " AND TEM_ID_CUPON = ?";
        values.add(this.getTemIdCupon());
        conditions += " AND TRN_ID_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getTrnIdFecha());
        conditions += " AND TRN_ID_ARCHIVO = ?";
        values.add(this.getTrnIdArchivo());
        conditions += " AND TRN_ID_TIPO_OPE = ?";
        values.add(this.getTrnIdTipoOpe());
        conditions += " AND TRN_ID_CASA_BOLSA = ?";
        values.add(this.getTrnIdCasaBolsa());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepnafin instance = (FRepnafin) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTrnIdFiso().equals(instance.getTrnIdFiso()))
            equalObjects = false;
        if (equalObjects && !this.getTemIdPizarra().equals(instance.getTemIdPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getTemIdSerie().equals(instance.getTemIdSerie()))
            equalObjects = false;
        if (equalObjects && !this.getTemIdCupon().equals(instance.getTemIdCupon()))
            equalObjects = false;
        if (equalObjects && !this.getTrnIdFecha().equals(instance.getTrnIdFecha()))
            equalObjects = false;
        if (equalObjects && !this.getTrnIdArchivo().equals(instance.getTrnIdArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getTrnIdTipoOpe().equals(instance.getTrnIdTipoOpe()))
            equalObjects = false;
        if (equalObjects && !this.getTrnIdCasaBolsa().equals(instance.getTrnIdCasaBolsa()))
            equalObjects = false;
        if (equalObjects && !this.getTrnNomCasaBolsa().equals(instance.getTrnNomCasaBolsa()))
            equalObjects = false;
        if (equalObjects && !this.getTrnNumUnidadesSol().equals(instance.getTrnNumUnidadesSol()))
            equalObjects = false;
        if (equalObjects && !this.getTrnNumUnidadesAsi().equals(instance.getTrnNumUnidadesAsi()))
            equalObjects = false;
        if (equalObjects && !this.getTrnNumNaftracks().equals(instance.getTrnNumNaftracks()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepnafin result = new FRepnafin();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTrnIdFiso((BigDecimal) objectData.getData("TRN_ID_FISO"));
        result.setTemIdPizarra((String) objectData.getData("TEM_ID_PIZARRA"));
        result.setTemIdSerie((String) objectData.getData("TEM_ID_SERIE"));
        result.setTemIdCupon((BigDecimal) objectData.getData("TEM_ID_CUPON"));
        result.setTrnIdFecha((String) objectData.getData("TRN_ID_FECHA"));
        result.setTrnIdArchivo((String) objectData.getData("TRN_ID_ARCHIVO"));
        result.setTrnIdTipoOpe((BigDecimal) objectData.getData("TRN_ID_TIPO_OPE"));
        result.setTrnIdCasaBolsa((BigDecimal) objectData.getData("TRN_ID_CASA_BOLSA"));
        result.setTrnNomCasaBolsa((String) objectData.getData("TRN_NOM_CASA_BOLSA"));
        result.setTrnNumUnidadesSol((BigDecimal) objectData.getData("TRN_NUM_UNIDADES_SOL"));
        result.setTrnNumUnidadesAsi((BigDecimal) objectData.getData("TRN_NUM_UNIDADES_ASI"));
        result.setTrnNumNaftracks((BigDecimal) objectData.getData("TRN_NUM_NAFTRACKS"));

        return result;

    }

}
