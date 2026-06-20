package com.bancomext.domain;







import java.math.BigDecimal;

import javax.persistence.Id;


public class FPerfil {

    public Long fperIdPerfil;

    
    public String fperNombrePerfil;

    
    public BigDecimal fperImporteDispOpmon;

    
    public BigDecimal fperTipoOpemonAut;

    public BigDecimal fperInterno;

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
