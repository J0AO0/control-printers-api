
    create table tb_impressoras (
       id integer not null auto_increment,
        codigo varchar(255),
        ip varchar(255),
        setor varchar(255),
        status bit,
        primary key (id)
    ) engine=InnoDB

    create table tb_manutencao (
       id integer not null auto_increment,
        contador_atual integer,
        contador_inicial integer,
        ida_manutencao date,
        printers varchar(255),
        volta_manutencao date,
        primary key (id)
    ) engine=InnoDB

    create table tb_usuarios (
       id integer not null auto_increment,
        email varchar(255),
        nome varchar(255),
        senha varchar(255),
        status bit,
        primary key (id)
    ) engine=InnoDB

    create table tb_impressoras (
       id integer not null auto_increment,
        codigo varchar(255),
        ip varchar(255),
        setor varchar(255),
        status bit,
        primary key (id)
    ) engine=InnoDB

    create table tb_manutencao (
       id integer not null auto_increment,
        contador_atual integer,
        contador_inicial integer,
        ida_manutencao date,
        printers varchar(255),
        volta_manutencao date,
        primary key (id)
    ) engine=InnoDB

    create table tb_usuarios (
       id integer not null auto_increment,
        email varchar(255),
        nome varchar(255),
        senha varchar(255),
        status bit,
        primary key (id)
    ) engine=InnoDB
