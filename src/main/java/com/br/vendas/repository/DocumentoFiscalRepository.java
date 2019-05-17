package com.br.vendas.repository;

import com.br.vendas.model.DocumentoFiscal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoFiscalRepository extends CrudRepository<DocumentoFiscal, Long> {
}
