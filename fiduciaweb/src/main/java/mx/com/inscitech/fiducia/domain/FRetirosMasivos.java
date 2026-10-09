package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_RETIROS_MASIVOS_PK", columns = { "FRMA_FOLIO", "FRMA_SECUENCIAL" }, sequences = { "MANUAL" })
public class FRetirosMasivos extends DomainObject {

    BigDecimal frmaFolio = null;
    BigDecimal frmaFolioDef = null;
    BigDecimal frmaFolioInd = null;
    BigDecimal frmaSecuencial = null;
    String frmaBeneficiario = null;
    String frmaRfc = null;
    String frmaCuenta = null;
    BigDecimal frmaImporte = null;
    BigDecimal frmaSubcto = null;
    BigDecimal frmaTipoPersona = null;
    BigDecimal frmaNumPersona = null;
    BigDecimal frmaNumGarantia = null;
    BigDecimal frmaNumBienGar = null;
    BigDecimal frmaAfectaGarantia = null;

    public FRetirosMasivos() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaFolio(BigDecimal frmaFolio) {
        this.frmaFolio = frmaFolio;
    }

    public BigDecimal getFrmaFolio() {
        return this.frmaFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaFolioDef(BigDecimal frmaFolioDef) {
        this.frmaFolioDef = frmaFolioDef;
    }

    public BigDecimal getFrmaFolioDef() {
        return this.frmaFolioDef;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaFolioInd(BigDecimal frmaFolioInd) {
        this.frmaFolioInd = frmaFolioInd;
    }

    public BigDecimal getFrmaFolioInd() {
        return this.frmaFolioInd;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaSecuencial(BigDecimal frmaSecuencial) {
        this.frmaSecuencial = frmaSecuencial;
    }

    public BigDecimal getFrmaSecuencial() {
        return this.frmaSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrmaBeneficiario(String frmaBeneficiario) {
        this.frmaBeneficiario = frmaBeneficiario;
    }

    public String getFrmaBeneficiario() {
        return this.frmaBeneficiario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrmaRfc(String frmaRfc) {
        this.frmaRfc = frmaRfc;
    }

    public String getFrmaRfc() {
        return this.frmaRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrmaCuenta(String frmaCuenta) {
        this.frmaCuenta = frmaCuenta;
    }

    public String getFrmaCuenta() {
        return this.frmaCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFrmaImporte(BigDecimal frmaImporte) {
        this.frmaImporte = frmaImporte;
    }

    public BigDecimal getFrmaImporte() {
        return this.frmaImporte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaSubcto(BigDecimal frmaSubcto) {
        this.frmaSubcto = frmaSubcto;
    }

    public BigDecimal getFrmaSubcto() {
        return this.frmaSubcto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaTipoPersona(BigDecimal frmaTipoPersona) {
        this.frmaTipoPersona = frmaTipoPersona;
    }

    public BigDecimal getFrmaTipoPersona() {
        return this.frmaTipoPersona;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaNumPersona(BigDecimal frmaNumPersona) {
        this.frmaNumPersona = frmaNumPersona;
    }

    public BigDecimal getFrmaNumPersona() {
        return this.frmaNumPersona;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaNumGarantia(BigDecimal frmaNumGarantia) {
        this.frmaNumGarantia = frmaNumGarantia;
    }

    public BigDecimal getFrmaNumGarantia() {
        return this.frmaNumGarantia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaNumBienGar(BigDecimal frmaNumBienGar) {
        this.frmaNumBienGar = frmaNumBienGar;
    }

    public BigDecimal getFrmaNumBienGar() {
        return this.frmaNumBienGar;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaAfectaGarantia(BigDecimal frmaAfectaGarantia) {
        this.frmaAfectaGarantia = frmaAfectaGarantia;
    }

    public BigDecimal getFrmaAfectaGarantia() {
        return this.frmaAfectaGarantia;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_RETIROS_MASIVOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrmaFolio() != null && this.getFrmaFolio().longValue() == -999) {
            conditions += " AND FRMA_FOLIO IS NULL";
        } else if (this.getFrmaFolio() != null) {
            conditions += " AND FRMA_FOLIO = ?";
            values.add(this.getFrmaFolio());
        }

        if (this.getFrmaSecuencial() != null && this.getFrmaSecuencial().longValue() == -999) {
            conditions += " AND FRMA_SECUENCIAL IS NULL";
        } else if (this.getFrmaSecuencial() != null) {
            conditions += " AND FRMA_SECUENCIAL = ?";
            values.add(this.getFrmaSecuencial());
        }

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
        String sql = "SELECT * FROM F_RETIROS_MASIVOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrmaFolio() != null && this.getFrmaFolio().longValue() == -999) {
            conditions += " AND FRMA_FOLIO IS NULL";
        } else if (this.getFrmaFolio() != null) {
            conditions += " AND FRMA_FOLIO = ?";
            values.add(this.getFrmaFolio());
        }

        if (this.getFrmaFolioDef() != null && this.getFrmaFolioDef().longValue() == -999) {
            conditions += " AND FRMA_FOLIO_DEF IS NULL";
        } else if (this.getFrmaFolioDef() != null) {
            conditions += " AND FRMA_FOLIO_DEF = ?";
            values.add(this.getFrmaFolioDef());
        }

        if (this.getFrmaFolioInd() != null && this.getFrmaFolioInd().longValue() == -999) {
            conditions += " AND FRMA_FOLIO_IND IS NULL";
        } else if (this.getFrmaFolioInd() != null) {
            conditions += " AND FRMA_FOLIO_IND = ?";
            values.add(this.getFrmaFolioInd());
        }

        if (this.getFrmaSecuencial() != null && this.getFrmaSecuencial().longValue() == -999) {
            conditions += " AND FRMA_SECUENCIAL IS NULL";
        } else if (this.getFrmaSecuencial() != null) {
            conditions += " AND FRMA_SECUENCIAL = ?";
            values.add(this.getFrmaSecuencial());
        }

        if (this.getFrmaBeneficiario() != null && "null".equals(this.getFrmaBeneficiario())) {
            conditions += " AND FRMA_BENEFICIARIO IS NULL";
        } else if (this.getFrmaBeneficiario() != null) {
            conditions += " AND FRMA_BENEFICIARIO = ?";
            values.add(this.getFrmaBeneficiario());
        }

        if (this.getFrmaRfc() != null && "null".equals(this.getFrmaRfc())) {
            conditions += " AND FRMA_RFC IS NULL";
        } else if (this.getFrmaRfc() != null) {
            conditions += " AND FRMA_RFC = ?";
            values.add(this.getFrmaRfc());
        }

        if (this.getFrmaCuenta() != null && "null".equals(this.getFrmaCuenta())) {
            conditions += " AND FRMA_CUENTA IS NULL";
        } else if (this.getFrmaCuenta() != null) {
            conditions += " AND FRMA_CUENTA = ?";
            values.add(this.getFrmaCuenta());
        }

        if (this.getFrmaImporte() != null && this.getFrmaImporte().longValue() == -999) {
            conditions += " AND FRMA_IMPORTE IS NULL";
        } else if (this.getFrmaImporte() != null) {
            conditions += " AND FRMA_IMPORTE = ?";
            values.add(this.getFrmaImporte());
        }

        if (this.getFrmaSubcto() != null && this.getFrmaSubcto().longValue() == -999) {
            conditions += " AND FRMA_SUBCTO IS NULL";
        } else if (this.getFrmaSubcto() != null) {
            conditions += " AND FRMA_SUBCTO = ?";
            values.add(this.getFrmaSubcto());
        }

        if (this.getFrmaTipoPersona() != null && this.getFrmaTipoPersona().longValue() == -999) {
            conditions += " AND FRMA_TIPO_PERSONA IS NULL";
        } else if (this.getFrmaTipoPersona() != null) {
            conditions += " AND FRMA_TIPO_PERSONA = ?";
            values.add(this.getFrmaTipoPersona());
        }

        if (this.getFrmaNumPersona() != null && this.getFrmaNumPersona().longValue() == -999) {
            conditions += " AND FRMA_NUM_PERSONA IS NULL";
        } else if (this.getFrmaNumPersona() != null) {
            conditions += " AND FRMA_NUM_PERSONA = ?";
            values.add(this.getFrmaNumPersona());
        }

        if (this.getFrmaNumGarantia() != null && this.getFrmaNumGarantia().longValue() == -999) {
            conditions += " AND FRMA_NUM_GARANTIA IS NULL";
        } else if (this.getFrmaNumGarantia() != null) {
            conditions += " AND FRMA_NUM_GARANTIA = ?";
            values.add(this.getFrmaNumGarantia());
        }

        if (this.getFrmaNumBienGar() != null && this.getFrmaNumBienGar().longValue() == -999) {
            conditions += " AND FRMA_NUM_BIEN_GAR IS NULL";
        } else if (this.getFrmaNumBienGar() != null) {
            conditions += " AND FRMA_NUM_BIEN_GAR = ?";
            values.add(this.getFrmaNumBienGar());
        }

        if (this.getFrmaAfectaGarantia() != null && this.getFrmaAfectaGarantia().longValue() == -999) {
            conditions += " AND FRMA_AFECTA_GARANTIA IS NULL";
        } else if (this.getFrmaAfectaGarantia() != null) {
            conditions += " AND FRMA_AFECTA_GARANTIA = ?";
            values.add(this.getFrmaAfectaGarantia());
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
        String sql = "UPDATE F_RETIROS_MASIVOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FRMA_FOLIO = ?";
        pkValues.add(this.getFrmaFolio());
        fields += " FRMA_FOLIO_DEF = ?, ";
        values.add(this.getFrmaFolioDef());
        fields += " FRMA_FOLIO_IND = ?, ";
        values.add(this.getFrmaFolioInd());
        conditions += " AND FRMA_SECUENCIAL = ?";
        pkValues.add(this.getFrmaSecuencial());
        fields += " FRMA_BENEFICIARIO = ?, ";
        values.add(this.getFrmaBeneficiario());
        fields += " FRMA_RFC = ?, ";
        values.add(this.getFrmaRfc());
        fields += " FRMA_CUENTA = ?, ";
        values.add(this.getFrmaCuenta());
        fields += " FRMA_IMPORTE = ?, ";
        values.add(this.getFrmaImporte());
        fields += " FRMA_SUBCTO = ?, ";
        values.add(this.getFrmaSubcto());
        fields += " FRMA_TIPO_PERSONA = ?, ";
        values.add(this.getFrmaTipoPersona());
        fields += " FRMA_NUM_PERSONA = ?, ";
        values.add(this.getFrmaNumPersona());
        fields += " FRMA_NUM_GARANTIA = ?, ";
        values.add(this.getFrmaNumGarantia());
        fields += " FRMA_NUM_BIEN_GAR = ?, ";
        values.add(this.getFrmaNumBienGar());
        fields += " FRMA_AFECTA_GARANTIA = ?, ";
        values.add(this.getFrmaAfectaGarantia());
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
        String sql = "INSERT INTO F_RETIROS_MASIVOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRMA_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFrmaFolio());

        fields += ", FRMA_FOLIO_DEF";
        fieldValues += ", ?";
        values.add(this.getFrmaFolioDef());

        fields += ", FRMA_FOLIO_IND";
        fieldValues += ", ?";
        values.add(this.getFrmaFolioInd());

        fields += ", FRMA_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFrmaSecuencial());

        fields += ", FRMA_BENEFICIARIO";
        fieldValues += ", ?";
        values.add(this.getFrmaBeneficiario());

        fields += ", FRMA_RFC";
        fieldValues += ", ?";
        values.add(this.getFrmaRfc());

        fields += ", FRMA_CUENTA";
        fieldValues += ", ?";
        values.add(this.getFrmaCuenta());

        fields += ", FRMA_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFrmaImporte());

        fields += ", FRMA_SUBCTO";
        fieldValues += ", ?";
        values.add(this.getFrmaSubcto());

        fields += ", FRMA_TIPO_PERSONA";
        fieldValues += ", ?";
        values.add(this.getFrmaTipoPersona());

        fields += ", FRMA_NUM_PERSONA";
        fieldValues += ", ?";
        values.add(this.getFrmaNumPersona());

        fields += ", FRMA_NUM_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFrmaNumGarantia());

        fields += ", FRMA_NUM_BIEN_GAR";
        fieldValues += ", ?";
        values.add(this.getFrmaNumBienGar());

        fields += ", FRMA_AFECTA_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFrmaAfectaGarantia());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_RETIROS_MASIVOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FRMA_FOLIO = ?";
        values.add(this.getFrmaFolio());
        conditions += " AND FRMA_SECUENCIAL = ?";
        values.add(this.getFrmaSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRetirosMasivos instance = (FRetirosMasivos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrmaFolio().equals(instance.getFrmaFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaFolioDef().equals(instance.getFrmaFolioDef()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaFolioInd().equals(instance.getFrmaFolioInd()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaSecuencial().equals(instance.getFrmaSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaBeneficiario().equals(instance.getFrmaBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaRfc().equals(instance.getFrmaRfc()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaCuenta().equals(instance.getFrmaCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaImporte().equals(instance.getFrmaImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaSubcto().equals(instance.getFrmaSubcto()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaTipoPersona().equals(instance.getFrmaTipoPersona()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaNumPersona().equals(instance.getFrmaNumPersona()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaNumGarantia().equals(instance.getFrmaNumGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaNumBienGar().equals(instance.getFrmaNumBienGar()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaAfectaGarantia().equals(instance.getFrmaAfectaGarantia()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRetirosMasivos result = new FRetirosMasivos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFrmaFolio((BigDecimal) objectData.getData("FRMA_FOLIO"));
        result.setFrmaFolioDef((BigDecimal) objectData.getData("FRMA_FOLIO_DEF"));
        result.setFrmaFolioInd((BigDecimal) objectData.getData("FRMA_FOLIO_IND"));
        result.setFrmaSecuencial((BigDecimal) objectData.getData("FRMA_SECUENCIAL"));
        result.setFrmaBeneficiario((String) objectData.getData("FRMA_BENEFICIARIO"));
        result.setFrmaRfc((String) objectData.getData("FRMA_RFC"));
        result.setFrmaCuenta((String) objectData.getData("FRMA_CUENTA"));
        result.setFrmaImporte((BigDecimal) objectData.getData("FRMA_IMPORTE"));
        result.setFrmaSubcto((BigDecimal) objectData.getData("FRMA_SUBCTO"));
        result.setFrmaTipoPersona((BigDecimal) objectData.getData("FRMA_TIPO_PERSONA"));
        result.setFrmaNumPersona((BigDecimal) objectData.getData("FRMA_NUM_PERSONA"));
        result.setFrmaNumGarantia((BigDecimal) objectData.getData("FRMA_NUM_GARANTIA"));
        result.setFrmaNumBienGar((BigDecimal) objectData.getData("FRMA_NUM_BIEN_GAR"));
        result.setFrmaAfectaGarantia((BigDecimal) objectData.getData("FRMA_AFECTA_GARANTIA"));

        return result;

    }

}
