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
insert into contatos values 
        (1, 'Ana', 'ana@gmail.com', 'Rua Z, 33', '1990/07/23');

# Consultando dados da tabela contatos
select * from contatos;

# Atualizando um contato
update contatos
set endereco = 'Rua Y, 789'
where id = 2;

# apagando um registro da tabela contatos
delete from contatos
where id = 2;

# Encerra o postgres

\q