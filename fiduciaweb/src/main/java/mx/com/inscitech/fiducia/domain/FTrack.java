package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_TRACK_PK", columns = { "TEN_NUM_FISO", "TEM_ID_PIZARRA", "TEM_ID_SERIE", "TEM_ID_CUPON", "TEM_ID_FOLIO" }, sequences = { "MANUAL" })
public class FTrack extends DomainObject {

    BigDecimal tenNumFiso = null;
    String temIdPizarra = null;
    String temIdSerie = null;
    BigDecimal temIdCupon = null;
    BigDecimal temIdFolio = null;
    String temFecMovto = null;
    BigDecimal temCerCirculacion = null;
    BigDecimal temCerCreados = null;
    BigDecimal temCerRedimidos = null;
    BigDecimal temPrecioTeorico = null;
    BigDecimal temValorCanasta = null;
    BigDecimal temValorActivos = null;
    BigDecimal temNumUnidad = null;
    BigDecimal temCuentaGastos = null;
    BigDecimal temNumUnidades = null;
    BigDecimal temNumTracs = null;
    BigDecimal temPrecioCer = null;
    BigDecimal temPrecioTra = null;
    String temStatus = null;

    public FTrack() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTenNumFiso(BigDecimal tenNumFiso) {
        this.tenNumFiso = tenNumFiso;
    }

    public BigDecimal getTenNumFiso() {
        return this.tenNumFiso;
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

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemIdFolio(BigDecimal temIdFolio) {
        this.temIdFolio = temIdFolio;
    }

    public BigDecimal getTemIdFolio() {
        return this.temIdFolio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setTemFecMovto(String temFecMovto) {
        this.temFecMovto = temFecMovto;
    }

    public String getTemFecMovto() {
        return this.temFecMovto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemCerCirculacion(BigDecimal temCerCirculacion) {
        this.temCerCirculacion = temCerCirculacion;
    }

    public BigDecimal getTemCerCirculacion() {
        return this.temCerCirculacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemCerCreados(BigDecimal temCerCreados) {
        this.temCerCreados = temCerCreados;
    }

    public BigDecimal getTemCerCreados() {
        return this.temCerCreados;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemCerRedimidos(BigDecimal temCerRedimidos) {
        this.temCerRedimidos = temCerRedimidos;
    }

    public BigDecimal getTemCerRedimidos() {
        return this.temCerRedimidos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 6, javaClass = BigDecimal.class)
    public void setTemPrecioTeorico(BigDecimal temPrecioTeorico) {
        this.temPrecioTeorico = temPrecioTeorico;
    }

    public BigDecimal getTemPrecioTeorico() {
        return this.temPrecioTeorico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTemValorCanasta(BigDecimal temValorCanasta) {
        this.temValorCanasta = temValorCanasta;
    }

    public BigDecimal getTemValorCanasta() {
        return this.temValorCanasta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTemValorActivos(BigDecimal temValorActivos) {
        this.temValorActivos = temValorActivos;
    }

    public BigDecimal getTemValorActivos() {
        return this.temValorActivos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemNumUnidad(BigDecimal temNumUnidad) {
        this.temNumUnidad = temNumUnidad;
    }

    public BigDecimal getTemNumUnidad() {
        return this.temNumUnidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemCuentaGastos(BigDecimal temCuentaGastos) {
        this.temCuentaGastos = temCuentaGastos;
    }

    public BigDecimal getTemCuentaGastos() {
        return this.temCuentaGastos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemNumUnidades(BigDecimal temNumUnidades) {
        this.temNumUnidades = temNumUnidades;
    }

    public BigDecimal getTemNumUnidades() {
        return this.temNumUnidades;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTemNumTracs(BigDecimal temNumTracs) {
        this.temNumTracs = temNumTracs;
    }

    public BigDecimal getTemNumTracs() {
        return this.temNumTracs;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 6, javaClass = BigDecimal.class)
    public void setTemPrecioCer(BigDecimal temPrecioCer) {
        this.temPrecioCer = temPrecioCer;
    }

    public BigDecimal getTemPrecioCer() {
        return this.temPrecioCer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 12, scale = 6, javaClass = BigDecimal.class)
    public void setTemPrecioTra(BigDecimal temPrecioTra) {
        this.temPrecioTra = temPrecioTra;
    }

    public BigDecimal getTemPrecioTra() {
        return this.temPrecioTra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTemStatus(String temStatus) {
        this.temStatus = temStatus;
    }

    public String getTemStatus() {
        return this.temStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_TRACK ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTenNumFiso() != null && this.getTenNumFiso().longValue() == -999) {
            conditions += " AND TEN_NUM_FISO IS NULL";
        } else if (this.getTenNumFiso() != null) {
            conditions += " AND TEN_NUM_FISO = ?";
            values.add(this.getTenNumFiso());
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

        if (this.getTemIdFolio() != null && this.getTemIdFolio().longValue() == -999) {
            conditions += " AND TEM_ID_FOLIO IS NULL";
        } else if (this.getTemIdFolio() != null) {
            conditions += " AND TEM_ID_FOLIO = ?";
            values.add(this.getTemIdFolio());
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
        String sql = "SELECT * FROM F_TRACK ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTenNumFiso() != null && this.getTenNumFiso().longValue() == -999) {
            conditions += " AND TEN_NUM_FISO IS NULL";
        } else if (this.getTenNumFiso() != null) {
            conditions += " AND TEN_NUM_FISO = ?";
            values.add(this.getTenNumFiso());
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

        if (this.getTemIdFolio() != null && this.getTemIdFolio().longValue() == -999) {
            conditions += " AND TEM_ID_FOLIO IS NULL";
        } else if (this.getTemIdFolio() != null) {
            conditions += " AND TEM_ID_FOLIO = ?";
            values.add(this.getTemIdFolio());
        }

        if (this.getTemFecMovto() != null && "null".equals(this.getTemFecMovto())) {
            conditions += " AND TEM_FEC_MOVTO IS NULL";
        } else if (this.getTemFecMovto() != null) {
            conditions += " AND TEM_FEC_MOVTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTemFecMovto());
        }

        if (this.getTemCerCirculacion() != null && this.getTemCerCirculacion().longValue() == -999) {
            conditions += " AND TEM_CER_CIRCULACION IS NULL";
        } else if (this.getTemCerCirculacion() != null) {
            conditions += " AND TEM_CER_CIRCULACION = ?";
            values.add(this.getTemCerCirculacion());
        }

        if (this.getTemCerCreados() != null && this.getTemCerCreados().longValue() == -999) {
            conditions += " AND TEM_CER_CREADOS IS NULL";
        } else if (this.getTemCerCreados() != null) {
            conditions += " AND TEM_CER_CREADOS = ?";
            values.add(this.getTemCerCreados());
        }

        if (this.getTemCerRedimidos() != null && this.getTemCerRedimidos().longValue() == -999) {
            conditions += " AND TEM_CER_REDIMIDOS IS NULL";
        } else if (this.getTemCerRedimidos() != null) {
            conditions += " AND TEM_CER_REDIMIDOS = ?";
            values.add(this.getTemCerRedimidos());
        }

        if (this.getTemPrecioTeorico() != null && this.getTemPrecioTeorico().longValue() == -999) {
            conditions += " AND TEM_PRECIO_TEORICO IS NULL";
        } else if (this.getTemPrecioTeorico() != null) {
            conditions += " AND TEM_PRECIO_TEORICO = ?";
            values.add(this.getTemPrecioTeorico());
        }

        if (this.getTemValorCanasta() != null && this.getTemValorCanasta().longValue() == -999) {
            conditions += " AND TEM_VALOR_CANASTA IS NULL";
        } else if (this.getTemValorCanasta() != null) {
            conditions += " AND TEM_VALOR_CANASTA = ?";
            values.add(this.getTemValorCanasta());
        }

        if (this.getTemValorActivos() != null && this.getTemValorActivos().longValue() == -999) {
            conditions += " AND TEM_VALOR_ACTIVOS IS NULL";
        } else if (this.getTemValorActivos() != null) {
            conditions += " AND TEM_VALOR_ACTIVOS = ?";
            values.add(this.getTemValorActivos());
        }

        if (this.getTemNumUnidad() != null && this.getTemNumUnidad().longValue() == -999) {
            conditions += " AND TEM_NUM_UNIDAD IS NULL";
        } else if (this.getTemNumUnidad() != null) {
            conditions += " AND TEM_NUM_UNIDAD = ?";
            values.add(this.getTemNumUnidad());
        }

        if (this.getTemCuentaGastos() != null && this.getTemCuentaGastos().longValue() == -999) {
            conditions += " AND TEM_CUENTA_GASTOS IS NULL";
        } else if (this.getTemCuentaGastos() != null) {
            conditions += " AND TEM_CUENTA_GASTOS = ?";
            values.add(this.getTemCuentaGastos());
        }

        if (this.getTemNumUnidades() != null && this.getTemNumUnidades().longValue() == -999) {
            conditions += " AND TEM_NUM_UNIDADES IS NULL";
        } else if (this.getTemNumUnidades() != null) {
            conditions += " AND TEM_NUM_UNIDADES = ?";
            values.add(this.getTemNumUnidades());
        }

        if (this.getTemNumTracs() != null && this.getTemNumTracs().longValue() == -999) {
            conditions += " AND TEM_NUM_TRACS IS NULL";
        } else if (this.getTemNumTracs() != null) {
            conditions += " AND TEM_NUM_TRACS = ?";
            values.add(this.getTemNumTracs());
        }

        if (this.getTemPrecioCer() != null && this.getTemPrecioCer().longValue() == -999) {
            conditions += " AND TEM_PRECIO_CER IS NULL";
        } else if (this.getTemPrecioCer() != null) {
            conditions += " AND TEM_PRECIO_CER = ?";
            values.add(this.getTemPrecioCer());
        }

        if (this.getTemPrecioTra() != null && this.getTemPrecioTra().longValue() == -999) {
            conditions += " AND TEM_PRECIO_TRA IS NULL";
        } else if (this.getTemPrecioTra() != null) {
            conditions += " AND TEM_PRECIO_TRA = ?";
            values.add(this.getTemPrecioTra());
        }

        if (this.getTemStatus() != null && "null".equals(this.getTemStatus())) {
            conditions += " AND TEM_STATUS IS NULL";
        } else if (this.getTemStatus() != null) {
            conditions += " AND TEM_STATUS = ?";
            values.add(this.getTemStatus());
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
        String sql = "UPDATE F_TRACK SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TEN_NUM_FISO = ?";
        pkValues.add(this.getTenNumFiso());
        conditions += " AND TEM_ID_PIZARRA = ?";
        pkValues.add(this.getTemIdPizarra());
        conditions += " AND TEM_ID_SERIE = ?";
        pkValues.add(this.getTemIdSerie());
        conditions += " AND TEM_ID_CUPON = ?";
        pkValues.add(this.getTemIdCupon());
        conditions += " AND TEM_ID_FOLIO = ?";
        pkValues.add(this.getTemIdFolio());
        fields += " TEM_FEC_MOVTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getTemFecMovto());
        fields += " TEM_CER_CIRCULACION = ?, ";
        values.add(this.getTemCerCirculacion());
        fields += " TEM_CER_CREADOS = ?, ";
        values.add(this.getTemCerCreados());
        fields += " TEM_CER_REDIMIDOS = ?, ";
        values.add(this.getTemCerRedimidos());
        fields += " TEM_PRECIO_TEORICO = ?, ";
        values.add(this.getTemPrecioTeorico());
        fields += " TEM_VALOR_CANASTA = ?, ";
        values.add(this.getTemValorCanasta());
        fields += " TEM_VALOR_ACTIVOS = ?, ";
        values.add(this.getTemValorActivos());
        fields += " TEM_NUM_UNIDAD = ?, ";
        values.add(this.getTemNumUnidad());
        fields += " TEM_CUENTA_GASTOS = ?, ";
        values.add(this.getTemCuentaGastos());
        fields += " TEM_NUM_UNIDADES = ?, ";
        values.add(this.getTemNumUnidades());
        fields += " TEM_NUM_TRACS = ?, ";
        values.add(this.getTemNumTracs());
        fields += " TEM_PRECIO_CER = ?, ";
        values.add(this.getTemPrecioCer());
        fields += " TEM_PRECIO_TRA = ?, ";
        values.add(this.getTemPrecioTra());
        fields += " TEM_STATUS = ?, ";
        values.add(this.getTemStatus());
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
        String sql = "INSERT INTO F_TRACK ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TEN_NUM_FISO";
        fieldValues += ", ?";
        values.add(this.getTenNumFiso());

        fields += ", TEM_ID_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getTemIdPizarra());

        fields += ", TEM_ID_SERIE";
        fieldValues += ", ?";
        values.add(this.getTemIdSerie());

        fields += ", TEM_ID_CUPON";
        fieldValues += ", ?";
        values.add(this.getTemIdCupon());

        fields += ", TEM_ID_FOLIO";
        fieldValues += ", ?";
        values.add(this.getTemIdFolio());

        fields += ", TEM_FEC_MOVTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getTemFecMovto());

        fields += ", TEM_CER_CIRCULACION";
        fieldValues += ", ?";
        values.add(this.getTemCerCirculacion());

        fields += ", TEM_CER_CREADOS";
        fieldValues += ", ?";
        values.add(this.getTemCerCreados());

        fields += ", TEM_CER_REDIMIDOS";
        fieldValues += ", ?";
        values.add(this.getTemCerRedimidos());

        fields += ", TEM_PRECIO_TEORICO";
        fieldValues += ", ?";
        values.add(this.getTemPrecioTeorico());

        fields += ", TEM_VALOR_CANASTA";
        fieldValues += ", ?";
        values.add(this.getTemValorCanasta());

        fields += ", TEM_VALOR_ACTIVOS";
        fieldValues += ", ?";
        values.add(this.getTemValorActivos());

        fields += ", TEM_NUM_UNIDAD";
        fieldValues += ", ?";
        values.add(this.getTemNumUnidad());

        fields += ", TEM_CUENTA_GASTOS";
        fieldValues += ", ?";
        values.add(this.getTemCuentaGastos());

        fields += ", TEM_NUM_UNIDADES";
        fieldValues += ", ?";
        values.add(this.getTemNumUnidades());

        fields += ", TEM_NUM_TRACS";
        fieldValues += ", ?";
        values.add(this.getTemNumTracs());

        fields += ", TEM_PRECIO_CER";
        fieldValues += ", ?";
        values.add(this.getTemPrecioCer());

        fields += ", TEM_PRECIO_TRA";
        fieldValues += ", ?";
        values.add(this.getTemPrecioTra());

        fields += ", TEM_STATUS";
        fieldValues += ", ?";
        values.add(this.getTemStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_TRACK WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TEN_NUM_FISO = ?";
        values.add(this.getTenNumFiso());
        conditions += " AND TEM_ID_PIZARRA = ?";
        values.add(this.getTemIdPizarra());
        conditions += " AND TEM_ID_SERIE = ?";
        values.add(this.getTemIdSerie());
        conditions += " AND TEM_ID_CUPON = ?";
        values.add(this.getTemIdCupon());
        conditions += " AND TEM_ID_FOLIO = ?";
        values.add(this.getTemIdFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FTrack instance = (FTrack) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTenNumFiso().equals(instance.getTenNumFiso()))
            equalObjects = false;
        if (equalObjects && !this.getTemIdPizarra().equals(instance.getTemIdPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getTemIdSerie().equals(instance.getTemIdSerie()))
            equalObjects = false;
        if (equalObjects && !this.getTemIdCupon().equals(instance.getTemIdCupon()))
            equalObjects = false;
        if (equalObjects && !this.getTemIdFolio().equals(instance.getTemIdFolio()))
            equalObjects = false;
        if (equalObjects && !this.getTemFecMovto().equals(instance.getTemFecMovto()))
            equalObjects = false;
        if (equalObjects && !this.getTemCerCirculacion().equals(instance.getTemCerCirculacion()))
            equalObjects = false;
        if (equalObjects && !this.getTemCerCreados().equals(instance.getTemCerCreados()))
            equalObjects = false;
        if (equalObjects && !this.getTemCerRedimidos().equals(instance.getTemCerRedimidos()))
            equalObjects = false;
        if (equalObjects && !this.getTemPrecioTeorico().equals(instance.getTemPrecioTeorico()))
            equalObjects = false;
        if (equalObjects && !this.getTemValorCanasta().equals(instance.getTemValorCanasta()))
            equalObjects = false;
        if (equalObjects && !this.getTemValorActivos().equals(instance.getTemValorActivos()))
            equalObjects = false;
        if (equalObjects && !this.getTemNumUnidad().equals(instance.getTemNumUnidad()))
            equalObjects = false;
        if (equalObjects && !this.getTemCuentaGastos().equals(instance.getTemCuentaGastos()))
            equalObjects = false;
        if (equalObjects && !this.getTemNumUnidades().equals(instance.getTemNumUnidades()))
            equalObjects = false;
        if (equalObjects && !this.getTemNumTracs().equals(instance.getTemNumTracs()))
            equalObjects = false;
        if (equalObjects && !this.getTemPrecioCer().equals(instance.getTemPrecioCer()))
            equalObjects = false;
        if (equalObjects && !this.getTemPrecioTra().equals(instance.getTemPrecioTra()))
            equalObjects = false;
        if (equalObjects && !this.getTemStatus().equals(instance.getTemStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FTrack result = new FTrack();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTenNumFiso((BigDecimal) objectData.getData("TEN_NUM_FISO"));
        result.setTemIdPizarra((String) objectData.getData("TEM_ID_PIZARRA"));
        result.setTemIdSerie((String) objectData.getData("TEM_ID_SERIE"));
        result.setTemIdCupon((BigDecimal) objectData.getData("TEM_ID_CUPON"));
        result.setTemIdFolio((BigDecimal) objectData.getData("TEM_ID_FOLIO"));
        result.setTemFecMovto((String) objectData.getData("TEM_FEC_MOVTO"));
        result.setTemCerCirculacion((BigDecimal) objectData.getData("TEM_CER_CIRCULACION"));
        result.setTemCerCreados((BigDecimal) objectData.getData("TEM_CER_CREADOS"));
        result.setTemCerRedimidos((BigDecimal) objectData.getData("TEM_CER_REDIMIDOS"));
        result.setTemPrecioTeorico((BigDecimal) objectData.getData("TEM_PRECIO_TEORICO"));
        result.setTemValorCanasta((BigDecimal) objectData.getData("TEM_VALOR_CANASTA"));
        result.setTemValorActivos((BigDecimal) objectData.getData("TEM_VALOR_ACTIVOS"));
        result.setTemNumUnidad((BigDecimal) objectData.getData("TEM_NUM_UNIDAD"));
        result.setTemCuentaGastos((BigDecimal) objectData.getData("TEM_CUENTA_GASTOS"));
        result.setTemNumUnidades((BigDecimal) objectData.getData("TEM_NUM_UNIDADES"));
        result.setTemNumTracs((BigDecimal) objectData.getData("TEM_NUM_TRACS"));
        result.setTemPrecioCer((BigDecimal) objectData.getData("TEM_PRECIO_CER"));
        result.setTemPrecioTra((BigDecimal) objectData.getData("TEM_PRECIO_TRA"));
        result.setTemStatus((String) objectData.getData("TEM_STATUS"));

        return result;

    }

}
