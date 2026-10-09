package com.fiduciawebmovil.usuarios.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.fiduciawebmovil.role.entity.Role;

@Entity
@Table(name = "usuarios")
@Transactional
@NoArgsConstructor
public class Usuarios {

    @Id
    private Long usuNumUsuario;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "USU_NUM_USUARIO"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;


    private String usuTipoUsuario;

    @Column(length = 50)
    private String usuNomUsuario;

    @Column(length = 50)
    private String usuEmail;


    @Column(precision = 10, scale = 0)
    private BigDecimal usuNumPuesto;

    @Column(length = 50)
    private String usuNomPuesto;

    @Column(length = 25)
    private String usuPassword;

    @Column(length = 25)
    private String usuCveStUsuario;

    @Column
    private LocalDateTime usuFechaUltAcceso;

    @Column
    private Boolean usuToken;

    @Column(precision = 16, scale = 2)
    private BigDecimal usuMontoAutorizado;

    public Long getUsuNumUsuario() {
        return usuNumUsuario;
    }

    public void setUsuNumUsuario(final Long usuNumUsuario) {
        this.usuNumUsuario = usuNumUsuario;
    }

    public String getUsuNomUsuario() {
        return usuNomUsuario;
    }

    public void setUsuNomUsuario(final String usuNomUsuario) {
        this.usuNomUsuario = usuNomUsuario;
    }


    public BigDecimal getUsuNumPuesto() {
        return usuNumPuesto;
    }

    public void setUsuNumPuesto(final BigDecimal usuNumPuesto) {
        this.usuNumPuesto = usuNumPuesto;
    }

    public String getUsuNomPuesto() {
        return usuNomPuesto;
    }

    public void setUsuNomPuesto(final String usuNomPuesto) {
        this.usuNomPuesto = usuNomPuesto;
    }

    public String getUsuPassword() {
        return usuPassword;
    }

    public void setUsuPassword(final String usuPassword) {
        this.usuPassword = usuPassword;
    }


    public String getUsuCveStUsuario() {
        return usuCveStUsuario;
    }

    public void setUsuCveStUsuario(final String usuCveStUsuario) {
        this.usuCveStUsuario = usuCveStUsuario;
    }

    public LocalDateTime getUsuFechaUltAcceso() {
        return usuFechaUltAcceso;
    }

    public void setUsuFechaUltAcceso(final LocalDateTime usuFechaUltAcceso) {
        this.usuFechaUltAcceso = usuFechaUltAcceso;
    }


    public Boolean getUsuToken() {
        return usuToken;
    }

    public void setUsuToken(final Boolean usuToken) {
        this.usuToken = usuToken;
    }

    public BigDecimal getUsuMontoAutorizado() {
        return usuMontoAutorizado;
    }

    public void setUsuMontoAutorizado(final BigDecimal usuMontoAutorizado) {
        this.usuMontoAutorizado = usuMontoAutorizado;
    }

    public String getUsuEmail() {
        return usuEmail;
    }

    public void setUsuEmail(String usuEmail) {
        this.usuEmail = usuEmail;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getUsuTipoUsuario() {
        return usuTipoUsuario;
    }

    public void setUsuTipoUsuario(String usuTipoUsuario) {
        this.usuTipoUsuario = usuTipoUsuario;
    }

}
