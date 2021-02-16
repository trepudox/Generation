CREATE DATABASE db_game_online;

USE db_game_online;

CREATE TABLE classe(
	idClasse INT NOT NULL AUTO_INCREMENT UNIQUE,
    nomeClasse VARCHAR(40) NOT NULL,
    pontosVida INT NOT NULL,
    pontosAtaque INT NOT NULL,
    pontosDefesa INT NOT NULL,
    PRIMARY KEY(idClasse)
);

CREATE TABLE personagem(
	idPersonagem INT NOT NULL AUTO_INCREMENT UNIQUE,
    nomePersonagem VARCHAR(40) NOT NULL,
    nivelPersonagem INT NOT NULL,
    idClasse INT NOT NULL,
    PRIMARY KEY(idPersonagem),
    FOREIGN KEY(idClasse) REFERENCES classe (idClasse)
);

INSERT INTO classe(nomeClasse, pontosVida, pontosAtaque, pontosDefesa) 
VALUES ("Guerreiro", 5000, 1500, 3000), ("Arqueiro", 2500, 4500, 2000),
("Mago", 2000, 5500, 1500), ("Assassino", 3000, 3500, 2500), ("Curandeiro", 3000, 1000, 2000);

INSERT INTO personagem(nomePersonagem, nivelPersonagem, idClasse) 
VALUES ("Marco", 5, 4), ("Matheus", 2, 3), ("Reginaldo", 7, 1), ("Marcela", 8, 2),
("Rafaela", 12, 5), ("Alexsandro", 14, 2), ("Hugo", 6, 1), ("João", 4, 5);

SELECT personagem.nomePersonagem, personagem.nivelPersonagem, classe.pontosVida, classe.pontosAtaque, classe.pontosDefesa
FROM personagem INNER JOIN classe ON personagem.idClasse = classe.idClasse WHERE classe.pontosAtaque > 2000;

SELECT personagem.nomePersonagem, personagem.nivelPersonagem, classe.pontosVida, classe.pontosAtaque, classe.pontosDefesa
FROM personagem INNER JOIN classe ON personagem.idClasse = classe.idClasse WHERE classe.pontosDefesa BETWEEN 1000 AND 2000;

SELECT personagem.nomePersonagem, personagem.nivelPersonagem 
FROM personagem INNER JOIN classe ON personagem.idClasse = classe.idClasse WHERE personagem.nomePersonagem LIKE "C%";

SELECT personagem.nomePersonagem, personagem.nivelPersonagem, classe.pontosVida, classe.pontosAtaque, classe.pontosDefesa
FROM personagem INNER JOIN classe ON personagem.idClasse = classe.idClasse;

SELECT classe.nomeClasse, personagem.nomePersonagem, personagem.nivelPersonagem 
FROM personagem INNER JOIN classe ON personagem.idClasse = classe.idClasse WHERE classe.idClasse = 2;
