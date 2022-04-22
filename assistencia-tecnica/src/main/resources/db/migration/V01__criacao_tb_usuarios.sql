CREATE TABLE usuarios(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(255) UNIQUE NOT NULL,
	email VARCHAR(255) UNIQUE NOT NULL,
	senha VARCHAR(255) NOT NULL,
	token VARCHAR(255) DEFAULT NULL)
;