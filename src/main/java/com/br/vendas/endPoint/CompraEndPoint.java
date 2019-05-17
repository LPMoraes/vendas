package com.br.vendas.endPoint;


import com.br.vendas.model.Carrinho;
import com.br.vendas.model.Compra;
import com.br.vendas.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("compra")
public class CompraEndPoint {

    @Autowired
    CompraService compraService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody @Valid Compra compra){

        return new ResponseEntity<>(compraService.checkout(compra), HttpStatus.CREATED);
    }

}
