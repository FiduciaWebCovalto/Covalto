package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;
import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class ArchivosPlanosPolizas extends DomainObject {
BigDecimal arpSecuencial =null;
String arpFecha =null;
String arpNomArchivo =null;
String arpDescripcion =null;
public ArchivosPlanosPolizas() {
super();
this.pkColumns = 8;
}
public void setArpSecuencial (BigDecimal arpSecuencial) {
this.arpSecuencial=arpSecuencial;
}
public void setArpFecha (String arpFecha) {
this.arpFecha=arpFecha;
}
public void setArpNomArchivo (String arpNomArchivo) {
this.arpNomArchivo=arpNomArchivo;
}
public void setArpDescripcion (String arpDescripcion) {
this.arpDescripcion=arpDescripcion;
}
public BigDecimal getArpSecuencial() {
return this.arpSecuencial;
}
public String getArpFecha() {
return this.arpFecha;
}
public String getArpNomArchivo() {
return this.arpNomArchivo;
}
public String getArpDescripcion() {
return this.arpDescripcion;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM ARCHIVOS_PLANOS_POLIZAS ";
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
public DMLObject getSelect() {
if(!retrieveSQL) return null;
DMLObject result = new DMLObject();
String sql = "SELECT * FROM ARCHIVOS_PLANOS_POLIZAS ";
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
String sql = "UPDATE ARCHIVOS_PLANOS_POLIZAS SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
fields += " ARP_SECUENCIAL = ?, ";
values.add(this.getArpSecuencial());
fields += " ARP_FECHA = ?, ";
values.add(this.getArpFecha());
fields += " ARP_NOM_ARCHIVO = ?, ";
values.add(this.getArpNomArchivo());
fields += " ARP_DESCRIPCION = ?, ";
values.add(this.getArpDescripcion());
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
String sql = "INSERT INTO ARCHIVOS_PLANOS_POLIZAS ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",ARP_SECUENCIAL ";
fieldValues += ", ?";
values.add(this.getArpSecuencial());
fields += ",ARP_FECHA ";
fieldValues += ", ?";
values.add(this.getArpFecha());
fields += ",ARP_NOM_ARCHIVO ";
fieldValues += ", ?";
values.add(this.getArpNomArchivo());
fields += ",ARP_DESCRIPCION ";
fieldValues += ", ?";
values.add(this.getArpDescripcion());
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
String sql = "DELETE FROM ARCHIVOS_PLANOS_POLIZAS WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
ArchivosPlanosPolizas instance = (ArchivosPlanosPolizas)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getArpSecuencial().equals(instance.getArpSecuencial())) equalObjects = false;
if(equalObjects && !this.getArpFecha().equals(instance.getArpFecha())) equalObjects = false;
if(equalObjects && !this.getArpNomArchivo().equals(instance.getArpNomArchivo())) equalObjects = false;
if(equalObjects && !this.getArpDescripcion().equals(instance.getArpDescripcion())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
ArchivosPlanosPolizas result = new ArchivosPlanosPolizas();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setArpSecuencial((BigDecimal)objectData.getData("ARP_SECUENCIAL"));
result.setArpFecha((String)objectData.getData("ARP_FECHA"));
result.setArpNomArchivo((String)objectData.getData("ARP_NOM_ARCHIVO"));
result.setArpDescripcion((String)objectData.getData("ARP_DESCRIPCION"));
return result;
}
}