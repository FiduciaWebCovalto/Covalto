package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DOM_FISCAL_PK", columns = { "DF_NUM_CONTRATO" }, sequences = { "MAX" })
public class DomFiscal extends DomainObject {

    BigDecimal dfNumContrato =null;
    String dfTipoPersona =null;
    BigDecimal dfNumPersona =null;
    String dfDomicilio =null;
    String dfRfc =null;
    String dfNombre =null;
    BigDecimal dfAnoAltaReg =null;
    BigDecimal dfMesAltaReg =null;
    BigDecimal dfDiaAltaReg =null;
    BigDecimal dfAnoUltMod =null;
    BigDecimal dfMesUltMod =null;
    BigDecimal dfDiaUltMod =null;
    String dfNumExt =null;
    String dfNumInt =null;
    String dfColonia =null;
    String dfDelegacion =null;
    String dfEstado =null;
    String dfCp =null;
    String dfContacto =null;
    BigDecimal dfNumSeq =null;
    String dfPorcentaje =null;
    String dfEmail =null;
    String dfStatus =null;
    public DomFiscal() {
    super();
    this.pkColumns = 8;
    }
    public void setDfNumContrato (BigDecimal dfNumContrato) {
    this.dfNumContrato=dfNumContrato;
    }
    public void setDfTipoPersona (String dfTipoPersona) {
    this.dfTipoPersona=dfTipoPersona;
    }
    public void setDfNumPersona (BigDecimal dfNumPersona) {
    this.dfNumPersona=dfNumPersona;
    }
    public void setDfDomicilio (String dfDomicilio) {
    this.dfDomicilio=dfDomicilio;
    }
    public void setDfRfc (String dfRfc) {
    this.dfRfc=dfRfc;
    }
    public void setDfNombre (String dfNombre) {
    this.dfNombre=dfNombre;
    }
    public void setDfAnoAltaReg (BigDecimal dfAnoAltaReg) {
    this.dfAnoAltaReg=dfAnoAltaReg;
    }
    public void setDfMesAltaReg (BigDecimal dfMesAltaReg) {
    this.dfMesAltaReg=dfMesAltaReg;
    }
    public void setDfDiaAltaReg (BigDecimal dfDiaAltaReg) {
    this.dfDiaAltaReg=dfDiaAltaReg;
    }
    public void setDfAnoUltMod (BigDecimal dfAnoUltMod) {
    this.dfAnoUltMod=dfAnoUltMod;
    }
    public void setDfMesUltMod (BigDecimal dfMesUltMod) {
    this.dfMesUltMod=dfMesUltMod;
    }
    public void setDfDiaUltMod (BigDecimal dfDiaUltMod) {
    this.dfDiaUltMod=dfDiaUltMod;
    }
    public void setDfNumExt (String dfNumExt) {
    this.dfNumExt=dfNumExt;
    }
    public void setDfNumInt (String dfNumInt) {
    this.dfNumInt=dfNumInt;
    }
    public void setDfColonia (String dfColonia) {
    this.dfColonia=dfColonia;
    }
    public void setDfDelegacion (String dfDelegacion) {
    this.dfDelegacion=dfDelegacion;
    }
    public void setDfEstado (String dfEstado) {
    this.dfEstado=dfEstado;
    }
    public void setDfCp (String dfCp) {
    this.dfCp=dfCp;
    }
    public void setDfContacto (String dfContacto) {
    this.dfContacto=dfContacto;
    }
    public void setDfNumSeq (BigDecimal dfNumSeq) {
    this.dfNumSeq=dfNumSeq;
    }
    public void setDfPorcentaje (String dfPorcentaje) {
    this.dfPorcentaje=dfPorcentaje;
    }
    public void setDfEmail (String dfEmail) {
    this.dfEmail=dfEmail;
    }
    public void setDfStatus (String dfStatus) {
    this.dfStatus=dfStatus;
    }
    public BigDecimal getDfNumContrato() {
    return this.dfNumContrato;
    }
    public String getDfTipoPersona() {
    return this.dfTipoPersona;
    }
    public BigDecimal getDfNumPersona() {
    return this.dfNumPersona;
    }
    public String getDfDomicilio() {
    return this.dfDomicilio;
    }
    public String getDfRfc() {
    return this.dfRfc;
    }
    public String getDfNombre() {
    return this.dfNombre;
    }
    public BigDecimal getDfAnoAltaReg() {
    return this.dfAnoAltaReg;
    }
    public BigDecimal getDfMesAltaReg() {
    return this.dfMesAltaReg;
    }
    public BigDecimal getDfDiaAltaReg() {
    return this.dfDiaAltaReg;
    }
    public BigDecimal getDfAnoUltMod() {
    return this.dfAnoUltMod;
    }
    public BigDecimal getDfMesUltMod() {
    return this.dfMesUltMod;
    }
    public BigDecimal getDfDiaUltMod() {
    return this.dfDiaUltMod;
    }
    public String getDfNumExt() {
    return this.dfNumExt;
    }
    public String getDfNumInt() {
    return this.dfNumInt;
    }
    public String getDfColonia() {
    return this.dfColonia;
    }
    public String getDfDelegacion() {
    return this.dfDelegacion;
    }
    public String getDfEstado() {
    return this.dfEstado;
    }
    public String getDfCp() {
    return this.dfCp;
    }
    public String getDfContacto() {
    return this.dfContacto;
    }
    public BigDecimal getDfNumSeq() {
    return this.dfNumSeq;
    }
    public String getDfPorcentaje() {
    return this.dfPorcentaje;
    }
    public String getDfEmail() {
    return this.dfEmail;
    }
    public String getDfStatus() {
    return this.dfStatus;
    }
      public DMLObject getSelectByPK() {
      if(!retrieveSQL) return null;
      DMLObject result = new DMLObject();
      String sql = "SELECT * FROM DOM_FISCAL ";
      String conditions = "";
      ArrayList values = new ArrayList();
    if(this.getDfNumContrato() != null && this.getDfNumContrato().longValue() == -999) {
    conditions += " AND DF_NUM_CONTRATO IS NULL";
    } else if(this.getDfNumContrato() != null) {
    conditions += " AND DF_NUM_CONTRATO =?";
    values.add(this.getDfNumContrato());
    }
    if(this.getDfTipoPersona() != null && "null".equals(this.getDfTipoPersona())) {
    conditions += " AND DF_TIPO_PERSONA IS NULL";
    } else if(this.getDfTipoPersona() != null) {
    conditions += " AND DF_TIPO_PERSONA =?";
    values.add(this.getDfTipoPersona());
    }
    if(this.getDfNumPersona() != null && this.getDfNumPersona().longValue() == -999) {
    conditions += " AND DF_NUM_PERSONA IS NULL";
    } else if(this.getDfNumPersona() != null) {
    conditions += " AND DF_NUM_PERSONA =?";
    values.add(this.getDfNumPersona());
    }
    if(this.getDfRfc() != null && "null".equals(this.getDfRfc())) {
    conditions += " AND DF_RFC IS NULL";
    } else if(this.getDfRfc() != null) {
    conditions += " AND DF_RFC =?";
    values.add(this.getDfRfc());
    }
    if(this.getDfNombre() != null && "null".equals(this.getDfNombre())) {
    conditions += " AND DF_NOMBRE IS NULL";
    } else if(this.getDfNombre() != null) {
    conditions += " AND DF_NOMBRE =?";
    values.add(this.getDfNombre());
    }
    if(!"".equals(conditions)) {
    conditions = conditions.substring(4).trim();
    sql += "WHERE " + conditions;
    result.setSql(sql);
    result.setParameters(values.toArray());
    }
    return result;
    }
    public DMLObject getSelect() {
    if(!retrieveSQL) return null;
    DMLObject result = new DMLObject();
    String sql = "SELECT * FROM DOM_FISCAL ";
    String conditions = "";
    ArrayList values = new ArrayList();
    if(!"".equals(conditions)) {
    conditions = conditions.substring(4).trim();
    sql += "WHERE " + conditions;
    result.setSql(sql);
    result.setParameters(values.toArray());
    }
    return result;
    }
    public DMLObject getUpdate() {
    if(!retrieveSQL) return null;
    DMLObject result = new DMLObject();
    String sql = "UPDATE DOM_FISCAL SET ";
    String fields = "";
    String conditions = "";
    ArrayList pkValues = new ArrayList();
    ArrayList values = new ArrayList();
    conditions += " AND DF_NUM_CONTRATO = ?";
    pkValues.add(this.getDfNumContrato());
    conditions += " AND DF_TIPO_PERSONA = ?";
    pkValues.add(this.getDfTipoPersona());
    conditions += " AND DF_NUM_PERSONA = ?";
    pkValues.add(this.getDfNumPersona());
    fields += " DF_DOMICILIO = ?, ";
    values.add(this.getDfDomicilio());
    conditions += " AND DF_RFC = ?";
    pkValues.add(this.getDfRfc());
    conditions += " AND DF_NOMBRE = ?";
    pkValues.add(this.getDfNombre());
    fields += " DF_ANO_ALTA_REG = ?, ";
    values.add(this.getDfAnoAltaReg());
    fields += " DF_MES_ALTA_REG = ?, ";
    values.add(this.getDfMesAltaReg());
    fields += " DF_DIA_ALTA_REG = ?, ";
    values.add(this.getDfDiaAltaReg());
    fields += " DF_ANO_ULT_MOD = ?, ";
    values.add(this.getDfAnoUltMod());
    fields += " DF_MES_ULT_MOD = ?, ";
    values.add(this.getDfMesUltMod());
    fields += " DF_DIA_ULT_MOD = ?, ";
    values.add(this.getDfDiaUltMod());
    fields += " DF_NUM_EXT = ?, ";
    values.add(this.getDfNumExt());
    fields += " DF_NUM_INT = ?, ";
    values.add(this.getDfNumInt());
    fields += " DF_COLONIA = ?, ";
    values.add(this.getDfColonia());
    fields += " DF_DELEGACION = ?, ";
    values.add(this.getDfDelegacion());
    fields += " DF_ESTADO = ?, ";
    values.add(this.getDfEstado());
    fields += " DF_CP = ?, ";
    values.add(this.getDfCp());
    fields += " DF_CONTACTO = ?, ";
    values.add(this.getDfContacto());
    fields += " DF_NUM_SEQ = ?, ";
    values.add(this.getDfNumSeq());
    fields += " DF_PORCENTAJE = ?, ";
    values.add(this.getDfPorcentaje());
    fields += " DF_EMAIL = ?, ";
    values.add(this.getDfEmail());
    fields += " DF_STATUS = ?, ";
    values.add(this.getDfStatus());
    for(int i = 0; i < pkValues.size(); i++) {
    values.add(pkValues.get(i));
    };
    fields = fields.substring(0, fields.length() - 2).trim();
    conditions = conditions.substring(4).trim();
    sql += fields + " WHERE " + conditions;
    result.setSql(sql);
    result.setParameters(values.toArray());
    return result;
    }
    public DMLObject getInsert() {
    if(!retrieveSQL) return null;
    DMLObject result = new DMLObject();
    String sql = "INSERT INTO DOM_FISCAL ( ";
    String fields = "";
    String fieldValues = "";
    ArrayList values = new ArrayList();
    fields += ",DF_NUM_CONTRATO ";
    fieldValues += ", ?";
    values.add(this.getDfNumContrato());
    fields += ",DF_TIPO_PERSONA ";
    fieldValues += ", ?";
    values.add(this.getDfTipoPersona());
    fields += ",DF_NUM_PERSONA ";
    fieldValues += ", ?";
    values.add(this.getDfNumPersona());
    fields += ",DF_DOMICILIO ";
    fieldValues += ", ?";
    values.add(this.getDfDomicilio());
    fields += ",DF_RFC ";
    fieldValues += ", ?";
    values.add(this.getDfRfc());
    fields += ",DF_NOMBRE ";
    fieldValues += ", ?";
    values.add(this.getDfNombre());
    fields += ",DF_ANO_ALTA_REG ";
    fieldValues += ", ?";
    values.add(this.getDfAnoAltaReg());
    fields += ",DF_MES_ALTA_REG ";
    fieldValues += ", ?";
    values.add(this.getDfMesAltaReg());
    fields += ",DF_DIA_ALTA_REG ";
    fieldValues += ", ?";
    values.add(this.getDfDiaAltaReg());
    fields += ",DF_ANO_ULT_MOD ";
    fieldValues += ", ?";
    values.add(this.getDfAnoUltMod());
    fields += ",DF_MES_ULT_MOD ";
    fieldValues += ", ?";
    values.add(this.getDfMesUltMod());
    fields += ",DF_DIA_ULT_MOD ";
    fieldValues += ", ?";
    values.add(this.getDfDiaUltMod());
    fields += ",DF_NUM_EXT ";
    fieldValues += ", ?";
    values.add(this.getDfNumExt());
    fields += ",DF_NUM_INT ";
    fieldValues += ", ?";
    values.add(this.getDfNumInt());
    fields += ",DF_COLONIA ";
    fieldValues += ", ?";
    values.add(this.getDfColonia());
    fields += ",DF_DELEGACION ";
    fieldValues += ", ?";
    values.add(this.getDfDelegacion());
    fields += ",DF_ESTADO ";
    fieldValues += ", ?";
    values.add(this.getDfEstado());
    fields += ",DF_CP ";
    fieldValues += ", ?";
    values.add(this.getDfCp());
    fields += ",DF_CONTACTO ";
    fieldValues += ", ?";
    values.add(this.getDfContacto());
    fields += ",DF_NUM_SEQ ";
    fieldValues += ", ?";
    values.add(this.getDfNumSeq());
    fields += ",DF_PORCENTAJE ";
    fieldValues += ", ?";
    values.add(this.getDfPorcentaje());
    fields += ",DF_EMAIL ";
    fieldValues += ", ?";
    values.add(this.getDfEmail());
    fields += ",DF_STATUS ";
    fieldValues += ", ?";
    values.add(this.getDfStatus());
    fields = fields.substring(1).trim();
    fieldValues = fieldValues.substring(1).trim();
    sql += fields + " ) VALUES (" + fieldValues + ")";
    result.setSql(sql);
    result.setParameters(values.toArray());
    return result;
    }
    public DMLObject getDelete() {
        if(!retrieveSQL) return null;
    DMLObject result = new DMLObject();
    String sql = "DELETE FROM DOM_FISCAL WHERE ";
    String conditions = "";
    ArrayList values = new ArrayList();
    conditions += " AND DF_NUM_CONTRATO = ?";
    values.add(this.getDfNumContrato());
    conditions += " AND DF_TIPO_PERSONA = ?";
    values.add(this.getDfTipoPersona());
    conditions += " AND DF_NUM_PERSONA = ?";
    values.add(this.getDfNumPersona());
    conditions += " AND DF_RFC = ?";
    values.add(this.getDfRfc());
    conditions += " AND DF_NOMBRE = ?";
    values.add(this.getDfNombre());
    conditions = conditions.substring(4).trim();
    result.setSql(sql + conditions);
    result.setParameters(values.toArray());
    return result;
    }
    public boolean validate() {
    return true;  }
    public boolean doCompare(Object compareWith) {
    DomFiscal instance = (DomFiscal)compareWith;
    boolean equalObjects = true;
    if(equalObjects && !this.getDfNumContrato().equals(instance.getDfNumContrato())) equalObjects = false;
    if(equalObjects && !this.getDfTipoPersona().equals(instance.getDfTipoPersona())) equalObjects = false;
    if(equalObjects && !this.getDfNumPersona().equals(instance.getDfNumPersona())) equalObjects = false;
    if(equalObjects && !this.getDfDomicilio().equals(instance.getDfDomicilio())) equalObjects = false;
    if(equalObjects && !this.getDfRfc().equals(instance.getDfRfc())) equalObjects = false;
    if(equalObjects && !this.getDfNombre().equals(instance.getDfNombre())) equalObjects = false;
    if(equalObjects && !this.getDfAnoAltaReg().equals(instance.getDfAnoAltaReg())) equalObjects = false;
    if(equalObjects && !this.getDfMesAltaReg().equals(instance.getDfMesAltaReg())) equalObjects = false;
    if(equalObjects && !this.getDfDiaAltaReg().equals(instance.getDfDiaAltaReg())) equalObjects = false;
    if(equalObjects && !this.getDfAnoUltMod().equals(instance.getDfAnoUltMod())) equalObjects = false;
    if(equalObjects && !this.getDfMesUltMod().equals(instance.getDfMesUltMod())) equalObjects = false;
    if(equalObjects && !this.getDfDiaUltMod().equals(instance.getDfDiaUltMod())) equalObjects = false;
    if(equalObjects && !this.getDfNumExt().equals(instance.getDfNumExt())) equalObjects = false;
    if(equalObjects && !this.getDfNumInt().equals(instance.getDfNumInt())) equalObjects = false;
    if(equalObjects && !this.getDfColonia().equals(instance.getDfColonia())) equalObjects = false;
    if(equalObjects && !this.getDfDelegacion().equals(instance.getDfDelegacion())) equalObjects = false;
    if(equalObjects && !this.getDfEstado().equals(instance.getDfEstado())) equalObjects = false;
    if(equalObjects && !this.getDfCp().equals(instance.getDfCp())) equalObjects = false;
    if(equalObjects && !this.getDfContacto().equals(instance.getDfContacto())) equalObjects = false;
    if(equalObjects && !this.getDfNumSeq().equals(instance.getDfNumSeq())) equalObjects = false;
    if(equalObjects && !this.getDfPorcentaje().equals(instance.getDfPorcentaje())) equalObjects = false;
    if(equalObjects && !this.getDfEmail().equals(instance.getDfEmail())) equalObjects = false;
    if(equalObjects && !this.getDfStatus().equals(instance.getDfStatus())) equalObjects = false;
    return equalObjects;
    }
    public Object selectAsObject() {
    DomFiscal result = new DomFiscal();
     DataRow objectData = null;
     objectData = selectAsDataRow();
    result.setDfNumContrato((BigDecimal)objectData.getData("DF_NUM_CONTRATO"));
    result.setDfTipoPersona((String)objectData.getData("DF_TIPO_PERSONA"));
    result.setDfNumPersona((BigDecimal)objectData.getData("DF_NUM_PERSONA"));
    result.setDfDomicilio((String)objectData.getData("DF_DOMICILIO"));
    result.setDfRfc((String)objectData.getData("DF_RFC"));
    result.setDfNombre((String)objectData.getData("DF_NOMBRE"));
    result.setDfAnoAltaReg((BigDecimal)objectData.getData("DF_ANO_ALTA_REG"));
    result.setDfMesAltaReg((BigDecimal)objectData.getData("DF_MES_ALTA_REG"));
    result.setDfDiaAltaReg((BigDecimal)objectData.getData("DF_DIA_ALTA_REG"));
    result.setDfAnoUltMod((BigDecimal)objectData.getData("DF_ANO_ULT_MOD"));
    result.setDfMesUltMod((BigDecimal)objectData.getData("DF_MES_ULT_MOD"));
    result.setDfDiaUltMod((BigDecimal)objectData.getData("DF_DIA_ULT_MOD"));
    result.setDfNumExt((String)objectData.getData("DF_NUM_EXT"));
    result.setDfNumInt((String)objectData.getData("DF_NUM_INT"));
    result.setDfColonia((String)objectData.getData("DF_COLONIA"));
    result.setDfDelegacion((String)objectData.getData("DF_DELEGACION"));
    result.setDfEstado((String)objectData.getData("DF_ESTADO"));
    result.setDfCp((String)objectData.getData("DF_CP"));
    result.setDfContacto((String)objectData.getData("DF_CONTACTO"));
    result.setDfNumSeq((BigDecimal)objectData.getData("DF_NUM_SEQ"));
    result.setDfPorcentaje((String)objectData.getData("DF_PORCENTAJE"));
    result.setDfEmail((String)objectData.getData("DF_EMAIL"));
    result.setDfStatus((String)objectData.getData("DF_STATUS"));
    return result;
    }

}
