CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionarios(
	id BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(40) NOT NULL,
	idade INT NOT NULL,
	anosExperiencia INT NOT NULL,
	salario DOUBLE NOT NULL,
	PRIMARY KEY(id)
);

INSERT INTO tb_funcionarios(nome, idade, anosExperiencia, salario) 
VALUES ("Marco", 18, 17, 999.9), ("Rogerio", 23, 1, 9999.0), 
("Lucas", 25, 5, 6.25), ("Gabriela", 30, 8, 6000.0), ("Rafa", 33, 7, 5000.0);

SELECT * FROM tb_funcionarios WHERE (salario > 2000);

SELECT * FROM tb_funcionarios WHERE (salario < 2000);

UPDATE tb_funcionarios SET anosExperiencia = 16, salario = 1999.9 WHERE (id = 1);

SELECT * FROM tb_funcionarios