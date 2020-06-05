/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  saluo
 * Created: 29/05/2020
 */

DROP DATABASE empresa;

CREATE DATABASE empresa;

\c empresa;

CREATE TABLE cliente(
    id INT PRImary key,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    sexo VARCHAR(50) NOT NULL
);

\d cliente;