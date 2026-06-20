package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;


public class CsemInsumo extends DomainObject {
    BigDecimal csemNumCis = null;
    String csemNomClienteHogan = null;
    String csemNomClienteHogan2 = null;
    String csemCalleNum = null;
    String csemCalleNumColonia = null;
    String csemColonia = null;
    String csemCpEstado = null;
    String csemPais = null;
    String csemRfc = null;
    String csemFechaNac = null;
    String csemPais2 = null;
    String csemCpEstadoProv = null;
    String csemCalle = null;
    String csemNumExt = null;
    String csemNumInt = null;
    String csemColoniaUrb = null;
    String csemCp = null;
    String csemNomClienteHogan3 = null;
    BigDecimal csemFoliowf = null;

    public CsemInsumo() {
        super();
        this.pkColumns = 8;
    }

    public void setCsemNumCis(BigDecimal csemNumCis) {
        this.csemNumCis = csemNumCis;
    }

    public void setCsemNomClienteHogan(String csemNomClienteHogan) {
        this.csemNomClienteHogan = csemNomClienteHogan;
    }

    public void setCsemNomClienteHogan2(String csemNomClienteHogan2) {
        this.csemNomClienteHogan2 = csemNomClienteHogan2;
    }

    public void setCsemCalleNum(String csemCalleNum) {
        this.csemCalleNum = csemCalleNum;
    }

    public void setCsemCalleNumColonia(String csemCalleNumColonia) {
        this.csemCalleNumColonia = csemCalleNumColonia;
    }

    public void setCsemColonia(String csemColonia) {
        this.csemColonia = csemColonia;
    }

    public void setCsemCpEstado(String csemCpEstado) {
        this.csemCpEstado = csemCpEstado;
    }

    public void setCsemPais(String csemPais) {
        this.csemPais = csemPais;
    }

    public void setCsemRfc(String csemRfc) {
        this.csemRfc = csemRfc;
    }

    public void setCsemFechaNac(String csemFechaNac) {
        this.csemFechaNac = csemFechaNac;
    }

    public void setCsemPais2(String csemPais2) {
        this.csemPais2 = csemPais2;
    }

    public void setCsemCpEstadoProv(String csemCpEstadoProv) {
        this.csemCpEstadoProv = csemCpEstadoProv;
    }

    public void setCsemCalle(String csemCalle) {
        this.csemCalle = csemCalle;
    }

    public void setCsemNumExt(String csemNumExt) {
        this.csemNumExt = csemNumExt;
    }

    public void setCsemNumInt(String csemNumInt) {
        this.csemNumInt = csemNumInt;
    }

    public void setCsemColoniaUrb(String csemColoniaUrb) {
        this.csemColoniaUrb = csemColoniaUrb;
    }

    public void setCsemCp(String csemCp) {
        this.csemCp = csemCp;
    }

    public void setCsemNomClienteHogan3(String csemNomClienteHogan3) {
        this.csemNomClienteHogan3 = csemNomClienteHogan3;
    }

    public void setCsemFoliowf(BigDecimal csemFoliowf) {
        this.csemFoliowf = csemFoliowf;
    }

    public BigDecimal getCsemNumCis() {
        return this.csemNumCis;
    }

    public String getCsemNomClienteHogan() {
        return this.csemNomClienteHogan;
    }

    public String getCsemNomClienteHogan2() {
        return this.csemNomClienteHogan2;
    }

    public String getCsemCalleNum() {
        return this.csemCalleNum;
    }

    public String getCsemCalleNumColonia() {
        return this.csemCalleNumColonia;
    }

    public String getCsemColonia() {
        return this.csemColonia;
    }

    public String getCsemCpEstado() {
        return this.csemCpEstado;
    }

    public String getCsemPais() {
        return this.csemPais;
    }

    public String getCsemRfc() {
        return this.csemRfc;
    }

    public String getCsemFechaNac() {
        return this.csemFechaNac;
    }

    public String getCsemPais2() {
        return this.csemPais2;
    }

    public String getCsemCpEstadoProv() {
        return this.csemCpEstadoProv;
    }

    public String getCsemCalle() {
        return this.csemCalle;
    }

    public String getCsemNumExt() {
        return this.csemNumExt;
    }

    public String getCsemNumInt() {
        return this.csemNumInt;
    }

    public String getCsemColoniaUrb() {
        return this.csemColoniaUrb;
    }

    public String getCsemCp() {
        return this.csemCp;
    }

    public String getCsemNomClienteHogan3() {
        return this.csemNomClienteHogan3;
    }

    public BigDecimal getCsemFoliowf() {
        return this.csemFoliowf;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CSEM_INSUMO";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getCsemNumCis() != null && this.getCsemNumCis().longValue() == -999) {
            conditions += " AND CSEM_NUM_CIS IS NULL";
        } else if (this.getCsemNumCis() != null) {
            conditions += " AND CSEM_NUM_CIS =?";
            values.add(this.getCsemNumCis());
        }
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getSelect() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CSEM_INSUMO ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE CSEM_INSUMO SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND CSEM_NUM_CIS = ?";
        pkValues.add(this.getCsemNumCis());
        fields += " CSEM_NOM_CLIENTE_HOGAN = ?, ";
        values.add(this.getCsemNomClienteHogan());
        fields += " CSEM_NOM_CLIENTE_HOGAN_2 = ?, ";
        values.add(this.getCsemNomClienteHogan2());
        fields += " CSEM_CALLE_NUM = ?, ";
        values.add(this.getCsemCalleNum());
        fields += " CSEM_CALLE_NUM_COLONIA = ?, ";
        values.add(this.getCsemCalleNumColonia());
        fields += " CSEM_COLONIA = ?, ";
        values.add(this.getCsemColonia());
        fields += " CSEM_CP_ESTADO = ?, ";
        values.add(this.getCsemCpEstado());
        fields += " CSEM_PAIS = ?, ";
        values.add(this.getCsemPais());
        fields += " CSEM_RFC = ?, ";
        values.add(this.getCsemRfc());
        fields += " CSEM_FECHA_NAC = ?, ";
        values.add(this.getCsemFechaNac());
        fields += " CSEM_PAIS_2 = ?, ";
        values.add(this.getCsemPais2());
        fields += " CSEM_CP_ESTADO_PROV = ?, ";
        values.add(this.getCsemCpEstadoProv());
        fields += " CSEM_CALLE = ?, ";
        values.add(this.getCsemCalle());
        fields += " CSEM_NUM_EXT = ?, ";
        values.add(this.getCsemNumExt());
        fields += " CSEM_NUM_INT = ?, ";
        values.add(this.getCsemNumInt());
        fields += " CSEM_COLONIA_URB = ?, ";
        values.add(this.getCsemColoniaUrb());
        fields += " CSEM_CP = ?, ";
        values.add(this.getCsemCp());
        fields += " CSEM_NOM_CLIENTE_HOGAN_3 = ?, ";
        values.add(this.getCsemNomClienteHogan3());
        fields += " CSEM_FOLIOWF = ?, ";
        values.add(this.getCsemFoliowf());
        for (int i = 0; i < pkValues.size(); i++) {
            values.add(pkValues.get(i));
        }
        ;
        fields = fields.substring(0, fields.length() - 2).trim();
        conditions = conditions.substring(4).trim();
        sql += fields + " WHERE " + conditions;
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getInsert() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO CSEM_INSUMO ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",CSEM_NUM_CIS ";
        fieldValues += ", ?";
        values.add(this.getCsemNumCis());
        fields += ",CSEM_NOM_CLIENTE_HOGAN ";
        fieldValues += ", ?";
        values.add(this.getCsemNomClienteHogan());
        fields += ",CSEM_NOM_CLIENTE_HOGAN_2 ";
        fieldValues += ", ?";
        values.add(this.getCsemNomClienteHogan2());
        fields += ",CSEM_CALLE_NUM ";
        fieldValues += ", ?";
        values.add(this.getCsemCalleNum());
        fields += ",CSEM_CALLE_NUM_COLONIA ";
        fieldValues += ", ?";
        values.add(this.getCsemCalleNumColonia());
        fields += ",CSEM_COLONIA ";
        fieldValues += ", ?";
        values.add(this.getCsemColonia());
        fields += ",CSEM_CP_ESTADO ";
        fieldValues += ", ?";
        values.add(this.getCsemCpEstado());
        fields += ",CSEM_PAIS ";
        fieldValues += ", ?";
        values.add(this.getCsemPais());
        fields += ",CSEM_RFC ";
        fieldValues += ", ?";
        values.add(this.getCsemRfc());
        fields += ",CSEM_FECHA_NAC ";
        fieldValues += ", ?";
        values.add(this.getCsemFechaNac());
        fields += ",CSEM_PAIS_2 ";
        fieldValues += ", ?";
        values.add(this.getCsemPais2());
        fields += ",CSEM_CP_ESTADO_PROV ";
        fieldValues += ", ?";
        values.add(this.getCsemCpEstadoProv());
        fields += ",CSEM_CALLE ";
        fieldValues += ", ?";
        values.add(this.getCsemCalle());
        fields += ",CSEM_NUM_EXT ";
        fieldValues += ", ?";
        values.add(this.getCsemNumExt());
        fields += ",CSEM_NUM_INT ";
        fieldValues += ", ?";
        values.add(this.getCsemNumInt());
        fields += ",CSEM_COLONIA_URB ";
        fieldValues += ", ?";
        values.add(this.getCsemColoniaUrb());
        fields += ",CSEM_CP ";
        fieldValues += ", ?";
        values.add(this.getCsemCp());
        fields += ",CSEM_NOM_CLIENTE_HOGAN_3 ";
        fieldValues += ", ?";
        values.add(this.getCsemNomClienteHogan3());
        fields += ",CSEM_FOLIOWF ";
        fieldValues += ", ?";
        values.add(this.getCsemFoliowf());
        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();
        sql += fields + " ) VALUES (" + fieldValues + ")";
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CSEM_INSUMO WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND CSEM_NUM_CIS = ?";
        values.add(this.getCsemNumCis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        CsemInsumo instance = (CsemInsumo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCsemNumCis().equals(instance.getCsemNumCis()))
            equalObjects = false;
        if (equalObjects && !this.getCsemNomClienteHogan().equals(instance.getCsemNomClienteHogan()))
            equalObjects = false;
        if (equalObjects && !this.getCsemNomClienteHogan2().equals(instance.getCsemNomClienteHogan2()))
            equalObjects = false;
        if (equalObjects && !this.getCsemCalleNum().equals(instance.getCsemCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getCsemCalleNumColonia().equals(instance.getCsemCalleNumColonia()))
            equalObjects = false;
        if (equalObjects && !this.getCsemColonia().equals(instance.getCsemColonia()))
            equalObjects = false;
        if (equalObjects && !this.getCsemCpEstado().equals(instance.getCsemCpEstado()))
            equalObjects = false;
        if (equalObjects && !this.getCsemPais().equals(instance.getCsemPais()))
            equalObjects = false;
        if (equalObjects && !this.getCsemRfc().equals(instance.getCsemRfc()))
            equalObjects = false;
        if (equalObjects && !this.getCsemFechaNac().equals(instance.getCsemFechaNac()))
            equalObjects = false;
        if (equalObjects && !this.getCsemPais2().equals(instance.getCsemPais2()))
            equalObjects = false;
        if (equalObjects && !this.getCsemCpEstadoProv().equals(instance.getCsemCpEstadoProv()))
            equalObjects = false;
        if (equalObjects && !this.getCsemCalle().equals(instance.getCsemCalle()))
            equalObjects = false;
        if (equalObjects && !this.getCsemNumExt().equals(instance.getCsemNumExt()))
            equalObjects = false;
        if (equalObjects && !this.getCsemNumInt().equals(instance.getCsemNumInt()))
            equalObjects = false;
        if (equalObjects && !this.getCsemColoniaUrb().equals(instance.getCsemColoniaUrb()))
            equalObjects = false;
        if (equalObjects && !this.getCsemCp().equals(instance.getCsemCp()))
            equalObjects = false;
        if (equalObjects && !this.getCsemNomClienteHogan3().equals(instance.getCsemNomClienteHogan3()))
            equalObjects = false;
        if (equalObjects && !this.getCsemFoliowf().equals(instance.getCsemFoliowf()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CsemInsumo result = new CsemInsumo();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setCsemNumCis((BigDecimal) objectData.getData("CSEM_NUM_CIS"));
        result.setCsemNomClienteHogan((String) objectData.getData("CSEM_NOM_CLIENTE_HOGAN"));
        result.setCsemNomClienteHogan2((String) objectData.getData("CSEM_NOM_CLIENTE_HOGAN_2"));
        result.setCsemCalleNum((String) objectData.getData("CSEM_CALLE_NUM"));
        result.setCsemCalleNumColonia((String) objectData.getData("CSEM_CALLE_NUM_COLONIA"));
        result.setCsemColonia((String) objectData.getData("CSEM_COLONIA"));
        result.setCsemCpEstado((String) objectData.getData("CSEM_CP_ESTADO"));
        result.setCsemPais((String) objectData.getData("CSEM_PAIS"));
        result.setCsemRfc((String) objectData.getData("CSEM_RFC"));
        result.setCsemFechaNac((String) objectData.getData("CSEM_FECHA_NAC"));
        result.setCsemPais2((String) objectData.getData("CSEM_PAIS_2"));
        result.setCsemCpEstadoProv((String) objectData.getData("CSEM_CP_ESTADO_PROV"));
        result.setCsemCalle((String) objectData.getData("CSEM_CALLE"));
        result.setCsemNumExt((String) objectData.getData("CSEM_NUM_EXT"));
        result.setCsemNumInt((String) objectData.getData("CSEM_NUM_INT"));
        result.setCsemColoniaUrb((String) objectData.getData("CSEM_COLONIA_URB"));
        result.setCsemCp((String) objectData.getData("CSEM_CP"));
        result.setCsemNomClienteHogan3((String) objectData.getData("CSEM_NOM_CLIENTE_HOGAN_3"));
        result.setCsemFoliowf((BigDecimal) objectData.getData("CSEM_FOLIOWF"));
        return result;
    }
}
