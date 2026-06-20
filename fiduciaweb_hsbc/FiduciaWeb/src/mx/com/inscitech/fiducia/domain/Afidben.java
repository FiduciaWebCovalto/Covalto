package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AFIDBEN_PK", columns = { "AFB_CVE_PERSONA", "AFB_NUM_FIDBEN", "AFB_ANTEPROYECTO" }, sequences = { "MANUAL" })
public class Afidben extends DomainObject {

    String afbCis =null;
    String afbNumOper =null;
    String afbCveStFidBen =null;
    String afbCalleNum =null;
    String afbNomColonia =null;
    String afbNomPoblacion =null;
    BigDecimal afbCodigoPostal =null;
    BigDecimal afbNumEstado =null;
    String afbNomEstado =null;
    BigDecimal afbNumPais =null;
    String afbNomPais =null;
    String afbCurp =null;
    String afbTipoPersona =null;
    String afbNomMunicipio =null;
    BigDecimal afbFolioWf =null;
    BigDecimal afbFolioWfPld =null;
    BigDecimal afbClifrec =null;
    String afbFechaAlta =null;
    String afbFechaModif =null;
    BigDecimal afbAnteproyecto =null;
    String afbCvePersona =null;
    BigDecimal afbNumFidben =null;
    String afbNomFidben =null;
    String afbTelFidben =null;
    public Afidben() {
    super();
    this.pkColumns = 8;
    }
    public void setAfbCis (String afbCis) {
    this.afbCis=afbCis;
    }
    public void setAfbNumOper (String afbNumOper) {
    this.afbNumOper=afbNumOper;
    }
    public void setAfbCveStFidBen (String afbCveStFidBen) {
    this.afbCveStFidBen=afbCveStFidBen;
    }
    public void setAfbCalleNum (String afbCalleNum) {
    this.afbCalleNum=afbCalleNum;
    }
    public void setAfbNomColonia (String afbNomColonia) {
    this.afbNomColonia=afbNomColonia;
    }
    public void setAfbNomPoblacion (String afbNomPoblacion) {
    this.afbNomPoblacion=afbNomPoblacion;
    }
    public void setAfbCodigoPostal (BigDecimal afbCodigoPostal) {
    this.afbCodigoPostal=afbCodigoPostal;
    }
    public void setAfbNumEstado (BigDecimal afbNumEstado) {
    this.afbNumEstado=afbNumEstado;
    }
    public void setAfbNomEstado (String afbNomEstado) {
    this.afbNomEstado=afbNomEstado;
    }
    public void setAfbNumPais (BigDecimal afbNumPais) {
    this.afbNumPais=afbNumPais;
    }
    public void setAfbNomPais (String afbNomPais) {
    this.afbNomPais=afbNomPais;
    }
    public void setAfbCurp (String afbCurp) {
    this.afbCurp=afbCurp;
    }
    public void setAfbTipoPersona (String afbTipoPersona) {
    this.afbTipoPersona=afbTipoPersona;
    }
    public void setAfbNomMunicipio (String afbNomMunicipio) {
    this.afbNomMunicipio=afbNomMunicipio;
    }
    public void setAfbFolioWf (BigDecimal afbFolioWf) {
    this.afbFolioWf=afbFolioWf;
    }
    public void setAfbFolioWfPld (BigDecimal afbFolioWfPld) {
    this.afbFolioWfPld=afbFolioWfPld;
    }
    public void setAfbClifrec (BigDecimal afbClifrec) {
    this.afbClifrec=afbClifrec;
    }
    public void setAfbFechaAlta (String afbFechaAlta) {
    this.afbFechaAlta=afbFechaAlta;
    }
    public void setAfbFechaModif (String afbFechaModif) {
    this.afbFechaModif=afbFechaModif;
    }
    public void setAfbAnteproyecto (BigDecimal afbAnteproyecto) {
    this.afbAnteproyecto=afbAnteproyecto;
    }
    public void setAfbCvePersona (String afbCvePersona) {
    this.afbCvePersona=afbCvePersona;
    }
    public void setAfbNumFidben (BigDecimal afbNumFidben) {
    this.afbNumFidben=afbNumFidben;
    }
    public void setAfbNomFidben (String afbNomFidben) {
    this.afbNomFidben=afbNomFidben;
    }
    public void setAfbTelFidben (String afbTelFidben) {
    this.afbTelFidben=afbTelFidben;
    }
    public String getAfbCis() {
    return this.afbCis;
    }
    public String getAfbNumOper() {
    return this.afbNumOper;
    }
    public String getAfbCveStFidBen() {
    return this.afbCveStFidBen;
    }
    public String getAfbCalleNum() {
    return this.afbCalleNum;
    }
    public String getAfbNomColonia() {
    return this.afbNomColonia;
    }
    public String getAfbNomPoblacion() {
    return this.afbNomPoblacion;
    }
    public BigDecimal getAfbCodigoPostal() {
    return this.afbCodigoPostal;
    }
    public BigDecimal getAfbNumEstado() {
    return this.afbNumEstado;
    }
    public String getAfbNomEstado() {
    return this.afbNomEstado;
    }
    public BigDecimal getAfbNumPais() {
    return this.afbNumPais;
    }
    public String getAfbNomPais() {
    return this.afbNomPais;
    }
    public String getAfbCurp() {
    return this.afbCurp;
    }
    public String getAfbTipoPersona() {
    return this.afbTipoPersona;
    }
    public String getAfbNomMunicipio() {
    return this.afbNomMunicipio;
    }
    public BigDecimal getAfbFolioWf() {
    return this.afbFolioWf;
    }
    public BigDecimal getAfbFolioWfPld() {
    return this.afbFolioWfPld;
    }
    public BigDecimal getAfbClifrec() {
    return this.afbClifrec;
    }
    public String getAfbFechaAlta() {
    return this.afbFechaAlta;
    }
    public String getAfbFechaModif() {
    return this.afbFechaModif;
    }
    public BigDecimal getAfbAnteproyecto() {
    return this.afbAnteproyecto;
    }
    public String getAfbCvePersona() {
    return this.afbCvePersona;
    }
    public BigDecimal getAfbNumFidben() {
    return this.afbNumFidben;
    }
    public String getAfbNomFidben() {
    return this.afbNomFidben;
    }
    public String getAfbTelFidben() {
    return this.afbTelFidben;
    }
      public DMLObject getSelectByPK() {
      if(!retrieveSQL) return null;
      DMLObject result = new DMLObject();
      String sql = "SELECT * FROM AFIDBEN ";
      String conditions = "";
      ArrayList values = new ArrayList();
    if(this.getAfbAnteproyecto() != null && this.getAfbAnteproyecto().longValue() == -999) {
    conditions += " AND AFB_ANTEPROYECTO IS NULL";
    } else if(this.getAfbAnteproyecto() != null) {
    conditions += " AND AFB_ANTEPROYECTO =?";
    values.add(this.getAfbAnteproyecto());
    }
    if(this.getAfbCvePersona() != null && "null".equals(this.getAfbCvePersona())) {
    conditions += " AND AFB_CVE_PERSONA IS NULL";
    } else if(this.getAfbCvePersona() != null) {
    conditions += " AND AFB_CVE_PERSONA =?";
    values.add(this.getAfbCvePersona());
    }
    if(this.getAfbNumFidben() != null && this.getAfbNumFidben().longValue() == -999) {
    conditions += " AND AFB_NUM_FIDBEN IS NULL";
    } else if(this.getAfbNumFidben() != null) {
    conditions += " AND AFB_NUM_FIDBEN =?";
    values.add(this.getAfbNumFidben());
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
    String sql = "SELECT * FROM AFIDBEN ";
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
    String sql = "UPDATE AFIDBEN SET ";
    String fields = "";
    String conditions = "";
    ArrayList pkValues = new ArrayList();
    ArrayList values = new ArrayList();
    fields += " AFB_CIS = ?, ";
    values.add(this.getAfbCis());
    fields += " AFB_NUM_OPER = ?, ";
    values.add(this.getAfbNumOper());
    fields += " AFB_CVE_ST_FID_BEN = ?, ";
    values.add(this.getAfbCveStFidBen());
    fields += " AFB_CALLE_NUM = ?, ";
    values.add(this.getAfbCalleNum());
    fields += " AFB_NOM_COLONIA = ?, ";
    values.add(this.getAfbNomColonia());
    fields += " AFB_NOM_POBLACION = ?, ";
    values.add(this.getAfbNomPoblacion());
    fields += " AFB_CODIGO_POSTAL = ?, ";
    values.add(this.getAfbCodigoPostal());
    fields += " AFB_NUM_ESTADO = ?, ";
    values.add(this.getAfbNumEstado());
    fields += " AFB_NOM_ESTADO = ?, ";
    values.add(this.getAfbNomEstado());
    fields += " AFB_NUM_PAIS = ?, ";
    values.add(this.getAfbNumPais());
    fields += " AFB_NOM_PAIS = ?, ";
    values.add(this.getAfbNomPais());
    fields += " AFB_CURP = ?, ";
    values.add(this.getAfbCurp());
    fields += " AFB_TIPO_PERSONA = ?, ";
    values.add(this.getAfbTipoPersona());
    fields += " AFB_NOM_MUNICIPIO = ?, ";
    values.add(this.getAfbNomMunicipio());
    fields += " AFB_FOLIO_WF = ?, ";
    values.add(this.getAfbFolioWf());
    fields += " AFB_FOLIO_WF_PLD = ?, ";
    values.add(this.getAfbFolioWfPld());
    fields += " AFB_CLIFREC = ?, ";
    values.add(this.getAfbClifrec());
    fields += " AFB_FECHA_ALTA = ?, ";
    values.add(this.getAfbFechaAlta());
    fields += " AFB_FECHA_MODIF = ?, ";
    values.add(this.getAfbFechaModif());
    conditions += " AND AFB_ANTEPROYECTO = ?";
    pkValues.add(this.getAfbAnteproyecto());
    conditions += " AND AFB_CVE_PERSONA = ?";
    pkValues.add(this.getAfbCvePersona());
    conditions += " AND AFB_NUM_FIDBEN = ?";
    pkValues.add(this.getAfbNumFidben());
    fields += " AFB_NOM_FIDBEN = ?, ";
    values.add(this.getAfbNomFidben());
    fields += " AFB_TEL_FIDBEN = ?, ";
    values.add(this.getAfbTelFidben());
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
    String sql = "INSERT INTO AFIDBEN ( ";
    String fields = "";
    String fieldValues = "";
    ArrayList values = new ArrayList();
    fields += ",AFB_CIS ";
    fieldValues += ", ?";
    values.add(this.getAfbCis());
    fields += ",AFB_NUM_OPER ";
    fieldValues += ", ?";
    values.add(this.getAfbNumOper());
    fields += ",AFB_CVE_ST_FID_BEN ";
    fieldValues += ", ?";
    values.add(this.getAfbCveStFidBen());
    fields += ",AFB_CALLE_NUM ";
    fieldValues += ", ?";
    values.add(this.getAfbCalleNum());
    fields += ",AFB_NOM_COLONIA ";
    fieldValues += ", ?";
    values.add(this.getAfbNomColonia());
    fields += ",AFB_NOM_POBLACION ";
    fieldValues += ", ?";
    values.add(this.getAfbNomPoblacion());
    fields += ",AFB_CODIGO_POSTAL ";
    fieldValues += ", ?";
    values.add(this.getAfbCodigoPostal());
    fields += ",AFB_NUM_ESTADO ";
    fieldValues += ", ?";
    values.add(this.getAfbNumEstado());
    fields += ",AFB_NOM_ESTADO ";
    fieldValues += ", ?";
    values.add(this.getAfbNomEstado());
    fields += ",AFB_NUM_PAIS ";
    fieldValues += ", ?";
    values.add(this.getAfbNumPais());
    fields += ",AFB_NOM_PAIS ";
    fieldValues += ", ?";
    values.add(this.getAfbNomPais());
    fields += ",AFB_CURP ";
    fieldValues += ", ?";
    values.add(this.getAfbCurp());
    fields += ",AFB_TIPO_PERSONA ";
    fieldValues += ", ?";
    values.add(this.getAfbTipoPersona());
    fields += ",AFB_NOM_MUNICIPIO ";
    fieldValues += ", ?";
    values.add(this.getAfbNomMunicipio());
    fields += ",AFB_FOLIO_WF ";
    fieldValues += ", ?";
    values.add(this.getAfbFolioWf());
    fields += ",AFB_FOLIO_WF_PLD ";
    fieldValues += ", ?";
    values.add(this.getAfbFolioWfPld());
    fields += ",AFB_CLIFREC ";
    fieldValues += ", ?";
    values.add(this.getAfbClifrec());
    fields += ",AFB_FECHA_ALTA ";
    fieldValues += ", ?";
    values.add(this.getAfbFechaAlta());
    fields += ",AFB_FECHA_MODIF ";
    fieldValues += ", ?";
    values.add(this.getAfbFechaModif());
    fields += ",AFB_ANTEPROYECTO ";
    fieldValues += ", ?";
    values.add(this.getAfbAnteproyecto());
    fields += ",AFB_CVE_PERSONA ";
    fieldValues += ", ?";
    values.add(this.getAfbCvePersona());
    fields += ",AFB_NUM_FIDBEN ";
    fieldValues += ", ?";
    values.add(this.getAfbNumFidben());
    fields += ",AFB_NOM_FIDBEN ";
    fieldValues += ", ?";
    values.add(this.getAfbNomFidben());
    fields += ",AFB_TEL_FIDBEN ";
    fieldValues += ", ?";
    values.add(this.getAfbTelFidben());
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
    String sql = "DELETE FROM AFIDBEN WHERE ";
    String conditions = "";
    ArrayList values = new ArrayList();
    conditions += " AND AFB_ANTEPROYECTO = ?";
    values.add(this.getAfbAnteproyecto());
    conditions += " AND AFB_CVE_PERSONA = ?";
    values.add(this.getAfbCvePersona());
    conditions += " AND AFB_NUM_FIDBEN = ?";
    values.add(this.getAfbNumFidben());
    conditions = conditions.substring(4).trim();
    result.setSql(sql + conditions);
    result.setParameters(values.toArray());
    return result;
    }
    public boolean validate() {
    return true;  }
    public boolean doCompare(Object compareWith) {
    Afidben instance = (Afidben)compareWith;
    boolean equalObjects = true;
    if(equalObjects && !this.getAfbCis().equals(instance.getAfbCis())) equalObjects = false;
    if(equalObjects && !this.getAfbNumOper().equals(instance.getAfbNumOper())) equalObjects = false;
    if(equalObjects && !this.getAfbCveStFidBen().equals(instance.getAfbCveStFidBen())) equalObjects = false;
    if(equalObjects && !this.getAfbCalleNum().equals(instance.getAfbCalleNum())) equalObjects = false;
    if(equalObjects && !this.getAfbNomColonia().equals(instance.getAfbNomColonia())) equalObjects = false;
    if(equalObjects && !this.getAfbNomPoblacion().equals(instance.getAfbNomPoblacion())) equalObjects = false;
    if(equalObjects && !this.getAfbCodigoPostal().equals(instance.getAfbCodigoPostal())) equalObjects = false;
    if(equalObjects && !this.getAfbNumEstado().equals(instance.getAfbNumEstado())) equalObjects = false;
    if(equalObjects && !this.getAfbNomEstado().equals(instance.getAfbNomEstado())) equalObjects = false;
    if(equalObjects && !this.getAfbNumPais().equals(instance.getAfbNumPais())) equalObjects = false;
    if(equalObjects && !this.getAfbNomPais().equals(instance.getAfbNomPais())) equalObjects = false;
    if(equalObjects && !this.getAfbCurp().equals(instance.getAfbCurp())) equalObjects = false;
    if(equalObjects && !this.getAfbTipoPersona().equals(instance.getAfbTipoPersona())) equalObjects = false;
    if(equalObjects && !this.getAfbNomMunicipio().equals(instance.getAfbNomMunicipio())) equalObjects = false;
    if(equalObjects && !this.getAfbFolioWf().equals(instance.getAfbFolioWf())) equalObjects = false;
    if(equalObjects && !this.getAfbFolioWfPld().equals(instance.getAfbFolioWfPld())) equalObjects = false;
    if(equalObjects && !this.getAfbClifrec().equals(instance.getAfbClifrec())) equalObjects = false;
    if(equalObjects && !this.getAfbFechaAlta().equals(instance.getAfbFechaAlta())) equalObjects = false;
    if(equalObjects && !this.getAfbFechaModif().equals(instance.getAfbFechaModif())) equalObjects = false;
    if(equalObjects && !this.getAfbAnteproyecto().equals(instance.getAfbAnteproyecto())) equalObjects = false;
    if(equalObjects && !this.getAfbCvePersona().equals(instance.getAfbCvePersona())) equalObjects = false;
    if(equalObjects && !this.getAfbNumFidben().equals(instance.getAfbNumFidben())) equalObjects = false;
    if(equalObjects && !this.getAfbNomFidben().equals(instance.getAfbNomFidben())) equalObjects = false;
    if(equalObjects && !this.getAfbTelFidben().equals(instance.getAfbTelFidben())) equalObjects = false;
    return equalObjects;
    }
    public Object selectAsObject() {
    Afidben result = new Afidben();
     DataRow objectData = null;
     objectData = selectAsDataRow();
    result.setAfbCis((String)objectData.getData("AFB_CIS"));
    result.setAfbNumOper((String)objectData.getData("AFB_NUM_OPER"));
    result.setAfbCveStFidBen((String)objectData.getData("AFB_CVE_ST_FID_BEN"));
    result.setAfbCalleNum((String)objectData.getData("AFB_CALLE_NUM"));
    result.setAfbNomColonia((String)objectData.getData("AFB_NOM_COLONIA"));
    result.setAfbNomPoblacion((String)objectData.getData("AFB_NOM_POBLACION"));
    result.setAfbCodigoPostal((BigDecimal)objectData.getData("AFB_CODIGO_POSTAL"));
    result.setAfbNumEstado((BigDecimal)objectData.getData("AFB_NUM_ESTADO"));
    result.setAfbNomEstado((String)objectData.getData("AFB_NOM_ESTADO"));
    result.setAfbNumPais((BigDecimal)objectData.getData("AFB_NUM_PAIS"));
    result.setAfbNomPais((String)objectData.getData("AFB_NOM_PAIS"));
    result.setAfbCurp((String)objectData.getData("AFB_CURP"));
    result.setAfbTipoPersona((String)objectData.getData("AFB_TIPO_PERSONA"));
    result.setAfbNomMunicipio((String)objectData.getData("AFB_NOM_MUNICIPIO"));
    result.setAfbFolioWf((BigDecimal)objectData.getData("AFB_FOLIO_WF"));
    result.setAfbFolioWfPld((BigDecimal)objectData.getData("AFB_FOLIO_WF_PLD"));
    result.setAfbClifrec((BigDecimal)objectData.getData("AFB_CLIFREC"));
    result.setAfbFechaAlta((String)objectData.getData("AFB_FECHA_ALTA"));
    result.setAfbFechaModif((String)objectData.getData("AFB_FECHA_MODIF"));
    result.setAfbAnteproyecto((BigDecimal)objectData.getData("AFB_ANTEPROYECTO"));
    result.setAfbCvePersona((String)objectData.getData("AFB_CVE_PERSONA"));
    result.setAfbNumFidben((BigDecimal)objectData.getData("AFB_NUM_FIDBEN"));
    result.setAfbNomFidben((String)objectData.getData("AFB_NOM_FIDBEN"));
    result.setAfbTelFidben((String)objectData.getData("AFB_TEL_FIDBEN"));
    return result;
    }

}
