INSERT INTO usuarios(nome, email, senha) VALUES
('guilherme', 'guilherme@gmail.com', '1234'),
('gustavo', 'gustavo@gmail.com', '4321'),
('leonardo', 'leonardo@gmail.com', '0123');

INSERT INTO clientes(nome, data_nascimento, logradouro, numero, cep, telefone, cpf, id_usuario) VALUES
('Guilherme', '1999-01-19', 'Travessa Sinésio José dos Santos', 50, '05617050', '1146450256', '55977094027', 1),
('Gustavo', '2000-11-12', 'Rua Nossa Senhora das Candeias', 23, '08247095', '1140028922', '33977094026', 2),
('Leonardo', '1999-06-18', 'Rua Caxias do Sul', 37, '03446020', '1140067890', '44977094025', 3);

INSERT INTO dispositivos(tipo) VALUES
('celular'),
('tablet'),
('notebook');

INSERT INTO ordens_de_servicos(id_dispositivo, marca, modelo, peso, altura, largura, comprimento, descricao, id_cliente) VALUES
(1, 'Marca 1', 'XX1', 0.500, 129, 64, 120, 'Não liga mais', 1),
(2, 'Marca 2', 'XX2', 0.700, 149, 74, 250, 'Não carrega mais', 2),
(3, 'Marca 3', 'XX3', 1.00, 500, 84, 420, 'Esquentando muito', 3);