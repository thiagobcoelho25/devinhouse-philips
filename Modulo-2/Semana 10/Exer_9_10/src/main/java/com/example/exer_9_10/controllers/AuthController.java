package com.example.exer_9_10.controllers;

import com.example.exer_9_10.dto.LoginDTO;
import com.example.exer_9_10.models.Usuario;

import com.example.exer_9_10.services.TokenServicePersonalizado;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.token.TokenService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/hello")
public class AuthController {

    private final AuthenticationManager authenticationManager;

    private final TokenServicePersonalizado tokenServicePersonalizado;

    public AuthController(AuthenticationManager authenticationManager, TokenServicePersonalizado tokenServicePersonalizado) {
        this.authenticationManager = authenticationManager;
        this.tokenServicePersonalizado = tokenServicePersonalizado;
    }


    @PostMapping()
    public String autenticar(@RequestBody LoginDTO loginDTO){
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(loginDTO.getLogin(), loginDTO.getSenha());

        Authentication authentication = this.authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        Usuario usuario = (Usuario) authentication.getPrincipal();

        String token = tokenServicePersonalizado.gerarToken(usuario);

        return token;
    }

}
