package com.br.vendas.service;

import com.br.vendas.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    CarrinhoService carrinhoService;

    @Autowired
    ClienteService clienteService;

    @Autowired
    CarrinhoProdutoService carrinhoProdutoService;

    @Autowired
    ProdutoService produtoService;

    public Compra checkout(Compra compra){

        return this.finalizarCompra(compra);
    }


    public  Compra finalizarCompra(Compra compra){

        Cliente cliente = new Cliente();

        if(compra.getCliente().getId() == null){
            cliente = clienteService.create(compra.getCliente());
        }else
            cliente.setId(compra.getCliente().getId());

        Carrinho carrinho = new Carrinho();
        carrinho.setCliente(cliente);
        Carrinho carrinhoCriado = carrinhoService.create(carrinho);

        for ( Produto produto :  compra.getProdutos()) {


            CarrinhoProduto carrinhoProduto = new CarrinhoProduto();

            carrinhoProduto.setCarrinho(carrinhoCriado);

            if(produto.getId() == null)
                carrinhoProduto.setProduto(produtoService.create(produto));
            else
                carrinhoProduto.setProduto(produto);

            carrinhoProdutoService.create(carrinhoProduto);
        }

        return compra;

    }
}
