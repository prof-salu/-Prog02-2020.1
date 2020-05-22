# Apaga a base de dados av1 caso exista
DROP DATABASE av1;

# Cria uma nova base de dados chamada av1
CREATE DATABASE av1;

# conecta na base de dados av1
\c av1;

# cria a tabela funcionarios
CREATE TABLE funcionarios(
    matricula       INT PRIMARY KEY,
    nome            VARCHAR(50),
    email           VARCHAR(50) UNIQUE,
    senha           VARCHAR(10)
);