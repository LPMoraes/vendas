package com.br.vendas.repository;

import com.br.vendas.model.Carrinho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends CrudRepository <Carrinho, Long> {

}
