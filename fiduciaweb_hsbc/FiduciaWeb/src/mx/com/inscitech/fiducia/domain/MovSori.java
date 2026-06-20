package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "MOV_SORI_PK", columns = { "MSO_NUM_REGISTROS" }, sequences = { "MAX" })
public class MovSori extends DomainObject {

    BigDecimal msoNumRegistros = null;
    BigDecimal msoTipo = null;
    BigDecimal msoArea = null;
    String msoNomPersFid = null;
    String msoFechaOpera = null;
    String msoRfc = null;
    BigDecimal msoNumMoneda = null;
    BigDecimal msoImporte = null;
    String msoFormaPago = null;
    BigDecimal msoFolioOpera = null;
    BigDecimal msoTipoMov = null;

    public MovSori() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMsoNumRegistros(BigDecimal msoNumRegistros) {
        this.msoNumRegistros = msoNumRegistros;
    }

    public BigDecimal getMsoNumRegistros() {
        return this.msoNumRegistros;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setMsoTipo(BigDecimal msoTipo) {
        this.msoTipo = msoTipo;
    }

    public BigDecimal getMsoTipo() {
        return this.msoTipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMsoArea(BigDecimal msoArea) {
        this.msoArea = msoArea;
    }

    public BigDecimal getMsoArea() {
        return this.msoArea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMsoNomPersFid(String msoNomPersFid) {
        this.msoNomPersFid = msoNomPersFid;
    }

    public String getMsoNomPersFid() {
        return this.msoNomPersFid;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setMsoFechaOpera(String msoFechaOpera) {
        this.msoFechaOpera = msoFechaOpera;
    }

    public String getMsoFechaOpera() {
        return this.msoFechaOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMsoRfc(String msoRfc) {
        this.msoRfc = msoRfc;
    }

    public String getMsoRfc() {
        return this.msoRfc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMsoNumMoneda(BigDecimal msoNumMoneda) {
        this.msoNumMoneda = msoNumMoneda;
    }

    public BigDecimal getMsoNumMoneda() {
        return this.msoNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setMsoImporte(BigDecimal msoImporte) {
        this.msoImporte = msoImporte;
    }

    public BigDecimal getMsoImporte() {
        return this.msoImporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMsoFormaPago(String msoFormaPago) {
        this.msoFormaPago = msoFormaPago;
    }

    public String getMsoFormaPago() {
        return this.msoFormaPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMsoFolioOpera(BigDecimal msoFolioOpera) {
        this.msoFolioOpera = msoFolioOpera;
    }

    public BigDecimal getMsoFolioOpera() {
        return this.msoFolioOpera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMsoTipoMov(BigDecimal msoTipoMov) {
        this.msoTipoMov = msoTipoMov;
    }

    public BigDecimal getMsoTipoMov() {
        return this.msoTipoMov;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM MOV_SORI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMsoNumRegistros() != null && this.getMsoNumRegistros().longValue() == -999) {
            conditions += " AND MSO_NUM_REGISTROS IS NULL";
        } else if (this.getMsoNumRegistros() != null) {
            conditions += " AND MSO_NUM_REGISTROS = ?";
            values.add(this.getMsoNumRegistros());
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
        String sql = "SELECT * FROM MOV_SORI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMsoNumRegistros() != null && this.getMsoNumRegistros().longValue() == -999) {
            conditions += " AND MSO_NUM_REGISTROS IS NULL";
        } else if (this.getMsoNumRegistros() != null) {
            conditions += " AND MSO_NUM_REGISTROS = ?";
            values.add(this.getMsoNumRegistros());
        }

        if (this.getMsoTipo() != null && this.getMsoTipo().longValue() == -999) {
            conditions += " AND MSO_TIPO IS NULL";
        } else if (this.getMsoTipo() != null) {
            conditions += " AND MSO_TIPO = ?";
            values.add(this.getMsoTipo());
        }

        if (this.getMsoArea() != null && this.getMsoArea().longValue() == -999) {
            conditions += " AND MSO_AREA IS NULL";
        } else if (this.getMsoArea() != null) {
            conditions += " AND MSO_AREA = ?";
            values.add(this.getMsoArea());
        }

        if (this.getMsoNomPersFid() != null && "null".equals(this.getMsoNomPersFid())) {
            conditions += " AND MSO_NOM_PERS_FID IS NULL";
        } else if (this.getMsoNomPersFid() != null) {
            conditions += " AND MSO_NOM_PERS_FID = ?";
            values.add(this.getMsoNomPersFid());
        }

        if (this.getMsoFechaOpera() != null && "null".equals(this.getMsoFechaOpera())) {
            conditions += " AND MSO_FECHA_OPERA IS NULL";
        } else if (this.getMsoFechaOpera() != null) {
            conditions += " AND MSO_FECHA_OPERA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getMsoFechaOpera());
        }

        if (this.getMsoRfc() != null && "null".equals(this.getMsoRfc())) {
            conditions += " AND MSO_RFC IS NULL";
        } else if (this.getMsoRfc() != null) {
            conditions += " AND MSO_RFC = ?";
            values.add(this.getMsoRfc());
        }

        if (this.getMsoNumMoneda() != null && this.getMsoNumMoneda().longValue() == -999) {
            conditions += " AND MSO_NUM_MONEDA IS NULL";
        } else if (this.getMsoNumMoneda() != null) {
            conditions += " AND MSO_NUM_MONEDA = ?";
            values.add(this.getMsoNumMoneda());
        }

        if (this.getMsoImporte() != null && this.getMsoImporte().longValue() == -999) {
            conditions += " AND MSO_IMPORTE IS NULL";
        } else if (this.getMsoImporte() != null) {
            conditions += " AND MSO_IMPORTE = ?";
            values.add(this.getMsoImporte());
        }

        if (this.getMsoFormaPago() != null && "null".equals(this.getMsoFormaPago())) {
            conditions += " AND MSO_FORMA_PAGO IS NULL";
        } else if (this.getMsoFormaPago() != null) {
            conditions += " AND MSO_FORMA_PAGO = ?";
            values.add(this.getMsoFormaPago());
        }

        if (this.getMsoFolioOpera() != null && this.getMsoFolioOpera().longValue() == -999) {
            conditions += " AND MSO_FOLIO_OPERA IS NULL";
        } else if (this.getMsoFolioOpera() != null) {
            conditions += " AND MSO_FOLIO_OPERA = ?";
            values.add(this.getMsoFolioOpera());
        }

        if (this.getMsoTipoMov() != null && this.getMsoTipoMov().longValue() == -999) {
            conditions += " AND MSO_TIPO_MOV IS NULL";
        } else if (this.getMsoTipoMov() != null) {
            conditions += " AND MSO_TIPO_MOV = ?";
            values.add(this.getMsoTipoMov());
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
        String sql = "UPDATE MOV_SORI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND MSO_NUM_REGISTROS = ?";
        pkValues.add(this.getMsoNumRegistros());
        fields += " MSO_TIPO = ?, ";
        values.add(this.getMsoTipo());
        fields += " MSO_AREA = ?, ";
        values.add(this.getMsoArea());
        fields += " MSO_NOM_PERS_FID = ?, ";
        values.add(this.getMsoNomPersFid());
        fields += " MSO_FECHA_OPERA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getMsoFechaOpera());
        fields += " MSO_RFC = ?, ";
        values.add(this.getMsoRfc());
        fields += " MSO_NUM_MONEDA = ?, ";
        values.add(this.getMsoNumMoneda());
        fields += " MSO_IMPORTE = ?, ";
        values.add(this.getMsoImporte());
        fields += " MSO_FORMA_PAGO = ?, ";
        values.add(this.getMsoFormaPago());
        fields += " MSO_FOLIO_OPERA = ?, ";
        values.add(this.getMsoFolioOpera());
        fields += " MSO_TIPO_MOV = ?, ";
        values.add(this.getMsoTipoMov());
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
        String sql = "INSERT INTO MOV_SORI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", MSO_NUM_REGISTROS";
        fieldValues += ", ?";
        values.add(this.getMsoNumRegistros());

        fields += ", MSO_TIPO";
        fieldValues += ", ?";
        values.add(this.getMsoTipo());

        fields += ", MSO_AREA";
        fieldValues += ", ?";
        values.add(this.getMsoArea());

        fields += ", MSO_NOM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getMsoNomPersFid());

        fields += ", MSO_FECHA_OPERA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getMsoFechaOpera());

        fields += ", MSO_RFC";
        fieldValues += ", ?";
        values.add(this.getMsoRfc());

        fields += ", MSO_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getMsoNumMoneda());

        fields += ", MSO_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getMsoImporte());

        fields += ", MSO_FORMA_PAGO";
        fieldValues += ", ?";
        values.add(this.getMsoFormaPago());

        fields += ", MSO_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getMsoFolioOpera());

        fields += ", MSO_TIPO_MOV";
        fieldValues += ", ?";
        values.add(this.getMsoTipoMov());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM MOV_SORI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND MSO_NUM_REGISTROS = ?";
        values.add(this.getMsoNumRegistros());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        MovSori instance = (MovSori) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getMsoNumRegistros().equals(instance.getMsoNumRegistros()))
            equalObjects = false;
        if (equalObjects && !this.getMsoTipo().equals(instance.getMsoTipo()))
            equalObjects = false;
        if (equalObjects && !this.getMsoArea().equals(instance.getMsoArea()))
            equalObjects = false;
        if (equalObjects && !this.getMsoNomPersFid().equals(instance.getMsoNomPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getMsoFechaOpera().equals(instance.getMsoFechaOpera()))
            equalObjects = false;
        if (equalObjects && !this.getMsoRfc().equals(instance.getMsoRfc()))
            equalObjects = false;
        if (equalObjects && !this.getMsoNumMoneda().equals(instance.getMsoNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getMsoImporte().equals(instance.getMsoImporte()))
            equalObjects = false;
        if (equalObjects && !this.getMsoFormaPago().equals(instance.getMsoFormaPago()))
            equalObjects = false;
        if (equalObjects && !this.getMsoFolioOpera().equals(instance.getMsoFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getMsoTipoMov().equals(instance.getMsoTipoMov()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        MovSori result = new MovSori();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setMsoNumRegistros((BigDecimal) objectData.getData("MSO_NUM_REGISTROS"));
        result.setMsoTipo((BigDecimal) objectData.getData("MSO_TIPO"));
        result.setMsoArea((BigDecimal) objectData.getData("MSO_AREA"));
        result.setMsoNomPersFid((String) objectData.getData("MSO_NOM_PERS_FID"));
        result.setMsoFechaOpera((String) objectData.getData("MSO_FECHA_OPERA"));
        result.setMsoRfc((String) objectData.getData("MSO_RFC"));
        result.setMsoNumMoneda((BigDecimal) objectData.getData("MSO_NUM_MONEDA"));
        result.setMsoImporte((BigDecimal) objectData.getData("MSO_IMPORTE"));
        result.setMsoFormaPago((String) objectData.getData("MSO_FORMA_PAGO"));
        result.setMsoFolioOpera((BigDecimal) objectData.getData("MSO_FOLIO_OPERA"));
        result.setMsoTipoMov((BigDecimal) objectData.getData("MSO_TIPO_MOV"));

        return result;

    }

}
