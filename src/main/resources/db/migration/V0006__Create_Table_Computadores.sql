CREATE TABLE  tb_computadores (
    id  integer not null auto_increment,
    setor VARCHAR(255),
    computador VARCHAR(255),
    usuario VARCHAR(255),
    so VARCHAR(255),
    ip VARCHAR(255),
    empresa VARCHAR(255),
    primary key (id)
)engine = InnoDB;