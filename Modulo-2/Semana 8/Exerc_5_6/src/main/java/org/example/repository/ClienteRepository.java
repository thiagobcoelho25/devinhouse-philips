package org.example.repository;

import org.example.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private static List<Cliente> clientes = new ArrayList<Cliente>();

    public boolean adicionaCliente(Cliente cliente){
        return clientes.add(cliente);
    }
    public List<Cliente> retornaListaClientes(){
        return clientes;
    }

    public boolean deletarCliente(int id){
        return clientes.removeIf(elem -> elem.getId() == id);
//        return clientes.stream().filter(elem -> elem.getId() == id).findAny()
//                .map(obj -> clientes.remove(obj)).orElse(false);
    }

    public void atualizarClient(Integer id, Cliente cliente){
        clientes.add(id,cliente);
    }
}
