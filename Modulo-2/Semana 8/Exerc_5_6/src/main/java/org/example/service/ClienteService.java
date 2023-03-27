package org.example.service;

import org.example.model.Cliente;
import org.springframework.stereotype.Service;
import org.example.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private int quantidade_id = 0;

    public void criarCliente(String nome, String cpf){
        try {
            Cliente cliente = new Cliente(quantidade_id + 1, nome, cpf);
            quantidade_id = quantidade_id + 1;
            this.clienteRepository.adicionaCliente(cliente);
        } catch (IllegalArgumentException ex){
            System.out.println("CPF NÃO VALIDO");
        }
    }
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> retornaListaClientes(){
        return clienteRepository.retornaListaClientes();
    }

    public boolean deletarCliente(int id){
        return clienteRepository.deletarCliente(id);
    }

    public void atualizarClient(Integer id, Cliente cliente){
        clienteRepository.atualizarClient(id,cliente);
    }
}
