package com.example.exer_5_10.models.PKs;

import com.example.exer_5_10.models.Cliente;
import com.example.exer_5_10.models.Produto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@Data
@EqualsAndHashCode(of = {"produto", "cliente"})
public class ProdutoClientePK implements Serializable {

    @ManyToOne()
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
