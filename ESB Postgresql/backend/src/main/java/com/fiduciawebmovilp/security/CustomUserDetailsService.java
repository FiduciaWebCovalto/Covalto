package com.fiduciawebmovilp.security;


import com.fiduciawebmovilp.exceptions.NotFoundException;
import com.fiduciawebmovilp.fusuario.entity.FUsuario;
import com.fiduciawebmovilp.fusuario.repo.FUsuarioRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final FUsuarioRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        FUsuario user =userRepo.findByEmail(username)
                .orElseThrow(()-> new NotFoundException("Email Not Found"));

        return AuthUser.builder()
                .user(user)
                .build();
    }
}
