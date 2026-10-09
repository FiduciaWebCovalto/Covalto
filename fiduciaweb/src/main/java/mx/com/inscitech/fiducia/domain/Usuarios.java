package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "USUARIOS_PK", columns = { "USU_NUM_USUARIO" }, sequences = { "MAX" })
public class Usuarios extends DomainObject {

    String usuFechaPassword =null;
    BigDecimal usuEstatusSeguridad =null;
    BigDecimal usuToken =null;
    BigDecimal usuMontoAutorizado =null;
    BigDecimal usuNumUsuario =null;
    String usuNomUsuario =null;
    String usuTipoUsuario =null;
    BigDecimal usuNumPuesto =null;
    String usuNomPuesto =null;
    String usuPassword =null;
    BigDecimal usuAnoAltaReg =null;
    BigDecimal usuMesAltaReg =null;
    BigDecimal usuDiaAltaReg =null;
    BigDecimal usuAnoUltMod =null;
    BigDecimal usuMesUltMod =null;
    BigDecimal usuDiaUltMod =null;
    String usuCveStUsuario =null;
    BigDecimal usuNumNivel1 =null;
    BigDecimal usuNumNivel2 =null;
    BigDecimal usuNumNivel3 =null;
    BigDecimal usuNumNivel4 =null;
    BigDecimal usuNumNivel5 =null;
    BigDecimal usuCentroLogro =null;
    BigDecimal usuCentroCosto =null;
    BigDecimal usuPtceGpot =null;

    public void setUsuEmail(String usuEmail) {
        this.usuEmail = usuEmail;
    }

    public String getUsuEmail() {
        return usuEmail;
    }
    String usuFechaUltAcceso =null;
    String usuEmail=null;
    public Usuarios() {
    super();
    this.pkColumns = 8;
    }
    public void setUsuFechaPassword (String usuFechaPassword) {
    this.usuFechaPassword=usuFechaPassword;
    }
    public void setUsuEstatusSeguridad (BigDecimal usuEstatusSeguridad) {
    this.usuEstatusSeguridad=usuEstatusSeguridad;
    }
    public void setUsuToken (BigDecimal usuToken) {
    this.usuToken=usuToken;
    }
    public void setUsuMontoAutorizado (BigDecimal usuMontoAutorizado) {
    this.usuMontoAutorizado=usuMontoAutorizado;
    }
    public void setUsuNumUsuario (BigDecimal usuNumUsuario) {
    this.usuNumUsuario=usuNumUsuario;
    }
    public void setUsuNomUsuario (String usuNomUsuario) {
    this.usuNomUsuario=usuNomUsuario;
    }
    public void setUsuTipoUsuario (String usuTipoUsuario) {
    this.usuTipoUsuario=usuTipoUsuario;
    }
    public void setUsuNumPuesto (BigDecimal usuNumPuesto) {
    this.usuNumPuesto=usuNumPuesto;
    }
    public void setUsuNomPuesto (String usuNomPuesto) {
    this.usuNomPuesto=usuNomPuesto;
    }
    public void setUsuPassword (String usuPassword) {
    this.usuPassword=usuPassword;
    }
    public void setUsuAnoAltaReg (BigDecimal usuAnoAltaReg) {
    this.usuAnoAltaReg=usuAnoAltaReg;
    }
    public void setUsuMesAltaReg (BigDecimal usuMesAltaReg) {
    this.usuMesAltaReg=usuMesAltaReg;
    }
    public void setUsuDiaAltaReg (BigDecimal usuDiaAltaReg) {
    this.usuDiaAltaReg=usuDiaAltaReg;
    }
    public void setUsuAnoUltMod (BigDecimal usuAnoUltMod) {
    this.usuAnoUltMod=usuAnoUltMod;
    }
    public void setUsuMesUltMod (BigDecimal usuMesUltMod) {
    this.usuMesUltMod=usuMesUltMod;
    }
    public void setUsuDiaUltMod (BigDecimal usuDiaUltMod) {
    this.usuDiaUltMod=usuDiaUltMod;
    }
    public void setUsuCveStUsuario (String usuCveStUsuario) {
    this.usuCveStUsuario=usuCveStUsuario;
    }
    public void setUsuNumNivel1 (BigDecimal usuNumNivel1) {
    this.usuNumNivel1=usuNumNivel1;
    }
    public void setUsuNumNivel2 (BigDecimal usuNumNivel2) {
    this.usuNumNivel2=usuNumNivel2;
    }
    public void setUsuNumNivel3 (BigDecimal usuNumNivel3) {
    this.usuNumNivel3=usuNumNivel3;
    }
    public void setUsuNumNivel4 (BigDecimal usuNumNivel4) {
    this.usuNumNivel4=usuNumNivel4;
    }
    public void setUsuNumNivel5 (BigDecimal usuNumNivel5) {
    this.usuNumNivel5=usuNumNivel5;
    }
    public void setUsuCentroLogro (BigDecimal usuCentroLogro) {
    this.usuCentroLogro=usuCentroLogro;
    }
    public void setUsuCentroCosto (BigDecimal usuCentroCosto) {
    this.usuCentroCosto=usuCentroCosto;
    }
    public void setUsuPtceGpot (BigDecimal usuPtceGpot) {
    this.usuPtceGpot=usuPtceGpot;
    }
    public void setUsuFechaUltAcceso (String usuFechaUltAcceso) {
    this.usuFechaUltAcceso=usuFechaUltAcceso;
    }
    public String getUsuFechaPassword() {
    return this.usuFechaPassword;
    }
    public BigDecimal getUsuEstatusSeguridad() {
    return this.usuEstatusSeguridad;
    }
    public BigDecimal getUsuToken() {
    return this.usuToken;
    }
    public BigDecimal getUsuMontoAutorizado() {
    return this.usuMontoAutorizado;
    }
    public BigDecimal getUsuNumUsuario() {
    return this.usuNumUsuario;
    }
    public String getUsuNomUsuario() {
    return this.usuNomUsuario;
    }
    public String getUsuTipoUsuario() {
    return this.usuTipoUsuario;
    }
    public BigDecimal getUsuNumPuesto() {
    return this.usuNumPuesto;
    }
    public String getUsuNomPuesto() {
    return this.usuNomPuesto;
    }
    public String getUsuPassword() {
    return this.usuPassword;
    }
    public BigDecimal getUsuAnoAltaReg() {
    return this.usuAnoAltaReg;
    }
    public BigDecimal getUsuMesAltaReg() {
    return this.usuMesAltaReg;
    }
    public BigDecimal getUsuDiaAltaReg() {
    return this.usuDiaAltaReg;
    }
    public BigDecimal getUsuAnoUltMod() {
    return this.usuAnoUltMod;
    }
    public BigDecimal getUsuMesUltMod() {
    return this.usuMesUltMod;
    }
    public BigDecimal getUsuDiaUltMod() {
    return this.usuDiaUltMod;
    }
    public String getUsuCveStUsuario() {
    return this.usuCveStUsuario;
    }
    public BigDecimal getUsuNumNivel1() {
    return this.usuNumNivel1;
    }
    public BigDecimal getUsuNumNivel2() {
    return this.usuNumNivel2;
    }
    public BigDecimal getUsuNumNivel3() {
    return this.usuNumNivel3;
    }
    public BigDecimal getUsuNumNivel4() {
    return this.usuNumNivel4;
    }
    public BigDecimal getUsuNumNivel5() {
    return this.usuNumNivel5;
    }
    public BigDecimal getUsuCentroLogro() {
    return this.usuCentroLogro;
    }
    public BigDecimal getUsuCentroCosto() {
    return this.usuCentroCosto;
    }
    public BigDecimal getUsuPtceGpot() {
    return this.usuPtceGpot;
    }
    public String getUsuFechaUltAcceso() {
    return this.usuFechaUltAcceso;
    }
      public DMLObject getSelectByPK() {
      if(!retrieveSQL) return null;
      DMLObject result = new DMLObject();
      String sql = "SELECT * FROM USUARIOS ";
      String conditions = "";
      ArrayList values = new ArrayList();
    if(this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
    conditions += " AND USU_NUM_USUARIO IS NULL";
    } else if(this.getUsuNumUsuario() != null) {
    conditions += " AND USU_NUM_USUARIO =?";
    values.add(this.getUsuNumUsuario());
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
    String sql = "SELECT * FROM USUARIOS ";
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
    String sql = "UPDATE USUARIOS SET ";
    String fields = "";
    String conditions = "";
    ArrayList pkValues = new ArrayList();
    ArrayList values = new ArrayList();
    fields += " USU_FECHA_PASSWORD = ?, ";
    values.add(this.getUsuFechaPassword());
    fields += " USU_ESTATUS_SEGURIDAD = ?, ";
    values.add(this.getUsuEstatusSeguridad());
    fields += " USU_TOKEN = ?, ";
    values.add(this.getUsuToken());
    fields += " USU_MONTO_AUTORIZADO = ?, ";
    values.add(this.getUsuMontoAutorizado());
    conditions += " AND USU_NUM_USUARIO = ?";
    pkValues.add(this.getUsuNumUsuario());
    fields += " USU_NOM_USUARIO = ?, ";
    values.add(this.getUsuNomUsuario());
    fields += " USU_TIPO_USUARIO = ?, ";
    values.add(this.getUsuTipoUsuario());
    fields += " USU_NUM_PUESTO = ?, ";
    values.add(this.getUsuNumPuesto());
    fields += " USU_NOM_PUESTO = ?, ";
    values.add(this.getUsuNomPuesto());
    fields += " USU_PASSWORD = ?, ";
    values.add(this.getUsuPassword());
    fields += " USU_ANO_ALTA_REG = ?, ";
    values.add(this.getUsuAnoAltaReg());
    fields += " USU_MES_ALTA_REG = ?, ";
    values.add(this.getUsuMesAltaReg());
    fields += " USU_DIA_ALTA_REG = ?, ";
    values.add(this.getUsuDiaAltaReg());
    fields += " USU_ANO_ULT_MOD = ?, ";
    values.add(this.getUsuAnoUltMod());
    fields += " USU_MES_ULT_MOD = ?, ";
    values.add(this.getUsuMesUltMod());
    fields += " USU_DIA_ULT_MOD = ?, ";
    values.add(this.getUsuDiaUltMod());
    fields += " USU_CVE_ST_USUARIO = ?, ";
    values.add(this.getUsuCveStUsuario());
    fields += " USU_NUM_NIVEL1 = ?, ";
    values.add(this.getUsuNumNivel1());
    fields += " USU_NUM_NIVEL2 = ?, ";
    values.add(this.getUsuNumNivel2());
    fields += " USU_NUM_NIVEL3 = ?, ";
    values.add(this.getUsuNumNivel3());
    fields += " USU_NUM_NIVEL4 = ?, ";
    values.add(this.getUsuNumNivel4());
    fields += " USU_NUM_NIVEL5 = ?, ";
    values.add(this.getUsuNumNivel5());
    fields += " USU_CENTRO_LOGRO = ?, ";
    values.add(this.getUsuCentroLogro());
    fields += " USU_CENTRO_COSTO = ?, ";
    values.add(this.getUsuCentroCosto());
    fields += " USU_PTCE_GPOT = ?, ";
    values.add(this.getUsuPtceGpot());
    fields += " USU_FECHA_ULT_ACCESO = ?, ";
    values.add(this.getUsuFechaUltAcceso());
        fields += " USU_EMAIL = ?, ";
        values.add(this.getUsuEmail());    
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
    String sql = "INSERT INTO USUARIOS ( ";
    String fields = "";
    String fieldValues = "";
    ArrayList values = new ArrayList();
    fields += ",USU_FECHA_PASSWORD ";
    fieldValues += ", ?";
    values.add(this.getUsuFechaPassword());
    fields += ",USU_ESTATUS_SEGURIDAD ";
    fieldValues += ", ?";
    values.add(this.getUsuEstatusSeguridad());
    fields += ",USU_TOKEN ";
    fieldValues += ", ?";
    values.add(this.getUsuToken());
    fields += ",USU_MONTO_AUTORIZADO ";
    fieldValues += ", ?";
    values.add(this.getUsuMontoAutorizado());
    fields += ",USU_NUM_USUARIO ";
    fieldValues += ", ?";
    values.add(this.getUsuNumUsuario());
    fields += ",USU_NOM_USUARIO ";
    fieldValues += ", ?";
    values.add(this.getUsuNomUsuario());
    fields += ",USU_TIPO_USUARIO ";
    fieldValues += ", ?";
    values.add(this.getUsuTipoUsuario());
    fields += ",USU_NUM_PUESTO ";
    fieldValues += ", ?";
    values.add(this.getUsuNumPuesto());
    fields += ",USU_NOM_PUESTO ";
    fieldValues += ", ?";
    values.add(this.getUsuNomPuesto());
    fields += ",USU_PASSWORD ";
    fieldValues += ", ?";
    values.add(this.getUsuPassword());
    fields += ",USU_ANO_ALTA_REG ";
    fieldValues += ", ?";
    values.add(this.getUsuAnoAltaReg());
    fields += ",USU_MES_ALTA_REG ";
    fieldValues += ", ?";
    values.add(this.getUsuMesAltaReg());
    fields += ",USU_DIA_ALTA_REG ";
    fieldValues += ", ?";
    values.add(this.getUsuDiaAltaReg());
    fields += ",USU_ANO_ULT_MOD ";
    fieldValues += ", ?";
    values.add(this.getUsuAnoUltMod());
    fields += ",USU_MES_ULT_MOD ";
    fieldValues += ", ?";
    values.add(this.getUsuMesUltMod());
    fields += ",USU_DIA_ULT_MOD ";
    fieldValues += ", ?";
    values.add(this.getUsuDiaUltMod());
    fields += ",USU_CVE_ST_USUARIO ";
    fieldValues += ", ?";
    values.add(this.getUsuCveStUsuario());
    fields += ",USU_NUM_NIVEL1 ";
    fieldValues += ", ?";
    values.add(this.getUsuNumNivel1());
    fields += ",USU_NUM_NIVEL2 ";
    fieldValues += ", ?";
    values.add(this.getUsuNumNivel2());
    fields += ",USU_NUM_NIVEL3 ";
    fieldValues += ", ?";
    values.add(this.getUsuNumNivel3());
    fields += ",USU_NUM_NIVEL4 ";
    fieldValues += ", ?";
    values.add(this.getUsuNumNivel4());
    fields += ",USU_NUM_NIVEL5 ";
    fieldValues += ", ?";
    values.add(this.getUsuNumNivel5());
    fields += ",USU_CENTRO_LOGRO ";
    fieldValues += ", ?";
    values.add(this.getUsuCentroLogro());
    fields += ",USU_CENTRO_COSTO ";
    fieldValues += ", ?";
    values.add(this.getUsuCentroCosto());
    fields += ",USU_PTCE_GPOT ";
    fieldValues += ", ?";
    values.add(this.getUsuPtceGpot());
    fields += ",USU_FECHA_ULT_ACCESO ";
    fieldValues += ", ?";
        fields += ",USU_EMAIL ";
        fieldValues += ", ?";    
    values.add(this.getUsuEmail());
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
    String sql = "DELETE FROM USUARIOS WHERE ";
    String conditions = "";
    ArrayList values = new ArrayList();
    conditions += " AND USU_NUM_USUARIO = ?";
    values.add(this.getUsuNumUsuario());
    conditions = conditions.substring(4).trim();
    result.setSql(sql + conditions);
    result.setParameters(values.toArray());
    return result;
    }
    public boolean validate() {
    return true;  }
    public boolean doCompare(Object compareWith) {
    Usuarios instance = (Usuarios)compareWith;
    boolean equalObjects = true;
    if(equalObjects && !this.getUsuFechaPassword().equals(instance.getUsuFechaPassword())) equalObjects = false;
    if(equalObjects && !this.getUsuEstatusSeguridad().equals(instance.getUsuEstatusSeguridad())) equalObjects = false;
    if(equalObjects && !this.getUsuToken().equals(instance.getUsuToken())) equalObjects = false;
    if(equalObjects && !this.getUsuMontoAutorizado().equals(instance.getUsuMontoAutorizado())) equalObjects = false;
    if(equalObjects && !this.getUsuNumUsuario().equals(instance.getUsuNumUsuario())) equalObjects = false;
    if(equalObjects && !this.getUsuNomUsuario().equals(instance.getUsuNomUsuario())) equalObjects = false;
    if(equalObjects && !this.getUsuTipoUsuario().equals(instance.getUsuTipoUsuario())) equalObjects = false;
    if(equalObjects && !this.getUsuNumPuesto().equals(instance.getUsuNumPuesto())) equalObjects = false;
    if(equalObjects && !this.getUsuNomPuesto().equals(instance.getUsuNomPuesto())) equalObjects = false;
    if(equalObjects && !this.getUsuPassword().equals(instance.getUsuPassword())) equalObjects = false;
    if(equalObjects && !this.getUsuAnoAltaReg().equals(instance.getUsuAnoAltaReg())) equalObjects = false;
    if(equalObjects && !this.getUsuMesAltaReg().equals(instance.getUsuMesAltaReg())) equalObjects = false;
    if(equalObjects && !this.getUsuDiaAltaReg().equals(instance.getUsuDiaAltaReg())) equalObjects = false;
    if(equalObjects && !this.getUsuAnoUltMod().equals(instance.getUsuAnoUltMod())) equalObjects = false;
    if(equalObjects && !this.getUsuMesUltMod().equals(instance.getUsuMesUltMod())) equalObjects = false;
    if(equalObjects && !this.getUsuDiaUltMod().equals(instance.getUsuDiaUltMod())) equalObjects = false;
    if(equalObjects && !this.getUsuCveStUsuario().equals(instance.getUsuCveStUsuario())) equalObjects = false;
    if(equalObjects && !this.getUsuNumNivel1().equals(instance.getUsuNumNivel1())) equalObjects = false;
    if(equalObjects && !this.getUsuNumNivel2().equals(instance.getUsuNumNivel2())) equalObjects = false;
    if(equalObjects && !this.getUsuNumNivel3().equals(instance.getUsuNumNivel3())) equalObjects = false;
    if(equalObjects && !this.getUsuNumNivel4().equals(instance.getUsuNumNivel4())) equalObjects = false;
    if(equalObjects && !this.getUsuNumNivel5().equals(instance.getUsuNumNivel5())) equalObjects = false;
    if(equalObjects && !this.getUsuCentroLogro().equals(instance.getUsuCentroLogro())) equalObjects = false;
    if(equalObjects && !this.getUsuCentroCosto().equals(instance.getUsuCentroCosto())) equalObjects = false;
    if(equalObjects && !this.getUsuPtceGpot().equals(instance.getUsuPtceGpot())) equalObjects = false;
    if(equalObjects && !this.getUsuFechaUltAcceso().equals(instance.getUsuFechaUltAcceso())) equalObjects = false;
    
        if(equalObjects && !this.getUsuEmail().equals(instance.getUsuEmail())) equalObjects = false;
    return equalObjects;
    }
    public Object selectAsObject() {
    Usuarios result = new Usuarios();
     DataRow objectData = null;
     objectData = selectAsDataRow();
    result.setUsuFechaPassword((String)objectData.getData("USU_FECHA_PASSWORD"));
    result.setUsuEstatusSeguridad((BigDecimal)objectData.getData("USU_ESTATUS_SEGURIDAD"));
    result.setUsuToken((BigDecimal)objectData.getData("USU_TOKEN"));
    result.setUsuMontoAutorizado((BigDecimal)objectData.getData("USU_MONTO_AUTORIZADO"));
    result.setUsuNumUsuario((BigDecimal)objectData.getData("USU_NUM_USUARIO"));
    result.setUsuNomUsuario((String)objectData.getData("USU_NOM_USUARIO"));
    result.setUsuTipoUsuario((String)objectData.getData("USU_TIPO_USUARIO"));
    result.setUsuNumPuesto((BigDecimal)objectData.getData("USU_NUM_PUESTO"));
    result.setUsuNomPuesto((String)objectData.getData("USU_NOM_PUESTO"));
    result.setUsuPassword((String)objectData.getData("USU_PASSWORD"));
    result.setUsuAnoAltaReg((BigDecimal)objectData.getData("USU_ANO_ALTA_REG"));
    result.setUsuMesAltaReg((BigDecimal)objectData.getData("USU_MES_ALTA_REG"));
    result.setUsuDiaAltaReg((BigDecimal)objectData.getData("USU_DIA_ALTA_REG"));
    result.setUsuAnoUltMod((BigDecimal)objectData.getData("USU_ANO_ULT_MOD"));
    result.setUsuMesUltMod((BigDecimal)objectData.getData("USU_MES_ULT_MOD"));
    result.setUsuDiaUltMod((BigDecimal)objectData.getData("USU_DIA_ULT_MOD"));
    result.setUsuCveStUsuario((String)objectData.getData("USU_CVE_ST_USUARIO"));
    result.setUsuNumNivel1((BigDecimal)objectData.getData("USU_NUM_NIVEL1"));
    result.setUsuNumNivel2((BigDecimal)objectData.getData("USU_NUM_NIVEL2"));
    result.setUsuNumNivel3((BigDecimal)objectData.getData("USU_NUM_NIVEL3"));
    result.setUsuNumNivel4((BigDecimal)objectData.getData("USU_NUM_NIVEL4"));
    result.setUsuNumNivel5((BigDecimal)objectData.getData("USU_NUM_NIVEL5"));
    result.setUsuCentroLogro((BigDecimal)objectData.getData("USU_CENTRO_LOGRO"));
    result.setUsuCentroCosto((BigDecimal)objectData.getData("USU_CENTRO_COSTO"));
    result.setUsuPtceGpot((BigDecimal)objectData.getData("USU_PTCE_GPOT"));
    result.setUsuFechaUltAcceso((String)objectData.getData("USU_FECHA_ULT_ACCESO"));
    
        result.setUsuEmail((String)objectData.getData("USU_EMAIL"));
    return result;
    }
}
