package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "POLHONOR_PK", columns = { "PHO_CODIGO_SISTEMA" }, sequences = { "MAX" })
public class Polhonor extends DomainObject {

    String phoCodigoSistema = null;
    String phoCveCicloCort = null;
    BigDecimal phoCveExtemporan = null;
    BigDecimal phoPjeTasaExtem = null;
    BigDecimal phoCveCondona = null;
    BigDecimal phoCveCambioTas = null;
    BigDecimal phoCveAvisoCobr = null;
    BigDecimal phoCveCarFondo = null;
    BigDecimal phoCveCarCuenta = null;
    BigDecimal phoCveDiasComer = null;
    BigDecimal phoNumPerCarven = null;
    BigDecimal phoAnoAltaReg = null;
    BigDecimal phoMesAltaReg = null;
    BigDecimal phoDiaAltaReg = null;
    BigDecimal phoAnoUltMod = null;
    BigDecimal phoMesUltMod = null;
    BigDecimal phoDiaUltMod = null;
    String phoCveStPolhono = null;

    public Polhonor() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPhoCodigoSistema(String phoCodigoSistema) {
        this.phoCodigoSistema = phoCodigoSistema;
    }

    public String getPhoCodigoSistema() {
        return this.phoCodigoSistema;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPhoCveCicloCort(String phoCveCicloCort) {
        this.phoCveCicloCort = phoCveCicloCort;
    }

    public String getPhoCveCicloCort() {
        return this.phoCveCicloCort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoCveExtemporan(BigDecimal phoCveExtemporan) {
        this.phoCveExtemporan = phoCveExtemporan;
    }

    public BigDecimal getPhoCveExtemporan() {
        return this.phoCveExtemporan;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 4, javaClass = BigDecimal.class)
    public void setPhoPjeTasaExtem(BigDecimal phoPjeTasaExtem) {
        this.phoPjeTasaExtem = phoPjeTasaExtem;
    }

    public BigDecimal getPhoPjeTasaExtem() {
        return this.phoPjeTasaExtem;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoCveCondona(BigDecimal phoCveCondona) {
        this.phoCveCondona = phoCveCondona;
    }

    public BigDecimal getPhoCveCondona() {
        return this.phoCveCondona;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoCveCambioTas(BigDecimal phoCveCambioTas) {
        this.phoCveCambioTas = phoCveCambioTas;
    }

    public BigDecimal getPhoCveCambioTas() {
        return this.phoCveCambioTas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoCveAvisoCobr(BigDecimal phoCveAvisoCobr) {
        this.phoCveAvisoCobr = phoCveAvisoCobr;
    }

    public BigDecimal getPhoCveAvisoCobr() {
        return this.phoCveAvisoCobr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoCveCarFondo(BigDecimal phoCveCarFondo) {
        this.phoCveCarFondo = phoCveCarFondo;
    }

    public BigDecimal getPhoCveCarFondo() {
        return this.phoCveCarFondo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoCveCarCuenta(BigDecimal phoCveCarCuenta) {
        this.phoCveCarCuenta = phoCveCarCuenta;
    }

    public BigDecimal getPhoCveCarCuenta() {
        return this.phoCveCarCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoCveDiasComer(BigDecimal phoCveDiasComer) {
        this.phoCveDiasComer = phoCveDiasComer;
    }

    public BigDecimal getPhoCveDiasComer() {
        return this.phoCveDiasComer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPhoNumPerCarven(BigDecimal phoNumPerCarven) {
        this.phoNumPerCarven = phoNumPerCarven;
    }

    public BigDecimal getPhoNumPerCarven() {
        return this.phoNumPerCarven;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoAnoAltaReg(BigDecimal phoAnoAltaReg) {
        this.phoAnoAltaReg = phoAnoAltaReg;
    }

    public BigDecimal getPhoAnoAltaReg() {
        return this.phoAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPhoMesAltaReg(BigDecimal phoMesAltaReg) {
        this.phoMesAltaReg = phoMesAltaReg;
    }

    public BigDecimal getPhoMesAltaReg() {
        return this.phoMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPhoDiaAltaReg(BigDecimal phoDiaAltaReg) {
        this.phoDiaAltaReg = phoDiaAltaReg;
    }

    public BigDecimal getPhoDiaAltaReg() {
        return this.phoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPhoAnoUltMod(BigDecimal phoAnoUltMod) {
        this.phoAnoUltMod = phoAnoUltMod;
    }

    public BigDecimal getPhoAnoUltMod() {
        return this.phoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPhoMesUltMod(BigDecimal phoMesUltMod) {
        this.phoMesUltMod = phoMesUltMod;
    }

    public BigDecimal getPhoMesUltMod() {
        return this.phoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPhoDiaUltMod(BigDecimal phoDiaUltMod) {
        this.phoDiaUltMod = phoDiaUltMod;
    }

    public BigDecimal getPhoDiaUltMod() {
        return this.phoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPhoCveStPolhono(String phoCveStPolhono) {
        this.phoCveStPolhono = phoCveStPolhono;
    }

    public String getPhoCveStPolhono() {
        return this.phoCveStPolhono;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM POLHONOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPhoCodigoSistema() != null && "null".equals(this.getPhoCodigoSistema())) {
            conditions += " AND PHO_CODIGO_SISTEMA IS NULL";
        } else if (this.getPhoCodigoSistema() != null) {
            conditions += " AND PHO_CODIGO_SISTEMA = ?";
            values.add(this.getPhoCodigoSistema());
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
        String sql = "SELECT * FROM POLHONOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPhoCodigoSistema() != null && "null".equals(this.getPhoCodigoSistema())) {
            conditions += " AND PHO_CODIGO_SISTEMA IS NULL";
        } else if (this.getPhoCodigoSistema() != null) {
            conditions += " AND PHO_CODIGO_SISTEMA = ?";
            values.add(this.getPhoCodigoSistema());
        }

        if (this.getPhoCveCicloCort() != null && "null".equals(this.getPhoCveCicloCort())) {
            conditions += " AND PHO_CVE_CICLO_CORT IS NULL";
        } else if (this.getPhoCveCicloCort() != null) {
            conditions += " AND PHO_CVE_CICLO_CORT = ?";
            values.add(this.getPhoCveCicloCort());
        }

        if (this.getPhoCveExtemporan() != null && this.getPhoCveExtemporan().longValue() == -999) {
            conditions += " AND PHO_CVE_EXTEMPORAN IS NULL";
        } else if (this.getPhoCveExtemporan() != null) {
            conditions += " AND PHO_CVE_EXTEMPORAN = ?";
            values.add(this.getPhoCveExtemporan());
        }

        if (this.getPhoPjeTasaExtem() != null && this.getPhoPjeTasaExtem().longValue() == -999) {
            conditions += " AND PHO_PJE_TASA_EXTEM IS NULL";
        } else if (this.getPhoPjeTasaExtem() != null) {
            conditions += " AND PHO_PJE_TASA_EXTEM = ?";
            values.add(this.getPhoPjeTasaExtem());
        }

        if (this.getPhoCveCondona() != null && this.getPhoCveCondona().longValue() == -999) {
            conditions += " AND PHO_CVE_CONDONA IS NULL";
        } else if (this.getPhoCveCondona() != null) {
            conditions += " AND PHO_CVE_CONDONA = ?";
            values.add(this.getPhoCveCondona());
        }

        if (this.getPhoCveCambioTas() != null && this.getPhoCveCambioTas().longValue() == -999) {
            conditions += " AND PHO_CVE_CAMBIO_TAS IS NULL";
        } else if (this.getPhoCveCambioTas() != null) {
            conditions += " AND PHO_CVE_CAMBIO_TAS = ?";
            values.add(this.getPhoCveCambioTas());
        }

        if (this.getPhoCveAvisoCobr() != null && this.getPhoCveAvisoCobr().longValue() == -999) {
            conditions += " AND PHO_CVE_AVISO_COBR IS NULL";
        } else if (this.getPhoCveAvisoCobr() != null) {
            conditions += " AND PHO_CVE_AVISO_COBR = ?";
            values.add(this.getPhoCveAvisoCobr());
        }

        if (this.getPhoCveCarFondo() != null && this.getPhoCveCarFondo().longValue() == -999) {
            conditions += " AND PHO_CVE_CAR_FONDO IS NULL";
        } else if (this.getPhoCveCarFondo() != null) {
            conditions += " AND PHO_CVE_CAR_FONDO = ?";
            values.add(this.getPhoCveCarFondo());
        }

        if (this.getPhoCveCarCuenta() != null && this.getPhoCveCarCuenta().longValue() == -999) {
            conditions += " AND PHO_CVE_CAR_CUENTA IS NULL";
        } else if (this.getPhoCveCarCuenta() != null) {
            conditions += " AND PHO_CVE_CAR_CUENTA = ?";
            values.add(this.getPhoCveCarCuenta());
        }

        if (this.getPhoCveDiasComer() != null && this.getPhoCveDiasComer().longValue() == -999) {
            conditions += " AND PHO_CVE_DIAS_COMER IS NULL";
        } else if (this.getPhoCveDiasComer() != null) {
            conditions += " AND PHO_CVE_DIAS_COMER = ?";
            values.add(this.getPhoCveDiasComer());
        }

        if (this.getPhoNumPerCarven() != null && this.getPhoNumPerCarven().longValue() == -999) {
            conditions += " AND PHO_NUM_PER_CARVEN IS NULL";
        } else if (this.getPhoNumPerCarven() != null) {
            conditions += " AND PHO_NUM_PER_CARVEN = ?";
            values.add(this.getPhoNumPerCarven());
        }

        if (this.getPhoAnoAltaReg() != null && this.getPhoAnoAltaReg().longValue() == -999) {
            conditions += " AND PHO_ANO_ALTA_REG IS NULL";
        } else if (this.getPhoAnoAltaReg() != null) {
            conditions += " AND PHO_ANO_ALTA_REG = ?";
            values.add(this.getPhoAnoAltaReg());
        }

        if (this.getPhoMesAltaReg() != null && this.getPhoMesAltaReg().longValue() == -999) {
            conditions += " AND PHO_MES_ALTA_REG IS NULL";
        } else if (this.getPhoMesAltaReg() != null) {
            conditions += " AND PHO_MES_ALTA_REG = ?";
            values.add(this.getPhoMesAltaReg());
        }

        if (this.getPhoDiaAltaReg() != null && this.getPhoDiaAltaReg().longValue() == -999) {
            conditions += " AND PHO_DIA_ALTA_REG IS NULL";
        } else if (this.getPhoDiaAltaReg() != null) {
            conditions += " AND PHO_DIA_ALTA_REG = ?";
            values.add(this.getPhoDiaAltaReg());
        }

        if (this.getPhoAnoUltMod() != null && this.getPhoAnoUltMod().longValue() == -999) {
            conditions += " AND PHO_ANO_ULT_MOD IS NULL";
        } else if (this.getPhoAnoUltMod() != null) {
            conditions += " AND PHO_ANO_ULT_MOD = ?";
            values.add(this.getPhoAnoUltMod());
        }

        if (this.getPhoMesUltMod() != null && this.getPhoMesUltMod().longValue() == -999) {
            conditions += " AND PHO_MES_ULT_MOD IS NULL";
        } else if (this.getPhoMesUltMod() != null) {
            conditions += " AND PHO_MES_ULT_MOD = ?";
            values.add(this.getPhoMesUltMod());
        }

        if (this.getPhoDiaUltMod() != null && this.getPhoDiaUltMod().longValue() == -999) {
            conditions += " AND PHO_DIA_ULT_MOD IS NULL";
        } else if (this.getPhoDiaUltMod() != null) {
            conditions += " AND PHO_DIA_ULT_MOD = ?";
            values.add(this.getPhoDiaUltMod());
        }

        if (this.getPhoCveStPolhono() != null && "null".equals(this.getPhoCveStPolhono())) {
            conditions += " AND PHO_CVE_ST_POLHONO IS NULL";
        } else if (this.getPhoCveStPolhono() != null) {
            conditions += " AND PHO_CVE_ST_POLHONO = ?";
            values.add(this.getPhoCveStPolhono());
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
        String sql = "UPDATE POLHONOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PHO_CODIGO_SISTEMA = ?";
        pkValues.add(this.getPhoCodigoSistema());
        fields += " PHO_CVE_CICLO_CORT = ?, ";
        values.add(this.getPhoCveCicloCort());
        fields += " PHO_CVE_EXTEMPORAN = ?, ";
        values.add(this.getPhoCveExtemporan());
        fields += " PHO_PJE_TASA_EXTEM = ?, ";
        values.add(this.getPhoPjeTasaExtem());
        fields += " PHO_CVE_CONDONA = ?, ";
        values.add(this.getPhoCveCondona());
        fields += " PHO_CVE_CAMBIO_TAS = ?, ";
        values.add(this.getPhoCveCambioTas());
        fields += " PHO_CVE_AVISO_COBR = ?, ";
        values.add(this.getPhoCveAvisoCobr());
        fields += " PHO_CVE_CAR_FONDO = ?, ";
        values.add(this.getPhoCveCarFondo());
        fields += " PHO_CVE_CAR_CUENTA = ?, ";
        values.add(this.getPhoCveCarCuenta());
        fields += " PHO_CVE_DIAS_COMER = ?, ";
        values.add(this.getPhoCveDiasComer());
        fields += " PHO_NUM_PER_CARVEN = ?, ";
        values.add(this.getPhoNumPerCarven());
        fields += " PHO_ANO_ALTA_REG = ?, ";
        values.add(this.getPhoAnoAltaReg());
        fields += " PHO_MES_ALTA_REG = ?, ";
        values.add(this.getPhoMesAltaReg());
        fields += " PHO_DIA_ALTA_REG = ?, ";
        values.add(this.getPhoDiaAltaReg());
        fields += " PHO_ANO_ULT_MOD = ?, ";
        values.add(this.getPhoAnoUltMod());
        fields += " PHO_MES_ULT_MOD = ?, ";
        values.add(this.getPhoMesUltMod());
        fields += " PHO_DIA_ULT_MOD = ?, ";
        values.add(this.getPhoDiaUltMod());
        fields += " PHO_CVE_ST_POLHONO = ?, ";
        values.add(this.getPhoCveStPolhono());
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
        String sql = "INSERT INTO POLHONOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PHO_CODIGO_SISTEMA";
        fieldValues += ", ?";
        values.add(this.getPhoCodigoSistema());

        fields += ", PHO_CVE_CICLO_CORT";
        fieldValues += ", ?";
        values.add(this.getPhoCveCicloCort());

        fields += ", PHO_CVE_EXTEMPORAN";
        fieldValues += ", ?";
        values.add(this.getPhoCveExtemporan());

        fields += ", PHO_PJE_TASA_EXTEM";
        fieldValues += ", ?";
        values.add(this.getPhoPjeTasaExtem());

        fields += ", PHO_CVE_CONDONA";
        fieldValues += ", ?";
        values.add(this.getPhoCveCondona());

        fields += ", PHO_CVE_CAMBIO_TAS";
        fieldValues += ", ?";
        values.add(this.getPhoCveCambioTas());

        fields += ", PHO_CVE_AVISO_COBR";
        fieldValues += ", ?";
        values.add(this.getPhoCveAvisoCobr());

        fields += ", PHO_CVE_CAR_FONDO";
        fieldValues += ", ?";
        values.add(this.getPhoCveCarFondo());

        fields += ", PHO_CVE_CAR_CUENTA";
        fieldValues += ", ?";
        values.add(this.getPhoCveCarCuenta());

        fields += ", PHO_CVE_DIAS_COMER";
        fieldValues += ", ?";
        values.add(this.getPhoCveDiasComer());

        fields += ", PHO_NUM_PER_CARVEN";
        fieldValues += ", ?";
        values.add(this.getPhoNumPerCarven());

        fields += ", PHO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPhoAnoAltaReg());

        fields += ", PHO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPhoMesAltaReg());

        fields += ", PHO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPhoDiaAltaReg());

        fields += ", PHO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPhoAnoUltMod());

        fields += ", PHO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPhoMesUltMod());

        fields += ", PHO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPhoDiaUltMod());

        fields += ", PHO_CVE_ST_POLHONO";
        fieldValues += ", ?";
        values.add(this.getPhoCveStPolhono());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM POLHONOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PHO_CODIGO_SISTEMA = ?";
        values.add(this.getPhoCodigoSistema());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Polhonor instance = (Polhonor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPhoCodigoSistema().equals(instance.getPhoCodigoSistema()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveCicloCort().equals(instance.getPhoCveCicloCort()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveExtemporan().equals(instance.getPhoCveExtemporan()))
            equalObjects = false;
        if (equalObjects && !this.getPhoPjeTasaExtem().equals(instance.getPhoPjeTasaExtem()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveCondona().equals(instance.getPhoCveCondona()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveCambioTas().equals(instance.getPhoCveCambioTas()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveAvisoCobr().equals(instance.getPhoCveAvisoCobr()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveCarFondo().equals(instance.getPhoCveCarFondo()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveCarCuenta().equals(instance.getPhoCveCarCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveDiasComer().equals(instance.getPhoCveDiasComer()))
            equalObjects = false;
        if (equalObjects && !this.getPhoNumPerCarven().equals(instance.getPhoNumPerCarven()))
            equalObjects = false;
        if (equalObjects && !this.getPhoAnoAltaReg().equals(instance.getPhoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPhoMesAltaReg().equals(instance.getPhoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPhoDiaAltaReg().equals(instance.getPhoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPhoAnoUltMod().equals(instance.getPhoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPhoMesUltMod().equals(instance.getPhoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPhoDiaUltMod().equals(instance.getPhoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPhoCveStPolhono().equals(instance.getPhoCveStPolhono()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Polhonor result = new Polhonor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPhoCodigoSistema((String) objectData.getData("PHO_CODIGO_SISTEMA"));
        result.setPhoCveCicloCort((String) objectData.getData("PHO_CVE_CICLO_CORT"));
        result.setPhoCveExtemporan((BigDecimal) objectData.getData("PHO_CVE_EXTEMPORAN"));
        result.setPhoPjeTasaExtem((BigDecimal) objectData.getData("PHO_PJE_TASA_EXTEM"));
        result.setPhoCveCondona((BigDecimal) objectData.getData("PHO_CVE_CONDONA"));
        result.setPhoCveCambioTas((BigDecimal) objectData.getData("PHO_CVE_CAMBIO_TAS"));
        result.setPhoCveAvisoCobr((BigDecimal) objectData.getData("PHO_CVE_AVISO_COBR"));
        result.setPhoCveCarFondo((BigDecimal) objectData.getData("PHO_CVE_CAR_FONDO"));
        result.setPhoCveCarCuenta((BigDecimal) objectData.getData("PHO_CVE_CAR_CUENTA"));
        result.setPhoCveDiasComer((BigDecimal) objectData.getData("PHO_CVE_DIAS_COMER"));
        result.setPhoNumPerCarven((BigDecimal) objectData.getData("PHO_NUM_PER_CARVEN"));
        result.setPhoAnoAltaReg((BigDecimal) objectData.getData("PHO_ANO_ALTA_REG"));
        result.setPhoMesAltaReg((BigDecimal) objectData.getData("PHO_MES_ALTA_REG"));
        result.setPhoDiaAltaReg((BigDecimal) objectData.getData("PHO_DIA_ALTA_REG"));
        result.setPhoAnoUltMod((BigDecimal) objectData.getData("PHO_ANO_ULT_MOD"));
        result.setPhoMesUltMod((BigDecimal) objectData.getData("PHO_MES_ULT_MOD"));
        result.setPhoDiaUltMod((BigDecimal) objectData.getData("PHO_DIA_ULT_MOD"));
        result.setPhoCveStPolhono((String) objectData.getData("PHO_CVE_ST_POLHONO"));

        return result;

    }

}
