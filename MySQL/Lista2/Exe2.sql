CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	idCategoria INT NOT NULL AUTO_INCREMENT UNIQUE,
	nomeCategoria VARCHAR(20) NOT NULL,
    PRIMARY KEY(idCategoria)
);

CREATE TABLE tb_pizza(
	idPizza INT NOT NULL AUTO_INCREMENT UNIQUE,
    saborPizza VARCHAR(30) NOT NULL,
    bordaRecheada BOOLEAN DEFAULT FALSE,
    azeitonas BOOLEAN DEFAULT TRUE,
    tamanho VARCHAR(20) DEFAULT "Grande",
    preco DOUBLE NOT NULL,
    idCategoria INT NOT NULL,
    PRIMARY KEY(idPizza),
    FOREIGN KEY(idCategoria) REFERENCES tb_categoria (idCategoria)
);

INSERT INTO tb_categoria(nomeCategoria) 
VALUES("Salgada"), ("Doce"), ("Vegetariana");

INSERT INTO tb_pizza(saborPizza, idCategoria, preco) VALUES ("Mussarela PRIME", 1, 45.99), ("Pepperoni", 1, 19.99), 
("Brigadeiro", 2, 34.99), ("Romeu e Julieta", 2, 12.99), ("Rúcula", 3, 18.99), ("Espinafre", 3, 29.99);

UPDATE tb_pizza SET bordaRecheada = TRUE WHERE idPizza = 1;
UPDATE tb_pizza SET azeitonas = FALSE WHERE idPizza >= 3;
UPDATE tb_pizza SET tamanho = "Medio" WHERE idPizza = 2 OR idPizza = 5;
UPDATE tb_pizza SET tamanho = "Pequeno" WHERE idPizza = 4;

SELECT tb_categoria.nomeCategoria, tb_pizza.saborPizza, tb_pizza.bordaRecheada, tb_pizza.azeitonas, tb_pizza.tamanho, tb_pizza.preco
FROM tb_pizza 
INNER JOIN tb_categoria ON tb_pizza.idCategoria = tb_categoria.idCategoria
WHERE tb_pizza.preco > 45;

SELECT tb_categoria.nomeCategoria, tb_pizza.saborPizza, tb_pizza.bordaRecheada, tb_pizza.azeitonas, tb_pizza.tamanho, tb_pizza.preco
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.idCategoria = tb_categoria.idCategoria
WHERE tb_pizza.preco BETWEEN 29 AND 60;

SELECT tb_categoria.nomeCategoria, tb_pizza.saborPizza, tb_pizza.bordaRecheada, tb_pizza.azeitonas, tb_pizza.tamanho, tb_pizza.preco
FROM tb_pizza 
INNER JOIN tb_categoria ON tb_pizza.idCategoria = tb_categoria.idCategoria
WHERE tb_pizza.saborPizza LIKE "C%";

SELECT tb_categoria.nomeCategoria, tb_pizza.saborPizza, tb_pizza.bordaRecheada, tb_pizza.azeitonas, tb_pizza.tamanho, tb_pizza.preco
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.idCategoria = tb_categoria.idCategoria;
