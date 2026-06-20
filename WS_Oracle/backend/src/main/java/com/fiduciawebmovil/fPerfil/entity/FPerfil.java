package com.fiduciawebmovil.fPerfil.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Table(name = "f_perfil")
@Entity
public class FPerfil {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Long fperIdPerfil;

    @Column
    private String fperNombrePerfil;

    @Column(precision = 16, scale = 2)
    private BigDecimal fperImporteDispOpmon;

    @Column(precision = 10, scale = 0)
    private BigDecimal fperTipoOpemonAut;

    @Column(precision = 10, scale = 2)
    private BigDecimal fperInterno;

    public Long getFperIdPerfil() {
        return fperIdPerfil;
    }

    public void setFperIdPerfil(final Long fperIdPerfil) {
        this.fperIdPerfil = fperIdPerfil;
    }

    public String getFperNombrePerfil() {
        return fperNombrePerfil;
    }

    public void setFperNombrePerfil(final String fperNombrePerfil) {
        this.fperNombrePerfil = fperNombrePerfil;
    }

    public BigDecimal getFperImporteDispOpmon() {
        return fperImporteDispOpmon;
    }

    public void setFperImporteDispOpmon(final BigDecimal fperImporteDispOpmon) {
        this.fperImporteDispOpmon = fperImporteDispOpmon;
    }

    public BigDecimal getFperTipoOpemonAut() {
        return fperTipoOpemonAut;
    }

    public void setFperTipoOpemonAut(final BigDecimal fperTipoOpemonAut) {
        this.fperTipoOpemonAut = fperTipoOpemonAut;
    }

    public BigDecimal getFperInterno() {
        return fperInterno;
    }

    public void setFperInterno(final BigDecimal fperInterno) {
        this.fperInterno = fperInterno;
    }

}
