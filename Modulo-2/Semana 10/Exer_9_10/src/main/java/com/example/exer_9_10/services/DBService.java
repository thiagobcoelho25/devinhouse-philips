package com.example.exer_9_10.services;

import com.example.exer_9_10.models.Produto;
import com.example.exer_9_10.models.Usuario;
import com.example.exer_9_10.repositories.ProdutoRepository;
import com.example.exer_9_10.repositories.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.ParseException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DBService {

    private final UsuarioRepository usuarioRepository;

    private final ProdutoRepository produtoRepository;

    private final PasswordEncoder passwordEncoder;

    public DBService(UsuarioRepository usuarioRepository, ProdutoRepository produtoRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.produtoRepository = produtoRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public boolean instantiateDatabase() throws ParseException {

        Produto prod_1  = new Produto(null, "Shampoo Citrus", "Shamppo para cabelos ressecados", LocalDate.now(), 8.0);
        Produto prod_2  = new Produto(null, "Nuggets", "Frango empanados Sadia", LocalDate.now(), 15.0);
        Produto prod_3  = new Produto(null, "Pinho Sol", "Desinfetante aroma pinho", LocalDate.now(), 5.0);

        produtoRepository.saveAll(Arrays.asList(prod_1, prod_2, prod_3));

        Usuario user_1 = new Usuario(null, "Thiago", passwordEncoder.encode("123"));
        Usuario user_2 = new Usuario(null, "Guto", passwordEncoder.encode("123"));

        usuarioRepository.saveAll(List.of(user_1, user_2));

        return true;
    }


}
