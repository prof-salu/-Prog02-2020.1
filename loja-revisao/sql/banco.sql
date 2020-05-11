/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  saluo
 * Created: 11/05/2020
 */

# apagando uma base de dados
DROP DATABASE loja;

# criando um novo banco de dados
CREATE DATABASE loja;

# conectando ao banco de dados loja
\c loja

# Produto
    # - id
    # - descricao
    # - quantidade
    # - preco

# criando a tabela produto
CREATE TABLE produto(
    id          int primary key,
    descricao   varchar(50),
    quantidade  int,
    preco       decimal(8,2)
);

# exibindo a estrutura da tabela
# equivalente ao orcale -->  desc produto
\d produto

# inserindo registros na tabela
INSERT INTO produto VALUES (1, 'Monitor', 87, 300.99);
INSERT INTO produto VALUES (2, 'Monitor2', 87, 300.99);

# consultando registros da tabela
SELECT * FROM produto;

# editando registros da tabela
UPDATE produto SET preco=249.90 WHERE id=1;

# apagando registros da tabela
DELETE FROM produto WHERE id=2;
COMMIT;