package com.example.exer_7_10.services;

import com.example.exer_7_10.exceptions.DataIntegrityException;
import com.example.exer_7_10.exceptions.ObjectNotFoundException;
import com.example.exer_7_10.models.Cliente;
import com.example.exer_7_10.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente findById(Integer id){
        return clienteRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto Cliente com ID: " + id + " não encontrado"));
    }

    public Cliente insert(Cliente cliente){
        cliente.setId(null);
        return clienteRepository.save(cliente);
    }

    public Cliente update(Integer id, Cliente cliente){
        try {
            return clienteRepository.save(cliente);
        }catch(DataIntegrityViolationException e){
            throw new DataIntegrityException("Não foi possivel Atualizar o objeto Cliente");
        }

    }

    public void delete(Integer id){
        try {
            clienteRepository.deleteById(id);
        }
        catch (DataIntegrityViolationException e){
            throw new DataIntegrityException("Não foi possivel Excluir o objeto Cliente");}
    }

}
