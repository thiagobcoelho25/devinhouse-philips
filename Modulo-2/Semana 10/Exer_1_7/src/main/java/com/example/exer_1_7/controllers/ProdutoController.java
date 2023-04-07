package com.example.exer_1_7.controllers;

import com.example.exer_1_7.repositories.models.Produto;
import com.example.exer_1_7.repositories.models.Usuario;
import com.example.exer_1_7.repositories.models.dtos.ProdutoDTO;
import com.example.exer_1_7.services.ProdutoService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping()
    public String produto(Model model){
        Produto produto = produtoService.getFirstProduct();
        model.addAttribute("produto", produto);
        return "produto_page";
    }

    @GetMapping(path = "all")
    public String produtoGetAll(Model model, Authentication authentication){

        /*https://www.baeldung.com/get-user-in-spring-security
        * https://stackoverflow.com/questions/22678891/how-to-get-user-id-from-customuser-on-spring-security*/
//        System.out.println(authentication.getName());
        Usuario usuario = (Usuario) authentication.getPrincipal();
//        System.out.println("Id Usuario: " + usuario.getId());

        List<Produto> produtos = produtoService.getAllProducts(usuario.getId());
        model.addAttribute("produtos", produtos);
        return "produto_page_all";
    }

    @GetMapping(path = "/formulario")
    public String paginaFormulario(ProdutoDTO ProdutoDto, Model model){
        model.addAttribute("ProdutoDto", new ProdutoDTO());
        return "formulario";
    }

    @PostMapping()
    public String postProduto(
            @Validated ProdutoDTO ProdutoDto,
            Model model
    ){
        produtoService.saveProduct(
                Produto.builder()
                        .nome(ProdutoDto.getNome())
                        .descricao(ProdutoDto.getDescricao())
                        .data_lancamento(ProdutoDto.getData_lancamento())
                        .preco(ProdutoDto.getPreco())
                        .build()
        );
        return "redirect:produto"; //vai para o edpoint /formulario/lista
    }

    @PostMapping(path = "/{id}")
    public String DeleteProduct(@PathVariable String id, Model model){
        System.out.println(id);
        produtoService.deleteProduct(Long.parseLong(id));
        return "redirect:all"; //vai para o edpoint /formulario/lista
    }

}