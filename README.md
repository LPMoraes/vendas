# vendas

#Back-End

Foi usado a Liguagem Java. 

FrameWork Spring.

Dependências: Data, Lombok, Web, JPA, Hibernate.

Estrutura Rest.

#Banco de Dados usado foi o MySQL.

Para gerar as tabelas no banco através do mapeamento será necessário setar o parâmentro para 'create' na instrução abaixo:

spring.jpa.hibernate.ddl-auto=create 

Logo a após a criação das tabelas, retorne o parâmetro para 'update'

spring.jpa.hibernate.ddl-auto=update

O caminho absoluto para o arquivo 'application.properties' onde deverá ser feita a alteração é:
vendas/src/main/resources

As outras informaçes que devem ser modificadas no arquivo 'application.properties' são:

- Nome do schema (que deve ser criado antes de fazer o mapeamento)

- Usuário e senha para fazer a conexão.

#Front-End

Foi utilizado o PostMan para fazer as requisições.

Rota para fazer uma compra.
``` POST /compra ```
 
 A estrutura do JSON para submeter o carrinho:
 
 #Caso (1)  No JSON abaixo será criado o usuário e produtos no banco de dados aos mesmo tempo que é feita a compra.

```
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
```

#Caso(2): Neste caso, o usuário e os produtos já existem no banco de dados, logo você só precisá passar os seus respectivos IDs.

```
{
    "cliente": {
        "id":1,
    },
    "produtos": [
        {
            "id": 1
        }, 
        {
            "id": 2
        }
    ]
}
```

A estrutura do JSON que o usuário irá receber depois de fazer a compra. Esta estutura representa a Nota Fiscal detalhando as informações pessoais, do carrinho e dos produtos.  

```
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
```
