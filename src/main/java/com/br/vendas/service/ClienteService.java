package com.br.vendas.service;

import com.br.vendas.model.Cliente;
import com.br.vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente create(Cliente cliente){

        return clienteRepository.save(cliente);
    }

}
