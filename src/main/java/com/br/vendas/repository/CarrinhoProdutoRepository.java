package com.br.vendas.repository;

import com.br.vendas.model.CarrinhoProduto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoProdutoRepository extends CrudRepository <CarrinhoProduto, Long> {

}
