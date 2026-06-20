package com.fiduciawebmovil.usuarios.services;

import com.fiduciawebmovil.auth_users.dtos.UpdatePasswordRequest;
import com.fiduciawebmovil.res.Response;
import com.fiduciawebmovil.usuarios.entity.Usuarios;

public interface UsuariosService {
        
   // Optional<FUsuarioDTO> findByFusuNombreUsuario(String fusuNombreUsuario);
    //Usuarios save(Usuarios id);
    public Response<?> updatePassword(UpdatePasswordRequest updatePasswordRequest);
    public Usuarios getCurrentLoggedInUser() ;
    
}
