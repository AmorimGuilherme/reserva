CREATE TABLE clientes(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL,
	logradouro VARCHAR(255) NOT NULL,
	numero VARCHAR(255) NOT NULL,
	complemento VARCHAR(255) DEFAULT NULL,
	cep VARCHAR(8) NOT NULL,
	telefone VARCHAR(11) NOT NULL,
	cpf VARCHAR(11) UNIQUE NOT NULL,
	id_usuario BIGINT,
	CONSTRAINT fk_usuarios_clientes FOREIGN KEY (id_usuario)
    REFERENCES usuarios(id))
;