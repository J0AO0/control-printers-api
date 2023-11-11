CREATE TABLE tb_itens (
        id integer PRIMARY KEY NOT NULL auto_increment,
        nome varchar(255) NOT NULL,
        marca varchar(255) NOT NULL,
        fornecedor varchar(255) NOT NULL,
        quantidade integer NOT NULL,
        status bit
) engine=InnoDB;