package com.fiduciawebmovil.indices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.util.Objects;



@Embeddable
public class FIndicesId {

    @Column(precision = 10, scale = 0)
    private Long eindIdIndice;

    public FIndicesId(Long eindIdIndice, Long eindIdSubindice) {
        this.eindIdIndice = eindIdIndice;
        this.eindIdSubindice = eindIdSubindice;
    }
    @Column(precision = 10, scale = 0)
    private Long eindIdSubindice;
        public FIndicesId() {
    }
        public Long getEindIdIndice() {
        return eindIdIndice;
    }
    public void setEindIdIndice(Long eindIdIndice) {
        this.eindIdIndice = eindIdIndice;
    }
    public Long getEindIdSubindice() {
        return eindIdSubindice;
    }
    public void setEindIdSubindice(Long eindIdSubindice) {
        this.eindIdSubindice = eindIdSubindice;
    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FIndicesId that = (FIndicesId) o;
        return Objects.equals(eindIdIndice, that.eindIdIndice) &&
         Objects.equals(eindIdSubindice, that.eindIdSubindice);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eindIdIndice, eindIdSubindice);
    }
}
