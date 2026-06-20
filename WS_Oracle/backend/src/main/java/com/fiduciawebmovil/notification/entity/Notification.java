package com.fiduciawebmovil.notification.entity;


import com.fiduciawebmovil.enums.NotificationType;
import com.fiduciawebmovil.usuarios.entity.Usuarios;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notification {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
    private String recipient;

    private String body;

    @Enumerated(EnumType.STRING)
    private NotificationType type; // EMAIL, SMS, PUSH

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Usuarios user;

    private final LocalDateTime createdAt = LocalDateTime.now();
}
