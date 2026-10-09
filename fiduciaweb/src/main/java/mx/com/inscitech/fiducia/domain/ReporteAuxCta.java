package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPORTE_AUX_CTA_PK",
            columns =
            { "RPO_SEC_AUXILIAR", "RPO_NUM_AUX1", "RPO_FECHA", "RPO_NUM_CTAM", "RPO_NUM_SCTA", "RPO_NUM_SSCTA", "RPO_NUM_SSSCTA", "RPO_NUM_SSSSCTA", "RPO_NUM_SSSSSCTA",
              "RPO_NUM_AUX2", "RPO_NUM_AUX3"
    }, sequences = { "MANUAL" })
public class ReporteAuxCta extends DomainObject {

    BigDecimal rpoSecAuxiliar = null;
    BigDecimal rpoNumAux1 = null;
    String rpoFecha = null;
    BigDecimal rpoNumCtam = null;
    BigDecimal rpoNumScta = null;
    BigDecimal rpoNumSscta = null;
    BigDecimal rpoNumSsscta = null;
    BigDecimal rpoNumSssscta = null;
    BigDecimal rpoNumSsssscta = null;
    BigDecimal rpoNumAux2 = null;
    BigDecimal rpoNumAux3 = null;
    BigDecimal rpoFolioOpera = null;
    String rpoDescAsiento = null;
    BigDecimal rpoCargos = null;
    BigDecimal rpoAbonos = null;
    BigDecimal rpoSalIni = null;
    String rpoCtoNomContrato = null;
    String rpoUsuario = null;

    public ReporteAuxCta() {
        super();
        this.pkColumns = 11;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpoSecAuxiliar(BigDecimal rpoSecAuxiliar) {
        this.rpoSecAuxiliar = rpoSecAuxiliar;
    }

    public BigDecimal getRpoSecAuxiliar() {
        return this.rpoSecAuxiliar;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumAux1(BigDecimal rpoNumAux1) {
        this.rpoNumAux1 = rpoNumAux1;
    }

    public BigDecimal getRpoNumAux1() {
        return this.rpoNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setRpoFecha(String rpoFecha) {
        this.rpoFecha = rpoFecha;
    }

    public String getRpoFecha() {
        return this.rpoFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumCtam(BigDecimal rpoNumCtam) {
        this.rpoNumCtam = rpoNumCtam;
    }

    public BigDecimal getRpoNumCtam() {
        return this.rpoNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumScta(BigDecimal rpoNumScta) {
        this.rpoNumScta = rpoNumScta;
    }

    public BigDecimal getRpoNumScta() {
        return this.rpoNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumSscta(BigDecimal rpoNumSscta) {
        this.rpoNumSscta = rpoNumSscta;
    }

    public BigDecimal getRpoNumSscta() {
        return this.rpoNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumSsscta(BigDecimal rpoNumSsscta) {
        this.rpoNumSsscta = rpoNumSsscta;
    }

    public BigDecimal getRpoNumSsscta() {
        return this.rpoNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumSssscta(BigDecimal rpoNumSssscta) {
        this.rpoNumSssscta = rpoNumSssscta;
    }

    public BigDecimal getRpoNumSssscta() {
        return this.rpoNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumSsssscta(BigDecimal rpoNumSsssscta) {
        this.rpoNumSsssscta = rpoNumSsssscta;
    }

    public BigDecimal getRpoNumSsssscta() {
        return this.rpoNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumAux2(BigDecimal rpoNumAux2) {
        this.rpoNumAux2 = rpoNumAux2;
    }

    public BigDecimal getRpoNumAux2() {
        return this.rpoNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumAux3(BigDecimal rpoNumAux3) {
        this.rpoNumAux3 = rpoNumAux3;
    }

    public BigDecimal getRpoNumAux3() {
        return this.rpoNumAux3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpoFolioOpera(BigDecimal rpoFolioOpera) {
        this.rpoFolioOpera = rpoFolioOpera;
    }

    public BigDecimal getRpoFolioOpera() {
        return this.rpoFolioOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpoDescAsiento(String rpoDescAsiento) {
        this.rpoDescAsiento = rpoDescAsiento;
    }

    public String getRpoDescAsiento() {
        return this.rpoDescAsiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRpoCargos(BigDecimal rpoCargos) {
        this.rpoCargos = rpoCargos;
    }

    public BigDecimal getRpoCargos() {
        return this.rpoCargos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRpoAbonos(BigDecimal rpoAbonos) {
        this.rpoAbonos = rpoAbonos;
    }

    public BigDecimal getRpoAbonos() {
        return this.rpoAbonos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRpoSalIni(BigDecimal rpoSalIni) {
        this.rpoSalIni = rpoSalIni;
    }

    public BigDecimal getRpoSalIni() {
        return this.rpoSalIni;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpoCtoNomContrato(String rpoCtoNomContrato) {
        this.rpoCtoNomContrato = rpoCtoNomContrato;
    }

    public String getRpoCtoNomContrato() {
        return this.rpoCtoNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpoUsuario(String rpoUsuario) {
        this.rpoUsuario = rpoUsuario;
    }

    public String getRpoUsuario() {
        return this.rpoUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPORTE_AUX_CTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRpoSecAuxiliar() != null && this.getRpoSecAuxiliar().longValue() == -999) {
            conditions += " AND RPO_SEC_AUXILIAR IS NULL";
        } else if (this.getRpoSecAuxiliar() != null) {
            conditions += " AND RPO_SEC_AUXILIAR = ?";
            values.add(this.getRpoSecAuxiliar());
        }

        if (this.getRpoNumAux1() != null && this.getRpoNumAux1().longValue() == -999) {
            conditions += " AND RPO_NUM_AUX1 IS NULL";
        } else if (this.getRpoNumAux1() != null) {
            conditions += " AND RPO_NUM_AUX1 = ?";
            values.add(this.getRpoNumAux1());
        }

        if (this.getRpoFecha() != null && "null".equals(this.getRpoFecha())) {
            conditions += " AND RPO_FECHA IS NULL";
        } else if (this.getRpoFecha() != null) {
            conditions += " AND RPO_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRpoFecha());
        }

        if (this.getRpoNumCtam() != null && this.getRpoNumCtam().longValue() == -999) {
            conditions += " AND RPO_NUM_CTAM IS NULL";
        } else if (this.getRpoNumCtam() != null) {
            conditions += " AND RPO_NUM_CTAM = ?";
            values.add(this.getRpoNumCtam());
        }

        if (this.getRpoNumScta() != null && this.getRpoNumScta().longValue() == -999) {
            conditions += " AND RPO_NUM_SCTA IS NULL";
        } else if (this.getRpoNumScta() != null) {
            conditions += " AND RPO_NUM_SCTA = ?";
            values.add(this.getRpoNumScta());
        }

        if (this.getRpoNumSscta() != null && this.getRpoNumSscta().longValue() == -999) {
            conditions += " AND RPO_NUM_SSCTA IS NULL";
        } else if (this.getRpoNumSscta() != null) {
            conditions += " AND RPO_NUM_SSCTA = ?";
            values.add(this.getRpoNumSscta());
        }

        if (this.getRpoNumSsscta() != null && this.getRpoNumSsscta().longValue() == -999) {
            conditions += " AND RPO_NUM_SSSCTA IS NULL";
        } else if (this.getRpoNumSsscta() != null) {
            conditions += " AND RPO_NUM_SSSCTA = ?";
            values.add(this.getRpoNumSsscta());
        }

        if (this.getRpoNumSssscta() != null && this.getRpoNumSssscta().longValue() == -999) {
            conditions += " AND RPO_NUM_SSSSCTA IS NULL";
        } else if (this.getRpoNumSssscta() != null) {
            conditions += " AND RPO_NUM_SSSSCTA = ?";
            values.add(this.getRpoNumSssscta());
        }

        if (this.getRpoNumSsssscta() != null && this.getRpoNumSsssscta().longValue() == -999) {
            conditions += " AND RPO_NUM_SSSSSCTA IS NULL";
        } else if (this.getRpoNumSsssscta() != null) {
            conditions += " AND RPO_NUM_SSSSSCTA = ?";
            values.add(this.getRpoNumSsssscta());
        }

        if (this.getRpoNumAux2() != null && this.getRpoNumAux2().longValue() == -999) {
            conditions += " AND RPO_NUM_AUX2 IS NULL";
        } else if (this.getRpoNumAux2() != null) {
            conditions += " AND RPO_NUM_AUX2 = ?";
            values.add(this.getRpoNumAux2());
        }

        if (this.getRpoNumAux3() != null && this.getRpoNumAux3().longValue() == -999) {
            conditions += " AND RPO_NUM_AUX3 IS NULL";
        } else if (this.getRpoNumAux3() != null) {
            conditions += " AND RPO_NUM_AUX3 = ?";
            values.add(this.getRpoNumAux3());
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
        String sql = "SELECT * FROM REPORTE_AUX_CTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRpoSecAuxiliar() != null && this.getRpoSecAuxiliar().longValue() == -999) {
            conditions += " AND RPO_SEC_AUXILIAR IS NULL";
        } else if (this.getRpoSecAuxiliar() != null) {
            conditions += " AND RPO_SEC_AUXILIAR = ?";
            values.add(this.getRpoSecAuxiliar());
        }

        if (this.getRpoNumAux1() != null && this.getRpoNumAux1().longValue() == -999) {
            conditions += " AND RPO_NUM_AUX1 IS NULL";
        } else if (this.getRpoNumAux1() != null) {
            conditions += " AND RPO_NUM_AUX1 = ?";
            values.add(this.getRpoNumAux1());
        }

        if (this.getRpoFecha() != null && "null".equals(this.getRpoFecha())) {
            conditions += " AND RPO_FECHA IS NULL";
        } else if (this.getRpoFecha() != null) {
            conditions += " AND RPO_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRpoFecha());
        }

        if (this.getRpoNumCtam() != null && this.getRpoNumCtam().longValue() == -999) {
            conditions += " AND RPO_NUM_CTAM IS NULL";
        } else if (this.getRpoNumCtam() != null) {
            conditions += " AND RPO_NUM_CTAM = ?";
            values.add(this.getRpoNumCtam());
        }

        if (this.getRpoNumScta() != null && this.getRpoNumScta().longValue() == -999) {
            conditions += " AND RPO_NUM_SCTA IS NULL";
        } else if (this.getRpoNumScta() != null) {
            conditions += " AND RPO_NUM_SCTA = ?";
            values.add(this.getRpoNumScta());
        }

        if (this.getRpoNumSscta() != null && this.getRpoNumSscta().longValue() == -999) {
            conditions += " AND RPO_NUM_SSCTA IS NULL";
        } else if (this.getRpoNumSscta() != null) {
            conditions += " AND RPO_NUM_SSCTA = ?";
            values.add(this.getRpoNumSscta());
        }

        if (this.getRpoNumSsscta() != null && this.getRpoNumSsscta().longValue() == -999) {
            conditions += " AND RPO_NUM_SSSCTA IS NULL";
        } else if (this.getRpoNumSsscta() != null) {
            conditions += " AND RPO_NUM_SSSCTA = ?";
            values.add(this.getRpoNumSsscta());
        }

        if (this.getRpoNumSssscta() != null && this.getRpoNumSssscta().longValue() == -999) {
            conditions += " AND RPO_NUM_SSSSCTA IS NULL";
        } else if (this.getRpoNumSssscta() != null) {
            conditions += " AND RPO_NUM_SSSSCTA = ?";
            values.add(this.getRpoNumSssscta());
        }

        if (this.getRpoNumSsssscta() != null && this.getRpoNumSsssscta().longValue() == -999) {
            conditions += " AND RPO_NUM_SSSSSCTA IS NULL";
        } else if (this.getRpoNumSsssscta() != null) {
            conditions += " AND RPO_NUM_SSSSSCTA = ?";
            values.add(this.getRpoNumSsssscta());
        }

        if (this.getRpoNumAux2() != null && this.getRpoNumAux2().longValue() == -999) {
            conditions += " AND RPO_NUM_AUX2 IS NULL";
        } else if (this.getRpoNumAux2() != null) {
            conditions += " AND RPO_NUM_AUX2 = ?";
            values.add(this.getRpoNumAux2());
        }

        if (this.getRpoNumAux3() != null && this.getRpoNumAux3().longValue() == -999) {
            conditions += " AND RPO_NUM_AUX3 IS NULL";
        } else if (this.getRpoNumAux3() != null) {
            conditions += " AND RPO_NUM_AUX3 = ?";
            values.add(this.getRpoNumAux3());
        }

        if (this.getRpoFolioOpera() != null && this.getRpoFolioOpera().longValue() == -999) {
            conditions += " AND RPO_FOLIO_OPERA IS NULL";
        } else if (this.getRpoFolioOpera() != null) {
            conditions += " AND RPO_FOLIO_OPERA = ?";
            values.add(this.getRpoFolioOpera());
        }

        if (this.getRpoDescAsiento() != null && "null".equals(this.getRpoDescAsiento())) {
            conditions += " AND RPO_DESC_ASIENTO IS NULL";
        } else if (this.getRpoDescAsiento() != null) {
            conditions += " AND RPO_DESC_ASIENTO = ?";
            values.add(this.getRpoDescAsiento());
        }

        if (this.getRpoCargos() != null && this.getRpoCargos().longValue() == -999) {
            conditions += " AND RPO_CARGOS IS NULL";
        } else if (this.getRpoCargos() != null) {
            conditions += " AND RPO_CARGOS = ?";
            values.add(this.getRpoCargos());
        }

        if (this.getRpoAbonos() != null && this.getRpoAbonos().longValue() == -999) {
            conditions += " AND RPO_ABONOS IS NULL";
        } else if (this.getRpoAbonos() != null) {
            conditions += " AND RPO_ABONOS = ?";
            values.add(this.getRpoAbonos());
        }

        if (this.getRpoSalIni() != null && this.getRpoSalIni().longValue() == -999) {
            conditions += " AND RPO_SAL_INI IS NULL";
        } else if (this.getRpoSalIni() != null) {
            conditions += " AND RPO_SAL_INI = ?";
            values.add(this.getRpoSalIni());
        }

        if (this.getRpoCtoNomContrato() != null && "null".equals(this.getRpoCtoNomContrato())) {
            conditions += " AND RPO_CTO_NOM_CONTRATO IS NULL";
        } else if (this.getRpoCtoNomContrato() != null) {
            conditions += " AND RPO_CTO_NOM_CONTRATO = ?";
            values.add(this.getRpoCtoNomContrato());
        }

        if (this.getRpoUsuario() != null && "null".equals(this.getRpoUsuario())) {
            conditions += " AND RPO_USUARIO IS NULL";
        } else if (this.getRpoUsuario() != null) {
            conditions += " AND RPO_USUARIO = ?";
            values.add(this.getRpoUsuario());
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
        String sql = "UPDATE REPORTE_AUX_CTA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RPO_SEC_AUXILIAR = ?";
        pkValues.add(this.getRpoSecAuxiliar());
        conditions += " AND RPO_NUM_AUX1 = ?";
        pkValues.add(this.getRpoNumAux1());
        conditions += " AND RPO_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getRpoFecha());
        conditions += " AND RPO_NUM_CTAM = ?";
        pkValues.add(this.getRpoNumCtam());
        conditions += " AND RPO_NUM_SCTA = ?";
        pkValues.add(this.getRpoNumScta());
        conditions += " AND RPO_NUM_SSCTA = ?";
        pkValues.add(this.getRpoNumSscta());
        conditions += " AND RPO_NUM_SSSCTA = ?";
        pkValues.add(this.getRpoNumSsscta());
        conditions += " AND RPO_NUM_SSSSCTA = ?";
        pkValues.add(this.getRpoNumSssscta());
        conditions += " AND RPO_NUM_SSSSSCTA = ?";
        pkValues.add(this.getRpoNumSsssscta());
        conditions += " AND RPO_NUM_AUX2 = ?";
        pkValues.add(this.getRpoNumAux2());
        conditions += " AND RPO_NUM_AUX3 = ?";
        pkValues.add(this.getRpoNumAux3());
        fields += " RPO_FOLIO_OPERA = ?, ";
        values.add(this.getRpoFolioOpera());
        fields += " RPO_DESC_ASIENTO = ?, ";
        values.add(this.getRpoDescAsiento());
        fields += " RPO_CARGOS = ?, ";
        values.add(this.getRpoCargos());
        fields += " RPO_ABONOS = ?, ";
        values.add(this.getRpoAbonos());
        fields += " RPO_SAL_INI = ?, ";
        values.add(this.getRpoSalIni());
        fields += " RPO_CTO_NOM_CONTRATO = ?, ";
        values.add(this.getRpoCtoNomContrato());
        fields += " RPO_USUARIO = ?, ";
        values.add(this.getRpoUsuario());
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
        String sql = "INSERT INTO REPORTE_AUX_CTA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RPO_SEC_AUXILIAR";
        fieldValues += ", ?";
        values.add(this.getRpoSecAuxiliar());

        fields += ", RPO_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getRpoNumAux1());

        fields += ", RPO_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRpoFecha());

        fields += ", RPO_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getRpoNumCtam());

        fields += ", RPO_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getRpoNumScta());

        fields += ", RPO_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getRpoNumSscta());

        fields += ", RPO_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getRpoNumSsscta());

        fields += ", RPO_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getRpoNumSssscta());

        fields += ", RPO_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getRpoNumSsssscta());

        fields += ", RPO_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getRpoNumAux2());

        fields += ", RPO_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getRpoNumAux3());

        fields += ", RPO_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getRpoFolioOpera());

        fields += ", RPO_DESC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getRpoDescAsiento());

        fields += ", RPO_CARGOS";
        fieldValues += ", ?";
        values.add(this.getRpoCargos());

        fields += ", RPO_ABONOS";
        fieldValues += ", ?";
        values.add(this.getRpoAbonos());

        fields += ", RPO_SAL_INI";
        fieldValues += ", ?";
        values.add(this.getRpoSalIni());

        fields += ", RPO_CTO_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRpoCtoNomContrato());

        fields += ", RPO_USUARIO";
        fieldValues += ", ?";
        values.add(this.getRpoUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPORTE_AUX_CTA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RPO_SEC_AUXILIAR = ?";
        values.add(this.getRpoSecAuxiliar());
        conditions += " AND RPO_NUM_AUX1 = ?";
        values.add(this.getRpoNumAux1());
        conditions += " AND RPO_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getRpoFecha());
        conditions += " AND RPO_NUM_CTAM = ?";
        values.add(this.getRpoNumCtam());
        conditions += " AND RPO_NUM_SCTA = ?";
        values.add(this.getRpoNumScta());
        conditions += " AND RPO_NUM_SSCTA = ?";
        values.add(this.getRpoNumSscta());
        conditions += " AND RPO_NUM_SSSCTA = ?";
        values.add(this.getRpoNumSsscta());
        conditions += " AND RPO_NUM_SSSSCTA = ?";
        values.add(this.getRpoNumSssscta());
        conditions += " AND RPO_NUM_SSSSSCTA = ?";
        values.add(this.getRpoNumSsssscta());
        conditions += " AND RPO_NUM_AUX2 = ?";
        values.add(this.getRpoNumAux2());
        conditions += " AND RPO_NUM_AUX3 = ?";
        values.add(this.getRpoNumAux3());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ReporteAuxCta instance = (ReporteAuxCta) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRpoSecAuxiliar().equals(instance.getRpoSecAuxiliar()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumAux1().equals(instance.getRpoNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getRpoFecha().equals(instance.getRpoFecha()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumCtam().equals(instance.getRpoNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumScta().equals(instance.getRpoNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumSscta().equals(instance.getRpoNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumSsscta().equals(instance.getRpoNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumSssscta().equals(instance.getRpoNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumSsssscta().equals(instance.getRpoNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumAux2().equals(instance.getRpoNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumAux3().equals(instance.getRpoNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getRpoFolioOpera().equals(instance.getRpoFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getRpoDescAsiento().equals(instance.getRpoDescAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getRpoCargos().equals(instance.getRpoCargos()))
            equalObjects = false;
        if (equalObjects && !this.getRpoAbonos().equals(instance.getRpoAbonos()))
            equalObjects = false;
        if (equalObjects && !this.getRpoSalIni().equals(instance.getRpoSalIni()))
            equalObjects = false;
        if (equalObjects && !this.getRpoCtoNomContrato().equals(instance.getRpoCtoNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRpoUsuario().equals(instance.getRpoUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ReporteAuxCta result = new ReporteAuxCta();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRpoSecAuxiliar((BigDecimal) objectData.getData("RPO_SEC_AUXILIAR"));
        result.setRpoNumAux1((BigDecimal) objectData.getData("RPO_NUM_AUX1"));
        result.setRpoFecha((String) objectData.getData("RPO_FECHA"));
        result.setRpoNumCtam((BigDecimal) objectData.getData("RPO_NUM_CTAM"));
        result.setRpoNumScta((BigDecimal) objectData.getData("RPO_NUM_SCTA"));
        result.setRpoNumSscta((BigDecimal) objectData.getData("RPO_NUM_SSCTA"));
        result.setRpoNumSsscta((BigDecimal) objectData.getData("RPO_NUM_SSSCTA"));
        result.setRpoNumSssscta((BigDecimal) objectData.getData("RPO_NUM_SSSSCTA"));
        result.setRpoNumSsssscta((BigDecimal) objectData.getData("RPO_NUM_SSSSSCTA"));
        result.setRpoNumAux2((BigDecimal) objectData.getData("RPO_NUM_AUX2"));
        result.setRpoNumAux3((BigDecimal) objectData.getData("RPO_NUM_AUX3"));
        result.setRpoFolioOpera((BigDecimal) objectData.getData("RPO_FOLIO_OPERA"));
        result.setRpoDescAsiento((String) objectData.getData("RPO_DESC_ASIENTO"));
        result.setRpoCargos((BigDecimal) objectData.getData("RPO_CARGOS"));
        result.setRpoAbonos((BigDecimal) objectData.getData("RPO_ABONOS"));
        result.setRpoSalIni((BigDecimal) objectData.getData("RPO_SAL_INI"));
        result.setRpoCtoNomContrato((String) objectData.getData("RPO_CTO_NOM_CONTRATO"));
        result.setRpoUsuario((String) objectData.getData("RPO_USUARIO"));

        return result;

    }

}
