CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id BIGINT NOT NULL AUTO_INCREMENT UNIQUE,
    nomeProduto VARCHAR(30) NOT NULL,
    marca VARCHAR(30) NOT NULL,
    preco DOUBLE NOT NULL,
    categoria VARCHAR(30) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_produtos(nomeProduto, marca, preco, categoria) VALUES ("Moto G7 Play", "Motorola", 999.9, "Eletrônicos"), 
("Arroz 5KG", "Tio João", 29.99, "Alimentos"), ("Lápis", "Faber Castel", 1.0, "Materiais Escolares"), 
("MI Band 4", "Xiaomi", 149.9, "Eletrônicos"), ("Caneta", "Bic", 1.50, "Materiais Escolares"),
("Feijão 1KG", "Camil", 7.99, "Alimentos"), ("Sabonete", "Palmolive", 1.20, "Higiene"),
("Pasta de dente", "Colgate", 4.99, "Higiene"), ("Air MAX", "Nike", 349.99, "Calçados"),
("Lite Racer", "Adidas", 249.99, "Calçados");

SELECT * FROM tb_produtos WHERE (preco > 500) ORDER BY categoria, preco ASC; 

SELECT * FROM tb_produtos WHERE (preco < 500) ORDER BY categoria, preco ASC; 

UPDATE tb_produtos SET preco = 1.3 WHERE (id = 7);
