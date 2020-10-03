CREATE DATABASE banco_estrelas;

CREATE TABLE banco_estrelas.cidade(
	cep VARCHAR(8) NOT NULL PRIMARY KEY,
	nome VARCHAR(45) UNIQUE NOT NULL,
    numero_habitantes INT NOT NULL,
    capital BOOLEAN NOT NULL,
    estado VARCHAR(2) NOT NULL,
    renda_per_capita DECIMAL(9, 3) NOT NULL,
    data_fundacao DATE NOT NULL
);

CREATE TABLE banco_estrelas.estado(
	sigla VARCHAR(2) NOT NULL PRIMARY KEY,
    nome VARCHAR(45) UNIQUE NOT NULL
);