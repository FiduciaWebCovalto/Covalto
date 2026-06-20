package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;

@PrimaryKey(constraintName = "PROSPECT_PK", columns = { "PRS_NUM_PROSPECTO" }, sequences = { "MAX" })
public class Prospect extends DomainObject {
String prsSubdirector =null;
String prsGrupo =null;
BigDecimal prsNumProspecto =null;
String prsNomProspecto =null;
String prsRfc =null;
String prsTipoPers =null;
String prsCveActividad =null;
String prsNomNacion =null;
String prsCveMigra =null;
String prsNomCalle =null;
String prsNomColonia =null;
String prsNomPoblacion =null;
String prsNomPais =null;
String prsNomEstado =null;
BigDecimal prsCodigoPostal =null;
String prsTelCasa =null;
String prsTelOficina =null;
String prsTelFax =null;
String prsNomContacto =null;
String prsTelContacto =null;
String prsFaxContacto =null;
String prsNomEjecutivo =null;
String prsTelEjecutivo =null;
BigDecimal prsEjecAsig =null;
String prsFecProspecto =null;
String prsFecConstit =null;
BigDecimal prsNumContrato =null;
String prsCveStatus =null;
String prsCorreo2 =null;
String prsNomDelegacion =null;
String prsOrgProspecto =null;
String prsReqOpera =null;
String prsAntecedentes =null;
String prsCaracteristicas =null;
String prsHonorarios =null;
String prsAdicionales =null;
String prsValidaln =null;
String prsTipoNegocio =null;
String prsTipoRecomenda =null;
String prsRolParte =null;
String prsCisFid =null;
String prsPerHogan =null;
String prsLinNeg =null;
String prsCveAreaInst =null;
String prsNumProducto =null;
String prsSucursal =null;
String prsRmLinNeg =null;
String prsProCliSpe =null;
String prsCveProCliSpe =null;
String prsProCliMan =null;
String prsCveProCliMan =null;
public Prospect() {
super();
this.pkColumns = 8;
}
public void setPrsSubdirector (String prsSubdirector) {
this.prsSubdirector=prsSubdirector;
}
public void setPrsGrupo (String prsGrupo) {
this.prsGrupo=prsGrupo;
}
public void setPrsNumProspecto (BigDecimal prsNumProspecto) {
this.prsNumProspecto=prsNumProspecto;
}
public void setPrsNomProspecto (String prsNomProspecto) {
this.prsNomProspecto=prsNomProspecto;
}
public void setPrsRfc (String prsRfc) {
this.prsRfc=prsRfc;
}
public void setPrsTipoPers (String prsTipoPers) {
this.prsTipoPers=prsTipoPers;
}
public void setPrsCveActividad (String prsCveActividad) {
this.prsCveActividad=prsCveActividad;
}
public void setPrsNomNacion (String prsNomNacion) {
this.prsNomNacion=prsNomNacion;
}
public void setPrsCveMigra (String prsCveMigra) {
this.prsCveMigra=prsCveMigra;
}
public void setPrsNomCalle (String prsNomCalle) {
this.prsNomCalle=prsNomCalle;
}
public void setPrsNomColonia (String prsNomColonia) {
this.prsNomColonia=prsNomColonia;
}
public void setPrsNomPoblacion (String prsNomPoblacion) {
this.prsNomPoblacion=prsNomPoblacion;
}
public void setPrsNomPais (String prsNomPais) {
this.prsNomPais=prsNomPais;
}
public void setPrsNomEstado (String prsNomEstado) {
this.prsNomEstado=prsNomEstado;
}
public void setPrsCodigoPostal (BigDecimal prsCodigoPostal) {
this.prsCodigoPostal=prsCodigoPostal;
}
public void setPrsTelCasa (String prsTelCasa) {
this.prsTelCasa=prsTelCasa;
}
public void setPrsTelOficina (String prsTelOficina) {
this.prsTelOficina=prsTelOficina;
}
public void setPrsTelFax (String prsTelFax) {
this.prsTelFax=prsTelFax;
}
public void setPrsNomContacto (String prsNomContacto) {
this.prsNomContacto=prsNomContacto;
}
public void setPrsTelContacto (String prsTelContacto) {
this.prsTelContacto=prsTelContacto;
}
public void setPrsFaxContacto (String prsFaxContacto) {
this.prsFaxContacto=prsFaxContacto;
}
public void setPrsNomEjecutivo (String prsNomEjecutivo) {
this.prsNomEjecutivo=prsNomEjecutivo;
}
public void setPrsTelEjecutivo (String prsTelEjecutivo) {
this.prsTelEjecutivo=prsTelEjecutivo;
}
public void setPrsEjecAsig (BigDecimal prsEjecAsig) {
this.prsEjecAsig=prsEjecAsig;
}
public void setPrsFecProspecto (String prsFecProspecto) {
this.prsFecProspecto=prsFecProspecto;
}
public void setPrsFecConstit (String prsFecConstit) {
this.prsFecConstit=prsFecConstit;
}
public void setPrsNumContrato (BigDecimal prsNumContrato) {
this.prsNumContrato=prsNumContrato;
}
public void setPrsCveStatus (String prsCveStatus) {
this.prsCveStatus=prsCveStatus;
}
public void setPrsCorreo2 (String prsCorreo2) {
this.prsCorreo2=prsCorreo2;
}
public void setPrsNomDelegacion (String prsNomDelegacion) {
this.prsNomDelegacion=prsNomDelegacion;
}
public void setPrsOrgProspecto (String prsOrgProspecto) {
this.prsOrgProspecto=prsOrgProspecto;
}
public void setPrsReqOpera (String prsReqOpera) {
this.prsReqOpera=prsReqOpera;
}
public void setPrsAntecedentes (String prsAntecedentes) {
this.prsAntecedentes=prsAntecedentes;
}
public void setPrsCaracteristicas (String prsCaracteristicas) {
this.prsCaracteristicas=prsCaracteristicas;
}
public void setPrsHonorarios (String prsHonorarios) {
this.prsHonorarios=prsHonorarios;
}
public void setPrsAdicionales (String prsAdicionales) {
this.prsAdicionales=prsAdicionales;
}
public void setPrsValidaln (String prsValidaln) {
this.prsValidaln=prsValidaln;
}
public void setPrsTipoNegocio (String prsTipoNegocio) {
this.prsTipoNegocio=prsTipoNegocio;
}
public void setPrsTipoRecomenda (String prsTipoRecomenda) {
this.prsTipoRecomenda=prsTipoRecomenda;
}
public void setPrsRolParte (String prsRolParte) {
this.prsRolParte=prsRolParte;
}
public void setPrsCisFid (String prsCisFid) {
this.prsCisFid=prsCisFid;
}
public void setPrsPerHogan (String prsPerHogan) {
this.prsPerHogan=prsPerHogan;
}
public void setPrsLinNeg (String prsLinNeg) {
this.prsLinNeg=prsLinNeg;
}
public void setPrsCveAreaInst (String prsCveAreaInst) {
this.prsCveAreaInst=prsCveAreaInst;
}
public void setPrsNumProducto (String prsNumProducto) {
this.prsNumProducto=prsNumProducto;
}
public void setPrsSucursal (String prsSucursal) {
this.prsSucursal=prsSucursal;
}
public void setPrsRmLinNeg (String prsRmLinNeg) {
this.prsRmLinNeg=prsRmLinNeg;
}
public void setPrsProCliSpe (String prsProCliSpe) {
this.prsProCliSpe=prsProCliSpe;
}
public void setPrsCveProCliSpe (String prsCveProCliSpe) {
this.prsCveProCliSpe=prsCveProCliSpe;
}
public void setPrsProCliMan (String prsProCliMan) {
this.prsProCliMan=prsProCliMan;
}
public void setPrsCveProCliMan (String prsCveProCliMan) {
this.prsCveProCliMan=prsCveProCliMan;
}
public String getPrsCveProCliMan() {
return this.prsCveProCliMan;
}
public String getPrsProCliMan() {
return this.prsProCliMan;
}
public String getPrsCveProCliSpe() {
return this.prsCveProCliSpe;
}
public String getPrsProCliSpe() {
return this.prsProCliSpe;
}
public String getPrsRmLinNeg() {
return this.prsRmLinNeg;
}
public String getPrsSucursal() {
return this.prsSucursal;
}
public String getPrsNumProducto() {
return this.prsNumProducto;
}
public String getPrsCveAreaInst() {
return this.prsCveAreaInst;
}
public String getPrsLinNeg() {
return this.prsLinNeg;
}
public String getPrsPerHogan() {
return this.prsPerHogan;
}
public String getPrsCisFid() {
return this.prsCisFid;
}
public String getPrsRolParte() {
return this.prsRolParte;
}
public String getPrsTipoRecomenda() {
return this.prsTipoRecomenda;
}
public String getPrsTipoNegocio() {
return this.prsTipoNegocio;
}
public String getPrsValidaln() {
return this.prsValidaln;
}
public String getPrsAdicionales() {
return this.prsAdicionales;
}
public String getPrsHonorarios() {
return this.prsHonorarios;
}
public String getPrsCaracteristicas() {
return this.prsCaracteristicas;
}
public String getPrsAntecedentes() {
return this.prsAntecedentes;
}
public String getPrsReqOpera() {
return this.prsReqOpera;
}
public String getPrsOrgProspecto() {
return this.prsOrgProspecto;
}
public String getPrsNomDelegacion() {
return this.prsNomDelegacion;
}
public String getPrsCorreo2() {
return this.prsCorreo2;
}
public String getPrsCveStatus() {
return this.prsCveStatus;
}
public BigDecimal getPrsNumContrato() {
return this.prsNumContrato;
}
public String getPrsFecConstit() {
return this.prsFecConstit;
}
public String getPrsFecProspecto() {
return this.prsFecProspecto;
}
public BigDecimal getPrsEjecAsig() {
return this.prsEjecAsig;
}
public String getPrsTelEjecutivo() {
return this.prsTelEjecutivo;
}
public String getPrsNomEjecutivo() {
return this.prsNomEjecutivo;
}
public String getPrsFaxContacto() {
return this.prsFaxContacto;
}
public String getPrsTelContacto() {
return this.prsTelContacto;
}
public String getPrsNomContacto() {
return this.prsNomContacto;
}
public String getPrsTelFax() {
return this.prsTelFax;
}
public String getPrsTelOficina() {
return this.prsTelOficina;
}
public String getPrsTelCasa() {
return this.prsTelCasa;
}
public BigDecimal getPrsCodigoPostal() {
return this.prsCodigoPostal;
}
public String getPrsNomEstado() {
return this.prsNomEstado;
}
public String getPrsNomPais() {
return this.prsNomPais;
}
public String getPrsNomPoblacion() {
return this.prsNomPoblacion;
}
public String getPrsNomColonia() {
return this.prsNomColonia;
}
public String getPrsNomCalle() {
return this.prsNomCalle;
}
public String getPrsCveMigra() {
return this.prsCveMigra;
}
public String getPrsNomNacion() {
return this.prsNomNacion;
}
public String getPrsCveActividad() {
return this.prsCveActividad;
}
public String getPrsTipoPers() {
return this.prsTipoPers;
}
public String getPrsRfc() {
return this.prsRfc;
}
public String getPrsNomProspecto() {
return this.prsNomProspecto;
}
public BigDecimal getPrsNumProspecto() {
return this.prsNumProspecto;
}
public String getPrsGrupo() {
return this.prsGrupo;
}
public String getPrsSubdirector() {
return this.prsSubdirector;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM PROSPECT ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getPrsNumProspecto() != null && this.getPrsNumProspecto().longValue() == -999) {
conditions += " AND PRS_NUM_PROSPECTO IS NULL";
} else if(this.getPrsNumProspecto() != null) {
conditions += " AND PRS_NUM_PROSPECTO =?";
values.add(this.getPrsNumProspecto());
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
String sql = "SELECT * FROM PROSPECT ";
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
String sql = "UPDATE PROSPECT SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
fields += " PRS_SUBDIRECTOR = ?, ";
values.add(this.getPrsSubdirector());
fields += " PRS_GRUPO = ?, ";
values.add(this.getPrsGrupo());
conditions += " AND PRS_NUM_PROSPECTO = ?";
pkValues.add(this.getPrsNumProspecto());
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
fields += " PRS_ORG_PROSPECTO = ?, ";
values.add(this.getPrsOrgProspecto());
fields += " PRS_REQ_OPERA = ?, ";
values.add(this.getPrsReqOpera());
fields += " PRS_ANTECEDENTES = ?, ";
values.add(this.getPrsAntecedentes());
fields += " PRS_CARACTERISTICAS = ?, ";
values.add(this.getPrsCaracteristicas());
fields += " PRS_HONORARIOS = ?, ";
values.add(this.getPrsHonorarios());
fields += " PRS_ADICIONALES = ?, ";
values.add(this.getPrsAdicionales());
fields += " PRS_VALIDALN = ?, ";
values.add(this.getPrsValidaln());
fields += " PRS_TIPO_NEGOCIO = ?, ";
values.add(this.getPrsTipoNegocio());
fields += " PRS_TIPO_RECOMENDA = ?, ";
values.add(this.getPrsTipoRecomenda());
fields += " PRS_ROL_PARTE = ?, ";
values.add(this.getPrsRolParte());
fields += " PRS_CIS_FID = ?, ";
values.add(this.getPrsCisFid());
fields += " PRS_PER_HOGAN = ?, ";
values.add(this.getPrsPerHogan());
fields += " PRS_LIN_NEG = ?, ";
values.add(this.getPrsLinNeg());
fields += " PRS_CVE_AREA_INST = ?, ";
values.add(this.getPrsCveAreaInst());
fields += " PRS_NUM_PRODUCTO = ?, ";
values.add(this.getPrsNumProducto());
fields += " PRS_SUCURSAL = ?, ";
values.add(this.getPrsSucursal());
fields += " PRS_RM_LIN_NEG = ?, ";
values.add(this.getPrsRmLinNeg());
fields += " PRS_PRO_CLI_SPE = ?, ";
values.add(this.getPrsProCliSpe());
fields += " PRS_CVE_PRO_CLI_SPE = ?, ";
values.add(this.getPrsCveProCliSpe());
fields += " PRS_PRO_CLI_MAN = ?, ";
values.add(this.getPrsProCliMan());
fields += " PRS_CVE_PRO_CLI_MAN = ?, ";
values.add(this.getPrsCveProCliMan());
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
String sql = "INSERT INTO PROSPECT ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",PRS_SUBDIRECTOR ";
fieldValues += ", ?";
values.add(this.getPrsSubdirector());
fields += ",PRS_GRUPO ";
fieldValues += ", ?";
values.add(this.getPrsGrupo());
fields += ",PRS_NUM_PROSPECTO ";
fieldValues += ", ?";
values.add(this.getPrsNumProspecto());
fields += ",PRS_NOM_PROSPECTO ";
fieldValues += ", ?";
values.add(this.getPrsNomProspecto());
fields += ",PRS_RFC ";
fieldValues += ", ?";
values.add(this.getPrsRfc());
fields += ",PRS_TIPO_PERS ";
fieldValues += ", ?";
values.add(this.getPrsTipoPers());
fields += ",PRS_CVE_ACTIVIDAD ";
fieldValues += ", ?";
values.add(this.getPrsCveActividad());
fields += ",PRS_NOM_NACION ";
fieldValues += ", ?";
values.add(this.getPrsNomNacion());
fields += ",PRS_CVE_MIGRA ";
fieldValues += ", ?";
values.add(this.getPrsCveMigra());
fields += ",PRS_NOM_CALLE ";
fieldValues += ", ?";
values.add(this.getPrsNomCalle());
fields += ",PRS_NOM_COLONIA ";
fieldValues += ", ?";
values.add(this.getPrsNomColonia());
fields += ",PRS_NOM_POBLACION ";
fieldValues += ", ?";
values.add(this.getPrsNomPoblacion());
fields += ",PRS_NOM_PAIS ";
fieldValues += ", ?";
values.add(this.getPrsNomPais());
fields += ",PRS_NOM_ESTADO ";
fieldValues += ", ?";
values.add(this.getPrsNomEstado());
fields += ",PRS_CODIGO_POSTAL ";
fieldValues += ", ?";
values.add(this.getPrsCodigoPostal());
fields += ",PRS_TEL_CASA ";
fieldValues += ", ?";
values.add(this.getPrsTelCasa());
fields += ",PRS_TEL_OFICINA ";
fieldValues += ", ?";
values.add(this.getPrsTelOficina());
fields += ",PRS_TEL_FAX ";
fieldValues += ", ?";
values.add(this.getPrsTelFax());
fields += ",PRS_NOM_CONTACTO ";
fieldValues += ", ?";
values.add(this.getPrsNomContacto());
fields += ",PRS_TEL_CONTACTO ";
fieldValues += ", ?";
values.add(this.getPrsTelContacto());
fields += ",PRS_FAX_CONTACTO ";
fieldValues += ", ?";
values.add(this.getPrsFaxContacto());
fields += ",PRS_NOM_EJECUTIVO ";
fieldValues += ", ?";
values.add(this.getPrsNomEjecutivo());
fields += ",PRS_TEL_EJECUTIVO ";
fieldValues += ", ?";
values.add(this.getPrsTelEjecutivo());
fields += ",PRS_EJEC_ASIG ";
fieldValues += ", ?";
values.add(this.getPrsEjecAsig());
fields += ",PRS_FEC_PROSPECTO ";
fieldValues += ", ?";
values.add(this.getPrsFecProspecto());
fields += ",PRS_FEC_CONSTIT ";
fieldValues += ", ?";
values.add(this.getPrsFecConstit());
fields += ",PRS_NUM_CONTRATO ";
fieldValues += ", ?";
values.add(this.getPrsNumContrato());
fields += ",PRS_CVE_STATUS ";
fieldValues += ", ?";
values.add(this.getPrsCveStatus());
fields += ",PRS_CORREO2 ";
fieldValues += ", ?";
values.add(this.getPrsCorreo2());
fields += ",PRS_NOM_DELEGACION ";
fieldValues += ", ?";
values.add(this.getPrsNomDelegacion());
fields += ",PRS_ORG_PROSPECTO ";
fieldValues += ", ?";
values.add(this.getPrsOrgProspecto());
fields += ",PRS_REQ_OPERA ";
fieldValues += ", ?";
values.add(this.getPrsReqOpera());
fields += ",PRS_ANTECEDENTES ";
fieldValues += ", ?";
values.add(this.getPrsAntecedentes());
fields += ",PRS_CARACTERISTICAS ";
fieldValues += ", ?";
values.add(this.getPrsCaracteristicas());
fields += ",PRS_HONORARIOS ";
fieldValues += ", ?";
values.add(this.getPrsHonorarios());
fields += ",PRS_ADICIONALES ";
fieldValues += ", ?";
values.add(this.getPrsAdicionales());
fields += ",PRS_VALIDALN ";
fieldValues += ", ?";
values.add(this.getPrsValidaln());
fields += ",PRS_TIPO_NEGOCIO ";
fieldValues += ", ?";
values.add(this.getPrsTipoNegocio());
fields += ",PRS_TIPO_RECOMENDA ";
fieldValues += ", ?";
values.add(this.getPrsTipoRecomenda());
fields += ",PRS_ROL_PARTE ";
fieldValues += ", ?";
values.add(this.getPrsRolParte());
fields += ",PRS_CIS_FID ";
fieldValues += ", ?";
values.add(this.getPrsCisFid());
fields += ",PRS_PER_HOGAN ";
fieldValues += ", ?";
values.add(this.getPrsPerHogan());
fields += ",PRS_LIN_NEG ";
fieldValues += ", ?";
values.add(this.getPrsLinNeg());
fields += ",PRS_CVE_AREA_INST ";
fieldValues += ", ?";
values.add(this.getPrsCveAreaInst());
fields += ",PRS_NUM_PRODUCTO ";
fieldValues += ", ?";
values.add(this.getPrsNumProducto());
fields += ",PRS_SUCURSAL ";
fieldValues += ", ?";
values.add(this.getPrsSucursal());
fields += ",PRS_RM_LIN_NEG ";
fieldValues += ", ?";
values.add(this.getPrsRmLinNeg());
fields += ",PRS_PRO_CLI_SPE ";
fieldValues += ", ?";
values.add(this.getPrsProCliSpe());
fields += ",PRS_CVE_PRO_CLI_SPE ";
fieldValues += ", ?";
values.add(this.getPrsCveProCliSpe());
fields += ",PRS_PRO_CLI_MAN ";
fieldValues += ", ?";
values.add(this.getPrsProCliMan());
fields += ",PRS_CVE_PRO_CLI_MAN ";
fieldValues += ", ?";
values.add(this.getPrsCveProCliMan());
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
String sql = "DELETE FROM PROSPECT WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND PRS_NUM_PROSPECTO = ?";
values.add(this.getPrsNumProspecto());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
Prospect instance = (Prospect)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getPrsSubdirector().equals(instance.getPrsSubdirector())) equalObjects = false;
if(equalObjects && !this.getPrsGrupo().equals(instance.getPrsGrupo())) equalObjects = false;
if(equalObjects && !this.getPrsNumProspecto().equals(instance.getPrsNumProspecto())) equalObjects = false;
if(equalObjects && !this.getPrsNomProspecto().equals(instance.getPrsNomProspecto())) equalObjects = false;
if(equalObjects && !this.getPrsRfc().equals(instance.getPrsRfc())) equalObjects = false;
if(equalObjects && !this.getPrsTipoPers().equals(instance.getPrsTipoPers())) equalObjects = false;
if(equalObjects && !this.getPrsCveActividad().equals(instance.getPrsCveActividad())) equalObjects = false;
if(equalObjects && !this.getPrsNomNacion().equals(instance.getPrsNomNacion())) equalObjects = false;
if(equalObjects && !this.getPrsCveMigra().equals(instance.getPrsCveMigra())) equalObjects = false;
if(equalObjects && !this.getPrsNomCalle().equals(instance.getPrsNomCalle())) equalObjects = false;
if(equalObjects && !this.getPrsNomColonia().equals(instance.getPrsNomColonia())) equalObjects = false;
if(equalObjects && !this.getPrsNomPoblacion().equals(instance.getPrsNomPoblacion())) equalObjects = false;
if(equalObjects && !this.getPrsNomPais().equals(instance.getPrsNomPais())) equalObjects = false;
if(equalObjects && !this.getPrsNomEstado().equals(instance.getPrsNomEstado())) equalObjects = false;
if(equalObjects && !this.getPrsCodigoPostal().equals(instance.getPrsCodigoPostal())) equalObjects = false;
if(equalObjects && !this.getPrsTelCasa().equals(instance.getPrsTelCasa())) equalObjects = false;
if(equalObjects && !this.getPrsTelOficina().equals(instance.getPrsTelOficina())) equalObjects = false;
if(equalObjects && !this.getPrsTelFax().equals(instance.getPrsTelFax())) equalObjects = false;
if(equalObjects && !this.getPrsNomContacto().equals(instance.getPrsNomContacto())) equalObjects = false;
if(equalObjects && !this.getPrsTelContacto().equals(instance.getPrsTelContacto())) equalObjects = false;
if(equalObjects && !this.getPrsFaxContacto().equals(instance.getPrsFaxContacto())) equalObjects = false;
if(equalObjects && !this.getPrsNomEjecutivo().equals(instance.getPrsNomEjecutivo())) equalObjects = false;
if(equalObjects && !this.getPrsTelEjecutivo().equals(instance.getPrsTelEjecutivo())) equalObjects = false;
if(equalObjects && !this.getPrsEjecAsig().equals(instance.getPrsEjecAsig())) equalObjects = false;
if(equalObjects && !this.getPrsFecProspecto().equals(instance.getPrsFecProspecto())) equalObjects = false;
if(equalObjects && !this.getPrsFecConstit().equals(instance.getPrsFecConstit())) equalObjects = false;
if(equalObjects && !this.getPrsNumContrato().equals(instance.getPrsNumContrato())) equalObjects = false;
if(equalObjects && !this.getPrsCveStatus().equals(instance.getPrsCveStatus())) equalObjects = false;
if(equalObjects && !this.getPrsCorreo2().equals(instance.getPrsCorreo2())) equalObjects = false;
if(equalObjects && !this.getPrsNomDelegacion().equals(instance.getPrsNomDelegacion())) equalObjects = false;
if(equalObjects && !this.getPrsOrgProspecto().equals(instance.getPrsOrgProspecto())) equalObjects = false;
if(equalObjects && !this.getPrsReqOpera().equals(instance.getPrsReqOpera())) equalObjects = false;
if(equalObjects && !this.getPrsAntecedentes().equals(instance.getPrsAntecedentes())) equalObjects = false;
if(equalObjects && !this.getPrsCaracteristicas().equals(instance.getPrsCaracteristicas())) equalObjects = false;
if(equalObjects && !this.getPrsHonorarios().equals(instance.getPrsHonorarios())) equalObjects = false;
if(equalObjects && !this.getPrsAdicionales().equals(instance.getPrsAdicionales())) equalObjects = false;
if(equalObjects && !this.getPrsValidaln().equals(instance.getPrsValidaln())) equalObjects = false;
if(equalObjects && !this.getPrsTipoNegocio().equals(instance.getPrsTipoNegocio())) equalObjects = false;
if(equalObjects && !this.getPrsTipoRecomenda().equals(instance.getPrsTipoRecomenda())) equalObjects = false;
if(equalObjects && !this.getPrsRolParte().equals(instance.getPrsRolParte())) equalObjects = false;
if(equalObjects && !this.getPrsCisFid().equals(instance.getPrsCisFid())) equalObjects = false;
if(equalObjects && !this.getPrsPerHogan().equals(instance.getPrsPerHogan())) equalObjects = false;
if(equalObjects && !this.getPrsLinNeg().equals(instance.getPrsLinNeg())) equalObjects = false;
if(equalObjects && !this.getPrsCveAreaInst().equals(instance.getPrsCveAreaInst())) equalObjects = false;
if(equalObjects && !this.getPrsNumProducto().equals(instance.getPrsNumProducto())) equalObjects = false;
if(equalObjects && !this.getPrsSucursal().equals(instance.getPrsSucursal())) equalObjects = false;
if(equalObjects && !this.getPrsRmLinNeg().equals(instance.getPrsRmLinNeg())) equalObjects = false;
if(equalObjects && !this.getPrsProCliSpe().equals(instance.getPrsProCliSpe())) equalObjects = false;
if(equalObjects && !this.getPrsCveProCliSpe().equals(instance.getPrsCveProCliSpe())) equalObjects = false;
if(equalObjects && !this.getPrsProCliMan().equals(instance.getPrsProCliMan())) equalObjects = false;
if(equalObjects && !this.getPrsCveProCliMan().equals(instance.getPrsCveProCliMan())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
Prospect result = new Prospect();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setPrsSubdirector((String)objectData.getData("PRS_SUBDIRECTOR"));
result.setPrsGrupo((String)objectData.getData("PRS_GRUPO"));
result.setPrsNumProspecto((BigDecimal)objectData.getData("PRS_NUM_PROSPECTO"));
result.setPrsNomProspecto((String)objectData.getData("PRS_NOM_PROSPECTO"));
result.setPrsRfc((String)objectData.getData("PRS_RFC"));
result.setPrsTipoPers((String)objectData.getData("PRS_TIPO_PERS"));
result.setPrsCveActividad((String)objectData.getData("PRS_CVE_ACTIVIDAD"));
result.setPrsNomNacion((String)objectData.getData("PRS_NOM_NACION"));
result.setPrsCveMigra((String)objectData.getData("PRS_CVE_MIGRA"));
result.setPrsNomCalle((String)objectData.getData("PRS_NOM_CALLE"));
result.setPrsNomColonia((String)objectData.getData("PRS_NOM_COLONIA"));
result.setPrsNomPoblacion((String)objectData.getData("PRS_NOM_POBLACION"));
result.setPrsNomPais((String)objectData.getData("PRS_NOM_PAIS"));
result.setPrsNomEstado((String)objectData.getData("PRS_NOM_ESTADO"));
result.setPrsCodigoPostal((BigDecimal)objectData.getData("PRS_CODIGO_POSTAL"));
result.setPrsTelCasa((String)objectData.getData("PRS_TEL_CASA"));
result.setPrsTelOficina((String)objectData.getData("PRS_TEL_OFICINA"));
result.setPrsTelFax((String)objectData.getData("PRS_TEL_FAX"));
result.setPrsNomContacto((String)objectData.getData("PRS_NOM_CONTACTO"));
result.setPrsTelContacto((String)objectData.getData("PRS_TEL_CONTACTO"));
result.setPrsFaxContacto((String)objectData.getData("PRS_FAX_CONTACTO"));
result.setPrsNomEjecutivo((String)objectData.getData("PRS_NOM_EJECUTIVO"));
result.setPrsTelEjecutivo((String)objectData.getData("PRS_TEL_EJECUTIVO"));
result.setPrsEjecAsig((BigDecimal)objectData.getData("PRS_EJEC_ASIG"));
result.setPrsFecProspecto((String)objectData.getData("PRS_FEC_PROSPECTO"));
result.setPrsFecConstit((String)objectData.getData("PRS_FEC_CONSTIT"));
result.setPrsNumContrato((BigDecimal)objectData.getData("PRS_NUM_CONTRATO"));
result.setPrsCveStatus((String)objectData.getData("PRS_CVE_STATUS"));
result.setPrsCorreo2((String)objectData.getData("PRS_CORREO2"));
result.setPrsNomDelegacion((String)objectData.getData("PRS_NOM_DELEGACION"));
result.setPrsOrgProspecto((String)objectData.getData("PRS_ORG_PROSPECTO"));
result.setPrsReqOpera((String)objectData.getData("PRS_REQ_OPERA"));
result.setPrsAntecedentes((String)objectData.getData("PRS_ANTECEDENTES"));
result.setPrsCaracteristicas((String)objectData.getData("PRS_CARACTERISTICAS"));
result.setPrsHonorarios((String)objectData.getData("PRS_HONORARIOS"));
result.setPrsAdicionales((String)objectData.getData("PRS_ADICIONALES"));
result.setPrsValidaln((String)objectData.getData("PRS_VALIDALN"));
result.setPrsTipoNegocio((String)objectData.getData("PRS_TIPO_NEGOCIO"));
result.setPrsTipoRecomenda((String)objectData.getData("PRS_TIPO_RECOMENDA"));
result.setPrsRolParte((String)objectData.getData("PRS_ROL_PARTE"));
result.setPrsCisFid((String)objectData.getData("PRS_CIS_FID"));
result.setPrsPerHogan((String)objectData.getData("PRS_PER_HOGAN"));
result.setPrsLinNeg((String)objectData.getData("PRS_LIN_NEG"));
result.setPrsCveAreaInst((String)objectData.getData("PRS_CVE_AREA_INST"));
result.setPrsNumProducto((String)objectData.getData("PRS_NUM_PRODUCTO"));
result.setPrsSucursal((String)objectData.getData("PRS_SUCURSAL"));
result.setPrsRmLinNeg((String)objectData.getData("PRS_RM_LIN_NEG"));
result.setPrsProCliSpe((String)objectData.getData("PRS_PRO_CLI_SPE"));
result.setPrsCveProCliSpe((String)objectData.getData("PRS_CVE_PRO_CLI_SPE"));
result.setPrsProCliMan((String)objectData.getData("PRS_PRO_CLI_MAN"));
result.setPrsCveProCliMan((String)objectData.getData("PRS_CVE_PRO_CLI_MAN"));
return result;
}
}