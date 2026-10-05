package mx.com.inscitech.clients.domain;







import java.math.BigDecimal;



public class Bitacora {


    public BitacoraDTO id;

    public Bitacora(BitacoraDTO id, String bitDetBitacora, BigDecimal bitAnoAltaReg, BigDecimal bitMesAltaReg,
                    BigDecimal bitDiaAltaReg, BigDecimal bitAnoUltMod, BigDecimal bitMesUltMod, BigDecimal bitDiaUltMod,
                    String bitCveStBitacor) {
        this.id = id;
        this.bitDetBitacora = bitDetBitacora;
        this.bitAnoAltaReg = bitAnoAltaReg;
        this.bitMesAltaReg = bitMesAltaReg;
        this.bitDiaAltaReg = bitDiaAltaReg;
        this.bitAnoUltMod = bitAnoUltMod;
        this.bitMesUltMod = bitMesUltMod;
        this.bitDiaUltMod = bitDiaUltMod;
        this.bitCveStBitacor = bitCveStBitacor;
    }

    private String bitDetBitacora;

    private BigDecimal bitAnoAltaReg;

    
    private BigDecimal bitMesAltaReg;

    
    private BigDecimal bitDiaAltaReg;

    private BigDecimal bitAnoUltMod;

    
    private BigDecimal bitMesUltMod;

    
    private BigDecimal bitDiaUltMod;

    
    private String bitCveStBitacor;


    public String getBitDetBitacora() {
        return bitDetBitacora;
    }

    public void setBitDetBitacora(final String bitDetBitacora) {
        this.bitDetBitacora = bitDetBitacora;
    }

    public BigDecimal getBitAnoAltaReg() {
        return bitAnoAltaReg;
    }

    public void setBitAnoAltaReg(final BigDecimal bitAnoAltaReg) {
        this.bitAnoAltaReg = bitAnoAltaReg;
    }

    public BigDecimal getBitMesAltaReg() {
        return bitMesAltaReg;
    }

    public void setBitMesAltaReg(final BigDecimal bitMesAltaReg) {
        this.bitMesAltaReg = bitMesAltaReg;
    }

    public BigDecimal getBitDiaAltaReg() {
        return bitDiaAltaReg;
    }

    public void setBitDiaAltaReg(final BigDecimal bitDiaAltaReg) {
        this.bitDiaAltaReg = bitDiaAltaReg;
    }

    public BigDecimal getBitAnoUltMod() {
        return bitAnoUltMod;
    }

    public void setBitAnoUltMod(final BigDecimal bitAnoUltMod) {
        this.bitAnoUltMod = bitAnoUltMod;
    }

    public BigDecimal getBitMesUltMod() {
        return bitMesUltMod;
    }

    public void setBitMesUltMod(final BigDecimal bitMesUltMod) {
        this.bitMesUltMod = bitMesUltMod;
    }

    public BigDecimal getBitDiaUltMod() {
        return bitDiaUltMod;
    }

    public void setBitDiaUltMod(final BigDecimal bitDiaUltMod) {
        this.bitDiaUltMod = bitDiaUltMod;
    }

    public String getBitCveStBitacor() {
        return bitCveStBitacor;
    }

    public void setBitCveStBitacor(final String bitCveStBitacor) {
        this.bitCveStBitacor = bitCveStBitacor;
    }

    public void setId(BitacoraDTO id) {
        this.id = id;
    }

    public BitacoraDTO getId() {
        return id;
    }
}
