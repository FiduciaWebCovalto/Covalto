package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ANTEPROY_PK", columns = { "ANT_NUM_PROSPECTO" }, sequences = { "MAX" })
public class ProspectCarrCtas extends DomainObject {
BigDecimal pccBanco =null;
BigDecimal pccTipoCuenta =null;
BigDecimal pccMoneda =null;
BigDecimal pccNumProspecto =null;
String pccNumCuenta =null;
public ProspectCarrCtas() {
super();
this.pkColumns = 8;
}
public void setPccBanco (BigDecimal pccBanco) {
this.pccBanco=pccBanco;
}
public void setPccTipoCuenta (BigDecimal pccTipoCuenta) {
this.pccTipoCuenta=pccTipoCuenta;
}
public void setPccMoneda (BigDecimal pccMoneda) {
this.pccMoneda=pccMoneda;
}
public void setPccNumProspecto (BigDecimal pccNumProspecto) {
this.pccNumProspecto=pccNumProspecto;
}
public void setPccNumCuenta (String pccNumCuenta) {
this.pccNumCuenta=pccNumCuenta;
}
public BigDecimal getPccBanco() {
return this.pccBanco;
}
public BigDecimal getPccTipoCuenta() {
return this.pccTipoCuenta;
}
public BigDecimal getPccMoneda() {
return this.pccMoneda;
}
public BigDecimal getPccNumProspecto() {
return this.pccNumProspecto;
}
public String getPccNumCuenta() {
return this.pccNumCuenta;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM PROSPECT_CARR_CTAS ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getPccNumCuenta() != null && "null".equals(this.getPccNumCuenta())) {
conditions += " AND PCC_NUM_CUENTA IS NULL";
} else if(this.getPccNumCuenta() != null) {
conditions += " AND PCC_NUM_CUENTA =?";
values.add(this.getPccNumCuenta());
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
String sql = "SELECT * FROM PROSPECT_CARR_CTAS ";
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
String sql = "UPDATE PROSPECT_CARR_CTAS SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
fields += " PCC_BANCO = ?, ";
values.add(this.getPccBanco());
fields += " PCC_TIPO_CUENTA = ?, ";
values.add(this.getPccTipoCuenta());
fields += " PCC_MONEDA = ?, ";
values.add(this.getPccMoneda());
fields += " PCC_NUM_PROSPECTO = ?, ";
values.add(this.getPccNumProspecto());
conditions += " AND PCC_NUM_CUENTA = ?";
pkValues.add(this.getPccNumCuenta());
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
String sql = "INSERT INTO PROSPECT_CARR_CTAS ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",PCC_BANCO ";
fieldValues += ", ?";
values.add(this.getPccBanco());
fields += ",PCC_TIPO_CUENTA ";
fieldValues += ", ?";
values.add(this.getPccTipoCuenta());
fields += ",PCC_MONEDA ";
fieldValues += ", ?";
values.add(this.getPccMoneda());
fields += ",PCC_NUM_PROSPECTO ";
fieldValues += ", ?";
values.add(this.getPccNumProspecto());
fields += ",PCC_NUM_CUENTA ";
fieldValues += ", ?";
values.add(this.getPccNumCuenta());
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
String sql = "DELETE FROM PROSPECT_CARR_CTAS WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND PCC_NUM_CUENTA = ?";
values.add(this.getPccNumCuenta());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
ProspectCarrCtas instance = (ProspectCarrCtas)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getPccBanco().equals(instance.getPccBanco())) equalObjects = false;
if(equalObjects && !this.getPccTipoCuenta().equals(instance.getPccTipoCuenta())) equalObjects = false;
if(equalObjects && !this.getPccMoneda().equals(instance.getPccMoneda())) equalObjects = false;
if(equalObjects && !this.getPccNumProspecto().equals(instance.getPccNumProspecto())) equalObjects = false;
if(equalObjects && !this.getPccNumCuenta().equals(instance.getPccNumCuenta())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
ProspectCarrCtas result = new ProspectCarrCtas();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setPccBanco((BigDecimal)objectData.getData("PCC_BANCO"));
result.setPccTipoCuenta((BigDecimal)objectData.getData("PCC_TIPO_CUENTA"));
result.setPccMoneda((BigDecimal)objectData.getData("PCC_MONEDA"));
result.setPccNumProspecto((BigDecimal)objectData.getData("PCC_NUM_PROSPECTO"));
result.setPccNumCuenta((String)objectData.getData("PCC_NUM_CUENTA"));
return result;
}
}