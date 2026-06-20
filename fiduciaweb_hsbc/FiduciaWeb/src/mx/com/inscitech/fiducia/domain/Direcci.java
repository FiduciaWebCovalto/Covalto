package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DIRECCI_PK", columns = { "DIR_NUM_SEC_DIRECC", "DIR_CVE_PERS_FID", "DIR_NUM_CONTRATO", "DIR_NUM_PERS_FID" }, sequences = { "MANUAL" })
public class Direcci extends DomainObject {

    BigDecimal dirNumContrato = null;
    String dirCvePersFid = null;
    BigDecimal dirNumPersFid = null;
    BigDecimal dirNumSecDirecc = null;
    String dirCveTipoDomic = null;
    String dirNomAtencion = null;
    String dirCalleNum = null;
    String dirNomColonia = null;
    String dirNomPoblacion = null;
    BigDecimal dirCodigoPostal = null;
    BigDecimal dirNumEstado = null;
    String dirNomEstado = null;
    BigDecimal dirNumPais = null;
    String dirNomPais = null;
    BigDecimal dirAnoAltaReg = null;
    BigDecimal dirMesAltaReg = null;
    BigDecimal dirDiaAltaReg = null;
    BigDecimal dirAnoUltMod = null;
    BigDecimal dirMesUltMod = null;
    BigDecimal dirDiaUltMod = null;
    String dirCveStDirecc = null;

    public Direcci() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDirNumContrato(BigDecimal dirNumContrato) {
        this.dirNumContrato = dirNumContrato;
    }

    public BigDecimal getDirNumContrato() {
        return this.dirNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirCvePersFid(String dirCvePersFid) {
        this.dirCvePersFid = dirCvePersFid;
    }

    public String getDirCvePersFid() {
        return this.dirCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDirNumPersFid(BigDecimal dirNumPersFid) {
        this.dirNumPersFid = dirNumPersFid;
    }

    public BigDecimal getDirNumPersFid() {
        return this.dirNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDirNumSecDirecc(BigDecimal dirNumSecDirecc) {
        this.dirNumSecDirecc = dirNumSecDirecc;
    }

    public BigDecimal getDirNumSecDirecc() {
        return this.dirNumSecDirecc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirCveTipoDomic(String dirCveTipoDomic) {
        this.dirCveTipoDomic = dirCveTipoDomic;
    }

    public String getDirCveTipoDomic() {
        return this.dirCveTipoDomic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirNomAtencion(String dirNomAtencion) {
        this.dirNomAtencion = dirNomAtencion;
    }

    public String getDirNomAtencion() {
        return this.dirNomAtencion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirCalleNum(String dirCalleNum) {
        this.dirCalleNum = dirCalleNum;
    }

    public String getDirCalleNum() {
        return this.dirCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirNomColonia(String dirNomColonia) {
        this.dirNomColonia = dirNomColonia;
    }

    public String getDirNomColonia() {
        return this.dirNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirNomPoblacion(String dirNomPoblacion) {
        this.dirNomPoblacion = dirNomPoblacion;
    }

    public String getDirNomPoblacion() {
        return this.dirNomPoblacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDirCodigoPostal(BigDecimal dirCodigoPostal) {
        this.dirCodigoPostal = dirCodigoPostal;
    }

    public BigDecimal getDirCodigoPostal() {
        return this.dirCodigoPostal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDirNumEstado(BigDecimal dirNumEstado) {
        this.dirNumEstado = dirNumEstado;
    }

    public BigDecimal getDirNumEstado() {
        return this.dirNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirNomEstado(String dirNomEstado) {
        this.dirNomEstado = dirNomEstado;
    }

    public String getDirNomEstado() {
        return this.dirNomEstado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDirNumPais(BigDecimal dirNumPais) {
        this.dirNumPais = dirNumPais;
    }

    public BigDecimal getDirNumPais() {
        return this.dirNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirNomPais(String dirNomPais) {
        this.dirNomPais = dirNomPais;
    }

    public String getDirNomPais() {
        return this.dirNomPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDirAnoAltaReg(BigDecimal dirAnoAltaReg) {
        this.dirAnoAltaReg = dirAnoAltaReg;
    }

    public BigDecimal getDirAnoAltaReg() {
        return this.dirAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDirMesAltaReg(BigDecimal dirMesAltaReg) {
        this.dirMesAltaReg = dirMesAltaReg;
    }

    public BigDecimal getDirMesAltaReg() {
        return this.dirMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDirDiaAltaReg(BigDecimal dirDiaAltaReg) {
        this.dirDiaAltaReg = dirDiaAltaReg;
    }

    public BigDecimal getDirDiaAltaReg() {
        return this.dirDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDirAnoUltMod(BigDecimal dirAnoUltMod) {
        this.dirAnoUltMod = dirAnoUltMod;
    }

    public BigDecimal getDirAnoUltMod() {
        return this.dirAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDirMesUltMod(BigDecimal dirMesUltMod) {
        this.dirMesUltMod = dirMesUltMod;
    }

    public BigDecimal getDirMesUltMod() {
        return this.dirMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDirDiaUltMod(BigDecimal dirDiaUltMod) {
        this.dirDiaUltMod = dirDiaUltMod;
    }

    public BigDecimal getDirDiaUltMod() {
        return this.dirDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDirCveStDirecc(String dirCveStDirecc) {
        this.dirCveStDirecc = dirCveStDirecc;
    }

    public String getDirCveStDirecc() {
        return this.dirCveStDirecc;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DIRECCI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDirNumContrato() != null && this.getDirNumContrato().longValue() == -999) {
            conditions += " AND DIR_NUM_CONTRATO IS NULL";
        } else if (this.getDirNumContrato() != null) {
            conditions += " AND DIR_NUM_CONTRATO = ?";
            values.add(this.getDirNumContrato());
        }

        if (this.getDirCvePersFid() != null && "null".equals(this.getDirCvePersFid())) {
            conditions += " AND DIR_CVE_PERS_FID IS NULL";
        } else if (this.getDirCvePersFid() != null) {
            conditions += " AND DIR_CVE_PERS_FID = ?";
            values.add(this.getDirCvePersFid());
        }

        if (this.getDirNumPersFid() != null && this.getDirNumPersFid().longValue() == -999) {
            conditions += " AND DIR_NUM_PERS_FID IS NULL";
        } else if (this.getDirNumPersFid() != null) {
            conditions += " AND DIR_NUM_PERS_FID = ?";
            values.add(this.getDirNumPersFid());
        }

        if (this.getDirNumSecDirecc() != null && this.getDirNumSecDirecc().longValue() == -999) {
            conditions += " AND DIR_NUM_SEC_DIRECC IS NULL";
        } else if (this.getDirNumSecDirecc() != null) {
            conditions += " AND DIR_NUM_SEC_DIRECC = ?";
            values.add(this.getDirNumSecDirecc());
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
        String sql = "SELECT * FROM DIRECCI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDirNumContrato() != null && this.getDirNumContrato().longValue() == -999) {
            conditions += " AND DIR_NUM_CONTRATO IS NULL";
        } else if (this.getDirNumContrato() != null) {
            conditions += " AND DIR_NUM_CONTRATO = ?";
            values.add(this.getDirNumContrato());
        }

        if (this.getDirCvePersFid() != null && "null".equals(this.getDirCvePersFid())) {
            conditions += " AND DIR_CVE_PERS_FID IS NULL";
        } else if (this.getDirCvePersFid() != null) {
            conditions += " AND DIR_CVE_PERS_FID = ?";
            values.add(this.getDirCvePersFid());
        }

        if (this.getDirNumPersFid() != null && this.getDirNumPersFid().longValue() == -999) {
            conditions += " AND DIR_NUM_PERS_FID IS NULL";
        } else if (this.getDirNumPersFid() != null) {
            conditions += " AND DIR_NUM_PERS_FID = ?";
            values.add(this.getDirNumPersFid());
        }

        if (this.getDirNumSecDirecc() != null && this.getDirNumSecDirecc().longValue() == -999) {
            conditions += " AND DIR_NUM_SEC_DIRECC IS NULL";
        } else if (this.getDirNumSecDirecc() != null) {
            conditions += " AND DIR_NUM_SEC_DIRECC = ?";
            values.add(this.getDirNumSecDirecc());
        }

        if (this.getDirCveTipoDomic() != null && "null".equals(this.getDirCveTipoDomic())) {
            conditions += " AND DIR_CVE_TIPO_DOMIC IS NULL";
        } else if (this.getDirCveTipoDomic() != null) {
            conditions += " AND DIR_CVE_TIPO_DOMIC = ?";
            values.add(this.getDirCveTipoDomic());
        }

        if (this.getDirNomAtencion() != null && "null".equals(this.getDirNomAtencion())) {
            conditions += " AND DIR_NOM_ATENCION IS NULL";
        } else if (this.getDirNomAtencion() != null) {
            conditions += " AND DIR_NOM_ATENCION = ?";
            values.add(this.getDirNomAtencion());
        }

        if (this.getDirCalleNum() != null && "null".equals(this.getDirCalleNum())) {
            conditions += " AND DIR_CALLE_NUM IS NULL";
        } else if (this.getDirCalleNum() != null) {
            conditions += " AND DIR_CALLE_NUM = ?";
            values.add(this.getDirCalleNum());
        }

        if (this.getDirNomColonia() != null && "null".equals(this.getDirNomColonia())) {
            conditions += " AND DIR_NOM_COLONIA IS NULL";
        } else if (this.getDirNomColonia() != null) {
            conditions += " AND DIR_NOM_COLONIA = ?";
            values.add(this.getDirNomColonia());
        }

        if (this.getDirNomPoblacion() != null && "null".equals(this.getDirNomPoblacion())) {
            conditions += " AND DIR_NOM_POBLACION IS NULL";
        } else if (this.getDirNomPoblacion() != null) {
            conditions += " AND DIR_NOM_POBLACION = ?";
            values.add(this.getDirNomPoblacion());
        }

        if (this.getDirCodigoPostal() != null && this.getDirCodigoPostal().longValue() == -999) {
            conditions += " AND DIR_CODIGO_POSTAL IS NULL";
        } else if (this.getDirCodigoPostal() != null) {
            conditions += " AND DIR_CODIGO_POSTAL = ?";
            values.add(this.getDirCodigoPostal());
        }

        if (this.getDirNumEstado() != null && this.getDirNumEstado().longValue() == -999) {
            conditions += " AND DIR_NUM_ESTADO IS NULL";
        } else if (this.getDirNumEstado() != null) {
            conditions += " AND DIR_NUM_ESTADO = ?";
            values.add(this.getDirNumEstado());
        }

        if (this.getDirNomEstado() != null && "null".equals(this.getDirNomEstado())) {
            conditions += " AND DIR_NOM_ESTADO IS NULL";
        } else if (this.getDirNomEstado() != null) {
            conditions += " AND DIR_NOM_ESTADO = ?";
            values.add(this.getDirNomEstado());
        }

        if (this.getDirNumPais() != null && this.getDirNumPais().longValue() == -999) {
            conditions += " AND DIR_NUM_PAIS IS NULL";
        } else if (this.getDirNumPais() != null) {
            conditions += " AND DIR_NUM_PAIS = ?";
            values.add(this.getDirNumPais());
        }

        if (this.getDirNomPais() != null && "null".equals(this.getDirNomPais())) {
            conditions += " AND DIR_NOM_PAIS IS NULL";
        } else if (this.getDirNomPais() != null) {
            conditions += " AND DIR_NOM_PAIS = ?";
            values.add(this.getDirNomPais());
        }

        if (this.getDirAnoAltaReg() != null && this.getDirAnoAltaReg().longValue() == -999) {
            conditions += " AND DIR_ANO_ALTA_REG IS NULL";
        } else if (this.getDirAnoAltaReg() != null) {
            conditions += " AND DIR_ANO_ALTA_REG = ?";
            values.add(this.getDirAnoAltaReg());
        }

        if (this.getDirMesAltaReg() != null && this.getDirMesAltaReg().longValue() == -999) {
            conditions += " AND DIR_MES_ALTA_REG IS NULL";
        } else if (this.getDirMesAltaReg() != null) {
            conditions += " AND DIR_MES_ALTA_REG = ?";
            values.add(this.getDirMesAltaReg());
        }

        if (this.getDirDiaAltaReg() != null && this.getDirDiaAltaReg().longValue() == -999) {
            conditions += " AND DIR_DIA_ALTA_REG IS NULL";
        } else if (this.getDirDiaAltaReg() != null) {
            conditions += " AND DIR_DIA_ALTA_REG = ?";
            values.add(this.getDirDiaAltaReg());
        }

        if (this.getDirAnoUltMod() != null && this.getDirAnoUltMod().longValue() == -999) {
            conditions += " AND DIR_ANO_ULT_MOD IS NULL";
        } else if (this.getDirAnoUltMod() != null) {
            conditions += " AND DIR_ANO_ULT_MOD = ?";
            values.add(this.getDirAnoUltMod());
        }

        if (this.getDirMesUltMod() != null && this.getDirMesUltMod().longValue() == -999) {
            conditions += " AND DIR_MES_ULT_MOD IS NULL";
        } else if (this.getDirMesUltMod() != null) {
            conditions += " AND DIR_MES_ULT_MOD = ?";
            values.add(this.getDirMesUltMod());
        }

        if (this.getDirDiaUltMod() != null && this.getDirDiaUltMod().longValue() == -999) {
            conditions += " AND DIR_DIA_ULT_MOD IS NULL";
        } else if (this.getDirDiaUltMod() != null) {
            conditions += " AND DIR_DIA_ULT_MOD = ?";
            values.add(this.getDirDiaUltMod());
        }

        if (this.getDirCveStDirecc() != null && "null".equals(this.getDirCveStDirecc())) {
            conditions += " AND DIR_CVE_ST_DIRECC IS NULL";
        } else if (this.getDirCveStDirecc() != null) {
            conditions += " AND DIR_CVE_ST_DIRECC = ?";
            values.add(this.getDirCveStDirecc());
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
        String sql = "UPDATE DIRECCI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DIR_NUM_CONTRATO = ?";
        pkValues.add(this.getDirNumContrato());
        conditions += " AND DIR_CVE_PERS_FID = ?";
        pkValues.add(this.getDirCvePersFid());
        conditions += " AND DIR_NUM_PERS_FID = ?";
        pkValues.add(this.getDirNumPersFid());
        conditions += " AND DIR_NUM_SEC_DIRECC = ?";
        pkValues.add(this.getDirNumSecDirecc());
        fields += " DIR_CVE_TIPO_DOMIC = ?, ";
        values.add(this.getDirCveTipoDomic());
        fields += " DIR_NOM_ATENCION = ?, ";
        values.add(this.getDirNomAtencion());
        fields += " DIR_CALLE_NUM = ?, ";
        values.add(this.getDirCalleNum());
        fields += " DIR_NOM_COLONIA = ?, ";
        values.add(this.getDirNomColonia());
        fields += " DIR_NOM_POBLACION = ?, ";
        values.add(this.getDirNomPoblacion());
        fields += " DIR_CODIGO_POSTAL = ?, ";
        values.add(this.getDirCodigoPostal());
        fields += " DIR_NUM_ESTADO = ?, ";
        values.add(this.getDirNumEstado());
        fields += " DIR_NOM_ESTADO = ?, ";
        values.add(this.getDirNomEstado());
        fields += " DIR_NUM_PAIS = ?, ";
        values.add(this.getDirNumPais());
        fields += " DIR_NOM_PAIS = ?, ";
        values.add(this.getDirNomPais());
        fields += " DIR_ANO_ALTA_REG = ?, ";
        values.add(this.getDirAnoAltaReg());
        fields += " DIR_MES_ALTA_REG = ?, ";
        values.add(this.getDirMesAltaReg());
        fields += " DIR_DIA_ALTA_REG = ?, ";
        values.add(this.getDirDiaAltaReg());
        fields += " DIR_ANO_ULT_MOD = ?, ";
        values.add(this.getDirAnoUltMod());
        fields += " DIR_MES_ULT_MOD = ?, ";
        values.add(this.getDirMesUltMod());
        fields += " DIR_DIA_ULT_MOD = ?, ";
        values.add(this.getDirDiaUltMod());
        fields += " DIR_CVE_ST_DIRECC = ?, ";
        values.add(this.getDirCveStDirecc());
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
        String sql = "INSERT INTO DIRECCI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DIR_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDirNumContrato());

        fields += ", DIR_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDirCvePersFid());

        fields += ", DIR_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDirNumPersFid());

        fields += ", DIR_NUM_SEC_DIRECC";
        fieldValues += ", ?";
        values.add(this.getDirNumSecDirecc());

        fields += ", DIR_CVE_TIPO_DOMIC";
        fieldValues += ", ?";
        values.add(this.getDirCveTipoDomic());

        fields += ", DIR_NOM_ATENCION";
        fieldValues += ", ?";
        values.add(this.getDirNomAtencion());

        fields += ", DIR_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getDirCalleNum());

        fields += ", DIR_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getDirNomColonia());

        fields += ", DIR_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getDirNomPoblacion());

        fields += ", DIR_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getDirCodigoPostal());

        fields += ", DIR_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getDirNumEstado());

        fields += ", DIR_NOM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getDirNomEstado());

        fields += ", DIR_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getDirNumPais());

        fields += ", DIR_NOM_PAIS";
        fieldValues += ", ?";
        values.add(this.getDirNomPais());

        fields += ", DIR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDirAnoAltaReg());

        fields += ", DIR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDirMesAltaReg());

        fields += ", DIR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDirDiaAltaReg());

        fields += ", DIR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDirAnoUltMod());

        fields += ", DIR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDirMesUltMod());

        fields += ", DIR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDirDiaUltMod());

        fields += ", DIR_CVE_ST_DIRECC";
        fieldValues += ", ?";
        values.add(this.getDirCveStDirecc());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DIRECCI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DIR_NUM_CONTRATO = ?";
        values.add(this.getDirNumContrato());
        conditions += " AND DIR_CVE_PERS_FID = ?";
        values.add(this.getDirCvePersFid());
        conditions += " AND DIR_NUM_PERS_FID = ?";
        values.add(this.getDirNumPersFid());
        conditions += " AND DIR_NUM_SEC_DIRECC = ?";
        values.add(this.getDirNumSecDirecc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Direcci instance = (Direcci) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDirNumContrato().equals(instance.getDirNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDirCvePersFid().equals(instance.getDirCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDirNumPersFid().equals(instance.getDirNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDirNumSecDirecc().equals(instance.getDirNumSecDirecc()))
            equalObjects = false;
        if (equalObjects && !this.getDirCveTipoDomic().equals(instance.getDirCveTipoDomic()))
            equalObjects = false;
        if (equalObjects && !this.getDirNomAtencion().equals(instance.getDirNomAtencion()))
            equalObjects = false;
        if (equalObjects && !this.getDirCalleNum().equals(instance.getDirCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getDirNomColonia().equals(instance.getDirNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getDirNomPoblacion().equals(instance.getDirNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getDirCodigoPostal().equals(instance.getDirCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getDirNumEstado().equals(instance.getDirNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getDirNomEstado().equals(instance.getDirNomEstado()))
            equalObjects = false;
        if (equalObjects && !this.getDirNumPais().equals(instance.getDirNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getDirNomPais().equals(instance.getDirNomPais()))
            equalObjects = false;
        if (equalObjects && !this.getDirAnoAltaReg().equals(instance.getDirAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDirMesAltaReg().equals(instance.getDirMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDirDiaAltaReg().equals(instance.getDirDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDirAnoUltMod().equals(instance.getDirAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDirMesUltMod().equals(instance.getDirMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDirDiaUltMod().equals(instance.getDirDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDirCveStDirecc().equals(instance.getDirCveStDirecc()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Direcci result = new Direcci();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDirNumContrato((BigDecimal) objectData.getData("DIR_NUM_CONTRATO"));
        result.setDirCvePersFid((String) objectData.getData("DIR_CVE_PERS_FID"));
        result.setDirNumPersFid((BigDecimal) objectData.getData("DIR_NUM_PERS_FID"));
        result.setDirNumSecDirecc((BigDecimal) objectData.getData("DIR_NUM_SEC_DIRECC"));
        result.setDirCveTipoDomic((String) objectData.getData("DIR_CVE_TIPO_DOMIC"));
        result.setDirNomAtencion((String) objectData.getData("DIR_NOM_ATENCION"));
        result.setDirCalleNum((String) objectData.getData("DIR_CALLE_NUM"));
        result.setDirNomColonia((String) objectData.getData("DIR_NOM_COLONIA"));
        result.setDirNomPoblacion((String) objectData.getData("DIR_NOM_POBLACION"));
        result.setDirCodigoPostal((BigDecimal) objectData.getData("DIR_CODIGO_POSTAL"));
        result.setDirNumEstado((BigDecimal) objectData.getData("DIR_NUM_ESTADO"));
        result.setDirNomEstado((String) objectData.getData("DIR_NOM_ESTADO"));
        result.setDirNumPais((BigDecimal) objectData.getData("DIR_NUM_PAIS"));
        result.setDirNomPais((String) objectData.getData("DIR_NOM_PAIS"));
        result.setDirAnoAltaReg((BigDecimal) objectData.getData("DIR_ANO_ALTA_REG"));
        result.setDirMesAltaReg((BigDecimal) objectData.getData("DIR_MES_ALTA_REG"));
        result.setDirDiaAltaReg((BigDecimal) objectData.getData("DIR_DIA_ALTA_REG"));
        result.setDirAnoUltMod((BigDecimal) objectData.getData("DIR_ANO_ULT_MOD"));
        result.setDirMesUltMod((BigDecimal) objectData.getData("DIR_MES_ULT_MOD"));
        result.setDirDiaUltMod((BigDecimal) objectData.getData("DIR_DIA_ULT_MOD"));
        result.setDirCveStDirecc((String) objectData.getData("DIR_CVE_ST_DIRECC"));

        return result;

    }

}
