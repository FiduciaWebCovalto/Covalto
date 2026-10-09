package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AUTOPEND_PK", columns = { "ATP_NUM_FOLIO_OPER" }, sequences = { "MAX" })
public class Autopend extends DomainObject {

    BigDecimal atpNumFolioOper = null;
    BigDecimal atpNumNivel1 = null;
    BigDecimal atpNumNivel2 = null;
    BigDecimal atpNumNivel3 = null;
    BigDecimal atpNumNivel4 = null;
    BigDecimal atpNumNivel5 = null;
    BigDecimal atpUsuarioOrig = null;
    BigDecimal atpUsuarioAuto = null;
    BigDecimal atpImptAutoriza = null;
    BigDecimal atpAnoOpera = null;
    BigDecimal atpMesOpera = null;
    BigDecimal atpDiaOpera = null;
    BigDecimal atpAnoAutoriza = null;
    BigDecimal atpMesAutoriza = null;
    BigDecimal atpDiaAutoriza = null;
    BigDecimal atpHoraAutoriza = null;
    BigDecimal atpAnoUltMod = null;
    BigDecimal atpMesUltMod = null;
    BigDecimal atpDiaUltMod = null;
    String atpCveStAutopen = null;

    public Autopend() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpNumFolioOper(BigDecimal atpNumFolioOper) {
        this.atpNumFolioOper = atpNumFolioOper;
    }

    public BigDecimal getAtpNumFolioOper() {
        return this.atpNumFolioOper;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpNumNivel1(BigDecimal atpNumNivel1) {
        this.atpNumNivel1 = atpNumNivel1;
    }

    public BigDecimal getAtpNumNivel1() {
        return this.atpNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpNumNivel2(BigDecimal atpNumNivel2) {
        this.atpNumNivel2 = atpNumNivel2;
    }

    public BigDecimal getAtpNumNivel2() {
        return this.atpNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpNumNivel3(BigDecimal atpNumNivel3) {
        this.atpNumNivel3 = atpNumNivel3;
    }

    public BigDecimal getAtpNumNivel3() {
        return this.atpNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpNumNivel4(BigDecimal atpNumNivel4) {
        this.atpNumNivel4 = atpNumNivel4;
    }

    public BigDecimal getAtpNumNivel4() {
        return this.atpNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpNumNivel5(BigDecimal atpNumNivel5) {
        this.atpNumNivel5 = atpNumNivel5;
    }

    public BigDecimal getAtpNumNivel5() {
        return this.atpNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpUsuarioOrig(BigDecimal atpUsuarioOrig) {
        this.atpUsuarioOrig = atpUsuarioOrig;
    }

    public BigDecimal getAtpUsuarioOrig() {
        return this.atpUsuarioOrig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpUsuarioAuto(BigDecimal atpUsuarioAuto) {
        this.atpUsuarioAuto = atpUsuarioAuto;
    }

    public BigDecimal getAtpUsuarioAuto() {
        return this.atpUsuarioAuto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAtpImptAutoriza(BigDecimal atpImptAutoriza) {
        this.atpImptAutoriza = atpImptAutoriza;
    }

    public BigDecimal getAtpImptAutoriza() {
        return this.atpImptAutoriza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAtpAnoOpera(BigDecimal atpAnoOpera) {
        this.atpAnoOpera = atpAnoOpera;
    }

    public BigDecimal getAtpAnoOpera() {
        return this.atpAnoOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAtpMesOpera(BigDecimal atpMesOpera) {
        this.atpMesOpera = atpMesOpera;
    }

    public BigDecimal getAtpMesOpera() {
        return this.atpMesOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAtpDiaOpera(BigDecimal atpDiaOpera) {
        this.atpDiaOpera = atpDiaOpera;
    }

    public BigDecimal getAtpDiaOpera() {
        return this.atpDiaOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAtpAnoAutoriza(BigDecimal atpAnoAutoriza) {
        this.atpAnoAutoriza = atpAnoAutoriza;
    }

    public BigDecimal getAtpAnoAutoriza() {
        return this.atpAnoAutoriza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAtpMesAutoriza(BigDecimal atpMesAutoriza) {
        this.atpMesAutoriza = atpMesAutoriza;
    }

    public BigDecimal getAtpMesAutoriza() {
        return this.atpMesAutoriza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAtpDiaAutoriza(BigDecimal atpDiaAutoriza) {
        this.atpDiaAutoriza = atpDiaAutoriza;
    }

    public BigDecimal getAtpDiaAutoriza() {
        return this.atpDiaAutoriza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAtpHoraAutoriza(BigDecimal atpHoraAutoriza) {
        this.atpHoraAutoriza = atpHoraAutoriza;
    }

    public BigDecimal getAtpHoraAutoriza() {
        return this.atpHoraAutoriza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAtpAnoUltMod(BigDecimal atpAnoUltMod) {
        this.atpAnoUltMod = atpAnoUltMod;
    }

    public BigDecimal getAtpAnoUltMod() {
        return this.atpAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAtpMesUltMod(BigDecimal atpMesUltMod) {
        this.atpMesUltMod = atpMesUltMod;
    }

    public BigDecimal getAtpMesUltMod() {
        return this.atpMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAtpDiaUltMod(BigDecimal atpDiaUltMod) {
        this.atpDiaUltMod = atpDiaUltMod;
    }

    public BigDecimal getAtpDiaUltMod() {
        return this.atpDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAtpCveStAutopen(String atpCveStAutopen) {
        this.atpCveStAutopen = atpCveStAutopen;
    }

    public String getAtpCveStAutopen() {
        return this.atpCveStAutopen;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AUTOPEND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAtpNumFolioOper() != null && this.getAtpNumFolioOper().longValue() == -999) {
            conditions += " AND ATP_NUM_FOLIO_OPER IS NULL";
        } else if (this.getAtpNumFolioOper() != null) {
            conditions += " AND ATP_NUM_FOLIO_OPER = ?";
            values.add(this.getAtpNumFolioOper());
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
        String sql = "SELECT * FROM AUTOPEND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAtpNumFolioOper() != null && this.getAtpNumFolioOper().longValue() == -999) {
            conditions += " AND ATP_NUM_FOLIO_OPER IS NULL";
        } else if (this.getAtpNumFolioOper() != null) {
            conditions += " AND ATP_NUM_FOLIO_OPER = ?";
            values.add(this.getAtpNumFolioOper());
        }

        if (this.getAtpNumNivel1() != null && this.getAtpNumNivel1().longValue() == -999) {
            conditions += " AND ATP_NUM_NIVEL1 IS NULL";
        } else if (this.getAtpNumNivel1() != null) {
            conditions += " AND ATP_NUM_NIVEL1 = ?";
            values.add(this.getAtpNumNivel1());
        }

        if (this.getAtpNumNivel2() != null && this.getAtpNumNivel2().longValue() == -999) {
            conditions += " AND ATP_NUM_NIVEL2 IS NULL";
        } else if (this.getAtpNumNivel2() != null) {
            conditions += " AND ATP_NUM_NIVEL2 = ?";
            values.add(this.getAtpNumNivel2());
        }

        if (this.getAtpNumNivel3() != null && this.getAtpNumNivel3().longValue() == -999) {
            conditions += " AND ATP_NUM_NIVEL3 IS NULL";
        } else if (this.getAtpNumNivel3() != null) {
            conditions += " AND ATP_NUM_NIVEL3 = ?";
            values.add(this.getAtpNumNivel3());
        }

        if (this.getAtpNumNivel4() != null && this.getAtpNumNivel4().longValue() == -999) {
            conditions += " AND ATP_NUM_NIVEL4 IS NULL";
        } else if (this.getAtpNumNivel4() != null) {
            conditions += " AND ATP_NUM_NIVEL4 = ?";
            values.add(this.getAtpNumNivel4());
        }

        if (this.getAtpNumNivel5() != null && this.getAtpNumNivel5().longValue() == -999) {
            conditions += " AND ATP_NUM_NIVEL5 IS NULL";
        } else if (this.getAtpNumNivel5() != null) {
            conditions += " AND ATP_NUM_NIVEL5 = ?";
            values.add(this.getAtpNumNivel5());
        }

        if (this.getAtpUsuarioOrig() != null && this.getAtpUsuarioOrig().longValue() == -999) {
            conditions += " AND ATP_USUARIO_ORIG IS NULL";
        } else if (this.getAtpUsuarioOrig() != null) {
            conditions += " AND ATP_USUARIO_ORIG = ?";
            values.add(this.getAtpUsuarioOrig());
        }

        if (this.getAtpUsuarioAuto() != null && this.getAtpUsuarioAuto().longValue() == -999) {
            conditions += " AND ATP_USUARIO_AUTO IS NULL";
        } else if (this.getAtpUsuarioAuto() != null) {
            conditions += " AND ATP_USUARIO_AUTO = ?";
            values.add(this.getAtpUsuarioAuto());
        }

        if (this.getAtpImptAutoriza() != null && this.getAtpImptAutoriza().longValue() == -999) {
            conditions += " AND ATP_IMPT_AUTORIZA IS NULL";
        } else if (this.getAtpImptAutoriza() != null) {
            conditions += " AND ATP_IMPT_AUTORIZA = ?";
            values.add(this.getAtpImptAutoriza());
        }

        if (this.getAtpAnoOpera() != null && this.getAtpAnoOpera().longValue() == -999) {
            conditions += " AND ATP_ANO_OPERA IS NULL";
        } else if (this.getAtpAnoOpera() != null) {
            conditions += " AND ATP_ANO_OPERA = ?";
            values.add(this.getAtpAnoOpera());
        }

        if (this.getAtpMesOpera() != null && this.getAtpMesOpera().longValue() == -999) {
            conditions += " AND ATP_MES_OPERA IS NULL";
        } else if (this.getAtpMesOpera() != null) {
            conditions += " AND ATP_MES_OPERA = ?";
            values.add(this.getAtpMesOpera());
        }

        if (this.getAtpDiaOpera() != null && this.getAtpDiaOpera().longValue() == -999) {
            conditions += " AND ATP_DIA_OPERA IS NULL";
        } else if (this.getAtpDiaOpera() != null) {
            conditions += " AND ATP_DIA_OPERA = ?";
            values.add(this.getAtpDiaOpera());
        }

        if (this.getAtpAnoAutoriza() != null && this.getAtpAnoAutoriza().longValue() == -999) {
            conditions += " AND ATP_ANO_AUTORIZA IS NULL";
        } else if (this.getAtpAnoAutoriza() != null) {
            conditions += " AND ATP_ANO_AUTORIZA = ?";
            values.add(this.getAtpAnoAutoriza());
        }

        if (this.getAtpMesAutoriza() != null && this.getAtpMesAutoriza().longValue() == -999) {
            conditions += " AND ATP_MES_AUTORIZA IS NULL";
        } else if (this.getAtpMesAutoriza() != null) {
            conditions += " AND ATP_MES_AUTORIZA = ?";
            values.add(this.getAtpMesAutoriza());
        }

        if (this.getAtpDiaAutoriza() != null && this.getAtpDiaAutoriza().longValue() == -999) {
            conditions += " AND ATP_DIA_AUTORIZA IS NULL";
        } else if (this.getAtpDiaAutoriza() != null) {
            conditions += " AND ATP_DIA_AUTORIZA = ?";
            values.add(this.getAtpDiaAutoriza());
        }

        if (this.getAtpHoraAutoriza() != null && this.getAtpHoraAutoriza().longValue() == -999) {
            conditions += " AND ATP_HORA_AUTORIZA IS NULL";
        } else if (this.getAtpHoraAutoriza() != null) {
            conditions += " AND ATP_HORA_AUTORIZA = ?";
            values.add(this.getAtpHoraAutoriza());
        }

        if (this.getAtpAnoUltMod() != null && this.getAtpAnoUltMod().longValue() == -999) {
            conditions += " AND ATP_ANO_ULT_MOD IS NULL";
        } else if (this.getAtpAnoUltMod() != null) {
            conditions += " AND ATP_ANO_ULT_MOD = ?";
            values.add(this.getAtpAnoUltMod());
        }

        if (this.getAtpMesUltMod() != null && this.getAtpMesUltMod().longValue() == -999) {
            conditions += " AND ATP_MES_ULT_MOD IS NULL";
        } else if (this.getAtpMesUltMod() != null) {
            conditions += " AND ATP_MES_ULT_MOD = ?";
            values.add(this.getAtpMesUltMod());
        }

        if (this.getAtpDiaUltMod() != null && this.getAtpDiaUltMod().longValue() == -999) {
            conditions += " AND ATP_DIA_ULT_MOD IS NULL";
        } else if (this.getAtpDiaUltMod() != null) {
            conditions += " AND ATP_DIA_ULT_MOD = ?";
            values.add(this.getAtpDiaUltMod());
        }

        if (this.getAtpCveStAutopen() != null && "null".equals(this.getAtpCveStAutopen())) {
            conditions += " AND ATP_CVE_ST_AUTOPEN IS NULL";
        } else if (this.getAtpCveStAutopen() != null) {
            conditions += " AND ATP_CVE_ST_AUTOPEN = ?";
            values.add(this.getAtpCveStAutopen());
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
        String sql = "UPDATE AUTOPEND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ATP_NUM_FOLIO_OPER = ?";
        pkValues.add(this.getAtpNumFolioOper());
        fields += " ATP_NUM_NIVEL1 = ?, ";
        values.add(this.getAtpNumNivel1());
        fields += " ATP_NUM_NIVEL2 = ?, ";
        values.add(this.getAtpNumNivel2());
        fields += " ATP_NUM_NIVEL3 = ?, ";
        values.add(this.getAtpNumNivel3());
        fields += " ATP_NUM_NIVEL4 = ?, ";
        values.add(this.getAtpNumNivel4());
        fields += " ATP_NUM_NIVEL5 = ?, ";
        values.add(this.getAtpNumNivel5());
        fields += " ATP_USUARIO_ORIG = ?, ";
        values.add(this.getAtpUsuarioOrig());
        fields += " ATP_USUARIO_AUTO = ?, ";
        values.add(this.getAtpUsuarioAuto());
        fields += " ATP_IMPT_AUTORIZA = ?, ";
        values.add(this.getAtpImptAutoriza());
        fields += " ATP_ANO_OPERA = ?, ";
        values.add(this.getAtpAnoOpera());
        fields += " ATP_MES_OPERA = ?, ";
        values.add(this.getAtpMesOpera());
        fields += " ATP_DIA_OPERA = ?, ";
        values.add(this.getAtpDiaOpera());
        fields += " ATP_ANO_AUTORIZA = ?, ";
        values.add(this.getAtpAnoAutoriza());
        fields += " ATP_MES_AUTORIZA = ?, ";
        values.add(this.getAtpMesAutoriza());
        fields += " ATP_DIA_AUTORIZA = ?, ";
        values.add(this.getAtpDiaAutoriza());
        fields += " ATP_HORA_AUTORIZA = ?, ";
        values.add(this.getAtpHoraAutoriza());
        fields += " ATP_ANO_ULT_MOD = ?, ";
        values.add(this.getAtpAnoUltMod());
        fields += " ATP_MES_ULT_MOD = ?, ";
        values.add(this.getAtpMesUltMod());
        fields += " ATP_DIA_ULT_MOD = ?, ";
        values.add(this.getAtpDiaUltMod());
        fields += " ATP_CVE_ST_AUTOPEN = ?, ";
        values.add(this.getAtpCveStAutopen());
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
        String sql = "INSERT INTO AUTOPEND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ATP_NUM_FOLIO_OPER";
        fieldValues += ", ?";
        values.add(this.getAtpNumFolioOper());

        fields += ", ATP_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getAtpNumNivel1());

        fields += ", ATP_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getAtpNumNivel2());

        fields += ", ATP_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getAtpNumNivel3());

        fields += ", ATP_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getAtpNumNivel4());

        fields += ", ATP_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getAtpNumNivel5());

        fields += ", ATP_USUARIO_ORIG";
        fieldValues += ", ?";
        values.add(this.getAtpUsuarioOrig());

        fields += ", ATP_USUARIO_AUTO";
        fieldValues += ", ?";
        values.add(this.getAtpUsuarioAuto());

        fields += ", ATP_IMPT_AUTORIZA";
        fieldValues += ", ?";
        values.add(this.getAtpImptAutoriza());

        fields += ", ATP_ANO_OPERA";
        fieldValues += ", ?";
        values.add(this.getAtpAnoOpera());

        fields += ", ATP_MES_OPERA";
        fieldValues += ", ?";
        values.add(this.getAtpMesOpera());

        fields += ", ATP_DIA_OPERA";
        fieldValues += ", ?";
        values.add(this.getAtpDiaOpera());

        fields += ", ATP_ANO_AUTORIZA";
        fieldValues += ", ?";
        values.add(this.getAtpAnoAutoriza());

        fields += ", ATP_MES_AUTORIZA";
        fieldValues += ", ?";
        values.add(this.getAtpMesAutoriza());

        fields += ", ATP_DIA_AUTORIZA";
        fieldValues += ", ?";
        values.add(this.getAtpDiaAutoriza());

        fields += ", ATP_HORA_AUTORIZA";
        fieldValues += ", ?";
        values.add(this.getAtpHoraAutoriza());

        fields += ", ATP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAtpAnoUltMod());

        fields += ", ATP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAtpMesUltMod());

        fields += ", ATP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAtpDiaUltMod());

        fields += ", ATP_CVE_ST_AUTOPEN";
        fieldValues += ", ?";
        values.add(this.getAtpCveStAutopen());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AUTOPEND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ATP_NUM_FOLIO_OPER = ?";
        values.add(this.getAtpNumFolioOper());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Autopend instance = (Autopend) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAtpNumFolioOper().equals(instance.getAtpNumFolioOper()))
            equalObjects = false;
        if (equalObjects && !this.getAtpNumNivel1().equals(instance.getAtpNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getAtpNumNivel2().equals(instance.getAtpNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getAtpNumNivel3().equals(instance.getAtpNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getAtpNumNivel4().equals(instance.getAtpNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getAtpNumNivel5().equals(instance.getAtpNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getAtpUsuarioOrig().equals(instance.getAtpUsuarioOrig()))
            equalObjects = false;
        if (equalObjects && !this.getAtpUsuarioAuto().equals(instance.getAtpUsuarioAuto()))
            equalObjects = false;
        if (equalObjects && !this.getAtpImptAutoriza().equals(instance.getAtpImptAutoriza()))
            equalObjects = false;
        if (equalObjects && !this.getAtpAnoOpera().equals(instance.getAtpAnoOpera()))
            equalObjects = false;
        if (equalObjects && !this.getAtpMesOpera().equals(instance.getAtpMesOpera()))
            equalObjects = false;
        if (equalObjects && !this.getAtpDiaOpera().equals(instance.getAtpDiaOpera()))
            equalObjects = false;
        if (equalObjects && !this.getAtpAnoAutoriza().equals(instance.getAtpAnoAutoriza()))
            equalObjects = false;
        if (equalObjects && !this.getAtpMesAutoriza().equals(instance.getAtpMesAutoriza()))
            equalObjects = false;
        if (equalObjects && !this.getAtpDiaAutoriza().equals(instance.getAtpDiaAutoriza()))
            equalObjects = false;
        if (equalObjects && !this.getAtpHoraAutoriza().equals(instance.getAtpHoraAutoriza()))
            equalObjects = false;
        if (equalObjects && !this.getAtpAnoUltMod().equals(instance.getAtpAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAtpMesUltMod().equals(instance.getAtpMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAtpDiaUltMod().equals(instance.getAtpDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAtpCveStAutopen().equals(instance.getAtpCveStAutopen()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Autopend result = new Autopend();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAtpNumFolioOper((BigDecimal) objectData.getData("ATP_NUM_FOLIO_OPER"));
        result.setAtpNumNivel1((BigDecimal) objectData.getData("ATP_NUM_NIVEL1"));
        result.setAtpNumNivel2((BigDecimal) objectData.getData("ATP_NUM_NIVEL2"));
        result.setAtpNumNivel3((BigDecimal) objectData.getData("ATP_NUM_NIVEL3"));
        result.setAtpNumNivel4((BigDecimal) objectData.getData("ATP_NUM_NIVEL4"));
        result.setAtpNumNivel5((BigDecimal) objectData.getData("ATP_NUM_NIVEL5"));
        result.setAtpUsuarioOrig((BigDecimal) objectData.getData("ATP_USUARIO_ORIG"));
        result.setAtpUsuarioAuto((BigDecimal) objectData.getData("ATP_USUARIO_AUTO"));
        result.setAtpImptAutoriza((BigDecimal) objectData.getData("ATP_IMPT_AUTORIZA"));
        result.setAtpAnoOpera((BigDecimal) objectData.getData("ATP_ANO_OPERA"));
        result.setAtpMesOpera((BigDecimal) objectData.getData("ATP_MES_OPERA"));
        result.setAtpDiaOpera((BigDecimal) objectData.getData("ATP_DIA_OPERA"));
        result.setAtpAnoAutoriza((BigDecimal) objectData.getData("ATP_ANO_AUTORIZA"));
        result.setAtpMesAutoriza((BigDecimal) objectData.getData("ATP_MES_AUTORIZA"));
        result.setAtpDiaAutoriza((BigDecimal) objectData.getData("ATP_DIA_AUTORIZA"));
        result.setAtpHoraAutoriza((BigDecimal) objectData.getData("ATP_HORA_AUTORIZA"));
        result.setAtpAnoUltMod((BigDecimal) objectData.getData("ATP_ANO_ULT_MOD"));
        result.setAtpMesUltMod((BigDecimal) objectData.getData("ATP_MES_ULT_MOD"));
        result.setAtpDiaUltMod((BigDecimal) objectData.getData("ATP_DIA_ULT_MOD"));
        result.setAtpCveStAutopen((String) objectData.getData("ATP_CVE_ST_AUTOPEN"));

        return result;

    }

}
