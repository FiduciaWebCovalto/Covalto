package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ANTEPROY_MSA_PK", columns = { "ANT_ANO_INF", "ANT_MES_INF", "ANT_NUM_PROSPECTO" }, sequences = { "MANUAL" })
public class AnteproyMsa extends DomainObject {

    BigDecimal antAnoInf = null;
    BigDecimal antMesInf = null;
    BigDecimal antNumProspecto = null;
    String antFechaApertura = null;
    BigDecimal antNumPromotor = null;
    String antCveFormMan = null;
    String antCveTipoNeg = null;
    String antCveClasifPro = null;
    BigDecimal antNumProducto = null;
    BigDecimal antCveComite = null;
    BigDecimal antCveRevocable = null;
    BigDecimal antImpApertura = null;
    String antCveStProspec = null;
    String antDesGestion = null;
    String antFecGestion = null;
    Long antPatrimonio = null;
    BigDecimal antNumAbogado = null;
    String antNomNegocio = null;
    String antCveSituacion = null;
    String antFecProConsti = null;
    String antNomActividad = null;
    String antTipoClient = null;
    String antTipoPublic = null;
    String antTipoContacto = null;
    String antNumEscritura = null;
    BigDecimal antNumNotario = null;
    String antTipoAdmon = null;
    BigDecimal antAnoConmod1 = null;
    BigDecimal antMesConmod1 = null;
    BigDecimal antDiaConmod1 = null;
    BigDecimal antAnoConmod2 = null;
    BigDecimal antMesConmod2 = null;
    BigDecimal antDiaConmod2 = null;
    BigDecimal antAnoConmod3 = null;
    BigDecimal antMesConmod3 = null;
    BigDecimal antDiaConmod3 = null;
    BigDecimal antNumContrato = null;
    String antSeguimiento = null;
    BigDecimal antTipoNegSat = null;

    public AnteproyMsa() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAntAnoInf(BigDecimal antAnoInf) {
        this.antAnoInf = antAnoInf;
    }

    public BigDecimal getAntAnoInf() {
        return this.antAnoInf;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAntMesInf(BigDecimal antMesInf) {
        this.antMesInf = antMesInf;
    }

    public BigDecimal getAntMesInf() {
        return this.antMesInf;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAntNumProspecto(BigDecimal antNumProspecto) {
        this.antNumProspecto = antNumProspecto;
    }

    public BigDecimal getAntNumProspecto() {
        return this.antNumProspecto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntFechaApertura(String antFechaApertura) {
        this.antFechaApertura = antFechaApertura;
    }

    public String getAntFechaApertura() {
        return this.antFechaApertura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAntNumPromotor(BigDecimal antNumPromotor) {
        this.antNumPromotor = antNumPromotor;
    }

    public BigDecimal getAntNumPromotor() {
        return this.antNumPromotor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntCveFormMan(String antCveFormMan) {
        this.antCveFormMan = antCveFormMan;
    }

    public String getAntCveFormMan() {
        return this.antCveFormMan;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntCveTipoNeg(String antCveTipoNeg) {
        this.antCveTipoNeg = antCveTipoNeg;
    }

    public String getAntCveTipoNeg() {
        return this.antCveTipoNeg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntCveClasifPro(String antCveClasifPro) {
        this.antCveClasifPro = antCveClasifPro;
    }

    public String getAntCveClasifPro() {
        return this.antCveClasifPro;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAntNumProducto(BigDecimal antNumProducto) {
        this.antNumProducto = antNumProducto;
    }

    public BigDecimal getAntNumProducto() {
        return this.antNumProducto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setAntCveComite(BigDecimal antCveComite) {
        this.antCveComite = antCveComite;
    }

    public BigDecimal getAntCveComite() {
        return this.antCveComite;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setAntCveRevocable(BigDecimal antCveRevocable) {
        this.antCveRevocable = antCveRevocable;
    }

    public BigDecimal getAntCveRevocable() {
        return this.antCveRevocable;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setAntImpApertura(BigDecimal antImpApertura) {
        this.antImpApertura = antImpApertura;
    }

    public BigDecimal getAntImpApertura() {
        return this.antImpApertura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntCveStProspec(String antCveStProspec) {
        this.antCveStProspec = antCveStProspec;
    }

    public String getAntCveStProspec() {
        return this.antCveStProspec;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntDesGestion(String antDesGestion) {
        this.antDesGestion = antDesGestion;
    }

    public String getAntDesGestion() {
        return this.antDesGestion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntFecGestion(String antFecGestion) {
        this.antFecGestion = antFecGestion;
    }

    public String getAntFecGestion() {
        return this.antFecGestion;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setAntPatrimonio(Long antPatrimonio) {
        this.antPatrimonio = antPatrimonio;
    }

    public Long getAntPatrimonio() {
        return this.antPatrimonio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAntNumAbogado(BigDecimal antNumAbogado) {
        this.antNumAbogado = antNumAbogado;
    }

    public BigDecimal getAntNumAbogado() {
        return this.antNumAbogado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntNomNegocio(String antNomNegocio) {
        this.antNomNegocio = antNomNegocio;
    }

    public String getAntNomNegocio() {
        return this.antNomNegocio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntCveSituacion(String antCveSituacion) {
        this.antCveSituacion = antCveSituacion;
    }

    public String getAntCveSituacion() {
        return this.antCveSituacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntFecProConsti(String antFecProConsti) {
        this.antFecProConsti = antFecProConsti;
    }

    public String getAntFecProConsti() {
        return this.antFecProConsti;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntNomActividad(String antNomActividad) {
        this.antNomActividad = antNomActividad;
    }

    public String getAntNomActividad() {
        return this.antNomActividad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntTipoClient(String antTipoClient) {
        this.antTipoClient = antTipoClient;
    }

    public String getAntTipoClient() {
        return this.antTipoClient;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntTipoPublic(String antTipoPublic) {
        this.antTipoPublic = antTipoPublic;
    }

    public String getAntTipoPublic() {
        return this.antTipoPublic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntTipoContacto(String antTipoContacto) {
        this.antTipoContacto = antTipoContacto;
    }

    public String getAntTipoContacto() {
        return this.antTipoContacto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntNumEscritura(String antNumEscritura) {
        this.antNumEscritura = antNumEscritura;
    }

    public String getAntNumEscritura() {
        return this.antNumEscritura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAntNumNotario(BigDecimal antNumNotario) {
        this.antNumNotario = antNumNotario;
    }

    public BigDecimal getAntNumNotario() {
        return this.antNumNotario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntTipoAdmon(String antTipoAdmon) {
        this.antTipoAdmon = antTipoAdmon;
    }

    public String getAntTipoAdmon() {
        return this.antTipoAdmon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAntAnoConmod1(BigDecimal antAnoConmod1) {
        this.antAnoConmod1 = antAnoConmod1;
    }

    public BigDecimal getAntAnoConmod1() {
        return this.antAnoConmod1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAntMesConmod1(BigDecimal antMesConmod1) {
        this.antMesConmod1 = antMesConmod1;
    }

    public BigDecimal getAntMesConmod1() {
        return this.antMesConmod1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAntDiaConmod1(BigDecimal antDiaConmod1) {
        this.antDiaConmod1 = antDiaConmod1;
    }

    public BigDecimal getAntDiaConmod1() {
        return this.antDiaConmod1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAntAnoConmod2(BigDecimal antAnoConmod2) {
        this.antAnoConmod2 = antAnoConmod2;
    }

    public BigDecimal getAntAnoConmod2() {
        return this.antAnoConmod2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAntMesConmod2(BigDecimal antMesConmod2) {
        this.antMesConmod2 = antMesConmod2;
    }

    public BigDecimal getAntMesConmod2() {
        return this.antMesConmod2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAntDiaConmod2(BigDecimal antDiaConmod2) {
        this.antDiaConmod2 = antDiaConmod2;
    }

    public BigDecimal getAntDiaConmod2() {
        return this.antDiaConmod2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAntAnoConmod3(BigDecimal antAnoConmod3) {
        this.antAnoConmod3 = antAnoConmod3;
    }

    public BigDecimal getAntAnoConmod3() {
        return this.antAnoConmod3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAntMesConmod3(BigDecimal antMesConmod3) {
        this.antMesConmod3 = antMesConmod3;
    }

    public BigDecimal getAntMesConmod3() {
        return this.antMesConmod3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAntDiaConmod3(BigDecimal antDiaConmod3) {
        this.antDiaConmod3 = antDiaConmod3;
    }

    public BigDecimal getAntDiaConmod3() {
        return this.antDiaConmod3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAntNumContrato(BigDecimal antNumContrato) {
        this.antNumContrato = antNumContrato;
    }

    public BigDecimal getAntNumContrato() {
        return this.antNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAntSeguimiento(String antSeguimiento) {
        this.antSeguimiento = antSeguimiento;
    }

    public String getAntSeguimiento() {
        return this.antSeguimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAntTipoNegSat(BigDecimal antTipoNegSat) {
        this.antTipoNegSat = antTipoNegSat;
    }

    public BigDecimal getAntTipoNegSat() {
        return this.antTipoNegSat;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ANTEPROY_MSA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAntAnoInf() != null && this.getAntAnoInf().longValue() == -999) {
            conditions += " AND ANT_ANO_INF IS NULL";
        } else if (this.getAntAnoInf() != null) {
            conditions += " AND ANT_ANO_INF = ?";
            values.add(this.getAntAnoInf());
        }

        if (this.getAntMesInf() != null && this.getAntMesInf().longValue() == -999) {
            conditions += " AND ANT_MES_INF IS NULL";
        } else if (this.getAntMesInf() != null) {
            conditions += " AND ANT_MES_INF = ?";
            values.add(this.getAntMesInf());
        }

        if (this.getAntNumProspecto() != null && this.getAntNumProspecto().longValue() == -999) {
            conditions += " AND ANT_NUM_PROSPECTO IS NULL";
        } else if (this.getAntNumProspecto() != null) {
            conditions += " AND ANT_NUM_PROSPECTO = ?";
            values.add(this.getAntNumProspecto());
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
        String sql = "SELECT * FROM ANTEPROY_MSA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAntAnoInf() != null && this.getAntAnoInf().longValue() == -999) {
            conditions += " AND ANT_ANO_INF IS NULL";
        } else if (this.getAntAnoInf() != null) {
            conditions += " AND ANT_ANO_INF = ?";
            values.add(this.getAntAnoInf());
        }

        if (this.getAntMesInf() != null && this.getAntMesInf().longValue() == -999) {
            conditions += " AND ANT_MES_INF IS NULL";
        } else if (this.getAntMesInf() != null) {
            conditions += " AND ANT_MES_INF = ?";
            values.add(this.getAntMesInf());
        }

        if (this.getAntNumProspecto() != null && this.getAntNumProspecto().longValue() == -999) {
            conditions += " AND ANT_NUM_PROSPECTO IS NULL";
        } else if (this.getAntNumProspecto() != null) {
            conditions += " AND ANT_NUM_PROSPECTO = ?";
            values.add(this.getAntNumProspecto());
        }

        if (this.getAntFechaApertura() != null && "null".equals(this.getAntFechaApertura())) {
            conditions += " AND ANT_FECHA_APERTURA IS NULL";
        } else if (this.getAntFechaApertura() != null) {
            conditions += " AND ANT_FECHA_APERTURA = ?";
            values.add(this.getAntFechaApertura());
        }

        if (this.getAntNumPromotor() != null && this.getAntNumPromotor().longValue() == -999) {
            conditions += " AND ANT_NUM_PROMOTOR IS NULL";
        } else if (this.getAntNumPromotor() != null) {
            conditions += " AND ANT_NUM_PROMOTOR = ?";
            values.add(this.getAntNumPromotor());
        }

        if (this.getAntCveFormMan() != null && "null".equals(this.getAntCveFormMan())) {
            conditions += " AND ANT_CVE_FORM_MAN IS NULL";
        } else if (this.getAntCveFormMan() != null) {
            conditions += " AND ANT_CVE_FORM_MAN = ?";
            values.add(this.getAntCveFormMan());
        }

        if (this.getAntCveTipoNeg() != null && "null".equals(this.getAntCveTipoNeg())) {
            conditions += " AND ANT_CVE_TIPO_NEG IS NULL";
        } else if (this.getAntCveTipoNeg() != null) {
            conditions += " AND ANT_CVE_TIPO_NEG = ?";
            values.add(this.getAntCveTipoNeg());
        }

        if (this.getAntCveClasifPro() != null && "null".equals(this.getAntCveClasifPro())) {
            conditions += " AND ANT_CVE_CLASIF_PRO IS NULL";
        } else if (this.getAntCveClasifPro() != null) {
            conditions += " AND ANT_CVE_CLASIF_PRO = ?";
            values.add(this.getAntCveClasifPro());
        }

        if (this.getAntNumProducto() != null && this.getAntNumProducto().longValue() == -999) {
            conditions += " AND ANT_NUM_PRODUCTO IS NULL";
        } else if (this.getAntNumProducto() != null) {
            conditions += " AND ANT_NUM_PRODUCTO = ?";
            values.add(this.getAntNumProducto());
        }

        if (this.getAntCveComite() != null && this.getAntCveComite().longValue() == -999) {
            conditions += " AND ANT_CVE_COMITE IS NULL";
        } else if (this.getAntCveComite() != null) {
            conditions += " AND ANT_CVE_COMITE = ?";
            values.add(this.getAntCveComite());
        }

        if (this.getAntCveRevocable() != null && this.getAntCveRevocable().longValue() == -999) {
            conditions += " AND ANT_CVE_REVOCABLE IS NULL";
        } else if (this.getAntCveRevocable() != null) {
            conditions += " AND ANT_CVE_REVOCABLE = ?";
            values.add(this.getAntCveRevocable());
        }

        if (this.getAntImpApertura() != null && this.getAntImpApertura().longValue() == -999) {
            conditions += " AND ANT_IMP_APERTURA IS NULL";
        } else if (this.getAntImpApertura() != null) {
            conditions += " AND ANT_IMP_APERTURA = ?";
            values.add(this.getAntImpApertura());
        }

        if (this.getAntCveStProspec() != null && "null".equals(this.getAntCveStProspec())) {
            conditions += " AND ANT_CVE_ST_PROSPEC IS NULL";
        } else if (this.getAntCveStProspec() != null) {
            conditions += " AND ANT_CVE_ST_PROSPEC = ?";
            values.add(this.getAntCveStProspec());
        }

        if (this.getAntDesGestion() != null && "null".equals(this.getAntDesGestion())) {
            conditions += " AND ANT_DES_GESTION IS NULL";
        } else if (this.getAntDesGestion() != null) {
            conditions += " AND ANT_DES_GESTION = ?";
            values.add(this.getAntDesGestion());
        }

        if (this.getAntFecGestion() != null && "null".equals(this.getAntFecGestion())) {
            conditions += " AND ANT_FEC_GESTION IS NULL";
        } else if (this.getAntFecGestion() != null) {
            conditions += " AND ANT_FEC_GESTION = ?";
            values.add(this.getAntFecGestion());
        }

        if (this.getAntPatrimonio() != null && this.getAntPatrimonio() == -999) {
            conditions += " AND ANT_PATRIMONIO IS NULL";
        } else if (this.getAntPatrimonio() != null) {
            conditions += " AND ANT_PATRIMONIO = ?";
            values.add(this.getAntPatrimonio());
        }

        if (this.getAntNumAbogado() != null && this.getAntNumAbogado().longValue() == -999) {
            conditions += " AND ANT_NUM_ABOGADO IS NULL";
        } else if (this.getAntNumAbogado() != null) {
            conditions += " AND ANT_NUM_ABOGADO = ?";
            values.add(this.getAntNumAbogado());
        }

        if (this.getAntNomNegocio() != null && "null".equals(this.getAntNomNegocio())) {
            conditions += " AND ANT_NOM_NEGOCIO IS NULL";
        } else if (this.getAntNomNegocio() != null) {
            conditions += " AND ANT_NOM_NEGOCIO = ?";
            values.add(this.getAntNomNegocio());
        }

        if (this.getAntCveSituacion() != null && "null".equals(this.getAntCveSituacion())) {
            conditions += " AND ANT_CVE_SITUACION IS NULL";
        } else if (this.getAntCveSituacion() != null) {
            conditions += " AND ANT_CVE_SITUACION = ?";
            values.add(this.getAntCveSituacion());
        }

        if (this.getAntFecProConsti() != null && "null".equals(this.getAntFecProConsti())) {
            conditions += " AND ANT_FEC_PRO_CONSTI IS NULL";
        } else if (this.getAntFecProConsti() != null) {
            conditions += " AND ANT_FEC_PRO_CONSTI = ?";
            values.add(this.getAntFecProConsti());
        }

        if (this.getAntNomActividad() != null && "null".equals(this.getAntNomActividad())) {
            conditions += " AND ANT_NOM_ACTIVIDAD IS NULL";
        } else if (this.getAntNomActividad() != null) {
            conditions += " AND ANT_NOM_ACTIVIDAD = ?";
            values.add(this.getAntNomActividad());
        }

        if (this.getAntTipoClient() != null && "null".equals(this.getAntTipoClient())) {
            conditions += " AND ANT_TIPO_CLIENT IS NULL";
        } else if (this.getAntTipoClient() != null) {
            conditions += " AND ANT_TIPO_CLIENT = ?";
            values.add(this.getAntTipoClient());
        }

        if (this.getAntTipoPublic() != null && "null".equals(this.getAntTipoPublic())) {
            conditions += " AND ANT_TIPO_PUBLIC IS NULL";
        } else if (this.getAntTipoPublic() != null) {
            conditions += " AND ANT_TIPO_PUBLIC = ?";
            values.add(this.getAntTipoPublic());
        }

        if (this.getAntTipoContacto() != null && "null".equals(this.getAntTipoContacto())) {
            conditions += " AND ANT_TIPO_CONTACTO IS NULL";
        } else if (this.getAntTipoContacto() != null) {
            conditions += " AND ANT_TIPO_CONTACTO = ?";
            values.add(this.getAntTipoContacto());
        }

        if (this.getAntNumEscritura() != null && "null".equals(this.getAntNumEscritura())) {
            conditions += " AND ANT_NUM_ESCRITURA IS NULL";
        } else if (this.getAntNumEscritura() != null) {
            conditions += " AND ANT_NUM_ESCRITURA = ?";
            values.add(this.getAntNumEscritura());
        }

        if (this.getAntNumNotario() != null && this.getAntNumNotario().longValue() == -999) {
            conditions += " AND ANT_NUM_NOTARIO IS NULL";
        } else if (this.getAntNumNotario() != null) {
            conditions += " AND ANT_NUM_NOTARIO = ?";
            values.add(this.getAntNumNotario());
        }

        if (this.getAntTipoAdmon() != null && "null".equals(this.getAntTipoAdmon())) {
            conditions += " AND ANT_TIPO_ADMON IS NULL";
        } else if (this.getAntTipoAdmon() != null) {
            conditions += " AND ANT_TIPO_ADMON = ?";
            values.add(this.getAntTipoAdmon());
        }

        if (this.getAntAnoConmod1() != null && this.getAntAnoConmod1().longValue() == -999) {
            conditions += " AND ANT_ANO_CONMOD1 IS NULL";
        } else if (this.getAntAnoConmod1() != null) {
            conditions += " AND ANT_ANO_CONMOD1 = ?";
            values.add(this.getAntAnoConmod1());
        }

        if (this.getAntMesConmod1() != null && this.getAntMesConmod1().longValue() == -999) {
            conditions += " AND ANT_MES_CONMOD1 IS NULL";
        } else if (this.getAntMesConmod1() != null) {
            conditions += " AND ANT_MES_CONMOD1 = ?";
            values.add(this.getAntMesConmod1());
        }

        if (this.getAntDiaConmod1() != null && this.getAntDiaConmod1().longValue() == -999) {
            conditions += " AND ANT_DIA_CONMOD1 IS NULL";
        } else if (this.getAntDiaConmod1() != null) {
            conditions += " AND ANT_DIA_CONMOD1 = ?";
            values.add(this.getAntDiaConmod1());
        }

        if (this.getAntAnoConmod2() != null && this.getAntAnoConmod2().longValue() == -999) {
            conditions += " AND ANT_ANO_CONMOD2 IS NULL";
        } else if (this.getAntAnoConmod2() != null) {
            conditions += " AND ANT_ANO_CONMOD2 = ?";
            values.add(this.getAntAnoConmod2());
        }

        if (this.getAntMesConmod2() != null && this.getAntMesConmod2().longValue() == -999) {
            conditions += " AND ANT_MES_CONMOD2 IS NULL";
        } else if (this.getAntMesConmod2() != null) {
            conditions += " AND ANT_MES_CONMOD2 = ?";
            values.add(this.getAntMesConmod2());
        }

        if (this.getAntDiaConmod2() != null && this.getAntDiaConmod2().longValue() == -999) {
            conditions += " AND ANT_DIA_CONMOD2 IS NULL";
        } else if (this.getAntDiaConmod2() != null) {
            conditions += " AND ANT_DIA_CONMOD2 = ?";
            values.add(this.getAntDiaConmod2());
        }

        if (this.getAntAnoConmod3() != null && this.getAntAnoConmod3().longValue() == -999) {
            conditions += " AND ANT_ANO_CONMOD3 IS NULL";
        } else if (this.getAntAnoConmod3() != null) {
            conditions += " AND ANT_ANO_CONMOD3 = ?";
            values.add(this.getAntAnoConmod3());
        }

        if (this.getAntMesConmod3() != null && this.getAntMesConmod3().longValue() == -999) {
            conditions += " AND ANT_MES_CONMOD3 IS NULL";
        } else if (this.getAntMesConmod3() != null) {
            conditions += " AND ANT_MES_CONMOD3 = ?";
            values.add(this.getAntMesConmod3());
        }

        if (this.getAntDiaConmod3() != null && this.getAntDiaConmod3().longValue() == -999) {
            conditions += " AND ANT_DIA_CONMOD3 IS NULL";
        } else if (this.getAntDiaConmod3() != null) {
            conditions += " AND ANT_DIA_CONMOD3 = ?";
            values.add(this.getAntDiaConmod3());
        }

        if (this.getAntNumContrato() != null && this.getAntNumContrato().longValue() == -999) {
            conditions += " AND ANT_NUM_CONTRATO IS NULL";
        } else if (this.getAntNumContrato() != null) {
            conditions += " AND ANT_NUM_CONTRATO = ?";
            values.add(this.getAntNumContrato());
        }

        if (this.getAntSeguimiento() != null && "null".equals(this.getAntSeguimiento())) {
            conditions += " AND ANT_SEGUIMIENTO IS NULL";
        } else if (this.getAntSeguimiento() != null) {
            conditions += " AND ANT_SEGUIMIENTO = ?";
            values.add(this.getAntSeguimiento());
        }

        if (this.getAntTipoNegSat() != null && this.getAntTipoNegSat().longValue() == -999) {
            conditions += " AND ANT_TIPO_NEG_SAT IS NULL";
        } else if (this.getAntTipoNegSat() != null) {
            conditions += " AND ANT_TIPO_NEG_SAT = ?";
            values.add(this.getAntTipoNegSat());
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
        String sql = "UPDATE ANTEPROY_MSA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ANT_ANO_INF = ?";
        pkValues.add(this.getAntAnoInf());
        conditions += " AND ANT_MES_INF = ?";
        pkValues.add(this.getAntMesInf());
        conditions += " AND ANT_NUM_PROSPECTO = ?";
        pkValues.add(this.getAntNumProspecto());
        fields += " ANT_FECHA_APERTURA = ?, ";
        values.add(this.getAntFechaApertura());
        fields += " ANT_NUM_PROMOTOR = ?, ";
        values.add(this.getAntNumPromotor());
        fields += " ANT_CVE_FORM_MAN = ?, ";
        values.add(this.getAntCveFormMan());
        fields += " ANT_CVE_TIPO_NEG = ?, ";
        values.add(this.getAntCveTipoNeg());
        fields += " ANT_CVE_CLASIF_PRO = ?, ";
        values.add(this.getAntCveClasifPro());
        fields += " ANT_NUM_PRODUCTO = ?, ";
        values.add(this.getAntNumProducto());
        fields += " ANT_CVE_COMITE = ?, ";
        values.add(this.getAntCveComite());
        fields += " ANT_CVE_REVOCABLE = ?, ";
        values.add(this.getAntCveRevocable());
        fields += " ANT_IMP_APERTURA = ?, ";
        values.add(this.getAntImpApertura());
        fields += " ANT_CVE_ST_PROSPEC = ?, ";
        values.add(this.getAntCveStProspec());
        fields += " ANT_DES_GESTION = ?, ";
        values.add(this.getAntDesGestion());
        fields += " ANT_FEC_GESTION = ?, ";
        values.add(this.getAntFecGestion());
        fields += " ANT_PATRIMONIO = ?, ";
        values.add(this.getAntPatrimonio());
        fields += " ANT_NUM_ABOGADO = ?, ";
        values.add(this.getAntNumAbogado());
        fields += " ANT_NOM_NEGOCIO = ?, ";
        values.add(this.getAntNomNegocio());
        fields += " ANT_CVE_SITUACION = ?, ";
        values.add(this.getAntCveSituacion());
        fields += " ANT_FEC_PRO_CONSTI = ?, ";
        values.add(this.getAntFecProConsti());
        fields += " ANT_NOM_ACTIVIDAD = ?, ";
        values.add(this.getAntNomActividad());
        fields += " ANT_TIPO_CLIENT = ?, ";
        values.add(this.getAntTipoClient());
        fields += " ANT_TIPO_PUBLIC = ?, ";
        values.add(this.getAntTipoPublic());
        fields += " ANT_TIPO_CONTACTO = ?, ";
        values.add(this.getAntTipoContacto());
        fields += " ANT_NUM_ESCRITURA = ?, ";
        values.add(this.getAntNumEscritura());
        fields += " ANT_NUM_NOTARIO = ?, ";
        values.add(this.getAntNumNotario());
        fields += " ANT_TIPO_ADMON = ?, ";
        values.add(this.getAntTipoAdmon());
        fields += " ANT_ANO_CONMOD1 = ?, ";
        values.add(this.getAntAnoConmod1());
        fields += " ANT_MES_CONMOD1 = ?, ";
        values.add(this.getAntMesConmod1());
        fields += " ANT_DIA_CONMOD1 = ?, ";
        values.add(this.getAntDiaConmod1());
        fields += " ANT_ANO_CONMOD2 = ?, ";
        values.add(this.getAntAnoConmod2());
        fields += " ANT_MES_CONMOD2 = ?, ";
        values.add(this.getAntMesConmod2());
        fields += " ANT_DIA_CONMOD2 = ?, ";
        values.add(this.getAntDiaConmod2());
        fields += " ANT_ANO_CONMOD3 = ?, ";
        values.add(this.getAntAnoConmod3());
        fields += " ANT_MES_CONMOD3 = ?, ";
        values.add(this.getAntMesConmod3());
        fields += " ANT_DIA_CONMOD3 = ?, ";
        values.add(this.getAntDiaConmod3());
        fields += " ANT_NUM_CONTRATO = ?, ";
        values.add(this.getAntNumContrato());
        fields += " ANT_SEGUIMIENTO = ?, ";
        values.add(this.getAntSeguimiento());
        fields += " ANT_TIPO_NEG_SAT = ?, ";
        values.add(this.getAntTipoNegSat());
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
        String sql = "INSERT INTO ANTEPROY_MSA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ANT_ANO_INF";
        fieldValues += ", ?";
        values.add(this.getAntAnoInf());

        fields += ", ANT_MES_INF";
        fieldValues += ", ?";
        values.add(this.getAntMesInf());

        fields += ", ANT_NUM_PROSPECTO";
        fieldValues += ", ?";
        values.add(this.getAntNumProspecto());

        fields += ", ANT_FECHA_APERTURA";
        fieldValues += ", ?";
        values.add(this.getAntFechaApertura());

        fields += ", ANT_NUM_PROMOTOR";
        fieldValues += ", ?";
        values.add(this.getAntNumPromotor());

        fields += ", ANT_CVE_FORM_MAN";
        fieldValues += ", ?";
        values.add(this.getAntCveFormMan());

        fields += ", ANT_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getAntCveTipoNeg());

        fields += ", ANT_CVE_CLASIF_PRO";
        fieldValues += ", ?";
        values.add(this.getAntCveClasifPro());

        fields += ", ANT_NUM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getAntNumProducto());

        fields += ", ANT_CVE_COMITE";
        fieldValues += ", ?";
        values.add(this.getAntCveComite());

        fields += ", ANT_CVE_REVOCABLE";
        fieldValues += ", ?";
        values.add(this.getAntCveRevocable());

        fields += ", ANT_IMP_APERTURA";
        fieldValues += ", ?";
        values.add(this.getAntImpApertura());

        fields += ", ANT_CVE_ST_PROSPEC";
        fieldValues += ", ?";
        values.add(this.getAntCveStProspec());

        fields += ", ANT_DES_GESTION";
        fieldValues += ", ?";
        values.add(this.getAntDesGestion());

        fields += ", ANT_FEC_GESTION";
        fieldValues += ", ?";
        values.add(this.getAntFecGestion());

        fields += ", ANT_PATRIMONIO";
        fieldValues += ", ?";
        values.add(this.getAntPatrimonio());

        fields += ", ANT_NUM_ABOGADO";
        fieldValues += ", ?";
        values.add(this.getAntNumAbogado());

        fields += ", ANT_NOM_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getAntNomNegocio());

        fields += ", ANT_CVE_SITUACION";
        fieldValues += ", ?";
        values.add(this.getAntCveSituacion());

        fields += ", ANT_FEC_PRO_CONSTI";
        fieldValues += ", ?";
        values.add(this.getAntFecProConsti());

        fields += ", ANT_NOM_ACTIVIDAD";
        fieldValues += ", ?";
        values.add(this.getAntNomActividad());

        fields += ", ANT_TIPO_CLIENT";
        fieldValues += ", ?";
        values.add(this.getAntTipoClient());

        fields += ", ANT_TIPO_PUBLIC";
        fieldValues += ", ?";
        values.add(this.getAntTipoPublic());

        fields += ", ANT_TIPO_CONTACTO";
        fieldValues += ", ?";
        values.add(this.getAntTipoContacto());

        fields += ", ANT_NUM_ESCRITURA";
        fieldValues += ", ?";
        values.add(this.getAntNumEscritura());

        fields += ", ANT_NUM_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getAntNumNotario());

        fields += ", ANT_TIPO_ADMON";
        fieldValues += ", ?";
        values.add(this.getAntTipoAdmon());

        fields += ", ANT_ANO_CONMOD1";
        fieldValues += ", ?";
        values.add(this.getAntAnoConmod1());

        fields += ", ANT_MES_CONMOD1";
        fieldValues += ", ?";
        values.add(this.getAntMesConmod1());

        fields += ", ANT_DIA_CONMOD1";
        fieldValues += ", ?";
        values.add(this.getAntDiaConmod1());

        fields += ", ANT_ANO_CONMOD2";
        fieldValues += ", ?";
        values.add(this.getAntAnoConmod2());

        fields += ", ANT_MES_CONMOD2";
        fieldValues += ", ?";
        values.add(this.getAntMesConmod2());

        fields += ", ANT_DIA_CONMOD2";
        fieldValues += ", ?";
        values.add(this.getAntDiaConmod2());

        fields += ", ANT_ANO_CONMOD3";
        fieldValues += ", ?";
        values.add(this.getAntAnoConmod3());

        fields += ", ANT_MES_CONMOD3";
        fieldValues += ", ?";
        values.add(this.getAntMesConmod3());

        fields += ", ANT_DIA_CONMOD3";
        fieldValues += ", ?";
        values.add(this.getAntDiaConmod3());

        fields += ", ANT_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAntNumContrato());

        fields += ", ANT_SEGUIMIENTO";
        fieldValues += ", ?";
        values.add(this.getAntSeguimiento());

        fields += ", ANT_TIPO_NEG_SAT";
        fieldValues += ", ?";
        values.add(this.getAntTipoNegSat());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ANTEPROY_MSA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ANT_ANO_INF = ?";
        values.add(this.getAntAnoInf());
        conditions += " AND ANT_MES_INF = ?";
        values.add(this.getAntMesInf());
        conditions += " AND ANT_NUM_PROSPECTO = ?";
        values.add(this.getAntNumProspecto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        AnteproyMsa instance = (AnteproyMsa) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAntAnoInf().equals(instance.getAntAnoInf()))
            equalObjects = false;
        if (equalObjects && !this.getAntMesInf().equals(instance.getAntMesInf()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumProspecto().equals(instance.getAntNumProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getAntFechaApertura().equals(instance.getAntFechaApertura()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumPromotor().equals(instance.getAntNumPromotor()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveFormMan().equals(instance.getAntCveFormMan()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveTipoNeg().equals(instance.getAntCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveClasifPro().equals(instance.getAntCveClasifPro()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumProducto().equals(instance.getAntNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveComite().equals(instance.getAntCveComite()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveRevocable().equals(instance.getAntCveRevocable()))
            equalObjects = false;
        if (equalObjects && !this.getAntImpApertura().equals(instance.getAntImpApertura()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveStProspec().equals(instance.getAntCveStProspec()))
            equalObjects = false;
        if (equalObjects && !this.getAntDesGestion().equals(instance.getAntDesGestion()))
            equalObjects = false;
        if (equalObjects && !this.getAntFecGestion().equals(instance.getAntFecGestion()))
            equalObjects = false;
        if (equalObjects && !this.getAntPatrimonio().equals(instance.getAntPatrimonio()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumAbogado().equals(instance.getAntNumAbogado()))
            equalObjects = false;
        if (equalObjects && !this.getAntNomNegocio().equals(instance.getAntNomNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveSituacion().equals(instance.getAntCveSituacion()))
            equalObjects = false;
        if (equalObjects && !this.getAntFecProConsti().equals(instance.getAntFecProConsti()))
            equalObjects = false;
        if (equalObjects && !this.getAntNomActividad().equals(instance.getAntNomActividad()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoClient().equals(instance.getAntTipoClient()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoPublic().equals(instance.getAntTipoPublic()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoContacto().equals(instance.getAntTipoContacto()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumEscritura().equals(instance.getAntNumEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumNotario().equals(instance.getAntNumNotario()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoAdmon().equals(instance.getAntTipoAdmon()))
            equalObjects = false;
        if (equalObjects && !this.getAntAnoConmod1().equals(instance.getAntAnoConmod1()))
            equalObjects = false;
        if (equalObjects && !this.getAntMesConmod1().equals(instance.getAntMesConmod1()))
            equalObjects = false;
        if (equalObjects && !this.getAntDiaConmod1().equals(instance.getAntDiaConmod1()))
            equalObjects = false;
        if (equalObjects && !this.getAntAnoConmod2().equals(instance.getAntAnoConmod2()))
            equalObjects = false;
        if (equalObjects && !this.getAntMesConmod2().equals(instance.getAntMesConmod2()))
            equalObjects = false;
        if (equalObjects && !this.getAntDiaConmod2().equals(instance.getAntDiaConmod2()))
            equalObjects = false;
        if (equalObjects && !this.getAntAnoConmod3().equals(instance.getAntAnoConmod3()))
            equalObjects = false;
        if (equalObjects && !this.getAntMesConmod3().equals(instance.getAntMesConmod3()))
            equalObjects = false;
        if (equalObjects && !this.getAntDiaConmod3().equals(instance.getAntDiaConmod3()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumContrato().equals(instance.getAntNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAntSeguimiento().equals(instance.getAntSeguimiento()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoNegSat().equals(instance.getAntTipoNegSat()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        AnteproyMsa result = new AnteproyMsa();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAntAnoInf((BigDecimal) objectData.getData("ANT_ANO_INF"));
        result.setAntMesInf((BigDecimal) objectData.getData("ANT_MES_INF"));
        result.setAntNumProspecto((BigDecimal) objectData.getData("ANT_NUM_PROSPECTO"));
        result.setAntFechaApertura((String) objectData.getData("ANT_FECHA_APERTURA"));
        result.setAntNumPromotor((BigDecimal) objectData.getData("ANT_NUM_PROMOTOR"));
        result.setAntCveFormMan((String) objectData.getData("ANT_CVE_FORM_MAN"));
        result.setAntCveTipoNeg((String) objectData.getData("ANT_CVE_TIPO_NEG"));
        result.setAntCveClasifPro((String) objectData.getData("ANT_CVE_CLASIF_PRO"));
        result.setAntNumProducto((BigDecimal) objectData.getData("ANT_NUM_PRODUCTO"));
        result.setAntCveComite((BigDecimal) objectData.getData("ANT_CVE_COMITE"));
        result.setAntCveRevocable((BigDecimal) objectData.getData("ANT_CVE_REVOCABLE"));
        result.setAntImpApertura((BigDecimal) objectData.getData("ANT_IMP_APERTURA"));
        result.setAntCveStProspec((String) objectData.getData("ANT_CVE_ST_PROSPEC"));
        result.setAntDesGestion((String) objectData.getData("ANT_DES_GESTION"));
        result.setAntFecGestion((String) objectData.getData("ANT_FEC_GESTION"));
        result.setAntPatrimonio((Long) objectData.getData("ANT_PATRIMONIO"));
        result.setAntNumAbogado((BigDecimal) objectData.getData("ANT_NUM_ABOGADO"));
        result.setAntNomNegocio((String) objectData.getData("ANT_NOM_NEGOCIO"));
        result.setAntCveSituacion((String) objectData.getData("ANT_CVE_SITUACION"));
        result.setAntFecProConsti((String) objectData.getData("ANT_FEC_PRO_CONSTI"));
        result.setAntNomActividad((String) objectData.getData("ANT_NOM_ACTIVIDAD"));
        result.setAntTipoClient((String) objectData.getData("ANT_TIPO_CLIENT"));
        result.setAntTipoPublic((String) objectData.getData("ANT_TIPO_PUBLIC"));
        result.setAntTipoContacto((String) objectData.getData("ANT_TIPO_CONTACTO"));
        result.setAntNumEscritura((String) objectData.getData("ANT_NUM_ESCRITURA"));
        result.setAntNumNotario((BigDecimal) objectData.getData("ANT_NUM_NOTARIO"));
        result.setAntTipoAdmon((String) objectData.getData("ANT_TIPO_ADMON"));
        result.setAntAnoConmod1((BigDecimal) objectData.getData("ANT_ANO_CONMOD1"));
        result.setAntMesConmod1((BigDecimal) objectData.getData("ANT_MES_CONMOD1"));
        result.setAntDiaConmod1((BigDecimal) objectData.getData("ANT_DIA_CONMOD1"));
        result.setAntAnoConmod2((BigDecimal) objectData.getData("ANT_ANO_CONMOD2"));
        result.setAntMesConmod2((BigDecimal) objectData.getData("ANT_MES_CONMOD2"));
        result.setAntDiaConmod2((BigDecimal) objectData.getData("ANT_DIA_CONMOD2"));
        result.setAntAnoConmod3((BigDecimal) objectData.getData("ANT_ANO_CONMOD3"));
        result.setAntMesConmod3((BigDecimal) objectData.getData("ANT_MES_CONMOD3"));
        result.setAntDiaConmod3((BigDecimal) objectData.getData("ANT_DIA_CONMOD3"));
        result.setAntNumContrato((BigDecimal) objectData.getData("ANT_NUM_CONTRATO"));
        result.setAntSeguimiento((String) objectData.getData("ANT_SEGUIMIENTO"));
        result.setAntTipoNegSat((BigDecimal) objectData.getData("ANT_TIPO_NEG_SAT"));

        return result;

    }

}
