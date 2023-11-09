CREATE TABLE tb_wifi (
        id integer PRIMARY KEY NOT NULL auto_increment,
        nome varchar(255) NOT NULL,
        empresa varchar(255) NOT NULL,
        senha varchar(255) NOT NULL,
        equipamento varchar(255) NOT NULL
) engine=InnoDB;