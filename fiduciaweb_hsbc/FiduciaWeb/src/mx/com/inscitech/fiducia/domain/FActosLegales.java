package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;

@PrimaryKey(constraintName = "F_ACTOS_LEGALES_PK", columns = { "FAL_NUM_FIDEICOMISO", "FAL_TIPO_DOCUMENTO" },
            sequences = { "MANUAL" })

public class FActosLegales extends DomainObject {
String falFecha =null;
String falComentarios =null;
String falTipoConvenio =null;
String falSeccion =null;
String falLibro =null;
String falFojas =null;
String falVolumen =null;
String falPartida =null;
String falNumFolio =null;
String falLugarRegistro =null;
String falFechaInscripcion =null;
String falEstadoNotaria =null;
String falCiudadNotaria =null;
String falNumeroNotario =null;
String falNombreNotario =null;
String falTipoEscritura =null;
String falFechaEscritura =null;
BigDecimal falNumEscritura =null;
String falTipoDocumento =null;
String falApodo =null;
BigDecimal falNumFideicomiso =null;
BigDecimal falFolio =null;
public FActosLegales() {
super();
this.pkColumns = 8;
}
public void setFalFolio (BigDecimal falFolio) {
this.falFolio=falFolio;
}
public void setFalNumFideicomiso (BigDecimal falNumFideicomiso) {
this.falNumFideicomiso=falNumFideicomiso;
}
public void setFalApodo (String falApodo) {
this.falApodo=falApodo;
}
public void setFalTipoDocumento (String falTipoDocumento) {
this.falTipoDocumento=falTipoDocumento;
}
public void setFalNumEscritura (BigDecimal falNumEscritura) {
this.falNumEscritura=falNumEscritura;
}
public void setFalFechaEscritura (String falFechaEscritura) {
this.falFechaEscritura=falFechaEscritura;
}
public void setFalTipoEscritura (String falTipoEscritura) {
this.falTipoEscritura=falTipoEscritura;
}
public void setFalNombreNotario (String falNombreNotario) {
this.falNombreNotario=falNombreNotario;
}
public void setFalNumeroNotario (String falNumeroNotario) {
this.falNumeroNotario=falNumeroNotario;
}
public void setFalCiudadNotaria (String falCiudadNotaria) {
this.falCiudadNotaria=falCiudadNotaria;
}
public void setFalEstadoNotaria (String falEstadoNotaria) {
this.falEstadoNotaria=falEstadoNotaria;
}
public void setFalFechaInscripcion (String falFechaInscripcion) {
this.falFechaInscripcion=falFechaInscripcion;
}
public void setFalLugarRegistro (String falLugarRegistro) {
this.falLugarRegistro=falLugarRegistro;
}
public void setFalNumFolio (String falNumFolio) {
this.falNumFolio=falNumFolio;
}
public void setFalPartida (String falPartida) {
this.falPartida=falPartida;
}
public void setFalVolumen (String falVolumen) {
this.falVolumen=falVolumen;
}
public void setFalFojas (String falFojas) {
this.falFojas=falFojas;
}
public void setFalLibro (String falLibro) {
this.falLibro=falLibro;
}
public void setFalSeccion (String falSeccion) {
this.falSeccion=falSeccion;
}
public void setFalTipoConvenio (String falTipoConvenio) {
this.falTipoConvenio=falTipoConvenio;
}
public void setFalComentarios (String falComentarios) {
this.falComentarios=falComentarios;
}
public void setFalFecha (String falFecha) {
this.falFecha=falFecha;
}
public BigDecimal getFalFolio() {
return this.falFolio;
}
public BigDecimal getFalNumFideicomiso() {
return this.falNumFideicomiso;
}
public String getFalApodo() {
return this.falApodo;
}
public String getFalTipoDocumento() {
return this.falTipoDocumento;
}
public BigDecimal getFalNumEscritura() {
return this.falNumEscritura;
}
public String getFalFechaEscritura() {
return this.falFechaEscritura;
}
public String getFalTipoEscritura() {
return this.falTipoEscritura;
}
public String getFalNombreNotario() {
return this.falNombreNotario;
}
public String getFalNumeroNotario() {
return this.falNumeroNotario;
}
public String getFalCiudadNotaria() {
return this.falCiudadNotaria;
}
public String getFalEstadoNotaria() {
return this.falEstadoNotaria;
}
public String getFalFechaInscripcion() {
return this.falFechaInscripcion;
}
public String getFalLugarRegistro() {
return this.falLugarRegistro;
}
public String getFalNumFolio() {
return this.falNumFolio;
}
public String getFalPartida() {
return this.falPartida;
}
public String getFalVolumen() {
return this.falVolumen;
}
public String getFalFojas() {
return this.falFojas;
}
public String getFalLibro() {
return this.falLibro;
}
public String getFalSeccion() {
return this.falSeccion;
}
public String getFalTipoConvenio() {
return this.falTipoConvenio;
}
public String getFalComentarios() {
return this.falComentarios;
}
public String getFalFecha() {
return this.falFecha;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM F_ACTOS_LEGALES ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getFalFolio() != null && this.getFalFolio().longValue() == -999) {
conditions += " AND FAL_FOLIO IS NULL";
} else if(this.getFalFolio() != null) {
conditions += " AND FAL_FOLIO =?";
values.add(this.getFalFolio());
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
String sql = "SELECT * FROM F_ACTOS_LEGALES ";
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
String sql = "UPDATE F_ACTOS_LEGALES SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
fields += " FAL_FECHA = ?, ";
values.add(this.getFalFecha());
fields += " FAL_COMENTARIOS = ?, ";
values.add(this.getFalComentarios());
fields += " FAL_TIPO_CONVENIO = ?, ";
values.add(this.getFalTipoConvenio());
fields += " FAL_SECCION = ?, ";
values.add(this.getFalSeccion());
fields += " FAL_LIBRO = ?, ";
values.add(this.getFalLibro());
fields += " FAL_FOJAS = ?, ";
values.add(this.getFalFojas());
fields += " FAL_VOLUMEN = ?, ";
values.add(this.getFalVolumen());
fields += " FAL_PARTIDA = ?, ";
values.add(this.getFalPartida());
fields += " FAL_NUM_FOLIO = ?, ";
values.add(this.getFalNumFolio());
fields += " FAL_LUGAR_REGISTRO = ?, ";
values.add(this.getFalLugarRegistro());
fields += " FAL_FECHA_INSCRIPCION = ?, ";
values.add(this.getFalFechaInscripcion());
fields += " FAL_ESTADO_NOTARIA = ?, ";
values.add(this.getFalEstadoNotaria());
fields += " FAL_CIUDAD_NOTARIA = ?, ";
values.add(this.getFalCiudadNotaria());
fields += " FAL_NUMERO_NOTARIO = ?, ";
values.add(this.getFalNumeroNotario());
fields += " FAL_NOMBRE_NOTARIO = ?, ";
values.add(this.getFalNombreNotario());
fields += " FAL_TIPO_ESCRITURA = ?, ";
values.add(this.getFalTipoEscritura());
fields += " FAL_FECHA_ESCRITURA = ?, ";
values.add(this.getFalFechaEscritura());
fields += " FAL_NUM_ESCRITURA = ?, ";
values.add(this.getFalNumEscritura());
fields += " FAL_TIPO_DOCUMENTO = ?, ";
values.add(this.getFalTipoDocumento());
fields += " FAL_APODO = ?, ";
values.add(this.getFalApodo());
fields += " FAL_NUM_FIDEICOMISO = ?, ";
values.add(this.getFalNumFideicomiso());
conditions += " AND FAL_FOLIO = ?";
pkValues.add(this.getFalFolio());
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
String sql = "INSERT INTO F_ACTOS_LEGALES ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",FAL_FECHA ";
fieldValues += ", ?";
values.add(this.getFalFecha());
fields += ",FAL_COMENTARIOS ";
fieldValues += ", ?";
values.add(this.getFalComentarios());
fields += ",FAL_TIPO_CONVENIO ";
fieldValues += ", ?";
values.add(this.getFalTipoConvenio());
fields += ",FAL_SECCION ";
fieldValues += ", ?";
values.add(this.getFalSeccion());
fields += ",FAL_LIBRO ";
fieldValues += ", ?";
values.add(this.getFalLibro());
fields += ",FAL_FOJAS ";
fieldValues += ", ?";
values.add(this.getFalFojas());
fields += ",FAL_VOLUMEN ";
fieldValues += ", ?";
values.add(this.getFalVolumen());
fields += ",FAL_PARTIDA ";
fieldValues += ", ?";
values.add(this.getFalPartida());
fields += ",FAL_NUM_FOLIO ";
fieldValues += ", ?";
values.add(this.getFalNumFolio());
fields += ",FAL_LUGAR_REGISTRO ";
fieldValues += ", ?";
values.add(this.getFalLugarRegistro());
fields += ",FAL_FECHA_INSCRIPCION ";
fieldValues += ", ?";
values.add(this.getFalFechaInscripcion());
fields += ",FAL_ESTADO_NOTARIA ";
fieldValues += ", ?";
values.add(this.getFalEstadoNotaria());
fields += ",FAL_CIUDAD_NOTARIA ";
fieldValues += ", ?";
values.add(this.getFalCiudadNotaria());
fields += ",FAL_NUMERO_NOTARIO ";
fieldValues += ", ?";
values.add(this.getFalNumeroNotario());
fields += ",FAL_NOMBRE_NOTARIO ";
fieldValues += ", ?";
values.add(this.getFalNombreNotario());
fields += ",FAL_TIPO_ESCRITURA ";
fieldValues += ", ?";
values.add(this.getFalTipoEscritura());
fields += ",FAL_FECHA_ESCRITURA ";
fieldValues += ", ?";
values.add(this.getFalFechaEscritura());
fields += ",FAL_NUM_ESCRITURA ";
fieldValues += ", ?";
values.add(this.getFalNumEscritura());
fields += ",FAL_TIPO_DOCUMENTO ";
fieldValues += ", ?";
values.add(this.getFalTipoDocumento());
fields += ",FAL_APODO ";
fieldValues += ", ?";
values.add(this.getFalApodo());
fields += ",FAL_NUM_FIDEICOMISO ";
fieldValues += ", ?";
values.add(this.getFalNumFideicomiso());

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
String sql = "DELETE FROM F_ACTOS_LEGALES WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND FAL_FOLIO = ?";
values.add(this.getFalFolio());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
FActosLegales instance = (FActosLegales)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getFalFecha().equals(instance.getFalFecha())) equalObjects = false;
if(equalObjects && !this.getFalComentarios().equals(instance.getFalComentarios())) equalObjects = false;
if(equalObjects && !this.getFalTipoConvenio().equals(instance.getFalTipoConvenio())) equalObjects = false;
if(equalObjects && !this.getFalSeccion().equals(instance.getFalSeccion())) equalObjects = false;
if(equalObjects && !this.getFalLibro().equals(instance.getFalLibro())) equalObjects = false;
if(equalObjects && !this.getFalFojas().equals(instance.getFalFojas())) equalObjects = false;
if(equalObjects && !this.getFalVolumen().equals(instance.getFalVolumen())) equalObjects = false;
if(equalObjects && !this.getFalPartida().equals(instance.getFalPartida())) equalObjects = false;
if(equalObjects && !this.getFalNumFolio().equals(instance.getFalNumFolio())) equalObjects = false;
if(equalObjects && !this.getFalLugarRegistro().equals(instance.getFalLugarRegistro())) equalObjects = false;
if(equalObjects && !this.getFalFechaInscripcion().equals(instance.getFalFechaInscripcion())) equalObjects = false;
if(equalObjects && !this.getFalEstadoNotaria().equals(instance.getFalEstadoNotaria())) equalObjects = false;
if(equalObjects && !this.getFalCiudadNotaria().equals(instance.getFalCiudadNotaria())) equalObjects = false;
if(equalObjects && !this.getFalNumeroNotario().equals(instance.getFalNumeroNotario())) equalObjects = false;
if(equalObjects && !this.getFalNombreNotario().equals(instance.getFalNombreNotario())) equalObjects = false;
if(equalObjects && !this.getFalTipoEscritura().equals(instance.getFalTipoEscritura())) equalObjects = false;
if(equalObjects && !this.getFalFechaEscritura().equals(instance.getFalFechaEscritura())) equalObjects = false;
if(equalObjects && !this.getFalNumEscritura().equals(instance.getFalNumEscritura())) equalObjects = false;
if(equalObjects && !this.getFalTipoDocumento().equals(instance.getFalTipoDocumento())) equalObjects = false;
if(equalObjects && !this.getFalApodo().equals(instance.getFalApodo())) equalObjects = false;
if(equalObjects && !this.getFalNumFideicomiso().equals(instance.getFalNumFideicomiso())) equalObjects = false;
if(equalObjects && !this.getFalFolio().equals(instance.getFalFolio())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
FActosLegales result = new FActosLegales();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setFalFecha((String)objectData.getData("FAL_FECHA"));
result.setFalComentarios((String)objectData.getData("FAL_COMENTARIOS"));
result.setFalTipoConvenio((String)objectData.getData("FAL_TIPO_CONVENIO"));
result.setFalSeccion((String)objectData.getData("FAL_SECCION"));
result.setFalLibro((String)objectData.getData("FAL_LIBRO"));
result.setFalFojas((String)objectData.getData("FAL_FOJAS"));
result.setFalVolumen((String)objectData.getData("FAL_VOLUMEN"));
result.setFalPartida((String)objectData.getData("FAL_PARTIDA"));
result.setFalNumFolio((String)objectData.getData("FAL_NUM_FOLIO"));
result.setFalLugarRegistro((String)objectData.getData("FAL_LUGAR_REGISTRO"));
result.setFalFechaInscripcion((String)objectData.getData("FAL_FECHA_INSCRIPCION"));
result.setFalEstadoNotaria((String)objectData.getData("FAL_ESTADO_NOTARIA"));
result.setFalCiudadNotaria((String)objectData.getData("FAL_CIUDAD_NOTARIA"));
result.setFalNumeroNotario((String)objectData.getData("FAL_NUMERO_NOTARIO"));
result.setFalNombreNotario((String)objectData.getData("FAL_NOMBRE_NOTARIO"));
result.setFalTipoEscritura((String)objectData.getData("FAL_TIPO_ESCRITURA"));
result.setFalFechaEscritura((String)objectData.getData("FAL_FECHA_ESCRITURA"));
result.setFalNumEscritura((BigDecimal)objectData.getData("FAL_NUM_ESCRITURA"));
result.setFalTipoDocumento((String)objectData.getData("FAL_TIPO_DOCUMENTO"));
result.setFalApodo((String)objectData.getData("FAL_APODO"));
result.setFalNumFideicomiso((BigDecimal)objectData.getData("FAL_NUM_FIDEICOMISO"));
result.setFalFolio((BigDecimal)objectData.getData("FAL_FOLIO"));
return result;
}
}