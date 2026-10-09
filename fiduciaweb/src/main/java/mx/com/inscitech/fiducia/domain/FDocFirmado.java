package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
public class FDocFirmado extends DomainObject {
BigDecimal insNumContrato =null;
BigDecimal insNumFolioInst =null;
String fdfTipo =null;
String fdfNombre =null;
String fdfFecha =null;
String fdfNumEscritura =null;
String fdfNotaria =null;
String fdfOriginalCopia =null;
String fdfAnexos =null;
String fdfDelegadoFiduciario =null;
String fdfObservaciones =null;
String fdfFolioMe =null;
String fdfFechaInscripcion =null;
String fdfFoja =null;
String fdfVolumen =null;
String fdfPartida =null;
String fdfLibro =null;
String fdfLocalidadRpp =null;
public FDocFirmado() {
super();
this.pkColumns = 8;
}
public void setInsNumContrato (BigDecimal insNumContrato) {
this.insNumContrato=insNumContrato;
}
public void setInsNumFolioInst (BigDecimal insNumFolioInst) {
this.insNumFolioInst=insNumFolioInst;
}
public void setFdfTipo (String fdfTipo) {
this.fdfTipo=fdfTipo;
}
public void setFdfNombre (String fdfNombre) {
this.fdfNombre=fdfNombre;
}
public void setFdfFecha (String fdfFecha) {
this.fdfFecha=fdfFecha;
}
public void setFdfNumEscritura (String fdfNumEscritura) {
this.fdfNumEscritura=fdfNumEscritura;
}
public void setFdfNotaria (String fdfNotaria) {
this.fdfNotaria=fdfNotaria;
}
public void setFdfOriginalCopia (String fdfOriginalCopia) {
this.fdfOriginalCopia=fdfOriginalCopia;
}
public void setFdfAnexos (String fdfAnexos) {
this.fdfAnexos=fdfAnexos;
}
public void setFdfDelegadoFiduciario (String fdfDelegadoFiduciario) {
this.fdfDelegadoFiduciario=fdfDelegadoFiduciario;
}
public void setFdfObservaciones (String fdfObservaciones) {
this.fdfObservaciones=fdfObservaciones;
}
public void setFdfFolioMe (String fdfFolioMe) {
this.fdfFolioMe=fdfFolioMe;
}
public void setFdfFechaInscripcion (String fdfFechaInscripcion) {
this.fdfFechaInscripcion=fdfFechaInscripcion;
}
public void setFdfFoja (String fdfFoja) {
this.fdfFoja=fdfFoja;
}
public void setFdfVolumen (String fdfVolumen) {
this.fdfVolumen=fdfVolumen;
}
public void setFdfPartida (String fdfPartida) {
this.fdfPartida=fdfPartida;
}
public void setFdfLibro (String fdfLibro) {
this.fdfLibro=fdfLibro;
}
public void setFdfLocalidadRpp (String fdfLocalidadRpp) {
this.fdfLocalidadRpp=fdfLocalidadRpp;
}
public BigDecimal getInsNumContrato() {
return this.insNumContrato;
}
public BigDecimal getInsNumFolioInst() {
return this.insNumFolioInst;
}
public String getFdfTipo() {
return this.fdfTipo;
}
public String getFdfNombre() {
return this.fdfNombre;
}
public String getFdfFecha() {
return this.fdfFecha;
}
public String getFdfNumEscritura() {
return this.fdfNumEscritura;
}
public String getFdfNotaria() {
return this.fdfNotaria;
}
public String getFdfOriginalCopia() {
return this.fdfOriginalCopia;
}
public String getFdfAnexos() {
return this.fdfAnexos;
}
public String getFdfDelegadoFiduciario() {
return this.fdfDelegadoFiduciario;
}
public String getFdfObservaciones() {
return this.fdfObservaciones;
}
public String getFdfFolioMe() {
return this.fdfFolioMe;
}
public String getFdfFechaInscripcion() {
return this.fdfFechaInscripcion;
}
public String getFdfFoja() {
return this.fdfFoja;
}
public String getFdfVolumen() {
return this.fdfVolumen;
}
public String getFdfPartida() {
return this.fdfPartida;
}
public String getFdfLibro() {
return this.fdfLibro;
}
public String getFdfLocalidadRpp() {
return this.fdfLocalidadRpp;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM F_DOC_FIRMADO ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
conditions += " AND INS_NUM_CONTRATO IS NULL";
} else if(this.getInsNumContrato() != null) {
conditions += " AND INS_NUM_CONTRATO =?";
values.add(this.getInsNumContrato());
}
if(this.getInsNumFolioInst() != null && this.getInsNumFolioInst().longValue() == -999) {
conditions += " AND INS_NUM_FOLIO_INST IS NULL";
} else if(this.getInsNumFolioInst() != null) {
conditions += " AND INS_NUM_FOLIO_INST =?";
values.add(this.getInsNumFolioInst());
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
String sql = "SELECT * FROM F_DOC_FIRMADO ";
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
String sql = "UPDATE F_DOC_FIRMADO SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
conditions += " AND INS_NUM_CONTRATO = ?";
pkValues.add(this.getInsNumContrato());
conditions += " AND INS_NUM_FOLIO_INST = ?";
pkValues.add(this.getInsNumFolioInst());
fields += " FDF_TIPO = ?, ";
values.add(this.getFdfTipo());
fields += " FDF_NOMBRE = ?, ";
values.add(this.getFdfNombre());
fields += " FDF_FECHA = ?, ";
values.add(this.getFdfFecha());
fields += " FDF_NUM_ESCRITURA = ?, ";
values.add(this.getFdfNumEscritura());
fields += " FDF_NOTARIA = ?, ";
values.add(this.getFdfNotaria());
fields += " FDF_ORIGINAL_COPIA = ?, ";
values.add(this.getFdfOriginalCopia());
fields += " FDF_ANEXOS = ?, ";
values.add(this.getFdfAnexos());
fields += " FDF_DELEGADO_FIDUCIARIO = ?, ";
values.add(this.getFdfDelegadoFiduciario());
fields += " FDF_OBSERVACIONES = ?, ";
values.add(this.getFdfObservaciones());
fields += " FDF_FOLIO_ME = ?, ";
values.add(this.getFdfFolioMe());
fields += " FDF_FECHA_INSCRIPCION = ?, ";
values.add(this.getFdfFechaInscripcion());
fields += " FDF_FOJA = ?, ";
values.add(this.getFdfFoja());
fields += " FDF_VOLUMEN = ?, ";
values.add(this.getFdfVolumen());
fields += " FDF_PARTIDA = ?, ";
values.add(this.getFdfPartida());
fields += " FDF_LIBRO = ?, ";
values.add(this.getFdfLibro());
fields += " FDF_LOCALIDAD_RPP = ?, ";
values.add(this.getFdfLocalidadRpp());
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
String sql = "INSERT INTO F_DOC_FIRMADO ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",INS_NUM_CONTRATO ";
fieldValues += ", ?";
values.add(this.getInsNumContrato());
fields += ",INS_NUM_FOLIO_INST ";
fieldValues += ", ?";
values.add(this.getInsNumFolioInst());
fields += ",FDF_TIPO ";
fieldValues += ", ?";
values.add(this.getFdfTipo());
fields += ",FDF_NOMBRE ";
fieldValues += ", ?";
values.add(this.getFdfNombre());
fields += ",FDF_FECHA ";
fieldValues += ", ?";
values.add(this.getFdfFecha());
fields += ",FDF_NUM_ESCRITURA ";
fieldValues += ", ?";
values.add(this.getFdfNumEscritura());
fields += ",FDF_NOTARIA ";
fieldValues += ", ?";
values.add(this.getFdfNotaria());
fields += ",FDF_ORIGINAL_COPIA ";
fieldValues += ", ?";
values.add(this.getFdfOriginalCopia());
fields += ",FDF_ANEXOS ";
fieldValues += ", ?";
values.add(this.getFdfAnexos());
fields += ",FDF_DELEGADO_FIDUCIARIO ";
fieldValues += ", ?";
values.add(this.getFdfDelegadoFiduciario());
fields += ",FDF_OBSERVACIONES ";
fieldValues += ", ?";
values.add(this.getFdfObservaciones());
fields += ",FDF_FOLIO_ME ";
fieldValues += ", ?";
values.add(this.getFdfFolioMe());
fields += ",FDF_FECHA_INSCRIPCION ";
fieldValues += ", ?";
values.add(this.getFdfFechaInscripcion());
fields += ",FDF_FOJA ";
fieldValues += ", ?";
values.add(this.getFdfFoja());
fields += ",FDF_VOLUMEN ";
fieldValues += ", ?";
values.add(this.getFdfVolumen());
fields += ",FDF_PARTIDA ";
fieldValues += ", ?";
values.add(this.getFdfPartida());
fields += ",FDF_LIBRO ";
fieldValues += ", ?";
values.add(this.getFdfLibro());
fields += ",FDF_LOCALIDAD_RPP ";
fieldValues += ", ?";
values.add(this.getFdfLocalidadRpp());
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
String sql = "DELETE FROM F_DOC_FIRMADO WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND INS_NUM_CONTRATO = ?";
values.add(this.getInsNumContrato());
conditions += " AND INS_NUM_FOLIO_INST = ?";
values.add(this.getInsNumFolioInst());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
FDocFirmado instance = (FDocFirmado)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getInsNumContrato().equals(instance.getInsNumContrato())) equalObjects = false;
if(equalObjects && !this.getInsNumFolioInst().equals(instance.getInsNumFolioInst())) equalObjects = false;
if(equalObjects && !this.getFdfTipo().equals(instance.getFdfTipo())) equalObjects = false;
if(equalObjects && !this.getFdfNombre().equals(instance.getFdfNombre())) equalObjects = false;
if(equalObjects && !this.getFdfFecha().equals(instance.getFdfFecha())) equalObjects = false;
if(equalObjects && !this.getFdfNumEscritura().equals(instance.getFdfNumEscritura())) equalObjects = false;
if(equalObjects && !this.getFdfNotaria().equals(instance.getFdfNotaria())) equalObjects = false;
if(equalObjects && !this.getFdfOriginalCopia().equals(instance.getFdfOriginalCopia())) equalObjects = false;
if(equalObjects && !this.getFdfAnexos().equals(instance.getFdfAnexos())) equalObjects = false;
if(equalObjects && !this.getFdfDelegadoFiduciario().equals(instance.getFdfDelegadoFiduciario())) equalObjects = false;
if(equalObjects && !this.getFdfObservaciones().equals(instance.getFdfObservaciones())) equalObjects = false;
if(equalObjects && !this.getFdfFolioMe().equals(instance.getFdfFolioMe())) equalObjects = false;
if(equalObjects && !this.getFdfFechaInscripcion().equals(instance.getFdfFechaInscripcion())) equalObjects = false;
if(equalObjects && !this.getFdfFoja().equals(instance.getFdfFoja())) equalObjects = false;
if(equalObjects && !this.getFdfVolumen().equals(instance.getFdfVolumen())) equalObjects = false;
if(equalObjects && !this.getFdfPartida().equals(instance.getFdfPartida())) equalObjects = false;
if(equalObjects && !this.getFdfLibro().equals(instance.getFdfLibro())) equalObjects = false;
if(equalObjects && !this.getFdfLocalidadRpp().equals(instance.getFdfLocalidadRpp())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
FDocFirmado result = new FDocFirmado();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setInsNumContrato((BigDecimal)objectData.getData("INS_NUM_CONTRATO"));
result.setInsNumFolioInst((BigDecimal)objectData.getData("INS_NUM_FOLIO_INST"));
result.setFdfTipo((String)objectData.getData("FDF_TIPO"));
result.setFdfNombre((String)objectData.getData("FDF_NOMBRE"));
result.setFdfFecha((String)objectData.getData("FDF_FECHA"));
result.setFdfNumEscritura((String)objectData.getData("FDF_NUM_ESCRITURA"));
result.setFdfNotaria((String)objectData.getData("FDF_NOTARIA"));
result.setFdfOriginalCopia((String)objectData.getData("FDF_ORIGINAL_COPIA"));
result.setFdfAnexos((String)objectData.getData("FDF_ANEXOS"));
result.setFdfDelegadoFiduciario((String)objectData.getData("FDF_DELEGADO_FIDUCIARIO"));
result.setFdfObservaciones((String)objectData.getData("FDF_OBSERVACIONES"));
result.setFdfFolioMe((String)objectData.getData("FDF_FOLIO_ME"));
result.setFdfFechaInscripcion((String)objectData.getData("FDF_FECHA_INSCRIPCION"));
result.setFdfFoja((String)objectData.getData("FDF_FOJA"));
result.setFdfVolumen((String)objectData.getData("FDF_VOLUMEN"));
result.setFdfPartida((String)objectData.getData("FDF_PARTIDA"));
result.setFdfLibro((String)objectData.getData("FDF_LIBRO"));
result.setFdfLocalidadRpp((String)objectData.getData("FDF_LOCALIDAD_RPP"));
return result;
}
}