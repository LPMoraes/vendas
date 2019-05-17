# vendas

#Back-End

Foi usado a Liguagem Java. 
FrameWork Spring.
Dependências: Data, Lombok, Web, JPA, Hibernate.
Estrutura Rest.


#Front-End
 Rota para fazer uma compra.
 
 http://localhost:8080/compra
 
 A estrutura do JSON para submeter o carrinho
 
 {
    "cliente": {
        "nome":"paulo"
    },
    "produtos": [
        {
            "nome": "TV"
        }, 
        {
            "nome": "NoteBook"
        }
    ]
}

Foi utilizado o PostMan para fazer as requisições.

OBS: Quando o JSON  acima é passado, pode-se passar o cliente e produtos que já existem no banco. Ou se quiser, pode submeter estes
campos sem passar o 'id' para serem criados simultaneamente quando é submetido o carrinho.

A estrutura do JSON que o usuário irá receber depois de fazer a compra.
Esta estutura representa a Nota Fiscal detalhando as informações pessoais, do carrinho e dos produtos.  

{
    "carrinho": {
        "id": 5,
        "cliente": {
            "id": 4,
            "nome": "paulo"
        }
    },
    "produtos": [
        {
            "id": 12,
            "nome": "TV"
        },
        {
            "id": 13,
            "nome": "NoteBook"
        }
    ]
}
