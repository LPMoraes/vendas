package com.br.vendas.service;

import com.br.vendas.model.CarrinhoProduto;
import com.br.vendas.repository.CarrinhoProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoProdutoService {

    @Autowired
    CarrinhoProdutoRepository carrinhoProdutoRepository;

    public CarrinhoProduto create(CarrinhoProduto carrinhoProduto){

        return carrinhoProdutoRepository.save(carrinhoProduto);
    }

}
