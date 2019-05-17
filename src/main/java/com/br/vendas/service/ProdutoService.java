package com.br.vendas.service;

import com.br.vendas.model.Produto;
import com.br.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto create(Produto produto){

        return produtoRepository.save(produto);
    }
}
