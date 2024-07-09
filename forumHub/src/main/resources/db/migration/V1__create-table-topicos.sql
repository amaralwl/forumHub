create table topicos(

    id bigint not null auto_increment,
    titulo varchar(255) not null,
    mensagem TEXT not null,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    autor varchar(100) not null,
    status boolean not null,

    primary key(id)

);

