package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FidFoliosBitacora extends DomainObject {

    String currentUser = null;
    String osUser = null;
    String sessionUser = null;
    String anguage = null;
    String ipAddress = null;
    String networkProtocol = null;
    String erminal = null;
    String sysDate = null;
    BigDecimal folioActual = null;
    BigDecimal folioNuevo = null;
    BigDecimal tipoFolio = null;

    public FidFoliosBitacora() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getCurrentUser() {
        return this.currentUser;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOsUser(String osUser) {
        this.osUser = osUser;
    }

    public String getOsUser() {
        return this.osUser;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSessionUser(String sessionUser) {
        this.sessionUser = sessionUser;
    }

    public String getSessionUser() {
        return this.sessionUser;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLanguage(String anguage) {
        this.anguage = anguage;
    }

    public String getLanguage() {
        return this.anguage;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNetworkProtocol(String networkProtocol) {
        this.networkProtocol = networkProtocol;
    }

    public String getNetworkProtocol() {
        return this.networkProtocol;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerminal(String erminal) {
        this.erminal = erminal;
    }

    public String getTerminal() {
        return this.erminal;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getSysDate() {
        return this.sysDate;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFolioActual(BigDecimal folioActual) {
        this.folioActual = folioActual;
    }

    public BigDecimal getFolioActual() {
        return this.folioActual;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFolioNuevo(BigDecimal folioNuevo) {
        this.folioNuevo = folioNuevo;
    }

    public BigDecimal getFolioNuevo() {
        return this.folioNuevo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTipoFolio(BigDecimal tipoFolio) {
        this.tipoFolio = tipoFolio;
    }

    public BigDecimal getTipoFolio() {
        return this.tipoFolio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_FOLIOS_BITACORA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getSelect() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_FOLIOS_BITACORA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCurrentUser() != null && "null".equals(this.getCurrentUser())) {
            conditions += " AND CURRENT_USER IS NULL";
        } else if (this.getCurrentUser() != null) {
            conditions += " AND CURRENT_USER = ?";
            values.add(this.getCurrentUser());
        }

        if (this.getOsUser() != null && "null".equals(this.getOsUser())) {
            conditions += " AND OS_USER IS NULL";
        } else if (this.getOsUser() != null) {
            conditions += " AND OS_USER = ?";
            values.add(this.getOsUser());
        }

        if (this.getSessionUser() != null && "null".equals(this.getSessionUser())) {
            conditions += " AND SESSION_USER IS NULL";
        } else if (this.getSessionUser() != null) {
            conditions += " AND SESSION_USER = ?";
            values.add(this.getSessionUser());
        }

        if (this.getLanguage() != null && "null".equals(this.getLanguage())) {
            conditions += " AND LANGUAGE IS NULL";
        } else if (this.getLanguage() != null) {
            conditions += " AND LANGUAGE = ?";
            values.add(this.getLanguage());
        }

        if (this.getIpAddress() != null && "null".equals(this.getIpAddress())) {
            conditions += " AND IP_ADDRESS IS NULL";
        } else if (this.getIpAddress() != null) {
            conditions += " AND IP_ADDRESS = ?";
            values.add(this.getIpAddress());
        }

        if (this.getNetworkProtocol() != null && "null".equals(this.getNetworkProtocol())) {
            conditions += " AND NETWORK_PROTOCOL IS NULL";
        } else if (this.getNetworkProtocol() != null) {
            conditions += " AND NETWORK_PROTOCOL = ?";
            values.add(this.getNetworkProtocol());
        }

        if (this.getTerminal() != null && "null".equals(this.getTerminal())) {
            conditions += " AND TERMINAL IS NULL";
        } else if (this.getTerminal() != null) {
            conditions += " AND TERMINAL = ?";
            values.add(this.getTerminal());
        }

        if (this.getSysDate() != null && "null".equals(this.getSysDate())) {
            conditions += " AND SYS_DATE IS NULL";
        } else if (this.getSysDate() != null) {
            conditions += " AND SYS_DATE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSysDate());
        }

        if (this.getFolioActual() != null && this.getFolioActual().longValue() == -999) {
            conditions += " AND FOLIO_ACTUAL IS NULL";
        } else if (this.getFolioActual() != null) {
            conditions += " AND FOLIO_ACTUAL = ?";
            values.add(this.getFolioActual());
        }

        if (this.getFolioNuevo() != null && this.getFolioNuevo().longValue() == -999) {
            conditions += " AND FOLIO_NUEVO IS NULL";
        } else if (this.getFolioNuevo() != null) {
            conditions += " AND FOLIO_NUEVO = ?";
            values.add(this.getFolioNuevo());
        }

        if (this.getTipoFolio() != null && this.getTipoFolio().longValue() == -999) {
            conditions += " AND TIPO_FOLIO IS NULL";
        } else if (this.getTipoFolio() != null) {
            conditions += " AND TIPO_FOLIO = ?";
            values.add(this.getTipoFolio());
        }

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getUpdate() {
        DMLObject result = new DMLObject();
        String sql = "UPDATE FID_FOLIOS_BITACORA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " CURRENT_USER = ?, ";
        values.add(this.getCurrentUser());
        fields += " OS_USER = ?, ";
        values.add(this.getOsUser());
        fields += " SESSION_USER = ?, ";
        values.add(this.getSessionUser());
        fields += " LANGUAGE = ?, ";
        values.add(this.getLanguage());
        fields += " IP_ADDRESS = ?, ";
        values.add(this.getIpAddress());
        fields += " NETWORK_PROTOCOL = ?, ";
        values.add(this.getNetworkProtocol());
        fields += " TERMINAL = ?, ";
        values.add(this.getTerminal());
        fields += " SYS_DATE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getSysDate());
        fields += " FOLIO_ACTUAL = ?, ";
        values.add(this.getFolioActual());
        fields += " FOLIO_NUEVO = ?, ";
        values.add(this.getFolioNuevo());
        fields += " TIPO_FOLIO = ?, ";
        values.add(this.getTipoFolio());
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
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO FID_FOLIOS_BITACORA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CURRENT_USER";
        fieldValues += ", ?";
        values.add(this.getCurrentUser());

        fields += ", OS_USER";
        fieldValues += ", ?";
        values.add(this.getOsUser());

        fields += ", SESSION_USER";
        fieldValues += ", ?";
        values.add(this.getSessionUser());

        fields += ", LANGUAGE";
        fieldValues += ", ?";
        values.add(this.getLanguage());

        fields += ", IP_ADDRESS";
        fieldValues += ", ?";
        values.add(this.getIpAddress());

        fields += ", NETWORK_PROTOCOL";
        fieldValues += ", ?";
        values.add(this.getNetworkProtocol());

        fields += ", TERMINAL";
        fieldValues += ", ?";
        values.add(this.getTerminal());

        fields += ", SYS_DATE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSysDate());

        fields += ", FOLIO_ACTUAL";
        fieldValues += ", ?";
        values.add(this.getFolioActual());

        fields += ", FOLIO_NUEVO";
        fieldValues += ", ?";
        values.add(this.getFolioNuevo());

        fields += ", TIPO_FOLIO";
        fieldValues += ", ?";
        values.add(this.getTipoFolio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_FOLIOS_BITACORA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidFoliosBitacora instance = (FidFoliosBitacora) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCurrentUser().equals(instance.getCurrentUser()))
            equalObjects = false;
        if (equalObjects && !this.getOsUser().equals(instance.getOsUser()))
            equalObjects = false;
        if (equalObjects && !this.getSessionUser().equals(instance.getSessionUser()))
            equalObjects = false;
        if (equalObjects && !this.getLanguage().equals(instance.getLanguage()))
            equalObjects = false;
        if (equalObjects && !this.getIpAddress().equals(instance.getIpAddress()))
            equalObjects = false;
        if (equalObjects && !this.getNetworkProtocol().equals(instance.getNetworkProtocol()))
            equalObjects = false;
        if (equalObjects && !this.getTerminal().equals(instance.getTerminal()))
            equalObjects = false;
        if (equalObjects && !this.getSysDate().equals(instance.getSysDate()))
            equalObjects = false;
        if (equalObjects && !this.getFolioActual().equals(instance.getFolioActual()))
            equalObjects = false;
        if (equalObjects && !this.getFolioNuevo().equals(instance.getFolioNuevo()))
            equalObjects = false;
        if (equalObjects && !this.getTipoFolio().equals(instance.getTipoFolio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidFoliosBitacora result = new FidFoliosBitacora();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCurrentUser((String) objectData.getData("CURRENT_USER"));
        result.setOsUser((String) objectData.getData("OS_USER"));
        result.setSessionUser((String) objectData.getData("SESSION_USER"));
        result.setLanguage((String) objectData.getData("LANGUAGE"));
        result.setIpAddress((String) objectData.getData("IP_ADDRESS"));
        result.setNetworkProtocol((String) objectData.getData("NETWORK_PROTOCOL"));
        result.setTerminal((String) objectData.getData("TERMINAL"));
        result.setSysDate((String) objectData.getData("SYS_DATE"));
        result.setFolioActual((BigDecimal) objectData.getData("FOLIO_ACTUAL"));
        result.setFolioNuevo((BigDecimal) objectData.getData("FOLIO_NUEVO"));
        result.setTipoFolio((BigDecimal) objectData.getData("TIPO_FOLIO"));

        return result;

    }

}
