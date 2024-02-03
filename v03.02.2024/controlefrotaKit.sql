-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 03/02/2024 às 05:39
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
-- Estrutura para tabela `cadastro_item`
--

CREATE TABLE `cadastro_item` (
  `idCodigo` int(10) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `cor` varchar(30) NOT NULL,
  `anoFabricacao` int(11) DEFAULT NULL,
  `anoModelo` int(11) DEFAULT NULL,
  `descricaoItem` varchar(80) NOT NULL,
  `valorUnitario` double(10,2) NOT NULL,
  `pecaUniversal` tinyint(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cadastro_item`
--

INSERT INTO `cadastro_item` (`idCodigo`, `marca`, `modelo`, `cor`, `anoFabricacao`, `anoModelo`, `descricaoItem`, `valorUnitario`, `pecaUniversal`) VALUES
(1, '', '', '', 0, 0, 'PNEU PIRELLI 195/60 R15', 350.50, 1),
(2, '', '', '', 0, 0, 'PNEU PIRELLI 185/65 R14', 270.99, 1),
(3, '', '', '', 0, 0, 'PNEU PIRELLI 175/70 R13', 230.25, 1),
(4, '', '', '', 0, 0, 'PNEU MICHELIN 205/55 R16', 399.99, 1),
(6, '', '', '', 0, 0, 'ZXCV', 234.98, 0),
(7, 'HONDA', 'FIT', 'PRETO', 2013, 2013, 'JODE DE VELAS', 149.99, 0),
(8, 'HONDA', 'FIT', 'PRATA', 2012, 2013, 'KIT PASTILHA E DISCO DE FREIO HONDA FIT 2013 ORIGINAL VARGA HONDA FIT ', 1800.99, 0),
(9, '', '', '', 0, 0, ' FLUIDO ÓLEO DE FREIO DOT 4 TRW VARGA 500M', 38.91, 1),
(10, 'HONDA', 'FIT', 'PRETO', 2010, 2013, ' PASTILHAS DE FREIO DIANTEIRA HONDA FIT ', 139.41, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `planomanutencao`
--

CREATE TABLE `planomanutencao` (
  `marca` varchar(100) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `motor` varchar(100) NOT NULL,
  `kmManutencao` int(11) NOT NULL,
  `anoModelo` int(11) NOT NULL,
  `anoFabricacao` int(11) NOT NULL,
  `valorTotal` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `planomanutencao`
--

INSERT INTO `planomanutencao` (`marca`, `modelo`, `motor`, `kmManutencao`, `anoModelo`, `anoFabricacao`, `valorTotal`) VALUES
('Chevrolet', 'Celta', '1.0', 10000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 20000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 30000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 40000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 50000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 60000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 70000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 80000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 90000, 2022, 2023, 0),
('Chevrolet', 'Celta', '1.0', 100000, 2022, 2023, 0),
('Renault', 'KWID', '1.0', 10000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 20000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 30000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 40000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 50000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 60000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 70000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 80000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 90000, 2023, 2023, 0),
('Renault', 'KWID', '1.0', 100000, 2023, 2023, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `plano_item`
--

CREATE TABLE `plano_item` (
  `modelo_kit` varchar(100) NOT NULL,
  `motor_kit` varchar(100) NOT NULL,
  `km_kit` int(11) NOT NULL,
  `anoModelo_kit` int(11) NOT NULL,
  `anoFabricacao_kit` int(11) NOT NULL,
  `codigo_Item` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `plano_item`
--

INSERT INTO `plano_item` (`modelo_kit`, `motor_kit`, `km_kit`, `anoModelo_kit`, `anoFabricacao_kit`, `codigo_Item`) VALUES
('Celta', '1.0', 10000, 2022, 2023, 1),
('Celta', '1.0', 10000, 2022, 2023, 2),
('Celta', '1.0', 10000, 2022, 2023, 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `re` varchar(50) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `inativarUsuario` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`re`, `nome`, `endereco`, `email`, `telefone`, `cpf`, `senha`, `inativarUsuario`) VALUES
('0123456789', 'Vinicius Costa', 'Rua André Menck', 'vinicius.hque@gmail.com', '15998322750', '90090060021', 'casablanca', 0),
('101021', 'Vinicios Lemos ', 'Rua Caracas 120', 'vinicios_lemos@gmail.com', '30125859', '3852963147', '159159', 0),
('101035', 'TesteAtualizar', 'DFBGFDS', 'DFGBDFG@HOTMAIL.COM', 'DFBGFD', '3214567', '101035', 1),
('101040', 'Francine Garbimn', 'Av Afonso vergueiro 1235', 'fr_Garbim@hotmail.com', '3229147', '32229478', '101040', 0),
('101050', 'Fabiola', 'Rua Jose Paes motta n237', 'fabi_fabi@gmail.com', '32229147', '123456789', '101050', 0),
('1020', 'Francisco Mariano de Carvalho Neto', 'Rua São Paulo N952', 'mariano_neto@hotmail.com', '998152040', '34994352040', '101010', 0),
('102020', 'Priscila Latance', 'Rua Caracas 120', 'priscila.dev@hotmail.com', '998745689', '15145896733', 'hfdh', 0),
('1021', 'FRANCINE GARBIM', 'RUA DR. AMÉRICO FIGUEIREDO,7401 ', 'GARBIMSP@HOTMAIL.COM', '15988097980', '36129322844', '061286', 0),
('120578', 'TesteSalvar', 'TesteSalvar', 'TesteSalvar', 'TesteSalvar', 'TesteSalvar', '12346', 1),
('3316', 'Mariana Xavier dos Santos Galindo', 'Davino Nogueira dos Santos, 160', 'mariana.xsg@hotmail.com', '(15)3292-2013', '36839451888', '150150', 0);

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
  `vencimentoGarantia` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `veiculo`
--

INSERT INTO `veiculo` (`placa`, `marca`, `modelo`, `cor`, `combustivel`, `tipoVeiculo`, `anoFabricacao`, `anoModelo`, `kmAtual`, `crv`, `renavam`, `chassi`, `motor`, `inativarVeiculo`, `dataCadastro`, `dataCompra`, `vencimentoGarantia`) VALUES
('DRG45798', 'Renault', 'KWID', 'Branco ', 'Flex', '2 portas', 2023, 2023, 5000, '123113164', '15894611941', '6511961619', '1.0', 0, '2023-12-10', '2023-12-10', '2025-12-10'),
('EGY15616', 'Hyundai', 'HB20', 'Prata', 'Flex', '4 portas', 2023, 2023, 10000, '131616606', '1231166494', '1316416916', '1.6', 0, '2023-06-12', '2023-06-10', '2025-06-12'),
('FAZG765', 'HONDA', 'LXL', 'PRETO', 'GASOLINA', '2 portas', 2022, 2023, 110, 'KJHBASDV', '1234234234', 'BWQFE7QD8723U867TAVG', '1.4', 0, '2024-01-21', '2024-01-21', '2025-01-21'),
('FRD15789', 'Chevrolet', 'Celta', 'Prata', 'Flex', '4 portas', 2022, 2023, 0, '758964532', '15946216494', '156161641FD', '1.0', 0, '2024-01-13', '2024-01-10', '2026-01-13'),
('GHR157589 ', 'Chevrolet', 'Celta', 'Prata', 'Flex', '2 portas', 2023, 2023, 10000, '1256461', '16161063', '2316916196', '1.0', 0, '2023-08-20', '2023-08-10', '2025-08-20'),
('SED15789', 'Hyundai', 'HB20', 'Prata', 'Flex', '4 portas', 2022, 2022, 5000, '47525498459', '15866199', '1516164644', '1475983985', 0, '2023-01-10', '2022-12-20', '2025-01-10');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cadastro_item`
--
ALTER TABLE `cadastro_item`
  ADD PRIMARY KEY (`idCodigo`);

--
-- Índices de tabela `planomanutencao`
--
ALTER TABLE `planomanutencao`
  ADD PRIMARY KEY (`modelo`,`motor`,`kmManutencao`,`anoModelo`,`anoFabricacao`);

--
-- Índices de tabela `plano_item`
--
ALTER TABLE `plano_item`
  ADD PRIMARY KEY (`modelo_kit`,`motor_kit`,`km_kit`,`anoModelo_kit`,`anoFabricacao_kit`,`codigo_Item`),
  ADD UNIQUE KEY `fk` (`modelo_kit`,`motor_kit`,`km_kit`,`anoModelo_kit`,`anoFabricacao_kit`,`codigo_Item`),
  ADD KEY `codigo_Item` (`codigo_Item`);

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
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `plano_item`
--
ALTER TABLE `plano_item`
  ADD CONSTRAINT `fk_codigo` FOREIGN KEY (`codigo_Item`) REFERENCES `cadastro_item` (`idCodigo`),
  ADD CONSTRAINT `fk_modelo` FOREIGN KEY (`modelo_kit`) REFERENCES `planomanutencao` (`modelo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
