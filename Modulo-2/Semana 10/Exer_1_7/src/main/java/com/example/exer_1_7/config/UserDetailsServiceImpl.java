package com.example.exer_1_7.config;

import com.example.exer_1_7.repositories.UsuarioRepository;
import com.example.exer_1_7.repositories.models.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByNome(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));;
//        return new User(usuario.getUsername(), usuario.getPassword(),
//                true, true, true, true, usuario.getAuthorities());
        return usuario;
    }


}
