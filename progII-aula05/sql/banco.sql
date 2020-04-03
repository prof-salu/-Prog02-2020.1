/**
 * Author:  saluo
 * Created: 03/04/2020
 */

# Cria um novo banco de dados chamado loja
CREATE DATABASE loja;

# Conectando no banco de dados loja
\c loja

# Criando a tabela produtos
CREATE TABLE produtos(
    CODIGO BIGINT,
    DESCRICAO VARCHAR(50),
    QUANTIDADE INT,
    PRECO DEC(10,2),
    PRIMARY KEY(CODIGO)
);


\d produtos
                      Tabela "public.produtos"
   Coluna   |         Tipo          | Collation | Nullable | Default
------------+-----------------------+-----------+----------+---------
 codigo     | bigint                |           | not null |
 descricao  | character varying(50) |           |          |
 quantidade | integer               |           |          |
 preco      | numeric(10,2)         |           |          |
