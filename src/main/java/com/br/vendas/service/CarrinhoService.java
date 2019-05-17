package com.br.vendas.service;

import com.br.vendas.repository.CarrinhoRepository;
import com.br.vendas.model.Carrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {

    @Autowired
    CarrinhoRepository  carrinhoRepository;

    public Carrinho create(Carrinho carrinho){

        return carrinhoRepository.save(carrinho);
    }

}
