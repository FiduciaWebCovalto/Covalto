package mx.com.inscitech.clients.domain;







import java.math.BigDecimal;

import javax.persistence.EmbeddedId;


public class FIndices {
    @EmbeddedId
    public FIndicesDTO id;

    
    public BigDecimal eindIdIndice;

    
    public BigDecimal eindIdSubindice;

    
    public String eindDescripcion;

    
    public String eindFormaEmp;

    
    public String eindParam1;

    
    public String eindDesParam1;

    
    public String eindParam2;

    
    public String eindDesParam2;

    
    public String eindStIndices;

    public void setId(FIndicesDTO id) {
        this.id = id;
    }

    public FIndicesDTO getId() {
        return id;
    }

    public BigDecimal getEindIdIndice() {
        return eindIdIndice;
    }

    public void setEindIdIndice(final BigDecimal eindIdIndice) {
        this.eindIdIndice = eindIdIndice;
    }

    public BigDecimal getEindIdSubindice() {
        return eindIdSubindice;
    }

    public void setEindIdSubindice(final BigDecimal eindIdSubindice) {
        this.eindIdSubindice = eindIdSubindice;
    }

    public String getEindDescripcion() {
        return eindDescripcion;
    }

    public void setEindDescripcion(final String eindDescripcion) {
        this.eindDescripcion = eindDescripcion;
    }

    public String getEindFormaEmp() {
        return eindFormaEmp;
    }

    public void setEindFormaEmp(final String eindFormaEmp) {
        this.eindFormaEmp = eindFormaEmp;
    }

    public String getEindParam1() {
        return eindParam1;
    }

    public void setEindParam1(final String eindParam1) {
        this.eindParam1 = eindParam1;
    }

    public String getEindDesParam1() {
        return eindDesParam1;
    }

    public void setEindDesParam1(final String eindDesParam1) {
        this.eindDesParam1 = eindDesParam1;
    }

    public String getEindParam2() {
        return eindParam2;
    }

    public void setEindParam2(final String eindParam2) {
        this.eindParam2 = eindParam2;
    }

    public String getEindDesParam2() {
        return eindDesParam2;
    }

    public void setEindDesParam2(final String eindDesParam2) {
        this.eindDesParam2 = eindDesParam2;
    }

    public String getEindStIndices() {
        return eindStIndices;
    }

    public void setEindStIndices(final String eindStIndices) {
        this.eindStIndices = eindStIndices;
    }

}
