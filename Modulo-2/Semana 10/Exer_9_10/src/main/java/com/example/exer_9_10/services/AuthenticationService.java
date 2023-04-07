package com.example.exer_9_10.services;

import com.example.exer_9_10.repositories.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {


    private final UsuarioRepository usuarioRepository;

    public AuthenticationService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //return usuarioRepository.findByLogin(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        return usuarioRepository.findByLogin(username);
    }
}
