package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PERFIL_PK", columns = { "FPER_ID_PERFIL" }, sequences = { "MAX" })
public class FPerfilTransac extends DomainObject {
BigDecimal fperAporTerPer =null;
String fperAporPeriodicidad =null;
String fperAporTerPermonto =null;
BigDecimal fperBenefAdic =null;
String fperBenefAdicDesc =null;
BigDecimal fperEfectivoMontoDep =null;
BigDecimal fperEfectivoNumDep =null;
BigDecimal fperEfectivoMontoRet =null;
BigDecimal fperEfectivoNumRet =null;
String fperEfectivoOrigen =null;
String fperEfectivoDestino =null;
BigDecimal fperTransIntMontoDep =null;
BigDecimal fperTransIntNumDep =null;
BigDecimal fperTransIntMontoRet =null;
BigDecimal fperTransIntNumRet =null;
String fperTransIntOrigen =null;
String fperTransIntDestino =null;
BigDecimal fperTransCtasMontoDep =null;
BigDecimal fperTransCtasNumDep =null;
BigDecimal fperTransCtasMontoRet =null;
BigDecimal fperTransCtasNumRet =null;
String fperTransCtasOrigen =null;
String fperTransCtasDestino =null;
BigDecimal fperSpeiMontoDep =null;
BigDecimal fperSpeiNumDep =null;
BigDecimal fperSpeiMontoRet =null;
BigDecimal fperSpeiNumRet =null;
String fperSpeiOrigen =null;
String fperSpeiDestino =null;
BigDecimal fperChMontoDep =null;
BigDecimal fperChNumDep =null;
BigDecimal fperChMontoRet =null;
BigDecimal fperChNumRet =null;
String fperChOrigen =null;
String fperChDestino =null;
BigDecimal fperTipo =null;
BigDecimal fperAntFiso =null;
BigDecimal fperMenor2 =null;
BigDecimal fperMenor210 =null;
BigDecimal fperMenor10 =null;
BigDecimal fperMenor37 =null;
BigDecimal fperAporTercero =null;
BigDecimal fperAporTerceroMonto =null;
public FPerfilTransac() {
super();
this.pkColumns = 8;
}
public void setFperAporTerPer (BigDecimal fperAporTerPer) {
this.fperAporTerPer=fperAporTerPer;
}
public void setFperAporPeriodicidad (String fperAporPeriodicidad) {
this.fperAporPeriodicidad=fperAporPeriodicidad;
}
public void setFperAporTerPermonto (String fperAporTerPermonto) {
this.fperAporTerPermonto=fperAporTerPermonto;
}
public void setFperBenefAdic (BigDecimal fperBenefAdic) {
this.fperBenefAdic=fperBenefAdic;
}
public void setFperBenefAdicDesc (String fperBenefAdicDesc) {
this.fperBenefAdicDesc=fperBenefAdicDesc;
}
public void setFperEfectivoMontoDep (BigDecimal fperEfectivoMontoDep) {
this.fperEfectivoMontoDep=fperEfectivoMontoDep;
}
public void setFperEfectivoNumDep (BigDecimal fperEfectivoNumDep) {
this.fperEfectivoNumDep=fperEfectivoNumDep;
}
public void setFperEfectivoMontoRet (BigDecimal fperEfectivoMontoRet) {
this.fperEfectivoMontoRet=fperEfectivoMontoRet;
}
public void setFperEfectivoNumRet (BigDecimal fperEfectivoNumRet) {
this.fperEfectivoNumRet=fperEfectivoNumRet;
}
public void setFperEfectivoOrigen (String fperEfectivoOrigen) {
this.fperEfectivoOrigen=fperEfectivoOrigen;
}
public void setFperEfectivoDestino (String fperEfectivoDestino) {
this.fperEfectivoDestino=fperEfectivoDestino;
}
public void setFperTransIntMontoDep (BigDecimal fperTransIntMontoDep) {
this.fperTransIntMontoDep=fperTransIntMontoDep;
}
public void setFperTransIntNumDep (BigDecimal fperTransIntNumDep) {
this.fperTransIntNumDep=fperTransIntNumDep;
}
public void setFperTransIntMontoRet (BigDecimal fperTransIntMontoRet) {
this.fperTransIntMontoRet=fperTransIntMontoRet;
}
public void setFperTransIntNumRet (BigDecimal fperTransIntNumRet) {
this.fperTransIntNumRet=fperTransIntNumRet;
}
public void setFperTransIntOrigen (String fperTransIntOrigen) {
this.fperTransIntOrigen=fperTransIntOrigen;
}
public void setFperTransIntDestino (String fperTransIntDestino) {
this.fperTransIntDestino=fperTransIntDestino;
}
public void setFperTransCtasMontoDep (BigDecimal fperTransCtasMontoDep) {
this.fperTransCtasMontoDep=fperTransCtasMontoDep;
}
public void setFperTransCtasNumDep (BigDecimal fperTransCtasNumDep) {
this.fperTransCtasNumDep=fperTransCtasNumDep;
}
public void setFperTransCtasMontoRet (BigDecimal fperTransCtasMontoRet) {
this.fperTransCtasMontoRet=fperTransCtasMontoRet;
}
public void setFperTransCtasNumRet (BigDecimal fperTransCtasNumRet) {
this.fperTransCtasNumRet=fperTransCtasNumRet;
}
public void setFperTransCtasOrigen (String fperTransCtasOrigen) {
this.fperTransCtasOrigen=fperTransCtasOrigen;
}
public void setFperTransCtasDestino (String fperTransCtasDestino) {
this.fperTransCtasDestino=fperTransCtasDestino;
}
public void setFperSpeiMontoDep (BigDecimal fperSpeiMontoDep) {
this.fperSpeiMontoDep=fperSpeiMontoDep;
}
public void setFperSpeiNumDep (BigDecimal fperSpeiNumDep) {
this.fperSpeiNumDep=fperSpeiNumDep;
}
public void setFperSpeiMontoRet (BigDecimal fperSpeiMontoRet) {
this.fperSpeiMontoRet=fperSpeiMontoRet;
}
public void setFperSpeiNumRet (BigDecimal fperSpeiNumRet) {
this.fperSpeiNumRet=fperSpeiNumRet;
}
public void setFperSpeiOrigen (String fperSpeiOrigen) {
this.fperSpeiOrigen=fperSpeiOrigen;
}
public void setFperSpeiDestino (String fperSpeiDestino) {
this.fperSpeiDestino=fperSpeiDestino;
}
public void setFperChMontoDep (BigDecimal fperChMontoDep) {
this.fperChMontoDep=fperChMontoDep;
}
public void setFperChNumDep (BigDecimal fperChNumDep) {
this.fperChNumDep=fperChNumDep;
}
public void setFperChMontoRet (BigDecimal fperChMontoRet) {
this.fperChMontoRet=fperChMontoRet;
}
public void setFperChNumRet (BigDecimal fperChNumRet) {
this.fperChNumRet=fperChNumRet;
}
public void setFperChOrigen (String fperChOrigen) {
this.fperChOrigen=fperChOrigen;
}
public void setFperChDestino (String fperChDestino) {
this.fperChDestino=fperChDestino;
}
public void setFperTipo (BigDecimal fperTipo) {
this.fperTipo=fperTipo;
}
public void setFperAntFiso (BigDecimal fperAntFiso) {
this.fperAntFiso=fperAntFiso;
}
public void setFperMenor2 (BigDecimal fperMenor2) {
this.fperMenor2=fperMenor2;
}
public void setFperMenor210 (BigDecimal fperMenor210) {
this.fperMenor210=fperMenor210;
}
public void setFperMenor10 (BigDecimal fperMenor10) {
this.fperMenor10=fperMenor10;
}
public void setFperMenor37 (BigDecimal fperMenor37) {
this.fperMenor37=fperMenor37;
}
public void setFperAporTercero (BigDecimal fperAporTercero) {
this.fperAporTercero=fperAporTercero;
}
public void setFperAporTerceroMonto (BigDecimal fperAporTerceroMonto) {
this.fperAporTerceroMonto=fperAporTerceroMonto;
}
public BigDecimal getFperAporTerPer() {
return this.fperAporTerPer;
}
public String getFperAporPeriodicidad() {
return this.fperAporPeriodicidad;
}
public String getFperAporTerPermonto() {
return this.fperAporTerPermonto;
}
public BigDecimal getFperBenefAdic() {
return this.fperBenefAdic;
}
public String getFperBenefAdicDesc() {
return this.fperBenefAdicDesc;
}
public BigDecimal getFperEfectivoMontoDep() {
return this.fperEfectivoMontoDep;
}
public BigDecimal getFperEfectivoNumDep() {
return this.fperEfectivoNumDep;
}
public BigDecimal getFperEfectivoMontoRet() {
return this.fperEfectivoMontoRet;
}
public BigDecimal getFperEfectivoNumRet() {
return this.fperEfectivoNumRet;
}
public String getFperEfectivoOrigen() {
return this.fperEfectivoOrigen;
}
public String getFperEfectivoDestino() {
return this.fperEfectivoDestino;
}
public BigDecimal getFperTransIntMontoDep() {
return this.fperTransIntMontoDep;
}
public BigDecimal getFperTransIntNumDep() {
return this.fperTransIntNumDep;
}
public BigDecimal getFperTransIntMontoRet() {
return this.fperTransIntMontoRet;
}
public BigDecimal getFperTransIntNumRet() {
return this.fperTransIntNumRet;
}
public String getFperTransIntOrigen() {
return this.fperTransIntOrigen;
}
public String getFperTransIntDestino() {
return this.fperTransIntDestino;
}
public BigDecimal getFperTransCtasMontoDep() {
return this.fperTransCtasMontoDep;
}
public BigDecimal getFperTransCtasNumDep() {
return this.fperTransCtasNumDep;
}
public BigDecimal getFperTransCtasMontoRet() {
return this.fperTransCtasMontoRet;
}
public BigDecimal getFperTransCtasNumRet() {
return this.fperTransCtasNumRet;
}
public String getFperTransCtasOrigen() {
return this.fperTransCtasOrigen;
}
public String getFperTransCtasDestino() {
return this.fperTransCtasDestino;
}
public BigDecimal getFperSpeiMontoDep() {
return this.fperSpeiMontoDep;
}
public BigDecimal getFperSpeiNumDep() {
return this.fperSpeiNumDep;
}
public BigDecimal getFperSpeiMontoRet() {
return this.fperSpeiMontoRet;
}
public BigDecimal getFperSpeiNumRet() {
return this.fperSpeiNumRet;
}
public String getFperSpeiOrigen() {
return this.fperSpeiOrigen;
}
public String getFperSpeiDestino() {
return this.fperSpeiDestino;
}
public BigDecimal getFperChMontoDep() {
return this.fperChMontoDep;
}
public BigDecimal getFperChNumDep() {
return this.fperChNumDep;
}
public BigDecimal getFperChMontoRet() {
return this.fperChMontoRet;
}
public BigDecimal getFperChNumRet() {
return this.fperChNumRet;
}
public String getFperChOrigen() {
return this.fperChOrigen;
}
public String getFperChDestino() {
return this.fperChDestino;
}
public BigDecimal getFperTipo() {
return this.fperTipo;
}
public BigDecimal getFperAntFiso() {
return this.fperAntFiso;
}
public BigDecimal getFperMenor2() {
return this.fperMenor2;
}
public BigDecimal getFperMenor210() {
return this.fperMenor210;
}
public BigDecimal getFperMenor10() {
return this.fperMenor10;
}
public BigDecimal getFperMenor37() {
return this.fperMenor37;
}
public BigDecimal getFperAporTercero() {
return this.fperAporTercero;
}
public BigDecimal getFperAporTerceroMonto() {
return this.fperAporTerceroMonto;
}
  public DMLObject getSelectByPK() {
  if(!retrieveSQL) return null;
  DMLObject result = new DMLObject();
  String sql = "SELECT * FROM F_PERFIL_TRANSAC ";
  String conditions = "";
  ArrayList values = new ArrayList();
if(this.getFperTipo() != null && this.getFperTipo().longValue() == -999) {
conditions += " AND FPER_TIPO IS NULL";
} else if(this.getFperTipo() != null) {
conditions += " AND FPER_TIPO =?";
values.add(this.getFperTipo());
}
if(this.getFperAntFiso() != null && this.getFperAntFiso().longValue() == -999) {
conditions += " AND FPER_ANT_FISO IS NULL";
} else if(this.getFperAntFiso() != null) {
conditions += " AND FPER_ANT_FISO =?";
values.add(this.getFperAntFiso());
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
String sql = "SELECT * FROM F_PERFIL_TRANSAC ";
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
String sql = "UPDATE F_PERFIL_TRANSAC SET ";
String fields = "";
String conditions = "";
ArrayList pkValues = new ArrayList();
ArrayList values = new ArrayList();
fields += " FPER_APOR_TER_PER = ?, ";
values.add(this.getFperAporTerPer());
fields += " FPER_APOR_PERIODICIDAD = ?, ";
values.add(this.getFperAporPeriodicidad());
fields += " FPER_APOR_TER_PERMONTO = ?, ";
values.add(this.getFperAporTerPermonto());
fields += " FPER_BENEF_ADIC = ?, ";
values.add(this.getFperBenefAdic());
fields += " FPER_BENEF_ADIC_DESC = ?, ";
values.add(this.getFperBenefAdicDesc());
fields += " FPER_EFECTIVO_MONTO_DEP = ?, ";
values.add(this.getFperEfectivoMontoDep());
fields += " FPER_EFECTIVO_NUM_DEP = ?, ";
values.add(this.getFperEfectivoNumDep());
fields += " FPER_EFECTIVO_MONTO_RET = ?, ";
values.add(this.getFperEfectivoMontoRet());
fields += " FPER_EFECTIVO_NUM_RET = ?, ";
values.add(this.getFperEfectivoNumRet());
fields += " FPER_EFECTIVO_ORIGEN = ?, ";
values.add(this.getFperEfectivoOrigen());
fields += " FPER_EFECTIVO_DESTINO = ?, ";
values.add(this.getFperEfectivoDestino());
fields += " FPER_TRANS_INT_MONTO_DEP = ?, ";
values.add(this.getFperTransIntMontoDep());
fields += " FPER_TRANS_INT_NUM_DEP = ?, ";
values.add(this.getFperTransIntNumDep());
fields += " FPER_TRANS_INT_MONTO_RET = ?, ";
values.add(this.getFperTransIntMontoRet());
fields += " FPER_TRANS_INT_NUM_RET = ?, ";
values.add(this.getFperTransIntNumRet());
fields += " FPER_TRANS_INT_ORIGEN = ?, ";
values.add(this.getFperTransIntOrigen());
fields += " FPER_TRANS_INT_DESTINO = ?, ";
values.add(this.getFperTransIntDestino());
fields += " FPER_TRANS_CTAS_MONTO_DEP = ?, ";
values.add(this.getFperTransCtasMontoDep());
fields += " FPER_TRANS_CTAS_NUM_DEP = ?, ";
values.add(this.getFperTransCtasNumDep());
fields += " FPER_TRANS_CTAS_MONTO_RET = ?, ";
values.add(this.getFperTransCtasMontoRet());
fields += " FPER_TRANS_CTAS_NUM_RET = ?, ";
values.add(this.getFperTransCtasNumRet());
fields += " FPER_TRANS_CTAS_ORIGEN = ?, ";
values.add(this.getFperTransCtasOrigen());
fields += " FPER_TRANS_CTAS_DESTINO = ?, ";
values.add(this.getFperTransCtasDestino());
fields += " FPER_SPEI_MONTO_DEP = ?, ";
values.add(this.getFperSpeiMontoDep());
fields += " FPER_SPEI_NUM_DEP = ?, ";
values.add(this.getFperSpeiNumDep());
fields += " FPER_SPEI_MONTO_RET = ?, ";
values.add(this.getFperSpeiMontoRet());
fields += " FPER_SPEI_NUM_RET = ?, ";
values.add(this.getFperSpeiNumRet());
fields += " FPER_SPEI_ORIGEN = ?, ";
values.add(this.getFperSpeiOrigen());
fields += " FPER_SPEI_DESTINO = ?, ";
values.add(this.getFperSpeiDestino());
fields += " FPER_CH_MONTO_DEP = ?, ";
values.add(this.getFperChMontoDep());
fields += " FPER_CH_NUM_DEP = ?, ";
values.add(this.getFperChNumDep());
fields += " FPER_CH_MONTO_RET = ?, ";
values.add(this.getFperChMontoRet());
fields += " FPER_CH_NUM_RET = ?, ";
values.add(this.getFperChNumRet());
fields += " FPER_CH_ORIGEN = ?, ";
values.add(this.getFperChOrigen());
fields += " FPER_CH_DESTINO = ?, ";
values.add(this.getFperChDestino());
conditions += " AND FPER_TIPO = ?";
pkValues.add(this.getFperTipo());
conditions += " AND FPER_ANT_FISO = ?";
pkValues.add(this.getFperAntFiso());
fields += " FPER_MENOR_2 = ?, ";
values.add(this.getFperMenor2());
fields += " FPER_MENOR_2_10 = ?, ";
values.add(this.getFperMenor210());
fields += " FPER_MENOR_10 = ?, ";
values.add(this.getFperMenor10());
fields += " FPER_MENOR_37 = ?, ";
values.add(this.getFperMenor37());
fields += " FPER_APOR_TERCERO = ?, ";
values.add(this.getFperAporTercero());
fields += " FPER_APOR_TERCERO_MONTO = ?, ";
values.add(this.getFperAporTerceroMonto());
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
String sql = "INSERT INTO F_PERFIL_TRANSAC ( ";
String fields = "";
String fieldValues = "";
ArrayList values = new ArrayList();
fields += ",FPER_APOR_TER_PER ";
fieldValues += ", ?";
values.add(this.getFperAporTerPer());
fields += ",FPER_APOR_PERIODICIDAD ";
fieldValues += ", ?";
values.add(this.getFperAporPeriodicidad());
fields += ",FPER_APOR_TER_PERMONTO ";
fieldValues += ", ?";
values.add(this.getFperAporTerPermonto());
fields += ",FPER_BENEF_ADIC ";
fieldValues += ", ?";
values.add(this.getFperBenefAdic());
fields += ",FPER_BENEF_ADIC_DESC ";
fieldValues += ", ?";
values.add(this.getFperBenefAdicDesc());
fields += ",FPER_EFECTIVO_MONTO_DEP ";
fieldValues += ", ?";
values.add(this.getFperEfectivoMontoDep());
fields += ",FPER_EFECTIVO_NUM_DEP ";
fieldValues += ", ?";
values.add(this.getFperEfectivoNumDep());
fields += ",FPER_EFECTIVO_MONTO_RET ";
fieldValues += ", ?";
values.add(this.getFperEfectivoMontoRet());
fields += ",FPER_EFECTIVO_NUM_RET ";
fieldValues += ", ?";
values.add(this.getFperEfectivoNumRet());
fields += ",FPER_EFECTIVO_ORIGEN ";
fieldValues += ", ?";
values.add(this.getFperEfectivoOrigen());
fields += ",FPER_EFECTIVO_DESTINO ";
fieldValues += ", ?";
values.add(this.getFperEfectivoDestino());
fields += ",FPER_TRANS_INT_MONTO_DEP ";
fieldValues += ", ?";
values.add(this.getFperTransIntMontoDep());
fields += ",FPER_TRANS_INT_NUM_DEP ";
fieldValues += ", ?";
values.add(this.getFperTransIntNumDep());
fields += ",FPER_TRANS_INT_MONTO_RET ";
fieldValues += ", ?";
values.add(this.getFperTransIntMontoRet());
fields += ",FPER_TRANS_INT_NUM_RET ";
fieldValues += ", ?";
values.add(this.getFperTransIntNumRet());
fields += ",FPER_TRANS_INT_ORIGEN ";
fieldValues += ", ?";
values.add(this.getFperTransIntOrigen());
fields += ",FPER_TRANS_INT_DESTINO ";
fieldValues += ", ?";
values.add(this.getFperTransIntDestino());
fields += ",FPER_TRANS_CTAS_MONTO_DEP ";
fieldValues += ", ?";
values.add(this.getFperTransCtasMontoDep());
fields += ",FPER_TRANS_CTAS_NUM_DEP ";
fieldValues += ", ?";
values.add(this.getFperTransCtasNumDep());
fields += ",FPER_TRANS_CTAS_MONTO_RET ";
fieldValues += ", ?";
values.add(this.getFperTransCtasMontoRet());
fields += ",FPER_TRANS_CTAS_NUM_RET ";
fieldValues += ", ?";
values.add(this.getFperTransCtasNumRet());
fields += ",FPER_TRANS_CTAS_ORIGEN ";
fieldValues += ", ?";
values.add(this.getFperTransCtasOrigen());
fields += ",FPER_TRANS_CTAS_DESTINO ";
fieldValues += ", ?";
values.add(this.getFperTransCtasDestino());
fields += ",FPER_SPEI_MONTO_DEP ";
fieldValues += ", ?";
values.add(this.getFperSpeiMontoDep());
fields += ",FPER_SPEI_NUM_DEP ";
fieldValues += ", ?";
values.add(this.getFperSpeiNumDep());
fields += ",FPER_SPEI_MONTO_RET ";
fieldValues += ", ?";
values.add(this.getFperSpeiMontoRet());
fields += ",FPER_SPEI_NUM_RET ";
fieldValues += ", ?";
values.add(this.getFperSpeiNumRet());
fields += ",FPER_SPEI_ORIGEN ";
fieldValues += ", ?";
values.add(this.getFperSpeiOrigen());
fields += ",FPER_SPEI_DESTINO ";
fieldValues += ", ?";
values.add(this.getFperSpeiDestino());
fields += ",FPER_CH_MONTO_DEP ";
fieldValues += ", ?";
values.add(this.getFperChMontoDep());
fields += ",FPER_CH_NUM_DEP ";
fieldValues += ", ?";
values.add(this.getFperChNumDep());
fields += ",FPER_CH_MONTO_RET ";
fieldValues += ", ?";
values.add(this.getFperChMontoRet());
fields += ",FPER_CH_NUM_RET ";
fieldValues += ", ?";
values.add(this.getFperChNumRet());
fields += ",FPER_CH_ORIGEN ";
fieldValues += ", ?";
values.add(this.getFperChOrigen());
fields += ",FPER_CH_DESTINO ";
fieldValues += ", ?";
values.add(this.getFperChDestino());
fields += ",FPER_TIPO ";
fieldValues += ", ?";
values.add(this.getFperTipo());
fields += ",FPER_ANT_FISO ";
fieldValues += ", ?";
values.add(this.getFperAntFiso());
fields += ",FPER_MENOR_2 ";
fieldValues += ", ?";
values.add(this.getFperMenor2());
fields += ",FPER_MENOR_2_10 ";
fieldValues += ", ?";
values.add(this.getFperMenor210());
fields += ",FPER_MENOR_10 ";
fieldValues += ", ?";
values.add(this.getFperMenor10());
fields += ",FPER_MENOR_37 ";
fieldValues += ", ?";
values.add(this.getFperMenor37());
fields += ",FPER_APOR_TERCERO ";
fieldValues += ", ?";
values.add(this.getFperAporTercero());
fields += ",FPER_APOR_TERCERO_MONTO ";
fieldValues += ", ?";
values.add(this.getFperAporTerceroMonto());
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
String sql = "DELETE FROM F_PERFIL_TRANSAC WHERE ";
String conditions = "";
ArrayList values = new ArrayList();
conditions += " AND FPER_TIPO = ?";
values.add(this.getFperTipo());
conditions += " AND FPER_ANT_FISO = ?";
values.add(this.getFperAntFiso());
conditions = conditions.substring(4).trim();
result.setSql(sql + conditions);
result.setParameters(values.toArray());
return result;
}
public boolean validate() {
return true;  }
public boolean doCompare(Object compareWith) {
FPerfilTransac instance = (FPerfilTransac)compareWith;
boolean equalObjects = true;
if(equalObjects && !this.getFperAporTerPer().equals(instance.getFperAporTerPer())) equalObjects = false;
if(equalObjects && !this.getFperAporPeriodicidad().equals(instance.getFperAporPeriodicidad())) equalObjects = false;
if(equalObjects && !this.getFperAporTerPermonto().equals(instance.getFperAporTerPermonto())) equalObjects = false;
if(equalObjects && !this.getFperBenefAdic().equals(instance.getFperBenefAdic())) equalObjects = false;
if(equalObjects && !this.getFperBenefAdicDesc().equals(instance.getFperBenefAdicDesc())) equalObjects = false;
if(equalObjects && !this.getFperEfectivoMontoDep().equals(instance.getFperEfectivoMontoDep())) equalObjects = false;
if(equalObjects && !this.getFperEfectivoNumDep().equals(instance.getFperEfectivoNumDep())) equalObjects = false;
if(equalObjects && !this.getFperEfectivoMontoRet().equals(instance.getFperEfectivoMontoRet())) equalObjects = false;
if(equalObjects && !this.getFperEfectivoNumRet().equals(instance.getFperEfectivoNumRet())) equalObjects = false;
if(equalObjects && !this.getFperEfectivoOrigen().equals(instance.getFperEfectivoOrigen())) equalObjects = false;
if(equalObjects && !this.getFperEfectivoDestino().equals(instance.getFperEfectivoDestino())) equalObjects = false;
if(equalObjects && !this.getFperTransIntMontoDep().equals(instance.getFperTransIntMontoDep())) equalObjects = false;
if(equalObjects && !this.getFperTransIntNumDep().equals(instance.getFperTransIntNumDep())) equalObjects = false;
if(equalObjects && !this.getFperTransIntMontoRet().equals(instance.getFperTransIntMontoRet())) equalObjects = false;
if(equalObjects && !this.getFperTransIntNumRet().equals(instance.getFperTransIntNumRet())) equalObjects = false;
if(equalObjects && !this.getFperTransIntOrigen().equals(instance.getFperTransIntOrigen())) equalObjects = false;
if(equalObjects && !this.getFperTransIntDestino().equals(instance.getFperTransIntDestino())) equalObjects = false;
if(equalObjects && !this.getFperTransCtasMontoDep().equals(instance.getFperTransCtasMontoDep())) equalObjects = false;
if(equalObjects && !this.getFperTransCtasNumDep().equals(instance.getFperTransCtasNumDep())) equalObjects = false;
if(equalObjects && !this.getFperTransCtasMontoRet().equals(instance.getFperTransCtasMontoRet())) equalObjects = false;
if(equalObjects && !this.getFperTransCtasNumRet().equals(instance.getFperTransCtasNumRet())) equalObjects = false;
if(equalObjects && !this.getFperTransCtasOrigen().equals(instance.getFperTransCtasOrigen())) equalObjects = false;
if(equalObjects && !this.getFperTransCtasDestino().equals(instance.getFperTransCtasDestino())) equalObjects = false;
if(equalObjects && !this.getFperSpeiMontoDep().equals(instance.getFperSpeiMontoDep())) equalObjects = false;
if(equalObjects && !this.getFperSpeiNumDep().equals(instance.getFperSpeiNumDep())) equalObjects = false;
if(equalObjects && !this.getFperSpeiMontoRet().equals(instance.getFperSpeiMontoRet())) equalObjects = false;
if(equalObjects && !this.getFperSpeiNumRet().equals(instance.getFperSpeiNumRet())) equalObjects = false;
if(equalObjects && !this.getFperSpeiOrigen().equals(instance.getFperSpeiOrigen())) equalObjects = false;
if(equalObjects && !this.getFperSpeiDestino().equals(instance.getFperSpeiDestino())) equalObjects = false;
if(equalObjects && !this.getFperChMontoDep().equals(instance.getFperChMontoDep())) equalObjects = false;
if(equalObjects && !this.getFperChNumDep().equals(instance.getFperChNumDep())) equalObjects = false;
if(equalObjects && !this.getFperChMontoRet().equals(instance.getFperChMontoRet())) equalObjects = false;
if(equalObjects && !this.getFperChNumRet().equals(instance.getFperChNumRet())) equalObjects = false;
if(equalObjects && !this.getFperChOrigen().equals(instance.getFperChOrigen())) equalObjects = false;
if(equalObjects && !this.getFperChDestino().equals(instance.getFperChDestino())) equalObjects = false;
if(equalObjects && !this.getFperTipo().equals(instance.getFperTipo())) equalObjects = false;
if(equalObjects && !this.getFperAntFiso().equals(instance.getFperAntFiso())) equalObjects = false;
if(equalObjects && !this.getFperMenor2().equals(instance.getFperMenor2())) equalObjects = false;
if(equalObjects && !this.getFperMenor210().equals(instance.getFperMenor210())) equalObjects = false;
if(equalObjects && !this.getFperMenor10().equals(instance.getFperMenor10())) equalObjects = false;
if(equalObjects && !this.getFperMenor37().equals(instance.getFperMenor37())) equalObjects = false;
if(equalObjects && !this.getFperAporTercero().equals(instance.getFperAporTercero())) equalObjects = false;
if(equalObjects && !this.getFperAporTerceroMonto().equals(instance.getFperAporTerceroMonto())) equalObjects = false;
return equalObjects;
}
public Object selectAsObject() {
FPerfilTransac result = new FPerfilTransac();
 DataRow objectData = null;
 objectData = selectAsDataRow();
result.setFperAporTerPer((BigDecimal)objectData.getData("FPER_APOR_TER_PER"));
result.setFperAporPeriodicidad((String)objectData.getData("FPER_APOR_PERIODICIDAD"));
result.setFperAporTerPermonto((String)objectData.getData("FPER_APOR_TER_PERMONTO"));
result.setFperBenefAdic((BigDecimal)objectData.getData("FPER_BENEF_ADIC"));
result.setFperBenefAdicDesc((String)objectData.getData("FPER_BENEF_ADIC_DESC"));
result.setFperEfectivoMontoDep((BigDecimal)objectData.getData("FPER_EFECTIVO_MONTO_DEP"));
result.setFperEfectivoNumDep((BigDecimal)objectData.getData("FPER_EFECTIVO_NUM_DEP"));
result.setFperEfectivoMontoRet((BigDecimal)objectData.getData("FPER_EFECTIVO_MONTO_RET"));
result.setFperEfectivoNumRet((BigDecimal)objectData.getData("FPER_EFECTIVO_NUM_RET"));
result.setFperEfectivoOrigen((String)objectData.getData("FPER_EFECTIVO_ORIGEN"));
result.setFperEfectivoDestino((String)objectData.getData("FPER_EFECTIVO_DESTINO"));
result.setFperTransIntMontoDep((BigDecimal)objectData.getData("FPER_TRANS_INT_MONTO_DEP"));
result.setFperTransIntNumDep((BigDecimal)objectData.getData("FPER_TRANS_INT_NUM_DEP"));
result.setFperTransIntMontoRet((BigDecimal)objectData.getData("FPER_TRANS_INT_MONTO_RET"));
result.setFperTransIntNumRet((BigDecimal)objectData.getData("FPER_TRANS_INT_NUM_RET"));
result.setFperTransIntOrigen((String)objectData.getData("FPER_TRANS_INT_ORIGEN"));
result.setFperTransIntDestino((String)objectData.getData("FPER_TRANS_INT_DESTINO"));
result.setFperTransCtasMontoDep((BigDecimal)objectData.getData("FPER_TRANS_CTAS_MONTO_DEP"));
result.setFperTransCtasNumDep((BigDecimal)objectData.getData("FPER_TRANS_CTAS_NUM_DEP"));
result.setFperTransCtasMontoRet((BigDecimal)objectData.getData("FPER_TRANS_CTAS_MONTO_RET"));
result.setFperTransCtasNumRet((BigDecimal)objectData.getData("FPER_TRANS_CTAS_NUM_RET"));
result.setFperTransCtasOrigen((String)objectData.getData("FPER_TRANS_CTAS_ORIGEN"));
result.setFperTransCtasDestino((String)objectData.getData("FPER_TRANS_CTAS_DESTINO"));
result.setFperSpeiMontoDep((BigDecimal)objectData.getData("FPER_SPEI_MONTO_DEP"));
result.setFperSpeiNumDep((BigDecimal)objectData.getData("FPER_SPEI_NUM_DEP"));
result.setFperSpeiMontoRet((BigDecimal)objectData.getData("FPER_SPEI_MONTO_RET"));
result.setFperSpeiNumRet((BigDecimal)objectData.getData("FPER_SPEI_NUM_RET"));
result.setFperSpeiOrigen((String)objectData.getData("FPER_SPEI_ORIGEN"));
result.setFperSpeiDestino((String)objectData.getData("FPER_SPEI_DESTINO"));
result.setFperChMontoDep((BigDecimal)objectData.getData("FPER_CH_MONTO_DEP"));
result.setFperChNumDep((BigDecimal)objectData.getData("FPER_CH_NUM_DEP"));
result.setFperChMontoRet((BigDecimal)objectData.getData("FPER_CH_MONTO_RET"));
result.setFperChNumRet((BigDecimal)objectData.getData("FPER_CH_NUM_RET"));
result.setFperChOrigen((String)objectData.getData("FPER_CH_ORIGEN"));
result.setFperChDestino((String)objectData.getData("FPER_CH_DESTINO"));
result.setFperTipo((BigDecimal)objectData.getData("FPER_TIPO"));
result.setFperAntFiso((BigDecimal)objectData.getData("FPER_ANT_FISO"));
result.setFperMenor2((BigDecimal)objectData.getData("FPER_MENOR_2"));
result.setFperMenor210((BigDecimal)objectData.getData("FPER_MENOR_2_10"));
result.setFperMenor10((BigDecimal)objectData.getData("FPER_MENOR_10"));
result.setFperMenor37((BigDecimal)objectData.getData("FPER_MENOR_37"));
result.setFperAporTercero((BigDecimal)objectData.getData("FPER_APOR_TERCERO"));
result.setFperAporTerceroMonto((BigDecimal)objectData.getData("FPER_APOR_TERCERO_MONTO"));
return result;
}
}
