package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PER_FUN_PK", columns = { "FPER_ID_PERFIL", "FFUN_ID_FUNCION" }, sequences = { "MANUAL" })
public class FPerFun extends DomainObject {
BigDecimal ffunIdFuncion =null;
BigDecimal fperIdPerfil =null;
public FPerFun() {
super();
this.pkColumns = 8;
}
public void setFfunIdFuncion (BigDecimal ffunIdFuncion) {
this.ffunIdFuncion=ffunIdFuncion;
}
public void setFperIdPerfil (BigDecimal fperIdPerfil) {
this.fperIdPerfil=fperIdPerfil;
}
public BigDecimal getFfunIdFuncion() {
return this.ffunIdFuncion;
}
public BigDecimal getFperIdPerfil() {
return this.fperIdPerfil;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM F_PER_FUN ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getFfunIdFuncion() != null && this.getFfunIdFuncion().longValue() == -999) {
conditions += " AND FFUN_ID_FUNCION IS NULL";
} else if(this.getFfunIdFuncion() != null) {
conditions += " AND FFUN_ID_FUNCION =?";
values.add(this.getFfunIdFuncion());
}
if(this.getFperIdPerfil() != null && this.getFperIdPerfil().longValue() == -999) {
conditions += " AND FPER_ID_PERFIL IS NULL";
} else if(this.getFperIdPerfil() != null) {
conditions += " AND FPER_ID_PERFIL =?";
values.add(this.getFperIdPerfil());
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
String sql = "SELECT * FROM F_PER_FUN ";
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
String sql = "UPDATE F_PER_FUN SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
conditions += " AND FFUN_ID_FUNCION = ?";
pkValues.add(this.getFfunIdFuncion());
conditions += " AND FPER_ID_PERFIL = ?";
pkValues.add(this.getFperIdPerfil());
    fields += " FFUN_ID_FUNCION = ?, ";
    values.add(this.getFfunIdFuncion());
    fields += " FPER_ID_PERFIL = ?, ";
    values.add(this.getFperIdPerfil());
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
String sql = "INSERT INTO F_PER_FUN ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",FFUN_ID_FUNCION ";
fieldValues += ", ?";
values.add(this.getFfunIdFuncion());
fields += ",FPER_ID_PERFIL ";
fieldValues += ", ?";
values.add(this.getFperIdPerfil());
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
String sql = "DELETE FROM F_PER_FUN WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND FFUN_ID_FUNCION = ?";
values.add(this.getFfunIdFuncion());
conditions += " AND FPER_ID_PERFIL = ?";
values.add(this.getFperIdPerfil());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
FPerFun instance = (FPerFun)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getFfunIdFuncion().equals(instance.getFfunIdFuncion())) equalObjects = false;
if(equalObjects && !this.getFperIdPerfil().equals(instance.getFperIdPerfil())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
FPerFun result = new FPerFun();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setFfunIdFuncion((BigDecimal)objectData.getData("FFUN_ID_FUNCION"));
result.setFperIdPerfil((BigDecimal)objectData.getData("FPER_ID_PERFIL"));
return result;
}
}