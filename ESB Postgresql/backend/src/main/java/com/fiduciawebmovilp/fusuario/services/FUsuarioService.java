package com.fiduciawebmovilp.fusuario.services;



import java.util.List;
import java.util.Optional;

import com.fiduciawebmovilp.auth_users.dtos.UpdatePasswordRequest;
import com.fiduciawebmovilp.fusuario.entity.FUsuario;
import com.fiduciawebmovilp.res.Response;

public interface FUsuarioService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    FUsuario save(FUsuario id);
    public Response<?> updatePassword(UpdatePasswordRequest updatePasswordRequest);
    public FUsuario getCurrentLoggedInUser() ;
    
}
