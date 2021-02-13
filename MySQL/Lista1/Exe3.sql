CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos(
	id INT NOT NULL AUTO_INCREMENT UNIQUE,
    nome VARCHAR(20) NOT NULL,
    sobrenome VARCHAR(20) NOT NULL,
    mediaNotas DOUBLE DEFAULT 0,
    provasFeitas INT DEFAULT 0,
    PRIMARY KEY(id)
);

INSERT INTO tb_alunos(nome, sobrenome, mediaNotas, provasFeitas) VALUES ("Marco Aurelio", "Queiroz", 0, 3),
("Rogerio", "Simas", 10, 4), ("Ronaldo", "Nazário", 8.25, 4), ("José Roberto", "Seixas", 9.5, 2), 
("Rodrigo", "Alberto", 5.5, 3), ("Mauricio", "de Souza", 2.5, 5), ("Pedro", "Rodrigues", 8.75, 3),
("João", "Roberto", 6.5, 4);

SELECT * FROM tb_alunos;

SELECT * FROM tb_alunos WHERE (mediaNotas > 7);

SELECT * FROM tb_alunos WHERE (mediaNotas < 7);

UPDATE tb_alunos SET mediaNotas = 10 WHERE (id = 1);
