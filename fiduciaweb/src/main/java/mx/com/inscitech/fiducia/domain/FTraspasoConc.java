package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FTraspasoConc extends DomainObject {

    BigDecimal ftspIdTraspaso = null;
    BigDecimal ftspImporteTraspaso = null;
    BigDecimal fcinIdCtoInversionOrigen = null;
    BigDecimal fcinIdCtoInversionDestino = null;
    String ftspStatus = null;
    BigDecimal ffidIdFideicomiso = null;
    BigDecimal ftspTipoCambioProv = null;
    BigDecimal ftspTipoCambioFirme = null;
    String ftspFecha = null;
    BigDecimal ftspSubctaDestino = null;
    BigDecimal ftspSubctaOrigen = null;

    public FTraspasoConc() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtspIdTraspaso(BigDecimal ftspIdTraspaso) {
        this.ftspIdTraspaso = ftspIdTraspaso;
    }

    public BigDecimal getFtspIdTraspaso() {
        return this.ftspIdTraspaso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFtspImporteTraspaso(BigDecimal ftspImporteTraspaso) {
        this.ftspImporteTraspaso = ftspImporteTraspaso;
    }

    public BigDecimal getFtspImporteTraspaso() {
        return this.ftspImporteTraspaso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setFcinIdCtoInversionOrigen(BigDecimal fcinIdCtoInversionOrigen) {
        this.fcinIdCtoInversionOrigen = fcinIdCtoInversionOrigen;
    }

    public BigDecimal getFcinIdCtoInversionOrigen() {
        return this.fcinIdCtoInversionOrigen;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setFcinIdCtoInversionDestino(BigDecimal fcinIdCtoInversionDestino) {
        this.fcinIdCtoInversionDestino = fcinIdCtoInversionDestino;
    }

    public BigDecimal getFcinIdCtoInversionDestino() {
        return this.fcinIdCtoInversionDestino;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFtspStatus(String ftspStatus) {
        this.ftspStatus = ftspStatus;
    }

    public String getFtspStatus() {
        return this.ftspStatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfidIdFideicomiso(BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return this.ffidIdFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFtspTipoCambioProv(BigDecimal ftspTipoCambioProv) {
        this.ftspTipoCambioProv = ftspTipoCambioProv;
    }

    public BigDecimal getFtspTipoCambioProv() {
        return this.ftspTipoCambioProv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFtspTipoCambioFirme(BigDecimal ftspTipoCambioFirme) {
        this.ftspTipoCambioFirme = ftspTipoCambioFirme;
    }

    public BigDecimal getFtspTipoCambioFirme() {
        return this.ftspTipoCambioFirme;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFtspFecha(String ftspFecha) {
        this.ftspFecha = ftspFecha;
    }

    public String getFtspFecha() {
        return this.ftspFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtspSubctaDestino(BigDecimal ftspSubctaDestino) {
        this.ftspSubctaDestino = ftspSubctaDestino;
    }

    public BigDecimal getFtspSubctaDestino() {
        return this.ftspSubctaDestino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFtspSubctaOrigen(BigDecimal ftspSubctaOrigen) {
        this.ftspSubctaOrigen = ftspSubctaOrigen;
    }

    public BigDecimal getFtspSubctaOrigen() {
        return this.ftspSubctaOrigen;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_TRASPASO_CONC ";

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
        String sql = "SELECT * FROM F_TRASPASO_CONC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFtspIdTraspaso() != null && this.getFtspIdTraspaso().longValue() == -999) {
            conditions += " AND FTSP_ID_TRASPASO IS NULL";
        } else if (this.getFtspIdTraspaso() != null) {
            conditions += " AND FTSP_ID_TRASPASO = ?";
            values.add(this.getFtspIdTraspaso());
        }

        if (this.getFtspImporteTraspaso() != null && this.getFtspImporteTraspaso().longValue() == -999) {
            conditions += " AND FTSP_IMPORTE_TRASPASO IS NULL";
        } else if (this.getFtspImporteTraspaso() != null) {
            conditions += " AND FTSP_IMPORTE_TRASPASO = ?";
            values.add(this.getFtspImporteTraspaso());
        }

        if (this.getFcinIdCtoInversionOrigen() != null && this.getFcinIdCtoInversionOrigen().longValue() == -999) {
            conditions += " AND FCIN_ID_CTO_INVERSION_ORIGEN IS NULL";
        } else if (this.getFcinIdCtoInversionOrigen() != null) {
            conditions += " AND FCIN_ID_CTO_INVERSION_ORIGEN = ?";
            values.add(this.getFcinIdCtoInversionOrigen());
        }

        if (this.getFcinIdCtoInversionDestino() != null && this.getFcinIdCtoInversionDestino().longValue() == -999) {
            conditions += " AND FCIN_ID_CTO_INVERSION_DESTINO IS NULL";
        } else if (this.getFcinIdCtoInversionDestino() != null) {
            conditions += " AND FCIN_ID_CTO_INVERSION_DESTINO = ?";
            values.add(this.getFcinIdCtoInversionDestino());
        }

        if (this.getFtspStatus() != null && "null".equals(this.getFtspStatus())) {
            conditions += " AND FTSP_STATUS IS NULL";
        } else if (this.getFtspStatus() != null) {
            conditions += " AND FTSP_STATUS = ?";
            values.add(this.getFtspStatus());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
        }

        if (this.getFtspTipoCambioProv() != null && this.getFtspTipoCambioProv().longValue() == -999) {
            conditions += " AND FTSP_TIPO_CAMBIO_PROV IS NULL";
        } else if (this.getFtspTipoCambioProv() != null) {
            conditions += " AND FTSP_TIPO_CAMBIO_PROV = ?";
            values.add(this.getFtspTipoCambioProv());
        }

        if (this.getFtspTipoCambioFirme() != null && this.getFtspTipoCambioFirme().longValue() == -999) {
            conditions += " AND FTSP_TIPO_CAMBIO_FIRME IS NULL";
        } else if (this.getFtspTipoCambioFirme() != null) {
            conditions += " AND FTSP_TIPO_CAMBIO_FIRME = ?";
            values.add(this.getFtspTipoCambioFirme());
        }

        if (this.getFtspFecha() != null && "null".equals(this.getFtspFecha())) {
            conditions += " AND FTSP_FECHA IS NULL";
        } else if (this.getFtspFecha() != null) {
            conditions += " AND FTSP_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFtspFecha());
        }

        if (this.getFtspSubctaDestino() != null && this.getFtspSubctaDestino().longValue() == -999) {
            conditions += " AND FTSP_SUBCTA_DESTINO IS NULL";
        } else if (this.getFtspSubctaDestino() != null) {
            conditions += " AND FTSP_SUBCTA_DESTINO = ?";
            values.add(this.getFtspSubctaDestino());
        }

        if (this.getFtspSubctaOrigen() != null && this.getFtspSubctaOrigen().longValue() == -999) {
            conditions += " AND FTSP_SUBCTA_ORIGEN IS NULL";
        } else if (this.getFtspSubctaOrigen() != null) {
            conditions += " AND FTSP_SUBCTA_ORIGEN = ?";
            values.add(this.getFtspSubctaOrigen());
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
        String sql = "UPDATE F_TRASPASO_CONC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FTSP_ID_TRASPASO = ?, ";
        values.add(this.getFtspIdTraspaso());
        fields += " FTSP_IMPORTE_TRASPASO = ?, ";
        values.add(this.getFtspImporteTraspaso());
        fields += " FCIN_ID_CTO_INVERSION_ORIGEN = ?, ";
        values.add(this.getFcinIdCtoInversionOrigen());
        fields += " FCIN_ID_CTO_INVERSION_DESTINO = ?, ";
        values.add(this.getFcinIdCtoInversionDestino());
        fields += " FTSP_STATUS = ?, ";
        values.add(this.getFtspStatus());
        fields += " FFID_ID_FIDEICOMISO = ?, ";
        values.add(this.getFfidIdFideicomiso());
        fields += " FTSP_TIPO_CAMBIO_PROV = ?, ";
        values.add(this.getFtspTipoCambioProv());
        fields += " FTSP_TIPO_CAMBIO_FIRME = ?, ";
        values.add(this.getFtspTipoCambioFirme());
        fields += " FTSP_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFtspFecha());
        fields += " FTSP_SUBCTA_DESTINO = ?, ";
        values.add(this.getFtspSubctaDestino());
        fields += " FTSP_SUBCTA_ORIGEN = ?, ";
        values.add(this.getFtspSubctaOrigen());
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
        String sql = "INSERT INTO F_TRASPASO_CONC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FTSP_ID_TRASPASO";
        fieldValues += ", ?";
        values.add(this.getFtspIdTraspaso());

        fields += ", FTSP_IMPORTE_TRASPASO";
        fieldValues += ", ?";
        values.add(this.getFtspImporteTraspaso());

        fields += ", FCIN_ID_CTO_INVERSION_ORIGEN";
        fieldValues += ", ?";
        values.add(this.getFcinIdCtoInversionOrigen());

        fields += ", FCIN_ID_CTO_INVERSION_DESTINO";
        fieldValues += ", ?";
        values.add(this.getFcinIdCtoInversionDestino());

        fields += ", FTSP_STATUS";
        fieldValues += ", ?";
        values.add(this.getFtspStatus());

        fields += ", FFID_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFfidIdFideicomiso());

        fields += ", FTSP_TIPO_CAMBIO_PROV";
        fieldValues += ", ?";
        values.add(this.getFtspTipoCambioProv());

        fields += ", FTSP_TIPO_CAMBIO_FIRME";
        fieldValues += ", ?";
        values.add(this.getFtspTipoCambioFirme());

        fields += ", FTSP_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFtspFecha());

        fields += ", FTSP_SUBCTA_DESTINO";
        fieldValues += ", ?";
        values.add(this.getFtspSubctaDestino());

        fields += ", FTSP_SUBCTA_ORIGEN";
        fieldValues += ", ?";
        values.add(this.getFtspSubctaOrigen());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_TRASPASO_CONC WHERE ";

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
        FTraspasoConc instance = (FTraspasoConc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFtspIdTraspaso().equals(instance.getFtspIdTraspaso()))
            equalObjects = false;
        if (equalObjects && !this.getFtspImporteTraspaso().equals(instance.getFtspImporteTraspaso()))
            equalObjects = false;
        if (equalObjects && !this.getFcinIdCtoInversionOrigen().equals(instance.getFcinIdCtoInversionOrigen()))
            equalObjects = false;
        if (equalObjects && !this.getFcinIdCtoInversionDestino().equals(instance.getFcinIdCtoInversionDestino()))
            equalObjects = false;
        if (equalObjects && !this.getFtspStatus().equals(instance.getFtspStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFfidIdFideicomiso().equals(instance.getFfidIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFtspTipoCambioProv().equals(instance.getFtspTipoCambioProv()))
            equalObjects = false;
        if (equalObjects && !this.getFtspTipoCambioFirme().equals(instance.getFtspTipoCambioFirme()))
            equalObjects = false;
        if (equalObjects && !this.getFtspFecha().equals(instance.getFtspFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFtspSubctaDestino().equals(instance.getFtspSubctaDestino()))
            equalObjects = false;
        if (equalObjects && !this.getFtspSubctaOrigen().equals(instance.getFtspSubctaOrigen()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FTraspasoConc result = new FTraspasoConc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFtspIdTraspaso((BigDecimal) objectData.getData("FTSP_ID_TRASPASO"));
        result.setFtspImporteTraspaso((BigDecimal) objectData.getData("FTSP_IMPORTE_TRASPASO"));
        result.setFcinIdCtoInversionOrigen((BigDecimal) objectData.getData("FCIN_ID_CTO_INVERSION_ORIGEN"));
        result.setFcinIdCtoInversionDestino((BigDecimal) objectData.getData("FCIN_ID_CTO_INVERSION_DESTINO"));
        result.setFtspStatus((String) objectData.getData("FTSP_STATUS"));
        result.setFfidIdFideicomiso((BigDecimal) objectData.getData("FFID_ID_FIDEICOMISO"));
        result.setFtspTipoCambioProv((BigDecimal) objectData.getData("FTSP_TIPO_CAMBIO_PROV"));
        result.setFtspTipoCambioFirme((BigDecimal) objectData.getData("FTSP_TIPO_CAMBIO_FIRME"));
        result.setFtspFecha((String) objectData.getData("FTSP_FECHA"));
        result.setFtspSubctaDestino((BigDecimal) objectData.getData("FTSP_SUBCTA_DESTINO"));
        result.setFtspSubctaOrigen((BigDecimal) objectData.getData("FTSP_SUBCTA_ORIGEN"));

        return result;

    }

}
