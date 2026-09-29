package com.bancomext.domain;




import java.time.LocalDate;

import java.time.LocalDateTime;

import javax.persistence.ManyToMany;


public class FUsuario {
    private Long id;
    private String password;
    private String fusuNombreUsuario;

    private String fusuStatus;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setFusuNombreUsuario(String fusuNombreUsuario) {
        this.fusuNombreUsuario = fusuNombreUsuario;
    }

    public String getFusuNombreUsuario() {
        return fusuNombreUsuario;
    }

    public void setFusuStatus(String fusuStatus) {
        this.fusuStatus = fusuStatus;
    }

    public String getFusuStatus() {
        return fusuStatus;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFperIdPerfil(Long fperIdPerfil) {
        this.fperIdPerfil = fperIdPerfil;
    }

    public Long getFperIdPerfil() {
        return fperIdPerfil;
    }

    public void setFusuImpMaximo(String fusuImpMaximo) {
        this.fusuImpMaximo = fusuImpMaximo;
    }

    public String getFusuImpMaximo() {
        return fusuImpMaximo;
    }

    public void setFusuUltAcceso(LocalDateTime fusuUltAcceso) {
        this.fusuUltAcceso = fusuUltAcceso;
    }

    public LocalDateTime getFusuUltAcceso() {
        return fusuUltAcceso;
    }

    public void setFusuCreacion(LocalDateTime fusuCreacion) {
        this.fusuCreacion = fusuCreacion;
    }

    public LocalDateTime getFusuCreacion() {
        return fusuCreacion;
    }

    private String email;

    private Long fperIdPerfil;

    private String fusuImpMaximo;

    private LocalDateTime fusuUltAcceso;
    private LocalDateTime fusuCreacion;


}
