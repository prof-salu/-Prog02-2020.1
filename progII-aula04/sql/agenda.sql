#Apagando uma bamco de dados
drop database agenda;

# cria um banco de dados chamado agenda
create database agenda;

# lista todos os bancos de dados criados
\l

# conecta no banco de dados agenda
\c agenda;

# criando a tabela contatos

# Contato
    # id
    # nome
    # email
    # endereco
    # data de nascimento
    
# constraint --> Restrição
create table contatos(
    id              int,
    nome            varchar(50),
    email           varchar(50) unique,
    endereco        varchar(100),
    dataNascimento  date,
    primary key(id)
);

# Exibe a estrutura da tabela contatos
\d contatos

# Inserindo informações na tabela contato

#implicito
insert into contatos values 
        (1, 'Ana', 'ana@gmail.com', 'Rua Z, 33', '1990/07/23');

#explicito
insert into contatos(id,email, dataNascimento, endereco, nome) 
values (2, 'antonio@emaill.com', '1988/04/06', 'Rua XYZ, 34', 'Antonio');

insert into conntatos (id, nome) values (3, 'Bia');


# Consultando dados da tabela contatos
select * from contatos;

# Atualizando um contato
update contatos
set endereco = 'Rua Y, 789'
where id = 2;

update contatos
set email = 'antonio@email.com'
where id  =  2;

# apagando um registro da tabela contatos
delete from contatos
where id = 2;

delete from  contatos
where id  =  3;

# Encerra o postgres

\q

select* from contatos
order by datanascimento;


insert into contatos values (7, 'jose3', 'jose3@email.com', 'Rua A, 12', '1990/01/01');
insert into contatos values (8, 'jose4', 'jose4@email.com', 'Rua A, 12', ;);delete from contatos;
