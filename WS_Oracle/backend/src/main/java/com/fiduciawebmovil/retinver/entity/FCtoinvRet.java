package com.fiduciawebmovil.retinver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;



@Entity
@Table(name = "F_CTOINV_RET")
@NoArgsConstructor
public class FCtoinvRet {

    @EmbeddedId
    private FCtoinvRetId id;


    @Column(name = "FCVR_IMPORTE_X_CTOINV",precision = 16, scale = 2)
    private BigDecimal fcvrImporteXCtoinv;


    public BigDecimal getFcvrImporteXCtoinv() {
        return fcvrImporteXCtoinv;
    }

    public void setFcvrImporteXCtoinv(final BigDecimal fcvrImporteXCtoinv) {
        this.fcvrImporteXCtoinv = fcvrImporteXCtoinv;
    }

    public FCtoinvRetId getId() {
        return id;
    }

    public void setId(FCtoinvRetId id) {
        this.id = id;
    }


}
