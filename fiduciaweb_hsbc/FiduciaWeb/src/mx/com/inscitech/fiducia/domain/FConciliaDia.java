package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CONCILIA_DIA_PK", columns = { "FCD_ID_SECUENCIAL", "FCD_ID_BANCO", "FCD_ID_INTERFASE", "FCD_FECHA", "FCD_ID_CONCILIACION" },
            sequences = { "MANUAL" })
public class FConciliaDia extends DomainObject {

    BigDecimal fcdIdSecuencial = null;
    BigDecimal fcdIdBanco = null;
    BigDecimal fcdIdInterfase = null;
    String fcdFecha = null;
    BigDecimal fcdIdConciliacion = null;
    String fcdDato1 = null;
    BigDecimal fcdValor1 = null;
    String fcdDatoc1 = null;
    BigDecimal fcdValorc1 = null;
    String fcdDato2 = null;
    BigDecimal fcdValor2 = null;
    String fcdDatoc2 = null;
    BigDecimal fcdValorc2 = null;
    String fcdDato3 = null;
    BigDecimal fcdValor3 = null;
    String fcdDatoc3 = null;
    BigDecimal fcdValorc3 = null;
    String fcdDato4 = null;
    BigDecimal fcdValor4 = null;
    String fcdDatoc4 = null;
    BigDecimal fcdValorc4 = null;
    String fcdDato5 = null;
    BigDecimal fcdValor5 = null;
    String fcdDatoc5 = null;
    BigDecimal fcdValorc5 = null;
    String fcdDato6 = null;
    BigDecimal fcdValor6 = null;
    String fcdDatoc6 = null;
    BigDecimal fcdValorc6 = null;
    String fcdStatus = null;

    public FConciliaDia() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcdIdSecuencial(BigDecimal fcdIdSecuencial) {
        this.fcdIdSecuencial = fcdIdSecuencial;
    }

    public BigDecimal getFcdIdSecuencial() {
        return this.fcdIdSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcdIdBanco(BigDecimal fcdIdBanco) {
        this.fcdIdBanco = fcdIdBanco;
    }

    public BigDecimal getFcdIdBanco() {
        return this.fcdIdBanco;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcdIdInterfase(BigDecimal fcdIdInterfase) {
        this.fcdIdInterfase = fcdIdInterfase;
    }

    public BigDecimal getFcdIdInterfase() {
        return this.fcdIdInterfase;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFcdFecha(String fcdFecha) {
        this.fcdFecha = fcdFecha;
    }

    public String getFcdFecha() {
        return this.fcdFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcdIdConciliacion(BigDecimal fcdIdConciliacion) {
        this.fcdIdConciliacion = fcdIdConciliacion;
    }

    public BigDecimal getFcdIdConciliacion() {
        return this.fcdIdConciliacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDato1(String fcdDato1) {
        this.fcdDato1 = fcdDato1;
    }

    public String getFcdDato1() {
        return this.fcdDato1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValor1(BigDecimal fcdValor1) {
        this.fcdValor1 = fcdValor1;
    }

    public BigDecimal getFcdValor1() {
        return this.fcdValor1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDatoc1(String fcdDatoc1) {
        this.fcdDatoc1 = fcdDatoc1;
    }

    public String getFcdDatoc1() {
        return this.fcdDatoc1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValorc1(BigDecimal fcdValorc1) {
        this.fcdValorc1 = fcdValorc1;
    }

    public BigDecimal getFcdValorc1() {
        return this.fcdValorc1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDato2(String fcdDato2) {
        this.fcdDato2 = fcdDato2;
    }

    public String getFcdDato2() {
        return this.fcdDato2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValor2(BigDecimal fcdValor2) {
        this.fcdValor2 = fcdValor2;
    }

    public BigDecimal getFcdValor2() {
        return this.fcdValor2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDatoc2(String fcdDatoc2) {
        this.fcdDatoc2 = fcdDatoc2;
    }

    public String getFcdDatoc2() {
        return this.fcdDatoc2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValorc2(BigDecimal fcdValorc2) {
        this.fcdValorc2 = fcdValorc2;
    }

    public BigDecimal getFcdValorc2() {
        return this.fcdValorc2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDato3(String fcdDato3) {
        this.fcdDato3 = fcdDato3;
    }

    public String getFcdDato3() {
        return this.fcdDato3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValor3(BigDecimal fcdValor3) {
        this.fcdValor3 = fcdValor3;
    }

    public BigDecimal getFcdValor3() {
        return this.fcdValor3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDatoc3(String fcdDatoc3) {
        this.fcdDatoc3 = fcdDatoc3;
    }

    public String getFcdDatoc3() {
        return this.fcdDatoc3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValorc3(BigDecimal fcdValorc3) {
        this.fcdValorc3 = fcdValorc3;
    }

    public BigDecimal getFcdValorc3() {
        return this.fcdValorc3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDato4(String fcdDato4) {
        this.fcdDato4 = fcdDato4;
    }

    public String getFcdDato4() {
        return this.fcdDato4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValor4(BigDecimal fcdValor4) {
        this.fcdValor4 = fcdValor4;
    }

    public BigDecimal getFcdValor4() {
        return this.fcdValor4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDatoc4(String fcdDatoc4) {
        this.fcdDatoc4 = fcdDatoc4;
    }

    public String getFcdDatoc4() {
        return this.fcdDatoc4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValorc4(BigDecimal fcdValorc4) {
        this.fcdValorc4 = fcdValorc4;
    }

    public BigDecimal getFcdValorc4() {
        return this.fcdValorc4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDato5(String fcdDato5) {
        this.fcdDato5 = fcdDato5;
    }

    public String getFcdDato5() {
        return this.fcdDato5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValor5(BigDecimal fcdValor5) {
        this.fcdValor5 = fcdValor5;
    }

    public BigDecimal getFcdValor5() {
        return this.fcdValor5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDatoc5(String fcdDatoc5) {
        this.fcdDatoc5 = fcdDatoc5;
    }

    public String getFcdDatoc5() {
        return this.fcdDatoc5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValorc5(BigDecimal fcdValorc5) {
        this.fcdValorc5 = fcdValorc5;
    }

    public BigDecimal getFcdValorc5() {
        return this.fcdValorc5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDato6(String fcdDato6) {
        this.fcdDato6 = fcdDato6;
    }

    public String getFcdDato6() {
        return this.fcdDato6;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValor6(BigDecimal fcdValor6) {
        this.fcdValor6 = fcdValor6;
    }

    public BigDecimal getFcdValor6() {
        return this.fcdValor6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdDatoc6(String fcdDatoc6) {
        this.fcdDatoc6 = fcdDatoc6;
    }

    public String getFcdDatoc6() {
        return this.fcdDatoc6;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFcdValorc6(BigDecimal fcdValorc6) {
        this.fcdValorc6 = fcdValorc6;
    }

    public BigDecimal getFcdValorc6() {
        return this.fcdValorc6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcdStatus(String fcdStatus) {
        this.fcdStatus = fcdStatus;
    }

    public String getFcdStatus() {
        return this.fcdStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONCILIA_DIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcdIdSecuencial() != null && this.getFcdIdSecuencial().longValue() == -999) {
            conditions += " AND FCD_ID_SECUENCIAL IS NULL";
        } else if (this.getFcdIdSecuencial() != null) {
            conditions += " AND FCD_ID_SECUENCIAL = ?";
            values.add(this.getFcdIdSecuencial());
        }

        if (this.getFcdIdBanco() != null && this.getFcdIdBanco().longValue() == -999) {
            conditions += " AND FCD_ID_BANCO IS NULL";
        } else if (this.getFcdIdBanco() != null) {
            conditions += " AND FCD_ID_BANCO = ?";
            values.add(this.getFcdIdBanco());
        }

        if (this.getFcdIdInterfase() != null && this.getFcdIdInterfase().longValue() == -999) {
            conditions += " AND FCD_ID_INTERFASE IS NULL";
        } else if (this.getFcdIdInterfase() != null) {
            conditions += " AND FCD_ID_INTERFASE = ?";
            values.add(this.getFcdIdInterfase());
        }

        if (this.getFcdFecha() != null && "null".equals(this.getFcdFecha())) {
            conditions += " AND FCD_FECHA IS NULL";
        } else if (this.getFcdFecha() != null) {
            conditions += " AND FCD_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcdFecha());
        }

        if (this.getFcdIdConciliacion() != null && this.getFcdIdConciliacion().longValue() == -999) {
            conditions += " AND FCD_ID_CONCILIACION IS NULL";
        } else if (this.getFcdIdConciliacion() != null) {
            conditions += " AND FCD_ID_CONCILIACION = ?";
            values.add(this.getFcdIdConciliacion());
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
        String sql = "SELECT * FROM F_CONCILIA_DIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcdIdSecuencial() != null && this.getFcdIdSecuencial().longValue() == -999) {
            conditions += " AND FCD_ID_SECUENCIAL IS NULL";
        } else if (this.getFcdIdSecuencial() != null) {
            conditions += " AND FCD_ID_SECUENCIAL = ?";
            values.add(this.getFcdIdSecuencial());
        }

        if (this.getFcdIdBanco() != null && this.getFcdIdBanco().longValue() == -999) {
            conditions += " AND FCD_ID_BANCO IS NULL";
        } else if (this.getFcdIdBanco() != null) {
            conditions += " AND FCD_ID_BANCO = ?";
            values.add(this.getFcdIdBanco());
        }

        if (this.getFcdIdInterfase() != null && this.getFcdIdInterfase().longValue() == -999) {
            conditions += " AND FCD_ID_INTERFASE IS NULL";
        } else if (this.getFcdIdInterfase() != null) {
            conditions += " AND FCD_ID_INTERFASE = ?";
            values.add(this.getFcdIdInterfase());
        }

        if (this.getFcdFecha() != null && "null".equals(this.getFcdFecha())) {
            conditions += " AND FCD_FECHA IS NULL";
        } else if (this.getFcdFecha() != null) {
            conditions += " AND FCD_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFcdFecha());
        }

        if (this.getFcdIdConciliacion() != null && this.getFcdIdConciliacion().longValue() == -999) {
            conditions += " AND FCD_ID_CONCILIACION IS NULL";
        } else if (this.getFcdIdConciliacion() != null) {
            conditions += " AND FCD_ID_CONCILIACION = ?";
            values.add(this.getFcdIdConciliacion());
        }

        if (this.getFcdDato1() != null && "null".equals(this.getFcdDato1())) {
            conditions += " AND FCD_DATO1 IS NULL";
        } else if (this.getFcdDato1() != null) {
            conditions += " AND FCD_DATO1 = ?";
            values.add(this.getFcdDato1());
        }

        if (this.getFcdValor1() != null && this.getFcdValor1().longValue() == -999) {
            conditions += " AND FCD_VALOR1 IS NULL";
        } else if (this.getFcdValor1() != null) {
            conditions += " AND FCD_VALOR1 = ?";
            values.add(this.getFcdValor1());
        }

        if (this.getFcdDatoc1() != null && "null".equals(this.getFcdDatoc1())) {
            conditions += " AND FCD_DATOC1 IS NULL";
        } else if (this.getFcdDatoc1() != null) {
            conditions += " AND FCD_DATOC1 = ?";
            values.add(this.getFcdDatoc1());
        }

        if (this.getFcdValorc1() != null && this.getFcdValorc1().longValue() == -999) {
            conditions += " AND FCD_VALORC1 IS NULL";
        } else if (this.getFcdValorc1() != null) {
            conditions += " AND FCD_VALORC1 = ?";
            values.add(this.getFcdValorc1());
        }

        if (this.getFcdDato2() != null && "null".equals(this.getFcdDato2())) {
            conditions += " AND FCD_DATO2 IS NULL";
        } else if (this.getFcdDato2() != null) {
            conditions += " AND FCD_DATO2 = ?";
            values.add(this.getFcdDato2());
        }

        if (this.getFcdValor2() != null && this.getFcdValor2().longValue() == -999) {
            conditions += " AND FCD_VALOR2 IS NULL";
        } else if (this.getFcdValor2() != null) {
            conditions += " AND FCD_VALOR2 = ?";
            values.add(this.getFcdValor2());
        }

        if (this.getFcdDatoc2() != null && "null".equals(this.getFcdDatoc2())) {
            conditions += " AND FCD_DATOC2 IS NULL";
        } else if (this.getFcdDatoc2() != null) {
            conditions += " AND FCD_DATOC2 = ?";
            values.add(this.getFcdDatoc2());
        }

        if (this.getFcdValorc2() != null && this.getFcdValorc2().longValue() == -999) {
            conditions += " AND FCD_VALORC2 IS NULL";
        } else if (this.getFcdValorc2() != null) {
            conditions += " AND FCD_VALORC2 = ?";
            values.add(this.getFcdValorc2());
        }

        if (this.getFcdDato3() != null && "null".equals(this.getFcdDato3())) {
            conditions += " AND FCD_DATO3 IS NULL";
        } else if (this.getFcdDato3() != null) {
            conditions += " AND FCD_DATO3 = ?";
            values.add(this.getFcdDato3());
        }

        if (this.getFcdValor3() != null && this.getFcdValor3().longValue() == -999) {
            conditions += " AND FCD_VALOR3 IS NULL";
        } else if (this.getFcdValor3() != null) {
            conditions += " AND FCD_VALOR3 = ?";
            values.add(this.getFcdValor3());
        }

        if (this.getFcdDatoc3() != null && "null".equals(this.getFcdDatoc3())) {
            conditions += " AND FCD_DATOC3 IS NULL";
        } else if (this.getFcdDatoc3() != null) {
            conditions += " AND FCD_DATOC3 = ?";
            values.add(this.getFcdDatoc3());
        }

        if (this.getFcdValorc3() != null && this.getFcdValorc3().longValue() == -999) {
            conditions += " AND FCD_VALORC3 IS NULL";
        } else if (this.getFcdValorc3() != null) {
            conditions += " AND FCD_VALORC3 = ?";
            values.add(this.getFcdValorc3());
        }

        if (this.getFcdDato4() != null && "null".equals(this.getFcdDato4())) {
            conditions += " AND FCD_DATO4 IS NULL";
        } else if (this.getFcdDato4() != null) {
            conditions += " AND FCD_DATO4 = ?";
            values.add(this.getFcdDato4());
        }

        if (this.getFcdValor4() != null && this.getFcdValor4().longValue() == -999) {
            conditions += " AND FCD_VALOR4 IS NULL";
        } else if (this.getFcdValor4() != null) {
            conditions += " AND FCD_VALOR4 = ?";
            values.add(this.getFcdValor4());
        }

        if (this.getFcdDatoc4() != null && "null".equals(this.getFcdDatoc4())) {
            conditions += " AND FCD_DATOC4 IS NULL";
        } else if (this.getFcdDatoc4() != null) {
            conditions += " AND FCD_DATOC4 = ?";
            values.add(this.getFcdDatoc4());
        }

        if (this.getFcdValorc4() != null && this.getFcdValorc4().longValue() == -999) {
            conditions += " AND FCD_VALORC4 IS NULL";
        } else if (this.getFcdValorc4() != null) {
            conditions += " AND FCD_VALORC4 = ?";
            values.add(this.getFcdValorc4());
        }

        if (this.getFcdDato5() != null && "null".equals(this.getFcdDato5())) {
            conditions += " AND FCD_DATO5 IS NULL";
        } else if (this.getFcdDato5() != null) {
            conditions += " AND FCD_DATO5 = ?";
            values.add(this.getFcdDato5());
        }

        if (this.getFcdValor5() != null && this.getFcdValor5().longValue() == -999) {
            conditions += " AND FCD_VALOR5 IS NULL";
        } else if (this.getFcdValor5() != null) {
            conditions += " AND FCD_VALOR5 = ?";
            values.add(this.getFcdValor5());
        }

        if (this.getFcdDatoc5() != null && "null".equals(this.getFcdDatoc5())) {
            conditions += " AND FCD_DATOC5 IS NULL";
        } else if (this.getFcdDatoc5() != null) {
            conditions += " AND FCD_DATOC5 = ?";
            values.add(this.getFcdDatoc5());
        }

        if (this.getFcdValorc5() != null && this.getFcdValorc5().longValue() == -999) {
            conditions += " AND FCD_VALORC5 IS NULL";
        } else if (this.getFcdValorc5() != null) {
            conditions += " AND FCD_VALORC5 = ?";
            values.add(this.getFcdValorc5());
        }

        if (this.getFcdDato6() != null && "null".equals(this.getFcdDato6())) {
            conditions += " AND FCD_DATO6 IS NULL";
        } else if (this.getFcdDato6() != null) {
            conditions += " AND FCD_DATO6 = ?";
            values.add(this.getFcdDato6());
        }

        if (this.getFcdValor6() != null && this.getFcdValor6().longValue() == -999) {
            conditions += " AND FCD_VALOR6 IS NULL";
        } else if (this.getFcdValor6() != null) {
            conditions += " AND FCD_VALOR6 = ?";
            values.add(this.getFcdValor6());
        }

        if (this.getFcdDatoc6() != null && "null".equals(this.getFcdDatoc6())) {
            conditions += " AND FCD_DATOC6 IS NULL";
        } else if (this.getFcdDatoc6() != null) {
            conditions += " AND FCD_DATOC6 = ?";
            values.add(this.getFcdDatoc6());
        }

        if (this.getFcdValorc6() != null && this.getFcdValorc6().longValue() == -999) {
            conditions += " AND FCD_VALORC6 IS NULL";
        } else if (this.getFcdValorc6() != null) {
            conditions += " AND FCD_VALORC6 = ?";
            values.add(this.getFcdValorc6());
        }

        if (this.getFcdStatus() != null && "null".equals(this.getFcdStatus())) {
            conditions += " AND FCD_STATUS IS NULL";
        } else if (this.getFcdStatus() != null) {
            conditions += " AND FCD_STATUS = ?";
            values.add(this.getFcdStatus());
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
        String sql = "UPDATE F_CONCILIA_DIA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCD_ID_SECUENCIAL = ?";
        pkValues.add(this.getFcdIdSecuencial());
        conditions += " AND FCD_ID_BANCO = ?";
        pkValues.add(this.getFcdIdBanco());
        conditions += " AND FCD_ID_INTERFASE = ?";
        pkValues.add(this.getFcdIdInterfase());
        conditions += " AND FCD_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFcdFecha());
        conditions += " AND FCD_ID_CONCILIACION = ?";
        pkValues.add(this.getFcdIdConciliacion());
        fields += " FCD_DATO1 = ?, ";
        values.add(this.getFcdDato1());
        fields += " FCD_VALOR1 = ?, ";
        values.add(this.getFcdValor1());
        fields += " FCD_DATOC1 = ?, ";
        values.add(this.getFcdDatoc1());
        fields += " FCD_VALORC1 = ?, ";
        values.add(this.getFcdValorc1());
        fields += " FCD_DATO2 = ?, ";
        values.add(this.getFcdDato2());
        fields += " FCD_VALOR2 = ?, ";
        values.add(this.getFcdValor2());
        fields += " FCD_DATOC2 = ?, ";
        values.add(this.getFcdDatoc2());
        fields += " FCD_VALORC2 = ?, ";
        values.add(this.getFcdValorc2());
        fields += " FCD_DATO3 = ?, ";
        values.add(this.getFcdDato3());
        fields += " FCD_VALOR3 = ?, ";
        values.add(this.getFcdValor3());
        fields += " FCD_DATOC3 = ?, ";
        values.add(this.getFcdDatoc3());
        fields += " FCD_VALORC3 = ?, ";
        values.add(this.getFcdValorc3());
        fields += " FCD_DATO4 = ?, ";
        values.add(this.getFcdDato4());
        fields += " FCD_VALOR4 = ?, ";
        values.add(this.getFcdValor4());
        fields += " FCD_DATOC4 = ?, ";
        values.add(this.getFcdDatoc4());
        fields += " FCD_VALORC4 = ?, ";
        values.add(this.getFcdValorc4());
        fields += " FCD_DATO5 = ?, ";
        values.add(this.getFcdDato5());
        fields += " FCD_VALOR5 = ?, ";
        values.add(this.getFcdValor5());
        fields += " FCD_DATOC5 = ?, ";
        values.add(this.getFcdDatoc5());
        fields += " FCD_VALORC5 = ?, ";
        values.add(this.getFcdValorc5());
        fields += " FCD_DATO6 = ?, ";
        values.add(this.getFcdDato6());
        fields += " FCD_VALOR6 = ?, ";
        values.add(this.getFcdValor6());
        fields += " FCD_DATOC6 = ?, ";
        values.add(this.getFcdDatoc6());
        fields += " FCD_VALORC6 = ?, ";
        values.add(this.getFcdValorc6());
        fields += " FCD_STATUS = ?, ";
        values.add(this.getFcdStatus());
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
        String sql = "INSERT INTO F_CONCILIA_DIA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCD_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFcdIdSecuencial());

        fields += ", FCD_ID_BANCO";
        fieldValues += ", ?";
        values.add(this.getFcdIdBanco());

        fields += ", FCD_ID_INTERFASE";
        fieldValues += ", ?";
        values.add(this.getFcdIdInterfase());

        fields += ", FCD_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFcdFecha());

        fields += ", FCD_ID_CONCILIACION";
        fieldValues += ", ?";
        values.add(this.getFcdIdConciliacion());

        fields += ", FCD_DATO1";
        fieldValues += ", ?";
        values.add(this.getFcdDato1());

        fields += ", FCD_VALOR1";
        fieldValues += ", ?";
        values.add(this.getFcdValor1());

        fields += ", FCD_DATOC1";
        fieldValues += ", ?";
        values.add(this.getFcdDatoc1());

        fields += ", FCD_VALORC1";
        fieldValues += ", ?";
        values.add(this.getFcdValorc1());

        fields += ", FCD_DATO2";
        fieldValues += ", ?";
        values.add(this.getFcdDato2());

        fields += ", FCD_VALOR2";
        fieldValues += ", ?";
        values.add(this.getFcdValor2());

        fields += ", FCD_DATOC2";
        fieldValues += ", ?";
        values.add(this.getFcdDatoc2());

        fields += ", FCD_VALORC2";
        fieldValues += ", ?";
        values.add(this.getFcdValorc2());

        fields += ", FCD_DATO3";
        fieldValues += ", ?";
        values.add(this.getFcdDato3());

        fields += ", FCD_VALOR3";
        fieldValues += ", ?";
        values.add(this.getFcdValor3());

        fields += ", FCD_DATOC3";
        fieldValues += ", ?";
        values.add(this.getFcdDatoc3());

        fields += ", FCD_VALORC3";
        fieldValues += ", ?";
        values.add(this.getFcdValorc3());

        fields += ", FCD_DATO4";
        fieldValues += ", ?";
        values.add(this.getFcdDato4());

        fields += ", FCD_VALOR4";
        fieldValues += ", ?";
        values.add(this.getFcdValor4());

        fields += ", FCD_DATOC4";
        fieldValues += ", ?";
        values.add(this.getFcdDatoc4());

        fields += ", FCD_VALORC4";
        fieldValues += ", ?";
        values.add(this.getFcdValorc4());

        fields += ", FCD_DATO5";
        fieldValues += ", ?";
        values.add(this.getFcdDato5());

        fields += ", FCD_VALOR5";
        fieldValues += ", ?";
        values.add(this.getFcdValor5());

        fields += ", FCD_DATOC5";
        fieldValues += ", ?";
        values.add(this.getFcdDatoc5());

        fields += ", FCD_VALORC5";
        fieldValues += ", ?";
        values.add(this.getFcdValorc5());

        fields += ", FCD_DATO6";
        fieldValues += ", ?";
        values.add(this.getFcdDato6());

        fields += ", FCD_VALOR6";
        fieldValues += ", ?";
        values.add(this.getFcdValor6());

        fields += ", FCD_DATOC6";
        fieldValues += ", ?";
        values.add(this.getFcdDatoc6());

        fields += ", FCD_VALORC6";
        fieldValues += ", ?";
        values.add(this.getFcdValorc6());

        fields += ", FCD_STATUS";
        fieldValues += ", ?";
        values.add(this.getFcdStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONCILIA_DIA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCD_ID_SECUENCIAL = ?";
        values.add(this.getFcdIdSecuencial());
        conditions += " AND FCD_ID_BANCO = ?";
        values.add(this.getFcdIdBanco());
        conditions += " AND FCD_ID_INTERFASE = ?";
        values.add(this.getFcdIdInterfase());
        conditions += " AND FCD_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFcdFecha());
        conditions += " AND FCD_ID_CONCILIACION = ?";
        values.add(this.getFcdIdConciliacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FConciliaDia instance = (FConciliaDia) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcdIdSecuencial().equals(instance.getFcdIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFcdIdBanco().equals(instance.getFcdIdBanco()))
            equalObjects = false;
        if (equalObjects && !this.getFcdIdInterfase().equals(instance.getFcdIdInterfase()))
            equalObjects = false;
        if (equalObjects && !this.getFcdFecha().equals(instance.getFcdFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFcdIdConciliacion().equals(instance.getFcdIdConciliacion()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDato1().equals(instance.getFcdDato1()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValor1().equals(instance.getFcdValor1()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDatoc1().equals(instance.getFcdDatoc1()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValorc1().equals(instance.getFcdValorc1()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDato2().equals(instance.getFcdDato2()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValor2().equals(instance.getFcdValor2()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDatoc2().equals(instance.getFcdDatoc2()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValorc2().equals(instance.getFcdValorc2()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDato3().equals(instance.getFcdDato3()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValor3().equals(instance.getFcdValor3()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDatoc3().equals(instance.getFcdDatoc3()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValorc3().equals(instance.getFcdValorc3()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDato4().equals(instance.getFcdDato4()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValor4().equals(instance.getFcdValor4()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDatoc4().equals(instance.getFcdDatoc4()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValorc4().equals(instance.getFcdValorc4()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDato5().equals(instance.getFcdDato5()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValor5().equals(instance.getFcdValor5()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDatoc5().equals(instance.getFcdDatoc5()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValorc5().equals(instance.getFcdValorc5()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDato6().equals(instance.getFcdDato6()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValor6().equals(instance.getFcdValor6()))
            equalObjects = false;
        if (equalObjects && !this.getFcdDatoc6().equals(instance.getFcdDatoc6()))
            equalObjects = false;
        if (equalObjects && !this.getFcdValorc6().equals(instance.getFcdValorc6()))
            equalObjects = false;
        if (equalObjects && !this.getFcdStatus().equals(instance.getFcdStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FConciliaDia result = new FConciliaDia();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcdIdSecuencial((BigDecimal) objectData.getData("FCD_ID_SECUENCIAL"));
        result.setFcdIdBanco((BigDecimal) objectData.getData("FCD_ID_BANCO"));
        result.setFcdIdInterfase((BigDecimal) objectData.getData("FCD_ID_INTERFASE"));
        result.setFcdFecha((String) objectData.getData("FCD_FECHA"));
        result.setFcdIdConciliacion((BigDecimal) objectData.getData("FCD_ID_CONCILIACION"));
        result.setFcdDato1((String) objectData.getData("FCD_DATO1"));
        result.setFcdValor1((BigDecimal) objectData.getData("FCD_VALOR1"));
        result.setFcdDatoc1((String) objectData.getData("FCD_DATOC1"));
        result.setFcdValorc1((BigDecimal) objectData.getData("FCD_VALORC1"));
        result.setFcdDato2((String) objectData.getData("FCD_DATO2"));
        result.setFcdValor2((BigDecimal) objectData.getData("FCD_VALOR2"));
        result.setFcdDatoc2((String) objectData.getData("FCD_DATOC2"));
        result.setFcdValorc2((BigDecimal) objectData.getData("FCD_VALORC2"));
        result.setFcdDato3((String) objectData.getData("FCD_DATO3"));
        result.setFcdValor3((BigDecimal) objectData.getData("FCD_VALOR3"));
        result.setFcdDatoc3((String) objectData.getData("FCD_DATOC3"));
        result.setFcdValorc3((BigDecimal) objectData.getData("FCD_VALORC3"));
        result.setFcdDato4((String) objectData.getData("FCD_DATO4"));
        result.setFcdValor4((BigDecimal) objectData.getData("FCD_VALOR4"));
        result.setFcdDatoc4((String) objectData.getData("FCD_DATOC4"));
        result.setFcdValorc4((BigDecimal) objectData.getData("FCD_VALORC4"));
        result.setFcdDato5((String) objectData.getData("FCD_DATO5"));
        result.setFcdValor5((BigDecimal) objectData.getData("FCD_VALOR5"));
        result.setFcdDatoc5((String) objectData.getData("FCD_DATOC5"));
        result.setFcdValorc5((BigDecimal) objectData.getData("FCD_VALORC5"));
        result.setFcdDato6((String) objectData.getData("FCD_DATO6"));
        result.setFcdValor6((BigDecimal) objectData.getData("FCD_VALOR6"));
        result.setFcdDatoc6((String) objectData.getData("FCD_DATOC6"));
        result.setFcdValorc6((BigDecimal) objectData.getData("FCD_VALORC6"));
        result.setFcdStatus((String) objectData.getData("FCD_STATUS"));

        return result;

    }

}
