package com.fiduciawebmovilp.fusuario.entity;

import com.fiduciawebmovilp.role.entity.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data
@Builder
@Table(name = "f_usuario")
@AllArgsConstructor
@NoArgsConstructor
public class FUsuario {


    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;
    private String password;

    @Column(length = 150)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String fusuNombreUsuario;

    @Column(length = 20)
    private String fusuStatus;

    @NotBlank(message = "El email no puede estar vacío")
    @Column(length = 100)
    private String email;

    private Long fperIdPerfil;

    @Column
    private String fusuImpMaximo;

    @Column(nullable = true)
    private LocalDateTime fusuUltAcceso;
    @Column(nullable = true)
    private LocalDateTime fusuCreacion;


    public Long getFperIdPerfil() {
        return fperIdPerfil;
    }

    public void SetFperIdPerfil(Long fperIdPerfil) {
        this.fperIdPerfil = fperIdPerfil;
    }

    public Long getUserId() {
        return id;
    }

    public void SetUserId(Long id) {
        this.id = id;
    }

    public String getFusuNombreUsuario() {
        return fusuNombreUsuario;
    }

    public void setFusuNombreUsuario(String fusuNombreUsuario) {
        this.fusuNombreUsuario = fusuNombreUsuario;
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
}
