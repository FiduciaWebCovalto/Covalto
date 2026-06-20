package com.fiduciawebmovil.fPerfil.dtos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class FPerfilDTO {
    private Long fperIdPerfil;
    private String fperNombrePerfil;

    public FPerfilDTO(Long fperIdPerfil,String fperNombrePerfil) {
        this.fperIdPerfil = fperIdPerfil;
        this.fperNombrePerfil = fperNombrePerfil;
    }
    public FPerfilDTO() {
    }    

}
