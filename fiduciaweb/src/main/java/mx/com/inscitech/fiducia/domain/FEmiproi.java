package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIPROI_PK", columns = { "EEPI_ID_PROGRAMA", "EEPI_ID_FIDEICOMISO", "EEPI_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmiproi extends DomainObject {

    BigDecimal eepiIdPrograma = null;
    BigDecimal eepiIdFideicomiso = null;
    BigDecimal eepiIdEmision = null;
    BigDecimal eepiProtInflacion = null;
    String eepiPeriodoCalculo = null;
    BigDecimal eepiNumMonedaInfla = null;
    String eepiStEmiproi = null;

    public FEmiproi() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepiIdPrograma(BigDecimal eepiIdPrograma) {
        this.eepiIdPrograma = eepiIdPrograma;
    }

    public BigDecimal getEepiIdPrograma() {
        return this.eepiIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepiIdFideicomiso(BigDecimal eepiIdFideicomiso) {
        this.eepiIdFideicomiso = eepiIdFideicomiso;
    }

    public BigDecimal getEepiIdFideicomiso() {
        return this.eepiIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepiIdEmision(BigDecimal eepiIdEmision) {
        this.eepiIdEmision = eepiIdEmision;
    }

    public BigDecimal getEepiIdEmision() {
        return this.eepiIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepiProtInflacion(BigDecimal eepiProtInflacion) {
        this.eepiProtInflacion = eepiProtInflacion;
    }

    public BigDecimal getEepiProtInflacion() {
        return this.eepiProtInflacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEepiPeriodoCalculo(String eepiPeriodoCalculo) {
        this.eepiPeriodoCalculo = eepiPeriodoCalculo;
    }

    public String getEepiPeriodoCalculo() {
        return this.eepiPeriodoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepiNumMonedaInfla(BigDecimal eepiNumMonedaInfla) {
        this.eepiNumMonedaInfla = eepiNumMonedaInfla;
    }

    public BigDecimal getEepiNumMonedaInfla() {
        return this.eepiNumMonedaInfla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEepiStEmiproi(String eepiStEmiproi) {
        this.eepiStEmiproi = eepiStEmiproi;
    }

    public String getEepiStEmiproi() {
        return this.eepiStEmiproi;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIPROI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEepiIdPrograma() != null && this.getEepiIdPrograma().longValue() == -999) {
            conditions += " AND EEPI_ID_PROGRAMA IS NULL";
        } else if (this.getEepiIdPrograma() != null) {
            conditions += " AND EEPI_ID_PROGRAMA = ?";
            values.add(this.getEepiIdPrograma());
        }

        if (this.getEepiIdFideicomiso() != null && this.getEepiIdFideicomiso().longValue() == -999) {
            conditions += " AND EEPI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEepiIdFideicomiso() != null) {
            conditions += " AND EEPI_ID_FIDEICOMISO = ?";
            values.add(this.getEepiIdFideicomiso());
        }

        if (this.getEepiIdEmision() != null && this.getEepiIdEmision().longValue() == -999) {
            conditions += " AND EEPI_ID_EMISION IS NULL";
        } else if (this.getEepiIdEmision() != null) {
            conditions += " AND EEPI_ID_EMISION = ?";
            values.add(this.getEepiIdEmision());
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
        String sql = "SELECT * FROM F_EMIPROI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEepiIdPrograma() != null && this.getEepiIdPrograma().longValue() == -999) {
            conditions += " AND EEPI_ID_PROGRAMA IS NULL";
        } else if (this.getEepiIdPrograma() != null) {
            conditions += " AND EEPI_ID_PROGRAMA = ?";
            values.add(this.getEepiIdPrograma());
        }

        if (this.getEepiIdFideicomiso() != null && this.getEepiIdFideicomiso().longValue() == -999) {
            conditions += " AND EEPI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEepiIdFideicomiso() != null) {
            conditions += " AND EEPI_ID_FIDEICOMISO = ?";
            values.add(this.getEepiIdFideicomiso());
        }

        if (this.getEepiIdEmision() != null && this.getEepiIdEmision().longValue() == -999) {
            conditions += " AND EEPI_ID_EMISION IS NULL";
        } else if (this.getEepiIdEmision() != null) {
            conditions += " AND EEPI_ID_EMISION = ?";
            values.add(this.getEepiIdEmision());
        }

        if (this.getEepiProtInflacion() != null && this.getEepiProtInflacion().longValue() == -999) {
            conditions += " AND EEPI_PROT_INFLACION IS NULL";
        } else if (this.getEepiProtInflacion() != null) {
            conditions += " AND EEPI_PROT_INFLACION = ?";
            values.add(this.getEepiProtInflacion());
        }

        if (this.getEepiPeriodoCalculo() != null && "null".equals(this.getEepiPeriodoCalculo())) {
            conditions += " AND EEPI_PERIODO_CALCULO IS NULL";
        } else if (this.getEepiPeriodoCalculo() != null) {
            conditions += " AND EEPI_PERIODO_CALCULO = ?";
            values.add(this.getEepiPeriodoCalculo());
        }

        if (this.getEepiNumMonedaInfla() != null && this.getEepiNumMonedaInfla().longValue() == -999) {
            conditions += " AND EEPI_NUM_MONEDA_INFLA IS NULL";
        } else if (this.getEepiNumMonedaInfla() != null) {
            conditions += " AND EEPI_NUM_MONEDA_INFLA = ?";
            values.add(this.getEepiNumMonedaInfla());
        }

        if (this.getEepiStEmiproi() != null && "null".equals(this.getEepiStEmiproi())) {
            conditions += " AND EEPI_ST_EMIPROI IS NULL";
        } else if (this.getEepiStEmiproi() != null) {
            conditions += " AND EEPI_ST_EMIPROI = ?";
            values.add(this.getEepiStEmiproi());
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
        String sql = "UPDATE F_EMIPROI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEPI_ID_PROGRAMA = ?";
        pkValues.add(this.getEepiIdPrograma());
        conditions += " AND EEPI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEepiIdFideicomiso());
        conditions += " AND EEPI_ID_EMISION = ?";
        pkValues.add(this.getEepiIdEmision());
        fields += " EEPI_PROT_INFLACION = ?, ";
        values.add(this.getEepiProtInflacion());
        fields += " EEPI_PERIODO_CALCULO = ?, ";
        values.add(this.getEepiPeriodoCalculo());
        fields += " EEPI_NUM_MONEDA_INFLA = ?, ";
        values.add(this.getEepiNumMonedaInfla());
        fields += " EEPI_ST_EMIPROI = ?, ";
        values.add(this.getEepiStEmiproi());
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
        String sql = "INSERT INTO F_EMIPROI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEPI_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEepiIdPrograma());

        fields += ", EEPI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEepiIdFideicomiso());

        fields += ", EEPI_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEepiIdEmision());

        fields += ", EEPI_PROT_INFLACION";
        fieldValues += ", ?";
        values.add(this.getEepiProtInflacion());

        fields += ", EEPI_PERIODO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEepiPeriodoCalculo());

        fields += ", EEPI_NUM_MONEDA_INFLA";
        fieldValues += ", ?";
        values.add(this.getEepiNumMonedaInfla());

        fields += ", EEPI_ST_EMIPROI";
        fieldValues += ", ?";
        values.add(this.getEepiStEmiproi());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIPROI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEPI_ID_PROGRAMA = ?";
        values.add(this.getEepiIdPrograma());
        conditions += " AND EEPI_ID_FIDEICOMISO = ?";
        values.add(this.getEepiIdFideicomiso());
        conditions += " AND EEPI_ID_EMISION = ?";
        values.add(this.getEepiIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiproi instance = (FEmiproi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEepiIdPrograma().equals(instance.getEepiIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEepiIdFideicomiso().equals(instance.getEepiIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEepiIdEmision().equals(instance.getEepiIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEepiProtInflacion().equals(instance.getEepiProtInflacion()))
            equalObjects = false;
        if (equalObjects && !this.getEepiPeriodoCalculo().equals(instance.getEepiPeriodoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEepiNumMonedaInfla().equals(instance.getEepiNumMonedaInfla()))
            equalObjects = false;
        if (equalObjects && !this.getEepiStEmiproi().equals(instance.getEepiStEmiproi()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiproi result = new FEmiproi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEepiIdPrograma((BigDecimal) objectData.getData("EEPI_ID_PROGRAMA"));
        result.setEepiIdFideicomiso((BigDecimal) objectData.getData("EEPI_ID_FIDEICOMISO"));
        result.setEepiIdEmision((BigDecimal) objectData.getData("EEPI_ID_EMISION"));
        result.setEepiProtInflacion((BigDecimal) objectData.getData("EEPI_PROT_INFLACION"));
        result.setEepiPeriodoCalculo((String) objectData.getData("EEPI_PERIODO_CALCULO"));
        result.setEepiNumMonedaInfla((BigDecimal) objectData.getData("EEPI_NUM_MONEDA_INFLA"));
        result.setEepiStEmiproi((String) objectData.getData("EEPI_ST_EMIPROI"));

        return result;

    }

}
