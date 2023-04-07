package com.example.exer_1_7.services;

import com.example.exer_1_7.repositories.ProdutoRepository;
import com.example.exer_1_7.repositories.UsuarioRepository;
import com.example.exer_1_7.repositories.models.Produto;
import com.example.exer_1_7.repositories.models.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.ParseException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DBService {

    private final ProdutoRepository produtoRepository;

    private final UsuarioRepository usuarioRepository;

    private final PasswordEncoder passwordEncoder;

    public DBService(ProdutoRepository produtoRepository, UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.produtoRepository = produtoRepository;
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public boolean instantiateDatabase() throws ParseException {

        Produto prod_1  = new Produto(null, "Shampoo Citrus", "Shamppo para cabelos ressecados", LocalDate.now(), 8.0);
        Produto prod_2  = new Produto(null, "Nuggets", "Frango empanados Sadia", LocalDate.now(), 15.0);
        Produto prod_3  = new Produto(null, "Pinho Sol", "Desinfetante aroma pinho", LocalDate.now(), 5.0);

        produtoRepository.saveAll(Arrays.asList(prod_1, prod_2, prod_3));

        Usuario user_1 = new Usuario(null, "Thiago", passwordEncoder.encode("123") , List.of(prod_1, prod_2));
        Usuario user_2 = new Usuario(null, "Guto", passwordEncoder.encode("123") , List.of(prod_3));

        usuarioRepository.saveAll(List.of(user_1, user_2));

        return true;
    }


}
