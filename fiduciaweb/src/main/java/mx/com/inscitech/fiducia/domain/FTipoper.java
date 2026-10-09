package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_TIPOPER_PK", columns = { "FTOP_NUM_OPER" }, sequences = { "MAX" })
public class FTipoper extends DomainObject {
String ftopNumOper =null;
BigDecimal ftopTipoSol =null;
BigDecimal ftopCveNaturaleza =null;
BigDecimal ftopSecCve =null;
String ftopPagomul =null;
String ftopNombreTipoper =null;
String ftopStatus =null;
BigDecimal ftopAtencionDias =null;
BigDecimal ftopActoJuridico =null;
BigDecimal ftopBienes =null;
public FTipoper() {
super();
this.pkColumns = 8;
}
public void setFtopNumOper (String ftopNumOper) {
this.ftopNumOper=ftopNumOper;
}
public void setFtopTipoSol (BigDecimal ftopTipoSol) {
this.ftopTipoSol=ftopTipoSol;
}
public void setFtopCveNaturaleza (BigDecimal ftopCveNaturaleza) {
this.ftopCveNaturaleza=ftopCveNaturaleza;
}
public void setFtopSecCve (BigDecimal ftopSecCve) {
this.ftopSecCve=ftopSecCve;
}
public void setFtopPagomul (String ftopPagomul) {
this.ftopPagomul=ftopPagomul;
}
public void setFtopNombreTipoper (String ftopNombreTipoper) {
this.ftopNombreTipoper=ftopNombreTipoper;
}
public void setFtopStatus (String ftopStatus) {
this.ftopStatus=ftopStatus;
}
public void setFtopAtencionDias (BigDecimal ftopAtencionDias) {
this.ftopAtencionDias=ftopAtencionDias;
}
public void setFtopActoJuridico (BigDecimal ftopActoJuridico) {
this.ftopActoJuridico=ftopActoJuridico;
}
public void setFtopBienes (BigDecimal ftopBienes) {
this.ftopBienes=ftopBienes;
}
public String getFtopNumOper() {
return this.ftopNumOper;
}
public BigDecimal getFtopTipoSol() {
return this.ftopTipoSol;
}
public BigDecimal getFtopCveNaturaleza() {
return this.ftopCveNaturaleza;
}
public BigDecimal getFtopSecCve() {
return this.ftopSecCve;
}
public String getFtopPagomul() {
return this.ftopPagomul;
}
public String getFtopNombreTipoper() {
return this.ftopNombreTipoper;
}
public String getFtopStatus() {
return this.ftopStatus;
}
public BigDecimal getFtopAtencionDias() {
return this.ftopAtencionDias;
}
public BigDecimal getFtopActoJuridico() {
return this.ftopActoJuridico;
}
public BigDecimal getFtopBienes() {
return this.ftopBienes;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM F_TIPOPER ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getFtopNumOper() != null && "null".equals(this.getFtopNumOper())) {
conditions += " AND FTOP_NUM_OPER IS NULL";
} else if(this.getFtopNumOper() != null) {
conditions += " AND FTOP_NUM_OPER =?";
values.add(this.getFtopNumOper());
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
String sql = "SELECT * FROM F_TIPOPER ";
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
String sql = "UPDATE F_TIPOPER SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
conditions += " AND FTOP_NUM_OPER = ?";
pkValues.add(this.getFtopNumOper());
fields += " FTOP_TIPO_SOL = ?, ";
values.add(this.getFtopTipoSol());
fields += " FTOP_CVE_NATURALEZA = ?, ";
values.add(this.getFtopCveNaturaleza());
fields += " FTOP_SEC_CVE = ?, ";
values.add(this.getFtopSecCve());
fields += " FTOP_PAGOMUL = ?, ";
values.add(this.getFtopPagomul());
fields += " FTOP_NOMBRE_TIPOPER = ?, ";
values.add(this.getFtopNombreTipoper());
fields += " FTOP_STATUS = ?, ";
values.add(this.getFtopStatus());
fields += " FTOP_ATENCION_DIAS = ?, ";
values.add(this.getFtopAtencionDias());
fields += " FTOP_ACTO_JURIDICO = ?, ";
values.add(this.getFtopActoJuridico());
fields += " FTOP_BIENES = ?, ";
values.add(this.getFtopBienes());
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
String sql = "INSERT INTO F_TIPOPER ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",FTOP_NUM_OPER ";
fieldValues += ", ?";
values.add(this.getFtopNumOper());
fields += ",FTOP_TIPO_SOL ";
fieldValues += ", ?";
values.add(this.getFtopTipoSol());
fields += ",FTOP_CVE_NATURALEZA ";
fieldValues += ", ?";
values.add(this.getFtopCveNaturaleza());
fields += ",FTOP_SEC_CVE ";
fieldValues += ", ?";
values.add(this.getFtopSecCve());
fields += ",FTOP_PAGOMUL ";
fieldValues += ", ?";
values.add(this.getFtopPagomul());
fields += ",FTOP_NOMBRE_TIPOPER ";
fieldValues += ", ?";
values.add(this.getFtopNombreTipoper());
fields += ",FTOP_STATUS ";
fieldValues += ", ?";
values.add(this.getFtopStatus());
fields += ",FTOP_ATENCION_DIAS ";
fieldValues += ", ?";
values.add(this.getFtopAtencionDias());
fields += ",FTOP_ACTO_JURIDICO ";
fieldValues += ", ?";
values.add(this.getFtopActoJuridico());
fields += ",FTOP_BIENES ";
fieldValues += ", ?";
values.add(this.getFtopBienes());
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
String sql = "DELETE FROM F_TIPOPER WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND FTOP_NUM_OPER = ?";
values.add(this.getFtopNumOper());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
FTipoper instance = (FTipoper)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getFtopNumOper().equals(instance.getFtopNumOper())) equalObjects = false;
if(equalObjects && !this.getFtopTipoSol().equals(instance.getFtopTipoSol())) equalObjects = false;
if(equalObjects && !this.getFtopCveNaturaleza().equals(instance.getFtopCveNaturaleza())) equalObjects = false;
if(equalObjects && !this.getFtopSecCve().equals(instance.getFtopSecCve())) equalObjects = false;
if(equalObjects && !this.getFtopPagomul().equals(instance.getFtopPagomul())) equalObjects = false;
if(equalObjects && !this.getFtopNombreTipoper().equals(instance.getFtopNombreTipoper())) equalObjects = false;
if(equalObjects && !this.getFtopStatus().equals(instance.getFtopStatus())) equalObjects = false;
if(equalObjects && !this.getFtopAtencionDias().equals(instance.getFtopAtencionDias())) equalObjects = false;
if(equalObjects && !this.getFtopActoJuridico().equals(instance.getFtopActoJuridico())) equalObjects = false;
if(equalObjects && !this.getFtopBienes().equals(instance.getFtopBienes())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
FTipoper result = new FTipoper();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setFtopNumOper((String)objectData.getData("FTOP_NUM_OPER"));
result.setFtopTipoSol((BigDecimal)objectData.getData("FTOP_TIPO_SOL"));
result.setFtopCveNaturaleza((BigDecimal)objectData.getData("FTOP_CVE_NATURALEZA"));
result.setFtopSecCve((BigDecimal)objectData.getData("FTOP_SEC_CVE"));
result.setFtopPagomul((String)objectData.getData("FTOP_PAGOMUL"));
result.setFtopNombreTipoper((String)objectData.getData("FTOP_NOMBRE_TIPOPER"));
result.setFtopStatus((String)objectData.getData("FTOP_STATUS"));
result.setFtopAtencionDias((BigDecimal)objectData.getData("FTOP_ATENCION_DIAS"));
result.setFtopActoJuridico((BigDecimal)objectData.getData("FTOP_ACTO_JURIDICO"));
result.setFtopBienes((BigDecimal)objectData.getData("FTOP_BIENES"));
return result;
}
}