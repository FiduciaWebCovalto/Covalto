package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Prospecth extends DomainObject {

    BigDecimal prsNumProspecto = null;
    String prsNomProspecto = null;
    String prsRfc = null;
    String prsTipoPers = null;
    String prsCveActividad = null;
    String prsNomNacion = null;
    String prsCveMigra = null;
    String prsNomCalle = null;
    String prsNomColonia = null;
    String prsNomPoblacion = null;
    String prsNomPais = null;
    String prsNomEstado = null;
    BigDecimal prsCodigoPostal = null;
    String prsTelCasa = null;
    String prsTelOficina = null;
    String prsTelFax = null;
    String prsNomContacto = null;
    String prsTelContacto = null;
    String prsFaxContacto = null;
    String prsNomEjecutivo = null;
    String prsTelEjecutivo = null;
    BigDecimal prsEjecAsig = null;
    String prsFecProspecto = null;
    String prsFecConstit = null;
    BigDecimal prsNumContrato = null;
    String prsCveStatus = null;
    String prsCorreo2 = null;
    String prsNomDelegacion = null;

    public Prospecth() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrsNumProspecto(BigDecimal prsNumProspecto) {
        this.prsNumProspecto = prsNumProspecto;
    }

    public BigDecimal getPrsNumProspecto() {
        return this.prsNumProspecto;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomProspecto(String prsNomProspecto) {
        this.prsNomProspecto = prsNomProspecto;
    }

    public String getPrsNomProspecto() {
        return this.prsNomProspecto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsRfc(String prsRfc) {
        this.prsRfc = prsRfc;
    }

    public String getPrsRfc() {
        return this.prsRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsTipoPers(String prsTipoPers) {
        this.prsTipoPers = prsTipoPers;
    }

    public String getPrsTipoPers() {
        return this.prsTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsCveActividad(String prsCveActividad) {
        this.prsCveActividad = prsCveActividad;
    }

    public String getPrsCveActividad() {
        return this.prsCveActividad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomNacion(String prsNomNacion) {
        this.prsNomNacion = prsNomNacion;
    }

    public String getPrsNomNacion() {
        return this.prsNomNacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsCveMigra(String prsCveMigra) {
        this.prsCveMigra = prsCveMigra;
    }

    public String getPrsCveMigra() {
        return this.prsCveMigra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomCalle(String prsNomCalle) {
        this.prsNomCalle = prsNomCalle;
    }

    public String getPrsNomCalle() {
        return this.prsNomCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomColonia(String prsNomColonia) {
        this.prsNomColonia = prsNomColonia;
    }

    public String getPrsNomColonia() {
        return this.prsNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomPoblacion(String prsNomPoblacion) {
        this.prsNomPoblacion = prsNomPoblacion;
    }

    public String getPrsNomPoblacion() {
        return this.prsNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomPais(String prsNomPais) {
        this.prsNomPais = prsNomPais;
    }

    public String getPrsNomPais() {
        return this.prsNomPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomEstado(String prsNomEstado) {
        this.prsNomEstado = prsNomEstado;
    }

    public String getPrsNomEstado() {
        return this.prsNomEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrsCodigoPostal(BigDecimal prsCodigoPostal) {
        this.prsCodigoPostal = prsCodigoPostal;
    }

    public BigDecimal getPrsCodigoPostal() {
        return this.prsCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsTelCasa(String prsTelCasa) {
        this.prsTelCasa = prsTelCasa;
    }

    public String getPrsTelCasa() {
        return this.prsTelCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsTelOficina(String prsTelOficina) {
        this.prsTelOficina = prsTelOficina;
    }

    public String getPrsTelOficina() {
        return this.prsTelOficina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsTelFax(String prsTelFax) {
        this.prsTelFax = prsTelFax;
    }

    public String getPrsTelFax() {
        return this.prsTelFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomContacto(String prsNomContacto) {
        this.prsNomContacto = prsNomContacto;
    }

    public String getPrsNomContacto() {
        return this.prsNomContacto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsTelContacto(String prsTelContacto) {
        this.prsTelContacto = prsTelContacto;
    }

    public String getPrsTelContacto() {
        return this.prsTelContacto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsFaxContacto(String prsFaxContacto) {
        this.prsFaxContacto = prsFaxContacto;
    }

    public String getPrsFaxContacto() {
        return this.prsFaxContacto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomEjecutivo(String prsNomEjecutivo) {
        this.prsNomEjecutivo = prsNomEjecutivo;
    }

    public String getPrsNomEjecutivo() {
        return this.prsNomEjecutivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsTelEjecutivo(String prsTelEjecutivo) {
        this.prsTelEjecutivo = prsTelEjecutivo;
    }

    public String getPrsTelEjecutivo() {
        return this.prsTelEjecutivo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPrsEjecAsig(BigDecimal prsEjecAsig) {
        this.prsEjecAsig = prsEjecAsig;
    }

    public BigDecimal getPrsEjecAsig() {
        return this.prsEjecAsig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsFecProspecto(String prsFecProspecto) {
        this.prsFecProspecto = prsFecProspecto;
    }

    public String getPrsFecProspecto() {
        return this.prsFecProspecto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsFecConstit(String prsFecConstit) {
        this.prsFecConstit = prsFecConstit;
    }

    public String getPrsFecConstit() {
        return this.prsFecConstit;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrsNumContrato(BigDecimal prsNumContrato) {
        this.prsNumContrato = prsNumContrato;
    }

    public BigDecimal getPrsNumContrato() {
        return this.prsNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsCveStatus(String prsCveStatus) {
        this.prsCveStatus = prsCveStatus;
    }

    public String getPrsCveStatus() {
        return this.prsCveStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsCorreo2(String prsCorreo2) {
        this.prsCorreo2 = prsCorreo2;
    }

    public String getPrsCorreo2() {
        return this.prsCorreo2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrsNomDelegacion(String prsNomDelegacion) {
        this.prsNomDelegacion = prsNomDelegacion;
    }

    public String getPrsNomDelegacion() {
        return this.prsNomDelegacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PROSPECTH ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM PROSPECTH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPrsNumProspecto() != null && this.getPrsNumProspecto().longValue() == -999) {
            conditions += " AND PRS_NUM_PROSPECTO IS NULL";
        } else if (this.getPrsNumProspecto() != null) {
            conditions += " AND PRS_NUM_PROSPECTO = ?";
            values.add(this.getPrsNumProspecto());
        }

        if (this.getPrsNomProspecto() != null && "null".equals(this.getPrsNomProspecto())) {
            conditions += " AND PRS_NOM_PROSPECTO IS NULL";
        } else if (this.getPrsNomProspecto() != null) {
            conditions += " AND PRS_NOM_PROSPECTO = ?";
            values.add(this.getPrsNomProspecto());
        }

        if (this.getPrsRfc() != null && "null".equals(this.getPrsRfc())) {
            conditions += " AND PRS_RFC IS NULL";
        } else if (this.getPrsRfc() != null) {
            conditions += " AND PRS_RFC = ?";
            values.add(this.getPrsRfc());
        }

        if (this.getPrsTipoPers() != null && "null".equals(this.getPrsTipoPers())) {
            conditions += " AND PRS_TIPO_PERS IS NULL";
        } else if (this.getPrsTipoPers() != null) {
            conditions += " AND PRS_TIPO_PERS = ?";
            values.add(this.getPrsTipoPers());
        }

        if (this.getPrsCveActividad() != null && "null".equals(this.getPrsCveActividad())) {
            conditions += " AND PRS_CVE_ACTIVIDAD IS NULL";
        } else if (this.getPrsCveActividad() != null) {
            conditions += " AND PRS_CVE_ACTIVIDAD = ?";
            values.add(this.getPrsCveActividad());
        }

        if (this.getPrsNomNacion() != null && "null".equals(this.getPrsNomNacion())) {
            conditions += " AND PRS_NOM_NACION IS NULL";
        } else if (this.getPrsNomNacion() != null) {
            conditions += " AND PRS_NOM_NACION = ?";
            values.add(this.getPrsNomNacion());
        }

        if (this.getPrsCveMigra() != null && "null".equals(this.getPrsCveMigra())) {
            conditions += " AND PRS_CVE_MIGRA IS NULL";
        } else if (this.getPrsCveMigra() != null) {
            conditions += " AND PRS_CVE_MIGRA = ?";
            values.add(this.getPrsCveMigra());
        }

        if (this.getPrsNomCalle() != null && "null".equals(this.getPrsNomCalle())) {
            conditions += " AND PRS_NOM_CALLE IS NULL";
        } else if (this.getPrsNomCalle() != null) {
            conditions += " AND PRS_NOM_CALLE = ?";
            values.add(this.getPrsNomCalle());
        }

        if (this.getPrsNomColonia() != null && "null".equals(this.getPrsNomColonia())) {
            conditions += " AND PRS_NOM_COLONIA IS NULL";
        } else if (this.getPrsNomColonia() != null) {
            conditions += " AND PRS_NOM_COLONIA = ?";
            values.add(this.getPrsNomColonia());
        }

        if (this.getPrsNomPoblacion() != null && "null".equals(this.getPrsNomPoblacion())) {
            conditions += " AND PRS_NOM_POBLACION IS NULL";
        } else if (this.getPrsNomPoblacion() != null) {
            conditions += " AND PRS_NOM_POBLACION = ?";
            values.add(this.getPrsNomPoblacion());
        }

        if (this.getPrsNomPais() != null && "null".equals(this.getPrsNomPais())) {
            conditions += " AND PRS_NOM_PAIS IS NULL";
        } else if (this.getPrsNomPais() != null) {
            conditions += " AND PRS_NOM_PAIS = ?";
            values.add(this.getPrsNomPais());
        }

        if (this.getPrsNomEstado() != null && "null".equals(this.getPrsNomEstado())) {
            conditions += " AND PRS_NOM_ESTADO IS NULL";
        } else if (this.getPrsNomEstado() != null) {
            conditions += " AND PRS_NOM_ESTADO = ?";
            values.add(this.getPrsNomEstado());
        }

        if (this.getPrsCodigoPostal() != null && this.getPrsCodigoPostal().longValue() == -999) {
            conditions += " AND PRS_CODIGO_POSTAL IS NULL";
        } else if (this.getPrsCodigoPostal() != null) {
            conditions += " AND PRS_CODIGO_POSTAL = ?";
            values.add(this.getPrsCodigoPostal());
        }

        if (this.getPrsTelCasa() != null && "null".equals(this.getPrsTelCasa())) {
            conditions += " AND PRS_TEL_CASA IS NULL";
        } else if (this.getPrsTelCasa() != null) {
            conditions += " AND PRS_TEL_CASA = ?";
            values.add(this.getPrsTelCasa());
        }

        if (this.getPrsTelOficina() != null && "null".equals(this.getPrsTelOficina())) {
            conditions += " AND PRS_TEL_OFICINA IS NULL";
        } else if (this.getPrsTelOficina() != null) {
            conditions += " AND PRS_TEL_OFICINA = ?";
            values.add(this.getPrsTelOficina());
        }

        if (this.getPrsTelFax() != null && "null".equals(this.getPrsTelFax())) {
            conditions += " AND PRS_TEL_FAX IS NULL";
        } else if (this.getPrsTelFax() != null) {
            conditions += " AND PRS_TEL_FAX = ?";
            values.add(this.getPrsTelFax());
        }

        if (this.getPrsNomContacto() != null && "null".equals(this.getPrsNomContacto())) {
            conditions += " AND PRS_NOM_CONTACTO IS NULL";
        } else if (this.getPrsNomContacto() != null) {
            conditions += " AND PRS_NOM_CONTACTO = ?";
            values.add(this.getPrsNomContacto());
        }

        if (this.getPrsTelContacto() != null && "null".equals(this.getPrsTelContacto())) {
            conditions += " AND PRS_TEL_CONTACTO IS NULL";
        } else if (this.getPrsTelContacto() != null) {
            conditions += " AND PRS_TEL_CONTACTO = ?";
            values.add(this.getPrsTelContacto());
        }

        if (this.getPrsFaxContacto() != null && "null".equals(this.getPrsFaxContacto())) {
            conditions += " AND PRS_FAX_CONTACTO IS NULL";
        } else if (this.getPrsFaxContacto() != null) {
            conditions += " AND PRS_FAX_CONTACTO = ?";
            values.add(this.getPrsFaxContacto());
        }

        if (this.getPrsNomEjecutivo() != null && "null".equals(this.getPrsNomEjecutivo())) {
            conditions += " AND PRS_NOM_EJECUTIVO IS NULL";
        } else if (this.getPrsNomEjecutivo() != null) {
            conditions += " AND PRS_NOM_EJECUTIVO = ?";
            values.add(this.getPrsNomEjecutivo());
        }

        if (this.getPrsTelEjecutivo() != null && "null".equals(this.getPrsTelEjecutivo())) {
            conditions += " AND PRS_TEL_EJECUTIVO IS NULL";
        } else if (this.getPrsTelEjecutivo() != null) {
            conditions += " AND PRS_TEL_EJECUTIVO = ?";
            values.add(this.getPrsTelEjecutivo());
        }

        if (this.getPrsEjecAsig() != null && this.getPrsEjecAsig().longValue() == -999) {
            conditions += " AND PRS_EJEC_ASIG IS NULL";
        } else if (this.getPrsEjecAsig() != null) {
            conditions += " AND PRS_EJEC_ASIG = ?";
            values.add(this.getPrsEjecAsig());
        }

        if (this.getPrsFecProspecto() != null && "null".equals(this.getPrsFecProspecto())) {
            conditions += " AND PRS_FEC_PROSPECTO IS NULL";
        } else if (this.getPrsFecProspecto() != null) {
            conditions += " AND PRS_FEC_PROSPECTO = ?";
            values.add(this.getPrsFecProspecto());
        }

        if (this.getPrsFecConstit() != null && "null".equals(this.getPrsFecConstit())) {
            conditions += " AND PRS_FEC_CONSTIT IS NULL";
        } else if (this.getPrsFecConstit() != null) {
            conditions += " AND PRS_FEC_CONSTIT = ?";
            values.add(this.getPrsFecConstit());
        }

        if (this.getPrsNumContrato() != null && this.getPrsNumContrato().longValue() == -999) {
            conditions += " AND PRS_NUM_CONTRATO IS NULL";
        } else if (this.getPrsNumContrato() != null) {
            conditions += " AND PRS_NUM_CONTRATO = ?";
            values.add(this.getPrsNumContrato());
        }

        if (this.getPrsCveStatus() != null && "null".equals(this.getPrsCveStatus())) {
            conditions += " AND PRS_CVE_STATUS IS NULL";
        } else if (this.getPrsCveStatus() != null) {
            conditions += " AND PRS_CVE_STATUS = ?";
            values.add(this.getPrsCveStatus());
        }

        if (this.getPrsCorreo2() != null && "null".equals(this.getPrsCorreo2())) {
            conditions += " AND PRS_CORREO2 IS NULL";
        } else if (this.getPrsCorreo2() != null) {
            conditions += " AND PRS_CORREO2 = ?";
            values.add(this.getPrsCorreo2());
        }

        if (this.getPrsNomDelegacion() != null && "null".equals(this.getPrsNomDelegacion())) {
            conditions += " AND PRS_NOM_DELEGACION IS NULL";
        } else if (this.getPrsNomDelegacion() != null) {
            conditions += " AND PRS_NOM_DELEGACION = ?";
            values.add(this.getPrsNomDelegacion());
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
        String sql = "UPDATE PROSPECTH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " PRS_NUM_PROSPECTO = ?, ";
        values.add(this.getPrsNumProspecto());
        fields += " PRS_NOM_PROSPECTO = ?, ";
        values.add(this.getPrsNomProspecto());
        fields += " PRS_RFC = ?, ";
        values.add(this.getPrsRfc());
        fields += " PRS_TIPO_PERS = ?, ";
        values.add(this.getPrsTipoPers());
        fields += " PRS_CVE_ACTIVIDAD = ?, ";
        values.add(this.getPrsCveActividad());
        fields += " PRS_NOM_NACION = ?, ";
        values.add(this.getPrsNomNacion());
        fields += " PRS_CVE_MIGRA = ?, ";
        values.add(this.getPrsCveMigra());
        fields += " PRS_NOM_CALLE = ?, ";
        values.add(this.getPrsNomCalle());
        fields += " PRS_NOM_COLONIA = ?, ";
        values.add(this.getPrsNomColonia());
        fields += " PRS_NOM_POBLACION = ?, ";
        values.add(this.getPrsNomPoblacion());
        fields += " PRS_NOM_PAIS = ?, ";
        values.add(this.getPrsNomPais());
        fields += " PRS_NOM_ESTADO = ?, ";
        values.add(this.getPrsNomEstado());
        fields += " PRS_CODIGO_POSTAL = ?, ";
        values.add(this.getPrsCodigoPostal());
        fields += " PRS_TEL_CASA = ?, ";
        values.add(this.getPrsTelCasa());
        fields += " PRS_TEL_OFICINA = ?, ";
        values.add(this.getPrsTelOficina());
        fields += " PRS_TEL_FAX = ?, ";
        values.add(this.getPrsTelFax());
        fields += " PRS_NOM_CONTACTO = ?, ";
        values.add(this.getPrsNomContacto());
        fields += " PRS_TEL_CONTACTO = ?, ";
        values.add(this.getPrsTelContacto());
        fields += " PRS_FAX_CONTACTO = ?, ";
        values.add(this.getPrsFaxContacto());
        fields += " PRS_NOM_EJECUTIVO = ?, ";
        values.add(this.getPrsNomEjecutivo());
        fields += " PRS_TEL_EJECUTIVO = ?, ";
        values.add(this.getPrsTelEjecutivo());
        fields += " PRS_EJEC_ASIG = ?, ";
        values.add(this.getPrsEjecAsig());
        fields += " PRS_FEC_PROSPECTO = ?, ";
        values.add(this.getPrsFecProspecto());
        fields += " PRS_FEC_CONSTIT = ?, ";
        values.add(this.getPrsFecConstit());
        fields += " PRS_NUM_CONTRATO = ?, ";
        values.add(this.getPrsNumContrato());
        fields += " PRS_CVE_STATUS = ?, ";
        values.add(this.getPrsCveStatus());
        fields += " PRS_CORREO2 = ?, ";
        values.add(this.getPrsCorreo2());
        fields += " PRS_NOM_DELEGACION = ?, ";
        values.add(this.getPrsNomDelegacion());
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
        String sql = "INSERT INTO PROSPECTH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRS_NUM_PROSPECTO";
        fieldValues += ", ?";
        values.add(this.getPrsNumProspecto());

        fields += ", PRS_NOM_PROSPECTO";
        fieldValues += ", ?";
        values.add(this.getPrsNomProspecto());

        fields += ", PRS_RFC";
        fieldValues += ", ?";
        values.add(this.getPrsRfc());

        fields += ", PRS_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getPrsTipoPers());

        fields += ", PRS_CVE_ACTIVIDAD";
        fieldValues += ", ?";
        values.add(this.getPrsCveActividad());

        fields += ", PRS_NOM_NACION";
        fieldValues += ", ?";
        values.add(this.getPrsNomNacion());

        fields += ", PRS_CVE_MIGRA";
        fieldValues += ", ?";
        values.add(this.getPrsCveMigra());

        fields += ", PRS_NOM_CALLE";
        fieldValues += ", ?";
        values.add(this.getPrsNomCalle());

        fields += ", PRS_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getPrsNomColonia());

        fields += ", PRS_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getPrsNomPoblacion());

        fields += ", PRS_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getPrsNomPais());

        fields += ", PRS_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getPrsNomEstado());

        fields += ", PRS_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getPrsCodigoPostal());

        fields += ", PRS_TEL_CASA";
        fieldValues += ", ?";
        values.add(this.getPrsTelCasa());

        fields += ", PRS_TEL_OFICINA";
        fieldValues += ", ?";
        values.add(this.getPrsTelOficina());

        fields += ", PRS_TEL_FAX";
        fieldValues += ", ?";
        values.add(this.getPrsTelFax());

        fields += ", PRS_NOM_CONTACTO";
        fieldValues += ", ?";
        values.add(this.getPrsNomContacto());

        fields += ", PRS_TEL_CONTACTO";
        fieldValues += ", ?";
        values.add(this.getPrsTelContacto());

        fields += ", PRS_FAX_CONTACTO";
        fieldValues += ", ?";
        values.add(this.getPrsFaxContacto());

        fields += ", PRS_NOM_EJECUTIVO";
        fieldValues += ", ?";
        values.add(this.getPrsNomEjecutivo());

        fields += ", PRS_TEL_EJECUTIVO";
        fieldValues += ", ?";
        values.add(this.getPrsTelEjecutivo());

        fields += ", PRS_EJEC_ASIG";
        fieldValues += ", ?";
        values.add(this.getPrsEjecAsig());

        fields += ", PRS_FEC_PROSPECTO";
        fieldValues += ", ?";
        values.add(this.getPrsFecProspecto());

        fields += ", PRS_FEC_CONSTIT";
        fieldValues += ", ?";
        values.add(this.getPrsFecConstit());

        fields += ", PRS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPrsNumContrato());

        fields += ", PRS_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getPrsCveStatus());

        fields += ", PRS_CORREO2";
        fieldValues += ", ?";
        values.add(this.getPrsCorreo2());

        fields += ", PRS_NOM_DELEGACION";
        fieldValues += ", ?";
        values.add(this.getPrsNomDelegacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PROSPECTH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Prospecth instance = (Prospecth) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPrsNumProspecto().equals(instance.getPrsNumProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomProspecto().equals(instance.getPrsNomProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getPrsRfc().equals(instance.getPrsRfc()))
            equalObjects = false;
        if (equalObjects && !this.getPrsTipoPers().equals(instance.getPrsTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getPrsCveActividad().equals(instance.getPrsCveActividad()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomNacion().equals(instance.getPrsNomNacion()))
            equalObjects = false;
        if (equalObjects && !this.getPrsCveMigra().equals(instance.getPrsCveMigra()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomCalle().equals(instance.getPrsNomCalle()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomColonia().equals(instance.getPrsNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomPoblacion().equals(instance.getPrsNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomPais().equals(instance.getPrsNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomEstado().equals(instance.getPrsNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getPrsCodigoPostal().equals(instance.getPrsCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getPrsTelCasa().equals(instance.getPrsTelCasa()))
            equalObjects = false;
        if (equalObjects && !this.getPrsTelOficina().equals(instance.getPrsTelOficina()))
            equalObjects = false;
        if (equalObjects && !this.getPrsTelFax().equals(instance.getPrsTelFax()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomContacto().equals(instance.getPrsNomContacto()))
            equalObjects = false;
        if (equalObjects && !this.getPrsTelContacto().equals(instance.getPrsTelContacto()))
            equalObjects = false;
        if (equalObjects && !this.getPrsFaxContacto().equals(instance.getPrsFaxContacto()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomEjecutivo().equals(instance.getPrsNomEjecutivo()))
            equalObjects = false;
        if (equalObjects && !this.getPrsTelEjecutivo().equals(instance.getPrsTelEjecutivo()))
            equalObjects = false;
        if (equalObjects && !this.getPrsEjecAsig().equals(instance.getPrsEjecAsig()))
            equalObjects = false;
        if (equalObjects && !this.getPrsFecProspecto().equals(instance.getPrsFecProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getPrsFecConstit().equals(instance.getPrsFecConstit()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNumContrato().equals(instance.getPrsNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPrsCveStatus().equals(instance.getPrsCveStatus()))
            equalObjects = false;
        if (equalObjects && !this.getPrsCorreo2().equals(instance.getPrsCorreo2()))
            equalObjects = false;
        if (equalObjects && !this.getPrsNomDelegacion().equals(instance.getPrsNomDelegacion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Prospecth result = new Prospecth();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPrsNumProspecto((BigDecimal) objectData.getData("PRS_NUM_PROSPECTO"));
        result.setPrsNomProspecto((String) objectData.getData("PRS_NOM_PROSPECTO"));
        result.setPrsRfc((String) objectData.getData("PRS_RFC"));
        result.setPrsTipoPers((String) objectData.getData("PRS_TIPO_PERS"));
        result.setPrsCveActividad((String) objectData.getData("PRS_CVE_ACTIVIDAD"));
        result.setPrsNomNacion((String) objectData.getData("PRS_NOM_NACION"));
        result.setPrsCveMigra((String) objectData.getData("PRS_CVE_MIGRA"));
        result.setPrsNomCalle((String) objectData.getData("PRS_NOM_CALLE"));
        result.setPrsNomColonia((String) objectData.getData("PRS_NOM_COLONIA"));
        result.setPrsNomPoblacion((String) objectData.getData("PRS_NOM_POBLACION"));
        result.setPrsNomPais((String) objectData.getData("PRS_NOM_PAIS"));
        result.setPrsNomEstado((String) objectData.getData("PRS_NOM_ESTADO"));
        result.setPrsCodigoPostal((BigDecimal) objectData.getData("PRS_CODIGO_POSTAL"));
        result.setPrsTelCasa((String) objectData.getData("PRS_TEL_CASA"));
        result.setPrsTelOficina((String) objectData.getData("PRS_TEL_OFICINA"));
        result.setPrsTelFax((String) objectData.getData("PRS_TEL_FAX"));
        result.setPrsNomContacto((String) objectData.getData("PRS_NOM_CONTACTO"));
        result.setPrsTelContacto((String) objectData.getData("PRS_TEL_CONTACTO"));
        result.setPrsFaxContacto((String) objectData.getData("PRS_FAX_CONTACTO"));
        result.setPrsNomEjecutivo((String) objectData.getData("PRS_NOM_EJECUTIVO"));
        result.setPrsTelEjecutivo((String) objectData.getData("PRS_TEL_EJECUTIVO"));
        result.setPrsEjecAsig((BigDecimal) objectData.getData("PRS_EJEC_ASIG"));
        result.setPrsFecProspecto((String) objectData.getData("PRS_FEC_PROSPECTO"));
        result.setPrsFecConstit((String) objectData.getData("PRS_FEC_CONSTIT"));
        result.setPrsNumContrato((BigDecimal) objectData.getData("PRS_NUM_CONTRATO"));
        result.setPrsCveStatus((String) objectData.getData("PRS_CVE_STATUS"));
        result.setPrsCorreo2((String) objectData.getData("PRS_CORREO2"));
        result.setPrsNomDelegacion((String) objectData.getData("PRS_NOM_DELEGACION"));

        return result;

    }

}
