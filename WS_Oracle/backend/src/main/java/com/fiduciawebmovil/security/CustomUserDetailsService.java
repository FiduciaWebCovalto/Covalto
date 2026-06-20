package com.fiduciawebmovil.security;


import com.fiduciawebmovil.exceptions.NotFoundException;
import com.fiduciawebmovil.usuarios.entity.Usuarios;
import com.fiduciawebmovil.usuarios.repo.UsuariosRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuariosRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuarios user =userRepo.findByUsuEmail(username)
                .orElseThrow(()-> new NotFoundException("Email Not Found "+username));

        return AuthUser.builder()
                .user(user)
                .build();
    }
}
