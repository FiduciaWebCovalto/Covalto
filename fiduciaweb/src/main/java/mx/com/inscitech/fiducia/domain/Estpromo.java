package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESTPROMO_PK", columns = { "ESP_NUM_NIVEL1", "ESP_NUM_NIVEL2", "ESP_NUM_NIVEL3", "ESP_NUM_NIVEL4", "ESP_NUM_NIVEL5", "ESP_NUM_EJECUTIVO" },
            sequences = { "MANUAL" })
public class Estpromo extends DomainObject {

    BigDecimal espNumNivel1 = null;
    BigDecimal espNumNivel2 = null;
    BigDecimal espNumNivel3 = null;
    BigDecimal espNumNivel4 = null;
    BigDecimal espNumNivel5 = null;
    BigDecimal espNumEjecutivo = null;
    BigDecimal espNumAno = null;
    BigDecimal espNumMes = null;
    BigDecimal espNumProspec = null;
    BigDecimal espImpProspec = null;
    BigDecimal espNumContratos = null;
    BigDecimal espImpContratos = null;
    BigDecimal espNumConstituc = null;
    BigDecimal espImpConstituc = null;
    BigDecimal espNumRevocac = null;
    BigDecimal espImpRevocac = null;

    public Estpromo() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel1(BigDecimal espNumNivel1) {
        this.espNumNivel1 = espNumNivel1;
    }

    public BigDecimal getEspNumNivel1() {
        return this.espNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel2(BigDecimal espNumNivel2) {
        this.espNumNivel2 = espNumNivel2;
    }

    public BigDecimal getEspNumNivel2() {
        return this.espNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel3(BigDecimal espNumNivel3) {
        this.espNumNivel3 = espNumNivel3;
    }

    public BigDecimal getEspNumNivel3() {
        return this.espNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel4(BigDecimal espNumNivel4) {
        this.espNumNivel4 = espNumNivel4;
    }

    public BigDecimal getEspNumNivel4() {
        return this.espNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumNivel5(BigDecimal espNumNivel5) {
        this.espNumNivel5 = espNumNivel5;
    }

    public BigDecimal getEspNumNivel5() {
        return this.espNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumEjecutivo(BigDecimal espNumEjecutivo) {
        this.espNumEjecutivo = espNumEjecutivo;
    }

    public BigDecimal getEspNumEjecutivo() {
        return this.espNumEjecutivo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumAno(BigDecimal espNumAno) {
        this.espNumAno = espNumAno;
    }

    public BigDecimal getEspNumAno() {
        return this.espNumAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumMes(BigDecimal espNumMes) {
        this.espNumMes = espNumMes;
    }

    public BigDecimal getEspNumMes() {
        return this.espNumMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumProspec(BigDecimal espNumProspec) {
        this.espNumProspec = espNumProspec;
    }

    public BigDecimal getEspNumProspec() {
        return this.espNumProspec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEspImpProspec(BigDecimal espImpProspec) {
        this.espImpProspec = espImpProspec;
    }

    public BigDecimal getEspImpProspec() {
        return this.espImpProspec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumContratos(BigDecimal espNumContratos) {
        this.espNumContratos = espNumContratos;
    }

    public BigDecimal getEspNumContratos() {
        return this.espNumContratos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEspImpContratos(BigDecimal espImpContratos) {
        this.espImpContratos = espImpContratos;
    }

    public BigDecimal getEspImpContratos() {
        return this.espImpContratos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumConstituc(BigDecimal espNumConstituc) {
        this.espNumConstituc = espNumConstituc;
    }

    public BigDecimal getEspNumConstituc() {
        return this.espNumConstituc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEspImpConstituc(BigDecimal espImpConstituc) {
        this.espImpConstituc = espImpConstituc;
    }

    public BigDecimal getEspImpConstituc() {
        return this.espImpConstituc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEspNumRevocac(BigDecimal espNumRevocac) {
        this.espNumRevocac = espNumRevocac;
    }

    public BigDecimal getEspNumRevocac() {
        return this.espNumRevocac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEspImpRevocac(BigDecimal espImpRevocac) {
        this.espImpRevocac = espImpRevocac;
    }

    public BigDecimal getEspImpRevocac() {
        return this.espImpRevocac;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESTPROMO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEspNumNivel1() != null && this.getEspNumNivel1().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL1 IS NULL";
        } else if (this.getEspNumNivel1() != null) {
            conditions += " AND ESP_NUM_NIVEL1 = ?";
            values.add(this.getEspNumNivel1());
        }

        if (this.getEspNumNivel2() != null && this.getEspNumNivel2().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL2 IS NULL";
        } else if (this.getEspNumNivel2() != null) {
            conditions += " AND ESP_NUM_NIVEL2 = ?";
            values.add(this.getEspNumNivel2());
        }

        if (this.getEspNumNivel3() != null && this.getEspNumNivel3().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL3 IS NULL";
        } else if (this.getEspNumNivel3() != null) {
            conditions += " AND ESP_NUM_NIVEL3 = ?";
            values.add(this.getEspNumNivel3());
        }

        if (this.getEspNumNivel4() != null && this.getEspNumNivel4().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL4 IS NULL";
        } else if (this.getEspNumNivel4() != null) {
            conditions += " AND ESP_NUM_NIVEL4 = ?";
            values.add(this.getEspNumNivel4());
        }

        if (this.getEspNumNivel5() != null && this.getEspNumNivel5().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL5 IS NULL";
        } else if (this.getEspNumNivel5() != null) {
            conditions += " AND ESP_NUM_NIVEL5 = ?";
            values.add(this.getEspNumNivel5());
        }

        if (this.getEspNumEjecutivo() != null && this.getEspNumEjecutivo().longValue() == -999) {
            conditions += " AND ESP_NUM_EJECUTIVO IS NULL";
        } else if (this.getEspNumEjecutivo() != null) {
            conditions += " AND ESP_NUM_EJECUTIVO = ?";
            values.add(this.getEspNumEjecutivo());
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
        String sql = "SELECT * FROM ESTPROMO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEspNumNivel1() != null && this.getEspNumNivel1().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL1 IS NULL";
        } else if (this.getEspNumNivel1() != null) {
            conditions += " AND ESP_NUM_NIVEL1 = ?";
            values.add(this.getEspNumNivel1());
        }

        if (this.getEspNumNivel2() != null && this.getEspNumNivel2().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL2 IS NULL";
        } else if (this.getEspNumNivel2() != null) {
            conditions += " AND ESP_NUM_NIVEL2 = ?";
            values.add(this.getEspNumNivel2());
        }

        if (this.getEspNumNivel3() != null && this.getEspNumNivel3().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL3 IS NULL";
        } else if (this.getEspNumNivel3() != null) {
            conditions += " AND ESP_NUM_NIVEL3 = ?";
            values.add(this.getEspNumNivel3());
        }

        if (this.getEspNumNivel4() != null && this.getEspNumNivel4().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL4 IS NULL";
        } else if (this.getEspNumNivel4() != null) {
            conditions += " AND ESP_NUM_NIVEL4 = ?";
            values.add(this.getEspNumNivel4());
        }

        if (this.getEspNumNivel5() != null && this.getEspNumNivel5().longValue() == -999) {
            conditions += " AND ESP_NUM_NIVEL5 IS NULL";
        } else if (this.getEspNumNivel5() != null) {
            conditions += " AND ESP_NUM_NIVEL5 = ?";
            values.add(this.getEspNumNivel5());
        }

        if (this.getEspNumEjecutivo() != null && this.getEspNumEjecutivo().longValue() == -999) {
            conditions += " AND ESP_NUM_EJECUTIVO IS NULL";
        } else if (this.getEspNumEjecutivo() != null) {
            conditions += " AND ESP_NUM_EJECUTIVO = ?";
            values.add(this.getEspNumEjecutivo());
        }

        if (this.getEspNumAno() != null && this.getEspNumAno().longValue() == -999) {
            conditions += " AND ESP_NUM_ANO IS NULL";
        } else if (this.getEspNumAno() != null) {
            conditions += " AND ESP_NUM_ANO = ?";
            values.add(this.getEspNumAno());
        }

        if (this.getEspNumMes() != null && this.getEspNumMes().longValue() == -999) {
            conditions += " AND ESP_NUM_MES IS NULL";
        } else if (this.getEspNumMes() != null) {
            conditions += " AND ESP_NUM_MES = ?";
            values.add(this.getEspNumMes());
        }

        if (this.getEspNumProspec() != null && this.getEspNumProspec().longValue() == -999) {
            conditions += " AND ESP_NUM_PROSPEC IS NULL";
        } else if (this.getEspNumProspec() != null) {
            conditions += " AND ESP_NUM_PROSPEC = ?";
            values.add(this.getEspNumProspec());
        }

        if (this.getEspImpProspec() != null && this.getEspImpProspec().longValue() == -999) {
            conditions += " AND ESP_IMP_PROSPEC IS NULL";
        } else if (this.getEspImpProspec() != null) {
            conditions += " AND ESP_IMP_PROSPEC = ?";
            values.add(this.getEspImpProspec());
        }

        if (this.getEspNumContratos() != null && this.getEspNumContratos().longValue() == -999) {
            conditions += " AND ESP_NUM_CONTRATOS IS NULL";
        } else if (this.getEspNumContratos() != null) {
            conditions += " AND ESP_NUM_CONTRATOS = ?";
            values.add(this.getEspNumContratos());
        }

        if (this.getEspImpContratos() != null && this.getEspImpContratos().longValue() == -999) {
            conditions += " AND ESP_IMP_CONTRATOS IS NULL";
        } else if (this.getEspImpContratos() != null) {
            conditions += " AND ESP_IMP_CONTRATOS = ?";
            values.add(this.getEspImpContratos());
        }

        if (this.getEspNumConstituc() != null && this.getEspNumConstituc().longValue() == -999) {
            conditions += " AND ESP_NUM_CONSTITUC IS NULL";
        } else if (this.getEspNumConstituc() != null) {
            conditions += " AND ESP_NUM_CONSTITUC = ?";
            values.add(this.getEspNumConstituc());
        }

        if (this.getEspImpConstituc() != null && this.getEspImpConstituc().longValue() == -999) {
            conditions += " AND ESP_IMP_CONSTITUC IS NULL";
        } else if (this.getEspImpConstituc() != null) {
            conditions += " AND ESP_IMP_CONSTITUC = ?";
            values.add(this.getEspImpConstituc());
        }

        if (this.getEspNumRevocac() != null && this.getEspNumRevocac().longValue() == -999) {
            conditions += " AND ESP_NUM_REVOCAC IS NULL";
        } else if (this.getEspNumRevocac() != null) {
            conditions += " AND ESP_NUM_REVOCAC = ?";
            values.add(this.getEspNumRevocac());
        }

        if (this.getEspImpRevocac() != null && this.getEspImpRevocac().longValue() == -999) {
            conditions += " AND ESP_IMP_REVOCAC IS NULL";
        } else if (this.getEspImpRevocac() != null) {
            conditions += " AND ESP_IMP_REVOCAC = ?";
            values.add(this.getEspImpRevocac());
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
        String sql = "UPDATE ESTPROMO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESP_NUM_NIVEL1 = ?";
        pkValues.add(this.getEspNumNivel1());
        conditions += " AND ESP_NUM_NIVEL2 = ?";
        pkValues.add(this.getEspNumNivel2());
        conditions += " AND ESP_NUM_NIVEL3 = ?";
        pkValues.add(this.getEspNumNivel3());
        conditions += " AND ESP_NUM_NIVEL4 = ?";
        pkValues.add(this.getEspNumNivel4());
        conditions += " AND ESP_NUM_NIVEL5 = ?";
        pkValues.add(this.getEspNumNivel5());
        conditions += " AND ESP_NUM_EJECUTIVO = ?";
        pkValues.add(this.getEspNumEjecutivo());
        fields += " ESP_NUM_ANO = ?, ";
        values.add(this.getEspNumAno());
        fields += " ESP_NUM_MES = ?, ";
        values.add(this.getEspNumMes());
        fields += " ESP_NUM_PROSPEC = ?, ";
        values.add(this.getEspNumProspec());
        fields += " ESP_IMP_PROSPEC = ?, ";
        values.add(this.getEspImpProspec());
        fields += " ESP_NUM_CONTRATOS = ?, ";
        values.add(this.getEspNumContratos());
        fields += " ESP_IMP_CONTRATOS = ?, ";
        values.add(this.getEspImpContratos());
        fields += " ESP_NUM_CONSTITUC = ?, ";
        values.add(this.getEspNumConstituc());
        fields += " ESP_IMP_CONSTITUC = ?, ";
        values.add(this.getEspImpConstituc());
        fields += " ESP_NUM_REVOCAC = ?, ";
        values.add(this.getEspNumRevocac());
        fields += " ESP_IMP_REVOCAC = ?, ";
        values.add(this.getEspImpRevocac());
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
        String sql = "INSERT INTO ESTPROMO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESP_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel1());

        fields += ", ESP_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel2());

        fields += ", ESP_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel3());

        fields += ", ESP_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel4());

        fields += ", ESP_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEspNumNivel5());

        fields += ", ESP_NUM_EJECUTIVO";
        fieldValues += ", ?";
        values.add(this.getEspNumEjecutivo());

        fields += ", ESP_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEspNumAno());

        fields += ", ESP_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEspNumMes());

        fields += ", ESP_NUM_PROSPEC";
        fieldValues += ", ?";
        values.add(this.getEspNumProspec());

        fields += ", ESP_IMP_PROSPEC";
        fieldValues += ", ?";
        values.add(this.getEspImpProspec());

        fields += ", ESP_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getEspNumContratos());

        fields += ", ESP_IMP_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getEspImpContratos());

        fields += ", ESP_NUM_CONSTITUC";
        fieldValues += ", ?";
        values.add(this.getEspNumConstituc());

        fields += ", ESP_IMP_CONSTITUC";
        fieldValues += ", ?";
        values.add(this.getEspImpConstituc());

        fields += ", ESP_NUM_REVOCAC";
        fieldValues += ", ?";
        values.add(this.getEspNumRevocac());

        fields += ", ESP_IMP_REVOCAC";
        fieldValues += ", ?";
        values.add(this.getEspImpRevocac());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESTPROMO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESP_NUM_NIVEL1 = ?";
        values.add(this.getEspNumNivel1());
        conditions += " AND ESP_NUM_NIVEL2 = ?";
        values.add(this.getEspNumNivel2());
        conditions += " AND ESP_NUM_NIVEL3 = ?";
        values.add(this.getEspNumNivel3());
        conditions += " AND ESP_NUM_NIVEL4 = ?";
        values.add(this.getEspNumNivel4());
        conditions += " AND ESP_NUM_NIVEL5 = ?";
        values.add(this.getEspNumNivel5());
        conditions += " AND ESP_NUM_EJECUTIVO = ?";
        values.add(this.getEspNumEjecutivo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Estpromo instance = (Estpromo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEspNumNivel1().equals(instance.getEspNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumNivel2().equals(instance.getEspNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumNivel3().equals(instance.getEspNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumNivel4().equals(instance.getEspNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumNivel5().equals(instance.getEspNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumEjecutivo().equals(instance.getEspNumEjecutivo()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumAno().equals(instance.getEspNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumMes().equals(instance.getEspNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumProspec().equals(instance.getEspNumProspec()))
            equalObjects = false;
        if (equalObjects && !this.getEspImpProspec().equals(instance.getEspImpProspec()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumContratos().equals(instance.getEspNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getEspImpContratos().equals(instance.getEspImpContratos()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumConstituc().equals(instance.getEspNumConstituc()))
            equalObjects = false;
        if (equalObjects && !this.getEspImpConstituc().equals(instance.getEspImpConstituc()))
            equalObjects = false;
        if (equalObjects && !this.getEspNumRevocac().equals(instance.getEspNumRevocac()))
            equalObjects = false;
        if (equalObjects && !this.getEspImpRevocac().equals(instance.getEspImpRevocac()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Estpromo result = new Estpromo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEspNumNivel1((BigDecimal) objectData.getData("ESP_NUM_NIVEL1"));
        result.setEspNumNivel2((BigDecimal) objectData.getData("ESP_NUM_NIVEL2"));
        result.setEspNumNivel3((BigDecimal) objectData.getData("ESP_NUM_NIVEL3"));
        result.setEspNumNivel4((BigDecimal) objectData.getData("ESP_NUM_NIVEL4"));
        result.setEspNumNivel5((BigDecimal) objectData.getData("ESP_NUM_NIVEL5"));
        result.setEspNumEjecutivo((BigDecimal) objectData.getData("ESP_NUM_EJECUTIVO"));
        result.setEspNumAno((BigDecimal) objectData.getData("ESP_NUM_ANO"));
        result.setEspNumMes((BigDecimal) objectData.getData("ESP_NUM_MES"));
        result.setEspNumProspec((BigDecimal) objectData.getData("ESP_NUM_PROSPEC"));
        result.setEspImpProspec((BigDecimal) objectData.getData("ESP_IMP_PROSPEC"));
        result.setEspNumContratos((BigDecimal) objectData.getData("ESP_NUM_CONTRATOS"));
        result.setEspImpContratos((BigDecimal) objectData.getData("ESP_IMP_CONTRATOS"));
        result.setEspNumConstituc((BigDecimal) objectData.getData("ESP_NUM_CONSTITUC"));
        result.setEspImpConstituc((BigDecimal) objectData.getData("ESP_IMP_CONSTITUC"));
        result.setEspNumRevocac((BigDecimal) objectData.getData("ESP_NUM_REVOCAC"));
        result.setEspImpRevocac((BigDecimal) objectData.getData("ESP_IMP_REVOCAC"));

        return result;

    }

}
