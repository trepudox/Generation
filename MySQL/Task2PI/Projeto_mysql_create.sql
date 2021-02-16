CREATE DATABASE db_projeto_pi;

USE db_projeto_pi;

CREATE TABLE Produto (
	id_produto INT NOT NULL AUTO_INCREMENT,
	nome VARCHAR (255) NOT NULL,
	preco INT NOT NULL,
	promocao INT NOT NULL,
	descricao VARCHAR (255) NOT NULL,
	disponibilidade BOOLEAN NOT NULL,
	fk_id_categoria INT NOT NULL,
	PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES Categoria (id_categoria)
);

CREATE TABLE Categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT,
	tipo VARCHAR(255) NOT NULL,
	secao VARCHAR(255) NOT NULL,
	departamento VARCHAR(255) NOT NULL,
	PRIMARY KEY (id_categoria)
);

CREATE TABLE Usuário (
	CPF INT NOT NULL,
	nome VARCHAR (255) NOT NULL,
	sobrenome VARCHAR (255) NOT NULL,
	email VARCHAR (255) NOT NULL,
	senha VARCHAR (12) NOT NULL,
	PRIMARY KEY (CPF)
);
