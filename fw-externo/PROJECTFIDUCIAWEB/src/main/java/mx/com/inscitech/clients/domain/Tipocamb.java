package mx.com.inscitech.clients.domain;


public class Tipocamb {

    private TipocambDTO id;
    public Long ticImpTipoCamb;

    public void setId(TipocambDTO id) {
        this.id = id;
    }

    public TipocambDTO getId() {
        return id;
    }

    public void setTicImpTipoCamb(Long ticImpTipoCamb) {
        this.ticImpTipoCamb = ticImpTipoCamb;
    }

    public Long getTicImpTipoCamb() {
        return ticImpTipoCamb;
    }

    public void setTicAnoUltMod(Long ticAnoUltMod) {
        this.ticAnoUltMod = ticAnoUltMod;
    }

    public Long getTicAnoUltMod() {
        return ticAnoUltMod;
    }

    public void setTicMesUltMod(Long ticMesUltMod) {
        this.ticMesUltMod = ticMesUltMod;
    }

    public Long getTicMesUltMod() {
        return ticMesUltMod;
    }

    public void setTicDiaUltMod(Long ticDiaUltMod) {
        this.ticDiaUltMod = ticDiaUltMod;
    }

    public Long getTicDiaUltMod() {
        return ticDiaUltMod;
    }

    public void setTicCveStTipocam(String ticCveStTipocam) {
        this.ticCveStTipocam = ticCveStTipocam;
    }

    public String getTicCveStTipocam() {
        return ticCveStTipocam;
    }

    private Long ticAnoUltMod;


    private Long ticMesUltMod;

    private Long ticDiaUltMod;

    private String ticCveStTipocam;


}
