package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TRASPINTERFID_PK", columns = { "TIF_USUARIO", "TIF_CTO_ORIGEN", "TIF_CTO_INTER_ORIGEN", "TIF_CTO_DESTINO", "TIF_CTO_INTER_DESTINO" },
            sequences = { "MANUAL" })
public class Traspinterfid extends DomainObject {

    BigDecimal tifUsuario = null;
    BigDecimal tifCtoOrigen = null;
    BigDecimal tifCtoInterOrigen = null;
    BigDecimal tifCtoDestino = null;
    BigDecimal tifCtoInterDestino = null;

    public Traspinterfid() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTifUsuario(BigDecimal tifUsuario) {
        this.tifUsuario = tifUsuario;
    }

    public BigDecimal getTifUsuario() {
        return this.tifUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTifCtoOrigen(BigDecimal tifCtoOrigen) {
        this.tifCtoOrigen = tifCtoOrigen;
    }

    public BigDecimal getTifCtoOrigen() {
        return this.tifCtoOrigen;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTifCtoInterOrigen(BigDecimal tifCtoInterOrigen) {
        this.tifCtoInterOrigen = tifCtoInterOrigen;
    }

    public BigDecimal getTifCtoInterOrigen() {
        return this.tifCtoInterOrigen;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTifCtoDestino(BigDecimal tifCtoDestino) {
        this.tifCtoDestino = tifCtoDestino;
    }

    public BigDecimal getTifCtoDestino() {
        return this.tifCtoDestino;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTifCtoInterDestino(BigDecimal tifCtoInterDestino) {
        this.tifCtoInterDestino = tifCtoInterDestino;
    }

    public BigDecimal getTifCtoInterDestino() {
        return this.tifCtoInterDestino;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TRASPINTERFID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTifUsuario() != null && this.getTifUsuario().longValue() == -999) {
            conditions += " AND TIF_USUARIO IS NULL";
        } else if (this.getTifUsuario() != null) {
            conditions += " AND TIF_USUARIO = ?";
            values.add(this.getTifUsuario());
        }

        if (this.getTifCtoOrigen() != null && this.getTifCtoOrigen().longValue() == -999) {
            conditions += " AND TIF_CTO_ORIGEN IS NULL";
        } else if (this.getTifCtoOrigen() != null) {
            conditions += " AND TIF_CTO_ORIGEN = ?";
            values.add(this.getTifCtoOrigen());
        }

        if (this.getTifCtoInterOrigen() != null && this.getTifCtoInterOrigen().longValue() == -999) {
            conditions += " AND TIF_CTO_INTER_ORIGEN IS NULL";
        } else if (this.getTifCtoInterOrigen() != null) {
            conditions += " AND TIF_CTO_INTER_ORIGEN = ?";
            values.add(this.getTifCtoInterOrigen());
        }

        if (this.getTifCtoDestino() != null && this.getTifCtoDestino().longValue() == -999) {
            conditions += " AND TIF_CTO_DESTINO IS NULL";
        } else if (this.getTifCtoDestino() != null) {
            conditions += " AND TIF_CTO_DESTINO = ?";
            values.add(this.getTifCtoDestino());
        }

        if (this.getTifCtoInterDestino() != null && this.getTifCtoInterDestino().longValue() == -999) {
            conditions += " AND TIF_CTO_INTER_DESTINO IS NULL";
        } else if (this.getTifCtoInterDestino() != null) {
            conditions += " AND TIF_CTO_INTER_DESTINO = ?";
            values.add(this.getTifCtoInterDestino());
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
        String sql = "SELECT * FROM TRASPINTERFID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTifUsuario() != null && this.getTifUsuario().longValue() == -999) {
            conditions += " AND TIF_USUARIO IS NULL";
        } else if (this.getTifUsuario() != null) {
            conditions += " AND TIF_USUARIO = ?";
            values.add(this.getTifUsuario());
        }

        if (this.getTifCtoOrigen() != null && this.getTifCtoOrigen().longValue() == -999) {
            conditions += " AND TIF_CTO_ORIGEN IS NULL";
        } else if (this.getTifCtoOrigen() != null) {
            conditions += " AND TIF_CTO_ORIGEN = ?";
            values.add(this.getTifCtoOrigen());
        }

        if (this.getTifCtoInterOrigen() != null && this.getTifCtoInterOrigen().longValue() == -999) {
            conditions += " AND TIF_CTO_INTER_ORIGEN IS NULL";
        } else if (this.getTifCtoInterOrigen() != null) {
            conditions += " AND TIF_CTO_INTER_ORIGEN = ?";
            values.add(this.getTifCtoInterOrigen());
        }

        if (this.getTifCtoDestino() != null && this.getTifCtoDestino().longValue() == -999) {
            conditions += " AND TIF_CTO_DESTINO IS NULL";
        } else if (this.getTifCtoDestino() != null) {
            conditions += " AND TIF_CTO_DESTINO = ?";
            values.add(this.getTifCtoDestino());
        }

        if (this.getTifCtoInterDestino() != null && this.getTifCtoInterDestino().longValue() == -999) {
            conditions += " AND TIF_CTO_INTER_DESTINO IS NULL";
        } else if (this.getTifCtoInterDestino() != null) {
            conditions += " AND TIF_CTO_INTER_DESTINO = ?";
            values.add(this.getTifCtoInterDestino());
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
        String sql = "UPDATE TRASPINTERFID SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TIF_USUARIO = ?";
        pkValues.add(this.getTifUsuario());
        conditions += " AND TIF_CTO_ORIGEN = ?";
        pkValues.add(this.getTifCtoOrigen());
        conditions += " AND TIF_CTO_INTER_ORIGEN = ?";
        pkValues.add(this.getTifCtoInterOrigen());
        conditions += " AND TIF_CTO_DESTINO = ?";
        pkValues.add(this.getTifCtoDestino());
        conditions += " AND TIF_CTO_INTER_DESTINO = ?";
        pkValues.add(this.getTifCtoInterDestino());
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
        String sql = "INSERT INTO TRASPINTERFID ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TIF_USUARIO";
        fieldValues += ", ?";
        values.add(this.getTifUsuario());

        fields += ", TIF_CTO_ORIGEN";
        fieldValues += ", ?";
        values.add(this.getTifCtoOrigen());

        fields += ", TIF_CTO_INTER_ORIGEN";
        fieldValues += ", ?";
        values.add(this.getTifCtoInterOrigen());

        fields += ", TIF_CTO_DESTINO";
        fieldValues += ", ?";
        values.add(this.getTifCtoDestino());

        fields += ", TIF_CTO_INTER_DESTINO";
        fieldValues += ", ?";
        values.add(this.getTifCtoInterDestino());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TRASPINTERFID WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TIF_USUARIO = ?";
        values.add(this.getTifUsuario());
        conditions += " AND TIF_CTO_ORIGEN = ?";
        values.add(this.getTifCtoOrigen());
        conditions += " AND TIF_CTO_INTER_ORIGEN = ?";
        values.add(this.getTifCtoInterOrigen());
        conditions += " AND TIF_CTO_DESTINO = ?";
        values.add(this.getTifCtoDestino());
        conditions += " AND TIF_CTO_INTER_DESTINO = ?";
        values.add(this.getTifCtoInterDestino());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Traspinterfid instance = (Traspinterfid) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTifUsuario().equals(instance.getTifUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getTifCtoOrigen().equals(instance.getTifCtoOrigen()))
            equalObjects = false;
        if (equalObjects && !this.getTifCtoInterOrigen().equals(instance.getTifCtoInterOrigen()))
            equalObjects = false;
        if (equalObjects && !this.getTifCtoDestino().equals(instance.getTifCtoDestino()))
            equalObjects = false;
        if (equalObjects && !this.getTifCtoInterDestino().equals(instance.getTifCtoInterDestino()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Traspinterfid result = new Traspinterfid();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTifUsuario((BigDecimal) objectData.getData("TIF_USUARIO"));
        result.setTifCtoOrigen((BigDecimal) objectData.getData("TIF_CTO_ORIGEN"));
        result.setTifCtoInterOrigen((BigDecimal) objectData.getData("TIF_CTO_INTER_ORIGEN"));
        result.setTifCtoDestino((BigDecimal) objectData.getData("TIF_CTO_DESTINO"));
        result.setTifCtoInterDestino((BigDecimal) objectData.getData("TIF_CTO_INTER_DESTINO"));

        return result;

    }

}
