CREATE TABLE ordens_de_servicos(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	marca VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    peso DECIMAL(6,2) UNSIGNED NOT NULL, 
    largura INT UNSIGNED NOT NULL,
    altura INT UNSIGNED NOT NULL,
    comprimento INT UNSIGNED NOT NULL,
    descricao VARCHAR(500) NOT NULL,
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP, 
    data_finalizacao DATETIME DEFAULT NULL, 
    aberta BOOLEAN DEFAULT TRUE, 
    id_dispositivo BIGINT,
    id_cliente BIGINT,
    CONSTRAINT fk_dispositivos_ordens_de_servicos FOREIGN KEY (id_dispositivo)
    REFERENCES dispositivos(id),
    CONSTRAINT fk_clientes_ordens_de_servicos FOREIGN KEY (id_cliente)
    REFERENCES clientes(id))
;