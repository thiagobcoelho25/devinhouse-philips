package com.example.exer_5_10.models;

import com.example.exer_5_10.models.PKs.ProdutoClientePK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class ProdutoCliente {

    @JsonIgnore
    @EmbeddedId
    private ProdutoClientePK id = new ProdutoClientePK();
//    private ProdutoClientePK id;

    @Builder()
    public ProdutoCliente(Produto produto, Cliente cliente){
        this.id.setProduto(produto);
        this.id.setCliente(cliente);
    }

    @JsonIgnore
    public Produto getProduto(){
        return id.getProduto();
    }

    public void setProduto(Produto produto){
        id.setProduto(produto);
    }

    public void setCliente(Cliente cliente){
        id.setCliente(cliente);
    }

    public Cliente getCliente() {
        return id.getCliente();
    }

}
