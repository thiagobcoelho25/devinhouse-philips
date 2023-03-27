package com.example.exer_7_10.services;

import com.example.exer_7_10.exceptions.DataIntegrityException;
import com.example.exer_7_10.exceptions.ObjectNotFoundException;
import com.example.exer_7_10.models.Conta;
import com.example.exer_7_10.repositories.ClienteRepository;
import com.example.exer_7_10.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Conta> findAll(){
        return contaRepository.findAll();
    }

    public Conta findById(Integer id){
        return contaRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto Conta com ID: " + id + " não encontrado"));
    }

    public Conta insert(Conta conta){
        conta.setId(null);
        clienteRepository.findById(conta.getCliente().getId()).orElseThrow(() ->
                new ObjectNotFoundException("Objeto Cliente com ID: " + conta.getCliente().getId() + " não encontrado"));
        return contaRepository.save(conta);
    }

    public Conta update(Integer id, Conta conta){
        try {
            return contaRepository.save(conta);
        }catch(DataIntegrityViolationException e){
            throw new DataIntegrityException("Não foi possivel Atualizar o objeto Cliente");
        }

    }

    public void delete(Integer id){
        try {
            contaRepository.deleteById(id);
        }
        catch (DataIntegrityViolationException e){
            throw new DataIntegrityException("Não foi possivel Excluir o objeto Cliente");}
    }
}
