package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESPERITO_PK", columns = { "EPE_NUM_PERITO", "EPE_NOM_ESPECIALIDAD", "EPE_NUM_REGISTRO" }, sequences = { "MANUAL" })
public class Esperito extends DomainObject {

    BigDecimal epeNumPerito = null;
    String epeNomEspecialidad = null;
    String epeNumRegistro = null;
    String epeOtorgadoPor = null;
    String epeFecIniVig = null;
    String epeFecFinVig = null;
    BigDecimal epeAnoAltaReg = null;
    BigDecimal epeMesAltaReg = null;
    BigDecimal epeDiaAltaReg = null;
    BigDecimal epeAnoUltMod = null;
    BigDecimal epeMesUltMod = null;
    BigDecimal epeDiaUltMod = null;
    String epeCveStEsperito = null;

    public Esperito() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEpeNumPerito(BigDecimal epeNumPerito) {
        this.epeNumPerito = epeNumPerito;
    }

    public BigDecimal getEpeNumPerito() {
        return this.epeNumPerito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpeNomEspecialidad(String epeNomEspecialidad) {
        this.epeNomEspecialidad = epeNomEspecialidad;
    }

    public String getEpeNomEspecialidad() {
        return this.epeNomEspecialidad;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpeNumRegistro(String epeNumRegistro) {
        this.epeNumRegistro = epeNumRegistro;
    }

    public String getEpeNumRegistro() {
        return this.epeNumRegistro;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpeOtorgadoPor(String epeOtorgadoPor) {
        this.epeOtorgadoPor = epeOtorgadoPor;
    }

    public String getEpeOtorgadoPor() {
        return this.epeOtorgadoPor;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpeFecIniVig(String epeFecIniVig) {
        this.epeFecIniVig = epeFecIniVig;
    }

    public String getEpeFecIniVig() {
        return this.epeFecIniVig;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpeFecFinVig(String epeFecFinVig) {
        this.epeFecFinVig = epeFecFinVig;
    }

    public String getEpeFecFinVig() {
        return this.epeFecFinVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpeAnoAltaReg(BigDecimal epeAnoAltaReg) {
        this.epeAnoAltaReg = epeAnoAltaReg;
    }

    public BigDecimal getEpeAnoAltaReg() {
        return this.epeAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpeMesAltaReg(BigDecimal epeMesAltaReg) {
        this.epeMesAltaReg = epeMesAltaReg;
    }

    public BigDecimal getEpeMesAltaReg() {
        return this.epeMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpeDiaAltaReg(BigDecimal epeDiaAltaReg) {
        this.epeDiaAltaReg = epeDiaAltaReg;
    }

    public BigDecimal getEpeDiaAltaReg() {
        return this.epeDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpeAnoUltMod(BigDecimal epeAnoUltMod) {
        this.epeAnoUltMod = epeAnoUltMod;
    }

    public BigDecimal getEpeAnoUltMod() {
        return this.epeAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpeMesUltMod(BigDecimal epeMesUltMod) {
        this.epeMesUltMod = epeMesUltMod;
    }

    public BigDecimal getEpeMesUltMod() {
        return this.epeMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpeDiaUltMod(BigDecimal epeDiaUltMod) {
        this.epeDiaUltMod = epeDiaUltMod;
    }

    public BigDecimal getEpeDiaUltMod() {
        return this.epeDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpeCveStEsperito(String epeCveStEsperito) {
        this.epeCveStEsperito = epeCveStEsperito;
    }

    public String getEpeCveStEsperito() {
        return this.epeCveStEsperito;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESPERITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEpeNumPerito() != null && this.getEpeNumPerito().longValue() == -999) {
            conditions += " AND EPE_NUM_PERITO IS NULL";
        } else if (this.getEpeNumPerito() != null) {
            conditions += " AND EPE_NUM_PERITO = ?";
            values.add(this.getEpeNumPerito());
        }

        if (this.getEpeNomEspecialidad() != null && "null".equals(this.getEpeNomEspecialidad())) {
            conditions += " AND EPE_NOM_ESPECIALIDAD IS NULL";
        } else if (this.getEpeNomEspecialidad() != null) {
            conditions += " AND EPE_NOM_ESPECIALIDAD = ?";
            values.add(this.getEpeNomEspecialidad());
        }

        if (this.getEpeNumRegistro() != null && "null".equals(this.getEpeNumRegistro())) {
            conditions += " AND EPE_NUM_REGISTRO IS NULL";
        } else if (this.getEpeNumRegistro() != null) {
            conditions += " AND EPE_NUM_REGISTRO = ?";
            values.add(this.getEpeNumRegistro());
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
        String sql = "SELECT * FROM ESPERITO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEpeNumPerito() != null && this.getEpeNumPerito().longValue() == -999) {
            conditions += " AND EPE_NUM_PERITO IS NULL";
        } else if (this.getEpeNumPerito() != null) {
            conditions += " AND EPE_NUM_PERITO = ?";
            values.add(this.getEpeNumPerito());
        }

        if (this.getEpeNomEspecialidad() != null && "null".equals(this.getEpeNomEspecialidad())) {
            conditions += " AND EPE_NOM_ESPECIALIDAD IS NULL";
        } else if (this.getEpeNomEspecialidad() != null) {
            conditions += " AND EPE_NOM_ESPECIALIDAD = ?";
            values.add(this.getEpeNomEspecialidad());
        }

        if (this.getEpeNumRegistro() != null && "null".equals(this.getEpeNumRegistro())) {
            conditions += " AND EPE_NUM_REGISTRO IS NULL";
        } else if (this.getEpeNumRegistro() != null) {
            conditions += " AND EPE_NUM_REGISTRO = ?";
            values.add(this.getEpeNumRegistro());
        }

        if (this.getEpeOtorgadoPor() != null && "null".equals(this.getEpeOtorgadoPor())) {
            conditions += " AND EPE_OTORGADO_POR IS NULL";
        } else if (this.getEpeOtorgadoPor() != null) {
            conditions += " AND EPE_OTORGADO_POR = ?";
            values.add(this.getEpeOtorgadoPor());
        }

        if (this.getEpeFecIniVig() != null && "null".equals(this.getEpeFecIniVig())) {
            conditions += " AND EPE_FEC_INI_VIG IS NULL";
        } else if (this.getEpeFecIniVig() != null) {
            conditions += " AND EPE_FEC_INI_VIG = ?";
            values.add(this.getEpeFecIniVig());
        }

        if (this.getEpeFecFinVig() != null && "null".equals(this.getEpeFecFinVig())) {
            conditions += " AND EPE_FEC_FIN_VIG IS NULL";
        } else if (this.getEpeFecFinVig() != null) {
            conditions += " AND EPE_FEC_FIN_VIG = ?";
            values.add(this.getEpeFecFinVig());
        }

        if (this.getEpeAnoAltaReg() != null && this.getEpeAnoAltaReg().longValue() == -999) {
            conditions += " AND EPE_ANO_ALTA_REG IS NULL";
        } else if (this.getEpeAnoAltaReg() != null) {
            conditions += " AND EPE_ANO_ALTA_REG = ?";
            values.add(this.getEpeAnoAltaReg());
        }

        if (this.getEpeMesAltaReg() != null && this.getEpeMesAltaReg().longValue() == -999) {
            conditions += " AND EPE_MES_ALTA_REG IS NULL";
        } else if (this.getEpeMesAltaReg() != null) {
            conditions += " AND EPE_MES_ALTA_REG = ?";
            values.add(this.getEpeMesAltaReg());
        }

        if (this.getEpeDiaAltaReg() != null && this.getEpeDiaAltaReg().longValue() == -999) {
            conditions += " AND EPE_DIA_ALTA_REG IS NULL";
        } else if (this.getEpeDiaAltaReg() != null) {
            conditions += " AND EPE_DIA_ALTA_REG = ?";
            values.add(this.getEpeDiaAltaReg());
        }

        if (this.getEpeAnoUltMod() != null && this.getEpeAnoUltMod().longValue() == -999) {
            conditions += " AND EPE_ANO_ULT_MOD IS NULL";
        } else if (this.getEpeAnoUltMod() != null) {
            conditions += " AND EPE_ANO_ULT_MOD = ?";
            values.add(this.getEpeAnoUltMod());
        }

        if (this.getEpeMesUltMod() != null && this.getEpeMesUltMod().longValue() == -999) {
            conditions += " AND EPE_MES_ULT_MOD IS NULL";
        } else if (this.getEpeMesUltMod() != null) {
            conditions += " AND EPE_MES_ULT_MOD = ?";
            values.add(this.getEpeMesUltMod());
        }

        if (this.getEpeDiaUltMod() != null && this.getEpeDiaUltMod().longValue() == -999) {
            conditions += " AND EPE_DIA_ULT_MOD IS NULL";
        } else if (this.getEpeDiaUltMod() != null) {
            conditions += " AND EPE_DIA_ULT_MOD = ?";
            values.add(this.getEpeDiaUltMod());
        }

        if (this.getEpeCveStEsperito() != null && "null".equals(this.getEpeCveStEsperito())) {
            conditions += " AND EPE_CVE_ST_ESPERITO IS NULL";
        } else if (this.getEpeCveStEsperito() != null) {
            conditions += " AND EPE_CVE_ST_ESPERITO = ?";
            values.add(this.getEpeCveStEsperito());
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
        String sql = "UPDATE ESPERITO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EPE_NUM_PERITO = ?";
        pkValues.add(this.getEpeNumPerito());
        conditions += " AND EPE_NOM_ESPECIALIDAD = ?";
        pkValues.add(this.getEpeNomEspecialidad());
        conditions += " AND EPE_NUM_REGISTRO = ?";
        pkValues.add(this.getEpeNumRegistro());
        fields += " EPE_OTORGADO_POR = ?, ";
        values.add(this.getEpeOtorgadoPor());
        fields += " EPE_FEC_INI_VIG = ?, ";
        values.add(this.getEpeFecIniVig());
        fields += " EPE_FEC_FIN_VIG = ?, ";
        values.add(this.getEpeFecFinVig());
        fields += " EPE_ANO_ALTA_REG = ?, ";
        values.add(this.getEpeAnoAltaReg());
        fields += " EPE_MES_ALTA_REG = ?, ";
        values.add(this.getEpeMesAltaReg());
        fields += " EPE_DIA_ALTA_REG = ?, ";
        values.add(this.getEpeDiaAltaReg());
        fields += " EPE_ANO_ULT_MOD = ?, ";
        values.add(this.getEpeAnoUltMod());
        fields += " EPE_MES_ULT_MOD = ?, ";
        values.add(this.getEpeMesUltMod());
        fields += " EPE_DIA_ULT_MOD = ?, ";
        values.add(this.getEpeDiaUltMod());
        fields += " EPE_CVE_ST_ESPERITO = ?, ";
        values.add(this.getEpeCveStEsperito());
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
        String sql = "INSERT INTO ESPERITO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EPE_NUM_PERITO";
        fieldValues += ", ?";
        values.add(this.getEpeNumPerito());

        fields += ", EPE_NOM_ESPECIALIDAD";
        fieldValues += ", ?";
        values.add(this.getEpeNomEspecialidad());

        fields += ", EPE_NUM_REGISTRO";
        fieldValues += ", ?";
        values.add(this.getEpeNumRegistro());

        fields += ", EPE_OTORGADO_POR";
        fieldValues += ", ?";
        values.add(this.getEpeOtorgadoPor());

        fields += ", EPE_FEC_INI_VIG";
        fieldValues += ", ?";
        values.add(this.getEpeFecIniVig());

        fields += ", EPE_FEC_FIN_VIG";
        fieldValues += ", ?";
        values.add(this.getEpeFecFinVig());

        fields += ", EPE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpeAnoAltaReg());

        fields += ", EPE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpeMesAltaReg());

        fields += ", EPE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpeDiaAltaReg());

        fields += ", EPE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpeAnoUltMod());

        fields += ", EPE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpeMesUltMod());

        fields += ", EPE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpeDiaUltMod());

        fields += ", EPE_CVE_ST_ESPERITO";
        fieldValues += ", ?";
        values.add(this.getEpeCveStEsperito());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESPERITO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EPE_NUM_PERITO = ?";
        values.add(this.getEpeNumPerito());
        conditions += " AND EPE_NOM_ESPECIALIDAD = ?";
        values.add(this.getEpeNomEspecialidad());
        conditions += " AND EPE_NUM_REGISTRO = ?";
        values.add(this.getEpeNumRegistro());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Esperito instance = (Esperito) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEpeNumPerito().equals(instance.getEpeNumPerito()))
            equalObjects = false;
        if (equalObjects && !this.getEpeNomEspecialidad().equals(instance.getEpeNomEspecialidad()))
            equalObjects = false;
        if (equalObjects && !this.getEpeNumRegistro().equals(instance.getEpeNumRegistro()))
            equalObjects = false;
        if (equalObjects && !this.getEpeOtorgadoPor().equals(instance.getEpeOtorgadoPor()))
            equalObjects = false;
        if (equalObjects && !this.getEpeFecIniVig().equals(instance.getEpeFecIniVig()))
            equalObjects = false;
        if (equalObjects && !this.getEpeFecFinVig().equals(instance.getEpeFecFinVig()))
            equalObjects = false;
        if (equalObjects && !this.getEpeAnoAltaReg().equals(instance.getEpeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpeMesAltaReg().equals(instance.getEpeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpeDiaAltaReg().equals(instance.getEpeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpeAnoUltMod().equals(instance.getEpeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpeMesUltMod().equals(instance.getEpeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpeDiaUltMod().equals(instance.getEpeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpeCveStEsperito().equals(instance.getEpeCveStEsperito()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Esperito result = new Esperito();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEpeNumPerito((BigDecimal) objectData.getData("EPE_NUM_PERITO"));
        result.setEpeNomEspecialidad((String) objectData.getData("EPE_NOM_ESPECIALIDAD"));
        result.setEpeNumRegistro((String) objectData.getData("EPE_NUM_REGISTRO"));
        result.setEpeOtorgadoPor((String) objectData.getData("EPE_OTORGADO_POR"));
        result.setEpeFecIniVig((String) objectData.getData("EPE_FEC_INI_VIG"));
        result.setEpeFecFinVig((String) objectData.getData("EPE_FEC_FIN_VIG"));
        result.setEpeAnoAltaReg((BigDecimal) objectData.getData("EPE_ANO_ALTA_REG"));
        result.setEpeMesAltaReg((BigDecimal) objectData.getData("EPE_MES_ALTA_REG"));
        result.setEpeDiaAltaReg((BigDecimal) objectData.getData("EPE_DIA_ALTA_REG"));
        result.setEpeAnoUltMod((BigDecimal) objectData.getData("EPE_ANO_ULT_MOD"));
        result.setEpeMesUltMod((BigDecimal) objectData.getData("EPE_MES_ULT_MOD"));
        result.setEpeDiaUltMod((BigDecimal) objectData.getData("EPE_DIA_ULT_MOD"));
        result.setEpeCveStEsperito((String) objectData.getData("EPE_CVE_ST_ESPERITO"));

        return result;

    }

}
