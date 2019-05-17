package com.br.vendas.service;

import com.br.vendas.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    DocumentoFiscalService documentoFiscalService;

    @Autowired
    ItemFiscalService itemFiscalService;

    public NotaFiscal checkout(Compra compra){

        return this.finalizarCompra(compra);
    }


    public  NotaFiscal finalizarCompra(Compra compra){

        List<Produto> produtos = new ArrayList<Produto>();
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

            produtos.add(produto);

            carrinhoProdutoService.create(carrinhoProduto);
        }

        return this.gerarDocumentoFiscal(cliente, carrinhoCriado, produtos);

    }

    public NotaFiscal gerarDocumentoFiscal(Cliente cliente, Carrinho carrinho, List<Produto> produtos){


        DocumentoFiscal documentoFiscal = new DocumentoFiscal();
        documentoFiscal.setCliente(cliente);
        DocumentoFiscal documentoCriado = documentoFiscalService.create(documentoFiscal);

        for ( Produto item :  produtos) {

            ItemFiscal itemFiscal = new ItemFiscal();

            itemFiscal.setDocumento(documentoCriado);
            itemFiscal.setProduto(item);

             itemFiscalService.create(itemFiscal);
        }

        NotaFiscal notaFiscal = new NotaFiscal();

        notaFiscal.setCarrinho(carrinho);
        notaFiscal.setProdutos(produtos);


        return notaFiscal;
    }



}
