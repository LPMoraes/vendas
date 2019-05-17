package com.br.vendas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotaFiscal {

    private Carrinho carrinho;

    List<Produto> produtos;
}
