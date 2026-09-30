package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_LAYOUT_PK", columns = { "FLY_ID_BANCO", "FLY_ID_INTERFASE", "FLY_ID_LAYOUT", "FLY_CAMPO_TARGET3" }, sequences = { "MANUAL" })
public class FLayout extends DomainObject {

    BigDecimal flyIdBanco = null;
    BigDecimal flyIdInterfase = null;
    BigDecimal flyIdLayout = null;
    String flyNomLayout = null;
    BigDecimal flyInicioFecha = null;
    String flyFormatoFecha = null;
    String flyNomCampo1 = null;
    BigDecimal flyInicio1 = null;
    BigDecimal flyLongitud1 = null;
    BigDecimal flyDecimales1 = null;
    String flyTablaTarget1 = null;
    String flyCampoTarget1 = null;
    String flyNomCampo2 = null;
    BigDecimal flyInicio2 = null;
    BigDecimal flyLongitud2 = null;
    BigDecimal flyDecimales2 = null;
    String flyTablaTarget2 = null;
    String flyCampoTarget2 = null;
    String flyNomCampo3 = null;
    BigDecimal flyInicio3 = null;
    BigDecimal flyLongitud3 = null;
    BigDecimal flyDecimales3 = null;
    String flyTablaTarget3 = null;
    String flyCampoTarget3 = null;
    String flyNomCampo4 = null;
    BigDecimal flyInicio4 = null;
    BigDecimal flyLongitud4 = null;
    BigDecimal flyDecimales4 = null;
    String flyTablaTarget4 = null;
    String flyCampoTarget4 = null;
    String flyNomCampo5 = null;
    BigDecimal flyInicio5 = null;
    BigDecimal flyLongitud5 = null;
    BigDecimal flyDecimales5 = null;
    String flyTablaTarget5 = null;
    String flyCampoTarget5 = null;
    String flyNomCampo6 = null;
    BigDecimal flyInicio6 = null;
    BigDecimal flyLongitud6 = null;
    BigDecimal flyDecimales6 = null;
    String flyTablaTarget6 = null;
    String flyCampoTarget6 = null;

    public FLayout() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyIdBanco(BigDecimal flyIdBanco) {
        this.flyIdBanco = flyIdBanco;
    }

    public BigDecimal getFlyIdBanco() {
        return this.flyIdBanco;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyIdInterfase(BigDecimal flyIdInterfase) {
        this.flyIdInterfase = flyIdInterfase;
    }

    public BigDecimal getFlyIdInterfase() {
        return this.flyIdInterfase;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyIdLayout(BigDecimal flyIdLayout) {
        this.flyIdLayout = flyIdLayout;
    }

    public BigDecimal getFlyIdLayout() {
        return this.flyIdLayout;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyNomLayout(String flyNomLayout) {
        this.flyNomLayout = flyNomLayout;
    }

    public String getFlyNomLayout() {
        return this.flyNomLayout;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyInicioFecha(BigDecimal flyInicioFecha) {
        this.flyInicioFecha = flyInicioFecha;
    }

    public BigDecimal getFlyInicioFecha() {
        return this.flyInicioFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyFormatoFecha(String flyFormatoFecha) {
        this.flyFormatoFecha = flyFormatoFecha;
    }

    public String getFlyFormatoFecha() {
        return this.flyFormatoFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyNomCampo1(String flyNomCampo1) {
        this.flyNomCampo1 = flyNomCampo1;
    }

    public String getFlyNomCampo1() {
        return this.flyNomCampo1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyInicio1(BigDecimal flyInicio1) {
        this.flyInicio1 = flyInicio1;
    }

    public BigDecimal getFlyInicio1() {
        return this.flyInicio1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyLongitud1(BigDecimal flyLongitud1) {
        this.flyLongitud1 = flyLongitud1;
    }

    public BigDecimal getFlyLongitud1() {
        return this.flyLongitud1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyDecimales1(BigDecimal flyDecimales1) {
        this.flyDecimales1 = flyDecimales1;
    }

    public BigDecimal getFlyDecimales1() {
        return this.flyDecimales1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyTablaTarget1(String flyTablaTarget1) {
        this.flyTablaTarget1 = flyTablaTarget1;
    }

    public String getFlyTablaTarget1() {
        return this.flyTablaTarget1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyCampoTarget1(String flyCampoTarget1) {
        this.flyCampoTarget1 = flyCampoTarget1;
    }

    public String getFlyCampoTarget1() {
        return this.flyCampoTarget1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyNomCampo2(String flyNomCampo2) {
        this.flyNomCampo2 = flyNomCampo2;
    }

    public String getFlyNomCampo2() {
        return this.flyNomCampo2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyInicio2(BigDecimal flyInicio2) {
        this.flyInicio2 = flyInicio2;
    }

    public BigDecimal getFlyInicio2() {
        return this.flyInicio2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyLongitud2(BigDecimal flyLongitud2) {
        this.flyLongitud2 = flyLongitud2;
    }

    public BigDecimal getFlyLongitud2() {
        return this.flyLongitud2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyDecimales2(BigDecimal flyDecimales2) {
        this.flyDecimales2 = flyDecimales2;
    }

    public BigDecimal getFlyDecimales2() {
        return this.flyDecimales2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyTablaTarget2(String flyTablaTarget2) {
        this.flyTablaTarget2 = flyTablaTarget2;
    }

    public String getFlyTablaTarget2() {
        return this.flyTablaTarget2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyCampoTarget2(String flyCampoTarget2) {
        this.flyCampoTarget2 = flyCampoTarget2;
    }

    public String getFlyCampoTarget2() {
        return this.flyCampoTarget2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyNomCampo3(String flyNomCampo3) {
        this.flyNomCampo3 = flyNomCampo3;
    }

    public String getFlyNomCampo3() {
        return this.flyNomCampo3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyInicio3(BigDecimal flyInicio3) {
        this.flyInicio3 = flyInicio3;
    }

    public BigDecimal getFlyInicio3() {
        return this.flyInicio3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyLongitud3(BigDecimal flyLongitud3) {
        this.flyLongitud3 = flyLongitud3;
    }

    public BigDecimal getFlyLongitud3() {
        return this.flyLongitud3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyDecimales3(BigDecimal flyDecimales3) {
        this.flyDecimales3 = flyDecimales3;
    }

    public BigDecimal getFlyDecimales3() {
        return this.flyDecimales3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyTablaTarget3(String flyTablaTarget3) {
        this.flyTablaTarget3 = flyTablaTarget3;
    }

    public String getFlyTablaTarget3() {
        return this.flyTablaTarget3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyCampoTarget3(String flyCampoTarget3) {
        this.flyCampoTarget3 = flyCampoTarget3;
    }

    public String getFlyCampoTarget3() {
        return this.flyCampoTarget3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyNomCampo4(String flyNomCampo4) {
        this.flyNomCampo4 = flyNomCampo4;
    }

    public String getFlyNomCampo4() {
        return this.flyNomCampo4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyInicio4(BigDecimal flyInicio4) {
        this.flyInicio4 = flyInicio4;
    }

    public BigDecimal getFlyInicio4() {
        return this.flyInicio4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyLongitud4(BigDecimal flyLongitud4) {
        this.flyLongitud4 = flyLongitud4;
    }

    public BigDecimal getFlyLongitud4() {
        return this.flyLongitud4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyDecimales4(BigDecimal flyDecimales4) {
        this.flyDecimales4 = flyDecimales4;
    }

    public BigDecimal getFlyDecimales4() {
        return this.flyDecimales4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyTablaTarget4(String flyTablaTarget4) {
        this.flyTablaTarget4 = flyTablaTarget4;
    }

    public String getFlyTablaTarget4() {
        return this.flyTablaTarget4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyCampoTarget4(String flyCampoTarget4) {
        this.flyCampoTarget4 = flyCampoTarget4;
    }

    public String getFlyCampoTarget4() {
        return this.flyCampoTarget4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyNomCampo5(String flyNomCampo5) {
        this.flyNomCampo5 = flyNomCampo5;
    }

    public String getFlyNomCampo5() {
        return this.flyNomCampo5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyInicio5(BigDecimal flyInicio5) {
        this.flyInicio5 = flyInicio5;
    }

    public BigDecimal getFlyInicio5() {
        return this.flyInicio5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyLongitud5(BigDecimal flyLongitud5) {
        this.flyLongitud5 = flyLongitud5;
    }

    public BigDecimal getFlyLongitud5() {
        return this.flyLongitud5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyDecimales5(BigDecimal flyDecimales5) {
        this.flyDecimales5 = flyDecimales5;
    }

    public BigDecimal getFlyDecimales5() {
        return this.flyDecimales5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyTablaTarget5(String flyTablaTarget5) {
        this.flyTablaTarget5 = flyTablaTarget5;
    }

    public String getFlyTablaTarget5() {
        return this.flyTablaTarget5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyCampoTarget5(String flyCampoTarget5) {
        this.flyCampoTarget5 = flyCampoTarget5;
    }

    public String getFlyCampoTarget5() {
        return this.flyCampoTarget5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyNomCampo6(String flyNomCampo6) {
        this.flyNomCampo6 = flyNomCampo6;
    }

    public String getFlyNomCampo6() {
        return this.flyNomCampo6;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyInicio6(BigDecimal flyInicio6) {
        this.flyInicio6 = flyInicio6;
    }

    public BigDecimal getFlyInicio6() {
        return this.flyInicio6;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyLongitud6(BigDecimal flyLongitud6) {
        this.flyLongitud6 = flyLongitud6;
    }

    public BigDecimal getFlyLongitud6() {
        return this.flyLongitud6;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFlyDecimales6(BigDecimal flyDecimales6) {
        this.flyDecimales6 = flyDecimales6;
    }

    public BigDecimal getFlyDecimales6() {
        return this.flyDecimales6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyTablaTarget6(String flyTablaTarget6) {
        this.flyTablaTarget6 = flyTablaTarget6;
    }

    public String getFlyTablaTarget6() {
        return this.flyTablaTarget6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFlyCampoTarget6(String flyCampoTarget6) {
        this.flyCampoTarget6 = flyCampoTarget6;
    }

    public String getFlyCampoTarget6() {
        return this.flyCampoTarget6;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_LAYOUT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFlyIdBanco() != null && this.getFlyIdBanco().longValue() == -999) {
            conditions += " AND FLY_ID_BANCO IS NULL";
        } else if (this.getFlyIdBanco() != null) {
            conditions += " AND FLY_ID_BANCO = ?";
            values.add(this.getFlyIdBanco());
        }

        if (this.getFlyIdInterfase() != null && this.getFlyIdInterfase().longValue() == -999) {
            conditions += " AND FLY_ID_INTERFASE IS NULL";
        } else if (this.getFlyIdInterfase() != null) {
            conditions += " AND FLY_ID_INTERFASE = ?";
            values.add(this.getFlyIdInterfase());
        }

        if (this.getFlyIdLayout() != null && this.getFlyIdLayout().longValue() == -999) {
            conditions += " AND FLY_ID_LAYOUT IS NULL";
        } else if (this.getFlyIdLayout() != null) {
            conditions += " AND FLY_ID_LAYOUT = ?";
            values.add(this.getFlyIdLayout());
        }

        if (this.getFlyCampoTarget3() != null && "null".equals(this.getFlyCampoTarget3())) {
            conditions += " AND FLY_CAMPO_TARGET3 IS NULL";
        } else if (this.getFlyCampoTarget3() != null) {
            conditions += " AND FLY_CAMPO_TARGET3 = ?";
            values.add(this.getFlyCampoTarget3());
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
        String sql = "SELECT * FROM F_LAYOUT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFlyIdBanco() != null && this.getFlyIdBanco().longValue() == -999) {
            conditions += " AND FLY_ID_BANCO IS NULL";
        } else if (this.getFlyIdBanco() != null) {
            conditions += " AND FLY_ID_BANCO = ?";
            values.add(this.getFlyIdBanco());
        }

        if (this.getFlyIdInterfase() != null && this.getFlyIdInterfase().longValue() == -999) {
            conditions += " AND FLY_ID_INTERFASE IS NULL";
        } else if (this.getFlyIdInterfase() != null) {
            conditions += " AND FLY_ID_INTERFASE = ?";
            values.add(this.getFlyIdInterfase());
        }

        if (this.getFlyIdLayout() != null && this.getFlyIdLayout().longValue() == -999) {
            conditions += " AND FLY_ID_LAYOUT IS NULL";
        } else if (this.getFlyIdLayout() != null) {
            conditions += " AND FLY_ID_LAYOUT = ?";
            values.add(this.getFlyIdLayout());
        }

        if (this.getFlyNomLayout() != null && "null".equals(this.getFlyNomLayout())) {
            conditions += " AND FLY_NOM_LAYOUT IS NULL";
        } else if (this.getFlyNomLayout() != null) {
            conditions += " AND FLY_NOM_LAYOUT = ?";
            values.add(this.getFlyNomLayout());
        }

        if (this.getFlyInicioFecha() != null && this.getFlyInicioFecha().longValue() == -999) {
            conditions += " AND FLY_INICIO_FECHA IS NULL";
        } else if (this.getFlyInicioFecha() != null) {
            conditions += " AND FLY_INICIO_FECHA = ?";
            values.add(this.getFlyInicioFecha());
        }

        if (this.getFlyFormatoFecha() != null && "null".equals(this.getFlyFormatoFecha())) {
            conditions += " AND FLY_FORMATO_FECHA IS NULL";
        } else if (this.getFlyFormatoFecha() != null) {
            conditions += " AND FLY_FORMATO_FECHA = ?";
            values.add(this.getFlyFormatoFecha());
        }

        if (this.getFlyNomCampo1() != null && "null".equals(this.getFlyNomCampo1())) {
            conditions += " AND FLY_NOM_CAMPO1 IS NULL";
        } else if (this.getFlyNomCampo1() != null) {
            conditions += " AND FLY_NOM_CAMPO1 = ?";
            values.add(this.getFlyNomCampo1());
        }

        if (this.getFlyInicio1() != null && this.getFlyInicio1().longValue() == -999) {
            conditions += " AND FLY_INICIO1 IS NULL";
        } else if (this.getFlyInicio1() != null) {
            conditions += " AND FLY_INICIO1 = ?";
            values.add(this.getFlyInicio1());
        }

        if (this.getFlyLongitud1() != null && this.getFlyLongitud1().longValue() == -999) {
            conditions += " AND FLY_LONGITUD1 IS NULL";
        } else if (this.getFlyLongitud1() != null) {
            conditions += " AND FLY_LONGITUD1 = ?";
            values.add(this.getFlyLongitud1());
        }

        if (this.getFlyDecimales1() != null && this.getFlyDecimales1().longValue() == -999) {
            conditions += " AND FLY_DECIMALES1 IS NULL";
        } else if (this.getFlyDecimales1() != null) {
            conditions += " AND FLY_DECIMALES1 = ?";
            values.add(this.getFlyDecimales1());
        }

        if (this.getFlyTablaTarget1() != null && "null".equals(this.getFlyTablaTarget1())) {
            conditions += " AND FLY_TABLA_TARGET1 IS NULL";
        } else if (this.getFlyTablaTarget1() != null) {
            conditions += " AND FLY_TABLA_TARGET1 = ?";
            values.add(this.getFlyTablaTarget1());
        }

        if (this.getFlyCampoTarget1() != null && "null".equals(this.getFlyCampoTarget1())) {
            conditions += " AND FLY_CAMPO_TARGET1 IS NULL";
        } else if (this.getFlyCampoTarget1() != null) {
            conditions += " AND FLY_CAMPO_TARGET1 = ?";
            values.add(this.getFlyCampoTarget1());
        }

        if (this.getFlyNomCampo2() != null && "null".equals(this.getFlyNomCampo2())) {
            conditions += " AND FLY_NOM_CAMPO2 IS NULL";
        } else if (this.getFlyNomCampo2() != null) {
            conditions += " AND FLY_NOM_CAMPO2 = ?";
            values.add(this.getFlyNomCampo2());
        }

        if (this.getFlyInicio2() != null && this.getFlyInicio2().longValue() == -999) {
            conditions += " AND FLY_INICIO2 IS NULL";
        } else if (this.getFlyInicio2() != null) {
            conditions += " AND FLY_INICIO2 = ?";
            values.add(this.getFlyInicio2());
        }

        if (this.getFlyLongitud2() != null && this.getFlyLongitud2().longValue() == -999) {
            conditions += " AND FLY_LONGITUD2 IS NULL";
        } else if (this.getFlyLongitud2() != null) {
            conditions += " AND FLY_LONGITUD2 = ?";
            values.add(this.getFlyLongitud2());
        }

        if (this.getFlyDecimales2() != null && this.getFlyDecimales2().longValue() == -999) {
            conditions += " AND FLY_DECIMALES2 IS NULL";
        } else if (this.getFlyDecimales2() != null) {
            conditions += " AND FLY_DECIMALES2 = ?";
            values.add(this.getFlyDecimales2());
        }

        if (this.getFlyTablaTarget2() != null && "null".equals(this.getFlyTablaTarget2())) {
            conditions += " AND FLY_TABLA_TARGET2 IS NULL";
        } else if (this.getFlyTablaTarget2() != null) {
            conditions += " AND FLY_TABLA_TARGET2 = ?";
            values.add(this.getFlyTablaTarget2());
        }

        if (this.getFlyCampoTarget2() != null && "null".equals(this.getFlyCampoTarget2())) {
            conditions += " AND FLY_CAMPO_TARGET2 IS NULL";
        } else if (this.getFlyCampoTarget2() != null) {
            conditions += " AND FLY_CAMPO_TARGET2 = ?";
            values.add(this.getFlyCampoTarget2());
        }

        if (this.getFlyNomCampo3() != null && "null".equals(this.getFlyNomCampo3())) {
            conditions += " AND FLY_NOM_CAMPO3 IS NULL";
        } else if (this.getFlyNomCampo3() != null) {
            conditions += " AND FLY_NOM_CAMPO3 = ?";
            values.add(this.getFlyNomCampo3());
        }

        if (this.getFlyInicio3() != null && this.getFlyInicio3().longValue() == -999) {
            conditions += " AND FLY_INICIO3 IS NULL";
        } else if (this.getFlyInicio3() != null) {
            conditions += " AND FLY_INICIO3 = ?";
            values.add(this.getFlyInicio3());
        }

        if (this.getFlyLongitud3() != null && this.getFlyLongitud3().longValue() == -999) {
            conditions += " AND FLY_LONGITUD3 IS NULL";
        } else if (this.getFlyLongitud3() != null) {
            conditions += " AND FLY_LONGITUD3 = ?";
            values.add(this.getFlyLongitud3());
        }

        if (this.getFlyDecimales3() != null && this.getFlyDecimales3().longValue() == -999) {
            conditions += " AND FLY_DECIMALES3 IS NULL";
        } else if (this.getFlyDecimales3() != null) {
            conditions += " AND FLY_DECIMALES3 = ?";
            values.add(this.getFlyDecimales3());
        }

        if (this.getFlyTablaTarget3() != null && "null".equals(this.getFlyTablaTarget3())) {
            conditions += " AND FLY_TABLA_TARGET3 IS NULL";
        } else if (this.getFlyTablaTarget3() != null) {
            conditions += " AND FLY_TABLA_TARGET3 = ?";
            values.add(this.getFlyTablaTarget3());
        }

        if (this.getFlyCampoTarget3() != null && "null".equals(this.getFlyCampoTarget3())) {
            conditions += " AND FLY_CAMPO_TARGET3 IS NULL";
        } else if (this.getFlyCampoTarget3() != null) {
            conditions += " AND FLY_CAMPO_TARGET3 = ?";
            values.add(this.getFlyCampoTarget3());
        }

        if (this.getFlyNomCampo4() != null && "null".equals(this.getFlyNomCampo4())) {
            conditions += " AND FLY_NOM_CAMPO4 IS NULL";
        } else if (this.getFlyNomCampo4() != null) {
            conditions += " AND FLY_NOM_CAMPO4 = ?";
            values.add(this.getFlyNomCampo4());
        }

        if (this.getFlyInicio4() != null && this.getFlyInicio4().longValue() == -999) {
            conditions += " AND FLY_INICIO4 IS NULL";
        } else if (this.getFlyInicio4() != null) {
            conditions += " AND FLY_INICIO4 = ?";
            values.add(this.getFlyInicio4());
        }

        if (this.getFlyLongitud4() != null && this.getFlyLongitud4().longValue() == -999) {
            conditions += " AND FLY_LONGITUD4 IS NULL";
        } else if (this.getFlyLongitud4() != null) {
            conditions += " AND FLY_LONGITUD4 = ?";
            values.add(this.getFlyLongitud4());
        }

        if (this.getFlyDecimales4() != null && this.getFlyDecimales4().longValue() == -999) {
            conditions += " AND FLY_DECIMALES4 IS NULL";
        } else if (this.getFlyDecimales4() != null) {
            conditions += " AND FLY_DECIMALES4 = ?";
            values.add(this.getFlyDecimales4());
        }

        if (this.getFlyTablaTarget4() != null && "null".equals(this.getFlyTablaTarget4())) {
            conditions += " AND FLY_TABLA_TARGET4 IS NULL";
        } else if (this.getFlyTablaTarget4() != null) {
            conditions += " AND FLY_TABLA_TARGET4 = ?";
            values.add(this.getFlyTablaTarget4());
        }

        if (this.getFlyCampoTarget4() != null && "null".equals(this.getFlyCampoTarget4())) {
            conditions += " AND FLY_CAMPO_TARGET4 IS NULL";
        } else if (this.getFlyCampoTarget4() != null) {
            conditions += " AND FLY_CAMPO_TARGET4 = ?";
            values.add(this.getFlyCampoTarget4());
        }

        if (this.getFlyNomCampo5() != null && "null".equals(this.getFlyNomCampo5())) {
            conditions += " AND FLY_NOM_CAMPO5 IS NULL";
        } else if (this.getFlyNomCampo5() != null) {
            conditions += " AND FLY_NOM_CAMPO5 = ?";
            values.add(this.getFlyNomCampo5());
        }

        if (this.getFlyInicio5() != null && this.getFlyInicio5().longValue() == -999) {
            conditions += " AND FLY_INICIO5 IS NULL";
        } else if (this.getFlyInicio5() != null) {
            conditions += " AND FLY_INICIO5 = ?";
            values.add(this.getFlyInicio5());
        }

        if (this.getFlyLongitud5() != null && this.getFlyLongitud5().longValue() == -999) {
            conditions += " AND FLY_LONGITUD5 IS NULL";
        } else if (this.getFlyLongitud5() != null) {
            conditions += " AND FLY_LONGITUD5 = ?";
            values.add(this.getFlyLongitud5());
        }

        if (this.getFlyDecimales5() != null && this.getFlyDecimales5().longValue() == -999) {
            conditions += " AND FLY_DECIMALES5 IS NULL";
        } else if (this.getFlyDecimales5() != null) {
            conditions += " AND FLY_DECIMALES5 = ?";
            values.add(this.getFlyDecimales5());
        }

        if (this.getFlyTablaTarget5() != null && "null".equals(this.getFlyTablaTarget5())) {
            conditions += " AND FLY_TABLA_TARGET5 IS NULL";
        } else if (this.getFlyTablaTarget5() != null) {
            conditions += " AND FLY_TABLA_TARGET5 = ?";
            values.add(this.getFlyTablaTarget5());
        }

        if (this.getFlyCampoTarget5() != null && "null".equals(this.getFlyCampoTarget5())) {
            conditions += " AND FLY_CAMPO_TARGET5 IS NULL";
        } else if (this.getFlyCampoTarget5() != null) {
            conditions += " AND FLY_CAMPO_TARGET5 = ?";
            values.add(this.getFlyCampoTarget5());
        }

        if (this.getFlyNomCampo6() != null && "null".equals(this.getFlyNomCampo6())) {
            conditions += " AND FLY_NOM_CAMPO6 IS NULL";
        } else if (this.getFlyNomCampo6() != null) {
            conditions += " AND FLY_NOM_CAMPO6 = ?";
            values.add(this.getFlyNomCampo6());
        }

        if (this.getFlyInicio6() != null && this.getFlyInicio6().longValue() == -999) {
            conditions += " AND FLY_INICIO6 IS NULL";
        } else if (this.getFlyInicio6() != null) {
            conditions += " AND FLY_INICIO6 = ?";
            values.add(this.getFlyInicio6());
        }

        if (this.getFlyLongitud6() != null && this.getFlyLongitud6().longValue() == -999) {
            conditions += " AND FLY_LONGITUD6 IS NULL";
        } else if (this.getFlyLongitud6() != null) {
            conditions += " AND FLY_LONGITUD6 = ?";
            values.add(this.getFlyLongitud6());
        }

        if (this.getFlyDecimales6() != null && this.getFlyDecimales6().longValue() == -999) {
            conditions += " AND FLY_DECIMALES6 IS NULL";
        } else if (this.getFlyDecimales6() != null) {
            conditions += " AND FLY_DECIMALES6 = ?";
            values.add(this.getFlyDecimales6());
        }

        if (this.getFlyTablaTarget6() != null && "null".equals(this.getFlyTablaTarget6())) {
            conditions += " AND FLY_TABLA_TARGET6 IS NULL";
        } else if (this.getFlyTablaTarget6() != null) {
            conditions += " AND FLY_TABLA_TARGET6 = ?";
            values.add(this.getFlyTablaTarget6());
        }

        if (this.getFlyCampoTarget6() != null && "null".equals(this.getFlyCampoTarget6())) {
            conditions += " AND FLY_CAMPO_TARGET6 IS NULL";
        } else if (this.getFlyCampoTarget6() != null) {
            conditions += " AND FLY_CAMPO_TARGET6 = ?";
            values.add(this.getFlyCampoTarget6());
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
        String sql = "UPDATE F_LAYOUT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FLY_ID_BANCO = ?";
        pkValues.add(this.getFlyIdBanco());
        conditions += " AND FLY_ID_INTERFASE = ?";
        pkValues.add(this.getFlyIdInterfase());
        conditions += " AND FLY_ID_LAYOUT = ?";
        pkValues.add(this.getFlyIdLayout());
        fields += " FLY_NOM_LAYOUT = ?, ";
        values.add(this.getFlyNomLayout());
        fields += " FLY_INICIO_FECHA = ?, ";
        values.add(this.getFlyInicioFecha());
        fields += " FLY_FORMATO_FECHA = ?, ";
        values.add(this.getFlyFormatoFecha());
        fields += " FLY_NOM_CAMPO1 = ?, ";
        values.add(this.getFlyNomCampo1());
        fields += " FLY_INICIO1 = ?, ";
        values.add(this.getFlyInicio1());
        fields += " FLY_LONGITUD1 = ?, ";
        values.add(this.getFlyLongitud1());
        fields += " FLY_DECIMALES1 = ?, ";
        values.add(this.getFlyDecimales1());
        fields += " FLY_TABLA_TARGET1 = ?, ";
        values.add(this.getFlyTablaTarget1());
        fields += " FLY_CAMPO_TARGET1 = ?, ";
        values.add(this.getFlyCampoTarget1());
        fields += " FLY_NOM_CAMPO2 = ?, ";
        values.add(this.getFlyNomCampo2());
        fields += " FLY_INICIO2 = ?, ";
        values.add(this.getFlyInicio2());
        fields += " FLY_LONGITUD2 = ?, ";
        values.add(this.getFlyLongitud2());
        fields += " FLY_DECIMALES2 = ?, ";
        values.add(this.getFlyDecimales2());
        fields += " FLY_TABLA_TARGET2 = ?, ";
        values.add(this.getFlyTablaTarget2());
        fields += " FLY_CAMPO_TARGET2 = ?, ";
        values.add(this.getFlyCampoTarget2());
        fields += " FLY_NOM_CAMPO3 = ?, ";
        values.add(this.getFlyNomCampo3());
        fields += " FLY_INICIO3 = ?, ";
        values.add(this.getFlyInicio3());
        fields += " FLY_LONGITUD3 = ?, ";
        values.add(this.getFlyLongitud3());
        fields += " FLY_DECIMALES3 = ?, ";
        values.add(this.getFlyDecimales3());
        fields += " FLY_TABLA_TARGET3 = ?, ";
        values.add(this.getFlyTablaTarget3());
        conditions += " AND FLY_CAMPO_TARGET3 = ?";
        pkValues.add(this.getFlyCampoTarget3());
        fields += " FLY_NOM_CAMPO4 = ?, ";
        values.add(this.getFlyNomCampo4());
        fields += " FLY_INICIO4 = ?, ";
        values.add(this.getFlyInicio4());
        fields += " FLY_LONGITUD4 = ?, ";
        values.add(this.getFlyLongitud4());
        fields += " FLY_DECIMALES4 = ?, ";
        values.add(this.getFlyDecimales4());
        fields += " FLY_TABLA_TARGET4 = ?, ";
        values.add(this.getFlyTablaTarget4());
        fields += " FLY_CAMPO_TARGET4 = ?, ";
        values.add(this.getFlyCampoTarget4());
        fields += " FLY_NOM_CAMPO5 = ?, ";
        values.add(this.getFlyNomCampo5());
        fields += " FLY_INICIO5 = ?, ";
        values.add(this.getFlyInicio5());
        fields += " FLY_LONGITUD5 = ?, ";
        values.add(this.getFlyLongitud5());
        fields += " FLY_DECIMALES5 = ?, ";
        values.add(this.getFlyDecimales5());
        fields += " FLY_TABLA_TARGET5 = ?, ";
        values.add(this.getFlyTablaTarget5());
        fields += " FLY_CAMPO_TARGET5 = ?, ";
        values.add(this.getFlyCampoTarget5());
        fields += " FLY_NOM_CAMPO6 = ?, ";
        values.add(this.getFlyNomCampo6());
        fields += " FLY_INICIO6 = ?, ";
        values.add(this.getFlyInicio6());
        fields += " FLY_LONGITUD6 = ?, ";
        values.add(this.getFlyLongitud6());
        fields += " FLY_DECIMALES6 = ?, ";
        values.add(this.getFlyDecimales6());
        fields += " FLY_TABLA_TARGET6 = ?, ";
        values.add(this.getFlyTablaTarget6());
        fields += " FLY_CAMPO_TARGET6 = ?, ";
        values.add(this.getFlyCampoTarget6());
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
        String sql = "INSERT INTO F_LAYOUT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FLY_ID_BANCO";
        fieldValues += ", ?";
        values.add(this.getFlyIdBanco());

        fields += ", FLY_ID_INTERFASE";
        fieldValues += ", ?";
        values.add(this.getFlyIdInterfase());

        fields += ", FLY_ID_LAYOUT";
        fieldValues += ", ?";
        values.add(this.getFlyIdLayout());

        fields += ", FLY_NOM_LAYOUT";
        fieldValues += ", ?";
        values.add(this.getFlyNomLayout());

        fields += ", FLY_INICIO_FECHA";
        fieldValues += ", ?";
        values.add(this.getFlyInicioFecha());

        fields += ", FLY_FORMATO_FECHA";
        fieldValues += ", ?";
        values.add(this.getFlyFormatoFecha());

        fields += ", FLY_NOM_CAMPO1";
        fieldValues += ", ?";
        values.add(this.getFlyNomCampo1());

        fields += ", FLY_INICIO1";
        fieldValues += ", ?";
        values.add(this.getFlyInicio1());

        fields += ", FLY_LONGITUD1";
        fieldValues += ", ?";
        values.add(this.getFlyLongitud1());

        fields += ", FLY_DECIMALES1";
        fieldValues += ", ?";
        values.add(this.getFlyDecimales1());

        fields += ", FLY_TABLA_TARGET1";
        fieldValues += ", ?";
        values.add(this.getFlyTablaTarget1());

        fields += ", FLY_CAMPO_TARGET1";
        fieldValues += ", ?";
        values.add(this.getFlyCampoTarget1());

        fields += ", FLY_NOM_CAMPO2";
        fieldValues += ", ?";
        values.add(this.getFlyNomCampo2());

        fields += ", FLY_INICIO2";
        fieldValues += ", ?";
        values.add(this.getFlyInicio2());

        fields += ", FLY_LONGITUD2";
        fieldValues += ", ?";
        values.add(this.getFlyLongitud2());

        fields += ", FLY_DECIMALES2";
        fieldValues += ", ?";
        values.add(this.getFlyDecimales2());

        fields += ", FLY_TABLA_TARGET2";
        fieldValues += ", ?";
        values.add(this.getFlyTablaTarget2());

        fields += ", FLY_CAMPO_TARGET2";
        fieldValues += ", ?";
        values.add(this.getFlyCampoTarget2());

        fields += ", FLY_NOM_CAMPO3";
        fieldValues += ", ?";
        values.add(this.getFlyNomCampo3());

        fields += ", FLY_INICIO3";
        fieldValues += ", ?";
        values.add(this.getFlyInicio3());

        fields += ", FLY_LONGITUD3";
        fieldValues += ", ?";
        values.add(this.getFlyLongitud3());

        fields += ", FLY_DECIMALES3";
        fieldValues += ", ?";
        values.add(this.getFlyDecimales3());

        fields += ", FLY_TABLA_TARGET3";
        fieldValues += ", ?";
        values.add(this.getFlyTablaTarget3());

        fields += ", FLY_CAMPO_TARGET3";
        fieldValues += ", ?";
        values.add(this.getFlyCampoTarget3());

        fields += ", FLY_NOM_CAMPO4";
        fieldValues += ", ?";
        values.add(this.getFlyNomCampo4());

        fields += ", FLY_INICIO4";
        fieldValues += ", ?";
        values.add(this.getFlyInicio4());

        fields += ", FLY_LONGITUD4";
        fieldValues += ", ?";
        values.add(this.getFlyLongitud4());

        fields += ", FLY_DECIMALES4";
        fieldValues += ", ?";
        values.add(this.getFlyDecimales4());

        fields += ", FLY_TABLA_TARGET4";
        fieldValues += ", ?";
        values.add(this.getFlyTablaTarget4());

        fields += ", FLY_CAMPO_TARGET4";
        fieldValues += ", ?";
        values.add(this.getFlyCampoTarget4());

        fields += ", FLY_NOM_CAMPO5";
        fieldValues += ", ?";
        values.add(this.getFlyNomCampo5());

        fields += ", FLY_INICIO5";
        fieldValues += ", ?";
        values.add(this.getFlyInicio5());

        fields += ", FLY_LONGITUD5";
        fieldValues += ", ?";
        values.add(this.getFlyLongitud5());

        fields += ", FLY_DECIMALES5";
        fieldValues += ", ?";
        values.add(this.getFlyDecimales5());

        fields += ", FLY_TABLA_TARGET5";
        fieldValues += ", ?";
        values.add(this.getFlyTablaTarget5());

        fields += ", FLY_CAMPO_TARGET5";
        fieldValues += ", ?";
        values.add(this.getFlyCampoTarget5());

        fields += ", FLY_NOM_CAMPO6";
        fieldValues += ", ?";
        values.add(this.getFlyNomCampo6());

        fields += ", FLY_INICIO6";
        fieldValues += ", ?";
        values.add(this.getFlyInicio6());

        fields += ", FLY_LONGITUD6";
        fieldValues += ", ?";
        values.add(this.getFlyLongitud6());

        fields += ", FLY_DECIMALES6";
        fieldValues += ", ?";
        values.add(this.getFlyDecimales6());

        fields += ", FLY_TABLA_TARGET6";
        fieldValues += ", ?";
        values.add(this.getFlyTablaTarget6());

        fields += ", FLY_CAMPO_TARGET6";
        fieldValues += ", ?";
        values.add(this.getFlyCampoTarget6());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_LAYOUT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FLY_ID_BANCO = ?";
        values.add(this.getFlyIdBanco());
        conditions += " AND FLY_ID_INTERFASE = ?";
        values.add(this.getFlyIdInterfase());
        conditions += " AND FLY_ID_LAYOUT = ?";
        values.add(this.getFlyIdLayout());
        conditions += " AND FLY_CAMPO_TARGET3 = ?";
        values.add(this.getFlyCampoTarget3());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FLayout instance = (FLayout) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFlyIdBanco().equals(instance.getFlyIdBanco()))
            equalObjects = false;
        if (equalObjects && !this.getFlyIdInterfase().equals(instance.getFlyIdInterfase()))
            equalObjects = false;
        if (equalObjects && !this.getFlyIdLayout().equals(instance.getFlyIdLayout()))
            equalObjects = false;
        if (equalObjects && !this.getFlyNomLayout().equals(instance.getFlyNomLayout()))
            equalObjects = false;
        if (equalObjects && !this.getFlyInicioFecha().equals(instance.getFlyInicioFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFlyFormatoFecha().equals(instance.getFlyFormatoFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFlyNomCampo1().equals(instance.getFlyNomCampo1()))
            equalObjects = false;
        if (equalObjects && !this.getFlyInicio1().equals(instance.getFlyInicio1()))
            equalObjects = false;
        if (equalObjects && !this.getFlyLongitud1().equals(instance.getFlyLongitud1()))
            equalObjects = false;
        if (equalObjects && !this.getFlyDecimales1().equals(instance.getFlyDecimales1()))
            equalObjects = false;
        if (equalObjects && !this.getFlyTablaTarget1().equals(instance.getFlyTablaTarget1()))
            equalObjects = false;
        if (equalObjects && !this.getFlyCampoTarget1().equals(instance.getFlyCampoTarget1()))
            equalObjects = false;
        if (equalObjects && !this.getFlyNomCampo2().equals(instance.getFlyNomCampo2()))
            equalObjects = false;
        if (equalObjects && !this.getFlyInicio2().equals(instance.getFlyInicio2()))
            equalObjects = false;
        if (equalObjects && !this.getFlyLongitud2().equals(instance.getFlyLongitud2()))
            equalObjects = false;
        if (equalObjects && !this.getFlyDecimales2().equals(instance.getFlyDecimales2()))
            equalObjects = false;
        if (equalObjects && !this.getFlyTablaTarget2().equals(instance.getFlyTablaTarget2()))
            equalObjects = false;
        if (equalObjects && !this.getFlyCampoTarget2().equals(instance.getFlyCampoTarget2()))
            equalObjects = false;
        if (equalObjects && !this.getFlyNomCampo3().equals(instance.getFlyNomCampo3()))
            equalObjects = false;
        if (equalObjects && !this.getFlyInicio3().equals(instance.getFlyInicio3()))
            equalObjects = false;
        if (equalObjects && !this.getFlyLongitud3().equals(instance.getFlyLongitud3()))
            equalObjects = false;
        if (equalObjects && !this.getFlyDecimales3().equals(instance.getFlyDecimales3()))
            equalObjects = false;
        if (equalObjects && !this.getFlyTablaTarget3().equals(instance.getFlyTablaTarget3()))
            equalObjects = false;
        if (equalObjects && !this.getFlyCampoTarget3().equals(instance.getFlyCampoTarget3()))
            equalObjects = false;
        if (equalObjects && !this.getFlyNomCampo4().equals(instance.getFlyNomCampo4()))
            equalObjects = false;
        if (equalObjects && !this.getFlyInicio4().equals(instance.getFlyInicio4()))
            equalObjects = false;
        if (equalObjects && !this.getFlyLongitud4().equals(instance.getFlyLongitud4()))
            equalObjects = false;
        if (equalObjects && !this.getFlyDecimales4().equals(instance.getFlyDecimales4()))
            equalObjects = false;
        if (equalObjects && !this.getFlyTablaTarget4().equals(instance.getFlyTablaTarget4()))
            equalObjects = false;
        if (equalObjects && !this.getFlyCampoTarget4().equals(instance.getFlyCampoTarget4()))
            equalObjects = false;
        if (equalObjects && !this.getFlyNomCampo5().equals(instance.getFlyNomCampo5()))
            equalObjects = false;
        if (equalObjects && !this.getFlyInicio5().equals(instance.getFlyInicio5()))
            equalObjects = false;
        if (equalObjects && !this.getFlyLongitud5().equals(instance.getFlyLongitud5()))
            equalObjects = false;
        if (equalObjects && !this.getFlyDecimales5().equals(instance.getFlyDecimales5()))
            equalObjects = false;
        if (equalObjects && !this.getFlyTablaTarget5().equals(instance.getFlyTablaTarget5()))
            equalObjects = false;
        if (equalObjects && !this.getFlyCampoTarget5().equals(instance.getFlyCampoTarget5()))
            equalObjects = false;
        if (equalObjects && !this.getFlyNomCampo6().equals(instance.getFlyNomCampo6()))
            equalObjects = false;
        if (equalObjects && !this.getFlyInicio6().equals(instance.getFlyInicio6()))
            equalObjects = false;
        if (equalObjects && !this.getFlyLongitud6().equals(instance.getFlyLongitud6()))
            equalObjects = false;
        if (equalObjects && !this.getFlyDecimales6().equals(instance.getFlyDecimales6()))
            equalObjects = false;
        if (equalObjects && !this.getFlyTablaTarget6().equals(instance.getFlyTablaTarget6()))
            equalObjects = false;
        if (equalObjects && !this.getFlyCampoTarget6().equals(instance.getFlyCampoTarget6()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FLayout result = new FLayout();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFlyIdBanco((BigDecimal) objectData.getData("FLY_ID_BANCO"));
        result.setFlyIdInterfase((BigDecimal) objectData.getData("FLY_ID_INTERFASE"));
        result.setFlyIdLayout((BigDecimal) objectData.getData("FLY_ID_LAYOUT"));
        result.setFlyNomLayout((String) objectData.getData("FLY_NOM_LAYOUT"));
        result.setFlyInicioFecha((BigDecimal) objectData.getData("FLY_INICIO_FECHA"));
        result.setFlyFormatoFecha((String) objectData.getData("FLY_FORMATO_FECHA"));
        result.setFlyNomCampo1((String) objectData.getData("FLY_NOM_CAMPO1"));
        result.setFlyInicio1((BigDecimal) objectData.getData("FLY_INICIO1"));
        result.setFlyLongitud1((BigDecimal) objectData.getData("FLY_LONGITUD1"));
        result.setFlyDecimales1((BigDecimal) objectData.getData("FLY_DECIMALES1"));
        result.setFlyTablaTarget1((String) objectData.getData("FLY_TABLA_TARGET1"));
        result.setFlyCampoTarget1((String) objectData.getData("FLY_CAMPO_TARGET1"));
        result.setFlyNomCampo2((String) objectData.getData("FLY_NOM_CAMPO2"));
        result.setFlyInicio2((BigDecimal) objectData.getData("FLY_INICIO2"));
        result.setFlyLongitud2((BigDecimal) objectData.getData("FLY_LONGITUD2"));
        result.setFlyDecimales2((BigDecimal) objectData.getData("FLY_DECIMALES2"));
        result.setFlyTablaTarget2((String) objectData.getData("FLY_TABLA_TARGET2"));
        result.setFlyCampoTarget2((String) objectData.getData("FLY_CAMPO_TARGET2"));
        result.setFlyNomCampo3((String) objectData.getData("FLY_NOM_CAMPO3"));
        result.setFlyInicio3((BigDecimal) objectData.getData("FLY_INICIO3"));
        result.setFlyLongitud3((BigDecimal) objectData.getData("FLY_LONGITUD3"));
        result.setFlyDecimales3((BigDecimal) objectData.getData("FLY_DECIMALES3"));
        result.setFlyTablaTarget3((String) objectData.getData("FLY_TABLA_TARGET3"));
        result.setFlyCampoTarget3((String) objectData.getData("FLY_CAMPO_TARGET3"));
        result.setFlyNomCampo4((String) objectData.getData("FLY_NOM_CAMPO4"));
        result.setFlyInicio4((BigDecimal) objectData.getData("FLY_INICIO4"));
        result.setFlyLongitud4((BigDecimal) objectData.getData("FLY_LONGITUD4"));
        result.setFlyDecimales4((BigDecimal) objectData.getData("FLY_DECIMALES4"));
        result.setFlyTablaTarget4((String) objectData.getData("FLY_TABLA_TARGET4"));
        result.setFlyCampoTarget4((String) objectData.getData("FLY_CAMPO_TARGET4"));
        result.setFlyNomCampo5((String) objectData.getData("FLY_NOM_CAMPO5"));
        result.setFlyInicio5((BigDecimal) objectData.getData("FLY_INICIO5"));
        result.setFlyLongitud5((BigDecimal) objectData.getData("FLY_LONGITUD5"));
        result.setFlyDecimales5((BigDecimal) objectData.getData("FLY_DECIMALES5"));
        result.setFlyTablaTarget5((String) objectData.getData("FLY_TABLA_TARGET5"));
        result.setFlyCampoTarget5((String) objectData.getData("FLY_CAMPO_TARGET5"));
        result.setFlyNomCampo6((String) objectData.getData("FLY_NOM_CAMPO6"));
        result.setFlyInicio6((BigDecimal) objectData.getData("FLY_INICIO6"));
        result.setFlyLongitud6((BigDecimal) objectData.getData("FLY_LONGITUD6"));
        result.setFlyDecimales6((BigDecimal) objectData.getData("FLY_DECIMALES6"));
        result.setFlyTablaTarget6((String) objectData.getData("FLY_TABLA_TARGET6"));
        result.setFlyCampoTarget6((String) objectData.getData("FLY_CAMPO_TARGET6"));

        return result;

    }

}
