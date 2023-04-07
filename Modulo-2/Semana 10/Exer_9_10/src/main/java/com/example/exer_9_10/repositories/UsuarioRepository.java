package com.example.exer_9_10.repositories;

import com.example.exer_9_10.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

//    Optional<Usuario> findByLogin(String login);
    Usuario findByLogin(String login);
}
