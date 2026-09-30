package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;
import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class FDocvig extends DomainObject {
BigDecimal fdocIdAnteproy =null;
BigDecimal fdocNumper =null;
String fdocTipoPer =null;
BigDecimal fdocIdDocumentovig =null;
String fdocFechaRenov =null;
public FDocvig() {
super();
this.pkColumns = 8;
}
public void setFdocIdAnteproy (BigDecimal fdocIdAnteproy) {
this.fdocIdAnteproy=fdocIdAnteproy;
}
public void setFdocNumper (BigDecimal fdocNumper) {
this.fdocNumper=fdocNumper;
}
public void setFdocTipoPer (String fdocTipoPer) {
this.fdocTipoPer=fdocTipoPer;
}
public void setFdocIdDocumentovig (BigDecimal fdocIdDocumentovig) {
this.fdocIdDocumentovig=fdocIdDocumentovig;
}
public void setFdocFechaRenov (String fdocFechaRenov) {
this.fdocFechaRenov=fdocFechaRenov;
}
public BigDecimal getFdocIdAnteproy() {
return this.fdocIdAnteproy;
}
public BigDecimal getFdocNumper() {
return this.fdocNumper;
}
public String getFdocTipoPer() {
return this.fdocTipoPer;
}
public BigDecimal getFdocIdDocumentovig() {
return this.fdocIdDocumentovig;
}
public String getFdocFechaRenov() {
return this.fdocFechaRenov;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM F_DOCVIG ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getFdocIdAnteproy() != null && this.getFdocIdAnteproy().longValue() == -999) {
conditions += " AND FDOC_ID_ANTEPROY IS NULL";
} else if(this.getFdocIdAnteproy() != null) {
conditions += " AND FDOC_ID_ANTEPROY =?";
values.add(this.getFdocIdAnteproy());
}
if(this.getFdocNumper() != null && this.getFdocNumper().longValue() == -999) {
conditions += " AND FDOC_NUMPER IS NULL";
} else if(this.getFdocNumper() != null) {
conditions += " AND FDOC_NUMPER =?";
values.add(this.getFdocNumper());
}
if(this.getFdocTipoPer() != null && "null".equals(this.getFdocTipoPer())) {
conditions += " AND FDOC_TIPO_PER IS NULL";
} else if(this.getFdocTipoPer() != null) {
conditions += " AND FDOC_TIPO_PER =?";
values.add(this.getFdocTipoPer());
}
if(this.getFdocIdDocumentovig() != null && this.getFdocIdDocumentovig().longValue() == -999) {
conditions += " AND FDOC_ID_DOCUMENTOVIG IS NULL";
} else if(this.getFdocIdDocumentovig() != null) {
conditions += " AND FDOC_ID_DOCUMENTOVIG =?";
values.add(this.getFdocIdDocumentovig());
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
String sql = "SELECT * FROM F_DOCVIG ";
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
String sql = "UPDATE F_DOCVIG SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
conditions += " AND FDOC_ID_ANTEPROY = ?";
pkValues.add(this.getFdocIdAnteproy());
conditions += " AND FDOC_NUMPER = ?";
pkValues.add(this.getFdocNumper());
conditions += " AND FDOC_TIPO_PER = ?";
pkValues.add(this.getFdocTipoPer());
conditions += " AND FDOC_ID_DOCUMENTOVIG = ?";
pkValues.add(this.getFdocIdDocumentovig());
fields += " FDOC_FECHA_RENOV = ?, ";
values.add(this.getFdocFechaRenov());
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
String sql = "INSERT INTO F_DOCVIG ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",FDOC_ID_ANTEPROY ";
fieldValues += ", ?";
values.add(this.getFdocIdAnteproy());
fields += ",FDOC_NUMPER ";
fieldValues += ", ?";
values.add(this.getFdocNumper());
fields += ",FDOC_TIPO_PER ";
fieldValues += ", ?";
values.add(this.getFdocTipoPer());
fields += ",FDOC_ID_DOCUMENTOVIG ";
fieldValues += ", ?";
values.add(this.getFdocIdDocumentovig());
fields += ",FDOC_FECHA_RENOV ";
fieldValues += ", ?";
values.add(this.getFdocFechaRenov());
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
String sql = "DELETE FROM F_DOCVIG WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND FDOC_ID_ANTEPROY = ?";
values.add(this.getFdocIdAnteproy());
conditions += " AND FDOC_NUMPER = ?";
values.add(this.getFdocNumper());
conditions += " AND FDOC_TIPO_PER = ?";
values.add(this.getFdocTipoPer());
conditions += " AND FDOC_ID_DOCUMENTOVIG = ?";
values.add(this.getFdocIdDocumentovig());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
FDocvig instance = (FDocvig)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getFdocIdAnteproy().equals(instance.getFdocIdAnteproy())) equalObjects = false;
if(equalObjects && !this.getFdocNumper().equals(instance.getFdocNumper())) equalObjects = false;
if(equalObjects && !this.getFdocTipoPer().equals(instance.getFdocTipoPer())) equalObjects = false;
if(equalObjects && !this.getFdocIdDocumentovig().equals(instance.getFdocIdDocumentovig())) equalObjects = false;
if(equalObjects && !this.getFdocFechaRenov().equals(instance.getFdocFechaRenov())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
FDocvig result = new FDocvig();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setFdocIdAnteproy((BigDecimal)objectData.getData("FDOC_ID_ANTEPROY"));
result.setFdocNumper((BigDecimal)objectData.getData("FDOC_NUMPER"));
result.setFdocTipoPer((String)objectData.getData("FDOC_TIPO_PER"));
result.setFdocIdDocumentovig((BigDecimal)objectData.getData("FDOC_ID_DOCUMENTOVIG"));
result.setFdocFechaRenov((String)objectData.getData("FDOC_FECHA_RENOV"));
return result;
}
}