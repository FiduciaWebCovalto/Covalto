package com.fiduciawebmovil.auth_users.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OtpRequest {
    String email;
}
