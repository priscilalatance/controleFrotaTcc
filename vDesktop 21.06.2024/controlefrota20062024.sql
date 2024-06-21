-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21/06/2024 às 03:18
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `controlefrota`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `agenda`
--

CREATE TABLE `agenda` (
  `id` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  `horario` varchar(20) DEFAULT NULL,
  `placa` varchar(20) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `box` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `agenda_servico`
--

CREATE TABLE `agenda_servico` (
  `idAgendaServico` int(11) NOT NULL,
  `fk_idOrdem` int(11) NOT NULL,
  `fk_idAgenda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `cadastro_produto`
--

CREATE TABLE `cadastro_produto` (
  `idCodigo` int(10) NOT NULL,
  `marca` varchar(30) DEFAULT NULL,
  `modelo` varchar(30) DEFAULT NULL,
  `cor` varchar(30) DEFAULT NULL,
  `anoFabricacao` int(11) DEFAULT NULL,
  `anoModelo` int(11) DEFAULT NULL,
  `descricaoItem` varchar(80) DEFAULT NULL,
  `valorUnitario` double(10,2) DEFAULT NULL,
  `pecaUniversal` tinyint(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cadastro_produto`
--

INSERT INTO `cadastro_produto` (`idCodigo`, `marca`, `modelo`, `cor`, `anoFabricacao`, `anoModelo`, `descricaoItem`, `valorUnitario`, `pecaUniversal`) VALUES
(1000, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Palhetas do limpador de para-brisa', 12.60, 0),
(1001, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Espelhos retrovisores externos', 100.00, 0),
(1002, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Maçaneta externa das portas', 35.00, 0),
(1003, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Farol', 125.00, 0),
(1004, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Farol dianteiro de neblina', 100.00, 0),
(1005, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Antena', 159.00, 0),
(1006, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Parabrisa traseiro com aquecedor', 245.00, 0),
(1007, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Tampa de abastecimento de combustível', 20.00, 0),
(1008, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Parachoque traseiro', 600.00, 0),
(1009, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Lanterna combinada traseira', 150.00, 0),
(1010, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Maçaneta interna da porta', 150.00, 0),
(1011, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Controle dos espelhos retrovisores externos', 250.00, 0),
(1012, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Botão de travamento do vidro elétrico', 50.00, 0),
(1013, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Interruptor de travamento central das portas', 250.04, 0),
(1014, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Conjunto de interruptores do vidro elétrico', 50.00, 0),
(1015, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Alavanca de abertura da tampa abastecimento de de combustível', 20.00, 0),
(1016, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Volante', 800.00, 0),
(1017, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Alavanca de controle da inclinação do volante da direção', 250.08, 0),
(1018, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Buzina', 250.09, 0),
(1019, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Tomada de força', 50.00, 0),
(1020, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Alavanca de seleção da transmissão', 100.00, 0),
(1021, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Alavanca do freio de estacionamento', 100.00, 0),
(1022, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Entradas AUX , USB e ipod', 50.00, 0),
(1023, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Suporte para copos', 100.00, 0),
(1024, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Controles do sistema de climatização', 300.00, 0),
(1025, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Reservatório do sob líquido de arrefecimento', 450.00, 0),
(1026, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Reservatório do líquido lavador do brisa para -brisa', 450.00, 0),
(1027, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Tampa do radiador', 80.00, 0),
(1028, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Tampa de abastecimento de óleo do motor', 80.00, 0),
(1029, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Vareta de nível de óleo', 25.00, 0),
(1030, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Reservatório de fluido do freio / embreagem', 450.00, 0),
(1031, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Filtro de ar', 50.00, 0),
(1032, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Caixa de fusíveis', 100.00, 0),
(1033, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Terminal positivo da bateria', 80.00, 0),
(1034, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Terminal negativo da bateria', 80.00, 0),
(1035, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Vareta do fluido da transmissão automática', 80.00, 0),
(1036, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Reservatório de gasolina para partida a frio', 450.00, 0),
(1037, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Reservatório do fluido da direção hidráulica', 450.00, 0),
(1038, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Banco do motorista', 750.00, 0),
(1039, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Banco dianteiro do passageiro', 750.00, 0),
(1040, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Banco traseiro', 1050.00, 0),
(1041, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Sistema de proteção por cintos de segurança', 300.00, 0),
(1042, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Pré - tensor do cinto de segurança ', 150.00, 0),
(1043, 'HYUNDAI', 'HB20', 'Preto', 2013, 2014, 'Airbag do motorista e do passageiro dianteiro', 2500.00, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `ordemservico`
--

CREATE TABLE `ordemservico` (
  `Id` int(11) NOT NULL,
  `dataCheck` date NOT NULL,
  `tipoManutencao` varchar(15) DEFAULT NULL,
  `statusOrdem` varchar(15) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `valorTotal` double(10,2) DEFAULT NULL,
  `placa` varchar(10) NOT NULL,
  `re` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ordem_plano`
--

CREATE TABLE `ordem_plano` (
  `fk_idPlano` int(11) DEFAULT NULL,
  `fk_idOrdem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ordem_produto`
--

CREATE TABLE `ordem_produto` (
  `fk_IdOrdem` int(11) DEFAULT NULL,
  `fk_IdCodigo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `planomanutencao`
--

CREATE TABLE `planomanutencao` (
  `idPlano` int(11) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `motor` varchar(100) NOT NULL,
  `kmManutencao` int(11) NOT NULL,
  `anoModelo` int(11) NOT NULL,
  `anoFabricacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `planomanutencao`
--

INSERT INTO `planomanutencao` (`idPlano`, `marca`, `modelo`, `motor`, `kmManutencao`, `anoModelo`, `anoFabricacao`) VALUES
(30, 'Hyundai', 'HB20', '1.6', 10000, 2014, 2013),
(31, 'Hyundai', 'HB20', '1.6', 20000, 2014, 2013);

-- --------------------------------------------------------

--
-- Estrutura para tabela `plano_produto`
--

CREATE TABLE `plano_produto` (
  `fk_idPlano` int(11) NOT NULL,
  `fk_idCodigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `plano_produto`
--

INSERT INTO `plano_produto` (`fk_idPlano`, `fk_idCodigo`) VALUES
(30, 1001);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `re` varchar(50) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(200) DEFAULT NULL,
  `estado` varchar(100) DEFAULT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `perfil` varchar(100) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `inativarUsuario` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`re`, `nome`, `endereco`, `numero`, `bairro`, `cidade`, `estado`, `cep`, `perfil`, `email`, `telefone`, `cpf`, `senha`, `inativarUsuario`) VALUES
('758783', 'Priscila Padilla', 'Campos Salles', 686, 'Barcelona', 'Sorocaba', 'SP', '18000000', 'Colaborador', 'priscila.padilla@gmail.com', '1599867589', '4587896', '1234', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `placa` varchar(50) NOT NULL,
  `marca` varchar(100) DEFAULT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `cor` varchar(100) DEFAULT NULL,
  `combustivel` varchar(50) NOT NULL,
  `tipoVeiculo` varchar(100) NOT NULL,
  `anoFabricacao` int(11) NOT NULL,
  `anoModelo` int(11) NOT NULL,
  `kmAtual` int(11) NOT NULL,
  `crv` varchar(100) NOT NULL,
  `renavam` varchar(100) NOT NULL,
  `chassi` varchar(100) NOT NULL,
  `motor` varchar(100) NOT NULL,
  `inativarVeiculo` tinyint(1) DEFAULT NULL,
  `dataCadastro` date DEFAULT NULL,
  `dataCompra` date DEFAULT NULL,
  `vencimentoGarantia` date DEFAULT NULL,
  `KmManutRealizado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `veiculo`
--

INSERT INTO `veiculo` (`placa`, `marca`, `modelo`, `cor`, `combustivel`, `tipoVeiculo`, `anoFabricacao`, `anoModelo`, `kmAtual`, `crv`, `renavam`, `chassi`, `motor`, `inativarVeiculo`, `dataCadastro`, `dataCompra`, `vencimentoGarantia`, `KmManutRealizado`) VALUES
('FMX3119', 'Hyundai', 'HB20', 'Preto', 'Flex', '4 portas', 2013, 2014, 130000, '123166161949', '1614911299', '1234194619', '1.6', 0, '2024-06-14', '2013-06-14', '2015-06-14', 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `agenda`
--
ALTER TABLE `agenda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_placa` (`placa`);

--
-- Índices de tabela `agenda_servico`
--
ALTER TABLE `agenda_servico`
  ADD PRIMARY KEY (`idAgendaServico`),
  ADD KEY `Ordem` (`fk_idOrdem`),
  ADD KEY `Agenda` (`fk_idAgenda`);

--
-- Índices de tabela `cadastro_produto`
--
ALTER TABLE `cadastro_produto`
  ADD PRIMARY KEY (`idCodigo`);

--
-- Índices de tabela `ordemservico`
--
ALTER TABLE `ordemservico`
  ADD PRIMARY KEY (`Id`);

--
-- Índices de tabela `ordem_plano`
--
ALTER TABLE `ordem_plano`
  ADD KEY `ordem_Servico_Id` (`fk_idOrdem`),
  ADD KEY `plano_manutencao_idPlano` (`fk_idPlano`);

--
-- Índices de tabela `ordem_produto`
--
ALTER TABLE `ordem_produto`
  ADD KEY `ordem_Servico_Id` (`fk_IdOrdem`),
  ADD KEY `cadastro_Item_IdCodigo` (`fk_IdCodigo`);

--
-- Índices de tabela `planomanutencao`
--
ALTER TABLE `planomanutencao`
  ADD PRIMARY KEY (`idPlano`),
  ADD UNIQUE KEY `uniquePadrao` (`modelo`,`motor`,`kmManutencao`,`anoModelo`,`anoFabricacao`) USING BTREE;

--
-- Índices de tabela `plano_produto`
--
ALTER TABLE `plano_produto`
  ADD PRIMARY KEY (`fk_idPlano`,`fk_idCodigo`),
  ADD KEY `produto` (`fk_idCodigo`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`re`);

--
-- Índices de tabela `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`placa`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `agenda`
--
ALTER TABLE `agenda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=438;

--
-- AUTO_INCREMENT de tabela `agenda_servico`
--
ALTER TABLE `agenda_servico`
  MODIFY `idAgendaServico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `cadastro_produto`
--
ALTER TABLE `cadastro_produto`
  MODIFY `idCodigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1053;

--
-- AUTO_INCREMENT de tabela `ordemservico`
--
ALTER TABLE `ordemservico`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=163;

--
-- AUTO_INCREMENT de tabela `planomanutencao`
--
ALTER TABLE `planomanutencao`
  MODIFY `idPlano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `agenda`
--
ALTER TABLE `agenda`
  ADD CONSTRAINT `fk_placa` FOREIGN KEY (`placa`) REFERENCES `veiculo` (`placa`);

--
-- Restrições para tabelas `agenda_servico`
--
ALTER TABLE `agenda_servico`
  ADD CONSTRAINT `Agenda` FOREIGN KEY (`fk_idAgenda`) REFERENCES `agenda` (`id`),
  ADD CONSTRAINT `Ordem` FOREIGN KEY (`fk_idOrdem`) REFERENCES `ordemservico` (`Id`);

--
-- Restrições para tabelas `ordem_plano`
--
ALTER TABLE `ordem_plano`
  ADD CONSTRAINT `ordem_plano_ibfk_1` FOREIGN KEY (`fk_idPlano`) REFERENCES `planomanutencao` (`idPlano`),
  ADD CONSTRAINT `ordem_plano_ibfk_2` FOREIGN KEY (`fk_idOrdem`) REFERENCES `ordemservico` (`Id`);

--
-- Restrições para tabelas `ordem_produto`
--
ALTER TABLE `ordem_produto`
  ADD CONSTRAINT `ordem_produto_ibfk_1` FOREIGN KEY (`fk_IdOrdem`) REFERENCES `ordemservico` (`Id`),
  ADD CONSTRAINT `ordem_produto_ibfk_2` FOREIGN KEY (`fk_IdCodigo`) REFERENCES `cadastro_produto` (`idCodigo`);

--
-- Restrições para tabelas `plano_produto`
--
ALTER TABLE `plano_produto`
  ADD CONSTRAINT `planomanut` FOREIGN KEY (`fk_idPlano`) REFERENCES `planomanutencao` (`idPlano`),
  ADD CONSTRAINT `produto` FOREIGN KEY (`fk_idCodigo`) REFERENCES `cadastro_produto` (`idCodigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
