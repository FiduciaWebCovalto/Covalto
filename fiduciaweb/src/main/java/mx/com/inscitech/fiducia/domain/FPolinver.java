package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_POLINVER_PK", columns = { "PIN_ID_FIDEICOMISO", "PIN_ID_INTERMEDIARIO", "PIN_ID_CTO_INVER", "PIN_ID_TIPO_MERCA", "PIN_ID_INSTRUME" },
            sequences = { "MANUAL" })
public class FPolinver extends DomainObject {

    BigDecimal pinIdFideicomiso = null;
    BigDecimal pinIdIntermediario = null;
    BigDecimal pinIdCtoInver = null;
    BigDecimal pinIdTipoMerca = null;
    BigDecimal pinIdInstrume = null;
    BigDecimal pinNumSecEmis = null;
    String pinNomPizarra = null;
    String pinNumSerEmis = null;
    BigDecimal pinNumCuponVig = null;
    BigDecimal pinNumPlazo = null;
    BigDecimal pinPjeInversion = null;
    String pinFecVigDel = null;
    String pinFecVigAl = null;
    String pinCveStPolinve = null;

    public FPolinver() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinIdFideicomiso(BigDecimal pinIdFideicomiso) {
        this.pinIdFideicomiso = pinIdFideicomiso;
    }

    public BigDecimal getPinIdFideicomiso() {
        return this.pinIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinIdIntermediario(BigDecimal pinIdIntermediario) {
        this.pinIdIntermediario = pinIdIntermediario;
    }

    public BigDecimal getPinIdIntermediario() {
        return this.pinIdIntermediario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setPinIdCtoInver(BigDecimal pinIdCtoInver) {
        this.pinIdCtoInver = pinIdCtoInver;
    }

    public BigDecimal getPinIdCtoInver() {
        return this.pinIdCtoInver;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinIdTipoMerca(BigDecimal pinIdTipoMerca) {
        this.pinIdTipoMerca = pinIdTipoMerca;
    }

    public BigDecimal getPinIdTipoMerca() {
        return this.pinIdTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinIdInstrume(BigDecimal pinIdInstrume) {
        this.pinIdInstrume = pinIdInstrume;
    }

    public BigDecimal getPinIdInstrume() {
        return this.pinIdInstrume;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumSecEmis(BigDecimal pinNumSecEmis) {
        this.pinNumSecEmis = pinNumSecEmis;
    }

    public BigDecimal getPinNumSecEmis() {
        return this.pinNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinNomPizarra(String pinNomPizarra) {
        this.pinNomPizarra = pinNomPizarra;
    }

    public String getPinNomPizarra() {
        return this.pinNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinNumSerEmis(String pinNumSerEmis) {
        this.pinNumSerEmis = pinNumSerEmis;
    }

    public String getPinNumSerEmis() {
        return this.pinNumSerEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumCuponVig(BigDecimal pinNumCuponVig) {
        this.pinNumCuponVig = pinNumCuponVig;
    }

    public BigDecimal getPinNumCuponVig() {
        return this.pinNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPinNumPlazo(BigDecimal pinNumPlazo) {
        this.pinNumPlazo = pinNumPlazo;
    }

    public BigDecimal getPinNumPlazo() {
        return this.pinNumPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 4, javaClass = BigDecimal.class)
    public void setPinPjeInversion(BigDecimal pinPjeInversion) {
        this.pinPjeInversion = pinPjeInversion;
    }

    public BigDecimal getPinPjeInversion() {
        return this.pinPjeInversion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setPinFecVigDel(String pinFecVigDel) {
        this.pinFecVigDel = pinFecVigDel;
    }

    public String getPinFecVigDel() {
        return this.pinFecVigDel;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setPinFecVigAl(String pinFecVigAl) {
        this.pinFecVigAl = pinFecVigAl;
    }

    public String getPinFecVigAl() {
        return this.pinFecVigAl;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPinCveStPolinve(String pinCveStPolinve) {
        this.pinCveStPolinve = pinCveStPolinve;
    }

    public String getPinCveStPolinve() {
        return this.pinCveStPolinve;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_POLINVER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPinIdFideicomiso() != null && this.getPinIdFideicomiso().longValue() == -999) {
            conditions += " AND PIN_ID_FIDEICOMISO IS NULL";
        } else if (this.getPinIdFideicomiso() != null) {
            conditions += " AND PIN_ID_FIDEICOMISO = ?";
            values.add(this.getPinIdFideicomiso());
        }

        if (this.getPinIdIntermediario() != null && this.getPinIdIntermediario().longValue() == -999) {
            conditions += " AND PIN_ID_INTERMEDIARIO IS NULL";
        } else if (this.getPinIdIntermediario() != null) {
            conditions += " AND PIN_ID_INTERMEDIARIO = ?";
            values.add(this.getPinIdIntermediario());
        }

        if (this.getPinIdCtoInver() != null && this.getPinIdCtoInver().longValue() == -999) {
            conditions += " AND PIN_ID_CTO_INVER IS NULL";
        } else if (this.getPinIdCtoInver() != null) {
            conditions += " AND PIN_ID_CTO_INVER = ?";
            values.add(this.getPinIdCtoInver());
        }

        if (this.getPinIdTipoMerca() != null && this.getPinIdTipoMerca().longValue() == -999) {
            conditions += " AND PIN_ID_TIPO_MERCA IS NULL";
        } else if (this.getPinIdTipoMerca() != null) {
            conditions += " AND PIN_ID_TIPO_MERCA = ?";
            values.add(this.getPinIdTipoMerca());
        }

        if (this.getPinIdInstrume() != null && this.getPinIdInstrume().longValue() == -999) {
            conditions += " AND PIN_ID_INSTRUME IS NULL";
        } else if (this.getPinIdInstrume() != null) {
            conditions += " AND PIN_ID_INSTRUME = ?";
            values.add(this.getPinIdInstrume());
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
        String sql = "SELECT * FROM F_POLINVER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPinIdFideicomiso() != null && this.getPinIdFideicomiso().longValue() == -999) {
            conditions += " AND PIN_ID_FIDEICOMISO IS NULL";
        } else if (this.getPinIdFideicomiso() != null) {
            conditions += " AND PIN_ID_FIDEICOMISO = ?";
            values.add(this.getPinIdFideicomiso());
        }

        if (this.getPinIdIntermediario() != null && this.getPinIdIntermediario().longValue() == -999) {
            conditions += " AND PIN_ID_INTERMEDIARIO IS NULL";
        } else if (this.getPinIdIntermediario() != null) {
            conditions += " AND PIN_ID_INTERMEDIARIO = ?";
            values.add(this.getPinIdIntermediario());
        }

        if (this.getPinIdCtoInver() != null && this.getPinIdCtoInver().longValue() == -999) {
            conditions += " AND PIN_ID_CTO_INVER IS NULL";
        } else if (this.getPinIdCtoInver() != null) {
            conditions += " AND PIN_ID_CTO_INVER = ?";
            values.add(this.getPinIdCtoInver());
        }

        if (this.getPinIdTipoMerca() != null && this.getPinIdTipoMerca().longValue() == -999) {
            conditions += " AND PIN_ID_TIPO_MERCA IS NULL";
        } else if (this.getPinIdTipoMerca() != null) {
            conditions += " AND PIN_ID_TIPO_MERCA = ?";
            values.add(this.getPinIdTipoMerca());
        }

        if (this.getPinIdInstrume() != null && this.getPinIdInstrume().longValue() == -999) {
            conditions += " AND PIN_ID_INSTRUME IS NULL";
        } else if (this.getPinIdInstrume() != null) {
            conditions += " AND PIN_ID_INSTRUME = ?";
            values.add(this.getPinIdInstrume());
        }

        if (this.getPinNumSecEmis() != null && this.getPinNumSecEmis().longValue() == -999) {
            conditions += " AND PIN_NUM_SEC_EMIS IS NULL";
        } else if (this.getPinNumSecEmis() != null) {
            conditions += " AND PIN_NUM_SEC_EMIS = ?";
            values.add(this.getPinNumSecEmis());
        }

        if (this.getPinNomPizarra() != null && "null".equals(this.getPinNomPizarra())) {
            conditions += " AND PIN_NOM_PIZARRA IS NULL";
        } else if (this.getPinNomPizarra() != null) {
            conditions += " AND PIN_NOM_PIZARRA = ?";
            values.add(this.getPinNomPizarra());
        }

        if (this.getPinNumSerEmis() != null && "null".equals(this.getPinNumSerEmis())) {
            conditions += " AND PIN_NUM_SER_EMIS IS NULL";
        } else if (this.getPinNumSerEmis() != null) {
            conditions += " AND PIN_NUM_SER_EMIS = ?";
            values.add(this.getPinNumSerEmis());
        }

        if (this.getPinNumCuponVig() != null && this.getPinNumCuponVig().longValue() == -999) {
            conditions += " AND PIN_NUM_CUPON_VIG IS NULL";
        } else if (this.getPinNumCuponVig() != null) {
            conditions += " AND PIN_NUM_CUPON_VIG = ?";
            values.add(this.getPinNumCuponVig());
        }

        if (this.getPinNumPlazo() != null && this.getPinNumPlazo().longValue() == -999) {
            conditions += " AND PIN_NUM_PLAZO IS NULL";
        } else if (this.getPinNumPlazo() != null) {
            conditions += " AND PIN_NUM_PLAZO = ?";
            values.add(this.getPinNumPlazo());
        }

        if (this.getPinPjeInversion() != null && this.getPinPjeInversion().longValue() == -999) {
            conditions += " AND PIN_PJE_INVERSION IS NULL";
        } else if (this.getPinPjeInversion() != null) {
            conditions += " AND PIN_PJE_INVERSION = ?";
            values.add(this.getPinPjeInversion());
        }

        if (this.getPinFecVigDel() != null && "null".equals(this.getPinFecVigDel())) {
            conditions += " AND PIN_FEC_VIG_DEL IS NULL";
        } else if (this.getPinFecVigDel() != null) {
            conditions += " AND PIN_FEC_VIG_DEL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getPinFecVigDel());
        }

        if (this.getPinFecVigAl() != null && "null".equals(this.getPinFecVigAl())) {
            conditions += " AND PIN_FEC_VIG_AL IS NULL";
        } else if (this.getPinFecVigAl() != null) {
            conditions += " AND PIN_FEC_VIG_AL = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getPinFecVigAl());
        }

        if (this.getPinCveStPolinve() != null && "null".equals(this.getPinCveStPolinve())) {
            conditions += " AND PIN_CVE_ST_POLINVE IS NULL";
        } else if (this.getPinCveStPolinve() != null) {
            conditions += " AND PIN_CVE_ST_POLINVE = ?";
            values.add(this.getPinCveStPolinve());
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
        String sql = "UPDATE F_POLINVER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PIN_ID_FIDEICOMISO = ?";
        pkValues.add(this.getPinIdFideicomiso());
        conditions += " AND PIN_ID_INTERMEDIARIO = ?";
        pkValues.add(this.getPinIdIntermediario());
        conditions += " AND PIN_ID_CTO_INVER = ?";
        pkValues.add(this.getPinIdCtoInver());
        conditions += " AND PIN_ID_TIPO_MERCA = ?";
        pkValues.add(this.getPinIdTipoMerca());
        conditions += " AND PIN_ID_INSTRUME = ?";
        pkValues.add(this.getPinIdInstrume());
        fields += " PIN_NUM_SEC_EMIS = ?, ";
        values.add(this.getPinNumSecEmis());
        fields += " PIN_NOM_PIZARRA = ?, ";
        values.add(this.getPinNomPizarra());
        fields += " PIN_NUM_SER_EMIS = ?, ";
        values.add(this.getPinNumSerEmis());
        fields += " PIN_NUM_CUPON_VIG = ?, ";
        values.add(this.getPinNumCuponVig());
        fields += " PIN_NUM_PLAZO = ?, ";
        values.add(this.getPinNumPlazo());
        fields += " PIN_PJE_INVERSION = ?, ";
        values.add(this.getPinPjeInversion());
        fields += " PIN_FEC_VIG_DEL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getPinFecVigDel());
        fields += " PIN_FEC_VIG_AL = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getPinFecVigAl());
        fields += " PIN_CVE_ST_POLINVE = ?, ";
        values.add(this.getPinCveStPolinve());
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
        String sql = "INSERT INTO F_POLINVER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PIN_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getPinIdFideicomiso());

        fields += ", PIN_ID_INTERMEDIARIO";
        fieldValues += ", ?";
        values.add(this.getPinIdIntermediario());

        fields += ", PIN_ID_CTO_INVER";
        fieldValues += ", ?";
        values.add(this.getPinIdCtoInver());

        fields += ", PIN_ID_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getPinIdTipoMerca());

        fields += ", PIN_ID_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getPinIdInstrume());

        fields += ", PIN_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getPinNumSecEmis());

        fields += ", PIN_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getPinNomPizarra());

        fields += ", PIN_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getPinNumSerEmis());

        fields += ", PIN_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getPinNumCuponVig());

        fields += ", PIN_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getPinNumPlazo());

        fields += ", PIN_PJE_INVERSION";
        fieldValues += ", ?";
        values.add(this.getPinPjeInversion());

        fields += ", PIN_FEC_VIG_DEL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getPinFecVigDel());

        fields += ", PIN_FEC_VIG_AL";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getPinFecVigAl());

        fields += ", PIN_CVE_ST_POLINVE";
        fieldValues += ", ?";
        values.add(this.getPinCveStPolinve());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_POLINVER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PIN_ID_FIDEICOMISO = ?";
        values.add(this.getPinIdFideicomiso());
        conditions += " AND PIN_ID_INTERMEDIARIO = ?";
        values.add(this.getPinIdIntermediario());
        conditions += " AND PIN_ID_CTO_INVER = ?";
        values.add(this.getPinIdCtoInver());
        conditions += " AND PIN_ID_TIPO_MERCA = ?";
        values.add(this.getPinIdTipoMerca());
        conditions += " AND PIN_ID_INSTRUME = ?";
        values.add(this.getPinIdInstrume());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FPolinver instance = (FPolinver) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPinIdFideicomiso().equals(instance.getPinIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getPinIdIntermediario().equals(instance.getPinIdIntermediario()))
            equalObjects = false;
        if (equalObjects && !this.getPinIdCtoInver().equals(instance.getPinIdCtoInver()))
            equalObjects = false;
        if (equalObjects && !this.getPinIdTipoMerca().equals(instance.getPinIdTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getPinIdInstrume().equals(instance.getPinIdInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumSecEmis().equals(instance.getPinNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPinNomPizarra().equals(instance.getPinNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumSerEmis().equals(instance.getPinNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumCuponVig().equals(instance.getPinNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getPinNumPlazo().equals(instance.getPinNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getPinPjeInversion().equals(instance.getPinPjeInversion()))
            equalObjects = false;
        if (equalObjects && !this.getPinFecVigDel().equals(instance.getPinFecVigDel()))
            equalObjects = false;
        if (equalObjects && !this.getPinFecVigAl().equals(instance.getPinFecVigAl()))
            equalObjects = false;
        if (equalObjects && !this.getPinCveStPolinve().equals(instance.getPinCveStPolinve()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPolinver result = new FPolinver();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPinIdFideicomiso((BigDecimal) objectData.getData("PIN_ID_FIDEICOMISO"));
        result.setPinIdIntermediario((BigDecimal) objectData.getData("PIN_ID_INTERMEDIARIO"));
        result.setPinIdCtoInver((BigDecimal) objectData.getData("PIN_ID_CTO_INVER"));
        result.setPinIdTipoMerca((BigDecimal) objectData.getData("PIN_ID_TIPO_MERCA"));
        result.setPinIdInstrume((BigDecimal) objectData.getData("PIN_ID_INSTRUME"));
        result.setPinNumSecEmis((BigDecimal) objectData.getData("PIN_NUM_SEC_EMIS"));
        result.setPinNomPizarra((String) objectData.getData("PIN_NOM_PIZARRA"));
        result.setPinNumSerEmis((String) objectData.getData("PIN_NUM_SER_EMIS"));
        result.setPinNumCuponVig((BigDecimal) objectData.getData("PIN_NUM_CUPON_VIG"));
        result.setPinNumPlazo((BigDecimal) objectData.getData("PIN_NUM_PLAZO"));
        result.setPinPjeInversion((BigDecimal) objectData.getData("PIN_PJE_INVERSION"));
        result.setPinFecVigDel((String) objectData.getData("PIN_FEC_VIG_DEL"));
        result.setPinFecVigAl((String) objectData.getData("PIN_FEC_VIG_AL"));
        result.setPinCveStPolinve((String) objectData.getData("PIN_CVE_ST_POLINVE"));

        return result;

    }

}
