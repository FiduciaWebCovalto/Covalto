package com.fiduciawebmovil.retinver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import com.fiduciawebmovil.bitacora.entity.BitacoraId;


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
