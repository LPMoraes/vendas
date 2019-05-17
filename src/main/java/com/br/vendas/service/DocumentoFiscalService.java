package com.br.vendas.service;

import com.br.vendas.model.DocumentoFiscal;
import com.br.vendas.repository.DocumentoFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoFiscalService {

    @Autowired
    DocumentoFiscalRepository documentoFiscalRepository;

    public DocumentoFiscal create(DocumentoFiscal documentoFiscal){

        return documentoFiscalRepository.save(documentoFiscal);
    }

}
