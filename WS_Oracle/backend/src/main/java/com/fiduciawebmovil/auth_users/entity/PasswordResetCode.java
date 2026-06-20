package com.fiduciawebmovil.auth_users.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import com.fiduciawebmovil.usuarios.entity.Usuarios;

@Entity
@Data
@Builder
@Table(name = "password_reset_code")
@AllArgsConstructor
@NoArgsConstructor
public class PasswordResetCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String code;

    @OneToOne(targetEntity = Usuarios.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "USU_NUM_USUARIO")
    private Usuarios user;

    private LocalDateTime expiryDate;

    private boolean used;

}
