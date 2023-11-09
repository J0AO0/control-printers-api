CREATE TABLE tb_server (
     id integer PRIMARY KEY NOT NULL auto_increment,
     ip varchar(255) NOT NULL UNIQUE,
     nome varchar(255) NOT NULL,
     empresa varchar(255) NOT NULL,
     so varchar(255) NOT NULL
) engine=InnoDB;