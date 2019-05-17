package com.br.vendas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="produto")
public class Produto implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty(message = "protudo é obrigatório!")
    @Size(min=2, max=30)
    private String nome;

}