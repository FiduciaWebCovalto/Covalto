package com.fiduciawebmovilp.auth_users.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
public class OtpRequest {
    @NotBlank(message = "Email is required")
    String email;
    String otp;
}
