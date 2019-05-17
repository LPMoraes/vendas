package com.br.vendas.service;

import com.br.vendas.model.ItemFiscal;
import com.br.vendas.repository.ItemFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemFiscalService {

    @Autowired
    ItemFiscalRepository itemFiscalRepository;

    public ItemFiscal create(ItemFiscal itemFiscal){

        return itemFiscalRepository.save(itemFiscal);
    }
}
