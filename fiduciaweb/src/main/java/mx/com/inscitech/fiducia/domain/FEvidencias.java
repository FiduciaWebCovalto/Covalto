package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PERFIL_PK", columns = { "FPER_ID_PERFIL" }, sequences = { "MAX" })
public class FEvidencias extends DomainObject {
BigDecimal fevNumProspecto =null;
String fevFolioLegalExpress =null;
public FEvidencias() {
super();
this.pkColumns = 8;
}
public void setFevNumProspecto (BigDecimal fevNumProspecto) {
this.fevNumProspecto=fevNumProspecto;
}
public void setFevFolioLegalExpress (String fevFolioLegalExpress) {
this.fevFolioLegalExpress=fevFolioLegalExpress;
}
public BigDecimal getFevNumProspecto() {
return this.fevNumProspecto;
}
public String getFevFolioLegalExpress() {
return this.fevFolioLegalExpress;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM F_EVIDENCIAS ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getFevNumProspecto() != null && this.getFevNumProspecto().longValue() == -999) {
conditions += " AND FEV_NUM_PROSPECTO IS NULL";
} else if(this.getFevNumProspecto() != null) {
conditions += " AND FEV_NUM_PROSPECTO =?";
values.add(this.getFevNumProspecto());
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
String sql = "SELECT * FROM F_EVIDENCIAS ";
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
String sql = "UPDATE F_EVIDENCIAS SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
conditions += " AND FEV_NUM_PROSPECTO = ?";
pkValues.add(this.getFevNumProspecto());
fields += " FEV_FOLIO_LEGAL_EXPRESS = ?, ";
values.add(this.getFevFolioLegalExpress());
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
String sql = "INSERT INTO F_EVIDENCIAS ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",FEV_NUM_PROSPECTO ";
fieldValues += ", ?";
values.add(this.getFevNumProspecto());
fields += ",FEV_FOLIO_LEGAL_EXPRESS ";
fieldValues += ", ?";
values.add(this.getFevFolioLegalExpress());
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
String sql = "DELETE FROM F_EVIDENCIAS WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND FEV_NUM_PROSPECTO = ?";
values.add(this.getFevNumProspecto());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
FEvidencias instance = (FEvidencias)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getFevNumProspecto().equals(instance.getFevNumProspecto())) equalObjects = false;
if(equalObjects && !this.getFevFolioLegalExpress().equals(instance.getFevFolioLegalExpress())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
FEvidencias result = new FEvidencias();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setFevNumProspecto((BigDecimal)objectData.getData("FEV_NUM_PROSPECTO"));
result.setFevFolioLegalExpress((String)objectData.getData("FEV_FOLIO_LEGAL_EXPRESS"));
return result;
}
}