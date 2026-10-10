package com.fiduciawebmovilp.fusuario.services;

import com.fiduciawebmovilp.auth_users.dtos.UpdatePasswordRequest;
import com.fiduciawebmovilp.fusuario.entity.FUsuario;
import com.fiduciawebmovilp.res.Response;

public interface FUsuarioService {

    FUsuario save(FUsuario id);

    Response<?> updatePassword(UpdatePasswordRequest updatePasswordRequest);

    FUsuario getCurrentLoggedInUser();
}
