package com.br.vendas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="itemFiscal")
public class ItemFiscal implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_documento", nullable = false)
    private DocumentoFiscal documento;

    @ManyToOne
    @JoinColumn(name = "id_produto",  nullable = false)
    private Produto produto;

}